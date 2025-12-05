package me.frep.aegisguard.spigot.AegisGuard_hb;

import com.github.retrooper.packetevents.event.simple.PacketPlaySendEvent;
import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;

public class aegisguard_hb {
  private static int[] aegisguard_Q;
  
  private static final long a = aegisguard_e.a(5677207468724820344L, -4617564093872033980L, MethodHandles.lookup().lookupClass()).a(185221266296380L);
  
  public void aegisguard_E(aegisguard_hu paramaegisguard_hu, PacketPlaySendEvent paramPacketPlaySendEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_hb.a : J
    //   3: ldc2_w 105061757103230
    //   6: lxor
    //   7: lstore_3
    //   8: lload_3
    //   9: dup2
    //   10: ldc2_w 4623389798677
    //   13: lxor
    //   14: lstore #5
    //   16: dup2
    //   17: ldc2_w 74267326025970
    //   20: lxor
    //   21: lstore #7
    //   23: dup2
    //   24: ldc2_w 86109431838426
    //   27: lxor
    //   28: lstore #9
    //   30: dup2
    //   31: ldc2_w 138610529643689
    //   34: lxor
    //   35: lstore #11
    //   37: dup2
    //   38: ldc2_w 4865363381272
    //   41: lxor
    //   42: lstore #13
    //   44: dup2
    //   45: ldc2_w 29118206558565
    //   48: lxor
    //   49: lstore #15
    //   51: dup2
    //   52: ldc2_w 137683193860211
    //   55: lxor
    //   56: lstore #17
    //   58: dup2
    //   59: ldc2_w 118815343836697
    //   62: lxor
    //   63: lstore #19
    //   65: dup2
    //   66: ldc2_w 14325553711690
    //   69: lxor
    //   70: lstore #21
    //   72: dup2
    //   73: ldc2_w 129528354282428
    //   76: lxor
    //   77: lstore #23
    //   79: dup2
    //   80: ldc2_w 45839761418236
    //   83: lxor
    //   84: lstore #25
    //   86: pop2
    //   87: invokestatic aegisguard_D : ()[I
    //   90: astore #27
    //   92: getstatic me/frep/aegisguard/spigot/aegisguard_hm.aegisguard_L : [I
    //   95: aload_2
    //   96: invokevirtual getPacketType : ()Lcom/github/retrooper/packetevents/protocol/packettype/PacketType$Play$Server;
    //   99: invokevirtual ordinal : ()I
    //   102: iaload
    //   103: tableswitch default -> 1034, 1 -> 164, 2 -> 298, 3 -> 386, 4 -> 529, 5 -> 599, 6 -> 635, 7 -> 723, 8 -> 811, 9 -> 859, 10 -> 907, 11 -> 955, 12 -> 1003
    //   164: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerEntityVelocity
    //   167: dup
    //   168: aload_2
    //   169: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   172: astore #28
    //   174: aload #27
    //   176: ifnonnull -> 293
    //   179: aload #28
    //   181: invokevirtual getEntityId : ()I
    //   184: aload_1
    //   185: iconst_0
    //   186: anewarray java/lang/Object
    //   189: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   192: invokeinterface getEntityId : ()I
    //   197: if_icmpne -> 1034
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   206: athrow
    //   207: aload_1
    //   208: iconst_0
    //   209: anewarray java/lang/Object
    //   212: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_X2;
    //   215: aload #28
    //   217: invokevirtual getVelocity : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   220: invokevirtual getX : ()D
    //   223: aload #28
    //   225: invokevirtual getVelocity : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   228: invokevirtual getY : ()D
    //   231: lload #9
    //   233: dup2_x2
    //   234: pop2
    //   235: aload #28
    //   237: invokevirtual getVelocity : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   240: invokevirtual getZ : ()D
    //   243: iconst_4
    //   244: anewarray java/lang/Object
    //   247: dup_x2
    //   248: dup_x2
    //   249: pop
    //   250: invokestatic valueOf : (D)Ljava/lang/Double;
    //   253: iconst_3
    //   254: swap
    //   255: aastore
    //   256: dup_x2
    //   257: dup_x2
    //   258: pop
    //   259: invokestatic valueOf : (D)Ljava/lang/Double;
    //   262: iconst_2
    //   263: swap
    //   264: aastore
    //   265: dup_x2
    //   266: dup_x2
    //   267: pop
    //   268: invokestatic valueOf : (J)Ljava/lang/Long;
    //   271: iconst_1
    //   272: swap
    //   273: aastore
    //   274: dup_x2
    //   275: dup_x2
    //   276: pop
    //   277: invokestatic valueOf : (D)Ljava/lang/Double;
    //   280: iconst_0
    //   281: swap
    //   282: aastore
    //   283: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   292: athrow
    //   293: aload #27
    //   295: ifnull -> 1034
    //   298: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes
    //   301: dup
    //   302: aload_2
    //   303: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   306: astore #29
    //   308: aload #27
    //   310: ifnonnull -> 381
    //   313: aload #29
    //   315: invokevirtual getEntityId : ()I
    //   318: aload_1
    //   319: iconst_0
    //   320: anewarray java/lang/Object
    //   323: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   326: invokeinterface getEntityId : ()I
    //   331: if_icmpne -> 1034
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   340: athrow
    //   341: aload_1
    //   342: iconst_0
    //   343: anewarray java/lang/Object
    //   346: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   349: aload #29
    //   351: lload #17
    //   353: iconst_2
    //   354: anewarray java/lang/Object
    //   357: dup_x2
    //   358: dup_x2
    //   359: pop
    //   360: invokestatic valueOf : (J)Ljava/lang/Long;
    //   363: iconst_1
    //   364: swap
    //   365: aastore
    //   366: dup_x1
    //   367: swap
    //   368: iconst_0
    //   369: swap
    //   370: aastore
    //   371: invokevirtual aegisguard_c2 : ([Ljava/lang/Object;)V
    //   374: goto -> 381
    //   377: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   380: athrow
    //   381: aload #27
    //   383: ifnull -> 1034
    //   386: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerPlayerPositionAndLook
    //   389: dup
    //   390: aload_2
    //   391: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   394: astore #30
    //   396: aload_1
    //   397: iconst_0
    //   398: anewarray java/lang/Object
    //   401: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   404: aload #30
    //   406: lload #23
    //   408: iconst_2
    //   409: anewarray java/lang/Object
    //   412: dup_x2
    //   413: dup_x2
    //   414: pop
    //   415: invokestatic valueOf : (J)Ljava/lang/Long;
    //   418: iconst_1
    //   419: swap
    //   420: aastore
    //   421: dup_x1
    //   422: swap
    //   423: iconst_0
    //   424: swap
    //   425: aastore
    //   426: invokevirtual aegisguard_j_ : ([Ljava/lang/Object;)V
    //   429: aload_1
    //   430: iconst_0
    //   431: anewarray java/lang/Object
    //   434: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   437: iconst_0
    //   438: anewarray java/lang/Object
    //   441: invokevirtual aegisguard_T : ([Ljava/lang/Object;)V
    //   444: aload_1
    //   445: iconst_0
    //   446: anewarray java/lang/Object
    //   449: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   452: invokeinterface iterator : ()Ljava/util/Iterator;
    //   457: astore #31
    //   459: aload #31
    //   461: invokeinterface hasNext : ()Z
    //   466: ifeq -> 524
    //   469: aload #31
    //   471: invokeinterface next : ()Ljava/lang/Object;
    //   476: checkcast me/frep/aegisguard/spigot/check/AbstractCheck
    //   479: astore #32
    //   481: aload #32
    //   483: aload_2
    //   484: lload #15
    //   486: iconst_2
    //   487: anewarray java/lang/Object
    //   490: dup_x2
    //   491: dup_x2
    //   492: pop
    //   493: invokestatic valueOf : (J)Ljava/lang/Long;
    //   496: iconst_1
    //   497: swap
    //   498: aastore
    //   499: dup_x1
    //   500: swap
    //   501: iconst_0
    //   502: swap
    //   503: aastore
    //   504: invokevirtual aegisguard__ : ([Ljava/lang/Object;)V
    //   507: aload #27
    //   509: ifnonnull -> 1034
    //   512: aload #27
    //   514: ifnull -> 459
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   523: athrow
    //   524: aload #27
    //   526: ifnull -> 1034
    //   529: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerPlayerAbilities
    //   532: dup
    //   533: aload_2
    //   534: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   537: astore #31
    //   539: aload_1
    //   540: iconst_0
    //   541: anewarray java/lang/Object
    //   544: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   547: aload #31
    //   549: iconst_1
    //   550: anewarray java/lang/Object
    //   553: dup_x1
    //   554: swap
    //   555: iconst_0
    //   556: swap
    //   557: aastore
    //   558: invokevirtual aegisguard_pC : ([Ljava/lang/Object;)V
    //   561: aload_1
    //   562: iconst_0
    //   563: anewarray java/lang/Object
    //   566: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   569: aload #31
    //   571: lload #13
    //   573: iconst_2
    //   574: anewarray java/lang/Object
    //   577: dup_x2
    //   578: dup_x2
    //   579: pop
    //   580: invokestatic valueOf : (J)Ljava/lang/Long;
    //   583: iconst_1
    //   584: swap
    //   585: aastore
    //   586: dup_x1
    //   587: swap
    //   588: iconst_0
    //   589: swap
    //   590: aastore
    //   591: invokevirtual aegisguard_wP : ([Ljava/lang/Object;)V
    //   594: aload #27
    //   596: ifnull -> 1034
    //   599: aload_1
    //   600: iconst_0
    //   601: anewarray java/lang/Object
    //   604: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   607: iconst_0
    //   608: iconst_1
    //   609: anewarray java/lang/Object
    //   612: dup_x1
    //   613: swap
    //   614: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   617: iconst_0
    //   618: swap
    //   619: aastore
    //   620: invokevirtual aegisguard_O : ([Ljava/lang/Object;)V
    //   623: aload #27
    //   625: ifnull -> 1034
    //   628: goto -> 635
    //   631: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   634: athrow
    //   635: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerEntityEffect
    //   638: dup
    //   639: aload_2
    //   640: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   643: astore #32
    //   645: aload #27
    //   647: ifnonnull -> 718
    //   650: aload #32
    //   652: invokevirtual getEntityId : ()I
    //   655: aload_1
    //   656: iconst_0
    //   657: anewarray java/lang/Object
    //   660: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   663: invokeinterface getEntityId : ()I
    //   668: if_icmpne -> 1034
    //   671: goto -> 678
    //   674: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   677: athrow
    //   678: aload_1
    //   679: iconst_0
    //   680: anewarray java/lang/Object
    //   683: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   686: lload #25
    //   688: aload #32
    //   690: iconst_2
    //   691: anewarray java/lang/Object
    //   694: dup_x1
    //   695: swap
    //   696: iconst_1
    //   697: swap
    //   698: aastore
    //   699: dup_x2
    //   700: dup_x2
    //   701: pop
    //   702: invokestatic valueOf : (J)Ljava/lang/Long;
    //   705: iconst_0
    //   706: swap
    //   707: aastore
    //   708: invokevirtual aegisguard_l : ([Ljava/lang/Object;)V
    //   711: goto -> 718
    //   714: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   717: athrow
    //   718: aload #27
    //   720: ifnull -> 1034
    //   723: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerRemoveEntityEffect
    //   726: dup
    //   727: aload_2
    //   728: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   731: astore #33
    //   733: aload #27
    //   735: ifnonnull -> 806
    //   738: aload #33
    //   740: invokevirtual getEntityId : ()I
    //   743: aload_1
    //   744: iconst_0
    //   745: anewarray java/lang/Object
    //   748: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   751: invokeinterface getEntityId : ()I
    //   756: if_icmpne -> 1034
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   765: athrow
    //   766: aload_1
    //   767: iconst_0
    //   768: anewarray java/lang/Object
    //   771: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   774: lload #19
    //   776: aload #33
    //   778: iconst_2
    //   779: anewarray java/lang/Object
    //   782: dup_x1
    //   783: swap
    //   784: iconst_1
    //   785: swap
    //   786: aastore
    //   787: dup_x2
    //   788: dup_x2
    //   789: pop
    //   790: invokestatic valueOf : (J)Ljava/lang/Long;
    //   793: iconst_0
    //   794: swap
    //   795: aastore
    //   796: invokevirtual aegisguard_mD : ([Ljava/lang/Object;)V
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   805: athrow
    //   806: aload #27
    //   808: ifnull -> 1034
    //   811: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState
    //   814: dup
    //   815: aload_2
    //   816: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   819: astore #34
    //   821: aload_1
    //   822: iconst_0
    //   823: anewarray java/lang/Object
    //   826: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   829: aload #34
    //   831: lload #21
    //   833: iconst_2
    //   834: anewarray java/lang/Object
    //   837: dup_x2
    //   838: dup_x2
    //   839: pop
    //   840: invokestatic valueOf : (J)Ljava/lang/Long;
    //   843: iconst_1
    //   844: swap
    //   845: aastore
    //   846: dup_x1
    //   847: swap
    //   848: iconst_0
    //   849: swap
    //   850: aastore
    //   851: invokevirtual aegisguard_S : ([Ljava/lang/Object;)V
    //   854: aload #27
    //   856: ifnull -> 1034
    //   859: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerExplosion
    //   862: dup
    //   863: aload_2
    //   864: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   867: astore #35
    //   869: aload_1
    //   870: iconst_0
    //   871: anewarray java/lang/Object
    //   874: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   877: lload #11
    //   879: aload #35
    //   881: iconst_2
    //   882: anewarray java/lang/Object
    //   885: dup_x1
    //   886: swap
    //   887: iconst_1
    //   888: swap
    //   889: aastore
    //   890: dup_x2
    //   891: dup_x2
    //   892: pop
    //   893: invokestatic valueOf : (J)Ljava/lang/Long;
    //   896: iconst_0
    //   897: swap
    //   898: aastore
    //   899: invokevirtual aegisguard_qI : ([Ljava/lang/Object;)V
    //   902: aload #27
    //   904: ifnull -> 1034
    //   907: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerEntityRelativeMove
    //   910: dup
    //   911: aload_2
    //   912: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   915: astore #36
    //   917: aload_1
    //   918: iconst_0
    //   919: anewarray java/lang/Object
    //   922: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   925: aload #36
    //   927: lload #5
    //   929: iconst_2
    //   930: anewarray java/lang/Object
    //   933: dup_x2
    //   934: dup_x2
    //   935: pop
    //   936: invokestatic valueOf : (J)Ljava/lang/Long;
    //   939: iconst_1
    //   940: swap
    //   941: aastore
    //   942: dup_x1
    //   943: swap
    //   944: iconst_0
    //   945: swap
    //   946: aastore
    //   947: invokevirtual aegisguard_W : ([Ljava/lang/Object;)V
    //   950: aload #27
    //   952: ifnull -> 1034
    //   955: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerEntityRelativeMoveAndRotation
    //   958: dup
    //   959: aload_2
    //   960: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   963: astore #37
    //   965: aload_1
    //   966: iconst_0
    //   967: anewarray java/lang/Object
    //   970: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   973: aload #37
    //   975: lload #7
    //   977: iconst_2
    //   978: anewarray java/lang/Object
    //   981: dup_x2
    //   982: dup_x2
    //   983: pop
    //   984: invokestatic valueOf : (J)Ljava/lang/Long;
    //   987: iconst_1
    //   988: swap
    //   989: aastore
    //   990: dup_x1
    //   991: swap
    //   992: iconst_0
    //   993: swap
    //   994: aastore
    //   995: invokevirtual aegisguard_u : ([Ljava/lang/Object;)V
    //   998: aload #27
    //   1000: ifnull -> 1034
    //   1003: new com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerEntityAnimation
    //   1006: dup
    //   1007: aload_2
    //   1008: invokespecial <init> : (Lcom/github/retrooper/packetevents/event/PacketSendEvent;)V
    //   1011: astore #38
    //   1013: aload #38
    //   1015: invokevirtual getEntityId : ()I
    //   1018: aload_1
    //   1019: iconst_0
    //   1020: anewarray java/lang/Object
    //   1023: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1026: invokeinterface getEntityId : ()I
    //   1031: if_icmpne -> 1034
    //   1034: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 92
    //   #13	-> 164
    //   #15	-> 174
    //   #16	-> 207
    //   #17	-> 225
    //   #16	-> 243
    //   #22	-> 298
    //   #24	-> 308
    //   #25	-> 341
    //   #30	-> 386
    //   #32	-> 396
    //   #33	-> 429
    //   #35	-> 444
    //   #36	-> 481
    //   #37	-> 507
    //   #39	-> 524
    //   #41	-> 529
    //   #43	-> 539
    //   #44	-> 561
    //   #46	-> 594
    //   #48	-> 599
    //   #50	-> 623
    //   #52	-> 635
    //   #54	-> 645
    //   #55	-> 678
    //   #60	-> 723
    //   #62	-> 733
    //   #63	-> 766
    //   #68	-> 811
    //   #70	-> 821
    //   #72	-> 854
    //   #74	-> 859
    //   #76	-> 869
    //   #78	-> 902
    //   #80	-> 907
    //   #82	-> 917
    //   #84	-> 950
    //   #86	-> 955
    //   #88	-> 965
    //   #90	-> 998
    //   #92	-> 1003
    //   #94	-> 1013
    //   #100	-> 1034
    // Exception table:
    //   from	to	target	type
    //   174	200	203	java/lang/RuntimeException
    //   179	286	289	java/lang/RuntimeException
    //   308	334	337	java/lang/RuntimeException
    //   313	374	377	java/lang/RuntimeException
    //   481	517	520	java/lang/RuntimeException
    //   539	628	631	java/lang/RuntimeException
    //   645	671	674	java/lang/RuntimeException
    //   650	711	714	java/lang/RuntimeException
    //   733	759	762	java/lang/RuntimeException
    //   738	799	802	java/lang/RuntimeException
  }
  
  public static void aegisguard_G(int[] paramArrayOfint) {
    aegisguard_Q = paramArrayOfint;
  }
  
  public static int[] aegisguard_D() {
    return aegisguard_Q;
  }
  
  static {
    if (aegisguard_D() != null)
      aegisguard_G(new int[1]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
