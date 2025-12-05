package me.frep.aegisguard.spigot.AegisGuard_a;

import java.util.List;
import java.util.Map;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.Material;

public final class aegisguard_a {
  public static final double aegisguard_F = 0.41999998688697815D;
  
  public static final List aegisguard_s;
  
  public static final Map aegisguard_C;
  
  public static final Map aegisguard_T;
  
  public static final Map aegisguard_c;
  
  public static final Map aegisguard_U;
  
  private static AbstractCheck[] aegisguard_W;
  
  private static final String[] a;
  
  private aegisguard_a() {
    throw new UnsupportedOperationException(a[160]);
  }
  
  private static Material[] lambda$static$0(int paramInt) {
    return new Material[paramInt];
  }
  
  static {
    // Byte code:
    //   0: sipush #185
    //   3: anewarray java/lang/String
    //   6: astore #5
    //   8: aconst_null
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc '0&yHot)7+5nO`y+\\t7yHwn+7tD}t?\\n)&cD}w(9*5kZ45h# r\\n3\\t rWzd"5$0dWzh3<c\\f56uOpu"=t^-1mDpd+<r^mu\\b.=hDpi" 3uH\\r"7tZs8>iXt+?cDls29cI`y(4\\f3qUzi! c\\t.=hD{t(\\b(9y_pt5 3uH\\n0&yHot)7% eS`l(6yHkz.!7\\t vWzd4'jPzi8=~*!uB`x(0j^lo(7 3Dls29cI`y(0;r^`|+(c_`o" gXpo34\\f sXzd0=bDlo& u4'jPzi8=~7\\t vWzd 3|^{d3 tZ|t3\\b3+1r^mu\\r.=hDki&\\f6iTm+5nO`|5+yHwn+7tD}t?%?dTp7\\t?vPvu+?cDxw&7bDk~53eTko&\\n6\\t3tOed(756y\sz=6yOzi51iOkz*>iU# mDpz,!rZvi47!rTqd4\\b;ePfd%!c!<e^\\f4\\f sXzd!<e^4<bHkt)-uO~r5\\t#!v^qh"+5nO`y+\\t7y\sz=6yOzi51iOkz0=b\\b%'cDvx".4cHk~#!rTq~# mDpz,4cU|~56yH~u#&iUzd4\\b3oIl-\\t<aWzd!<e^`|&\\b7%'cDxw&7bDk~53eTko&#=vKzi0=j4 iTrw.:r$34\\f sXzd33v_pt5\\t0 mYzu$$0dWzd0>j\\f6\\t3tOed%=eP\\b$'j_mt)(3h\zd 3|^{d3 tZ|t3\\b34\\f=h\z\\t/+yYst$\\n!<e^`|&\\b7>>jThd4'jPzi8=~\\r7\\t vNmd4\\b3oIl\\n >bD}w(9\\n% eS`( \\n 3uH`k&\\b: 3Dxw&7bDk~53eTko&\\b$<eIzo"%;eP"7tZs8 c\\b(!o_vz)56uOpu"0jT|p0=bDlo& u\\t/+yYst$\\b(!cIi~5*>iU`y+1m\\r#3kTq8>iXt-\\t<aWzd0=bDlo& u\\b >bDpi"%3eP`|+(c_`o" gXpo3\\n71m^{d.7\\f.=hD}z5;h\*5cUkz8:sWt~50iC4\\f sXzd#=t%=qU`h/\\t>m^md%*4\\b=h^`h+0$7uO-\\t9cYpc)&n^md0 rD}w(956yHwn+7tD}t?\\r56yH~u#&iUz\\t#7vHsz300 7cU`h/\\t>m^md%*\\r# mDpz,6iTm# mDpz,4cU|~83r^(3h\zd4'jPzi8=~+5y)\\b(9y_pt5&3eR~d43d\\f)&n^md%;eP+5nO`|5+y\sz=6yOzi51iOkz\\f7\\t vNmd%=eP)&n^md0 rD}w(9.4cHk~#6c^oh+&c\\f%;eP`h3;tH*5cUkz8>gAz8\\b7tI~x(\\b&g.=hD{t(-dWpx,\\t33vD{t($0q^}%'cDls29cI`y()&n^md%;eP`h3;tH\\r4=iOwd%;ePH%3eP`h/\\t>m^md%*7!rTqd"&cUlr(&$oW\\f-\\t<aWzd!<e^$3hDxw&7bDk~53eTko&\\r33vKz8:cHk$<eIzo""iL{~5-\\t<aWzd#=t#;c_`p""yYst$\\b$3jDpi"\\t+"oH`t54\\f sXzd!<e^`|&\\b77<mDls29cI`y(%?dTpd4"jRq|\\r#&cXkt5 gRs"1nZqo*<rDkz%7% eS`}"1cDxz37\\t vNmd43d! c\\n$3jD}w(9>>jThd 3|^{d3 tZ|t3\\b3\\f&3eR~d!<e^\\f7%cIz83oW"6cI`x/!r/"v^m7!rTqd%!c7<mDxw&7bDk~53eTko&.7%6+5\\t4'jDlz)\\n"6yYmr$!&3eR~d#=t&3eR~d!<e^`|&\\b7\\r7\\t vNmd7>jZm%3eTq*1cW4\\f sXzd#=t\\t0>jDlr \\t4<bHkt)!\\t hZ|~ 3p^s7!rTqd*$oUxd77e^\\t.=hD{t(234U;VHG=RSoVW(xSZ/RGu[=HtK9ROuLO2OzK^\\r4=iOwd4\\b3oIl0;r^`h/\\t>m^md%*$0dWzh3<cDlo& u$ p^{d7\\t?vPvu% eS`}"1c\\r6\\t3tOed4\\b3oIl0 v^{d0 rD}w(9#3kTq8 c 7cU`|+(c_`o" gXpo3&&oM~o(-tZvw%=qU`|+(c_`o" gXpo3!=uOz81c5;jH\\b/+yY~w"4\\f=h\z+"oH`y+1m$3hDls29cI`y(4<b56yUzo/ yYmr$4\\b=h^\\r&3eR~d4\\b3oIl$9c'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: bipush #10
    //   22: istore_1
    //   23: invokestatic aegisguard_s : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #64
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 140
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc '$7bNw}"3\\t/7gB}t!'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #10
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #74
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 140
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #39
    //   210: goto -> 240
    //   213: bipush #28
    //   215: goto -> 240
    //   218: bipush #50
    //   220: goto -> 240
    //   223: bipush #102
    //   225: goto -> 240
    //   228: bipush #91
    //   230: goto -> 240
    //   233: bipush #127
    //   235: goto -> 240
    //   238: bipush #123
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 45, 0 -> 104
    //   296: new java/util/ArrayList
    //   299: dup
    //   300: invokespecial <init> : ()V
    //   303: putstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   306: new java/util/HashMap
    //   309: dup
    //   310: invokespecial <init> : ()V
    //   313: putstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   316: new java/util/HashMap
    //   319: dup
    //   320: invokespecial <init> : ()V
    //   323: putstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_T : Ljava/util/Map;
    //   326: new java/util/HashMap
    //   329: dup
    //   330: invokespecial <init> : ()V
    //   333: putstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   336: new java/util/HashMap
    //   339: dup
    //   340: invokespecial <init> : ()V
    //   343: putstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   346: invokestatic values : ()[Lorg/bukkit/Material;
    //   349: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   352: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   357: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   362: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   367: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   372: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   377: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   382: checkcast [Lorg/bukkit/Material;
    //   385: astore #7
    //   387: iconst_0
    //   388: anewarray java/lang/Object
    //   391: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   394: ifeq -> 1001
    //   397: new java/util/ArrayList
    //   400: dup
    //   401: invokespecial <init> : ()V
    //   404: astore #8
    //   406: aload #8
    //   408: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   411: astore_0
    //   412: aload_0
    //   413: sipush #144
    //   416: aaload
    //   417: invokeinterface add : (Ljava/lang/Object;)Z
    //   422: pop
    //   423: aload #8
    //   425: aload_0
    //   426: sipush #143
    //   429: aaload
    //   430: invokeinterface add : (Ljava/lang/Object;)Z
    //   435: pop
    //   436: aload #8
    //   438: aload_0
    //   439: sipush #182
    //   442: aaload
    //   443: invokeinterface add : (Ljava/lang/Object;)Z
    //   448: pop
    //   449: aload #8
    //   451: aload_0
    //   452: bipush #83
    //   454: aaload
    //   455: invokeinterface add : (Ljava/lang/Object;)Z
    //   460: pop
    //   461: aload #8
    //   463: aload_0
    //   464: sipush #134
    //   467: aaload
    //   468: invokeinterface add : (Ljava/lang/Object;)Z
    //   473: pop
    //   474: aload #8
    //   476: aload_0
    //   477: bipush #89
    //   479: aaload
    //   480: invokeinterface add : (Ljava/lang/Object;)Z
    //   485: pop
    //   486: aload #8
    //   488: aload_0
    //   489: bipush #16
    //   491: aaload
    //   492: invokeinterface add : (Ljava/lang/Object;)Z
    //   497: pop
    //   498: aload #8
    //   500: aload_0
    //   501: iconst_0
    //   502: aaload
    //   503: invokeinterface add : (Ljava/lang/Object;)Z
    //   508: pop
    //   509: aload #8
    //   511: aload_0
    //   512: bipush #45
    //   514: aaload
    //   515: invokeinterface add : (Ljava/lang/Object;)Z
    //   520: pop
    //   521: aload #8
    //   523: aload_0
    //   524: sipush #129
    //   527: aaload
    //   528: invokeinterface add : (Ljava/lang/Object;)Z
    //   533: pop
    //   534: aload #8
    //   536: aload_0
    //   537: bipush #61
    //   539: aaload
    //   540: invokeinterface add : (Ljava/lang/Object;)Z
    //   545: pop
    //   546: aload #8
    //   548: aload_0
    //   549: bipush #107
    //   551: aaload
    //   552: invokeinterface add : (Ljava/lang/Object;)Z
    //   557: pop
    //   558: aload #8
    //   560: aload_0
    //   561: bipush #9
    //   563: aaload
    //   564: invokeinterface add : (Ljava/lang/Object;)Z
    //   569: pop
    //   570: aload #8
    //   572: aload_0
    //   573: sipush #164
    //   576: aaload
    //   577: invokeinterface add : (Ljava/lang/Object;)Z
    //   582: pop
    //   583: aload #8
    //   585: aload_0
    //   586: bipush #17
    //   588: aaload
    //   589: invokeinterface add : (Ljava/lang/Object;)Z
    //   594: pop
    //   595: aload #8
    //   597: aload_0
    //   598: bipush #94
    //   600: aaload
    //   601: invokeinterface add : (Ljava/lang/Object;)Z
    //   606: pop
    //   607: aload #8
    //   609: aload_0
    //   610: bipush #95
    //   612: aaload
    //   613: invokeinterface add : (Ljava/lang/Object;)Z
    //   618: pop
    //   619: aload #8
    //   621: aload_0
    //   622: bipush #112
    //   624: aaload
    //   625: invokeinterface add : (Ljava/lang/Object;)Z
    //   630: pop
    //   631: aload #8
    //   633: aload_0
    //   634: bipush #76
    //   636: aaload
    //   637: invokeinterface add : (Ljava/lang/Object;)Z
    //   642: pop
    //   643: aload #8
    //   645: aload_0
    //   646: bipush #19
    //   648: aaload
    //   649: invokeinterface add : (Ljava/lang/Object;)Z
    //   654: pop
    //   655: aload #8
    //   657: aload_0
    //   658: bipush #28
    //   660: aaload
    //   661: invokeinterface add : (Ljava/lang/Object;)Z
    //   666: pop
    //   667: aload #8
    //   669: aload_0
    //   670: bipush #86
    //   672: aaload
    //   673: invokeinterface add : (Ljava/lang/Object;)Z
    //   678: pop
    //   679: aload #8
    //   681: aload_0
    //   682: bipush #32
    //   684: aaload
    //   685: invokeinterface add : (Ljava/lang/Object;)Z
    //   690: pop
    //   691: aload #8
    //   693: aload_0
    //   694: bipush #46
    //   696: aaload
    //   697: invokeinterface add : (Ljava/lang/Object;)Z
    //   702: pop
    //   703: aload #8
    //   705: aload_0
    //   706: bipush #55
    //   708: aaload
    //   709: invokeinterface add : (Ljava/lang/Object;)Z
    //   714: pop
    //   715: aload #8
    //   717: aload_0
    //   718: bipush #101
    //   720: aaload
    //   721: invokeinterface add : (Ljava/lang/Object;)Z
    //   726: pop
    //   727: aload #8
    //   729: aload_0
    //   730: bipush #115
    //   732: aaload
    //   733: invokeinterface add : (Ljava/lang/Object;)Z
    //   738: pop
    //   739: aload #8
    //   741: aload_0
    //   742: bipush #91
    //   744: aaload
    //   745: invokeinterface add : (Ljava/lang/Object;)Z
    //   750: pop
    //   751: aload #8
    //   753: aload_0
    //   754: sipush #174
    //   757: aaload
    //   758: invokeinterface add : (Ljava/lang/Object;)Z
    //   763: pop
    //   764: aload #8
    //   766: aload_0
    //   767: sipush #167
    //   770: aaload
    //   771: invokeinterface add : (Ljava/lang/Object;)Z
    //   776: pop
    //   777: aload #8
    //   779: aload_0
    //   780: bipush #78
    //   782: aaload
    //   783: invokeinterface add : (Ljava/lang/Object;)Z
    //   788: pop
    //   789: aload #8
    //   791: aload_0
    //   792: bipush #53
    //   794: aaload
    //   795: invokeinterface add : (Ljava/lang/Object;)Z
    //   800: pop
    //   801: aload #8
    //   803: aload_0
    //   804: bipush #31
    //   806: aaload
    //   807: invokeinterface add : (Ljava/lang/Object;)Z
    //   812: pop
    //   813: aload #8
    //   815: aload_0
    //   816: bipush #11
    //   818: aaload
    //   819: invokeinterface add : (Ljava/lang/Object;)Z
    //   824: pop
    //   825: aload #8
    //   827: aload_0
    //   828: bipush #36
    //   830: aaload
    //   831: invokeinterface add : (Ljava/lang/Object;)Z
    //   836: pop
    //   837: aload #8
    //   839: aload_0
    //   840: bipush #6
    //   842: aaload
    //   843: invokeinterface add : (Ljava/lang/Object;)Z
    //   848: pop
    //   849: aload #8
    //   851: aload_0
    //   852: sipush #172
    //   855: aaload
    //   856: invokeinterface add : (Ljava/lang/Object;)Z
    //   861: pop
    //   862: aload #8
    //   864: aload_0
    //   865: bipush #14
    //   867: aaload
    //   868: invokeinterface add : (Ljava/lang/Object;)Z
    //   873: pop
    //   874: aload #8
    //   876: aload_0
    //   877: bipush #124
    //   879: aaload
    //   880: invokeinterface add : (Ljava/lang/Object;)Z
    //   885: pop
    //   886: aload #8
    //   888: aload_0
    //   889: bipush #15
    //   891: aaload
    //   892: invokeinterface add : (Ljava/lang/Object;)Z
    //   897: pop
    //   898: aload #7
    //   900: astore #9
    //   902: aload #9
    //   904: arraylength
    //   905: istore #10
    //   907: iconst_0
    //   908: istore #11
    //   910: iload #11
    //   912: iload #10
    //   914: if_icmpge -> 991
    //   917: aload #9
    //   919: iload #11
    //   921: aaload
    //   922: astore #12
    //   924: aload #12
    //   926: invokevirtual getHardness : ()F
    //   929: f2d
    //   930: ldc2_w 0.5
    //   933: dcmpg
    //   934: iflt -> 985
    //   937: aload #8
    //   939: aload #12
    //   941: invokevirtual name : ()Ljava/lang/String;
    //   944: invokeinterface contains : (Ljava/lang/Object;)Z
    //   949: ifeq -> 966
    //   952: goto -> 959
    //   955: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   958: athrow
    //   959: goto -> 985
    //   962: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   965: athrow
    //   966: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   969: aload #12
    //   971: aload #12
    //   973: invokevirtual getHardness : ()F
    //   976: invokestatic valueOf : (F)Ljava/lang/Float;
    //   979: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   984: pop
    //   985: iinc #11, 1
    //   988: goto -> 910
    //   991: aload #8
    //   993: invokeinterface clear : ()V
    //   998: goto -> 6505
    //   1001: aload #7
    //   1003: astore #8
    //   1005: aload #8
    //   1007: arraylength
    //   1008: istore #9
    //   1010: iconst_0
    //   1011: istore #10
    //   1013: iload #10
    //   1015: iload #9
    //   1017: if_icmpge -> 6505
    //   1020: aload #8
    //   1022: iload #10
    //   1024: aaload
    //   1025: astore #11
    //   1027: aload #11
    //   1029: invokevirtual name : ()Ljava/lang/String;
    //   1032: astore #12
    //   1034: iconst_m1
    //   1035: istore #13
    //   1037: aload #12
    //   1039: invokevirtual hashCode : ()I
    //   1042: lookupswitch default -> 5600, -2143360393 -> 2629, -2124166951 -> 2304, -2119094147 -> 5339, -2118056882 -> 4444, -2072565711 -> 5363, -2010201205 -> 5242, -2002544804 -> 5508, -1994298340 -> 3703, -1987017078 -> 4889, -1982939579 -> 4165, -1962419392 -> 3865, -1951261276 -> 3888, -1918333928 -> 3934, -1842617470 -> 3262, -1842435366 -> 5006, -1738300588 -> 3400, -1722057187 -> 2513, -1651248210 -> 4959, -1554941502 -> 5170, -1474647453 -> 2721, -1337278289 -> 4257, -1324132210 -> 4188, -1289040810 -> 4655, -1277884088 -> 3238, -1266861419 -> 4936, -1239476237 -> 4585, -1200901687 -> 4701, -1176197063 -> 3772, -1132566471 -> 3377, -1093107010 -> 3796, -1047079230 -> 4350, -1013052939 -> 4281, -961482712 -> 3587, -900915975 -> 3634, -866289145 -> 2744, -837297303 -> 4467, -782280417 -> 3726, -741581175 -> 4397, -557177022 -> 4211, -539340890 -> 3911, -519277571 -> 2490, -452271318 -> 4304, -422086008 -> 3980, -418140412 -> 5581, -415523425 -> 5557, -400732458 -> 3423, -391389077 -> 4796, -387424896 -> 2443, -333218805 -> 2582, -328086150 -> 3957, -278780510 -> 3026, -269198261 -> 5218, -203278415 -> 5484, -179106457 -> 4234, -173863409 -> 3308, -170109641 -> 2767, -163486694 -> 2606, -123382247 -> 5460, -111024586 -> 3119, -72701037 -> 2862, -65762406 -> 3657, -35571309 -> 4027, -19295470 -> 4865, 75556 -> 3446, 2071137 -> 5030, 2098567 -> 2212, 2537604 -> 2372, 2545085 -> 4843, 2670253 -> 3493, 2670261 -> 4632, 38285172 -> 2559, 43464726 -> 4539, 56553991 -> 5147, 62437548 -> 2979, 63467553 -> 3819, 66779153 -> 3354, 68077974 -> 5053, 72612311 -> 3470, 73118215 -> 2260, 73829118 -> 5100, 77737729 -> 4748, 79233093 -> 4491, 104950264 -> 4327, 136312843 -> 5266, 155515457 -> 4608, 166209980 -> 4143, 190832590 -> 2815, 197168635 -> 3540, 199983749 -> 5533, 212343096 -> 4982, 327294614 -> 5387, 367435514 -> 3096, 380854351 -> 4050, 453665019 -> 3331, 473639627 -> 2698, 478520881 -> 2466, 478964413 -> 3749, 479695913 -> 3610, 492332526 -> 2238, 534551745 -> 4420, 553521315 -> 2326, 707614322 -> 3049, 730697741 -> 3516, 752809692 -> 4073, 760322528 -> 4679, 868145122 -> 3842, 905696727 -> 2281, 942687056 -> 2396, 1007337992 -> 4562, 1083812258 -> 3214, 1131234006 -> 2886, 1134498395 -> 4913, 1156583859 -> 2420, 1171939996 -> 4120, 1210134772 -> 5315, 1224225185 -> 2349, 1341913960 -> 3285, 1379814896 -> 2536, 1432894430 -> 5411, 1433121601 -> 4820, 1461129901 -> 4772, 1478351150 -> 5124, 1538313714 -> 2909, 1545081517 -> 4374, 1552065406 -> 5193, 1593989766 -> 3072, 1665394475 -> 5291, 1726268540 -> 3190, 1753058479 -> 3680, 1790904261 -> 3002, 1797596357 -> 2932, 1802791650 -> 3143, 1817755422 -> 2652, 1841275752 -> 2675, 1902490268 -> 4724, 1919650200 -> 4004, 1920426094 -> 4515, 1950793198 -> 3166, 1955250244 -> 2791, 1992813683 -> 2956, 2085943460 -> 5436, 2090790125 -> 3564, 2110246428 -> 4097, 2110419719 -> 5076, 2136719412 -> 2838
    //   2212: aload #12
    //   2214: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2217: iconst_5
    //   2218: aaload
    //   2219: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2222: ifeq -> 5600
    //   2225: goto -> 2232
    //   2228: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   2231: athrow
    //   2232: iconst_0
    //   2233: istore #13
    //   2235: goto -> 5600
    //   2238: aload #12
    //   2240: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2243: astore_0
    //   2244: aload_0
    //   2245: bipush #62
    //   2247: aaload
    //   2248: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2251: ifeq -> 5600
    //   2254: iconst_1
    //   2255: istore #13
    //   2257: goto -> 5600
    //   2260: aload #12
    //   2262: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2265: astore_0
    //   2266: aload_0
    //   2267: iconst_3
    //   2268: aaload
    //   2269: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2272: ifeq -> 5600
    //   2275: iconst_2
    //   2276: istore #13
    //   2278: goto -> 5600
    //   2281: aload #12
    //   2283: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2286: astore_0
    //   2287: aload_0
    //   2288: sipush #141
    //   2291: aaload
    //   2292: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2295: ifeq -> 5600
    //   2298: iconst_3
    //   2299: istore #13
    //   2301: goto -> 5600
    //   2304: aload #12
    //   2306: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2309: astore_0
    //   2310: aload_0
    //   2311: bipush #117
    //   2313: aaload
    //   2314: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2317: ifeq -> 5600
    //   2320: iconst_4
    //   2321: istore #13
    //   2323: goto -> 5600
    //   2326: aload #12
    //   2328: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2331: astore_0
    //   2332: aload_0
    //   2333: sipush #158
    //   2336: aaload
    //   2337: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2340: ifeq -> 5600
    //   2343: iconst_5
    //   2344: istore #13
    //   2346: goto -> 5600
    //   2349: aload #12
    //   2351: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2354: astore_0
    //   2355: aload_0
    //   2356: bipush #38
    //   2358: aaload
    //   2359: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2362: ifeq -> 5600
    //   2365: bipush #6
    //   2367: istore #13
    //   2369: goto -> 5600
    //   2372: aload #12
    //   2374: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2377: astore_0
    //   2378: aload_0
    //   2379: sipush #178
    //   2382: aaload
    //   2383: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2386: ifeq -> 5600
    //   2389: bipush #7
    //   2391: istore #13
    //   2393: goto -> 5600
    //   2396: aload #12
    //   2398: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2401: astore_0
    //   2402: aload_0
    //   2403: sipush #146
    //   2406: aaload
    //   2407: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2410: ifeq -> 5600
    //   2413: bipush #8
    //   2415: istore #13
    //   2417: goto -> 5600
    //   2420: aload #12
    //   2422: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2425: astore_0
    //   2426: aload_0
    //   2427: bipush #122
    //   2429: aaload
    //   2430: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2433: ifeq -> 5600
    //   2436: bipush #9
    //   2438: istore #13
    //   2440: goto -> 5600
    //   2443: aload #12
    //   2445: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2448: astore_0
    //   2449: aload_0
    //   2450: bipush #111
    //   2452: aaload
    //   2453: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2456: ifeq -> 5600
    //   2459: bipush #10
    //   2461: istore #13
    //   2463: goto -> 5600
    //   2466: aload #12
    //   2468: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2471: astore_0
    //   2472: aload_0
    //   2473: sipush #148
    //   2476: aaload
    //   2477: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2480: ifeq -> 5600
    //   2483: bipush #11
    //   2485: istore #13
    //   2487: goto -> 5600
    //   2490: aload #12
    //   2492: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2495: astore_0
    //   2496: aload_0
    //   2497: bipush #67
    //   2499: aaload
    //   2500: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2503: ifeq -> 5600
    //   2506: bipush #12
    //   2508: istore #13
    //   2510: goto -> 5600
    //   2513: aload #12
    //   2515: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2518: astore_0
    //   2519: aload_0
    //   2520: bipush #97
    //   2522: aaload
    //   2523: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2526: ifeq -> 5600
    //   2529: bipush #13
    //   2531: istore #13
    //   2533: goto -> 5600
    //   2536: aload #12
    //   2538: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2541: astore_0
    //   2542: aload_0
    //   2543: bipush #123
    //   2545: aaload
    //   2546: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2549: ifeq -> 5600
    //   2552: bipush #14
    //   2554: istore #13
    //   2556: goto -> 5600
    //   2559: aload #12
    //   2561: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2564: astore_0
    //   2565: aload_0
    //   2566: bipush #101
    //   2568: aaload
    //   2569: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2572: ifeq -> 5600
    //   2575: bipush #15
    //   2577: istore #13
    //   2579: goto -> 5600
    //   2582: aload #12
    //   2584: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2587: astore_0
    //   2588: aload_0
    //   2589: sipush #153
    //   2592: aaload
    //   2593: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2596: ifeq -> 5600
    //   2599: bipush #16
    //   2601: istore #13
    //   2603: goto -> 5600
    //   2606: aload #12
    //   2608: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2611: astore_0
    //   2612: aload_0
    //   2613: bipush #125
    //   2615: aaload
    //   2616: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2619: ifeq -> 5600
    //   2622: bipush #17
    //   2624: istore #13
    //   2626: goto -> 5600
    //   2629: aload #12
    //   2631: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2634: astore_0
    //   2635: aload_0
    //   2636: bipush #8
    //   2638: aaload
    //   2639: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2642: ifeq -> 5600
    //   2645: bipush #18
    //   2647: istore #13
    //   2649: goto -> 5600
    //   2652: aload #12
    //   2654: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2657: astore_0
    //   2658: aload_0
    //   2659: bipush #34
    //   2661: aaload
    //   2662: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2665: ifeq -> 5600
    //   2668: bipush #19
    //   2670: istore #13
    //   2672: goto -> 5600
    //   2675: aload #12
    //   2677: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2680: astore_0
    //   2681: aload_0
    //   2682: bipush #126
    //   2684: aaload
    //   2685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2688: ifeq -> 5600
    //   2691: bipush #20
    //   2693: istore #13
    //   2695: goto -> 5600
    //   2698: aload #12
    //   2700: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2703: astore_0
    //   2704: aload_0
    //   2705: bipush #10
    //   2707: aaload
    //   2708: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2711: ifeq -> 5600
    //   2714: bipush #21
    //   2716: istore #13
    //   2718: goto -> 5600
    //   2721: aload #12
    //   2723: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2726: astore_0
    //   2727: aload_0
    //   2728: bipush #81
    //   2730: aaload
    //   2731: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2734: ifeq -> 5600
    //   2737: bipush #22
    //   2739: istore #13
    //   2741: goto -> 5600
    //   2744: aload #12
    //   2746: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2749: astore_0
    //   2750: aload_0
    //   2751: bipush #72
    //   2753: aaload
    //   2754: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2757: ifeq -> 5600
    //   2760: bipush #23
    //   2762: istore #13
    //   2764: goto -> 5600
    //   2767: aload #12
    //   2769: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2772: astore_0
    //   2773: aload_0
    //   2774: sipush #168
    //   2777: aaload
    //   2778: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2781: ifeq -> 5600
    //   2784: bipush #24
    //   2786: istore #13
    //   2788: goto -> 5600
    //   2791: aload #12
    //   2793: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2796: astore_0
    //   2797: aload_0
    //   2798: sipush #151
    //   2801: aaload
    //   2802: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2805: ifeq -> 5600
    //   2808: bipush #25
    //   2810: istore #13
    //   2812: goto -> 5600
    //   2815: aload #12
    //   2817: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2820: astore_0
    //   2821: aload_0
    //   2822: bipush #66
    //   2824: aaload
    //   2825: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2828: ifeq -> 5600
    //   2831: bipush #26
    //   2833: istore #13
    //   2835: goto -> 5600
    //   2838: aload #12
    //   2840: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2843: astore_0
    //   2844: aload_0
    //   2845: sipush #140
    //   2848: aaload
    //   2849: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2852: ifeq -> 5600
    //   2855: bipush #27
    //   2857: istore #13
    //   2859: goto -> 5600
    //   2862: aload #12
    //   2864: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2867: astore_0
    //   2868: aload_0
    //   2869: sipush #176
    //   2872: aaload
    //   2873: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2876: ifeq -> 5600
    //   2879: bipush #28
    //   2881: istore #13
    //   2883: goto -> 5600
    //   2886: aload #12
    //   2888: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2891: astore_0
    //   2892: aload_0
    //   2893: bipush #77
    //   2895: aaload
    //   2896: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2899: ifeq -> 5600
    //   2902: bipush #29
    //   2904: istore #13
    //   2906: goto -> 5600
    //   2909: aload #12
    //   2911: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2914: astore_0
    //   2915: aload_0
    //   2916: bipush #29
    //   2918: aaload
    //   2919: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2922: ifeq -> 5600
    //   2925: bipush #30
    //   2927: istore #13
    //   2929: goto -> 5600
    //   2932: aload #12
    //   2934: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2937: astore_0
    //   2938: aload_0
    //   2939: sipush #159
    //   2942: aaload
    //   2943: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2946: ifeq -> 5600
    //   2949: bipush #31
    //   2951: istore #13
    //   2953: goto -> 5600
    //   2956: aload #12
    //   2958: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2961: astore_0
    //   2962: aload_0
    //   2963: bipush #110
    //   2965: aaload
    //   2966: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2969: ifeq -> 5600
    //   2972: bipush #32
    //   2974: istore #13
    //   2976: goto -> 5600
    //   2979: aload #12
    //   2981: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   2984: astore_0
    //   2985: aload_0
    //   2986: bipush #118
    //   2988: aaload
    //   2989: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2992: ifeq -> 5600
    //   2995: bipush #33
    //   2997: istore #13
    //   2999: goto -> 5600
    //   3002: aload #12
    //   3004: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3007: astore_0
    //   3008: aload_0
    //   3009: sipush #135
    //   3012: aaload
    //   3013: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3016: ifeq -> 5600
    //   3019: bipush #34
    //   3021: istore #13
    //   3023: goto -> 5600
    //   3026: aload #12
    //   3028: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3031: astore_0
    //   3032: aload_0
    //   3033: bipush #79
    //   3035: aaload
    //   3036: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3039: ifeq -> 5600
    //   3042: bipush #35
    //   3044: istore #13
    //   3046: goto -> 5600
    //   3049: aload #12
    //   3051: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3054: astore_0
    //   3055: aload_0
    //   3056: bipush #12
    //   3058: aaload
    //   3059: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3062: ifeq -> 5600
    //   3065: bipush #36
    //   3067: istore #13
    //   3069: goto -> 5600
    //   3072: aload #12
    //   3074: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3077: astore_0
    //   3078: aload_0
    //   3079: sipush #131
    //   3082: aaload
    //   3083: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3086: ifeq -> 5600
    //   3089: bipush #37
    //   3091: istore #13
    //   3093: goto -> 5600
    //   3096: aload #12
    //   3098: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3101: astore_0
    //   3102: aload_0
    //   3103: bipush #84
    //   3105: aaload
    //   3106: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3109: ifeq -> 5600
    //   3112: bipush #38
    //   3114: istore #13
    //   3116: goto -> 5600
    //   3119: aload #12
    //   3121: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3124: astore_0
    //   3125: aload_0
    //   3126: sipush #183
    //   3129: aaload
    //   3130: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3133: ifeq -> 5600
    //   3136: bipush #39
    //   3138: istore #13
    //   3140: goto -> 5600
    //   3143: aload #12
    //   3145: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3148: astore_0
    //   3149: aload_0
    //   3150: bipush #74
    //   3152: aaload
    //   3153: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3156: ifeq -> 5600
    //   3159: bipush #40
    //   3161: istore #13
    //   3163: goto -> 5600
    //   3166: aload #12
    //   3168: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3171: astore_0
    //   3172: aload_0
    //   3173: sipush #137
    //   3176: aaload
    //   3177: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3180: ifeq -> 5600
    //   3183: bipush #41
    //   3185: istore #13
    //   3187: goto -> 5600
    //   3190: aload #12
    //   3192: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3195: astore_0
    //   3196: aload_0
    //   3197: sipush #149
    //   3200: aaload
    //   3201: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3204: ifeq -> 5600
    //   3207: bipush #42
    //   3209: istore #13
    //   3211: goto -> 5600
    //   3214: aload #12
    //   3216: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3219: astore_0
    //   3220: aload_0
    //   3221: sipush #165
    //   3224: aaload
    //   3225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3228: ifeq -> 5600
    //   3231: bipush #43
    //   3233: istore #13
    //   3235: goto -> 5600
    //   3238: aload #12
    //   3240: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3243: astore_0
    //   3244: aload_0
    //   3245: sipush #132
    //   3248: aaload
    //   3249: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3252: ifeq -> 5600
    //   3255: bipush #44
    //   3257: istore #13
    //   3259: goto -> 5600
    //   3262: aload #12
    //   3264: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3267: astore_0
    //   3268: aload_0
    //   3269: bipush #47
    //   3271: aaload
    //   3272: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3275: ifeq -> 5600
    //   3278: bipush #45
    //   3280: istore #13
    //   3282: goto -> 5600
    //   3285: aload #12
    //   3287: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3290: astore_0
    //   3291: aload_0
    //   3292: bipush #98
    //   3294: aaload
    //   3295: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3298: ifeq -> 5600
    //   3301: bipush #46
    //   3303: istore #13
    //   3305: goto -> 5600
    //   3308: aload #12
    //   3310: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3313: astore_0
    //   3314: aload_0
    //   3315: bipush #119
    //   3317: aaload
    //   3318: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3321: ifeq -> 5600
    //   3324: bipush #47
    //   3326: istore #13
    //   3328: goto -> 5600
    //   3331: aload #12
    //   3333: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3336: astore_0
    //   3337: aload_0
    //   3338: bipush #49
    //   3340: aaload
    //   3341: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3344: ifeq -> 5600
    //   3347: bipush #48
    //   3349: istore #13
    //   3351: goto -> 5600
    //   3354: aload #12
    //   3356: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3359: astore_0
    //   3360: aload_0
    //   3361: bipush #39
    //   3363: aaload
    //   3364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3367: ifeq -> 5600
    //   3370: bipush #49
    //   3372: istore #13
    //   3374: goto -> 5600
    //   3377: aload #12
    //   3379: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3382: astore_0
    //   3383: aload_0
    //   3384: bipush #63
    //   3386: aaload
    //   3387: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3390: ifeq -> 5600
    //   3393: bipush #50
    //   3395: istore #13
    //   3397: goto -> 5600
    //   3400: aload #12
    //   3402: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3405: astore_0
    //   3406: aload_0
    //   3407: bipush #40
    //   3409: aaload
    //   3410: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3413: ifeq -> 5600
    //   3416: bipush #51
    //   3418: istore #13
    //   3420: goto -> 5600
    //   3423: aload #12
    //   3425: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3428: astore_0
    //   3429: aload_0
    //   3430: bipush #127
    //   3432: aaload
    //   3433: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3436: ifeq -> 5600
    //   3439: bipush #52
    //   3441: istore #13
    //   3443: goto -> 5600
    //   3446: aload #12
    //   3448: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3451: astore_0
    //   3452: aload_0
    //   3453: sipush #145
    //   3456: aaload
    //   3457: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3460: ifeq -> 5600
    //   3463: bipush #53
    //   3465: istore #13
    //   3467: goto -> 5600
    //   3470: aload #12
    //   3472: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3475: astore_0
    //   3476: aload_0
    //   3477: bipush #100
    //   3479: aaload
    //   3480: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3483: ifeq -> 5600
    //   3486: bipush #54
    //   3488: istore #13
    //   3490: goto -> 5600
    //   3493: aload #12
    //   3495: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3498: astore_0
    //   3499: aload_0
    //   3500: bipush #44
    //   3502: aaload
    //   3503: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3506: ifeq -> 5600
    //   3509: bipush #55
    //   3511: istore #13
    //   3513: goto -> 5600
    //   3516: aload #12
    //   3518: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3521: astore_0
    //   3522: aload_0
    //   3523: sipush #181
    //   3526: aaload
    //   3527: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3530: ifeq -> 5600
    //   3533: bipush #56
    //   3535: istore #13
    //   3537: goto -> 5600
    //   3540: aload #12
    //   3542: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3545: astore_0
    //   3546: aload_0
    //   3547: sipush #161
    //   3550: aaload
    //   3551: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3554: ifeq -> 5600
    //   3557: bipush #57
    //   3559: istore #13
    //   3561: goto -> 5600
    //   3564: aload #12
    //   3566: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3569: astore_0
    //   3570: aload_0
    //   3571: bipush #20
    //   3573: aaload
    //   3574: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3577: ifeq -> 5600
    //   3580: bipush #58
    //   3582: istore #13
    //   3584: goto -> 5600
    //   3587: aload #12
    //   3589: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3592: astore_0
    //   3593: aload_0
    //   3594: bipush #108
    //   3596: aaload
    //   3597: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3600: ifeq -> 5600
    //   3603: bipush #59
    //   3605: istore #13
    //   3607: goto -> 5600
    //   3610: aload #12
    //   3612: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3615: astore_0
    //   3616: aload_0
    //   3617: sipush #163
    //   3620: aaload
    //   3621: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3624: ifeq -> 5600
    //   3627: bipush #60
    //   3629: istore #13
    //   3631: goto -> 5600
    //   3634: aload #12
    //   3636: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3639: astore_0
    //   3640: aload_0
    //   3641: bipush #37
    //   3643: aaload
    //   3644: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3647: ifeq -> 5600
    //   3650: bipush #61
    //   3652: istore #13
    //   3654: goto -> 5600
    //   3657: aload #12
    //   3659: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3662: astore_0
    //   3663: aload_0
    //   3664: bipush #80
    //   3666: aaload
    //   3667: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3670: ifeq -> 5600
    //   3673: bipush #62
    //   3675: istore #13
    //   3677: goto -> 5600
    //   3680: aload #12
    //   3682: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3685: astore_0
    //   3686: aload_0
    //   3687: bipush #114
    //   3689: aaload
    //   3690: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3693: ifeq -> 5600
    //   3696: bipush #63
    //   3698: istore #13
    //   3700: goto -> 5600
    //   3703: aload #12
    //   3705: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3708: astore_0
    //   3709: aload_0
    //   3710: bipush #75
    //   3712: aaload
    //   3713: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3716: ifeq -> 5600
    //   3719: bipush #64
    //   3721: istore #13
    //   3723: goto -> 5600
    //   3726: aload #12
    //   3728: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3731: astore_0
    //   3732: aload_0
    //   3733: bipush #25
    //   3735: aaload
    //   3736: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3739: ifeq -> 5600
    //   3742: bipush #65
    //   3744: istore #13
    //   3746: goto -> 5600
    //   3749: aload #12
    //   3751: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3754: astore_0
    //   3755: aload_0
    //   3756: bipush #102
    //   3758: aaload
    //   3759: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3762: ifeq -> 5600
    //   3765: bipush #66
    //   3767: istore #13
    //   3769: goto -> 5600
    //   3772: aload #12
    //   3774: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3777: astore_0
    //   3778: aload_0
    //   3779: sipush #133
    //   3782: aaload
    //   3783: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3786: ifeq -> 5600
    //   3789: bipush #67
    //   3791: istore #13
    //   3793: goto -> 5600
    //   3796: aload #12
    //   3798: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3801: astore_0
    //   3802: aload_0
    //   3803: bipush #88
    //   3805: aaload
    //   3806: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3809: ifeq -> 5600
    //   3812: bipush #68
    //   3814: istore #13
    //   3816: goto -> 5600
    //   3819: aload #12
    //   3821: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3824: astore_0
    //   3825: aload_0
    //   3826: bipush #71
    //   3828: aaload
    //   3829: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3832: ifeq -> 5600
    //   3835: bipush #69
    //   3837: istore #13
    //   3839: goto -> 5600
    //   3842: aload #12
    //   3844: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3847: astore_0
    //   3848: aload_0
    //   3849: bipush #59
    //   3851: aaload
    //   3852: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3855: ifeq -> 5600
    //   3858: bipush #70
    //   3860: istore #13
    //   3862: goto -> 5600
    //   3865: aload #12
    //   3867: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3870: astore_0
    //   3871: aload_0
    //   3872: bipush #7
    //   3874: aaload
    //   3875: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3878: ifeq -> 5600
    //   3881: bipush #71
    //   3883: istore #13
    //   3885: goto -> 5600
    //   3888: aload #12
    //   3890: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3893: astore_0
    //   3894: aload_0
    //   3895: bipush #57
    //   3897: aaload
    //   3898: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3901: ifeq -> 5600
    //   3904: bipush #72
    //   3906: istore #13
    //   3908: goto -> 5600
    //   3911: aload #12
    //   3913: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3916: astore_0
    //   3917: aload_0
    //   3918: bipush #90
    //   3920: aaload
    //   3921: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3924: ifeq -> 5600
    //   3927: bipush #73
    //   3929: istore #13
    //   3931: goto -> 5600
    //   3934: aload #12
    //   3936: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3939: astore_0
    //   3940: aload_0
    //   3941: bipush #22
    //   3943: aaload
    //   3944: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3947: ifeq -> 5600
    //   3950: bipush #74
    //   3952: istore #13
    //   3954: goto -> 5600
    //   3957: aload #12
    //   3959: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3962: astore_0
    //   3963: aload_0
    //   3964: bipush #103
    //   3966: aaload
    //   3967: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3970: ifeq -> 5600
    //   3973: bipush #75
    //   3975: istore #13
    //   3977: goto -> 5600
    //   3980: aload #12
    //   3982: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   3985: astore_0
    //   3986: aload_0
    //   3987: sipush #179
    //   3990: aaload
    //   3991: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3994: ifeq -> 5600
    //   3997: bipush #76
    //   3999: istore #13
    //   4001: goto -> 5600
    //   4004: aload #12
    //   4006: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4009: astore_0
    //   4010: aload_0
    //   4011: bipush #116
    //   4013: aaload
    //   4014: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4017: ifeq -> 5600
    //   4020: bipush #77
    //   4022: istore #13
    //   4024: goto -> 5600
    //   4027: aload #12
    //   4029: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4032: astore_0
    //   4033: aload_0
    //   4034: bipush #113
    //   4036: aaload
    //   4037: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4040: ifeq -> 5600
    //   4043: bipush #78
    //   4045: istore #13
    //   4047: goto -> 5600
    //   4050: aload #12
    //   4052: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4055: astore_0
    //   4056: aload_0
    //   4057: bipush #87
    //   4059: aaload
    //   4060: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4063: ifeq -> 5600
    //   4066: bipush #79
    //   4068: istore #13
    //   4070: goto -> 5600
    //   4073: aload #12
    //   4075: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4078: astore_0
    //   4079: aload_0
    //   4080: sipush #177
    //   4083: aaload
    //   4084: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4087: ifeq -> 5600
    //   4090: bipush #80
    //   4092: istore #13
    //   4094: goto -> 5600
    //   4097: aload #12
    //   4099: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4102: astore_0
    //   4103: aload_0
    //   4104: bipush #23
    //   4106: aaload
    //   4107: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4110: ifeq -> 5600
    //   4113: bipush #81
    //   4115: istore #13
    //   4117: goto -> 5600
    //   4120: aload #12
    //   4122: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4125: astore_0
    //   4126: aload_0
    //   4127: bipush #96
    //   4129: aaload
    //   4130: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4133: ifeq -> 5600
    //   4136: bipush #82
    //   4138: istore #13
    //   4140: goto -> 5600
    //   4143: aload #12
    //   4145: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4148: astore_0
    //   4149: aload_0
    //   4150: iconst_1
    //   4151: aaload
    //   4152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4155: ifeq -> 5600
    //   4158: bipush #83
    //   4160: istore #13
    //   4162: goto -> 5600
    //   4165: aload #12
    //   4167: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4170: astore_0
    //   4171: aload_0
    //   4172: bipush #30
    //   4174: aaload
    //   4175: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4178: ifeq -> 5600
    //   4181: bipush #84
    //   4183: istore #13
    //   4185: goto -> 5600
    //   4188: aload #12
    //   4190: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4193: astore_0
    //   4194: aload_0
    //   4195: bipush #13
    //   4197: aaload
    //   4198: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4201: ifeq -> 5600
    //   4204: bipush #85
    //   4206: istore #13
    //   4208: goto -> 5600
    //   4211: aload #12
    //   4213: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4216: astore_0
    //   4217: aload_0
    //   4218: bipush #85
    //   4220: aaload
    //   4221: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4224: ifeq -> 5600
    //   4227: bipush #86
    //   4229: istore #13
    //   4231: goto -> 5600
    //   4234: aload #12
    //   4236: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4239: astore_0
    //   4240: aload_0
    //   4241: bipush #99
    //   4243: aaload
    //   4244: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4247: ifeq -> 5600
    //   4250: bipush #87
    //   4252: istore #13
    //   4254: goto -> 5600
    //   4257: aload #12
    //   4259: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4262: astore_0
    //   4263: aload_0
    //   4264: sipush #128
    //   4267: aaload
    //   4268: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4271: ifeq -> 5600
    //   4274: bipush #88
    //   4276: istore #13
    //   4278: goto -> 5600
    //   4281: aload #12
    //   4283: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4286: astore_0
    //   4287: aload_0
    //   4288: bipush #21
    //   4290: aaload
    //   4291: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4294: ifeq -> 5600
    //   4297: bipush #89
    //   4299: istore #13
    //   4301: goto -> 5600
    //   4304: aload #12
    //   4306: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4309: astore_0
    //   4310: aload_0
    //   4311: bipush #92
    //   4313: aaload
    //   4314: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4317: ifeq -> 5600
    //   4320: bipush #90
    //   4322: istore #13
    //   4324: goto -> 5600
    //   4327: aload #12
    //   4329: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4332: astore_0
    //   4333: aload_0
    //   4334: bipush #26
    //   4336: aaload
    //   4337: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4340: ifeq -> 5600
    //   4343: bipush #91
    //   4345: istore #13
    //   4347: goto -> 5600
    //   4350: aload #12
    //   4352: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4355: astore_0
    //   4356: aload_0
    //   4357: sipush #162
    //   4360: aaload
    //   4361: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4364: ifeq -> 5600
    //   4367: bipush #92
    //   4369: istore #13
    //   4371: goto -> 5600
    //   4374: aload #12
    //   4376: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4379: astore_0
    //   4380: aload_0
    //   4381: bipush #64
    //   4383: aaload
    //   4384: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4387: ifeq -> 5600
    //   4390: bipush #93
    //   4392: istore #13
    //   4394: goto -> 5600
    //   4397: aload #12
    //   4399: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4402: astore_0
    //   4403: aload_0
    //   4404: bipush #65
    //   4406: aaload
    //   4407: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4410: ifeq -> 5600
    //   4413: bipush #94
    //   4415: istore #13
    //   4417: goto -> 5600
    //   4420: aload #12
    //   4422: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4425: astore_0
    //   4426: aload_0
    //   4427: sipush #184
    //   4430: aaload
    //   4431: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4434: ifeq -> 5600
    //   4437: bipush #95
    //   4439: istore #13
    //   4441: goto -> 5600
    //   4444: aload #12
    //   4446: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4449: astore_0
    //   4450: aload_0
    //   4451: bipush #105
    //   4453: aaload
    //   4454: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4457: ifeq -> 5600
    //   4460: bipush #96
    //   4462: istore #13
    //   4464: goto -> 5600
    //   4467: aload #12
    //   4469: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4472: astore_0
    //   4473: aload_0
    //   4474: sipush #150
    //   4477: aaload
    //   4478: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4481: ifeq -> 5600
    //   4484: bipush #97
    //   4486: istore #13
    //   4488: goto -> 5600
    //   4491: aload #12
    //   4493: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4496: astore_0
    //   4497: aload_0
    //   4498: sipush #180
    //   4501: aaload
    //   4502: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4505: ifeq -> 5600
    //   4508: bipush #98
    //   4510: istore #13
    //   4512: goto -> 5600
    //   4515: aload #12
    //   4517: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4520: astore_0
    //   4521: aload_0
    //   4522: sipush #166
    //   4525: aaload
    //   4526: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4529: ifeq -> 5600
    //   4532: bipush #99
    //   4534: istore #13
    //   4536: goto -> 5600
    //   4539: aload #12
    //   4541: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4544: astore_0
    //   4545: aload_0
    //   4546: bipush #48
    //   4548: aaload
    //   4549: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4552: ifeq -> 5600
    //   4555: bipush #100
    //   4557: istore #13
    //   4559: goto -> 5600
    //   4562: aload #12
    //   4564: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4567: astore_0
    //   4568: aload_0
    //   4569: bipush #41
    //   4571: aaload
    //   4572: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4575: ifeq -> 5600
    //   4578: bipush #101
    //   4580: istore #13
    //   4582: goto -> 5600
    //   4585: aload #12
    //   4587: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4590: astore_0
    //   4591: aload_0
    //   4592: bipush #93
    //   4594: aaload
    //   4595: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4598: ifeq -> 5600
    //   4601: bipush #102
    //   4603: istore #13
    //   4605: goto -> 5600
    //   4608: aload #12
    //   4610: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4613: astore_0
    //   4614: aload_0
    //   4615: sipush #155
    //   4618: aaload
    //   4619: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4622: ifeq -> 5600
    //   4625: bipush #103
    //   4627: istore #13
    //   4629: goto -> 5600
    //   4632: aload #12
    //   4634: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4637: astore_0
    //   4638: aload_0
    //   4639: bipush #52
    //   4641: aaload
    //   4642: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4645: ifeq -> 5600
    //   4648: bipush #104
    //   4650: istore #13
    //   4652: goto -> 5600
    //   4655: aload #12
    //   4657: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4660: astore_0
    //   4661: aload_0
    //   4662: sipush #147
    //   4665: aaload
    //   4666: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4669: ifeq -> 5600
    //   4672: bipush #105
    //   4674: istore #13
    //   4676: goto -> 5600
    //   4679: aload #12
    //   4681: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4684: astore_0
    //   4685: aload_0
    //   4686: iconst_2
    //   4687: aaload
    //   4688: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4691: ifeq -> 5600
    //   4694: bipush #106
    //   4696: istore #13
    //   4698: goto -> 5600
    //   4701: aload #12
    //   4703: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4706: astore_0
    //   4707: aload_0
    //   4708: bipush #58
    //   4710: aaload
    //   4711: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4714: ifeq -> 5600
    //   4717: bipush #107
    //   4719: istore #13
    //   4721: goto -> 5600
    //   4724: aload #12
    //   4726: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4729: astore_0
    //   4730: aload_0
    //   4731: sipush #170
    //   4734: aaload
    //   4735: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4738: ifeq -> 5600
    //   4741: bipush #108
    //   4743: istore #13
    //   4745: goto -> 5600
    //   4748: aload #12
    //   4750: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4753: astore_0
    //   4754: aload_0
    //   4755: sipush #173
    //   4758: aaload
    //   4759: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4762: ifeq -> 5600
    //   4765: bipush #109
    //   4767: istore #13
    //   4769: goto -> 5600
    //   4772: aload #12
    //   4774: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4777: astore_0
    //   4778: aload_0
    //   4779: sipush #138
    //   4782: aaload
    //   4783: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4786: ifeq -> 5600
    //   4789: bipush #110
    //   4791: istore #13
    //   4793: goto -> 5600
    //   4796: aload #12
    //   4798: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4801: astore_0
    //   4802: aload_0
    //   4803: sipush #130
    //   4806: aaload
    //   4807: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4810: ifeq -> 5600
    //   4813: bipush #111
    //   4815: istore #13
    //   4817: goto -> 5600
    //   4820: aload #12
    //   4822: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4825: astore_0
    //   4826: aload_0
    //   4827: bipush #106
    //   4829: aaload
    //   4830: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4833: ifeq -> 5600
    //   4836: bipush #112
    //   4838: istore #13
    //   4840: goto -> 5600
    //   4843: aload #12
    //   4845: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4848: astore_0
    //   4849: aload_0
    //   4850: iconst_4
    //   4851: aaload
    //   4852: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4855: ifeq -> 5600
    //   4858: bipush #113
    //   4860: istore #13
    //   4862: goto -> 5600
    //   4865: aload #12
    //   4867: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4870: astore_0
    //   4871: aload_0
    //   4872: sipush #154
    //   4875: aaload
    //   4876: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4879: ifeq -> 5600
    //   4882: bipush #114
    //   4884: istore #13
    //   4886: goto -> 5600
    //   4889: aload #12
    //   4891: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4894: astore_0
    //   4895: aload_0
    //   4896: sipush #139
    //   4899: aaload
    //   4900: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4903: ifeq -> 5600
    //   4906: bipush #115
    //   4908: istore #13
    //   4910: goto -> 5600
    //   4913: aload #12
    //   4915: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4918: astore_0
    //   4919: aload_0
    //   4920: bipush #73
    //   4922: aaload
    //   4923: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4926: ifeq -> 5600
    //   4929: bipush #116
    //   4931: istore #13
    //   4933: goto -> 5600
    //   4936: aload #12
    //   4938: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4941: astore_0
    //   4942: aload_0
    //   4943: bipush #42
    //   4945: aaload
    //   4946: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4949: ifeq -> 5600
    //   4952: bipush #117
    //   4954: istore #13
    //   4956: goto -> 5600
    //   4959: aload #12
    //   4961: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4964: astore_0
    //   4965: aload_0
    //   4966: bipush #51
    //   4968: aaload
    //   4969: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4972: ifeq -> 5600
    //   4975: bipush #118
    //   4977: istore #13
    //   4979: goto -> 5600
    //   4982: aload #12
    //   4984: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   4987: astore_0
    //   4988: aload_0
    //   4989: sipush #156
    //   4992: aaload
    //   4993: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4996: ifeq -> 5600
    //   4999: bipush #119
    //   5001: istore #13
    //   5003: goto -> 5600
    //   5006: aload #12
    //   5008: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5011: astore_0
    //   5012: aload_0
    //   5013: sipush #175
    //   5016: aaload
    //   5017: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5020: ifeq -> 5600
    //   5023: bipush #120
    //   5025: istore #13
    //   5027: goto -> 5600
    //   5030: aload #12
    //   5032: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5035: astore_0
    //   5036: aload_0
    //   5037: bipush #54
    //   5039: aaload
    //   5040: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5043: ifeq -> 5600
    //   5046: bipush #121
    //   5048: istore #13
    //   5050: goto -> 5600
    //   5053: aload #12
    //   5055: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5058: astore_0
    //   5059: aload_0
    //   5060: bipush #18
    //   5062: aaload
    //   5063: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5066: ifeq -> 5600
    //   5069: bipush #122
    //   5071: istore #13
    //   5073: goto -> 5600
    //   5076: aload #12
    //   5078: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5081: astore_0
    //   5082: aload_0
    //   5083: sipush #157
    //   5086: aaload
    //   5087: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5090: ifeq -> 5600
    //   5093: bipush #123
    //   5095: istore #13
    //   5097: goto -> 5600
    //   5100: aload #12
    //   5102: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5105: astore_0
    //   5106: aload_0
    //   5107: sipush #152
    //   5110: aaload
    //   5111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5114: ifeq -> 5600
    //   5117: bipush #124
    //   5119: istore #13
    //   5121: goto -> 5600
    //   5124: aload #12
    //   5126: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5129: astore_0
    //   5130: aload_0
    //   5131: bipush #68
    //   5133: aaload
    //   5134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5137: ifeq -> 5600
    //   5140: bipush #125
    //   5142: istore #13
    //   5144: goto -> 5600
    //   5147: aload #12
    //   5149: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5152: astore_0
    //   5153: aload_0
    //   5154: bipush #82
    //   5156: aaload
    //   5157: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5160: ifeq -> 5600
    //   5163: bipush #126
    //   5165: istore #13
    //   5167: goto -> 5600
    //   5170: aload #12
    //   5172: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5175: astore_0
    //   5176: aload_0
    //   5177: bipush #50
    //   5179: aaload
    //   5180: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5183: ifeq -> 5600
    //   5186: bipush #127
    //   5188: istore #13
    //   5190: goto -> 5600
    //   5193: aload #12
    //   5195: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5198: astore_0
    //   5199: aload_0
    //   5200: sipush #171
    //   5203: aaload
    //   5204: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5207: ifeq -> 5600
    //   5210: sipush #128
    //   5213: istore #13
    //   5215: goto -> 5600
    //   5218: aload #12
    //   5220: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5223: astore_0
    //   5224: aload_0
    //   5225: bipush #120
    //   5227: aaload
    //   5228: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5231: ifeq -> 5600
    //   5234: sipush #129
    //   5237: istore #13
    //   5239: goto -> 5600
    //   5242: aload #12
    //   5244: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5247: astore_0
    //   5248: aload_0
    //   5249: bipush #69
    //   5251: aaload
    //   5252: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5255: ifeq -> 5600
    //   5258: sipush #130
    //   5261: istore #13
    //   5263: goto -> 5600
    //   5266: aload #12
    //   5268: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5271: astore_0
    //   5272: aload_0
    //   5273: sipush #169
    //   5276: aaload
    //   5277: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5280: ifeq -> 5600
    //   5283: sipush #131
    //   5286: istore #13
    //   5288: goto -> 5600
    //   5291: aload #12
    //   5293: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5296: astore_0
    //   5297: aload_0
    //   5298: bipush #43
    //   5300: aaload
    //   5301: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5304: ifeq -> 5600
    //   5307: sipush #132
    //   5310: istore #13
    //   5312: goto -> 5600
    //   5315: aload #12
    //   5317: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5320: astore_0
    //   5321: aload_0
    //   5322: bipush #104
    //   5324: aaload
    //   5325: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5328: ifeq -> 5600
    //   5331: sipush #133
    //   5334: istore #13
    //   5336: goto -> 5600
    //   5339: aload #12
    //   5341: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5344: astore_0
    //   5345: aload_0
    //   5346: bipush #33
    //   5348: aaload
    //   5349: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5352: ifeq -> 5600
    //   5355: sipush #134
    //   5358: istore #13
    //   5360: goto -> 5600
    //   5363: aload #12
    //   5365: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5368: astore_0
    //   5369: aload_0
    //   5370: bipush #109
    //   5372: aaload
    //   5373: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5376: ifeq -> 5600
    //   5379: sipush #135
    //   5382: istore #13
    //   5384: goto -> 5600
    //   5387: aload #12
    //   5389: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5392: astore_0
    //   5393: aload_0
    //   5394: bipush #60
    //   5396: aaload
    //   5397: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5400: ifeq -> 5600
    //   5403: sipush #136
    //   5406: istore #13
    //   5408: goto -> 5600
    //   5411: aload #12
    //   5413: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5416: astore_0
    //   5417: aload_0
    //   5418: sipush #142
    //   5421: aaload
    //   5422: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5425: ifeq -> 5600
    //   5428: sipush #137
    //   5431: istore #13
    //   5433: goto -> 5600
    //   5436: aload #12
    //   5438: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5441: astore_0
    //   5442: aload_0
    //   5443: bipush #27
    //   5445: aaload
    //   5446: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5449: ifeq -> 5600
    //   5452: sipush #138
    //   5455: istore #13
    //   5457: goto -> 5600
    //   5460: aload #12
    //   5462: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5465: astore_0
    //   5466: aload_0
    //   5467: bipush #35
    //   5469: aaload
    //   5470: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5473: ifeq -> 5600
    //   5476: sipush #139
    //   5479: istore #13
    //   5481: goto -> 5600
    //   5484: aload #12
    //   5486: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5489: astore_0
    //   5490: aload_0
    //   5491: bipush #24
    //   5493: aaload
    //   5494: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5497: ifeq -> 5600
    //   5500: sipush #140
    //   5503: istore #13
    //   5505: goto -> 5600
    //   5508: aload #12
    //   5510: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5513: astore_0
    //   5514: aload_0
    //   5515: sipush #136
    //   5518: aaload
    //   5519: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5522: ifeq -> 5600
    //   5525: sipush #141
    //   5528: istore #13
    //   5530: goto -> 5600
    //   5533: aload #12
    //   5535: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5538: astore_0
    //   5539: aload_0
    //   5540: bipush #70
    //   5542: aaload
    //   5543: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5546: ifeq -> 5600
    //   5549: sipush #142
    //   5552: istore #13
    //   5554: goto -> 5600
    //   5557: aload #12
    //   5559: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5562: astore_0
    //   5563: aload_0
    //   5564: bipush #56
    //   5566: aaload
    //   5567: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5570: ifeq -> 5600
    //   5573: sipush #143
    //   5576: istore #13
    //   5578: goto -> 5600
    //   5581: aload #12
    //   5583: getstatic me/frep/aegisguard/spigot/aegisguard_a.a : [Ljava/lang/String;
    //   5586: bipush #121
    //   5588: aaload
    //   5589: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5592: ifeq -> 5600
    //   5595: sipush #144
    //   5598: istore #13
    //   5600: iload #13
    //   5602: tableswitch default -> 6499, 0 -> 6196, 1 -> 6196, 2 -> 6196, 3 -> 6196, 4 -> 6196, 5 -> 6196, 6 -> 6196, 7 -> 6196, 8 -> 6196, 9 -> 6196, 10 -> 6219, 11 -> 6219, 12 -> 6219, 13 -> 6219, 14 -> 6219, 15 -> 6219, 16 -> 6219, 17 -> 6219, 18 -> 6219, 19 -> 6219, 20 -> 6219, 21 -> 6219, 22 -> 6219, 23 -> 6219, 24 -> 6219, 25 -> 6219, 26 -> 6219, 27 -> 6219, 28 -> 6219, 29 -> 6219, 30 -> 6238, 31 -> 6238, 32 -> 6238, 33 -> 6238, 34 -> 6238, 35 -> 6238, 36 -> 6238, 37 -> 6238, 38 -> 6238, 39 -> 6238, 40 -> 6238, 41 -> 6257, 42 -> 6257, 43 -> 6257, 44 -> 6257, 45 -> 6257, 46 -> 6257, 47 -> 6257, 48 -> 6257, 49 -> 6257, 50 -> 6257, 51 -> 6257, 52 -> 6257, 53 -> 6257, 54 -> 6257, 55 -> 6257, 56 -> 6257, 57 -> 6257, 58 -> 6257, 59 -> 6257, 60 -> 6257, 61 -> 6257, 62 -> 6257, 63 -> 6257, 64 -> 6257, 65 -> 6257, 66 -> 6257, 67 -> 6257, 68 -> 6257, 69 -> 6257, 70 -> 6257, 71 -> 6257, 72 -> 6257, 73 -> 6257, 74 -> 6257, 75 -> 6257, 76 -> 6257, 77 -> 6257, 78 -> 6257, 79 -> 6257, 80 -> 6257, 81 -> 6257, 82 -> 6257, 83 -> 6257, 84 -> 6257, 85 -> 6257, 86 -> 6257, 87 -> 6257, 88 -> 6257, 89 -> 6257, 90 -> 6257, 91 -> 6257, 92 -> 6257, 93 -> 6257, 94 -> 6275, 95 -> 6275, 96 -> 6275, 97 -> 6275, 98 -> 6275, 99 -> 6294, 100 -> 6294, 101 -> 6294, 102 -> 6294, 103 -> 6294, 104 -> 6294, 105 -> 6294, 106 -> 6294, 107 -> 6294, 108 -> 6313, 109 -> 6313, 110 -> 6313, 111 -> 6313, 112 -> 6332, 113 -> 6332, 114 -> 6332, 115 -> 6350, 116 -> 6369, 117 -> 6388, 118 -> 6388, 119 -> 6388, 120 -> 6407, 121 -> 6407, 122 -> 6407, 123 -> 6407, 124 -> 6407, 125 -> 6426, 126 -> 6445, 127 -> 6445, 128 -> 6445, 129 -> 6445, 130 -> 6445, 131 -> 6445, 132 -> 6445, 133 -> 6445, 134 -> 6445, 135 -> 6445, 136 -> 6445, 137 -> 6445, 138 -> 6445, 139 -> 6445, 140 -> 6445, 141 -> 6445, 142 -> 6464, 143 -> 6483, 144 -> 6483
    //   6196: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6199: aload #11
    //   6201: ldc 0.5
    //   6203: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6206: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6211: pop
    //   6212: goto -> 6499
    //   6215: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   6218: athrow
    //   6219: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6222: aload #11
    //   6224: ldc 3.0
    //   6226: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6229: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6234: pop
    //   6235: goto -> 6499
    //   6238: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6241: aload #11
    //   6243: ldc 5.0
    //   6245: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6248: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6253: pop
    //   6254: goto -> 6499
    //   6257: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6260: aload #11
    //   6262: fconst_2
    //   6263: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6266: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6271: pop
    //   6272: goto -> 6499
    //   6275: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6278: aload #11
    //   6280: ldc 1.5
    //   6282: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6285: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6290: pop
    //   6291: goto -> 6499
    //   6294: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6297: aload #11
    //   6299: ldc 0.8
    //   6301: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6304: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6309: pop
    //   6310: goto -> 6499
    //   6313: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6316: aload #11
    //   6318: ldc 0.7
    //   6320: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6323: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6328: pop
    //   6329: goto -> 6499
    //   6332: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6335: aload #11
    //   6337: fconst_1
    //   6338: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6341: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6346: pop
    //   6347: goto -> 6499
    //   6350: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6353: aload #11
    //   6355: ldc 22.5
    //   6357: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6360: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6365: pop
    //   6366: goto -> 6499
    //   6369: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6372: aload #11
    //   6374: ldc 50.0
    //   6376: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6379: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6384: pop
    //   6385: goto -> 6499
    //   6388: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6391: aload #11
    //   6393: ldc 3.5
    //   6395: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6398: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6403: pop
    //   6404: goto -> 6499
    //   6407: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6410: aload #11
    //   6412: ldc 0.6
    //   6414: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6417: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6422: pop
    //   6423: goto -> 6499
    //   6426: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6429: aload #11
    //   6431: ldc 0.65
    //   6433: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6436: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6441: pop
    //   6442: goto -> 6499
    //   6445: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6448: aload #11
    //   6450: ldc 1.4
    //   6452: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6455: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6460: pop
    //   6461: goto -> 6499
    //   6464: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6467: aload #11
    //   6469: ldc 1.8
    //   6471: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6474: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6479: pop
    //   6480: goto -> 6499
    //   6483: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_U : Ljava/util/Map;
    //   6486: aload #11
    //   6488: ldc 2.5
    //   6490: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6493: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6498: pop
    //   6499: iinc #10, 1
    //   6502: goto -> 1013
    //   6505: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6508: iconst_1
    //   6509: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6512: ldc2_w 0.41999998688697815
    //   6515: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6518: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6523: pop
    //   6524: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6527: iconst_2
    //   6528: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6531: ldc2_w 0.33319999363422426
    //   6534: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6537: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6542: pop
    //   6543: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6546: iconst_3
    //   6547: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6550: ldc2_w 0.24813599859094637
    //   6553: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6556: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6561: pop
    //   6562: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6565: iconst_4
    //   6566: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6569: ldc2_w 0.164773281826065
    //   6572: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6575: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6580: pop
    //   6581: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6584: iconst_5
    //   6585: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6588: ldc2_w 0.08307781780646906
    //   6591: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6594: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6599: pop
    //   6600: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6603: bipush #6
    //   6605: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6608: ldc2_w -0.07840000152587834
    //   6611: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6614: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6619: pop
    //   6620: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6623: bipush #7
    //   6625: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6628: ldc2_w -0.15523200451659847
    //   6631: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6634: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6639: pop
    //   6640: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6643: bipush #8
    //   6645: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6648: ldc2_w -0.23052736891296632
    //   6651: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6654: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6659: pop
    //   6660: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6663: bipush #9
    //   6665: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6668: ldc2_w -0.30431682745754074
    //   6671: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6674: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6679: pop
    //   6680: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6683: bipush #10
    //   6685: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6688: ldc2_w -0.37663049823865435
    //   6691: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6694: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6699: pop
    //   6700: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_C : Ljava/util/Map;
    //   6703: bipush #11
    //   6705: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6708: ldc2_w -0.1040803780930446
    //   6711: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6714: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6719: pop
    //   6720: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_T : Ljava/util/Map;
    //   6723: iconst_1
    //   6724: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6727: ldc2_w -0.07840000152587834
    //   6730: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6733: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6738: pop
    //   6739: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_T : Ljava/util/Map;
    //   6742: iconst_2
    //   6743: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6746: ldc2_w -0.15523200451659847
    //   6749: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6752: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6757: pop
    //   6758: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_T : Ljava/util/Map;
    //   6761: iconst_3
    //   6762: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6765: ldc2_w -0.23052736891296632
    //   6768: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6771: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6776: pop
    //   6777: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_T : Ljava/util/Map;
    //   6780: iconst_4
    //   6781: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6784: ldc2_w -0.30431682745754074
    //   6787: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6790: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6795: pop
    //   6796: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_T : Ljava/util/Map;
    //   6799: iconst_5
    //   6800: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6803: ldc2_w -0.37663049823865435
    //   6806: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6809: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6814: pop
    //   6815: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_T : Ljava/util/Map;
    //   6818: bipush #6
    //   6820: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6823: ldc2_w -0.44749789698342113
    //   6826: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6829: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6834: pop
    //   6835: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_T : Ljava/util/Map;
    //   6838: bipush #7
    //   6840: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6843: ldc2_w -0.5169479491049742
    //   6846: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6849: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6854: pop
    //   6855: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   6858: iconst_0
    //   6859: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6862: dconst_0
    //   6863: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6866: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6871: pop
    //   6872: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   6875: iconst_1
    //   6876: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6879: ldc2_w 0.0070422534
    //   6882: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6885: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6890: pop
    //   6891: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   6894: iconst_2
    //   6895: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6898: ldc2_w 0.014084507
    //   6901: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6904: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6909: pop
    //   6910: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   6913: iconst_3
    //   6914: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6917: dconst_0
    //   6918: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6921: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6926: pop
    //   6927: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   6930: iconst_4
    //   6931: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6934: ldc2_w 0.02112676
    //   6937: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6940: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6945: pop
    //   6946: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   6949: iconst_5
    //   6950: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6953: ldc2_w 0.028169014
    //   6956: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6959: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6964: pop
    //   6965: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   6968: bipush #6
    //   6970: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6973: ldc2_w 0.0281690166
    //   6976: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6979: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6984: pop
    //   6985: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   6988: bipush #7
    //   6990: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6993: ldc2_w 0.03521127
    //   6996: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6999: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7004: pop
    //   7005: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7008: bipush #8
    //   7010: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7013: ldc2_w 0.04225352
    //   7016: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7019: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7024: pop
    //   7025: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7028: bipush #9
    //   7030: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7033: ldc2_w 0.049295776
    //   7036: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7039: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7044: pop
    //   7045: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7048: bipush #10
    //   7050: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7053: ldc2_w 0.0492957736
    //   7056: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7059: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7064: pop
    //   7065: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7068: bipush #11
    //   7070: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7073: ldc2_w 0.056338027
    //   7076: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7079: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7084: pop
    //   7085: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7088: bipush #12
    //   7090: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7093: ldc2_w 0.06338028
    //   7096: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7099: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7104: pop
    //   7105: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7108: bipush #13
    //   7110: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7113: dconst_0
    //   7114: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7117: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7122: pop
    //   7123: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7126: bipush #14
    //   7128: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7131: ldc2_w 0.07042254
    //   7134: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7137: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7142: pop
    //   7143: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7146: bipush #15
    //   7148: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7151: ldc2_w 0.07746479
    //   7154: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7157: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7162: pop
    //   7163: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7166: bipush #16
    //   7168: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7171: ldc2_w 0.08450704
    //   7174: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7177: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7182: pop
    //   7183: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7186: bipush #17
    //   7188: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7191: dconst_0
    //   7192: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7195: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7200: pop
    //   7201: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7204: bipush #18
    //   7206: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7209: ldc2_w 0.09154929
    //   7212: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7215: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7220: pop
    //   7221: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7224: bipush #19
    //   7226: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7229: ldc2_w 0.09859155
    //   7232: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7235: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7240: pop
    //   7241: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7244: bipush #20
    //   7246: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7249: dconst_0
    //   7250: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7253: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7258: pop
    //   7259: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7262: bipush #21
    //   7264: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7267: ldc2_w 0.1056338
    //   7270: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7273: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7278: pop
    //   7279: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7282: bipush #22
    //   7284: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7287: ldc2_w 0.112676054
    //   7290: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7293: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7298: pop
    //   7299: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7302: bipush #23
    //   7304: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7307: ldc2_w 0.11971831
    //   7310: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7313: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7318: pop
    //   7319: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7322: bipush #24
    //   7324: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7327: dconst_0
    //   7328: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7331: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7336: pop
    //   7337: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7340: bipush #25
    //   7342: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7345: ldc2_w 0.12676056
    //   7348: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7351: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7356: pop
    //   7357: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7360: bipush #26
    //   7362: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7365: ldc2_w 0.13380282
    //   7368: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7371: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7376: pop
    //   7377: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7380: bipush #27
    //   7382: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7385: dconst_0
    //   7386: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7389: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7394: pop
    //   7395: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7398: bipush #28
    //   7400: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7403: ldc2_w 0.14084508
    //   7406: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7409: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7414: pop
    //   7415: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7418: bipush #29
    //   7420: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7423: ldc2_w 0.14788732
    //   7426: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7429: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7434: pop
    //   7435: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7438: bipush #30
    //   7440: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7443: ldc2_w 0.15492958
    //   7446: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7449: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7454: pop
    //   7455: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7458: bipush #31
    //   7460: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7463: dconst_0
    //   7464: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7467: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7472: pop
    //   7473: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7476: bipush #32
    //   7478: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7481: ldc2_w 0.16197184
    //   7484: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7487: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7492: pop
    //   7493: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7496: bipush #33
    //   7498: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7501: ldc2_w 0.16901408
    //   7504: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7507: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7512: pop
    //   7513: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7516: bipush #34
    //   7518: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7521: dconst_0
    //   7522: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7525: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7530: pop
    //   7531: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7534: bipush #35
    //   7536: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7539: ldc2_w 0.17605634
    //   7542: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7545: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7550: pop
    //   7551: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7554: bipush #36
    //   7556: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7559: ldc2_w 0.18309858
    //   7562: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7565: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7570: pop
    //   7571: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7574: bipush #37
    //   7576: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7579: dconst_0
    //   7580: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7583: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7588: pop
    //   7589: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7592: bipush #38
    //   7594: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7597: ldc2_w 0.19014084
    //   7600: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7603: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7608: pop
    //   7609: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7612: bipush #39
    //   7614: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7617: ldc2_w 0.1971831
    //   7620: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7623: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7628: pop
    //   7629: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7632: bipush #40
    //   7634: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7637: ldc2_w 0.20422535
    //   7640: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7643: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7648: pop
    //   7649: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7652: bipush #41
    //   7654: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7657: dconst_0
    //   7658: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7661: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7666: pop
    //   7667: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7670: bipush #42
    //   7672: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7675: ldc2_w 0.2112676
    //   7678: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7681: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7686: pop
    //   7687: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7690: bipush #43
    //   7692: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7695: ldc2_w 0.21830986
    //   7698: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7701: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7706: pop
    //   7707: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7710: bipush #44
    //   7712: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7715: dconst_0
    //   7716: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7719: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7724: pop
    //   7725: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7728: bipush #45
    //   7730: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7733: ldc2_w 0.22535211
    //   7736: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7739: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7744: pop
    //   7745: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7748: bipush #46
    //   7750: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7753: ldc2_w 0.23239437
    //   7756: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7759: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7764: pop
    //   7765: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7768: bipush #47
    //   7770: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7773: ldc2_w 0.23943663
    //   7776: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7779: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7784: pop
    //   7785: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7788: bipush #48
    //   7790: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7793: dconst_0
    //   7794: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7797: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7802: pop
    //   7803: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7806: bipush #49
    //   7808: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7811: ldc2_w 0.24647887
    //   7814: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7817: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7822: pop
    //   7823: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7826: bipush #50
    //   7828: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7831: ldc2_w 0.2535211
    //   7834: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7837: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7842: pop
    //   7843: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7846: bipush #51
    //   7848: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7851: dconst_0
    //   7852: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7855: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7860: pop
    //   7861: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7864: bipush #52
    //   7866: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7869: ldc2_w 0.26056337
    //   7872: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7875: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7880: pop
    //   7881: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7884: bipush #53
    //   7886: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7889: ldc2_w 0.26760563
    //   7892: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7895: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7900: pop
    //   7901: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7904: bipush #54
    //   7906: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7909: ldc2_w 0.2746479
    //   7912: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7915: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7920: pop
    //   7921: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7924: bipush #55
    //   7926: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7929: dconst_0
    //   7930: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7933: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7938: pop
    //   7939: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7942: bipush #56
    //   7944: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7947: ldc2_w 0.28169015
    //   7950: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7953: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7958: pop
    //   7959: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7962: bipush #57
    //   7964: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7967: ldc2_w 0.28873238
    //   7970: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7973: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7978: pop
    //   7979: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   7982: bipush #58
    //   7984: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7987: dconst_0
    //   7988: invokestatic valueOf : (D)Ljava/lang/Double;
    //   7991: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7996: pop
    //   7997: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8000: bipush #59
    //   8002: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8005: ldc2_w 0.29577464
    //   8008: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8011: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8016: pop
    //   8017: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8020: bipush #60
    //   8022: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8025: ldc2_w 0.3028169
    //   8028: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8031: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8036: pop
    //   8037: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8040: bipush #61
    //   8042: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8045: ldc2_w 0.30985916
    //   8048: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8051: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8056: pop
    //   8057: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8060: bipush #62
    //   8062: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8065: dconst_0
    //   8066: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8069: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8074: pop
    //   8075: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8078: bipush #63
    //   8080: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8083: ldc2_w 0.31690142
    //   8086: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8089: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8094: pop
    //   8095: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8098: bipush #64
    //   8100: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8103: ldc2_w 0.32394367
    //   8106: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8109: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8114: pop
    //   8115: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8118: bipush #65
    //   8120: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8123: dconst_0
    //   8124: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8127: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8132: pop
    //   8133: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8136: bipush #66
    //   8138: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8141: ldc2_w 0.3309859
    //   8144: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8147: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8152: pop
    //   8153: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8156: bipush #67
    //   8158: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8161: ldc2_w 0.33802816
    //   8164: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8167: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8172: pop
    //   8173: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8176: bipush #68
    //   8178: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8181: ldc2_w 0.34507042
    //   8184: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8187: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8192: pop
    //   8193: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8196: bipush #69
    //   8198: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8201: dconst_0
    //   8202: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8205: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8210: pop
    //   8211: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8214: bipush #70
    //   8216: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8219: ldc2_w 0.35211268
    //   8222: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8225: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8230: pop
    //   8231: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8234: bipush #71
    //   8236: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8239: ldc2_w 0.35915494
    //   8242: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8245: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8250: pop
    //   8251: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8254: bipush #72
    //   8256: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8259: dconst_0
    //   8260: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8263: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8268: pop
    //   8269: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8272: bipush #73
    //   8274: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8277: ldc2_w 0.36619717
    //   8280: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8283: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8288: pop
    //   8289: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8292: bipush #74
    //   8294: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8297: ldc2_w 0.37323943
    //   8300: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8303: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8308: pop
    //   8309: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8312: bipush #75
    //   8314: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8317: dconst_0
    //   8318: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8321: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8326: pop
    //   8327: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8330: bipush #76
    //   8332: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8335: ldc2_w 0.3802817
    //   8338: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8341: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8346: pop
    //   8347: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8350: bipush #77
    //   8352: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8355: ldc2_w 0.38732395
    //   8358: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8361: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8366: pop
    //   8367: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8370: bipush #78
    //   8372: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8375: ldc2_w 0.3943662
    //   8378: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8381: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8386: pop
    //   8387: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8390: bipush #79
    //   8392: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8395: dconst_0
    //   8396: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8399: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8404: pop
    //   8405: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8408: bipush #80
    //   8410: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8413: ldc2_w 0.40140846
    //   8416: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8419: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8424: pop
    //   8425: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8428: bipush #81
    //   8430: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8433: ldc2_w 0.4084507
    //   8436: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8439: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8444: pop
    //   8445: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8448: bipush #82
    //   8450: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8453: dconst_0
    //   8454: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8457: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8462: pop
    //   8463: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8466: bipush #83
    //   8468: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8471: ldc2_w 0.41549295
    //   8474: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8477: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8482: pop
    //   8483: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8486: bipush #84
    //   8488: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8491: ldc2_w 0.4225352
    //   8494: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8497: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8502: pop
    //   8503: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8506: bipush #85
    //   8508: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8511: ldc2_w 0.42957747
    //   8514: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8517: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8522: pop
    //   8523: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8526: bipush #86
    //   8528: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8531: dconst_0
    //   8532: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8535: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8540: pop
    //   8541: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8544: bipush #87
    //   8546: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8549: ldc2_w 0.43661973
    //   8552: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8555: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8560: pop
    //   8561: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8564: bipush #88
    //   8566: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8569: ldc2_w 0.44366196
    //   8572: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8575: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8580: pop
    //   8581: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8584: bipush #89
    //   8586: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8589: dconst_0
    //   8590: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8593: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8598: pop
    //   8599: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8602: bipush #90
    //   8604: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8607: ldc2_w 0.45070422
    //   8610: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8613: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8618: pop
    //   8619: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8622: bipush #91
    //   8624: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8627: ldc2_w 0.45774648
    //   8630: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8633: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8638: pop
    //   8639: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8642: bipush #92
    //   8644: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8647: ldc2_w 0.46478873
    //   8650: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8653: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8658: pop
    //   8659: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8662: bipush #93
    //   8664: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8667: dconst_0
    //   8668: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8671: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8676: pop
    //   8677: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8680: bipush #94
    //   8682: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8685: ldc2_w 0.471831
    //   8688: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8691: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8696: pop
    //   8697: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8700: bipush #95
    //   8702: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8705: ldc2_w 0.47887325
    //   8708: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8711: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8716: pop
    //   8717: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8720: bipush #96
    //   8722: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8725: dconst_0
    //   8726: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8729: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8734: pop
    //   8735: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8738: bipush #97
    //   8740: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8743: ldc2_w 0.48591548
    //   8746: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8749: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8754: pop
    //   8755: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8758: bipush #98
    //   8760: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8763: ldc2_w 0.49295774
    //   8766: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8769: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8774: pop
    //   8775: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8778: bipush #99
    //   8780: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8783: ldc2_w 0.5
    //   8786: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8789: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8794: pop
    //   8795: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8798: bipush #100
    //   8800: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8803: ldc2_w 0.5
    //   8806: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8809: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8814: pop
    //   8815: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8818: bipush #101
    //   8820: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8823: ldc2_w 0.5070422
    //   8826: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8829: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8834: pop
    //   8835: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8838: bipush #102
    //   8840: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8843: ldc2_w 0.5140845
    //   8846: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8849: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8854: pop
    //   8855: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8858: bipush #103
    //   8860: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8863: dconst_0
    //   8864: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8867: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8872: pop
    //   8873: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8876: bipush #104
    //   8878: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8881: ldc2_w 0.52112675
    //   8884: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8887: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8892: pop
    //   8893: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8896: bipush #105
    //   8898: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8901: ldc2_w 0.52816904
    //   8904: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8907: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8912: pop
    //   8913: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8916: bipush #106
    //   8918: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8921: dconst_0
    //   8922: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8925: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8930: pop
    //   8931: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8934: bipush #107
    //   8936: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8939: ldc2_w 0.53521127
    //   8942: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8945: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8950: pop
    //   8951: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8954: bipush #108
    //   8956: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8959: ldc2_w 0.5422535
    //   8962: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8965: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8970: pop
    //   8971: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8974: bipush #109
    //   8976: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8979: ldc2_w 0.5492958
    //   8982: invokestatic valueOf : (D)Ljava/lang/Double;
    //   8985: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   8990: pop
    //   8991: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   8994: bipush #110
    //   8996: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8999: dconst_0
    //   9000: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9003: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9008: pop
    //   9009: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9012: bipush #111
    //   9014: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9017: ldc2_w 0.556338
    //   9020: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9023: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9028: pop
    //   9029: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9032: bipush #112
    //   9034: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9037: ldc2_w 0.5633803
    //   9040: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9043: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9048: pop
    //   9049: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9052: bipush #113
    //   9054: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9057: dconst_0
    //   9058: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9061: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9066: pop
    //   9067: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9070: bipush #114
    //   9072: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9075: ldc2_w 0.57042253
    //   9078: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9081: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9086: pop
    //   9087: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9090: bipush #115
    //   9092: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9095: ldc2_w 0.57746476
    //   9098: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9101: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9106: pop
    //   9107: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9110: bipush #116
    //   9112: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9115: ldc2_w 0.58450705
    //   9118: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9121: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9126: pop
    //   9127: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9130: bipush #117
    //   9132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9135: dconst_0
    //   9136: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9139: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9144: pop
    //   9145: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9148: bipush #118
    //   9150: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9153: ldc2_w 0.5915493
    //   9156: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9159: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9164: pop
    //   9165: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9168: bipush #119
    //   9170: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9173: ldc2_w 0.59859157
    //   9176: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9179: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9184: pop
    //   9185: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9188: bipush #120
    //   9190: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9193: dconst_0
    //   9194: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9197: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9202: pop
    //   9203: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9206: bipush #121
    //   9208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9211: ldc2_w 0.6056338
    //   9214: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9217: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9222: pop
    //   9223: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9226: bipush #122
    //   9228: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9231: ldc2_w 0.6126761
    //   9234: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9237: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9242: pop
    //   9243: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9246: bipush #123
    //   9248: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9251: ldc2_w 0.6197183
    //   9254: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9257: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9262: pop
    //   9263: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9266: bipush #124
    //   9268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9271: dconst_0
    //   9272: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9275: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9280: pop
    //   9281: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9284: bipush #125
    //   9286: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9289: ldc2_w 0.62676054
    //   9292: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9295: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9300: pop
    //   9301: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9304: bipush #126
    //   9306: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9309: ldc2_w 0.63380283
    //   9312: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9315: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9320: pop
    //   9321: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9324: bipush #127
    //   9326: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9329: dconst_0
    //   9330: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9333: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9338: pop
    //   9339: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9342: sipush #128
    //   9345: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9348: ldc2_w 0.64084506
    //   9351: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9354: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9359: pop
    //   9360: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9363: sipush #129
    //   9366: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9369: ldc2_w 0.64788735
    //   9372: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9375: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9380: pop
    //   9381: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9384: sipush #130
    //   9387: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9390: ldc2_w 0.6549296
    //   9393: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9396: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9401: pop
    //   9402: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9405: sipush #131
    //   9408: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9411: dconst_0
    //   9412: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9415: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9420: pop
    //   9421: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9424: sipush #132
    //   9427: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9430: ldc2_w 0.6619718
    //   9433: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9436: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9441: pop
    //   9442: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9445: sipush #133
    //   9448: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9451: ldc2_w 0.6690141
    //   9454: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9457: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9462: pop
    //   9463: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9466: sipush #134
    //   9469: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9472: dconst_0
    //   9473: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9476: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9481: pop
    //   9482: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9485: sipush #135
    //   9488: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9491: ldc2_w 0.6760563
    //   9494: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9497: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9502: pop
    //   9503: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9506: sipush #136
    //   9509: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9512: ldc2_w 0.6830986
    //   9515: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9518: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9523: pop
    //   9524: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9527: sipush #137
    //   9530: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9533: dconst_0
    //   9534: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9537: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9542: pop
    //   9543: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9546: sipush #138
    //   9549: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9552: ldc2_w 0.69014084
    //   9555: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9558: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9563: pop
    //   9564: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9567: sipush #139
    //   9570: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9573: ldc2_w 0.6971831
    //   9576: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9579: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9584: pop
    //   9585: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9588: sipush #140
    //   9591: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9594: ldc2_w 0.70422536
    //   9597: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9600: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9605: pop
    //   9606: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9609: sipush #141
    //   9612: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9615: dconst_0
    //   9616: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9619: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9624: pop
    //   9625: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9628: sipush #142
    //   9631: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9634: ldc2_w 0.7112676
    //   9637: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9640: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9645: pop
    //   9646: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9649: sipush #143
    //   9652: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9655: ldc2_w 0.7183099
    //   9658: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9661: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9666: pop
    //   9667: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9670: sipush #144
    //   9673: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9676: ldc2_w 0.7253521
    //   9679: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9682: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9687: pop
    //   9688: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9691: sipush #145
    //   9694: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9697: ldc2_w 0.7253521
    //   9700: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9703: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9708: pop
    //   9709: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9712: sipush #146
    //   9715: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9718: ldc2_w 0.73239434
    //   9721: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9724: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9729: pop
    //   9730: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9733: sipush #147
    //   9736: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9739: ldc2_w 0.7394366
    //   9742: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9745: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9750: pop
    //   9751: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9754: sipush #148
    //   9757: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9760: dconst_0
    //   9761: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9764: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9769: pop
    //   9770: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9773: sipush #149
    //   9776: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9779: ldc2_w 0.74647886
    //   9782: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9785: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9790: pop
    //   9791: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9794: sipush #150
    //   9797: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9800: ldc2_w 0.75352114
    //   9803: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9806: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9811: pop
    //   9812: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9815: sipush #151
    //   9818: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9821: dconst_0
    //   9822: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9825: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9830: pop
    //   9831: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9834: sipush #152
    //   9837: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9840: ldc2_w 0.7605634
    //   9843: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9846: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9851: pop
    //   9852: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9855: sipush #153
    //   9858: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9861: ldc2_w 0.76760566
    //   9864: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9867: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9872: pop
    //   9873: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9876: sipush #154
    //   9879: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9882: ldc2_w 0.7746479
    //   9885: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9888: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9893: pop
    //   9894: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9897: sipush #155
    //   9900: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9903: dconst_0
    //   9904: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9907: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9912: pop
    //   9913: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9916: sipush #156
    //   9919: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9922: ldc2_w 0.7816901
    //   9925: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9928: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9933: pop
    //   9934: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9937: sipush #157
    //   9940: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9943: ldc2_w 0.7887324
    //   9946: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9949: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9954: pop
    //   9955: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9958: sipush #158
    //   9961: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9964: dconst_0
    //   9965: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9968: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9973: pop
    //   9974: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9977: sipush #159
    //   9980: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9983: ldc2_w 0.79577464
    //   9986: invokestatic valueOf : (D)Ljava/lang/Double;
    //   9989: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   9994: pop
    //   9995: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   9998: sipush #160
    //   10001: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10004: ldc2_w 0.8028169
    //   10007: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10010: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10015: pop
    //   10016: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10019: sipush #161
    //   10022: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10025: ldc2_w 0.80985916
    //   10028: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10031: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10036: pop
    //   10037: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10040: sipush #162
    //   10043: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10046: dconst_0
    //   10047: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10050: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10055: pop
    //   10056: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10059: sipush #163
    //   10062: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10065: ldc2_w 0.8169014
    //   10068: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10071: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10076: pop
    //   10077: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10080: sipush #164
    //   10083: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10086: ldc2_w 0.8239437
    //   10089: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10092: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10097: pop
    //   10098: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10101: sipush #165
    //   10104: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10107: dconst_0
    //   10108: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10111: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10116: pop
    //   10117: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10120: sipush #166
    //   10123: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10126: ldc2_w 0.8309859
    //   10129: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10132: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10137: pop
    //   10138: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10141: sipush #167
    //   10144: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10147: ldc2_w 0.8380282
    //   10150: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10153: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10158: pop
    //   10159: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10162: sipush #168
    //   10165: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10168: dconst_0
    //   10169: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10172: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10177: pop
    //   10178: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10181: sipush #169
    //   10184: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10187: ldc2_w 0.8450704
    //   10190: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10193: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10198: pop
    //   10199: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10202: sipush #170
    //   10205: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10208: ldc2_w 0.85211265
    //   10211: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10214: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10219: pop
    //   10220: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10223: sipush #171
    //   10226: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10229: ldc2_w 0.85915494
    //   10232: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10235: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10240: pop
    //   10241: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10244: sipush #172
    //   10247: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10250: dconst_0
    //   10251: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10254: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10259: pop
    //   10260: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10263: sipush #173
    //   10266: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10269: ldc2_w 0.86619717
    //   10272: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10275: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10280: pop
    //   10281: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10284: sipush #174
    //   10287: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10290: ldc2_w 0.87323946
    //   10293: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10296: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10301: pop
    //   10302: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10305: sipush #175
    //   10308: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10311: dconst_0
    //   10312: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10315: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10320: pop
    //   10321: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10324: sipush #176
    //   10327: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10330: ldc2_w 0.8802817
    //   10333: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10336: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10341: pop
    //   10342: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10345: sipush #177
    //   10348: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10351: ldc2_w 0.8873239
    //   10354: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10357: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10362: pop
    //   10363: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10366: sipush #178
    //   10369: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10372: ldc2_w 0.8943662
    //   10375: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10378: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10383: pop
    //   10384: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10387: sipush #179
    //   10390: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10393: dconst_0
    //   10394: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10397: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10402: pop
    //   10403: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10406: sipush #180
    //   10409: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10412: ldc2_w 0.90140843
    //   10415: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10418: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10423: pop
    //   10424: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10427: sipush #181
    //   10430: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10433: ldc2_w 0.9084507
    //   10436: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10439: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10444: pop
    //   10445: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10448: sipush #182
    //   10451: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10454: dconst_0
    //   10455: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10458: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10463: pop
    //   10464: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10467: sipush #183
    //   10470: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10473: ldc2_w 0.91549295
    //   10476: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10479: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10484: pop
    //   10485: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10488: sipush #184
    //   10491: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10494: ldc2_w 0.92253524
    //   10497: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10500: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10505: pop
    //   10506: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10509: sipush #185
    //   10512: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10515: ldc2_w 0.92957747
    //   10518: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10521: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10526: pop
    //   10527: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10530: sipush #186
    //   10533: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10536: dconst_0
    //   10537: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10540: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10545: pop
    //   10546: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10549: sipush #187
    //   10552: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10555: ldc2_w 0.9366197
    //   10558: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10561: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10566: pop
    //   10567: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10570: sipush #188
    //   10573: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10576: ldc2_w 0.943662
    //   10579: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10582: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10587: pop
    //   10588: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10591: sipush #189
    //   10594: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10597: dconst_0
    //   10598: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10601: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10606: pop
    //   10607: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10610: sipush #190
    //   10613: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10616: ldc2_w 0.9507042
    //   10619: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10622: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10627: pop
    //   10628: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10631: sipush #191
    //   10634: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10637: ldc2_w 0.9577465
    //   10640: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10643: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10648: pop
    //   10649: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10652: sipush #192
    //   10655: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10658: ldc2_w 0.96478873
    //   10661: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10664: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10669: pop
    //   10670: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10673: sipush #193
    //   10676: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10679: dconst_0
    //   10680: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10683: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10688: pop
    //   10689: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10692: sipush #194
    //   10695: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10698: ldc2_w 0.97183096
    //   10701: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10704: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10709: pop
    //   10710: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10713: sipush #195
    //   10716: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10719: ldc2_w 0.97887325
    //   10722: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10725: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10730: pop
    //   10731: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10734: sipush #196
    //   10737: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10740: dconst_0
    //   10741: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10744: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10749: pop
    //   10750: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10753: sipush #197
    //   10756: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10759: ldc2_w 0.9859155
    //   10762: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10765: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10770: pop
    //   10771: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10774: sipush #198
    //   10777: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10780: ldc2_w 0.9929578
    //   10783: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10786: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10791: pop
    //   10792: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10795: sipush #199
    //   10798: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10801: dconst_1
    //   10802: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10805: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10810: pop
    //   10811: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_c : Ljava/util/Map;
    //   10814: sipush #200
    //   10817: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10820: dconst_1
    //   10821: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10824: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10829: pop
    //   10830: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10833: ldc2_w 0.05999999821185753
    //   10836: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10839: invokeinterface add : (Ljava/lang/Object;)Z
    //   10844: pop
    //   10845: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10848: ldc2_w 0.051999998867515274
    //   10851: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10854: invokeinterface add : (Ljava/lang/Object;)Z
    //   10859: pop
    //   10860: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10863: ldc2_w 0.06159999881982969
    //   10866: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10869: invokeinterface add : (Ljava/lang/Object;)Z
    //   10874: pop
    //   10875: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10878: ldc2_w 0.06927999889612124
    //   10881: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10884: invokeinterface add : (Ljava/lang/Object;)Z
    //   10889: pop
    //   10890: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10893: ldc2_w 0.07542399904870933
    //   10896: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10899: invokeinterface add : (Ljava/lang/Object;)Z
    //   10904: pop
    //   10905: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10908: ldc2_w 0.08033919924402255
    //   10911: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10914: invokeinterface add : (Ljava/lang/Object;)Z
    //   10919: pop
    //   10920: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10923: ldc2_w 0.08427135945886732
    //   10926: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10929: invokeinterface add : (Ljava/lang/Object;)Z
    //   10934: pop
    //   10935: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10938: ldc2_w 0.0874170876776148
    //   10941: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10944: invokeinterface add : (Ljava/lang/Object;)Z
    //   10949: pop
    //   10950: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10953: ldc2_w 0.08993367029011523
    //   10956: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10959: invokeinterface add : (Ljava/lang/Object;)Z
    //   10964: pop
    //   10965: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10968: ldc2_w 0.0519469373041872
    //   10971: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10974: invokeinterface add : (Ljava/lang/Object;)Z
    //   10979: pop
    //   10980: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10983: ldc2_w -0.05647059355944606
    //   10986: invokestatic valueOf : (D)Ljava/lang/Double;
    //   10989: invokeinterface add : (Ljava/lang/Object;)Z
    //   10994: pop
    //   10995: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   10998: ldc2_w 0.03812980539822064
    //   11001: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11004: invokeinterface add : (Ljava/lang/Object;)Z
    //   11009: pop
    //   11010: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   11013: ldc2_w -0.035014067535591664
    //   11016: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11019: invokeinterface add : (Ljava/lang/Object;)Z
    //   11024: pop
    //   11025: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   11028: ldc2_w -0.04453032983624894
    //   11031: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11034: invokeinterface add : (Ljava/lang/Object;)Z
    //   11039: pop
    //   11040: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   11043: ldc2_w 0.019999999105927202
    //   11046: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11049: invokeinterface add : (Ljava/lang/Object;)Z
    //   11054: pop
    //   11055: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   11058: ldc2_w -0.07159953051526458
    //   11061: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11064: invokeinterface add : (Ljava/lang/Object;)Z
    //   11069: pop
    //   11070: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   11073: ldc2_w 0.020820931761605266
    //   11076: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11079: invokeinterface add : (Ljava/lang/Object;)Z
    //   11084: pop
    //   11085: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   11088: ldc2_w 0.0010261658043049238
    //   11091: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11094: invokeinterface add : (Ljava/lang/Object;)Z
    //   11099: pop
    //   11100: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   11103: ldc2_w -0.023717291273619878
    //   11106: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11109: invokeinterface add : (Ljava/lang/Object;)Z
    //   11114: pop
    //   11115: getstatic me/frep/aegisguard/spigot/aegisguard_a.aegisguard_s : Ljava/util/List;
    //   11118: ldc2_w -0.010724939925282229
    //   11121: invokestatic valueOf : (D)Ljava/lang/Double;
    //   11124: invokeinterface add : (Ljava/lang/Object;)Z
    //   11129: pop
    //   11130: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 296
    //   #16	-> 306
    //   #17	-> 316
    //   #18	-> 326
    //   #20	-> 336
    //   #23	-> 346
    //   #24	-> 367
    //   #26	-> 387
    //   #28	-> 397
    //   #29	-> 406
    //   #30	-> 423
    //   #31	-> 436
    //   #32	-> 449
    //   #33	-> 461
    //   #34	-> 474
    //   #35	-> 486
    //   #36	-> 498
    //   #37	-> 509
    //   #38	-> 521
    //   #39	-> 534
    //   #40	-> 546
    //   #41	-> 558
    //   #42	-> 570
    //   #43	-> 583
    //   #44	-> 595
    //   #45	-> 607
    //   #46	-> 619
    //   #47	-> 631
    //   #48	-> 643
    //   #49	-> 655
    //   #50	-> 667
    //   #51	-> 679
    //   #52	-> 691
    //   #53	-> 703
    //   #54	-> 715
    //   #55	-> 727
    //   #56	-> 739
    //   #57	-> 751
    //   #58	-> 764
    //   #59	-> 777
    //   #60	-> 789
    //   #61	-> 801
    //   #62	-> 813
    //   #63	-> 825
    //   #64	-> 837
    //   #65	-> 849
    //   #66	-> 862
    //   #67	-> 874
    //   #68	-> 886
    //   #70	-> 898
    //   #72	-> 924
    //   #74	-> 966
    //   #70	-> 985
    //   #77	-> 991
    //   #79	-> 998
    //   #80	-> 1001
    //   #82	-> 1027
    //   #94	-> 6196
    //   #95	-> 6212
    //   #121	-> 6219
    //   #122	-> 6235
    //   #134	-> 6238
    //   #135	-> 6254
    //   #196	-> 6257
    //   #197	-> 6272
    //   #203	-> 6275
    //   #204	-> 6291
    //   #218	-> 6294
    //   #219	-> 6310
    //   #224	-> 6313
    //   #225	-> 6329
    //   #229	-> 6332
    //   #230	-> 6347
    //   #232	-> 6350
    //   #233	-> 6366
    //   #235	-> 6369
    //   #236	-> 6385
    //   #240	-> 6388
    //   #241	-> 6404
    //   #247	-> 6407
    //   #248	-> 6423
    //   #250	-> 6426
    //   #251	-> 6442
    //   #268	-> 6445
    //   #269	-> 6461
    //   #271	-> 6464
    //   #272	-> 6480
    //   #275	-> 6483
    //   #80	-> 6499
    //   #280	-> 6505
    //   #281	-> 6524
    //   #282	-> 6543
    //   #283	-> 6562
    //   #284	-> 6581
    //   #285	-> 6600
    //   #286	-> 6620
    //   #287	-> 6640
    //   #288	-> 6660
    //   #289	-> 6680
    //   #290	-> 6700
    //   #292	-> 6720
    //   #293	-> 6739
    //   #294	-> 6758
    //   #295	-> 6777
    //   #296	-> 6796
    //   #297	-> 6815
    //   #298	-> 6835
    //   #300	-> 6855
    //   #301	-> 6872
    //   #302	-> 6891
    //   #303	-> 6910
    //   #304	-> 6927
    //   #305	-> 6946
    //   #306	-> 6965
    //   #307	-> 6985
    //   #308	-> 7005
    //   #309	-> 7025
    //   #310	-> 7045
    //   #311	-> 7065
    //   #312	-> 7085
    //   #313	-> 7105
    //   #314	-> 7123
    //   #315	-> 7143
    //   #316	-> 7163
    //   #317	-> 7183
    //   #318	-> 7201
    //   #319	-> 7221
    //   #320	-> 7241
    //   #321	-> 7259
    //   #322	-> 7279
    //   #323	-> 7299
    //   #324	-> 7319
    //   #325	-> 7337
    //   #326	-> 7357
    //   #327	-> 7377
    //   #328	-> 7395
    //   #329	-> 7415
    //   #330	-> 7435
    //   #331	-> 7455
    //   #332	-> 7473
    //   #333	-> 7493
    //   #334	-> 7513
    //   #335	-> 7531
    //   #336	-> 7551
    //   #337	-> 7571
    //   #338	-> 7589
    //   #339	-> 7609
    //   #340	-> 7629
    //   #341	-> 7649
    //   #342	-> 7667
    //   #343	-> 7687
    //   #344	-> 7707
    //   #345	-> 7725
    //   #346	-> 7745
    //   #347	-> 7765
    //   #348	-> 7785
    //   #349	-> 7803
    //   #350	-> 7823
    //   #351	-> 7843
    //   #352	-> 7861
    //   #353	-> 7881
    //   #354	-> 7901
    //   #355	-> 7921
    //   #356	-> 7939
    //   #357	-> 7959
    //   #358	-> 7979
    //   #359	-> 7997
    //   #360	-> 8017
    //   #361	-> 8037
    //   #362	-> 8057
    //   #363	-> 8075
    //   #364	-> 8095
    //   #365	-> 8115
    //   #366	-> 8133
    //   #367	-> 8153
    //   #368	-> 8173
    //   #369	-> 8193
    //   #370	-> 8211
    //   #371	-> 8231
    //   #372	-> 8251
    //   #373	-> 8269
    //   #374	-> 8289
    //   #375	-> 8309
    //   #376	-> 8327
    //   #377	-> 8347
    //   #378	-> 8367
    //   #379	-> 8387
    //   #380	-> 8405
    //   #381	-> 8425
    //   #382	-> 8445
    //   #383	-> 8463
    //   #384	-> 8483
    //   #385	-> 8503
    //   #386	-> 8523
    //   #387	-> 8541
    //   #388	-> 8561
    //   #389	-> 8581
    //   #390	-> 8599
    //   #391	-> 8619
    //   #392	-> 8639
    //   #393	-> 8659
    //   #394	-> 8677
    //   #395	-> 8697
    //   #396	-> 8717
    //   #397	-> 8735
    //   #398	-> 8755
    //   #399	-> 8775
    //   #400	-> 8795
    //   #401	-> 8815
    //   #402	-> 8835
    //   #403	-> 8855
    //   #404	-> 8873
    //   #405	-> 8893
    //   #406	-> 8913
    //   #407	-> 8931
    //   #408	-> 8951
    //   #409	-> 8971
    //   #410	-> 8991
    //   #411	-> 9009
    //   #412	-> 9029
    //   #413	-> 9049
    //   #414	-> 9067
    //   #415	-> 9087
    //   #416	-> 9107
    //   #417	-> 9127
    //   #418	-> 9145
    //   #419	-> 9165
    //   #420	-> 9185
    //   #421	-> 9203
    //   #422	-> 9223
    //   #423	-> 9243
    //   #424	-> 9263
    //   #425	-> 9281
    //   #426	-> 9301
    //   #427	-> 9321
    //   #428	-> 9339
    //   #429	-> 9360
    //   #430	-> 9381
    //   #431	-> 9402
    //   #432	-> 9421
    //   #433	-> 9442
    //   #434	-> 9463
    //   #435	-> 9482
    //   #436	-> 9503
    //   #437	-> 9524
    //   #438	-> 9543
    //   #439	-> 9564
    //   #440	-> 9585
    //   #441	-> 9606
    //   #442	-> 9625
    //   #443	-> 9646
    //   #444	-> 9667
    //   #445	-> 9688
    //   #446	-> 9709
    //   #447	-> 9730
    //   #448	-> 9751
    //   #449	-> 9770
    //   #450	-> 9791
    //   #451	-> 9812
    //   #452	-> 9831
    //   #453	-> 9852
    //   #454	-> 9873
    //   #455	-> 9894
    //   #456	-> 9913
    //   #457	-> 9934
    //   #458	-> 9955
    //   #459	-> 9974
    //   #460	-> 9995
    //   #461	-> 10016
    //   #462	-> 10037
    //   #463	-> 10056
    //   #464	-> 10077
    //   #465	-> 10098
    //   #466	-> 10117
    //   #467	-> 10138
    //   #468	-> 10159
    //   #469	-> 10178
    //   #470	-> 10199
    //   #471	-> 10220
    //   #472	-> 10241
    //   #473	-> 10260
    //   #474	-> 10281
    //   #475	-> 10302
    //   #476	-> 10321
    //   #477	-> 10342
    //   #478	-> 10363
    //   #479	-> 10384
    //   #480	-> 10403
    //   #481	-> 10424
    //   #482	-> 10445
    //   #483	-> 10464
    //   #484	-> 10485
    //   #485	-> 10506
    //   #486	-> 10527
    //   #487	-> 10546
    //   #488	-> 10567
    //   #489	-> 10588
    //   #490	-> 10607
    //   #491	-> 10628
    //   #492	-> 10649
    //   #493	-> 10670
    //   #494	-> 10689
    //   #495	-> 10710
    //   #496	-> 10731
    //   #497	-> 10750
    //   #498	-> 10771
    //   #499	-> 10792
    //   #500	-> 10811
    //   #502	-> 10830
    //   #503	-> 10845
    //   #504	-> 10860
    //   #505	-> 10875
    //   #506	-> 10890
    //   #507	-> 10905
    //   #508	-> 10920
    //   #509	-> 10935
    //   #510	-> 10950
    //   #511	-> 10965
    //   #512	-> 10980
    //   #513	-> 10995
    //   #514	-> 11010
    //   #515	-> 11025
    //   #516	-> 11040
    //   #517	-> 11055
    //   #518	-> 11070
    //   #519	-> 11085
    //   #520	-> 11100
    //   #521	-> 11115
    //   #522	-> 11130
    // Exception table:
    //   from	to	target	type
    //   924	952	955	java/lang/UnsupportedOperationException
    //   937	962	962	java/lang/UnsupportedOperationException
    //   1037	2225	2228	java/lang/UnsupportedOperationException
    //   5600	6215	6215	java/lang/UnsupportedOperationException
  }
  
  public static void aegisguard_s(AbstractCheck[] paramArrayOfAbstractCheck) {
    aegisguard_W = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] aegisguard_T() {
    return aegisguard_W;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}
