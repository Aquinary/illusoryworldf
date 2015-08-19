/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquinary.illusory.item.sword;

import static aquinary.illusory.item.RegisterItem.CreateItem;
import aquinary.illusory.item.RenderItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 * @author Aquinary
 */


public class BasicSword extends ItemSword
{
    
    /* Оружие */
    public static Item wood_iron_sword;
    public static Item wood_stone_sword;
    public static Item wood_gold_sword;
    public static Item wood_diamond_sword;
    
    public static Item stone_wood_sword;
    public static Item stone_iron_sword;
    public static Item stone_gold_sword;
    public static Item stone_diamond_sword;
    
    public static Item iron_wood_sword;
    public static Item iron_stone_sword;
    public static Item iron_gold_sword;
    public static Item iron_diamond_sword;
    
    public static Item gold_wood_sword;
    public static Item gold_stone_sword;
    public static Item gold_iron_sword;
    public static Item gold_diamond_sword;
    
    public static Item diamond_wood_sword;
    public static Item diamond_stone_sword;
    public static Item diamond_iron_sword;
    public static Item diamond_diamond_sword;
    
    /* Матерьялы */
    
    public static ToolMaterial wood_stone_sword_material = EnumHelper.addToolMaterial("wood_stone_material", 0, 500, 1.0F, 3.0F, 18);
    public static ToolMaterial wood_iron_sword_material = EnumHelper.addToolMaterial("wood_stone_material", 0, 500, 1.0F, 3.0F, 18);
    public static ToolMaterial wood_gold_sword_material = EnumHelper.addToolMaterial("wood_stone_material", 0, 500, 1.0F, 3.0F, 18);
    public static ToolMaterial wood_diamond_sword_material = EnumHelper.addToolMaterial("wood_stone_material", 0, 500, 1.0F, 3.0F, 18);

    public static void preInit() 
    {
      
    }

       
   
    
    public BasicSword(String uName, ToolMaterial material) 
    {
        super(material);
        this.setUnlocalizedName(uName);
        this.setCreativeTab(CreativeTabs.tabCombat);        
    }
    
    //Инициализация всех мечай
    public static void CreateSword()
    {
        //if delete this string, and...
        CreateItem("wood_stone_sword", BasicSword.wood_stone_sword, BasicSword.wood_stone_sword_material); 
        //uncomment, this work! o_O
        //GameRegistry.registerItem(BasicSword.wood_stone_sword = new BasicSword("wood_stone_sword", BasicSword.wood_stone_sword_material), "wood_stone_sword");
    }
    
    //Рендеринг мечей
    public static void RenderSword()
    {
        RenderItem.RenderItem(BasicSword.wood_stone_sword);
    }   
}
