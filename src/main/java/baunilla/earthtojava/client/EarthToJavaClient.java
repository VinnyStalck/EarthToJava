package baunilla.earthtojava.client;

import baunilla.earthtojava.client.render.FluidRendering;
import baunilla.earthtojava.client.render.entity.MuddyPigRenderer;
import baunilla.earthtojava.common.EarthBlocks;
import baunilla.earthtojava.common.EarthEntities;
import baunilla.earthtojava.common.EarthFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class EarthToJavaClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        // Transparent Blocks Renderer
        BlockRenderLayerMap.INSTANCE.putBlock(EarthBlocks.BUTTERCUP, RenderLayer.getCutout());

        // Mud Fluid Renderer
        FluidRendering.setupFluidRendering(EarthFluids.STILL_MUD, EarthFluids.FLOWING_MUD, new Identifier("earthtojava", "mud"));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), EarthFluids.STILL_MUD, EarthFluids.FLOWING_MUD);

        // Entities Renderer
        EntityRendererRegistry.INSTANCE.register(EarthEntities.MUDDY_PIG, 
                (entityRenderDispatcher, context) -> new MuddyPigRenderer(entityRenderDispatcher));

    }

}