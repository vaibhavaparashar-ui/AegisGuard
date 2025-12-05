package me.frep.aegisguard.spigot.AegisGuard_hG;

import java.lang.invoke.MethodHandles;
import me.frep.vulcan.spigot.Vulcan_K;
import me.frep.vulcan.spigot.Vulcan_e;
import me.frep.vulcan.spigot.Vulcan_hu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Vulcan_hG implements Listener {
  private static int Vulcan_o;
  
  private static final long a = Vulcan_e.a(8635729438344448887L, -6198105914308199035L, MethodHandles.lookup().lookupClass()).a(97402603314173L);
  
  @EventHandler
  public void Vulcan_E(EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    long l = a ^ 0x284D8860A3D0L;
    int i = Vulcan_B();
    try {
      if (i == 0)
        try {
          if (!(paramEntityDamageByEntityEvent.getEntity() instanceof Player))
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Player player = (Player)paramEntityDamageByEntityEvent.getEntity();
    Vulcan_hu vulcan_hu = Vulcan_K.INSTANCE.Vulcan_Y().Vulcan_U(new Object[] { player });
    try {
      if (vulcan_hu == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (Vulcan_K.INSTANCE.Vulcan_l()) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (Vulcan_K.INSTANCE.Vulcan_l())
        vulcan_hu.Vulcan_s(new Object[0]).Vulcan_MZ(new Object[] { Integer.valueOf(0) }); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static void Vulcan_h(int paramInt) {
    Vulcan_o = paramInt;
  }
  
  public static int Vulcan_j() {
    return Vulcan_o;
  }
  
  public static int Vulcan_B() {
    int i = Vulcan_j();
    try {
      if (i == 0)
        return 84; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    if (Vulcan_j() == 0)
      Vulcan_h(14); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
