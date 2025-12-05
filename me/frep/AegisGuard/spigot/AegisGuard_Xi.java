package me.frep.aegisguard.spigot.AegisGuard_Xi;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import me.frep.aegisguard.spigot.aegisguard_Xx;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hk;

class aegisguard_Xi {
  aegisguard_Xi(aegisguard_hk paramaegisguard_hk, aegisguard_Xx paramaegisguard_Xx) {
    this(paramaegisguard_hk);
  }
  
  private final HashMap aegisguard_y = new HashMap<>();
  
  final aegisguard_hk aegisguard_b;
  
  private static final long a = aegisguard_e.a(8976201920154949296L, 545810935439278114L, MethodHandles.lookup().lookupClass()).a(111550711194308L);
  
  void aegisguard_a(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    Object object = paramArrayOfObject[2];
    l = a ^ l;
    String[] arrayOfString = aegisguard_hk.aegisguard_S();
    try {
      if (arrayOfString != null)
        try {
          if (object != null) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String toString() {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_Xi.a : J
    //   3: ldc2_w 9984679120836
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_S : ()[Ljava/lang/String;
    //   11: new java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #4
    //   20: aload_0
    //   21: getfield aegisguard_y : Ljava/util/HashMap;
    //   24: invokevirtual entrySet : ()Ljava/util/Set;
    //   27: astore #5
    //   29: aload #4
    //   31: ldc '{'
    //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: astore_3
    //   38: iconst_0
    //   39: istore #6
    //   41: aload #5
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore #7
    //   50: aload #7
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 493
    //   60: aload #7
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast java/util/Map$Entry
    //   70: astore #8
    //   72: aload #8
    //   74: invokeinterface getValue : ()Ljava/lang/Object;
    //   79: astore #9
    //   81: aload #4
    //   83: aload_0
    //   84: aload #8
    //   86: invokeinterface getKey : ()Ljava/lang/Object;
    //   91: checkcast java/lang/String
    //   94: iconst_1
    //   95: anewarray java/lang/Object
    //   98: dup_x1
    //   99: swap
    //   100: iconst_0
    //   101: swap
    //   102: aastore
    //   103: invokespecial aegisguard_J : ([Ljava/lang/Object;)Ljava/lang/String;
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: ldc ':'
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: aload_3
    //   115: ifnull -> 495
    //   118: pop
    //   119: aload #9
    //   121: instanceof java/lang/String
    //   124: aload_3
    //   125: ifnull -> 192
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: ifeq -> 180
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: aload #4
    //   147: aload_0
    //   148: aload #9
    //   150: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   153: iconst_1
    //   154: anewarray java/lang/Object
    //   157: dup_x1
    //   158: swap
    //   159: iconst_0
    //   160: swap
    //   161: aastore
    //   162: invokespecial aegisguard_J : ([Ljava/lang/Object;)Ljava/lang/String;
    //   165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: pop
    //   169: aload_3
    //   170: ifnonnull -> 457
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: aload #9
    //   182: instanceof java/lang/Integer
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: aload_3
    //   193: ifnull -> 243
    //   196: ifeq -> 231
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   205: athrow
    //   206: aload #4
    //   208: aload #9
    //   210: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   213: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   216: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload_3
    //   221: ifnonnull -> 457
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   230: athrow
    //   231: aload #9
    //   233: instanceof java/lang/Boolean
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: aload_3
    //   244: ifnull -> 288
    //   247: ifeq -> 276
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   256: athrow
    //   257: aload #4
    //   259: aload #9
    //   261: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: aload_3
    //   266: ifnonnull -> 457
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   275: athrow
    //   276: aload #9
    //   278: instanceof me/frep/aegisguard/spigot/aegisguard_Xi
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   287: athrow
    //   288: aload_3
    //   289: ifnull -> 339
    //   292: ifeq -> 324
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   301: athrow
    //   302: aload #4
    //   304: aload #9
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload_3
    //   314: ifnonnull -> 457
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   323: athrow
    //   324: aload #9
    //   326: invokevirtual getClass : ()Ljava/lang/Class;
    //   329: invokevirtual isArray : ()Z
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   338: athrow
    //   339: aload_3
    //   340: ifnull -> 373
    //   343: ifeq -> 457
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   352: athrow
    //   353: aload #4
    //   355: ldc '['
    //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: pop
    //   361: aload #9
    //   363: invokestatic getLength : (Ljava/lang/Object;)I
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   372: athrow
    //   373: istore #10
    //   375: iconst_0
    //   376: istore #11
    //   378: iload #11
    //   380: iload #10
    //   382: if_icmpge -> 449
    //   385: aload #4
    //   387: aload #9
    //   389: iload #11
    //   391: invokestatic get : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   394: invokevirtual toString : ()Ljava/lang/String;
    //   397: aload_3
    //   398: ifnull -> 433
    //   401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: iload #11
    //   406: iload #10
    //   408: iconst_1
    //   409: isub
    //   410: aload_3
    //   411: ifnull -> 471
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   420: athrow
    //   421: if_icmpeq -> 436
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   430: athrow
    //   431: ldc ','
    //   433: goto -> 438
    //   436: ldc ''
    //   438: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: pop
    //   442: iinc #11, 1
    //   445: aload_3
    //   446: ifnonnull -> 378
    //   449: aload #4
    //   451: ldc ']'
    //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: pop
    //   457: aload #4
    //   459: iinc #6, 1
    //   462: iload #6
    //   464: aload #5
    //   466: invokeinterface size : ()I
    //   471: if_icmpne -> 483
    //   474: ldc '}'
    //   476: goto -> 485
    //   479: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   482: athrow
    //   483: ldc ','
    //   485: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: pop
    //   489: aload_3
    //   490: ifnonnull -> 50
    //   493: aload #4
    //   495: invokevirtual toString : ()Ljava/lang/String;
    //   498: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   501: ifnonnull -> 518
    //   504: iconst_2
    //   505: anewarray java/lang/String
    //   508: invokestatic aegisguard_w : ([Ljava/lang/String;)V
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   517: athrow
    //   518: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #348	-> 11
    //   #349	-> 20
    //   #350	-> 29
    //   #352	-> 38
    //   #353	-> 41
    //   #354	-> 72
    //   #355	-> 81
    //   #357	-> 119
    //   #358	-> 145
    //   #359	-> 180
    //   #360	-> 206
    //   #361	-> 231
    //   #362	-> 257
    //   #363	-> 276
    //   #364	-> 302
    //   #365	-> 324
    //   #366	-> 353
    //   #367	-> 361
    //   #368	-> 375
    //   #369	-> 385
    //   #368	-> 442
    //   #371	-> 449
    //   #374	-> 457
    //   #375	-> 489
    //   #377	-> 493
    // Exception table:
    //   from	to	target	type
    //   81	128	131	java/lang/RuntimeException
    //   118	138	141	java/lang/RuntimeException
    //   135	173	176	java/lang/RuntimeException
    //   145	185	188	java/lang/RuntimeException
    //   192	199	202	java/lang/RuntimeException
    //   196	224	227	java/lang/RuntimeException
    //   206	236	239	java/lang/RuntimeException
    //   243	250	253	java/lang/RuntimeException
    //   247	269	272	java/lang/RuntimeException
    //   257	281	284	java/lang/RuntimeException
    //   288	295	298	java/lang/RuntimeException
    //   292	317	320	java/lang/RuntimeException
    //   302	332	335	java/lang/RuntimeException
    //   339	346	349	java/lang/RuntimeException
    //   343	366	369	java/lang/RuntimeException
    //   385	414	417	java/lang/RuntimeException
    //   401	424	427	java/lang/RuntimeException
    //   471	479	479	java/lang/RuntimeException
    //   495	511	514	java/lang/RuntimeException
  }
  
  private String aegisguard_J(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return "\"" + str + "\"";
  }
  
  private aegisguard_Xi(aegisguard_hk paramaegisguard_hk) {}
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
