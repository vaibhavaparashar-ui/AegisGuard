package me.frep.aegisguard.spigot.AegisGuard_V;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

public final class aegisguard_V extends YamlConfiguration {
  private final Map aegisguard_G = new HashMap<>();
  
  private boolean aegisguard_y = false;
  
  private static boolean aegisguard_S;
  
  private static final long a = aegisguard_e.a(-3278335295167187962L, -9172171413500601175L, MethodHandles.lookup().lookupClass()).a(107056933993652L);
  
  private static final String[] b;
  
  public void aegisguard_a(Object[] paramArrayOfObject) {
    File file = (File)paramArrayOfObject[0];
    InputStream inputStream = (InputStream)paramArrayOfObject[1];
    long l1 = ((Long)paramArrayOfObject[2]).longValue();
    String[] arrayOfString = (String[])paramArrayOfObject[3];
    l1 = a ^ l1;
    long l2 = l1 ^ 0x74B96E831221L, l3 = l1 ^ 0x3B5621ADB642L;
    boolean bool = aegisguard_G();
    try {
      if (bool) {
        try {
          if (this.aegisguard_y)
            return; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        new Object[2];
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    me.frep.aegisguard.spigot.aegisguard_V aegisguard_V = aegisguard_X(new Object[] { null, Long.valueOf(l2), inputStream });
    try {
      new Object[4];
      if (aegisguard_T(new Object[] { null, null, null, Long.valueOf(l3), Arrays.asList(arrayOfString), aegisguard_V.getConfigurationSection(""), aegisguard_V }))
        try {
          if (file != null)
            save(file); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void aegisguard_j(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore #4
    //   12: dup
    //   13: iconst_1
    //   14: aaload
    //   15: checkcast java/lang/String
    //   18: astore_2
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast java/lang/String
    //   25: astore_3
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   30: lload #4
    //   32: lxor
    //   33: lstore #4
    //   35: invokestatic aegisguard_t : ()Z
    //   38: istore #6
    //   40: aload_3
    //   41: iload #6
    //   43: ifne -> 97
    //   46: ifnonnull -> 79
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   55: athrow
    //   56: aload_0
    //   57: getfield aegisguard_G : Ljava/util/Map;
    //   60: aload_2
    //   61: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: iload #6
    //   69: ifeq -> 98
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   78: athrow
    //   79: aload_0
    //   80: getfield aegisguard_G : Ljava/util/Map;
    //   83: aload_2
    //   84: aload_3
    //   85: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   96: athrow
    //   97: pop
    //   98: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #68	-> 40
    //   #69	-> 56
    //   #71	-> 79
    //   #72	-> 98
    // Exception table:
    //   from	to	target	type
    //   40	49	52	java/lang/RuntimeException
    //   46	72	75	java/lang/RuntimeException
    //   56	90	93	java/lang/RuntimeException
  }
  
  public String aegisguard_b(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_P(new Object[] { null, null, str });
  }
  
  public String aegisguard_P(Object[] paramArrayOfObject) {
    String str1 = (String)paramArrayOfObject[0], str2 = (String)paramArrayOfObject[1];
    return (String)this.aegisguard_G.getOrDefault(str1, str2);
  }
  
  public boolean aegisguard_l(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    String str = (String)paramArrayOfObject[1];
    l = a ^ l;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (aegisguard_b(new Object[] { str }) != null);
  }
  
  public boolean aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_y;
  }
  
  public void loadFromString(String paramString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   3: ldc2_w 103585641386329
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 1205525163242
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 32161306820935
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 140343527640441
    //   27: lxor
    //   28: lstore #8
    //   30: pop2
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial loadFromString : (Ljava/lang/String;)V
    //   36: invokestatic aegisguard_G : ()Z
    //   39: aload_1
    //   40: ldc '\\n'
    //   42: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   45: astore #11
    //   47: istore #10
    //   49: iconst_0
    //   50: istore #12
    //   52: new java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: astore #13
    //   61: ldc ''
    //   63: astore #14
    //   65: iload #12
    //   67: aload #11
    //   69: arraylength
    //   70: if_icmpge -> 318
    //   73: aload #11
    //   75: iload #12
    //   77: aaload
    //   78: iconst_1
    //   79: anewarray java/lang/Object
    //   82: dup_x1
    //   83: swap
    //   84: iconst_0
    //   85: swap
    //   86: aastore
    //   87: invokestatic aegisguard_i : ([Ljava/lang/Object;)Z
    //   90: iload #10
    //   92: ifeq -> 168
    //   95: ifeq -> 133
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   104: athrow
    //   105: aload #13
    //   107: aload #11
    //   109: iload #12
    //   111: aaload
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: ldc '\\n'
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: iload #10
    //   123: ifne -> 310
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   132: athrow
    //   133: aload #11
    //   135: iload #12
    //   137: aaload
    //   138: lload #4
    //   140: iconst_2
    //   141: anewarray java/lang/Object
    //   144: dup_x2
    //   145: dup_x2
    //   146: pop
    //   147: invokestatic valueOf : (J)Ljava/lang/Long;
    //   150: iconst_1
    //   151: swap
    //   152: aastore
    //   153: dup_x1
    //   154: swap
    //   155: iconst_0
    //   156: swap
    //   157: aastore
    //   158: invokestatic aegisguard_o : ([Ljava/lang/Object;)Z
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   167: athrow
    //   168: iload #10
    //   170: ifeq -> 243
    //   173: ifeq -> 310
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   182: athrow
    //   183: aload_0
    //   184: aload #11
    //   186: iload #12
    //   188: aaload
    //   189: aload #14
    //   191: lload #8
    //   193: iconst_4
    //   194: anewarray java/lang/Object
    //   197: dup_x2
    //   198: dup_x2
    //   199: pop
    //   200: invokestatic valueOf : (J)Ljava/lang/Long;
    //   203: iconst_3
    //   204: swap
    //   205: aastore
    //   206: dup_x1
    //   207: swap
    //   208: iconst_2
    //   209: swap
    //   210: aastore
    //   211: dup_x1
    //   212: swap
    //   213: iconst_1
    //   214: swap
    //   215: aastore
    //   216: dup_x1
    //   217: swap
    //   218: iconst_0
    //   219: swap
    //   220: aastore
    //   221: invokestatic aegisguard_I : ([Ljava/lang/Object;)Ljava/lang/String;
    //   224: astore #14
    //   226: aload #13
    //   228: iload #10
    //   230: ifeq -> 308
    //   233: invokevirtual length : ()I
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: iconst_1
    //   244: if_icmple -> 301
    //   247: aload_0
    //   248: lload #6
    //   250: aload #14
    //   252: aload #13
    //   254: invokevirtual toString : ()Ljava/lang/String;
    //   257: iconst_0
    //   258: aload #13
    //   260: invokevirtual length : ()I
    //   263: iconst_1
    //   264: isub
    //   265: invokevirtual substring : (II)Ljava/lang/String;
    //   268: iconst_3
    //   269: anewarray java/lang/Object
    //   272: dup_x1
    //   273: swap
    //   274: iconst_2
    //   275: swap
    //   276: aastore
    //   277: dup_x1
    //   278: swap
    //   279: iconst_1
    //   280: swap
    //   281: aastore
    //   282: dup_x2
    //   283: dup_x2
    //   284: pop
    //   285: invokestatic valueOf : (J)Ljava/lang/Long;
    //   288: iconst_0
    //   289: swap
    //   290: aastore
    //   291: invokevirtual aegisguard_j : ([Ljava/lang/Object;)V
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   300: athrow
    //   301: new java/lang/StringBuilder
    //   304: dup
    //   305: invokespecial <init> : ()V
    //   308: astore #13
    //   310: iinc #12, 1
    //   313: iload #10
    //   315: ifne -> 65
    //   318: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   321: ifnonnull -> 348
    //   324: iload #10
    //   326: ifeq -> 344
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   335: athrow
    //   336: iconst_0
    //   337: goto -> 345
    //   340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   343: athrow
    //   344: iconst_1
    //   345: invokestatic aegisguard_J : (Z)V
    //   348: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #117	-> 31
    //   #120	-> 39
    //   #121	-> 49
    //   #124	-> 52
    //   #125	-> 61
    //   #127	-> 65
    //   #129	-> 73
    //   #131	-> 105
    //   #135	-> 133
    //   #137	-> 183
    //   #140	-> 226
    //   #142	-> 247
    //   #145	-> 301
    //   #149	-> 310
    //   #151	-> 318
    // Exception table:
    //   from	to	target	type
    //   73	98	101	org/bukkit/configuration/InvalidConfigurationException
    //   95	126	129	org/bukkit/configuration/InvalidConfigurationException
    //   105	161	164	org/bukkit/configuration/InvalidConfigurationException
    //   168	176	179	org/bukkit/configuration/InvalidConfigurationException
    //   226	236	239	org/bukkit/configuration/InvalidConfigurationException
    //   243	294	297	org/bukkit/configuration/InvalidConfigurationException
    //   318	329	332	org/bukkit/configuration/InvalidConfigurationException
    //   324	340	340	org/bukkit/configuration/InvalidConfigurationException
  }
  
  public String saveToString() {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   3: ldc2_w 131202794992417
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 44501234142866
    //   13: lxor
    //   14: lstore_3
    //   15: dup2
    //   16: ldc2_w 95406939336449
    //   19: lxor
    //   20: lstore #5
    //   22: dup2
    //   23: ldc2_w 29372923259455
    //   26: lxor
    //   27: lstore #7
    //   29: pop2
    //   30: aload_0
    //   31: invokevirtual options : ()Lorg/bukkit/configuration/file/YamlConfigurationOptions;
    //   34: aconst_null
    //   35: invokevirtual header : (Ljava/lang/String;)Lorg/bukkit/configuration/file/YamlConfigurationOptions;
    //   38: pop
    //   39: invokestatic aegisguard_G : ()Z
    //   42: new java/util/ArrayList
    //   45: dup
    //   46: aload_0
    //   47: invokespecial saveToString : ()Ljava/lang/String;
    //   50: ldc '\\n'
    //   52: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   55: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   58: invokespecial <init> : (Ljava/util/Collection;)V
    //   61: astore #10
    //   63: istore #9
    //   65: iconst_0
    //   66: istore #11
    //   68: ldc ''
    //   70: astore #12
    //   72: iload #11
    //   74: aload #10
    //   76: invokeinterface size : ()I
    //   81: if_icmpge -> 267
    //   84: aload #10
    //   86: iload #11
    //   88: invokeinterface get : (I)Ljava/lang/Object;
    //   93: checkcast java/lang/String
    //   96: astore #13
    //   98: iload #9
    //   100: ifeq -> 255
    //   103: aload #13
    //   105: lload_3
    //   106: iconst_2
    //   107: anewarray java/lang/Object
    //   110: dup_x2
    //   111: dup_x2
    //   112: pop
    //   113: invokestatic valueOf : (J)Ljava/lang/Long;
    //   116: iconst_1
    //   117: swap
    //   118: aastore
    //   119: dup_x1
    //   120: swap
    //   121: iconst_0
    //   122: swap
    //   123: aastore
    //   124: invokestatic aegisguard_o : ([Ljava/lang/Object;)Z
    //   127: ifeq -> 252
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   136: athrow
    //   137: aload_0
    //   138: aload #13
    //   140: aload #12
    //   142: lload #5
    //   144: iconst_4
    //   145: anewarray java/lang/Object
    //   148: dup_x2
    //   149: dup_x2
    //   150: pop
    //   151: invokestatic valueOf : (J)Ljava/lang/Long;
    //   154: iconst_3
    //   155: swap
    //   156: aastore
    //   157: dup_x1
    //   158: swap
    //   159: iconst_2
    //   160: swap
    //   161: aastore
    //   162: dup_x1
    //   163: swap
    //   164: iconst_1
    //   165: swap
    //   166: aastore
    //   167: dup_x1
    //   168: swap
    //   169: iconst_0
    //   170: swap
    //   171: aastore
    //   172: invokestatic aegisguard_I : ([Ljava/lang/Object;)Ljava/lang/String;
    //   175: astore #12
    //   177: iload #9
    //   179: ifeq -> 255
    //   182: aload_0
    //   183: lload #7
    //   185: aload #12
    //   187: iconst_2
    //   188: anewarray java/lang/Object
    //   191: dup_x1
    //   192: swap
    //   193: iconst_1
    //   194: swap
    //   195: aastore
    //   196: dup_x2
    //   197: dup_x2
    //   198: pop
    //   199: invokestatic valueOf : (J)Ljava/lang/Long;
    //   202: iconst_0
    //   203: swap
    //   204: aastore
    //   205: invokevirtual aegisguard_l : ([Ljava/lang/Object;)Z
    //   208: ifeq -> 252
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   217: athrow
    //   218: aload #10
    //   220: iload #11
    //   222: aload_0
    //   223: aload #12
    //   225: iconst_1
    //   226: anewarray java/lang/Object
    //   229: dup_x1
    //   230: swap
    //   231: iconst_0
    //   232: swap
    //   233: aastore
    //   234: invokevirtual aegisguard_b : ([Ljava/lang/Object;)Ljava/lang/String;
    //   237: invokeinterface add : (ILjava/lang/Object;)V
    //   242: iinc #11, 1
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   251: athrow
    //   252: iinc #11, 1
    //   255: iload #9
    //   257: ifne -> 72
    //   260: iconst_3
    //   261: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   264: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   267: new java/lang/StringBuilder
    //   270: dup
    //   271: invokespecial <init> : ()V
    //   274: astore #13
    //   276: aload #10
    //   278: invokeinterface iterator : ()Ljava/util/Iterator;
    //   283: astore #14
    //   285: aload #14
    //   287: invokeinterface hasNext : ()Z
    //   292: ifeq -> 337
    //   295: aload #14
    //   297: invokeinterface next : ()Ljava/lang/Object;
    //   302: checkcast java/lang/String
    //   305: astore #15
    //   307: aload #13
    //   309: ldc '\\n'
    //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: aload #15
    //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: pop
    //   320: iload #9
    //   322: ifeq -> 366
    //   325: iload #9
    //   327: ifne -> 285
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   336: athrow
    //   337: aload #13
    //   339: iload #9
    //   341: ifeq -> 368
    //   344: invokevirtual length : ()I
    //   347: ifne -> 366
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   356: athrow
    //   357: ldc ''
    //   359: goto -> 372
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: aload #13
    //   368: iconst_1
    //   369: invokevirtual substring : (I)Ljava/lang/String;
    //   372: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #160	-> 30
    //   #163	-> 42
    //   #166	-> 65
    //   #167	-> 68
    //   #169	-> 72
    //   #170	-> 84
    //   #173	-> 98
    //   #175	-> 137
    //   #177	-> 177
    //   #179	-> 218
    //   #181	-> 242
    //   #186	-> 252
    //   #187	-> 255
    //   #190	-> 267
    //   #191	-> 276
    //   #192	-> 307
    //   #194	-> 337
    // Exception table:
    //   from	to	target	type
    //   98	130	133	java/lang/RuntimeException
    //   177	211	214	java/lang/RuntimeException
    //   182	245	248	java/lang/RuntimeException
    //   307	330	333	java/lang/RuntimeException
    //   337	350	353	java/lang/RuntimeException
    //   344	362	362	java/lang/RuntimeException
  }
  
  private boolean aegisguard_T(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_V
    //   7: astore #6
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast org/bukkit/configuration/ConfigurationSection
    //   15: astore #4
    //   17: dup
    //   18: iconst_2
    //   19: aaload
    //   20: checkcast java/util/List
    //   23: astore #5
    //   25: dup
    //   26: iconst_3
    //   27: aaload
    //   28: checkcast java/lang/Long
    //   31: invokevirtual longValue : ()J
    //   34: lstore_2
    //   35: pop
    //   36: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   39: lload_2
    //   40: lxor
    //   41: lstore_2
    //   42: lload_2
    //   43: dup2
    //   44: ldc2_w 94209839939832
    //   47: lxor
    //   48: lstore #7
    //   50: dup2
    //   51: ldc2_w 22875215554209
    //   54: lxor
    //   55: lstore #9
    //   57: dup2
    //   58: ldc2_w 135488354732536
    //   61: lxor
    //   62: lstore #11
    //   64: dup2
    //   65: ldc2_w 79921391880910
    //   68: lxor
    //   69: lstore #13
    //   71: pop2
    //   72: invokestatic aegisguard_G : ()Z
    //   75: iconst_0
    //   76: istore #16
    //   78: istore #15
    //   80: aload #4
    //   82: iconst_0
    //   83: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   88: invokeinterface iterator : ()Ljava/util/Iterator;
    //   93: astore #17
    //   95: aload #17
    //   97: invokeinterface hasNext : ()Z
    //   102: ifeq -> 644
    //   105: aload #17
    //   107: invokeinterface next : ()Ljava/lang/Object;
    //   112: checkcast java/lang/String
    //   115: astore #18
    //   117: aload #4
    //   119: invokeinterface getCurrentPath : ()Ljava/lang/String;
    //   124: iload #15
    //   126: ifeq -> 162
    //   129: invokevirtual isEmpty : ()Z
    //   132: iload #15
    //   134: lload_2
    //   135: lconst_0
    //   136: lcmp
    //   137: ifle -> 654
    //   140: ifeq -> 652
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   149: athrow
    //   150: ifeq -> 165
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #18
    //   162: goto -> 196
    //   165: new java/lang/StringBuilder
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: aload #4
    //   174: invokeinterface getCurrentPath : ()Ljava/lang/String;
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: ldc_w '.'
    //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: aload #18
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: astore #19
    //   198: aload #4
    //   200: aload #18
    //   202: invokeinterface isConfigurationSection : (Ljava/lang/String;)Z
    //   207: iload #15
    //   209: lload_2
    //   210: lconst_0
    //   211: lcmp
    //   212: iflt -> 441
    //   215: ifeq -> 439
    //   218: ifeq -> 426
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   227: athrow
    //   228: aload #5
    //   230: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   235: aload #19
    //   237: dup
    //   238: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   241: pop
    //   242: <illegal opcode> test : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   247: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   252: istore #20
    //   254: aload_0
    //   255: aload #19
    //   257: invokevirtual contains : (Ljava/lang/String;)Z
    //   260: istore #21
    //   262: iload #21
    //   264: iload #15
    //   266: ifeq -> 369
    //   269: ifeq -> 315
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: iload #20
    //   281: iload #15
    //   283: lload_2
    //   284: lconst_0
    //   285: lcmp
    //   286: ifle -> 371
    //   289: ifeq -> 369
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   298: athrow
    //   299: lload_2
    //   300: lconst_0
    //   301: lcmp
    //   302: iflt -> 417
    //   305: ifne -> 415
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   314: athrow
    //   315: aload_0
    //   316: aload #6
    //   318: aload #4
    //   320: aload #18
    //   322: invokeinterface getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   327: aload #5
    //   329: lload #9
    //   331: iconst_4
    //   332: anewarray java/lang/Object
    //   335: dup_x2
    //   336: dup_x2
    //   337: pop
    //   338: invokestatic valueOf : (J)Ljava/lang/Long;
    //   341: iconst_3
    //   342: swap
    //   343: aastore
    //   344: dup_x1
    //   345: swap
    //   346: iconst_2
    //   347: swap
    //   348: aastore
    //   349: dup_x1
    //   350: swap
    //   351: iconst_1
    //   352: swap
    //   353: aastore
    //   354: dup_x1
    //   355: swap
    //   356: iconst_0
    //   357: swap
    //   358: aastore
    //   359: invokespecial aegisguard_T : ([Ljava/lang/Object;)Z
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: iload #15
    //   371: ifeq -> 409
    //   374: ifne -> 408
    //   377: goto -> 384
    //   380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   383: athrow
    //   384: iload #16
    //   386: iload #15
    //   388: ifeq -> 409
    //   391: goto -> 398
    //   394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   397: athrow
    //   398: ifeq -> 412
    //   401: goto -> 408
    //   404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   407: athrow
    //   408: iconst_1
    //   409: goto -> 413
    //   412: iconst_0
    //   413: istore #16
    //   415: iload #15
    //   417: lload_2
    //   418: lconst_0
    //   419: lcmp
    //   420: iflt -> 432
    //   423: ifne -> 478
    //   426: aload_0
    //   427: aload #19
    //   429: invokevirtual contains : (Ljava/lang/String;)Z
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   438: athrow
    //   439: iload #15
    //   441: lload_2
    //   442: lconst_0
    //   443: lcmp
    //   444: ifle -> 507
    //   447: ifeq -> 505
    //   450: ifne -> 478
    //   453: goto -> 460
    //   456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   459: athrow
    //   460: aload_0
    //   461: aload #19
    //   463: aload #4
    //   465: aload #18
    //   467: invokeinterface get : (Ljava/lang/String;)Ljava/lang/Object;
    //   472: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   475: iconst_1
    //   476: istore #16
    //   478: aload #6
    //   480: lload #11
    //   482: aload #19
    //   484: iconst_2
    //   485: anewarray java/lang/Object
    //   488: dup_x1
    //   489: swap
    //   490: iconst_1
    //   491: swap
    //   492: aastore
    //   493: dup_x2
    //   494: dup_x2
    //   495: pop
    //   496: invokestatic valueOf : (J)Ljava/lang/Long;
    //   499: iconst_0
    //   500: swap
    //   501: aastore
    //   502: invokevirtual aegisguard_l : ([Ljava/lang/Object;)Z
    //   505: iload #15
    //   507: lload_2
    //   508: lconst_0
    //   509: lcmp
    //   510: iflt -> 569
    //   513: ifeq -> 567
    //   516: ifeq -> 639
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   525: athrow
    //   526: aload #6
    //   528: aload #19
    //   530: iconst_1
    //   531: anewarray java/lang/Object
    //   534: dup_x1
    //   535: swap
    //   536: iconst_0
    //   537: swap
    //   538: aastore
    //   539: invokevirtual aegisguard_b : ([Ljava/lang/Object;)Ljava/lang/String;
    //   542: aload_0
    //   543: aload #19
    //   545: iconst_1
    //   546: anewarray java/lang/Object
    //   549: dup_x1
    //   550: swap
    //   551: iconst_0
    //   552: swap
    //   553: aastore
    //   554: invokevirtual aegisguard_b : ([Ljava/lang/Object;)Ljava/lang/String;
    //   557: invokevirtual equals : (Ljava/lang/Object;)Z
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   566: athrow
    //   567: iload #15
    //   569: ifeq -> 637
    //   572: ifne -> 639
    //   575: goto -> 582
    //   578: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   581: athrow
    //   582: aload_0
    //   583: lload #7
    //   585: aload #19
    //   587: aload #6
    //   589: aload #19
    //   591: iconst_1
    //   592: anewarray java/lang/Object
    //   595: dup_x1
    //   596: swap
    //   597: iconst_0
    //   598: swap
    //   599: aastore
    //   600: invokevirtual aegisguard_b : ([Ljava/lang/Object;)Ljava/lang/String;
    //   603: iconst_3
    //   604: anewarray java/lang/Object
    //   607: dup_x1
    //   608: swap
    //   609: iconst_2
    //   610: swap
    //   611: aastore
    //   612: dup_x1
    //   613: swap
    //   614: iconst_1
    //   615: swap
    //   616: aastore
    //   617: dup_x2
    //   618: dup_x2
    //   619: pop
    //   620: invokestatic valueOf : (J)Ljava/lang/Long;
    //   623: iconst_0
    //   624: swap
    //   625: aastore
    //   626: invokevirtual aegisguard_j : ([Ljava/lang/Object;)V
    //   629: iconst_1
    //   630: goto -> 637
    //   633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   636: athrow
    //   637: istore #16
    //   639: iload #15
    //   641: ifne -> 95
    //   644: lload_2
    //   645: lconst_0
    //   646: lcmp
    //   647: ifle -> 717
    //   650: iload #16
    //   652: iload #15
    //   654: ifeq -> 719
    //   657: ifeq -> 717
    //   660: goto -> 667
    //   663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   666: athrow
    //   667: aload #4
    //   669: aload_0
    //   670: aload #4
    //   672: invokeinterface getCurrentPath : ()Ljava/lang/String;
    //   677: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
    //   680: lload #13
    //   682: dup2_x1
    //   683: pop2
    //   684: iconst_3
    //   685: anewarray java/lang/Object
    //   688: dup_x1
    //   689: swap
    //   690: iconst_2
    //   691: swap
    //   692: aastore
    //   693: dup_x2
    //   694: dup_x2
    //   695: pop
    //   696: invokestatic valueOf : (J)Ljava/lang/Long;
    //   699: iconst_1
    //   700: swap
    //   701: aastore
    //   702: dup_x1
    //   703: swap
    //   704: iconst_0
    //   705: swap
    //   706: aastore
    //   707: invokestatic aegisguard_e : ([Ljava/lang/Object;)V
    //   710: goto -> 717
    //   713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   716: athrow
    //   717: iload #16
    //   719: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #206	-> 75
    //   #209	-> 80
    //   #211	-> 117
    //   #214	-> 198
    //   #216	-> 228
    //   #218	-> 254
    //   #220	-> 262
    //   #222	-> 315
    //   #224	-> 415
    //   #227	-> 426
    //   #229	-> 460
    //   #231	-> 475
    //   #235	-> 478
    //   #237	-> 582
    //   #239	-> 629
    //   #242	-> 639
    //   #249	-> 644
    //   #250	-> 667
    //   #252	-> 717
    // Exception table:
    //   from	to	target	type
    //   117	143	146	java/lang/RuntimeException
    //   129	153	156	java/lang/RuntimeException
    //   198	221	224	java/lang/RuntimeException
    //   262	272	275	java/lang/RuntimeException
    //   269	292	295	java/lang/RuntimeException
    //   279	308	311	java/lang/RuntimeException
    //   299	362	365	java/lang/RuntimeException
    //   369	377	380	java/lang/RuntimeException
    //   374	391	394	java/lang/RuntimeException
    //   384	401	404	java/lang/RuntimeException
    //   415	432	435	java/lang/RuntimeException
    //   439	453	456	java/lang/RuntimeException
    //   505	519	522	java/lang/RuntimeException
    //   516	560	563	java/lang/RuntimeException
    //   567	575	578	java/lang/RuntimeException
    //   572	630	633	java/lang/RuntimeException
    //   652	660	663	java/lang/RuntimeException
    //   657	710	713	java/lang/RuntimeException
  }
  
  private me.frep.aegisguard.spigot.aegisguard_V aegisguard_a(Object[] paramArrayOfObject) {
    this.aegisguard_y = true;
    return this;
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_V aegisguard_z(Object[] paramArrayOfObject) {
    File file = (File)paramArrayOfObject[0];
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x4CBE54C8A19AL;
    try {
      FileInputStream fileInputStream = new FileInputStream(file);
      (new Object[2])[1] = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
      new Object[2];
      return aegisguard_J(new Object[] { Long.valueOf(l2) });
    } catch (FileNotFoundException fileNotFoundException) {
      String[] arrayOfString = b;
      Bukkit.getLogger().warning(arrayOfString[4] + file.getName() + arrayOfString[0]);
      return (new me.frep.aegisguard.spigot.aegisguard_V()).aegisguard_a(new Object[0]);
    } 
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_V aegisguard_X(Object[] paramArrayOfObject) {
    InputStream inputStream = (InputStream)paramArrayOfObject[0];
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x2DD83E5DE500L;
    (new Object[2])[1] = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
    new Object[2];
    return aegisguard_J(new Object[] { Long.valueOf(l2) });
  }
  
  public static me.frep.aegisguard.spigot.aegisguard_V aegisguard_J(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_1
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/io/Reader
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_G : ()Z
    //   28: new me/frep/aegisguard/spigot/aegisguard_V
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #5
    //   37: istore #4
    //   39: aload_3
    //   40: iload #4
    //   42: ifeq -> 66
    //   45: instanceof java/io/BufferedReader
    //   48: ifeq -> 72
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   57: athrow
    //   58: aload_3
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   65: athrow
    //   66: checkcast java/io/BufferedReader
    //   69: goto -> 80
    //   72: new java/io/BufferedReader
    //   75: dup
    //   76: aload_3
    //   77: invokespecial <init> : (Ljava/io/Reader;)V
    //   80: astore #6
    //   82: new java/lang/StringBuilder
    //   85: dup
    //   86: invokespecial <init> : ()V
    //   89: astore #7
    //   91: aload #6
    //   93: invokevirtual readLine : ()Ljava/lang/String;
    //   96: dup
    //   97: astore #8
    //   99: ifnull -> 144
    //   102: aload #7
    //   104: aload #8
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: bipush #10
    //   111: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: lload_1
    //   116: lconst_0
    //   117: lcmp
    //   118: ifle -> 154
    //   121: iload #4
    //   123: ifeq -> 154
    //   126: iload #4
    //   128: ifne -> 91
    //   131: lload_1
    //   132: lconst_0
    //   133: lcmp
    //   134: ifle -> 115
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   143: athrow
    //   144: aload #5
    //   146: aload #7
    //   148: invokevirtual toString : ()Ljava/lang/String;
    //   151: invokevirtual loadFromString : (Ljava/lang/String;)V
    //   154: lload_1
    //   155: lconst_0
    //   156: lcmp
    //   157: iflt -> 182
    //   160: aload #6
    //   162: iload #4
    //   164: ifeq -> 179
    //   167: ifnull -> 230
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   176: athrow
    //   177: aload #6
    //   179: invokevirtual close : ()V
    //   182: goto -> 230
    //   185: astore #7
    //   187: lload_1
    //   188: lconst_0
    //   189: lcmp
    //   190: iflt -> 215
    //   193: aload #6
    //   195: iload #4
    //   197: ifeq -> 212
    //   200: ifnull -> 227
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   209: athrow
    //   210: aload #6
    //   212: invokevirtual close : ()V
    //   215: goto -> 227
    //   218: astore #8
    //   220: aload #7
    //   222: aload #8
    //   224: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   227: aload #7
    //   229: athrow
    //   230: goto -> 250
    //   233: astore #6
    //   235: aload #5
    //   237: iconst_0
    //   238: anewarray java/lang/Object
    //   241: invokespecial aegisguard_a : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_V;
    //   244: pop
    //   245: aload #6
    //   247: invokevirtual printStackTrace : ()V
    //   250: aload #5
    //   252: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #294	-> 28
    //   #297	-> 39
    //   #298	-> 82
    //   #301	-> 91
    //   #302	-> 102
    //   #305	-> 144
    //   #306	-> 154
    //   #297	-> 185
    //   #309	-> 230
    //   #306	-> 233
    //   #307	-> 235
    //   #308	-> 245
    //   #311	-> 250
    // Exception table:
    //   from	to	target	type
    //   39	51	54	java/lang/Throwable
    //   39	230	233	java/io/IOException
    //   39	230	233	org/bukkit/configuration/InvalidConfigurationException
    //   45	59	62	java/lang/Throwable
    //   82	154	185	java/lang/Throwable
    //   102	131	140	java/lang/Throwable
    //   154	170	173	java/lang/Throwable
    //   187	203	206	java/lang/Throwable
    //   210	215	218	java/lang/Throwable
  }
  
  private static boolean aegisguard_o(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/String
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_t : ()Z
    //   28: aload_1
    //   29: invokevirtual trim : ()Ljava/lang/String;
    //   32: astore #5
    //   34: istore #4
    //   36: aload #5
    //   38: getstatic me/frep/aegisguard/spigot/aegisguard_V.b : [Ljava/lang/String;
    //   41: iconst_2
    //   42: aaload
    //   43: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   46: iload #4
    //   48: ifne -> 92
    //   51: ifne -> 91
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   60: athrow
    //   61: aload #5
    //   63: ldc_w ':'
    //   66: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   69: iload #4
    //   71: ifne -> 92
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   80: athrow
    //   81: ifeq -> 95
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   90: athrow
    //   91: iconst_1
    //   92: goto -> 96
    //   95: iconst_0
    //   96: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #321	-> 28
    //   #322	-> 36
    // Exception table:
    //   from	to	target	type
    //   36	54	57	java/lang/RuntimeException
    //   51	74	77	java/lang/RuntimeException
    //   61	84	87	java/lang/RuntimeException
  }
  
  private static String aegisguard_I(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_V
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/String
    //   14: astore #4
    //   16: dup
    //   17: iconst_2
    //   18: aaload
    //   19: checkcast java/lang/String
    //   22: astore #5
    //   24: dup
    //   25: iconst_3
    //   26: aaload
    //   27: checkcast java/lang/Long
    //   30: invokevirtual longValue : ()J
    //   33: lstore_1
    //   34: pop
    //   35: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   38: lload_1
    //   39: lxor
    //   40: lstore_1
    //   41: lload_1
    //   42: dup2
    //   43: ldc2_w 125773513544044
    //   46: lxor
    //   47: lstore #6
    //   49: pop2
    //   50: invokestatic aegisguard_G : ()Z
    //   53: aload #4
    //   55: invokevirtual trim : ()Ljava/lang/String;
    //   58: getstatic me/frep/aegisguard/spigot/aegisguard_V.b : [Ljava/lang/String;
    //   61: iconst_1
    //   62: aaload
    //   63: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   66: iconst_0
    //   67: aaload
    //   68: astore #9
    //   70: istore #8
    //   72: aload #9
    //   74: ldc_w ':'
    //   77: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   80: iload #8
    //   82: ifeq -> 118
    //   85: ifeq -> 110
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   94: athrow
    //   95: aload #9
    //   97: iconst_0
    //   98: aload #9
    //   100: invokevirtual length : ()I
    //   103: iconst_1
    //   104: isub
    //   105: invokevirtual substring : (II)Ljava/lang/String;
    //   108: astore #9
    //   110: aload #9
    //   112: ldc_w '.'
    //   115: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   118: iload #8
    //   120: lload_1
    //   121: lconst_0
    //   122: lcmp
    //   123: ifle -> 157
    //   126: ifeq -> 155
    //   129: ifeq -> 147
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   138: athrow
    //   139: aload #9
    //   141: iconst_1
    //   142: invokevirtual substring : (I)Ljava/lang/String;
    //   145: astore #9
    //   147: aload #9
    //   149: ldc_w '''
    //   152: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   155: iload #8
    //   157: ifeq -> 238
    //   160: ifeq -> 221
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   169: athrow
    //   170: aload #9
    //   172: ldc_w '''
    //   175: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   178: lload_1
    //   179: lconst_0
    //   180: lcmp
    //   181: ifle -> 238
    //   184: iload #8
    //   186: ifeq -> 238
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   195: athrow
    //   196: ifeq -> 221
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   205: athrow
    //   206: aload #9
    //   208: iconst_1
    //   209: aload #9
    //   211: invokevirtual length : ()I
    //   214: iconst_1
    //   215: isub
    //   216: invokevirtual substring : (II)Ljava/lang/String;
    //   219: astore #9
    //   221: aload #5
    //   223: iload #8
    //   225: ifeq -> 335
    //   228: invokevirtual isEmpty : ()Z
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   237: athrow
    //   238: lload_1
    //   239: lconst_0
    //   240: lcmp
    //   241: iflt -> 277
    //   244: ifne -> 326
    //   247: aload_3
    //   248: new java/lang/StringBuilder
    //   251: dup
    //   252: invokespecial <init> : ()V
    //   255: aload #5
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: ldc_w '.'
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: aload #9
    //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual toString : ()Ljava/lang/String;
    //   274: invokevirtual contains : (Ljava/lang/String;)Z
    //   277: ifeq -> 326
    //   280: goto -> 287
    //   283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   286: athrow
    //   287: new java/lang/StringBuilder
    //   290: dup
    //   291: invokespecial <init> : ()V
    //   294: aload #5
    //   296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: ldc_w '.'
    //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: aload #9
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: invokevirtual toString : ()Ljava/lang/String;
    //   313: lload_1
    //   314: lconst_0
    //   315: lcmp
    //   316: ifle -> 504
    //   319: astore #9
    //   321: iload #8
    //   323: ifne -> 502
    //   326: aload #5
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   334: athrow
    //   335: astore #10
    //   337: aload #10
    //   339: invokevirtual isEmpty : ()Z
    //   342: ifne -> 446
    //   345: aload_3
    //   346: new java/lang/StringBuilder
    //   349: dup
    //   350: invokespecial <init> : ()V
    //   353: lload #6
    //   355: aload #10
    //   357: iconst_2
    //   358: anewarray java/lang/Object
    //   361: dup_x1
    //   362: swap
    //   363: iconst_1
    //   364: swap
    //   365: aastore
    //   366: dup_x2
    //   367: dup_x2
    //   368: pop
    //   369: invokestatic valueOf : (J)Ljava/lang/Long;
    //   372: iconst_0
    //   373: swap
    //   374: aastore
    //   375: invokestatic aegisguard_C : ([Ljava/lang/Object;)Ljava/lang/String;
    //   378: dup
    //   379: astore #10
    //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: ldc_w '.'
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: aload #9
    //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: invokevirtual toString : ()Ljava/lang/String;
    //   398: invokevirtual contains : (Ljava/lang/String;)Z
    //   401: lload_1
    //   402: lconst_0
    //   403: lcmp
    //   404: ifle -> 459
    //   407: iload #8
    //   409: lload_1
    //   410: lconst_0
    //   411: lcmp
    //   412: ifle -> 420
    //   415: ifeq -> 466
    //   418: iload #8
    //   420: ifeq -> 466
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   429: athrow
    //   430: ifne -> 446
    //   433: goto -> 440
    //   436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   439: athrow
    //   440: lload_1
    //   441: lconst_0
    //   442: lcmp
    //   443: ifge -> 337
    //   446: aload #10
    //   448: invokevirtual trim : ()Ljava/lang/String;
    //   451: iload #8
    //   453: ifeq -> 471
    //   456: invokevirtual isEmpty : ()Z
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   465: athrow
    //   466: ifeq -> 474
    //   469: aload #9
    //   471: goto -> 500
    //   474: new java/lang/StringBuilder
    //   477: dup
    //   478: invokespecial <init> : ()V
    //   481: aload #10
    //   483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: ldc_w '.'
    //   489: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: aload #9
    //   494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: invokevirtual toString : ()Ljava/lang/String;
    //   500: astore #9
    //   502: aload #9
    //   504: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #334	-> 53
    //   #337	-> 72
    //   #338	-> 95
    //   #339	-> 110
    //   #340	-> 139
    //   #341	-> 147
    //   #342	-> 206
    //   #345	-> 221
    //   #346	-> 287
    //   #351	-> 326
    //   #356	-> 337
    //   #357	-> 357
    //   #360	-> 446
    //   #363	-> 502
    // Exception table:
    //   from	to	target	type
    //   72	88	91	java/lang/RuntimeException
    //   118	132	135	java/lang/RuntimeException
    //   155	163	166	java/lang/RuntimeException
    //   160	189	192	java/lang/RuntimeException
    //   170	199	202	java/lang/RuntimeException
    //   221	231	234	java/lang/RuntimeException
    //   238	280	283	java/lang/RuntimeException
    //   321	328	331	java/lang/RuntimeException
    //   381	423	426	java/lang/RuntimeException
    //   418	433	436	java/lang/RuntimeException
    //   446	459	462	java/lang/RuntimeException
  }
  
  private static boolean aegisguard_i(Object[] paramArrayOfObject) {
    String str1 = (String)paramArrayOfObject[0], str2 = str1.trim();
    return str2.startsWith(b[3]);
  }
  
  private static String aegisguard_C(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    String str = (String)paramArrayOfObject[1];
    l = a ^ l;
    boolean bool = aegisguard_G();
    try {
      if (bool)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return str.contains(".") ? str.substring(0, str.lastIndexOf('.')) : "";
  }
  
  private static void aegisguard_e(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/configuration/ConfigurationSection
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast org/bukkit/configuration/ConfigurationSection
    //   24: astore #4
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   30: lload_2
    //   31: lxor
    //   32: lstore_2
    //   33: lload_2
    //   34: dup2
    //   35: ldc2_w 62619217499017
    //   38: lxor
    //   39: lstore #5
    //   41: dup2
    //   42: ldc2_w 18724629558163
    //   45: lxor
    //   46: lstore #7
    //   48: pop2
    //   49: aload_1
    //   50: lload #5
    //   52: iconst_2
    //   53: anewarray java/lang/Object
    //   56: dup_x2
    //   57: dup_x2
    //   58: pop
    //   59: invokestatic valueOf : (J)Ljava/lang/Long;
    //   62: iconst_1
    //   63: swap
    //   64: aastore
    //   65: dup_x1
    //   66: swap
    //   67: iconst_0
    //   68: swap
    //   69: aastore
    //   70: invokestatic aegisguard_G : ([Ljava/lang/Object;)Ljava/util/List;
    //   73: astore #10
    //   75: invokestatic aegisguard_G : ()Z
    //   78: new java/util/ArrayList
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: astore #11
    //   87: istore #9
    //   89: aload #10
    //   91: invokeinterface iterator : ()Ljava/util/Iterator;
    //   96: astore #12
    //   98: aload #12
    //   100: invokeinterface hasNext : ()Z
    //   105: ifeq -> 205
    //   108: aload #12
    //   110: invokeinterface next : ()Ljava/lang/Object;
    //   115: checkcast me/frep/aegisguard/spigot/aegisguard_x
    //   118: astore #13
    //   120: aload #11
    //   122: lload_2
    //   123: lconst_0
    //   124: lcmp
    //   125: iflt -> 232
    //   128: new me/frep/aegisguard/spigot/aegisguard_x
    //   131: dup
    //   132: aload #13
    //   134: iconst_1
    //   135: anewarray java/lang/Object
    //   138: dup_x1
    //   139: swap
    //   140: iconst_0
    //   141: swap
    //   142: aastore
    //   143: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   146: checkcast java/lang/String
    //   149: aload #4
    //   151: aload #13
    //   153: iconst_1
    //   154: anewarray java/lang/Object
    //   157: dup_x1
    //   158: swap
    //   159: iconst_0
    //   160: swap
    //   161: aastore
    //   162: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   165: checkcast java/lang/String
    //   168: invokeinterface get : (Ljava/lang/String;)Ljava/lang/Object;
    //   173: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   176: invokeinterface add : (Ljava/lang/Object;)Z
    //   181: pop
    //   182: iload #9
    //   184: ifeq -> 230
    //   187: iload #9
    //   189: ifne -> 98
    //   192: lload_2
    //   193: lconst_0
    //   194: lcmp
    //   195: iflt -> 182
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   204: athrow
    //   205: lload #7
    //   207: aload #4
    //   209: iconst_2
    //   210: anewarray java/lang/Object
    //   213: dup_x1
    //   214: swap
    //   215: iconst_1
    //   216: swap
    //   217: aastore
    //   218: dup_x2
    //   219: dup_x2
    //   220: pop
    //   221: invokestatic valueOf : (J)Ljava/lang/Long;
    //   224: iconst_0
    //   225: swap
    //   226: aastore
    //   227: invokestatic aegisguard_D : ([Ljava/lang/Object;)V
    //   230: aload #11
    //   232: invokeinterface iterator : ()Ljava/util/Iterator;
    //   237: astore #12
    //   239: aload #12
    //   241: invokeinterface hasNext : ()Z
    //   246: ifeq -> 304
    //   249: aload #12
    //   251: invokeinterface next : ()Ljava/lang/Object;
    //   256: checkcast me/frep/aegisguard/spigot/aegisguard_x
    //   259: astore #13
    //   261: aload #4
    //   263: aload #13
    //   265: iconst_1
    //   266: anewarray java/lang/Object
    //   269: dup_x1
    //   270: swap
    //   271: iconst_0
    //   272: swap
    //   273: aastore
    //   274: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   277: checkcast java/lang/String
    //   280: aload #13
    //   282: iconst_1
    //   283: anewarray java/lang/Object
    //   286: dup_x1
    //   287: swap
    //   288: iconst_0
    //   289: swap
    //   290: aastore
    //   291: invokestatic aegisguard_V : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   294: invokeinterface set : (Ljava/lang/String;Ljava/lang/Object;)V
    //   299: iload #9
    //   301: ifne -> 239
    //   304: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #392	-> 49
    //   #395	-> 89
    //   #397	-> 120
    //   #398	-> 182
    //   #404	-> 205
    //   #407	-> 230
    //   #408	-> 261
    //   #409	-> 304
    // Exception table:
    //   from	to	target	type
    //   120	192	201	java/lang/RuntimeException
  }
  
  private static List aegisguard_G(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/configuration/ConfigurationSection
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_V.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_G : ()Z
    //   28: new java/util/ArrayList
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #5
    //   37: aload_1
    //   38: iconst_0
    //   39: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore #6
    //   51: istore #4
    //   53: aload #6
    //   55: invokeinterface hasNext : ()Z
    //   60: ifeq -> 129
    //   63: aload #6
    //   65: invokeinterface next : ()Ljava/lang/Object;
    //   70: checkcast java/lang/String
    //   73: astore #7
    //   75: lload_2
    //   76: lconst_0
    //   77: lcmp
    //   78: ifle -> 111
    //   81: aload #5
    //   83: iload #4
    //   85: ifeq -> 131
    //   88: new me/frep/aegisguard/spigot/aegisguard_x
    //   91: dup
    //   92: aload #7
    //   94: aload_1
    //   95: aload #7
    //   97: invokeinterface get : (Ljava/lang/String;)Ljava/lang/Object;
    //   102: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   105: invokeinterface add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: iload #4
    //   113: ifne -> 53
    //   116: lload_2
    //   117: lconst_0
    //   118: lcmp
    //   119: ifle -> 75
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   128: athrow
    //   129: aload #5
    //   131: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #418	-> 28
    //   #421	-> 37
    //   #422	-> 75
    //   #423	-> 111
    //   #425	-> 129
    // Exception table:
    //   from	to	target	type
    //   75	116	125	java/lang/RuntimeException
  }
  
  private static void aegisguard_D(Object[] paramArrayOfObject) {
    long l;
    ConfigurationSection configurationSection;
    boolean bool;
    Iterator<String> iterator;
    for (l = ((Long)paramArrayOfObject[0]).longValue(), configurationSection = (ConfigurationSection)paramArrayOfObject[1], l = a ^ l, iterator = configurationSection.getKeys(false).iterator(), bool = aegisguard_G(); iterator.hasNext(); ) {
      String str = iterator.next();
      configurationSection.set(str, null);
      if (!bool)
        break; 
    } 
  }
  
  public static void aegisguard_J(boolean paramBoolean) {
    aegisguard_S = paramBoolean;
  }
  
  public static boolean aegisguard_G() {
    return aegisguard_S;
  }
  
  public static boolean aegisguard_t() {
    boolean bool = aegisguard_G();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = a ^ 0x5E9D9E251612L;
    aegisguard_J(true);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "yÃFi*I*Tå9³\000~\036s\bZia7ÝÒ\bZia7ÝÒ").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
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
