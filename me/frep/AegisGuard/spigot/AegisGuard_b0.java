package me.frep.aegisguard.spigot.AegisGuard_b0;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_KV;
import me.frep.aegisguard.spigot.aegisguard_V;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.Bukkit;
import org.bukkit.Color;

public final class aegisguard_b0 {
  public static final Map aegisguard_f;
  
  public static final Map aegisguard_L9;
  
  public static final Map aegisguard_dS;
  
  public static final Map aegisguard_dW;
  
  public static final Map aegisguard_Lz;
  
  public static final Map aegisguard_Le;
  
  public static final Map aegisguard_Q;
  
  public static final Map aegisguard_y8;
  
  public static final Map aegisguard_Lg;
  
  public static final Map aegisguard_MB;
  
  public static final Map aegisguard_yp;
  
  public static final Map aegisguard_X;
  
  public static final Map aegisguard_LN;
  
  public static final Map aegisguard_yG;
  
  public static final Map aegisguard_LJ;
  
  public static final Map aegisguard_dH;
  
  public static final Map aegisguard_MF;
  
  public static final Map aegisguard_Gf;
  
  public static final Map aegisguard_dr;
  
  public static final Map aegisguard_yc;
  
  public static final Map aegisguard_M8;
  
  public static final Map aegisguard_LF;
  
  public static String aegisguard_L;
  
  public static String aegisguard_MR;
  
  public static String aegisguard_dp;
  
  public static String aegisguard_y7;
  
  public static String aegisguard_Mc;
  
  public static String aegisguard_Mh;
  
  public static String aegisguard_Gd;
  
  public static String aegisguard_Lf;
  
  public static String aegisguard_N;
  
  public static String aegisguard_ya;
  
  public static String aegisguard_G9;
  
  public static String aegisguard_Ga;
  
  public static String aegisguard_Gn;
  
  public static String aegisguard_yv;
  
  public static String aegisguard_MI;
  
  public static String aegisguard_dg;
  
  public static String aegisguard_Mq;
  
  public static String aegisguard_M2;
  
  public static String aegisguard_yk;
  
  public static String aegisguard_LU;
  
  public static String aegisguard_dP;
  
  public static String aegisguard_M6;
  
  public static String aegisguard_d8;
  
  public static String aegisguard_dC;
  
  public static String aegisguard_dB;
  
  public static String aegisguard_yW;
  
  public static String aegisguard_G0;
  
  public static String aegisguard_K;
  
  public static String aegisguard_g;
  
  public static String aegisguard_LC;
  
  public static String aegisguard_d5;
  
  public static String aegisguard_I;
  
  public static String aegisguard_y4;
  
  public static String aegisguard_yy;
  
  public static String aegisguard_GV;
  
  public static String aegisguard_m;
  
  public static String aegisguard_M9;
  
  public static String aegisguard_di;
  
  public static String aegisguard_dq;
  
  public static String aegisguard_LW;
  
  public static String aegisguard_yJ;
  
  public static String aegisguard_y0;
  
  public static String aegisguard_LX;
  
  public static String aegisguard_GL;
  
  public static String aegisguard_dy;
  
  public static String aegisguard_y2;
  
  public static String aegisguard_yZ;
  
  public static String aegisguard_MH;
  
  public static String aegisguard_Gj;
  
  public static String aegisguard_GZ;
  
  public static String aegisguard_d7;
  
  public static String aegisguard_GC;
  
  public static String aegisguard_Y;
  
  public static String aegisguard_yw;
  
  public static String aegisguard_db;
  
  public static String aegisguard_yX;
  
  public static String aegisguard_Li;
  
  public static String aegisguard_G4;
  
  public static String aegisguard_r;
  
  public static String aegisguard_U;
  
  public static String aegisguard_MW;
  
  public static String aegisguard_dA;
  
  public static String aegisguard_F;
  
  public static String aegisguard_df;
  
  public static String aegisguard_P;
  
  public static String aegisguard_Ll;
  
  public static String aegisguard_GE;
  
  public static String aegisguard_O;
  
  public static String aegisguard_LQ;
  
  public static String aegisguard_dN;
  
  public static String aegisguard_j;
  
  public static String aegisguard_ML;
  
  public static String aegisguard_GN;
  
  public static String aegisguard_Lk;
  
  public static String aegisguard_dj;
  
  public static String aegisguard_d2;
  
  public static String aegisguard_Mm;
  
  public static String aegisguard_Ld;
  
  public static String aegisguard_LA;
  
  public static String aegisguard_yF;
  
  public static String aegisguard_MS;
  
  public static String aegisguard_Mz;
  
  public static String aegisguard_Mj;
  
  public static String aegisguard_G6;
  
  public static String aegisguard_h;
  
  public static String aegisguard_M0;
  
  public static String aegisguard_dc;
  
  public static String aegisguard_yD;
  
  public static String aegisguard_dE;
  
  public static String aegisguard_dY;
  
  public static String aegisguard_L6;
  
  public static String aegisguard_de;
  
  public static String aegisguard_dt;
  
  public static String aegisguard_L5;
  
  public static String aegisguard_Mp;
  
  public static String aegisguard_Lt;
  
  public static String aegisguard_dv;
  
  public static String aegisguard_GT;
  
  public static String aegisguard_Lu;
  
  public static String aegisguard_MU;
  
  public static String aegisguard_M7;
  
  public static String aegisguard_MT;
  
  public static String aegisguard_dL;
  
  public static String aegisguard_Go;
  
  public static String aegisguard_yP;
  
  public static String aegisguard_dR;
  
  public static String aegisguard_yb;
  
  public static String aegisguard_GH;
  
  public static String aegisguard_yM;
  
  public static String aegisguard_MP;
  
  public static String aegisguard_Ls;
  
  public static String aegisguard_GD;
  
  public static String aegisguard_LY;
  
  public static String aegisguard_Gl;
  
  public static String aegisguard_La;
  
  public static String aegisguard_dz;
  
  public static String aegisguard_Gr;
  
  public static String aegisguard_L4;
  
  public static String aegisguard_dD;
  
  public static String aegisguard_Mw;
  
  public static String aegisguard_Lm;
  
  public static String aegisguard_LV;
  
  public static String aegisguard_MV;
  
  public static String aegisguard_Gt;
  
  public static String aegisguard_A;
  
  public static String aegisguard_o;
  
  public static String aegisguard_GW;
  
  public static String aegisguard_yI;
  
  public static String aegisguard_v;
  
  public static String aegisguard_dT;
  
  public static String aegisguard_d1;
  
  public static String aegisguard_dU;
  
  public static String aegisguard_LD;
  
  public static String aegisguard_GF;
  
  public static String aegisguard_Mi;
  
  public static String aegisguard_GS;
  
  public static String aegisguard_Gh;
  
  public static String aegisguard_G5;
  
  public static String aegisguard_yh;
  
  public static String aegisguard_q;
  
  public static String aegisguard_dk;
  
  public static String aegisguard_MY;
  
  public static String aegisguard_dQ;
  
  public static String aegisguard_yi;
  
  public static String aegisguard_x;
  
  public static String aegisguard_yq;
  
  public static String aegisguard_y_;
  
  public static String aegisguard_Mt;
  
  public static String aegisguard_GP;
  
  public static String aegisguard_GA;
  
  public static String aegisguard_yj;
  
  public static long aegisguard_H;
  
  public static long aegisguard_Lv;
  
  public static long aegisguard_Lo;
  
  public static long aegisguard_Lx;
  
  public static long aegisguard_ys;
  
  public static boolean aegisguard_dV;
  
  public static boolean aegisguard_Lp;
  
  public static boolean aegisguard_GU;
  
  public static boolean aegisguard_GK;
  
  public static boolean aegisguard_Md;
  
  public static boolean aegisguard_Lq;
  
  public static boolean aegisguard_Lh;
  
  public static boolean aegisguard_T;
  
  public static boolean aegisguard_i;
  
  public static boolean aegisguard_yR;
  
  public static boolean aegisguard_Gb;
  
  public static boolean aegisguard_MZ;
  
  public static boolean aegisguard_Mx;
  
  public static boolean aegisguard_u;
  
  public static boolean aegisguard_z;
  
  public static boolean aegisguard_dl;
  
  public static boolean aegisguard_Lr;
  
  public static boolean aegisguard_MQ;
  
  public static boolean aegisguard_L_;
  
  public static boolean aegisguard_yx;
  
  public static boolean aegisguard_GO;
  
  public static boolean aegisguard_MX;
  
  public static boolean aegisguard_yf;
  
  public static boolean aegisguard_dJ;
  
  public static boolean aegisguard_C;
  
  public static boolean aegisguard_LG;
  
  public static boolean aegisguard_d0;
  
  public static boolean aegisguard_GQ;
  
  public static boolean aegisguard_Me;
  
  public static boolean aegisguard_yA;
  
  public static boolean aegisguard_Gs;
  
  public static boolean aegisguard_yV;
  
  public static boolean aegisguard_L8;
  
  public static boolean aegisguard_G;
  
  public static boolean aegisguard_Gu;
  
  public static boolean aegisguard_d4;
  
  public static boolean aegisguard_Z;
  
  public static boolean aegisguard_LM;
  
  public static boolean aegisguard_yE;
  
  public static boolean aegisguard_Mf;
  
  public static boolean aegisguard_yu;
  
  public static boolean aegisguard_Gp;
  
  public static boolean aegisguard_dZ;
  
  public static boolean aegisguard_LO;
  
  public static boolean aegisguard_ds;
  
  public static boolean aegisguard_Gm;
  
  public static boolean aegisguard_LT;
  
  public static boolean aegisguard_My;
  
  public static boolean aegisguard_M1;
  
  public static boolean aegisguard_LB;
  
  public static boolean aegisguard_G3;
  
  public static boolean aegisguard_yC;
  
  public static boolean aegisguard_LE;
  
  public static boolean aegisguard_LL;
  
  public static boolean aegisguard_dm;
  
  public static boolean aegisguard_y3;
  
  public static boolean aegisguard_Ma;
  
  public static boolean aegisguard_MM;
  
  public static boolean aegisguard_da;
  
  public static boolean aegisguard_dn;
  
  public static boolean aegisguard_yl;
  
  public static boolean aegisguard_LR;
  
  public static boolean aegisguard_W;
  
  public static boolean aegisguard_yS;
  
  public static boolean aegisguard_G8;
  
  public static boolean aegisguard_l;
  
  public static boolean aegisguard_M_;
  
  public static boolean aegisguard_e;
  
  public static boolean aegisguard_GB;
  
  public static boolean aegisguard_Mk;
  
  public static boolean aegisguard_n;
  
  public static boolean aegisguard_Mn;
  
  public static boolean aegisguard_L2;
  
  public static boolean aegisguard_p;
  
  public static boolean aegisguard_Mb;
  
  public static boolean aegisguard_t;
  
  public static boolean aegisguard_Gi;
  
  public static boolean aegisguard_yt;
  
  public static boolean aegisguard_L7;
  
  public static boolean aegisguard_MA;
  
  public static boolean aegisguard_dw;
  
  public static boolean aegisguard_Mu;
  
  public static boolean aegisguard_D;
  
  public static boolean aegisguard_MG;
  
  public static boolean aegisguard_GX;
  
  public static boolean aegisguard_GR;
  
  public static List aegisguard_G_;
  
  public static List aegisguard_d9;
  
  public static List aegisguard_c;
  
  public static List aegisguard_Gc;
  
  public static List aegisguard_dO;
  
  public static List aegisguard_dh;
  
  public static List aegisguard_MC;
  
  public static List aegisguard_Ms;
  
  public static List aegisguard_L3;
  
