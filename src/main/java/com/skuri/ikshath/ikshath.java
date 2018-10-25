package com.skuri.ikshath;

import com.skuri.ikshath.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.skuri.ikshath.items.ModItems;

@Mod(modid = ikshath.MODID, version = ikshath.VERSION)
public class ikshath {

    @SidedProxy(serverSide = "com.skuri.ikshath.proxy.CommonProxy", clientSide = "com.skuri.proxy.ClientProxy")
    public static CommonProxy proxy;
    public static final String MODID = "ikshath";
    public static final String VERSION = "0.01";
    public static final String name = "Ikshath";

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
        }

    }

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init (FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
