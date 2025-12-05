package me.frep.aegisguard.spigot.AegisGuard_hq;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_I;
import me.frep.aegisguard.spigot.aegisguard_KN;
import me.frep.aegisguard.spigot.aegisguard_Kc;
import me.frep.aegisguard.spigot.aegisguard_Ko;
import me.frep.aegisguard.spigot.aegisguard_Kr;
import me.frep.aegisguard.spigot.aegisguard_XZ;
import me.frep.aegisguard.spigot.aegisguard_e;

public enum aegisguard_hq implements aegisguard_Ko {
  public static final me.frep.aegisguard.spigot.aegisguard_hq DOWN;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hq UP;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hq NORTH;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hq SOUTH;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hq WEST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_hq EAST;
  
  private final int aegisguard_G;
  
  private final int aegisguard_q;
  
  private final int aegisguard_F;
  
  private final String aegisguard_h;
  
  private final aegisguard_KN aegisguard_s;
  
  private final aegisguard_XZ aegisguard_d;
  
  private final aegisguard_Kr aegisguard_i;
  
  private static final me.frep.aegisguard.spigot.aegisguard_hq[] aegisguard_u;
  
  private static final me.frep.aegisguard.spigot.aegisguard_hq[] aegisguard_C;
  
  private static final Map aegisguard_b;
  
  private static final String aegisguard_P;
  
  private static final me.frep.aegisguard.spigot.aegisguard_hq[] aegisguard_v;
  
  private static final long a;
  
  private static final String[] b;
  
  private static me.frep.aegisguard.spigot.aegisguard_hq[] aegisguard_a() {
    return new me.frep.aegisguard.spigot.aegisguard_hq[] { DOWN, UP, NORTH, SOUTH, WEST, EAST };
  }
  
