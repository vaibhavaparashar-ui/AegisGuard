package me.frep.aegisguard.spigot.AegisGuard_K9;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;

public class aegisguard_K9 implements TabCompleter {
  private static boolean aegisguard_C;
  
  private static final long a = aegisguard_e.a(7243356459323516173L, -7322407786491390840L, MethodHandles.lookup().lookupClass()).a(278127848500728L);
  
  private static final String[] b;
  
  @Nullable
  public List onTabComplete(@NotNull CommandSender paramCommandSender, @NotNull Command paramCommand, @NotNull String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_K9.a : J
    //   3: ldc2_w 97770369852477
    //   6: lxor
    //   7: lstore #5
    //   9: invokestatic aegisguard_b : ()Z
    //   12: istore #7
    //   14: aload #4
    //   16: arraylength
    //   17: iconst_1
    //   18: iload #7
    //   20: ifeq -> 285
    //   23: if_icmpne -> 269
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: new java/util/ArrayList
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #8
    //   42: aload #8
    //   44: getstatic me/frep/aegisguard/spigot/aegisguard_K9.b : [Ljava/lang/String;
    //   47: astore #9
    //   49: aload #9
    //   51: iconst_0
    //   52: aaload
    //   53: invokeinterface add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload #8
    //   61: aload #9
    //   63: iconst_3
    //   64: aaload
    //   65: invokeinterface add : (Ljava/lang/Object;)Z
    //   70: pop
    //   71: aload #8
    //   73: aload #9
    //   75: bipush #13
    //   77: aaload
    //   78: invokeinterface add : (Ljava/lang/Object;)Z
    //   83: pop
    //   84: aload #8
    //   86: aload #9
    //   88: bipush #12
    //   90: aaload
    //   91: invokeinterface add : (Ljava/lang/Object;)Z
    //   96: pop
    //   97: aload #8
    //   99: aload #9
    //   101: bipush #16
    //   103: aaload
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: aload #8
    //   112: aload #9
    //   114: bipush #14
    //   116: aaload
    //   117: invokeinterface add : (Ljava/lang/Object;)Z
    //   122: pop
    //   123: aload #8
    //   125: aload #9
    //   127: bipush #11
    //   129: aaload
    //   130: invokeinterface add : (Ljava/lang/Object;)Z
    //   135: pop
    //   136: aload #8
    //   138: aload #9
    //   140: bipush #7
    //   142: aaload
    //   143: invokeinterface add : (Ljava/lang/Object;)Z
    //   148: pop
    //   149: aload #8
    //   151: aload #9
    //   153: bipush #9
    //   155: aaload
    //   156: invokeinterface add : (Ljava/lang/Object;)Z
    //   161: pop
    //   162: aload #8
    //   164: aload #9
    //   166: iconst_4
    //   167: aaload
    //   168: invokeinterface add : (Ljava/lang/Object;)Z
    //   173: pop
    //   174: aload #8
    //   176: aload #9
    //   178: iconst_5
    //   179: aaload
    //   180: invokeinterface add : (Ljava/lang/Object;)Z
    //   185: pop
    //   186: aload #8
    //   188: aload #9
    //   190: bipush #8
    //   192: aaload
    //   193: invokeinterface add : (Ljava/lang/Object;)Z
    //   198: pop
    //   199: aload #8
    //   201: aload #9
    //   203: iconst_1
    //   204: aaload
    //   205: invokeinterface add : (Ljava/lang/Object;)Z
    //   210: pop
    //   211: aload #8
    //   213: aload #9
    //   215: bipush #10
    //   217: aaload
    //   218: invokeinterface add : (Ljava/lang/Object;)Z
    //   223: pop
    //   224: aload #8
    //   226: aload #9
    //   228: iconst_2
    //   229: aaload
    //   230: invokeinterface add : (Ljava/lang/Object;)Z
    //   235: pop
    //   236: aload #8
    //   238: aload #9
    //   240: bipush #15
    //   242: aaload
    //   243: invokeinterface add : (Ljava/lang/Object;)Z
    //   248: pop
    //   249: aload #4
    //   251: iconst_0
    //   252: aaload
    //   253: aload #8
    //   255: new java/util/ArrayList
    //   258: dup
    //   259: invokespecial <init> : ()V
    //   262: invokestatic copyPartialMatches : (Ljava/lang/String;Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;
    //   265: checkcast java/util/List
    //   268: areturn
    //   269: aload #4
    //   271: arraylength
    //   272: iload #7
    //   274: ifeq -> 320
    //   277: iconst_2
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: if_icmpne -> 356
    //   288: aload #4
    //   290: iconst_0
    //   291: aaload
    //   292: iload #7
    //   294: ifeq -> 334
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   303: athrow
    //   304: getstatic me/frep/aegisguard/spigot/aegisguard_K9.b : [Ljava/lang/String;
    //   307: bipush #6
    //   309: aaload
    //   310: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   319: athrow
    //   320: ifeq -> 356
    //   323: aload #4
    //   325: iconst_0
    //   326: aaload
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   333: athrow
    //   334: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L9 : Ljava/util/Map;
    //   337: invokeinterface keySet : ()Ljava/util/Set;
    //   342: new java/util/ArrayList
    //   345: dup
    //   346: invokespecial <init> : ()V
    //   349: invokestatic copyPartialMatches : (Ljava/lang/String;Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;
    //   352: checkcast java/util/List
    //   355: areturn
    //   356: aconst_null
    //   357: iload #7
    //   359: ifne -> 376
    //   362: iconst_2
    //   363: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   366: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   375: athrow
    //   376: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #18	-> 14
    //   #19	-> 33
    //   #20	-> 42
    //   #21	-> 59
    //   #22	-> 71
    //   #23	-> 84
    //   #24	-> 97
    //   #25	-> 110
    //   #26	-> 123
    //   #27	-> 136
    //   #28	-> 149
    //   #29	-> 162
    //   #30	-> 174
    //   #31	-> 186
    //   #32	-> 199
    //   #33	-> 211
    //   #34	-> 224
    //   #35	-> 236
    //   #36	-> 249
    //   #37	-> 269
    //   #38	-> 323
    //   #41	-> 356
    // Exception table:
    //   from	to	target	type
    //   14	26	29	java/lang/RuntimeException
    //   269	278	281	java/lang/RuntimeException
    //   285	297	300	java/lang/RuntimeException
    //   288	313	316	java/lang/RuntimeException
    //   320	327	330	java/lang/RuntimeException
    //   356	369	372	java/lang/RuntimeException
  }
  
  public static void aegisguard_Q(boolean paramBoolean) {
    aegisguard_C = paramBoolean;
  }
  
  public static boolean aegisguard_b() {
    return aegisguard_C;
  }
  
  public static boolean aegisguard_q() {
    boolean bool = aegisguard_b();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = a ^ 0x1158433EC299L;
    aegisguard_Q(true);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[17];
    boolean bool = false;
    String str;
    int i = (str = "Àw\035Pnµ\f\bf`µÔ\fÜÙ\b¨Z\000\003·ôä\bt¬h\032\005ä/\000\bÉCÞr9\017ý\f\020'tu¥\034]bàyMÅjÍ\001Æ\020\"Ûl!j\032xxñÎËÍÄñ\b]ùÕÒzö4é\020nß\\!\020ÏáiiLÐJäI\b³Å\nú7£B\b\bï;\t\026\001Z\b0çx42 \\f\bq\036a#¡0Ë\b,¾¯ÓÈ\b\020\r\024h©0K7Üq2\"½ ").length();
    byte b2 = 8;
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
