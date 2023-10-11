package net.controllerofaus.theunderversemod.item;

import net.controllerofaus.theunderversemod.TheUnderVerseMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item SOUL_SHARD = registerItem("soul_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.UNDERTALE)));
    public static final Item ESSENCE_OF_DETERMINATION = registerItem("essence_of_determination",
            new Item(new FabricItemSettings().group(ModItemGroup.UNDERTALE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheUnderVerseMod.MOD_ID, name), item);
    }
    public static void  registerModItems() {
        TheUnderVerseMod.LOGGER.info("Registering Mod Items for " + TheUnderVerseMod.MOD_ID);

    }
}
