package me.frep.aegisguard.spigot.AegisGuard_X6;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.api.event.aegisguardViolationResetEvent;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

public class aegisguard_X6 implements Runnable {
  private static BukkitTask aegisguard_Z;
  
  static final boolean aegisguard_f;
  
  private static int[] aegisguard_Y;
  
  private static final long a = aegisguard_e.a(-4502554017405568007L, -337119534496161926L, MethodHandles.lookup().lookupClass()).a(90422363996305L);
  
  private static final String[] b;
  
  static {
    long l = a ^ 0x5E8DF1B1B464L;
    aegisguard_M(null);
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
    int i = (str = "NCQÖFä?\017VOVâ\001þ'¤X¹ü9N}\002H\003âË³¦ï\004\013Já5¨aH0ãc7üy\026\004ö\fcö\0251kXýY\0058±c²ß\017ÛcEÝEÒÁf3\006\032¾{¦oé«$*ý").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  public static void aegisguard_Z(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_1
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_X6.a : J
    //   15: lload_1
    //   16: lxor
    //   17: lstore_1
    //   18: invokestatic aegisguard_Q : ()[I
    //   21: astore_3
    //   22: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Md : Z
    //   25: aload_3
    //   26: ifnonnull -> 42
    //   29: ifeq -> 240
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   38: athrow
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L_ : Z
    //   42: aload_3
    //   43: ifnonnull -> 216
    //   46: ifeq -> 168
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: new me/frep/aegisguard/api/event/aegisguardViolationResetEvent
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: astore #4
    //   65: aload_3
    //   66: lload_1
    //   67: lconst_0
    //   68: lcmp
    //   69: iflt -> 128
    //   72: ifnonnull -> 121
    //   75: iconst_0
    //   76: anewarray java/lang/Object
    //   79: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   82: ifeq -> 131
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   95: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   98: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   101: aload #4
    //   103: <illegal opcode> run : (Lme/frep/aegisguard/api/event/aegisguardViolationResetEvent;)Ljava/lang/Runnable;
    //   108: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   113: pop
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: lload_1
    //   122: lconst_0
    //   123: lcmp
    //   124: ifle -> 148
    //   127: aload_3
    //   128: ifnull -> 148
    //   131: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   134: aload #4
    //   136: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: aload #4
    //   150: invokevirtual isCancelled : ()Z
    //   153: aload_3
    //   154: ifnonnull -> 216
    //   157: ifeq -> 168
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: return
    //   168: lload_1
    //   169: lconst_0
    //   170: lcmp
    //   171: iflt -> 206
    //   174: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   177: aload_3
    //   178: ifnonnull -> 222
    //   181: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   184: iconst_0
    //   185: anewarray java/lang/Object
    //   188: invokevirtual aegisguard_k : ([Ljava/lang/Object;)Ljava/util/Collection;
    //   191: invokeinterface parallelStream : ()Ljava/util/stream/Stream;
    //   196: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   201: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   206: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GK : Z
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   215: athrow
    //   216: ifeq -> 240
    //   219: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   222: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   225: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_M6 : Ljava/lang/String;
    //   228: iconst_1
    //   229: anewarray java/lang/Object
    //   232: dup_x1
    //   233: swap
    //   234: iconst_0
    //   235: swap
    //   236: aastore
    //   237: invokevirtual aegisguard_H : ([Ljava/lang/Object;)V
    //   240: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #15	-> 22
    //   #16	-> 39
    //   #17	-> 56
    //   #19	-> 65
    //   #20	-> 92
    //   #22	-> 131
    //   #25	-> 148
    //   #28	-> 168
    //   #43	-> 206
    //   #44	-> 219
    //   #47	-> 240
    // Exception table:
    //   from	to	target	type
    //   22	32	35	java/lang/RuntimeException
    //   42	49	52	java/lang/RuntimeException
    //   65	85	88	java/lang/RuntimeException
    //   75	114	117	java/lang/RuntimeException
    //   121	141	144	java/lang/RuntimeException
    //   148	160	163	java/lang/RuntimeException
    //   168	209	212	java/lang/RuntimeException
  }
  
  private static void lambda$reset$0(aegisguardViolationResetEvent paramaegisguardViolationResetEvent) {
    Bukkit.getPluginManager().callEvent((Event)paramaegisguardViolationResetEvent);
  }
  
  private static void lambda$reset$2(aegisguard_hu paramaegisguard_hu) {
    paramaegisguard_hu.aegisguard__(new Object[] { Integer.valueOf(0) });
    paramaegisguard_hu.aegisguard_I(new Object[] { Integer.valueOf(0) });
    paramaegisguard_hu.aegisguard_b(new Object[] { Integer.valueOf(0) });
    paramaegisguard_hu.aegisguard_O(new Object[] { Integer.valueOf(0) });
    paramaegisguard_hu.aegisguard_V(new Object[] { Integer.valueOf(0) });
    paramaegisguard_hu.aegisguard_r(new Object[] { Integer.valueOf(0) });
    paramaegisguard_hu.aegisguard_d(new Object[] { Integer.valueOf(0) });
    paramaegisguard_hu.aegisguard_u(new Object[0]).forEach(me.frep.aegisguard.spigot.aegisguard_X6::lambda$reset$1);
  }
  
  private static void lambda$reset$1(AbstractCheck paramAbstractCheck) {
    paramAbstractCheck.setVl(0);
    paramAbstractCheck.aegisguard_h(new Object[0]);
  }
  
  public void aegisguard_S(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    int[] arrayOfInt = aegisguard_Q();
    try {
      if (arrayOfInt == null)
        try {
          if (!aegisguard_f)
            try {
              if (aegisguard_Z != null)
                throw new AssertionError(b[1]); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = aegisguard_b0.aegisguard_U(new Object[] { b[0] });
    try {
      aegisguard_Z = Bukkit.getScheduler().runTaskTimerAsynchronously((Plugin)aegisguard_K.INSTANCE.aegisguard_j(), this, (i * 1200), (i * 1200));
      if (l > 0L && arrayOfInt != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[4]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void aegisguard_D(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    int[] arrayOfInt = aegisguard_Q();
    try {
      if (arrayOfInt == null)
        if (aegisguard_Z == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_Z.cancel();
    aegisguard_Z = null;
  }
  
  public void run() {
    long l1 = a ^ 0x4943A5163992L, l2 = l1 ^ 0x2E9A4BA63A8AL;
    new Object[1];
    aegisguard_Z(new Object[] { Long.valueOf(l2) });
  }
  
  public static void aegisguard_M(int[] paramArrayOfint) {
    aegisguard_Y = paramArrayOfint;
  }
  
  public static int[] aegisguard_Q() {
    return aegisguard_Y;
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
