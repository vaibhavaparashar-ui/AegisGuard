package me.frep.aegisguard.spigot.AegisGuard_Xw;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_e;

public final class aegisguard_Xw {
  private static final long a = aegisguard_e.a(-6648559983300230794L, 3970955063840510936L, MethodHandles.lookup().lookupClass()).a(58765648071422L);
  
  private static final String[] b;
  
  private aegisguard_Xw() {
    throw new UnsupportedOperationException(b[31]);
  }
  
  public static long aegisguard_k(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_3
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/block/Block
    //   17: astore_1
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast org/bukkit/entity/Player
    //   24: astore_2
    //   25: pop
    //   26: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.a : J
    //   29: lload_3
    //   30: lxor
    //   31: lstore_3
    //   32: lload_3
    //   33: dup2
    //   34: ldc2_w 115814032147192
    //   37: lxor
    //   38: lstore #5
    //   40: dup2
    //   41: ldc2_w 110013261411457
    //   44: lxor
    //   45: lstore #7
    //   47: pop2
    //   48: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   51: astore #9
    //   53: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   56: aload_1
    //   57: invokeinterface getType : ()Lorg/bukkit/Material;
    //   62: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   67: ifne -> 76
    //   70: lconst_0
    //   71: lreturn
    //   72: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   75: athrow
    //   76: aload_2
    //   77: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   82: astore #10
    //   84: aload #10
    //   86: invokevirtual getType : ()Lorg/bukkit/Material;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   95: iconst_0
    //   96: aaload
    //   97: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   100: aload #9
    //   102: lload_3
    //   103: lconst_0
    //   104: lcmp
    //   105: ifle -> 142
    //   108: ifnonnull -> 140
    //   111: ifeq -> 127
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   120: athrow
    //   121: lconst_0
    //   122: lreturn
    //   123: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   126: athrow
    //   127: aload_1
    //   128: aload #10
    //   130: invokeinterface getDrops : (Lorg/bukkit/inventory/ItemStack;)Ljava/util/Collection;
    //   135: invokeinterface isEmpty : ()Z
    //   140: aload #9
    //   142: ifnonnull -> 156
    //   145: ifne -> 159
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   154: athrow
    //   155: iconst_1
    //   156: goto -> 160
    //   159: iconst_0
    //   160: istore #11
    //   162: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   165: aload_1
    //   166: invokeinterface getType : ()Lorg/bukkit/Material;
    //   171: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   176: checkcast java/lang/Float
    //   179: invokevirtual floatValue : ()F
    //   182: f2d
    //   183: iload #11
    //   185: ifeq -> 198
    //   188: ldc2_w 1.5
    //   191: goto -> 201
    //   194: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   197: athrow
    //   198: ldc2_w 5.0
    //   201: dmul
    //   202: dstore #12
    //   204: aload #10
    //   206: lload #7
    //   208: iconst_2
    //   209: anewarray java/lang/Object
    //   212: dup_x2
    //   213: dup_x2
    //   214: pop
    //   215: invokestatic valueOf : (J)Ljava/lang/Long;
    //   218: iconst_1
    //   219: swap
    //   220: aastore
    //   221: dup_x1
    //   222: swap
    //   223: iconst_0
    //   224: swap
    //   225: aastore
    //   226: invokestatic aegisguard_Y : ([Ljava/lang/Object;)I
    //   229: i2d
    //   230: dstore #14
    //   232: aload #10
    //   234: getstatic org/bukkit/enchantments/Enchantment.DIG_SPEED : Lorg/bukkit/enchantments/Enchantment;
    //   237: invokevirtual containsEnchantment : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   240: aload #9
    //   242: lload_3
    //   243: lconst_0
    //   244: lcmp
    //   245: iflt -> 296
    //   248: ifnonnull -> 294
    //   251: ifeq -> 285
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   260: athrow
    //   261: aload #10
    //   263: getstatic org/bukkit/enchantments/Enchantment.DIG_SPEED : Lorg/bukkit/enchantments/Enchantment;
    //   266: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
    //   269: istore #16
    //   271: dload #14
    //   273: iload #16
    //   275: iload #16
    //   277: imul
    //   278: iconst_1
    //   279: iadd
    //   280: i2f
    //   281: f2d
    //   282: dadd
    //   283: dstore #14
    //   285: aload_2
    //   286: getstatic org/bukkit/potion/PotionEffectType.FAST_DIGGING : Lorg/bukkit/potion/PotionEffectType;
    //   289: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   294: aload #9
    //   296: ifnonnull -> 362
    //   299: ifeq -> 353
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   308: athrow
    //   309: dload #14
    //   311: dconst_1
    //   312: ldc2_w 0.2
    //   315: aload_2
    //   316: lload #5
    //   318: getstatic org/bukkit/potion/PotionEffectType.FAST_DIGGING : Lorg/bukkit/potion/PotionEffectType;
    //   321: iconst_3
    //   322: anewarray java/lang/Object
    //   325: dup_x1
    //   326: swap
    //   327: iconst_2
    //   328: swap
    //   329: aastore
    //   330: dup_x2
    //   331: dup_x2
    //   332: pop
    //   333: invokestatic valueOf : (J)Ljava/lang/Long;
    //   336: iconst_1
    //   337: swap
    //   338: aastore
    //   339: dup_x1
    //   340: swap
    //   341: iconst_0
    //   342: swap
    //   343: aastore
    //   344: invokestatic aegisguard_F : ([Ljava/lang/Object;)I
    //   347: i2d
    //   348: dmul
    //   349: dadd
    //   350: dmul
    //   351: dstore #14
    //   353: aload_2
    //   354: getstatic org/bukkit/potion/PotionEffectType.SLOW_DIGGING : Lorg/bukkit/potion/PotionEffectType;
    //   357: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   362: ifeq -> 405
    //   365: dload #14
    //   367: iconst_3
    //   368: aload_2
    //   369: lload #5
    //   371: getstatic org/bukkit/potion/PotionEffectType.SLOW_DIGGING : Lorg/bukkit/potion/PotionEffectType;
    //   374: iconst_3
    //   375: anewarray java/lang/Object
    //   378: dup_x1
    //   379: swap
    //   380: iconst_2
    //   381: swap
    //   382: aastore
    //   383: dup_x2
    //   384: dup_x2
    //   385: pop
    //   386: invokestatic valueOf : (J)Ljava/lang/Long;
    //   389: iconst_1
    //   390: swap
    //   391: aastore
    //   392: dup_x1
    //   393: swap
    //   394: iconst_0
    //   395: swap
    //   396: aastore
    //   397: invokestatic aegisguard_F : ([Ljava/lang/Object;)I
    //   400: ixor
    //   401: i2d
    //   402: ddiv
    //   403: dstore #14
    //   405: dload #12
    //   407: dload #14
    //   409: ddiv
    //   410: dstore #12
    //   412: dload #12
    //   414: ldc2_w 1000.0
    //   417: dmul
    //   418: d2l
    //   419: lreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #15	-> 53
    //   #17	-> 76
    //   #19	-> 84
    //   #21	-> 127
    //   #23	-> 162
    //   #25	-> 204
    //   #27	-> 232
    //   #29	-> 261
    //   #31	-> 271
    //   #34	-> 285
    //   #36	-> 353
    //   #38	-> 405
    //   #40	-> 412
    // Exception table:
    //   from	to	target	type
    //   53	72	72	java/lang/UnsupportedOperationException
    //   84	114	117	java/lang/UnsupportedOperationException
    //   111	123	123	java/lang/UnsupportedOperationException
    //   140	148	151	java/lang/UnsupportedOperationException
    //   162	194	194	java/lang/UnsupportedOperationException
    //   232	254	257	java/lang/UnsupportedOperationException
    //   294	302	305	java/lang/UnsupportedOperationException
  }
  
