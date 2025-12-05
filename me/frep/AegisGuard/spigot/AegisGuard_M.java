package me.frep.aegisguard.spigot.AegisGuard_M;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_KX;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.command.CommandSender;

public class aegisguard_M {
  private static int aegisguard_n;
  
  private static final long a = aegisguard_e.a(8039234383658012086L, -7648650635746368000L, MethodHandles.lookup().lookupClass()).a(136052760655942L);
  
  private static final String[] c;
  
  public void aegisguard_d(Object[] paramArrayOfObject) {
    CommandSender commandSender = (CommandSender)paramArrayOfObject[0];
    String str = (String)paramArrayOfObject[1];
    long l1 = ((Long)paramArrayOfObject[2]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x2B7223BA84ACL;
    (new Object[2])[1] = aegisguard_b0.aegisguard_L;
    new Object[2];
    (new Object[2])[1] = str.replaceAll(c[1], aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
    new Object[2];
    commandSender.sendMessage(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
    int i = aegisguard_z();
    try {
      if (i == 0)
        AbstractCheck.aegisguard_g(new AbstractCheck[3]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void aegisguard_y(Object[] paramArrayOfObject) {
    CommandSender commandSender = (CommandSender)paramArrayOfObject[0];
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x53A0D697CA7CL;
    new Object[3];
    aegisguard_d(new Object[] { null, null, Long.valueOf(l2), c[0], commandSender });
  }
  
  public static void aegisguard_Y(int paramInt) {
    aegisguard_n = paramInt;
  }
  
  public static int aegisguard_z() {
    return aegisguard_n;
  }
  
  public static int aegisguard_K() {
    int i = aegisguard_z();
    try {
      if (i == 0)
        return 87; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    long l = a ^ 0x216AC0AD8E11L;
    aegisguard_Y(15);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "\035Á\022ÁPÿ\0006ä\027Öó¯rÎ`\034ã§\006E\030%2\022ÑdË¥=<F&ÎÍc3\003ü½R\022\030õ© ú·\\­c dRõÙ\020ð\020tÁÕcCÑ\037T^p\036a6\032\027^").length();
    byte b2 = 64;
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
