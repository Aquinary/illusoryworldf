/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquinary.illusory.item;

import aquinary.illusory.Core;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 *
 * @author Aquinary
 */
public class RenderItem 
{
    
   public static void preInit() 
   {
        
   }
   

    public static void RenderItem(Item item)
    {
       Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Core.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
 
}
