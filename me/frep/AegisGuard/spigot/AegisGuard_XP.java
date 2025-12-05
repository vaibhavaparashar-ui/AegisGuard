package me.frep.aegisguard.spigot.AegisGuard_XP;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import java.lang.invoke.MethodHandles;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.clip.placeholderapi.PlaceholderAPI;
import me.frep.vulcan.api.event.VulcanDisableAlertsEvent;
import me.frep.vulcan.api.event.VulcanEnableAlertsEvent;
import me.frep.vulcan.spigot.Vulcan_K;
import me.frep.vulcan.spigot.Vulcan_KX;
import me.frep.vulcan.spigot.Vulcan_Xz;
import me.frep.vulcan.spigot.Vulcan_b0;
import me.frep.vulcan.spigot.Vulcan_bG;
import me.frep.vulcan.spigot.Vulcan_e;
import me.frep.vulcan.spigot.Vulcan_hu;
import me.frep.vulcan.spigot.check.AbstractCheck;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;

public class Vulcan_XP {
  private final Set Vulcan_j = new HashSet();
  
  public Set Vulcan_l(Object[] paramArrayOfObject) {
    return this.Vulcan_j;
  }
  
  private final Set Vulcan_Z = new HashSet();
  
  public Set Vulcan_a(Object[] paramArrayOfObject) {
    return this.Vulcan_Z;
  }
  
  public void Vulcan_t(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_3
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/entity/Player
    //   17: astore_2
    //   18: pop
    //   19: getstatic me/frep/vulcan/spigot/Vulcan_XP.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: lload_3
    //   26: dup2
    //   27: ldc2_w 105446990003145
    //   30: lxor
    //   31: lstore #5
    //   33: pop2
    //   34: invokestatic Vulcan_b : ()Ljava/lang/String;
    //   37: astore #7
    //   39: aload_0
    //   40: getfield Vulcan_j : Ljava/util/Set;
    //   43: aload_2
    //   44: invokeinterface contains : (Ljava/lang/Object;)Z
    //   49: aload #7
    //   51: ifnull -> 293
    //   54: ifeq -> 240
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_0
    //   65: getfield Vulcan_j : Ljava/util/Set;
    //   68: aload_2
    //   69: invokeinterface remove : (Ljava/lang/Object;)Z
    //   74: pop
    //   75: aload_2
    //   76: lload #5
    //   78: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Mc : Ljava/lang/String;
    //   81: iconst_2
    //   82: anewarray java/lang/Object
    //   85: dup_x1
    //   86: swap
    //   87: iconst_1
    //   88: swap
    //   89: aastore
    //   90: dup_x2
    //   91: dup_x2
    //   92: pop
    //   93: invokestatic valueOf : (J)Ljava/lang/Long;
    //   96: iconst_0
    //   97: swap
    //   98: aastore
    //   99: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   102: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   107: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L_ : Z
    //   110: ifne -> 127
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: goto -> 394
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: new me/frep/vulcan/api/event/VulcanDisableAlertsEvent
    //   130: dup
    //   131: aload_2
    //   132: invokespecial <init> : (Lorg/bukkit/entity/Player;)V
    //   135: astore #8
    //   137: aload #7
    //   139: lload_3
    //   140: lconst_0
    //   141: lcmp
    //   142: iflt -> 196
    //   145: ifnull -> 194
    //   148: iconst_0
    //   149: anewarray java/lang/Object
    //   152: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   155: ifeq -> 219
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   168: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   171: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   174: aload #8
    //   176: <illegal opcode> run : (Lme/frep/vulcan/api/event/VulcanDisableAlertsEvent;)Ljava/lang/Runnable;
    //   181: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   186: pop
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: aload #7
    //   196: lload_3
    //   197: lconst_0
    //   198: lcmp
    //   199: iflt -> 237
    //   202: ifnonnull -> 229
    //   205: iconst_1
    //   206: anewarray me/frep/vulcan/spigot/check/AbstractCheck
    //   209: invokestatic Vulcan_g : ([Lme/frep/vulcan/spigot/check/AbstractCheck;)V
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   222: aload #8
    //   224: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   229: lload_3
    //   230: lconst_0
    //   231: lcmp
    //   232: iflt -> 283
    //   235: aload #7
    //   237: ifnonnull -> 394
    //   240: aload_0
    //   241: getfield Vulcan_j : Ljava/util/Set;
    //   244: aload_2
    //   245: invokeinterface add : (Ljava/lang/Object;)Z
    //   250: pop
    //   251: aload_2
    //   252: lload #5
    //   254: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_y7 : Ljava/lang/String;
    //   257: iconst_2
    //   258: anewarray java/lang/Object
    //   261: dup_x1
    //   262: swap
    //   263: iconst_1
    //   264: swap
    //   265: aastore
    //   266: dup_x2
    //   267: dup_x2
    //   268: pop
    //   269: invokestatic valueOf : (J)Ljava/lang/Long;
    //   272: iconst_0
    //   273: swap
    //   274: aastore
    //   275: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   278: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   283: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L_ : Z
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   292: athrow
    //   293: ifne -> 299
    //   296: goto -> 394
    //   299: new me/frep/vulcan/api/event/VulcanEnableAlertsEvent
    //   302: dup
    //   303: aload_2
    //   304: invokespecial <init> : (Lorg/bukkit/entity/Player;)V
    //   307: astore #8
    //   309: aload #7
    //   311: lload_3
    //   312: lconst_0
    //   313: lcmp
    //   314: ifle -> 374
    //   317: ifnull -> 366
    //   320: iconst_0
    //   321: anewarray java/lang/Object
    //   324: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   327: ifeq -> 377
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   336: athrow
    //   337: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   340: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   343: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   346: aload #8
    //   348: <illegal opcode> run : (Lme/frep/vulcan/api/event/VulcanEnableAlertsEvent;)Ljava/lang/Runnable;
    //   353: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   358: pop
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   365: athrow
    //   366: lload_3
    //   367: lconst_0
    //   368: lcmp
    //   369: iflt -> 387
    //   372: aload #7
    //   374: ifnonnull -> 394
    //   377: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   380: aload #8
    //   382: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   393: athrow
    //   394: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #40	-> 39
    //   #41	-> 64
    //   #42	-> 75
    //   #45	-> 107
    //   #47	-> 127
    //   #49	-> 137
    //   #50	-> 165
    //   #52	-> 219
    //   #54	-> 229
    //   #56	-> 240
    //   #57	-> 251
    //   #60	-> 283
    //   #62	-> 299
    //   #64	-> 309
    //   #65	-> 337
    //   #67	-> 377
    //   #71	-> 394
    // Exception table:
    //   from	to	target	type
    //   39	57	60	java/lang/RuntimeException
    //   54	113	116	java/lang/RuntimeException
    //   64	123	123	java/lang/RuntimeException
    //   137	158	161	java/lang/RuntimeException
    //   148	187	190	java/lang/RuntimeException
    //   194	212	215	java/lang/RuntimeException
    //   229	286	289	java/lang/RuntimeException
    //   309	330	333	java/lang/RuntimeException
    //   320	359	362	java/lang/RuntimeException
    //   366	387	390	java/lang/RuntimeException
  }
  
  private static void lambda$toggleAlerts$0(VulcanDisableAlertsEvent paramVulcanDisableAlertsEvent) {
    Bukkit.getPluginManager().callEvent((Event)paramVulcanDisableAlertsEvent);
  }
  
  private static void lambda$toggleAlerts$1(VulcanEnableAlertsEvent paramVulcanEnableAlertsEvent) {
    Bukkit.getPluginManager().callEvent((Event)paramVulcanEnableAlertsEvent);
  }
  
  public void Vulcan_n(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/entity/Player
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/vulcan/spigot/Vulcan_XP.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: lload_2
    //   27: dup2
    //   28: ldc2_w 37966208150091
    //   31: lxor
    //   32: lstore #5
    //   34: pop2
    //   35: invokestatic Vulcan_b : ()Ljava/lang/String;
    //   38: astore #7
    //   40: aload_0
    //   41: getfield Vulcan_Z : Ljava/util/Set;
    //   44: aload #4
    //   46: invokeinterface contains : (Ljava/lang/Object;)Z
    //   51: aload #7
    //   53: ifnull -> 147
    //   56: ifeq -> 129
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_0
    //   67: getfield Vulcan_Z : Ljava/util/Set;
    //   70: aload #4
    //   72: invokeinterface remove : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload #4
    //   80: lload #5
    //   82: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_LU : Ljava/lang/String;
    //   85: iconst_2
    //   86: anewarray java/lang/Object
    //   89: dup_x1
    //   90: swap
    //   91: iconst_1
    //   92: swap
    //   93: aastore
    //   94: dup_x2
    //   95: dup_x2
    //   96: pop
    //   97: invokestatic valueOf : (J)Ljava/lang/Long;
    //   100: iconst_0
    //   101: swap
    //   102: aastore
    //   103: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   106: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   111: lload_2
    //   112: lconst_0
    //   113: lcmp
    //   114: iflt -> 181
    //   117: aload #7
    //   119: ifnonnull -> 181
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_0
    //   130: getfield Vulcan_Z : Ljava/util/Set;
    //   133: aload #4
    //   135: invokeinterface add : (Ljava/lang/Object;)Z
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: pop
    //   148: aload #4
    //   150: lload #5
    //   152: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yk : Ljava/lang/String;
    //   155: iconst_2
    //   156: anewarray java/lang/Object
    //   159: dup_x1
    //   160: swap
    //   161: iconst_1
    //   162: swap
    //   163: aastore
    //   164: dup_x2
    //   165: dup_x2
    //   166: pop
    //   167: invokestatic valueOf : (J)Ljava/lang/Long;
    //   170: iconst_0
    //   171: swap
    //   172: aastore
    //   173: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   176: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   181: lload_2
    //   182: lconst_0
    //   183: lcmp
    //   184: iflt -> 198
    //   187: invokestatic Vulcan_B : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   190: ifnonnull -> 205
    //   193: ldc 'llW6o'
    //   195: invokestatic Vulcan_T : (Ljava/lang/String;)V
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   204: athrow
    //   205: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #74	-> 40
    //   #75	-> 66
    //   #76	-> 78
    //   #78	-> 129
    //   #79	-> 148
    //   #81	-> 181
    // Exception table:
    //   from	to	target	type
    //   40	59	62	java/lang/RuntimeException
    //   56	122	125	java/lang/RuntimeException
    //   66	140	143	java/lang/RuntimeException
    //   181	198	201	java/lang/RuntimeException
  }
  
