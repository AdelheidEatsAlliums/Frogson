package net.adelheideatsalliums.frogson.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class OreGen {
    public static final RegistryKey<PlacedFeature> FLONSAGAL_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","flonsagal_oregen"));
    public static final RegistryKey<PlacedFeature> KESTEKTLA_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","kestektla_oregen"));
    public static final RegistryKey<PlacedFeature> MOSSENSCHON_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","mossenschon_oregen"));
    public static final RegistryKey<PlacedFeature> NASCHJA_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","naschja_oregen"));
    public static final RegistryKey<PlacedFeature> ROSE_QUARTZ_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","rose_quartz_oregen"));
    public static final RegistryKey<PlacedFeature> MALACHITE_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","malachite_oregen"));
    public static final RegistryKey<PlacedFeature> RAINBOW_IRON_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","rainbow_iron_oregen"));
    public static final RegistryKey<PlacedFeature> GREASK_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","greask_oregen"));
    public static final RegistryKey<PlacedFeature> SCHEELCH_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","scheelch_oregen"));
    public static final RegistryKey<PlacedFeature> OBSIDIAN_ROSE_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","obsidian_rose_oregen"));
    public static final RegistryKey<PlacedFeature> ENDENSKIAL_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","endenskial_oregen"));
    public static final RegistryKey<PlacedFeature> OBSIDIAN_ROSE_NETHER_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","obsidian_rose_nether_oregen"));
    public static final RegistryKey<PlacedFeature> ANDESITE_PERIWINKLE_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","andesite_periwinkle_oregen"));
    public static final RegistryKey<PlacedFeature> CLOUDSTONE_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","cloudstone_oregen"));
    public static final RegistryKey<PlacedFeature> AQUAFELDMARINE_OREGEN = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("frogson","aquafeldmarine_oregen"));

    public static void OreGenRegister(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, FLONSAGAL_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, KESTEKTLA_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, MOSSENSCHON_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, NASCHJA_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ROSE_QUARTZ_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, MALACHITE_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RAINBOW_IRON_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, GREASK_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, SCHEELCH_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, OBSIDIAN_ROSE_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ENDENSKIAL_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, OBSIDIAN_ROSE_NETHER_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ANDESITE_PERIWINKLE_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CLOUDSTONE_OREGEN);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, AQUAFELDMARINE_OREGEN);

    }
}
