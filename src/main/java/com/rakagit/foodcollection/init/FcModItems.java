
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rakagit.foodcollection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.rakagit.foodcollection.item.TeaItem;
import com.rakagit.foodcollection.item.RedAppleItem;
import com.rakagit.foodcollection.item.IceCreamStickItem;
import com.rakagit.foodcollection.item.HotdogItem;
import com.rakagit.foodcollection.item.FruitStuffedPieItem;
import com.rakagit.foodcollection.item.BreadWithHoneyJamItem;
import com.rakagit.foodcollection.FcMod;

public class FcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FcMod.MODID);
	public static final RegistryObject<Item> BREAD_WITH_HONEY_JAM = REGISTRY.register("bread_with_honey_jam", () -> new BreadWithHoneyJamItem());
	public static final RegistryObject<Item> FRUIT_STUFFED_PIE = REGISTRY.register("fruit_stuffed_pie", () -> new FruitStuffedPieItem());
	public static final RegistryObject<Item> RED_APPLE = REGISTRY.register("red_apple", () -> new RedAppleItem());
	public static final RegistryObject<Item> ICE_CREAM_STICK = REGISTRY.register("ice_cream_stick", () -> new IceCreamStickItem());
	public static final RegistryObject<Item> HOTDOG = REGISTRY.register("hotdog", () -> new HotdogItem());
	public static final RegistryObject<Item> TEA = REGISTRY.register("tea", () -> new TeaItem());
}
