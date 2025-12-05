package me.frep.aegisguard.spigot.AegisGuard_r;

import me.frep.aegisguard.spigot.aegisguard_Km;
import me.frep.aegisguard.spigot.aegisguard_W;
import me.frep.aegisguard.spigot.aegisguard_hq;
import me.frep.aegisguard.spigot.aegisguard_m;
import org.bukkit.entity.Entity;

public class aegisguard_r {
  private aegisguard_Km aegisguard_J;
  
  public aegisguard_W aegisguard_X;
  
  public aegisguard_hq aegisguard_j;
  
  public aegisguard_m aegisguard_T;
  
  public Entity aegisguard_g;
  
  private static final String[] a;
  
  public aegisguard_r(aegisguard_m paramaegisguard_m, aegisguard_hq paramaegisguard_hq, aegisguard_Km paramaegisguard_Km) {
    this(aegisguard_W.BLOCK, paramaegisguard_m, paramaegisguard_hq, paramaegisguard_Km);
  }
  
  public aegisguard_r(aegisguard_m paramaegisguard_m, aegisguard_hq paramaegisguard_hq) {
    this(aegisguard_W.BLOCK, paramaegisguard_m, paramaegisguard_hq, aegisguard_Km.aegisguard_T);
  }
  
  public aegisguard_r(Entity paramEntity) {
    this(paramEntity, new aegisguard_m(paramEntity.getLocation().getX(), paramEntity.getLocation().getY(), paramEntity.getLocation().getZ()));
  }
  
  public aegisguard_r(aegisguard_W paramaegisguard_W, aegisguard_m paramaegisguard_m, aegisguard_hq paramaegisguard_hq, aegisguard_Km paramaegisguard_Km) {
    this.aegisguard_X = paramaegisguard_W;
    this.aegisguard_J = paramaegisguard_Km;
    this.aegisguard_j = paramaegisguard_hq;
    this.aegisguard_T = new aegisguard_m(paramaegisguard_m.aegisguard_p, paramaegisguard_m.aegisguard_x, paramaegisguard_m.aegisguard_G);
  }
  
  public aegisguard_r(Entity paramEntity, aegisguard_m paramaegisguard_m) {
    this.aegisguard_X = aegisguard_W.ENTITY;
    this.aegisguard_g = paramEntity;
    this.aegisguard_T = paramaegisguard_m;
  }
  
  public aegisguard_Km aegisguard_f(Object[] paramArrayOfObject) {
    return this.aegisguard_J;
  }
  
  public String toString() {
    String[] arrayOfString = a;
    return arrayOfString[1] + this.aegisguard_X + arrayOfString[4] + this.aegisguard_J + arrayOfString[3] + this.aegisguard_j + arrayOfString[0] + this.aegisguard_T + arrayOfString[2] + this.aegisguard_g + '}';
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'yA+\\b]p90^`h\\tyA\\t*Gq,\'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #82
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 133
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
    //   67: ldc 'D|7DD|32pS3"D'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #111
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 133
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic me/frep/aegisguard/spigot/aegisguard_r.a : [Ljava/lang/String;
    //   130: goto -> 292
    //   133: dup_x2
    //   134: pop
    //   135: invokevirtual toCharArray : ()[C
    //   138: dup_x1
    //   139: arraylength
    //   140: dup_x2
    //   141: pop
    //   142: iconst_0
    //   143: istore #6
    //   145: dup2_x1
    //   146: pop2
    //   147: dup_x2
    //   148: iconst_1
    //   149: if_icmpgt -> 252
    //   152: dup2
    //   153: swap
    //   154: iload #6
    //   156: dup2_x1
    //   157: caload
    //   158: swap
    //   159: iload #6
    //   161: bipush #7
    //   163: irem
    //   164: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #7
    //   206: goto -> 236
    //   209: bipush #51
    //   211: goto -> 236
    //   214: bipush #62
    //   216: goto -> 236
    //   219: bipush #22
    //   221: goto -> 236
    //   224: bipush #50
    //   226: goto -> 236
    //   229: bipush #124
    //   231: goto -> 236
    //   234: bipush #87
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 156
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 152
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 39, 0 -> 97
    //   292: return
  }
}
