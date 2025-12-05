package me.frep.aegisguard.spigot.AegisGuard_b;

import java.util.HashSet;
import java.util.Set;
import me.frep.aegisguard.spigot.aegisguard_KK;

public final class aegisguard_b {
  private final Set aegisguard_P = new HashSet();
  
  private Object aegisguard_m;
  
  public aegisguard_b(Object paramObject) {
    this.aegisguard_m = paramObject;
  }
  
  public Object aegisguard_w(Object[] paramArrayOfObject) {
    return this.aegisguard_m;
  }
  
  public void aegisguard_l(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Object
    //   7: astore_2
    //   8: pop
    //   9: aload_0
    //   10: getfield aegisguard_m : Ljava/lang/Object;
    //   13: astore_3
    //   14: aload_0
    //   15: aload_2
    //   16: putfield aegisguard_m : Ljava/lang/Object;
    //   19: aload_0
    //   20: getfield aegisguard_P : Ljava/util/Set;
    //   23: aload_3
    //   24: aload_2
    //   25: <illegal opcode> accept : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/function/Consumer;
    //   30: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   35: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 9
    //   #22	-> 14
    //   #24	-> 19
    //   #25	-> 35
  }
  
  private static void lambda$set$0(Object paramObject1, Object paramObject2, aegisguard_KK paramaegisguard_KK) {
    paramaegisguard_KK.aegisguard_x(new Object[] { null, paramObject2, paramObject1 });
  }
  
  public aegisguard_KK aegisguard_q(Object[] paramArrayOfObject) {
    aegisguard_KK aegisguard_KK = (aegisguard_KK)paramArrayOfObject[0];
    this.aegisguard_P.add(aegisguard_KK);
    return aegisguard_KK;
  }
  
  public void aegisguard_I(Object[] paramArrayOfObject) {
    aegisguard_KK aegisguard_KK = (aegisguard_KK)paramArrayOfObject[0];
    this.aegisguard_P.remove(aegisguard_KK);
  }
}
