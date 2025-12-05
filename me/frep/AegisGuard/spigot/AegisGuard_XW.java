package me.frep.aegisguard.spigot.AegisGuard_XW;

import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPong;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientWindowConfirmation;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_KX;
import me.frep.aegisguard.spigot.aegisguard_Ke;
import me.frep.aegisguard.spigot.aegisguard_Xa;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public class aegisguard_XW {
  private final aegisguard_hu aegisguard_g;
  
  private int aegisguard_D;
  
  public aegisguard_hu aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_g;
  }
  
  public int aegisguard_Y(Object[] paramArrayOfObject) {
    return this.aegisguard_D;
  }
  
  private int aegisguard_f = -23768;
  
  private int aegisguard_N = 0;
  
  public int aegisguard_a(Object[] paramArrayOfObject) {
    return this.aegisguard_f;
  }
  
  public int aegisguard_h(Object[] paramArrayOfObject) {
    return this.aegisguard_N;
  }
  
  private short aegisguard_M = -23768;
  
  public short aegisguard_o(Object[] paramArrayOfObject) {
    return this.aegisguard_M;
  }
  
  private final Map aegisguard_s = new HashMap<>();
  
  public Map aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_s;
  }
  
  private final Map aegisguard_X = new HashMap<>();
  
  private long aegisguard_u;
  
  private long aegisguard_q;
  
  public Map aegisguard_L(Object[] paramArrayOfObject) {
    return this.aegisguard_X;
  }
  
  private long aegisguard_S = System.currentTimeMillis();
  
  private long aegisguard_d;
  
  public long aegisguard_s(Object[] paramArrayOfObject) {
    return this.aegisguard_u;
  }
  
  public long aegisguard_M(Object[] paramArrayOfObject) {
    return this.aegisguard_q;
  }
  
  public long aegisguard_t(Object[] paramArrayOfObject) {
    return this.aegisguard_S;
  }
  
  public long aegisguard_q(Object[] paramArrayOfObject) {
    return this.aegisguard_d;
  }
  
  private long aegisguard__ = System.currentTimeMillis();
  
  private long aegisguard_Z = System.currentTimeMillis();
  
  private boolean aegisguard_y;
  
  private double aegisguard_x;
  
  private double aegisguard_A;
  
  private boolean aegisguard_w;
  
  private boolean aegisguard_p;
  
  private int aegisguard_c;
  
  private boolean aegisguard_U;
  
  private static String[] aegisguard_B;
  
  private static final long a = aegisguard_e.a(-7826220930953893999L, 7366704417458671502L, MethodHandles.lookup().lookupClass()).a(195867825462070L);
  
  private static final String[] b;
  
  public long aegisguard_Z(Object[] paramArrayOfObject) {
    return this.aegisguard__;
  }
  
  public long aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_Z;
  }
  
  public boolean aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard_y;
  }
  
  public double aegisguard_c(Object[] paramArrayOfObject) {
    return this.aegisguard_x;
  }
  
  public double aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_A;
  }
  
  public aegisguard_XW(aegisguard_hu paramaegisguard_hu) {
    this.aegisguard_g = paramaegisguard_hu;
  }
  
  public void aegisguard_u(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x79EFCB0BCA04L, l3 = l1 ^ 0x31572408AC91L, l4 = l1 ^ 0x50BB74EF8B2CL, l5 = l1 ^ 0x25AEB906C378L, l6 = System.currentTimeMillis();
    this.aegisguard_q = l6 - this.aegisguard_u;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        if (this.aegisguard_q <= 3L) {
        
        } else {
          try {
            this.aegisguard_y = false;
            if (l1 >= 0L) {
              if (arrayOfAbstractCheck != null) {
                try {
                  if (this.aegisguard_y)
                    this.aegisguard_Z = System.currentTimeMillis(); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                this.aegisguard_D = aegisguard_Xa.aegisguard_X(new Object[] { this.aegisguard_g.aegisguard_L(new Object[0]) });
                this.aegisguard_u = l6;
                new Object[1];
                aegisguard_v(new Object[] { Long.valueOf(l5) });
                new Object[1];
                aegisguard_x(new Object[] { Long.valueOf(l4) });
                new Object[1];
                aegisguard_A(new Object[] { Long.valueOf(l2) });
              } 
              new Object[1];
              (new Object[1])[0] = Long.valueOf(l3);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void aegisguard_X(Object[] paramArrayOfObject) {
    this.aegisguard__ = System.currentTimeMillis();
  }
  
  public void aegisguard_M(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    this.aegisguard_f++;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null) {
        try {
          if (this.aegisguard_f > -22769)
            this.aegisguard_f = -23768; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.aegisguard_g.aegisguard_N(new Object[] { Integer.valueOf(this.aegisguard_g.aegisguard_u(new Object[0]) + 1) });
        this.aegisguard_g.aegisguard_P(new Object[] { Integer.valueOf(this.aegisguard_f) });
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.aegisguard_X.put(Integer.valueOf(this.aegisguard_f), Long.valueOf(System.currentTimeMillis()));
  }
  
  public void aegisguard_S(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    this.aegisguard_M = (short)(this.aegisguard_M + 1);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null) {
        try {
          if (this.aegisguard_M > -22769)
            this.aegisguard_M = -23768; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.aegisguard_g.aegisguard_N(new Object[] { Integer.valueOf(this.aegisguard_g.aegisguard_u(new Object[0]) + 1) });
        this.aegisguard_g.aegisguard_S(new Object[] { Integer.valueOf(this.aegisguard_M) });
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.aegisguard_s.put(Short.valueOf(this.aegisguard_M), Long.valueOf(System.currentTimeMillis()));
  }
  
  public void aegisguard_e(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    WrapperPlayClientWindowConfirmation wrapperPlayClientWindowConfirmation = (WrapperPlayClientWindowConfirmation)paramArrayOfObject[1];
    l1 = a ^ l1;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.aegisguard_s.containsKey(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()))) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l2 = ((Long)this.aegisguard_s.get(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()))).longValue();
    this.aegisguard_S = System.currentTimeMillis();
    this.aegisguard_d = System.currentTimeMillis() - l2;
    this.aegisguard_g.aegisguard_N(new Object[] { Integer.valueOf(this.aegisguard_g.aegisguard_u(new Object[0]) - 1) });
    this.aegisguard_s.remove(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()));
  }
  
  public void aegisguard_U(Object[] paramArrayOfObject) {
    WrapperPlayClientPong wrapperPlayClientPong = (WrapperPlayClientPong)paramArrayOfObject[0];
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.aegisguard_X.containsKey(Integer.valueOf(wrapperPlayClientPong.getId()))) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l2 = ((Long)this.aegisguard_X.get(Integer.valueOf(wrapperPlayClientPong.getId()))).longValue();
    this.aegisguard_S = System.currentTimeMillis();
    this.aegisguard_d = System.currentTimeMillis() - l2;
    this.aegisguard_g.aegisguard_N(new Object[] { Integer.valueOf(this.aegisguard_g.aegisguard_u(new Object[0]) - 1) });
    this.aegisguard_X.remove(Integer.valueOf(wrapperPlayClientPong.getId()));
  }
  
  public void aegisguard_A(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_XW.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 109008749406699
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 17540710807262
    //   30: lxor
    //   31: lstore #6
    //   33: dup2
    //   34: ldc2_w 130159398567944
    //   37: lxor
    //   38: lstore #8
    //   40: pop2
    //   41: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   44: astore #10
    //   46: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dw : Z
    //   49: aload #10
    //   51: ifnull -> 83
    //   54: ifne -> 65
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: return
    //   65: aload_0
    //   66: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   69: iconst_0
    //   70: anewarray java/lang/Object
    //   73: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   76: iconst_0
    //   77: anewarray java/lang/Object
    //   80: invokevirtual aegisguard_CZ : ([Ljava/lang/Object;)Z
    //   83: istore #11
    //   85: aload_0
    //   86: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   89: iconst_0
    //   90: anewarray java/lang/Object
    //   93: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   96: invokeinterface getAllowFlight : ()Z
    //   101: istore #12
    //   103: aload_0
    //   104: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   107: iconst_0
    //   108: anewarray java/lang/Object
    //   111: invokevirtual aegisguard_K : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_X;
    //   114: getstatic me/frep/aegisguard/spigot/aegisguard_h3.JOINED : Lme/frep/aegisguard/spigot/aegisguard_h3;
    //   117: lload #6
    //   119: iconst_2
    //   120: anewarray java/lang/Object
    //   123: dup_x2
    //   124: dup_x2
    //   125: pop
    //   126: invokestatic valueOf : (J)Ljava/lang/Long;
    //   129: iconst_1
    //   130: swap
    //   131: aastore
    //   132: dup_x1
    //   133: swap
    //   134: iconst_0
    //   135: swap
    //   136: aastore
    //   137: invokevirtual aegisguard_t : ([Ljava/lang/Object;)Z
    //   140: istore #13
    //   142: iload #11
    //   144: aload #10
    //   146: ifnull -> 535
    //   149: ifeq -> 512
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: iload #12
    //   161: aload #10
    //   163: ifnull -> 535
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   172: athrow
    //   173: ifne -> 512
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   182: athrow
    //   183: iload #13
    //   185: aload #10
    //   187: ifnull -> 535
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   196: athrow
    //   197: ifne -> 512
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   206: athrow
    //   207: aload_0
    //   208: dup
    //   209: getfield aegisguard_N : I
    //   212: iconst_1
    //   213: iadd
    //   214: dup_x1
    //   215: putfield aegisguard_N : I
    //   218: aload #10
    //   220: lload_2
    //   221: lconst_0
    //   222: lcmp
    //   223: iflt -> 294
    //   226: ifnull -> 286
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   235: athrow
    //   236: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Ly : I
    //   239: if_icmple -> 552
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   248: athrow
    //   249: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   252: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   255: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   258: aload_0
    //   259: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_XW;)Ljava/lang/Runnable;
    //   264: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   269: pop
    //   270: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mt : Ljava/lang/String;
    //   273: ldc_w ''
    //   276: invokevirtual equals : (Ljava/lang/Object;)Z
    //   279: goto -> 286
    //   282: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   285: athrow
    //   286: lload_2
    //   287: lconst_0
    //   288: lcmp
    //   289: ifle -> 401
    //   292: aload #10
    //   294: ifnull -> 401
    //   297: ifne -> 374
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   306: athrow
    //   307: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   310: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   313: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mt : Ljava/lang/String;
    //   316: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   319: iconst_2
    //   320: aaload
    //   321: aload_0
    //   322: getfield aegisguard_N : I
    //   325: invokestatic toString : (I)Ljava/lang/String;
    //   328: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   331: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   334: iconst_1
    //   335: aaload
    //   336: aload_0
    //   337: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   340: iconst_0
    //   341: anewarray java/lang/Object
    //   344: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   347: invokeinterface getName : ()Ljava/lang/String;
    //   352: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   355: iconst_1
    //   356: anewarray java/lang/Object
    //   359: dup_x1
    //   360: swap
    //   361: iconst_0
    //   362: swap
    //   363: aastore
    //   364: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   367: goto -> 374
    //   370: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   373: athrow
    //   374: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GP : Ljava/lang/String;
    //   377: ldc_w ''
    //   380: lload_2
    //   381: lconst_0
    //   382: lcmp
    //   383: iflt -> 443
    //   386: aload #10
    //   388: ifnull -> 443
    //   391: invokevirtual equals : (Ljava/lang/Object;)Z
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   400: athrow
    //   401: ifne -> 552
    //   404: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GP : Ljava/lang/String;
    //   407: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   410: iconst_1
    //   411: aaload
    //   412: aload_0
    //   413: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   416: iconst_0
    //   417: anewarray java/lang/Object
    //   420: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   423: invokeinterface getName : ()Ljava/lang/String;
    //   428: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   431: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   434: iconst_3
    //   435: aaload
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   442: athrow
    //   443: aload_0
    //   444: getfield aegisguard_N : I
    //   447: invokestatic toString : (I)Ljava/lang/String;
    //   450: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   453: lload #4
    //   455: dup2_x1
    //   456: pop2
    //   457: iconst_2
    //   458: anewarray java/lang/Object
    //   461: dup_x1
    //   462: swap
    //   463: iconst_1
    //   464: swap
    //   465: aastore
    //   466: dup_x2
    //   467: dup_x2
    //   468: pop
    //   469: invokestatic valueOf : (J)Ljava/lang/Long;
    //   472: iconst_0
    //   473: swap
    //   474: aastore
    //   475: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   478: lload #8
    //   480: iconst_2
    //   481: anewarray java/lang/Object
    //   484: dup_x2
    //   485: dup_x2
    //   486: pop
    //   487: invokestatic valueOf : (J)Ljava/lang/Long;
    //   490: iconst_1
    //   491: swap
    //   492: aastore
    //   493: dup_x1
    //   494: swap
    //   495: iconst_0
    //   496: swap
    //   497: aastore
    //   498: invokestatic aegisguard_F : ([Ljava/lang/Object;)V
    //   501: lload_2
    //   502: lconst_0
    //   503: lcmp
    //   504: iflt -> 512
    //   507: aload #10
    //   509: ifnonnull -> 552
    //   512: aload_0
    //   513: aload #10
    //   515: ifnull -> 539
    //   518: goto -> 525
    //   521: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   524: athrow
    //   525: getfield aegisguard_N : I
    //   528: goto -> 535
    //   531: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   534: athrow
    //   535: ifle -> 552
    //   538: aload_0
    //   539: dup
    //   540: getfield aegisguard_N : I
    //   543: i2d
    //   544: ldc2_w 0.05
    //   547: dsub
    //   548: d2i
    //   549: putfield aegisguard_N : I
    //   552: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #115	-> 46
    //   #117	-> 65
    //   #118	-> 85
    //   #120	-> 103
    //   #122	-> 142
    //   #123	-> 207
    //   #124	-> 249
    //   #127	-> 270
    //   #128	-> 307
    //   #130	-> 325
    //   #131	-> 340
    //   #128	-> 355
    //   #133	-> 374
    //   #134	-> 404
    //   #135	-> 416
    //   #136	-> 447
    //   #134	-> 457
    //   #140	-> 512
    //   #141	-> 538
    //   #144	-> 552
    // Exception table:
    //   from	to	target	type
    //   46	57	60	java/lang/RuntimeException
    //   142	152	155	java/lang/RuntimeException
    //   149	166	169	java/lang/RuntimeException
    //   159	176	179	java/lang/RuntimeException
    //   173	190	193	java/lang/RuntimeException
    //   183	200	203	java/lang/RuntimeException
    //   197	229	232	java/lang/RuntimeException
    //   207	242	245	java/lang/RuntimeException
    //   236	279	282	java/lang/RuntimeException
    //   286	300	303	java/lang/RuntimeException
    //   297	367	370	java/lang/RuntimeException
    //   374	394	397	java/lang/RuntimeException
    //   401	436	439	java/lang/RuntimeException
    //   443	518	521	java/lang/RuntimeException
    //   512	528	531	java/lang/RuntimeException
  }
  
  private void lambda$handleFlightDesync$0() {
    long l1 = a ^ 0x6FA295ACE71BL, l2 = l1 ^ 0x960F810BEA7L;
    (new Object[2])[1] = aegisguard_b0.aegisguard_y_;
    new Object[2];
    this.aegisguard_g.aegisguard_L(new Object[0]).kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public boolean aegisguard_F(Object[] paramArrayOfObject) {
    return this.aegisguard_w;
  }
  
  private void aegisguard_v(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_XW.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 69706811973783
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 46318717913460
    //   30: lxor
    //   31: lstore #6
    //   33: pop2
    //   34: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #8
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yl : Z
    //   42: aload #8
    //   44: ifnull -> 86
    //   47: ifeq -> 89
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   68: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   71: bipush #8
    //   73: aaload
    //   74: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: ifeq -> 90
    //   89: return
    //   90: invokestatic currentTimeMillis : ()J
    //   93: aload_0
    //   94: getfield aegisguard_S : J
    //   97: lsub
    //   98: lstore #9
    //   100: lload #9
    //   102: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lx : J
    //   105: lcmp
    //   106: aload #8
    //   108: lload_2
    //   109: lconst_0
    //   110: lcmp
    //   111: ifle -> 140
    //   114: ifnull -> 138
    //   117: ifle -> 500
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: aload_0
    //   128: getfield aegisguard_w : Z
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: aload #8
    //   140: lload_2
    //   141: lconst_0
    //   142: lcmp
    //   143: ifle -> 183
    //   146: ifnull -> 181
    //   149: ifne -> 500
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: aload_0
    //   160: dup
    //   161: getfield aegisguard_x : D
    //   164: dconst_1
    //   165: dadd
    //   166: dup2_x1
    //   167: putfield aegisguard_x : D
    //   170: ldc2_w 5.0
    //   173: dcmpl
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload #8
    //   183: ifnull -> 485
    //   186: ifle -> 460
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   199: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   202: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   205: aload_0
    //   206: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_XW;)Ljava/lang/Runnable;
    //   211: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   216: pop
    //   217: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GF : Ljava/lang/String;
    //   220: ldc_w ''
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: lload_2
    //   227: lconst_0
    //   228: lcmp
    //   229: ifle -> 346
    //   232: aload #8
    //   234: ifnull -> 346
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   243: athrow
    //   244: ifne -> 319
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   253: athrow
    //   254: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   257: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   260: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GF : Ljava/lang/String;
    //   263: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   266: iconst_4
    //   267: aaload
    //   268: lload #9
    //   270: invokestatic toString : (J)Ljava/lang/String;
    //   273: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   276: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   279: iconst_1
    //   280: aaload
    //   281: aload_0
    //   282: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   285: iconst_0
    //   286: anewarray java/lang/Object
    //   289: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   292: invokeinterface getName : ()Ljava/lang/String;
    //   297: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   300: iconst_1
    //   301: anewarray java/lang/Object
    //   304: dup_x1
    //   305: swap
    //   306: iconst_0
    //   307: swap
    //   308: aastore
    //   309: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   318: athrow
    //   319: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GS : Ljava/lang/String;
    //   322: lload_2
    //   323: lconst_0
    //   324: lcmp
    //   325: ifle -> 421
    //   328: ldc_w ''
    //   331: aload #8
    //   333: ifnull -> 388
    //   336: invokevirtual equals : (Ljava/lang/Object;)Z
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   345: athrow
    //   346: ifne -> 444
    //   349: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GS : Ljava/lang/String;
    //   352: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   355: iconst_1
    //   356: aaload
    //   357: aload_0
    //   358: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   361: iconst_0
    //   362: anewarray java/lang/Object
    //   365: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   368: invokeinterface getName : ()Ljava/lang/String;
    //   373: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   376: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   379: iconst_4
    //   380: aaload
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   387: athrow
    //   388: lload #9
    //   390: invokestatic toString : (J)Ljava/lang/String;
    //   393: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   396: lload #4
    //   398: dup2_x1
    //   399: pop2
    //   400: iconst_2
    //   401: anewarray java/lang/Object
    //   404: dup_x1
    //   405: swap
    //   406: iconst_1
    //   407: swap
    //   408: aastore
    //   409: dup_x2
    //   410: dup_x2
    //   411: pop
    //   412: invokestatic valueOf : (J)Ljava/lang/Long;
    //   415: iconst_0
    //   416: swap
    //   417: aastore
    //   418: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   421: lload #6
    //   423: iconst_2
    //   424: anewarray java/lang/Object
    //   427: dup_x2
    //   428: dup_x2
    //   429: pop
    //   430: invokestatic valueOf : (J)Ljava/lang/Long;
    //   433: iconst_1
    //   434: swap
    //   435: aastore
    //   436: dup_x1
    //   437: swap
    //   438: iconst_0
    //   439: swap
    //   440: aastore
    //   441: invokestatic aegisguard_F : ([Ljava/lang/Object;)V
    //   444: aload_0
    //   445: iconst_1
    //   446: putfield aegisguard_w : Z
    //   449: lload_2
    //   450: lconst_0
    //   451: lcmp
    //   452: ifle -> 460
    //   455: aload #8
    //   457: ifnonnull -> 500
    //   460: aload_0
    //   461: aload #8
    //   463: ifnull -> 489
    //   466: goto -> 473
    //   469: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   472: athrow
    //   473: getfield aegisguard_x : D
    //   476: dconst_0
    //   477: dcmpl
    //   478: goto -> 485
    //   481: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   484: athrow
    //   485: ifle -> 500
    //   488: aload_0
    //   489: dup
    //   490: getfield aegisguard_x : D
    //   493: ldc2_w 0.1
    //   496: dsub
    //   497: putfield aegisguard_x : D
    //   500: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #149	-> 39
    //   #151	-> 90
    //   #153	-> 100
    //   #154	-> 159
    //   #155	-> 196
    //   #157	-> 217
    //   #158	-> 254
    //   #160	-> 270
    //   #161	-> 285
    //   #158	-> 300
    //   #163	-> 319
    //   #164	-> 349
    //   #165	-> 361
    //   #166	-> 390
    //   #164	-> 400
    //   #168	-> 444
    //   #170	-> 460
    //   #171	-> 488
    //   #175	-> 500
    // Exception table:
    //   from	to	target	type
    //   39	50	53	java/lang/RuntimeException
    //   47	79	82	java/lang/RuntimeException
    //   100	120	123	java/lang/RuntimeException
    //   117	131	134	java/lang/RuntimeException
    //   138	152	155	java/lang/RuntimeException
    //   149	174	177	java/lang/RuntimeException
    //   181	189	192	java/lang/RuntimeException
    //   186	237	240	java/lang/RuntimeException
    //   196	247	250	java/lang/RuntimeException
    //   244	312	315	java/lang/RuntimeException
    //   319	339	342	java/lang/RuntimeException
    //   346	381	384	java/lang/RuntimeException
    //   444	466	469	java/lang/RuntimeException
    //   460	478	481	java/lang/RuntimeException
  }
  
  private void lambda$confirmTransactionConnection$1() {
    long l1 = a ^ 0x9D02644CC17L, l2 = l1 ^ 0x6F124BF895ABL;
    (new Object[2])[1] = aegisguard_b0.aegisguard_dU;
    new Object[2];
    this.aegisguard_g.aegisguard_L(new Object[0]).kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public boolean aegisguard_h(Object[] paramArrayOfObject) {
    return this.aegisguard_p;
  }
  
  private void aegisguard_x(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_XW.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 81845637966019
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 104684045140256
    //   30: lxor
    //   31: lstore #6
    //   33: pop2
    //   34: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #8
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LR : Z
    //   42: aload #8
    //   44: ifnull -> 86
    //   47: ifeq -> 89
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   68: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   71: bipush #9
    //   73: aaload
    //   74: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: ifeq -> 90
    //   89: return
    //   90: invokestatic currentTimeMillis : ()J
    //   93: aload_0
    //   94: getfield aegisguard__ : J
    //   97: lsub
    //   98: lstore #9
    //   100: lload #9
    //   102: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_ys : J
    //   105: lcmp
    //   106: aload #8
    //   108: lload_2
    //   109: lconst_0
    //   110: lcmp
    //   111: iflt -> 140
    //   114: ifnull -> 138
    //   117: ifle -> 501
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: aload_0
    //   128: getfield aegisguard_p : Z
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: aload #8
    //   140: lload_2
    //   141: lconst_0
    //   142: lcmp
    //   143: ifle -> 183
    //   146: ifnull -> 181
    //   149: ifne -> 501
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: aload_0
    //   160: dup
    //   161: getfield aegisguard_A : D
    //   164: dconst_1
    //   165: dadd
    //   166: dup2_x1
    //   167: putfield aegisguard_A : D
    //   170: ldc2_w 5.0
    //   173: dcmpl
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload #8
    //   183: ifnull -> 486
    //   186: ifle -> 461
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   199: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   202: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   205: aload_0
    //   206: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_XW;)Ljava/lang/Runnable;
    //   211: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   216: pop
    //   217: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mi : Ljava/lang/String;
    //   220: ldc_w ''
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: lload_2
    //   227: lconst_0
    //   228: lcmp
    //   229: iflt -> 347
    //   232: aload #8
    //   234: ifnull -> 347
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   243: athrow
    //   244: ifne -> 320
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   253: athrow
    //   254: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   257: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   260: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mi : Ljava/lang/String;
    //   263: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   266: bipush #10
    //   268: aaload
    //   269: lload #9
    //   271: invokestatic toString : (J)Ljava/lang/String;
    //   274: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   277: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   280: iconst_1
    //   281: aaload
    //   282: aload_0
    //   283: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   286: iconst_0
    //   287: anewarray java/lang/Object
    //   290: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   293: invokeinterface getName : ()Ljava/lang/String;
    //   298: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   301: iconst_1
    //   302: anewarray java/lang/Object
    //   305: dup_x1
    //   306: swap
    //   307: iconst_0
    //   308: swap
    //   309: aastore
    //   310: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   319: athrow
    //   320: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gh : Ljava/lang/String;
    //   323: lload_2
    //   324: lconst_0
    //   325: lcmp
    //   326: ifle -> 422
    //   329: ldc_w ''
    //   332: aload #8
    //   334: ifnull -> 389
    //   337: invokevirtual equals : (Ljava/lang/Object;)Z
    //   340: goto -> 347
    //   343: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   346: athrow
    //   347: ifne -> 445
    //   350: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gh : Ljava/lang/String;
    //   353: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   356: iconst_1
    //   357: aaload
    //   358: aload_0
    //   359: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   362: iconst_0
    //   363: anewarray java/lang/Object
    //   366: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   369: invokeinterface getName : ()Ljava/lang/String;
    //   374: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   377: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   380: iconst_4
    //   381: aaload
    //   382: goto -> 389
    //   385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   388: athrow
    //   389: lload #9
    //   391: invokestatic toString : (J)Ljava/lang/String;
    //   394: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   397: lload #4
    //   399: dup2_x1
    //   400: pop2
    //   401: iconst_2
    //   402: anewarray java/lang/Object
    //   405: dup_x1
    //   406: swap
    //   407: iconst_1
    //   408: swap
    //   409: aastore
    //   410: dup_x2
    //   411: dup_x2
    //   412: pop
    //   413: invokestatic valueOf : (J)Ljava/lang/Long;
    //   416: iconst_0
    //   417: swap
    //   418: aastore
    //   419: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   422: lload #6
    //   424: iconst_2
    //   425: anewarray java/lang/Object
    //   428: dup_x2
    //   429: dup_x2
    //   430: pop
    //   431: invokestatic valueOf : (J)Ljava/lang/Long;
    //   434: iconst_1
    //   435: swap
    //   436: aastore
    //   437: dup_x1
    //   438: swap
    //   439: iconst_0
    //   440: swap
    //   441: aastore
    //   442: invokestatic aegisguard_F : ([Ljava/lang/Object;)V
    //   445: aload_0
    //   446: iconst_1
    //   447: putfield aegisguard_p : Z
    //   450: lload_2
    //   451: lconst_0
    //   452: lcmp
    //   453: ifle -> 461
    //   456: aload #8
    //   458: ifnonnull -> 501
    //   461: aload_0
    //   462: aload #8
    //   464: ifnull -> 490
    //   467: goto -> 474
    //   470: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   473: athrow
    //   474: getfield aegisguard_A : D
    //   477: dconst_0
    //   478: dcmpl
    //   479: goto -> 486
    //   482: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   485: athrow
    //   486: ifle -> 501
    //   489: aload_0
    //   490: dup
    //   491: getfield aegisguard_A : D
    //   494: ldc2_w 0.1
    //   497: dsub
    //   498: putfield aegisguard_A : D
    //   501: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #180	-> 39
    //   #182	-> 90
    //   #184	-> 100
    //   #185	-> 159
    //   #186	-> 196
    //   #188	-> 217
    //   #189	-> 254
    //   #191	-> 271
    //   #192	-> 286
    //   #189	-> 301
    //   #194	-> 320
    //   #195	-> 350
    //   #196	-> 362
    //   #197	-> 391
    //   #195	-> 401
    //   #199	-> 445
    //   #201	-> 461
    //   #202	-> 489
    //   #206	-> 501
    // Exception table:
    //   from	to	target	type
    //   39	50	53	java/lang/RuntimeException
    //   47	79	82	java/lang/RuntimeException
    //   100	120	123	java/lang/RuntimeException
    //   117	131	134	java/lang/RuntimeException
    //   138	152	155	java/lang/RuntimeException
    //   149	174	177	java/lang/RuntimeException
    //   181	189	192	java/lang/RuntimeException
    //   186	237	240	java/lang/RuntimeException
    //   196	247	250	java/lang/RuntimeException
    //   244	313	316	java/lang/RuntimeException
    //   320	340	343	java/lang/RuntimeException
    //   347	382	385	java/lang/RuntimeException
    //   445	467	470	java/lang/RuntimeException
    //   461	479	482	java/lang/RuntimeException
  }
  
  private void lambda$confirmKeepAliveConnection$2() {
    long l1 = a ^ 0x2CC54F3D35FBL, l2 = l1 ^ 0x4A0722816C47L;
    (new Object[2])[1] = aegisguard_b0.aegisguard_dU;
    new Object[2];
    this.aegisguard_g.aegisguard_L(new Object[0]).kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public int aegisguard_X(Object[] paramArrayOfObject) {
    return this.aegisguard_c;
  }
  
  public boolean aegisguard_G(Object[] paramArrayOfObject) {
    return this.aegisguard_U;
  }
  
  private void aegisguard_y(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_XW.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 47951108525950
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 69105884604061
    //   30: lxor
    //   31: lstore #6
    //   33: pop2
    //   34: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #8
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yS : Z
    //   42: aload #8
    //   44: ifnull -> 86
    //   47: ifeq -> 107
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   68: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   71: bipush #6
    //   73: aaload
    //   74: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: aload #8
    //   88: lload_2
    //   89: lconst_0
    //   90: lcmp
    //   91: iflt -> 114
    //   94: ifnull -> 112
    //   97: ifeq -> 108
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: return
    //   108: aload_0
    //   109: getfield aegisguard_D : I
    //   112: aload #8
    //   114: ifnull -> 492
    //   117: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MD : I
    //   120: if_icmple -> 469
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   129: athrow
    //   130: aload_0
    //   131: getfield aegisguard_U : Z
    //   134: aload #8
    //   136: ifnull -> 492
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: ifne -> 469
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   155: athrow
    //   156: aload_0
    //   157: dup
    //   158: getfield aegisguard_c : I
    //   161: iconst_1
    //   162: iadd
    //   163: dup_x1
    //   164: putfield aegisguard_c : I
    //   167: aload #8
    //   169: lload_2
    //   170: lconst_0
    //   171: lcmp
    //   172: ifle -> 243
    //   175: ifnull -> 235
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   184: athrow
    //   185: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_a : I
    //   188: if_icmple -> 505
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   197: athrow
    //   198: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   201: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   204: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   207: aload_0
    //   208: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_XW;)Ljava/lang/Runnable;
    //   213: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   218: pop
    //   219: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yh : Ljava/lang/String;
    //   222: ldc_w ''
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: goto -> 235
    //   231: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   234: athrow
    //   235: lload_2
    //   236: lconst_0
    //   237: lcmp
    //   238: ifle -> 351
    //   241: aload #8
    //   243: ifnull -> 351
    //   246: ifne -> 324
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   255: athrow
    //   256: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   259: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   262: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yh : Ljava/lang/String;
    //   265: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   268: iconst_5
    //   269: aaload
    //   270: aload_0
    //   271: getfield aegisguard_D : I
    //   274: i2l
    //   275: invokestatic toString : (J)Ljava/lang/String;
    //   278: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   281: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   284: iconst_0
    //   285: aaload
    //   286: aload_0
    //   287: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   290: iconst_0
    //   291: anewarray java/lang/Object
    //   294: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   297: invokeinterface getName : ()Ljava/lang/String;
    //   302: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   305: iconst_1
    //   306: anewarray java/lang/Object
    //   309: dup_x1
    //   310: swap
    //   311: iconst_0
    //   312: swap
    //   313: aastore
    //   314: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   323: athrow
    //   324: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_q : Ljava/lang/String;
    //   327: lload_2
    //   328: lconst_0
    //   329: lcmp
    //   330: ifle -> 430
    //   333: ldc_w ''
    //   336: aload #8
    //   338: ifnull -> 394
    //   341: invokevirtual equals : (Ljava/lang/Object;)Z
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   350: athrow
    //   351: ifne -> 453
    //   354: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_q : Ljava/lang/String;
    //   357: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   360: iconst_1
    //   361: aaload
    //   362: aload_0
    //   363: getfield aegisguard_g : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   366: iconst_0
    //   367: anewarray java/lang/Object
    //   370: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   373: invokeinterface getName : ()Ljava/lang/String;
    //   378: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   381: getstatic me/frep/aegisguard/spigot/aegisguard_XW.b : [Ljava/lang/String;
    //   384: bipush #7
    //   386: aaload
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   393: athrow
    //   394: aload_0
    //   395: getfield aegisguard_D : I
    //   398: i2l
    //   399: invokestatic toString : (J)Ljava/lang/String;
    //   402: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   405: lload #4
    //   407: dup2_x1
    //   408: pop2
    //   409: iconst_2
    //   410: anewarray java/lang/Object
    //   413: dup_x1
    //   414: swap
    //   415: iconst_1
    //   416: swap
    //   417: aastore
    //   418: dup_x2
    //   419: dup_x2
    //   420: pop
    //   421: invokestatic valueOf : (J)Ljava/lang/Long;
    //   424: iconst_0
    //   425: swap
    //   426: aastore
    //   427: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   430: lload #6
    //   432: iconst_2
    //   433: anewarray java/lang/Object
    //   436: dup_x2
    //   437: dup_x2
    //   438: pop
    //   439: invokestatic valueOf : (J)Ljava/lang/Long;
    //   442: iconst_1
    //   443: swap
    //   444: aastore
    //   445: dup_x1
    //   446: swap
    //   447: iconst_0
    //   448: swap
    //   449: aastore
    //   450: invokestatic aegisguard_F : ([Ljava/lang/Object;)V
    //   453: aload_0
    //   454: iconst_1
    //   455: putfield aegisguard_U : Z
    //   458: lload_2
    //   459: lconst_0
    //   460: lcmp
    //   461: ifle -> 469
    //   464: aload #8
    //   466: ifnonnull -> 505
    //   469: aload_0
    //   470: aload #8
    //   472: ifnull -> 496
    //   475: goto -> 482
    //   478: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   481: athrow
    //   482: getfield aegisguard_c : I
    //   485: goto -> 492
    //   488: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   491: athrow
    //   492: ifle -> 505
    //   495: aload_0
    //   496: dup
    //   497: getfield aegisguard_c : I
    //   500: iconst_1
    //   501: isub
    //   502: putfield aegisguard_c : I
    //   505: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #212	-> 39
    //   #214	-> 108
    //   #215	-> 156
    //   #216	-> 198
    //   #218	-> 219
    //   #219	-> 256
    //   #221	-> 275
    //   #222	-> 290
    //   #219	-> 305
    //   #224	-> 324
    //   #225	-> 354
    //   #226	-> 366
    //   #227	-> 399
    //   #225	-> 409
    //   #230	-> 453
    //   #233	-> 469
    //   #234	-> 495
    //   #237	-> 505
    // Exception table:
    //   from	to	target	type
    //   39	50	53	java/lang/RuntimeException
    //   47	79	82	java/lang/RuntimeException
    //   86	100	103	java/lang/RuntimeException
    //   112	123	126	java/lang/RuntimeException
    //   117	139	142	java/lang/RuntimeException
    //   130	149	152	java/lang/RuntimeException
    //   146	178	181	java/lang/RuntimeException
    //   156	191	194	java/lang/RuntimeException
    //   185	228	231	java/lang/RuntimeException
    //   235	249	252	java/lang/RuntimeException
    //   246	317	320	java/lang/RuntimeException
    //   324	344	347	java/lang/RuntimeException
    //   351	387	390	java/lang/RuntimeException
    //   453	475	478	java/lang/RuntimeException
    //   469	485	488	java/lang/RuntimeException
  }
  
  private void lambda$handleMaxPingKick$3() {
    long l1 = a ^ 0x62683A8DE0F6L, l2 = l1 ^ 0x4AA5731B94AL;
    (new Object[2])[1] = aegisguard_b0.aegisguard_G5;
    new Object[2];
    this.aegisguard_g.aegisguard_L(new Object[0]).kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public static void aegisguard_q(String[] paramArrayOfString) {
    aegisguard_B = paramArrayOfString;
  }
  
  public static String[] aegisguard_q() {
    return aegisguard_B;
  }
  
  static {
    long l = a ^ 0x5E865A647C7AL;
    aegisguard_q(new String[2]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "úµ1«Å\\´\031'bò\013x¦\020úµ1«Å\\´\031'bò\013x¦\bÞ-n«] ÏÛ\bÞ-n«] ÏÛ\bü\001jæ\nhË\b~\003\006]Ý!(w)¡?\b\027\036±\025Ùÿ:*üêäf¨\016jÃ^¼`¬¦¨f,t\023y\006\b~\003\006]Ý!(w)¡?\b\027\036±\025Ùÿ:*üêäf¨\016jtu\035dÑ\002¾JNj<×Y\036\017").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
}
