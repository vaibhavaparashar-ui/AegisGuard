package me.frep.aegisguard.spigot.AegisGuard_hx;

import com.gmail.nossr50.datatypes.skills.SuperAbilityType;
import com.gmail.nossr50.events.skills.abilities.McMMOPlayerAbilityActivateEvent;
import com.gmail.nossr50.events.skills.abilities.McMMOPlayerAbilityDeactivateEvent;
import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class aegisguard_hx implements Listener {
  private static int aegisguard_R;
  
  private static final long a = aegisguard_e.a(510367407784539626L, 8204042881651384048L, MethodHandles.lookup().lookupClass()).a(136438433432017L);
  
  @EventHandler
  public void aegisguard_j(McMMOPlayerAbilityActivateEvent paramMcMMOPlayerAbilityActivateEvent) {
    long l = a ^ 0x48D765C4397DL;
    Player player = paramMcMMOPlayerAbilityActivateEvent.getPlayer();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    int i = aegisguard_U();
    try {
      if (aegisguard_hu != null)
        try {
          if (paramMcMMOPlayerAbilityActivateEvent.getAbility() == SuperAbilityType.BERSERK)
            aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_wO(new Object[] { Boolean.valueOf(true) }); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (AbstractCheck.aegisguard_B() == null)
        aegisguard_Q(++i); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @EventHandler
  public void aegisguard_S(McMMOPlayerAbilityDeactivateEvent paramMcMMOPlayerAbilityDeactivateEvent) {
    long l = a ^ 0xE6151988537L;
    Player player = paramMcMMOPlayerAbilityDeactivateEvent.getPlayer();
    int i = aegisguard_U();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (aegisguard_hu != null)
        try {
          if (paramMcMMOPlayerAbilityDeactivateEvent.getAbility() == SuperAbilityType.BERSERK)
            aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_wO(new Object[] { Boolean.valueOf(false) }); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        AbstractCheck.aegisguard_g(new AbstractCheck[2]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static void aegisguard_Q(int paramInt) {
    aegisguard_R = paramInt;
  }
  
  public static int aegisguard_U() {
    return aegisguard_R;
  }
  
  public static int aegisguard_p() {
    int i = aegisguard_U();
    try {
      if (i == 0)
        return 47; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    if (aegisguard_U() == 0)
      aegisguard_Q(98); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
