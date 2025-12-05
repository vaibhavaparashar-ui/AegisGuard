package me.frep.aegisguard.spigot.AegisGuard_Xa;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.wrapper.PacketWrapper;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerHeldItemChange;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPing;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWindowConfirmation;
import java.lang.invoke.MethodHandles;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;

public final class aegisguard_Xa {
  private static AbstractCheck[] aegisguard_j;
  
  private static final long a = aegisguard_e.a(-3471927017734101486L, 5085063316459193320L, MethodHandles.lookup().lookupClass()).a(162447722100429L);
  
  private static final String[] b;
  
  private aegisguard_Xa() {
    throw new UnsupportedOperationException(b[6]);
  }
  
  public static ClientVersion aegisguard_j(Object[] paramArrayOfObject) {
    Player player = (Player)paramArrayOfObject[0];
    return PacketEvents.getAPI().getPlayerManager().getClientVersion(player);
  }
  
  public static String aegisguard_g(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/entity/Player
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: aload #4
    //   33: ifnonnull -> 66
    //   36: iconst_1
    //   37: anewarray java/lang/Object
    //   40: dup_x1
    //   41: swap
    //   42: iconst_0
    //   43: swap
    //   44: aastore
    //   45: invokestatic aegisguard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   48: ifnull -> 137
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   65: athrow
    //   66: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.b : [Ljava/lang/String;
    //   69: iconst_0
    //   70: aaload
    //   71: invokeinterface hasMetadata : (Ljava/lang/String;)Z
    //   76: lload_2
    //   77: lconst_0
    //   78: lcmp
    //   79: iflt -> 134
    //   82: aload #4
    //   84: ifnonnull -> 134
    //   87: ifne -> 137
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   96: athrow
    //   97: aload_1
    //   98: aload #4
    //   100: lload_2
    //   101: lconst_0
    //   102: lcmp
    //   103: iflt -> 152
    //   106: ifnonnull -> 148
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   115: athrow
    //   116: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.b : [Ljava/lang/String;
    //   119: bipush #7
    //   121: aaload
    //   122: invokeinterface hasMetadata : (Ljava/lang/String;)Z
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   133: athrow
    //   134: ifeq -> 147
    //   137: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.b : [Ljava/lang/String;
    //   140: iconst_1
    //   141: aaload
    //   142: areturn
    //   143: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   146: athrow
    //   147: aload_1
    //   148: iconst_1
    //   149: anewarray java/lang/Object
    //   152: dup_x1
    //   153: swap
    //   154: iconst_0
    //   155: swap
    //   156: aastore
    //   157: invokestatic aegisguard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   160: invokevirtual toString : ()Ljava/lang/String;
    //   163: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.b : [Ljava/lang/String;
    //   166: iconst_4
    //   167: aaload
    //   168: ldc ''
    //   170: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   173: ldc '_'
    //   175: ldc '.'
    //   177: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   180: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #37	-> 30
    //   #38	-> 137
    //   #40	-> 147
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   36	59	62	java/lang/UnsupportedOperationException
    //   66	90	93	java/lang/UnsupportedOperationException
    //   87	109	112	java/lang/UnsupportedOperationException
    //   97	127	130	java/lang/UnsupportedOperationException
    //   134	143	143	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_m(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/entity/Player
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: iconst_1
    //   32: anewarray java/lang/Object
    //   35: dup_x1
    //   36: swap
    //   37: iconst_0
    //   38: swap
    //   39: aastore
    //   40: invokestatic aegisguard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifnull -> 147
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_1
    //   59: iconst_1
    //   60: anewarray java/lang/Object
    //   63: dup_x1
    //   64: swap
    //   65: iconst_0
    //   66: swap
    //   67: aastore
    //   68: invokestatic aegisguard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: getstatic com/github/retrooper/packetevents/protocol/player/ClientVersion.UNKNOWN : Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   81: lload_2
    //   82: lconst_0
    //   83: lcmp
    //   84: ifle -> 125
    //   87: aload #4
    //   89: ifnonnull -> 125
    //   92: if_acmpeq -> 147
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   101: athrow
    //   102: aload_1
    //   103: iconst_1
    //   104: anewarray java/lang/Object
    //   107: dup_x1
    //   108: swap
    //   109: iconst_0
    //   110: swap
    //   111: aastore
    //   112: invokestatic aegisguard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   115: getstatic com/github/retrooper/packetevents/protocol/player/ClientVersion.V_1_9 : Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   124: athrow
    //   125: invokevirtual isNewerThanOrEquals : (Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;)Z
    //   128: aload #4
    //   130: ifnonnull -> 144
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
    //   #44	-> 30
    //   #45	-> 103
    //   #44	-> 148
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	95	98	java/lang/UnsupportedOperationException
    //   92	118	121	java/lang/UnsupportedOperationException
    //   125	136	139	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_p(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/entity/Player
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_1
    //   32: anewarray java/lang/Object
    //   35: dup_x1
    //   36: swap
    //   37: iconst_0
    //   38: swap
    //   39: aastore
    //   40: invokestatic aegisguard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   43: aload #4
    //   45: ifnonnull -> 78
    //   48: ifnull -> 147
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   57: athrow
    //   58: aload_3
    //   59: iconst_1
    //   60: anewarray java/lang/Object
    //   63: dup_x1
    //   64: swap
    //   65: iconst_0
    //   66: swap
    //   67: aastore
    //   68: invokestatic aegisguard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   77: athrow
    //   78: getstatic com/github/retrooper/packetevents/protocol/player/ClientVersion.UNKNOWN : Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   81: lload_1
    //   82: lconst_0
    //   83: lcmp
    //   84: ifle -> 125
    //   87: aload #4
    //   89: ifnonnull -> 125
    //   92: if_acmpeq -> 147
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   101: athrow
    //   102: aload_3
    //   103: iconst_1
    //   104: anewarray java/lang/Object
    //   107: dup_x1
    //   108: swap
    //   109: iconst_0
    //   110: swap
    //   111: aastore
    //   112: invokestatic aegisguard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   115: getstatic com/github/retrooper/packetevents/protocol/player/ClientVersion.V_1_13 : Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   124: athrow
    //   125: invokevirtual isNewerThanOrEquals : (Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;)Z
    //   128: aload #4
    //   130: ifnonnull -> 144
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
    //   #49	-> 30
    //   #50	-> 103
    //   #49	-> 148
    // Exception table:
    //   from	to	target	type
    //   30	51	54	java/lang/UnsupportedOperationException
    //   48	71	74	java/lang/UnsupportedOperationException
    //   78	95	98	java/lang/UnsupportedOperationException
    //   92	118	121	java/lang/UnsupportedOperationException
    //   125	136	139	java/lang/UnsupportedOperationException
  }
  
  public static int aegisguard_X(Object[] paramArrayOfObject) {
    Player player = (Player)paramArrayOfObject[0];
    return PacketEvents.getAPI().getPlayerManager().getPing(player);
  }
  
  public static void aegisguard_v(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    PacketWrapper packetWrapper = (PacketWrapper)paramArrayOfObject[1];
    PacketEvents.getAPI().getProtocolManager().sendPacket(aegisguard_hu.aegisguard_p(new Object[0]).getChannel(), packetWrapper);
  }
  
  public static boolean aegisguard_o(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    return aegisguard_j(new Object[] { aegisguard_hu.aegisguard_L(new Object[0]) }).isNewerThanOrEquals(ClientVersion.V_1_17);
  }
  
  public static boolean aegisguard_b(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    return aegisguard_j(new Object[] { aegisguard_hu.aegisguard_L(new Object[0]) }).isNewerThan(ClientVersion.V_1_9);
  }
  
  public static boolean aegisguard_Z(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    return aegisguard_j(new Object[] { aegisguard_hu.aegisguard_L(new Object[0]) }).isNewerThanOrEquals(ClientVersion.V_1_13);
  }
  
  public static void aegisguard_V(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    int i = ((Integer)paramArrayOfObject[1]).intValue();
    aegisguard_v(new Object[] { null, new WrapperPlayServerWindowConfirmation(0, i, false), aegisguard_hu });
  }
  
  public static void aegisguard_b(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    int i = ((Integer)paramArrayOfObject[1]).intValue();
    aegisguard_v(new Object[] { null, new WrapperPlayServerPing(i), aegisguard_hu });
  }
  
