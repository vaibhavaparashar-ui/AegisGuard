package me.frep.aegisguard.spigot.AegisGuard_z;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_M;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class aegisguard_z extends aegisguard_M implements CommandExecutor {
  private static final long b = aegisguard_e.a(-6437533950708822145L, 6010424950382134380L, MethodHandles.lookup().lookupClass()).a(220553998957644L);
  
  private static final String[] d;
  
  public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_z.b : J
    //   3: ldc2_w 106877593088598
    //   6: lxor
    //   7: lstore #5
    //   9: lload #5
    //   11: dup2
    //   12: ldc2_w 35521770815182
    //   15: lxor
    //   16: lstore #7
    //   18: dup2
    //   19: ldc2_w 84934165787122
    //   22: lxor
    //   23: lstore #9
    //   25: pop2
    //   26: invokestatic aegisguard_V : ()Ljava/lang/String;
    //   29: astore #11
    //   31: aload_1
    //   32: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   35: bipush #10
    //   37: aaload
    //   38: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   43: aload #11
    //   45: ifnull -> 100
    //   48: ifne -> 97
    //   51: goto -> 58
    //   54: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   57: athrow
    //   58: aload_0
    //   59: aload_1
    //   60: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   63: lload #9
    //   65: iconst_3
    //   66: anewarray java/lang/Object
    //   69: dup_x2
    //   70: dup_x2
    //   71: pop
    //   72: invokestatic valueOf : (J)Ljava/lang/Long;
    //   75: iconst_2
    //   76: swap
    //   77: aastore
    //   78: dup_x1
    //   79: swap
    //   80: iconst_1
    //   81: swap
    //   82: aastore
    //   83: dup_x1
    //   84: swap
    //   85: iconst_0
    //   86: swap
    //   87: aastore
    //   88: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   91: iconst_1
    //   92: ireturn
    //   93: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload #4
    //   99: arraylength
    //   100: aload #11
    //   102: ifnull -> 170
    //   105: ifne -> 154
    //   108: goto -> 115
    //   111: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: aload_0
    //   116: aload_1
    //   117: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gn : Ljava/lang/String;
    //   120: lload #9
    //   122: iconst_3
    //   123: anewarray java/lang/Object
    //   126: dup_x2
    //   127: dup_x2
    //   128: pop
    //   129: invokestatic valueOf : (J)Ljava/lang/Long;
    //   132: iconst_2
    //   133: swap
    //   134: aastore
    //   135: dup_x1
    //   136: swap
    //   137: iconst_1
    //   138: swap
    //   139: aastore
    //   140: dup_x1
    //   141: swap
    //   142: iconst_0
    //   143: swap
    //   144: aastore
    //   145: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   148: iconst_1
    //   149: ireturn
    //   150: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: aload #4
    //   156: iconst_0
    //   157: aaload
    //   158: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   161: astore #18
    //   163: aload #18
    //   165: iconst_5
    //   166: aaload
    //   167: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   170: aload #11
    //   172: ifnull -> 290
    //   175: ifeq -> 273
    //   178: goto -> 185
    //   181: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   184: athrow
    //   185: lload #7
    //   187: iconst_1
    //   188: anewarray java/lang/Object
    //   191: dup_x2
    //   192: dup_x2
    //   193: pop
    //   194: invokestatic valueOf : (J)Ljava/lang/Long;
    //   197: iconst_0
    //   198: swap
    //   199: aastore
    //   200: invokestatic aegisguard_G : ([Ljava/lang/Object;)I
    //   203: aload #11
    //   205: ifnull -> 272
    //   208: goto -> 215
    //   211: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: ifne -> 264
    //   218: goto -> 225
    //   221: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   224: athrow
    //   225: aload_0
    //   226: aload_1
    //   227: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yv : Ljava/lang/String;
    //   230: lload #9
    //   232: iconst_3
    //   233: anewarray java/lang/Object
    //   236: dup_x2
    //   237: dup_x2
    //   238: pop
    //   239: invokestatic valueOf : (J)Ljava/lang/Long;
    //   242: iconst_2
    //   243: swap
    //   244: aastore
    //   245: dup_x1
    //   246: swap
    //   247: iconst_1
    //   248: swap
    //   249: aastore
    //   250: dup_x1
    //   251: swap
    //   252: iconst_0
    //   253: swap
    //   254: aastore
    //   255: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   258: iconst_1
    //   259: ireturn
    //   260: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   263: athrow
    //   264: iconst_0
    //   265: anewarray java/lang/Object
    //   268: invokestatic aegisguard_u : ([Ljava/lang/Object;)V
    //   271: iconst_1
    //   272: ireturn
    //   273: aload #4
    //   275: iconst_0
    //   276: aaload
    //   277: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   280: astore #18
    //   282: aload #18
    //   284: bipush #16
    //   286: aaload
    //   287: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   290: aload #11
    //   292: ifnull -> 920
    //   295: ifeq -> 901
    //   298: goto -> 305
    //   301: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   304: athrow
    //   305: aload #4
    //   307: aload #11
    //   309: ifnull -> 372
    //   312: goto -> 319
    //   315: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   318: athrow
    //   319: arraylength
    //   320: iconst_2
    //   321: if_icmpge -> 370
    //   324: goto -> 331
    //   327: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   330: athrow
    //   331: aload_0
    //   332: aload_1
    //   333: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gn : Ljava/lang/String;
    //   336: lload #9
    //   338: iconst_3
    //   339: anewarray java/lang/Object
    //   342: dup_x2
    //   343: dup_x2
    //   344: pop
    //   345: invokestatic valueOf : (J)Ljava/lang/Long;
    //   348: iconst_2
    //   349: swap
    //   350: aastore
    //   351: dup_x1
    //   352: swap
    //   353: iconst_1
    //   354: swap
    //   355: aastore
    //   356: dup_x1
    //   357: swap
    //   358: iconst_0
    //   359: swap
    //   360: aastore
    //   361: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   364: iconst_1
    //   365: ireturn
    //   366: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   369: athrow
    //   370: aload #4
    //   372: iconst_1
    //   373: aaload
    //   374: invokestatic getOfflinePlayer : (Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
    //   377: astore #12
    //   379: new me/frep/aegisguard/spigot/aegisguard_hi
    //   382: dup
    //   383: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   386: astore #18
    //   388: aload #18
    //   390: bipush #14
    //   392: aaload
    //   393: invokespecial <init> : (Ljava/lang/String;)V
    //   396: astore #13
    //   398: new java/lang/StringBuilder
    //   401: dup
    //   402: invokespecial <init> : ()V
    //   405: astore #14
    //   407: iconst_2
    //   408: istore #16
    //   410: iload #16
    //   412: aload #4
    //   414: arraylength
    //   415: if_icmpge -> 454
    //   418: aload #14
    //   420: aload #4
    //   422: iload #16
    //   424: aaload
    //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: ldc ' '
    //   430: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: aload #11
    //   435: ifnull -> 456
    //   438: pop
    //   439: iinc #16, 1
    //   442: aload #11
    //   444: ifnonnull -> 410
    //   447: goto -> 454
    //   450: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   453: athrow
    //   454: aload #14
    //   456: invokevirtual toString : ()Ljava/lang/String;
    //   459: astore #15
    //   461: aload #15
    //   463: aload #11
    //   465: ifnull -> 522
    //   468: invokevirtual isEmpty : ()Z
    //   471: ifne -> 510
    //   474: goto -> 481
    //   477: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   480: athrow
    //   481: aload #15
    //   483: aload #11
    //   485: ifnull -> 541
    //   488: goto -> 495
    //   491: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   494: athrow
    //   495: ldc ' '
    //   497: invokevirtual equals : (Ljava/lang/Object;)Z
    //   500: ifeq -> 529
    //   503: goto -> 510
    //   506: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   509: athrow
    //   510: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   513: iconst_1
    //   514: aaload
    //   515: goto -> 522
    //   518: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   521: athrow
    //   522: astore #15
    //   524: aload #11
    //   526: ifnonnull -> 543
    //   529: aload #14
    //   531: invokevirtual toString : ()Ljava/lang/String;
    //   534: goto -> 541
    //   537: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   540: athrow
    //   541: astore #15
    //   543: aload #15
    //   545: invokevirtual length : ()I
    //   548: istore #16
    //   550: aload #15
    //   552: iconst_0
    //   553: iload #16
    //   555: iconst_1
    //   556: isub
    //   557: invokevirtual substring : (II)Ljava/lang/String;
    //   560: astore #15
    //   562: aload #13
    //   564: iconst_0
    //   565: anewarray java/lang/Object
    //   568: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   571: new java/lang/StringBuilder
    //   574: dup
    //   575: invokespecial <init> : ()V
    //   578: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   581: astore #18
    //   583: aload #18
    //   585: bipush #8
    //   587: aaload
    //   588: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   591: aload #12
    //   593: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   598: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   601: aload #18
    //   603: bipush #7
    //   605: aaload
    //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: invokevirtual toString : ()Ljava/lang/String;
    //   612: aload #12
    //   614: invokeinterface getName : ()Ljava/lang/String;
    //   619: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   622: aload #13
    //   624: iconst_0
    //   625: anewarray java/lang/Object
    //   628: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   631: new java/lang/StringBuilder
    //   634: dup
    //   635: invokespecial <init> : ()V
    //   638: aload #18
    //   640: bipush #13
    //   642: aaload
    //   643: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: aload #12
    //   648: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   653: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   656: aload #18
    //   658: iconst_0
    //   659: aaload
    //   660: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   663: invokevirtual toString : ()Ljava/lang/String;
    //   666: aload #12
    //   668: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   673: invokevirtual toString : ()Ljava/lang/String;
    //   676: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   679: aload #13
    //   681: iconst_0
    //   682: anewarray java/lang/Object
    //   685: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   688: new java/lang/StringBuilder
    //   691: dup
    //   692: invokespecial <init> : ()V
    //   695: aload #18
    //   697: bipush #13
    //   699: aaload
    //   700: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   703: aload #12
    //   705: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   710: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   713: aload #18
    //   715: bipush #19
    //   717: aaload
    //   718: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   721: invokevirtual toString : ()Ljava/lang/String;
    //   724: invokestatic getInstance : ()Ljava/util/Calendar;
    //   727: invokevirtual getTime : ()Ljava/util/Date;
    //   730: invokevirtual toString : ()Ljava/lang/String;
    //   733: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   736: aload #13
    //   738: iconst_0
    //   739: anewarray java/lang/Object
    //   742: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   745: new java/lang/StringBuilder
    //   748: dup
    //   749: invokespecial <init> : ()V
    //   752: aload #18
    //   754: bipush #13
    //   756: aaload
    //   757: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   760: aload #12
    //   762: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   767: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   770: aload #18
    //   772: iconst_4
    //   773: aaload
    //   774: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: invokevirtual toString : ()Ljava/lang/String;
    //   780: aload #15
    //   782: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   785: aload #13
    //   787: iconst_0
    //   788: anewarray java/lang/Object
    //   791: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   794: new java/lang/StringBuilder
    //   797: dup
    //   798: invokespecial <init> : ()V
    //   801: aload #18
    //   803: bipush #13
    //   805: aaload
    //   806: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   809: aload #12
    //   811: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   816: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   819: aload #18
    //   821: bipush #24
    //   823: aaload
    //   824: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   827: invokevirtual toString : ()Ljava/lang/String;
    //   830: aload_1
    //   831: invokeinterface getName : ()Ljava/lang/String;
    //   836: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   839: aload #13
    //   841: iconst_0
    //   842: anewarray java/lang/Object
    //   845: invokevirtual aegisguard_z : ([Ljava/lang/Object;)V
    //   848: aload #4
    //   850: iconst_1
    //   851: aaload
    //   852: astore #17
    //   854: aload_0
    //   855: aload_1
    //   856: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MI : Ljava/lang/String;
    //   859: aload #18
    //   861: iconst_2
    //   862: aaload
    //   863: aload #17
    //   865: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   868: lload #9
    //   870: iconst_3
    //   871: anewarray java/lang/Object
    //   874: dup_x2
    //   875: dup_x2
    //   876: pop
    //   877: invokestatic valueOf : (J)Ljava/lang/Long;
    //   880: iconst_2
    //   881: swap
    //   882: aastore
    //   883: dup_x1
    //   884: swap
    //   885: iconst_1
    //   886: swap
    //   887: aastore
    //   888: dup_x1
    //   889: swap
    //   890: iconst_0
    //   891: swap
    //   892: aastore
    //   893: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   896: aload #11
    //   898: ifnonnull -> 2198
    //   901: aload #4
    //   903: iconst_0
    //   904: aaload
    //   905: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   908: iconst_3
    //   909: aaload
    //   910: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   913: goto -> 920
    //   916: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   919: athrow
    //   920: aload #11
    //   922: ifnull -> 1454
    //   925: ifeq -> 1434
    //   928: goto -> 935
    //   931: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   934: athrow
    //   935: new me/frep/aegisguard/spigot/aegisguard_hi
    //   938: dup
    //   939: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   942: astore #18
    //   944: aload #18
    //   946: bipush #9
    //   948: aaload
    //   949: invokespecial <init> : (Ljava/lang/String;)V
    //   952: astore #12
    //   954: aload #11
    //   956: ifnull -> 1058
    //   959: aload #12
    //   961: iconst_0
    //   962: anewarray java/lang/Object
    //   965: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   968: ifnull -> 1018
    //   971: goto -> 978
    //   974: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   977: athrow
    //   978: aload #12
    //   980: iconst_0
    //   981: anewarray java/lang/Object
    //   984: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   987: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   990: bipush #17
    //   992: aaload
    //   993: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   996: aload #11
    //   998: ifnull -> 1082
    //   1001: goto -> 1008
    //   1004: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1007: athrow
    //   1008: ifnonnull -> 1060
    //   1011: goto -> 1018
    //   1014: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1017: athrow
    //   1018: aload_0
    //   1019: aload_1
    //   1020: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yv : Ljava/lang/String;
    //   1023: lload #9
    //   1025: iconst_3
    //   1026: anewarray java/lang/Object
    //   1029: dup_x2
    //   1030: dup_x2
    //   1031: pop
    //   1032: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1035: iconst_2
    //   1036: swap
    //   1037: aastore
    //   1038: dup_x1
    //   1039: swap
    //   1040: iconst_1
    //   1041: swap
    //   1042: aastore
    //   1043: dup_x1
    //   1044: swap
    //   1045: iconst_0
    //   1046: swap
    //   1047: aastore
    //   1048: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   1051: goto -> 1058
    //   1054: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1057: athrow
    //   1058: iconst_1
    //   1059: ireturn
    //   1060: aload #12
    //   1062: iconst_0
    //   1063: anewarray java/lang/Object
    //   1066: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1069: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1072: astore #18
    //   1074: aload #18
    //   1076: bipush #18
    //   1078: aaload
    //   1079: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   1082: iconst_0
    //   1083: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   1088: astore #13
    //   1090: aload #13
    //   1092: invokeinterface isEmpty : ()Z
    //   1097: aload #11
    //   1099: ifnull -> 1153
    //   1102: ifeq -> 1154
    //   1105: goto -> 1112
    //   1108: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1111: athrow
    //   1112: aload_0
    //   1113: aload_1
    //   1114: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yv : Ljava/lang/String;
    //   1117: lload #9
    //   1119: iconst_3
    //   1120: anewarray java/lang/Object
    //   1123: dup_x2
    //   1124: dup_x2
    //   1125: pop
    //   1126: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1129: iconst_2
    //   1130: swap
    //   1131: aastore
    //   1132: dup_x1
    //   1133: swap
    //   1134: iconst_1
    //   1135: swap
    //   1136: aastore
    //   1137: dup_x1
    //   1138: swap
    //   1139: iconst_0
    //   1140: swap
    //   1141: aastore
    //   1142: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   1145: iconst_1
    //   1146: goto -> 1153
    //   1149: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1152: athrow
    //   1153: ireturn
    //   1154: new java/util/ArrayList
    //   1157: dup
    //   1158: invokespecial <init> : ()V
    //   1161: astore #14
    //   1163: aload #13
    //   1165: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1170: astore #15
    //   1172: aload #15
    //   1174: invokeinterface hasNext : ()Z
    //   1179: ifeq -> 1271
    //   1182: aload #15
    //   1184: invokeinterface next : ()Ljava/lang/Object;
    //   1189: checkcast java/lang/String
    //   1192: astore #16
    //   1194: aload #12
    //   1196: iconst_0
    //   1197: anewarray java/lang/Object
    //   1200: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1203: new java/lang/StringBuilder
    //   1206: dup
    //   1207: invokespecial <init> : ()V
    //   1210: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1213: astore #18
    //   1215: aload #18
    //   1217: bipush #13
    //   1219: aaload
    //   1220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1223: aload #16
    //   1225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1228: aload #18
    //   1230: bipush #15
    //   1232: aaload
    //   1233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1236: invokevirtual toString : ()Ljava/lang/String;
    //   1239: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1242: astore #17
    //   1244: aload #14
    //   1246: aload #17
    //   1248: invokeinterface add : (Ljava/lang/Object;)Z
    //   1253: pop
    //   1254: aload #11
    //   1256: ifnull -> 1304
    //   1259: aload #11
    //   1261: ifnonnull -> 1172
    //   1264: goto -> 1271
    //   1267: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1270: athrow
    //   1271: aload_0
    //   1272: aload_1
    //   1273: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dz : Ljava/lang/String;
    //   1276: lload #9
    //   1278: iconst_3
    //   1279: anewarray java/lang/Object
    //   1282: dup_x2
    //   1283: dup_x2
    //   1284: pop
    //   1285: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1288: iconst_2
    //   1289: swap
    //   1290: aastore
    //   1291: dup_x1
    //   1292: swap
    //   1293: iconst_1
    //   1294: swap
    //   1295: aastore
    //   1296: dup_x1
    //   1297: swap
    //   1298: iconst_0
    //   1299: swap
    //   1300: aastore
    //   1301: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   1304: aload #14
    //   1306: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1311: astore #15
    //   1313: aload #15
    //   1315: invokeinterface hasNext : ()Z
    //   1320: ifeq -> 1396
    //   1323: aload #15
    //   1325: invokeinterface next : ()Ljava/lang/Object;
    //   1330: checkcast java/lang/String
    //   1333: astore #16
    //   1335: aload_0
    //   1336: aload_1
    //   1337: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gr : Ljava/lang/String;
    //   1340: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1343: bipush #11
    //   1345: aaload
    //   1346: aload #16
    //   1348: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1351: lload #9
    //   1353: iconst_3
    //   1354: anewarray java/lang/Object
    //   1357: dup_x2
    //   1358: dup_x2
    //   1359: pop
    //   1360: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1363: iconst_2
    //   1364: swap
    //   1365: aastore
    //   1366: dup_x1
    //   1367: swap
    //   1368: iconst_1
    //   1369: swap
    //   1370: aastore
    //   1371: dup_x1
    //   1372: swap
    //   1373: iconst_0
    //   1374: swap
    //   1375: aastore
    //   1376: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   1379: aload #11
    //   1381: ifnull -> 1429
    //   1384: aload #11
    //   1386: ifnonnull -> 1313
    //   1389: goto -> 1396
    //   1392: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1395: athrow
    //   1396: aload_0
    //   1397: aload_1
    //   1398: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dz : Ljava/lang/String;
    //   1401: lload #9
    //   1403: iconst_3
    //   1404: anewarray java/lang/Object
    //   1407: dup_x2
    //   1408: dup_x2
    //   1409: pop
    //   1410: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1413: iconst_2
    //   1414: swap
    //   1415: aastore
    //   1416: dup_x1
    //   1417: swap
    //   1418: iconst_1
    //   1419: swap
    //   1420: aastore
    //   1421: dup_x1
    //   1422: swap
    //   1423: iconst_0
    //   1424: swap
    //   1425: aastore
    //   1426: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   1429: aload #11
    //   1431: ifnonnull -> 2198
    //   1434: aload #4
    //   1436: iconst_0
    //   1437: aaload
    //   1438: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1441: bipush #20
    //   1443: aaload
    //   1444: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1447: goto -> 1454
    //   1450: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1453: athrow
    //   1454: aload #11
    //   1456: ifnull -> 2197
    //   1459: ifeq -> 2156
    //   1462: goto -> 1469
    //   1465: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1468: athrow
    //   1469: aload #4
    //   1471: aload #11
    //   1473: ifnull -> 1536
    //   1476: goto -> 1483
    //   1479: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1482: athrow
    //   1483: arraylength
    //   1484: iconst_1
    //   1485: if_icmpne -> 1534
    //   1488: goto -> 1495
    //   1491: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1494: athrow
    //   1495: aload_0
    //   1496: aload_1
    //   1497: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dD : Ljava/lang/String;
    //   1500: lload #9
    //   1502: iconst_3
    //   1503: anewarray java/lang/Object
    //   1506: dup_x2
    //   1507: dup_x2
    //   1508: pop
    //   1509: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1512: iconst_2
    //   1513: swap
    //   1514: aastore
    //   1515: dup_x1
    //   1516: swap
    //   1517: iconst_1
    //   1518: swap
    //   1519: aastore
    //   1520: dup_x1
    //   1521: swap
    //   1522: iconst_0
    //   1523: swap
    //   1524: aastore
    //   1525: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   1528: iconst_1
    //   1529: ireturn
    //   1530: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1533: athrow
    //   1534: aload #4
    //   1536: iconst_1
    //   1537: aaload
    //   1538: astore #12
    //   1540: aload #12
    //   1542: invokestatic getOfflinePlayer : (Ljava/lang/String;)Lorg/bukkit/OfflinePlayer;
    //   1545: astore #13
    //   1547: aload #13
    //   1549: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   1554: astore #14
    //   1556: new me/frep/aegisguard/spigot/aegisguard_hi
    //   1559: dup
    //   1560: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1563: astore #18
    //   1565: aload #18
    //   1567: bipush #9
    //   1569: aaload
    //   1570: invokespecial <init> : (Ljava/lang/String;)V
    //   1573: astore #15
    //   1575: aload #11
    //   1577: ifnull -> 1679
    //   1580: aload #15
    //   1582: iconst_0
    //   1583: anewarray java/lang/Object
    //   1586: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1589: ifnull -> 1639
    //   1592: goto -> 1599
    //   1595: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1598: athrow
    //   1599: aload #15
    //   1601: iconst_0
    //   1602: anewarray java/lang/Object
    //   1605: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1608: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1611: bipush #18
    //   1613: aaload
    //   1614: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   1617: aload #11
    //   1619: ifnull -> 1703
    //   1622: goto -> 1629
    //   1625: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1628: athrow
    //   1629: ifnonnull -> 1681
    //   1632: goto -> 1639
    //   1635: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1638: athrow
    //   1639: aload_0
    //   1640: aload_1
    //   1641: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yv : Ljava/lang/String;
    //   1644: lload #9
    //   1646: iconst_3
    //   1647: anewarray java/lang/Object
    //   1650: dup_x2
    //   1651: dup_x2
    //   1652: pop
    //   1653: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1656: iconst_2
    //   1657: swap
    //   1658: aastore
    //   1659: dup_x1
    //   1660: swap
    //   1661: iconst_1
    //   1662: swap
    //   1663: aastore
    //   1664: dup_x1
    //   1665: swap
    //   1666: iconst_0
    //   1667: swap
    //   1668: aastore
    //   1669: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   1672: goto -> 1679
    //   1675: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1678: athrow
    //   1679: iconst_1
    //   1680: ireturn
    //   1681: aload #15
    //   1683: iconst_0
    //   1684: anewarray java/lang/Object
    //   1687: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1690: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1693: astore #18
    //   1695: aload #18
    //   1697: bipush #18
    //   1699: aaload
    //   1700: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   1703: iconst_0
    //   1704: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   1709: astore #16
    //   1711: aload #14
    //   1713: invokevirtual toString : ()Ljava/lang/String;
    //   1716: astore #17
    //   1718: aload #16
    //   1720: aload #17
    //   1722: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1727: aload #11
    //   1729: ifnull -> 2150
    //   1732: ifeq -> 2109
    //   1735: goto -> 1742
    //   1738: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1741: athrow
    //   1742: aload #15
    //   1744: iconst_0
    //   1745: anewarray java/lang/Object
    //   1748: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1751: new java/lang/StringBuilder
    //   1754: dup
    //   1755: invokespecial <init> : ()V
    //   1758: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1761: bipush #13
    //   1763: aaload
    //   1764: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1767: aload #17
    //   1769: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1772: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1775: bipush #15
    //   1777: aaload
    //   1778: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1781: invokevirtual toString : ()Ljava/lang/String;
    //   1784: aconst_null
    //   1785: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1788: aload #15
    //   1790: iconst_0
    //   1791: anewarray java/lang/Object
    //   1794: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1797: new java/lang/StringBuilder
    //   1800: dup
    //   1801: invokespecial <init> : ()V
    //   1804: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1807: bipush #13
    //   1809: aaload
    //   1810: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1813: aload #17
    //   1815: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1818: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1821: bipush #25
    //   1823: aaload
    //   1824: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1827: invokevirtual toString : ()Ljava/lang/String;
    //   1830: aconst_null
    //   1831: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1834: aload #15
    //   1836: iconst_0
    //   1837: anewarray java/lang/Object
    //   1840: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1843: new java/lang/StringBuilder
    //   1846: dup
    //   1847: invokespecial <init> : ()V
    //   1850: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1853: bipush #13
    //   1855: aaload
    //   1856: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1859: aload #17
    //   1861: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1864: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1867: bipush #22
    //   1869: aaload
    //   1870: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1873: invokevirtual toString : ()Ljava/lang/String;
    //   1876: aconst_null
    //   1877: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1880: aload #15
    //   1882: iconst_0
    //   1883: anewarray java/lang/Object
    //   1886: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1889: new java/lang/StringBuilder
    //   1892: dup
    //   1893: invokespecial <init> : ()V
    //   1896: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1899: bipush #13
    //   1901: aaload
    //   1902: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1905: aload #17
    //   1907: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1910: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1913: bipush #21
    //   1915: aaload
    //   1916: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1919: invokevirtual toString : ()Ljava/lang/String;
    //   1922: aconst_null
    //   1923: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1926: aload #15
    //   1928: iconst_0
    //   1929: anewarray java/lang/Object
    //   1932: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1935: new java/lang/StringBuilder
    //   1938: dup
    //   1939: invokespecial <init> : ()V
    //   1942: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1945: bipush #13
    //   1947: aaload
    //   1948: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1951: aload #17
    //   1953: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1956: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1959: bipush #6
    //   1961: aaload
    //   1962: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1965: invokevirtual toString : ()Ljava/lang/String;
    //   1968: aconst_null
    //   1969: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1972: aload #15
    //   1974: iconst_0
    //   1975: anewarray java/lang/Object
    //   1978: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   1981: new java/lang/StringBuilder
    //   1984: dup
    //   1985: invokespecial <init> : ()V
    //   1988: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   1991: bipush #13
    //   1993: aaload
    //   1994: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1997: aload #17
    //   1999: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2002: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   2005: bipush #12
    //   2007: aaload
    //   2008: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2011: invokevirtual toString : ()Ljava/lang/String;
    //   2014: aconst_null
    //   2015: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2018: aload #15
    //   2020: iconst_0
    //   2021: anewarray java/lang/Object
    //   2024: invokevirtual aegisguard_i : ([Ljava/lang/Object;)Lorg/bukkit/configuration/file/FileConfiguration;
    //   2027: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   2030: bipush #18
    //   2032: aaload
    //   2033: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   2036: aload #17
    //   2038: aconst_null
    //   2039: invokeinterface set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2044: aload #15
    //   2046: iconst_0
    //   2047: anewarray java/lang/Object
    //   2050: invokevirtual aegisguard_z : ([Ljava/lang/Object;)V
    //   2053: aload_0
    //   2054: aload_1
    //   2055: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L4 : Ljava/lang/String;
    //   2058: getstatic me/frep/aegisguard/spigot/aegisguard_z.d : [Ljava/lang/String;
    //   2061: bipush #23
    //   2063: aaload
    //   2064: aload #12
    //   2066: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2069: lload #9
    //   2071: iconst_3
    //   2072: anewarray java/lang/Object
    //   2075: dup_x2
    //   2076: dup_x2
    //   2077: pop
    //   2078: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2081: iconst_2
    //   2082: swap
    //   2083: aastore
    //   2084: dup_x1
    //   2085: swap
    //   2086: iconst_1
    //   2087: swap
    //   2088: aastore
    //   2089: dup_x1
    //   2090: swap
    //   2091: iconst_0
    //   2092: swap
    //   2093: aastore
    //   2094: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   2097: aload #11
    //   2099: ifnonnull -> 2151
    //   2102: goto -> 2109
    //   2105: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2108: athrow
    //   2109: aload_0
    //   2110: aload_1
    //   2111: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   2114: lload #9
    //   2116: iconst_3
    //   2117: anewarray java/lang/Object
    //   2120: dup_x2
    //   2121: dup_x2
    //   2122: pop
    //   2123: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2126: iconst_2
    //   2127: swap
    //   2128: aastore
    //   2129: dup_x1
    //   2130: swap
    //   2131: iconst_1
    //   2132: swap
    //   2133: aastore
    //   2134: dup_x1
    //   2135: swap
    //   2136: iconst_0
    //   2137: swap
    //   2138: aastore
    //   2139: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   2142: iconst_1
    //   2143: goto -> 2150
    //   2146: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2149: athrow
    //   2150: ireturn
    //   2151: aload #11
    //   2153: ifnonnull -> 2198
    //   2156: aload_0
    //   2157: aload_1
    //   2158: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gn : Ljava/lang/String;
    //   2161: lload #9
    //   2163: iconst_3
    //   2164: anewarray java/lang/Object
    //   2167: dup_x2
    //   2168: dup_x2
    //   2169: pop
    //   2170: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2173: iconst_2
    //   2174: swap
    //   2175: aastore
    //   2176: dup_x1
    //   2177: swap
    //   2178: iconst_1
    //   2179: swap
    //   2180: aastore
    //   2181: dup_x1
    //   2182: swap
    //   2183: iconst_0
    //   2184: swap
    //   2185: aastore
    //   2186: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   2189: iconst_1
    //   2190: goto -> 2197
    //   2193: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2196: athrow
    //   2197: ireturn
    //   2198: iconst_1
    //   2199: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #18	-> 31
    //   #19	-> 58
    //   #20	-> 91
    //   #22	-> 97
    //   #23	-> 115
    //   #24	-> 148
    //   #26	-> 154
    //   #27	-> 185
    //   #28	-> 225
    //   #29	-> 258
    //   #31	-> 264
    //   #32	-> 271
    //   #33	-> 273
    //   #34	-> 305
    //   #35	-> 331
    //   #36	-> 364
    //   #38	-> 370
    //   #39	-> 379
    //   #41	-> 398
    //   #44	-> 407
    //   #45	-> 418
    //   #44	-> 439
    //   #48	-> 454
    //   #50	-> 461
    //   #51	-> 510
    //   #53	-> 529
    //   #56	-> 543
    //   #57	-> 550
    //   #59	-> 562
    //   #60	-> 622
    //   #61	-> 679
    //   #62	-> 736
    //   #63	-> 785
    //   #65	-> 839
    //   #66	-> 848
    //   #67	-> 854
    //   #68	-> 896
    //   #69	-> 901
    //   #70	-> 935
    //   #72	-> 954
    //   #73	-> 1018
    //   #74	-> 1058
    //   #77	-> 1060
    //   #79	-> 1090
    //   #80	-> 1112
    //   #81	-> 1145
    //   #83	-> 1154
    //   #85	-> 1163
    //   #86	-> 1194
    //   #87	-> 1244
    //   #88	-> 1254
    //   #90	-> 1271
    //   #92	-> 1304
    //   #93	-> 1335
    //   #94	-> 1379
    //   #96	-> 1396
    //   #98	-> 1429
    //   #99	-> 1469
    //   #100	-> 1495
    //   #101	-> 1528
    //   #103	-> 1534
    //   #105	-> 1540
    //   #107	-> 1547
    //   #109	-> 1556
    //   #111	-> 1575
    //   #112	-> 1639
    //   #113	-> 1679
    //   #116	-> 1681
    //   #118	-> 1711
    //   #120	-> 1718
    //   #121	-> 1742
    //   #122	-> 1788
    //   #123	-> 1834
    //   #124	-> 1880
    //   #125	-> 1926
    //   #126	-> 1972
    //   #127	-> 2018
    //   #128	-> 2044
    //   #129	-> 2053
    //   #131	-> 2109
    //   #132	-> 2142
    //   #134	-> 2151
    //   #136	-> 2156
    //   #137	-> 2189
    //   #139	-> 2198
    // Exception table:
    //   from	to	target	type
    //   31	51	54	java/lang/RuntimeException
    //   48	93	93	java/lang/RuntimeException
    //   100	108	111	java/lang/RuntimeException
    //   105	150	150	java/lang/RuntimeException
    //   170	178	181	java/lang/RuntimeException
    //   175	208	211	java/lang/RuntimeException
    //   185	218	221	java/lang/RuntimeException
    //   215	260	260	java/lang/RuntimeException
    //   290	298	301	java/lang/RuntimeException
    //   295	312	315	java/lang/RuntimeException
    //   305	324	327	java/lang/RuntimeException
    //   319	366	366	java/lang/RuntimeException
    //   418	447	450	java/lang/RuntimeException
    //   461	474	477	java/lang/RuntimeException
    //   468	488	491	java/lang/RuntimeException
    //   481	503	506	java/lang/RuntimeException
    //   495	515	518	java/lang/RuntimeException
    //   524	534	537	java/lang/RuntimeException
    //   854	913	916	java/lang/RuntimeException
    //   920	928	931	java/lang/RuntimeException
    //   954	971	974	java/lang/RuntimeException
    //   959	1001	1004	java/lang/RuntimeException
    //   978	1011	1014	java/lang/RuntimeException
    //   1008	1051	1054	java/lang/RuntimeException
    //   1090	1105	1108	java/lang/RuntimeException
    //   1102	1146	1149	java/lang/RuntimeException
    //   1244	1264	1267	java/lang/RuntimeException
    //   1335	1389	1392	java/lang/RuntimeException
    //   1429	1447	1450	java/lang/RuntimeException
    //   1454	1462	1465	java/lang/RuntimeException
    //   1459	1476	1479	java/lang/RuntimeException
    //   1469	1488	1491	java/lang/RuntimeException
    //   1483	1530	1530	java/lang/RuntimeException
    //   1575	1592	1595	java/lang/RuntimeException
    //   1580	1622	1625	java/lang/RuntimeException
    //   1599	1632	1635	java/lang/RuntimeException
    //   1629	1672	1675	java/lang/RuntimeException
    //   1718	1735	1738	java/lang/RuntimeException
    //   1732	2102	2105	java/lang/RuntimeException
    //   1742	2143	2146	java/lang/RuntimeException
    //   2151	2190	2193	java/lang/RuntimeException
  }
  
  static {
    long l = b ^ 0x6C52E754B1DL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[26];
    boolean bool = false;
    String str;
    int i = (str = " AS%qEC$\030`\033OPjç»,{<VaÏ5\025ê/m-¸\020\021Æ£|aB9é\033hôÎMr°J\b\037¢i/åP¦F\bï#ÆW½\0170\baXë«¥\005r\020¶¸S1!2üôYH¬§Ñ\004X°\b´.8ÔaókÙ\020Pü[\027ôâ\037f«\035\000\005ÅÉç\0206a~®!i\007UO$\026où\020\025Å\024<¿@Uy\\äú,\rëa\b\006\r¸\017\t@Là\bVBNæÈ³â\020Pü[\027ôâ\037f«\035\000\005ÅÉç\0206a~®!i\007UO$\026où\b´.8ÔaókÙ\b\t\000méýæ\020Pü[\027ôâ\037fu\n`ïpÃP\020Pü[\027ôâ\037fu\n`ïpÃP\bVBNæÈ³â\bã3ÙÊ»oþ\020¬ÿËsÚ«í'Û \"úúg~ô\bï#ÆW½\0170\020\021Æ£|aB9é\033hôÎMr°J").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
