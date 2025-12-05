package me.frep.aegisguard.spigot.AegisGuard_K8;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hl;
import org.bukkit.scheduler.BukkitTask;

public class aegisguard_K8 implements Runnable {
  private int aegisguard_k;
  
  private static BukkitTask aegisguard_T;
  
  static final boolean aegisguard_l;
  
  private static String aegisguard_j;
  
  private static final long a = aegisguard_e.a(1599143869046400294L, -7807254162299908276L, MethodHandles.lookup().lookupClass()).a(175517875718102L);
  
  private static final String[] b;
  
  static {
    long l = a ^ 0x513A2349D67EL;
    aegisguard_Q("VPCHT");
    byte b1;
    for ((new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "Í/K\003>\004\035f\031²\035¡A]È>SäQÏ«Ðî\"ÈêÅ\031oo\026¿À\002)\024Àª#XÓ\rt>Í(Ú_&ÎC¹ðó¥Y\003\024M#ÂhûÆô^Ðâ~\003:+ÈmÃ\"ÆNµ²-z\007©æbma\\íãdzõEÊQôm\032--Ýû\006·$§Îë\t\005&²äsÿT\035¨\033\005ÎéQØü\022©Ú<ezd\004\005Ò\003{]¢\fáæ\032×D×å&!;¤\020±\033ÀEÂeûëÔ)L~ÎºÒ4°ÀÖ|sÍÔÊ%\nÕR\000>µ[MXÃ(\022zC~5-©\003<Æ·~j¡Wy\034\013¬«e4\020¥&ù\tP­Þi\020|eðd").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  public int aegisguard_I(Object[] paramArrayOfObject) {
    return this.aegisguard_k;
  }
  
  public void aegisguard_n(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_K8.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic aegisguard_N : ()Ljava/lang/String;
    //   21: astore #4
    //   23: aload #4
    //   25: ifnull -> 109
    //   28: getstatic me/frep/aegisguard/spigot/aegisguard_K8.aegisguard_l : Z
    //   31: ifne -> 89
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: lload_2
    //   42: lconst_0
    //   43: lcmp
    //   44: ifle -> 109
    //   47: getstatic me/frep/aegisguard/spigot/aegisguard_K8.aegisguard_T : Lorg/bukkit/scheduler/BukkitTask;
    //   50: aload #4
    //   52: ifnull -> 106
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   61: athrow
    //   62: ifnull -> 89
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: new java/lang/AssertionError
    //   75: dup
    //   76: getstatic me/frep/aegisguard/spigot/aegisguard_K8.b : [Ljava/lang/String;
    //   79: iconst_0
    //   80: aaload
    //   81: invokespecial <init> : (Ljava/lang/Object;)V
    //   84: athrow
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   92: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   95: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   98: aload_0
    //   99: lconst_0
    //   100: lconst_1
    //   101: invokeinterface runTaskTimerAsynchronously : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;JJ)Lorg/bukkit/scheduler/BukkitTask;
    //   106: putstatic me/frep/aegisguard/spigot/aegisguard_K8.aegisguard_T : Lorg/bukkit/scheduler/BukkitTask;
    //   109: lload_2
    //   110: lconst_0
    //   111: lcmp
    //   112: ifle -> 126
    //   115: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   118: ifnonnull -> 133
    //   121: ldc 'boChxb'
    //   123: invokestatic aegisguard_Q : (Ljava/lang/String;)V
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 23
    //   #22	-> 89
    //   #23	-> 109
    // Exception table:
    //   from	to	target	type
    //   23	34	37	java/lang/RuntimeException
    //   28	55	58	java/lang/RuntimeException
    //   41	65	68	java/lang/RuntimeException
    //   62	85	85	java/lang/RuntimeException
    //   109	126	129	java/lang/RuntimeException
  }
  
  public void aegisguard_h(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    String str = aegisguard_N();
    try {
      if (str != null)
        if (aegisguard_T == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_T.cancel();
    aegisguard_T = null;
  }
  
  public void run() {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_K8.a : J
    //   3: ldc2_w 90763970373772
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 14972187836686
    //   13: lxor
    //   14: lstore_3
    //   15: dup2
    //   16: ldc2_w 120218723677927
    //   19: lxor
    //   20: lstore #5
    //   22: pop2
    //   23: invokestatic aegisguard_N : ()Ljava/lang/String;
    //   26: aload_0
    //   27: dup
    //   28: getfield aegisguard_k : I
    //   31: iconst_1
    //   32: iadd
    //   33: putfield aegisguard_k : I
    //   36: astore #7
    //   38: aload_0
    //   39: getfield aegisguard_k : I
    //   42: iconst_5
    //   43: irem
    //   44: aload #7
    //   46: ifnull -> 262
    //   49: ifne -> 259
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: iconst_0
    //   60: anewarray java/lang/Object
    //   63: invokestatic aegisguard_l : ([Ljava/lang/Object;)Z
    //   66: ifeq -> 173
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   79: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   82: iconst_0
    //   83: anewarray java/lang/Object
    //   86: invokevirtual aegisguard_k : ([Ljava/lang/Object;)Ljava/util/Collection;
    //   89: invokeinterface iterator : ()Ljava/util/Iterator;
    //   94: astore #8
    //   96: aload #8
    //   98: invokeinterface hasNext : ()Z
    //   103: ifeq -> 168
    //   106: aload #8
    //   108: invokeinterface next : ()Ljava/lang/Object;
    //   113: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   116: astore #9
    //   118: aload #9
    //   120: iconst_0
    //   121: anewarray java/lang/Object
    //   124: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   127: lload_3
    //   128: iconst_1
    //   129: anewarray java/lang/Object
    //   132: dup_x2
    //   133: dup_x2
    //   134: pop
    //   135: invokestatic valueOf : (J)Ljava/lang/Long;
    //   138: iconst_0
    //   139: swap
    //   140: aastore
    //   141: invokevirtual aegisguard_M : ([Ljava/lang/Object;)V
    //   144: aload #7
    //   146: ifnull -> 259
    //   149: aload #7
    //   151: ifnonnull -> 96
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   160: athrow
    //   161: iconst_3
    //   162: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   165: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   168: aload #7
    //   170: ifnonnull -> 259
    //   173: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   176: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   179: iconst_0
    //   180: anewarray java/lang/Object
    //   183: invokevirtual aegisguard_k : ([Ljava/lang/Object;)Ljava/util/Collection;
    //   186: invokeinterface iterator : ()Ljava/util/Iterator;
    //   191: astore #8
    //   193: aload #8
    //   195: invokeinterface hasNext : ()Z
    //   200: ifeq -> 259
    //   203: aload #8
    //   205: invokeinterface next : ()Ljava/lang/Object;
    //   210: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   213: astore #9
    //   215: aload #9
    //   217: iconst_0
    //   218: anewarray java/lang/Object
    //   221: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   224: lload #5
    //   226: iconst_1
    //   227: anewarray java/lang/Object
    //   230: dup_x2
    //   231: dup_x2
    //   232: pop
    //   233: invokestatic valueOf : (J)Ljava/lang/Long;
    //   236: iconst_0
    //   237: swap
    //   238: aastore
    //   239: invokevirtual aegisguard_S : ([Ljava/lang/Object;)V
    //   242: aload #7
    //   244: ifnull -> 327
    //   247: aload #7
    //   249: ifnonnull -> 193
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   258: athrow
    //   259: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GQ : Z
    //   262: aload #7
    //   264: ifnull -> 330
    //   267: ifeq -> 327
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   276: athrow
    //   277: aload_0
    //   278: getfield aegisguard_k : I
    //   281: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_k : I
    //   284: irem
    //   285: aload #7
    //   287: ifnull -> 330
    //   290: goto -> 297
    //   293: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   296: athrow
    //   297: ifne -> 327
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   306: athrow
    //   307: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_d3 : Ljava/util/List;
    //   310: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   315: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   326: athrow
    //   327: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Me : Z
    //   330: aload #7
    //   332: ifnull -> 393
    //   335: ifeq -> 389
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   344: athrow
    //   345: aload_0
    //   346: getfield aegisguard_k : I
    //   349: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_E : I
    //   352: irem
    //   353: aload #7
    //   355: ifnull -> 393
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   364: athrow
    //   365: ifne -> 389
    //   368: goto -> 375
    //   371: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   374: athrow
    //   375: iconst_0
    //   376: anewarray java/lang/Object
    //   379: invokestatic aegisguard_u : ([Ljava/lang/Object;)V
    //   382: goto -> 389
    //   385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   388: athrow
    //   389: aload_0
    //   390: getfield aegisguard_k : I
    //   393: aload #7
    //   395: ifnull -> 518
    //   398: sipush #4000
    //   401: if_icmple -> 515
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   410: athrow
    //   411: aload_0
    //   412: getfield aegisguard_k : I
    //   415: sipush #500
    //   418: irem
    //   419: aload #7
    //   421: ifnull -> 518
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   430: athrow
    //   431: ifne -> 515
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   440: athrow
    //   441: iconst_0
    //   442: anewarray java/lang/Object
    //   445: invokestatic aegisguard_S : ([Ljava/lang/Object;)D
    //   448: dconst_1
    //   449: dcmpg
    //   450: aload #7
    //   452: ifnull -> 518
    //   455: goto -> 462
    //   458: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   461: athrow
    //   462: ifge -> 515
    //   465: goto -> 472
    //   468: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   471: athrow
    //   472: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mb : Z
    //   475: aload #7
    //   477: ifnull -> 518
    //   480: goto -> 487
    //   483: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   486: athrow
    //   487: ifeq -> 515
    //   490: goto -> 497
    //   493: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   496: athrow
    //   497: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   500: getstatic me/frep/aegisguard/spigot/aegisguard_K8.b : [Ljava/lang/String;
    //   503: iconst_1
    //   504: aaload
    //   505: invokevirtual aegisguard_u : (Ljava/lang/String;)V
    //   508: goto -> 515
    //   511: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   514: athrow
    //   515: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GX : Z
    //   518: aload #7
    //   520: ifnull -> 548
    //   523: ifeq -> 565
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   532: athrow
    //   533: aload_0
    //   534: getfield aegisguard_k : I
    //   537: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_du : I
    //   540: irem
    //   541: goto -> 548
    //   544: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   547: athrow
    //   548: ifne -> 565
    //   551: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   554: iconst_0
    //   555: invokevirtual aegisguard_P : (I)V
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   564: athrow
    //   565: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #34	-> 26
    //   #36	-> 38
    //   #37	-> 59
    //   #38	-> 76
    //   #39	-> 118
    //   #40	-> 144
    //   #42	-> 173
    //   #43	-> 215
    //   #44	-> 242
    //   #48	-> 259
    //   #49	-> 307
    //   #53	-> 327
    //   #54	-> 375
    //   #57	-> 389
    //   #58	-> 497
    //   #63	-> 515
    //   #64	-> 551
    //   #66	-> 565
    // Exception table:
    //   from	to	target	type
    //   38	52	55	java/lang/RuntimeException
    //   49	69	72	java/lang/RuntimeException
    //   118	154	157	java/lang/RuntimeException
    //   215	252	255	java/lang/RuntimeException
    //   262	270	273	java/lang/RuntimeException
    //   267	290	293	java/lang/RuntimeException
    //   277	300	303	java/lang/RuntimeException
    //   297	320	323	java/lang/RuntimeException
    //   330	338	341	java/lang/RuntimeException
    //   335	358	361	java/lang/RuntimeException
    //   345	368	371	java/lang/RuntimeException
    //   365	382	385	java/lang/RuntimeException
    //   393	404	407	java/lang/RuntimeException
    //   398	424	427	java/lang/RuntimeException
    //   411	434	437	java/lang/RuntimeException
    //   431	455	458	java/lang/RuntimeException
    //   441	465	468	java/lang/RuntimeException
    //   462	480	483	java/lang/RuntimeException
    //   472	490	493	java/lang/RuntimeException
    //   487	508	511	java/lang/RuntimeException
    //   518	526	529	java/lang/RuntimeException
    //   523	541	544	java/lang/RuntimeException
    //   548	558	561	java/lang/RuntimeException
  }
  
  private static void lambda$run$0(String paramString) {
    aegisguard_Xz.aegisguard_y(paramString.replaceAll(b[2], Integer.toString(aegisguard_hl.aegisguard_Z(new Object[0]))));
  }
  
  public static void aegisguard_Q(String paramString) {
    aegisguard_j = paramString;
  }
  
  public static String aegisguard_N() {
    return aegisguard_j;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
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
