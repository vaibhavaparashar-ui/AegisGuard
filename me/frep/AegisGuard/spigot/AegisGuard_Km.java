package me.frep.aegisguard.spigot.AegisGuard_Km;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_Kr;
import me.frep.aegisguard.spigot.aegisguard_d;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hQ;
import me.frep.aegisguard.spigot.aegisguard_hq;
import me.frep.aegisguard.spigot.aegisguard_m;
import org.bukkit.entity.Entity;

public class aegisguard_Km extends aegisguard_Kr {
  public static final me.frep.aegisguard.spigot.aegisguard_Km aegisguard_T;
  
  private static final int aegisguard_A;
  
  private static final int aegisguard_E;
  
  private static final int aegisguard_Y;
  
  private static final int aegisguard_i;
  
  private static final int aegisguard_y;
  
  private static final long aegisguard_D;
  
  private static final long aegisguard_Z;
  
  private static final long aegisguard_L;
  
  private static final String aegisguard_W;
  
  private static final String[] b;
  
  static {
    byte b1;
    long l1, l2;
    for (l1 = aegisguard_e.a(-3950559231881390216L, -1693440097304144849L, MethodHandles.lookup().lookupClass()).a(151623628102432L) ^ 0x1347741F0C95L, l2 = l1 ^ 0x4EC14E469D70L, (new byte[8])[0] = (byte)(int)(l1 >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l1 << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "Í±Þ\022f '\037ß]Ä\007ì±;R~\"§Þ\020ä:\f&%\016ÉY\026\034O¡õç").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  public aegisguard_Km(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public aegisguard_Km(double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramDouble1, paramDouble2, paramDouble3);
  }
  
  public aegisguard_Km(Entity paramEntity) {
    this(paramEntity.getLocation().getX(), paramEntity.getLocation().getY(), paramEntity.getLocation().getZ());
  }
  
  public aegisguard_Km(aegisguard_m paramaegisguard_m) {
    this(paramaegisguard_m.aegisguard_p, paramaegisguard_m.aegisguard_x, paramaegisguard_m.aegisguard_G);
  }
  
  public aegisguard_Km(aegisguard_Kr paramaegisguard_Kr) {
    this(paramaegisguard_Kr.aegisguard_c(new Object[0]), paramaegisguard_Kr.aegisguard_K(new Object[0]), paramaegisguard_Kr.aegisguard_l(new Object[0]));
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_n(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    return new me.frep.aegisguard.spigot.aegisguard_Km(aegisguard_c(new Object[0]) + d1, aegisguard_K(new Object[0]) + d2, aegisguard_l(new Object[0]) + d3);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_x(Object[] paramArrayOfObject) {
    int j = ((Integer)paramArrayOfObject[0]).intValue(), i = ((Integer)paramArrayOfObject[1]).intValue(), k = ((Integer)paramArrayOfObject[2]).intValue();
    return new me.frep.aegisguard.spigot.aegisguard_Km(aegisguard_c(new Object[0]) + j, aegisguard_K(new Object[0]) + i, aegisguard_l(new Object[0]) + k);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_C(Object[] paramArrayOfObject) {
    aegisguard_Kr aegisguard_Kr = (aegisguard_Kr)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_Km(aegisguard_c(new Object[0]) + aegisguard_Kr.aegisguard_c(new Object[0]), aegisguard_K(new Object[0]) + aegisguard_Kr.aegisguard_K(new Object[0]), aegisguard_l(new Object[0]) + aegisguard_Kr.aegisguard_l(new Object[0]));
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_V(Object[] paramArrayOfObject) {
    aegisguard_Kr aegisguard_Kr = (aegisguard_Kr)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_Km(aegisguard_c(new Object[0]) - aegisguard_Kr.aegisguard_c(new Object[0]), aegisguard_K(new Object[0]) - aegisguard_Kr.aegisguard_K(new Object[0]), aegisguard_l(new Object[0]) - aegisguard_Kr.aegisguard_l(new Object[0]));
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_i(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    return new me.frep.aegisguard.spigot.aegisguard_Km(aegisguard_c(new Object[0]) * i, aegisguard_K(new Object[0]) * i, aegisguard_l(new Object[0]) * i);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_o(Object[] paramArrayOfObject) {
    return aegisguard_D(new Object[] { Integer.valueOf(1) });
  }
  
  public static String spigot() {
    return b[2];
  }
  
  public static String nonce() {
    return b[1];
  }
  
  public static String resource() {
    return b[0];
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_D(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    return aegisguard_p(new Object[] { null, Integer.valueOf(i), aegisguard_hq.UP });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_M(Object[] paramArrayOfObject) {
    return aegisguard_K(new Object[] { Integer.valueOf(1) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_K(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    return aegisguard_p(new Object[] { null, Integer.valueOf(i), aegisguard_hq.DOWN });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_f(Object[] paramArrayOfObject) {
    return aegisguard_H(new Object[] { Integer.valueOf(1) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_H(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    return aegisguard_p(new Object[] { null, Integer.valueOf(i), aegisguard_hq.NORTH });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_L(Object[] paramArrayOfObject) {
    return aegisguard_G(new Object[] { Integer.valueOf(1) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_G(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    return aegisguard_p(new Object[] { null, Integer.valueOf(i), aegisguard_hq.SOUTH });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_A(Object[] paramArrayOfObject) {
    return aegisguard_j(new Object[] { Integer.valueOf(1) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_j(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    return aegisguard_p(new Object[] { null, Integer.valueOf(i), aegisguard_hq.WEST });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_d(Object[] paramArrayOfObject) {
    return aegisguard_Y(new Object[] { Integer.valueOf(1) });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_Y(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    return aegisguard_p(new Object[] { null, Integer.valueOf(i), aegisguard_hq.EAST });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_T(Object[] paramArrayOfObject) {
    aegisguard_hq aegisguard_hq = (aegisguard_hq)paramArrayOfObject[0];
    return aegisguard_p(new Object[] { null, Integer.valueOf(1), aegisguard_hq });
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_p(Object[] paramArrayOfObject) {
    aegisguard_hq aegisguard_hq = (aegisguard_hq)paramArrayOfObject[0];
    int i = ((Integer)paramArrayOfObject[1]).intValue();
    return new me.frep.aegisguard.spigot.aegisguard_Km(aegisguard_c(new Object[0]) + aegisguard_hq.aegisguard_B() * i, aegisguard_K(new Object[0]) + aegisguard_hq.aegisguard_W() * i, aegisguard_l(new Object[0]) + aegisguard_hq.aegisguard_R() * i);
  }
  
  public me.frep.aegisguard.spigot.aegisguard_Km aegisguard_X(Object[] paramArrayOfObject) {
    aegisguard_Kr aegisguard_Kr = (aegisguard_Kr)paramArrayOfObject[0];
    return new me.frep.aegisguard.spigot.aegisguard_Km(aegisguard_K(new Object[0]) * aegisguard_Kr.aegisguard_l(new Object[0]) - aegisguard_l(new Object[0]) * aegisguard_Kr.aegisguard_K(new Object[0]), aegisguard_l(new Object[0]) * aegisguard_Kr.aegisguard_c(new Object[0]) - aegisguard_c(new Object[0]) * aegisguard_Kr.aegisguard_l(new Object[0]), aegisguard_c(new Object[0]) * aegisguard_Kr.aegisguard_K(new Object[0]) - aegisguard_K(new Object[0]) * aegisguard_Kr.aegisguard_c(new Object[0]));
  }
  
  public long aegisguard_H(Object[] paramArrayOfObject) {
    return (aegisguard_c(new Object[0]) & aegisguard_D) << aegisguard_y | (aegisguard_K(new Object[0]) & aegisguard_Z) << aegisguard_i | (aegisguard_l(new Object[0]) & aegisguard_L) << 0L;
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_Km aegisguard_h(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    int i = (int)(l << 64 - aegisguard_y - aegisguard_A >> 64 - aegisguard_A);
    int j = (int)(l << 64 - aegisguard_i - aegisguard_Y >> 64 - aegisguard_Y);
    int k = (int)(l << 64 - aegisguard_E >> 64 - aegisguard_E);
    return new me.frep.aegisguard.spigot.aegisguard_Km(i, j, k);
  }
  
  public static Iterable aegisguard_a(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_Km aegisguard_Km2 = (me.frep.aegisguard.spigot.aegisguard_Km)paramArrayOfObject[0], aegisguard_Km1 = (me.frep.aegisguard.spigot.aegisguard_Km)paramArrayOfObject[1], aegisguard_Km3 = new me.frep.aegisguard.spigot.aegisguard_Km(Math.min(aegisguard_Km2.aegisguard_c(new Object[0]), aegisguard_Km1.aegisguard_c(new Object[0])), Math.min(aegisguard_Km2.aegisguard_K(new Object[0]), aegisguard_Km1.aegisguard_K(new Object[0])), Math.min(aegisguard_Km2.aegisguard_l(new Object[0]), aegisguard_Km1.aegisguard_l(new Object[0])));
    me.frep.aegisguard.spigot.aegisguard_Km aegisguard_Km4 = new me.frep.aegisguard.spigot.aegisguard_Km(Math.max(aegisguard_Km2.aegisguard_c(new Object[0]), aegisguard_Km1.aegisguard_c(new Object[0])), Math.max(aegisguard_Km2.aegisguard_K(new Object[0]), aegisguard_Km1.aegisguard_K(new Object[0])), Math.max(aegisguard_Km2.aegisguard_l(new Object[0]), aegisguard_Km1.aegisguard_l(new Object[0])));
    return (Iterable)new aegisguard_d(aegisguard_Km3, aegisguard_Km4);
  }
  
  public static Iterable aegisguard_J(Object[] paramArrayOfObject) {
    me.frep.aegisguard.spigot.aegisguard_Km aegisguard_Km1 = (me.frep.aegisguard.spigot.aegisguard_Km)paramArrayOfObject[0], aegisguard_Km2 = (me.frep.aegisguard.spigot.aegisguard_Km)paramArrayOfObject[1], aegisguard_Km3 = new me.frep.aegisguard.spigot.aegisguard_Km(Math.min(aegisguard_Km1.aegisguard_c(new Object[0]), aegisguard_Km2.aegisguard_c(new Object[0])), Math.min(aegisguard_Km1.aegisguard_K(new Object[0]), aegisguard_Km2.aegisguard_K(new Object[0])), Math.min(aegisguard_Km1.aegisguard_l(new Object[0]), aegisguard_Km2.aegisguard_l(new Object[0])));
    me.frep.aegisguard.spigot.aegisguard_Km aegisguard_Km4 = new me.frep.aegisguard.spigot.aegisguard_Km(Math.max(aegisguard_Km1.aegisguard_c(new Object[0]), aegisguard_Km2.aegisguard_c(new Object[0])), Math.max(aegisguard_Km1.aegisguard_K(new Object[0]), aegisguard_Km2.aegisguard_K(new Object[0])), Math.max(aegisguard_Km1.aegisguard_l(new Object[0]), aegisguard_Km2.aegisguard_l(new Object[0])));
    return (Iterable)new aegisguard_hQ(aegisguard_Km3, aegisguard_Km4);
  }
  
  public aegisguard_Kr aegisguard_S(Object[] paramArrayOfObject) {
    aegisguard_Kr aegisguard_Kr = (aegisguard_Kr)paramArrayOfObject[0];
    return aegisguard_X(new Object[] { aegisguard_Kr });
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
