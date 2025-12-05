package me.frep.aegisguard.spigot.AegisGuard_F;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class aegisguard_F {
  private static int[] aegisguard_G;
  
  private static final long a = aegisguard_e.a(2587160657533689048L, 7469986661982757238L, MethodHandles.lookup().lookupClass()).a(60707129617790L);
  
  private static final String[] b;
  
  public aegisguard_F() {
    try {
      aegisguard_Q();
    } catch (Exception exception) {
      Bukkit.getPluginManager().disablePlugin((Plugin)aegisguard_K.INSTANCE.aegisguard_j());
    } 
  }
  
  public void aegisguard_Q() {
    // Byte code:
    //   0: invokestatic aegisguard_F : ()[I
    //   3: astore_1
    //   4: getstatic me/frep/aegisguard/spigot/aegisguard_F.b : [Ljava/lang/String;
    //   7: astore #12
    //   9: aload #12
    //   11: bipush #7
    //   13: aaload
    //   14: iconst_0
    //   15: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   18: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   21: astore_2
    //   22: goto -> 299
    //   25: astore_2
    //   26: getstatic me/frep/aegisguard/spigot/aegisguard_F.b : [Ljava/lang/String;
    //   29: astore #12
    //   31: aload #12
    //   33: iconst_3
    //   34: aaload
    //   35: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   38: astore_3
    //   39: aload_3
    //   40: aload #12
    //   42: iconst_5
    //   43: aaload
    //   44: iconst_0
    //   45: anewarray java/lang/Class
    //   48: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   51: astore #4
    //   53: aload #4
    //   55: iconst_1
    //   56: invokevirtual setAccessible : (Z)V
    //   59: aload #4
    //   61: aconst_null
    //   62: iconst_0
    //   63: anewarray java/lang/Object
    //   66: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   69: checkcast java/lang/String
    //   72: astore #5
    //   74: aload_3
    //   75: aload #12
    //   77: bipush #6
    //   79: aaload
    //   80: iconst_0
    //   81: anewarray java/lang/Class
    //   84: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   87: astore #6
    //   89: aload #6
    //   91: iconst_1
    //   92: invokevirtual setAccessible : (Z)V
    //   95: aload #6
    //   97: aconst_null
    //   98: iconst_0
    //   99: anewarray java/lang/Object
    //   102: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   105: checkcast java/lang/String
    //   108: astore #7
    //   110: aload_0
    //   111: aload #12
    //   113: iconst_2
    //   114: aaload
    //   115: iconst_2
    //   116: anewarray java/lang/Object
    //   119: dup
    //   120: iconst_0
    //   121: aload #5
    //   123: aastore
    //   124: dup
    //   125: iconst_1
    //   126: aload #7
    //   128: aastore
    //   129: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   132: invokevirtual aegisguard_s : (Ljava/lang/String;)Ljava/lang/String;
    //   135: astore #8
    //   137: aload #12
    //   139: iconst_0
    //   140: aaload
    //   141: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   144: astore #9
    //   146: aload #8
    //   148: invokevirtual length : ()I
    //   151: aload_1
    //   152: ifnonnull -> 192
    //   155: iconst_2
    //   156: if_icmple -> 281
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: aload #8
    //   168: ldc '\\n'
    //   170: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   173: aload_1
    //   174: ifnonnull -> 209
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: arraylength
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: ifle -> 281
    //   195: aload #8
    //   197: ldc '\\n'
    //   199: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: astore #10
    //   211: aload #9
    //   213: new java/lang/String
    //   216: dup
    //   217: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   220: aload #10
    //   222: iconst_0
    //   223: aaload
    //   224: invokevirtual decode : (Ljava/lang/String;)[B
    //   227: invokespecial <init> : ([B)V
    //   230: dup2
    //   231: invokestatic c : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    //   234: swap
    //   235: pop
    //   236: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   239: astore #11
    //   241: aload #11
    //   243: iconst_1
    //   244: invokevirtual setAccessible : (Z)V
    //   247: aload #11
    //   249: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   252: new java/lang/String
    //   255: dup
    //   256: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   259: aload #10
    //   261: iconst_1
    //   262: aaload
    //   263: invokevirtual decode : (Ljava/lang/String;)[B
    //   266: invokespecial <init> : ([B)V
    //   269: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   272: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   275: invokevirtual newInstance : ()Ljava/lang/Object;
    //   278: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   281: goto -> 299
    //   284: astore_3
    //   285: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   288: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   291: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   294: invokeinterface disablePlugin : (Lorg/bukkit/plugin/Plugin;)V
    //   299: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #36	-> 4
    //   #69	-> 22
    //   #37	-> 25
    //   #39	-> 26
    //   #41	-> 39
    //   #43	-> 53
    //   #45	-> 59
    //   #47	-> 74
    //   #49	-> 89
    //   #51	-> 95
    //   #53	-> 110
    //   #55	-> 137
    //   #57	-> 146
    //   #58	-> 195
    //   #60	-> 211
    //   #62	-> 241
    //   #64	-> 247
    //   #68	-> 281
    //   #66	-> 284
    //   #67	-> 285
    //   #70	-> 299
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/lang/Exception
    //   26	281	284	java/lang/ClassNotFoundException
    //   26	281	284	java/lang/NoSuchFieldException
    //   26	281	284	java/lang/IllegalAccessException
    //   26	281	284	java/lang/NoSuchMethodException
    //   26	281	284	java/lang/reflect/InvocationTargetException
    //   26	281	284	java/lang/InstantiationException
    //   146	159	162	java/lang/Exception
    //   155	177	180	java/lang/Exception
    //   166	185	188	java/lang/Exception
    //   192	202	205	java/lang/Exception
  }
  
  public String aegisguard_s(String paramString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_F.a : J
    //   3: ldc2_w 62181260330902
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_F : ()[I
    //   11: astore #4
    //   13: new java/net/URL
    //   16: dup
    //   17: aload_1
    //   18: invokespecial <init> : (Ljava/lang/String;)V
    //   21: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   24: checkcast java/net/HttpURLConnection
    //   27: astore #5
    //   29: aload #5
    //   31: getstatic me/frep/aegisguard/spigot/aegisguard_F.b : [Ljava/lang/String;
    //   34: astore #10
    //   36: aload #10
    //   38: iconst_4
    //   39: aaload
    //   40: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   43: aload #5
    //   45: aload #10
    //   47: bipush #9
    //   49: aaload
    //   50: aload #10
    //   52: iconst_1
    //   53: aaload
    //   54: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   57: aload #5
    //   59: aload #10
    //   61: bipush #8
    //   63: aaload
    //   64: aload #10
    //   66: bipush #10
    //   68: aaload
    //   69: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   72: aload #5
    //   74: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   77: astore #6
    //   79: new java/io/BufferedReader
    //   82: dup
    //   83: new java/io/InputStreamReader
    //   86: dup
    //   87: aload #6
    //   89: invokespecial <init> : (Ljava/io/InputStream;)V
    //   92: invokespecial <init> : (Ljava/io/Reader;)V
    //   95: astore #7
    //   97: new java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: astore #8
    //   106: aload #7
    //   108: invokevirtual readLine : ()Ljava/lang/String;
    //   111: dup
    //   112: astore #9
    //   114: ifnull -> 147
    //   117: aload #8
    //   119: aload #9
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: ldc '\\n'
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload #4
    //   131: ifnonnull -> 149
    //   134: pop
    //   135: aload #4
    //   137: ifnull -> 106
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload #8
    //   149: invokevirtual toString : ()Ljava/lang/String;
    //   152: areturn
    //   153: astore #5
    //   155: ldc ''
    //   157: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #74	-> 13
    //   #76	-> 29
    //   #77	-> 43
    //   #78	-> 57
    //   #80	-> 72
    //   #82	-> 79
    //   #84	-> 97
    //   #86	-> 106
    //   #87	-> 117
    //   #90	-> 147
    //   #91	-> 153
    //   #94	-> 155
    // Exception table:
    //   from	to	target	type
    //   13	152	153	java/lang/Exception
    //   117	140	143	java/lang/Exception
  }
  
  public static void aegisguard_g(int[] paramArrayOfint) {
    aegisguard_G = paramArrayOfint;
  }
  
  public static int[] aegisguard_F() {
    return aegisguard_G;
  }
  
  static {
    long l = a ^ 0x46A19CC9BF5BL;
    aegisguard_g(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "®û\037Eàf<ò\001ÚÛt¤\004¿\021ãKH<%XN&C\021 \013hZ¥V\025É+pÀÍ*ÀÞ¦\b\033]6¦[ä\004\016~ÅÅHâûß'n\\½Ýa¬qyrî¶x:5zµFª4ÖeL\033\032\0234AKðô[\ful³ö]úùî\034SÇÞoÓ(vú\032CîÊ ®û\037Eàf<ò\001ÚÛt¤\004¿\021ãKH<7>Â£\037á1\bZ\025@nú\026nR\b=³¸\034\016ø.\b£ý+ÌDÂþ\030Äjüøðn·Ë\024Ê\003OàFK:\035+ý\035õ{\b\021º\020ªø,").length();
    byte b2 = 32;
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
