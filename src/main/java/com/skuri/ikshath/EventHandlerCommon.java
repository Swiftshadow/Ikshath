package com.skuri.ikshath;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemStack;

public class EventHandlerCommon {

    public String getHeldItemName() {
        try {
            EntityPlayerSP player = Minecraft.getMinecraft().player;
            String heldItemName;
            ItemStack heldItemMH = player.getHeldItemMainhand() != null ? player.getHeldItemMainhand() : null;
            ItemStack heldItemOH = player.getHeldItemOffhand() != null ? player.getHeldItemOffhand() : null;

            if (heldItemMH != null) {
                heldItemName = heldItemOH.getUnlocalizedName();
            } else if (heldItemOH != null) {
                heldItemName = heldItemMH.getUnlocalizedName();
            } else heldItemName = "NOTHING";

            return heldItemName;
        } catch (java.lang.NullPointerException e) {
            return "NOTHING";
        }
    }

}
