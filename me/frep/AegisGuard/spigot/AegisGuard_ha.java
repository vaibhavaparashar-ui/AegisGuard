package me.frep.aegisguard.spigot.AegisGuard_ha;

import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_Xk;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public class aegisguard_ha extends ClassLoader {
  private aegisguard_Xk aegisguard_k;
  
  private static int[] aegisguard_I;
  
  private static final long a = aegisguard_e.a(7787344641947061713L, -4002036074107272379L, MethodHandles.lookup().lookupClass()).a(246667216258757L);
  
  public aegisguard_ha(ClassLoader paramClassLoader, aegisguard_Xk paramaegisguard_Xk) {
    super(paramClassLoader);
    int[] arrayOfInt = aegisguard_I();
    try {
      this.aegisguard_k = paramaegisguard_Xk;
      if (arrayOfInt != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[1]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Class findClass(String paramString) {
    long l = a ^ 0xD1DB473ABA5L;
    int[] arrayOfInt = aegisguard_I();
    try {
      if (arrayOfInt == null)
        if (this.aegisguard_k != null) {
          byte[] arrayOfByte = this.aegisguard_k.aegisguard_P(new Object[0]).aegisguard_x(new Object[] { null, null, this.aegisguard_k.aegisguard_B(new Object[0]), this.aegisguard_k.aegisguard_q(new Object[0]), this.aegisguard_k.aegisguard_y(new Object[0]) });
          this.aegisguard_k = null;
          return defineClass(paramString, arrayOfByte, 0, arrayOfByte.length);
        }  
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    try {
      if (AbstractCheck.aegisguard_B() == null)
        aegisguard_r(new int[2]); 
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    return super.findClass(paramString);
  }
  
  public static void aegisguard_r(int[] paramArrayOfint) {
    aegisguard_I = paramArrayOfint;
  }
  
  public static int[] aegisguard_I() {
    return aegisguard_I;
  }
  
  static {
    if (aegisguard_I() != null)
      aegisguard_r(new int[2]); 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}