  private static int aegisguard_Y(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/inventory/ItemStack
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: aload_3
    //   29: invokevirtual getType : ()Lorg/bukkit/Material;
    //   32: invokevirtual name : ()Ljava/lang/String;
    //   35: astore #6
    //   37: astore #4
    //   39: iconst_m1
    //   40: istore #7
    //   42: aload #6
    //   44: invokevirtual hashCode : ()I
    //   47: aload #4
    //   49: ifnonnull -> 1790
    //   52: lookupswitch default -> 1788, -2004951435 -> 978, -2004114189 -> 1025, -1850063282 -> 1745, -1474660721 -> 1457, -1376059913 -> 1697, -1092987765 -> 594, -1048733105 -> 1553, -955115213 -> 502, -541889864 -> 1409, -487815164 -> 690, -374280293 -> 882, -262974918 -> 1361, -170122909 -> 1265, -95218994 -> 455, 70353908 -> 642, 122966710 -> 316, 206638182 -> 1649, 346690796 -> 786, 427049884 -> 834, 430758414 -> 1313, 470163933 -> 548, 473626359 -> 363, 726388316 -> 930, 872992337 -> 1073, 1263725840 -> 1169, 1336224762 -> 409, 1542325061 -> 738, 1788665440 -> 1121, 1842058393 -> 1505, 2103862626 -> 1601, 2118280994 -> 1217
    //   312: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   315: athrow
    //   316: aload #6
    //   318: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   321: bipush #9
    //   323: aaload
    //   324: invokevirtual equals : (Ljava/lang/Object;)Z
    //   327: aload #4
    //   329: ifnonnull -> 1790
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   338: athrow
    //   339: ifeq -> 1788
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   348: athrow
    //   349: iconst_0
    //   350: istore #7
    //   352: lload_1
    //   353: lconst_0
    //   354: lcmp
    //   355: ifle -> 363
    //   358: aload #4
    //   360: ifnull -> 1788
    //   363: aload #6
    //   365: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   368: iconst_3
    //   369: aaload
    //   370: invokevirtual equals : (Ljava/lang/Object;)Z
    //   373: aload #4
    //   375: ifnonnull -> 1790
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   384: athrow
    //   385: ifeq -> 1788
    //   388: goto -> 395
    //   391: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   394: athrow
    //   395: iconst_1
    //   396: istore #7
    //   398: lload_1
    //   399: lconst_0
    //   400: lcmp
    //   401: iflt -> 409
    //   404: aload #4
    //   406: ifnull -> 1788
    //   409: aload #6
    //   411: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   414: iconst_5
    //   415: aaload
    //   416: invokevirtual equals : (Ljava/lang/Object;)Z
    //   419: aload #4
    //   421: ifnonnull -> 1790
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   430: athrow
    //   431: ifeq -> 1788
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   440: athrow
    //   441: iconst_2
    //   442: istore #7
    //   444: lload_1
    //   445: lconst_0
    //   446: lcmp
    //   447: ifle -> 455
    //   450: aload #4
    //   452: ifnull -> 1788
    //   455: aload #6
    //   457: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   460: bipush #10
    //   462: aaload
    //   463: invokevirtual equals : (Ljava/lang/Object;)Z
    //   466: aload #4
    //   468: ifnonnull -> 1790
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   477: athrow
    //   478: ifeq -> 1788
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   487: athrow
    //   488: iconst_3
    //   489: istore #7
    //   491: lload_1
    //   492: lconst_0
    //   493: lcmp
    //   494: iflt -> 502
    //   497: aload #4
    //   499: ifnull -> 1788
    //   502: aload #6
    //   504: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   507: iconst_4
    //   508: aaload
    //   509: invokevirtual equals : (Ljava/lang/Object;)Z
    //   512: aload #4
    //   514: ifnonnull -> 1790
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   523: athrow
    //   524: ifeq -> 1788
    //   527: goto -> 534
    //   530: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   533: athrow
    //   534: iconst_4
    //   535: istore #7
    //   537: lload_1
    //   538: lconst_0
    //   539: lcmp
    //   540: ifle -> 548
    //   543: aload #4
    //   545: ifnull -> 1788
    //   548: aload #6
    //   550: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   553: iconst_1
    //   554: aaload
    //   555: invokevirtual equals : (Ljava/lang/Object;)Z
    //   558: aload #4
    //   560: ifnonnull -> 1790
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   569: athrow
    //   570: ifeq -> 1788
    //   573: goto -> 580
    //   576: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   579: athrow
    //   580: iconst_5
    //   581: istore #7
    //   583: lload_1
    //   584: lconst_0
    //   585: lcmp
    //   586: ifle -> 594
    //   589: aload #4
    //   591: ifnull -> 1788
    //   594: aload #6
    //   596: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   599: bipush #17
    //   601: aaload
    //   602: invokevirtual equals : (Ljava/lang/Object;)Z
    //   605: aload #4
    //   607: ifnonnull -> 1790
    //   610: goto -> 617
    //   613: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   616: athrow
    //   617: ifeq -> 1788
    //   620: goto -> 627
    //   623: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   626: athrow
    //   627: bipush #6
    //   629: istore #7
    //   631: lload_1
    //   632: lconst_0
    //   633: lcmp
    //   634: iflt -> 642
    //   637: aload #4
    //   639: ifnull -> 1788
    //   642: aload #6
    //   644: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   647: bipush #28
    //   649: aaload
    //   650: invokevirtual equals : (Ljava/lang/Object;)Z
    //   653: aload #4
    //   655: ifnonnull -> 1790
    //   658: goto -> 665
    //   661: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   664: athrow
    //   665: ifeq -> 1788
    //   668: goto -> 675
    //   671: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   674: athrow
    //   675: bipush #7
    //   677: istore #7
    //   679: lload_1
    //   680: lconst_0
    //   681: lcmp
    //   682: iflt -> 690
    //   685: aload #4
    //   687: ifnull -> 1788
    //   690: aload #6
    //   692: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   695: bipush #26
    //   697: aaload
    //   698: invokevirtual equals : (Ljava/lang/Object;)Z
    //   701: aload #4
    //   703: ifnonnull -> 1790
    //   706: goto -> 713
    //   709: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   712: athrow
    //   713: ifeq -> 1788
    //   716: goto -> 723
    //   719: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   722: athrow
    //   723: bipush #8
    //   725: istore #7
    //   727: lload_1
    //   728: lconst_0
    //   729: lcmp
    //   730: iflt -> 738
    //   733: aload #4
    //   735: ifnull -> 1788
    //   738: aload #6
    //   740: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   743: bipush #27
    //   745: aaload
    //   746: invokevirtual equals : (Ljava/lang/Object;)Z
    //   749: aload #4
    //   751: ifnonnull -> 1790
    //   754: goto -> 761
    //   757: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   760: athrow
    //   761: ifeq -> 1788
    //   764: goto -> 771
    //   767: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   770: athrow
    //   771: bipush #9
    //   773: istore #7
    //   775: lload_1
    //   776: lconst_0
    //   777: lcmp
    //   778: iflt -> 786
    //   781: aload #4
    //   783: ifnull -> 1788
    //   786: aload #6
    //   788: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   791: bipush #11
    //   793: aaload
    //   794: invokevirtual equals : (Ljava/lang/Object;)Z
    //   797: aload #4
    //   799: ifnonnull -> 1790
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   808: athrow
    //   809: ifeq -> 1788
    //   812: goto -> 819
    //   815: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   818: athrow
    //   819: bipush #10
    //   821: istore #7
    //   823: lload_1
    //   824: lconst_0
    //   825: lcmp
    //   826: ifle -> 834
    //   829: aload #4
    //   831: ifnull -> 1788
    //   834: aload #6
    //   836: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   839: bipush #20
    //   841: aaload
    //   842: invokevirtual equals : (Ljava/lang/Object;)Z
    //   845: aload #4
    //   847: ifnonnull -> 1790
    //   850: goto -> 857
    //   853: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   856: athrow
    //   857: ifeq -> 1788
    //   860: goto -> 867
    //   863: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   866: athrow
    //   867: bipush #11
    //   869: istore #7
    //   871: lload_1
    //   872: lconst_0
    //   873: lcmp
    //   874: ifle -> 882
    //   877: aload #4
    //   879: ifnull -> 1788
    //   882: aload #6
    //   884: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   887: bipush #22
    //   889: aaload
    //   890: invokevirtual equals : (Ljava/lang/Object;)Z
    //   893: aload #4
    //   895: ifnonnull -> 1790
    //   898: goto -> 905
    //   901: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   904: athrow
    //   905: ifeq -> 1788
    //   908: goto -> 915
    //   911: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   914: athrow
    //   915: bipush #12
    //   917: istore #7
    //   919: lload_1
    //   920: lconst_0
    //   921: lcmp
    //   922: ifle -> 930
    //   925: aload #4
    //   927: ifnull -> 1788
    //   930: aload #6
    //   932: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   935: bipush #23
    //   937: aaload
    //   938: invokevirtual equals : (Ljava/lang/Object;)Z
    //   941: aload #4
    //   943: ifnonnull -> 1790
    //   946: goto -> 953
    //   949: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   952: athrow
    //   953: ifeq -> 1788
    //   956: goto -> 963
    //   959: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   962: athrow
    //   963: bipush #13
    //   965: istore #7
    //   967: lload_1
    //   968: lconst_0
    //   969: lcmp
    //   970: ifle -> 978
    //   973: aload #4
    //   975: ifnull -> 1788
    //   978: aload #6
    //   980: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   983: iconst_2
    //   984: aaload
    //   985: invokevirtual equals : (Ljava/lang/Object;)Z
    //   988: aload #4
    //   990: ifnonnull -> 1790
    //   993: goto -> 1000
    //   996: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   999: athrow
    //   1000: ifeq -> 1788
    //   1003: goto -> 1010
    //   1006: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1009: athrow
    //   1010: bipush #14
    //   1012: istore #7
    //   1014: lload_1
    //   1015: lconst_0
    //   1016: lcmp
    //   1017: iflt -> 1025
    //   1020: aload #4
    //   1022: ifnull -> 1788
    //   1025: aload #6
    //   1027: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1030: bipush #15
    //   1032: aaload
    //   1033: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1036: aload #4
    //   1038: ifnonnull -> 1790
    //   1041: goto -> 1048
    //   1044: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1047: athrow
    //   1048: ifeq -> 1788
    //   1051: goto -> 1058
    //   1054: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1057: athrow
    //   1058: bipush #15
    //   1060: istore #7
    //   1062: lload_1
    //   1063: lconst_0
    //   1064: lcmp
    //   1065: ifle -> 1073
    //   1068: aload #4
    //   1070: ifnull -> 1788
    //   1073: aload #6
    //   1075: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1078: bipush #32
    //   1080: aaload
    //   1081: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1084: aload #4
    //   1086: ifnonnull -> 1790
    //   1089: goto -> 1096
    //   1092: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1095: athrow
    //   1096: ifeq -> 1788
    //   1099: goto -> 1106
    //   1102: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1105: athrow
    //   1106: bipush #16
    //   1108: istore #7
    //   1110: lload_1
    //   1111: lconst_0
    //   1112: lcmp
    //   1113: ifle -> 1121
    //   1116: aload #4
    //   1118: ifnull -> 1788
    //   1121: aload #6
    //   1123: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1126: bipush #6
    //   1128: aaload
    //   1129: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1132: aload #4
    //   1134: ifnonnull -> 1790
    //   1137: goto -> 1144
    //   1140: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1143: athrow
    //   1144: ifeq -> 1788
    //   1147: goto -> 1154
    //   1150: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1153: athrow
    //   1154: bipush #17
    //   1156: istore #7
    //   1158: lload_1
    //   1159: lconst_0
    //   1160: lcmp
    //   1161: iflt -> 1169
    //   1164: aload #4
    //   1166: ifnull -> 1788
    //   1169: aload #6
    //   1171: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1174: bipush #19
    //   1176: aaload
    //   1177: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1180: aload #4
    //   1182: ifnonnull -> 1790
    //   1185: goto -> 1192
    //   1188: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1191: athrow
    //   1192: ifeq -> 1788
    //   1195: goto -> 1202
    //   1198: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1201: athrow
    //   1202: bipush #18
    //   1204: istore #7
    //   1206: lload_1
    //   1207: lconst_0
    //   1208: lcmp
    //   1209: ifle -> 1217
    //   1212: aload #4
    //   1214: ifnull -> 1788
    //   1217: aload #6
    //   1219: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1222: bipush #12
    //   1224: aaload
    //   1225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1228: aload #4
    //   1230: ifnonnull -> 1790
    //   1233: goto -> 1240
    //   1236: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1239: athrow
    //   1240: ifeq -> 1788
    //   1243: goto -> 1250
    //   1246: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1249: athrow
    //   1250: bipush #19
    //   1252: istore #7
    //   1254: lload_1
    //   1255: lconst_0
    //   1256: lcmp
    //   1257: iflt -> 1265
    //   1260: aload #4
    //   1262: ifnull -> 1788
    //   1265: aload #6
    //   1267: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1270: bipush #29
    //   1272: aaload
    //   1273: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1276: aload #4
    //   1278: ifnonnull -> 1790
    //   1281: goto -> 1288
    //   1284: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1287: athrow
    //   1288: ifeq -> 1788
    //   1291: goto -> 1298
    //   1294: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1297: athrow
    //   1298: bipush #20
    //   1300: istore #7
    //   1302: lload_1
    //   1303: lconst_0
    //   1304: lcmp
    //   1305: ifle -> 1313
    //   1308: aload #4
    //   1310: ifnull -> 1788
    //   1313: aload #6
    //   1315: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1318: bipush #30
    //   1320: aaload
    //   1321: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1324: aload #4
    //   1326: ifnonnull -> 1790
    //   1329: goto -> 1336
    //   1332: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1335: athrow
    //   1336: ifeq -> 1788
    //   1339: goto -> 1346
    //   1342: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1345: athrow
    //   1346: bipush #21
    //   1348: istore #7
    //   1350: lload_1
    //   1351: lconst_0
    //   1352: lcmp
    //   1353: ifle -> 1361
    //   1356: aload #4
    //   1358: ifnull -> 1788
    //   1361: aload #6
    //   1363: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1366: bipush #16
    //   1368: aaload
    //   1369: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1372: aload #4
    //   1374: ifnonnull -> 1790
    //   1377: goto -> 1384
    //   1380: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1383: athrow
    //   1384: ifeq -> 1788
    //   1387: goto -> 1394
    //   1390: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1393: athrow
    //   1394: bipush #22
    //   1396: istore #7
    //   1398: lload_1
    //   1399: lconst_0
    //   1400: lcmp
    //   1401: iflt -> 1409
    //   1404: aload #4
    //   1406: ifnull -> 1788
    //   1409: aload #6
    //   1411: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1414: bipush #24
    //   1416: aaload
    //   1417: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1420: aload #4
    //   1422: ifnonnull -> 1790
    //   1425: goto -> 1432
    //   1428: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1431: athrow
    //   1432: ifeq -> 1788
    //   1435: goto -> 1442
    //   1438: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1441: athrow
    //   1442: bipush #23
    //   1444: istore #7
    //   1446: lload_1
    //   1447: lconst_0
    //   1448: lcmp
    //   1449: ifle -> 1457
    //   1452: aload #4
    //   1454: ifnull -> 1788
    //   1457: aload #6
    //   1459: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1462: bipush #14
    //   1464: aaload
    //   1465: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1468: aload #4
    //   1470: ifnonnull -> 1790
    //   1473: goto -> 1480
    //   1476: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1479: athrow
    //   1480: ifeq -> 1788
    //   1483: goto -> 1490
    //   1486: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1489: athrow
    //   1490: bipush #24
    //   1492: istore #7
    //   1494: lload_1
    //   1495: lconst_0
    //   1496: lcmp
    //   1497: iflt -> 1505
    //   1500: aload #4
    //   1502: ifnull -> 1788
    //   1505: aload #6
    //   1507: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1510: bipush #25
    //   1512: aaload
    //   1513: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1516: aload #4
    //   1518: ifnonnull -> 1790
    //   1521: goto -> 1528
    //   1524: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1527: athrow
    //   1528: ifeq -> 1788
    //   1531: goto -> 1538
    //   1534: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1537: athrow
    //   1538: bipush #25
    //   1540: istore #7
    //   1542: lload_1
    //   1543: lconst_0
    //   1544: lcmp
    //   1545: iflt -> 1553
    //   1548: aload #4
    //   1550: ifnull -> 1788
    //   1553: aload #6
    //   1555: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1558: bipush #13
    //   1560: aaload
    //   1561: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1564: aload #4
    //   1566: ifnonnull -> 1790
    //   1569: goto -> 1576
    //   1572: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1575: athrow
    //   1576: ifeq -> 1788
    //   1579: goto -> 1586
    //   1582: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1585: athrow
    //   1586: bipush #26
    //   1588: istore #7
    //   1590: lload_1
    //   1591: lconst_0
    //   1592: lcmp
    //   1593: ifle -> 1601
    //   1596: aload #4
    //   1598: ifnull -> 1788
    //   1601: aload #6
    //   1603: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1606: bipush #7
    //   1608: aaload
    //   1609: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1612: aload #4
    //   1614: ifnonnull -> 1790
    //   1617: goto -> 1624
    //   1620: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1623: athrow
    //   1624: ifeq -> 1788
    //   1627: goto -> 1634
    //   1630: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1633: athrow
    //   1634: bipush #27
    //   1636: istore #7
    //   1638: lload_1
    //   1639: lconst_0
    //   1640: lcmp
    //   1641: iflt -> 1649
    //   1644: aload #4
    //   1646: ifnull -> 1788
    //   1649: aload #6
    //   1651: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1654: bipush #8
    //   1656: aaload
    //   1657: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1660: aload #4
    //   1662: ifnonnull -> 1790
    //   1665: goto -> 1672
    //   1668: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1671: athrow
    //   1672: ifeq -> 1788
    //   1675: goto -> 1682
    //   1678: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1681: athrow
    //   1682: bipush #28
    //   1684: istore #7
    //   1686: lload_1
    //   1687: lconst_0
    //   1688: lcmp
    //   1689: iflt -> 1697
    //   1692: aload #4
    //   1694: ifnull -> 1788
    //   1697: aload #6
    //   1699: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1702: bipush #21
    //   1704: aaload
    //   1705: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1708: aload #4
    //   1710: ifnonnull -> 1790
    //   1713: goto -> 1720
    //   1716: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1719: athrow
    //   1720: ifeq -> 1788
    //   1723: goto -> 1730
    //   1726: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1729: athrow
    //   1730: bipush #29
    //   1732: istore #7
    //   1734: lload_1
    //   1735: lconst_0
    //   1736: lcmp
    //   1737: ifle -> 1745
    //   1740: aload #4
    //   1742: ifnull -> 1788
    //   1745: aload #6
    //   1747: getstatic me/frep/aegisguard/spigot/aegisguard_Xw.b : [Ljava/lang/String;
    //   1750: bipush #18
    //   1752: aaload
    //   1753: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1756: aload #4
    //   1758: lload_1
    //   1759: lconst_0
    //   1760: lcmp
    //   1761: iflt -> 1792
    //   1764: ifnonnull -> 1790
    //   1767: goto -> 1774
    //   1770: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1773: athrow
    //   1774: ifeq -> 1788
    //   1777: goto -> 1784
    //   1780: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1783: athrow
    //   1784: bipush #30
    //   1786: istore #7
    //   1788: iload #7
    //   1790: aload #4
    //   1792: ifnonnull -> 2058
    //   1795: tableswitch default -> 2050, 0 -> 1936, 1 -> 1936, 2 -> 1936, 3 -> 1936, 4 -> 1955, 5 -> 1955, 6 -> 1955, 7 -> 1955, 8 -> 1974, 9 -> 1974, 10 -> 1974, 11 -> 1974, 12 -> 1974, 13 -> 1974, 14 -> 1974, 15 -> 1974, 16 -> 1993, 17 -> 1993, 18 -> 1993, 19 -> 2012, 20 -> 2012, 21 -> 2012, 22 -> 2012, 23 -> 2031, 24 -> 2031, 25 -> 2031, 26 -> 2031, 27 -> 2031, 28 -> 2031, 29 -> 2031, 30 -> 2031
    //   1932: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1935: athrow
    //   1936: getstatic me/frep/aegisguard/spigot/aegisguard_hN.IRON : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   1939: invokestatic aegisguard_q : (Lme/frep/aegisguard/spigot/aegisguard_hN;)I
    //   1942: istore #5
    //   1944: aload #4
    //   1946: lload_1
    //   1947: lconst_0
    //   1948: lcmp
    //   1949: iflt -> 1965
    //   1952: ifnull -> 2060
    //   1955: getstatic me/frep/aegisguard/spigot/aegisguard_hN.STONE : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   1958: invokestatic aegisguard_q : (Lme/frep/aegisguard/spigot/aegisguard_hN;)I
    //   1961: istore #5
    //   1963: aload #4
    //   1965: lload_1
    //   1966: lconst_0
    //   1967: lcmp
    //   1968: ifle -> 1984
    //   1971: ifnull -> 2060
    //   1974: getstatic me/frep/aegisguard/spigot/aegisguard_hN.WOOD : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   1977: invokestatic aegisguard_q : (Lme/frep/aegisguard/spigot/aegisguard_hN;)I
    //   1980: istore #5
    //   1982: aload #4
    //   1984: lload_1
    //   1985: lconst_0
    //   1986: lcmp
    //   1987: iflt -> 2003
    //   1990: ifnull -> 2060
    //   1993: getstatic me/frep/aegisguard/spigot/aegisguard_hN.NETHERITE : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   1996: invokestatic aegisguard_q : (Lme/frep/aegisguard/spigot/aegisguard_hN;)I
    //   1999: istore #5
    //   2001: aload #4
    //   2003: lload_1
    //   2004: lconst_0
    //   2005: lcmp
    //   2006: ifle -> 2022
    //   2009: ifnull -> 2060
    //   2012: getstatic me/frep/aegisguard/spigot/aegisguard_hN.DIAMOND : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   2015: invokestatic aegisguard_q : (Lme/frep/aegisguard/spigot/aegisguard_hN;)I
    //   2018: istore #5
    //   2020: aload #4
    //   2022: lload_1
    //   2023: lconst_0
    //   2024: lcmp
    //   2025: ifle -> 2047
    //   2028: ifnull -> 2060
    //   2031: getstatic me/frep/aegisguard/spigot/aegisguard_hN.GOLD : Lme/frep/aegisguard/spigot/aegisguard_hN;
    //   2034: invokestatic aegisguard_q : (Lme/frep/aegisguard/spigot/aegisguard_hN;)I
    //   2037: lload_1
    //   2038: lconst_0
    //   2039: lcmp
    //   2040: ifle -> 2051
    //   2043: istore #5
    //   2045: aload #4
    //   2047: ifnull -> 2060
    //   2050: iconst_1
    //   2051: goto -> 2058
    //   2054: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   2057: athrow
    //   2058: istore #5
    //   2060: iload #5
    //   2062: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #46	-> 28
    //   #51	-> 1936
    //   #52	-> 1944
    //   #57	-> 1955
    //   #58	-> 1963
    //   #67	-> 1974
    //   #68	-> 1982
    //   #72	-> 1993
    //   #73	-> 2001
    //   #78	-> 2012
    //   #79	-> 2020
    //   #88	-> 2031
    //   #89	-> 2045
    //   #91	-> 2050
    //   #95	-> 2060
    // Exception table:
    //   from	to	target	type
    //   42	312	312	java/lang/UnsupportedOperationException
    //   52	332	335	java/lang/UnsupportedOperationException
    //   316	342	345	java/lang/UnsupportedOperationException
    //   352	378	381	java/lang/UnsupportedOperationException
    //   363	388	391	java/lang/UnsupportedOperationException
    //   398	424	427	java/lang/UnsupportedOperationException
    //   409	434	437	java/lang/UnsupportedOperationException
    //   444	471	474	java/lang/UnsupportedOperationException
    //   455	481	484	java/lang/UnsupportedOperationException
    //   491	517	520	java/lang/UnsupportedOperationException
    //   502	527	530	java/lang/UnsupportedOperationException
    //   537	563	566	java/lang/UnsupportedOperationException
    //   548	573	576	java/lang/UnsupportedOperationException
    //   583	610	613	java/lang/UnsupportedOperationException
    //   594	620	623	java/lang/UnsupportedOperationException
    //   631	658	661	java/lang/UnsupportedOperationException
    //   642	668	671	java/lang/UnsupportedOperationException
    //   679	706	709	java/lang/UnsupportedOperationException
    //   690	716	719	java/lang/UnsupportedOperationException
    //   727	754	757	java/lang/UnsupportedOperationException
    //   738	764	767	java/lang/UnsupportedOperationException
    //   775	802	805	java/lang/UnsupportedOperationException
    //   786	812	815	java/lang/UnsupportedOperationException
    //   823	850	853	java/lang/UnsupportedOperationException
    //   834	860	863	java/lang/UnsupportedOperationException
    //   871	898	901	java/lang/UnsupportedOperationException
    //   882	908	911	java/lang/UnsupportedOperationException
    //   919	946	949	java/lang/UnsupportedOperationException
    //   930	956	959	java/lang/UnsupportedOperationException
    //   967	993	996	java/lang/UnsupportedOperationException
    //   978	1003	1006	java/lang/UnsupportedOperationException
    //   1014	1041	1044	java/lang/UnsupportedOperationException
    //   1025	1051	1054	java/lang/UnsupportedOperationException
    //   1062	1089	1092	java/lang/UnsupportedOperationException
    //   1073	1099	1102	java/lang/UnsupportedOperationException
    //   1110	1137	1140	java/lang/UnsupportedOperationException
    //   1121	1147	1150	java/lang/UnsupportedOperationException
    //   1158	1185	1188	java/lang/UnsupportedOperationException
    //   1169	1195	1198	java/lang/UnsupportedOperationException
    //   1206	1233	1236	java/lang/UnsupportedOperationException
    //   1217	1243	1246	java/lang/UnsupportedOperationException
    //   1254	1281	1284	java/lang/UnsupportedOperationException
    //   1265	1291	1294	java/lang/UnsupportedOperationException
    //   1302	1329	1332	java/lang/UnsupportedOperationException
    //   1313	1339	1342	java/lang/UnsupportedOperationException
    //   1350	1377	1380	java/lang/UnsupportedOperationException
    //   1361	1387	1390	java/lang/UnsupportedOperationException
    //   1398	1425	1428	java/lang/UnsupportedOperationException
    //   1409	1435	1438	java/lang/UnsupportedOperationException
    //   1446	1473	1476	java/lang/UnsupportedOperationException
    //   1457	1483	1486	java/lang/UnsupportedOperationException
    //   1494	1521	1524	java/lang/UnsupportedOperationException
    //   1505	1531	1534	java/lang/UnsupportedOperationException
    //   1542	1569	1572	java/lang/UnsupportedOperationException
    //   1553	1579	1582	java/lang/UnsupportedOperationException
    //   1590	1617	1620	java/lang/UnsupportedOperationException
    //   1601	1627	1630	java/lang/UnsupportedOperationException
    //   1638	1665	1668	java/lang/UnsupportedOperationException
    //   1649	1675	1678	java/lang/UnsupportedOperationException
    //   1686	1713	1716	java/lang/UnsupportedOperationException
    //   1697	1723	1726	java/lang/UnsupportedOperationException
    //   1734	1767	1770	java/lang/UnsupportedOperationException
    //   1745	1777	1780	java/lang/UnsupportedOperationException
    //   1790	1932	1932	java/lang/UnsupportedOperationException
    //   2045	2051	2054	java/lang/UnsupportedOperationException
  }
  
