package com.scouter.oceansdelight.items;


import com.scouter.oceansdelight.OceansDelight;
import com.scouter.oceansdelight.blocks.ODBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ODItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OceansDelight.MODID);

    //From Blocks

    public static final DeferredItem<Item> TENTACLES = ITEMS.registerItem("tentacles", Item::new, () -> new Item.Properties()
            .food(ODFoods.TENTACLES, ODFoods.consumable(ODFoods.TENTACLES)));

    public static final DeferredItem<Item> CUT_TENTACLES = ITEMS.registerItem("cut_tentacles", Item::new, () -> new Item.Properties()
            .food(ODFoods.CUT_TENTACLES, ODFoods.consumable(ODFoods.CUT_TENTACLES)));

    public static final DeferredItem<Item> SQUID_RINGS = ITEMS.registerItem("squid_rings", Item::new, () -> new Item.Properties()
            .food(ODFoods.SQUID_RINGS, ODFoods.consumable(ODFoods.SQUID_RINGS)).craftRemainder(Items.BOWL));

    public static final DeferredItem<Item> TENTACLE_ON_A_STICK = ITEMS.registerItem("tentacle_on_a_stick", Item::new, () -> new Item.Properties()
            .food(ODFoods.TENTACLE_ON_A_STICK, ODFoods.consumable(ODFoods.TENTACLE_ON_A_STICK)));

    public static final DeferredItem<Item> BAKED_TENTACLE_ON_A_STICK = ITEMS.registerItem("baked_tentacle_on_a_stick", Item::new, () -> new Item.Properties()
            .food(ODFoods.BAKED_TENTACLE_ON_A_STICK, ODFoods.consumable(ODFoods.BAKED_TENTACLE_ON_A_STICK)));

    public static final DeferredItem<Item> STUFFED_SQUID = ITEMS.registerItem("stuffed_squid", Item::new, () -> new Item.Properties()
            .food(ODFoods.STUFFED_SQUID, ODFoods.consumable(ODFoods.STUFFED_SQUID)));

    public static final DeferredItem<Item> COOKED_STUFFED_SQUID = ITEMS.registerItem("cooked_stuffed_squid", Item::new, () -> new Item.Properties()
            .food(ODFoods.COOKED_STUFFED_SQUID, ODFoods.consumable(ODFoods.COOKED_STUFFED_SQUID)));



    public static final DeferredItem<Item> GUARDIAN = ITEMS.registerItem("guardian", Item::new, () -> new Item.Properties());
    public static final DeferredItem<Item> GUARDIAN_SOUP = fromBlock(ODBlocks.GUARDIAN_SOUP);
    public static final DeferredItem<Item> GUARDIAN_TAIL = ITEMS.registerItem("guardian_tail", Item::new, () -> new Item.Properties()
            .food(ODFoods.GUARDIAN_TAIL, ODFoods.consumable(ODFoods.GUARDIAN_TAIL)));

    public static final DeferredItem<Item> COOKED_GUARDIAN_TAIL = ITEMS.registerItem("cooked_guardian_tail", Item::new, () -> new Item.Properties()
            .food(ODFoods.COOKED_GUARDIAN_TAIL, ODFoods.consumable(ODFoods.COOKED_GUARDIAN_TAIL)));


    public static final DeferredItem<Item> BOWL_OF_GUARDIAN_SOUP = ITEMS.registerItem("bowl_of_guardian_soup", Item::new, () -> new Item.Properties().craftRemainder(Items.BOWL)
            .food(ODFoods.BOWL_OF_GUARDIAN_SOUP, ODFoods.consumable(ODFoods.BOWL_OF_GUARDIAN_SOUP)).craftRemainder(Items.BOWL));

    public static final DeferredItem<Item> ELDER_GUARDIAN_SLAB = ITEMS.registerItem("elder_guardian_slab", Item::new, () -> new Item.Properties()
            .food(ODFoods.ELDER_GUARDIAN_SLAB, ODFoods.consumable(ODFoods.ELDER_GUARDIAN_SLAB)));

    public static final DeferredItem<Item> ELDER_GUARDIAN_SLICE = ITEMS.registerItem("elder_guardian_slice", Item::new, () -> new Item.Properties()
            .food(ODFoods.ELDER_GUARDIAN_SLICE, ODFoods.consumable(ODFoods.ELDER_GUARDIAN_SLICE)));

    public static final DeferredItem<Item> COOKED_ELDER_GUARDIAN_SLICE = ITEMS.registerItem("cooked_elder_guardian_slice", Item::new, () -> new Item.Properties()
            .food(ODFoods.COOKED_ELDER_GUARDIAN_SLICE, ODFoods.consumable(ODFoods.COOKED_ELDER_GUARDIAN_SLICE)));

    public static final DeferredItem<Item> ELDER_GUARDIAN_ROLL = ITEMS.registerItem("elder_guardian_roll", Item::new, () -> new Item.Properties()
            .food(ODFoods.ELDER_GUARDIAN_ROLL, ODFoods.consumable(ODFoods.ELDER_GUARDIAN_ROLL)));

    public static final DeferredItem<Item> CABBAGE_WRAPPED_ELDER_GUARDIAN = ITEMS.registerItem("cabbage_wrapped_elder_guardian", Item::new, () -> new Item.Properties()
            .food(ODFoods.CABBAGE_WRAPPED_ELDER_GUARDIAN, ODFoods.consumable(ODFoods.CABBAGE_WRAPPED_ELDER_GUARDIAN)));

    public static final DeferredItem<Item> FUGU_SLICE = ITEMS.registerItem("fugu_slice", Item::new, () -> new Item.Properties()
            .food(ODFoods.FUGU_SLICE, ODFoods.consumable(ODFoods.FUGU_SLICE)));

    public static final DeferredItem<Item> FUGU_ROLL = ITEMS.registerItem("fugu_roll", Item::new, () -> new Item.Properties()
            .food(ODFoods.FUGU_ROLL, ODFoods.consumable(ODFoods.FUGU_ROLL)));

    public static final DeferredItem<Item> BRAISED_SEA_PICKLE = ITEMS.registerItem("braised_sea_pickle", Item::new, () -> new Item.Properties()
            .food(ODFoods.BRAISED_SEA_PICKLE, ODFoods.consumable(ODFoods.BRAISED_SEA_PICKLE)).craftRemainder(Items.BOWL));

    public static final DeferredItem<Item> STUFFED_COD = ITEMS.registerItem("stuffed_cod", Item::new, () -> new Item.Properties()
            .food(ODFoods.STUFFED_COD, ODFoods.consumable(ODFoods.STUFFED_COD)));

    public static final DeferredItem<Item> KELP_ENCRUSTED_COD = ITEMS.registerItem("kelp_encrusted_cod", Item::new, () -> new Item.Properties()
            .food(ODFoods.KELP_CRUSTED_COD, ODFoods.consumable(ODFoods.KELP_CRUSTED_COD)));

    public static final DeferredItem<Item> COOKED_STUFFED_COD = ITEMS.registerItem("cooked_stuffed_cod", Item::new, () -> new Item.Properties()
            .food(ODFoods.COOKED_STUFFED_COD, ODFoods.consumable(ODFoods.COOKED_STUFFED_COD)));

    public static final DeferredItem<Item> HONEY_FRIED_KELP = ITEMS.registerItem("honey_fried_kelp", Item::new, () -> new Item.Properties()
            .food(ODFoods.HONEY_FRIED_KELP, ODFoods.consumable(ODFoods.HONEY_FRIED_KELP)));

    public static final DeferredItem<Item> SEAGRASS_SALAD = ITEMS.registerItem("seagrass_salad", Item::new, () -> new Item.Properties()
            .food(ODFoods.SEAGRASS_SALAD, ODFoods.consumable(ODFoods.SEAGRASS_SALAD)).craftRemainder(Items.BOWL));

    public static <B extends Block> DeferredItem<Item> fromBlock(DeferredBlock<B> block) {
        return ITEMS.registerItem(block.getId().getPath(), props -> new BlockItem(block.get(), props), () -> new Item.Properties());
    }
}
