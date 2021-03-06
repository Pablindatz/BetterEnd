package ru.betterend.world.features;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import ru.betterend.blocks.BlockProperties;
import ru.betterend.registry.EndBlocks;
import ru.betterend.util.BlocksHelper;

public class SilkMothNestFeature extends DefaultFeature {
	private static final Mutable POS = new Mutable();
	
	private boolean canGenerate(StructureWorldAccess world, BlockPos pos) {
		BlockState state = world.getBlockState(pos.up());
		if (state.isIn(BlockTags.LEAVES) || state.isIn(BlockTags.LOGS)) {
			state = world.getBlockState(pos);
			if ((state.isAir() || state.isOf(EndBlocks.TENANEA_OUTER_LEAVES)) && world.isAir(pos.down())) {
				for (Direction dir: BlocksHelper.HORIZONTAL) {
					if (world.getBlockState(pos.down().offset(dir)).getMaterial().blocksMovement()) {
						return false;
					}
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean generate(StructureWorldAccess world, ChunkGenerator chunkGenerator, Random random, BlockPos center, DefaultFeatureConfig featureConfig) {
		int maxY = world.getTopY(Heightmap.Type.WORLD_SURFACE, center.getX(), center.getZ());
		int minY = BlocksHelper.upRay(world, new BlockPos(center.getX(), 0, center.getZ()), maxY);
		POS.set(center);
		for (int y = maxY; y > minY; y--) {
			POS.setY(y);
			if (canGenerate(world, POS)) {
				Direction dir = BlocksHelper.randomHorizontal(random);
				BlocksHelper.setWithoutUpdate(world, POS, EndBlocks.SILK_MOTH_NEST.getDefaultState().with(Properties.HORIZONTAL_FACING, dir).with(BlockProperties.ACTIVE, false));
				POS.setY(y - 1);
				BlocksHelper.setWithoutUpdate(world, POS, EndBlocks.SILK_MOTH_NEST.getDefaultState().with(Properties.HORIZONTAL_FACING, dir));
				return true;
			}
		}
		return false;
	}
}
