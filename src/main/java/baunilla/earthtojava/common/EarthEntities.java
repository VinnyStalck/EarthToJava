package baunilla.earthtojava.common;

import baunilla.earthtojava.common.entity.MuddyPigEntity;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;

public class EarthEntities {

    public static final EntityType<MuddyPigEntity> MUDDY_PIG = FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, MuddyPigEntity::new).size(EntityDimensions.fixed(0.9f, 0.9f)).build();

}