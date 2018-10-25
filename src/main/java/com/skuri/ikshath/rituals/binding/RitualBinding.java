package com.skuri.ikshath.rituals.binding;

import com.skuri.ikshath.rituals.RitualBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.Vec3d;

public class RitualBinding implements RitualBase {

    private EntityPlayerSP _player;
    private String _catalystItemName = "";
    private String _usedItemName;
    private Vec3d playerPos;
    IBlockState state;

    public void getPlayer(EntityPlayerSP player, String usedItemName) {
        _player = player;
        playerPos = _player.getPositionVector();
    }

    public boolean checkBlockLayout() {
        if ((playerPos.x + 5) == 5) {

        }

        return false;
    }

    public boolean checkHeldItem() {
        if (_catalystItemName.equals(_usedItemName)) return true;
        else return false;
    }

    public void doRitualEffect() {
        if (checkHeldItem() && checkBlockLayout()) {
            //do the ritual
        }
    }

}
