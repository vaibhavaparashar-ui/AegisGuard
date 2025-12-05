package me.frep.aegisguard.spigot.AegisGuard_h3;

import java.lang.invoke.MethodHandles;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_Xa;
import me.frep.aegisguard.spigot.aegisguard_Xz;
import me.frep.aegisguard.spigot.aegisguard_b0;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import org.bukkit.util.NumberConversions;

public enum aegisguard_h3 {
  public static final me.frep.aegisguard.spigot.aegisguard_h3 TPS;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CHUNK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 JOINED;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CAKE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 BAMBOO;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PACKET_EXPLOSION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 ENTITY_CRAM_FIX;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 AROUND_SLIME;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SIGN;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PRESSURE_PLATE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SWIMMING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SWIMMING_JESUS;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 COLLIDING_HORIZONTALLY;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DRIPSTONE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 HIGH_FLY_SPEED;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 GLITCHED_BLOCKS_ABOVE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PROJECTILE_DAMAGE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CHEST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 ATTACK_DAMAGE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SKULL;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 EXPLOSION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 STAIRS;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 HIGH_LEVITATION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FENCE_GATE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 POWDER_SNOW;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DRAGON_DAMAGE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 JUMP_BOOST_RAN_OUT;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 LAGGED_NEAR_GROUND;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SNOW;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 NETHERITE_ARMOR;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FAST_ZERO;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 JOINED_CHUNK_LOAD;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 NEAR_SOLID;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CAMPFIRE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CANCELLED_MOVE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CARPET;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FLOWER_POT;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 EMPTIED_BUCKET;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 END_ROD;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 HOPPER;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CHAIN;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DOOR;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PICKED_UP_ITEM;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 ANVIL;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 LAGGED_NEAR_GROUND_MODERN;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FULLY_SUBMERGED;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 RESPAWN;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 ICE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 BED;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SLAB;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 HIGH_JUMP_BOOST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 LILY_PAD;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 HIGH_SPEED;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 WALL;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SWEET_BERRIES;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CONDUIT;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PLACED_WEB;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PISTON;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CHORUS_FRUIT;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 ENDER_PEARL;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 NEAR_GROUND;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SLEEPING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SOUL_SPEED;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 TRAPDOOR;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FISHING_ROD;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PLUGIN_LOAD;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 RIPTIDE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FIREWORK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SPECTATOR;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CAULDRON;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 ENTITY_COLLISION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DEATH;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DEPTH_STRIDER;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 LEVITATION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FROZEN;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DIGGING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 BLOCK_BREAK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PLACING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SERVER_POSITION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SERVER_POSITION_FAST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SERVER_POSITION_FAST_FAST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CANCELLED_PLACE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 BLOCK_PLACE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 BLOCK_PLACE_FAST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SWIMMING_ON_OLD_VERSION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FULLY_STUCK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PLACED_CLIMBABLE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PARTIALLY_STUCK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 NOT_MOVING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 PLACED_SLIME;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FIREBALL;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 WORLD_CHANGE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FALL_DAMAGE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 ILLEGAL_BLOCK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 HONEY;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SCAFFOLDING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 HALF_BLOCK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SHULKER;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 GLIDING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 GLIDING_TEST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 ELYTRA;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 VELOCITY;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DEAD;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 WEB;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SOUL_SAND;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CINEMATIC;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FAST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 LENIENT_SCAFFOLDING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 WINDOW_CLICK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DROPPED_ITEM;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CANCELLED_BREAK;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 MYTHIC_MOB;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CREATIVE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 AUTOCLICKER_NON_DIG;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 AUTOCLICKER;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 COLLIDING_VERTICALLY;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SLOW_FALLING;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 BUBBLE_COLUMN;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FENCE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 JUMP_BOOST;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FLIGHT;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 COMBO_MODE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 DOLPHINS_GRACE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 TELEPORT;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SERVER_VERSION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 KELP;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CLIENT_VERSION;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SLIME;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 BOAT;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 BUKKIT_VELOCITY;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SEA_PICKLE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SEAGRASS;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 TURTLE_EGG;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 SHULKER_BOX;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 WATERLOGGED;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 CLIMBABLE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 LIQUID;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 GLASS_PANE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 FARMLAND;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 VEHICLE;
  
  public static final me.frep.aegisguard.spigot.aegisguard_h3 VOID;
  
  private final Function aegisguard_n;
  
  private static final me.frep.aegisguard.spigot.aegisguard_h3[] aegisguard_H;
  
  private static int aegisguard_l;
  
  private static me.frep.aegisguard.spigot.aegisguard_h3[] aegisguard_C() {
    return new me.frep.aegisguard.spigot.aegisguard_h3[] { 
        TPS, CHUNK, JOINED, CAKE, BAMBOO, PACKET_EXPLOSION, ENTITY_CRAM_FIX, AROUND_SLIME, SIGN, PRESSURE_PLATE, 
        SWIMMING, SWIMMING_JESUS, COLLIDING_HORIZONTALLY, DRIPSTONE, HIGH_FLY_SPEED, GLITCHED_BLOCKS_ABOVE, PROJECTILE_DAMAGE, CHEST, ATTACK_DAMAGE, SKULL, 
        EXPLOSION, STAIRS, HIGH_LEVITATION, FENCE_GATE, POWDER_SNOW, DRAGON_DAMAGE, JUMP_BOOST_RAN_OUT, LAGGED_NEAR_GROUND, SNOW, NETHERITE_ARMOR, 
        FAST_ZERO, JOINED_CHUNK_LOAD, NEAR_SOLID, CAMPFIRE, CANCELLED_MOVE, CARPET, FLOWER_POT, EMPTIED_BUCKET, END_ROD, HOPPER, 
        CHAIN, DOOR, PICKED_UP_ITEM, ANVIL, LAGGED_NEAR_GROUND_MODERN, FULLY_SUBMERGED, RESPAWN, ICE, BED, SLAB, 
        HIGH_JUMP_BOOST, LILY_PAD, HIGH_SPEED, WALL, SWEET_BERRIES, CONDUIT, PLACED_WEB, PISTON, CHORUS_FRUIT, ENDER_PEARL, 
        NEAR_GROUND, SLEEPING, SOUL_SPEED, TRAPDOOR, FISHING_ROD, PLUGIN_LOAD, RIPTIDE, FIREWORK, SPECTATOR, CAULDRON, 
        ENTITY_COLLISION, DEATH, DEPTH_STRIDER, LEVITATION, FROZEN, DIGGING, BLOCK_BREAK, PLACING, SERVER_POSITION, SERVER_POSITION_FAST, 
        SERVER_POSITION_FAST_FAST, CANCELLED_PLACE, BLOCK_PLACE, BLOCK_PLACE_FAST, SWIMMING_ON_OLD_VERSION, FULLY_STUCK, PLACED_CLIMBABLE, PARTIALLY_STUCK, NOT_MOVING, PLACED_SLIME, 
        FIREBALL, WORLD_CHANGE, FALL_DAMAGE, ILLEGAL_BLOCK, HONEY, SCAFFOLDING, HALF_BLOCK, SHULKER, GLIDING, GLIDING_TEST, 
        ELYTRA, VELOCITY, DEAD, WEB, SOUL_SAND, CINEMATIC, FAST, LENIENT_SCAFFOLDING, WINDOW_CLICK, DROPPED_ITEM, 
        CANCELLED_BREAK, MYTHIC_MOB, CREATIVE, AUTOCLICKER_NON_DIG, AUTOCLICKER, COLLIDING_VERTICALLY, SLOW_FALLING, BUBBLE_COLUMN, FENCE, JUMP_BOOST, 
        FLIGHT, COMBO_MODE, DOLPHINS_GRACE, TELEPORT, SERVER_VERSION, KELP, CLIENT_VERSION, SLIME, BOAT, BUKKIT_VELOCITY, 
        SEA_PICKLE, SEAGRASS, TURTLE_EGG, SHULKER_BOX, WATERLOGGED, CLIMBABLE, LIQUID, GLASS_PANE, FARMLAND, VEHICLE, 
        VOID };
  }
  
  private static final long a = aegisguard_e.a(-7366084094997234239L, 3359078393408388620L, MethodHandles.lookup().lookupClass()).a(92761607968702L);
  
