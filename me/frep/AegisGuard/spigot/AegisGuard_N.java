package me.frep.aegisguard.spigot.AegisGuard_N;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_e;

public class aegisguard_N {
  private float aegisguard_u;
  
  private float aegisguard_Y;
  
  private float aegisguard_h;
  
  private static final String aegisguard_J;
  
  public static List aegisguard_G;
  
  public static List aegisguard_X;
  
  public static List aegisguard_D;
  
  public static List aegisguard_V;
  
  private static int[] aegisguard_K;
  
  public float aegisguard_a(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Float
    //   7: invokevirtual floatValue : ()F
    //   10: fstore #5
    //   12: dup
    //   13: iconst_1
    //   14: aaload
    //   15: checkcast java/lang/Long
    //   18: invokevirtual longValue : ()J
    //   21: lstore_3
    //   22: dup
    //   23: iconst_2
    //   24: aaload
    //   25: checkcast java/lang/Float
    //   28: invokevirtual floatValue : ()F
    //   31: fstore_2
    //   32: pop
    //   33: getstatic me/frep/aegisguard/spigot/aegisguard_N.a : J
    //   36: lload_3
    //   37: lxor
    //   38: lstore_3
    //   39: aload_0
    //   40: dup
    //   41: getfield aegisguard_u : F
    //   44: fload #5
    //   46: fadd
    //   47: putfield aegisguard_u : F
    //   50: invokestatic aegisguard__ : ()[I
    //   53: aload_0
    //   54: getfield aegisguard_u : F
    //   57: aload_0
    //   58: getfield aegisguard_Y : F
    //   61: fsub
    //   62: fload_2
    //   63: fmul
    //   64: fstore #5
    //   66: aload_0
    //   67: dup
    //   68: getfield aegisguard_h : F
    //   71: fload #5
    //   73: aload_0
    //   74: getfield aegisguard_h : F
    //   77: fsub
    //   78: ldc 0.5
    //   80: fmul
    //   81: fadd
    //   82: putfield aegisguard_h : F
    //   85: astore #6
    //   87: fload #5
    //   89: fconst_0
    //   90: fcmpl
    //   91: aload #6
    //   93: ifnonnull -> 164
    //   96: ifle -> 141
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: fload #5
    //   108: aload #6
    //   110: ifnonnull -> 213
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: lload_3
    //   121: lconst_0
    //   122: lcmp
    //   123: ifle -> 206
    //   126: aload_0
    //   127: getfield aegisguard_h : F
    //   130: fcmpl
    //   131: ifgt -> 202
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: fload #5
    //   143: aload #6
    //   145: ifnonnull -> 228
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: fconst_0
    //   156: fcmpg
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   163: athrow
    //   164: ifge -> 215
    //   167: fload #5
    //   169: aload #6
    //   171: lload_3
    //   172: lconst_0
    //   173: lcmp
    //   174: iflt -> 236
    //   177: ifnonnull -> 228
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   186: athrow
    //   187: aload_0
    //   188: getfield aegisguard_h : F
    //   191: fcmpg
    //   192: ifge -> 215
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: aload_0
    //   203: getfield aegisguard_h : F
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   212: athrow
    //   213: fstore #5
    //   215: aload_0
    //   216: dup
    //   217: getfield aegisguard_Y : F
    //   220: fload #5
    //   222: fadd
    //   223: putfield aegisguard_Y : F
    //   226: fload #5
    //   228: lload_3
    //   229: lconst_0
    //   230: lcmp
    //   231: iflt -> 246
    //   234: aload #6
    //   236: ifnull -> 253
    //   239: iconst_5
    //   240: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   243: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   252: athrow
    //   253: freturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 39
    //   #15	-> 53
    //   #16	-> 66
    //   #18	-> 87
    //   #20	-> 202
    //   #23	-> 215
    //   #24	-> 226
    // Exception table:
    //   from	to	target	type
    //   87	99	102	java/lang/RuntimeException
    //   96	113	116	java/lang/RuntimeException
    //   106	134	137	java/lang/RuntimeException
    //   120	148	151	java/lang/RuntimeException
    //   141	157	160	java/lang/RuntimeException
    //   164	180	183	java/lang/RuntimeException
    //   167	195	198	java/lang/RuntimeException
    //   187	206	209	java/lang/RuntimeException
    //   228	246	249	java/lang/RuntimeException
  }
  
  private static final long a = aegisguard_e.a(-4943527489014246444L, 2738369667581778372L, MethodHandles.lookup().lookupClass()).a(51121309520614L);
  
  static {
    long l = a ^ 0x13A185151B71L;
    aegisguard_f(null);
    byte b1;
    for ((new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[13];
    boolean bool = false;
    String str;
    int i = (str = ",ÙtoU\034\003n\031úJ½VzK¶\020ë\025&§Í\tìg5l9\bã»8\bÊºE@É\026\004\004\b\037å»^å$C\020z+­îµ \027¿\033\037J5Í2«¶\020cQY¢5O¤ÜÆÜ¦n\020cq\006IâkæÓ`\027\0047\017,Ü\bãÎâ/^MÙ\b\013Lû\004sB_¥\bë\\G|*D\boÕùâã7Ù\002").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  public static void aegisguard_f(int[] paramArrayOfint) {
    aegisguard_K = paramArrayOfint;
  }
  
  public static int[] aegisguard__() {
    return aegisguard_K;
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
