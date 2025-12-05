package me.frep.aegisguard.spigot.AegisGuard_KX;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_e;

public final class aegisguard_KX {
  private static final long a = aegisguard_e.a(-8385948213983865316L, 1985282354492888256L, MethodHandles.lookup().lookupClass()).a(119893765205L);
  
  private static final String[] b;
  
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
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    long l = a ^ 0x76F1E06AD6B7L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "E\030W\r~µÐ\03048FC÷.þãü;î\031ab@\024=ÛV$BæøÂ50)å_ÕT¹, \032XÆeÆ®[¨¸E%]Ñ\017Ë¿Êà\020\004|¬Y2ìE¼Õdðoc¦").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private aegisguard_KX() {
    throw new UnsupportedOperationException(b[1]);
  }
  
  public static String aegisguard_q(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/String
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_KX.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: aload_1
    //   29: getstatic me/frep/aegisguard/spigot/aegisguard_KX.b : [Ljava/lang/String;
    //   32: astore #8
    //   34: aload #8
    //   36: iconst_2
    //   37: aaload
    //   38: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L : Ljava/lang/String;
    //   41: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   44: astore_1
    //   45: astore #4
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokestatic aegisguard_f : ([Ljava/lang/Object;)Z
    //   54: aload #4
    //   56: ifnonnull -> 192
    //   59: ifeq -> 190
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   68: athrow
    //   69: getstatic me/frep/aegisguard/spigot/aegisguard_KX.b : [Ljava/lang/String;
    //   72: iconst_0
    //   73: aaload
    //   74: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   77: astore #5
    //   79: aload #5
    //   81: aload_1
    //   82: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   85: astore #6
    //   87: aload #6
    //   89: invokevirtual find : ()Z
    //   92: ifeq -> 178
    //   95: aload_1
    //   96: aload #6
    //   98: invokevirtual start : ()I
    //   101: aload #6
    //   103: invokevirtual end : ()I
    //   106: invokevirtual substring : (II)Ljava/lang/String;
    //   109: astore #7
    //   111: aload_1
    //   112: aload #7
    //   114: new java/lang/StringBuilder
    //   117: dup
    //   118: invokespecial <init> : ()V
    //   121: aload #7
    //   123: invokestatic of : (Ljava/lang/String;)Lnet/md_5/bungee/api/ChatColor;
    //   126: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   129: ldc ''
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: invokevirtual toString : ()Ljava/lang/String;
    //   137: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   140: lload_2
    //   141: lconst_0
    //   142: lcmp
    //   143: iflt -> 189
    //   146: astore_1
    //   147: aload #5
    //   149: aload_1
    //   150: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   153: astore #6
    //   155: aload #4
    //   157: ifnonnull -> 188
    //   160: aload #4
    //   162: ifnull -> 87
    //   165: lload_2
    //   166: lconst_0
    //   167: lcmp
    //   168: ifle -> 155
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   177: athrow
    //   178: aload_1
    //   179: bipush #38
    //   181: sipush #167
    //   184: invokevirtual replace : (CC)Ljava/lang/String;
    //   187: astore_1
    //   188: aload_1
    //   189: areturn
    //   190: bipush #38
    //   192: aload_1
    //   193: invokestatic translateAlternateColorCodes : (CLjava/lang/String;)Ljava/lang/String;
    //   196: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 28
    //   #16	-> 47
    //   #17	-> 69
    //   #18	-> 79
    //   #20	-> 87
    //   #21	-> 95
    //   #22	-> 111
    //   #23	-> 147
    //   #24	-> 155
    //   #26	-> 178
    //   #27	-> 188
    //   #29	-> 190
    // Exception table:
    //   from	to	target	type
    //   47	62	65	java/lang/UnsupportedOperationException
    //   155	165	174	java/lang/UnsupportedOperationException
  }
}
