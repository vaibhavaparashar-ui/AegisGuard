package me.frep.aegisguard.spigot.AegisGuard_hj;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_KH;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.scheduler.BukkitRunnable;

class aegisguard_hj extends BukkitRunnable {
  final List aegisguard_r;
  
  final aegisguard_hu aegisguard_b;
  
  final int aegisguard_Z;
  
  final AbstractCheck aegisguard_O;
  
  final aegisguard_KH aegisguard_I;
  
  private static final long a = aegisguard_e.a(797692423453144187L, -5292847478322209784L, MethodHandles.lookup().lookupClass()).a(66545732610847L);
  
  private static final String[] b;
  
  aegisguard_hj(aegisguard_KH paramaegisguard_KH, List paramList, aegisguard_hu paramaegisguard_hu, int paramInt, AbstractCheck paramAbstractCheck) {
    if (arrayOfAbstractCheck == null)
      AbstractCheck.aegisguard_g(new AbstractCheck[1]); 
  }
  
  public void run() {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_hj.a : J
    //   3: ldc2_w 59326793270091
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_v : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: aload_0
    //   12: getfield aegisguard_r : Ljava/util/List;
    //   15: aload_0
    //   16: aload_0
    //   17: getfield aegisguard_b : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   20: aload_0
    //   21: getfield aegisguard_Z : I
    //   24: aload_0
    //   25: getfield aegisguard_O : Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_hj;Lme/frep/aegisguard/spigot/aegisguard_hu;ILme/frep/aegisguard/spigot/check/AbstractCheck;)Ljava/util/function/Consumer;
    //   33: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   38: astore_3
    //   39: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   42: ifnonnull -> 59
    //   45: iconst_2
    //   46: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   49: invokestatic aegisguard_H : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #211	-> 11
    //   #271	-> 39
    // Exception table:
    //   from	to	target	type
    //   39	52	55	java/lang/RuntimeException
  }
  
