package me.frep.aegisguard.spigot.AegisGuard_XS;

import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguardPlugin;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_K3;
import me.frep.aegisguard.spigot.aegisguard_Xk;
import me.frep.aegisguard.spigot.aegisguard_Xq;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_ha;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class aegisguard_XS {
  private aegisguard_ha aegisguard_B;
  
  private Object aegisguard_w;
  
  private final List aegisguard__;
  
  private static boolean aegisguard_s;
  
  private static final long a = aegisguard_e.a(-4713601162524027169L, -6855891640028134626L, MethodHandles.lookup().lookupClass()).a(153761462274932L);
  
  private static final String[] b;
  
  public aegisguard_XS() {
    boolean bool = aegisguard_x();
    try {
      this.aegisguard__ = Collections.singletonList(new aegisguard_K3());
      if (!bool)
        AbstractCheck.aegisguard_g(new AbstractCheck[3]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public aegisguard_ha aegisguard_W(Object[] paramArrayOfObject) {
    return this.aegisguard_B;
  }
  
  public Object aegisguard_z(Object[] paramArrayOfObject) {
    return this.aegisguard_w;
  }
  
  public List aegisguard__(Object[] paramArrayOfObject) {
    return this.aegisguard__;
  }
  
  public void aegisguard_A(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x73A1DFFACA7DL;
    new Object[1];
    this.aegisguard_B = new aegisguard_ha(aegisguardPlugin.class.getClassLoader(), aegisguard_n(new Object[] { Long.valueOf(l2) }));
    try {
      Class clazz = this.aegisguard_B.findClass(b[1]);
      try {
        if (clazz != null)
          this.aegisguard_w = clazz.getConstructor(new Class[0]).newInstance(new Object[0]); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Bukkit.getPluginManager().disablePlugin((Plugin)aegisguard_K.INSTANCE.aegisguard_j());
    } 
  }
  
  private aegisguard_Xk aegisguard_n(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_XS.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: ldc me/frep/aegisguard/spigot/aegisguard_XS
    //   20: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   23: aload_0
    //   24: iconst_0
    //   25: anewarray java/lang/Object
    //   28: invokevirtual aegisguard_a : ([Ljava/lang/Object;)Ljava/lang/String;
    //   31: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   34: astore #5
    //   36: invokestatic aegisguard_o : ()Z
    //   39: new java/io/ByteArrayOutputStream
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: astore #6
    //   48: istore #4
    //   50: sipush #16384
    //   53: newarray byte
    //   55: astore #8
    //   57: aload #5
    //   59: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   62: checkcast java/io/InputStream
    //   65: aload #8
    //   67: iconst_0
    //   68: aload #8
    //   70: arraylength
    //   71: invokevirtual read : ([BII)I
    //   74: dup
    //   75: istore #7
    //   77: iconst_m1
    //   78: if_icmpeq -> 120
    //   81: aload #6
    //   83: lload_2
    //   84: lconst_0
    //   85: lcmp
    //   86: iflt -> 141
    //   89: aload #8
    //   91: iconst_0
    //   92: iload #7
    //   94: invokevirtual write : ([BII)V
    //   97: iload #4
    //   99: ifne -> 139
    //   102: iload #4
    //   104: ifeq -> 57
    //   107: lload_2
    //   108: lconst_0
    //   109: lcmp
    //   110: iflt -> 97
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: goto -> 139
    //   123: astore #9
    //   125: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   128: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   131: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   134: invokeinterface disablePlugin : (Lorg/bukkit/plugin/Plugin;)V
    //   139: aload #6
    //   141: invokevirtual toByteArray : ()[B
    //   144: astore #9
    //   146: aload #9
    //   148: aload #9
    //   150: arraylength
    //   151: iconst_3
    //   152: isub
    //   153: aload #9
    //   155: arraylength
    //   156: invokestatic copyOfRange : ([BII)[B
    //   159: astore #10
    //   161: new java/lang/String
    //   164: dup
    //   165: aload #10
    //   167: invokespecial <init> : ([B)V
    //   170: astore #11
    //   172: aload_0
    //   173: iconst_0
    //   174: anewarray java/lang/Object
    //   177: invokevirtual aegisguard__ : ([Ljava/lang/Object;)Ljava/util/List;
    //   180: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   185: aload #11
    //   187: <illegal opcode> test : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   192: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   197: invokeinterface findAny : ()Ljava/util/Optional;
    //   202: aconst_null
    //   203: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   206: checkcast me/frep/aegisguard/spigot/aegisguard_Xq
    //   209: astore #12
    //   211: aload #12
    //   213: ifnonnull -> 222
    //   216: aconst_null
    //   217: areturn
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: iconst_3
    //   223: istore #13
    //   225: bipush #16
    //   227: istore #14
    //   229: aload #9
    //   231: aload #9
    //   233: arraylength
    //   234: iload #13
    //   236: iload #14
    //   238: iadd
    //   239: isub
    //   240: aload #9
    //   242: arraylength
    //   243: iload #13
    //   245: isub
    //   246: invokestatic copyOfRange : ([BII)[B
    //   249: astore #15
    //   251: bipush #16
    //   253: istore #16
    //   255: aload #9
    //   257: arraylength
    //   258: iload #13
    //   260: iload #14
    //   262: iadd
    //   263: iload #16
    //   265: iadd
    //   266: isub
    //   267: istore #17
    //   269: aload #9
    //   271: iload #17
    //   273: aload #9
    //   275: arraylength
    //   276: iload #13
    //   278: iload #14
    //   280: iadd
    //   281: isub
    //   282: invokestatic copyOfRange : ([BII)[B
    //   285: astore #18
    //   287: aload #9
    //   289: iconst_0
    //   290: iload #17
    //   292: invokestatic copyOfRange : ([BII)[B
    //   295: astore #19
    //   297: new me/frep/aegisguard/spigot/aegisguard_Xk
    //   300: dup
    //   301: aload #12
    //   303: aload #19
    //   305: aload #18
    //   307: aload #15
    //   309: invokespecial <init> : (Lme/frep/aegisguard/spigot/aegisguard_Xq;[B[B[B)V
    //   312: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #48	-> 18
    //   #51	-> 39
    //   #55	-> 50
    //   #59	-> 57
    //   #61	-> 81
    //   #65	-> 120
    //   #63	-> 123
    //   #64	-> 125
    //   #68	-> 139
    //   #71	-> 146
    //   #74	-> 161
    //   #77	-> 172
    //   #78	-> 180
    //   #79	-> 192
    //   #80	-> 197
    //   #81	-> 203
    //   #84	-> 211
    //   #85	-> 216
    //   #89	-> 222
    //   #90	-> 225
    //   #91	-> 229
    //   #94	-> 251
    //   #95	-> 255
    //   #98	-> 269
    //   #101	-> 287
    //   #103	-> 297
    // Exception table:
    //   from	to	target	type
    //   57	120	123	java/io/IOException
    //   81	107	116	java/io/IOException
    //   211	218	218	java/io/IOException
  }
  
  private static boolean lambda$generateEncClazzInstance$0(String paramString, aegisguard_Xq paramaegisguard_Xq) {
    return paramaegisguard_Xq.aegisguard_L(new Object[0]).equals(paramString);
  }
  
  public String aegisguard_a(Object[] paramArrayOfObject) {
    return b[0];
  }
  
  public static void aegisguard_n(boolean paramBoolean) {
    aegisguard_s = paramBoolean;
  }
  
  public static boolean aegisguard_o() {
    return aegisguard_s;
  }
  
  public static boolean aegisguard_x() {
    boolean bool = aegisguard_o();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = a ^ 0x76F95B1CF433L;
    aegisguard_n(false);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "­N\027\tsWQJBÒã\\\005¾ -/d E.iQ±\024\020ÔK÷Ø8ä;\0234\005@\025[ZÊµ\027").length();
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