  public void Vulcan_v(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/vulcan/spigot/check/AbstractCheck
    //   7: astore #5
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast me/frep/vulcan/spigot/Vulcan_hu
    //   15: astore #6
    //   17: dup
    //   18: iconst_2
    //   19: aaload
    //   20: checkcast java/lang/String
    //   23: astore #4
    //   25: dup
    //   26: iconst_3
    //   27: aaload
    //   28: checkcast java/lang/Long
    //   31: invokevirtual longValue : ()J
    //   34: lstore_2
    //   35: pop
    //   36: getstatic me/frep/vulcan/spigot/Vulcan_XP.a : J
    //   39: lload_2
    //   40: lxor
    //   41: lstore_2
    //   42: lload_2
    //   43: dup2
    //   44: ldc2_w 48362615586905
    //   47: lxor
    //   48: lstore #7
    //   50: dup2
    //   51: ldc2_w 77404783401348
    //   54: lxor
    //   55: lstore #9
    //   57: dup2
    //   58: ldc2_w 62773697300878
    //   61: lxor
    //   62: lstore #11
    //   64: dup2
    //   65: ldc2_w 114090445676092
    //   68: lxor
    //   69: lstore #13
    //   71: dup2
    //   72: ldc2_w 49025882472466
    //   75: lxor
    //   76: lstore #15
    //   78: dup2
    //   79: ldc2_w 36716357131315
    //   82: lxor
    //   83: lstore #17
    //   85: dup2
    //   86: ldc2_w 106355652553344
    //   89: lxor
    //   90: lstore #19
    //   92: dup2
    //   93: ldc2_w 83711429489959
    //   96: lxor
    //   97: lstore #21
    //   99: dup2
    //   100: ldc2_w 68967645030842
    //   103: lxor
    //   104: lstore #23
    //   106: pop2
    //   107: invokestatic Vulcan_b : ()Ljava/lang/String;
    //   110: astore #25
    //   112: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   115: invokevirtual Vulcan_g : ()Z
    //   118: aload #25
    //   120: ifnull -> 157
    //   123: ifeq -> 134
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: return
    //   134: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L9 : Ljava/util/Map;
    //   137: aload #5
    //   139: iconst_0
    //   140: anewarray java/lang/Object
    //   143: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   146: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/Boolean
    //   154: invokevirtual booleanValue : ()Z
    //   157: aload #25
    //   159: lload_2
    //   160: lconst_0
    //   161: lcmp
    //   162: iflt -> 199
    //   165: ifnull -> 197
    //   168: ifne -> 179
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: return
    //   179: invokestatic currentTimeMillis : ()J
    //   182: aload #6
    //   184: iconst_0
    //   185: anewarray java/lang/Object
    //   188: invokevirtual Vulcan_y : ([Ljava/lang/Object;)J
    //   191: lsub
    //   192: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dd : I
    //   195: i2l
    //   196: lcmp
    //   197: aload #25
    //   199: lload_2
    //   200: lconst_0
    //   201: lcmp
    //   202: ifle -> 235
    //   205: ifnull -> 233
    //   208: ifge -> 219
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: return
    //   219: aload #6
    //   221: iconst_0
    //   222: anewarray java/lang/Object
    //   225: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   228: invokeinterface isOnline : ()Z
    //   233: aload #25
    //   235: lload_2
    //   236: lconst_0
    //   237: lcmp
    //   238: iflt -> 260
    //   241: ifnull -> 258
    //   244: ifne -> 255
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   253: athrow
    //   254: return
    //   255: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_ds : Z
    //   258: aload #25
    //   260: ifnull -> 345
    //   263: ifeq -> 342
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   272: athrow
    //   273: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   276: invokevirtual Vulcan_D : ()Z
    //   279: aload #25
    //   281: ifnull -> 345
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   290: athrow
    //   291: ifeq -> 342
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   300: athrow
    //   301: aload #6
    //   303: iconst_0
    //   304: anewarray java/lang/Object
    //   307: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   310: invokestatic isBedrockPlayer : (Lorg/bukkit/entity/Player;)Z
    //   313: aload #25
    //   315: lload_2
    //   316: lconst_0
    //   317: lcmp
    //   318: ifle -> 347
    //   321: ifnull -> 345
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   330: athrow
    //   331: ifeq -> 342
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   340: athrow
    //   341: return
    //   342: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_ds : Z
    //   345: aload #25
    //   347: ifnull -> 476
    //   350: ifeq -> 445
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   359: athrow
    //   360: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   363: invokevirtual Vulcan_W : ()Z
    //   366: aload #25
    //   368: ifnull -> 476
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   377: athrow
    //   378: lload_2
    //   379: lconst_0
    //   380: lcmp
    //   381: ifle -> 446
    //   384: ifeq -> 445
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   393: athrow
    //   394: invokestatic getInstance : ()Lorg/geysermc/floodgate/api/FloodgateApi;
    //   397: aload #6
    //   399: iconst_0
    //   400: anewarray java/lang/Object
    //   403: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   406: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   411: invokeinterface isFloodgatePlayer : (Ljava/util/UUID;)Z
    //   416: aload #25
    //   418: lload_2
    //   419: lconst_0
    //   420: lcmp
    //   421: ifle -> 478
    //   424: ifnull -> 476
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   433: athrow
    //   434: ifeq -> 445
    //   437: goto -> 444
    //   440: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   443: athrow
    //   444: return
    //   445: iconst_0
    //   446: anewarray java/lang/Object
    //   449: invokestatic Vulcan_S : ([Ljava/lang/Object;)D
    //   452: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MB : Ljava/util/Map;
    //   455: aload #5
    //   457: iconst_0
    //   458: anewarray java/lang/Object
    //   461: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   464: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   469: checkcast java/lang/Double
    //   472: invokevirtual doubleValue : ()D
    //   475: dcmpg
    //   476: aload #25
    //   478: lload_2
    //   479: lconst_0
    //   480: lcmp
    //   481: iflt -> 521
    //   484: ifnull -> 519
    //   487: ifge -> 498
    //   490: goto -> 497
    //   493: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   496: athrow
    //   497: return
    //   498: aload #6
    //   500: iconst_0
    //   501: anewarray java/lang/Object
    //   504: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   507: iconst_1
    //   508: anewarray java/lang/Object
    //   511: dup_x1
    //   512: swap
    //   513: iconst_0
    //   514: swap
    //   515: aastore
    //   516: invokestatic Vulcan_X : ([Ljava/lang/Object;)I
    //   519: aload #25
    //   521: lload_2
    //   522: lconst_0
    //   523: lcmp
    //   524: iflt -> 573
    //   527: ifnull -> 571
    //   530: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lg : Ljava/util/Map;
    //   533: aload #5
    //   535: iconst_0
    //   536: anewarray java/lang/Object
    //   539: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   542: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   547: checkcast java/lang/Integer
    //   550: invokevirtual intValue : ()I
    //   553: if_icmple -> 568
    //   556: goto -> 563
    //   559: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   562: athrow
    //   563: return
    //   564: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   567: athrow
    //   568: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yV : Z
    //   571: aload #25
    //   573: ifnull -> 683
    //   576: ifeq -> 631
    //   579: goto -> 586
    //   582: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   585: athrow
    //   586: aload #6
    //   588: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   591: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   594: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   597: iconst_2
    //   598: aaload
    //   599: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   602: aload #25
    //   604: lload_2
    //   605: lconst_0
    //   606: lcmp
    //   607: iflt -> 685
    //   610: ifnull -> 683
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   619: athrow
    //   620: ifeq -> 631
    //   623: goto -> 630
    //   626: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   629: athrow
    //   630: return
    //   631: aload #6
    //   633: iconst_0
    //   634: anewarray java/lang/Object
    //   637: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   640: new java/lang/StringBuilder
    //   643: dup
    //   644: invokespecial <init> : ()V
    //   647: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   650: astore #56
    //   652: aload #56
    //   654: bipush #82
    //   656: aaload
    //   657: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   660: aload #5
    //   662: iconst_0
    //   663: anewarray java/lang/Object
    //   666: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   669: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   672: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   675: invokevirtual toString : ()Ljava/lang/String;
    //   678: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   683: aload #25
    //   685: lload_2
    //   686: lconst_0
    //   687: lcmp
    //   688: ifle -> 710
    //   691: ifnull -> 708
    //   694: ifeq -> 705
    //   697: goto -> 704
    //   700: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   703: athrow
    //   704: return
    //   705: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_C : Z
    //   708: aload #25
    //   710: ifnull -> 772
    //   713: ifeq -> 769
    //   716: goto -> 723
    //   719: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   722: athrow
    //   723: aload #6
    //   725: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   728: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   731: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   734: bipush #26
    //   736: aaload
    //   737: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   740: aload #25
    //   742: lload_2
    //   743: lconst_0
    //   744: lcmp
    //   745: ifle -> 774
    //   748: ifnull -> 772
    //   751: goto -> 758
    //   754: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   757: athrow
    //   758: ifeq -> 769
    //   761: goto -> 768
    //   764: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   767: athrow
    //   768: return
    //   769: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yx : Z
    //   772: aload #25
    //   774: ifnull -> 845
    //   777: ifeq -> 842
    //   780: goto -> 787
    //   783: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   786: athrow
    //   787: aload #6
    //   789: iconst_0
    //   790: anewarray java/lang/Object
    //   793: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   796: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   801: invokevirtual toString : ()Ljava/lang/String;
    //   804: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   807: bipush #97
    //   809: aaload
    //   810: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   813: aload #25
    //   815: lload_2
    //   816: lconst_0
    //   817: lcmp
    //   818: iflt -> 847
    //   821: ifnull -> 845
    //   824: goto -> 831
    //   827: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   830: athrow
    //   831: ifeq -> 842
    //   834: goto -> 841
    //   837: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   840: athrow
    //   841: return
    //   842: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GO : Z
    //   845: aload #25
    //   847: ifnull -> 906
    //   850: ifeq -> 903
    //   853: goto -> 860
    //   856: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   859: athrow
    //   860: aload #6
    //   862: iconst_0
    //   863: anewarray java/lang/Object
    //   866: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   869: invokeinterface getName : ()Ljava/lang/String;
    //   874: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Mp : Ljava/lang/String;
    //   877: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   880: aload #25
    //   882: ifnull -> 906
    //   885: goto -> 892
    //   888: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   891: athrow
    //   892: ifeq -> 903
    //   895: goto -> 902
    //   898: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   901: athrow
    //   902: return
    //   903: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L_ : Z
    //   906: ifne -> 912
    //   909: goto -> 971
    //   912: new me/frep/vulcan/api/event/VulcanFlagEvent
    //   915: dup
    //   916: aload #6
    //   918: iconst_0
    //   919: anewarray java/lang/Object
    //   922: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   925: aload #5
    //   927: aload #4
    //   929: invokespecial <init> : (Lorg/bukkit/entity/Player;Lme/frep/vulcan/api/check/Check;Ljava/lang/String;)V
    //   932: astore #26
    //   934: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   937: aload #26
    //   939: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   944: aload #26
    //   946: invokevirtual isCancelled : ()Z
    //   949: aload #25
    //   951: lload_2
    //   952: lconst_0
    //   953: lcmp
    //   954: iflt -> 991
    //   957: ifnull -> 989
    //   960: ifeq -> 971
    //   963: goto -> 970
    //   966: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   969: athrow
    //   970: return
    //   971: aload #5
    //   973: invokevirtual getCategory : ()Ljava/lang/String;
    //   976: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   979: astore #56
    //   981: aload #56
    //   983: bipush #58
    //   985: aaload
    //   986: invokevirtual equals : (Ljava/lang/Object;)Z
    //   989: aload #25
    //   991: ifnull -> 1053
    //   994: ifeq -> 1036
    //   997: goto -> 1004
    //   1000: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1003: athrow
    //   1004: aload #6
    //   1006: iconst_0
    //   1007: anewarray java/lang/Object
    //   1010: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1013: iconst_0
    //   1014: iconst_1
    //   1015: anewarray java/lang/Object
    //   1018: dup_x1
    //   1019: swap
    //   1020: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1023: iconst_0
    //   1024: swap
    //   1025: aastore
    //   1026: invokevirtual Vulcan_MG : ([Ljava/lang/Object;)V
    //   1029: goto -> 1036
    //   1032: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1035: athrow
    //   1036: aload #5
    //   1038: aload #5
    //   1040: invokevirtual getVl : ()I
    //   1043: iconst_1
    //   1044: iadd
    //   1045: invokevirtual setVl : (I)V
    //   1048: aload #5
    //   1050: invokevirtual getVl : ()I
    //   1053: istore #26
    //   1055: aload #5
    //   1057: invokevirtual isExperimental : ()Z
    //   1060: aload #25
    //   1062: ifnull -> 1821
    //   1065: ifne -> 1798
    //   1068: goto -> 1075
    //   1071: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1074: athrow
    //   1075: aload #5
    //   1077: invokevirtual isPunishable : ()Z
    //   1080: aload #25
    //   1082: ifnull -> 1821
    //   1085: goto -> 1092
    //   1088: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1091: athrow
    //   1092: ifeq -> 1798
    //   1095: goto -> 1102
    //   1098: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1101: athrow
    //   1102: aload #5
    //   1104: invokevirtual getName : ()Ljava/lang/String;
    //   1107: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1110: bipush #43
    //   1112: aaload
    //   1113: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1116: aload #25
    //   1118: lload_2
    //   1119: lconst_0
    //   1120: lcmp
    //   1121: ifle -> 1195
    //   1124: ifnull -> 1193
    //   1127: goto -> 1134
    //   1130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1133: athrow
    //   1134: ifne -> 1175
    //   1137: goto -> 1144
    //   1140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1143: athrow
    //   1144: aload #6
    //   1146: aload #6
    //   1148: invokevirtual getTotalViolations : ()I
    //   1151: iconst_1
    //   1152: iadd
    //   1153: iconst_1
    //   1154: anewarray java/lang/Object
    //   1157: dup_x1
    //   1158: swap
    //   1159: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1162: iconst_0
    //   1163: swap
    //   1164: aastore
    //   1165: invokevirtual Vulcan__ : ([Ljava/lang/Object;)V
    //   1168: goto -> 1175
    //   1171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1174: athrow
    //   1175: aload #5
    //   1177: invokevirtual getName : ()Ljava/lang/String;
    //   1180: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1183: astore #56
    //   1185: aload #56
    //   1187: bipush #61
    //   1189: aaload
    //   1190: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1193: aload #25
    //   1195: lload_2
    //   1196: lconst_0
    //   1197: lcmp
    //   1198: iflt -> 1271
    //   1201: ifnull -> 1263
    //   1204: ifeq -> 1245
    //   1207: goto -> 1214
    //   1210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1213: athrow
    //   1214: aload #6
    //   1216: aload #6
    //   1218: invokevirtual getTimerViolations : ()I
    //   1221: iconst_1
    //   1222: iadd
    //   1223: iconst_1
    //   1224: anewarray java/lang/Object
    //   1227: dup_x1
    //   1228: swap
    //   1229: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1232: iconst_0
    //   1233: swap
    //   1234: aastore
    //   1235: invokevirtual Vulcan_d : ([Ljava/lang/Object;)V
    //   1238: goto -> 1245
    //   1241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1244: athrow
    //   1245: aload #5
    //   1247: invokevirtual getName : ()Ljava/lang/String;
    //   1250: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1253: astore #56
    //   1255: aload #56
    //   1257: bipush #84
    //   1259: aaload
    //   1260: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1263: lload_2
    //   1264: lconst_0
    //   1265: lcmp
    //   1266: iflt -> 1347
    //   1269: aload #25
    //   1271: ifnull -> 1347
    //   1274: ifeq -> 1315
    //   1277: goto -> 1284
    //   1280: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1283: athrow
    //   1284: aload #6
    //   1286: aload #6
    //   1288: invokevirtual getAutoClickerViolations : ()I
    //   1291: iconst_1
    //   1292: iadd
    //   1293: iconst_1
    //   1294: anewarray java/lang/Object
    //   1297: dup_x1
    //   1298: swap
    //   1299: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1302: iconst_0
    //   1303: swap
    //   1304: aastore
    //   1305: invokevirtual Vulcan_V : ([Ljava/lang/Object;)V
    //   1308: goto -> 1315
    //   1311: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1314: athrow
    //   1315: aload #5
    //   1317: invokevirtual getName : ()Ljava/lang/String;
    //   1320: aload #25
    //   1322: lload_2
    //   1323: lconst_0
    //   1324: lcmp
    //   1325: iflt -> 1337
    //   1328: ifnull -> 1386
    //   1331: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1334: bipush #15
    //   1336: aaload
    //   1337: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1340: goto -> 1347
    //   1343: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1346: athrow
    //   1347: ifeq -> 1381
    //   1350: aload #6
    //   1352: aload #6
    //   1354: invokevirtual getScaffoldViolations : ()I
    //   1357: iconst_1
    //   1358: iadd
    //   1359: iconst_1
    //   1360: anewarray java/lang/Object
    //   1363: dup_x1
    //   1364: swap
    //   1365: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1368: iconst_0
    //   1369: swap
    //   1370: aastore
    //   1371: invokevirtual Vulcan_r : ([Ljava/lang/Object;)V
    //   1374: goto -> 1381
    //   1377: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1380: athrow
    //   1381: aload #5
    //   1383: invokevirtual getCategory : ()Ljava/lang/String;
    //   1386: astore #27
    //   1388: iconst_m1
    //   1389: istore #28
    //   1391: aload #27
    //   1393: invokevirtual hashCode : ()I
    //   1396: aload #25
    //   1398: ifnull -> 1578
    //   1401: lookupswitch default -> 1576, -1354825996 -> 1440, -985752863 -> 1534, -103677777 -> 1487
    //   1436: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1439: athrow
    //   1440: aload #27
    //   1442: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1445: bipush #31
    //   1447: aaload
    //   1448: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1451: aload #25
    //   1453: ifnull -> 1578
    //   1456: goto -> 1463
    //   1459: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1462: athrow
    //   1463: ifeq -> 1576
    //   1466: goto -> 1473
    //   1469: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1472: athrow
    //   1473: iconst_0
    //   1474: istore #28
    //   1476: aload #25
    //   1478: lload_2
    //   1479: lconst_0
    //   1480: lcmp
    //   1481: ifle -> 1489
    //   1484: ifnonnull -> 1576
    //   1487: aload #27
    //   1489: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1492: bipush #69
    //   1494: aaload
    //   1495: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1498: aload #25
    //   1500: ifnull -> 1578
    //   1503: goto -> 1510
    //   1506: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1509: athrow
    //   1510: ifeq -> 1576
    //   1513: goto -> 1520
    //   1516: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1519: athrow
    //   1520: iconst_1
    //   1521: istore #28
    //   1523: aload #25
    //   1525: lload_2
    //   1526: lconst_0
    //   1527: lcmp
    //   1528: ifle -> 1536
    //   1531: ifnonnull -> 1576
    //   1534: aload #27
    //   1536: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1539: bipush #24
    //   1541: aaload
    //   1542: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1545: aload #25
    //   1547: lload_2
    //   1548: lconst_0
    //   1549: lcmp
    //   1550: ifle -> 1580
    //   1553: ifnull -> 1578
    //   1556: goto -> 1563
    //   1559: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1562: athrow
    //   1563: ifeq -> 1576
    //   1566: goto -> 1573
    //   1569: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1572: athrow
    //   1573: iconst_2
    //   1574: istore #28
    //   1576: iload #28
    //   1578: aload #25
    //   1580: ifnull -> 1821
    //   1583: tableswitch default -> 1798, 0 -> 1612, 1 -> 1689, 2 -> 1731
    //   1608: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1611: athrow
    //   1612: aload #5
    //   1614: invokevirtual getName : ()Ljava/lang/String;
    //   1617: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1620: iconst_1
    //   1621: aaload
    //   1622: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1625: aload #25
    //   1627: ifnull -> 1821
    //   1630: goto -> 1637
    //   1633: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1636: athrow
    //   1637: ifne -> 1798
    //   1640: goto -> 1647
    //   1643: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1646: athrow
    //   1647: aload #6
    //   1649: aload #6
    //   1651: invokevirtual getCombatViolations : ()I
    //   1654: iconst_1
    //   1655: iadd
    //   1656: iconst_1
    //   1657: anewarray java/lang/Object
    //   1660: dup_x1
    //   1661: swap
    //   1662: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1665: iconst_0
    //   1666: swap
    //   1667: aastore
    //   1668: invokevirtual Vulcan_I : ([Ljava/lang/Object;)V
    //   1671: aload #25
    //   1673: lload_2
    //   1674: lconst_0
    //   1675: lcmp
    //   1676: ifle -> 1815
    //   1679: ifnonnull -> 1798
    //   1682: goto -> 1689
    //   1685: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1688: athrow
    //   1689: aload #6
    //   1691: aload #6
    //   1693: invokevirtual getMovementViolations : ()I
    //   1696: iconst_1
    //   1697: iadd
    //   1698: iconst_1
    //   1699: anewarray java/lang/Object
    //   1702: dup_x1
    //   1703: swap
    //   1704: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1707: iconst_0
    //   1708: swap
    //   1709: aastore
    //   1710: invokevirtual Vulcan_b : ([Ljava/lang/Object;)V
    //   1713: aload #25
    //   1715: lload_2
    //   1716: lconst_0
    //   1717: lcmp
    //   1718: ifle -> 1815
    //   1721: ifnonnull -> 1798
    //   1724: goto -> 1731
    //   1727: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1730: athrow
    //   1731: aload #5
    //   1733: invokevirtual getName : ()Ljava/lang/String;
    //   1736: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1739: bipush #61
    //   1741: aaload
    //   1742: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   1745: aload #25
    //   1747: ifnull -> 1821
    //   1750: goto -> 1757
    //   1753: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1756: athrow
    //   1757: ifne -> 1798
    //   1760: goto -> 1767
    //   1763: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1766: athrow
    //   1767: aload #6
    //   1769: aload #6
    //   1771: invokevirtual getPlayerViolations : ()I
    //   1774: iconst_1
    //   1775: iadd
    //   1776: iconst_1
    //   1777: anewarray java/lang/Object
    //   1780: dup_x1
    //   1781: swap
    //   1782: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1785: iconst_0
    //   1786: swap
    //   1787: aastore
    //   1788: invokevirtual Vulcan_O : ([Ljava/lang/Object;)V
    //   1791: goto -> 1798
    //   1794: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1797: athrow
    //   1798: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dW : Ljava/util/Map;
    //   1801: aload #5
    //   1803: iconst_0
    //   1804: anewarray java/lang/Object
    //   1807: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1810: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1815: checkcast java/lang/Integer
    //   1818: invokevirtual intValue : ()I
    //   1821: istore #27
    //   1823: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lz : Ljava/util/Map;
    //   1826: aload #5
    //   1828: iconst_0
    //   1829: anewarray java/lang/Object
    //   1832: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1835: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1840: checkcast java/lang/Integer
    //   1843: invokevirtual intValue : ()I
    //   1846: istore #28
    //   1848: aload #6
    //   1850: invokevirtual getTotalViolations : ()I
    //   1853: istore #29
    //   1855: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dS : Ljava/util/Map;
    //   1858: aload #5
    //   1860: iconst_0
    //   1861: anewarray java/lang/Object
    //   1864: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1867: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1872: checkcast java/lang/Integer
    //   1875: invokevirtual intValue : ()I
    //   1878: istore #30
    //   1880: iload #26
    //   1882: iload #27
    //   1884: irem
    //   1885: aload #25
    //   1887: ifnull -> 6078
    //   1890: ifne -> 6055
    //   1893: goto -> 1900
    //   1896: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1899: athrow
    //   1900: iload #26
    //   1902: aload #25
    //   1904: ifnull -> 6078
    //   1907: goto -> 1914
    //   1910: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1913: athrow
    //   1914: iload #28
    //   1916: if_icmplt -> 6055
    //   1919: goto -> 1926
    //   1922: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1925: athrow
    //   1926: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lh : Z
    //   1929: ifne -> 1946
    //   1932: goto -> 1939
    //   1935: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1938: athrow
    //   1939: goto -> 1968
    //   1942: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1945: athrow
    //   1946: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   1949: invokevirtual Vulcan_F : ()Ljava/util/concurrent/ExecutorService;
    //   1952: aload #5
    //   1954: aload #6
    //   1956: aload #4
    //   1958: <illegal opcode> run : (Lme/frep/vulcan/spigot/check/AbstractCheck;Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;)Ljava/lang/Runnable;
    //   1963: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   1968: aload #6
    //   1970: iconst_0
    //   1971: anewarray java/lang/Object
    //   1974: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1977: invokeinterface getName : ()Ljava/lang/String;
    //   1982: astore #31
    //   1984: aload #5
    //   1986: lload #15
    //   1988: iconst_1
    //   1989: anewarray java/lang/Object
    //   1992: dup_x2
    //   1993: dup_x2
    //   1994: pop
    //   1995: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1998: iconst_0
    //   1999: swap
    //   2000: aastore
    //   2001: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   2004: invokeinterface description : ()Ljava/lang/String;
    //   2009: astore #32
    //   2011: aload #5
    //   2013: lload #15
    //   2015: iconst_1
    //   2016: anewarray java/lang/Object
    //   2019: dup_x2
    //   2020: dup_x2
    //   2021: pop
    //   2022: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2025: iconst_0
    //   2026: swap
    //   2027: aastore
    //   2028: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   2031: invokeinterface name : ()Ljava/lang/String;
    //   2036: astore #33
    //   2038: aload #6
    //   2040: iconst_0
    //   2041: anewarray java/lang/Object
    //   2044: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2047: iconst_0
    //   2048: anewarray java/lang/Object
    //   2051: invokevirtual Vulcan_r : ([Ljava/lang/Object;)D
    //   2054: iconst_1
    //   2055: anewarray java/lang/Object
    //   2058: dup_x2
    //   2059: dup_x2
    //   2060: pop
    //   2061: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2064: iconst_0
    //   2065: swap
    //   2066: aastore
    //   2067: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2070: astore #34
    //   2072: aload #6
    //   2074: iconst_0
    //   2075: anewarray java/lang/Object
    //   2078: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2081: iconst_0
    //   2082: anewarray java/lang/Object
    //   2085: invokevirtual Vulcan_z : ([Ljava/lang/Object;)D
    //   2088: iconst_1
    //   2089: anewarray java/lang/Object
    //   2092: dup_x2
    //   2093: dup_x2
    //   2094: pop
    //   2095: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2098: iconst_0
    //   2099: swap
    //   2100: aastore
    //   2101: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2104: astore #35
    //   2106: aload #6
    //   2108: iconst_0
    //   2109: anewarray java/lang/Object
    //   2112: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2115: iconst_0
    //   2116: anewarray java/lang/Object
    //   2119: invokevirtual Vulcan_u : ([Ljava/lang/Object;)D
    //   2122: iconst_1
    //   2123: anewarray java/lang/Object
    //   2126: dup_x2
    //   2127: dup_x2
    //   2128: pop
    //   2129: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2132: iconst_0
    //   2133: swap
    //   2134: aastore
    //   2135: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2138: astore #36
    //   2140: aload #6
    //   2142: iconst_0
    //   2143: anewarray java/lang/Object
    //   2146: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2149: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   2154: invokeinterface getName : ()Ljava/lang/String;
    //   2159: astore #37
    //   2161: aload #6
    //   2163: iconst_0
    //   2164: anewarray java/lang/Object
    //   2167: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2170: iconst_1
    //   2171: anewarray java/lang/Object
    //   2174: dup_x1
    //   2175: swap
    //   2176: iconst_0
    //   2177: swap
    //   2178: aastore
    //   2179: invokestatic Vulcan_X : ([Ljava/lang/Object;)I
    //   2182: invokestatic toString : (I)Ljava/lang/String;
    //   2185: astore #38
    //   2187: iconst_0
    //   2188: anewarray java/lang/Object
    //   2191: invokestatic Vulcan_S : ([Ljava/lang/Object;)D
    //   2194: iconst_1
    //   2195: anewarray java/lang/Object
    //   2198: dup_x2
    //   2199: dup_x2
    //   2200: pop
    //   2201: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2204: iconst_0
    //   2205: swap
    //   2206: aastore
    //   2207: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2210: astore #39
    //   2212: aload #5
    //   2214: invokevirtual getVl : ()I
    //   2217: invokestatic toString : (I)Ljava/lang/String;
    //   2220: astore #40
    //   2222: aload #6
    //   2224: invokevirtual getTotalViolations : ()I
    //   2227: invokestatic toString : (I)Ljava/lang/String;
    //   2230: astore #41
    //   2232: iload #30
    //   2234: invokestatic toString : (I)Ljava/lang/String;
    //   2237: astore #42
    //   2239: aload #6
    //   2241: iconst_0
    //   2242: anewarray java/lang/Object
    //   2245: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2248: lload #19
    //   2250: dup2_x1
    //   2251: pop2
    //   2252: iconst_2
    //   2253: anewarray java/lang/Object
    //   2256: dup_x1
    //   2257: swap
    //   2258: iconst_1
    //   2259: swap
    //   2260: aastore
    //   2261: dup_x2
    //   2262: dup_x2
    //   2263: pop
    //   2264: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2267: iconst_0
    //   2268: swap
    //   2269: aastore
    //   2270: invokestatic Vulcan_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2273: astore #43
    //   2275: aload #6
    //   2277: iconst_0
    //   2278: anewarray java/lang/Object
    //   2281: invokevirtual Vulcan_v : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XR;
    //   2284: iconst_0
    //   2285: anewarray java/lang/Object
    //   2288: invokevirtual Vulcan_W : ([Ljava/lang/Object;)D
    //   2291: iconst_1
    //   2292: anewarray java/lang/Object
    //   2295: dup_x2
    //   2296: dup_x2
    //   2297: pop
    //   2298: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2301: iconst_0
    //   2302: swap
    //   2303: aastore
    //   2304: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2307: astore #44
    //   2309: aload #5
    //   2311: lload #15
    //   2313: iconst_1
    //   2314: anewarray java/lang/Object
    //   2317: dup_x2
    //   2318: dup_x2
    //   2319: pop
    //   2320: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2323: iconst_0
    //   2324: swap
    //   2325: aastore
    //   2326: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   2329: invokeinterface experimental : ()Z
    //   2334: ifeq -> 2370
    //   2337: lload #7
    //   2339: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Go : Ljava/lang/String;
    //   2342: iconst_2
    //   2343: anewarray java/lang/Object
    //   2346: dup_x1
    //   2347: swap
    //   2348: iconst_1
    //   2349: swap
    //   2350: aastore
    //   2351: dup_x2
    //   2352: dup_x2
    //   2353: pop
    //   2354: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2357: iconst_0
    //   2358: swap
    //   2359: aastore
    //   2360: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2363: goto -> 2373
    //   2366: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2369: athrow
    //   2370: ldc_w ''
    //   2373: astore #45
    //   2375: iconst_1
    //   2376: istore #46
    //   2378: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_i : Z
    //   2381: lload_2
    //   2382: lconst_0
    //   2383: lcmp
    //   2384: iflt -> 2683
    //   2387: aload #25
    //   2389: ifnull -> 2683
    //   2392: ifeq -> 2674
    //   2395: goto -> 2402
    //   2398: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2401: athrow
    //   2402: iload #26
    //   2404: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_S : I
    //   2407: aload #25
    //   2409: lload_2
    //   2410: lconst_0
    //   2411: lcmp
    //   2412: ifle -> 2445
    //   2415: ifnull -> 2443
    //   2418: goto -> 2425
    //   2421: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2424: athrow
    //   2425: if_icmplt -> 2438
    //   2428: goto -> 2435
    //   2431: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2434: athrow
    //   2435: iconst_2
    //   2436: istore #46
    //   2438: iload #26
    //   2440: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_J : I
    //   2443: aload #25
    //   2445: lload_2
    //   2446: lconst_0
    //   2447: lcmp
    //   2448: iflt -> 2474
    //   2451: ifnull -> 2472
    //   2454: if_icmplt -> 2467
    //   2457: goto -> 2464
    //   2460: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2463: athrow
    //   2464: iconst_3
    //   2465: istore #46
    //   2467: iload #26
    //   2469: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lc : I
    //   2472: aload #25
    //   2474: lload_2
    //   2475: lconst_0
    //   2476: lcmp
    //   2477: iflt -> 2503
    //   2480: ifnull -> 2501
    //   2483: if_icmplt -> 2496
    //   2486: goto -> 2493
    //   2489: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2492: athrow
    //   2493: iconst_4
    //   2494: istore #46
    //   2496: iload #26
    //   2498: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_LH : I
    //   2501: aload #25
    //   2503: lload_2
    //   2504: lconst_0
    //   2505: lcmp
    //   2506: ifle -> 2532
    //   2509: ifnull -> 2530
    //   2512: if_icmplt -> 2525
    //   2515: goto -> 2522
    //   2518: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2521: athrow
    //   2522: iconst_5
    //   2523: istore #46
    //   2525: iload #26
    //   2527: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dK : I
    //   2530: aload #25
    //   2532: lload_2
    //   2533: lconst_0
    //   2534: lcmp
    //   2535: ifle -> 2562
    //   2538: ifnull -> 2560
    //   2541: if_icmplt -> 2555
    //   2544: goto -> 2551
    //   2547: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2550: athrow
    //   2551: bipush #6
    //   2553: istore #46
    //   2555: iload #26
    //   2557: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yn : I
    //   2560: aload #25
    //   2562: lload_2
    //   2563: lconst_0
    //   2564: lcmp
    //   2565: ifle -> 2592
    //   2568: ifnull -> 2590
    //   2571: if_icmplt -> 2585
    //   2574: goto -> 2581
    //   2577: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2580: athrow
    //   2581: bipush #7
    //   2583: istore #46
    //   2585: iload #26
    //   2587: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GY : I
    //   2590: aload #25
    //   2592: lload_2
    //   2593: lconst_0
    //   2594: lcmp
    //   2595: ifle -> 2622
    //   2598: ifnull -> 2620
    //   2601: if_icmplt -> 2615
    //   2604: goto -> 2611
    //   2607: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2610: athrow
    //   2611: bipush #8
    //   2613: istore #46
    //   2615: iload #26
    //   2617: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_y9 : I
    //   2620: aload #25
    //   2622: ifnull -> 2656
    //   2625: if_icmplt -> 2639
    //   2628: goto -> 2635
    //   2631: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2634: athrow
    //   2635: bipush #9
    //   2637: istore #46
    //   2639: iload #26
    //   2641: aload #25
    //   2643: ifnull -> 2937
    //   2646: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_M3 : I
    //   2649: goto -> 2656
    //   2652: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2655: athrow
    //   2656: if_icmplt -> 2935
    //   2659: bipush #10
    //   2661: lload_2
    //   2662: lconst_0
    //   2663: lcmp
    //   2664: iflt -> 2676
    //   2667: istore #46
    //   2669: aload #25
    //   2671: ifnonnull -> 2935
    //   2674: iload #29
    //   2676: goto -> 2683
    //   2679: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2682: athrow
    //   2683: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_S : I
    //   2686: aload #25
    //   2688: lload_2
    //   2689: lconst_0
    //   2690: lcmp
    //   2691: iflt -> 2717
    //   2694: ifnull -> 2715
    //   2697: if_icmplt -> 2710
    //   2700: goto -> 2707
    //   2703: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2706: athrow
    //   2707: iconst_2
    //   2708: istore #46
    //   2710: iload #29
    //   2712: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_J : I
    //   2715: aload #25
    //   2717: lload_2
    //   2718: lconst_0
    //   2719: lcmp
    //   2720: iflt -> 2746
    //   2723: ifnull -> 2744
    //   2726: if_icmplt -> 2739
    //   2729: goto -> 2736
    //   2732: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2735: athrow
    //   2736: iconst_3
    //   2737: istore #46
    //   2739: iload #29
    //   2741: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lc : I
    //   2744: aload #25
    //   2746: lload_2
    //   2747: lconst_0
    //   2748: lcmp
    //   2749: ifle -> 2775
    //   2752: ifnull -> 2773
    //   2755: if_icmplt -> 2768
    //   2758: goto -> 2765
    //   2761: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2764: athrow
    //   2765: iconst_4
    //   2766: istore #46
    //   2768: iload #29
    //   2770: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_LH : I
    //   2773: aload #25
    //   2775: lload_2
    //   2776: lconst_0
    //   2777: lcmp
    //   2778: ifle -> 2804
    //   2781: ifnull -> 2802
    //   2784: if_icmplt -> 2797
    //   2787: goto -> 2794
    //   2790: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2793: athrow
    //   2794: iconst_5
    //   2795: istore #46
    //   2797: iload #29
    //   2799: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dK : I
    //   2802: aload #25
    //   2804: lload_2
    //   2805: lconst_0
    //   2806: lcmp
    //   2807: iflt -> 2834
    //   2810: ifnull -> 2832
    //   2813: if_icmplt -> 2827
    //   2816: goto -> 2823
    //   2819: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2822: athrow
    //   2823: bipush #6
    //   2825: istore #46
    //   2827: iload #29
    //   2829: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yn : I
    //   2832: aload #25
    //   2834: lload_2
    //   2835: lconst_0
    //   2836: lcmp
    //   2837: ifle -> 2864
    //   2840: ifnull -> 2862
    //   2843: if_icmplt -> 2857
    //   2846: goto -> 2853
    //   2849: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2852: athrow
    //   2853: bipush #7
    //   2855: istore #46
    //   2857: iload #29
    //   2859: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GY : I
    //   2862: aload #25
    //   2864: lload_2
    //   2865: lconst_0
    //   2866: lcmp
    //   2867: iflt -> 2894
    //   2870: ifnull -> 2892
    //   2873: if_icmplt -> 2887
    //   2876: goto -> 2883
    //   2879: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2882: athrow
    //   2883: bipush #8
    //   2885: istore #46
    //   2887: iload #29
    //   2889: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_y9 : I
    //   2892: aload #25
    //   2894: ifnull -> 2928
    //   2897: if_icmplt -> 2911
    //   2900: goto -> 2907
    //   2903: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2906: athrow
    //   2907: bipush #9
    //   2909: istore #46
    //   2911: iload #29
    //   2913: aload #25
    //   2915: ifnull -> 2937
    //   2918: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_M3 : I
    //   2921: goto -> 2928
    //   2924: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2927: athrow
    //   2928: if_icmplt -> 2935
    //   2931: bipush #10
    //   2933: istore #46
    //   2935: iload #46
    //   2937: istore #47
    //   2939: aload_0
    //   2940: aload #6
    //   2942: iconst_0
    //   2943: anewarray java/lang/Object
    //   2946: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2949: new java/lang/StringBuilder
    //   2952: dup
    //   2953: invokespecial <init> : ()V
    //   2956: aload #5
    //   2958: invokevirtual getDisplayName : ()Ljava/lang/String;
    //   2961: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2964: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2967: bipush #8
    //   2969: aaload
    //   2970: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2973: aload #5
    //   2975: invokevirtual getDisplayType : ()C
    //   2978: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2981: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2984: bipush #92
    //   2986: aaload
    //   2987: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2990: aload #40
    //   2992: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2995: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2998: bipush #92
    //   3000: aaload
    //   3001: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3004: aload #31
    //   3006: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3009: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3012: bipush #92
    //   3014: aaload
    //   3015: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3018: aload #42
    //   3020: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3023: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3026: bipush #92
    //   3028: aaload
    //   3029: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3032: aload #43
    //   3034: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3037: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3040: bipush #92
    //   3042: aaload
    //   3043: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3046: aload #39
    //   3048: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3051: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3054: bipush #92
    //   3056: aaload
    //   3057: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3060: aload #38
    //   3062: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3065: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3068: bipush #92
    //   3070: aaload
    //   3071: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3074: aload #32
    //   3076: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3079: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3082: bipush #92
    //   3084: aaload
    //   3085: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3088: aload #4
    //   3090: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3093: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3096: bipush #92
    //   3098: aaload
    //   3099: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3102: aload #45
    //   3104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3107: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3110: bipush #92
    //   3112: aaload
    //   3113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3116: aload_0
    //   3117: iload #47
    //   3119: lload #17
    //   3121: iconst_2
    //   3122: anewarray java/lang/Object
    //   3125: dup_x2
    //   3126: dup_x2
    //   3127: pop
    //   3128: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3131: iconst_1
    //   3132: swap
    //   3133: aastore
    //   3134: dup_x1
    //   3135: swap
    //   3136: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3139: iconst_0
    //   3140: swap
    //   3141: aastore
    //   3142: invokespecial Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   3145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3148: invokevirtual toString : ()Ljava/lang/String;
    //   3151: lload #21
    //   3153: iconst_3
    //   3154: anewarray java/lang/Object
    //   3157: dup_x2
    //   3158: dup_x2
    //   3159: pop
    //   3160: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3163: iconst_2
    //   3164: swap
    //   3165: aastore
    //   3166: dup_x1
    //   3167: swap
    //   3168: iconst_1
    //   3169: swap
    //   3170: aastore
    //   3171: dup_x1
    //   3172: swap
    //   3173: iconst_0
    //   3174: swap
    //   3175: aastore
    //   3176: invokespecial Vulcan_V : ([Ljava/lang/Object;)V
    //   3179: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lq : Z
    //   3182: aload #25
    //   3184: lload_2
    //   3185: lconst_0
    //   3186: lcmp
    //   3187: ifle -> 3220
    //   3190: ifnull -> 3212
    //   3193: ifne -> 3209
    //   3196: goto -> 3203
    //   3199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3202: athrow
    //   3203: lload_2
    //   3204: lconst_0
    //   3205: lcmp
    //   3206: ifge -> 3819
    //   3209: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L2 : Z
    //   3212: lload_2
    //   3213: lconst_0
    //   3214: lcmp
    //   3215: ifle -> 3235
    //   3218: aload #25
    //   3220: ifnull -> 3235
    //   3223: ifeq -> 3262
    //   3226: goto -> 3233
    //   3229: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3232: athrow
    //   3233: iload #26
    //   3235: iload #30
    //   3237: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_M4 : I
    //   3240: iadd
    //   3241: if_icmple -> 3262
    //   3244: lload_2
    //   3245: lconst_0
    //   3246: lcmp
    //   3247: iflt -> 3819
    //   3250: aload #25
    //   3252: ifnonnull -> 3819
    //   3255: goto -> 3262
    //   3258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3261: athrow
    //   3262: lload #7
    //   3264: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_d8 : Ljava/lang/String;
    //   3267: iconst_2
    //   3268: anewarray java/lang/Object
    //   3271: dup_x1
    //   3272: swap
    //   3273: iconst_1
    //   3274: swap
    //   3275: aastore
    //   3276: dup_x2
    //   3277: dup_x2
    //   3278: pop
    //   3279: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3282: iconst_0
    //   3283: swap
    //   3284: aastore
    //   3285: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   3288: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3291: bipush #89
    //   3293: aaload
    //   3294: aload #31
    //   3296: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3299: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3302: bipush #81
    //   3304: aaload
    //   3305: aload #42
    //   3307: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3310: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3313: bipush #52
    //   3315: aaload
    //   3316: aload #33
    //   3318: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3321: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3324: bipush #28
    //   3326: aaload
    //   3327: aload #4
    //   3329: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3332: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3335: bipush #49
    //   3337: aaload
    //   3338: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   3341: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3344: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3347: bipush #60
    //   3349: aaload
    //   3350: aload #44
    //   3352: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3355: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3358: bipush #65
    //   3360: aaload
    //   3361: aload #5
    //   3363: invokevirtual getCategory : ()Ljava/lang/String;
    //   3366: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   3369: lload #9
    //   3371: dup2_x1
    //   3372: pop2
    //   3373: iconst_2
    //   3374: anewarray java/lang/Object
    //   3377: dup_x1
    //   3378: swap
    //   3379: iconst_1
    //   3380: swap
    //   3381: aastore
    //   3382: dup_x2
    //   3383: dup_x2
    //   3384: pop
    //   3385: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3388: iconst_0
    //   3389: swap
    //   3390: aastore
    //   3391: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   3394: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3397: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3400: bipush #76
    //   3402: aaload
    //   3403: aload #5
    //   3405: lload #15
    //   3407: iconst_1
    //   3408: anewarray java/lang/Object
    //   3411: dup_x2
    //   3412: dup_x2
    //   3413: pop
    //   3414: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3417: iconst_0
    //   3418: swap
    //   3419: aastore
    //   3420: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   3423: invokeinterface complexType : ()Ljava/lang/String;
    //   3428: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3431: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3434: bipush #73
    //   3436: aaload
    //   3437: aload #6
    //   3439: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   3442: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3445: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3448: bipush #74
    //   3450: aaload
    //   3451: aload #34
    //   3453: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3456: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3459: bipush #50
    //   3461: aaload
    //   3462: aload #35
    //   3464: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3467: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3470: bipush #77
    //   3472: aaload
    //   3473: aload #6
    //   3475: iconst_0
    //   3476: anewarray java/lang/Object
    //   3479: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3482: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   3487: invokevirtual toString : ()Ljava/lang/String;
    //   3490: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3493: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3496: bipush #13
    //   3498: aaload
    //   3499: aload #6
    //   3501: iconst_0
    //   3502: anewarray java/lang/Object
    //   3505: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   3508: iconst_0
    //   3509: anewarray java/lang/Object
    //   3512: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3515: aload #25
    //   3517: ifnull -> 3566
    //   3520: goto -> 3527
    //   3523: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3526: athrow
    //   3527: ifnonnull -> 3550
    //   3530: goto -> 3537
    //   3533: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3536: athrow
    //   3537: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3540: bipush #95
    //   3542: aaload
    //   3543: goto -> 3571
    //   3546: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3549: athrow
    //   3550: aload #6
    //   3552: iconst_0
    //   3553: anewarray java/lang/Object
    //   3556: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   3559: iconst_0
    //   3560: anewarray java/lang/Object
    //   3563: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3566: invokeinterface getName : ()Ljava/lang/String;
    //   3571: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3574: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3577: bipush #44
    //   3579: aaload
    //   3580: aload #36
    //   3582: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3585: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3588: bipush #9
    //   3590: aaload
    //   3591: aload #37
    //   3593: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3596: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3599: bipush #32
    //   3601: aaload
    //   3602: aload #41
    //   3604: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3607: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3610: bipush #62
    //   3612: aaload
    //   3613: aload #38
    //   3615: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3618: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3621: bipush #30
    //   3623: aaload
    //   3624: aload #32
    //   3626: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3629: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3632: bipush #94
    //   3634: aaload
    //   3635: aload #39
    //   3637: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3640: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3643: bipush #19
    //   3645: aaload
    //   3646: lload_2
    //   3647: lconst_0
    //   3648: lcmp
    //   3649: ifle -> 3668
    //   3652: aload #43
    //   3654: aload #25
    //   3656: ifnull -> 3736
    //   3659: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3662: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3665: bipush #12
    //   3667: aaload
    //   3668: aload #5
    //   3670: lload #15
    //   3672: iconst_1
    //   3673: anewarray java/lang/Object
    //   3676: dup_x2
    //   3677: dup_x2
    //   3678: pop
    //   3679: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3682: iconst_0
    //   3683: swap
    //   3684: aastore
    //   3685: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   3688: invokeinterface experimental : ()Z
    //   3693: ifeq -> 3739
    //   3696: goto -> 3703
    //   3699: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3702: athrow
    //   3703: lload #7
    //   3705: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Go : Ljava/lang/String;
    //   3708: iconst_2
    //   3709: anewarray java/lang/Object
    //   3712: dup_x1
    //   3713: swap
    //   3714: iconst_1
    //   3715: swap
    //   3716: aastore
    //   3717: dup_x2
    //   3718: dup_x2
    //   3719: pop
    //   3720: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3723: iconst_0
    //   3724: swap
    //   3725: aastore
    //   3726: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   3729: goto -> 3736
    //   3732: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3735: athrow
    //   3736: goto -> 3742
    //   3739: ldc_w ''
    //   3742: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3745: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3748: astore #56
    //   3750: aload #56
    //   3752: bipush #55
    //   3754: aaload
    //   3755: aload #40
    //   3757: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3760: aload #56
    //   3762: bipush #39
    //   3764: aaload
    //   3765: aload #5
    //   3767: lload #15
    //   3769: iconst_1
    //   3770: anewarray java/lang/Object
    //   3773: dup_x2
    //   3774: dup_x2
    //   3775: pop
    //   3776: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3779: iconst_0
    //   3780: swap
    //   3781: aastore
    //   3782: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   3785: invokeinterface type : ()C
    //   3790: invokestatic toString : (C)Ljava/lang/String;
    //   3793: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3796: lload #23
    //   3798: iconst_2
    //   3799: anewarray java/lang/Object
    //   3802: dup_x2
    //   3803: dup_x2
    //   3804: pop
    //   3805: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3808: iconst_1
    //   3809: swap
    //   3810: aastore
    //   3811: dup_x1
    //   3812: swap
    //   3813: iconst_0
    //   3814: swap
    //   3815: aastore
    //   3816: invokestatic Vulcan_F : ([Ljava/lang/Object;)V
    //   3819: aload_0
    //   3820: getfield Vulcan_j : Ljava/util/Set;
    //   3823: invokeinterface isEmpty : ()Z
    //   3828: aload #25
    //   3830: lload_2
    //   3831: lconst_0
    //   3832: lcmp
    //   3833: ifle -> 3866
    //   3836: ifnull -> 3858
    //   3839: ifeq -> 3855
    //   3842: goto -> 3849
    //   3845: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3848: athrow
    //   3849: lload_2
    //   3850: lconst_0
    //   3851: lcmp
    //   3852: ifgt -> 5785
    //   3855: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L2 : Z
    //   3858: lload_2
    //   3859: lconst_0
    //   3860: lcmp
    //   3861: ifle -> 3881
    //   3864: aload #25
    //   3866: ifnull -> 3881
    //   3869: ifeq -> 3902
    //   3872: goto -> 3879
    //   3875: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3878: athrow
    //   3879: iload #26
    //   3881: iload #30
    //   3883: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_M4 : I
    //   3886: iadd
    //   3887: if_icmple -> 3902
    //   3890: aload #25
    //   3892: ifnonnull -> 5785
    //   3895: goto -> 3902
    //   3898: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3901: athrow
    //   3902: lload #7
    //   3904: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dp : Ljava/lang/String;
    //   3907: iconst_2
    //   3908: anewarray java/lang/Object
    //   3911: dup_x1
    //   3912: swap
    //   3913: iconst_1
    //   3914: swap
    //   3915: aastore
    //   3916: dup_x2
    //   3917: dup_x2
    //   3918: pop
    //   3919: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3922: iconst_0
    //   3923: swap
    //   3924: aastore
    //   3925: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   3928: astore #48
    //   3930: lload_2
    //   3931: lconst_0
    //   3932: lcmp
    //   3933: ifle -> 3961
    //   3936: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   3939: invokevirtual Vulcan_x : ()Z
    //   3942: ifeq -> 3961
    //   3945: aload #6
    //   3947: iconst_0
    //   3948: anewarray java/lang/Object
    //   3951: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3954: aload #48
    //   3956: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   3959: astore #48
    //   3961: new net/md_5/bungee/api/chat/TextComponent
    //   3964: dup
    //   3965: lload #7
    //   3967: aload #48
    //   3969: iconst_2
    //   3970: anewarray java/lang/Object
    //   3973: dup_x1
    //   3974: swap
    //   3975: iconst_1
    //   3976: swap
    //   3977: aastore
    //   3978: dup_x2
    //   3979: dup_x2
    //   3980: pop
    //   3981: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3984: iconst_0
    //   3985: swap
    //   3986: aastore
    //   3987: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   3990: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   3993: bipush #89
    //   3995: aaload
    //   3996: aload #31
    //   3998: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4001: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4004: bipush #62
    //   4006: aaload
    //   4007: aload #38
    //   4009: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4012: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4015: bipush #94
    //   4017: aaload
    //   4018: aload #39
    //   4020: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4023: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4026: bipush #81
    //   4028: aaload
    //   4029: aload #42
    //   4031: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4034: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4037: bipush #40
    //   4039: aaload
    //   4040: aload_0
    //   4041: iload #47
    //   4043: lload #17
    //   4045: iconst_2
    //   4046: anewarray java/lang/Object
    //   4049: dup_x2
    //   4050: dup_x2
    //   4051: pop
    //   4052: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4055: iconst_1
    //   4056: swap
    //   4057: aastore
    //   4058: dup_x1
    //   4059: swap
    //   4060: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4063: iconst_0
    //   4064: swap
    //   4065: aastore
    //   4066: invokespecial Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   4069: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4072: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4075: bipush #73
    //   4077: aaload
    //   4078: aload #6
    //   4080: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   4083: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4086: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4089: bipush #28
    //   4091: aaload
    //   4092: aload #4
    //   4094: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4097: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4100: bipush #60
    //   4102: aaload
    //   4103: aload #44
    //   4105: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4108: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4111: bipush #49
    //   4113: aaload
    //   4114: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   4117: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4120: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4123: bipush #65
    //   4125: aaload
    //   4126: aload #5
    //   4128: invokevirtual getCategory : ()Ljava/lang/String;
    //   4131: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   4134: lload #9
    //   4136: dup2_x1
    //   4137: pop2
    //   4138: iconst_2
    //   4139: anewarray java/lang/Object
    //   4142: dup_x1
    //   4143: swap
    //   4144: iconst_1
    //   4145: swap
    //   4146: aastore
    //   4147: dup_x2
    //   4148: dup_x2
    //   4149: pop
    //   4150: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4153: iconst_0
    //   4154: swap
    //   4155: aastore
    //   4156: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   4159: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4162: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4165: bipush #76
    //   4167: aaload
    //   4168: aload #5
    //   4170: lload #15
    //   4172: iconst_1
    //   4173: anewarray java/lang/Object
    //   4176: dup_x2
    //   4177: dup_x2
    //   4178: pop
    //   4179: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4182: iconst_0
    //   4183: swap
    //   4184: aastore
    //   4185: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   4188: invokeinterface complexType : ()Ljava/lang/String;
    //   4193: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4196: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4199: bipush #74
    //   4201: aaload
    //   4202: aload #34
    //   4204: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4207: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4210: bipush #50
    //   4212: aaload
    //   4213: aload #35
    //   4215: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4218: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4221: bipush #44
    //   4223: aaload
    //   4224: aload #36
    //   4226: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4229: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4232: bipush #77
    //   4234: aaload
    //   4235: aload #6
    //   4237: iconst_0
    //   4238: anewarray java/lang/Object
    //   4241: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4244: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   4249: invokevirtual toString : ()Ljava/lang/String;
    //   4252: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4255: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4258: bipush #13
    //   4260: aaload
    //   4261: aload #6
    //   4263: iconst_0
    //   4264: anewarray java/lang/Object
    //   4267: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   4270: iconst_0
    //   4271: anewarray java/lang/Object
    //   4274: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4277: ifnonnull -> 4293
    //   4280: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4283: bipush #95
    //   4285: aaload
    //   4286: goto -> 4314
    //   4289: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4292: athrow
    //   4293: aload #6
    //   4295: iconst_0
    //   4296: anewarray java/lang/Object
    //   4299: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   4302: iconst_0
    //   4303: anewarray java/lang/Object
    //   4306: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4309: invokeinterface getName : ()Ljava/lang/String;
    //   4314: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4317: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4320: astore #56
    //   4322: aload #56
    //   4324: bipush #9
    //   4326: aaload
    //   4327: aload #37
    //   4329: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4332: aload #56
    //   4334: bipush #32
    //   4336: aaload
    //   4337: aload #41
    //   4339: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4342: aload #56
    //   4344: bipush #52
    //   4346: aaload
    //   4347: aload #5
    //   4349: lload #15
    //   4351: iconst_1
    //   4352: anewarray java/lang/Object
    //   4355: dup_x2
    //   4356: dup_x2
    //   4357: pop
    //   4358: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4361: iconst_0
    //   4362: swap
    //   4363: aastore
    //   4364: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   4367: invokeinterface name : ()Ljava/lang/String;
    //   4372: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4375: aload #56
    //   4377: bipush #30
    //   4379: aaload
    //   4380: aload #5
    //   4382: lload #15
    //   4384: iconst_1
    //   4385: anewarray java/lang/Object
    //   4388: dup_x2
    //   4389: dup_x2
    //   4390: pop
    //   4391: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4394: iconst_0
    //   4395: swap
    //   4396: aastore
    //   4397: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   4400: invokeinterface description : ()Ljava/lang/String;
    //   4405: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4408: aload #56
    //   4410: bipush #19
    //   4412: aaload
    //   4413: aload #43
    //   4415: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4418: aload #56
    //   4420: bipush #12
    //   4422: aaload
    //   4423: aload #5
    //   4425: lload #15
    //   4427: iconst_1
    //   4428: anewarray java/lang/Object
    //   4431: dup_x2
    //   4432: dup_x2
    //   4433: pop
    //   4434: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4437: iconst_0
    //   4438: swap
    //   4439: aastore
    //   4440: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   4443: invokeinterface experimental : ()Z
    //   4448: ifeq -> 4480
    //   4451: lload #7
    //   4453: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Go : Ljava/lang/String;
    //   4456: iconst_2
    //   4457: anewarray java/lang/Object
    //   4460: dup_x1
    //   4461: swap
    //   4462: iconst_1
    //   4463: swap
    //   4464: aastore
    //   4465: dup_x2
    //   4466: dup_x2
    //   4467: pop
    //   4468: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4471: iconst_0
    //   4472: swap
    //   4473: aastore
    //   4474: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   4477: goto -> 4483
    //   4480: ldc_w ''
    //   4483: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4486: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4489: astore #56
    //   4491: aload #56
    //   4493: bipush #55
    //   4495: aaload
    //   4496: aload #40
    //   4498: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4501: aload #56
    //   4503: bipush #39
    //   4505: aaload
    //   4506: aload #5
    //   4508: lload #15
    //   4510: iconst_1
    //   4511: anewarray java/lang/Object
    //   4514: dup_x2
    //   4515: dup_x2
    //   4516: pop
    //   4517: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4520: iconst_0
    //   4521: swap
    //   4522: aastore
    //   4523: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   4526: invokeinterface type : ()C
    //   4531: invokestatic toString : (C)Ljava/lang/String;
    //   4534: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4537: invokestatic fromLegacyText : (Ljava/lang/String;)[Lnet/md_5/bungee/api/chat/BaseComponent;
    //   4540: invokespecial <init> : ([Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   4543: astore #49
    //   4545: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G_ : Ljava/util/List;
    //   4548: invokeinterface iterator : ()Ljava/util/Iterator;
    //   4553: astore #50
    //   4555: aload #50
    //   4557: invokeinterface hasNext : ()Z
    //   4562: ifeq -> 4672
    //   4565: aload #50
    //   4567: invokeinterface next : ()Ljava/lang/Object;
    //   4572: checkcast java/lang/String
    //   4575: astore #51
    //   4577: aload #49
    //   4579: new net/md_5/bungee/api/chat/ClickEvent
    //   4582: dup
    //   4583: getstatic net/md_5/bungee/api/chat/ClickEvent$Action.RUN_COMMAND : Lnet/md_5/bungee/api/chat/ClickEvent$Action;
    //   4586: aload #51
    //   4588: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4591: bipush #89
    //   4593: aaload
    //   4594: aload #6
    //   4596: iconst_0
    //   4597: anewarray java/lang/Object
    //   4600: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4603: invokeinterface getName : ()Ljava/lang/String;
    //   4608: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4611: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4614: bipush #77
    //   4616: aaload
    //   4617: aload #6
    //   4619: iconst_0
    //   4620: anewarray java/lang/Object
    //   4623: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4626: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   4631: invokevirtual toString : ()Ljava/lang/String;
    //   4634: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4637: invokespecial <init> : (Lnet/md_5/bungee/api/chat/ClickEvent$Action;Ljava/lang/String;)V
    //   4640: invokevirtual setClickEvent : (Lnet/md_5/bungee/api/chat/ClickEvent;)V
    //   4643: lload_2
    //   4644: lconst_0
    //   4645: lcmp
    //   4646: iflt -> 5785
    //   4649: aload #25
    //   4651: ifnull -> 5785
    //   4654: aload #25
    //   4656: ifnonnull -> 4555
    //   4659: lload_2
    //   4660: lconst_0
    //   4661: lcmp
    //   4662: iflt -> 4643
    //   4665: goto -> 4672
    //   4668: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4671: athrow
    //   4672: new java/lang/StringBuilder
    //   4675: dup
    //   4676: invokespecial <init> : ()V
    //   4679: astore #50
    //   4681: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_d9 : Ljava/util/List;
    //   4684: invokeinterface size : ()I
    //   4689: istore #51
    //   4691: iconst_1
    //   4692: istore #52
    //   4694: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_d9 : Ljava/util/List;
    //   4697: invokeinterface iterator : ()Ljava/util/Iterator;
    //   4702: astore #53
    //   4704: aload #53
    //   4706: invokeinterface hasNext : ()Z
    //   4711: ifeq -> 4824
    //   4714: aload #53
    //   4716: invokeinterface next : ()Ljava/lang/Object;
    //   4721: checkcast java/lang/String
    //   4724: astore #54
    //   4726: aload #25
    //   4728: lload_2
    //   4729: lconst_0
    //   4730: lcmp
    //   4731: iflt -> 4786
    //   4734: ifnull -> 4784
    //   4737: iload #52
    //   4739: iload #51
    //   4741: lload_2
    //   4742: lconst_0
    //   4743: lcmp
    //   4744: ifle -> 6260
    //   4747: aload #25
    //   4749: ifnull -> 6260
    //   4752: goto -> 4759
    //   4755: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4758: athrow
    //   4759: if_icmpne -> 4795
    //   4762: goto -> 4769
    //   4765: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4768: athrow
    //   4769: aload #50
    //   4771: aload #54
    //   4773: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4776: pop
    //   4777: goto -> 4784
    //   4780: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4783: athrow
    //   4784: aload #25
    //   4786: lload_2
    //   4787: lconst_0
    //   4788: lcmp
    //   4789: ifle -> 4821
    //   4792: ifnonnull -> 4816
    //   4795: aload #50
    //   4797: aload #54
    //   4799: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4802: ldc_w '\\n'
    //   4805: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4808: pop
    //   4809: goto -> 4816
    //   4812: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   4815: athrow
    //   4816: iinc #52, 1
    //   4819: aload #25
    //   4821: ifnonnull -> 4704
    //   4824: aload #50
    //   4826: invokevirtual toString : ()Ljava/lang/String;
    //   4829: lload #7
    //   4831: dup2_x1
    //   4832: pop2
    //   4833: iconst_2
    //   4834: anewarray java/lang/Object
    //   4837: dup_x1
    //   4838: swap
    //   4839: iconst_1
    //   4840: swap
    //   4841: aastore
    //   4842: dup_x2
    //   4843: dup_x2
    //   4844: pop
    //   4845: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4848: iconst_0
    //   4849: swap
    //   4850: aastore
    //   4851: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   4854: astore #53
    //   4856: lload_2
    //   4857: lconst_0
    //   4858: lcmp
    //   4859: iflt -> 4893
    //   4862: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   4865: invokevirtual Vulcan_x : ()Z
    //   4868: lload_2
    //   4869: lconst_0
    //   4870: lcmp
    //   4871: ifle -> 6277
    //   4874: ifeq -> 4893
    //   4877: aload #6
    //   4879: iconst_0
    //   4880: anewarray java/lang/Object
    //   4883: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4886: aload #53
    //   4888: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   4891: astore #53
    //   4893: aload #53
    //   4895: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4898: bipush #89
    //   4900: aaload
    //   4901: aload #31
    //   4903: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4906: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4909: bipush #52
    //   4911: aaload
    //   4912: aload #33
    //   4914: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4917: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4920: bipush #81
    //   4922: aaload
    //   4923: aload #42
    //   4925: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4928: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4931: bipush #49
    //   4933: aaload
    //   4934: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   4937: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4940: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4943: bipush #73
    //   4945: aaload
    //   4946: aload #6
    //   4948: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   4951: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4954: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4957: bipush #33
    //   4959: aaload
    //   4960: aload_0
    //   4961: iload #47
    //   4963: lload #17
    //   4965: iconst_2
    //   4966: anewarray java/lang/Object
    //   4969: dup_x2
    //   4970: dup_x2
    //   4971: pop
    //   4972: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4975: iconst_1
    //   4976: swap
    //   4977: aastore
    //   4978: dup_x1
    //   4979: swap
    //   4980: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4983: iconst_0
    //   4984: swap
    //   4985: aastore
    //   4986: invokespecial Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   4989: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4992: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   4995: bipush #74
    //   4997: aaload
    //   4998: aload #34
    //   5000: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5003: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5006: bipush #50
    //   5008: aaload
    //   5009: aload #35
    //   5011: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5014: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5017: bipush #77
    //   5019: aaload
    //   5020: aload #6
    //   5022: iconst_0
    //   5023: anewarray java/lang/Object
    //   5026: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   5029: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   5034: invokevirtual toString : ()Ljava/lang/String;
    //   5037: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5040: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5043: bipush #65
    //   5045: aaload
    //   5046: aload #5
    //   5048: invokevirtual getCategory : ()Ljava/lang/String;
    //   5051: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   5054: lload #9
    //   5056: dup2_x1
    //   5057: pop2
    //   5058: iconst_2
    //   5059: anewarray java/lang/Object
    //   5062: dup_x1
    //   5063: swap
    //   5064: iconst_1
    //   5065: swap
    //   5066: aastore
    //   5067: dup_x2
    //   5068: dup_x2
    //   5069: pop
    //   5070: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5073: iconst_0
    //   5074: swap
    //   5075: aastore
    //   5076: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   5079: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5082: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5085: bipush #44
    //   5087: aaload
    //   5088: aload #36
    //   5090: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5093: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5096: bipush #9
    //   5098: aaload
    //   5099: aload #37
    //   5101: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5104: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5107: bipush #55
    //   5109: aaload
    //   5110: aload #40
    //   5112: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5115: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5118: bipush #27
    //   5120: aaload
    //   5121: aload #6
    //   5123: invokevirtual getCombatViolations : ()I
    //   5126: invokestatic toString : (I)Ljava/lang/String;
    //   5129: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5132: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5135: bipush #22
    //   5137: aaload
    //   5138: aload #6
    //   5140: invokevirtual getMovementViolations : ()I
    //   5143: invokestatic toString : (I)Ljava/lang/String;
    //   5146: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5149: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5152: bipush #86
    //   5154: aaload
    //   5155: aload #6
    //   5157: invokevirtual getPlayerViolations : ()I
    //   5160: invokestatic toString : (I)Ljava/lang/String;
    //   5163: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5166: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5169: bipush #60
    //   5171: aaload
    //   5172: aload #44
    //   5174: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5177: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5180: bipush #76
    //   5182: aaload
    //   5183: aload #5
    //   5185: lload #15
    //   5187: iconst_1
    //   5188: anewarray java/lang/Object
    //   5191: dup_x2
    //   5192: dup_x2
    //   5193: pop
    //   5194: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5197: iconst_0
    //   5198: swap
    //   5199: aastore
    //   5200: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   5203: invokeinterface complexType : ()Ljava/lang/String;
    //   5208: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5211: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5214: bipush #19
    //   5216: aaload
    //   5217: aload #43
    //   5219: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5222: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5225: bipush #32
    //   5227: aaload
    //   5228: aload #41
    //   5230: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5233: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5236: bipush #62
    //   5238: aaload
    //   5239: aload #38
    //   5241: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5244: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5247: bipush #13
    //   5249: aaload
    //   5250: aload #6
    //   5252: iconst_0
    //   5253: anewarray java/lang/Object
    //   5256: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   5259: iconst_0
    //   5260: anewarray java/lang/Object
    //   5263: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   5266: aload #25
    //   5268: ifnull -> 5310
    //   5271: ifnonnull -> 5294
    //   5274: goto -> 5281
    //   5277: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5280: athrow
    //   5281: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5284: bipush #95
    //   5286: aaload
    //   5287: goto -> 5315
    //   5290: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5293: athrow
    //   5294: aload #6
    //   5296: iconst_0
    //   5297: anewarray java/lang/Object
    //   5300: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   5303: iconst_0
    //   5304: anewarray java/lang/Object
    //   5307: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   5310: invokeinterface getName : ()Ljava/lang/String;
    //   5315: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5318: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5321: bipush #30
    //   5323: aaload
    //   5324: lload_2
    //   5325: lconst_0
    //   5326: lcmp
    //   5327: ifle -> 5346
    //   5330: aload #32
    //   5332: aload #25
    //   5334: ifnull -> 5414
    //   5337: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5340: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5343: bipush #12
    //   5345: aaload
    //   5346: aload #5
    //   5348: lload #15
    //   5350: iconst_1
    //   5351: anewarray java/lang/Object
    //   5354: dup_x2
    //   5355: dup_x2
    //   5356: pop
    //   5357: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5360: iconst_0
    //   5361: swap
    //   5362: aastore
    //   5363: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   5366: invokeinterface experimental : ()Z
    //   5371: ifeq -> 5417
    //   5374: goto -> 5381
    //   5377: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5380: athrow
    //   5381: lload #7
    //   5383: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Go : Ljava/lang/String;
    //   5386: iconst_2
    //   5387: anewarray java/lang/Object
    //   5390: dup_x1
    //   5391: swap
    //   5392: iconst_1
    //   5393: swap
    //   5394: aastore
    //   5395: dup_x2
    //   5396: dup_x2
    //   5397: pop
    //   5398: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5401: iconst_0
    //   5402: swap
    //   5403: aastore
    //   5404: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   5407: goto -> 5414
    //   5410: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5413: athrow
    //   5414: goto -> 5420
    //   5417: ldc_w ''
    //   5420: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5423: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5426: astore #56
    //   5428: aload #56
    //   5430: bipush #39
    //   5432: aaload
    //   5433: aload #5
    //   5435: lload #15
    //   5437: iconst_1
    //   5438: anewarray java/lang/Object
    //   5441: dup_x2
    //   5442: dup_x2
    //   5443: pop
    //   5444: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5447: iconst_0
    //   5448: swap
    //   5449: aastore
    //   5450: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   5453: invokeinterface type : ()C
    //   5458: invokestatic toString : (C)Ljava/lang/String;
    //   5461: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5464: aload #56
    //   5466: bipush #94
    //   5468: aaload
    //   5469: aload #39
    //   5471: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5474: aload #56
    //   5476: bipush #28
    //   5478: aaload
    //   5479: aload #4
    //   5481: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5484: aload #56
    //   5486: bipush #52
    //   5488: aaload
    //   5489: aload #5
    //   5491: lload #15
    //   5493: iconst_1
    //   5494: anewarray java/lang/Object
    //   5497: dup_x2
    //   5498: dup_x2
    //   5499: pop
    //   5500: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5503: iconst_0
    //   5504: swap
    //   5505: aastore
    //   5506: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   5509: invokeinterface name : ()Ljava/lang/String;
    //   5514: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5517: lload #7
    //   5519: dup2_x1
    //   5520: pop2
    //   5521: iconst_2
    //   5522: anewarray java/lang/Object
    //   5525: dup_x1
    //   5526: swap
    //   5527: iconst_1
    //   5528: swap
    //   5529: aastore
    //   5530: dup_x2
    //   5531: dup_x2
    //   5532: pop
    //   5533: invokestatic valueOf : (J)Ljava/lang/Long;
    //   5536: iconst_0
    //   5537: swap
    //   5538: aastore
    //   5539: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   5542: astore #54
    //   5544: aload #25
    //   5546: lload_2
    //   5547: lconst_0
    //   5548: lcmp
    //   5549: ifle -> 5607
    //   5552: ifnull -> 5599
    //   5555: iconst_0
    //   5556: anewarray java/lang/Object
    //   5559: invokestatic Vulcan_f : ([Ljava/lang/Object;)Z
    //   5562: ifeq -> 5610
    //   5565: goto -> 5572
    //   5568: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5571: athrow
    //   5572: aload #49
    //   5574: new net/md_5/bungee/api/chat/HoverEvent
    //   5577: dup
    //   5578: getstatic net/md_5/bungee/api/chat/HoverEvent$Action.SHOW_TEXT : Lnet/md_5/bungee/api/chat/HoverEvent$Action;
    //   5581: aload #54
    //   5583: invokestatic fromLegacyText : (Ljava/lang/String;)[Lnet/md_5/bungee/api/chat/BaseComponent;
    //   5586: invokespecial <init> : (Lnet/md_5/bungee/api/chat/HoverEvent$Action;[Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   5589: invokevirtual setHoverEvent : (Lnet/md_5/bungee/api/chat/HoverEvent;)V
    //   5592: goto -> 5599
    //   5595: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5598: athrow
    //   5599: lload_2
    //   5600: lconst_0
    //   5601: lcmp
    //   5602: ifle -> 5644
    //   5605: aload #25
    //   5607: ifnonnull -> 5644
    //   5610: aload #49
    //   5612: new net/md_5/bungee/api/chat/HoverEvent
    //   5615: dup
    //   5616: getstatic net/md_5/bungee/api/chat/HoverEvent$Action.SHOW_TEXT : Lnet/md_5/bungee/api/chat/HoverEvent$Action;
    //   5619: new net/md_5/bungee/api/chat/ComponentBuilder
    //   5622: dup
    //   5623: aload #54
    //   5625: invokespecial <init> : (Ljava/lang/String;)V
    //   5628: invokevirtual create : ()[Lnet/md_5/bungee/api/chat/BaseComponent;
    //   5631: invokespecial <init> : (Lnet/md_5/bungee/api/chat/HoverEvent$Action;[Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   5634: invokevirtual setHoverEvent : (Lnet/md_5/bungee/api/chat/HoverEvent;)V
    //   5637: goto -> 5644
    //   5640: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5643: athrow
    //   5644: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L_ : Z
    //   5647: ifne -> 5657
    //   5650: goto -> 5721
    //   5653: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5656: athrow
    //   5657: new me/frep/vulcan/api/event/VulcanPostFlagEvent
    //   5660: dup
    //   5661: aload #6
    //   5663: iconst_0
    //   5664: anewarray java/lang/Object
    //   5667: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   5670: aload #5
    //   5672: aload #4
    //   5674: invokespecial <init> : (Lorg/bukkit/entity/Player;Lme/frep/vulcan/api/check/Check;Ljava/lang/String;)V
    //   5677: astore #55
    //   5679: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   5682: aload #55
    //   5684: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   5689: aload #55
    //   5691: invokevirtual isCancelled : ()Z
    //   5694: lload_2
    //   5695: lconst_0
    //   5696: lcmp
    //   5697: ifle -> 5724
    //   5700: aload #25
    //   5702: ifnull -> 5724
    //   5705: ifeq -> 5721
    //   5708: goto -> 5715
    //   5711: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5714: athrow
    //   5715: lload_2
    //   5716: lconst_0
    //   5717: lcmp
    //   5718: ifge -> 5785
    //   5721: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MQ : Z
    //   5724: ifeq -> 5755
    //   5727: aload_0
    //   5728: getfield Vulcan_j : Ljava/util/Set;
    //   5731: aload #49
    //   5733: <illegal opcode> accept : (Lnet/md_5/bungee/api/chat/TextComponent;)Ljava/util/function/Consumer;
    //   5738: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   5743: aload #25
    //   5745: ifnonnull -> 5785
    //   5748: goto -> 5755
    //   5751: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5754: athrow
    //   5755: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   5758: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   5761: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   5764: aload_0
    //   5765: aload #49
    //   5767: <illegal opcode> run : (Lme/frep/vulcan/spigot/Vulcan_XP;Lnet/md_5/bungee/api/chat/TextComponent;)Ljava/lang/Runnable;
    //   5772: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   5777: pop
    //   5778: goto -> 5785
    //   5781: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5784: athrow
    //   5785: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Ml : Ljava/util/List;
    //   5788: invokeinterface isEmpty : ()Z
    //   5793: lload_2
    //   5794: lconst_0
    //   5795: lcmp
    //   5796: ifle -> 5826
    //   5799: aload #25
    //   5801: ifnull -> 5826
    //   5804: ifeq -> 5820
    //   5807: goto -> 5814
    //   5810: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5813: athrow
    //   5814: lload_2
    //   5815: lconst_0
    //   5816: lcmp
    //   5817: ifgt -> 5950
    //   5820: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   5823: invokevirtual Vulcan_x : ()Z
    //   5826: ifeq -> 5895
    //   5829: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   5832: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   5835: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   5838: aload #6
    //   5840: aload #31
    //   5842: aload #42
    //   5844: aload #5
    //   5846: aload #4
    //   5848: aload #38
    //   5850: aload #34
    //   5852: aload #35
    //   5854: aload #36
    //   5856: aload #44
    //   5858: aload #37
    //   5860: aload #39
    //   5862: aload #43
    //   5864: aload #40
    //   5866: <illegal opcode> run : (Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Ljava/lang/String;Lme/frep/vulcan/spigot/check/AbstractCheck;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;
    //   5871: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   5876: pop
    //   5877: lload_2
    //   5878: lconst_0
    //   5879: lcmp
    //   5880: ifle -> 5950
    //   5883: aload #25
    //   5885: ifnonnull -> 5950
    //   5888: goto -> 5895
    //   5891: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5894: athrow
    //   5895: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   5898: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   5901: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   5904: aload #31
    //   5906: aload #42
    //   5908: aload #6
    //   5910: aload #4
    //   5912: aload #5
    //   5914: aload #38
    //   5916: aload #34
    //   5918: aload #35
    //   5920: aload #36
    //   5922: aload #44
    //   5924: aload #37
    //   5926: aload #39
    //   5928: aload #43
    //   5930: aload #40
    //   5932: <illegal opcode> run : (Ljava/lang/String;Ljava/lang/String;Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Lme/frep/vulcan/spigot/check/AbstractCheck;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;
    //   5937: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   5942: pop
    //   5943: goto -> 5950
    //   5946: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5949: athrow
    //   5950: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yC : Z
    //   5953: aload #25
    //   5955: lload_2
    //   5956: lconst_0
    //   5957: lcmp
    //   5958: ifle -> 6080
    //   5961: ifnull -> 6078
    //   5964: ifeq -> 6055
    //   5967: goto -> 5974
    //   5970: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5973: athrow
    //   5974: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Mw : Ljava/lang/String;
    //   5977: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   5980: bipush #101
    //   5982: aaload
    //   5983: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   5986: ifeq -> 6003
    //   5989: goto -> 5996
    //   5992: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   5995: athrow
    //   5996: goto -> 6055
    //   5999: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6002: athrow
    //   6003: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   6006: invokevirtual Vulcan_V : ()Ljava/util/concurrent/ExecutorService;
    //   6009: aload #5
    //   6011: iload #26
    //   6013: aload #6
    //   6015: aload #31
    //   6017: aload #33
    //   6019: aload #42
    //   6021: aload #34
    //   6023: aload #35
    //   6025: aload #36
    //   6027: aload #37
    //   6029: aload #40
    //   6031: aload #44
    //   6033: aload #43
    //   6035: aload #41
    //   6037: aload #38
    //   6039: aload #32
    //   6041: aload #39
    //   6043: aload #4
    //   6045: <illegal opcode> run : (Lme/frep/vulcan/spigot/check/AbstractCheck;ILme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;
    //   6050: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   6055: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Q : Ljava/util/Map;
    //   6058: aload #5
    //   6060: iconst_0
    //   6061: anewarray java/lang/Object
    //   6064: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   6067: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6072: checkcast java/lang/Boolean
    //   6075: invokevirtual booleanValue : ()Z
    //   6078: aload #25
    //   6080: lload_2
    //   6081: lconst_0
    //   6082: lcmp
    //   6083: ifle -> 6133
    //   6086: ifnull -> 6131
    //   6089: ifeq -> 6332
    //   6092: goto -> 6099
    //   6095: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6098: athrow
    //   6099: aload #5
    //   6101: lload #15
    //   6103: iconst_1
    //   6104: anewarray java/lang/Object
    //   6107: dup_x2
    //   6108: dup_x2
    //   6109: pop
    //   6110: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6113: iconst_0
    //   6114: swap
    //   6115: aastore
    //   6116: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   6119: invokeinterface experimental : ()Z
    //   6124: goto -> 6131
    //   6127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6130: athrow
    //   6131: aload #25
    //   6133: lload_2
    //   6134: lconst_0
    //   6135: lcmp
    //   6136: iflt -> 6157
    //   6139: ifnull -> 6155
    //   6142: ifne -> 6332
    //   6145: goto -> 6152
    //   6148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6151: athrow
    //   6152: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yA : Z
    //   6155: aload #25
    //   6157: ifnull -> 6240
    //   6160: ifeq -> 6238
    //   6163: goto -> 6170
    //   6166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6169: athrow
    //   6170: aload #6
    //   6172: iconst_0
    //   6173: anewarray java/lang/Object
    //   6176: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   6179: lload #11
    //   6181: dup2_x1
    //   6182: pop2
    //   6183: iconst_2
    //   6184: anewarray java/lang/Object
    //   6187: dup_x1
    //   6188: swap
    //   6189: iconst_1
    //   6190: swap
    //   6191: aastore
    //   6192: dup_x2
    //   6193: dup_x2
    //   6194: pop
    //   6195: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6198: iconst_0
    //   6199: swap
    //   6200: aastore
    //   6201: invokestatic Vulcan_T : ([Ljava/lang/Object;)Z
    //   6204: aload #25
    //   6206: lload_2
    //   6207: lconst_0
    //   6208: lcmp
    //   6209: iflt -> 6248
    //   6212: ifnull -> 6240
    //   6215: goto -> 6222
    //   6218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6221: athrow
    //   6222: ifeq -> 6238
    //   6225: goto -> 6232
    //   6228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6231: athrow
    //   6232: lload_2
    //   6233: lconst_0
    //   6234: lcmp
    //   6235: ifgt -> 6332
    //   6238: iload #26
    //   6240: lload_2
    //   6241: lconst_0
    //   6242: lcmp
    //   6243: ifle -> 6284
    //   6246: aload #25
    //   6248: ifnull -> 6284
    //   6251: iload #30
    //   6253: goto -> 6260
    //   6256: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6259: athrow
    //   6260: if_icmplt -> 6332
    //   6263: aload #6
    //   6265: iconst_0
    //   6266: anewarray java/lang/Object
    //   6269: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   6272: invokeinterface isOnline : ()Z
    //   6277: goto -> 6284
    //   6280: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6283: athrow
    //   6284: ifeq -> 6332
    //   6287: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   6290: invokevirtual Vulcan_r : ()Lme/frep/vulcan/spigot/Vulcan_KH;
    //   6293: aload #5
    //   6295: lload #13
    //   6297: aload #6
    //   6299: iconst_3
    //   6300: anewarray java/lang/Object
    //   6303: dup_x1
    //   6304: swap
    //   6305: iconst_2
    //   6306: swap
    //   6307: aastore
    //   6308: dup_x2
    //   6309: dup_x2
    //   6310: pop
    //   6311: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6314: iconst_1
    //   6315: swap
    //   6316: aastore
    //   6317: dup_x1
    //   6318: swap
    //   6319: iconst_0
    //   6320: swap
    //   6321: aastore
    //   6322: invokevirtual Vulcan_e : ([Ljava/lang/Object;)V
    //   6325: goto -> 6332
    //   6328: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   6331: athrow
    //   6332: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #84	-> 112
    //   #86	-> 134
    //   #88	-> 179
    //   #90	-> 219
    //   #92	-> 255
    //   #93	-> 342
    //   #95	-> 445
    //   #96	-> 498
    //   #98	-> 568
    //   #100	-> 631
    //   #102	-> 705
    //   #103	-> 769
    //   #104	-> 842
    //   #107	-> 903
    //   #109	-> 912
    //   #111	-> 934
    //   #113	-> 944
    //   #116	-> 971
    //   #118	-> 1036
    //   #120	-> 1048
    //   #122	-> 1055
    //   #123	-> 1102
    //   #124	-> 1175
    //   #126	-> 1245
    //   #127	-> 1315
    //   #129	-> 1381
    //   #131	-> 1612
    //   #134	-> 1689
    //   #135	-> 1713
    //   #137	-> 1731
    //   #142	-> 1798
    //   #143	-> 1823
    //   #144	-> 1848
    //   #145	-> 1855
    //   #147	-> 1880
    //   #149	-> 1926
    //   #151	-> 1946
    //   #154	-> 1968
    //   #156	-> 1984
    //   #157	-> 2011
    //   #159	-> 2038
    //   #160	-> 2072
    //   #161	-> 2106
    //   #162	-> 2140
    //   #164	-> 2161
    //   #165	-> 2187
    //   #167	-> 2212
    //   #168	-> 2222
    //   #169	-> 2232
    //   #171	-> 2239
    //   #173	-> 2275
    //   #175	-> 2309
    //   #177	-> 2375
    //   #179	-> 2378
    //   #180	-> 2402
    //   #181	-> 2438
    //   #182	-> 2467
    //   #183	-> 2496
    //   #184	-> 2525
    //   #185	-> 2555
    //   #186	-> 2585
    //   #187	-> 2615
    //   #188	-> 2639
    //   #190	-> 2674
    //   #191	-> 2710
    //   #192	-> 2739
    //   #193	-> 2768
    //   #194	-> 2797
    //   #195	-> 2827
    //   #196	-> 2857
    //   #197	-> 2887
    //   #198	-> 2911
    //   #202	-> 2935
    //   #204	-> 2939
    //   #205	-> 2975
    //   #215	-> 3119
    //   #204	-> 3151
    //   #218	-> 3179
    //   #220	-> 3209
    //   #221	-> 3244
    //   #223	-> 3262
    //   #224	-> 3296
    //   #225	-> 3307
    //   #226	-> 3318
    //   #227	-> 3329
    //   #228	-> 3341
    //   #229	-> 3352
    //   #230	-> 3363
    //   #231	-> 3405
    //   #232	-> 3439
    //   #233	-> 3453
    //   #234	-> 3464
    //   #235	-> 3475
    //   #236	-> 3499
    //   #237	-> 3582
    //   #238	-> 3593
    //   #239	-> 3604
    //   #240	-> 3615
    //   #241	-> 3626
    //   #242	-> 3637
    //   #243	-> 3654
    //   #244	-> 3668
    //   #245	-> 3757
    //   #246	-> 3767
    //   #223	-> 3796
    //   #250	-> 3819
    //   #252	-> 3855
    //   #253	-> 3890
    //   #255	-> 3902
    //   #257	-> 3930
    //   #258	-> 3945
    //   #261	-> 3961
    //   #262	-> 3969
    //   #263	-> 3998
    //   #264	-> 4009
    //   #265	-> 4020
    //   #266	-> 4031
    //   #267	-> 4043
    //   #268	-> 4080
    //   #269	-> 4094
    //   #270	-> 4105
    //   #271	-> 4117
    //   #272	-> 4128
    //   #273	-> 4170
    //   #274	-> 4204
    //   #275	-> 4215
    //   #276	-> 4226
    //   #277	-> 4237
    //   #278	-> 4261
    //   #279	-> 4329
    //   #280	-> 4339
    //   #281	-> 4349
    //   #282	-> 4382
    //   #283	-> 4415
    //   #284	-> 4423
    //   #285	-> 4498
    //   #286	-> 4508
    //   #262	-> 4537
    //   #288	-> 4545
    //   #289	-> 4577
    //   #290	-> 4596
    //   #291	-> 4619
    //   #289	-> 4640
    //   #292	-> 4643
    //   #294	-> 4672
    //   #295	-> 4681
    //   #296	-> 4691
    //   #298	-> 4694
    //   #299	-> 4726
    //   #300	-> 4769
    //   #302	-> 4795
    //   #304	-> 4816
    //   #305	-> 4819
    //   #307	-> 4824
    //   #309	-> 4856
    //   #310	-> 4877
    //   #313	-> 4893
    //   #314	-> 4903
    //   #315	-> 4914
    //   #316	-> 4925
    //   #317	-> 4937
    //   #318	-> 4948
    //   #319	-> 4963
    //   #320	-> 5000
    //   #321	-> 5011
    //   #322	-> 5022
    //   #323	-> 5048
    //   #324	-> 5090
    //   #325	-> 5101
    //   #326	-> 5112
    //   #327	-> 5123
    //   #328	-> 5140
    //   #329	-> 5157
    //   #330	-> 5174
    //   #331	-> 5185
    //   #332	-> 5219
    //   #333	-> 5230
    //   #334	-> 5241
    //   #335	-> 5250
    //   #336	-> 5332
    //   #337	-> 5346
    //   #338	-> 5435
    //   #339	-> 5471
    //   #340	-> 5481
    //   #341	-> 5491
    //   #313	-> 5521
    //   #343	-> 5544
    //   #344	-> 5572
    //   #346	-> 5610
    //   #350	-> 5644
    //   #352	-> 5657
    //   #354	-> 5679
    //   #356	-> 5689
    //   #359	-> 5721
    //   #360	-> 5727
    //   #362	-> 5755
    //   #368	-> 5785
    //   #370	-> 5820
    //   #371	-> 5829
    //   #397	-> 5895
    //   #425	-> 5950
    //   #427	-> 6003
    //   #579	-> 6055
    //   #580	-> 6172
    //   #582	-> 6238
    //   #583	-> 6287
    //   #586	-> 6332
    // Exception table:
    //   from	to	target	type
    //   112	126	129	java/lang/RuntimeException
    //   157	171	174	java/lang/RuntimeException
    //   197	211	214	java/lang/RuntimeException
    //   233	247	250	java/lang/RuntimeException
    //   258	266	269	java/lang/RuntimeException
    //   263	284	287	java/lang/RuntimeException
    //   273	294	297	java/lang/RuntimeException
    //   291	324	327	java/lang/RuntimeException
    //   301	334	337	java/lang/RuntimeException
    //   345	353	356	java/lang/RuntimeException
    //   350	371	374	java/lang/RuntimeException
    //   360	387	390	java/lang/RuntimeException
    //   378	427	430	java/lang/RuntimeException
    //   394	437	440	java/lang/RuntimeException
    //   476	490	493	java/lang/RuntimeException
    //   519	556	559	java/lang/RuntimeException
    //   530	564	564	java/lang/RuntimeException
    //   571	579	582	java/lang/RuntimeException
    //   576	613	616	java/lang/RuntimeException
    //   586	623	626	java/lang/RuntimeException
    //   683	697	700	java/lang/RuntimeException
    //   708	716	719	java/lang/RuntimeException
    //   713	751	754	java/lang/RuntimeException
    //   723	761	764	java/lang/RuntimeException
    //   772	780	783	java/lang/RuntimeException
    //   777	824	827	java/lang/RuntimeException
    //   787	834	837	java/lang/RuntimeException
    //   845	853	856	java/lang/RuntimeException
    //   850	885	888	java/lang/RuntimeException
    //   860	895	898	java/lang/RuntimeException
    //   934	963	966	java/lang/RuntimeException
    //   989	997	1000	java/lang/RuntimeException
    //   994	1029	1032	java/lang/RuntimeException
    //   1055	1068	1071	java/lang/RuntimeException
    //   1065	1085	1088	java/lang/RuntimeException
    //   1075	1095	1098	java/lang/RuntimeException
    //   1092	1127	1130	java/lang/RuntimeException
    //   1102	1137	1140	java/lang/RuntimeException
    //   1134	1168	1171	java/lang/RuntimeException
    //   1193	1207	1210	java/lang/RuntimeException
    //   1204	1238	1241	java/lang/RuntimeException
    //   1263	1277	1280	java/lang/RuntimeException
    //   1274	1308	1311	java/lang/RuntimeException
    //   1315	1340	1343	java/lang/RuntimeException
    //   1347	1374	1377	java/lang/RuntimeException
    //   1391	1436	1436	java/lang/RuntimeException
    //   1401	1456	1459	java/lang/RuntimeException
    //   1440	1466	1469	java/lang/RuntimeException
    //   1476	1503	1506	java/lang/RuntimeException
    //   1487	1513	1516	java/lang/RuntimeException
    //   1523	1556	1559	java/lang/RuntimeException
    //   1534	1566	1569	java/lang/RuntimeException
    //   1578	1608	1608	java/lang/RuntimeException
    //   1583	1630	1633	java/lang/RuntimeException
    //   1612	1640	1643	java/lang/RuntimeException
    //   1637	1682	1685	java/lang/RuntimeException
    //   1647	1724	1727	java/lang/RuntimeException
    //   1689	1750	1753	java/lang/RuntimeException
    //   1731	1760	1763	java/lang/RuntimeException
    //   1757	1791	1794	java/lang/RuntimeException
    //   1880	1893	1896	java/lang/RuntimeException
    //   1890	1907	1910	java/lang/RuntimeException
    //   1900	1919	1922	java/lang/RuntimeException
    //   1914	1932	1935	java/lang/RuntimeException
    //   1926	1942	1942	java/lang/RuntimeException
    //   2309	2366	2366	java/lang/RuntimeException
    //   2378	2395	2398	java/lang/RuntimeException
    //   2392	2418	2421	java/lang/RuntimeException
    //   2402	2428	2431	java/lang/RuntimeException
    //   2443	2457	2460	java/lang/RuntimeException
    //   2472	2486	2489	java/lang/RuntimeException
    //   2501	2515	2518	java/lang/RuntimeException
    //   2530	2544	2547	java/lang/RuntimeException
    //   2560	2574	2577	java/lang/RuntimeException
    //   2590	2604	2607	java/lang/RuntimeException
    //   2620	2628	2631	java/lang/RuntimeException
    //   2639	2649	2652	java/lang/RuntimeException
    //   2669	2676	2679	java/lang/RuntimeException
    //   2683	2700	2703	java/lang/RuntimeException
    //   2715	2729	2732	java/lang/RuntimeException
    //   2744	2758	2761	java/lang/RuntimeException
    //   2773	2787	2790	java/lang/RuntimeException
    //   2802	2816	2819	java/lang/RuntimeException
    //   2832	2846	2849	java/lang/RuntimeException
    //   2862	2876	2879	java/lang/RuntimeException
    //   2892	2900	2903	java/lang/RuntimeException
    //   2911	2921	2924	java/lang/RuntimeException
    //   2939	3196	3199	java/lang/RuntimeException
    //   3212	3226	3229	java/lang/RuntimeException
    //   3235	3255	3258	java/lang/RuntimeException
    //   3244	3520	3523	java/lang/RuntimeException
    //   3262	3530	3533	java/lang/RuntimeException
    //   3527	3546	3546	java/lang/RuntimeException
    //   3571	3696	3699	java/lang/RuntimeException
    //   3659	3729	3732	java/lang/RuntimeException
    //   3819	3842	3845	java/lang/RuntimeException
    //   3858	3872	3875	java/lang/RuntimeException
    //   3881	3895	3898	java/lang/RuntimeException
    //   3961	4289	4289	java/lang/RuntimeException
    //   4577	4659	4668	java/lang/RuntimeException
    //   4726	4752	4755	java/lang/RuntimeException
    //   4737	4762	4765	java/lang/RuntimeException
    //   4759	4777	4780	java/lang/RuntimeException
    //   4784	4809	4812	java/lang/RuntimeException
    //   4893	5274	5277	java/lang/RuntimeException
    //   5271	5290	5290	java/lang/RuntimeException
    //   5315	5374	5377	java/lang/RuntimeException
    //   5337	5407	5410	java/lang/RuntimeException
    //   5544	5565	5568	java/lang/RuntimeException
    //   5555	5592	5595	java/lang/RuntimeException
    //   5599	5637	5640	java/lang/RuntimeException
    //   5644	5653	5653	java/lang/RuntimeException
    //   5679	5708	5711	java/lang/RuntimeException
    //   5724	5748	5751	java/lang/RuntimeException
    //   5727	5778	5781	java/lang/RuntimeException
    //   5785	5807	5810	java/lang/RuntimeException
    //   5826	5888	5891	java/lang/RuntimeException
    //   5829	5943	5946	java/lang/RuntimeException
    //   5950	5967	5970	java/lang/RuntimeException
    //   5964	5989	5992	java/lang/RuntimeException
    //   5974	5999	5999	java/lang/RuntimeException
    //   6078	6092	6095	java/lang/RuntimeException
    //   6089	6124	6127	java/lang/RuntimeException
    //   6131	6145	6148	java/lang/RuntimeException
    //   6155	6163	6166	java/lang/RuntimeException
    //   6160	6215	6218	java/lang/RuntimeException
    //   6170	6225	6228	java/lang/RuntimeException
    //   6240	6253	6256	java/lang/RuntimeException
    //   6260	6277	6280	java/lang/RuntimeException
    //   6284	6325	6328	java/lang/RuntimeException
  }
  
