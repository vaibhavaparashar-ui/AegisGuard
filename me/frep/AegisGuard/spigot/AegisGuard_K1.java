package me.frep.aegisguard.spigot.AegisGuard_K1;

import java.lang.invoke.MethodHandles;
import me.frep.vulcan.spigot.Vulcan_e;
import me.frep.vulcan.spigot.Vulcan_hu;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerTeleportEvent;

public class Vulcan_K1 {
  private static final long a = Vulcan_e.a(-6673892907753075474L, -3530327319309990969L, MethodHandles.lookup().lookupClass()).a(144171385451350L);
  
  public void Vulcan_M(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_3
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast me/frep/vulcan/spigot/Vulcan_hu
    //   17: astore #5
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast com/github/retrooper/packetevents/event/simple/PacketPlayReceiveEvent
    //   25: astore_2
    //   26: pop
    //   27: getstatic me/frep/vulcan/spigot/Vulcan_K1.a : J
    //   30: lload_3
    //   31: lxor
    //   32: lstore_3
    //   33: lload_3
    //   34: dup2
    //   35: ldc2_w 104516671656218
    //   38: lxor
    //   39: lstore #6
    //   41: dup2
    //   42: ldc2_w 11230372624095
    //   45: lxor
    //   46: lstore #8
    //   48: dup2
    //   49: ldc2_w 83711599546358
    //   52: lxor
    //   53: lstore #10
    //   55: dup2
    //   56: ldc2_w 28122510731459
    //   59: lxor
    //   60: lstore #12
    //   62: dup2
    //   63: ldc2_w 129755646041922
    //   66: lxor
    //   67: lstore #14
    //   69: dup2
    //   70: ldc2_w 134685307223471
    //   73: lxor
    //   74: lstore #16
    //   76: dup2
    //   77: ldc2_w 10370189483732
    //   80: lxor
    //   81: lstore #18
    //   83: dup2
    //   84: ldc2_w 129861989594938
    //   87: lxor
    //   88: lstore #20
    //   90: dup2
    //   91: ldc2_w 35803064856
    //   94: lxor
    //   95: lstore #22
    //   97: dup2
    //   98: ldc2_w 83139482799146
    //   101: lxor
    //   102: lstore #24
    //   104: dup2
    //   105: ldc2_w 140402729488304
    //   108: lxor
    //   109: lstore #26
    //   111: dup2
    //   112: ldc2_w 58978069403101
    //   115: lxor
    //   116: lstore #28
    //   118: dup2
    //   119: ldc2_w 8328521385924
    //   122: lxor
    //   123: lstore #30
    //   125: dup2
    //   126: ldc2_w 57872334299168
    //   129: lxor
    //   130: dup2
    //   131: bipush #32
    //   133: lushr
    //   134: l2i
    //   135: istore #32
    //   137: dup2
    //   138: bipush #32
    //   140: lshl
    //   141: bipush #48
    //   143: lushr
    //   144: l2i
    //   145: istore #33
    //   147: dup2
    //   148: bipush #48
    //   150: lshl
    //   151: bipush #48
    //   153: lushr
    //   154: l2i
    //   155: istore #34
    //   157: pop2
    //   158: dup2
    //   159: ldc2_w 89058882914685
    //   162: lxor
    //   163: lstore #35
    //   165: dup2
    //   166: ldc2_w 84587843494248
    //   169: lxor
    //   170: lstore #37
    //   172: dup2
    //   173: ldc2_w 64691479852045
    //   176: lxor
    //   177: lstore #39
    //   179: dup2
    //   180: ldc2_w 108107284714619
    //   183: lxor
    //   184: lstore #41
    //   186: dup2
    //   187: ldc2_w 14349474543504
    //   190: lxor
    //   191: lstore #43
    //   193: dup2
    //   194: ldc2_w 122057510469888
    //   197: lxor
    //   198: lstore #45
    //   200: dup2
    //   201: ldc2_w 77355251426214
    //   204: lxor
    //   205: lstore #47
    //   207: dup2
    //   208: ldc2_w 117486711178813
    //   211: lxor
    //   212: lstore #49
    //   214: dup2
    //   215: ldc2_w 119270412355225
    //   218: lxor
    //   219: lstore #51
    //   221: dup2
    //   222: ldc2_w 92376357872236
    //   225: lxor
    //   226: lstore #53
    //   228: pop2
    //   229: invokestatic Vulcan_D : ()[I
    //   232: astore #55
    //   234: getstatic me/frep/vulcan/spigot/Vulcan_K5.Vulcan_R : [I
    //   237: aload_2
    //   238: invokevirtual getPacketType : ()Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   241: invokevirtual ordinal : ()I
    //   244: iaload
    //   245: tableswitch default -> 1835, 1 -> 328, 2 -> 328, 3 -> 328, 4 -> 328, 5 -> 875, 6 -> 961, 7 -> 1060, 8 -> 1091, 9 -> 1140, 10 -> 1189, 11 -> 1374, 12 -> 1525, 13 -> 1556, 14 -> 1620, 15 -> 1648, 16 -> 1719, 17 -> 1747
    //   328: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPlayerFlying
    //   331: dup
    //   332: aload_2
    //   333: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   336: astore #56
    //   338: aload #5
    //   340: aload #56
    //   342: iconst_1
    //   343: anewarray java/lang/Object
    //   346: dup_x1
    //   347: swap
    //   348: iconst_0
    //   349: swap
    //   350: aastore
    //   351: invokevirtual Vulcan_Q : ([Ljava/lang/Object;)V
    //   354: aload #5
    //   356: iconst_0
    //   357: anewarray java/lang/Object
    //   360: invokevirtual Vulcan_w : ([Ljava/lang/Object;)Z
    //   363: aload #55
    //   365: ifnonnull -> 785
    //   368: ifeq -> 624
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   377: athrow
    //   378: aload #56
    //   380: invokevirtual hasPositionChanged : ()Z
    //   383: aload #55
    //   385: ifnonnull -> 785
    //   388: goto -> 395
    //   391: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   394: athrow
    //   395: ifeq -> 624
    //   398: goto -> 405
    //   401: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   404: athrow
    //   405: aload #56
    //   407: invokevirtual hasRotationChanged : ()Z
    //   410: aload #55
    //   412: ifnonnull -> 785
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   421: athrow
    //   422: ifeq -> 624
    //   425: goto -> 432
    //   428: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   431: athrow
    //   432: aload #56
    //   434: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   437: invokevirtual getX : ()D
    //   440: dstore #57
    //   442: aload #56
    //   444: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   447: invokevirtual getY : ()D
    //   450: dstore #59
    //   452: aload #56
    //   454: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   457: invokevirtual getZ : ()D
    //   460: dstore #61
    //   462: aload #5
    //   464: iconst_0
    //   465: anewarray java/lang/Object
    //   468: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   471: iconst_0
    //   472: anewarray java/lang/Object
    //   475: invokevirtual Vulcan_r : ([Ljava/lang/Object;)D
    //   478: dstore #63
    //   480: aload #5
    //   482: iconst_0
    //   483: anewarray java/lang/Object
    //   486: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   489: iconst_0
    //   490: anewarray java/lang/Object
    //   493: invokevirtual Vulcan_z : ([Ljava/lang/Object;)D
    //   496: dstore #65
    //   498: aload #5
    //   500: iconst_0
    //   501: anewarray java/lang/Object
    //   504: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   507: iconst_0
    //   508: anewarray java/lang/Object
    //   511: invokevirtual Vulcan_u : ([Ljava/lang/Object;)D
    //   514: dstore #67
    //   516: dload #57
    //   518: dload #63
    //   520: dsub
    //   521: invokestatic abs : (D)D
    //   524: dstore #69
    //   526: dload #59
    //   528: dload #65
    //   530: dsub
    //   531: invokestatic abs : (D)D
    //   534: dstore #71
    //   536: dload #61
    //   538: dload #67
    //   540: dsub
    //   541: invokestatic abs : (D)D
    //   544: dstore #73
    //   546: dload #69
    //   548: dconst_0
    //   549: dcmpl
    //   550: aload #55
    //   552: ifnonnull -> 785
    //   555: ifne -> 624
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   564: athrow
    //   565: dload #71
    //   567: dconst_0
    //   568: dcmpl
    //   569: aload #55
    //   571: ifnonnull -> 785
    //   574: goto -> 581
    //   577: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   580: athrow
    //   581: ifne -> 624
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   590: athrow
    //   591: dload #73
    //   593: dconst_0
    //   594: dcmpl
    //   595: lload_3
    //   596: lconst_0
    //   597: lcmp
    //   598: iflt -> 785
    //   601: aload #55
    //   603: ifnonnull -> 785
    //   606: goto -> 613
    //   609: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   612: athrow
    //   613: ifne -> 624
    //   616: goto -> 623
    //   619: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   622: athrow
    //   623: return
    //   624: aload #5
    //   626: iconst_0
    //   627: anewarray java/lang/Object
    //   630: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   633: lload #49
    //   635: iconst_1
    //   636: anewarray java/lang/Object
    //   639: dup_x2
    //   640: dup_x2
    //   641: pop
    //   642: invokestatic valueOf : (J)Ljava/lang/Long;
    //   645: iconst_0
    //   646: swap
    //   647: aastore
    //   648: invokevirtual Vulcan_b : ([Ljava/lang/Object;)V
    //   651: aload #5
    //   653: iconst_0
    //   654: anewarray java/lang/Object
    //   657: invokevirtual Vulcan_m : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XW;
    //   660: lload #20
    //   662: iconst_1
    //   663: anewarray java/lang/Object
    //   666: dup_x2
    //   667: dup_x2
    //   668: pop
    //   669: invokestatic valueOf : (J)Ljava/lang/Long;
    //   672: iconst_0
    //   673: swap
    //   674: aastore
    //   675: invokevirtual Vulcan_u : ([Ljava/lang/Object;)V
    //   678: aload #5
    //   680: iconst_0
    //   681: anewarray java/lang/Object
    //   684: invokevirtual Vulcan_Y : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_X2;
    //   687: iconst_0
    //   688: anewarray java/lang/Object
    //   691: invokevirtual Vulcan_K : ([Ljava/lang/Object;)V
    //   694: aload #5
    //   696: iconst_0
    //   697: anewarray java/lang/Object
    //   700: lload_3
    //   701: lconst_0
    //   702: lcmp
    //   703: ifle -> 1841
    //   706: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   709: lload #53
    //   711: aload #56
    //   713: iconst_2
    //   714: anewarray java/lang/Object
    //   717: dup_x1
    //   718: swap
    //   719: iconst_1
    //   720: swap
    //   721: aastore
    //   722: dup_x2
    //   723: dup_x2
    //   724: pop
    //   725: invokestatic valueOf : (J)Ljava/lang/Long;
    //   728: iconst_0
    //   729: swap
    //   730: aastore
    //   731: invokevirtual Vulcan_tJ : ([Ljava/lang/Object;)V
    //   734: aload #5
    //   736: aload #55
    //   738: ifnonnull -> 1837
    //   741: iconst_0
    //   742: anewarray java/lang/Object
    //   745: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   748: lload #26
    //   750: aload #56
    //   752: iconst_2
    //   753: anewarray java/lang/Object
    //   756: dup_x1
    //   757: swap
    //   758: iconst_1
    //   759: swap
    //   760: aastore
    //   761: dup_x2
    //   762: dup_x2
    //   763: pop
    //   764: invokestatic valueOf : (J)Ljava/lang/Long;
    //   767: iconst_0
    //   768: swap
    //   769: aastore
    //   770: invokevirtual Vulcan_L7 : ([Ljava/lang/Object;)V
    //   773: aload #56
    //   775: invokevirtual hasRotationChanged : ()Z
    //   778: goto -> 785
    //   781: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   784: athrow
    //   785: ifeq -> 1835
    //   788: aload #5
    //   790: iconst_0
    //   791: anewarray java/lang/Object
    //   794: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_R;
    //   797: aload #56
    //   799: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   802: invokevirtual getYaw : ()F
    //   805: lload #8
    //   807: dup2_x1
    //   808: pop2
    //   809: aload #56
    //   811: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   814: invokevirtual getPitch : ()F
    //   817: iconst_3
    //   818: anewarray java/lang/Object
    //   821: dup_x1
    //   822: swap
    //   823: invokestatic valueOf : (F)Ljava/lang/Float;
    //   826: iconst_2
    //   827: swap
    //   828: aastore
    //   829: dup_x1
    //   830: swap
    //   831: invokestatic valueOf : (F)Ljava/lang/Float;
    //   834: iconst_1
    //   835: swap
    //   836: aastore
    //   837: dup_x2
    //   838: dup_x2
    //   839: pop
    //   840: invokestatic valueOf : (J)Ljava/lang/Long;
    //   843: iconst_0
    //   844: swap
    //   845: aastore
    //   846: invokevirtual Vulcan_o : ([Ljava/lang/Object;)V
    //   849: aload #55
    //   851: ifnull -> 1835
    //   854: goto -> 861
    //   857: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   860: athrow
    //   861: iconst_5
    //   862: anewarray me/frep/vulcan/spigot/check/AbstractCheck
    //   865: invokestatic Vulcan_g : ([Lme/frep/vulcan/spigot/check/AbstractCheck;)V
    //   868: goto -> 875
    //   871: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   874: athrow
    //   875: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientEntityAction
    //   878: dup
    //   879: aload_2
    //   880: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   883: astore #57
    //   885: aload #5
    //   887: aload #57
    //   889: iconst_1
    //   890: anewarray java/lang/Object
    //   893: dup_x1
    //   894: swap
    //   895: iconst_0
    //   896: swap
    //   897: aastore
    //   898: invokevirtual Vulcan_R : ([Ljava/lang/Object;)V
    //   901: aload #5
    //   903: iconst_0
    //   904: anewarray java/lang/Object
    //   907: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   910: iload #32
    //   912: iload #33
    //   914: i2s
    //   915: aload #57
    //   917: iload #34
    //   919: i2s
    //   920: iconst_4
    //   921: anewarray java/lang/Object
    //   924: dup_x1
    //   925: swap
    //   926: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   929: iconst_3
    //   930: swap
    //   931: aastore
    //   932: dup_x1
    //   933: swap
    //   934: iconst_2
    //   935: swap
    //   936: aastore
    //   937: dup_x1
    //   938: swap
    //   939: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   942: iconst_1
    //   943: swap
    //   944: aastore
    //   945: dup_x1
    //   946: swap
    //   947: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   950: iconst_0
    //   951: swap
    //   952: aastore
    //   953: invokevirtual Vulcan_j : ([Ljava/lang/Object;)V
    //   956: aload #55
    //   958: ifnull -> 1835
    //   961: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPlayerDigging
    //   964: dup
    //   965: aload_2
    //   966: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   969: astore #58
    //   971: aload #5
    //   973: aload #58
    //   975: iconst_1
    //   976: anewarray java/lang/Object
    //   979: dup_x1
    //   980: swap
    //   981: iconst_0
    //   982: swap
    //   983: aastore
    //   984: invokevirtual Vulcan_k : ([Ljava/lang/Object;)V
    //   987: aload #5
    //   989: iconst_0
    //   990: anewarray java/lang/Object
    //   993: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   996: lload #10
    //   998: aload #58
    //   1000: iconst_2
    //   1001: anewarray java/lang/Object
    //   1004: dup_x1
    //   1005: swap
    //   1006: iconst_1
    //   1007: swap
    //   1008: aastore
    //   1009: dup_x2
    //   1010: dup_x2
    //   1011: pop
    //   1012: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1015: iconst_0
    //   1016: swap
    //   1017: aastore
    //   1018: invokevirtual Vulcan_kb : ([Ljava/lang/Object;)V
    //   1021: aload #5
    //   1023: iconst_0
    //   1024: anewarray java/lang/Object
    //   1027: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1030: aload #58
    //   1032: lload #35
    //   1034: iconst_2
    //   1035: anewarray java/lang/Object
    //   1038: dup_x2
    //   1039: dup_x2
    //   1040: pop
    //   1041: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1044: iconst_1
    //   1045: swap
    //   1046: aastore
    //   1047: dup_x1
    //   1048: swap
    //   1049: iconst_0
    //   1050: swap
    //   1051: aastore
    //   1052: invokevirtual Vulcan_Vj : ([Ljava/lang/Object;)V
    //   1055: aload #55
    //   1057: ifnull -> 1835
    //   1060: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientHeldItemChange
    //   1063: dup
    //   1064: aload_2
    //   1065: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   1068: astore #59
    //   1070: aload #5
    //   1072: aload #59
    //   1074: iconst_1
    //   1075: anewarray java/lang/Object
    //   1078: dup_x1
    //   1079: swap
    //   1080: iconst_0
    //   1081: swap
    //   1082: aastore
    //   1083: invokevirtual Vulcan_f : ([Ljava/lang/Object;)V
    //   1086: aload #55
    //   1088: ifnull -> 1835
    //   1091: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientVehicleMove
    //   1094: dup
    //   1095: aload_2
    //   1096: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   1099: astore #60
    //   1101: aload #5
    //   1103: iconst_0
    //   1104: anewarray java/lang/Object
    //   1107: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1110: lload #14
    //   1112: aload #60
    //   1114: iconst_2
    //   1115: anewarray java/lang/Object
    //   1118: dup_x1
    //   1119: swap
    //   1120: iconst_1
    //   1121: swap
    //   1122: aastore
    //   1123: dup_x2
    //   1124: dup_x2
    //   1125: pop
    //   1126: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1129: iconst_0
    //   1130: swap
    //   1131: aastore
    //   1132: invokevirtual Vulcan_l : ([Ljava/lang/Object;)V
    //   1135: aload #55
    //   1137: ifnull -> 1835
    //   1140: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientClientStatus
    //   1143: dup
    //   1144: aload_2
    //   1145: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   1148: astore #61
    //   1150: aload #5
    //   1152: iconst_0
    //   1153: anewarray java/lang/Object
    //   1156: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1159: lload #28
    //   1161: aload #61
    //   1163: iconst_2
    //   1164: anewarray java/lang/Object
    //   1167: dup_x1
    //   1168: swap
    //   1169: iconst_1
    //   1170: swap
    //   1171: aastore
    //   1172: dup_x2
    //   1173: dup_x2
    //   1174: pop
    //   1175: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1178: iconst_0
    //   1179: swap
    //   1180: aastore
    //   1181: invokevirtual Vulcan_d : ([Ljava/lang/Object;)V
    //   1184: aload #55
    //   1186: ifnull -> 1835
    //   1189: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPong
    //   1192: dup
    //   1193: aload_2
    //   1194: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   1197: astore #62
    //   1199: aload #5
    //   1201: iconst_0
    //   1202: anewarray java/lang/Object
    //   1205: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1208: aload #62
    //   1210: lload #12
    //   1212: iconst_2
    //   1213: anewarray java/lang/Object
    //   1216: dup_x2
    //   1217: dup_x2
    //   1218: pop
    //   1219: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1222: iconst_1
    //   1223: swap
    //   1224: aastore
    //   1225: dup_x1
    //   1226: swap
    //   1227: iconst_0
    //   1228: swap
    //   1229: aastore
    //   1230: invokevirtual Vulcan_n8 : ([Ljava/lang/Object;)V
    //   1233: aload #5
    //   1235: iconst_0
    //   1236: anewarray java/lang/Object
    //   1239: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1242: lload #16
    //   1244: aload #62
    //   1246: iconst_2
    //   1247: anewarray java/lang/Object
    //   1250: dup_x1
    //   1251: swap
    //   1252: iconst_1
    //   1253: swap
    //   1254: aastore
    //   1255: dup_x2
    //   1256: dup_x2
    //   1257: pop
    //   1258: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1261: iconst_0
    //   1262: swap
    //   1263: aastore
    //   1264: invokevirtual Vulcan_Q0 : ([Ljava/lang/Object;)V
    //   1267: aload #5
    //   1269: iconst_0
    //   1270: anewarray java/lang/Object
    //   1273: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1276: lload #16
    //   1278: aload #62
    //   1280: iconst_2
    //   1281: anewarray java/lang/Object
    //   1284: dup_x1
    //   1285: swap
    //   1286: iconst_1
    //   1287: swap
    //   1288: aastore
    //   1289: dup_x2
    //   1290: dup_x2
    //   1291: pop
    //   1292: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1295: iconst_0
    //   1296: swap
    //   1297: aastore
    //   1298: invokevirtual Vulcan_Q0 : ([Ljava/lang/Object;)V
    //   1301: aload #5
    //   1303: iconst_0
    //   1304: anewarray java/lang/Object
    //   1307: invokevirtual Vulcan_m : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XW;
    //   1310: aload #62
    //   1312: lload #47
    //   1314: iconst_2
    //   1315: anewarray java/lang/Object
    //   1318: dup_x2
    //   1319: dup_x2
    //   1320: pop
    //   1321: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1324: iconst_1
    //   1325: swap
    //   1326: aastore
    //   1327: dup_x1
    //   1328: swap
    //   1329: iconst_0
    //   1330: swap
    //   1331: aastore
    //   1332: invokevirtual Vulcan_U : ([Ljava/lang/Object;)V
    //   1335: aload #5
    //   1337: iconst_0
    //   1338: anewarray java/lang/Object
    //   1341: invokevirtual Vulcan_Y : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_X2;
    //   1344: aload #62
    //   1346: lload #43
    //   1348: iconst_2
    //   1349: anewarray java/lang/Object
    //   1352: dup_x2
    //   1353: dup_x2
    //   1354: pop
    //   1355: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1358: iconst_1
    //   1359: swap
    //   1360: aastore
    //   1361: dup_x1
    //   1362: swap
    //   1363: iconst_0
    //   1364: swap
    //   1365: aastore
    //   1366: invokevirtual Vulcan_x : ([Ljava/lang/Object;)V
    //   1369: aload #55
    //   1371: ifnull -> 1835
    //   1374: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientWindowConfirmation
    //   1377: dup
    //   1378: aload_2
    //   1379: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   1382: astore #63
    //   1384: aload #5
    //   1386: iconst_0
    //   1387: anewarray java/lang/Object
    //   1390: invokevirtual Vulcan_m : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XW;
    //   1393: lload #39
    //   1395: aload #63
    //   1397: iconst_2
    //   1398: anewarray java/lang/Object
    //   1401: dup_x1
    //   1402: swap
    //   1403: iconst_1
    //   1404: swap
    //   1405: aastore
    //   1406: dup_x2
    //   1407: dup_x2
    //   1408: pop
    //   1409: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1412: iconst_0
    //   1413: swap
    //   1414: aastore
    //   1415: invokevirtual Vulcan_e : ([Ljava/lang/Object;)V
    //   1418: aload #5
    //   1420: iconst_0
    //   1421: anewarray java/lang/Object
    //   1424: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1427: aload #63
    //   1429: lload #22
    //   1431: iconst_2
    //   1432: anewarray java/lang/Object
    //   1435: dup_x2
    //   1436: dup_x2
    //   1437: pop
    //   1438: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1441: iconst_1
    //   1442: swap
    //   1443: aastore
    //   1444: dup_x1
    //   1445: swap
    //   1446: iconst_0
    //   1447: swap
    //   1448: aastore
    //   1449: invokevirtual Vulcan_H : ([Ljava/lang/Object;)V
    //   1452: aload #5
    //   1454: iconst_0
    //   1455: anewarray java/lang/Object
    //   1458: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1461: lload #37
    //   1463: aload #63
    //   1465: iconst_2
    //   1466: anewarray java/lang/Object
    //   1469: dup_x1
    //   1470: swap
    //   1471: iconst_1
    //   1472: swap
    //   1473: aastore
    //   1474: dup_x2
    //   1475: dup_x2
    //   1476: pop
    //   1477: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1480: iconst_0
    //   1481: swap
    //   1482: aastore
    //   1483: invokevirtual Vulcan_bk : ([Ljava/lang/Object;)V
    //   1486: aload #5
    //   1488: iconst_0
    //   1489: anewarray java/lang/Object
    //   1492: invokevirtual Vulcan_Y : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_X2;
    //   1495: lload #51
    //   1497: aload #63
    //   1499: iconst_2
    //   1500: anewarray java/lang/Object
    //   1503: dup_x1
    //   1504: swap
    //   1505: iconst_1
    //   1506: swap
    //   1507: aastore
    //   1508: dup_x2
    //   1509: dup_x2
    //   1510: pop
    //   1511: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1514: iconst_0
    //   1515: swap
    //   1516: aastore
    //   1517: invokevirtual Vulcan_E : ([Ljava/lang/Object;)V
    //   1520: aload #55
    //   1522: ifnull -> 1835
    //   1525: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientKeepAlive
    //   1528: dup
    //   1529: aload_2
    //   1530: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   1533: astore #64
    //   1535: aload #5
    //   1537: iconst_0
    //   1538: anewarray java/lang/Object
    //   1541: invokevirtual Vulcan_m : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XW;
    //   1544: iconst_0
    //   1545: anewarray java/lang/Object
    //   1548: invokevirtual Vulcan_X : ([Ljava/lang/Object;)V
    //   1551: aload #55
    //   1553: ifnull -> 1835
    //   1556: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPlayerBlockPlacement
    //   1559: dup
    //   1560: aload_2
    //   1561: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   1564: astore #65
    //   1566: aload #5
    //   1568: aload #65
    //   1570: iconst_1
    //   1571: anewarray java/lang/Object
    //   1574: dup_x1
    //   1575: swap
    //   1576: iconst_0
    //   1577: swap
    //   1578: aastore
    //   1579: invokevirtual Vulcan_B : ([Ljava/lang/Object;)V
    //   1582: aload #5
    //   1584: iconst_0
    //   1585: anewarray java/lang/Object
    //   1588: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1591: lload #30
    //   1593: iconst_1
    //   1594: anewarray java/lang/Object
    //   1597: dup_x2
    //   1598: dup_x2
    //   1599: pop
    //   1600: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1603: iconst_0
    //   1604: swap
    //   1605: aastore
    //   1606: invokevirtual Vulcan_E : ([Ljava/lang/Object;)V
    //   1609: aload #55
    //   1611: lload_3
    //   1612: lconst_0
    //   1613: lcmp
    //   1614: iflt -> 1638
    //   1617: ifnull -> 1835
    //   1620: aload #5
    //   1622: iconst_0
    //   1623: anewarray java/lang/Object
    //   1626: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1629: iconst_0
    //   1630: anewarray java/lang/Object
    //   1633: invokevirtual Vulcan_W : ([Ljava/lang/Object;)V
    //   1636: aload #55
    //   1638: ifnull -> 1835
    //   1641: goto -> 1648
    //   1644: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1647: athrow
    //   1648: new com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientInteractEntity
    //   1651: dup
    //   1652: aload_2
    //   1653: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketReceiveEvent;)V
    //   1656: astore #66
    //   1658: aload #5
    //   1660: aload #66
    //   1662: iconst_1
    //   1663: anewarray java/lang/Object
    //   1666: dup_x1
    //   1667: swap
    //   1668: iconst_0
    //   1669: swap
    //   1670: aastore
    //   1671: invokevirtual Vulcan_m : ([Ljava/lang/Object;)V
    //   1674: aload #5
    //   1676: iconst_0
    //   1677: anewarray java/lang/Object
    //   1680: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   1683: aload #66
    //   1685: lload #24
    //   1687: iconst_2
    //   1688: anewarray java/lang/Object
    //   1691: dup_x2
    //   1692: dup_x2
    //   1693: pop
    //   1694: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1697: iconst_1
    //   1698: swap
    //   1699: aastore
    //   1700: dup_x1
    //   1701: swap
    //   1702: iconst_0
    //   1703: swap
    //   1704: aastore
    //   1705: invokevirtual Vulcan_m : ([Ljava/lang/Object;)V
    //   1708: aload #55
    //   1710: lload_3
    //   1711: lconst_0
    //   1712: lcmp
    //   1713: iflt -> 1737
    //   1716: ifnull -> 1835
    //   1719: aload #5
    //   1721: iconst_0
    //   1722: anewarray java/lang/Object
    //   1725: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1728: iconst_0
    //   1729: anewarray java/lang/Object
    //   1732: invokevirtual Vulcan_N : ([Ljava/lang/Object;)V
    //   1735: aload #55
    //   1737: ifnull -> 1835
    //   1740: goto -> 1747
    //   1743: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1746: athrow
    //   1747: aload #5
    //   1749: iconst_0
    //   1750: anewarray java/lang/Object
    //   1753: invokevirtual Vulcan_v : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XR;
    //   1756: lload #45
    //   1758: iconst_1
    //   1759: anewarray java/lang/Object
    //   1762: dup_x2
    //   1763: dup_x2
    //   1764: pop
    //   1765: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1768: iconst_0
    //   1769: swap
    //   1770: aastore
    //   1771: invokevirtual Vulcan_x : ([Ljava/lang/Object;)V
    //   1774: aload #5
    //   1776: iconst_0
    //   1777: anewarray java/lang/Object
    //   1780: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1783: lload #18
    //   1785: iconst_1
    //   1786: anewarray java/lang/Object
    //   1789: dup_x2
    //   1790: dup_x2
    //   1791: pop
    //   1792: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1795: iconst_0
    //   1796: swap
    //   1797: aastore
    //   1798: invokevirtual Vulcan_tT : ([Ljava/lang/Object;)V
    //   1801: aload #5
    //   1803: iconst_0
    //   1804: anewarray java/lang/Object
    //   1807: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1810: lload #6
    //   1812: iconst_1
    //   1813: anewarray java/lang/Object
    //   1816: dup_x2
    //   1817: dup_x2
    //   1818: pop
    //   1819: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1822: iconst_0
    //   1823: swap
    //   1824: aastore
    //   1825: invokevirtual Vulcan_z : ([Ljava/lang/Object;)V
    //   1828: goto -> 1835
    //   1831: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1834: athrow
    //   1835: aload #5
    //   1837: iconst_0
    //   1838: anewarray java/lang/Object
    //   1841: invokevirtual Vulcan_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   1844: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1849: astore #56
    //   1851: aload #56
    //   1853: invokeinterface hasNext : ()Z
    //   1858: ifeq -> 1928
    //   1861: aload #56
    //   1863: invokeinterface next : ()Ljava/lang/Object;
    //   1868: checkcast me/frep/vulcan/spigot/check/AbstractCheck
    //   1871: astore #57
    //   1873: aload #57
    //   1875: aload_2
    //   1876: lload #41
    //   1878: iconst_2
    //   1879: anewarray java/lang/Object
    //   1882: dup_x2
    //   1883: dup_x2
    //   1884: pop
    //   1885: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1888: iconst_1
    //   1889: swap
    //   1890: aastore
    //   1891: dup_x1
    //   1892: swap
    //   1893: iconst_0
    //   1894: swap
    //   1895: aastore
    //   1896: invokevirtual Vulcan__ : ([Ljava/lang/Object;)V
    //   1899: lload_3
    //   1900: lconst_0
    //   1901: lcmp
    //   1902: ifle -> 2037
    //   1905: aload #55
    //   1907: ifnonnull -> 2037
    //   1910: aload #55
    //   1912: ifnull -> 1851
    //   1915: lload_3
    //   1916: lconst_0
    //   1917: lcmp
    //   1918: iflt -> 1899
    //   1921: goto -> 1928
    //   1924: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1927: athrow
    //   1928: aload_2
    //   1929: invokevirtual getPacketType : ()Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   1932: getstatic com/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client.PLAYER_FLYING : Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   1935: aload #55
    //   1937: lload_3
    //   1938: lconst_0
    //   1939: lcmp
    //   1940: ifle -> 1972
    //   1943: ifnonnull -> 1970
    //   1946: if_acmpeq -> 2037
    //   1949: goto -> 1956
    //   1952: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1955: athrow
    //   1956: aload_2
    //   1957: invokevirtual getPacketType : ()Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   1960: getstatic com/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client.PLAYER_POSITION : Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   1963: goto -> 1970
    //   1966: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1969: athrow
    //   1970: aload #55
    //   1972: lload_3
    //   1973: lconst_0
    //   1974: lcmp
    //   1975: ifle -> 2007
    //   1978: ifnonnull -> 2005
    //   1981: if_acmpeq -> 2037
    //   1984: goto -> 1991
    //   1987: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1990: athrow
    //   1991: aload_2
    //   1992: invokevirtual getPacketType : ()Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   1995: getstatic com/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client.PLAYER_ROTATION : Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   1998: goto -> 2005
    //   2001: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2004: athrow
    //   2005: aload #55
    //   2007: ifnonnull -> 2034
    //   2010: if_acmpeq -> 2037
    //   2013: goto -> 2020
    //   2016: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2019: athrow
    //   2020: aload_2
    //   2021: invokevirtual getPacketType : ()Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   2024: getstatic com/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client.PLAYER_POSITION_AND_ROTATION : Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Client;
    //   2027: goto -> 2034
    //   2030: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2033: athrow
    //   2034: if_acmpne -> 3252
    //   2037: iconst_0
    //   2038: anewarray java/lang/Object
    //   2041: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   2044: lload_3
    //   2045: lconst_0
    //   2046: lcmp
    //   2047: iflt -> 2106
    //   2050: aload #55
    //   2052: ifnonnull -> 2106
    //   2055: ifeq -> 2602
    //   2058: goto -> 2065
    //   2061: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2064: athrow
    //   2065: aload #5
    //   2067: iconst_0
    //   2068: anewarray java/lang/Object
    //   2071: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2074: lload_3
    //   2075: lconst_0
    //   2076: lcmp
    //   2077: iflt -> 2630
    //   2080: aload #55
    //   2082: ifnonnull -> 2630
    //   2085: goto -> 2092
    //   2088: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2091: athrow
    //   2092: iconst_0
    //   2093: anewarray java/lang/Object
    //   2096: invokevirtual Vulcan_C_ : ([Ljava/lang/Object;)Z
    //   2099: goto -> 2106
    //   2102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2105: athrow
    //   2106: ifne -> 2602
    //   2109: aload #5
    //   2111: aload #55
    //   2113: ifnonnull -> 3095
    //   2116: goto -> 2123
    //   2119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2122: athrow
    //   2123: iconst_0
    //   2124: anewarray java/lang/Object
    //   2127: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2130: iconst_0
    //   2131: anewarray java/lang/Object
    //   2134: invokevirtual Vulcan_K : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   2137: ifnull -> 3093
    //   2140: goto -> 2147
    //   2143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2146: athrow
    //   2147: aload #5
    //   2149: aload #55
    //   2151: ifnonnull -> 3095
    //   2154: goto -> 2161
    //   2157: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2160: athrow
    //   2161: iconst_0
    //   2162: anewarray java/lang/Object
    //   2165: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2168: iconst_0
    //   2169: anewarray java/lang/Object
    //   2172: invokevirtual Vulcan_K : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   2175: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   2178: if_acmpeq -> 3093
    //   2181: goto -> 2188
    //   2184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2187: athrow
    //   2188: aload #5
    //   2190: iconst_0
    //   2191: anewarray java/lang/Object
    //   2194: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2197: iconst_0
    //   2198: anewarray java/lang/Object
    //   2201: invokevirtual Vulcan_K : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   2204: invokevirtual isBlock : ()Z
    //   2207: aload #55
    //   2209: ifnonnull -> 3102
    //   2212: goto -> 2219
    //   2215: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2218: athrow
    //   2219: ifeq -> 3093
    //   2222: goto -> 2229
    //   2225: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2228: athrow
    //   2229: aload #5
    //   2231: iconst_0
    //   2232: anewarray java/lang/Object
    //   2235: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2238: iconst_0
    //   2239: anewarray java/lang/Object
    //   2242: invokevirtual Vulcan_Cy : ([Ljava/lang/Object;)Z
    //   2245: aload #55
    //   2247: ifnonnull -> 3102
    //   2250: goto -> 2257
    //   2253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2256: athrow
    //   2257: ifeq -> 3093
    //   2260: goto -> 2267
    //   2263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2266: athrow
    //   2267: aload #5
    //   2269: iconst_0
    //   2270: anewarray java/lang/Object
    //   2273: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2276: iconst_0
    //   2277: anewarray java/lang/Object
    //   2280: invokevirtual Vulcan_K : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   2283: invokestatic Vulcan_K0 : (Lorg/bukkit/Material;)Z
    //   2286: aload #55
    //   2288: ifnonnull -> 3102
    //   2291: goto -> 2298
    //   2294: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2297: athrow
    //   2298: ifne -> 3093
    //   2301: goto -> 2308
    //   2304: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2307: athrow
    //   2308: aload #5
    //   2310: iconst_0
    //   2311: anewarray java/lang/Object
    //   2314: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2317: iconst_0
    //   2318: anewarray java/lang/Object
    //   2321: invokevirtual Vulcan_L : ([Ljava/lang/Object;)I
    //   2324: aload #55
    //   2326: ifnonnull -> 3102
    //   2329: goto -> 2336
    //   2332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2335: athrow
    //   2336: iconst_5
    //   2337: if_icmple -> 3093
    //   2340: goto -> 2347
    //   2343: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2346: athrow
    //   2347: aload #5
    //   2349: iconst_0
    //   2350: anewarray java/lang/Object
    //   2353: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2356: iconst_0
    //   2357: anewarray java/lang/Object
    //   2360: invokevirtual Vulcan_T : ([Ljava/lang/Object;)D
    //   2363: ldc2_w 2.0
    //   2366: dcmpg
    //   2367: aload #55
    //   2369: ifnonnull -> 3102
    //   2372: goto -> 2379
    //   2375: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2378: athrow
    //   2379: ifge -> 3093
    //   2382: goto -> 2389
    //   2385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2388: athrow
    //   2389: aload #5
    //   2391: iconst_0
    //   2392: anewarray java/lang/Object
    //   2395: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   2398: iconst_0
    //   2399: anewarray java/lang/Object
    //   2402: invokevirtual Vulcan_y : ([Ljava/lang/Object;)Z
    //   2405: aload #55
    //   2407: ifnonnull -> 3102
    //   2410: goto -> 2417
    //   2413: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2416: athrow
    //   2417: ifne -> 3093
    //   2420: goto -> 2427
    //   2423: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2426: athrow
    //   2427: aload #5
    //   2429: iconst_0
    //   2430: anewarray java/lang/Object
    //   2433: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2436: iconst_0
    //   2437: anewarray java/lang/Object
    //   2440: invokevirtual Vulcan_R : ([Ljava/lang/Object;)I
    //   2443: aload #55
    //   2445: ifnonnull -> 3102
    //   2448: goto -> 2455
    //   2451: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2454: athrow
    //   2455: bipush #20
    //   2457: if_icmple -> 3093
    //   2460: goto -> 2467
    //   2463: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2466: athrow
    //   2467: aload #5
    //   2469: iconst_0
    //   2470: anewarray java/lang/Object
    //   2473: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2476: aload #5
    //   2478: iconst_0
    //   2479: anewarray java/lang/Object
    //   2482: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2485: iconst_0
    //   2486: anewarray java/lang/Object
    //   2489: invokevirtual Vulcan_r : ([Ljava/lang/Object;)D
    //   2492: iconst_1
    //   2493: anewarray java/lang/Object
    //   2496: dup_x2
    //   2497: dup_x2
    //   2498: pop
    //   2499: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2502: iconst_0
    //   2503: swap
    //   2504: aastore
    //   2505: invokevirtual Vulcan_dI : ([Ljava/lang/Object;)V
    //   2508: aload #5
    //   2510: iconst_0
    //   2511: anewarray java/lang/Object
    //   2514: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2517: aload #5
    //   2519: iconst_0
    //   2520: anewarray java/lang/Object
    //   2523: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2526: iconst_0
    //   2527: anewarray java/lang/Object
    //   2530: invokevirtual Vulcan_z : ([Ljava/lang/Object;)D
    //   2533: iconst_1
    //   2534: anewarray java/lang/Object
    //   2537: dup_x2
    //   2538: dup_x2
    //   2539: pop
    //   2540: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2543: iconst_0
    //   2544: swap
    //   2545: aastore
    //   2546: invokevirtual Vulcan_do : ([Ljava/lang/Object;)V
    //   2549: aload #5
    //   2551: iconst_0
    //   2552: anewarray java/lang/Object
    //   2555: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2558: aload #5
    //   2560: iconst_0
    //   2561: anewarray java/lang/Object
    //   2564: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2567: iconst_0
    //   2568: anewarray java/lang/Object
    //   2571: invokevirtual Vulcan_u : ([Ljava/lang/Object;)D
    //   2574: iconst_1
    //   2575: anewarray java/lang/Object
    //   2578: dup_x2
    //   2579: dup_x2
    //   2580: pop
    //   2581: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2584: iconst_0
    //   2585: swap
    //   2586: aastore
    //   2587: invokevirtual Vulcan_dD : ([Ljava/lang/Object;)V
    //   2590: aload #55
    //   2592: ifnull -> 3093
    //   2595: goto -> 2602
    //   2598: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2601: athrow
    //   2602: aload #5
    //   2604: aload #55
    //   2606: ifnonnull -> 3095
    //   2609: goto -> 2616
    //   2612: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2615: athrow
    //   2616: iconst_0
    //   2617: anewarray java/lang/Object
    //   2620: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2623: goto -> 2630
    //   2626: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2629: athrow
    //   2630: iconst_0
    //   2631: anewarray java/lang/Object
    //   2634: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   2637: lload_3
    //   2638: lconst_0
    //   2639: lcmp
    //   2640: iflt -> 2662
    //   2643: ifnull -> 3093
    //   2646: aload #5
    //   2648: iconst_0
    //   2649: anewarray java/lang/Object
    //   2652: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2655: iconst_0
    //   2656: anewarray java/lang/Object
    //   2659: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   2662: invokevirtual isSolid : ()Z
    //   2665: aload #55
    //   2667: ifnonnull -> 3102
    //   2670: goto -> 2677
    //   2673: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2676: athrow
    //   2677: ifeq -> 3093
    //   2680: goto -> 2687
    //   2683: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2686: athrow
    //   2687: aload #5
    //   2689: iconst_0
    //   2690: anewarray java/lang/Object
    //   2693: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2696: iconst_0
    //   2697: anewarray java/lang/Object
    //   2700: invokevirtual Vulcan_Cy : ([Ljava/lang/Object;)Z
    //   2703: aload #55
    //   2705: ifnonnull -> 3102
    //   2708: goto -> 2715
    //   2711: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2714: athrow
    //   2715: ifeq -> 3093
    //   2718: goto -> 2725
    //   2721: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2724: athrow
    //   2725: aload #5
    //   2727: iconst_0
    //   2728: anewarray java/lang/Object
    //   2731: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2734: iconst_0
    //   2735: anewarray java/lang/Object
    //   2738: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   2741: invokestatic Vulcan_K0 : (Lorg/bukkit/Material;)Z
    //   2744: aload #55
    //   2746: ifnonnull -> 3102
    //   2749: goto -> 2756
    //   2752: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2755: athrow
    //   2756: ifne -> 3093
    //   2759: goto -> 2766
    //   2762: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2765: athrow
    //   2766: aload #5
    //   2768: iconst_0
    //   2769: anewarray java/lang/Object
    //   2772: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2775: iconst_0
    //   2776: anewarray java/lang/Object
    //   2779: invokevirtual Vulcan_C_ : ([Ljava/lang/Object;)Z
    //   2782: aload #55
    //   2784: ifnonnull -> 3102
    //   2787: goto -> 2794
    //   2790: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2793: athrow
    //   2794: ifne -> 3093
    //   2797: goto -> 2804
    //   2800: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2803: athrow
    //   2804: aload #5
    //   2806: iconst_0
    //   2807: anewarray java/lang/Object
    //   2810: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2813: iconst_0
    //   2814: anewarray java/lang/Object
    //   2817: invokevirtual Vulcan_T : ([Ljava/lang/Object;)D
    //   2820: ldc2_w 2.0
    //   2823: dcmpg
    //   2824: aload #55
    //   2826: ifnonnull -> 3102
    //   2829: goto -> 2836
    //   2832: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2835: athrow
    //   2836: ifge -> 3093
    //   2839: goto -> 2846
    //   2842: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2845: athrow
    //   2846: aload #5
    //   2848: iconst_0
    //   2849: anewarray java/lang/Object
    //   2852: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2855: iconst_0
    //   2856: anewarray java/lang/Object
    //   2859: invokevirtual Vulcan_L : ([Ljava/lang/Object;)I
    //   2862: aload #55
    //   2864: ifnonnull -> 3102
    //   2867: goto -> 2874
    //   2870: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2873: athrow
    //   2874: iconst_5
    //   2875: if_icmple -> 3093
    //   2878: goto -> 2885
    //   2881: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2884: athrow
    //   2885: aload #5
    //   2887: iconst_0
    //   2888: anewarray java/lang/Object
    //   2891: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   2894: iconst_0
    //   2895: anewarray java/lang/Object
    //   2898: invokevirtual Vulcan_y : ([Ljava/lang/Object;)Z
    //   2901: aload #55
    //   2903: ifnonnull -> 3102
    //   2906: goto -> 2913
    //   2909: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2912: athrow
    //   2913: ifne -> 3093
    //   2916: goto -> 2923
    //   2919: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2922: athrow
    //   2923: aload #5
    //   2925: iconst_0
    //   2926: anewarray java/lang/Object
    //   2929: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2932: iconst_0
    //   2933: anewarray java/lang/Object
    //   2936: invokevirtual Vulcan_R : ([Ljava/lang/Object;)I
    //   2939: aload #55
    //   2941: ifnonnull -> 3102
    //   2944: goto -> 2951
    //   2947: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2950: athrow
    //   2951: bipush #20
    //   2953: if_icmple -> 3093
    //   2956: goto -> 2963
    //   2959: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2962: athrow
    //   2963: aload #5
    //   2965: iconst_0
    //   2966: anewarray java/lang/Object
    //   2969: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2972: aload #5
    //   2974: iconst_0
    //   2975: anewarray java/lang/Object
    //   2978: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2981: iconst_0
    //   2982: anewarray java/lang/Object
    //   2985: invokevirtual Vulcan_r : ([Ljava/lang/Object;)D
    //   2988: iconst_1
    //   2989: anewarray java/lang/Object
    //   2992: dup_x2
    //   2993: dup_x2
    //   2994: pop
    //   2995: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2998: iconst_0
    //   2999: swap
    //   3000: aastore
    //   3001: invokevirtual Vulcan_dI : ([Ljava/lang/Object;)V
    //   3004: aload #5
    //   3006: iconst_0
    //   3007: anewarray java/lang/Object
    //   3010: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   3013: aload #5
    //   3015: iconst_0
    //   3016: anewarray java/lang/Object
    //   3019: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   3022: iconst_0
    //   3023: anewarray java/lang/Object
    //   3026: invokevirtual Vulcan_z : ([Ljava/lang/Object;)D
    //   3029: iconst_1
    //   3030: anewarray java/lang/Object
    //   3033: dup_x2
    //   3034: dup_x2
    //   3035: pop
    //   3036: invokestatic valueOf : (D)Ljava/lang/Double;
    //   3039: iconst_0
    //   3040: swap
    //   3041: aastore
    //   3042: invokevirtual Vulcan_do : ([Ljava/lang/Object;)V
    //   3045: aload #5
    //   3047: iconst_0
    //   3048: anewarray java/lang/Object
    //   3051: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   3054: aload #5
    //   3056: iconst_0
    //   3057: anewarray java/lang/Object
    //   3060: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   3063: iconst_0
    //   3064: anewarray java/lang/Object
    //   3067: invokevirtual Vulcan_u : ([Ljava/lang/Object;)D
    //   3070: iconst_1
    //   3071: anewarray java/lang/Object
    //   3074: dup_x2
    //   3075: dup_x2
    //   3076: pop
    //   3077: invokestatic valueOf : (D)Ljava/lang/Double;
    //   3080: iconst_0
    //   3081: swap
    //   3082: aastore
    //   3083: invokevirtual Vulcan_dD : ([Ljava/lang/Object;)V
    //   3086: goto -> 3093
    //   3089: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3092: athrow
    //   3093: aload #5
    //   3095: iconst_0
    //   3096: anewarray java/lang/Object
    //   3099: invokevirtual Vulcan_V : ([Ljava/lang/Object;)Z
    //   3102: ifeq -> 3252
    //   3105: new org/bukkit/Location
    //   3108: dup
    //   3109: aload #5
    //   3111: iconst_0
    //   3112: anewarray java/lang/Object
    //   3115: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   3118: iconst_0
    //   3119: anewarray java/lang/Object
    //   3122: invokevirtual Vulcan_l : ([Ljava/lang/Object;)Lorg/bukkit/World;
    //   3125: aload #5
    //   3127: iconst_0
    //   3128: anewarray java/lang/Object
    //   3131: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   3134: iconst_0
    //   3135: anewarray java/lang/Object
    //   3138: invokevirtual Vulcan_B : ([Ljava/lang/Object;)D
    //   3141: aload #5
    //   3143: iconst_0
    //   3144: anewarray java/lang/Object
    //   3147: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   3150: iconst_0
    //   3151: anewarray java/lang/Object
    //   3154: invokevirtual Vulcan_d : ([Ljava/lang/Object;)D
    //   3157: aload #5
    //   3159: iconst_0
    //   3160: anewarray java/lang/Object
    //   3163: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   3166: iconst_0
    //   3167: anewarray java/lang/Object
    //   3170: invokevirtual Vulcan_p : ([Ljava/lang/Object;)D
    //   3173: aload #5
    //   3175: iconst_0
    //   3176: anewarray java/lang/Object
    //   3179: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_R;
    //   3182: iconst_0
    //   3183: anewarray java/lang/Object
    //   3186: invokevirtual Vulcan_P : ([Ljava/lang/Object;)F
    //   3189: aload #5
    //   3191: iconst_0
    //   3192: anewarray java/lang/Object
    //   3195: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_R;
    //   3198: iconst_0
    //   3199: anewarray java/lang/Object
    //   3202: invokevirtual Vulcan_A : ([Ljava/lang/Object;)F
    //   3205: invokespecial <init> : (Lorg/bukkit/World;DDDFF)V
    //   3208: astore #56
    //   3210: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   3213: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   3216: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   3219: aload #5
    //   3221: aload #56
    //   3223: <illegal opcode> run : (Lme/frep/vulcan/spigot/Vulcan_hu;Lorg/bukkit/Location;)Ljava/lang/Runnable;
    //   3228: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   3233: pop
    //   3234: aload #5
    //   3236: iconst_0
    //   3237: iconst_1
    //   3238: anewarray java/lang/Object
    //   3241: dup_x1
    //   3242: swap
    //   3243: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3246: iconst_0
    //   3247: swap
    //   3248: aastore
    //   3249: invokevirtual Vulcan_U : ([Ljava/lang/Object;)V
    //   3252: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #19	-> 234
    //   #24	-> 328
    //   #26	-> 338
    //   #28	-> 354
    //   #29	-> 432
    //   #30	-> 442
    //   #31	-> 452
    //   #33	-> 462
    //   #34	-> 480
    //   #35	-> 498
    //   #37	-> 516
    //   #38	-> 526
    //   #39	-> 536
    //   #41	-> 546
    //   #44	-> 624
    //   #45	-> 651
    //   #46	-> 678
    //   #47	-> 694
    //   #48	-> 734
    //   #50	-> 773
    //   #51	-> 788
    //   #55	-> 875
    //   #57	-> 885
    //   #59	-> 901
    //   #60	-> 956
    //   #62	-> 961
    //   #64	-> 971
    //   #66	-> 987
    //   #67	-> 1021
    //   #69	-> 1055
    //   #71	-> 1060
    //   #73	-> 1070
    //   #75	-> 1086
    //   #77	-> 1091
    //   #79	-> 1101
    //   #81	-> 1135
    //   #83	-> 1140
    //   #85	-> 1150
    //   #86	-> 1184
    //   #88	-> 1189
    //   #90	-> 1199
    //   #91	-> 1233
    //   #92	-> 1267
    //   #93	-> 1301
    //   #94	-> 1335
    //   #96	-> 1369
    //   #98	-> 1374
    //   #101	-> 1384
    //   #102	-> 1418
    //   #103	-> 1452
    //   #104	-> 1486
    //   #105	-> 1520
    //   #107	-> 1525
    //   #109	-> 1535
    //   #111	-> 1551
    //   #113	-> 1556
    //   #115	-> 1566
    //   #117	-> 1582
    //   #119	-> 1609
    //   #121	-> 1620
    //   #122	-> 1636
    //   #124	-> 1648
    //   #126	-> 1658
    //   #128	-> 1674
    //   #130	-> 1708
    //   #132	-> 1719
    //   #134	-> 1735
    //   #136	-> 1747
    //   #137	-> 1774
    //   #138	-> 1801
    //   #143	-> 1835
    //   #144	-> 1873
    //   #145	-> 1899
    //   #147	-> 1928
    //   #148	-> 1957
    //   #149	-> 1992
    //   #150	-> 2021
    //   #151	-> 2037
    //   #152	-> 2109
    //   #153	-> 2149
    //   #154	-> 2190
    //   #155	-> 2231
    //   #156	-> 2269
    //   #157	-> 2310
    //   #158	-> 2349
    //   #159	-> 2391
    //   #160	-> 2429
    //   #161	-> 2467
    //   #162	-> 2508
    //   #163	-> 2549
    //   #165	-> 2602
    //   #166	-> 2648
    //   #167	-> 2689
    //   #168	-> 2727
    //   #169	-> 2768
    //   #170	-> 2806
    //   #171	-> 2848
    //   #172	-> 2887
    //   #173	-> 2925
    //   #174	-> 2963
    //   #175	-> 3004
    //   #176	-> 3045
    //   #179	-> 3093
    //   #180	-> 3105
    //   #181	-> 3143
    //   #182	-> 3175
    //   #184	-> 3210
    //   #187	-> 3234
    //   #190	-> 3252
    // Exception table:
    //   from	to	target	type
    //   338	371	374	java/lang/RuntimeException
    //   368	388	391	java/lang/RuntimeException
    //   378	398	401	java/lang/RuntimeException
    //   395	415	418	java/lang/RuntimeException
    //   405	425	428	java/lang/RuntimeException
    //   546	558	561	java/lang/RuntimeException
    //   555	574	577	java/lang/RuntimeException
    //   565	584	587	java/lang/RuntimeException
    //   581	606	609	java/lang/RuntimeException
    //   591	616	619	java/lang/RuntimeException
    //   624	778	781	java/lang/RuntimeException
    //   785	854	857	java/lang/RuntimeException
    //   788	868	871	java/lang/RuntimeException
    //   1566	1641	1644	java/lang/RuntimeException
    //   1658	1740	1743	java/lang/RuntimeException
    //   1719	1828	1831	java/lang/RuntimeException
    //   1873	1915	1924	java/lang/RuntimeException
    //   1928	1949	1952	java/lang/RuntimeException
    //   1946	1963	1966	java/lang/RuntimeException
    //   1970	1984	1987	java/lang/RuntimeException
    //   1981	1998	2001	java/lang/RuntimeException
    //   2005	2013	2016	java/lang/RuntimeException
    //   2010	2027	2030	java/lang/RuntimeException
    //   2037	2058	2061	java/lang/RuntimeException
    //   2055	2085	2088	java/lang/RuntimeException
    //   2065	2099	2102	java/lang/RuntimeException
    //   2106	2116	2119	java/lang/RuntimeException
    //   2109	2140	2143	java/lang/RuntimeException
    //   2123	2154	2157	java/lang/RuntimeException
    //   2147	2181	2184	java/lang/RuntimeException
    //   2161	2212	2215	java/lang/RuntimeException
    //   2188	2222	2225	java/lang/RuntimeException
    //   2219	2250	2253	java/lang/RuntimeException
    //   2229	2260	2263	java/lang/RuntimeException
    //   2257	2291	2294	java/lang/RuntimeException
    //   2267	2301	2304	java/lang/RuntimeException
    //   2298	2329	2332	java/lang/RuntimeException
    //   2308	2340	2343	java/lang/RuntimeException
    //   2336	2372	2375	java/lang/RuntimeException
    //   2347	2382	2385	java/lang/RuntimeException
    //   2379	2410	2413	java/lang/RuntimeException
    //   2389	2420	2423	java/lang/RuntimeException
    //   2417	2448	2451	java/lang/RuntimeException
    //   2427	2460	2463	java/lang/RuntimeException
    //   2455	2595	2598	java/lang/RuntimeException
    //   2467	2609	2612	java/lang/RuntimeException
    //   2602	2623	2626	java/lang/RuntimeException
    //   2630	2670	2673	java/lang/RuntimeException
    //   2646	2680	2683	java/lang/RuntimeException
    //   2677	2708	2711	java/lang/RuntimeException
    //   2687	2718	2721	java/lang/RuntimeException
    //   2715	2749	2752	java/lang/RuntimeException
    //   2725	2759	2762	java/lang/RuntimeException
    //   2756	2787	2790	java/lang/RuntimeException
    //   2766	2797	2800	java/lang/RuntimeException
    //   2794	2829	2832	java/lang/RuntimeException
    //   2804	2839	2842	java/lang/RuntimeException
    //   2836	2867	2870	java/lang/RuntimeException
    //   2846	2878	2881	java/lang/RuntimeException
    //   2874	2906	2909	java/lang/RuntimeException
    //   2885	2916	2919	java/lang/RuntimeException
    //   2913	2944	2947	java/lang/RuntimeException
    //   2923	2956	2959	java/lang/RuntimeException
    //   2951	3086	3089	java/lang/RuntimeException
  }
  
  private static void lambda$handle$0(Vulcan_hu paramVulcan_hu, Location paramLocation) {
    paramVulcan_hu.Vulcan_L(new Object[0]).teleport(paramLocation, PlayerTeleportEvent.TeleportCause.UNKNOWN);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
