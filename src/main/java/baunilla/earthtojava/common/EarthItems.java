package baunilla.earthtojava.common;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Rarity;

public class EarthItems {
    // Items
    public static final Item RUBY = new Item(new Item.Settings().rarity(Rarity.UNCOMMON).group(ItemGroup.MATERIALS));

    public static final Item HORN = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    // Bucket
    public static final Item MUD_BUCKET = new BucketItem(EarthFluids.STILL_MUD, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(ItemGroup.MISC));

    // Spawn Eggs
    public static final SpawnEggItem MUDDY_PIG_SPAWN_EGG = new SpawnEggItem(EarthEntities.MUDDY_PIG, 0xEBA3A4, 0x543321, new Item.Settings().group(ItemGroup.MISC));

    // Block Items
    public static final BlockItem RUBY_ORE = new BlockItem(EarthBlocks.RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).rarity(Rarity.UNCOMMON));
    public static final BlockItem RUBY_BLOCK = new BlockItem(EarthBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).rarity(Rarity.UNCOMMON));
    
    public static final BlockItem BUTTERCUP = new BlockItem(EarthBlocks.BUTTERCUP, new Item.Settings().group(ItemGroup.DECORATIONS));
}