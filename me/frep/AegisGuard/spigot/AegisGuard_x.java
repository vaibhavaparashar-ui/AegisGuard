package me.frep.aegisguard.spigot.AegisGuard_x;

import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_e;

class aegisguard_x {
  private final Object aegisguard_G;
  
  private final Object aegisguard_h;
  
  private static final long a = aegisguard_e.a(-975843567240528185L, 7840632528381104993L, MethodHandles.lookup().lookupClass()).a(237114205201290L);
  
  static Object aegisguard_Q(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_x aegisguard_x = (me.frep.aegisguard.spigot.aegisguard_x)paramArrayOfObject[0];
    return aegisguard_x.aegisguard_G;
  }
  
  static Object aegisguard_V(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_x aegisguard_x = (me.frep.aegisguard.spigot.aegisguard_x)paramArrayOfObject[0];
    return aegisguard_x.aegisguard_h;
  }
  
  aegisguard_x(Object paramObject1, Object paramObject2) {
    this.aegisguard_G = paramObject1;
    this.aegisguard_h = paramObject2;
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_x.a : J
    //   3: ldc2_w 56128712761008
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_t : ()Z
    //   11: istore #4
    //   13: aload_1
    //   14: instanceof me/frep/aegisguard/spigot/aegisguard_x
    //   17: iload #4
    //   19: ifne -> 53
    //   22: ifeq -> 108
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: aload_0
    //   33: getfield aegisguard_G : Ljava/lang/Object;
    //   36: aload_1
    //   37: checkcast me/frep/aegisguard/spigot/aegisguard_x
    //   40: getfield aegisguard_G : Ljava/lang/Object;
    //   43: invokevirtual equals : (Ljava/lang/Object;)Z
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   52: athrow
    //   53: iload #4
    //   55: ifne -> 89
    //   58: ifeq -> 108
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: aload_0
    //   69: getfield aegisguard_h : Ljava/lang/Object;
    //   72: aload_1
    //   73: checkcast me/frep/aegisguard/spigot/aegisguard_x
    //   76: getfield aegisguard_h : Ljava/lang/Object;
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: iload #4
    //   91: ifne -> 105
    //   94: ifeq -> 108
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: iconst_1
    //   105: goto -> 109
    //   108: iconst_0
    //   109: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #453	-> 13
    // Exception table:
    //   from	to	target	type
    //   13	25	28	java/lang/RuntimeException
    //   22	46	49	java/lang/RuntimeException
    //   53	61	64	java/lang/RuntimeException
    //   58	82	85	java/lang/RuntimeException
    //   89	97	100	java/lang/RuntimeException
  }
  
  public int hashCode() {
    return this.aegisguard_G.hashCode();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
