package com.skuri.ikshath.proxy;

import com.skuri.ikshath.EventHandlerCommon;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class CommonProxy {

    public static void init() {

        EventHandlerCommon handler = new EventHandlerCommon();
        MinecraftForge.EVENT_BUS.register(handler);

    }

}
