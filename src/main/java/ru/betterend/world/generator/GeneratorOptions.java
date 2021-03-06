package ru.betterend.world.generator;

import ru.betterend.config.Configs;

public class GeneratorOptions {
	private static int biomeSizeLand;
	private static int biomeSizeVoid;
	private static boolean hasPortal;
	private static boolean hasPillars;
	private static boolean hasDragonFights;
	private static boolean swapOverworldToEnd;
	private static boolean changeChorusPlant;
	private static boolean removeChorusFromVanillaBiomes;
	private static boolean newGenerator;
	private static boolean noRingVoid;
	private static boolean generateCentralIsland;
	private static boolean generateObsidianPlatform;
	private static int endCityFailChance;
	
	public static void init() {
		biomeSizeLand = Configs.GENERATOR_CONFIG.getInt("biomeMap", "biomeSizeLand", 256);
		biomeSizeVoid = Configs.GENERATOR_CONFIG.getInt("biomeMap", "biomeSizeVoid", 256);
		hasPortal = Configs.GENERATOR_CONFIG.getBooleanRoot("hasPortal", true);
		hasPillars = Configs.GENERATOR_CONFIG.getBooleanRoot("hasPillars", true);
		hasDragonFights = Configs.GENERATOR_CONFIG.getBooleanRoot("hasDragonFights", true);
		swapOverworldToEnd = Configs.GENERATOR_CONFIG.getBooleanRoot("swapOverworldToEnd", false);
		changeChorusPlant = Configs.GENERATOR_CONFIG.getBoolean("chorusPlant", "changeChorusPlant", true);
		removeChorusFromVanillaBiomes = Configs.GENERATOR_CONFIG.getBoolean("chorusPlant", "removeChorusFromVanillaBiomes", true);
		newGenerator = Configs.GENERATOR_CONFIG.getBoolean("customGenerator", "useNewGenerator", false);
		noRingVoid = Configs.GENERATOR_CONFIG.getBoolean("customGenerator", "noRingVoid", false);
		generateCentralIsland = Configs.GENERATOR_CONFIG.getBoolean("customGenerator", "generateCentralIsland", false);
		endCityFailChance = Configs.GENERATOR_CONFIG.getInt("customGenerator", "endCityFailChance", 5);
		generateObsidianPlatform = Configs.GENERATOR_CONFIG.getBooleanRoot("generateObsidianPlatform", true);
	}

	public static int getBiomeSizeLand() {
		return biomeSizeLand;
	}
	
	public static int getBiomeSizeVoid() {
		return biomeSizeVoid;
	}

	public static boolean hasPortal() {
		return hasPortal;
	}
	
	public static boolean hasPillars() {
		return hasPillars;
	}
	
	public static boolean hasDragonFights() {
		return hasDragonFights;
	}
	
	public static boolean swapOverworldToEnd() {
		return swapOverworldToEnd;
	}

	public static boolean changeChorusPlant() {
		return changeChorusPlant;
	}

	public static boolean removeChorusFromVanillaBiomes() {
		return removeChorusFromVanillaBiomes;
	}
	
	public static boolean noRingVoid() {
		return noRingVoid;
	}
	
	public static boolean useNewGenerator() {
		return newGenerator;
	}
	
	public static boolean hasCentralIsland() {
		return generateCentralIsland;
	}
	
	public static boolean generateObsidianPlatform() {
		return generateObsidianPlatform;
	}
	
	public static int getEndCityFailChance() {
		return endCityFailChance;
	}
}
