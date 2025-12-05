package me.frep.aegisguard.spigot.AegisGuard_Kr;

import me.frep.aegisguard.spigot.aegisguard_I;
import me.frep.aegisguard.spigot.aegisguard_m;

public class aegisguard_Kr implements Comparable {
  public static final me.frep.aegisguard.spigot.aegisguard_Kr aegisguard_e;
  
  private final int aegisguard_U;
  
  private final int aegisguard_C;
  
  private final int aegisguard_d;
  
  private static final String aegisguard_l;
  
  private static int aegisguard_I;
  
  private static final long a;
  
  public aegisguard_Kr(int paramInt1, int paramInt2, int paramInt3) {
    this.aegisguard_U = paramInt1;
    this.aegisguard_C = paramInt2;
    this.aegisguard_d = paramInt3;
  }
  
  public aegisguard_Kr(double paramDouble1, double paramDouble2, double paramDouble3) {
    this(aegisguard_I.aegisguard_v(new Object[] { Double.valueOf(paramDouble1) }, ), aegisguard_I.aegisguard_v(new Object[] { Double.valueOf(paramDouble2) }, ), aegisguard_I.aegisguard_v(new Object[] { Double.valueOf(paramDouble3) }));
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_Kr.a : J
    //   3: ldc2_w 14619297928846
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_I : ()I
    //   11: istore #4
    //   13: aload_0
    //   14: iload #4
    //   16: ifeq -> 37
    //   19: aload_1
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifeq -> 62
    //   42: instanceof me/frep/aegisguard/spigot/aegisguard_Kr
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/frep/aegisguard/spigot/aegisguard_Kr
    //   65: astore #5
    //   67: aload_0
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   75: aload #5
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   84: iload #4
    //   86: ifeq -> 124
    //   89: if_icmpeq -> 107
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: iconst_0
    //   100: goto -> 184
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: aload_0
    //   108: iconst_0
    //   109: anewarray java/lang/Object
    //   112: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   115: aload #5
    //   117: iconst_0
    //   118: anewarray java/lang/Object
    //   121: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   124: iload #4
    //   126: ifeq -> 176
    //   129: if_icmpeq -> 147
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: iconst_0
    //   140: goto -> 184
    //   143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   146: athrow
    //   147: aload_0
    //   148: iconst_0
    //   149: anewarray java/lang/Object
    //   152: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   155: iload #4
    //   157: ifeq -> 180
    //   160: aload #5
    //   162: iconst_0
    //   163: anewarray java/lang/Object
    //   166: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: if_icmpne -> 183
    //   179: iconst_1
    //   180: goto -> 184
    //   183: iconst_0
    //   184: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #31	-> 13
    //   #33	-> 30
    //   #35	-> 36
    //   #37	-> 55
    //   #41	-> 61
    //   #42	-> 67
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	48	51	java/lang/RuntimeException
    //   42	57	57	java/lang/RuntimeException
    //   67	92	95	java/lang/RuntimeException
    //   89	103	103	java/lang/RuntimeException
    //   124	132	135	java/lang/RuntimeException
    //   129	143	143	java/lang/RuntimeException
    //   147	169	172	java/lang/RuntimeException
  }
  
  public int hashCode() {
    return (aegisguard_K(new Object[0]) + aegisguard_l(new Object[0]) * 31) * 31 + aegisguard_c(new Object[0]);
  }
  
  public int aegisguard_m(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_Kr
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_Kr.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_I : ()I
    //   29: istore #5
    //   31: aload_0
    //   32: iconst_0
    //   33: anewarray java/lang/Object
    //   36: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   39: aload #4
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   48: iload #5
    //   50: ifeq -> 171
    //   53: if_icmpne -> 154
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: aload_0
    //   64: iconst_0
    //   65: anewarray java/lang/Object
    //   68: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   71: lload_2
    //   72: lconst_0
    //   73: lcmp
    //   74: iflt -> 151
    //   77: aload #4
    //   79: iconst_0
    //   80: anewarray java/lang/Object
    //   83: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   86: iload #5
    //   88: ifeq -> 150
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   97: athrow
    //   98: if_icmpne -> 133
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: aload_0
    //   109: iconst_0
    //   110: anewarray java/lang/Object
    //   113: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   116: aload #4
    //   118: iconst_0
    //   119: anewarray java/lang/Object
    //   122: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   125: isub
    //   126: goto -> 172
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: aload_0
    //   134: iconst_0
    //   135: anewarray java/lang/Object
    //   138: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   141: aload #4
    //   143: iconst_0
    //   144: anewarray java/lang/Object
    //   147: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   150: isub
    //   151: goto -> 172
    //   154: aload_0
    //   155: iconst_0
    //   156: anewarray java/lang/Object
    //   159: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   162: aload #4
    //   164: iconst_0
    //   165: anewarray java/lang/Object
    //   168: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   171: isub
    //   172: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #53	-> 31
    // Exception table:
    //   from	to	target	type
    //   31	56	59	java/lang/RuntimeException
    //   53	91	94	java/lang/RuntimeException
    //   63	101	104	java/lang/RuntimeException
    //   98	129	129	java/lang/RuntimeException
  }
  
  public int aegisguard_c(Object[] paramArrayOfObject) {
    return this.aegisguard_U;
  }
  
  public int aegisguard_K(Object[] paramArrayOfObject) {
    return this.aegisguard_C;
  }
  
