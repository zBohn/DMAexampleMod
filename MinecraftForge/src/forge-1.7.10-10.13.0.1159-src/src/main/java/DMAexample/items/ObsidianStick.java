package DMAexample.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianStick extends Item {

	public ObsidianStick() 
	{
		// TODO Auto-generated constructor stub
		
		setUnlocalizedName("obsidianstick");//Name our item so that the LANG file can read it.
		setCreativeTab(CreativeTabs.tabMisc);//Place the item into the creative GUI
		setTextureName("dmaexample:obsidian_stick");//Use the default stick texture for now!
	}
	
	

}
