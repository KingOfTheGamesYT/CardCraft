package com.animussurge.cardcraft;

import com.animussurge.cardcraft.items.card;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CardCraft.MOD_ID);
    public static DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CardCraft.MOD_ID);
    public static final List<Supplier<? extends ItemLike>> CARDCRAFT_ITEMS = new ArrayList<>();

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        CREATIVE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Items
    public static final RegistryObject<Item> card2spade = addToTab(ITEMS.register("card2spade", card::new));
    public static final RegistryObject<Item> card3spade = addToTab(ITEMS.register("card3spade", card::new));
    public static final RegistryObject<Item> card4spade = addToTab(ITEMS.register("card4spades", card::new));
    public static final RegistryObject<Item> card5spade = addToTab(ITEMS.register("card5spade", card::new));
    public static final RegistryObject<Item> card6spade = addToTab(ITEMS.register("card6spade", card::new));
    public static final RegistryObject<Item> card7spade = addToTab(ITEMS.register("card7spade", card::new));
    public static final RegistryObject<Item> card8spade = addToTab(ITEMS.register("card8spade", card::new));
    public static final RegistryObject<Item> card9spade = addToTab(ITEMS.register("card9spade", card::new));
    public static final RegistryObject<Item> card10spade = addToTab(ITEMS.register("card10spade", card::new));
    public static final RegistryObject<Item> cardacespade = addToTab(ITEMS.register("cardacespade", card::new));
    public static final RegistryObject<Item> cardjspade = addToTab(ITEMS.register("cardjspade", card::new));
    public static final RegistryObject<Item> cardkspade = addToTab(ITEMS.register("cardkspade", card::new));
    public static final RegistryObject<Item> cardqspade = addToTab(ITEMS.register("cardqspade", card::new));
    public static final RegistryObject<Item> card2heart = addToTab(ITEMS.register("card2heart", card::new));
    public static final RegistryObject<Item> card3heart = addToTab(ITEMS.register("card3heart", card::new));
    public static final RegistryObject<Item> card4heart = addToTab(ITEMS.register("card4heart", card::new));
    public static final RegistryObject<Item> card5heart = addToTab(ITEMS.register("card5heart", card::new));
    public static final RegistryObject<Item> card6heart = addToTab(ITEMS.register("card6heart", card::new));
    public static final RegistryObject<Item> card7heart = addToTab(ITEMS.register("card7heart", card::new));
    public static final RegistryObject<Item> card8heart = addToTab(ITEMS.register("card8heart", card::new));
    public static final RegistryObject<Item> card9heart = addToTab(ITEMS.register("card9heart", card::new));
    public static final RegistryObject<Item> card10heart = addToTab(ITEMS.register("card10heart", card::new));
    public static final RegistryObject<Item> cardaceheart = addToTab(ITEMS.register("cardaceheart", card::new));
    public static final RegistryObject<Item> cardjheart = addToTab(ITEMS.register("cardjheart", card::new));
    public static final RegistryObject<Item> cardkheart = addToTab(ITEMS.register("cardkheart", card::new));
    public static final RegistryObject<Item> cardqheart = addToTab(ITEMS.register("cardqheart", card::new));
    public static final RegistryObject<Item> card2diamond = addToTab(ITEMS.register("card2diamond", card::new));
    public static final RegistryObject<Item> card3diamond = addToTab(ITEMS.register("card3diamond", card::new));
    public static final RegistryObject<Item> card4diamond = addToTab(ITEMS.register("card4diamond", card::new));
    public static final RegistryObject<Item> card5diamond = addToTab(ITEMS.register("card5diamond", card::new));
    public static final RegistryObject<Item> card6diamond = addToTab(ITEMS.register("card6diamond", card::new));
    public static final RegistryObject<Item> card7diamond = addToTab(ITEMS.register("card7diamond", card::new));
    public static final RegistryObject<Item> card8diamond= addToTab(ITEMS.register("card8diamond", card::new));
    public static final RegistryObject<Item> card9diamond = addToTab(ITEMS.register("card9diamond", card::new));
    public static final RegistryObject<Item> card10diamond = addToTab(ITEMS.register("card10diamond", card::new));
    public static final RegistryObject<Item> cardacediamond = addToTab(ITEMS.register("cardacediamond", card::new));
    public static final RegistryObject<Item> cardjdiamond = addToTab(ITEMS.register("cardjdiamond", card::new));
    public static final RegistryObject<Item> cardkdiamond = addToTab(ITEMS.register("cardkdiamond", card::new));
    public static final RegistryObject<Item> cardqdiamond = addToTab(ITEMS.register("cardqdiamond", card::new));
    public static final RegistryObject<Item> card2club = addToTab(ITEMS.register("card2club", card::new));
    public static final RegistryObject<Item> card3club = addToTab(ITEMS.register("card3club", card::new));
    public static final RegistryObject<Item> card4club = addToTab(ITEMS.register("card4club", card::new));
    public static final RegistryObject<Item> card5club= addToTab(ITEMS.register("card5club", card::new));
    public static final RegistryObject<Item> card6club = addToTab(ITEMS.register("card6club", card::new));
    public static final RegistryObject<Item> card7club = addToTab(ITEMS.register("card7club", card::new));
    public static final RegistryObject<Item> card8club= addToTab(ITEMS.register("card8club", card::new));
    public static final RegistryObject<Item> card9club = addToTab(ITEMS.register("card9club", card::new));
    public static final RegistryObject<Item> card10club = addToTab(ITEMS.register("card10club", card::new));
    public static final RegistryObject<Item> cardaceclub = addToTab(ITEMS.register("cardaceclub", card::new));
    public static final RegistryObject<Item> cardjclub = addToTab(ITEMS.register("cardjclub", card::new));
    public static final RegistryObject<Item> cardkclub = addToTab(ITEMS.register("cardkclub", card::new));
    public static final RegistryObject<Item> cardqclub = addToTab(ITEMS.register("cardqclub", card::new));

//Tabs
public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_TABS.register("cardcraftbase", () -> CreativeModeTab.builder()
        .icon(() -> {
            return new ItemStack(RegistryHandler.card2spade.get());
        })
        .title(Component.translatable("itemGroup.cardcraft.cardcraftbase"))
        .displayItems((type, output) -> {
            CARDCRAFT_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
        })
        .build());

    public static <I extends Item> RegistryObject<I> addToTab(RegistryObject<I> itemLike) {
        CARDCRAFT_ITEMS.add(itemLike);
        return itemLike;
    }
}
