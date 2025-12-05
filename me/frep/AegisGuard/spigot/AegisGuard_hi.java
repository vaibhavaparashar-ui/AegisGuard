package me.frep.aegisguard.spigot.AegisGuard_hi;

import java.io.File;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class aegisguard_hi {
  private final File aegisguard_F;
  
  private final FileConfiguration aegisguard_t;
  
  private static String aegisguard_p;
  
  private static final long a = aegisguard_e.a(3852756422707013202L, 5963811659414817320L, MethodHandles.lookup().lookupClass()).a(58382405557562L);
  
  private static final String b;
  
  public aegisguard_hi(String paramString) {
    String str = aegisguard_r();
    try {
      this.aegisguard_F = new File(aegisguard_K.INSTANCE.aegisguard_j().getDataFolder() + File.separator, paramString + b);
      this.aegisguard_t = (FileConfiguration)YamlConfiguration.loadConfiguration(this.aegisguard_F);
      if (str == null)
        AbstractCheck.aegisguard_g(new AbstractCheck[1]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public FileConfiguration aegisguard_i(Object[] paramArrayOfObject) {
    return this.aegisguard_t;
  }
  
  public void aegisguard_z(Object[] paramArrayOfObject) {
    try {
      aegisguard_i(new Object[0]).save(this.aegisguard_F);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void aegisguard_S(String paramString) {
    aegisguard_p = paramString;
  }
  
  public static String aegisguard_r() {
    return aegisguard_p;
  }
  
  static {
    long l = a ^ 0x23CF3F2D332FL;
    aegisguard_S("RPeXUc");
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
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
