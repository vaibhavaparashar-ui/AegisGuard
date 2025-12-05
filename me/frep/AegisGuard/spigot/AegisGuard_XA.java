package me.frep.aegisguard.spigot.AegisGuard_XA;

import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_X_;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRiptideEvent;

public class aegisguard_XA implements Listener {
  private static final long a = aegisguard_e.a(-4926900231520973991L, 6270921377787320771L, MethodHandles.lookup().lookupClass()).a(239622497350742L);
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_a(PlayerRiptideEvent paramPlayerRiptideEvent) {
    long l = a ^ 0xA1DC506D9DEL;
    Player player = paramPlayerRiptideEvent.getPlayer();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_X_.aegisguard_a();
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Mc(new Object[] { Integer.valueOf(0) });
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
