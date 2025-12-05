package me.frep.aegisguard.spigot.AegisGuard_hu;

import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.protocol.player.User;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientEntityAction;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientHeldItemChange;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientInteractEntity;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerBlockPlacement;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerDigging;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.api.data.IPlayerData;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_KB;
import me.frep.aegisguard.spigot.aegisguard_KQ;
import me.frep.aegisguard.spigot.aegisguard_KX;
import me.frep.aegisguard.spigot.aegisguard_Ke;
import me.frep.aegisguard.spigot.aegisguard_R;
import me.frep.aegisguard.spigot.aegisguard_X;
import me.frep.aegisguard.spigot.aegisguard_X2;
import me.frep.aegisguard.spigot.aegisguard_XR;
import me.frep.aegisguard.spigot.aegisguard_XW;
import me.frep.aegisguard.spigot.aegisguard_Xa;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import me.frep.aegisguard.spigot.check.manager.CheckManager;
import org.bukkit.entity.Player;

public class aegisguard_hu implements IPlayerData {
  private final User aegisguard_C;
  
  @Nullable
  private Player aegisguard_l;
  
  private String aegisguard_o;
  
  private int aegisguard_R;
  
  private ClientVersion aegisguard_W;
  
  private String aegisguard_U;
  
  private boolean aegisguard_L;
  
  private boolean aegisguard_M;
  
  private int aegisguard_h;
  
  private int aegisguard_a;
  
  private int aegisguard_r;
  
  private int aegisguard_P;
  
  private int aegisguard_X;
  
  private int aegisguard_g;
  
  private int aegisguard_q;
  
  private final long aegisguard_w;
  
  private final int aegisguard_b;
  
  private long aegisguard_v;
  
  private long aegisguard_u;
  
  private WrapperPlayClientPlayerFlying aegisguard_d;
  
  private WrapperPlayClientInteractEntity aegisguard_s;
  
  private WrapperPlayClientPlayerDigging aegisguard_J;
  
  private WrapperPlayClientEntityAction aegisguard_e;
  
  private WrapperPlayClientHeldItemChange aegisguard_K;
  
  private WrapperPlayClientPlayerBlockPlacement aegisguard_F;
  
  private int aegisguard_H;
  
  private final List aegisguard_O;
  
  private final aegisguard_X aegisguard_V;
  
  private final aegisguard_KQ aegisguard_A;
  
  private final aegisguard_KB aegisguard_y;
  
  private final aegisguard_XR aegisguard_Q;
  
  private final aegisguard_Ke aegisguard_x;
  
  private final aegisguard_R aegisguard_E;
  
  private final aegisguard_X2 aegisguard_p;
  
  private final aegisguard_XW aegisguard_Y;
  
  private final List aegisguard_N;
  
  private static AbstractCheck[] aegisguard_D;
  
  private static final long a = aegisguard_e.a(3290417699748660760L, 3867582053351025760L, MethodHandles.lookup().lookupClass()).a(162819239631605L);
  
  private static final String[] b;
  
  public void aegisguard_r(@Nullable Player paramPlayer) {
    this.aegisguard_l = paramPlayer;
  }
  
  public void aegisguard_G(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
  }
  
