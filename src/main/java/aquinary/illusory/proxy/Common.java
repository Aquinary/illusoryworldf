/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquinary.illusory.proxy;

import aquinary.illusory.item.sword.BasicSword;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


/**
 *
 * @author Aquinary
 */
public class Common 
{
    public void preInit(FMLPreInitializationEvent event)
    {
        BasicSword.preInit();
        //BasicSword.CreateSword();  
         GameRegistry.registerItem(BasicSword.wood_stone_sword = new BasicSword("wood_stone_sword",BasicSword.wood_stone_sword_material),"wood_stone_sword"); 
    }
    
    public void init(FMLInitializationEvent event)
    {
         
    }
    
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
