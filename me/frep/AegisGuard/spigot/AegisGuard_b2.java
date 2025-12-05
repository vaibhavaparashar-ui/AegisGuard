package me.frep.aegisguard.spigot.AegisGuard_b2;

import com.github.retrooper.packetevents.event.SimplePacketListenerAbstract;
import com.github.retrooper.packetevents.event.simple.PacketLoginSendEvent;
import com.github.retrooper.packetevents.event.simple.PacketPlayReceiveEvent;
import com.github.retrooper.packetevents.event.simple.PacketPlaySendEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.protocol.player.User;
import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;

public class aegisguard_b2 extends SimplePacketListenerAbstract {
  private static int[] aegisguard__;
  
  private static final long a = aegisguard_e.a(-5866905467518435407L, -3900029309121904792L, MethodHandles.lookup().lookupClass()).a(221577953271137L);
  
  public void onPacketLoginSend(PacketLoginSendEvent paramPacketLoginSendEvent) {
    long l1 = a ^ 0x76800BA2AB50L, l2 = l1 ^ 0x6806433B4E51L;
    User user = paramPacketLoginSendEvent.getUser();
    int[] arrayOfInt = aegisguard_P();
    try {
      if (paramPacketLoginSendEvent.getPacketType() == PacketType.Login.Server.LOGIN_SUCCESS) {
        (new Object[2])[1] = user;
        new Object[2];
        aegisguard_K.INSTANCE.aegisguard_p().aegisguard_Z(new Object[] { Long.valueOf(l2) });
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (arrayOfInt == null)
        AbstractCheck.aegisguard_g(new AbstractCheck[4]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void onPacketPlayReceive(PacketPlayReceiveEvent paramPacketPlayReceiveEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_b2.a : J
    //   3: ldc2_w 37475760160100
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 61418130791803
    //   13: lxor
    //   14: lstore #4
    //   16: pop2
    //   17: invokestatic aegisguard_P : ()[I
    //   20: astore #6
    //   22: aload_1
    //   23: invokevirtual getPlayer : ()Ljava/lang/Object;
    //   26: ifnonnull -> 34
    //   29: return
    //   30: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   33: athrow
    //   34: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   37: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   40: aload_1
    //   41: invokevirtual getUser : ()Lcom/github/retrooper/packetevents/protocol/player/User;
    //   44: iconst_1
    //   45: anewarray java/lang/Object
    //   48: dup_x1
    //   49: swap
    //   50: iconst_0
    //   51: swap
    //   52: aastore
    //   53: invokevirtual aegisguard_Z : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   56: astore #7
    //   58: aload #7
    //   60: aload #6
    //   62: ifnull -> 80
    //   65: ifnonnull -> 78
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: goto -> 186
    //   78: aload #7
    //   80: iconst_0
    //   81: anewarray java/lang/Object
    //   84: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   87: aload #6
    //   89: ifnull -> 113
    //   92: ifnonnull -> 135
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: aload_1
    //   103: invokevirtual getPlayer : ()Ljava/lang/Object;
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: ifnull -> 135
    //   116: aload #7
    //   118: aload_1
    //   119: invokevirtual getPlayer : ()Ljava/lang/Object;
    //   122: checkcast org/bukkit/entity/Player
    //   125: invokevirtual aegisguard_r : (Lorg/bukkit/entity/Player;)V
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   138: invokevirtual aegisguard_B : ()Lme/frep/aegisguard/spigot/aegisguard_K1;
    //   141: lload #4
    //   143: aload #7
    //   145: aload_1
    //   146: iconst_3
    //   147: anewarray java/lang/Object
    //   150: dup_x1
    //   151: swap
    //   152: iconst_2
    //   153: swap
    //   154: aastore
    //   155: dup_x1
    //   156: swap
    //   157: iconst_1
    //   158: swap
    //   159: aastore
    //   160: dup_x2
    //   161: dup_x2
    //   162: pop
    //   163: invokestatic valueOf : (J)Ljava/lang/Long;
    //   166: iconst_0
    //   167: swap
    //   168: aastore
    //   169: invokevirtual aegisguard_M : ([Ljava/lang/Object;)V
    //   172: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   175: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   178: invokevirtual aegisguard_h : ()I
    //   181: iconst_1
    //   182: iadd
    //   183: invokevirtual aegisguard_O : (I)V
    //   186: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #26	-> 22
    //   #28	-> 34
    //   #31	-> 58
    //   #33	-> 78
    //   #35	-> 135
    //   #36	-> 172
    //   #38	-> 186
    // Exception table:
    //   from	to	target	type
    //   22	30	30	java/lang/RuntimeException
    //   58	68	71	java/lang/RuntimeException
    //   80	95	98	java/lang/RuntimeException
    //   92	106	109	java/lang/RuntimeException
    //   113	128	131	java/lang/RuntimeException
  }
  
  public void onPacketPlaySend(PacketPlaySendEvent paramPacketPlaySendEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_b2.a : J
    //   3: ldc2_w 100692459442122
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_P : ()[I
    //   11: astore #4
    //   13: aload_1
    //   14: invokevirtual getPlayer : ()Ljava/lang/Object;
    //   17: ifnonnull -> 25
    //   20: return
    //   21: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   24: athrow
    //   25: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   28: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   31: aload_1
    //   32: invokevirtual getUser : ()Lcom/github/retrooper/packetevents/protocol/player/User;
    //   35: iconst_1
    //   36: anewarray java/lang/Object
    //   39: dup_x1
    //   40: swap
    //   41: iconst_0
    //   42: swap
    //   43: aastore
    //   44: invokevirtual aegisguard_Z : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   47: astore #5
    //   49: aload #5
    //   51: aload #4
    //   53: ifnull -> 71
    //   56: ifnonnull -> 69
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: goto -> 152
    //   69: aload #5
    //   71: iconst_0
    //   72: anewarray java/lang/Object
    //   75: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   78: aload #4
    //   80: ifnull -> 104
    //   83: ifnonnull -> 126
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: aload_1
    //   94: invokevirtual getPlayer : ()Ljava/lang/Object;
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: ifnull -> 126
    //   107: aload #5
    //   109: aload_1
    //   110: invokevirtual getPlayer : ()Ljava/lang/Object;
    //   113: checkcast org/bukkit/entity/Player
    //   116: invokevirtual aegisguard_r : (Lorg/bukkit/entity/Player;)V
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   129: invokevirtual aegisguard_c : ()Lme/frep/aegisguard/spigot/aegisguard_hb;
    //   132: aload #5
    //   134: aload_1
    //   135: invokevirtual aegisguard_E : (Lme/frep/aegisguard/spigot/aegisguard_hu;Lcom/github/retrooper/packetevents/event/simple/PacketPlaySendEvent;)V
    //   138: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   141: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   144: invokevirtual aegisguard_G : ()I
    //   147: iconst_1
    //   148: iadd
    //   149: invokevirtual aegisguard_R : (I)V
    //   152: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #42	-> 13
    //   #44	-> 25
    //   #47	-> 49
    //   #49	-> 69
    //   #51	-> 126
    //   #52	-> 138
    //   #54	-> 152
    // Exception table:
    //   from	to	target	type
    //   13	21	21	java/lang/RuntimeException
    //   49	59	62	java/lang/RuntimeException
    //   71	86	89	java/lang/RuntimeException
    //   83	97	100	java/lang/RuntimeException
    //   104	119	122	java/lang/RuntimeException
  }
  
  public static void aegisguard_E(int[] paramArrayOfint) {
    aegisguard__ = paramArrayOfint;
  }
  
  public static int[] aegisguard_P() {
    return aegisguard__;
  }
  
  static {
    if (aegisguard_P() == null)
      aegisguard_E(new int[5]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
