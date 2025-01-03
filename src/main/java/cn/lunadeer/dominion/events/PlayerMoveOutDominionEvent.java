package cn.lunadeer.dominion.events;

import cn.lunadeer.dominion.api.dtos.DominionDTO;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * 玩家离开领地事件，当玩家离开一个领地时触发。
 */
public class PlayerMoveOutDominionEvent extends CallableEvent {
    private final Player player;
    private final DominionDTO dominion;

    public PlayerMoveOutDominionEvent(Player player, DominionDTO dominion) {
        this.player = player;
        this.dominion = dominion;
    }

    /**
     * 获取玩家
     *
     * @return 玩家
     */
    public @NotNull Player getPlayer() {
        return player;
    }

    /**
     * 获取玩家离开的领地
     *
     * @return 领地
     */
    public @NotNull DominionDTO getDominion() {
        return dominion;
    }
}
