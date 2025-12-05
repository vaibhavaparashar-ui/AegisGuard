package me.frep.aegisguard.spigot.AegisGuard_Kc;

final class aegisguard_Kc {
  static final int[] aegisguard_g;
  
  static final int[] aegisguard_h;
  
  static final int[] aegisguard_L;
  
  private static final String aegisguard_m;
  
  static {
    // Byte code:
    //   0: bipush #50
    //   2: ldc '"DcbxOF'
    //   4: iconst_m1
    //   5: goto -> 18
    //   8: putstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_m : Ljava/lang/String;
    //   11: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_m : Ljava/lang/String;
    //   14: pop
    //   15: goto -> 158
    //   18: dup_x2
    //   19: pop
    //   20: invokevirtual toCharArray : ()[C
    //   23: dup_x1
    //   24: arraylength
    //   25: dup_x2
    //   26: pop
    //   27: iconst_0
    //   28: istore_0
    //   29: dup2_x1
    //   30: pop2
    //   31: dup_x2
    //   32: iconst_1
    //   33: if_icmpgt -> 132
    //   36: dup2
    //   37: swap
    //   38: iload_0
    //   39: dup2_x1
    //   40: caload
    //   41: swap
    //   42: iload_0
    //   43: bipush #7
    //   45: irem
    //   46: tableswitch default -> 114, 0 -> 84, 1 -> 89, 2 -> 94, 3 -> 99, 4 -> 104, 5 -> 109
    //   84: bipush #98
    //   86: goto -> 116
    //   89: bipush #121
    //   91: goto -> 116
    //   94: bipush #79
    //   96: goto -> 116
    //   99: bipush #70
    //   101: goto -> 116
    //   104: bipush #97
    //   106: goto -> 116
    //   109: bipush #25
    //   111: goto -> 116
    //   114: bipush #9
    //   116: ixor
    //   117: ixor
    //   118: i2c
    //   119: castore
    //   120: iinc #0, 1
    //   123: dup
    //   124: ifne -> 132
    //   127: dup2
    //   128: dup_x1
    //   129: goto -> 39
    //   132: dup2_x1
    //   133: pop2
    //   134: dup_x2
    //   135: iload_0
    //   136: if_icmpgt -> 36
    //   139: pop
    //   140: new java/lang/String
    //   143: dup_x1
    //   144: swap
    //   145: invokespecial <init> : ([C)V
    //   148: invokevirtual intern : ()Ljava/lang/String;
    //   151: swap
    //   152: pop
    //   153: swap
    //   154: pop
    //   155: goto -> 8
    //   158: invokestatic values : ()[Lme/frep/aegisguard/spigot/aegisguard_Xm;
    //   161: arraylength
    //   162: newarray int
    //   164: putstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_L : [I
    //   167: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_L : [I
    //   170: getstatic me/frep/aegisguard/spigot/aegisguard_Xm.HORIZONTAL : Lme/frep/aegisguard/spigot/aegisguard_Xm;
    //   173: invokevirtual ordinal : ()I
    //   176: iconst_1
    //   177: iastore
    //   178: goto -> 182
    //   181: astore_1
    //   182: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_L : [I
    //   185: getstatic me/frep/aegisguard/spigot/aegisguard_Xm.VERTICAL : Lme/frep/aegisguard/spigot/aegisguard_Xm;
    //   188: invokevirtual ordinal : ()I
    //   191: iconst_2
    //   192: iastore
    //   193: goto -> 197
    //   196: astore_1
    //   197: invokestatic values : ()[Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   200: arraylength
    //   201: newarray int
    //   203: putstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_h : [I
    //   206: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_h : [I
    //   209: getstatic me/frep/aegisguard/spigot/aegisguard_hq.NORTH : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   212: invokevirtual ordinal : ()I
    //   215: iconst_1
    //   216: iastore
    //   217: goto -> 221
    //   220: astore_1
    //   221: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_h : [I
    //   224: getstatic me/frep/aegisguard/spigot/aegisguard_hq.EAST : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   227: invokevirtual ordinal : ()I
    //   230: iconst_2
    //   231: iastore
    //   232: goto -> 236
    //   235: astore_1
    //   236: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_h : [I
    //   239: getstatic me/frep/aegisguard/spigot/aegisguard_hq.SOUTH : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   242: invokevirtual ordinal : ()I
    //   245: iconst_3
    //   246: iastore
    //   247: goto -> 251
    //   250: astore_1
    //   251: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_h : [I
    //   254: getstatic me/frep/aegisguard/spigot/aegisguard_hq.WEST : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   257: invokevirtual ordinal : ()I
    //   260: iconst_4
    //   261: iastore
    //   262: goto -> 266
    //   265: astore_1
    //   266: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_h : [I
    //   269: getstatic me/frep/aegisguard/spigot/aegisguard_hq.UP : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   272: invokevirtual ordinal : ()I
    //   275: iconst_5
    //   276: iastore
    //   277: goto -> 281
    //   280: astore_1
    //   281: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_h : [I
    //   284: getstatic me/frep/aegisguard/spigot/aegisguard_hq.DOWN : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   287: invokevirtual ordinal : ()I
    //   290: bipush #6
    //   292: iastore
    //   293: goto -> 297
    //   296: astore_1
    //   297: invokestatic values : ()[Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   300: arraylength
    //   301: newarray int
    //   303: putstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_g : [I
    //   306: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_g : [I
    //   309: getstatic me/frep/aegisguard/spigot/aegisguard_KN.X : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   312: invokevirtual ordinal : ()I
    //   315: iconst_1
    //   316: iastore
    //   317: goto -> 321
    //   320: astore_1
    //   321: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_g : [I
    //   324: getstatic me/frep/aegisguard/spigot/aegisguard_KN.Y : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   327: invokevirtual ordinal : ()I
    //   330: iconst_2
    //   331: iastore
    //   332: goto -> 336
    //   335: astore_1
    //   336: getstatic me/frep/aegisguard/spigot/aegisguard_Kc.aegisguard_g : [I
    //   339: getstatic me/frep/aegisguard/spigot/aegisguard_KN.Z : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   342: invokevirtual ordinal : ()I
    //   345: iconst_3
    //   346: iastore
    //   347: goto -> 351
    //   350: astore_1
    //   351: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #502	-> 158
    //   #507	-> 167
    //   #512	-> 178
    //   #509	-> 181
    //   #515	-> 182
    //   #520	-> 193
    //   #517	-> 196
    //   #522	-> 197
    //   #525	-> 206
    //   #530	-> 217
    //   #527	-> 220
    //   #533	-> 221
    //   #538	-> 232
    //   #535	-> 235
    //   #541	-> 236
    //   #546	-> 247
    //   #543	-> 250
    //   #549	-> 251
    //   #554	-> 262
    //   #551	-> 265
    //   #557	-> 266
    //   #562	-> 277
    //   #559	-> 280
    //   #565	-> 281
    //   #570	-> 293
    //   #567	-> 296
    //   #572	-> 297
    //   #575	-> 306
    //   #580	-> 317
    //   #577	-> 320
    //   #583	-> 321
    //   #588	-> 332
    //   #585	-> 335
    //   #591	-> 336
    //   #596	-> 347
    //   #593	-> 350
    //   #597	-> 351
    // Exception table:
    //   from	to	target	type
    //   167	178	181	java/lang/NoSuchFieldError
    //   182	193	196	java/lang/NoSuchFieldError
    //   206	217	220	java/lang/NoSuchFieldError
    //   221	232	235	java/lang/NoSuchFieldError
    //   236	247	250	java/lang/NoSuchFieldError
    //   251	262	265	java/lang/NoSuchFieldError
    //   266	277	280	java/lang/NoSuchFieldError
    //   281	293	296	java/lang/NoSuchFieldError
    //   306	317	320	java/lang/NoSuchFieldError
    //   321	332	335	java/lang/NoSuchFieldError
    //   336	347	350	java/lang/NoSuchFieldError
  }
}
