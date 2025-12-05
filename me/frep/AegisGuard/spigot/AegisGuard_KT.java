package me.frep.aegisguard.spigot.AegisGuard_KT;

import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_X_;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;

public class aegisguard_KT implements Listener {
  private static final long a = aegisguard_e.a(8596875249069405906L, 8255995022479011301L, MethodHandles.lookup().lookupClass()).a(202290764981717L);
  
  @EventHandler(ignoreCancelled = true)
  public void aegisguard_i(EntityResurrectEvent paramEntityResurrectEvent) {
    long l = a ^ 0x3239C4971AF5L;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_X_.aegisguard_a();
    try {
      if (arrayOfAbstractCheck == null)
        try {
          if (paramEntityResurrectEvent.getEntity() instanceof Player) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Player player = (Player)paramEntityResurrectEvent.getEntity();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_E0(new Object[0]);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
