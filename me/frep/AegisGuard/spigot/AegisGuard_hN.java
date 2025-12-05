package me.frep.aegisguard.spigot.AegisGuard_hN;

enum aegisguard_hN {
  public static final me.frep.aegisguard.spigot.aegisguard_hN NETHERITE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hN DIAMOND;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hN GOLD;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hN IRON;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hN STONE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hN WOOD;
  
  private final int aegisguard_V;
  
  private static final me.frep.aegisguard.spigot.aegisguard_hN[] aegisguard_Q;
  
  static int aegisguard_q(me.frep.aegisguard.spigot.aegisguard_hN paramaegisguard_hN) {
    return paramaegisguard_hN.aegisguard_e();
  }
  
  private static me.frep.aegisguard.spigot.aegisguard_hN[] aegisguard_N() {
    return new me.frep.aegisguard.spigot.aegisguard_hN[] { NETHERITE, DIAMOND, GOLD, IRON, STONE, WOOD };
  }
  
  aegisguard_hN(int paramInt1) {
    this.aegisguard_V = paramInt1;
  }
  
  private int aegisguard_e() {
    return this.aegisguard_V;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #6
    //   7: iconst_0
    //   8: istore #4
    //   10: ldc 'F1zXXK*yQ,yR\\tL=RDV='
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: bipush #7
    //   21: istore_2
    //   22: iconst_m1
    //   23: istore_1
    //   24: bipush #21
    //   26: iinc #1, 1
    //   29: aload_3
    //   30: iload_1
    //   31: dup
    //   32: iload_2
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 135
    //   41: aload #6
    //   43: swap
    //   44: iload #4
    //   46: iinc #4, 1
    //   49: swap
    //   50: aastore
    //   51: iload_1
    //   52: iload_2
    //   53: iadd
    //   54: dup
    //   55: istore_1
    //   56: iload #5
    //   58: if_icmpge -> 70
    //   61: aload_3
    //   62: iload_1
    //   63: invokevirtual charAt : (I)C
    //   66: istore_2
    //   67: goto -> 24
    //   70: ldc '\\tk]/k^/'
    //   72: dup
    //   73: astore_3
    //   74: invokevirtual length : ()I
    //   77: istore #5
    //   79: iconst_4
    //   80: istore_2
    //   81: iconst_m1
    //   82: istore_1
    //   83: bipush #73
    //   85: iinc #1, 1
    //   88: aload_3
    //   89: iload_1
    //   90: dup
    //   91: iload_2
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 135
    //   100: aload #6
    //   102: swap
    //   103: iload #4
    //   105: iinc #4, 1
    //   108: swap
    //   109: aastore
    //   110: iload_1
    //   111: iload_2
    //   112: iadd
    //   113: dup
    //   114: istore_1
    //   115: iload #5
    //   117: if_icmpge -> 129
    //   120: aload_3
    //   121: iload_1
    //   122: invokevirtual charAt : (I)C
    //   125: istore_2
    //   126: goto -> 83
    //   129: aload #6
    //   131: astore_0
    //   132: goto -> 292
    //   135: dup_x2
    //   136: pop
    //   137: invokevirtual toCharArray : ()[C
    //   140: dup_x1
    //   141: arraylength
    //   142: dup_x2
    //   143: pop
    //   144: iconst_0
    //   145: istore #7
    //   147: dup2_x1
    //   148: pop2
    //   149: dup_x2
    //   150: iconst_1
    //   151: if_icmpgt -> 250
    //   154: dup2
    //   155: swap
    //   156: iload #7
    //   158: dup2_x1
    //   159: caload
    //   160: swap
    //   161: iload #7
    //   163: bipush #7
    //   165: irem
    //   166: tableswitch default -> 232, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 228
    //   204: bipush #23
    //   206: goto -> 234
    //   209: bipush #109
    //   211: goto -> 234
    //   214: bipush #91
    //   216: goto -> 234
    //   219: bipush #34
    //   221: goto -> 234
    //   224: iconst_2
    //   225: goto -> 234
    //   228: iconst_3
    //   229: goto -> 234
    //   232: bipush #78
    //   234: ixor
    //   235: ixor
    //   236: i2c
    //   237: castore
    //   238: iinc #7, 1
    //   241: dup
    //   242: ifne -> 250
    //   245: dup2
    //   246: dup_x1
    //   247: goto -> 158
    //   250: dup2_x1
    //   251: pop2
    //   252: dup_x2
    //   253: iload #7
    //   255: if_icmpgt -> 154
    //   258: pop
    //   259: new java/lang/String
    //   262: dup_x1
    //   263: swap
    //   264: invokespecial <init> : ([C)V
    //   267: invokevirtual intern : ()Ljava/lang/String;
    //   270: swap
    //   271: pop
    //   272: swap
    //   273: tableswitch default -> 41, 0 -> 100
    //   292: new me/frep/aegisguard/spigot/aegisguard_hN
    //   295: dup
    //   296: aload_0
    //   297: iconst_3
    //   298: aaload
    //   299: iconst_0
    //   300: bipush #9
    //   302: invokespecial <init> : (Ljava/lang/String;II)V
    //   305: putstatic me/frep/aegisguard/spigot/aegisguard_hN.NETHERITE : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   308: new me/frep/aegisguard/spigot/aegisguard_hN
    //   311: dup
    //   312: aload_0
    //   313: iconst_0
    //   314: aaload
    //   315: iconst_1
    //   316: bipush #8
    //   318: invokespecial <init> : (Ljava/lang/String;II)V
    //   321: putstatic me/frep/aegisguard/spigot/aegisguard_hN.DIAMOND : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   324: new me/frep/aegisguard/spigot/aegisguard_hN
    //   327: dup
    //   328: aload_0
    //   329: iconst_5
    //   330: aaload
    //   331: iconst_2
    //   332: bipush #12
    //   334: invokespecial <init> : (Ljava/lang/String;II)V
    //   337: putstatic me/frep/aegisguard/spigot/aegisguard_hN.GOLD : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   340: new me/frep/aegisguard/spigot/aegisguard_hN
    //   343: dup
    //   344: aload_0
    //   345: iconst_1
    //   346: aaload
    //   347: iconst_3
    //   348: bipush #6
    //   350: invokespecial <init> : (Ljava/lang/String;II)V
    //   353: putstatic me/frep/aegisguard/spigot/aegisguard_hN.IRON : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   356: new me/frep/aegisguard/spigot/aegisguard_hN
    //   359: dup
    //   360: aload_0
    //   361: iconst_2
    //   362: aaload
    //   363: iconst_4
    //   364: iconst_4
    //   365: invokespecial <init> : (Ljava/lang/String;II)V
    //   368: putstatic me/frep/aegisguard/spigot/aegisguard_hN.STONE : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   371: new me/frep/aegisguard/spigot/aegisguard_hN
    //   374: dup
    //   375: aload_0
    //   376: iconst_4
    //   377: aaload
    //   378: iconst_5
    //   379: iconst_2
    //   380: invokespecial <init> : (Ljava/lang/String;II)V
    //   383: putstatic me/frep/aegisguard/spigot/aegisguard_hN.WOOD : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   386: invokestatic aegisguard_N : ()[Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   389: putstatic me/frep/aegisguard/spigot/aegisguard_hN.aegisguard_Q : [Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   392: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #100	-> 292
    //   #101	-> 308
    //   #102	-> 324
    //   #103	-> 340
    //   #104	-> 356
    //   #105	-> 371
    //   #98	-> 386
  }
}