  private void lambda$run$0(aegisguard_hu paramaegisguard_hu, int paramInt, AbstractCheck paramAbstractCheck, String paramString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_hj.a : J
    //   3: ldc2_w 58929723993443
    //   6: lxor
    //   7: lstore #5
    //   9: lload #5
    //   11: dup2
    //   12: ldc2_w 57483494572439
    //   15: lxor
    //   16: lstore #7
    //   18: dup2
    //   19: ldc2_w 9029074943120
    //   22: lxor
    //   23: lstore #9
    //   25: dup2
    //   26: ldc2_w 98808195045450
    //   29: lxor
    //   30: lstore #11
    //   32: dup2
    //   33: ldc2_w 57849435058204
    //   36: lxor
    //   37: lstore #13
    //   39: dup2
    //   40: ldc2_w 56268862308828
    //   43: lxor
    //   44: lstore #15
    //   46: dup2
    //   47: ldc2_w 139644370971470
    //   50: lxor
    //   51: lstore #17
    //   53: pop2
    //   54: invokestatic aegisguard_v : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   57: astore #19
    //   59: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   62: invokevirtual aegisguard_x : ()Z
    //   65: aload #19
    //   67: ifnull -> 116
    //   70: ifeq -> 101
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aload_1
    //   81: iconst_0
    //   82: anewarray java/lang/Object
    //   85: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   88: aload #4
    //   90: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   93: pop
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   100: athrow
    //   101: aload #4
    //   103: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   106: astore #20
    //   108: aload #20
    //   110: bipush #6
    //   112: aaload
    //   113: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   116: aload #19
    //   118: ifnull -> 148
    //   121: ifne -> 163
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload #4
    //   133: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   136: iconst_1
    //   137: aaload
    //   138: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: aload #19
    //   150: ifnull -> 791
    //   153: ifeq -> 778
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload_0
    //   164: getfield aegisguard_I : Lme/frep/aegisguard/spigot/aegisguard_KH;
    //   167: aload_1
    //   168: iconst_0
    //   169: anewarray java/lang/Object
    //   172: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   175: new java/lang/StringBuilder
    //   178: dup
    //   179: invokespecial <init> : ()V
    //   182: aload #4
    //   184: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   187: bipush #18
    //   189: aaload
    //   190: ldc ''
    //   192: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   198: bipush #13
    //   200: aaload
    //   201: ldc ''
    //   203: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   206: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   209: bipush #20
    //   211: aaload
    //   212: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G6 : Ljava/lang/String;
    //   215: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   218: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   221: bipush #30
    //   223: aaload
    //   224: aload_1
    //   225: iconst_0
    //   226: anewarray java/lang/Object
    //   229: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   232: iconst_0
    //   233: anewarray java/lang/Object
    //   236: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)I
    //   239: invokestatic toString : (I)Ljava/lang/String;
    //   242: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   245: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   248: bipush #23
    //   250: aaload
    //   251: iconst_0
    //   252: anewarray java/lang/Object
    //   255: invokestatic aegisguard_S : ([Ljava/lang/Object;)D
    //   258: iconst_1
    //   259: anewarray java/lang/Object
    //   262: dup_x2
    //   263: dup_x2
    //   264: pop
    //   265: invokestatic valueOf : (D)Ljava/lang/Double;
    //   268: iconst_0
    //   269: swap
    //   270: aastore
    //   271: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   274: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   277: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   280: bipush #19
    //   282: aaload
    //   283: aload_1
    //   284: iconst_0
    //   285: anewarray java/lang/Object
    //   288: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   291: invokeinterface getName : ()Ljava/lang/String;
    //   296: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   299: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   302: bipush #15
    //   304: aaload
    //   305: aload_1
    //   306: iconst_0
    //   307: anewarray java/lang/Object
    //   310: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   313: lload #17
    //   315: dup2_x1
    //   316: pop2
    //   317: iconst_2
    //   318: anewarray java/lang/Object
    //   321: dup_x1
    //   322: swap
    //   323: iconst_1
    //   324: swap
    //   325: aastore
    //   326: dup_x2
    //   327: dup_x2
    //   328: pop
    //   329: invokestatic valueOf : (J)Ljava/lang/Long;
    //   332: iconst_0
    //   333: swap
    //   334: aastore
    //   335: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   338: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   341: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   344: iconst_5
    //   345: aaload
    //   346: aload_1
    //   347: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   350: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   353: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   356: bipush #24
    //   358: aaload
    //   359: aload_1
    //   360: iconst_0
    //   361: anewarray java/lang/Object
    //   364: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   367: iconst_0
    //   368: anewarray java/lang/Object
    //   371: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   374: aload #19
    //   376: ifnull -> 424
    //   379: goto -> 386
    //   382: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   385: athrow
    //   386: ifnonnull -> 409
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   395: athrow
    //   396: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   399: bipush #27
    //   401: aaload
    //   402: goto -> 429
    //   405: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   408: athrow
    //   409: aload_1
    //   410: iconst_0
    //   411: anewarray java/lang/Object
    //   414: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   417: iconst_0
    //   418: anewarray java/lang/Object
    //   421: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   424: invokeinterface getName : ()Ljava/lang/String;
    //   429: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   432: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   435: bipush #12
    //   437: aaload
    //   438: iload_2
    //   439: invokestatic toString : (I)Ljava/lang/String;
    //   442: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   445: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   448: bipush #22
    //   450: aaload
    //   451: aload_3
    //   452: invokevirtual getCategory : ()Ljava/lang/String;
    //   455: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   458: lload #11
    //   460: dup2_x1
    //   461: pop2
    //   462: iconst_2
    //   463: anewarray java/lang/Object
    //   466: dup_x1
    //   467: swap
    //   468: iconst_1
    //   469: swap
    //   470: aastore
    //   471: dup_x2
    //   472: dup_x2
    //   473: pop
    //   474: invokestatic valueOf : (J)Ljava/lang/Long;
    //   477: iconst_0
    //   478: swap
    //   479: aastore
    //   480: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   483: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   486: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   489: iconst_0
    //   490: aaload
    //   491: aload_3
    //   492: lload #15
    //   494: iconst_1
    //   495: anewarray java/lang/Object
    //   498: dup_x2
    //   499: dup_x2
    //   500: pop
    //   501: invokestatic valueOf : (J)Ljava/lang/Long;
    //   504: iconst_0
    //   505: swap
    //   506: aastore
    //   507: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   510: invokeinterface complexType : ()Ljava/lang/String;
    //   515: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   518: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   521: bipush #26
    //   523: aaload
    //   524: aload_3
    //   525: lload #15
    //   527: iconst_1
    //   528: anewarray java/lang/Object
    //   531: dup_x2
    //   532: dup_x2
    //   533: pop
    //   534: invokestatic valueOf : (J)Ljava/lang/Long;
    //   537: iconst_0
    //   538: swap
    //   539: aastore
    //   540: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   543: invokeinterface description : ()Ljava/lang/String;
    //   548: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   551: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   554: bipush #17
    //   556: aaload
    //   557: aload_3
    //   558: lload #15
    //   560: iconst_1
    //   561: anewarray java/lang/Object
    //   564: dup_x2
    //   565: dup_x2
    //   566: pop
    //   567: invokestatic valueOf : (J)Ljava/lang/Long;
    //   570: iconst_0
    //   571: swap
    //   572: aastore
    //   573: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   576: invokeinterface name : ()Ljava/lang/String;
    //   581: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   584: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   587: bipush #14
    //   589: aaload
    //   590: aload_3
    //   591: lload #15
    //   593: iconst_1
    //   594: anewarray java/lang/Object
    //   597: dup_x2
    //   598: dup_x2
    //   599: pop
    //   600: invokestatic valueOf : (J)Ljava/lang/Long;
    //   603: iconst_0
    //   604: swap
    //   605: aastore
    //   606: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   609: invokeinterface type : ()C
    //   614: invokestatic toString : (C)Ljava/lang/String;
    //   617: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   620: lload #7
    //   622: dup2_x1
    //   623: pop2
    //   624: iconst_2
    //   625: anewarray java/lang/Object
    //   628: dup_x1
    //   629: swap
    //   630: iconst_1
    //   631: swap
    //   632: aastore
    //   633: dup_x2
    //   634: dup_x2
    //   635: pop
    //   636: invokestatic valueOf : (J)Ljava/lang/Long;
    //   639: iconst_0
    //   640: swap
    //   641: aastore
    //   642: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   645: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   648: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   651: bipush #7
    //   653: aaload
    //   654: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   657: aload_3
    //   658: invokevirtual getDisplayName : ()Ljava/lang/String;
    //   661: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   667: bipush #33
    //   669: aaload
    //   670: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   673: aload_3
    //   674: invokevirtual getDisplayType : ()C
    //   677: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   680: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   683: bipush #33
    //   685: aaload
    //   686: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: aload_3
    //   690: invokevirtual getVl : ()I
    //   693: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   696: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   699: bipush #33
    //   701: aaload
    //   702: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   705: aload_1
    //   706: iconst_0
    //   707: anewarray java/lang/Object
    //   710: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   713: invokeinterface getName : ()Ljava/lang/String;
    //   718: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   721: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   724: bipush #33
    //   726: aaload
    //   727: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   730: aload_3
    //   731: invokevirtual getMaxVl : ()I
    //   734: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   737: invokevirtual toString : ()Ljava/lang/String;
    //   740: lload #13
    //   742: iconst_4
    //   743: anewarray java/lang/Object
    //   746: dup_x2
    //   747: dup_x2
    //   748: pop
    //   749: invokestatic valueOf : (J)Ljava/lang/Long;
    //   752: iconst_3
    //   753: swap
    //   754: aastore
    //   755: dup_x1
    //   756: swap
    //   757: iconst_2
    //   758: swap
    //   759: aastore
    //   760: dup_x1
    //   761: swap
    //   762: iconst_1
    //   763: swap
    //   764: aastore
    //   765: dup_x1
    //   766: swap
    //   767: iconst_0
    //   768: swap
    //   769: aastore
    //   770: invokestatic aegisguard_y : ([Ljava/lang/Object;)V
    //   773: aload #19
    //   775: ifnonnull -> 1735
    //   778: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   781: invokevirtual aegisguard_x : ()Z
    //   784: goto -> 791
    //   787: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   790: athrow
    //   791: ifeq -> 1273
    //   794: aload_1
    //   795: iconst_0
    //   796: anewarray java/lang/Object
    //   799: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   802: aload #4
    //   804: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   807: iconst_4
    //   808: aaload
    //   809: aload_1
    //   810: iconst_0
    //   811: anewarray java/lang/Object
    //   814: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   817: invokeinterface getName : ()Ljava/lang/String;
    //   822: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   825: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   828: bipush #9
    //   830: aaload
    //   831: aload_1
    //   832: iconst_0
    //   833: anewarray java/lang/Object
    //   836: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   839: lload #17
    //   841: dup2_x1
    //   842: pop2
    //   843: iconst_2
    //   844: anewarray java/lang/Object
    //   847: dup_x1
    //   848: swap
    //   849: iconst_1
    //   850: swap
    //   851: aastore
    //   852: dup_x2
    //   853: dup_x2
    //   854: pop
    //   855: invokestatic valueOf : (J)Ljava/lang/Long;
    //   858: iconst_0
    //   859: swap
    //   860: aastore
    //   861: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   864: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   867: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   870: bipush #8
    //   872: aaload
    //   873: aload_1
    //   874: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   877: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   880: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   883: iconst_3
    //   884: aaload
    //   885: aload_1
    //   886: iconst_0
    //   887: anewarray java/lang/Object
    //   890: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   893: iconst_0
    //   894: anewarray java/lang/Object
    //   897: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)I
    //   900: invokestatic toString : (I)Ljava/lang/String;
    //   903: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   906: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   909: bipush #32
    //   911: aaload
    //   912: iconst_0
    //   913: anewarray java/lang/Object
    //   916: invokestatic aegisguard_S : ([Ljava/lang/Object;)D
    //   919: iconst_1
    //   920: anewarray java/lang/Object
    //   923: dup_x2
    //   924: dup_x2
    //   925: pop
    //   926: invokestatic valueOf : (D)Ljava/lang/Double;
    //   929: iconst_0
    //   930: swap
    //   931: aastore
    //   932: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   935: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   938: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   941: bipush #10
    //   943: aaload
    //   944: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G6 : Ljava/lang/String;
    //   947: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   950: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   953: bipush #21
    //   955: aaload
    //   956: aload_1
    //   957: iconst_0
    //   958: anewarray java/lang/Object
    //   961: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   964: iconst_0
    //   965: anewarray java/lang/Object
    //   968: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   971: aload #19
    //   973: ifnull -> 1021
    //   976: goto -> 983
    //   979: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   982: athrow
    //   983: ifnonnull -> 1006
    //   986: goto -> 993
    //   989: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   992: athrow
    //   993: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   996: bipush #29
    //   998: aaload
    //   999: goto -> 1026
    //   1002: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1005: athrow
    //   1006: aload_1
    //   1007: iconst_0
    //   1008: anewarray java/lang/Object
    //   1011: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   1014: iconst_0
    //   1015: anewarray java/lang/Object
    //   1018: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1021: invokeinterface getName : ()Ljava/lang/String;
    //   1026: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1029: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1032: bipush #16
    //   1034: aaload
    //   1035: iload_2
    //   1036: invokestatic toString : (I)Ljava/lang/String;
    //   1039: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1042: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1045: iconst_2
    //   1046: aaload
    //   1047: aload_3
    //   1048: invokevirtual getCategory : ()Ljava/lang/String;
    //   1051: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1054: lload #11
    //   1056: dup2_x1
    //   1057: pop2
    //   1058: iconst_2
    //   1059: anewarray java/lang/Object
    //   1062: dup_x1
    //   1063: swap
    //   1064: iconst_1
    //   1065: swap
    //   1066: aastore
    //   1067: dup_x2
    //   1068: dup_x2
    //   1069: pop
    //   1070: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1073: iconst_0
    //   1074: swap
    //   1075: aastore
    //   1076: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1079: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1082: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1085: bipush #28
    //   1087: aaload
    //   1088: aload_3
    //   1089: lload #15
    //   1091: iconst_1
    //   1092: anewarray java/lang/Object
    //   1095: dup_x2
    //   1096: dup_x2
    //   1097: pop
    //   1098: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1101: iconst_0
    //   1102: swap
    //   1103: aastore
    //   1104: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1107: invokeinterface complexType : ()Ljava/lang/String;
    //   1112: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1115: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1118: bipush #25
    //   1120: aaload
    //   1121: aload_3
    //   1122: lload #15
    //   1124: iconst_1
    //   1125: anewarray java/lang/Object
    //   1128: dup_x2
    //   1129: dup_x2
    //   1130: pop
    //   1131: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1134: iconst_0
    //   1135: swap
    //   1136: aastore
    //   1137: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1140: invokeinterface description : ()Ljava/lang/String;
    //   1145: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1148: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1151: bipush #11
    //   1153: aaload
    //   1154: aload_3
    //   1155: lload #15
    //   1157: iconst_1
    //   1158: anewarray java/lang/Object
    //   1161: dup_x2
    //   1162: dup_x2
    //   1163: pop
    //   1164: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1167: iconst_0
    //   1168: swap
    //   1169: aastore
    //   1170: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1173: invokeinterface name : ()Ljava/lang/String;
    //   1178: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1181: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1184: bipush #31
    //   1186: aaload
    //   1187: aload_3
    //   1188: lload #15
    //   1190: iconst_1
    //   1191: anewarray java/lang/Object
    //   1194: dup_x2
    //   1195: dup_x2
    //   1196: pop
    //   1197: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1200: iconst_0
    //   1201: swap
    //   1202: aastore
    //   1203: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1206: invokeinterface type : ()C
    //   1211: invokestatic toString : (C)Ljava/lang/String;
    //   1214: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1217: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   1220: lload #7
    //   1222: dup2_x1
    //   1223: pop2
    //   1224: iconst_2
    //   1225: anewarray java/lang/Object
    //   1228: dup_x1
    //   1229: swap
    //   1230: iconst_1
    //   1231: swap
    //   1232: aastore
    //   1233: dup_x2
    //   1234: dup_x2
    //   1235: pop
    //   1236: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1239: iconst_0
    //   1240: swap
    //   1241: aastore
    //   1242: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1245: lload #9
    //   1247: iconst_2
    //   1248: anewarray java/lang/Object
    //   1251: dup_x2
    //   1252: dup_x2
    //   1253: pop
    //   1254: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1257: iconst_1
    //   1258: swap
    //   1259: aastore
    //   1260: dup_x1
    //   1261: swap
    //   1262: iconst_0
    //   1263: swap
    //   1264: aastore
    //   1265: invokestatic aegisguard_k : ([Ljava/lang/Object;)V
    //   1268: aload #19
    //   1270: ifnonnull -> 1735
    //   1273: aload #4
    //   1275: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1278: iconst_4
    //   1279: aaload
    //   1280: aload_1
    //   1281: iconst_0
    //   1282: anewarray java/lang/Object
    //   1285: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1288: invokeinterface getName : ()Ljava/lang/String;
    //   1293: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1296: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1299: bipush #9
    //   1301: aaload
    //   1302: aload_1
    //   1303: iconst_0
    //   1304: anewarray java/lang/Object
    //   1307: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1310: lload #17
    //   1312: dup2_x1
    //   1313: pop2
    //   1314: iconst_2
    //   1315: anewarray java/lang/Object
    //   1318: dup_x1
    //   1319: swap
    //   1320: iconst_1
    //   1321: swap
    //   1322: aastore
    //   1323: dup_x2
    //   1324: dup_x2
    //   1325: pop
    //   1326: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1329: iconst_0
    //   1330: swap
    //   1331: aastore
    //   1332: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1335: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1338: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1341: bipush #8
    //   1343: aaload
    //   1344: aload_1
    //   1345: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1348: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1351: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1354: bipush #10
    //   1356: aaload
    //   1357: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G6 : Ljava/lang/String;
    //   1360: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1363: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1366: iconst_3
    //   1367: aaload
    //   1368: aload_1
    //   1369: iconst_0
    //   1370: anewarray java/lang/Object
    //   1373: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   1376: iconst_0
    //   1377: anewarray java/lang/Object
    //   1380: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)I
    //   1383: invokestatic toString : (I)Ljava/lang/String;
    //   1386: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1389: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1392: bipush #32
    //   1394: aaload
    //   1395: iconst_0
    //   1396: anewarray java/lang/Object
    //   1399: invokestatic aegisguard_S : ([Ljava/lang/Object;)D
    //   1402: iconst_1
    //   1403: anewarray java/lang/Object
    //   1406: dup_x2
    //   1407: dup_x2
    //   1408: pop
    //   1409: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1412: iconst_0
    //   1413: swap
    //   1414: aastore
    //   1415: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1418: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1421: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1424: bipush #21
    //   1426: aaload
    //   1427: aload_1
    //   1428: iconst_0
    //   1429: anewarray java/lang/Object
    //   1432: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   1435: iconst_0
    //   1436: anewarray java/lang/Object
    //   1439: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1442: aload #19
    //   1444: ifnull -> 1492
    //   1447: goto -> 1454
    //   1450: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1453: athrow
    //   1454: ifnonnull -> 1477
    //   1457: goto -> 1464
    //   1460: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1463: athrow
    //   1464: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1467: bipush #29
    //   1469: aaload
    //   1470: goto -> 1497
    //   1473: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1476: athrow
    //   1477: aload_1
    //   1478: iconst_0
    //   1479: anewarray java/lang/Object
    //   1482: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   1485: iconst_0
    //   1486: anewarray java/lang/Object
    //   1489: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1492: invokeinterface getName : ()Ljava/lang/String;
    //   1497: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1500: getstatic me/frep/aegisguard/spigot/aegisguard_hj.b : [Ljava/lang/String;
    //   1503: astore #20
    //   1505: aload #20
    //   1507: bipush #16
    //   1509: aaload
    //   1510: iload_2
    //   1511: invokestatic toString : (I)Ljava/lang/String;
    //   1514: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1517: aload #20
    //   1519: iconst_2
    //   1520: aaload
    //   1521: aload_3
    //   1522: invokevirtual getCategory : ()Ljava/lang/String;
    //   1525: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1528: lload #11
    //   1530: dup2_x1
    //   1531: pop2
    //   1532: iconst_2
    //   1533: anewarray java/lang/Object
    //   1536: dup_x1
    //   1537: swap
    //   1538: iconst_1
    //   1539: swap
    //   1540: aastore
    //   1541: dup_x2
    //   1542: dup_x2
    //   1543: pop
    //   1544: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1547: iconst_0
    //   1548: swap
    //   1549: aastore
    //   1550: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1553: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1556: aload #20
    //   1558: bipush #28
    //   1560: aaload
    //   1561: aload_3
    //   1562: lload #15
    //   1564: iconst_1
    //   1565: anewarray java/lang/Object
    //   1568: dup_x2
    //   1569: dup_x2
    //   1570: pop
    //   1571: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1574: iconst_0
    //   1575: swap
    //   1576: aastore
    //   1577: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1580: invokeinterface complexType : ()Ljava/lang/String;
    //   1585: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1588: aload #20
    //   1590: bipush #25
    //   1592: aaload
    //   1593: aload_3
    //   1594: lload #15
    //   1596: iconst_1
    //   1597: anewarray java/lang/Object
    //   1600: dup_x2
    //   1601: dup_x2
    //   1602: pop
    //   1603: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1606: iconst_0
    //   1607: swap
    //   1608: aastore
    //   1609: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1612: invokeinterface description : ()Ljava/lang/String;
    //   1617: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1620: aload #20
    //   1622: bipush #11
    //   1624: aaload
    //   1625: aload_3
    //   1626: lload #15
    //   1628: iconst_1
    //   1629: anewarray java/lang/Object
    //   1632: dup_x2
    //   1633: dup_x2
    //   1634: pop
    //   1635: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1638: iconst_0
    //   1639: swap
    //   1640: aastore
    //   1641: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1644: invokeinterface name : ()Ljava/lang/String;
    //   1649: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1652: aload #20
    //   1654: bipush #31
    //   1656: aaload
    //   1657: aload_3
    //   1658: lload #15
    //   1660: iconst_1
    //   1661: anewarray java/lang/Object
    //   1664: dup_x2
    //   1665: dup_x2
    //   1666: pop
    //   1667: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1670: iconst_0
    //   1671: swap
    //   1672: aastore
    //   1673: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1676: invokeinterface type : ()C
    //   1681: invokestatic toString : (C)Ljava/lang/String;
    //   1684: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1687: lload #7
    //   1689: dup2_x1
    //   1690: pop2
    //   1691: iconst_2
    //   1692: anewarray java/lang/Object
    //   1695: dup_x1
    //   1696: swap
    //   1697: iconst_1
    //   1698: swap
    //   1699: aastore
    //   1700: dup_x2
    //   1701: dup_x2
    //   1702: pop
    //   1703: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1706: iconst_0
    //   1707: swap
    //   1708: aastore
    //   1709: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1712: lload #9
    //   1714: iconst_2
    //   1715: anewarray java/lang/Object
    //   1718: dup_x2
    //   1719: dup_x2
    //   1720: pop
    //   1721: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1724: iconst_1
    //   1725: swap
    //   1726: aastore
    //   1727: dup_x1
    //   1728: swap
    //   1729: iconst_0
    //   1730: swap
    //   1731: aastore
    //   1732: invokestatic aegisguard_k : ([Ljava/lang/Object;)V
    //   1735: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #212	-> 59
    //   #213	-> 80
    //   #215	-> 101
    //   #216	-> 163
    //   #217	-> 192
    //   #218	-> 203
    //   #219	-> 215
    //   #220	-> 225
    //   #221	-> 251
    //   #222	-> 284
    //   #223	-> 306
    //   #224	-> 347
    //   #225	-> 359
    //   #226	-> 439
    //   #227	-> 452
    //   #228	-> 492
    //   #229	-> 525
    //   #230	-> 558
    //   #231	-> 591
    //   #216	-> 624
    //   #232	-> 658
    //   #233	-> 674
    //   #234	-> 690
    //   #235	-> 706
    //   #236	-> 731
    //   #216	-> 740
    //   #238	-> 778
    //   #239	-> 794
    //   #240	-> 810
    //   #241	-> 832
    //   #242	-> 874
    //   #243	-> 886
    //   #244	-> 912
    //   #245	-> 947
    //   #246	-> 956
    //   #247	-> 1036
    //   #248	-> 1048
    //   #249	-> 1089
    //   #250	-> 1122
    //   #251	-> 1155
    //   #252	-> 1188
    //   #239	-> 1217
    //   #254	-> 1273
    //   #255	-> 1281
    //   #256	-> 1303
    //   #257	-> 1345
    //   #258	-> 1360
    //   #259	-> 1369
    //   #260	-> 1395
    //   #261	-> 1427
    //   #262	-> 1511
    //   #263	-> 1522
    //   #264	-> 1562
    //   #265	-> 1594
    //   #266	-> 1626
    //   #267	-> 1658
    //   #254	-> 1691
    //   #270	-> 1735
    // Exception table:
    //   from	to	target	type
    //   59	73	76	java/lang/RuntimeException
    //   70	94	97	java/lang/RuntimeException
    //   116	124	127	java/lang/RuntimeException
    //   121	141	144	java/lang/RuntimeException
    //   148	156	159	java/lang/RuntimeException
    //   153	379	382	java/lang/RuntimeException
    //   163	389	392	java/lang/RuntimeException
    //   386	405	405	java/lang/RuntimeException
    //   429	784	787	java/lang/RuntimeException
    //   791	976	979	java/lang/RuntimeException
    //   794	986	989	java/lang/RuntimeException
    //   983	1002	1002	java/lang/RuntimeException
    //   1026	1447	1450	java/lang/RuntimeException
    //   1273	1457	1460	java/lang/RuntimeException
    //   1454	1473	1473	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x16AC4E9A689DL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[34];
    boolean bool = false;
    String str;
    int i = (str = "ì[¤±m\"èüßÜá| pÏ\b»¸Ag\024e'\020¢¹<;i«,I\\\003`!Çæ½\bb5b××Ã\020Y¢â`'±.Q\b\032}³ÛFaÇ\020µ¬\017\t'#¹xm\"kd\b\005PülÖa\020\031í¾ù®tó^w7ñ'2\013H1\020µ¬\017\t'#¹xm\"kd\030µ¬\017\t'å­ªVÀK#¦;;c`_ÿ\020¦`3Ø:ug×¹ÒDñ\b*O!ñ\007\031^\020FÄCé\037¥±!¿¯?ÌÁî@\b»¸Ag\024e'\b¶´ICR×z\030µ¬\017\t'å­ªVÀK#¦;;c`_ÿ\020FÄCé\037¥±!¿¯?ÌÁî@\b*O!ñ\007\031^\b\005PülÖa\020Y¢â`'±.Q\b\032}³ÛFaÇ\020¦`3Ø:ug×¹ÒDñ\020ÎÄ#A\032tÒeãr=Ï\013g\020¢¹<;i«,I\\\003`!Çæ½\b¾\\\027JÿN¢\020ÎÄ#A\032tÒeãr=Ï\013g\020$BÅº./ª\016¥îIXybF\020$BÅº./ª\016¥îIXybF\böL¬É°÷\020ì[¤±m\"èüßÜá| pÏ\böL¬É°÷\bb5b××Ã\b¶´ICR×z").length();
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
