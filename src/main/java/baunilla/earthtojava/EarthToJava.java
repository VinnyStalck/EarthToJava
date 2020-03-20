package baunilla.earthtojava;

import baunilla.earthtojava.common.EarthBlocks;
import baunilla.earthtojava.common.EarthItems;
import baunilla.earthtojava.world.OreGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EarthToJava implements ModInitializer {
    
    @Override
    public void onInitialize() {
        //Registry
        //  Items
        Registry.register(Registry.ITEM, new Identifier("earthtojava", "ruby"), EarthItems.RUBY);
        //  Blocks
        Registry.register(Registry.BLOCK, new Identifier("earthtojava", "ruby_block"), EarthBlocks.RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("earthtojava", "ruby_ore"), EarthBlocks.RUBY_ORE);
        //  BlockItems
        Registry.register(Registry.ITEM, new Identifier("earthtojava", "ruby_block"), EarthItems.RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("earthtojava", "ruby_ore"), EarthItems.RUBY_ORE);

        // WorldGen
        //   Ore Generation
        Registry.BIOME.forEach(OreGen::generateOre);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> OreGen.generateOre(biome));
        
    }
}
