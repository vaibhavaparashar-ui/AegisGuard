package me.frep.aegisguard.spigot.AegisGuard_KJ;

import com.github.retrooper.packetevents.protocol.player.User;
import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hb;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public class aegisguard_KJ {
  private static final long a = aegisguard_e.a(-1326212661586563959L, -5735087296527211152L, MethodHandles.lookup().lookupClass()).a(104042202340613L);
  
  public void aegisguard_Z(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    User user = (User)paramArrayOfObject[1];
    l1 = a ^ l1;
    long l2 = l1 ^ 0x39C13E7D0D06L;
    (new Object[2])[1] = user;
    new Object[2];
    aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_H(new Object[] { Long.valueOf(l2) });
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_Z(new Object[] { user });
    int[] arrayOfInt = aegisguard_hb.aegisguard_D();
    try {
      if (arrayOfInt == null) {
        if (aegisguard_hu == null)
          return; 
        aegisguard_hu.aegisguard_j(new Object[] { user.getName() });
        aegisguard_hu.aegisguard_D(new Object[] { Integer.valueOf(user.getEntityId()) });
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      aegisguard_hu.aegisguard_g(new Object[] { user.getClientVersion() });
      if (l1 > 0L && AbstractCheck.aegisguard_B() == null)
        aegisguard_hb.aegisguard_G(new int[1]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
