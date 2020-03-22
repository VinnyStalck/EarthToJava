package baunilla.earthtojava.client;

import baunilla.earthtojava.client.render.FluidRendering;
import baunilla.earthtojava.common.EarthBlocks;
import baunilla.earthtojava.common.EarthFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class EarthToJavaClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(EarthBlocks.BUTTERCUP, RenderLayer.getCutout());

        // Mud fluid render
        FluidRendering.setupFluidRendering(EarthFluids.STILL_MUD, EarthFluids.FLOWING_MUD, new Identifier("earthtojava", "mud"));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), EarthFluids.STILL_MUD, EarthFluids.FLOWING_MUD);
    }

}