package me.frep.aegisguard.spigot.AegisGuard_KN;

import com.google.common.base.Predicate;
import java.util.Map;
import me.frep.aegisguard.spigot.aegisguard_Ko;
import me.frep.aegisguard.spigot.aegisguard_Kr;
import me.frep.aegisguard.spigot.aegisguard_Xm;
import me.frep.aegisguard.spigot.aegisguard_hq;

public enum aegisguard_KN implements Predicate, aegisguard_Ko {
  public static final me.frep.aegisguard.spigot.aegisguard_KN X;
  
  public static final me.frep.aegisguard.spigot.aegisguard_KN Y;
  
  public static final me.frep.aegisguard.spigot.aegisguard_KN Z;
  
  private static final Map aegisguard_p;
  
  private final String aegisguard_d;
  
  private final aegisguard_Xm aegisguard_Q;
  
  private static final me.frep.aegisguard.spigot.aegisguard_KN[] aegisguard_c;
  
  private static final String aegisguard_H;
  
  private static final me.frep.aegisguard.spigot.aegisguard_KN[] aegisguard_w;
  
  private static final long a;
  
  private static me.frep.aegisguard.spigot.aegisguard_KN[] aegisguard_S() {
    return new me.frep.aegisguard.spigot.aegisguard_KN[] { X, Y, Z };
  }
  
