package me.frep.aegisguard.spigot.AegisGuard_Kw;

import com.google.common.collect.AbstractIterator;
import me.frep.aegisguard.spigot.aegisguard_Kz;
import me.frep.aegisguard.spigot.aegisguard_hQ;

class aegisguard_Kw extends AbstractIterator {
  private aegisguard_Kz aegisguard_J = null;
  
  private static final String aegisguard_w;
  
  final aegisguard_hQ aegisguard_n;
  
  private static final long a;
  
  aegisguard_Kw(aegisguard_hQ paramaegisguard_hQ) {}
  
  protected aegisguard_Kz aegisguard_j(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_Kw.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic aegisguard_I : ()I
    //   21: istore #4
    //   23: aload_0
    //   24: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   27: iload #4
    //   29: ifeq -> 109
    //   32: ifnonnull -> 105
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: aload_0
    //   43: new me/frep/aegisguard/spigot/aegisguard_Kz
    //   46: dup
    //   47: aload_0
    //   48: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   51: getfield aegisguard_I : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   54: iconst_0
    //   55: anewarray java/lang/Object
    //   58: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   61: aload_0
    //   62: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   65: getfield aegisguard_I : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   75: aload_0
    //   76: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   79: getfield aegisguard_I : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   82: iconst_0
    //   83: anewarray java/lang/Object
    //   86: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   89: aconst_null
    //   90: invokespecial <init> : (IIILjava/lang/Object;)V
    //   93: putfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   96: aload_0
    //   97: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   100: areturn
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_0
    //   106: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   109: aload_0
    //   110: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   113: getfield aegisguard_k : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   116: invokevirtual equals : (Ljava/lang/Object;)Z
    //   119: iload #4
    //   121: ifeq -> 157
    //   124: ifeq -> 146
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   133: athrow
    //   134: aload_0
    //   135: invokevirtual endOfData : ()Ljava/lang/Object;
    //   138: checkcast me/frep/aegisguard/spigot/aegisguard_Kz
    //   141: areturn
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: aload_0
    //   147: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   150: iconst_0
    //   151: anewarray java/lang/Object
    //   154: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   157: istore #5
    //   159: aload_0
    //   160: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   163: iconst_0
    //   164: anewarray java/lang/Object
    //   167: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   170: istore #6
    //   172: aload_0
    //   173: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   176: iconst_0
    //   177: anewarray java/lang/Object
    //   180: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   183: istore #7
    //   185: iload #5
    //   187: aload_0
    //   188: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   191: getfield aegisguard_k : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   194: iconst_0
    //   195: anewarray java/lang/Object
    //   198: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   201: iload #4
    //   203: lload_2
    //   204: lconst_0
    //   205: lcmp
    //   206: iflt -> 268
    //   209: ifeq -> 266
    //   212: if_icmpge -> 243
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   221: athrow
    //   222: iinc #5, 1
    //   225: lload_2
    //   226: lconst_0
    //   227: lcmp
    //   228: ifle -> 417
    //   231: iload #4
    //   233: ifne -> 390
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: iload #6
    //   245: aload_0
    //   246: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   249: getfield aegisguard_k : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   252: iconst_0
    //   253: anewarray java/lang/Object
    //   256: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: iload #4
    //   268: ifeq -> 352
    //   271: if_icmpge -> 311
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   280: athrow
    //   281: aload_0
    //   282: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   285: getfield aegisguard_I : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   288: iconst_0
    //   289: anewarray java/lang/Object
    //   292: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   295: istore #5
    //   297: iinc #6, 1
    //   300: lload_2
    //   301: lconst_0
    //   302: lcmp
    //   303: iflt -> 417
    //   306: iload #4
    //   308: ifne -> 390
    //   311: lload_2
    //   312: lconst_0
    //   313: lcmp
    //   314: ifle -> 387
    //   317: iload #7
    //   319: iload #4
    //   321: ifeq -> 385
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   330: athrow
    //   331: aload_0
    //   332: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   335: getfield aegisguard_k : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   338: iconst_0
    //   339: anewarray java/lang/Object
    //   342: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   351: athrow
    //   352: if_icmpge -> 390
    //   355: aload_0
    //   356: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   359: getfield aegisguard_I : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   362: iconst_0
    //   363: anewarray java/lang/Object
    //   366: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   369: istore #5
    //   371: aload_0
    //   372: getfield aegisguard_n : Lme/frep/aegisguard/spigot/aegisguard_hQ;
    //   375: getfield aegisguard_I : Lme/frep/aegisguard/spigot/aegisguard_Km;
    //   378: iconst_0
    //   379: anewarray java/lang/Object
    //   382: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   385: istore #6
    //   387: iinc #7, 1
    //   390: aload_0
    //   391: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   394: iload #5
    //   396: putfield aegisguard_v : I
    //   399: aload_0
    //   400: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   403: iload #6
    //   405: putfield aegisguard_o : I
    //   408: aload_0
    //   409: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   412: iload #7
    //   414: putfield aegisguard__ : I
    //   417: aload_0
    //   418: getfield aegisguard_J : Lme/frep/aegisguard/spigot/aegisguard_Kz;
    //   421: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #334	-> 23
    //   #336	-> 42
    //   #337	-> 96
    //   #339	-> 105
    //   #341	-> 134
    //   #345	-> 146
    //   #346	-> 159
    //   #347	-> 172
    //   #349	-> 185
    //   #351	-> 222
    //   #353	-> 243
    //   #355	-> 281
    //   #356	-> 297
    //   #358	-> 311
    //   #360	-> 355
    //   #361	-> 371
    //   #362	-> 387
    //   #365	-> 390
    //   #366	-> 399
    //   #367	-> 408
    //   #368	-> 417
    // Exception table:
    //   from	to	target	type
    //   23	35	38	java/lang/RuntimeException
    //   32	101	101	java/lang/RuntimeException
    //   109	127	130	java/lang/RuntimeException
    //   124	142	142	java/lang/RuntimeException
    //   185	215	218	java/lang/RuntimeException
    //   212	236	239	java/lang/RuntimeException
    //   222	259	262	java/lang/RuntimeException
    //   266	274	277	java/lang/RuntimeException
    //   297	324	327	java/lang/RuntimeException
    //   311	345	348	java/lang/RuntimeException
  }
  
