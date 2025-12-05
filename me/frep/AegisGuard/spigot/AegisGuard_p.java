package me.frep.aegisguard.spigot.AegisGuard_p;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_KX;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class aegisguard_p implements PluginMessageListener {
  private static int[] aegisguard_k;
  
  private static final long a = aegisguard_e.a(-849860960796170236L, 6473420938570249145L, MethodHandles.lookup().lookupClass()).a(160740914709673L);
  
  private static final String[] b;
  
  public void onPluginMessageReceived(String paramString, Player paramPlayer, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_p.a : J
    //   3: ldc2_w 44774637660199
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 124032956683650
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 32250176031839
    //   22: lxor
    //   23: lstore #8
    //   25: pop2
    //   26: invokestatic aegisguard_i : ()[I
    //   29: astore #10
    //   31: aload_3
    //   32: arraylength
    //   33: ifne -> 37
    //   36: return
    //   37: new java/lang/String
    //   40: dup
    //   41: aload_3
    //   42: getstatic me/frep/aegisguard/spigot/aegisguard_p.b : [Ljava/lang/String;
    //   45: astore #12
    //   47: aload #12
    //   49: iconst_4
    //   50: aaload
    //   51: invokespecial <init> : ([BLjava/lang/String;)V
    //   54: iconst_1
    //   55: invokevirtual substring : (I)Ljava/lang/String;
    //   58: lload #8
    //   60: dup2_x1
    //   61: pop2
    //   62: iconst_2
    //   63: anewarray java/lang/Object
    //   66: dup_x1
    //   67: swap
    //   68: iconst_1
    //   69: swap
    //   70: aastore
    //   71: dup_x2
    //   72: dup_x2
    //   73: pop
    //   74: invokestatic valueOf : (J)Ljava/lang/Long;
    //   77: iconst_0
    //   78: swap
    //   79: aastore
    //   80: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   83: aload #12
    //   85: iconst_2
    //   86: aaload
    //   87: ldc ''
    //   89: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   92: astore #11
    //   94: aload #10
    //   96: ifnull -> 207
    //   99: aload #11
    //   101: invokevirtual length : ()I
    //   104: bipush #55
    //   106: if_icmpgt -> 145
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload #11
    //   118: ldc '\\n'
    //   120: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   123: aload #10
    //   125: ifnull -> 215
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: ifeq -> 208
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: aload_2
    //   146: lload #6
    //   148: getstatic me/frep/aegisguard/spigot/aegisguard_p.b : [Ljava/lang/String;
    //   151: iconst_1
    //   152: aaload
    //   153: iconst_2
    //   154: anewarray java/lang/Object
    //   157: dup_x1
    //   158: swap
    //   159: iconst_1
    //   160: swap
    //   161: aastore
    //   162: dup_x2
    //   163: dup_x2
    //   164: pop
    //   165: invokestatic valueOf : (J)Ljava/lang/Long;
    //   168: iconst_0
    //   169: swap
    //   170: aastore
    //   171: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   174: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   179: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   182: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   185: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   188: aload_2
    //   189: <illegal opcode> run : (Lorg/bukkit/entity/Player;)Ljava/lang/Runnable;
    //   194: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   199: pop
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: return
    //   208: aload #11
    //   210: ldc '%'
    //   212: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   215: aload #10
    //   217: ifnull -> 256
    //   220: ifne -> 259
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   229: athrow
    //   230: aload #11
    //   232: aload #10
    //   234: ifnull -> 300
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   243: athrow
    //   244: ldc '$'
    //   246: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: ifeq -> 281
    //   259: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   262: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   265: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   268: aload_2
    //   269: <illegal opcode> run : (Lorg/bukkit/entity/Player;)Ljava/lang/Runnable;
    //   274: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   279: pop
    //   280: return
    //   281: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   284: invokevirtual aegisguard_Y : ()Ljava/util/Map;
    //   287: aload_2
    //   288: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   293: aload #11
    //   295: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   300: pop
    //   301: goto -> 311
    //   304: astore #11
    //   306: aload #11
    //   308: invokevirtual printStackTrace : ()V
    //   311: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #15	-> 31
    //   #17	-> 37
    //   #19	-> 94
    //   #20	-> 145
    //   #21	-> 179
    //   #23	-> 207
    //   #26	-> 208
    //   #27	-> 259
    //   #29	-> 280
    //   #32	-> 281
    //   #35	-> 301
    //   #33	-> 304
    //   #34	-> 306
    //   #36	-> 311
    // Exception table:
    //   from	to	target	type
    //   31	36	304	java/lang/Exception
    //   37	207	304	java/lang/Exception
    //   94	109	112	java/lang/Exception
    //   99	128	131	java/lang/Exception
    //   116	138	141	java/lang/Exception
    //   135	200	203	java/lang/Exception
    //   208	280	304	java/lang/Exception
    //   215	223	226	java/lang/Exception
    //   220	237	240	java/lang/Exception
    //   230	249	252	java/lang/Exception
    //   281	301	304	java/lang/Exception
  }
  
  private static void lambda$onPluginMessageReceived$0(Player paramPlayer) {
    long l1 = a ^ 0x43CACFA5E573L, l2 = l1 ^ 0x1BBC8BA858D6L;
    (new Object[2])[1] = b[0];
    new Object[2];
    paramPlayer.kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  private static void lambda$onPluginMessageReceived$1(Player paramPlayer) {
    long l1 = a ^ 0x75A2B138DA4DL, l2 = l1 ^ 0x2DD4F53567E8L;
    (new Object[2])[1] = b[3];
    new Object[2];
    paramPlayer.kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  public static void aegisguard_D(int[] paramArrayOfint) {
    aegisguard_k = paramArrayOfint;
  }
  
  public static int[] aegisguard_i() {
    return aegisguard_k;
  }
  
  static {
    long l = a ^ 0x643EA4CDF5A6L;
    aegisguard_D(new int[3]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "Ü}\035$\036£\034O¤(ûø%ÑCwo¬ýl\030Ü}\035$\036£\034O¤(ûø%ÑCwo¬ýl\020|9 Ëö|\033ÐÅª\034\005Q\032").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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
