package emu.grasscutter.game.managers.ChatManager;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.game.GameServer;

public interface ChatManagerHandler {
    GameServer getServer();
    void sendPrivateMessage(Player player, int targetUid, String message);
    void sendPrivateMessage(Player player, int targetUid, int emote);
    void sendTeamMessage(Player player, int channel, String message);
    void sendTeamMessage(Player player, int channel, int icon);
}
