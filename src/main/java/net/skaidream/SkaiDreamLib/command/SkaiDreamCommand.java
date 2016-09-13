package net.skaidream.SkaiDreamLib.command;

import org.bukkit.command.CommandExecutor;

public abstract interface SkaiDreamCommand extends CommandExecutor
{
	public abstract String getAlias();
	
	public abstract void setAlias(String... args);
	
}
