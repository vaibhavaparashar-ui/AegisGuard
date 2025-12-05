package me.frep.aegisguard.spigot.AegisGuard_XR;

import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hg;
import me.frep.aegisguard.spigot.aegisguard_hu;

public class aegisguard_XR {
  private final aegisguard_hu aegisguard_x;
  
  public void aegisguard_Z(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_C(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_k(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_i(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_J(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_m(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard__(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public aegisguard_hu aegisguard_n(Object[] paramArrayOfObject) {
    return this.aegisguard_x;
  }
  
  private long aegisguard_R = -1L, aegisguard_g, aegisguard_P = System.currentTimeMillis(), aegisguard_f = System.currentTimeMillis();
  
  public long aegisguard_f(Object[] paramArrayOfObject) {
    return this.aegisguard_R;
  }
  
  public long aegisguard_s(Object[] paramArrayOfObject) {
    return this.aegisguard_g;
  }
  
  public long aegisguard_i(Object[] paramArrayOfObject) {
    return this.aegisguard_P;
  }
  
  public long aegisguard_x(Object[] paramArrayOfObject) {
    return this.aegisguard_f;
  }
  
  private long aegisguard_Z = System.currentTimeMillis();
  
  public long aegisguard_c(Object[] paramArrayOfObject) {
    return this.aegisguard_Z;
  }
  
  private final aegisguard_hg aegisguard_O = new aegisguard_hg(20);
  
  private double aegisguard_I;
  
  private double aegisguard_h;
  
  private static String[] aegisguard__;
  
  private static final long a = aegisguard_e.a(-1297276916093472060L, -6163084058400522662L, MethodHandles.lookup().lookupClass()).a(153546385148409L);
  
  public aegisguard_hg aegisguard__(Object[] paramArrayOfObject) {
    return this.aegisguard_O;
  }
  
  public double aegisguard_W(Object[] paramArrayOfObject) {
    return this.aegisguard_I;
  }
  
  public double aegisguard_I(Object[] paramArrayOfObject) {
    return this.aegisguard_h;
  }
  
  public aegisguard_XR(aegisguard_hu paramaegisguard_hu) {
    this.aegisguard_x = paramaegisguard_hu;
  }
  
  public void aegisguard_x(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_XR.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 32830433456128
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 62212380817158
    //   30: lxor
    //   31: lstore #6
    //   33: dup2
    //   34: ldc2_w 109094617392992
    //   37: lxor
    //   38: lstore #8
    //   40: pop2
    //   41: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   44: astore #10
    //   46: aload_0
    //   47: getfield aegisguard_x : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   50: iconst_0
    //   51: anewarray java/lang/Object
    //   54: invokevirtual aegisguard_K : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_X;
    //   57: getstatic me/frep/aegisguard/spigot/aegisguard_h3.AUTOCLICKER_NON_DIG : Lme/frep/aegisguard/spigot/aegisguard_h3;
    //   60: lload #8
    //   62: iconst_2
    //   63: anewarray java/lang/Object
    //   66: dup_x2
    //   67: dup_x2
    //   68: pop
    //   69: invokestatic valueOf : (J)Ljava/lang/Long;
    //   72: iconst_1
    //   73: swap
    //   74: aastore
    //   75: dup_x1
    //   76: swap
    //   77: iconst_0
    //   78: swap
    //   79: aastore
    //   80: invokevirtual aegisguard_t : ([Ljava/lang/Object;)Z
    //   83: ifne -> 232
    //   86: invokestatic currentTimeMillis : ()J
    //   89: lstore #11
    //   91: aload_0
    //   92: aload #10
    //   94: ifnull -> 227
    //   97: getfield aegisguard_R : J
    //   100: lconst_0
    //   101: lcmp
    //   102: ifle -> 226
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: aload_0
    //   113: lload #11
    //   115: aload_0
    //   116: getfield aegisguard_R : J
    //   119: lsub
    //   120: lload_2
    //   121: lconst_0
    //   122: lcmp
    //   123: ifle -> 229
    //   126: putfield aegisguard_g : J
    //   129: aload_0
    //   130: getfield aegisguard_O : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   133: aload_0
    //   134: getfield aegisguard_g : J
    //   137: invokestatic valueOf : (J)Ljava/lang/Long;
    //   140: invokevirtual add : (Ljava/lang/Object;)Z
    //   143: pop
    //   144: aload_0
    //   145: aload #10
    //   147: ifnull -> 227
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: getfield aegisguard_O : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   160: lload #6
    //   162: iconst_1
    //   163: anewarray java/lang/Object
    //   166: dup_x2
    //   167: dup_x2
    //   168: pop
    //   169: invokestatic valueOf : (J)Ljava/lang/Long;
    //   172: iconst_0
    //   173: swap
    //   174: aastore
    //   175: invokevirtual aegisguard_g : ([Ljava/lang/Object;)Z
    //   178: ifeq -> 226
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: aload_0
    //   189: aload_0
    //   190: getfield aegisguard_O : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   193: lload #4
    //   195: iconst_2
    //   196: anewarray java/lang/Object
    //   199: dup_x2
    //   200: dup_x2
    //   201: pop
    //   202: invokestatic valueOf : (J)Ljava/lang/Long;
    //   205: iconst_1
    //   206: swap
    //   207: aastore
    //   208: dup_x1
    //   209: swap
    //   210: iconst_0
    //   211: swap
    //   212: aastore
    //   213: invokestatic aegisguard_Y : ([Ljava/lang/Object;)D
    //   216: putfield aegisguard_I : D
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   225: athrow
    //   226: aload_0
    //   227: lload #11
    //   229: putfield aegisguard_R : J
    //   232: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #25	-> 46
    //   #26	-> 86
    //   #28	-> 91
    //   #29	-> 112
    //   #31	-> 129
    //   #33	-> 144
    //   #34	-> 188
    //   #38	-> 226
    //   #40	-> 232
    // Exception table:
    //   from	to	target	type
    //   91	105	108	java/lang/RuntimeException
    //   97	150	153	java/lang/RuntimeException
    //   112	181	184	java/lang/RuntimeException
    //   157	219	222	java/lang/RuntimeException
  }
  
  public static void aegisguard_b(String[] paramArrayOfString) {
    aegisguard__ = paramArrayOfString;
  }
  
  public static String[] aegisguard_R() {
    return aegisguard__;
  }
  
  static {
    if (aegisguard_R() == null)
      aegisguard_b(new String[5]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
