package com.kenny2810.mysteriousCookies;

import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class mysterious_Cookie extends ItemFood{
	
	private static final String MODID = "mysteriouscookies";

	public mysterious_Cookie(int food, boolean feedtonimals){
		super(food, feedtonimals);
		 setUnlocalizedName("Mysterious Cookie");
	        setTextureName(MODID + ":" + "mysteriousCookie");
	        this.maxStackSize = 64;
	        this.setCreativeTab(CreativeTabs.tabFood);
	    }
	    public void registerIcons(IIconRegister iconRegister)
	    {
	      itemIcon = iconRegister.registerIcon("mysteriouscookies:mysteriousCookie");
		// TODO Auto-generated constructor stub
	}
	
	 protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
	    {
	            if (!p_77849_2_.isRemote)
	            {
	            	int potion = 0;
	            	Random rn = new Random();
	            	 potion = rn.nextInt(17) + 1;
	            			
	            switch(potion){
	            case 1:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 2));break;
	            case 2:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.poison.id, 600, 2));break;
	            case 3:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 2));break;
	            case 4:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 2));break;
	            case 5:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 2));break;
	            case 6:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600, 2));break;
	            case 7:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 2));break;
	            case 8:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 600, 2));break;
	            case 9:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.wither.id, 600, 2));break;
	            case 10:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 2));break;
	            case 11:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 600, 2));break;
	            case 12:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.resistance.id, 600, 2));break;
	            case 13:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 600, 2));break;
	            case 14:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.hunger.id, 600, 2));break;
	            case 15:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 2));break;
	            case 16:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.jump.id, 600, 2));break;
	            case 17:  p_77849_3_.addPotionEffect(new PotionEffect(Potion.nightVision.id, 600, 2));break;
	            
	            }
	            }
	        
	        else
	        {
	            super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
	        }
	    }

}
