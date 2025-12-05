package me.frep.aegisguard.spigot.AegisGuard_s;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public final class aegisguard_s {
  private static final long a = aegisguard_e.a(14586123634536204L, 7650306914886966761L, MethodHandles.lookup().lookupClass()).a(111784534163864L);
  
  private static final String b;
  
  private aegisguard_s() {
    throw new UnsupportedOperationException(b);
  }
  
  public static boolean aegisguard_B(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    int j = ((Integer)paramArrayOfObject[2]).intValue();
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        try {
        
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - i > j);
  }
  
  public static boolean aegisguard_m(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue(), l2 = ((Long)paramArrayOfObject[1]).longValue(), l3 = ((Long)paramArrayOfObject[2]).longValue();
    l3 = a ^ l3;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (System.currentTimeMillis() - l1 > l2) {
        
        } else {
          return false;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x71649CDE472DL;
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
