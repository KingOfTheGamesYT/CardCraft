package com.animussurge.cardcraft;

import com.animussurge.cardcraft.items.card;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CardCraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Items
    public static final RegistryObject<Item> card2spade = ITEMS.register("card2spade", card::new);
    public static final RegistryObject<Item> card3spade = ITEMS.register("card3spade", card::new);
    public static final RegistryObject<Item> card4spade = ITEMS.register("card4spades", card::new);
    public static final RegistryObject<Item> card5spade = ITEMS.register("card5spade", card::new);
    public static final RegistryObject<Item> card6spade = ITEMS.register("card6spade", card::new);
    public static final RegistryObject<Item> card7spade = ITEMS.register("card7spade", card::new);
    public static final RegistryObject<Item> card8spade = ITEMS.register("card8spade", card::new);
    public static final RegistryObject<Item> card9spade = ITEMS.register("card9spade", card::new);
    public static final RegistryObject<Item> card10spade = ITEMS.register("card10spade", card::new);
    public static final RegistryObject<Item> cardacespade = ITEMS.register("cardacespade", card::new);
    public static final RegistryObject<Item> cardjspade = ITEMS.register("cardjspade", card::new);
    public static final RegistryObject<Item> cardkspade = ITEMS.register("cardkspade", card::new);
    public static final RegistryObject<Item> cardqspade = ITEMS.register("cardqspade", card::new);
 //   public static final RegistryObject<Item> card1spade = ITEMS.register("spade", card::new);
   // public static final RegistryObject<Item> card1spade = ITEMS.register("spade", card::new);
 //   public static final RegistryObject<Item> card1spade = ITEMS.register("spade", card::new);
 //   public static final RegistryObject<Item> card1spade = ITEMS.register("spade", card::new);

}
