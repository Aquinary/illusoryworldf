/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquinary.illusory.proxy;

import aquinary.illusory.item.RenderItem;
import aquinary.illusory.item.sword.BasicSword;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
/**
 *
 * @author Aquinary
 */
public class Client extends Common
{
    
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        //BasicSword.CreateSword();
        GameRegistry.registerItem(BasicSword.wood_stone_sword = new BasicSword("wood_stone_sword",BasicSword.wood_stone_sword_material),"wood_stone_sword"); 
        RenderItem.preInit();
        
     }
   
    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        BasicSword.RenderSword();
    }
    
    @Override 
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);    
    }
}