package me.frep.aegisguard.spigot.AegisGuard_X9;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hi;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;

public class aegisguard_X9 {
  private static boolean aegisguard_P;
  
  private static final long a = aegisguard_e.a(-2918502288686980501L, 8650340250837399341L, MethodHandles.lookup().lookupClass()).a(113217618416751L);
  
  private static final String[] b;
  
  public static void aegisguard_u(Object[] paramArrayOfObject) {
    aegisguard_K.INSTANCE.aegisguard_M().execute(me.frep.aegisguard.spigot.aegisguard_X9::lambda$executeBanWave$4);
  }
  
  private static void lambda$executeBanWave$4() {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X9.a : J
    //   3: ldc2_w 48689949509905
    //   6: lxor
    //   7: lstore_0
    //   8: new me/frep/aegisguard/spigot/aegisguard_hi
    //   11: dup
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_X9.b : [Ljava/lang/String;
    //   15: astore #15
    //   17: aload #15
    //   19: iconst_3
    //   20: aaload
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: astore_3
    //   25: invokestatic aegisguard_t : ()Z
    //   28: new me/frep/aegisguard/spigot/aegisguard_hi
    //   31: dup
    //   32: aload #15
    //   34: bipush #12
    //   36: aaload
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: astore #4
    //   42: istore_2
    //   43: aload_3
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   51: aload #15
    //   53: iconst_4
    //   54: aaload
    //   55: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   58: iload_2
    //   59: ifne -> 96
    //   62: ifnull -> 105
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_3
    //   73: iconst_0
    //   74: anewarray java/lang/Object
    //   77: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   80: getstatic me/frep/aegisguard/spigot/aegisguard_X9.b : [Ljava/lang/String;
    //   83: bipush #17
    //   85: aaload
    //   86: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: iconst_0
    //   97: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   102: ifnonnull -> 110
    //   105: return
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L_ : Z
    //   113: iload_2
    //   114: ifne -> 163
    //   117: ifeq -> 149
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   130: new me/frep/aegisguard/api/event/aegisguardJudgementDayStartEvent
    //   133: dup
    //   134: invokespecial <init> : ()V
    //   137: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GM : Ljava/util/List;
    //   152: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   157: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   162: iconst_0
    //   163: istore #5
    //   165: aload_3
    //   166: iconst_0
    //   167: anewarray java/lang/Object
    //   170: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   173: getstatic me/frep/aegisguard/spigot/aegisguard_X9.b : [Ljava/lang/String;
    //   176: astore #15
    //   178: aload #15
    //   180: bipush #17
    //   182: aaload
    //   183: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   186: iconst_0
    //   187: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   192: invokeinterface iterator : ()Ljava/util/Iterator;
    //   197: astore #6
    //   199: aload #6
    //   201: invokeinterface hasNext : ()Z
    //   206: ifeq -> 834
    //   209: aload #6
    //   211: invokeinterface next : ()Ljava/lang/Object;
    //   216: checkcast java/lang/String
    //   219: astore #7
    //   221: aload_3
    //   222: iconst_0
    //   223: anewarray java/lang/Object
    //   226: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   229: new java/lang/StringBuilder
    //   232: dup
    //   233: invokespecial <init> : ()V
    //   236: getstatic me/frep/aegisguard/spigot/aegisguard_X9.b : [Ljava/lang/String;
    //   239: astore #15
    //   241: aload #15
    //   243: bipush #16
    //   245: aaload
    //   246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: aload #7
    //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: aload #15
    //   256: bipush #19
    //   258: aaload
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: invokevirtual toString : ()Ljava/lang/String;
    //   265: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   268: astore #8
    //   270: aload_3
    //   271: iconst_0
    //   272: anewarray java/lang/Object
    //   275: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   278: new java/lang/StringBuilder
    //   281: dup
    //   282: invokespecial <init> : ()V
    //   285: aload #15
    //   287: bipush #18
    //   289: aaload
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: aload #7
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: aload #15
    //   300: bipush #6
    //   302: aaload
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   312: astore #9
    //   314: aload_3
    //   315: iconst_0
    //   316: anewarray java/lang/Object
    //   319: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   322: new java/lang/StringBuilder
    //   325: dup
    //   326: invokespecial <init> : ()V
    //   329: aload #15
    //   331: bipush #18
    //   333: aaload
    //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: aload #7
    //   339: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: aload #15
    //   344: bipush #9
    //   346: aaload
    //   347: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual toString : ()Ljava/lang/String;
    //   353: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   356: astore #10
    //   358: aload_3
    //   359: iconst_0
    //   360: anewarray java/lang/Object
    //   363: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   366: new java/lang/StringBuilder
    //   369: dup
    //   370: invokespecial <init> : ()V
    //   373: aload #15
    //   375: bipush #18
    //   377: aaload
    //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: aload #7
    //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: aload #15
    //   388: bipush #7
    //   390: aaload
    //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: invokevirtual toString : ()Ljava/lang/String;
    //   397: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   400: astore #11
    //   402: aload_3
    //   403: iconst_0
    //   404: anewarray java/lang/Object
    //   407: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   410: new java/lang/StringBuilder
    //   413: dup
    //   414: invokespecial <init> : ()V
    //   417: aload #15
    //   419: bipush #18
    //   421: aaload
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: aload #7
    //   427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: aload #15
    //   432: iconst_1
    //   433: aaload
    //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: invokevirtual toString : ()Ljava/lang/String;
    //   440: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   443: astore #12
    //   445: aload_3
    //   446: iconst_0
    //   447: anewarray java/lang/Object
    //   450: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   453: new java/lang/StringBuilder
    //   456: dup
    //   457: invokespecial <init> : ()V
    //   460: aload #15
    //   462: bipush #18
    //   464: aaload
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: aload #7
    //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: aload #15
    //   475: iconst_2
    //   476: aaload
    //   477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   480: invokevirtual toString : ()Ljava/lang/String;
    //   483: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   486: astore #13
    //   488: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   491: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   494: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   497: aload #8
    //   499: <illegal opcode> run : (Ljava/lang/String;)Ljava/lang/Runnable;
    //   504: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   509: pop
    //   510: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dO : Ljava/util/List;
    //   513: aload #8
    //   515: <illegal opcode> accept : (Ljava/lang/String;)Ljava/util/function/Consumer;
    //   520: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   525: aload #4
    //   527: iconst_0
    //   528: anewarray java/lang/Object
    //   531: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   534: new java/lang/StringBuilder
    //   537: dup
    //   538: invokespecial <init> : ()V
    //   541: aload #15
    //   543: bipush #20
    //   545: aaload
    //   546: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   549: aload #7
    //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   554: aload #15
    //   556: bipush #23
    //   558: aaload
    //   559: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: invokevirtual toString : ()Ljava/lang/String;
    //   565: aload #8
    //   567: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   570: aload #4
    //   572: iconst_0
    //   573: anewarray java/lang/Object
    //   576: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   579: new java/lang/StringBuilder
    //   582: dup
    //   583: invokespecial <init> : ()V
    //   586: aload #15
    //   588: bipush #13
    //   590: aaload
    //   591: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   594: aload #7
    //   596: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   599: aload #15
    //   601: iconst_5
    //   602: aaload
    //   603: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: invokevirtual toString : ()Ljava/lang/String;
    //   609: aload #9
    //   611: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   614: aload #4
    //   616: iconst_0
    //   617: anewarray java/lang/Object
    //   620: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   623: new java/lang/StringBuilder
    //   626: dup
    //   627: invokespecial <init> : ()V
    //   630: aload #15
    //   632: bipush #13
    //   634: aaload
    //   635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: aload #7
    //   640: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: aload #15
    //   645: bipush #14
    //   647: aaload
    //   648: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   651: invokevirtual toString : ()Ljava/lang/String;
    //   654: aload #13
    //   656: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   659: aload #4
    //   661: iconst_0
    //   662: anewarray java/lang/Object
    //   665: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   668: new java/lang/StringBuilder
    //   671: dup
    //   672: invokespecial <init> : ()V
    //   675: aload #15
    //   677: bipush #13
    //   679: aaload
    //   680: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   683: aload #7
    //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: aload #15
    //   690: bipush #21
    //   692: aaload
    //   693: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   696: invokevirtual toString : ()Ljava/lang/String;
    //   699: aload #10
    //   701: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   704: aload #4
    //   706: iconst_0
    //   707: anewarray java/lang/Object
    //   710: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   713: new java/lang/StringBuilder
    //   716: dup
    //   717: invokespecial <init> : ()V
    //   720: aload #15
    //   722: bipush #13
    //   724: aaload
    //   725: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   728: aload #7
    //   730: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: aload #15
    //   735: bipush #11
    //   737: aaload
    //   738: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   741: invokevirtual toString : ()Ljava/lang/String;
    //   744: aload #11
    //   746: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   749: aload #4
    //   751: iconst_0
    //   752: anewarray java/lang/Object
    //   755: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   758: new java/lang/StringBuilder
    //   761: dup
    //   762: invokespecial <init> : ()V
    //   765: aload #15
    //   767: bipush #13
    //   769: aaload
    //   770: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   773: aload #7
    //   775: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: aload #15
    //   780: bipush #10
    //   782: aaload
    //   783: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: invokevirtual toString : ()Ljava/lang/String;
    //   789: aload #12
    //   791: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   794: aload #4
    //   796: iconst_0
    //   797: anewarray java/lang/Object
    //   800: invokevirtual aegisguard_z : ([Ljava/lang/Object;)V
    //   803: iinc #5, 1
    //   806: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lo : J
    //   809: invokestatic sleep : (J)V
    //   812: iload_2
    //   813: ifne -> 873
    //   816: goto -> 830
    //   819: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   822: athrow
    //   823: astore #14
    //   825: aload #14
    //   827: invokevirtual printStackTrace : ()V
    //   830: iload_2
    //   831: ifeq -> 199
    //   834: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L_ : Z
    //   837: iload_2
    //   838: ifne -> 875
    //   841: ifeq -> 873
    //   844: goto -> 851
    //   847: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   850: athrow
    //   851: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   854: new me/frep/aegisguard/api/event/aegisguardJudgementDayEndEvent
    //   857: dup
    //   858: invokespecial <init> : ()V
    //   861: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   866: goto -> 873
    //   869: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   872: athrow
    //   873: iload #5
    //   875: istore #6
    //   877: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gw : Ljava/util/List;
    //   880: iload #6
    //   882: <illegal opcode> accept : (I)Ljava/util/function/Consumer;
    //   887: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   892: aload_3
    //   893: iconst_0
    //   894: anewarray java/lang/Object
    //   897: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   900: getstatic me/frep/aegisguard/spigot/aegisguard_X9.b : [Ljava/lang/String;
    //   903: bipush #17
    //   905: aaload
    //   906: aconst_null
    //   907: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   910: aload_3
    //   911: iconst_0
    //   912: anewarray java/lang/Object
    //   915: invokevirtual aegisguard_z : ([Ljava/lang/Object;)V
    //   918: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   921: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   924: invokevirtual saveConfig : ()V
    //   927: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #16	-> 8
    //   #17	-> 28
    //   #19	-> 43
    //   #20	-> 73
    //   #21	-> 105
    //   #24	-> 110
    //   #25	-> 127
    //   #28	-> 149
    //   #30	-> 162
    //   #32	-> 165
    //   #33	-> 221
    //   #34	-> 270
    //   #35	-> 314
    //   #36	-> 358
    //   #37	-> 402
    //   #38	-> 445
    //   #40	-> 488
    //   #41	-> 510
    //   #43	-> 525
    //   #44	-> 570
    //   #45	-> 614
    //   #46	-> 659
    //   #47	-> 704
    //   #48	-> 749
    //   #49	-> 794
    //   #51	-> 803
    //   #54	-> 806
    //   #57	-> 812
    //   #55	-> 823
    //   #56	-> 825
    //   #58	-> 830
    //   #60	-> 834
    //   #61	-> 851
    //   #64	-> 873
    //   #66	-> 877
    //   #68	-> 892
    //   #69	-> 910
    //   #71	-> 918
    //   #72	-> 927
    // Exception table:
    //   from	to	target	type
    //   43	65	68	java/lang/InterruptedException
    //   62	89	92	java/lang/InterruptedException
    //   96	106	106	java/lang/InterruptedException
    //   110	120	123	java/lang/InterruptedException
    //   117	142	145	java/lang/InterruptedException
    //   488	819	819	java/lang/RuntimeException
    //   806	812	823	java/lang/InterruptedException
    //   834	844	847	java/lang/InterruptedException
    //   841	866	869	java/lang/InterruptedException
  }
  
  private static void lambda$executeBanWave$1(String paramString) {
    aegisguard_b0.aegisguard_c.forEach(paramString::lambda$executeBanWave$0);
  }
  
  private static void lambda$executeBanWave$0(String paramString1, String paramString2) {
    long l1 = a ^ 0x7FDD1E1C227BL, l2 = l1 ^ 0x547C9A97AB35L;
    new Object[2];
    aegisguard_Xz.aegisguard_k(new Object[] { null, Long.valueOf(l2), paramString2.replaceAll(b[8], paramString1) });
  }
  
  private static void lambda$executeBanWave$2(String paramString1, String paramString2) {
    aegisguard_Xz.aegisguard_y(paramString2.replaceAll(b[15], paramString1));
  }
  
  private static void lambda$executeBanWave$3(int paramInt, String paramString) {
    aegisguard_Xz.aegisguard_y(paramString.replaceAll(b[0], Integer.toString(paramInt)));
  }
  
  public static boolean aegisguard_T(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    Player player = (Player)paramArrayOfObject[1];
    l = a ^ l;
    String[] arrayOfString = b;
    aegisguard_hi aegisguard_hi = new aegisguard_hi(arrayOfString[22]);
    boolean bool = aegisguard_O();
    try {
      if (bool)
        try {
          if (aegisguard_hi.aegisguard_i(new Object[0]).getConfigurationSection(arrayOfString[17]) == null)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Iterator<String> iterator = aegisguard_hi.aegisguard_i(new Object[0]).getConfigurationSection(b[17]).getKeys(false).iterator();
    try {
      if (l > 0L && bool)
        if (iterator.hasNext()) {
          String str = iterator.next();
          return str.equalsIgnoreCase(player.getUniqueId().toString());
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (AbstractCheck.aegisguard_B() == null) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        aegisguard_S(!bool);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public static int aegisguard_G(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    String[] arrayOfString = b;
    aegisguard_hi aegisguard_hi = new aegisguard_hi(arrayOfString[22]);
    boolean bool = aegisguard_t();
    byte b = 0;
    try {
      if (!bool)
        try {
          if (aegisguard_hi.aegisguard_i(new Object[0]).getConfigurationSection(arrayOfString[17]) == null)
            return 0; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Iterator<String> iterator;
    label21: for (iterator = aegisguard_hi.aegisguard_i(new Object[0]).getConfigurationSection(b[17]).getKeys(false).iterator(); iterator.hasNext();) {
      while (true) {
        String str = iterator.next();
        b++;
        if (bool) {
          if (l >= 0L) {
            AbstractCheck.aegisguard_g(new AbstractCheck[4]);
            break;
          } 
          continue;
        } 
        continue label21;
      } 
    } 
    return b;
  }
  
  public static void aegisguard_S(boolean paramBoolean) {
    aegisguard_P = paramBoolean;
  }
  
  public static boolean aegisguard_O() {
    return aegisguard_P;
  }
  
  public static boolean aegisguard_t() {
    boolean bool = aegisguard_O();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = a ^ 0x75FC9CF3D451L;
    aegisguard_S(true);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[24];
    boolean bool = false;
    String str;
    int i = (str = "í\r'b¥OÊOysËö{+ò\020¦eÿ®\013[Cò§àê£s2\b2®¦4L\020B\022\001\022foÈÛDþº¼\020,µº\001jô\036cÞ ^¤\bk:rxÎù4\bk:rxÎù4\020µ\013»~W;Ü+LîÂÃäf£\020UÈcÊÇ½ªù\033É]CÎ¹\b]ñ¦êI!¯\020¦eÿ®\013[Cò§àê£s2\020µ\013»~W;Ü+LîÂÃäf£\020Áµ@÷!u(\025,\020±ð?\nó\003¡ùáOõ\034Çæ}'\b2®¦4L\020UÈcÊÇ½ªù\033É]CÎ¹\020,µº\001jô1æÉ\fD\"ß`\020,µº\001jô\036cÞ ^¤\020,µº\001jô1æÉ\fD\"ß`\b#æ%-ÙðP\020±ð?\nó\003¡ùáOõ\034Çæ}'\b]ñ¦êI!¯").length();
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
