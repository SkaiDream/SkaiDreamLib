package net.skaidream.SkaiDreamLib.util;

public abstract class SDAbstractSender implements SDMessageInterface
{
	@Override
	public boolean send(Object obj)
	{
		return this.sendFixed(obj);
	}
	
	public boolean sendFixed(Object obj)
	{
		return this.sendFixed(obj, true);
	}
}
