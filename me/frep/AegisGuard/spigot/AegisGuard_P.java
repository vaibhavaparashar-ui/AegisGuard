package me.frep.aegisguard.spigot.AegisGuard_P;

import java.lang.invoke.MethodHandles;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public final class aegisguard_P {
  public static List aegisguard_Y;
  
  public static List aegisguard_a;
  
  private static String[] aegisguard_g;
  
  private aegisguard_P() {
    throw new UnsupportedOperationException(b[50]);
  }
  
  private static final long a = aegisguard_e.a(1432041269756157119L, 3275021174333802821L, MethodHandles.lookup().lookupClass()).a(205182468601858L);
  
  private static final String[] b;
  
  static {
    long l = a ^ 0x7ACBDF5FE1DDL;
    aegisguard_f(new String[5]);
    byte b1;
    for ((new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[151];
    boolean bool = false;
    String str;
    int i = (str = "\026\017ô\rNÄ\b»Ö3;§Ä\n\bÓÛ&d\036¶\023­\bæuDæ²â\031u\bc@ÑØ:l\bº\"ñs§¢Ñ\bé\037ûCÂ¸\b#\034Z,nYp[\020\bÛV6{@w\022\027ç|81ú\030Îc±*qÁ\026·iúÈ0V\016}W\007ï@úÉ\016\020\bÁ\026q\021Þ\b§ä\016ÃgPÕ\br<O}ñ#\bp¿Rî½¯êý\020¡ê¦Ñ\025­\003áÓÊHç°\020Y!k îï²õdê= \b\001ZkÁHÜ},\020¡dôKû\032ã%'$¿Øo2¸\bìßce·G(\b9öâ»ã¨+\020/\006Ú¸«¯\"/w¢1®÷ÿ¸\020zÿXFyTâËKktP\rÍeÕ\020É ³\fàØÐ\004ÎW:ÖÝ\bßgíýüh\020æÛ=a\025h¬=jówîh»X\b-#Ëí\020b\003\020,¼.Möñ¹9\026øF\030Y!k îüë{\004&ÉûÐÞ÷M{\013(\bòz7-î\b\0248\000¶fË¤\020\023\033\033£ð°æ\013óqÜ\020ê\020\013M»Ëp.-´,ú¶Ì!v\báwÅdÿ\f\020ÿ\020\nIîè­ûS`}ï\021N\020«¨<$·S.^uqt%ù\b \034<1º1\b A¤jsf\020¶ºá\023æ¦e²\\$\036¼j\bàFè\034E3\003\bk2ÔÇ@ô\020ÐQº¶\013\r\034·¿ {rPT\bÂu-Óñß0\b:Þùö\001\bL¸H¶2@\020e\nsfí÷¢Ñ\"Y6Vt\\û\bû; ÒMw2X\b*=0\033]å\020ÅÌ<S2ùE\031øßi³\002P\bSù|÷0ð\026Þ\b\016.§]\035s@ª8VNëtåVä\037\017}¿J (x¨+6Ê§\022ó°0y>½ÒÏÀîZ¸¶Å\b-ï\\§eåÀó¬pwLò\bv>`l]þ|\bJ§<«öÐd\b±Þ4V*T\b\0248\000¶fË¤\b`÷ l¥F5\b/onÆ¤çÇ}\b-#Ëí\020b\003\báÉ(DÈÏÄ\020mðçhÄaÌJ\006åZÖ:\b´&À\031ùª\006\b*=0\033]å\020Óüá^ fäÛb/¯ë\026¡\\\033\020æç\002ëÖ¹ÓP\0178FH¬¨\bfû\nàôÎ¤ç\020\022¿,\"m\"IN%³£Pù@Ò\b)ØZbØg\017\b{:M\000\023\0220\btÕæV|\032Ï\020zÿXFyTâËKktP\rÍeÕ\bÄZ`Ã\002 Û(\020\031\001­\003B_=ÉHRÃãõ±\b\r êTÙÓjm\bº\"ñs§¢Ñ\020\"Uÿì¨;Däj¿ëozuWV\b£\030\037\r}K_\b¿¦f^gÞ$\b´\037\016\f\035zW9\b´&À\031ùª\006\b¹Ô~DÈ>\005£\bû; ÒMw2X\b\016.§]\035s@ª\b9öâ»ã¨+\020Ã\034G\003\033½D³V)þÕæâ!\020mðçhÄaÌJ\006åZÖ:\b±Þ4V*T\b\003ô\n]\020¶\bòú¡\027üUø\020Ù\002»ØÀ|V¶\020ý\0315#{\b\004ÚmÅ,\017\bõU±U?\f\bJ§<«öÐd\bk±E>×ø\007\020¼£Úd0ñ'Á£\013\033c3P\bÄsr2¶R\b3kL\"¾·\035\b A¤jsf\bßgíýüh\b\017\024Õþ²\006ÞÏ\bp¿Rî½¯êý\báwÅdÿ\f\030ì\rÏ¾J¸ú\000\007o!oØ¡\000é\0351Ê©\020\020\013\005Ý\032ù\026 ^$Ýº\bÁ\026q\021Þ\020H\017\004õW¹g\000xfá¤«_\020\007ØlE\004'w©ÑÛÑx\005\b@Ý~ÂÆ\0341\n\030ì\rÏ¾J¸ú\000\007o!oØ¡\000é\0351Ê©\020\b\003ü\bÄ\025\020k=TO.]n?òQ.îX\"\022ù\bk2ÔÇ@ô\bZ\024áÒ.\024Á\b#\034Z,nYp[\020æç\002ëÖ¹ÓP\0178FH¬¨\b£¼òd¤°\020i°¤& \013+á¶}1f©\b\033£²2@ 7á\020®¿\022ðöø«ßP\027\\\føÀ)\bßöÅâºK¢É\b\033©è¶-\\\030\020ãYØÁ!sx]éàN·JÐ\bÀzS)IúÏ@\020¨rQfA4I\002ë\005Jgé\b<@æa©â\021\bä/K£¢ì7r\bì}çKØÝ\023\b]yÈ¶û¿\bFäKÁ+\bÛ7°úgû\bÛ7°úgû\020N&qn\032GÜtep\023\b£¼òd¤°\b¡²ax­?x\bbÔTWZ>vp\030°@Ö\"§\006|Qæ¶yUl&\bóü+:\båLÔ]dZy\020«¨<$·S.^uqt%ù\b}ßÉ\034¥<\033K\bk±E>×ø\007\b\001\024½~¾×\001h\b\035i\024\022\013\b£\030\037\r}K_\020Óüá^ fäÛb/¯ë\026¡\\\033\bR!CÒÈ¦6-\bQ\rÆ¨Ç3\b°ª\024\001°¾w¸\b\0243\017[\bSñÀ7/©Fþ\b\001ZkÁHÜ},").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
  }
  
  public static List aegisguard_B(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/World
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Integer
    //   14: invokevirtual intValue : ()I
    //   17: istore_3
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast java/lang/Integer
    //   24: invokevirtual intValue : ()I
    //   27: istore #5
    //   29: dup
    //   30: iconst_3
    //   31: aaload
    //   32: checkcast java/lang/Integer
    //   35: invokevirtual intValue : ()I
    //   38: istore #4
    //   40: dup
    //   41: iconst_4
    //   42: aaload
    //   43: checkcast java/lang/Long
    //   46: invokevirtual longValue : ()J
    //   49: lstore #6
    //   51: dup
    //   52: iconst_5
    //   53: aaload
    //   54: checkcast java/lang/Integer
    //   57: invokevirtual intValue : ()I
    //   60: istore_2
    //   61: pop
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   65: lload #6
    //   67: lxor
    //   68: lstore #6
    //   70: new java/util/LinkedList
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: astore #9
    //   79: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   82: iload_3
    //   83: iload_2
    //   84: isub
    //   85: istore #10
    //   87: astore #8
    //   89: iload #10
    //   91: iload_3
    //   92: iload_2
    //   93: iadd
    //   94: if_icmpgt -> 275
    //   97: iload #5
    //   99: iload_2
    //   100: isub
    //   101: istore #11
    //   103: iload #11
    //   105: iload #5
    //   107: iload_2
    //   108: iadd
    //   109: iconst_1
    //   110: iadd
    //   111: if_icmpgt -> 260
    //   114: iload #4
    //   116: iload_2
    //   117: isub
    //   118: aload #8
    //   120: ifnonnull -> 91
    //   123: istore #12
    //   125: iload #12
    //   127: iload #4
    //   129: iload_2
    //   130: iadd
    //   131: if_icmpgt -> 245
    //   134: aload_1
    //   135: iload #10
    //   137: iconst_4
    //   138: ishr
    //   139: iload #12
    //   141: iconst_4
    //   142: ishr
    //   143: invokeinterface isChunkLoaded : (II)Z
    //   148: aload #8
    //   150: ifnonnull -> 105
    //   153: aload #8
    //   155: lload #6
    //   157: lconst_0
    //   158: lcmp
    //   159: ifle -> 120
    //   162: ifnonnull -> 236
    //   165: ifeq -> 219
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   174: athrow
    //   175: aload #9
    //   177: aload_1
    //   178: iload #10
    //   180: iload #11
    //   182: iload #12
    //   184: invokeinterface getBlockAt : (III)Lorg/bukkit/block/Block;
    //   189: invokeinterface getType : ()Lorg/bukkit/Material;
    //   194: invokeinterface add : (Ljava/lang/Object;)Z
    //   199: pop
    //   200: aload #8
    //   202: lload #6
    //   204: lconst_0
    //   205: lcmp
    //   206: iflt -> 242
    //   209: ifnull -> 237
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   218: athrow
    //   219: aload #9
    //   221: getstatic org/bukkit/Material.SPONGE : Lorg/bukkit/Material;
    //   224: invokeinterface add : (Ljava/lang/Object;)Z
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   235: athrow
    //   236: pop
    //   237: iinc #12, 1
    //   240: aload #8
    //   242: ifnull -> 125
    //   245: iinc #11, 1
    //   248: aload #8
    //   250: lload #6
    //   252: lconst_0
    //   253: lcmp
    //   254: ifle -> 272
    //   257: ifnull -> 103
    //   260: iinc #10, 1
    //   263: lload #6
    //   265: lconst_0
    //   266: lcmp
    //   267: ifle -> 114
    //   270: aload #8
    //   272: ifnull -> 89
    //   275: lload #6
    //   277: lconst_0
    //   278: lcmp
    //   279: iflt -> 97
    //   282: aload #9
    //   284: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 70
    //   #22	-> 82
    //   #23	-> 97
    //   #24	-> 114
    //   #25	-> 134
    //   #26	-> 175
    //   #28	-> 219
    //   #24	-> 237
    //   #23	-> 245
    //   #22	-> 260
    //   #34	-> 275
    // Exception table:
    //   from	to	target	type
    //   153	168	171	java/lang/UnsupportedOperationException
    //   165	212	215	java/lang/UnsupportedOperationException
    //   175	229	232	java/lang/UnsupportedOperationException
  }
  
  public static List aegisguard_m(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/World
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_1
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast java/lang/Integer
    //   25: invokevirtual intValue : ()I
    //   28: istore_3
    //   29: dup
    //   30: iconst_3
    //   31: aaload
    //   32: checkcast java/lang/Integer
    //   35: invokevirtual intValue : ()I
    //   38: istore #7
    //   40: dup
    //   41: iconst_4
    //   42: aaload
    //   43: checkcast java/lang/Integer
    //   46: invokevirtual intValue : ()I
    //   49: istore #6
    //   51: dup
    //   52: iconst_5
    //   53: aaload
    //   54: checkcast java/lang/Integer
    //   57: invokevirtual intValue : ()I
    //   60: istore #5
    //   62: pop
    //   63: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   66: lload_1
    //   67: lxor
    //   68: lstore_1
    //   69: new java/util/LinkedList
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: astore #9
    //   78: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   81: iload_3
    //   82: iload #5
    //   84: isub
    //   85: istore #10
    //   87: astore #8
    //   89: iload #10
    //   91: iload_3
    //   92: iload #5
    //   94: iadd
    //   95: if_icmpgt -> 219
    //   98: iload #7
    //   100: iload #5
    //   102: isub
    //   103: istore #11
    //   105: iload #11
    //   107: iload #7
    //   109: iload #5
    //   111: iadd
    //   112: iconst_1
    //   113: iadd
    //   114: if_icmpgt -> 205
    //   117: iload #6
    //   119: iload #5
    //   121: isub
    //   122: aload #8
    //   124: ifnonnull -> 91
    //   127: istore #12
    //   129: iload #12
    //   131: iload #6
    //   133: iload #5
    //   135: iadd
    //   136: if_icmpgt -> 197
    //   139: aload #9
    //   141: aload #4
    //   143: iload #10
    //   145: iload #11
    //   147: iload #12
    //   149: invokeinterface getBlockAt : (III)Lorg/bukkit/block/Block;
    //   154: invokeinterface getType : ()Lorg/bukkit/Material;
    //   159: invokeinterface add : (Ljava/lang/Object;)Z
    //   164: pop
    //   165: iinc #12, 1
    //   168: aload #8
    //   170: lload_1
    //   171: lconst_0
    //   172: lcmp
    //   173: ifle -> 202
    //   176: ifnonnull -> 200
    //   179: aload #8
    //   181: ifnull -> 129
    //   184: lload_1
    //   185: lconst_0
    //   186: lcmp
    //   187: iflt -> 168
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   196: athrow
    //   197: iinc #11, 1
    //   200: aload #8
    //   202: ifnull -> 105
    //   205: iinc #10, 1
    //   208: lload_1
    //   209: lconst_0
    //   210: lcmp
    //   211: iflt -> 225
    //   214: aload #8
    //   216: ifnull -> 89
    //   219: lload_1
    //   220: lconst_0
    //   221: lcmp
    //   222: ifle -> 98
    //   225: aload #9
    //   227: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #38	-> 69
    //   #40	-> 81
    //   #41	-> 98
    //   #42	-> 117
    //   #43	-> 139
    //   #42	-> 165
    //   #41	-> 197
    //   #40	-> 205
    //   #48	-> 219
    // Exception table:
    //   from	to	target	type
    //   139	184	193	java/lang/UnsupportedOperationException
  }
  
  public static List aegisguard_T(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    World world = (World)paramArrayOfObject[1];
    int j = ((Integer)paramArrayOfObject[2]).intValue(), i = ((Integer)paramArrayOfObject[3]).intValue(), k = ((Integer)paramArrayOfObject[4]).intValue();
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    linkedList.add(world.getBlockAt(j + 1, i - 2, k).getType());
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      linkedList.add(world.getBlockAt(j - 1, i - 2, k).getType());
      linkedList.add(world.getBlockAt(j, i - 2, k + 1).getType());
      linkedList.add(world.getBlockAt(j, i - 2, k - 1).getType());
      linkedList.add(world.getBlockAt(j + 1, i - 2, k + 1).getType());
      linkedList.add(world.getBlockAt(j - 1, i - 2, k + 1).getType());
      linkedList.add(world.getBlockAt(j - 1, i - 2, k - 1).getType());
      linkedList.add(world.getBlockAt(j, i - 2, k).getType());
      linkedList.add(world.getBlockAt(j + 1, i - 2, k - 1).getType());
      if (arrayOfAbstractCheck != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[4]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return linkedList;
  }
  
  public static Block aegisguard_o(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    Location location = (Location)paramArrayOfObject[1];
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (location.getWorld().isChunkLoaded(location.getBlockX() >> 4, location.getBlockZ() >> 4));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
      } else {
        return location.getWorld().getBlockAt(location.getBlockX() >> 4, location.getBlockZ() >> 4, location.getBlockZ());
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return null;
  }
  
  public static Block aegisguard_l(Object[] paramArrayOfObject) {
    World world = (World)paramArrayOfObject[0];
    int k = ((Integer)paramArrayOfObject[1]).intValue();
    long l = ((Long)paramArrayOfObject[2]).longValue();
    int j = ((Integer)paramArrayOfObject[3]).intValue(), i = ((Integer)paramArrayOfObject[4]).intValue();
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (world.isChunkLoaded(k >> 4, i >> 4));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
      } else {
        return world.getBlockAt(k >> 4, i >> 4, i);
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return null;
  }
  
  public static Material aegisguard_a(Object[] paramArrayOfObject) {
    World world = (World)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    int i = ((Integer)paramArrayOfObject[2]).intValue(), k = ((Integer)paramArrayOfObject[3]).intValue(), j = ((Integer)paramArrayOfObject[4]).intValue();
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (world.isChunkLoaded(i >> 4, j >> 4));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
      } else {
        return world.getBlockAt(i >> 4, j >> 4, j).getType();
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return Material.SPONGE;
  }
  
  public static boolean aegisguard_Kq(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[126]);
  }
  
  public static boolean aegisguard_Kx(Material paramMaterial) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   3: ldc2_w 69396642393725
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: aload_0
    //   12: invokevirtual toString : ()Ljava/lang/String;
    //   15: astore #4
    //   17: iconst_m1
    //   18: istore #5
    //   20: astore_3
    //   21: aload #4
    //   23: invokevirtual hashCode : ()I
    //   26: aload_3
    //   27: ifnonnull -> 184
    //   30: lookupswitch default -> 182, -1188197377 -> 146, 64810 -> 68, 891097464 -> 107
    //   64: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   67: athrow
    //   68: aload #4
    //   70: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   73: bipush #55
    //   75: aaload
    //   76: invokevirtual equals : (Ljava/lang/Object;)Z
    //   79: aload_3
    //   80: ifnonnull -> 184
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   89: athrow
    //   90: ifeq -> 182
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   99: athrow
    //   100: iconst_0
    //   101: istore #5
    //   103: aload_3
    //   104: ifnull -> 182
    //   107: aload #4
    //   109: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   112: bipush #104
    //   114: aaload
    //   115: invokevirtual equals : (Ljava/lang/Object;)Z
    //   118: aload_3
    //   119: ifnonnull -> 184
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   128: athrow
    //   129: ifeq -> 182
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   138: athrow
    //   139: iconst_1
    //   140: istore #5
    //   142: aload_3
    //   143: ifnull -> 182
    //   146: aload #4
    //   148: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   151: sipush #130
    //   154: aaload
    //   155: invokevirtual equals : (Ljava/lang/Object;)Z
    //   158: aload_3
    //   159: ifnonnull -> 184
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   168: athrow
    //   169: ifeq -> 182
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   178: athrow
    //   179: iconst_2
    //   180: istore #5
    //   182: iload #5
    //   184: aload_3
    //   185: ifnonnull -> 227
    //   188: tableswitch default -> 226, 0 -> 220, 1 -> 220, 2 -> 220
    //   216: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   219: athrow
    //   220: iconst_1
    //   221: ireturn
    //   222: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   225: athrow
    //   226: iconst_0
    //   227: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #96	-> 11
    //   #100	-> 220
    //   #102	-> 226
    // Exception table:
    //   from	to	target	type
    //   21	64	64	java/lang/UnsupportedOperationException
    //   30	83	86	java/lang/UnsupportedOperationException
    //   68	93	96	java/lang/UnsupportedOperationException
    //   103	122	125	java/lang/UnsupportedOperationException
    //   107	132	135	java/lang/UnsupportedOperationException
    //   142	162	165	java/lang/UnsupportedOperationException
    //   146	172	175	java/lang/UnsupportedOperationException
    //   184	216	216	java/lang/UnsupportedOperationException
    //   188	222	222	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_KA(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[117]);
  }
  
  public static boolean aegisguard_KS(Material paramMaterial) {
    return paramMaterial.isSolid();
  }
  
  public static boolean aegisguard_H(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[138]);
  }
  
  public static boolean aegisguard_K5(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/Material
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #22
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 94
    //   48: ifne -> 93
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #68
    //   67: aaload
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: aload #4
    //   73: ifnonnull -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #118	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_Ky(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[1]);
  }
  
  public static boolean aegisguard_Kb(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[8]);
  }
  
  public static boolean aegisguard_f(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[102]);
  }
  
  public static boolean aegisguard_KH(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[95]);
  }
  
  public static boolean aegisguard_e(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[140]);
  }
  
  public static boolean aegisguard_Ko(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[14]);
  }
  
  public static boolean aegisguard__(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[57]);
  }
  
  public static boolean aegisguard_K3(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[6]);
  }
  
  public static boolean aegisguard_p(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[129]);
  }
  
  public static boolean aegisguard_Kj(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[2]);
  }
  
  public static boolean aegisguard_b(Material paramMaterial) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   3: ldc2_w 133969342078577
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: astore_3
    //   12: aload_0
    //   13: invokevirtual toString : ()Ljava/lang/String;
    //   16: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   19: sipush #145
    //   22: aaload
    //   23: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   26: aload_3
    //   27: ifnonnull -> 61
    //   30: ifeq -> 79
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   39: athrow
    //   40: aload_0
    //   41: invokevirtual toString : ()Ljava/lang/String;
    //   44: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   47: sipush #128
    //   50: aaload
    //   51: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   60: athrow
    //   61: aload_3
    //   62: ifnonnull -> 76
    //   65: ifne -> 79
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   74: athrow
    //   75: iconst_1
    //   76: goto -> 80
    //   79: iconst_0
    //   80: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #162	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	33	36	java/lang/UnsupportedOperationException
    //   30	54	57	java/lang/UnsupportedOperationException
    //   61	68	71	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_K(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #103
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifeq -> 97
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #103
    //   67: aaload
    //   68: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: aload #4
    //   80: ifnonnull -> 94
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #166	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_T(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[129]);
  }
  
  public static boolean aegisguard_l(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[88]);
  }
  
  public static boolean aegisguard_KM(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #94
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifeq -> 97
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #106
    //   67: aaload
    //   68: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: aload #4
    //   80: ifnonnull -> 94
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #178	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_Ka(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[30]);
  }
  
  public static boolean aegisguard_K9(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[0]);
  }
  
  public static boolean aegisguard_KR(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[44]);
  }
  
  public static boolean aegisguard_r(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[93]);
  }
  
  public static boolean aegisguard_KB(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[90]);
  }
  
  public static boolean aegisguard_K1(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[108]);
  }
  
  public static boolean aegisguard_D(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equalsIgnoreCase(b[124]);
  }
  
  public static boolean aegisguard_Kr(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[122]);
  }
  
  public static boolean aegisguard_y(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[11]);
  }
  
  public static boolean aegisguard_S(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[65]);
  }
  
  public static boolean aegisguard_Ke(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equalsIgnoreCase(b[107]);
  }
  
  public static boolean aegisguard_KK(Material paramMaterial) {
    return paramMaterial.toString().contains(b[119]);
  }
  
  public static boolean aegisguard_KO(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[61]);
  }
  
  public static boolean aegisguard_KQ(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[48]);
  }
  
  public static boolean aegisguard_J6(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[91]);
  }
  
  public static boolean aegisguard_M(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[52]);
  }
  
  public static boolean aegisguard_JP(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/block/Block
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokeinterface getType : ()Lorg/bukkit/Material;
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   42: bipush #112
    //   44: aaload
    //   45: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   48: aload #4
    //   50: ifnonnull -> 144
    //   53: ifne -> 143
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   62: athrow
    //   63: aload_3
    //   64: invokeinterface getType : ()Lorg/bukkit/Material;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   75: bipush #96
    //   77: aaload
    //   78: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   81: aload #4
    //   83: ifnonnull -> 144
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: ifne -> 143
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   102: athrow
    //   103: aload_3
    //   104: invokeinterface getType : ()Lorg/bukkit/Material;
    //   109: invokevirtual toString : ()Ljava/lang/String;
    //   112: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   115: bipush #34
    //   117: aaload
    //   118: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   121: aload #4
    //   123: ifnonnull -> 144
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   132: athrow
    //   133: ifeq -> 147
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   142: athrow
    //   143: iconst_1
    //   144: goto -> 148
    //   147: iconst_0
    //   148: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #246	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	56	59	java/lang/UnsupportedOperationException
    //   53	86	89	java/lang/UnsupportedOperationException
    //   63	96	99	java/lang/UnsupportedOperationException
    //   93	126	129	java/lang/UnsupportedOperationException
    //   103	136	139	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_O(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/Material
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #7
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 130
    //   48: ifne -> 129
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #36
    //   67: aaload
    //   68: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   71: aload #4
    //   73: ifnonnull -> 130
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifne -> 129
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: aload_3
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   100: sipush #136
    //   103: aaload
    //   104: invokevirtual equals : (Ljava/lang/Object;)Z
    //   107: aload #4
    //   109: ifnonnull -> 130
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   118: athrow
    //   119: ifeq -> 133
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   128: athrow
    //   129: iconst_1
    //   130: goto -> 134
    //   133: iconst_0
    //   134: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #250	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
    //   83	112	115	java/lang/UnsupportedOperationException
    //   93	122	125	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_C(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[35]);
  }
  
  public static boolean aegisguard_g(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/block/Block
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokeinterface getType : ()Lorg/bukkit/Material;
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   42: bipush #57
    //   44: aaload
    //   45: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   48: aload #4
    //   50: ifnonnull -> 144
    //   53: ifne -> 143
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   62: athrow
    //   63: aload_1
    //   64: invokeinterface getType : ()Lorg/bukkit/Material;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   75: bipush #73
    //   77: aaload
    //   78: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   81: aload #4
    //   83: ifnonnull -> 144
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: ifne -> 143
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   102: athrow
    //   103: aload_1
    //   104: invokeinterface getType : ()Lorg/bukkit/Material;
    //   109: invokevirtual toString : ()Ljava/lang/String;
    //   112: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   115: bipush #23
    //   117: aaload
    //   118: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   121: aload #4
    //   123: ifnonnull -> 144
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   132: athrow
    //   133: ifeq -> 147
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   142: athrow
    //   143: iconst_1
    //   144: goto -> 148
    //   147: iconst_0
    //   148: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #258	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	56	59	java/lang/UnsupportedOperationException
    //   53	86	89	java/lang/UnsupportedOperationException
    //   63	96	99	java/lang/UnsupportedOperationException
    //   93	126	129	java/lang/UnsupportedOperationException
    //   103	136	139	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_K0(Material paramMaterial) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   3: ldc2_w 134826390347525
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: astore_3
    //   12: aload_0
    //   13: invokevirtual toString : ()Ljava/lang/String;
    //   16: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   19: bipush #25
    //   21: aaload
    //   22: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   25: aload_3
    //   26: ifnonnull -> 107
    //   29: ifne -> 106
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   38: athrow
    //   39: aload_0
    //   40: invokevirtual toString : ()Ljava/lang/String;
    //   43: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   46: iconst_5
    //   47: aaload
    //   48: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   51: aload_3
    //   52: ifnonnull -> 107
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   61: athrow
    //   62: ifne -> 106
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   71: athrow
    //   72: aload_0
    //   73: invokevirtual toString : ()Ljava/lang/String;
    //   76: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   79: bipush #97
    //   81: aaload
    //   82: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   85: aload_3
    //   86: ifnonnull -> 107
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   95: athrow
    //   96: ifeq -> 110
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   105: athrow
    //   106: iconst_1
    //   107: goto -> 111
    //   110: iconst_0
    //   111: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #262	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	32	35	java/lang/UnsupportedOperationException
    //   29	55	58	java/lang/UnsupportedOperationException
    //   39	65	68	java/lang/UnsupportedOperationException
    //   62	89	92	java/lang/UnsupportedOperationException
    //   72	99	102	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_B(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[137]);
  }
  
  public static boolean aegisguard_P(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[40]);
  }
  
  public static boolean aegisguard_Y(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/block/Block
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokeinterface getType : ()Lorg/bukkit/Material;
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   42: sipush #147
    //   45: aaload
    //   46: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   49: aload #4
    //   51: ifnonnull -> 89
    //   54: ifeq -> 108
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   63: athrow
    //   64: aload_3
    //   65: invokeinterface getType : ()Lorg/bukkit/Material;
    //   70: invokevirtual toString : ()Ljava/lang/String;
    //   73: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   76: bipush #127
    //   78: aaload
    //   79: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   88: athrow
    //   89: aload #4
    //   91: ifnonnull -> 105
    //   94: ifeq -> 108
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   103: athrow
    //   104: iconst_1
    //   105: goto -> 109
    //   108: iconst_0
    //   109: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #274	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	57	60	java/lang/UnsupportedOperationException
    //   54	82	85	java/lang/UnsupportedOperationException
    //   89	97	100	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_KI(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[17]);
  }
  
  public static boolean aegisguard_b(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[19]);
  }
  
  public static boolean aegisguard_Kv(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[82]);
  }
  
  public static boolean aegisguard_JY(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[80]);
  }
  
  public static boolean aegisguard_KJ(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #45
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 94
    //   48: ifne -> 93
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #111
    //   67: aaload
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: aload #4
    //   73: ifnonnull -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #294	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_w(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[99]);
  }
  
  public static boolean aegisguard_z(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #13
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 129
    //   48: ifne -> 128
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #115
    //   67: aaload
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: aload #4
    //   73: ifnonnull -> 129
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifne -> 128
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: aload_1
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   100: bipush #26
    //   102: aaload
    //   103: invokevirtual equals : (Ljava/lang/Object;)Z
    //   106: aload #4
    //   108: ifnonnull -> 129
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   117: athrow
    //   118: ifeq -> 132
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   127: athrow
    //   128: iconst_1
    //   129: goto -> 133
    //   132: iconst_0
    //   133: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #302	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
    //   83	111	114	java/lang/UnsupportedOperationException
    //   93	121	124	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_Jj(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[144]);
  }
  
  public static boolean aegisguard_a(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[28]);
  }
  
  public static boolean aegisguard_K_(Material paramMaterial) {
    return paramMaterial.toString().equals(b[120]);
  }
  
  public static boolean aegisguard_i(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[133]);
  }
  
  public static boolean aegisguard_Jr(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[62]);
  }
  
  public static boolean aegisguard_x(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[142]);
  }
  
  public static boolean aegisguard_Km(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #98
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifeq -> 97
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #92
    //   67: aaload
    //   68: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: aload #4
    //   80: ifnonnull -> 94
    //   83: ifne -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #330	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_n(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[3]);
  }
  
  public static boolean aegisguard_KD(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[20]);
  }
  
  public static boolean aegisguard_Ki(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[101]);
  }
  
  public static boolean aegisguard_k(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[143]);
  }
  
  public static boolean aegisguard_Kd(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #31
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 94
    //   48: ifne -> 93
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #74
    //   67: aaload
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: aload #4
    //   73: ifnonnull -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #350	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_Kg(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #51
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifeq -> 97
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #89
    //   67: aaload
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: aload #4
    //   80: ifnonnull -> 94
    //   83: ifne -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #354	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_JZ(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[10]);
  }
  
  public static boolean aegisguard_KL(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/Material
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #9
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 95
    //   48: ifne -> 94
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: sipush #134
    //   68: aaload
    //   69: invokevirtual equals : (Ljava/lang/Object;)Z
    //   72: aload #4
    //   74: ifnonnull -> 95
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   83: athrow
    //   84: ifeq -> 98
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   93: athrow
    //   94: iconst_1
    //   95: goto -> 99
    //   98: iconst_0
    //   99: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #362	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	77	80	java/lang/UnsupportedOperationException
    //   58	87	90	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_J(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[141]);
  }
  
  public static boolean aegisguard_V(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[75]);
  }
  
  public static boolean aegisguard_JL(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[15]);
  }
  
  public static boolean aegisguard_d(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[27]);
  }
  
  public static boolean aegisguard_W(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[110]);
  }
  
  public static boolean aegisguard_Kh(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[39]);
  }
  
  public static boolean aegisguard_q(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/block/Block
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokeinterface getType : ()Lorg/bukkit/Material;
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   42: bipush #32
    //   44: aaload
    //   45: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   48: aload #4
    //   50: ifnonnull -> 104
    //   53: ifne -> 103
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   62: athrow
    //   63: aload_1
    //   64: invokeinterface getType : ()Lorg/bukkit/Material;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   75: bipush #60
    //   77: aaload
    //   78: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   81: aload #4
    //   83: ifnonnull -> 104
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: ifeq -> 107
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   102: athrow
    //   103: iconst_1
    //   104: goto -> 108
    //   107: iconst_0
    //   108: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #390	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	56	59	java/lang/UnsupportedOperationException
    //   53	86	89	java/lang/UnsupportedOperationException
    //   63	96	99	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_KP(Material paramMaterial) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   3: ldc2_w 8072640855962
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: astore_3
    //   12: aload_0
    //   13: invokevirtual toString : ()Ljava/lang/String;
    //   16: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   19: bipush #100
    //   21: aaload
    //   22: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   25: aload_3
    //   26: ifnonnull -> 74
    //   29: ifne -> 73
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   38: athrow
    //   39: aload_0
    //   40: invokevirtual toString : ()Ljava/lang/String;
    //   43: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   46: bipush #78
    //   48: aaload
    //   49: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   52: aload_3
    //   53: ifnonnull -> 74
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   62: athrow
    //   63: ifeq -> 77
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   72: athrow
    //   73: iconst_1
    //   74: goto -> 78
    //   77: iconst_0
    //   78: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #394	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	32	35	java/lang/UnsupportedOperationException
    //   29	56	59	java/lang/UnsupportedOperationException
    //   39	66	69	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_Ks(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/Material
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #116
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifeq -> 97
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #46
    //   67: aaload
    //   68: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: aload #4
    //   80: ifnonnull -> 94
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #398	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_JU(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/block/Block
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokeinterface getType : ()Lorg/bukkit/Material;
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   42: bipush #53
    //   44: aaload
    //   45: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   48: aload #4
    //   50: ifnonnull -> 104
    //   53: ifne -> 103
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   62: athrow
    //   63: aload_1
    //   64: invokeinterface getType : ()Lorg/bukkit/Material;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   75: bipush #49
    //   77: aaload
    //   78: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   81: aload #4
    //   83: ifnonnull -> 104
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: ifeq -> 107
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   102: athrow
    //   103: iconst_1
    //   104: goto -> 108
    //   107: iconst_0
    //   108: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #402	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	56	59	java/lang/UnsupportedOperationException
    //   53	86	89	java/lang/UnsupportedOperationException
    //   63	96	99	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_t(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/Material
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #85
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 94
    //   48: ifne -> 93
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #81
    //   67: aaload
    //   68: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   71: aload #4
    //   73: ifnonnull -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #406	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_A(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[58]);
  }
  
  public static boolean aegisguard_I(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[105]);
  }
  
  public static boolean aegisguard_R(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[23]);
  }
  
  public static boolean aegisguard_j(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[33]);
  }
  
  public static boolean aegisguard_Jw(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().equals(b[34]);
  }
  
  public static boolean aegisguard_F(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[34]);
  }
  
  public static boolean aegisguard_JR(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[21]);
  }
  
  public static boolean aegisguard_KF(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #69
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 94
    //   48: ifne -> 93
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #24
    //   67: aaload
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: aload #4
    //   73: ifnonnull -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #438	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_Jb(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[125]);
  }
  
  public static boolean aegisguard_KY(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[37]);
  }
  
  public static boolean aegisguard_m(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[113]);
  }
  
  public static boolean aegisguard_u(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[16]);
  }
  
  public static boolean aegisguard_X(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[148]);
  }
  
  public static boolean aegisguard_Z(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #118
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 164
    //   48: ifne -> 163
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #71
    //   67: aaload
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: aload #4
    //   73: ifnonnull -> 164
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifne -> 163
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: aload_1
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   100: bipush #109
    //   102: aaload
    //   103: invokevirtual equals : (Ljava/lang/Object;)Z
    //   106: aload #4
    //   108: ifnonnull -> 164
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   117: athrow
    //   118: ifne -> 163
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   127: athrow
    //   128: aload_1
    //   129: invokevirtual toString : ()Ljava/lang/String;
    //   132: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   135: bipush #63
    //   137: aaload
    //   138: invokevirtual equals : (Ljava/lang/Object;)Z
    //   141: aload #4
    //   143: ifnonnull -> 164
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   152: athrow
    //   153: ifeq -> 167
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   162: athrow
    //   163: iconst_1
    //   164: goto -> 168
    //   167: iconst_0
    //   168: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #463	-> 30
    //   #464	-> 94
    //   #463	-> 168
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
    //   83	111	114	java/lang/UnsupportedOperationException
    //   93	121	124	java/lang/UnsupportedOperationException
    //   118	146	149	java/lang/UnsupportedOperationException
    //   128	156	159	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_E(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/block/Block
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokeinterface getType : ()Lorg/bukkit/Material;
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   42: bipush #41
    //   44: aaload
    //   45: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   48: aload #4
    //   50: ifnonnull -> 104
    //   53: ifne -> 103
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   62: athrow
    //   63: aload_1
    //   64: invokeinterface getType : ()Lorg/bukkit/Material;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   75: bipush #79
    //   77: aaload
    //   78: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   81: aload #4
    //   83: ifnonnull -> 104
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: ifeq -> 107
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   102: athrow
    //   103: iconst_1
    //   104: goto -> 108
    //   107: iconst_0
    //   108: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #468	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	56	59	java/lang/UnsupportedOperationException
    //   53	86	89	java/lang/UnsupportedOperationException
    //   63	96	99	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_c(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[114]);
  }
  
  public static boolean aegisguard_Kp(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equals(b[131]);
  }
  
  public static boolean aegisguard_JJ(Object[] paramArrayOfObject) {
    Block block = (Block)paramArrayOfObject[0];
    return block.getType().toString().contains(b[139]);
  }
  
  public static boolean aegisguard_s(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().equalsIgnoreCase(b[84]);
  }
  
  public static boolean aegisguard_N(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/Material
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #59
    //   39: aaload
    //   40: invokevirtual equals : (Ljava/lang/Object;)Z
    //   43: aload #4
    //   45: ifnonnull -> 94
    //   48: ifne -> 93
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #47
    //   67: aaload
    //   68: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   71: aload #4
    //   73: ifnonnull -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #488	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_Kc(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/Material
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #54
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 94
    //   48: ifne -> 93
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #29
    //   67: aaload
    //   68: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   71: aload #4
    //   73: ifnonnull -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #492	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	76	79	java/lang/UnsupportedOperationException
    //   58	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_L(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[150]);
  }
  
  public static boolean aegisguard_K7(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[56]);
  }
  
  public static boolean aegisguard_K6(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/Material
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #76
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifeq -> 97
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #123
    //   67: aaload
    //   68: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: aload #4
    //   80: ifnonnull -> 94
    //   83: ifne -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #518	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_o(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[87]);
  }
  
  public static boolean aegisguard_Q(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[70]);
  }
  
  public static boolean aegisguard_Kk(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/Material
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: sipush #149
    //   40: aaload
    //   41: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   44: aload #4
    //   46: ifnonnull -> 79
    //   49: ifeq -> 98
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   58: athrow
    //   59: aload_1
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   66: bipush #121
    //   68: aaload
    //   69: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   78: athrow
    //   79: aload #4
    //   81: ifnonnull -> 95
    //   84: ifeq -> 98
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   93: athrow
    //   94: iconst_1
    //   95: goto -> 99
    //   98: iconst_0
    //   99: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #530	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	52	55	java/lang/UnsupportedOperationException
    //   49	72	75	java/lang/UnsupportedOperationException
    //   79	87	90	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_v(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[83]);
  }
  
  public static boolean aegisguard_G(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[86]);
  }
  
  public static boolean aegisguard_U(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[38]);
  }
  
  public static boolean aegisguard_KC(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/Material
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_P.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: invokevirtual toString : ()Ljava/lang/String;
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   37: bipush #43
    //   39: aaload
    //   40: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifeq -> 97
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: getstatic me/frep/aegisguard/spigot/aegisguard_P.b : [Ljava/lang/String;
    //   65: bipush #64
    //   67: aaload
    //   68: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: aload #4
    //   80: ifnonnull -> 94
    //   83: ifeq -> 97
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #546	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	86	89	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_h(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
    return material.toString().contains(b[132]);
  }
  
  public static void aegisguard_f(String[] paramArrayOfString) {
    aegisguard_g = paramArrayOfString;
  }
  
  public static String[] aegisguard_O() {
    return aegisguard_g;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
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
