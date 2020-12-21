package ru.betterend.world.biome;

import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndFeatures;

public class BiomeUmbrellaJungle extends EndBiome {
	public BiomeUmbrellaJungle() {
		super(new BiomeDefinition("umbrella_jungle")
				.setFogColor(87, 223, 221)
				.setWaterAndFogColor(119, 198, 253)
				.setFoliageColor(27, 183, 194)
				.setFogDensity(2.3F)
				.setSurface(EndBlocks.END_MOSS)
				.addFeature(EndFeatures.UMBRELLA_TREE)
				.addFeature(EndFeatures.UMBRELLA_MOSS)
				.addFeature(EndFeatures.END_LAKE));
	}
}