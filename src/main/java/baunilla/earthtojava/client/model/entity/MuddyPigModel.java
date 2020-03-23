package baunilla.earthtojava.client.model.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.entity.Entity;

@Environment(EnvType.CLIENT)
public class MuddyPigModel<T extends Entity> extends PigEntityModel<T> {

    public MuddyPigModel() {
        this.head.setTextureOffset(0, 26).addCuboid(-1.0F, -5.0F, -7.0F, 4, 1, 4, 0.0F, false);
        this.head.setTextureOffset(16, 20).addCuboid(0.0F, -11.0F, -5.0F, 4, 6, 0, 0.0F, false);
    }
    
}