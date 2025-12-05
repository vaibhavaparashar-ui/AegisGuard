package me.frep.aegisguard.spigot.AegisGuard_n;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_I;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.block.BlockFace;
import org.bukkit.util.Vector;

public class aegisguard_n {
  private final double aegisguard_C;
  
  private final double aegisguard_d;
  
  private final double aegisguard_R;
  
  private static String aegisguard_A;
  
  private static final long a = aegisguard_e.a(-7005759964595518062L, 3595939624728171450L, MethodHandles.lookup().lookupClass()).a(221085826740533L);
  
  private static final String[] b;
  
  public double aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_C;
  }
  
  public double aegisguard_t(Object[] paramArrayOfObject) {
    return this.aegisguard_d;
  }
  
  public double aegisguard_p(Object[] paramArrayOfObject) {
    return this.aegisguard_R;
  }
  
  public aegisguard_n(double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_n.a : J
    //   3: ldc2_w 54108856992760
    //   6: lxor
    //   7: lstore #7
    //   9: invokestatic aegisguard_x : ()Ljava/lang/String;
    //   12: aload_0
    //   13: invokespecial <init> : ()V
    //   16: astore #9
    //   18: dload_1
    //   19: ldc2_w -0.0
    //   22: dcmpl
    //   23: aload #9
    //   25: ifnonnull -> 45
    //   28: ifne -> 40
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: dconst_0
    //   39: dstore_1
    //   40: dload_3
    //   41: ldc2_w -0.0
    //   44: dcmpl
    //   45: aload #9
    //   47: ifnonnull -> 80
    //   50: ifne -> 62
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   59: athrow
    //   60: dconst_0
    //   61: dstore_3
    //   62: dload #5
    //   64: aload #9
    //   66: ifnonnull -> 84
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
    //   88: putfield aegisguard_C : D
    //   91: aload_0
    //   92: dload_3
    //   93: putfield aegisguard_d : D
    //   96: aload_0
    //   97: dload #5
    //   99: putfield aegisguard_R : D
    //   102: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #17	-> 12
    //   #19	-> 18
    //   #20	-> 38
    //   #23	-> 40
    //   #24	-> 60
    //   #27	-> 62
    //   #28	-> 83
    //   #31	-> 86
    //   #32	-> 91
    //   #33	-> 96
    //   #34	-> 102
    // Exception table:
    //   from	to	target	type
    //   18	31	34	java/lang/RuntimeException
    //   45	53	56	java/lang/RuntimeException
    //   62	73	76	java/lang/RuntimeException
  }
  
  public aegisguard_n(me.frep.aegisguard.spigot.aegisguard_n paramaegisguard_n) {
    this(paramaegisguard_n.aegisguard_y(new Object[0]), paramaegisguard_n.aegisguard_t(new Object[0]), paramaegisguard_n.aegisguard_p(new Object[0]));
  }
  
  public aegisguard_n(Vector paramVector) {
    this(paramVector.getX(), paramVector.getY(), paramVector.getZ());
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_L(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_n(aegisguard_n.aegisguard_C - this.aegisguard_C, aegisguard_n.aegisguard_d - this.aegisguard_d, aegisguard_n.aegisguard_R - this.aegisguard_R);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_o(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    new Object[1];
    double d = aegisguard_I.aegisguard_C(new Object[] { Double.valueOf(this.aegisguard_C * this.aegisguard_C + this.aegisguard_d * this.aegisguard_d + this.aegisguard_R * this.aegisguard_R) });
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (d < 1.0E-4D) ? new me.frep.aegisguard.spigot.aegisguard_n(0.0D, 0.0D, 0.0D) : new me.frep.aegisguard.spigot.aegisguard_n(this.aegisguard_C / d, this.aegisguard_d / d, this.aegisguard_R / d);
  }
  
  public double aegisguard_x(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    return this.aegisguard_C * aegisguard_n.aegisguard_C + this.aegisguard_d * aegisguard_n.aegisguard_d + this.aegisguard_R * aegisguard_n.aegisguard_R;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_H(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_n(this.aegisguard_d * aegisguard_n.aegisguard_R - this.aegisguard_R * aegisguard_n.aegisguard_d, this.aegisguard_R * aegisguard_n.aegisguard_C - this.aegisguard_C * aegisguard_n.aegisguard_R, this.aegisguard_C * aegisguard_n.aegisguard_d - this.aegisguard_d * aegisguard_n.aegisguard_C);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_D(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    new Object[3];
    (new Object[3])[2] = Double.valueOf(aegisguard_n.aegisguard_R);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(aegisguard_n.aegisguard_d);
    new Object[3];
    return aegisguard_Z(new Object[] { Double.valueOf(aegisguard_n.aegisguard_C) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_Z(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    new Object[3];
    (new Object[3])[2] = Double.valueOf(-d3);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(-d2);
    new Object[3];
    return aegisguard_U(new Object[] { Double.valueOf(-d1) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_S(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    new Object[3];
    (new Object[3])[2] = Double.valueOf(aegisguard_n.aegisguard_R);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(aegisguard_n.aegisguard_d);
    new Object[3];
    return aegisguard_U(new Object[] { Double.valueOf(aegisguard_n.aegisguard_C) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_U(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    return new me.frep.aegisguard.spigot.aegisguard_n(this.aegisguard_C + d1, this.aegisguard_d + d2, this.aegisguard_R + d3);
  }
  
  public double aegisguard_s(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    double d1 = aegisguard_n.aegisguard_C - this.aegisguard_C;
    double d2 = aegisguard_n.aegisguard_d - this.aegisguard_d;
    double d3 = aegisguard_n.aegisguard_R - this.aegisguard_R;
    new Object[1];
    return aegisguard_I.aegisguard_C(new Object[] { Double.valueOf(d1 * d1 + d2 * d2 + d3 * d3) });
  }
  
  public double aegisguard_m(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    double d1 = aegisguard_n.aegisguard_C - this.aegisguard_C;
    double d2 = aegisguard_n.aegisguard_R - this.aegisguard_R;
    new Object[1];
    return aegisguard_I.aegisguard_C(new Object[] { Double.valueOf(d1 * d1 + d2 * d2) });
  }
  
  public double aegisguard_J(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    double d1 = aegisguard_n.aegisguard_C - this.aegisguard_C;
    double d2 = aegisguard_n.aegisguard_d - this.aegisguard_d;
    double d3 = aegisguard_n.aegisguard_R - this.aegisguard_R;
    return d1 * d1 + d2 * d2 + d3 * d3;
  }
  
  public double aegisguard_H(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    double d1 = aegisguard_n.aegisguard_C - this.aegisguard_C;
    double d2 = aegisguard_n.aegisguard_R - this.aegisguard_R;
    return d1 * d1 + d2 * d2;
  }
  
  public double aegisguard_K(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    return aegisguard_n.aegisguard_d - this.aegisguard_d;
  }
  
  public double aegisguard_C(Object[] paramArrayOfObject) {
    new Object[1];
    return aegisguard_I.aegisguard_C(new Object[] { Double.valueOf(this.aegisguard_C * this.aegisguard_C + this.aegisguard_d * this.aegisguard_d + this.aegisguard_R * this.aegisguard_R) });
  }
  
  public double aegisguard_T(Object[] paramArrayOfObject) {
    return this.aegisguard_C * this.aegisguard_C + this.aegisguard_d * this.aegisguard_d + this.aegisguard_R * this.aegisguard_R;
  }
  
  public double aegisguard_N(Object[] paramArrayOfObject) {
    return this.aegisguard_C * this.aegisguard_C + this.aegisguard_R * this.aegisguard_R;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_r(Object[] paramArrayOfObject) {
    BlockFace blockFace = (BlockFace)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_n(this.aegisguard_C + blockFace.getModX(), this.aegisguard_d + blockFace.getModY(), this.aegisguard_R + blockFace.getModZ());
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_h(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_n
    //   7: astore #6
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Double
    //   15: invokevirtual doubleValue : ()D
    //   18: dstore_2
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast java/lang/Long
    //   25: invokevirtual longValue : ()J
    //   28: lstore #4
    //   30: pop
    //   31: getstatic me/frep/aegisguard/spigot/aegisguard_n.a : J
    //   34: lload #4
    //   36: lxor
    //   37: lstore #4
    //   39: invokestatic aegisguard_x : ()Ljava/lang/String;
    //   42: aload #6
    //   44: getfield aegisguard_C : D
    //   47: aload_0
    //   48: getfield aegisguard_C : D
    //   51: dsub
    //   52: dstore #8
    //   54: aload #6
    //   56: getfield aegisguard_d : D
    //   59: aload_0
    //   60: getfield aegisguard_d : D
    //   63: dsub
    //   64: dstore #10
    //   66: aload #6
    //   68: getfield aegisguard_R : D
    //   71: aload_0
    //   72: getfield aegisguard_R : D
    //   75: dsub
    //   76: dstore #12
    //   78: astore #7
    //   80: dload #8
    //   82: dload #8
    //   84: dmul
    //   85: ldc2_w 1.0000000116860974E-7
    //   88: aload #7
    //   90: ifnonnull -> 118
    //   93: dcmpg
    //   94: ifge -> 110
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: aconst_null
    //   105: areturn
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: dload_2
    //   111: aload_0
    //   112: getfield aegisguard_C : D
    //   115: dsub
    //   116: dload #8
    //   118: ddiv
    //   119: dstore #14
    //   121: dload #14
    //   123: dconst_0
    //   124: dcmpl
    //   125: lload #4
    //   127: lconst_0
    //   128: lcmp
    //   129: iflt -> 158
    //   132: aload #7
    //   134: ifnonnull -> 158
    //   137: iflt -> 205
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   146: athrow
    //   147: dload #14
    //   149: dconst_1
    //   150: dcmpg
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: ifgt -> 205
    //   161: new me/frep/aegisguard/spigot/aegisguard_n
    //   164: dup
    //   165: aload_0
    //   166: getfield aegisguard_C : D
    //   169: dload #8
    //   171: dload #14
    //   173: dmul
    //   174: dadd
    //   175: aload_0
    //   176: getfield aegisguard_d : D
    //   179: dload #10
    //   181: dload #14
    //   183: dmul
    //   184: dadd
    //   185: aload_0
    //   186: getfield aegisguard_R : D
    //   189: dload #12
    //   191: dload #14
    //   193: dmul
    //   194: dadd
    //   195: invokespecial <init> : (DDD)V
    //   198: goto -> 206
    //   201: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   204: athrow
    //   205: aconst_null
    //   206: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #175	-> 42
    //   #176	-> 54
    //   #177	-> 66
    //   #179	-> 80
    //   #181	-> 104
    //   #185	-> 110
    //   #186	-> 121
    // Exception table:
    //   from	to	target	type
    //   80	97	100	java/lang/RuntimeException
    //   93	106	106	java/lang/RuntimeException
    //   121	140	143	java/lang/RuntimeException
    //   137	151	154	java/lang/RuntimeException
    //   158	201	201	java/lang/RuntimeException
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_F(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_n
    //   7: astore #6
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Double
    //   15: invokevirtual doubleValue : ()D
    //   18: dstore_2
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast java/lang/Long
    //   25: invokevirtual longValue : ()J
    //   28: lstore #4
    //   30: pop
    //   31: getstatic me/frep/aegisguard/spigot/aegisguard_n.a : J
    //   34: lload #4
    //   36: lxor
    //   37: lstore #4
    //   39: aload #6
    //   41: getfield aegisguard_C : D
    //   44: aload_0
    //   45: getfield aegisguard_C : D
    //   48: dsub
    //   49: dstore #8
    //   51: aload #6
    //   53: getfield aegisguard_d : D
    //   56: aload_0
    //   57: getfield aegisguard_d : D
    //   60: dsub
    //   61: dstore #10
    //   63: invokestatic aegisguard_x : ()Ljava/lang/String;
    //   66: aload #6
    //   68: getfield aegisguard_R : D
    //   71: aload_0
    //   72: getfield aegisguard_R : D
    //   75: dsub
    //   76: dstore #12
    //   78: astore #7
    //   80: dload #10
    //   82: dload #10
    //   84: dmul
    //   85: ldc2_w 1.0000000116860974E-7
    //   88: aload #7
    //   90: ifnonnull -> 118
    //   93: dcmpg
    //   94: ifge -> 110
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: aconst_null
    //   105: areturn
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: dload_2
    //   111: aload_0
    //   112: getfield aegisguard_d : D
    //   115: dsub
    //   116: dload #10
    //   118: ddiv
    //   119: dstore #14
    //   121: dload #14
    //   123: dconst_0
    //   124: dcmpl
    //   125: lload #4
    //   127: lconst_0
    //   128: lcmp
    //   129: ifle -> 158
    //   132: aload #7
    //   134: ifnonnull -> 158
    //   137: iflt -> 205
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   146: athrow
    //   147: dload #14
    //   149: dconst_1
    //   150: dcmpg
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: ifgt -> 205
    //   161: new me/frep/aegisguard/spigot/aegisguard_n
    //   164: dup
    //   165: aload_0
    //   166: getfield aegisguard_C : D
    //   169: dload #8
    //   171: dload #14
    //   173: dmul
    //   174: dadd
    //   175: aload_0
    //   176: getfield aegisguard_d : D
    //   179: dload #10
    //   181: dload #14
    //   183: dmul
    //   184: dadd
    //   185: aload_0
    //   186: getfield aegisguard_R : D
    //   189: dload #12
    //   191: dload #14
    //   193: dmul
    //   194: dadd
    //   195: invokespecial <init> : (DDD)V
    //   198: goto -> 206
    //   201: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   204: athrow
    //   205: aconst_null
    //   206: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #196	-> 39
    //   #197	-> 51
    //   #198	-> 66
    //   #200	-> 80
    //   #202	-> 104
    //   #206	-> 110
    //   #207	-> 121
    // Exception table:
    //   from	to	target	type
    //   80	97	100	java/lang/RuntimeException
    //   93	106	106	java/lang/RuntimeException
    //   121	140	143	java/lang/RuntimeException
    //   137	151	154	java/lang/RuntimeException
    //   158	201	201	java/lang/RuntimeException
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_I(Object[] paramArrayOfObject) {
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
    //   11: checkcast java/lang/Double
    //   14: invokevirtual doubleValue : ()D
    //   17: dstore_3
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast java/lang/Long
    //   24: invokevirtual longValue : ()J
    //   27: lstore #5
    //   29: pop
    //   30: getstatic me/frep/aegisguard/spigot/aegisguard_n.a : J
    //   33: lload #5
    //   35: lxor
    //   36: lstore #5
    //   38: aload_2
    //   39: getfield aegisguard_C : D
    //   42: aload_0
    //   43: getfield aegisguard_C : D
    //   46: dsub
    //   47: dstore #8
    //   49: invokestatic aegisguard_x : ()Ljava/lang/String;
    //   52: aload_2
    //   53: getfield aegisguard_d : D
    //   56: aload_0
    //   57: getfield aegisguard_d : D
    //   60: dsub
    //   61: dstore #10
    //   63: aload_2
    //   64: getfield aegisguard_R : D
    //   67: aload_0
    //   68: getfield aegisguard_R : D
    //   71: dsub
    //   72: dstore #12
    //   74: astore #7
    //   76: dload #12
    //   78: dload #12
    //   80: dmul
    //   81: ldc2_w 1.0000000116860974E-7
    //   84: aload #7
    //   86: ifnonnull -> 114
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
    //   108: getfield aegisguard_R : D
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
    //   125: ifle -> 154
    //   128: aload #7
    //   130: ifnonnull -> 154
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
    //   157: new me/frep/aegisguard/spigot/aegisguard_n
    //   160: dup
    //   161: aload_0
    //   162: getfield aegisguard_C : D
    //   165: dload #8
    //   167: dload #14
    //   169: dmul
    //   170: dadd
    //   171: aload_0
    //   172: getfield aegisguard_d : D
    //   175: dload #10
    //   177: dload #14
    //   179: dmul
    //   180: dadd
    //   181: aload_0
    //   182: getfield aegisguard_R : D
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
    //   #217	-> 38
    //   #218	-> 52
    //   #219	-> 63
    //   #221	-> 76
    //   #223	-> 100
    //   #227	-> 106
    //   #228	-> 117
    // Exception table:
    //   from	to	target	type
    //   76	93	96	java/lang/RuntimeException
    //   89	102	102	java/lang/RuntimeException
    //   117	136	139	java/lang/RuntimeException
    //   133	147	150	java/lang/RuntimeException
    //   154	197	197	java/lang/RuntimeException
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_J(Object[] paramArrayOfObject) {
    float f1 = ((Float)paramArrayOfObject[0]).floatValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    float f2 = aegisguard_I.aegisguard_P(new Object[] { Float.valueOf(f1) });
    float f3 = aegisguard_I.aegisguard_q(new Object[] { Float.valueOf(f1) });
    double d1 = this.aegisguard_C;
    double d2 = this.aegisguard_d * f2 + this.aegisguard_R * f3;
    String str = aegisguard_x();
    double d3 = this.aegisguard_R * f2 - this.aegisguard_d * f3;
    try {
      if (AbstractCheck.aegisguard_B() == null)
        aegisguard_E("jE27mc"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new me.frep.aegisguard.spigot.aegisguard_n(d1, d2, d3);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_n(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    float f1 = ((Float)paramArrayOfObject[1]).floatValue();
    l = a ^ l;
    float f2 = aegisguard_I.aegisguard_P(new Object[] { Float.valueOf(f1) });
    float f3 = aegisguard_I.aegisguard_q(new Object[] { Float.valueOf(f1) });
    double d1 = this.aegisguard_C * f2 + this.aegisguard_R * f3;
    double d2 = this.aegisguard_d;
    String str = aegisguard_x();
    double d3 = this.aegisguard_R * f2 - this.aegisguard_C * f3;
    try {
      if (str != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[2]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new me.frep.aegisguard.spigot.aegisguard_n(d1, d2, d3);
  }
  
  public Vector aegisguard_p(Object[] paramArrayOfObject) {
    return new Vector(this.aegisguard_C, this.aegisguard_d, this.aegisguard_R);
  }
  
  public int aegisguard_i(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x459343CC97ABL;
    new Object[2];
    (new Object[2])[1] = Long.valueOf(l2);
    new Object[2];
    return aegisguard_I.aegisguard_v(new Object[] { Double.valueOf(this.aegisguard_C) });
  }
  
  public int aegisguard_u(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x6B2EE70A02B7L;
    new Object[2];
    (new Object[2])[1] = Long.valueOf(l2);
    new Object[2];
    return aegisguard_I.aegisguard_v(new Object[] { Double.valueOf(this.aegisguard_d) });
  }
  
  public int aegisguard_M(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x43CB51C2361BL;
    new Object[2];
    (new Object[2])[1] = Long.valueOf(l2);
    new Object[2];
    return aegisguard_I.aegisguard_v(new Object[] { Double.valueOf(this.aegisguard_R) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_p(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
    new Object[3];
    (new Object[3])[2] = Double.valueOf(d);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(d);
    new Object[3];
    return aegisguard_X(new Object[] { Double.valueOf(d) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_n aegisguard_X(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    return new me.frep.aegisguard.spigot.aegisguard_n(this.aegisguard_C * d1, this.aegisguard_d * d2, this.aegisguard_R * d3);
  }
  
  public double aegisguard_a(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    return this.aegisguard_C * aegisguard_n.aegisguard_C + this.aegisguard_d * aegisguard_n.aegisguard_d + this.aegisguard_R * aegisguard_n.aegisguard_R;
  }
  
  public float aegisguard_m(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_n aegisguard_n = (me.frep.aegisguard.spigot.aegisguard_n)paramArrayOfObject[0];
    double d = aegisguard_a(new Object[] { aegisguard_n }) / aegisguard_C(new Object[0]) * aegisguard_n.aegisguard_C(new Object[0]);
    return (float)Math.acos(d);
  }
  
  public String toString() {
    String[] arrayOfString = b;
    return arrayOfString[0] + this.aegisguard_C + arrayOfString[1] + this.aegisguard_d + arrayOfString[2] + this.aegisguard_R + '}';
  }
  
  public static void aegisguard_E(String paramString) {
    aegisguard_A = paramString;
  }
  
  public static String aegisguard_x() {
    return aegisguard_A;
  }
  
  static {
    long l = a ^ 0x5CAC99FA333FL;
    aegisguard_E(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "=ùjêÀû0\024fX\023\024g¦.\b¡Í54*\026\b¼Ó¶N*Ã").length();
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
