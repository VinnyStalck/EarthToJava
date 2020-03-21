package baunilla.earthtojava.common;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.OreBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;

public class EarthBlocks {
    public static final Block RUBY_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).strength(5.0f, 6.0f).sounds(BlockSoundGroup.STONE).build());
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL, MaterialColor.RED).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 2).strength(3.0f, 3.0f).build());

    public static final Block BUTTERCUP = new FlowerBlock(StatusEffects.GLOWING, 2, FabricBlockSettings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.GRASS).noCollision().nonOpaque().build());
}