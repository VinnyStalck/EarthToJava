package baunilla.earthtojava.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.world.World;

public class MuddyPigEntity extends PigEntity {

    public MuddyPigEntity(EntityType<? extends PigEntity> entityType, World world) {
        super(entityType, world);
    }
    
}