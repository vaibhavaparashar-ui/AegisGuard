package me.frep.aegisguard.spigot.AegisGuard_KH;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_Xa;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_bG;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class aegisguard_KH {
  private static AbstractCheck[] aegisguard_x;
  
  private static final long a = aegisguard_e.a(1919429367930009377L, 9173652553452966594L, MethodHandles.lookup().lookupClass()).a(280289505589554L);
  
  private static final String[] b;
  
  static void aegisguard_y(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_KH aegisguard_KH = (me.frep.aegisguard.spigot.aegisguard_KH)paramArrayOfObject[0];
    Player player = (Player)paramArrayOfObject[1];
    String str = (String)paramArrayOfObject[2];
    long l1 = ((Long)paramArrayOfObject[3]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x66F1CC5C225CL;
    (new Object[3])[2] = str;
    (new Object[3])[1] = player;
    new Object[3];
    aegisguard_KH.aegisguard_F(new Object[] { Long.valueOf(l2) });
  }
  
  public void aegisguard_e(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/check/AbstractCheck
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore #4
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   25: astore_3
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_KH.a : J
    //   30: lload #4
    //   32: lxor
    //   33: lstore #4
    //   35: lload #4
    //   37: dup2
    //   38: ldc2_w 19878331700472
    //   41: lxor
    //   42: lstore #6
    //   44: dup2
    //   45: ldc2_w 132923973389678
    //   48: lxor
    //   49: lstore #8
    //   51: dup2
    //   52: ldc2_w 139215177326019
    //   55: lxor
    //   56: lstore #10
    //   58: dup2
    //   59: ldc2_w 58036393338876
    //   62: lxor
    //   63: lstore #12
    //   65: dup2
    //   66: ldc2_w 103863491046739
    //   69: lxor
    //   70: lstore #14
    //   72: pop2
    //   73: invokestatic aegisguard_v : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   76: astore #16
    //   78: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Q : Ljava/util/Map;
    //   81: aload_2
    //   82: iconst_0
    //   83: anewarray java/lang/Object
    //   86: invokevirtual aegisguard_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   89: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   94: checkcast java/lang/Boolean
    //   97: invokevirtual booleanValue : ()Z
    //   100: aload #16
    //   102: ifnull -> 133
    //   105: ifne -> 116
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: return
    //   116: invokestatic currentTimeMillis : ()J
    //   119: aload_3
    //   120: iconst_0
    //   121: anewarray java/lang/Object
    //   124: invokevirtual aegisguard_y : ([Ljava/lang/Object;)J
    //   127: lsub
    //   128: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dd : I
    //   131: i2l
    //   132: lcmp
    //   133: aload #16
    //   135: lload #4
    //   137: lconst_0
    //   138: lcmp
    //   139: iflt -> 228
    //   142: ifnull -> 226
    //   145: ifge -> 156
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: return
    //   156: aload_3
    //   157: invokestatic currentTimeMillis : ()J
    //   160: iconst_1
    //   161: anewarray java/lang/Object
    //   164: dup_x2
    //   165: dup_x2
    //   166: pop
    //   167: invokestatic valueOf : (J)Ljava/lang/Long;
    //   170: iconst_0
    //   171: swap
    //   172: aastore
    //   173: invokevirtual aegisguard_o : ([Ljava/lang/Object;)V
    //   176: aload_3
    //   177: iconst_0
    //   178: anewarray java/lang/Object
    //   181: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   184: new java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   194: astore #20
    //   196: aload #20
    //   198: bipush #20
    //   200: aaload
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: aload_2
    //   205: iconst_0
    //   206: anewarray java/lang/Object
    //   209: invokevirtual aegisguard_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   212: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   226: aload #16
    //   228: lload #4
    //   230: lconst_0
    //   231: lcmp
    //   232: iflt -> 254
    //   235: ifnull -> 252
    //   238: ifeq -> 249
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: return
    //   249: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L_ : Z
    //   252: aload #16
    //   254: ifnull -> 326
    //   257: ifeq -> 323
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   266: athrow
    //   267: new me/frep/aegisguard/api/event/aegisguardPunishEvent
    //   270: dup
    //   271: aload_3
    //   272: iconst_0
    //   273: anewarray java/lang/Object
    //   276: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   279: aload_2
    //   280: invokespecial <init> : (Lorg/bukkit/entity/Player;Lme/frep/aegisguard/api/check/Check;)V
    //   283: astore #17
    //   285: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   288: aload #17
    //   290: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   295: aload #17
    //   297: invokevirtual isCancelled : ()Z
    //   300: aload #16
    //   302: lload #4
    //   304: lconst_0
    //   305: lcmp
    //   306: ifle -> 328
    //   309: ifnull -> 326
    //   312: ifeq -> 323
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   321: athrow
    //   322: return
    //   323: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_T : Z
    //   326: aload #16
    //   328: ifnull -> 431
    //   331: ifeq -> 423
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   340: athrow
    //   341: lload #14
    //   343: aload_2
    //   344: aload_3
    //   345: iconst_3
    //   346: anewarray java/lang/Object
    //   349: dup_x1
    //   350: swap
    //   351: iconst_2
    //   352: swap
    //   353: aastore
    //   354: dup_x1
    //   355: swap
    //   356: iconst_1
    //   357: swap
    //   358: aastore
    //   359: dup_x2
    //   360: dup_x2
    //   361: pop
    //   362: invokestatic valueOf : (J)Ljava/lang/Long;
    //   365: iconst_0
    //   366: swap
    //   367: aastore
    //   368: invokestatic aegisguard_A : ([Ljava/lang/Object;)V
    //   371: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L_ : Z
    //   374: aload #16
    //   376: ifnull -> 431
    //   379: goto -> 386
    //   382: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   385: athrow
    //   386: ifeq -> 423
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   395: athrow
    //   396: new me/frep/aegisguard/api/event/aegisguardPunishmentLogCreateEvent
    //   399: dup
    //   400: aload_3
    //   401: iconst_0
    //   402: anewarray java/lang/Object
    //   405: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   408: invokespecial <init> : (Lorg/bukkit/entity/Player;)V
    //   411: astore #17
    //   413: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   416: aload #17
    //   418: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   423: invokestatic current : ()Ljava/util/concurrent/ThreadLocalRandom;
    //   426: ldc 50000
    //   428: invokevirtual nextInt : (I)I
    //   431: istore #17
    //   433: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_da : Z
    //   436: aload #16
    //   438: lload #4
    //   440: lconst_0
    //   441: lcmp
    //   442: ifle -> 597
    //   445: ifnull -> 595
    //   448: ifeq -> 537
    //   451: goto -> 458
    //   454: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   457: athrow
    //   458: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_A : Ljava/lang/String;
    //   461: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   464: bipush #27
    //   466: aaload
    //   467: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   470: ifeq -> 487
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   479: athrow
    //   480: goto -> 537
    //   483: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   486: athrow
    //   487: new me/frep/aegisguard/api/event/aegisguardDiscordWebhookPunishEvent
    //   490: dup
    //   491: aload_3
    //   492: iconst_0
    //   493: anewarray java/lang/Object
    //   496: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   499: invokespecial <init> : (Lorg/bukkit/entity/Player;)V
    //   502: astore #18
    //   504: aload #18
    //   506: invokevirtual isCancelled : ()Z
    //   509: ifeq -> 519
    //   512: goto -> 537
    //   515: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   518: athrow
    //   519: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   522: invokevirtual aegisguard_V : ()Ljava/util/concurrent/ExecutorService;
    //   525: aload_3
    //   526: aload_2
    //   527: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;Lme/frep/aegisguard/spigot/check/AbstractCheck;)Ljava/lang/Runnable;
    //   532: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   537: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   540: astore #20
    //   542: aload #20
    //   544: bipush #50
    //   546: aaload
    //   547: iconst_0
    //   548: anewarray java/lang/Object
    //   551: invokestatic aegisguard_Z : ([Ljava/lang/Object;)I
    //   554: iconst_1
    //   555: iadd
    //   556: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   559: lload #10
    //   561: iconst_3
    //   562: anewarray java/lang/Object
    //   565: dup_x2
    //   566: dup_x2
    //   567: pop
    //   568: invokestatic valueOf : (J)Ljava/lang/Long;
    //   571: iconst_2
    //   572: swap
    //   573: aastore
    //   574: dup_x1
    //   575: swap
    //   576: iconst_1
    //   577: swap
    //   578: aastore
    //   579: dup_x1
    //   580: swap
    //   581: iconst_0
    //   582: swap
    //   583: aastore
    //   584: invokestatic aegisguard_W : ([Ljava/lang/Object;)V
    //   587: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gd : Ljava/lang/String;
    //   590: ldc ''
    //   592: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   595: aload #16
    //   597: ifnull -> 1558
    //   600: ifne -> 1536
    //   603: goto -> 610
    //   606: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   609: athrow
    //   610: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   613: lload #4
    //   615: lconst_0
    //   616: lcmp
    //   617: ifle -> 1116
    //   620: aload #16
    //   622: ifnull -> 1116
    //   625: goto -> 632
    //   628: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   631: athrow
    //   632: lload #4
    //   634: lconst_0
    //   635: lcmp
    //   636: iflt -> 1109
    //   639: invokevirtual aegisguard_x : ()Z
    //   642: ifeq -> 1106
    //   645: goto -> 652
    //   648: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   651: athrow
    //   652: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   655: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   658: aload_3
    //   659: iconst_0
    //   660: anewarray java/lang/Object
    //   663: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   666: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gd : Ljava/lang/String;
    //   669: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   672: bipush #37
    //   674: aaload
    //   675: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L : Ljava/lang/String;
    //   678: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   681: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   684: bipush #58
    //   686: aaload
    //   687: iload #17
    //   689: invokestatic toString : (I)Ljava/lang/String;
    //   692: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   695: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   698: bipush #38
    //   700: aaload
    //   701: aload_3
    //   702: iconst_0
    //   703: anewarray java/lang/Object
    //   706: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   709: invokeinterface getName : ()Ljava/lang/String;
    //   714: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   717: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   720: bipush #30
    //   722: aaload
    //   723: aload_3
    //   724: iconst_0
    //   725: anewarray java/lang/Object
    //   728: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   731: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   736: invokevirtual toString : ()Ljava/lang/String;
    //   739: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   742: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   745: bipush #8
    //   747: aaload
    //   748: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G6 : Ljava/lang/String;
    //   751: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   754: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   757: bipush #21
    //   759: aaload
    //   760: aload_2
    //   761: invokevirtual getCategory : ()Ljava/lang/String;
    //   764: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   767: lload #6
    //   769: dup2_x1
    //   770: pop2
    //   771: iconst_2
    //   772: anewarray java/lang/Object
    //   775: dup_x1
    //   776: swap
    //   777: iconst_1
    //   778: swap
    //   779: aastore
    //   780: dup_x2
    //   781: dup_x2
    //   782: pop
    //   783: invokestatic valueOf : (J)Ljava/lang/Long;
    //   786: iconst_0
    //   787: swap
    //   788: aastore
    //   789: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   792: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   795: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   798: bipush #28
    //   800: aaload
    //   801: aload_2
    //   802: lload #8
    //   804: iconst_1
    //   805: anewarray java/lang/Object
    //   808: dup_x2
    //   809: dup_x2
    //   810: pop
    //   811: invokestatic valueOf : (J)Ljava/lang/Long;
    //   814: iconst_0
    //   815: swap
    //   816: aastore
    //   817: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   820: invokeinterface complexType : ()Ljava/lang/String;
    //   825: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   828: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   831: bipush #54
    //   833: aaload
    //   834: aload_2
    //   835: lload #8
    //   837: iconst_1
    //   838: anewarray java/lang/Object
    //   841: dup_x2
    //   842: dup_x2
    //   843: pop
    //   844: invokestatic valueOf : (J)Ljava/lang/Long;
    //   847: iconst_0
    //   848: swap
    //   849: aastore
    //   850: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   853: invokeinterface description : ()Ljava/lang/String;
    //   858: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   861: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   864: bipush #29
    //   866: aaload
    //   867: aload_2
    //   868: lload #8
    //   870: iconst_1
    //   871: anewarray java/lang/Object
    //   874: dup_x2
    //   875: dup_x2
    //   876: pop
    //   877: invokestatic valueOf : (J)Ljava/lang/Long;
    //   880: iconst_0
    //   881: swap
    //   882: aastore
    //   883: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   886: invokeinterface name : ()Ljava/lang/String;
    //   891: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   894: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   897: bipush #34
    //   899: aaload
    //   900: aload_3
    //   901: iconst_0
    //   902: anewarray java/lang/Object
    //   905: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   908: iconst_0
    //   909: anewarray java/lang/Object
    //   912: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   915: aload #16
    //   917: ifnull -> 964
    //   920: goto -> 927
    //   923: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   926: athrow
    //   927: ifnonnull -> 949
    //   930: goto -> 937
    //   933: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   936: athrow
    //   937: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   940: iconst_4
    //   941: aaload
    //   942: goto -> 969
    //   945: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   948: athrow
    //   949: aload_3
    //   950: iconst_0
    //   951: anewarray java/lang/Object
    //   954: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   957: iconst_0
    //   958: anewarray java/lang/Object
    //   961: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   964: invokeinterface getName : ()Ljava/lang/String;
    //   969: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   972: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   975: bipush #41
    //   977: aaload
    //   978: aload_3
    //   979: iconst_0
    //   980: anewarray java/lang/Object
    //   983: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   986: lload #12
    //   988: dup2_x1
    //   989: pop2
    //   990: iconst_2
    //   991: anewarray java/lang/Object
    //   994: dup_x1
    //   995: swap
    //   996: iconst_1
    //   997: swap
    //   998: aastore
    //   999: dup_x2
    //   1000: dup_x2
    //   1001: pop
    //   1002: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1005: iconst_0
    //   1006: swap
    //   1007: aastore
    //   1008: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1011: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1014: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1017: bipush #10
    //   1019: aaload
    //   1020: aload_3
    //   1021: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1024: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1027: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1030: bipush #40
    //   1032: aaload
    //   1033: aload_2
    //   1034: lload #8
    //   1036: iconst_1
    //   1037: anewarray java/lang/Object
    //   1040: dup_x2
    //   1041: dup_x2
    //   1042: pop
    //   1043: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1046: iconst_0
    //   1047: swap
    //   1048: aastore
    //   1049: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1052: invokeinterface type : ()C
    //   1057: invokestatic toString : (C)Ljava/lang/String;
    //   1060: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1063: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1066: bipush #22
    //   1068: aaload
    //   1069: aload_2
    //   1070: invokevirtual getVl : ()I
    //   1073: invokestatic toString : (I)Ljava/lang/String;
    //   1076: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1079: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   1082: iconst_1
    //   1083: anewarray java/lang/Object
    //   1086: dup_x1
    //   1087: swap
    //   1088: iconst_0
    //   1089: swap
    //   1090: aastore
    //   1091: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   1094: aload #16
    //   1096: lload #4
    //   1098: lconst_0
    //   1099: lcmp
    //   1100: ifle -> 1552
    //   1103: ifnonnull -> 1536
    //   1106: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1109: goto -> 1116
    //   1112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1115: athrow
    //   1116: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   1119: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gd : Ljava/lang/String;
    //   1122: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1125: bipush #12
    //   1127: aaload
    //   1128: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L : Ljava/lang/String;
    //   1131: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1134: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1137: bipush #14
    //   1139: aaload
    //   1140: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G6 : Ljava/lang/String;
    //   1143: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1146: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1149: bipush #47
    //   1151: aaload
    //   1152: iload #17
    //   1154: invokestatic toString : (I)Ljava/lang/String;
    //   1157: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1160: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1163: bipush #39
    //   1165: aaload
    //   1166: aload_3
    //   1167: iconst_0
    //   1168: anewarray java/lang/Object
    //   1171: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1174: invokeinterface getName : ()Ljava/lang/String;
    //   1179: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1182: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1185: bipush #46
    //   1187: aaload
    //   1188: aload_3
    //   1189: iconst_0
    //   1190: anewarray java/lang/Object
    //   1193: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1196: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   1201: invokevirtual toString : ()Ljava/lang/String;
    //   1204: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1207: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1210: bipush #11
    //   1212: aaload
    //   1213: aload_2
    //   1214: invokevirtual getCategory : ()Ljava/lang/String;
    //   1217: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1220: lload #6
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
    //   1242: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1245: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1248: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1251: bipush #31
    //   1253: aaload
    //   1254: aload_2
    //   1255: lload #8
    //   1257: iconst_1
    //   1258: anewarray java/lang/Object
    //   1261: dup_x2
    //   1262: dup_x2
    //   1263: pop
    //   1264: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1267: iconst_0
    //   1268: swap
    //   1269: aastore
    //   1270: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1273: invokeinterface complexType : ()Ljava/lang/String;
    //   1278: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1281: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1284: bipush #57
    //   1286: aaload
    //   1287: aload_2
    //   1288: lload #8
    //   1290: iconst_1
    //   1291: anewarray java/lang/Object
    //   1294: dup_x2
    //   1295: dup_x2
    //   1296: pop
    //   1297: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1300: iconst_0
    //   1301: swap
    //   1302: aastore
    //   1303: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1306: invokeinterface description : ()Ljava/lang/String;
    //   1311: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1314: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1317: bipush #13
    //   1319: aaload
    //   1320: aload_3
    //   1321: iconst_0
    //   1322: anewarray java/lang/Object
    //   1325: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   1328: iconst_0
    //   1329: anewarray java/lang/Object
    //   1332: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1335: aload #16
    //   1337: ifnull -> 1377
    //   1340: ifnonnull -> 1362
    //   1343: goto -> 1350
    //   1346: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1349: athrow
    //   1350: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1353: iconst_0
    //   1354: aaload
    //   1355: goto -> 1382
    //   1358: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1361: athrow
    //   1362: aload_3
    //   1363: iconst_0
    //   1364: anewarray java/lang/Object
    //   1367: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   1370: iconst_0
    //   1371: anewarray java/lang/Object
    //   1374: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1377: invokeinterface getName : ()Ljava/lang/String;
    //   1382: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1385: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1388: astore #20
    //   1390: aload #20
    //   1392: bipush #43
    //   1394: aaload
    //   1395: aload_2
    //   1396: lload #8
    //   1398: iconst_1
    //   1399: anewarray java/lang/Object
    //   1402: dup_x2
    //   1403: dup_x2
    //   1404: pop
    //   1405: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1408: iconst_0
    //   1409: swap
    //   1410: aastore
    //   1411: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1414: invokeinterface name : ()Ljava/lang/String;
    //   1419: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1422: aload #20
    //   1424: bipush #25
    //   1426: aaload
    //   1427: aload_3
    //   1428: iconst_0
    //   1429: anewarray java/lang/Object
    //   1432: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1435: lload #12
    //   1437: dup2_x1
    //   1438: pop2
    //   1439: iconst_2
    //   1440: anewarray java/lang/Object
    //   1443: dup_x1
    //   1444: swap
    //   1445: iconst_1
    //   1446: swap
    //   1447: aastore
    //   1448: dup_x2
    //   1449: dup_x2
    //   1450: pop
    //   1451: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1454: iconst_0
    //   1455: swap
    //   1456: aastore
    //   1457: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1460: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1463: aload #20
    //   1465: bipush #33
    //   1467: aaload
    //   1468: aload_3
    //   1469: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1472: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1475: aload #20
    //   1477: bipush #16
    //   1479: aaload
    //   1480: aload_2
    //   1481: lload #8
    //   1483: iconst_1
    //   1484: anewarray java/lang/Object
    //   1487: dup_x2
    //   1488: dup_x2
    //   1489: pop
    //   1490: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1493: iconst_0
    //   1494: swap
    //   1495: aastore
    //   1496: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   1499: invokeinterface type : ()C
    //   1504: invokestatic toString : (C)Ljava/lang/String;
    //   1507: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1510: aload #20
    //   1512: iconst_3
    //   1513: aaload
    //   1514: aload_2
    //   1515: invokevirtual getVl : ()I
    //   1518: invokestatic toString : (I)Ljava/lang/String;
    //   1521: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1524: iconst_1
    //   1525: anewarray java/lang/Object
    //   1528: dup_x1
    //   1529: swap
    //   1530: iconst_0
    //   1531: swap
    //   1532: aastore
    //   1533: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   1536: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_y8 : Ljava/util/Map;
    //   1539: aload_2
    //   1540: iconst_0
    //   1541: anewarray java/lang/Object
    //   1544: invokevirtual aegisguard_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1547: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1552: checkcast java/lang/Boolean
    //   1555: invokevirtual booleanValue : ()Z
    //   1558: istore #18
    //   1560: lload #4
    //   1562: lconst_0
    //   1563: lcmp
    //   1564: ifle -> 1589
    //   1567: iload #18
    //   1569: ifeq -> 1596
    //   1572: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MC : Ljava/util/List;
    //   1575: aload_3
    //   1576: aload_2
    //   1577: iload #17
    //   1579: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_hu;Lme/frep/aegisguard/spigot/check/AbstractCheck;I)Ljava/util/function/Consumer;
    //   1584: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1589: goto -> 1596
    //   1592: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1595: athrow
    //   1596: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Le : Ljava/util/Map;
    //   1599: aload_2
    //   1600: iconst_0
    //   1601: anewarray java/lang/Object
    //   1604: invokevirtual aegisguard_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1607: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1612: checkcast java/util/List
    //   1615: astore #19
    //   1617: lload #4
    //   1619: lconst_0
    //   1620: lcmp
    //   1621: ifle -> 1695
    //   1624: aload #19
    //   1626: aload #16
    //   1628: ifnull -> 1685
    //   1631: invokeinterface isEmpty : ()Z
    //   1636: ifne -> 1677
    //   1639: goto -> 1646
    //   1642: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1645: athrow
    //   1646: new me/frep/aegisguard/spigot/aegisguard_hj
    //   1649: dup
    //   1650: aload_0
    //   1651: aload #19
    //   1653: aload_3
    //   1654: iload #17
    //   1656: aload_2
    //   1657: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_KH;Ljava/util/List;Lme/frep/aegisguard/spigot/aegisguard_hu;ILme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   1660: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1663: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   1666: invokevirtual runTask : (Lorg/bukkit/plugin/Plugin;)Lorg/bukkit/scheduler/BukkitTask;
    //   1669: pop
    //   1670: goto -> 1677
    //   1673: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1676: athrow
    //   1677: aload_3
    //   1678: iconst_0
    //   1679: anewarray java/lang/Object
    //   1682: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   1685: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1690: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1695: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #27	-> 78
    //   #29	-> 116
    //   #31	-> 156
    //   #33	-> 176
    //   #35	-> 249
    //   #36	-> 267
    //   #38	-> 285
    //   #40	-> 295
    //   #43	-> 323
    //   #44	-> 341
    //   #46	-> 371
    //   #47	-> 396
    //   #49	-> 413
    //   #53	-> 423
    //   #56	-> 433
    //   #58	-> 487
    //   #60	-> 504
    //   #62	-> 519
    //   #151	-> 537
    //   #153	-> 587
    //   #154	-> 610
    //   #155	-> 652
    //   #156	-> 678
    //   #157	-> 689
    //   #158	-> 702
    //   #159	-> 724
    //   #160	-> 751
    //   #161	-> 761
    //   #162	-> 802
    //   #163	-> 835
    //   #164	-> 868
    //   #165	-> 900
    //   #166	-> 979
    //   #167	-> 1021
    //   #168	-> 1034
    //   #169	-> 1070
    //   #155	-> 1079
    //   #171	-> 1106
    //   #172	-> 1131
    //   #173	-> 1143
    //   #174	-> 1154
    //   #175	-> 1167
    //   #176	-> 1189
    //   #177	-> 1214
    //   #178	-> 1255
    //   #179	-> 1288
    //   #180	-> 1320
    //   #181	-> 1396
    //   #182	-> 1428
    //   #183	-> 1469
    //   #184	-> 1481
    //   #185	-> 1515
    //   #171	-> 1524
    //   #189	-> 1536
    //   #190	-> 1560
    //   #191	-> 1572
    //   #206	-> 1596
    //   #207	-> 1617
    //   #208	-> 1646
    //   #272	-> 1663
    //   #274	-> 1677
    //   #275	-> 1695
    // Exception table:
    //   from	to	target	type
    //   78	108	111	java/lang/RuntimeException
    //   133	148	151	java/lang/RuntimeException
    //   226	241	244	java/lang/RuntimeException
    //   252	260	263	java/lang/RuntimeException
    //   285	315	318	java/lang/RuntimeException
    //   326	334	337	java/lang/RuntimeException
    //   331	379	382	java/lang/RuntimeException
    //   341	389	392	java/lang/RuntimeException
    //   433	451	454	java/lang/RuntimeException
    //   448	473	476	java/lang/RuntimeException
    //   458	483	483	java/lang/RuntimeException
    //   504	515	515	java/lang/RuntimeException
    //   595	603	606	java/lang/RuntimeException
    //   600	625	628	java/lang/RuntimeException
    //   610	645	648	java/lang/RuntimeException
    //   632	920	923	java/lang/RuntimeException
    //   652	930	933	java/lang/RuntimeException
    //   927	945	945	java/lang/RuntimeException
    //   969	1109	1112	java/lang/RuntimeException
    //   1116	1343	1346	java/lang/RuntimeException
    //   1340	1358	1358	java/lang/RuntimeException
    //   1560	1589	1592	java/lang/RuntimeException
    //   1617	1639	1642	java/lang/RuntimeException
    //   1631	1670	1673	java/lang/RuntimeException
  }
  
  private static void lambda$handlePunishment$0(aegisguard_hu paramaegisguard_hu, AbstractCheck paramAbstractCheck) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_KH.a : J
    //   3: ldc2_w 89041126490544
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 36588337800729
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 84510376673220
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 91685988372304
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 41970758723154
    //   34: lxor
    //   35: lstore #10
    //   37: dup2
    //   38: ldc2_w 116550187519168
    //   41: lxor
    //   42: lstore #12
    //   44: pop2
    //   45: new me/frep/aegisguard/spigot/aegisguard_hk
    //   48: dup
    //   49: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_A : Ljava/lang/String;
    //   52: invokespecial <init> : (Ljava/lang/String;)V
    //   55: astore #15
    //   57: invokestatic aegisguard_v : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   60: aload #15
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_o : Ljava/lang/String;
    //   65: iconst_1
    //   66: anewarray java/lang/Object
    //   69: dup_x1
    //   70: swap
    //   71: iconst_0
    //   72: swap
    //   73: aastore
    //   74: invokevirtual aegisguard_z : ([Ljava/lang/Object;)V
    //   77: aload #15
    //   79: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GW : Ljava/lang/String;
    //   82: iconst_1
    //   83: anewarray java/lang/Object
    //   86: dup_x1
    //   87: swap
    //   88: iconst_0
    //   89: swap
    //   90: aastore
    //   91: invokevirtual aegisguard_X : ([Ljava/lang/Object;)V
    //   94: new me/frep/aegisguard/spigot/aegisguard_hD
    //   97: dup
    //   98: invokespecial <init> : ()V
    //   101: astore #16
    //   103: aload_0
    //   104: iconst_0
    //   105: anewarray java/lang/Object
    //   108: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   111: iconst_0
    //   112: anewarray java/lang/Object
    //   115: invokevirtual aegisguard_r : ([Ljava/lang/Object;)D
    //   118: iconst_1
    //   119: anewarray java/lang/Object
    //   122: dup_x2
    //   123: dup_x2
    //   124: pop
    //   125: invokestatic valueOf : (D)Ljava/lang/Double;
    //   128: iconst_0
    //   129: swap
    //   130: aastore
    //   131: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   134: astore #17
    //   136: aload_0
    //   137: iconst_0
    //   138: anewarray java/lang/Object
    //   141: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   144: iconst_0
    //   145: anewarray java/lang/Object
    //   148: invokevirtual aegisguard_z : ([Ljava/lang/Object;)D
    //   151: iconst_1
    //   152: anewarray java/lang/Object
    //   155: dup_x2
    //   156: dup_x2
    //   157: pop
    //   158: invokestatic valueOf : (D)Ljava/lang/Double;
    //   161: iconst_0
    //   162: swap
    //   163: aastore
    //   164: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   167: astore #18
    //   169: aload_0
    //   170: iconst_0
    //   171: anewarray java/lang/Object
    //   174: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   177: iconst_0
    //   178: anewarray java/lang/Object
    //   181: invokevirtual aegisguard_u : ([Ljava/lang/Object;)D
    //   184: iconst_1
    //   185: anewarray java/lang/Object
    //   188: dup_x2
    //   189: dup_x2
    //   190: pop
    //   191: invokestatic valueOf : (D)Ljava/lang/Double;
    //   194: iconst_0
    //   195: swap
    //   196: aastore
    //   197: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   200: astore #19
    //   202: aload_0
    //   203: iconst_0
    //   204: anewarray java/lang/Object
    //   207: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   210: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   215: invokeinterface getName : ()Ljava/lang/String;
    //   220: astore #20
    //   222: aload #16
    //   224: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yI : Ljava/lang/String;
    //   227: iconst_1
    //   228: anewarray java/lang/Object
    //   231: dup_x1
    //   232: swap
    //   233: iconst_0
    //   234: swap
    //   235: aastore
    //   236: invokevirtual aegisguard_D : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   239: pop
    //   240: aload #16
    //   242: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MY : Ljava/lang/String;
    //   245: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   248: astore #22
    //   250: aload #22
    //   252: bipush #46
    //   254: aaload
    //   255: aload_0
    //   256: iconst_0
    //   257: anewarray java/lang/Object
    //   260: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   263: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   268: invokevirtual toString : ()Ljava/lang/String;
    //   271: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   274: aload #22
    //   276: bipush #17
    //   278: aaload
    //   279: aload_0
    //   280: iconst_0
    //   281: anewarray java/lang/Object
    //   284: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   287: invokeinterface getName : ()Ljava/lang/String;
    //   292: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   295: iconst_1
    //   296: anewarray java/lang/Object
    //   299: dup_x1
    //   300: swap
    //   301: iconst_0
    //   302: swap
    //   303: aastore
    //   304: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   307: pop
    //   308: aload #16
    //   310: new java/awt/Color
    //   313: dup
    //   314: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LS : I
    //   317: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lb : I
    //   320: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LP : I
    //   323: invokespecial <init> : (III)V
    //   326: iconst_1
    //   327: anewarray java/lang/Object
    //   330: dup_x1
    //   331: swap
    //   332: iconst_0
    //   333: swap
    //   334: aastore
    //   335: invokevirtual aegisguard_Q : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   338: pop
    //   339: astore #14
    //   341: aload #16
    //   343: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_v : Ljava/lang/String;
    //   346: aload #22
    //   348: bipush #39
    //   350: aaload
    //   351: aload_0
    //   352: iconst_0
    //   353: anewarray java/lang/Object
    //   356: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   359: invokeinterface getName : ()Ljava/lang/String;
    //   364: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   367: aload #22
    //   369: bipush #43
    //   371: aaload
    //   372: aload_1
    //   373: lload #10
    //   375: iconst_1
    //   376: anewarray java/lang/Object
    //   379: dup_x2
    //   380: dup_x2
    //   381: pop
    //   382: invokestatic valueOf : (J)Ljava/lang/Long;
    //   385: iconst_0
    //   386: swap
    //   387: aastore
    //   388: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   391: invokeinterface name : ()Ljava/lang/String;
    //   396: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   399: aload #22
    //   401: bipush #14
    //   403: aaload
    //   404: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G6 : Ljava/lang/String;
    //   407: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   410: aload #22
    //   412: bipush #46
    //   414: aaload
    //   415: aload_0
    //   416: iconst_0
    //   417: anewarray java/lang/Object
    //   420: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   423: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   428: invokevirtual toString : ()Ljava/lang/String;
    //   431: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   434: aload #22
    //   436: bipush #19
    //   438: aaload
    //   439: aload #17
    //   441: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   444: aload #22
    //   446: bipush #48
    //   448: aaload
    //   449: aload #18
    //   451: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   454: aload #22
    //   456: bipush #51
    //   458: aaload
    //   459: aload #19
    //   461: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   464: aload #22
    //   466: bipush #42
    //   468: aaload
    //   469: aload #20
    //   471: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   474: aload #22
    //   476: iconst_3
    //   477: aaload
    //   478: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dS : Ljava/util/Map;
    //   481: aload_1
    //   482: iconst_0
    //   483: anewarray java/lang/Object
    //   486: invokevirtual aegisguard_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   489: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   494: checkcast java/lang/Integer
    //   497: invokevirtual intValue : ()I
    //   500: invokestatic toString : (I)Ljava/lang/String;
    //   503: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   506: aload #22
    //   508: bipush #33
    //   510: aaload
    //   511: aload_0
    //   512: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   515: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   518: aload #22
    //   520: bipush #11
    //   522: aaload
    //   523: aload_1
    //   524: invokevirtual getCategory : ()Ljava/lang/String;
    //   527: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   530: lload #6
    //   532: dup2_x1
    //   533: pop2
    //   534: iconst_2
    //   535: anewarray java/lang/Object
    //   538: dup_x1
    //   539: swap
    //   540: iconst_1
    //   541: swap
    //   542: aastore
    //   543: dup_x2
    //   544: dup_x2
    //   545: pop
    //   546: invokestatic valueOf : (J)Ljava/lang/Long;
    //   549: iconst_0
    //   550: swap
    //   551: aastore
    //   552: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   555: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   558: aload #22
    //   560: bipush #44
    //   562: aaload
    //   563: aload_0
    //   564: iconst_0
    //   565: anewarray java/lang/Object
    //   568: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   571: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   576: invokeinterface getName : ()Ljava/lang/String;
    //   581: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   584: aload #22
    //   586: bipush #31
    //   588: aaload
    //   589: aload_1
    //   590: lload #10
    //   592: iconst_1
    //   593: anewarray java/lang/Object
    //   596: dup_x2
    //   597: dup_x2
    //   598: pop
    //   599: invokestatic valueOf : (J)Ljava/lang/Long;
    //   602: iconst_0
    //   603: swap
    //   604: aastore
    //   605: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   608: invokeinterface complexType : ()Ljava/lang/String;
    //   613: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   616: aload #22
    //   618: bipush #23
    //   620: aaload
    //   621: aload_0
    //   622: iconst_0
    //   623: anewarray java/lang/Object
    //   626: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   629: lload #12
    //   631: dup2_x1
    //   632: pop2
    //   633: iconst_2
    //   634: anewarray java/lang/Object
    //   637: dup_x1
    //   638: swap
    //   639: iconst_1
    //   640: swap
    //   641: aastore
    //   642: dup_x2
    //   643: dup_x2
    //   644: pop
    //   645: invokestatic valueOf : (J)Ljava/lang/Long;
    //   648: iconst_0
    //   649: swap
    //   650: aastore
    //   651: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   654: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   657: aload #22
    //   659: bipush #36
    //   661: aaload
    //   662: aload_0
    //   663: iconst_0
    //   664: anewarray java/lang/Object
    //   667: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   670: iconst_0
    //   671: anewarray java/lang/Object
    //   674: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)I
    //   677: invokestatic toString : (I)Ljava/lang/String;
    //   680: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   683: aload #22
    //   685: bipush #52
    //   687: aaload
    //   688: aload_0
    //   689: iconst_0
    //   690: anewarray java/lang/Object
    //   693: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   696: iconst_0
    //   697: anewarray java/lang/Object
    //   700: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   703: aload #14
    //   705: ifnull -> 745
    //   708: ifnonnull -> 730
    //   711: goto -> 718
    //   714: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   717: athrow
    //   718: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   721: iconst_0
    //   722: aaload
    //   723: goto -> 750
    //   726: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   729: athrow
    //   730: aload_0
    //   731: iconst_0
    //   732: anewarray java/lang/Object
    //   735: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   738: iconst_0
    //   739: anewarray java/lang/Object
    //   742: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   745: invokeinterface getName : ()Ljava/lang/String;
    //   750: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   753: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   756: bipush #57
    //   758: aaload
    //   759: aload_1
    //   760: invokevirtual getDescription : ()Ljava/lang/String;
    //   763: aload #14
    //   765: ifnull -> 843
    //   768: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   771: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   774: iconst_1
    //   775: aaload
    //   776: aload_1
    //   777: lload #10
    //   779: iconst_1
    //   780: anewarray java/lang/Object
    //   783: dup_x2
    //   784: dup_x2
    //   785: pop
    //   786: invokestatic valueOf : (J)Ljava/lang/Long;
    //   789: iconst_0
    //   790: swap
    //   791: aastore
    //   792: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   795: invokeinterface experimental : ()Z
    //   800: ifeq -> 846
    //   803: goto -> 810
    //   806: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   809: athrow
    //   810: lload #4
    //   812: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Go : Ljava/lang/String;
    //   815: iconst_2
    //   816: anewarray java/lang/Object
    //   819: dup_x1
    //   820: swap
    //   821: iconst_1
    //   822: swap
    //   823: aastore
    //   824: dup_x2
    //   825: dup_x2
    //   826: pop
    //   827: invokestatic valueOf : (J)Ljava/lang/Long;
    //   830: iconst_0
    //   831: swap
    //   832: aastore
    //   833: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   836: goto -> 843
    //   839: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   842: athrow
    //   843: goto -> 848
    //   846: ldc ''
    //   848: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   851: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   854: bipush #16
    //   856: aaload
    //   857: aload_1
    //   858: lload #10
    //   860: iconst_1
    //   861: anewarray java/lang/Object
    //   864: dup_x2
    //   865: dup_x2
    //   866: pop
    //   867: invokestatic valueOf : (J)Ljava/lang/Long;
    //   870: iconst_0
    //   871: swap
    //   872: aastore
    //   873: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   876: invokeinterface type : ()C
    //   881: invokestatic toString : (C)Ljava/lang/String;
    //   884: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   887: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   890: bipush #32
    //   892: aaload
    //   893: iconst_0
    //   894: anewarray java/lang/Object
    //   897: invokestatic aegisguard_S : ([Ljava/lang/Object;)D
    //   900: iconst_1
    //   901: anewarray java/lang/Object
    //   904: dup_x2
    //   905: dup_x2
    //   906: pop
    //   907: invokestatic valueOf : (D)Ljava/lang/Double;
    //   910: iconst_0
    //   911: swap
    //   912: aastore
    //   913: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   916: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   919: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   922: bipush #43
    //   924: aaload
    //   925: aload_1
    //   926: invokevirtual getName : ()Ljava/lang/String;
    //   929: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   932: iconst_1
    //   933: anewarray java/lang/Object
    //   936: dup_x1
    //   937: swap
    //   938: iconst_0
    //   939: swap
    //   940: aastore
    //   941: invokevirtual aegisguard_f : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   944: pop
    //   945: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_l : Z
    //   948: aload #14
    //   950: ifnull -> 1012
    //   953: ifeq -> 1009
    //   956: goto -> 963
    //   959: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   962: athrow
    //   963: aload #16
    //   965: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   968: bipush #7
    //   970: aaload
    //   971: aload_1
    //   972: invokevirtual getDescription : ()Ljava/lang/String;
    //   975: iconst_1
    //   976: iconst_3
    //   977: anewarray java/lang/Object
    //   980: dup_x1
    //   981: swap
    //   982: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   985: iconst_2
    //   986: swap
    //   987: aastore
    //   988: dup_x1
    //   989: swap
    //   990: iconst_1
    //   991: swap
    //   992: aastore
    //   993: dup_x1
    //   994: swap
    //   995: iconst_0
    //   996: swap
    //   997: aastore
    //   998: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   1001: pop
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1008: athrow
    //   1009: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_M_ : Z
    //   1012: aload #14
    //   1014: ifnull -> 1075
    //   1017: ifeq -> 1072
    //   1020: goto -> 1027
    //   1023: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1026: athrow
    //   1027: aload #16
    //   1029: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1032: bipush #15
    //   1034: aaload
    //   1035: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G6 : Ljava/lang/String;
    //   1038: iconst_1
    //   1039: iconst_3
    //   1040: anewarray java/lang/Object
    //   1043: dup_x1
    //   1044: swap
    //   1045: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1048: iconst_2
    //   1049: swap
    //   1050: aastore
    //   1051: dup_x1
    //   1052: swap
    //   1053: iconst_1
    //   1054: swap
    //   1055: aastore
    //   1056: dup_x1
    //   1057: swap
    //   1058: iconst_0
    //   1059: swap
    //   1060: aastore
    //   1061: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   1064: pop
    //   1065: goto -> 1072
    //   1068: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1071: athrow
    //   1072: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_e : Z
    //   1075: aload #14
    //   1077: ifnull -> 1139
    //   1080: ifeq -> 1136
    //   1083: goto -> 1090
    //   1086: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1089: athrow
    //   1090: aload #16
    //   1092: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1095: bipush #49
    //   1097: aaload
    //   1098: aload_0
    //   1099: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1102: iconst_1
    //   1103: iconst_3
    //   1104: anewarray java/lang/Object
    //   1107: dup_x1
    //   1108: swap
    //   1109: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1112: iconst_2
    //   1113: swap
    //   1114: aastore
    //   1115: dup_x1
    //   1116: swap
    //   1117: iconst_1
    //   1118: swap
    //   1119: aastore
    //   1120: dup_x1
    //   1121: swap
    //   1122: iconst_0
    //   1123: swap
    //   1124: aastore
    //   1125: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   1128: pop
    //   1129: goto -> 1136
    //   1132: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1135: athrow
    //   1136: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GB : Z
    //   1139: aload #14
    //   1141: ifnull -> 1232
    //   1144: ifeq -> 1229
    //   1147: goto -> 1154
    //   1150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1153: athrow
    //   1154: aload #16
    //   1156: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1159: bipush #53
    //   1161: aaload
    //   1162: aload_0
    //   1163: iconst_0
    //   1164: anewarray java/lang/Object
    //   1167: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1170: lload #12
    //   1172: dup2_x1
    //   1173: pop2
    //   1174: iconst_2
    //   1175: anewarray java/lang/Object
    //   1178: dup_x1
    //   1179: swap
    //   1180: iconst_1
    //   1181: swap
    //   1182: aastore
    //   1183: dup_x2
    //   1184: dup_x2
    //   1185: pop
    //   1186: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1189: iconst_0
    //   1190: swap
    //   1191: aastore
    //   1192: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1195: iconst_1
    //   1196: iconst_3
    //   1197: anewarray java/lang/Object
    //   1200: dup_x1
    //   1201: swap
    //   1202: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1205: iconst_2
    //   1206: swap
    //   1207: aastore
    //   1208: dup_x1
    //   1209: swap
    //   1210: iconst_1
    //   1211: swap
    //   1212: aastore
    //   1213: dup_x1
    //   1214: swap
    //   1215: iconst_0
    //   1216: swap
    //   1217: aastore
    //   1218: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   1221: pop
    //   1222: goto -> 1229
    //   1225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1228: athrow
    //   1229: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mk : Z
    //   1232: aload #14
    //   1234: ifnull -> 1354
    //   1237: ifeq -> 1351
    //   1240: goto -> 1247
    //   1243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1246: athrow
    //   1247: aload #16
    //   1249: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1252: bipush #55
    //   1254: aaload
    //   1255: new java/lang/StringBuilder
    //   1258: dup
    //   1259: invokespecial <init> : ()V
    //   1262: aload_0
    //   1263: iconst_0
    //   1264: anewarray java/lang/Object
    //   1267: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   1270: iconst_0
    //   1271: anewarray java/lang/Object
    //   1274: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)I
    //   1277: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1280: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1283: iconst_5
    //   1284: aaload
    //   1285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1288: iconst_0
    //   1289: anewarray java/lang/Object
    //   1292: invokestatic aegisguard_S : ([Ljava/lang/Object;)D
    //   1295: iconst_1
    //   1296: anewarray java/lang/Object
    //   1299: dup_x2
    //   1300: dup_x2
    //   1301: pop
    //   1302: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1305: iconst_0
    //   1306: swap
    //   1307: aastore
    //   1308: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1314: invokevirtual toString : ()Ljava/lang/String;
    //   1317: iconst_1
    //   1318: iconst_3
    //   1319: anewarray java/lang/Object
    //   1322: dup_x1
    //   1323: swap
    //   1324: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1327: iconst_2
    //   1328: swap
    //   1329: aastore
    //   1330: dup_x1
    //   1331: swap
    //   1332: iconst_1
    //   1333: swap
    //   1334: aastore
    //   1335: dup_x1
    //   1336: swap
    //   1337: iconst_0
    //   1338: swap
    //   1339: aastore
    //   1340: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   1343: pop
    //   1344: goto -> 1351
    //   1347: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1350: athrow
    //   1351: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_n : Z
    //   1354: aload #14
    //   1356: ifnull -> 1558
    //   1359: ifeq -> 1534
    //   1362: goto -> 1369
    //   1365: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1368: athrow
    //   1369: aload #16
    //   1371: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1374: bipush #6
    //   1376: aaload
    //   1377: new java/lang/StringBuilder
    //   1380: dup
    //   1381: invokespecial <init> : ()V
    //   1384: ldc_w '('
    //   1387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1390: aload_0
    //   1391: iconst_0
    //   1392: anewarray java/lang/Object
    //   1395: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1398: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   1403: invokeinterface getName : ()Ljava/lang/String;
    //   1408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1411: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1414: iconst_2
    //   1415: aaload
    //   1416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1419: aload_0
    //   1420: iconst_0
    //   1421: anewarray java/lang/Object
    //   1424: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1427: iconst_0
    //   1428: anewarray java/lang/Object
    //   1431: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   1434: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1437: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1440: bipush #18
    //   1442: aaload
    //   1443: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1446: aload_0
    //   1447: iconst_0
    //   1448: anewarray java/lang/Object
    //   1451: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1454: iconst_0
    //   1455: anewarray java/lang/Object
    //   1458: invokevirtual aegisguard_vY : ([Ljava/lang/Object;)I
    //   1461: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1464: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1467: bipush #18
    //   1469: aaload
    //   1470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1473: aload_0
    //   1474: iconst_0
    //   1475: anewarray java/lang/Object
    //   1478: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1481: iconst_0
    //   1482: anewarray java/lang/Object
    //   1485: invokevirtual aegisguard_vN : ([Ljava/lang/Object;)I
    //   1488: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1491: ldc_w ')'
    //   1494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1497: invokevirtual toString : ()Ljava/lang/String;
    //   1500: iconst_1
    //   1501: iconst_3
    //   1502: anewarray java/lang/Object
    //   1505: dup_x1
    //   1506: swap
    //   1507: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1510: iconst_2
    //   1511: swap
    //   1512: aastore
    //   1513: dup_x1
    //   1514: swap
    //   1515: iconst_1
    //   1516: swap
    //   1517: aastore
    //   1518: dup_x1
    //   1519: swap
    //   1520: iconst_0
    //   1521: swap
    //   1522: aastore
    //   1523: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hD;
    //   1526: pop
    //   1527: goto -> 1534
    //   1530: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1533: athrow
    //   1534: aload #15
    //   1536: aload #16
    //   1538: iconst_1
    //   1539: anewarray java/lang/Object
    //   1542: dup_x1
    //   1543: swap
    //   1544: iconst_0
    //   1545: swap
    //   1546: aastore
    //   1547: invokevirtual aegisguard_r : ([Ljava/lang/Object;)V
    //   1550: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yi : Ljava/lang/String;
    //   1553: ldc ''
    //   1555: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1558: aload #14
    //   1560: ifnull -> 1622
    //   1563: ifne -> 1619
    //   1566: goto -> 1573
    //   1569: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1572: athrow
    //   1573: aload #15
    //   1575: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yi : Ljava/lang/String;
    //   1578: getstatic me/frep/aegisguard/spigot/aegisguard_KH.b : [Ljava/lang/String;
    //   1581: bipush #39
    //   1583: aaload
    //   1584: aload_0
    //   1585: iconst_0
    //   1586: anewarray java/lang/Object
    //   1589: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1592: invokeinterface getName : ()Ljava/lang/String;
    //   1597: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1600: iconst_1
    //   1601: anewarray java/lang/Object
    //   1604: dup_x1
    //   1605: swap
    //   1606: iconst_0
    //   1607: swap
    //   1608: aastore
    //   1609: invokevirtual aegisguard_B : ([Ljava/lang/Object;)V
    //   1612: goto -> 1619
    //   1615: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1618: athrow
    //   1619: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GX : Z
    //   1622: ifeq -> 1671
    //   1625: aload #15
    //   1627: lload #8
    //   1629: iconst_1
    //   1630: anewarray java/lang/Object
    //   1633: dup_x2
    //   1634: dup_x2
    //   1635: pop
    //   1636: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1639: iconst_0
    //   1640: swap
    //   1641: aastore
    //   1642: invokevirtual aegisguard_N : ([Ljava/lang/Object;)V
    //   1645: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1648: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1651: invokevirtual aegisguard_Z : ()I
    //   1654: iconst_1
    //   1655: iadd
    //   1656: invokevirtual aegisguard_P : (I)V
    //   1659: aload #14
    //   1661: ifnonnull -> 1698
    //   1664: goto -> 1671
    //   1667: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1670: athrow
    //   1671: aload #15
    //   1673: lload #8
    //   1675: iconst_1
    //   1676: anewarray java/lang/Object
    //   1679: dup_x2
    //   1680: dup_x2
    //   1681: pop
    //   1682: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1685: iconst_0
    //   1686: swap
    //   1687: aastore
    //   1688: invokevirtual aegisguard_N : ([Ljava/lang/Object;)V
    //   1691: goto -> 1698
    //   1694: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1697: athrow
    //   1698: goto -> 1703
    //   1701: astore #21
    //   1703: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #63	-> 45
    //   #65	-> 60
    //   #66	-> 77
    //   #68	-> 94
    //   #70	-> 103
    //   #71	-> 136
    //   #72	-> 169
    //   #73	-> 202
    //   #75	-> 222
    //   #76	-> 240
    //   #77	-> 256
    //   #78	-> 280
    //   #76	-> 295
    //   #79	-> 308
    //   #80	-> 341
    //   #81	-> 352
    //   #82	-> 373
    //   #83	-> 407
    //   #84	-> 416
    //   #85	-> 441
    //   #86	-> 451
    //   #87	-> 461
    //   #88	-> 471
    //   #89	-> 482
    //   #90	-> 512
    //   #91	-> 524
    //   #92	-> 564
    //   #93	-> 590
    //   #94	-> 622
    //   #95	-> 663
    //   #96	-> 688
    //   #97	-> 760
    //   #98	-> 776
    //   #99	-> 858
    //   #100	-> 893
    //   #101	-> 926
    //   #80	-> 932
    //   #103	-> 945
    //   #104	-> 963
    //   #107	-> 1009
    //   #108	-> 1027
    //   #111	-> 1072
    //   #112	-> 1090
    //   #115	-> 1136
    //   #116	-> 1154
    //   #119	-> 1229
    //   #120	-> 1247
    //   #121	-> 1263
    //   #120	-> 1318
    //   #124	-> 1351
    //   #125	-> 1369
    //   #126	-> 1420
    //   #127	-> 1447
    //   #128	-> 1474
    //   #125	-> 1501
    //   #131	-> 1534
    //   #133	-> 1550
    //   #134	-> 1573
    //   #135	-> 1585
    //   #134	-> 1600
    //   #139	-> 1619
    //   #140	-> 1625
    //   #141	-> 1645
    //   #143	-> 1671
    //   #147	-> 1698
    //   #145	-> 1701
    //   #148	-> 1703
    // Exception table:
    //   from	to	target	type
    //   341	711	714	java/lang/Exception
    //   708	726	726	java/lang/Exception
    //   750	803	806	java/lang/Exception
    //   768	836	839	java/lang/Exception
    //   848	956	959	java/lang/Exception
    //   953	1002	1005	java/lang/Exception
    //   1012	1020	1023	java/lang/Exception
    //   1017	1065	1068	java/lang/Exception
    //   1075	1083	1086	java/lang/Exception
    //   1080	1129	1132	java/lang/Exception
    //   1139	1147	1150	java/lang/Exception
    //   1144	1222	1225	java/lang/Exception
    //   1232	1240	1243	java/lang/Exception
    //   1237	1344	1347	java/lang/Exception
    //   1354	1362	1365	java/lang/Exception
    //   1359	1527	1530	java/lang/Exception
    //   1558	1566	1569	java/lang/Exception
    //   1563	1612	1615	java/lang/Exception
    //   1619	1698	1701	java/lang/Exception
    //   1622	1664	1667	java/lang/Exception
    //   1625	1691	1694	java/lang/Exception
  }
  
  private static void lambda$handlePunishment$1(aegisguard_hu paramaegisguard_hu, AbstractCheck paramAbstractCheck, int paramInt, String paramString) {
    long l1 = a ^ 0x5F3A6F699859L, l2 = l1 ^ 0x431D7525A62DL, l3 = l1 ^ 0x29EDFBF4BFBBL, l4 = l1 ^ 0x65C19B581529L;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_v();
    try {
      (new Object[2])[1] = paramaegisguard_hu.aegisguard_L(new Object[0]);
      new Object[2];
      new Object[1];
      if (arrayOfAbstractCheck != null) {
        try {
          if (paramaegisguard_hu.aegisguard_r(new Object[0]).aegisguard_r(new Object[0]) == null) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        String[] arrayOfString = b;
        new Object[1];
        (new Object[2])[1] = paramAbstractCheck.getCategory().toLowerCase();
        new Object[2];
        new Object[1];
        new Object[1];
        aegisguard_Xz.aegisguard_y(paramString.replaceAll(b[39], paramaegisguard_hu.aegisguard_L(new Object[0]).getName()).replaceAll(b[25], aegisguard_Xa.aegisguard_g(new Object[] { Long.valueOf(l4) })).replaceAll(b[33], paramaegisguard_hu.getClientBrand()).replaceAll(b[43], paramAbstractCheck.aegisguard_B(new Object[] { Long.valueOf(l3) }).name()).replaceAll(b[14], aegisguard_b0.aegisguard_G6).replaceAll(b[46], paramaegisguard_hu.aegisguard_L(new Object[0]).getUniqueId().toString()).replaceAll(b[35], paramaegisguard_hu.aegisguard_r(new Object[0]).aegisguard_r(new Object[0]).getName()).replaceAll(arrayOfString[31], paramAbstractCheck.aegisguard_B(new Object[] { Long.valueOf(l3) }).complexType()).replaceAll(arrayOfString[11], aegisguard_bG.aegisguard_Q(new Object[] { Long.valueOf(l2) })).replaceAll(arrayOfString[47], Integer.toString(paramInt)).replaceAll(arrayOfString[57], paramAbstractCheck.aegisguard_B(new Object[] { Long.valueOf(l3) }).description()).replaceAll(arrayOfString[16], Character.toString(paramAbstractCheck.aegisguard_B(new Object[] { Long.valueOf(l3) }).type())));
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static void lambda$handlePunishment$2(AbstractCheck paramAbstractCheck) {
    paramAbstractCheck.setVl(0);
  }
  
  public static String spigot() {
    return b[24];
  }
  
  public static String nonce() {
    return b[45];
  }
  
  public static String resource() {
    return b[9];
  }
  
  private void aegisguard_F(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    Player player = (Player)paramArrayOfObject[1];
    String str = (String)paramArrayOfObject[2];
    l = a ^ l;
    try {
      if (!aegisguard_b0.aegisguard_t)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ByteArrayDataOutput byteArrayDataOutput = ByteStreams.newDataOutput();
    String[] arrayOfString = b;
    byteArrayDataOutput.writeUTF(arrayOfString[56]);
    byteArrayDataOutput.writeUTF(str);
    player.sendPluginMessage((Plugin)aegisguard_K.INSTANCE.aegisguard_j(), arrayOfString[26], byteArrayDataOutput.toByteArray());
  }
  
  public static void aegisguard_H(AbstractCheck[] paramArrayOfAbstractCheck) {
    aegisguard_x = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] aegisguard_v() {
    return aegisguard_x;
  }
  
  static {
    long l = a ^ 0x17BC6900BBAAL;
    aegisguard_H(new AbstractCheck[1]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[59];
    boolean bool = false;
    String str;
    int i = (str = "zdUÑ¸\007\004\024\biÇâ=\000\034I\b®6ÚÂúI\017\bÿºÐja)p\bzdUÑ¸\007\004\024\bÆq\021@ÀõÁ\020\002Áñ\037vøØ\026îyÜcDf\020Å¦8Á¤!E³×Ë\037?òQ\020q20ÄÌíÑX©þ¨c@\030~hµ\017ä\002>h\032ÅW\000ql\035V\026BØë\020¤Jx&´\013ÝðÚÏUÝ©®Þ\020\f®kçæuïý'fÔgz\020*Jl¦îë%¤»jÑ§z°#\020\001ÝI±\002l%ñ@\007öø\020q20ÄÌíÑX©þ¨c@\020ä\006mÿé`'¸½-úa]åÚ\b\006Ü{\025dè4\b$ÜÀ<bìã \b®6ÚÂúI\017\blg«|Pé:\020Ûô\013G\fÓÿnÈyÿØY\020\f®kçæuïý'fÔgz\bÿºÐja)p\020£ëÇºl'SÂxbg\017\032Ùð\020\000®R¹\030û\0010þª>\017I\037\024\030¤Jx&´\013Ý½´S\021eK­ÇP¿\026Âà\0068\037\020.×@.³\003 'ý~4\017\020}$ò r/k,ö@·Ú+h\020\004êbM\002Z!­h\023¥BµÈ;Ò\b\016ëuHùÆ\b©¨[b2¸v\020\004êbM\002Z!­h\023¥BµÈ;Ò\b:»oÙ5!DÙ\020¤Jx&´\013ÝðÚÏUÝ©®Þ\020\001ÝI±\002J)8F7Æ\020\001ÝI±\002l%ñ@\007öø\b¢þ`\034ãÇ´\020*Jl¦îë%¤»jÑ§z°#\020?<£Z5\ní¿7Ö\023»\020?<£Z5\ní¿7Ö\023»\b\006Ü{\025dè4\030¤Jx&´\013Ý½´S\021eK­ÇP¿\026Âà\0068\037\bnb¡H%]ëï\b\016ëuHùÆ\bnb¡H%]ëï\020ÂÚ!ÊrX4t\005ÚLïuT\b©¨[b2¸v\020\025âÍÜÍå\032ÄLÇ\0039A\bx¯Wo?0@\020\013[R;\031ÎàNfìÂÉò>\020Þâ\013:åÇPéíËbi\035<ì\bÏú[E£;à\020\001ÝI±\002J)8F7Æ\020»Â\t­Uõmy®¿õÙ¿Dù\020éqÿ»\034¦cÝ¢NÕ\030\020¢»\\(\"S»f¡ç±*\020Þâ\013:åÇPB8ófð,\035\033").length();
    byte b2 = 8;
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
