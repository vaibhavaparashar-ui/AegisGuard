package me.frep.aegisguard.spigot.AegisGuard_i;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.api.check.Check;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_M;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class aegisguard_i extends aegisguard_M implements CommandExecutor {
  private static String aegisguard_f;
  
  private static final long b = aegisguard_e.a(2293701327398364962L, -2729205099800915754L, MethodHandles.lookup().lookupClass()).a(133306417611863L);
  
  private static final String[] d;
  
  public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_i.b : J
    //   3: ldc2_w 138256406908954
    //   6: lxor
    //   7: lstore #5
    //   9: lload #5
    //   11: dup2
    //   12: ldc2_w 12731700933355
    //   15: lxor
    //   16: lstore #7
    //   18: dup2
    //   19: ldc2_w 92136243535766
    //   22: lxor
    //   23: lstore #9
    //   25: dup2
    //   26: ldc2_w 122861592945297
    //   29: lxor
    //   30: lstore #11
    //   32: dup2
    //   33: ldc2_w 131342015281053
    //   36: lxor
    //   37: lstore #13
    //   39: dup2
    //   40: ldc2_w 93075478912989
    //   43: lxor
    //   44: lstore #15
    //   46: dup2
    //   47: ldc2_w 26983978710351
    //   50: lxor
    //   51: lstore #17
    //   53: dup2
    //   54: ldc2_w 69392512450723
    //   57: lxor
    //   58: lstore #19
    //   60: dup2
    //   61: ldc2_w 47411359404358
    //   64: lxor
    //   65: lstore #21
    //   67: pop2
    //   68: invokestatic aegisguard_V : ()Ljava/lang/String;
    //   71: astore #23
    //   73: aload #4
    //   75: arraylength
    //   76: aload #23
    //   78: ifnull -> 218
    //   81: ifne -> 201
    //   84: goto -> 91
    //   87: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: aload_1
    //   92: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   95: bipush #44
    //   97: aaload
    //   98: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   103: aload #23
    //   105: ifnull -> 200
    //   108: goto -> 115
    //   111: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: ifeq -> 166
    //   118: goto -> 125
    //   121: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Ms : Ljava/util/List;
    //   128: aload_0
    //   129: aload_1
    //   130: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_i;Lorg/bukkit/command/CommandSender;)Ljava/util/function/Consumer;
    //   135: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   140: aload #23
    //   142: ifnonnull -> 14807
    //   145: goto -> 152
    //   148: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   151: athrow
    //   152: iconst_4
    //   153: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   156: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   159: goto -> 166
    //   162: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: aload_0
    //   167: aload_1
    //   168: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   171: lload #13
    //   173: iconst_3
    //   174: anewarray java/lang/Object
    //   177: dup_x2
    //   178: dup_x2
    //   179: pop
    //   180: invokestatic valueOf : (J)Ljava/lang/Long;
    //   183: iconst_2
    //   184: swap
    //   185: aastore
    //   186: dup_x1
    //   187: swap
    //   188: iconst_1
    //   189: swap
    //   190: aastore
    //   191: dup_x1
    //   192: swap
    //   193: iconst_0
    //   194: swap
    //   195: aastore
    //   196: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   199: iconst_1
    //   200: ireturn
    //   201: aload #4
    //   203: iconst_0
    //   204: aaload
    //   205: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   208: astore #116
    //   210: aload #116
    //   212: bipush #83
    //   214: aaload
    //   215: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   218: aload #23
    //   220: ifnull -> 354
    //   223: ifeq -> 337
    //   226: goto -> 233
    //   229: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: aload_1
    //   234: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   237: sipush #177
    //   240: aaload
    //   241: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   246: aload #23
    //   248: ifnull -> 336
    //   251: goto -> 258
    //   254: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   257: athrow
    //   258: ifeq -> 295
    //   261: goto -> 268
    //   264: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Ms : Ljava/util/List;
    //   271: aload_0
    //   272: aload_1
    //   273: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_i;Lorg/bukkit/command/CommandSender;)Ljava/util/function/Consumer;
    //   278: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   283: aload #23
    //   285: ifnonnull -> 14807
    //   288: goto -> 295
    //   291: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   294: athrow
    //   295: aload_0
    //   296: aload_1
    //   297: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   300: lload #13
    //   302: iconst_3
    //   303: anewarray java/lang/Object
    //   306: dup_x2
    //   307: dup_x2
    //   308: pop
    //   309: invokestatic valueOf : (J)Ljava/lang/Long;
    //   312: iconst_2
    //   313: swap
    //   314: aastore
    //   315: dup_x1
    //   316: swap
    //   317: iconst_1
    //   318: swap
    //   319: aastore
    //   320: dup_x1
    //   321: swap
    //   322: iconst_0
    //   323: swap
    //   324: aastore
    //   325: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   328: iconst_1
    //   329: goto -> 336
    //   332: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: ireturn
    //   337: aload #4
    //   339: iconst_0
    //   340: aaload
    //   341: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   344: astore #116
    //   346: aload #116
    //   348: bipush #73
    //   350: aaload
    //   351: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   354: aload #23
    //   356: ifnull -> 5054
    //   359: ifeq -> 5037
    //   362: goto -> 369
    //   365: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   368: athrow
    //   369: aload_1
    //   370: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   373: sipush #128
    //   376: aaload
    //   377: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   382: aload #23
    //   384: ifnull -> 5036
    //   387: goto -> 394
    //   390: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   393: athrow
    //   394: ifeq -> 4995
    //   397: goto -> 404
    //   400: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   403: athrow
    //   404: new java/util/HashMap
    //   407: dup
    //   408: invokespecial <init> : ()V
    //   411: astore #24
    //   413: new java/util/HashMap
    //   416: dup
    //   417: invokespecial <init> : ()V
    //   420: astore #25
    //   422: new java/util/HashMap
    //   425: dup
    //   426: invokespecial <init> : ()V
    //   429: astore #26
    //   431: new java/util/HashMap
    //   434: dup
    //   435: invokespecial <init> : ()V
    //   438: astore #27
    //   440: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   443: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   446: iconst_0
    //   447: anewarray java/lang/Object
    //   450: invokevirtual aegisguard_k : ([Ljava/lang/Object;)Ljava/util/Collection;
    //   453: invokeinterface iterator : ()Ljava/util/Iterator;
    //   458: astore #28
    //   460: aload #28
    //   462: invokeinterface hasNext : ()Z
    //   467: ifeq -> 619
    //   470: aload #28
    //   472: invokeinterface next : ()Ljava/lang/Object;
    //   477: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   480: astore #29
    //   482: aload #24
    //   484: aload #29
    //   486: iconst_0
    //   487: anewarray java/lang/Object
    //   490: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   493: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   498: aload #29
    //   500: invokevirtual getTotalViolations : ()I
    //   503: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   506: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   511: pop
    //   512: aload #25
    //   514: aload #29
    //   516: iconst_0
    //   517: anewarray java/lang/Object
    //   520: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   523: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   528: aload #29
    //   530: invokevirtual getCombatViolations : ()I
    //   533: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   536: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   541: pop
    //   542: aload #26
    //   544: aload #29
    //   546: iconst_0
    //   547: anewarray java/lang/Object
    //   550: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   553: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   558: aload #29
    //   560: invokevirtual getMovementViolations : ()I
    //   563: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   566: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   571: pop
    //   572: aload #27
    //   574: aload #29
    //   576: iconst_0
    //   577: anewarray java/lang/Object
    //   580: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   583: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   588: aload #29
    //   590: invokevirtual getPlayerViolations : ()I
    //   593: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   596: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   601: pop
    //   602: aload #23
    //   604: ifnull -> 14807
    //   607: aload #23
    //   609: ifnonnull -> 460
    //   612: goto -> 619
    //   615: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   618: athrow
    //   619: aload #24
    //   621: invokeinterface entrySet : ()Ljava/util/Set;
    //   626: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   631: invokestatic comparingByValue : ()Ljava/util/Comparator;
    //   634: invokestatic reverseOrder : (Ljava/util/Comparator;)Ljava/util/Comparator;
    //   637: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
    //   642: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   647: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   652: <illegal opcode> apply : ()Ljava/util/function/BinaryOperator;
    //   657: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   662: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BinaryOperator;Ljava/util/function/Supplier;)Ljava/util/stream/Collector;
    //   665: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   670: checkcast java/util/Map
    //   673: astore #28
    //   675: aload #25
    //   677: invokeinterface entrySet : ()Ljava/util/Set;
    //   682: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   687: invokestatic comparingByValue : ()Ljava/util/Comparator;
    //   690: invokestatic reverseOrder : (Ljava/util/Comparator;)Ljava/util/Comparator;
    //   693: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
    //   698: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   703: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   708: <illegal opcode> apply : ()Ljava/util/function/BinaryOperator;
    //   713: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   718: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BinaryOperator;Ljava/util/function/Supplier;)Ljava/util/stream/Collector;
    //   721: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   726: checkcast java/util/Map
    //   729: astore #29
    //   731: aload #26
    //   733: invokeinterface entrySet : ()Ljava/util/Set;
    //   738: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   743: invokestatic comparingByValue : ()Ljava/util/Comparator;
    //   746: invokestatic reverseOrder : (Ljava/util/Comparator;)Ljava/util/Comparator;
    //   749: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
    //   754: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   759: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   764: <illegal opcode> apply : ()Ljava/util/function/BinaryOperator;
    //   769: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   774: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BinaryOperator;Ljava/util/function/Supplier;)Ljava/util/stream/Collector;
    //   777: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   782: checkcast java/util/Map
    //   785: astore #30
    //   787: aload #27
    //   789: invokeinterface entrySet : ()Ljava/util/Set;
    //   794: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   799: invokestatic comparingByValue : ()Ljava/util/Comparator;
    //   802: invokestatic reverseOrder : (Ljava/util/Comparator;)Ljava/util/Comparator;
    //   805: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
    //   810: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   815: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   820: <illegal opcode> apply : ()Ljava/util/function/BinaryOperator;
    //   825: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   830: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BinaryOperator;Ljava/util/function/Supplier;)Ljava/util/stream/Collector;
    //   833: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   838: checkcast java/util/Map
    //   841: astore #31
    //   843: aload #28
    //   845: invokeinterface keySet : ()Ljava/util/Set;
    //   850: invokeinterface toArray : ()[Ljava/lang/Object;
    //   855: astore #32
    //   857: aload #29
    //   859: invokeinterface keySet : ()Ljava/util/Set;
    //   864: invokeinterface toArray : ()[Ljava/lang/Object;
    //   869: astore #33
    //   871: aload #30
    //   873: invokeinterface keySet : ()Ljava/util/Set;
    //   878: invokeinterface toArray : ()[Ljava/lang/Object;
    //   883: astore #34
    //   885: aload #31
    //   887: invokeinterface keySet : ()Ljava/util/Set;
    //   892: invokeinterface toArray : ()[Ljava/lang/Object;
    //   897: astore #35
    //   899: aconst_null
    //   900: astore #36
    //   902: aload #32
    //   904: aload #23
    //   906: ifnull -> 931
    //   909: arraylength
    //   910: ifle -> 991
    //   913: goto -> 920
    //   916: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   919: athrow
    //   920: aload #32
    //   922: iconst_0
    //   923: aaload
    //   924: goto -> 931
    //   927: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   930: athrow
    //   931: aload #23
    //   933: ifnull -> 957
    //   936: ifnull -> 991
    //   939: goto -> 946
    //   942: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   945: athrow
    //   946: aload #32
    //   948: iconst_0
    //   949: aaload
    //   950: goto -> 957
    //   953: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   956: athrow
    //   957: aload #23
    //   959: ifnull -> 986
    //   962: instanceof java/util/UUID
    //   965: ifeq -> 991
    //   968: goto -> 975
    //   971: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   974: athrow
    //   975: aload #32
    //   977: iconst_0
    //   978: aaload
    //   979: goto -> 986
    //   982: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   985: athrow
    //   986: checkcast java/util/UUID
    //   989: astore #36
    //   991: aconst_null
    //   992: astore #37
    //   994: aload #32
    //   996: aload #23
    //   998: ifnull -> 1024
    //   1001: arraylength
    //   1002: iconst_1
    //   1003: if_icmple -> 1084
    //   1006: goto -> 1013
    //   1009: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1012: athrow
    //   1013: aload #32
    //   1015: iconst_1
    //   1016: aaload
    //   1017: goto -> 1024
    //   1020: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1023: athrow
    //   1024: aload #23
    //   1026: ifnull -> 1050
    //   1029: ifnull -> 1084
    //   1032: goto -> 1039
    //   1035: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1038: athrow
    //   1039: aload #32
    //   1041: iconst_1
    //   1042: aaload
    //   1043: goto -> 1050
    //   1046: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1049: athrow
    //   1050: aload #23
    //   1052: ifnull -> 1079
    //   1055: instanceof java/util/UUID
    //   1058: ifeq -> 1084
    //   1061: goto -> 1068
    //   1064: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1067: athrow
    //   1068: aload #32
    //   1070: iconst_1
    //   1071: aaload
    //   1072: goto -> 1079
    //   1075: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1078: athrow
    //   1079: checkcast java/util/UUID
    //   1082: astore #37
    //   1084: aconst_null
    //   1085: astore #38
    //   1087: aload #32
    //   1089: aload #23
    //   1091: ifnull -> 1117
    //   1094: arraylength
    //   1095: iconst_2
    //   1096: if_icmple -> 1177
    //   1099: goto -> 1106
    //   1102: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1105: athrow
    //   1106: aload #32
    //   1108: iconst_2
    //   1109: aaload
    //   1110: goto -> 1117
    //   1113: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1116: athrow
    //   1117: aload #23
    //   1119: ifnull -> 1143
    //   1122: ifnull -> 1177
    //   1125: goto -> 1132
    //   1128: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1131: athrow
    //   1132: aload #32
    //   1134: iconst_2
    //   1135: aaload
    //   1136: goto -> 1143
    //   1139: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1142: athrow
    //   1143: aload #23
    //   1145: ifnull -> 1172
    //   1148: instanceof java/util/UUID
    //   1151: ifeq -> 1177
    //   1154: goto -> 1161
    //   1157: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1160: athrow
    //   1161: aload #32
    //   1163: iconst_2
    //   1164: aaload
    //   1165: goto -> 1172
    //   1168: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1171: athrow
    //   1172: checkcast java/util/UUID
    //   1175: astore #38
    //   1177: aconst_null
    //   1178: astore #39
    //   1180: aload #32
    //   1182: aload #23
    //   1184: ifnull -> 1210
    //   1187: arraylength
    //   1188: iconst_3
    //   1189: if_icmple -> 1270
    //   1192: goto -> 1199
    //   1195: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1198: athrow
    //   1199: aload #32
    //   1201: iconst_3
    //   1202: aaload
    //   1203: goto -> 1210
    //   1206: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1209: athrow
    //   1210: aload #23
    //   1212: ifnull -> 1236
    //   1215: ifnull -> 1270
    //   1218: goto -> 1225
    //   1221: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1224: athrow
    //   1225: aload #32
    //   1227: iconst_3
    //   1228: aaload
    //   1229: goto -> 1236
    //   1232: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1235: athrow
    //   1236: aload #23
    //   1238: ifnull -> 1265
    //   1241: instanceof java/util/UUID
    //   1244: ifeq -> 1270
    //   1247: goto -> 1254
    //   1250: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1253: athrow
    //   1254: aload #32
    //   1256: iconst_3
    //   1257: aaload
    //   1258: goto -> 1265
    //   1261: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1264: athrow
    //   1265: checkcast java/util/UUID
    //   1268: astore #39
    //   1270: aconst_null
    //   1271: astore #40
    //   1273: aload #32
    //   1275: aload #23
    //   1277: ifnull -> 1303
    //   1280: arraylength
    //   1281: iconst_4
    //   1282: if_icmple -> 1363
    //   1285: goto -> 1292
    //   1288: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1291: athrow
    //   1292: aload #32
    //   1294: iconst_4
    //   1295: aaload
    //   1296: goto -> 1303
    //   1299: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1302: athrow
    //   1303: aload #23
    //   1305: ifnull -> 1329
    //   1308: ifnull -> 1363
    //   1311: goto -> 1318
    //   1314: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1317: athrow
    //   1318: aload #32
    //   1320: iconst_4
    //   1321: aaload
    //   1322: goto -> 1329
    //   1325: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1328: athrow
    //   1329: aload #23
    //   1331: ifnull -> 1358
    //   1334: instanceof java/util/UUID
    //   1337: ifeq -> 1363
    //   1340: goto -> 1347
    //   1343: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1346: athrow
    //   1347: aload #32
    //   1349: iconst_4
    //   1350: aaload
    //   1351: goto -> 1358
    //   1354: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1357: athrow
    //   1358: checkcast java/util/UUID
    //   1361: astore #40
    //   1363: aconst_null
    //   1364: astore #41
    //   1366: aload #36
    //   1368: aload #23
    //   1370: ifnull -> 1385
    //   1373: ifnull -> 1390
    //   1376: goto -> 1383
    //   1379: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1382: athrow
    //   1383: aload #36
    //   1385: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   1388: astore #41
    //   1390: aconst_null
    //   1391: astore #42
    //   1393: aload #37
    //   1395: aload #23
    //   1397: ifnull -> 1412
    //   1400: ifnull -> 1417
    //   1403: goto -> 1410
    //   1406: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1409: athrow
    //   1410: aload #37
    //   1412: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   1415: astore #42
    //   1417: aconst_null
    //   1418: astore #43
    //   1420: aload #38
    //   1422: aload #23
    //   1424: ifnull -> 1439
    //   1427: ifnull -> 1444
    //   1430: goto -> 1437
    //   1433: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1436: athrow
    //   1437: aload #38
    //   1439: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   1442: astore #43
    //   1444: aconst_null
    //   1445: astore #44
    //   1447: aload #39
    //   1449: aload #23
    //   1451: ifnull -> 1466
    //   1454: ifnull -> 1471
    //   1457: goto -> 1464
    //   1460: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1463: athrow
    //   1464: aload #39
    //   1466: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   1469: astore #44
    //   1471: aconst_null
    //   1472: astore #45
    //   1474: aload #40
    //   1476: aload #23
    //   1478: ifnull -> 1493
    //   1481: ifnull -> 1498
    //   1484: goto -> 1491
    //   1487: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1490: athrow
    //   1491: aload #40
    //   1493: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   1496: astore #45
    //   1498: aconst_null
    //   1499: astore #46
    //   1501: aload #33
    //   1503: aload #23
    //   1505: ifnull -> 1530
    //   1508: arraylength
    //   1509: ifle -> 1590
    //   1512: goto -> 1519
    //   1515: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1518: athrow
    //   1519: aload #33
    //   1521: iconst_0
    //   1522: aaload
    //   1523: goto -> 1530
    //   1526: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1529: athrow
    //   1530: aload #23
    //   1532: ifnull -> 1556
    //   1535: ifnull -> 1590
    //   1538: goto -> 1545
    //   1541: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1544: athrow
    //   1545: aload #33
    //   1547: iconst_0
    //   1548: aaload
    //   1549: goto -> 1556
    //   1552: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1555: athrow
    //   1556: aload #23
    //   1558: ifnull -> 1585
    //   1561: instanceof java/util/UUID
    //   1564: ifeq -> 1590
    //   1567: goto -> 1574
    //   1570: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1573: athrow
    //   1574: aload #33
    //   1576: iconst_0
    //   1577: aaload
    //   1578: goto -> 1585
    //   1581: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1584: athrow
    //   1585: checkcast java/util/UUID
    //   1588: astore #46
    //   1590: aconst_null
    //   1591: astore #47
    //   1593: aload #33
    //   1595: aload #23
    //   1597: ifnull -> 1623
    //   1600: arraylength
    //   1601: iconst_1
    //   1602: if_icmple -> 1683
    //   1605: goto -> 1612
    //   1608: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1611: athrow
    //   1612: aload #33
    //   1614: iconst_1
    //   1615: aaload
    //   1616: goto -> 1623
    //   1619: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1622: athrow
    //   1623: aload #23
    //   1625: ifnull -> 1649
    //   1628: ifnull -> 1683
    //   1631: goto -> 1638
    //   1634: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1637: athrow
    //   1638: aload #33
    //   1640: iconst_1
    //   1641: aaload
    //   1642: goto -> 1649
    //   1645: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1648: athrow
    //   1649: aload #23
    //   1651: ifnull -> 1678
    //   1654: instanceof java/util/UUID
    //   1657: ifeq -> 1683
    //   1660: goto -> 1667
    //   1663: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1666: athrow
    //   1667: aload #33
    //   1669: iconst_1
    //   1670: aaload
    //   1671: goto -> 1678
    //   1674: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1677: athrow
    //   1678: checkcast java/util/UUID
    //   1681: astore #47
    //   1683: aconst_null
    //   1684: astore #48
    //   1686: aload #33
    //   1688: aload #23
    //   1690: ifnull -> 1716
    //   1693: arraylength
    //   1694: iconst_2
    //   1695: if_icmple -> 1776
    //   1698: goto -> 1705
    //   1701: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1704: athrow
    //   1705: aload #33
    //   1707: iconst_2
    //   1708: aaload
    //   1709: goto -> 1716
    //   1712: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1715: athrow
    //   1716: aload #23
    //   1718: ifnull -> 1742
    //   1721: ifnull -> 1776
    //   1724: goto -> 1731
    //   1727: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1730: athrow
    //   1731: aload #33
    //   1733: iconst_2
    //   1734: aaload
    //   1735: goto -> 1742
    //   1738: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1741: athrow
    //   1742: aload #23
    //   1744: ifnull -> 1771
    //   1747: instanceof java/util/UUID
    //   1750: ifeq -> 1776
    //   1753: goto -> 1760
    //   1756: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1759: athrow
    //   1760: aload #33
    //   1762: iconst_2
    //   1763: aaload
    //   1764: goto -> 1771
    //   1767: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1770: athrow
    //   1771: checkcast java/util/UUID
    //   1774: astore #48
    //   1776: aconst_null
    //   1777: astore #49
    //   1779: aload #33
    //   1781: aload #23
    //   1783: ifnull -> 1809
    //   1786: arraylength
    //   1787: iconst_3
    //   1788: if_icmple -> 1869
    //   1791: goto -> 1798
    //   1794: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1797: athrow
    //   1798: aload #33
    //   1800: iconst_3
    //   1801: aaload
    //   1802: goto -> 1809
    //   1805: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1808: athrow
    //   1809: aload #23
    //   1811: ifnull -> 1835
    //   1814: ifnull -> 1869
    //   1817: goto -> 1824
    //   1820: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1823: athrow
    //   1824: aload #33
    //   1826: iconst_3
    //   1827: aaload
    //   1828: goto -> 1835
    //   1831: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1834: athrow
    //   1835: aload #23
    //   1837: ifnull -> 1864
    //   1840: instanceof java/util/UUID
    //   1843: ifeq -> 1869
    //   1846: goto -> 1853
    //   1849: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1852: athrow
    //   1853: aload #33
    //   1855: iconst_3
    //   1856: aaload
    //   1857: goto -> 1864
    //   1860: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1863: athrow
    //   1864: checkcast java/util/UUID
    //   1867: astore #49
    //   1869: aconst_null
    //   1870: astore #50
    //   1872: aload #33
    //   1874: aload #23
    //   1876: ifnull -> 1902
    //   1879: arraylength
    //   1880: iconst_4
    //   1881: if_icmple -> 1962
    //   1884: goto -> 1891
    //   1887: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1890: athrow
    //   1891: aload #33
    //   1893: iconst_4
    //   1894: aaload
    //   1895: goto -> 1902
    //   1898: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1901: athrow
    //   1902: aload #23
    //   1904: ifnull -> 1928
    //   1907: ifnull -> 1962
    //   1910: goto -> 1917
    //   1913: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1916: athrow
    //   1917: aload #33
    //   1919: iconst_4
    //   1920: aaload
    //   1921: goto -> 1928
    //   1924: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1927: athrow
    //   1928: aload #23
    //   1930: ifnull -> 1957
    //   1933: instanceof java/util/UUID
    //   1936: ifeq -> 1962
    //   1939: goto -> 1946
    //   1942: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1945: athrow
    //   1946: aload #33
    //   1948: iconst_4
    //   1949: aaload
    //   1950: goto -> 1957
    //   1953: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1956: athrow
    //   1957: checkcast java/util/UUID
    //   1960: astore #50
    //   1962: aconst_null
    //   1963: astore #51
    //   1965: aload #46
    //   1967: aload #23
    //   1969: ifnull -> 1984
    //   1972: ifnull -> 1989
    //   1975: goto -> 1982
    //   1978: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1981: athrow
    //   1982: aload #46
    //   1984: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   1987: astore #51
    //   1989: aconst_null
    //   1990: astore #52
    //   1992: aload #47
    //   1994: aload #23
    //   1996: ifnull -> 2011
    //   1999: ifnull -> 2016
    //   2002: goto -> 2009
    //   2005: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2008: athrow
    //   2009: aload #47
    //   2011: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2014: astore #52
    //   2016: aconst_null
    //   2017: astore #53
    //   2019: aload #48
    //   2021: aload #23
    //   2023: ifnull -> 2038
    //   2026: ifnull -> 2043
    //   2029: goto -> 2036
    //   2032: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2035: athrow
    //   2036: aload #48
    //   2038: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2041: astore #53
    //   2043: aconst_null
    //   2044: astore #54
    //   2046: aload #49
    //   2048: aload #23
    //   2050: ifnull -> 2065
    //   2053: ifnull -> 2070
    //   2056: goto -> 2063
    //   2059: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2062: athrow
    //   2063: aload #49
    //   2065: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2068: astore #54
    //   2070: aconst_null
    //   2071: astore #55
    //   2073: aload #50
    //   2075: aload #23
    //   2077: ifnull -> 2092
    //   2080: ifnull -> 2097
    //   2083: goto -> 2090
    //   2086: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2089: athrow
    //   2090: aload #50
    //   2092: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2095: astore #55
    //   2097: aconst_null
    //   2098: astore #56
    //   2100: aload #34
    //   2102: aload #23
    //   2104: ifnull -> 2129
    //   2107: arraylength
    //   2108: ifle -> 2189
    //   2111: goto -> 2118
    //   2114: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2117: athrow
    //   2118: aload #34
    //   2120: iconst_0
    //   2121: aaload
    //   2122: goto -> 2129
    //   2125: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2128: athrow
    //   2129: aload #23
    //   2131: ifnull -> 2155
    //   2134: ifnull -> 2189
    //   2137: goto -> 2144
    //   2140: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2143: athrow
    //   2144: aload #34
    //   2146: iconst_0
    //   2147: aaload
    //   2148: goto -> 2155
    //   2151: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2154: athrow
    //   2155: aload #23
    //   2157: ifnull -> 2184
    //   2160: instanceof java/util/UUID
    //   2163: ifeq -> 2189
    //   2166: goto -> 2173
    //   2169: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2172: athrow
    //   2173: aload #34
    //   2175: iconst_0
    //   2176: aaload
    //   2177: goto -> 2184
    //   2180: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2183: athrow
    //   2184: checkcast java/util/UUID
    //   2187: astore #56
    //   2189: aconst_null
    //   2190: astore #57
    //   2192: aload #34
    //   2194: aload #23
    //   2196: ifnull -> 2222
    //   2199: arraylength
    //   2200: iconst_1
    //   2201: if_icmple -> 2282
    //   2204: goto -> 2211
    //   2207: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2210: athrow
    //   2211: aload #34
    //   2213: iconst_1
    //   2214: aaload
    //   2215: goto -> 2222
    //   2218: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2221: athrow
    //   2222: aload #23
    //   2224: ifnull -> 2248
    //   2227: ifnull -> 2282
    //   2230: goto -> 2237
    //   2233: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2236: athrow
    //   2237: aload #34
    //   2239: iconst_1
    //   2240: aaload
    //   2241: goto -> 2248
    //   2244: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2247: athrow
    //   2248: aload #23
    //   2250: ifnull -> 2277
    //   2253: instanceof java/util/UUID
    //   2256: ifeq -> 2282
    //   2259: goto -> 2266
    //   2262: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2265: athrow
    //   2266: aload #34
    //   2268: iconst_1
    //   2269: aaload
    //   2270: goto -> 2277
    //   2273: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2276: athrow
    //   2277: checkcast java/util/UUID
    //   2280: astore #57
    //   2282: aconst_null
    //   2283: astore #58
    //   2285: aload #34
    //   2287: aload #23
    //   2289: ifnull -> 2315
    //   2292: arraylength
    //   2293: iconst_2
    //   2294: if_icmple -> 2375
    //   2297: goto -> 2304
    //   2300: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2303: athrow
    //   2304: aload #34
    //   2306: iconst_2
    //   2307: aaload
    //   2308: goto -> 2315
    //   2311: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2314: athrow
    //   2315: aload #23
    //   2317: ifnull -> 2341
    //   2320: ifnull -> 2375
    //   2323: goto -> 2330
    //   2326: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2329: athrow
    //   2330: aload #34
    //   2332: iconst_2
    //   2333: aaload
    //   2334: goto -> 2341
    //   2337: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2340: athrow
    //   2341: aload #23
    //   2343: ifnull -> 2370
    //   2346: instanceof java/util/UUID
    //   2349: ifeq -> 2375
    //   2352: goto -> 2359
    //   2355: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2358: athrow
    //   2359: aload #34
    //   2361: iconst_2
    //   2362: aaload
    //   2363: goto -> 2370
    //   2366: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2369: athrow
    //   2370: checkcast java/util/UUID
    //   2373: astore #58
    //   2375: aconst_null
    //   2376: astore #59
    //   2378: aload #34
    //   2380: aload #23
    //   2382: ifnull -> 2408
    //   2385: arraylength
    //   2386: iconst_3
    //   2387: if_icmple -> 2468
    //   2390: goto -> 2397
    //   2393: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2396: athrow
    //   2397: aload #34
    //   2399: iconst_3
    //   2400: aaload
    //   2401: goto -> 2408
    //   2404: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2407: athrow
    //   2408: aload #23
    //   2410: ifnull -> 2434
    //   2413: ifnull -> 2468
    //   2416: goto -> 2423
    //   2419: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2422: athrow
    //   2423: aload #34
    //   2425: iconst_3
    //   2426: aaload
    //   2427: goto -> 2434
    //   2430: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2433: athrow
    //   2434: aload #23
    //   2436: ifnull -> 2463
    //   2439: instanceof java/util/UUID
    //   2442: ifeq -> 2468
    //   2445: goto -> 2452
    //   2448: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2451: athrow
    //   2452: aload #34
    //   2454: iconst_3
    //   2455: aaload
    //   2456: goto -> 2463
    //   2459: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2462: athrow
    //   2463: checkcast java/util/UUID
    //   2466: astore #59
    //   2468: aconst_null
    //   2469: astore #60
    //   2471: aload #34
    //   2473: aload #23
    //   2475: ifnull -> 2501
    //   2478: arraylength
    //   2479: iconst_4
    //   2480: if_icmple -> 2561
    //   2483: goto -> 2490
    //   2486: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2489: athrow
    //   2490: aload #34
    //   2492: iconst_4
    //   2493: aaload
    //   2494: goto -> 2501
    //   2497: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2500: athrow
    //   2501: aload #23
    //   2503: ifnull -> 2527
    //   2506: ifnull -> 2561
    //   2509: goto -> 2516
    //   2512: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2515: athrow
    //   2516: aload #34
    //   2518: iconst_4
    //   2519: aaload
    //   2520: goto -> 2527
    //   2523: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2526: athrow
    //   2527: aload #23
    //   2529: ifnull -> 2556
    //   2532: instanceof java/util/UUID
    //   2535: ifeq -> 2561
    //   2538: goto -> 2545
    //   2541: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2544: athrow
    //   2545: aload #34
    //   2547: iconst_4
    //   2548: aaload
    //   2549: goto -> 2556
    //   2552: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2555: athrow
    //   2556: checkcast java/util/UUID
    //   2559: astore #60
    //   2561: aconst_null
    //   2562: astore #61
    //   2564: aload #56
    //   2566: aload #23
    //   2568: ifnull -> 2583
    //   2571: ifnull -> 2588
    //   2574: goto -> 2581
    //   2577: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2580: athrow
    //   2581: aload #56
    //   2583: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2586: astore #61
    //   2588: aconst_null
    //   2589: astore #62
    //   2591: aload #57
    //   2593: aload #23
    //   2595: ifnull -> 2610
    //   2598: ifnull -> 2615
    //   2601: goto -> 2608
    //   2604: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2607: athrow
    //   2608: aload #57
    //   2610: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2613: astore #62
    //   2615: aconst_null
    //   2616: astore #63
    //   2618: aload #58
    //   2620: aload #23
    //   2622: ifnull -> 2637
    //   2625: ifnull -> 2642
    //   2628: goto -> 2635
    //   2631: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2634: athrow
    //   2635: aload #58
    //   2637: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2640: astore #63
    //   2642: aconst_null
    //   2643: astore #64
    //   2645: aload #59
    //   2647: aload #23
    //   2649: ifnull -> 2664
    //   2652: ifnull -> 2669
    //   2655: goto -> 2662
    //   2658: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2661: athrow
    //   2662: aload #59
    //   2664: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2667: astore #64
    //   2669: aconst_null
    //   2670: astore #65
    //   2672: aload #60
    //   2674: aload #23
    //   2676: ifnull -> 2691
    //   2679: ifnull -> 2696
    //   2682: goto -> 2689
    //   2685: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2688: athrow
    //   2689: aload #60
    //   2691: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   2694: astore #65
    //   2696: aconst_null
    //   2697: astore #66
    //   2699: aload #35
    //   2701: aload #23
    //   2703: ifnull -> 2728
    //   2706: arraylength
    //   2707: ifle -> 2788
    //   2710: goto -> 2717
    //   2713: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2716: athrow
    //   2717: aload #35
    //   2719: iconst_0
    //   2720: aaload
    //   2721: goto -> 2728
    //   2724: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2727: athrow
    //   2728: aload #23
    //   2730: ifnull -> 2754
    //   2733: ifnull -> 2788
    //   2736: goto -> 2743
    //   2739: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2742: athrow
    //   2743: aload #35
    //   2745: iconst_0
    //   2746: aaload
    //   2747: goto -> 2754
    //   2750: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2753: athrow
    //   2754: aload #23
    //   2756: ifnull -> 2783
    //   2759: instanceof java/util/UUID
    //   2762: ifeq -> 2788
    //   2765: goto -> 2772
    //   2768: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2771: athrow
    //   2772: aload #35
    //   2774: iconst_0
    //   2775: aaload
    //   2776: goto -> 2783
    //   2779: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2782: athrow
    //   2783: checkcast java/util/UUID
    //   2786: astore #66
    //   2788: aconst_null
    //   2789: astore #67
    //   2791: aload #35
    //   2793: aload #23
    //   2795: ifnull -> 2821
    //   2798: arraylength
    //   2799: iconst_1
    //   2800: if_icmple -> 2881
    //   2803: goto -> 2810
    //   2806: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2809: athrow
    //   2810: aload #35
    //   2812: iconst_1
    //   2813: aaload
    //   2814: goto -> 2821
    //   2817: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2820: athrow
    //   2821: aload #23
    //   2823: ifnull -> 2847
    //   2826: ifnull -> 2881
    //   2829: goto -> 2836
    //   2832: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2835: athrow
    //   2836: aload #35
    //   2838: iconst_1
    //   2839: aaload
    //   2840: goto -> 2847
    //   2843: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2846: athrow
    //   2847: aload #23
    //   2849: ifnull -> 2876
    //   2852: instanceof java/util/UUID
    //   2855: ifeq -> 2881
    //   2858: goto -> 2865
    //   2861: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2864: athrow
    //   2865: aload #35
    //   2867: iconst_1
    //   2868: aaload
    //   2869: goto -> 2876
    //   2872: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2875: athrow
    //   2876: checkcast java/util/UUID
    //   2879: astore #67
    //   2881: aconst_null
    //   2882: astore #68
    //   2884: aload #35
    //   2886: aload #23
    //   2888: ifnull -> 2914
    //   2891: arraylength
    //   2892: iconst_2
    //   2893: if_icmple -> 2974
    //   2896: goto -> 2903
    //   2899: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2902: athrow
    //   2903: aload #35
    //   2905: iconst_2
    //   2906: aaload
    //   2907: goto -> 2914
    //   2910: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2913: athrow
    //   2914: aload #23
    //   2916: ifnull -> 2940
    //   2919: ifnull -> 2974
    //   2922: goto -> 2929
    //   2925: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2928: athrow
    //   2929: aload #35
    //   2931: iconst_2
    //   2932: aaload
    //   2933: goto -> 2940
    //   2936: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2939: athrow
    //   2940: aload #23
    //   2942: ifnull -> 2969
    //   2945: instanceof java/util/UUID
    //   2948: ifeq -> 2974
    //   2951: goto -> 2958
    //   2954: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2957: athrow
    //   2958: aload #35
    //   2960: iconst_2
    //   2961: aaload
    //   2962: goto -> 2969
    //   2965: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2968: athrow
    //   2969: checkcast java/util/UUID
    //   2972: astore #68
    //   2974: aconst_null
    //   2975: astore #69
    //   2977: aload #35
    //   2979: aload #23
    //   2981: ifnull -> 3007
    //   2984: arraylength
    //   2985: iconst_3
    //   2986: if_icmple -> 3067
    //   2989: goto -> 2996
    //   2992: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2995: athrow
    //   2996: aload #35
    //   2998: iconst_3
    //   2999: aaload
    //   3000: goto -> 3007
    //   3003: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3006: athrow
    //   3007: aload #23
    //   3009: ifnull -> 3033
    //   3012: ifnull -> 3067
    //   3015: goto -> 3022
    //   3018: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3021: athrow
    //   3022: aload #35
    //   3024: iconst_3
    //   3025: aaload
    //   3026: goto -> 3033
    //   3029: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3032: athrow
    //   3033: aload #23
    //   3035: ifnull -> 3062
    //   3038: instanceof java/util/UUID
    //   3041: ifeq -> 3067
    //   3044: goto -> 3051
    //   3047: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3050: athrow
    //   3051: aload #35
    //   3053: iconst_3
    //   3054: aaload
    //   3055: goto -> 3062
    //   3058: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3061: athrow
    //   3062: checkcast java/util/UUID
    //   3065: astore #69
    //   3067: aconst_null
    //   3068: astore #70
    //   3070: aload #35
    //   3072: aload #23
    //   3074: ifnull -> 3100
    //   3077: arraylength
    //   3078: iconst_4
    //   3079: if_icmple -> 3160
    //   3082: goto -> 3089
    //   3085: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3088: athrow
    //   3089: aload #35
    //   3091: iconst_4
    //   3092: aaload
    //   3093: goto -> 3100
    //   3096: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3099: athrow
    //   3100: aload #23
    //   3102: ifnull -> 3126
    //   3105: ifnull -> 3160
    //   3108: goto -> 3115
    //   3111: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3114: athrow
    //   3115: aload #35
    //   3117: iconst_4
    //   3118: aaload
    //   3119: goto -> 3126
    //   3122: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3125: athrow
    //   3126: aload #23
    //   3128: ifnull -> 3155
    //   3131: instanceof java/util/UUID
    //   3134: ifeq -> 3160
    //   3137: goto -> 3144
    //   3140: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3143: athrow
    //   3144: aload #35
    //   3146: iconst_4
    //   3147: aaload
    //   3148: goto -> 3155
    //   3151: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3154: athrow
    //   3155: checkcast java/util/UUID
    //   3158: astore #70
    //   3160: aconst_null
    //   3161: astore #71
    //   3163: aload #66
    //   3165: aload #23
    //   3167: ifnull -> 3182
    //   3170: ifnull -> 3187
    //   3173: goto -> 3180
    //   3176: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3179: athrow
    //   3180: aload #66
    //   3182: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   3185: astore #71
    //   3187: aconst_null
    //   3188: astore #72
    //   3190: aload #67
    //   3192: aload #23
    //   3194: ifnull -> 3209
    //   3197: ifnull -> 3214
    //   3200: goto -> 3207
    //   3203: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3206: athrow
    //   3207: aload #67
    //   3209: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   3212: astore #72
    //   3214: aconst_null
    //   3215: astore #73
    //   3217: aload #68
    //   3219: aload #23
    //   3221: ifnull -> 3236
    //   3224: ifnull -> 3241
    //   3227: goto -> 3234
    //   3230: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3233: athrow
    //   3234: aload #68
    //   3236: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   3239: astore #73
    //   3241: aconst_null
    //   3242: astore #74
    //   3244: aload #69
    //   3246: aload #23
    //   3248: ifnull -> 3263
    //   3251: ifnull -> 3268
    //   3254: goto -> 3261
    //   3257: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3260: athrow
    //   3261: aload #69
    //   3263: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   3266: astore #74
    //   3268: aconst_null
    //   3269: astore #75
    //   3271: aload #70
    //   3273: aload #23
    //   3275: ifnull -> 3290
    //   3278: ifnull -> 3295
    //   3281: goto -> 3288
    //   3284: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3287: athrow
    //   3288: aload #70
    //   3290: invokestatic getPlayer : (Ljava/util/UUID;)Lorg/bukkit/entity/Player;
    //   3293: astore #75
    //   3295: aload #41
    //   3297: aload #23
    //   3299: ifnull -> 3324
    //   3302: ifnonnull -> 3322
    //   3305: goto -> 3312
    //   3308: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3311: athrow
    //   3312: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3315: goto -> 3329
    //   3318: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3321: athrow
    //   3322: aload #41
    //   3324: invokeinterface getName : ()Ljava/lang/String;
    //   3329: astore #76
    //   3331: aload #42
    //   3333: aload #23
    //   3335: ifnull -> 3360
    //   3338: ifnonnull -> 3358
    //   3341: goto -> 3348
    //   3344: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3347: athrow
    //   3348: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3351: goto -> 3365
    //   3354: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3357: athrow
    //   3358: aload #42
    //   3360: invokeinterface getName : ()Ljava/lang/String;
    //   3365: astore #77
    //   3367: aload #43
    //   3369: aload #23
    //   3371: ifnull -> 3396
    //   3374: ifnonnull -> 3394
    //   3377: goto -> 3384
    //   3380: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3383: athrow
    //   3384: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3387: goto -> 3401
    //   3390: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3393: athrow
    //   3394: aload #43
    //   3396: invokeinterface getName : ()Ljava/lang/String;
    //   3401: astore #78
    //   3403: aload #44
    //   3405: aload #23
    //   3407: ifnull -> 3432
    //   3410: ifnonnull -> 3430
    //   3413: goto -> 3420
    //   3416: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3419: athrow
    //   3420: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3423: goto -> 3437
    //   3426: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3429: athrow
    //   3430: aload #44
    //   3432: invokeinterface getName : ()Ljava/lang/String;
    //   3437: astore #79
    //   3439: aload #45
    //   3441: aload #23
    //   3443: ifnull -> 3468
    //   3446: ifnonnull -> 3466
    //   3449: goto -> 3456
    //   3452: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3455: athrow
    //   3456: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3459: goto -> 3473
    //   3462: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3465: athrow
    //   3466: aload #45
    //   3468: invokeinterface getName : ()Ljava/lang/String;
    //   3473: astore #80
    //   3475: aload #36
    //   3477: aload #23
    //   3479: ifnull -> 3511
    //   3482: ifnonnull -> 3502
    //   3485: goto -> 3492
    //   3488: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3491: athrow
    //   3492: ldc_w '0'
    //   3495: goto -> 3517
    //   3498: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3501: athrow
    //   3502: aload #28
    //   3504: aload #36
    //   3506: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3511: checkcast java/lang/Integer
    //   3514: invokevirtual toString : ()Ljava/lang/String;
    //   3517: astore #81
    //   3519: aload #37
    //   3521: aload #23
    //   3523: ifnull -> 3555
    //   3526: ifnonnull -> 3546
    //   3529: goto -> 3536
    //   3532: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3535: athrow
    //   3536: ldc_w '0'
    //   3539: goto -> 3561
    //   3542: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3545: athrow
    //   3546: aload #28
    //   3548: aload #37
    //   3550: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3555: checkcast java/lang/Integer
    //   3558: invokevirtual toString : ()Ljava/lang/String;
    //   3561: astore #82
    //   3563: aload #38
    //   3565: aload #23
    //   3567: ifnull -> 3599
    //   3570: ifnonnull -> 3590
    //   3573: goto -> 3580
    //   3576: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3579: athrow
    //   3580: ldc_w '0'
    //   3583: goto -> 3605
    //   3586: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3589: athrow
    //   3590: aload #28
    //   3592: aload #38
    //   3594: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3599: checkcast java/lang/Integer
    //   3602: invokevirtual toString : ()Ljava/lang/String;
    //   3605: astore #83
    //   3607: aload #39
    //   3609: aload #23
    //   3611: ifnull -> 3643
    //   3614: ifnonnull -> 3634
    //   3617: goto -> 3624
    //   3620: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3623: athrow
    //   3624: ldc_w '0'
    //   3627: goto -> 3649
    //   3630: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3633: athrow
    //   3634: aload #28
    //   3636: aload #39
    //   3638: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3643: checkcast java/lang/Integer
    //   3646: invokevirtual toString : ()Ljava/lang/String;
    //   3649: astore #84
    //   3651: aload #40
    //   3653: aload #23
    //   3655: ifnull -> 3687
    //   3658: ifnonnull -> 3678
    //   3661: goto -> 3668
    //   3664: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3667: athrow
    //   3668: ldc_w '0'
    //   3671: goto -> 3693
    //   3674: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3677: athrow
    //   3678: aload #28
    //   3680: aload #40
    //   3682: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3687: checkcast java/lang/Integer
    //   3690: invokevirtual toString : ()Ljava/lang/String;
    //   3693: astore #85
    //   3695: aload #51
    //   3697: aload #23
    //   3699: ifnull -> 3724
    //   3702: ifnonnull -> 3722
    //   3705: goto -> 3712
    //   3708: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3711: athrow
    //   3712: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3715: goto -> 3729
    //   3718: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3721: athrow
    //   3722: aload #51
    //   3724: invokeinterface getName : ()Ljava/lang/String;
    //   3729: astore #86
    //   3731: aload #52
    //   3733: aload #23
    //   3735: ifnull -> 3760
    //   3738: ifnonnull -> 3758
    //   3741: goto -> 3748
    //   3744: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3747: athrow
    //   3748: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3751: goto -> 3765
    //   3754: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3757: athrow
    //   3758: aload #52
    //   3760: invokeinterface getName : ()Ljava/lang/String;
    //   3765: astore #87
    //   3767: aload #53
    //   3769: aload #23
    //   3771: ifnull -> 3796
    //   3774: ifnonnull -> 3794
    //   3777: goto -> 3784
    //   3780: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3783: athrow
    //   3784: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3787: goto -> 3801
    //   3790: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3793: athrow
    //   3794: aload #53
    //   3796: invokeinterface getName : ()Ljava/lang/String;
    //   3801: astore #88
    //   3803: aload #54
    //   3805: aload #23
    //   3807: ifnull -> 3832
    //   3810: ifnonnull -> 3830
    //   3813: goto -> 3820
    //   3816: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3819: athrow
    //   3820: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3823: goto -> 3837
    //   3826: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3829: athrow
    //   3830: aload #54
    //   3832: invokeinterface getName : ()Ljava/lang/String;
    //   3837: astore #89
    //   3839: aload #55
    //   3841: aload #23
    //   3843: ifnull -> 3868
    //   3846: ifnonnull -> 3866
    //   3849: goto -> 3856
    //   3852: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3855: athrow
    //   3856: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   3859: goto -> 3873
    //   3862: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3865: athrow
    //   3866: aload #55
    //   3868: invokeinterface getName : ()Ljava/lang/String;
    //   3873: astore #90
    //   3875: aload #46
    //   3877: aload #23
    //   3879: ifnull -> 3911
    //   3882: ifnonnull -> 3902
    //   3885: goto -> 3892
    //   3888: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3891: athrow
    //   3892: ldc_w '0'
    //   3895: goto -> 3917
    //   3898: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3901: athrow
    //   3902: aload #29
    //   3904: aload #46
    //   3906: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3911: checkcast java/lang/Integer
    //   3914: invokevirtual toString : ()Ljava/lang/String;
    //   3917: astore #91
    //   3919: aload #47
    //   3921: aload #23
    //   3923: ifnull -> 3955
    //   3926: ifnonnull -> 3946
    //   3929: goto -> 3936
    //   3932: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3935: athrow
    //   3936: ldc_w '0'
    //   3939: goto -> 3961
    //   3942: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3945: athrow
    //   3946: aload #29
    //   3948: aload #47
    //   3950: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3955: checkcast java/lang/Integer
    //   3958: invokevirtual toString : ()Ljava/lang/String;
    //   3961: astore #92
    //   3963: aload #48
    //   3965: aload #23
    //   3967: ifnull -> 3999
    //   3970: ifnonnull -> 3990
    //   3973: goto -> 3980
    //   3976: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3979: athrow
    //   3980: ldc_w '0'
    //   3983: goto -> 4005
    //   3986: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3989: athrow
    //   3990: aload #29
    //   3992: aload #48
    //   3994: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3999: checkcast java/lang/Integer
    //   4002: invokevirtual toString : ()Ljava/lang/String;
    //   4005: astore #93
    //   4007: aload #49
    //   4009: aload #23
    //   4011: ifnull -> 4043
    //   4014: ifnonnull -> 4034
    //   4017: goto -> 4024
    //   4020: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4023: athrow
    //   4024: ldc_w '0'
    //   4027: goto -> 4049
    //   4030: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4033: athrow
    //   4034: aload #29
    //   4036: aload #49
    //   4038: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4043: checkcast java/lang/Integer
    //   4046: invokevirtual toString : ()Ljava/lang/String;
    //   4049: astore #94
    //   4051: aload #50
    //   4053: aload #23
    //   4055: ifnull -> 4087
    //   4058: ifnonnull -> 4078
    //   4061: goto -> 4068
    //   4064: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4067: athrow
    //   4068: ldc_w '0'
    //   4071: goto -> 4093
    //   4074: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4077: athrow
    //   4078: aload #29
    //   4080: aload #50
    //   4082: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4087: checkcast java/lang/Integer
    //   4090: invokevirtual toString : ()Ljava/lang/String;
    //   4093: astore #95
    //   4095: aload #61
    //   4097: aload #23
    //   4099: ifnull -> 4124
    //   4102: ifnonnull -> 4122
    //   4105: goto -> 4112
    //   4108: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4111: athrow
    //   4112: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4115: goto -> 4129
    //   4118: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4121: athrow
    //   4122: aload #61
    //   4124: invokeinterface getName : ()Ljava/lang/String;
    //   4129: astore #96
    //   4131: aload #62
    //   4133: aload #23
    //   4135: ifnull -> 4160
    //   4138: ifnonnull -> 4158
    //   4141: goto -> 4148
    //   4144: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4147: athrow
    //   4148: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4151: goto -> 4165
    //   4154: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4157: athrow
    //   4158: aload #62
    //   4160: invokeinterface getName : ()Ljava/lang/String;
    //   4165: astore #97
    //   4167: aload #63
    //   4169: aload #23
    //   4171: ifnull -> 4196
    //   4174: ifnonnull -> 4194
    //   4177: goto -> 4184
    //   4180: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4183: athrow
    //   4184: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4187: goto -> 4201
    //   4190: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4193: athrow
    //   4194: aload #63
    //   4196: invokeinterface getName : ()Ljava/lang/String;
    //   4201: astore #98
    //   4203: aload #64
    //   4205: aload #23
    //   4207: ifnull -> 4232
    //   4210: ifnonnull -> 4230
    //   4213: goto -> 4220
    //   4216: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4219: athrow
    //   4220: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4223: goto -> 4237
    //   4226: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4229: athrow
    //   4230: aload #64
    //   4232: invokeinterface getName : ()Ljava/lang/String;
    //   4237: astore #99
    //   4239: aload #65
    //   4241: aload #23
    //   4243: ifnull -> 4268
    //   4246: ifnonnull -> 4266
    //   4249: goto -> 4256
    //   4252: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4255: athrow
    //   4256: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4259: goto -> 4273
    //   4262: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4265: athrow
    //   4266: aload #65
    //   4268: invokeinterface getName : ()Ljava/lang/String;
    //   4273: astore #100
    //   4275: aload #56
    //   4277: aload #23
    //   4279: ifnull -> 4311
    //   4282: ifnonnull -> 4302
    //   4285: goto -> 4292
    //   4288: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4291: athrow
    //   4292: ldc_w '0'
    //   4295: goto -> 4317
    //   4298: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4301: athrow
    //   4302: aload #30
    //   4304: aload #56
    //   4306: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4311: checkcast java/lang/Integer
    //   4314: invokevirtual toString : ()Ljava/lang/String;
    //   4317: astore #101
    //   4319: aload #57
    //   4321: aload #23
    //   4323: ifnull -> 4355
    //   4326: ifnonnull -> 4346
    //   4329: goto -> 4336
    //   4332: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4335: athrow
    //   4336: ldc_w '0'
    //   4339: goto -> 4361
    //   4342: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4345: athrow
    //   4346: aload #30
    //   4348: aload #57
    //   4350: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4355: checkcast java/lang/Integer
    //   4358: invokevirtual toString : ()Ljava/lang/String;
    //   4361: astore #102
    //   4363: aload #58
    //   4365: aload #23
    //   4367: ifnull -> 4399
    //   4370: ifnonnull -> 4390
    //   4373: goto -> 4380
    //   4376: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4379: athrow
    //   4380: ldc_w '0'
    //   4383: goto -> 4405
    //   4386: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4389: athrow
    //   4390: aload #30
    //   4392: aload #58
    //   4394: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4399: checkcast java/lang/Integer
    //   4402: invokevirtual toString : ()Ljava/lang/String;
    //   4405: astore #103
    //   4407: aload #59
    //   4409: aload #23
    //   4411: ifnull -> 4443
    //   4414: ifnonnull -> 4434
    //   4417: goto -> 4424
    //   4420: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4423: athrow
    //   4424: ldc_w '0'
    //   4427: goto -> 4449
    //   4430: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4433: athrow
    //   4434: aload #30
    //   4436: aload #59
    //   4438: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4443: checkcast java/lang/Integer
    //   4446: invokevirtual toString : ()Ljava/lang/String;
    //   4449: astore #104
    //   4451: aload #60
    //   4453: aload #23
    //   4455: ifnull -> 4487
    //   4458: ifnonnull -> 4478
    //   4461: goto -> 4468
    //   4464: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4467: athrow
    //   4468: ldc_w '0'
    //   4471: goto -> 4493
    //   4474: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4477: athrow
    //   4478: aload #30
    //   4480: aload #60
    //   4482: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4487: checkcast java/lang/Integer
    //   4490: invokevirtual toString : ()Ljava/lang/String;
    //   4493: astore #105
    //   4495: aload #71
    //   4497: aload #23
    //   4499: ifnull -> 4524
    //   4502: ifnonnull -> 4522
    //   4505: goto -> 4512
    //   4508: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4511: athrow
    //   4512: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4515: goto -> 4529
    //   4518: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4521: athrow
    //   4522: aload #71
    //   4524: invokeinterface getName : ()Ljava/lang/String;
    //   4529: astore #106
    //   4531: aload #72
    //   4533: aload #23
    //   4535: ifnull -> 4560
    //   4538: ifnonnull -> 4558
    //   4541: goto -> 4548
    //   4544: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4547: athrow
    //   4548: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4551: goto -> 4565
    //   4554: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4557: athrow
    //   4558: aload #72
    //   4560: invokeinterface getName : ()Ljava/lang/String;
    //   4565: astore #107
    //   4567: aload #73
    //   4569: aload #23
    //   4571: ifnull -> 4596
    //   4574: ifnonnull -> 4594
    //   4577: goto -> 4584
    //   4580: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4583: athrow
    //   4584: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4587: goto -> 4601
    //   4590: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4593: athrow
    //   4594: aload #73
    //   4596: invokeinterface getName : ()Ljava/lang/String;
    //   4601: astore #108
    //   4603: aload #74
    //   4605: aload #23
    //   4607: ifnull -> 4632
    //   4610: ifnonnull -> 4630
    //   4613: goto -> 4620
    //   4616: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4619: athrow
    //   4620: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4623: goto -> 4637
    //   4626: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4629: athrow
    //   4630: aload #74
    //   4632: invokeinterface getName : ()Ljava/lang/String;
    //   4637: astore #109
    //   4639: aload #75
    //   4641: aload #23
    //   4643: ifnull -> 4668
    //   4646: ifnonnull -> 4666
    //   4649: goto -> 4656
    //   4652: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4655: athrow
    //   4656: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dL : Ljava/lang/String;
    //   4659: goto -> 4673
    //   4662: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4665: athrow
    //   4666: aload #75
    //   4668: invokeinterface getName : ()Ljava/lang/String;
    //   4673: astore #110
    //   4675: aload #66
    //   4677: aload #23
    //   4679: ifnull -> 4711
    //   4682: ifnonnull -> 4702
    //   4685: goto -> 4692
    //   4688: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4691: athrow
    //   4692: ldc_w '0'
    //   4695: goto -> 4717
    //   4698: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4701: athrow
    //   4702: aload #31
    //   4704: aload #66
    //   4706: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4711: checkcast java/lang/Integer
    //   4714: invokevirtual toString : ()Ljava/lang/String;
    //   4717: astore #111
    //   4719: aload #67
    //   4721: aload #23
    //   4723: ifnull -> 4755
    //   4726: ifnonnull -> 4746
    //   4729: goto -> 4736
    //   4732: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4735: athrow
    //   4736: ldc_w '0'
    //   4739: goto -> 4761
    //   4742: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4745: athrow
    //   4746: aload #31
    //   4748: aload #67
    //   4750: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4755: checkcast java/lang/Integer
    //   4758: invokevirtual toString : ()Ljava/lang/String;
    //   4761: astore #112
    //   4763: aload #68
    //   4765: aload #23
    //   4767: ifnull -> 4799
    //   4770: ifnonnull -> 4790
    //   4773: goto -> 4780
    //   4776: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4779: athrow
    //   4780: ldc_w '0'
    //   4783: goto -> 4805
    //   4786: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4789: athrow
    //   4790: aload #31
    //   4792: aload #68
    //   4794: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4799: checkcast java/lang/Integer
    //   4802: invokevirtual toString : ()Ljava/lang/String;
    //   4805: astore #113
    //   4807: aload #69
    //   4809: aload #23
    //   4811: ifnull -> 4843
    //   4814: ifnonnull -> 4834
    //   4817: goto -> 4824
    //   4820: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4823: athrow
    //   4824: ldc_w '0'
    //   4827: goto -> 4849
    //   4830: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4833: athrow
    //   4834: aload #31
    //   4836: aload #69
    //   4838: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4843: checkcast java/lang/Integer
    //   4846: invokevirtual toString : ()Ljava/lang/String;
    //   4849: astore #114
    //   4851: aload #70
    //   4853: aload #23
    //   4855: ifnull -> 4887
    //   4858: ifnonnull -> 4878
    //   4861: goto -> 4868
    //   4864: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4867: athrow
    //   4868: ldc_w '0'
    //   4871: goto -> 4893
    //   4874: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4877: athrow
    //   4878: aload #31
    //   4880: aload #70
    //   4882: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4887: checkcast java/lang/Integer
    //   4890: invokevirtual toString : ()Ljava/lang/String;
    //   4893: astore #115
    //   4895: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G1 : Ljava/util/List;
    //   4898: aload_0
    //   4899: aload_1
    //   4900: aload #76
    //   4902: aload #77
    //   4904: aload #78
    //   4906: aload #79
    //   4908: aload #80
    //   4910: aload #81
    //   4912: aload #82
    //   4914: aload #83
    //   4916: aload #84
    //   4918: aload #85
    //   4920: aload #86
    //   4922: aload #87
    //   4924: aload #88
    //   4926: aload #89
    //   4928: aload #90
    //   4930: aload #91
    //   4932: aload #92
    //   4934: aload #93
    //   4936: aload #94
    //   4938: aload #95
    //   4940: aload #96
    //   4942: aload #97
    //   4944: aload #98
    //   4946: aload #99
    //   4948: aload #100
    //   4950: aload #101
    //   4952: aload #102
    //   4954: aload #103
    //   4956: aload #104
    //   4958: aload #105
    //   4960: aload #106
    //   4962: aload #107
    //   4964: aload #108
    //   4966: aload #109
    //   4968: aload #110
    //   4970: aload #111
    //   4972: aload #112
    //   4974: aload #113
    //   4976: aload #114
    //   4978: aload #115
    //   4980: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_i;Lorg/bukkit/command/CommandSender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   4985: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   4990: aload #23
    //   4992: ifnonnull -> 14807
    //   4995: aload_0
    //   4996: aload_1
    //   4997: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   5000: lload #13
    //   5002: iconst_3
    //   5003: anewarray java/lang/Object
    //   5006: dup_x2
    //   5007: dup_x2
    //   5008: pop
    //   5009: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5012: iconst_2
    //   5013: swap
    //   5014: aastore
    //   5015: dup_x1
    //   5016: swap
    //   5017: iconst_1
    //   5018: swap
    //   5019: aastore
    //   5020: dup_x1
    //   5021: swap
    //   5022: iconst_0
    //   5023: swap
    //   5024: aastore
    //   5025: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5028: iconst_1
    //   5029: goto -> 5036
    //   5032: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5035: athrow
    //   5036: ireturn
    //   5037: aload #4
    //   5039: iconst_0
    //   5040: aaload
    //   5041: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5044: astore #116
    //   5046: aload #116
    //   5048: bipush #72
    //   5050: aaload
    //   5051: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   5054: aload #23
    //   5056: ifnull -> 5700
    //   5059: ifeq -> 5682
    //   5062: goto -> 5069
    //   5065: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5068: athrow
    //   5069: aload_1
    //   5070: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5073: sipush #140
    //   5076: aaload
    //   5077: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   5082: aload #23
    //   5084: ifnull -> 5681
    //   5087: goto -> 5094
    //   5090: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5093: athrow
    //   5094: ifeq -> 5640
    //   5097: goto -> 5104
    //   5100: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5103: athrow
    //   5104: aload #4
    //   5106: aload #23
    //   5108: ifnull -> 5188
    //   5111: goto -> 5118
    //   5114: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5117: athrow
    //   5118: arraylength
    //   5119: iconst_1
    //   5120: if_icmpne -> 5179
    //   5123: goto -> 5130
    //   5126: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5129: athrow
    //   5130: aload_0
    //   5131: aload_1
    //   5132: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5135: sipush #134
    //   5138: aaload
    //   5139: lload #13
    //   5141: iconst_3
    //   5142: anewarray java/lang/Object
    //   5145: dup_x2
    //   5146: dup_x2
    //   5147: pop
    //   5148: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5151: iconst_2
    //   5152: swap
    //   5153: aastore
    //   5154: dup_x1
    //   5155: swap
    //   5156: iconst_1
    //   5157: swap
    //   5158: aastore
    //   5159: dup_x1
    //   5160: swap
    //   5161: iconst_0
    //   5162: swap
    //   5163: aastore
    //   5164: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5167: aload #23
    //   5169: ifnonnull -> 14807
    //   5172: goto -> 5179
    //   5175: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5178: athrow
    //   5179: aload #4
    //   5181: goto -> 5188
    //   5184: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5187: athrow
    //   5188: iconst_1
    //   5189: aaload
    //   5190: astore #24
    //   5192: aload #24
    //   5194: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   5197: astore #25
    //   5199: aload #23
    //   5201: ifnull -> 5256
    //   5204: aload #25
    //   5206: ifnonnull -> 5258
    //   5209: goto -> 5216
    //   5212: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5215: athrow
    //   5216: aload_0
    //   5217: aload_1
    //   5218: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   5221: lload #13
    //   5223: iconst_3
    //   5224: anewarray java/lang/Object
    //   5227: dup_x2
    //   5228: dup_x2
    //   5229: pop
    //   5230: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5233: iconst_2
    //   5234: swap
    //   5235: aastore
    //   5236: dup_x1
    //   5237: swap
    //   5238: iconst_1
    //   5239: swap
    //   5240: aastore
    //   5241: dup_x1
    //   5242: swap
    //   5243: iconst_0
    //   5244: swap
    //   5245: aastore
    //   5246: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5249: goto -> 5256
    //   5252: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5255: athrow
    //   5256: iconst_1
    //   5257: ireturn
    //   5258: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   5261: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   5264: aload #25
    //   5266: iconst_1
    //   5267: anewarray java/lang/Object
    //   5270: dup_x1
    //   5271: swap
    //   5272: iconst_0
    //   5273: swap
    //   5274: aastore
    //   5275: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   5278: astore #26
    //   5280: aload #23
    //   5282: ifnull -> 5633
    //   5285: aload #26
    //   5287: ifnull -> 5593
    //   5290: goto -> 5297
    //   5293: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5296: athrow
    //   5297: new java/util/ArrayList
    //   5300: dup
    //   5301: invokespecial <init> : ()V
    //   5304: astore #27
    //   5306: invokestatic values : ()[Lme/frep/aegisguard/spigot/aegisguard_h3;
    //   5309: astore #28
    //   5311: aload #28
    //   5313: arraylength
    //   5314: istore #29
    //   5316: iconst_0
    //   5317: istore #30
    //   5319: iload #30
    //   5321: iload #29
    //   5323: if_icmpge -> 5422
    //   5326: aload #28
    //   5328: iload #30
    //   5330: aaload
    //   5331: astore #31
    //   5333: aload #23
    //   5335: ifnull -> 5417
    //   5338: aload #26
    //   5340: iconst_0
    //   5341: anewarray java/lang/Object
    //   5344: invokevirtual aegisguard_K : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_X;
    //   5347: aload #31
    //   5349: lload #19
    //   5351: iconst_2
    //   5352: anewarray java/lang/Object
    //   5355: dup_x2
    //   5356: dup_x2
    //   5357: pop
    //   5358: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5361: iconst_1
    //   5362: swap
    //   5363: aastore
    //   5364: dup_x1
    //   5365: swap
    //   5366: iconst_0
    //   5367: swap
    //   5368: aastore
    //   5369: invokevirtual aegisguard_t : ([Ljava/lang/Object;)Z
    //   5372: aload #23
    //   5374: ifnull -> 14808
    //   5377: goto -> 5384
    //   5380: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5383: athrow
    //   5384: ifeq -> 5414
    //   5387: goto -> 5394
    //   5390: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5393: athrow
    //   5394: aload #27
    //   5396: aload #31
    //   5398: invokevirtual toString : ()Ljava/lang/String;
    //   5401: invokeinterface add : (Ljava/lang/Object;)Z
    //   5406: pop
    //   5407: goto -> 5414
    //   5410: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5413: athrow
    //   5414: iinc #30, 1
    //   5417: aload #23
    //   5419: ifnonnull -> 5319
    //   5422: aload_0
    //   5423: aload_1
    //   5424: lload #21
    //   5426: iconst_2
    //   5427: anewarray java/lang/Object
    //   5430: dup_x2
    //   5431: dup_x2
    //   5432: pop
    //   5433: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5436: iconst_1
    //   5437: swap
    //   5438: aastore
    //   5439: dup_x1
    //   5440: swap
    //   5441: iconst_0
    //   5442: swap
    //   5443: aastore
    //   5444: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   5447: aload_0
    //   5448: aload_1
    //   5449: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5452: sipush #168
    //   5455: aaload
    //   5456: lload #13
    //   5458: iconst_3
    //   5459: anewarray java/lang/Object
    //   5462: dup_x2
    //   5463: dup_x2
    //   5464: pop
    //   5465: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5468: iconst_2
    //   5469: swap
    //   5470: aastore
    //   5471: dup_x1
    //   5472: swap
    //   5473: iconst_1
    //   5474: swap
    //   5475: aastore
    //   5476: dup_x1
    //   5477: swap
    //   5478: iconst_0
    //   5479: swap
    //   5480: aastore
    //   5481: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5484: aload #27
    //   5486: aload_0
    //   5487: aload_1
    //   5488: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_i;Lorg/bukkit/command/CommandSender;)Ljava/util/function/Consumer;
    //   5493: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   5498: aload_0
    //   5499: aload_1
    //   5500: new java/lang/StringBuilder
    //   5503: dup
    //   5504: invokespecial <init> : ()V
    //   5507: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5510: bipush #28
    //   5512: aaload
    //   5513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5516: aload #25
    //   5518: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5521: bipush #108
    //   5523: aaload
    //   5524: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   5529: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   5532: invokevirtual toString : ()Ljava/lang/String;
    //   5535: lload #13
    //   5537: iconst_3
    //   5538: anewarray java/lang/Object
    //   5541: dup_x2
    //   5542: dup_x2
    //   5543: pop
    //   5544: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5547: iconst_2
    //   5548: swap
    //   5549: aastore
    //   5550: dup_x1
    //   5551: swap
    //   5552: iconst_1
    //   5553: swap
    //   5554: aastore
    //   5555: dup_x1
    //   5556: swap
    //   5557: iconst_0
    //   5558: swap
    //   5559: aastore
    //   5560: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5563: aload_0
    //   5564: aload_1
    //   5565: lload #21
    //   5567: iconst_2
    //   5568: anewarray java/lang/Object
    //   5571: dup_x2
    //   5572: dup_x2
    //   5573: pop
    //   5574: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5577: iconst_1
    //   5578: swap
    //   5579: aastore
    //   5580: dup_x1
    //   5581: swap
    //   5582: iconst_0
    //   5583: swap
    //   5584: aastore
    //   5585: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   5588: aload #23
    //   5590: ifnonnull -> 5635
    //   5593: aload_0
    //   5594: aload_1
    //   5595: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   5598: lload #13
    //   5600: iconst_3
    //   5601: anewarray java/lang/Object
    //   5604: dup_x2
    //   5605: dup_x2
    //   5606: pop
    //   5607: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5610: iconst_2
    //   5611: swap
    //   5612: aastore
    //   5613: dup_x1
    //   5614: swap
    //   5615: iconst_1
    //   5616: swap
    //   5617: aastore
    //   5618: dup_x1
    //   5619: swap
    //   5620: iconst_0
    //   5621: swap
    //   5622: aastore
    //   5623: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5626: goto -> 5633
    //   5629: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5632: athrow
    //   5633: iconst_1
    //   5634: ireturn
    //   5635: aload #23
    //   5637: ifnonnull -> 14807
    //   5640: aload_0
    //   5641: aload_1
    //   5642: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   5645: lload #13
    //   5647: iconst_3
    //   5648: anewarray java/lang/Object
    //   5651: dup_x2
    //   5652: dup_x2
    //   5653: pop
    //   5654: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5657: iconst_2
    //   5658: swap
    //   5659: aastore
    //   5660: dup_x1
    //   5661: swap
    //   5662: iconst_1
    //   5663: swap
    //   5664: aastore
    //   5665: dup_x1
    //   5666: swap
    //   5667: iconst_0
    //   5668: swap
    //   5669: aastore
    //   5670: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5673: iconst_1
    //   5674: goto -> 5681
    //   5677: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5680: athrow
    //   5681: ireturn
    //   5682: aload #4
    //   5684: iconst_0
    //   5685: aaload
    //   5686: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5689: astore #116
    //   5691: aload #116
    //   5693: sipush #153
    //   5696: aaload
    //   5697: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   5700: aload #23
    //   5702: ifnull -> 5860
    //   5705: ifeq -> 5842
    //   5708: goto -> 5715
    //   5711: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5714: athrow
    //   5715: aload_1
    //   5716: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5719: bipush #101
    //   5721: aaload
    //   5722: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   5727: aload #23
    //   5729: ifnull -> 5841
    //   5732: goto -> 5739
    //   5735: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5738: athrow
    //   5739: ifeq -> 5800
    //   5742: goto -> 5749
    //   5745: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5748: athrow
    //   5749: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   5752: invokevirtual aegisguard_F : ()V
    //   5755: aload_0
    //   5756: aload_1
    //   5757: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_N : Ljava/lang/String;
    //   5760: lload #13
    //   5762: iconst_3
    //   5763: anewarray java/lang/Object
    //   5766: dup_x2
    //   5767: dup_x2
    //   5768: pop
    //   5769: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5772: iconst_2
    //   5773: swap
    //   5774: aastore
    //   5775: dup_x1
    //   5776: swap
    //   5777: iconst_1
    //   5778: swap
    //   5779: aastore
    //   5780: dup_x1
    //   5781: swap
    //   5782: iconst_0
    //   5783: swap
    //   5784: aastore
    //   5785: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5788: aload #23
    //   5790: ifnonnull -> 14807
    //   5793: goto -> 5800
    //   5796: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5799: athrow
    //   5800: aload_0
    //   5801: aload_1
    //   5802: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   5805: lload #13
    //   5807: iconst_3
    //   5808: anewarray java/lang/Object
    //   5811: dup_x2
    //   5812: dup_x2
    //   5813: pop
    //   5814: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5817: iconst_2
    //   5818: swap
    //   5819: aastore
    //   5820: dup_x1
    //   5821: swap
    //   5822: iconst_1
    //   5823: swap
    //   5824: aastore
    //   5825: dup_x1
    //   5826: swap
    //   5827: iconst_0
    //   5828: swap
    //   5829: aastore
    //   5830: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5833: iconst_1
    //   5834: goto -> 5841
    //   5837: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5840: athrow
    //   5841: ireturn
    //   5842: aload #4
    //   5844: iconst_0
    //   5845: aaload
    //   5846: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5849: astore #116
    //   5851: aload #116
    //   5853: sipush #174
    //   5856: aaload
    //   5857: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   5860: aload #23
    //   5862: ifnull -> 6242
    //   5865: ifeq -> 6225
    //   5868: goto -> 5875
    //   5871: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5874: athrow
    //   5875: aload_1
    //   5876: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   5879: bipush #24
    //   5881: aaload
    //   5882: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   5887: aload #23
    //   5889: ifnull -> 6224
    //   5892: goto -> 5899
    //   5895: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5898: athrow
    //   5899: ifeq -> 6183
    //   5902: goto -> 5909
    //   5905: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5908: athrow
    //   5909: aload #4
    //   5911: aload #23
    //   5913: ifnull -> 5976
    //   5916: goto -> 5923
    //   5919: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5922: athrow
    //   5923: arraylength
    //   5924: iconst_1
    //   5925: if_icmpne -> 5974
    //   5928: goto -> 5935
    //   5931: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5934: athrow
    //   5935: aload_0
    //   5936: aload_1
    //   5937: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GA : Ljava/lang/String;
    //   5940: lload #13
    //   5942: iconst_3
    //   5943: anewarray java/lang/Object
    //   5946: dup_x2
    //   5947: dup_x2
    //   5948: pop
    //   5949: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5952: iconst_2
    //   5953: swap
    //   5954: aastore
    //   5955: dup_x1
    //   5956: swap
    //   5957: iconst_1
    //   5958: swap
    //   5959: aastore
    //   5960: dup_x1
    //   5961: swap
    //   5962: iconst_0
    //   5963: swap
    //   5964: aastore
    //   5965: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   5968: iconst_1
    //   5969: ireturn
    //   5970: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5973: athrow
    //   5974: aload #4
    //   5976: iconst_1
    //   5977: aaload
    //   5978: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   5981: astore #24
    //   5983: getstatic me/frep/aegisguard/spigot/check/manager/CheckManager.aegisguard_Q : [Ljava/lang/Class;
    //   5986: astore #25
    //   5988: aload #25
    //   5990: arraylength
    //   5991: istore #26
    //   5993: iconst_0
    //   5994: istore #27
    //   5996: iload #27
    //   5998: iload #26
    //   6000: if_icmpge -> 6178
    //   6003: aload #25
    //   6005: iload #27
    //   6007: aaload
    //   6008: astore #28
    //   6010: aload #28
    //   6012: ldc_w me/frep/aegisguard/spigot/check/api/CheckInfo
    //   6015: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   6018: checkcast me/frep/aegisguard/spigot/check/api/CheckInfo
    //   6021: astore #29
    //   6023: new java/lang/StringBuilder
    //   6026: dup
    //   6027: invokespecial <init> : ()V
    //   6030: aload #29
    //   6032: invokeinterface name : ()Ljava/lang/String;
    //   6037: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6040: aload #29
    //   6042: invokeinterface type : ()C
    //   6047: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   6050: invokevirtual toString : ()Ljava/lang/String;
    //   6053: ldc_w ' '
    //   6056: ldc_w ''
    //   6059: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   6062: astore #30
    //   6064: aload #23
    //   6066: ifnull -> 6173
    //   6069: aload #24
    //   6071: aload #30
    //   6073: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   6076: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   6079: aload #23
    //   6081: ifnull -> 14808
    //   6084: goto -> 6091
    //   6087: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6090: athrow
    //   6091: ifeq -> 6170
    //   6094: goto -> 6101
    //   6097: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6100: athrow
    //   6101: aload_0
    //   6102: aload_1
    //   6103: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yj : Ljava/lang/String;
    //   6106: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6109: sipush #159
    //   6112: aaload
    //   6113: aload #30
    //   6115: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6118: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6121: sipush #152
    //   6124: aaload
    //   6125: aload #29
    //   6127: invokeinterface description : ()Ljava/lang/String;
    //   6132: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6135: lload #13
    //   6137: iconst_3
    //   6138: anewarray java/lang/Object
    //   6141: dup_x2
    //   6142: dup_x2
    //   6143: pop
    //   6144: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6147: iconst_2
    //   6148: swap
    //   6149: aastore
    //   6150: dup_x1
    //   6151: swap
    //   6152: iconst_1
    //   6153: swap
    //   6154: aastore
    //   6155: dup_x1
    //   6156: swap
    //   6157: iconst_0
    //   6158: swap
    //   6159: aastore
    //   6160: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   6163: goto -> 6170
    //   6166: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6169: athrow
    //   6170: iinc #27, 1
    //   6173: aload #23
    //   6175: ifnonnull -> 5996
    //   6178: aload #23
    //   6180: ifnonnull -> 14807
    //   6183: aload_0
    //   6184: aload_1
    //   6185: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   6188: lload #13
    //   6190: iconst_3
    //   6191: anewarray java/lang/Object
    //   6194: dup_x2
    //   6195: dup_x2
    //   6196: pop
    //   6197: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6200: iconst_2
    //   6201: swap
    //   6202: aastore
    //   6203: dup_x1
    //   6204: swap
    //   6205: iconst_1
    //   6206: swap
    //   6207: aastore
    //   6208: dup_x1
    //   6209: swap
    //   6210: iconst_0
    //   6211: swap
    //   6212: aastore
    //   6213: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   6216: iconst_1
    //   6217: goto -> 6224
    //   6220: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6223: athrow
    //   6224: ireturn
    //   6225: aload #4
    //   6227: iconst_0
    //   6228: aaload
    //   6229: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6232: astore #116
    //   6234: aload #116
    //   6236: bipush #22
    //   6238: aaload
    //   6239: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   6242: aload #23
    //   6244: ifnull -> 6867
    //   6247: ifeq -> 6849
    //   6250: goto -> 6257
    //   6253: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6256: athrow
    //   6257: aload_1
    //   6258: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6261: bipush #35
    //   6263: aaload
    //   6264: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   6269: aload #23
    //   6271: ifnull -> 6848
    //   6274: goto -> 6281
    //   6277: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6280: athrow
    //   6281: ifeq -> 6814
    //   6284: goto -> 6291
    //   6287: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6290: athrow
    //   6291: aload_1
    //   6292: instanceof org/bukkit/entity/Player
    //   6295: aload #23
    //   6297: ifnull -> 6813
    //   6300: goto -> 6307
    //   6303: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6306: athrow
    //   6307: ifeq -> 6779
    //   6310: goto -> 6317
    //   6313: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6316: athrow
    //   6317: aload_1
    //   6318: checkcast org/bukkit/entity/Player
    //   6321: astore #24
    //   6323: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   6326: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   6329: aload #24
    //   6331: iconst_1
    //   6332: anewarray java/lang/Object
    //   6335: dup_x1
    //   6336: swap
    //   6337: iconst_0
    //   6338: swap
    //   6339: aastore
    //   6340: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   6343: astore #25
    //   6345: aload #23
    //   6347: ifnull -> 6402
    //   6350: aload #25
    //   6352: ifnonnull -> 6404
    //   6355: goto -> 6362
    //   6358: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6361: athrow
    //   6362: aload_0
    //   6363: aload_1
    //   6364: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   6367: lload #13
    //   6369: iconst_3
    //   6370: anewarray java/lang/Object
    //   6373: dup_x2
    //   6374: dup_x2
    //   6375: pop
    //   6376: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6379: iconst_2
    //   6380: swap
    //   6381: aastore
    //   6382: dup_x1
    //   6383: swap
    //   6384: iconst_1
    //   6385: swap
    //   6386: aastore
    //   6387: dup_x1
    //   6388: swap
    //   6389: iconst_0
    //   6390: swap
    //   6391: aastore
    //   6392: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   6395: goto -> 6402
    //   6398: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6401: athrow
    //   6402: iconst_1
    //   6403: ireturn
    //   6404: aload_1
    //   6405: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6408: bipush #80
    //   6410: aaload
    //   6411: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   6416: aload #23
    //   6418: ifnull -> 6593
    //   6421: ifeq -> 6594
    //   6424: goto -> 6431
    //   6427: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6430: athrow
    //   6431: aload_0
    //   6432: aload_1
    //   6433: lload #21
    //   6435: iconst_2
    //   6436: anewarray java/lang/Object
    //   6439: dup_x2
    //   6440: dup_x2
    //   6441: pop
    //   6442: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6445: iconst_1
    //   6446: swap
    //   6447: aastore
    //   6448: dup_x1
    //   6449: swap
    //   6450: iconst_0
    //   6451: swap
    //   6452: aastore
    //   6453: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   6456: aload_0
    //   6457: aload_1
    //   6458: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6461: bipush #49
    //   6463: aaload
    //   6464: lload #13
    //   6466: iconst_3
    //   6467: anewarray java/lang/Object
    //   6470: dup_x2
    //   6471: dup_x2
    //   6472: pop
    //   6473: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6476: iconst_2
    //   6477: swap
    //   6478: aastore
    //   6479: dup_x1
    //   6480: swap
    //   6481: iconst_1
    //   6482: swap
    //   6483: aastore
    //   6484: dup_x1
    //   6485: swap
    //   6486: iconst_0
    //   6487: swap
    //   6488: aastore
    //   6489: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   6492: aload_0
    //   6493: aload_1
    //   6494: new java/lang/StringBuilder
    //   6497: dup
    //   6498: invokespecial <init> : ()V
    //   6501: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6504: bipush #47
    //   6506: aaload
    //   6507: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6510: aload_1
    //   6511: invokeinterface getName : ()Ljava/lang/String;
    //   6516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6519: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6522: sipush #136
    //   6525: aaload
    //   6526: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6529: invokevirtual toString : ()Ljava/lang/String;
    //   6532: lload #13
    //   6534: iconst_3
    //   6535: anewarray java/lang/Object
    //   6538: dup_x2
    //   6539: dup_x2
    //   6540: pop
    //   6541: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6544: iconst_2
    //   6545: swap
    //   6546: aastore
    //   6547: dup_x1
    //   6548: swap
    //   6549: iconst_1
    //   6550: swap
    //   6551: aastore
    //   6552: dup_x1
    //   6553: swap
    //   6554: iconst_0
    //   6555: swap
    //   6556: aastore
    //   6557: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   6560: aload_0
    //   6561: aload_1
    //   6562: lload #21
    //   6564: iconst_2
    //   6565: anewarray java/lang/Object
    //   6568: dup_x2
    //   6569: dup_x2
    //   6570: pop
    //   6571: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6574: iconst_1
    //   6575: swap
    //   6576: aastore
    //   6577: dup_x1
    //   6578: swap
    //   6579: iconst_0
    //   6580: swap
    //   6581: aastore
    //   6582: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   6585: iconst_1
    //   6586: goto -> 6593
    //   6589: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6592: athrow
    //   6593: ireturn
    //   6594: aload #25
    //   6596: iconst_0
    //   6597: anewarray java/lang/Object
    //   6600: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   6603: invokeinterface iterator : ()Ljava/util/Iterator;
    //   6608: astore #26
    //   6610: aload #26
    //   6612: invokeinterface hasNext : ()Z
    //   6617: ifeq -> 6744
    //   6620: aload #26
    //   6622: invokeinterface next : ()Ljava/lang/Object;
    //   6627: checkcast me/frep/aegisguard/api/check/Check
    //   6630: astore #27
    //   6632: aload #27
    //   6634: invokeinterface getDisplayName : ()Ljava/lang/String;
    //   6639: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   6642: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6645: sipush #151
    //   6648: aaload
    //   6649: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6652: aload #23
    //   6654: ifnull -> 6778
    //   6657: aload #23
    //   6659: ifnull -> 6705
    //   6662: goto -> 6669
    //   6665: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6668: athrow
    //   6669: ifeq -> 6739
    //   6672: goto -> 6679
    //   6675: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6678: athrow
    //   6679: aload #27
    //   6681: invokeinterface getDisplayType : ()C
    //   6686: invokestatic toString : (C)Ljava/lang/String;
    //   6689: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   6692: ldc_w 'a'
    //   6695: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6698: goto -> 6705
    //   6701: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6704: athrow
    //   6705: ifeq -> 6739
    //   6708: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   6711: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   6714: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   6717: aload #27
    //   6719: aload #25
    //   6721: <illegal opcode> run : (Lme/frep/aegisguard/api/check/Check;Lme/frep/aegisguard/spigot/aegisguard_hu;)Ljava/lang/Runnable;
    //   6726: invokeinterface runTaskAsynchronously : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   6731: pop
    //   6732: goto -> 6739
    //   6735: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6738: athrow
    //   6739: aload #23
    //   6741: ifnonnull -> 6610
    //   6744: aload_0
    //   6745: aload_1
    //   6746: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_x : Ljava/lang/String;
    //   6749: lload #13
    //   6751: iconst_3
    //   6752: anewarray java/lang/Object
    //   6755: dup_x2
    //   6756: dup_x2
    //   6757: pop
    //   6758: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6761: iconst_2
    //   6762: swap
    //   6763: aastore
    //   6764: dup_x1
    //   6765: swap
    //   6766: iconst_1
    //   6767: swap
    //   6768: aastore
    //   6769: dup_x1
    //   6770: swap
    //   6771: iconst_0
    //   6772: swap
    //   6773: aastore
    //   6774: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   6777: iconst_1
    //   6778: ireturn
    //   6779: aload_0
    //   6780: aload_1
    //   6781: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mh : Ljava/lang/String;
    //   6784: lload #13
    //   6786: iconst_3
    //   6787: anewarray java/lang/Object
    //   6790: dup_x2
    //   6791: dup_x2
    //   6792: pop
    //   6793: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6796: iconst_2
    //   6797: swap
    //   6798: aastore
    //   6799: dup_x1
    //   6800: swap
    //   6801: iconst_1
    //   6802: swap
    //   6803: aastore
    //   6804: dup_x1
    //   6805: swap
    //   6806: iconst_0
    //   6807: swap
    //   6808: aastore
    //   6809: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   6812: iconst_1
    //   6813: ireturn
    //   6814: aload_0
    //   6815: aload_1
    //   6816: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   6819: lload #13
    //   6821: iconst_3
    //   6822: anewarray java/lang/Object
    //   6825: dup_x2
    //   6826: dup_x2
    //   6827: pop
    //   6828: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6831: iconst_2
    //   6832: swap
    //   6833: aastore
    //   6834: dup_x1
    //   6835: swap
    //   6836: iconst_1
    //   6837: swap
    //   6838: aastore
    //   6839: dup_x1
    //   6840: swap
    //   6841: iconst_0
    //   6842: swap
    //   6843: aastore
    //   6844: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   6847: iconst_1
    //   6848: ireturn
    //   6849: aload #4
    //   6851: iconst_0
    //   6852: aaload
    //   6853: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6856: astore #116
    //   6858: aload #116
    //   6860: sipush #156
    //   6863: aaload
    //   6864: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   6867: aload #23
    //   6869: ifnull -> 7228
    //   6872: ifeq -> 7211
    //   6875: goto -> 6882
    //   6878: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6881: athrow
    //   6882: aload_1
    //   6883: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6886: bipush #62
    //   6888: aaload
    //   6889: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   6894: aload #23
    //   6896: ifnull -> 7210
    //   6899: goto -> 6906
    //   6902: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6905: athrow
    //   6906: ifeq -> 7176
    //   6909: goto -> 6916
    //   6912: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6915: athrow
    //   6916: aload_1
    //   6917: instanceof org/bukkit/entity/Player
    //   6920: aload #23
    //   6922: ifnull -> 7175
    //   6925: goto -> 6932
    //   6928: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6931: athrow
    //   6932: ifeq -> 7134
    //   6935: goto -> 6942
    //   6938: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6941: athrow
    //   6942: aload #4
    //   6944: aload #23
    //   6946: ifnull -> 7026
    //   6949: goto -> 6956
    //   6952: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6955: athrow
    //   6956: arraylength
    //   6957: iconst_1
    //   6958: if_icmpne -> 7017
    //   6961: goto -> 6968
    //   6964: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6967: athrow
    //   6968: aload_0
    //   6969: aload_1
    //   6970: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   6973: sipush #160
    //   6976: aaload
    //   6977: lload #13
    //   6979: iconst_3
    //   6980: anewarray java/lang/Object
    //   6983: dup_x2
    //   6984: dup_x2
    //   6985: pop
    //   6986: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6989: iconst_2
    //   6990: swap
    //   6991: aastore
    //   6992: dup_x1
    //   6993: swap
    //   6994: iconst_1
    //   6995: swap
    //   6996: aastore
    //   6997: dup_x1
    //   6998: swap
    //   6999: iconst_0
    //   7000: swap
    //   7001: aastore
    //   7002: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7005: aload #23
    //   7007: ifnonnull -> 14807
    //   7010: goto -> 7017
    //   7013: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7016: athrow
    //   7017: aload #4
    //   7019: goto -> 7026
    //   7022: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7025: athrow
    //   7026: iconst_1
    //   7027: aaload
    //   7028: astore #24
    //   7030: aload #24
    //   7032: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   7035: astore #25
    //   7037: aload #25
    //   7039: aload #23
    //   7041: ifnull -> 7110
    //   7044: ifnonnull -> 7099
    //   7047: goto -> 7054
    //   7050: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7053: athrow
    //   7054: aload_0
    //   7055: aload_1
    //   7056: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   7059: lload #13
    //   7061: iconst_3
    //   7062: anewarray java/lang/Object
    //   7065: dup_x2
    //   7066: dup_x2
    //   7067: pop
    //   7068: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7071: iconst_2
    //   7072: swap
    //   7073: aastore
    //   7074: dup_x1
    //   7075: swap
    //   7076: iconst_1
    //   7077: swap
    //   7078: aastore
    //   7079: dup_x1
    //   7080: swap
    //   7081: iconst_0
    //   7082: swap
    //   7083: aastore
    //   7084: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7087: aload #23
    //   7089: ifnonnull -> 7129
    //   7092: goto -> 7099
    //   7095: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7098: athrow
    //   7099: aload_1
    //   7100: checkcast org/bukkit/entity/Player
    //   7103: goto -> 7110
    //   7106: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7109: athrow
    //   7110: astore #26
    //   7112: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L0 : Ljava/util/List;
    //   7115: aload #26
    //   7117: aload #25
    //   7119: <illegal opcode> accept : (Lorg/bukkit/entity/Player;Lorg/bukkit/entity/Player;)Ljava/util/function/Consumer;
    //   7124: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   7129: aload #23
    //   7131: ifnonnull -> 14807
    //   7134: aload_0
    //   7135: aload_1
    //   7136: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mh : Ljava/lang/String;
    //   7139: lload #13
    //   7141: iconst_3
    //   7142: anewarray java/lang/Object
    //   7145: dup_x2
    //   7146: dup_x2
    //   7147: pop
    //   7148: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7151: iconst_2
    //   7152: swap
    //   7153: aastore
    //   7154: dup_x1
    //   7155: swap
    //   7156: iconst_1
    //   7157: swap
    //   7158: aastore
    //   7159: dup_x1
    //   7160: swap
    //   7161: iconst_0
    //   7162: swap
    //   7163: aastore
    //   7164: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7167: iconst_1
    //   7168: goto -> 7175
    //   7171: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7174: athrow
    //   7175: ireturn
    //   7176: aload_0
    //   7177: aload_1
    //   7178: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   7181: lload #13
    //   7183: iconst_3
    //   7184: anewarray java/lang/Object
    //   7187: dup_x2
    //   7188: dup_x2
    //   7189: pop
    //   7190: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7193: iconst_2
    //   7194: swap
    //   7195: aastore
    //   7196: dup_x1
    //   7197: swap
    //   7198: iconst_1
    //   7199: swap
    //   7200: aastore
    //   7201: dup_x1
    //   7202: swap
    //   7203: iconst_0
    //   7204: swap
    //   7205: aastore
    //   7206: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7209: iconst_1
    //   7210: ireturn
    //   7211: aload #4
    //   7213: iconst_0
    //   7214: aaload
    //   7215: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   7218: astore #116
    //   7220: aload #116
    //   7222: bipush #45
    //   7224: aaload
    //   7225: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   7228: aload #23
    //   7230: ifnull -> 7614
    //   7233: ifeq -> 7596
    //   7236: goto -> 7243
    //   7239: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7242: athrow
    //   7243: aload_1
    //   7244: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   7247: bipush #41
    //   7249: aaload
    //   7250: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   7255: aload #23
    //   7257: ifnull -> 7595
    //   7260: goto -> 7267
    //   7263: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7266: athrow
    //   7267: ifeq -> 7554
    //   7270: goto -> 7277
    //   7273: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7276: athrow
    //   7277: aload #4
    //   7279: aload #23
    //   7281: ifnull -> 7357
    //   7284: goto -> 7291
    //   7287: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7290: athrow
    //   7291: arraylength
    //   7292: iconst_1
    //   7293: if_icmpne -> 7348
    //   7296: goto -> 7303
    //   7299: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7302: athrow
    //   7303: aload_0
    //   7304: aload_1
    //   7305: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LQ : Ljava/lang/String;
    //   7308: lload #13
    //   7310: iconst_3
    //   7311: anewarray java/lang/Object
    //   7314: dup_x2
    //   7315: dup_x2
    //   7316: pop
    //   7317: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7320: iconst_2
    //   7321: swap
    //   7322: aastore
    //   7323: dup_x1
    //   7324: swap
    //   7325: iconst_1
    //   7326: swap
    //   7327: aastore
    //   7328: dup_x1
    //   7329: swap
    //   7330: iconst_0
    //   7331: swap
    //   7332: aastore
    //   7333: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7336: aload #23
    //   7338: ifnonnull -> 14807
    //   7341: goto -> 7348
    //   7344: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7347: athrow
    //   7348: aload #4
    //   7350: goto -> 7357
    //   7353: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7356: athrow
    //   7357: iconst_1
    //   7358: aaload
    //   7359: astore #24
    //   7361: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   7364: aload #24
    //   7366: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   7371: aload #23
    //   7373: ifnull -> 7548
    //   7376: ifeq -> 7507
    //   7379: goto -> 7386
    //   7382: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7385: athrow
    //   7386: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   7389: aload #24
    //   7391: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7396: checkcast java/lang/Boolean
    //   7399: invokevirtual booleanValue : ()Z
    //   7402: aload #23
    //   7404: ifnull -> 7548
    //   7407: goto -> 7414
    //   7410: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7413: athrow
    //   7414: ifeq -> 7507
    //   7417: goto -> 7424
    //   7420: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7423: athrow
    //   7424: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   7427: aload #24
    //   7429: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7434: pop
    //   7435: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   7438: aload #24
    //   7440: iconst_0
    //   7441: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7444: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7449: pop
    //   7450: aload_0
    //   7451: aload_1
    //   7452: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dq : Ljava/lang/String;
    //   7455: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   7458: sipush #163
    //   7461: aaload
    //   7462: aload #24
    //   7464: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   7467: lload #13
    //   7469: iconst_3
    //   7470: anewarray java/lang/Object
    //   7473: dup_x2
    //   7474: dup_x2
    //   7475: pop
    //   7476: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7479: iconst_2
    //   7480: swap
    //   7481: aastore
    //   7482: dup_x1
    //   7483: swap
    //   7484: iconst_1
    //   7485: swap
    //   7486: aastore
    //   7487: dup_x1
    //   7488: swap
    //   7489: iconst_0
    //   7490: swap
    //   7491: aastore
    //   7492: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7495: aload #23
    //   7497: ifnonnull -> 7549
    //   7500: goto -> 7507
    //   7503: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7506: athrow
    //   7507: aload_0
    //   7508: aload_1
    //   7509: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dN : Ljava/lang/String;
    //   7512: lload #13
    //   7514: iconst_3
    //   7515: anewarray java/lang/Object
    //   7518: dup_x2
    //   7519: dup_x2
    //   7520: pop
    //   7521: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7524: iconst_2
    //   7525: swap
    //   7526: aastore
    //   7527: dup_x1
    //   7528: swap
    //   7529: iconst_1
    //   7530: swap
    //   7531: aastore
    //   7532: dup_x1
    //   7533: swap
    //   7534: iconst_0
    //   7535: swap
    //   7536: aastore
    //   7537: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7540: iconst_1
    //   7541: goto -> 7548
    //   7544: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7547: athrow
    //   7548: ireturn
    //   7549: aload #23
    //   7551: ifnonnull -> 14807
    //   7554: aload_0
    //   7555: aload_1
    //   7556: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   7559: lload #13
    //   7561: iconst_3
    //   7562: anewarray java/lang/Object
    //   7565: dup_x2
    //   7566: dup_x2
    //   7567: pop
    //   7568: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7571: iconst_2
    //   7572: swap
    //   7573: aastore
    //   7574: dup_x1
    //   7575: swap
    //   7576: iconst_1
    //   7577: swap
    //   7578: aastore
    //   7579: dup_x1
    //   7580: swap
    //   7581: iconst_0
    //   7582: swap
    //   7583: aastore
    //   7584: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7587: iconst_1
    //   7588: goto -> 7595
    //   7591: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7594: athrow
    //   7595: ireturn
    //   7596: aload #4
    //   7598: iconst_0
    //   7599: aaload
    //   7600: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   7603: astore #116
    //   7605: aload #116
    //   7607: sipush #158
    //   7610: aaload
    //   7611: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   7614: aload #23
    //   7616: ifnull -> 8301
    //   7619: ifeq -> 8284
    //   7622: goto -> 7629
    //   7625: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7628: athrow
    //   7629: aload_1
    //   7630: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   7633: sipush #143
    //   7636: aaload
    //   7637: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   7642: aload #23
    //   7644: ifnull -> 8283
    //   7647: goto -> 7654
    //   7650: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7653: athrow
    //   7654: ifeq -> 8242
    //   7657: goto -> 7664
    //   7660: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7663: athrow
    //   7664: aload #4
    //   7666: aload #23
    //   7668: ifnull -> 7731
    //   7671: goto -> 7678
    //   7674: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7677: athrow
    //   7678: arraylength
    //   7679: iconst_1
    //   7680: if_icmpne -> 7729
    //   7683: goto -> 7690
    //   7686: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7689: athrow
    //   7690: aload_0
    //   7691: aload_1
    //   7692: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dE : Ljava/lang/String;
    //   7695: lload #13
    //   7697: iconst_3
    //   7698: anewarray java/lang/Object
    //   7701: dup_x2
    //   7702: dup_x2
    //   7703: pop
    //   7704: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7707: iconst_2
    //   7708: swap
    //   7709: aastore
    //   7710: dup_x1
    //   7711: swap
    //   7712: iconst_1
    //   7713: swap
    //   7714: aastore
    //   7715: dup_x1
    //   7716: swap
    //   7717: iconst_0
    //   7718: swap
    //   7719: aastore
    //   7720: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7723: iconst_1
    //   7724: ireturn
    //   7725: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7728: athrow
    //   7729: aload #4
    //   7731: iconst_1
    //   7732: aaload
    //   7733: astore #24
    //   7735: aload #24
    //   7737: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   7740: astore #25
    //   7742: aload #23
    //   7744: ifnull -> 7799
    //   7747: aload #25
    //   7749: ifnonnull -> 7801
    //   7752: goto -> 7759
    //   7755: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7758: athrow
    //   7759: aload_0
    //   7760: aload_1
    //   7761: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   7764: lload #13
    //   7766: iconst_3
    //   7767: anewarray java/lang/Object
    //   7770: dup_x2
    //   7771: dup_x2
    //   7772: pop
    //   7773: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7776: iconst_2
    //   7777: swap
    //   7778: aastore
    //   7779: dup_x1
    //   7780: swap
    //   7781: iconst_1
    //   7782: swap
    //   7783: aastore
    //   7784: dup_x1
    //   7785: swap
    //   7786: iconst_0
    //   7787: swap
    //   7788: aastore
    //   7789: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7792: goto -> 7799
    //   7795: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7798: athrow
    //   7799: iconst_1
    //   7800: ireturn
    //   7801: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   7804: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   7807: aload #25
    //   7809: iconst_1
    //   7810: anewarray java/lang/Object
    //   7813: dup_x1
    //   7814: swap
    //   7815: iconst_0
    //   7816: swap
    //   7817: aastore
    //   7818: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   7821: astore #26
    //   7823: aload #26
    //   7825: aload #23
    //   7827: ifnull -> 7881
    //   7830: ifnonnull -> 7879
    //   7833: goto -> 7840
    //   7836: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7839: athrow
    //   7840: aload_0
    //   7841: aload_1
    //   7842: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   7845: lload #13
    //   7847: iconst_3
    //   7848: anewarray java/lang/Object
    //   7851: dup_x2
    //   7852: dup_x2
    //   7853: pop
    //   7854: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7857: iconst_2
    //   7858: swap
    //   7859: aastore
    //   7860: dup_x1
    //   7861: swap
    //   7862: iconst_1
    //   7863: swap
    //   7864: aastore
    //   7865: dup_x1
    //   7866: swap
    //   7867: iconst_0
    //   7868: swap
    //   7869: aastore
    //   7870: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7873: iconst_1
    //   7874: ireturn
    //   7875: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7878: athrow
    //   7879: aload #26
    //   7881: iconst_0
    //   7882: anewarray java/lang/Object
    //   7885: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   7888: iconst_0
    //   7889: anewarray java/lang/Object
    //   7892: invokevirtual aegisguard_C_ : ([Ljava/lang/Object;)Z
    //   7895: istore #27
    //   7897: aload #23
    //   7899: ifnull -> 8157
    //   7902: iload #27
    //   7904: ifeq -> 8076
    //   7907: goto -> 7914
    //   7910: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   7913: athrow
    //   7914: aload #26
    //   7916: iconst_0
    //   7917: anewarray java/lang/Object
    //   7920: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   7923: iconst_0
    //   7924: iconst_1
    //   7925: anewarray java/lang/Object
    //   7928: dup_x1
    //   7929: swap
    //   7930: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7933: iconst_0
    //   7934: swap
    //   7935: aastore
    //   7936: invokevirtual aegisguard_Xn : ([Ljava/lang/Object;)V
    //   7939: aload_0
    //   7940: aload_1
    //   7941: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yD : Ljava/lang/String;
    //   7944: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   7947: bipush #52
    //   7949: aaload
    //   7950: aload #25
    //   7952: invokeinterface getName : ()Ljava/lang/String;
    //   7957: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   7960: lload #13
    //   7962: iconst_3
    //   7963: anewarray java/lang/Object
    //   7966: dup_x2
    //   7967: dup_x2
    //   7968: pop
    //   7969: invokestatic valueOf : (J)Ljava/lang/Long;
    //   7972: iconst_2
    //   7973: swap
    //   7974: aastore
    //   7975: dup_x1
    //   7976: swap
    //   7977: iconst_1
    //   7978: swap
    //   7979: aastore
    //   7980: dup_x1
    //   7981: swap
    //   7982: iconst_0
    //   7983: swap
    //   7984: aastore
    //   7985: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   7988: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   7991: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   7994: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gl : Ljava/lang/String;
    //   7997: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8000: bipush #52
    //   8002: aaload
    //   8003: aload #25
    //   8005: invokeinterface getName : ()Ljava/lang/String;
    //   8010: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8013: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8016: iconst_2
    //   8017: aaload
    //   8018: aload_1
    //   8019: invokeinterface getName : ()Ljava/lang/String;
    //   8024: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8027: lload #9
    //   8029: dup2_x1
    //   8030: pop2
    //   8031: iconst_2
    //   8032: anewarray java/lang/Object
    //   8035: dup_x1
    //   8036: swap
    //   8037: iconst_1
    //   8038: swap
    //   8039: aastore
    //   8040: dup_x2
    //   8041: dup_x2
    //   8042: pop
    //   8043: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8046: iconst_0
    //   8047: swap
    //   8048: aastore
    //   8049: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   8052: iconst_1
    //   8053: anewarray java/lang/Object
    //   8056: dup_x1
    //   8057: swap
    //   8058: iconst_0
    //   8059: swap
    //   8060: aastore
    //   8061: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   8064: aload #23
    //   8066: ifnonnull -> 8237
    //   8069: goto -> 8076
    //   8072: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8075: athrow
    //   8076: aload #26
    //   8078: iconst_0
    //   8079: anewarray java/lang/Object
    //   8082: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   8085: iconst_1
    //   8086: iconst_1
    //   8087: anewarray java/lang/Object
    //   8090: dup_x1
    //   8091: swap
    //   8092: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   8095: iconst_0
    //   8096: swap
    //   8097: aastore
    //   8098: invokevirtual aegisguard_Xn : ([Ljava/lang/Object;)V
    //   8101: aload_0
    //   8102: aload_1
    //   8103: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dc : Ljava/lang/String;
    //   8106: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8109: bipush #52
    //   8111: aaload
    //   8112: aload #25
    //   8114: invokeinterface getName : ()Ljava/lang/String;
    //   8119: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8122: lload #13
    //   8124: iconst_3
    //   8125: anewarray java/lang/Object
    //   8128: dup_x2
    //   8129: dup_x2
    //   8130: pop
    //   8131: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8134: iconst_2
    //   8135: swap
    //   8136: aastore
    //   8137: dup_x1
    //   8138: swap
    //   8139: iconst_1
    //   8140: swap
    //   8141: aastore
    //   8142: dup_x1
    //   8143: swap
    //   8144: iconst_0
    //   8145: swap
    //   8146: aastore
    //   8147: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   8150: goto -> 8157
    //   8153: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8156: athrow
    //   8157: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   8160: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   8163: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LY : Ljava/lang/String;
    //   8166: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8169: astore #116
    //   8171: aload #116
    //   8173: bipush #52
    //   8175: aaload
    //   8176: aload #25
    //   8178: invokeinterface getName : ()Ljava/lang/String;
    //   8183: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8186: aload #116
    //   8188: bipush #91
    //   8190: aaload
    //   8191: aload_1
    //   8192: invokeinterface getName : ()Ljava/lang/String;
    //   8197: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8200: lload #9
    //   8202: dup2_x1
    //   8203: pop2
    //   8204: iconst_2
    //   8205: anewarray java/lang/Object
    //   8208: dup_x1
    //   8209: swap
    //   8210: iconst_1
    //   8211: swap
    //   8212: aastore
    //   8213: dup_x2
    //   8214: dup_x2
    //   8215: pop
    //   8216: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8219: iconst_0
    //   8220: swap
    //   8221: aastore
    //   8222: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   8225: iconst_1
    //   8226: anewarray java/lang/Object
    //   8229: dup_x1
    //   8230: swap
    //   8231: iconst_0
    //   8232: swap
    //   8233: aastore
    //   8234: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   8237: aload #23
    //   8239: ifnonnull -> 14807
    //   8242: aload_0
    //   8243: aload_1
    //   8244: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   8247: lload #13
    //   8249: iconst_3
    //   8250: anewarray java/lang/Object
    //   8253: dup_x2
    //   8254: dup_x2
    //   8255: pop
    //   8256: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8259: iconst_2
    //   8260: swap
    //   8261: aastore
    //   8262: dup_x1
    //   8263: swap
    //   8264: iconst_1
    //   8265: swap
    //   8266: aastore
    //   8267: dup_x1
    //   8268: swap
    //   8269: iconst_0
    //   8270: swap
    //   8271: aastore
    //   8272: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   8275: iconst_1
    //   8276: goto -> 8283
    //   8279: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8282: athrow
    //   8283: ireturn
    //   8284: aload #4
    //   8286: iconst_0
    //   8287: aaload
    //   8288: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8291: astore #116
    //   8293: aload #116
    //   8295: bipush #18
    //   8297: aaload
    //   8298: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   8301: aload #23
    //   8303: ifnull -> 8852
    //   8306: ifeq -> 8834
    //   8309: goto -> 8316
    //   8312: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8315: athrow
    //   8316: aload_1
    //   8317: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8320: bipush #111
    //   8322: aaload
    //   8323: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   8328: aload #23
    //   8330: ifnull -> 8833
    //   8333: goto -> 8340
    //   8336: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8339: athrow
    //   8340: ifeq -> 8792
    //   8343: goto -> 8350
    //   8346: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8349: athrow
    //   8350: aload #4
    //   8352: aload #23
    //   8354: ifnull -> 8430
    //   8357: goto -> 8364
    //   8360: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8363: athrow
    //   8364: arraylength
    //   8365: iconst_1
    //   8366: if_icmpne -> 8421
    //   8369: goto -> 8376
    //   8372: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8375: athrow
    //   8376: aload_0
    //   8377: aload_1
    //   8378: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lf : Ljava/lang/String;
    //   8381: lload #13
    //   8383: iconst_3
    //   8384: anewarray java/lang/Object
    //   8387: dup_x2
    //   8388: dup_x2
    //   8389: pop
    //   8390: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8393: iconst_2
    //   8394: swap
    //   8395: aastore
    //   8396: dup_x1
    //   8397: swap
    //   8398: iconst_1
    //   8399: swap
    //   8400: aastore
    //   8401: dup_x1
    //   8402: swap
    //   8403: iconst_0
    //   8404: swap
    //   8405: aastore
    //   8406: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   8409: aload #23
    //   8411: ifnonnull -> 14807
    //   8414: goto -> 8421
    //   8417: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8420: athrow
    //   8421: aload #4
    //   8423: goto -> 8430
    //   8426: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8429: athrow
    //   8430: iconst_1
    //   8431: aaload
    //   8432: astore #24
    //   8434: aload #24
    //   8436: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   8439: astore #25
    //   8441: aload #23
    //   8443: ifnull -> 8498
    //   8446: aload #25
    //   8448: ifnonnull -> 8500
    //   8451: goto -> 8458
    //   8454: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8457: athrow
    //   8458: aload_0
    //   8459: aload_1
    //   8460: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   8463: lload #13
    //   8465: iconst_3
    //   8466: anewarray java/lang/Object
    //   8469: dup_x2
    //   8470: dup_x2
    //   8471: pop
    //   8472: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8475: iconst_2
    //   8476: swap
    //   8477: aastore
    //   8478: dup_x1
    //   8479: swap
    //   8480: iconst_1
    //   8481: swap
    //   8482: aastore
    //   8483: dup_x1
    //   8484: swap
    //   8485: iconst_0
    //   8486: swap
    //   8487: aastore
    //   8488: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   8491: goto -> 8498
    //   8494: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8497: athrow
    //   8498: iconst_1
    //   8499: ireturn
    //   8500: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L3 : Ljava/util/List;
    //   8503: invokeinterface iterator : ()Ljava/util/Iterator;
    //   8508: astore #26
    //   8510: aload #26
    //   8512: invokeinterface hasNext : ()Z
    //   8517: ifeq -> 8772
    //   8520: aload #26
    //   8522: invokeinterface next : ()Ljava/lang/Object;
    //   8527: checkcast java/lang/String
    //   8530: astore #27
    //   8532: aload #23
    //   8534: ifnull -> 8694
    //   8537: aload #27
    //   8539: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8542: sipush #175
    //   8545: aaload
    //   8546: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   8549: aload #23
    //   8551: ifnull -> 14808
    //   8554: goto -> 8561
    //   8557: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8560: athrow
    //   8561: ifne -> 8604
    //   8564: goto -> 8571
    //   8567: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8570: athrow
    //   8571: aload #27
    //   8573: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8576: bipush #113
    //   8578: aaload
    //   8579: aload #23
    //   8581: ifnull -> 8714
    //   8584: goto -> 8591
    //   8587: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8590: athrow
    //   8591: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   8594: ifeq -> 8699
    //   8597: goto -> 8604
    //   8600: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8603: athrow
    //   8604: aload_0
    //   8605: aload #25
    //   8607: aload #27
    //   8609: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8612: bipush #64
    //   8614: aaload
    //   8615: ldc_w ''
    //   8618: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8621: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8624: sipush #176
    //   8627: aaload
    //   8628: ldc_w ''
    //   8631: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8634: lload #9
    //   8636: dup2_x1
    //   8637: pop2
    //   8638: iconst_2
    //   8639: anewarray java/lang/Object
    //   8642: dup_x1
    //   8643: swap
    //   8644: iconst_1
    //   8645: swap
    //   8646: aastore
    //   8647: dup_x2
    //   8648: dup_x2
    //   8649: pop
    //   8650: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8653: iconst_0
    //   8654: swap
    //   8655: aastore
    //   8656: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   8659: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8662: bipush #52
    //   8664: aaload
    //   8665: aload #24
    //   8667: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8670: iconst_2
    //   8671: anewarray java/lang/Object
    //   8674: dup_x1
    //   8675: swap
    //   8676: iconst_1
    //   8677: swap
    //   8678: aastore
    //   8679: dup_x1
    //   8680: swap
    //   8681: iconst_0
    //   8682: swap
    //   8683: aastore
    //   8684: invokespecial aegisguard_w : ([Ljava/lang/Object;)V
    //   8687: goto -> 8694
    //   8690: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8693: athrow
    //   8694: aload #23
    //   8696: ifnonnull -> 8767
    //   8699: aload #27
    //   8701: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8704: bipush #52
    //   8706: aaload
    //   8707: goto -> 8714
    //   8710: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8713: athrow
    //   8714: aload #24
    //   8716: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8719: lload #9
    //   8721: dup2_x1
    //   8722: pop2
    //   8723: iconst_2
    //   8724: anewarray java/lang/Object
    //   8727: dup_x1
    //   8728: swap
    //   8729: iconst_1
    //   8730: swap
    //   8731: aastore
    //   8732: dup_x2
    //   8733: dup_x2
    //   8734: pop
    //   8735: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8738: iconst_0
    //   8739: swap
    //   8740: aastore
    //   8741: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   8744: lload #11
    //   8746: iconst_2
    //   8747: anewarray java/lang/Object
    //   8750: dup_x2
    //   8751: dup_x2
    //   8752: pop
    //   8753: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8756: iconst_1
    //   8757: swap
    //   8758: aastore
    //   8759: dup_x1
    //   8760: swap
    //   8761: iconst_0
    //   8762: swap
    //   8763: aastore
    //   8764: invokestatic aegisguard_k : ([Ljava/lang/Object;)V
    //   8767: aload #23
    //   8769: ifnonnull -> 8510
    //   8772: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LK : Ljava/util/List;
    //   8775: aload #24
    //   8777: <illegal opcode> accept : (Ljava/lang/String;)Ljava/util/function/Consumer;
    //   8782: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   8787: aload #23
    //   8789: ifnonnull -> 14807
    //   8792: aload_0
    //   8793: aload_1
    //   8794: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   8797: lload #13
    //   8799: iconst_3
    //   8800: anewarray java/lang/Object
    //   8803: dup_x2
    //   8804: dup_x2
    //   8805: pop
    //   8806: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8809: iconst_2
    //   8810: swap
    //   8811: aastore
    //   8812: dup_x1
    //   8813: swap
    //   8814: iconst_1
    //   8815: swap
    //   8816: aastore
    //   8817: dup_x1
    //   8818: swap
    //   8819: iconst_0
    //   8820: swap
    //   8821: aastore
    //   8822: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   8825: iconst_1
    //   8826: goto -> 8833
    //   8829: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8832: athrow
    //   8833: ireturn
    //   8834: aload #4
    //   8836: iconst_0
    //   8837: aaload
    //   8838: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8841: astore #116
    //   8843: aload #116
    //   8845: sipush #147
    //   8848: aaload
    //   8849: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   8852: aload #23
    //   8854: ifnull -> 9147
    //   8857: ifeq -> 9126
    //   8860: goto -> 8867
    //   8863: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8866: athrow
    //   8867: aload_1
    //   8868: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   8871: bipush #81
    //   8873: aaload
    //   8874: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   8879: aload #23
    //   8881: ifnull -> 14808
    //   8884: goto -> 8891
    //   8887: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8890: athrow
    //   8891: ifeq -> 14807
    //   8894: goto -> 8901
    //   8897: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8900: athrow
    //   8901: aload #4
    //   8903: aload #23
    //   8905: ifnull -> 8981
    //   8908: goto -> 8915
    //   8911: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8914: athrow
    //   8915: arraylength
    //   8916: iconst_1
    //   8917: if_icmpne -> 8972
    //   8920: goto -> 8927
    //   8923: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8926: athrow
    //   8927: aload_0
    //   8928: aload_1
    //   8929: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lt : Ljava/lang/String;
    //   8932: lload #13
    //   8934: iconst_3
    //   8935: anewarray java/lang/Object
    //   8938: dup_x2
    //   8939: dup_x2
    //   8940: pop
    //   8941: invokestatic valueOf : (J)Ljava/lang/Long;
    //   8944: iconst_2
    //   8945: swap
    //   8946: aastore
    //   8947: dup_x1
    //   8948: swap
    //   8949: iconst_1
    //   8950: swap
    //   8951: aastore
    //   8952: dup_x1
    //   8953: swap
    //   8954: iconst_0
    //   8955: swap
    //   8956: aastore
    //   8957: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   8960: aload #23
    //   8962: ifnonnull -> 14807
    //   8965: goto -> 8972
    //   8968: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8971: athrow
    //   8972: aload #4
    //   8974: goto -> 8981
    //   8977: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   8980: athrow
    //   8981: iconst_1
    //   8982: aaload
    //   8983: astore #24
    //   8985: aload #24
    //   8987: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   8990: astore #25
    //   8992: aload #23
    //   8994: ifnull -> 9119
    //   8997: aload #25
    //   8999: ifnull -> 9079
    //   9002: goto -> 9009
    //   9005: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9008: athrow
    //   9009: aload #25
    //   9011: iconst_1
    //   9012: anewarray java/lang/Object
    //   9015: dup_x1
    //   9016: swap
    //   9017: iconst_0
    //   9018: swap
    //   9019: aastore
    //   9020: invokestatic aegisguard_H : ([Ljava/lang/Object;)V
    //   9023: aload_0
    //   9024: aload_1
    //   9025: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dv : Ljava/lang/String;
    //   9028: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9031: bipush #52
    //   9033: aaload
    //   9034: aload #24
    //   9036: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   9039: lload #13
    //   9041: iconst_3
    //   9042: anewarray java/lang/Object
    //   9045: dup_x2
    //   9046: dup_x2
    //   9047: pop
    //   9048: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9051: iconst_2
    //   9052: swap
    //   9053: aastore
    //   9054: dup_x1
    //   9055: swap
    //   9056: iconst_1
    //   9057: swap
    //   9058: aastore
    //   9059: dup_x1
    //   9060: swap
    //   9061: iconst_0
    //   9062: swap
    //   9063: aastore
    //   9064: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   9067: aload #23
    //   9069: ifnonnull -> 9121
    //   9072: goto -> 9079
    //   9075: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9078: athrow
    //   9079: aload_0
    //   9080: aload_1
    //   9081: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   9084: lload #13
    //   9086: iconst_3
    //   9087: anewarray java/lang/Object
    //   9090: dup_x2
    //   9091: dup_x2
    //   9092: pop
    //   9093: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9096: iconst_2
    //   9097: swap
    //   9098: aastore
    //   9099: dup_x1
    //   9100: swap
    //   9101: iconst_1
    //   9102: swap
    //   9103: aastore
    //   9104: dup_x1
    //   9105: swap
    //   9106: iconst_0
    //   9107: swap
    //   9108: aastore
    //   9109: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   9112: goto -> 9119
    //   9115: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9118: athrow
    //   9119: iconst_1
    //   9120: ireturn
    //   9121: aload #23
    //   9123: ifnonnull -> 14807
    //   9126: aload #4
    //   9128: iconst_0
    //   9129: aaload
    //   9130: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9133: sipush #150
    //   9136: aaload
    //   9137: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   9140: goto -> 9147
    //   9143: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9146: athrow
    //   9147: aload #23
    //   9149: ifnull -> 9467
    //   9152: ifeq -> 9447
    //   9155: goto -> 9162
    //   9158: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9161: athrow
    //   9162: aload_1
    //   9163: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9166: bipush #10
    //   9168: aaload
    //   9169: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   9174: aload #23
    //   9176: ifnull -> 14808
    //   9179: goto -> 9186
    //   9182: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9185: athrow
    //   9186: ifeq -> 14807
    //   9189: goto -> 9196
    //   9192: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9195: athrow
    //   9196: aload #4
    //   9198: aload #23
    //   9200: ifnull -> 9276
    //   9203: goto -> 9210
    //   9206: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9209: athrow
    //   9210: arraylength
    //   9211: iconst_1
    //   9212: if_icmpne -> 9267
    //   9215: goto -> 9222
    //   9218: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9221: athrow
    //   9222: aload_0
    //   9223: aload_1
    //   9224: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lu : Ljava/lang/String;
    //   9227: lload #13
    //   9229: iconst_3
    //   9230: anewarray java/lang/Object
    //   9233: dup_x2
    //   9234: dup_x2
    //   9235: pop
    //   9236: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9239: iconst_2
    //   9240: swap
    //   9241: aastore
    //   9242: dup_x1
    //   9243: swap
    //   9244: iconst_1
    //   9245: swap
    //   9246: aastore
    //   9247: dup_x1
    //   9248: swap
    //   9249: iconst_0
    //   9250: swap
    //   9251: aastore
    //   9252: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   9255: aload #23
    //   9257: ifnonnull -> 14807
    //   9260: goto -> 9267
    //   9263: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9266: athrow
    //   9267: aload #4
    //   9269: goto -> 9276
    //   9272: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9275: athrow
    //   9276: iconst_1
    //   9277: aaload
    //   9278: astore #24
    //   9280: aload #24
    //   9282: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   9285: astore #25
    //   9287: aload #23
    //   9289: ifnull -> 9440
    //   9292: aload #25
    //   9294: ifnull -> 9400
    //   9297: goto -> 9304
    //   9300: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9303: athrow
    //   9304: aload #25
    //   9306: iconst_1
    //   9307: anewarray java/lang/Object
    //   9310: dup_x1
    //   9311: swap
    //   9312: iconst_0
    //   9313: swap
    //   9314: aastore
    //   9315: invokestatic aegisguard_f : ([Ljava/lang/Object;)V
    //   9318: aload #23
    //   9320: ifnull -> 9395
    //   9323: goto -> 9330
    //   9326: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9329: athrow
    //   9330: aload_1
    //   9331: instanceof org/bukkit/entity/Player
    //   9334: ifeq -> 9442
    //   9337: goto -> 9344
    //   9340: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9343: athrow
    //   9344: aload_0
    //   9345: aload_1
    //   9346: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GT : Ljava/lang/String;
    //   9349: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9352: bipush #52
    //   9354: aaload
    //   9355: aload #24
    //   9357: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   9360: lload #13
    //   9362: iconst_3
    //   9363: anewarray java/lang/Object
    //   9366: dup_x2
    //   9367: dup_x2
    //   9368: pop
    //   9369: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9372: iconst_2
    //   9373: swap
    //   9374: aastore
    //   9375: dup_x1
    //   9376: swap
    //   9377: iconst_1
    //   9378: swap
    //   9379: aastore
    //   9380: dup_x1
    //   9381: swap
    //   9382: iconst_0
    //   9383: swap
    //   9384: aastore
    //   9385: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   9388: goto -> 9395
    //   9391: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9394: athrow
    //   9395: aload #23
    //   9397: ifnonnull -> 9442
    //   9400: aload_0
    //   9401: aload_1
    //   9402: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   9405: lload #13
    //   9407: iconst_3
    //   9408: anewarray java/lang/Object
    //   9411: dup_x2
    //   9412: dup_x2
    //   9413: pop
    //   9414: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9417: iconst_2
    //   9418: swap
    //   9419: aastore
    //   9420: dup_x1
    //   9421: swap
    //   9422: iconst_1
    //   9423: swap
    //   9424: aastore
    //   9425: dup_x1
    //   9426: swap
    //   9427: iconst_0
    //   9428: swap
    //   9429: aastore
    //   9430: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   9433: goto -> 9440
    //   9436: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9439: athrow
    //   9440: iconst_1
    //   9441: ireturn
    //   9442: aload #23
    //   9444: ifnonnull -> 14807
    //   9447: aload #4
    //   9449: iconst_0
    //   9450: aaload
    //   9451: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9454: bipush #59
    //   9456: aaload
    //   9457: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   9460: goto -> 9467
    //   9463: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9466: athrow
    //   9467: aload #23
    //   9469: ifnull -> 10199
    //   9472: ifeq -> 10181
    //   9475: goto -> 9482
    //   9478: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9481: athrow
    //   9482: aload_1
    //   9483: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9486: bipush #117
    //   9488: aaload
    //   9489: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   9494: aload #23
    //   9496: ifnull -> 10180
    //   9499: goto -> 9506
    //   9502: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9505: athrow
    //   9506: ifeq -> 10139
    //   9509: goto -> 9516
    //   9512: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9515: athrow
    //   9516: aload #4
    //   9518: aload #23
    //   9520: ifnull -> 9596
    //   9523: goto -> 9530
    //   9526: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9529: athrow
    //   9530: arraylength
    //   9531: iconst_1
    //   9532: if_icmpne -> 9587
    //   9535: goto -> 9542
    //   9538: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9541: athrow
    //   9542: aload_0
    //   9543: aload_1
    //   9544: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_ML : Ljava/lang/String;
    //   9547: lload #13
    //   9549: iconst_3
    //   9550: anewarray java/lang/Object
    //   9553: dup_x2
    //   9554: dup_x2
    //   9555: pop
    //   9556: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9559: iconst_2
    //   9560: swap
    //   9561: aastore
    //   9562: dup_x1
    //   9563: swap
    //   9564: iconst_1
    //   9565: swap
    //   9566: aastore
    //   9567: dup_x1
    //   9568: swap
    //   9569: iconst_0
    //   9570: swap
    //   9571: aastore
    //   9572: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   9575: aload #23
    //   9577: ifnonnull -> 14807
    //   9580: goto -> 9587
    //   9583: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9586: athrow
    //   9587: aload #4
    //   9589: goto -> 9596
    //   9592: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9595: athrow
    //   9596: iconst_1
    //   9597: aaload
    //   9598: astore #24
    //   9600: aload #24
    //   9602: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   9605: astore #25
    //   9607: aload #23
    //   9609: ifnull -> 10132
    //   9612: aload #25
    //   9614: ifnull -> 10092
    //   9617: goto -> 9624
    //   9620: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9623: athrow
    //   9624: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   9627: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   9630: aload #25
    //   9632: iconst_1
    //   9633: anewarray java/lang/Object
    //   9636: dup_x1
    //   9637: swap
    //   9638: iconst_0
    //   9639: swap
    //   9640: aastore
    //   9641: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   9644: astore #26
    //   9646: aload #23
    //   9648: ifnull -> 10085
    //   9651: aload #26
    //   9653: ifnull -> 10045
    //   9656: goto -> 9663
    //   9659: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9662: athrow
    //   9663: aload #26
    //   9665: invokevirtual getTotalViolations : ()I
    //   9668: istore #27
    //   9670: aload #23
    //   9672: ifnull -> 9832
    //   9675: iload #27
    //   9677: iconst_1
    //   9678: if_icmpge -> 9727
    //   9681: goto -> 9688
    //   9684: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9687: athrow
    //   9688: aload_0
    //   9689: aload_1
    //   9690: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GN : Ljava/lang/String;
    //   9693: lload #13
    //   9695: iconst_3
    //   9696: anewarray java/lang/Object
    //   9699: dup_x2
    //   9700: dup_x2
    //   9701: pop
    //   9702: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9705: iconst_2
    //   9706: swap
    //   9707: aastore
    //   9708: dup_x1
    //   9709: swap
    //   9710: iconst_1
    //   9711: swap
    //   9712: aastore
    //   9713: dup_x1
    //   9714: swap
    //   9715: iconst_0
    //   9716: swap
    //   9717: aastore
    //   9718: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   9721: iconst_1
    //   9722: ireturn
    //   9723: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9726: athrow
    //   9727: aload_0
    //   9728: aload_1
    //   9729: lload #21
    //   9731: iconst_2
    //   9732: anewarray java/lang/Object
    //   9735: dup_x2
    //   9736: dup_x2
    //   9737: pop
    //   9738: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9741: iconst_1
    //   9742: swap
    //   9743: aastore
    //   9744: dup_x1
    //   9745: swap
    //   9746: iconst_0
    //   9747: swap
    //   9748: aastore
    //   9749: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   9752: aload_0
    //   9753: aload_1
    //   9754: new java/lang/StringBuilder
    //   9757: dup
    //   9758: invokespecial <init> : ()V
    //   9761: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9764: astore #116
    //   9766: aload #116
    //   9768: bipush #76
    //   9770: aaload
    //   9771: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9774: aload #24
    //   9776: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9779: aload #116
    //   9781: sipush #129
    //   9784: aaload
    //   9785: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9788: iload #27
    //   9790: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   9793: aload #116
    //   9795: bipush #8
    //   9797: aaload
    //   9798: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9801: invokevirtual toString : ()Ljava/lang/String;
    //   9804: lload #13
    //   9806: iconst_3
    //   9807: anewarray java/lang/Object
    //   9810: dup_x2
    //   9811: dup_x2
    //   9812: pop
    //   9813: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9816: iconst_2
    //   9817: swap
    //   9818: aastore
    //   9819: dup_x1
    //   9820: swap
    //   9821: iconst_1
    //   9822: swap
    //   9823: aastore
    //   9824: dup_x1
    //   9825: swap
    //   9826: iconst_0
    //   9827: swap
    //   9828: aastore
    //   9829: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   9832: aload #26
    //   9834: iconst_0
    //   9835: anewarray java/lang/Object
    //   9838: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   9841: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9846: astore #28
    //   9848: aload #28
    //   9850: invokeinterface hasNext : ()Z
    //   9855: ifeq -> 10015
    //   9858: aload #28
    //   9860: invokeinterface next : ()Ljava/lang/Object;
    //   9865: checkcast me/frep/aegisguard/spigot/check/AbstractCheck
    //   9868: astore #29
    //   9870: aload #29
    //   9872: invokevirtual getVl : ()I
    //   9875: aload #23
    //   9877: ifnull -> 14808
    //   9880: ifle -> 10010
    //   9883: goto -> 9890
    //   9886: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   9889: athrow
    //   9890: aload_0
    //   9891: aload_1
    //   9892: new java/lang/StringBuilder
    //   9895: dup
    //   9896: invokespecial <init> : ()V
    //   9899: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9902: bipush #78
    //   9904: aaload
    //   9905: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9908: aload #29
    //   9910: lload #15
    //   9912: iconst_1
    //   9913: anewarray java/lang/Object
    //   9916: dup_x2
    //   9917: dup_x2
    //   9918: pop
    //   9919: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9922: iconst_0
    //   9923: swap
    //   9924: aastore
    //   9925: invokevirtual aegisguard_B : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/check/api/CheckInfo;
    //   9928: invokeinterface name : ()Ljava/lang/String;
    //   9933: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9936: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9939: bipush #116
    //   9941: aaload
    //   9942: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9945: aload #29
    //   9947: invokevirtual getType : ()C
    //   9950: invokestatic toUpperCase : (C)C
    //   9953: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   9956: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   9959: iconst_0
    //   9960: aaload
    //   9961: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   9964: aload #29
    //   9966: invokevirtual getVl : ()I
    //   9969: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   9972: invokevirtual toString : ()Ljava/lang/String;
    //   9975: lload #13
    //   9977: iconst_3
    //   9978: anewarray java/lang/Object
    //   9981: dup_x2
    //   9982: dup_x2
    //   9983: pop
    //   9984: invokestatic valueOf : (J)Ljava/lang/Long;
    //   9987: iconst_2
    //   9988: swap
    //   9989: aastore
    //   9990: dup_x1
    //   9991: swap
    //   9992: iconst_1
    //   9993: swap
    //   9994: aastore
    //   9995: dup_x1
    //   9996: swap
    //   9997: iconst_0
    //   9998: swap
    //   9999: aastore
    //   10000: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10003: goto -> 10010
    //   10006: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10009: athrow
    //   10010: aload #23
    //   10012: ifnonnull -> 9848
    //   10015: aload_0
    //   10016: aload_1
    //   10017: lload #21
    //   10019: iconst_2
    //   10020: anewarray java/lang/Object
    //   10023: dup_x2
    //   10024: dup_x2
    //   10025: pop
    //   10026: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10029: iconst_1
    //   10030: swap
    //   10031: aastore
    //   10032: dup_x1
    //   10033: swap
    //   10034: iconst_0
    //   10035: swap
    //   10036: aastore
    //   10037: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   10040: aload #23
    //   10042: ifnonnull -> 10087
    //   10045: aload_0
    //   10046: aload_1
    //   10047: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   10050: lload #13
    //   10052: iconst_3
    //   10053: anewarray java/lang/Object
    //   10056: dup_x2
    //   10057: dup_x2
    //   10058: pop
    //   10059: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10062: iconst_2
    //   10063: swap
    //   10064: aastore
    //   10065: dup_x1
    //   10066: swap
    //   10067: iconst_1
    //   10068: swap
    //   10069: aastore
    //   10070: dup_x1
    //   10071: swap
    //   10072: iconst_0
    //   10073: swap
    //   10074: aastore
    //   10075: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10078: goto -> 10085
    //   10081: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10084: athrow
    //   10085: iconst_1
    //   10086: ireturn
    //   10087: aload #23
    //   10089: ifnonnull -> 10134
    //   10092: aload_0
    //   10093: aload_1
    //   10094: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   10097: lload #13
    //   10099: iconst_3
    //   10100: anewarray java/lang/Object
    //   10103: dup_x2
    //   10104: dup_x2
    //   10105: pop
    //   10106: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10109: iconst_2
    //   10110: swap
    //   10111: aastore
    //   10112: dup_x1
    //   10113: swap
    //   10114: iconst_1
    //   10115: swap
    //   10116: aastore
    //   10117: dup_x1
    //   10118: swap
    //   10119: iconst_0
    //   10120: swap
    //   10121: aastore
    //   10122: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10125: goto -> 10132
    //   10128: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10131: athrow
    //   10132: iconst_1
    //   10133: ireturn
    //   10134: aload #23
    //   10136: ifnonnull -> 14807
    //   10139: aload_0
    //   10140: aload_1
    //   10141: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   10144: lload #13
    //   10146: iconst_3
    //   10147: anewarray java/lang/Object
    //   10150: dup_x2
    //   10151: dup_x2
    //   10152: pop
    //   10153: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10156: iconst_2
    //   10157: swap
    //   10158: aastore
    //   10159: dup_x1
    //   10160: swap
    //   10161: iconst_1
    //   10162: swap
    //   10163: aastore
    //   10164: dup_x1
    //   10165: swap
    //   10166: iconst_0
    //   10167: swap
    //   10168: aastore
    //   10169: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10172: iconst_1
    //   10173: goto -> 10180
    //   10176: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10179: athrow
    //   10180: ireturn
    //   10181: aload #4
    //   10183: iconst_0
    //   10184: aaload
    //   10185: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   10188: astore #116
    //   10190: aload #116
    //   10192: sipush #171
    //   10195: aaload
    //   10196: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   10199: aload #23
    //   10201: ifnull -> 10646
    //   10204: ifeq -> 10628
    //   10207: goto -> 10214
    //   10210: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10213: athrow
    //   10214: aload_1
    //   10215: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   10218: sipush #144
    //   10221: aaload
    //   10222: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   10227: aload #23
    //   10229: ifnull -> 10627
    //   10232: goto -> 10239
    //   10235: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10238: athrow
    //   10239: ifeq -> 10586
    //   10242: goto -> 10249
    //   10245: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10248: athrow
    //   10249: aload #4
    //   10251: aload #23
    //   10253: ifnull -> 10329
    //   10256: goto -> 10263
    //   10259: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10262: athrow
    //   10263: arraylength
    //   10264: iconst_1
    //   10265: if_icmpne -> 10320
    //   10268: goto -> 10275
    //   10271: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10274: athrow
    //   10275: aload_0
    //   10276: aload_1
    //   10277: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lk : Ljava/lang/String;
    //   10280: lload #13
    //   10282: iconst_3
    //   10283: anewarray java/lang/Object
    //   10286: dup_x2
    //   10287: dup_x2
    //   10288: pop
    //   10289: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10292: iconst_2
    //   10293: swap
    //   10294: aastore
    //   10295: dup_x1
    //   10296: swap
    //   10297: iconst_1
    //   10298: swap
    //   10299: aastore
    //   10300: dup_x1
    //   10301: swap
    //   10302: iconst_0
    //   10303: swap
    //   10304: aastore
    //   10305: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10308: aload #23
    //   10310: ifnonnull -> 14807
    //   10313: goto -> 10320
    //   10316: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10319: athrow
    //   10320: aload #4
    //   10322: goto -> 10329
    //   10325: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10328: athrow
    //   10329: iconst_1
    //   10330: aaload
    //   10331: astore #24
    //   10333: aload #24
    //   10335: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   10338: astore #25
    //   10340: aload #23
    //   10342: ifnull -> 10579
    //   10345: aload #25
    //   10347: ifnull -> 10539
    //   10350: goto -> 10357
    //   10353: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10356: athrow
    //   10357: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   10360: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   10363: aload #25
    //   10365: iconst_1
    //   10366: anewarray java/lang/Object
    //   10369: dup_x1
    //   10370: swap
    //   10371: iconst_0
    //   10372: swap
    //   10373: aastore
    //   10374: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   10377: astore #26
    //   10379: aload #23
    //   10381: ifnull -> 10532
    //   10384: aload #26
    //   10386: ifnull -> 10492
    //   10389: goto -> 10396
    //   10392: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10395: athrow
    //   10396: new java/text/DecimalFormat
    //   10399: dup
    //   10400: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   10403: astore #116
    //   10405: aload #116
    //   10407: bipush #86
    //   10409: aaload
    //   10410: invokespecial <init> : (Ljava/lang/String;)V
    //   10413: aload #26
    //   10415: iconst_0
    //   10416: anewarray java/lang/Object
    //   10419: invokevirtual aegisguard_v : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XR;
    //   10422: iconst_0
    //   10423: anewarray java/lang/Object
    //   10426: invokevirtual aegisguard_W : ([Ljava/lang/Object;)D
    //   10429: invokevirtual format : (D)Ljava/lang/String;
    //   10432: astore #27
    //   10434: aload_0
    //   10435: aload_1
    //   10436: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_d5 : Ljava/lang/String;
    //   10439: aload #116
    //   10441: bipush #120
    //   10443: aaload
    //   10444: aload #27
    //   10446: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   10449: aload #116
    //   10451: bipush #52
    //   10453: aaload
    //   10454: aload #24
    //   10456: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   10459: lload #13
    //   10461: iconst_3
    //   10462: anewarray java/lang/Object
    //   10465: dup_x2
    //   10466: dup_x2
    //   10467: pop
    //   10468: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10471: iconst_2
    //   10472: swap
    //   10473: aastore
    //   10474: dup_x1
    //   10475: swap
    //   10476: iconst_1
    //   10477: swap
    //   10478: aastore
    //   10479: dup_x1
    //   10480: swap
    //   10481: iconst_0
    //   10482: swap
    //   10483: aastore
    //   10484: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10487: aload #23
    //   10489: ifnonnull -> 10534
    //   10492: aload_0
    //   10493: aload_1
    //   10494: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   10497: lload #13
    //   10499: iconst_3
    //   10500: anewarray java/lang/Object
    //   10503: dup_x2
    //   10504: dup_x2
    //   10505: pop
    //   10506: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10509: iconst_2
    //   10510: swap
    //   10511: aastore
    //   10512: dup_x1
    //   10513: swap
    //   10514: iconst_1
    //   10515: swap
    //   10516: aastore
    //   10517: dup_x1
    //   10518: swap
    //   10519: iconst_0
    //   10520: swap
    //   10521: aastore
    //   10522: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10525: goto -> 10532
    //   10528: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10531: athrow
    //   10532: iconst_1
    //   10533: ireturn
    //   10534: aload #23
    //   10536: ifnonnull -> 10581
    //   10539: aload_0
    //   10540: aload_1
    //   10541: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   10544: lload #13
    //   10546: iconst_3
    //   10547: anewarray java/lang/Object
    //   10550: dup_x2
    //   10551: dup_x2
    //   10552: pop
    //   10553: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10556: iconst_2
    //   10557: swap
    //   10558: aastore
    //   10559: dup_x1
    //   10560: swap
    //   10561: iconst_1
    //   10562: swap
    //   10563: aastore
    //   10564: dup_x1
    //   10565: swap
    //   10566: iconst_0
    //   10567: swap
    //   10568: aastore
    //   10569: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10572: goto -> 10579
    //   10575: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10578: athrow
    //   10579: iconst_1
    //   10580: ireturn
    //   10581: aload #23
    //   10583: ifnonnull -> 14807
    //   10586: aload_0
    //   10587: aload_1
    //   10588: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   10591: lload #13
    //   10593: iconst_3
    //   10594: anewarray java/lang/Object
    //   10597: dup_x2
    //   10598: dup_x2
    //   10599: pop
    //   10600: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10603: iconst_2
    //   10604: swap
    //   10605: aastore
    //   10606: dup_x1
    //   10607: swap
    //   10608: iconst_1
    //   10609: swap
    //   10610: aastore
    //   10611: dup_x1
    //   10612: swap
    //   10613: iconst_0
    //   10614: swap
    //   10615: aastore
    //   10616: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10619: iconst_1
    //   10620: goto -> 10627
    //   10623: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10626: athrow
    //   10627: ireturn
    //   10628: aload #4
    //   10630: iconst_0
    //   10631: aaload
    //   10632: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   10635: astore #116
    //   10637: aload #116
    //   10639: sipush #162
    //   10642: aaload
    //   10643: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   10646: aload #23
    //   10648: ifnull -> 10715
    //   10651: ifne -> 10696
    //   10654: goto -> 10661
    //   10657: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10660: athrow
    //   10661: aload #4
    //   10663: iconst_0
    //   10664: aaload
    //   10665: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   10668: bipush #94
    //   10670: aaload
    //   10671: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   10674: aload #23
    //   10676: ifnull -> 11053
    //   10679: goto -> 10686
    //   10682: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10685: athrow
    //   10686: ifeq -> 11036
    //   10689: goto -> 10696
    //   10692: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10695: athrow
    //   10696: aload_1
    //   10697: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   10700: bipush #102
    //   10702: aaload
    //   10703: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   10708: goto -> 10715
    //   10711: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10714: athrow
    //   10715: aload #23
    //   10717: ifnull -> 10785
    //   10720: ifne -> 10763
    //   10723: goto -> 10730
    //   10726: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10729: athrow
    //   10730: aload_1
    //   10731: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   10734: iconst_1
    //   10735: aaload
    //   10736: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   10741: aload #23
    //   10743: ifnull -> 11035
    //   10746: goto -> 10753
    //   10749: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10752: athrow
    //   10753: ifeq -> 10994
    //   10756: goto -> 10763
    //   10759: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10762: athrow
    //   10763: aload #4
    //   10765: aload #23
    //   10767: ifnull -> 10843
    //   10770: goto -> 10777
    //   10773: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10776: athrow
    //   10777: arraylength
    //   10778: goto -> 10785
    //   10781: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10784: athrow
    //   10785: iconst_1
    //   10786: if_icmpne -> 10834
    //   10789: aload_0
    //   10790: aload_1
    //   10791: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_ya : Ljava/lang/String;
    //   10794: lload #13
    //   10796: iconst_3
    //   10797: anewarray java/lang/Object
    //   10800: dup_x2
    //   10801: dup_x2
    //   10802: pop
    //   10803: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10806: iconst_2
    //   10807: swap
    //   10808: aastore
    //   10809: dup_x1
    //   10810: swap
    //   10811: iconst_1
    //   10812: swap
    //   10813: aastore
    //   10814: dup_x1
    //   10815: swap
    //   10816: iconst_0
    //   10817: swap
    //   10818: aastore
    //   10819: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10822: aload #23
    //   10824: ifnonnull -> 14807
    //   10827: goto -> 10834
    //   10830: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10833: athrow
    //   10834: aload #4
    //   10836: goto -> 10843
    //   10839: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10842: athrow
    //   10843: iconst_1
    //   10844: aaload
    //   10845: astore #24
    //   10847: aload #24
    //   10849: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   10852: astore #25
    //   10854: aload #23
    //   10856: ifnull -> 10987
    //   10859: aload #25
    //   10861: ifnull -> 10947
    //   10864: goto -> 10871
    //   10867: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10870: athrow
    //   10871: new org/bukkit/util/Vector
    //   10874: dup
    //   10875: ldc2_w 0.75
    //   10878: ldc2_w 0.5
    //   10881: ldc2_w 0.75
    //   10884: invokespecial <init> : (DDD)V
    //   10887: astore #26
    //   10889: aload #25
    //   10891: aload #26
    //   10893: invokeinterface setVelocity : (Lorg/bukkit/util/Vector;)V
    //   10898: aload_0
    //   10899: aload_1
    //   10900: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Ga : Ljava/lang/String;
    //   10903: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   10906: bipush #52
    //   10908: aaload
    //   10909: aload #24
    //   10911: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   10914: lload #13
    //   10916: iconst_3
    //   10917: anewarray java/lang/Object
    //   10920: dup_x2
    //   10921: dup_x2
    //   10922: pop
    //   10923: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10926: iconst_2
    //   10927: swap
    //   10928: aastore
    //   10929: dup_x1
    //   10930: swap
    //   10931: iconst_1
    //   10932: swap
    //   10933: aastore
    //   10934: dup_x1
    //   10935: swap
    //   10936: iconst_0
    //   10937: swap
    //   10938: aastore
    //   10939: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10942: aload #23
    //   10944: ifnonnull -> 10989
    //   10947: aload_0
    //   10948: aload_1
    //   10949: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   10952: lload #13
    //   10954: iconst_3
    //   10955: anewarray java/lang/Object
    //   10958: dup_x2
    //   10959: dup_x2
    //   10960: pop
    //   10961: invokestatic valueOf : (J)Ljava/lang/Long;
    //   10964: iconst_2
    //   10965: swap
    //   10966: aastore
    //   10967: dup_x1
    //   10968: swap
    //   10969: iconst_1
    //   10970: swap
    //   10971: aastore
    //   10972: dup_x1
    //   10973: swap
    //   10974: iconst_0
    //   10975: swap
    //   10976: aastore
    //   10977: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   10980: goto -> 10987
    //   10983: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   10986: athrow
    //   10987: iconst_1
    //   10988: ireturn
    //   10989: aload #23
    //   10991: ifnonnull -> 14807
    //   10994: aload_0
    //   10995: aload_1
    //   10996: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   10999: lload #13
    //   11001: iconst_3
    //   11002: anewarray java/lang/Object
    //   11005: dup_x2
    //   11006: dup_x2
    //   11007: pop
    //   11008: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11011: iconst_2
    //   11012: swap
    //   11013: aastore
    //   11014: dup_x1
    //   11015: swap
    //   11016: iconst_1
    //   11017: swap
    //   11018: aastore
    //   11019: dup_x1
    //   11020: swap
    //   11021: iconst_0
    //   11022: swap
    //   11023: aastore
    //   11024: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   11027: iconst_1
    //   11028: goto -> 11035
    //   11031: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11034: athrow
    //   11035: ireturn
    //   11036: aload #4
    //   11038: iconst_0
    //   11039: aaload
    //   11040: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   11043: astore #116
    //   11045: aload #116
    //   11047: bipush #88
    //   11049: aaload
    //   11050: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   11053: aload #23
    //   11055: ifnull -> 11447
    //   11058: ifeq -> 11430
    //   11061: goto -> 11068
    //   11064: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11067: athrow
    //   11068: aload_1
    //   11069: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   11072: bipush #110
    //   11074: aaload
    //   11075: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   11080: aload #23
    //   11082: ifnull -> 11429
    //   11085: goto -> 11092
    //   11088: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11091: athrow
    //   11092: ifeq -> 11388
    //   11095: goto -> 11102
    //   11098: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11101: athrow
    //   11102: aload_0
    //   11103: aload_1
    //   11104: lload #21
    //   11106: iconst_2
    //   11107: anewarray java/lang/Object
    //   11110: dup_x2
    //   11111: dup_x2
    //   11112: pop
    //   11113: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11116: iconst_1
    //   11117: swap
    //   11118: aastore
    //   11119: dup_x1
    //   11120: swap
    //   11121: iconst_0
    //   11122: swap
    //   11123: aastore
    //   11124: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   11127: aload_0
    //   11128: aload_1
    //   11129: new java/lang/StringBuilder
    //   11132: dup
    //   11133: invokespecial <init> : ()V
    //   11136: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   11139: astore #116
    //   11141: aload #116
    //   11143: sipush #154
    //   11146: aaload
    //   11147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11150: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   11153: invokeinterface size : ()I
    //   11158: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   11161: invokevirtual toString : ()Ljava/lang/String;
    //   11164: lload #13
    //   11166: iconst_3
    //   11167: anewarray java/lang/Object
    //   11170: dup_x2
    //   11171: dup_x2
    //   11172: pop
    //   11173: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11176: iconst_2
    //   11177: swap
    //   11178: aastore
    //   11179: dup_x1
    //   11180: swap
    //   11181: iconst_1
    //   11182: swap
    //   11183: aastore
    //   11184: dup_x1
    //   11185: swap
    //   11186: iconst_0
    //   11187: swap
    //   11188: aastore
    //   11189: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   11192: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   11195: invokeinterface keySet : ()Ljava/util/Set;
    //   11200: astore #24
    //   11202: new java/util/ArrayList
    //   11205: dup
    //   11206: invokespecial <init> : ()V
    //   11209: astore #25
    //   11211: aload #24
    //   11213: aload #25
    //   11215: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   11220: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   11225: aload #25
    //   11227: invokestatic sort : (Ljava/util/List;)V
    //   11230: aload #25
    //   11232: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11237: astore #26
    //   11239: aload #26
    //   11241: invokeinterface hasNext : ()Z
    //   11246: ifeq -> 11358
    //   11249: aload #26
    //   11251: invokeinterface next : ()Ljava/lang/Object;
    //   11256: checkcast java/lang/String
    //   11259: astore #27
    //   11261: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   11264: aload #27
    //   11266: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   11271: checkcast java/lang/Boolean
    //   11274: invokevirtual booleanValue : ()Z
    //   11277: aload #23
    //   11279: ifnull -> 14808
    //   11282: ifeq -> 11353
    //   11285: goto -> 11292
    //   11288: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11291: athrow
    //   11292: aload_0
    //   11293: aload_1
    //   11294: new java/lang/StringBuilder
    //   11297: dup
    //   11298: invokespecial <init> : ()V
    //   11301: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   11304: bipush #112
    //   11306: aaload
    //   11307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11310: aload #27
    //   11312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11315: invokevirtual toString : ()Ljava/lang/String;
    //   11318: lload #13
    //   11320: iconst_3
    //   11321: anewarray java/lang/Object
    //   11324: dup_x2
    //   11325: dup_x2
    //   11326: pop
    //   11327: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11330: iconst_2
    //   11331: swap
    //   11332: aastore
    //   11333: dup_x1
    //   11334: swap
    //   11335: iconst_1
    //   11336: swap
    //   11337: aastore
    //   11338: dup_x1
    //   11339: swap
    //   11340: iconst_0
    //   11341: swap
    //   11342: aastore
    //   11343: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   11346: goto -> 11353
    //   11349: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11352: athrow
    //   11353: aload #23
    //   11355: ifnonnull -> 11239
    //   11358: aload_0
    //   11359: aload_1
    //   11360: lload #21
    //   11362: iconst_2
    //   11363: anewarray java/lang/Object
    //   11366: dup_x2
    //   11367: dup_x2
    //   11368: pop
    //   11369: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11372: iconst_1
    //   11373: swap
    //   11374: aastore
    //   11375: dup_x1
    //   11376: swap
    //   11377: iconst_0
    //   11378: swap
    //   11379: aastore
    //   11380: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   11383: aload #23
    //   11385: ifnonnull -> 14807
    //   11388: aload_0
    //   11389: aload_1
    //   11390: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   11393: lload #13
    //   11395: iconst_3
    //   11396: anewarray java/lang/Object
    //   11399: dup_x2
    //   11400: dup_x2
    //   11401: pop
    //   11402: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11405: iconst_2
    //   11406: swap
    //   11407: aastore
    //   11408: dup_x1
    //   11409: swap
    //   11410: iconst_1
    //   11411: swap
    //   11412: aastore
    //   11413: dup_x1
    //   11414: swap
    //   11415: iconst_0
    //   11416: swap
    //   11417: aastore
    //   11418: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   11421: iconst_1
    //   11422: goto -> 11429
    //   11425: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11428: athrow
    //   11429: ireturn
    //   11430: aload #4
    //   11432: iconst_0
    //   11433: aaload
    //   11434: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   11437: astore #116
    //   11439: aload #116
    //   11441: bipush #65
    //   11443: aaload
    //   11444: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   11447: aload #23
    //   11449: ifnull -> 12032
    //   11452: ifeq -> 12014
    //   11455: goto -> 11462
    //   11458: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11461: athrow
    //   11462: aload_1
    //   11463: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   11466: bipush #68
    //   11468: aaload
    //   11469: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   11474: aload #23
    //   11476: ifnull -> 12013
    //   11479: goto -> 11486
    //   11482: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11485: athrow
    //   11486: ifeq -> 11972
    //   11489: goto -> 11496
    //   11492: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11495: athrow
    //   11496: aload #4
    //   11498: aload #23
    //   11500: ifnull -> 11561
    //   11503: goto -> 11510
    //   11506: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11509: athrow
    //   11510: arraylength
    //   11511: iconst_1
    //   11512: if_icmpne -> 11552
    //   11515: goto -> 11522
    //   11518: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11521: athrow
    //   11522: lload #7
    //   11524: iconst_1
    //   11525: anewarray java/lang/Object
    //   11528: dup_x2
    //   11529: dup_x2
    //   11530: pop
    //   11531: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11534: iconst_0
    //   11535: swap
    //   11536: aastore
    //   11537: invokestatic aegisguard_Z : ([Ljava/lang/Object;)V
    //   11540: aload #23
    //   11542: ifnonnull -> 14807
    //   11545: goto -> 11552
    //   11548: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11551: athrow
    //   11552: aload #4
    //   11554: goto -> 11561
    //   11557: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11560: athrow
    //   11561: iconst_1
    //   11562: aaload
    //   11563: astore #24
    //   11565: aload #24
    //   11567: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   11570: astore #25
    //   11572: aload #23
    //   11574: ifnull -> 11965
    //   11577: aload #25
    //   11579: ifnull -> 11925
    //   11582: goto -> 11589
    //   11585: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11588: athrow
    //   11589: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   11592: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   11595: aload #25
    //   11597: iconst_1
    //   11598: anewarray java/lang/Object
    //   11601: dup_x1
    //   11602: swap
    //   11603: iconst_0
    //   11604: swap
    //   11605: aastore
    //   11606: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   11609: astore #26
    //   11611: aload #23
    //   11613: ifnull -> 11918
    //   11616: aload #26
    //   11618: ifnull -> 11878
    //   11621: goto -> 11628
    //   11624: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11627: athrow
    //   11628: aload #26
    //   11630: iconst_0
    //   11631: anewarray java/lang/Object
    //   11634: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   11637: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11642: astore #27
    //   11644: aload #27
    //   11646: invokeinterface hasNext : ()Z
    //   11651: ifeq -> 11699
    //   11654: aload #27
    //   11656: invokeinterface next : ()Ljava/lang/Object;
    //   11661: checkcast me/frep/aegisguard/api/check/Check
    //   11664: astore #28
    //   11666: aload #28
    //   11668: iconst_0
    //   11669: invokeinterface setVl : (I)V
    //   11674: aload #28
    //   11676: dconst_0
    //   11677: invokeinterface setBuffer : (D)V
    //   11682: aload #23
    //   11684: ifnull -> 11873
    //   11687: aload #23
    //   11689: ifnonnull -> 11644
    //   11692: goto -> 11699
    //   11695: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11698: athrow
    //   11699: aload #26
    //   11701: iconst_0
    //   11702: iconst_1
    //   11703: anewarray java/lang/Object
    //   11706: dup_x1
    //   11707: swap
    //   11708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11711: iconst_0
    //   11712: swap
    //   11713: aastore
    //   11714: invokevirtual aegisguard_b : ([Ljava/lang/Object;)V
    //   11717: aload #26
    //   11719: iconst_0
    //   11720: iconst_1
    //   11721: anewarray java/lang/Object
    //   11724: dup_x1
    //   11725: swap
    //   11726: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11729: iconst_0
    //   11730: swap
    //   11731: aastore
    //   11732: invokevirtual aegisguard__ : ([Ljava/lang/Object;)V
    //   11735: aload #26
    //   11737: iconst_0
    //   11738: iconst_1
    //   11739: anewarray java/lang/Object
    //   11742: dup_x1
    //   11743: swap
    //   11744: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11747: iconst_0
    //   11748: swap
    //   11749: aastore
    //   11750: invokevirtual aegisguard_I : ([Ljava/lang/Object;)V
    //   11753: aload #26
    //   11755: iconst_0
    //   11756: iconst_1
    //   11757: anewarray java/lang/Object
    //   11760: dup_x1
    //   11761: swap
    //   11762: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11765: iconst_0
    //   11766: swap
    //   11767: aastore
    //   11768: invokevirtual aegisguard_V : ([Ljava/lang/Object;)V
    //   11771: aload #26
    //   11773: iconst_0
    //   11774: iconst_1
    //   11775: anewarray java/lang/Object
    //   11778: dup_x1
    //   11779: swap
    //   11780: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11783: iconst_0
    //   11784: swap
    //   11785: aastore
    //   11786: invokevirtual aegisguard_r : ([Ljava/lang/Object;)V
    //   11789: aload #26
    //   11791: iconst_0
    //   11792: iconst_1
    //   11793: anewarray java/lang/Object
    //   11796: dup_x1
    //   11797: swap
    //   11798: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11801: iconst_0
    //   11802: swap
    //   11803: aastore
    //   11804: invokevirtual aegisguard_O : ([Ljava/lang/Object;)V
    //   11807: aload #26
    //   11809: iconst_0
    //   11810: iconst_1
    //   11811: anewarray java/lang/Object
    //   11814: dup_x1
    //   11815: swap
    //   11816: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11819: iconst_0
    //   11820: swap
    //   11821: aastore
    //   11822: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   11825: aload_0
    //   11826: aload_1
    //   11827: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dR : Ljava/lang/String;
    //   11830: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   11833: astore #116
    //   11835: aload #116
    //   11837: bipush #52
    //   11839: aaload
    //   11840: aload #24
    //   11842: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   11845: lload #13
    //   11847: iconst_3
    //   11848: anewarray java/lang/Object
    //   11851: dup_x2
    //   11852: dup_x2
    //   11853: pop
    //   11854: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11857: iconst_2
    //   11858: swap
    //   11859: aastore
    //   11860: dup_x1
    //   11861: swap
    //   11862: iconst_1
    //   11863: swap
    //   11864: aastore
    //   11865: dup_x1
    //   11866: swap
    //   11867: iconst_0
    //   11868: swap
    //   11869: aastore
    //   11870: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   11873: aload #23
    //   11875: ifnonnull -> 11920
    //   11878: aload_0
    //   11879: aload_1
    //   11880: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   11883: lload #13
    //   11885: iconst_3
    //   11886: anewarray java/lang/Object
    //   11889: dup_x2
    //   11890: dup_x2
    //   11891: pop
    //   11892: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11895: iconst_2
    //   11896: swap
    //   11897: aastore
    //   11898: dup_x1
    //   11899: swap
    //   11900: iconst_1
    //   11901: swap
    //   11902: aastore
    //   11903: dup_x1
    //   11904: swap
    //   11905: iconst_0
    //   11906: swap
    //   11907: aastore
    //   11908: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   11911: goto -> 11918
    //   11914: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11917: athrow
    //   11918: iconst_1
    //   11919: ireturn
    //   11920: aload #23
    //   11922: ifnonnull -> 11967
    //   11925: aload_0
    //   11926: aload_1
    //   11927: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   11930: lload #13
    //   11932: iconst_3
    //   11933: anewarray java/lang/Object
    //   11936: dup_x2
    //   11937: dup_x2
    //   11938: pop
    //   11939: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11942: iconst_2
    //   11943: swap
    //   11944: aastore
    //   11945: dup_x1
    //   11946: swap
    //   11947: iconst_1
    //   11948: swap
    //   11949: aastore
    //   11950: dup_x1
    //   11951: swap
    //   11952: iconst_0
    //   11953: swap
    //   11954: aastore
    //   11955: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   11958: goto -> 11965
    //   11961: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   11964: athrow
    //   11965: iconst_1
    //   11966: ireturn
    //   11967: aload #23
    //   11969: ifnonnull -> 14807
    //   11972: aload_0
    //   11973: aload_1
    //   11974: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   11977: lload #13
    //   11979: iconst_3
    //   11980: anewarray java/lang/Object
    //   11983: dup_x2
    //   11984: dup_x2
    //   11985: pop
    //   11986: invokestatic valueOf : (J)Ljava/lang/Long;
    //   11989: iconst_2
    //   11990: swap
    //   11991: aastore
    //   11992: dup_x1
    //   11993: swap
    //   11994: iconst_1
    //   11995: swap
    //   11996: aastore
    //   11997: dup_x1
    //   11998: swap
    //   11999: iconst_0
    //   12000: swap
    //   12001: aastore
    //   12002: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12005: iconst_1
    //   12006: goto -> 12013
    //   12009: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12012: athrow
    //   12013: ireturn
    //   12014: aload #4
    //   12016: iconst_0
    //   12017: aaload
    //   12018: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12021: astore #116
    //   12023: aload #116
    //   12025: sipush #130
    //   12028: aaload
    //   12029: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   12032: aload #23
    //   12034: ifnull -> 12500
    //   12037: ifeq -> 12480
    //   12040: goto -> 12047
    //   12043: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12046: athrow
    //   12047: aload_1
    //   12048: checkcast org/bukkit/entity/Player
    //   12051: astore #24
    //   12053: aload #24
    //   12055: invokeinterface getName : ()Ljava/lang/String;
    //   12060: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12063: bipush #92
    //   12065: aaload
    //   12066: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   12069: aload #23
    //   12071: ifnull -> 12149
    //   12074: ifne -> 12123
    //   12077: goto -> 12084
    //   12080: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12083: athrow
    //   12084: aload #24
    //   12086: invokeinterface getName : ()Ljava/lang/String;
    //   12091: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12094: sipush #155
    //   12097: aaload
    //   12098: invokevirtual equals : (Ljava/lang/Object;)Z
    //   12101: aload #23
    //   12103: ifnull -> 12149
    //   12106: goto -> 12113
    //   12109: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12112: athrow
    //   12113: ifeq -> 12431
    //   12116: goto -> 12123
    //   12119: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12122: athrow
    //   12123: aload #24
    //   12125: invokeinterface getAddress : ()Ljava/net/InetSocketAddress;
    //   12130: invokevirtual toString : ()Ljava/lang/String;
    //   12133: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12136: bipush #77
    //   12138: aaload
    //   12139: invokevirtual equals : (Ljava/lang/Object;)Z
    //   12142: goto -> 12149
    //   12145: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12148: athrow
    //   12149: ifeq -> 12431
    //   12152: aload_0
    //   12153: aload_1
    //   12154: lload #21
    //   12156: iconst_2
    //   12157: anewarray java/lang/Object
    //   12160: dup_x2
    //   12161: dup_x2
    //   12162: pop
    //   12163: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12166: iconst_1
    //   12167: swap
    //   12168: aastore
    //   12169: dup_x1
    //   12170: swap
    //   12171: iconst_0
    //   12172: swap
    //   12173: aastore
    //   12174: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   12177: aload_0
    //   12178: aload_1
    //   12179: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12182: bipush #37
    //   12184: aaload
    //   12185: lload #13
    //   12187: iconst_3
    //   12188: anewarray java/lang/Object
    //   12191: dup_x2
    //   12192: dup_x2
    //   12193: pop
    //   12194: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12197: iconst_2
    //   12198: swap
    //   12199: aastore
    //   12200: dup_x1
    //   12201: swap
    //   12202: iconst_1
    //   12203: swap
    //   12204: aastore
    //   12205: dup_x1
    //   12206: swap
    //   12207: iconst_0
    //   12208: swap
    //   12209: aastore
    //   12210: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12213: aload_0
    //   12214: aload_1
    //   12215: new java/lang/StringBuilder
    //   12218: dup
    //   12219: invokespecial <init> : ()V
    //   12222: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12225: sipush #141
    //   12228: aaload
    //   12229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12232: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   12235: invokevirtual aegisguard_i : ()Ljava/lang/String;
    //   12238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12241: invokevirtual toString : ()Ljava/lang/String;
    //   12244: lload #13
    //   12246: iconst_3
    //   12247: anewarray java/lang/Object
    //   12250: dup_x2
    //   12251: dup_x2
    //   12252: pop
    //   12253: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12256: iconst_2
    //   12257: swap
    //   12258: aastore
    //   12259: dup_x1
    //   12260: swap
    //   12261: iconst_1
    //   12262: swap
    //   12263: aastore
    //   12264: dup_x1
    //   12265: swap
    //   12266: iconst_0
    //   12267: swap
    //   12268: aastore
    //   12269: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12272: aload_0
    //   12273: aload_1
    //   12274: new java/lang/StringBuilder
    //   12277: dup
    //   12278: invokespecial <init> : ()V
    //   12281: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12284: bipush #13
    //   12286: aaload
    //   12287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12290: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   12293: invokevirtual aegisguard_t : ()Ljava/lang/String;
    //   12296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12299: invokevirtual toString : ()Ljava/lang/String;
    //   12302: lload #13
    //   12304: iconst_3
    //   12305: anewarray java/lang/Object
    //   12308: dup_x2
    //   12309: dup_x2
    //   12310: pop
    //   12311: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12314: iconst_2
    //   12315: swap
    //   12316: aastore
    //   12317: dup_x1
    //   12318: swap
    //   12319: iconst_1
    //   12320: swap
    //   12321: aastore
    //   12322: dup_x1
    //   12323: swap
    //   12324: iconst_0
    //   12325: swap
    //   12326: aastore
    //   12327: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12330: aload_0
    //   12331: aload_1
    //   12332: new java/lang/StringBuilder
    //   12335: dup
    //   12336: invokespecial <init> : ()V
    //   12339: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12342: bipush #89
    //   12344: aaload
    //   12345: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12348: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   12351: invokevirtual aegisguard_i : ()Ljava/lang/String;
    //   12354: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12357: ldc_w '/'
    //   12360: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12363: invokevirtual toString : ()Ljava/lang/String;
    //   12366: lload #13
    //   12368: iconst_3
    //   12369: anewarray java/lang/Object
    //   12372: dup_x2
    //   12373: dup_x2
    //   12374: pop
    //   12375: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12378: iconst_2
    //   12379: swap
    //   12380: aastore
    //   12381: dup_x1
    //   12382: swap
    //   12383: iconst_1
    //   12384: swap
    //   12385: aastore
    //   12386: dup_x1
    //   12387: swap
    //   12388: iconst_0
    //   12389: swap
    //   12390: aastore
    //   12391: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12394: aload_0
    //   12395: aload_1
    //   12396: lload #21
    //   12398: iconst_2
    //   12399: anewarray java/lang/Object
    //   12402: dup_x2
    //   12403: dup_x2
    //   12404: pop
    //   12405: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12408: iconst_1
    //   12409: swap
    //   12410: aastore
    //   12411: dup_x1
    //   12412: swap
    //   12413: iconst_0
    //   12414: swap
    //   12415: aastore
    //   12416: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   12419: aload #23
    //   12421: ifnonnull -> 12475
    //   12424: goto -> 12431
    //   12427: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12430: athrow
    //   12431: aload_0
    //   12432: aload_1
    //   12433: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12436: sipush #148
    //   12439: aaload
    //   12440: lload #13
    //   12442: iconst_3
    //   12443: anewarray java/lang/Object
    //   12446: dup_x2
    //   12447: dup_x2
    //   12448: pop
    //   12449: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12452: iconst_2
    //   12453: swap
    //   12454: aastore
    //   12455: dup_x1
    //   12456: swap
    //   12457: iconst_1
    //   12458: swap
    //   12459: aastore
    //   12460: dup_x1
    //   12461: swap
    //   12462: iconst_0
    //   12463: swap
    //   12464: aastore
    //   12465: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12468: goto -> 12475
    //   12471: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12474: athrow
    //   12475: aload #23
    //   12477: ifnonnull -> 14807
    //   12480: aload #4
    //   12482: iconst_0
    //   12483: aaload
    //   12484: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12487: bipush #74
    //   12489: aaload
    //   12490: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   12493: goto -> 12500
    //   12496: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12499: athrow
    //   12500: aload #23
    //   12502: ifnull -> 12987
    //   12505: ifeq -> 12970
    //   12508: goto -> 12515
    //   12511: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12514: athrow
    //   12515: aload_1
    //   12516: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12519: bipush #54
    //   12521: aaload
    //   12522: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   12527: aload #23
    //   12529: ifnull -> 12969
    //   12532: goto -> 12539
    //   12535: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12538: athrow
    //   12539: ifeq -> 12928
    //   12542: goto -> 12549
    //   12545: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12548: athrow
    //   12549: aload #4
    //   12551: aload #23
    //   12553: ifnull -> 12629
    //   12556: goto -> 12563
    //   12559: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12562: athrow
    //   12563: arraylength
    //   12564: iconst_1
    //   12565: if_icmpne -> 12620
    //   12568: goto -> 12575
    //   12571: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12574: athrow
    //   12575: aload_0
    //   12576: aload_1
    //   12577: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dj : Ljava/lang/String;
    //   12580: lload #13
    //   12582: iconst_3
    //   12583: anewarray java/lang/Object
    //   12586: dup_x2
    //   12587: dup_x2
    //   12588: pop
    //   12589: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12592: iconst_2
    //   12593: swap
    //   12594: aastore
    //   12595: dup_x1
    //   12596: swap
    //   12597: iconst_1
    //   12598: swap
    //   12599: aastore
    //   12600: dup_x1
    //   12601: swap
    //   12602: iconst_0
    //   12603: swap
    //   12604: aastore
    //   12605: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12608: aload #23
    //   12610: ifnonnull -> 14807
    //   12613: goto -> 12620
    //   12616: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12619: athrow
    //   12620: aload #4
    //   12622: goto -> 12629
    //   12625: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12628: athrow
    //   12629: iconst_1
    //   12630: aaload
    //   12631: astore #24
    //   12633: aload #24
    //   12635: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   12638: astore #25
    //   12640: aload #23
    //   12642: ifnull -> 12921
    //   12645: aload #25
    //   12647: ifnull -> 12881
    //   12650: goto -> 12657
    //   12653: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12656: athrow
    //   12657: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   12660: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   12663: aload #25
    //   12665: iconst_1
    //   12666: anewarray java/lang/Object
    //   12669: dup_x1
    //   12670: swap
    //   12671: iconst_0
    //   12672: swap
    //   12673: aastore
    //   12674: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   12677: astore #26
    //   12679: aload #23
    //   12681: ifnull -> 12874
    //   12684: aload #26
    //   12686: ifnull -> 12834
    //   12689: goto -> 12696
    //   12692: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12695: athrow
    //   12696: invokestatic currentTimeMillis : ()J
    //   12699: lstore #27
    //   12701: aload #26
    //   12703: iconst_0
    //   12704: anewarray java/lang/Object
    //   12707: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   12710: iconst_0
    //   12711: anewarray java/lang/Object
    //   12714: invokevirtual aegisguard_q : ([Ljava/lang/Object;)J
    //   12717: invokestatic toString : (J)Ljava/lang/String;
    //   12720: astore #29
    //   12722: aload #26
    //   12724: iconst_0
    //   12725: anewarray java/lang/Object
    //   12728: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   12731: iconst_0
    //   12732: anewarray java/lang/Object
    //   12735: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)I
    //   12738: invokestatic toString : (I)Ljava/lang/String;
    //   12741: astore #30
    //   12743: lload #27
    //   12745: aload #26
    //   12747: iconst_0
    //   12748: anewarray java/lang/Object
    //   12751: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   12754: iconst_0
    //   12755: anewarray java/lang/Object
    //   12758: invokevirtual aegisguard_t : ([Ljava/lang/Object;)J
    //   12761: lsub
    //   12762: invokestatic toString : (J)Ljava/lang/String;
    //   12765: astore #31
    //   12767: aload #26
    //   12769: iconst_0
    //   12770: anewarray java/lang/Object
    //   12773: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   12776: iconst_0
    //   12777: anewarray java/lang/Object
    //   12780: invokevirtual aegisguard_M : ([Ljava/lang/Object;)J
    //   12783: invokestatic toString : (J)Ljava/lang/String;
    //   12786: astore #32
    //   12788: aload #26
    //   12790: iconst_0
    //   12791: anewarray java/lang/Object
    //   12794: invokevirtual aegisguard_u : ([Ljava/lang/Object;)I
    //   12797: invokestatic toString : (I)Ljava/lang/String;
    //   12800: astore #33
    //   12802: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_d_ : Ljava/util/List;
    //   12805: aload_0
    //   12806: aload_1
    //   12807: aload #25
    //   12809: aload #29
    //   12811: aload #30
    //   12813: aload #33
    //   12815: aload #31
    //   12817: aload #32
    //   12819: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_i;Lorg/bukkit/command/CommandSender;Lorg/bukkit/entity/Player;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   12824: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   12829: aload #23
    //   12831: ifnonnull -> 12876
    //   12834: aload_0
    //   12835: aload_1
    //   12836: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   12839: lload #13
    //   12841: iconst_3
    //   12842: anewarray java/lang/Object
    //   12845: dup_x2
    //   12846: dup_x2
    //   12847: pop
    //   12848: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12851: iconst_2
    //   12852: swap
    //   12853: aastore
    //   12854: dup_x1
    //   12855: swap
    //   12856: iconst_1
    //   12857: swap
    //   12858: aastore
    //   12859: dup_x1
    //   12860: swap
    //   12861: iconst_0
    //   12862: swap
    //   12863: aastore
    //   12864: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12867: goto -> 12874
    //   12870: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12873: athrow
    //   12874: iconst_1
    //   12875: ireturn
    //   12876: aload #23
    //   12878: ifnonnull -> 12923
    //   12881: aload_0
    //   12882: aload_1
    //   12883: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   12886: lload #13
    //   12888: iconst_3
    //   12889: anewarray java/lang/Object
    //   12892: dup_x2
    //   12893: dup_x2
    //   12894: pop
    //   12895: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12898: iconst_2
    //   12899: swap
    //   12900: aastore
    //   12901: dup_x1
    //   12902: swap
    //   12903: iconst_1
    //   12904: swap
    //   12905: aastore
    //   12906: dup_x1
    //   12907: swap
    //   12908: iconst_0
    //   12909: swap
    //   12910: aastore
    //   12911: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12914: goto -> 12921
    //   12917: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12920: athrow
    //   12921: iconst_1
    //   12922: ireturn
    //   12923: aload #23
    //   12925: ifnonnull -> 14807
    //   12928: aload_0
    //   12929: aload_1
    //   12930: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   12933: lload #13
    //   12935: iconst_3
    //   12936: anewarray java/lang/Object
    //   12939: dup_x2
    //   12940: dup_x2
    //   12941: pop
    //   12942: invokestatic valueOf : (J)Ljava/lang/Long;
    //   12945: iconst_2
    //   12946: swap
    //   12947: aastore
    //   12948: dup_x1
    //   12949: swap
    //   12950: iconst_1
    //   12951: swap
    //   12952: aastore
    //   12953: dup_x1
    //   12954: swap
    //   12955: iconst_0
    //   12956: swap
    //   12957: aastore
    //   12958: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   12961: iconst_1
    //   12962: goto -> 12969
    //   12965: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   12968: athrow
    //   12969: ireturn
    //   12970: aload #4
    //   12972: iconst_0
    //   12973: aaload
    //   12974: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   12977: astore #116
    //   12979: aload #116
    //   12981: bipush #75
    //   12983: aaload
    //   12984: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   12987: aload #23
    //   12989: ifnull -> 13732
    //   12992: ifeq -> 13715
    //   12995: goto -> 13002
    //   12998: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13001: athrow
    //   13002: aload_1
    //   13003: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13006: sipush #145
    //   13009: aaload
    //   13010: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   13015: aload #23
    //   13017: ifnull -> 13714
    //   13020: goto -> 13027
    //   13023: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13026: athrow
    //   13027: ifeq -> 13673
    //   13030: goto -> 13037
    //   13033: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13036: athrow
    //   13037: aload_0
    //   13038: aload_1
    //   13039: lload #21
    //   13041: iconst_2
    //   13042: anewarray java/lang/Object
    //   13045: dup_x2
    //   13046: dup_x2
    //   13047: pop
    //   13048: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13051: iconst_1
    //   13052: swap
    //   13053: aastore
    //   13054: dup_x1
    //   13055: swap
    //   13056: iconst_0
    //   13057: swap
    //   13058: aastore
    //   13059: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   13062: aload_0
    //   13063: aload_1
    //   13064: new java/lang/StringBuilder
    //   13067: dup
    //   13068: invokespecial <init> : ()V
    //   13071: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13074: sipush #135
    //   13077: aaload
    //   13078: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13081: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   13084: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   13087: invokevirtual getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
    //   13090: invokevirtual getVersion : ()Ljava/lang/String;
    //   13093: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13096: invokevirtual toString : ()Ljava/lang/String;
    //   13099: lload #13
    //   13101: iconst_3
    //   13102: anewarray java/lang/Object
    //   13105: dup_x2
    //   13106: dup_x2
    //   13107: pop
    //   13108: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13111: iconst_2
    //   13112: swap
    //   13113: aastore
    //   13114: dup_x1
    //   13115: swap
    //   13116: iconst_1
    //   13117: swap
    //   13118: aastore
    //   13119: dup_x1
    //   13120: swap
    //   13121: iconst_0
    //   13122: swap
    //   13123: aastore
    //   13124: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13127: aload_0
    //   13128: aload_1
    //   13129: new java/lang/StringBuilder
    //   13132: dup
    //   13133: invokespecial <init> : ()V
    //   13136: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13139: bipush #109
    //   13141: aaload
    //   13142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13145: iconst_0
    //   13146: anewarray java/lang/Object
    //   13149: invokestatic aegisguard_M : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/manager/server/ServerVersion;
    //   13152: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   13155: invokevirtual toString : ()Ljava/lang/String;
    //   13158: lload #13
    //   13160: iconst_3
    //   13161: anewarray java/lang/Object
    //   13164: dup_x2
    //   13165: dup_x2
    //   13166: pop
    //   13167: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13170: iconst_2
    //   13171: swap
    //   13172: aastore
    //   13173: dup_x1
    //   13174: swap
    //   13175: iconst_1
    //   13176: swap
    //   13177: aastore
    //   13178: dup_x1
    //   13179: swap
    //   13180: iconst_0
    //   13181: swap
    //   13182: aastore
    //   13183: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13186: aload_0
    //   13187: aload_1
    //   13188: new java/lang/StringBuilder
    //   13191: dup
    //   13192: invokespecial <init> : ()V
    //   13195: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13198: bipush #84
    //   13200: aaload
    //   13201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13204: invokestatic getVersion : ()Ljava/lang/String;
    //   13207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13210: invokevirtual toString : ()Ljava/lang/String;
    //   13213: lload #13
    //   13215: iconst_3
    //   13216: anewarray java/lang/Object
    //   13219: dup_x2
    //   13220: dup_x2
    //   13221: pop
    //   13222: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13225: iconst_2
    //   13226: swap
    //   13227: aastore
    //   13228: dup_x1
    //   13229: swap
    //   13230: iconst_1
    //   13231: swap
    //   13232: aastore
    //   13233: dup_x1
    //   13234: swap
    //   13235: iconst_0
    //   13236: swap
    //   13237: aastore
    //   13238: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13241: aload_0
    //   13242: aload_1
    //   13243: new java/lang/StringBuilder
    //   13246: dup
    //   13247: invokespecial <init> : ()V
    //   13250: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13253: sipush #178
    //   13256: aaload
    //   13257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13260: iconst_0
    //   13261: anewarray java/lang/Object
    //   13264: invokestatic aegisguard_S : ([Ljava/lang/Object;)D
    //   13267: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   13270: invokevirtual toString : ()Ljava/lang/String;
    //   13273: lload #13
    //   13275: iconst_3
    //   13276: anewarray java/lang/Object
    //   13279: dup_x2
    //   13280: dup_x2
    //   13281: pop
    //   13282: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13285: iconst_2
    //   13286: swap
    //   13287: aastore
    //   13288: dup_x1
    //   13289: swap
    //   13290: iconst_1
    //   13291: swap
    //   13292: aastore
    //   13293: dup_x1
    //   13294: swap
    //   13295: iconst_0
    //   13296: swap
    //   13297: aastore
    //   13298: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13301: aload_0
    //   13302: aload_1
    //   13303: new java/lang/StringBuilder
    //   13306: dup
    //   13307: invokespecial <init> : ()V
    //   13310: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13313: bipush #39
    //   13315: aaload
    //   13316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13319: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   13322: invokevirtual aegisguard_i : ()Ljava/lang/String;
    //   13325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13328: invokevirtual toString : ()Ljava/lang/String;
    //   13331: lload #13
    //   13333: iconst_3
    //   13334: anewarray java/lang/Object
    //   13337: dup_x2
    //   13338: dup_x2
    //   13339: pop
    //   13340: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13343: iconst_2
    //   13344: swap
    //   13345: aastore
    //   13346: dup_x1
    //   13347: swap
    //   13348: iconst_1
    //   13349: swap
    //   13350: aastore
    //   13351: dup_x1
    //   13352: swap
    //   13353: iconst_0
    //   13354: swap
    //   13355: aastore
    //   13356: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13359: aload_0
    //   13360: aload_1
    //   13361: new java/lang/StringBuilder
    //   13364: dup
    //   13365: invokespecial <init> : ()V
    //   13368: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13371: sipush #137
    //   13374: aaload
    //   13375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13378: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   13381: invokevirtual aegisguard_t : ()Ljava/lang/String;
    //   13384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13387: invokevirtual toString : ()Ljava/lang/String;
    //   13390: lload #13
    //   13392: iconst_3
    //   13393: anewarray java/lang/Object
    //   13396: dup_x2
    //   13397: dup_x2
    //   13398: pop
    //   13399: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13402: iconst_2
    //   13403: swap
    //   13404: aastore
    //   13405: dup_x1
    //   13406: swap
    //   13407: iconst_1
    //   13408: swap
    //   13409: aastore
    //   13410: dup_x1
    //   13411: swap
    //   13412: iconst_0
    //   13413: swap
    //   13414: aastore
    //   13415: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13418: aload_0
    //   13419: aload_1
    //   13420: ldc_w ''
    //   13423: lload #13
    //   13425: iconst_3
    //   13426: anewarray java/lang/Object
    //   13429: dup_x2
    //   13430: dup_x2
    //   13431: pop
    //   13432: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13435: iconst_2
    //   13436: swap
    //   13437: aastore
    //   13438: dup_x1
    //   13439: swap
    //   13440: iconst_1
    //   13441: swap
    //   13442: aastore
    //   13443: dup_x1
    //   13444: swap
    //   13445: iconst_0
    //   13446: swap
    //   13447: aastore
    //   13448: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13451: aload_0
    //   13452: aload_1
    //   13453: new java/lang/StringBuilder
    //   13456: dup
    //   13457: invokespecial <init> : ()V
    //   13460: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13463: bipush #114
    //   13465: aaload
    //   13466: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13469: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   13472: invokevirtual aegisguard_U : ()Ljava/util/concurrent/ExecutorService;
    //   13475: checkcast java/util/concurrent/ThreadPoolExecutor
    //   13478: invokevirtual getQueue : ()Ljava/util/concurrent/BlockingQueue;
    //   13481: invokeinterface size : ()I
    //   13486: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   13489: invokevirtual toString : ()Ljava/lang/String;
    //   13492: lload #13
    //   13494: iconst_3
    //   13495: anewarray java/lang/Object
    //   13498: dup_x2
    //   13499: dup_x2
    //   13500: pop
    //   13501: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13504: iconst_2
    //   13505: swap
    //   13506: aastore
    //   13507: dup_x1
    //   13508: swap
    //   13509: iconst_1
    //   13510: swap
    //   13511: aastore
    //   13512: dup_x1
    //   13513: swap
    //   13514: iconst_0
    //   13515: swap
    //   13516: aastore
    //   13517: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13520: aload_0
    //   13521: aload_1
    //   13522: new java/lang/StringBuilder
    //   13525: dup
    //   13526: invokespecial <init> : ()V
    //   13529: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13532: bipush #96
    //   13534: aaload
    //   13535: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13538: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   13541: invokevirtual aegisguard_h : ()I
    //   13544: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   13547: invokevirtual toString : ()Ljava/lang/String;
    //   13550: lload #13
    //   13552: iconst_3
    //   13553: anewarray java/lang/Object
    //   13556: dup_x2
    //   13557: dup_x2
    //   13558: pop
    //   13559: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13562: iconst_2
    //   13563: swap
    //   13564: aastore
    //   13565: dup_x1
    //   13566: swap
    //   13567: iconst_1
    //   13568: swap
    //   13569: aastore
    //   13570: dup_x1
    //   13571: swap
    //   13572: iconst_0
    //   13573: swap
    //   13574: aastore
    //   13575: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13578: aload_0
    //   13579: aload_1
    //   13580: new java/lang/StringBuilder
    //   13583: dup
    //   13584: invokespecial <init> : ()V
    //   13587: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13590: bipush #6
    //   13592: aaload
    //   13593: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13596: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   13599: invokevirtual aegisguard_G : ()I
    //   13602: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   13605: invokevirtual toString : ()Ljava/lang/String;
    //   13608: lload #13
    //   13610: iconst_3
    //   13611: anewarray java/lang/Object
    //   13614: dup_x2
    //   13615: dup_x2
    //   13616: pop
    //   13617: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13620: iconst_2
    //   13621: swap
    //   13622: aastore
    //   13623: dup_x1
    //   13624: swap
    //   13625: iconst_1
    //   13626: swap
    //   13627: aastore
    //   13628: dup_x1
    //   13629: swap
    //   13630: iconst_0
    //   13631: swap
    //   13632: aastore
    //   13633: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13636: aload_0
    //   13637: aload_1
    //   13638: lload #21
    //   13640: iconst_2
    //   13641: anewarray java/lang/Object
    //   13644: dup_x2
    //   13645: dup_x2
    //   13646: pop
    //   13647: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13650: iconst_1
    //   13651: swap
    //   13652: aastore
    //   13653: dup_x1
    //   13654: swap
    //   13655: iconst_0
    //   13656: swap
    //   13657: aastore
    //   13658: invokevirtual aegisguard_y : ([Ljava/lang/Object;)V
    //   13661: aload #23
    //   13663: ifnonnull -> 14807
    //   13666: goto -> 13673
    //   13669: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13672: athrow
    //   13673: aload_0
    //   13674: aload_1
    //   13675: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   13678: lload #13
    //   13680: iconst_3
    //   13681: anewarray java/lang/Object
    //   13684: dup_x2
    //   13685: dup_x2
    //   13686: pop
    //   13687: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13690: iconst_2
    //   13691: swap
    //   13692: aastore
    //   13693: dup_x1
    //   13694: swap
    //   13695: iconst_1
    //   13696: swap
    //   13697: aastore
    //   13698: dup_x1
    //   13699: swap
    //   13700: iconst_0
    //   13701: swap
    //   13702: aastore
    //   13703: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13706: iconst_1
    //   13707: goto -> 13714
    //   13710: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13713: athrow
    //   13714: ireturn
    //   13715: aload #4
    //   13717: iconst_0
    //   13718: aaload
    //   13719: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13722: astore #116
    //   13724: aload #116
    //   13726: bipush #60
    //   13728: aaload
    //   13729: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   13732: aload #23
    //   13734: ifnull -> 14806
    //   13737: ifeq -> 14772
    //   13740: goto -> 13747
    //   13743: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13746: athrow
    //   13747: aload_1
    //   13748: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13751: bipush #38
    //   13753: aaload
    //   13754: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   13759: aload #23
    //   13761: ifnull -> 14771
    //   13764: goto -> 13771
    //   13767: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13770: athrow
    //   13771: ifeq -> 14730
    //   13774: goto -> 13781
    //   13777: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13780: athrow
    //   13781: aload #4
    //   13783: aload #23
    //   13785: ifnull -> 13861
    //   13788: goto -> 13795
    //   13791: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13794: athrow
    //   13795: arraylength
    //   13796: iconst_1
    //   13797: if_icmpne -> 13852
    //   13800: goto -> 13807
    //   13803: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13806: athrow
    //   13807: aload_0
    //   13808: aload_1
    //   13809: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mq : Ljava/lang/String;
    //   13812: lload #13
    //   13814: iconst_3
    //   13815: anewarray java/lang/Object
    //   13818: dup_x2
    //   13819: dup_x2
    //   13820: pop
    //   13821: invokestatic valueOf : (J)Ljava/lang/Long;
    //   13824: iconst_2
    //   13825: swap
    //   13826: aastore
    //   13827: dup_x1
    //   13828: swap
    //   13829: iconst_1
    //   13830: swap
    //   13831: aastore
    //   13832: dup_x1
    //   13833: swap
    //   13834: iconst_0
    //   13835: swap
    //   13836: aastore
    //   13837: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   13840: aload #23
    //   13842: ifnonnull -> 14807
    //   13845: goto -> 13852
    //   13848: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13851: athrow
    //   13852: aload #4
    //   13854: goto -> 13861
    //   13857: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13860: athrow
    //   13861: iconst_1
    //   13862: aaload
    //   13863: astore #24
    //   13865: aload #24
    //   13867: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   13870: astore #25
    //   13872: aload #23
    //   13874: ifnull -> 14723
    //   13877: aload #25
    //   13879: ifnull -> 14683
    //   13882: goto -> 13889
    //   13885: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13888: athrow
    //   13889: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   13892: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   13895: aload #25
    //   13897: iconst_1
    //   13898: anewarray java/lang/Object
    //   13901: dup_x1
    //   13902: swap
    //   13903: iconst_0
    //   13904: swap
    //   13905: aastore
    //   13906: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   13909: astore #26
    //   13911: aload #26
    //   13913: ifnull -> 14678
    //   13916: iconst_0
    //   13917: anewarray java/lang/Object
    //   13920: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   13923: ifeq -> 14307
    //   13926: goto -> 13933
    //   13929: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13932: athrow
    //   13933: aload #26
    //   13935: aload #23
    //   13937: ifnull -> 13975
    //   13940: goto -> 13947
    //   13943: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13946: athrow
    //   13947: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   13950: ifnonnull -> 13973
    //   13953: goto -> 13960
    //   13956: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13959: athrow
    //   13960: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   13963: bipush #50
    //   13965: aaload
    //   13966: goto -> 13978
    //   13969: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   13972: athrow
    //   13973: aload #26
    //   13975: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   13978: astore #27
    //   13980: aload #26
    //   13982: iconst_0
    //   13983: anewarray java/lang/Object
    //   13986: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_R;
    //   13989: iconst_0
    //   13990: anewarray java/lang/Object
    //   13993: invokevirtual aegisguard_M : ([Ljava/lang/Object;)I
    //   13996: invokestatic toString : (I)Ljava/lang/String;
    //   13999: astore #28
    //   14001: aload #26
    //   14003: invokevirtual getTotalViolations : ()I
    //   14006: invokestatic toString : (I)Ljava/lang/String;
    //   14009: astore #29
    //   14011: aload #26
    //   14013: invokevirtual getCombatViolations : ()I
    //   14016: invokestatic toString : (I)Ljava/lang/String;
    //   14019: astore #30
    //   14021: aload #26
    //   14023: invokevirtual getMovementViolations : ()I
    //   14026: invokestatic toString : (I)Ljava/lang/String;
    //   14029: astore #31
    //   14031: aload #26
    //   14033: invokevirtual getPlayerViolations : ()I
    //   14036: invokestatic toString : (I)Ljava/lang/String;
    //   14039: astore #32
    //   14041: aload #26
    //   14043: iconst_0
    //   14044: anewarray java/lang/Object
    //   14047: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   14050: lload #17
    //   14052: dup2_x1
    //   14053: pop2
    //   14054: iconst_2
    //   14055: anewarray java/lang/Object
    //   14058: dup_x1
    //   14059: swap
    //   14060: iconst_1
    //   14061: swap
    //   14062: aastore
    //   14063: dup_x2
    //   14064: dup_x2
    //   14065: pop
    //   14066: invokestatic valueOf : (J)Ljava/lang/Long;
    //   14069: iconst_0
    //   14070: swap
    //   14071: aastore
    //   14072: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   14075: astore #33
    //   14077: aload #26
    //   14079: iconst_0
    //   14080: anewarray java/lang/Object
    //   14083: invokevirtual aegisguard_v : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XR;
    //   14086: iconst_0
    //   14087: anewarray java/lang/Object
    //   14090: invokevirtual aegisguard_W : ([Ljava/lang/Object;)D
    //   14093: iconst_1
    //   14094: anewarray java/lang/Object
    //   14097: dup_x2
    //   14098: dup_x2
    //   14099: pop
    //   14100: invokestatic valueOf : (D)Ljava/lang/Double;
    //   14103: iconst_0
    //   14104: swap
    //   14105: aastore
    //   14106: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   14109: astore #34
    //   14111: aload #26
    //   14113: iconst_0
    //   14114: anewarray java/lang/Object
    //   14117: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   14120: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   14125: invokevirtual toString : ()Ljava/lang/String;
    //   14128: astore #35
    //   14130: aload #26
    //   14132: iconst_0
    //   14133: anewarray java/lang/Object
    //   14136: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   14139: iconst_0
    //   14140: anewarray java/lang/Object
    //   14143: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   14146: aload #23
    //   14148: ifnull -> 14190
    //   14151: ifnonnull -> 14174
    //   14154: goto -> 14161
    //   14157: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14160: athrow
    //   14161: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   14164: bipush #126
    //   14166: aaload
    //   14167: goto -> 14193
    //   14170: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14173: athrow
    //   14174: aload #26
    //   14176: iconst_0
    //   14177: anewarray java/lang/Object
    //   14180: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   14183: iconst_0
    //   14184: anewarray java/lang/Object
    //   14187: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   14190: invokevirtual toString : ()Ljava/lang/String;
    //   14193: astore #36
    //   14195: aload #26
    //   14197: iconst_0
    //   14198: anewarray java/lang/Object
    //   14201: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   14204: iconst_0
    //   14205: anewarray java/lang/Object
    //   14208: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Ljava/util/List;
    //   14211: aload #23
    //   14213: ifnull -> 14256
    //   14216: ifnonnull -> 14240
    //   14219: goto -> 14226
    //   14222: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14225: athrow
    //   14226: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   14229: sipush #139
    //   14232: aaload
    //   14233: goto -> 14259
    //   14236: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14239: athrow
    //   14240: aload #26
    //   14242: iconst_0
    //   14243: anewarray java/lang/Object
    //   14246: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   14249: iconst_0
    //   14250: anewarray java/lang/Object
    //   14253: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Ljava/util/List;
    //   14256: invokevirtual toString : ()Ljava/lang/String;
    //   14259: astore #37
    //   14261: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_do : Ljava/util/List;
    //   14264: aload_0
    //   14265: aload_1
    //   14266: aload #24
    //   14268: aload #27
    //   14270: aload #34
    //   14272: aload #35
    //   14274: aload #26
    //   14276: aload #36
    //   14278: aload #37
    //   14280: aload #33
    //   14282: aload #29
    //   14284: aload #30
    //   14286: aload #31
    //   14288: aload #32
    //   14290: aload #28
    //   14292: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_i;Lorg/bukkit/command/CommandSender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/frep/aegisguard/spigot/aegisguard_hu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   14297: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   14302: aload #23
    //   14304: ifnonnull -> 14678
    //   14307: aload #26
    //   14309: aload #23
    //   14311: ifnull -> 14350
    //   14314: goto -> 14321
    //   14317: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14320: athrow
    //   14321: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   14324: ifnonnull -> 14348
    //   14327: goto -> 14334
    //   14330: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14333: athrow
    //   14334: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   14337: sipush #169
    //   14340: aaload
    //   14341: goto -> 14353
    //   14344: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14347: athrow
    //   14348: aload #26
    //   14350: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   14353: astore #27
    //   14355: aload #26
    //   14357: iconst_0
    //   14358: anewarray java/lang/Object
    //   14361: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_R;
    //   14364: iconst_0
    //   14365: anewarray java/lang/Object
    //   14368: invokevirtual aegisguard_M : ([Ljava/lang/Object;)I
    //   14371: invokestatic toString : (I)Ljava/lang/String;
    //   14374: astore #28
    //   14376: aload #26
    //   14378: invokevirtual getTotalViolations : ()I
    //   14381: invokestatic toString : (I)Ljava/lang/String;
    //   14384: astore #29
    //   14386: aload #26
    //   14388: invokevirtual getCombatViolations : ()I
    //   14391: invokestatic toString : (I)Ljava/lang/String;
    //   14394: astore #30
    //   14396: aload #26
    //   14398: invokevirtual getMovementViolations : ()I
    //   14401: invokestatic toString : (I)Ljava/lang/String;
    //   14404: astore #31
    //   14406: aload #26
    //   14408: invokevirtual getPlayerViolations : ()I
    //   14411: invokestatic toString : (I)Ljava/lang/String;
    //   14414: astore #32
    //   14416: aload #26
    //   14418: iconst_0
    //   14419: anewarray java/lang/Object
    //   14422: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   14425: lload #17
    //   14427: dup2_x1
    //   14428: pop2
    //   14429: iconst_2
    //   14430: anewarray java/lang/Object
    //   14433: dup_x1
    //   14434: swap
    //   14435: iconst_1
    //   14436: swap
    //   14437: aastore
    //   14438: dup_x2
    //   14439: dup_x2
    //   14440: pop
    //   14441: invokestatic valueOf : (J)Ljava/lang/Long;
    //   14444: iconst_0
    //   14445: swap
    //   14446: aastore
    //   14447: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   14450: astore #33
    //   14452: aload #26
    //   14454: iconst_0
    //   14455: anewarray java/lang/Object
    //   14458: invokevirtual aegisguard_v : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XR;
    //   14461: iconst_0
    //   14462: anewarray java/lang/Object
    //   14465: invokevirtual aegisguard_W : ([Ljava/lang/Object;)D
    //   14468: iconst_1
    //   14469: anewarray java/lang/Object
    //   14472: dup_x2
    //   14473: dup_x2
    //   14474: pop
    //   14475: invokestatic valueOf : (D)Ljava/lang/Double;
    //   14478: iconst_0
    //   14479: swap
    //   14480: aastore
    //   14481: invokestatic aegisguard_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   14484: astore #34
    //   14486: aload #26
    //   14488: iconst_0
    //   14489: anewarray java/lang/Object
    //   14492: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   14495: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   14500: invokevirtual toString : ()Ljava/lang/String;
    //   14503: astore #35
    //   14505: aload #26
    //   14507: iconst_0
    //   14508: anewarray java/lang/Object
    //   14511: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   14514: iconst_0
    //   14515: anewarray java/lang/Object
    //   14518: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   14521: aload #23
    //   14523: ifnull -> 14566
    //   14526: ifnonnull -> 14550
    //   14529: goto -> 14536
    //   14532: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14535: athrow
    //   14536: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   14539: sipush #139
    //   14542: aaload
    //   14543: goto -> 14569
    //   14546: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14549: athrow
    //   14550: aload #26
    //   14552: iconst_0
    //   14553: anewarray java/lang/Object
    //   14556: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   14559: iconst_0
    //   14560: anewarray java/lang/Object
    //   14563: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   14566: invokevirtual toString : ()Ljava/lang/String;
    //   14569: astore #36
    //   14571: aload #26
    //   14573: iconst_0
    //   14574: anewarray java/lang/Object
    //   14577: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   14580: iconst_0
    //   14581: anewarray java/lang/Object
    //   14584: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Ljava/util/List;
    //   14587: aload #23
    //   14589: ifnull -> 14632
    //   14592: ifnonnull -> 14616
    //   14595: goto -> 14602
    //   14598: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14601: athrow
    //   14602: getstatic me/frep/aegisguard/spigot/aegisguard_i.d : [Ljava/lang/String;
    //   14605: sipush #139
    //   14608: aaload
    //   14609: goto -> 14635
    //   14612: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14615: athrow
    //   14616: aload #26
    //   14618: iconst_0
    //   14619: anewarray java/lang/Object
    //   14622: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   14625: iconst_0
    //   14626: anewarray java/lang/Object
    //   14629: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Ljava/util/List;
    //   14632: invokevirtual toString : ()Ljava/lang/String;
    //   14635: astore #37
    //   14637: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_do : Ljava/util/List;
    //   14640: aload_0
    //   14641: aload_1
    //   14642: aload #24
    //   14644: aload #27
    //   14646: aload #34
    //   14648: aload #35
    //   14650: aload #26
    //   14652: aload #36
    //   14654: aload #37
    //   14656: aload #33
    //   14658: aload #29
    //   14660: aload #30
    //   14662: aload #31
    //   14664: aload #32
    //   14666: aload #28
    //   14668: <illegal opcode> accept : (Lme/frep/aegisguard/spigot/aegisguard_i;Lorg/bukkit/command/CommandSender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/frep/aegisguard/spigot/aegisguard_hu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   14673: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   14678: aload #23
    //   14680: ifnonnull -> 14725
    //   14683: aload_0
    //   14684: aload_1
    //   14685: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G9 : Ljava/lang/String;
    //   14688: lload #13
    //   14690: iconst_3
    //   14691: anewarray java/lang/Object
    //   14694: dup_x2
    //   14695: dup_x2
    //   14696: pop
    //   14697: invokestatic valueOf : (J)Ljava/lang/Long;
    //   14700: iconst_2
    //   14701: swap
    //   14702: aastore
    //   14703: dup_x1
    //   14704: swap
    //   14705: iconst_1
    //   14706: swap
    //   14707: aastore
    //   14708: dup_x1
    //   14709: swap
    //   14710: iconst_0
    //   14711: swap
    //   14712: aastore
    //   14713: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   14716: goto -> 14723
    //   14719: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14722: athrow
    //   14723: iconst_1
    //   14724: ireturn
    //   14725: aload #23
    //   14727: ifnonnull -> 14807
    //   14730: aload_0
    //   14731: aload_1
    //   14732: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   14735: lload #13
    //   14737: iconst_3
    //   14738: anewarray java/lang/Object
    //   14741: dup_x2
    //   14742: dup_x2
    //   14743: pop
    //   14744: invokestatic valueOf : (J)Ljava/lang/Long;
    //   14747: iconst_2
    //   14748: swap
    //   14749: aastore
    //   14750: dup_x1
    //   14751: swap
    //   14752: iconst_1
    //   14753: swap
    //   14754: aastore
    //   14755: dup_x1
    //   14756: swap
    //   14757: iconst_0
    //   14758: swap
    //   14759: aastore
    //   14760: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   14763: iconst_1
    //   14764: goto -> 14771
    //   14767: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   14770: athrow
    //   14771: ireturn
    //   14772: aload_0
    //   14773: aload_1
    //   14774: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yb : Ljava/lang/String;
    //   14777: lload #13
    //   14779: iconst_3
    //   14780: anewarray java/lang/Object
    //   14783: dup_x2
    //   14784: dup_x2
    //   14785: pop
    //   14786: invokestatic valueOf : (J)Ljava/lang/Long;
    //   14789: iconst_2
    //   14790: swap
    //   14791: aastore
    //   14792: dup_x1
    //   14793: swap
    //   14794: iconst_1
    //   14795: swap
    //   14796: aastore
    //   14797: dup_x1
    //   14798: swap
    //   14799: iconst_0
    //   14800: swap
    //   14801: aastore
    //   14802: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   14805: iconst_1
    //   14806: ireturn
    //   14807: iconst_1
    //   14808: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #34	-> 73
    //   #35	-> 91
    //   #36	-> 125
    //   #39	-> 166
    //   #40	-> 199
    //   #42	-> 201
    //   #43	-> 233
    //   #44	-> 268
    //   #47	-> 295
    //   #48	-> 328
    //   #50	-> 337
    //   #51	-> 369
    //   #52	-> 404
    //   #53	-> 413
    //   #54	-> 422
    //   #55	-> 431
    //   #57	-> 440
    //   #58	-> 482
    //   #59	-> 512
    //   #60	-> 542
    //   #61	-> 572
    //   #62	-> 602
    //   #64	-> 619
    //   #65	-> 631
    //   #64	-> 637
    //   #65	-> 662
    //   #66	-> 675
    //   #67	-> 687
    //   #66	-> 693
    //   #67	-> 718
    //   #68	-> 731
    //   #69	-> 743
    //   #68	-> 749
    //   #69	-> 774
    //   #70	-> 787
    //   #71	-> 799
    //   #70	-> 805
    //   #71	-> 830
    //   #73	-> 843
    //   #74	-> 857
    //   #75	-> 871
    //   #76	-> 885
    //   #78	-> 899
    //   #79	-> 902
    //   #80	-> 975
    //   #83	-> 991
    //   #84	-> 994
    //   #85	-> 1068
    //   #88	-> 1084
    //   #89	-> 1087
    //   #90	-> 1161
    //   #93	-> 1177
    //   #94	-> 1180
    //   #95	-> 1254
    //   #98	-> 1270
    //   #99	-> 1273
    //   #100	-> 1347
    //   #103	-> 1363
    //   #104	-> 1366
    //   #105	-> 1383
    //   #108	-> 1390
    //   #109	-> 1393
    //   #110	-> 1410
    //   #113	-> 1417
    //   #114	-> 1420
    //   #115	-> 1437
    //   #118	-> 1444
    //   #119	-> 1447
    //   #120	-> 1464
    //   #123	-> 1471
    //   #124	-> 1474
    //   #125	-> 1491
    //   #129	-> 1498
    //   #130	-> 1501
    //   #131	-> 1574
    //   #134	-> 1590
    //   #135	-> 1593
    //   #136	-> 1667
    //   #139	-> 1683
    //   #140	-> 1686
    //   #141	-> 1760
    //   #144	-> 1776
    //   #145	-> 1779
    //   #146	-> 1853
    //   #149	-> 1869
    //   #150	-> 1872
    //   #151	-> 1946
    //   #154	-> 1962
    //   #155	-> 1965
    //   #156	-> 1982
    //   #159	-> 1989
    //   #160	-> 1992
    //   #161	-> 2009
    //   #164	-> 2016
    //   #165	-> 2019
    //   #166	-> 2036
    //   #169	-> 2043
    //   #170	-> 2046
    //   #171	-> 2063
    //   #174	-> 2070
    //   #175	-> 2073
    //   #176	-> 2090
    //   #180	-> 2097
    //   #181	-> 2100
    //   #182	-> 2173
    //   #185	-> 2189
    //   #186	-> 2192
    //   #187	-> 2266
    //   #190	-> 2282
    //   #191	-> 2285
    //   #192	-> 2359
    //   #195	-> 2375
    //   #196	-> 2378
    //   #197	-> 2452
    //   #200	-> 2468
    //   #201	-> 2471
    //   #202	-> 2545
    //   #205	-> 2561
    //   #206	-> 2564
    //   #207	-> 2581
    //   #210	-> 2588
    //   #211	-> 2591
    //   #212	-> 2608
    //   #215	-> 2615
    //   #216	-> 2618
    //   #217	-> 2635
    //   #220	-> 2642
    //   #221	-> 2645
    //   #222	-> 2662
    //   #225	-> 2669
    //   #226	-> 2672
    //   #227	-> 2689
    //   #231	-> 2696
    //   #232	-> 2699
    //   #233	-> 2772
    //   #236	-> 2788
    //   #237	-> 2791
    //   #238	-> 2865
    //   #241	-> 2881
    //   #242	-> 2884
    //   #243	-> 2958
    //   #245	-> 2974
    //   #246	-> 2977
    //   #247	-> 3051
    //   #250	-> 3067
    //   #251	-> 3070
    //   #252	-> 3144
    //   #255	-> 3160
    //   #256	-> 3163
    //   #257	-> 3180
    //   #260	-> 3187
    //   #261	-> 3190
    //   #262	-> 3207
    //   #265	-> 3214
    //   #266	-> 3217
    //   #267	-> 3234
    //   #270	-> 3241
    //   #271	-> 3244
    //   #272	-> 3261
    //   #275	-> 3268
    //   #276	-> 3271
    //   #277	-> 3288
    //   #280	-> 3295
    //   #281	-> 3331
    //   #282	-> 3367
    //   #283	-> 3403
    //   #284	-> 3439
    //   #286	-> 3475
    //   #287	-> 3519
    //   #288	-> 3563
    //   #289	-> 3607
    //   #290	-> 3651
    //   #292	-> 3695
    //   #293	-> 3731
    //   #294	-> 3767
    //   #295	-> 3803
    //   #296	-> 3839
    //   #298	-> 3875
    //   #299	-> 3919
    //   #300	-> 3963
    //   #301	-> 4007
    //   #302	-> 4051
    //   #304	-> 4095
    //   #305	-> 4131
    //   #306	-> 4167
    //   #307	-> 4203
    //   #308	-> 4239
    //   #310	-> 4275
    //   #311	-> 4319
    //   #312	-> 4363
    //   #313	-> 4407
    //   #314	-> 4451
    //   #316	-> 4495
    //   #317	-> 4531
    //   #318	-> 4567
    //   #319	-> 4603
    //   #320	-> 4639
    //   #322	-> 4675
    //   #323	-> 4719
    //   #324	-> 4763
    //   #325	-> 4807
    //   #326	-> 4851
    //   #328	-> 4895
    //   #370	-> 4990
    //   #371	-> 4995
    //   #372	-> 5028
    //   #374	-> 5037
    //   #375	-> 5069
    //   #376	-> 5104
    //   #377	-> 5130
    //   #379	-> 5179
    //   #381	-> 5192
    //   #383	-> 5199
    //   #384	-> 5216
    //   #385	-> 5256
    //   #387	-> 5258
    //   #389	-> 5280
    //   #390	-> 5297
    //   #391	-> 5306
    //   #392	-> 5333
    //   #393	-> 5394
    //   #391	-> 5414
    //   #396	-> 5422
    //   #397	-> 5447
    //   #398	-> 5484
    //   #399	-> 5498
    //   #400	-> 5563
    //   #401	-> 5588
    //   #402	-> 5593
    //   #403	-> 5633
    //   #406	-> 5635
    //   #408	-> 5640
    //   #409	-> 5673
    //   #411	-> 5682
    //   #412	-> 5715
    //   #413	-> 5749
    //   #414	-> 5755
    //   #416	-> 5800
    //   #417	-> 5833
    //   #419	-> 5842
    //   #420	-> 5875
    //   #421	-> 5909
    //   #422	-> 5935
    //   #423	-> 5968
    //   #425	-> 5974
    //   #427	-> 5983
    //   #429	-> 6010
    //   #430	-> 6023
    //   #432	-> 6064
    //   #433	-> 6101
    //   #434	-> 6127
    //   #433	-> 6135
    //   #427	-> 6170
    //   #437	-> 6178
    //   #439	-> 6183
    //   #440	-> 6216
    //   #442	-> 6225
    //   #443	-> 6257
    //   #444	-> 6291
    //   #445	-> 6317
    //   #446	-> 6323
    //   #448	-> 6345
    //   #449	-> 6362
    //   #450	-> 6402
    //   #452	-> 6404
    //   #453	-> 6431
    //   #454	-> 6456
    //   #456	-> 6492
    //   #457	-> 6560
    //   #458	-> 6585
    //   #460	-> 6594
    //   #461	-> 6632
    //   #462	-> 6708
    //   #468	-> 6739
    //   #469	-> 6744
    //   #470	-> 6777
    //   #473	-> 6779
    //   #474	-> 6812
    //   #477	-> 6814
    //   #478	-> 6847
    //   #480	-> 6849
    //   #481	-> 6882
    //   #482	-> 6916
    //   #483	-> 6942
    //   #484	-> 6968
    //   #486	-> 7017
    //   #488	-> 7030
    //   #490	-> 7037
    //   #491	-> 7054
    //   #493	-> 7099
    //   #495	-> 7112
    //   #498	-> 7129
    //   #500	-> 7134
    //   #501	-> 7167
    //   #504	-> 7176
    //   #505	-> 7209
    //   #507	-> 7211
    //   #508	-> 7243
    //   #509	-> 7277
    //   #510	-> 7303
    //   #512	-> 7348
    //   #514	-> 7361
    //   #515	-> 7424
    //   #516	-> 7435
    //   #517	-> 7450
    //   #519	-> 7507
    //   #520	-> 7540
    //   #522	-> 7549
    //   #524	-> 7554
    //   #525	-> 7587
    //   #527	-> 7596
    //   #528	-> 7629
    //   #529	-> 7664
    //   #530	-> 7690
    //   #531	-> 7723
    //   #533	-> 7729
    //   #535	-> 7735
    //   #537	-> 7742
    //   #538	-> 7759
    //   #539	-> 7799
    //   #541	-> 7801
    //   #543	-> 7823
    //   #544	-> 7840
    //   #545	-> 7873
    //   #547	-> 7879
    //   #549	-> 7897
    //   #550	-> 7914
    //   #551	-> 7939
    //   #552	-> 7988
    //   #553	-> 8005
    //   #552	-> 8031
    //   #555	-> 8076
    //   #556	-> 8101
    //   #557	-> 8157
    //   #558	-> 8178
    //   #557	-> 8204
    //   #562	-> 8237
    //   #564	-> 8242
    //   #565	-> 8275
    //   #567	-> 8284
    //   #568	-> 8316
    //   #569	-> 8350
    //   #570	-> 8376
    //   #572	-> 8421
    //   #574	-> 8434
    //   #576	-> 8441
    //   #577	-> 8458
    //   #578	-> 8498
    //   #581	-> 8500
    //   #582	-> 8532
    //   #583	-> 8604
    //   #584	-> 8618
    //   #585	-> 8631
    //   #583	-> 8638
    //   #586	-> 8667
    //   #583	-> 8670
    //   #588	-> 8699
    //   #590	-> 8767
    //   #592	-> 8772
    //   #594	-> 8787
    //   #596	-> 8792
    //   #597	-> 8825
    //   #599	-> 8834
    //   #600	-> 8867
    //   #601	-> 8901
    //   #602	-> 8927
    //   #604	-> 8972
    //   #606	-> 8985
    //   #608	-> 8992
    //   #609	-> 9009
    //   #610	-> 9023
    //   #612	-> 9079
    //   #613	-> 9119
    //   #615	-> 9121
    //   #617	-> 9126
    //   #618	-> 9162
    //   #619	-> 9196
    //   #620	-> 9222
    //   #622	-> 9267
    //   #624	-> 9280
    //   #626	-> 9287
    //   #627	-> 9304
    //   #628	-> 9318
    //   #630	-> 9400
    //   #631	-> 9440
    //   #633	-> 9442
    //   #635	-> 9447
    //   #636	-> 9482
    //   #637	-> 9516
    //   #638	-> 9542
    //   #640	-> 9587
    //   #641	-> 9600
    //   #642	-> 9607
    //   #643	-> 9624
    //   #645	-> 9646
    //   #646	-> 9663
    //   #648	-> 9670
    //   #649	-> 9688
    //   #650	-> 9721
    //   #652	-> 9727
    //   #653	-> 9752
    //   #654	-> 9832
    //   #655	-> 9870
    //   #656	-> 9890
    //   #657	-> 9947
    //   #656	-> 9975
    //   #659	-> 10010
    //   #660	-> 10015
    //   #662	-> 10040
    //   #663	-> 10045
    //   #664	-> 10085
    //   #667	-> 10087
    //   #668	-> 10092
    //   #669	-> 10132
    //   #671	-> 10134
    //   #673	-> 10139
    //   #674	-> 10172
    //   #676	-> 10181
    //   #677	-> 10214
    //   #678	-> 10249
    //   #679	-> 10275
    //   #681	-> 10320
    //   #682	-> 10333
    //   #683	-> 10340
    //   #684	-> 10357
    //   #686	-> 10379
    //   #687	-> 10396
    //   #688	-> 10434
    //   #689	-> 10487
    //   #690	-> 10492
    //   #691	-> 10532
    //   #693	-> 10534
    //   #694	-> 10539
    //   #695	-> 10579
    //   #697	-> 10581
    //   #699	-> 10586
    //   #700	-> 10619
    //   #702	-> 10628
    //   #703	-> 10696
    //   #704	-> 10763
    //   #705	-> 10789
    //   #707	-> 10834
    //   #708	-> 10847
    //   #709	-> 10854
    //   #710	-> 10871
    //   #711	-> 10889
    //   #712	-> 10898
    //   #713	-> 10942
    //   #714	-> 10947
    //   #715	-> 10987
    //   #717	-> 10989
    //   #719	-> 10994
    //   #720	-> 11027
    //   #722	-> 11036
    //   #723	-> 11068
    //   #724	-> 11102
    //   #725	-> 11127
    //   #727	-> 11192
    //   #728	-> 11202
    //   #730	-> 11211
    //   #732	-> 11225
    //   #734	-> 11230
    //   #735	-> 11261
    //   #736	-> 11292
    //   #738	-> 11353
    //   #739	-> 11358
    //   #740	-> 11383
    //   #741	-> 11388
    //   #742	-> 11421
    //   #744	-> 11430
    //   #745	-> 11462
    //   #746	-> 11496
    //   #747	-> 11522
    //   #749	-> 11552
    //   #750	-> 11565
    //   #751	-> 11572
    //   #752	-> 11589
    //   #754	-> 11611
    //   #755	-> 11628
    //   #756	-> 11666
    //   #757	-> 11674
    //   #758	-> 11682
    //   #760	-> 11699
    //   #761	-> 11717
    //   #762	-> 11735
    //   #763	-> 11753
    //   #764	-> 11771
    //   #765	-> 11789
    //   #766	-> 11807
    //   #768	-> 11825
    //   #770	-> 11878
    //   #771	-> 11918
    //   #773	-> 11920
    //   #774	-> 11925
    //   #775	-> 11965
    //   #777	-> 11967
    //   #779	-> 11972
    //   #780	-> 12005
    //   #782	-> 12014
    //   #783	-> 12047
    //   #785	-> 12053
    //   #786	-> 12125
    //   #787	-> 12152
    //   #788	-> 12177
    //   #789	-> 12213
    //   #790	-> 12272
    //   #791	-> 12330
    //   #792	-> 12394
    //   #794	-> 12431
    //   #796	-> 12475
    //   #797	-> 12515
    //   #798	-> 12549
    //   #799	-> 12575
    //   #801	-> 12620
    //   #802	-> 12633
    //   #803	-> 12640
    //   #804	-> 12657
    //   #805	-> 12679
    //   #806	-> 12696
    //   #808	-> 12701
    //   #809	-> 12722
    //   #810	-> 12743
    //   #811	-> 12767
    //   #812	-> 12788
    //   #814	-> 12802
    //   #822	-> 12829
    //   #823	-> 12834
    //   #824	-> 12874
    //   #826	-> 12876
    //   #827	-> 12881
    //   #828	-> 12921
    //   #830	-> 12923
    //   #832	-> 12928
    //   #833	-> 12961
    //   #835	-> 12970
    //   #836	-> 13002
    //   #837	-> 13037
    //   #838	-> 13062
    //   #839	-> 13127
    //   #840	-> 13186
    //   #841	-> 13241
    //   #842	-> 13301
    //   #843	-> 13359
    //   #844	-> 13418
    //   #845	-> 13451
    //   #846	-> 13520
    //   #847	-> 13578
    //   #848	-> 13636
    //   #850	-> 13673
    //   #851	-> 13706
    //   #853	-> 13715
    //   #854	-> 13747
    //   #855	-> 13781
    //   #856	-> 13807
    //   #858	-> 13852
    //   #859	-> 13865
    //   #861	-> 13872
    //   #862	-> 13889
    //   #863	-> 13911
    //   #864	-> 13916
    //   #865	-> 13933
    //   #866	-> 13980
    //   #867	-> 14001
    //   #868	-> 14011
    //   #869	-> 14021
    //   #870	-> 14031
    //   #871	-> 14041
    //   #872	-> 14077
    //   #873	-> 14111
    //   #874	-> 14130
    //   #875	-> 14195
    //   #877	-> 14261
    //   #896	-> 14302
    //   #897	-> 14307
    //   #898	-> 14355
    //   #899	-> 14376
    //   #900	-> 14386
    //   #901	-> 14396
    //   #902	-> 14406
    //   #903	-> 14416
    //   #904	-> 14452
    //   #905	-> 14486
    //   #906	-> 14505
    //   #907	-> 14571
    //   #909	-> 14637
    //   #930	-> 14678
    //   #931	-> 14683
    //   #932	-> 14723
    //   #934	-> 14725
    //   #936	-> 14730
    //   #937	-> 14763
    //   #940	-> 14772
    //   #941	-> 14805
    //   #943	-> 14807
    // Exception table:
    //   from	to	target	type
    //   73	84	87	java/lang/RuntimeException
    //   81	108	111	java/lang/RuntimeException
    //   91	118	121	java/lang/RuntimeException
    //   115	145	148	java/lang/RuntimeException
    //   125	159	162	java/lang/RuntimeException
    //   218	226	229	java/lang/RuntimeException
    //   223	251	254	java/lang/RuntimeException
    //   233	261	264	java/lang/RuntimeException
    //   258	288	291	java/lang/RuntimeException
    //   268	329	332	java/lang/RuntimeException
    //   354	362	365	java/lang/RuntimeException
    //   359	387	390	java/lang/RuntimeException
    //   369	397	400	java/lang/RuntimeException
    //   482	612	615	java/lang/RuntimeException
    //   902	913	916	java/lang/RuntimeException
    //   909	924	927	java/lang/RuntimeException
    //   931	939	942	java/lang/RuntimeException
    //   936	950	953	java/lang/RuntimeException
    //   957	968	971	java/lang/RuntimeException
    //   962	979	982	java/lang/RuntimeException
    //   994	1006	1009	java/lang/RuntimeException
    //   1001	1017	1020	java/lang/RuntimeException
    //   1024	1032	1035	java/lang/RuntimeException
    //   1029	1043	1046	java/lang/RuntimeException
    //   1050	1061	1064	java/lang/RuntimeException
    //   1055	1072	1075	java/lang/RuntimeException
    //   1087	1099	1102	java/lang/RuntimeException
    //   1094	1110	1113	java/lang/RuntimeException
    //   1117	1125	1128	java/lang/RuntimeException
    //   1122	1136	1139	java/lang/RuntimeException
    //   1143	1154	1157	java/lang/RuntimeException
    //   1148	1165	1168	java/lang/RuntimeException
    //   1180	1192	1195	java/lang/RuntimeException
    //   1187	1203	1206	java/lang/RuntimeException
    //   1210	1218	1221	java/lang/RuntimeException
    //   1215	1229	1232	java/lang/RuntimeException
    //   1236	1247	1250	java/lang/RuntimeException
    //   1241	1258	1261	java/lang/RuntimeException
    //   1273	1285	1288	java/lang/RuntimeException
    //   1280	1296	1299	java/lang/RuntimeException
    //   1303	1311	1314	java/lang/RuntimeException
    //   1308	1322	1325	java/lang/RuntimeException
    //   1329	1340	1343	java/lang/RuntimeException
    //   1334	1351	1354	java/lang/RuntimeException
    //   1366	1376	1379	java/lang/RuntimeException
    //   1393	1403	1406	java/lang/RuntimeException
    //   1420	1430	1433	java/lang/RuntimeException
    //   1447	1457	1460	java/lang/RuntimeException
    //   1474	1484	1487	java/lang/RuntimeException
    //   1501	1512	1515	java/lang/RuntimeException
    //   1508	1523	1526	java/lang/RuntimeException
    //   1530	1538	1541	java/lang/RuntimeException
    //   1535	1549	1552	java/lang/RuntimeException
    //   1556	1567	1570	java/lang/RuntimeException
    //   1561	1578	1581	java/lang/RuntimeException
    //   1593	1605	1608	java/lang/RuntimeException
    //   1600	1616	1619	java/lang/RuntimeException
    //   1623	1631	1634	java/lang/RuntimeException
    //   1628	1642	1645	java/lang/RuntimeException
    //   1649	1660	1663	java/lang/RuntimeException
    //   1654	1671	1674	java/lang/RuntimeException
    //   1686	1698	1701	java/lang/RuntimeException
    //   1693	1709	1712	java/lang/RuntimeException
    //   1716	1724	1727	java/lang/RuntimeException
    //   1721	1735	1738	java/lang/RuntimeException
    //   1742	1753	1756	java/lang/RuntimeException
    //   1747	1764	1767	java/lang/RuntimeException
    //   1779	1791	1794	java/lang/RuntimeException
    //   1786	1802	1805	java/lang/RuntimeException
    //   1809	1817	1820	java/lang/RuntimeException
    //   1814	1828	1831	java/lang/RuntimeException
    //   1835	1846	1849	java/lang/RuntimeException
    //   1840	1857	1860	java/lang/RuntimeException
    //   1872	1884	1887	java/lang/RuntimeException
    //   1879	1895	1898	java/lang/RuntimeException
    //   1902	1910	1913	java/lang/RuntimeException
    //   1907	1921	1924	java/lang/RuntimeException
    //   1928	1939	1942	java/lang/RuntimeException
    //   1933	1950	1953	java/lang/RuntimeException
    //   1965	1975	1978	java/lang/RuntimeException
    //   1992	2002	2005	java/lang/RuntimeException
    //   2019	2029	2032	java/lang/RuntimeException
    //   2046	2056	2059	java/lang/RuntimeException
    //   2073	2083	2086	java/lang/RuntimeException
    //   2100	2111	2114	java/lang/RuntimeException
    //   2107	2122	2125	java/lang/RuntimeException
    //   2129	2137	2140	java/lang/RuntimeException
    //   2134	2148	2151	java/lang/RuntimeException
    //   2155	2166	2169	java/lang/RuntimeException
    //   2160	2177	2180	java/lang/RuntimeException
    //   2192	2204	2207	java/lang/RuntimeException
    //   2199	2215	2218	java/lang/RuntimeException
    //   2222	2230	2233	java/lang/RuntimeException
    //   2227	2241	2244	java/lang/RuntimeException
    //   2248	2259	2262	java/lang/RuntimeException
    //   2253	2270	2273	java/lang/RuntimeException
    //   2285	2297	2300	java/lang/RuntimeException
    //   2292	2308	2311	java/lang/RuntimeException
    //   2315	2323	2326	java/lang/RuntimeException
    //   2320	2334	2337	java/lang/RuntimeException
    //   2341	2352	2355	java/lang/RuntimeException
    //   2346	2363	2366	java/lang/RuntimeException
    //   2378	2390	2393	java/lang/RuntimeException
    //   2385	2401	2404	java/lang/RuntimeException
    //   2408	2416	2419	java/lang/RuntimeException
    //   2413	2427	2430	java/lang/RuntimeException
    //   2434	2445	2448	java/lang/RuntimeException
    //   2439	2456	2459	java/lang/RuntimeException
    //   2471	2483	2486	java/lang/RuntimeException
    //   2478	2494	2497	java/lang/RuntimeException
    //   2501	2509	2512	java/lang/RuntimeException
    //   2506	2520	2523	java/lang/RuntimeException
    //   2527	2538	2541	java/lang/RuntimeException
    //   2532	2549	2552	java/lang/RuntimeException
    //   2564	2574	2577	java/lang/RuntimeException
    //   2591	2601	2604	java/lang/RuntimeException
    //   2618	2628	2631	java/lang/RuntimeException
    //   2645	2655	2658	java/lang/RuntimeException
    //   2672	2682	2685	java/lang/RuntimeException
    //   2699	2710	2713	java/lang/RuntimeException
    //   2706	2721	2724	java/lang/RuntimeException
    //   2728	2736	2739	java/lang/RuntimeException
    //   2733	2747	2750	java/lang/RuntimeException
    //   2754	2765	2768	java/lang/RuntimeException
    //   2759	2776	2779	java/lang/RuntimeException
    //   2791	2803	2806	java/lang/RuntimeException
    //   2798	2814	2817	java/lang/RuntimeException
    //   2821	2829	2832	java/lang/RuntimeException
    //   2826	2840	2843	java/lang/RuntimeException
    //   2847	2858	2861	java/lang/RuntimeException
    //   2852	2869	2872	java/lang/RuntimeException
    //   2884	2896	2899	java/lang/RuntimeException
    //   2891	2907	2910	java/lang/RuntimeException
    //   2914	2922	2925	java/lang/RuntimeException
    //   2919	2933	2936	java/lang/RuntimeException
    //   2940	2951	2954	java/lang/RuntimeException
    //   2945	2962	2965	java/lang/RuntimeException
    //   2977	2989	2992	java/lang/RuntimeException
    //   2984	3000	3003	java/lang/RuntimeException
    //   3007	3015	3018	java/lang/RuntimeException
    //   3012	3026	3029	java/lang/RuntimeException
    //   3033	3044	3047	java/lang/RuntimeException
    //   3038	3055	3058	java/lang/RuntimeException
    //   3070	3082	3085	java/lang/RuntimeException
    //   3077	3093	3096	java/lang/RuntimeException
    //   3100	3108	3111	java/lang/RuntimeException
    //   3105	3119	3122	java/lang/RuntimeException
    //   3126	3137	3140	java/lang/RuntimeException
    //   3131	3148	3151	java/lang/RuntimeException
    //   3163	3173	3176	java/lang/RuntimeException
    //   3190	3200	3203	java/lang/RuntimeException
    //   3217	3227	3230	java/lang/RuntimeException
    //   3244	3254	3257	java/lang/RuntimeException
    //   3271	3281	3284	java/lang/RuntimeException
    //   3295	3305	3308	java/lang/RuntimeException
    //   3302	3318	3318	java/lang/RuntimeException
    //   3331	3341	3344	java/lang/RuntimeException
    //   3338	3354	3354	java/lang/RuntimeException
    //   3367	3377	3380	java/lang/RuntimeException
    //   3374	3390	3390	java/lang/RuntimeException
    //   3403	3413	3416	java/lang/RuntimeException
    //   3410	3426	3426	java/lang/RuntimeException
    //   3439	3449	3452	java/lang/RuntimeException
    //   3446	3462	3462	java/lang/RuntimeException
    //   3475	3485	3488	java/lang/RuntimeException
    //   3482	3498	3498	java/lang/RuntimeException
    //   3519	3529	3532	java/lang/RuntimeException
    //   3526	3542	3542	java/lang/RuntimeException
    //   3563	3573	3576	java/lang/RuntimeException
    //   3570	3586	3586	java/lang/RuntimeException
    //   3607	3617	3620	java/lang/RuntimeException
    //   3614	3630	3630	java/lang/RuntimeException
    //   3651	3661	3664	java/lang/RuntimeException
    //   3658	3674	3674	java/lang/RuntimeException
    //   3695	3705	3708	java/lang/RuntimeException
    //   3702	3718	3718	java/lang/RuntimeException
    //   3731	3741	3744	java/lang/RuntimeException
    //   3738	3754	3754	java/lang/RuntimeException
    //   3767	3777	3780	java/lang/RuntimeException
    //   3774	3790	3790	java/lang/RuntimeException
    //   3803	3813	3816	java/lang/RuntimeException
    //   3810	3826	3826	java/lang/RuntimeException
    //   3839	3849	3852	java/lang/RuntimeException
    //   3846	3862	3862	java/lang/RuntimeException
    //   3875	3885	3888	java/lang/RuntimeException
    //   3882	3898	3898	java/lang/RuntimeException
    //   3919	3929	3932	java/lang/RuntimeException
    //   3926	3942	3942	java/lang/RuntimeException
    //   3963	3973	3976	java/lang/RuntimeException
    //   3970	3986	3986	java/lang/RuntimeException
    //   4007	4017	4020	java/lang/RuntimeException
    //   4014	4030	4030	java/lang/RuntimeException
    //   4051	4061	4064	java/lang/RuntimeException
    //   4058	4074	4074	java/lang/RuntimeException
    //   4095	4105	4108	java/lang/RuntimeException
    //   4102	4118	4118	java/lang/RuntimeException
    //   4131	4141	4144	java/lang/RuntimeException
    //   4138	4154	4154	java/lang/RuntimeException
    //   4167	4177	4180	java/lang/RuntimeException
    //   4174	4190	4190	java/lang/RuntimeException
    //   4203	4213	4216	java/lang/RuntimeException
    //   4210	4226	4226	java/lang/RuntimeException
    //   4239	4249	4252	java/lang/RuntimeException
    //   4246	4262	4262	java/lang/RuntimeException
    //   4275	4285	4288	java/lang/RuntimeException
    //   4282	4298	4298	java/lang/RuntimeException
    //   4319	4329	4332	java/lang/RuntimeException
    //   4326	4342	4342	java/lang/RuntimeException
    //   4363	4373	4376	java/lang/RuntimeException
    //   4370	4386	4386	java/lang/RuntimeException
    //   4407	4417	4420	java/lang/RuntimeException
    //   4414	4430	4430	java/lang/RuntimeException
    //   4451	4461	4464	java/lang/RuntimeException
    //   4458	4474	4474	java/lang/RuntimeException
    //   4495	4505	4508	java/lang/RuntimeException
    //   4502	4518	4518	java/lang/RuntimeException
    //   4531	4541	4544	java/lang/RuntimeException
    //   4538	4554	4554	java/lang/RuntimeException
    //   4567	4577	4580	java/lang/RuntimeException
    //   4574	4590	4590	java/lang/RuntimeException
    //   4603	4613	4616	java/lang/RuntimeException
    //   4610	4626	4626	java/lang/RuntimeException
    //   4639	4649	4652	java/lang/RuntimeException
    //   4646	4662	4662	java/lang/RuntimeException
    //   4675	4685	4688	java/lang/RuntimeException
    //   4682	4698	4698	java/lang/RuntimeException
    //   4719	4729	4732	java/lang/RuntimeException
    //   4726	4742	4742	java/lang/RuntimeException
    //   4763	4773	4776	java/lang/RuntimeException
    //   4770	4786	4786	java/lang/RuntimeException
    //   4807	4817	4820	java/lang/RuntimeException
    //   4814	4830	4830	java/lang/RuntimeException
    //   4851	4861	4864	java/lang/RuntimeException
    //   4858	4874	4874	java/lang/RuntimeException
    //   4895	5029	5032	java/lang/RuntimeException
    //   5054	5062	5065	java/lang/RuntimeException
    //   5059	5087	5090	java/lang/RuntimeException
    //   5069	5097	5100	java/lang/RuntimeException
    //   5094	5111	5114	java/lang/RuntimeException
    //   5104	5123	5126	java/lang/RuntimeException
    //   5118	5172	5175	java/lang/RuntimeException
    //   5130	5181	5184	java/lang/RuntimeException
    //   5199	5209	5212	java/lang/RuntimeException
    //   5204	5249	5252	java/lang/RuntimeException
    //   5280	5290	5293	java/lang/RuntimeException
    //   5333	5377	5380	java/lang/RuntimeException
    //   5338	5387	5390	java/lang/RuntimeException
    //   5384	5407	5410	java/lang/RuntimeException
    //   5422	5626	5629	java/lang/RuntimeException
    //   5635	5674	5677	java/lang/RuntimeException
    //   5700	5708	5711	java/lang/RuntimeException
    //   5705	5732	5735	java/lang/RuntimeException
    //   5715	5742	5745	java/lang/RuntimeException
    //   5739	5793	5796	java/lang/RuntimeException
    //   5749	5834	5837	java/lang/RuntimeException
    //   5860	5868	5871	java/lang/RuntimeException
    //   5865	5892	5895	java/lang/RuntimeException
    //   5875	5902	5905	java/lang/RuntimeException
    //   5899	5916	5919	java/lang/RuntimeException
    //   5909	5928	5931	java/lang/RuntimeException
    //   5923	5970	5970	java/lang/RuntimeException
    //   6064	6084	6087	java/lang/RuntimeException
    //   6069	6094	6097	java/lang/RuntimeException
    //   6091	6163	6166	java/lang/RuntimeException
    //   6178	6217	6220	java/lang/RuntimeException
    //   6242	6250	6253	java/lang/RuntimeException
    //   6247	6274	6277	java/lang/RuntimeException
    //   6257	6284	6287	java/lang/RuntimeException
    //   6281	6300	6303	java/lang/RuntimeException
    //   6291	6310	6313	java/lang/RuntimeException
    //   6345	6355	6358	java/lang/RuntimeException
    //   6350	6395	6398	java/lang/RuntimeException
    //   6404	6424	6427	java/lang/RuntimeException
    //   6421	6586	6589	java/lang/RuntimeException
    //   6632	6662	6665	java/lang/RuntimeException
    //   6657	6672	6675	java/lang/RuntimeException
    //   6669	6698	6701	java/lang/RuntimeException
    //   6705	6732	6735	java/lang/RuntimeException
    //   6867	6875	6878	java/lang/RuntimeException
    //   6872	6899	6902	java/lang/RuntimeException
    //   6882	6909	6912	java/lang/RuntimeException
    //   6906	6925	6928	java/lang/RuntimeException
    //   6916	6935	6938	java/lang/RuntimeException
    //   6932	6949	6952	java/lang/RuntimeException
    //   6942	6961	6964	java/lang/RuntimeException
    //   6956	7010	7013	java/lang/RuntimeException
    //   6968	7019	7022	java/lang/RuntimeException
    //   7037	7047	7050	java/lang/RuntimeException
    //   7044	7092	7095	java/lang/RuntimeException
    //   7054	7103	7106	java/lang/RuntimeException
    //   7129	7168	7171	java/lang/RuntimeException
    //   7228	7236	7239	java/lang/RuntimeException
    //   7233	7260	7263	java/lang/RuntimeException
    //   7243	7270	7273	java/lang/RuntimeException
    //   7267	7284	7287	java/lang/RuntimeException
    //   7277	7296	7299	java/lang/RuntimeException
    //   7291	7341	7344	java/lang/RuntimeException
    //   7303	7350	7353	java/lang/RuntimeException
    //   7361	7379	7382	java/lang/RuntimeException
    //   7376	7407	7410	java/lang/RuntimeException
    //   7386	7417	7420	java/lang/RuntimeException
    //   7414	7500	7503	java/lang/RuntimeException
    //   7424	7541	7544	java/lang/RuntimeException
    //   7549	7588	7591	java/lang/RuntimeException
    //   7614	7622	7625	java/lang/RuntimeException
    //   7619	7647	7650	java/lang/RuntimeException
    //   7629	7657	7660	java/lang/RuntimeException
    //   7654	7671	7674	java/lang/RuntimeException
    //   7664	7683	7686	java/lang/RuntimeException
    //   7678	7725	7725	java/lang/RuntimeException
    //   7742	7752	7755	java/lang/RuntimeException
    //   7747	7792	7795	java/lang/RuntimeException
    //   7823	7833	7836	java/lang/RuntimeException
    //   7830	7875	7875	java/lang/RuntimeException
    //   7897	7907	7910	java/lang/RuntimeException
    //   7902	8069	8072	java/lang/RuntimeException
    //   7914	8150	8153	java/lang/RuntimeException
    //   8237	8276	8279	java/lang/RuntimeException
    //   8301	8309	8312	java/lang/RuntimeException
    //   8306	8333	8336	java/lang/RuntimeException
    //   8316	8343	8346	java/lang/RuntimeException
    //   8340	8357	8360	java/lang/RuntimeException
    //   8350	8369	8372	java/lang/RuntimeException
    //   8364	8414	8417	java/lang/RuntimeException
    //   8376	8423	8426	java/lang/RuntimeException
    //   8441	8451	8454	java/lang/RuntimeException
    //   8446	8491	8494	java/lang/RuntimeException
    //   8532	8554	8557	java/lang/RuntimeException
    //   8537	8564	8567	java/lang/RuntimeException
    //   8561	8584	8587	java/lang/RuntimeException
    //   8571	8597	8600	java/lang/RuntimeException
    //   8591	8687	8690	java/lang/RuntimeException
    //   8694	8707	8710	java/lang/RuntimeException
    //   8772	8826	8829	java/lang/RuntimeException
    //   8852	8860	8863	java/lang/RuntimeException
    //   8857	8884	8887	java/lang/RuntimeException
    //   8867	8894	8897	java/lang/RuntimeException
    //   8891	8908	8911	java/lang/RuntimeException
    //   8901	8920	8923	java/lang/RuntimeException
    //   8915	8965	8968	java/lang/RuntimeException
    //   8927	8974	8977	java/lang/RuntimeException
    //   8992	9002	9005	java/lang/RuntimeException
    //   8997	9072	9075	java/lang/RuntimeException
    //   9009	9112	9115	java/lang/RuntimeException
    //   9121	9140	9143	java/lang/RuntimeException
    //   9147	9155	9158	java/lang/RuntimeException
    //   9152	9179	9182	java/lang/RuntimeException
    //   9162	9189	9192	java/lang/RuntimeException
    //   9186	9203	9206	java/lang/RuntimeException
    //   9196	9215	9218	java/lang/RuntimeException
    //   9210	9260	9263	java/lang/RuntimeException
    //   9222	9269	9272	java/lang/RuntimeException
    //   9287	9297	9300	java/lang/RuntimeException
    //   9292	9323	9326	java/lang/RuntimeException
    //   9304	9337	9340	java/lang/RuntimeException
    //   9330	9388	9391	java/lang/RuntimeException
    //   9395	9433	9436	java/lang/RuntimeException
    //   9442	9460	9463	java/lang/RuntimeException
    //   9467	9475	9478	java/lang/RuntimeException
    //   9472	9499	9502	java/lang/RuntimeException
    //   9482	9509	9512	java/lang/RuntimeException
    //   9506	9523	9526	java/lang/RuntimeException
    //   9516	9535	9538	java/lang/RuntimeException
    //   9530	9580	9583	java/lang/RuntimeException
    //   9542	9589	9592	java/lang/RuntimeException
    //   9607	9617	9620	java/lang/RuntimeException
    //   9646	9656	9659	java/lang/RuntimeException
    //   9670	9681	9684	java/lang/RuntimeException
    //   9675	9723	9723	java/lang/RuntimeException
    //   9870	9883	9886	java/lang/RuntimeException
    //   9880	10003	10006	java/lang/RuntimeException
    //   10015	10078	10081	java/lang/RuntimeException
    //   10087	10125	10128	java/lang/RuntimeException
    //   10134	10173	10176	java/lang/RuntimeException
    //   10199	10207	10210	java/lang/RuntimeException
    //   10204	10232	10235	java/lang/RuntimeException
    //   10214	10242	10245	java/lang/RuntimeException
    //   10239	10256	10259	java/lang/RuntimeException
    //   10249	10268	10271	java/lang/RuntimeException
    //   10263	10313	10316	java/lang/RuntimeException
    //   10275	10322	10325	java/lang/RuntimeException
    //   10340	10350	10353	java/lang/RuntimeException
    //   10379	10389	10392	java/lang/RuntimeException
    //   10434	10525	10528	java/lang/RuntimeException
    //   10534	10572	10575	java/lang/RuntimeException
    //   10581	10620	10623	java/lang/RuntimeException
    //   10646	10654	10657	java/lang/RuntimeException
    //   10651	10679	10682	java/lang/RuntimeException
    //   10661	10689	10692	java/lang/RuntimeException
    //   10686	10708	10711	java/lang/RuntimeException
    //   10715	10723	10726	java/lang/RuntimeException
    //   10720	10746	10749	java/lang/RuntimeException
    //   10730	10756	10759	java/lang/RuntimeException
    //   10753	10770	10773	java/lang/RuntimeException
    //   10763	10778	10781	java/lang/RuntimeException
    //   10785	10827	10830	java/lang/RuntimeException
    //   10789	10836	10839	java/lang/RuntimeException
    //   10854	10864	10867	java/lang/RuntimeException
    //   10889	10980	10983	java/lang/RuntimeException
    //   10989	11028	11031	java/lang/RuntimeException
    //   11053	11061	11064	java/lang/RuntimeException
    //   11058	11085	11088	java/lang/RuntimeException
    //   11068	11095	11098	java/lang/RuntimeException
    //   11261	11285	11288	java/lang/RuntimeException
    //   11282	11346	11349	java/lang/RuntimeException
    //   11358	11422	11425	java/lang/RuntimeException
    //   11447	11455	11458	java/lang/RuntimeException
    //   11452	11479	11482	java/lang/RuntimeException
    //   11462	11489	11492	java/lang/RuntimeException
    //   11486	11503	11506	java/lang/RuntimeException
    //   11496	11515	11518	java/lang/RuntimeException
    //   11510	11545	11548	java/lang/RuntimeException
    //   11522	11554	11557	java/lang/RuntimeException
    //   11572	11582	11585	java/lang/RuntimeException
    //   11611	11621	11624	java/lang/RuntimeException
    //   11666	11692	11695	java/lang/RuntimeException
    //   11873	11911	11914	java/lang/RuntimeException
    //   11920	11958	11961	java/lang/RuntimeException
    //   11967	12006	12009	java/lang/RuntimeException
    //   12032	12040	12043	java/lang/RuntimeException
    //   12053	12077	12080	java/lang/RuntimeException
    //   12074	12106	12109	java/lang/RuntimeException
    //   12084	12116	12119	java/lang/RuntimeException
    //   12113	12142	12145	java/lang/RuntimeException
    //   12149	12424	12427	java/lang/RuntimeException
    //   12152	12468	12471	java/lang/RuntimeException
    //   12475	12493	12496	java/lang/RuntimeException
    //   12500	12508	12511	java/lang/RuntimeException
    //   12505	12532	12535	java/lang/RuntimeException
    //   12515	12542	12545	java/lang/RuntimeException
    //   12539	12556	12559	java/lang/RuntimeException
    //   12549	12568	12571	java/lang/RuntimeException
    //   12563	12613	12616	java/lang/RuntimeException
    //   12575	12622	12625	java/lang/RuntimeException
    //   12640	12650	12653	java/lang/RuntimeException
    //   12679	12689	12692	java/lang/RuntimeException
    //   12802	12867	12870	java/lang/RuntimeException
    //   12876	12914	12917	java/lang/RuntimeException
    //   12923	12962	12965	java/lang/RuntimeException
    //   12987	12995	12998	java/lang/RuntimeException
    //   12992	13020	13023	java/lang/RuntimeException
    //   13002	13030	13033	java/lang/RuntimeException
    //   13027	13666	13669	java/lang/RuntimeException
    //   13037	13707	13710	java/lang/RuntimeException
    //   13732	13740	13743	java/lang/RuntimeException
    //   13737	13764	13767	java/lang/RuntimeException
    //   13747	13774	13777	java/lang/RuntimeException
    //   13771	13788	13791	java/lang/RuntimeException
    //   13781	13800	13803	java/lang/RuntimeException
    //   13795	13845	13848	java/lang/RuntimeException
    //   13807	13854	13857	java/lang/RuntimeException
    //   13872	13882	13885	java/lang/RuntimeException
    //   13911	13926	13929	java/lang/RuntimeException
    //   13916	13940	13943	java/lang/RuntimeException
    //   13933	13953	13956	java/lang/RuntimeException
    //   13947	13969	13969	java/lang/RuntimeException
    //   14130	14154	14157	java/lang/RuntimeException
    //   14151	14170	14170	java/lang/RuntimeException
    //   14195	14219	14222	java/lang/RuntimeException
    //   14216	14236	14236	java/lang/RuntimeException
    //   14261	14314	14317	java/lang/RuntimeException
    //   14307	14327	14330	java/lang/RuntimeException
    //   14321	14344	14344	java/lang/RuntimeException
    //   14505	14529	14532	java/lang/RuntimeException
    //   14526	14546	14546	java/lang/RuntimeException
    //   14571	14595	14598	java/lang/RuntimeException
    //   14592	14612	14612	java/lang/RuntimeException
    //   14678	14716	14719	java/lang/RuntimeException
    //   14725	14764	14767	java/lang/RuntimeException
  }
  
  private void lambda$onCommand$0(CommandSender paramCommandSender, String paramString) {
    long l1 = b ^ 0x23FE0C624DF4L, l2 = l1 ^ 0x29342A4DEA73L;
    new Object[3];
    aegisguard_d(new Object[] { null, null, Long.valueOf(l2), paramString
          .replaceAll(d[127], aegisguard_K.INSTANCE.aegisguard_j().getDescription().getVersion()), paramCommandSender });
  }
  
  private void lambda$onCommand$1(CommandSender paramCommandSender, String paramString) {
    long l1 = b ^ 0x45E31D052ECDL, l2 = l1 ^ 0x4F293B2A894AL;
    new Object[3];
    aegisguard_d(new Object[] { null, null, Long.valueOf(l2), paramString
          .replaceAll(d[138], aegisguard_K.INSTANCE.aegisguard_j().getDescription().getVersion()), paramCommandSender });
  }
  
  private static Integer lambda$onCommand$2(Integer paramInteger1, Integer paramInteger2) {
    return paramInteger1;
  }
  
  private static Integer lambda$onCommand$3(Integer paramInteger1, Integer paramInteger2) {
    return paramInteger1;
  }
  
  private static Integer lambda$onCommand$4(Integer paramInteger1, Integer paramInteger2) {
    return paramInteger1;
  }
  
  private static Integer lambda$onCommand$5(Integer paramInteger1, Integer paramInteger2) {
    return paramInteger1;
  }
  
  private void lambda$onCommand$6(CommandSender paramCommandSender, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, String paramString18, String paramString19, String paramString20, String paramString21, String paramString22, String paramString23, String paramString24, String paramString25, String paramString26, String paramString27, String paramString28, String paramString29, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35, String paramString36, String paramString37, String paramString38, String paramString39, String paramString40, String paramString41) {
    long l1 = b ^ 0x19FCC9AF0ECBL, l2 = l1 ^ 0x1336EF80A94CL;
    String[] arrayOfString = d;
    new Object[3];
    aegisguard_d(new Object[] { null, null, Long.valueOf(l2), paramString41
          .replaceAll(arrayOfString[34], paramString1)
          .replaceAll(arrayOfString[115], paramString2)
          .replaceAll(arrayOfString[56], paramString3)
          .replaceAll(arrayOfString[25], paramString4)
          .replaceAll(arrayOfString[63], paramString5)
          .replaceAll(arrayOfString[46], paramString6)
          .replaceAll(arrayOfString[48], paramString7)
          .replaceAll(arrayOfString[100], paramString8)
          .replaceAll(arrayOfString[95], paramString9)
          .replaceAll(arrayOfString[3], paramString10)
          .replaceAll(arrayOfString[15], paramString11)
          .replaceAll(arrayOfString[53], paramString12)
          .replaceAll(arrayOfString[99], paramString13)
          .replaceAll(arrayOfString[180], paramString14)
          .replaceAll(arrayOfString[5], paramString15)
          .replaceAll(arrayOfString[82], paramString16)
          .replaceAll(arrayOfString[173], paramString17)
          .replaceAll(arrayOfString[132], paramString18)
          .replaceAll(arrayOfString[161], paramString19)
          .replaceAll(arrayOfString[27], paramString20)
          .replaceAll(arrayOfString[142], paramString21)
          .replaceAll(arrayOfString[11], paramString22)
          .replaceAll(arrayOfString[70], paramString23)
          .replaceAll(arrayOfString[93], paramString24)
          .replaceAll(arrayOfString[79], paramString25)
          .replaceAll(arrayOfString[9], paramString26)
          .replaceAll(arrayOfString[17], paramString27)
          .replaceAll(arrayOfString[118], paramString28)
          .replaceAll(arrayOfString[7], paramString29)
          .replaceAll(arrayOfString[90], paramString30)
          .replaceAll(arrayOfString[51], paramString31)
          .replaceAll(arrayOfString[67], paramString32)
          .replaceAll(arrayOfString[66], paramString33)
          .replaceAll(arrayOfString[157], paramString34)
          .replaceAll(arrayOfString[71], paramString35)
          .replaceAll(arrayOfString[57], paramString36)
          .replaceAll(arrayOfString[58], paramString37)
          .replaceAll(arrayOfString[133], paramString38)
          .replaceAll(arrayOfString[16], paramString39)
          .replaceAll(arrayOfString[36], paramString40), paramCommandSender });
  }
  
  private void lambda$onCommand$7(CommandSender paramCommandSender, String paramString) {
    long l1 = b ^ 0x287F04DAFF03L, l2 = l1 ^ 0x22B522F55884L;
    new Object[3];
    aegisguard_d(new Object[] { null, null, Long.valueOf(l2), d[122] + paramString, paramCommandSender });
  }
  
  private static void lambda$onCommand$8(Check paramCheck, aegisguard_hu paramaegisguard_hu) {
    long l1 = b ^ 0x17A5DAA85BC6L, l2 = l1 ^ 0xF77D29DE1DL;
    String[] arrayOfString = d;
    new Object[4];
    aegisguard_K.INSTANCE.aegisguard_l().aegisguard_v(new Object[] { null, null, null, Long.valueOf(l2), arrayOfString[106], paramaegisguard_hu, paramCheck });
    new Object[4];
    aegisguard_K.INSTANCE.aegisguard_l().aegisguard_v(new Object[] { null, null, null, Long.valueOf(l2), arrayOfString[97], paramaegisguard_hu, paramCheck });
    new Object[4];
    aegisguard_K.INSTANCE.aegisguard_l().aegisguard_v(new Object[] { null, null, null, Long.valueOf(l2), arrayOfString[97], paramaegisguard_hu, paramCheck });
  }
  
  private static void lambda$onCommand$9(Player paramPlayer1, Player paramPlayer2, String paramString) {
    paramPlayer1.performCommand(paramString.replaceAll(d[20], paramPlayer2.getName()));
  }
  
  private static void lambda$onCommand$10(String paramString1, String paramString2) {
    aegisguard_Xz.aegisguard_y(paramString2
        .replaceAll(d[52], paramString1));
  }
  
  private static void lambda$onCommand$11(List<String> paramList, String paramString) {
    paramList.add(paramString);
  }
  
  private void lambda$onCommand$12(CommandSender paramCommandSender, Player paramPlayer, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    long l1 = b ^ 0x33BA8277E345L, l2 = l1 ^ 0x3970A45844C2L;
    String[] arrayOfString = d;
    new Object[3];
    aegisguard_d(new Object[] { null, null, Long.valueOf(l2), paramString6
          .replaceAll(arrayOfString[52], paramPlayer.getName())
          .replaceAll(arrayOfString[29], paramString1)
          .replaceAll(arrayOfString[30], paramString2)
          .replaceAll(arrayOfString[166], paramString3)
          .replaceAll(arrayOfString[121], paramString4)
          .replaceAll(arrayOfString[40], paramString5), paramCommandSender });
  }
  
  private void lambda$onCommand$13(CommandSender paramCommandSender, String paramString1, String paramString2, String paramString3, String paramString4, aegisguard_hu paramaegisguard_hu, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13) {
    long l1 = b ^ 0x30D1FCD3E79L, l2 = l1 ^ 0x9C739E299FEL;
    String[] arrayOfString = d;
    new Object[3];
    aegisguard_d(new Object[] { null, null, Long.valueOf(l2), paramString13
          .replaceAll(arrayOfString[52], paramString1)
          .replaceAll(arrayOfString[14], paramString2)
          .replaceAll(arrayOfString[167], paramString3)
          .replaceAll(arrayOfString[172], paramString4)
          .replaceAll(arrayOfString[107], Double.toString(paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_v(new Object[0])))
          .replaceAll(arrayOfString[55], Integer.toString(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_l(new Object[0])))
          .replaceAll(arrayOfString[165], Integer.toString(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_vY(new Object[0])))
          .replaceAll(arrayOfString[104], Integer.toString(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_vN(new Object[0])))
          .replaceAll(arrayOfString[69], paramaegisguard_hu.aegisguard_L(new Object[0]).getWorld().getName())
          .replaceAll(arrayOfString[119], paramaegisguard_hu.aegisguard_L(new Object[0]).getActivePotionEffects().toString())
          .replaceAll(arrayOfString[105], paramString5)
          .replaceAll(arrayOfString[12], paramString6)
          .replaceAll(arrayOfString[61], paramString7)
          .replaceAll(arrayOfString[31], paramString8)
          .replaceAll(arrayOfString[146], paramString9)
          .replaceAll(arrayOfString[131], paramString10)
          .replaceAll(arrayOfString[164], paramString11)
          .replaceAll(arrayOfString[26], paramString12), paramCommandSender });
  }
  
  private void lambda$onCommand$14(CommandSender paramCommandSender, String paramString1, String paramString2, String paramString3, String paramString4, aegisguard_hu paramaegisguard_hu, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13) {
    long l1 = b ^ 0x49ED0F14F2CAL, l2 = l1 ^ 0x4327293B554DL;
    String[] arrayOfString = d;
    new Object[3];
    aegisguard_d(new Object[] { null, null, Long.valueOf(l2), paramString13
          .replaceAll(arrayOfString[52], paramString1)
          .replaceAll(arrayOfString[179], paramString2)
          .replaceAll(arrayOfString[120], paramString3)
          .replaceAll(arrayOfString[103], paramString4)
          .replaceAll(arrayOfString[124], Double.toString(paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_v(new Object[0])))
          .replaceAll(arrayOfString[43], Integer.toString(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_l(new Object[0])))
          .replaceAll(arrayOfString[23], Integer.toString(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_vY(new Object[0])))
          .replaceAll(arrayOfString[19], Integer.toString(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_vN(new Object[0])))
          .replaceAll(arrayOfString[123], paramaegisguard_hu.aegisguard_L(new Object[0]).getWorld().getName())
          .replaceAll(arrayOfString[4], paramaegisguard_hu.aegisguard_L(new Object[0]).getActivePotionEffects().toString())
          .replaceAll(arrayOfString[87], paramString5)
          .replaceAll(arrayOfString[32], paramString6)
          .replaceAll(arrayOfString[33], paramString7)
          .replaceAll(arrayOfString[125], paramString8)
          .replaceAll(arrayOfString[149], paramString9)
          .replaceAll(arrayOfString[85], paramString10)
          .replaceAll(arrayOfString[42], paramString11)
          .replaceAll(arrayOfString[98], paramString12), paramCommandSender });
  }
  
  private void aegisguard_w(Object[] paramArrayOfObject) {
    Player player = (Player)paramArrayOfObject[0];
    String str = (String)paramArrayOfObject[1];
    ByteArrayDataOutput byteArrayDataOutput = ByteStreams.newDataOutput();
    String[] arrayOfString = d;
    byteArrayDataOutput.writeUTF(arrayOfString[21]);
    byteArrayDataOutput.writeUTF(str);
    player.sendPluginMessage((Plugin)aegisguard_K.INSTANCE.aegisguard_j(), arrayOfString[170], byteArrayDataOutput.toByteArray());
  }
  
  public static void aegisguard_p(String paramString) {
    aegisguard_f = paramString;
  }
  
  public static String aegisguard_V() {
    return aegisguard_f;
  }
  
  static {
    long l = b ^ 0x23EA2A7CBC13L;
    aegisguard_p("hsQ3Wc");
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[181];
    boolean bool = false;
    String str;
    int i = (str = "ØE´×4\b§èõb,ÃZ\030´Z6\017}\007õ\blDõ÷è\026vÕ@ê\020ùr\bdp#lÛ¡Â\030\\\030Üb,â%ßõÓ\025N\022XN-\020ãú×@\030ßá¬¤AõÂ|é3\f/\nEÌÝðÐ\020;= `6\031\t?ñ»\007ô\b\026W\020OeÇ&ÜeD9qÓiß¢ÿ\030\016¦\030!k*(Ç\007É^\tCpIïÃ?¡ÕI\bÞ¯ë\020ìØ\030\016¦\030!k*(Ç\005»ë\025\026\025Ä=?\002Ò±\020I\007!q²õàûCy«v­åy\030\016¦\030!k*(Ç\024Ì½yÁèGh©ûâ\021épç\032\030\016æ\004În\034_Pçh\021Lm\017¥ÅÍ\030p¢\b7\003¾\003\007MøíûêFË)z\032\020Ü¯¸\022#â~ý4¡~Äõ\020;= `6\031\t?W¥HÜSõá\030\004\005.o\\Ó\022Ç!\002»Daù<B¦ô+;\030\016¦\030!k*(ÇgD¸\"{ÄOD»P¹î\b­g^G·\b@æ\0376z¾\r\020[FÙÅù¿P2ò|\bcù\020`\020/g:\030V\031 Û~Ä¬\005\020\001æ\001k*6]õ\021Üü×!;T\bd\027ÐHl\nF\f\030s\031«ß¯´º¾Ýt5ÉK\022Î±±ê\035¯D\020Àk ©¹\0253VóÌE\037§PV\033\020[g>+\0374ïÇi|Êkói\030;= `6\031\t?\013<ðæ;ùpø6uÔ{r\030t*&¨Ï1ÏË+rÿL\020Ø§Ì(\025ú\020tÙ\030D\006%\030GÙ@ày0\024ñãM\nb¾\t¹\005\030véÔ·Ýõ\0017Á=Sf[t?Æ\002ucß¦^\006\r\030ë?F6ëMÈV.¬\004Ý\0019$\023V¡{Ý{¶\030\016æ\004În\034_Pçh\021Lm\017¥ÅÍ\030Ü¯¸\022#â¦T\034j(\032¡¨½qz\020>¡\023\004M²Õ\tÏ:¥\033\030\nkDÏº\030wïûK\001u\033\035å\n}5\022\030\004\005.o\\Óä\033x«¹oËfÇ5Ò\021vl tìÌU\rt\034¾\f4\037`3\020XëU@D<Èíñ\035ä2\002}Ô\020\017wÂÞáp÷]\013x¸D\003ê©ã\020å×Án\017úA\024\024Î\030Lâö\020Ú\\ùè<E\002\032ï4ù³ò_\030s\031«ß¯´` RÁ^\020Õ\035¶e¶&\bôÓ\030\004\005.o\\Ó\032tø*åúÿí\021²#0'/\b0¼®YH'a\020\024RÌYÐN\f«7%n3M\030D\020lX\022tgÈaÎ÷Wv'\030>¡\023\004M²Õ¶$À@ysúgP×7Yöv\030DÔu\000#GMÝgYvF\002äâl0ÂôÛóF\030I\037 Þ÷ï¡*x\017¼Q\bs°\r¾··À\017·ÀÇUeÌò\016\000¡ÁÏíQáÉDÎ\"î1ªLí:èXÍ\001}ÂÉUçÇïßx\016ÃÉF« Þ¢DSQ:`£\030ìd\000Äü2Iì)Nci°¶ÒÅfYâÁ\033ÏP(vé¤2*ãè\017¦6Ã*\030ú&fn[¯\035\025;È$uGäú.ºÛj¼ã¬cáåX1kFTþ\bÛÂéa\017¬\024Ì\034fÿ\nô JÓ¾­\000ø¯7Áªè²¾ér-gÄg»ñ:ã\000¾fû\rä±¼:ÉÇ\020ÜO¾Ú9\0073(ì´_\036\022¤\020\004\005.o\\Óð1^3w\005\020[FÙÅù¿P2ò|\bcù\020;= `6\031\t?¡íØmº\030x\017\030ç{e~;»2oçM+,63mÉ6/\003#\b0¼®YH'a\020A¦\025ÕpüT¥DÒÅ\023Îà\030\004\005.o\\Ó?[ÒW¡\035þ;?+î©¿\030\004\005.o\\Óng\nä`\027w²!Æ×ÇÙY\020\035[¼vUqù\032u/Ýß\bÚ}R\020,+\030Ü¯¸\022#â¦T\034j(\032¡¨½qz\030ç{e~;»2oê¬ïÄxèæ\022Û¹ã97\032X\020\\\030Üb,Ñ\"ð\006 ´\006\b©â¨­\006u\f\bLÖí`¹Ý\020\004\005.o\\ÓfPðÜ\007ÒIÜ\020\004\005.o\\Ó\021¢\034ÐøìÊ\020I\007!q²õà½a\f\025\020\b#Fÿ{[Ó{ô\030\016¦\030!k*(Ç¶CVâ=8<\002Æ\\\020:\020\004\005.o\\Óï\"\034õ,¸\bYo\026Z4Ì³\016\bâvAÂÆ\020·t><L\013\022häèvÚÁ:\025\bûO¼8\037 \031æ ½þ\004púó¿D?ý%+\001f>\027[\033TîJ¤ÍÝz\nðäÓ\020H\033ÎWSC0QVÓ±ê¦ôû\byrcá»va\030\016¦\030!k*(Ç\rªú×±öK\007j9Ñ;\003^¿w\030EwÌ\034õ(@C^§g§\000Å°ê²W\023&>º\0203 \"hU­GLò·¯x¥!£n\030;= `6\031\t?\020óJ·}ºtª§\002üuñÆ\bv½'äÔQHð\030à\nJ¸z\031\025\004Ç$\032x}NF¾ÔÃÜÆ\023#\030\016¦\030!k*(Ç{°ìtâ-õßá~iQ½ä\b½ç<rÿå!\020\016æ\004În\002\037©\027R#I\bÎrº\ff\nä¹@\035¯\033¿ÐÿxY,\025¡\nWÅTv!D\fb'e@D\020j=¶ä\002)¬BÁ¢æ\026³.æ¾ãU~¬í})\002Ï\bÉ\030\016¦\030!k*(ÇBXz\000\tyÎÈ¶\004¶Ë¼ïø\bdp#lÛ¡Â\b\016+©®Ên\030\016¦\030!k*(ÇÓ§Ü6>Â´óå_ñ\026©\020=N¹Å5~\013·Â\004éï\030Àk ©¹\0253V\r\\ r²ÿ\\ÿ9?âú,mî\020B°tòÛ ÁÓ\002¾yN Jÿ\034\020Dq[ïB~*^Å\037\027iÏR\020[g>+\0374ïÇi|Êkói\020;= `6\031\t?|g\016p+<´\030A¦\025ÕpüX¥\fk»Rö¿VñÌ-Î\020I\007!q²õàén\032ïÁÜñ\020´Z6\017}\007õ¸©x¾Bì\bvn)ó\002æþ\b@æ\0376z¾\r\020\016æ\004În\002\037©\027R#I\020Dq[ïB~*^Å\037\027iÏR\020M1Do}ÒÅï\034m~\000TVÍ\025\030EwÌ\034õ(@C^§g§\000Å°ê²W\023&>º\030à\nJ¸z\031\025\004Ú\017%\034\036ô\027Yä2¼\nfy\020ç{e~;»2oþæÇ$Ø\024\nî\020EwÌ\034õ(@C²¼\"<\001´\bxà³ú®\b\b$\bNI\035Â®\0200âÕ/PidÅÄ»@­Á<\020I\037 Þ÷ï¡y7§3½¨ýi\02002G²¤\013ê\037e\nC<à\030\\ÐMOE\003h¿Å%ô°\020ÁÅ$d¼æÚi\030\016¦\030!k*(Ç¼Úð=S¤1é>Vã\006ßÛO\030ßá¬¤AõÂ|é3\f/\nEÌÝðÐ\bò¥ìÅ%\016F\031 Ô\017ûÜZ´·Uz³D.N\036új»¸7Î|Uóï\025Ã\rÈ\bxà³ú®\b\b#Fÿ{[Ó{ô\020M1Do}ÒÅï\034m~\000TVÍ\025\030ë?F6ëMÈV.¬\004Ý\0019$\023V¡{Ý{¶\b¹&]%\020íú*¿¿]%f\"º¥`ß;\020\nkDÏº\030wÖ+ÂeX\b5ÚQW\006À^\b=1fÅ0ýý\017\030\016¦\030!k*(Ç{°ìtâ-õßá~iQ½ä\030;= `6\031\t?¾t½\000´ÎW\026ê¹\025!w\030\004\005.o\\Ó°Y\024Ù)}Ï+\030ª\021\002 o\000òÅðáA\007ýMÓÛ÷!\002\rò=Hù¢\016£\016na¦£(¥\030ü'ü6\025Ëvtú\034q5´\027.\fQ¼^Ðçí¼(\024¨\006\016:ÉµE|}ÉôÐäå°$w\r\027\017\025þ?ó(µ5¶wdå]ø@\020\bdNà\020¨0ñÐÄm\023|½\020íú*¿¿]%f\"º¥`ß;\b¹&]%\020nx­'ÿâ\016êÅYø|áê¡\020P\017 Bu»¨p<ày\nÂ\0048æ\030\016¦\030!k*(ÇÓ}êÇÆy÷0\006(ÁIuÎ/Ï\020\001!ÜQÙsR\007©»Õ\013\020ç{e~;»2oZv¿psÂ\020s\031«ß¯´§\037\022Î0Á\030;= `6\031\t?ø9§\"f\031\027É \023ö¥¢º\bÁ\026¶}.G\037\030\035íÆ&\fØØã$a·G\023\b2ÀÕKZâwÉ\030;= `6\031\t?ø9§\"f\031\027É \023ö¥¢º\bîÛ­8úo\b:uýe\017\000\020±@­\nÈDÿã¤ò¥,®\bÇÓ­Ã&ê«ù ½þ\004púó¿Dß¢y\030%PË¾rÂQ5V{\032\026ócG¾\b{Ì©\027\033\"\020WE²Ãè<Øú/\033¥\030«\020\004\005.o\\ÓúCi\naA½\b*\032ó·õ\021%\t\b¨\005ülÉª¶\030N©^+øvÄk`\037/s·jä\026òËás\030;= `6\031\t?öÞn®(1$&+\0164·ÆvÎ\b+c¹\004\027\b¨\005ülÉª¶\030\004\005.o\\Ó\032tø*åúÿí\021²#0'/\bd\027ÐHl\nF\f\030Ö\032\"\013nkïÀ¹\035\037îj\020í\027ø¹½S´<\bò¥ìÅ%\016F\031\020Wó/l<¿@3\013ÿh\031\\Ìáé\020ÜO¾Ú9\0073(ì´_\036\022¤\020\024Êý]¬\013ÃÕ\007Ò3£»u3á\bûJN`«\016¨Ù\bvn)ó\002æþ\030;= `6\031\t?\020¶\022H¸9ú\020ÐgG\n\f>À\020÷\007N\0373(NImº\025r\021\b©â¨­\006u\f\bGE¼ ´¦Õ\020\024RÌYÐN\f«7%n3M\030D\020!ô©2ÌäY¡½\036Á1ô").length();
    byte b2 = 16;
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
