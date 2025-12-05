package me.frep.aegisguard.spigot.AegisGuard_K;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.vulcan.spigot.VulcanPlugin;
import me.frep.vulcan.spigot.Vulcan_K1;
import me.frep.vulcan.spigot.Vulcan_K8;
import me.frep.vulcan.spigot.Vulcan_KH;
import me.frep.vulcan.spigot.Vulcan_KJ;
import me.frep.vulcan.spigot.Vulcan_KV;
import me.frep.vulcan.spigot.Vulcan_Kq;
import me.frep.vulcan.spigot.Vulcan_X6;
import me.frep.vulcan.spigot.Vulcan_XP;
import me.frep.vulcan.spigot.Vulcan_Xc;
import me.frep.vulcan.spigot.Vulcan_b0;
import me.frep.vulcan.spigot.Vulcan_e;
import me.frep.vulcan.spigot.Vulcan_hb;
import me.frep.vulcan.spigot.check.AbstractCheck;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.messaging.ReservedChannelException;

public enum Vulcan_K {
  public static final me.frep.vulcan.spigot.Vulcan_K INSTANCE;
  
  private VulcanPlugin Vulcan_M;
  
  private long Vulcan_T;
  
  private final String Vulcan_K;
  
  private final String Vulcan_R;
  
  private final String Vulcan_y;
  
  private final Logger Vulcan_U;
  
  private boolean Vulcan_X;
  
  private boolean Vulcan_d;
  
  private boolean Vulcan_B;
  
  private boolean Vulcan_Y;
  
  private boolean Vulcan_Z;
  
  private boolean Vulcan_k;
  
  private boolean Vulcan_V;
  
  private boolean Vulcan_H;
  
  private boolean Vulcan_J;
  
  private boolean Vulcan_O;
  
  private boolean Vulcan_i;
  
  private final Map Vulcan_x;
  
  private final Vulcan_K8 Vulcan__;
  
  private final Vulcan_X6 Vulcan_L;
  
  private final PluginManager Vulcan_v;
  
  private final Vulcan_K1 Vulcan_N;
  
  private final Vulcan_hb Vulcan_I;
  
  private final Vulcan_KJ Vulcan_S;
  
  private final Vulcan_Xc Vulcan_c;
  
  private final Vulcan_XP Vulcan_A;
  
  private final Vulcan_KH Vulcan_j;
  
  private final ExecutorService Vulcan_W;
  
  private final ExecutorService Vulcan_g;
  
  private final ExecutorService Vulcan_q;
  
  private final ExecutorService Vulcan_G;
  
  private final ExecutorService Vulcan_l;
  
  private final ExecutorService Vulcan_z;
  
  private final Map Vulcan_b;
  
  private int Vulcan_w;
  
  private int Vulcan_h;
  
  private int Vulcan_e;
  
  private final boolean Vulcan_m = true;
  
  private static String[] Vulcan_E;
  
  private static final long a = Vulcan_e.a(-4770116275087007049L, 5080526835367247493L, MethodHandles.lookup().lookupClass()).a(46842363065665L);
  
  private static final String[] b;
  
