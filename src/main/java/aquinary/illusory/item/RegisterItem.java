/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquinary.illusory.item;

import aquinary.illusory.item.sword.BasicSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author Aquinary
 */
public class RegisterItem 
{
    public static void CreateItem(String uName, Item item, ToolMaterial material)
    {
        GameRegistry.registerItem(item = new BasicSword(uName, material),uName); 
    }
    
}
