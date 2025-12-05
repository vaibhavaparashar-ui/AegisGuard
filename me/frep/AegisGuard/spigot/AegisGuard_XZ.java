package me.frep.aegisguard.spigot.AegisGuard_XZ;

public enum aegisguard_XZ {
  public static final me.frep.aegisguard.spigot.aegisguard_XZ POSITIVE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_XZ NEGATIVE;
  
  private final int aegisguard_q;
  
  private final String aegisguard_U;
  
  private static final me.frep.aegisguard.spigot.aegisguard_XZ[] aegisguard_c;
  
  private static final String aegisguard_T;
  
  private static final me.frep.aegisguard.spigot.aegisguard_XZ[] aegisguard_C;
  
  private static me.frep.aegisguard.spigot.aegisguard_XZ[] aegisguard_J() {
    return new me.frep.aegisguard.spigot.aegisguard_XZ[] { POSITIVE, NEGATIVE };
  }
  
  aegisguard_XZ(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    this.aegisguard_q = paramInt2;
    this.aegisguard_U = paramString2;
  }
  
  public int aegisguard_n() {
    return this.aegisguard_q;
  }
  
  public String toString() {
    return this.aegisguard_U;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #6
    //   7: iconst_0
    //   8: istore #4
    //   10: ldc '3jsjyB8)@CJ_?g]AQLL/}J\\b-`gbyB8)@CJ_?g]_[XD/}J\\b-`gbyB8'
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: bipush #8
    //   21: istore_2
    //   22: iconst_m1
    //   23: istore_1
    //   24: bipush #70
    //   26: iinc #1, 1
    //   29: aload_3
    //   30: iload_1
    //   31: dup
    //   32: iload_2
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
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
    //   70: ldc '\\nSJS@+{ZR"$Rv%?"'
    //   72: dup
    //   73: astore_3
    //   74: invokevirtual length : ()I
    //   77: istore #5
    //   79: bipush #8
    //   81: istore_2
    //   82: iconst_m1
    //   83: istore_1
    //   84: bipush #127
    //   86: iinc #1, 1
    //   89: aload_3
    //   90: iload_1
    //   91: dup
    //   92: iload_2
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #6
    //   103: swap
    //   104: iload #4
    //   106: iinc #4, 1
    //   109: swap
    //   110: aastore
    //   111: iload_1
    //   112: iload_2
    //   113: iadd
    //   114: dup
    //   115: istore_1
    //   116: iload #5
    //   118: if_icmpge -> 130
    //   121: aload_3
    //   122: iload_1
    //   123: invokevirtual charAt : (I)C
    //   126: istore_2
    //   127: goto -> 84
    //   130: aload #6
    //   132: astore_0
    //   133: aload_0
    //   134: dup
    //   135: bipush #6
    //   137: aaload
    //   138: putstatic me/frep/aegisguard/spigot/aegisguard_XZ.aegisguard_T : Ljava/lang/String;
    //   141: pop
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #7
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #7
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #7
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #59
    //   218: goto -> 248
    //   221: bipush #105
    //   223: goto -> 248
    //   226: bipush #114
    //   228: goto -> 248
    //   231: bipush #109
    //   233: goto -> 248
    //   236: bipush #107
    //   238: goto -> 248
    //   241: bipush #29
    //   243: goto -> 248
    //   246: bipush #82
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #7, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #7
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 41, 0 -> 101
    //   304: new me/frep/aegisguard/spigot/aegisguard_XZ
    //   307: dup
    //   308: aload_0
    //   309: iconst_4
    //   310: aaload
    //   311: iconst_0
    //   312: aload_0
    //   313: iconst_2
    //   314: aaload
    //   315: iconst_0
    //   316: iconst_1
    //   317: aload_0
    //   318: iconst_3
    //   319: aaload
    //   320: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V
    //   323: putstatic me/frep/aegisguard/spigot/aegisguard_XZ.POSITIVE : Lme/frep/aegisguard/spigot/aegisguard_XZ;
    //   326: new me/frep/aegisguard/spigot/aegisguard_XZ
    //   329: dup
    //   330: aload_0
    //   331: iconst_0
    //   332: aaload
    //   333: iconst_1
    //   334: aload_0
    //   335: iconst_5
    //   336: aaload
    //   337: iconst_1
    //   338: iconst_m1
    //   339: aload_0
    //   340: iconst_1
    //   341: aaload
    //   342: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V
    //   345: putstatic me/frep/aegisguard/spigot/aegisguard_XZ.NEGATIVE : Lme/frep/aegisguard/spigot/aegisguard_XZ;
    //   348: invokestatic aegisguard_J : ()[Lme/frep/aegisguard/spigot/aegisguard_XZ;
    //   351: putstatic me/frep/aegisguard/spigot/aegisguard_XZ.aegisguard_C : [Lme/frep/aegisguard/spigot/aegisguard_XZ;
    //   354: iconst_2
    //   355: anewarray me/frep/aegisguard/spigot/aegisguard_XZ
    //   358: dup
    //   359: iconst_0
    //   360: getstatic me/frep/aegisguard/spigot/aegisguard_XZ.POSITIVE : Lme/frep/aegisguard/spigot/aegisguard_XZ;
    //   363: aastore
    //   364: dup
    //   365: iconst_1
    //   366: getstatic me/frep/aegisguard/spigot/aegisguard_XZ.NEGATIVE : Lme/frep/aegisguard/spigot/aegisguard_XZ;
    //   369: aastore
    //   370: putstatic me/frep/aegisguard/spigot/aegisguard_XZ.aegisguard_c : [Lme/frep/aegisguard/spigot/aegisguard_XZ;
    //   373: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #428	-> 304
    //   #429	-> 326
    //   #427	-> 348
    //   #433	-> 354
  }
}