  static {
    long l = a ^ 0x3302EB297FE2L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[33];
    boolean bool = false;
    String str;
    int i = (str = "\fpiªLy×\020Ò0æ@6Ñ\032&ÉÂ«\020«§\020\017:Éï¤í«\\Y\002ÀËCû\032Ñ\020ÄÓänm°ªê¦ó\016hóøn\020A¦ò²þOðËÞ´N<²\032r\020Ü\030-¬íàR]\017¨X\025\031\n*\030|¬å»\nÜ=RM\000¨¬³\nép\023ìæ¸'\020;éiï /\tD!\030_´FÙ\020Y{Æî#Ç§Ü|y-I+-\"\020!sær\"¹%ÎmñGÌ­sc\f\020$îðõÎÔ>\035¥¿)r©\020ª1¶¤vUãCùMº\020p\025SCÓc%ýiÿ¥s!¥8\020×i«&ÃÖ\000<\016\0368?æÛ\020eº)åýC×á»hÏ\020|\bÄ\032Ã\036Æ\tCV\016Î§\020p\025SCÓc%\021DUÕè­\005\020\n»0.>G¸ÄS³L\b»Ù\020ßÇ\003¶%rNlH\t«\037sËí\030|¬å»\nÜÎ}iA\002¼éýp\005¸Ï'ê\020ª1¶¤vU¾hSm÷ÒÊ\0206Òî|K#Õ±¾¨Ç7zS$\020tP\003T(w:2»\t\0049l\006è\020Ud\034(î\003èzTÑãNI\023Å.\020ÜW·\0049\017\023\001È(Ø½;ZÜ«\020×i«&ÃÖ\000ªßÓ\036tè\020t}\030ºpf-éF2Òâ\020ï \b\025BÊ¾@\000*{W@[\020\033×><Õ¤¥×Ãq$'¶jx\020p\025SCÓc%åî|§<ÈÊ\020p\025SCÓc%ÿ¹]ôÒ·").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
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
