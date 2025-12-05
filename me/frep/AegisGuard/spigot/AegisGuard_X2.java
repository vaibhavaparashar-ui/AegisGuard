package me.frep.aegisguard.spigot.AegisGuard_X2;

import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPong;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientWindowConfirmation;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import me.frep.aegisguard.spigot.aegisguard_KO;
import me.frep.aegisguard.spigot.aegisguard_Ke;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public class aegisguard_X2 {
  private final aegisguard_hu aegisguard_l;
  
  private double aegisguard_q;
  
  private double aegisguard_r;
  
  private double aegisguard_W;
  
  private double aegisguard_O;
  
  public aegisguard_hu aegisguard_J(Object[] paramArrayOfObject) {
    return this.aegisguard_l;
  }
  
  public double aegisguard_f(Object[] paramArrayOfObject) {
    return this.aegisguard_q;
  }
  
  public double aegisguard_P(Object[] paramArrayOfObject) {
    return this.aegisguard_r;
  }
  
  public double aegisguard_D(Object[] paramArrayOfObject) {
    return this.aegisguard_W;
  }
  
  public double aegisguard_g(Object[] paramArrayOfObject) {
    return this.aegisguard_O;
  }
  
  private long aegisguard_Y = System.currentTimeMillis();
  
  private long aegisguard_z = System.currentTimeMillis();
  
  public long aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_Y;
  }
  
  public long aegisguard_V(Object[] paramArrayOfObject) {
    return this.aegisguard_z;
  }
  
  private short aegisguard_n = -24768;
  
  public short aegisguard_Y(Object[] paramArrayOfObject) {
    return this.aegisguard_n;
  }
  
  private short aegisguard_Z = -24768;
  
  private aegisguard_KO aegisguard_b;
  
  public short aegisguard_h(Object[] paramArrayOfObject) {
    return this.aegisguard_Z;
  }
  
  public aegisguard_KO aegisguard_J(Object[] paramArrayOfObject) {
    return this.aegisguard_b;
  }
  
  private final Map aegisguard_D = new HashMap<>();
  
  private int aegisguard_t;
  
  public Map aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard_D;
  }
  
  private int aegisguard_S = 100;
  
  private int aegisguard_M = 100;
  
  private static int aegisguard_d;
  
  private static final long a = aegisguard_e.a(-7492319436571315835L, 465785822611086888L, MethodHandles.lookup().lookupClass()).a(188538762964407L);
  
  public int aegisguard_I(Object[] paramArrayOfObject) {
    return this.aegisguard_t;
  }
  
  public int aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_S;
  }
  
  public int aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard_M;
  }
  
  public aegisguard_X2(aegisguard_hu paramaegisguard_hu) {
    this.aegisguard_l = paramaegisguard_hu;
  }
  
  public void aegisguard_H(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Double
    //   7: invokevirtual doubleValue : ()D
    //   10: dstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/Long
    //   17: invokevirtual longValue : ()J
    //   20: lstore #4
    //   22: dup
    //   23: iconst_2
    //   24: aaload
    //   25: checkcast java/lang/Double
    //   28: invokevirtual doubleValue : ()D
    //   31: dstore #6
    //   33: dup
    //   34: iconst_3
    //   35: aaload
    //   36: checkcast java/lang/Double
    //   39: invokevirtual doubleValue : ()D
    //   42: dstore #8
    //   44: pop
    //   45: getstatic me/frep/aegisguard/spigot/aegisguard_X2.a : J
    //   48: lload #4
    //   50: lxor
    //   51: lstore #4
    //   53: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   56: aload_0
    //   57: dload_2
    //   58: putfield aegisguard_q : D
    //   61: astore #10
    //   63: aload_0
    //   64: dload #6
    //   66: putfield aegisguard_r : D
    //   69: aload_0
    //   70: dload #8
    //   72: putfield aegisguard_W : D
    //   75: aload_0
    //   76: dload_2
    //   77: dload #8
    //   79: iconst_2
    //   80: anewarray java/lang/Object
    //   83: dup_x2
    //   84: dup_x2
    //   85: pop
    //   86: invokestatic valueOf : (D)Ljava/lang/Double;
    //   89: iconst_1
    //   90: swap
    //   91: aastore
    //   92: dup_x2
    //   93: dup_x2
    //   94: pop
    //   95: invokestatic valueOf : (D)Ljava/lang/Double;
    //   98: iconst_0
    //   99: swap
    //   100: aastore
    //   101: invokestatic aegisguard_e : ([Ljava/lang/Object;)D
    //   104: putfield aegisguard_O : D
    //   107: aload_0
    //   108: getfield aegisguard_O : D
    //   111: dconst_1
    //   112: dcmpl
    //   113: aload #10
    //   115: ifnull -> 183
    //   118: ifle -> 140
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   127: athrow
    //   128: aload_0
    //   129: iconst_0
    //   130: putfield aegisguard_M : I
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   139: athrow
    //   140: aload_0
    //   141: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   144: invokevirtual aegisguard_W : ()Lme/frep/aegisguard/spigot/aegisguard_K8;
    //   147: iconst_0
    //   148: anewarray java/lang/Object
    //   151: invokevirtual aegisguard_I : ([Ljava/lang/Object;)I
    //   154: putfield aegisguard_t : I
    //   157: aload_0
    //   158: dup
    //   159: getfield aegisguard_n : S
    //   162: iconst_1
    //   163: iadd
    //   164: i2s
    //   165: putfield aegisguard_n : S
    //   168: aload_0
    //   169: dup
    //   170: getfield aegisguard_Z : S
    //   173: iconst_1
    //   174: iadd
    //   175: i2s
    //   176: putfield aegisguard_Z : S
    //   179: aload_0
    //   180: getfield aegisguard_n : S
    //   183: sipush #-23769
    //   186: lload #4
    //   188: lconst_0
    //   189: lcmp
    //   190: iflt -> 248
    //   193: aload #10
    //   195: ifnull -> 248
    //   198: if_icmple -> 222
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   207: athrow
    //   208: aload_0
    //   209: sipush #-24768
    //   212: putfield aegisguard_n : S
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   221: athrow
    //   222: aload_0
    //   223: getfield aegisguard_Z : S
    //   226: lload #4
    //   228: lconst_0
    //   229: lcmp
    //   230: ifle -> 272
    //   233: aload #10
    //   235: ifnull -> 272
    //   238: sipush #-23769
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   247: athrow
    //   248: if_icmple -> 265
    //   251: aload_0
    //   252: sipush #-24768
    //   255: putfield aegisguard_Z : S
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   264: athrow
    //   265: iconst_0
    //   266: anewarray java/lang/Object
    //   269: invokestatic aegisguard_l : ([Ljava/lang/Object;)Z
    //   272: ifeq -> 317
    //   275: aload_0
    //   276: getfield aegisguard_l : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   279: aload_0
    //   280: getfield aegisguard_Z : S
    //   283: iconst_1
    //   284: anewarray java/lang/Object
    //   287: dup_x1
    //   288: swap
    //   289: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   292: iconst_0
    //   293: swap
    //   294: aastore
    //   295: invokevirtual aegisguard_P : ([Ljava/lang/Object;)V
    //   298: aload #10
    //   300: lload #4
    //   302: lconst_0
    //   303: lcmp
    //   304: ifle -> 399
    //   307: ifnonnull -> 352
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   316: athrow
    //   317: aload_0
    //   318: getfield aegisguard_l : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   321: aload_0
    //   322: getfield aegisguard_n : S
    //   325: iconst_2
    //   326: anewarray java/lang/Object
    //   329: dup_x1
    //   330: swap
    //   331: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   334: iconst_1
    //   335: swap
    //   336: aastore
    //   337: dup_x1
    //   338: swap
    //   339: iconst_0
    //   340: swap
    //   341: aastore
    //   342: invokestatic aegisguard_V : ([Ljava/lang/Object;)V
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   351: athrow
    //   352: aload_0
    //   353: invokestatic currentTimeMillis : ()J
    //   356: putfield aegisguard_z : J
    //   359: aload_0
    //   360: getfield aegisguard_D : Ljava/util/Map;
    //   363: aload_0
    //   364: getfield aegisguard_n : S
    //   367: invokestatic valueOf : (S)Ljava/lang/Short;
    //   370: new me/frep/aegisguard/spigot/aegisguard_KO
    //   373: dup
    //   374: aload_0
    //   375: new org/bukkit/util/Vector
    //   378: dup
    //   379: dload_2
    //   380: dload #6
    //   382: dload #8
    //   384: invokespecial <init> : (DDD)V
    //   387: aload_0
    //   388: getfield aegisguard_n : S
    //   391: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_X2;Lorg/bukkit/util/Vector;S)V
    //   394: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   399: pop
    //   400: aload_0
    //   401: getfield aegisguard_l : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   404: iconst_0
    //   405: anewarray java/lang/Object
    //   408: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   411: iconst_0
    //   412: anewarray java/lang/Object
    //   415: invokevirtual aegisguard_U : ([Ljava/lang/Object;)I
    //   418: istore #11
    //   420: aload_0
    //   421: aload #10
    //   423: ifnull -> 451
    //   426: getfield aegisguard_t : I
    //   429: iload #11
    //   431: isub
    //   432: iconst_3
    //   433: if_icmpge -> 450
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   442: athrow
    //   443: goto -> 468
    //   446: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   449: athrow
    //   450: aload_0
    //   451: getfield aegisguard_l : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   454: iconst_0
    //   455: anewarray java/lang/Object
    //   458: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   461: iconst_0
    //   462: anewarray java/lang/Object
    //   465: invokevirtual aegisguard_Ev : ([Ljava/lang/Object;)V
    //   468: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #43	-> 56
    //   #44	-> 63
    //   #45	-> 69
    //   #47	-> 75
    //   #49	-> 107
    //   #51	-> 140
    //   #53	-> 157
    //   #54	-> 168
    //   #56	-> 179
    //   #57	-> 208
    //   #60	-> 222
    //   #61	-> 251
    //   #64	-> 265
    //   #65	-> 275
    //   #67	-> 317
    //   #70	-> 352
    //   #71	-> 359
    //   #73	-> 400
    //   #76	-> 420
    //   #78	-> 450
    //   #80	-> 468
    // Exception table:
    //   from	to	target	type
    //   63	121	124	java/lang/RuntimeException
    //   118	133	136	java/lang/RuntimeException
    //   183	201	204	java/lang/RuntimeException
    //   198	215	218	java/lang/RuntimeException
    //   222	241	244	java/lang/RuntimeException
    //   248	258	261	java/lang/RuntimeException
    //   272	310	313	java/lang/RuntimeException
    //   275	345	348	java/lang/RuntimeException
    //   420	436	439	java/lang/RuntimeException
    //   426	446	446	java/lang/RuntimeException
  }
  
  public void aegisguard_K(Object[] paramArrayOfObject) {
    this.aegisguard_S++;
    this.aegisguard_M++;
  }
  
  public void aegisguard_E(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    WrapperPlayClientWindowConfirmation wrapperPlayClientWindowConfirmation = (WrapperPlayClientWindowConfirmation)paramArrayOfObject[1];
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.aegisguard_D.containsKey(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()))) {
            this.aegisguard_S = 0;
            this.aegisguard_b = (aegisguard_KO)this.aegisguard_D.get(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()));
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.aegisguard_D.remove(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()));
    this.aegisguard_Y = System.currentTimeMillis();
  }
  
  public void aegisguard_x(Object[] paramArrayOfObject) {
    WrapperPlayClientPong wrapperPlayClientPong = (WrapperPlayClientPong)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    short s = (short)wrapperPlayClientPong.getId();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.aegisguard_D.containsKey(Short.valueOf(s))) {
            this.aegisguard_S = 0;
            this.aegisguard_b = (aegisguard_KO)this.aegisguard_D.get(Short.valueOf(s));
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.aegisguard_D.remove(Short.valueOf(s));
    this.aegisguard_Y = System.currentTimeMillis();
  }
  
  public static void aegisguard_Y(int paramInt) {
    aegisguard_d = paramInt;
  }
  
  public static int aegisguard_p() {
    return aegisguard_d;
  }
  
  public static int aegisguard_f() {
    int i = aegisguard_p();
    try {
      if (i == 0)
        return 99; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    if (aegisguard_p() != 0)
      aegisguard_Y(41); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
