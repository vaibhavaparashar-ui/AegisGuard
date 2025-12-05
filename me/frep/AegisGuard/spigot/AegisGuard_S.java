package me.frep.aegisguard.spigot.AegisGuard_S;

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

public class aegisguard_S extends aegisguard_M implements CommandExecutor {
  private final ExecutorService aegisguard_q = Executors.newSingleThreadExecutor();
  
  private static final long b = aegisguard_e.a(-4301605586671109328L, 7663257196159670906L, MethodHandles.lookup().lookupClass()).a(100217858657976L);
  
  private static final String[] d;
  
  public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_S.b : J
    //   3: ldc2_w 5413459449195
    //   6: lxor
    //   7: lstore #5
    //   9: lload #5
    //   11: dup2
    //   12: ldc2_w 9389027373183
    //   15: lxor
    //   16: lstore #7
    //   18: pop2
    //   19: invokestatic aegisguard_V : ()Ljava/lang/String;
    //   22: astore #9
    //   24: aload_1
    //   25: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   28: bipush #6
    //   30: aaload
    //   31: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   36: aload #9
    //   38: ifnull -> 93
    //   41: ifne -> 90
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_0
    //   52: aload_1
    //   53: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   56: lload #7
    //   58: iconst_3
    //   59: anewarray java/lang/Object
    //   62: dup_x2
    //   63: dup_x2
    //   64: pop
    //   65: invokestatic valueOf : (J)Ljava/lang/Long;
    //   68: iconst_2
    //   69: swap
    //   70: aastore
    //   71: dup_x1
    //   72: swap
    //   73: iconst_1
    //   74: swap
    //   75: aastore
    //   76: dup_x1
    //   77: swap
    //   78: iconst_0
    //   79: swap
    //   80: aastore
    //   81: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   84: iconst_1
    //   85: ireturn
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: aload #4
    //   92: arraylength
    //   93: aload #9
    //   95: ifnull -> 349
    //   98: iconst_2
    //   99: if_icmpeq -> 330
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   108: athrow
    //   109: aload #4
    //   111: arraylength
    //   112: aload #9
    //   114: ifnull -> 329
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: lookupswitch default -> 328, 0 -> 156, 1 -> 201
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload_0
    //   157: aload_1
    //   158: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_d2 : Ljava/lang/String;
    //   161: lload #7
    //   163: iconst_3
    //   164: anewarray java/lang/Object
    //   167: dup_x2
    //   168: dup_x2
    //   169: pop
    //   170: invokestatic valueOf : (J)Ljava/lang/Long;
    //   173: iconst_2
    //   174: swap
    //   175: aastore
    //   176: dup_x1
    //   177: swap
    //   178: iconst_1
    //   179: swap
    //   180: aastore
    //   181: dup_x1
    //   182: swap
    //   183: iconst_0
    //   184: swap
    //   185: aastore
    //   186: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   189: aload #9
    //   191: ifnonnull -> 328
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload_1
    //   202: aload #9
    //   204: ifnull -> 235
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: instanceof org/bukkit/entity/Player
    //   217: ifeq -> 288
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: aload_1
    //   228: goto -> 235
    //   231: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   234: athrow
    //   235: checkcast org/bukkit/entity/Player
    //   238: astore #10
    //   240: aload #10
    //   242: new java/lang/StringBuilder
    //   245: dup
    //   246: invokespecial <init> : ()V
    //   249: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   252: bipush #9
    //   254: aaload
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: aload #4
    //   260: iconst_0
    //   261: aaload
    //   262: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   268: bipush #7
    //   270: aaload
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokevirtual toString : ()Ljava/lang/String;
    //   277: invokeinterface performCommand : (Ljava/lang/String;)Z
    //   282: pop
    //   283: aload #9
    //   285: ifnonnull -> 328
    //   288: aload_0
    //   289: aload_1
    //   290: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_d2 : Ljava/lang/String;
    //   293: lload #7
    //   295: iconst_3
    //   296: anewarray java/lang/Object
    //   299: dup_x2
    //   300: dup_x2
    //   301: pop
    //   302: invokestatic valueOf : (J)Ljava/lang/Long;
    //   305: iconst_2
    //   306: swap
    //   307: aastore
    //   308: dup_x1
    //   309: swap
    //   310: iconst_1
    //   311: swap
    //   312: aastore
    //   313: dup_x1
    //   314: swap
    //   315: iconst_0
    //   316: swap
    //   317: aastore
    //   318: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   327: athrow
    //   328: iconst_1
    //   329: ireturn
    //   330: aload_0
    //   331: getfield aegisguard_q : Ljava/util/concurrent/ExecutorService;
    //   334: aload_0
    //   335: aload #4
    //   337: aload_1
    //   338: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_S;[Ljava/lang/String;Lorg/bukkit/command/CommandSender;)Ljava/lang/Runnable;
    //   343: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   348: iconst_1
    //   349: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   352: ifnonnull -> 367
    //   355: ldc 'OJwg8'
    //   357: invokestatic aegisguard_p : (Ljava/lang/String;)V
    //   360: goto -> 367
    //   363: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   366: athrow
    //   367: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #26	-> 24
    //   #27	-> 51
    //   #28	-> 84
    //   #29	-> 90
    //   #30	-> 109
    //   #32	-> 156
    //   #33	-> 189
    //   #35	-> 201
    //   #36	-> 227
    //   #37	-> 240
    //   #38	-> 283
    //   #39	-> 288
    //   #43	-> 328
    //   #45	-> 330
    //   #93	-> 348
    // Exception table:
    //   from	to	target	type
    //   24	44	47	java/lang/RuntimeException
    //   41	86	86	java/lang/RuntimeException
    //   93	102	105	java/lang/RuntimeException
    //   98	117	120	java/lang/RuntimeException
    //   109	152	152	java/lang/RuntimeException
    //   124	194	197	java/lang/RuntimeException
    //   156	207	210	java/lang/RuntimeException
    //   201	220	223	java/lang/RuntimeException
    //   214	228	231	java/lang/RuntimeException
    //   240	321	324	java/lang/RuntimeException
    //   349	360	363	java/lang/RuntimeException
  }
  
  private void lambda$onCommand$0(String[] paramArrayOfString, CommandSender paramCommandSender) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_S.b : J
    //   3: ldc2_w 81876136694393
    //   6: lxor
    //   7: lstore_3
    //   8: lload_3
    //   9: dup2
    //   10: ldc2_w 108479981805414
    //   13: lxor
    //   14: lstore #5
    //   16: dup2
    //   17: ldc2_w 77039381837677
    //   20: lxor
    //   21: lstore #7
    //   23: pop2
    //   24: aload_1
    //   25: iconst_0
    //   26: aaload
    //   27: astore #10
    //   29: aload_1
    //   30: iconst_1
    //   31: aaload
    //   32: invokestatic parseInt : (Ljava/lang/String;)I
    //   35: istore #11
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   47: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   50: invokevirtual getDataFolder : ()Ljava/io/File;
    //   53: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   56: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   59: astore #19
    //   61: aload #19
    //   63: bipush #13
    //   65: aaload
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: astore #12
    //   74: invokestatic aegisguard_V : ()Ljava/lang/String;
    //   77: new java/io/File
    //   80: dup
    //   81: aload #12
    //   83: invokespecial <init> : (Ljava/lang/String;)V
    //   86: astore #13
    //   88: astore #9
    //   90: aload #9
    //   92: ifnull -> 150
    //   95: aload #13
    //   97: invokevirtual exists : ()Z
    //   100: ifne -> 151
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_0
    //   111: aload_2
    //   112: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mm : Ljava/lang/String;
    //   115: lload #7
    //   117: iconst_3
    //   118: anewarray java/lang/Object
    //   121: dup_x2
    //   122: dup_x2
    //   123: pop
    //   124: invokestatic valueOf : (J)Ljava/lang/Long;
    //   127: iconst_2
    //   128: swap
    //   129: aastore
    //   130: dup_x1
    //   131: swap
    //   132: iconst_1
    //   133: swap
    //   134: aastore
    //   135: dup_x1
    //   136: swap
    //   137: iconst_0
    //   138: swap
    //   139: aastore
    //   140: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: return
    //   151: new java/util/ArrayList
    //   154: dup
    //   155: invokespecial <init> : ()V
    //   158: astore #14
    //   160: new java/util/Scanner
    //   163: dup
    //   164: aload #13
    //   166: invokespecial <init> : (Ljava/io/File;)V
    //   169: astore #15
    //   171: aload #15
    //   173: invokevirtual hasNext : ()Z
    //   176: ifeq -> 248
    //   179: aload #15
    //   181: invokevirtual nextLine : ()Ljava/lang/String;
    //   184: astore #16
    //   186: aload #16
    //   188: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   191: aload #10
    //   193: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   196: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   199: aload #9
    //   201: ifnull -> 260
    //   204: aload #9
    //   206: ifnull -> 242
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: ifeq -> 243
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   225: athrow
    //   226: aload #14
    //   228: aload #16
    //   230: invokeinterface add : (Ljava/lang/Object;)Z
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   241: athrow
    //   242: pop
    //   243: aload #9
    //   245: ifnonnull -> 171
    //   248: aload #14
    //   250: invokestatic reverse : (Ljava/util/List;)V
    //   253: aload #14
    //   255: invokeinterface isEmpty : ()Z
    //   260: aload #9
    //   262: ifnull -> 353
    //   265: ifeq -> 330
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   274: athrow
    //   275: aload_0
    //   276: aload_2
    //   277: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Ld : Ljava/lang/String;
    //   280: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   283: iconst_4
    //   284: aaload
    //   285: aload #10
    //   287: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   290: lload #7
    //   292: iconst_3
    //   293: anewarray java/lang/Object
    //   296: dup_x2
    //   297: dup_x2
    //   298: pop
    //   299: invokestatic valueOf : (J)Ljava/lang/Long;
    //   302: iconst_2
    //   303: swap
    //   304: aastore
    //   305: dup_x1
    //   306: swap
    //   307: iconst_1
    //   308: swap
    //   309: aastore
    //   310: dup_x1
    //   311: swap
    //   312: iconst_0
    //   313: swap
    //   314: aastore
    //   315: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   318: aload #9
    //   320: ifnonnull -> 769
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: aload #14
    //   332: invokeinterface size : ()I
    //   337: i2d
    //   338: ldc2_w 10.0
    //   341: ddiv
    //   342: invokestatic ceil : (D)D
    //   345: d2i
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   352: athrow
    //   353: istore #16
    //   355: iload #11
    //   357: aload #9
    //   359: ifnull -> 512
    //   362: iload #16
    //   364: if_icmple -> 439
    //   367: goto -> 374
    //   370: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   373: athrow
    //   374: aload_0
    //   375: aload_2
    //   376: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_LA : Ljava/lang/String;
    //   379: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   382: bipush #11
    //   384: aaload
    //   385: iload #11
    //   387: invokestatic toString : (I)Ljava/lang/String;
    //   390: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   393: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   396: bipush #10
    //   398: aaload
    //   399: aload #10
    //   401: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   404: lload #7
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
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   438: athrow
    //   439: aload_0
    //   440: aload_2
    //   441: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MS : Ljava/lang/String;
    //   444: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   447: astore #19
    //   449: aload #19
    //   451: bipush #10
    //   453: aaload
    //   454: aload #10
    //   456: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   459: aload #19
    //   461: iconst_0
    //   462: aaload
    //   463: iload #11
    //   465: invokestatic toString : (I)Ljava/lang/String;
    //   468: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   471: aload #19
    //   473: iconst_1
    //   474: aaload
    //   475: iload #16
    //   477: invokestatic toString : (I)Ljava/lang/String;
    //   480: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   483: lload #7
    //   485: iconst_3
    //   486: anewarray java/lang/Object
    //   489: dup_x2
    //   490: dup_x2
    //   491: pop
    //   492: invokestatic valueOf : (J)Ljava/lang/Long;
    //   495: iconst_2
    //   496: swap
    //   497: aastore
    //   498: dup_x1
    //   499: swap
    //   500: iconst_1
    //   501: swap
    //   502: aastore
    //   503: dup_x1
    //   504: swap
    //   505: iconst_0
    //   506: swap
    //   507: aastore
    //   508: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   511: iconst_0
    //   512: istore #17
    //   514: iload #11
    //   516: iconst_1
    //   517: isub
    //   518: bipush #10
    //   520: imul
    //   521: istore #18
    //   523: iload #18
    //   525: iload #11
    //   527: bipush #10
    //   529: imul
    //   530: if_icmpge -> 696
    //   533: aload #9
    //   535: ifnull -> 769
    //   538: iload #18
    //   540: aload #9
    //   542: ifnull -> 578
    //   545: goto -> 552
    //   548: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   551: athrow
    //   552: aload #14
    //   554: invokeinterface size : ()I
    //   559: if_icmpge -> 688
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   568: athrow
    //   569: iload #17
    //   571: goto -> 578
    //   574: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   577: athrow
    //   578: ifle -> 623
    //   581: aload_2
    //   582: lload #5
    //   584: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   587: bipush #12
    //   589: aaload
    //   590: iconst_2
    //   591: anewarray java/lang/Object
    //   594: dup_x1
    //   595: swap
    //   596: iconst_1
    //   597: swap
    //   598: aastore
    //   599: dup_x2
    //   600: dup_x2
    //   601: pop
    //   602: invokestatic valueOf : (J)Ljava/lang/Long;
    //   605: iconst_0
    //   606: swap
    //   607: aastore
    //   608: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   611: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   616: goto -> 623
    //   619: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   622: athrow
    //   623: aload_2
    //   624: new java/lang/StringBuilder
    //   627: dup
    //   628: invokespecial <init> : ()V
    //   631: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yF : Ljava/lang/String;
    //   634: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   637: aload #14
    //   639: iload #18
    //   641: invokeinterface get : (I)Ljava/lang/Object;
    //   646: checkcast java/lang/String
    //   649: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: invokevirtual toString : ()Ljava/lang/String;
    //   655: lload #5
    //   657: dup2_x1
    //   658: pop2
    //   659: iconst_2
    //   660: anewarray java/lang/Object
    //   663: dup_x1
    //   664: swap
    //   665: iconst_1
    //   666: swap
    //   667: aastore
    //   668: dup_x2
    //   669: dup_x2
    //   670: pop
    //   671: invokestatic valueOf : (J)Ljava/lang/Long;
    //   674: iconst_0
    //   675: swap
    //   676: aastore
    //   677: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   680: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   685: iinc #17, 1
    //   688: iinc #18, 1
    //   691: aload #9
    //   693: ifnonnull -> 523
    //   696: aload_0
    //   697: aload_2
    //   698: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MS : Ljava/lang/String;
    //   701: getstatic me/frep/aegisguard/spigot/aegisguard_S.d : [Ljava/lang/String;
    //   704: astore #19
    //   706: aload #19
    //   708: bipush #10
    //   710: aaload
    //   711: aload #10
    //   713: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   716: aload #19
    //   718: iconst_0
    //   719: aaload
    //   720: iload #11
    //   722: invokestatic toString : (I)Ljava/lang/String;
    //   725: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   728: aload #19
    //   730: bipush #8
    //   732: aaload
    //   733: iload #16
    //   735: invokestatic toString : (I)Ljava/lang/String;
    //   738: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   741: lload #7
    //   743: iconst_3
    //   744: anewarray java/lang/Object
    //   747: dup_x2
    //   748: dup_x2
    //   749: pop
    //   750: invokestatic valueOf : (J)Ljava/lang/Long;
    //   753: iconst_2
    //   754: swap
    //   755: aastore
    //   756: dup_x1
    //   757: swap
    //   758: iconst_1
    //   759: swap
    //   760: aastore
    //   761: dup_x1
    //   762: swap
    //   763: iconst_0
    //   764: swap
    //   765: aastore
    //   766: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   769: goto -> 779
    //   772: astore #14
    //   774: aload #14
    //   776: invokevirtual printStackTrace : ()V
    //   779: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #46	-> 24
    //   #47	-> 29
    //   #48	-> 37
    //   #49	-> 77
    //   #50	-> 90
    //   #51	-> 110
    //   #52	-> 150
    //   #54	-> 151
    //   #55	-> 160
    //   #56	-> 171
    //   #57	-> 179
    //   #58	-> 186
    //   #59	-> 226
    //   #61	-> 243
    //   #63	-> 248
    //   #65	-> 253
    //   #66	-> 275
    //   #68	-> 330
    //   #70	-> 355
    //   #71	-> 374
    //   #74	-> 439
    //   #75	-> 465
    //   #74	-> 483
    //   #77	-> 511
    //   #78	-> 514
    //   #79	-> 533
    //   #80	-> 569
    //   #81	-> 623
    //   #82	-> 685
    //   #78	-> 688
    //   #85	-> 696
    //   #86	-> 722
    //   #85	-> 741
    //   #90	-> 769
    //   #88	-> 772
    //   #89	-> 774
    //   #91	-> 779
    // Exception table:
    //   from	to	target	type
    //   90	103	106	java/io/FileNotFoundException
    //   95	143	146	java/io/FileNotFoundException
    //   151	769	772	java/io/FileNotFoundException
    //   186	209	212	java/io/FileNotFoundException
    //   204	219	222	java/io/FileNotFoundException
    //   216	235	238	java/io/FileNotFoundException
    //   260	268	271	java/io/FileNotFoundException
    //   265	323	326	java/io/FileNotFoundException
    //   275	346	349	java/io/FileNotFoundException
    //   355	367	370	java/io/FileNotFoundException
    //   362	432	435	java/io/FileNotFoundException
    //   533	545	548	java/io/FileNotFoundException
    //   538	562	565	java/io/FileNotFoundException
    //   552	571	574	java/io/FileNotFoundException
    //   578	616	619	java/io/FileNotFoundException
  }
  
  public static String spigot() {
    return d[5];
  }
  
  public static String nonce() {
    return d[3];
  }
  
  public static String resource() {
    return d[2];
  }
  
  static {
    long l = b ^ 0x7C166419B31BL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "0\nyLDËÙ!\020\017J¢Åø\005Ó\031ú¶Äc%\030Öá\031bc\000N]¼M8ýÃV\003ªA;6×á/\030\020å#\rî°EQm\000º\022Py+\020:éoÂ\037^õôwt6$\020´\026ý\tý0øò³ÁàxØ%\020\005LiÖÛGÐ1Ìnß¹ Q§\b\021\033\036o*\\ÇÊ\020\017J¢Åø\005Ó\031ú¶Äc%\bM®LüIiàG\020:éoÂ\037^õôwt6$\b0\nyLDËÙ!").length();
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
