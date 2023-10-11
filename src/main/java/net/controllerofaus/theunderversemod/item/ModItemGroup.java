package net.controllerofaus.theunderversemod.item;

import net.controllerofaus.theunderversemod.TheUnderVerseMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup UNDERTALE = FabricItemGroupBuilder.build(new Identifier(TheUnderVerseMod.MOD_ID, "undertale"),
            () -> new ItemStack(ModItems.SOUL_SHARD));
}