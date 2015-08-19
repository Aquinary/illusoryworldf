/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquinary.illusory;

import aquinary.illusory.proxy.Common;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author Aquinary
 */
/**
 *
 * @author Aquinary
 */
//Информация о моде
@Mod(modid = Core.MODID,
        name = Core.MODNAME,
        version = Core.VERSION)
//Главный класс
public class Core 
{
    public static final String MODID = "illusory";
    public static final String MODNAME = "Illusory World";
    public static final String VERSION = "0.0.0";
    public static final String SERVER = "aquinary.illusory.proxy.Server";
    public static final String CLIENT = "aquinary.illusory.proxy.Client";
    
    @Mod.Instance
    public static Core instance = new Core();
    
    @SidedProxy(clientSide = Core.CLIENT,
            serverSide = Core.SERVER)
    
    public static Common proxy;
    
    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        this.proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {
        this.proxy.init(event);
    }
    
    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        this.proxy.postInit(event);
    }
}
