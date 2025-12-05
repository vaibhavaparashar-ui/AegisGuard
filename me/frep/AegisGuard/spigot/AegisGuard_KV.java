package me.frep.aegisguard.spigot.AegisGuard_KV;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public final class aegisguard_KV {
  private static final long a = aegisguard_e.a(2432941973647626902L, -6776346764461861340L, MethodHandles.lookup().lookupClass()).a(263858255137316L);
  
  private static final String[] b;
  
  private aegisguard_KV() {
    throw new UnsupportedOperationException(b[9]);
  }
  
  public static void aegisguard_I(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    aegisguard_b0.aegisguard_f.clear();
    aegisguard_b0.aegisguard_L9.clear();
    aegisguard_b0.aegisguard_dS.clear();
    aegisguard_b0.aegisguard_dW.clear();
    aegisguard_b0.aegisguard_Lz.clear();
    aegisguard_b0.aegisguard_Le.clear();
    aegisguard_b0.aegisguard_Q.clear();
    aegisguard_b0.aegisguard_y8.clear();
    aegisguard_b0.aegisguard_yp.clear();
    aegisguard_b0.aegisguard_X.clear();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      aegisguard_b0.aegisguard_LN.clear();
      aegisguard_b0.aegisguard_yG.clear();
      aegisguard_b0.aegisguard_LJ.clear();
      aegisguard_b0.aegisguard_dH.clear();
      aegisguard_b0.aegisguard_MF.clear();
      aegisguard_b0.aegisguard_Gf.clear();
      aegisguard_b0.aegisguard_dr.clear();
      aegisguard_b0.aegisguard_yc.clear();
      aegisguard_b0.aegisguard_M8.clear();
      aegisguard_b0.aegisguard_LF.clear();
      if (AbstractCheck.aegisguard_B() == null)
        aegisguard_Xz.aegisguard_L(new AbstractCheck[2]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public static void aegisguard_z(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_1
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_KV.a : J
    //   15: lload_1
    //   16: lxor
    //   17: lstore_1
    //   18: getstatic me/frep/aegisguard/spigot/check/manager/CheckManager.aegisguard_Q : [Ljava/lang/Class;
    //   21: astore #4
    //   23: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   26: aload #4
    //   28: arraylength
    //   29: istore #5
    //   31: iconst_0
    //   32: istore #6
    //   34: astore_3
    //   35: iload #6
    //   37: iload #5
    //   39: if_icmpge -> 1888
    //   42: aload #4
    //   44: iload #6
    //   46: aaload
    //   47: astore #7
    //   49: aload #7
    //   51: ldc me/frep/aegisguard/spigot/check/api/CheckInfo
    //   53: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   56: checkcast me/frep/aegisguard/spigot/check/api/CheckInfo
    //   59: astore #8
    //   61: ldc ''
    //   63: astore #9
    //   65: aload #7
    //   67: invokevirtual getName : ()Ljava/lang/String;
    //   70: getstatic me/frep/aegisguard/spigot/aegisguard_KV.b : [Ljava/lang/String;
    //   73: bipush #12
    //   75: aaload
    //   76: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   79: aload_3
    //   80: lload_1
    //   81: lconst_0
    //   82: lcmp
    //   83: ifle -> 143
    //   86: ifnonnull -> 142
    //   89: ifeq -> 121
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   98: athrow
    //   99: getstatic me/frep/aegisguard/spigot/aegisguard_KV.b : [Ljava/lang/String;
    //   102: astore #38
    //   104: aload #38
    //   106: bipush #18
    //   108: aaload
    //   109: lload_1
    //   110: lconst_0
    //   111: lcmp
    //   112: iflt -> 237
    //   115: astore #9
    //   117: aload_3
    //   118: ifnull -> 230
    //   121: aload #7
    //   123: invokevirtual getName : ()Ljava/lang/String;
    //   126: getstatic me/frep/aegisguard/spigot/aegisguard_KV.b : [Ljava/lang/String;
    //   129: bipush #21
    //   131: aaload
    //   132: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   141: athrow
    //   142: aload_3
    //   143: ifnonnull -> 215
    //   146: ifeq -> 177
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   155: athrow
    //   156: getstatic me/frep/aegisguard/spigot/aegisguard_KV.b : [Ljava/lang/String;
    //   159: astore #38
    //   161: aload #38
    //   163: iconst_2
    //   164: aaload
    //   165: lload_1
    //   166: lconst_0
    //   167: lcmp
    //   168: ifle -> 237
    //   171: astore #9
    //   173: aload_3
    //   174: ifnull -> 230
    //   177: aload #7
    //   179: invokevirtual getName : ()Ljava/lang/String;
    //   182: lload_1
    //   183: lconst_0
    //   184: lcmp
    //   185: iflt -> 247
    //   188: getstatic me/frep/aegisguard/spigot/aegisguard_KV.b : [Ljava/lang/String;
    //   191: bipush #17
    //   193: aaload
    //   194: aload_3
    //   195: ifnonnull -> 239
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   204: athrow
    //   205: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   214: athrow
    //   215: ifeq -> 230
    //   218: getstatic me/frep/aegisguard/spigot/aegisguard_KV.b : [Ljava/lang/String;
    //   221: astore #38
    //   223: aload #38
    //   225: bipush #10
    //   227: aaload
    //   228: astore #9
    //   230: aload #8
    //   232: invokeinterface name : ()Ljava/lang/String;
    //   237: ldc ' '
    //   239: ldc ''
    //   241: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   244: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   247: astore #10
    //   249: aload #8
    //   251: invokeinterface type : ()C
    //   256: invokestatic toLowerCase : (C)C
    //   259: istore #11
    //   261: new java/lang/StringBuilder
    //   264: dup
    //   265: invokespecial <init> : ()V
    //   268: getstatic me/frep/aegisguard/spigot/aegisguard_KV.b : [Ljava/lang/String;
    //   271: astore #38
    //   273: aload #38
    //   275: bipush #11
    //   277: aaload
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: aload #9
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: ldc '.'
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: aload #10
    //   293: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: ldc '.'
    //   298: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: iload #11
    //   303: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   306: ldc '.'
    //   308: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: invokevirtual toString : ()Ljava/lang/String;
    //   314: astore #12
    //   316: new java/lang/StringBuilder
    //   319: dup
    //   320: invokespecial <init> : ()V
    //   323: aload #12
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: aload #38
    //   330: bipush #20
    //   332: aaload
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: invokevirtual toString : ()Ljava/lang/String;
    //   339: iconst_1
    //   340: anewarray java/lang/Object
    //   343: dup_x1
    //   344: swap
    //   345: iconst_0
    //   346: swap
    //   347: aastore
    //   348: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   351: istore #13
    //   353: new java/lang/StringBuilder
    //   356: dup
    //   357: invokespecial <init> : ()V
    //   360: aload #12
    //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: aload #38
    //   367: bipush #16
    //   369: aaload
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: invokevirtual toString : ()Ljava/lang/String;
    //   376: iconst_1
    //   377: anewarray java/lang/Object
    //   380: dup_x1
    //   381: swap
    //   382: iconst_0
    //   383: swap
    //   384: aastore
    //   385: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   388: istore #14
    //   390: new java/lang/StringBuilder
    //   393: dup
    //   394: invokespecial <init> : ()V
    //   397: aload #12
    //   399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: aload #38
    //   404: iconst_3
    //   405: aaload
    //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: invokevirtual toString : ()Ljava/lang/String;
    //   412: iconst_1
    //   413: anewarray java/lang/Object
    //   416: dup_x1
    //   417: swap
    //   418: iconst_0
    //   419: swap
    //   420: aastore
    //   421: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   424: istore #15
    //   426: new java/lang/StringBuilder
    //   429: dup
    //   430: invokespecial <init> : ()V
    //   433: aload #12
    //   435: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: aload #38
    //   440: iconst_1
    //   441: aaload
    //   442: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: invokevirtual toString : ()Ljava/lang/String;
    //   448: iconst_1
    //   449: anewarray java/lang/Object
    //   452: dup_x1
    //   453: swap
    //   454: iconst_0
    //   455: swap
    //   456: aastore
    //   457: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   460: istore #16
    //   462: new java/lang/StringBuilder
    //   465: dup
    //   466: invokespecial <init> : ()V
    //   469: aload #12
    //   471: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: aload #38
    //   476: bipush #6
    //   478: aaload
    //   479: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: invokevirtual toString : ()Ljava/lang/String;
    //   485: iconst_1
    //   486: anewarray java/lang/Object
    //   489: dup_x1
    //   490: swap
    //   491: iconst_0
    //   492: swap
    //   493: aastore
    //   494: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   497: istore #17
    //   499: new java/lang/StringBuilder
    //   502: dup
    //   503: invokespecial <init> : ()V
    //   506: aload #12
    //   508: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: aload #38
    //   513: iconst_4
    //   514: aaload
    //   515: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   518: invokevirtual toString : ()Ljava/lang/String;
    //   521: iconst_1
    //   522: anewarray java/lang/Object
    //   525: dup_x1
    //   526: swap
    //   527: iconst_0
    //   528: swap
    //   529: aastore
    //   530: invokestatic aegisguard_G : ([Ljava/lang/Object;)D
    //   533: dstore #18
    //   535: new java/lang/StringBuilder
    //   538: dup
    //   539: invokespecial <init> : ()V
    //   542: aload #12
    //   544: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   547: aload #38
    //   549: bipush #8
    //   551: aaload
    //   552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: invokevirtual toString : ()Ljava/lang/String;
    //   558: iconst_1
    //   559: anewarray java/lang/Object
    //   562: dup_x1
    //   563: swap
    //   564: iconst_0
    //   565: swap
    //   566: aastore
    //   567: invokestatic aegisguard_U : ([Ljava/lang/Object;)Ljava/util/List;
    //   570: astore #20
    //   572: new java/lang/StringBuilder
    //   575: dup
    //   576: invokespecial <init> : ()V
    //   579: aload #12
    //   581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: aload #38
    //   586: bipush #19
    //   588: aaload
    //   589: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   592: invokevirtual toString : ()Ljava/lang/String;
    //   595: iconst_1
    //   596: anewarray java/lang/Object
    //   599: dup_x1
    //   600: swap
    //   601: iconst_0
    //   602: swap
    //   603: aastore
    //   604: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   607: istore #21
    //   609: new java/lang/StringBuilder
    //   612: dup
    //   613: invokespecial <init> : ()V
    //   616: aload #12
    //   618: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: aload #38
    //   623: bipush #13
    //   625: aaload
    //   626: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   629: invokevirtual toString : ()Ljava/lang/String;
    //   632: iconst_1
    //   633: anewarray java/lang/Object
    //   636: dup_x1
    //   637: swap
    //   638: iconst_0
    //   639: swap
    //   640: aastore
    //   641: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   644: istore #22
    //   646: new java/lang/StringBuilder
    //   649: dup
    //   650: invokespecial <init> : ()V
    //   653: aload #12
    //   655: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   658: aload #38
    //   660: bipush #25
    //   662: aaload
    //   663: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: invokevirtual toString : ()Ljava/lang/String;
    //   669: iconst_1
    //   670: anewarray java/lang/Object
    //   673: dup_x1
    //   674: swap
    //   675: iconst_0
    //   676: swap
    //   677: aastore
    //   678: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   681: istore #23
    //   683: new java/lang/StringBuilder
    //   686: dup
    //   687: invokespecial <init> : ()V
    //   690: aload #12
    //   692: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   695: aload #38
    //   697: bipush #14
    //   699: aaload
    //   700: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   703: invokevirtual toString : ()Ljava/lang/String;
    //   706: iconst_1
    //   707: anewarray java/lang/Object
    //   710: dup_x1
    //   711: swap
    //   712: iconst_0
    //   713: swap
    //   714: aastore
    //   715: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   718: istore #24
    //   720: new java/lang/StringBuilder
    //   723: dup
    //   724: invokespecial <init> : ()V
    //   727: aload #12
    //   729: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   732: aload #38
    //   734: bipush #22
    //   736: aaload
    //   737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: invokevirtual toString : ()Ljava/lang/String;
    //   743: iconst_1
    //   744: anewarray java/lang/Object
    //   747: dup_x1
    //   748: swap
    //   749: iconst_0
    //   750: swap
    //   751: aastore
    //   752: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   755: istore #25
    //   757: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   760: aload #7
    //   762: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   765: iload #13
    //   767: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   770: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   775: pop
    //   776: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dS : Ljava/util/Map;
    //   779: aload #7
    //   781: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   784: iload #14
    //   786: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   789: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   794: pop
    //   795: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lz : Ljava/util/Map;
    //   798: aload #7
    //   800: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   803: iload #15
    //   805: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   808: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   813: pop
    //   814: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dW : Ljava/util/Map;
    //   817: aload #7
    //   819: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   822: iload #16
    //   824: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   827: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   832: pop
    //   833: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lg : Ljava/util/Map;
    //   836: aload #7
    //   838: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   841: iload #17
    //   843: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   846: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   851: pop
    //   852: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MB : Ljava/util/Map;
    //   855: aload #7
    //   857: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   860: dload #18
    //   862: invokestatic valueOf : (D)Ljava/lang/Double;
    //   865: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   870: pop
    //   871: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Le : Ljava/util/Map;
    //   874: aload #7
    //   876: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   879: aload #20
    //   881: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   886: pop
    //   887: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Q : Ljava/util/Map;
    //   890: aload #7
    //   892: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   895: iload #21
    //   897: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   900: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   905: pop
    //   906: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_y8 : Ljava/util/Map;
    //   909: aload #7
    //   911: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   914: iload #22
    //   916: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   919: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   924: pop
    //   925: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yp : Ljava/util/Map;
    //   928: aload #7
    //   930: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   933: iload #23
    //   935: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   938: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   943: pop
    //   944: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_M8 : Ljava/util/Map;
    //   947: aload #7
    //   949: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   952: iload #24
    //   954: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   957: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   962: pop
    //   963: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LF : Ljava/util/Map;
    //   966: aload #7
    //   968: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   971: iload #25
    //   973: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   976: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   981: pop
    //   982: new java/lang/StringBuilder
    //   985: dup
    //   986: invokespecial <init> : ()V
    //   989: aload #12
    //   991: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   994: aload #38
    //   996: bipush #28
    //   998: aaload
    //   999: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1002: invokevirtual toString : ()Ljava/lang/String;
    //   1005: iconst_1
    //   1006: anewarray java/lang/Object
    //   1009: dup_x1
    //   1010: swap
    //   1011: iconst_0
    //   1012: swap
    //   1013: aastore
    //   1014: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   1017: istore #26
    //   1019: new java/lang/StringBuilder
    //   1022: dup
    //   1023: invokespecial <init> : ()V
    //   1026: aload #12
    //   1028: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1031: aload #38
    //   1033: iconst_5
    //   1034: aaload
    //   1035: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1038: invokevirtual toString : ()Ljava/lang/String;
    //   1041: iconst_1
    //   1042: anewarray java/lang/Object
    //   1045: dup_x1
    //   1046: swap
    //   1047: iconst_0
    //   1048: swap
    //   1049: aastore
    //   1050: invokestatic aegisguard_G : ([Ljava/lang/Object;)D
    //   1053: dstore #27
    //   1055: new java/lang/StringBuilder
    //   1058: dup
    //   1059: invokespecial <init> : ()V
    //   1062: aload #12
    //   1064: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1067: aload #38
    //   1069: iconst_0
    //   1070: aaload
    //   1071: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1074: invokevirtual toString : ()Ljava/lang/String;
    //   1077: iconst_1
    //   1078: anewarray java/lang/Object
    //   1081: dup_x1
    //   1082: swap
    //   1083: iconst_0
    //   1084: swap
    //   1085: aastore
    //   1086: invokestatic aegisguard_G : ([Ljava/lang/Object;)D
    //   1089: dstore #29
    //   1091: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_X : Ljava/util/Map;
    //   1094: aload #7
    //   1096: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1099: iload #26
    //   1101: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1104: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1109: pop
    //   1110: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yG : Ljava/util/Map;
    //   1113: aload #7
    //   1115: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1118: dload #27
    //   1120: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1123: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1128: pop
    //   1129: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LN : Ljava/util/Map;
    //   1132: aload #7
    //   1134: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1137: dload #29
    //   1139: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1142: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1147: pop
    //   1148: new java/lang/StringBuilder
    //   1151: dup
    //   1152: invokespecial <init> : ()V
    //   1155: aload #12
    //   1157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1160: aload #38
    //   1162: bipush #7
    //   1164: aaload
    //   1165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1168: invokevirtual toString : ()Ljava/lang/String;
    //   1171: iconst_1
    //   1172: anewarray java/lang/Object
    //   1175: dup_x1
    //   1176: swap
    //   1177: iconst_0
    //   1178: swap
    //   1179: aastore
    //   1180: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   1183: istore #31
    //   1185: new java/lang/StringBuilder
    //   1188: dup
    //   1189: invokespecial <init> : ()V
    //   1192: aload #12
    //   1194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1197: aload #38
    //   1199: bipush #26
    //   1201: aaload
    //   1202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1205: invokevirtual toString : ()Ljava/lang/String;
    //   1208: iconst_1
    //   1209: anewarray java/lang/Object
    //   1212: dup_x1
    //   1213: swap
    //   1214: iconst_0
    //   1215: swap
    //   1216: aastore
    //   1217: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   1220: istore #32
    //   1222: new java/lang/StringBuilder
    //   1225: dup
    //   1226: invokespecial <init> : ()V
    //   1229: aload #12
    //   1231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1234: aload #38
    //   1236: bipush #24
    //   1238: aaload
    //   1239: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1242: invokevirtual toString : ()Ljava/lang/String;
    //   1245: iconst_1
    //   1246: anewarray java/lang/Object
    //   1249: dup_x1
    //   1250: swap
    //   1251: iconst_0
    //   1252: swap
    //   1253: aastore
    //   1254: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   1257: istore #33
    //   1259: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LJ : Ljava/util/Map;
    //   1262: aload #7
    //   1264: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1267: iload #31
    //   1269: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1272: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1277: pop
    //   1278: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dH : Ljava/util/Map;
    //   1281: aload #7
    //   1283: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1286: iload #32
    //   1288: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1291: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1296: pop
    //   1297: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MF : Ljava/util/Map;
    //   1300: aload #7
    //   1302: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1305: iload #33
    //   1307: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1310: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1315: pop
    //   1316: new java/lang/StringBuilder
    //   1319: dup
    //   1320: invokespecial <init> : ()V
    //   1323: aload #12
    //   1325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1328: aload #38
    //   1330: bipush #27
    //   1332: aaload
    //   1333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1336: invokevirtual toString : ()Ljava/lang/String;
    //   1339: iconst_1
    //   1340: anewarray java/lang/Object
    //   1343: dup_x1
    //   1344: swap
    //   1345: iconst_0
    //   1346: swap
    //   1347: aastore
    //   1348: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   1351: istore #34
    //   1353: new java/lang/StringBuilder
    //   1356: dup
    //   1357: invokespecial <init> : ()V
    //   1360: aload #12
    //   1362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1365: aload #38
    //   1367: bipush #15
    //   1369: aaload
    //   1370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1373: invokevirtual toString : ()Ljava/lang/String;
    //   1376: iconst_1
    //   1377: anewarray java/lang/Object
    //   1380: dup_x1
    //   1381: swap
    //   1382: iconst_0
    //   1383: swap
    //   1384: aastore
    //   1385: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   1388: istore #35
    //   1390: new java/lang/StringBuilder
    //   1393: dup
    //   1394: invokespecial <init> : ()V
    //   1397: aload #12
    //   1399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1402: aload #38
    //   1404: bipush #23
    //   1406: aaload
    //   1407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1410: invokevirtual toString : ()Ljava/lang/String;
    //   1413: iconst_1
    //   1414: anewarray java/lang/Object
    //   1417: dup_x1
    //   1418: swap
    //   1419: iconst_0
    //   1420: swap
    //   1421: aastore
    //   1422: invokestatic aegisguard_U : ([Ljava/lang/Object;)I
    //   1425: istore #36
    //   1427: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gf : Ljava/util/Map;
    //   1430: aload #7
    //   1432: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1435: iload #34
    //   1437: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1440: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1445: pop
    //   1446: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dr : Ljava/util/Map;
    //   1449: aload #7
    //   1451: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1454: iload #35
    //   1456: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1459: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1464: pop
    //   1465: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yc : Ljava/util/Map;
    //   1468: aload #7
    //   1470: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1473: iload #36
    //   1475: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1478: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1483: pop
    //   1484: aload_3
    //   1485: lload_1
    //   1486: lconst_0
    //   1487: lcmp
    //   1488: iflt -> 1885
    //   1491: ifnonnull -> 1884
    //   1494: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L_ : Z
    //   1497: ifeq -> 1881
    //   1500: goto -> 1507
    //   1503: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1506: athrow
    //   1507: new me/frep/aegisguard/spigot/check/data/CheckData
    //   1510: dup
    //   1511: aload #7
    //   1513: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1516: invokespecial <init> : (Ljava/lang/String;)V
    //   1519: astore #37
    //   1521: aload #37
    //   1523: iload #13
    //   1525: iconst_1
    //   1526: anewarray java/lang/Object
    //   1529: dup_x1
    //   1530: swap
    //   1531: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1534: iconst_0
    //   1535: swap
    //   1536: aastore
    //   1537: invokevirtual aegisguard_g : ([Ljava/lang/Object;)V
    //   1540: aload #37
    //   1542: iload #21
    //   1544: iconst_1
    //   1545: anewarray java/lang/Object
    //   1548: dup_x1
    //   1549: swap
    //   1550: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1553: iconst_0
    //   1554: swap
    //   1555: aastore
    //   1556: invokevirtual aegisguard_J : ([Ljava/lang/Object;)V
    //   1559: aload #37
    //   1561: iload #22
    //   1563: iconst_1
    //   1564: anewarray java/lang/Object
    //   1567: dup_x1
    //   1568: swap
    //   1569: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1572: iconst_0
    //   1573: swap
    //   1574: aastore
    //   1575: invokevirtual aegisguard_P : ([Ljava/lang/Object;)V
    //   1578: aload #37
    //   1580: iload #31
    //   1582: iconst_1
    //   1583: anewarray java/lang/Object
    //   1586: dup_x1
    //   1587: swap
    //   1588: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1591: iconst_0
    //   1592: swap
    //   1593: aastore
    //   1594: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   1597: aload #37
    //   1599: iload #34
    //   1601: iconst_1
    //   1602: anewarray java/lang/Object
    //   1605: dup_x1
    //   1606: swap
    //   1607: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1610: iconst_0
    //   1611: swap
    //   1612: aastore
    //   1613: invokevirtual aegisguard_L : ([Ljava/lang/Object;)V
    //   1616: aload #37
    //   1618: iload #14
    //   1620: iconst_1
    //   1621: anewarray java/lang/Object
    //   1624: dup_x1
    //   1625: swap
    //   1626: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1629: iconst_0
    //   1630: swap
    //   1631: aastore
    //   1632: invokevirtual aegisguard__ : ([Ljava/lang/Object;)V
    //   1635: aload #37
    //   1637: iload #16
    //   1639: iconst_1
    //   1640: anewarray java/lang/Object
    //   1643: dup_x1
    //   1644: swap
    //   1645: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1648: iconst_0
    //   1649: swap
    //   1650: aastore
    //   1651: invokevirtual aegisguard_s : ([Ljava/lang/Object;)V
    //   1654: aload #37
    //   1656: iload #15
    //   1658: iconst_1
    //   1659: anewarray java/lang/Object
    //   1662: dup_x1
    //   1663: swap
    //   1664: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1667: iconst_0
    //   1668: swap
    //   1669: aastore
    //   1670: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   1673: aload #37
    //   1675: iload #17
    //   1677: iconst_1
    //   1678: anewarray java/lang/Object
    //   1681: dup_x1
    //   1682: swap
    //   1683: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1686: iconst_0
    //   1687: swap
    //   1688: aastore
    //   1689: invokevirtual aegisguard_v : ([Ljava/lang/Object;)V
    //   1692: aload #37
    //   1694: iload #36
    //   1696: iconst_1
    //   1697: anewarray java/lang/Object
    //   1700: dup_x1
    //   1701: swap
    //   1702: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1705: iconst_0
    //   1706: swap
    //   1707: aastore
    //   1708: invokevirtual aegisguard_m : ([Ljava/lang/Object;)V
    //   1711: aload #37
    //   1713: iload #35
    //   1715: iconst_1
    //   1716: anewarray java/lang/Object
    //   1719: dup_x1
    //   1720: swap
    //   1721: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1724: iconst_0
    //   1725: swap
    //   1726: aastore
    //   1727: invokevirtual aegisguard_R : ([Ljava/lang/Object;)V
    //   1730: aload #37
    //   1732: iload #32
    //   1734: iconst_1
    //   1735: anewarray java/lang/Object
    //   1738: dup_x1
    //   1739: swap
    //   1740: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1743: iconst_0
    //   1744: swap
    //   1745: aastore
    //   1746: invokevirtual aegisguard_E : ([Ljava/lang/Object;)V
    //   1749: aload #37
    //   1751: iload #33
    //   1753: iconst_1
    //   1754: anewarray java/lang/Object
    //   1757: dup_x1
    //   1758: swap
    //   1759: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1762: iconst_0
    //   1763: swap
    //   1764: aastore
    //   1765: invokevirtual aegisguard_z : ([Ljava/lang/Object;)V
    //   1768: aload #37
    //   1770: dload #18
    //   1772: iconst_1
    //   1773: anewarray java/lang/Object
    //   1776: dup_x2
    //   1777: dup_x2
    //   1778: pop
    //   1779: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1782: iconst_0
    //   1783: swap
    //   1784: aastore
    //   1785: invokevirtual aegisguard_N : ([Ljava/lang/Object;)V
    //   1788: aload #37
    //   1790: iload #26
    //   1792: i2d
    //   1793: iconst_1
    //   1794: anewarray java/lang/Object
    //   1797: dup_x2
    //   1798: dup_x2
    //   1799: pop
    //   1800: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1803: iconst_0
    //   1804: swap
    //   1805: aastore
    //   1806: invokevirtual aegisguard_x : ([Ljava/lang/Object;)V
    //   1809: aload #37
    //   1811: dload #29
    //   1813: iconst_1
    //   1814: anewarray java/lang/Object
    //   1817: dup_x2
    //   1818: dup_x2
    //   1819: pop
    //   1820: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1823: iconst_0
    //   1824: swap
    //   1825: aastore
    //   1826: invokevirtual aegisguard_A : ([Ljava/lang/Object;)V
    //   1829: aload #37
    //   1831: dload #27
    //   1833: iconst_1
    //   1834: anewarray java/lang/Object
    //   1837: dup_x2
    //   1838: dup_x2
    //   1839: pop
    //   1840: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1843: iconst_0
    //   1844: swap
    //   1845: aastore
    //   1846: invokevirtual aegisguard_T : ([Ljava/lang/Object;)V
    //   1849: aload #37
    //   1851: aload #20
    //   1853: iconst_1
    //   1854: anewarray java/lang/Object
    //   1857: dup_x1
    //   1858: swap
    //   1859: iconst_0
    //   1860: swap
    //   1861: aastore
    //   1862: invokevirtual aegisguard_X : ([Ljava/lang/Object;)V
    //   1865: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_f : Ljava/util/Map;
    //   1868: aload #7
    //   1870: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1873: aload #37
    //   1875: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1880: pop
    //   1881: iinc #6, 1
    //   1884: aload_3
    //   1885: ifnull -> 35
    //   1888: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #43	-> 18
    //   #44	-> 49
    //   #46	-> 61
    //   #47	-> 65
    //   #48	-> 99
    //   #49	-> 121
    //   #50	-> 156
    //   #51	-> 177
    //   #52	-> 218
    //   #55	-> 230
    //   #56	-> 249
    //   #58	-> 261
    //   #60	-> 316
    //   #61	-> 353
    //   #62	-> 390
    //   #63	-> 426
    //   #64	-> 462
    //   #65	-> 499
    //   #66	-> 535
    //   #67	-> 572
    //   #68	-> 609
    //   #69	-> 646
    //   #70	-> 683
    //   #71	-> 720
    //   #73	-> 757
    //   #74	-> 776
    //   #75	-> 795
    //   #76	-> 814
    //   #77	-> 833
    //   #78	-> 852
    //   #79	-> 871
    //   #80	-> 887
    //   #81	-> 906
    //   #82	-> 925
    //   #83	-> 944
    //   #84	-> 963
    //   #86	-> 982
    //   #87	-> 1019
    //   #88	-> 1055
    //   #90	-> 1091
    //   #91	-> 1110
    //   #92	-> 1129
    //   #94	-> 1148
    //   #95	-> 1185
    //   #96	-> 1222
    //   #98	-> 1259
    //   #99	-> 1278
    //   #100	-> 1297
    //   #102	-> 1316
    //   #103	-> 1353
    //   #104	-> 1390
    //   #106	-> 1427
    //   #107	-> 1446
    //   #108	-> 1465
    //   #110	-> 1484
    //   #111	-> 1507
    //   #113	-> 1521
    //   #114	-> 1540
    //   #115	-> 1559
    //   #116	-> 1578
    //   #117	-> 1597
    //   #118	-> 1616
    //   #119	-> 1635
    //   #120	-> 1654
    //   #121	-> 1673
    //   #122	-> 1692
    //   #123	-> 1711
    //   #124	-> 1730
    //   #125	-> 1749
    //   #126	-> 1768
    //   #127	-> 1788
    //   #128	-> 1809
    //   #129	-> 1829
    //   #130	-> 1849
    //   #132	-> 1865
    //   #43	-> 1881
    //   #135	-> 1888
    // Exception table:
    //   from	to	target	type
    //   65	92	95	java/lang/UnsupportedOperationException
    //   117	135	138	java/lang/UnsupportedOperationException
    //   142	149	152	java/lang/UnsupportedOperationException
    //   173	198	201	java/lang/UnsupportedOperationException
    //   177	208	211	java/lang/UnsupportedOperationException
    //   1427	1500	1503	java/lang/UnsupportedOperationException
  }
  
  static {
    long l = a ^ 0x5833873AA4A0L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[29];
    boolean bool = false;
    String str;
    int i = (str = "å¯AG=eþeqN5ú= \020UEÊj'¥¬oÆÑ°\020\006ûãJ¨{ºUæ×W\003\030sÄLEðÕ4Äq£\t>Ê$L×|Ói·\020q¨Ö÷:Þ2$ý8L`x +\020éñ´6ÛB\tyf\022c£\020ÄÐ´\bTe\n8ZèÎ%ì^\030DÌ \003tDãI0\003\005­{\027\005~Àú¹j\030)ìÎÇ{\023m\023»yÍEBë\"+0+Eù\003æ8P½Hä5fr³B²\026§\"¦ÎÅíÊÚ\003Y\001vZz.ëu\001-1+\003\023\001\rþíü\032f\030\0006Ô7r«\b\036áÖÎ¿\b \024ø(t²:\b\031ÏIYIU\030­¾ÒÍ³:\002¦µ\\ð>°-L¸\\¿vè\030»Ì×°;IÝªÍ|m½\003\017ß}ðÎeZ\"\0000)\013åZyÕ\024>qUýÿU´IígÝ#õ·Wë¦8æx0\031Ê%+ü|\f_Õ\034ýG\btyAø\020%²\0307~æÒ¼T¤\007m\022B \b\036áÖÎ¿\b\031ÏIYIU\020ñQ¥ÒÉS§\034Õ\023©°T;\bÌÑWX:=Ñ£\020\006ûãJ¨{ºUæ×W\003\030Ò|TÚ}pB$£Ë)ÅnÉ´½xM¬ûÇ )\013åZyÕ\024>qUýÿU´Ií\031ðì\030ùî;ÝÖ)7\0065æ DÌ \003tDíê@àJ¦}Ç\024Ìà\017Lnda×\003y\024)\b¼ivç®Ù¿(DÌ \003tD £\\7\025aÖ[%~Ê+\006Ætt½!ÍÒP.Â0åÆ\036FáÓð").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
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
