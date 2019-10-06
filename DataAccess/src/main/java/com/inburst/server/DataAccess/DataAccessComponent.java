package com.inburst.server.DataAccess;

import com.inburst.server.Entitys.Npc;
import com.inburst.server.Entitys.Player;

public interface DataAccessComponent {
    EntityRepo<Player> getPlayers();
    EntityRepo<Npc> getNpcs();
}