  public void aegisguard_D(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_g(Object[] paramArrayOfObject) {
    ClientVersion clientVersion = (ClientVersion)paramArrayOfObject[0];
  }
  
  public void aegisguard_j(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
  }
  
  public void aegisguard_t(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_U(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard__(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_I(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_b(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_O(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_V(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_r(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_d(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_v(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_o(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_Q(Object[] paramArrayOfObject) {
    WrapperPlayClientPlayerFlying wrapperPlayClientPlayerFlying = (WrapperPlayClientPlayerFlying)paramArrayOfObject[0];
  }
  
  public void aegisguard_m(Object[] paramArrayOfObject) {
    WrapperPlayClientInteractEntity wrapperPlayClientInteractEntity = (WrapperPlayClientInteractEntity)paramArrayOfObject[0];
  }
  
  public void aegisguard_k(Object[] paramArrayOfObject) {
    WrapperPlayClientPlayerDigging wrapperPlayClientPlayerDigging = (WrapperPlayClientPlayerDigging)paramArrayOfObject[0];
  }
  
  public void aegisguard_R(Object[] paramArrayOfObject) {
    WrapperPlayClientEntityAction wrapperPlayClientEntityAction = (WrapperPlayClientEntityAction)paramArrayOfObject[0];
  }
  
  public void aegisguard_f(Object[] paramArrayOfObject) {
    WrapperPlayClientHeldItemChange wrapperPlayClientHeldItemChange = (WrapperPlayClientHeldItemChange)paramArrayOfObject[0];
  }
  
  public void aegisguard_B(Object[] paramArrayOfObject) {
    WrapperPlayClientPlayerBlockPlacement wrapperPlayClientPlayerBlockPlacement = (WrapperPlayClientPlayerBlockPlacement)paramArrayOfObject[0];
  }
  
  public void aegisguard_N(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public User aegisguard_p(Object[] paramArrayOfObject) {
    return this.aegisguard_C;
  }
  
  @Nullable
  public Player aegisguard_L(Object[] paramArrayOfObject) {
    return this.aegisguard_l;
  }
  
  public String getClientBrand() {
    return this.aegisguard_o;
  }
  
  public int aegisguard_G(Object[] paramArrayOfObject) {
    return this.aegisguard_R;
  }
  
  public ClientVersion aegisguard_x(Object[] paramArrayOfObject) {
    return this.aegisguard_W;
  }
  
  public String aegisguard_t(Object[] paramArrayOfObject) {
    return this.aegisguard_U;
  }
  
  public boolean aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_L;
  }
  
  public boolean aegisguard_V(Object[] paramArrayOfObject) {
    return this.aegisguard_M;
  }
  
  public int getTotalViolations() {
    return this.aegisguard_h;
  }
  
  public int getCombatViolations() {
    return this.aegisguard_a;
  }
  
  public int getMovementViolations() {
    return this.aegisguard_r;
  }
  
  public int getPlayerViolations() {
    return this.aegisguard_P;
  }
  
  public int getAutoClickerViolations() {
    return this.aegisguard_X;
  }
  
  public int getScaffoldViolations() {
    return this.aegisguard_g;
  }
  
  public int getTimerViolations() {
    return this.aegisguard_q;
  }
  
  public long getJoinTime() {
    return this.aegisguard_w;
  }
  
  public int getJoinTicks() {
    return this.aegisguard_b;
  }
  
  public long getLastClientBrandAlert() {
    return this.aegisguard_v;
  }
  
  public long aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_u;
  }
  
  public WrapperPlayClientPlayerFlying aegisguard_o(Object[] paramArrayOfObject) {
    return this.aegisguard_d;
  }
  
  public WrapperPlayClientInteractEntity aegisguard_a(Object[] paramArrayOfObject) {
    return this.aegisguard_s;
  }
  
  public WrapperPlayClientPlayerDigging aegisguard_A(Object[] paramArrayOfObject) {
    return this.aegisguard_J;
  }
  
  public WrapperPlayClientEntityAction aegisguard_Y(Object[] paramArrayOfObject) {
    return this.aegisguard_e;
  }
  
  public WrapperPlayClientHeldItemChange aegisguard_X(Object[] paramArrayOfObject) {
    return this.aegisguard_K;
  }
  
  public WrapperPlayClientPlayerBlockPlacement aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_F;
  }
  
  public int aegisguard_u(Object[] paramArrayOfObject) {
    return this.aegisguard_H;
  }
  
  public List aegisguard_u(Object[] paramArrayOfObject) {
    return this.aegisguard_O;
  }
  
  public aegisguard_X aegisguard_K(Object[] paramArrayOfObject) {
    return this.aegisguard_V;
  }
  
  public aegisguard_KQ aegisguard_r(Object[] paramArrayOfObject) {
    return this.aegisguard_A;
  }
  
  public aegisguard_KB aegisguard_s(Object[] paramArrayOfObject) {
    return this.aegisguard_y;
  }
  
  public aegisguard_XR aegisguard_v(Object[] paramArrayOfObject) {
    return this.aegisguard_Q;
  }
  
  public aegisguard_Ke aegisguard_x(Object[] paramArrayOfObject) {
    return this.aegisguard_x;
  }
  
  public aegisguard_R aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_E;
  }
  
  public aegisguard_X2 aegisguard_Y(Object[] paramArrayOfObject) {
    return this.aegisguard_p;
  }
  
  public aegisguard_XW aegisguard_m(Object[] paramArrayOfObject) {
    return this.aegisguard_Y;
  }
  
  public List aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_N;
  }
  
  public aegisguard_hu(User paramUser) {
    String[] arrayOfString = b;
    this.aegisguard_o = arrayOfString[2];
    this.aegisguard_R = -1;
    this.aegisguard_W = ClientVersion.UNKNOWN;
    this.aegisguard_U = arrayOfString[6];
    this.aegisguard_L = false;
    this.aegisguard_M = false;
    this.aegisguard_w = System.currentTimeMillis();
    this.aegisguard_b = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
    this.aegisguard_H = 0;
    (new Object[2])[1] = this;
    new Object[2];
    this.aegisguard_O = CheckManager.aegisguard_z(new Object[] { Long.valueOf(l2) });
    this.aegisguard_V = new aegisguard_X(this);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_P();
    try {
      this.aegisguard_A = new aegisguard_KQ(this);
      this.aegisguard_y = new aegisguard_KB(this);
      this.aegisguard_Q = new aegisguard_XR(this);
      this.aegisguard_x = new aegisguard_Ke(this);
      this.aegisguard_E = new aegisguard_R(this);
      this.aegisguard_p = new aegisguard_X2(this);
      this.aegisguard_Y = new aegisguard_XW(this);
      this.aegisguard_N = new ArrayList();
      this.aegisguard_C = paramUser;
      if (arrayOfAbstractCheck != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[1]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void aegisguard_S(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    aegisguard_Xa.aegisguard_V(new Object[] { null, Integer.valueOf(i), this });
  }
  
  public void aegisguard_P(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    aegisguard_Xa.aegisguard_b(new Object[] { null, Integer.valueOf(i), this });
  }
  
  public boolean aegisguard_w(Object[] paramArrayOfObject) {
    return aegisguard_Xa.aegisguard_o(new Object[] { this });
  }
  
  public boolean aegisguard_z(Object[] paramArrayOfObject) {
    return aegisguard_Xa.aegisguard_Z(new Object[] { this });
  }
  
  public boolean aegisguard_U(Object[] paramArrayOfObject) {
    return aegisguard_Xa.aegisguard_b(new Object[] { this });
  }
  
  public List aegisguard_d(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_hu.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 15187969545994
    //   23: lxor
    //   24: lstore #4
    //   26: pop2
    //   27: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   30: new java/util/ArrayList
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: astore #7
    //   39: invokestatic values : ()[Lme/frep/aegisguard/spigot/aegisguard_h3;
    //   42: astore #8
    //   44: aload #8
    //   46: arraylength
    //   47: istore #9
    //   49: iconst_0
    //   50: istore #10
    //   52: astore #6
    //   54: iload #10
    //   56: iload #9
    //   58: if_icmpge -> 146
    //   61: aload #8
    //   63: iload #10
    //   65: aaload
    //   66: astore #11
    //   68: aload #6
    //   70: lload_2
    //   71: lconst_0
    //   72: lcmp
    //   73: ifle -> 143
    //   76: ifnonnull -> 141
    //   79: aload_0
    //   80: getfield aegisguard_V : Lme/frep/aegisguard/spigot/aegisguard_X;
    //   83: aload #11
    //   85: lload #4
    //   87: iconst_2
    //   88: anewarray java/lang/Object
    //   91: dup_x2
    //   92: dup_x2
    //   93: pop
    //   94: invokestatic valueOf : (J)Ljava/lang/Long;
    //   97: iconst_1
    //   98: swap
    //   99: aastore
    //   100: dup_x1
    //   101: swap
    //   102: iconst_0
    //   103: swap
    //   104: aastore
    //   105: invokevirtual aegisguard_t : ([Ljava/lang/Object;)Z
    //   108: ifeq -> 138
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: aload #7
    //   120: aload #11
    //   122: invokevirtual toString : ()Ljava/lang/String;
    //   125: invokeinterface add : (Ljava/lang/Object;)Z
    //   130: pop
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: iinc #10, 1
    //   141: aload #6
    //   143: ifnull -> 54
    //   146: aload #7
    //   148: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   151: lload_2
    //   152: lconst_0
    //   153: lcmp
    //   154: iflt -> 164
    //   157: ifnonnull -> 174
    //   160: iconst_4
    //   161: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   164: invokestatic aegisguard_X : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #101	-> 30
    //   #103	-> 39
    //   #104	-> 68
    //   #105	-> 118
    //   #103	-> 138
    //   #109	-> 146
    // Exception table:
    //   from	to	target	type
    //   68	111	114	java/lang/RuntimeException
    //   79	131	134	java/lang/RuntimeException
    //   146	167	170	java/lang/RuntimeException
  }
  
  public void aegisguard_E(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_hu.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 89922910535931
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 29198685432354
    //   30: lxor
    //   31: lstore #6
    //   33: dup2
    //   34: ldc2_w 75373528066328
    //   37: lxor
    //   38: lstore #8
    //   40: pop2
    //   41: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   44: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   47: invokevirtual aegisguard_Y : ()Ljava/util/Map;
    //   50: aload_0
    //   51: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   54: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   59: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   64: checkcast java/lang/String
    //   67: astore #11
    //   69: astore #10
    //   71: aload #11
    //   73: ifnonnull -> 81
    //   76: return
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: aload_0
    //   82: getfield aegisguard_L : Z
    //   85: aload #10
    //   87: lload_2
    //   88: lconst_0
    //   89: lcmp
    //   90: iflt -> 127
    //   93: ifnonnull -> 125
    //   96: ifne -> 146
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: invokestatic currentTimeMillis : ()J
    //   109: aload_0
    //   110: getfield aegisguard_v : J
    //   113: lsub
    //   114: ldc2_w 10000
    //   117: lcmp
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload #10
    //   127: lload_2
    //   128: lconst_0
    //   129: lcmp
    //   130: ifle -> 183
    //   133: ifnonnull -> 181
    //   136: ifge -> 147
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: return
    //   147: aload_0
    //   148: aload #11
    //   150: iconst_1
    //   151: anewarray java/lang/Object
    //   154: dup_x1
    //   155: swap
    //   156: iconst_0
    //   157: swap
    //   158: aastore
    //   159: invokevirtual aegisguard_G : ([Ljava/lang/Object;)V
    //   162: aload_0
    //   163: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   166: getstatic me/frep/aegisguard/spigot/aegisguard_hu.b : [Ljava/lang/String;
    //   169: astore #15
    //   171: aload #15
    //   173: bipush #9
    //   175: aaload
    //   176: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   181: aload #10
    //   183: lload_2
    //   184: lconst_0
    //   185: lcmp
    //   186: iflt -> 366
    //   189: ifnonnull -> 364
    //   192: ifne -> 355
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_G2 : Ljava/util/List;
    //   205: invokeinterface iterator : ()Ljava/util/Iterator;
    //   210: astore #12
    //   212: aload #12
    //   214: invokeinterface hasNext : ()Z
    //   219: ifeq -> 355
    //   222: aload #12
    //   224: invokeinterface next : ()Ljava/lang/Object;
    //   229: checkcast java/lang/String
    //   232: astore #13
    //   234: aload_0
    //   235: aload #10
    //   237: ifnonnull -> 277
    //   240: getfield aegisguard_o : Ljava/lang/String;
    //   243: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   246: aload #13
    //   248: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   251: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   254: aload #10
    //   256: ifnonnull -> 364
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: ifeq -> 350
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   275: athrow
    //   276: aload_0
    //   277: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   280: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dY : Ljava/lang/String;
    //   283: getstatic me/frep/aegisguard/spigot/aegisguard_hu.b : [Ljava/lang/String;
    //   286: astore #15
    //   288: aload #15
    //   290: iconst_5
    //   291: aaload
    //   292: aload_0
    //   293: getfield aegisguard_o : Ljava/lang/String;
    //   296: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   299: lload #4
    //   301: dup2_x1
    //   302: pop2
    //   303: iconst_2
    //   304: anewarray java/lang/Object
    //   307: dup_x1
    //   308: swap
    //   309: iconst_1
    //   310: swap
    //   311: aastore
    //   312: dup_x2
    //   313: dup_x2
    //   314: pop
    //   315: invokestatic valueOf : (J)Ljava/lang/Long;
    //   318: iconst_0
    //   319: swap
    //   320: aastore
    //   321: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   324: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   329: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   332: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   335: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   338: aload_0
    //   339: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;)Ljava/lang/Runnable;
    //   344: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   349: pop
    //   350: aload #10
    //   352: ifnull -> 212
    //   355: lload_2
    //   356: lconst_0
    //   357: lcmp
    //   358: iflt -> 1139
    //   361: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_p : Z
    //   364: aload #10
    //   366: ifnonnull -> 604
    //   369: ifeq -> 601
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   378: athrow
    //   379: aload_0
    //   380: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   383: getstatic me/frep/aegisguard/spigot/aegisguard_hu.b : [Ljava/lang/String;
    //   386: bipush #10
    //   388: aaload
    //   389: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   394: aload #10
    //   396: ifnonnull -> 442
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   405: athrow
    //   406: lload_2
    //   407: lconst_0
    //   408: lcmp
    //   409: ifle -> 435
    //   412: ifeq -> 434
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   421: athrow
    //   422: aload #10
    //   424: ifnull -> 601
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   433: athrow
    //   434: iconst_0
    //   435: goto -> 442
    //   438: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   441: athrow
    //   442: istore #12
    //   444: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dI : Ljava/util/List;
    //   447: invokeinterface iterator : ()Ljava/util/Iterator;
    //   452: astore #13
    //   454: aload #13
    //   456: invokeinterface hasNext : ()Z
    //   461: ifeq -> 556
    //   464: aload #13
    //   466: invokeinterface next : ()Ljava/lang/Object;
    //   471: checkcast java/lang/String
    //   474: astore #14
    //   476: aload_0
    //   477: getfield aegisguard_o : Ljava/lang/String;
    //   480: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   483: aload #14
    //   485: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   488: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   491: aload #10
    //   493: lload_2
    //   494: lconst_0
    //   495: lcmp
    //   496: iflt -> 560
    //   499: ifnonnull -> 558
    //   502: aload #10
    //   504: ifnonnull -> 525
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   513: athrow
    //   514: ifeq -> 538
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   523: athrow
    //   524: iconst_1
    //   525: istore #12
    //   527: aload #10
    //   529: lload_2
    //   530: lconst_0
    //   531: lcmp
    //   532: iflt -> 540
    //   535: ifnull -> 556
    //   538: aload #10
    //   540: ifnull -> 454
    //   543: lload_2
    //   544: lconst_0
    //   545: lcmp
    //   546: iflt -> 476
    //   549: goto -> 556
    //   552: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   555: athrow
    //   556: iload #12
    //   558: aload #10
    //   560: ifnonnull -> 604
    //   563: ifne -> 601
    //   566: goto -> 573
    //   569: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   572: athrow
    //   573: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   576: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   579: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   582: aload_0
    //   583: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;)Ljava/lang/Runnable;
    //   588: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   593: pop
    //   594: goto -> 601
    //   597: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   600: athrow
    //   601: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_GU : Z
    //   604: ifeq -> 1101
    //   607: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mg : Ljava/util/List;
    //   610: invokeinterface iterator : ()Ljava/util/Iterator;
    //   615: astore #12
    //   617: aload #12
    //   619: invokeinterface hasNext : ()Z
    //   624: ifeq -> 711
    //   627: aload #12
    //   629: invokeinterface next : ()Ljava/lang/Object;
    //   634: checkcast java/lang/String
    //   637: astore #13
    //   639: aload_0
    //   640: getfield aegisguard_o : Ljava/lang/String;
    //   643: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   646: aload #13
    //   648: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   651: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   654: aload #10
    //   656: lload_2
    //   657: lconst_0
    //   658: lcmp
    //   659: iflt -> 725
    //   662: ifnonnull -> 723
    //   665: ifeq -> 693
    //   668: goto -> 675
    //   671: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   674: athrow
    //   675: aload #10
    //   677: lload_2
    //   678: lconst_0
    //   679: lcmp
    //   680: iflt -> 1138
    //   683: ifnull -> 1101
    //   686: goto -> 693
    //   689: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   692: athrow
    //   693: aload #10
    //   695: ifnull -> 617
    //   698: lload_2
    //   699: lconst_0
    //   700: lcmp
    //   701: iflt -> 639
    //   704: goto -> 711
    //   707: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   710: athrow
    //   711: invokestatic currentTimeMillis : ()J
    //   714: aload_0
    //   715: getfield aegisguard_v : J
    //   718: lsub
    //   719: ldc2_w 10000
    //   722: lcmp
    //   723: aload #10
    //   725: lload_2
    //   726: lconst_0
    //   727: lcmp
    //   728: ifle -> 755
    //   731: ifnonnull -> 753
    //   734: ifge -> 750
    //   737: goto -> 744
    //   740: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   743: athrow
    //   744: lload_2
    //   745: lconst_0
    //   746: lcmp
    //   747: ifgt -> 1101
    //   750: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_yR : Z
    //   753: aload #10
    //   755: lload_2
    //   756: lconst_0
    //   757: lcmp
    //   758: iflt -> 919
    //   761: ifnonnull -> 917
    //   764: ifeq -> 898
    //   767: goto -> 774
    //   770: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   773: athrow
    //   774: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_L6 : Ljava/lang/String;
    //   777: getstatic me/frep/aegisguard/spigot/aegisguard_hu.b : [Ljava/lang/String;
    //   780: iconst_3
    //   781: aaload
    //   782: aload_0
    //   783: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   786: invokeinterface getName : ()Ljava/lang/String;
    //   791: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   794: getstatic me/frep/aegisguard/spigot/aegisguard_hu.b : [Ljava/lang/String;
    //   797: iconst_0
    //   798: aaload
    //   799: aload_0
    //   800: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   803: lload #6
    //   805: dup2_x1
    //   806: pop2
    //   807: iconst_2
    //   808: anewarray java/lang/Object
    //   811: dup_x1
    //   812: swap
    //   813: iconst_1
    //   814: swap
    //   815: aastore
    //   816: dup_x2
    //   817: dup_x2
    //   818: pop
    //   819: invokestatic valueOf : (J)Ljava/lang/Long;
    //   822: iconst_0
    //   823: swap
    //   824: aastore
    //   825: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   828: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   831: getstatic me/frep/aegisguard/spigot/aegisguard_hu.b : [Ljava/lang/String;
    //   834: iconst_5
    //   835: aaload
    //   836: aload_0
    //   837: getfield aegisguard_o : Ljava/lang/String;
    //   840: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   843: lload #4
    //   845: dup2_x1
    //   846: pop2
    //   847: iconst_2
    //   848: anewarray java/lang/Object
    //   851: dup_x1
    //   852: swap
    //   853: iconst_1
    //   854: swap
    //   855: aastore
    //   856: dup_x2
    //   857: dup_x2
    //   858: pop
    //   859: invokestatic valueOf : (J)Ljava/lang/Long;
    //   862: iconst_0
    //   863: swap
    //   864: aastore
    //   865: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   868: lload #8
    //   870: iconst_2
    //   871: anewarray java/lang/Object
    //   874: dup_x2
    //   875: dup_x2
    //   876: pop
    //   877: invokestatic valueOf : (J)Ljava/lang/Long;
    //   880: iconst_1
    //   881: swap
    //   882: aastore
    //   883: dup_x1
    //   884: swap
    //   885: iconst_0
    //   886: swap
    //   887: aastore
    //   888: invokestatic aegisguard_F : ([Ljava/lang/Object;)V
    //   891: goto -> 898
    //   894: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   897: athrow
    //   898: aload_0
    //   899: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   902: getstatic me/frep/aegisguard/spigot/aegisguard_hu.b : [Ljava/lang/String;
    //   905: astore #15
    //   907: aload #15
    //   909: bipush #7
    //   911: aaload
    //   912: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   917: aload #10
    //   919: ifnonnull -> 944
    //   922: ifeq -> 938
    //   925: goto -> 932
    //   928: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   931: athrow
    //   932: lload_2
    //   933: lconst_0
    //   934: lcmp
    //   935: ifgt -> 1101
    //   938: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   941: invokevirtual aegisguard_x : ()Z
    //   944: ifeq -> 1060
    //   947: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_M2 : Ljava/lang/String;
    //   950: getstatic me/frep/aegisguard/spigot/aegisguard_hu.b : [Ljava/lang/String;
    //   953: astore #15
    //   955: aload #15
    //   957: iconst_3
    //   958: aaload
    //   959: aload_0
    //   960: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   963: invokeinterface getName : ()Ljava/lang/String;
    //   968: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   971: aload #15
    //   973: iconst_0
    //   974: aaload
    //   975: aload_0
    //   976: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   979: lload #6
    //   981: dup2_x1
    //   982: pop2
    //   983: iconst_2
    //   984: anewarray java/lang/Object
    //   987: dup_x1
    //   988: swap
    //   989: iconst_1
    //   990: swap
    //   991: aastore
    //   992: dup_x2
    //   993: dup_x2
    //   994: pop
    //   995: invokestatic valueOf : (J)Ljava/lang/Long;
    //   998: iconst_0
    //   999: swap
    //   1000: aastore
    //   1001: invokestatic aegisguard_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1004: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1007: aload #15
    //   1009: iconst_5
    //   1010: aaload
    //   1011: aload_0
    //   1012: getfield aegisguard_o : Ljava/lang/String;
    //   1015: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1018: astore #12
    //   1020: aload_0
    //   1021: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   1024: aload #12
    //   1026: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   1029: astore #12
    //   1031: aload #12
    //   1033: astore #13
    //   1035: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   1038: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1041: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   1044: aload #13
    //   1046: <illegal opcode> run : (Ljava/lang/String;)Ljava/lang/Runnable;
    //   1051: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   1056: pop
    //   1057: goto -> 1081
    //   1060: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   1063: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1066: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   1069: aload_0
    //   1070: <illegal opcode> run : (Lme/frep/aegisguard/spigot/aegisguard_hu;)Ljava/lang/Runnable;
    //   1075: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   1080: pop
    //   1081: aload_0
    //   1082: invokestatic currentTimeMillis : ()J
    //   1085: iconst_1
    //   1086: anewarray java/lang/Object
    //   1089: dup_x2
    //   1090: dup_x2
    //   1091: pop
    //   1092: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1095: iconst_0
    //   1096: swap
    //   1097: aastore
    //   1098: invokevirtual aegisguard_v : ([Ljava/lang/Object;)V
    //   1101: aload_0
    //   1102: iconst_1
    //   1103: iconst_1
    //   1104: anewarray java/lang/Object
    //   1107: dup_x1
    //   1108: swap
    //   1109: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1112: iconst_0
    //   1113: swap
    //   1114: aastore
    //   1115: invokevirtual aegisguard_t : ([Ljava/lang/Object;)V
    //   1118: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   1121: invokevirtual aegisguard_Y : ()Ljava/util/Map;
    //   1124: aload_0
    //   1125: getfield aegisguard_l : Lorg/bukkit/entity/Player;
    //   1128: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   1133: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1138: pop
    //   1139: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #113	-> 44
    //   #115	-> 71
    //   #117	-> 81
    //   #119	-> 147
    //   #121	-> 162
    //   #122	-> 202
    //   #123	-> 234
    //   #124	-> 276
    //   #125	-> 329
    //   #129	-> 350
    //   #133	-> 355
    //   #134	-> 422
    //   #136	-> 434
    //   #138	-> 444
    //   #139	-> 476
    //   #140	-> 524
    //   #141	-> 527
    //   #143	-> 538
    //   #145	-> 556
    //   #146	-> 573
    //   #153	-> 601
    //   #155	-> 607
    //   #156	-> 639
    //   #157	-> 675
    //   #159	-> 693
    //   #161	-> 711
    //   #163	-> 750
    //   #164	-> 774
    //   #165	-> 786
    //   #166	-> 807
    //   #167	-> 840
    //   #164	-> 847
    //   #170	-> 898
    //   #172	-> 938
    //   #173	-> 947
    //   #174	-> 963
    //   #175	-> 983
    //   #176	-> 1015
    //   #178	-> 1020
    //   #179	-> 1031
    //   #180	-> 1035
    //   #182	-> 1057
    //   #183	-> 1060
    //   #190	-> 1081
    //   #194	-> 1101
    //   #195	-> 1118
    //   #196	-> 1139
    // Exception table:
    //   from	to	target	type
    //   71	77	77	java/lang/RuntimeException
    //   81	99	102	java/lang/RuntimeException
    //   96	118	121	java/lang/RuntimeException
    //   125	139	142	java/lang/RuntimeException
    //   181	195	198	java/lang/RuntimeException
    //   234	259	262	java/lang/RuntimeException
    //   240	269	272	java/lang/RuntimeException
    //   364	372	375	java/lang/RuntimeException
    //   369	399	402	java/lang/RuntimeException
    //   379	415	418	java/lang/RuntimeException
    //   406	427	430	java/lang/RuntimeException
    //   422	435	438	java/lang/RuntimeException
    //   476	507	510	java/lang/RuntimeException
    //   502	517	520	java/lang/RuntimeException
    //   527	543	552	java/lang/RuntimeException
    //   558	566	569	java/lang/RuntimeException
    //   563	594	597	java/lang/RuntimeException
    //   639	668	671	java/lang/RuntimeException
    //   665	686	689	java/lang/RuntimeException
    //   675	698	707	java/lang/RuntimeException
    //   723	737	740	java/lang/RuntimeException
    //   753	767	770	java/lang/RuntimeException
    //   764	891	894	java/lang/RuntimeException
    //   917	925	928	java/lang/RuntimeException
  }
  
  private void lambda$handleClientBrand$0() {
    long l1 = a ^ 0x25990842F882L, l2 = l1 ^ 0x7AC7E0A5A100L;
    (new Object[2])[1] = aegisguard_b0.aegisguard_dY.replaceAll(b[4], this.aegisguard_o);
    new Object[2];
    this.aegisguard_l.kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  private void lambda$handleClientBrand$1() {
    long l1 = a ^ 0x248767C8FD5FL, l2 = l1 ^ 0x7BD98F2FA4DDL;
    String[] arrayOfString = b;
    (new Object[2])[1] = aegisguard_b0.aegisguard_dY.replaceAll(arrayOfString[5], this.aegisguard_o);
    new Object[2];
    this.aegisguard_l.sendMessage(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
    (new Object[2])[1] = aegisguard_b0.aegisguard_dY.replaceAll(arrayOfString[5], this.aegisguard_o);
    new Object[2];
    this.aegisguard_l.kickPlayer(aegisguard_KX.aegisguard_q(new Object[] { Long.valueOf(l2) }));
  }
  
  private static void lambda$handleClientBrand$2(String paramString) {
    aegisguard_K.INSTANCE.aegisguard_l().aegisguard_H(new Object[] { paramString });
  }
  
  private void lambda$handleClientBrand$3() {
    long l1 = a ^ 0x2394C57A14DL, l2 = l1 ^ 0x162132D6D216L;
    String[] arrayOfString = b;
    (new Object[2])[1] = this.aegisguard_l;
    new Object[2];
    aegisguard_K.INSTANCE.aegisguard_l().aegisguard_H(new Object[] { aegisguard_b0.aegisguard_M2.replaceAll(arrayOfString[8], this.aegisguard_l.getName()).replaceAll(arrayOfString[1], aegisguard_Xa.aegisguard_g(new Object[] { Long.valueOf(l2) })).replaceAll(arrayOfString[5], this.aegisguard_o) });
  }
  
  public static void aegisguard_X(AbstractCheck[] paramArrayOfAbstractCheck) {
    aegisguard_D = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] aegisguard_P() {
    return aegisguard_D;
  }
  
  static {
    long l = a ^ 0x67FEF1FEE2EEL;
    aegisguard_X(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "\f'Û*o\002³£\000*{æû¹Á¤Ï\030\f'Û*o\002³£\000*{æû¹Á¤Ï\020^ßfb\024Pñ^ò}Xbxg\017\020ªT\005lä\000i«Ô ¤1»ýS\020\f'Û*oö¢ÚâØ\032\020\f'Û*oö¢ÚâØ\032\020^ßfb\024Pñ^ò}Xbxg\017(PùR?µd5Å\034ë\"ñJ(yÁ×i©Ðæ{\020û-J­åfå*à¯¼\020ªT\005lä\000i«Ô ¤1»ýS").length();
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
