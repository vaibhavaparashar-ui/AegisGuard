package me.frep.aegisguard.spigot.AegisGuard_K2;

import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_XQ;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.Location;

public final class aegisguard_K2 {
  private double aegisguard_m;
  
  private double aegisguard_L;
  
  private double aegisguard_M;
  
  private double aegisguard_I;
  
  private double aegisguard_E;
  
  private double aegisguard_g;
  
  private final long aegisguard_j;
  
  private static boolean aegisguard_l;
  
  private static final long a = aegisguard_e.a(7868359723715593121L, 4849345589886185962L, MethodHandles.lookup().lookupClass()).a(67326259125643L);
  
  public void aegisguard_I(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_E(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_V(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_W(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_L(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_S(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public double aegisguard_T(Object[] paramArrayOfObject) {
    return this.aegisguard_m;
  }
  
  public double aegisguard_P(Object[] paramArrayOfObject) {
    return this.aegisguard_L;
  }
  
  public double aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard_M;
  }
  
  public double aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_I;
  }
  
  public double aegisguard_F(Object[] paramArrayOfObject) {
    return this.aegisguard_E;
  }
  
  public double aegisguard_U(Object[] paramArrayOfObject) {
    return this.aegisguard_g;
  }
  
  public long aegisguard_Q(Object[] paramArrayOfObject) {
    return this.aegisguard_j;
  }
  
  public aegisguard_K2(double paramDouble1, double paramDouble2, double paramDouble3) {
    this(paramDouble1, paramDouble1, paramDouble2, paramDouble2, paramDouble3, paramDouble3);
  }
  
  public aegisguard_K2(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_K2.a : J
    //   3: ldc2_w 33012536449139
    //   6: lxor
    //   7: lstore #13
    //   9: invokestatic aegisguard_c : ()Z
    //   12: aload_0
    //   13: invokespecial <init> : ()V
    //   16: istore #15
    //   18: aload_0
    //   19: invokestatic currentTimeMillis : ()J
    //   22: putfield aegisguard_j : J
    //   25: iload #15
    //   27: ifeq -> 77
    //   30: dload_1
    //   31: dload_3
    //   32: dcmpg
    //   33: ifge -> 65
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: dload_1
    //   45: putfield aegisguard_m : D
    //   48: aload_0
    //   49: dload_3
    //   50: putfield aegisguard_I : D
    //   53: iload #15
    //   55: ifne -> 82
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: aload_0
    //   66: dload_3
    //   67: putfield aegisguard_m : D
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: aload_0
    //   78: dload_1
    //   79: putfield aegisguard_I : D
    //   82: dload #5
    //   84: dload #7
    //   86: dcmpg
    //   87: ifge -> 114
    //   90: aload_0
    //   91: dload #5
    //   93: putfield aegisguard_L : D
    //   96: aload_0
    //   97: dload #7
    //   99: putfield aegisguard_E : D
    //   102: iload #15
    //   104: ifne -> 133
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: aload_0
    //   115: dload #7
    //   117: putfield aegisguard_L : D
    //   120: aload_0
    //   121: dload #5
    //   123: putfield aegisguard_E : D
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: dload #9
    //   135: dload #11
    //   137: dcmpg
    //   138: ifge -> 165
    //   141: aload_0
    //   142: dload #9
    //   144: putfield aegisguard_M : D
    //   147: aload_0
    //   148: dload #11
    //   150: putfield aegisguard_g : D
    //   153: iload #15
    //   155: ifne -> 184
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: aload_0
    //   166: dload #11
    //   168: putfield aegisguard_M : D
    //   171: aload_0
    //   172: dload #9
    //   174: putfield aegisguard_g : D
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #30	-> 12
    //   #24	-> 18
    //   #31	-> 25
    //   #32	-> 43
    //   #33	-> 48
    //   #35	-> 65
    //   #36	-> 77
    //   #38	-> 82
    //   #39	-> 90
    //   #40	-> 96
    //   #42	-> 114
    //   #43	-> 120
    //   #45	-> 133
    //   #46	-> 141
    //   #47	-> 147
    //   #49	-> 165
    //   #50	-> 171
    //   #52	-> 184
    // Exception table:
    //   from	to	target	type
    //   18	36	39	java/lang/RuntimeException
    //   30	58	61	java/lang/RuntimeException
    //   43	70	73	java/lang/RuntimeException
    //   82	107	110	java/lang/RuntimeException
    //   90	126	129	java/lang/RuntimeException
    //   133	158	161	java/lang/RuntimeException
    //   141	177	180	java/lang/RuntimeException
  }
  
  public double aegisguard_G(Object[] paramArrayOfObject) {
    Location location = (Location)paramArrayOfObject[0];
    return Math.sqrt(Math.min(Math.pow(location.getX() - this.aegisguard_m, 2.0D), Math.pow(location.getX() - this.aegisguard_I, 2.0D)) + 
        Math.min(Math.pow(location.getZ() - this.aegisguard_M, 2.0D), Math.pow(location.getZ() - this.aegisguard_g, 2.0D)));
  }
  
  public double aegisguard_d(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = Math.min(Math.pow(d1 - this.aegisguard_m, 2.0D), Math.pow(d1 - this.aegisguard_I, 2.0D));
    double d4 = Math.min(Math.pow(d2 - this.aegisguard_M, 2.0D), Math.pow(d2 - this.aegisguard_g, 2.0D));
    return Math.sqrt(d3 + d4);
  }
  
  public double aegisguard_p(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_K2 aegisguard_K2 = (me.frep.aegisguard.spigot.aegisguard_K2)paramArrayOfObject[0];
    double d1 = Math.min(Math.pow(aegisguard_K2.aegisguard_m - this.aegisguard_m, 2.0D), Math.pow(aegisguard_K2.aegisguard_I - this.aegisguard_I, 2.0D));
    double d2 = Math.min(Math.pow(aegisguard_K2.aegisguard_M - this.aegisguard_M, 2.0D), Math.pow(aegisguard_K2.aegisguard_g - this.aegisguard_g, 2.0D));
    return Math.sqrt(d1 + d2);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_K2 aegisguard_d(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_K2 aegisguard_K2 = (me.frep.aegisguard.spigot.aegisguard_K2)paramArrayOfObject[0];
    this.aegisguard_m += aegisguard_K2.aegisguard_m;
    this.aegisguard_L += aegisguard_K2.aegisguard_L;
    this.aegisguard_M += aegisguard_K2.aegisguard_M;
    this.aegisguard_I += aegisguard_K2.aegisguard_I;
    this.aegisguard_E += aegisguard_K2.aegisguard_E;
    this.aegisguard_g += aegisguard_K2.aegisguard_g;
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_K2 aegisguard_V(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    this.aegisguard_m += d1;
    this.aegisguard_L += d2;
    this.aegisguard_M += d3;
    this.aegisguard_I += d1;
    this.aegisguard_E += d2;
    this.aegisguard_g += d3;
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_K2 aegisguard_h(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    this.aegisguard_m -= d1;
    this.aegisguard_L -= d2;
    this.aegisguard_M -= d3;
    this.aegisguard_I += d1;
    this.aegisguard_E += d2;
    this.aegisguard_g += d3;
    return this;
  }
  
  public boolean aegisguard_n(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/World
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/util/function/Predicate
    //   15: astore #5
    //   17: dup
    //   18: iconst_2
    //   19: aaload
    //   20: checkcast java/lang/Long
    //   23: invokevirtual longValue : ()J
    //   26: lstore_2
    //   27: pop
    //   28: getstatic me/frep/aegisguard/spigot/aegisguard_K2.a : J
    //   31: lload_2
    //   32: lxor
    //   33: lstore_2
    //   34: lload_2
    //   35: dup2
    //   36: ldc2_w 75551904053746
    //   39: lxor
    //   40: lstore #6
    //   42: dup2
    //   43: ldc2_w 6673159050307
    //   46: lxor
    //   47: lstore #8
    //   49: pop2
    //   50: aload_0
    //   51: getfield aegisguard_m : D
    //   54: invokestatic floor : (D)D
    //   57: d2i
    //   58: istore #11
    //   60: aload_0
    //   61: getfield aegisguard_I : D
    //   64: invokestatic ceil : (D)D
    //   67: d2i
    //   68: istore #12
    //   70: invokestatic aegisguard_c : ()Z
    //   73: aload_0
    //   74: getfield aegisguard_L : D
    //   77: invokestatic floor : (D)D
    //   80: d2i
    //   81: istore #13
    //   83: aload_0
    //   84: getfield aegisguard_E : D
    //   87: invokestatic ceil : (D)D
    //   90: d2i
    //   91: istore #14
    //   93: aload_0
    //   94: getfield aegisguard_M : D
    //   97: invokestatic floor : (D)D
    //   100: d2i
    //   101: istore #15
    //   103: aload_0
    //   104: getfield aegisguard_g : D
    //   107: invokestatic ceil : (D)D
    //   110: d2i
    //   111: istore #16
    //   113: new java/util/LinkedList
    //   116: dup
    //   117: invokespecial <init> : ()V
    //   120: astore #17
    //   122: aload #17
    //   124: aload #4
    //   126: lload #6
    //   128: iload #11
    //   130: iload #13
    //   132: iload #15
    //   134: iconst_5
    //   135: anewarray java/lang/Object
    //   138: dup_x1
    //   139: swap
    //   140: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   143: iconst_4
    //   144: swap
    //   145: aastore
    //   146: dup_x1
    //   147: swap
    //   148: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   151: iconst_3
    //   152: swap
    //   153: aastore
    //   154: dup_x1
    //   155: swap
    //   156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   159: iconst_2
    //   160: swap
    //   161: aastore
    //   162: dup_x2
    //   163: dup_x2
    //   164: pop
    //   165: invokestatic valueOf : (J)Ljava/lang/Long;
    //   168: iconst_1
    //   169: swap
    //   170: aastore
    //   171: dup_x1
    //   172: swap
    //   173: iconst_0
    //   174: swap
    //   175: aastore
    //   176: invokestatic aegisguard_a : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   179: invokeinterface add : (Ljava/lang/Object;)Z
    //   184: pop
    //   185: istore #10
    //   187: iload #11
    //   189: istore #18
    //   191: iload #18
    //   193: iload #12
    //   195: if_icmpge -> 353
    //   198: iload #13
    //   200: lload_2
    //   201: lconst_0
    //   202: lcmp
    //   203: ifle -> 391
    //   206: iload #10
    //   208: ifeq -> 391
    //   211: istore #19
    //   213: iload #19
    //   215: iload #14
    //   217: if_icmpge -> 339
    //   220: iload #15
    //   222: iload #10
    //   224: ifeq -> 193
    //   227: istore #20
    //   229: iload #20
    //   231: iload #16
    //   233: if_icmpge -> 331
    //   236: aload #17
    //   238: aload #4
    //   240: lload #6
    //   242: iload #18
    //   244: iload #19
    //   246: iload #20
    //   248: iconst_5
    //   249: anewarray java/lang/Object
    //   252: dup_x1
    //   253: swap
    //   254: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   257: iconst_4
    //   258: swap
    //   259: aastore
    //   260: dup_x1
    //   261: swap
    //   262: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   265: iconst_3
    //   266: swap
    //   267: aastore
    //   268: dup_x1
    //   269: swap
    //   270: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   273: iconst_2
    //   274: swap
    //   275: aastore
    //   276: dup_x2
    //   277: dup_x2
    //   278: pop
    //   279: invokestatic valueOf : (J)Ljava/lang/Long;
    //   282: iconst_1
    //   283: swap
    //   284: aastore
    //   285: dup_x1
    //   286: swap
    //   287: iconst_0
    //   288: swap
    //   289: aastore
    //   290: invokestatic aegisguard_a : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   293: invokeinterface add : (Ljava/lang/Object;)Z
    //   298: pop
    //   299: iinc #20, 1
    //   302: iload #10
    //   304: lload_2
    //   305: lconst_0
    //   306: lcmp
    //   307: ifle -> 336
    //   310: ifeq -> 334
    //   313: iload #10
    //   315: ifne -> 229
    //   318: lload_2
    //   319: lconst_0
    //   320: lcmp
    //   321: ifle -> 302
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   330: athrow
    //   331: iinc #19, 1
    //   334: iload #10
    //   336: ifne -> 213
    //   339: iinc #18, 1
    //   342: iload #10
    //   344: lload_2
    //   345: lconst_0
    //   346: lcmp
    //   347: iflt -> 222
    //   350: ifne -> 191
    //   353: lload_2
    //   354: lconst_0
    //   355: lcmp
    //   356: iflt -> 198
    //   359: aload #17
    //   361: lload #8
    //   363: aload #5
    //   365: iconst_3
    //   366: anewarray java/lang/Object
    //   369: dup_x1
    //   370: swap
    //   371: iconst_2
    //   372: swap
    //   373: aastore
    //   374: dup_x2
    //   375: dup_x2
    //   376: pop
    //   377: invokestatic valueOf : (J)Ljava/lang/Long;
    //   380: iconst_1
    //   381: swap
    //   382: aastore
    //   383: dup_x1
    //   384: swap
    //   385: iconst_0
    //   386: swap
    //   387: aastore
    //   388: invokestatic aegisguard_O : ([Ljava/lang/Object;)Z
    //   391: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   394: ifnonnull -> 421
    //   397: iload #10
    //   399: ifeq -> 417
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   408: athrow
    //   409: iconst_0
    //   410: goto -> 418
    //   413: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   416: athrow
    //   417: iconst_1
    //   418: invokestatic aegisguard_P : (Z)V
    //   421: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #110	-> 50
    //   #111	-> 60
    //   #112	-> 73
    //   #113	-> 83
    //   #114	-> 93
    //   #115	-> 103
    //   #117	-> 113
    //   #119	-> 122
    //   #121	-> 187
    //   #122	-> 198
    //   #123	-> 220
    //   #124	-> 236
    //   #123	-> 299
    //   #122	-> 331
    //   #121	-> 339
    //   #129	-> 353
    // Exception table:
    //   from	to	target	type
    //   236	318	327	java/lang/RuntimeException
    //   391	402	405	java/lang/RuntimeException
    //   397	413	413	java/lang/RuntimeException
  }
  
  public double aegisguard_D(Object[] paramArrayOfObject) {
    return (this.aegisguard_m + this.aegisguard_I) / 2.0D;
  }
  
  public double aegisguard_R(Object[] paramArrayOfObject) {
    return (this.aegisguard_L + this.aegisguard_E) / 2.0D;
  }
  
  public double aegisguard_o(Object[] paramArrayOfObject) {
    return (this.aegisguard_M + this.aegisguard_g) / 2.0D;
  }
  
  private boolean aegisguard_G(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_3
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_n
    //   17: astore_2
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast java/lang/Integer
    //   24: invokevirtual intValue : ()I
    //   27: istore #5
    //   29: pop
    //   30: lload_3
    //   31: bipush #16
    //   33: lshl
    //   34: iload #5
    //   36: i2l
    //   37: bipush #48
    //   39: lshl
    //   40: bipush #48
    //   42: lushr
    //   43: lor
    //   44: getstatic me/frep/aegisguard/spigot/aegisguard_K2.a : J
    //   47: lxor
    //   48: lstore #6
    //   50: invokestatic aegisguard_i : ()Z
    //   53: istore #8
    //   55: aload_2
    //   56: iload #8
    //   58: ifne -> 72
    //   61: ifnull -> 224
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: aload_2
    //   72: iconst_0
    //   73: anewarray java/lang/Object
    //   76: invokevirtual aegisguard_t : ([Ljava/lang/Object;)D
    //   79: aload_0
    //   80: getfield aegisguard_L : D
    //   83: dcmpl
    //   84: iload #8
    //   86: lload_3
    //   87: lconst_0
    //   88: lcmp
    //   89: iflt -> 127
    //   92: ifne -> 125
    //   95: iflt -> 224
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_2
    //   106: iconst_0
    //   107: anewarray java/lang/Object
    //   110: invokevirtual aegisguard_t : ([Ljava/lang/Object;)D
    //   113: aload_0
    //   114: getfield aegisguard_E : D
    //   117: dcmpg
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: iload #8
    //   127: iload #5
    //   129: ifle -> 167
    //   132: ifne -> 165
    //   135: ifgt -> 224
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: aload_2
    //   146: iconst_0
    //   147: anewarray java/lang/Object
    //   150: invokevirtual aegisguard_p : ([Ljava/lang/Object;)D
    //   153: aload_0
    //   154: getfield aegisguard_M : D
    //   157: dcmpl
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: iload #8
    //   167: iload #5
    //   169: iflt -> 207
    //   172: ifne -> 205
    //   175: iflt -> 224
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   184: athrow
    //   185: aload_2
    //   186: iconst_0
    //   187: anewarray java/lang/Object
    //   190: invokevirtual aegisguard_p : ([Ljava/lang/Object;)D
    //   193: aload_0
    //   194: getfield aegisguard_g : D
    //   197: dcmpg
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   204: athrow
    //   205: iload #8
    //   207: ifne -> 221
    //   210: ifgt -> 224
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   219: athrow
    //   220: iconst_1
    //   221: goto -> 225
    //   224: iconst_0
    //   225: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #148	-> 55
    // Exception table:
    //   from	to	target	type
    //   55	64	67	java/lang/RuntimeException
    //   72	98	101	java/lang/RuntimeException
    //   95	118	121	java/lang/RuntimeException
    //   125	138	141	java/lang/RuntimeException
    //   135	158	161	java/lang/RuntimeException
    //   165	178	181	java/lang/RuntimeException
    //   175	198	201	java/lang/RuntimeException
    //   205	213	216	java/lang/RuntimeException
  }
  
  private boolean aegisguard__(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_n
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_K2.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_i : ()Z
    //   29: istore #5
    //   31: aload #4
    //   33: iload #5
    //   35: ifne -> 50
    //   38: ifnull -> 207
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: aload #4
    //   50: iconst_0
    //   51: anewarray java/lang/Object
    //   54: invokevirtual aegisguard_y : ([Ljava/lang/Object;)D
    //   57: aload_0
    //   58: getfield aegisguard_m : D
    //   61: dcmpl
    //   62: iload #5
    //   64: lload_2
    //   65: lconst_0
    //   66: lcmp
    //   67: iflt -> 106
    //   70: ifne -> 104
    //   73: iflt -> 207
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: aload #4
    //   85: iconst_0
    //   86: anewarray java/lang/Object
    //   89: invokevirtual aegisguard_y : ([Ljava/lang/Object;)D
    //   92: aload_0
    //   93: getfield aegisguard_I : D
    //   96: dcmpg
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: iload #5
    //   106: lload_2
    //   107: lconst_0
    //   108: lcmp
    //   109: ifle -> 148
    //   112: ifne -> 146
    //   115: ifgt -> 207
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload #4
    //   127: iconst_0
    //   128: anewarray java/lang/Object
    //   131: invokevirtual aegisguard_p : ([Ljava/lang/Object;)D
    //   134: aload_0
    //   135: getfield aegisguard_M : D
    //   138: dcmpl
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: iload #5
    //   148: lload_2
    //   149: lconst_0
    //   150: lcmp
    //   151: ifle -> 190
    //   154: ifne -> 188
    //   157: iflt -> 207
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: aload #4
    //   169: iconst_0
    //   170: anewarray java/lang/Object
    //   173: invokevirtual aegisguard_p : ([Ljava/lang/Object;)D
    //   176: aload_0
    //   177: getfield aegisguard_g : D
    //   180: dcmpg
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: iload #5
    //   190: ifne -> 204
    //   193: ifgt -> 207
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   202: athrow
    //   203: iconst_1
    //   204: goto -> 208
    //   207: iconst_0
    //   208: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #155	-> 31
    // Exception table:
    //   from	to	target	type
    //   31	41	44	java/lang/RuntimeException
    //   50	76	79	java/lang/RuntimeException
    //   73	97	100	java/lang/RuntimeException
    //   104	118	121	java/lang/RuntimeException
    //   115	139	142	java/lang/RuntimeException
    //   146	160	163	java/lang/RuntimeException
    //   157	181	184	java/lang/RuntimeException
    //   188	196	199	java/lang/RuntimeException
  }
  
  private boolean aegisguard_E(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_n
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_K2.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_c : ()Z
    //   29: istore #5
    //   31: aload #4
    //   33: iload #5
    //   35: ifeq -> 50
    //   38: ifnull -> 207
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: aload #4
    //   50: iconst_0
    //   51: anewarray java/lang/Object
    //   54: invokevirtual aegisguard_y : ([Ljava/lang/Object;)D
    //   57: aload_0
    //   58: getfield aegisguard_m : D
    //   61: dcmpl
    //   62: iload #5
    //   64: lload_2
    //   65: lconst_0
    //   66: lcmp
    //   67: ifle -> 106
    //   70: ifeq -> 104
    //   73: iflt -> 207
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: aload #4
    //   85: iconst_0
    //   86: anewarray java/lang/Object
    //   89: invokevirtual aegisguard_y : ([Ljava/lang/Object;)D
    //   92: aload_0
    //   93: getfield aegisguard_I : D
    //   96: dcmpg
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: iload #5
    //   106: lload_2
    //   107: lconst_0
    //   108: lcmp
    //   109: iflt -> 148
    //   112: ifeq -> 146
    //   115: ifgt -> 207
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload #4
    //   127: iconst_0
    //   128: anewarray java/lang/Object
    //   131: invokevirtual aegisguard_t : ([Ljava/lang/Object;)D
    //   134: aload_0
    //   135: getfield aegisguard_L : D
    //   138: dcmpl
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: iload #5
    //   148: lload_2
    //   149: lconst_0
    //   150: lcmp
    //   151: ifle -> 190
    //   154: ifeq -> 188
    //   157: iflt -> 207
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: aload #4
    //   169: iconst_0
    //   170: anewarray java/lang/Object
    //   173: invokevirtual aegisguard_t : ([Ljava/lang/Object;)D
    //   176: aload_0
    //   177: getfield aegisguard_E : D
    //   180: dcmpg
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: iload #5
    //   190: ifeq -> 204
    //   193: ifgt -> 207
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   202: athrow
    //   203: iconst_1
    //   204: goto -> 208
    //   207: iconst_0
    //   208: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #162	-> 31
    // Exception table:
    //   from	to	target	type
    //   31	41	44	java/lang/RuntimeException
    //   50	76	79	java/lang/RuntimeException
    //   73	97	100	java/lang/RuntimeException
    //   104	118	121	java/lang/RuntimeException
    //   115	139	142	java/lang/RuntimeException
    //   146	160	163	java/lang/RuntimeException
    //   157	181	184	java/lang/RuntimeException
    //   188	196	199	java/lang/RuntimeException
  }
  
  public aegisguard_XQ aegisguard_P(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_n
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore #4
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast me/frep/aegisguard/spigot/aegisguard_n
    //   25: astore_3
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_K2.a : J
    //   30: lload #4
    //   32: lxor
    //   33: lstore #4
    //   35: lload #4
    //   37: dup2
    //   38: ldc2_w 121469994348357
    //   41: lxor
    //   42: lstore #6
    //   44: dup2
    //   45: ldc2_w 89600233207850
    //   48: lxor
    //   49: dup2
    //   50: bipush #16
    //   52: lushr
    //   53: lstore #8
    //   55: dup2
    //   56: bipush #48
    //   58: lshl
    //   59: bipush #48
    //   61: lushr
    //   62: l2i
    //   63: istore #10
    //   65: pop2
    //   66: dup2
    //   67: ldc2_w 7535514349629
    //   70: lxor
    //   71: lstore #11
    //   73: dup2
    //   74: ldc2_w 18969244222512
    //   77: lxor
    //   78: lstore #13
    //   80: dup2
    //   81: ldc2_w 19348048359898
    //   84: lxor
    //   85: lstore #15
    //   87: dup2
    //   88: ldc2_w 3665343397144
    //   91: lxor
    //   92: lstore #17
    //   94: pop2
    //   95: invokestatic aegisguard_i : ()Z
    //   98: aload_2
    //   99: aload_3
    //   100: aload_0
    //   101: getfield aegisguard_m : D
    //   104: lload #13
    //   106: iconst_3
    //   107: anewarray java/lang/Object
    //   110: dup_x2
    //   111: dup_x2
    //   112: pop
    //   113: invokestatic valueOf : (J)Ljava/lang/Long;
    //   116: iconst_2
    //   117: swap
    //   118: aastore
    //   119: dup_x2
    //   120: dup_x2
    //   121: pop
    //   122: invokestatic valueOf : (D)Ljava/lang/Double;
    //   125: iconst_1
    //   126: swap
    //   127: aastore
    //   128: dup_x1
    //   129: swap
    //   130: iconst_0
    //   131: swap
    //   132: aastore
    //   133: invokevirtual aegisguard_h : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_n;
    //   136: astore #20
    //   138: aload_2
    //   139: aload_3
    //   140: aload_0
    //   141: getfield aegisguard_I : D
    //   144: lload #13
    //   146: iconst_3
    //   147: anewarray java/lang/Object
    //   150: dup_x2
    //   151: dup_x2
    //   152: pop
    //   153: invokestatic valueOf : (J)Ljava/lang/Long;
    //   156: iconst_2
    //   157: swap
    //   158: aastore
    //   159: dup_x2
    //   160: dup_x2
    //   161: pop
    //   162: invokestatic valueOf : (D)Ljava/lang/Double;
    //   165: iconst_1
    //   166: swap
    //   167: aastore
    //   168: dup_x1
    //   169: swap
    //   170: iconst_0
    //   171: swap
    //   172: aastore
    //   173: invokevirtual aegisguard_h : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_n;
    //   176: astore #21
    //   178: aload_2
    //   179: aload_3
    //   180: aload_0
    //   181: getfield aegisguard_L : D
    //   184: lload #6
    //   186: iconst_3
    //   187: anewarray java/lang/Object
    //   190: dup_x2
    //   191: dup_x2
    //   192: pop
    //   193: invokestatic valueOf : (J)Ljava/lang/Long;
    //   196: iconst_2
    //   197: swap
    //   198: aastore
    //   199: dup_x2
    //   200: dup_x2
    //   201: pop
    //   202: invokestatic valueOf : (D)Ljava/lang/Double;
    //   205: iconst_1
    //   206: swap
    //   207: aastore
    //   208: dup_x1
    //   209: swap
    //   210: iconst_0
    //   211: swap
    //   212: aastore
    //   213: invokevirtual aegisguard_F : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_n;
    //   216: astore #22
    //   218: aload_2
    //   219: aload_3
    //   220: aload_0
    //   221: getfield aegisguard_E : D
    //   224: lload #6
    //   226: iconst_3
    //   227: anewarray java/lang/Object
    //   230: dup_x2
    //   231: dup_x2
    //   232: pop
    //   233: invokestatic valueOf : (J)Ljava/lang/Long;
    //   236: iconst_2
    //   237: swap
    //   238: aastore
    //   239: dup_x2
    //   240: dup_x2
    //   241: pop
    //   242: invokestatic valueOf : (D)Ljava/lang/Double;
    //   245: iconst_1
    //   246: swap
    //   247: aastore
    //   248: dup_x1
    //   249: swap
    //   250: iconst_0
    //   251: swap
    //   252: aastore
    //   253: invokevirtual aegisguard_F : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_n;
    //   256: astore #23
    //   258: aload_2
    //   259: aload_3
    //   260: aload_0
    //   261: getfield aegisguard_M : D
    //   264: lload #11
    //   266: iconst_3
    //   267: anewarray java/lang/Object
    //   270: dup_x2
    //   271: dup_x2
    //   272: pop
    //   273: invokestatic valueOf : (J)Ljava/lang/Long;
    //   276: iconst_2
    //   277: swap
    //   278: aastore
    //   279: dup_x2
    //   280: dup_x2
    //   281: pop
    //   282: invokestatic valueOf : (D)Ljava/lang/Double;
    //   285: iconst_1
    //   286: swap
    //   287: aastore
    //   288: dup_x1
    //   289: swap
    //   290: iconst_0
    //   291: swap
    //   292: aastore
    //   293: invokevirtual aegisguard_I : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_n;
    //   296: astore #24
    //   298: istore #19
    //   300: aload_2
    //   301: aload_3
    //   302: aload_0
    //   303: getfield aegisguard_g : D
    //   306: lload #11
    //   308: iconst_3
    //   309: anewarray java/lang/Object
    //   312: dup_x2
    //   313: dup_x2
    //   314: pop
    //   315: invokestatic valueOf : (J)Ljava/lang/Long;
    //   318: iconst_2
    //   319: swap
    //   320: aastore
    //   321: dup_x2
    //   322: dup_x2
    //   323: pop
    //   324: invokestatic valueOf : (D)Ljava/lang/Double;
    //   327: iconst_1
    //   328: swap
    //   329: aastore
    //   330: dup_x1
    //   331: swap
    //   332: iconst_0
    //   333: swap
    //   334: aastore
    //   335: invokevirtual aegisguard_I : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_n;
    //   338: astore #25
    //   340: aload_0
    //   341: lload #8
    //   343: aload #20
    //   345: iload #10
    //   347: i2c
    //   348: iconst_3
    //   349: anewarray java/lang/Object
    //   352: dup_x1
    //   353: swap
    //   354: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   357: iconst_2
    //   358: swap
    //   359: aastore
    //   360: dup_x1
    //   361: swap
    //   362: iconst_1
    //   363: swap
    //   364: aastore
    //   365: dup_x2
    //   366: dup_x2
    //   367: pop
    //   368: invokestatic valueOf : (J)Ljava/lang/Long;
    //   371: iconst_0
    //   372: swap
    //   373: aastore
    //   374: invokespecial aegisguard_G : ([Ljava/lang/Object;)Z
    //   377: iload #19
    //   379: ifne -> 432
    //   382: ifne -> 395
    //   385: goto -> 392
    //   388: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   391: athrow
    //   392: aconst_null
    //   393: astore #20
    //   395: aload_0
    //   396: lload #8
    //   398: aload #21
    //   400: iload #10
    //   402: i2c
    //   403: iconst_3
    //   404: anewarray java/lang/Object
    //   407: dup_x1
    //   408: swap
    //   409: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   412: iconst_2
    //   413: swap
    //   414: aastore
    //   415: dup_x1
    //   416: swap
    //   417: iconst_1
    //   418: swap
    //   419: aastore
    //   420: dup_x2
    //   421: dup_x2
    //   422: pop
    //   423: invokestatic valueOf : (J)Ljava/lang/Long;
    //   426: iconst_0
    //   427: swap
    //   428: aastore
    //   429: invokespecial aegisguard_G : ([Ljava/lang/Object;)Z
    //   432: iload #19
    //   434: lload #4
    //   436: lconst_0
    //   437: lcmp
    //   438: iflt -> 485
    //   441: ifne -> 483
    //   444: ifne -> 457
    //   447: goto -> 454
    //   450: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   453: athrow
    //   454: aconst_null
    //   455: astore #21
    //   457: aload_0
    //   458: aload #22
    //   460: lload #17
    //   462: iconst_2
    //   463: anewarray java/lang/Object
    //   466: dup_x2
    //   467: dup_x2
    //   468: pop
    //   469: invokestatic valueOf : (J)Ljava/lang/Long;
    //   472: iconst_1
    //   473: swap
    //   474: aastore
    //   475: dup_x1
    //   476: swap
    //   477: iconst_0
    //   478: swap
    //   479: aastore
    //   480: invokespecial aegisguard__ : ([Ljava/lang/Object;)Z
    //   483: iload #19
    //   485: lload #4
    //   487: lconst_0
    //   488: lcmp
    //   489: ifle -> 536
    //   492: ifne -> 534
    //   495: ifne -> 508
    //   498: goto -> 505
    //   501: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   504: athrow
    //   505: aconst_null
    //   506: astore #22
    //   508: aload_0
    //   509: aload #23
    //   511: lload #17
    //   513: iconst_2
    //   514: anewarray java/lang/Object
    //   517: dup_x2
    //   518: dup_x2
    //   519: pop
    //   520: invokestatic valueOf : (J)Ljava/lang/Long;
    //   523: iconst_1
    //   524: swap
    //   525: aastore
    //   526: dup_x1
    //   527: swap
    //   528: iconst_0
    //   529: swap
    //   530: aastore
    //   531: invokespecial aegisguard__ : ([Ljava/lang/Object;)Z
    //   534: iload #19
    //   536: lload #4
    //   538: lconst_0
    //   539: lcmp
    //   540: ifle -> 587
    //   543: ifne -> 585
    //   546: ifne -> 559
    //   549: goto -> 556
    //   552: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   555: athrow
    //   556: aconst_null
    //   557: astore #23
    //   559: aload_0
    //   560: lload #15
    //   562: aload #24
    //   564: iconst_2
    //   565: anewarray java/lang/Object
    //   568: dup_x1
    //   569: swap
    //   570: iconst_1
    //   571: swap
    //   572: aastore
    //   573: dup_x2
    //   574: dup_x2
    //   575: pop
    //   576: invokestatic valueOf : (J)Ljava/lang/Long;
    //   579: iconst_0
    //   580: swap
    //   581: aastore
    //   582: invokespecial aegisguard_E : ([Ljava/lang/Object;)Z
    //   585: iload #19
    //   587: ifne -> 629
    //   590: ifne -> 603
    //   593: goto -> 600
    //   596: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   599: athrow
    //   600: aconst_null
    //   601: astore #24
    //   603: aload_0
    //   604: lload #15
    //   606: aload #25
    //   608: iconst_2
    //   609: anewarray java/lang/Object
    //   612: dup_x1
    //   613: swap
    //   614: iconst_1
    //   615: swap
    //   616: aastore
    //   617: dup_x2
    //   618: dup_x2
    //   619: pop
    //   620: invokestatic valueOf : (J)Ljava/lang/Long;
    //   623: iconst_0
    //   624: swap
    //   625: aastore
    //   626: invokespecial aegisguard_E : ([Ljava/lang/Object;)Z
    //   629: ifne -> 635
    //   632: aconst_null
    //   633: astore #25
    //   635: aconst_null
    //   636: astore #26
    //   638: aload #20
    //   640: iload #19
    //   642: ifne -> 657
    //   645: ifnull -> 659
    //   648: goto -> 655
    //   651: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   654: athrow
    //   655: aload #20
    //   657: astore #26
    //   659: aload #21
    //   661: iload #19
    //   663: ifne -> 780
    //   666: ifnull -> 778
    //   669: goto -> 676
    //   672: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   675: athrow
    //   676: aload #26
    //   678: iload #19
    //   680: ifne -> 776
    //   683: goto -> 690
    //   686: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   689: athrow
    //   690: lload #4
    //   692: lconst_0
    //   693: lcmp
    //   694: iflt -> 769
    //   697: ifnull -> 767
    //   700: goto -> 707
    //   703: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   706: athrow
    //   707: aload_2
    //   708: iload #19
    //   710: lload #4
    //   712: lconst_0
    //   713: lcmp
    //   714: ifle -> 782
    //   717: ifne -> 780
    //   720: goto -> 727
    //   723: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   726: athrow
    //   727: aload #21
    //   729: iconst_1
    //   730: anewarray java/lang/Object
    //   733: dup_x1
    //   734: swap
    //   735: iconst_0
    //   736: swap
    //   737: aastore
    //   738: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   741: aload_2
    //   742: aload #26
    //   744: iconst_1
    //   745: anewarray java/lang/Object
    //   748: dup_x1
    //   749: swap
    //   750: iconst_0
    //   751: swap
    //   752: aastore
    //   753: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   756: dcmpg
    //   757: ifge -> 778
    //   760: goto -> 767
    //   763: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   766: athrow
    //   767: aload #21
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   775: athrow
    //   776: astore #26
    //   778: aload #22
    //   780: iload #19
    //   782: ifne -> 899
    //   785: ifnull -> 897
    //   788: goto -> 795
    //   791: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   794: athrow
    //   795: aload #26
    //   797: iload #19
    //   799: ifne -> 895
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   808: athrow
    //   809: lload #4
    //   811: lconst_0
    //   812: lcmp
    //   813: ifle -> 888
    //   816: ifnull -> 886
    //   819: goto -> 826
    //   822: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   825: athrow
    //   826: aload_2
    //   827: iload #19
    //   829: lload #4
    //   831: lconst_0
    //   832: lcmp
    //   833: ifle -> 901
    //   836: ifne -> 899
    //   839: goto -> 846
    //   842: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   845: athrow
    //   846: aload #22
    //   848: iconst_1
    //   849: anewarray java/lang/Object
    //   852: dup_x1
    //   853: swap
    //   854: iconst_0
    //   855: swap
    //   856: aastore
    //   857: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   860: aload_2
    //   861: aload #26
    //   863: iconst_1
    //   864: anewarray java/lang/Object
    //   867: dup_x1
    //   868: swap
    //   869: iconst_0
    //   870: swap
    //   871: aastore
    //   872: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   875: dcmpg
    //   876: ifge -> 897
    //   879: goto -> 886
    //   882: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   885: athrow
    //   886: aload #22
    //   888: goto -> 895
    //   891: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   894: athrow
    //   895: astore #26
    //   897: aload #23
    //   899: iload #19
    //   901: ifne -> 1018
    //   904: ifnull -> 1016
    //   907: goto -> 914
    //   910: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   913: athrow
    //   914: aload #26
    //   916: iload #19
    //   918: ifne -> 1014
    //   921: goto -> 928
    //   924: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   927: athrow
    //   928: lload #4
    //   930: lconst_0
    //   931: lcmp
    //   932: ifle -> 1007
    //   935: ifnull -> 1005
    //   938: goto -> 945
    //   941: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   944: athrow
    //   945: aload_2
    //   946: iload #19
    //   948: lload #4
    //   950: lconst_0
    //   951: lcmp
    //   952: iflt -> 1020
    //   955: ifne -> 1018
    //   958: goto -> 965
    //   961: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   964: athrow
    //   965: aload #23
    //   967: iconst_1
    //   968: anewarray java/lang/Object
    //   971: dup_x1
    //   972: swap
    //   973: iconst_0
    //   974: swap
    //   975: aastore
    //   976: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   979: aload_2
    //   980: aload #26
    //   982: iconst_1
    //   983: anewarray java/lang/Object
    //   986: dup_x1
    //   987: swap
    //   988: iconst_0
    //   989: swap
    //   990: aastore
    //   991: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   994: dcmpg
    //   995: ifge -> 1016
    //   998: goto -> 1005
    //   1001: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1004: athrow
    //   1005: aload #23
    //   1007: goto -> 1014
    //   1010: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1013: athrow
    //   1014: astore #26
    //   1016: aload #24
    //   1018: iload #19
    //   1020: ifne -> 1137
    //   1023: ifnull -> 1135
    //   1026: goto -> 1033
    //   1029: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1032: athrow
    //   1033: aload #26
    //   1035: iload #19
    //   1037: ifne -> 1133
    //   1040: goto -> 1047
    //   1043: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1046: athrow
    //   1047: lload #4
    //   1049: lconst_0
    //   1050: lcmp
    //   1051: ifle -> 1126
    //   1054: ifnull -> 1124
    //   1057: goto -> 1064
    //   1060: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1063: athrow
    //   1064: aload_2
    //   1065: iload #19
    //   1067: lload #4
    //   1069: lconst_0
    //   1070: lcmp
    //   1071: iflt -> 1139
    //   1074: ifne -> 1137
    //   1077: goto -> 1084
    //   1080: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1083: athrow
    //   1084: aload #24
    //   1086: iconst_1
    //   1087: anewarray java/lang/Object
    //   1090: dup_x1
    //   1091: swap
    //   1092: iconst_0
    //   1093: swap
    //   1094: aastore
    //   1095: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   1098: aload_2
    //   1099: aload #26
    //   1101: iconst_1
    //   1102: anewarray java/lang/Object
    //   1105: dup_x1
    //   1106: swap
    //   1107: iconst_0
    //   1108: swap
    //   1109: aastore
    //   1110: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   1113: dcmpg
    //   1114: ifge -> 1135
    //   1117: goto -> 1124
    //   1120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1123: athrow
    //   1124: aload #24
    //   1126: goto -> 1133
    //   1129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1132: athrow
    //   1133: astore #26
    //   1135: aload #25
    //   1137: iload #19
    //   1139: ifne -> 1256
    //   1142: ifnull -> 1254
    //   1145: goto -> 1152
    //   1148: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1151: athrow
    //   1152: aload #26
    //   1154: iload #19
    //   1156: ifne -> 1252
    //   1159: goto -> 1166
    //   1162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1165: athrow
    //   1166: lload #4
    //   1168: lconst_0
    //   1169: lcmp
    //   1170: iflt -> 1245
    //   1173: ifnull -> 1243
    //   1176: goto -> 1183
    //   1179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1182: athrow
    //   1183: aload_2
    //   1184: lload #4
    //   1186: lconst_0
    //   1187: lcmp
    //   1188: iflt -> 1256
    //   1191: iload #19
    //   1193: ifne -> 1256
    //   1196: goto -> 1203
    //   1199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1202: athrow
    //   1203: aload #25
    //   1205: iconst_1
    //   1206: anewarray java/lang/Object
    //   1209: dup_x1
    //   1210: swap
    //   1211: iconst_0
    //   1212: swap
    //   1213: aastore
    //   1214: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   1217: aload_2
    //   1218: aload #26
    //   1220: iconst_1
    //   1221: anewarray java/lang/Object
    //   1224: dup_x1
    //   1225: swap
    //   1226: iconst_0
    //   1227: swap
    //   1228: aastore
    //   1229: invokevirtual aegisguard_J : ([Ljava/lang/Object;)D
    //   1232: dcmpg
    //   1233: ifge -> 1254
    //   1236: goto -> 1243
    //   1239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1242: athrow
    //   1243: aload #25
    //   1245: goto -> 1252
    //   1248: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1251: athrow
    //   1252: astore #26
    //   1254: aload #26
    //   1256: ifnonnull -> 1265
    //   1259: aconst_null
    //   1260: areturn
    //   1261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1264: athrow
    //   1265: aconst_null
    //   1266: astore #27
    //   1268: aload #26
    //   1270: aload #20
    //   1272: iload #19
    //   1274: lload #4
    //   1276: lconst_0
    //   1277: lcmp
    //   1278: iflt -> 1308
    //   1281: ifne -> 1306
    //   1284: if_acmpne -> 1302
    //   1287: goto -> 1294
    //   1290: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1293: athrow
    //   1294: getstatic me/frep/aegisguard/spigot/aegisguard_hq.WEST : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1297: astore #27
    //   1299: goto -> 1417
    //   1302: aload #26
    //   1304: aload #21
    //   1306: iload #19
    //   1308: lload #4
    //   1310: lconst_0
    //   1311: lcmp
    //   1312: ifle -> 1342
    //   1315: ifne -> 1340
    //   1318: if_acmpne -> 1336
    //   1321: goto -> 1328
    //   1324: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1327: athrow
    //   1328: getstatic me/frep/aegisguard/spigot/aegisguard_hq.EAST : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1331: astore #27
    //   1333: goto -> 1417
    //   1336: aload #26
    //   1338: aload #22
    //   1340: iload #19
    //   1342: lload #4
    //   1344: lconst_0
    //   1345: lcmp
    //   1346: ifle -> 1376
    //   1349: ifne -> 1374
    //   1352: if_acmpne -> 1370
    //   1355: goto -> 1362
    //   1358: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1361: athrow
    //   1362: getstatic me/frep/aegisguard/spigot/aegisguard_hq.DOWN : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1365: astore #27
    //   1367: goto -> 1417
    //   1370: aload #26
    //   1372: aload #23
    //   1374: iload #19
    //   1376: ifne -> 1401
    //   1379: if_acmpne -> 1397
    //   1382: goto -> 1389
    //   1385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1388: athrow
    //   1389: getstatic me/frep/aegisguard/spigot/aegisguard_hq.UP : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1392: astore #27
    //   1394: goto -> 1417
    //   1397: aload #26
    //   1399: aload #24
    //   1401: if_acmpne -> 1412
    //   1404: getstatic me/frep/aegisguard/spigot/aegisguard_hq.NORTH : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1407: astore #27
    //   1409: goto -> 1417
    //   1412: getstatic me/frep/aegisguard/spigot/aegisguard_hq.SOUTH : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1415: astore #27
    //   1417: new me/frep/aegisguard/spigot/aegisguard_XQ
    //   1420: dup
    //   1421: aload #26
    //   1423: aload #27
    //   1425: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_n;Lme/frep/aegisguard/spigot/aegisguard_hq;)V
    //   1428: iload #19
    //   1430: lload #4
    //   1432: lconst_0
    //   1433: lcmp
    //   1434: ifle -> 1441
    //   1437: ifeq -> 1454
    //   1440: iconst_5
    //   1441: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   1444: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   1447: goto -> 1454
    //   1450: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1453: athrow
    //   1454: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #166	-> 98
    //   #167	-> 138
    //   #168	-> 178
    //   #169	-> 218
    //   #170	-> 258
    //   #171	-> 300
    //   #173	-> 340
    //   #174	-> 392
    //   #177	-> 395
    //   #179	-> 454
    //   #182	-> 457
    //   #184	-> 505
    //   #187	-> 508
    //   #189	-> 556
    //   #192	-> 559
    //   #194	-> 600
    //   #197	-> 603
    //   #199	-> 632
    //   #202	-> 635
    //   #204	-> 638
    //   #206	-> 655
    //   #209	-> 659
    //   #211	-> 767
    //   #214	-> 778
    //   #216	-> 886
    //   #219	-> 897
    //   #221	-> 1005
    //   #224	-> 1016
    //   #226	-> 1124
    //   #229	-> 1135
    //   #231	-> 1243
    //   #234	-> 1254
    //   #236	-> 1259
    //   #240	-> 1265
    //   #242	-> 1268
    //   #244	-> 1294
    //   #246	-> 1302
    //   #248	-> 1328
    //   #250	-> 1336
    //   #252	-> 1362
    //   #254	-> 1370
    //   #256	-> 1389
    //   #258	-> 1397
    //   #260	-> 1404
    //   #264	-> 1412
    //   #267	-> 1417
    // Exception table:
    //   from	to	target	type
    //   340	385	388	java/lang/RuntimeException
    //   432	447	450	java/lang/RuntimeException
    //   483	498	501	java/lang/RuntimeException
    //   534	549	552	java/lang/RuntimeException
    //   585	593	596	java/lang/RuntimeException
    //   638	648	651	java/lang/RuntimeException
    //   659	669	672	java/lang/RuntimeException
    //   666	683	686	java/lang/RuntimeException
    //   676	700	703	java/lang/RuntimeException
    //   690	720	723	java/lang/RuntimeException
    //   707	760	763	java/lang/RuntimeException
    //   727	769	772	java/lang/RuntimeException
    //   780	788	791	java/lang/RuntimeException
    //   785	802	805	java/lang/RuntimeException
    //   795	819	822	java/lang/RuntimeException
    //   809	839	842	java/lang/RuntimeException
    //   826	879	882	java/lang/RuntimeException
    //   846	888	891	java/lang/RuntimeException
    //   899	907	910	java/lang/RuntimeException
    //   904	921	924	java/lang/RuntimeException
    //   914	938	941	java/lang/RuntimeException
    //   928	958	961	java/lang/RuntimeException
    //   945	998	1001	java/lang/RuntimeException
    //   965	1007	1010	java/lang/RuntimeException
    //   1018	1026	1029	java/lang/RuntimeException
    //   1023	1040	1043	java/lang/RuntimeException
    //   1033	1057	1060	java/lang/RuntimeException
    //   1047	1077	1080	java/lang/RuntimeException
    //   1064	1117	1120	java/lang/RuntimeException
    //   1084	1126	1129	java/lang/RuntimeException
    //   1137	1145	1148	java/lang/RuntimeException
    //   1142	1159	1162	java/lang/RuntimeException
    //   1152	1176	1179	java/lang/RuntimeException
    //   1166	1196	1199	java/lang/RuntimeException
    //   1183	1236	1239	java/lang/RuntimeException
    //   1203	1245	1248	java/lang/RuntimeException
    //   1256	1261	1261	java/lang/RuntimeException
    //   1268	1287	1290	java/lang/RuntimeException
    //   1306	1321	1324	java/lang/RuntimeException
    //   1340	1355	1358	java/lang/RuntimeException
    //   1374	1382	1385	java/lang/RuntimeException
    //   1417	1447	1450	java/lang/RuntimeException
  }
  
  public me.frep.aegisguard.spigot.aegisguard_K2 aegisguard_s(Object[] paramArrayOfObject) {
    return new me.frep.aegisguard.spigot.aegisguard_K2(this.aegisguard_m, this.aegisguard_I, this.aegisguard_L, this.aegisguard_E, this.aegisguard_M, this.aegisguard_g);
  }
  
  public static void aegisguard_P(boolean paramBoolean) {
    aegisguard_l = paramBoolean;
  }
  
  public static boolean aegisguard_c() {
    return aegisguard_l;
  }
  
  public static boolean aegisguard_i() {
    boolean bool = aegisguard_c();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    if (!aegisguard_c())
      aegisguard_P(true); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
