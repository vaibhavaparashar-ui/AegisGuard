package me.frep.aegisguard.spigot.AegisGuard_C;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_M;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class aegisguard_C extends aegisguard_M implements CommandExecutor {
  private final ExecutorService aegisguard_O = Executors.newSingleThreadExecutor();
  
  private static final long b = aegisguard_e.a(-6682947717041316773L, 4618993927771653556L, MethodHandles.lookup().lookupClass()).a(74299493905375L);
  
  private static final String[] d;
  
  public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_C.b : J
    //   3: ldc2_w 117532417590289
    //   6: lxor
    //   7: lstore #5
    //   9: lload #5
    //   11: dup2
    //   12: ldc2_w 53504368645766
    //   15: lxor
    //   16: lstore #7
    //   18: pop2
    //   19: invokestatic aegisguard_V : ()Ljava/lang/String;
    //   22: astore #9
    //   24: aload_1
    //   25: getstatic me/frep/aegisguard/spigot/aegisguard_C.d : [Ljava/lang/String;
    //   28: iconst_5
    //   29: aaload
    //   30: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   35: aload #9
    //   37: ifnull -> 92
    //   40: ifne -> 89
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: aload_1
    //   52: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   55: lload #7
    //   57: iconst_3
    //   58: anewarray java/lang/Object
    //   61: dup_x2
    //   62: dup_x2
    //   63: pop
    //   64: invokestatic valueOf : (J)Ljava/lang/Long;
    //   67: iconst_2
    //   68: swap
    //   69: aastore
    //   70: dup_x1
    //   71: swap
    //   72: iconst_1
    //   73: swap
    //   74: aastore
    //   75: dup_x1
    //   76: swap
    //   77: iconst_0
    //   78: swap
    //   79: aastore
    //   80: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   83: iconst_1
    //   84: ireturn
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload #4
    //   91: arraylength
    //   92: aload #9
    //   94: ifnull -> 166
    //   97: iconst_1
    //   98: if_icmpge -> 147
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: aload_1
    //   110: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_d1 : Ljava/lang/String;
    //   113: lload #7
    //   115: iconst_3
    //   116: anewarray java/lang/Object
    //   119: dup_x2
    //   120: dup_x2
    //   121: pop
    //   122: invokestatic valueOf : (J)Ljava/lang/Long;
    //   125: iconst_2
    //   126: swap
    //   127: aastore
    //   128: dup_x1
    //   129: swap
    //   130: iconst_1
    //   131: swap
    //   132: aastore
    //   133: dup_x1
    //   134: swap
    //   135: iconst_0
    //   136: swap
    //   137: aastore
    //   138: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   141: iconst_1
    //   142: ireturn
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload_0
    //   148: getfield aegisguard_O : Ljava/util/concurrent/ExecutorService;
    //   151: aload_0
    //   152: aload #4
    //   154: aload_1
    //   155: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_C;[Ljava/lang/String;Lorg/bukkit/command/CommandSender;)Ljava/lang/Runnable;
    //   160: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   165: iconst_1
    //   166: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #24	-> 24
    //   #25	-> 50
    //   #26	-> 83
    //   #27	-> 89
    //   #28	-> 108
    //   #29	-> 141
    //   #31	-> 147
    //   #75	-> 165
    // Exception table:
    //   from	to	target	type
    //   24	43	46	java/lang/RuntimeException
    //   40	85	85	java/lang/RuntimeException
    //   92	101	104	java/lang/RuntimeException
    //   97	143	143	java/lang/RuntimeException
  }
  
  private void lambda$onCommand$0(String[] paramArrayOfString, CommandSender paramCommandSender) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_C.b : J
    //   3: ldc2_w 27227969139453
    //   6: lxor
    //   7: lstore_3
    //   8: lload_3
    //   9: dup2
    //   10: ldc2_w 73185497096298
    //   13: lxor
    //   14: lstore #5
    //   16: pop2
    //   17: aload_1
    //   18: iconst_0
    //   19: aaload
    //   20: astore #8
    //   22: new java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   32: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   35: invokevirtual getDataFolder : ()Ljava/io/File;
    //   38: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   41: getstatic me/frep/aegisguard/spigot/aegisguard_C.d : [Ljava/lang/String;
    //   44: astore #17
    //   46: aload #17
    //   48: iconst_3
    //   49: aaload
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: invokevirtual toString : ()Ljava/lang/String;
    //   56: astore #9
    //   58: invokestatic aegisguard_V : ()Ljava/lang/String;
    //   61: new java/io/File
    //   64: dup
    //   65: aload #9
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: astore #10
    //   72: astore #7
    //   74: aload #7
    //   76: ifnull -> 134
    //   79: aload #10
    //   81: invokevirtual exists : ()Z
    //   84: ifne -> 135
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_0
    //   95: aload_2
    //   96: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mm : Ljava/lang/String;
    //   99: lload #5
    //   101: iconst_3
    //   102: anewarray java/lang/Object
    //   105: dup_x2
    //   106: dup_x2
    //   107: pop
    //   108: invokestatic valueOf : (J)Ljava/lang/Long;
    //   111: iconst_2
    //   112: swap
    //   113: aastore
    //   114: dup_x1
    //   115: swap
    //   116: iconst_1
    //   117: swap
    //   118: aastore
    //   119: dup_x1
    //   120: swap
    //   121: iconst_0
    //   122: swap
    //   123: aastore
    //   124: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: return
    //   135: new java/util/ArrayList
    //   138: dup
    //   139: invokespecial <init> : ()V
    //   142: astore #11
    //   144: new java/util/Scanner
    //   147: dup
    //   148: aload #10
    //   150: invokespecial <init> : (Ljava/io/File;)V
    //   153: astore #12
    //   155: aload #12
    //   157: invokevirtual hasNext : ()Z
    //   160: ifeq -> 267
    //   163: aload #12
    //   165: invokevirtual nextLine : ()Ljava/lang/String;
    //   168: astore #13
    //   170: aload #7
    //   172: ifnull -> 668
    //   175: aload #13
    //   177: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   180: aload #8
    //   182: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   185: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   188: aload #7
    //   190: ifnull -> 230
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: ifeq -> 262
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   209: athrow
    //   210: aload #13
    //   212: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   215: getstatic me/frep/aegisguard/spigot/aegisguard_C.d : [Ljava/lang/String;
    //   218: iconst_2
    //   219: aaload
    //   220: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   229: athrow
    //   230: aload #7
    //   232: ifnull -> 261
    //   235: ifeq -> 262
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   244: athrow
    //   245: aload #11
    //   247: aload #13
    //   249: invokeinterface add : (Ljava/lang/Object;)Z
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   260: athrow
    //   261: pop
    //   262: aload #7
    //   264: ifnonnull -> 155
    //   267: new java/util/ArrayList
    //   270: dup
    //   271: invokespecial <init> : ()V
    //   274: astore #13
    //   276: aload #11
    //   278: invokeinterface iterator : ()Ljava/util/Iterator;
    //   283: astore #14
    //   285: aload #14
    //   287: invokeinterface hasNext : ()Z
    //   292: ifeq -> 369
    //   295: aload #14
    //   297: invokeinterface next : ()Ljava/lang/Object;
    //   302: checkcast java/lang/String
    //   305: astore #15
    //   307: aload #15
    //   309: ldc '-'
    //   311: ldc ''
    //   313: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   316: getstatic me/frep/aegisguard/spigot/aegisguard_C.d : [Ljava/lang/String;
    //   319: astore #17
    //   321: aload #17
    //   323: bipush #6
    //   325: aaload
    //   326: ldc ''
    //   328: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   331: aload #17
    //   333: iconst_0
    //   334: aaload
    //   335: ldc ''
    //   337: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   340: astore #16
    //   342: aload #13
    //   344: aload #16
    //   346: invokeinterface add : (Ljava/lang/Object;)Z
    //   351: pop
    //   352: aload #7
    //   354: ifnull -> 374
    //   357: aload #7
    //   359: ifnonnull -> 285
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   368: athrow
    //   369: aload #13
    //   371: invokestatic reverse : (Ljava/util/List;)V
    //   374: iconst_1
    //   375: istore #14
    //   377: aload #11
    //   379: aload #7
    //   381: ifnull -> 497
    //   384: invokeinterface isEmpty : ()Z
    //   389: ifeq -> 444
    //   392: goto -> 399
    //   395: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   398: athrow
    //   399: aload_0
    //   400: aload_2
    //   401: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GN : Ljava/lang/String;
    //   404: lload #5
    //   406: iconst_3
    //   407: anewarray java/lang/Object
    //   410: dup_x2
    //   411: dup_x2
    //   412: pop
    //   413: invokestatic valueOf : (J)Ljava/lang/Long;
    //   416: iconst_2
    //   417: swap
    //   418: aastore
    //   419: dup_x1
    //   420: swap
    //   421: iconst_1
    //   422: swap
    //   423: aastore
    //   424: dup_x1
    //   425: swap
    //   426: iconst_0
    //   427: swap
    //   428: aastore
    //   429: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   432: aload #7
    //   434: ifnonnull -> 658
    //   437: goto -> 444
    //   440: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   443: athrow
    //   444: aload_0
    //   445: aload_2
    //   446: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dT : Ljava/lang/String;
    //   449: getstatic me/frep/aegisguard/spigot/aegisguard_C.d : [Ljava/lang/String;
    //   452: iconst_1
    //   453: aaload
    //   454: aload_1
    //   455: iconst_0
    //   456: aaload
    //   457: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   460: lload #5
    //   462: iconst_3
    //   463: anewarray java/lang/Object
    //   466: dup_x2
    //   467: dup_x2
    //   468: pop
    //   469: invokestatic valueOf : (J)Ljava/lang/Long;
    //   472: iconst_2
    //   473: swap
    //   474: aastore
    //   475: dup_x1
    //   476: swap
    //   477: iconst_1
    //   478: swap
    //   479: aastore
    //   480: dup_x1
    //   481: swap
    //   482: iconst_0
    //   483: swap
    //   484: aastore
    //   485: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   488: aload #13
    //   490: goto -> 497
    //   493: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   496: athrow
    //   497: invokeinterface iterator : ()Ljava/util/Iterator;
    //   502: astore #15
    //   504: aload #15
    //   506: invokeinterface hasNext : ()Z
    //   511: ifeq -> 613
    //   514: aload #15
    //   516: invokeinterface next : ()Ljava/lang/Object;
    //   521: checkcast java/lang/String
    //   524: astore #16
    //   526: aload_0
    //   527: aload_2
    //   528: new java/lang/StringBuilder
    //   531: dup
    //   532: invokespecial <init> : ()V
    //   535: getstatic me/frep/aegisguard/spigot/aegisguard_C.d : [Ljava/lang/String;
    //   538: bipush #7
    //   540: aaload
    //   541: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   544: iload #14
    //   546: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   549: getstatic me/frep/aegisguard/spigot/aegisguard_C.d : [Ljava/lang/String;
    //   552: iconst_4
    //   553: aaload
    //   554: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   557: aload #16
    //   559: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: invokevirtual toString : ()Ljava/lang/String;
    //   565: lload #5
    //   567: iconst_3
    //   568: anewarray java/lang/Object
    //   571: dup_x2
    //   572: dup_x2
    //   573: pop
    //   574: invokestatic valueOf : (J)Ljava/lang/Long;
    //   577: iconst_2
    //   578: swap
    //   579: aastore
    //   580: dup_x1
    //   581: swap
    //   582: iconst_1
    //   583: swap
    //   584: aastore
    //   585: dup_x1
    //   586: swap
    //   587: iconst_0
    //   588: swap
    //   589: aastore
    //   590: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   593: iinc #14, 1
    //   596: aload #7
    //   598: ifnull -> 658
    //   601: aload #7
    //   603: ifnonnull -> 504
    //   606: goto -> 613
    //   609: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   612: athrow
    //   613: aload_0
    //   614: aload_2
    //   615: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dT : Ljava/lang/String;
    //   618: getstatic me/frep/aegisguard/spigot/aegisguard_C.d : [Ljava/lang/String;
    //   621: bipush #8
    //   623: aaload
    //   624: aload_1
    //   625: iconst_0
    //   626: aaload
    //   627: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   630: lload #5
    //   632: iconst_3
    //   633: anewarray java/lang/Object
    //   636: dup_x2
    //   637: dup_x2
    //   638: pop
    //   639: invokestatic valueOf : (J)Ljava/lang/Long;
    //   642: iconst_2
    //   643: swap
    //   644: aastore
    //   645: dup_x1
    //   646: swap
    //   647: iconst_1
    //   648: swap
    //   649: aastore
    //   650: dup_x1
    //   651: swap
    //   652: iconst_0
    //   653: swap
    //   654: aastore
    //   655: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   658: goto -> 668
    //   661: astore #11
    //   663: aload #11
    //   665: invokevirtual printStackTrace : ()V
    //   668: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #32	-> 17
    //   #33	-> 22
    //   #34	-> 61
    //   #35	-> 74
    //   #36	-> 94
    //   #37	-> 134
    //   #39	-> 135
    //   #40	-> 144
    //   #41	-> 155
    //   #42	-> 163
    //   #43	-> 170
    //   #44	-> 245
    //   #46	-> 262
    //   #48	-> 267
    //   #50	-> 276
    //   #51	-> 307
    //   #53	-> 342
    //   #54	-> 352
    //   #56	-> 369
    //   #58	-> 374
    //   #60	-> 377
    //   #61	-> 399
    //   #63	-> 444
    //   #64	-> 488
    //   #65	-> 526
    //   #66	-> 593
    //   #67	-> 596
    //   #68	-> 613
    //   #72	-> 658
    //   #70	-> 661
    //   #71	-> 663
    //   #73	-> 668
    // Exception table:
    //   from	to	target	type
    //   74	87	90	java/io/FileNotFoundException
    //   79	127	130	java/io/FileNotFoundException
    //   135	658	661	java/io/FileNotFoundException
    //   170	193	196	java/io/FileNotFoundException
    //   175	203	206	java/io/FileNotFoundException
    //   200	223	226	java/io/FileNotFoundException
    //   230	238	241	java/io/FileNotFoundException
    //   235	254	257	java/io/FileNotFoundException
    //   342	362	365	java/io/FileNotFoundException
    //   377	392	395	java/io/FileNotFoundException
    //   384	437	440	java/io/FileNotFoundException
    //   399	490	493	java/io/FileNotFoundException
    //   526	606	609	java/io/FileNotFoundException
  }
  
  static {
    long l = b ^ 0x77B3018B9BD2L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "puo9¢K_R\020îw-îGô#=}ãMÁÒQs\020ã¥r½\037Ó¹YË\024Q\031·üGÆ\030¹Óâ\031\032?N|wodºç_\024IBP\036Ü_\bò{§¿¯ÆöK\030§\037KL[ajs¶ª~w\025\037ùeCEÍ&\b!\034z\0027F").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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
