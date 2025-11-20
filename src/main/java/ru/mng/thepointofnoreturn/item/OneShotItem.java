package ru.mng.thepointofnoreturn.item;

public class OneShotItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_point_of_noreturn:one_shot_repair_items")));

	public OneShotItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9999f, -3f, properties);
	}
}