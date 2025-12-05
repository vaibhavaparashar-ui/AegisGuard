package me.frep.aegisguard.spigot.AegisGuard_hk;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hD;

public class aegisguard_hk {
  private final String aegisguard_Y;
  
  private String aegisguard_B;
  
  private String aegisguard_K;
  
  private String aegisguard_p;
  
  private boolean aegisguard_V;
  
  private List aegisguard_j = new ArrayList();
  
  private static String[] aegisguard_Q;
  
  private static final long a = aegisguard_e.a(-1303972251820755069L, -5775893425049833018L, MethodHandles.lookup().lookupClass()).a(10931889824088L);
  
  private static final String[] b;
  
  public aegisguard_hk(String paramString) {
    this.aegisguard_Y = paramString;
  }
  
  public void aegisguard_B(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
  }
  
  public void aegisguard_X(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
  }
  
  public void aegisguard_z(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
  }
  
  public void aegisguard_Z(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_r(Object[] paramArrayOfObject) {
    aegisguard_hD aegisguard_hD = (aegisguard_hD)paramArrayOfObject[0];
    this.aegisguard_j.add(aegisguard_hD);
  }
  
  public void aegisguard_N(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_hk.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 59389626530327
    //   23: lxor
    //   24: lstore #4
    //   26: pop2
    //   27: invokestatic aegisguard_S : ()[Ljava/lang/String;
    //   30: astore #6
    //   32: aload_0
    //   33: aload #6
    //   35: ifnull -> 59
    //   38: getfield aegisguard_B : Ljava/lang/String;
    //   41: ifnonnull -> 88
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   50: athrow
    //   51: aload_0
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   58: athrow
    //   59: getfield aegisguard_j : Ljava/util/List;
    //   62: invokeinterface isEmpty : ()Z
    //   67: ifeq -> 88
    //   70: new java/lang/IllegalArgumentException
    //   73: dup
    //   74: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   77: bipush #19
    //   79: aaload
    //   80: invokespecial <init> : (Ljava/lang/String;)V
    //   83: athrow
    //   84: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   87: athrow
    //   88: new me/frep/aegisguard/spigot/aegisguard_Xi
    //   91: dup
    //   92: aload_0
    //   93: aconst_null
    //   94: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_hk;Lme/frep/aegisguard/spigot/aegisguard_Xx;)V
    //   97: astore #7
    //   99: aload #7
    //   101: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   104: astore #21
    //   106: aload #21
    //   108: bipush #12
    //   110: aaload
    //   111: aload_0
    //   112: getfield aegisguard_B : Ljava/lang/String;
    //   115: lload #4
    //   117: dup2_x1
    //   118: pop2
    //   119: iconst_3
    //   120: anewarray java/lang/Object
    //   123: dup_x1
    //   124: swap
    //   125: iconst_2
    //   126: swap
    //   127: aastore
    //   128: dup_x2
    //   129: dup_x2
    //   130: pop
    //   131: invokestatic valueOf : (J)Ljava/lang/Long;
    //   134: iconst_1
    //   135: swap
    //   136: aastore
    //   137: dup_x1
    //   138: swap
    //   139: iconst_0
    //   140: swap
    //   141: aastore
    //   142: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   145: aload #7
    //   147: aload #21
    //   149: bipush #16
    //   151: aaload
    //   152: aload_0
    //   153: getfield aegisguard_K : Ljava/lang/String;
    //   156: lload #4
    //   158: dup2_x1
    //   159: pop2
    //   160: iconst_3
    //   161: anewarray java/lang/Object
    //   164: dup_x1
    //   165: swap
    //   166: iconst_2
    //   167: swap
    //   168: aastore
    //   169: dup_x2
    //   170: dup_x2
    //   171: pop
    //   172: invokestatic valueOf : (J)Ljava/lang/Long;
    //   175: iconst_1
    //   176: swap
    //   177: aastore
    //   178: dup_x1
    //   179: swap
    //   180: iconst_0
    //   181: swap
    //   182: aastore
    //   183: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   186: aload #7
    //   188: aload #21
    //   190: bipush #10
    //   192: aaload
    //   193: aload_0
    //   194: getfield aegisguard_p : Ljava/lang/String;
    //   197: lload #4
    //   199: dup2_x1
    //   200: pop2
    //   201: iconst_3
    //   202: anewarray java/lang/Object
    //   205: dup_x1
    //   206: swap
    //   207: iconst_2
    //   208: swap
    //   209: aastore
    //   210: dup_x2
    //   211: dup_x2
    //   212: pop
    //   213: invokestatic valueOf : (J)Ljava/lang/Long;
    //   216: iconst_1
    //   217: swap
    //   218: aastore
    //   219: dup_x1
    //   220: swap
    //   221: iconst_0
    //   222: swap
    //   223: aastore
    //   224: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   227: aload #7
    //   229: aload #21
    //   231: iconst_2
    //   232: aaload
    //   233: aload_0
    //   234: getfield aegisguard_V : Z
    //   237: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   240: lload #4
    //   242: dup2_x1
    //   243: pop2
    //   244: iconst_3
    //   245: anewarray java/lang/Object
    //   248: dup_x1
    //   249: swap
    //   250: iconst_2
    //   251: swap
    //   252: aastore
    //   253: dup_x2
    //   254: dup_x2
    //   255: pop
    //   256: invokestatic valueOf : (J)Ljava/lang/Long;
    //   259: iconst_1
    //   260: swap
    //   261: aastore
    //   262: dup_x1
    //   263: swap
    //   264: iconst_0
    //   265: swap
    //   266: aastore
    //   267: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   270: aload_0
    //   271: getfield aegisguard_j : Ljava/util/List;
    //   274: invokeinterface isEmpty : ()Z
    //   279: ifne -> 1624
    //   282: new java/util/ArrayList
    //   285: dup
    //   286: invokespecial <init> : ()V
    //   289: astore #8
    //   291: aload_0
    //   292: getfield aegisguard_j : Ljava/util/List;
    //   295: invokeinterface iterator : ()Ljava/util/Iterator;
    //   300: astore #9
    //   302: aload #9
    //   304: invokeinterface hasNext : ()Z
    //   309: ifeq -> 1569
    //   312: aload #9
    //   314: invokeinterface next : ()Ljava/lang/Object;
    //   319: checkcast me/frep/aegisguard/spigot/aegisguard_hD
    //   322: astore #10
    //   324: new me/frep/aegisguard/spigot/aegisguard_Xi
    //   327: dup
    //   328: aload_0
    //   329: aconst_null
    //   330: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_hk;Lme/frep/aegisguard/spigot/aegisguard_Xx;)V
    //   333: astore #11
    //   335: aload #11
    //   337: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   340: bipush #26
    //   342: aaload
    //   343: aload #10
    //   345: iconst_0
    //   346: anewarray java/lang/Object
    //   349: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Ljava/lang/String;
    //   352: lload #4
    //   354: dup2_x1
    //   355: pop2
    //   356: iconst_3
    //   357: anewarray java/lang/Object
    //   360: dup_x1
    //   361: swap
    //   362: iconst_2
    //   363: swap
    //   364: aastore
    //   365: dup_x2
    //   366: dup_x2
    //   367: pop
    //   368: invokestatic valueOf : (J)Ljava/lang/Long;
    //   371: iconst_1
    //   372: swap
    //   373: aastore
    //   374: dup_x1
    //   375: swap
    //   376: iconst_0
    //   377: swap
    //   378: aastore
    //   379: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   382: aload #11
    //   384: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   387: iconst_0
    //   388: aaload
    //   389: aload #10
    //   391: iconst_0
    //   392: anewarray java/lang/Object
    //   395: invokevirtual aegisguard_p : ([Ljava/lang/Object;)Ljava/lang/String;
    //   398: lload #4
    //   400: dup2_x1
    //   401: pop2
    //   402: iconst_3
    //   403: anewarray java/lang/Object
    //   406: dup_x1
    //   407: swap
    //   408: iconst_2
    //   409: swap
    //   410: aastore
    //   411: dup_x2
    //   412: dup_x2
    //   413: pop
    //   414: invokestatic valueOf : (J)Ljava/lang/Long;
    //   417: iconst_1
    //   418: swap
    //   419: aastore
    //   420: dup_x1
    //   421: swap
    //   422: iconst_0
    //   423: swap
    //   424: aastore
    //   425: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   428: aload #11
    //   430: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   433: bipush #6
    //   435: aaload
    //   436: aload #10
    //   438: iconst_0
    //   439: anewarray java/lang/Object
    //   442: invokevirtual aegisguard_G : ([Ljava/lang/Object;)Ljava/lang/String;
    //   445: lload #4
    //   447: dup2_x1
    //   448: pop2
    //   449: iconst_3
    //   450: anewarray java/lang/Object
    //   453: dup_x1
    //   454: swap
    //   455: iconst_2
    //   456: swap
    //   457: aastore
    //   458: dup_x2
    //   459: dup_x2
    //   460: pop
    //   461: invokestatic valueOf : (J)Ljava/lang/Long;
    //   464: iconst_1
    //   465: swap
    //   466: aastore
    //   467: dup_x1
    //   468: swap
    //   469: iconst_0
    //   470: swap
    //   471: aastore
    //   472: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   475: aload #6
    //   477: ifnull -> 1624
    //   480: aload #10
    //   482: aload #6
    //   484: lload_2
    //   485: lconst_0
    //   486: lcmp
    //   487: ifle -> 614
    //   490: ifnull -> 610
    //   493: goto -> 500
    //   496: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   499: athrow
    //   500: iconst_0
    //   501: anewarray java/lang/Object
    //   504: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/awt/Color;
    //   507: ifnull -> 608
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   516: athrow
    //   517: aload #10
    //   519: iconst_0
    //   520: anewarray java/lang/Object
    //   523: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/awt/Color;
    //   526: astore #12
    //   528: aload #12
    //   530: invokevirtual getRed : ()I
    //   533: istore #13
    //   535: iload #13
    //   537: bipush #8
    //   539: ishl
    //   540: aload #12
    //   542: invokevirtual getGreen : ()I
    //   545: iadd
    //   546: istore #13
    //   548: iload #13
    //   550: bipush #8
    //   552: ishl
    //   553: aload #12
    //   555: invokevirtual getBlue : ()I
    //   558: iadd
    //   559: istore #13
    //   561: aload #11
    //   563: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   566: astore #21
    //   568: aload #21
    //   570: bipush #7
    //   572: aaload
    //   573: iload #13
    //   575: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   578: lload #4
    //   580: dup2_x1
    //   581: pop2
    //   582: iconst_3
    //   583: anewarray java/lang/Object
    //   586: dup_x1
    //   587: swap
    //   588: iconst_2
    //   589: swap
    //   590: aastore
    //   591: dup_x2
    //   592: dup_x2
    //   593: pop
    //   594: invokestatic valueOf : (J)Ljava/lang/Long;
    //   597: iconst_1
    //   598: swap
    //   599: aastore
    //   600: dup_x1
    //   601: swap
    //   602: iconst_0
    //   603: swap
    //   604: aastore
    //   605: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   608: aload #10
    //   610: iconst_0
    //   611: anewarray java/lang/Object
    //   614: invokevirtual aegisguard_q : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XD;
    //   617: astore #12
    //   619: aload #10
    //   621: iconst_0
    //   622: anewarray java/lang/Object
    //   625: invokevirtual aegisguard_z : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Xh;
    //   628: astore #13
    //   630: aload #10
    //   632: iconst_0
    //   633: anewarray java/lang/Object
    //   636: invokevirtual aegisguard_R : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ku;
    //   639: astore #14
    //   641: aload #10
    //   643: iconst_0
    //   644: anewarray java/lang/Object
    //   647: invokevirtual aegisguard_K : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hv;
    //   650: astore #15
    //   652: aload #10
    //   654: iconst_0
    //   655: anewarray java/lang/Object
    //   658: invokevirtual aegisguard_k : ([Ljava/lang/Object;)Ljava/util/List;
    //   661: astore #16
    //   663: aload #12
    //   665: ifnull -> 823
    //   668: new me/frep/aegisguard/spigot/aegisguard_Xi
    //   671: dup
    //   672: aload_0
    //   673: aconst_null
    //   674: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_hk;Lme/frep/aegisguard/spigot/aegisguard_Xx;)V
    //   677: astore #17
    //   679: aload #17
    //   681: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   684: astore #21
    //   686: aload #21
    //   688: bipush #18
    //   690: aaload
    //   691: aload #12
    //   693: iconst_1
    //   694: anewarray java/lang/Object
    //   697: dup_x1
    //   698: swap
    //   699: iconst_0
    //   700: swap
    //   701: aastore
    //   702: invokestatic aegisguard_U : ([Ljava/lang/Object;)Ljava/lang/String;
    //   705: lload #4
    //   707: dup2_x1
    //   708: pop2
    //   709: iconst_3
    //   710: anewarray java/lang/Object
    //   713: dup_x1
    //   714: swap
    //   715: iconst_2
    //   716: swap
    //   717: aastore
    //   718: dup_x2
    //   719: dup_x2
    //   720: pop
    //   721: invokestatic valueOf : (J)Ljava/lang/Long;
    //   724: iconst_1
    //   725: swap
    //   726: aastore
    //   727: dup_x1
    //   728: swap
    //   729: iconst_0
    //   730: swap
    //   731: aastore
    //   732: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   735: aload #17
    //   737: aload #21
    //   739: bipush #27
    //   741: aaload
    //   742: aload #12
    //   744: iconst_1
    //   745: anewarray java/lang/Object
    //   748: dup_x1
    //   749: swap
    //   750: iconst_0
    //   751: swap
    //   752: aastore
    //   753: invokestatic aegisguard_b : ([Ljava/lang/Object;)Ljava/lang/String;
    //   756: lload #4
    //   758: dup2_x1
    //   759: pop2
    //   760: iconst_3
    //   761: anewarray java/lang/Object
    //   764: dup_x1
    //   765: swap
    //   766: iconst_2
    //   767: swap
    //   768: aastore
    //   769: dup_x2
    //   770: dup_x2
    //   771: pop
    //   772: invokestatic valueOf : (J)Ljava/lang/Long;
    //   775: iconst_1
    //   776: swap
    //   777: aastore
    //   778: dup_x1
    //   779: swap
    //   780: iconst_0
    //   781: swap
    //   782: aastore
    //   783: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   786: aload #11
    //   788: aload #21
    //   790: bipush #14
    //   792: aaload
    //   793: lload #4
    //   795: aload #17
    //   797: iconst_3
    //   798: anewarray java/lang/Object
    //   801: dup_x1
    //   802: swap
    //   803: iconst_2
    //   804: swap
    //   805: aastore
    //   806: dup_x2
    //   807: dup_x2
    //   808: pop
    //   809: invokestatic valueOf : (J)Ljava/lang/Long;
    //   812: iconst_1
    //   813: swap
    //   814: aastore
    //   815: dup_x1
    //   816: swap
    //   817: iconst_0
    //   818: swap
    //   819: aastore
    //   820: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   823: aload #13
    //   825: ifnull -> 931
    //   828: new me/frep/aegisguard/spigot/aegisguard_Xi
    //   831: dup
    //   832: aload_0
    //   833: aconst_null
    //   834: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_hk;Lme/frep/aegisguard/spigot/aegisguard_Xx;)V
    //   837: astore #17
    //   839: aload #17
    //   841: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   844: astore #21
    //   846: aload #21
    //   848: bipush #9
    //   850: aaload
    //   851: aload #13
    //   853: iconst_1
    //   854: anewarray java/lang/Object
    //   857: dup_x1
    //   858: swap
    //   859: iconst_0
    //   860: swap
    //   861: aastore
    //   862: invokestatic aegisguard_W : ([Ljava/lang/Object;)Ljava/lang/String;
    //   865: lload #4
    //   867: dup2_x1
    //   868: pop2
    //   869: iconst_3
    //   870: anewarray java/lang/Object
    //   873: dup_x1
    //   874: swap
    //   875: iconst_2
    //   876: swap
    //   877: aastore
    //   878: dup_x2
    //   879: dup_x2
    //   880: pop
    //   881: invokestatic valueOf : (J)Ljava/lang/Long;
    //   884: iconst_1
    //   885: swap
    //   886: aastore
    //   887: dup_x1
    //   888: swap
    //   889: iconst_0
    //   890: swap
    //   891: aastore
    //   892: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   895: aload #11
    //   897: aload #21
    //   899: iconst_1
    //   900: aaload
    //   901: lload #4
    //   903: aload #17
    //   905: iconst_3
    //   906: anewarray java/lang/Object
    //   909: dup_x1
    //   910: swap
    //   911: iconst_2
    //   912: swap
    //   913: aastore
    //   914: dup_x2
    //   915: dup_x2
    //   916: pop
    //   917: invokestatic valueOf : (J)Ljava/lang/Long;
    //   920: iconst_1
    //   921: swap
    //   922: aastore
    //   923: dup_x1
    //   924: swap
    //   925: iconst_0
    //   926: swap
    //   927: aastore
    //   928: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   931: aload #14
    //   933: ifnull -> 1039
    //   936: new me/frep/aegisguard/spigot/aegisguard_Xi
    //   939: dup
    //   940: aload_0
    //   941: aconst_null
    //   942: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_hk;Lme/frep/aegisguard/spigot/aegisguard_Xx;)V
    //   945: astore #17
    //   947: aload #17
    //   949: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   952: astore #21
    //   954: aload #21
    //   956: bipush #9
    //   958: aaload
    //   959: aload #14
    //   961: iconst_1
    //   962: anewarray java/lang/Object
    //   965: dup_x1
    //   966: swap
    //   967: iconst_0
    //   968: swap
    //   969: aastore
    //   970: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   973: lload #4
    //   975: dup2_x1
    //   976: pop2
    //   977: iconst_3
    //   978: anewarray java/lang/Object
    //   981: dup_x1
    //   982: swap
    //   983: iconst_2
    //   984: swap
    //   985: aastore
    //   986: dup_x2
    //   987: dup_x2
    //   988: pop
    //   989: invokestatic valueOf : (J)Ljava/lang/Long;
    //   992: iconst_1
    //   993: swap
    //   994: aastore
    //   995: dup_x1
    //   996: swap
    //   997: iconst_0
    //   998: swap
    //   999: aastore
    //   1000: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1003: aload #11
    //   1005: aload #21
    //   1007: iconst_3
    //   1008: aaload
    //   1009: lload #4
    //   1011: aload #17
    //   1013: iconst_3
    //   1014: anewarray java/lang/Object
    //   1017: dup_x1
    //   1018: swap
    //   1019: iconst_2
    //   1020: swap
    //   1021: aastore
    //   1022: dup_x2
    //   1023: dup_x2
    //   1024: pop
    //   1025: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1028: iconst_1
    //   1029: swap
    //   1030: aastore
    //   1031: dup_x1
    //   1032: swap
    //   1033: iconst_0
    //   1034: swap
    //   1035: aastore
    //   1036: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1039: aload #15
    //   1041: ifnull -> 1250
    //   1044: new me/frep/aegisguard/spigot/aegisguard_Xi
    //   1047: dup
    //   1048: aload_0
    //   1049: aconst_null
    //   1050: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_hk;Lme/frep/aegisguard/spigot/aegisguard_Xx;)V
    //   1053: astore #17
    //   1055: aload #17
    //   1057: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   1060: astore #21
    //   1062: aload #21
    //   1064: bipush #25
    //   1066: aaload
    //   1067: aload #15
    //   1069: iconst_1
    //   1070: anewarray java/lang/Object
    //   1073: dup_x1
    //   1074: swap
    //   1075: iconst_0
    //   1076: swap
    //   1077: aastore
    //   1078: invokestatic aegisguard_w : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1081: lload #4
    //   1083: dup2_x1
    //   1084: pop2
    //   1085: iconst_3
    //   1086: anewarray java/lang/Object
    //   1089: dup_x1
    //   1090: swap
    //   1091: iconst_2
    //   1092: swap
    //   1093: aastore
    //   1094: dup_x2
    //   1095: dup_x2
    //   1096: pop
    //   1097: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1100: iconst_1
    //   1101: swap
    //   1102: aastore
    //   1103: dup_x1
    //   1104: swap
    //   1105: iconst_0
    //   1106: swap
    //   1107: aastore
    //   1108: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1111: aload #17
    //   1113: aload #21
    //   1115: bipush #9
    //   1117: aaload
    //   1118: aload #15
    //   1120: iconst_1
    //   1121: anewarray java/lang/Object
    //   1124: dup_x1
    //   1125: swap
    //   1126: iconst_0
    //   1127: swap
    //   1128: aastore
    //   1129: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1132: lload #4
    //   1134: dup2_x1
    //   1135: pop2
    //   1136: iconst_3
    //   1137: anewarray java/lang/Object
    //   1140: dup_x1
    //   1141: swap
    //   1142: iconst_2
    //   1143: swap
    //   1144: aastore
    //   1145: dup_x2
    //   1146: dup_x2
    //   1147: pop
    //   1148: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1151: iconst_1
    //   1152: swap
    //   1153: aastore
    //   1154: dup_x1
    //   1155: swap
    //   1156: iconst_0
    //   1157: swap
    //   1158: aastore
    //   1159: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1162: aload #17
    //   1164: aload #21
    //   1166: bipush #23
    //   1168: aaload
    //   1169: aload #15
    //   1171: iconst_1
    //   1172: anewarray java/lang/Object
    //   1175: dup_x1
    //   1176: swap
    //   1177: iconst_0
    //   1178: swap
    //   1179: aastore
    //   1180: invokestatic aegisguard_C : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1183: lload #4
    //   1185: dup2_x1
    //   1186: pop2
    //   1187: iconst_3
    //   1188: anewarray java/lang/Object
    //   1191: dup_x1
    //   1192: swap
    //   1193: iconst_2
    //   1194: swap
    //   1195: aastore
    //   1196: dup_x2
    //   1197: dup_x2
    //   1198: pop
    //   1199: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1202: iconst_1
    //   1203: swap
    //   1204: aastore
    //   1205: dup_x1
    //   1206: swap
    //   1207: iconst_0
    //   1208: swap
    //   1209: aastore
    //   1210: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1213: aload #11
    //   1215: aload #21
    //   1217: bipush #24
    //   1219: aaload
    //   1220: lload #4
    //   1222: aload #17
    //   1224: iconst_3
    //   1225: anewarray java/lang/Object
    //   1228: dup_x1
    //   1229: swap
    //   1230: iconst_2
    //   1231: swap
    //   1232: aastore
    //   1233: dup_x2
    //   1234: dup_x2
    //   1235: pop
    //   1236: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1239: iconst_1
    //   1240: swap
    //   1241: aastore
    //   1242: dup_x1
    //   1243: swap
    //   1244: iconst_0
    //   1245: swap
    //   1246: aastore
    //   1247: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1250: new java/util/ArrayList
    //   1253: dup
    //   1254: invokespecial <init> : ()V
    //   1257: astore #17
    //   1259: aload #16
    //   1261: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1266: astore #18
    //   1268: aload #18
    //   1270: invokeinterface hasNext : ()Z
    //   1275: ifeq -> 1505
    //   1278: aload #18
    //   1280: invokeinterface next : ()Ljava/lang/Object;
    //   1285: checkcast me/frep/aegisguard/spigot/aegisguard_T
    //   1288: astore #19
    //   1290: new me/frep/aegisguard/spigot/aegisguard_Xi
    //   1293: dup
    //   1294: aload_0
    //   1295: aconst_null
    //   1296: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_hk;Lme/frep/aegisguard/spigot/aegisguard_Xx;)V
    //   1299: astore #20
    //   1301: aload #20
    //   1303: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   1306: bipush #21
    //   1308: aaload
    //   1309: aload #19
    //   1311: iconst_1
    //   1312: anewarray java/lang/Object
    //   1315: dup_x1
    //   1316: swap
    //   1317: iconst_0
    //   1318: swap
    //   1319: aastore
    //   1320: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1323: lload #4
    //   1325: dup2_x1
    //   1326: pop2
    //   1327: iconst_3
    //   1328: anewarray java/lang/Object
    //   1331: dup_x1
    //   1332: swap
    //   1333: iconst_2
    //   1334: swap
    //   1335: aastore
    //   1336: dup_x2
    //   1337: dup_x2
    //   1338: pop
    //   1339: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1342: iconst_1
    //   1343: swap
    //   1344: aastore
    //   1345: dup_x1
    //   1346: swap
    //   1347: iconst_0
    //   1348: swap
    //   1349: aastore
    //   1350: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1353: aload #20
    //   1355: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   1358: iconst_5
    //   1359: aaload
    //   1360: aload #19
    //   1362: iconst_1
    //   1363: anewarray java/lang/Object
    //   1366: dup_x1
    //   1367: swap
    //   1368: iconst_0
    //   1369: swap
    //   1370: aastore
    //   1371: invokestatic aegisguard_e : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1374: lload #4
    //   1376: dup2_x1
    //   1377: pop2
    //   1378: iconst_3
    //   1379: anewarray java/lang/Object
    //   1382: dup_x1
    //   1383: swap
    //   1384: iconst_2
    //   1385: swap
    //   1386: aastore
    //   1387: dup_x2
    //   1388: dup_x2
    //   1389: pop
    //   1390: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1393: iconst_1
    //   1394: swap
    //   1395: aastore
    //   1396: dup_x1
    //   1397: swap
    //   1398: iconst_0
    //   1399: swap
    //   1400: aastore
    //   1401: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1404: aload #20
    //   1406: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   1409: bipush #17
    //   1411: aaload
    //   1412: aload #19
    //   1414: iconst_1
    //   1415: anewarray java/lang/Object
    //   1418: dup_x1
    //   1419: swap
    //   1420: iconst_0
    //   1421: swap
    //   1422: aastore
    //   1423: invokestatic aegisguard_n : ([Ljava/lang/Object;)Z
    //   1426: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1429: lload #4
    //   1431: dup2_x1
    //   1432: pop2
    //   1433: iconst_3
    //   1434: anewarray java/lang/Object
    //   1437: dup_x1
    //   1438: swap
    //   1439: iconst_2
    //   1440: swap
    //   1441: aastore
    //   1442: dup_x2
    //   1443: dup_x2
    //   1444: pop
    //   1445: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1448: iconst_1
    //   1449: swap
    //   1450: aastore
    //   1451: dup_x1
    //   1452: swap
    //   1453: iconst_0
    //   1454: swap
    //   1455: aastore
    //   1456: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1459: aload #17
    //   1461: aload #20
    //   1463: invokeinterface add : (Ljava/lang/Object;)Z
    //   1468: pop
    //   1469: aload #6
    //   1471: lload_2
    //   1472: lconst_0
    //   1473: lcmp
    //   1474: ifle -> 1566
    //   1477: ifnull -> 1564
    //   1480: aload #6
    //   1482: ifnonnull -> 1268
    //   1485: lload_2
    //   1486: lconst_0
    //   1487: lcmp
    //   1488: ifle -> 1469
    //   1491: goto -> 1498
    //   1494: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1497: athrow
    //   1498: iconst_3
    //   1499: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   1502: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   1505: aload #11
    //   1507: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   1510: astore #21
    //   1512: aload #21
    //   1514: bipush #8
    //   1516: aaload
    //   1517: aload #17
    //   1519: invokeinterface toArray : ()[Ljava/lang/Object;
    //   1524: lload #4
    //   1526: dup2_x1
    //   1527: pop2
    //   1528: iconst_3
    //   1529: anewarray java/lang/Object
    //   1532: dup_x1
    //   1533: swap
    //   1534: iconst_2
    //   1535: swap
    //   1536: aastore
    //   1537: dup_x2
    //   1538: dup_x2
    //   1539: pop
    //   1540: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1543: iconst_1
    //   1544: swap
    //   1545: aastore
    //   1546: dup_x1
    //   1547: swap
    //   1548: iconst_0
    //   1549: swap
    //   1550: aastore
    //   1551: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1554: aload #8
    //   1556: aload #11
    //   1558: invokeinterface add : (Ljava/lang/Object;)Z
    //   1563: pop
    //   1564: aload #6
    //   1566: ifnonnull -> 302
    //   1569: aload #7
    //   1571: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   1574: astore #21
    //   1576: lload_2
    //   1577: lconst_0
    //   1578: lcmp
    //   1579: iflt -> 319
    //   1582: aload #21
    //   1584: bipush #22
    //   1586: aaload
    //   1587: aload #8
    //   1589: invokeinterface toArray : ()[Ljava/lang/Object;
    //   1594: lload #4
    //   1596: dup2_x1
    //   1597: pop2
    //   1598: iconst_3
    //   1599: anewarray java/lang/Object
    //   1602: dup_x1
    //   1603: swap
    //   1604: iconst_2
    //   1605: swap
    //   1606: aastore
    //   1607: dup_x2
    //   1608: dup_x2
    //   1609: pop
    //   1610: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1613: iconst_1
    //   1614: swap
    //   1615: aastore
    //   1616: dup_x1
    //   1617: swap
    //   1618: iconst_0
    //   1619: swap
    //   1620: aastore
    //   1621: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1624: new java/net/URL
    //   1627: dup
    //   1628: aload_0
    //   1629: getfield aegisguard_Y : Ljava/lang/String;
    //   1632: invokespecial <init> : (Ljava/lang/String;)V
    //   1635: astore #8
    //   1637: aload #8
    //   1639: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   1642: checkcast javax/net/ssl/HttpsURLConnection
    //   1645: astore #9
    //   1647: aload #9
    //   1649: getstatic me/frep/aegisguard/spigot/aegisguard_hk.b : [Ljava/lang/String;
    //   1652: astore #21
    //   1654: aload #21
    //   1656: bipush #20
    //   1658: aaload
    //   1659: aload #21
    //   1661: bipush #13
    //   1663: aaload
    //   1664: invokevirtual addRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   1667: aload #9
    //   1669: aload #21
    //   1671: bipush #11
    //   1673: aaload
    //   1674: aload #21
    //   1676: bipush #15
    //   1678: aaload
    //   1679: invokevirtual addRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   1682: aload #9
    //   1684: iconst_1
    //   1685: invokevirtual setDoOutput : (Z)V
    //   1688: aload #9
    //   1690: aload #21
    //   1692: iconst_4
    //   1693: aaload
    //   1694: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   1697: aload #9
    //   1699: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   1702: astore #10
    //   1704: aload #10
    //   1706: aload #7
    //   1708: invokevirtual toString : ()Ljava/lang/String;
    //   1711: invokevirtual getBytes : ()[B
    //   1714: invokevirtual write : ([B)V
    //   1717: aload #10
    //   1719: invokevirtual flush : ()V
    //   1722: aload #10
    //   1724: invokevirtual close : ()V
    //   1727: aload #9
    //   1729: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   1732: invokevirtual close : ()V
    //   1735: aload #9
    //   1737: invokevirtual disconnect : ()V
    //   1740: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #51	-> 32
    //   #52	-> 70
    //   #55	-> 88
    //   #57	-> 99
    //   #58	-> 145
    //   #59	-> 186
    //   #60	-> 227
    //   #62	-> 270
    //   #63	-> 282
    //   #65	-> 291
    //   #66	-> 324
    //   #68	-> 335
    //   #69	-> 382
    //   #70	-> 428
    //   #72	-> 475
    //   #73	-> 517
    //   #74	-> 528
    //   #75	-> 535
    //   #76	-> 548
    //   #78	-> 561
    //   #81	-> 608
    //   #82	-> 619
    //   #83	-> 630
    //   #84	-> 641
    //   #85	-> 652
    //   #87	-> 663
    //   #88	-> 668
    //   #90	-> 679
    //   #91	-> 735
    //   #92	-> 786
    //   #95	-> 823
    //   #96	-> 828
    //   #98	-> 839
    //   #99	-> 895
    //   #102	-> 931
    //   #103	-> 936
    //   #105	-> 947
    //   #106	-> 1003
    //   #109	-> 1039
    //   #110	-> 1044
    //   #112	-> 1055
    //   #113	-> 1111
    //   #114	-> 1162
    //   #115	-> 1213
    //   #118	-> 1250
    //   #119	-> 1259
    //   #120	-> 1290
    //   #122	-> 1301
    //   #123	-> 1353
    //   #124	-> 1404
    //   #126	-> 1459
    //   #127	-> 1469
    //   #129	-> 1505
    //   #130	-> 1554
    //   #131	-> 1564
    //   #133	-> 1569
    //   #136	-> 1624
    //   #137	-> 1637
    //   #138	-> 1647
    //   #139	-> 1667
    //   #140	-> 1682
    //   #141	-> 1688
    //   #143	-> 1697
    //   #144	-> 1704
    //   #145	-> 1717
    //   #146	-> 1722
    //   #148	-> 1727
    //   #149	-> 1735
    //   #150	-> 1740
    // Exception table:
    //   from	to	target	type
    //   32	44	47	java/io/IOException
    //   38	52	55	java/io/IOException
    //   59	84	84	java/io/IOException
    //   335	493	496	java/io/IOException
    //   480	510	513	java/io/IOException
    //   1301	1485	1494	java/io/IOException
  }
  
  public static void aegisguard_w(String[] paramArrayOfString) {
    aegisguard_Q = paramArrayOfString;
  }
  
  public static String[] aegisguard_S() {
    return aegisguard_Q;
  }
  
  static {
    long l = a ^ 0x636020F1B33AL;
    aegisguard_w(new String[2]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[28];
    boolean bool = false;
    String str;
    int i = (str = "\013\020\023pW£tô8«\030UY7Å\b´\036´õ\bÿ;j?gÃ\037N\020\024YJ\001\002iZ¶-ºYìð\bµg\0137\025AH\bï\025Ó¡¸º\b¼·×¯ð\b.\022\bìú&îR\016 ê\b\033es¢B¡JÞ\b¼·×¯ð\b.\022\020+u\024\001Ü5kh×SÚL\003Í\020PÃok-B\024Ð3\nzË\027\017X\bÌ\0218û\030ÕÞïQ²\\õ ²©ßLúe\0266Æ}â\021Ð|\b®Ë2÷\034³ú\020ì\025Së¸7L=_Ã\005¡\017ë\020Jã\027,Û¥Øe>0Å\035 â\bøjÆ\024\036s\b¬ Ò\\_´0!£\033Ìá»È¦î\"rº¼ô³Ý¹´\025ö8ÀNÏ0e\016\004Á··ñ\004¹Î.Ö¾óCLÐµ\020EÙ-F\rYn\026j);$\bãÛ\bo3§AHtÉ\b\025 Sô\001Aõ.\020Wmô\025\030´ºj¨*H¢¸\bÄtezø\000\nT\bo3§AHtÉ").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
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
