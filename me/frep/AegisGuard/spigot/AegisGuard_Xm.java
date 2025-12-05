package me.frep.aegisguard.spigot.AegisGuard_Xm;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_Kc;
import me.frep.aegisguard.spigot.aegisguard_Kr;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hq;

public enum aegisguard_Xm implements Predicate, Iterable {
  public static final me.frep.aegisguard.spigot.aegisguard_Xm HORIZONTAL;
  
  public static final me.frep.aegisguard.spigot.aegisguard_Xm VERTICAL;
  
  private static final me.frep.aegisguard.spigot.aegisguard_Xm[] aegisguard_k;
  
  private static final String aegisguard_w;
  
  private static final me.frep.aegisguard.spigot.aegisguard_Xm[] aegisguard_o;
  
  private static final long a;
  
  private static final String[] b;
  
  private static me.frep.aegisguard.spigot.aegisguard_Xm[] aegisguard_b() {
    return new me.frep.aegisguard.spigot.aegisguard_Xm[] { HORIZONTAL, VERTICAL };
  }
  
  static {
    long l;
    byte b1;
    for (a = aegisguard_e.a(1229454884559809520L, -6697429490400922698L, MethodHandles.lookup().lookupClass()).a(126257220711069L), l = a ^ 0x6A2DED464781L, (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = ")[Ó\t\016\020S\\én°uh\r\0203$¾´-Ò¨ÔOÅ~HXý_\0203$¾´-Ò¨ÔOÅ~HXý_\020)[Ó\t\016\020S\\én°uh\r").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  public aegisguard_hq[] aegisguard_Y() {
    long l = a ^ 0x572E6CEFE03FL;
    int i = aegisguard_Kr.aegisguard__();
    try {
      if (i == 0) {
        switch (aegisguard_Kc.aegisguard_L[ordinal()]) {
          case 1:
            return new aegisguard_hq[] { aegisguard_hq.NORTH, aegisguard_hq.EAST, aegisguard_hq.SOUTH, aegisguard_hq.WEST };
          case 2:
            return new aegisguard_hq[] { aegisguard_hq.UP, aegisguard_hq.DOWN };
        } 
      } else {
        return new aegisguard_hq[] { aegisguard_hq.NORTH, aegisguard_hq.EAST, aegisguard_hq.SOUTH, aegisguard_hq.WEST };
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    throw new Error(b[5]);
  }
  
  public aegisguard_hq aegisguard_j(Random paramRandom) {
    aegisguard_hq[] arrayOfaegisguard_hq = aegisguard_Y();
    return arrayOfaegisguard_hq[paramRandom.nextInt(arrayOfaegisguard_hq.length)];
  }
  
  public boolean aegisguard_n(aegisguard_hq paramaegisguard_hq) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_Xm.a : J
    //   3: ldc2_w 116519939733686
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_I : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifeq -> 30
    //   19: ifnull -> 48
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: aload_1
    //   30: invokevirtual aegisguard_y : ()Lme/frep/aegisguard/spigot/aegisguard_KN;
    //   33: invokevirtual aegisguard_Q : ()Lme/frep/aegisguard/spigot/aegisguard_Xm;
    //   36: aload_0
    //   37: if_acmpne -> 48
    //   40: iconst_1
    //   41: goto -> 49
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: iconst_0
    //   49: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #483	-> 13
    // Exception table:
    //   from	to	target	type
    //   13	22	25	java/lang/RuntimeException
    //   30	44	44	java/lang/RuntimeException
  }
  
  public Iterator iterator() {
    return (Iterator)Iterators.forArray((Object[])aegisguard_Y());
  }
  
  public boolean apply(Object paramObject) {
    return aegisguard_n((aegisguard_hq)paramObject);
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
