package me.frep.aegisguard.spigot.AegisGuard_X;

import java.lang.invoke.MethodHandles;
import java.util.function.Function;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_h3;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public class aegisguard_X {
  private final aegisguard_hu aegisguard_k;
  
  private static boolean aegisguard_d;
  
  private static final long a = aegisguard_e.a(6677672601420941980L, -4038325412350934472L, MethodHandles.lookup().lookupClass()).a(25676998388226L);
  
  public aegisguard_X(aegisguard_hu paramaegisguard_hu) {
    this.aegisguard_k = paramaegisguard_hu;
  }
  
  public boolean aegisguard_t(Object[] paramArrayOfObject) {
    aegisguard_h3 aegisguard_h3 = (aegisguard_h3)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    boolean bool = aegisguard_q();
    try {
      if (AbstractCheck.aegisguard_B() == null) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        aegisguard_c(!bool);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((Boolean)aegisguard_h3.aegisguard_V().apply(this.aegisguard_k)).booleanValue();
  }
  
  public boolean aegisguard_g(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast [Lme/frep/aegisguard/spigot/aegisguard_h3;
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_X.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: lload_2
    //   27: dup2
    //   28: ldc2_w 135144686225132
    //   31: lxor
    //   32: lstore #5
    //   34: pop2
    //   35: invokestatic aegisguard_q : ()Z
    //   38: aload #4
    //   40: astore #8
    //   42: istore #7
    //   44: aload #8
    //   46: arraylength
    //   47: istore #9
    //   49: iconst_0
    //   50: istore #10
    //   52: iload #10
    //   54: iload #9
    //   56: if_icmpge -> 152
    //   59: aload #8
    //   61: iload #10
    //   63: aaload
    //   64: astore #11
    //   66: iload #7
    //   68: lload_2
    //   69: lconst_0
    //   70: lcmp
    //   71: ifle -> 136
    //   74: ifne -> 134
    //   77: aload_0
    //   78: aload #11
    //   80: lload #5
    //   82: iconst_2
    //   83: anewarray java/lang/Object
    //   86: dup_x2
    //   87: dup_x2
    //   88: pop
    //   89: invokestatic valueOf : (J)Ljava/lang/Long;
    //   92: iconst_1
    //   93: swap
    //   94: aastore
    //   95: dup_x1
    //   96: swap
    //   97: iconst_0
    //   98: swap
    //   99: aastore
    //   100: invokevirtual aegisguard_t : ([Ljava/lang/Object;)Z
    //   103: iload #7
    //   105: ifne -> 153
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: ifeq -> 131
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: iconst_1
    //   126: ireturn
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iinc #10, 1
    //   134: iload #7
    //   136: ifeq -> 52
    //   139: iconst_5
    //   140: lload_2
    //   141: lconst_0
    //   142: lcmp
    //   143: iflt -> 68
    //   146: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   149: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   152: iconst_0
    //   153: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #19	-> 38
    //   #20	-> 66
    //   #19	-> 131
    //   #22	-> 152
    // Exception table:
    //   from	to	target	type
    //   66	108	111	java/lang/RuntimeException
    //   77	118	121	java/lang/RuntimeException
    //   115	127	127	java/lang/RuntimeException
  }
  
  public boolean aegisguard_G(Object[] paramArrayOfObject) {
    Function<aegisguard_hu, Boolean> function = (Function)paramArrayOfObject[0];
    return ((Boolean)function.apply(this.aegisguard_k)).booleanValue();
  }
  
  public static void aegisguard_c(boolean paramBoolean) {
    aegisguard_d = paramBoolean;
  }
  
  public static boolean aegisguard_q() {
    return aegisguard_d;
  }
  
  public static boolean aegisguard_b() {
    boolean bool = aegisguard_q();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    if (aegisguard_q())
      aegisguard_c(true); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
