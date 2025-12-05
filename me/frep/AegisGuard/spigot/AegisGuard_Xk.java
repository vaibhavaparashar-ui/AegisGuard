package me.frep.aegisguard.spigot.AegisGuard_Xk;

import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_Xq;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public class aegisguard_Xk {
  private final aegisguard_Xq aegisguard_m;
  
  private final byte[] aegisguard_G;
  
  private final byte[] aegisguard_O;
  
  private final byte[] aegisguard_j;
  
  private static String[] aegisguard_M;
  
  private static final long a = aegisguard_e.a(172149363408349986L, 8153842070617777882L, MethodHandles.lookup().lookupClass()).a(241021681761443L);
  
  public aegisguard_Xk(aegisguard_Xq paramaegisguard_Xq, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    this.aegisguard_m = paramaegisguard_Xq;
    String[] arrayOfString = aegisguard_B();
    try {
      this.aegisguard_G = paramArrayOfbyte1;
      this.aegisguard_O = paramArrayOfbyte2;
      this.aegisguard_j = paramArrayOfbyte3;
      if (arrayOfString != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[1]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public byte[] aegisguard_q(Object[] paramArrayOfObject) {
    return this.aegisguard_O;
  }
  
  public byte[] aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_j;
  }
  
  public aegisguard_Xq aegisguard_P(Object[] paramArrayOfObject) {
    return this.aegisguard_m;
  }
  
  public byte[] aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_G;
  }
  
  public static void aegisguard__(String[] paramArrayOfString) {
    aegisguard_M = paramArrayOfString;
  }
  
  public static String[] aegisguard_B() {
    return aegisguard_M;
  }
  
  static {
    if (aegisguard_B() != null)
      aegisguard__(new String[1]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
