package baunilla.earthtojava.client.render.entity;

import baunilla.earthtojava.client.model.entity.MuddyPigModel;
import baunilla.earthtojava.common.entity.MuddyPigEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class MuddyPigRenderer extends MobEntityRenderer<MuddyPigEntity, MuddyPigModel<MuddyPigEntity>> {

    public MuddyPigRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new MuddyPigModel<>(), 1);
    }

    @Override
    public Identifier getTexture(MuddyPigEntity entity) {
        return new Identifier("earthtojava:textures/entity/pig/muddy_pig.png");
    }
    
}