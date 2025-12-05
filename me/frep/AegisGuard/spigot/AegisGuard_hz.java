package me.frep.aegisguard.spigot.AegisGuard_hz;

public enum aegisguard_hz {
  public static final me.frep.aegisguard.spigot.aegisguard_hz MISS;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hz BLOCK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hz ENTITY;
  
  private static final me.frep.aegisguard.spigot.aegisguard_hz[] aegisguard_Q;
  
  private static me.frep.aegisguard.spigot.aegisguard_hz[] aegisguard_c() {
    return new me.frep.aegisguard.spigot.aegisguard_hz[] { MISS, BLOCK, ENTITY };
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #6
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '(M\\fv'H/O\\tim'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_5
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #120
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 74
    //   39: aload #6
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 22
    //   68: aload #6
    //   70: astore_0
    //   71: goto -> 219
    //   74: dup_x2
    //   75: pop
    //   76: invokevirtual toCharArray : ()[C
    //   79: dup_x1
    //   80: arraylength
    //   81: dup_x2
    //   82: pop
    //   83: iconst_0
    //   84: istore #7
    //   86: dup2_x1
    //   87: pop2
    //   88: dup_x2
    //   89: iconst_1
    //   90: if_icmpgt -> 192
    //   93: dup2
    //   94: swap
    //   95: iload #7
    //   97: dup2_x1
    //   98: caload
    //   99: swap
    //   100: iload #7
    //   102: bipush #7
    //   104: irem
    //   105: tableswitch default -> 174, 0 -> 144, 1 -> 149, 2 -> 154, 3 -> 159, 4 -> 164, 5 -> 169
    //   144: bipush #18
    //   146: goto -> 176
    //   149: bipush #121
    //   151: goto -> 176
    //   154: bipush #59
    //   156: goto -> 176
    //   159: bipush #56
    //   161: goto -> 176
    //   164: bipush #69
    //   166: goto -> 176
    //   169: bipush #76
    //   171: goto -> 176
    //   174: bipush #84
    //   176: ixor
    //   177: ixor
    //   178: i2c
    //   179: castore
    //   180: iinc #7, 1
    //   183: dup
    //   184: ifne -> 192
    //   187: dup2
    //   188: dup_x1
    //   189: goto -> 97
    //   192: dup2_x1
    //   193: pop2
    //   194: dup_x2
    //   195: iload #7
    //   197: if_icmpgt -> 93
    //   200: pop
    //   201: new java/lang/String
    //   204: dup_x1
    //   205: swap
    //   206: invokespecial <init> : ([C)V
    //   209: invokevirtual intern : ()Ljava/lang/String;
    //   212: swap
    //   213: pop
    //   214: swap
    //   215: pop
    //   216: goto -> 39
    //   219: new me/frep/aegisguard/spigot/aegisguard_hz
    //   222: dup
    //   223: aload_0
    //   224: iconst_1
    //   225: aaload
    //   226: iconst_0
    //   227: invokespecial <init> : (Ljava/lang/String;I)V
    //   230: putstatic me/frep/aegisguard/spigot/aegisguard_hz.MISS : Lme/frep/aegisguard/spigot/aegisguard_hz;
    //   233: new me/frep/aegisguard/spigot/aegisguard_hz
    //   236: dup
    //   237: aload_0
    //   238: iconst_0
    //   239: aaload
    //   240: iconst_1
    //   241: invokespecial <init> : (Ljava/lang/String;I)V
    //   244: putstatic me/frep/aegisguard/spigot/aegisguard_hz.BLOCK : Lme/frep/aegisguard/spigot/aegisguard_hz;
    //   247: new me/frep/aegisguard/spigot/aegisguard_hz
    //   250: dup
    //   251: aload_0
    //   252: iconst_2
    //   253: aaload
    //   254: iconst_2
    //   255: invokespecial <init> : (Ljava/lang/String;I)V
    //   258: putstatic me/frep/aegisguard/spigot/aegisguard_hz.ENTITY : Lme/frep/aegisguard/spigot/aegisguard_hz;
    //   261: invokestatic aegisguard_c : ()[Lme/frep/aegisguard/spigot/aegisguard_hz;
    //   264: putstatic me/frep/aegisguard/spigot/aegisguard_hz.aegisguard_Q : [Lme/frep/aegisguard/spigot/aegisguard_hz;
    //   267: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #63	-> 219
    //   #64	-> 233
    //   #65	-> 247
    //   #61	-> 261
  }
}
