package me.frep.aegisguard.spigot.AegisGuard_hP;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_KX;
import me.frep.aegisguard.spigot.aegisguard_Xa;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;

public class aegisguard_hP {
  private static final long a = aegisguard_e.a(-7925673779508491688L, -2607227171694349052L, MethodHandles.lookup().lookupClass()).a(138813891022751L);
  
  private static final String[] b;
  
  public void aegisguard_I(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast [B
    //   14: astore_3
    //   15: dup
    //   16: iconst_2
    //   17: aaload
    //   18: checkcast java/lang/Long
    //   21: invokevirtual longValue : ()J
    //   24: lstore #4
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_hP.a : J
    //   30: lload #4
    //   32: lxor
    //   33: lstore #4
    //   35: lload #4
    //   37: dup2
    //   38: ldc2_w 89558368884979
    //   41: lxor
    //   42: lstore #6
    //   44: dup2
    //   45: ldc2_w 66973955785006
    //   48: lxor
    //   49: lstore #8
    //   51: dup2
    //   52: ldc2_w 28816959713834
    //   55: lxor
    //   56: lstore #10
    //   58: dup2
    //   59: ldc2_w 75000425869584
    //   62: lxor
    //   63: lstore #12
    //   65: pop2
    //   66: invokestatic aegisguard_i : ()[I
    //   69: astore #14
    //   71: aload_2
    //   72: iconst_0
    //   73: anewarray java/lang/Object
    //   76: invokevirtual aegisguard_y : ([Ljava/lang/Object;)Z
    //   79: aload #14
    //   81: ifnull -> 113
    //   84: ifne -> 140
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: invokestatic currentTimeMillis : ()J
    //   97: aload_2
    //   98: invokevirtual getLastClientBrandAlert : ()J
    //   101: lsub
    //   102: ldc2_w 10000
    //   105: lcmp
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload #14
    //   115: ifnull -> 137
    //   118: iflt -> 140
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   127: athrow
    //   128: aload_3
    //   129: arraylength
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: ifgt -> 141
    //   140: return
    //   141: new java/lang/String
    //   144: dup
    //   145: aload_3
    //   146: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   149: astore #19
    //   151: aload #19
    //   153: bipush #9
    //   155: aaload
    //   156: invokespecial <init> : ([BLjava/lang/String;)V
    //   159: iconst_1
    //   160: invokevirtual substring : (I)Ljava/lang/String;
    //   163: lload #8
    //   165: dup2_x1
    //   166: pop2
    //   167: iconst_2
    //   168: anewarray java/lang/Object
    //   171: dup_x1
    //   172: swap
    //   173: iconst_1
    //   174: swap
    //   175: aastore
    //   176: dup_x2
    //   177: dup_x2
    //   178: pop
    //   179: invokestatic valueOf : (J)Ljava/lang/Long;
    //   182: iconst_0
    //   183: swap
    //   184: aastore
    //   185: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   188: aload #19
    //   190: iconst_5
    //   191: aaload
    //   192: ldc ''
    //   194: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   197: astore #15
    //   199: aload #14
    //   201: ifnull -> 285
    //   204: aload #15
    //   206: ldc '%'
    //   208: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   211: ifne -> 257
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   220: athrow
    //   221: aload #15
    //   223: ldc '$'
    //   225: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   228: aload #14
    //   230: lload #4
    //   232: lconst_0
    //   233: lcmp
    //   234: ifle -> 325
    //   237: ifnull -> 323
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: ifeq -> 286
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   260: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   263: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   266: aload_2
    //   267: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;)Ljava/lang/Runnable;
    //   272: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   277: pop
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   284: athrow
    //   285: return
    //   286: aload_2
    //   287: aload #15
    //   289: iconst_1
    //   290: anewarray java/lang/Object
    //   293: dup_x1
    //   294: swap
    //   295: iconst_0
    //   296: swap
    //   297: aastore
    //   298: invokevirtual aegisguard_G : ([Ljava/lang/Object;)V
    //   301: aload_2
    //   302: iconst_0
    //   303: anewarray java/lang/Object
    //   306: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   309: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   312: astore #19
    //   314: aload #19
    //   316: iconst_3
    //   317: aaload
    //   318: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   323: aload #14
    //   325: lload #4
    //   327: lconst_0
    //   328: lcmp
    //   329: iflt -> 517
    //   332: ifnull -> 515
    //   335: ifne -> 503
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   344: athrow
    //   345: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G2 : Ljava/util/List;
    //   348: invokeinterface iterator : ()Ljava/util/Iterator;
    //   353: astore #16
    //   355: aload #16
    //   357: invokeinterface hasNext : ()Z
    //   362: ifeq -> 503
    //   365: aload #16
    //   367: invokeinterface next : ()Ljava/lang/Object;
    //   372: checkcast java/lang/String
    //   375: astore #17
    //   377: aload #14
    //   379: ifnull -> 475
    //   382: aload #15
    //   384: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   387: aload #17
    //   389: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   392: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   395: aload #14
    //   397: ifnull -> 515
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   406: athrow
    //   407: ifeq -> 498
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   416: athrow
    //   417: aload_2
    //   418: iconst_0
    //   419: anewarray java/lang/Object
    //   422: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   425: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dY : Ljava/lang/String;
    //   428: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   431: iconst_4
    //   432: aaload
    //   433: aload #15
    //   435: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   438: lload #6
    //   440: dup2_x1
    //   441: pop2
    //   442: iconst_2
    //   443: anewarray java/lang/Object
    //   446: dup_x1
    //   447: swap
    //   448: iconst_1
    //   449: swap
    //   450: aastore
    //   451: dup_x2
    //   452: dup_x2
    //   453: pop
    //   454: invokestatic valueOf : (J)Ljava/lang/Long;
    //   457: iconst_0
    //   458: swap
    //   459: aastore
    //   460: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   463: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   468: goto -> 475
    //   471: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   474: athrow
    //   475: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   478: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   481: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   484: aload_2
    //   485: aload #15
    //   487: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;Ljava/lang/String;)Ljava/lang/Runnable;
    //   492: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   497: pop
    //   498: aload #14
    //   500: ifnonnull -> 355
    //   503: aload #15
    //   505: lload #4
    //   507: lconst_0
    //   508: lcmp
    //   509: iflt -> 541
    //   512: invokevirtual length : ()I
    //   515: aload #14
    //   517: lload #4
    //   519: lconst_0
    //   520: lcmp
    //   521: ifle -> 555
    //   524: ifnull -> 553
    //   527: bipush #55
    //   529: if_icmpgt -> 575
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   538: athrow
    //   539: aload #15
    //   541: ldc '\\n'
    //   543: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   546: goto -> 553
    //   549: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   552: athrow
    //   553: aload #14
    //   555: lload #4
    //   557: lconst_0
    //   558: lcmp
    //   559: iflt -> 648
    //   562: ifnull -> 646
    //   565: ifeq -> 643
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   574: athrow
    //   575: aload_2
    //   576: iconst_0
    //   577: anewarray java/lang/Object
    //   580: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   583: lload #6
    //   585: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   588: astore #19
    //   590: aload #19
    //   592: bipush #12
    //   594: aaload
    //   595: iconst_2
    //   596: anewarray java/lang/Object
    //   599: dup_x1
    //   600: swap
    //   601: iconst_1
    //   602: swap
    //   603: aastore
    //   604: dup_x2
    //   605: dup_x2
    //   606: pop
    //   607: invokestatic valueOf : (J)Ljava/lang/Long;
    //   610: iconst_0
    //   611: swap
    //   612: aastore
    //   613: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   616: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   621: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   624: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   627: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   630: aload_2
    //   631: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;)Ljava/lang/Runnable;
    //   636: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   641: pop
    //   642: return
    //   643: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_p : Z
    //   646: aload #14
    //   648: ifnull -> 875
    //   651: ifeq -> 872
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   660: athrow
    //   661: aload_2
    //   662: iconst_0
    //   663: anewarray java/lang/Object
    //   666: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   669: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   672: bipush #7
    //   674: aaload
    //   675: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   680: aload #14
    //   682: ifnull -> 710
    //   685: goto -> 692
    //   688: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   691: athrow
    //   692: ifeq -> 709
    //   695: goto -> 702
    //   698: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   701: athrow
    //   702: lload #4
    //   704: lconst_0
    //   705: lcmp
    //   706: ifgt -> 872
    //   709: iconst_0
    //   710: istore #16
    //   712: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dI : Ljava/util/List;
    //   715: invokeinterface iterator : ()Ljava/util/Iterator;
    //   720: astore #17
    //   722: aload #17
    //   724: invokeinterface hasNext : ()Z
    //   729: ifeq -> 825
    //   732: aload #17
    //   734: invokeinterface next : ()Ljava/lang/Object;
    //   739: checkcast java/lang/String
    //   742: astore #18
    //   744: aload #15
    //   746: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   749: aload #18
    //   751: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   754: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   757: aload #14
    //   759: lload #4
    //   761: lconst_0
    //   762: lcmp
    //   763: iflt -> 829
    //   766: ifnull -> 827
    //   769: aload #14
    //   771: ifnull -> 792
    //   774: goto -> 781
    //   777: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   780: athrow
    //   781: ifeq -> 806
    //   784: goto -> 791
    //   787: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   790: athrow
    //   791: iconst_1
    //   792: istore #16
    //   794: aload #14
    //   796: lload #4
    //   798: lconst_0
    //   799: lcmp
    //   800: iflt -> 808
    //   803: ifnonnull -> 825
    //   806: aload #14
    //   808: ifnonnull -> 722
    //   811: lload #4
    //   813: lconst_0
    //   814: lcmp
    //   815: ifle -> 744
    //   818: goto -> 825
    //   821: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   824: athrow
    //   825: iload #16
    //   827: aload #14
    //   829: ifnull -> 875
    //   832: ifne -> 872
    //   835: goto -> 842
    //   838: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   841: athrow
    //   842: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   845: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   848: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   851: aload_2
    //   852: aload #15
    //   854: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;Ljava/lang/String;)Ljava/lang/Runnable;
    //   859: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   864: pop
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   871: athrow
    //   872: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GU : Z
    //   875: ifeq -> 1401
    //   878: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mg : Ljava/util/List;
    //   881: invokeinterface iterator : ()Ljava/util/Iterator;
    //   886: astore #16
    //   888: aload #16
    //   890: invokeinterface hasNext : ()Z
    //   895: ifeq -> 983
    //   898: aload #16
    //   900: invokeinterface next : ()Ljava/lang/Object;
    //   905: checkcast java/lang/String
    //   908: astore #17
    //   910: aload #15
    //   912: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   915: aload #17
    //   917: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   920: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   923: aload #14
    //   925: lload #4
    //   927: lconst_0
    //   928: lcmp
    //   929: iflt -> 997
    //   932: ifnull -> 995
    //   935: ifeq -> 964
    //   938: goto -> 945
    //   941: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   944: athrow
    //   945: lload #4
    //   947: lconst_0
    //   948: lcmp
    //   949: ifle -> 1418
    //   952: aload #14
    //   954: ifnonnull -> 1401
    //   957: goto -> 964
    //   960: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   963: athrow
    //   964: aload #14
    //   966: ifnonnull -> 888
    //   969: lload #4
    //   971: lconst_0
    //   972: lcmp
    //   973: iflt -> 910
    //   976: goto -> 983
    //   979: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   982: athrow
    //   983: invokestatic currentTimeMillis : ()J
    //   986: aload_2
    //   987: invokevirtual getLastClientBrandAlert : ()J
    //   990: lsub
    //   991: ldc2_w 10000
    //   994: lcmp
    //   995: aload #14
    //   997: lload #4
    //   999: lconst_0
    //   1000: lcmp
    //   1001: iflt -> 1029
    //   1004: ifnull -> 1027
    //   1007: ifge -> 1024
    //   1010: goto -> 1017
    //   1013: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1016: athrow
    //   1017: lload #4
    //   1019: lconst_0
    //   1020: lcmp
    //   1021: ifge -> 1401
    //   1024: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yR : Z
    //   1027: aload #14
    //   1029: lload #4
    //   1031: lconst_0
    //   1032: lcmp
    //   1033: iflt -> 1205
    //   1036: ifnull -> 1203
    //   1039: ifeq -> 1180
    //   1042: goto -> 1049
    //   1045: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1048: athrow
    //   1049: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L6 : Ljava/lang/String;
    //   1052: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   1055: bipush #13
    //   1057: aaload
    //   1058: aload_2
    //   1059: iconst_0
    //   1060: anewarray java/lang/Object
    //   1063: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1066: invokeinterface getName : ()Ljava/lang/String;
    //   1071: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1074: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   1077: iconst_2
    //   1078: aaload
    //   1079: aload_2
    //   1080: iconst_0
    //   1081: anewarray java/lang/Object
    //   1084: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1087: lload #10
    //   1089: dup2_x1
    //   1090: pop2
    //   1091: iconst_2
    //   1092: anewarray java/lang/Object
    //   1095: dup_x1
    //   1096: swap
    //   1097: iconst_1
    //   1098: swap
    //   1099: aastore
    //   1100: dup_x2
    //   1101: dup_x2
    //   1102: pop
    //   1103: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1106: iconst_0
    //   1107: swap
    //   1108: aastore
    //   1109: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1112: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1115: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   1118: iconst_4
    //   1119: aaload
    //   1120: aload #15
    //   1122: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1125: lload #6
    //   1127: dup2_x1
    //   1128: pop2
    //   1129: iconst_2
    //   1130: anewarray java/lang/Object
    //   1133: dup_x1
    //   1134: swap
    //   1135: iconst_1
    //   1136: swap
    //   1137: aastore
    //   1138: dup_x2
    //   1139: dup_x2
    //   1140: pop
    //   1141: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1144: iconst_0
    //   1145: swap
    //   1146: aastore
    //   1147: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1150: lload #12
    //   1152: iconst_2
    //   1153: anewarray java/lang/Object
    //   1156: dup_x2
    //   1157: dup_x2
    //   1158: pop
    //   1159: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1162: iconst_1
    //   1163: swap
    //   1164: aastore
    //   1165: dup_x1
    //   1166: swap
    //   1167: iconst_0
    //   1168: swap
    //   1169: aastore
    //   1170: invokestatic aegisguard_F : ([Ljava/lang/Object;)V
    //   1173: goto -> 1180
    //   1176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1179: athrow
    //   1180: aload_2
    //   1181: iconst_0
    //   1182: anewarray java/lang/Object
    //   1185: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1188: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   1191: astore #19
    //   1193: aload #19
    //   1195: bipush #10
    //   1197: aaload
    //   1198: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   1203: aload #14
    //   1205: ifnull -> 1231
    //   1208: ifeq -> 1225
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1217: athrow
    //   1218: lload #4
    //   1220: lconst_0
    //   1221: lcmp
    //   1222: ifgt -> 1401
    //   1225: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1228: invokevirtual aegisguard_x : ()Z
    //   1231: ifeq -> 1360
    //   1234: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_M2 : Ljava/lang/String;
    //   1237: getstatic me/frep/aegisguard/spigot/aegisguard_hP.b : [Ljava/lang/String;
    //   1240: astore #19
    //   1242: aload #19
    //   1244: iconst_0
    //   1245: aaload
    //   1246: aload_2
    //   1247: iconst_0
    //   1248: anewarray java/lang/Object
    //   1251: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1254: invokeinterface getName : ()Ljava/lang/String;
    //   1259: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1262: aload #19
    //   1264: bipush #11
    //   1266: aaload
    //   1267: aload_2
    //   1268: iconst_0
    //   1269: anewarray java/lang/Object
    //   1272: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1275: lload #10
    //   1277: dup2_x1
    //   1278: pop2
    //   1279: iconst_2
    //   1280: anewarray java/lang/Object
    //   1283: dup_x1
    //   1284: swap
    //   1285: iconst_1
    //   1286: swap
    //   1287: aastore
    //   1288: dup_x2
    //   1289: dup_x2
    //   1290: pop
    //   1291: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1294: iconst_0
    //   1295: swap
    //   1296: aastore
    //   1297: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1300: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1303: aload #19
    //   1305: iconst_4
    //   1306: aaload
    //   1307: aload_2
    //   1308: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1311: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1314: astore #16
    //   1316: aload_2
    //   1317: iconst_0
    //   1318: anewarray java/lang/Object
    //   1321: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1324: aload #16
    //   1326: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   1329: astore #16
    //   1331: aload #16
    //   1333: astore #17
    //   1335: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   1338: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1341: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   1344: aload #17
    //   1346: <illegal opcode> run : (Ljava/lang/String;)Ljava/lang/Runnable;
    //   1351: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   1356: pop
    //   1357: goto -> 1381
    //   1360: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   1363: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1366: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   1369: aload_2
    //   1370: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;)Ljava/lang/Runnable;
    //   1375: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   1380: pop
    //   1381: aload_2
    //   1382: invokestatic currentTimeMillis : ()J
    //   1385: iconst_1
    //   1386: anewarray java/lang/Object
    //   1389: dup_x2
    //   1390: dup_x2
    //   1391: pop
    //   1392: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1395: iconst_0
    //   1396: swap
    //   1397: aastore
    //   1398: invokevirtual aegisguard_v : ([Ljava/lang/Object;)V
    //   1401: aload_2
    //   1402: iconst_1
    //   1403: iconst_1
    //   1404: anewarray java/lang/Object
    //   1407: dup_x1
    //   1408: swap
    //   1409: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1412: iconst_0
    //   1413: swap
    //   1414: aastore
    //   1415: invokevirtual aegisguard_t : ([Ljava/lang/Object;)V
    //   1418: goto -> 1428
    //   1421: astore #15
    //   1423: aload #15
    //   1425: invokevirtual printStackTrace : ()V
    //   1428: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #16	-> 71
    //   #17	-> 94
    //   #18	-> 140
    //   #21	-> 141
    //   #23	-> 199
    //   #24	-> 257
    //   #26	-> 285
    //   #29	-> 286
    //   #31	-> 301
    //   #32	-> 345
    //   #33	-> 377
    //   #34	-> 417
    //   #35	-> 475
    //   #39	-> 498
    //   #42	-> 503
    //   #43	-> 575
    //   #44	-> 621
    //   #46	-> 642
    //   #50	-> 643
    //   #52	-> 709
    //   #54	-> 712
    //   #55	-> 744
    //   #56	-> 791
    //   #57	-> 794
    //   #59	-> 806
    //   #61	-> 825
    //   #62	-> 842
    //   #69	-> 872
    //   #71	-> 878
    //   #72	-> 910
    //   #73	-> 945
    //   #75	-> 964
    //   #77	-> 983
    //   #79	-> 1024
    //   #80	-> 1049
    //   #81	-> 1059
    //   #82	-> 1080
    //   #83	-> 1122
    //   #80	-> 1129
    //   #86	-> 1180
    //   #88	-> 1225
    //   #89	-> 1234
    //   #90	-> 1247
    //   #91	-> 1268
    //   #92	-> 1308
    //   #94	-> 1316
    //   #95	-> 1331
    //   #96	-> 1335
    //   #98	-> 1357
    //   #99	-> 1360
    //   #106	-> 1381
    //   #110	-> 1401
    //   #113	-> 1418
    //   #111	-> 1421
    //   #112	-> 1423
    //   #114	-> 1428
    // Exception table:
    //   from	to	target	type
    //   71	87	90	java/lang/Exception
    //   84	106	109	java/lang/Exception
    //   113	121	124	java/lang/Exception
    //   118	130	133	java/lang/Exception
    //   141	285	1421	java/lang/Exception
    //   199	214	217	java/lang/Exception
    //   204	240	243	java/lang/Exception
    //   221	250	253	java/lang/Exception
    //   247	278	281	java/lang/Exception
    //   286	642	1421	java/lang/Exception
    //   323	338	341	java/lang/Exception
    //   377	400	403	java/lang/Exception
    //   382	410	413	java/lang/Exception
    //   407	468	471	java/lang/Exception
    //   515	532	535	java/lang/Exception
    //   527	546	549	java/lang/Exception
    //   553	568	571	java/lang/Exception
    //   643	1418	1421	java/lang/Exception
    //   646	654	657	java/lang/Exception
    //   651	685	688	java/lang/Exception
    //   661	695	698	java/lang/Exception
    //   744	774	777	java/lang/Exception
    //   769	784	787	java/lang/Exception
    //   794	811	821	java/lang/Exception
    //   827	835	838	java/lang/Exception
    //   832	865	868	java/lang/Exception
    //   910	938	941	java/lang/Exception
    //   935	957	960	java/lang/Exception
    //   945	969	979	java/lang/Exception
    //   995	1010	1013	java/lang/Exception
    //   1027	1042	1045	java/lang/Exception
    //   1039	1173	1176	java/lang/Exception
    //   1203	1211	1214	java/lang/Exception
  }
  
  private static void lambda$handle$0(aegisguard_hu paramaegisguard_hu) {
    long l1 = a ^ 0x50CFD905A050L, l2 = l1 ^ 0x16A1FC7ACC58L;
    (new Object[2])[1] = b[1];
    new Object[2];
    paramaegisguard_hu.aegisguard_L(new Object[0]).kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  private static void lambda$handle$1(aegisguard_hu paramaegisguard_hu, String paramString) {
    long l1 = a ^ 0x7EB22DF0B4FDL, l2 = l1 ^ 0x38DC088FD8F5L;
    (new Object[2])[1] = aegisguard_b0.aegisguard_dY.replaceAll(b[4], paramString);
    new Object[2];
    paramaegisguard_hu.aegisguard_L(new Object[0]).kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  private static void lambda$handle$2(aegisguard_hu paramaegisguard_hu) {
    long l1 = a ^ 0x5AE9A4728680L, l2 = l1 ^ 0x1C87810DEA88L;
    (new Object[2])[1] = b[8];
    new Object[2];
    paramaegisguard_hu.aegisguard_L(new Object[0]).kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  private static void lambda$handle$3(aegisguard_hu paramaegisguard_hu, String paramString) {
    long l1 = a ^ 0x1A03865EDA26L, l2 = l1 ^ 0x5C6DA321B62EL;
    String[] arrayOfString = b;
    (new Object[2])[1] = aegisguard_b0.aegisguard_dY.replaceAll(arrayOfString[6], paramString);
    new Object[2];
    paramaegisguard_hu.aegisguard_L(new Object[0]).sendMessage(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
    (new Object[2])[1] = aegisguard_b0.aegisguard_dY.replaceAll(arrayOfString[4], paramString);
    new Object[2];
    paramaegisguard_hu.aegisguard_L(new Object[0]).kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  private static void lambda$handle$4(String paramString) {
    aegisguard_K.INSTANCE.aegisguard_l().aegisguard_H(new Object[] { paramString });
  }
  
  private static void lambda$handle$5(aegisguard_hu paramaegisguard_hu) {
    long l1 = a ^ 0x259EA653D110L, l2 = l1 ^ 0x28B6154A97C1L;
    String[] arrayOfString = b;
    (new Object[2])[1] = paramaegisguard_hu.aegisguard_L(new Object[0]);
    new Object[2];
    aegisguard_K.INSTANCE.aegisguard_l().aegisguard_H(new Object[] { aegisguard_b0.aegisguard_M2.replaceAll(arrayOfString[0], paramaegisguard_hu.aegisguard_L(new Object[0]).getName()).replaceAll(arrayOfString[11], aegisguard_Xa.aegisguard_g(new Object[] { Long.valueOf(l2) })).replaceAll(arrayOfString[4], paramaegisguard_hu.getClientBrand()) });
  }
  
  static {
    long l = a ^ 0x5136AB06520FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "¹ZÅ\021³\020A^pb£ìÛî¢ ;/f`RÓ@+2}\036l|-\025ñ¡¹MHñUÙ_zÁã\030ô+{ê»\025½#|uù\026ÿ1\bv­r%,g(àù6ÕË\024ò\\Q\006W¬\013\007IqdIçzg$yð\f\\ÝU°ý\005Õ\004è»\020ô+{ê»\025½WÀ\006\"³\020LùÛVqÇÈ¥øky­f[\020ô+{ê»\025½WÀ\006\"³(àù6ÕË\024ò\\Q\006W¬\013\007IqdIçzg$çêQ)å#\022ÿ\016.\030;/f`RÓ@+2}\036l|Ì¶,ê¨ß\b;ßéê\003Y(o(àù6ÕË\024ò\\Q\006W¬\013\007IqdIçzg$¶Z\034³\007{ô\020Y¢ vµ°;\030ô+{ê»\025½#|uù\026ÿ1\bv­r%,g").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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
