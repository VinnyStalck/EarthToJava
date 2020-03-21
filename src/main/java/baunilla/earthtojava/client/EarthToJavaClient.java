package baunilla.earthtojava.client;

import baunilla.earthtojava.common.EarthBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class EarthToJavaClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(EarthBlocks.BUTTERCUP, RenderLayer.getCutout());
    }

}