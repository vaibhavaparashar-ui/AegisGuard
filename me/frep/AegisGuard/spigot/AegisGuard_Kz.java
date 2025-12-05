package me.frep.aegisguard.spigot.AegisGuard_Kz;

import me.frep.aegisguard.spigot.aegisguard_Km;
import me.frep.aegisguard.spigot.aegisguard_Kr;

public final class aegisguard_Kz extends aegisguard_Km {
  public int aegisguard_v;
  
  public int aegisguard_o;
  
  public int aegisguard__;
  
  private static final String aegisguard_X;
  
  private aegisguard_Kz(int paramInt1, int paramInt2, int paramInt3) {
    super(0, 0, 0);
    this.aegisguard_v = paramInt1;
    this.aegisguard_o = paramInt2;
    this.aegisguard__ = paramInt3;
  }
  
  public int aegisguard_c(Object[] paramArrayOfObject) {
    return this.aegisguard_v;
  }
  
  public int aegisguard_K(Object[] paramArrayOfObject) {
    return this.aegisguard_o;
  }
  
  public int aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard__;
  }
  
  public aegisguard_Kr aegisguard_S(Object[] paramArrayOfObject) {
    aegisguard_Kr aegisguard_Kr = (aegisguard_Kr)paramArrayOfObject[0];
    return (aegisguard_Kr)aegisguard_X(new Object[] { aegisguard_Kr });
  }
  
  aegisguard_Kz(int paramInt1, int paramInt2, int paramInt3, Object paramObject) {
    this(paramInt1, paramInt2, paramInt3);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: ldc 'EBMM?4= '
    //   3: iconst_m1
    //   4: goto -> 17
    //   7: putstatic me/frep/aegisguard/spigot/aegisguard_Kz.aegisguard_X : Ljava/lang/String;
    //   10: getstatic me/frep/aegisguard/spigot/aegisguard_Kz.aegisguard_X : Ljava/lang/String;
    //   13: pop
    //   14: goto -> 157
    //   17: dup_x2
    //   18: pop
    //   19: invokevirtual toCharArray : ()[C
    //   22: dup_x1
    //   23: arraylength
    //   24: dup_x2
    //   25: pop
    //   26: iconst_0
    //   27: istore_0
    //   28: dup2_x1
    //   29: pop2
    //   30: dup_x2
    //   31: iconst_1
    //   32: if_icmpgt -> 131
    //   35: dup2
    //   36: swap
    //   37: iload_0
    //   38: dup2_x1
    //   39: caload
    //   40: swap
    //   41: iload_0
    //   42: bipush #7
    //   44: irem
    //   45: tableswitch default -> 113, 0 -> 84, 1 -> 88, 2 -> 93, 3 -> 98, 4 -> 103, 5 -> 108
    //   84: iconst_5
    //   85: goto -> 115
    //   88: bipush #13
    //   90: goto -> 115
    //   93: bipush #17
    //   95: goto -> 115
    //   98: bipush #34
    //   100: goto -> 115
    //   103: bipush #40
    //   105: goto -> 115
    //   108: bipush #126
    //   110: goto -> 115
    //   113: bipush #12
    //   115: ixor
    //   116: ixor
    //   117: i2c
    //   118: castore
    //   119: iinc #0, 1
    //   122: dup
    //   123: ifne -> 131
    //   126: dup2
    //   127: dup_x1
    //   128: goto -> 38
    //   131: dup2_x1
    //   132: pop2
    //   133: dup_x2
    //   134: iload_0
    //   135: if_icmpgt -> 35
    //   138: pop
    //   139: new java/lang/String
    //   142: dup_x1
    //   143: swap
    //   144: invokespecial <init> : ([C)V
    //   147: invokevirtual intern : ()Ljava/lang/String;
    //   150: swap
    //   151: pop
    //   152: swap
    //   153: pop
    //   154: goto -> 7
    //   157: return
  }
}