  public int aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard_d;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Kr aegisguard_S(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_Kr aegisguard_Kr = (me.frep.aegisguard.spigot.aegisguard_Kr)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_Kr(aegisguard_K(new Object[0]) * aegisguard_Kr.aegisguard_l(new Object[0]) - aegisguard_l(new Object[0]) * aegisguard_Kr.aegisguard_K(new Object[0]), aegisguard_l(new Object[0]) * aegisguard_Kr.aegisguard_c(new Object[0]) - aegisguard_c(new Object[0]) * aegisguard_Kr.aegisguard_l(new Object[0]), aegisguard_c(new Object[0]) * aegisguard_Kr.aegisguard_K(new Object[0]) - aegisguard_K(new Object[0]) * aegisguard_Kr.aegisguard_c(new Object[0]));
  }
  
  public double aegisguard_B(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue(), d4 = aegisguard_c(new Object[0]) - d1;
    double d5 = aegisguard_K(new Object[0]) - d2;
    double d6 = aegisguard_l(new Object[0]) - d3;
    return d4 * d4 + d5 * d5 + d6 * d6;
  }
  
  public double aegisguard_y(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue(), d4 = aegisguard_c(new Object[0]) + 0.5D - d1;
    double d5 = aegisguard_K(new Object[0]) + 0.5D - d2;
    double d6 = aegisguard_l(new Object[0]) + 0.5D - d3;
    return d4 * d4 + d5 * d5 + d6 * d6;
  }
  
  public double aegisguard_W(Object[] paramArrayOfObject) {
    aegisguard_m aegisguard_m = (aegisguard_m)paramArrayOfObject[0];
    new Object[3];
    (new Object[3])[2] = Double.valueOf(aegisguard_m.aegisguard_U(new Object[0]));
    new Object[3];
    (new Object[3])[1] = Double.valueOf(aegisguard_m.aegisguard_b(new Object[0]));
    new Object[3];
    return aegisguard_B(new Object[] { Double.valueOf(aegisguard_m.aegisguard_B(new Object[0])) });
  }
  
  public int compareTo(Object paramObject) {
    long l1 = a ^ 0x3B64429D4A98L, l2 = l1 ^ 0x1E93C7F67B12L;
    (new Object[2])[1] = paramObject;
    new Object[2];
    return aegisguard_m(new Object[] { Long.valueOf(l2) });
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -8313362431666697859
    //   3: ldc2_w -8696338496154986846
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard__;
    //   15: ldc2_w 211596813488885
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/frep/aegisguard/spigot/aegisguard_Kr.a : J
    //   26: invokestatic aegisguard_I : ()I
    //   29: ifne -> 37
    //   32: bipush #6
    //   34: invokestatic aegisguard_X : (I)V
    //   37: bipush #13
    //   39: ldc ':UG`Ek'
    //   41: iconst_m1
    //   42: goto -> 55
    //   45: putstatic me/frep/aegisguard/spigot/aegisguard_Kr.aegisguard_l : Ljava/lang/String;
    //   48: getstatic me/frep/aegisguard/spigot/aegisguard_Kr.aegisguard_l : Ljava/lang/String;
    //   51: pop
    //   52: goto -> 194
    //   55: dup_x2
    //   56: pop
    //   57: invokevirtual toCharArray : ()[C
    //   60: dup_x1
    //   61: arraylength
    //   62: dup_x2
    //   63: pop
    //   64: iconst_0
    //   65: istore_0
    //   66: dup2_x1
    //   67: pop2
    //   68: dup_x2
    //   69: iconst_1
    //   70: if_icmpgt -> 168
    //   73: dup2
    //   74: swap
    //   75: iload_0
    //   76: dup2_x1
    //   77: caload
    //   78: swap
    //   79: iload_0
    //   80: bipush #7
    //   82: irem
    //   83: tableswitch default -> 150, 0 -> 120, 1 -> 125, 2 -> 130, 3 -> 135, 4 -> 140, 5 -> 145
    //   120: bipush #95
    //   122: goto -> 152
    //   125: bipush #123
    //   127: goto -> 152
    //   130: bipush #87
    //   132: goto -> 152
    //   135: bipush #54
    //   137: goto -> 152
    //   140: bipush #104
    //   142: goto -> 152
    //   145: bipush #122
    //   147: goto -> 152
    //   150: bipush #42
    //   152: ixor
    //   153: ixor
    //   154: i2c
    //   155: castore
    //   156: iinc #0, 1
    //   159: dup
    //   160: ifne -> 168
    //   163: dup2
    //   164: dup_x1
    //   165: goto -> 76
    //   168: dup2_x1
    //   169: pop2
    //   170: dup_x2
    //   171: iload_0
    //   172: if_icmpgt -> 73
    //   175: pop
    //   176: new java/lang/String
    //   179: dup_x1
    //   180: swap
    //   181: invokespecial <init> : ([C)V
    //   184: invokevirtual intern : ()Ljava/lang/String;
    //   187: swap
    //   188: pop
    //   189: swap
    //   190: pop
    //   191: goto -> 45
    //   194: new me/frep/aegisguard/spigot/aegisguard_Kr
    //   197: dup
    //   198: iconst_0
    //   199: iconst_0
    //   200: iconst_0
    //   201: invokespecial <init> : (III)V
    //   204: putstatic me/frep/aegisguard/spigot/aegisguard_Kr.aegisguard_e : Lme/frep/aegisguard/spigot/aegisguard_Kr;
    //   207: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #5	-> 194
  }
  
  public static void aegisguard_X(int paramInt) {
    aegisguard_I = paramInt;
  }
  
  public static int aegisguard_I() {
    return aegisguard_I;
  }
  
  public static int aegisguard__() {
    int i = aegisguard_I();
    try {
      if (i == 0)
        return 68; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
