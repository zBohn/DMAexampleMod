package DMAexample.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class BoneSword extends ItemSword {

	public BoneSword(ToolMaterial toolmaterial) 
	{
		super(toolmaterial);
		
		setCreativeTab(CreativeTabs.tabCombat);//Place this tool in the combat Creative Tab
		setTextureName("dmaexample:bone_sword");//Use the stone sword Texture from vanilla
		setUnlocalizedName("bonesword");//Set the internal name so that the Lang file can recognise it.
	}

}