  public static List aegisguard_GG;
  
  public static List aegisguard_LK;
  
  public static List aegisguard_GM;
  
  public static List aegisguard_do;
  
  public static List aegisguard_Ml;
  
  public static List aegisguard_d_;
  
  public static List aegisguard_G2;
  
  public static List aegisguard_L0;
  
  public static List aegisguard_G1;
  
  public static List aegisguard_d3;
  
  public static List aegisguard_s;
  
  public static List aegisguard_Gw;
  
  public static List aegisguard_Mg;
  
  public static List aegisguard_dI;
  
  public static int aegisguard_R;
  
  public static int aegisguard_yU;
  
  public static int aegisguard_S;
  
  public static int aegisguard_k;
  
  public static int aegisguard_J;
  
  public static int aegisguard_Lc;
  
  public static int aegisguard_LH;
  
  public static int aegisguard_LZ;
  
  public static int aegisguard__;
  
  public static int aegisguard_Gv;
  
  public static int aegisguard_M;
  
  public static int aegisguard_GJ;
  
  public static int aegisguard_M5;
  
  public static int aegisguard_yg;
  
  public static int aegisguard_Mr;
  
  public static int aegisguard_dd;
  
  public static int aegisguard_Lw;
  
  public static int aegisguard_dM;
  
  public static int aegisguard_ME;
  
  public static int aegisguard_dG;
  
  public static int aegisguard_E;
  
  public static int aegisguard_dF;
  
  public static int aegisguard_Ly;
  
  public static int aegisguard_d6;
  
  public static int aegisguard_dK;
  
  public static int aegisguard_yn;
  
  public static int aegisguard_GY;
  
  public static int aegisguard_y9;
  
  public static int aegisguard_M3;
  
  public static int aegisguard_Lj;
  
  public static int aegisguard_Mv;
  
  public static int aegisguard_yQ;
  
  public static int aegisguard_Mo;
  
  public static int aegisguard_y;
  
  public static int aegisguard_GI;
  
  public static int aegisguard_LS;
  
  public static int aegisguard_Lb;
  
  public static int aegisguard_LP;
  
  public static int aegisguard_MD;
  
  public static int aegisguard_a;
  
  public static int aegisguard_M4;
  
  public static int aegisguard_yN;
  
  public static int aegisguard_yK;
  
  public static int aegisguard_dx;
  
  public static int aegisguard_du;
  
  public static int aegisguard_Gz;
  
  public static double aegisguard_B;
  
  public static double aegisguard_b;
  
  public static double aegisguard_MN;
  
  public static double aegisguard_MO;
  
  public static double aegisguard_yY;
  
  public static double aegisguard_Ge;
  
  public static double aegisguard_G7;
  
  public static double aegisguard_yd;
  
  public static double aegisguard_yr;
  
  public static double aegisguard_Gg;
  
  public static double aegisguard_MK;
  
  public static double aegisguard_Ln;
  
  public static double aegisguard_V;
  
  public static double aegisguard_w;
  
  public static double aegisguard_d;
  
  public static double aegisguard_yL;
  
  public static double aegisguard_Gx;
  
  public static double aegisguard_Gq;
  
  public static double aegisguard_yO;
  
  public static double aegisguard_L1;
  
  public static double aegisguard_dX;
  
  private static final String aegisguard_LI;
  
  private static aegisguard_V aegisguard_Gy;
  
  private static File aegisguard_Gk;
  
  private static String[] aegisguard_MJ;
  
  private aegisguard_b0() {
    throw new UnsupportedOperationException(b[220]);
  }
  
  private static final long a = aegisguard_e.a(8763028749107061319L, -71130938678591549L, MethodHandles.lookup().lookupClass()).a(231531385527875L);
  
  private static final String[] b;
  
