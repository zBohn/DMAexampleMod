package DMAexample;

import DMAexample.blocks.HardDirt;
import DMAexample.blocks.MithrilOre;
import DMAexample.food.Strawberry;
import DMAexample.items.MithrilIngot;
import DMAexample.items.ObsidianStick;
import DMAexample.tools.BoneSword;

import com.sun.org.apache.bcel.internal.generic.LAND;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MyCode 
{
	//Block Variables
	public static Block mithrilOre;
	public static Block hardDirt;
	
	//Item Variables
	public static Item obsidianStick;
	public static Item mithrilIngot;
	
	//Food Variables
	public static Item strawberry;
	
	//Enum Tool Material
	public static ToolMaterial bone = EnumHelper.addToolMaterial("Bone", 2, 75, 3.0f, 1.0f, 7);
	
	//Bone Variables
	public static Item boneSword;
	
	public static void MyBlocks()
	{
		//Block Declarations
		mithrilOre = new MithrilOre(Material.rock);
		hardDirt = new HardDirt(Material.glass, false);
		
		//Game Registration
		GameRegistry.registerBlock(mithrilOre, "mithrilOre");
		GameRegistry.registerBlock(hardDirt, "HardDirt");
		
		//Lang Registration
		LanguageRegistry.addName(mithrilOre, "Mithril Block");
		LanguageRegistry.addName(hardDirt, "Hard Dirt");
	}
	
	public static void MyRecipes()
	{
		//Shapeless Recipe that takes in 2 items, 1 Dirt & 1 Clay. Returns 1 Diamond Blocks
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block), new Object[] {new ItemStack(Blocks.dirt), new ItemStack(Blocks.clay)});
		
		//Shapeless Recipe that takes in 1 dirt & returns 7 Diamond Blocks
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block, 7), new Object[] {new ItemStack(Blocks.dirt)});
		
		//Shapeless Recipe that takes in 9 items, 3 dirt(Middle row), 6 clay(Top & Bottom rows)
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.coal_block), new Object[] 
		{
			"AAA",
			"BBB",
			"AAA",
			'A', Blocks.clay, 'B', Blocks.dirt
		});
		
		//Shapeless Recipe that takes in 9 items, 1 Stone in Middle, 6 Sand (Top & Bottom rows)
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone), new Object[] 
		{
			"AAA",
			" B ",
			"AAA",
			'A', Blocks.sand, 'B', Blocks.stone
		});
		
		//Shapeless recipe that takes in dirt & outputs wooden slabs
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.double_wooden_slab, 2), new Object[] {new ItemStack(Blocks.dirt)});
		
		//A shapeless recipe that changes coal into charcoal
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1), new Object[] {new ItemStack(Items.coal, 1, 1)});
		
		//A shapeless recipe that changes charcoal into coal
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1, 1), new Object[] {new ItemStack(Items.coal, 1)});
		
		//Smelting Dirt into Beef
		GameRegistry.addSmelting(new ItemStack(Blocks.dirt), new ItemStack(Items.cooked_beef), 0.01F);
		
		//Enchanting Beef with Fire Aspect 3 when Smelted
		ItemStack newEnchantment = new ItemStack(Items.cooked_beef);
		newEnchantment.addEnchantment(Enchantment.fireAspect, 3);
		GameRegistry.addSmelting(new ItemStack(Blocks.sandstone), newEnchantment, 0.01F);
		
		//A shapeless recipe that changes a Stick to an Obsidian Stick
		GameRegistry.addShapelessRecipe(new ItemStack(obsidianStick), new Object[] {new ItemStack(Items.stick)});
	
		//Smelting an ObsidianStick into Beef
		//GameRegistry.addSmelting(new ItemStack(obsidianStick), new ItemStack(Items.cooked_beef), 0.01F);
		
		//Smelting an ObsidianStick into Mithril Ore
		GameRegistry.addSmelting(new ItemStack(obsidianStick), new ItemStack(mithrilOre), 0.01F);
	}
	public static void MyItems()
	{
		//Item Declaration
		obsidianStick = new ObsidianStick();
		mithrilIngot = new MithrilIngot();
		//Food
		strawberry = new Strawberry(5000, 2, false);
		//Tool
		boneSword = new BoneSword(bone);
		
		//Game Registry
		GameRegistry.registerItem(obsidianStick, "obsidianstick");
		GameRegistry.registerItem(mithrilIngot, "mithrilingot");
		GameRegistry.registerItem(strawberry, "strawberry");
		GameRegistry.registerItem(boneSword, "bonesword");
	}
}
