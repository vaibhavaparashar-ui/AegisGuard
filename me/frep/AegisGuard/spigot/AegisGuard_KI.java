package me.frep.aegisguard.spigot.AegisGuard_KI;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hg;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public final class aegisguard_KI {
  private Object aegisguard_o;
  
  private Object aegisguard_A;
  
  private static final long a = aegisguard_e.a(6830315069433061390L, 4929345315621978480L, MethodHandles.lookup().lookupClass()).a(90850369800708L);
  
  private static final String[] b;
  
  public void aegisguard_F(Object[] paramArrayOfObject) {
    Object object = paramArrayOfObject[0];
  }
  
  public void aegisguard_Y(Object[] paramArrayOfObject) {
    Object object = paramArrayOfObject[0];
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_KI.a : J
    //   3: ldc2_w 8395714635417
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_q : ()[Ljava/lang/String;
    //   11: astore #4
    //   13: aload_1
    //   14: aload #4
    //   16: ifnonnull -> 37
    //   19: aload_0
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_1
    //   37: aload #4
    //   39: ifnonnull -> 62
    //   42: instanceof me/frep/aegisguard/spigot/aegisguard_KI
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/frep/aegisguard/spigot/aegisguard_KI
    //   65: astore #5
    //   67: aload_0
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   75: astore #6
    //   77: aload #5
    //   79: iconst_0
    //   80: anewarray java/lang/Object
    //   83: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore #7
    //   88: aload #6
    //   90: aload #4
    //   92: ifnonnull -> 134
    //   95: ifnonnull -> 132
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload #7
    //   107: aload #4
    //   109: ifnonnull -> 168
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: ifnull -> 160
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   128: athrow
    //   129: goto -> 154
    //   132: aload #6
    //   134: aload #4
    //   136: ifnonnull -> 168
    //   139: aload #7
    //   141: invokevirtual equals : (Ljava/lang/Object;)Z
    //   144: ifne -> 160
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: iconst_0
    //   155: ireturn
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: aload_0
    //   161: iconst_0
    //   162: anewarray java/lang/Object
    //   165: invokevirtual aegisguard_E : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   168: astore #8
    //   170: aload #5
    //   172: iconst_0
    //   173: anewarray java/lang/Object
    //   176: invokevirtual aegisguard_E : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   179: astore #9
    //   181: aload #8
    //   183: aload #4
    //   185: ifnonnull -> 219
    //   188: ifnonnull -> 217
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   197: athrow
    //   198: aload #9
    //   200: ifnull -> 245
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   209: athrow
    //   210: goto -> 239
    //   213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: aload #8
    //   219: aload #9
    //   221: invokevirtual equals : (Ljava/lang/Object;)Z
    //   224: aload #4
    //   226: ifnonnull -> 246
    //   229: ifne -> 245
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: iconst_0
    //   240: ireturn
    //   241: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   244: athrow
    //   245: iconst_1
    //   246: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #6	-> 13
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	48	51	java/lang/RuntimeException
    //   42	57	57	java/lang/RuntimeException
    //   88	98	101	java/lang/RuntimeException
    //   95	112	115	java/lang/RuntimeException
    //   105	122	125	java/lang/RuntimeException
    //   134	147	150	java/lang/RuntimeException
    //   139	156	156	java/lang/RuntimeException
    //   181	191	194	java/lang/RuntimeException
    //   188	203	206	java/lang/RuntimeException
    //   198	213	213	java/lang/RuntimeException
    //   219	232	235	java/lang/RuntimeException
    //   229	241	241	java/lang/RuntimeException
  }
  
  public int hashCode() {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_KI.a : J
    //   3: ldc2_w 125224126974150
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_q : ()[Ljava/lang/String;
    //   11: bipush #59
    //   13: istore #4
    //   15: astore_3
    //   16: iconst_1
    //   17: istore #5
    //   19: aload_0
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   27: astore #6
    //   29: iload #5
    //   31: bipush #59
    //   33: imul
    //   34: aload #6
    //   36: aload_3
    //   37: ifnonnull -> 61
    //   40: ifnonnull -> 59
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   49: athrow
    //   50: bipush #43
    //   52: goto -> 64
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: aload #6
    //   61: invokevirtual hashCode : ()I
    //   64: iadd
    //   65: istore #5
    //   67: aload_0
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_E : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   75: astore #7
    //   77: iload #5
    //   79: bipush #59
    //   81: imul
    //   82: aload #7
    //   84: aload_3
    //   85: ifnonnull -> 109
    //   88: ifnonnull -> 107
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   97: athrow
    //   98: bipush #43
    //   100: goto -> 112
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: aload #7
    //   109: invokevirtual hashCode : ()I
    //   112: iadd
    //   113: istore #5
    //   115: iload #5
    //   117: aload_3
    //   118: ifnull -> 135
    //   121: iconst_1
    //   122: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   125: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #6	-> 11
    // Exception table:
    //   from	to	target	type
    //   29	43	46	java/lang/RuntimeException
    //   40	55	55	java/lang/RuntimeException
    //   77	91	94	java/lang/RuntimeException
    //   88	103	103	java/lang/RuntimeException
    //   115	128	131	java/lang/RuntimeException
  }
  
  public String toString() {
    long l = a ^ 0x1B9FFB83207L;
    String[] arrayOfString = aegisguard_hg.aegisguard_q();
    try {
      if (AbstractCheck.aegisguard_B() == null)
        aegisguard_hg.aegisguard_m(new String[4]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b[0] + aegisguard_O(new Object[0]) + b[1] + aegisguard_E(new Object[0]) + ")";
  }
  
  public aegisguard_KI(Object paramObject1, Object paramObject2) {
    this.aegisguard_o = paramObject1;
    this.aegisguard_A = paramObject2;
  }
  
  public Object aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_o;
  }
  
  public Object aegisguard_E(Object[] paramArrayOfObject) {
    return this.aegisguard_A;
  }
  
  static {
    long l = a ^ 0x7028ABB70634L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "\024>¶\000®s`A\bÓ)£\005E¥v\026").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
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
