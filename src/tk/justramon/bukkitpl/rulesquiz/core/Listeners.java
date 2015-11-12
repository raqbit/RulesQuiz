package tk.justramon.bukkitpl.rulesquiz.core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener
{
	@EventHandler
	public void onJoin(PlayerJoinEvent event)
	{
		boolean done = PlayerStorage.check(RulesQuiz.plugin, event.getPlayer());
		if(done)
			event.getPlayer().sendMessage("done!");
		else
			event.getPlayer().sendMessage("not done!");
	}
}