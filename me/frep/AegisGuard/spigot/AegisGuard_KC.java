package me.frep.aegisguard.spigot.AegisGuard_KC;

import com.google.common.collect.AbstractIterator;
import me.frep.aegisguard.spigot.aegisguard_Km;
import me.frep.aegisguard.spigot.aegisguard_d;

class aegisguard_KC extends AbstractIterator {
  private aegisguard_Km aegisguard_h = null;
  
  private static final String aegisguard_D;
  
  final aegisguard_d aegisguard_E;
  
  private static final long a;
  
  aegisguard_KC(aegisguard_d paramaegisguard_d) {}
  
  protected aegisguard_Km aegisguard_f(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_KC.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic aegisguard__ : ()I
    //   21: istore #4
    //   23: aload_0
    //   24: getfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   27: iload #4
    //   29: ifne -> 66
    //   32: ifnonnull -> 62
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: aload_0
    //   43: aload_0
    //   44: getfield aegisguard_E : Lme/frep/aegisguard/spigot/aegisguard_d;
    //   47: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   50: putfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   53: aload_0
    //   54: getfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   57: areturn
    //   58: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   61: athrow
    //   62: aload_0
    //   63: getfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   66: aload_0
    //   67: getfield aegisguard_E : Lme/frep/aegisguard/spigot/aegisguard_d;
    //   70: getfield aegisguard_y : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   73: invokevirtual equals : (Ljava/lang/Object;)Z
    //   76: iload #4
    //   78: ifne -> 114
    //   81: ifeq -> 103
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: aload_0
    //   92: invokevirtual endOfData : ()Ljava/lang/Object;
    //   95: checkcast me/frep/aegisguard/spigot/aegisguard_Km
    //   98: areturn
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: aload_0
    //   104: getfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   107: iconst_0
    //   108: anewarray java/lang/Object
    //   111: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   114: istore #5
    //   116: aload_0
    //   117: getfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   120: iconst_0
    //   121: anewarray java/lang/Object
    //   124: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   127: istore #6
    //   129: aload_0
    //   130: getfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   133: iconst_0
    //   134: anewarray java/lang/Object
    //   137: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   140: istore #7
    //   142: iload #5
    //   144: aload_0
    //   145: getfield aegisguard_E : Lme/frep/aegisguard/spigot/aegisguard_d;
    //   148: getfield aegisguard_y : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   151: iconst_0
    //   152: anewarray java/lang/Object
    //   155: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   158: iload #4
    //   160: lload_2
    //   161: lconst_0
    //   162: lcmp
    //   163: ifle -> 225
    //   166: ifne -> 223
    //   169: if_icmpge -> 200
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: iinc #5, 1
    //   182: lload_2
    //   183: lconst_0
    //   184: lcmp
    //   185: ifle -> 364
    //   188: iload #4
    //   190: ifeq -> 347
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   199: athrow
    //   200: iload #6
    //   202: aload_0
    //   203: getfield aegisguard_E : Lme/frep/aegisguard/spigot/aegisguard_d;
    //   206: getfield aegisguard_y : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   209: iconst_0
    //   210: anewarray java/lang/Object
    //   213: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   222: athrow
    //   223: iload #4
    //   225: ifne -> 309
    //   228: if_icmpge -> 268
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   237: athrow
    //   238: aload_0
    //   239: getfield aegisguard_E : Lme/frep/aegisguard/spigot/aegisguard_d;
    //   242: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   245: iconst_0
    //   246: anewarray java/lang/Object
    //   249: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   252: istore #5
    //   254: iinc #6, 1
    //   257: lload_2
    //   258: lconst_0
    //   259: lcmp
    //   260: iflt -> 364
    //   263: iload #4
    //   265: ifeq -> 347
    //   268: lload_2
    //   269: lconst_0
    //   270: lcmp
    //   271: iflt -> 344
    //   274: iload #7
    //   276: iload #4
    //   278: ifne -> 342
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   287: athrow
    //   288: aload_0
    //   289: getfield aegisguard_E : Lme/frep/aegisguard/spigot/aegisguard_d;
    //   292: getfield aegisguard_y : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   295: iconst_0
    //   296: anewarray java/lang/Object
    //   299: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   308: athrow
    //   309: if_icmpge -> 347
    //   312: aload_0
    //   313: getfield aegisguard_E : Lme/frep/aegisguard/spigot/aegisguard_d;
    //   316: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   319: iconst_0
    //   320: anewarray java/lang/Object
    //   323: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   326: istore #5
    //   328: aload_0
    //   329: getfield aegisguard_E : Lme/frep/aegisguard/spigot/aegisguard_d;
    //   332: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   335: iconst_0
    //   336: anewarray java/lang/Object
    //   339: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   342: istore #6
    //   344: iinc #7, 1
    //   347: aload_0
    //   348: new me/frep/aegisguard/spigot/aegisguard_Km
    //   351: dup
    //   352: iload #5
    //   354: iload #6
    //   356: iload #7
    //   358: invokespecial <init> : (III)V
    //   361: putfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   364: aload_0
    //   365: getfield aegisguard_h : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   368: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #268	-> 23
    //   #270	-> 42
    //   #271	-> 53
    //   #273	-> 62
    //   #275	-> 91
    //   #279	-> 103
    //   #280	-> 116
    //   #281	-> 129
    //   #283	-> 142
    //   #285	-> 179
    //   #287	-> 200
    //   #289	-> 238
    //   #290	-> 254
    //   #292	-> 268
    //   #294	-> 312
    //   #295	-> 328
    //   #296	-> 344
    //   #299	-> 347
    //   #300	-> 364
    // Exception table:
    //   from	to	target	type
    //   23	35	38	java/lang/RuntimeException
    //   32	58	58	java/lang/RuntimeException
    //   66	84	87	java/lang/RuntimeException
    //   81	99	99	java/lang/RuntimeException
    //   142	172	175	java/lang/RuntimeException
    //   169	193	196	java/lang/RuntimeException
    //   179	216	219	java/lang/RuntimeException
    //   223	231	234	java/lang/RuntimeException
    //   254	281	284	java/lang/RuntimeException
    //   268	302	305	java/lang/RuntimeException
  }
  