  static {
    long l = a ^ 0x396030109771L;
    aegisguard__(null);
    byte b1;
    for ((new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
      b1++;
    } 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[347];
    boolean bool = false;
    String str;
    int i = (str = "&0ÌKer\016½°\fh\020\b\0240ZÖ«8Ms§óËQÛ\\/Ê±\tey¢\021ÖlÜ6 ´èâTÈØÍ»ºôIÖBúË\t\006B²\016\000²{¿ÖLý\016|ì8DBÜdä\005±7¤(îìb\0059S#+Øm.`õí\n­@L>ã¶Oc°Ú\nä\036¯Dï6\020¯ñ'®\030iD¦ìT\024;[µy\021¾W\f\017Fp¢_å ülðÿùÙÍü_3\fåWÕú|Z¼\025ÖHhôÊË\030®è<=ëÇPKs\017sÐo]ÒQ½m§¡øî\bt\036{XW\\(\016ßäGb<\027K3XÑåH»Üs5Ëèt°\023\004 \036ÚV5MAÜ¨cÛó°Ø \016ßäGb<\027K3XÑåH»b\026«\034§ò¢aÂ}\022ÂÄÇßÎ \036\006=Ü!\bÕ\bpÿkÂ$³(POêL*µû¿õ\032Á>¿\030\016ßäGb<\027¶@È­\rÛÃ°ÂÆ\017rÃ(\016ßäGb<\027K3XÑåH»Åært\002ïI¢@Ú\njâ[\035\024\030l¼(&0ÌKer\016½7öávÆfF fõýùÂ\tÚX\026¶\004P\005\017ê\031oC \016ßäGb<\027Òa 1=$½\007?¾È=H;*\006ÌKË©bòÅ\030}dIyKù· \035ËÖ$.¼º¼iC@x¦%ß(&0ÌKer\016½°\fh\020\b\0240Z\001\026ñ:E²½0ÑRæ¿I!E=]xtoË0\023WÙE-#âTíÉËxwh±\f\024ÓñÛTÒQzö%l/ë¢=AÓ5\b\005Rwuíï0\033ùsj&pE£5x=(X$3e~\fOGØ®YþG½¢R\n~Òi IåoHgWï\002Rÿ \036\006=Ü!\bÕ\bpÿkÂ$³ûs7xc#<³Èî:+­@ \016ßäGb<\027¨êlG\t .B\001¹@\"ÉÄ,µõYQ¹ùø(\023WÙE-#âTíÉËxwh±\f\024ÓñÛTì%\030\034ô=õÏ+\tï ®è<=ëÇPKz5dlÆå9m3\024ïúåLÉR3Ô\003i) ülðÿùÙÍü_3\fZZ;áà.Lh}\r#¤NÙ\030\016ßäGb<\027ÙÁwæò~\035ÄÍÍ]|O,c(\033ùsj&pE£5x=(X$3e\025ëQç\022!òfÉM¨;ô\004Ê\032Ð{[\\\027Í ûU\003õ[C=Bgk2,¸!Áµ\036µ/]ö®\036\002ü5\023ú£á0\023WÙE-#âTíÉËxw>K\002ïfo8¶T»8`Âü,è]¸>Øª\031Bpá¿\036((ÒÓÛq0vÌ\021{G\033±ÕQ\030!ïÍÍÓ'·û\027\nü8âÅ]Á(\016ßäGb<\027¤\034-\036m÷\026\023\034di\007­ÐÜ_\001úÈå\006W\002¦0?z¾ur0\033ùsj&pE£5x=(X$3elÏ\022_ð¢8ç\003b¬\002Ý£îÍr©*U°³ï¯õîPÞ(&0ÌKer\016½7xE0¾aÙo¦ó\004¤u\"\\û(Ï Ç\026ÞÍ¡Òí\030ÙêÛz\002ÔA/î';§ÕÚØ@ò'9½¤6_((ÒÓÛq0vÌ\021{G\033±GúãàäÑ8ÑþÚ{T}Çô\036\002l:1Å \016ßäGb<\027}çü(Q©àeÚì­\032¸)\000nù¦©\003XM &0ÌKer\016½}è1öÉ¬\007§UÁàXß.¬k¤½\020/f¥o \016ßäGb<\027@CºYïj\002½.3+SÂ~Á!â¨újS¢ ´èâTÈØÍ»ºôIÖBúË\t\ru\007ÿGÅ\000USQMúý0\023WÙE-#âTíÉËxw\026´U\021öGVÕ£þV\017PØ¦\025(hÊ±\024\032¿.ðÆçA\030\016ßäGb<\027»Þ\tXþ:~àjp4\022\020cx(®è<=ëÇPKâ°9½|ãfÈ_ýø\033¸\030\0242H^ÕËáÝLH\\>\034(\023WÙE-#âTíÉËxwh±\f\024ÓñÛTì%\030\034ô=D·RÍ\001\002K=(®è<=ëÇPKâ°9½|ãfÈ$CÜWªÿàèü!Æ'?DÑE]eËT^\030\016ßäGb<\027!Ssú¡â]\bÅÏnm+Y0(ÒÓÛq0vÌ\021{G\033±xRy£åz^Ú&\037ò#Õ·D\031¾Þ\037yraÒ\b ®è<=ëÇPKBCda.Lÿ\023\036\fÂ7õ(c~\022\030\t¢(¹dä\027ÛOï7\\ìþóQ'Ê4:q&ªVYÔÉ\026ÓÔB|&X[ö\037\020:\002\030\016ßäGb<\027Föq8»©BoÙn$9bà\030\023*7±G¨71\\£;7\007zh®Gu«K¥þ \023WÙE-#âTíÉËxw/×^ßÐ\007¸]m ©À4Xô0{odÝ\016ñÚ3wÇSÊòMtüb\021Îä\036\023\t¼ª;©Õ%x]¸ð²´Ó\031²£'Ê:\030®è<=ëÇPK\033\016íQÃáÜ.M\035W(\023WÙE-#âTíÉËxwh±\f\024ÓñÛTð#PÝUó}%\nÒÜÐ\000ò¿(\016ßäGb<\027\025Nu-ÕqLTªØY¸ÉÊ]:§2 5f#Õ(\023WÙE-#âTíÉËxwh±\f\024ÓñÛT§}k4\026@¤tê\023ãvô£\030\016ßäGb<\027\020ü¼NÎäÏ,FM<éÉl(é»q]Ýô#&F\rÜÑèÊý²d­``EÍ^,if)ï£¢½\013h-@E \023WÙE-#âTíÉËxw~·ñ9@!×¡7a¢Û\030\016ßäGb<\027ÕÕD½§\023%w4Ö\\,Àö0\016ßäGb<\027²x¹ïÇ#ÊÖÿ¾q\fK\0227·õ±¹Ï6¤X^ÐÆeÚ\004{&\013åù\001((ÒÓÛq0vÌ\021{G\033±Gúãàä\000©xb +:à\001ùTÞô\0300\023WÙE-#âTíÉËxwh±\f\024ÓñÛT\bÃ\021Ñ\036#\r#\fy\031²$.k^\006MÀp ülðÿùÙÍü_3\f?e:ä¾­a¦èíQzúAW \036\006=Ü!\bÕ\bpÿkÂ$³zæ^\005Òp\016\021 X\000³Ý(®è<=ëÇPKBCda.LiÓ»×#Ñ;lnà^)çIof¯å?©\030}dIyKù· -÷\016%8]*Æaô£W\t0((ÒÓÛq0vÌ\021{G\033±td+?Ñø:ñvc2\000+Wevé¾*xe° \016ßäGb<\027¨êlG\t .V Û\f?¾YV-uëá}0\016ßäGb<\027nN\033m?\021\022'äì\r\0169ç\rki¯(\007±=¼ÄSØS{0X1K_È(¹dä\027ÛOï9²Þ2\004W©$(\"Câªo\000ô\035¡ÚwbÂC¥H5¯U\013@(}dIyKù· y½'ÃMh¥Ò©¥n\b,÷s<\017ì×\033\":?àwØ8\033ùsj&pE£5x=(X$3ePÏ¡å¥8½A3ß)ª!ÔSùRC:\017@\023jì¡N¶];ïu(\016ßäGb<\027LËÊo\021äý¾å%G9Ëå´\020\rúðí³sÝøñuµº ®è<=ëÇPKBCda.Lïßl0î½å5~`»\026Êi\006 ®è<=ëÇPKBCda.LJ5Ð²f`°\025\026\013&^mÄ8{odÝ\016ñÚ3wÇSÊòMtüb\021Îä\036c|âÉ\020§³gÐÑ\016ãÖ¼çÐÈM­µäk\00352Yö\003¯ï ®è<=ëÇPKÐ2:g|s§¬ú\027(Òò\021 ,î\003\tò\005#A(\016ßäGb<\027\025Nu-ÕqLÁ½~»\017L%nÙ³\013@=\006\bÊMk5¾\020|\026\026àM T©\032!_øã\033-\030µ²¾8Iq@¼IËïî¹,n®p1m\004\rb ülðÿùÙÍü_3\fåWÕú|Zye¦­w({ \016ßäGb<\027Dzêji\020ÉQ\005·Ä©KÒeHÁ±¸ð8®è<=ëÇPKBCda.L¹\016x_\"x00\035O\017=\027ê=ö1»C\002µujîeâ\034¨ôø­-ëñ\030|&ApdÂ\030©é@ôç£åOèø\021¢\f8¹dä\027ÛOï¾ùÿÊ[{°\022<W·Á.s¬ñâÎ4`æ#åùùÔµ\025ü¨Pÿ(\\¶¦[\021ê\\\f((ÒÓÛq0vÌ\021{G\033±ÕQ\030!ïÍÕ3Hñbú/Äî\006Ñê\0353Ô\\(\023*7±G¨7¿5ÿücÖï/Ïú¦\025ÿ\013KÍ3¤-;MË¶\037Y\005AqB(\036\006=Ü!\bÕ\bpÿkÂ$³\002ÆèÅoX?* ýÑD#\035\020|+/Ñ± Ñ½(¹dä\027ÛOïµËd­i\037%ðÛþ¢,ÆêdTà·àB}c@jeÀôØ(¹dä\027ÛOï9²Þ2\004W©$¯ÞþWÄþøwqw-º\037¶\ryKÂJ\030\016ßäGb<\027K3XÑåH»?©*³\032¿Y¨\020\016ßäGb<\027\005ê§\003Ï(¸8¹dä\027ÛOï¾ùÿÊ[{°\022<W·Á./\tX\007AÉÅ\n\fÁ±âC]@Còì£9ÇIÑZñ#(\023WÙE-#âTíÉËxw¨ªÙÕÍ'ö»\032\027Ø\004~&²JZØÿÉ!²?Ú \016ßäGb<\027²x¹ïÇ;*Ð\023tá_©¤¡B\fq\030®è<=ëÇPKô/ÈåGõ\013´g«ZÐå ®è<=ëÇPK©'AÁí,×\022/æX*×ôã0e¾`[(¹dä\027ÛOïá¿çÊ§Aà>ë}ddTz¯*©2Ñ©\002Ö\"[\002L ÙêÛz\002ÔA/fo8 ËëÍ®Î=¤\022ZÞ#âAý2bv\020|&ApdÂ\030¼}´\025*gß(\036\006=Ü!\bÕ\bpÿkÂ$³'o8^N§v&6;j¥(Áëw7jZÅB((ÒÓÛq0vÌ\021{G\033±ÕQ\030!ïÍ?oÙ\016«¼Da1Yíx\0161\030iD¦ìT\024;\025¢4©I\b\004\nY@*Átä\001Â\030d\016g°Þ¤ÃK\032ÄÕU?«å?Ô*ÃÞ\030®è<=ëÇPKi×»ù·7Ã¦GÙ:Ï. \016ßäGb<\027LËÊo\021äýÐÔ\036J¸få³æð;r\031©0¹dä\027ÛOï¾ùÿÊ[{°\022<W·Á.\003ò©éÍØo\024ï¼bH3ZÅ\"µ²\002cps²?(&0ÌKer\016½7xE0¾abÚÚ\025R7ïnìÅJä\007ÝæD ¸\017X ûU\003õ[C=Bgk2,¸!Áµ\036µ/]ö®\036\002ü5\023ú£á\030\023*7±G¨7N\0353¥Å÷³eùÓ\021¸­à\024 ¹dä\027ÛOïá¿çÊ§A\t¡Ì¡þöÿµé¶\b\026;3(¹dä\027ÛOï7\\ìþóQ'Ê4:q&ªVYÔßÜëä\005²:Å¤\026Ä>Qîät0\023WÙE-#âTíÉËxwh±\f\024ÓñÛT¤T\rñZ¿z^:*zëmVR]aÍÇDNì0\023WÙE-#âTíÉËxwh±\f\024ÓñÛT¹°>ZçÓg\tqëÊ\032ýèWË²eè \016ßäGb<\0276Ä\ræRU­?NU\002tÈâØÕ²\022\brpu(¹dä\027ÛOïoè?¡\035ko¹µ L>Ù°Tq>eÉë\00424XþoVÌz\025(\023WÙE-#âTíÉËxwh±\f\024ÓñÛT\bÃ\021Ñ\036#\003ãE\026m¼\005 \030iD¦ìT\024;[µy\021¾Wµû#_NVX ülðÿùÙÍü_3\fä\007C+U\007\026µ.6éº¸(\016ßäGb<\027\025Nu-ÕqLdMÌ\024>YN°@\020S<*h²u\"\bj\017C \033ùsj&pE£5x=(X$3e´K²\\ø¼ys®øòÌþvÐê(\016ßäGb<\027Û\\]ãUV\005rÜ\033B¯;K\007=ßÉ¤(IE\026gÑ\026\f\030\016ßäGb<\027vô\016ÀzçÞÈò¥.g\020-(&0ÌKer\016½7xE0¾aÙo¦ó\004¤u©<uÐ®µ-¯©â\020I¤\030#0&0ÌKer\016½°\fh\020\b\0240Z`«s²ÉÔµSákqZÈ+N2.\030¡\005÷\007\b\023ÅqNaÎ\030éL³qgØy\016~\033ïÃ@\024ºçÜ\036&ÞÑ\bH ülðÿùÙÍü_3\f6%Cÿ»Å¼µê\023[FCÍQ\bºzfc/\021 \016ßäGb<\027\025Nu-ÕqL\037h\032\n\003QI¸\016U¶ÕÄ\037 \016ßäGb<\027¯\017aÒ0Ç%ëY¥Zkò&u-R»?\027³% \023WÙE-#âTíÉËxw>K\002ïfob%àeÓwÕ ®è<=ëÇPK\027LRúËmÛ«?Ì¤ó\"\"½\023¨{®»\005(\023WÙE-#âTíÉËxw~·ñ9@!8{\000À0kõ6^ú)Õ3\024= \016ßäGb<\027@CºYïj\002»w¼ú\030Þ;zÛurH( \023WÙE-#âTíÉËxwOg\r\031Æí\nø6ùºÉ1Î\017(\036\006=Ü!\bÕ\bpÿkÂ$³(POêL*E$î·ì\031\007aä§i¹¼ öö¥!<\031¡\024Ó8f\004oK\"mFU6wÏÿ~ê.OâD\030®è<=ëÇPKè@x\002|´êµ~èàÑ\005 ülðÿùÙÍü_3\fåWÕú|Z1\033ôõ\034x\030\023*7±G¨7|ûØáØ\036Ý\020¤Q\034Nì iD¦ìT\024;Jt z\026¥{¤¸\022±wïD÷Ýó¶\027çF5 ®è<=ëÇPKÕÈUì2@º«@\016Ç\0055[C\031¤Ú éx\0012Méôú+\t¾\031Ð0±\003\000\002ñ8LþëÔ0hp\032u\030öö¥!<\031¡\024Ó8f\004oö\027î7÷äm\030}dIyKù· º\tcmjP½\024ÿõ;t'lÌ \023WÙE-#âTíÉËxw¨ªÙÕÍ'ö»ý\fk2kè3 ülðÿùÙÍü_3\fõ:\016¨fÅõWÖ\001\017ð²ñ' \016ßäGb<\027lÌFãïß¤#¨¤_ÆýXî{\036\037\t \016ßäGb<\027\020ü¼NÎäÏ,¢Û<­¤ÿí'/ö¢ä\r ÙêÛz\002ÔA/fo8 Ëë×­Ø\031\022Ç&LYÚPM4÷ \023WÙE-#âTíÉËxw>K\002ïfoä\023\002\017âµ³g ülðÿùÙÍü_3\fåWÕú|Z·\rIùÑùÅ\017(\033ùsj&pE£5x=(X$3eá´À\025$ÝØ\rÂt\034[Ä¸´v\004)SPº× &0ÌKer\016½7xE0¾aäG¦Ðà;x\003dIz\030æ\\ \016ßäGb<\0271å[ØÓ?$_\032ÕµÈbAr0\023*7±G¨7¿5ÿücÖï/Ïú¦\025ÿ\013KÍ3¤-;MU` PBÈ©\"Uê0\022\024¤¼ |&ApdÂ\030ìXpQå/\031úÖ>h\"òôäcd\006×¯J\027(\023WÙE-#âTíÉËxwh±\f\024ÓñÛT³¸Wë¤ÍLùPl@cí© µ²¾8Iq@¼IËïî¹,ê¡Õ\034üÌ\013Ý\034%{\f>w(\023WÙE-#âTíÉËxwh±\f\024ÓñÛTóír\021LüH\022tÏYò ülðÿùÙÍü_3\f{PõÐÚo5Ñ_)o-úÐ\t\030ÙêÛz\002ÔA/Ë/7;V=Ùp\036\026c¸æ(®è<=ëÇPKÈ\017>GïÛ\030Uk|\020©-ñerÆ_Ðø,¹Ýäâ6B(&0ÌKer\016½°\fh\020\b\0240ZÖ«8Ms§óË\035¡»ò8÷Ip+M5­Ê \036\006=Ü!\bÕ\bpÿkÂ$³î\003i'<n2¹¥K{}Wu«¤\030®è<=ëÇPK\031â­Ï¦Y\017º£\025U ®è<=ëÇPK\033\016íQz4\037PÜ^¶\033Òê%\033?[ ülðÿùÙÍü_3\f¶\búY ']lÄ®\037è\"\026\"(\016ßäGb<\027K3XÑåH»\n6\031\nUÑ¡O\006%Ù\033Êã¥D?ÁþüÏ²(\016ßäGb<\027é4ËME#sròè:zç¼W%\blCT§ÅÚsÕ\030\016ßäGb<\027/Õ)KëÈ®\033ê6(&0ÌKer\016½°\fh\020\b\0240Z\017±i©í\037\024\037*Ö\016Ò\032\001Ä¿Z8»\004`\016 \016ßäGb<\027ã\017ì\rÄv%f§ïj<o±(³]½(´èâTÈØÍ»ª[Å\032'DÛ½ìlÿÇé»\017&ë=ÈE\035âáÿX#\"\035\027F((ÒÓÛq0vÌ\021{G\033±A\005º³¶æ\031¼¦\000$¼âàtPöðârh\030\036\006=Ü!\bÕ\bpÿkÂ$³.ü\0211Gî\004 \016ßäGb<\027¶@È­\rÛ-Î_ï  gÀ¹¶ùë\024i\020ÕúP0\036¾\024TÎ%8²S\037ö\030\016ßäGb<\0271å[ØcbhvÄà\016 \023WÙE-#âTíÉËxwh±\f\024ÓñÛT\007w\020q\017§ ¹dä\027ÛOïá¿çÊ§Aç>Ì¶Í|ëO\rÖÙ\021Wæ\020\016ßäGb<\0278\020cßÞéz ®è<=ëÇPK2\nGÆtÞã\037®'ð¹Ø\025\027 \022ÁIÈ$0\023WÙE-#âTíÉËxwh±\f\024ÓñÛT¨ì:ýÅðtÏ\002öÂ.÷ñ\013cö£Q4.UG0(ÒÓÛq0vÌ\021{G\033±ÓO4èM\b<\\÷lìÆÄ\t\0207þ®¾\006G¹n´z´\031ó\025Éá \023WÙE-#âTíÉËxw>K\002ïfo\034\034°`QQ(&0ÌKer\016½}è1öÉ¬\007\023`æÑôB\027n¿ÛqÁd½î_pDl\tN \016ßäGb<\027$ØÀIl$Ì\033þ«\000\003cEç\016¤d\027U1\000\0060(ÒÓÛq0vÌ\021{G\033±oîbX\004Ç'\003a/ËÈ8óå¤²®P¿\\ý×öÓ\035\0030¹dä\027ÛOï7\\ìþóQ'Êmáòa4ÞÝ\033u¿¢\nX±\035ÊdJà\027ì9\033×pTÎh\030d\016g°Þ¤ÃK´¬å}\001â}`¯·°\020|&ApdÂ\030õ\032\rm\001É\033 ülðÿùÙÍü_3\fZ\033\025|nD\033!D\016:\"§\016(\030\016ßäGb<\027\025Nu-ÕqL;¨©¿Ñ\013(\016ßäGb<\027\017 Ò+\003½\022\na£Â\025áHh£\017Ô]Éõ\007Z¾`\"2 ülðÿùÙÍü_3\f\027§Kgö]%ûý\037ÁùAï \016ßäGb<\027x0¶Ïá-Ûiß¯ú9µNq\bÎ^'ö¥b ®è<=ëÇPKFjúÑpþBúØkL²>ÚÅ×mM{á¼%((ÒÓÛq0vÌ\021{G\033±ÀlÓV`£ ]zÅ\nV=Ë/\032.Ð\017\0200\030\016ßäGb<\027÷\021%\017\016J\006ý¢èô-0¢Ø8 \023WÙE-#âTíÉËxw>K\002ïfoÿýëÁ\035J'0\023WÙE-#âTíÉËxw>K\002ïfo¤.u¡M\rI*a\024­Ë9\013Õ~ J{É\b+m\\àÑª hÄjZóg\035QxÍ~ywÝô{Õ\bÍ\024>©¸Á_³Í(|&ApdÂ\030pÞ\032­h#-±Äáñ\032÷j\023WË+\006waÇiY\f\031­(\023WÙE-#âTíÉËxwh±\f\024ÓñÛTì%\030\034ô=ÐCÙz*x9 \016ßäGb<\027!Ssú¡â]\035ðë#«×nNz÷2¢Ò²) \036\006=Ü!\bÕ\bpÿkÂ$³BlèaéßÇíX\004©ôq!0\016ßäGb<\027\005\\ªô\024Ï\026\026¯Wý ±+\013Xæzd[¥¬×Pi\005Ê\n·ÃT \016ßäGb<\027K3XÑåH»ù§èÐ°6-;Pë\005Îý¹Ä(\023WÙE-#âTíÉËxw~·ñ9@!1óÊ­ô²c7kÿ\030|&ApdÂ\030Çyrßr<qo1èå\rUÐ \016ßäGb<\027\036_BÎ®\000ýý%·ú_\027Âg*®½81(®è<=ëÇPKâ°9½|ãfÈ Ì/-¥µÐëm#\036¦¯\017\004J\001\001ÿW¬ÇB/(iD¦ìT\024;I½°Wü\020\rVFõû§çKfñpO\r$ù\005¡\bäH¦\023W;0´èâTÈØÍ»ª[Å\032'DÛ½ìlÿÇé»\017¸°aëJ=Ïy¼fF×].8]¢sXÿS8¹dä\027ÛOï¾ùÿÊ[{°\022<W·Á.VM£ØTM q\032Þ\023O\033£EHá }¶¤©\013\006i¹(\016ßäGb<\027u]¬öwN\tZÝI\016cMÈ\005¤ÿp\007»A_ÈA\nX\004(|&ApdÂ\030ËÇë\030¿\003Uè®i¦ø/ñ¾ò«£sÜúÍéù¬ôf¾M5\030®è<=ëÇPK-WþÉQ?z9ÎÞÛk\rÎ(\033ùsj&pE£5x=(X$3e~\fOGØ®Æ¥@£ºK2á\030ù Gìí8®èÊH\0057b\031ñ!ÄO¬×\020µmé|ßw@L\023ÙÕ\000@çCQ}ÎolYe\026\025\034\002Ðh¹@\nª \016ßäGb<\027Ic\\\005\025MÚX©;å^©è¸æ\024#2k9hû(´èâTÈØÍ»Üc%Q5\006Ï¼yÛªU1¨lÚ;V:ìrÁ\022Àê]1ÂÓ ®è<=ëÇPKA\030\037öê°×¼´Å¶ëcÝq\037&Ç¢ÅëJ(®è<=ëÇPKË\030-Q©1_0 ö§?á,²pD\007E\001Î­XäÎi*\n¨&é(\016ßäGb<\027@x¡4aÄ)\031^_\006¢9è²` ÐÂOéc§\fg»KØ \023WÙE-#âTíÉËxw¬Û{gDÑã+~M!6ö$(¹dä\027ÛOïnéÉ.döCªipFÍZ\020ð½irDb0-'\037^\021 \016ßäGb<\027m\035ÌiWX¬ÔJë¹u\t\023xo\n\023/nç0\023WÙE-#âTíÉËxwæüºÜc\032^h©¡ñú4«\017÷KR=Ék¬s\024¼Ë\024mÁ ¹dä\027ÛOïøÉÜ\bß­Á\013F»oìÏ¬¤ \016ßäGb<\027@x¡4aÄ)\031W\t¼vLP1küÛê¥\t\r/\020ÙêÛz\002ÔA/G\025Öëz\037W· \033ùsj&pE£5x=(X$3eá´À\025$ÝØ\r\002\021³L@,vü(&0ÌKer\016½}è1öÉ¬\007è½3\036Î­©Ë2±&¨ARÚ\f-Ñ\024®\020|&ApdÂ\030]È\037WF¯]M\030|&ApdÂ\030Í13/\036§6\023Û¡x\025Ì\026é\020ÕúP0\036¾\024TÎ%8²S\037ö ülðÿùÙÍü_3\fåWÕú|Zß\026qßF\n ®è<=ëÇPK£\007\026]h\037'KK\fP<¾«Brñ\007Ý8\023WÙE-#âTíÉËxwh±\f\024ÓñÛT¤T\rñZ¿z­nN\007õLb\036+¹\n\004í=¼Ê¦ü¤¦Ï \036\006=Ü!\bÕ\bpÿkÂ$³zæ^\005Òp\016iÀù²i=(\036\006=Ü!\bÕ\bpÿkÂ$³´\025êÒÃÖ\031ÞM |«Ùsá>D\f\004W\\0(ÒÓÛq0vÌ\021{G\033±Gúãàä1;/<¶;\bb@®® ¨²ÍduÜ¨%¦\023 &0ÌKer\016½}è1öÉ¬\007\031\0317\002ì\004\025sÎ\035æ¤0&0ÌKer\016½7öávÆfF %½ç®.ðGå®ûó\006\037ð\026x9Q\003öÄù\000\023A¢ô\020_wø½yèÍ¿<Æ$² ((\016ßäGb<\027QJáL¢\025¹Y\026aõNbÐ{÷ïëð½ýºÖë¦ÖÓfÎ0®è<=ëÇPKBCda.L¹\016x_\"x00\035O\017=\027ê=ö1»C\002µ¼¾[ÖÒ ®è<=ëÇPKÜNgYØö$íÄ7ï äY¿a¡«$K(\023WÙE-#âTíÉËxwõ!aO*Mú#¤î+4ÜjPEÇ2¼¾|w.8DBÜdä\005±7¤(îìb\0059S#+Øm.`õí\n­@L>ã¶Oc°Ú\nä\036¯Dï6\020¯ñ'® \016ßäGb<\027ÈmJª«-QsÓ%ÎØL÷×\026þ}7þÔ\030öö¥!<\031¡\024Ó8f\004oZ^ï\026ÿ&\020_wø½yèÍ¿<Æ$² (\030®è<=ëÇPKÆK^Ùs7\024$Ë½¯j²\033 ®è<=ëÇPKÊ#Ïg\037ªð#ú\016\0235aÐyÐ\030ôdë¡\002(\023WÙE-#âTíÉËxwæüºÜc\032^h©¡ñú4«\017½\tgÝS iD¦ìT\024;y}^ê£÷\025´ÊÖoÜ%kÏ\023Ýr*l7g80û;û\027\034\024®l&IG­ ~\033^V ¶¸NÔ§Fõ)¨àB{'¶ÔÍBE¦]W#:\016-9 iD¦ìT\024;\007ÞãÕí¤¯[+\031\"kuêX)&k'×ï ®è<=ëÇPK{Kv·`7áãv%)|üÊ¾ºÔ]ò>óB(\016ßäGb<\027Ç¹\005«\004ó$\030þAì³è,2gíP²L-¼mã\025÷\036qï \023WÙE-#âTíÉËxwOg\r\031Æí\n\020[Úø4ðZ ülðÿùÙÍü_3\fåWÕú|Z\rÏ\013\r\bcf hÄjZóg\035QxÍ~ywø17\0239wÅÎKZêÚT\f\0170®è<=ëÇPKBCda.LPS\023©øÞÖ_ÞG'\n³~5oQÓÍ6O\005çLÙÜ ®è<=ëÇPK¾â\036H\020ïþù+ßFÜ`Y\006ª©Ç÷\035(\023WÙE-#âTíÉËxwh±\f\024ÓñÛTä ×O\027\024EÆn_\0047/8\017T0{odÝ\016ñÚ3wÇSÊòMtüb\021Îä\036»_~Êöèñ\0226WíºâSëÂáK\027 \016ßäGb<\0278Í±\034×e\"\026µ­Ú`\nûÞn\007Á|P\001ÅÂK(\023WÙE-#âTíÉËxwãü_ái\035æ¯ÿIe0ûö\021Ø¤E\031Ñã(¹dä\027ÛOïá¿çÊ§A/(Êáð]mB;\013¬A\033\036Ä§ÇXØ¯ÙÉ\\(&0ÌKer\016½7öávÆfF ½R½ÿ6\024þ}ñ8\035Àm\033m¡î\030õ\031·\020®è<=ëÇPKÂý%\fØým5\030\016ßäGb<\027Û\\]ãUVâo&±üöñ\030|&ApdÂ\030ÇÌ@¸*<d&Ò¿î\030È((ÒÓÛq0vÌ\021{G\033±%ªùÕXùkÍn\007g¨ÆhS+LJ\nÒ(\016ßäGb<\027\025Nu-ÕqLåc£L\020hñé`£°\031kL»¶\007t= \016ßäGb<\027l\037Ay%s¹¾Tøëm®\013\024¨´j.½¦E8im\023/&§óo\fO<ZÈ$\bÆkj*Dr^\022\001Çâ÷6ÿ±¢\004;S\004Ì\"ÃzA-Á6}÷±\"+ {odÝ\016ñÚ3wÇSÊòMæøçÂ>Æ\tv\036>\001\b9u¹ ®è<=ëÇPKm\"0\r\016Ôz¬²çªCÅxhofVÓÐ¢qÇ \016ßäGb<\027nN\033m?þ¹\017ÊÈ~Ý°½í0\003 \016ßäGb<\027!ð\017ë\017½JCÛl=&ìÇ\0354ÓE{M\013\0370\016ßäGb<\027u]¬öwN\tZÝI\016cMÈ{\031-ì¨[á×0P¢Bä³ïç\026L¦Æbk«(´èâTÈØÍ»Üc%Q5\006Ï_\033¼íjJäodnýÐúÌdYq&o/\020 \016ßäGb<\027-¦\000JaPÇ(.N!\f`Õ0ÞîßHå²!(\016ßäGb<\027\025Nu-ÕqLº0Ú§;:x;géGµf2×\030WÕ[0\023*7±G¨7¿5ÿücÖï/Ïú¦\025ÿ\013KÍ3¤-;Mp¸æH´W\006Â\000¸¶wj\037 |&ApdÂ\030ËÇë\030¿\003Uè\034ÍÔüì§lÓÀWó.Gh£i ®è<=ëÇPKâ°9½|ãfÈ£æÖ@mýY \035µ¯³\\S \020\030£9¨¸6\003¾t*\025Ã® &0ÌKer\016½}è1öÉ¬\007Ã\033C0\030fð\001¹*\030\033 \016ßäGb<\027\025Nu-ÕqL\036VJ\r\béíq²À\020®î \016ßäGb<\027¸¤C:i:1¤ß\002\022øKg(WÉ\r¥\024;e ®è<=ëÇPKè:vÈ­_\\sâyÕ\n,¥óY\036~÷¦ ®è<=ëÇPKBCda.Lÿ\023\036\fÂ7õ(rEýG\020à¤÷ ®è<=ëÇPKâ°9½|ãfÈ£æÖ@mýY]\007L-e\bç+(\016ßäGb<\027xÊÃÛT\003§k\bÎEj\fÁÐ3L\032?V`Uxém2>\020®è<=ëÇPK[)Ãº!->ø(®è<=ëÇPK{Kv·`7áã»4\024éöø\016,Ç\f¤HA'¨ÉÑÜ \033ùsj&pE£5x=(X$3e¿È\004@\\ÒSìÓ±\021=\030eçî\020íZ¤´Ã^ô´<5\036\026½\037¬^ \016ßäGb<\027]C8}W¶*Û¡â\023´Ø,Ço[A²¿\025n ülðÿùÙÍü_3\fåWÕú|ZùÄ-oñ'(\036\006=Ü!\bÕ\bpÿkÂ$³0(:^ìÌD¿M\025ðá×:/ñéÀ¨Ge &0ÌKer\016½7öávÆfF $0¡!ñôhßÔó¿\025\035Ç8¹dä\027ÛOï¾ùÿÊ[{°\022<W·Á.\020±É^èþòÃ\b\034ìL­\022\035\016Åk¨e\001L÷\nØ«¤s¢ ®è<=ëÇPKJC\024ù\035\004õiÁGá\b%åéöK¯ &0ÌKer\016½7xE0¾aäG¦Ðà;xÅæ-\tgÌÂs80û;û\027\034\024®l&IG­ ~\033^V ¶¸NÔ§Fõ)¨àB{'¶ÔÍBE¦]W#:\016-9((ÒÓÛq0vÌ\021{G\033±]f\003ÞSm!t9²*B¯ÛJqâÜæçý(\023WÙE-#âTíÉËxwh±\f\024ÓñÛTÖ°~<42ÆË\b¢¤üf+)\030|&ApdÂ\030_ñ\005\\QÌGA\016½WÈv8¹dä\027ÛOï¾ùÿÊ[{°\022<W·Á.î@÷_$#Iû\002ÆòÏ\023 sÿÒo«\023Ý®Ï\003R\030Þ \016ßäGb<\027K3XÑåH»(\noñV Ù\023Ú\032ÔË8<\006~ \016ßäGb<\027Òa 1=$½\f}ö'\000~iñáH\020Ú»óò\030éL³qgØy,Ò\007;N&=fj\f\"f}((ÒÓÛq0vÌ\021{G\033±¸þ½ßÔá\030ï§TVkÅs\024\037ÍÞö4\002ÿ¼(\016ßäGb<\027¾þcÏp6øþÎÏÊ/?¶º¸ðXýr²È\022ëÙãýÊ \036\006=Ü!\bÕ\bpÿkÂ$³\031\031f\022ÀQ\f\002\033Çl\000§(¹dä\027ÛOï\037ïG~ÜZB²Ì\003ö\001\005\"\000ã<ï)v\rÂÿîÎH ülðÿùÙÍü_3\fåWÕú|Z?éßÂÜÿ7Á0(ÒÓÛq0vÌ\021{G\033±úÖ¹hv\020\033Ý7£åµ²ú!\013?ùÔ²1á83\006Áùó\037\034 \036\006=Ü!\bÕ\bpÿkÂ$³0(:^ìÌeºß ñÐ¾ µ²¾8Iq@¼IËïî¹,ª½¦4ÕÛ\b&yw¦\036ÚÊÄ(&0ÌKer\016½7öávÆfF fõýùÂ\n£t\020ÍuÒþôc|ç \033ùsj&pE£5x=(X$3eeù.Ù\017p:3y,mç»Y\013ÿ((ÒÓÛq0vÌ\021{G\033±ÔÑ§Ì\004»áz\0201ï\001ßÙúÒï ülðÿùÙÍü_3\fåWÕú|Z=L;¡µÉ¤¾\030\016ßäGb<\027¶@È­\rÛMÕÐÝcÉ\030|&ApdÂ\030°Ý\004\027kK~ìçø\020²p\027 ®è<=ëÇPKBCda.L¿½±hYºÀY\004¢Å¬\030®è<=ëÇPKBCda.L'V\030Uëñ>(&0ÌKer\016½7xE0¾aC½\021{Þ\022\027\005ö³Þ§Hñ¢¹çÚ\016Æ0\023WÙE-#âTíÉËxw\n.þ\024¿ÿîà _Î\002^&%Ê\034T_Uj\035n4\035´_ÍÕ\025 \016ßäGb<\0271å[Ø×qý÷«Ý@vug\013\032¿(\036\006=Ü!\bÕ\bpÿkÂ$³ÐçN¨¶¼¹ÿì:\027ò\025À»èÓ]\032Sê\030\016ßäGb<\027ÙÁwæò~\035Ä~hP/ËìÉ\r\030síJägãÅ¦¢O\006^FÒE²`$i \016ßäGb<\027!Ssú¡â]Û\0228T\031.0 Óå\025îhh ülðÿùÙÍü_3\fZZ;áà.L¸Ñ¹¥á\\e \016ßäGb<\027\005x6;.Y\035íÐn\024 !ïoÎcê³³\030®è<=ëÇPK÷A¿Rüeÿ\023Ñ<)\025³Ã").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  public static void aegisguard_I(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x7FFC93A9326FL;
    try {
      aegisguard_Gy.save(aegisguard_Gk);
    } catch (Exception exception) {
      String[] arrayOfString = b;
      File file = new File(aegisguard_K.INSTANCE.aegisguard_j().getDataFolder(), arrayOfString[176] + (new Date()).getTime());
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[25]);
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[251] + file.getName());
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[311]);
      aegisguard_Gk.renameTo(file);
      new Object[1];
      aegisguard_X(new Object[] { Long.valueOf(l2) });
    } 
  }
  
  public static void aegisguard_b(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x4E8A55A02064L;
    try {
      aegisguard_Gy.load(aegisguard_Gk);
    } catch (Exception exception) {
      String[] arrayOfString = b;
      File file = new File(aegisguard_K.INSTANCE.aegisguard_j().getDataFolder(), arrayOfString[237] + (new Date()).getTime());
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[107]);
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[2] + file.getName());
      aegisguard_K.INSTANCE.aegisguard_j().getLogger().log(Level.SEVERE, arrayOfString[259]);
      aegisguard_Gk.renameTo(file);
      new Object[1];
      aegisguard_X(new Object[] { Long.valueOf(l2) });
    } 
  }
  
  public static void aegisguard_X(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_1
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_b0.a : J
    //   15: lload_1
    //   16: lxor
    //   17: lstore_1
    //   18: lload_1
    //   19: dup2
    //   20: ldc2_w 14806540290346
    //   23: lxor
    //   24: lstore_3
    //   25: dup2
    //   26: ldc2_w 13633897478448
    //   29: lxor
    //   30: lstore #5
    //   32: dup2
    //   33: ldc2_w 41128768362412
    //   36: lxor
    //   37: lstore #7
    //   39: pop2
    //   40: invokestatic aegisguard_k : ()[Ljava/lang/String;
    //   43: astore #9
    //   45: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   48: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   51: invokevirtual getDataFolder : ()Ljava/io/File;
    //   54: invokevirtual exists : ()Z
    //   57: aload #9
    //   59: ifnonnull -> 142
    //   62: ifne -> 92
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   75: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   78: invokevirtual getDataFolder : ()Ljava/io/File;
    //   81: invokevirtual mkdir : ()Z
    //   84: pop
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: new java/io/File
    //   95: dup
    //   96: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   99: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   102: invokevirtual getDataFolder : ()Ljava/io/File;
    //   105: getstatic me/frep/aegisguard/spigot/aegisguard_b0.b : [Ljava/lang/String;
    //   108: sipush #254
    //   111: aaload
    //   112: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   115: putstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gk : Ljava/io/File;
    //   118: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gk : Ljava/io/File;
    //   121: aload #9
    //   123: lload_1
    //   124: lconst_0
    //   125: lcmp
    //   126: ifle -> 233
    //   129: ifnonnull -> 218
    //   132: invokevirtual exists : ()Z
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: lload_1
    //   143: lconst_0
    //   144: lcmp
    //   145: iflt -> 160
    //   148: ifne -> 215
    //   151: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gk : Ljava/io/File;
    //   154: invokevirtual getParentFile : ()Ljava/io/File;
    //   157: invokevirtual mkdirs : ()Z
    //   160: pop
    //   161: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   164: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   167: getstatic me/frep/aegisguard/spigot/aegisguard_b0.b : [Ljava/lang/String;
    //   170: sipush #246
    //   173: aaload
    //   174: invokevirtual getResource : (Ljava/lang/String;)Ljava/io/InputStream;
    //   177: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gk : Ljava/io/File;
    //   180: lload #7
    //   182: iconst_3
    //   183: anewarray java/lang/Object
    //   186: dup_x2
    //   187: dup_x2
    //   188: pop
    //   189: invokestatic valueOf : (J)Ljava/lang/Long;
    //   192: iconst_2
    //   193: swap
    //   194: aastore
    //   195: dup_x1
    //   196: swap
    //   197: iconst_1
    //   198: swap
    //   199: aastore
    //   200: dup_x1
    //   201: swap
    //   202: iconst_0
    //   203: swap
    //   204: aastore
    //   205: invokestatic aegisguard_g : ([Ljava/lang/Object;)V
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gk : Ljava/io/File;
    //   218: lload #5
    //   220: iconst_2
    //   221: anewarray java/lang/Object
    //   224: dup_x2
    //   225: dup_x2
    //   226: pop
    //   227: invokestatic valueOf : (J)Ljava/lang/Long;
    //   230: iconst_1
    //   231: swap
    //   232: aastore
    //   233: dup_x1
    //   234: swap
    //   235: iconst_0
    //   236: swap
    //   237: aastore
    //   238: invokestatic aegisguard_z : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_V;
    //   241: putstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gy : Lme/frep/aegisguard/spigot/aegisguard_V;
    //   244: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gy : Lme/frep/aegisguard/spigot/aegisguard_V;
    //   247: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Gk : Ljava/io/File;
    //   250: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   253: invokevirtual aegisguard_j : ()Lme/frep/aegisguard/spigot/aegisguardPlugin;
    //   256: getstatic me/frep/aegisguard/spigot/aegisguard_b0.b : [Ljava/lang/String;
    //   259: astore #11
    //   261: aload #11
    //   263: sipush #246
    //   266: aaload
    //   267: invokevirtual getResource : (Ljava/lang/String;)Ljava/io/InputStream;
    //   270: iconst_1
    //   271: anewarray java/lang/String
    //   274: dup
    //   275: iconst_0
    //   276: aload #11
    //   278: bipush #126
    //   280: aaload
    //   281: aastore
    //   282: lload_3
    //   283: dup2_x1
    //   284: pop2
    //   285: iconst_4
    //   286: anewarray java/lang/Object
    //   289: dup_x1
    //   290: swap
    //   291: iconst_3
    //   292: swap
    //   293: aastore
    //   294: dup_x2
    //   295: dup_x2
    //   296: pop
    //   297: invokestatic valueOf : (J)Ljava/lang/Long;
    //   300: iconst_2
    //   301: swap
    //   302: aastore
    //   303: dup_x1
    //   304: swap
    //   305: iconst_1
    //   306: swap
    //   307: aastore
    //   308: dup_x1
    //   309: swap
    //   310: iconst_0
    //   311: swap
    //   312: aastore
    //   313: invokevirtual aegisguard_a : ([Ljava/lang/Object;)V
    //   316: goto -> 321
    //   319: astore #10
    //   321: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #165	-> 45
    //   #166	-> 72
    //   #169	-> 92
    //   #171	-> 118
    //   #172	-> 151
    //   #173	-> 161
    //   #175	-> 215
    //   #177	-> 244
    //   #180	-> 316
    //   #178	-> 319
    //   #181	-> 321
    // Exception table:
    //   from	to	target	type
    //   45	65	68	java/lang/Exception
    //   62	85	88	java/lang/Exception
    //   92	135	138	java/lang/Exception
    //   142	208	211	java/lang/Exception
    //   244	316	319	java/lang/Exception
  }
  
  private static void aegisguard_g(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/io/InputStream
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/io/File
    //   15: astore_3
    //   16: dup
    //   17: iconst_2
    //   18: aaload
    //   19: checkcast java/lang/Long
    //   22: invokevirtual longValue : ()J
    //   25: lstore_1
    //   26: pop
    //   27: getstatic me/frep/aegisguard/spigot/aegisguard_b0.a : J
    //   30: lload_1
    //   31: lxor
    //   32: lstore_1
    //   33: invokestatic aegisguard_k : ()[Ljava/lang/String;
    //   36: astore #5
    //   38: new java/io/FileOutputStream
    //   41: dup
    //   42: aload_3
    //   43: invokespecial <init> : (Ljava/io/File;)V
    //   46: astore #6
    //   48: sipush #1024
    //   51: newarray byte
    //   53: astore #7
    //   55: aload #4
    //   57: aload #7
    //   59: invokevirtual read : ([B)I
    //   62: dup
    //   63: istore #8
    //   65: ifle -> 107
    //   68: aload #6
    //   70: aload #7
    //   72: iconst_0
    //   73: iload #8
    //   75: invokevirtual write : ([BII)V
    //   78: aload #5
    //   80: lload_1
    //   81: lconst_0
    //   82: lcmp
    //   83: iflt -> 91
    //   86: ifnonnull -> 117
    //   89: aload #5
    //   91: ifnull -> 55
    //   94: lload_1
    //   95: lconst_0
    //   96: lcmp
    //   97: ifle -> 78
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload #6
    //   109: invokevirtual close : ()V
    //   112: aload #4
    //   114: invokevirtual close : ()V
    //   117: goto -> 127
    //   120: astore #6
    //   122: aload #6
    //   124: invokevirtual printStackTrace : ()V
    //   127: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #185	-> 38
    //   #186	-> 48
    //   #188	-> 55
    //   #189	-> 68
    //   #191	-> 107
    //   #192	-> 112
    //   #195	-> 117
    //   #193	-> 120
    //   #194	-> 122
    //   #196	-> 127
    // Exception table:
    //   from	to	target	type
    //   38	117	120	java/lang/Exception
    //   68	94	103	java/lang/Exception
  }
  
  public static void aegisguard_h(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x7825867BCE6AL;
    try {
      String[] arrayOfString = b;
      aegisguard_L = aegisguard_O(new Object[] { arrayOfString[6] });
      aegisguard_dp = aegisguard_O(new Object[] { arrayOfString[77] });
      aegisguard_MR = aegisguard_O(new Object[] { arrayOfString[121] });
      aegisguard_MA = aegisguard_j(new Object[] { arrayOfString[157] });
      aegisguard_yq = aegisguard_O(new Object[] { arrayOfString[78] });
      aegisguard_yQ = aegisguard_U(new Object[] { arrayOfString[326] });
      aegisguard_dw = aegisguard_j(new Object[] { arrayOfString[34] });
      aegisguard_Ly = aegisguard_U(new Object[] { arrayOfString[293] });
      aegisguard_y_ = aegisguard_O(new Object[] { arrayOfString[244] });
      aegisguard_Mt = aegisguard_O(new Object[] { arrayOfString[185] });
      aegisguard_GP = aegisguard_O(new Object[] { arrayOfString[234] });
      aegisguard_y7 = aegisguard_O(new Object[] { arrayOfString[202] });
      aegisguard_Mc = aegisguard_O(new Object[] { arrayOfString[265] });
      aegisguard_d9 = aegisguard_U(new Object[] { arrayOfString[303] });
      aegisguard_G_ = aegisguard_U(new Object[] { arrayOfString[64] });
      aegisguard_Mh = aegisguard_O(new Object[] { arrayOfString[28] });
      aegisguard_c = aegisguard_U(new Object[] { arrayOfString[116] });
      aegisguard_dO = aegisguard_U(new Object[] { arrayOfString[139] });
      aegisguard_Gw = aegisguard_U(new Object[] { arrayOfString[258] });
      aegisguard_dV = aegisguard_j(new Object[] { arrayOfString[102] });
      aegisguard_dh = aegisguard_U(new Object[] { arrayOfString[189] });
      aegisguard_Lp = aegisguard_j(new Object[] { arrayOfString[309] });
      aegisguard_Gd = aegisguard_O(new Object[] { arrayOfString[138] });
      aegisguard_MC = aegisguard_U(new Object[] { arrayOfString[108] });
      aegisguard_Ms = aegisguard_U(new Object[] { arrayOfString[98] });
      aegisguard_GX = aegisguard_j(new Object[] { arrayOfString[56] });
      aegisguard_du = aegisguard_U(new Object[] { arrayOfString[209] });
      aegisguard_Gz = aegisguard_U(new Object[] { arrayOfString[131] });
      aegisguard_dz = aegisguard_O(new Object[] { arrayOfString[217] });
      aegisguard_dT = aegisguard_O(new Object[] { arrayOfString[203] });
      aegisguard_Gr = aegisguard_O(new Object[] { arrayOfString[290] });
      aegisguard_W = aegisguard_j(new Object[] { arrayOfString[99] });
      aegisguard_yt = aegisguard_j(new Object[] { arrayOfString[224] });
      aegisguard_dU = aegisguard_O(new Object[] { arrayOfString[0] });
      aegisguard_LD = aegisguard_O(new Object[] { arrayOfString[12] });
      aegisguard_G5 = aegisguard_O(new Object[] { arrayOfString[122] });
      aegisguard_yl = aegisguard_j(new Object[] { arrayOfString[162] });
      aegisguard_LR = aegisguard_j(new Object[] { arrayOfString[327] });
      aegisguard_yS = aegisguard_j(new Object[] { arrayOfString[30] });
      aegisguard_MD = aegisguard_U(new Object[] { arrayOfString[310] });
      aegisguard_L7 = aegisguard_j(new Object[] { arrayOfString[140] });
      aegisguard_Mb = aegisguard_j(new Object[] { arrayOfString[161] });
      aegisguard_t = aegisguard_j(new Object[] { arrayOfString[181] });
      aegisguard_a = aegisguard_U(new Object[] { arrayOfString[152] });
      aegisguard_GF = aegisguard_O(new Object[] { arrayOfString[123] });
      aegisguard_Mi = aegisguard_O(new Object[] { arrayOfString[245] });
      aegisguard_yh = aegisguard_O(new Object[] { arrayOfString[106] });
      aegisguard_GS = aegisguard_O(new Object[] { arrayOfString[170] });
      aegisguard_q = aegisguard_O(new Object[] { arrayOfString[335] });
      aegisguard_Gh = aegisguard_O(new Object[] { arrayOfString[273] });
      aegisguard_Lx = aegisguard_n(new Object[] { arrayOfString[15] });
      aegisguard_ys = aegisguard_n(new Object[] { arrayOfString[307] });
      aegisguard_da = aegisguard_j(new Object[] { arrayOfString[53] });
      aegisguard_A = aegisguard_O(new Object[] { arrayOfString[178] });
      aegisguard_o = aegisguard_O(new Object[] { arrayOfString[158] });
      aegisguard_MY = aegisguard_O(new Object[] { arrayOfString[313] });
      aegisguard_LS = aegisguard_U(new Object[] { arrayOfString[40] });
      aegisguard_Lb = aegisguard_U(new Object[] { arrayOfString[20] });
      aegisguard_LP = aegisguard_U(new Object[] { arrayOfString[204] });
      aegisguard_GW = aegisguard_O(new Object[] { arrayOfString[51] });
      aegisguard_yI = aegisguard_O(new Object[] { arrayOfString[156] });
      aegisguard_L2 = aegisguard_j(new Object[] { arrayOfString[248] });
      aegisguard_M4 = aegisguard_U(new Object[] { arrayOfString[81] });
      aegisguard_v = aegisguard_O(new Object[] { arrayOfString[115] });
      aegisguard_d1 = aegisguard_O(new Object[] { arrayOfString[295] });
      aegisguard_yC = aegisguard_j(new Object[] { arrayOfString[226] });
      aegisguard_Mw = aegisguard_O(new Object[] { arrayOfString[133] });
      aegisguard_Lm = aegisguard_O(new Object[] { arrayOfString[48] });
      aegisguard_dk = aegisguard_O(new Object[] { arrayOfString[92] });
      aegisguard_Mo = aegisguard_U(new Object[] { arrayOfString[184] });
      aegisguard_y = aegisguard_U(new Object[] { arrayOfString[149] });
      aegisguard_GI = aegisguard_U(new Object[] { arrayOfString[199] });
      aegisguard_LV = aegisguard_O(new Object[] { arrayOfString[263] });
      aegisguard_MV = aegisguard_O(new Object[] { arrayOfString[144] });
      aegisguard_Gt = aegisguard_O(new Object[] { arrayOfString[257] });
      aegisguard_LE = aegisguard_j(new Object[] { arrayOfString[37] });
      aegisguard_dQ = aegisguard_O(new Object[] { arrayOfString[129] });
      aegisguard_yi = aegisguard_O(new Object[] { arrayOfString[268] });
      aegisguard_M_ = aegisguard_j(new Object[] { arrayOfString[16] });
      aegisguard_LL = aegisguard_j(new Object[] { arrayOfString[250] });
      aegisguard_n = aegisguard_j(new Object[] { arrayOfString[182] });
      aegisguard_dm = aegisguard_j(new Object[] { arrayOfString[200] });
      aegisguard_e = aegisguard_j(new Object[] { arrayOfString[111] });
      aegisguard_y3 = aegisguard_j(new Object[] { arrayOfString[336] });
      aegisguard_Ma = aegisguard_j(new Object[] { arrayOfString[229] });
      aegisguard_l = aegisguard_j(new Object[] { arrayOfString[60] });
      aegisguard_MM = aegisguard_j(new Object[] { arrayOfString[26] });
      aegisguard_GB = aegisguard_j(new Object[] { arrayOfString[240] });
      aegisguard_dn = aegisguard_j(new Object[] { arrayOfString[271] });
      aegisguard_Mk = aegisguard_j(new Object[] { arrayOfString[112] });
      aegisguard_dD = aegisguard_O(new Object[] { arrayOfString[270] });
      aegisguard_Lf = aegisguard_O(new Object[] { arrayOfString[186] });
      aegisguard_L3 = aegisguard_U(new Object[] { arrayOfString[276] });
      aegisguard_LK = aegisguard_U(new Object[] { arrayOfString[82] });
      aegisguard_N = aegisguard_O(new Object[] { arrayOfString[57] });
      aegisguard_ya = aegisguard_O(new Object[] { arrayOfString[211] });
      aegisguard_G9 = aegisguard_O(new Object[] { arrayOfString[331] });
      aegisguard_Ga = aegisguard_O(new Object[] { arrayOfString[304] });
      aegisguard_Gn = aegisguard_O(new Object[] { arrayOfString[221] });
      aegisguard_yv = aegisguard_O(new Object[] { arrayOfString[284] });
      aegisguard_GM = aegisguard_U(new Object[] { arrayOfString[213] });
      aegisguard_MI = aegisguard_O(new Object[] { arrayOfString[171] });
      aegisguard_dg = aegisguard_O(new Object[] { arrayOfString[54] });
      aegisguard_Mf = aegisguard_j(new Object[] { arrayOfString[165] });
      aegisguard_Mq = aegisguard_O(new Object[] { arrayOfString[113] });
      aegisguard_do = aegisguard_U(new Object[] { arrayOfString[210] });
      aegisguard_GU = aegisguard_j(new Object[] { arrayOfString[328] });
      aegisguard_M2 = aegisguard_O(new Object[] { arrayOfString[302] });
      aegisguard_LG = aegisguard_j(new Object[] { arrayOfString[119] });
      aegisguard_L4 = aegisguard_O(new Object[] { arrayOfString[231] });
      aegisguard_yk = aegisguard_O(new Object[] { arrayOfString[97] });
      aegisguard_LU = aegisguard_O(new Object[] { arrayOfString[148] });
      aegisguard_GG = aegisguard_U(new Object[] { arrayOfString[31] });
      aegisguard_Gc = aegisguard_U(new Object[] { arrayOfString[160] });
      aegisguard_dP = aegisguard_O(new Object[] { arrayOfString[232] });
      aegisguard_Md = aegisguard_j(new Object[] { arrayOfString[142] });
      aegisguard_GK = aegisguard_j(new Object[] { arrayOfString[135] });
      aegisguard_M6 = aegisguard_O(new Object[] { arrayOfString[253] });
      aegisguard_Lq = aegisguard_j(new Object[] { arrayOfString[340] });
      aegisguard_d8 = aegisguard_O(new Object[] { arrayOfString[143] });
      aegisguard_Lh = aegisguard_j(new Object[] { arrayOfString[318] });
      aegisguard_dC = aegisguard_O(new Object[] { arrayOfString[124] });
      aegisguard_dB = aegisguard_O(new Object[] { arrayOfString[345] });
      aegisguard_T = aegisguard_j(new Object[] { arrayOfString[47] });
      aegisguard_R = aegisguard_U(new Object[] { arrayOfString[172] });
      aegisguard_yO = aegisguard_U(new Object[] { arrayOfString[214] });
      aegisguard_L0 = aegisguard_U(new Object[] { arrayOfString[69] });
      aegisguard_yU = aegisguard_U(new Object[] { arrayOfString[45] });
      aegisguard_yN = aegisguard_U(new Object[] { arrayOfString[110] });
      aegisguard_Mn = aegisguard_j(new Object[] { arrayOfString[230] });
      aegisguard_yV = aegisguard_j(new Object[] { arrayOfString[72] });
      aegisguard_L8 = aegisguard_j(new Object[] { arrayOfString[84] });
      aegisguard_G = aegisguard_j(new Object[] { arrayOfString[100] });
      aegisguard_d4 = aegisguard_j(new Object[] { arrayOfString[32] });
      aegisguard_Gu = aegisguard_j(new Object[] { arrayOfString[346] });
      aegisguard_Ln = aegisguard_G(new Object[] { arrayOfString[319] });
      aegisguard_V = aegisguard_G(new Object[] { arrayOfString[197] });
      aegisguard_w = aegisguard_G(new Object[] { arrayOfString[173] });
      aegisguard_yu = aegisguard_j(new Object[] { arrayOfString[183] });
      aegisguard_Gp = aegisguard_j(new Object[] { arrayOfString[187] });
      aegisguard_dZ = aegisguard_j(new Object[] { arrayOfString[43] });
      aegisguard_My = aegisguard_j(new Object[] { arrayOfString[324] });
      aegisguard_d = aegisguard_G(new Object[] { arrayOfString[277] });
      aegisguard_yL = aegisguard_G(new Object[] { arrayOfString[329] });
      aegisguard_Z = aegisguard_j(new Object[] { arrayOfString[65] });
      aegisguard_Z = aegisguard_j(new Object[] { arrayOfString[87] });
      aegisguard_B = aegisguard_G(new Object[] { arrayOfString[27] });
      aegisguard_b = aegisguard_G(new Object[] { arrayOfString[312] });
      aegisguard_MN = aegisguard_G(new Object[] { arrayOfString[1] });
      aegisguard_yd = aegisguard_G(new Object[] { arrayOfString[36] });
      aegisguard_GO = aegisguard_j(new Object[] { arrayOfString[297] });
      aegisguard_Mp = aegisguard_O(new Object[] { arrayOfString[44] });
      aegisguard__ = aegisguard_U(new Object[] { arrayOfString[322] });
      aegisguard_MO = aegisguard_G(new Object[] { arrayOfString[286] });
      aegisguard_yY = aegisguard_G(new Object[] { arrayOfString[222] });
      aegisguard_MK = aegisguard_G(new Object[] { arrayOfString[109] });
      aegisguard_yr = aegisguard_G(new Object[] { arrayOfString[88] });
      aegisguard_Gg = aegisguard_G(new Object[] { arrayOfString[68] });
      aegisguard_Ge = aegisguard_G(new Object[] { arrayOfString[59] });
      aegisguard_GJ = aegisguard_U(new Object[] { arrayOfString[83] });
      aegisguard_M5 = aegisguard_U(new Object[] { arrayOfString[308] });
      aegisguard_yg = aegisguard_U(new Object[] { arrayOfString[91] });
      aegisguard_Mr = aegisguard_U(new Object[] { arrayOfString[315] });
      aegisguard_Lj = aegisguard_U(new Object[] { arrayOfString[105] });
      aegisguard_Mv = aegisguard_U(new Object[] { arrayOfString[215] });
      aegisguard_Gs = aegisguard_j(new Object[] { arrayOfString[114] });
      aegisguard_dG = aegisguard_U(new Object[] { arrayOfString[188] });
      aegisguard_Ml = aegisguard_U(new Object[] { arrayOfString[14] });
      aegisguard_G7 = aegisguard_G(new Object[] { arrayOfString[179] });
      aegisguard_Lw = aegisguard_U(new Object[] { arrayOfString[272] });
      aegisguard_Lv = aegisguard_n(new Object[] { arrayOfString[96] });
      aegisguard_yx = aegisguard_j(new Object[] { arrayOfString[73] });
      aegisguard_LT = aegisguard_j(new Object[] { arrayOfString[334] });
      aegisguard_S = aegisguard_U(new Object[] { arrayOfString[79] });
      aegisguard_J = aegisguard_U(new Object[] { arrayOfString[137] });
      aegisguard_Lc = aegisguard_U(new Object[] { arrayOfString[305] });
      aegisguard_LH = aegisguard_U(new Object[] { arrayOfString[238] });
      aegisguard_dK = aegisguard_U(new Object[] { arrayOfString[264] });
      aegisguard_yn = aegisguard_U(new Object[] { arrayOfString[323] });
      aegisguard_GY = aegisguard_U(new Object[] { arrayOfString[330] });
      aegisguard_y9 = aegisguard_U(new Object[] { arrayOfString[4] });
      aegisguard_M3 = aegisguard_U(new Object[] { arrayOfString[150] });
      aegisguard_yW = aegisguard_O(new Object[] { arrayOfString[22] });
      aegisguard_G0 = aegisguard_O(new Object[] { arrayOfString[117] });
      aegisguard_K = aegisguard_O(new Object[] { arrayOfString[159] });
      aegisguard_g = aegisguard_O(new Object[] { arrayOfString[191] });
      aegisguard_LC = aegisguard_O(new Object[] { arrayOfString[194] });
      aegisguard_GH = aegisguard_O(new Object[] { arrayOfString[145] });
      aegisguard_yM = aegisguard_O(new Object[] { arrayOfString[61] });
      aegisguard_MP = aegisguard_O(new Object[] { arrayOfString[166] });
      aegisguard_Ls = aegisguard_O(new Object[] { arrayOfString[125] });
      aegisguard_GD = aegisguard_O(new Object[] { arrayOfString[342] });
      aegisguard_i = aegisguard_j(new Object[] { arrayOfString[267] });
      aegisguard_LZ = aegisguard_U(new Object[] { arrayOfString[227] });
      aegisguard_Gb = aegisguard_j(new Object[] { arrayOfString[291] });
      aegisguard_MZ = aegisguard_j(new Object[] { arrayOfString[136] });
      aegisguard_d5 = aegisguard_O(new Object[] { arrayOfString[190] });
      aegisguard_Mx = aegisguard_j(new Object[] { arrayOfString[274] });
      aegisguard_x = aegisguard_O(new Object[] { arrayOfString[33] });
      aegisguard_I = aegisguard_O(new Object[] { arrayOfString[169] });
      aegisguard_y4 = aegisguard_O(new Object[] { arrayOfString[80] });
      aegisguard_yy = aegisguard_O(new Object[] { arrayOfString[208] });
      aegisguard_GV = aegisguard_O(new Object[] { arrayOfString[294] });
      aegisguard_m = aegisguard_O(new Object[] { arrayOfString[7] });
      aegisguard_M9 = aegisguard_O(new Object[] { arrayOfString[52] });
      aegisguard_di = aegisguard_O(new Object[] { arrayOfString[89] });
      aegisguard_dq = aegisguard_O(new Object[] { arrayOfString[192] });
      aegisguard_LW = aegisguard_O(new Object[] { arrayOfString[8] });
      aegisguard_yJ = aegisguard_O(new Object[] { arrayOfString[127] });
      aegisguard_y0 = aegisguard_O(new Object[] { arrayOfString[316] });
      aegisguard_LX = aegisguard_O(new Object[] { arrayOfString[278] });
      aegisguard_GL = aegisguard_O(new Object[] { arrayOfString[11] });
      aegisguard_dy = aegisguard_O(new Object[] { arrayOfString[118] });
      aegisguard_y2 = aegisguard_O(new Object[] { arrayOfString[167] });
      aegisguard_yZ = aegisguard_O(new Object[] { arrayOfString[288] });
      aegisguard_MH = aegisguard_O(new Object[] { arrayOfString[341] });
      aegisguard_Gj = aegisguard_O(new Object[] { arrayOfString[205] });
      aegisguard_GZ = aegisguard_O(new Object[] { arrayOfString[177] });
      aegisguard_d7 = aegisguard_O(new Object[] { arrayOfString[58] });
      aegisguard_GC = aegisguard_O(new Object[] { arrayOfString[93] });
      aegisguard_Y = aegisguard_O(new Object[] { arrayOfString[285] });
      aegisguard_yw = aegisguard_O(new Object[] { arrayOfString[216] });
      aegisguard_db = aegisguard_O(new Object[] { arrayOfString[343] });
      aegisguard_yX = aegisguard_O(new Object[] { arrayOfString[42] });
      aegisguard_Li = aegisguard_O(new Object[] { arrayOfString[317] });
      aegisguard_G4 = aegisguard_O(new Object[] { arrayOfString[13] });
      aegisguard_r = aegisguard_O(new Object[] { arrayOfString[337] });
      aegisguard_U = aegisguard_O(new Object[] { arrayOfString[67] });
      aegisguard_MW = aegisguard_O(new Object[] { arrayOfString[153] });
      aegisguard_dA = aegisguard_O(new Object[] { arrayOfString[283] });
      aegisguard_F = aegisguard_O(new Object[] { arrayOfString[225] });
      aegisguard_df = aegisguard_O(new Object[] { arrayOfString[175] });
      aegisguard_P = aegisguard_O(new Object[] { arrayOfString[207] });
      aegisguard_Ll = aegisguard_O(new Object[] { arrayOfString[299] });
      aegisguard_GE = aegisguard_O(new Object[] { arrayOfString[320] });
      aegisguard_O = aegisguard_O(new Object[] { arrayOfString[247] });
      aegisguard_LQ = aegisguard_O(new Object[] { arrayOfString[76] });
      aegisguard_dN = aegisguard_O(new Object[] { arrayOfString[10] });
      aegisguard_j = aegisguard_O(new Object[] { arrayOfString[198] });
      aegisguard_ML = aegisguard_O(new Object[] { arrayOfString[71] });
      aegisguard_GN = aegisguard_O(new Object[] { arrayOfString[23] });
      aegisguard_Lk = aegisguard_O(new Object[] { arrayOfString[287] });
      aegisguard_dj = aegisguard_O(new Object[] { arrayOfString[193] });
      aegisguard_d_ = aegisguard_U(new Object[] { arrayOfString[332] });
      aegisguard_d2 = aegisguard_O(new Object[] { arrayOfString[132] });
      aegisguard_Mm = aegisguard_O(new Object[] { arrayOfString[339] });
      aegisguard_Ld = aegisguard_O(new Object[] { arrayOfString[35] });
      aegisguard_LA = aegisguard_O(new Object[] { arrayOfString[46] });
      aegisguard_yF = aegisguard_O(new Object[] { arrayOfString[314] });
      aegisguard_MS = aegisguard_O(new Object[] { arrayOfString[155] });
      aegisguard_u = aegisguard_j(new Object[] { arrayOfString[249] });
      aegisguard_Mz = aegisguard_O(new Object[] { arrayOfString[128] });
      aegisguard_ds = aegisguard_j(new Object[] { arrayOfString[333] });
      aegisguard_Mj = aegisguard_O(new Object[] { arrayOfString[38] });
      aegisguard_z = aegisguard_j(new Object[] { arrayOfString[103] });
      aegisguard_Gm = aegisguard_j(new Object[] { arrayOfString[300] });
      aegisguard_Mg = aegisguard_U(new Object[] { arrayOfString[24] });
      aegisguard_Gv = aegisguard_U(new Object[] { arrayOfString[282] });
      aegisguard_M = aegisguard_U(new Object[] { arrayOfString[256] });
      aegisguard_G6 = aegisguard_O(new Object[] { arrayOfString[50] });
      aegisguard_h = aegisguard_O(new Object[] { arrayOfString[180] });
      aegisguard_M0 = aegisguard_O(new Object[] { arrayOfString[262] });
      aegisguard_dc = aegisguard_O(new Object[] { arrayOfString[90] });
      aegisguard_yD = aegisguard_O(new Object[] { arrayOfString[275] });
      aegisguard_dE = aegisguard_O(new Object[] { arrayOfString[279] });
      aegisguard_G2 = aegisguard_U(new Object[] { arrayOfString[29] });
      aegisguard_dY = aegisguard_O(new Object[] { arrayOfString[70] });
      aegisguard_MQ = aegisguard_j(new Object[] { arrayOfString[94] });
      aegisguard_L_ = aegisguard_j(new Object[] { arrayOfString[5] });
      aegisguard_yf = aegisguard_j(new Object[] { arrayOfString[255] });
      aegisguard_dJ = aegisguard_j(new Object[] { arrayOfString[281] });
      aegisguard_de = aegisguard_O(new Object[] { arrayOfString[269] });
      aegisguard_dt = aegisguard_O(new Object[] { arrayOfString[49] });
      aegisguard_L5 = aegisguard_O(new Object[] { arrayOfString[74] });
      aegisguard_dd = aegisguard_U(new Object[] { arrayOfString[296] });
      aegisguard_C = aegisguard_j(new Object[] { arrayOfString[266] });
      aegisguard_H = aegisguard_n(new Object[] { arrayOfString[95] });
      aegisguard_dF = aegisguard_U(new Object[] { arrayOfString[130] });
      aegisguard_dM = aegisguard_U(new Object[] { arrayOfString[21] });
      aegisguard_Lt = aegisguard_O(new Object[] { arrayOfString[19] });
      aegisguard_dv = aegisguard_O(new Object[] { arrayOfString[66] });
      aegisguard_Lu = aegisguard_O(new Object[] { arrayOfString[228] });
      aegisguard_GT = aegisguard_O(new Object[] { arrayOfString[146] });
      aegisguard_G1 = aegisguard_U(new Object[] { arrayOfString[235] });
      aegisguard_dl = aegisguard_j(new Object[] { arrayOfString[163] });
      aegisguard_L1 = aegisguard_G(new Object[] { arrayOfString[321] });
      aegisguard_Gx = aegisguard_G(new Object[] { arrayOfString[241] });
      aegisguard_Gq = aegisguard_G(new Object[] { arrayOfString[62] });
      aegisguard_MU = aegisguard_O(new Object[] { arrayOfString[9] });
      aegisguard_d6 = aegisguard_U(new Object[] { arrayOfString[174] });
      aegisguard_LO = aegisguard_j(new Object[] { arrayOfString[206] });
      aegisguard_M7 = aegisguard_O(new Object[] { arrayOfString[292] });
      aegisguard_ME = aegisguard_U(new Object[] { arrayOfString[75] });
      aegisguard_d0 = aegisguard_j(new Object[] { arrayOfString[134] });
      aegisguard_Lr = aegisguard_j(new Object[] { arrayOfString[306] });
      aegisguard_MT = aegisguard_O(new Object[] { arrayOfString[325] });
      aegisguard_MX = aegisguard_j(new Object[] { arrayOfString[18] });
      aegisguard_M1 = aegisguard_j(new Object[] { arrayOfString[338] });
      aegisguard_GR = aegisguard_j(new Object[] { arrayOfString[86] });
      aegisguard_yR = aegisguard_j(new Object[] { arrayOfString[233] });
      aegisguard_L6 = aegisguard_O(new Object[] { arrayOfString[151] });
      aegisguard_dL = aegisguard_O(new Object[] { arrayOfString[196] });
      aegisguard_Lo = aegisguard_n(new Object[] { arrayOfString[3] });
      aegisguard_GQ = aegisguard_j(new Object[] { arrayOfString[85] });
      aegisguard_d3 = aegisguard_U(new Object[] { arrayOfString[289] });
      aegisguard_k = aegisguard_U(new Object[] { arrayOfString[154] });
      aegisguard_Me = aegisguard_j(new Object[] { arrayOfString[260] });
      aegisguard_E = aegisguard_U(new Object[] { arrayOfString[101] });
      aegisguard_s = aegisguard_U(new Object[] { arrayOfString[55] });
      aegisguard_Go = aegisguard_O(new Object[] { arrayOfString[141] });
      aegisguard_yA = aegisguard_j(new Object[] { arrayOfString[63] });
      aegisguard_yP = aegisguard_O(new Object[] { arrayOfString[147] });
      aegisguard_dR = aegisguard_O(new Object[] { arrayOfString[104] });
      aegisguard_yb = aegisguard_O(new Object[] { arrayOfString[195] });
      aegisguard_LY = aegisguard_O(new Object[] { arrayOfString[252] });
      aegisguard_Gl = aegisguard_O(new Object[] { arrayOfString[120] });
      aegisguard_LM = aegisguard_j(new Object[] { arrayOfString[261] });
      aegisguard_La = aegisguard_O(new Object[] { arrayOfString[242] });
      aegisguard_Gb = aegisguard_j(new Object[] { arrayOfString[298] });
      aegisguard_LB = aegisguard_j(new Object[] { arrayOfString[344] });
      aegisguard_G3 = aegisguard_j(new Object[] { arrayOfString[239] });
      aegisguard_G8 = aegisguard_j(new Object[] { arrayOfString[164] });
      aegisguard_Gi = aegisguard_j(new Object[] { arrayOfString[218] });
      aegisguard_dI = aegisguard_U(new Object[] { arrayOfString[17] });
      aegisguard_p = aegisguard_j(new Object[] { arrayOfString[219] });
      aegisguard_Mu = aegisguard_j(new Object[] { arrayOfString[41] });
      aegisguard_yK = aegisguard_U(new Object[] { arrayOfString[39] });
      aegisguard_dx = aegisguard_U(new Object[] { arrayOfString[212] });
      aegisguard_D = aegisguard_j(new Object[] { arrayOfString[301] });
      aegisguard_dX = aegisguard_G(new Object[] { arrayOfString[243] });
      aegisguard_MG = aegisguard_j(new Object[] { arrayOfString[223] });
      aegisguard_yj = aegisguard_O(new Object[] { arrayOfString[236] });
      aegisguard_GA = aegisguard_O(new Object[] { arrayOfString[168] });
      new Object[1];
      aegisguard_KV.aegisguard_z(new Object[] { Long.valueOf(l2) });
    } catch (Exception exception) {
      Bukkit.getLogger().severe(b[280]);
      exception.printStackTrace();
    } 
  }
  
  public static boolean aegisguard_j(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.getBoolean(str);
  }
  
  public static String aegisguard_O(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.getString(str);
  }
  
  public static int aegisguard_U(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.getInt(str);
  }
  
  public static double aegisguard_G(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.getDouble(str);
  }
  
  public static long aegisguard_n(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.getLong(str);
  }
  
  public static List aegisguard_U(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.getStringList(str);
  }
  
  public static boolean aegisguard_d(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.isString(str);
  }
  
  public static Color aegisguard_F(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.getColor(str);
  }
  
  public static boolean aegisguard_m(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return aegisguard_Gy.isColor(str);
  }
  
  public static void aegisguard_p(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    Object object = paramArrayOfObject[1];
    long l = ((Long)paramArrayOfObject[2]).longValue();
    l = a ^ l;
    aegisguard_K.INSTANCE.aegisguard_j().getConfig().set(str, object);
    aegisguard_K.INSTANCE.aegisguard_j().saveConfig();
    String[] arrayOfString = aegisguard_k();
    try {
      aegisguard_K.INSTANCE.aegisguard_j().reloadConfig();
      if (arrayOfString != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[2]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public static void aegisguard__(String[] paramArrayOfString) {
    aegisguard_MJ = paramArrayOfString;
  }
  
  public static String[] aegisguard_k() {
    return aegisguard_MJ;
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
