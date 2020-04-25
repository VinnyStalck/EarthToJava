package baunilla.earthtojava;

import baunilla.earthtojava.common.EarthBlocks;
import baunilla.earthtojava.common.EarthEntities;
import baunilla.earthtojava.common.EarthFluids;
import baunilla.earthtojava.common.EarthItems;
import baunilla.earthtojava.world.OreGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EarthToJava implements ModInitializer {
    
    private static final String MOD_ID = "earthtojava";

    @Override
    public void onInitialize() {
        //Registry
        //  Fluids
        Registry.register(Registry.FLUID, new Identifier(MOD_ID, "mud"), EarthFluids.STILL_MUD);
        Registry.register(Registry.FLUID, new Identifier(MOD_ID, "flowing_mud"), EarthFluids.FLOWING_MUD);

        //  Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby"), EarthItems.RUBY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "horn"), EarthItems.HORN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mud_bucket"), EarthItems.MUD_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "muddy_pig_spawn_egg"), EarthItems.MUDDY_PIG_SPAWN_EGG);

        //  Blocks
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ruby_ore"), EarthBlocks.RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ruby_block"), EarthBlocks.RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "buttercup"), EarthBlocks.BUTTERCUP);
        //  BlockItems
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_ore"), EarthItems.RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ruby_block"), EarthItems.RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "buttercup"), EarthItems.BUTTERCUP);

        //  Entities
        Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "muddy_pig"), EarthEntities.MUDDY_PIG);

        // WorldGen
        //   Ore Generation
        Registry.BIOME.forEach(OreGen::generateOre);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> OreGen.generateOre(biome));
    }

}
