package com.skuri.ikshath.rituals;

import net.minecraft.client.entity.EntityPlayerSP;

public interface RitualBase {

    void getPlayer(EntityPlayerSP player, String usedItemName);

    void doRitualEffect();

    boolean checkBlockLayout();

    boolean checkHeldItem();
}
