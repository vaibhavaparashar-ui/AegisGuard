package me.frep.aegisguard.spigot.AegisGuard_I;

import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.vulcan.spigot.Vulcan_Kr;
import me.frep.vulcan.spigot.Vulcan_e;
import me.frep.vulcan.spigot.check.AbstractCheck;

public class Vulcan_I {
  public static final float Vulcan_v;
  
  private static final float[] Vulcan_i;
  
  private static final int[] Vulcan_b;
  
  private static final String Vulcan_r;
  
  private static final long a;
  
  private static final String[] b;
  
  static {
    long l;
    byte b1;
    for (a = Vulcan_e.a(9219644501395113301L, 5069889497074941068L, MethodHandles.lookup().lookupClass()).a(206742846396124L), l = a ^ 0x201CCDD53B52L, (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "\022ÿÏ`ï@~d¶ûÅq\030Âw¦C\037è#Rhê+\027îcV¬Âfr").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  public static float Vulcan_q(Object[] paramArrayOfObject) {
    float f = ((Float)paramArrayOfObject[0]).floatValue();
    return Vulcan_i[(int)(f * 10430.378F) & 0xFFFF];
  }
  
  public static String spigot() {
    return b[2];
  }
  
  public static String nonce() {
    return b[3];
  }
  
  public static String resource() {
    return b[1];
  }
  
  public static float Vulcan_P(Object[] paramArrayOfObject) {
    float f = ((Float)paramArrayOfObject[0]).floatValue();
    return Vulcan_i[(int)(f * 10430.378F + 16384.0F) & 0xFFFF];
  }
  
  public static float Vulcan_t(Object[] paramArrayOfObject) {
    float f = ((Float)paramArrayOfObject[0]).floatValue();
    return (float)Math.sqrt(f);
  }
  
  public static float Vulcan_C(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
    return (float)Math.sqrt(d);
  }
  
  public static int Vulcan_F(Object[] paramArrayOfObject) {
    float f = ((Float)paramArrayOfObject[0]).floatValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    int j = (int)f, i = Vulcan_Kr.Vulcan_I();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (f < j) ? (j - 1) : j;
  }
  
  public static int Vulcan_A(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
    return (int)(d + 1024.0D) - 1024;
  }
  
  public static int Vulcan_v(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    int j = (int)d, i = Vulcan_Kr.Vulcan_I();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (d < j) ? (j - 1) : j;
  }
  
  public static long Vulcan_j(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = (long)d;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (d < l2) ? (l2 - 1L) : l2;
  }
  
  public static int Vulcan_I(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    int i = Vulcan_Kr.Vulcan_I();
    try {
      if (i != 0) {
        try {
          if (d >= 0.0D) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (int)(-d + 1.0D);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static float Vulcan_m(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    float f = ((Float)paramArrayOfObject[1]).floatValue();
    l = a ^ l;
    int i = Vulcan_Kr.Vulcan_I();
    try {
      if (i != 0) {
        try {
          if (f >= 0.0F) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return -f;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static int Vulcan_T(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    int j = Vulcan_Kr.Vulcan_I();
    try {
      if (j != 0) {
        try {
          if (i >= 0) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return -i;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static int Vulcan_C(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    float f = ((Float)paramArrayOfObject[1]).floatValue();
    l = a ^ l;
    int j = (int)f, i = Vulcan_Kr.Vulcan__();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (f > j) ? (j + 1) : j;
  }
  
  public static int Vulcan_e(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    int j = (int)d, i = Vulcan_Kr.Vulcan_I();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (d > j) ? (j + 1) : j;
  }
  
  public static int Vulcan_U(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Integer
    //   7: invokevirtual intValue : ()I
    //   10: istore #4
    //   12: dup
    //   13: iconst_1
    //   14: aaload
    //   15: checkcast java/lang/Integer
    //   18: invokevirtual intValue : ()I
    //   21: istore #5
    //   23: dup
    //   24: iconst_2
    //   25: aaload
    //   26: checkcast java/lang/Long
    //   29: invokevirtual longValue : ()J
    //   32: lstore_1
    //   33: dup
    //   34: iconst_3
    //   35: aaload
    //   36: checkcast java/lang/Integer
    //   39: invokevirtual intValue : ()I
    //   42: istore_3
    //   43: pop
    //   44: getstatic me/frep/vulcan/spigot/Vulcan_I.a : J
    //   47: lload_1
    //   48: lxor
    //   49: lstore_1
    //   50: invokestatic Vulcan_I : ()I
    //   53: istore #6
    //   55: iload #4
    //   57: iload #5
    //   59: iload #6
    //   61: ifeq -> 104
    //   64: if_icmpge -> 83
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: iload #5
    //   76: goto -> 113
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: iload #4
    //   85: iload #6
    //   87: lload_1
    //   88: lconst_0
    //   89: lcmp
    //   90: ifle -> 97
    //   93: ifeq -> 108
    //   96: iload_3
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: if_icmple -> 111
    //   107: iload_3
    //   108: goto -> 113
    //   111: iload #4
    //   113: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #134	-> 55
    // Exception table:
    //   from	to	target	type
    //   55	67	70	java/lang/RuntimeException
    //   64	79	79	java/lang/RuntimeException
    //   83	97	100	java/lang/RuntimeException
  }
  
  public static float Vulcan_M(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Float
    //   7: invokevirtual floatValue : ()F
    //   10: fstore #5
    //   12: dup
    //   13: iconst_1
    //   14: aaload
    //   15: checkcast java/lang/Float
    //   18: invokevirtual floatValue : ()F
    //   21: fstore_2
    //   22: dup
    //   23: iconst_2
    //   24: aaload
    //   25: checkcast java/lang/Long
    //   28: invokevirtual longValue : ()J
    //   31: lstore_3
    //   32: dup
    //   33: iconst_3
    //   34: aaload
    //   35: checkcast java/lang/Float
    //   38: invokevirtual floatValue : ()F
    //   41: fstore_1
    //   42: pop
    //   43: getstatic me/frep/vulcan/spigot/Vulcan_I.a : J
    //   46: lload_3
    //   47: lxor
    //   48: lstore_3
    //   49: invokestatic Vulcan_I : ()I
    //   52: istore #6
    //   54: fload #5
    //   56: fload_2
    //   57: fcmpg
    //   58: iload #6
    //   60: ifeq -> 97
    //   63: ifge -> 81
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: fload_2
    //   74: goto -> 106
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: fload #5
    //   83: iload #6
    //   85: ifeq -> 101
    //   88: fload_1
    //   89: fcmpl
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: ifle -> 104
    //   100: fload_1
    //   101: goto -> 106
    //   104: fload #5
    //   106: freturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #143	-> 54
    // Exception table:
    //   from	to	target	type
    //   54	66	69	java/lang/RuntimeException
    //   63	77	77	java/lang/RuntimeException
    //   81	90	93	java/lang/RuntimeException
  }
  
  public static double Vulcan_z(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Double
    //   7: invokevirtual doubleValue : ()D
    //   10: dstore_1
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/Double
    //   17: invokevirtual doubleValue : ()D
    //   20: dstore_3
    //   21: dup
    //   22: iconst_2
    //   23: aaload
    //   24: checkcast java/lang/Double
    //   27: invokevirtual doubleValue : ()D
    //   30: dstore #5
    //   32: dup
    //   33: iconst_3
    //   34: aaload
    //   35: checkcast java/lang/Long
    //   38: invokevirtual longValue : ()J
    //   41: lstore #7
    //   43: pop
    //   44: getstatic me/frep/vulcan/spigot/Vulcan_I.a : J
    //   47: lload #7
    //   49: lxor
    //   50: lstore #7
    //   52: invokestatic Vulcan_I : ()I
    //   55: istore #9
    //   57: dload_1
    //   58: dload_3
    //   59: dcmpg
    //   60: iload #9
    //   62: ifeq -> 99
    //   65: ifge -> 83
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: dload_3
    //   76: goto -> 108
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: dload_1
    //   84: iload #9
    //   86: ifeq -> 104
    //   89: dload #5
    //   91: dcmpl
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: ifle -> 107
    //   102: dload #5
    //   104: goto -> 108
    //   107: dload_1
    //   108: dreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #148	-> 57
    // Exception table:
    //   from	to	target	type
    //   57	68	71	java/lang/RuntimeException
    //   65	79	79	java/lang/RuntimeException
    //   83	92	95	java/lang/RuntimeException
  }
  
  public static double Vulcan_b(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Double
    //   7: invokevirtual doubleValue : ()D
    //   10: dstore_1
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/Long
    //   17: invokevirtual longValue : ()J
    //   20: lstore_3
    //   21: dup
    //   22: iconst_2
    //   23: aaload
    //   24: checkcast java/lang/Double
    //   27: invokevirtual doubleValue : ()D
    //   30: dstore #5
    //   32: dup
    //   33: iconst_3
    //   34: aaload
    //   35: checkcast java/lang/Double
    //   38: invokevirtual doubleValue : ()D
    //   41: dstore #7
    //   43: pop
    //   44: getstatic me/frep/vulcan/spigot/Vulcan_I.a : J
    //   47: lload_3
    //   48: lxor
    //   49: lstore_3
    //   50: invokestatic Vulcan_I : ()I
    //   53: istore #9
    //   55: dload #7
    //   57: dconst_0
    //   58: dcmpg
    //   59: iload #9
    //   61: ifeq -> 98
    //   64: ifge -> 82
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: dload_1
    //   75: goto -> 119
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: dload #7
    //   84: dconst_1
    //   85: iload #9
    //   87: ifeq -> 118
    //   90: dcmpl
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   97: athrow
    //   98: ifle -> 110
    //   101: dload #5
    //   103: goto -> 119
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: dload_1
    //   111: dload #5
    //   113: dload_1
    //   114: dsub
    //   115: dload #7
    //   117: dmul
    //   118: dadd
    //   119: dreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #153	-> 55
    // Exception table:
    //   from	to	target	type
    //   55	67	70	java/lang/RuntimeException
    //   64	78	78	java/lang/RuntimeException
    //   82	91	94	java/lang/RuntimeException
    //   98	106	106	java/lang/RuntimeException
  }
  
  public static double Vulcan_w(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_1
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/Double
    //   17: invokevirtual doubleValue : ()D
    //   20: dstore_3
    //   21: dup
    //   22: iconst_2
    //   23: aaload
    //   24: checkcast java/lang/Double
    //   27: invokevirtual doubleValue : ()D
    //   30: dstore #5
    //   32: pop
    //   33: getstatic me/frep/vulcan/spigot/Vulcan_I.a : J
    //   36: lload_1
    //   37: lxor
    //   38: lstore_1
    //   39: invokestatic Vulcan__ : ()I
    //   42: istore #7
    //   44: dload_3
    //   45: dconst_0
    //   46: dcmpg
    //   47: iload #7
    //   49: ifne -> 69
    //   52: ifge -> 65
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   61: athrow
    //   62: dload_3
    //   63: dneg
    //   64: dstore_3
    //   65: dload #5
    //   67: dconst_0
    //   68: dcmpg
    //   69: iload #7
    //   71: ifne -> 105
    //   74: ifge -> 89
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: dload #5
    //   86: dneg
    //   87: dstore #5
    //   89: dload_3
    //   90: iload #7
    //   92: ifne -> 109
    //   95: dload #5
    //   97: dcmpl
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: ifle -> 112
    //   108: dload_3
    //   109: goto -> 114
    //   112: dload #5
    //   114: dreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #161	-> 44
    //   #163	-> 62
    //   #166	-> 65
    //   #168	-> 84
    //   #171	-> 89
    // Exception table:
    //   from	to	target	type
    //   44	55	58	java/lang/RuntimeException
    //   69	77	80	java/lang/RuntimeException
    //   89	98	101	java/lang/RuntimeException
  }
  
  public static int Vulcan_j(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    int j = ((Integer)paramArrayOfObject[1]).intValue(), i = ((Integer)paramArrayOfObject[2]).intValue();
    l = a ^ l;
    int k = Vulcan_Kr.Vulcan_I();
    try {
      if (k != 0) {
        try {
          if (j < 0) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return j / i;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static int Vulcan_D(Object[] paramArrayOfObject) {
    Random random = (Random)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    int i = ((Integer)paramArrayOfObject[2]).intValue(), j = ((Integer)paramArrayOfObject[3]).intValue();
    l = a ^ l;
    int k = Vulcan_Kr.Vulcan_I();
    try {
      if (k != 0) {
        try {
          if (i >= j) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return random.nextInt(j - i + 1) + i;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static float Vulcan_w(Object[] paramArrayOfObject) {
    Random random = (Random)paramArrayOfObject[0];
    float f1 = ((Float)paramArrayOfObject[1]).floatValue(), f2 = ((Float)paramArrayOfObject[2]).floatValue();
    long l = ((Long)paramArrayOfObject[3]).longValue();
    l = a ^ l;
    int i = Vulcan_Kr.Vulcan__();
    try {
      if (i == 0) {
        try {
          if (f1 >= f2) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return random.nextFloat() * (f2 - f1) + f1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static double Vulcan_a(Object[] paramArrayOfObject) {
    Random random = (Random)paramArrayOfObject[0];
    double d1 = ((Double)paramArrayOfObject[1]).doubleValue(), d2 = ((Double)paramArrayOfObject[2]).doubleValue();
    long l = ((Long)paramArrayOfObject[3]).longValue();
    l = a ^ l;
    int i = Vulcan_Kr.Vulcan__();
    try {
      if (i == 0) {
        try {
          if (d1 >= d2) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return random.nextDouble() * (d2 - d1) + d1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static double Vulcan_B(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast [J
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/vulcan/spigot/Vulcan_I.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: lconst_0
    //   26: lstore #5
    //   28: invokestatic Vulcan_I : ()I
    //   31: aload_3
    //   32: astore #7
    //   34: istore #4
    //   36: aload_3
    //   37: arraylength
    //   38: istore #8
    //   40: iconst_0
    //   41: istore #9
    //   43: iload #9
    //   45: iload #8
    //   47: if_icmpge -> 83
    //   50: aload #7
    //   52: iload #9
    //   54: laload
    //   55: lstore #10
    //   57: lload_1
    //   58: lconst_0
    //   59: lcmp
    //   60: iflt -> 78
    //   63: lload #5
    //   65: lload #10
    //   67: ladd
    //   68: iload #4
    //   70: ifeq -> 85
    //   73: lstore #5
    //   75: iinc #9, 1
    //   78: iload #4
    //   80: ifne -> 43
    //   83: lload #5
    //   85: l2d
    //   86: aload_3
    //   87: arraylength
    //   88: i2d
    //   89: ddiv
    //   90: dreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #199	-> 25
    //   #200	-> 31
    //   #201	-> 36
    //   #203	-> 40
    //   #205	-> 50
    //   #206	-> 57
    //   #203	-> 75
    //   #209	-> 83
  }
  
  public static boolean Vulcan_k(Object[] paramArrayOfObject) {
    float f2 = ((Float)paramArrayOfObject[0]).floatValue(), f1 = ((Float)paramArrayOfObject[1]).floatValue();
    long l1 = ((Long)paramArrayOfObject[2]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0xEF9B7383097L;
    int i = Vulcan_Kr.Vulcan_I();
    try {
      (new Object[2])[1] = Float.valueOf(f1 - f2);
      new Object[2];
      if (i != 0)
        if (Vulcan_m(new Object[] { Long.valueOf(l2) }) < 1.0E-5F) {
        
        } else {
          return false;
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static int Vulcan_E(Object[] paramArrayOfObject) {
    int j = ((Integer)paramArrayOfObject[0]).intValue(), i = ((Integer)paramArrayOfObject[1]).intValue();
    return (j % i + i) % i;
  }
  
  public static float Vulcan_d(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    float f = ((Float)paramArrayOfObject[1]).floatValue();
    l = a ^ l;
    f %= 360.0F;
    int i = Vulcan_Kr.Vulcan_I();
    try {
      if (i != 0) {
        if (f >= 180.0F)
          f -= 360.0F; 
        try {
          if (i != 0) {
          
          } else {
            return f cmp -180.0F;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (f < 180.0F)
      f += 360.0F; 
    return f;
  }
  
  public static double Vulcan__(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    double d = ((Double)paramArrayOfObject[1]).doubleValue();
    l = a ^ l;
    d %= 360.0D;
    int i = Vulcan_Kr.Vulcan_I();
    try {
      if (i != 0) {
        if (d >= 180.0D)
          d -= 360.0D; 
        try {
          if (i != 0) {
          
          } else {
            return d cmp -180.0D;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (d < 180.0D)
      d += 360.0D; 
    return d;
  }
  
  public static int Vulcan_g(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    int i = ((Integer)paramArrayOfObject[1]).intValue();
    try {
      return Integer.parseInt(str);
    } catch (Throwable throwable) {
      return i;
    } 
  }
  
  public static int Vulcan_y(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    int i = ((Integer)paramArrayOfObject[1]).intValue(), j = ((Integer)paramArrayOfObject[2]).intValue();
    return Math.max(j, Vulcan_g(new Object[] { null, Integer.valueOf(i), str }));
  }
  
  public static double Vulcan_E(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    double d = ((Double)paramArrayOfObject[1]).doubleValue();
    try {
      return Double.parseDouble(str);
    } catch (Throwable throwable) {
      return d;
    } 
  }
  
  public static double Vulcan_f(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    double d1 = ((Double)paramArrayOfObject[1]).doubleValue(), d2 = ((Double)paramArrayOfObject[2]).doubleValue();
    new Object[2];
    return Math.max(d2, Vulcan_E(new Object[] { null, Double.valueOf(d1), str }));
  }
  
  public static int Vulcan_l(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue(), j = i - 1;
    j |= j >> 1;
    j |= j >> 2;
    j |= j >> 4;
    j |= j >> 8;
    j |= j >> 16;
    return j + 1;
  }
  
  private static boolean Vulcan_R(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    try {
      if (i != 0)
        try {
          if ((i & i - 1) == 0);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  private static int Vulcan_V(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    int i = ((Integer)paramArrayOfObject[1]).intValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x62D766170292L;
    try {
      new Object[2];
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    i = Vulcan_R(new Object[] { null, Long.valueOf(l2), Integer.valueOf(i) }) ? i : Vulcan_l(new Object[] { Integer.valueOf(i) });
    return Vulcan_b[(int)(i * 125613361L >> 27L) & 0x1F];
  }
  
  public static int Vulcan_x(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    int i = ((Integer)paramArrayOfObject[1]).intValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x3D4A20B553FFL, l3 = l1 ^ 0x77CC67423BAEL;
    try {
      (new Object[2])[1] = Integer.valueOf(i);
      new Object[2];
      new Object[2];
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Vulcan_V(new Object[] { Long.valueOf(l3) }) - (Vulcan_R(new Object[] { null, Long.valueOf(l2), Integer.valueOf(i) }) ? 0 : 1);
  }
  
  public static int Vulcan_P(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Integer
    //   7: invokevirtual intValue : ()I
    //   10: istore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/Long
    //   17: invokevirtual longValue : ()J
    //   20: lstore_3
    //   21: dup
    //   22: iconst_2
    //   23: aaload
    //   24: checkcast java/lang/Integer
    //   27: invokevirtual intValue : ()I
    //   30: istore_1
    //   31: pop
    //   32: getstatic me/frep/vulcan/spigot/Vulcan_I.a : J
    //   35: lload_3
    //   36: lxor
    //   37: lstore_3
    //   38: invokestatic Vulcan_I : ()I
    //   41: istore #5
    //   43: iload_1
    //   44: iload #5
    //   46: ifeq -> 66
    //   49: ifne -> 65
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: iconst_0
    //   60: ireturn
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: iload_2
    //   66: iload #5
    //   68: lload_3
    //   69: lconst_0
    //   70: lcmp
    //   71: ifle -> 96
    //   74: ifeq -> 94
    //   77: ifne -> 93
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: iload_1
    //   88: ireturn
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: iload_2
    //   94: iload #5
    //   96: ifeq -> 116
    //   99: ifge -> 113
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: iload_1
    //   110: iconst_m1
    //   111: imul
    //   112: istore_1
    //   113: iload_2
    //   114: iload_1
    //   115: irem
    //   116: istore #6
    //   118: iload #6
    //   120: iload #5
    //   122: lload_3
    //   123: lconst_0
    //   124: lcmp
    //   125: ifle -> 154
    //   128: ifeq -> 152
    //   131: ifne -> 149
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: iload_2
    //   142: goto -> 155
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: iload_2
    //   150: iload_1
    //   151: iadd
    //   152: iload #6
    //   154: isub
    //   155: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #346	-> 43
    //   #348	-> 59
    //   #350	-> 65
    //   #352	-> 87
    //   #356	-> 93
    //   #358	-> 109
    //   #361	-> 113
    //   #362	-> 118
    // Exception table:
    //   from	to	target	type
    //   43	52	55	java/lang/RuntimeException
    //   49	61	61	java/lang/RuntimeException
    //   66	80	83	java/lang/RuntimeException
    //   77	89	89	java/lang/RuntimeException
    //   94	102	105	java/lang/RuntimeException
    //   118	134	137	java/lang/RuntimeException
    //   131	145	145	java/lang/RuntimeException
  }
  
  public static int Vulcan_L(Object[] paramArrayOfObject) {
    float f3 = ((Float)paramArrayOfObject[0]).floatValue(), f1 = ((Float)paramArrayOfObject[1]).floatValue(), f2 = ((Float)paramArrayOfObject[2]).floatValue();
    long l1 = ((Long)paramArrayOfObject[3]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x63BAF16F0DCCL;
    new Object[2];
    new Object[2];
    new Object[2];
    return Vulcan_H(new Object[] { null, null, Integer.valueOf(Vulcan_F(new Object[] { null, Long.valueOf(l2), Float.valueOf(f2 * 255.0F) })), Integer.valueOf(Vulcan_F(new Object[] { null, Long.valueOf(l2), Float.valueOf(f1 * 255.0F) })), Integer.valueOf(Vulcan_F(new Object[] { null, Long.valueOf(l2), Float.valueOf(f3 * 255.0F) })) });
  }
  
  public static int Vulcan_H(Object[] paramArrayOfObject) {
    int j = ((Integer)paramArrayOfObject[0]).intValue(), i = ((Integer)paramArrayOfObject[1]).intValue(), k = ((Integer)paramArrayOfObject[2]).intValue(), m = (j << 8) + i;
    m = (m << 8) + k;
    return m;
  }
  
  public static int Vulcan_n(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    int j = ((Integer)paramArrayOfObject[1]).intValue(), i = ((Integer)paramArrayOfObject[2]).intValue();
    l = a ^ l;
    int m = (j & 0xFF0000) >> 16;
    int n = (i & 0xFF0000) >> 16;
    int i1 = (j & 0xFF00) >> 8;
    int i2 = (i & 0xFF00) >> 8;
    int i3 = (j & 0xFF) >> 0;
    int i4 = (i & 0xFF) >> 0;
    int i5 = (int)(m * n / 255.0F);
    int i6 = (int)(i1 * i2 / 255.0F);
    int i7 = (int)(i3 * i4 / 255.0F), k = Vulcan_Kr.Vulcan_I();
    try {
      if (AbstractCheck.Vulcan_B() == null)
        Vulcan_Kr.Vulcan_X(++k); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return j & 0xFF000000 | i5 << 16 | i6 << 8 | i7;
  }
  
  public static long Vulcan_e(Object[] paramArrayOfObject) {
    Vulcan_Kr vulcan_Kr = (Vulcan_Kr)paramArrayOfObject[0];
    return Vulcan__(new Object[] { null, null, Integer.valueOf(vulcan_Kr.Vulcan_l(new Object[0])), Integer.valueOf(vulcan_Kr.Vulcan_K(new Object[0])), Integer.valueOf(vulcan_Kr.Vulcan_c(new Object[0])) });
  }
  
  public static long Vulcan__(Object[] paramArrayOfObject) {
    int k = ((Integer)paramArrayOfObject[0]).intValue(), i = ((Integer)paramArrayOfObject[1]).intValue(), j = ((Integer)paramArrayOfObject[2]).intValue();
    long l = (k * 3129871) ^ j * 116129781L ^ i;
    l = l * l * 42317861L + l * 11L;
    return l;
  }
  
  public static UUID Vulcan_z(Object[] paramArrayOfObject) {
    Random random = (Random)paramArrayOfObject[0];
    long l1 = random.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
    long l2 = random.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
    return new UUID(l1, l2);
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