  static {
    long l;
    byte b1;
    for (a = aegisguard_e.a(883611488181501494L, -8565290699159358670L, MethodHandles.lookup().lookupClass()).a(33283703251579L), l = a ^ 0x7673B583B77BL, (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[18];
    boolean bool = false;
    String str;
    int i = (str = "80ýÁQ\000¹\bóc?£¯ð»\b\003Í óx\035\022\b5l$\024G(\033 õÀõ&&-ïQtÈïÃºjÜ2ð<z3\026Øà\bz¾\021}È,9\001Ã^0\bÆ&cP\0264j»\b#¶µ\025,þØ\bÛZÃ¸xA\\ \033 õÀõ&&-äd\013ÓÁ¾\025I°¢Í³\016o½Oõª<\bëñÂZUÙ±,\020£$¹ûÂ6$Ünµ\036¤ókU(\033 õÀõ&&-\020\023ÁûY?+|×\007ÙâV£q¡ü :FA,\034~¼<°cl\bt£ú¢Ç\013jy\blà'Ìc(\033 õÀõ&&-ËP\036\007*\035ÃL¥E4Ù\001\r6üôRè[ÓÞx\033¶\n`}^\b*Íö×¸èÆ").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  aegisguard_hq(int paramInt1, int paramInt2, int paramInt3, String paramString1, aegisguard_XZ paramaegisguard_XZ, aegisguard_KN paramaegisguard_KN, aegisguard_Kr paramaegisguard_Kr) {
    this.aegisguard_G = paramInt1;
    this.aegisguard_F = paramInt3;
    this.aegisguard_q = paramInt2;
    this.aegisguard_h = paramString1;
    this.aegisguard_s = paramaegisguard_KN;
    this.aegisguard_d = paramaegisguard_XZ;
    this.aegisguard_i = paramaegisguard_Kr;
  }
  
  public int aegisguard_g() {
    return this.aegisguard_G;
  }
  
  public int aegisguard_p() {
    return this.aegisguard_F;
  }
  
  public aegisguard_XZ aegisguard_B() {
    return this.aegisguard_d;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hq aegisguard_a() {
    return aegisguard_H(this.aegisguard_q);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hq aegisguard_U(aegisguard_KN paramaegisguard_KN) {
    long l = a ^ 0x24CB2A7F0E00L;
    int i = aegisguard_Kr.aegisguard__();
    try {
      switch (aegisguard_Kc.aegisguard_g[paramaegisguard_KN.ordinal()]) {
        case 1:
          try {
            if (i == 0)
              try {
                if (this != WEST)
                  try {
                    if (i == 0) {
                      try {
                        if (this != EAST)
                          return aegisguard_I(); 
                      } catch (IllegalStateException illegalStateException) {
                        throw a(null);
                      } 
                    } else {
                      return this;
                    } 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  }  
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return this;
        case 2:
          try {
            if (i == 0)
              try {
                if (this != UP)
                  try {
                    if (i == 0) {
                      try {
                        if (this != DOWN)
                          return aegisguard_G(); 
                      } catch (IllegalStateException illegalStateException) {
                        throw a(null);
                      } 
                    } else {
                      return this;
                    } 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  }  
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return this;
        case 3:
          try {
            if (i == 0)
              try {
                if (this != NORTH)
                  try {
                    if (i == 0) {
                      try {
                        if (this != SOUTH)
                          return aegisguard_Q(); 
                      } catch (IllegalStateException illegalStateException) {
                        throw a(null);
                      } 
                    } else {
                      return this;
                    } 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  }  
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return this;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(b[11] + paramaegisguard_KN);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hq aegisguard_G() {
    long l = a ^ 0x2C9B9F9EC893L;
    try {
      switch (aegisguard_Kc.aegisguard_h[ordinal()]) {
        case 1:
          return EAST;
        case 2:
          return SOUTH;
        case 3:
          return WEST;
        case 4:
          return NORTH;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(b[14] + this);
  }
  
  private me.frep.aegisguard.spigot.aegisguard_hq aegisguard_I() {
    long l = a ^ 0x1FBF789F124EL;
    try {
      switch (aegisguard_Kc.aegisguard_h[ordinal()]) {
        case 1:
          return DOWN;
        default:
          throw new IllegalStateException(b[16] + this);
        case 3:
          return UP;
        case 5:
          return NORTH;
        case 6:
          break;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return SOUTH;
  }
  
  private me.frep.aegisguard.spigot.aegisguard_hq aegisguard_Q() {
    long l = a ^ 0xC506CE45EEAL;
    try {
      switch (aegisguard_Kc.aegisguard_h[ordinal()]) {
        case 2:
          return DOWN;
        default:
          throw new IllegalStateException(b[4] + this);
        case 4:
          return UP;
        case 5:
          return EAST;
        case 6:
          break;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return WEST;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hq aegisguard_h() {
    long l = a ^ 0x1676C7E792CL;
    try {
      switch (aegisguard_Kc.aegisguard_h[ordinal()]) {
        case 1:
          return WEST;
        case 2:
          return NORTH;
        case 3:
          return EAST;
        case 4:
          return SOUTH;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(b[8] + this);
  }
  
  public int aegisguard_B() {
    long l = a ^ 0x5414C7622AE0L;
    int i = aegisguard_Kr.aegisguard__();
    try {
      if (i == 0)
        try {
          if (this.aegisguard_s == aegisguard_KN.X) {
          
          } else {
            return 0;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public int aegisguard_W() {
    long l = a ^ 0x59DAF42A06A2L;
    int i = aegisguard_Kr.aegisguard__();
    try {
      if (i == 0)
        try {
          if (this.aegisguard_s == aegisguard_KN.Y) {
          
          } else {
            return 0;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public int aegisguard_R() {
    long l = a ^ 0x40D0CE415149L;
    int i = aegisguard_Kr.aegisguard_I();
    try {
      if (i != 0)
        try {
          if (this.aegisguard_s == aegisguard_KN.Z) {
          
          } else {
            return 0;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public String aegisguard_D() {
    return this.aegisguard_h;
  }
  
  public aegisguard_KN aegisguard_y() {
    return this.aegisguard_s;
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_hq aegisguard_t(String paramString) {
    long l = a ^ 0x76CA0DCEDA62L;
    int i = aegisguard_Kr.aegisguard_I();
    try {
      if (i != 0) {
        try {
          if (paramString == null) {
          
          } else {
          
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return (me.frep.aegisguard.spigot.aegisguard_hq)aegisguard_b.get(paramString.toLowerCase());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_hq aegisguard_H(int paramInt) {
    long l1 = a ^ 0x68C9F8881794L, l2 = l1 ^ 0x2BF30CAE2D7FL;
    new Object[2];
    return aegisguard_u[aegisguard_I.aegisguard_T(new Object[] { null, Long.valueOf(l2), Integer.valueOf(paramInt % aegisguard_u.length) })];
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_hq aegisguard_U(int paramInt) {
    long l1 = a ^ 0x58FF789D4799L, l2 = l1 ^ 0x1BC58CBB7D72L;
    new Object[2];
    return aegisguard_C[aegisguard_I.aegisguard_T(new Object[] { null, Long.valueOf(l2), Integer.valueOf(paramInt % aegisguard_C.length) })];
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_hq aegisguard_R(double paramDouble) {
    long l1 = a ^ 0x55A40C446485L, l2 = l1 ^ 0x20C532FE27C4L;
    new Object[2];
    (new Object[2])[1] = Long.valueOf(l2);
    new Object[2];
    return aegisguard_U(aegisguard_I.aegisguard_v(new Object[] { Double.valueOf(paramDouble / 90.0D + 0.5D) }) & 0x3);
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_hq aegisguard_T(Random paramRandom) {
    return values()[paramRandom.nextInt((values()).length)];
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_hq aegisguard__(float paramFloat1, float paramFloat2, float paramFloat3) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_hq.a : J
    //   3: ldc2_w 36627869787662
    //   6: lxor
    //   7: lstore_3
    //   8: getstatic me/frep/aegisguard/spigot/aegisguard_hq.NORTH : Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   11: astore #6
    //   13: ldc_w 1.4E-45
    //   16: fstore #7
    //   18: invokestatic values : ()[Lme/frep/aegisguard/spigot/aegisguard_hq;
    //   21: astore #8
    //   23: invokestatic aegisguard_I : ()I
    //   26: aload #8
    //   28: arraylength
    //   29: istore #9
    //   31: iconst_0
    //   32: istore #10
    //   34: istore #5
    //   36: iload #10
    //   38: iload #9
    //   40: if_icmpge -> 140
    //   43: aload #8
    //   45: iload #10
    //   47: aaload
    //   48: iload #5
    //   50: ifeq -> 142
    //   53: astore #11
    //   55: fload_0
    //   56: aload #11
    //   58: getfield aegisguard_i : Lme/frep/aegisguard/spigot/aegisguard_Kr;
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_c : ([Ljava/lang/Object;)I
    //   68: i2f
    //   69: fmul
    //   70: fload_1
    //   71: aload #11
    //   73: getfield aegisguard_i : Lme/frep/aegisguard/spigot/aegisguard_Kr;
    //   76: iconst_0
    //   77: anewarray java/lang/Object
    //   80: invokevirtual aegisguard_K : ([Ljava/lang/Object;)I
    //   83: i2f
    //   84: fmul
    //   85: fadd
    //   86: fload_2
    //   87: aload #11
    //   89: getfield aegisguard_i : Lme/frep/aegisguard/spigot/aegisguard_Kr;
    //   92: iconst_0
    //   93: anewarray java/lang/Object
    //   96: invokevirtual aegisguard_l : ([Ljava/lang/Object;)I
    //   99: i2f
    //   100: fmul
    //   101: fadd
    //   102: fstore #12
    //   104: iload #5
    //   106: ifeq -> 135
    //   109: fload #12
    //   111: fload #7
    //   113: fcmpl
    //   114: ifle -> 132
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   123: athrow
    //   124: fload #12
    //   126: fstore #7
    //   128: aload #11
    //   130: astore #6
    //   132: iinc #10, 1
    //   135: iload #5
    //   137: ifne -> 36
    //   140: aload #6
    //   142: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #297	-> 8
    //   #298	-> 13
    //   #299	-> 18
    //   #300	-> 26
    //   #302	-> 31
    //   #304	-> 43
    //   #305	-> 55
    //   #307	-> 104
    //   #309	-> 124
    //   #310	-> 128
    //   #302	-> 132
    //   #314	-> 140
    // Exception table:
    //   from	to	target	type
    //   104	117	120	java/lang/IllegalStateException
  }
  
  public String toString() {
    return this.aegisguard_h;
  }
  
  public String aegisguard_O() {
    return this.aegisguard_h;
  }
  
  public aegisguard_Kr aegisguard_E() {
    return this.aegisguard_i;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
}
