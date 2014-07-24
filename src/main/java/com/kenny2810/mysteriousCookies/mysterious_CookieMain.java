package com.kenny2810.mysteriousCookies;

// This Import list will grow longer with each additional tutorial.
// It's not pruned between full class postings, unlike other tutorial code.
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="mysteriouscookies", name="Mysterious Cookies", version="1.0.0")
public class mysterious_CookieMain 
{
private static final String MODID = "mysteriousCookies";


//Declaration of variables	
	//Registering Crackers
	public static Item MysteriousCookies = new mysterious_Cookie(2, false);


        @Instance(value="mysteriousCookies")
        public static mysterious_CookieMain instance;
        
        @SidedProxy(clientSide="com.kenny2810.mysteriousCookies.Client.ClientProxy",
                        serverSide="com.kenny2810.mysteriousCookies.CommonProxy")
        public static CommonProxy proxy;
        
  
        
        @EventHandler
        	
        	public void preInit(FMLPreInitializationEvent event) {
        	// Initialising Crackers
        	MysteriousCookies = new mysterious_Cookie(2, false).setUnlocalizedName("Mysterious Cookie").setTextureName(mysterious_CookieMain.MODID+":"+"mysteriousCookie");
        	
            
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) 
        {
        	ItemStack lapisStack = new ItemStack(Blocks.lapis_block);
        	ItemStack goldStack = new ItemStack(Blocks.gold_block);
        	ItemStack cookieStack = new ItemStack(Items.cookie);
        	
        	GameRegistry.addRecipe(new ItemStack(mysterious_CookieMain.MysteriousCookies, 1), 
            		"xyx", "yzy", "xyx",'x', lapisStack, 'y', goldStack, 'z', cookieStack);
     
        	//Registering Blocks
        	
       	
            //Registering Crackers
        	GameRegistry.registerItem(MysteriousCookies, "Mysterious Cookie");
        	
                
                proxy.registerRenderers();
        }
        @EventHandler
        public void postInit(FMLPreInitializationEvent e) 
        {
        }
        
        
     
      
    }

    
   