  protected Object computeNext() {
    long l1 = a ^ 0x4B81C3B2BF12L, l2 = l1 ^ 0x1E434F6A94AEL;
    new Object[1];
    return aegisguard_f(new Object[] { Long.valueOf(l2) });
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -5402659093808430406
    //   3: ldc2_w -888900117878790883
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard__;
    //   15: ldc2_w 194661392873340
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/frep/aegisguard/spigot/aegisguard_KC.a : J
    //   26: bipush #118
    //   28: ldc '\\fr4H!(}\\rs6'
    //   30: iconst_m1
    //   31: goto -> 44
    //   34: putstatic me/frep/aegisguard/spigot/aegisguard_KC.aegisguard_D : Ljava/lang/String;
    //   37: getstatic me/frep/aegisguard/spigot/aegisguard_KC.aegisguard_D : Ljava/lang/String;
    //   40: pop
    //   41: goto -> 186
    //   44: dup_x2
    //   45: pop
    //   46: invokevirtual toCharArray : ()[C
    //   49: dup_x1
    //   50: arraylength
    //   51: dup_x2
    //   52: pop
    //   53: iconst_0
    //   54: istore_0
    //   55: dup2_x1
    //   56: pop2
    //   57: dup_x2
    //   58: iconst_1
    //   59: if_icmpgt -> 160
    //   62: dup2
    //   63: swap
    //   64: iload_0
    //   65: dup2_x1
    //   66: caload
    //   67: swap
    //   68: iload_0
    //   69: bipush #7
    //   71: irem
    //   72: tableswitch default -> 142, 0 -> 112, 1 -> 117, 2 -> 122, 3 -> 127, 4 -> 132, 5 -> 137
    //   112: bipush #57
    //   114: goto -> 144
    //   117: bipush #72
    //   119: goto -> 144
    //   122: bipush #54
    //   124: goto -> 144
    //   127: bipush #114
    //   129: goto -> 144
    //   132: bipush #14
    //   134: goto -> 144
    //   137: bipush #103
    //   139: goto -> 144
    //   142: bipush #110
    //   144: ixor
    //   145: ixor
    //   146: i2c
    //   147: castore
    //   148: iinc #0, 1
    //   151: dup
    //   152: ifne -> 160
    //   155: dup2
    //   156: dup_x1
    //   157: goto -> 65
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iload_0
    //   164: if_icmpgt -> 62
    //   167: pop
    //   168: new java/lang/String
    //   171: dup_x1
    //   172: swap
    //   173: invokespecial <init> : ([C)V
    //   176: invokevirtual intern : ()Ljava/lang/String;
    //   179: swap
    //   180: pop
    //   181: swap
    //   182: pop
    //   183: goto -> 34
    //   186: return
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
