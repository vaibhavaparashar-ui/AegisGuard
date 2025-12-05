package me.frep.aegisguard.spigot.AegisGuard_m;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_I;
import me.frep.aegisguard.spigot.aegisguard_e;

public class aegisguard_m {
  public final double aegisguard_p;
  
  public final double aegisguard_x;
  
  public final double aegisguard_G;
  
  private static final String aegisguard_o;
  
  private static final long a = aegisguard_e.a(3580638697678741401L, 5183825278520300547L, MethodHandles.lookup().lookupClass()).a(156969841486873L);
  
  private static final String[] b;
  
  public double aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_p;
  }
  
  public double aegisguard_b(Object[] paramArrayOfObject) {
    return this.aegisguard_x;
  }
  
  public double aegisguard_U(Object[] paramArrayOfObject) {
    return this.aegisguard_G;
  }
  
  public static String spigot() {
    return b[2];
  }
  
  public static String nonce() {
    return b[1];
  }
  
  public static String resource() {
    return b[5];
  }
  
  public aegisguard_m(double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_m.a : J
    //   3: ldc2_w 65890045199904
    //   6: lxor
    //   7: lstore #7
    //   9: invokestatic aegisguard_I : ()I
    //   12: aload_0
    //   13: invokespecial <init> : ()V
    //   16: istore #9
    //   18: dload_1
    //   19: ldc2_w -0.0
    //   22: dcmpl
    //   23: iload #9
    //   25: ifeq -> 45
    //   28: ifne -> 40
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: dconst_0
    //   39: dstore_1
    //   40: dload_3
    //   41: ldc2_w -0.0
    //   44: dcmpl
    //   45: iload #9
    //   47: ifeq -> 80
    //   50: ifne -> 62
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   59: athrow
    //   60: dconst_0
    //   61: dstore_3
    //   62: dload #5
    //   64: iload #9
    //   66: ifeq -> 84
    //   69: ldc2_w -0.0
    //   72: dcmpl
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: ifne -> 86
    //   83: dconst_0
    //   84: dstore #5
    //   86: aload_0
    //   87: dload_1
    //   88: putfield aegisguard_p : D
    //   91: aload_0
    //   92: dload_3
    //   93: putfield aegisguard_x : D
    //   96: aload_0
    //   97: dload #5
    //   99: putfield aegisguard_G : D
    //   102: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #31	-> 12
    //   #32	-> 18
    //   #34	-> 38
    //   #37	-> 40
    //   #39	-> 60
    //   #42	-> 62
    //   #44	-> 83
    //   #47	-> 86
    //   #48	-> 91
    //   #49	-> 96
    //   #50	-> 102
    // Exception table:
    //   from	to	target	type
    //   18	31	34	java/lang/RuntimeException
    //   45	53	56	java/lang/RuntimeException
    //   62	73	76	java/lang/RuntimeException
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_w(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_m aegisguard_m = (me.frep.aegisguard.spigot.aegisguard_m)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_m(aegisguard_m.aegisguard_p - this.aegisguard_p, aegisguard_m.aegisguard_x - this.aegisguard_x, aegisguard_m.aegisguard_G - this.aegisguard_G);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_n(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    new Object[1];
    double d = aegisguard_I.aegisguard_C(new Object[] { Double.valueOf(this.aegisguard_p * this.aegisguard_p + this.aegisguard_x * this.aegisguard_x + this.aegisguard_G * this.aegisguard_G) });
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (d < 1.0E-4D) ? new me.frep.aegisguard.spigot.aegisguard_m(0.0D, 0.0D, 0.0D) : new me.frep.aegisguard.spigot.aegisguard_m(this.aegisguard_p / d, this.aegisguard_x / d, this.aegisguard_G / d);
  }
  
  public double aegisguard_y(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_m aegisguard_m = (me.frep.aegisguard.spigot.aegisguard_m)paramArrayOfObject[0];
    return this.aegisguard_p * aegisguard_m.aegisguard_p + this.aegisguard_x * aegisguard_m.aegisguard_x + this.aegisguard_G * aegisguard_m.aegisguard_G;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_E(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_m aegisguard_m = (me.frep.aegisguard.spigot.aegisguard_m)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_m(this.aegisguard_x * aegisguard_m.aegisguard_G - this.aegisguard_G * aegisguard_m.aegisguard_x, this.aegisguard_G * aegisguard_m.aegisguard_p - this.aegisguard_p * aegisguard_m.aegisguard_G, this.aegisguard_p * aegisguard_m.aegisguard_x - this.aegisguard_x * aegisguard_m.aegisguard_p);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_x(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_m aegisguard_m = (me.frep.aegisguard.spigot.aegisguard_m)paramArrayOfObject[0];
    new Object[3];
    (new Object[3])[2] = Double.valueOf(aegisguard_m.aegisguard_G);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(aegisguard_m.aegisguard_x);
    new Object[3];
    return aegisguard_G(new Object[] { Double.valueOf(aegisguard_m.aegisguard_p) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_G(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    new Object[3];
    (new Object[3])[2] = Double.valueOf(-d3);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(-d2);
    new Object[3];
    return aegisguard_Y(new Object[] { Double.valueOf(-d1) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_W(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_m aegisguard_m = (me.frep.aegisguard.spigot.aegisguard_m)paramArrayOfObject[0];
    new Object[3];
    (new Object[3])[2] = Double.valueOf(aegisguard_m.aegisguard_G);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(aegisguard_m.aegisguard_x);
    new Object[3];
    return aegisguard_Y(new Object[] { Double.valueOf(aegisguard_m.aegisguard_p) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_Y(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    return new me.frep.aegisguard.spigot.aegisguard_m(this.aegisguard_p + d1, this.aegisguard_x + d2, this.aegisguard_G + d3);
  }
  
  public double aegisguard_f(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_m aegisguard_m = (me.frep.aegisguard.spigot.aegisguard_m)paramArrayOfObject[0];
    double d1 = aegisguard_m.aegisguard_p - this.aegisguard_p;
    double d2 = aegisguard_m.aegisguard_x - this.aegisguard_x;
    double d3 = aegisguard_m.aegisguard_G - this.aegisguard_G;
    new Object[1];
    return aegisguard_I.aegisguard_C(new Object[] { Double.valueOf(d1 * d1 + d2 * d2 + d3 * d3) });
  }
  
  public double aegisguard_e(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_m aegisguard_m = (me.frep.aegisguard.spigot.aegisguard_m)paramArrayOfObject[0];
    double d1 = aegisguard_m.aegisguard_p - this.aegisguard_p;
    double d2 = aegisguard_m.aegisguard_x - this.aegisguard_x;
    double d3 = aegisguard_m.aegisguard_G - this.aegisguard_G;
    return d1 * d1 + d2 * d2 + d3 * d3;
  }
  
  public double aegisguard_o(Object[] paramArrayOfObject) {
    new Object[1];
    return aegisguard_I.aegisguard_C(new Object[] { Double.valueOf(this.aegisguard_p * this.aegisguard_p + this.aegisguard_x * this.aegisguard_x + this.aegisguard_G * this.aegisguard_G) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_I(Object[] paramArrayOfObject) {
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
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast java/lang/Double
    //   25: invokevirtual doubleValue : ()D
    //   28: dstore #5
    //   30: pop
    //   31: getstatic me/frep/aegisguard/spigot/aegisguard_m.a : J
    //   34: lload_2
    //   35: lxor
    //   36: lstore_2
    //   37: invokestatic aegisguard__ : ()I
    //   40: aload #4
    //   42: getfield aegisguard_p : D
    //   45: aload_0
    //   46: getfield aegisguard_p : D
    //   49: dsub
    //   50: dstore #8
    //   52: istore #7
    //   54: aload #4
    //   56: getfield aegisguard_x : D
    //   59: aload_0
    //   60: getfield aegisguard_x : D
    //   63: dsub
    //   64: dstore #10
    //   66: aload #4
    //   68: getfield aegisguard_G : D
    //   71: aload_0
    //   72: getfield aegisguard_G : D
    //   75: dsub
    //   76: dstore #12
    //   78: dload #8
    //   80: dload #8
    //   82: dmul
    //   83: ldc2_w 1.0000000116860974E-7
    //   86: iload #7
    //   88: ifne -> 117
    //   91: dcmpg
    //   92: ifge -> 108
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: aconst_null
    //   103: areturn
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: dload #5
    //   110: aload_0
    //   111: getfield aegisguard_p : D
    //   114: dsub
    //   115: dload #8
    //   117: ddiv
    //   118: dstore #14
    //   120: dload #14
    //   122: dconst_0
    //   123: dcmpl
    //   124: lload_2
    //   125: lconst_0
    //   126: lcmp
    //   127: ifle -> 156
    //   130: iload #7
    //   132: ifne -> 156
    //   135: iflt -> 203
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: dload #14
    //   147: dconst_1
    //   148: dcmpg
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   155: athrow
    //   156: ifgt -> 203
    //   159: new me/frep/aegisguard/spigot/aegisguard_m
    //   162: dup
    //   163: aload_0
    //   164: getfield aegisguard_p : D
    //   167: dload #8
    //   169: dload #14
    //   171: dmul
    //   172: dadd
    //   173: aload_0
    //   174: getfield aegisguard_x : D
    //   177: dload #10
    //   179: dload #14
    //   181: dmul
    //   182: dadd
    //   183: aload_0
    //   184: getfield aegisguard_G : D
    //   187: dload #12
    //   189: dload #14
    //   191: dmul
    //   192: dadd
    //   193: invokespecial <init> : (DDD)V
    //   196: goto -> 204
    //   199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   202: athrow
    //   203: aconst_null
    //   204: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #142	-> 40
    //   #143	-> 54
    //   #144	-> 66
    //   #146	-> 78
    //   #148	-> 102
    //   #152	-> 108
    //   #153	-> 120
    // Exception table:
    //   from	to	target	type
    //   78	95	98	java/lang/RuntimeException
    //   91	104	104	java/lang/RuntimeException
    //   120	138	141	java/lang/RuntimeException
    //   135	149	152	java/lang/RuntimeException
    //   156	199	199	java/lang/RuntimeException
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_L(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_m
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
    //   31: getstatic me/frep/aegisguard/spigot/aegisguard_m.a : J
    //   34: lload_2
    //   35: lxor
    //   36: lstore_2
    //   37: aload #6
    //   39: getfield aegisguard_p : D
    //   42: aload_0
    //   43: getfield aegisguard_p : D
    //   46: dsub
    //   47: dstore #8
    //   49: invokestatic aegisguard_I : ()I
    //   52: aload #6
    //   54: getfield aegisguard_x : D
    //   57: aload_0
    //   58: getfield aegisguard_x : D
    //   61: dsub
    //   62: dstore #10
    //   64: istore #7
    //   66: aload #6
    //   68: getfield aegisguard_G : D
    //   71: aload_0
    //   72: getfield aegisguard_G : D
    //   75: dsub
    //   76: dstore #12
    //   78: dload #10
    //   80: dload #10
    //   82: dmul
    //   83: ldc2_w 1.0000000116860974E-7
    //   86: iload #7
    //   88: ifeq -> 117
    //   91: dcmpg
    //   92: ifge -> 108
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: aconst_null
    //   103: areturn
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: dload #4
    //   110: aload_0
    //   111: getfield aegisguard_x : D
    //   114: dsub
    //   115: dload #10
    //   117: ddiv
    //   118: dstore #14
    //   120: dload #14
    //   122: dconst_0
    //   123: dcmpl
    //   124: lload_2
    //   125: lconst_0
    //   126: lcmp
    //   127: ifle -> 156
    //   130: iload #7
    //   132: ifeq -> 156
    //   135: iflt -> 203
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: dload #14
    //   147: dconst_1
    //   148: dcmpg
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   155: athrow
    //   156: ifgt -> 203
    //   159: new me/frep/aegisguard/spigot/aegisguard_m
    //   162: dup
    //   163: aload_0
    //   164: getfield aegisguard_p : D
    //   167: dload #8
    //   169: dload #14
    //   171: dmul
    //   172: dadd
    //   173: aload_0
    //   174: getfield aegisguard_x : D
    //   177: dload #10
    //   179: dload #14
    //   181: dmul
    //   182: dadd
    //   183: aload_0
    //   184: getfield aegisguard_G : D
    //   187: dload #12
    //   189: dload #14
    //   191: dmul
    //   192: dadd
    //   193: invokespecial <init> : (DDD)V
    //   196: goto -> 204
    //   199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   202: athrow
    //   203: aconst_null
    //   204: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #163	-> 37
    //   #164	-> 52
    //   #165	-> 66
    //   #167	-> 78
    //   #169	-> 102
    //   #173	-> 108
    //   #174	-> 120
    // Exception table:
    //   from	to	target	type
    //   78	95	98	java/lang/RuntimeException
    //   91	104	104	java/lang/RuntimeException
    //   120	138	141	java/lang/RuntimeException
    //   135	149	152	java/lang/RuntimeException
    //   156	199	199	java/lang/RuntimeException
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_c(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore #5
    //   12: dup
    //   13: iconst_1
    //   14: aaload
    //   15: checkcast me/frep/aegisguard/spigot/aegisguard_m
    //   18: astore_2
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast java/lang/Double
    //   25: invokevirtual doubleValue : ()D
    //   28: dstore_3
    //   29: pop
    //   30: getstatic me/frep/aegisguard/spigot/aegisguard_m.a : J
    //   33: lload #5
    //   35: lxor
    //   36: lstore #5
    //   38: aload_2
    //   39: getfield aegisguard_p : D
    //   42: aload_0
    //   43: getfield aegisguard_p : D
    //   46: dsub
    //   47: dstore #8
    //   49: invokestatic aegisguard_I : ()I
    //   52: aload_2
    //   53: getfield aegisguard_x : D
    //   56: aload_0
    //   57: getfield aegisguard_x : D
    //   60: dsub
    //   61: dstore #10
    //   63: istore #7
    //   65: aload_2
    //   66: getfield aegisguard_G : D
    //   69: aload_0
    //   70: getfield aegisguard_G : D
    //   73: dsub
    //   74: dstore #12
    //   76: dload #12
    //   78: dload #12
    //   80: dmul
    //   81: ldc2_w 1.0000000116860974E-7
    //   84: iload #7
    //   86: ifeq -> 114
    //   89: dcmpg
    //   90: ifge -> 106
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: aconst_null
    //   101: areturn
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: dload_3
    //   107: aload_0
    //   108: getfield aegisguard_G : D
    //   111: dsub
    //   112: dload #12
    //   114: ddiv
    //   115: dstore #14
    //   117: dload #14
    //   119: dconst_0
    //   120: dcmpl
    //   121: lload #5
    //   123: lconst_0
    //   124: lcmp
    //   125: iflt -> 154
    //   128: iload #7
    //   130: ifeq -> 154
    //   133: iflt -> 201
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   142: athrow
    //   143: dload #14
    //   145: dconst_1
    //   146: dcmpg
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: ifgt -> 201
    //   157: new me/frep/aegisguard/spigot/aegisguard_m
    //   160: dup
    //   161: aload_0
    //   162: getfield aegisguard_p : D
    //   165: dload #8
    //   167: dload #14
    //   169: dmul
    //   170: dadd
    //   171: aload_0
    //   172: getfield aegisguard_x : D
    //   175: dload #10
    //   177: dload #14
    //   179: dmul
    //   180: dadd
    //   181: aload_0
    //   182: getfield aegisguard_G : D
    //   185: dload #12
    //   187: dload #14
    //   189: dmul
    //   190: dadd
    //   191: invokespecial <init> : (DDD)V
    //   194: goto -> 202
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: aconst_null
    //   202: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #184	-> 38
    //   #185	-> 52
    //   #186	-> 65
    //   #188	-> 76
    //   #190	-> 100
    //   #194	-> 106
    //   #195	-> 117
    // Exception table:
    //   from	to	target	type
    //   76	93	96	java/lang/RuntimeException
    //   89	102	102	java/lang/RuntimeException
    //   117	136	139	java/lang/RuntimeException
    //   133	147	150	java/lang/RuntimeException
    //   154	197	197	java/lang/RuntimeException
  }
  
  public String toString() {
    String[] arrayOfString = b;
    return "(" + this.aegisguard_p + arrayOfString[4] + this.aegisguard_x + arrayOfString[0] + this.aegisguard_G + ")";
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_Z(Object[] paramArrayOfObject) {
    float f1 = ((Float)paramArrayOfObject[0]).floatValue(), f2 = aegisguard_I.aegisguard_P(new Object[] { Float.valueOf(f1) });
    float f3 = aegisguard_I.aegisguard_q(new Object[] { Float.valueOf(f1) });
    double d1 = this.aegisguard_p;
    double d2 = this.aegisguard_x * f2 + this.aegisguard_G * f3;
    double d3 = this.aegisguard_G * f2 - this.aegisguard_x * f3;
    return new me.frep.aegisguard.spigot.aegisguard_m(d1, d2, d3);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_m aegisguard_e(Object[] paramArrayOfObject) {
    float f1 = ((Float)paramArrayOfObject[0]).floatValue(), f2 = aegisguard_I.aegisguard_P(new Object[] { Float.valueOf(f1) });
    float f3 = aegisguard_I.aegisguard_q(new Object[] { Float.valueOf(f1) });
    double d1 = this.aegisguard_p * f2 + this.aegisguard_G * f3;
    double d2 = this.aegisguard_x;
    double d3 = this.aegisguard_G * f2 - this.aegisguard_p * f3;
    return new me.frep.aegisguard.spigot.aegisguard_m(d1, d2, d3);
  }
  
  static {
    long l = a ^ 0x753E73E0B249L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "T\r\"m¢ÉÂ\020\000\006@¹æ1\"D\032\022n(ßô\020\007þîþ\007T+ì¾H¡9Â¦\020\025{\027´\030'*YY").length();
    byte b2 = 8;
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