  private static Boolean lambda$static$0(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x712A8557ED2BL;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        if (aegisguard_Xz.aegisguard_S(new Object[0]) < 19.25D) {
        
        } else {
          return Boolean.valueOf(false);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x3F8039A2F7ABL;
    aegisguard_z(0);
    byte b1;
    for ((new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[141];
    boolean bool = false;
    String str;
    int i = (str = "¶wE\tîJ¶&3\022Ä{u!\bÕ\034ÌÁì¨ñ0\b\020\025¢£\002Õ\b«ñ »·m\020ÚN[U\004\023,Ò$¾PÄsÝæÂ\bTË\004kæ\000R\020c=F¶\t¼C¤ÕY?[¤bI\032\bÛ¦\034Ñ|\bd\"z{ðgV\020\013N¦¦q}õ4ýDó¤xW\020z\017¼ëÍ2\020KDXÊ `d\002\b\016c½\\@N®\bmòQ)ÝÌ!\020]ò4f8¹\032\035uKZç\020rÆX`\001¨¸\013Hû%]ÿ\035\020\rMO¸Dé7`Aª§7ç:\b¹ú=YÞ-O\020µ·R>+ÉCuÌ\020üª¢o!\035\020ÛåJ;¹òòpwBá[\\jÙY\020R\\\bÄ2º'ù1í\\Èô;I\n\030Bkm-0Õ\\jP3g£Z°\002yEfø\\]\020o'ãQãÁqÜ×\033¶âkImÕ\030\013N¦¦q}õ\017Ä²Õ®N^¶°\021;¤êA¤\020¹W\013Ï79F·$oÒú7íß5\020Â\033æ¬Çp§¼9ò3|ÍÃ\ba±YÔ}rT\020J|,UÇ\\¶jÍ·\"!«x\020t)\031Mc0l\001eÙu\021LØ\020o¸\fHPiËz&\nhÀ\020è$æ´WðÀóù[Æ\006j½Ð\030å»\023uõ%ùËÐ³\rË[mñÊ¡æøG@¿\020â\f\035H\016ð@DúçÜ\nñ=7m\büµÅ¾ùl¤\0204sþý\037Rvk6R·&pÎ¡ G;¢þ-ñ^´¢\023rua¹ØX\037z\001Ò\017§\037ëÈ6c\030@2=[EäëêX¥{]ÆªÌ»\\cëúr\033\b¸:Cßí\026\020\020\031Ä2(¨[\nÄá§^E¦\bÞ\002ôâF+\020Ô\0025ùnE#ßhåÒ\037O\020Ú·i+ZHµL>,\022\"\bz\nOÞØÐk\bÔ\037±Þ\027·(\by7\021îYÜr\030\024¥_ð¦ÂFGå\031ÿü&'P\njùl®0À\0303[HgØd^Fn.ò\0130¶\017\002\017\r¾M\b`\"\025ÕXÑ÷{\020ÊaPÊ1©¹rØ£<\001\003\bt`=°ì\013{\020Ìº]\017ß#\034/§KWâ;\020Èæ·g^÷Ó2ïáo-ï<þr\020ÃC]Ù\025Æú2±Ð\017;d\bÒúî5á\r\035É\bZÒ*\021Så\020\013Á]£Ëégf8íÔgÔ f\020¯ ï\031\\¸\006pP/\nNÃq\020\005Ô`{â*¾4$si[\bÊÛLôêbz\b|5sæ\027\\\020Bkm-0Õ\\k!C¼O6ã\020qá´õ\\{\024\032QPNötÐ\bû9Pû\036h@Ì\b8%¡~\0046úw\020X¦g1Ãr&JÚøXïèÆ\020ÁõÉ¼Õ\036¸´y¢ãæ\030§´©Îò¶â×Bö`óbJ\026u\006uï\bÔH×BÊÍÂb\020å»\023uõ%ùËñUîÌÿ\020µ\000\020ù»¥\0212½Jkw§\021ßttÍ\n\020\027mbyso>ÁE\003\037]N&9A\020k5{ÈÝ rx£\031pA6k\020G;¢þ-â¿ç3\031=\020HÝ¤9ªCôßVíXÈ\022å\020û½C\t{æ>8\023|¾ß¬\020X¦g1Ãr&JËv&ñ!\031á\020\004ÂÁV²ë\007íW´\003_ê\000î\030¢\ráÍïkßÅS\b\nh`7^ \035«¹Jß\020XÕxs²:YTIàU(\020;¹GÏñc¨BKµÏí´`\b>Ð_?dá&Û w\027@\022l½¸|ËaûÃûÿI¡frgs\037\020®ßFn¶3u±\020 O1iÕöq¶_\017ÍÀ¥ÚÇ\0209Ðë\022j\005;Áììçó!¾\006\026\b?©£u't\020?Qm\017¨÷¼·\027ý\r_ËÌ\020 ]®Lªã½8)~\023{Ú\020ù\n\fç7?4äJ%WNSB\0208;çM<Kñ¦M¸\034þ,ßKB\020\022\000îZ50RQÐnªSúìh\bªCÔ\021(_L®\030\023ñXSùèoei\b9\005,g\007ô*0\000\005\bÙ\007?­ì\b\021\030åÆ\005\t²ò©\022dæbA °\004þmÀ\020¤tµ6ö,ìòä\037(º\bÚ»\026®\006Ð\0203\005ssÉ Nü×\003èFÕ\020xe½ñþUk©\020#49\\\030j\rD<'\007.\031ÇÇg#ÛÊ]é»#îms\b¨jä.ép\byÞ,AËñ\020åÆ\005\t²ú\020ô óõ®\t\b­Ï­\031eK\020³£\rxØ{;{ M\035ç\020âµè\021\017¤#º¶Ã`¥\b\035*\032CV]«Ä\020òDñ©÷¨²M_e\031A¦\020Ç´²¢¢c\024ã1C Õæ\020\032É³æ$\033±òPEíëÉ\020\023ñXSùèãJKðaC\020.¶6È\rE¼`L=\"[¹â\020Õx\007\bªm{,):?!\037%Æ­\b6þ\021,\003üWO\020\036é¹\032¬´bì\034\r¾MÎ\027r\030G;¢þ-ñ^´¢\023ru\016&tà\bþl)(jB\n\t\020ð­F«AI\031m5¿ßbÿC \bÊ}+\"\"\020=*À)£Üä\035\022RÖ9ù¨\020'\nè$\026\025¶ÿcº5ÅÖ\\U\b\006åÖp´\024Ý\b¤ç^3knØD\020¸ËkC\017¢5¥åuÓµ.Ä\b\n¶>oiÙ\030d¥Ýxr\035Æ\001ó½_ÞÙ\000$\"èæÅ§\020{ÿ8ÇÔ±l`S2û\036tQº\b\024¼Ú¶÷Lì\020å»\023uõ%ùË*Òfe\\Äs\020\004ËÈäSv°h^Ø\024vO©Ì\020ÄÕÐ\000Q*-SnTM3\016t\020\034,å«zÒ<e7F@RN\020X¦g1Ãr&Jz³\037¬¢¯Ç\030@2=[Eäçï\022°'ç9&\023@\033ù°©\b]}ª©#\"\020ÈÅÌü>0l\005úU\016W£\013Ñ\020ìV8º\022\000z þ8Ð\022WEY\030w\027@\022l½¸|ËaûÃûÿI'JbR8\005ÕÒ\020¬l0LjSj\001ÆxÂ\022\020ø#7Ýãè\006±ÿì¤\005\020«ë\022ù~C\017I¼>¥2WKõ").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static Boolean lambda$static$1(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0xD3A44C6BE37L;
    int i = aegisguard_A();
    try {
      if (i == 0)
        if (!paramaegisguard_hu.aegisguard_L(new Object[0]).getWorld().isChunkLoaded(NumberConversions.floor(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_r(new Object[0])) >> 4, 
            NumberConversions.floor(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_u(new Object[0])) >> 4)) {
        
        } else {
          return Boolean.valueOf(false);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$2(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x77572BCB67CCL;
    int i = aegisguard_Q();
    try {
      if (i != 0) {
        try {
          if (System.currentTimeMillis() - paramaegisguard_hu.getJoinTime() >= aegisguard_b0.aegisguard_H) {
            try {
              if (i != 0)
                try {
                  if (paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_i(new Object[0]) < aegisguard_b0.aegisguard_dF);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(System.currentTimeMillis() - paramaegisguard_hu.getJoinTime() cmp aegisguard_b0.aegisguard_H);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$3(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_c8(new Object[0]));
  }
  
  private static Boolean lambda$static$4(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_m(new Object[0]));
  }
  
  private static Boolean lambda$static$5(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x4D953252BAE5L;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Yu(new Object[0]) < 16));
  }
  
  private static Boolean lambda$static$6(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 64555419074019
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_Q : ()I
    //   11: istore_3
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mu : Z
    //   15: iload_3
    //   16: ifeq -> 51
    //   19: ifeq -> 79
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: aload_0
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   37: iconst_0
    //   38: anewarray java/lang/Object
    //   41: invokevirtual aegisguard_w : ([Ljava/lang/Object;)I
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: iload_3
    //   52: ifeq -> 76
    //   55: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_dx : I
    //   58: if_icmpge -> 79
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: iconst_1
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: goto -> 80
    //   79: iconst_0
    //   80: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   83: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #33	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	22	25	java/lang/RuntimeException
    //   19	44	47	java/lang/RuntimeException
    //   51	61	64	java/lang/RuntimeException
    //   55	69	72	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$7(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x4F65CD04EC2CL;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_o(new Object[0]) < 20));
  }
  
  private static Boolean lambda$static$8(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_c(new Object[0]));
  }
  
  private static Boolean lambda$static$9(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Cs(new Object[0]));
  }
  
  private static Boolean lambda$static$10(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 85763948332504
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_Q : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifeq -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_H : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifeq -> 79
    //   59: bipush #40
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #41	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$11(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 95714352415569
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 81
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_H : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 78
    //   59: iconst_5
    //   60: if_icmpge -> 81
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: iconst_1
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: goto -> 82
    //   81: iconst_0
    //   82: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   85: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #43	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	63	66	java/lang/RuntimeException
    //   59	71	74	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$12(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_CK(new Object[0]));
  }
  
  private static Boolean lambda$static$13(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_g(new Object[0]));
  }
  
  private static Boolean lambda$static$14(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0xDFCFB725E53L;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_vU(new Object[0]) < 100));
  }
  
  private static Boolean lambda$static$15(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 110687320289376
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual aegisguard_b : ([Ljava/lang/Object;)Ljava/util/List;
    //   27: iload_3
    //   28: ifeq -> 63
    //   31: ifnull -> 96
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: aload_0
    //   42: iconst_0
    //   43: anewarray java/lang/Object
    //   46: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual aegisguard_b : ([Ljava/lang/Object;)Ljava/util/List;
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   68: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   73: invokeinterface allMatch : (Ljava/util/function/Predicate;)Z
    //   78: iload_3
    //   79: ifeq -> 93
    //   82: ifne -> 96
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: iconst_1
    //   93: goto -> 97
    //   96: iconst_0
    //   97: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   100: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #51	-> 12
    //   #52	-> 42
    //   #51	-> 97
    // Exception table:
    //   from	to	target	type
    //   12	34	37	java/lang/RuntimeException
    //   31	56	59	java/lang/RuntimeException
    //   63	85	88	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$16(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x1E8ACA9A3FF6L;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YD(new Object[0]) < 20));
  }
  
  private static Boolean lambda$static$17(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_CV(new Object[0]));
  }
  
  private static Boolean lambda$static$18(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x426AFE0FA8E2L;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Yv(new Object[0]) < 80));
  }
  
  private static Boolean lambda$static$19(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Ct(new Object[0]));
  }
  
  private static Boolean lambda$static$20(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x783897CB2C02L;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Q(new Object[0]) < 50));
  }
  