  public static boolean aegisguard_L(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/entity/Player
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   37: aload #4
    //   39: ifnonnull -> 65
    //   42: ifeq -> 84
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   51: athrow
    //   52: aload_3
    //   53: invokeinterface isSwimming : ()Z
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   64: athrow
    //   65: aload #4
    //   67: ifnonnull -> 81
    //   70: ifeq -> 84
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   79: athrow
    //   80: iconst_1
    //   81: goto -> 85
    //   84: iconst_0
    //   85: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #82	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	45	48	java/lang/UnsupportedOperationException
    //   42	58	61	java/lang/UnsupportedOperationException
    //   65	73	76	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_c(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: iflt -> 144
    //   95: ifnonnull -> 142
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: invokevirtual isSolid : ()Z
    //   142: aload #4
    //   144: lload_1
    //   145: lconst_0
    //   146: lcmp
    //   147: ifle -> 200
    //   150: ifnonnull -> 198
    //   153: ifeq -> 217
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   162: athrow
    //   163: aload_3
    //   164: iconst_0
    //   165: anewarray java/lang/Object
    //   168: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   171: iconst_0
    //   172: anewarray java/lang/Object
    //   175: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   178: bipush #19
    //   180: invokeinterface get : (I)Ljava/lang/Object;
    //   185: checkcast org/bukkit/Material
    //   188: invokevirtual isSolid : ()Z
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   197: athrow
    //   198: aload #4
    //   200: ifnonnull -> 214
    //   203: ifeq -> 217
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   212: athrow
    //   213: iconst_1
    //   214: goto -> 218
    //   217: iconst_0
    //   218: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #86	-> 30
    //   #88	-> 114
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   142	156	159	java/lang/UnsupportedOperationException
    //   153	191	194	java/lang/UnsupportedOperationException
    //   198	206	209	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_K(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_1
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_1
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_2
    //   90: lconst_0
    //   91: lcmp
    //   92: iflt -> 144
    //   95: ifnonnull -> 142
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_1
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: invokevirtual isSolid : ()Z
    //   142: aload #4
    //   144: lload_2
    //   145: lconst_0
    //   146: lcmp
    //   147: iflt -> 200
    //   150: ifnonnull -> 198
    //   153: ifeq -> 217
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   162: athrow
    //   163: aload_1
    //   164: iconst_0
    //   165: anewarray java/lang/Object
    //   168: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   171: iconst_0
    //   172: anewarray java/lang/Object
    //   175: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   178: bipush #19
    //   180: invokeinterface get : (I)Ljava/lang/Object;
    //   185: checkcast org/bukkit/Material
    //   188: invokevirtual isSolid : ()Z
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   197: athrow
    //   198: aload #4
    //   200: ifnonnull -> 214
    //   203: ifeq -> 217
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   212: athrow
    //   213: iconst_1
    //   214: goto -> 218
    //   217: iconst_0
    //   218: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #92	-> 30
    //   #94	-> 114
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   142	156	159	java/lang/UnsupportedOperationException
    //   153	191	194	java/lang/UnsupportedOperationException
    //   198	206	209	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_J(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: iflt -> 144
    //   95: ifnonnull -> 142
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: invokevirtual isSolid : ()Z
    //   142: aload #4
    //   144: ifnonnull -> 208
    //   147: ifne -> 207
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   156: athrow
    //   157: aload_3
    //   158: iconst_0
    //   159: anewarray java/lang/Object
    //   162: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   165: iconst_0
    //   166: anewarray java/lang/Object
    //   169: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   172: bipush #19
    //   174: invokeinterface get : (I)Ljava/lang/Object;
    //   179: checkcast org/bukkit/Material
    //   182: invokevirtual isSolid : ()Z
    //   185: aload #4
    //   187: ifnonnull -> 208
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   196: athrow
    //   197: ifeq -> 211
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   206: athrow
    //   207: iconst_1
    //   208: goto -> 212
    //   211: iconst_0
    //   212: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #98	-> 30
    //   #100	-> 114
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   142	150	153	java/lang/UnsupportedOperationException
    //   147	190	193	java/lang/UnsupportedOperationException
    //   157	200	203	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_G(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: ifle -> 144
    //   95: ifnonnull -> 142
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: invokevirtual isSolid : ()Z
    //   142: aload #4
    //   144: ifnonnull -> 208
    //   147: ifne -> 207
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   156: athrow
    //   157: aload_3
    //   158: iconst_0
    //   159: anewarray java/lang/Object
    //   162: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   165: iconst_0
    //   166: anewarray java/lang/Object
    //   169: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   172: bipush #19
    //   174: invokeinterface get : (I)Ljava/lang/Object;
    //   179: checkcast org/bukkit/Material
    //   182: invokevirtual isSolid : ()Z
    //   185: aload #4
    //   187: ifnonnull -> 208
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   196: athrow
    //   197: ifeq -> 211
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   206: athrow
    //   207: iconst_1
    //   208: goto -> 212
    //   211: iconst_0
    //   212: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #104	-> 30
    //   #106	-> 114
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   142	150	153	java/lang/UnsupportedOperationException
    //   147	190	193	java/lang/UnsupportedOperationException
    //   157	200	203	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_v(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/entity/Player
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   37: aload #4
    //   39: ifnonnull -> 68
    //   42: ifeq -> 87
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   51: athrow
    //   52: aload_3
    //   53: getstatic org/bukkit/potion/PotionEffectType.DOLPHINS_GRACE : Lorg/bukkit/potion/PotionEffectType;
    //   56: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   67: athrow
    //   68: aload #4
    //   70: ifnonnull -> 84
    //   73: ifeq -> 87
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   82: athrow
    //   83: iconst_1
    //   84: goto -> 88
    //   87: iconst_0
    //   88: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #110	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	45	48	java/lang/UnsupportedOperationException
    //   42	61	64	java/lang/UnsupportedOperationException
    //   68	76	79	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_X(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: iflt -> 153
    //   95: ifnonnull -> 151
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: iconst_1
    //   140: anewarray java/lang/Object
    //   143: dup_x1
    //   144: swap
    //   145: iconst_0
    //   146: swap
    //   147: aastore
    //   148: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   151: aload #4
    //   153: ifnonnull -> 226
    //   156: ifne -> 225
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   165: athrow
    //   166: aload_3
    //   167: iconst_0
    //   168: anewarray java/lang/Object
    //   171: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   174: iconst_0
    //   175: anewarray java/lang/Object
    //   178: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   181: bipush #19
    //   183: invokeinterface get : (I)Ljava/lang/Object;
    //   188: checkcast org/bukkit/Material
    //   191: iconst_1
    //   192: anewarray java/lang/Object
    //   195: dup_x1
    //   196: swap
    //   197: iconst_0
    //   198: swap
    //   199: aastore
    //   200: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   203: aload #4
    //   205: ifnonnull -> 226
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   214: athrow
    //   215: ifeq -> 229
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   224: athrow
    //   225: iconst_1
    //   226: goto -> 230
    //   229: iconst_0
    //   230: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #114	-> 30
    //   #116	-> 114
    //   #117	-> 167
    //   #116	-> 230
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   151	159	162	java/lang/UnsupportedOperationException
    //   156	208	211	java/lang/UnsupportedOperationException
    //   166	218	221	java/lang/UnsupportedOperationException
  }
  
  public static double aegisguard_h(Object[] paramArrayOfObject) {
    Player player1 = (Player)paramArrayOfObject[0], player2 = (Player)paramArrayOfObject[1];
    return Math.abs(180.0F - Math.abs(player1.getLocation().getYaw() - player2.getLocation().getYaw()));
  }
  
  public static boolean aegisguard_y(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: ifle -> 153
    //   95: ifnonnull -> 151
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: iconst_1
    //   140: anewarray java/lang/Object
    //   143: dup_x1
    //   144: swap
    //   145: iconst_0
    //   146: swap
    //   147: aastore
    //   148: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   151: aload #4
    //   153: ifnonnull -> 226
    //   156: ifne -> 225
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   165: athrow
    //   166: aload_3
    //   167: iconst_0
    //   168: anewarray java/lang/Object
    //   171: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   174: iconst_0
    //   175: anewarray java/lang/Object
    //   178: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   181: bipush #19
    //   183: invokeinterface get : (I)Ljava/lang/Object;
    //   188: checkcast org/bukkit/Material
    //   191: iconst_1
    //   192: anewarray java/lang/Object
    //   195: dup_x1
    //   196: swap
    //   197: iconst_0
    //   198: swap
    //   199: aastore
    //   200: invokestatic aegisguard_j : ([Ljava/lang/Object;)Z
    //   203: aload #4
    //   205: ifnonnull -> 226
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   214: athrow
    //   215: ifeq -> 229
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   224: athrow
    //   225: iconst_1
    //   226: goto -> 230
    //   229: iconst_0
    //   230: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #126	-> 30
    //   #128	-> 114
    //   #129	-> 167
    //   #128	-> 230
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   151	159	162	java/lang/UnsupportedOperationException
    //   156	208	211	java/lang/UnsupportedOperationException
    //   166	218	221	java/lang/UnsupportedOperationException
  }
  
