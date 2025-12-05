package me.frep.aegisguard.spigot.AegisGuard_D;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_e;

public final class aegisguard_D {
  private static final long a = aegisguard_e.a(687409899829597008L, -2889113603100931617L, MethodHandles.lookup().lookupClass()).a(72650149618786L);
  
  private static final String b;
  
  private aegisguard_D() {
    throw new UnsupportedOperationException(b);
  }
  
  public static boolean aegisguard_G(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/util/Collection
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/util/function/Predicate
    //   14: astore #4
    //   16: dup
    //   17: iconst_2
    //   18: aaload
    //   19: checkcast java/lang/Long
    //   22: invokevirtual longValue : ()J
    //   25: lstore_1
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_D.a : J
    //   30: lload_1
    //   31: lxor
    //   32: lstore_1
    //   33: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   36: astore #5
    //   38: aload #4
    //   40: ifnonnull -> 49
    //   43: iconst_0
    //   44: ireturn
    //   45: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   48: athrow
    //   49: aload_3
    //   50: invokeinterface iterator : ()Ljava/util/Iterator;
    //   55: astore #6
    //   57: aload #6
    //   59: invokeinterface hasNext : ()Z
    //   64: ifeq -> 125
    //   67: aload #6
    //   69: invokeinterface next : ()Ljava/lang/Object;
    //   74: astore #7
    //   76: aload #4
    //   78: aload #7
    //   80: invokeinterface test : (Ljava/lang/Object;)Z
    //   85: aload #5
    //   87: lload_1
    //   88: lconst_0
    //   89: lcmp
    //   90: ifle -> 98
    //   93: ifnonnull -> 126
    //   96: aload #5
    //   98: ifnonnull -> 119
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: ifeq -> 120
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   117: athrow
    //   118: iconst_1
    //   119: ireturn
    //   120: aload #5
    //   122: ifnull -> 57
    //   125: iconst_0
    //   126: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 38
    //   #14	-> 49
    //   #15	-> 76
    //   #16	-> 118
    //   #18	-> 120
    //   #20	-> 125
    // Exception table:
    //   from	to	target	type
    //   38	45	45	java/lang/UnsupportedOperationException
    //   76	101	104	java/lang/UnsupportedOperationException
    //   96	111	114	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_O(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/util/Collection
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast java/util/function/Predicate
    //   24: astore #4
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_D.a : J
    //   30: lload_2
    //   31: lxor
    //   32: lstore_2
    //   33: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   36: astore #5
    //   38: aload #4
    //   40: ifnonnull -> 49
    //   43: iconst_0
    //   44: ireturn
    //   45: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   48: athrow
    //   49: aload_1
    //   50: invokeinterface iterator : ()Ljava/util/Iterator;
    //   55: astore #6
    //   57: aload #6
    //   59: invokeinterface hasNext : ()Z
    //   64: ifeq -> 125
    //   67: aload #6
    //   69: invokeinterface next : ()Ljava/lang/Object;
    //   74: astore #7
    //   76: aload #4
    //   78: aload #7
    //   80: invokeinterface test : (Ljava/lang/Object;)Z
    //   85: aload #5
    //   87: lload_2
    //   88: lconst_0
    //   89: lcmp
    //   90: iflt -> 98
    //   93: ifnonnull -> 126
    //   96: aload #5
    //   98: ifnonnull -> 119
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: ifne -> 120
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   117: athrow
    //   118: iconst_0
    //   119: ireturn
    //   120: aload #5
    //   122: ifnull -> 57
    //   125: iconst_1
    //   126: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #24	-> 38
    //   #26	-> 49
    //   #27	-> 76
    //   #28	-> 120
    //   #30	-> 125
    // Exception table:
    //   from	to	target	type
    //   38	45	45	java/lang/UnsupportedOperationException
    //   76	101	104	java/lang/UnsupportedOperationException
    //   96	111	114	java/lang/UnsupportedOperationException
  }
  
  static {
    long l = a ^ 0x7EA5816F541L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
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