  private static Boolean lambda$static$21(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Cb(new Object[0]));
  }
  
  private static Boolean lambda$static$22(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 45180587861367
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_H : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 79
    //   59: bipush #10
    //   61: if_icmple -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #66	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$23(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Cq(new Object[0]));
  }
  
  private static Boolean lambda$static$24(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_CR(new Object[0]));
  }
  
  private static Boolean lambda$static$25(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x4FF55FD2978DL;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_a(new Object[0]) < 60));
  }
  
  private static Boolean lambda$static$26(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 113651637614109
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual aegisguard_a : ([Ljava/lang/Object;)I
    //   27: iload_3
    //   28: ifne -> 63
    //   31: ifle -> 90
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: aload_0
    //   42: iconst_0
    //   43: anewarray java/lang/Object
    //   46: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual aegisguard_a : ([Ljava/lang/Object;)I
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: iload_3
    //   64: ifne -> 87
    //   67: bipush #30
    //   69: if_icmpge -> 90
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_1
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: goto -> 91
    //   90: iconst_0
    //   91: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   94: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #74	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	34	37	java/lang/RuntimeException
    //   31	56	59	java/lang/RuntimeException
    //   63	72	75	java/lang/RuntimeException
    //   67	80	83	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$27(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 137443736489166
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 118387216278631
    //   13: lxor
    //   14: lstore_3
    //   15: dup2
    //   16: ldc2_w 56935144747174
    //   19: lxor
    //   20: lstore #5
    //   22: pop2
    //   23: invokestatic aegisguard_Q : ()I
    //   26: istore #7
    //   28: aload_0
    //   29: iconst_0
    //   30: anewarray java/lang/Object
    //   33: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   36: lload_3
    //   37: iconst_1
    //   38: anewarray java/lang/Object
    //   41: dup_x2
    //   42: dup_x2
    //   43: pop
    //   44: invokestatic valueOf : (J)Ljava/lang/Long;
    //   47: iconst_0
    //   48: swap
    //   49: aastore
    //   50: invokevirtual aegisguard_CP : ([Ljava/lang/Object;)Z
    //   53: iload #7
    //   55: ifeq -> 138
    //   58: ifne -> 116
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: aload_0
    //   69: iconst_0
    //   70: anewarray java/lang/Object
    //   73: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   76: lload #5
    //   78: iconst_1
    //   79: anewarray java/lang/Object
    //   82: dup_x2
    //   83: dup_x2
    //   84: pop
    //   85: invokestatic valueOf : (J)Ljava/lang/Long;
    //   88: iconst_0
    //   89: swap
    //   90: aastore
    //   91: invokevirtual aegisguard_CS : ([Ljava/lang/Object;)Z
    //   94: iload #7
    //   96: ifeq -> 138
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: ifne -> 157
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: aload_0
    //   117: iconst_0
    //   118: anewarray java/lang/Object
    //   121: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   124: iconst_0
    //   125: anewarray java/lang/Object
    //   128: invokevirtual aegisguard_l : ([Ljava/lang/Object;)Z
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: iload #7
    //   140: ifeq -> 154
    //   143: ifeq -> 157
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: iconst_1
    //   154: goto -> 158
    //   157: iconst_0
    //   158: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   161: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #76	-> 28
    // Exception table:
    //   from	to	target	type
    //   28	61	64	java/lang/RuntimeException
    //   58	99	102	java/lang/RuntimeException
    //   68	109	112	java/lang/RuntimeException
    //   106	131	134	java/lang/RuntimeException
    //   138	146	149	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$28(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_A(new Object[0]));
  }
  
  private static Boolean lambda$static$29(aegisguard_hu paramaegisguard_hu) {
    long l1 = a ^ 0x5109DCA2F0A3L, l2 = l1 ^ 0x43D9F2A14B9FL;
    (new Object[2])[1] = paramaegisguard_hu.aegisguard_L(new Object[0]);
    new Object[2];
    return Boolean.valueOf(aegisguard_Xa.aegisguard_U(new Object[] { Long.valueOf(l2) }));
  }
  
  private static Boolean lambda$static$30(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 90502574456053
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual aegisguard_E : ([Ljava/lang/Object;)D
    //   27: dconst_0
    //   28: dcmpl
    //   29: iload_3
    //   30: ifne -> 65
    //   33: ifne -> 83
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual aegisguard_l : ([Ljava/lang/Object;)Z
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: iload_3
    //   66: ifne -> 80
    //   69: ifeq -> 83
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_1
    //   80: goto -> 84
    //   83: iconst_0
    //   84: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   87: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #82	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	36	39	java/lang/RuntimeException
    //   33	58	61	java/lang/RuntimeException
    //   65	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$31(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 90953899978915
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: invokestatic currentTimeMillis : ()J
    //   15: aload_0
    //   16: invokevirtual getJoinTime : ()J
    //   19: lsub
    //   20: ldc2_w 30000
    //   23: lcmp
    //   24: iload_3
    //   25: ifne -> 64
    //   28: ifge -> 122
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: aload_0
    //   39: iconst_0
    //   40: anewarray java/lang/Object
    //   43: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   46: iconst_0
    //   47: anewarray java/lang/Object
    //   50: invokevirtual aegisguard_E : ([Ljava/lang/Object;)D
    //   53: ldc2_w -0.05000000074505806
    //   56: dcmpg
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: iload_3
    //   65: ifne -> 104
    //   68: ifge -> 122
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: aload_0
    //   79: iconst_0
    //   80: anewarray java/lang/Object
    //   83: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   86: iconst_0
    //   87: anewarray java/lang/Object
    //   90: invokevirtual aegisguard_E : ([Ljava/lang/Object;)D
    //   93: ldc2_w -0.10000000149011612
    //   96: dcmpl
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: iload_3
    //   105: ifne -> 119
    //   108: ifle -> 122
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: iconst_1
    //   119: goto -> 123
    //   122: iconst_0
    //   123: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   126: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #84	-> 12
    //   #85	-> 79
    //   #84	-> 123
    // Exception table:
    //   from	to	target	type
    //   12	31	34	java/lang/RuntimeException
    //   28	57	60	java/lang/RuntimeException
    //   64	71	74	java/lang/RuntimeException
    //   68	97	100	java/lang/RuntimeException
    //   104	111	114	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$32(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_h(new Object[0]));
  }
  
  private static Boolean lambda$static$33(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_C5(new Object[0]));
  }
  
  private static Boolean lambda$static$34(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x5C5820ABCE0EL;
    int i = aegisguard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_X(new Object[0]) < 5));
  }
  
  private static Boolean lambda$static$35(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_CJ(new Object[0]));
  }
  
  private static Boolean lambda$static$36(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_j(new Object[0]));
  }
  
  private static Boolean lambda$static$37(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x2C625421A4DCL;
    int i = aegisguard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_T(new Object[0]) < 15));
  }
  
  private static Boolean lambda$static$38(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Ce(new Object[0]));
  }
  
  private static Boolean lambda$static$39(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Cf(new Object[0]));
  }
  
  private static Boolean lambda$static$40(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_c3(new Object[0]));
  }
  
  private static Boolean lambda$static$41(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Ci(new Object[0]));
  }
  
  private static Boolean lambda$static$42(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x7F43940E6C6FL;
    int i = aegisguard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Yg(new Object[0]) < 30));
  }
  
  private static Boolean lambda$static$43(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Cd(new Object[0]));
  }
  
  private static Boolean lambda$static$44(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 39679630947404
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 117508162603044
    //   13: lxor
    //   14: lstore_3
    //   15: dup2
    //   16: ldc2_w 91078209905591
    //   19: lxor
    //   20: lstore #5
    //   22: pop2
    //   23: invokestatic aegisguard_A : ()I
    //   26: istore #7
    //   28: iconst_0
    //   29: anewarray java/lang/Object
    //   32: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   35: iload #7
    //   37: ifne -> 76
    //   40: ifeq -> 190
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   49: athrow
    //   50: aload_0
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual aegisguard_m : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_XW;
    //   58: iconst_0
    //   59: anewarray java/lang/Object
    //   62: invokevirtual aegisguard_M : ([Ljava/lang/Object;)J
    //   65: ldc2_w 10
    //   68: lcmp
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: iload #7
    //   78: ifne -> 124
    //   81: ifge -> 190
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: aload_0
    //   92: iconst_0
    //   93: anewarray java/lang/Object
    //   96: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   99: lload #5
    //   101: iconst_1
    //   102: anewarray java/lang/Object
    //   105: dup_x2
    //   106: dup_x2
    //   107: pop
    //   108: invokestatic valueOf : (J)Ljava/lang/Long;
    //   111: iconst_0
    //   112: swap
    //   113: aastore
    //   114: invokevirtual aegisguard_cO : ([Ljava/lang/Object;)Z
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: iload #7
    //   126: ifne -> 187
    //   129: ifne -> 186
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: aload_0
    //   140: iconst_0
    //   141: anewarray java/lang/Object
    //   144: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   147: lload_3
    //   148: iconst_1
    //   149: anewarray java/lang/Object
    //   152: dup_x2
    //   153: dup_x2
    //   154: pop
    //   155: invokestatic valueOf : (J)Ljava/lang/Long;
    //   158: iconst_0
    //   159: swap
    //   160: aastore
    //   161: invokevirtual aegisguard_CS : ([Ljava/lang/Object;)Z
    //   164: iload #7
    //   166: ifne -> 187
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: ifne -> 190
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   185: athrow
    //   186: iconst_1
    //   187: goto -> 191
    //   190: iconst_0
    //   191: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   194: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #111	-> 28
    //   #112	-> 92
    //   #111	-> 191
    // Exception table:
    //   from	to	target	type
    //   28	43	46	java/lang/RuntimeException
    //   40	69	72	java/lang/RuntimeException
    //   76	84	87	java/lang/RuntimeException
    //   81	117	120	java/lang/RuntimeException
    //   124	132	135	java/lang/RuntimeException
    //   129	169	172	java/lang/RuntimeException
    //   139	179	182	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$45(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_k(new Object[0]));
  }
  
  private static Boolean lambda$static$46(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x4C2002AD43ECL;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_t(new Object[0]) < 20));
  }
  
  private static Boolean lambda$static$47(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 115298598867753
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual aegisguard_vA : ([Ljava/lang/Object;)I
    //   27: iload_3
    //   28: ifeq -> 80
    //   31: bipush #20
    //   33: if_icmplt -> 79
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual aegisguard_Cj : ([Ljava/lang/Object;)Z
    //   58: iload_3
    //   59: ifeq -> 80
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: ifeq -> 83
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_1
    //   80: goto -> 84
    //   83: iconst_0
    //   84: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   87: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #118	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	36	39	java/lang/RuntimeException
    //   31	62	65	java/lang/RuntimeException
    //   43	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$48(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x5F36C574C989L;
    int i = aegisguard_A();
    try {
      if (i == 0) {
        try {
          if (!paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Ca(new Object[0])) {
            try {
              if (i == 0)
                try {
                  if (paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_vs(new Object[0]) < 30);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Ca(new Object[0]));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$49(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_c0(new Object[0]));
  }
  
  private static Boolean lambda$static$50(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x30A316F84DD8L;
    int i = aegisguard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Yz(new Object[0]) > 2));
  }
  
  private static Boolean lambda$static$51(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_Cv(new Object[0]));
  }
  
  private static Boolean lambda$static$52(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x58F2D1374ADAL;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_YS(new Object[0]) > 5));
  }
  
  private static Boolean lambda$static$53(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_u(new Object[0]));
  }
  
  private static Boolean lambda$static$54(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_r(new Object[0]));
  }
  
  private static Boolean lambda$static$55(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_L(new Object[0]));
  }
  
  private static Boolean lambda$static$56(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x7F51752462F8L;
    int i = aegisguard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_y(new Object[0]) < 25));
  }
  
  private static Boolean lambda$static$57(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x6E7E44F7F292L;
    int i = aegisguard_Q();
    try {
      if (i != 0) {
        try {
          if (!paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_cA(new Object[0])) {
            try {
              if (i != 0)
                try {
                  if (paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_h(new Object[0]) < 20);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_cA(new Object[0]));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$58(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x5999D40439DDL;
    int i = aegisguard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Yj(new Object[0]) < 25));
  }
  
  private static Boolean lambda$static$59(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x4673E44A810EL;
    int i = aegisguard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_h(new Object[0]) < 5));
  }
  
  private static Boolean lambda$static$60(aegisguard_hu paramaegisguard_hu) {
    long l1 = a ^ 0x47BDD9418573L, l2 = l1 ^ 0x5110EFAE6DDAL;
    new Object[1];
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_CP(new Object[] { Long.valueOf(l2) }));
  }
  
  private static Boolean lambda$static$61(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x76414F5240B5L;
    int i = aegisguard_A();
    try {
      if (i == 0) {
        try {
          if (!paramaegisguard_hu.aegisguard_L(new Object[0]).isSleeping())
            try {
              if (i == 0) {
                try {
                  if (aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Yi(new Object[0]) >= 40) {
                    try {
                      if (i == 0)
                        try {
                          if (aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Yn(new Object[0]) < 40);
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    return Boolean.valueOf(false);
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } else {
                return Boolean.valueOf(aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Yi(new Object[0]));
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramaegisguard_hu.aegisguard_L(new Object[0]).isSleeping());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$62(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 28831449121384
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_Q : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_f : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifeq -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_m : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifeq -> 79
    //   59: bipush #60
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #149	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$63(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 897081977151
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual aegisguard_vO : ([Ljava/lang/Object;)I
    //   27: iload_3
    //   28: ifne -> 80
    //   31: bipush #20
    //   33: if_icmplt -> 79
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual aegisguard_ca : ([Ljava/lang/Object;)Z
    //   58: iload_3
    //   59: ifne -> 80
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: ifeq -> 83
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_1
    //   80: goto -> 84
    //   83: iconst_0
    //   84: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   87: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #151	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	36	39	java/lang/RuntimeException
    //   31	62	65	java/lang/RuntimeException
    //   43	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$64(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 85292819293639
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_W : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 79
    //   59: bipush #100
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #153	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$65(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x5F6FEEF40B0L;
    int i = aegisguard_A();
    try {
      if (i == 0)
        if (System.currentTimeMillis() - aegisguard_K.INSTANCE.aegisguard_L() < 10000L) {
        
        } else {
          return Boolean.valueOf(false);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$66(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 84366491941250
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_vk : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 79
    //   59: bipush #80
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #157	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$67(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 33219239472834
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 83
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_B : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 80
    //   59: sipush #150
    //   62: if_icmpge -> 83
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: iconst_1
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: goto -> 84
    //   83: iconst_0
    //   84: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   87: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #159	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	65	68	java/lang/RuntimeException
    //   59	73	76	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$68(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 62125879102152
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_Q : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_S : ([Ljava/lang/Object;)Z
    //   19: ifeq -> 93
    //   22: aload_0
    //   23: iconst_0
    //   24: anewarray java/lang/Object
    //   27: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   30: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   35: getstatic org/bukkit/GameMode.SPECTATOR : Lorg/bukkit/GameMode;
    //   38: iload_3
    //   39: ifeq -> 82
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   48: athrow
    //   49: if_acmpeq -> 85
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: aload_0
    //   60: iconst_0
    //   61: anewarray java/lang/Object
    //   64: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   67: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   72: getstatic org/bukkit/GameMode.SPECTATOR : Lorg/bukkit/GameMode;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: if_acmpne -> 93
    //   85: iconst_1
    //   86: goto -> 94
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: iconst_0
    //   94: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   97: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #161	-> 12
    //   #162	-> 60
    //   #161	-> 94
    // Exception table:
    //   from	to	target	type
    //   12	42	45	java/lang/RuntimeException
    //   22	52	55	java/lang/RuntimeException
    //   49	75	78	java/lang/RuntimeException
    //   82	89	89	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$69(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_CN(new Object[0]));
  }
  
  private static Boolean lambda$static$70(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 23662407761209
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_A : ()I
    //   11: istore_3
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gb : Z
    //   15: iload_3
    //   16: ifne -> 51
    //   19: ifeq -> 78
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: aload_0
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   37: iconst_0
    //   38: anewarray java/lang/Object
    //   41: invokevirtual aegisguard_k : ([Ljava/lang/Object;)I
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: iload_3
    //   52: ifne -> 75
    //   55: bipush #8
    //   57: if_icmpge -> 78
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: iconst_1
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: goto -> 79
    //   78: iconst_0
    //   79: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   82: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #166	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	22	25	java/lang/RuntimeException
    //   19	44	47	java/lang/RuntimeException
    //   51	60	63	java/lang/RuntimeException
    //   55	68	71	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$71(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x12BE0F74E33DL;
    int i = aegisguard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_r(new Object[0]) < 25));
  }
  
  private static Boolean lambda$static$72(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 78206506037179
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual aegisguard_s : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_KB;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual aegisguard_e : ([Ljava/lang/Object;)Z
    //   27: iload_3
    //   28: ifeq -> 63
    //   31: ifeq -> 90
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: aload_0
    //   42: iconst_0
    //   43: anewarray java/lang/Object
    //   46: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual aegisguard_vy : ([Ljava/lang/Object;)I
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: iload_3
    //   64: ifeq -> 87
    //   67: bipush #30
    //   69: if_icmpge -> 90
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_1
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: goto -> 91
    //   90: iconst_0
    //   91: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   94: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #170	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	34	37	java/lang/RuntimeException
    //   31	56	59	java/lang/RuntimeException
    //   63	72	75	java/lang/RuntimeException
    //   67	80	83	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$73(aegisguard_hu paramaegisguard_hu) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_h3.a : J
    //   3: ldc2_w 26658705126217
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_Q : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifeq -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual aegisguard_u : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifeq -> 79
    //   59: bipush #75
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #172	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$74(aegisguard_hu paramaegisguard_hu) {
    return Boolean.valueOf(paramaegisguard_hu.aegisguard_x(new Object[0]).aegisguard_C_(new Object[0]));
  }
  
  private static Boolean lambda$static$75(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x5EABB2F451C3L;
    int i = aegisguard_A();
    try {
      if (i == 0) {
        try {
          if (aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Y_(new Object[0]) >= 20) {
            try {
              if (i == 0)
                try {
                  if (aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_w(new Object[0]) < 20);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]) - paramaegisguard_hu.aegisguard_s(new Object[0]).aegisguard_Y_(new Object[0]));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$76(aegisguard_hu paramaegisguard_hu) {
    long l = a ^ 0x436304FE8595L;
    int i = aegisguard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_Yo(new Object[0]) < 25));
  }
  
  private static Boolean lambda$static$77(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x625194FE94DL;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_Yq(new Object[0]) < 10));
  }
  
  private static Boolean lambda$static$78(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x63ABF7B6CB8L;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_Ye(new Object[0]) < 8));
  }
  
  private static Boolean lambda$static$79(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x4EF72209258EL;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_Ye(new Object[0]) < 5));
  }
  
  private static Boolean lambda$static$80(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0xEF79BBA4F3EL;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_Ye(new Object[0]) < 3));
  }
  
  private static Boolean lambda$static$81(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x349A21840E1FL;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_A(new Object[0]) < 40));
  }
  
  private static Boolean lambda$static$82(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x73A24E106CDDL;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_Yq(new Object[0]) < 30));
  }
  
  private static Boolean lambda$static$83(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x3E2BCA8063DEL;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_Yq(new Object[0]) < 15));
  }
  
  private static Boolean lambda$static$84(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 121653884585893
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iload_3
    //   14: ifne -> 51
    //   17: iconst_0
    //   18: anewarray java/lang/Object
    //   21: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   24: iconst_0
    //   25: anewarray java/lang/Object
    //   28: invokevirtual AegisGuard_vy : ([Ljava/lang/Object;)I
    //   31: bipush #60
    //   33: if_icmpge -> 163
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   58: iconst_1
    //   59: anewarray java/lang/Object
    //   62: dup_x1
    //   63: swap
    //   64: iconst_0
    //   65: swap
    //   66: aastore
    //   67: invokestatic AegisGuard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   70: iload_3
    //   71: ifne -> 111
    //   74: ifnull -> 163
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload_0
    //   85: iconst_0
    //   86: anewarray java/lang/Object
    //   89: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   92: iconst_1
    //   93: anewarray java/lang/Object
    //   96: dup_x1
    //   97: swap
    //   98: iconst_0
    //   99: swap
    //   100: aastore
    //   101: invokestatic AegisGuard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: getstatic com/github/retrooper/packetevents/protocol/player/ClientVersion.V_1_13 : Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   114: invokevirtual isNewerThanOrEquals : (Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;)Z
    //   117: iload_3
    //   118: ifne -> 145
    //   121: ifeq -> 163
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokestatic AegisGuard_c : ([Ljava/lang/Object;)Z
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: iload_3
    //   146: ifne -> 160
    //   149: ifeq -> 163
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: iconst_1
    //   160: goto -> 164
    //   163: iconst_0
    //   164: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   167: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #195	-> 12
    //   #196	-> 85
    //   #195	-> 164
    // Exception table:
    //   from	to	target	type
    //   12	36	39	java/lang/RuntimeException
    //   17	44	47	java/lang/RuntimeException
    //   51	77	80	java/lang/RuntimeException
    //   74	104	107	java/lang/RuntimeException
    //   111	124	127	java/lang/RuntimeException
    //   121	138	141	java/lang/RuntimeException
    //   145	152	155	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$85(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_Q(new Object[0]));
  }
  
  private static Boolean lambda$static$86(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0xF1ED91A5140L;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_Y3(new Object[0]) < 30));
  }
  
  private static Boolean lambda$static$87(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_M(new Object[0]));
  }
  
  private static Boolean lambda$static$88(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x7CB8A4A72815L;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        if (!paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_E(new Object[0])) {
        
        } else {
          return Boolean.valueOf(false);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$89(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x27B63E5368F8L;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_V(new Object[0]) < 120));
  }
  
  private static Boolean lambda$static$90(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x7140DCE54C5CL;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_o(new Object[0]) < 25));
  }
  
  private static Boolean lambda$static$91(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x7C4298E59E89L;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_u(new Object[0]) < 40));
  }
  
  private static Boolean lambda$static$92(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x16016EFECD0CL;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_YL(new Object[0]) < 40));
  }
  
  private static Boolean lambda$static$93(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 68003452676685
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual AegisGuard_T : ([Ljava/lang/Object;)Z
    //   27: iload_3
    //   28: ifeq -> 294
    //   31: ifne -> 293
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: aload_0
    //   42: iconst_0
    //   43: anewarray java/lang/Object
    //   46: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual AegisGuard_Z : ([Ljava/lang/Object;)Z
    //   56: iload_3
    //   57: ifeq -> 294
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: ifne -> 293
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: aload_0
    //   78: iconst_0
    //   79: anewarray java/lang/Object
    //   82: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   85: iconst_0
    //   86: anewarray java/lang/Object
    //   89: invokevirtual AegisGuard_CJ : ([Ljava/lang/Object;)Z
    //   92: iload_3
    //   93: ifeq -> 294
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: ifne -> 293
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: aload_0
    //   114: iconst_0
    //   115: anewarray java/lang/Object
    //   118: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   121: iconst_0
    //   122: anewarray java/lang/Object
    //   125: invokevirtual AegisGuard_u : ([Ljava/lang/Object;)Z
    //   128: iload_3
    //   129: ifeq -> 294
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: ifne -> 293
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: aload_0
    //   150: iconst_0
    //   151: anewarray java/lang/Object
    //   154: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   157: iconst_0
    //   158: anewarray java/lang/Object
    //   161: invokevirtual AegisGuard_Ct : ([Ljava/lang/Object;)Z
    //   164: iload_3
    //   165: ifeq -> 294
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   174: athrow
    //   175: ifne -> 293
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   184: athrow
    //   185: aload_0
    //   186: iconst_0
    //   187: anewarray java/lang/Object
    //   190: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   193: iconst_0
    //   194: anewarray java/lang/Object
    //   197: invokevirtual AegisGuard_CH : ([Ljava/lang/Object;)Z
    //   200: iload_3
    //   201: ifeq -> 294
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: ifne -> 293
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   220: athrow
    //   221: aload_0
    //   222: iconst_0
    //   223: anewarray java/lang/Object
    //   226: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   229: iconst_0
    //   230: anewarray java/lang/Object
    //   233: invokevirtual AegisGuard_w : ([Ljava/lang/Object;)Z
    //   236: iload_3
    //   237: ifeq -> 294
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: ifne -> 293
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   256: athrow
    //   257: aload_0
    //   258: iconst_0
    //   259: anewarray java/lang/Object
    //   262: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   265: iconst_0
    //   266: anewarray java/lang/Object
    //   269: invokevirtual AegisGuard_C5 : ([Ljava/lang/Object;)Z
    //   272: iload_3
    //   273: ifeq -> 294
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   282: athrow
    //   283: ifeq -> 297
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   292: athrow
    //   293: iconst_1
    //   294: goto -> 298
    //   297: iconst_0
    //   298: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   301: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #214	-> 12
    //   #215	-> 78
    //   #216	-> 186
    //   #214	-> 298
    // Exception table:
    //   from	to	target	type
    //   12	34	37	java/lang/RuntimeException
    //   31	60	63	java/lang/RuntimeException
    //   41	70	73	java/lang/RuntimeException
    //   67	96	99	java/lang/RuntimeException
    //   77	106	109	java/lang/RuntimeException
    //   103	132	135	java/lang/RuntimeException
    //   113	142	145	java/lang/RuntimeException
    //   139	168	171	java/lang/RuntimeException
    //   149	178	181	java/lang/RuntimeException
    //   175	204	207	java/lang/RuntimeException
    //   185	214	217	java/lang/RuntimeException
    //   211	240	243	java/lang/RuntimeException
    //   221	250	253	java/lang/RuntimeException
    //   247	276	279	java/lang/RuntimeException
    //   257	286	289	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$94(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 69225984719395
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic AegisGuard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 118
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual AegisGuard_l : ([Ljava/lang/Object;)Z
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 115
    //   59: ifne -> 107
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: aload_0
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual AegisGuard_F : ([Ljava/lang/Object;)I
    //   84: iload_3
    //   85: ifne -> 115
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: bipush #30
    //   97: if_icmpge -> 118
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: iconst_1
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: goto -> 119
    //   118: iconst_0
    //   119: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   122: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #218	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	62	65	java/lang/RuntimeException
    //   59	88	91	java/lang/RuntimeException
    //   69	100	103	java/lang/RuntimeException
    //   95	108	111	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$95(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 116079623223899
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic AegisGuard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 118
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual AegisGuard_w : ([Ljava/lang/Object;)Z
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 115
    //   59: ifne -> 107
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: aload_0
    //   70: iconst_0
    //   71: anewarray java/lang/Object
    //   74: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   77: iconst_0
    //   78: anewarray java/lang/Object
    //   81: invokevirtual AegisGuard_r : ([Ljava/lang/Object;)I
    //   84: iload_3
    //   85: ifne -> 115
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: bipush #30
    //   97: if_icmpge -> 118
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: iconst_1
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: goto -> 119
    //   118: iconst_0
    //   119: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   122: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #220	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	62	65	java/lang/RuntimeException
    //   59	88	91	java/lang/RuntimeException
    //   69	100	103	java/lang/RuntimeException
    //   95	108	111	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$96(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 34799250252161
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual AegisGuard_Cb : ([Ljava/lang/Object;)Z
    //   27: iload_3
    //   28: ifne -> 78
    //   31: ifne -> 77
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: aload_0
    //   42: iconst_0
    //   43: anewarray java/lang/Object
    //   46: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual AegisGuard_c0 : ([Ljava/lang/Object;)Z
    //   56: iload_3
    //   57: ifne -> 78
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: ifeq -> 81
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: iconst_1
    //   78: goto -> 82
    //   81: iconst_0
    //   82: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   85: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #222	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	34	37	java/lang/RuntimeException
    //   31	60	63	java/lang/RuntimeException
    //   41	70	73	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$97(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x2C7045AA6B35L;
    int i = AegisGuard_Q();
    try {
      if (i != 0) {
        try {
          if (!paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_Cn(new Object[0])) {
            try {
              if (i != 0)
                try {
                  if (paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_vf(new Object[0]) < 20);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_Cn(new Object[0]));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$98(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 78641319800638
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic AegisGuard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifeq -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual AegisGuard_vL : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifeq -> 79
    //   59: bipush #40
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #226	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$99(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 79829806123958
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic AegisGuard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifeq -> 53
    //   23: ifeq -> 71
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   41: invokeinterface isGliding : ()Z
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   52: athrow
    //   53: iload_3
    //   54: ifeq -> 68
    //   57: ifeq -> 71
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: iconst_1
    //   68: goto -> 72
    //   71: iconst_0
    //   72: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   75: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #228	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	46	49	java/lang/RuntimeException
    //   53	60	63	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$100(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x7D2FAD5AF0B6L;
    int i = AegisGuard_A();
    try {
      if (i == 0) {
        try {
          if (!paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_s(new Object[0])) {
            try {
              if (i == 0)
                try {
                  if (paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_vt(new Object[0]) < 100);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_s(new Object[0]));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$101(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x486DDAE9D090L;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_Y(new Object[0]).AegisGuard_O(new Object[0]) < 40));
  }
  
  private static Boolean lambda$static$102(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_L(new Object[0]).isDead());
  }
  
  private static Boolean lambda$static$103(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 129865044470839
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual AegisGuard_vZ : ([Ljava/lang/Object;)I
    //   27: iload_3
    //   28: ifne -> 69
    //   31: bipush #25
    //   33: if_icmpge -> 87
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual AegisGuard_E : ([Ljava/lang/Object;)D
    //   58: ldc2_w 0.1
    //   61: dcmpg
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: iload_3
    //   70: ifne -> 84
    //   73: ifge -> 87
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: iconst_1
    //   84: goto -> 88
    //   87: iconst_0
    //   88: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   91: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #236	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	36	39	java/lang/RuntimeException
    //   31	62	65	java/lang/RuntimeException
    //   69	76	79	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$104(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_C8(new Object[0]));
  }
  
  private static Boolean lambda$static$105(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 110002787198305
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: getstatic me/frep/AegisGuard/spigot/AegisGuard_b0.AegisGuard_MZ : Z
    //   15: iload_3
    //   16: ifne -> 51
    //   19: ifeq -> 69
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: aload_0
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokevirtual AegisGuard_O : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_R;
    //   37: iconst_0
    //   38: anewarray java/lang/Object
    //   41: invokevirtual AegisGuard_E : ([Ljava/lang/Object;)Z
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: iload_3
    //   52: ifne -> 66
    //   55: ifeq -> 69
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: iconst_1
    //   66: goto -> 70
    //   69: iconst_0
    //   70: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   73: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #240	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	22	25	java/lang/RuntimeException
    //   19	44	47	java/lang/RuntimeException
    //   51	58	61	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$106(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_m(new Object[0]).AegisGuard_l(new Object[0]));
  }
  
  private static Boolean lambda$static$107(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 40227572879992
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: getstatic me/frep/AegisGuard/spigot/AegisGuard_b0.AegisGuard_LM : Z
    //   15: iload_3
    //   16: ifne -> 43
    //   19: ifeq -> 139
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: iconst_0
    //   30: anewarray java/lang/Object
    //   33: invokestatic AegisGuard_y : ([Ljava/lang/Object;)Z
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: iload_3
    //   44: ifne -> 83
    //   47: ifeq -> 139
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_0
    //   58: iconst_0
    //   59: anewarray java/lang/Object
    //   62: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   65: iconst_0
    //   66: anewarray java/lang/Object
    //   69: invokevirtual AegisGuard_T : ([Ljava/lang/Object;)D
    //   72: ldc2_w 3.0
    //   75: dcmpg
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: iload_3
    //   84: ifne -> 121
    //   87: ifge -> 139
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload_0
    //   98: iconst_0
    //   99: anewarray java/lang/Object
    //   102: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   105: iconst_0
    //   106: anewarray java/lang/Object
    //   109: invokevirtual AegisGuard_T : ([Ljava/lang/Object;)D
    //   112: dconst_0
    //   113: dcmpl
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: iload_3
    //   122: ifne -> 136
    //   125: ifle -> 139
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: iconst_1
    //   136: goto -> 140
    //   139: iconst_0
    //   140: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   143: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #244	-> 12
    //   #245	-> 58
    //   #244	-> 140
    // Exception table:
    //   from	to	target	type
    //   12	22	25	java/lang/RuntimeException
    //   19	36	39	java/lang/RuntimeException
    //   43	50	53	java/lang/RuntimeException
    //   47	76	79	java/lang/RuntimeException
    //   83	90	93	java/lang/RuntimeException
    //   87	114	117	java/lang/RuntimeException
    //   121	128	131	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$108(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x2DC1E36B51C3L;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((AegisGuard_K.INSTANCE.AegisGuard_W().AegisGuard_I(new Object[0]) - paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_L(new Object[0]) < 15));
  }
  
  private static Boolean lambda$static$109(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x4B8854681303L;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((AegisGuard_K.INSTANCE.AegisGuard_W().AegisGuard_I(new Object[0]) - paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard__(new Object[0]) < 15));
  }
  
  private static Boolean lambda$static$110(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x1E8D76D5074L;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((AegisGuard_K.INSTANCE.AegisGuard_W().AegisGuard_I(new Object[0]) - paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_F(new Object[0]) < 40));
  }
  
  private static Boolean lambda$static$111(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x16D4D04DAC7EL;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_YO(new Object[0]) < 50));
  }
  
  private static Boolean lambda$static$112(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 81478481815847
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   20: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   25: getstatic org/bukkit/GameMode.CREATIVE : Lorg/bukkit/GameMode;
    //   28: iload_3
    //   29: ifeq -> 67
    //   32: if_acmpeq -> 70
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: aload_0
    //   43: iconst_0
    //   44: anewarray java/lang/Object
    //   47: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   50: iconst_0
    //   51: anewarray java/lang/Object
    //   54: invokevirtual AegisGuard_O : ([Ljava/lang/Object;)Lorg/bukkit/GameMode;
    //   57: getstatic org/bukkit/GameMode.CREATIVE : Lorg/bukkit/GameMode;
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: if_acmpne -> 78
    //   70: iconst_1
    //   71: goto -> 79
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: iconst_0
    //   79: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   82: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #255	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	35	38	java/lang/RuntimeException
    //   32	60	63	java/lang/RuntimeException
    //   67	74	74	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$113(AegisGuard_hu paramAegisGuard_hu) {
    long l1 = a ^ 0x240C229D19BDL, l2 = l1 ^ 0x5B182AEF6CAFL;
    int i = AegisGuard_A();
    try {
      (new me.frep.AegisGuard.spigot.AegisGuard_h3[8])[0] = PLACING;
      (new me.frep.AegisGuard.spigot.AegisGuard_h3[8])[1] = DIGGING;
      (new me.frep.AegisGuard.spigot.AegisGuard_h3[8])[2] = BLOCK_BREAK;
      (new me.frep.AegisGuard.spigot.AegisGuard_h3[8])[3] = FAST;
      (new me.frep.AegisGuard.spigot.AegisGuard_h3[8])[4] = DROPPED_ITEM;
      (new me.frep.AegisGuard.spigot.AegisGuard_h3[8])[5] = WINDOW_CLICK;
      (new me.frep.AegisGuard.spigot.AegisGuard_h3[8])[6] = CANCELLED_BREAK;
      (new me.frep.AegisGuard.spigot.AegisGuard_h3[8])[7] = CREATIVE;
      new Object[2];
      if (i == 0) {
        try {
          if (!paramAegisGuard_hu.AegisGuard_K(new Object[0]).AegisGuard_g(new Object[] { null, Long.valueOf(l2), new me.frep.AegisGuard.spigot.AegisGuard_h3[8] }))
            try {
              if (i == 0) {
                try {
                  if (paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_YQ(new Object[0]) >= 15)
                    try {
                      if (i == 0) {
                        try {
                          if (AegisGuard_K.INSTANCE.AegisGuard_W().AegisGuard_I(new Object[0]) - paramAegisGuard_hu.AegisGuard_r(new Object[0]).AegisGuard_u(new Object[0]) >= 20) {
                            try {
                              if (i == 0)
                                try {
                                  if (AegisGuard_K.INSTANCE.AegisGuard_W().AegisGuard_I(new Object[0]) - paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_m(new Object[0]) < 20);
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                }  
                            } catch (RuntimeException runtimeException) {
                              throw a(null);
                            } 
                            return Boolean.valueOf(false);
                          } 
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        } 
                      } else {
                        return Boolean.valueOf(AegisGuard_K.INSTANCE.AegisGuard_W().AegisGuard_I(new Object[0]) - paramAegisGuard_hu.AegisGuard_r(new Object[0]).AegisGuard_u(new Object[0]));
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } else {
                return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_YQ(new Object[0]));
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_K(new Object[0]).AegisGuard_g(new Object[] { null, Long.valueOf(l2), new me.frep.AegisGuard.spigot.AegisGuard_h3[8] }));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$114(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 50039638666521
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 90807597094923
    //   13: lxor
    //   14: lstore_3
    //   15: pop2
    //   16: invokestatic AegisGuard_A : ()I
    //   19: istore #5
    //   21: aload_0
    //   22: iconst_0
    //   23: anewarray java/lang/Object
    //   26: invokevirtual AegisGuard_K : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_X;
    //   29: bipush #8
    //   31: anewarray me/frep/AegisGuard/spigot/AegisGuard_h3
    //   34: dup
    //   35: iconst_0
    //   36: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.PLACING : Lme/frep/AegisGuard/spigot/AegisGuard_h3;
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.DIGGING : Lme/frep/AegisGuard/spigot/AegisGuard_h3;
    //   45: aastore
    //   46: dup
    //   47: iconst_2
    //   48: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.BLOCK_BREAK : Lme/frep/AegisGuard/spigot/AegisGuard_h3;
    //   51: aastore
    //   52: dup
    //   53: iconst_3
    //   54: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.FAST : Lme/frep/AegisGuard/spigot/AegisGuard_h3;
    //   57: aastore
    //   58: dup
    //   59: iconst_4
    //   60: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.DROPPED_ITEM : Lme/frep/AegisGuard/spigot/AegisGuard_h3;
    //   63: aastore
    //   64: dup
    //   65: iconst_5
    //   66: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.WINDOW_CLICK : Lme/frep/AegisGuard/spigot/AegisGuard_h3;
    //   69: aastore
    //   70: dup
    //   71: bipush #6
    //   73: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.CREATIVE : Lme/frep/AegisGuard/spigot/AegisGuard_h3;
    //   76: aastore
    //   77: dup
    //   78: bipush #7
    //   80: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.CANCELLED_BREAK : Lme/frep/AegisGuard/spigot/AegisGuard_h3;
    //   83: aastore
    //   84: lload_3
    //   85: iconst_2
    //   86: anewarray java/lang/Object
    //   89: dup_x2
    //   90: dup_x2
    //   91: pop
    //   92: invokestatic valueOf : (J)Ljava/lang/Long;
    //   95: iconst_1
    //   96: swap
    //   97: aastore
    //   98: dup_x1
    //   99: swap
    //   100: iconst_0
    //   101: swap
    //   102: aastore
    //   103: invokevirtual AegisGuard_g : ([Ljava/lang/Object;)Z
    //   106: iload #5
    //   108: ifne -> 664
    //   111: ifne -> 663
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: invokestatic currentTimeMillis : ()J
    //   124: aload_0
    //   125: iconst_0
    //   126: anewarray java/lang/Object
    //   129: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   132: iconst_0
    //   133: anewarray java/lang/Object
    //   136: invokevirtual AegisGuard_P : ([Ljava/lang/Object;)J
    //   139: lsub
    //   140: ldc2_w 110
    //   143: lcmp
    //   144: iload #5
    //   146: ifne -> 664
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   155: athrow
    //   156: iflt -> 663
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: aload_0
    //   167: iconst_0
    //   168: anewarray java/lang/Object
    //   171: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   174: iconst_0
    //   175: anewarray java/lang/Object
    //   178: invokevirtual AegisGuard_B : ([Ljava/lang/Object;)I
    //   181: iload #5
    //   183: ifne -> 664
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   192: athrow
    //   193: bipush #20
    //   195: if_icmplt -> 663
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   204: athrow
    //   205: invokestatic currentTimeMillis : ()J
    //   208: aload_0
    //   209: iconst_0
    //   210: anewarray java/lang/Object
    //   213: invokevirtual AegisGuard_v : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_XR;
    //   216: iconst_0
    //   217: anewarray java/lang/Object
    //   220: invokevirtual AegisGuard_c : ([Ljava/lang/Object;)J
    //   223: lsub
    //   224: ldc2_w 3000
    //   227: lcmp
    //   228: iload #5
    //   230: ifne -> 664
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   239: athrow
    //   240: iflt -> 663
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: invokestatic currentTimeMillis : ()J
    //   253: aload_0
    //   254: iconst_0
    //   255: anewarray java/lang/Object
    //   258: invokevirtual AegisGuard_v : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_XR;
    //   261: iconst_0
    //   262: anewarray java/lang/Object
    //   265: invokevirtual AegisGuard_i : ([Ljava/lang/Object;)J
    //   268: lsub
    //   269: ldc2_w 250
    //   272: lcmp
    //   273: iload #5
    //   275: ifne -> 664
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: iflt -> 663
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   294: athrow
    //   295: aload_0
    //   296: iconst_0
    //   297: anewarray java/lang/Object
    //   300: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   303: iconst_0
    //   304: anewarray java/lang/Object
    //   307: invokevirtual AegisGuard_YQ : ([Ljava/lang/Object;)I
    //   310: iload #5
    //   312: ifne -> 664
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   321: athrow
    //   322: bipush #15
    //   324: if_icmplt -> 663
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   333: athrow
    //   334: invokestatic currentTimeMillis : ()J
    //   337: aload_0
    //   338: iconst_0
    //   339: anewarray java/lang/Object
    //   342: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   345: iconst_0
    //   346: anewarray java/lang/Object
    //   349: invokevirtual AegisGuard_V : ([Ljava/lang/Object;)J
    //   352: lsub
    //   353: ldc2_w 110
    //   356: lcmp
    //   357: iload #5
    //   359: ifne -> 664
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   368: athrow
    //   369: iflt -> 663
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   378: athrow
    //   379: invokestatic currentTimeMillis : ()J
    //   382: aload_0
    //   383: iconst_0
    //   384: anewarray java/lang/Object
    //   387: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   390: iconst_0
    //   391: anewarray java/lang/Object
    //   394: invokevirtual AegisGuard_Q : ([Ljava/lang/Object;)J
    //   397: lsub
    //   398: ldc2_w 110
    //   401: lcmp
    //   402: iload #5
    //   404: ifne -> 664
    //   407: goto -> 414
    //   410: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   413: athrow
    //   414: iflt -> 663
    //   417: goto -> 424
    //   420: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   423: athrow
    //   424: getstatic me/frep/AegisGuard/spigot/AegisGuard_K.INSTANCE : Lme/frep/AegisGuard/spigot/AegisGuard_K;
    //   427: invokevirtual AegisGuard_W : ()Lme/frep/AegisGuard/spigot/AegisGuard_K8;
    //   430: iconst_0
    //   431: anewarray java/lang/Object
    //   434: invokevirtual AegisGuard_I : ([Ljava/lang/Object;)I
    //   437: aload_0
    //   438: iconst_0
    //   439: anewarray java/lang/Object
    //   442: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   445: iconst_0
    //   446: anewarray java/lang/Object
    //   449: invokevirtual AegisGuard_W : ([Ljava/lang/Object;)I
    //   452: isub
    //   453: iload #5
    //   455: ifne -> 664
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   464: athrow
    //   465: bipush #20
    //   467: if_icmplt -> 663
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   476: athrow
    //   477: getstatic me/frep/AegisGuard/spigot/AegisGuard_K.INSTANCE : Lme/frep/AegisGuard/spigot/AegisGuard_K;
    //   480: invokevirtual AegisGuard_W : ()Lme/frep/AegisGuard/spigot/AegisGuard_K8;
    //   483: iconst_0
    //   484: anewarray java/lang/Object
    //   487: invokevirtual AegisGuard_I : ([Ljava/lang/Object;)I
    //   490: aload_0
    //   491: iconst_0
    //   492: anewarray java/lang/Object
    //   495: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   498: iconst_0
    //   499: anewarray java/lang/Object
    //   502: invokevirtual AegisGuard_m : ([Ljava/lang/Object;)I
    //   505: isub
    //   506: iload #5
    //   508: ifne -> 664
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   517: athrow
    //   518: bipush #20
    //   520: if_icmplt -> 663
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   529: athrow
    //   530: getstatic me/frep/AegisGuard/spigot/AegisGuard_K.INSTANCE : Lme/frep/AegisGuard/spigot/AegisGuard_K;
    //   533: invokevirtual AegisGuard_W : ()Lme/frep/AegisGuard/spigot/AegisGuard_K8;
    //   536: iconst_0
    //   537: anewarray java/lang/Object
    //   540: invokevirtual AegisGuard_I : ([Ljava/lang/Object;)I
    //   543: aload_0
    //   544: iconst_0
    //   545: anewarray java/lang/Object
    //   548: invokevirtual AegisGuard_r : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KQ;
    //   551: iconst_0
    //   552: anewarray java/lang/Object
    //   555: invokevirtual AegisGuard_u : ([Ljava/lang/Object;)I
    //   558: isub
    //   559: iload #5
    //   561: ifne -> 664
    //   564: goto -> 571
    //   567: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   570: athrow
    //   571: bipush #20
    //   573: if_icmplt -> 663
    //   576: goto -> 583
    //   579: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   582: athrow
    //   583: aload_0
    //   584: iconst_0
    //   585: anewarray java/lang/Object
    //   588: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   591: iconst_0
    //   592: anewarray java/lang/Object
    //   595: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)D
    //   598: ldc2_w 6.5
    //   601: dcmpg
    //   602: iload #5
    //   604: ifne -> 648
    //   607: goto -> 614
    //   610: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   613: athrow
    //   614: ifge -> 667
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   623: athrow
    //   624: aload_0
    //   625: iconst_0
    //   626: anewarray java/lang/Object
    //   629: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   632: iconst_0
    //   633: anewarray java/lang/Object
    //   636: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)D
    //   639: dconst_0
    //   640: dcmpl
    //   641: goto -> 648
    //   644: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   647: athrow
    //   648: iload #5
    //   650: ifne -> 664
    //   653: ifle -> 667
    //   656: goto -> 663
    //   659: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   662: athrow
    //   663: iconst_1
    //   664: goto -> 668
    //   667: iconst_0
    //   668: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   671: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #263	-> 21
    //   #265	-> 121
    //   #266	-> 167
    //   #267	-> 205
    //   #268	-> 250
    //   #269	-> 296
    //   #270	-> 334
    //   #271	-> 379
    //   #272	-> 427
    //   #273	-> 480
    //   #274	-> 533
    //   #275	-> 584
    //   #263	-> 668
    // Exception table:
    //   from	to	target	type
    //   21	114	117	java/lang/RuntimeException
    //   111	149	152	java/lang/RuntimeException
    //   121	159	162	java/lang/RuntimeException
    //   156	186	189	java/lang/RuntimeException
    //   166	198	201	java/lang/RuntimeException
    //   193	233	236	java/lang/RuntimeException
    //   205	243	246	java/lang/RuntimeException
    //   240	278	281	java/lang/RuntimeException
    //   250	288	291	java/lang/RuntimeException
    //   285	315	318	java/lang/RuntimeException
    //   295	327	330	java/lang/RuntimeException
    //   322	362	365	java/lang/RuntimeException
    //   334	372	375	java/lang/RuntimeException
    //   369	407	410	java/lang/RuntimeException
    //   379	417	420	java/lang/RuntimeException
    //   414	458	461	java/lang/RuntimeException
    //   424	470	473	java/lang/RuntimeException
    //   465	511	514	java/lang/RuntimeException
    //   477	523	526	java/lang/RuntimeException
    //   518	564	567	java/lang/RuntimeException
    //   530	576	579	java/lang/RuntimeException
    //   571	607	610	java/lang/RuntimeException
    //   583	617	620	java/lang/RuntimeException
    //   614	641	644	java/lang/RuntimeException
    //   648	656	659	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$115(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x4347CC457C85L;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_j(new Object[0]) < 20));
  }
  
  private static Boolean lambda$static$116(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 93843293705275
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic AegisGuard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifeq -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual AegisGuard_b : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifeq -> 79
    //   59: bipush #40
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #279	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$117(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 8385078819301
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic AegisGuard_y : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual AegisGuard_vw : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 79
    //   59: bipush #40
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #281	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$118(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x2324B1C79E5BL;
    int i = AegisGuard_Q();
    try {
      if (i != 0) {
        try {
          if (!paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_Y(new Object[0])) {
            try {
              if (i != 0)
                try {
                  if (paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_v(new Object[0]) < 7);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_Y(new Object[0]));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$119(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 88465569052051
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual AegisGuard_a : ([Ljava/lang/Object;)I
    //   27: iload_3
    //   28: ifeq -> 80
    //   31: bipush #40
    //   33: if_icmplt -> 79
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual AegisGuard_J : ([Ljava/lang/Object;)Z
    //   58: iload_3
    //   59: ifeq -> 80
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: ifeq -> 83
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_1
    //   80: goto -> 84
    //   83: iconst_0
    //   84: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   87: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #285	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	36	39	java/lang/RuntimeException
    //   31	62	65	java/lang/RuntimeException
    //   43	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$120(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x7D5D1F0C545EL;
    int i = AegisGuard_A();
    try {
      if (i == 0) {
        try {
          if (!paramAegisGuard_hu.AegisGuard_L(new Object[0]).getAllowFlight()) {
            try {
              if (i == 0)
                try {
                  if (paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_v3(new Object[0]) < AegisGuard_b0.AegisGuard_ME);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_L(new Object[0]).getAllowFlight());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$121(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 7417584958483
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual AegisGuard_Yv : ([Ljava/lang/Object;)I
    //   27: bipush #25
    //   29: iload_3
    //   30: ifeq -> 76
    //   33: if_icmpge -> 83
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   51: invokeinterface getMaximumNoDamageTicks : ()I
    //   56: iload_3
    //   57: ifeq -> 80
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: bipush #15
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: if_icmpge -> 83
    //   79: iconst_1
    //   80: goto -> 84
    //   83: iconst_0
    //   84: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   87: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #289	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	36	39	java/lang/RuntimeException
    //   33	60	63	java/lang/RuntimeException
    //   43	69	72	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$122(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 18737935836917
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 83752781834511
    //   13: lxor
    //   14: lstore_3
    //   15: pop2
    //   16: invokestatic AegisGuard_A : ()I
    //   19: istore #5
    //   21: iconst_0
    //   22: anewarray java/lang/Object
    //   25: invokestatic AegisGuard_y : ([Ljava/lang/Object;)Z
    //   28: iload #5
    //   30: ifne -> 65
    //   33: ifeq -> 138
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual AegisGuard_C : ([Ljava/lang/Object;)I
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: iload #5
    //   67: ifne -> 135
    //   70: bipush #50
    //   72: if_icmplt -> 134
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: aload_0
    //   83: iconst_0
    //   84: anewarray java/lang/Object
    //   87: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   90: lload_3
    //   91: iconst_2
    //   92: anewarray java/lang/Object
    //   95: dup_x2
    //   96: dup_x2
    //   97: pop
    //   98: invokestatic valueOf : (J)Ljava/lang/Long;
    //   101: iconst_1
    //   102: swap
    //   103: aastore
    //   104: dup_x1
    //   105: swap
    //   106: iconst_0
    //   107: swap
    //   108: aastore
    //   109: invokestatic AegisGuard_v : ([Ljava/lang/Object;)Z
    //   112: iload #5
    //   114: ifne -> 135
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: ifeq -> 138
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   133: athrow
    //   134: iconst_1
    //   135: goto -> 139
    //   138: iconst_0
    //   139: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   142: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #291	-> 21
    // Exception table:
    //   from	to	target	type
    //   21	36	39	java/lang/RuntimeException
    //   33	58	61	java/lang/RuntimeException
    //   65	75	78	java/lang/RuntimeException
    //   70	117	120	java/lang/RuntimeException
    //   82	127	130	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$123(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 75139206000603
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual AegisGuard_j : ([Ljava/lang/Object;)I
    //   27: iload_3
    //   28: ifne -> 80
    //   31: bipush #10
    //   33: if_icmplt -> 79
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual AegisGuard_s : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_KB;
    //   51: iconst_0
    //   52: anewarray java/lang/Object
    //   55: invokevirtual AegisGuard_y : ([Ljava/lang/Object;)Z
    //   58: iload_3
    //   59: ifne -> 80
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: ifeq -> 83
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_1
    //   80: goto -> 84
    //   83: iconst_0
    //   84: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   87: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #293	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	36	39	java/lang/RuntimeException
    //   31	62	65	java/lang/RuntimeException
    //   43	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$124(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(AegisGuard_Xz.AegisGuard_y(new Object[0]));
  }
  
  private static Boolean lambda$static$125(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_CF(new Object[0]));
  }
  
  private static Boolean lambda$static$126(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 108008354995111
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   20: iconst_1
    //   21: anewarray java/lang/Object
    //   24: dup_x1
    //   25: swap
    //   26: iconst_0
    //   27: swap
    //   28: aastore
    //   29: invokestatic AegisGuard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   32: iload_3
    //   33: ifne -> 73
    //   36: ifnull -> 141
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   45: athrow
    //   46: aload_0
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   54: iconst_1
    //   55: anewarray java/lang/Object
    //   58: dup_x1
    //   59: swap
    //   60: iconst_0
    //   61: swap
    //   62: aastore
    //   63: invokestatic AegisGuard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: getstatic com/github/retrooper/packetevents/protocol/player/ClientVersion.UNKNOWN : Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   76: iload_3
    //   77: ifne -> 120
    //   80: if_acmpeq -> 137
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: aload_0
    //   91: iconst_0
    //   92: anewarray java/lang/Object
    //   95: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   98: iconst_1
    //   99: anewarray java/lang/Object
    //   102: dup_x1
    //   103: swap
    //   104: iconst_0
    //   105: swap
    //   106: aastore
    //   107: invokestatic AegisGuard_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   110: getstatic com/github/retrooper/packetevents/protocol/player/ClientVersion.V_1_9 : Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: invokevirtual isNewerThanOrEquals : (Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;)Z
    //   123: iload_3
    //   124: ifne -> 138
    //   127: ifeq -> 141
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   136: athrow
    //   137: iconst_1
    //   138: goto -> 142
    //   141: iconst_0
    //   142: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   145: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #299	-> 12
    //   #300	-> 91
    //   #299	-> 142
    // Exception table:
    //   from	to	target	type
    //   12	39	42	java/lang/RuntimeException
    //   36	66	69	java/lang/RuntimeException
    //   73	83	86	java/lang/RuntimeException
    //   80	113	116	java/lang/RuntimeException
    //   120	130	133	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$127(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x3A79248AAFCL;
    int i = AegisGuard_A();
    try {
      if (i == 0) {
        try {
          if (!paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_CL(new Object[0])) {
            try {
              if (i == 0)
                try {
                  if (paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_v1(new Object[0]) < 65);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_CL(new Object[0]));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$128(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_CC(new Object[0]));
  }
  
  private static Boolean lambda$static$129(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x4823F5AE0A7BL;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_s(new Object[0]).AegisGuard_N(new Object[0]) < AegisGuard_b0.AegisGuard_Gv));
  }
  
  private static Boolean lambda$static$130(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_o(new Object[0]));
  }
  
  private static Boolean lambda$static$131(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_O(new Object[0]));
  }
  
  private static Boolean lambda$static$132(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_x(new Object[0]));
  }
  
  private static Boolean lambda$static$133(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x1D03886C36B1L;
    int i = AegisGuard_A();
    try {
      if (i == 0) {
        try {
          if (!paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_C1(new Object[0])) {
            try {
              if (i == 0)
                try {
                  if (paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_E(new Object[0]) < 60);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return Boolean.valueOf(false);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_C1(new Object[0]));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Boolean lambda$static$134(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 48186490433792
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_A : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic AegisGuard_Q : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifne -> 55
    //   23: ifeq -> 82
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual AegisGuard_A : ([Ljava/lang/Object;)I
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iload_3
    //   56: ifne -> 79
    //   59: bipush #30
    //   61: if_icmpge -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: goto -> 83
    //   82: iconst_0
    //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #316	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	48	51	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   59	72	75	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$135(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 26633359047106
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iconst_0
    //   14: anewarray java/lang/Object
    //   17: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   20: iconst_0
    //   21: anewarray java/lang/Object
    //   24: invokevirtual AegisGuard_i : ([Ljava/lang/Object;)Z
    //   27: iload_3
    //   28: ifeq -> 78
    //   31: ifne -> 77
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: aload_0
    //   42: iconst_0
    //   43: anewarray java/lang/Object
    //   46: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual AegisGuard_C0 : ([Ljava/lang/Object;)Z
    //   56: iload_3
    //   57: ifeq -> 78
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: ifeq -> 81
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: iconst_1
    //   78: goto -> 82
    //   81: iconst_0
    //   82: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   85: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #318	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	34	37	java/lang/RuntimeException
    //   31	60	63	java/lang/RuntimeException
    //   41	70	73	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$136(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x3A29F34C4FA3L;
    int i = AegisGuard_A();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_vy(new Object[0]) < 25));
  }
  
  private static Boolean lambda$static$137(AegisGuard_hu paramAegisGuard_hu) {
    return Boolean.valueOf(paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_K(new Object[0]));
  }
  
  private static Boolean lambda$static$138(AegisGuard_hu paramAegisGuard_hu) {
    long l = a ^ 0x4C62620DD40CL;
    int i = AegisGuard_Q();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((paramAegisGuard_hu.AegisGuard_x(new Object[0]).AegisGuard_V(new Object[0]) < 20));
  }
  
  private static Boolean lambda$static$139(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 110799618705829
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: iload_3
    //   14: ifeq -> 47
    //   17: iconst_0
    //   18: anewarray java/lang/Object
    //   21: invokevirtual AegisGuard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   24: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   29: ifnonnull -> 77
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   38: athrow
    //   39: aload_0
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: iconst_0
    //   48: anewarray java/lang/Object
    //   51: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   54: iconst_0
    //   55: anewarray java/lang/Object
    //   58: invokevirtual AegisGuard_t : ([Ljava/lang/Object;)I
    //   61: iload_3
    //   62: ifeq -> 85
    //   65: bipush #25
    //   67: if_icmpge -> 88
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: iconst_1
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: goto -> 89
    //   88: iconst_0
    //   89: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   92: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #326	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	32	35	java/lang/RuntimeException
    //   17	40	43	java/lang/RuntimeException
    //   47	70	73	java/lang/RuntimeException
    //   65	78	81	java/lang/RuntimeException
  }
  
  private static Boolean lambda$static$140(AegisGuard_hu paramAegisGuard_hu) {
    // Byte code:
    //   0: getstatic me/frep/AegisGuard/spigot/AegisGuard_h3.a : J
    //   3: ldc2_w 85863689130321
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic AegisGuard_Q : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: anewarray java/lang/Object
    //   16: invokestatic AegisGuard_h : ([Ljava/lang/Object;)Z
    //   19: iload_3
    //   20: ifeq -> 102
    //   23: ifeq -> 85
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   41: iconst_0
    //   42: anewarray java/lang/Object
    //   45: invokevirtual AegisGuard_z : ([Ljava/lang/Object;)D
    //   48: ldc2_w -70.0
    //   51: dcmpg
    //   52: iload_3
    //   53: ifeq -> 82
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: ifge -> 81
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: iconst_1
    //   74: goto -> 121
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: iconst_0
    //   82: goto -> 121
    //   85: aload_0
    //   86: iconst_0
    //   87: anewarray java/lang/Object
    //   90: invokevirtual AegisGuard_x : ([Ljava/lang/Object;)Lme/frep/AegisGuard/spigot/AegisGuard_Ke;
    //   93: iconst_0
    //   94: anewarray java/lang/Object
    //   97: invokevirtual AegisGuard_z : ([Ljava/lang/Object;)D
    //   100: dconst_0
    //   101: dcmpg
    //   102: iload_3
    //   103: ifeq -> 117
    //   106: ifge -> 120
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: iconst_1
    //   117: goto -> 121
    //   120: iconst_0
    //   121: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   124: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #328	-> 12
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   23	56	59	java/lang/RuntimeException
    //   33	66	69	java/lang/RuntimeException
    //   63	77	77	java/lang/RuntimeException
    //   102	109	112	java/lang/RuntimeException
  }
  
  public Function AegisGuard_V() {
    return this.AegisGuard_n;
  }
  
  AegisGuard_h3(Function paramFunction) {
    this.AegisGuard_n = paramFunction;
  }
  
  public static void AegisGuard_z(int paramInt) {
    AegisGuard_l = paramInt;
  }
  
  public static int AegisGuard_A() {
    return AegisGuard_l;
  }
  
  public static int AegisGuard_Q() {
    int i = AegisGuard_A();
    try {
      if (i == 0)
        return 95; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
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
