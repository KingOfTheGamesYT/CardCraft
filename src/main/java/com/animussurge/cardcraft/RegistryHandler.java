package com.animussurge.cardcraft;

import com.animussurge.cardcraft.items.card;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    public static final RegistryObject<Item> card2heart = ITEMS.register("card2heart", card::new);
    public static final RegistryObject<Item> card3heart = ITEMS.register("card3heart", card::new);
    public static final RegistryObject<Item> card4heart = ITEMS.register("card4heart", card::new);
    public static final RegistryObject<Item> card5heart = ITEMS.register("card5heart", card::new);
    public static final RegistryObject<Item> card6heart = ITEMS.register("card6heart", card::new);
    public static final RegistryObject<Item> card7heart = ITEMS.register("card7heart", card::new);
    public static final RegistryObject<Item> card8heart = ITEMS.register("card8heart", card::new);
    public static final RegistryObject<Item> card9heart = ITEMS.register("card9heart", card::new);
    public static final RegistryObject<Item> card10heart = ITEMS.register("card10heart", card::new);
    public static final RegistryObject<Item> cardaceheart = ITEMS.register("cardaceheart", card::new);
    public static final RegistryObject<Item> cardjheart = ITEMS.register("cardjheart", card::new);
    public static final RegistryObject<Item> cardkheart = ITEMS.register("cardkheart", card::new);
    public static final RegistryObject<Item> cardqheart = ITEMS.register("cardqheart", card::new);
    public static final RegistryObject<Item> card2diamond = ITEMS.register("card2diamond", card::new);
    public static final RegistryObject<Item> card3diamond = ITEMS.register("card3diamond", card::new);
    public static final RegistryObject<Item> card4diamond = ITEMS.register("card4diamond", card::new);
    public static final RegistryObject<Item> card5diamond = ITEMS.register("card5diamond", card::new);
    public static final RegistryObject<Item> card6diamond = ITEMS.register("card6diamond", card::new);
    public static final RegistryObject<Item> card7diamond = ITEMS.register("card7diamond", card::new);
    public static final RegistryObject<Item> card8diamond= ITEMS.register("card8diamond", card::new);
    public static final RegistryObject<Item> card9diamond = ITEMS.register("card9diamond", card::new);
    public static final RegistryObject<Item> card10diamond = ITEMS.register("card10diamond", card::new);
    public static final RegistryObject<Item> cardacediamond = ITEMS.register("cardacediamond", card::new);
    public static final RegistryObject<Item> cardjdiamond = ITEMS.register("cardjdiamond", card::new);
    public static final RegistryObject<Item> cardkdiamond = ITEMS.register("cardkdiamond", card::new);
    public static final RegistryObject<Item> cardqdiamond = ITEMS.register("cardqdiamond", card::new);
    public static final RegistryObject<Item> card2club = ITEMS.register("card2club", card::new);
    public static final RegistryObject<Item> card3club = ITEMS.register("card3club", card::new);
    public static final RegistryObject<Item> card4club = ITEMS.register("card4club", card::new);
    public static final RegistryObject<Item> card5club= ITEMS.register("card5club", card::new);
    public static final RegistryObject<Item> card6club = ITEMS.register("card6club", card::new);
    public static final RegistryObject<Item> card7club = ITEMS.register("card7club", card::new);
    public static final RegistryObject<Item> card8club= ITEMS.register("card8club", card::new);
    public static final RegistryObject<Item> card9club = ITEMS.register("card9club", card::new);
    public static final RegistryObject<Item> card10club = ITEMS.register("card10club", card::new);
    public static final RegistryObject<Item> cardaceclub = ITEMS.register("cardaceclub", card::new);
    public static final RegistryObject<Item> cardjclub = ITEMS.register("cardjclub", card::new);
    public static final RegistryObject<Item> cardkclub = ITEMS.register("cardkclub", card::new);
    public static final RegistryObject<Item> cardqclub = ITEMS.register("cardqclub", card::new);


}