  aegisguard_KN(String paramString1, int paramInt1, String paramString2, aegisguard_Xm paramaegisguard_Xm) {
    this.aegisguard_d = paramString2;
    this.aegisguard_Q = paramaegisguard_Xm;
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_KN aegisguard_T(String paramString) {
    long l = a ^ 0x79D358EC7829L;
    int i = aegisguard_Kr.aegisguard_I();
    try {
      if (i != 0) {
        try {
          if (paramString == null) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (me.frep.aegisguard.spigot.aegisguard_KN)aegisguard_p.get(paramString.toLowerCase());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String aegisguard_t() {
    return this.aegisguard_d;
  }
  
  public boolean aegisguard_r() {
    long l = a ^ 0xF4A9DCF0C59L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.aegisguard_Q == aegisguard_Xm.VERTICAL);
  }
  
  public boolean aegisguard_H() {
    long l = a ^ 0x2294D12826CEL;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.aegisguard_Q == aegisguard_Xm.HORIZONTAL);
  }
  
  public String toString() {
    return this.aegisguard_d;
  }
  
  public boolean aegisguard_m(aegisguard_hq paramaegisguard_hq) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_KN.a : J
    //   3: ldc2_w 120876298427281
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard__ : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifne -> 30
    //   19: ifnull -> 45
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: aload_1
    //   30: invokevirtual aegisguard_y : ()Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   33: aload_0
    //   34: if_acmpne -> 45
    //   37: iconst_1
    //   38: goto -> 46
    //   41: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   44: athrow
    //   45: iconst_0
    //   46: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #397	-> 13
    // Exception table:
    //   from	to	target	type
    //   13	22	25	java/lang/RuntimeException
    //   30	41	41	java/lang/RuntimeException
  }
  
  public aegisguard_Xm aegisguard_Q() {
    return this.aegisguard_Q;
  }
  
  public String aegisguard_O() {
    return this.aegisguard_d;
  }
  
  public boolean apply(Object paramObject) {
    return aegisguard_m((aegisguard_hq)paramObject);
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -1407802918311833861
    //   3: ldc2_w -1140327782639121468
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard__;
    //   15: ldc2_w 101867080112234
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/frep/aegisguard/spigot/aegisguard_KN.a : J
    //   26: bipush #121
    //   28: ldc '`[H0XiM$%1'
    //   30: iconst_m1
    //   31: goto -> 44
    //   34: putstatic me/frep/aegisguard/spigot/aegisguard_KN.aegisguard_H : Ljava/lang/String;
    //   37: getstatic me/frep/aegisguard/spigot/aegisguard_KN.aegisguard_H : Ljava/lang/String;
    //   40: pop
    //   41: goto -> 185
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
    //   59: if_icmpgt -> 159
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
    //   112: bipush #90
    //   114: goto -> 143
    //   117: bipush #110
    //   119: goto -> 143
    //   122: bipush #110
    //   124: goto -> 143
    //   127: bipush #121
    //   129: goto -> 143
    //   132: bipush #17
    //   134: goto -> 143
    //   137: bipush #32
    //   139: goto -> 143
    //   142: iconst_4
    //   143: ixor
    //   144: ixor
    //   145: i2c
    //   146: castore
    //   147: iinc #0, 1
    //   150: dup
    //   151: ifne -> 159
    //   154: dup2
    //   155: dup_x1
    //   156: goto -> 65
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iload_0
    //   163: if_icmpgt -> 62
    //   166: pop
    //   167: new java/lang/String
    //   170: dup_x1
    //   171: swap
    //   172: invokespecial <init> : ([C)V
    //   175: invokevirtual intern : ()Ljava/lang/String;
    //   178: swap
    //   179: pop
    //   180: swap
    //   181: pop
    //   182: goto -> 34
    //   185: new me/frep/aegisguard/spigot/aegisguard_KN
    //   188: dup
    //   189: ldc 'X'
    //   191: iconst_0
    //   192: ldc 'X'
    //   194: iconst_0
    //   195: ldc 'x'
    //   197: getstatic me/frep/aegisguard/spigot/aegisguard_Xm.HORIZONTAL : Lme/frep/aegisguard/spigot/aegisguard_Xm;
    //   200: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lme/frep/aegisguard/spigot/aegisguard_Xm;)V
    //   203: putstatic me/frep/aegisguard/spigot/aegisguard_KN.X : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   206: new me/frep/aegisguard/spigot/aegisguard_KN
    //   209: dup
    //   210: ldc 'Y'
    //   212: iconst_1
    //   213: ldc 'Y'
    //   215: iconst_1
    //   216: ldc 'y'
    //   218: getstatic me/frep/aegisguard/spigot/aegisguard_Xm.VERTICAL : Lme/frep/aegisguard/spigot/aegisguard_Xm;
    //   221: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lme/frep/aegisguard/spigot/aegisguard_Xm;)V
    //   224: putstatic me/frep/aegisguard/spigot/aegisguard_KN.Y : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   227: new me/frep/aegisguard/spigot/aegisguard_KN
    //   230: dup
    //   231: ldc 'Z'
    //   233: iconst_2
    //   234: ldc 'Z'
    //   236: iconst_2
    //   237: ldc 'z'
    //   239: getstatic me/frep/aegisguard/spigot/aegisguard_Xm.HORIZONTAL : Lme/frep/aegisguard/spigot/aegisguard_Xm;
    //   242: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lme/frep/aegisguard/spigot/aegisguard_Xm;)V
    //   245: putstatic me/frep/aegisguard/spigot/aegisguard_KN.Z : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   248: invokestatic aegisguard_S : ()[Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   251: putstatic me/frep/aegisguard/spigot/aegisguard_KN.aegisguard_w : [Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   254: invokestatic newHashMap : ()Ljava/util/HashMap;
    //   257: putstatic me/frep/aegisguard/spigot/aegisguard_KN.aegisguard_p : Ljava/util/Map;
    //   260: iconst_3
    //   261: anewarray me/frep/aegisguard/spigot/aegisguard_KN
    //   264: dup
    //   265: iconst_0
    //   266: getstatic me/frep/aegisguard/spigot/aegisguard_KN.X : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   269: aastore
    //   270: dup
    //   271: iconst_1
    //   272: getstatic me/frep/aegisguard/spigot/aegisguard_KN.Y : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   275: aastore
    //   276: dup
    //   277: iconst_2
    //   278: getstatic me/frep/aegisguard/spigot/aegisguard_KN.Z : Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   281: aastore
    //   282: putstatic me/frep/aegisguard/spigot/aegisguard_KN.aegisguard_c : [Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   285: invokestatic values : ()[Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   288: astore_1
    //   289: aload_1
    //   290: arraylength
    //   291: istore_2
    //   292: iconst_0
    //   293: istore_3
    //   294: iload_3
    //   295: iload_2
    //   296: if_icmpge -> 329
    //   299: aload_1
    //   300: iload_3
    //   301: aaload
    //   302: astore #4
    //   304: getstatic me/frep/aegisguard/spigot/aegisguard_KN.aegisguard_p : Ljava/util/Map;
    //   307: aload #4
    //   309: invokevirtual aegisguard_t : ()Ljava/lang/String;
    //   312: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   315: aload #4
    //   317: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   322: pop
    //   323: iinc #3, 1
    //   326: goto -> 294
    //   329: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #354	-> 185
    //   #355	-> 206
    //   #356	-> 227
    //   #353	-> 248
    //   #357	-> 254
    //   #361	-> 260
    //   #416	-> 285
    //   #417	-> 289
    //   #419	-> 292
    //   #421	-> 299
    //   #422	-> 304
    //   #419	-> 323
    //   #424	-> 329
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
