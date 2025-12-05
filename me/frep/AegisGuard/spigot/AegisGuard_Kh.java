package me.frep.aegisguard.spigot.AegisGuard_Kh;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_Km;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_r;

public class aegisguard_Kh {
  public final double aegisguard_D;
  
  public final double aegisguard_B;
  
  public final double aegisguard_n;
  
  public final double aegisguard_q;
  
  public final double aegisguard_e;
  
  public final double aegisguard_Q;
  
  private static final long a = aegisguard_e.a(-4820936174179828568L, 970465392525490857L, MethodHandles.lookup().lookupClass()).a(120096009420924L);
  
  private static final String[] b;
  
  public aegisguard_Kh(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    this.aegisguard_D = Math.min(paramDouble1, paramDouble4);
    this.aegisguard_B = Math.min(paramDouble2, paramDouble5);
    this.aegisguard_n = Math.min(paramDouble3, paramDouble6);
    this.aegisguard_q = Math.max(paramDouble1, paramDouble4);
    this.aegisguard_e = Math.max(paramDouble2, paramDouble5);
    this.aegisguard_Q = Math.max(paramDouble3, paramDouble6);
  }
  
  public aegisguard_Kh(aegisguard_Km paramaegisguard_Km1, aegisguard_Km paramaegisguard_Km2) {
    this.aegisguard_D = paramaegisguard_Km1.aegisguard_c(new Object[0]);
    this.aegisguard_B = paramaegisguard_Km1.aegisguard_K(new Object[0]);
    this.aegisguard_n = paramaegisguard_Km1.aegisguard_l(new Object[0]);
    this.aegisguard_q = paramaegisguard_Km2.aegisguard_c(new Object[0]);
    this.aegisguard_e = paramaegisguard_Km2.aegisguard_K(new Object[0]);
    this.aegisguard_Q = paramaegisguard_Km2.aegisguard_l(new Object[0]);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Kh aegisguard_G(Object[] paramArrayOfObject) {
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
    //   14: checkcast java/lang/Double
    //   17: invokevirtual doubleValue : ()D
    //   20: dstore #4
    //   22: dup
    //   23: iconst_2
    //   24: aaload
    //   25: checkcast java/lang/Double
    //   28: invokevirtual doubleValue : ()D
    //   31: dstore #6
    //   33: dup
    //   34: iconst_3
    //   35: aaload
    //   36: checkcast java/lang/Long
    //   39: invokevirtual longValue : ()J
    //   42: lstore #8
    //   44: pop
    //   45: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   48: lload #8
    //   50: lxor
    //   51: lstore #8
    //   53: aload_0
    //   54: getfield aegisguard_D : D
    //   57: dstore #11
    //   59: invokestatic aegisguard_I : ()I
    //   62: aload_0
    //   63: getfield aegisguard_B : D
    //   66: dstore #13
    //   68: aload_0
    //   69: getfield aegisguard_n : D
    //   72: dstore #15
    //   74: aload_0
    //   75: getfield aegisguard_q : D
    //   78: dstore #17
    //   80: istore #10
    //   82: aload_0
    //   83: getfield aegisguard_e : D
    //   86: dstore #19
    //   88: aload_0
    //   89: getfield aegisguard_Q : D
    //   92: dstore #21
    //   94: dload_2
    //   95: dconst_0
    //   96: dcmpg
    //   97: iload #10
    //   99: ifeq -> 140
    //   102: ifge -> 130
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: dload #11
    //   114: dload_2
    //   115: dadd
    //   116: lload #8
    //   118: lconst_0
    //   119: lcmp
    //   120: iflt -> 170
    //   123: dstore #11
    //   125: iload #10
    //   127: ifne -> 168
    //   130: dload_2
    //   131: dconst_0
    //   132: dcmpl
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   139: athrow
    //   140: iload #10
    //   142: lload #8
    //   144: lconst_0
    //   145: lcmp
    //   146: ifle -> 174
    //   149: ifeq -> 172
    //   152: ifle -> 168
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   161: athrow
    //   162: dload #17
    //   164: dload_2
    //   165: dadd
    //   166: dstore #17
    //   168: dload #4
    //   170: dconst_0
    //   171: dcmpg
    //   172: iload #10
    //   174: lload #8
    //   176: lconst_0
    //   177: lcmp
    //   178: iflt -> 226
    //   181: ifeq -> 224
    //   184: ifge -> 213
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   193: athrow
    //   194: dload #13
    //   196: dload #4
    //   198: dadd
    //   199: lload #8
    //   201: lconst_0
    //   202: lcmp
    //   203: iflt -> 255
    //   206: dstore #13
    //   208: iload #10
    //   210: ifne -> 253
    //   213: dload #4
    //   215: dconst_0
    //   216: dcmpl
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   223: athrow
    //   224: iload #10
    //   226: lload #8
    //   228: lconst_0
    //   229: lcmp
    //   230: iflt -> 266
    //   233: ifeq -> 257
    //   236: ifle -> 253
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: dload #19
    //   248: dload #4
    //   250: dadd
    //   251: dstore #19
    //   253: dload #6
    //   255: dconst_0
    //   256: dcmpg
    //   257: lload #8
    //   259: lconst_0
    //   260: lcmp
    //   261: ifle -> 328
    //   264: iload #10
    //   266: ifeq -> 328
    //   269: ifge -> 298
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: dload #15
    //   281: dload #6
    //   283: dadd
    //   284: dstore #15
    //   286: lload #8
    //   288: lconst_0
    //   289: lcmp
    //   290: iflt -> 298
    //   293: iload #10
    //   295: ifne -> 345
    //   298: dload #6
    //   300: lload #8
    //   302: lconst_0
    //   303: lcmp
    //   304: ifle -> 343
    //   307: dconst_0
    //   308: iload #10
    //   310: ifeq -> 342
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   319: athrow
    //   320: dcmpl
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   327: athrow
    //   328: ifle -> 345
    //   331: dload #21
    //   333: dload #6
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   341: athrow
    //   342: dadd
    //   343: dstore #21
    //   345: new me/frep/aegisguard/spigot/aegisguard_Kh
    //   348: dup
    //   349: dload #11
    //   351: dload #13
    //   353: dload #15
    //   355: dload #17
    //   357: dload #19
    //   359: dload #21
    //   361: invokespecial <init> : (DDDDDD)V
    //   364: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #35	-> 53
    //   #36	-> 62
    //   #37	-> 68
    //   #38	-> 74
    //   #39	-> 82
    //   #40	-> 88
    //   #42	-> 94
    //   #44	-> 112
    //   #46	-> 130
    //   #48	-> 162
    //   #51	-> 168
    //   #53	-> 194
    //   #55	-> 213
    //   #57	-> 246
    //   #60	-> 253
    //   #62	-> 279
    //   #64	-> 298
    //   #66	-> 331
    //   #69	-> 345
    // Exception table:
    //   from	to	target	type
    //   94	105	108	java/lang/RuntimeException
    //   125	133	136	java/lang/RuntimeException
    //   140	155	158	java/lang/RuntimeException
    //   172	187	190	java/lang/RuntimeException
    //   208	217	220	java/lang/RuntimeException
    //   224	239	242	java/lang/RuntimeException
    //   257	272	275	java/lang/RuntimeException
    //   286	313	316	java/lang/RuntimeException
    //   298	321	324	java/lang/RuntimeException
    //   328	335	338	java/lang/RuntimeException
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Kh aegisguard_z(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue(), d4 = this.aegisguard_D - d1;
    double d5 = this.aegisguard_B - d2;
    double d6 = this.aegisguard_n - d3;
    double d7 = this.aegisguard_q + d1;
    double d8 = this.aegisguard_e + d2;
    double d9 = this.aegisguard_Q + d3;
    return new me.frep.aegisguard.spigot.aegisguard_Kh(d4, d5, d6, d7, d8, d9);
  }
  
  public static String spigot() {
    return b[0];
  }
  
  public static String nonce() {
    return b[1];
  }
  
  public static String resource() {
    return b[5];
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Kh aegisguard_V(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_Kh aegisguard_Kh = (me.frep.aegisguard.spigot.aegisguard_Kh)paramArrayOfObject[0];
    double d1 = Math.min(this.aegisguard_D, aegisguard_Kh.aegisguard_D);
    double d2 = Math.min(this.aegisguard_B, aegisguard_Kh.aegisguard_B);
    double d3 = Math.min(this.aegisguard_n, aegisguard_Kh.aegisguard_n);
    double d4 = Math.max(this.aegisguard_q, aegisguard_Kh.aegisguard_q);
    double d5 = Math.max(this.aegisguard_e, aegisguard_Kh.aegisguard_e);
    double d6 = Math.max(this.aegisguard_Q, aegisguard_Kh.aegisguard_Q);
    return new me.frep.aegisguard.spigot.aegisguard_Kh(d1, d2, d3, d4, d5, d6);
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_Kh aegisguard_Z(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue(), d4 = ((Double)paramArrayOfObject[3]).doubleValue(), d5 = ((Double)paramArrayOfObject[4]).doubleValue(), d6 = ((Double)paramArrayOfObject[5]).doubleValue(), d7 = Math.min(d1, d4);
    double d8 = Math.min(d2, d5);
    double d9 = Math.min(d3, d6);
    double d10 = Math.max(d1, d4);
    double d11 = Math.max(d2, d5);
    double d12 = Math.max(d3, d6);
    return new me.frep.aegisguard.spigot.aegisguard_Kh(d7, d8, d9, d10, d11, d12);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Kh aegisguard_J(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    return new me.frep.aegisguard.spigot.aegisguard_Kh(this.aegisguard_D + d1, this.aegisguard_B + d2, this.aegisguard_n + d3, this.aegisguard_q + d1, this.aegisguard_e + d2, this.aegisguard_Q + d3);
  }
  
  public double aegisguard_w(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_Kh
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_3
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast java/lang/Double
    //   24: invokevirtual doubleValue : ()D
    //   27: dstore #5
    //   29: pop
    //   30: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   33: lload_3
    //   34: lxor
    //   35: lstore_3
    //   36: invokestatic aegisguard_I : ()I
    //   39: istore #7
    //   41: aload_2
    //   42: getfield aegisguard_e : D
    //   45: iload #7
    //   47: ifeq -> 377
    //   50: aload_0
    //   51: getfield aegisguard_B : D
    //   54: dcmpl
    //   55: ifle -> 375
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: aload_2
    //   66: getfield aegisguard_B : D
    //   69: iload #7
    //   71: ifeq -> 377
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: aload_0
    //   82: getfield aegisguard_e : D
    //   85: dcmpg
    //   86: ifge -> 375
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: aload_2
    //   97: getfield aegisguard_Q : D
    //   100: iload #7
    //   102: ifeq -> 377
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: aload_0
    //   113: getfield aegisguard_n : D
    //   116: dcmpl
    //   117: ifle -> 375
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: aload_2
    //   128: getfield aegisguard_n : D
    //   131: iload #7
    //   133: ifeq -> 377
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   142: athrow
    //   143: aload_0
    //   144: getfield aegisguard_Q : D
    //   147: dcmpg
    //   148: ifge -> 375
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: dload #5
    //   160: dconst_0
    //   161: dcmpl
    //   162: iload #7
    //   164: ifeq -> 303
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: ifle -> 280
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload_2
    //   185: getfield aegisguard_q : D
    //   188: aload_0
    //   189: getfield aegisguard_D : D
    //   192: dcmpg
    //   193: lload_3
    //   194: lconst_0
    //   195: lcmp
    //   196: iflt -> 303
    //   199: iload #7
    //   201: ifeq -> 303
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: ifgt -> 280
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   220: athrow
    //   221: aload_0
    //   222: getfield aegisguard_D : D
    //   225: aload_2
    //   226: getfield aegisguard_q : D
    //   229: dsub
    //   230: dstore #8
    //   232: dload #8
    //   234: iload #7
    //   236: ifeq -> 267
    //   239: dload #5
    //   241: dcmpg
    //   242: lload_3
    //   243: lconst_0
    //   244: lcmp
    //   245: ifle -> 277
    //   248: ifge -> 269
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   257: athrow
    //   258: dload #8
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   266: athrow
    //   267: dstore #5
    //   269: lload_3
    //   270: lconst_0
    //   271: lcmp
    //   272: ifle -> 280
    //   275: iload #7
    //   277: ifne -> 372
    //   280: dload #5
    //   282: iload #7
    //   284: ifeq -> 374
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   293: athrow
    //   294: dconst_0
    //   295: dcmpg
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   302: athrow
    //   303: ifge -> 372
    //   306: aload_2
    //   307: getfield aegisguard_D : D
    //   310: iload #7
    //   312: ifeq -> 374
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   321: athrow
    //   322: aload_0
    //   323: getfield aegisguard_q : D
    //   326: dcmpl
    //   327: iflt -> 372
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   336: athrow
    //   337: aload_0
    //   338: getfield aegisguard_q : D
    //   341: aload_2
    //   342: getfield aegisguard_D : D
    //   345: dsub
    //   346: dstore #8
    //   348: dload #8
    //   350: iload #7
    //   352: ifeq -> 374
    //   355: dload #5
    //   357: dcmpl
    //   358: ifle -> 372
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   367: athrow
    //   368: dload #8
    //   370: dstore #5
    //   372: dload #5
    //   374: dreturn
    //   375: dload #5
    //   377: dreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #139	-> 41
    //   #141	-> 158
    //   #143	-> 221
    //   #145	-> 232
    //   #147	-> 258
    //   #149	-> 269
    //   #150	-> 280
    //   #152	-> 337
    //   #154	-> 348
    //   #156	-> 368
    //   #160	-> 372
    //   #164	-> 375
    // Exception table:
    //   from	to	target	type
    //   41	58	61	java/lang/RuntimeException
    //   50	74	77	java/lang/RuntimeException
    //   65	89	92	java/lang/RuntimeException
    //   81	105	108	java/lang/RuntimeException
    //   96	120	123	java/lang/RuntimeException
    //   112	136	139	java/lang/RuntimeException
    //   127	151	154	java/lang/RuntimeException
    //   143	167	170	java/lang/RuntimeException
    //   158	177	180	java/lang/RuntimeException
    //   174	204	207	java/lang/RuntimeException
    //   184	214	217	java/lang/RuntimeException
    //   232	251	254	java/lang/RuntimeException
    //   239	260	263	java/lang/RuntimeException
    //   269	287	290	java/lang/RuntimeException
    //   280	296	299	java/lang/RuntimeException
    //   303	315	318	java/lang/RuntimeException
    //   306	330	333	java/lang/RuntimeException
    //   348	361	364	java/lang/RuntimeException
  }
  
  public double aegisguard_g(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_Kh
    //   7: astore #6
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast java/lang/Double
    //   25: invokevirtual doubleValue : ()D
    //   28: dstore #4
    //   30: pop
    //   31: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   34: lload_2
    //   35: lxor
    //   36: lstore_2
    //   37: invokestatic aegisguard_I : ()I
    //   40: istore #7
    //   42: aload #6
    //   44: getfield aegisguard_q : D
    //   47: iload #7
    //   49: ifeq -> 386
    //   52: aload_0
    //   53: getfield aegisguard_D : D
    //   56: dcmpl
    //   57: ifle -> 384
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: aload #6
    //   69: getfield aegisguard_D : D
    //   72: iload #7
    //   74: ifeq -> 386
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload_0
    //   85: getfield aegisguard_q : D
    //   88: dcmpg
    //   89: ifge -> 384
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: aload #6
    //   101: getfield aegisguard_Q : D
    //   104: iload #7
    //   106: ifeq -> 386
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: aload_0
    //   117: getfield aegisguard_n : D
    //   120: dcmpl
    //   121: ifle -> 384
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload #6
    //   133: getfield aegisguard_n : D
    //   136: iload #7
    //   138: ifeq -> 386
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: aload_0
    //   149: getfield aegisguard_Q : D
    //   152: dcmpg
    //   153: ifge -> 384
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: dload #4
    //   165: dconst_0
    //   166: dcmpl
    //   167: iload #7
    //   169: ifeq -> 310
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: ifle -> 287
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: aload #6
    //   191: getfield aegisguard_e : D
    //   194: aload_0
    //   195: getfield aegisguard_B : D
    //   198: dcmpg
    //   199: lload_2
    //   200: lconst_0
    //   201: lcmp
    //   202: iflt -> 310
    //   205: iload #7
    //   207: ifeq -> 310
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: ifgt -> 287
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: aload_0
    //   228: getfield aegisguard_B : D
    //   231: aload #6
    //   233: getfield aegisguard_e : D
    //   236: dsub
    //   237: dstore #8
    //   239: dload #8
    //   241: iload #7
    //   243: ifeq -> 274
    //   246: dload #4
    //   248: dcmpg
    //   249: lload_2
    //   250: lconst_0
    //   251: lcmp
    //   252: ifle -> 284
    //   255: ifge -> 276
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   264: athrow
    //   265: dload #8
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   273: athrow
    //   274: dstore #4
    //   276: lload_2
    //   277: lconst_0
    //   278: lcmp
    //   279: iflt -> 287
    //   282: iload #7
    //   284: ifne -> 381
    //   287: dload #4
    //   289: iload #7
    //   291: ifeq -> 383
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   300: athrow
    //   301: dconst_0
    //   302: dcmpg
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   309: athrow
    //   310: ifge -> 381
    //   313: aload #6
    //   315: getfield aegisguard_B : D
    //   318: iload #7
    //   320: ifeq -> 383
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   329: athrow
    //   330: aload_0
    //   331: getfield aegisguard_e : D
    //   334: dcmpl
    //   335: iflt -> 381
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   344: athrow
    //   345: aload_0
    //   346: getfield aegisguard_e : D
    //   349: aload #6
    //   351: getfield aegisguard_B : D
    //   354: dsub
    //   355: dstore #8
    //   357: dload #8
    //   359: iload #7
    //   361: ifeq -> 383
    //   364: dload #4
    //   366: dcmpl
    //   367: ifle -> 381
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: dload #8
    //   379: dstore #4
    //   381: dload #4
    //   383: dreturn
    //   384: dload #4
    //   386: dreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #175	-> 42
    //   #177	-> 163
    //   #179	-> 227
    //   #181	-> 239
    //   #183	-> 265
    //   #185	-> 276
    //   #186	-> 287
    //   #188	-> 345
    //   #190	-> 357
    //   #192	-> 377
    //   #196	-> 381
    //   #200	-> 384
    // Exception table:
    //   from	to	target	type
    //   42	60	63	java/lang/RuntimeException
    //   52	77	80	java/lang/RuntimeException
    //   67	92	95	java/lang/RuntimeException
    //   84	109	112	java/lang/RuntimeException
    //   99	124	127	java/lang/RuntimeException
    //   116	141	144	java/lang/RuntimeException
    //   131	156	159	java/lang/RuntimeException
    //   148	172	175	java/lang/RuntimeException
    //   163	182	185	java/lang/RuntimeException
    //   179	210	213	java/lang/RuntimeException
    //   189	220	223	java/lang/RuntimeException
    //   239	258	261	java/lang/RuntimeException
    //   246	267	270	java/lang/RuntimeException
    //   276	294	297	java/lang/RuntimeException
    //   287	303	306	java/lang/RuntimeException
    //   310	323	326	java/lang/RuntimeException
    //   313	338	341	java/lang/RuntimeException
    //   357	370	373	java/lang/RuntimeException
  }
  
  public double aegisguard_W(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_Kh
    //   7: astore #6
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast java/lang/Double
    //   25: invokevirtual doubleValue : ()D
    //   28: dstore #4
    //   30: pop
    //   31: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   34: lload_2
    //   35: lxor
    //   36: lstore_2
    //   37: invokestatic aegisguard__ : ()I
    //   40: istore #7
    //   42: aload #6
    //   44: getfield aegisguard_q : D
    //   47: iload #7
    //   49: ifne -> 386
    //   52: aload_0
    //   53: getfield aegisguard_D : D
    //   56: dcmpl
    //   57: ifle -> 384
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: aload #6
    //   69: getfield aegisguard_D : D
    //   72: iload #7
    //   74: ifne -> 386
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload_0
    //   85: getfield aegisguard_q : D
    //   88: dcmpg
    //   89: ifge -> 384
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: aload #6
    //   101: getfield aegisguard_e : D
    //   104: iload #7
    //   106: ifne -> 386
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: aload_0
    //   117: getfield aegisguard_B : D
    //   120: dcmpl
    //   121: ifle -> 384
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload #6
    //   133: getfield aegisguard_B : D
    //   136: iload #7
    //   138: ifne -> 386
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: aload_0
    //   149: getfield aegisguard_e : D
    //   152: dcmpg
    //   153: ifge -> 384
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: dload #4
    //   165: dconst_0
    //   166: dcmpl
    //   167: iload #7
    //   169: ifne -> 310
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: ifle -> 287
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: aload #6
    //   191: getfield aegisguard_Q : D
    //   194: aload_0
    //   195: getfield aegisguard_n : D
    //   198: dcmpg
    //   199: lload_2
    //   200: lconst_0
    //   201: lcmp
    //   202: ifle -> 310
    //   205: iload #7
    //   207: ifne -> 310
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: ifgt -> 287
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: aload_0
    //   228: getfield aegisguard_n : D
    //   231: aload #6
    //   233: getfield aegisguard_Q : D
    //   236: dsub
    //   237: dstore #8
    //   239: dload #8
    //   241: iload #7
    //   243: ifne -> 274
    //   246: dload #4
    //   248: dcmpg
    //   249: lload_2
    //   250: lconst_0
    //   251: lcmp
    //   252: ifle -> 284
    //   255: ifge -> 276
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   264: athrow
    //   265: dload #8
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   273: athrow
    //   274: dstore #4
    //   276: lload_2
    //   277: lconst_0
    //   278: lcmp
    //   279: ifle -> 287
    //   282: iload #7
    //   284: ifeq -> 381
    //   287: dload #4
    //   289: iload #7
    //   291: ifne -> 383
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   300: athrow
    //   301: dconst_0
    //   302: dcmpg
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   309: athrow
    //   310: ifge -> 381
    //   313: aload #6
    //   315: getfield aegisguard_n : D
    //   318: iload #7
    //   320: ifne -> 383
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   329: athrow
    //   330: aload_0
    //   331: getfield aegisguard_Q : D
    //   334: dcmpl
    //   335: iflt -> 381
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   344: athrow
    //   345: aload_0
    //   346: getfield aegisguard_Q : D
    //   349: aload #6
    //   351: getfield aegisguard_n : D
    //   354: dsub
    //   355: dstore #8
    //   357: dload #8
    //   359: iload #7
    //   361: ifne -> 383
    //   364: dload #4
    //   366: dcmpl
    //   367: ifle -> 381
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: dload #8
    //   379: dstore #4
    //   381: dload #4
    //   383: dreturn
    //   384: dload #4
    //   386: dreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #211	-> 42
    //   #213	-> 163
    //   #215	-> 227
    //   #217	-> 239
    //   #219	-> 265
    //   #221	-> 276
    //   #222	-> 287
    //   #224	-> 345
    //   #226	-> 357
    //   #228	-> 377
    //   #232	-> 381
    //   #236	-> 384
    // Exception table:
    //   from	to	target	type
    //   42	60	63	java/lang/RuntimeException
    //   52	77	80	java/lang/RuntimeException
    //   67	92	95	java/lang/RuntimeException
    //   84	109	112	java/lang/RuntimeException
    //   99	124	127	java/lang/RuntimeException
    //   116	141	144	java/lang/RuntimeException
    //   131	156	159	java/lang/RuntimeException
    //   148	172	175	java/lang/RuntimeException
    //   163	182	185	java/lang/RuntimeException
    //   179	210	213	java/lang/RuntimeException
    //   189	220	223	java/lang/RuntimeException
    //   239	258	261	java/lang/RuntimeException
    //   246	267	270	java/lang/RuntimeException
    //   276	294	297	java/lang/RuntimeException
    //   287	303	306	java/lang/RuntimeException
    //   310	323	326	java/lang/RuntimeException
    //   313	338	341	java/lang/RuntimeException
    //   357	370	373	java/lang/RuntimeException
  }
  
  public boolean aegisguard_R(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_Kh
    //   17: astore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic aegisguard__ : ()I
    //   28: istore #5
    //   30: aload_2
    //   31: getfield aegisguard_q : D
    //   34: aload_0
    //   35: getfield aegisguard_D : D
    //   38: dcmpl
    //   39: iload #5
    //   41: ifne -> 70
    //   44: ifle -> 231
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   53: athrow
    //   54: aload_2
    //   55: getfield aegisguard_D : D
    //   58: aload_0
    //   59: getfield aegisguard_q : D
    //   62: dcmpg
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: iload #5
    //   72: lload_3
    //   73: lconst_0
    //   74: lcmp
    //   75: ifle -> 109
    //   78: ifne -> 107
    //   81: ifge -> 231
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: aload_2
    //   92: getfield aegisguard_e : D
    //   95: aload_0
    //   96: getfield aegisguard_B : D
    //   99: dcmpl
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: iload #5
    //   109: ifne -> 228
    //   112: ifle -> 227
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload_2
    //   123: getfield aegisguard_B : D
    //   126: aload_0
    //   127: getfield aegisguard_e : D
    //   130: dcmpg
    //   131: iload #5
    //   133: ifne -> 228
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   142: athrow
    //   143: ifge -> 227
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: aload_2
    //   154: getfield aegisguard_Q : D
    //   157: aload_0
    //   158: getfield aegisguard_n : D
    //   161: dcmpl
    //   162: iload #5
    //   164: ifne -> 224
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: ifle -> 223
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload_2
    //   185: getfield aegisguard_n : D
    //   188: aload_0
    //   189: getfield aegisguard_Q : D
    //   192: dcmpg
    //   193: iload #5
    //   195: ifne -> 224
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   204: athrow
    //   205: ifge -> 223
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: iconst_1
    //   216: goto -> 232
    //   219: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   222: athrow
    //   223: iconst_0
    //   224: goto -> 232
    //   227: iconst_0
    //   228: goto -> 232
    //   231: iconst_0
    //   232: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #245	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	47	50	java/lang/RuntimeException
    //   44	63	66	java/lang/RuntimeException
    //   70	84	87	java/lang/RuntimeException
    //   81	100	103	java/lang/RuntimeException
    //   107	115	118	java/lang/RuntimeException
    //   112	136	139	java/lang/RuntimeException
    //   122	146	149	java/lang/RuntimeException
    //   143	167	170	java/lang/RuntimeException
    //   153	177	180	java/lang/RuntimeException
    //   174	198	201	java/lang/RuntimeException
    //   184	208	211	java/lang/RuntimeException
    //   205	219	219	java/lang/RuntimeException
  }
  
  public boolean aegisguard_d(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_m
    //   17: astore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic aegisguard__ : ()I
    //   28: istore #5
    //   30: aload_2
    //   31: getfield aegisguard_p : D
    //   34: aload_0
    //   35: getfield aegisguard_D : D
    //   38: dcmpl
    //   39: iload #5
    //   41: ifne -> 70
    //   44: ifle -> 231
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   53: athrow
    //   54: aload_2
    //   55: getfield aegisguard_p : D
    //   58: aload_0
    //   59: getfield aegisguard_q : D
    //   62: dcmpg
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: iload #5
    //   72: lload_3
    //   73: lconst_0
    //   74: lcmp
    //   75: iflt -> 109
    //   78: ifne -> 107
    //   81: ifge -> 231
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: aload_2
    //   92: getfield aegisguard_x : D
    //   95: aload_0
    //   96: getfield aegisguard_B : D
    //   99: dcmpl
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: iload #5
    //   109: ifne -> 228
    //   112: ifle -> 227
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload_2
    //   123: getfield aegisguard_x : D
    //   126: aload_0
    //   127: getfield aegisguard_e : D
    //   130: dcmpg
    //   131: iload #5
    //   133: ifne -> 228
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   142: athrow
    //   143: ifge -> 227
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: aload_2
    //   154: getfield aegisguard_G : D
    //   157: aload_0
    //   158: getfield aegisguard_n : D
    //   161: dcmpl
    //   162: iload #5
    //   164: ifne -> 224
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: ifle -> 223
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload_2
    //   185: getfield aegisguard_G : D
    //   188: aload_0
    //   189: getfield aegisguard_Q : D
    //   192: dcmpg
    //   193: iload #5
    //   195: ifne -> 224
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   204: athrow
    //   205: ifge -> 223
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: iconst_1
    //   216: goto -> 232
    //   219: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   222: athrow
    //   223: iconst_0
    //   224: goto -> 232
    //   227: iconst_0
    //   228: goto -> 232
    //   231: iconst_0
    //   232: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #253	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	47	50	java/lang/RuntimeException
    //   44	63	66	java/lang/RuntimeException
    //   70	84	87	java/lang/RuntimeException
    //   81	100	103	java/lang/RuntimeException
    //   107	115	118	java/lang/RuntimeException
    //   112	136	139	java/lang/RuntimeException
    //   122	146	149	java/lang/RuntimeException
    //   143	167	170	java/lang/RuntimeException
    //   153	177	180	java/lang/RuntimeException
    //   174	198	201	java/lang/RuntimeException
    //   184	208	211	java/lang/RuntimeException
    //   205	219	219	java/lang/RuntimeException
  }
  
  public double aegisguard_I(Object[] paramArrayOfObject) {
    double d1 = this.aegisguard_q - this.aegisguard_D;
    double d2 = this.aegisguard_e - this.aegisguard_B;
    double d3 = this.aegisguard_Q - this.aegisguard_n;
    return (d1 + d2 + d3) / 3.0D;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Kh aegisguard_C(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue(), d4 = this.aegisguard_D + d1;
    double d5 = this.aegisguard_B + d2;
    double d6 = this.aegisguard_n + d3;
    double d7 = this.aegisguard_q - d1;
    double d8 = this.aegisguard_e - d2;
    double d9 = this.aegisguard_Q - d3;
    return new me.frep.aegisguard.spigot.aegisguard_Kh(d4, d5, d6, d7, d8, d9);
  }
  
  public aegisguard_r aegisguard_d(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_m
    //   17: astore #5
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast me/frep/aegisguard/spigot/aegisguard_m
    //   25: astore_2
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   30: lload_3
    //   31: lxor
    //   32: lstore_3
    //   33: lload_3
    //   34: dup2
    //   35: ldc2_w 22321900837640
    //   38: lxor
    //   39: lstore #6
    //   41: dup2
    //   42: ldc2_w 134374535872524
    //   45: lxor
    //   46: lstore #8
    //   48: dup2
    //   49: ldc2_w 74401131738665
    //   52: lxor
    //   53: lstore #10
    //   55: dup2
    //   56: ldc2_w 136366501004564
    //   59: lxor
    //   60: lstore #12
    //   62: dup2
    //   63: ldc2_w 112219910574981
    //   66: lxor
    //   67: lstore #14
    //   69: dup2
    //   70: ldc2_w 3820999609665
    //   73: lxor
    //   74: lstore #16
    //   76: pop2
    //   77: invokestatic aegisguard_I : ()I
    //   80: aload #5
    //   82: lload #8
    //   84: aload_2
    //   85: aload_0
    //   86: getfield aegisguard_D : D
    //   89: iconst_3
    //   90: anewarray java/lang/Object
    //   93: dup_x2
    //   94: dup_x2
    //   95: pop
    //   96: invokestatic valueOf : (D)Ljava/lang/Double;
    //   99: iconst_2
    //   100: swap
    //   101: aastore
    //   102: dup_x1
    //   103: swap
    //   104: iconst_1
    //   105: swap
    //   106: aastore
    //   107: dup_x2
    //   108: dup_x2
    //   109: pop
    //   110: invokestatic valueOf : (J)Ljava/lang/Long;
    //   113: iconst_0
    //   114: swap
    //   115: aastore
    //   116: invokevirtual aegisguard_I : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_m;
    //   119: astore #19
    //   121: aload #5
    //   123: lload #8
    //   125: aload_2
    //   126: aload_0
    //   127: getfield aegisguard_q : D
    //   130: iconst_3
    //   131: anewarray java/lang/Object
    //   134: dup_x2
    //   135: dup_x2
    //   136: pop
    //   137: invokestatic valueOf : (D)Ljava/lang/Double;
    //   140: iconst_2
    //   141: swap
    //   142: aastore
    //   143: dup_x1
    //   144: swap
    //   145: iconst_1
    //   146: swap
    //   147: aastore
    //   148: dup_x2
    //   149: dup_x2
    //   150: pop
    //   151: invokestatic valueOf : (J)Ljava/lang/Long;
    //   154: iconst_0
    //   155: swap
    //   156: aastore
    //   157: invokevirtual aegisguard_I : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_m;
    //   160: astore #20
    //   162: istore #18
    //   164: aload #5
    //   166: aload_2
    //   167: aload_0
    //   168: getfield aegisguard_B : D
    //   171: lload #10
    //   173: dup2_x2
    //   174: pop2
    //   175: iconst_3
    //   176: anewarray java/lang/Object
    //   179: dup_x2
    //   180: dup_x2
    //   181: pop
    //   182: invokestatic valueOf : (D)Ljava/lang/Double;
    //   185: iconst_2
    //   186: swap
    //   187: aastore
    //   188: dup_x2
    //   189: dup_x2
    //   190: pop
    //   191: invokestatic valueOf : (J)Ljava/lang/Long;
    //   194: iconst_1
    //   195: swap
    //   196: aastore
    //   197: dup_x1
    //   198: swap
    //   199: iconst_0
    //   200: swap
    //   201: aastore
    //   202: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_m;
    //   205: astore #21
    //   207: aload #5
    //   209: aload_2
    //   210: aload_0
    //   211: getfield aegisguard_e : D
    //   214: lload #10
    //   216: dup2_x2
    //   217: pop2
    //   218: iconst_3
    //   219: anewarray java/lang/Object
    //   222: dup_x2
    //   223: dup_x2
    //   224: pop
    //   225: invokestatic valueOf : (D)Ljava/lang/Double;
    //   228: iconst_2
    //   229: swap
    //   230: aastore
    //   231: dup_x2
    //   232: dup_x2
    //   233: pop
    //   234: invokestatic valueOf : (J)Ljava/lang/Long;
    //   237: iconst_1
    //   238: swap
    //   239: aastore
    //   240: dup_x1
    //   241: swap
    //   242: iconst_0
    //   243: swap
    //   244: aastore
    //   245: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_m;
    //   248: astore #22
    //   250: aload #5
    //   252: lload #12
    //   254: aload_2
    //   255: aload_0
    //   256: getfield aegisguard_n : D
    //   259: iconst_3
    //   260: anewarray java/lang/Object
    //   263: dup_x2
    //   264: dup_x2
    //   265: pop
    //   266: invokestatic valueOf : (D)Ljava/lang/Double;
    //   269: iconst_2
    //   270: swap
    //   271: aastore
    //   272: dup_x1
    //   273: swap
    //   274: iconst_1
    //   275: swap
    //   276: aastore
    //   277: dup_x2
    //   278: dup_x2
    //   279: pop
    //   280: invokestatic valueOf : (J)Ljava/lang/Long;
    //   283: iconst_0
    //   284: swap
    //   285: aastore
    //   286: invokevirtual aegisguard_c : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_m;
    //   289: astore #23
    //   291: aload #5
    //   293: lload #12
    //   295: aload_2
    //   296: aload_0
    //   297: getfield aegisguard_Q : D
    //   300: iconst_3
    //   301: anewarray java/lang/Object
    //   304: dup_x2
    //   305: dup_x2
    //   306: pop
    //   307: invokestatic valueOf : (D)Ljava/lang/Double;
    //   310: iconst_2
    //   311: swap
    //   312: aastore
    //   313: dup_x1
    //   314: swap
    //   315: iconst_1
    //   316: swap
    //   317: aastore
    //   318: dup_x2
    //   319: dup_x2
    //   320: pop
    //   321: invokestatic valueOf : (J)Ljava/lang/Long;
    //   324: iconst_0
    //   325: swap
    //   326: aastore
    //   327: invokevirtual aegisguard_c : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_m;
    //   330: astore #24
    //   332: aload_0
    //   333: lload #14
    //   335: aload #19
    //   337: iconst_2
    //   338: anewarray java/lang/Object
    //   341: dup_x1
    //   342: swap
    //   343: iconst_1
    //   344: swap
    //   345: aastore
    //   346: dup_x2
    //   347: dup_x2
    //   348: pop
    //   349: invokestatic valueOf : (J)Ljava/lang/Long;
    //   352: iconst_0
    //   353: swap
    //   354: aastore
    //   355: invokespecial aegisguard_p : ([Ljava/lang/Object;)Z
    //   358: iload #18
    //   360: ifeq -> 402
    //   363: ifne -> 376
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   372: athrow
    //   373: aconst_null
    //   374: astore #19
    //   376: aload_0
    //   377: lload #14
    //   379: aload #20
    //   381: iconst_2
    //   382: anewarray java/lang/Object
    //   385: dup_x1
    //   386: swap
    //   387: iconst_1
    //   388: swap
    //   389: aastore
    //   390: dup_x2
    //   391: dup_x2
    //   392: pop
    //   393: invokestatic valueOf : (J)Ljava/lang/Long;
    //   396: iconst_0
    //   397: swap
    //   398: aastore
    //   399: invokespecial aegisguard_p : ([Ljava/lang/Object;)Z
    //   402: iload #18
    //   404: lload_3
    //   405: lconst_0
    //   406: lcmp
    //   407: ifle -> 454
    //   410: ifeq -> 452
    //   413: ifne -> 426
    //   416: goto -> 423
    //   419: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   422: athrow
    //   423: aconst_null
    //   424: astore #20
    //   426: aload_0
    //   427: lload #16
    //   429: aload #21
    //   431: iconst_2
    //   432: anewarray java/lang/Object
    //   435: dup_x1
    //   436: swap
    //   437: iconst_1
    //   438: swap
    //   439: aastore
    //   440: dup_x2
    //   441: dup_x2
    //   442: pop
    //   443: invokestatic valueOf : (J)Ljava/lang/Long;
    //   446: iconst_0
    //   447: swap
    //   448: aastore
    //   449: invokespecial aegisguard_e : ([Ljava/lang/Object;)Z
    //   452: iload #18
    //   454: lload_3
    //   455: lconst_0
    //   456: lcmp
    //   457: iflt -> 504
    //   460: ifeq -> 502
    //   463: ifne -> 476
    //   466: goto -> 473
    //   469: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   472: athrow
    //   473: aconst_null
    //   474: astore #21
    //   476: aload_0
    //   477: lload #16
    //   479: aload #22
    //   481: iconst_2
    //   482: anewarray java/lang/Object
    //   485: dup_x1
    //   486: swap
    //   487: iconst_1
    //   488: swap
    //   489: aastore
    //   490: dup_x2
    //   491: dup_x2
    //   492: pop
    //   493: invokestatic valueOf : (J)Ljava/lang/Long;
    //   496: iconst_0
    //   497: swap
    //   498: aastore
    //   499: invokespecial aegisguard_e : ([Ljava/lang/Object;)Z
    //   502: iload #18
    //   504: lload_3
    //   505: lconst_0
    //   506: lcmp
    //   507: iflt -> 554
    //   510: ifeq -> 552
    //   513: ifne -> 526
    //   516: goto -> 523
    //   519: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   522: athrow
    //   523: aconst_null
    //   524: astore #22
    //   526: aload_0
    //   527: aload #23
    //   529: lload #6
    //   531: iconst_2
    //   532: anewarray java/lang/Object
    //   535: dup_x2
    //   536: dup_x2
    //   537: pop
    //   538: invokestatic valueOf : (J)Ljava/lang/Long;
    //   541: iconst_1
    //   542: swap
    //   543: aastore
    //   544: dup_x1
    //   545: swap
    //   546: iconst_0
    //   547: swap
    //   548: aastore
    //   549: invokespecial aegisguard_N : ([Ljava/lang/Object;)Z
    //   552: iload #18
    //   554: ifeq -> 596
    //   557: ifne -> 570
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   566: athrow
    //   567: aconst_null
    //   568: astore #23
    //   570: aload_0
    //   571: aload #24
    //   573: lload #6
    //   575: iconst_2
    //   576: anewarray java/lang/Object
    //   579: dup_x2
    //   580: dup_x2
    //   581: pop
    //   582: invokestatic valueOf : (J)Ljava/lang/Long;
    //   585: iconst_1
    //   586: swap
    //   587: aastore
    //   588: dup_x1
    //   589: swap
    //   590: iconst_0
    //   591: swap
    //   592: aastore
    //   593: invokespecial aegisguard_N : ([Ljava/lang/Object;)Z
    //   596: ifne -> 602
    //   599: aconst_null
    //   600: astore #24
    //   602: aconst_null
    //   603: astore #25
    //   605: aload #19
    //   607: iload #18
    //   609: ifeq -> 624
    //   612: ifnull -> 626
    //   615: goto -> 622
    //   618: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   621: athrow
    //   622: aload #19
    //   624: astore #25
    //   626: aload #20
    //   628: iload #18
    //   630: ifeq -> 747
    //   633: ifnull -> 745
    //   636: goto -> 643
    //   639: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   642: athrow
    //   643: aload #25
    //   645: iload #18
    //   647: ifeq -> 743
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   656: athrow
    //   657: lload_3
    //   658: lconst_0
    //   659: lcmp
    //   660: iflt -> 736
    //   663: ifnull -> 734
    //   666: goto -> 673
    //   669: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   672: athrow
    //   673: aload #5
    //   675: iload #18
    //   677: lload_3
    //   678: lconst_0
    //   679: lcmp
    //   680: iflt -> 749
    //   683: ifeq -> 747
    //   686: goto -> 693
    //   689: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   692: athrow
    //   693: aload #20
    //   695: iconst_1
    //   696: anewarray java/lang/Object
    //   699: dup_x1
    //   700: swap
    //   701: iconst_0
    //   702: swap
    //   703: aastore
    //   704: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   707: aload #5
    //   709: aload #25
    //   711: iconst_1
    //   712: anewarray java/lang/Object
    //   715: dup_x1
    //   716: swap
    //   717: iconst_0
    //   718: swap
    //   719: aastore
    //   720: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   723: dcmpg
    //   724: ifge -> 745
    //   727: goto -> 734
    //   730: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   733: athrow
    //   734: aload #20
    //   736: goto -> 743
    //   739: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   742: athrow
    //   743: astore #25
    //   745: aload #21
    //   747: iload #18
    //   749: ifeq -> 866
    //   752: ifnull -> 864
    //   755: goto -> 762
    //   758: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   761: athrow
    //   762: aload #25
    //   764: iload #18
    //   766: ifeq -> 862
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   775: athrow
    //   776: lload_3
    //   777: lconst_0
    //   778: lcmp
    //   779: ifle -> 855
    //   782: ifnull -> 853
    //   785: goto -> 792
    //   788: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   791: athrow
    //   792: aload #5
    //   794: iload #18
    //   796: lload_3
    //   797: lconst_0
    //   798: lcmp
    //   799: iflt -> 868
    //   802: ifeq -> 866
    //   805: goto -> 812
    //   808: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   811: athrow
    //   812: aload #21
    //   814: iconst_1
    //   815: anewarray java/lang/Object
    //   818: dup_x1
    //   819: swap
    //   820: iconst_0
    //   821: swap
    //   822: aastore
    //   823: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   826: aload #5
    //   828: aload #25
    //   830: iconst_1
    //   831: anewarray java/lang/Object
    //   834: dup_x1
    //   835: swap
    //   836: iconst_0
    //   837: swap
    //   838: aastore
    //   839: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   842: dcmpg
    //   843: ifge -> 864
    //   846: goto -> 853
    //   849: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   852: athrow
    //   853: aload #21
    //   855: goto -> 862
    //   858: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   861: athrow
    //   862: astore #25
    //   864: aload #22
    //   866: iload #18
    //   868: ifeq -> 985
    //   871: ifnull -> 983
    //   874: goto -> 881
    //   877: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   880: athrow
    //   881: aload #25
    //   883: iload #18
    //   885: ifeq -> 981
    //   888: goto -> 895
    //   891: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   894: athrow
    //   895: lload_3
    //   896: lconst_0
    //   897: lcmp
    //   898: iflt -> 974
    //   901: ifnull -> 972
    //   904: goto -> 911
    //   907: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   910: athrow
    //   911: aload #5
    //   913: iload #18
    //   915: lload_3
    //   916: lconst_0
    //   917: lcmp
    //   918: iflt -> 987
    //   921: ifeq -> 985
    //   924: goto -> 931
    //   927: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   930: athrow
    //   931: aload #22
    //   933: iconst_1
    //   934: anewarray java/lang/Object
    //   937: dup_x1
    //   938: swap
    //   939: iconst_0
    //   940: swap
    //   941: aastore
    //   942: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   945: aload #5
    //   947: aload #25
    //   949: iconst_1
    //   950: anewarray java/lang/Object
    //   953: dup_x1
    //   954: swap
    //   955: iconst_0
    //   956: swap
    //   957: aastore
    //   958: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   961: dcmpg
    //   962: ifge -> 983
    //   965: goto -> 972
    //   968: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   971: athrow
    //   972: aload #22
    //   974: goto -> 981
    //   977: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   980: athrow
    //   981: astore #25
    //   983: aload #23
    //   985: iload #18
    //   987: ifeq -> 1104
    //   990: ifnull -> 1102
    //   993: goto -> 1000
    //   996: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   999: athrow
    //   1000: aload #25
    //   1002: iload #18
    //   1004: ifeq -> 1100
    //   1007: goto -> 1014
    //   1010: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1013: athrow
    //   1014: lload_3
    //   1015: lconst_0
    //   1016: lcmp
    //   1017: iflt -> 1093
    //   1020: ifnull -> 1091
    //   1023: goto -> 1030
    //   1026: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1029: athrow
    //   1030: aload #5
    //   1032: iload #18
    //   1034: lload_3
    //   1035: lconst_0
    //   1036: lcmp
    //   1037: iflt -> 1106
    //   1040: ifeq -> 1104
    //   1043: goto -> 1050
    //   1046: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1049: athrow
    //   1050: aload #23
    //   1052: iconst_1
    //   1053: anewarray java/lang/Object
    //   1056: dup_x1
    //   1057: swap
    //   1058: iconst_0
    //   1059: swap
    //   1060: aastore
    //   1061: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   1064: aload #5
    //   1066: aload #25
    //   1068: iconst_1
    //   1069: anewarray java/lang/Object
    //   1072: dup_x1
    //   1073: swap
    //   1074: iconst_0
    //   1075: swap
    //   1076: aastore
    //   1077: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   1080: dcmpg
    //   1081: ifge -> 1102
    //   1084: goto -> 1091
    //   1087: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1090: athrow
    //   1091: aload #23
    //   1093: goto -> 1100
    //   1096: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1099: athrow
    //   1100: astore #25
    //   1102: aload #24
    //   1104: iload #18
    //   1106: ifeq -> 1223
    //   1109: ifnull -> 1221
    //   1112: goto -> 1119
    //   1115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1118: athrow
    //   1119: aload #25
    //   1121: iload #18
    //   1123: ifeq -> 1219
    //   1126: goto -> 1133
    //   1129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1132: athrow
    //   1133: lload_3
    //   1134: lconst_0
    //   1135: lcmp
    //   1136: ifle -> 1212
    //   1139: ifnull -> 1210
    //   1142: goto -> 1149
    //   1145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1148: athrow
    //   1149: aload #5
    //   1151: lload_3
    //   1152: lconst_0
    //   1153: lcmp
    //   1154: ifle -> 1223
    //   1157: iload #18
    //   1159: ifeq -> 1223
    //   1162: goto -> 1169
    //   1165: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1168: athrow
    //   1169: aload #24
    //   1171: iconst_1
    //   1172: anewarray java/lang/Object
    //   1175: dup_x1
    //   1176: swap
    //   1177: iconst_0
    //   1178: swap
    //   1179: aastore
    //   1180: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   1183: aload #5
    //   1185: aload #25
    //   1187: iconst_1
    //   1188: anewarray java/lang/Object
    //   1191: dup_x1
    //   1192: swap
    //   1193: iconst_0
    //   1194: swap
    //   1195: aastore
    //   1196: invokevirtual aegisguard_e : ([Ljava/lang/Object;)D
    //   1199: dcmpg
    //   1200: ifge -> 1221
    //   1203: goto -> 1210
    //   1206: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1209: athrow
    //   1210: aload #24
    //   1212: goto -> 1219
    //   1215: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1218: athrow
    //   1219: astore #25
    //   1221: aload #25
    //   1223: ifnonnull -> 1232
    //   1226: aconst_null
    //   1227: areturn
    //   1228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1231: athrow
    //   1232: aconst_null
    //   1233: astore #26
    //   1235: aload #25
    //   1237: aload #19
    //   1239: iload #18
    //   1241: lload_3
    //   1242: lconst_0
    //   1243: lcmp
    //   1244: ifle -> 1274
    //   1247: ifeq -> 1272
    //   1250: if_acmpne -> 1268
    //   1253: goto -> 1260
    //   1256: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1259: athrow
    //   1260: getstatic me/frep/aegisguard/spigot/aegisguard_hq.WEST : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1263: astore #26
    //   1265: goto -> 1381
    //   1268: aload #25
    //   1270: aload #20
    //   1272: iload #18
    //   1274: lload_3
    //   1275: lconst_0
    //   1276: lcmp
    //   1277: iflt -> 1307
    //   1280: ifeq -> 1305
    //   1283: if_acmpne -> 1301
    //   1286: goto -> 1293
    //   1289: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1292: athrow
    //   1293: getstatic me/frep/aegisguard/spigot/aegisguard_hq.EAST : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1296: astore #26
    //   1298: goto -> 1381
    //   1301: aload #25
    //   1303: aload #21
    //   1305: iload #18
    //   1307: lload_3
    //   1308: lconst_0
    //   1309: lcmp
    //   1310: ifle -> 1340
    //   1313: ifeq -> 1338
    //   1316: if_acmpne -> 1334
    //   1319: goto -> 1326
    //   1322: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1325: athrow
    //   1326: getstatic me/frep/aegisguard/spigot/aegisguard_hq.DOWN : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1329: astore #26
    //   1331: goto -> 1381
    //   1334: aload #25
    //   1336: aload #22
    //   1338: iload #18
    //   1340: ifeq -> 1365
    //   1343: if_acmpne -> 1361
    //   1346: goto -> 1353
    //   1349: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1352: athrow
    //   1353: getstatic me/frep/aegisguard/spigot/aegisguard_hq.UP : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1356: astore #26
    //   1358: goto -> 1381
    //   1361: aload #25
    //   1363: aload #23
    //   1365: if_acmpne -> 1376
    //   1368: getstatic me/frep/aegisguard/spigot/aegisguard_hq.NORTH : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1371: astore #26
    //   1373: goto -> 1381
    //   1376: getstatic me/frep/aegisguard/spigot/aegisguard_hq.SOUTH : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   1379: astore #26
    //   1381: new me/frep/aegisguard/spigot/aegisguard_r
    //   1384: dup
    //   1385: aload #25
    //   1387: aload #26
    //   1389: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_m;Lme/frep/aegisguard/spigot/aegisguard_hq;)V
    //   1392: iload #18
    //   1394: lload_3
    //   1395: lconst_0
    //   1396: lcmp
    //   1397: iflt -> 1404
    //   1400: ifne -> 1417
    //   1403: iconst_2
    //   1404: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   1407: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   1410: goto -> 1417
    //   1413: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1416: athrow
    //   1417: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #283	-> 80
    //   #284	-> 121
    //   #285	-> 164
    //   #286	-> 207
    //   #287	-> 250
    //   #288	-> 291
    //   #290	-> 332
    //   #292	-> 373
    //   #295	-> 376
    //   #297	-> 423
    //   #300	-> 426
    //   #302	-> 473
    //   #305	-> 476
    //   #307	-> 523
    //   #310	-> 526
    //   #312	-> 567
    //   #315	-> 570
    //   #317	-> 599
    //   #320	-> 602
    //   #322	-> 605
    //   #324	-> 622
    //   #327	-> 626
    //   #329	-> 734
    //   #332	-> 745
    //   #334	-> 853
    //   #337	-> 864
    //   #339	-> 972
    //   #342	-> 983
    //   #344	-> 1091
    //   #347	-> 1102
    //   #349	-> 1210
    //   #352	-> 1221
    //   #354	-> 1226
    //   #358	-> 1232
    //   #360	-> 1235
    //   #362	-> 1260
    //   #364	-> 1268
    //   #366	-> 1293
    //   #368	-> 1301
    //   #370	-> 1326
    //   #372	-> 1334
    //   #374	-> 1353
    //   #376	-> 1361
    //   #378	-> 1368
    //   #382	-> 1376
    //   #385	-> 1381
    // Exception table:
    //   from	to	target	type
    //   332	366	369	java/lang/RuntimeException
    //   402	416	419	java/lang/RuntimeException
    //   452	466	469	java/lang/RuntimeException
    //   502	516	519	java/lang/RuntimeException
    //   552	560	563	java/lang/RuntimeException
    //   605	615	618	java/lang/RuntimeException
    //   626	636	639	java/lang/RuntimeException
    //   633	650	653	java/lang/RuntimeException
    //   643	666	669	java/lang/RuntimeException
    //   657	686	689	java/lang/RuntimeException
    //   673	727	730	java/lang/RuntimeException
    //   693	736	739	java/lang/RuntimeException
    //   747	755	758	java/lang/RuntimeException
    //   752	769	772	java/lang/RuntimeException
    //   762	785	788	java/lang/RuntimeException
    //   776	805	808	java/lang/RuntimeException
    //   792	846	849	java/lang/RuntimeException
    //   812	855	858	java/lang/RuntimeException
    //   866	874	877	java/lang/RuntimeException
    //   871	888	891	java/lang/RuntimeException
    //   881	904	907	java/lang/RuntimeException
    //   895	924	927	java/lang/RuntimeException
    //   911	965	968	java/lang/RuntimeException
    //   931	974	977	java/lang/RuntimeException
    //   985	993	996	java/lang/RuntimeException
    //   990	1007	1010	java/lang/RuntimeException
    //   1000	1023	1026	java/lang/RuntimeException
    //   1014	1043	1046	java/lang/RuntimeException
    //   1030	1084	1087	java/lang/RuntimeException
    //   1050	1093	1096	java/lang/RuntimeException
    //   1104	1112	1115	java/lang/RuntimeException
    //   1109	1126	1129	java/lang/RuntimeException
    //   1119	1142	1145	java/lang/RuntimeException
    //   1133	1162	1165	java/lang/RuntimeException
    //   1149	1203	1206	java/lang/RuntimeException
    //   1169	1212	1215	java/lang/RuntimeException
    //   1223	1228	1228	java/lang/RuntimeException
    //   1235	1253	1256	java/lang/RuntimeException
    //   1272	1286	1289	java/lang/RuntimeException
    //   1305	1319	1322	java/lang/RuntimeException
    //   1338	1346	1349	java/lang/RuntimeException
    //   1381	1410	1413	java/lang/RuntimeException
  }
  
  private boolean aegisguard_p(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_m
    //   17: astore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic aegisguard__ : ()I
    //   28: istore #5
    //   30: aload_2
    //   31: iload #5
    //   33: ifne -> 55
    //   36: ifnonnull -> 54
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   45: athrow
    //   46: iconst_0
    //   47: goto -> 194
    //   50: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   53: athrow
    //   54: aload_2
    //   55: getfield aegisguard_x : D
    //   58: aload_0
    //   59: getfield aegisguard_B : D
    //   62: dcmpl
    //   63: iload #5
    //   65: lload_3
    //   66: lconst_0
    //   67: lcmp
    //   68: ifle -> 102
    //   71: ifne -> 100
    //   74: iflt -> 193
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload_2
    //   85: getfield aegisguard_x : D
    //   88: aload_0
    //   89: getfield aegisguard_e : D
    //   92: dcmpg
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: iload #5
    //   102: lload_3
    //   103: lconst_0
    //   104: lcmp
    //   105: ifle -> 139
    //   108: ifne -> 137
    //   111: ifgt -> 193
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: aload_2
    //   122: getfield aegisguard_G : D
    //   125: aload_0
    //   126: getfield aegisguard_n : D
    //   129: dcmpl
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   136: athrow
    //   137: iload #5
    //   139: lload_3
    //   140: lconst_0
    //   141: lcmp
    //   142: iflt -> 176
    //   145: ifne -> 174
    //   148: iflt -> 193
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: aload_2
    //   159: getfield aegisguard_G : D
    //   162: aload_0
    //   163: getfield aegisguard_Q : D
    //   166: dcmpg
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: iload #5
    //   176: ifne -> 190
    //   179: ifgt -> 193
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: iconst_1
    //   190: goto -> 194
    //   193: iconst_0
    //   194: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #394	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	39	42	java/lang/RuntimeException
    //   36	50	50	java/lang/RuntimeException
    //   55	77	80	java/lang/RuntimeException
    //   74	93	96	java/lang/RuntimeException
    //   100	114	117	java/lang/RuntimeException
    //   111	130	133	java/lang/RuntimeException
    //   137	151	154	java/lang/RuntimeException
    //   148	167	170	java/lang/RuntimeException
    //   174	182	185	java/lang/RuntimeException
  }
  
  private boolean aegisguard_e(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_m
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_I : ()I
    //   29: istore #5
    //   31: aload #4
    //   33: iload #5
    //   35: ifeq -> 58
    //   38: ifnonnull -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: iconst_0
    //   49: goto -> 200
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: aload #4
    //   58: getfield aegisguard_p : D
    //   61: aload_0
    //   62: getfield aegisguard_D : D
    //   65: dcmpl
    //   66: iload #5
    //   68: lload_2
    //   69: lconst_0
    //   70: lcmp
    //   71: iflt -> 106
    //   74: ifeq -> 104
    //   77: iflt -> 199
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: aload #4
    //   89: getfield aegisguard_p : D
    //   92: aload_0
    //   93: getfield aegisguard_q : D
    //   96: dcmpg
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: iload #5
    //   106: lload_2
    //   107: lconst_0
    //   108: lcmp
    //   109: iflt -> 144
    //   112: ifeq -> 142
    //   115: ifgt -> 199
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload #4
    //   127: getfield aegisguard_G : D
    //   130: aload_0
    //   131: getfield aegisguard_n : D
    //   134: dcmpl
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: iload #5
    //   144: lload_2
    //   145: lconst_0
    //   146: lcmp
    //   147: iflt -> 182
    //   150: ifeq -> 180
    //   153: iflt -> 199
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload #4
    //   165: getfield aegisguard_G : D
    //   168: aload_0
    //   169: getfield aegisguard_Q : D
    //   172: dcmpg
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: iload #5
    //   182: ifeq -> 196
    //   185: ifgt -> 199
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: iconst_1
    //   196: goto -> 200
    //   199: iconst_0
    //   200: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #402	-> 31
    // Exception table:
    //   from	to	target	type
    //   31	41	44	java/lang/RuntimeException
    //   38	52	52	java/lang/RuntimeException
    //   58	80	83	java/lang/RuntimeException
    //   77	97	100	java/lang/RuntimeException
    //   104	118	121	java/lang/RuntimeException
    //   115	135	138	java/lang/RuntimeException
    //   142	156	159	java/lang/RuntimeException
    //   153	173	176	java/lang/RuntimeException
    //   180	188	191	java/lang/RuntimeException
  }
  
  private boolean aegisguard_N(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_m
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_I : ()I
    //   29: istore #5
    //   31: aload #4
    //   33: iload #5
    //   35: ifeq -> 58
    //   38: ifnonnull -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: iconst_0
    //   49: goto -> 200
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: aload #4
    //   58: getfield aegisguard_p : D
    //   61: aload_0
    //   62: getfield aegisguard_D : D
    //   65: dcmpl
    //   66: iload #5
    //   68: lload_2
    //   69: lconst_0
    //   70: lcmp
    //   71: iflt -> 106
    //   74: ifeq -> 104
    //   77: iflt -> 199
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: aload #4
    //   89: getfield aegisguard_p : D
    //   92: aload_0
    //   93: getfield aegisguard_q : D
    //   96: dcmpg
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: iload #5
    //   106: lload_2
    //   107: lconst_0
    //   108: lcmp
    //   109: ifle -> 144
    //   112: ifeq -> 142
    //   115: ifgt -> 199
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload #4
    //   127: getfield aegisguard_x : D
    //   130: aload_0
    //   131: getfield aegisguard_B : D
    //   134: dcmpl
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: iload #5
    //   144: lload_2
    //   145: lconst_0
    //   146: lcmp
    //   147: iflt -> 182
    //   150: ifeq -> 180
    //   153: iflt -> 199
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload #4
    //   165: getfield aegisguard_x : D
    //   168: aload_0
    //   169: getfield aegisguard_e : D
    //   172: dcmpg
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: iload #5
    //   182: ifeq -> 196
    //   185: ifgt -> 199
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: iconst_1
    //   196: goto -> 200
    //   199: iconst_0
    //   200: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #410	-> 31
    // Exception table:
    //   from	to	target	type
    //   31	41	44	java/lang/RuntimeException
    //   38	52	52	java/lang/RuntimeException
    //   58	80	83	java/lang/RuntimeException
    //   77	97	100	java/lang/RuntimeException
    //   104	118	121	java/lang/RuntimeException
    //   115	135	138	java/lang/RuntimeException
    //   142	156	159	java/lang/RuntimeException
    //   153	173	176	java/lang/RuntimeException
    //   180	188	191	java/lang/RuntimeException
  }
  
  public String toString() {
    String[] arrayOfString = b;
    return arrayOfString[2] + this.aegisguard_D + arrayOfString[4] + this.aegisguard_B + arrayOfString[6] + this.aegisguard_n + arrayOfString[3] + this.aegisguard_q + arrayOfString[6] + this.aegisguard_e + arrayOfString[6] + this.aegisguard_Q + "]";
  }
  
  public boolean aegisguard_Y(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_Kh.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic aegisguard__ : ()I
    //   21: istore #4
    //   23: aload_0
    //   24: getfield aegisguard_D : D
    //   27: invokestatic isNaN : (D)Z
    //   30: iload #4
    //   32: ifne -> 191
    //   35: ifne -> 190
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   44: athrow
    //   45: aload_0
    //   46: getfield aegisguard_B : D
    //   49: invokestatic isNaN : (D)Z
    //   52: iload #4
    //   54: ifne -> 191
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: ifne -> 190
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield aegisguard_n : D
    //   78: invokestatic isNaN : (D)Z
    //   81: iload #4
    //   83: ifne -> 191
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: ifne -> 190
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: aload_0
    //   104: getfield aegisguard_q : D
    //   107: invokestatic isNaN : (D)Z
    //   110: iload #4
    //   112: ifne -> 191
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: ifne -> 190
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   131: athrow
    //   132: aload_0
    //   133: getfield aegisguard_e : D
    //   136: invokestatic isNaN : (D)Z
    //   139: iload #4
    //   141: ifne -> 191
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: ifne -> 190
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   160: athrow
    //   161: aload_0
    //   162: getfield aegisguard_Q : D
    //   165: invokestatic isNaN : (D)Z
    //   168: iload #4
    //   170: ifne -> 191
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: ifeq -> 194
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   189: athrow
    //   190: iconst_1
    //   191: goto -> 195
    //   194: iconst_0
    //   195: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #420	-> 23
    // Exception table:
    //   from	to	target	type
    //   23	38	41	java/lang/RuntimeException
    //   35	57	60	java/lang/RuntimeException
    //   45	67	70	java/lang/RuntimeException
    //   64	86	89	java/lang/RuntimeException
    //   74	96	99	java/lang/RuntimeException
    //   93	115	118	java/lang/RuntimeException
    //   103	125	128	java/lang/RuntimeException
    //   122	144	147	java/lang/RuntimeException
    //   132	154	157	java/lang/RuntimeException
    //   151	173	176	java/lang/RuntimeException
    //   161	183	186	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x2D0E7D408ECCL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "^È¸=È-\026\027.\016«ôoÂ\020f(]\002Ç+T\020,\002\r®Ao\b,ÛwáY\016R\b$\fÍ\033~/Q\017\bÌª@÷n`\020").length();
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
