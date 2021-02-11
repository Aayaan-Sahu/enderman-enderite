package notapickle.enderman.enderite;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;

import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EndermanEnderite implements ModInitializer {

	public static final Item ENDERTHYST_SHARD = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block ENDERTHYST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f, 4.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM,  new Identifier("endermanenderite", "enderthyst_shard"), ENDERTHYST_SHARD);
		Registry.register(Registry.BLOCK, new Identifier("endermanenderite", "enderthyst_block"), ENDERTHYST_BLOCK);
		Registry.register(Registry.ITEM,  new Identifier("endermanenderite", "enderthyst_block"), new BlockItem(ENDERTHYST_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

	}
}