  static {
    long l = a ^ 0x18909892E219L;
    Vulcan_F(new String[5]);
    byte b1;
    for ((new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[42];
    boolean bool = false;
    String str;
    int i = (str = "\000¸mêF§ ±\004\036Z\033\022`Duèt\006¼u#=B\025«>§D¢ÚiõÅm\016\b».ìÅ\002õ\020i÷ò>\003PCÇ|BYQ²\n(Ù\030\036J\031±V0}^/03ô\023\006~ÍSVÍ¿~\001\bW:'bÌÕ&{ lÅdn±â \\®\026Z.á5®R×\t#½c® U¯Ð¡À-00ì9\bàÝMxÂlS\036§¨Ó?5\004&ë\026\025KOicã}®dÑ^FÜ`Ð|®\022j®­ 7¸ÞCKÁÕ*R\035\n®Xy8/Pt¦Ö-.d|^¡éëþÀ\020DU²_\020>;)§k  ÎÖ ~\0207Ù¨?u\025\020¥j\035s\bW:'bÌÕ&{(7Ù¨?u\024¸Rm °¹\033Ì½Xd\006M\021ÖñòÈén=\001ëÜ1\036U)\020ÀÊÐ.sîu{\013ÎÇ=©( \021ÔÚÝ\023\003P{®\001c1³\016¸iYmA0YòYuY\020D§\001cOÏTIú\007\001\001iÉv -<0êÿ'\023&?ÜÊ¯ÅÌûYä%T÷¼¦É¡$\b7êb\b¥.É¨sï5\0207á\033UsÙ¦µùÇ{£txü\bQäï\031¾\rþ>\020HwON¦\f\003ü¯¸=^p<\030\nØ\031\035m`Ð²Ö«/ÒN.Ñ\\:uþÌ)\020ÌVøjóYëñË¸¦\003\001\013n\035\b:¢\023\\¬<\031\bëV\026(äÒ&[\bÌÃ2K'\"A(7\021úqyWÝô¢\003+úÆicìÈ9I\025¼à­?c&ú¬q¨õVS\013Dê§\020Îr'µ\026J9#U¶\033\n¼æ\020¹gì;fmyÈ)<X6fè(i÷ò>\003PCÇ­liá§®&W)Õo9¯Û.¯ÃÚ ~ÎmIÙ.>\020ÐÅ¼eu*ó\032\005¿\003ª\000¨Q ±\004\036Z\033\022`D µC¥æ\000ÄàA\024\000«ç8Õlq+°Ü(7\021úqyWÝËÈµ¦ÿ¦cÞ.XzyGü¥LAG\032ÞwÈBDîHû3\020ßrcäL!¿r\024Ëiirøl(ßrcäL!¿?D}¸WvHA\023áôYé§\006*Å0Æ\016í¢\nËÐzHò(lÅdn±âb%xR²$Ý\007Á(Ln\027ë\f\013ÿ_Û\no\034¿cÝîú\004\030\020\nØ\031\035m`Ð²ëyB¼ò+M ±\004\036Z\033\022`D°>©µÊ§\004tù\022Á±þ^n×ÿÆ-û\020ßrcäL!¿r\024Ëiirøl").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  Vulcan_K() {
    this.Vulcan_K = Vulcan_Kq.spigot();
    this.Vulcan_R = Vulcan_Kq.nonce();
    this.Vulcan_y = Vulcan_Kq.resource();
    this.Vulcan_U = Bukkit.getLogger();
    this.Vulcan_x = new HashMap<>();
    this.Vulcan__ = new Vulcan_K8();
    this.Vulcan_L = new Vulcan_X6();
    this.Vulcan_v = Bukkit.getServer().getPluginManager();
    this.Vulcan_N = new Vulcan_K1();
    this.Vulcan_I = new Vulcan_hb();
    this.Vulcan_S = new Vulcan_KJ();
    this.Vulcan_c = new Vulcan_Xc();
    this.Vulcan_A = new Vulcan_XP();
    this.Vulcan_j = new Vulcan_KH();
    this.Vulcan_W = Executors.newSingleThreadExecutor();
    this.Vulcan_g = Executors.newSingleThreadExecutor();
    this.Vulcan_q = Executors.newFixedThreadPool(1);
    this.Vulcan_G = Executors.newFixedThreadPool(1);
    this.Vulcan_l = Executors.newSingleThreadExecutor();
    this.Vulcan_z = Executors.newSingleThreadExecutor();
    this.Vulcan_b = new HashMap<>();
    this.Vulcan_w = 0;
    this.Vulcan_h = 0;
    this.Vulcan_e = 0;
    this.Vulcan_m = true;
  }
  
  public VulcanPlugin Vulcan_j() {
    return this.Vulcan_M;
  }
  
  public long Vulcan_L() {
    return this.Vulcan_T;
  }
  
  public String Vulcan_i() {
    return this.Vulcan_K;
  }
  
  public String Vulcan_t() {
    return this.Vulcan_R;
  }
  
  public String Vulcan_g() {
    return this.Vulcan_y;
  }
  
  public Logger Vulcan_e() {
    return this.Vulcan_U;
  }
  
  public void Vulcan_O(boolean paramBoolean) {
    this.Vulcan_X = paramBoolean;
  }
  
  public void Vulcan_l(boolean paramBoolean) {
    this.Vulcan_d = paramBoolean;
  }
  
  public void Vulcan_a(boolean paramBoolean) {
    this.Vulcan_B = paramBoolean;
  }
  
  public void Vulcan_u(boolean paramBoolean) {
    this.Vulcan_Y = paramBoolean;
  }
  
  public void Vulcan_s(boolean paramBoolean) {
    this.Vulcan_Z = paramBoolean;
  }
  
  public void Vulcan_C(boolean paramBoolean) {
    this.Vulcan_k = paramBoolean;
  }
  
  public void Vulcan_f(boolean paramBoolean) {
    this.Vulcan_V = paramBoolean;
  }
  
  public void Vulcan_v(boolean paramBoolean) {
    this.Vulcan_H = paramBoolean;
  }
  
  public void Vulcan_B(boolean paramBoolean) {
    this.Vulcan_J = paramBoolean;
  }
  
  public void Vulcan_r(boolean paramBoolean) {
    this.Vulcan_O = paramBoolean;
  }
  
  public void Vulcan_E(boolean paramBoolean) {
    this.Vulcan_i = paramBoolean;
  }
  
  public boolean Vulcan_D() {
    return this.Vulcan_X;
  }
  
  public boolean Vulcan_W() {
    return this.Vulcan_d;
  }
  
  public boolean Vulcan_x() {
    return this.Vulcan_B;
  }
  
  public boolean Vulcan_q() {
    return this.Vulcan_Y;
  }
  
  public boolean Vulcan_S() {
    return this.Vulcan_Z;
  }
  
  public boolean Vulcan_Y() {
    return this.Vulcan_k;
  }
  
  public boolean Vulcan_T() {
    return this.Vulcan_V;
  }
  
  public boolean Vulcan_O() {
    return this.Vulcan_H;
  }
  
  public boolean Vulcan_J() {
    return this.Vulcan_J;
  }
  
  public boolean Vulcan_g() {
    return this.Vulcan_O;
  }
  
  public boolean Vulcan_l() {
    return this.Vulcan_i;
  }
  
  public Map Vulcan_p() {
    return this.Vulcan_x;
  }
  
  public Vulcan_K8 Vulcan_W() {
    return this.Vulcan__;
  }
  
  public Vulcan_X6 Vulcan_A() {
    return this.Vulcan_L;
  }
  
  public PluginManager Vulcan_n() {
    return this.Vulcan_v;
  }
  
  public Vulcan_K1 Vulcan_B() {
    return this.Vulcan_N;
  }
  
  public Vulcan_hb Vulcan_c() {
    return this.Vulcan_I;
  }
  
  public Vulcan_KJ Vulcan_p() {
    return this.Vulcan_S;
  }
  
  public Vulcan_Xc Vulcan_Y() {
    return this.Vulcan_c;
  }
  
  public Vulcan_XP Vulcan_l() {
    return this.Vulcan_A;
  }
  
  public Vulcan_KH Vulcan_r() {
    return this.Vulcan_j;
  }
  
  public ExecutorService Vulcan_M() {
    return this.Vulcan_W;
  }
  
  public ExecutorService Vulcan_s() {
    return this.Vulcan_g;
  }
  
  public ExecutorService Vulcan_U() {
    return this.Vulcan_q;
  }
  
  public ExecutorService Vulcan_n() {
    return this.Vulcan_G;
  }
  
  public ExecutorService Vulcan_F() {
    return this.Vulcan_l;
  }
  
  public ExecutorService Vulcan_V() {
    return this.Vulcan_z;
  }
  
  public Map Vulcan_Y() {
    return this.Vulcan_b;
  }
  
  public int Vulcan_G() {
    return this.Vulcan_w;
  }
  
  public int Vulcan_h() {
    return this.Vulcan_h;
  }
  
  public int Vulcan_Z() {
    return this.Vulcan_e;
  }
  
  public void Vulcan_R(int paramInt) {
    this.Vulcan_w = paramInt;
  }
  
  public void Vulcan_O(int paramInt) {
    this.Vulcan_h = paramInt;
  }
  
  public void Vulcan_P(int paramInt) {
    this.Vulcan_e = paramInt;
  }
  
  public boolean Vulcan_k() {
    Objects.requireNonNull(this);
    return true;
  }
  
  public void Vulcan_y(VulcanPlugin paramVulcanPlugin) {
    // Byte code:
    //   0: getstatic me/frep/vulcan/spigot/Vulcan_K.a : J
    //   3: ldc2_w 6161572288282
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 91234679911471
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 89294798869593
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 31536285689960
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 27007230927434
    //   34: lxor
    //   35: lstore #10
    //   37: dup2
    //   38: ldc2_w 94795968513479
    //   41: lxor
    //   42: lstore #12
    //   44: dup2
    //   45: ldc2_w 32074475878952
    //   48: lxor
    //   49: lstore #14
    //   51: pop2
    //   52: invokestatic Vulcan_c : ()[Ljava/lang/String;
    //   55: aload_0
    //   56: aload_1
    //   57: putfield Vulcan_M : Lme/frep/vulcan/spigot/VulcanPlugin;
    //   60: astore #16
    //   62: aload #16
    //   64: ifnull -> 274
    //   67: getstatic me/frep/vulcan/spigot/Vulcan_K.Vulcan_s : Z
    //   70: ifne -> 121
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aload_1
    //   81: aload #16
    //   83: ifnull -> 293
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: ifnonnull -> 121
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: new java/lang/AssertionError
    //   106: dup
    //   107: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   110: bipush #6
    //   112: aaload
    //   113: invokespecial <init> : (Ljava/lang/Object;)V
    //   116: athrow
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: aload_0
    //   122: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   125: invokevirtual saveDefaultConfig : ()V
    //   128: lload #4
    //   130: iconst_1
    //   131: anewarray java/lang/Object
    //   134: dup_x2
    //   135: dup_x2
    //   136: pop
    //   137: invokestatic valueOf : (J)Ljava/lang/Long;
    //   140: iconst_0
    //   141: swap
    //   142: aastore
    //   143: invokestatic Vulcan_X : ([Ljava/lang/Object;)V
    //   146: lload #6
    //   148: iconst_1
    //   149: anewarray java/lang/Object
    //   152: dup_x2
    //   153: dup_x2
    //   154: pop
    //   155: invokestatic valueOf : (J)Ljava/lang/Long;
    //   158: iconst_0
    //   159: swap
    //   160: aastore
    //   161: invokestatic Vulcan_h : ([Ljava/lang/Object;)V
    //   164: lload #8
    //   166: iconst_1
    //   167: anewarray java/lang/Object
    //   170: dup_x2
    //   171: dup_x2
    //   172: pop
    //   173: invokestatic valueOf : (J)Ljava/lang/Long;
    //   176: iconst_0
    //   177: swap
    //   178: aastore
    //   179: invokestatic Vulcan__ : ([Ljava/lang/Object;)V
    //   182: lload #12
    //   184: iconst_1
    //   185: anewarray java/lang/Object
    //   188: dup_x2
    //   189: dup_x2
    //   190: pop
    //   191: invokestatic valueOf : (J)Ljava/lang/Long;
    //   194: iconst_0
    //   195: swap
    //   196: aastore
    //   197: invokestatic Vulcan_f : ([Ljava/lang/Object;)V
    //   200: aload_0
    //   201: new java/lang/StringBuilder
    //   204: dup
    //   205: invokespecial <init> : ()V
    //   208: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   211: astore #18
    //   213: aload #18
    //   215: iconst_4
    //   216: aaload
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: iconst_0
    //   221: anewarray java/lang/Object
    //   224: invokestatic Vulcan_M : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/manager/server/ServerVersion;
    //   227: invokevirtual toString : ()Ljava/lang/String;
    //   230: ldc_w '_'
    //   233: ldc_w '.'
    //   236: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   239: ldc_w 'v'
    //   242: ldc_w ''
    //   245: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   248: ldc_w '.'
    //   251: ldc_w ''
    //   254: invokevirtual replaceFirst : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: aload #18
    //   262: bipush #15
    //   264: aaload
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: invokevirtual toString : ()Ljava/lang/String;
    //   271: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   274: aload_0
    //   275: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   278: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   281: astore #18
    //   283: aload #18
    //   285: bipush #22
    //   287: aaload
    //   288: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   293: aload #16
    //   295: ifnull -> 349
    //   298: ifnull -> 330
    //   301: goto -> 308
    //   304: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   307: athrow
    //   308: aload_0
    //   309: iconst_1
    //   310: putfield Vulcan_X : Z
    //   313: aload_0
    //   314: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   317: bipush #27
    //   319: aaload
    //   320: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   329: athrow
    //   330: aload_0
    //   331: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   334: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   337: astore #18
    //   339: aload #18
    //   341: bipush #37
    //   343: aaload
    //   344: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   349: aload #16
    //   351: ifnull -> 405
    //   354: ifnull -> 386
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   363: athrow
    //   364: aload_0
    //   365: iconst_1
    //   366: putfield Vulcan_d : Z
    //   369: aload_0
    //   370: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   373: bipush #33
    //   375: aaload
    //   376: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   379: goto -> 386
    //   382: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   385: athrow
    //   386: aload_0
    //   387: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   390: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   393: astore #18
    //   395: aload #18
    //   397: bipush #24
    //   399: aaload
    //   400: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   405: aload #16
    //   407: ifnull -> 461
    //   410: ifnull -> 442
    //   413: goto -> 420
    //   416: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   419: athrow
    //   420: aload_0
    //   421: iconst_1
    //   422: putfield Vulcan_Y : Z
    //   425: aload_0
    //   426: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   429: bipush #14
    //   431: aaload
    //   432: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   435: goto -> 442
    //   438: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   441: athrow
    //   442: aload_0
    //   443: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   446: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   449: astore #18
    //   451: aload #18
    //   453: bipush #28
    //   455: aaload
    //   456: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   461: aload #16
    //   463: ifnull -> 507
    //   466: ifnull -> 488
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   475: athrow
    //   476: aload_0
    //   477: iconst_1
    //   478: putfield Vulcan_Z : Z
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   487: athrow
    //   488: aload_0
    //   489: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   492: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   495: astore #18
    //   497: aload #18
    //   499: bipush #10
    //   501: aaload
    //   502: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   507: aload #16
    //   509: ifnull -> 563
    //   512: ifnull -> 544
    //   515: goto -> 522
    //   518: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   521: athrow
    //   522: aload_0
    //   523: iconst_1
    //   524: putfield Vulcan_k : Z
    //   527: aload_0
    //   528: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   531: bipush #12
    //   533: aaload
    //   534: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   537: goto -> 544
    //   540: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   543: athrow
    //   544: aload_0
    //   545: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   548: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   551: astore #18
    //   553: aload #18
    //   555: bipush #34
    //   557: aaload
    //   558: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   563: aload #16
    //   565: ifnull -> 658
    //   568: ifnull -> 632
    //   571: goto -> 578
    //   574: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   577: athrow
    //   578: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   581: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   584: astore #18
    //   586: aload #18
    //   588: bipush #39
    //   590: aaload
    //   591: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   596: astore #17
    //   598: aload_0
    //   599: aload #17
    //   601: invokeinterface getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
    //   606: invokevirtual getVersion : ()Ljava/lang/String;
    //   609: ldc_w '5'
    //   612: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   615: putfield Vulcan_i : Z
    //   618: aload_0
    //   619: iconst_1
    //   620: putfield Vulcan_V : Z
    //   623: aload_0
    //   624: aload #18
    //   626: bipush #35
    //   628: aaload
    //   629: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   632: aload_0
    //   633: aload #16
    //   635: ifnull -> 711
    //   638: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   641: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   644: iconst_2
    //   645: aaload
    //   646: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   651: goto -> 658
    //   654: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   657: athrow
    //   658: ifnonnull -> 698
    //   661: aload_0
    //   662: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   665: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   668: bipush #41
    //   670: aaload
    //   671: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   676: aload #16
    //   678: ifnull -> 751
    //   681: goto -> 688
    //   684: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   687: athrow
    //   688: ifnull -> 724
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   697: athrow
    //   698: aload_0
    //   699: iconst_1
    //   700: putfield Vulcan_H : Z
    //   703: aload_0
    //   704: goto -> 711
    //   707: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   710: athrow
    //   711: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   714: astore #18
    //   716: aload #18
    //   718: bipush #16
    //   720: aaload
    //   721: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   724: aload_0
    //   725: aload #16
    //   727: ifnull -> 934
    //   730: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   733: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   736: bipush #17
    //   738: aaload
    //   739: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   744: goto -> 751
    //   747: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   750: athrow
    //   751: ifnull -> 776
    //   754: aload_0
    //   755: iconst_1
    //   756: putfield Vulcan_J : Z
    //   759: aload_0
    //   760: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   763: bipush #8
    //   765: aaload
    //   766: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   775: athrow
    //   776: aload_0
    //   777: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   780: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   783: astore #18
    //   785: aload #18
    //   787: bipush #23
    //   789: aaload
    //   790: invokevirtual getCommand : (Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;
    //   793: new me/frep/vulcan/spigot/Vulcan_C
    //   796: dup
    //   797: invokespecial <init> : ()V
    //   800: invokevirtual setExecutor : (Lorg/bukkit/command/CommandExecutor;)V
    //   803: aload_0
    //   804: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   807: aload #18
    //   809: bipush #20
    //   811: aaload
    //   812: invokevirtual getCommand : (Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;
    //   815: new me/frep/vulcan/spigot/Vulcan_k
    //   818: dup
    //   819: invokespecial <init> : ()V
    //   822: invokevirtual setExecutor : (Lorg/bukkit/command/CommandExecutor;)V
    //   825: aload_0
    //   826: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   829: aload #18
    //   831: bipush #25
    //   833: aaload
    //   834: invokevirtual getCommand : (Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;
    //   837: new me/frep/vulcan/spigot/Vulcan_J
    //   840: dup
    //   841: invokespecial <init> : ()V
    //   844: invokevirtual setExecutor : (Lorg/bukkit/command/CommandExecutor;)V
    //   847: aload_0
    //   848: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   851: aload #18
    //   853: bipush #11
    //   855: aaload
    //   856: invokevirtual getCommand : (Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;
    //   859: new me/frep/vulcan/spigot/Vulcan_i
    //   862: dup
    //   863: invokespecial <init> : ()V
    //   866: invokevirtual setExecutor : (Lorg/bukkit/command/CommandExecutor;)V
    //   869: aload_0
    //   870: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   873: aload #18
    //   875: iconst_5
    //   876: aaload
    //   877: invokevirtual getCommand : (Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;
    //   880: new me/frep/vulcan/spigot/Vulcan_K9
    //   883: dup
    //   884: invokespecial <init> : ()V
    //   887: invokevirtual setTabCompleter : (Lorg/bukkit/command/TabCompleter;)V
    //   890: aload_0
    //   891: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   894: aload #18
    //   896: iconst_0
    //   897: aaload
    //   898: invokevirtual getCommand : (Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;
    //   901: new me/frep/vulcan/spigot/Vulcan_z
    //   904: dup
    //   905: invokespecial <init> : ()V
    //   908: invokevirtual setExecutor : (Lorg/bukkit/command/CommandExecutor;)V
    //   911: aload_0
    //   912: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   915: aload #18
    //   917: bipush #26
    //   919: aaload
    //   920: invokevirtual getCommand : (Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;
    //   923: new me/frep/vulcan/spigot/Vulcan_S
    //   926: dup
    //   927: invokespecial <init> : ()V
    //   930: invokevirtual setExecutor : (Lorg/bukkit/command/CommandExecutor;)V
    //   933: aload_0
    //   934: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   937: invokevirtual getServer : ()Lorg/bukkit/Server;
    //   940: invokeinterface getMessenger : ()Lorg/bukkit/plugin/messaging/Messenger;
    //   945: aload_1
    //   946: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   949: bipush #31
    //   951: aaload
    //   952: invokeinterface registerOutgoingPluginChannel : (Lorg/bukkit/plugin/Plugin;Ljava/lang/String;)V
    //   957: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Gm : Z
    //   960: aload #16
    //   962: ifnull -> 1078
    //   965: ifeq -> 1031
    //   968: goto -> 975
    //   971: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   974: athrow
    //   975: iconst_0
    //   976: anewarray java/lang/Object
    //   979: invokestatic Vulcan_n : ([Ljava/lang/Object;)Z
    //   982: aload #16
    //   984: ifnull -> 1078
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   993: athrow
    //   994: ifeq -> 1031
    //   997: goto -> 1004
    //   1000: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1003: athrow
    //   1004: new me/frep/vulcan/spigot/bukkit/Metrics
    //   1007: dup
    //   1008: aload_1
    //   1009: sipush #10297
    //   1012: invokespecial <init> : (Lorg/bukkit/plugin/Plugin;I)V
    //   1015: astore #17
    //   1017: aload_0
    //   1018: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1021: astore #18
    //   1023: aload #18
    //   1025: bipush #9
    //   1027: aaload
    //   1028: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   1031: aload_0
    //   1032: getfield Vulcan__ : Lme/frep/vulcan/spigot/Vulcan_K8;
    //   1035: lload #14
    //   1037: iconst_1
    //   1038: anewarray java/lang/Object
    //   1041: dup_x2
    //   1042: dup_x2
    //   1043: pop
    //   1044: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1047: iconst_0
    //   1048: swap
    //   1049: aastore
    //   1050: invokevirtual Vulcan_n : ([Ljava/lang/Object;)V
    //   1053: aload_0
    //   1054: getfield Vulcan_L : Lme/frep/vulcan/spigot/Vulcan_X6;
    //   1057: lload #10
    //   1059: iconst_1
    //   1060: anewarray java/lang/Object
    //   1063: dup_x2
    //   1064: dup_x2
    //   1065: pop
    //   1066: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1069: iconst_0
    //   1070: swap
    //   1071: aastore
    //   1072: invokevirtual Vulcan_S : ([Ljava/lang/Object;)V
    //   1075: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_LG : Z
    //   1078: aload #16
    //   1080: ifnull -> 1256
    //   1083: ifeq -> 1211
    //   1086: goto -> 1093
    //   1089: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1092: athrow
    //   1093: iconst_0
    //   1094: anewarray java/lang/Object
    //   1097: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   1100: ifeq -> 1184
    //   1103: goto -> 1110
    //   1106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1109: athrow
    //   1110: invokestatic getMessenger : ()Lorg/bukkit/plugin/messaging/Messenger;
    //   1113: aload_1
    //   1114: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1117: bipush #13
    //   1119: aaload
    //   1120: new me/frep/vulcan/spigot/Vulcan_p
    //   1123: dup
    //   1124: invokespecial <init> : ()V
    //   1127: invokeinterface registerIncomingPluginChannel : (Lorg/bukkit/plugin/Plugin;Ljava/lang/String;Lorg/bukkit/plugin/messaging/PluginMessageListener;)Lorg/bukkit/plugin/messaging/PluginMessageListenerRegistration;
    //   1132: pop
    //   1133: invokestatic getMessenger : ()Lorg/bukkit/plugin/messaging/Messenger;
    //   1136: aload_1
    //   1137: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1140: bipush #19
    //   1142: aaload
    //   1143: new me/frep/vulcan/spigot/Vulcan_p
    //   1146: dup
    //   1147: invokespecial <init> : ()V
    //   1150: invokeinterface registerIncomingPluginChannel : (Lorg/bukkit/plugin/Plugin;Ljava/lang/String;Lorg/bukkit/plugin/messaging/PluginMessageListener;)Lorg/bukkit/plugin/messaging/PluginMessageListenerRegistration;
    //   1155: pop
    //   1156: goto -> 1211
    //   1159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1162: athrow
    //   1163: astore #17
    //   1165: aload #16
    //   1167: ifnonnull -> 1211
    //   1170: iconst_1
    //   1171: anewarray me/frep/vulcan/spigot/check/AbstractCheck
    //   1174: invokestatic Vulcan_g : ([Lme/frep/vulcan/spigot/check/AbstractCheck;)V
    //   1177: goto -> 1184
    //   1180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1183: athrow
    //   1184: invokestatic getMessenger : ()Lorg/bukkit/plugin/messaging/Messenger;
    //   1187: aload_1
    //   1188: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1191: astore #18
    //   1193: aload #18
    //   1195: bipush #40
    //   1197: aaload
    //   1198: new me/frep/vulcan/spigot/Vulcan_p
    //   1201: dup
    //   1202: invokespecial <init> : ()V
    //   1205: invokeinterface registerIncomingPluginChannel : (Lorg/bukkit/plugin/Plugin;Ljava/lang/String;Lorg/bukkit/plugin/messaging/PluginMessageListener;)Lorg/bukkit/plugin/messaging/PluginMessageListenerRegistration;
    //   1210: pop
    //   1211: aload_0
    //   1212: invokestatic currentTimeMillis : ()J
    //   1215: putfield Vulcan_T : J
    //   1218: aload_0
    //   1219: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   1222: new me/frep/vulcan/spigot/Vulcan_Ks
    //   1225: dup
    //   1226: invokespecial <init> : ()V
    //   1229: aload_1
    //   1230: invokeinterface registerEvents : (Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V
    //   1235: aload_0
    //   1236: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   1239: new me/frep/vulcan/spigot/Vulcan_X_
    //   1242: dup
    //   1243: invokespecial <init> : ()V
    //   1246: aload_1
    //   1247: invokeinterface registerEvents : (Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V
    //   1252: aload_0
    //   1253: getfield Vulcan_Y : Z
    //   1256: aload #16
    //   1258: ifnull -> 1334
    //   1261: ifeq -> 1330
    //   1264: goto -> 1271
    //   1267: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1270: athrow
    //   1271: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_LB : Z
    //   1274: aload #16
    //   1276: ifnull -> 1334
    //   1279: goto -> 1286
    //   1282: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1285: athrow
    //   1286: ifeq -> 1330
    //   1289: goto -> 1296
    //   1292: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1295: athrow
    //   1296: aload_0
    //   1297: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   1300: new me/frep/vulcan/spigot/Vulcan_hx
    //   1303: dup
    //   1304: invokespecial <init> : ()V
    //   1307: aload_1
    //   1308: invokeinterface registerEvents : (Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V
    //   1313: aload_0
    //   1314: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1317: bipush #38
    //   1319: aaload
    //   1320: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   1323: goto -> 1330
    //   1326: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1329: athrow
    //   1330: aload_0
    //   1331: getfield Vulcan_V : Z
    //   1334: aload #16
    //   1336: ifnull -> 1411
    //   1339: ifeq -> 1407
    //   1342: goto -> 1349
    //   1345: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1348: athrow
    //   1349: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G3 : Z
    //   1352: aload #16
    //   1354: ifnull -> 1411
    //   1357: goto -> 1364
    //   1360: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1363: athrow
    //   1364: ifeq -> 1407
    //   1367: goto -> 1374
    //   1370: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1373: athrow
    //   1374: aload_0
    //   1375: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   1378: new me/frep/vulcan/spigot/Vulcan_hG
    //   1381: dup
    //   1382: invokespecial <init> : ()V
    //   1385: aload_1
    //   1386: invokeinterface registerEvents : (Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V
    //   1391: aload_0
    //   1392: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1395: iconst_1
    //   1396: aaload
    //   1397: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   1400: goto -> 1407
    //   1403: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1406: athrow
    //   1407: aload_0
    //   1408: getfield Vulcan_H : Z
    //   1411: aload #16
    //   1413: ifnull -> 1492
    //   1416: ifeq -> 1485
    //   1419: goto -> 1426
    //   1422: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1425: athrow
    //   1426: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G8 : Z
    //   1429: aload #16
    //   1431: ifnull -> 1492
    //   1434: goto -> 1441
    //   1437: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1440: athrow
    //   1441: ifeq -> 1485
    //   1444: goto -> 1451
    //   1447: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1450: athrow
    //   1451: aload_0
    //   1452: getfield Vulcan_v : Lorg/bukkit/plugin/PluginManager;
    //   1455: new me/frep/vulcan/spigot/Vulcan_X3
    //   1458: dup
    //   1459: invokespecial <init> : ()V
    //   1462: aload_1
    //   1463: invokeinterface registerEvents : (Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V
    //   1468: aload_0
    //   1469: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1472: bipush #32
    //   1474: aaload
    //   1475: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   1478: goto -> 1485
    //   1481: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1484: athrow
    //   1485: iconst_0
    //   1486: anewarray java/lang/Object
    //   1489: invokestatic Vulcan_A : ([Ljava/lang/Object;)Z
    //   1492: aload #16
    //   1494: ifnull -> 1537
    //   1497: ifeq -> 1530
    //   1500: goto -> 1507
    //   1503: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1506: athrow
    //   1507: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   1510: new me/frep/vulcan/spigot/Vulcan_KT
    //   1513: dup
    //   1514: invokespecial <init> : ()V
    //   1517: aload_1
    //   1518: invokeinterface registerEvents : (Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V
    //   1523: goto -> 1530
    //   1526: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1529: athrow
    //   1530: iconst_0
    //   1531: anewarray java/lang/Object
    //   1534: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   1537: ifeq -> 1563
    //   1540: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   1543: new me/frep/vulcan/spigot/Vulcan_XA
    //   1546: dup
    //   1547: invokespecial <init> : ()V
    //   1550: aload_1
    //   1551: invokeinterface registerEvents : (Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V
    //   1556: goto -> 1563
    //   1559: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1562: athrow
    //   1563: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1566: bipush #7
    //   1568: aaload
    //   1569: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1572: bipush #18
    //   1574: aaload
    //   1575: invokestatic setProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1578: pop
    //   1579: aload_0
    //   1580: aload #16
    //   1582: ifnull -> 1632
    //   1585: invokevirtual Vulcan_n : ()Lorg/bukkit/plugin/PluginManager;
    //   1588: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1591: iconst_3
    //   1592: aaload
    //   1593: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   1598: ifnull -> 1641
    //   1601: goto -> 1608
    //   1604: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1607: athrow
    //   1608: aload_0
    //   1609: iconst_1
    //   1610: putfield Vulcan_B : Z
    //   1613: new me/frep/vulcan/spigot/Vulcan_Xd
    //   1616: dup
    //   1617: invokespecial <init> : ()V
    //   1620: invokevirtual register : ()Z
    //   1623: pop
    //   1624: aload_0
    //   1625: goto -> 1632
    //   1628: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1631: athrow
    //   1632: getstatic me/frep/vulcan/spigot/Vulcan_K.b : [Ljava/lang/String;
    //   1635: bipush #30
    //   1637: aaload
    //   1638: invokevirtual Vulcan_u : (Ljava/lang/String;)V
    //   1641: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #91	-> 55
    //   #93	-> 62
    //   #95	-> 121
    //   #97	-> 128
    //   #98	-> 146
    //   #100	-> 164
    //   #102	-> 182
    //   #104	-> 200
    //   #106	-> 274
    //   #107	-> 308
    //   #108	-> 313
    //   #110	-> 330
    //   #111	-> 364
    //   #112	-> 369
    //   #114	-> 386
    //   #115	-> 420
    //   #116	-> 425
    //   #118	-> 442
    //   #119	-> 476
    //   #121	-> 488
    //   #122	-> 522
    //   #123	-> 527
    //   #125	-> 544
    //   #126	-> 578
    //   #127	-> 598
    //   #128	-> 618
    //   #129	-> 623
    //   #132	-> 632
    //   #133	-> 698
    //   #134	-> 703
    //   #137	-> 724
    //   #138	-> 754
    //   #139	-> 759
    //   #142	-> 776
    //   #143	-> 803
    //   #144	-> 825
    //   #145	-> 847
    //   #146	-> 869
    //   #147	-> 890
    //   #148	-> 911
    //   #150	-> 933
    //   #152	-> 957
    //   #153	-> 1004
    //   #154	-> 1017
    //   #157	-> 1031
    //   #159	-> 1053
    //   #161	-> 1075
    //   #162	-> 1093
    //   #163	-> 1110
    //   #165	-> 1133
    //   #168	-> 1156
    //   #166	-> 1163
    //   #168	-> 1165
    //   #170	-> 1184
    //   #174	-> 1211
    //   #176	-> 1218
    //   #177	-> 1235
    //   #179	-> 1252
    //   #180	-> 1296
    //   #181	-> 1313
    //   #184	-> 1330
    //   #185	-> 1374
    //   #186	-> 1391
    //   #189	-> 1407
    //   #190	-> 1451
    //   #191	-> 1468
    //   #194	-> 1485
    //   #195	-> 1530
    //   #197	-> 1563
    //   #199	-> 1579
    //   #200	-> 1608
    //   #201	-> 1613
    //   #202	-> 1624
    //   #204	-> 1641
    // Exception table:
    //   from	to	target	type
    //   62	73	76	org/bukkit/plugin/messaging/ReservedChannelException
    //   67	86	89	org/bukkit/plugin/messaging/ReservedChannelException
    //   80	96	99	org/bukkit/plugin/messaging/ReservedChannelException
    //   93	117	117	org/bukkit/plugin/messaging/ReservedChannelException
    //   293	301	304	org/bukkit/plugin/messaging/ReservedChannelException
    //   298	323	326	org/bukkit/plugin/messaging/ReservedChannelException
    //   349	357	360	org/bukkit/plugin/messaging/ReservedChannelException
    //   354	379	382	org/bukkit/plugin/messaging/ReservedChannelException
    //   405	413	416	org/bukkit/plugin/messaging/ReservedChannelException
    //   410	435	438	org/bukkit/plugin/messaging/ReservedChannelException
    //   461	469	472	org/bukkit/plugin/messaging/ReservedChannelException
    //   466	481	484	org/bukkit/plugin/messaging/ReservedChannelException
    //   507	515	518	org/bukkit/plugin/messaging/ReservedChannelException
    //   512	537	540	org/bukkit/plugin/messaging/ReservedChannelException
    //   563	571	574	org/bukkit/plugin/messaging/ReservedChannelException
    //   632	651	654	org/bukkit/plugin/messaging/ReservedChannelException
    //   658	681	684	org/bukkit/plugin/messaging/ReservedChannelException
    //   661	691	694	org/bukkit/plugin/messaging/ReservedChannelException
    //   688	704	707	org/bukkit/plugin/messaging/ReservedChannelException
    //   724	744	747	org/bukkit/plugin/messaging/ReservedChannelException
    //   751	769	772	org/bukkit/plugin/messaging/ReservedChannelException
    //   934	968	971	org/bukkit/plugin/messaging/ReservedChannelException
    //   965	987	990	org/bukkit/plugin/messaging/ReservedChannelException
    //   975	997	1000	org/bukkit/plugin/messaging/ReservedChannelException
    //   1078	1086	1089	org/bukkit/plugin/messaging/ReservedChannelException
    //   1083	1103	1106	org/bukkit/plugin/messaging/ReservedChannelException
    //   1093	1159	1159	java/lang/SecurityException
    //   1133	1156	1163	org/bukkit/plugin/messaging/ReservedChannelException
    //   1165	1177	1180	org/bukkit/plugin/messaging/ReservedChannelException
    //   1256	1264	1267	org/bukkit/plugin/messaging/ReservedChannelException
    //   1261	1279	1282	org/bukkit/plugin/messaging/ReservedChannelException
    //   1271	1289	1292	org/bukkit/plugin/messaging/ReservedChannelException
    //   1286	1323	1326	org/bukkit/plugin/messaging/ReservedChannelException
    //   1334	1342	1345	org/bukkit/plugin/messaging/ReservedChannelException
    //   1339	1357	1360	org/bukkit/plugin/messaging/ReservedChannelException
    //   1349	1367	1370	org/bukkit/plugin/messaging/ReservedChannelException
    //   1364	1400	1403	org/bukkit/plugin/messaging/ReservedChannelException
    //   1411	1419	1422	org/bukkit/plugin/messaging/ReservedChannelException
    //   1416	1434	1437	org/bukkit/plugin/messaging/ReservedChannelException
    //   1426	1444	1447	org/bukkit/plugin/messaging/ReservedChannelException
    //   1441	1478	1481	org/bukkit/plugin/messaging/ReservedChannelException
    //   1492	1500	1503	org/bukkit/plugin/messaging/ReservedChannelException
    //   1497	1523	1526	org/bukkit/plugin/messaging/ReservedChannelException
    //   1537	1556	1559	org/bukkit/plugin/messaging/ReservedChannelException
    //   1563	1601	1604	org/bukkit/plugin/messaging/ReservedChannelException
    //   1585	1625	1628	org/bukkit/plugin/messaging/ReservedChannelException
  }
  
  public void Vulcan_d(VulcanPlugin paramVulcanPlugin) {
    long l1 = a ^ 0x41E61BE24EE9L, l2 = l1 ^ 0xFEF54DD077DL, l3 = l1 ^ 0x2D2A29FAAE28L;
    this.Vulcan_M = paramVulcanPlugin;
    String[] arrayOfString = Vulcan_c();
    try {
      if (arrayOfString != null) {
        try {
          if (!Vulcan_s)
            try {
              if (paramVulcanPlugin == null)
                throw new AssertionError(b[36]); 
            } catch (ReservedChannelException reservedChannelException) {
              throw a(null);
            }  
        } catch (ReservedChannelException reservedChannelException) {
          throw a(null);
        } 
        new Object[1];
        this.Vulcan__.Vulcan_h(new Object[] { Long.valueOf(l3) });
        new Object[1];
        this.Vulcan_L.Vulcan_D(new Object[] { Long.valueOf(l2) });
        this.Vulcan_W.shutdownNow();
        this.Vulcan_q.shutdownNow();
        this.Vulcan_l.shutdownNow();
        this.Vulcan_g.shutdownNow();
        Bukkit.getScheduler().cancelTasks((Plugin)paramVulcanPlugin);
      } 
    } catch (ReservedChannelException reservedChannelException) {
      throw a(null);
    } 
    try {
      if (AbstractCheck.Vulcan_B() == null)
        Vulcan_F(new String[4]); 
    } catch (ReservedChannelException reservedChannelException) {
      throw a(null);
    } 
  }
  
  public void Vulcan_F() {
    long l1 = a ^ 0x6CFA4152A3F4L, l2 = l1 ^ 0x38564BC520B7L, l3 = l1 ^ 0x4AB2CBA16E0EL, l4 = l1 ^ 0x7FD1B2112076L, l5 = l1 ^ 0x621EE1FB9E3CL;
    new Object[1];
    Vulcan_b0.Vulcan_b(new Object[] { Long.valueOf(l3) });
    new Object[1];
    Vulcan_b0.Vulcan_h(new Object[] { Long.valueOf(l2) });
    new Object[1];
    Vulcan_KV.Vulcan_I(new Object[] { Long.valueOf(l5) });
    new Object[1];
    Vulcan_KV.Vulcan_z(new Object[] { Long.valueOf(l4) });
    INSTANCE.Vulcan_j().reloadConfig();
  }
  
  public void Vulcan_u(String paramString) {
    Bukkit.getLogger().log(Level.INFO, b[21] + paramString);
  }
  
  public static void Vulcan_F(String[] paramArrayOfString) {
    Vulcan_E = paramArrayOfString;
  }
  
  public static String[] Vulcan_c() {
    return Vulcan_E;
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
