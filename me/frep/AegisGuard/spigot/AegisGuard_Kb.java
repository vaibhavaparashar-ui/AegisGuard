package me.frep.aegisguard.spigot.AegisGuard_Kb;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.Effect;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.util.Vector;

public class aegisguard_Kb {
  Vector aegisguard_T;
  
  Vector aegisguard_j;
  
  private static String[] aegisguard_B;
  
  private static final long a = aegisguard_e.a(-7071511568321467996L, -7419244018327617501L, MethodHandles.lookup().lookupClass()).a(107367206617734L);
  
  public aegisguard_Kb(Vector paramVector1, Vector paramVector2) {
    this.aegisguard_T = paramVector1;
    this.aegisguard_j = paramVector2;
  }
  
  public static boolean aegisguard_q(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/util/Vector
    //   17: astore #4
    //   19: dup
    //   20: iconst_2
    //   21: aaload
    //   22: checkcast org/bukkit/util/Vector
    //   25: astore_1
    //   26: dup
    //   27: iconst_3
    //   28: aaload
    //   29: checkcast org/bukkit/util/Vector
    //   32: astore #5
    //   34: pop
    //   35: getstatic me/frep/aegisguard/spigot/aegisguard_Kb.a : J
    //   38: lload_2
    //   39: lxor
    //   40: lstore_2
    //   41: invokestatic aegisguard_v : ()[Ljava/lang/String;
    //   44: astore #6
    //   46: aload #4
    //   48: invokevirtual getX : ()D
    //   51: aload_1
    //   52: invokevirtual getX : ()D
    //   55: dcmpg
    //   56: aload #6
    //   58: ifnull -> 111
    //   61: iflt -> 110
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: aload #4
    //   73: invokevirtual getX : ()D
    //   76: aload #5
    //   78: invokevirtual getX : ()D
    //   81: dcmpl
    //   82: aload #6
    //   84: lload_2
    //   85: lconst_0
    //   86: lcmp
    //   87: ifle -> 124
    //   90: ifnull -> 122
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: ifle -> 112
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: iconst_0
    //   111: ireturn
    //   112: aload #4
    //   114: invokevirtual getY : ()D
    //   117: aload_1
    //   118: invokevirtual getY : ()D
    //   121: dcmpg
    //   122: aload #6
    //   124: ifnull -> 177
    //   127: iflt -> 176
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   136: athrow
    //   137: aload #4
    //   139: invokevirtual getY : ()D
    //   142: aload #5
    //   144: invokevirtual getY : ()D
    //   147: dcmpl
    //   148: aload #6
    //   150: lload_2
    //   151: lconst_0
    //   152: lcmp
    //   153: ifle -> 190
    //   156: ifnull -> 188
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: ifle -> 178
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: iconst_0
    //   177: ireturn
    //   178: aload #4
    //   180: invokevirtual getZ : ()D
    //   183: aload_1
    //   184: invokevirtual getZ : ()D
    //   187: dcmpg
    //   188: aload #6
    //   190: ifnull -> 237
    //   193: iflt -> 236
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   202: athrow
    //   203: aload #4
    //   205: invokevirtual getZ : ()D
    //   208: aload #5
    //   210: invokevirtual getZ : ()D
    //   213: dcmpl
    //   214: aload #6
    //   216: ifnull -> 239
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   225: athrow
    //   226: ifle -> 238
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   235: athrow
    //   236: iconst_0
    //   237: ireturn
    //   238: iconst_1
    //   239: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #24	-> 46
    //   #25	-> 110
    //   #26	-> 112
    //   #27	-> 176
    //   #28	-> 178
    //   #29	-> 236
    //   #31	-> 238
    // Exception table:
    //   from	to	target	type
    //   46	64	67	java/lang/RuntimeException
    //   61	93	96	java/lang/RuntimeException
    //   71	103	106	java/lang/RuntimeException
    //   122	130	133	java/lang/RuntimeException
    //   127	159	162	java/lang/RuntimeException
    //   137	169	172	java/lang/RuntimeException
    //   188	196	199	java/lang/RuntimeException
    //   193	219	222	java/lang/RuntimeException
    //   203	229	232	java/lang/RuntimeException
  }
  
