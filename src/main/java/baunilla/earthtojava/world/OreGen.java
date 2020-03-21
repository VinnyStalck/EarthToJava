package baunilla.earthtojava.world;

import baunilla.earthtojava.common.EarthBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen {

    public static void generateOre(Biome biome) {

        // Ruby Ore
        if (biome.getCategory() == Biome.Category.MUSHROOM) {
            biome.addFeature(
                GenerationStep.Feature.UNDERGROUND_ORES,
                Feature.ORE.configure(
                    new OreFeatureConfig(
                        OreFeatureConfig.Target.NATURAL_STONE,
                        EarthBlocks.RUBY_ORE.getDefaultState(),
                        2
                    )
                ).createDecoratedFeature(
                    Decorator.COUNT_RANGE.configure(
                        new RangeDecoratorConfig(8, 0, 8, 16)
                    )
                )
            );
        }
    }
}