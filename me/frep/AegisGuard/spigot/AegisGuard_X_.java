package me.frep.aegisguard.spigot.AegisGuard_X_;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class aegisguard_X_ implements Listener {
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_X(EntitySpawnEvent paramEntitySpawnEvent) {
    long l = a ^ 0x19EC34FB6FC8L;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_a();
    try {
      if (arrayOfAbstractCheck == null)
        try {
          if (paramEntitySpawnEvent.getEntity() instanceof Firework) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Firework firework = (Firework)paramEntitySpawnEvent.getEntity();
    try {
      if (arrayOfAbstractCheck == null)
        try {
          if (firework.getShooter() instanceof Player) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Player player = (Player)firework.getShooter();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_MK(new Object[] { Integer.valueOf(0) });
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_p(BlockPlaceEvent paramBlockPlaceEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 42643036095665
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 63817710278221
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 123646920712419
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 97039783480476
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 18456661455248
    //   34: lxor
    //   35: lstore #10
    //   37: dup2
    //   38: ldc2_w 87311910794591
    //   41: lxor
    //   42: lstore #12
    //   44: pop2
    //   45: aload_1
    //   46: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   49: astore #15
    //   51: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   54: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   57: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   60: aload #15
    //   62: iconst_1
    //   63: anewarray java/lang/Object
    //   66: dup_x1
    //   67: swap
    //   68: iconst_0
    //   69: swap
    //   70: aastore
    //   71: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   74: astore #16
    //   76: astore #14
    //   78: aload #16
    //   80: aload #14
    //   82: ifnonnull -> 98
    //   85: ifnonnull -> 96
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: return
    //   96: aload #16
    //   98: iconst_0
    //   99: anewarray java/lang/Object
    //   102: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   105: aload #14
    //   107: ifnonnull -> 170
    //   110: lload #4
    //   112: iconst_1
    //   113: anewarray java/lang/Object
    //   116: dup_x2
    //   117: dup_x2
    //   118: pop
    //   119: invokestatic valueOf : (J)Ljava/lang/Long;
    //   122: iconst_0
    //   123: swap
    //   124: aastore
    //   125: invokevirtual aegisguard_ED : ([Ljava/lang/Object;)V
    //   128: aload_1
    //   129: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   132: iconst_1
    //   133: anewarray java/lang/Object
    //   136: dup_x1
    //   137: swap
    //   138: iconst_0
    //   139: swap
    //   140: aastore
    //   141: invokestatic aegisguard_Jj : ([Ljava/lang/Object;)Z
    //   144: ifne -> 161
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: goto -> 177
    //   157: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   160: athrow
    //   161: aload #16
    //   163: iconst_0
    //   164: anewarray java/lang/Object
    //   167: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   170: iconst_0
    //   171: anewarray java/lang/Object
    //   174: invokevirtual aegisguard_Ez : ([Ljava/lang/Object;)V
    //   177: aload_1
    //   178: invokevirtual isCancelled : ()Z
    //   181: ifne -> 191
    //   184: goto -> 207
    //   187: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   190: athrow
    //   191: aload #16
    //   193: iconst_0
    //   194: anewarray java/lang/Object
    //   197: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   200: iconst_0
    //   201: anewarray java/lang/Object
    //   204: invokevirtual aegisguard_x : ([Ljava/lang/Object;)V
    //   207: aload_1
    //   208: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   211: invokeinterface getType : ()Lorg/bukkit/Material;
    //   216: lload #6
    //   218: iconst_2
    //   219: anewarray java/lang/Object
    //   222: dup_x2
    //   223: dup_x2
    //   224: pop
    //   225: invokestatic valueOf : (J)Ljava/lang/Long;
    //   228: iconst_1
    //   229: swap
    //   230: aastore
    //   231: dup_x1
    //   232: swap
    //   233: iconst_0
    //   234: swap
    //   235: aastore
    //   236: invokestatic aegisguard_Z : ([Ljava/lang/Object;)Z
    //   239: ifne -> 249
    //   242: goto -> 265
    //   245: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   248: athrow
    //   249: aload #16
    //   251: iconst_0
    //   252: anewarray java/lang/Object
    //   255: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   258: iconst_0
    //   259: anewarray java/lang/Object
    //   262: invokevirtual aegisguard_EE : ([Ljava/lang/Object;)V
    //   265: aload_1
    //   266: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   269: invokeinterface getType : ()Lorg/bukkit/Material;
    //   274: lload #12
    //   276: dup2_x1
    //   277: pop2
    //   278: iconst_2
    //   279: anewarray java/lang/Object
    //   282: dup_x1
    //   283: swap
    //   284: iconst_1
    //   285: swap
    //   286: aastore
    //   287: dup_x2
    //   288: dup_x2
    //   289: pop
    //   290: invokestatic valueOf : (J)Ljava/lang/Long;
    //   293: iconst_0
    //   294: swap
    //   295: aastore
    //   296: invokestatic aegisguard_O : ([Ljava/lang/Object;)Z
    //   299: ifne -> 309
    //   302: goto -> 325
    //   305: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   308: athrow
    //   309: aload #16
    //   311: iconst_0
    //   312: anewarray java/lang/Object
    //   315: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   318: iconst_0
    //   319: anewarray java/lang/Object
    //   322: invokevirtual aegisguard_E1 : ([Ljava/lang/Object;)V
    //   325: aload_1
    //   326: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   329: invokeinterface getType : ()Lorg/bukkit/Material;
    //   334: lload #8
    //   336: iconst_2
    //   337: anewarray java/lang/Object
    //   340: dup_x2
    //   341: dup_x2
    //   342: pop
    //   343: invokestatic valueOf : (J)Ljava/lang/Long;
    //   346: iconst_1
    //   347: swap
    //   348: aastore
    //   349: dup_x1
    //   350: swap
    //   351: iconst_0
    //   352: swap
    //   353: aastore
    //   354: invokestatic aegisguard_KJ : ([Ljava/lang/Object;)Z
    //   357: ifne -> 367
    //   360: goto -> 383
    //   363: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   366: athrow
    //   367: aload #16
    //   369: iconst_0
    //   370: anewarray java/lang/Object
    //   373: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   376: iconst_0
    //   377: anewarray java/lang/Object
    //   380: invokevirtual aegisguard_Eh : ([Ljava/lang/Object;)V
    //   383: aload #16
    //   385: iconst_0
    //   386: anewarray java/lang/Object
    //   389: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   392: iconst_0
    //   393: anewarray java/lang/Object
    //   396: invokevirtual aegisguard_C_ : ([Ljava/lang/Object;)Z
    //   399: ifne -> 409
    //   402: goto -> 451
    //   405: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   408: athrow
    //   409: aload #15
    //   411: aload #14
    //   413: ifnonnull -> 440
    //   416: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   421: ifnull -> 446
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   430: athrow
    //   431: aload #15
    //   433: goto -> 440
    //   436: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   439: athrow
    //   440: invokeinterface leaveVehicle : ()Z
    //   445: pop
    //   446: aload_1
    //   447: iconst_1
    //   448: invokevirtual setCancelled : (Z)V
    //   451: aload_1
    //   452: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   455: invokeinterface getType : ()Lorg/bukkit/Material;
    //   460: iconst_1
    //   461: anewarray java/lang/Object
    //   464: dup_x1
    //   465: swap
    //   466: iconst_0
    //   467: swap
    //   468: aastore
    //   469: invokestatic aegisguard_F : ([Ljava/lang/Object;)Z
    //   472: ifne -> 482
    //   475: goto -> 504
    //   478: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   481: athrow
    //   482: aload #16
    //   484: iconst_0
    //   485: anewarray java/lang/Object
    //   488: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   491: aload_1
    //   492: iconst_1
    //   493: anewarray java/lang/Object
    //   496: dup_x1
    //   497: swap
    //   498: iconst_0
    //   499: swap
    //   500: aastore
    //   501: invokevirtual aegisguard_EA : ([Ljava/lang/Object;)V
    //   504: aload #16
    //   506: iconst_0
    //   507: anewarray java/lang/Object
    //   510: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   513: iconst_0
    //   514: anewarray java/lang/Object
    //   517: invokevirtual aegisguard_Eq : ([Ljava/lang/Object;)V
    //   520: aload_1
    //   521: lload #10
    //   523: iconst_2
    //   524: anewarray java/lang/Object
    //   527: dup_x2
    //   528: dup_x2
    //   529: pop
    //   530: invokestatic valueOf : (J)Ljava/lang/Long;
    //   533: iconst_1
    //   534: swap
    //   535: aastore
    //   536: dup_x1
    //   537: swap
    //   538: iconst_0
    //   539: swap
    //   540: aastore
    //   541: invokestatic aegisguard_n : ([Ljava/lang/Object;)Z
    //   544: istore #17
    //   546: aload #16
    //   548: iconst_0
    //   549: anewarray java/lang/Object
    //   552: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   555: iload #17
    //   557: iconst_1
    //   558: anewarray java/lang/Object
    //   561: dup_x1
    //   562: swap
    //   563: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   566: iconst_0
    //   567: swap
    //   568: aastore
    //   569: invokevirtual aegisguard_ww : ([Ljava/lang/Object;)V
    //   572: aload #16
    //   574: iconst_0
    //   575: anewarray java/lang/Object
    //   578: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   581: aload_1
    //   582: <illegal opcode> accept : (Lorg/bukkit/event/block/BlockPlaceEvent;)Ljava/util/function/Consumer;
    //   587: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   592: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #49	-> 45
    //   #50	-> 54
    //   #52	-> 78
    //   #54	-> 96
    //   #57	-> 128
    //   #59	-> 161
    //   #63	-> 177
    //   #65	-> 191
    //   #69	-> 207
    //   #71	-> 249
    //   #75	-> 265
    //   #77	-> 309
    //   #81	-> 325
    //   #83	-> 367
    //   #87	-> 383
    //   #89	-> 409
    //   #91	-> 446
    //   #95	-> 451
    //   #97	-> 482
    //   #100	-> 504
    //   #102	-> 520
    //   #103	-> 546
    //   #104	-> 572
    //   #105	-> 592
    // Exception table:
    //   from	to	target	type
    //   78	88	91	java/lang/RuntimeException
    //   98	147	150	java/lang/RuntimeException
    //   110	157	157	java/lang/RuntimeException
    //   177	187	187	java/lang/RuntimeException
    //   207	245	245	java/lang/RuntimeException
    //   265	305	305	java/lang/RuntimeException
    //   325	363	363	java/lang/RuntimeException
    //   383	405	405	java/lang/RuntimeException
    //   409	424	427	java/lang/RuntimeException
    //   416	433	436	java/lang/RuntimeException
    //   451	478	478	java/lang/RuntimeException
  }
  
  private static void lambda$onPlace$0(BlockPlaceEvent paramBlockPlaceEvent, AbstractCheck paramAbstractCheck) {
    long l1 = a ^ 0x73781381C1F8L, l2 = l1 ^ 0x3F8B34E4AFE6L;
    new Object[2];
    paramAbstractCheck.aegisguard_w(new Object[] { null, Long.valueOf(l2), paramBlockPlaceEvent });
  }
  
  @EventHandler(priority = EventPriority.HIGHEST)
  public void aegisguard_v(BlockBreakEvent paramBlockBreakEvent) {
    long l = a ^ 0x47EF94CA7721L;
    Player player = paramBlockBreakEvent.getPlayer();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_a();
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (arrayOfAbstractCheck == null)
        try {
          new Object[3];
          (new Object[3])[2] = Double.valueOf(paramBlockBreakEvent.getBlock().getZ());
          new Object[3];
          (new Object[3])[1] = Double.valueOf(paramBlockBreakEvent.getBlock().getY());
          new Object[3];
          aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_ze(new Object[] { Double.valueOf(paramBlockBreakEvent.getBlock().getX()) });
          if (!paramBlockBreakEvent.isCancelled()) {
            try {
              if (aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_C_(new Object[0]))
                paramBlockBreakEvent.setCancelled(true); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (paramBlockBreakEvent.getBlock().getType().toString().equals(b[6]))
                aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Mq(new Object[] { Integer.valueOf(0) }); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            aegisguard_hu.aegisguard_u(new Object[0]).forEach(paramBlockBreakEvent::lambda$onBreak$1);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_P(new Object[0]);
    try {
      if (aegisguard_hu.aegisguard_x(new Object[0]).aegisguard_C_(new Object[0]))
        paramBlockBreakEvent.setCancelled(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramBlockBreakEvent.getBlock().getType().toString().equals(b[6]))
        aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Mq(new Object[] { Integer.valueOf(0) }); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_u(new Object[0]).forEach(paramBlockBreakEvent::lambda$onBreak$1);
  }
  
  private static void lambda$onBreak$1(BlockBreakEvent paramBlockBreakEvent, AbstractCheck paramAbstractCheck) {
    long l1 = a ^ 0x5730370A11A3L, l2 = l1 ^ 0x1BC3106F7FBDL;
    new Object[2];
    paramAbstractCheck.aegisguard_w(new Object[] { null, Long.valueOf(l2), paramBlockBreakEvent });
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_l(PlayerPickupItemEvent paramPlayerPickupItemEvent) {
    long l = a ^ 0x7346CE62FBL;
    Player player = paramPlayerPickupItemEvent.getPlayer();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_a();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_EL(new Object[0]);
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_q(PlayerItemConsumeEvent paramPlayerItemConsumeEvent) {
    long l = a ^ 0x43DE6BD97D01L;
    Player player = paramPlayerItemConsumeEvent.getPlayer();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (aegisguard_hu == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramPlayerItemConsumeEvent.getItem().toString().contains(b[3]))
        aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Ej(new Object[0]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_n(PlayerBedEnterEvent paramPlayerBedEnterEvent) {
    long l = a ^ 0x64C776DAD461L;
    Player player = paramPlayerBedEnterEvent.getPlayer();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_a();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_U(new Object[0]);
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_M(PlayerBedLeaveEvent paramPlayerBedLeaveEvent) {
    long l = a ^ 0x3273E5703598L;
    Player player = paramPlayerBedLeaveEvent.getPlayer();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_a();
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_ET(new Object[0]);
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_G(PlayerInteractEvent paramPlayerInteractEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 101271168270301
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: aload_1
    //   12: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   15: astore #5
    //   17: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   20: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   23: aload #5
    //   25: iconst_1
    //   26: anewarray java/lang/Object
    //   29: dup_x1
    //   30: swap
    //   31: iconst_0
    //   32: swap
    //   33: aastore
    //   34: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   37: astore #6
    //   39: astore #4
    //   41: aload #6
    //   43: ifnonnull -> 51
    //   46: return
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: aload_1
    //   52: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   55: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   58: aload #4
    //   60: ifnonnull -> 119
    //   63: if_acmpne -> 100
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: aload #6
    //   75: iconst_0
    //   76: anewarray java/lang/Object
    //   79: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   82: aload_1
    //   83: <illegal opcode> accept : (Lorg/bukkit/event/player/PlayerInteractEvent;)Ljava/util/function/Consumer;
    //   88: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: aload_1
    //   101: aload #4
    //   103: ifnonnull -> 159
    //   106: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   109: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_AIR : Lorg/bukkit/event/block/Action;
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: if_acmpeq -> 151
    //   122: aload_1
    //   123: aload #4
    //   125: ifnonnull -> 251
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   138: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   141: if_acmpne -> 250
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: aload_1
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: aload #4
    //   161: ifnonnull -> 251
    //   164: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   167: ifnull -> 250
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   176: athrow
    //   177: aload_1
    //   178: aload #4
    //   180: ifnonnull -> 251
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   189: athrow
    //   190: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   193: invokevirtual getType : ()Lorg/bukkit/Material;
    //   196: iconst_1
    //   197: anewarray java/lang/Object
    //   200: dup_x1
    //   201: swap
    //   202: iconst_0
    //   203: swap
    //   204: aastore
    //   205: invokestatic aegisguard_KD : ([Ljava/lang/Object;)Z
    //   208: ifeq -> 250
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload #6
    //   220: iconst_0
    //   221: anewarray java/lang/Object
    //   224: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   227: iconst_0
    //   228: iconst_1
    //   229: anewarray java/lang/Object
    //   232: dup_x1
    //   233: swap
    //   234: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   237: iconst_0
    //   238: swap
    //   239: aastore
    //   240: invokevirtual aegisguard_MM : ([Ljava/lang/Object;)V
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: aload_1
    //   251: aload #4
    //   253: ifnonnull -> 377
    //   256: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   259: ifnull -> 376
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   268: athrow
    //   269: aload_1
    //   270: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   273: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   276: aload #4
    //   278: ifnonnull -> 383
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   287: athrow
    //   288: if_acmpne -> 376
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   297: athrow
    //   298: aload_1
    //   299: aload #4
    //   301: ifnonnull -> 377
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   310: athrow
    //   311: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   314: invokeinterface getType : ()Lorg/bukkit/Material;
    //   319: iconst_1
    //   320: anewarray java/lang/Object
    //   323: dup_x1
    //   324: swap
    //   325: iconst_0
    //   326: swap
    //   327: aastore
    //   328: invokestatic aegisguard_Ka : ([Ljava/lang/Object;)Z
    //   331: ifeq -> 376
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   340: athrow
    //   341: aload #6
    //   343: iconst_0
    //   344: anewarray java/lang/Object
    //   347: invokevirtual aegisguard_v : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XR;
    //   350: invokestatic currentTimeMillis : ()J
    //   353: iconst_1
    //   354: anewarray java/lang/Object
    //   357: dup_x2
    //   358: dup_x2
    //   359: pop
    //   360: invokestatic valueOf : (J)Ljava/lang/Long;
    //   363: iconst_0
    //   364: swap
    //   365: aastore
    //   366: invokevirtual aegisguard_J : ([Ljava/lang/Object;)V
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   375: athrow
    //   376: aload_1
    //   377: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   380: getstatic org/bukkit/event/block/Action.LEFT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   383: aload #4
    //   385: ifnonnull -> 441
    //   388: if_acmpeq -> 427
    //   391: goto -> 398
    //   394: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   397: athrow
    //   398: aload_1
    //   399: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   402: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   405: aload #4
    //   407: ifnonnull -> 441
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   416: athrow
    //   417: if_acmpne -> 891
    //   420: goto -> 427
    //   423: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   426: athrow
    //   427: aload_1
    //   428: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   431: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   440: athrow
    //   441: aload #4
    //   443: ifnonnull -> 573
    //   446: if_acmpne -> 554
    //   449: goto -> 456
    //   452: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   455: athrow
    //   456: aload_1
    //   457: aload #4
    //   459: ifnonnull -> 555
    //   462: goto -> 469
    //   465: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   468: athrow
    //   469: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   472: ifnull -> 554
    //   475: goto -> 482
    //   478: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   481: athrow
    //   482: aload_1
    //   483: aload #4
    //   485: ifnonnull -> 555
    //   488: goto -> 495
    //   491: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   494: athrow
    //   495: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   498: invokevirtual getType : ()Lorg/bukkit/Material;
    //   501: invokevirtual toString : ()Ljava/lang/String;
    //   504: getstatic me/frep/aegisguard/spigot/aegisguard_X_.b : [Ljava/lang/String;
    //   507: iconst_0
    //   508: aaload
    //   509: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   512: ifeq -> 554
    //   515: goto -> 522
    //   518: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   521: athrow
    //   522: aload #6
    //   524: iconst_0
    //   525: anewarray java/lang/Object
    //   528: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   531: iconst_0
    //   532: iconst_1
    //   533: anewarray java/lang/Object
    //   536: dup_x1
    //   537: swap
    //   538: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   541: iconst_0
    //   542: swap
    //   543: aastore
    //   544: invokevirtual aegisguard_F : ([Ljava/lang/Object;)V
    //   547: goto -> 554
    //   550: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   553: athrow
    //   554: aload_1
    //   555: aload #4
    //   557: ifnonnull -> 577
    //   560: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   563: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   566: goto -> 573
    //   569: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   572: athrow
    //   573: if_acmpne -> 875
    //   576: aload_1
    //   577: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   580: aload #4
    //   582: ifnonnull -> 618
    //   585: ifnull -> 875
    //   588: goto -> 595
    //   591: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   594: athrow
    //   595: aload_1
    //   596: aload #4
    //   598: ifnonnull -> 643
    //   601: goto -> 608
    //   604: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   607: athrow
    //   608: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   617: athrow
    //   618: invokevirtual getType : ()Lorg/bukkit/Material;
    //   621: invokevirtual toString : ()Ljava/lang/String;
    //   624: getstatic me/frep/aegisguard/spigot/aegisguard_X_.b : [Ljava/lang/String;
    //   627: iconst_1
    //   628: aaload
    //   629: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   632: ifeq -> 875
    //   635: aload_1
    //   636: goto -> 643
    //   639: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   642: athrow
    //   643: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   646: aload #4
    //   648: ifnonnull -> 672
    //   651: ifnull -> 875
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   660: athrow
    //   661: aload_1
    //   662: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   665: goto -> 672
    //   668: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   671: athrow
    //   672: invokeinterface getType : ()Lorg/bukkit/Material;
    //   677: invokestatic aegisguard_Kx : (Lorg/bukkit/Material;)Z
    //   680: aload #4
    //   682: ifnonnull -> 711
    //   685: ifne -> 875
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   694: athrow
    //   695: aload_1
    //   696: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   699: invokeinterface getX : ()I
    //   704: goto -> 711
    //   707: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   710: athrow
    //   711: i2d
    //   712: dstore #7
    //   714: aload_1
    //   715: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   718: invokeinterface getY : ()I
    //   723: i2d
    //   724: dstore #9
    //   726: aload_1
    //   727: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   730: invokeinterface getZ : ()I
    //   735: i2d
    //   736: dstore #11
    //   738: aload #5
    //   740: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   745: invokevirtual getX : ()D
    //   748: dstore #13
    //   750: aload #5
    //   752: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   757: invokevirtual getY : ()D
    //   760: dstore #15
    //   762: aload #5
    //   764: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   769: invokevirtual getZ : ()D
    //   772: dstore #17
    //   774: dload #7
    //   776: dload #13
    //   778: dsub
    //   779: invokestatic abs : (D)D
    //   782: dload #9
    //   784: dload #15
    //   786: dsub
    //   787: invokestatic abs : (D)D
    //   790: dload #11
    //   792: dload #17
    //   794: dsub
    //   795: invokestatic abs : (D)D
    //   798: iconst_3
    //   799: anewarray java/lang/Object
    //   802: dup_x2
    //   803: dup_x2
    //   804: pop
    //   805: invokestatic valueOf : (D)Ljava/lang/Double;
    //   808: iconst_2
    //   809: swap
    //   810: aastore
    //   811: dup_x2
    //   812: dup_x2
    //   813: pop
    //   814: invokestatic valueOf : (D)Ljava/lang/Double;
    //   817: iconst_1
    //   818: swap
    //   819: aastore
    //   820: dup_x2
    //   821: dup_x2
    //   822: pop
    //   823: invokestatic valueOf : (D)Ljava/lang/Double;
    //   826: iconst_0
    //   827: swap
    //   828: aastore
    //   829: invokestatic aegisguard_z : ([Ljava/lang/Object;)D
    //   832: dstore #19
    //   834: dload #19
    //   836: ldc2_w 2.25
    //   839: dcmpg
    //   840: ifge -> 875
    //   843: aload #6
    //   845: iconst_0
    //   846: anewarray java/lang/Object
    //   849: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   852: iconst_0
    //   853: iconst_1
    //   854: anewarray java/lang/Object
    //   857: dup_x1
    //   858: swap
    //   859: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   862: iconst_0
    //   863: swap
    //   864: aastore
    //   865: invokevirtual aegisguard_MP : ([Ljava/lang/Object;)V
    //   868: goto -> 875
    //   871: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   874: athrow
    //   875: aload #6
    //   877: iconst_0
    //   878: anewarray java/lang/Object
    //   881: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   884: iconst_0
    //   885: anewarray java/lang/Object
    //   888: invokevirtual aegisguard_V : ([Ljava/lang/Object;)V
    //   891: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #179	-> 11
    //   #180	-> 17
    //   #182	-> 41
    //   #184	-> 51
    //   #185	-> 73
    //   #188	-> 100
    //   #189	-> 177
    //   #191	-> 218
    //   #194	-> 250
    //   #196	-> 341
    //   #199	-> 376
    //   #201	-> 427
    //   #202	-> 522
    //   #205	-> 554
    //   #206	-> 643
    //   #207	-> 695
    //   #208	-> 714
    //   #209	-> 726
    //   #211	-> 738
    //   #212	-> 750
    //   #213	-> 762
    //   #215	-> 774
    //   #217	-> 834
    //   #218	-> 843
    //   #222	-> 875
    //   #224	-> 891
    // Exception table:
    //   from	to	target	type
    //   41	47	47	java/lang/RuntimeException
    //   51	66	69	java/lang/RuntimeException
    //   63	93	96	java/lang/RuntimeException
    //   100	112	115	java/lang/RuntimeException
    //   119	128	131	java/lang/RuntimeException
    //   122	144	147	java/lang/RuntimeException
    //   135	152	155	java/lang/RuntimeException
    //   159	170	173	java/lang/RuntimeException
    //   164	183	186	java/lang/RuntimeException
    //   177	211	214	java/lang/RuntimeException
    //   190	243	246	java/lang/RuntimeException
    //   251	262	265	java/lang/RuntimeException
    //   256	281	284	java/lang/RuntimeException
    //   269	291	294	java/lang/RuntimeException
    //   288	304	307	java/lang/RuntimeException
    //   298	334	337	java/lang/RuntimeException
    //   311	369	372	java/lang/RuntimeException
    //   383	391	394	java/lang/RuntimeException
    //   388	410	413	java/lang/RuntimeException
    //   398	420	423	java/lang/RuntimeException
    //   417	434	437	java/lang/RuntimeException
    //   441	449	452	java/lang/RuntimeException
    //   446	462	465	java/lang/RuntimeException
    //   456	475	478	java/lang/RuntimeException
    //   469	488	491	java/lang/RuntimeException
    //   482	515	518	java/lang/RuntimeException
    //   495	547	550	java/lang/RuntimeException
    //   555	566	569	java/lang/RuntimeException
    //   577	588	591	java/lang/RuntimeException
    //   585	601	604	java/lang/RuntimeException
    //   595	611	614	java/lang/RuntimeException
    //   618	636	639	java/lang/RuntimeException
    //   643	654	657	java/lang/RuntimeException
    //   651	665	668	java/lang/RuntimeException
    //   672	688	691	java/lang/RuntimeException
    //   685	704	707	java/lang/RuntimeException
    //   834	868	871	java/lang/RuntimeException
  }
  
  private static void lambda$onInteract$2(PlayerInteractEvent paramPlayerInteractEvent, AbstractCheck paramAbstractCheck) {
    long l1 = a ^ 0xA7ACDD3A819L, l2 = l1 ^ 0x4689EAB6C607L;
    new Object[2];
    paramAbstractCheck.aegisguard_w(new Object[] { null, Long.valueOf(l2), paramPlayerInteractEvent });
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_z(PlayerDeathEvent paramPlayerDeathEvent) {
    long l = a ^ 0x2C09DEE3FE49L;
    Player player = paramPlayerDeathEvent.getEntity();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_a();
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_E5(new Object[0]);
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_D(EntityDamageEvent paramEntityDamageEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 130808982664879
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 124780688811853
    //   13: lxor
    //   14: lstore #4
    //   16: pop2
    //   17: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   20: astore #6
    //   22: aload_1
    //   23: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   26: instanceof org/bukkit/entity/Player
    //   29: aload #6
    //   31: ifnonnull -> 67
    //   34: ifeq -> 70
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   43: athrow
    //   44: aload_1
    //   45: aload #6
    //   47: ifnonnull -> 72
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: invokevirtual isCancelled : ()Z
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: ifeq -> 71
    //   70: return
    //   71: aload_1
    //   72: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   75: checkcast org/bukkit/entity/Player
    //   78: astore #7
    //   80: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   83: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   86: aload #7
    //   88: iconst_1
    //   89: anewarray java/lang/Object
    //   92: dup_x1
    //   93: swap
    //   94: iconst_0
    //   95: swap
    //   96: aastore
    //   97: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   100: astore #8
    //   102: aload #8
    //   104: aload #6
    //   106: ifnonnull -> 122
    //   109: ifnonnull -> 120
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: return
    //   120: aload #8
    //   122: aload #6
    //   124: ifnonnull -> 165
    //   127: iconst_0
    //   128: anewarray java/lang/Object
    //   131: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   134: iconst_0
    //   135: anewarray java/lang/Object
    //   138: invokevirtual aegisguard_C_ : ([Ljava/lang/Object;)Z
    //   141: ifeq -> 163
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: aload_1
    //   152: iconst_1
    //   153: invokevirtual setCancelled : (Z)V
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload #8
    //   165: iconst_0
    //   166: anewarray java/lang/Object
    //   169: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   172: aload_1
    //   173: invokevirtual getCause : ()Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   176: lload #4
    //   178: dup2_x1
    //   179: pop2
    //   180: iconst_2
    //   181: anewarray java/lang/Object
    //   184: dup_x1
    //   185: swap
    //   186: iconst_1
    //   187: swap
    //   188: aastore
    //   189: dup_x2
    //   190: dup_x2
    //   191: pop
    //   192: invokestatic valueOf : (J)Ljava/lang/Long;
    //   195: iconst_0
    //   196: swap
    //   197: aastore
    //   198: invokevirtual aegisguard_zG : ([Ljava/lang/Object;)V
    //   201: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #238	-> 22
    //   #239	-> 71
    //   #240	-> 80
    //   #242	-> 102
    //   #244	-> 120
    //   #246	-> 163
    //   #247	-> 201
    // Exception table:
    //   from	to	target	type
    //   22	37	40	java/lang/RuntimeException
    //   34	50	53	java/lang/RuntimeException
    //   44	60	63	java/lang/RuntimeException
    //   102	112	115	java/lang/RuntimeException
    //   122	144	147	java/lang/RuntimeException
    //   127	156	159	java/lang/RuntimeException
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_N(PlayerInteractEntityEvent paramPlayerInteractEntityEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 10593979593653
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: aload_1
    //   12: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   15: astore #5
    //   17: astore #4
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   22: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   25: aload #5
    //   27: iconst_1
    //   28: anewarray java/lang/Object
    //   31: dup_x1
    //   32: swap
    //   33: iconst_0
    //   34: swap
    //   35: aastore
    //   36: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   39: astore #6
    //   41: aload #6
    //   43: ifnonnull -> 51
    //   46: return
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: getstatic me/frep/aegisguard/spigot/aegisguard_Xf.aegisguard_f : [I
    //   54: aload_1
    //   55: invokevirtual getRightClicked : ()Lorg/bukkit/entity/Entity;
    //   58: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   63: invokevirtual ordinal : ()I
    //   66: iaload
    //   67: tableswitch default -> 179, 1 -> 104, 2 -> 104, 3 -> 104, 4 -> 104, 5 -> 104, 6 -> 144
    //   104: aload #6
    //   106: iconst_0
    //   107: anewarray java/lang/Object
    //   110: invokevirtual aegisguard_v : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XR;
    //   113: invokestatic currentTimeMillis : ()J
    //   116: iconst_1
    //   117: anewarray java/lang/Object
    //   120: dup_x2
    //   121: dup_x2
    //   122: pop
    //   123: invokestatic valueOf : (J)Ljava/lang/Long;
    //   126: iconst_0
    //   127: swap
    //   128: aastore
    //   129: invokevirtual aegisguard_k : ([Ljava/lang/Object;)V
    //   132: aload #4
    //   134: ifnull -> 179
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: aload #6
    //   146: iconst_0
    //   147: anewarray java/lang/Object
    //   150: invokevirtual aegisguard_v : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XR;
    //   153: invokestatic currentTimeMillis : ()J
    //   156: iconst_1
    //   157: anewarray java/lang/Object
    //   160: dup_x2
    //   161: dup_x2
    //   162: pop
    //   163: invokestatic valueOf : (J)Ljava/lang/Long;
    //   166: iconst_0
    //   167: swap
    //   168: aastore
    //   169: invokevirtual aegisguard_i : ([Ljava/lang/Object;)V
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #251	-> 11
    //   #252	-> 19
    //   #254	-> 41
    //   #256	-> 51
    //   #262	-> 104
    //   #263	-> 132
    //   #265	-> 144
    //   #268	-> 179
    // Exception table:
    //   from	to	target	type
    //   41	47	47	java/lang/RuntimeException
    //   51	137	140	java/lang/RuntimeException
    //   104	172	175	java/lang/RuntimeException
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_m(ProjectileLaunchEvent paramProjectileLaunchEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 15184762141430
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: astore #4
    //   13: aload_1
    //   14: invokevirtual getEntity : ()Lorg/bukkit/entity/Projectile;
    //   17: instanceof org/bukkit/entity/Arrow
    //   20: aload #4
    //   22: ifnonnull -> 196
    //   25: ifeq -> 182
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   34: athrow
    //   35: aload_1
    //   36: invokevirtual getEntity : ()Lorg/bukkit/entity/Projectile;
    //   39: checkcast org/bukkit/entity/Arrow
    //   42: astore #5
    //   44: aload #5
    //   46: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   51: aload #4
    //   53: ifnonnull -> 80
    //   56: ifnull -> 177
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: aload #5
    //   68: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aload #4
    //   82: ifnonnull -> 112
    //   85: instanceof org/bukkit/entity/Player
    //   88: ifeq -> 177
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   97: athrow
    //   98: aload #5
    //   100: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: checkcast org/bukkit/entity/Player
    //   115: astore #6
    //   117: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   120: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   123: aload #6
    //   125: iconst_1
    //   126: anewarray java/lang/Object
    //   129: dup_x1
    //   130: swap
    //   131: iconst_0
    //   132: swap
    //   133: aastore
    //   134: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   137: astore #7
    //   139: aload #7
    //   141: aload #4
    //   143: ifnonnull -> 159
    //   146: ifnonnull -> 157
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   155: athrow
    //   156: return
    //   157: aload #7
    //   159: iconst_0
    //   160: anewarray java/lang/Object
    //   163: invokevirtual aegisguard_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   166: aload_1
    //   167: <illegal opcode> accept : (Lorg/bukkit/event/entity/ProjectileLaunchEvent;)Ljava/util/function/Consumer;
    //   172: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   177: aload #4
    //   179: ifnull -> 700
    //   182: aload_1
    //   183: invokevirtual getEntity : ()Lorg/bukkit/entity/Projectile;
    //   186: instanceof org/bukkit/entity/Snowball
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: aload #4
    //   198: ifnonnull -> 368
    //   201: ifeq -> 354
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: aload_1
    //   212: invokevirtual getEntity : ()Lorg/bukkit/entity/Projectile;
    //   215: checkcast org/bukkit/entity/Snowball
    //   218: astore #5
    //   220: aload #5
    //   222: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   227: aload #4
    //   229: ifnonnull -> 256
    //   232: ifnull -> 349
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: aload #5
    //   244: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   255: athrow
    //   256: aload #4
    //   258: ifnonnull -> 288
    //   261: instanceof org/bukkit/entity/Player
    //   264: ifeq -> 349
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   273: athrow
    //   274: aload #5
    //   276: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   287: athrow
    //   288: checkcast org/bukkit/entity/Player
    //   291: astore #6
    //   293: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   296: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   299: aload #6
    //   301: iconst_1
    //   302: anewarray java/lang/Object
    //   305: dup_x1
    //   306: swap
    //   307: iconst_0
    //   308: swap
    //   309: aastore
    //   310: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   313: astore #7
    //   315: aload #7
    //   317: aload #4
    //   319: ifnonnull -> 335
    //   322: ifnonnull -> 333
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   331: athrow
    //   332: return
    //   333: aload #7
    //   335: iconst_0
    //   336: anewarray java/lang/Object
    //   339: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   342: iconst_0
    //   343: anewarray java/lang/Object
    //   346: invokevirtual aegisguard_Et : ([Ljava/lang/Object;)V
    //   349: aload #4
    //   351: ifnull -> 700
    //   354: aload_1
    //   355: invokevirtual getEntity : ()Lorg/bukkit/entity/Projectile;
    //   358: instanceof org/bukkit/entity/Egg
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   367: athrow
    //   368: aload #4
    //   370: ifnonnull -> 552
    //   373: ifeq -> 526
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   382: athrow
    //   383: aload_1
    //   384: invokevirtual getEntity : ()Lorg/bukkit/entity/Projectile;
    //   387: checkcast org/bukkit/entity/Egg
    //   390: astore #5
    //   392: aload #5
    //   394: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   399: aload #4
    //   401: ifnonnull -> 428
    //   404: ifnull -> 521
    //   407: goto -> 414
    //   410: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   413: athrow
    //   414: aload #5
    //   416: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   427: athrow
    //   428: aload #4
    //   430: ifnonnull -> 460
    //   433: instanceof org/bukkit/entity/Player
    //   436: ifeq -> 521
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   445: athrow
    //   446: aload #5
    //   448: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   453: goto -> 460
    //   456: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   459: athrow
    //   460: checkcast org/bukkit/entity/Player
    //   463: astore #6
    //   465: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   468: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   471: aload #6
    //   473: iconst_1
    //   474: anewarray java/lang/Object
    //   477: dup_x1
    //   478: swap
    //   479: iconst_0
    //   480: swap
    //   481: aastore
    //   482: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   485: astore #7
    //   487: aload #7
    //   489: aload #4
    //   491: ifnonnull -> 507
    //   494: ifnonnull -> 505
    //   497: goto -> 504
    //   500: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   503: athrow
    //   504: return
    //   505: aload #7
    //   507: iconst_0
    //   508: anewarray java/lang/Object
    //   511: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   514: iconst_0
    //   515: anewarray java/lang/Object
    //   518: invokevirtual aegisguard_Et : ([Ljava/lang/Object;)V
    //   521: aload #4
    //   523: ifnull -> 700
    //   526: aload_1
    //   527: invokevirtual getEntity : ()Lorg/bukkit/entity/Projectile;
    //   530: aload #4
    //   532: ifnonnull -> 566
    //   535: goto -> 542
    //   538: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   541: athrow
    //   542: instanceof org/bukkit/entity/ThrownExpBottle
    //   545: goto -> 552
    //   548: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   551: athrow
    //   552: ifeq -> 700
    //   555: aload_1
    //   556: invokevirtual getEntity : ()Lorg/bukkit/entity/Projectile;
    //   559: goto -> 566
    //   562: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   565: athrow
    //   566: checkcast org/bukkit/entity/ThrownExpBottle
    //   569: astore #5
    //   571: aload #5
    //   573: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   578: aload #4
    //   580: ifnonnull -> 607
    //   583: ifnull -> 700
    //   586: goto -> 593
    //   589: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   592: athrow
    //   593: aload #5
    //   595: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   600: goto -> 607
    //   603: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   606: athrow
    //   607: aload #4
    //   609: ifnonnull -> 639
    //   612: instanceof org/bukkit/entity/Player
    //   615: ifeq -> 700
    //   618: goto -> 625
    //   621: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   624: athrow
    //   625: aload #5
    //   627: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   638: athrow
    //   639: checkcast org/bukkit/entity/Player
    //   642: astore #6
    //   644: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   647: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   650: aload #6
    //   652: iconst_1
    //   653: anewarray java/lang/Object
    //   656: dup_x1
    //   657: swap
    //   658: iconst_0
    //   659: swap
    //   660: aastore
    //   661: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   664: astore #7
    //   666: aload #7
    //   668: aload #4
    //   670: ifnonnull -> 686
    //   673: ifnonnull -> 684
    //   676: goto -> 683
    //   679: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   682: athrow
    //   683: return
    //   684: aload #7
    //   686: iconst_0
    //   687: anewarray java/lang/Object
    //   690: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   693: iconst_0
    //   694: anewarray java/lang/Object
    //   697: invokevirtual aegisguard_Et : ([Ljava/lang/Object;)V
    //   700: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #272	-> 13
    //   #273	-> 35
    //   #275	-> 44
    //   #276	-> 98
    //   #277	-> 117
    //   #279	-> 139
    //   #281	-> 157
    //   #283	-> 177
    //   #284	-> 211
    //   #286	-> 220
    //   #287	-> 274
    //   #288	-> 293
    //   #290	-> 315
    //   #292	-> 333
    //   #295	-> 349
    //   #296	-> 383
    //   #298	-> 392
    //   #299	-> 446
    //   #300	-> 465
    //   #302	-> 487
    //   #304	-> 505
    //   #306	-> 521
    //   #307	-> 555
    //   #309	-> 571
    //   #310	-> 625
    //   #311	-> 644
    //   #313	-> 666
    //   #315	-> 684
    //   #318	-> 700
    // Exception table:
    //   from	to	target	type
    //   13	28	31	java/lang/RuntimeException
    //   44	59	62	java/lang/RuntimeException
    //   56	73	76	java/lang/RuntimeException
    //   80	91	94	java/lang/RuntimeException
    //   85	105	108	java/lang/RuntimeException
    //   139	149	152	java/lang/RuntimeException
    //   177	189	192	java/lang/RuntimeException
    //   196	204	207	java/lang/RuntimeException
    //   220	235	238	java/lang/RuntimeException
    //   232	249	252	java/lang/RuntimeException
    //   256	267	270	java/lang/RuntimeException
    //   261	281	284	java/lang/RuntimeException
    //   315	325	328	java/lang/RuntimeException
    //   349	361	364	java/lang/RuntimeException
    //   368	376	379	java/lang/RuntimeException
    //   392	407	410	java/lang/RuntimeException
    //   404	421	424	java/lang/RuntimeException
    //   428	439	442	java/lang/RuntimeException
    //   433	453	456	java/lang/RuntimeException
    //   487	497	500	java/lang/RuntimeException
    //   521	535	538	java/lang/RuntimeException
    //   526	545	548	java/lang/RuntimeException
    //   552	559	562	java/lang/RuntimeException
    //   571	586	589	java/lang/RuntimeException
    //   583	600	603	java/lang/RuntimeException
    //   607	618	621	java/lang/RuntimeException
    //   612	632	635	java/lang/RuntimeException
    //   666	676	679	java/lang/RuntimeException
  }
  
  private static void lambda$onLaunch$3(ProjectileLaunchEvent paramProjectileLaunchEvent, AbstractCheck paramAbstractCheck) {
    long l1 = a ^ 0x56008E91B3D4L, l2 = l1 ^ 0x1AF3A9F4DDCAL;
    new Object[2];
    paramAbstractCheck.aegisguard_w(new Object[] { null, Long.valueOf(l2), paramProjectileLaunchEvent });
  }
  
  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  public void aegisguard_n(PlayerTeleportEvent paramPlayerTeleportEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 19798155094294
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 115506680758326
    //   13: lxor
    //   14: lstore #4
    //   16: pop2
    //   17: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   20: aload_1
    //   21: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   24: astore #11
    //   26: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   29: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   32: aload #11
    //   34: iconst_1
    //   35: anewarray java/lang/Object
    //   38: dup_x1
    //   39: swap
    //   40: iconst_0
    //   41: swap
    //   42: aastore
    //   43: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   46: astore #12
    //   48: astore #10
    //   50: aload #12
    //   52: ifnull -> 81
    //   55: aload_1
    //   56: aload #10
    //   58: ifnonnull -> 87
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   71: ifnonnull -> 86
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: return
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: aload_1
    //   87: invokevirtual getCause : ()Lorg/bukkit/event/player/PlayerTeleportEvent$TeleportCause;
    //   90: getstatic org/bukkit/event/player/PlayerTeleportEvent$TeleportCause.ENDER_PEARL : Lorg/bukkit/event/player/PlayerTeleportEvent$TeleportCause;
    //   93: if_acmpne -> 150
    //   96: aload #12
    //   98: iconst_0
    //   99: anewarray java/lang/Object
    //   102: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   105: iconst_0
    //   106: anewarray java/lang/Object
    //   109: invokevirtual aegisguard_El : ([Ljava/lang/Object;)V
    //   112: aload #12
    //   114: iconst_0
    //   115: anewarray java/lang/Object
    //   118: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   121: iconst_0
    //   122: anewarray java/lang/Object
    //   125: invokevirtual aegisguard_C_ : ([Ljava/lang/Object;)Z
    //   128: ifne -> 145
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: goto -> 150
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: aload_1
    //   146: iconst_1
    //   147: invokevirtual setCancelled : (Z)V
    //   150: iconst_0
    //   151: anewarray java/lang/Object
    //   154: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   157: ifeq -> 212
    //   160: aload_1
    //   161: invokevirtual getCause : ()Lorg/bukkit/event/player/PlayerTeleportEvent$TeleportCause;
    //   164: getstatic org/bukkit/event/player/PlayerTeleportEvent$TeleportCause.CHORUS_FRUIT : Lorg/bukkit/event/player/PlayerTeleportEvent$TeleportCause;
    //   167: aload #10
    //   169: ifnonnull -> 219
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: if_acmpne -> 212
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: aload #12
    //   191: iconst_0
    //   192: anewarray java/lang/Object
    //   195: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   198: iconst_0
    //   199: anewarray java/lang/Object
    //   202: invokevirtual aegisguard_EC : ([Ljava/lang/Object;)V
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_1
    //   213: invokevirtual getCause : ()Lorg/bukkit/event/player/PlayerTeleportEvent$TeleportCause;
    //   216: getstatic org/bukkit/event/player/PlayerTeleportEvent$TeleportCause.UNKNOWN : Lorg/bukkit/event/player/PlayerTeleportEvent$TeleportCause;
    //   219: aload #10
    //   221: ifnonnull -> 248
    //   224: if_acmpeq -> 274
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   233: athrow
    //   234: aload_1
    //   235: invokevirtual getCause : ()Lorg/bukkit/event/player/PlayerTeleportEvent$TeleportCause;
    //   238: getstatic org/bukkit/event/player/PlayerTeleportEvent$TeleportCause.ENDER_PEARL : Lorg/bukkit/event/player/PlayerTeleportEvent$TeleportCause;
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   247: athrow
    //   248: if_acmpeq -> 274
    //   251: aload #12
    //   253: iconst_0
    //   254: anewarray java/lang/Object
    //   257: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   260: iconst_0
    //   261: anewarray java/lang/Object
    //   264: invokevirtual aegisguard_Es : ([Ljava/lang/Object;)V
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   273: athrow
    //   274: iconst_0
    //   275: anewarray java/lang/Object
    //   278: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   281: aload #10
    //   283: ifnonnull -> 313
    //   286: ifeq -> 521
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   295: athrow
    //   296: aload_1
    //   297: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   300: invokevirtual getX : ()D
    //   303: invokestatic floor : (D)I
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   312: athrow
    //   313: istore #13
    //   315: aload_1
    //   316: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   319: invokevirtual getY : ()D
    //   322: invokestatic floor : (D)I
    //   325: istore #14
    //   327: aload_1
    //   328: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   331: invokevirtual getZ : ()D
    //   334: invokestatic floor : (D)I
    //   337: istore #15
    //   339: aload_1
    //   340: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   343: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   346: aload #10
    //   348: ifnonnull -> 375
    //   351: ifnull -> 521
    //   354: goto -> 361
    //   357: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   360: athrow
    //   361: aload_1
    //   362: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   365: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   368: goto -> 375
    //   371: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   374: athrow
    //   375: iload #13
    //   377: iconst_4
    //   378: ishr
    //   379: iload #15
    //   381: iconst_4
    //   382: ishr
    //   383: aload #10
    //   385: ifnonnull -> 421
    //   388: invokeinterface isChunkLoaded : (II)Z
    //   393: ifeq -> 521
    //   396: goto -> 403
    //   399: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   402: athrow
    //   403: aload_1
    //   404: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   407: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   410: iload #13
    //   412: iload #14
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   420: athrow
    //   421: iload #15
    //   423: iconst_1
    //   424: istore #6
    //   426: istore #7
    //   428: istore #8
    //   430: istore #9
    //   432: lload #4
    //   434: iload #9
    //   436: iload #8
    //   438: iload #7
    //   440: iload #6
    //   442: bipush #6
    //   444: anewarray java/lang/Object
    //   447: dup_x1
    //   448: swap
    //   449: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   452: iconst_5
    //   453: swap
    //   454: aastore
    //   455: dup_x1
    //   456: swap
    //   457: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   460: iconst_4
    //   461: swap
    //   462: aastore
    //   463: dup_x1
    //   464: swap
    //   465: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   468: iconst_3
    //   469: swap
    //   470: aastore
    //   471: dup_x1
    //   472: swap
    //   473: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   476: iconst_2
    //   477: swap
    //   478: aastore
    //   479: dup_x2
    //   480: dup_x2
    //   481: pop
    //   482: invokestatic valueOf : (J)Ljava/lang/Long;
    //   485: iconst_1
    //   486: swap
    //   487: aastore
    //   488: dup_x1
    //   489: swap
    //   490: iconst_0
    //   491: swap
    //   492: aastore
    //   493: invokestatic aegisguard_m : ([Ljava/lang/Object;)Ljava/util/List;
    //   496: astore #16
    //   498: aload #12
    //   500: iconst_0
    //   501: anewarray java/lang/Object
    //   504: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   507: aload #16
    //   509: iconst_1
    //   510: anewarray java/lang/Object
    //   513: dup_x1
    //   514: swap
    //   515: iconst_0
    //   516: swap
    //   517: aastore
    //   518: invokevirtual aegisguard_vG : ([Ljava/lang/Object;)V
    //   521: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #322	-> 20
    //   #323	-> 26
    //   #325	-> 50
    //   #327	-> 86
    //   #328	-> 96
    //   #331	-> 112
    //   #333	-> 145
    //   #337	-> 150
    //   #338	-> 189
    //   #341	-> 212
    //   #342	-> 235
    //   #343	-> 251
    //   #346	-> 274
    //   #347	-> 296
    //   #348	-> 315
    //   #349	-> 327
    //   #351	-> 339
    //   #352	-> 403
    //   #354	-> 498
    //   #357	-> 521
    // Exception table:
    //   from	to	target	type
    //   50	61	64	java/lang/RuntimeException
    //   55	74	77	java/lang/RuntimeException
    //   68	82	82	java/lang/RuntimeException
    //   87	131	134	java/lang/RuntimeException
    //   96	141	141	java/lang/RuntimeException
    //   150	172	175	java/lang/RuntimeException
    //   160	182	185	java/lang/RuntimeException
    //   179	205	208	java/lang/RuntimeException
    //   219	227	230	java/lang/RuntimeException
    //   224	241	244	java/lang/RuntimeException
    //   248	267	270	java/lang/RuntimeException
    //   274	289	292	java/lang/RuntimeException
    //   286	306	309	java/lang/RuntimeException
    //   339	354	357	java/lang/RuntimeException
    //   351	368	371	java/lang/RuntimeException
    //   375	396	399	java/lang/RuntimeException
    //   388	414	417	java/lang/RuntimeException
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard__(PlayerChangedWorldEvent paramPlayerChangedWorldEvent) {
    long l = a ^ 0x56E99A9DADDEL;
    Player player = paramPlayerChangedWorldEvent.getPlayer();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_a();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Em(new Object[0]);
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_N(PlayerFishEvent paramPlayerFishEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 29729879943384
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: astore #4
    //   13: aload_1
    //   14: invokevirtual getCaught : ()Lorg/bukkit/entity/Entity;
    //   17: instanceof org/bukkit/entity/Player
    //   20: aload #4
    //   22: ifnonnull -> 131
    //   25: ifeq -> 105
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   34: athrow
    //   35: aload_1
    //   36: invokevirtual getCaught : ()Lorg/bukkit/entity/Entity;
    //   39: checkcast org/bukkit/entity/Player
    //   42: astore #5
    //   44: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   47: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   50: aload #5
    //   52: iconst_1
    //   53: anewarray java/lang/Object
    //   56: dup_x1
    //   57: swap
    //   58: iconst_0
    //   59: swap
    //   60: aastore
    //   61: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   64: astore #6
    //   66: aload #6
    //   68: aload #4
    //   70: ifnonnull -> 86
    //   73: ifnonnull -> 84
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: return
    //   84: aload #6
    //   86: iconst_0
    //   87: anewarray java/lang/Object
    //   90: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   93: iconst_0
    //   94: anewarray java/lang/Object
    //   97: invokevirtual aegisguard_tm : ([Ljava/lang/Object;)V
    //   100: aload #4
    //   102: ifnull -> 181
    //   105: aload_1
    //   106: aload #4
    //   108: ifnonnull -> 182
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: invokevirtual getCaught : ()Lorg/bukkit/entity/Entity;
    //   121: instanceof org/bukkit/entity/Boat
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: ifeq -> 181
    //   134: aload_1
    //   135: invokevirtual getCaught : ()Lorg/bukkit/entity/Entity;
    //   138: checkcast org/bukkit/entity/Boat
    //   141: astore #5
    //   143: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   146: invokevirtual aegisguard_p : ()Ljava/util/Map;
    //   149: aload #5
    //   151: invokeinterface getEntityId : ()I
    //   156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   159: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   162: invokevirtual aegisguard_W : ()Lme/frep/aegisguard/spigot/aegisguard_K8;
    //   165: iconst_0
    //   166: anewarray java/lang/Object
    //   169: invokevirtual aegisguard_I : ([Ljava/lang/Object;)I
    //   172: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   175: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   180: pop
    //   181: aload_1
    //   182: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   185: astore #5
    //   187: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   190: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   193: aload #5
    //   195: iconst_1
    //   196: anewarray java/lang/Object
    //   199: dup_x1
    //   200: swap
    //   201: iconst_0
    //   202: swap
    //   203: aastore
    //   204: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   207: astore #6
    //   209: aload #6
    //   211: aload #4
    //   213: ifnonnull -> 229
    //   216: ifnonnull -> 227
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   225: athrow
    //   226: return
    //   227: aload #6
    //   229: iconst_0
    //   230: anewarray java/lang/Object
    //   233: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   236: iconst_0
    //   237: anewarray java/lang/Object
    //   240: invokevirtual aegisguard_Ed : ([Ljava/lang/Object;)V
    //   243: invokestatic aegisguard_B : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   246: ifnonnull -> 263
    //   249: iconst_2
    //   250: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   253: invokestatic aegisguard_Z : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   262: athrow
    //   263: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #371	-> 13
    //   #372	-> 35
    //   #373	-> 44
    //   #375	-> 66
    //   #377	-> 84
    //   #378	-> 100
    //   #379	-> 134
    //   #381	-> 143
    //   #384	-> 181
    //   #385	-> 187
    //   #387	-> 209
    //   #389	-> 227
    //   #390	-> 243
    // Exception table:
    //   from	to	target	type
    //   13	28	31	java/lang/RuntimeException
    //   66	76	79	java/lang/RuntimeException
    //   86	111	114	java/lang/RuntimeException
    //   105	124	127	java/lang/RuntimeException
    //   209	219	222	java/lang/RuntimeException
    //   229	256	259	java/lang/RuntimeException
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_X(EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 124509120705954
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 121207735442691
    //   13: lxor
    //   14: dup2
    //   15: bipush #32
    //   17: lushr
    //   18: l2i
    //   19: istore #4
    //   21: dup2
    //   22: bipush #32
    //   24: lshl
    //   25: bipush #56
    //   27: lushr
    //   28: l2i
    //   29: istore #5
    //   31: dup2
    //   32: bipush #40
    //   34: lshl
    //   35: bipush #40
    //   37: lushr
    //   38: l2i
    //   39: istore #6
    //   41: pop2
    //   42: pop2
    //   43: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   46: astore #7
    //   48: aload_1
    //   49: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   52: instanceof org/bukkit/entity/Player
    //   55: aload #7
    //   57: ifnonnull -> 234
    //   60: ifeq -> 227
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: aload_1
    //   71: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   74: checkcast org/bukkit/entity/Player
    //   77: astore #8
    //   79: aload #8
    //   81: getstatic me/frep/aegisguard/spigot/aegisguard_X_.b : [Ljava/lang/String;
    //   84: iconst_5
    //   85: aaload
    //   86: invokeinterface hasMetadata : (Ljava/lang/String;)Z
    //   91: aload #7
    //   93: ifnonnull -> 126
    //   96: ifne -> 129
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: aload #8
    //   108: getstatic me/frep/aegisguard/spigot/aegisguard_X_.b : [Ljava/lang/String;
    //   111: bipush #7
    //   113: aaload
    //   114: invokeinterface hasMetadata : (Ljava/lang/String;)Z
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: ifeq -> 130
    //   129: return
    //   130: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   133: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   136: aload #8
    //   138: iconst_1
    //   139: anewarray java/lang/Object
    //   142: dup_x1
    //   143: swap
    //   144: iconst_0
    //   145: swap
    //   146: aastore
    //   147: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   150: astore #9
    //   152: aload #9
    //   154: ifnonnull -> 162
    //   157: return
    //   158: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   161: athrow
    //   162: aload_1
    //   163: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   166: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   171: astore #10
    //   173: aload #9
    //   175: iconst_0
    //   176: anewarray java/lang/Object
    //   179: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   182: iload #4
    //   184: aload #10
    //   186: iload #5
    //   188: i2b
    //   189: iload #6
    //   191: iconst_4
    //   192: anewarray java/lang/Object
    //   195: dup_x1
    //   196: swap
    //   197: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   200: iconst_3
    //   201: swap
    //   202: aastore
    //   203: dup_x1
    //   204: swap
    //   205: invokestatic valueOf : (I)Ljava/lang/Integer;
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
    //   218: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   221: iconst_0
    //   222: swap
    //   223: aastore
    //   224: invokevirtual aegisguard_ve : ([Ljava/lang/Object;)V
    //   227: aload_1
    //   228: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   231: instanceof org/bukkit/entity/Player
    //   234: aload #7
    //   236: ifnonnull -> 493
    //   239: ifeq -> 486
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   248: athrow
    //   249: aload_1
    //   250: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   253: instanceof org/bukkit/entity/Arrow
    //   256: aload #7
    //   258: ifnonnull -> 493
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: ifeq -> 486
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   277: athrow
    //   278: aload_1
    //   279: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   282: checkcast org/bukkit/entity/Arrow
    //   285: astore #8
    //   287: aload_1
    //   288: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   291: checkcast org/bukkit/entity/Player
    //   294: astore #9
    //   296: aload #8
    //   298: aload #7
    //   300: ifnonnull -> 490
    //   303: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   308: ifnull -> 486
    //   311: goto -> 318
    //   314: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   317: athrow
    //   318: aload #8
    //   320: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   325: instanceof org/bukkit/entity/Player
    //   328: aload #7
    //   330: ifnonnull -> 493
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   339: athrow
    //   340: ifeq -> 486
    //   343: goto -> 350
    //   346: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   349: athrow
    //   350: aload #8
    //   352: invokeinterface getShooter : ()Lorg/bukkit/projectiles/ProjectileSource;
    //   357: checkcast org/bukkit/entity/Player
    //   360: astore #10
    //   362: aload #9
    //   364: invokeinterface getEntityId : ()I
    //   369: aload #7
    //   371: ifnonnull -> 493
    //   374: aload #10
    //   376: invokeinterface getEntityId : ()I
    //   381: if_icmpne -> 486
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   390: athrow
    //   391: aload #8
    //   393: invokeinterface getKnockbackStrength : ()I
    //   398: aload #7
    //   400: ifnonnull -> 493
    //   403: goto -> 410
    //   406: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   409: athrow
    //   410: iconst_2
    //   411: if_icmplt -> 486
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   420: athrow
    //   421: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   424: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   427: aload #9
    //   429: iconst_1
    //   430: anewarray java/lang/Object
    //   433: dup_x1
    //   434: swap
    //   435: iconst_0
    //   436: swap
    //   437: aastore
    //   438: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   441: astore #11
    //   443: aload #11
    //   445: aload #7
    //   447: ifnonnull -> 463
    //   450: ifnonnull -> 461
    //   453: goto -> 460
    //   456: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   459: athrow
    //   460: return
    //   461: aload #11
    //   463: iconst_0
    //   464: anewarray java/lang/Object
    //   467: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   470: iconst_0
    //   471: iconst_1
    //   472: anewarray java/lang/Object
    //   475: dup_x1
    //   476: swap
    //   477: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   480: iconst_0
    //   481: swap
    //   482: aastore
    //   483: invokevirtual aegisguard_Mw : ([Ljava/lang/Object;)V
    //   486: aload_1
    //   487: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   490: instanceof org/bukkit/entity/Player
    //   493: aload #7
    //   495: ifnonnull -> 522
    //   498: ifeq -> 563
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   507: athrow
    //   508: aload_1
    //   509: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   512: instanceof org/bukkit/entity/Player
    //   515: goto -> 522
    //   518: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   521: athrow
    //   522: aload #7
    //   524: ifnonnull -> 560
    //   527: ifeq -> 563
    //   530: goto -> 537
    //   533: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   536: athrow
    //   537: aload_1
    //   538: aload #7
    //   540: ifnonnull -> 565
    //   543: goto -> 550
    //   546: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   549: athrow
    //   550: invokevirtual isCancelled : ()Z
    //   553: goto -> 560
    //   556: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   559: athrow
    //   560: ifeq -> 564
    //   563: return
    //   564: aload_1
    //   565: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   568: checkcast org/bukkit/entity/Player
    //   571: astore #8
    //   573: aload_1
    //   574: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   577: checkcast org/bukkit/entity/Player
    //   580: astore #9
    //   582: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   585: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   588: aload #8
    //   590: iconst_1
    //   591: anewarray java/lang/Object
    //   594: dup_x1
    //   595: swap
    //   596: iconst_0
    //   597: swap
    //   598: aastore
    //   599: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   602: astore #10
    //   604: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   607: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   610: aload #9
    //   612: iconst_1
    //   613: anewarray java/lang/Object
    //   616: dup_x1
    //   617: swap
    //   618: iconst_0
    //   619: swap
    //   620: aastore
    //   621: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   624: astore #11
    //   626: aload #10
    //   628: aload #7
    //   630: ifnonnull -> 645
    //   633: ifnull -> 660
    //   636: goto -> 643
    //   639: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   642: athrow
    //   643: aload #11
    //   645: aload #7
    //   647: ifnonnull -> 663
    //   650: ifnonnull -> 661
    //   653: goto -> 660
    //   656: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   659: athrow
    //   660: return
    //   661: aload #11
    //   663: iconst_0
    //   664: anewarray java/lang/Object
    //   667: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   670: iconst_0
    //   671: anewarray java/lang/Object
    //   674: invokevirtual aegisguard_C_ : ([Ljava/lang/Object;)Z
    //   677: aload #7
    //   679: ifnonnull -> 715
    //   682: ifne -> 718
    //   685: goto -> 692
    //   688: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   691: athrow
    //   692: aload #10
    //   694: iconst_0
    //   695: anewarray java/lang/Object
    //   698: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   701: iconst_0
    //   702: anewarray java/lang/Object
    //   705: invokevirtual aegisguard_C_ : ([Ljava/lang/Object;)Z
    //   708: goto -> 715
    //   711: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   714: athrow
    //   715: ifeq -> 730
    //   718: aload_1
    //   719: iconst_1
    //   720: invokevirtual setCancelled : (Z)V
    //   723: goto -> 730
    //   726: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   729: athrow
    //   730: aload_1
    //   731: invokevirtual getCause : ()Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   734: getstatic org/bukkit/event/entity/EntityDamageEvent$DamageCause.ENTITY_ATTACK : Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   737: if_acmpne -> 779
    //   740: aload #10
    //   742: iconst_0
    //   743: anewarray java/lang/Object
    //   746: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   749: iconst_0
    //   750: anewarray java/lang/Object
    //   753: invokevirtual aegisguard_r : ([Ljava/lang/Object;)V
    //   756: aload #11
    //   758: iconst_0
    //   759: anewarray java/lang/Object
    //   762: invokevirtual aegisguard_r : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KQ;
    //   765: iconst_0
    //   766: anewarray java/lang/Object
    //   769: invokevirtual aegisguard_k : ([Ljava/lang/Object;)V
    //   772: goto -> 779
    //   775: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   778: athrow
    //   779: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #394	-> 48
    //   #395	-> 70
    //   #397	-> 79
    //   #399	-> 130
    //   #401	-> 152
    //   #403	-> 162
    //   #405	-> 173
    //   #407	-> 227
    //   #408	-> 278
    //   #409	-> 287
    //   #411	-> 296
    //   #412	-> 350
    //   #414	-> 362
    //   #415	-> 391
    //   #416	-> 421
    //   #418	-> 443
    //   #420	-> 461
    //   #425	-> 486
    //   #427	-> 564
    //   #428	-> 573
    //   #430	-> 582
    //   #431	-> 604
    //   #433	-> 626
    //   #435	-> 661
    //   #436	-> 718
    //   #439	-> 730
    //   #440	-> 740
    //   #441	-> 756
    //   #443	-> 779
    // Exception table:
    //   from	to	target	type
    //   48	63	66	java/lang/RuntimeException
    //   79	99	102	java/lang/RuntimeException
    //   96	119	122	java/lang/RuntimeException
    //   152	158	158	java/lang/RuntimeException
    //   234	242	245	java/lang/RuntimeException
    //   239	261	264	java/lang/RuntimeException
    //   249	271	274	java/lang/RuntimeException
    //   296	311	314	java/lang/RuntimeException
    //   303	333	336	java/lang/RuntimeException
    //   318	343	346	java/lang/RuntimeException
    //   362	384	387	java/lang/RuntimeException
    //   374	403	406	java/lang/RuntimeException
    //   391	414	417	java/lang/RuntimeException
    //   443	453	456	java/lang/RuntimeException
    //   493	501	504	java/lang/RuntimeException
    //   498	515	518	java/lang/RuntimeException
    //   522	530	533	java/lang/RuntimeException
    //   527	543	546	java/lang/RuntimeException
    //   537	553	556	java/lang/RuntimeException
    //   626	636	639	java/lang/RuntimeException
    //   645	653	656	java/lang/RuntimeException
    //   663	685	688	java/lang/RuntimeException
    //   682	708	711	java/lang/RuntimeException
    //   715	723	726	java/lang/RuntimeException
    //   730	772	775	java/lang/RuntimeException
  }
  
  public final UUID aegisguard_P = UUID.fromString(b[4]);
  
  private static AbstractCheck[] aegisguard_N;
  
  private static final long a = aegisguard_e.a(365495358419925062L, -1596250287069189386L, MethodHandles.lookup().lookupClass()).a(61357876442489L);
  
  private static final String[] b;
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void aegisguard_h(PlayerMoveEvent paramPlayerMoveEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 80292868313861
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 104526668374807
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 3504215173374
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 19986562090034
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 55019659967013
    //   34: lxor
    //   35: lstore #10
    //   37: dup2
    //   38: ldc2_w 126272845687506
    //   41: lxor
    //   42: lstore #12
    //   44: pop2
    //   45: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   48: astore #14
    //   50: aload_1
    //   51: aload #14
    //   53: ifnonnull -> 160
    //   56: invokevirtual getFrom : ()Lorg/bukkit/Location;
    //   59: invokevirtual getX : ()D
    //   62: aload_1
    //   63: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   66: invokevirtual getX : ()D
    //   69: dcmpl
    //   70: ifne -> 159
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aload_1
    //   81: aload #14
    //   83: ifnonnull -> 160
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: invokevirtual getFrom : ()Lorg/bukkit/Location;
    //   96: invokevirtual getY : ()D
    //   99: aload_1
    //   100: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   103: invokevirtual getY : ()D
    //   106: dcmpl
    //   107: ifne -> 159
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   116: athrow
    //   117: aload_1
    //   118: aload #14
    //   120: ifnonnull -> 160
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   129: athrow
    //   130: invokevirtual getFrom : ()Lorg/bukkit/Location;
    //   133: invokevirtual getZ : ()D
    //   136: aload_1
    //   137: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   140: invokevirtual getZ : ()D
    //   143: dcmpl
    //   144: ifne -> 159
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: return
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: aload_1
    //   160: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   163: astore #15
    //   165: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   168: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   171: aload #15
    //   173: iconst_1
    //   174: anewarray java/lang/Object
    //   177: dup_x1
    //   178: swap
    //   179: iconst_0
    //   180: swap
    //   181: aastore
    //   182: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   185: astore #16
    //   187: aload #16
    //   189: ifnonnull -> 197
    //   192: return
    //   193: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   196: athrow
    //   197: aload_1
    //   198: invokevirtual isCancelled : ()Z
    //   201: ifeq -> 236
    //   204: aload #16
    //   206: iconst_0
    //   207: anewarray java/lang/Object
    //   210: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   213: iconst_0
    //   214: iconst_1
    //   215: anewarray java/lang/Object
    //   218: dup_x1
    //   219: swap
    //   220: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   223: iconst_0
    //   224: swap
    //   225: aastore
    //   226: invokevirtual aegisguard_h : ([Ljava/lang/Object;)V
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   235: athrow
    //   236: aload #16
    //   238: iconst_0
    //   239: anewarray java/lang/Object
    //   242: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   245: astore #17
    //   247: aload #16
    //   249: iconst_0
    //   250: anewarray java/lang/Object
    //   253: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   256: astore #18
    //   258: aload #18
    //   260: iconst_0
    //   261: iconst_1
    //   262: anewarray java/lang/Object
    //   265: dup_x1
    //   266: swap
    //   267: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   270: iconst_0
    //   271: swap
    //   272: aastore
    //   273: invokevirtual aegisguard_w4 : ([Ljava/lang/Object;)V
    //   276: aload #18
    //   278: iconst_0
    //   279: iconst_1
    //   280: anewarray java/lang/Object
    //   283: dup_x1
    //   284: swap
    //   285: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   288: iconst_0
    //   289: swap
    //   290: aastore
    //   291: invokevirtual aegisguard_Mr : ([Ljava/lang/Object;)V
    //   294: aload #18
    //   296: iconst_0
    //   297: iconst_1
    //   298: anewarray java/lang/Object
    //   301: dup_x1
    //   302: swap
    //   303: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   306: iconst_0
    //   307: swap
    //   308: aastore
    //   309: invokevirtual aegisguard_wP : ([Ljava/lang/Object;)V
    //   312: aload #18
    //   314: iconst_0
    //   315: iconst_1
    //   316: anewarray java/lang/Object
    //   319: dup_x1
    //   320: swap
    //   321: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   324: iconst_0
    //   325: swap
    //   326: aastore
    //   327: invokevirtual aegisguard_MU : ([Ljava/lang/Object;)V
    //   330: aload #18
    //   332: iconst_0
    //   333: iconst_1
    //   334: anewarray java/lang/Object
    //   337: dup_x1
    //   338: swap
    //   339: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   342: iconst_0
    //   343: swap
    //   344: aastore
    //   345: invokevirtual aegisguard_wl : ([Ljava/lang/Object;)V
    //   348: aload #18
    //   350: iconst_0
    //   351: iconst_1
    //   352: anewarray java/lang/Object
    //   355: dup_x1
    //   356: swap
    //   357: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   360: iconst_0
    //   361: swap
    //   362: aastore
    //   363: invokevirtual aegisguard_q : ([Ljava/lang/Object;)V
    //   366: aload #15
    //   368: invokeinterface getActivePotionEffects : ()Ljava/util/Collection;
    //   373: invokeinterface iterator : ()Ljava/util/Iterator;
    //   378: astore #19
    //   380: aload #19
    //   382: invokeinterface hasNext : ()Z
    //   387: ifeq -> 724
    //   390: aload #19
    //   392: invokeinterface next : ()Ljava/lang/Object;
    //   397: checkcast org/bukkit/potion/PotionEffect
    //   400: astore #20
    //   402: aload #20
    //   404: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   407: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   410: invokevirtual equals : (Ljava/lang/Object;)Z
    //   413: aload #14
    //   415: ifnonnull -> 731
    //   418: aload #14
    //   420: ifnonnull -> 500
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   429: athrow
    //   430: ifeq -> 489
    //   433: goto -> 440
    //   436: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   439: athrow
    //   440: aload #18
    //   442: iconst_1
    //   443: iconst_1
    //   444: anewarray java/lang/Object
    //   447: dup_x1
    //   448: swap
    //   449: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   452: iconst_0
    //   453: swap
    //   454: aastore
    //   455: invokevirtual aegisguard_w4 : ([Ljava/lang/Object;)V
    //   458: aload #18
    //   460: aload #20
    //   462: invokevirtual getAmplifier : ()I
    //   465: iconst_1
    //   466: iadd
    //   467: iconst_1
    //   468: anewarray java/lang/Object
    //   471: dup_x1
    //   472: swap
    //   473: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   476: iconst_0
    //   477: swap
    //   478: aastore
    //   479: invokevirtual aegisguard_Mr : ([Ljava/lang/Object;)V
    //   482: goto -> 489
    //   485: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   488: athrow
    //   489: aload #20
    //   491: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   494: getstatic org/bukkit/potion/PotionEffectType.JUMP : Lorg/bukkit/potion/PotionEffectType;
    //   497: invokevirtual equals : (Ljava/lang/Object;)Z
    //   500: aload #14
    //   502: ifnonnull -> 571
    //   505: ifeq -> 564
    //   508: goto -> 515
    //   511: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   514: athrow
    //   515: aload #18
    //   517: iconst_1
    //   518: iconst_1
    //   519: anewarray java/lang/Object
    //   522: dup_x1
    //   523: swap
    //   524: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   527: iconst_0
    //   528: swap
    //   529: aastore
    //   530: invokevirtual aegisguard_wP : ([Ljava/lang/Object;)V
    //   533: aload #18
    //   535: aload #20
    //   537: invokevirtual getAmplifier : ()I
    //   540: iconst_1
    //   541: iadd
    //   542: iconst_1
    //   543: anewarray java/lang/Object
    //   546: dup_x1
    //   547: swap
    //   548: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   551: iconst_0
    //   552: swap
    //   553: aastore
    //   554: invokevirtual aegisguard_MU : ([Ljava/lang/Object;)V
    //   557: goto -> 564
    //   560: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   563: athrow
    //   564: iconst_0
    //   565: anewarray java/lang/Object
    //   568: invokestatic aegisguard_A : ([Ljava/lang/Object;)Z
    //   571: aload #14
    //   573: ifnonnull -> 651
    //   576: ifeq -> 644
    //   579: goto -> 586
    //   582: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   585: athrow
    //   586: aload #20
    //   588: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   591: getstatic org/bukkit/potion/PotionEffectType.LEVITATION : Lorg/bukkit/potion/PotionEffectType;
    //   594: invokevirtual equals : (Ljava/lang/Object;)Z
    //   597: aload #14
    //   599: ifnonnull -> 651
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   608: athrow
    //   609: ifeq -> 644
    //   612: goto -> 619
    //   615: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   618: athrow
    //   619: aload #18
    //   621: iconst_1
    //   622: iconst_1
    //   623: anewarray java/lang/Object
    //   626: dup_x1
    //   627: swap
    //   628: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   631: iconst_0
    //   632: swap
    //   633: aastore
    //   634: invokevirtual aegisguard_q : ([Ljava/lang/Object;)V
    //   637: goto -> 644
    //   640: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   643: athrow
    //   644: iconst_0
    //   645: anewarray java/lang/Object
    //   648: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   651: aload #14
    //   653: ifnonnull -> 684
    //   656: ifeq -> 712
    //   659: goto -> 666
    //   662: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   665: athrow
    //   666: aload #20
    //   668: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   671: getstatic org/bukkit/potion/PotionEffectType.SLOW_FALLING : Lorg/bukkit/potion/PotionEffectType;
    //   674: invokevirtual equals : (Ljava/lang/Object;)Z
    //   677: goto -> 684
    //   680: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   683: athrow
    //   684: ifeq -> 712
    //   687: aload #18
    //   689: iconst_1
    //   690: iconst_1
    //   691: anewarray java/lang/Object
    //   694: dup_x1
    //   695: swap
    //   696: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   699: iconst_0
    //   700: swap
    //   701: aastore
    //   702: invokevirtual aegisguard_wl : ([Ljava/lang/Object;)V
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   711: athrow
    //   712: aload #14
    //   714: ifnull -> 380
    //   717: iconst_5
    //   718: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   721: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   724: iconst_0
    //   725: anewarray java/lang/Object
    //   728: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   731: aload #14
    //   733: ifnonnull -> 809
    //   736: ifeq -> 800
    //   739: goto -> 746
    //   742: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   745: athrow
    //   746: aload #15
    //   748: invokeinterface isGliding : ()Z
    //   753: aload #14
    //   755: ifnonnull -> 809
    //   758: goto -> 765
    //   761: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   764: athrow
    //   765: ifeq -> 800
    //   768: goto -> 775
    //   771: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   774: athrow
    //   775: aload #17
    //   777: iconst_0
    //   778: iconst_1
    //   779: anewarray java/lang/Object
    //   782: dup_x1
    //   783: swap
    //   784: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   787: iconst_0
    //   788: swap
    //   789: aastore
    //   790: invokevirtual aegisguard_p : ([Ljava/lang/Object;)V
    //   793: goto -> 800
    //   796: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   799: athrow
    //   800: aload #17
    //   802: iconst_0
    //   803: anewarray java/lang/Object
    //   806: invokevirtual aegisguard_C_ : ([Ljava/lang/Object;)Z
    //   809: aload #14
    //   811: ifnonnull -> 969
    //   814: ifeq -> 962
    //   817: goto -> 824
    //   820: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   823: athrow
    //   824: aload #15
    //   826: lload #6
    //   828: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_h : Ljava/lang/String;
    //   831: iconst_2
    //   832: anewarray java/lang/Object
    //   835: dup_x1
    //   836: swap
    //   837: iconst_1
    //   838: swap
    //   839: aastore
    //   840: dup_x2
    //   841: dup_x2
    //   842: pop
    //   843: invokestatic valueOf : (J)Ljava/lang/Long;
    //   846: iconst_0
    //   847: swap
    //   848: aastore
    //   849: invokestatic aegisguard_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   852: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   857: aload_1
    //   858: new org/bukkit/Location
    //   861: dup
    //   862: aload #15
    //   864: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   869: aload #16
    //   871: iconst_0
    //   872: anewarray java/lang/Object
    //   875: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   878: iconst_0
    //   879: anewarray java/lang/Object
    //   882: invokevirtual aegisguard_B : ([Ljava/lang/Object;)D
    //   885: aload #16
    //   887: iconst_0
    //   888: anewarray java/lang/Object
    //   891: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   894: iconst_0
    //   895: anewarray java/lang/Object
    //   898: invokevirtual aegisguard_d : ([Ljava/lang/Object;)D
    //   901: aload #16
    //   903: iconst_0
    //   904: anewarray java/lang/Object
    //   907: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   910: iconst_0
    //   911: anewarray java/lang/Object
    //   914: invokevirtual aegisguard_p : ([Ljava/lang/Object;)D
    //   917: aload #16
    //   919: iconst_0
    //   920: anewarray java/lang/Object
    //   923: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_R;
    //   926: iconst_0
    //   927: anewarray java/lang/Object
    //   930: invokevirtual aegisguard_P : ([Ljava/lang/Object;)F
    //   933: aload #16
    //   935: iconst_0
    //   936: anewarray java/lang/Object
    //   939: invokevirtual aegisguard_O : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_R;
    //   942: iconst_0
    //   943: anewarray java/lang/Object
    //   946: invokevirtual aegisguard_A : ([Ljava/lang/Object;)F
    //   949: invokespecial <init> : (Lorg/bukkit/World;DDDFF)V
    //   952: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   955: goto -> 962
    //   958: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   961: athrow
    //   962: iconst_0
    //   963: anewarray java/lang/Object
    //   966: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   969: aload #14
    //   971: ifnonnull -> 1102
    //   974: ifeq -> 1095
    //   977: goto -> 984
    //   980: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   983: athrow
    //   984: lload #4
    //   986: aload #15
    //   988: iconst_2
    //   989: anewarray java/lang/Object
    //   992: dup_x1
    //   993: swap
    //   994: iconst_1
    //   995: swap
    //   996: aastore
    //   997: dup_x2
    //   998: dup_x2
    //   999: pop
    //   1000: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1003: iconst_0
    //   1004: swap
    //   1005: aastore
    //   1006: invokestatic aegisguard_m : ([Ljava/lang/Object;)Z
    //   1009: aload #14
    //   1011: ifnonnull -> 1102
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1020: athrow
    //   1021: ifeq -> 1095
    //   1024: goto -> 1031
    //   1027: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1030: athrow
    //   1031: aload #18
    //   1033: iconst_0
    //   1034: anewarray java/lang/Object
    //   1037: invokevirtual aegisguard_p : ([Ljava/lang/Object;)Z
    //   1040: aload #14
    //   1042: ifnonnull -> 1102
    //   1045: goto -> 1052
    //   1048: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1051: athrow
    //   1052: ifeq -> 1095
    //   1055: goto -> 1062
    //   1058: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1061: athrow
    //   1062: aload #18
    //   1064: iconst_0
    //   1065: iconst_1
    //   1066: anewarray java/lang/Object
    //   1069: dup_x1
    //   1070: swap
    //   1071: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1074: iconst_0
    //   1075: swap
    //   1076: aastore
    //   1077: invokevirtual aegisguard_r : ([Ljava/lang/Object;)V
    //   1080: aload #15
    //   1082: iconst_1
    //   1083: invokeinterface setGliding : (Z)V
    //   1088: goto -> 1095
    //   1091: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1094: athrow
    //   1095: iconst_0
    //   1096: anewarray java/lang/Object
    //   1099: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   1102: aload #14
    //   1104: ifnonnull -> 1149
    //   1107: ifeq -> 2036
    //   1110: goto -> 1117
    //   1113: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1116: athrow
    //   1117: aload #15
    //   1119: lload #8
    //   1121: iconst_2
    //   1122: anewarray java/lang/Object
    //   1125: dup_x2
    //   1126: dup_x2
    //   1127: pop
    //   1128: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1131: iconst_1
    //   1132: swap
    //   1133: aastore
    //   1134: dup_x1
    //   1135: swap
    //   1136: iconst_0
    //   1137: swap
    //   1138: aastore
    //   1139: invokestatic aegisguard_p : ([Ljava/lang/Object;)Z
    //   1142: goto -> 1149
    //   1145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1148: athrow
    //   1149: aload #14
    //   1151: ifnonnull -> 1252
    //   1154: ifeq -> 1242
    //   1157: goto -> 1164
    //   1160: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1163: athrow
    //   1164: aload #16
    //   1166: iconst_0
    //   1167: anewarray java/lang/Object
    //   1170: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   1173: iconst_0
    //   1174: anewarray java/lang/Object
    //   1177: invokevirtual aegisguard_N : ([Ljava/lang/Object;)Z
    //   1180: aload #14
    //   1182: ifnonnull -> 1252
    //   1185: goto -> 1192
    //   1188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1191: athrow
    //   1192: ifeq -> 1242
    //   1195: goto -> 1202
    //   1198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1201: athrow
    //   1202: aload #16
    //   1204: iconst_0
    //   1205: anewarray java/lang/Object
    //   1208: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   1211: iconst_0
    //   1212: iconst_1
    //   1213: anewarray java/lang/Object
    //   1216: dup_x1
    //   1217: swap
    //   1218: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1221: iconst_0
    //   1222: swap
    //   1223: aastore
    //   1224: invokevirtual aegisguard_wX : ([Ljava/lang/Object;)V
    //   1227: aload #15
    //   1229: iconst_1
    //   1230: invokeinterface setSwimming : (Z)V
    //   1235: goto -> 1242
    //   1238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1241: athrow
    //   1242: aload_1
    //   1243: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1246: invokevirtual getX : ()D
    //   1249: invokestatic floor : (D)I
    //   1252: istore #19
    //   1254: aload_1
    //   1255: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1258: invokevirtual getY : ()D
    //   1261: invokestatic floor : (D)I
    //   1264: istore #20
    //   1266: aload_1
    //   1267: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1270: invokevirtual getZ : ()D
    //   1273: invokestatic floor : (D)I
    //   1276: istore #21
    //   1278: aload_1
    //   1279: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1282: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   1285: lload #10
    //   1287: iload #19
    //   1289: iload #20
    //   1291: iload #21
    //   1293: iconst_1
    //   1294: bipush #6
    //   1296: anewarray java/lang/Object
    //   1299: dup_x1
    //   1300: swap
    //   1301: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1304: iconst_5
    //   1305: swap
    //   1306: aastore
    //   1307: dup_x1
    //   1308: swap
    //   1309: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1312: iconst_4
    //   1313: swap
    //   1314: aastore
    //   1315: dup_x1
    //   1316: swap
    //   1317: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1320: iconst_3
    //   1321: swap
    //   1322: aastore
    //   1323: dup_x1
    //   1324: swap
    //   1325: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1328: iconst_2
    //   1329: swap
    //   1330: aastore
    //   1331: dup_x2
    //   1332: dup_x2
    //   1333: pop
    //   1334: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1337: iconst_1
    //   1338: swap
    //   1339: aastore
    //   1340: dup_x1
    //   1341: swap
    //   1342: iconst_0
    //   1343: swap
    //   1344: aastore
    //   1345: invokestatic aegisguard_m : ([Ljava/lang/Object;)Ljava/util/List;
    //   1348: astore #22
    //   1350: aload #16
    //   1352: iconst_0
    //   1353: anewarray java/lang/Object
    //   1356: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1359: aload #22
    //   1361: iconst_1
    //   1362: anewarray java/lang/Object
    //   1365: dup_x1
    //   1366: swap
    //   1367: iconst_0
    //   1368: swap
    //   1369: aastore
    //   1370: invokevirtual aegisguard_vG : ([Ljava/lang/Object;)V
    //   1373: aload_1
    //   1374: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1377: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   1380: lload #12
    //   1382: dup2_x1
    //   1383: pop2
    //   1384: iload #19
    //   1386: iload #20
    //   1388: iload #21
    //   1390: iconst_5
    //   1391: anewarray java/lang/Object
    //   1394: dup_x1
    //   1395: swap
    //   1396: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1399: iconst_4
    //   1400: swap
    //   1401: aastore
    //   1402: dup_x1
    //   1403: swap
    //   1404: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1407: iconst_3
    //   1408: swap
    //   1409: aastore
    //   1410: dup_x1
    //   1411: swap
    //   1412: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1415: iconst_2
    //   1416: swap
    //   1417: aastore
    //   1418: dup_x1
    //   1419: swap
    //   1420: iconst_1
    //   1421: swap
    //   1422: aastore
    //   1423: dup_x2
    //   1424: dup_x2
    //   1425: pop
    //   1426: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1429: iconst_0
    //   1430: swap
    //   1431: aastore
    //   1432: invokestatic aegisguard_T : ([Ljava/lang/Object;)Ljava/util/List;
    //   1435: astore #23
    //   1437: aload #16
    //   1439: iconst_0
    //   1440: anewarray java/lang/Object
    //   1443: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1446: aload #23
    //   1448: iconst_1
    //   1449: anewarray java/lang/Object
    //   1452: dup_x1
    //   1453: swap
    //   1454: iconst_0
    //   1455: swap
    //   1456: aastore
    //   1457: invokevirtual aegisguard_vY : ([Ljava/lang/Object;)V
    //   1460: aload_1
    //   1461: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1464: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1467: astore #24
    //   1469: aload_1
    //   1470: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1473: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1476: dconst_0
    //   1477: dconst_1
    //   1478: dconst_0
    //   1479: invokevirtual subtract : (DDD)Lorg/bukkit/Location;
    //   1482: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1485: astore #25
    //   1487: aload_1
    //   1488: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1491: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1494: dconst_0
    //   1495: ldc2_w 2.0
    //   1498: dconst_0
    //   1499: invokevirtual subtract : (DDD)Lorg/bukkit/Location;
    //   1502: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1505: astore #26
    //   1507: aload_1
    //   1508: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1511: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1514: dconst_0
    //   1515: ldc2_w 3.0
    //   1518: dconst_0
    //   1519: invokevirtual subtract : (DDD)Lorg/bukkit/Location;
    //   1522: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1525: astore #27
    //   1527: aload_1
    //   1528: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1531: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1534: dconst_0
    //   1535: dconst_1
    //   1536: dconst_0
    //   1537: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   1540: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1543: astore #28
    //   1545: aload_1
    //   1546: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1549: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1552: dconst_0
    //   1553: ldc2_w 2.0
    //   1556: dconst_0
    //   1557: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   1560: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1563: astore #29
    //   1565: aload #25
    //   1567: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   1572: instanceof org/bukkit/block/data/Waterlogged
    //   1575: aload #14
    //   1577: ifnonnull -> 1657
    //   1580: ifeq -> 1647
    //   1583: goto -> 1590
    //   1586: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1589: athrow
    //   1590: aload #25
    //   1592: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   1597: checkcast org/bukkit/block/data/Waterlogged
    //   1600: astore #30
    //   1602: aload #30
    //   1604: invokeinterface isWaterlogged : ()Z
    //   1609: aload #14
    //   1611: ifnonnull -> 1657
    //   1614: ifeq -> 1647
    //   1617: goto -> 1624
    //   1620: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1623: athrow
    //   1624: aload #16
    //   1626: iconst_0
    //   1627: anewarray java/lang/Object
    //   1630: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1633: iconst_0
    //   1634: anewarray java/lang/Object
    //   1637: invokevirtual aegisguard_tB : ([Ljava/lang/Object;)V
    //   1640: goto -> 1647
    //   1643: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1646: athrow
    //   1647: aload #24
    //   1649: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   1654: instanceof org/bukkit/block/data/Waterlogged
    //   1657: aload #14
    //   1659: ifnonnull -> 1739
    //   1662: ifeq -> 1729
    //   1665: goto -> 1672
    //   1668: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1671: athrow
    //   1672: aload #24
    //   1674: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   1679: checkcast org/bukkit/block/data/Waterlogged
    //   1682: astore #30
    //   1684: aload #30
    //   1686: invokeinterface isWaterlogged : ()Z
    //   1691: aload #14
    //   1693: ifnonnull -> 1739
    //   1696: ifeq -> 1729
    //   1699: goto -> 1706
    //   1702: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1705: athrow
    //   1706: aload #16
    //   1708: iconst_0
    //   1709: anewarray java/lang/Object
    //   1712: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1715: iconst_0
    //   1716: anewarray java/lang/Object
    //   1719: invokevirtual aegisguard_tB : ([Ljava/lang/Object;)V
    //   1722: goto -> 1729
    //   1725: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1728: athrow
    //   1729: aload #28
    //   1731: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   1736: instanceof org/bukkit/block/data/Waterlogged
    //   1739: aload #14
    //   1741: ifnonnull -> 1833
    //   1744: ifeq -> 1811
    //   1747: goto -> 1754
    //   1750: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1753: athrow
    //   1754: aload #28
    //   1756: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   1761: checkcast org/bukkit/block/data/Waterlogged
    //   1764: astore #30
    //   1766: aload #30
    //   1768: invokeinterface isWaterlogged : ()Z
    //   1773: aload #14
    //   1775: ifnonnull -> 1833
    //   1778: ifeq -> 1811
    //   1781: goto -> 1788
    //   1784: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1787: athrow
    //   1788: aload #16
    //   1790: iconst_0
    //   1791: anewarray java/lang/Object
    //   1794: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1797: iconst_0
    //   1798: anewarray java/lang/Object
    //   1801: invokevirtual aegisguard_tB : ([Ljava/lang/Object;)V
    //   1804: goto -> 1811
    //   1807: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1810: athrow
    //   1811: aload #29
    //   1813: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   1818: aload #14
    //   1820: ifnonnull -> 1850
    //   1823: instanceof org/bukkit/block/data/Waterlogged
    //   1826: goto -> 1833
    //   1829: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1832: athrow
    //   1833: ifeq -> 1900
    //   1836: aload #29
    //   1838: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   1843: goto -> 1850
    //   1846: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1849: athrow
    //   1850: checkcast org/bukkit/block/data/Waterlogged
    //   1853: astore #30
    //   1855: aload #14
    //   1857: ifnonnull -> 1984
    //   1860: aload #30
    //   1862: invokeinterface isWaterlogged : ()Z
    //   1867: ifeq -> 1900
    //   1870: goto -> 1877
    //   1873: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1876: athrow
    //   1877: aload #16
    //   1879: iconst_0
    //   1880: anewarray java/lang/Object
    //   1883: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1886: iconst_0
    //   1887: anewarray java/lang/Object
    //   1890: invokevirtual aegisguard_tB : ([Ljava/lang/Object;)V
    //   1893: goto -> 1900
    //   1896: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1899: athrow
    //   1900: aload #16
    //   1902: iconst_0
    //   1903: anewarray java/lang/Object
    //   1906: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1909: aload #25
    //   1911: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1916: iconst_1
    //   1917: anewarray java/lang/Object
    //   1920: dup_x1
    //   1921: swap
    //   1922: iconst_0
    //   1923: swap
    //   1924: aastore
    //   1925: invokevirtual aegisguard_s : ([Ljava/lang/Object;)V
    //   1928: aload #16
    //   1930: iconst_0
    //   1931: anewarray java/lang/Object
    //   1934: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1937: aload #26
    //   1939: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1944: iconst_1
    //   1945: anewarray java/lang/Object
    //   1948: dup_x1
    //   1949: swap
    //   1950: iconst_0
    //   1951: swap
    //   1952: aastore
    //   1953: invokevirtual aegisguard_ho : ([Ljava/lang/Object;)V
    //   1956: aload #16
    //   1958: iconst_0
    //   1959: anewarray java/lang/Object
    //   1962: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1965: aload #27
    //   1967: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1972: iconst_1
    //   1973: anewarray java/lang/Object
    //   1976: dup_x1
    //   1977: swap
    //   1978: iconst_0
    //   1979: swap
    //   1980: aastore
    //   1981: invokevirtual aegisguard_h4 : ([Ljava/lang/Object;)V
    //   1984: aload #15
    //   1986: aload #14
    //   1988: ifnonnull -> 2038
    //   1991: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   1996: ifnull -> 2036
    //   1999: goto -> 2006
    //   2002: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2005: athrow
    //   2006: aload #16
    //   2008: iconst_0
    //   2009: anewarray java/lang/Object
    //   2012: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   2015: aload #22
    //   2017: iconst_1
    //   2018: anewarray java/lang/Object
    //   2021: dup_x1
    //   2022: swap
    //   2023: iconst_0
    //   2024: swap
    //   2025: aastore
    //   2026: invokevirtual aegisguard_vR : ([Ljava/lang/Object;)V
    //   2029: goto -> 2036
    //   2032: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2035: athrow
    //   2036: aload #15
    //   2038: ldc2_w 1.5
    //   2041: ldc2_w 1.5
    //   2044: ldc2_w 1.5
    //   2047: invokeinterface getNearbyEntities : (DDD)Ljava/util/List;
    //   2052: astore #19
    //   2054: aload #17
    //   2056: aload #19
    //   2058: iconst_1
    //   2059: anewarray java/lang/Object
    //   2062: dup_x1
    //   2063: swap
    //   2064: iconst_0
    //   2065: swap
    //   2066: aastore
    //   2067: invokevirtual aegisguard_vw : ([Ljava/lang/Object;)V
    //   2070: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #449	-> 50
    //   #450	-> 81
    //   #451	-> 118
    //   #452	-> 154
    //   #455	-> 159
    //   #456	-> 165
    //   #458	-> 187
    //   #460	-> 197
    //   #461	-> 204
    //   #464	-> 236
    //   #465	-> 247
    //   #467	-> 258
    //   #468	-> 276
    //   #469	-> 294
    //   #470	-> 312
    //   #471	-> 330
    //   #472	-> 348
    //   #474	-> 366
    //   #475	-> 402
    //   #476	-> 440
    //   #477	-> 458
    //   #480	-> 489
    //   #481	-> 515
    //   #482	-> 533
    //   #485	-> 564
    //   #486	-> 619
    //   #489	-> 644
    //   #490	-> 687
    //   #492	-> 712
    //   #494	-> 724
    //   #496	-> 800
    //   #497	-> 824
    //   #498	-> 857
    //   #499	-> 903
    //   #498	-> 952
    //   #502	-> 962
    //   #503	-> 984
    //   #504	-> 1062
    //   #505	-> 1080
    //   #509	-> 1095
    //   #510	-> 1117
    //   #511	-> 1202
    //   #512	-> 1227
    //   #515	-> 1242
    //   #516	-> 1254
    //   #517	-> 1266
    //   #519	-> 1278
    //   #521	-> 1350
    //   #523	-> 1373
    //   #525	-> 1437
    //   #527	-> 1460
    //   #528	-> 1469
    //   #529	-> 1487
    //   #530	-> 1507
    //   #531	-> 1527
    //   #532	-> 1545
    //   #534	-> 1565
    //   #535	-> 1590
    //   #537	-> 1602
    //   #538	-> 1624
    //   #541	-> 1647
    //   #542	-> 1672
    //   #544	-> 1684
    //   #545	-> 1706
    //   #548	-> 1729
    //   #549	-> 1754
    //   #551	-> 1766
    //   #552	-> 1788
    //   #555	-> 1811
    //   #556	-> 1836
    //   #558	-> 1855
    //   #559	-> 1877
    //   #563	-> 1900
    //   #564	-> 1928
    //   #565	-> 1956
    //   #567	-> 1984
    //   #568	-> 2006
    //   #572	-> 2036
    //   #574	-> 2054
    //   #575	-> 2070
    // Exception table:
    //   from	to	target	type
    //   50	73	76	java/lang/RuntimeException
    //   56	86	89	java/lang/RuntimeException
    //   80	110	113	java/lang/RuntimeException
    //   93	123	126	java/lang/RuntimeException
    //   117	147	150	java/lang/RuntimeException
    //   130	155	155	java/lang/RuntimeException
    //   187	193	193	java/lang/RuntimeException
    //   197	229	232	java/lang/RuntimeException
    //   402	423	426	java/lang/RuntimeException
    //   418	433	436	java/lang/RuntimeException
    //   430	482	485	java/lang/RuntimeException
    //   500	508	511	java/lang/RuntimeException
    //   505	557	560	java/lang/RuntimeException
    //   571	579	582	java/lang/RuntimeException
    //   576	602	605	java/lang/RuntimeException
    //   586	612	615	java/lang/RuntimeException
    //   609	637	640	java/lang/RuntimeException
    //   651	659	662	java/lang/RuntimeException
    //   656	677	680	java/lang/RuntimeException
    //   684	705	708	java/lang/RuntimeException
    //   731	739	742	java/lang/RuntimeException
    //   736	758	761	java/lang/RuntimeException
    //   746	768	771	java/lang/RuntimeException
    //   765	793	796	java/lang/RuntimeException
    //   809	817	820	java/lang/RuntimeException
    //   814	955	958	java/lang/RuntimeException
    //   969	977	980	java/lang/RuntimeException
    //   974	1014	1017	java/lang/RuntimeException
    //   984	1024	1027	java/lang/RuntimeException
    //   1021	1045	1048	java/lang/RuntimeException
    //   1031	1055	1058	java/lang/RuntimeException
    //   1052	1088	1091	java/lang/RuntimeException
    //   1102	1110	1113	java/lang/RuntimeException
    //   1107	1142	1145	java/lang/RuntimeException
    //   1149	1157	1160	java/lang/RuntimeException
    //   1154	1185	1188	java/lang/RuntimeException
    //   1164	1195	1198	java/lang/RuntimeException
    //   1192	1235	1238	java/lang/RuntimeException
    //   1565	1583	1586	java/lang/RuntimeException
    //   1602	1617	1620	java/lang/RuntimeException
    //   1614	1640	1643	java/lang/RuntimeException
    //   1657	1665	1668	java/lang/RuntimeException
    //   1684	1699	1702	java/lang/RuntimeException
    //   1696	1722	1725	java/lang/RuntimeException
    //   1739	1747	1750	java/lang/RuntimeException
    //   1766	1781	1784	java/lang/RuntimeException
    //   1778	1804	1807	java/lang/RuntimeException
    //   1811	1826	1829	java/lang/RuntimeException
    //   1833	1843	1846	java/lang/RuntimeException
    //   1855	1870	1873	java/lang/RuntimeException
    //   1860	1893	1896	java/lang/RuntimeException
    //   1984	1999	2002	java/lang/RuntimeException
    //   1991	2029	2032	java/lang/RuntimeException
  }
  
  @EventHandler
  public void aegisguard_h(PlayerKickEvent paramPlayerKickEvent) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_X_.a : J
    //   3: ldc2_w 116666811433403
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic aegisguard_a : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: aload_1
    //   12: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   15: astore #5
    //   17: astore #4
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   22: invokevirtual aegisguard_Y : ()Lme/frep/aegisguard/spigot/aegisguard_Xc;
    //   25: aload #5
    //   27: iconst_1
    //   28: anewarray java/lang/Object
    //   31: dup_x1
    //   32: swap
    //   33: iconst_0
    //   34: swap
    //   35: aastore
    //   36: invokevirtual aegisguard_U : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   39: astore #6
    //   41: aload #6
    //   43: aload #4
    //   45: ifnonnull -> 61
    //   48: ifnonnull -> 59
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   57: athrow
    //   58: return
    //   59: aload #6
    //   61: iconst_0
    //   62: anewarray java/lang/Object
    //   65: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   68: iconst_0
    //   69: anewarray java/lang/Object
    //   72: invokevirtual aegisguard_C_ : ([Ljava/lang/Object;)Z
    //   75: aload #4
    //   77: ifnonnull -> 124
    //   80: ifeq -> 132
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: aload_1
    //   91: aload #4
    //   93: ifnonnull -> 128
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: invokevirtual getReason : ()Ljava/lang/String;
    //   106: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   109: getstatic me/frep/aegisguard/spigot/aegisguard_X_.b : [Ljava/lang/String;
    //   112: iconst_2
    //   113: aaload
    //   114: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: ifeq -> 132
    //   127: aload_1
    //   128: iconst_1
    //   129: invokevirtual setCancelled : (Z)V
    //   132: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #579	-> 11
    //   #580	-> 19
    //   #582	-> 41
    //   #584	-> 59
    //   #585	-> 127
    //   #587	-> 132
    // Exception table:
    //   from	to	target	type
    //   41	51	54	java/lang/RuntimeException
    //   61	83	86	java/lang/RuntimeException
    //   80	96	99	java/lang/RuntimeException
    //   90	117	120	java/lang/RuntimeException
  }
  
  public static void aegisguard_Z(AbstractCheck[] paramArrayOfAbstractCheck) {
    aegisguard_N = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] aegisguard_a() {
    return aegisguard_N;
  }
  
  static {
    long l = a ^ 0x5D00C03EB871L;
    aegisguard_Z(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[8];
    boolean bool = false;
    String str;
    int i = (str = "+IÂwm\022\002Ê\bù\037QvdÒX\020¬PgfuÂÉ\004Lðµù±ì\bK%ÌD&\\(¸õvÒ©¢E.ëÆDMÉ\\¶ÙîK\000$#±D\033ðz[\026­jIÊÎ]òÇ\b®Dúë\026Ù¢").length();
    byte b2 = 8;
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
