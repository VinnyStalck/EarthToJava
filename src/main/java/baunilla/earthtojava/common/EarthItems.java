package baunilla.earthtojava.common;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class EarthItems {
    // Items
    public static final Item RUBY = new Item(new Item.Settings().rarity(Rarity.UNCOMMON).group(ItemGroup.MATERIALS));

    // Block Items
    public static final BlockItem RUBY_BLOCK= new BlockItem(EarthBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).rarity(Rarity.UNCOMMON));
    public static final BlockItem RUBY_ORE= new BlockItem(EarthBlocks.RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).rarity(Rarity.UNCOMMON));
}