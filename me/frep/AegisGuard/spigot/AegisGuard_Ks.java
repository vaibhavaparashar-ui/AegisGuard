package me.frep.aegisguard.spigot.AegisGuard_Ks;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_KX;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class aegisguard_Ks implements Listener {
  private static int aegisguard_j;
  
  private static final long a = aegisguard_e.a(-6016983855923296059L, 223921919839097252L, MethodHandles.lookup().lookupClass()).a(18701345673761L);
  
  private static final String[] b;
  
  @EventHandler
  public void aegisguard_f(PlayerJoinEvent paramPlayerJoinEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_Ks.a : J
    //   3: ldc2_w 87330978763937
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 104935583316871
    //   13: lxor
    //   14: lstore #4
    //   16: pop2
    //   17: invokestatic aegisguard_q : ()I
    //   20: aload_1
    //   21: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   24: astore #7
    //   26: istore #6
    //   28: aload #7
    //   30: getstatic me/frep/aegisguard/spigot/aegisguard_Ks.b : [Ljava/lang/String;
    //   33: iconst_2
    //   34: aaload
    //   35: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   40: iload #6
    //   42: ifne -> 121
    //   45: ifeq -> 118
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Lp : Z
    //   58: iload #6
    //   60: ifne -> 121
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: ifeq -> 118
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   83: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   86: lload #4
    //   88: aload #7
    //   90: iconst_2
    //   91: anewarray java/lang/Object
    //   94: dup_x1
    //   95: swap
    //   96: iconst_1
    //   97: swap
    //   98: aastore
    //   99: dup_x2
    //   100: dup_x2
    //   101: pop
    //   102: invokestatic valueOf : (J)Ljava/lang/Long;
    //   105: iconst_0
    //   106: swap
    //   107: aastore
    //   108: invokevirtual aegisguard_t : ([Ljava/lang/Object;)V
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dV : Z
    //   121: ifeq -> 173
    //   124: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   127: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   130: aload #7
    //   132: iconst_1
    //   133: anewarray java/lang/Object
    //   136: dup_x1
    //   137: swap
    //   138: iconst_0
    //   139: swap
    //   140: aastore
    //   141: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   144: astore #8
    //   146: aload #8
    //   148: ifnonnull -> 156
    //   151: return
    //   152: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   155: athrow
    //   156: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dh : Ljava/util/List;
    //   159: aload #7
    //   161: aload #8
    //   163: <illegal opcode> accept : (Lorg/bukkit/entity/Player;Lme/frep/aegisguard/spigot/aegisguard_hu;)Ljava/util/function/Consumer;
    //   168: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   173: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   176: ifnonnull -> 194
    //   179: iinc #6, 1
    //   182: iload #6
    //   184: invokestatic aegisguard_d : (I)V
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   193: athrow
    //   194: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #18	-> 20
    //   #20	-> 28
    //   #21	-> 80
    //   #23	-> 118
    //   #24	-> 124
    //   #26	-> 146
    //   #28	-> 156
    //   #32	-> 173
    // Exception table:
    //   from	to	target	type
    //   28	48	51	java/lang/RuntimeException
    //   45	63	66	java/lang/RuntimeException
    //   55	73	76	java/lang/RuntimeException
    //   70	111	114	java/lang/RuntimeException
    //   146	152	152	java/lang/RuntimeException
    //   173	187	190	java/lang/RuntimeException
  }
  
  private static void lambda$onJoin$0(Player paramPlayer, aegisguard_hu paramaegisguard_hu, String paramString) {
    long l1 = a ^ 0x6CC66BBE51AFL, l2 = l1 ^ 0x31E0D1124F4EL;
    String[] arrayOfString = b;
    (new Object[2])[1] = paramString
      .replaceAll(arrayOfString[0], paramaegisguard_hu.getClientBrand())
      .replaceAll(arrayOfString[3], paramPlayer.getName());
    new Object[2];
    paramPlayer.sendMessage(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  @EventHandler
  public void aegisguard_B(PlayerQuitEvent paramPlayerQuitEvent) {
    long l = a ^ 0x34237B169E41L;
    int i = (int)((l ^ 0x455BD80585E7L) >>> 32L), j = (int)((l ^ 0x455BD80585E7L) << 32L >>> 48L), k = (int)((l ^ 0x455BD80585E7L) << 48L >>> 48L);
    l ^ 0x455BD80585E7L;
    Player player = paramPlayerQuitEvent.getPlayer();
    int m = aegisguard_x();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (m != 0)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_C_(new Object[0])) {
        aegisguard_K.INSTANCE.aegisguard_l().aegisguard_H(new Object[] { aegisguard_b0.aegisguard_M0.replaceAll(b[1], player.getName()) });
        aegisguard_b0.aegisguard_s.forEach(player::lambda$onQuit$1);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      aegisguard_K.INSTANCE.aegisguard_l().aegisguard_l(new Object[0]).remove(player);
      aegisguard_K.INSTANCE.aegisguard_l().aegisguard_a(new Object[0]).remove(player);
      aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_T(new Object[] { null, null, null, Integer.valueOf((short)k), Integer.valueOf((short)j), player, Integer.valueOf(i) });
      aegisguard_K.INSTANCE.aegisguard_Y().remove(player.getUniqueId());
      if (m == 0)
        AbstractCheck.aegisguard_g(new AbstractCheck[5]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static void lambda$onQuit$1(Player paramPlayer, String paramString) {
    long l1 = a ^ 0x75EC39B9F56L, l2 = l1 ^ 0x5A78793781B7L, l3 = l1 ^ 0x6609ACBC3CB0L;
    (new Object[2])[1] = paramString.replaceAll(b[3], paramPlayer.getName());
    new Object[2];
    new Object[2];
    aegisguard_Xz.aegisguard_k(new Object[] { null, Long.valueOf(l3), aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }) });
  }
  
  public static void aegisguard_d(int paramInt) {
    aegisguard_j = paramInt;
  }
  
  public static int aegisguard_q() {
    return aegisguard_j;
  }
  
  public static int aegisguard_x() {
    int i = aegisguard_q();
    try {
      if (i == 0)
        return 93; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    long l = a ^ 0x28D8A3BD44A8L;
    aegisguard_d(0);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "®º}&I²ò¿?¹I)F\021åV\020àT,Ö L\026á=ü\"\036s").length();
    byte b2 = 16;
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
