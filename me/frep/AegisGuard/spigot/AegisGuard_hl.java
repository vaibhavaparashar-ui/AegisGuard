package me.frep.aegisguard.spigot.AegisGuard_hl;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.logging.Level;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_V;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public final class aegisguard_hl {
  private static final String aegisguard_w;
  
  private static aegisguard_V aegisguard_u;
  
  private static File aegisguard_t;
  
  private static final long a = aegisguard_e.a(5047783759813761386L, -8412042482454922087L, MethodHandles.lookup().lookupClass()).a(146600536586243L);
  
  private static final String[] b;
  
  private aegisguard_hl() {
    throw new UnsupportedOperationException(b[4]);
  }
  
  public static void aegisguard_A(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0xB533C4ABBE8L;
    try {
      aegisguard_u.save(aegisguard_t);
    } catch (Exception exception) {
      String[] arrayOfString = b;
      File file = new File(aegisguard_K.INSTANCE.aegisguard_j().getDataFolder(), arrayOfString[12] + (new Date()).getTime());
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[11]);
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[3] + file.getName());
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[5]);
      aegisguard_t.renameTo(file);
      new Object[1];
      aegisguard__(new Object[] { Long.valueOf(l2) });
    } 
  }
  
  public static void aegisguard_m(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x903DEC55CD6L;
    try {
      aegisguard_u.load(aegisguard_t);
    } catch (Exception exception) {
      String[] arrayOfString = b;
      File file = new File(aegisguard_K.INSTANCE.aegisguard_j().getDataFolder(), arrayOfString[0] + (new Date()).getTime());
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[10]);
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[8] + file.getName());
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[6]);
      aegisguard_t.renameTo(file);
      new Object[1];
      aegisguard__(new Object[] { Long.valueOf(l2) });
    } 
  }
  
  public static void aegisguard__(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_1
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_hl.a : J
    //   15: lload_1
    //   16: lxor
    //   17: lstore_1
    //   18: lload_1
    //   19: dup2
    //   20: ldc2_w 27523107531902
    //   23: lxor
    //   24: lstore_3
    //   25: dup2
    //   26: ldc2_w 16644682518326
    //   29: lxor
    //   30: lstore #5
    //   32: dup2
    //   33: ldc2_w 15609747029804
    //   36: lxor
    //   37: lstore #7
    //   39: pop2
    //   40: invokestatic aegisguard_k : ()[Ljava/lang/String;
    //   43: astore #9
    //   45: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   48: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   51: invokevirtual getDataFolder : ()Ljava/io/File;
    //   54: invokevirtual exists : ()Z
    //   57: aload #9
    //   59: ifnonnull -> 141
    //   62: ifne -> 92
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   75: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   78: invokevirtual getDataFolder : ()Ljava/io/File;
    //   81: invokevirtual mkdir : ()Z
    //   84: pop
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: new java/io/File
    //   95: dup
    //   96: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   99: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   102: invokevirtual getDataFolder : ()Ljava/io/File;
    //   105: getstatic me/frep/aegisguard/spigot/aegisguard_hl.b : [Ljava/lang/String;
    //   108: bipush #13
    //   110: aaload
    //   111: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   114: putstatic me/frep/aegisguard/spigot/aegisguard_hl.aegisguard_t : Ljava/io/File;
    //   117: getstatic me/frep/aegisguard/spigot/aegisguard_hl.aegisguard_t : Ljava/io/File;
    //   120: aload #9
    //   122: lload_1
    //   123: lconst_0
    //   124: lcmp
    //   125: iflt -> 230
    //   128: ifnonnull -> 215
    //   131: invokevirtual exists : ()Z
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: lload_1
    //   142: lconst_0
    //   143: lcmp
    //   144: iflt -> 159
    //   147: ifne -> 212
    //   150: getstatic me/frep/aegisguard/spigot/aegisguard_hl.aegisguard_t : Ljava/io/File;
    //   153: invokevirtual getParentFile : ()Ljava/io/File;
    //   156: invokevirtual mkdirs : ()Z
    //   159: pop
    //   160: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   163: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   166: getstatic me/frep/aegisguard/spigot/aegisguard_hl.b : [Ljava/lang/String;
    //   169: bipush #9
    //   171: aaload
    //   172: invokevirtual getResource : (Ljava/lang/String;)Ljava/io/InputStream;
    //   175: lload_3
    //   176: getstatic me/frep/aegisguard/spigot/aegisguard_hl.aegisguard_t : Ljava/io/File;
    //   179: iconst_3
    //   180: anewarray java/lang/Object
    //   183: dup_x1
    //   184: swap
    //   185: iconst_2
    //   186: swap
    //   187: aastore
    //   188: dup_x2
    //   189: dup_x2
    //   190: pop
    //   191: invokestatic valueOf : (J)Ljava/lang/Long;
    //   194: iconst_1
    //   195: swap
    //   196: aastore
    //   197: dup_x1
    //   198: swap
    //   199: iconst_0
    //   200: swap
    //   201: aastore
    //   202: invokestatic aegisguard_g : ([Ljava/lang/Object;)V
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: getstatic me/frep/aegisguard/spigot/aegisguard_hl.aegisguard_t : Ljava/io/File;
    //   215: lload #7
    //   217: iconst_2
    //   218: anewarray java/lang/Object
    //   221: dup_x2
    //   222: dup_x2
    //   223: pop
    //   224: invokestatic valueOf : (J)Ljava/lang/Long;
    //   227: iconst_1
    //   228: swap
    //   229: aastore
    //   230: dup_x1
    //   231: swap
    //   232: iconst_0
    //   233: swap
    //   234: aastore
    //   235: invokestatic aegisguard_z : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_V;
    //   238: putstatic me/frep/aegisguard/spigot/aegisguard_hl.aegisguard_u : Lme/frep/aegisguard/spigot/aegisguard_V;
    //   241: getstatic me/frep/aegisguard/spigot/aegisguard_hl.aegisguard_u : Lme/frep/aegisguard/spigot/aegisguard_V;
    //   244: getstatic me/frep/aegisguard/spigot/aegisguard_hl.aegisguard_t : Ljava/io/File;
    //   247: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   250: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   253: getstatic me/frep/aegisguard/spigot/aegisguard_hl.b : [Ljava/lang/String;
    //   256: astore #11
    //   258: aload #11
    //   260: bipush #9
    //   262: aaload
    //   263: invokevirtual getResource : (Ljava/lang/String;)Ljava/io/InputStream;
    //   266: iconst_1
    //   267: anewarray java/lang/String
    //   270: dup
    //   271: iconst_0
    //   272: aload #11
    //   274: iconst_2
    //   275: aaload
    //   276: aastore
    //   277: lload #5
    //   279: dup2_x1
    //   280: pop2
    //   281: iconst_4
    //   282: anewarray java/lang/Object
    //   285: dup_x1
    //   286: swap
    //   287: iconst_3
    //   288: swap
    //   289: aastore
    //   290: dup_x2
    //   291: dup_x2
    //   292: pop
    //   293: invokestatic valueOf : (J)Ljava/lang/Long;
    //   296: iconst_2
    //   297: swap
    //   298: aastore
    //   299: dup_x1
    //   300: swap
    //   301: iconst_1
    //   302: swap
    //   303: aastore
    //   304: dup_x1
    //   305: swap
    //   306: iconst_0
    //   307: swap
    //   308: aastore
    //   309: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   312: goto -> 317
    //   315: astore #10
    //   317: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #50	-> 45
    //   #51	-> 72
    //   #54	-> 92
    //   #56	-> 117
    //   #57	-> 150
    //   #58	-> 160
    //   #60	-> 212
    //   #62	-> 241
    //   #65	-> 312
    //   #63	-> 315
    //   #66	-> 317
    // Exception table:
    //   from	to	target	type
    //   45	65	68	java/lang/Exception
    //   62	85	88	java/lang/Exception
    //   92	134	137	java/lang/Exception
    //   141	205	208	java/lang/Exception
    //   241	312	315	java/lang/Exception
  }
  
  private static void aegisguard_g(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/io/InputStream
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_3
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast java/io/File
    //   24: astore_1
    //   25: pop
    //   26: getstatic me/frep/aegisguard/spigot/aegisguard_hl.a : J
    //   29: lload_3
    //   30: lxor
    //   31: lstore_3
    //   32: invokestatic aegisguard_k : ()[Ljava/lang/String;
    //   35: astore #5
    //   37: new java/io/FileOutputStream
    //   40: dup
    //   41: aload_1
    //   42: invokespecial <init> : (Ljava/io/File;)V
    //   45: astore #6
    //   47: sipush #1024
    //   50: newarray byte
    //   52: astore #7
    //   54: aload_2
    //   55: aload #7
    //   57: invokevirtual read : ([B)I
    //   60: dup
    //   61: istore #8
    //   63: ifle -> 105
    //   66: aload #6
    //   68: aload #7
    //   70: iconst_0
    //   71: iload #8
    //   73: invokevirtual write : ([BII)V
    //   76: aload #5
    //   78: lload_3
    //   79: lconst_0
    //   80: lcmp
    //   81: iflt -> 89
    //   84: ifnonnull -> 114
    //   87: aload #5
    //   89: ifnull -> 54
    //   92: lload_3
    //   93: lconst_0
    //   94: lcmp
    //   95: iflt -> 76
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload #6
    //   107: invokevirtual close : ()V
    //   110: aload_2
    //   111: invokevirtual close : ()V
    //   114: goto -> 124
    //   117: astore #6
    //   119: aload #6
    //   121: invokevirtual printStackTrace : ()V
    //   124: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #70	-> 37
    //   #71	-> 47
    //   #73	-> 54
    //   #74	-> 66
    //   #76	-> 105
    //   #77	-> 110
    //   #80	-> 114
    //   #78	-> 117
    //   #79	-> 119
    //   #81	-> 124
    // Exception table:
    //   from	to	target	type
    //   37	114	117	java/lang/Exception
    //   66	92	101	java/lang/Exception
  }
  
  public static int aegisguard_N(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_u.getInt(str);
  }
  
  public static int aegisguard_Z(Object[] paramArrayOfObject) {
    return aegisguard_N(new Object[] { b[7] });
  }
  
  public static void aegisguard_W(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    Object object = paramArrayOfObject[1];
    long l1 = ((Long)paramArrayOfObject[2]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0xFDE1B73A31AL, l3 = l1 ^ 0xD8EF9FC4424L;
    aegisguard_u.set(str, object);
    new Object[1];
    aegisguard_A(new Object[] { Long.valueOf(l3) });
    new Object[1];
    aegisguard_m(new Object[] { Long.valueOf(l2) });
    String[] arrayOfString = aegisguard_b0.aegisguard_k();
    try {
      if (AbstractCheck.aegisguard_B() == null)
        aegisguard_b0.aegisguard__(new String[3]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x44707BDB709L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "I\017F±@èýg'\007xhM\bû< \b·ä$ZVÌ£¢8cpûét\005äÿÝµLBÒÓÓ[È{èÒÌý'\006Ù*9I/!­°\017hÙ»?\031VriZî\027MZ)y²8±OèÏ¨¾ê<äÃ\006í¦Ð¾\035ÞÀ~WG{`]\031\n0´\023ÞËè&L÷Æ]rCÛúà\024ìÝ!}\035ø8]\\[ºsI9»ºs¬¹rË$%ú\027ßÒn\031%]ª\020«å)Çd´xRÎN\030Üfë¼#8]\\[ºsI9»ºs¬¹rË$%ú\027ßÒn\031%]ª\020«å)Çd´xRÎN\030Üfë¼#\020üÕÎøÝ³.S°«,ß¹8cpûét\005äÿÝµLBÒÓÓ[È{èÒÌý'\006Ù*9I/!­°\017hÙ»?\031VriZî\027MZ)y²\020\025BËeG1ÃîIôYh5 ÀT\004&\013U0£ºÉ±ðqP\005\0007ÍÌ\002ïáH/Ðc\016 ÀT\004&\013U0£ºÉ±ðqP\005\0007ÍÌ\002ïáH/Ðc\016").length();
    byte b2 = 16;
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