  public Vector aegisguard_W(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
    return this.aegisguard_T.clone().add(this.aegisguard_j.clone().multiply(d));
  }
  
  public boolean aegisguard_C(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/util/Vector
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_Kb.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_v : ()[Ljava/lang/String;
    //   29: aload #4
    //   31: invokevirtual getX : ()D
    //   34: aload_0
    //   35: getfield aegisguard_T : Lorg/bukkit/util/Vector;
    //   38: invokevirtual getX : ()D
    //   41: dsub
    //   42: aload_0
    //   43: getfield aegisguard_j : Lorg/bukkit/util/Vector;
    //   46: invokevirtual getX : ()D
    //   49: ddiv
    //   50: dstore #6
    //   52: astore #5
    //   54: aload #4
    //   56: invokevirtual getBlockY : ()I
    //   59: i2d
    //   60: aload_0
    //   61: getfield aegisguard_T : Lorg/bukkit/util/Vector;
    //   64: invokevirtual getY : ()D
    //   67: dload #6
    //   69: aload_0
    //   70: getfield aegisguard_j : Lorg/bukkit/util/Vector;
    //   73: invokevirtual getY : ()D
    //   76: dmul
    //   77: dadd
    //   78: dcmpl
    //   79: aload #5
    //   81: ifnull -> 154
    //   84: ifne -> 153
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: aload #4
    //   96: invokevirtual getBlockZ : ()I
    //   99: i2d
    //   100: aload_0
    //   101: getfield aegisguard_T : Lorg/bukkit/util/Vector;
    //   104: invokevirtual getZ : ()D
    //   107: dload #6
    //   109: aload_0
    //   110: getfield aegisguard_j : Lorg/bukkit/util/Vector;
    //   113: invokevirtual getZ : ()D
    //   116: dmul
    //   117: dadd
    //   118: dcmpl
    //   119: aload #5
    //   121: lload_2
    //   122: lconst_0
    //   123: lcmp
    //   124: iflt -> 162
    //   127: ifnull -> 154
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   136: athrow
    //   137: ifne -> 153
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   146: athrow
    //   147: iconst_1
    //   148: ireturn
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: iconst_0
    //   154: lload_2
    //   155: lconst_0
    //   156: lcmp
    //   157: iflt -> 172
    //   160: aload #5
    //   162: ifnonnull -> 179
    //   165: iconst_5
    //   166: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   169: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #41	-> 29
    //   #43	-> 54
    //   #44	-> 147
    //   #46	-> 153
    // Exception table:
    //   from	to	target	type
    //   54	87	90	java/lang/RuntimeException
    //   84	130	133	java/lang/RuntimeException
    //   94	140	143	java/lang/RuntimeException
    //   137	149	149	java/lang/RuntimeException
    //   154	172	175	java/lang/RuntimeException
  }
  
  public List aegisguard_N(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Double
    //   7: invokevirtual doubleValue : ()D
    //   10: dstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/Double
    //   17: invokevirtual doubleValue : ()D
    //   20: dstore #4
    //   22: dup
    //   23: iconst_2
    //   24: aaload
    //   25: checkcast java/lang/Long
    //   28: invokevirtual longValue : ()J
    //   31: lstore #6
    //   33: pop
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_Kb.a : J
    //   37: lload #6
    //   39: lxor
    //   40: lstore #6
    //   42: invokestatic aegisguard_v : ()[Ljava/lang/String;
    //   45: new java/util/ArrayList
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #9
    //   54: dconst_0
    //   55: dstore #10
    //   57: astore #8
    //   59: dload #10
    //   61: dload_2
    //   62: dcmpg
    //   63: ifgt -> 110
    //   66: aload #9
    //   68: aload #8
    //   70: ifnull -> 119
    //   73: aload_0
    //   74: dload #10
    //   76: iconst_1
    //   77: anewarray java/lang/Object
    //   80: dup_x2
    //   81: dup_x2
    //   82: pop
    //   83: invokestatic valueOf : (D)Ljava/lang/Double;
    //   86: iconst_0
    //   87: swap
    //   88: aastore
    //   89: invokevirtual aegisguard_W : ([Ljava/lang/Object;)Lorg/bukkit/util/Vector;
    //   92: invokeinterface add : (Ljava/lang/Object;)Z
    //   97: pop
    //   98: dload #10
    //   100: dload #4
    //   102: dadd
    //   103: dstore #10
    //   105: aload #8
    //   107: ifnonnull -> 59
    //   110: lload #6
    //   112: lconst_0
    //   113: lcmp
    //   114: iflt -> 105
    //   117: aload #9
    //   119: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #51	-> 45
    //   #52	-> 54
    //   #53	-> 66
    //   #52	-> 98
    //   #55	-> 110
  }
  
  public List aegisguard_f(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/Double
    //   17: invokevirtual doubleValue : ()D
    //   20: dstore #4
    //   22: dup
    //   23: iconst_2
    //   24: aaload
    //   25: checkcast java/lang/Double
    //   28: invokevirtual doubleValue : ()D
    //   31: dstore #6
    //   33: dup
    //   34: iconst_3
    //   35: aaload
    //   36: checkcast java/lang/Double
    //   39: invokevirtual doubleValue : ()D
    //   42: dstore #8
    //   44: pop
    //   45: getstatic me/frep/aegisguard/spigot/aegisguard_Kb.a : J
    //   48: lload_2
    //   49: lxor
    //   50: lstore_2
    //   51: invokestatic aegisguard_v : ()[Ljava/lang/String;
    //   54: new java/util/ArrayList
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore #11
    //   63: astore #10
    //   65: dload #4
    //   67: dstore #12
    //   69: dload #12
    //   71: dload #6
    //   73: dcmpg
    //   74: ifgt -> 121
    //   77: aload #11
    //   79: aload #10
    //   81: ifnull -> 129
    //   84: aload_0
    //   85: dload #12
    //   87: iconst_1
    //   88: anewarray java/lang/Object
    //   91: dup_x2
    //   92: dup_x2
    //   93: pop
    //   94: invokestatic valueOf : (D)Ljava/lang/Double;
    //   97: iconst_0
    //   98: swap
    //   99: aastore
    //   100: invokevirtual aegisguard_W : ([Ljava/lang/Object;)Lorg/bukkit/util/Vector;
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: dload #12
    //   111: dload #8
    //   113: dadd
    //   114: dstore #12
    //   116: aload #10
    //   118: ifnonnull -> 69
    //   121: lload_2
    //   122: lconst_0
    //   123: lcmp
    //   124: ifle -> 116
    //   127: aload #11
    //   129: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #59	-> 54
    //   #60	-> 65
    //   #61	-> 77
    //   #60	-> 109
    //   #63	-> 121
  }
  
  public List aegisguard_v(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore #6
    //   12: dup
    //   13: iconst_1
    //   14: aaload
    //   15: checkcast org/bukkit/World
    //   18: astore #8
    //   20: dup
    //   21: iconst_2
    //   22: aaload
    //   23: checkcast java/lang/Double
    //   26: invokevirtual doubleValue : ()D
    //   29: dstore_2
    //   30: dup
    //   31: iconst_3
    //   32: aaload
    //   33: checkcast java/lang/Double
    //   36: invokevirtual doubleValue : ()D
    //   39: dstore #4
    //   41: pop
    //   42: getstatic me/frep/aegisguard/spigot/aegisguard_Kb.a : J
    //   45: lload #6
    //   47: lxor
    //   48: lstore #6
    //   50: lload #6
    //   52: dup2
    //   53: ldc2_w 119333396987137
    //   56: lxor
    //   57: lstore #9
    //   59: pop2
    //   60: new java/util/ArrayList
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: astore #12
    //   69: invokestatic aegisguard_v : ()[Ljava/lang/String;
    //   72: aload_0
    //   73: dload_2
    //   74: dload #4
    //   76: lload #9
    //   78: iconst_3
    //   79: anewarray java/lang/Object
    //   82: dup_x2
    //   83: dup_x2
    //   84: pop
    //   85: invokestatic valueOf : (J)Ljava/lang/Long;
    //   88: iconst_2
    //   89: swap
    //   90: aastore
    //   91: dup_x2
    //   92: dup_x2
    //   93: pop
    //   94: invokestatic valueOf : (D)Ljava/lang/Double;
    //   97: iconst_1
    //   98: swap
    //   99: aastore
    //   100: dup_x2
    //   101: dup_x2
    //   102: pop
    //   103: invokestatic valueOf : (D)Ljava/lang/Double;
    //   106: iconst_0
    //   107: swap
    //   108: aastore
    //   109: invokevirtual aegisguard_N : ([Ljava/lang/Object;)Ljava/util/List;
    //   112: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   117: aload #8
    //   119: <illegal opcode> test : (Lorg/bukkit/World;)Ljava/util/function/Predicate;
    //   124: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   129: aload #12
    //   131: aload #8
    //   133: <illegal opcode> accept : (Ljava/util/List;Lorg/bukkit/World;)Ljava/util/function/Consumer;
    //   138: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   143: astore #11
    //   145: aload #12
    //   147: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   150: ifnonnull -> 167
    //   153: iconst_3
    //   154: anewarray java/lang/String
    //   157: invokestatic aegisguard__ : ([Ljava/lang/String;)V
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #67	-> 60
    //   #69	-> 72
    //   #70	-> 145
    // Exception table:
    //   from	to	target	type
    //   145	160	163	java/lang/RuntimeException
  }
  
  private static void lambda$getBlocks$1(List<Block> paramList, World paramWorld, Vector paramVector) {
    paramList.add(paramVector.toLocation(paramWorld).getBlock());
  }
  
  private static boolean lambda$getBlocks$0(World paramWorld, Vector paramVector) {
    return paramVector.toLocation(paramWorld).getBlock().getType().isSolid();
  }
  
  public Vector aegisguard_Z(Object[] paramArrayOfObject) {
    Vector vector2 = (Vector)paramArrayOfObject[0], vector1 = (Vector)paramArrayOfObject[1];
    long l1 = ((Long)paramArrayOfObject[2]).longValue();
    double d1 = ((Double)paramArrayOfObject[3]).doubleValue(), d2 = ((Double)paramArrayOfObject[4]).doubleValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x562874F87FB6L, l3 = l1 ^ 0x592023279352L;
    new Object[3];
    (new Object[3])[2] = Long.valueOf(l2);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(d2);
    new Object[3];
    List list = aegisguard_N(new Object[] { Double.valueOf(d1) });
    String[] arrayOfString;
    Iterator<Vector> iterator;
    for (iterator = list.iterator(), arrayOfString = aegisguard_v(); iterator.hasNext(); ) {
      Vector vector = iterator.next();
      if (arrayOfString != null) {
        Vector vector3 = vector1, vector4 = vector2, vector5 = vector;
        try {
          (new Object[4])[3] = vector3;
          (new Object[4])[2] = vector4;
          (new Object[4])[1] = vector5;
          new Object[4];
          if (aegisguard_q(new Object[] { Long.valueOf(l3) }));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return vector;
      } 
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  public boolean aegisguard_P(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/util/Vector
    //   7: astore #9
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast org/bukkit/util/Vector
    //   15: astore_2
    //   16: dup
    //   17: iconst_2
    //   18: aaload
    //   19: checkcast java/lang/Double
    //   22: invokevirtual doubleValue : ()D
    //   25: dstore_3
    //   26: dup
    //   27: iconst_3
    //   28: aaload
    //   29: checkcast java/lang/Double
    //   32: invokevirtual doubleValue : ()D
    //   35: dstore #5
    //   37: dup
    //   38: iconst_4
    //   39: aaload
    //   40: checkcast java/lang/Long
    //   43: invokevirtual longValue : ()J
    //   46: lstore #7
    //   48: pop
    //   49: getstatic me/frep/aegisguard/spigot/aegisguard_Kb.a : J
    //   52: lload #7
    //   54: lxor
    //   55: lstore #7
    //   57: lload #7
    //   59: dup2
    //   60: ldc2_w 3051523297152
    //   63: lxor
    //   64: lstore #10
    //   66: dup2
    //   67: ldc2_w 15179138573156
    //   70: lxor
    //   71: lstore #12
    //   73: pop2
    //   74: aload_0
    //   75: dload_3
    //   76: dload #5
    //   78: lload #10
    //   80: iconst_3
    //   81: anewarray java/lang/Object
    //   84: dup_x2
    //   85: dup_x2
    //   86: pop
    //   87: invokestatic valueOf : (J)Ljava/lang/Long;
    //   90: iconst_2
    //   91: swap
    //   92: aastore
    //   93: dup_x2
    //   94: dup_x2
    //   95: pop
    //   96: invokestatic valueOf : (D)Ljava/lang/Double;
    //   99: iconst_1
    //   100: swap
    //   101: aastore
    //   102: dup_x2
    //   103: dup_x2
    //   104: pop
    //   105: invokestatic valueOf : (D)Ljava/lang/Double;
    //   108: iconst_0
    //   109: swap
    //   110: aastore
    //   111: invokevirtual aegisguard_N : ([Ljava/lang/Object;)Ljava/util/List;
    //   114: astore #15
    //   116: invokestatic aegisguard_v : ()[Ljava/lang/String;
    //   119: aload #15
    //   121: invokeinterface iterator : ()Ljava/util/Iterator;
    //   126: astore #16
    //   128: astore #14
    //   130: aload #16
    //   132: invokeinterface hasNext : ()Z
    //   137: ifeq -> 231
    //   140: aload #16
    //   142: invokeinterface next : ()Ljava/lang/Object;
    //   147: checkcast org/bukkit/util/Vector
    //   150: astore #17
    //   152: lload #12
    //   154: aload #17
    //   156: aload #9
    //   158: aload_2
    //   159: iconst_4
    //   160: anewarray java/lang/Object
    //   163: dup_x1
    //   164: swap
    //   165: iconst_3
    //   166: swap
    //   167: aastore
    //   168: dup_x1
    //   169: swap
    //   170: iconst_2
    //   171: swap
    //   172: aastore
    //   173: dup_x1
    //   174: swap
    //   175: iconst_1
    //   176: swap
    //   177: aastore
    //   178: dup_x2
    //   179: dup_x2
    //   180: pop
    //   181: invokestatic valueOf : (J)Ljava/lang/Long;
    //   184: iconst_0
    //   185: swap
    //   186: aastore
    //   187: invokestatic aegisguard_q : ([Ljava/lang/Object;)Z
    //   190: aload #14
    //   192: lload #7
    //   194: lconst_0
    //   195: lcmp
    //   196: ifle -> 204
    //   199: ifnull -> 232
    //   202: aload #14
    //   204: ifnull -> 225
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   213: athrow
    //   214: ifeq -> 226
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   223: athrow
    //   224: iconst_1
    //   225: ireturn
    //   226: aload #14
    //   228: ifnonnull -> 130
    //   231: iconst_0
    //   232: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #86	-> 74
    //   #87	-> 119
    //   #88	-> 152
    //   #89	-> 224
    //   #91	-> 226
    //   #92	-> 231
    // Exception table:
    //   from	to	target	type
    //   152	207	210	java/lang/RuntimeException
    //   202	217	220	java/lang/RuntimeException
  }
  
  public void aegisguard_j(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    World world = (World)paramArrayOfObject[1];
    double d1 = ((Double)paramArrayOfObject[2]).doubleValue(), d2 = ((Double)paramArrayOfObject[3]).doubleValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x317175D4D3A7L;
    new Object[3];
    (new Object[3])[2] = Long.valueOf(l2);
    new Object[3];
    (new Object[3])[1] = Double.valueOf(d2);
    new Object[3];
    String[] arrayOfString;
    Iterator<Vector> iterator;
    for (iterator = aegisguard_N(new Object[] { Double.valueOf(d1) }, ).iterator(), arrayOfString = aegisguard_v(); iterator.hasNext(); ) {
      Vector vector = iterator.next();
      world.playEffect(vector.toLocation(world), Effect.ENDEREYE_LAUNCH, 5);
      if (arrayOfString == null)
        break; 
    } 
  }
  
  public static void aegisguard__(String[] paramArrayOfString) {
    aegisguard_B = paramArrayOfString;
  }
  
  public static String[] aegisguard_v() {
    return aegisguard_B;
  }
  
  static {
    if (aegisguard_v() == null)
      aegisguard__(new String[1]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
