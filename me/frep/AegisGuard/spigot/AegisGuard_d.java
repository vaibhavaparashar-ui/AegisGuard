package me.frep.aegisguard.spigot.AegisGuard_d;

import java.util.Iterator;
import me.frep.aegisguard.spigot.aegisguard_KC;
import me.frep.aegisguard.spigot.aegisguard_Km;

class aegisguard_d implements Iterable {
  private static final String aegisguard_V;
  
  final aegisguard_Km aegisguard_m;
  
  final aegisguard_Km aegisguard_y;
  
  aegisguard_d(aegisguard_Km paramaegisguard_Km1, aegisguard_Km paramaegisguard_Km2) {}
  
  public Iterator iterator() {
    return (Iterator)new aegisguard_KC(this);
  }
  
  static {
    // Byte code:
    //   0: bipush #94
    //   2: ldc 've11lk'
    //   4: iconst_m1
    //   5: goto -> 18
    //   8: putstatic me/frep/aegisguard/spigot/aegisguard_d.aegisguard_V : Ljava/lang/String;
    //   11: getstatic me/frep/aegisguard/spigot/aegisguard_d.aegisguard_V : Ljava/lang/String;
    //   14: pop
    //   15: goto -> 157
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
    //   33: if_icmpgt -> 131
    //   36: dup2
    //   37: swap
    //   38: iload_0
    //   39: dup2_x1
    //   40: caload
    //   41: swap
    //   42: iload_0
    //   43: bipush #7
    //   45: irem
    //   46: tableswitch default -> 113, 0 -> 84, 1 -> 89, 2 -> 93, 3 -> 98, 4 -> 103, 5 -> 108
    //   84: bipush #107
    //   86: goto -> 115
    //   89: iconst_1
    //   90: goto -> 115
    //   93: bipush #6
    //   95: goto -> 115
    //   98: bipush #123
    //   100: goto -> 115
    //   103: bipush #11
    //   105: goto -> 115
    //   108: bipush #95
    //   110: goto -> 115
    //   113: bipush #95
    //   115: ixor
    //   116: ixor
    //   117: i2c
    //   118: castore
    //   119: iinc #0, 1
    //   122: dup
    //   123: ifne -> 131
    //   126: dup2
    //   127: dup_x1
    //   128: goto -> 39
    //   131: dup2_x1
    //   132: pop2
    //   133: dup_x2
    //   134: iload_0
    //   135: if_icmpgt -> 36
    //   138: pop
    //   139: new java/lang/String
    //   142: dup_x1
    //   143: swap
    //   144: invokespecial <init> : ([C)V
    //   147: invokevirtual intern : ()Ljava/lang/String;
    //   150: swap
    //   151: pop
    //   152: swap
    //   153: pop
    //   154: goto -> 8
    //   157: return
  }
}