  protected Object computeNext() {
    long l1 = a ^ 0x1750311FD97L, l2 = l1 ^ 0x1557A7DC973L;
    new Object[1];
    return aegisguard_j(new Object[] { Long.valueOf(l2) });
  }
  
  static {
    // Byte code:
    //   0: ldc2_w 1479619323976328015
    //   3: ldc2_w -5426136597256714748
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard__;
    //   15: ldc2_w 231483600782167
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/frep/aegisguard/spigot/aegisguard_Kw.a : J
    //   26: bipush #7
    //   28: ldc 'WG\\t9_&8e9'
    //   30: iconst_m1
    //   31: goto -> 44
    //   34: putstatic me/frep/aegisguard/spigot/aegisguard_Kw.aegisguard_w : Ljava/lang/String;
    //   37: getstatic me/frep/aegisguard/spigot/aegisguard_Kw.aegisguard_w : Ljava/lang/String;
    //   40: pop
    //   41: goto -> 186
    //   44: dup_x2
    //   45: pop
    //   46: invokevirtual toCharArray : ()[C
    //   49: dup_x1
    //   50: arraylength
    //   51: dup_x2
    //   52: pop
    //   53: iconst_0
    //   54: istore_0
    //   55: dup2_x1
    //   56: pop2
    //   57: dup_x2
    //   58: iconst_1
    //   59: if_icmpgt -> 160
    //   62: dup2
    //   63: swap
    //   64: iload_0
    //   65: dup2_x1
    //   66: caload
    //   67: swap
    //   68: iload_0
    //   69: bipush #7
    //   71: irem
    //   72: tableswitch default -> 142, 0 -> 112, 1 -> 117, 2 -> 122, 3 -> 127, 4 -> 132, 5 -> 137
    //   112: bipush #19
    //   114: goto -> 144
    //   117: bipush #12
    //   119: goto -> 144
    //   122: bipush #81
    //   124: goto -> 144
    //   127: bipush #14
    //   129: goto -> 144
    //   132: bipush #48
    //   134: goto -> 144
    //   137: bipush #104
    //   139: goto -> 144
    //   142: bipush #57
    //   144: ixor
    //   145: ixor
    //   146: i2c
    //   147: castore
    //   148: iinc #0, 1
    //   151: dup
    //   152: ifne -> 160
    //   155: dup2
    //   156: dup_x1
    //   157: goto -> 65
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iload_0
    //   164: if_icmpgt -> 62
    //   167: pop
    //   168: new java/lang/String
    //   171: dup_x1
    //   172: swap
    //   173: invokespecial <init> : ([C)V
    //   176: invokevirtual intern : ()Ljava/lang/String;
    //   179: swap
    //   180: pop
    //   181: swap
    //   182: pop
    //   183: goto -> 34
    //   186: return
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