  private static void lambda$handleAlert$2(AbstractCheck paramAbstractCheck, Vulcan_hu paramVulcan_hu, String paramString) {
    long l1 = a ^ 0x2E97E9E08B20L, l2 = l1 ^ 0x6AD125DD99EBL;
    (new Object[4])[3] = paramString;
    (new Object[4])[2] = paramVulcan_hu;
    (new Object[4])[1] = paramAbstractCheck;
    new Object[4];
    Vulcan_bG.Vulcan_Y(new Object[] { Long.valueOf(l2) });
  }
  
  private static void lambda$handleAlert$3(TextComponent paramTextComponent, Player paramPlayer) {
    paramPlayer.spigot().sendMessage((BaseComponent)paramTextComponent);
  }
  
  private void lambda$handleAlert$5(TextComponent paramTextComponent) {
    this.Vulcan_j.forEach(paramTextComponent::lambda$handleAlert$4);
  }
  
  private static void lambda$handleAlert$4(TextComponent paramTextComponent, Player paramPlayer) {
    paramPlayer.spigot().sendMessage((BaseComponent)paramTextComponent);
  }
  
  private static void lambda$handleAlert$7(Vulcan_hu paramVulcan_hu, String paramString1, String paramString2, AbstractCheck paramAbstractCheck, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12) {
    // Byte code:
    //   0: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Ml : Ljava/util/List;
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: aload_3
    //   7: aload #4
    //   9: aload #5
    //   11: aload #6
    //   13: aload #7
    //   15: aload #8
    //   17: aload #9
    //   19: aload #10
    //   21: aload #11
    //   23: aload #12
    //   25: aload #13
    //   27: <illegal opcode> accept : (Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Ljava/lang/String;Lme/frep/vulcan/spigot/check/AbstractCheck;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   32: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   37: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #372	-> 0
  }
  
