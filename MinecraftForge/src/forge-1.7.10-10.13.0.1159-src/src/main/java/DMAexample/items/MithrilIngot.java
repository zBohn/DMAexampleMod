package DMAexample.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MithrilIngot extends Item {

	public MithrilIngot() 
	{
		// TODO Auto-generated constructor stub
		setUnlocalizedName("mithrilingot");//Name our item so that the LANG file can read it.
		setCreativeTab(CreativeTabs.tabMaterials);//Place the item into the creative GUI
		setTextureName("dmaexample:mithril_ingot");//Use the default stick texture for now!
	}

}
