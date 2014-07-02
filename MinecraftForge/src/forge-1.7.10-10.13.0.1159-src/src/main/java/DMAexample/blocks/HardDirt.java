package DMAexample.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class HardDirt extends BlockGlass 
{
	
	//Side Variables
	public IIcon side0;//Bottom
	public IIcon side1;//Top
	public IIcon side2;//Front
	public IIcon side3;//Back
	public IIcon side4;//Left
	public IIcon side5;//Right
	
	public HardDirt(Material material, boolean bool) 
	{
		super(material, bool);
		// TODO Auto-generated constructor stub
		
		setHardness(1.0f);//As hard as dirt
		setStepSound(Block.soundTypeGravel);//Make it sound like Gravel when stepped/mined.
		setCreativeTab(CreativeTabs.tabBlock);//Put this item into the Block Tab in Creative.
		//setBlockTextureName("dmaexample:trans_dirt");//Look like Dirt
		//setBlockTextureName("dirt");
		//0=Wood, 1=Stone, 2=Iron, 3=Diamond
		setHarvestLevel("pickaxe,shovel", 0);
		setBlockName("harddirt");
		isOpaqueCube();
	}
	
	public void registerBlockIcons(IIconRegister icon)
	{
		//side0 = icon.registerIcon("dirt");
		//side1 = icon.registerIcon("stone");
		//side2 = icon.registerIcon("diamond_block");
		//side3 = icon.registerIcon("dirt");
		//side4 = icon.registerIcon("stone");
		//side5 = icon.registerIcon("diamond_block");
		
		side0 = icon.registerIcon("glass");
		side1 = icon.registerIcon("glowstone");
		side2 = icon.registerIcon("glass");
		side3 = icon.registerIcon("glass");
		side4 = icon.registerIcon("glass");
		side5 = icon.registerIcon("glass");
	}
	
	@Override
	public IIcon getIcon(int side, int meta)
	{
		if(side == 0)
		{
			return side0;
		}
		else if(side == 1)
		{
			return side1;
		}
		else if(side == 2)
		{
			return side2;
		}
		else if(side == 3)
		{
			return side3;
		}
		else if(side == 4)
		{
			return side4;
		}
		else if(side == 5)
		{
			return side5;
		}
		else
			return null;
	}

}
