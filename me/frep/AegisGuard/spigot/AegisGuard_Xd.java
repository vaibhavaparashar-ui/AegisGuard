package me.frep.aegisguard.spigot.AegisGuard_Xd;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.frep.aegisguard.spigot.aegisguardPlugin;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;

public class aegisguard_Xd extends PlaceholderExpansion {
  public aegisguard_Xd() {
    int[] arrayOfInt = aegisguard_b();
    try {
      if (arrayOfInt == null)
        AbstractCheck.aegisguard_g(new AbstractCheck[4]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private final aegisguardPlugin aegisguard_V = aegisguard_K.INSTANCE.aegisguard_j();
  
  private static int[] aegisguard_N;
  
  private static final long a = aegisguard_e.a(-4406546270009220409L, 150756563415445105L, MethodHandles.lookup().lookupClass()).a(265576131402095L);
  
  private static final String[] b;
  
  public boolean persist() {
    return true;
  }
  
  public boolean canRegister() {
    return true;
  }
  
  public String getAuthor() {
    return this.aegisguard_V.getDescription().getAuthors().toString();
  }
  
  public String getIdentifier() {
    return b[1];
  }
  
  public String getVersion() {
    return this.aegisguard_V.getDescription().getVersion();
  }
  
  public String onPlaceholderRequest(Player paramPlayer, String paramString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_Xd.a : J
    //   3: ldc2_w 96368387992179
    //   6: lxor
    //   7: lstore_3
    //   8: invokestatic aegisguard_b : ()[I
    //   11: astore #5
    //   13: aload_1
    //   14: ifnonnull -> 24
    //   17: ldc ''
    //   19: areturn
    //   20: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   23: athrow
    //   24: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   27: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   30: aload_1
    //   31: iconst_1
    //   32: anewarray java/lang/Object
    //   35: dup_x1
    //   36: swap
    //   37: iconst_0
    //   38: swap
    //   39: aastore
    //   40: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   43: astore #6
    //   45: aload #6
    //   47: ifnonnull -> 57
    //   50: ldc ''
    //   52: areturn
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_2
    //   58: astore #7
    //   60: iconst_m1
    //   61: istore #8
    //   63: aload #7
    //   65: invokevirtual hashCode : ()I
    //   68: aload #5
    //   70: ifnull -> 424
    //   73: lookupswitch default -> 422, -1219056987 -> 386, -1105699309 -> 346, -705049655 -> 184, 98726 -> 144, 67478910 -> 265, 1208973849 -> 225, 2068256780 -> 305
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: aload #7
    //   146: getstatic me/frep/aegisguard/spigot/aegisguard_Xd.b : [Ljava/lang/String;
    //   149: iconst_4
    //   150: aaload
    //   151: invokevirtual equals : (Ljava/lang/Object;)Z
    //   154: aload #5
    //   156: ifnull -> 424
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: ifeq -> 422
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: iconst_0
    //   177: istore #8
    //   179: aload #5
    //   181: ifnonnull -> 422
    //   184: aload #7
    //   186: getstatic me/frep/aegisguard/spigot/aegisguard_Xd.b : [Ljava/lang/String;
    //   189: bipush #6
    //   191: aaload
    //   192: invokevirtual equals : (Ljava/lang/Object;)Z
    //   195: aload #5
    //   197: ifnull -> 424
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   206: athrow
    //   207: ifeq -> 422
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: iconst_1
    //   218: istore #8
    //   220: aload #5
    //   222: ifnonnull -> 422
    //   225: aload #7
    //   227: getstatic me/frep/aegisguard/spigot/aegisguard_Xd.b : [Ljava/lang/String;
    //   230: iconst_0
    //   231: aaload
    //   232: invokevirtual equals : (Ljava/lang/Object;)Z
    //   235: aload #5
    //   237: ifnull -> 424
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: ifeq -> 422
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   256: athrow
    //   257: iconst_2
    //   258: istore #8
    //   260: aload #5
    //   262: ifnonnull -> 422
    //   265: aload #7
    //   267: getstatic me/frep/aegisguard/spigot/aegisguard_Xd.b : [Ljava/lang/String;
    //   270: iconst_2
    //   271: aaload
    //   272: invokevirtual equals : (Ljava/lang/Object;)Z
    //   275: aload #5
    //   277: ifnull -> 424
    //   280: goto -> 287
    //   283: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   286: athrow
    //   287: ifeq -> 422
    //   290: goto -> 297
    //   293: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   296: athrow
    //   297: iconst_3
    //   298: istore #8
    //   300: aload #5
    //   302: ifnonnull -> 422
    //   305: aload #7
    //   307: getstatic me/frep/aegisguard/spigot/aegisguard_Xd.b : [Ljava/lang/String;
    //   310: bipush #7
    //   312: aaload
    //   313: invokevirtual equals : (Ljava/lang/Object;)Z
    //   316: aload #5
    //   318: ifnull -> 424
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   327: athrow
    //   328: ifeq -> 422
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   337: athrow
    //   338: iconst_4
    //   339: istore #8
    //   341: aload #5
    //   343: ifnonnull -> 422
    //   346: aload #7
    //   348: getstatic me/frep/aegisguard/spigot/aegisguard_Xd.b : [Ljava/lang/String;
    //   351: iconst_5
    //   352: aaload
    //   353: invokevirtual equals : (Ljava/lang/Object;)Z
    //   356: aload #5
    //   358: ifnull -> 424
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   367: athrow
    //   368: ifeq -> 422
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   377: athrow
    //   378: iconst_5
    //   379: istore #8
    //   381: aload #5
    //   383: ifnonnull -> 422
    //   386: aload #7
    //   388: getstatic me/frep/aegisguard/spigot/aegisguard_Xd.b : [Ljava/lang/String;
    //   391: iconst_3
    //   392: aaload
    //   393: invokevirtual equals : (Ljava/lang/Object;)Z
    //   396: aload #5
    //   398: ifnull -> 424
    //   401: goto -> 408
    //   404: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   407: athrow
    //   408: ifeq -> 422
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   417: athrow
    //   418: bipush #6
    //   420: istore #8
    //   422: iload #8
    //   424: tableswitch default -> 545, 0 -> 468, 1 -> 492, 2 -> 501, 3 -> 510, 4 -> 519, 5 -> 528, 6 -> 534
    //   468: aload #6
    //   470: iconst_0
    //   471: anewarray java/lang/Object
    //   474: invokevirtual aegisguard_v : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XR;
    //   477: iconst_0
    //   478: anewarray java/lang/Object
    //   481: invokevirtual aegisguard_W : ([Ljava/lang/Object;)D
    //   484: invokestatic toString : (D)Ljava/lang/String;
    //   487: areturn
    //   488: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   491: athrow
    //   492: aload #6
    //   494: invokevirtual getTotalViolations : ()I
    //   497: invokestatic toString : (I)Ljava/lang/String;
    //   500: areturn
    //   501: aload #6
    //   503: invokevirtual getCombatViolations : ()I
    //   506: invokestatic toString : (I)Ljava/lang/String;
    //   509: areturn
    //   510: aload #6
    //   512: invokevirtual getMovementViolations : ()I
    //   515: invokestatic toString : (I)Ljava/lang/String;
    //   518: areturn
    //   519: aload #6
    //   521: invokevirtual getPlayerViolations : ()I
    //   524: invokestatic toString : (I)Ljava/lang/String;
    //   527: areturn
    //   528: aload #6
    //   530: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   533: areturn
    //   534: iconst_0
    //   535: anewarray java/lang/Object
    //   538: invokestatic aegisguard_Z : ([Ljava/lang/Object;)I
    //   541: invokestatic toString : (I)Ljava/lang/String;
    //   544: areturn
    //   545: aconst_null
    //   546: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #45	-> 13
    //   #46	-> 17
    //   #49	-> 24
    //   #51	-> 45
    //   #52	-> 50
    //   #55	-> 57
    //   #57	-> 468
    //   #59	-> 492
    //   #61	-> 501
    //   #63	-> 510
    //   #65	-> 519
    //   #67	-> 528
    //   #69	-> 534
    //   #72	-> 545
    // Exception table:
    //   from	to	target	type
    //   13	20	20	java/lang/RuntimeException
    //   45	53	53	java/lang/RuntimeException
    //   63	140	140	java/lang/RuntimeException
    //   73	159	162	java/lang/RuntimeException
    //   144	169	172	java/lang/RuntimeException
    //   179	200	203	java/lang/RuntimeException
    //   184	210	213	java/lang/RuntimeException
    //   220	240	243	java/lang/RuntimeException
    //   225	250	253	java/lang/RuntimeException
    //   260	280	283	java/lang/RuntimeException
    //   265	290	293	java/lang/RuntimeException
    //   300	321	324	java/lang/RuntimeException
    //   305	331	334	java/lang/RuntimeException
    //   341	361	364	java/lang/RuntimeException
    //   346	371	374	java/lang/RuntimeException
    //   381	401	404	java/lang/RuntimeException
    //   386	411	414	java/lang/RuntimeException
    //   424	488	488	java/lang/RuntimeException
  }
  
  public static void aegisguard_I(int[] paramArrayOfint) {
    aegisguard_N = paramArrayOfint;
  }
  
  public static int[] aegisguard_b() {
    return aegisguard_N;
  }
  
  static {
    long l = a ^ 0x61AC1EA763BBL;
    aegisguard_I(new int[4]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[8];
    boolean bool = false;
    String str;
    int i = (str = "¤æòñwº¹¾Ðb|â}~p~µ,\007p\b°ë\022¡Yg\025$\030ÂÀ\031ÛlãV\013?GÛÏ\\/\024þ:Âö\030\023\025¤@$ü9Ëºº\004D>'¸N4¥\"f\b)ùØ¯\035¡\0232\020\0161\nIr)k¦>´Gte\023").length();
    byte b2 = 24;
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
