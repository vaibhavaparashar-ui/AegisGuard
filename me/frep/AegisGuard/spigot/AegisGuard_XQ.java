package me.frep.aegisguard.spigot.AegisGuard_XQ;

import me.frep.aegisguard.spigot.aegisguard_Km;
import me.frep.aegisguard.spigot.aegisguard_hq;
import me.frep.aegisguard.spigot.aegisguard_hz;
import me.frep.aegisguard.spigot.aegisguard_n;
import org.bukkit.entity.Entity;

public class aegisguard_XQ {
  private aegisguard_Km aegisguard_z;
  
  public aegisguard_hz aegisguard_e;
  
  public aegisguard_hq aegisguard_K;
  
  public aegisguard_n aegisguard_W;
  
  public Entity aegisguard_F;
  
  private static final String[] a;
  
  public aegisguard_XQ(aegisguard_n paramaegisguard_n, aegisguard_hq paramaegisguard_hq, aegisguard_Km paramaegisguard_Km) {
    this(aegisguard_hz.BLOCK, paramaegisguard_n, paramaegisguard_hq, paramaegisguard_Km);
  }
  
  public aegisguard_XQ(aegisguard_n paramaegisguard_n, aegisguard_hq paramaegisguard_hq) {
    this(aegisguard_hz.BLOCK, paramaegisguard_n, paramaegisguard_hq, aegisguard_Km.aegisguard_T);
  }
  
  public aegisguard_XQ(Entity paramEntity) {
    this(paramEntity, new aegisguard_n(paramEntity.getLocation().getX(), paramEntity.getLocation().getY(), paramEntity.getLocation().getZ()));
  }
  
  public aegisguard_XQ(aegisguard_hz paramaegisguard_hz, aegisguard_n paramaegisguard_n, aegisguard_hq paramaegisguard_hq, aegisguard_Km paramaegisguard_Km) {
    this.aegisguard_e = paramaegisguard_hz;
    this.aegisguard_z = paramaegisguard_Km;
    this.aegisguard_K = paramaegisguard_hq;
    this.aegisguard_W = new aegisguard_n(paramaegisguard_n.aegisguard_y(new Object[0]), paramaegisguard_n.aegisguard_t(new Object[0]), paramaegisguard_n.aegisguard_p(new Object[0]));
  }
  
  public aegisguard_XQ(Entity paramEntity, aegisguard_n paramaegisguard_n) {
    this.aegisguard_e = aegisguard_hz.ENTITY;
    this.aegisguard_F = paramEntity;
    this.aegisguard_W = paramaegisguard_n;
  }
  
  public aegisguard_Km aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_z;
  }
  
  public String toString() {
    String[] arrayOfString = a;
    return arrayOfString[0] + this.aegisguard_e + arrayOfString[1] + this.aegisguard_z + arrayOfString[2] + this.aegisguard_K + arrayOfString[3] + this.aegisguard_W + arrayOfString[4] + this.aegisguard_F + '}';
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ft4>b{>(.3"Gb&> ~\\bsw"Gfw'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #15
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #60
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 134
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
    //   67: ldc 'K.LK#\\tK.\\fMLwV3'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #85
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 134
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic me/frep/aegisguard/spigot/aegisguard_XQ.a : [Ljava/lang/String;
    //   131: goto -> 292
    //   134: dup_x2
    //   135: pop
    //   136: invokevirtual toCharArray : ()[C
    //   139: dup_x1
    //   140: arraylength
    //   141: dup_x2
    //   142: pop
    //   143: iconst_0
    //   144: istore #6
    //   146: dup2_x1
    //   147: pop2
    //   148: dup_x2
    //   149: iconst_1
    //   150: if_icmpgt -> 252
    //   153: dup2
    //   154: swap
    //   155: iload #6
    //   157: dup2_x1
    //   158: caload
    //   159: swap
    //   160: iload #6
    //   162: bipush #7
    //   164: irem
    //   165: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #50
    //   206: goto -> 236
    //   209: bipush #91
    //   211: goto -> 236
    //   214: bipush #60
    //   216: goto -> 236
    //   219: bipush #118
    //   221: goto -> 236
    //   224: bipush #109
    //   226: goto -> 236
    //   229: bipush #75
    //   231: goto -> 236
    //   234: bipush #119
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 157
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 153
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 39, 0 -> 98
    //   292: return
  }
}
