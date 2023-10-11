package net.controllerofaus.theunderversemod.block;

import net.controllerofaus.theunderversemod.TheUnderVerseMod;
import net.controllerofaus.theunderversemod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUINS_WALLTILE_NORMAL = registerBlock("ruins_walltile_normal",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool()), ModItemGroup.UNDERTALE);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TheUnderVerseMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TheUnderVerseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TheUnderVerseMod.LOGGER.info("Registering ModBlocks for " + TheUnderVerseMod.MOD_ID);
    }
}
