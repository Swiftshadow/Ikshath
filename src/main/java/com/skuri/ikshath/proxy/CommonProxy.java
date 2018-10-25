package com.skuri.ikshath.proxy;

import com.skuri.ikshath.EventHandlerCommon;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CommonProxy {

    public static void init() {

        EventHandlerCommon handler = new EventHandlerCommon();
        MinecraftForge.EVENT_BUS.register(handler);

    }

    @SideOnly(Side.CLIENT)
    public static void clientInit() {

    }

    public void registerItemRenderer(Item item, int i, String name) {}

}
