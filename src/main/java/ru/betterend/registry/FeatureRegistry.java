package ru.betterend.registry;

import ru.betterend.world.features.EndFeature;
import ru.betterend.world.features.EndLakeFeature;
import ru.betterend.world.features.StoneSpiralFeature;

public class FeatureRegistry {
	public static final EndFeature STONE_SPIRAL = new EndFeature("stone_spiral", new StoneSpiralFeature(), 2);
	public static final EndFeature END_LAKE = new EndFeature("end_lake", new EndLakeFeature());
	
	public static void register() {}
}
