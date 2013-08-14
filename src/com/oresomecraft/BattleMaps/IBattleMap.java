package com.oresomecraft.BattleMaps;

import com.oresomecraft.OresomeBattles.api.events.InventoryEvent;

public interface IBattleMap {

    public void readyTDMSpawns();

    public void readyFFASpawns();

    public void applyInventory(InventoryEvent event);

}