  private static void lambda$handleAlert$6(Vulcan_hu paramVulcan_hu, String paramString1, String paramString2, AbstractCheck paramAbstractCheck, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13) {
    long l1 = a ^ 0x20E365C9D8B8L, l2 = l1 ^ 0x7033208A265FL, l3 = l1 ^ 0x4C42F5019B58L, l4 = l1 ^ 0x1DA95891BF82L, l5 = l1 ^ 0x7759D640A614L;
    String str = Vulcan_b();
    try {
      (new Object[2])[1] = paramAbstractCheck.getCategory().toLowerCase();
      new Object[2];
      new Object[1];
      new Object[1];
      new Object[1];
      if (str != null) {
        try {
          if (paramVulcan_hu.Vulcan_r(new Object[0]).Vulcan_r(new Object[0]) == null) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (str != null)
            try {
              new Object[1];
              (new Object[2])[1] = Vulcan_b0.Vulcan_Go;
              new Object[2];
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        String[] arrayOfString = b;
        new Object[1];
        new Object[2];
        Vulcan_Xz.Vulcan_k(new Object[] { null, Long.valueOf(l3), PlaceholderAPI.setPlaceholders(paramVulcan_hu.Vulcan_L(new Object[0]), paramString13.replaceAll(b[89], paramString1).replaceAll(b[81], paramString2).replaceAll(b[73], paramVulcan_hu.getClientBrand()).replaceAll(b[65], Vulcan_bG.Vulcan_Q(new Object[] { Long.valueOf(l4) })).replaceAll(b[49], Vulcan_b0.Vulcan_G6).replaceAll(b[28], paramString3).replaceAll(b[76], paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).complexType()).replaceAll(b[52], paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).name()).replaceAll(b[62], paramString4).replaceAll(b[30], paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).description()).replaceAll(b[74], paramString5).replaceAll(b[77], paramVulcan_hu.Vulcan_L(new Object[0]).getUniqueId().toString()).replaceAll(b[13], paramVulcan_hu.Vulcan_r(new Object[0]).Vulcan_r(new Object[0]).getName()).replaceAll(b[50], paramString6).replaceAll(b[44], paramString7).replaceAll(b[60], paramString8).replaceAll(b[9], paramString9).replaceAll(b[32], Integer.toString(paramVulcan_hu.getTotalViolations())).replaceAll(b[94], paramString10).replaceAll(b[19], paramString11).replaceAll(b[12], paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).experimental() ? Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) }) : "").replaceAll(arrayOfString[55], paramString12).replaceAll(arrayOfString[39], Character.toString(paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).type()))) });
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static void lambda$handleAlert$9(String paramString1, String paramString2, Vulcan_hu paramVulcan_hu, String paramString3, AbstractCheck paramAbstractCheck, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12) {
    // Byte code:
    //   0: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Ml : Ljava/util/List;
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: aload_3
    //   7: aload #4
    //   9: aload #5
    //   11: aload #6
    //   13: aload #7
    //   15: aload #8
    //   17: aload #9
    //   19: aload #10
    //   21: aload #11
    //   23: aload #12
    //   25: aload #13
    //   27: <illegal opcode> accept : (Ljava/lang/String;Ljava/lang/String;Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Lme/frep/vulcan/spigot/check/AbstractCheck;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   32: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   37: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #398	-> 0
  }
  
  private static void lambda$handleAlert$8(String paramString1, String paramString2, Vulcan_hu paramVulcan_hu, String paramString3, AbstractCheck paramAbstractCheck, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13) {
    long l1 = a ^ 0x5E2E988EEEFFL, l2 = l1 ^ 0xEFEDDCD1018L, l3 = l1 ^ 0x328F0846AD1FL, l4 = l1 ^ 0x6364A5D689C5L, l5 = l1 ^ 0x9942B079053L;
    String str = Vulcan_b();
    try {
      if (str != null) {
        try {
          if (paramVulcan_hu.Vulcan_r(new Object[0]).Vulcan_r(new Object[0]) == null) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          new Object[1];
          new Object[1];
          new Object[1];
          (new Object[2])[1] = paramAbstractCheck.getCategory().toLowerCase();
          new Object[2];
          if (str != null)
            try {
              new Object[1];
              (new Object[2])[1] = Vulcan_b0.Vulcan_Go;
              new Object[2];
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        String[] arrayOfString = b;
        new Object[1];
        new Object[2];
        Vulcan_Xz.Vulcan_k(new Object[] { null, Long.valueOf(l3), paramString13.replaceAll(b[89], paramString1).replaceAll(b[81], paramString2).replaceAll(b[73], paramVulcan_hu.getClientBrand()).replaceAll(b[49], Vulcan_b0.Vulcan_G6).replaceAll(b[28], paramString3).replaceAll(b[13], paramVulcan_hu.Vulcan_r(new Object[0]).Vulcan_r(new Object[0]).getName()).replaceAll(b[76], paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).complexType()).replaceAll(b[52], paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).name()).replaceAll(b[62], paramString4).replaceAll(b[30], paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).description()).replaceAll(b[74], paramString5).replaceAll(b[50], paramString6).replaceAll(b[44], paramString7).replaceAll(b[45], paramVulcan_hu.Vulcan_L(new Object[0]).getUniqueId().toString()).replaceAll(b[65], Vulcan_bG.Vulcan_Q(new Object[] { Long.valueOf(l4) })).replaceAll(b[60], paramString8).replaceAll(b[9], paramString9).replaceAll(b[32], Integer.toString(paramVulcan_hu.getTotalViolations())).replaceAll(b[94], paramString10).replaceAll(b[19], paramString11).replaceAll(b[12], paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).experimental() ? Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) }) : "").replaceAll(arrayOfString[55], paramString12).replaceAll(arrayOfString[39], Character.toString(paramAbstractCheck.Vulcan_B(new Object[] { Long.valueOf(l5) }).type())) });
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static void lambda$handleAlert$10(AbstractCheck paramAbstractCheck, int paramInt, Vulcan_hu paramVulcan_hu, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15) {
    // Byte code:
    //   0: getstatic me/frep/vulcan/spigot/Vulcan_XP.a : J
    //   3: ldc2_w 25517708793628
    //   6: lxor
    //   7: lstore #18
    //   9: lload #18
    //   11: dup2
    //   12: ldc2_w 79049019107835
    //   15: lxor
    //   16: lstore #20
    //   18: dup2
    //   19: ldc2_w 46726839775270
    //   22: lxor
    //   23: lstore #22
    //   25: dup2
    //   26: ldc2_w 117887747955449
    //   29: lxor
    //   30: lstore #24
    //   32: dup2
    //   33: ldc2_w 59101510893746
    //   36: lxor
    //   37: lstore #26
    //   39: dup2
    //   40: ldc2_w 70987194214832
    //   43: lxor
    //   44: lstore #28
    //   46: dup2
    //   47: ldc2_w 13896883766050
    //   50: lxor
    //   51: lstore #30
    //   53: pop2
    //   54: invokestatic Vulcan_b : ()Ljava/lang/String;
    //   57: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_M8 : Ljava/util/Map;
    //   60: aload_0
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   68: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   73: checkcast java/lang/Integer
    //   76: invokevirtual intValue : ()I
    //   79: istore #33
    //   81: astore #32
    //   83: iload_1
    //   84: iload #33
    //   86: irem
    //   87: ifne -> 2823
    //   90: new me/frep/vulcan/spigot/Vulcan_hk
    //   93: dup
    //   94: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Mw : Ljava/lang/String;
    //   97: invokespecial <init> : (Ljava/lang/String;)V
    //   100: astore #34
    //   102: aload #34
    //   104: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lm : Ljava/lang/String;
    //   107: iconst_1
    //   108: anewarray java/lang/Object
    //   111: dup_x1
    //   112: swap
    //   113: iconst_0
    //   114: swap
    //   115: aastore
    //   116: invokevirtual Vulcan_z : ([Ljava/lang/Object;)V
    //   119: aload #34
    //   121: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_LV : Ljava/lang/String;
    //   124: iconst_1
    //   125: anewarray java/lang/Object
    //   128: dup_x1
    //   129: swap
    //   130: iconst_0
    //   131: swap
    //   132: aastore
    //   133: invokevirtual Vulcan_X : ([Ljava/lang/Object;)V
    //   136: new me/frep/vulcan/spigot/Vulcan_hD
    //   139: dup
    //   140: invokespecial <init> : ()V
    //   143: astore #35
    //   145: aload #35
    //   147: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MV : Ljava/lang/String;
    //   150: iconst_1
    //   151: anewarray java/lang/Object
    //   154: dup_x1
    //   155: swap
    //   156: iconst_0
    //   157: swap
    //   158: aastore
    //   159: invokevirtual Vulcan_D : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   162: pop
    //   163: aload #35
    //   165: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dk : Ljava/lang/String;
    //   168: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   171: bipush #77
    //   173: aaload
    //   174: aload_2
    //   175: iconst_0
    //   176: anewarray java/lang/Object
    //   179: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   182: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   187: invokevirtual toString : ()Ljava/lang/String;
    //   190: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   193: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   196: bipush #18
    //   198: aaload
    //   199: aload_2
    //   200: iconst_0
    //   201: anewarray java/lang/Object
    //   204: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   207: invokeinterface getName : ()Ljava/lang/String;
    //   212: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   215: iconst_1
    //   216: anewarray java/lang/Object
    //   219: dup_x1
    //   220: swap
    //   221: iconst_0
    //   222: swap
    //   223: aastore
    //   224: invokevirtual Vulcan_i : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   227: pop
    //   228: aload #35
    //   230: new java/awt/Color
    //   233: dup
    //   234: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Mo : I
    //   237: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_y : I
    //   240: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GI : I
    //   243: invokespecial <init> : (III)V
    //   246: iconst_1
    //   247: anewarray java/lang/Object
    //   250: dup_x1
    //   251: swap
    //   252: iconst_0
    //   253: swap
    //   254: aastore
    //   255: invokevirtual Vulcan_Q : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   258: aload #32
    //   260: ifnull -> 866
    //   263: pop
    //   264: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   267: invokevirtual Vulcan_x : ()Z
    //   270: ifeq -> 857
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   279: athrow
    //   280: aload #35
    //   282: aload_2
    //   283: iconst_0
    //   284: anewarray java/lang/Object
    //   287: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   290: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Gt : Ljava/lang/String;
    //   293: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   296: bipush #89
    //   298: aaload
    //   299: aload_3
    //   300: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   303: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   306: bipush #52
    //   308: aaload
    //   309: aload #4
    //   311: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   314: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   317: bipush #81
    //   319: aaload
    //   320: aload #5
    //   322: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   325: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   328: bipush #49
    //   330: aaload
    //   331: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   334: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   337: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   340: bipush #73
    //   342: aaload
    //   343: aload_2
    //   344: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   347: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   350: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   353: bipush #74
    //   355: aaload
    //   356: aload #6
    //   358: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   361: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   364: bipush #77
    //   366: aaload
    //   367: aload_2
    //   368: iconst_0
    //   369: anewarray java/lang/Object
    //   372: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   375: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   380: invokevirtual toString : ()Ljava/lang/String;
    //   383: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   386: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   389: bipush #50
    //   391: aaload
    //   392: aload #7
    //   394: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   397: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   400: bipush #65
    //   402: aaload
    //   403: aload_0
    //   404: invokevirtual getCategory : ()Ljava/lang/String;
    //   407: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   410: lload #22
    //   412: dup2_x1
    //   413: pop2
    //   414: iconst_2
    //   415: anewarray java/lang/Object
    //   418: dup_x1
    //   419: swap
    //   420: iconst_1
    //   421: swap
    //   422: aastore
    //   423: dup_x2
    //   424: dup_x2
    //   425: pop
    //   426: invokestatic valueOf : (J)Ljava/lang/Long;
    //   429: iconst_0
    //   430: swap
    //   431: aastore
    //   432: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   435: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   438: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   441: bipush #44
    //   443: aaload
    //   444: aload #8
    //   446: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   449: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   452: bipush #35
    //   454: aaload
    //   455: aload_2
    //   456: iconst_0
    //   457: anewarray java/lang/Object
    //   460: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   463: lload #30
    //   465: dup2_x1
    //   466: pop2
    //   467: iconst_2
    //   468: anewarray java/lang/Object
    //   471: dup_x1
    //   472: swap
    //   473: iconst_1
    //   474: swap
    //   475: aastore
    //   476: dup_x2
    //   477: dup_x2
    //   478: pop
    //   479: invokestatic valueOf : (J)Ljava/lang/Long;
    //   482: iconst_0
    //   483: swap
    //   484: aastore
    //   485: invokestatic Vulcan_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   488: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   491: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   494: bipush #9
    //   496: aaload
    //   497: aload #9
    //   499: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   502: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   505: bipush #55
    //   507: aaload
    //   508: aload #10
    //   510: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   513: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   516: bipush #60
    //   518: aaload
    //   519: aload #11
    //   521: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   524: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   527: bipush #76
    //   529: aaload
    //   530: aload_0
    //   531: lload #28
    //   533: iconst_1
    //   534: anewarray java/lang/Object
    //   537: dup_x2
    //   538: dup_x2
    //   539: pop
    //   540: invokestatic valueOf : (J)Ljava/lang/Long;
    //   543: iconst_0
    //   544: swap
    //   545: aastore
    //   546: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   549: invokeinterface complexType : ()Ljava/lang/String;
    //   554: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   557: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   560: bipush #19
    //   562: aaload
    //   563: aload #12
    //   565: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   568: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   571: bipush #32
    //   573: aaload
    //   574: aload #13
    //   576: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   579: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   582: bipush #62
    //   584: aaload
    //   585: aload #14
    //   587: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   590: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   593: bipush #16
    //   595: aaload
    //   596: aload_2
    //   597: iconst_0
    //   598: anewarray java/lang/Object
    //   601: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   604: iconst_0
    //   605: anewarray java/lang/Object
    //   608: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   611: aload #32
    //   613: ifnull -> 661
    //   616: goto -> 623
    //   619: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   622: athrow
    //   623: ifnonnull -> 646
    //   626: goto -> 633
    //   629: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   632: athrow
    //   633: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   636: bipush #95
    //   638: aaload
    //   639: goto -> 666
    //   642: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   645: athrow
    //   646: aload_2
    //   647: iconst_0
    //   648: anewarray java/lang/Object
    //   651: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   654: iconst_0
    //   655: anewarray java/lang/Object
    //   658: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   661: invokeinterface getName : ()Ljava/lang/String;
    //   666: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   669: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   672: bipush #30
    //   674: aaload
    //   675: aload #15
    //   677: aload #32
    //   679: ifnull -> 758
    //   682: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   685: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   688: bipush #12
    //   690: aaload
    //   691: aload_0
    //   692: lload #28
    //   694: iconst_1
    //   695: anewarray java/lang/Object
    //   698: dup_x2
    //   699: dup_x2
    //   700: pop
    //   701: invokestatic valueOf : (J)Ljava/lang/Long;
    //   704: iconst_0
    //   705: swap
    //   706: aastore
    //   707: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   710: invokeinterface experimental : ()Z
    //   715: ifeq -> 761
    //   718: goto -> 725
    //   721: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   724: athrow
    //   725: lload #20
    //   727: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Go : Ljava/lang/String;
    //   730: iconst_2
    //   731: anewarray java/lang/Object
    //   734: dup_x1
    //   735: swap
    //   736: iconst_1
    //   737: swap
    //   738: aastore
    //   739: dup_x2
    //   740: dup_x2
    //   741: pop
    //   742: invokestatic valueOf : (J)Ljava/lang/Long;
    //   745: iconst_0
    //   746: swap
    //   747: aastore
    //   748: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   751: goto -> 758
    //   754: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   757: athrow
    //   758: goto -> 764
    //   761: ldc_w ''
    //   764: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   767: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   770: bipush #39
    //   772: aaload
    //   773: aload_0
    //   774: lload #28
    //   776: iconst_1
    //   777: anewarray java/lang/Object
    //   780: dup_x2
    //   781: dup_x2
    //   782: pop
    //   783: invokestatic valueOf : (J)Ljava/lang/Long;
    //   786: iconst_0
    //   787: swap
    //   788: aastore
    //   789: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   792: invokeinterface type : ()C
    //   797: invokestatic toString : (C)Ljava/lang/String;
    //   800: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   803: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   806: bipush #94
    //   808: aaload
    //   809: aload #16
    //   811: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   814: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   817: bipush #28
    //   819: aaload
    //   820: aload #17
    //   822: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   825: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   828: bipush #52
    //   830: aaload
    //   831: aload #4
    //   833: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   836: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   839: iconst_1
    //   840: anewarray java/lang/Object
    //   843: dup_x1
    //   844: swap
    //   845: iconst_0
    //   846: swap
    //   847: aastore
    //   848: invokevirtual Vulcan_f : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   851: pop
    //   852: aload #32
    //   854: ifnonnull -> 1429
    //   857: aload #35
    //   859: goto -> 866
    //   862: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   865: athrow
    //   866: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Gt : Ljava/lang/String;
    //   869: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   872: bipush #89
    //   874: aaload
    //   875: aload_3
    //   876: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   879: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   882: bipush #89
    //   884: aaload
    //   885: aload_3
    //   886: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   889: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   892: bipush #52
    //   894: aaload
    //   895: aload #4
    //   897: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   900: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   903: bipush #81
    //   905: aaload
    //   906: aload #5
    //   908: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   911: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   914: bipush #49
    //   916: aaload
    //   917: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   920: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   923: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   926: bipush #73
    //   928: aaload
    //   929: aload_2
    //   930: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   933: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   936: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   939: bipush #74
    //   941: aaload
    //   942: aload #6
    //   944: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   947: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   950: bipush #77
    //   952: aaload
    //   953: aload_2
    //   954: iconst_0
    //   955: anewarray java/lang/Object
    //   958: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   961: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   966: invokevirtual toString : ()Ljava/lang/String;
    //   969: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   972: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   975: bipush #50
    //   977: aaload
    //   978: aload #7
    //   980: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   983: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   986: bipush #65
    //   988: aaload
    //   989: aload_0
    //   990: invokevirtual getCategory : ()Ljava/lang/String;
    //   993: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   996: lload #22
    //   998: dup2_x1
    //   999: pop2
    //   1000: iconst_2
    //   1001: anewarray java/lang/Object
    //   1004: dup_x1
    //   1005: swap
    //   1006: iconst_1
    //   1007: swap
    //   1008: aastore
    //   1009: dup_x2
    //   1010: dup_x2
    //   1011: pop
    //   1012: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1015: iconst_0
    //   1016: swap
    //   1017: aastore
    //   1018: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1021: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1024: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1027: bipush #44
    //   1029: aaload
    //   1030: aload #8
    //   1032: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1035: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1038: bipush #78
    //   1040: aaload
    //   1041: aload_2
    //   1042: iconst_0
    //   1043: anewarray java/lang/Object
    //   1046: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1049: lload #30
    //   1051: dup2_x1
    //   1052: pop2
    //   1053: iconst_2
    //   1054: anewarray java/lang/Object
    //   1057: dup_x1
    //   1058: swap
    //   1059: iconst_1
    //   1060: swap
    //   1061: aastore
    //   1062: dup_x2
    //   1063: dup_x2
    //   1064: pop
    //   1065: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1068: iconst_0
    //   1069: swap
    //   1070: aastore
    //   1071: invokestatic Vulcan_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1074: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1077: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1080: bipush #9
    //   1082: aaload
    //   1083: aload #9
    //   1085: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1088: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1091: bipush #55
    //   1093: aaload
    //   1094: aload #10
    //   1096: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1099: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1102: bipush #60
    //   1104: aaload
    //   1105: aload #11
    //   1107: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1110: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1113: bipush #76
    //   1115: aaload
    //   1116: aload_0
    //   1117: lload #28
    //   1119: iconst_1
    //   1120: anewarray java/lang/Object
    //   1123: dup_x2
    //   1124: dup_x2
    //   1125: pop
    //   1126: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1129: iconst_0
    //   1130: swap
    //   1131: aastore
    //   1132: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   1135: invokeinterface complexType : ()Ljava/lang/String;
    //   1140: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1143: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1146: bipush #19
    //   1148: aaload
    //   1149: aload #12
    //   1151: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1154: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1157: bipush #32
    //   1159: aaload
    //   1160: aload #13
    //   1162: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1165: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1168: bipush #62
    //   1170: aaload
    //   1171: aload #14
    //   1173: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1176: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1179: bipush #87
    //   1181: aaload
    //   1182: aload_2
    //   1183: iconst_0
    //   1184: anewarray java/lang/Object
    //   1187: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   1190: iconst_0
    //   1191: anewarray java/lang/Object
    //   1194: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1197: aload #32
    //   1199: ifnull -> 1240
    //   1202: ifnonnull -> 1225
    //   1205: goto -> 1212
    //   1208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1211: athrow
    //   1212: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1215: bipush #95
    //   1217: aaload
    //   1218: goto -> 1245
    //   1221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1224: athrow
    //   1225: aload_2
    //   1226: iconst_0
    //   1227: anewarray java/lang/Object
    //   1230: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   1233: iconst_0
    //   1234: anewarray java/lang/Object
    //   1237: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1240: invokeinterface getName : ()Ljava/lang/String;
    //   1245: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1248: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1251: bipush #30
    //   1253: aaload
    //   1254: aload #15
    //   1256: aload #32
    //   1258: ifnull -> 1337
    //   1261: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1264: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1267: bipush #12
    //   1269: aaload
    //   1270: aload_0
    //   1271: lload #28
    //   1273: iconst_1
    //   1274: anewarray java/lang/Object
    //   1277: dup_x2
    //   1278: dup_x2
    //   1279: pop
    //   1280: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1283: iconst_0
    //   1284: swap
    //   1285: aastore
    //   1286: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   1289: invokeinterface experimental : ()Z
    //   1294: ifeq -> 1340
    //   1297: goto -> 1304
    //   1300: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1303: athrow
    //   1304: lload #20
    //   1306: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Go : Ljava/lang/String;
    //   1309: iconst_2
    //   1310: anewarray java/lang/Object
    //   1313: dup_x1
    //   1314: swap
    //   1315: iconst_1
    //   1316: swap
    //   1317: aastore
    //   1318: dup_x2
    //   1319: dup_x2
    //   1320: pop
    //   1321: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1324: iconst_0
    //   1325: swap
    //   1326: aastore
    //   1327: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1330: goto -> 1337
    //   1333: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1336: athrow
    //   1337: goto -> 1343
    //   1340: ldc_w ''
    //   1343: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1346: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1349: astore #37
    //   1351: aload #37
    //   1353: bipush #39
    //   1355: aaload
    //   1356: aload_0
    //   1357: lload #28
    //   1359: iconst_1
    //   1360: anewarray java/lang/Object
    //   1363: dup_x2
    //   1364: dup_x2
    //   1365: pop
    //   1366: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1369: iconst_0
    //   1370: swap
    //   1371: aastore
    //   1372: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   1375: invokeinterface type : ()C
    //   1380: invokestatic toString : (C)Ljava/lang/String;
    //   1383: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1386: aload #37
    //   1388: bipush #94
    //   1390: aaload
    //   1391: aload #16
    //   1393: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1396: aload #37
    //   1398: bipush #28
    //   1400: aaload
    //   1401: aload #17
    //   1403: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1406: aload #37
    //   1408: bipush #52
    //   1410: aaload
    //   1411: aload #4
    //   1413: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1416: iconst_1
    //   1417: anewarray java/lang/Object
    //   1420: dup_x1
    //   1421: swap
    //   1422: iconst_0
    //   1423: swap
    //   1424: aastore
    //   1425: invokevirtual Vulcan_f : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   1428: pop
    //   1429: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Ma : Z
    //   1432: aload #32
    //   1434: ifnull -> 1494
    //   1437: ifeq -> 1491
    //   1440: goto -> 1447
    //   1443: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1446: athrow
    //   1447: aload #35
    //   1449: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1452: bipush #88
    //   1454: aaload
    //   1455: aload #15
    //   1457: iconst_1
    //   1458: iconst_3
    //   1459: anewarray java/lang/Object
    //   1462: dup_x1
    //   1463: swap
    //   1464: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1467: iconst_2
    //   1468: swap
    //   1469: aastore
    //   1470: dup_x1
    //   1471: swap
    //   1472: iconst_1
    //   1473: swap
    //   1474: aastore
    //   1475: dup_x1
    //   1476: swap
    //   1477: iconst_0
    //   1478: swap
    //   1479: aastore
    //   1480: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   1483: pop
    //   1484: goto -> 1491
    //   1487: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1490: athrow
    //   1491: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_y3 : Z
    //   1494: aload #32
    //   1496: ifnull -> 1556
    //   1499: ifeq -> 1553
    //   1502: goto -> 1509
    //   1505: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1508: athrow
    //   1509: aload #35
    //   1511: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1514: bipush #7
    //   1516: aaload
    //   1517: aload #17
    //   1519: iconst_1
    //   1520: iconst_3
    //   1521: anewarray java/lang/Object
    //   1524: dup_x1
    //   1525: swap
    //   1526: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1529: iconst_2
    //   1530: swap
    //   1531: aastore
    //   1532: dup_x1
    //   1533: swap
    //   1534: iconst_1
    //   1535: swap
    //   1536: aastore
    //   1537: dup_x1
    //   1538: swap
    //   1539: iconst_0
    //   1540: swap
    //   1541: aastore
    //   1542: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   1545: pop
    //   1546: goto -> 1553
    //   1549: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1552: athrow
    //   1553: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_LE : Z
    //   1556: aload #32
    //   1558: ifnull -> 1619
    //   1561: ifeq -> 1616
    //   1564: goto -> 1571
    //   1567: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1570: athrow
    //   1571: aload #35
    //   1573: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1576: bipush #79
    //   1578: aaload
    //   1579: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   1582: iconst_1
    //   1583: iconst_3
    //   1584: anewarray java/lang/Object
    //   1587: dup_x1
    //   1588: swap
    //   1589: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1592: iconst_2
    //   1593: swap
    //   1594: aastore
    //   1595: dup_x1
    //   1596: swap
    //   1597: iconst_1
    //   1598: swap
    //   1599: aastore
    //   1600: dup_x1
    //   1601: swap
    //   1602: iconst_0
    //   1603: swap
    //   1604: aastore
    //   1605: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   1608: pop
    //   1609: goto -> 1616
    //   1612: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1615: athrow
    //   1616: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dm : Z
    //   1619: aload #32
    //   1621: ifnull -> 1683
    //   1624: ifeq -> 1680
    //   1627: goto -> 1634
    //   1630: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1633: athrow
    //   1634: aload #35
    //   1636: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1639: bipush #21
    //   1641: aaload
    //   1642: aload_2
    //   1643: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1646: iconst_1
    //   1647: iconst_3
    //   1648: anewarray java/lang/Object
    //   1651: dup_x1
    //   1652: swap
    //   1653: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1656: iconst_2
    //   1657: swap
    //   1658: aastore
    //   1659: dup_x1
    //   1660: swap
    //   1661: iconst_1
    //   1662: swap
    //   1663: aastore
    //   1664: dup_x1
    //   1665: swap
    //   1666: iconst_0
    //   1667: swap
    //   1668: aastore
    //   1669: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   1672: pop
    //   1673: goto -> 1680
    //   1676: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1679: athrow
    //   1680: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MM : Z
    //   1683: aload #32
    //   1685: ifnull -> 1776
    //   1688: ifeq -> 1773
    //   1691: goto -> 1698
    //   1694: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1697: athrow
    //   1698: aload #35
    //   1700: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1703: bipush #25
    //   1705: aaload
    //   1706: aload_2
    //   1707: iconst_0
    //   1708: anewarray java/lang/Object
    //   1711: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1714: lload #30
    //   1716: dup2_x1
    //   1717: pop2
    //   1718: iconst_2
    //   1719: anewarray java/lang/Object
    //   1722: dup_x1
    //   1723: swap
    //   1724: iconst_1
    //   1725: swap
    //   1726: aastore
    //   1727: dup_x2
    //   1728: dup_x2
    //   1729: pop
    //   1730: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1733: iconst_0
    //   1734: swap
    //   1735: aastore
    //   1736: invokestatic Vulcan_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1739: iconst_1
    //   1740: iconst_3
    //   1741: anewarray java/lang/Object
    //   1744: dup_x1
    //   1745: swap
    //   1746: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1749: iconst_2
    //   1750: swap
    //   1751: aastore
    //   1752: dup_x1
    //   1753: swap
    //   1754: iconst_1
    //   1755: swap
    //   1756: aastore
    //   1757: dup_x1
    //   1758: swap
    //   1759: iconst_0
    //   1760: swap
    //   1761: aastore
    //   1762: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   1765: pop
    //   1766: goto -> 1773
    //   1769: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1772: athrow
    //   1773: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dn : Z
    //   1776: aload #32
    //   1778: ifnull -> 1899
    //   1781: ifeq -> 1896
    //   1784: goto -> 1791
    //   1787: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1790: athrow
    //   1791: aload #35
    //   1793: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1796: bipush #17
    //   1798: aaload
    //   1799: new java/lang/StringBuilder
    //   1802: dup
    //   1803: invokespecial <init> : ()V
    //   1806: aload_2
    //   1807: iconst_0
    //   1808: anewarray java/lang/Object
    //   1811: invokevirtual Vulcan_m : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XW;
    //   1814: iconst_0
    //   1815: anewarray java/lang/Object
    //   1818: invokevirtual Vulcan_Y : ([Ljava/lang/Object;)I
    //   1821: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1824: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1827: bipush #46
    //   1829: aaload
    //   1830: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1833: iconst_0
    //   1834: anewarray java/lang/Object
    //   1837: invokestatic Vulcan_S : ([Ljava/lang/Object;)D
    //   1840: iconst_1
    //   1841: anewarray java/lang/Object
    //   1844: dup_x2
    //   1845: dup_x2
    //   1846: pop
    //   1847: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1850: iconst_0
    //   1851: swap
    //   1852: aastore
    //   1853: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1856: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1859: invokevirtual toString : ()Ljava/lang/String;
    //   1862: iconst_1
    //   1863: iconst_3
    //   1864: anewarray java/lang/Object
    //   1867: dup_x1
    //   1868: swap
    //   1869: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1872: iconst_2
    //   1873: swap
    //   1874: aastore
    //   1875: dup_x1
    //   1876: swap
    //   1877: iconst_1
    //   1878: swap
    //   1879: aastore
    //   1880: dup_x1
    //   1881: swap
    //   1882: iconst_0
    //   1883: swap
    //   1884: aastore
    //   1885: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   1888: pop
    //   1889: goto -> 1896
    //   1892: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1895: athrow
    //   1896: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_LL : Z
    //   1899: aload #32
    //   1901: ifnull -> 2089
    //   1904: ifeq -> 2064
    //   1907: goto -> 1914
    //   1910: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1913: athrow
    //   1914: aload #35
    //   1916: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1919: bipush #14
    //   1921: aaload
    //   1922: new java/lang/StringBuilder
    //   1925: dup
    //   1926: invokespecial <init> : ()V
    //   1929: ldc_w '('
    //   1932: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1935: aload #9
    //   1937: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1940: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1943: bipush #67
    //   1945: aaload
    //   1946: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1949: aload_2
    //   1950: iconst_0
    //   1951: anewarray java/lang/Object
    //   1954: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1957: iconst_0
    //   1958: anewarray java/lang/Object
    //   1961: invokevirtual Vulcan_l : ([Ljava/lang/Object;)I
    //   1964: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1967: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1970: bipush #68
    //   1972: aaload
    //   1973: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1976: aload_2
    //   1977: iconst_0
    //   1978: anewarray java/lang/Object
    //   1981: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1984: iconst_0
    //   1985: anewarray java/lang/Object
    //   1988: invokevirtual Vulcan_vY : ([Ljava/lang/Object;)I
    //   1991: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1994: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1997: bipush #68
    //   1999: aaload
    //   2000: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2003: aload_2
    //   2004: iconst_0
    //   2005: anewarray java/lang/Object
    //   2008: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   2011: iconst_0
    //   2012: anewarray java/lang/Object
    //   2015: invokevirtual Vulcan_vN : ([Ljava/lang/Object;)I
    //   2018: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2021: ldc_w ')'
    //   2024: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2027: invokevirtual toString : ()Ljava/lang/String;
    //   2030: iconst_1
    //   2031: iconst_3
    //   2032: anewarray java/lang/Object
    //   2035: dup_x1
    //   2036: swap
    //   2037: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2040: iconst_2
    //   2041: swap
    //   2042: aastore
    //   2043: dup_x1
    //   2044: swap
    //   2045: iconst_1
    //   2046: swap
    //   2047: aastore
    //   2048: dup_x1
    //   2049: swap
    //   2050: iconst_0
    //   2051: swap
    //   2052: aastore
    //   2053: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hD;
    //   2056: pop
    //   2057: goto -> 2064
    //   2060: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2063: athrow
    //   2064: aload #34
    //   2066: aload #35
    //   2068: iconst_1
    //   2069: anewarray java/lang/Object
    //   2072: dup_x1
    //   2073: swap
    //   2074: iconst_0
    //   2075: swap
    //   2076: aastore
    //   2077: invokevirtual Vulcan_r : ([Ljava/lang/Object;)V
    //   2080: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dQ : Ljava/lang/String;
    //   2083: ldc_w ''
    //   2086: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2089: aload #32
    //   2091: ifnull -> 2699
    //   2094: ifne -> 2696
    //   2097: goto -> 2104
    //   2100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2103: athrow
    //   2104: aload #34
    //   2106: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dQ : Ljava/lang/String;
    //   2109: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2112: bipush #89
    //   2114: aaload
    //   2115: aload_3
    //   2116: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2119: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2122: bipush #89
    //   2124: aaload
    //   2125: aload_3
    //   2126: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2129: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2132: bipush #52
    //   2134: aaload
    //   2135: aload #4
    //   2137: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2140: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2143: bipush #81
    //   2145: aaload
    //   2146: aload #5
    //   2148: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2151: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2154: bipush #49
    //   2156: aaload
    //   2157: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   2160: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2163: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2166: bipush #73
    //   2168: aaload
    //   2169: aload_2
    //   2170: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   2173: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2176: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2179: bipush #74
    //   2181: aaload
    //   2182: aload #6
    //   2184: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2187: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2190: bipush #50
    //   2192: aaload
    //   2193: aload #7
    //   2195: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2198: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2201: bipush #60
    //   2203: aaload
    //   2204: aload_2
    //   2205: iconst_0
    //   2206: anewarray java/lang/Object
    //   2209: invokevirtual Vulcan_v : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XR;
    //   2212: iconst_0
    //   2213: anewarray java/lang/Object
    //   2216: invokevirtual Vulcan_W : ([Ljava/lang/Object;)D
    //   2219: lload #24
    //   2221: iconst_2
    //   2222: iconst_3
    //   2223: anewarray java/lang/Object
    //   2226: dup_x1
    //   2227: swap
    //   2228: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2231: iconst_2
    //   2232: swap
    //   2233: aastore
    //   2234: dup_x2
    //   2235: dup_x2
    //   2236: pop
    //   2237: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2240: iconst_1
    //   2241: swap
    //   2242: aastore
    //   2243: dup_x2
    //   2244: dup_x2
    //   2245: pop
    //   2246: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2249: iconst_0
    //   2250: swap
    //   2251: aastore
    //   2252: invokestatic Vulcan_r : ([Ljava/lang/Object;)D
    //   2255: invokestatic toString : (D)Ljava/lang/String;
    //   2258: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2261: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2264: bipush #65
    //   2266: aaload
    //   2267: aload_0
    //   2268: invokevirtual getCategory : ()Ljava/lang/String;
    //   2271: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   2274: lload #22
    //   2276: dup2_x1
    //   2277: pop2
    //   2278: iconst_2
    //   2279: anewarray java/lang/Object
    //   2282: dup_x1
    //   2283: swap
    //   2284: iconst_1
    //   2285: swap
    //   2286: aastore
    //   2287: dup_x2
    //   2288: dup_x2
    //   2289: pop
    //   2290: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2293: iconst_0
    //   2294: swap
    //   2295: aastore
    //   2296: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2299: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2302: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2305: bipush #44
    //   2307: aaload
    //   2308: aload #8
    //   2310: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2313: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2316: bipush #77
    //   2318: aaload
    //   2319: aload_2
    //   2320: iconst_0
    //   2321: anewarray java/lang/Object
    //   2324: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2327: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   2332: invokevirtual toString : ()Ljava/lang/String;
    //   2335: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2338: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2341: bipush #9
    //   2343: aaload
    //   2344: aload #9
    //   2346: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2349: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2352: bipush #55
    //   2354: aaload
    //   2355: aload #10
    //   2357: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2360: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2363: bipush #60
    //   2365: aaload
    //   2366: aload #11
    //   2368: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2371: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2374: bipush #76
    //   2376: aaload
    //   2377: aload_0
    //   2378: lload #28
    //   2380: iconst_1
    //   2381: anewarray java/lang/Object
    //   2384: dup_x2
    //   2385: dup_x2
    //   2386: pop
    //   2387: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2390: iconst_0
    //   2391: swap
    //   2392: aastore
    //   2393: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   2396: invokeinterface complexType : ()Ljava/lang/String;
    //   2401: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2404: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2407: bipush #19
    //   2409: aaload
    //   2410: aload #12
    //   2412: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2415: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2418: bipush #32
    //   2420: aaload
    //   2421: aload #13
    //   2423: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2426: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2429: bipush #62
    //   2431: aaload
    //   2432: aload #14
    //   2434: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2437: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2440: bipush #13
    //   2442: aaload
    //   2443: aload_2
    //   2444: iconst_0
    //   2445: anewarray java/lang/Object
    //   2448: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   2451: iconst_0
    //   2452: anewarray java/lang/Object
    //   2455: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2458: aload #32
    //   2460: ifnull -> 2508
    //   2463: goto -> 2470
    //   2466: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2469: athrow
    //   2470: ifnonnull -> 2493
    //   2473: goto -> 2480
    //   2476: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2479: athrow
    //   2480: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2483: bipush #95
    //   2485: aaload
    //   2486: goto -> 2513
    //   2489: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2492: athrow
    //   2493: aload_2
    //   2494: iconst_0
    //   2495: anewarray java/lang/Object
    //   2498: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   2501: iconst_0
    //   2502: anewarray java/lang/Object
    //   2505: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2508: invokeinterface getName : ()Ljava/lang/String;
    //   2513: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2516: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2519: bipush #30
    //   2521: aaload
    //   2522: aload #15
    //   2524: aload #32
    //   2526: ifnull -> 2605
    //   2529: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2532: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2535: bipush #12
    //   2537: aaload
    //   2538: aload_0
    //   2539: lload #28
    //   2541: iconst_1
    //   2542: anewarray java/lang/Object
    //   2545: dup_x2
    //   2546: dup_x2
    //   2547: pop
    //   2548: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2551: iconst_0
    //   2552: swap
    //   2553: aastore
    //   2554: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   2557: invokeinterface experimental : ()Z
    //   2562: ifeq -> 2608
    //   2565: goto -> 2572
    //   2568: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2571: athrow
    //   2572: lload #20
    //   2574: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Go : Ljava/lang/String;
    //   2577: iconst_2
    //   2578: anewarray java/lang/Object
    //   2581: dup_x1
    //   2582: swap
    //   2583: iconst_1
    //   2584: swap
    //   2585: aastore
    //   2586: dup_x2
    //   2587: dup_x2
    //   2588: pop
    //   2589: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2592: iconst_0
    //   2593: swap
    //   2594: aastore
    //   2595: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2598: goto -> 2605
    //   2601: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2604: athrow
    //   2605: goto -> 2611
    //   2608: ldc_w ''
    //   2611: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2614: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2617: astore #37
    //   2619: aload #37
    //   2621: bipush #39
    //   2623: aaload
    //   2624: aload_0
    //   2625: lload #28
    //   2627: iconst_1
    //   2628: anewarray java/lang/Object
    //   2631: dup_x2
    //   2632: dup_x2
    //   2633: pop
    //   2634: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2637: iconst_0
    //   2638: swap
    //   2639: aastore
    //   2640: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   2643: invokeinterface type : ()C
    //   2648: invokestatic toString : (C)Ljava/lang/String;
    //   2651: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2654: aload #37
    //   2656: bipush #94
    //   2658: aaload
    //   2659: aload #16
    //   2661: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2664: aload #37
    //   2666: bipush #28
    //   2668: aaload
    //   2669: aload #17
    //   2671: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2674: aload #37
    //   2676: bipush #52
    //   2678: aaload
    //   2679: aload #4
    //   2681: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2684: iconst_1
    //   2685: anewarray java/lang/Object
    //   2688: dup_x1
    //   2689: swap
    //   2690: iconst_0
    //   2691: swap
    //   2692: aastore
    //   2693: invokevirtual Vulcan_B : ([Ljava/lang/Object;)V
    //   2696: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GX : Z
    //   2699: aload #32
    //   2701: ifnull -> 2739
    //   2704: ifeq -> 2791
    //   2707: goto -> 2714
    //   2710: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2713: athrow
    //   2714: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2717: aload #32
    //   2719: ifnull -> 2775
    //   2722: goto -> 2729
    //   2725: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2728: athrow
    //   2729: invokevirtual Vulcan_Z : ()I
    //   2732: goto -> 2739
    //   2735: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2738: athrow
    //   2739: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Gz : I
    //   2742: if_icmpge -> 2791
    //   2745: aload #34
    //   2747: lload #26
    //   2749: iconst_1
    //   2750: anewarray java/lang/Object
    //   2753: dup_x2
    //   2754: dup_x2
    //   2755: pop
    //   2756: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2759: iconst_0
    //   2760: swap
    //   2761: aastore
    //   2762: invokevirtual Vulcan_N : ([Ljava/lang/Object;)V
    //   2765: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2768: goto -> 2775
    //   2771: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2774: athrow
    //   2775: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2778: invokevirtual Vulcan_Z : ()I
    //   2781: iconst_1
    //   2782: iadd
    //   2783: invokevirtual Vulcan_P : (I)V
    //   2786: aload #32
    //   2788: ifnonnull -> 2818
    //   2791: aload #34
    //   2793: lload #26
    //   2795: iconst_1
    //   2796: anewarray java/lang/Object
    //   2799: dup_x2
    //   2800: dup_x2
    //   2801: pop
    //   2802: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2805: iconst_0
    //   2806: swap
    //   2807: aastore
    //   2808: invokevirtual Vulcan_N : ([Ljava/lang/Object;)V
    //   2811: goto -> 2818
    //   2814: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2817: athrow
    //   2818: goto -> 2823
    //   2821: astore #36
    //   2823: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #429	-> 57
    //   #431	-> 83
    //   #432	-> 90
    //   #434	-> 102
    //   #435	-> 119
    //   #437	-> 136
    //   #439	-> 145
    //   #440	-> 163
    //   #441	-> 175
    //   #442	-> 200
    //   #440	-> 215
    //   #443	-> 228
    //   #444	-> 264
    //   #445	-> 280
    //   #446	-> 300
    //   #447	-> 311
    //   #448	-> 322
    //   #449	-> 334
    //   #450	-> 344
    //   #451	-> 358
    //   #452	-> 368
    //   #453	-> 394
    //   #454	-> 404
    //   #455	-> 446
    //   #456	-> 456
    //   #457	-> 499
    //   #458	-> 510
    //   #459	-> 521
    //   #460	-> 531
    //   #461	-> 565
    //   #462	-> 576
    //   #463	-> 587
    //   #464	-> 596
    //   #465	-> 677
    //   #466	-> 691
    //   #467	-> 774
    //   #468	-> 811
    //   #469	-> 822
    //   #470	-> 833
    //   #445	-> 836
    //   #472	-> 857
    //   #473	-> 876
    //   #474	-> 886
    //   #475	-> 897
    //   #476	-> 908
    //   #477	-> 920
    //   #478	-> 930
    //   #479	-> 944
    //   #480	-> 954
    //   #481	-> 980
    //   #482	-> 990
    //   #483	-> 1032
    //   #484	-> 1042
    //   #485	-> 1085
    //   #486	-> 1096
    //   #487	-> 1107
    //   #488	-> 1117
    //   #489	-> 1151
    //   #490	-> 1162
    //   #491	-> 1173
    //   #492	-> 1182
    //   #493	-> 1256
    //   #494	-> 1270
    //   #495	-> 1357
    //   #496	-> 1393
    //   #497	-> 1403
    //   #498	-> 1413
    //   #472	-> 1416
    //   #501	-> 1429
    //   #502	-> 1447
    //   #505	-> 1491
    //   #506	-> 1509
    //   #509	-> 1553
    //   #510	-> 1571
    //   #513	-> 1616
    //   #514	-> 1634
    //   #517	-> 1680
    //   #518	-> 1698
    //   #521	-> 1773
    //   #522	-> 1791
    //   #526	-> 1896
    //   #527	-> 1914
    //   #528	-> 1950
    //   #529	-> 1977
    //   #530	-> 2004
    //   #527	-> 2031
    //   #533	-> 2064
    //   #534	-> 2080
    //   #535	-> 2104
    //   #536	-> 2116
    //   #537	-> 2126
    //   #538	-> 2137
    //   #539	-> 2148
    //   #540	-> 2160
    //   #541	-> 2170
    //   #542	-> 2184
    //   #543	-> 2195
    //   #544	-> 2205
    //   #545	-> 2268
    //   #546	-> 2310
    //   #547	-> 2320
    //   #548	-> 2346
    //   #549	-> 2357
    //   #550	-> 2368
    //   #551	-> 2378
    //   #552	-> 2412
    //   #553	-> 2423
    //   #554	-> 2434
    //   #555	-> 2443
    //   #556	-> 2524
    //   #557	-> 2538
    //   #558	-> 2625
    //   #559	-> 2661
    //   #560	-> 2671
    //   #561	-> 2681
    //   #535	-> 2684
    //   #565	-> 2696
    //   #566	-> 2745
    //   #567	-> 2765
    //   #569	-> 2791
    //   #572	-> 2818
    //   #571	-> 2821
    //   #574	-> 2823
    // Exception table:
    //   from	to	target	type
    //   145	273	276	java/lang/Exception
    //   263	616	619	java/lang/Exception
    //   280	626	629	java/lang/Exception
    //   623	642	642	java/lang/Exception
    //   666	718	721	java/lang/Exception
    //   682	751	754	java/lang/Exception
    //   764	859	862	java/lang/Exception
    //   866	1205	1208	java/lang/Exception
    //   1202	1221	1221	java/lang/Exception
    //   1245	1297	1300	java/lang/Exception
    //   1261	1330	1333	java/lang/Exception
    //   1429	1440	1443	java/lang/Exception
    //   1437	1484	1487	java/lang/Exception
    //   1494	1502	1505	java/lang/Exception
    //   1499	1546	1549	java/lang/Exception
    //   1556	1564	1567	java/lang/Exception
    //   1561	1609	1612	java/lang/Exception
    //   1619	1627	1630	java/lang/Exception
    //   1624	1673	1676	java/lang/Exception
    //   1683	1691	1694	java/lang/Exception
    //   1688	1766	1769	java/lang/Exception
    //   1776	1784	1787	java/lang/Exception
    //   1781	1889	1892	java/lang/Exception
    //   1899	1907	1910	java/lang/Exception
    //   1904	2057	2060	java/lang/Exception
    //   2089	2097	2100	java/lang/Exception
    //   2094	2463	2466	java/lang/Exception
    //   2104	2473	2476	java/lang/Exception
    //   2470	2489	2489	java/lang/Exception
    //   2513	2565	2568	java/lang/Exception
    //   2529	2598	2601	java/lang/Exception
    //   2696	2818	2821	java/lang/Exception
    //   2699	2707	2710	java/lang/Exception
    //   2704	2722	2725	java/lang/Exception
    //   2714	2732	2735	java/lang/Exception
    //   2739	2768	2771	java/lang/Exception
    //   2775	2811	2814	java/lang/Exception
  }
  
  private final DecimalFormat Vulcan_z = new DecimalFormat(b[85]);
  
  private static String Vulcan_J;
  
  private static final long a = Vulcan_e.a(-8763853614487926542L, -6729546400561613103L, MethodHandles.lookup().lookupClass()).a(143517911896694L);
  
  private static final String[] b;
  
  public void Vulcan_d(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Integer
    //   7: invokevirtual intValue : ()I
    //   10: istore #4
    //   12: dup
    //   13: iconst_1
    //   14: aaload
    //   15: checkcast java/lang/Integer
    //   18: invokevirtual intValue : ()I
    //   21: istore #6
    //   23: dup
    //   24: iconst_2
    //   25: aaload
    //   26: checkcast java/lang/Integer
    //   29: invokevirtual intValue : ()I
    //   32: istore #5
    //   34: dup
    //   35: iconst_3
    //   36: aaload
    //   37: checkcast me/frep/vulcan/spigot/check/AbstractCheck
    //   40: astore_3
    //   41: dup
    //   42: iconst_4
    //   43: aaload
    //   44: checkcast me/frep/vulcan/spigot/Vulcan_hu
    //   47: astore_2
    //   48: pop
    //   49: iload #4
    //   51: i2l
    //   52: bipush #48
    //   54: lshl
    //   55: iload #6
    //   57: i2l
    //   58: bipush #48
    //   60: lshl
    //   61: bipush #16
    //   63: lushr
    //   64: lor
    //   65: iload #5
    //   67: i2l
    //   68: bipush #32
    //   70: lshl
    //   71: bipush #32
    //   73: lushr
    //   74: lor
    //   75: getstatic me/frep/vulcan/spigot/Vulcan_XP.a : J
    //   78: lxor
    //   79: lstore #7
    //   81: lload #7
    //   83: dup2
    //   84: ldc2_w 91696327774873
    //   87: lxor
    //   88: lstore #9
    //   90: dup2
    //   91: ldc2_w 69268411566916
    //   94: lxor
    //   95: lstore #11
    //   97: dup2
    //   98: ldc2_w 140425548030363
    //   101: lxor
    //   102: lstore #13
    //   104: dup2
    //   105: ldc2_w 92424504464082
    //   108: lxor
    //   109: lstore #15
    //   111: dup2
    //   112: ldc2_w 26539163744320
    //   115: lxor
    //   116: lstore #17
    //   118: pop2
    //   119: invokestatic Vulcan_b : ()Ljava/lang/String;
    //   122: astore #19
    //   124: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   127: invokevirtual Vulcan_g : ()Z
    //   130: aload #19
    //   132: ifnull -> 155
    //   135: ifeq -> 146
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: return
    //   146: aload_0
    //   147: getfield Vulcan_Z : Ljava/util/Set;
    //   150: invokeinterface isEmpty : ()Z
    //   155: aload #19
    //   157: ifnull -> 193
    //   160: ifeq -> 171
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: return
    //   171: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dS : Ljava/util/Map;
    //   174: aload_3
    //   175: iconst_0
    //   176: anewarray java/lang/Object
    //   179: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Ljava/lang/String;
    //   182: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   187: checkcast java/lang/Integer
    //   190: invokevirtual intValue : ()I
    //   193: istore #20
    //   195: new net/md_5/bungee/api/chat/TextComponent
    //   198: dup
    //   199: lload #9
    //   201: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dP : Ljava/lang/String;
    //   204: iconst_2
    //   205: anewarray java/lang/Object
    //   208: dup_x1
    //   209: swap
    //   210: iconst_1
    //   211: swap
    //   212: aastore
    //   213: dup_x2
    //   214: dup_x2
    //   215: pop
    //   216: invokestatic valueOf : (J)Ljava/lang/Long;
    //   219: iconst_0
    //   220: swap
    //   221: aastore
    //   222: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   225: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   228: bipush #89
    //   230: aaload
    //   231: aload_2
    //   232: iconst_0
    //   233: anewarray java/lang/Object
    //   236: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   239: invokeinterface getName : ()Ljava/lang/String;
    //   244: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   247: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   250: bipush #48
    //   252: aaload
    //   253: aload_0
    //   254: getfield Vulcan_z : Ljava/text/DecimalFormat;
    //   257: aload_3
    //   258: invokevirtual getBuffer : ()D
    //   261: aload_3
    //   262: iconst_0
    //   263: anewarray java/lang/Object
    //   266: invokevirtual Vulcan_y : ([Ljava/lang/Object;)D
    //   269: ddiv
    //   270: ldc2_w 100.0
    //   273: dmul
    //   274: invokevirtual format : (D)Ljava/lang/String;
    //   277: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   280: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   283: bipush #90
    //   285: aaload
    //   286: iload #20
    //   288: invokestatic toString : (I)Ljava/lang/String;
    //   291: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   294: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   297: bipush #66
    //   299: aaload
    //   300: aload_3
    //   301: invokevirtual getCategory : ()Ljava/lang/String;
    //   304: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   307: lload #11
    //   309: dup2_x1
    //   310: pop2
    //   311: iconst_2
    //   312: anewarray java/lang/Object
    //   315: dup_x1
    //   316: swap
    //   317: iconst_1
    //   318: swap
    //   319: aastore
    //   320: dup_x2
    //   321: dup_x2
    //   322: pop
    //   323: invokestatic valueOf : (J)Ljava/lang/Long;
    //   326: iconst_0
    //   327: swap
    //   328: aastore
    //   329: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   332: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   335: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   338: bipush #49
    //   340: aaload
    //   341: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   344: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   347: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   350: bipush #73
    //   352: aaload
    //   353: aload_2
    //   354: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   357: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   360: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   363: bipush #94
    //   365: aaload
    //   366: iconst_0
    //   367: anewarray java/lang/Object
    //   370: invokestatic Vulcan_S : ([Ljava/lang/Object;)D
    //   373: iconst_1
    //   374: anewarray java/lang/Object
    //   377: dup_x2
    //   378: dup_x2
    //   379: pop
    //   380: invokestatic valueOf : (D)Ljava/lang/Double;
    //   383: iconst_0
    //   384: swap
    //   385: aastore
    //   386: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   389: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   392: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   395: bipush #13
    //   397: aaload
    //   398: aload_2
    //   399: iconst_0
    //   400: anewarray java/lang/Object
    //   403: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   406: iconst_0
    //   407: anewarray java/lang/Object
    //   410: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   413: ifnonnull -> 429
    //   416: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   419: bipush #95
    //   421: aaload
    //   422: goto -> 449
    //   425: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   428: athrow
    //   429: aload_2
    //   430: iconst_0
    //   431: anewarray java/lang/Object
    //   434: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   437: iconst_0
    //   438: anewarray java/lang/Object
    //   441: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   444: invokeinterface getName : ()Ljava/lang/String;
    //   449: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   452: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   455: astore #27
    //   457: aload #27
    //   459: bipush #62
    //   461: aaload
    //   462: aload_2
    //   463: iconst_0
    //   464: anewarray java/lang/Object
    //   467: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   470: iconst_1
    //   471: anewarray java/lang/Object
    //   474: dup_x1
    //   475: swap
    //   476: iconst_0
    //   477: swap
    //   478: aastore
    //   479: invokestatic Vulcan_X : ([Ljava/lang/Object;)I
    //   482: invokestatic toString : (I)Ljava/lang/String;
    //   485: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   488: aload #27
    //   490: bipush #98
    //   492: aaload
    //   493: aload_3
    //   494: lload #15
    //   496: iconst_1
    //   497: anewarray java/lang/Object
    //   500: dup_x2
    //   501: dup_x2
    //   502: pop
    //   503: invokestatic valueOf : (J)Ljava/lang/Long;
    //   506: iconst_0
    //   507: swap
    //   508: aastore
    //   509: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   512: invokeinterface complexType : ()Ljava/lang/String;
    //   517: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   520: aload #27
    //   522: bipush #60
    //   524: aaload
    //   525: aload_2
    //   526: iconst_0
    //   527: anewarray java/lang/Object
    //   530: invokevirtual Vulcan_v : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XR;
    //   533: iconst_0
    //   534: anewarray java/lang/Object
    //   537: invokevirtual Vulcan_W : ([Ljava/lang/Object;)D
    //   540: invokestatic toString : (D)Ljava/lang/String;
    //   543: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   546: aload #27
    //   548: bipush #32
    //   550: aaload
    //   551: aload_2
    //   552: invokevirtual getTotalViolations : ()I
    //   555: invokestatic toString : (I)Ljava/lang/String;
    //   558: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   561: aload #27
    //   563: bipush #74
    //   565: aaload
    //   566: aload_2
    //   567: iconst_0
    //   568: anewarray java/lang/Object
    //   571: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   574: iconst_0
    //   575: anewarray java/lang/Object
    //   578: invokevirtual Vulcan_r : ([Ljava/lang/Object;)D
    //   581: iconst_1
    //   582: anewarray java/lang/Object
    //   585: dup_x2
    //   586: dup_x2
    //   587: pop
    //   588: invokestatic valueOf : (D)Ljava/lang/Double;
    //   591: iconst_0
    //   592: swap
    //   593: aastore
    //   594: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   597: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   600: aload #27
    //   602: bipush #60
    //   604: aaload
    //   605: aload_2
    //   606: iconst_0
    //   607: anewarray java/lang/Object
    //   610: invokevirtual Vulcan_v : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XR;
    //   613: iconst_0
    //   614: anewarray java/lang/Object
    //   617: invokevirtual Vulcan_W : ([Ljava/lang/Object;)D
    //   620: lload #13
    //   622: iconst_2
    //   623: iconst_3
    //   624: anewarray java/lang/Object
    //   627: dup_x1
    //   628: swap
    //   629: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   632: iconst_2
    //   633: swap
    //   634: aastore
    //   635: dup_x2
    //   636: dup_x2
    //   637: pop
    //   638: invokestatic valueOf : (J)Ljava/lang/Long;
    //   641: iconst_1
    //   642: swap
    //   643: aastore
    //   644: dup_x2
    //   645: dup_x2
    //   646: pop
    //   647: invokestatic valueOf : (D)Ljava/lang/Double;
    //   650: iconst_0
    //   651: swap
    //   652: aastore
    //   653: invokestatic Vulcan_r : ([Ljava/lang/Object;)D
    //   656: invokestatic toString : (D)Ljava/lang/String;
    //   659: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   662: aload #27
    //   664: bipush #50
    //   666: aaload
    //   667: aload_2
    //   668: iconst_0
    //   669: anewarray java/lang/Object
    //   672: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   675: iconst_0
    //   676: anewarray java/lang/Object
    //   679: invokevirtual Vulcan_z : ([Ljava/lang/Object;)D
    //   682: iconst_1
    //   683: anewarray java/lang/Object
    //   686: dup_x2
    //   687: dup_x2
    //   688: pop
    //   689: invokestatic valueOf : (D)Ljava/lang/Double;
    //   692: iconst_0
    //   693: swap
    //   694: aastore
    //   695: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   698: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   701: aload #27
    //   703: bipush #44
    //   705: aaload
    //   706: aload_2
    //   707: iconst_0
    //   708: anewarray java/lang/Object
    //   711: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   714: iconst_0
    //   715: anewarray java/lang/Object
    //   718: invokevirtual Vulcan_u : ([Ljava/lang/Object;)D
    //   721: iconst_1
    //   722: anewarray java/lang/Object
    //   725: dup_x2
    //   726: dup_x2
    //   727: pop
    //   728: invokestatic valueOf : (D)Ljava/lang/Double;
    //   731: iconst_0
    //   732: swap
    //   733: aastore
    //   734: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   737: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   740: aload #27
    //   742: bipush #9
    //   744: aaload
    //   745: aload_2
    //   746: iconst_0
    //   747: anewarray java/lang/Object
    //   750: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   753: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   758: invokeinterface getName : ()Ljava/lang/String;
    //   763: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   766: aload #27
    //   768: bipush #38
    //   770: aaload
    //   771: aload_0
    //   772: getfield Vulcan_z : Ljava/text/DecimalFormat;
    //   775: aload_3
    //   776: invokevirtual getBuffer : ()D
    //   779: invokevirtual format : (D)Ljava/lang/String;
    //   782: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   785: aload #27
    //   787: bipush #56
    //   789: aaload
    //   790: aload_0
    //   791: getfield Vulcan_z : Ljava/text/DecimalFormat;
    //   794: aload_3
    //   795: iconst_0
    //   796: anewarray java/lang/Object
    //   799: invokevirtual Vulcan_y : ([Ljava/lang/Object;)D
    //   802: invokevirtual format : (D)Ljava/lang/String;
    //   805: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   808: aload #27
    //   810: bipush #52
    //   812: aaload
    //   813: aload_3
    //   814: lload #15
    //   816: iconst_1
    //   817: anewarray java/lang/Object
    //   820: dup_x2
    //   821: dup_x2
    //   822: pop
    //   823: invokestatic valueOf : (J)Ljava/lang/Long;
    //   826: iconst_0
    //   827: swap
    //   828: aastore
    //   829: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   832: invokeinterface name : ()Ljava/lang/String;
    //   837: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   840: aload #27
    //   842: bipush #54
    //   844: aaload
    //   845: aload_3
    //   846: lload #15
    //   848: iconst_1
    //   849: anewarray java/lang/Object
    //   852: dup_x2
    //   853: dup_x2
    //   854: pop
    //   855: invokestatic valueOf : (J)Ljava/lang/Long;
    //   858: iconst_0
    //   859: swap
    //   860: aastore
    //   861: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   864: invokeinterface description : ()Ljava/lang/String;
    //   869: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   872: aload #27
    //   874: bipush #19
    //   876: aaload
    //   877: aload_2
    //   878: iconst_0
    //   879: anewarray java/lang/Object
    //   882: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   885: lload #17
    //   887: dup2_x1
    //   888: pop2
    //   889: iconst_2
    //   890: anewarray java/lang/Object
    //   893: dup_x1
    //   894: swap
    //   895: iconst_1
    //   896: swap
    //   897: aastore
    //   898: dup_x2
    //   899: dup_x2
    //   900: pop
    //   901: invokestatic valueOf : (J)Ljava/lang/Long;
    //   904: iconst_0
    //   905: swap
    //   906: aastore
    //   907: invokestatic Vulcan_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   910: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   913: aload #27
    //   915: iconst_4
    //   916: aaload
    //   917: aload_3
    //   918: lload #15
    //   920: iconst_1
    //   921: anewarray java/lang/Object
    //   924: dup_x2
    //   925: dup_x2
    //   926: pop
    //   927: invokestatic valueOf : (J)Ljava/lang/Long;
    //   930: iconst_0
    //   931: swap
    //   932: aastore
    //   933: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   936: invokeinterface experimental : ()Z
    //   941: ifeq -> 973
    //   944: lload #9
    //   946: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Go : Ljava/lang/String;
    //   949: iconst_2
    //   950: anewarray java/lang/Object
    //   953: dup_x1
    //   954: swap
    //   955: iconst_1
    //   956: swap
    //   957: aastore
    //   958: dup_x2
    //   959: dup_x2
    //   960: pop
    //   961: invokestatic valueOf : (J)Ljava/lang/Long;
    //   964: iconst_0
    //   965: swap
    //   966: aastore
    //   967: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   970: goto -> 976
    //   973: ldc_w ''
    //   976: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   979: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   982: astore #27
    //   984: aload #27
    //   986: bipush #29
    //   988: aaload
    //   989: aload_3
    //   990: invokevirtual getVl : ()I
    //   993: invokestatic toString : (I)Ljava/lang/String;
    //   996: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   999: aload #27
    //   1001: bipush #39
    //   1003: aaload
    //   1004: aload_3
    //   1005: lload #15
    //   1007: iconst_1
    //   1008: anewarray java/lang/Object
    //   1011: dup_x2
    //   1012: dup_x2
    //   1013: pop
    //   1014: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1017: iconst_0
    //   1018: swap
    //   1019: aastore
    //   1020: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   1023: invokeinterface type : ()C
    //   1028: invokestatic toString : (C)Ljava/lang/String;
    //   1031: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1034: invokespecial <init> : (Ljava/lang/String;)V
    //   1037: astore #21
    //   1039: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Gc : Ljava/util/List;
    //   1042: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1047: astore #22
    //   1049: aload #22
    //   1051: invokeinterface hasNext : ()Z
    //   1056: ifeq -> 1119
    //   1059: aload #22
    //   1061: invokeinterface next : ()Ljava/lang/Object;
    //   1066: checkcast java/lang/String
    //   1069: astore #23
    //   1071: aload #21
    //   1073: new net/md_5/bungee/api/chat/ClickEvent
    //   1076: dup
    //   1077: getstatic net/md_5/bungee/api/chat/ClickEvent$Action.RUN_COMMAND : Lnet/md_5/bungee/api/chat/ClickEvent$Action;
    //   1080: aload #23
    //   1082: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1085: astore #27
    //   1087: aload #27
    //   1089: bipush #89
    //   1091: aaload
    //   1092: aload_2
    //   1093: iconst_0
    //   1094: anewarray java/lang/Object
    //   1097: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1100: invokeinterface getName : ()Ljava/lang/String;
    //   1105: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1108: invokespecial <init> : (Lnet/md_5/bungee/api/chat/ClickEvent$Action;Ljava/lang/String;)V
    //   1111: invokevirtual setClickEvent : (Lnet/md_5/bungee/api/chat/ClickEvent;)V
    //   1114: aload #19
    //   1116: ifnonnull -> 1049
    //   1119: new java/lang/StringBuilder
    //   1122: dup
    //   1123: invokespecial <init> : ()V
    //   1126: iload #5
    //   1128: ifgt -> 1066
    //   1131: astore #22
    //   1133: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GG : Ljava/util/List;
    //   1136: invokeinterface size : ()I
    //   1141: istore #23
    //   1143: iconst_1
    //   1144: istore #24
    //   1146: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GG : Ljava/util/List;
    //   1149: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1154: astore #25
    //   1156: aload #25
    //   1158: invokeinterface hasNext : ()Z
    //   1163: ifeq -> 1286
    //   1166: aload #25
    //   1168: invokeinterface next : ()Ljava/lang/Object;
    //   1173: checkcast java/lang/String
    //   1176: astore #26
    //   1178: aload #19
    //   1180: iload #6
    //   1182: ifle -> 1236
    //   1185: ifnull -> 1234
    //   1188: iload #24
    //   1190: iload #5
    //   1192: ifge -> 1970
    //   1195: aload #19
    //   1197: ifnull -> 1970
    //   1200: goto -> 1207
    //   1203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1206: athrow
    //   1207: iload #23
    //   1209: if_icmpne -> 1244
    //   1212: goto -> 1219
    //   1215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1218: athrow
    //   1219: aload #22
    //   1221: aload #26
    //   1223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1226: pop
    //   1227: goto -> 1234
    //   1230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1233: athrow
    //   1234: aload #19
    //   1236: iload #5
    //   1238: ifge -> 1283
    //   1241: ifnonnull -> 1278
    //   1244: aload #22
    //   1246: new java/lang/StringBuilder
    //   1249: dup
    //   1250: invokespecial <init> : ()V
    //   1253: aload #26
    //   1255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1258: ldc_w '\\n'
    //   1261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1264: invokevirtual toString : ()Ljava/lang/String;
    //   1267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1270: pop
    //   1271: goto -> 1278
    //   1274: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1277: athrow
    //   1278: iinc #24, 1
    //   1281: aload #19
    //   1283: ifnonnull -> 1156
    //   1286: aload #21
    //   1288: iload #4
    //   1290: iflt -> 1173
    //   1293: new net/md_5/bungee/api/chat/HoverEvent
    //   1296: dup
    //   1297: getstatic net/md_5/bungee/api/chat/HoverEvent$Action.SHOW_TEXT : Lnet/md_5/bungee/api/chat/HoverEvent$Action;
    //   1300: new net/md_5/bungee/api/chat/ComponentBuilder
    //   1303: dup
    //   1304: aload #22
    //   1306: invokevirtual toString : ()Ljava/lang/String;
    //   1309: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1312: bipush #89
    //   1314: aaload
    //   1315: aload_2
    //   1316: iconst_0
    //   1317: anewarray java/lang/Object
    //   1320: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1323: invokeinterface getName : ()Ljava/lang/String;
    //   1328: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1331: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1334: bipush #19
    //   1336: aaload
    //   1337: aload_2
    //   1338: iconst_0
    //   1339: anewarray java/lang/Object
    //   1342: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1345: lload #17
    //   1347: dup2_x1
    //   1348: pop2
    //   1349: iconst_2
    //   1350: anewarray java/lang/Object
    //   1353: dup_x1
    //   1354: swap
    //   1355: iconst_1
    //   1356: swap
    //   1357: aastore
    //   1358: dup_x2
    //   1359: dup_x2
    //   1360: pop
    //   1361: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1364: iconst_0
    //   1365: swap
    //   1366: aastore
    //   1367: invokestatic Vulcan_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1370: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1373: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1376: bipush #32
    //   1378: aaload
    //   1379: aload_2
    //   1380: invokevirtual getTotalViolations : ()I
    //   1383: invokestatic toString : (I)Ljava/lang/String;
    //   1386: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1389: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1392: bipush #93
    //   1394: aaload
    //   1395: aload_3
    //   1396: invokevirtual getBuffer : ()D
    //   1399: iconst_1
    //   1400: anewarray java/lang/Object
    //   1403: dup_x2
    //   1404: dup_x2
    //   1405: pop
    //   1406: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1409: iconst_0
    //   1410: swap
    //   1411: aastore
    //   1412: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1415: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1418: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1421: bipush #13
    //   1423: aaload
    //   1424: aload_2
    //   1425: iconst_0
    //   1426: anewarray java/lang/Object
    //   1429: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   1432: iconst_0
    //   1433: anewarray java/lang/Object
    //   1436: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1439: ifnonnull -> 1455
    //   1442: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1445: bipush #95
    //   1447: aaload
    //   1448: goto -> 1475
    //   1451: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1454: athrow
    //   1455: aload_2
    //   1456: iconst_0
    //   1457: anewarray java/lang/Object
    //   1460: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   1463: iconst_0
    //   1464: anewarray java/lang/Object
    //   1467: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1470: invokeinterface getName : ()Ljava/lang/String;
    //   1475: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1478: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1481: astore #27
    //   1483: aload #27
    //   1485: bipush #73
    //   1487: aaload
    //   1488: aload_2
    //   1489: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1492: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1495: aload #27
    //   1497: bipush #49
    //   1499: aaload
    //   1500: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   1503: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1506: aload #27
    //   1508: bipush #74
    //   1510: aaload
    //   1511: aload_2
    //   1512: iconst_0
    //   1513: anewarray java/lang/Object
    //   1516: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1519: iconst_0
    //   1520: anewarray java/lang/Object
    //   1523: invokevirtual Vulcan_r : ([Ljava/lang/Object;)D
    //   1526: iconst_1
    //   1527: anewarray java/lang/Object
    //   1530: dup_x2
    //   1531: dup_x2
    //   1532: pop
    //   1533: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1536: iconst_0
    //   1537: swap
    //   1538: aastore
    //   1539: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1542: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1545: aload #27
    //   1547: bipush #60
    //   1549: aaload
    //   1550: aload_2
    //   1551: iconst_0
    //   1552: anewarray java/lang/Object
    //   1555: invokevirtual Vulcan_v : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XR;
    //   1558: iconst_0
    //   1559: anewarray java/lang/Object
    //   1562: invokevirtual Vulcan_W : ([Ljava/lang/Object;)D
    //   1565: invokestatic toString : (D)Ljava/lang/String;
    //   1568: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1571: aload #27
    //   1573: bipush #50
    //   1575: aaload
    //   1576: aload_2
    //   1577: iconst_0
    //   1578: anewarray java/lang/Object
    //   1581: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1584: iconst_0
    //   1585: anewarray java/lang/Object
    //   1588: invokevirtual Vulcan_z : ([Ljava/lang/Object;)D
    //   1591: iconst_1
    //   1592: anewarray java/lang/Object
    //   1595: dup_x2
    //   1596: dup_x2
    //   1597: pop
    //   1598: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1601: iconst_0
    //   1602: swap
    //   1603: aastore
    //   1604: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1607: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1610: aload #27
    //   1612: bipush #65
    //   1614: aaload
    //   1615: aload_3
    //   1616: invokevirtual getCategory : ()Ljava/lang/String;
    //   1619: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1622: lload #11
    //   1624: dup2_x1
    //   1625: pop2
    //   1626: iconst_2
    //   1627: anewarray java/lang/Object
    //   1630: dup_x1
    //   1631: swap
    //   1632: iconst_1
    //   1633: swap
    //   1634: aastore
    //   1635: dup_x2
    //   1636: dup_x2
    //   1637: pop
    //   1638: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1641: iconst_0
    //   1642: swap
    //   1643: aastore
    //   1644: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1647: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1650: aload #27
    //   1652: bipush #44
    //   1654: aaload
    //   1655: aload_2
    //   1656: iconst_0
    //   1657: anewarray java/lang/Object
    //   1660: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   1663: iconst_0
    //   1664: anewarray java/lang/Object
    //   1667: invokevirtual Vulcan_u : ([Ljava/lang/Object;)D
    //   1670: iconst_1
    //   1671: anewarray java/lang/Object
    //   1674: dup_x2
    //   1675: dup_x2
    //   1676: pop
    //   1677: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1680: iconst_0
    //   1681: swap
    //   1682: aastore
    //   1683: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1686: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1689: aload #27
    //   1691: bipush #9
    //   1693: aaload
    //   1694: aload_2
    //   1695: iconst_0
    //   1696: anewarray java/lang/Object
    //   1699: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1702: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   1707: invokeinterface getName : ()Ljava/lang/String;
    //   1712: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1715: aload #27
    //   1717: bipush #76
    //   1719: aaload
    //   1720: aload_3
    //   1721: lload #15
    //   1723: iconst_1
    //   1724: anewarray java/lang/Object
    //   1727: dup_x2
    //   1728: dup_x2
    //   1729: pop
    //   1730: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1733: iconst_0
    //   1734: swap
    //   1735: aastore
    //   1736: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   1739: invokeinterface complexType : ()Ljava/lang/String;
    //   1744: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1747: aload #27
    //   1749: bipush #11
    //   1751: aaload
    //   1752: aload_3
    //   1753: iconst_0
    //   1754: anewarray java/lang/Object
    //   1757: invokevirtual Vulcan_y : ([Ljava/lang/Object;)D
    //   1760: iconst_1
    //   1761: anewarray java/lang/Object
    //   1764: dup_x2
    //   1765: dup_x2
    //   1766: pop
    //   1767: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1770: iconst_0
    //   1771: swap
    //   1772: aastore
    //   1773: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1776: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1779: aload #27
    //   1781: bipush #83
    //   1783: aaload
    //   1784: aload_3
    //   1785: invokevirtual getBuffer : ()D
    //   1788: aload_3
    //   1789: iconst_0
    //   1790: anewarray java/lang/Object
    //   1793: invokevirtual Vulcan_y : ([Ljava/lang/Object;)D
    //   1796: ddiv
    //   1797: invokestatic toString : (D)Ljava/lang/String;
    //   1800: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1803: aload #27
    //   1805: bipush #62
    //   1807: aaload
    //   1808: aload_2
    //   1809: iconst_0
    //   1810: anewarray java/lang/Object
    //   1813: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1816: iconst_1
    //   1817: anewarray java/lang/Object
    //   1820: dup_x1
    //   1821: swap
    //   1822: iconst_0
    //   1823: swap
    //   1824: aastore
    //   1825: invokestatic Vulcan_X : ([Ljava/lang/Object;)I
    //   1828: invokestatic toString : (I)Ljava/lang/String;
    //   1831: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1834: aload #27
    //   1836: bipush #30
    //   1838: aaload
    //   1839: aload_3
    //   1840: lload #15
    //   1842: iconst_1
    //   1843: anewarray java/lang/Object
    //   1846: dup_x2
    //   1847: dup_x2
    //   1848: pop
    //   1849: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1852: iconst_0
    //   1853: swap
    //   1854: aastore
    //   1855: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   1858: invokeinterface description : ()Ljava/lang/String;
    //   1863: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1866: aload #27
    //   1868: bipush #94
    //   1870: aaload
    //   1871: aload_0
    //   1872: getfield Vulcan_z : Ljava/text/DecimalFormat;
    //   1875: iconst_0
    //   1876: anewarray java/lang/Object
    //   1879: invokestatic Vulcan_S : ([Ljava/lang/Object;)D
    //   1882: invokevirtual format : (D)Ljava/lang/String;
    //   1885: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1888: aload #27
    //   1890: bipush #52
    //   1892: aaload
    //   1893: aload_3
    //   1894: lload #15
    //   1896: iconst_1
    //   1897: anewarray java/lang/Object
    //   1900: dup_x2
    //   1901: dup_x2
    //   1902: pop
    //   1903: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1906: iconst_0
    //   1907: swap
    //   1908: aastore
    //   1909: invokevirtual Vulcan_B : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/check/api/CheckInfo;
    //   1912: invokeinterface name : ()Ljava/lang/String;
    //   1917: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1920: lload #9
    //   1922: dup2_x1
    //   1923: pop2
    //   1924: iconst_2
    //   1925: anewarray java/lang/Object
    //   1928: dup_x1
    //   1929: swap
    //   1930: iconst_1
    //   1931: swap
    //   1932: aastore
    //   1933: dup_x2
    //   1934: dup_x2
    //   1935: pop
    //   1936: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1939: iconst_0
    //   1940: swap
    //   1941: aastore
    //   1942: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1945: invokespecial <init> : (Ljava/lang/String;)V
    //   1948: invokevirtual create : ()[Lnet/md_5/bungee/api/chat/BaseComponent;
    //   1951: invokespecial <init> : (Lnet/md_5/bungee/api/chat/HoverEvent$Action;[Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   1954: invokevirtual setHoverEvent : (Lnet/md_5/bungee/api/chat/HoverEvent;)V
    //   1957: aload #19
    //   1959: iload #5
    //   1961: ifgt -> 2003
    //   1964: ifnull -> 1996
    //   1967: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MQ : Z
    //   1970: ifeq -> 2006
    //   1973: aload_0
    //   1974: getfield Vulcan_Z : Ljava/util/Set;
    //   1977: aload #21
    //   1979: <illegal opcode> accept : (Lnet/md_5/bungee/api/chat/TextComponent;)Ljava/util/function/Consumer;
    //   1984: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   1989: goto -> 1996
    //   1992: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1995: athrow
    //   1996: iload #4
    //   1998: iflt -> 2029
    //   2001: aload #19
    //   2003: ifnonnull -> 2036
    //   2006: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   2009: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2012: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   2015: aload_0
    //   2016: aload #21
    //   2018: <illegal opcode> run : (Lme/frep/vulcan/spigot/Vulcan_XP;Lnet/md_5/bungee/api/chat/TextComponent;)Ljava/lang/Runnable;
    //   2023: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   2028: pop
    //   2029: goto -> 2036
    //   2032: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2035: athrow
    //   2036: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #591	-> 124
    //   #593	-> 146
    //   #595	-> 171
    //   #597	-> 195
    //   #598	-> 232
    //   #599	-> 258
    //   #600	-> 288
    //   #601	-> 301
    //   #602	-> 344
    //   #603	-> 354
    //   #604	-> 366
    //   #605	-> 398
    //   #606	-> 463
    //   #607	-> 494
    //   #608	-> 526
    //   #609	-> 552
    //   #610	-> 567
    //   #611	-> 606
    //   #612	-> 668
    //   #613	-> 707
    //   #614	-> 746
    //   #615	-> 776
    //   #616	-> 795
    //   #617	-> 814
    //   #618	-> 846
    //   #619	-> 878
    //   #620	-> 917
    //   #621	-> 990
    //   #622	-> 1005
    //   #624	-> 1039
    //   #625	-> 1071
    //   #626	-> 1093
    //   #625	-> 1111
    //   #627	-> 1114
    //   #629	-> 1119
    //   #630	-> 1133
    //   #631	-> 1143
    //   #633	-> 1146
    //   #634	-> 1178
    //   #635	-> 1219
    //   #637	-> 1244
    //   #639	-> 1278
    //   #640	-> 1281
    //   #642	-> 1286
    //   #643	-> 1316
    //   #644	-> 1338
    //   #645	-> 1380
    //   #646	-> 1396
    //   #647	-> 1424
    //   #648	-> 1489
    //   #649	-> 1503
    //   #650	-> 1512
    //   #651	-> 1551
    //   #652	-> 1577
    //   #653	-> 1616
    //   #654	-> 1656
    //   #655	-> 1695
    //   #656	-> 1721
    //   #657	-> 1753
    //   #658	-> 1785
    //   #659	-> 1809
    //   #660	-> 1840
    //   #661	-> 1875
    //   #662	-> 1894
    //   #642	-> 1924
    //   #662	-> 1948
    //   #642	-> 1954
    //   #664	-> 1957
    //   #665	-> 1973
    //   #667	-> 2006
    //   #669	-> 2036
    // Exception table:
    //   from	to	target	type
    //   124	138	141	java/lang/RuntimeException
    //   155	163	166	java/lang/RuntimeException
    //   195	425	425	java/lang/RuntimeException
    //   1178	1200	1203	java/lang/RuntimeException
    //   1188	1212	1215	java/lang/RuntimeException
    //   1207	1227	1230	java/lang/RuntimeException
    //   1234	1271	1274	java/lang/RuntimeException
    //   1286	1451	1451	java/lang/RuntimeException
    //   1970	1989	1992	java/lang/RuntimeException
    //   1996	2029	2032	java/lang/RuntimeException
  }
  
  private static void lambda$handleVerbose$11(TextComponent paramTextComponent, Player paramPlayer) {
    paramPlayer.spigot().sendMessage((BaseComponent)paramTextComponent);
  }
  
  private void lambda$handleVerbose$13(TextComponent paramTextComponent) {
    this.Vulcan_Z.forEach(paramTextComponent::lambda$handleVerbose$12);
  }
  
  private static void lambda$handleVerbose$12(TextComponent paramTextComponent, Player paramPlayer) {
    paramPlayer.spigot().sendMessage((BaseComponent)paramTextComponent);
  }
  
  public void Vulcan_T(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/entity/Player
    //   7: astore #5
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/String
    //   15: astore #7
    //   17: dup
    //   18: iconst_2
    //   19: aaload
    //   20: checkcast java/lang/String
    //   23: astore #6
    //   25: dup
    //   26: iconst_3
    //   27: aaload
    //   28: checkcast java/lang/Long
    //   31: invokevirtual longValue : ()J
    //   34: lstore_2
    //   35: dup
    //   36: iconst_4
    //   37: aaload
    //   38: checkcast java/lang/String
    //   41: astore #4
    //   43: pop
    //   44: getstatic me/frep/vulcan/spigot/Vulcan_XP.a : J
    //   47: lload_2
    //   48: lxor
    //   49: lstore_2
    //   50: lload_2
    //   51: dup2
    //   52: ldc2_w 121430448501556
    //   55: lxor
    //   56: lstore #8
    //   58: dup2
    //   59: ldc2_w 40914610903533
    //   62: lxor
    //   63: lstore #10
    //   65: dup2
    //   66: ldc2_w 135468398222039
    //   69: lxor
    //   70: lstore #12
    //   72: pop2
    //   73: invokestatic Vulcan_b : ()Ljava/lang/String;
    //   76: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   79: invokevirtual Vulcan_Y : ()Lme/frep/vulcan/spigot/Vulcan_Xc;
    //   82: aload #5
    //   84: iconst_1
    //   85: anewarray java/lang/Object
    //   88: dup_x1
    //   89: swap
    //   90: iconst_0
    //   91: swap
    //   92: aastore
    //   93: invokevirtual Vulcan_U : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_hu;
    //   96: astore #15
    //   98: astore #14
    //   100: aload #15
    //   102: ifnonnull -> 110
    //   105: return
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_ds : Z
    //   113: aload #14
    //   115: ifnull -> 200
    //   118: ifeq -> 197
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   127: athrow
    //   128: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   131: invokevirtual Vulcan_D : ()Z
    //   134: aload #14
    //   136: ifnull -> 200
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: ifeq -> 197
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload #15
    //   158: iconst_0
    //   159: anewarray java/lang/Object
    //   162: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   165: invokestatic isBedrockPlayer : (Lorg/bukkit/entity/Player;)Z
    //   168: aload #14
    //   170: lload_2
    //   171: lconst_0
    //   172: lcmp
    //   173: ifle -> 202
    //   176: ifnull -> 200
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: ifeq -> 197
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   195: athrow
    //   196: return
    //   197: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_ds : Z
    //   200: aload #14
    //   202: ifnull -> 297
    //   205: ifeq -> 294
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   218: invokevirtual Vulcan_W : ()Z
    //   221: aload #14
    //   223: ifnull -> 297
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   232: athrow
    //   233: ifeq -> 294
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: invokestatic getInstance : ()Lorg/geysermc/floodgate/api/FloodgateApi;
    //   246: aload #15
    //   248: iconst_0
    //   249: anewarray java/lang/Object
    //   252: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   255: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   260: invokeinterface isFloodgatePlayer : (Ljava/util/UUID;)Z
    //   265: aload #14
    //   267: lload_2
    //   268: lconst_0
    //   269: lcmp
    //   270: ifle -> 299
    //   273: ifnull -> 297
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   282: athrow
    //   283: ifeq -> 294
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   292: athrow
    //   293: return
    //   294: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yV : Z
    //   297: aload #14
    //   299: ifnull -> 360
    //   302: ifeq -> 357
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   311: athrow
    //   312: aload #15
    //   314: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   317: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   320: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   323: iconst_0
    //   324: aaload
    //   325: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   328: aload #14
    //   330: lload_2
    //   331: lconst_0
    //   332: lcmp
    //   333: ifle -> 362
    //   336: ifnull -> 360
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   345: athrow
    //   346: ifeq -> 357
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   355: athrow
    //   356: return
    //   357: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_C : Z
    //   360: aload #14
    //   362: ifnull -> 424
    //   365: ifeq -> 421
    //   368: goto -> 375
    //   371: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   374: athrow
    //   375: aload #15
    //   377: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   380: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   383: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   386: bipush #41
    //   388: aaload
    //   389: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   392: aload #14
    //   394: lload_2
    //   395: lconst_0
    //   396: lcmp
    //   397: ifle -> 426
    //   400: ifnull -> 424
    //   403: goto -> 410
    //   406: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   409: athrow
    //   410: ifeq -> 421
    //   413: goto -> 420
    //   416: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   419: athrow
    //   420: return
    //   421: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yx : Z
    //   424: aload #14
    //   426: ifnull -> 497
    //   429: ifeq -> 494
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   438: athrow
    //   439: aload #15
    //   441: iconst_0
    //   442: anewarray java/lang/Object
    //   445: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   448: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   453: invokevirtual toString : ()Ljava/lang/String;
    //   456: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   459: bipush #23
    //   461: aaload
    //   462: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   465: aload #14
    //   467: lload_2
    //   468: lconst_0
    //   469: lcmp
    //   470: ifle -> 499
    //   473: ifnull -> 497
    //   476: goto -> 483
    //   479: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   482: athrow
    //   483: ifeq -> 494
    //   486: goto -> 493
    //   489: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   492: athrow
    //   493: return
    //   494: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GO : Z
    //   497: aload #14
    //   499: ifnull -> 551
    //   502: ifeq -> 555
    //   505: goto -> 512
    //   508: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   511: athrow
    //   512: aload #15
    //   514: iconst_0
    //   515: anewarray java/lang/Object
    //   518: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   521: invokeinterface getName : ()Ljava/lang/String;
    //   526: aload #14
    //   528: ifnull -> 569
    //   531: goto -> 538
    //   534: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   537: athrow
    //   538: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Mp : Ljava/lang/String;
    //   541: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   544: goto -> 551
    //   547: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   550: athrow
    //   551: ifeq -> 555
    //   554: return
    //   555: aload #15
    //   557: iconst_0
    //   558: anewarray java/lang/Object
    //   561: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   564: invokeinterface getName : ()Ljava/lang/String;
    //   569: astore #16
    //   571: aload #15
    //   573: iconst_0
    //   574: anewarray java/lang/Object
    //   577: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   580: iconst_0
    //   581: anewarray java/lang/Object
    //   584: invokevirtual Vulcan_r : ([Ljava/lang/Object;)D
    //   587: iconst_1
    //   588: anewarray java/lang/Object
    //   591: dup_x2
    //   592: dup_x2
    //   593: pop
    //   594: invokestatic valueOf : (D)Ljava/lang/Double;
    //   597: iconst_0
    //   598: swap
    //   599: aastore
    //   600: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   603: astore #17
    //   605: aload #15
    //   607: iconst_0
    //   608: anewarray java/lang/Object
    //   611: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   614: iconst_0
    //   615: anewarray java/lang/Object
    //   618: invokevirtual Vulcan_z : ([Ljava/lang/Object;)D
    //   621: iconst_1
    //   622: anewarray java/lang/Object
    //   625: dup_x2
    //   626: dup_x2
    //   627: pop
    //   628: invokestatic valueOf : (D)Ljava/lang/Double;
    //   631: iconst_0
    //   632: swap
    //   633: aastore
    //   634: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   637: astore #18
    //   639: aload #15
    //   641: iconst_0
    //   642: anewarray java/lang/Object
    //   645: invokevirtual Vulcan_x : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_Ke;
    //   648: iconst_0
    //   649: anewarray java/lang/Object
    //   652: invokevirtual Vulcan_u : ([Ljava/lang/Object;)D
    //   655: iconst_1
    //   656: anewarray java/lang/Object
    //   659: dup_x2
    //   660: dup_x2
    //   661: pop
    //   662: invokestatic valueOf : (D)Ljava/lang/Double;
    //   665: iconst_0
    //   666: swap
    //   667: aastore
    //   668: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   671: astore #19
    //   673: aload #15
    //   675: iconst_0
    //   676: anewarray java/lang/Object
    //   679: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   682: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   687: invokeinterface getName : ()Ljava/lang/String;
    //   692: astore #20
    //   694: aload #15
    //   696: iconst_0
    //   697: anewarray java/lang/Object
    //   700: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   703: iconst_1
    //   704: anewarray java/lang/Object
    //   707: dup_x1
    //   708: swap
    //   709: iconst_0
    //   710: swap
    //   711: aastore
    //   712: invokestatic Vulcan_X : ([Ljava/lang/Object;)I
    //   715: invokestatic toString : (I)Ljava/lang/String;
    //   718: astore #21
    //   720: iconst_0
    //   721: anewarray java/lang/Object
    //   724: invokestatic Vulcan_S : ([Ljava/lang/Object;)D
    //   727: iconst_1
    //   728: anewarray java/lang/Object
    //   731: dup_x2
    //   732: dup_x2
    //   733: pop
    //   734: invokestatic valueOf : (D)Ljava/lang/Double;
    //   737: iconst_0
    //   738: swap
    //   739: aastore
    //   740: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   743: astore #22
    //   745: aload #15
    //   747: invokevirtual getTotalViolations : ()I
    //   750: invokestatic toString : (I)Ljava/lang/String;
    //   753: astore #23
    //   755: aload #15
    //   757: iconst_0
    //   758: anewarray java/lang/Object
    //   761: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   764: lload #10
    //   766: dup2_x1
    //   767: pop2
    //   768: iconst_2
    //   769: anewarray java/lang/Object
    //   772: dup_x1
    //   773: swap
    //   774: iconst_1
    //   775: swap
    //   776: aastore
    //   777: dup_x2
    //   778: dup_x2
    //   779: pop
    //   780: invokestatic valueOf : (J)Ljava/lang/Long;
    //   783: iconst_0
    //   784: swap
    //   785: aastore
    //   786: invokestatic Vulcan_g : ([Ljava/lang/Object;)Ljava/lang/String;
    //   789: astore #24
    //   791: aload #15
    //   793: iconst_0
    //   794: anewarray java/lang/Object
    //   797: invokevirtual Vulcan_v : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_XR;
    //   800: iconst_0
    //   801: anewarray java/lang/Object
    //   804: invokevirtual Vulcan_W : ([Ljava/lang/Object;)D
    //   807: iconst_1
    //   808: anewarray java/lang/Object
    //   811: dup_x2
    //   812: dup_x2
    //   813: pop
    //   814: invokestatic valueOf : (D)Ljava/lang/Double;
    //   817: iconst_0
    //   818: swap
    //   819: aastore
    //   820: invokestatic Vulcan_f : ([Ljava/lang/Object;)Ljava/lang/String;
    //   823: astore #25
    //   825: lload_2
    //   826: lconst_0
    //   827: lcmp
    //   828: iflt -> 844
    //   831: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lq : Z
    //   834: ifne -> 844
    //   837: goto -> 2690
    //   840: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   843: athrow
    //   844: lload #8
    //   846: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_d8 : Ljava/lang/String;
    //   849: iconst_2
    //   850: anewarray java/lang/Object
    //   853: dup_x1
    //   854: swap
    //   855: iconst_1
    //   856: swap
    //   857: aastore
    //   858: dup_x2
    //   859: dup_x2
    //   860: pop
    //   861: invokestatic valueOf : (J)Ljava/lang/Long;
    //   864: iconst_0
    //   865: swap
    //   866: aastore
    //   867: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   870: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   873: bipush #89
    //   875: aaload
    //   876: aload #16
    //   878: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   881: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   884: bipush #52
    //   886: aaload
    //   887: aload #7
    //   889: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   892: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   895: bipush #39
    //   897: aaload
    //   898: aload #6
    //   900: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   903: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   906: bipush #28
    //   908: aaload
    //   909: aload #4
    //   911: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   914: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   917: bipush #49
    //   919: aaload
    //   920: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   923: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   926: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   929: bipush #60
    //   931: aaload
    //   932: aload #25
    //   934: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   937: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   940: bipush #73
    //   942: aaload
    //   943: aload #15
    //   945: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   948: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   951: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   954: bipush #74
    //   956: aaload
    //   957: aload #17
    //   959: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   962: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   965: bipush #50
    //   967: aaload
    //   968: aload #18
    //   970: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   973: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   976: bipush #13
    //   978: aaload
    //   979: aload #15
    //   981: iconst_0
    //   982: anewarray java/lang/Object
    //   985: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   988: iconst_0
    //   989: anewarray java/lang/Object
    //   992: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   995: aload #14
    //   997: ifnull -> 1039
    //   1000: ifnonnull -> 1023
    //   1003: goto -> 1010
    //   1006: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1009: athrow
    //   1010: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1013: bipush #95
    //   1015: aaload
    //   1016: goto -> 1044
    //   1019: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1022: athrow
    //   1023: aload #15
    //   1025: iconst_0
    //   1026: anewarray java/lang/Object
    //   1029: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   1032: iconst_0
    //   1033: anewarray java/lang/Object
    //   1036: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1039: invokeinterface getName : ()Ljava/lang/String;
    //   1044: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1047: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1050: bipush #44
    //   1052: aaload
    //   1053: aload #19
    //   1055: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1058: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1061: bipush #9
    //   1063: aaload
    //   1064: aload #20
    //   1066: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1069: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1072: bipush #32
    //   1074: aaload
    //   1075: aload #23
    //   1077: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1080: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1083: bipush #62
    //   1085: aaload
    //   1086: aload #21
    //   1088: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1091: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1094: bipush #94
    //   1096: aaload
    //   1097: aload #22
    //   1099: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1102: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1105: lload_2
    //   1106: lconst_0
    //   1107: lcmp
    //   1108: iflt -> 1139
    //   1111: bipush #19
    //   1113: aaload
    //   1114: aload #24
    //   1116: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1119: aload #14
    //   1121: ifnull -> 1205
    //   1124: lload #12
    //   1126: iconst_2
    //   1127: anewarray java/lang/Object
    //   1130: dup_x2
    //   1131: dup_x2
    //   1132: pop
    //   1133: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1136: iconst_1
    //   1137: swap
    //   1138: aastore
    //   1139: dup_x1
    //   1140: swap
    //   1141: iconst_0
    //   1142: swap
    //   1143: aastore
    //   1144: lload_2
    //   1145: lconst_0
    //   1146: lcmp
    //   1147: ifle -> 1202
    //   1150: invokestatic Vulcan_F : ([Ljava/lang/Object;)V
    //   1153: aload_0
    //   1154: getfield Vulcan_j : Ljava/util/Set;
    //   1157: invokeinterface isEmpty : ()Z
    //   1162: ifeq -> 1179
    //   1165: goto -> 1172
    //   1168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1171: athrow
    //   1172: goto -> 2535
    //   1175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1178: athrow
    //   1179: lload #8
    //   1181: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dp : Ljava/lang/String;
    //   1184: iconst_2
    //   1185: anewarray java/lang/Object
    //   1188: dup_x1
    //   1189: swap
    //   1190: iconst_1
    //   1191: swap
    //   1192: aastore
    //   1193: dup_x2
    //   1194: dup_x2
    //   1195: pop
    //   1196: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1199: iconst_0
    //   1200: swap
    //   1201: aastore
    //   1202: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1205: astore #26
    //   1207: lload_2
    //   1208: lconst_0
    //   1209: lcmp
    //   1210: ifle -> 1238
    //   1213: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   1216: invokevirtual Vulcan_x : ()Z
    //   1219: ifeq -> 1238
    //   1222: aload #15
    //   1224: iconst_0
    //   1225: anewarray java/lang/Object
    //   1228: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1231: aload #26
    //   1233: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   1236: astore #26
    //   1238: new net/md_5/bungee/api/chat/TextComponent
    //   1241: dup
    //   1242: lload #8
    //   1244: aload #26
    //   1246: iconst_2
    //   1247: anewarray java/lang/Object
    //   1250: dup_x1
    //   1251: swap
    //   1252: iconst_1
    //   1253: swap
    //   1254: aastore
    //   1255: dup_x2
    //   1256: dup_x2
    //   1257: pop
    //   1258: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1261: iconst_0
    //   1262: swap
    //   1263: aastore
    //   1264: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1267: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1270: bipush #89
    //   1272: aaload
    //   1273: aload #16
    //   1275: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1278: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1281: bipush #62
    //   1283: aaload
    //   1284: aload #21
    //   1286: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1289: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1292: bipush #94
    //   1294: aaload
    //   1295: aload #22
    //   1297: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1300: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1303: bipush #73
    //   1305: aaload
    //   1306: aload #15
    //   1308: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1311: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1314: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1317: bipush #28
    //   1319: aaload
    //   1320: aload #4
    //   1322: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1325: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1328: bipush #60
    //   1330: aaload
    //   1331: aload #25
    //   1333: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1336: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1339: bipush #49
    //   1341: aaload
    //   1342: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   1345: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1348: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1351: bipush #74
    //   1353: aaload
    //   1354: aload #17
    //   1356: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1359: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1362: bipush #50
    //   1364: aaload
    //   1365: aload #18
    //   1367: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1370: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1373: bipush #44
    //   1375: aaload
    //   1376: aload #19
    //   1378: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1381: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1384: bipush #13
    //   1386: aaload
    //   1387: aload #15
    //   1389: iconst_0
    //   1390: anewarray java/lang/Object
    //   1393: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   1396: iconst_0
    //   1397: anewarray java/lang/Object
    //   1400: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1403: ifnonnull -> 1419
    //   1406: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1409: bipush #95
    //   1411: aaload
    //   1412: goto -> 1440
    //   1415: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1418: athrow
    //   1419: aload #15
    //   1421: iconst_0
    //   1422: anewarray java/lang/Object
    //   1425: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   1428: iconst_0
    //   1429: anewarray java/lang/Object
    //   1432: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1435: invokeinterface getName : ()Ljava/lang/String;
    //   1440: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1443: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1446: astore #35
    //   1448: aload #35
    //   1450: bipush #9
    //   1452: aaload
    //   1453: aload #20
    //   1455: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1458: aload #35
    //   1460: bipush #32
    //   1462: aaload
    //   1463: aload #23
    //   1465: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1468: aload #35
    //   1470: bipush #52
    //   1472: aaload
    //   1473: aload #7
    //   1475: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1478: aload #35
    //   1480: bipush #19
    //   1482: aaload
    //   1483: aload #24
    //   1485: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1488: aload #35
    //   1490: bipush #39
    //   1492: aaload
    //   1493: aload #6
    //   1495: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1498: invokestatic fromLegacyText : (Ljava/lang/String;)[Lnet/md_5/bungee/api/chat/BaseComponent;
    //   1501: invokespecial <init> : ([Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   1504: astore #27
    //   1506: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G_ : Ljava/util/List;
    //   1509: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1514: astore #28
    //   1516: aload #28
    //   1518: invokeinterface hasNext : ()Z
    //   1523: ifeq -> 1633
    //   1526: aload #28
    //   1528: invokeinterface next : ()Ljava/lang/Object;
    //   1533: checkcast java/lang/String
    //   1536: astore #29
    //   1538: aload #27
    //   1540: new net/md_5/bungee/api/chat/ClickEvent
    //   1543: dup
    //   1544: getstatic net/md_5/bungee/api/chat/ClickEvent$Action.RUN_COMMAND : Lnet/md_5/bungee/api/chat/ClickEvent$Action;
    //   1547: aload #29
    //   1549: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1552: bipush #89
    //   1554: aaload
    //   1555: aload #15
    //   1557: iconst_0
    //   1558: anewarray java/lang/Object
    //   1561: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1564: invokeinterface getName : ()Ljava/lang/String;
    //   1569: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1572: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1575: bipush #77
    //   1577: aaload
    //   1578: aload #15
    //   1580: iconst_0
    //   1581: anewarray java/lang/Object
    //   1584: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1587: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   1592: invokevirtual toString : ()Ljava/lang/String;
    //   1595: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1598: invokespecial <init> : (Lnet/md_5/bungee/api/chat/ClickEvent$Action;Ljava/lang/String;)V
    //   1601: invokevirtual setClickEvent : (Lnet/md_5/bungee/api/chat/ClickEvent;)V
    //   1604: aload #14
    //   1606: lload_2
    //   1607: lconst_0
    //   1608: lcmp
    //   1609: iflt -> 1617
    //   1612: ifnull -> 2535
    //   1615: aload #14
    //   1617: ifnonnull -> 1516
    //   1620: lload_2
    //   1621: lconst_0
    //   1622: lcmp
    //   1623: ifle -> 1604
    //   1626: goto -> 1633
    //   1629: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1632: athrow
    //   1633: new java/lang/StringBuilder
    //   1636: dup
    //   1637: invokespecial <init> : ()V
    //   1640: astore #28
    //   1642: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_d9 : Ljava/util/List;
    //   1645: invokeinterface size : ()I
    //   1650: istore #29
    //   1652: iconst_1
    //   1653: istore #30
    //   1655: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_d9 : Ljava/util/List;
    //   1658: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1663: astore #31
    //   1665: aload #31
    //   1667: invokeinterface hasNext : ()Z
    //   1672: ifeq -> 1785
    //   1675: aload #31
    //   1677: invokeinterface next : ()Ljava/lang/Object;
    //   1682: checkcast java/lang/String
    //   1685: astore #32
    //   1687: aload #14
    //   1689: lload_2
    //   1690: lconst_0
    //   1691: lcmp
    //   1692: iflt -> 1747
    //   1695: ifnull -> 1745
    //   1698: iload #30
    //   1700: aload #14
    //   1702: lload_2
    //   1703: lconst_0
    //   1704: lcmp
    //   1705: iflt -> 2551
    //   1708: ifnull -> 2543
    //   1711: goto -> 1718
    //   1714: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1717: athrow
    //   1718: iload #29
    //   1720: if_icmpne -> 1756
    //   1723: goto -> 1730
    //   1726: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1729: athrow
    //   1730: aload #28
    //   1732: aload #32
    //   1734: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1737: pop
    //   1738: goto -> 1745
    //   1741: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1744: athrow
    //   1745: aload #14
    //   1747: lload_2
    //   1748: lconst_0
    //   1749: lcmp
    //   1750: iflt -> 1782
    //   1753: ifnonnull -> 1777
    //   1756: aload #28
    //   1758: aload #32
    //   1760: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1763: ldc_w '\\n'
    //   1766: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1769: pop
    //   1770: goto -> 1777
    //   1773: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1776: athrow
    //   1777: iinc #30, 1
    //   1780: aload #14
    //   1782: ifnonnull -> 1665
    //   1785: aload #28
    //   1787: invokevirtual toString : ()Ljava/lang/String;
    //   1790: lload #8
    //   1792: dup2_x1
    //   1793: pop2
    //   1794: iconst_2
    //   1795: anewarray java/lang/Object
    //   1798: dup_x1
    //   1799: swap
    //   1800: iconst_1
    //   1801: swap
    //   1802: aastore
    //   1803: dup_x2
    //   1804: dup_x2
    //   1805: pop
    //   1806: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1809: iconst_0
    //   1810: swap
    //   1811: aastore
    //   1812: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1815: astore #31
    //   1817: lload_2
    //   1818: lconst_0
    //   1819: lcmp
    //   1820: ifle -> 1854
    //   1823: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   1826: invokevirtual Vulcan_x : ()Z
    //   1829: lload_2
    //   1830: lconst_0
    //   1831: lcmp
    //   1832: iflt -> 2543
    //   1835: ifeq -> 1854
    //   1838: aload #15
    //   1840: iconst_0
    //   1841: anewarray java/lang/Object
    //   1844: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1847: aload #31
    //   1849: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   1852: astore #31
    //   1854: aload #31
    //   1856: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1859: bipush #89
    //   1861: aaload
    //   1862: aload #16
    //   1864: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1867: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1870: bipush #52
    //   1872: aaload
    //   1873: aload #7
    //   1875: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1878: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1881: bipush #49
    //   1883: aaload
    //   1884: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_G6 : Ljava/lang/String;
    //   1887: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1890: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1893: bipush #73
    //   1895: aaload
    //   1896: aload #15
    //   1898: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   1901: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1904: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1907: bipush #74
    //   1909: aaload
    //   1910: aload #17
    //   1912: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1915: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1918: bipush #50
    //   1920: aaload
    //   1921: aload #18
    //   1923: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1926: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1929: bipush #44
    //   1931: aaload
    //   1932: aload #19
    //   1934: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1937: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1940: bipush #9
    //   1942: aaload
    //   1943: aload #20
    //   1945: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1948: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1951: bipush #60
    //   1953: aaload
    //   1954: aload #25
    //   1956: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1959: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1962: bipush #19
    //   1964: aaload
    //   1965: aload #24
    //   1967: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1970: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1973: bipush #32
    //   1975: aaload
    //   1976: aload #23
    //   1978: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1981: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   1984: bipush #59
    //   1986: aaload
    //   1987: aload #15
    //   1989: invokevirtual getCombatViolations : ()I
    //   1992: invokestatic toString : (I)Ljava/lang/String;
    //   1995: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1998: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2001: bipush #47
    //   2003: aaload
    //   2004: aload #15
    //   2006: invokevirtual getMovementViolations : ()I
    //   2009: invokestatic toString : (I)Ljava/lang/String;
    //   2012: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2015: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2018: bipush #6
    //   2020: aaload
    //   2021: aload #15
    //   2023: invokevirtual getPlayerViolations : ()I
    //   2026: invokestatic toString : (I)Ljava/lang/String;
    //   2029: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2032: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2035: bipush #62
    //   2037: aaload
    //   2038: aload #21
    //   2040: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2043: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2046: bipush #13
    //   2048: aaload
    //   2049: aload #15
    //   2051: iconst_0
    //   2052: anewarray java/lang/Object
    //   2055: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   2058: iconst_0
    //   2059: anewarray java/lang/Object
    //   2062: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2065: aload #14
    //   2067: ifnull -> 2109
    //   2070: ifnonnull -> 2093
    //   2073: goto -> 2080
    //   2076: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2079: athrow
    //   2080: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2083: bipush #95
    //   2085: aaload
    //   2086: goto -> 2114
    //   2089: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2092: athrow
    //   2093: aload #15
    //   2095: iconst_0
    //   2096: anewarray java/lang/Object
    //   2099: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KQ;
    //   2102: iconst_0
    //   2103: anewarray java/lang/Object
    //   2106: invokevirtual Vulcan_r : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   2109: invokeinterface getName : ()Ljava/lang/String;
    //   2114: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2117: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2120: astore #35
    //   2122: aload #35
    //   2124: bipush #39
    //   2126: aaload
    //   2127: aload #6
    //   2129: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2132: aload #35
    //   2134: bipush #94
    //   2136: aaload
    //   2137: aload #22
    //   2139: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2142: aload #35
    //   2144: bipush #28
    //   2146: aaload
    //   2147: aload #4
    //   2149: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2152: aload #35
    //   2154: bipush #52
    //   2156: aaload
    //   2157: aload #7
    //   2159: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2162: lload #8
    //   2164: dup2_x1
    //   2165: pop2
    //   2166: iconst_2
    //   2167: anewarray java/lang/Object
    //   2170: dup_x1
    //   2171: swap
    //   2172: iconst_1
    //   2173: swap
    //   2174: aastore
    //   2175: dup_x2
    //   2176: dup_x2
    //   2177: pop
    //   2178: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2181: iconst_0
    //   2182: swap
    //   2183: aastore
    //   2184: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   2187: astore #32
    //   2189: aload #14
    //   2191: lload_2
    //   2192: lconst_0
    //   2193: lcmp
    //   2194: iflt -> 2252
    //   2197: ifnull -> 2244
    //   2200: iconst_0
    //   2201: anewarray java/lang/Object
    //   2204: invokestatic Vulcan_f : ([Ljava/lang/Object;)Z
    //   2207: ifeq -> 2255
    //   2210: goto -> 2217
    //   2213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2216: athrow
    //   2217: aload #27
    //   2219: new net/md_5/bungee/api/chat/HoverEvent
    //   2222: dup
    //   2223: getstatic net/md_5/bungee/api/chat/HoverEvent$Action.SHOW_TEXT : Lnet/md_5/bungee/api/chat/HoverEvent$Action;
    //   2226: aload #32
    //   2228: invokestatic fromLegacyText : (Ljava/lang/String;)[Lnet/md_5/bungee/api/chat/BaseComponent;
    //   2231: invokespecial <init> : (Lnet/md_5/bungee/api/chat/HoverEvent$Action;[Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   2234: invokevirtual setHoverEvent : (Lnet/md_5/bungee/api/chat/HoverEvent;)V
    //   2237: goto -> 2244
    //   2240: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2243: athrow
    //   2244: lload_2
    //   2245: lconst_0
    //   2246: lcmp
    //   2247: ifle -> 2282
    //   2250: aload #14
    //   2252: ifnonnull -> 2289
    //   2255: aload #27
    //   2257: new net/md_5/bungee/api/chat/HoverEvent
    //   2260: dup
    //   2261: getstatic net/md_5/bungee/api/chat/HoverEvent$Action.SHOW_TEXT : Lnet/md_5/bungee/api/chat/HoverEvent$Action;
    //   2264: new net/md_5/bungee/api/chat/ComponentBuilder
    //   2267: dup
    //   2268: aload #32
    //   2270: invokespecial <init> : (Ljava/lang/String;)V
    //   2273: invokevirtual create : ()[Lnet/md_5/bungee/api/chat/BaseComponent;
    //   2276: invokespecial <init> : (Lnet/md_5/bungee/api/chat/HoverEvent$Action;[Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   2279: invokevirtual setHoverEvent : (Lnet/md_5/bungee/api/chat/HoverEvent;)V
    //   2282: goto -> 2289
    //   2285: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2288: athrow
    //   2289: aload_0
    //   2290: getfield Vulcan_j : Ljava/util/Set;
    //   2293: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2298: astore #33
    //   2300: aload #33
    //   2302: invokeinterface hasNext : ()Z
    //   2307: ifeq -> 2465
    //   2310: aload #33
    //   2312: invokeinterface next : ()Ljava/lang/Object;
    //   2317: checkcast org/bukkit/entity/Player
    //   2320: astore #34
    //   2322: aload #34
    //   2324: invokeinterface getName : ()Ljava/lang/String;
    //   2329: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2332: bipush #70
    //   2334: aaload
    //   2335: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2338: lload_2
    //   2339: lconst_0
    //   2340: lcmp
    //   2341: iflt -> 2474
    //   2344: aload #14
    //   2346: ifnull -> 2474
    //   2349: aload #14
    //   2351: lload_2
    //   2352: lconst_0
    //   2353: lcmp
    //   2354: ifle -> 2407
    //   2357: ifnull -> 2399
    //   2360: goto -> 2367
    //   2363: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2366: athrow
    //   2367: ifne -> 2446
    //   2370: goto -> 2377
    //   2373: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2376: athrow
    //   2377: aload #34
    //   2379: invokeinterface getName : ()Ljava/lang/String;
    //   2384: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2387: iconst_3
    //   2388: aaload
    //   2389: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2392: goto -> 2399
    //   2395: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2398: athrow
    //   2399: lload_2
    //   2400: lconst_0
    //   2401: lcmp
    //   2402: iflt -> 2443
    //   2405: aload #14
    //   2407: ifnull -> 2443
    //   2410: ifne -> 2446
    //   2413: goto -> 2420
    //   2416: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2419: athrow
    //   2420: aload #34
    //   2422: invokeinterface getName : ()Ljava/lang/String;
    //   2427: getstatic me/frep/vulcan/spigot/Vulcan_XP.b : [Ljava/lang/String;
    //   2430: bipush #20
    //   2432: aaload
    //   2433: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2436: goto -> 2443
    //   2439: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2442: athrow
    //   2443: ifeq -> 2460
    //   2446: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2449: iconst_1
    //   2450: invokevirtual Vulcan_r : (Z)V
    //   2453: goto -> 2460
    //   2456: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2459: athrow
    //   2460: aload #14
    //   2462: ifnonnull -> 2300
    //   2465: lload_2
    //   2466: lconst_0
    //   2467: lcmp
    //   2468: ifle -> 2528
    //   2471: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MQ : Z
    //   2474: ifeq -> 2505
    //   2477: aload_0
    //   2478: getfield Vulcan_j : Ljava/util/Set;
    //   2481: aload #27
    //   2483: <illegal opcode> accept : (Lnet/md_5/bungee/api/chat/TextComponent;)Ljava/util/function/Consumer;
    //   2488: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   2493: aload #14
    //   2495: ifnonnull -> 2535
    //   2498: goto -> 2505
    //   2501: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2504: athrow
    //   2505: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   2508: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2511: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   2514: aload_0
    //   2515: aload #27
    //   2517: <illegal opcode> run : (Lme/frep/vulcan/spigot/Vulcan_XP;Lnet/md_5/bungee/api/chat/TextComponent;)Ljava/lang/Runnable;
    //   2522: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   2527: pop
    //   2528: goto -> 2535
    //   2531: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2534: athrow
    //   2535: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Ml : Ljava/util/List;
    //   2538: invokeinterface isEmpty : ()Z
    //   2543: lload_2
    //   2544: lconst_0
    //   2545: lcmp
    //   2546: iflt -> 2576
    //   2549: aload #14
    //   2551: ifnull -> 2576
    //   2554: ifeq -> 2570
    //   2557: goto -> 2564
    //   2560: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2563: athrow
    //   2564: lload_2
    //   2565: lconst_0
    //   2566: lcmp
    //   2567: ifge -> 2690
    //   2570: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2573: invokevirtual Vulcan_x : ()Z
    //   2576: ifeq -> 2637
    //   2579: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   2582: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2585: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   2588: aload #15
    //   2590: aload #16
    //   2592: aload #4
    //   2594: aload #7
    //   2596: aload #21
    //   2598: aload #17
    //   2600: aload #18
    //   2602: aload #19
    //   2604: aload #25
    //   2606: aload #20
    //   2608: aload #22
    //   2610: aload #24
    //   2612: aload #6
    //   2614: <illegal opcode> run : (Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;
    //   2619: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   2624: pop
    //   2625: aload #14
    //   2627: ifnonnull -> 2690
    //   2630: goto -> 2637
    //   2633: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2636: athrow
    //   2637: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   2640: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   2643: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   2646: aload #16
    //   2648: aload #15
    //   2650: aload #4
    //   2652: aload #7
    //   2654: aload #21
    //   2656: aload #17
    //   2658: aload #18
    //   2660: aload #19
    //   2662: aload #25
    //   2664: aload #20
    //   2666: aload #22
    //   2668: aload #24
    //   2670: aload #6
    //   2672: <illegal opcode> run : (Ljava/lang/String;Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;
    //   2677: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   2682: pop
    //   2683: goto -> 2690
    //   2686: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2689: athrow
    //   2690: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #672	-> 76
    //   #674	-> 100
    //   #676	-> 110
    //   #677	-> 197
    //   #679	-> 294
    //   #681	-> 357
    //   #682	-> 421
    //   #683	-> 494
    //   #685	-> 555
    //   #687	-> 571
    //   #688	-> 605
    //   #689	-> 639
    //   #690	-> 673
    //   #692	-> 694
    //   #693	-> 720
    //   #695	-> 745
    //   #697	-> 755
    //   #699	-> 791
    //   #702	-> 825
    //   #704	-> 844
    //   #705	-> 878
    //   #706	-> 889
    //   #707	-> 900
    //   #708	-> 911
    //   #709	-> 923
    //   #710	-> 934
    //   #711	-> 945
    //   #712	-> 959
    //   #713	-> 970
    //   #714	-> 979
    //   #715	-> 1055
    //   #716	-> 1066
    //   #717	-> 1077
    //   #718	-> 1088
    //   #719	-> 1099
    //   #720	-> 1116
    //   #704	-> 1119
    //   #723	-> 1153
    //   #725	-> 1179
    //   #727	-> 1207
    //   #728	-> 1222
    //   #731	-> 1238
    //   #732	-> 1246
    //   #733	-> 1275
    //   #734	-> 1286
    //   #735	-> 1297
    //   #736	-> 1308
    //   #737	-> 1322
    //   #738	-> 1333
    //   #739	-> 1345
    //   #740	-> 1356
    //   #741	-> 1367
    //   #742	-> 1378
    //   #743	-> 1387
    //   #744	-> 1455
    //   #745	-> 1465
    //   #746	-> 1475
    //   #747	-> 1485
    //   #748	-> 1495
    //   #732	-> 1498
    //   #750	-> 1506
    //   #751	-> 1538
    //   #752	-> 1557
    //   #753	-> 1580
    //   #751	-> 1601
    //   #754	-> 1604
    //   #756	-> 1633
    //   #757	-> 1642
    //   #758	-> 1652
    //   #760	-> 1655
    //   #761	-> 1687
    //   #762	-> 1730
    //   #764	-> 1756
    //   #766	-> 1777
    //   #767	-> 1780
    //   #769	-> 1785
    //   #771	-> 1817
    //   #772	-> 1838
    //   #775	-> 1854
    //   #776	-> 1864
    //   #777	-> 1875
    //   #778	-> 1887
    //   #779	-> 1898
    //   #780	-> 1912
    //   #781	-> 1923
    //   #782	-> 1934
    //   #783	-> 1945
    //   #784	-> 1956
    //   #785	-> 1967
    //   #786	-> 1978
    //   #787	-> 1989
    //   #788	-> 2006
    //   #789	-> 2023
    //   #790	-> 2040
    //   #791	-> 2049
    //   #792	-> 2129
    //   #793	-> 2139
    //   #794	-> 2149
    //   #795	-> 2159
    //   #775	-> 2166
    //   #797	-> 2189
    //   #798	-> 2217
    //   #800	-> 2255
    //   #803	-> 2289
    //   #804	-> 2322
    //   #805	-> 2379
    //   #806	-> 2422
    //   #807	-> 2460
    //   #809	-> 2465
    //   #810	-> 2477
    //   #812	-> 2505
    //   #818	-> 2535
    //   #820	-> 2570
    //   #821	-> 2579
    //   #840	-> 2637
    //   #861	-> 2690
    // Exception table:
    //   from	to	target	type
    //   100	106	106	java/lang/RuntimeException
    //   110	121	124	java/lang/RuntimeException
    //   118	139	142	java/lang/RuntimeException
    //   128	149	152	java/lang/RuntimeException
    //   146	179	182	java/lang/RuntimeException
    //   156	189	192	java/lang/RuntimeException
    //   200	208	211	java/lang/RuntimeException
    //   205	226	229	java/lang/RuntimeException
    //   215	236	239	java/lang/RuntimeException
    //   233	276	279	java/lang/RuntimeException
    //   243	286	289	java/lang/RuntimeException
    //   297	305	308	java/lang/RuntimeException
    //   302	339	342	java/lang/RuntimeException
    //   312	349	352	java/lang/RuntimeException
    //   360	368	371	java/lang/RuntimeException
    //   365	403	406	java/lang/RuntimeException
    //   375	413	416	java/lang/RuntimeException
    //   424	432	435	java/lang/RuntimeException
    //   429	476	479	java/lang/RuntimeException
    //   439	486	489	java/lang/RuntimeException
    //   497	505	508	java/lang/RuntimeException
    //   502	531	534	java/lang/RuntimeException
    //   512	544	547	java/lang/RuntimeException
    //   825	840	840	java/lang/RuntimeException
    //   844	1003	1006	java/lang/RuntimeException
    //   1000	1019	1019	java/lang/RuntimeException
    //   1044	1165	1168	java/lang/RuntimeException
    //   1124	1175	1175	java/lang/RuntimeException
    //   1238	1415	1415	java/lang/RuntimeException
    //   1538	1620	1629	java/lang/RuntimeException
    //   1687	1711	1714	java/lang/RuntimeException
    //   1698	1723	1726	java/lang/RuntimeException
    //   1718	1738	1741	java/lang/RuntimeException
    //   1745	1770	1773	java/lang/RuntimeException
    //   1854	2073	2076	java/lang/RuntimeException
    //   2070	2089	2089	java/lang/RuntimeException
    //   2189	2210	2213	java/lang/RuntimeException
    //   2200	2237	2240	java/lang/RuntimeException
    //   2244	2282	2285	java/lang/RuntimeException
    //   2322	2360	2363	java/lang/RuntimeException
    //   2349	2370	2373	java/lang/RuntimeException
    //   2367	2392	2395	java/lang/RuntimeException
    //   2399	2413	2416	java/lang/RuntimeException
    //   2410	2436	2439	java/lang/RuntimeException
    //   2443	2453	2456	java/lang/RuntimeException
    //   2474	2498	2501	java/lang/RuntimeException
    //   2477	2528	2531	java/lang/RuntimeException
    //   2543	2557	2560	java/lang/RuntimeException
    //   2576	2630	2633	java/lang/RuntimeException
    //   2579	2683	2686	java/lang/RuntimeException
  }
  
  private static void lambda$handleApiAlert$14(TextComponent paramTextComponent, Player paramPlayer) {
    paramPlayer.spigot().sendMessage((BaseComponent)paramTextComponent);
  }
  
  private void lambda$handleApiAlert$16(TextComponent paramTextComponent) {
    this.Vulcan_j.forEach(paramTextComponent::lambda$handleApiAlert$15);
  }
  
  private static void lambda$handleApiAlert$15(TextComponent paramTextComponent, Player paramPlayer) {
    paramPlayer.spigot().sendMessage((BaseComponent)paramTextComponent);
  }
  
  private static void lambda$handleApiAlert$18(Vulcan_hu paramVulcan_hu, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12) {
    // Byte code:
    //   0: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Ml : Ljava/util/List;
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: aload_3
    //   7: aload #4
    //   9: aload #5
    //   11: aload #6
    //   13: aload #7
    //   15: aload #8
    //   17: aload #9
    //   19: aload #10
    //   21: aload #11
    //   23: aload #12
    //   25: <illegal opcode> accept : (Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   30: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   35: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #822	-> 0
  }
  
  private static void lambda$handleApiAlert$17(Vulcan_hu paramVulcan_hu, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13) {
    long l1 = a ^ 0x5EC6E5AFAC81L, l2 = l1 ^ 0x32677567EF61L;
    String str = Vulcan_b();
    try {
      if (str != null) {
        try {
          if (paramVulcan_hu.Vulcan_r(new Object[0]).Vulcan_r(new Object[0]) == null) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        String[] arrayOfString = b;
        new Object[2];
        Vulcan_Xz.Vulcan_k(new Object[] { null, Long.valueOf(l2), PlaceholderAPI.setPlaceholders(paramVulcan_hu.Vulcan_L(new Object[0]), paramString13.replaceAll(b[64], paramString1).replaceAll(b[63], paramVulcan_hu.getClientBrand()).replaceAll(b[75], Vulcan_b0.Vulcan_G6).replaceAll(b[57], paramString2).replaceAll(b[80], paramString3).replaceAll(b[91], paramString4).replaceAll(b[34], paramString5).replaceAll(b[100], paramVulcan_hu.Vulcan_r(new Object[0]).Vulcan_r(new Object[0]).getName())
                .replaceAll(arrayOfString[5], paramString6)
                .replaceAll(arrayOfString[72], paramString7)
                .replaceAll(arrayOfString[36], paramString8)
                .replaceAll(arrayOfString[51], paramString9)
                .replaceAll(arrayOfString[96], Integer.toString(paramVulcan_hu.getTotalViolations()))
                .replaceAll(arrayOfString[71], paramString10)
                .replaceAll(arrayOfString[53], paramString11)
                .replaceAll(arrayOfString[10], paramString12)) });
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static void lambda$handleApiAlert$20(String paramString1, Vulcan_hu paramVulcan_hu, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12) {
    // Byte code:
    //   0: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Ml : Ljava/util/List;
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: aload_3
    //   7: aload #4
    //   9: aload #5
    //   11: aload #6
    //   13: aload #7
    //   15: aload #8
    //   17: aload #9
    //   19: aload #10
    //   21: aload #11
    //   23: aload #12
    //   25: <illegal opcode> accept : (Ljava/lang/String;Lme/frep/vulcan/spigot/Vulcan_hu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   30: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   35: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #841	-> 0
  }
  
  private static void lambda$handleApiAlert$19(String paramString1, Vulcan_hu paramVulcan_hu, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13) {
    long l1 = a ^ 0x2A83C6551C38L, l2 = l1 ^ 0x4622569D5FD8L;
    String str = Vulcan_b();
    try {
      if (str != null) {
        try {
          if (paramVulcan_hu.Vulcan_r(new Object[0]).Vulcan_r(new Object[0]) == null) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        String[] arrayOfString = b;
        new Object[2];
        Vulcan_Xz.Vulcan_k(new Object[] { null, Long.valueOf(l2), paramString13.replaceAll(b[89], paramString1).replaceAll(b[73], paramVulcan_hu.getClientBrand()).replaceAll(b[49], Vulcan_b0.Vulcan_G6).replaceAll(b[28], paramString2).replaceAll(b[13], paramVulcan_hu.Vulcan_r(new Object[0]).Vulcan_r(new Object[0]).getName())
              .replaceAll(arrayOfString[52], paramString3)
              .replaceAll(arrayOfString[62], paramString4)
              .replaceAll(arrayOfString[74], paramString5)
              .replaceAll(arrayOfString[50], paramString6)
              .replaceAll(arrayOfString[44], paramString7)
              .replaceAll(arrayOfString[60], paramString8)
              .replaceAll(arrayOfString[9], paramString9)
              .replaceAll(arrayOfString[32], Integer.toString(paramVulcan_hu.getTotalViolations()))
              .replaceAll(arrayOfString[94], paramString10)
              .replaceAll(arrayOfString[19], paramString11)
              .replaceAll(arrayOfString[39], paramString12) });
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private String Vulcan_f(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x184466F99664L;
    try {
      switch (i) {
        case 1:
          (new Object[2])[1] = Vulcan_b0.Vulcan_yW;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 2:
          (new Object[2])[1] = Vulcan_b0.Vulcan_G0;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 3:
          (new Object[2])[1] = Vulcan_b0.Vulcan_K;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 4:
          (new Object[2])[1] = Vulcan_b0.Vulcan_g;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 5:
          (new Object[2])[1] = Vulcan_b0.Vulcan_LC;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 6:
          (new Object[2])[1] = Vulcan_b0.Vulcan_GH;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 7:
          (new Object[2])[1] = Vulcan_b0.Vulcan_yM;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 8:
          (new Object[2])[1] = Vulcan_b0.Vulcan_MP;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 9:
          (new Object[2])[1] = Vulcan_b0.Vulcan_Ls;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
        case 10:
          (new Object[2])[1] = Vulcan_b0.Vulcan_GD;
          new Object[2];
          return Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) });
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "";
  }
  
  public void Vulcan_H(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    this.Vulcan_j.forEach(str::lambda$sendMessage$21);
  }
  
  private static void lambda$sendMessage$21(String paramString, Player paramPlayer) {
    long l1 = a ^ 0x2C1218CE1DBL, l2 = l1 ^ 0x521164CF1F3CL;
    (new Object[2])[1] = paramString;
    new Object[2];
    paramPlayer.sendMessage(Vulcan_KX.Vulcan_q(new Object[] { Long.valueOf(l2) }));
  }
  
  private void Vulcan_V(Object[] paramArrayOfObject) {
    Player player = (Player)paramArrayOfObject[0];
    String str = (String)paramArrayOfObject[1];
    long l = ((Long)paramArrayOfObject[2]).longValue();
    l = a ^ l;
    try {
      if (!Vulcan_b0.Vulcan_t)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ByteArrayDataOutput byteArrayDataOutput = ByteStreams.newDataOutput();
    String[] arrayOfString = b;
    byteArrayDataOutput.writeUTF(arrayOfString[99]);
    byteArrayDataOutput.writeUTF(str);
    player.sendPluginMessage((Plugin)Vulcan_K.INSTANCE.Vulcan_j(), arrayOfString[37], byteArrayDataOutput.toByteArray());
  }
  
  public static void Vulcan_T(String paramString) {
    Vulcan_J = paramString;
  }
  
  public static String Vulcan_b() {
    return Vulcan_J;
  }
  
  static {
    long l = a ^ 0x1F7DB61C9825L;
    Vulcan_T("njq7S");
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[102];
    boolean bool = false;
    String str;
    int i = (str = "R^¥¾>2Ü#\002ç¦\005a3\020\001û>\026dÄ-j>\004\000±Z\020R^¥¾>2Ü#\002ç¦\005a3\020\006r?a\033 g÷y°wÊn\027Õ\boÞÎ®¦¥\b´<b½Í« \030Ìl¼¹Ö£^zÔÝ\002&´KwÉµéN\020r\023 P¿/o[¥³´w}\020åFéÆªÅ(KícF_6Á¤æ\b¥\\)\013ÞÓª«\bÖ\037¡E0\\_9\020\\tçÇ_s\026%ËÍ×£®ð\boÞÎ®¦¥\020\025Æg-yôN\bDYÝE\031~\020\013Â_1ÊZ\006{ßù\021Ó9ð\020u¸OõxúõBÁbÛB\026U\020\025Æg-yô¤6ó8Ò\020è¬áI];7òZ@õ\034'\bwÿ¶ÅâKè\020;ES/;ð\016]_ñª­:\020\021j »\027ûA7ýH\036<\"\020\"Xò<î¾ÿù06uWÒ\027\\\030Êkä.ðÎ§^ºe\021³_X\013\tv\036²Yß\b<e!G÷·\002@\b¬çÿz\036\013\020\rÝ>5\020Í¥\021\032²\021\036\020\b÷l\001p @\bÆ\030\031ÇGyÝjA(¦¤Q?:Ã\024\000Ud_ph\bcX9rÝë\bìØá¯µ:\020o¨ÃÜ8£sÈNãC^N\bó\023Tds÷°\030o\000ûG\003s!D]/\\.º=+Êdv\030\020°§~WBEÏ¦\000>«Û\nöA\bÏY¾'¢|\021\030þ9Ã×Ó\000Â¡@Z¿ó¶U¼KPõµÀ\fmö\bc§\035OÅúÌ\020¢\003'8ycE{¿+ß¤a£\020.y\032ýüó;è(¸c\021|\006\bÖ\037¡E0\\_9\020°§~WBEÏ«çý>Á ¬\b÷l\001p @\bÆ\bÙ\036×Ò#ð\b\001ÔÂ\bÅ¾\bÈý\nH!÷iY\bc ßàøî\bNL¶9¹\007Ü4\030Êkä.ðÎ§^ºe\021³_X\013\tv\036²Yß\020Q«bUÇð­\nðÊZ°HÎ¿\0209t`ÓãÉ²ÈÍB\031%@ÏÐx\b´<b½Í« \b¥\\)\013ÞÓª«\bÛ}±G\021×V\036\020;ES/;ð\016]_ñª­:\020o¨ÃÜ8£sÈNãC^N\bìØá¯µ:\020\\tçÇ_s\026%ËÍ×£®ð\bcX9rÝë\020à4ìøé2/yJ\023îrf\003Þ\030\031ÇGyÝjA(¦¤Q?:Ã\024\000Ud_ph\bc§\035OÅúÌ\b\001ÔÂ\bÅ¾\bË­ðF%Û\007\020þ9Ã×Ó\000Â¡ïO\021òIé¨\020ê\017Ã8Ù±LtnJZ\020¥rÎ\020ç}ÍóqÆU{CðÝ³p\021~\020ç}ÍóqÆU{CðÝ³p\021~\b]\006í}ïï¦\b]\006í}ïï¦\020à4ìøé2/yJ\023îrf\003Þ\020þ°¤kCk|MSõ\001O\bA´{ÅÍj¥`\bÈý\nH!÷iY\020þ9Ã×Ó\000Â¡ïO\021òIé¨\bÏY¾'¢|\021\0209t`ÓãÉ²ÈÍB\031%@ÏÐx\020Ò¿Ó+ ¢\007í°)\001F\007\bc ßàøî\030þ9Ã×Ó\000Â¡@Z¿ó¶U¼KPõµÀ\fmö\020C^§\004P\004`P_iì¯[7\bÛ}±G\021×V\036\020E\022±PÛ2¤s-ÌJ_\f\020Ã.ÓåÞý>] ½à¶Lä=L\020Q«bUÇð­\nðÊZ°HÎ¿\020\001û>\026dÄ-j>\004\000±Z\bq!àPÀ|\035©\030Ìl¼¹Ö£^zÔÝ\002&´KwÉµéN\020\025Æg-yô¤6ó8Ò\020ê<>ci¶°²°¼¡dSÞæ\020ê\017Ã8Ù±LtnJZ\020¥rÎ\020E\022±PÛ2¤s-ÌJ_\f\bË­ðF%Û\007\020åFéÆªÅ(KícF_6Á¤æ\020.y\032ýüó;è(¸c\021|\006\bA´{ÅÍj¥`\bÙ\036×Ò#ð\030o\000ûG\003s!D]/\\.º=+Êdv\030\b<e!G÷·\002@\020Ò¿Ó+ ¢\007í°)\001F\007\b\002¿|Z´}[").length();
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