  public static List aegisguard_I(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[1];
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    List<Material> list = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_H(new Object[0]);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (list != null) {
        
        } else {
          return linkedList;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (list.isEmpty())
            return linkedList; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        linkedList.add(list.get(0));
        linkedList.add(list.get(1));
        linkedList.add(list.get(2));
        linkedList.add(list.get(12));
        linkedList.add(list.get(13));
        linkedList.add(list.get(14));
        linkedList.add(list.get(24));
        linkedList.add(list.get(25));
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    linkedList.add(list.get(26));
    return linkedList;
  }
  
  public static List aegisguard_v(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    List<Material> list = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_H(new Object[0]);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (list != null) {
        
        } else {
          return linkedList;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (list.isEmpty())
            return linkedList; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        linkedList.add(list.get(6));
        linkedList.add(list.get(7));
        linkedList.add(list.get(8));
        linkedList.add(list.get(18));
        linkedList.add(list.get(19));
        linkedList.add(list.get(20));
        linkedList.add(list.get(30));
        linkedList.add(list.get(31));
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    linkedList.add(list.get(32));
    return linkedList;
  }
  
  public static List aegisguard_d(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    List<Material> list = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Y(new Object[0]);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (list != null) {
        
        } else {
          return linkedList;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (list.isEmpty())
            return linkedList; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        linkedList.add(list.get(6));
        linkedList.add(list.get(7));
        linkedList.add(list.get(8));
        linkedList.add(list.get(18));
        linkedList.add(list.get(19));
        linkedList.add(list.get(20));
        linkedList.add(list.get(30));
        linkedList.add(list.get(31));
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    linkedList.add(list.get(32));
    return linkedList;
  }
  
  public static List aegisguard_l(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    List<Material> list = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Y(new Object[0]);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (list != null) {
        
        } else {
          return linkedList;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (list.isEmpty())
            return linkedList; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        linkedList.add(list.get(0));
        linkedList.add(list.get(1));
        linkedList.add(list.get(2));
        linkedList.add(list.get(12));
        linkedList.add(list.get(13));
        linkedList.add(list.get(14));
        linkedList.add(list.get(24));
        linkedList.add(list.get(25));
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    linkedList.add(list.get(26));
    return linkedList;
  }
  
  public static List aegisguard_h(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    List<Material> list = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_H(new Object[0]);
    try {
      if (arrayOfAbstractCheck == null)
        if (list != null) {
        
        } else {
          return linkedList;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (list.isEmpty())
            return linkedList; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        linkedList.add(list.get(3));
        linkedList.add(list.get(4));
        linkedList.add(list.get(5));
        linkedList.add(list.get(6));
        linkedList.add(list.get(7));
        linkedList.add(list.get(8));
        linkedList.add(list.get(15));
        linkedList.add(list.get(16));
        linkedList.add(list.get(17));
        linkedList.add(list.get(18));
        linkedList.add(list.get(19));
        linkedList.add(list.get(20));
        linkedList.add(list.get(27));
        linkedList.add(list.get(28));
        linkedList.add(list.get(29));
        linkedList.add(list.get(30));
        linkedList.add(list.get(31));
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    linkedList.add(list.get(32));
    return linkedList;
  }
  
  public static List aegisguard_k(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[1];
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    List<Material> list = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Y(new Object[0]);
    try {
      if (arrayOfAbstractCheck == null)
        if (list != null) {
        
        } else {
          return linkedList;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (list.isEmpty())
            return linkedList; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        linkedList.add(list.get(3));
        linkedList.add(list.get(4));
        linkedList.add(list.get(5));
        linkedList.add(list.get(6));
        linkedList.add(list.get(7));
        linkedList.add(list.get(8));
        linkedList.add(list.get(15));
        linkedList.add(list.get(16));
        linkedList.add(list.get(17));
        linkedList.add(list.get(18));
        linkedList.add(list.get(19));
        linkedList.add(list.get(20));
        linkedList.add(list.get(27));
        linkedList.add(list.get(28));
        linkedList.add(list.get(29));
        linkedList.add(list.get(30));
        linkedList.add(list.get(31));
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    linkedList.add(list.get(32));
    return linkedList;
  }
  
  public static List aegisguard_u(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    List<Material> list = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Y(new Object[0]);
    try {
      if (arrayOfAbstractCheck == null)
        if (list != null) {
        
        } else {
          return linkedList;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (list.isEmpty())
            return linkedList; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        linkedList.add(list.get(9));
        linkedList.add(list.get(10));
        linkedList.add(list.get(11));
        linkedList.add(list.get(21));
        linkedList.add(list.get(22));
        linkedList.add(list.get(23));
        linkedList.add(list.get(33));
        linkedList.add(list.get(34));
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    linkedList.add(list.get(35));
    return linkedList;
  }
  
  public static List aegisguard_b(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[1];
    l = a ^ l;
    LinkedList<Material> linkedList = new LinkedList();
    List<Material> list = aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_H(new Object[0]);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (list != null) {
        
        } else {
          return linkedList;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null) {
        try {
          if (list.isEmpty())
            return linkedList; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        linkedList.add(list.get(9));
        linkedList.add(list.get(10));
        linkedList.add(list.get(11));
        linkedList.add(list.get(21));
        linkedList.add(list.get(22));
        linkedList.add(list.get(23));
        linkedList.add(list.get(33));
        linkedList.add(list.get(34));
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    linkedList.add(list.get(35));
    return linkedList;
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
    //   14: checkcast org/bukkit/entity/Player
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   37: aload #4
    //   39: ifnonnull -> 65
    //   42: ifeq -> 84
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   51: athrow
    //   52: aload_3
    //   53: invokeinterface isRiptiding : ()Z
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   64: athrow
    //   65: aload #4
    //   67: ifnonnull -> 81
    //   70: ifeq -> 84
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   79: athrow
    //   80: iconst_1
    //   81: goto -> 85
    //   84: iconst_0
    //   85: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #327	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	45	48	java/lang/UnsupportedOperationException
    //   42	58	61	java/lang/UnsupportedOperationException
    //   65	73	76	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_H(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/entity/Player
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   37: aload #4
    //   39: ifnonnull -> 65
    //   42: ifeq -> 84
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   51: athrow
    //   52: aload_1
    //   53: invokeinterface isGliding : ()Z
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   64: athrow
    //   65: aload #4
    //   67: ifnonnull -> 81
    //   70: ifeq -> 84
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   79: athrow
    //   80: iconst_1
    //   81: goto -> 85
    //   84: iconst_0
    //   85: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #331	-> 30
    // Exception table:
    //   from	to	target	type
    //   30	45	48	java/lang/UnsupportedOperationException
    //   42	58	61	java/lang/UnsupportedOperationException
    //   65	73	76	java/lang/UnsupportedOperationException
  }
  
  public static int aegisguard_F(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/entity/Player
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
    //   21: checkcast org/bukkit/potion/PotionEffectType
    //   24: astore #4
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   30: lload_2
    //   31: lxor
    //   32: lstore_2
    //   33: aload #4
    //   35: invokevirtual getId : ()I
    //   38: istore #6
    //   40: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   43: aload_1
    //   44: invokeinterface getActivePotionEffects : ()Ljava/util/Collection;
    //   49: invokeinterface iterator : ()Ljava/util/Iterator;
    //   54: astore #7
    //   56: astore #5
    //   58: aload #7
    //   60: invokeinterface hasNext : ()Z
    //   65: ifeq -> 137
    //   68: aload #7
    //   70: invokeinterface next : ()Ljava/lang/Object;
    //   75: checkcast org/bukkit/potion/PotionEffect
    //   78: astore #8
    //   80: iload #6
    //   82: aload #5
    //   84: ifnonnull -> 138
    //   87: aload #8
    //   89: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   92: invokevirtual getId : ()I
    //   95: aload #5
    //   97: ifnonnull -> 130
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   106: athrow
    //   107: if_icmpne -> 132
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: aload #8
    //   119: invokevirtual getAmplifier : ()I
    //   122: iconst_1
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   129: athrow
    //   130: iadd
    //   131: ireturn
    //   132: aload #5
    //   134: ifnull -> 58
    //   137: iconst_0
    //   138: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #335	-> 33
    //   #337	-> 43
    //   #338	-> 80
    //   #339	-> 117
    //   #341	-> 132
    //   #343	-> 137
    // Exception table:
    //   from	to	target	type
    //   80	100	103	java/lang/UnsupportedOperationException
    //   87	110	113	java/lang/UnsupportedOperationException
    //   107	123	126	java/lang/UnsupportedOperationException
  }
  
  public static double aegisguard_m(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[1];
    l = a ^ l;
    double d = 0.36D + (aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YS(new Object[0]) * 0.0675F + (aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_I(new Object[0]) - 0.2F) * 3.5F);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (d < 0.36D)
          d = 0.36D + (aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YS(new Object[0]) * 0.0675F);  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return d;
  }
  
  public static double aegisguard_P(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[1];
    l = a ^ l;
    double d = 0.4D + (aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YS(new Object[0]) * 0.0675F + (aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_I(new Object[0]) - 0.2F) * 3.5F);
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (d < 0.36D)
          d = 0.36D + (aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YS(new Object[0]) * 0.0675F);  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return d;
  }
  
  public static boolean aegisguard_N(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: lload_1
    //   26: dup2
    //   27: ldc2_w 9509972555337
    //   30: lxor
    //   31: lstore #4
    //   33: pop2
    //   34: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #6
    //   39: aload_3
    //   40: iconst_0
    //   41: anewarray java/lang/Object
    //   44: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   54: aload #6
    //   56: ifnonnull -> 91
    //   59: ifnull -> 117
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   68: athrow
    //   69: aload_3
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   90: athrow
    //   91: invokeinterface isEmpty : ()Z
    //   96: aload #6
    //   98: lload_1
    //   99: lconst_0
    //   100: lcmp
    //   101: iflt -> 173
    //   104: ifnonnull -> 171
    //   107: ifeq -> 123
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: iconst_0
    //   118: ireturn
    //   119: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   122: athrow
    //   123: aload_3
    //   124: iconst_0
    //   125: anewarray java/lang/Object
    //   128: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   138: bipush #13
    //   140: invokeinterface get : (I)Ljava/lang/Object;
    //   145: checkcast org/bukkit/Material
    //   148: lload #4
    //   150: iconst_2
    //   151: anewarray java/lang/Object
    //   154: dup_x2
    //   155: dup_x2
    //   156: pop
    //   157: invokestatic valueOf : (J)Ljava/lang/Long;
    //   160: iconst_1
    //   161: swap
    //   162: aastore
    //   163: dup_x1
    //   164: swap
    //   165: iconst_0
    //   166: swap
    //   167: aastore
    //   168: invokestatic aegisguard_Z : ([Ljava/lang/Object;)Z
    //   171: aload #6
    //   173: ifnonnull -> 307
    //   176: ifne -> 306
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   185: athrow
    //   186: aload_3
    //   187: iconst_0
    //   188: anewarray java/lang/Object
    //   191: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   194: iconst_0
    //   195: anewarray java/lang/Object
    //   198: invokevirtual aegisguard_C : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   201: lload #4
    //   203: iconst_2
    //   204: anewarray java/lang/Object
    //   207: dup_x2
    //   208: dup_x2
    //   209: pop
    //   210: invokestatic valueOf : (J)Ljava/lang/Long;
    //   213: iconst_1
    //   214: swap
    //   215: aastore
    //   216: dup_x1
    //   217: swap
    //   218: iconst_0
    //   219: swap
    //   220: aastore
    //   221: invokestatic aegisguard_Z : ([Ljava/lang/Object;)Z
    //   224: aload #6
    //   226: ifnonnull -> 307
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   235: athrow
    //   236: ifne -> 306
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   245: athrow
    //   246: aload_3
    //   247: iconst_0
    //   248: anewarray java/lang/Object
    //   251: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   254: iconst_0
    //   255: anewarray java/lang/Object
    //   258: invokevirtual aegisguard_N : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   261: lload #4
    //   263: iconst_2
    //   264: anewarray java/lang/Object
    //   267: dup_x2
    //   268: dup_x2
    //   269: pop
    //   270: invokestatic valueOf : (J)Ljava/lang/Long;
    //   273: iconst_1
    //   274: swap
    //   275: aastore
    //   276: dup_x1
    //   277: swap
    //   278: iconst_0
    //   279: swap
    //   280: aastore
    //   281: invokestatic aegisguard_Z : ([Ljava/lang/Object;)Z
    //   284: aload #6
    //   286: ifnonnull -> 307
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   295: athrow
    //   296: ifeq -> 310
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   305: athrow
    //   306: iconst_1
    //   307: goto -> 311
    //   310: iconst_0
    //   311: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #367	-> 39
    //   #369	-> 123
    //   #370	-> 187
    //   #369	-> 311
    // Exception table:
    //   from	to	target	type
    //   39	62	65	java/lang/UnsupportedOperationException
    //   59	84	87	java/lang/UnsupportedOperationException
    //   91	110	113	java/lang/UnsupportedOperationException
    //   107	119	119	java/lang/UnsupportedOperationException
    //   171	179	182	java/lang/UnsupportedOperationException
    //   176	229	232	java/lang/UnsupportedOperationException
    //   186	239	242	java/lang/UnsupportedOperationException
    //   236	289	292	java/lang/UnsupportedOperationException
    //   246	299	302	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_W(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: lload_1
    //   26: dup2
    //   27: ldc2_w 43022227863202
    //   30: lxor
    //   31: lstore #4
    //   33: pop2
    //   34: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #6
    //   39: aload_3
    //   40: iconst_0
    //   41: anewarray java/lang/Object
    //   44: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   54: aload #6
    //   56: ifnonnull -> 91
    //   59: ifnull -> 117
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   68: athrow
    //   69: aload_3
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   90: athrow
    //   91: invokeinterface isEmpty : ()Z
    //   96: aload #6
    //   98: lload_1
    //   99: lconst_0
    //   100: lcmp
    //   101: iflt -> 173
    //   104: ifnonnull -> 171
    //   107: ifeq -> 123
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: iconst_0
    //   118: ireturn
    //   119: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   122: athrow
    //   123: aload_3
    //   124: iconst_0
    //   125: anewarray java/lang/Object
    //   128: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   138: bipush #13
    //   140: invokeinterface get : (I)Ljava/lang/Object;
    //   145: checkcast org/bukkit/Material
    //   148: lload #4
    //   150: iconst_2
    //   151: anewarray java/lang/Object
    //   154: dup_x2
    //   155: dup_x2
    //   156: pop
    //   157: invokestatic valueOf : (J)Ljava/lang/Long;
    //   160: iconst_1
    //   161: swap
    //   162: aastore
    //   163: dup_x1
    //   164: swap
    //   165: iconst_0
    //   166: swap
    //   167: aastore
    //   168: invokestatic aegisguard_Z : ([Ljava/lang/Object;)Z
    //   171: aload #6
    //   173: ifnonnull -> 307
    //   176: ifne -> 306
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   185: athrow
    //   186: aload_3
    //   187: iconst_0
    //   188: anewarray java/lang/Object
    //   191: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   194: iconst_0
    //   195: anewarray java/lang/Object
    //   198: invokevirtual aegisguard_g : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   201: lload #4
    //   203: iconst_2
    //   204: anewarray java/lang/Object
    //   207: dup_x2
    //   208: dup_x2
    //   209: pop
    //   210: invokestatic valueOf : (J)Ljava/lang/Long;
    //   213: iconst_1
    //   214: swap
    //   215: aastore
    //   216: dup_x1
    //   217: swap
    //   218: iconst_0
    //   219: swap
    //   220: aastore
    //   221: invokestatic aegisguard_Z : ([Ljava/lang/Object;)Z
    //   224: aload #6
    //   226: ifnonnull -> 307
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   235: athrow
    //   236: ifne -> 306
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   245: athrow
    //   246: aload_3
    //   247: iconst_0
    //   248: anewarray java/lang/Object
    //   251: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   254: iconst_0
    //   255: anewarray java/lang/Object
    //   258: invokevirtual aegisguard_d : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   261: lload #4
    //   263: iconst_2
    //   264: anewarray java/lang/Object
    //   267: dup_x2
    //   268: dup_x2
    //   269: pop
    //   270: invokestatic valueOf : (J)Ljava/lang/Long;
    //   273: iconst_1
    //   274: swap
    //   275: aastore
    //   276: dup_x1
    //   277: swap
    //   278: iconst_0
    //   279: swap
    //   280: aastore
    //   281: invokestatic aegisguard_Z : ([Ljava/lang/Object;)Z
    //   284: aload #6
    //   286: ifnonnull -> 307
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   295: athrow
    //   296: ifeq -> 310
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   305: athrow
    //   306: iconst_1
    //   307: goto -> 311
    //   310: iconst_0
    //   311: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #374	-> 39
    //   #376	-> 123
    //   #377	-> 187
    //   #376	-> 311
    // Exception table:
    //   from	to	target	type
    //   39	62	65	java/lang/UnsupportedOperationException
    //   59	84	87	java/lang/UnsupportedOperationException
    //   91	110	113	java/lang/UnsupportedOperationException
    //   107	119	119	java/lang/UnsupportedOperationException
    //   171	179	182	java/lang/UnsupportedOperationException
    //   176	229	232	java/lang/UnsupportedOperationException
    //   186	239	242	java/lang/UnsupportedOperationException
    //   236	289	292	java/lang/UnsupportedOperationException
    //   246	299	302	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard__(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: lload_1
    //   26: dup2
    //   27: ldc2_w 6423139208220
    //   30: lxor
    //   31: lstore #4
    //   33: pop2
    //   34: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #6
    //   39: aload_3
    //   40: iconst_0
    //   41: anewarray java/lang/Object
    //   44: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   54: aload #6
    //   56: ifnonnull -> 91
    //   59: ifnull -> 117
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   68: athrow
    //   69: aload_3
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   90: athrow
    //   91: invokeinterface isEmpty : ()Z
    //   96: aload #6
    //   98: lload_1
    //   99: lconst_0
    //   100: lcmp
    //   101: ifle -> 173
    //   104: ifnonnull -> 171
    //   107: ifeq -> 123
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: iconst_0
    //   118: ireturn
    //   119: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   122: athrow
    //   123: aload_3
    //   124: iconst_0
    //   125: anewarray java/lang/Object
    //   128: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   138: bipush #16
    //   140: invokeinterface get : (I)Ljava/lang/Object;
    //   145: checkcast org/bukkit/Material
    //   148: lload #4
    //   150: iconst_2
    //   151: anewarray java/lang/Object
    //   154: dup_x2
    //   155: dup_x2
    //   156: pop
    //   157: invokestatic valueOf : (J)Ljava/lang/Long;
    //   160: iconst_1
    //   161: swap
    //   162: aastore
    //   163: dup_x1
    //   164: swap
    //   165: iconst_0
    //   166: swap
    //   167: aastore
    //   168: invokestatic aegisguard_KJ : ([Ljava/lang/Object;)Z
    //   171: aload #6
    //   173: ifnonnull -> 257
    //   176: ifne -> 256
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   185: athrow
    //   186: aload_3
    //   187: iconst_0
    //   188: anewarray java/lang/Object
    //   191: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   194: iconst_0
    //   195: anewarray java/lang/Object
    //   198: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   201: bipush #19
    //   203: invokeinterface get : (I)Ljava/lang/Object;
    //   208: checkcast org/bukkit/Material
    //   211: lload #4
    //   213: iconst_2
    //   214: anewarray java/lang/Object
    //   217: dup_x2
    //   218: dup_x2
    //   219: pop
    //   220: invokestatic valueOf : (J)Ljava/lang/Long;
    //   223: iconst_1
    //   224: swap
    //   225: aastore
    //   226: dup_x1
    //   227: swap
    //   228: iconst_0
    //   229: swap
    //   230: aastore
    //   231: invokestatic aegisguard_KJ : ([Ljava/lang/Object;)Z
    //   234: aload #6
    //   236: ifnonnull -> 257
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   245: athrow
    //   246: ifeq -> 260
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   255: athrow
    //   256: iconst_1
    //   257: goto -> 261
    //   260: iconst_0
    //   261: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #381	-> 39
    //   #383	-> 123
    // Exception table:
    //   from	to	target	type
    //   39	62	65	java/lang/UnsupportedOperationException
    //   59	84	87	java/lang/UnsupportedOperationException
    //   91	110	113	java/lang/UnsupportedOperationException
    //   107	119	119	java/lang/UnsupportedOperationException
    //   171	179	182	java/lang/UnsupportedOperationException
    //   176	239	242	java/lang/UnsupportedOperationException
    //   186	249	252	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_s(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: lload_1
    //   26: dup2
    //   27: ldc2_w 29911358216760
    //   30: lxor
    //   31: lstore #4
    //   33: pop2
    //   34: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #6
    //   39: aload_3
    //   40: iconst_0
    //   41: anewarray java/lang/Object
    //   44: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   54: aload #6
    //   56: ifnonnull -> 91
    //   59: ifnull -> 117
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   68: athrow
    //   69: aload_3
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   90: athrow
    //   91: invokeinterface isEmpty : ()Z
    //   96: aload #6
    //   98: lload_1
    //   99: lconst_0
    //   100: lcmp
    //   101: ifle -> 173
    //   104: ifnonnull -> 171
    //   107: ifeq -> 123
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: iconst_0
    //   118: ireturn
    //   119: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   122: athrow
    //   123: aload_3
    //   124: iconst_0
    //   125: anewarray java/lang/Object
    //   128: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   138: bipush #16
    //   140: invokeinterface get : (I)Ljava/lang/Object;
    //   145: checkcast org/bukkit/Material
    //   148: lload #4
    //   150: iconst_2
    //   151: anewarray java/lang/Object
    //   154: dup_x2
    //   155: dup_x2
    //   156: pop
    //   157: invokestatic valueOf : (J)Ljava/lang/Long;
    //   160: iconst_1
    //   161: swap
    //   162: aastore
    //   163: dup_x1
    //   164: swap
    //   165: iconst_0
    //   166: swap
    //   167: aastore
    //   168: invokestatic aegisguard_KJ : ([Ljava/lang/Object;)Z
    //   171: aload #6
    //   173: ifnonnull -> 257
    //   176: ifne -> 256
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   185: athrow
    //   186: aload_3
    //   187: iconst_0
    //   188: anewarray java/lang/Object
    //   191: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   194: iconst_0
    //   195: anewarray java/lang/Object
    //   198: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   201: bipush #19
    //   203: invokeinterface get : (I)Ljava/lang/Object;
    //   208: checkcast org/bukkit/Material
    //   211: lload #4
    //   213: iconst_2
    //   214: anewarray java/lang/Object
    //   217: dup_x2
    //   218: dup_x2
    //   219: pop
    //   220: invokestatic valueOf : (J)Ljava/lang/Long;
    //   223: iconst_1
    //   224: swap
    //   225: aastore
    //   226: dup_x1
    //   227: swap
    //   228: iconst_0
    //   229: swap
    //   230: aastore
    //   231: invokestatic aegisguard_KJ : ([Ljava/lang/Object;)Z
    //   234: aload #6
    //   236: ifnonnull -> 257
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   245: athrow
    //   246: ifeq -> 260
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   255: athrow
    //   256: iconst_1
    //   257: goto -> 261
    //   260: iconst_0
    //   261: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #387	-> 39
    //   #389	-> 123
    // Exception table:
    //   from	to	target	type
    //   39	62	65	java/lang/UnsupportedOperationException
    //   59	84	87	java/lang/UnsupportedOperationException
    //   91	110	113	java/lang/UnsupportedOperationException
    //   107	119	119	java/lang/UnsupportedOperationException
    //   171	179	182	java/lang/UnsupportedOperationException
    //   176	239	242	java/lang/UnsupportedOperationException
    //   186	249	252	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_T(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: iflt -> 144
    //   95: ifnonnull -> 142
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: invokestatic aegisguard_K0 : (Lorg/bukkit/Material;)Z
    //   142: aload #4
    //   144: ifnonnull -> 208
    //   147: ifne -> 207
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   156: athrow
    //   157: aload_3
    //   158: iconst_0
    //   159: anewarray java/lang/Object
    //   162: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   165: iconst_0
    //   166: anewarray java/lang/Object
    //   169: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   172: bipush #19
    //   174: invokeinterface get : (I)Ljava/lang/Object;
    //   179: checkcast org/bukkit/Material
    //   182: invokestatic aegisguard_K0 : (Lorg/bukkit/Material;)Z
    //   185: aload #4
    //   187: ifnonnull -> 208
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   196: athrow
    //   197: ifeq -> 211
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   206: athrow
    //   207: iconst_1
    //   208: goto -> 212
    //   211: iconst_0
    //   212: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #393	-> 30
    //   #395	-> 114
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   142	150	153	java/lang/UnsupportedOperationException
    //   147	190	193	java/lang/UnsupportedOperationException
    //   157	200	203	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_E(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: ifle -> 144
    //   95: ifnonnull -> 142
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: invokestatic aegisguard_K0 : (Lorg/bukkit/Material;)Z
    //   142: aload #4
    //   144: ifnonnull -> 208
    //   147: ifne -> 207
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   156: athrow
    //   157: aload_3
    //   158: iconst_0
    //   159: anewarray java/lang/Object
    //   162: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   165: iconst_0
    //   166: anewarray java/lang/Object
    //   169: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   172: bipush #19
    //   174: invokeinterface get : (I)Ljava/lang/Object;
    //   179: checkcast org/bukkit/Material
    //   182: invokestatic aegisguard_K0 : (Lorg/bukkit/Material;)Z
    //   185: aload #4
    //   187: ifnonnull -> 208
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   196: athrow
    //   197: ifeq -> 211
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   206: athrow
    //   207: iconst_1
    //   208: goto -> 212
    //   211: iconst_0
    //   212: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #399	-> 30
    //   #401	-> 114
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   142	150	153	java/lang/UnsupportedOperationException
    //   147	190	193	java/lang/UnsupportedOperationException
    //   157	200	203	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_d(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: lload_2
    //   26: dup2
    //   27: ldc2_w 83636236503454
    //   30: lxor
    //   31: lstore #4
    //   33: pop2
    //   34: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #6
    //   39: aload_1
    //   40: iconst_0
    //   41: anewarray java/lang/Object
    //   44: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   54: aload #6
    //   56: ifnonnull -> 91
    //   59: ifnull -> 117
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   68: athrow
    //   69: aload_1
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   90: athrow
    //   91: invokeinterface isEmpty : ()Z
    //   96: aload #6
    //   98: lload_2
    //   99: lconst_0
    //   100: lcmp
    //   101: iflt -> 175
    //   104: ifnonnull -> 173
    //   107: ifeq -> 123
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: iconst_0
    //   118: ireturn
    //   119: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   122: athrow
    //   123: aload_1
    //   124: iconst_0
    //   125: anewarray java/lang/Object
    //   128: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   138: bipush #16
    //   140: invokeinterface get : (I)Ljava/lang/Object;
    //   145: lload #4
    //   147: dup2_x1
    //   148: pop2
    //   149: checkcast org/bukkit/Material
    //   152: iconst_2
    //   153: anewarray java/lang/Object
    //   156: dup_x1
    //   157: swap
    //   158: iconst_1
    //   159: swap
    //   160: aastore
    //   161: dup_x2
    //   162: dup_x2
    //   163: pop
    //   164: invokestatic valueOf : (J)Ljava/lang/Long;
    //   167: iconst_0
    //   168: swap
    //   169: aastore
    //   170: invokestatic aegisguard_O : ([Ljava/lang/Object;)Z
    //   173: aload #6
    //   175: lload_2
    //   176: lconst_0
    //   177: lcmp
    //   178: iflt -> 253
    //   181: ifnonnull -> 251
    //   184: ifeq -> 270
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   193: athrow
    //   194: aload_1
    //   195: iconst_0
    //   196: anewarray java/lang/Object
    //   199: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   202: iconst_0
    //   203: anewarray java/lang/Object
    //   206: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   209: bipush #19
    //   211: invokeinterface get : (I)Ljava/lang/Object;
    //   216: lload #4
    //   218: dup2_x1
    //   219: pop2
    //   220: checkcast org/bukkit/Material
    //   223: iconst_2
    //   224: anewarray java/lang/Object
    //   227: dup_x1
    //   228: swap
    //   229: iconst_1
    //   230: swap
    //   231: aastore
    //   232: dup_x2
    //   233: dup_x2
    //   234: pop
    //   235: invokestatic valueOf : (J)Ljava/lang/Long;
    //   238: iconst_0
    //   239: swap
    //   240: aastore
    //   241: invokestatic aegisguard_O : ([Ljava/lang/Object;)Z
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   250: athrow
    //   251: aload #6
    //   253: ifnonnull -> 267
    //   256: ifeq -> 270
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   265: athrow
    //   266: iconst_1
    //   267: goto -> 271
    //   270: iconst_0
    //   271: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #405	-> 39
    //   #407	-> 123
    //   #408	-> 195
    //   #407	-> 271
    // Exception table:
    //   from	to	target	type
    //   39	62	65	java/lang/UnsupportedOperationException
    //   59	84	87	java/lang/UnsupportedOperationException
    //   91	110	113	java/lang/UnsupportedOperationException
    //   107	119	119	java/lang/UnsupportedOperationException
    //   173	187	190	java/lang/UnsupportedOperationException
    //   184	244	247	java/lang/UnsupportedOperationException
    //   251	259	262	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_B(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: lload_1
    //   26: dup2
    //   27: ldc2_w 139298007553259
    //   30: lxor
    //   31: lstore #4
    //   33: pop2
    //   34: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   37: astore #6
    //   39: aload_3
    //   40: iconst_0
    //   41: anewarray java/lang/Object
    //   44: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   54: aload #6
    //   56: ifnonnull -> 91
    //   59: ifnull -> 117
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   68: athrow
    //   69: aload_3
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   90: athrow
    //   91: invokeinterface isEmpty : ()Z
    //   96: aload #6
    //   98: lload_1
    //   99: lconst_0
    //   100: lcmp
    //   101: ifle -> 175
    //   104: ifnonnull -> 173
    //   107: ifeq -> 123
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: iconst_0
    //   118: ireturn
    //   119: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   122: athrow
    //   123: aload_3
    //   124: iconst_0
    //   125: anewarray java/lang/Object
    //   128: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   138: bipush #16
    //   140: invokeinterface get : (I)Ljava/lang/Object;
    //   145: lload #4
    //   147: dup2_x1
    //   148: pop2
    //   149: checkcast org/bukkit/Material
    //   152: iconst_2
    //   153: anewarray java/lang/Object
    //   156: dup_x1
    //   157: swap
    //   158: iconst_1
    //   159: swap
    //   160: aastore
    //   161: dup_x2
    //   162: dup_x2
    //   163: pop
    //   164: invokestatic valueOf : (J)Ljava/lang/Long;
    //   167: iconst_0
    //   168: swap
    //   169: aastore
    //   170: invokestatic aegisguard_O : ([Ljava/lang/Object;)Z
    //   173: aload #6
    //   175: lload_1
    //   176: lconst_0
    //   177: lcmp
    //   178: iflt -> 253
    //   181: ifnonnull -> 251
    //   184: ifeq -> 270
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   193: athrow
    //   194: aload_3
    //   195: iconst_0
    //   196: anewarray java/lang/Object
    //   199: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   202: iconst_0
    //   203: anewarray java/lang/Object
    //   206: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   209: bipush #19
    //   211: invokeinterface get : (I)Ljava/lang/Object;
    //   216: lload #4
    //   218: dup2_x1
    //   219: pop2
    //   220: checkcast org/bukkit/Material
    //   223: iconst_2
    //   224: anewarray java/lang/Object
    //   227: dup_x1
    //   228: swap
    //   229: iconst_1
    //   230: swap
    //   231: aastore
    //   232: dup_x2
    //   233: dup_x2
    //   234: pop
    //   235: invokestatic valueOf : (J)Ljava/lang/Long;
    //   238: iconst_0
    //   239: swap
    //   240: aastore
    //   241: invokestatic aegisguard_O : ([Ljava/lang/Object;)Z
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   250: athrow
    //   251: aload #6
    //   253: ifnonnull -> 267
    //   256: ifeq -> 270
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   265: athrow
    //   266: iconst_1
    //   267: goto -> 271
    //   270: iconst_0
    //   271: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #412	-> 39
    //   #414	-> 123
    // Exception table:
    //   from	to	target	type
    //   39	62	65	java/lang/UnsupportedOperationException
    //   59	84	87	java/lang/UnsupportedOperationException
    //   91	110	113	java/lang/UnsupportedOperationException
    //   107	119	119	java/lang/UnsupportedOperationException
    //   173	187	190	java/lang/UnsupportedOperationException
    //   184	244	247	java/lang/UnsupportedOperationException
    //   251	259	262	java/lang/UnsupportedOperationException
  }
  
  public static int aegisguard_s(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/entity/LivingEntity
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: aload_1
    //   29: invokeinterface getActivePotionEffects : ()Ljava/util/Collection;
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #5
    //   41: astore #4
    //   43: aload #5
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 137
    //   53: aload #5
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast org/bukkit/potion/PotionEffect
    //   63: astore #6
    //   65: aload #6
    //   67: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   70: invokevirtual toString : ()Ljava/lang/String;
    //   73: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   76: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.b : [Ljava/lang/String;
    //   79: iconst_3
    //   80: aaload
    //   81: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   84: aload #4
    //   86: lload_2
    //   87: lconst_0
    //   88: lcmp
    //   89: iflt -> 97
    //   92: ifnonnull -> 138
    //   95: aload #4
    //   97: ifnonnull -> 131
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   106: athrow
    //   107: ifeq -> 132
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: aload #6
    //   119: invokevirtual getAmplifier : ()I
    //   122: iconst_1
    //   123: iadd
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   130: athrow
    //   131: ireturn
    //   132: aload #4
    //   134: ifnull -> 43
    //   137: iconst_0
    //   138: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #418	-> 28
    //   #419	-> 65
    //   #420	-> 117
    //   #422	-> 132
    //   #423	-> 137
    // Exception table:
    //   from	to	target	type
    //   65	100	103	java/lang/UnsupportedOperationException
    //   95	110	113	java/lang/UnsupportedOperationException
    //   107	124	127	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_u(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   37: aload #4
    //   39: ifnonnull -> 53
    //   42: ifne -> 54
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   51: athrow
    //   52: iconst_0
    //   53: ireturn
    //   54: aload_1
    //   55: iconst_0
    //   56: anewarray java/lang/Object
    //   59: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   62: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   67: invokeinterface getItemInMainHand : ()Lorg/bukkit/inventory/ItemStack;
    //   72: invokevirtual getType : ()Lorg/bukkit/Material;
    //   75: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   78: lload_2
    //   79: lconst_0
    //   80: lcmp
    //   81: iflt -> 130
    //   84: aload #4
    //   86: ifnonnull -> 130
    //   89: if_acmpne -> 133
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   98: athrow
    //   99: aload_1
    //   100: iconst_0
    //   101: anewarray java/lang/Object
    //   104: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   107: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   112: invokeinterface getItemInOffHand : ()Lorg/bukkit/inventory/ItemStack;
    //   117: invokevirtual getType : ()Lorg/bukkit/Material;
    //   120: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   129: athrow
    //   130: if_acmpeq -> 141
    //   133: iconst_1
    //   134: goto -> 142
    //   137: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   140: athrow
    //   141: iconst_0
    //   142: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #427	-> 30
    //   #429	-> 54
    //   #430	-> 100
    //   #429	-> 142
    // Exception table:
    //   from	to	target	type
    //   30	45	48	java/lang/UnsupportedOperationException
    //   54	92	95	java/lang/UnsupportedOperationException
    //   89	123	126	java/lang/UnsupportedOperationException
    //   130	137	137	java/lang/UnsupportedOperationException
  }
  
  public static double aegisguard_l(Object[] paramArrayOfObject) {
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    double d = 0.32D + (aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YS(new Object[0]) * 0.08F) + (aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_I(new Object[0]) - 0.2F) * 3.5D;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        if (d < 0.32D)
          d = 0.32D;  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return d;
  }
  
  public static boolean aegisguard_n(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/event/block/BlockPlaceEvent
    //   7: astore_1
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_2
    //   23: lxor
    //   24: lstore_2
    //   25: lload_2
    //   26: dup2
    //   27: ldc2_w 27018501470019
    //   30: lxor
    //   31: lstore #4
    //   33: dup2
    //   34: ldc2_w 46053348208391
    //   37: lxor
    //   38: lstore #6
    //   40: pop2
    //   41: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   44: aload_1
    //   45: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   48: astore #9
    //   50: astore #8
    //   52: aload #9
    //   54: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   59: invokevirtual getType : ()Lorg/bukkit/Material;
    //   62: invokevirtual isSolid : ()Z
    //   65: aload #8
    //   67: ifnonnull -> 236
    //   70: ifeq -> 235
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   79: athrow
    //   80: aload_1
    //   81: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   84: invokeinterface getType : ()Lorg/bukkit/Material;
    //   89: lload #4
    //   91: dup2_x1
    //   92: pop2
    //   93: iconst_2
    //   94: anewarray java/lang/Object
    //   97: dup_x1
    //   98: swap
    //   99: iconst_1
    //   100: swap
    //   101: aastore
    //   102: dup_x2
    //   103: dup_x2
    //   104: pop
    //   105: invokestatic valueOf : (J)Ljava/lang/Long;
    //   108: iconst_0
    //   109: swap
    //   110: aastore
    //   111: invokestatic aegisguard_K6 : ([Ljava/lang/Object;)Z
    //   114: aload #8
    //   116: ifnonnull -> 236
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   125: athrow
    //   126: ifne -> 235
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   135: athrow
    //   136: aload_1
    //   137: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   140: invokeinterface getType : ()Lorg/bukkit/Material;
    //   145: lload #6
    //   147: dup2_x1
    //   148: pop2
    //   149: iconst_2
    //   150: anewarray java/lang/Object
    //   153: dup_x1
    //   154: swap
    //   155: iconst_1
    //   156: swap
    //   157: aastore
    //   158: dup_x2
    //   159: dup_x2
    //   160: pop
    //   161: invokestatic valueOf : (J)Ljava/lang/Long;
    //   164: iconst_0
    //   165: swap
    //   166: aastore
    //   167: invokestatic aegisguard_Kk : ([Ljava/lang/Object;)Z
    //   170: aload #8
    //   172: ifnonnull -> 236
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   181: athrow
    //   182: ifne -> 235
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   191: athrow
    //   192: aload_1
    //   193: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   196: invokeinterface getType : ()Lorg/bukkit/Material;
    //   201: iconst_1
    //   202: anewarray java/lang/Object
    //   205: dup_x1
    //   206: swap
    //   207: iconst_0
    //   208: swap
    //   209: aastore
    //   210: invokestatic aegisguard_o : ([Ljava/lang/Object;)Z
    //   213: aload #8
    //   215: ifnonnull -> 236
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   224: athrow
    //   225: ifeq -> 237
    //   228: goto -> 235
    //   231: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   234: athrow
    //   235: iconst_0
    //   236: ireturn
    //   237: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   240: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   243: aload #9
    //   245: iconst_1
    //   246: anewarray java/lang/Object
    //   249: dup_x1
    //   250: swap
    //   251: iconst_0
    //   252: swap
    //   253: aastore
    //   254: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   257: astore #10
    //   259: aload #10
    //   261: ifnull -> 725
    //   264: iconst_0
    //   265: anewarray java/lang/Object
    //   268: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   271: ifeq -> 310
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   280: athrow
    //   281: aload #10
    //   283: iconst_0
    //   284: anewarray java/lang/Object
    //   287: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   290: iconst_0
    //   291: anewarray java/lang/Object
    //   294: invokevirtual aegisguard_C : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   297: lload_2
    //   298: lconst_0
    //   299: lcmp
    //   300: iflt -> 326
    //   303: astore #11
    //   305: aload #8
    //   307: ifnull -> 328
    //   310: aload #10
    //   312: iconst_0
    //   313: anewarray java/lang/Object
    //   316: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   319: iconst_0
    //   320: anewarray java/lang/Object
    //   323: invokevirtual aegisguard_g : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   326: astore #11
    //   328: aload_1
    //   329: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   332: aload_1
    //   333: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   336: invokeinterface getFace : (Lorg/bukkit/block/Block;)Lorg/bukkit/block/BlockFace;
    //   341: astore #12
    //   343: aload_1
    //   344: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   347: invokeinterface getX : ()I
    //   352: i2d
    //   353: dstore #13
    //   355: aload_1
    //   356: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   359: invokeinterface getY : ()I
    //   364: i2d
    //   365: dstore #15
    //   367: aload_1
    //   368: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   371: invokeinterface getZ : ()I
    //   376: i2d
    //   377: dstore #17
    //   379: aload #10
    //   381: iconst_0
    //   382: anewarray java/lang/Object
    //   385: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   388: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   393: invokevirtual getX : ()D
    //   396: dstore #19
    //   398: aload #10
    //   400: iconst_0
    //   401: anewarray java/lang/Object
    //   404: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   407: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   412: invokevirtual getY : ()D
    //   415: dstore #21
    //   417: aload #10
    //   419: iconst_0
    //   420: anewarray java/lang/Object
    //   423: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   426: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   431: invokevirtual getZ : ()D
    //   434: dstore #23
    //   436: dload #13
    //   438: dload #19
    //   440: dsub
    //   441: invokestatic abs : (D)D
    //   444: dload #17
    //   446: dload #23
    //   448: dsub
    //   449: invokestatic abs : (D)D
    //   452: iconst_2
    //   453: anewarray java/lang/Object
    //   456: dup_x2
    //   457: dup_x2
    //   458: pop
    //   459: invokestatic valueOf : (D)Ljava/lang/Double;
    //   462: iconst_1
    //   463: swap
    //   464: aastore
    //   465: dup_x2
    //   466: dup_x2
    //   467: pop
    //   468: invokestatic valueOf : (D)Ljava/lang/Double;
    //   471: iconst_0
    //   472: swap
    //   473: aastore
    //   474: invokestatic aegisguard_e : ([Ljava/lang/Object;)D
    //   477: dstore #25
    //   479: aload #10
    //   481: iconst_0
    //   482: anewarray java/lang/Object
    //   485: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   488: iconst_0
    //   489: anewarray java/lang/Object
    //   492: invokevirtual aegisguard_y : ([Ljava/lang/Object;)Ljava/util/List;
    //   495: astore #27
    //   497: aload #27
    //   499: aload #8
    //   501: ifnonnull -> 522
    //   504: ifnonnull -> 520
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   513: athrow
    //   514: iconst_0
    //   515: ireturn
    //   516: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   519: athrow
    //   520: aload #27
    //   522: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   527: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   532: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   537: invokeinterface count : ()J
    //   542: l2i
    //   543: aload #8
    //   545: ifnonnull -> 726
    //   548: istore #28
    //   550: aload #11
    //   552: ifnull -> 725
    //   555: aload #12
    //   557: lload_2
    //   558: lconst_0
    //   559: lcmp
    //   560: ifle -> 587
    //   563: aload #8
    //   565: ifnonnull -> 587
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   574: athrow
    //   575: ifnull -> 725
    //   578: goto -> 585
    //   581: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   584: athrow
    //   585: aload #12
    //   587: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   590: if_acmpeq -> 725
    //   593: aload #11
    //   595: invokestatic aegisguard_Kx : (Lorg/bukkit/Material;)Z
    //   598: aload #8
    //   600: lload_2
    //   601: lconst_0
    //   602: lcmp
    //   603: ifle -> 641
    //   606: ifnonnull -> 639
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   615: athrow
    //   616: ifeq -> 723
    //   619: goto -> 626
    //   622: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   625: athrow
    //   626: dload #25
    //   628: ldc2_w 2.25
    //   631: dcmpg
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   638: athrow
    //   639: aload #8
    //   641: lload_2
    //   642: lconst_0
    //   643: lcmp
    //   644: ifle -> 674
    //   647: ifnonnull -> 672
    //   650: ifge -> 723
    //   653: goto -> 660
    //   656: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   659: athrow
    //   660: dload #15
    //   662: dload #21
    //   664: dcmpg
    //   665: goto -> 672
    //   668: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   671: athrow
    //   672: aload #8
    //   674: lload_2
    //   675: lconst_0
    //   676: lcmp
    //   677: ifle -> 697
    //   680: ifnonnull -> 695
    //   683: ifge -> 723
    //   686: goto -> 693
    //   689: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   692: athrow
    //   693: iload #28
    //   695: aload #8
    //   697: ifnonnull -> 720
    //   700: bipush #6
    //   702: if_icmple -> 723
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   711: athrow
    //   712: iconst_1
    //   713: goto -> 720
    //   716: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   719: athrow
    //   720: goto -> 724
    //   723: iconst_0
    //   724: ireturn
    //   725: iconst_0
    //   726: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #445	-> 44
    //   #447	-> 52
    //   #448	-> 81
    //   #449	-> 137
    //   #450	-> 193
    //   #452	-> 237
    //   #454	-> 259
    //   #456	-> 264
    //   #457	-> 281
    //   #459	-> 310
    //   #462	-> 328
    //   #464	-> 343
    //   #465	-> 355
    //   #466	-> 367
    //   #468	-> 379
    //   #469	-> 398
    //   #470	-> 417
    //   #472	-> 436
    //   #474	-> 479
    //   #475	-> 497
    //   #476	-> 520
    //   #478	-> 550
    //   #479	-> 593
    //   #482	-> 725
    // Exception table:
    //   from	to	target	type
    //   52	73	76	java/lang/UnsupportedOperationException
    //   70	119	122	java/lang/UnsupportedOperationException
    //   80	129	132	java/lang/UnsupportedOperationException
    //   126	175	178	java/lang/UnsupportedOperationException
    //   136	185	188	java/lang/UnsupportedOperationException
    //   182	218	221	java/lang/UnsupportedOperationException
    //   192	228	231	java/lang/UnsupportedOperationException
    //   259	274	277	java/lang/UnsupportedOperationException
    //   497	507	510	java/lang/UnsupportedOperationException
    //   504	516	516	java/lang/UnsupportedOperationException
    //   550	568	571	java/lang/UnsupportedOperationException
    //   555	578	581	java/lang/UnsupportedOperationException
    //   587	609	612	java/lang/UnsupportedOperationException
    //   593	619	622	java/lang/UnsupportedOperationException
    //   616	632	635	java/lang/UnsupportedOperationException
    //   639	653	656	java/lang/UnsupportedOperationException
    //   650	665	668	java/lang/UnsupportedOperationException
    //   672	686	689	java/lang/UnsupportedOperationException
    //   695	705	708	java/lang/UnsupportedOperationException
    //   700	713	716	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_q(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   7: astore_3
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_1
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: iflt -> 144
    //   95: ifnonnull -> 142
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: invokestatic aegisguard_K0 : (Lorg/bukkit/Material;)Z
    //   142: aload #4
    //   144: lload_1
    //   145: lconst_0
    //   146: lcmp
    //   147: iflt -> 200
    //   150: ifnonnull -> 198
    //   153: ifeq -> 217
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   162: athrow
    //   163: aload_3
    //   164: iconst_0
    //   165: anewarray java/lang/Object
    //   168: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   171: iconst_0
    //   172: anewarray java/lang/Object
    //   175: invokevirtual aegisguard_H : ([Ljava/lang/Object;)Ljava/util/List;
    //   178: bipush #19
    //   180: invokeinterface get : (I)Ljava/lang/Object;
    //   185: checkcast org/bukkit/Material
    //   188: invokestatic aegisguard_K0 : (Lorg/bukkit/Material;)Z
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   197: athrow
    //   198: aload #4
    //   200: ifnonnull -> 214
    //   203: ifeq -> 217
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   212: athrow
    //   213: iconst_1
    //   214: goto -> 218
    //   217: iconst_0
    //   218: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #486	-> 30
    //   #488	-> 114
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   142	156	159	java/lang/UnsupportedOperationException
    //   153	191	194	java/lang/UnsupportedOperationException
    //   198	206	209	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_a(Object[] paramArrayOfObject) {
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
    //   14: checkcast me/frep/aegisguard/spigot/aegisguard_hu
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: aload_3
    //   31: iconst_0
    //   32: anewarray java/lang/Object
    //   35: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   38: iconst_0
    //   39: anewarray java/lang/Object
    //   42: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   45: aload #4
    //   47: ifnonnull -> 82
    //   50: ifnull -> 108
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   59: athrow
    //   60: aload_3
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   81: athrow
    //   82: invokeinterface isEmpty : ()Z
    //   87: aload #4
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: ifle -> 144
    //   95: ifnonnull -> 142
    //   98: ifeq -> 114
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   107: athrow
    //   108: iconst_0
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   113: athrow
    //   114: aload_3
    //   115: iconst_0
    //   116: anewarray java/lang/Object
    //   119: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   122: iconst_0
    //   123: anewarray java/lang/Object
    //   126: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: bipush #16
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast org/bukkit/Material
    //   139: invokestatic aegisguard_K0 : (Lorg/bukkit/Material;)Z
    //   142: aload #4
    //   144: lload_1
    //   145: lconst_0
    //   146: lcmp
    //   147: ifle -> 200
    //   150: ifnonnull -> 198
    //   153: ifeq -> 217
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   162: athrow
    //   163: aload_3
    //   164: iconst_0
    //   165: anewarray java/lang/Object
    //   168: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   171: iconst_0
    //   172: anewarray java/lang/Object
    //   175: invokevirtual aegisguard_Y : ([Ljava/lang/Object;)Ljava/util/List;
    //   178: bipush #19
    //   180: invokeinterface get : (I)Ljava/lang/Object;
    //   185: checkcast org/bukkit/Material
    //   188: invokestatic aegisguard_K0 : (Lorg/bukkit/Material;)Z
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   197: athrow
    //   198: aload #4
    //   200: ifnonnull -> 214
    //   203: ifeq -> 217
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   212: athrow
    //   213: iconst_1
    //   214: goto -> 218
    //   217: iconst_0
    //   218: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #492	-> 30
    //   #494	-> 114
    // Exception table:
    //   from	to	target	type
    //   30	53	56	java/lang/UnsupportedOperationException
    //   50	75	78	java/lang/UnsupportedOperationException
    //   82	101	104	java/lang/UnsupportedOperationException
    //   98	110	110	java/lang/UnsupportedOperationException
    //   142	156	159	java/lang/UnsupportedOperationException
    //   153	191	194	java/lang/UnsupportedOperationException
    //   198	206	209	java/lang/UnsupportedOperationException
  }
  
  public static boolean aegisguard_F(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/entity/Player
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   37: aload #4
    //   39: ifnonnull -> 249
    //   42: ifeq -> 248
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   51: athrow
    //   52: aload_3
    //   53: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   58: invokeinterface getItemInMainHand : ()Lorg/bukkit/inventory/ItemStack;
    //   63: invokevirtual getType : ()Lorg/bukkit/Material;
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.b : [Ljava/lang/String;
    //   72: iconst_2
    //   73: aaload
    //   74: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   77: aload #4
    //   79: lload_1
    //   80: lconst_0
    //   81: lcmp
    //   82: iflt -> 184
    //   85: ifnonnull -> 182
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   94: athrow
    //   95: lload_1
    //   96: lconst_0
    //   97: lcmp
    //   98: iflt -> 175
    //   101: ifeq -> 150
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   110: athrow
    //   111: aload_3
    //   112: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   117: invokeinterface getItemInMainHand : ()Lorg/bukkit/inventory/ItemStack;
    //   122: getstatic org/bukkit/enchantments/Enchantment.RIPTIDE : Lorg/bukkit/enchantments/Enchantment;
    //   125: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
    //   128: aload #4
    //   130: ifnonnull -> 243
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   139: athrow
    //   140: ifgt -> 242
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   149: athrow
    //   150: aload_3
    //   151: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   156: invokeinterface getItemInOffHand : ()Lorg/bukkit/inventory/ItemStack;
    //   161: invokevirtual getType : ()Lorg/bukkit/Material;
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.b : [Ljava/lang/String;
    //   170: iconst_5
    //   171: aaload
    //   172: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   181: athrow
    //   182: aload #4
    //   184: lload_1
    //   185: lconst_0
    //   186: lcmp
    //   187: ifle -> 229
    //   190: ifnonnull -> 227
    //   193: ifeq -> 246
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   202: athrow
    //   203: aload_3
    //   204: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   209: invokeinterface getItemInOffHand : ()Lorg/bukkit/inventory/ItemStack;
    //   214: getstatic org/bukkit/enchantments/Enchantment.RIPTIDE : Lorg/bukkit/enchantments/Enchantment;
    //   217: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   226: athrow
    //   227: aload #4
    //   229: ifnonnull -> 243
    //   232: ifle -> 246
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   241: athrow
    //   242: iconst_1
    //   243: goto -> 247
    //   246: iconst_0
    //   247: ireturn
    //   248: iconst_0
    //   249: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #498	-> 30
    //   #499	-> 52
    //   #500	-> 112
    //   #501	-> 151
    //   #502	-> 204
    //   #499	-> 247
    //   #505	-> 248
    // Exception table:
    //   from	to	target	type
    //   30	45	48	java/lang/UnsupportedOperationException
    //   42	88	91	java/lang/UnsupportedOperationException
    //   52	104	107	java/lang/UnsupportedOperationException
    //   95	133	136	java/lang/UnsupportedOperationException
    //   111	143	146	java/lang/UnsupportedOperationException
    //   140	175	178	java/lang/UnsupportedOperationException
    //   182	196	199	java/lang/UnsupportedOperationException
    //   193	220	223	java/lang/UnsupportedOperationException
    //   227	235	238	java/lang/UnsupportedOperationException
  }
  
  public static void aegisguard_H(Object[] paramArrayOfObject) {
    Player player = (Player)paramArrayOfObject[0];
    int i = ThreadLocalRandom.current().nextInt(8);
    aegisguard_v(new Object[] { null, new WrapperPlayServerHeldItemChange(i), aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player }) });
  }
  
  public static float aegisguard_Z(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    aegisguard_hu aegisguard_hu = (aegisguard_hu)paramArrayOfObject[1];
    float f1 = ((Float)paramArrayOfObject[2]).floatValue();
    l = a ^ l;
    float f2 = f1 + aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YS(new Object[0]) * 0.0675F + (aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_I(new Object[0]) - 0.2F) * 3.5F;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Xz.aegisguard_z();
    try {
      if (arrayOfAbstractCheck == null)
        try {
          if (f2 < f1)
            return f1 + aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YS(new Object[0]) * 0.0675F; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return f1;
  }
  
  public static void aegisguard_f(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast org/bukkit/entity/Player
    //   7: astore_1
    //   8: pop
    //   9: aload_1
    //   10: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   15: astore_2
    //   16: aload_1
    //   17: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   22: invokevirtual getX : ()D
    //   25: dstore_3
    //   26: aload_1
    //   27: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   32: invokevirtual getY : ()D
    //   35: dstore #5
    //   37: aload_1
    //   38: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   43: invokevirtual getZ : ()D
    //   46: dstore #7
    //   48: invokestatic current : ()Ljava/util/concurrent/ThreadLocalRandom;
    //   51: ldc2_w 360.0
    //   54: invokevirtual nextDouble : (D)D
    //   57: d2f
    //   58: ldc 180.0
    //   60: fsub
    //   61: fstore #9
    //   63: invokestatic current : ()Ljava/util/concurrent/ThreadLocalRandom;
    //   66: ldc2_w 180.0
    //   69: invokevirtual nextDouble : (D)D
    //   72: d2f
    //   73: ldc_w 90.0
    //   76: fsub
    //   77: fstore #10
    //   79: new org/bukkit/Location
    //   82: dup
    //   83: aload_2
    //   84: dload_3
    //   85: dload #5
    //   87: dload #7
    //   89: fload #9
    //   91: fload #10
    //   93: invokespecial <init> : (Lorg/bukkit/World;DDDFF)V
    //   96: astore #11
    //   98: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   101: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   104: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   107: aload_1
    //   108: aload #11
    //   110: <illegal opcode> run : (Lorg/bukkit/entity/Player;Lorg/bukkit/Location;)Ljava/lang/Runnable;
    //   115: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   120: pop
    //   121: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #526	-> 9
    //   #528	-> 16
    //   #529	-> 26
    //   #530	-> 37
    //   #532	-> 48
    //   #533	-> 63
    //   #535	-> 79
    //   #537	-> 98
    //   #538	-> 121
  }
  
  private static void lambda$rotateRandomly$0(Player paramPlayer, Location paramLocation) {
    paramPlayer.teleport(paramLocation, PlayerTeleportEvent.TeleportCause.UNKNOWN);
  }
  
  public static boolean aegisguard_U(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/entity/Player
    //   17: astore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_Xa.a : J
    //   22: lload_1
    //   23: lxor
    //   24: lstore_1
    //   25: invokestatic aegisguard_z : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: astore #4
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokestatic aegisguard_f : ([Ljava/lang/Object;)Z
    //   37: aload #4
    //   39: ifnonnull -> 53
    //   42: ifne -> 54
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   51: athrow
    //   52: iconst_0
    //   53: ireturn
    //   54: aload_3
    //   55: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   60: invokeinterface getHelmet : ()Lorg/bukkit/inventory/ItemStack;
    //   65: aload #4
    //   67: lload_1
    //   68: lconst_0
    //   69: lcmp
    //   70: iflt -> 136
    //   73: ifnonnull -> 134
    //   76: ifnull -> 123
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   85: athrow
    //   86: aload_3
    //   87: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   92: invokeinterface getHelmet : ()Lorg/bukkit/inventory/ItemStack;
    //   97: invokevirtual getType : ()Lorg/bukkit/Material;
    //   100: getstatic org/bukkit/Material.NETHERITE_HELMET : Lorg/bukkit/Material;
    //   103: if_acmpne -> 121
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   112: athrow
    //   113: iconst_1
    //   114: goto -> 122
    //   117: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   120: athrow
    //   121: iconst_0
    //   122: ireturn
    //   123: aload_3
    //   124: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   129: invokeinterface getChestplate : ()Lorg/bukkit/inventory/ItemStack;
    //   134: aload #4
    //   136: lload_1
    //   137: lconst_0
    //   138: lcmp
    //   139: iflt -> 205
    //   142: ifnonnull -> 203
    //   145: ifnull -> 192
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   154: athrow
    //   155: aload_3
    //   156: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   161: invokeinterface getChestplate : ()Lorg/bukkit/inventory/ItemStack;
    //   166: invokevirtual getType : ()Lorg/bukkit/Material;
    //   169: getstatic org/bukkit/Material.NETHERITE_CHESTPLATE : Lorg/bukkit/Material;
    //   172: if_acmpne -> 190
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   181: athrow
    //   182: iconst_1
    //   183: goto -> 191
    //   186: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   189: athrow
    //   190: iconst_0
    //   191: ireturn
    //   192: aload_3
    //   193: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   198: invokeinterface getLeggings : ()Lorg/bukkit/inventory/ItemStack;
    //   203: aload #4
    //   205: lload_1
    //   206: lconst_0
    //   207: lcmp
    //   208: ifle -> 280
    //   211: ifnonnull -> 272
    //   214: ifnull -> 261
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   223: athrow
    //   224: aload_3
    //   225: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   230: invokeinterface getLeggings : ()Lorg/bukkit/inventory/ItemStack;
    //   235: invokevirtual getType : ()Lorg/bukkit/Material;
    //   238: getstatic org/bukkit/Material.NETHERITE_LEGGINGS : Lorg/bukkit/Material;
    //   241: if_acmpne -> 259
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   250: athrow
    //   251: iconst_1
    //   252: goto -> 260
    //   255: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   258: athrow
    //   259: iconst_0
    //   260: ireturn
    //   261: aload_3
    //   262: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   267: invokeinterface getBoots : ()Lorg/bukkit/inventory/ItemStack;
    //   272: lload_1
    //   273: lconst_0
    //   274: lcmp
    //   275: iflt -> 311
    //   278: aload #4
    //   280: ifnonnull -> 311
    //   283: ifnull -> 330
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   292: athrow
    //   293: aload_3
    //   294: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   299: invokeinterface getBoots : ()Lorg/bukkit/inventory/ItemStack;
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   310: athrow
    //   311: invokevirtual getType : ()Lorg/bukkit/Material;
    //   314: getstatic org/bukkit/Material.NETHERITE_BOOTS : Lorg/bukkit/Material;
    //   317: if_acmpne -> 328
    //   320: iconst_1
    //   321: goto -> 329
    //   324: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   327: athrow
    //   328: iconst_0
    //   329: ireturn
    //   330: iconst_0
    //   331: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #541	-> 30
    //   #543	-> 54
    //   #544	-> 86
    //   #547	-> 123
    //   #548	-> 155
    //   #551	-> 192
    //   #552	-> 224
    //   #555	-> 261
    //   #556	-> 293
    //   #559	-> 330
    // Exception table:
    //   from	to	target	type
    //   30	45	48	java/lang/UnsupportedOperationException
    //   54	79	82	java/lang/UnsupportedOperationException
    //   76	106	109	java/lang/UnsupportedOperationException
    //   86	117	117	java/lang/UnsupportedOperationException
    //   134	148	151	java/lang/UnsupportedOperationException
    //   145	175	178	java/lang/UnsupportedOperationException
    //   155	186	186	java/lang/UnsupportedOperationException
    //   203	217	220	java/lang/UnsupportedOperationException
    //   214	244	247	java/lang/UnsupportedOperationException
    //   224	255	255	java/lang/UnsupportedOperationException
    //   272	286	289	java/lang/UnsupportedOperationException
    //   283	304	307	java/lang/UnsupportedOperationException
    //   311	324	324	java/lang/UnsupportedOperationException
  }
  
  public static void aegisguard_D(AbstractCheck[] paramArrayOfAbstractCheck) {
    aegisguard_j = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] aegisguard_I() {
    return aegisguard_j;
  }
  
  static {
    long l = a ^ 0x70833205B9FAL;
    aegisguard_D(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[8];
    boolean bool = false;
    String str;
    int i = (str = "N¤î\003`_\020\023Ü2H\035\001Ù:°¿k=¸&\016\bMî}\023\ntèð\b\tª¿\022IÓW\b½õÑSèn\bMî}\023\ntèð").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
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
