package net.skaidream.SkaiDreamLib.util;

public abstract interface SDMessageInterface
{
	public abstract boolean send(Object arg0);
	public abstract boolean sendFixed(Object arg0);
	public abstract boolean sendFixed(Object arg0, boolean isNPC);
}
