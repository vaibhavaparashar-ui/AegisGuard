package me.frep.aegisguard.spigot.AegisGuard_Xc;

import com.github.retrooper.packetevents.protocol.player.User;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;

public final class aegisguard_Xc {
  private final Map aegisguard_R = Maps.newConcurrentMap();
  
  private static AbstractCheck[] aegisguard_b;
  
  private static final long a = aegisguard_e.a(2232915331293977948L, 3713785954857954843L, MethodHandles.lookup().lookupClass()).a(93089118017882L);
  
  public aegisguard_hu aegisguard_U(Object[] paramArrayOfObject) {
    Player player = (Player)paramArrayOfObject[0];
    return (aegisguard_hu)this.aegisguard_R.get(player.getUniqueId());
  }
  
  public aegisguard_hu aegisguard_Z(Object[] paramArrayOfObject) {
    User user = (User)paramArrayOfObject[0];
    return (aegisguard_hu)this.aegisguard_R.get(user.getUUID());
  }
  
  public void aegisguard_H(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    User user = (User)paramArrayOfObject[1];
    l = a ^ l;
    this.aegisguard_R.put(user.getUUID(), new aegisguard_hu(user));
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_F();
    try {
      if (arrayOfAbstractCheck != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[5]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void aegisguard_T(Object[] paramArrayOfObject) {
    int k = ((Integer)paramArrayOfObject[0]).intValue();
    Player player = (Player)paramArrayOfObject[1];
    int i = ((Integer)paramArrayOfObject[2]).intValue(), j = ((Integer)paramArrayOfObject[3]).intValue();
    long l = (k << 32L | i << 48L >>> 32L | j << 48L >>> 48L) ^ a;
    this.aegisguard_R.remove(player.getUniqueId());
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_F();
    try {
      if (AbstractCheck.aegisguard_B() == null)
        aegisguard_u(new AbstractCheck[4]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Collection aegisguard_k(Object[] paramArrayOfObject) {
    return this.aegisguard_R.values();
  }
  
  public static void aegisguard_u(AbstractCheck[] paramArrayOfAbstractCheck) {
    aegisguard_b = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] aegisguard_F() {
    return aegisguard_b;
  }
  
  static {
    if (aegisguard_F() != null)
      aegisguard_u(new AbstractCheck[2]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
