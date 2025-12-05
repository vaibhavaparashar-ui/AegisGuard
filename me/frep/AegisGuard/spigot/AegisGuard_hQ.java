package me.frep.aegisguard.spigot.AegisGuard_hQ;

import java.util.Iterator;
import me.frep.aegisguard.spigot.aegisguard_Km;
import me.frep.aegisguard.spigot.aegisguard_Kw;

class aegisguard_hQ implements Iterable {
  private static final String aegisguard_W;
  
  final aegisguard_Km aegisguard_I;
  
  final aegisguard_Km aegisguard_k;
  
  aegisguard_hQ(aegisguard_Km paramaegisguard_Km1, aegisguard_Km paramaegisguard_Km2) {}
  
  public Iterator iterator() {
    return (Iterator)new aegisguard_Kw(this);
  }
  
  static {
    // Byte code:
    //   0: bipush #51
    //   2: ldc 'w?\\bA }L@d@'
    //   4: iconst_m1
    //   5: goto -> 18
    //   8: putstatic me/frep/aegisguard/spigot/aegisguard_hQ.aegisguard_W : Ljava/lang/String;
    //   11: getstatic me/frep/aegisguard/spigot/aegisguard_hQ.aegisguard_W : Ljava/lang/String;
    //   14: pop
    //   15: goto -> 158
    //   18: dup_x2
    //   19: pop
    //   20: invokevirtual toCharArray : ()[C
    //   23: dup_x1
    //   24: arraylength
    //   25: dup_x2
    //   26: pop
    //   27: iconst_0
    //   28: istore_0
    //   29: dup2_x1
    //   30: pop2
    //   31: dup_x2
    //   32: iconst_1
    //   33: if_icmpgt -> 132
    //   36: dup2
    //   37: swap
    //   38: iload_0
    //   39: dup2_x1
    //   40: caload
    //   41: swap
    //   42: iload_0
    //   43: bipush #7
    //   45: irem
    //   46: tableswitch default -> 114, 0 -> 84, 1 -> 89, 2 -> 94, 3 -> 99, 4 -> 104, 5 -> 109
    //   84: bipush #7
    //   86: goto -> 116
    //   89: bipush #64
    //   91: goto -> 116
    //   94: bipush #100
    //   96: goto -> 116
    //   99: bipush #66
    //   101: goto -> 116
    //   104: bipush #35
    //   106: goto -> 116
    //   109: bipush #126
    //   111: goto -> 116
    //   114: bipush #79
    //   116: ixor
    //   117: ixor
    //   118: i2c
    //   119: castore
    //   120: iinc #0, 1
    //   123: dup
    //   124: ifne -> 132
    //   127: dup2
    //   128: dup_x1
    //   129: goto -> 39
    //   132: dup2_x1
    //   133: pop2
    //   134: dup_x2
    //   135: iload_0
    //   136: if_icmpgt -> 36
    //   139: pop
    //   140: new java/lang/String
    //   143: dup_x1
    //   144: swap
    //   145: invokespecial <init> : ([C)V
    //   148: invokevirtual intern : ()Ljava/lang/String;
    //   151: swap
    //   152: pop
    //   153: swap
    //   154: pop
    //   155: goto -> 8
    //   158: return
  }
}
