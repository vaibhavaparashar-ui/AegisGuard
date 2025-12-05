package me.frep.aegisguard.spigot.AegisGuard_Xz;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.manager.server.ServerVersion;
import io.github.retrooper.packetevents.util.SpigotReflectionUtil;
import java.lang.invoke.MethodHandles;
import java.util.logging.Level;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_KX;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public final class aegisguard_Xz {
  private static final boolean aegisguard_A;
  
  private static final boolean aegisguard_T;
  
  private static final boolean aegisguard_t;
  
  private static final boolean aegisguard_B;
  
  private static final boolean aegisguard_E;
  
  private static final boolean aegisguard_q;
  
  private static final boolean aegisguard_d;
  
  private static final boolean aegisguard_W;
  
  private static final boolean aegisguard_k;
  
  private static final boolean aegisguard_N;
  
  private static final boolean aegisguard_h;
  
  private static final boolean aegisguard_Q;
  
  private static final boolean aegisguard_O;
  
  private static final boolean aegisguard_L;
  
  private static final boolean aegisguard__;
  
  private static final boolean aegisguard_m;
  
  private static final boolean aegisguard_i;
  
  private static AbstractCheck[] aegisguard_s;
  
  private aegisguard_Xz() {
    throw new UnsupportedOperationException(b[0]);
  }
  
  private static final long a = aegisguard_e.a(6117803836599543577L, 8288413388129492382L, MethodHandles.lookup().lookupClass()).a(183749598071010L);
  
  private static final String[] b;
  
  static {
    long l = a ^ 0x66BF24E30FF6L;
    aegisguard_L(null);
    byte b1;
    for ((new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "¹³ª²y6Ôô(|gP?óyÊD8¹¼^Æ³Kkü­iöÜÀfÿUâHu\034¤Bçùr\021¢ÝÛïK\020Ö{£¤Ìó>ôoúI)\\Øk").length();
    byte b2 = 56;
    byte b = -1;
    while (true);
  }
  
  public static double aegisguard_S(Object[] paramArrayOfObject) {
    return Math.min(20.0D, SpigotReflectionUtil.getTPS());
  }
  
  public static void aegisguard_S(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    String str = (String)paramArrayOfObject[1];
    l1 = a ^ l1;
    long l2 = l1 ^ 0xDC2BD37AA75L;
    (new Object[2])[1] = str;
    new Object[2];
    aegisguard_K.INSTANCE.aegisguard_e().log(Level.INFO, aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public static void aegisguard_F(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x71604F1B3000L;
    (new Object[2])[1] = str;
    new Object[2];
    aegisguard_K.INSTANCE.aegisguard_e().log(Level.INFO, aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public static ServerVersion aegisguard_M(Object[] paramArrayOfObject) {
    return PacketEvents.getAPI().getServerManager().getVersion();
  }
  
  public static boolean aegisguard_l(Object[] paramArrayOfObject) {
    return aegisguard_h;
  }
  
  public static boolean aegisguard_Z(Object[] paramArrayOfObject) {
    return aegisguard_L;
  }
  
  public static boolean aegisguard_v(Object[] paramArrayOfObject) {
    return aegisguard_Q;
  }
  
  public static boolean aegisguard_A(Object[] paramArrayOfObject) {
    return aegisguard_N;
  }
  
  public static boolean aegisguard_n(Object[] paramArrayOfObject) {
    return aegisguard_A;
  }
  
  public static boolean aegisguard_M(Object[] paramArrayOfObject) {
    return aegisguard_q;
  }
  
  public static boolean aegisguard_S(Object[] paramArrayOfObject) {
    return aegisguard_T;
  }
  
  public static boolean aegisguard_Q(Object[] paramArrayOfObject) {
    return aegisguard_d;
  }
  
  public static boolean aegisguard_f(Object[] paramArrayOfObject) {
    return aegisguard_W;
  }
  
  public static boolean aegisguard_y(Object[] paramArrayOfObject) {
    return aegisguard_t;
  }
  
  public static boolean aegisguard_c(Object[] paramArrayOfObject) {
    return aegisguard_B;
  }
  
  public static boolean aegisguard_w(Object[] paramArrayOfObject) {
    return aegisguard_E;
  }
  
  public static boolean aegisguard_h(Object[] paramArrayOfObject) {
    return aegisguard_O;
  }
  
  public static boolean aegisguard_H(Object[] paramArrayOfObject) {
    return aegisguard_i;
  }
  
  public static boolean aegisguard_m(Object[] paramArrayOfObject) {
    return aegisguard__;
  }
  
  public static boolean aegisguard_I(Object[] paramArrayOfObject) {
    return aegisguard_m;
  }
  
  public static void aegisguard_Z(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    Object object = paramArrayOfObject[1];
    l = a ^ l;
    try {
      if (aegisguard_b0.aegisguard_Mx)
        aegisguard_y(b[1] + object); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public static void aegisguard_k(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x585411EEE4E4L;
    (new Object[2])[1] = str;
    new Object[2];
    Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public static void aegisguard_y(String paramString) {
    long l1 = a ^ 0x3A4A7C1D7B3CL, l2 = l1 ^ 0x1C63662B1636L;
    (new Object[2])[1] = paramString;
    new Object[2];
    Bukkit.broadcastMessage(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public static boolean aegisguard_L(Object[] paramArrayOfObject) {
    return aegisguard_k;
  }
  
  public static void aegisguard_L(AbstractCheck[] paramArrayOfAbstractCheck) {
    aegisguard_s = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] aegisguard_z() {
    return aegisguard_s;
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
