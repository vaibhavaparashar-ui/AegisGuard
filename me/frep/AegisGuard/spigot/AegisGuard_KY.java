package me.frep.aegisguard.spigot.AegisGuard_KY;

import org.bukkit.entity.Entity;

public final class aegisguard_KY {
  private static final String[] a;
  
  private aegisguard_KY() {
    throw new UnsupportedOperationException(a[0]);
  }
  
  public static boolean aegisguard_R(Object[] paramArrayOfObject) {
    Entity entity = (Entity)paramArrayOfObject[0];
    return entity.getType().toString().equals(a[1]);
  }
  
  public static boolean aegisguard_J(Object[] paramArrayOfObject) {
    Entity entity = (Entity)paramArrayOfObject[0];
    return entity.getType().toString().contains(a[2]);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '$zyfnca-32n|(8j*%kq2?3k(c0"-}d)s0#)3c(td "gc'su%FF\\rBBR^'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #50
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #107
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 75
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic me/frep/aegisguard/spigot/aegisguard_KY.a : [Ljava/lang/String;
    //   72: goto -> 219
    //   75: dup_x2
    //   76: pop
    //   77: invokevirtual toCharArray : ()[C
    //   80: dup_x1
    //   81: arraylength
    //   82: dup_x2
    //   83: pop
    //   84: iconst_0
    //   85: istore #6
    //   87: dup2_x1
    //   88: pop2
    //   89: dup_x2
    //   90: iconst_1
    //   91: if_icmpgt -> 192
    //   94: dup2
    //   95: swap
    //   96: iload #6
    //   98: dup2_x1
    //   99: caload
    //   100: swap
    //   101: iload #6
    //   103: bipush #7
    //   105: irem
    //   106: tableswitch default -> 174, 0 -> 144, 1 -> 149, 2 -> 154, 3 -> 159, 4 -> 164, 5 -> 169
    //   144: bipush #42
    //   146: goto -> 176
    //   149: bipush #39
    //   151: goto -> 176
    //   154: bipush #120
    //   156: goto -> 176
    //   159: bipush #97
    //   161: goto -> 176
    //   164: bipush #45
    //   166: goto -> 176
    //   169: bipush #108
    //   171: goto -> 176
    //   174: bipush #123
    //   176: ixor
    //   177: ixor
    //   178: i2c
    //   179: castore
    //   180: iinc #6, 1
    //   183: dup
    //   184: ifne -> 192
    //   187: dup2
    //   188: dup_x1
    //   189: goto -> 98
    //   192: dup2_x1
    //   193: pop2
    //   194: dup_x2
    //   195: iload #6
    //   197: if_icmpgt -> 94
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
    //   219: return
  }
}
