package me.frep.aegisguard.spigot.AegisGuard_KQ;

import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityRelativeMove;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityRelativeMoveAndRotation;
import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_KI;
import me.frep.aegisguard.spigot.aegisguard_Ke;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hg;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class aegisguard_KQ {
  private final aegisguard_hu aegisguard_m;
  
  public aegisguard_hu aegisguard_R(Object[] paramArrayOfObject) {
    return this.aegisguard_m;
  }
  
  private int aegisguard_g = 100;
  
  private int aegisguard_O;
  
  private int aegisguard_z;
  
  private int aegisguard_s;
  
  private Entity aegisguard_B;
  
  private Player aegisguard_b;
  
  private Player aegisguard_S;
  
  private double aegisguard_U;
  
  private double aegisguard_C;
  
  public int aegisguard_x(Object[] paramArrayOfObject) {
    return this.aegisguard_g;
  }
  
  public int aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_O;
  }
  
  public int aegisguard_v(Object[] paramArrayOfObject) {
    return this.aegisguard_z;
  }
  
  public int aegisguard_u(Object[] paramArrayOfObject) {
    return this.aegisguard_s;
  }
  
  public Entity aegisguard_S(Object[] paramArrayOfObject) {
    return this.aegisguard_B;
  }
  
  public Player aegisguard_r(Object[] paramArrayOfObject) {
    return this.aegisguard_b;
  }
  
  public Player aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_S;
  }
  
  public double aegisguard_J(Object[] paramArrayOfObject) {
    return this.aegisguard_U;
  }
  
  public double aegisguard_U(Object[] paramArrayOfObject) {
    return this.aegisguard_C;
  }
  
  private final aegisguard_hg aegisguard_X = new aegisguard_hg(20);
  
  private static int[] aegisguard_N;
  
  private static final long a = aegisguard_e.a(2053274286391445814L, 4292273059612068114L, MethodHandles.lookup().lookupClass()).a(139684200131324L);
  
  public aegisguard_hg aegisguard_b(Object[] paramArrayOfObject) {
    return this.aegisguard_X;
  }
  
  public aegisguard_KQ(aegisguard_hu paramaegisguard_hu) {
    this.aegisguard_m = paramaegisguard_hu;
  }
  
  public void aegisguard_m(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientInteractEntity
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_KQ.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: aload_0
    //   29: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   32: iconst_0
    //   33: anewarray java/lang/Object
    //   36: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   39: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   44: aload_2
    //   45: invokevirtual getEntityId : ()I
    //   48: invokestatic getEntityById : (Lorg/bukkit/World;I)Lorg/bukkit/entity/Entity;
    //   51: astore #6
    //   53: astore #5
    //   55: aload #6
    //   57: instanceof org/bukkit/entity/ItemFrame
    //   60: ifeq -> 87
    //   63: aload_0
    //   64: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   67: invokevirtual aegisguard_W : ()Lme/frep/aegisguard/spigot/aegisguard_K8;
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual aegisguard_I : ([Ljava/lang/Object;)I
    //   77: putfield aegisguard_s : I
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: lload_3
    //   88: lconst_0
    //   89: lcmp
    //   90: iflt -> 114
    //   93: aload_2
    //   94: invokevirtual getAction : ()Lcom/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientInteractEntity$InteractAction;
    //   97: getstatic com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientInteractEntity$InteractAction.ATTACK : Lcom/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientInteractEntity$InteractAction;
    //   100: if_acmpeq -> 108
    //   103: return
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: aload_0
    //   109: aload #6
    //   111: putfield aegisguard_B : Lorg/bukkit/entity/Entity;
    //   114: aload_0
    //   115: getfield aegisguard_B : Lorg/bukkit/entity/Entity;
    //   118: lload_3
    //   119: lconst_0
    //   120: lcmp
    //   121: iflt -> 231
    //   124: aload #5
    //   126: ifnull -> 231
    //   129: ifnull -> 196
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: aload_0
    //   140: aload_0
    //   141: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   144: iconst_0
    //   145: anewarray java/lang/Object
    //   148: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   151: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   156: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   159: iconst_0
    //   160: invokevirtual setY : (I)Lorg/bukkit/util/Vector;
    //   163: aload_0
    //   164: getfield aegisguard_B : Lorg/bukkit/entity/Entity;
    //   167: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   172: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   175: iconst_0
    //   176: invokevirtual setY : (I)Lorg/bukkit/util/Vector;
    //   179: invokevirtual distance : (Lorg/bukkit/util/Vector;)D
    //   182: ldc2_w 0.42
    //   185: dsub
    //   186: putfield aegisguard_U : D
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: aload_0
    //   197: aload #5
    //   199: ifnull -> 336
    //   202: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   205: iconst_0
    //   206: anewarray java/lang/Object
    //   209: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   212: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   217: aload_2
    //   218: invokevirtual getEntityId : ()I
    //   221: invokestatic getEntityById : (Lorg/bukkit/World;I)Lorg/bukkit/entity/Entity;
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   230: athrow
    //   231: instanceof org/bukkit/entity/Player
    //   234: ifeq -> 335
    //   237: aload_0
    //   238: aload_0
    //   239: aload #5
    //   241: ifnull -> 277
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: getfield aegisguard_b : Lorg/bukkit/entity/Player;
    //   254: ifnonnull -> 276
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   263: athrow
    //   264: aload #6
    //   266: checkcast org/bukkit/entity/Player
    //   269: goto -> 280
    //   272: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   275: athrow
    //   276: aload_0
    //   277: getfield aegisguard_b : Lorg/bukkit/entity/Player;
    //   280: putfield aegisguard_S : Lorg/bukkit/entity/Player;
    //   283: aload_0
    //   284: aload #6
    //   286: checkcast org/bukkit/entity/Player
    //   289: putfield aegisguard_b : Lorg/bukkit/entity/Player;
    //   292: lload_3
    //   293: lconst_0
    //   294: lcmp
    //   295: iflt -> 340
    //   298: aload_0
    //   299: aload #5
    //   301: ifnull -> 336
    //   304: getfield aegisguard_b : Lorg/bukkit/entity/Player;
    //   307: aload_0
    //   308: getfield aegisguard_S : Lorg/bukkit/entity/Player;
    //   311: if_acmpeq -> 335
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   320: athrow
    //   321: aload_0
    //   322: getfield aegisguard_X : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   325: invokevirtual clear : ()V
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   334: athrow
    //   335: aload_0
    //   336: iconst_0
    //   337: putfield aegisguard_g : I
    //   340: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #40	-> 28
    //   #42	-> 55
    //   #43	-> 63
    //   #46	-> 87
    //   #47	-> 103
    //   #50	-> 108
    //   #52	-> 114
    //   #53	-> 139
    //   #56	-> 196
    //   #57	-> 237
    //   #58	-> 283
    //   #60	-> 292
    //   #61	-> 321
    //   #65	-> 335
    //   #66	-> 340
    // Exception table:
    //   from	to	target	type
    //   55	80	83	java/lang/RuntimeException
    //   87	104	104	java/lang/RuntimeException
    //   108	132	135	java/lang/RuntimeException
    //   129	189	192	java/lang/RuntimeException
    //   196	224	227	java/lang/RuntimeException
    //   231	244	247	java/lang/RuntimeException
    //   237	257	260	java/lang/RuntimeException
    //   251	272	272	java/lang/RuntimeException
    //   280	314	317	java/lang/RuntimeException
    //   304	328	331	java/lang/RuntimeException
  }
  
  public void aegisguard_W(Object[] paramArrayOfObject) {
    WrapperPlayServerEntityRelativeMove wrapperPlayServerEntityRelativeMove = (WrapperPlayServerEntityRelativeMove)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.aegisguard_b != null) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (this.aegisguard_b.getEntityId() == wrapperPlayServerEntityRelativeMove.getEntityId()) {
      aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { this.aegisguard_b });
      try {
        if (aegisguard_hu == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      int i = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
      World world = aegisguard_hu.aegisguard_L(new Object[0]).getWorld();
      double d1 = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_r(new Object[0]) - wrapperPlayServerEntityRelativeMove.getDeltaX();
      double d2 = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_z(new Object[0]) - wrapperPlayServerEntityRelativeMove.getDeltaY();
      double d3 = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_u(new Object[0]) - wrapperPlayServerEntityRelativeMove.getDeltaZ();
      Location location = new Location(world, d1, d2, d3);
      this.aegisguard_X.add(new aegisguard_KI(location, Integer.valueOf(i)));
    } 
  }
  
  public void aegisguard_u(Object[] paramArrayOfObject) {
    WrapperPlayServerEntityRelativeMoveAndRotation wrapperPlayServerEntityRelativeMoveAndRotation = (WrapperPlayServerEntityRelativeMoveAndRotation)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.aegisguard_b != null) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (this.aegisguard_b.getEntityId() == wrapperPlayServerEntityRelativeMoveAndRotation.getEntityId()) {
      aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { this.aegisguard_b });
      try {
        if (aegisguard_hu == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      int i = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
      World world = aegisguard_hu.aegisguard_L(new Object[0]).getWorld();
      double d1 = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_r(new Object[0]) - wrapperPlayServerEntityRelativeMoveAndRotation.getDeltaX();
      double d2 = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_z(new Object[0]) - wrapperPlayServerEntityRelativeMoveAndRotation.getDeltaY();
      double d3 = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_u(new Object[0]) - wrapperPlayServerEntityRelativeMoveAndRotation.getDeltaZ();
      Location location = new Location(world, d1, d2, d3);
      this.aegisguard_X.add(new aegisguard_KI(location, Integer.valueOf(i)));
    } 
  }
  
  public void aegisguard_T(Object[] paramArrayOfObject) {
    this.aegisguard_X.clear();
  }
  
  public void aegisguard_r(Object[] paramArrayOfObject) {
    this.aegisguard_O = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_k(Object[] paramArrayOfObject) {
    this.aegisguard_z = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public int aegisguard_t(Object[] paramArrayOfObject) {
    return aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - this.aegisguard_O;
  }
  
  public int aegisguard_n(Object[] paramArrayOfObject) {
    return aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - this.aegisguard_z;
  }
  
  public void aegisguard_b(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_KQ.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   21: aload_0
    //   22: dup
    //   23: getfield aegisguard_g : I
    //   26: iconst_1
    //   27: iadd
    //   28: putfield aegisguard_g : I
    //   31: astore #4
    //   33: aload_0
    //   34: aload #4
    //   36: ifnull -> 63
    //   39: getfield aegisguard_X : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   42: invokevirtual isEmpty : ()Z
    //   45: ifne -> 218
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: aload_0
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: getfield aegisguard_b : Lorg/bukkit/entity/Player;
    //   66: ifnull -> 218
    //   69: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   72: invokevirtual aegisguard_W : ()Lme/frep/aegisguard/spigot/aegisguard_K8;
    //   75: iconst_0
    //   76: anewarray java/lang/Object
    //   79: invokevirtual aegisguard_I : ([Ljava/lang/Object;)I
    //   82: istore #5
    //   84: aload_0
    //   85: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   88: iconst_1
    //   89: anewarray java/lang/Object
    //   92: dup_x1
    //   93: swap
    //   94: iconst_0
    //   95: swap
    //   96: aastore
    //   97: invokestatic aegisguard_Z : ([Ljava/lang/Object;)I
    //   100: istore #6
    //   102: aload_0
    //   103: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   106: iconst_0
    //   107: anewarray java/lang/Object
    //   110: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   113: iconst_0
    //   114: anewarray java/lang/Object
    //   117: invokevirtual aegisguard_r : ([Ljava/lang/Object;)D
    //   120: dstore #7
    //   122: aload_0
    //   123: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   126: iconst_0
    //   127: anewarray java/lang/Object
    //   130: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   133: iconst_0
    //   134: anewarray java/lang/Object
    //   137: invokevirtual aegisguard_u : ([Ljava/lang/Object;)D
    //   140: dstore #9
    //   142: new org/bukkit/util/Vector
    //   145: dup
    //   146: dload #7
    //   148: dconst_0
    //   149: dload #9
    //   151: invokespecial <init> : (DDD)V
    //   154: astore #11
    //   156: aload_0
    //   157: aload_0
    //   158: getfield aegisguard_m : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   161: iconst_0
    //   162: anewarray java/lang/Object
    //   165: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   168: iconst_0
    //   169: anewarray java/lang/Object
    //   172: invokevirtual aegisguard_b : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   175: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   178: iload #5
    //   180: iload #6
    //   182: <illegal opcode> test : (II)Ljava/util/function/Predicate;
    //   187: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   192: aload #11
    //   194: <illegal opcode> applyAsDouble : (Lorg/bukkit/util/Vector;)Ljava/util/function/ToDoubleFunction;
    //   199: invokeinterface mapToDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
    //   204: invokeinterface min : ()Ljava/util/OptionalDouble;
    //   209: ldc2_w -1.0
    //   212: invokevirtual orElse : (D)D
    //   215: putfield aegisguard_C : D
    //   218: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #127	-> 21
    //   #129	-> 33
    //   #130	-> 69
    //   #132	-> 84
    //   #134	-> 102
    //   #135	-> 122
    //   #137	-> 142
    //   #139	-> 156
    //   #140	-> 187
    //   #141	-> 199
    //   #144	-> 204
    //   #146	-> 218
    // Exception table:
    //   from	to	target	type
    //   33	48	51	java/lang/RuntimeException
    //   39	56	59	java/lang/RuntimeException
  }
  
  private static boolean lambda$handleFlying$0(int paramInt1, int paramInt2, aegisguard_KI paramaegisguard_KI) {
    long l = a ^ 0x1419951BCFDEL;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (Math.abs(paramInt1 - ((Integer)paramaegisguard_KI.aegisguard_E(new Object[0])).intValue() - paramInt2) < 3);
  }
  
  private static double lambda$handleFlying$1(Vector paramVector, aegisguard_KI paramaegisguard_KI) {
    Vector vector = ((Location)paramaegisguard_KI.aegisguard_O(new Object[0])).toVector().setY(0);
    return paramVector.distance(vector) - 0.52D;
  }
  
  public static void aegisguard_Q(int[] paramArrayOfint) {
    aegisguard_N = paramArrayOfint;
  }
  
  public static int[] aegisguard_p() {
    return aegisguard_N;
  }
  
  static {
    if (aegisguard_p() == null)
      aegisguard_Q(new int[3]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
