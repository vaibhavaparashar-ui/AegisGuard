package me.frep.aegisguard.spigot.AegisGuard_Ke;

import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPong;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientWindowConfirmation;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerAbilities;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.vulcan.spigot.Vulcan_K;
import me.frep.vulcan.spigot.Vulcan_X;
import me.frep.vulcan.spigot.Vulcan_e;
import me.frep.vulcan.spigot.Vulcan_h3;
import me.frep.vulcan.spigot.Vulcan_hu;
import me.frep.vulcan.spigot.check.AbstractCheck;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;

public class Vulcan_Ke {
  private final Vulcan_hu Vulcan_bP;
  
  private boolean Vulcan_St;
  
  private boolean Vulcan_T;
  
  private boolean Vulcan_SV;
  
  private boolean Vulcan_jn;
  
  private boolean Vulcan_b2;
  
  private boolean Vulcan_jc;
  
  private boolean Vulcan_b6;
  
  private boolean Vulcan_kN;
  
  private boolean Vulcan_kd;
  
  private boolean Vulcan_kb;
  
  private boolean Vulcan_ka;
  
  private boolean Vulcan_g;
  
  private boolean Vulcan_x;
  
  private boolean Vulcan_kF;
  
  private boolean Vulcan_bb;
  
  private boolean Vulcan_y;
  
  private boolean Vulcan_kM;
  
  private boolean Vulcan_b_;
  
  private boolean Vulcan_b4;
  
  private boolean Vulcan_a;
  
  private boolean Vulcan_Sc;
  
  private boolean Vulcan_jm;
  
  private boolean Vulcan_B;
  
  private boolean Vulcan_Si;
  
  private boolean Vulcan_C;
  
  private boolean Vulcan_SL;
  
  private boolean Vulcan_S_;
  
  private boolean Vulcan_kk;
  
  private boolean Vulcan_Ss;
  
  private boolean Vulcan_j;
  
  private boolean Vulcan_S1;
  
  private boolean Vulcan_j2;
  
  private boolean Vulcan_kP;
  
  private boolean Vulcan_kB;
  
  private boolean Vulcan_bi;
  
  private boolean Vulcan_e;
  
  private boolean Vulcan_bB;
  
  private boolean Vulcan_o;
  
  private boolean Vulcan_k0;
  
  private boolean Vulcan_Sw;
  
  private boolean Vulcan_jD;
  
  private boolean Vulcan_bJ;
  
  private boolean Vulcan_Sr;
  
  private boolean Vulcan_bF;
  
  private boolean Vulcan_k2;
  
  private boolean Vulcan_SC;
  
  private boolean Vulcan_L;
  
  private boolean Vulcan_kj;
  
  private boolean Vulcan_j1;
  
  private boolean Vulcan_Sg;
  
  private boolean Vulcan_X;
  
  private boolean Vulcan_SF;
  
  private boolean Vulcan_K;
  
  private boolean Vulcan_SH;
  
  private boolean Vulcan_bC;
  
  private boolean Vulcan_b7;
  
  private boolean Vulcan_jR;
  
  private boolean Vulcan_ja;
  
  private boolean Vulcan_j9;
  
  private boolean Vulcan_h;
  
  private boolean Vulcan_r;
  
  private boolean Vulcan_bN;
  
  private boolean Vulcan_bx;
  
  private boolean Vulcan_jF;
  
  private boolean Vulcan_ku;
  
  private boolean Vulcan_b1;
  
  private boolean Vulcan_bO;
  
  private boolean Vulcan_jE;
  
  private boolean Vulcan_k1;
  
  private boolean Vulcan_jx;
  
  private boolean Vulcan_kV;
  
  private boolean Vulcan_bM;
  
  private boolean Vulcan_So;
  
  private boolean Vulcan_H;
  
  private boolean Vulcan_kA;
  
  private boolean Vulcan_Sz;
  
  private boolean Vulcan_m;
  
  private boolean Vulcan_bm;
  
  private boolean Vulcan_kD;
  
  private boolean Vulcan_bT;
  
  private boolean Vulcan_bQ;
  
  private boolean Vulcan_Sl;
  
  private boolean Vulcan_b8;
  
  private boolean Vulcan_SS;
  
  private boolean Vulcan_z;
  
  private boolean Vulcan_kK;
  
  private boolean Vulcan_I;
  
  private boolean Vulcan_kv;
  
  private boolean Vulcan_bl;
  
  private boolean Vulcan_bg;
  
  private boolean Vulcan_kh;
  
  private boolean Vulcan_kx;
  
  private boolean Vulcan_bV;
  
  private boolean Vulcan_v;
  
  private boolean Vulcan_bE;
  
  private boolean Vulcan_bc;
  
  private boolean Vulcan_Sa;
  
  private boolean Vulcan_j8;
  
  private boolean Vulcan_jX;
  
  private boolean Vulcan_SN;
  
  private boolean Vulcan_Sj;
  
  private boolean Vulcan_kq;
  
  private boolean Vulcan_Sm;
  
  private Location Vulcan_bq;
  
  private Location Vulcan_Sh;
  
  public void Vulcan_XF(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_E(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BQ(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_z(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B9(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BN(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XD(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bk(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_J(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bm(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XK(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bg(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BF(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bp(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bc(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BY(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B6(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bx(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BZ(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_X6(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_n(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_I(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Be(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_V(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bw(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XP(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BR(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xh(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XN(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B7(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_f(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XY(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_X8(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BP(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_N(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xo(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bz(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_U(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xd(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B0(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bd(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BS(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Y(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BA(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XJ(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BE(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B5(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_w(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bl(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B1(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xy(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_j(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BH(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_X9(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_m(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bs(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_S(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BJ(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BV(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BO(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BD(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Ba(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BT(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_W(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bt(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_t(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bj(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BU(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_X7(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_P(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XO(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xb(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xz(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XB(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_X1(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_L(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xu(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Br(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bb(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_X_(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xk(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_By(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bq(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_u(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XM(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BW(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xl(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XZ(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B2(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_c(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xv(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bf(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XR(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bn(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BK(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B3(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B8(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BB(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XS(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_C(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bv(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BM(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_g(Object[] paramArrayOfObject) {
    Location location = (Location)paramArrayOfObject[0];
  }
  
  public void Vulcan_ua(Object[] paramArrayOfObject) {
    Location location = (Location)paramArrayOfObject[0];
  }
  
  public void Vulcan_gR(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_gU(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_h(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
  }
  
  public void Vulcan_hY(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
  }
  
  public void Vulcan_hs(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
  }
  
  public void Vulcan_O(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public void Vulcan_vg(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public void Vulcan_vE(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public void Vulcan_vu(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public void Vulcan_vL(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public void Vulcan_k(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_A(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_d9(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dy(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_Z(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dc(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_d4(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_e(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_d_(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_df(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dg(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_T(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dZ(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dL(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dk(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dG(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dz(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dJ(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dB(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dm(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_q(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dA(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dP(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dx(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dW(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_d8(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_da(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dH(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dr(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_d7(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_ds(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dE(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dI(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_do(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dD(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_d2(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dh(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dF(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_d6(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_Q(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan__(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_R(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dv(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_di(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dn(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_d(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_dp(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void Vulcan_MQ(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_ME(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MI(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M4(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_o(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mx(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mc(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_p(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mn(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M9(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M6(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mp(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MZ(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M1(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_ML(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mv(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MY(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_K(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MR(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MU(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mk(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mo(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mg(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MP(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M2(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_b(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Ms(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_y(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MK(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M3(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Ml(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MB(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mm(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MO(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mw(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_H(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mt(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M_(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MX(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MT(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MH(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MV(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mi(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mz(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M5(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_G(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_v(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MW(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MF(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mb(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_r(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MN(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mj(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Md(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mf(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MM(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M8(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mu(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M7(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MS(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mq(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MC(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MJ(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_i(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Me(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mr(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MG(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_D(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MD(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_MA(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_My(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_M0(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Ma(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Mh(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void Vulcan_Ap(Object[] paramArrayOfObject) {
    World world = (World)paramArrayOfObject[0];
  }
  
  public void Vulcan_GN(Object[] paramArrayOfObject) {
    Entity entity = (Entity)paramArrayOfObject[0];
  }
  
  public void Vulcan_Ge(Object[] paramArrayOfObject) {
    Entity entity = (Entity)paramArrayOfObject[0];
  }
  
  public void Vulcan__o(Object[] paramArrayOfObject) {
    float f = ((Float)paramArrayOfObject[0]).floatValue();
  }
  
  public void Vulcan__T(Object[] paramArrayOfObject) {
    float f = ((Float)paramArrayOfObject[0]).floatValue();
  }
  
  public void Vulcan_Bi(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BI(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BL(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_a(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BG(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XX(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bu(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BC(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B4(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bh(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_F(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xw(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_XE(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_B_(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Bo(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_BX(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_Xe(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void Vulcan_X(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public Vulcan_hu Vulcan_e(Object[] paramArrayOfObject) {
    return this.Vulcan_bP;
  }
  
  public boolean Vulcan_Y(Object[] paramArrayOfObject) {
    return this.Vulcan_St;
  }
  
  public boolean Vulcan_s(Object[] paramArrayOfObject) {
    return this.Vulcan_T;
  }
  
  public boolean Vulcan_CL(Object[] paramArrayOfObject) {
    return this.Vulcan_SV;
  }
  
  public boolean Vulcan_C8(Object[] paramArrayOfObject) {
    return this.Vulcan_jn;
  }
  
  public boolean Vulcan_C0(Object[] paramArrayOfObject) {
    return this.Vulcan_b2;
  }
  
  public boolean Vulcan_C2(Object[] paramArrayOfObject) {
    return this.Vulcan_jc;
  }
  
  public boolean Vulcan_Cv(Object[] paramArrayOfObject) {
    return this.Vulcan_b6;
  }
  
  public boolean Vulcan_T(Object[] paramArrayOfObject) {
    return this.Vulcan_kN;
  }
  
  public boolean Vulcan_Z(Object[] paramArrayOfObject) {
    return this.Vulcan_kd;
  }
  
  public boolean Vulcan_u(Object[] paramArrayOfObject) {
    return this.Vulcan_kb;
  }
  
  public boolean Vulcan_Cb(Object[] paramArrayOfObject) {
    return this.Vulcan_ka;
  }
  
  public boolean Vulcan_c0(Object[] paramArrayOfObject) {
    return this.Vulcan_g;
  }
  
  public boolean Vulcan_l(Object[] paramArrayOfObject) {
    return this.Vulcan_x;
  }
  
  public boolean Vulcan_w(Object[] paramArrayOfObject) {
    return this.Vulcan_kF;
  }
  
  public boolean Vulcan_ca(Object[] paramArrayOfObject) {
    return this.Vulcan_bb;
  }
  
  public boolean Vulcan_Ct(Object[] paramArrayOfObject) {
    return this.Vulcan_y;
  }
  
  public boolean Vulcan_CH(Object[] paramArrayOfObject) {
    return this.Vulcan_kM;
  }
  
  public boolean Vulcan_C5(Object[] paramArrayOfObject) {
    return this.Vulcan_b_;
  }
  
  public boolean Vulcan_r(Object[] paramArrayOfObject) {
    return this.Vulcan_b4;
  }
  
  public boolean Vulcan_C1(Object[] paramArrayOfObject) {
    return this.Vulcan_a;
  }
  
  public boolean Vulcan_t(Object[] paramArrayOfObject) {
    return this.Vulcan_Sc;
  }
  
  public boolean Vulcan_A(Object[] paramArrayOfObject) {
    return this.Vulcan_jm;
  }
  
  public boolean Vulcan_Cd(Object[] paramArrayOfObject) {
    return this.Vulcan_B;
  }
  
  public boolean Vulcan_Ce(Object[] paramArrayOfObject) {
    return this.Vulcan_Si;
  }
  
  public boolean Vulcan_c3(Object[] paramArrayOfObject) {
    return this.Vulcan_C;
  }
  
  public boolean Vulcan_cA(Object[] paramArrayOfObject) {
    return this.Vulcan_SL;
  }
  
  public boolean Vulcan_Ci(Object[] paramArrayOfObject) {
    return this.Vulcan_S_;
  }
  
  public boolean Vulcan_V(Object[] paramArrayOfObject) {
    return this.Vulcan_kk;
  }
  
  public boolean Vulcan_CN(Object[] paramArrayOfObject) {
    return this.Vulcan_Ss;
  }
  
  public boolean Vulcan_z(Object[] paramArrayOfObject) {
    return this.Vulcan_j;
  }
  
  public boolean Vulcan_Cf(Object[] paramArrayOfObject) {
    return this.Vulcan_S1;
  }
  
  public boolean Vulcan_Cq(Object[] paramArrayOfObject) {
    return this.Vulcan_j2;
  }
  
  public boolean Vulcan_j(Object[] paramArrayOfObject) {
    return this.Vulcan_kP;
  }
  
  public boolean Vulcan_i(Object[] paramArrayOfObject) {
    return this.Vulcan_kB;
  }
  
  public boolean Vulcan_CW(Object[] paramArrayOfObject) {
    return this.Vulcan_bi;
  }
  
  public boolean Vulcan_C7(Object[] paramArrayOfObject) {
    return this.Vulcan_e;
  }
  
  public boolean Vulcan_k(Object[] paramArrayOfObject) {
    return this.Vulcan_bB;
  }
  
  public boolean Vulcan_CG(Object[] paramArrayOfObject) {
    return this.Vulcan_o;
  }
  
  public boolean Vulcan_CY(Object[] paramArrayOfObject) {
    return this.Vulcan_k0;
  }
  
  public boolean Vulcan_CF(Object[] paramArrayOfObject) {
    return this.Vulcan_Sw;
  }
  
  public boolean Vulcan_Q(Object[] paramArrayOfObject) {
    return this.Vulcan_jD;
  }
  
  public boolean Vulcan_M(Object[] paramArrayOfObject) {
    return this.Vulcan_bJ;
  }
  
  public boolean Vulcan_Ck(Object[] paramArrayOfObject) {
    return this.Vulcan_Sr;
  }
  
  public boolean Vulcan_c6(Object[] paramArrayOfObject) {
    return this.Vulcan_bF;
  }
  
  public boolean Vulcan_Cy(Object[] paramArrayOfObject) {
    return this.Vulcan_k2;
  }
  
  public boolean Vulcan_Cn(Object[] paramArrayOfObject) {
    return this.Vulcan_SC;
  }
  
  public boolean Vulcan_CC(Object[] paramArrayOfObject) {
    return this.Vulcan_L;
  }
  
  public boolean Vulcan_cm(Object[] paramArrayOfObject) {
    return this.Vulcan_kj;
  }
  
  public boolean Vulcan_Ca(Object[] paramArrayOfObject) {
    return this.Vulcan_j1;
  }
  
  public boolean Vulcan_CJ(Object[] paramArrayOfObject) {
    return this.Vulcan_Sg;
  }
  
  public boolean Vulcan_Cg(Object[] paramArrayOfObject) {
    return this.Vulcan_X;
  }
  
  public boolean Vulcan_x(Object[] paramArrayOfObject) {
    return this.Vulcan_SF;
  }
  
  public boolean Vulcan_o(Object[] paramArrayOfObject) {
    return this.Vulcan_K;
  }
  
  public boolean Vulcan_Cj(Object[] paramArrayOfObject) {
    return this.Vulcan_SH;
  }
  
  public boolean Vulcan_L(Object[] paramArrayOfObject) {
    return this.Vulcan_bC;
  }
  
  public boolean Vulcan_CK(Object[] paramArrayOfObject) {
    return this.Vulcan_b7;
  }
  
  public boolean Vulcan_cy(Object[] paramArrayOfObject) {
    return this.Vulcan_jR;
  }
  
  public boolean Vulcan_h(Object[] paramArrayOfObject) {
    return this.Vulcan_ja;
  }
  
  public boolean Vulcan_K(Object[] paramArrayOfObject) {
    return this.Vulcan_j9;
  }
  
  public boolean Vulcan_C(Object[] paramArrayOfObject) {
    return this.Vulcan_h;
  }
  
  public boolean Vulcan_CT(Object[] paramArrayOfObject) {
    return this.Vulcan_r;
  }
  
  public boolean Vulcan_G(Object[] paramArrayOfObject) {
    return this.Vulcan_bN;
  }
  
  public boolean Vulcan_CI(Object[] paramArrayOfObject) {
    return this.Vulcan_bx;
  }
  
  public boolean Vulcan_E(Object[] paramArrayOfObject) {
    return this.Vulcan_jF;
  }
  
  public boolean Vulcan_v(Object[] paramArrayOfObject) {
    return this.Vulcan_ku;
  }
  
  public boolean Vulcan_P(Object[] paramArrayOfObject) {
    return this.Vulcan_b1;
  }
  
  public boolean Vulcan_d(Object[] paramArrayOfObject) {
    return this.Vulcan_bO;
  }
  
  public boolean Vulcan_cC(Object[] paramArrayOfObject) {
    return this.Vulcan_jE;
  }
  
  public boolean Vulcan_CZ(Object[] paramArrayOfObject) {
    return this.Vulcan_k1;
  }
  
  public boolean Vulcan_O(Object[] paramArrayOfObject) {
    return this.Vulcan_jx;
  }
  
  public boolean Vulcan_CV(Object[] paramArrayOfObject) {
    return this.Vulcan_kV;
  }
  
  public boolean Vulcan_q(Object[] paramArrayOfObject) {
    return this.Vulcan_bM;
  }
  
  public boolean Vulcan_c8(Object[] paramArrayOfObject) {
    return this.Vulcan_So;
  }
  
  public boolean Vulcan_CX(Object[] paramArrayOfObject) {
    return this.Vulcan_H;
  }
  
  public boolean Vulcan_N(Object[] paramArrayOfObject) {
    return this.Vulcan_kA;
  }
  
  public boolean Vulcan_g(Object[] paramArrayOfObject) {
    return this.Vulcan_Sz;
  }
  
  public boolean Vulcan_CR(Object[] paramArrayOfObject) {
    return this.Vulcan_m;
  }
  
  public boolean Vulcan_Cr(Object[] paramArrayOfObject) {
    return this.Vulcan_bm;
  }
  
  public boolean Vulcan_Ch(Object[] paramArrayOfObject) {
    return this.Vulcan_kD;
  }
  
  public boolean Vulcan_J(Object[] paramArrayOfObject) {
    return this.Vulcan_bT;
  }
  
  public boolean Vulcan_CB(Object[] paramArrayOfObject) {
    return this.Vulcan_bQ;
  }
  
  public boolean Vulcan_X(Object[] paramArrayOfObject) {
    return this.Vulcan_Sl;
  }
  
  public boolean Vulcan_W(Object[] paramArrayOfObject) {
    return this.Vulcan_b8;
  }
  
  public boolean Vulcan_H(Object[] paramArrayOfObject) {
    return this.Vulcan_SS;
  }
  
  public boolean Vulcan_Cw(Object[] paramArrayOfObject) {
    return this.Vulcan_z;
  }
  
  public boolean Vulcan_p(Object[] paramArrayOfObject) {
    return this.Vulcan_kK;
  }
  
  public boolean Vulcan_c(Object[] paramArrayOfObject) {
    return this.Vulcan_I;
  }
  
  public boolean Vulcan_m(Object[] paramArrayOfObject) {
    return this.Vulcan_kv;
  }
  
  public boolean Vulcan_Cs(Object[] paramArrayOfObject) {
    return this.Vulcan_bl;
  }
  
  public boolean Vulcan_a(Object[] paramArrayOfObject) {
    return this.Vulcan_bg;
  }
  
  public boolean Vulcan_F(Object[] paramArrayOfObject) {
    return this.Vulcan_kh;
  }
  
  public boolean Vulcan_D(Object[] paramArrayOfObject) {
    return this.Vulcan_kx;
  }
  
  public boolean Vulcan_C3(Object[] paramArrayOfObject) {
    return this.Vulcan_bV;
  }
  
  public boolean Vulcan_Cl(Object[] paramArrayOfObject) {
    return this.Vulcan_v;
  }
  
  public boolean Vulcan_C4(Object[] paramArrayOfObject) {
    return this.Vulcan_bE;
  }
  
  public boolean Vulcan__(Object[] paramArrayOfObject) {
    return this.Vulcan_bc;
  }
  
  public boolean Vulcan_Cz(Object[] paramArrayOfObject) {
    return this.Vulcan_Sa;
  }
  
  public boolean Vulcan_CQ(Object[] paramArrayOfObject) {
    return this.Vulcan_j8;
  }
  
  public boolean Vulcan_I(Object[] paramArrayOfObject) {
    return this.Vulcan_jX;
  }
  
  public boolean Vulcan_Cp(Object[] paramArrayOfObject) {
    return this.Vulcan_SN;
  }
  
  public boolean Vulcan_R(Object[] paramArrayOfObject) {
    return this.Vulcan_Sj;
  }
  
  public boolean Vulcan_CO(Object[] paramArrayOfObject) {
    return this.Vulcan_kq;
  }
  
  public boolean Vulcan_b(Object[] paramArrayOfObject) {
    return this.Vulcan_Sm;
  }
  
  public Location Vulcan_s(Object[] paramArrayOfObject) {
    return this.Vulcan_bq;
  }
  
  public Location Vulcan_b(Object[] paramArrayOfObject) {
    return this.Vulcan_Sh;
  }
  
  private short Vulcan_M = -30768;
  
  public short Vulcan_T(Object[] paramArrayOfObject) {
    return this.Vulcan_M;
  }
  
  private short Vulcan_J = -30768;
  
  public short Vulcan_s(Object[] paramArrayOfObject) {
    return this.Vulcan_J;
  }
  
  private final Map Vulcan_ko = new HashMap<>();
  
  public boolean Vulcan_kW;
  
  public List Vulcan_SO;
  
  private Material Vulcan_Se;
  
  private Material Vulcan_k;
  
  private Material Vulcan_be;
  
  private List Vulcan_S5;
  
  private List Vulcan_SM;
  
  private List Vulcan_SQ;
  
  private List Vulcan_t;
  
  private List Vulcan__;
  
  public List Vulcan_p;
  
  public List Vulcan_km;
  
  public List Vulcan_bX;
  
  public Material Vulcan_bA;
  
  public Material Vulcan_Sy;
  
  public Material Vulcan_SG;
  
  private double Vulcan_SD;
  
  private double Vulcan_bh;
  
  private double Vulcan_SP;
  
  private double Vulcan_k8;
  
  private double Vulcan_bD;
  
  private double Vulcan_jL;
  
  private double Vulcan_bo;
  
  private double Vulcan_k4;
  
  private double Vulcan_kc;
  
  private double Vulcan_V;
  
  private double Vulcan_Sx;
  
  private double Vulcan_kO;
  
  private double Vulcan_Y;
  
  private double Vulcan_SA;
  
  private double Vulcan_bf;
  
  private double Vulcan_bk;
  
  private double Vulcan_l;
  
  private double Vulcan_jo;
  
  private double Vulcan_u;
  
  private double Vulcan_n;
  
  private double Vulcan_Su;
  
  private double Vulcan_bS;
  
  private double Vulcan_kz;
  
  private double Vulcan_Q;
  
  private double Vulcan_ks;
  
  private double Vulcan_c;
  
  private double Vulcan_S4;
  
  private double Vulcan_kT;
  
  private double Vulcan_jU;
  
  private double Vulcan_D;
  
  private double Vulcan_jP;
  
  private double Vulcan_S8;
  
  private double Vulcan_SY;
  
  private double Vulcan_bu;
  
  private double Vulcan_jf;
  
  private double Vulcan_kU;
  
  private double Vulcan_k9;
  
  private double Vulcan_SW;
  
  private double Vulcan_S9;
  
  private double Vulcan_bw;
  
  private double Vulcan_bz;
  
  private double Vulcan_br;
  
  private double Vulcan_Sk;
  
  private double Vulcan_ST;
  
  private double Vulcan_N;
  
  private double Vulcan_Sv;
  
  private double Vulcan_jN;
  
  public Map Vulcan_K(Object[] paramArrayOfObject) {
    return this.Vulcan_ko;
  }
  
  public void Vulcan_Xn(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public boolean Vulcan_C_(Object[] paramArrayOfObject) {
    return this.Vulcan_kW;
  }
  
  public void Vulcan_vw(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public List Vulcan_s(Object[] paramArrayOfObject) {
    return this.Vulcan_SO;
  }
  
  public Material Vulcan_L(Object[] paramArrayOfObject) {
    return this.Vulcan_Se;
  }
  
  public Material Vulcan_g(Object[] paramArrayOfObject) {
    return this.Vulcan_k;
  }
  
  public Material Vulcan_d(Object[] paramArrayOfObject) {
    return this.Vulcan_be;
  }
  
  public List Vulcan_Y(Object[] paramArrayOfObject) {
    return this.Vulcan_S5;
  }
  
  public List Vulcan_y(Object[] paramArrayOfObject) {
    return this.Vulcan_SM;
  }
  
  public List Vulcan_c(Object[] paramArrayOfObject) {
    return this.Vulcan_SQ;
  }
  
  public List Vulcan_A(Object[] paramArrayOfObject) {
    return this.Vulcan_t;
  }
  
  public List Vulcan_b(Object[] paramArrayOfObject) {
    return this.Vulcan__;
  }
  
  public void Vulcan_vG(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public void Vulcan_vR(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public void Vulcan_vY(Object[] paramArrayOfObject) {
    List list = (List)paramArrayOfObject[0];
  }
  
  public List Vulcan_H(Object[] paramArrayOfObject) {
    return this.Vulcan_p;
  }
  
  public List Vulcan_J(Object[] paramArrayOfObject) {
    return this.Vulcan_km;
  }
  
  public List Vulcan_j(Object[] paramArrayOfObject) {
    return this.Vulcan_bX;
  }
  
  public void Vulcan_s(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
  }
  
  public void Vulcan_ho(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
  }
  
  public void Vulcan_h4(Object[] paramArrayOfObject) {
    Material material = (Material)paramArrayOfObject[0];
  }
  
  public Material Vulcan_K(Object[] paramArrayOfObject) {
    return this.Vulcan_bA;
  }
  
  public Material Vulcan_C(Object[] paramArrayOfObject) {
    return this.Vulcan_Sy;
  }
  
  public Material Vulcan_N(Object[] paramArrayOfObject) {
    return this.Vulcan_SG;
  }
  
  public double Vulcan_r(Object[] paramArrayOfObject) {
    return this.Vulcan_SD;
  }
  
  public double Vulcan_z(Object[] paramArrayOfObject) {
    return this.Vulcan_bh;
  }
  
  public double Vulcan_u(Object[] paramArrayOfObject) {
    return this.Vulcan_SP;
  }
  
  public double Vulcan_q(Object[] paramArrayOfObject) {
    return this.Vulcan_k8;
  }
  
  public double Vulcan_N(Object[] paramArrayOfObject) {
    return this.Vulcan_bD;
  }
  
  public double Vulcan_j(Object[] paramArrayOfObject) {
    return this.Vulcan_jL;
  }
  
  public double Vulcan__(Object[] paramArrayOfObject) {
    return this.Vulcan_bo;
  }
  
  public double Vulcan_E(Object[] paramArrayOfObject) {
    return this.Vulcan_k4;
  }
  
  public double Vulcan_m(Object[] paramArrayOfObject) {
    return this.Vulcan_kc;
  }
  
  public double Vulcan_T(Object[] paramArrayOfObject) {
    return this.Vulcan_V;
  }
  
  public double Vulcan_i(Object[] paramArrayOfObject) {
    return this.Vulcan_Sx;
  }
  
  public double Vulcan_y(Object[] paramArrayOfObject) {
    return this.Vulcan_kO;
  }
  
  public double Vulcan_k(Object[] paramArrayOfObject) {
    return this.Vulcan_Y;
  }
  
  public double Vulcan_n(Object[] paramArrayOfObject) {
    return this.Vulcan_SA;
  }
  
  public double Vulcan_A(Object[] paramArrayOfObject) {
    return this.Vulcan_bf;
  }
  
  public double Vulcan_V(Object[] paramArrayOfObject) {
    return this.Vulcan_bk;
  }
  
  public double Vulcan_D(Object[] paramArrayOfObject) {
    return this.Vulcan_l;
  }
  
  public double Vulcan_v(Object[] paramArrayOfObject) {
    return this.Vulcan_jo;
  }
  
  public double Vulcan_o(Object[] paramArrayOfObject) {
    return this.Vulcan_u;
  }
  
  public double Vulcan_J(Object[] paramArrayOfObject) {
    return this.Vulcan_n;
  }
  
  public double Vulcan_H(Object[] paramArrayOfObject) {
    return this.Vulcan_Su;
  }
  
  public double Vulcan_Z(Object[] paramArrayOfObject) {
    return this.Vulcan_bS;
  }
  
  public double Vulcan_G(Object[] paramArrayOfObject) {
    return this.Vulcan_kz;
  }
  
  public double Vulcan_h(Object[] paramArrayOfObject) {
    return this.Vulcan_Q;
  }
  
  public double Vulcan_b(Object[] paramArrayOfObject) {
    return this.Vulcan_ks;
  }
  
  public double Vulcan_C(Object[] paramArrayOfObject) {
    return this.Vulcan_c;
  }
  
  public double Vulcan_O(Object[] paramArrayOfObject) {
    return this.Vulcan_S4;
  }
  
  public double Vulcan_I(Object[] paramArrayOfObject) {
    return this.Vulcan_kT;
  }
  
  public double Vulcan_R(Object[] paramArrayOfObject) {
    return this.Vulcan_jU;
  }
  
  public double Vulcan_S(Object[] paramArrayOfObject) {
    return this.Vulcan_D;
  }
  
  public double Vulcan_t(Object[] paramArrayOfObject) {
    return this.Vulcan_jP;
  }
  
  public double Vulcan_Y(Object[] paramArrayOfObject) {
    return this.Vulcan_S8;
  }
  
  public double Vulcan_B(Object[] paramArrayOfObject) {
    return this.Vulcan_SY;
  }
  
  public double Vulcan_d(Object[] paramArrayOfObject) {
    return this.Vulcan_bu;
  }
  
  public double Vulcan_p(Object[] paramArrayOfObject) {
    return this.Vulcan_jf;
  }
  
  public double Vulcan_L(Object[] paramArrayOfObject) {
    return this.Vulcan_kU;
  }
  
  public double Vulcan_c(Object[] paramArrayOfObject) {
    return this.Vulcan_k9;
  }
  
  public double Vulcan_a(Object[] paramArrayOfObject) {
    return this.Vulcan_SW;
  }
  
  public double Vulcan_P(Object[] paramArrayOfObject) {
    return this.Vulcan_S9;
  }
  
  public double Vulcan_s(Object[] paramArrayOfObject) {
    return this.Vulcan_bw;
  }
  
  public double Vulcan_X(Object[] paramArrayOfObject) {
    return this.Vulcan_bz;
  }
  
  public double Vulcan_U(Object[] paramArrayOfObject) {
    return this.Vulcan_br;
  }
  
  public double Vulcan_f(Object[] paramArrayOfObject) {
    return this.Vulcan_Sk;
  }
  
  public double Vulcan_F(Object[] paramArrayOfObject) {
    return this.Vulcan_ST;
  }
  
  public double Vulcan_g(Object[] paramArrayOfObject) {
    return this.Vulcan_N;
  }
  
  public double Vulcan_l(Object[] paramArrayOfObject) {
    return this.Vulcan_Sv;
  }
  
  public double Vulcan_W(Object[] paramArrayOfObject) {
    return this.Vulcan_jN;
  }
  
  private int Vulcan_SE = 100;
  
  private int Vulcan_bt = 100;
  
  private int Vulcan_i = 100;
  
  private int Vulcan_R;
  
  private int Vulcan_bI;
  
  private int Vulcan_S7 = 100;
  
  private int Vulcan_b = 200;
  
  private int Vulcan_bK = 100;
  
  private int Vulcan_SJ;
  
  private int Vulcan_Sb = 100;
  
  private int Vulcan_jS = 100;
  
  private int Vulcan_Sq = 100;
  
  private int Vulcan_F;
  
  private int Vulcan_d = 100;
  
  private int Vulcan_SU;
  
  private int Vulcan_kX;
  
  private int Vulcan_kw = 100;
  
  private int Vulcan_Sn = 100;
  
  private int Vulcan_S2;
  
  private int Vulcan_ki = 100;
  
  private int Vulcan_je = 100;
  
  private int Vulcan_S0 = 100;
  
  private int Vulcan_kr = 100;
  
  private int Vulcan_O = 100;
  
  private int Vulcan_k7 = 100;
  
  private int Vulcan_bv = 100;
  
  private int Vulcan_bZ;
  
  private int Vulcan_bs;
  
  private int Vulcan_kJ = 200;
  
  private int Vulcan_bG = 100;
  
  private int Vulcan_ky = 100;
  
  private int Vulcan_b9;
  
  private int Vulcan_bj = 100;
  
  private int Vulcan_jd;
  
  private int Vulcan_kQ = 500;
  
  private int Vulcan_jG = 500;
  
  private int Vulcan_SK = 500;
  
  private int Vulcan_kL = 150;
  
  private int Vulcan_kH = 150;
  
  private int Vulcan_kg = 150;
  
  private int Vulcan_f;
  
  private int Vulcan_bL;
  
  private int Vulcan_bp;
  
  private int Vulcan_jl;
  
  private int Vulcan_bW = 100;
  
  private int Vulcan_bd = 500;
  
  private int Vulcan_SB;
  
  private int Vulcan_S;
  
  private int Vulcan_bU = 100;
  
  private int Vulcan_SR = 100;
  
  private int Vulcan_kS;
  
  private int Vulcan_b3 = 100;
  
  private int Vulcan_b5;
  
  private int Vulcan_U;
  
  private int Vulcan_w = 100;
  
  private int Vulcan_b0 = 100;
  
  private int Vulcan_k_ = 1000;
  
  private int Vulcan_S6 = 100;
  
  private int Vulcan_bn = 200;
  
  private int Vulcan_q = 100;
  
  private int Vulcan_Sf = 1000;
  
  private int Vulcan_bH = 1000;
  
  private int Vulcan_bY = 1000;
  
  private int Vulcan_SX = 1000;
  
  private int Vulcan_k3 = 0;
  
  private int Vulcan_bR = 1000;
  
  private int Vulcan_k6 = 100;
  
  private int Vulcan_jY = 1000;
  
  private int Vulcan_kp = 100;
  
  private int Vulcan_kn = 100;
  
  private int Vulcan_by = 100;
  
  private int Vulcan_ba = 100;
  
  private int Vulcan_jb = 100;
  
  private int Vulcan_ke = 100;
  
  private int Vulcan_SI = 1000;
  
  private World Vulcan_Sp;
  
  private Entity Vulcan_kY;
  
  private Entity Vulcan_kZ;
  
  public int Vulcan_t(Object[] paramArrayOfObject) {
    return this.Vulcan_SE;
  }
  
  public int Vulcan_v3(Object[] paramArrayOfObject) {
    return this.Vulcan_bt;
  }
  
  public int Vulcan_vO(Object[] paramArrayOfObject) {
    return this.Vulcan_i;
  }
  
  public int Vulcan_U(Object[] paramArrayOfObject) {
    return this.Vulcan_R;
  }
  
  public int Vulcan_s(Object[] paramArrayOfObject) {
    return this.Vulcan_bI;
  }
  
  public int Vulcan_H(Object[] paramArrayOfObject) {
    return this.Vulcan_S7;
  }
  
  public int Vulcan_vk(Object[] paramArrayOfObject) {
    return this.Vulcan_b;
  }
  
  public int Vulcan_vL(Object[] paramArrayOfObject) {
    return this.Vulcan_bK;
  }
  
  public int Vulcan_vR(Object[] paramArrayOfObject) {
    return this.Vulcan_SJ;
  }
  
  public int Vulcan_C(Object[] paramArrayOfObject) {
    return this.Vulcan_Sb;
  }
  
  public int Vulcan_u(Object[] paramArrayOfObject) {
    return this.Vulcan_jS;
  }
  
  public int Vulcan_vw(Object[] paramArrayOfObject) {
    return this.Vulcan_Sq;
  }
  
  public int Vulcan_vd(Object[] paramArrayOfObject) {
    return this.Vulcan_F;
  }
  
  public int Vulcan_b(Object[] paramArrayOfObject) {
    return this.Vulcan_d;
  }
  
  public int Vulcan_P(Object[] paramArrayOfObject) {
    return this.Vulcan_SU;
  }
  
  public int Vulcan_X(Object[] paramArrayOfObject) {
    return this.Vulcan_kX;
  }
  
  public int Vulcan_vZ(Object[] paramArrayOfObject) {
    return this.Vulcan_kw;
  }
  
  public int Vulcan_vy(Object[] paramArrayOfObject) {
    return this.Vulcan_Sn;
  }
  
  public int Vulcan_D(Object[] paramArrayOfObject) {
    return this.Vulcan_S2;
  }
  
  public int Vulcan_a(Object[] paramArrayOfObject) {
    return this.Vulcan_ki;
  }
  
  public int Vulcan_v1(Object[] paramArrayOfObject) {
    return this.Vulcan_je;
  }
  
  public int Vulcan_F(Object[] paramArrayOfObject) {
    return this.Vulcan_S0;
  }
  
  public int Vulcan_j(Object[] paramArrayOfObject) {
    return this.Vulcan_kr;
  }
  
  public int Vulcan_v(Object[] paramArrayOfObject) {
    return this.Vulcan_O;
  }
  
  public int Vulcan_m(Object[] paramArrayOfObject) {
    return this.Vulcan_k7;
  }
  
  public int Vulcan_vs(Object[] paramArrayOfObject) {
    return this.Vulcan_bv;
  }
  
  public int Vulcan_vv(Object[] paramArrayOfObject) {
    return this.Vulcan_bZ;
  }
  
  public int Vulcan_f(Object[] paramArrayOfObject) {
    return this.Vulcan_bs;
  }
  
  public int Vulcan_B(Object[] paramArrayOfObject) {
    return this.Vulcan_kJ;
  }
  
  public int Vulcan_vA(Object[] paramArrayOfObject) {
    return this.Vulcan_bG;
  }
  
  public int Vulcan_h(Object[] paramArrayOfObject) {
    return this.Vulcan_ky;
  }
  
  public int Vulcan_p(Object[] paramArrayOfObject) {
    return this.Vulcan_b9;
  }
  
  public int Vulcan_vr(Object[] paramArrayOfObject) {
    return this.Vulcan_bj;
  }
  
  public int Vulcan_G(Object[] paramArrayOfObject) {
    return this.Vulcan_jd;
  }
  
  public int Vulcan_o(Object[] paramArrayOfObject) {
    return this.Vulcan_kQ;
  }
  
  public int Vulcan_N(Object[] paramArrayOfObject) {
    return this.Vulcan_jG;
  }
  
  public int Vulcan_J(Object[] paramArrayOfObject) {
    return this.Vulcan_SK;
  }
  
  public int Vulcan_K(Object[] paramArrayOfObject) {
    return this.Vulcan_kL;
  }
  
  public int Vulcan_q(Object[] paramArrayOfObject) {
    return this.Vulcan_kH;
  }
  
  public int Vulcan_O(Object[] paramArrayOfObject) {
    return this.Vulcan_kg;
  }
  
  public int Vulcan_l(Object[] paramArrayOfObject) {
    return this.Vulcan_f;
  }
  
  public int Vulcan_vY(Object[] paramArrayOfObject) {
    return this.Vulcan_bL;
  }
  
  public int Vulcan_vN(Object[] paramArrayOfObject) {
    return this.Vulcan_bp;
  }
  
  public int Vulcan_z(Object[] paramArrayOfObject) {
    return this.Vulcan_jl;
  }
  
  public int Vulcan_r(Object[] paramArrayOfObject) {
    return this.Vulcan_bW;
  }
  
  public int Vulcan_R(Object[] paramArrayOfObject) {
    return this.Vulcan_bd;
  }
  
  public int Vulcan_T(Object[] paramArrayOfObject) {
    return this.Vulcan_SB;
  }
  
  public int Vulcan_d(Object[] paramArrayOfObject) {
    return this.Vulcan_S;
  }
  
  public int Vulcan_E(Object[] paramArrayOfObject) {
    return this.Vulcan_bU;
  }
  
  public int Vulcan_vt(Object[] paramArrayOfObject) {
    return this.Vulcan_SR;
  }
  
  public int Vulcan_i(Object[] paramArrayOfObject) {
    return this.Vulcan_kS;
  }
  
  public int Vulcan_V(Object[] paramArrayOfObject) {
    return this.Vulcan_b3;
  }
  
  public int Vulcan_x(Object[] paramArrayOfObject) {
    return this.Vulcan_b5;
  }
  
  public int Vulcan_S(Object[] paramArrayOfObject) {
    return this.Vulcan_U;
  }
  
  public int Vulcan_k(Object[] paramArrayOfObject) {
    return this.Vulcan_w;
  }
  
  public int Vulcan__(Object[] paramArrayOfObject) {
    return this.Vulcan_b0;
  }
  
  public int Vulcan_W(Object[] paramArrayOfObject) {
    return this.Vulcan_k_;
  }
  
  public int Vulcan_n(Object[] paramArrayOfObject) {
    return this.Vulcan_S6;
  }
  
  public int Vulcan_vU(Object[] paramArrayOfObject) {
    return this.Vulcan_bn;
  }
  
  public int Vulcan_Z(Object[] paramArrayOfObject) {
    return this.Vulcan_q;
  }
  
  public int Vulcan_Y(Object[] paramArrayOfObject) {
    return this.Vulcan_Sf;
  }
  
  public int Vulcan_A(Object[] paramArrayOfObject) {
    return this.Vulcan_bH;
  }
  
  public int Vulcan_vT(Object[] paramArrayOfObject) {
    return this.Vulcan_bY;
  }
  
  public int Vulcan_M(Object[] paramArrayOfObject) {
    return this.Vulcan_SX;
  }
  
  public int Vulcan_e(Object[] paramArrayOfObject) {
    return this.Vulcan_k3;
  }
  
  public int Vulcan_L(Object[] paramArrayOfObject) {
    return this.Vulcan_bR;
  }
  
  public int Vulcan_y(Object[] paramArrayOfObject) {
    return this.Vulcan_k6;
  }
  
  public int Vulcan_g(Object[] paramArrayOfObject) {
    return this.Vulcan_jY;
  }
  
  public int Vulcan_w(Object[] paramArrayOfObject) {
    return this.Vulcan_kp;
  }
  
  public int Vulcan_vx(Object[] paramArrayOfObject) {
    return this.Vulcan_kn;
  }
  
  public int Vulcan_v9(Object[] paramArrayOfObject) {
    return this.Vulcan_by;
  }
  
  public int Vulcan_Q(Object[] paramArrayOfObject) {
    return this.Vulcan_ba;
  }
  
  public int Vulcan_I(Object[] paramArrayOfObject) {
    return this.Vulcan_jb;
  }
  
  public int Vulcan_vf(Object[] paramArrayOfObject) {
    return this.Vulcan_ke;
  }
  
  public int Vulcan_c(Object[] paramArrayOfObject) {
    return this.Vulcan_SI;
  }
  
  public World Vulcan_l(Object[] paramArrayOfObject) {
    return this.Vulcan_Sp;
  }
  
  public Entity Vulcan_h(Object[] paramArrayOfObject) {
    return this.Vulcan_kY;
  }
  
  public Entity Vulcan_G(Object[] paramArrayOfObject) {
    return this.Vulcan_kZ;
  }
  
  private float Vulcan_E = 0.2F;
  
  private float Vulcan_SZ = 0.2F;
  
  private boolean Vulcan_s;
  
  private boolean Vulcan_A;
  
  private boolean Vulcan_kl;
  
  private boolean Vulcan_kR;
  
  private boolean Vulcan_Z;
  
  private boolean Vulcan_kf;
  
  private boolean Vulcan_kI;
  
  private boolean Vulcan_P;
  
  private boolean Vulcan_kC;
  
  private boolean Vulcan_kG;
  
  private boolean Vulcan_k5;
  
  private boolean Vulcan_jQ;
  
  private boolean Vulcan_jk;
  
  private boolean Vulcan_kE;
  
  private boolean Vulcan_W;
  
  private boolean Vulcan_kt;
  
  private boolean Vulcan_Sd;
  
  private boolean Vulcan_G;
  
  private static AbstractCheck[] Vulcan_S3;
  
  private static final long a = Vulcan_e.a(-5575232795306878591L, -172646121173080526L, MethodHandles.lookup().lookupClass()).a(227596230908881L);
  
  private static final String[] b;
  
  public float Vulcan_I(Object[] paramArrayOfObject) {
    return this.Vulcan_E;
  }
  
  public float Vulcan_F(Object[] paramArrayOfObject) {
    return this.Vulcan_SZ;
  }
  
  public Vulcan_Ke(Vulcan_hu paramVulcan_hu) {
    this.Vulcan_bP = paramVulcan_hu;
  }
  
  public void Vulcan_te(Object[] paramArrayOfObject) {
    this.Vulcan_E = this.Vulcan_bP.Vulcan_L(new Object[0]).getWalkSpeed();
    Location location = this.Vulcan_bP.Vulcan_L(new Object[0]).getLocation();
    this.Vulcan_Sk = location.getX();
    this.Vulcan_ST = location.getY();
    this.Vulcan_N = location.getZ();
    this.Vulcan_SY = location.getX();
    this.Vulcan_bu = location.getY();
    this.Vulcan_jf = location.getZ();
  }
  
  public void Vulcan_L7(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPlayerFlying
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: lload_2
    //   27: dup2
    //   28: ldc2_w 94508272756719
    //   31: lxor
    //   32: lstore #5
    //   34: dup2
    //   35: ldc2_w 121979236003943
    //   38: lxor
    //   39: lstore #7
    //   41: dup2
    //   42: ldc2_w 140649209846905
    //   45: lxor
    //   46: lstore #9
    //   48: dup2
    //   49: ldc2_w 49107393441747
    //   52: lxor
    //   53: lstore #11
    //   55: dup2
    //   56: ldc2_w 54644489690440
    //   59: lxor
    //   60: lstore #13
    //   62: dup2
    //   63: ldc2_w 81847419008273
    //   66: lxor
    //   67: lstore #15
    //   69: dup2
    //   70: ldc2_w 31458430525448
    //   73: lxor
    //   74: lstore #17
    //   76: pop2
    //   77: aload_0
    //   78: aload_0
    //   79: getfield Vulcan_jE : Z
    //   82: putfield Vulcan_bT : Z
    //   85: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   88: aload_0
    //   89: aload_0
    //   90: getfield Vulcan_bF : Z
    //   93: putfield Vulcan_jE : Z
    //   96: aload_0
    //   97: aload #4
    //   99: invokevirtual isOnGround : ()Z
    //   102: putfield Vulcan_bF : Z
    //   105: aload_0
    //   106: lload #11
    //   108: iconst_1
    //   109: anewarray java/lang/Object
    //   112: dup_x2
    //   113: dup_x2
    //   114: pop
    //   115: invokestatic valueOf : (J)Ljava/lang/Long;
    //   118: iconst_0
    //   119: swap
    //   120: aastore
    //   121: invokevirtual Vulcan_tI : ([Ljava/lang/Object;)V
    //   124: astore #19
    //   126: aload_0
    //   127: aload_0
    //   128: getfield Vulcan_kq : Z
    //   131: putfield Vulcan_Sm : Z
    //   134: aload_0
    //   135: aload_0
    //   136: getfield Vulcan_Sj : Z
    //   139: putfield Vulcan_kq : Z
    //   142: aload_0
    //   143: aload #4
    //   145: invokevirtual hasPositionChanged : ()Z
    //   148: aload #19
    //   150: ifnull -> 183
    //   153: putfield Vulcan_Sj : Z
    //   156: aload #4
    //   158: invokevirtual hasPositionChanged : ()Z
    //   161: ifeq -> 1329
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   170: athrow
    //   171: aload_0
    //   172: aload_0
    //   173: getfield Vulcan_f : I
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   182: athrow
    //   183: aload #19
    //   185: lload_2
    //   186: lconst_0
    //   187: lcmp
    //   188: ifle -> 217
    //   191: ifnull -> 215
    //   194: ifne -> 266
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   203: athrow
    //   204: aload_0
    //   205: getfield Vulcan_bL : I
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: aload #19
    //   217: lload_2
    //   218: lconst_0
    //   219: lcmp
    //   220: iflt -> 249
    //   223: ifnull -> 247
    //   226: ifne -> 266
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   235: athrow
    //   236: aload_0
    //   237: getfield Vulcan_bp : I
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: aload #19
    //   249: ifnull -> 263
    //   252: ifne -> 266
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   261: athrow
    //   262: iconst_1
    //   263: goto -> 267
    //   266: iconst_0
    //   267: putfield Vulcan_bg : Z
    //   270: aload_0
    //   271: aload_0
    //   272: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   275: iconst_0
    //   276: anewarray java/lang/Object
    //   279: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   282: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   287: putfield Vulcan_Sp : Lorg/bukkit/World;
    //   290: aload_0
    //   291: aload_0
    //   292: getfield Vulcan_k8 : D
    //   295: putfield Vulcan_bw : D
    //   298: aload_0
    //   299: aload_0
    //   300: getfield Vulcan_bD : D
    //   303: putfield Vulcan_bz : D
    //   306: aload_0
    //   307: aload_0
    //   308: getfield Vulcan_jL : D
    //   311: putfield Vulcan_br : D
    //   314: aload_0
    //   315: aload_0
    //   316: getfield Vulcan_SD : D
    //   319: putfield Vulcan_k8 : D
    //   322: aload_0
    //   323: aload_0
    //   324: getfield Vulcan_bh : D
    //   327: putfield Vulcan_bD : D
    //   330: aload_0
    //   331: aload_0
    //   332: getfield Vulcan_SP : D
    //   335: putfield Vulcan_jL : D
    //   338: aload_0
    //   339: aload #4
    //   341: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   344: invokevirtual getX : ()D
    //   347: putfield Vulcan_SD : D
    //   350: aload_0
    //   351: aload #4
    //   353: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   356: invokevirtual getY : ()D
    //   359: putfield Vulcan_bh : D
    //   362: aload_0
    //   363: aload #4
    //   365: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   368: invokevirtual getZ : ()D
    //   371: putfield Vulcan_SP : D
    //   374: aload_0
    //   375: aload_0
    //   376: aload #19
    //   378: ifnull -> 425
    //   381: getfield Vulcan_Sh : Lorg/bukkit/Location;
    //   384: ifnonnull -> 424
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   393: athrow
    //   394: new org/bukkit/Location
    //   397: dup
    //   398: aload_0
    //   399: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   402: aload_0
    //   403: getfield Vulcan_SD : D
    //   406: aload_0
    //   407: getfield Vulcan_bh : D
    //   410: aload_0
    //   411: getfield Vulcan_SP : D
    //   414: invokespecial <init> : (Lorg/bukkit/World;DDD)V
    //   417: goto -> 428
    //   420: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   423: athrow
    //   424: aload_0
    //   425: getfield Vulcan_Sh : Lorg/bukkit/Location;
    //   428: putfield Vulcan_bq : Lorg/bukkit/Location;
    //   431: aload_0
    //   432: new org/bukkit/Location
    //   435: dup
    //   436: aload_0
    //   437: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   440: aload_0
    //   441: getfield Vulcan_SD : D
    //   444: aload_0
    //   445: getfield Vulcan_bh : D
    //   448: aload_0
    //   449: getfield Vulcan_SP : D
    //   452: invokespecial <init> : (Lorg/bukkit/World;DDD)V
    //   455: putfield Vulcan_Sh : Lorg/bukkit/Location;
    //   458: aload_0
    //   459: aload_0
    //   460: getfield Vulcan_SA : D
    //   463: putfield Vulcan_bk : D
    //   466: aload_0
    //   467: aload_0
    //   468: getfield Vulcan_bo : D
    //   471: putfield Vulcan_kO : D
    //   474: aload_0
    //   475: aload_0
    //   476: getfield Vulcan_k4 : D
    //   479: putfield Vulcan_SA : D
    //   482: aload_0
    //   483: aload_0
    //   484: getfield Vulcan_kc : D
    //   487: putfield Vulcan_Y : D
    //   490: aload_0
    //   491: aload_0
    //   492: getfield Vulcan_V : D
    //   495: putfield Vulcan_bf : D
    //   498: aload_0
    //   499: aload_0
    //   500: getfield Vulcan_SD : D
    //   503: aload_0
    //   504: getfield Vulcan_k8 : D
    //   507: dsub
    //   508: putfield Vulcan_bo : D
    //   511: aload_0
    //   512: aload_0
    //   513: getfield Vulcan_bh : D
    //   516: aload_0
    //   517: getfield Vulcan_bD : D
    //   520: dsub
    //   521: putfield Vulcan_k4 : D
    //   524: aload_0
    //   525: aload_0
    //   526: getfield Vulcan_SP : D
    //   529: aload_0
    //   530: getfield Vulcan_jL : D
    //   533: dsub
    //   534: putfield Vulcan_kc : D
    //   537: aload_0
    //   538: aload_0
    //   539: getfield Vulcan_bo : D
    //   542: aload_0
    //   543: getfield Vulcan_kc : D
    //   546: iconst_2
    //   547: anewarray java/lang/Object
    //   550: dup_x2
    //   551: dup_x2
    //   552: pop
    //   553: invokestatic valueOf : (D)Ljava/lang/Double;
    //   556: iconst_1
    //   557: swap
    //   558: aastore
    //   559: dup_x2
    //   560: dup_x2
    //   561: pop
    //   562: invokestatic valueOf : (D)Ljava/lang/Double;
    //   565: iconst_0
    //   566: swap
    //   567: aastore
    //   568: invokestatic Vulcan_e : ([Ljava/lang/Object;)D
    //   571: putfield Vulcan_V : D
    //   574: aload_0
    //   575: aload_0
    //   576: getfield Vulcan_bo : D
    //   579: aload_0
    //   580: getfield Vulcan_k4 : D
    //   583: aload_0
    //   584: getfield Vulcan_kc : D
    //   587: iconst_3
    //   588: anewarray java/lang/Object
    //   591: dup_x2
    //   592: dup_x2
    //   593: pop
    //   594: invokestatic valueOf : (D)Ljava/lang/Double;
    //   597: iconst_2
    //   598: swap
    //   599: aastore
    //   600: dup_x2
    //   601: dup_x2
    //   602: pop
    //   603: invokestatic valueOf : (D)Ljava/lang/Double;
    //   606: iconst_1
    //   607: swap
    //   608: aastore
    //   609: dup_x2
    //   610: dup_x2
    //   611: pop
    //   612: invokestatic valueOf : (D)Ljava/lang/Double;
    //   615: iconst_0
    //   616: swap
    //   617: aastore
    //   618: invokestatic Vulcan_z : ([Ljava/lang/Object;)D
    //   621: putfield Vulcan_Sx : D
    //   624: aload_0
    //   625: aload_0
    //   626: getfield Vulcan_bo : D
    //   629: invokestatic abs : (D)D
    //   632: dconst_0
    //   633: dcmpl
    //   634: aload #19
    //   636: ifnull -> 712
    //   639: ifgt -> 711
    //   642: goto -> 649
    //   645: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   648: athrow
    //   649: aload_0
    //   650: getfield Vulcan_kc : D
    //   653: invokestatic abs : (D)D
    //   656: dconst_0
    //   657: dcmpl
    //   658: aload #19
    //   660: ifnull -> 712
    //   663: goto -> 670
    //   666: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   669: athrow
    //   670: ifgt -> 711
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   679: athrow
    //   680: aload_0
    //   681: getfield Vulcan_k4 : D
    //   684: invokestatic abs : (D)D
    //   687: dconst_0
    //   688: dcmpl
    //   689: aload #19
    //   691: ifnull -> 712
    //   694: goto -> 701
    //   697: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   700: athrow
    //   701: ifle -> 715
    //   704: goto -> 711
    //   707: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   710: athrow
    //   711: iconst_1
    //   712: goto -> 716
    //   715: iconst_0
    //   716: putfield Vulcan_jF : Z
    //   719: aload_0
    //   720: aload_0
    //   721: getfield Vulcan_bh : D
    //   724: ldc2_w 0.015625
    //   727: drem
    //   728: dconst_0
    //   729: dcmpl
    //   730: aload #19
    //   732: ifnull -> 746
    //   735: ifne -> 749
    //   738: goto -> 745
    //   741: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   744: athrow
    //   745: iconst_1
    //   746: goto -> 750
    //   749: iconst_0
    //   750: lload_2
    //   751: lconst_0
    //   752: lcmp
    //   753: ifle -> 799
    //   756: putfield Vulcan_k2 : Z
    //   759: aload_0
    //   760: aload #19
    //   762: ifnull -> 798
    //   765: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   768: iconst_0
    //   769: anewarray java/lang/Object
    //   772: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   775: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   780: ifnonnull -> 802
    //   783: goto -> 790
    //   786: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   789: athrow
    //   790: aload_0
    //   791: goto -> 798
    //   794: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   797: athrow
    //   798: iconst_0
    //   799: putfield Vulcan_bs : I
    //   802: lload_2
    //   803: lconst_0
    //   804: lcmp
    //   805: iflt -> 874
    //   808: iconst_0
    //   809: anewarray java/lang/Object
    //   812: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   815: ifeq -> 855
    //   818: aload_0
    //   819: lload #7
    //   821: iconst_1
    //   822: anewarray java/lang/Object
    //   825: dup_x2
    //   826: dup_x2
    //   827: pop
    //   828: invokestatic valueOf : (J)Ljava/lang/Long;
    //   831: iconst_0
    //   832: swap
    //   833: aastore
    //   834: invokespecial Vulcan_t3 : ([Ljava/lang/Object;)V
    //   837: lload_2
    //   838: lconst_0
    //   839: lcmp
    //   840: iflt -> 938
    //   843: aload #19
    //   845: ifnonnull -> 881
    //   848: goto -> 855
    //   851: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   854: athrow
    //   855: aload_0
    //   856: lload #5
    //   858: iconst_1
    //   859: anewarray java/lang/Object
    //   862: dup_x2
    //   863: dup_x2
    //   864: pop
    //   865: invokestatic valueOf : (J)Ljava/lang/Long;
    //   868: iconst_0
    //   869: swap
    //   870: aastore
    //   871: invokespecial Vulcan_tL : ([Ljava/lang/Object;)V
    //   874: goto -> 881
    //   877: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   880: athrow
    //   881: aload_0
    //   882: lload #13
    //   884: iconst_1
    //   885: anewarray java/lang/Object
    //   888: dup_x2
    //   889: dup_x2
    //   890: pop
    //   891: invokestatic valueOf : (J)Ljava/lang/Long;
    //   894: iconst_0
    //   895: swap
    //   896: aastore
    //   897: invokespecial Vulcan_tF : ([Ljava/lang/Object;)V
    //   900: aload_0
    //   901: lload #15
    //   903: iconst_1
    //   904: anewarray java/lang/Object
    //   907: dup_x2
    //   908: dup_x2
    //   909: pop
    //   910: invokestatic valueOf : (J)Ljava/lang/Long;
    //   913: iconst_0
    //   914: swap
    //   915: aastore
    //   916: invokevirtual Vulcan_tw : ([Ljava/lang/Object;)V
    //   919: aload_0
    //   920: lload #17
    //   922: iconst_1
    //   923: anewarray java/lang/Object
    //   926: dup_x2
    //   927: dup_x2
    //   928: pop
    //   929: invokestatic valueOf : (J)Ljava/lang/Long;
    //   932: iconst_0
    //   933: swap
    //   934: aastore
    //   935: invokevirtual Vulcan_tq : ([Ljava/lang/Object;)V
    //   938: aload_0
    //   939: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   942: iconst_0
    //   943: anewarray java/lang/Object
    //   946: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   949: iconst_0
    //   950: anewarray java/lang/Object
    //   953: invokevirtual Vulcan_v : ([Ljava/lang/Object;)D
    //   956: ldc2_w 0.11
    //   959: dcmpl
    //   960: aload #19
    //   962: lload_2
    //   963: lconst_0
    //   964: lcmp
    //   965: iflt -> 1017
    //   968: ifnull -> 1015
    //   971: ifle -> 993
    //   974: goto -> 981
    //   977: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   980: athrow
    //   981: aload_0
    //   982: iconst_0
    //   983: putfield Vulcan_S6 : I
    //   986: goto -> 993
    //   989: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   992: athrow
    //   993: aload_0
    //   994: lload #9
    //   996: iconst_1
    //   997: anewarray java/lang/Object
    //   1000: dup_x2
    //   1001: dup_x2
    //   1002: pop
    //   1003: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1006: iconst_0
    //   1007: swap
    //   1008: aastore
    //   1009: invokespecial Vulcan_tQ : ([Ljava/lang/Object;)V
    //   1012: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L7 : Z
    //   1015: aload #19
    //   1017: ifnull -> 1044
    //   1020: ifeq -> 1329
    //   1023: goto -> 1030
    //   1026: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1029: athrow
    //   1030: iconst_0
    //   1031: anewarray java/lang/Object
    //   1034: invokestatic Vulcan_S : ([Ljava/lang/Object;)Z
    //   1037: goto -> 1044
    //   1040: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1043: athrow
    //   1044: ifeq -> 1329
    //   1047: aload_0
    //   1048: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   1051: invokeinterface getWorldBorder : ()Lorg/bukkit/WorldBorder;
    //   1056: astore #20
    //   1058: aload #20
    //   1060: invokeinterface getCenter : ()Lorg/bukkit/Location;
    //   1065: invokevirtual getX : ()D
    //   1068: dstore #21
    //   1070: aload #20
    //   1072: invokeinterface getCenter : ()Lorg/bukkit/Location;
    //   1077: invokevirtual getZ : ()D
    //   1080: dstore #23
    //   1082: aload #20
    //   1084: invokeinterface getSize : ()D
    //   1089: ldc2_w 2.0
    //   1092: ddiv
    //   1093: dstore #25
    //   1095: aload_0
    //   1096: getfield Vulcan_SD : D
    //   1099: dload #21
    //   1101: dsub
    //   1102: dload #25
    //   1104: dsub
    //   1105: dstore #27
    //   1107: aload_0
    //   1108: getfield Vulcan_SD : D
    //   1111: dload #21
    //   1113: dsub
    //   1114: dload #25
    //   1116: dadd
    //   1117: dstore #29
    //   1119: aload_0
    //   1120: getfield Vulcan_SP : D
    //   1123: dload #23
    //   1125: dsub
    //   1126: dload #25
    //   1128: dsub
    //   1129: dstore #31
    //   1131: aload_0
    //   1132: getfield Vulcan_SP : D
    //   1135: dload #23
    //   1137: dsub
    //   1138: dload #25
    //   1140: dadd
    //   1141: dstore #33
    //   1143: dload #27
    //   1145: dconst_0
    //   1146: dcmpg
    //   1147: aload #19
    //   1149: lload_2
    //   1150: lconst_0
    //   1151: lcmp
    //   1152: iflt -> 1182
    //   1155: ifnull -> 1180
    //   1158: ifge -> 1176
    //   1161: goto -> 1168
    //   1164: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1167: athrow
    //   1168: dload #27
    //   1170: ldc2_w -1.0
    //   1173: dmul
    //   1174: dstore #27
    //   1176: dload #29
    //   1178: dconst_0
    //   1179: dcmpg
    //   1180: aload #19
    //   1182: lload_2
    //   1183: lconst_0
    //   1184: lcmp
    //   1185: ifle -> 1215
    //   1188: ifnull -> 1213
    //   1191: ifge -> 1209
    //   1194: goto -> 1201
    //   1197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1200: athrow
    //   1201: dload #29
    //   1203: ldc2_w -1.0
    //   1206: dmul
    //   1207: dstore #29
    //   1209: dload #31
    //   1211: dconst_0
    //   1212: dcmpg
    //   1213: aload #19
    //   1215: lload_2
    //   1216: lconst_0
    //   1217: lcmp
    //   1218: iflt -> 1248
    //   1221: ifnull -> 1246
    //   1224: ifge -> 1242
    //   1227: goto -> 1234
    //   1230: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1233: athrow
    //   1234: dload #31
    //   1236: ldc2_w -1.0
    //   1239: dmul
    //   1240: dstore #31
    //   1242: dload #33
    //   1244: dconst_0
    //   1245: dcmpg
    //   1246: aload #19
    //   1248: ifnull -> 1270
    //   1251: ifge -> 1269
    //   1254: goto -> 1261
    //   1257: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1260: athrow
    //   1261: dload #33
    //   1263: ldc2_w -1.0
    //   1266: dmul
    //   1267: dstore #33
    //   1269: iconst_4
    //   1270: newarray double
    //   1272: dup
    //   1273: iconst_0
    //   1274: dload #27
    //   1276: dastore
    //   1277: dup
    //   1278: iconst_1
    //   1279: dload #29
    //   1281: dastore
    //   1282: dup
    //   1283: iconst_2
    //   1284: dload #31
    //   1286: dastore
    //   1287: dup
    //   1288: iconst_3
    //   1289: dload #33
    //   1291: dastore
    //   1292: astore #35
    //   1294: aload #35
    //   1296: invokestatic sort : ([D)V
    //   1299: aload_0
    //   1300: aload #35
    //   1302: iconst_0
    //   1303: daload
    //   1304: dconst_1
    //   1305: dcmpg
    //   1306: aload #19
    //   1308: ifnull -> 1322
    //   1311: ifge -> 1325
    //   1314: goto -> 1321
    //   1317: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1320: athrow
    //   1321: iconst_1
    //   1322: goto -> 1326
    //   1325: iconst_0
    //   1326: putfield Vulcan_SS : Z
    //   1329: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #126	-> 77
    //   #127	-> 88
    //   #128	-> 96
    //   #130	-> 105
    //   #132	-> 126
    //   #133	-> 134
    //   #134	-> 142
    //   #136	-> 156
    //   #137	-> 171
    //   #139	-> 270
    //   #141	-> 290
    //   #142	-> 298
    //   #143	-> 306
    //   #145	-> 314
    //   #146	-> 322
    //   #147	-> 330
    //   #149	-> 338
    //   #150	-> 350
    //   #151	-> 362
    //   #153	-> 374
    //   #154	-> 431
    //   #156	-> 458
    //   #158	-> 466
    //   #159	-> 474
    //   #160	-> 482
    //   #161	-> 490
    //   #163	-> 498
    //   #164	-> 511
    //   #165	-> 524
    //   #166	-> 537
    //   #167	-> 574
    //   #169	-> 624
    //   #171	-> 719
    //   #173	-> 759
    //   #175	-> 802
    //   #176	-> 818
    //   #178	-> 855
    //   #181	-> 881
    //   #182	-> 900
    //   #184	-> 919
    //   #185	-> 938
    //   #186	-> 993
    //   #188	-> 1012
    //   #189	-> 1047
    //   #191	-> 1058
    //   #192	-> 1070
    //   #194	-> 1082
    //   #196	-> 1095
    //   #197	-> 1107
    //   #198	-> 1119
    //   #199	-> 1131
    //   #201	-> 1143
    //   #202	-> 1168
    //   #204	-> 1176
    //   #205	-> 1201
    //   #207	-> 1209
    //   #208	-> 1234
    //   #210	-> 1242
    //   #211	-> 1261
    //   #214	-> 1269
    //   #215	-> 1294
    //   #217	-> 1299
    //   #220	-> 1329
    // Exception table:
    //   from	to	target	type
    //   126	164	167	java/lang/RuntimeException
    //   153	176	179	java/lang/RuntimeException
    //   183	197	200	java/lang/RuntimeException
    //   194	208	211	java/lang/RuntimeException
    //   215	229	232	java/lang/RuntimeException
    //   226	240	243	java/lang/RuntimeException
    //   247	255	258	java/lang/RuntimeException
    //   267	387	390	java/lang/RuntimeException
    //   381	420	420	java/lang/RuntimeException
    //   428	642	645	java/lang/RuntimeException
    //   639	663	666	java/lang/RuntimeException
    //   649	673	676	java/lang/RuntimeException
    //   670	694	697	java/lang/RuntimeException
    //   680	704	707	java/lang/RuntimeException
    //   716	738	741	java/lang/RuntimeException
    //   750	783	786	java/lang/RuntimeException
    //   765	791	794	java/lang/RuntimeException
    //   802	848	851	java/lang/RuntimeException
    //   818	874	877	java/lang/RuntimeException
    //   881	974	977	java/lang/RuntimeException
    //   971	986	989	java/lang/RuntimeException
    //   1015	1023	1026	java/lang/RuntimeException
    //   1020	1037	1040	java/lang/RuntimeException
    //   1143	1161	1164	java/lang/RuntimeException
    //   1180	1194	1197	java/lang/RuntimeException
    //   1213	1227	1230	java/lang/RuntimeException
    //   1246	1254	1257	java/lang/RuntimeException
    //   1294	1314	1317	java/lang/RuntimeException
  }
  
  public boolean Vulcan_f(Object[] paramArrayOfObject) {
    return this.Vulcan_s;
  }
  
  public boolean Vulcan_CE(Object[] paramArrayOfObject) {
    return this.Vulcan_A;
  }
  
  public boolean Vulcan_Cm(Object[] paramArrayOfObject) {
    return this.Vulcan_kl;
  }
  
  public boolean Vulcan_CU(Object[] paramArrayOfObject) {
    return this.Vulcan_kR;
  }
  
  public boolean Vulcan_CD(Object[] paramArrayOfObject) {
    return this.Vulcan_Z;
  }
  
  public boolean Vulcan_S(Object[] paramArrayOfObject) {
    return this.Vulcan_kf;
  }
  
  public boolean Vulcan_y(Object[] paramArrayOfObject) {
    return this.Vulcan_kI;
  }
  
  public boolean Vulcan_n(Object[] paramArrayOfObject) {
    return this.Vulcan_P;
  }
  
  public boolean Vulcan_C6(Object[] paramArrayOfObject) {
    return this.Vulcan_kC;
  }
  
  public boolean Vulcan_cc(Object[] paramArrayOfObject) {
    return this.Vulcan_kG;
  }
  
  public boolean Vulcan_e(Object[] paramArrayOfObject) {
    return this.Vulcan_k5;
  }
  
  public boolean Vulcan_Co(Object[] paramArrayOfObject) {
    return this.Vulcan_jQ;
  }
  
  public boolean Vulcan_CA(Object[] paramArrayOfObject) {
    return this.Vulcan_jk;
  }
  
  public boolean Vulcan_Cx(Object[] paramArrayOfObject) {
    return this.Vulcan_kE;
  }
  
  public boolean Vulcan_Cc(Object[] paramArrayOfObject) {
    return this.Vulcan_W;
  }
  
  public boolean Vulcan_B(Object[] paramArrayOfObject) {
    return this.Vulcan_kt;
  }
  
  public boolean Vulcan_Cu(Object[] paramArrayOfObject) {
    return this.Vulcan_Sd;
  }
  
  public boolean Vulcan_C9(Object[] paramArrayOfObject) {
    return this.Vulcan_G;
  }
  
  private void Vulcan_tQ(Object[] paramArrayOfObject) {
    long l1 = ((Long)paramArrayOfObject[0]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x596DFE5829L;
    Vulcan_X vulcan_X = this.Vulcan_bP.Vulcan_K(new Object[0]);
    new Object[2];
    this.Vulcan_s = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.FLIGHT });
    new Object[2];
    this.Vulcan_A = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.CREATIVE });
    new Object[2];
    this.Vulcan_kl = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.JOINED });
    new Object[2];
    this.Vulcan_kR = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.LIQUID });
    new Object[2];
    this.Vulcan_Z = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.LEVITATION });
    new Object[2];
    this.Vulcan_kf = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.SLOW_FALLING });
    new Object[2];
    this.Vulcan_kI = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.RIPTIDE });
    new Object[2];
    this.Vulcan_P = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.VEHICLE });
    new Object[2];
    this.Vulcan_kC = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.LENIENT_SCAFFOLDING });
    new Object[2];
    this.Vulcan_kG = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.BUKKIT_VELOCITY });
    new Object[2];
    this.Vulcan_k5 = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.GLIDING });
    new Object[2];
    this.Vulcan_jQ = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.ELYTRA });
    new Object[2];
    this.Vulcan_jk = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.TELEPORT });
    new Object[2];
    this.Vulcan_kE = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.ENDER_PEARL });
    new Object[2];
    this.Vulcan_W = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.CHUNK });
    new Object[2];
    this.Vulcan_kt = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.COMBO_MODE });
    new Object[2];
    this.Vulcan_Sd = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.MYTHIC_MOB });
    new Object[2];
    this.Vulcan_G = vulcan_X.Vulcan_t(new Object[] { null, Long.valueOf(l2), Vulcan_h3.CLIMBABLE });
  }
  
  private void Vulcan_t3(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 9527155784734
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 47322307731758
    //   30: lxor
    //   31: lstore #6
    //   33: dup2
    //   34: ldc2_w 46783822277595
    //   37: lxor
    //   38: lstore #8
    //   40: dup2
    //   41: ldc2_w 123141952689634
    //   44: lxor
    //   45: lstore #10
    //   47: dup2
    //   48: ldc2_w 118111714632542
    //   51: lxor
    //   52: lstore #12
    //   54: dup2
    //   55: ldc2_w 103106742366598
    //   58: lxor
    //   59: lstore #14
    //   61: dup2
    //   62: ldc2_w 16996810741421
    //   65: lxor
    //   66: lstore #16
    //   68: dup2
    //   69: ldc2_w 14398289336387
    //   72: lxor
    //   73: lstore #18
    //   75: dup2
    //   76: ldc2_w 11272089564537
    //   79: lxor
    //   80: lstore #20
    //   82: pop2
    //   83: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   86: astore #22
    //   88: aload_0
    //   89: aload #22
    //   91: ifnull -> 115
    //   94: getfield Vulcan_p : Ljava/util/List;
    //   97: ifnull -> 197
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: aload_0
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   118: aload #22
    //   120: lload_2
    //   121: lconst_0
    //   122: lcmp
    //   123: ifle -> 152
    //   126: ifnull -> 150
    //   129: ifnull -> 197
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: aload_0
    //   140: getfield Vulcan_Sy : Lorg/bukkit/Material;
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: aload #22
    //   152: ifnull -> 194
    //   155: ifnull -> 197
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: aload_0
    //   166: aload #22
    //   168: lload_2
    //   169: lconst_0
    //   170: lcmp
    //   171: ifle -> 493
    //   174: ifnull -> 457
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: getfield Vulcan_SG : Lorg/bukkit/Material;
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   193: athrow
    //   194: ifnonnull -> 198
    //   197: return
    //   198: aload_0
    //   199: aload_0
    //   200: getfield Vulcan_SD : D
    //   203: invokestatic floor : (D)I
    //   206: putfield Vulcan_f : I
    //   209: aload_0
    //   210: aload_0
    //   211: getfield Vulcan_bh : D
    //   214: invokestatic floor : (D)I
    //   217: putfield Vulcan_bL : I
    //   220: aload_0
    //   221: aload_0
    //   222: getfield Vulcan_SP : D
    //   225: invokestatic floor : (D)I
    //   228: putfield Vulcan_bp : I
    //   231: aload_0
    //   232: aload_0
    //   233: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   236: lload #10
    //   238: dup2_x1
    //   239: pop2
    //   240: iconst_2
    //   241: anewarray java/lang/Object
    //   244: dup_x1
    //   245: swap
    //   246: iconst_1
    //   247: swap
    //   248: aastore
    //   249: dup_x2
    //   250: dup_x2
    //   251: pop
    //   252: invokestatic valueOf : (J)Ljava/lang/Long;
    //   255: iconst_0
    //   256: swap
    //   257: aastore
    //   258: invokestatic Vulcan_I : ([Ljava/lang/Object;)Ljava/util/List;
    //   261: putfield Vulcan_SM : Ljava/util/List;
    //   264: aload_0
    //   265: aload_0
    //   266: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   269: lload #12
    //   271: dup2_x1
    //   272: pop2
    //   273: iconst_2
    //   274: anewarray java/lang/Object
    //   277: dup_x1
    //   278: swap
    //   279: iconst_1
    //   280: swap
    //   281: aastore
    //   282: dup_x2
    //   283: dup_x2
    //   284: pop
    //   285: invokestatic valueOf : (J)Ljava/lang/Long;
    //   288: iconst_0
    //   289: swap
    //   290: aastore
    //   291: invokestatic Vulcan_b : ([Ljava/lang/Object;)Ljava/util/List;
    //   294: putfield Vulcan_SQ : Ljava/util/List;
    //   297: aload_0
    //   298: aload_0
    //   299: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   302: lload #14
    //   304: iconst_2
    //   305: anewarray java/lang/Object
    //   308: dup_x2
    //   309: dup_x2
    //   310: pop
    //   311: invokestatic valueOf : (J)Ljava/lang/Long;
    //   314: iconst_1
    //   315: swap
    //   316: aastore
    //   317: dup_x1
    //   318: swap
    //   319: iconst_0
    //   320: swap
    //   321: aastore
    //   322: invokestatic Vulcan_h : ([Ljava/lang/Object;)Ljava/util/List;
    //   325: putfield Vulcan_t : Ljava/util/List;
    //   328: aload_0
    //   329: aload_0
    //   330: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   333: lload #8
    //   335: iconst_2
    //   336: anewarray java/lang/Object
    //   339: dup_x2
    //   340: dup_x2
    //   341: pop
    //   342: invokestatic valueOf : (J)Ljava/lang/Long;
    //   345: iconst_1
    //   346: swap
    //   347: aastore
    //   348: dup_x1
    //   349: swap
    //   350: iconst_0
    //   351: swap
    //   352: aastore
    //   353: invokestatic Vulcan_v : ([Ljava/lang/Object;)Ljava/util/List;
    //   356: putfield Vulcan__ : Ljava/util/List;
    //   359: aload_0
    //   360: aload_0
    //   361: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   364: lload #18
    //   366: iconst_2
    //   367: anewarray java/lang/Object
    //   370: dup_x2
    //   371: dup_x2
    //   372: pop
    //   373: invokestatic valueOf : (J)Ljava/lang/Long;
    //   376: iconst_1
    //   377: swap
    //   378: aastore
    //   379: dup_x1
    //   380: swap
    //   381: iconst_0
    //   382: swap
    //   383: aastore
    //   384: invokestatic Vulcan_N : ([Ljava/lang/Object;)Z
    //   387: putfield Vulcan_Sr : Z
    //   390: aload_0
    //   391: aload_0
    //   392: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   395: lload #4
    //   397: dup2_x1
    //   398: pop2
    //   399: iconst_2
    //   400: anewarray java/lang/Object
    //   403: dup_x1
    //   404: swap
    //   405: iconst_1
    //   406: swap
    //   407: aastore
    //   408: dup_x2
    //   409: dup_x2
    //   410: pop
    //   411: invokestatic valueOf : (J)Ljava/lang/Long;
    //   414: iconst_0
    //   415: swap
    //   416: aastore
    //   417: invokestatic Vulcan_c : ([Ljava/lang/Object;)Z
    //   420: putfield Vulcan_jD : Z
    //   423: aload_0
    //   424: aload_0
    //   425: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   428: lload #4
    //   430: dup2_x1
    //   431: pop2
    //   432: iconst_2
    //   433: anewarray java/lang/Object
    //   436: dup_x1
    //   437: swap
    //   438: iconst_1
    //   439: swap
    //   440: aastore
    //   441: dup_x2
    //   442: dup_x2
    //   443: pop
    //   444: invokestatic valueOf : (J)Ljava/lang/Long;
    //   447: iconst_0
    //   448: swap
    //   449: aastore
    //   450: invokestatic Vulcan_c : ([Ljava/lang/Object;)Z
    //   453: putfield Vulcan_bJ : Z
    //   456: aload_0
    //   457: aload_0
    //   458: getfield Vulcan_SQ : Ljava/util/List;
    //   461: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   466: lload #6
    //   468: dup2_x1
    //   469: pop2
    //   470: iconst_3
    //   471: anewarray java/lang/Object
    //   474: dup_x1
    //   475: swap
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
    //   493: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   496: aload #22
    //   498: ifnull -> 512
    //   501: ifne -> 515
    //   504: goto -> 511
    //   507: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   510: athrow
    //   511: iconst_1
    //   512: goto -> 516
    //   515: iconst_0
    //   516: putfield Vulcan_k0 : Z
    //   519: aload_0
    //   520: aload_0
    //   521: getfield Vulcan_t : Ljava/util/List;
    //   524: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   529: lload #6
    //   531: dup2_x1
    //   532: pop2
    //   533: iconst_3
    //   534: anewarray java/lang/Object
    //   537: dup_x1
    //   538: swap
    //   539: iconst_2
    //   540: swap
    //   541: aastore
    //   542: dup_x2
    //   543: dup_x2
    //   544: pop
    //   545: invokestatic valueOf : (J)Ljava/lang/Long;
    //   548: iconst_1
    //   549: swap
    //   550: aastore
    //   551: dup_x1
    //   552: swap
    //   553: iconst_0
    //   554: swap
    //   555: aastore
    //   556: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   559: aload #22
    //   561: ifnull -> 575
    //   564: ifne -> 578
    //   567: goto -> 574
    //   570: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   573: athrow
    //   574: iconst_1
    //   575: goto -> 579
    //   578: iconst_0
    //   579: putfield Vulcan_b7 : Z
    //   582: aload_0
    //   583: aload_0
    //   584: getfield Vulcan_p : Ljava/util/List;
    //   587: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   592: lload #20
    //   594: iconst_3
    //   595: anewarray java/lang/Object
    //   598: dup_x2
    //   599: dup_x2
    //   600: pop
    //   601: invokestatic valueOf : (J)Ljava/lang/Long;
    //   604: iconst_2
    //   605: swap
    //   606: aastore
    //   607: dup_x1
    //   608: swap
    //   609: iconst_1
    //   610: swap
    //   611: aastore
    //   612: dup_x1
    //   613: swap
    //   614: iconst_0
    //   615: swap
    //   616: aastore
    //   617: invokestatic Vulcan_G : ([Ljava/lang/Object;)Z
    //   620: putfield Vulcan_ja : Z
    //   623: aload_0
    //   624: aload_0
    //   625: getfield Vulcan_t : Ljava/util/List;
    //   628: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   633: lload #6
    //   635: dup2_x1
    //   636: pop2
    //   637: iconst_3
    //   638: anewarray java/lang/Object
    //   641: dup_x1
    //   642: swap
    //   643: iconst_2
    //   644: swap
    //   645: aastore
    //   646: dup_x2
    //   647: dup_x2
    //   648: pop
    //   649: invokestatic valueOf : (J)Ljava/lang/Long;
    //   652: iconst_1
    //   653: swap
    //   654: aastore
    //   655: dup_x1
    //   656: swap
    //   657: iconst_0
    //   658: swap
    //   659: aastore
    //   660: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   663: aload #22
    //   665: lload_2
    //   666: lconst_0
    //   667: lcmp
    //   668: ifle -> 732
    //   671: ifnull -> 730
    //   674: ifeq -> 749
    //   677: goto -> 684
    //   680: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   683: athrow
    //   684: aload_0
    //   685: getfield Vulcan_SM : Ljava/util/List;
    //   688: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   693: lload #6
    //   695: dup2_x1
    //   696: pop2
    //   697: iconst_3
    //   698: anewarray java/lang/Object
    //   701: dup_x1
    //   702: swap
    //   703: iconst_2
    //   704: swap
    //   705: aastore
    //   706: dup_x2
    //   707: dup_x2
    //   708: pop
    //   709: invokestatic valueOf : (J)Ljava/lang/Long;
    //   712: iconst_1
    //   713: swap
    //   714: aastore
    //   715: dup_x1
    //   716: swap
    //   717: iconst_0
    //   718: swap
    //   719: aastore
    //   720: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   723: goto -> 730
    //   726: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   729: athrow
    //   730: aload #22
    //   732: ifnull -> 746
    //   735: ifeq -> 749
    //   738: goto -> 745
    //   741: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   744: athrow
    //   745: iconst_1
    //   746: goto -> 750
    //   749: iconst_0
    //   750: putfield Vulcan_kk : Z
    //   753: aload_0
    //   754: lload #16
    //   756: iconst_1
    //   757: anewarray java/lang/Object
    //   760: dup_x2
    //   761: dup_x2
    //   762: pop
    //   763: invokestatic valueOf : (J)Ljava/lang/Long;
    //   766: iconst_0
    //   767: swap
    //   768: aastore
    //   769: invokespecial Vulcan_tl : ([Ljava/lang/Object;)V
    //   772: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #250	-> 88
    //   #252	-> 198
    //   #253	-> 209
    //   #254	-> 220
    //   #256	-> 231
    //   #257	-> 264
    //   #258	-> 297
    //   #259	-> 328
    //   #261	-> 359
    //   #262	-> 390
    //   #263	-> 423
    //   #265	-> 456
    //   #266	-> 519
    //   #267	-> 582
    //   #269	-> 623
    //   #271	-> 753
    //   #272	-> 772
    // Exception table:
    //   from	to	target	type
    //   88	100	103	java/lang/RuntimeException
    //   94	108	111	java/lang/RuntimeException
    //   115	132	135	java/lang/RuntimeException
    //   129	143	146	java/lang/RuntimeException
    //   150	158	161	java/lang/RuntimeException
    //   155	177	180	java/lang/RuntimeException
    //   165	187	190	java/lang/RuntimeException
    //   457	504	507	java/lang/RuntimeException
    //   516	567	570	java/lang/RuntimeException
    //   579	677	680	java/lang/RuntimeException
    //   674	723	726	java/lang/RuntimeException
    //   730	738	741	java/lang/RuntimeException
  }
  
  private void Vulcan_tl(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 108800840607613
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 132232931706589
    //   30: lxor
    //   31: lstore #6
    //   33: dup2
    //   34: ldc2_w 57570360487932
    //   37: lxor
    //   38: lstore #8
    //   40: dup2
    //   41: ldc2_w 3147866396895
    //   44: lxor
    //   45: lstore #10
    //   47: dup2
    //   48: ldc2_w 3992617232118
    //   51: lxor
    //   52: lstore #12
    //   54: dup2
    //   55: ldc2_w 62535718867737
    //   58: lxor
    //   59: lstore #14
    //   61: dup2
    //   62: ldc2_w 86051354086306
    //   65: lxor
    //   66: lstore #16
    //   68: dup2
    //   69: ldc2_w 31670162568527
    //   72: lxor
    //   73: lstore #18
    //   75: dup2
    //   76: ldc2_w 11912190753093
    //   79: lxor
    //   80: lstore #20
    //   82: dup2
    //   83: ldc2_w 138039418526563
    //   86: lxor
    //   87: lstore #22
    //   89: dup2
    //   90: ldc2_w 117874962176683
    //   93: lxor
    //   94: lstore #24
    //   96: dup2
    //   97: ldc2_w 5587488268289
    //   100: lxor
    //   101: lstore #26
    //   103: dup2
    //   104: ldc2_w 66088961284924
    //   107: lxor
    //   108: lstore #28
    //   110: dup2
    //   111: ldc2_w 9379075654038
    //   114: lxor
    //   115: lstore #30
    //   117: dup2
    //   118: ldc2_w 22762927638531
    //   121: lxor
    //   122: lstore #32
    //   124: pop2
    //   125: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   128: astore #34
    //   130: aload_0
    //   131: getfield Vulcan_SQ : Ljava/util/List;
    //   134: aload #34
    //   136: ifnull -> 246
    //   139: ifnull -> 230
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: aload_0
    //   150: iconst_0
    //   151: putfield Vulcan_Sa : Z
    //   154: aload_0
    //   155: getfield Vulcan_SQ : Ljava/util/List;
    //   158: invokeinterface iterator : ()Ljava/util/Iterator;
    //   163: astore #35
    //   165: aload #35
    //   167: invokeinterface hasNext : ()Z
    //   172: ifeq -> 230
    //   175: aload #35
    //   177: invokeinterface next : ()Ljava/lang/Object;
    //   182: checkcast org/bukkit/Material
    //   185: astore #36
    //   187: aload_0
    //   188: dup
    //   189: getfield Vulcan_Sa : Z
    //   192: aload #36
    //   194: invokestatic Vulcan_KP : (Lorg/bukkit/Material;)Z
    //   197: ior
    //   198: putfield Vulcan_Sa : Z
    //   201: aload #34
    //   203: lload_2
    //   204: lconst_0
    //   205: lcmp
    //   206: ifle -> 214
    //   209: ifnull -> 3220
    //   212: aload #34
    //   214: ifnonnull -> 165
    //   217: lload_2
    //   218: lconst_0
    //   219: lcmp
    //   220: iflt -> 201
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: aload_0
    //   231: aload #34
    //   233: ifnull -> 3221
    //   236: getfield Vulcan_p : Ljava/util/List;
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: ifnull -> 3220
    //   249: aload_0
    //   250: aload #34
    //   252: lload_2
    //   253: lconst_0
    //   254: lcmp
    //   255: iflt -> 3223
    //   258: ifnull -> 3221
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: getfield Vulcan_SO : Ljava/util/List;
    //   271: ifnull -> 3220
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   280: athrow
    //   281: aload_0
    //   282: aload_0
    //   283: aload_0
    //   284: aload_0
    //   285: aload_0
    //   286: aload_0
    //   287: aload_0
    //   288: aload_0
    //   289: aload_0
    //   290: aload_0
    //   291: aload_0
    //   292: aload_0
    //   293: aload_0
    //   294: aload_0
    //   295: aload_0
    //   296: aload_0
    //   297: aload_0
    //   298: aload_0
    //   299: aload_0
    //   300: aload_0
    //   301: aload_0
    //   302: aload_0
    //   303: aload_0
    //   304: aload_0
    //   305: aload_0
    //   306: aload_0
    //   307: aload_0
    //   308: aload_0
    //   309: aload_0
    //   310: aload_0
    //   311: aload_0
    //   312: aload_0
    //   313: aload_0
    //   314: aload_0
    //   315: aload_0
    //   316: aload_0
    //   317: aload_0
    //   318: aload_0
    //   319: aload_0
    //   320: aload_0
    //   321: aload_0
    //   322: aload_0
    //   323: aload_0
    //   324: aload_0
    //   325: aload_0
    //   326: aload_0
    //   327: aload_0
    //   328: aload_0
    //   329: aload_0
    //   330: aload_0
    //   331: aload_0
    //   332: aload_0
    //   333: aload_0
    //   334: aload_0
    //   335: aload_0
    //   336: aload_0
    //   337: aload_0
    //   338: aload_0
    //   339: aload_0
    //   340: aload_0
    //   341: aload_0
    //   342: aload_0
    //   343: aload_0
    //   344: aload_0
    //   345: aload_0
    //   346: iconst_0
    //   347: dup_x1
    //   348: putfield Vulcan_SN : Z
    //   351: dup_x1
    //   352: putfield Vulcan_jX : Z
    //   355: dup_x1
    //   356: putfield Vulcan_m : Z
    //   359: dup_x1
    //   360: putfield Vulcan_Sz : Z
    //   363: dup_x1
    //   364: putfield Vulcan_So : Z
    //   367: dup_x1
    //   368: putfield Vulcan_kV : Z
    //   371: dup_x1
    //   372: putfield Vulcan_jx : Z
    //   375: dup_x1
    //   376: putfield Vulcan_j : Z
    //   379: dup_x1
    //   380: putfield Vulcan_bO : Z
    //   383: dup_x1
    //   384: putfield Vulcan_b1 : Z
    //   387: dup_x1
    //   388: putfield Vulcan_ku : Z
    //   391: dup_x1
    //   392: putfield Vulcan_I : Z
    //   395: dup_x1
    //   396: putfield Vulcan_bl : Z
    //   399: dup_x1
    //   400: putfield Vulcan_kh : Z
    //   403: dup_x1
    //   404: putfield Vulcan_kA : Z
    //   407: dup_x1
    //   408: putfield Vulcan_bV : Z
    //   411: dup_x1
    //   412: putfield Vulcan_kx : Z
    //   415: dup_x1
    //   416: putfield Vulcan_x : Z
    //   419: dup_x1
    //   420: putfield Vulcan_kF : Z
    //   423: dup_x1
    //   424: putfield Vulcan_C : Z
    //   427: dup_x1
    //   428: putfield Vulcan_Si : Z
    //   431: dup_x1
    //   432: putfield Vulcan_SF : Z
    //   435: dup_x1
    //   436: putfield Vulcan_Sw : Z
    //   439: dup_x1
    //   440: putfield Vulcan_a : Z
    //   443: dup_x1
    //   444: putfield Vulcan_K : Z
    //   447: dup_x1
    //   448: putfield Vulcan_kj : Z
    //   451: dup_x1
    //   452: putfield Vulcan_X : Z
    //   455: dup_x1
    //   456: putfield Vulcan_kv : Z
    //   459: dup_x1
    //   460: putfield Vulcan_v : Z
    //   463: dup_x1
    //   464: putfield Vulcan_b8 : Z
    //   467: dup_x1
    //   468: putfield Vulcan_bC : Z
    //   471: dup_x1
    //   472: putfield Vulcan_b4 : Z
    //   475: dup_x1
    //   476: putfield Vulcan_b_ : Z
    //   479: dup_x1
    //   480: putfield Vulcan_j1 : Z
    //   483: dup_x1
    //   484: putfield Vulcan_y : Z
    //   487: dup_x1
    //   488: putfield Vulcan_j9 : Z
    //   491: dup_x1
    //   492: putfield Vulcan_SL : Z
    //   495: dup_x1
    //   496: putfield Vulcan_b6 : Z
    //   499: dup_x1
    //   500: putfield Vulcan_S_ : Z
    //   503: dup_x1
    //   504: putfield Vulcan_S1 : Z
    //   507: dup_x1
    //   508: putfield Vulcan_g : Z
    //   511: dup_x1
    //   512: putfield Vulcan_j8 : Z
    //   515: dup_x1
    //   516: putfield Vulcan_z : Z
    //   519: dup_x1
    //   520: putfield Vulcan_jR : Z
    //   523: dup_x1
    //   524: putfield Vulcan_B : Z
    //   527: dup_x1
    //   528: putfield Vulcan_jm : Z
    //   531: dup_x1
    //   532: putfield Vulcan_j2 : Z
    //   535: dup_x1
    //   536: putfield Vulcan_SH : Z
    //   539: dup_x1
    //   540: putfield Vulcan_ka : Z
    //   543: dup_x1
    //   544: putfield Vulcan_Ss : Z
    //   547: dup_x1
    //   548: putfield Vulcan_kb : Z
    //   551: dup_x1
    //   552: putfield Vulcan_kd : Z
    //   555: dup_x1
    //   556: putfield Vulcan_kN : Z
    //   559: dup_x1
    //   560: putfield Vulcan_kK : Z
    //   563: dup_x1
    //   564: putfield Vulcan_Sl : Z
    //   567: dup_x1
    //   568: putfield Vulcan_kM : Z
    //   571: dup_x1
    //   572: putfield Vulcan_bb : Z
    //   575: dup_x1
    //   576: putfield Vulcan_kP : Z
    //   579: dup_x1
    //   580: putfield Vulcan_jc : Z
    //   583: dup_x1
    //   584: putfield Vulcan_b2 : Z
    //   587: dup_x1
    //   588: putfield Vulcan_jn : Z
    //   591: dup_x1
    //   592: putfield Vulcan_Sg : Z
    //   595: dup_x1
    //   596: putfield Vulcan_T : Z
    //   599: dup_x1
    //   600: putfield Vulcan_St : Z
    //   603: putfield Vulcan_SV : Z
    //   606: aload_0
    //   607: getfield Vulcan_p : Ljava/util/List;
    //   610: invokeinterface iterator : ()Ljava/util/Iterator;
    //   615: astore #35
    //   617: aload #35
    //   619: invokeinterface hasNext : ()Z
    //   624: ifeq -> 2736
    //   627: aload #35
    //   629: invokeinterface next : ()Ljava/lang/Object;
    //   634: checkcast org/bukkit/Material
    //   637: astore #36
    //   639: aload_0
    //   640: lload_2
    //   641: lconst_0
    //   642: lcmp
    //   643: iflt -> 2758
    //   646: dup
    //   647: getfield Vulcan_SV : Z
    //   650: aload #34
    //   652: ifnull -> 2754
    //   655: aload #36
    //   657: getstatic org/bukkit/Material.SLIME_BLOCK : Lorg/bukkit/Material;
    //   660: if_acmpne -> 678
    //   663: goto -> 670
    //   666: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   669: athrow
    //   670: iconst_1
    //   671: goto -> 679
    //   674: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   677: athrow
    //   678: iconst_0
    //   679: ior
    //   680: putfield Vulcan_SV : Z
    //   683: aload_0
    //   684: dup
    //   685: getfield Vulcan_T : Z
    //   688: aload #36
    //   690: getstatic org/bukkit/Material.WATER : Lorg/bukkit/Material;
    //   693: lload_2
    //   694: lconst_0
    //   695: lcmp
    //   696: ifle -> 726
    //   699: aload #34
    //   701: ifnull -> 726
    //   704: if_acmpeq -> 729
    //   707: goto -> 714
    //   710: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   713: athrow
    //   714: aload #36
    //   716: getstatic org/bukkit/Material.LAVA : Lorg/bukkit/Material;
    //   719: goto -> 726
    //   722: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   725: athrow
    //   726: if_acmpne -> 737
    //   729: iconst_1
    //   730: goto -> 738
    //   733: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   736: athrow
    //   737: iconst_0
    //   738: lload_2
    //   739: lconst_0
    //   740: lcmp
    //   741: ifle -> 762
    //   744: ior
    //   745: putfield Vulcan_T : Z
    //   748: aload_0
    //   749: dup
    //   750: getfield Vulcan_jc : Z
    //   753: aload #36
    //   755: getstatic org/bukkit/Material.COBWEB : Lorg/bukkit/Material;
    //   758: if_acmpne -> 769
    //   761: iconst_1
    //   762: goto -> 770
    //   765: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   768: athrow
    //   769: iconst_0
    //   770: lload_2
    //   771: lconst_0
    //   772: lcmp
    //   773: iflt -> 794
    //   776: ior
    //   777: putfield Vulcan_jc : Z
    //   780: aload_0
    //   781: dup
    //   782: getfield Vulcan_kP : Z
    //   785: aload #36
    //   787: getstatic org/bukkit/Material.FLOWER_POT : Lorg/bukkit/Material;
    //   790: if_acmpne -> 801
    //   793: iconst_1
    //   794: goto -> 802
    //   797: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   800: athrow
    //   801: iconst_0
    //   802: lload_2
    //   803: lconst_0
    //   804: lcmp
    //   805: iflt -> 826
    //   808: ior
    //   809: putfield Vulcan_kP : Z
    //   812: aload_0
    //   813: dup
    //   814: getfield Vulcan_kM : Z
    //   817: aload #36
    //   819: getstatic org/bukkit/Material.END_PORTAL_FRAME : Lorg/bukkit/Material;
    //   822: if_acmpne -> 833
    //   825: iconst_1
    //   826: goto -> 834
    //   829: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   832: athrow
    //   833: iconst_0
    //   834: lload_2
    //   835: lconst_0
    //   836: lcmp
    //   837: ifle -> 858
    //   840: ior
    //   841: putfield Vulcan_kM : Z
    //   844: aload_0
    //   845: dup
    //   846: getfield Vulcan_kN : Z
    //   849: aload #36
    //   851: getstatic org/bukkit/Material.DAYLIGHT_DETECTOR : Lorg/bukkit/Material;
    //   854: if_acmpne -> 865
    //   857: iconst_1
    //   858: goto -> 866
    //   861: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   864: athrow
    //   865: iconst_0
    //   866: lload_2
    //   867: lconst_0
    //   868: lcmp
    //   869: iflt -> 890
    //   872: ior
    //   873: putfield Vulcan_kN : Z
    //   876: aload_0
    //   877: dup
    //   878: getfield Vulcan_kd : Z
    //   881: aload #36
    //   883: getstatic org/bukkit/Material.BREWING_STAND : Lorg/bukkit/Material;
    //   886: if_acmpne -> 897
    //   889: iconst_1
    //   890: goto -> 898
    //   893: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   896: athrow
    //   897: iconst_0
    //   898: ior
    //   899: putfield Vulcan_kd : Z
    //   902: aload_0
    //   903: dup
    //   904: getfield Vulcan_SH : Z
    //   907: aload #36
    //   909: getstatic org/bukkit/Material.ICE : Lorg/bukkit/Material;
    //   912: aload #34
    //   914: lload_2
    //   915: lconst_0
    //   916: lcmp
    //   917: iflt -> 947
    //   920: ifnull -> 945
    //   923: if_acmpeq -> 1021
    //   926: goto -> 933
    //   929: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   932: athrow
    //   933: aload #36
    //   935: getstatic org/bukkit/Material.PACKED_ICE : Lorg/bukkit/Material;
    //   938: goto -> 945
    //   941: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   944: athrow
    //   945: aload #34
    //   947: ifnull -> 990
    //   950: if_acmpeq -> 1021
    //   953: goto -> 960
    //   956: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   959: athrow
    //   960: aload #36
    //   962: lload_2
    //   963: lconst_0
    //   964: lcmp
    //   965: ifle -> 995
    //   968: aload #34
    //   970: ifnull -> 995
    //   973: goto -> 980
    //   976: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   979: athrow
    //   980: getstatic org/bukkit/Material.FROSTED_ICE : Lorg/bukkit/Material;
    //   983: goto -> 990
    //   986: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   989: athrow
    //   990: if_acmpeq -> 1021
    //   993: aload #36
    //   995: invokevirtual toString : ()Ljava/lang/String;
    //   998: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1001: iconst_5
    //   1002: aaload
    //   1003: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1006: aload #34
    //   1008: ifnull -> 1022
    //   1011: ifeq -> 1025
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1020: athrow
    //   1021: iconst_1
    //   1022: goto -> 1026
    //   1025: iconst_0
    //   1026: lload_2
    //   1027: lconst_0
    //   1028: lcmp
    //   1029: iflt -> 1050
    //   1032: ior
    //   1033: putfield Vulcan_SH : Z
    //   1036: aload_0
    //   1037: dup
    //   1038: getfield Vulcan_jm : Z
    //   1041: aload #36
    //   1043: getstatic org/bukkit/Material.SNOW : Lorg/bukkit/Material;
    //   1046: if_acmpne -> 1057
    //   1049: iconst_1
    //   1050: goto -> 1058
    //   1053: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1056: athrow
    //   1057: iconst_0
    //   1058: ior
    //   1059: putfield Vulcan_jm : Z
    //   1062: aload_0
    //   1063: dup
    //   1064: getfield Vulcan_B : Z
    //   1067: aload #36
    //   1069: getstatic org/bukkit/Material.ANVIL : Lorg/bukkit/Material;
    //   1072: aload #34
    //   1074: lload_2
    //   1075: lconst_0
    //   1076: lcmp
    //   1077: ifle -> 1113
    //   1080: ifnull -> 1105
    //   1083: if_acmpeq -> 1141
    //   1086: goto -> 1093
    //   1089: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1092: athrow
    //   1093: aload #36
    //   1095: getstatic org/bukkit/Material.CHIPPED_ANVIL : Lorg/bukkit/Material;
    //   1098: goto -> 1105
    //   1101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1104: athrow
    //   1105: lload_2
    //   1106: lconst_0
    //   1107: lcmp
    //   1108: iflt -> 1138
    //   1111: aload #34
    //   1113: ifnull -> 1138
    //   1116: if_acmpeq -> 1141
    //   1119: goto -> 1126
    //   1122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1125: athrow
    //   1126: aload #36
    //   1128: getstatic org/bukkit/Material.DAMAGED_ANVIL : Lorg/bukkit/Material;
    //   1131: goto -> 1138
    //   1134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1137: athrow
    //   1138: if_acmpne -> 1149
    //   1141: iconst_1
    //   1142: goto -> 1150
    //   1145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1148: athrow
    //   1149: iconst_0
    //   1150: lload_2
    //   1151: lconst_0
    //   1152: lcmp
    //   1153: ifle -> 1174
    //   1156: ior
    //   1157: putfield Vulcan_B : Z
    //   1160: aload_0
    //   1161: dup
    //   1162: getfield Vulcan_jR : Z
    //   1165: aload #36
    //   1167: getstatic org/bukkit/Material.REPEATER : Lorg/bukkit/Material;
    //   1170: if_acmpne -> 1181
    //   1173: iconst_1
    //   1174: goto -> 1182
    //   1177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1180: athrow
    //   1181: iconst_0
    //   1182: lload_2
    //   1183: lconst_0
    //   1184: lcmp
    //   1185: ifle -> 1206
    //   1188: ior
    //   1189: putfield Vulcan_jR : Z
    //   1192: aload_0
    //   1193: dup
    //   1194: getfield Vulcan_S1 : Z
    //   1197: aload #36
    //   1199: getstatic org/bukkit/Material.HOPPER : Lorg/bukkit/Material;
    //   1202: if_acmpne -> 1213
    //   1205: iconst_1
    //   1206: goto -> 1214
    //   1209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1212: athrow
    //   1213: iconst_0
    //   1214: lload_2
    //   1215: lconst_0
    //   1216: lcmp
    //   1217: iflt -> 1238
    //   1220: ior
    //   1221: putfield Vulcan_S1 : Z
    //   1224: aload_0
    //   1225: dup
    //   1226: getfield Vulcan_b6 : Z
    //   1229: aload #36
    //   1231: getstatic org/bukkit/Material.LILY_PAD : Lorg/bukkit/Material;
    //   1234: if_acmpne -> 1245
    //   1237: iconst_1
    //   1238: goto -> 1246
    //   1241: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1244: athrow
    //   1245: iconst_0
    //   1246: ior
    //   1247: putfield Vulcan_b6 : Z
    //   1250: aload_0
    //   1251: dup
    //   1252: getfield Vulcan_SL : Z
    //   1255: aload #36
    //   1257: getstatic org/bukkit/Material.PISTON : Lorg/bukkit/Material;
    //   1260: aload #34
    //   1262: lload_2
    //   1263: lconst_0
    //   1264: lcmp
    //   1265: ifle -> 1295
    //   1268: ifnull -> 1293
    //   1271: if_acmpeq -> 1362
    //   1274: goto -> 1281
    //   1277: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1280: athrow
    //   1281: aload #36
    //   1283: getstatic org/bukkit/Material.PISTON_HEAD : Lorg/bukkit/Material;
    //   1286: goto -> 1293
    //   1289: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1292: athrow
    //   1293: aload #34
    //   1295: lload_2
    //   1296: lconst_0
    //   1297: lcmp
    //   1298: ifle -> 1334
    //   1301: ifnull -> 1326
    //   1304: if_acmpeq -> 1362
    //   1307: goto -> 1314
    //   1310: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1313: athrow
    //   1314: aload #36
    //   1316: getstatic org/bukkit/Material.MOVING_PISTON : Lorg/bukkit/Material;
    //   1319: goto -> 1326
    //   1322: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1325: athrow
    //   1326: lload_2
    //   1327: lconst_0
    //   1328: lcmp
    //   1329: iflt -> 1359
    //   1332: aload #34
    //   1334: ifnull -> 1359
    //   1337: if_acmpeq -> 1362
    //   1340: goto -> 1347
    //   1343: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1346: athrow
    //   1347: aload #36
    //   1349: getstatic org/bukkit/Material.STICKY_PISTON : Lorg/bukkit/Material;
    //   1352: goto -> 1359
    //   1355: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1358: athrow
    //   1359: if_acmpne -> 1370
    //   1362: iconst_1
    //   1363: goto -> 1371
    //   1366: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1369: athrow
    //   1370: iconst_0
    //   1371: lload_2
    //   1372: lconst_0
    //   1373: lcmp
    //   1374: iflt -> 1395
    //   1377: ior
    //   1378: putfield Vulcan_SL : Z
    //   1381: aload_0
    //   1382: dup
    //   1383: getfield Vulcan_bC : Z
    //   1386: aload #36
    //   1388: getstatic org/bukkit/Material.CONDUIT : Lorg/bukkit/Material;
    //   1391: if_acmpne -> 1402
    //   1394: iconst_1
    //   1395: goto -> 1403
    //   1398: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1401: athrow
    //   1402: iconst_0
    //   1403: lload_2
    //   1404: lconst_0
    //   1405: lcmp
    //   1406: iflt -> 1427
    //   1409: ior
    //   1410: putfield Vulcan_bC : Z
    //   1413: aload_0
    //   1414: dup
    //   1415: getfield Vulcan_K : Z
    //   1418: aload #36
    //   1420: getstatic org/bukkit/Material.SEA_PICKLE : Lorg/bukkit/Material;
    //   1423: if_acmpne -> 1434
    //   1426: iconst_1
    //   1427: goto -> 1435
    //   1430: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1433: athrow
    //   1434: iconst_0
    //   1435: ior
    //   1436: putfield Vulcan_K : Z
    //   1439: aload_0
    //   1440: dup
    //   1441: getfield Vulcan_Sw : Z
    //   1444: aload #36
    //   1446: getstatic org/bukkit/Material.KELP : Lorg/bukkit/Material;
    //   1449: lload_2
    //   1450: lconst_0
    //   1451: lcmp
    //   1452: ifle -> 1482
    //   1455: aload #34
    //   1457: ifnull -> 1482
    //   1460: if_acmpeq -> 1485
    //   1463: goto -> 1470
    //   1466: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1469: athrow
    //   1470: aload #36
    //   1472: getstatic org/bukkit/Material.KELP_PLANT : Lorg/bukkit/Material;
    //   1475: goto -> 1482
    //   1478: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1481: athrow
    //   1482: if_acmpne -> 1493
    //   1485: iconst_1
    //   1486: goto -> 1494
    //   1489: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1492: athrow
    //   1493: iconst_0
    //   1494: lload_2
    //   1495: lconst_0
    //   1496: lcmp
    //   1497: iflt -> 1518
    //   1500: ior
    //   1501: putfield Vulcan_Sw : Z
    //   1504: aload_0
    //   1505: dup
    //   1506: getfield Vulcan_SF : Z
    //   1509: aload #36
    //   1511: getstatic org/bukkit/Material.TURTLE_EGG : Lorg/bukkit/Material;
    //   1514: if_acmpne -> 1525
    //   1517: iconst_1
    //   1518: goto -> 1526
    //   1521: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1524: athrow
    //   1525: iconst_0
    //   1526: lload_2
    //   1527: lconst_0
    //   1528: lcmp
    //   1529: iflt -> 1550
    //   1532: ior
    //   1533: putfield Vulcan_SF : Z
    //   1536: aload_0
    //   1537: dup
    //   1538: getfield Vulcan_Si : Z
    //   1541: aload #36
    //   1543: getstatic org/bukkit/Material.END_ROD : Lorg/bukkit/Material;
    //   1546: if_acmpne -> 1557
    //   1549: iconst_1
    //   1550: goto -> 1558
    //   1553: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1556: athrow
    //   1557: iconst_0
    //   1558: ior
    //   1559: putfield Vulcan_Si : Z
    //   1562: aload_0
    //   1563: dup
    //   1564: getfield Vulcan_kF : Z
    //   1567: aload #36
    //   1569: iconst_1
    //   1570: anewarray java/lang/Object
    //   1573: dup_x1
    //   1574: swap
    //   1575: iconst_0
    //   1576: swap
    //   1577: aastore
    //   1578: invokestatic Vulcan_F : ([Ljava/lang/Object;)Z
    //   1581: ior
    //   1582: putfield Vulcan_kF : Z
    //   1585: aload_0
    //   1586: dup
    //   1587: getfield Vulcan_x : Z
    //   1590: aload #36
    //   1592: lload_2
    //   1593: lconst_0
    //   1594: lcmp
    //   1595: iflt -> 1626
    //   1598: iconst_1
    //   1599: anewarray java/lang/Object
    //   1602: dup_x1
    //   1603: swap
    //   1604: iconst_0
    //   1605: swap
    //   1606: aastore
    //   1607: invokestatic Vulcan_I : ([Ljava/lang/Object;)Z
    //   1610: aload #34
    //   1612: ifnull -> 1647
    //   1615: ior
    //   1616: putfield Vulcan_x : Z
    //   1619: aload_0
    //   1620: dup
    //   1621: getfield Vulcan_Ss : Z
    //   1624: aload #36
    //   1626: getstatic org/bukkit/Material.CAULDRON : Lorg/bukkit/Material;
    //   1629: if_acmpne -> 1650
    //   1632: goto -> 1639
    //   1635: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1638: athrow
    //   1639: iconst_1
    //   1640: goto -> 1647
    //   1643: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1646: athrow
    //   1647: goto -> 1651
    //   1650: iconst_0
    //   1651: lload_2
    //   1652: lconst_0
    //   1653: lcmp
    //   1654: ifle -> 1675
    //   1657: ior
    //   1658: putfield Vulcan_Ss : Z
    //   1661: aload_0
    //   1662: dup
    //   1663: getfield Vulcan_So : Z
    //   1666: aload #36
    //   1668: getstatic org/bukkit/Material.CAKE : Lorg/bukkit/Material;
    //   1671: if_acmpne -> 1682
    //   1674: iconst_1
    //   1675: goto -> 1683
    //   1678: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1681: athrow
    //   1682: iconst_0
    //   1683: ior
    //   1684: putfield Vulcan_So : Z
    //   1687: aload_0
    //   1688: dup
    //   1689: getfield Vulcan_v : Z
    //   1692: aload #36
    //   1694: iconst_1
    //   1695: anewarray java/lang/Object
    //   1698: dup_x1
    //   1699: swap
    //   1700: iconst_0
    //   1701: swap
    //   1702: aastore
    //   1703: invokestatic Vulcan_Ko : ([Ljava/lang/Object;)Z
    //   1706: ior
    //   1707: putfield Vulcan_v : Z
    //   1710: aload_0
    //   1711: dup
    //   1712: getfield Vulcan_kh : Z
    //   1715: aload #36
    //   1717: iconst_1
    //   1718: anewarray java/lang/Object
    //   1721: dup_x1
    //   1722: swap
    //   1723: iconst_0
    //   1724: swap
    //   1725: aastore
    //   1726: invokestatic Vulcan_G : ([Ljava/lang/Object;)Z
    //   1729: ior
    //   1730: putfield Vulcan_kh : Z
    //   1733: aload_0
    //   1734: dup
    //   1735: getfield Vulcan_kA : Z
    //   1738: aload #36
    //   1740: iconst_1
    //   1741: anewarray java/lang/Object
    //   1744: dup_x1
    //   1745: swap
    //   1746: iconst_0
    //   1747: swap
    //   1748: aastore
    //   1749: invokestatic Vulcan_KR : ([Ljava/lang/Object;)Z
    //   1752: ior
    //   1753: putfield Vulcan_kA : Z
    //   1756: aload_0
    //   1757: dup
    //   1758: getfield Vulcan_z : Z
    //   1761: aload #36
    //   1763: iconst_1
    //   1764: anewarray java/lang/Object
    //   1767: dup_x1
    //   1768: swap
    //   1769: iconst_0
    //   1770: swap
    //   1771: aastore
    //   1772: invokestatic Vulcan_Kj : ([Ljava/lang/Object;)Z
    //   1775: ior
    //   1776: putfield Vulcan_z : Z
    //   1779: aload_0
    //   1780: dup
    //   1781: getfield Vulcan_b8 : Z
    //   1784: aload #36
    //   1786: iconst_1
    //   1787: anewarray java/lang/Object
    //   1790: dup_x1
    //   1791: swap
    //   1792: iconst_0
    //   1793: swap
    //   1794: aastore
    //   1795: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   1798: ior
    //   1799: putfield Vulcan_b8 : Z
    //   1802: aload_0
    //   1803: dup
    //   1804: getfield Vulcan_m : Z
    //   1807: aload #36
    //   1809: iconst_1
    //   1810: anewarray java/lang/Object
    //   1813: dup_x1
    //   1814: swap
    //   1815: iconst_0
    //   1816: swap
    //   1817: aastore
    //   1818: invokestatic Vulcan_l : ([Ljava/lang/Object;)Z
    //   1821: ior
    //   1822: putfield Vulcan_m : Z
    //   1825: aload_0
    //   1826: dup
    //   1827: getfield Vulcan_Sz : Z
    //   1830: aload #36
    //   1832: iconst_1
    //   1833: anewarray java/lang/Object
    //   1836: dup_x1
    //   1837: swap
    //   1838: iconst_0
    //   1839: swap
    //   1840: aastore
    //   1841: invokestatic Vulcan_r : ([Ljava/lang/Object;)Z
    //   1844: ior
    //   1845: putfield Vulcan_Sz : Z
    //   1848: aload_0
    //   1849: dup
    //   1850: getfield Vulcan_kV : Z
    //   1853: aload #36
    //   1855: lload #30
    //   1857: iconst_2
    //   1858: anewarray java/lang/Object
    //   1861: dup_x2
    //   1862: dup_x2
    //   1863: pop
    //   1864: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1867: iconst_1
    //   1868: swap
    //   1869: aastore
    //   1870: dup_x1
    //   1871: swap
    //   1872: iconst_0
    //   1873: swap
    //   1874: aastore
    //   1875: invokestatic Vulcan_Kc : ([Ljava/lang/Object;)Z
    //   1878: ior
    //   1879: putfield Vulcan_kV : Z
    //   1882: aload_0
    //   1883: dup
    //   1884: getfield Vulcan_jx : Z
    //   1887: aload #36
    //   1889: lload #10
    //   1891: iconst_2
    //   1892: anewarray java/lang/Object
    //   1895: dup_x2
    //   1896: dup_x2
    //   1897: pop
    //   1898: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1901: iconst_1
    //   1902: swap
    //   1903: aastore
    //   1904: dup_x1
    //   1905: swap
    //   1906: iconst_0
    //   1907: swap
    //   1908: aastore
    //   1909: invokestatic Vulcan_KM : ([Ljava/lang/Object;)Z
    //   1912: ior
    //   1913: putfield Vulcan_jx : Z
    //   1916: aload_0
    //   1917: dup
    //   1918: getfield Vulcan_kj : Z
    //   1921: aload #36
    //   1923: iconst_1
    //   1924: anewarray java/lang/Object
    //   1927: dup_x1
    //   1928: swap
    //   1929: iconst_0
    //   1930: swap
    //   1931: aastore
    //   1932: invokestatic Vulcan_Kp : ([Ljava/lang/Object;)Z
    //   1935: ior
    //   1936: putfield Vulcan_kj : Z
    //   1939: aload_0
    //   1940: dup
    //   1941: getfield Vulcan_C : Z
    //   1944: aload #36
    //   1946: iconst_1
    //   1947: anewarray java/lang/Object
    //   1950: dup_x1
    //   1951: swap
    //   1952: iconst_0
    //   1953: swap
    //   1954: aastore
    //   1955: invokestatic Vulcan_M : ([Ljava/lang/Object;)Z
    //   1958: ior
    //   1959: putfield Vulcan_C : Z
    //   1962: aload_0
    //   1963: dup
    //   1964: getfield Vulcan_X : Z
    //   1967: aload #36
    //   1969: iconst_1
    //   1970: anewarray java/lang/Object
    //   1973: dup_x1
    //   1974: swap
    //   1975: iconst_0
    //   1976: swap
    //   1977: aastore
    //   1978: invokestatic Vulcan_Kv : ([Ljava/lang/Object;)Z
    //   1981: ior
    //   1982: putfield Vulcan_X : Z
    //   1985: aload_0
    //   1986: dup
    //   1987: getfield Vulcan_b4 : Z
    //   1990: aload #36
    //   1992: iconst_1
    //   1993: anewarray java/lang/Object
    //   1996: dup_x1
    //   1997: swap
    //   1998: iconst_0
    //   1999: swap
    //   2000: aastore
    //   2001: invokestatic Vulcan_Ki : ([Ljava/lang/Object;)Z
    //   2004: ior
    //   2005: putfield Vulcan_b4 : Z
    //   2008: aload_0
    //   2009: dup
    //   2010: getfield Vulcan_b1 : Z
    //   2013: aload #36
    //   2015: iconst_1
    //   2016: anewarray java/lang/Object
    //   2019: dup_x1
    //   2020: swap
    //   2021: iconst_0
    //   2022: swap
    //   2023: aastore
    //   2024: invokestatic Vulcan_j : ([Ljava/lang/Object;)Z
    //   2027: ior
    //   2028: putfield Vulcan_b1 : Z
    //   2031: aload_0
    //   2032: dup
    //   2033: getfield Vulcan_ku : Z
    //   2036: aload #36
    //   2038: iconst_1
    //   2039: anewarray java/lang/Object
    //   2042: dup_x1
    //   2043: swap
    //   2044: iconst_0
    //   2045: swap
    //   2046: aastore
    //   2047: invokestatic Vulcan_m : ([Ljava/lang/Object;)Z
    //   2050: ior
    //   2051: putfield Vulcan_ku : Z
    //   2054: aload_0
    //   2055: dup
    //   2056: getfield Vulcan_jn : Z
    //   2059: lload #16
    //   2061: aload #36
    //   2063: iconst_2
    //   2064: anewarray java/lang/Object
    //   2067: dup_x1
    //   2068: swap
    //   2069: iconst_1
    //   2070: swap
    //   2071: aastore
    //   2072: dup_x2
    //   2073: dup_x2
    //   2074: pop
    //   2075: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2078: iconst_0
    //   2079: swap
    //   2080: aastore
    //   2081: invokestatic Vulcan_N : ([Ljava/lang/Object;)Z
    //   2084: ior
    //   2085: putfield Vulcan_jn : Z
    //   2088: aload_0
    //   2089: dup
    //   2090: getfield Vulcan_Sg : Z
    //   2093: aload #36
    //   2095: iconst_1
    //   2096: anewarray java/lang/Object
    //   2099: dup_x1
    //   2100: swap
    //   2101: iconst_0
    //   2102: swap
    //   2103: aastore
    //   2104: invokestatic Vulcan_X : ([Ljava/lang/Object;)Z
    //   2107: ior
    //   2108: putfield Vulcan_Sg : Z
    //   2111: aload_0
    //   2112: dup
    //   2113: getfield Vulcan_bb : Z
    //   2116: lload #18
    //   2118: aload #36
    //   2120: iconst_2
    //   2121: anewarray java/lang/Object
    //   2124: dup_x1
    //   2125: swap
    //   2126: iconst_1
    //   2127: swap
    //   2128: aastore
    //   2129: dup_x2
    //   2130: dup_x2
    //   2131: pop
    //   2132: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2135: iconst_0
    //   2136: swap
    //   2137: aastore
    //   2138: invokestatic Vulcan_Ks : ([Ljava/lang/Object;)Z
    //   2141: ior
    //   2142: putfield Vulcan_bb : Z
    //   2145: aload_0
    //   2146: dup
    //   2147: getfield Vulcan_kb : Z
    //   2150: aload #36
    //   2152: lload #8
    //   2154: iconst_2
    //   2155: anewarray java/lang/Object
    //   2158: dup_x2
    //   2159: dup_x2
    //   2160: pop
    //   2161: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2164: iconst_1
    //   2165: swap
    //   2166: aastore
    //   2167: dup_x1
    //   2168: swap
    //   2169: iconst_0
    //   2170: swap
    //   2171: aastore
    //   2172: invokestatic Vulcan_Km : ([Ljava/lang/Object;)Z
    //   2175: ior
    //   2176: putfield Vulcan_kb : Z
    //   2179: aload_0
    //   2180: dup
    //   2181: getfield Vulcan_bO : Z
    //   2184: aload #36
    //   2186: iconst_1
    //   2187: anewarray java/lang/Object
    //   2190: dup_x1
    //   2191: swap
    //   2192: iconst_0
    //   2193: swap
    //   2194: aastore
    //   2195: invokestatic Vulcan_x : ([Ljava/lang/Object;)Z
    //   2198: ior
    //   2199: putfield Vulcan_bO : Z
    //   2202: aload_0
    //   2203: dup
    //   2204: getfield Vulcan_ka : Z
    //   2207: aload #36
    //   2209: iconst_1
    //   2210: anewarray java/lang/Object
    //   2213: dup_x1
    //   2214: swap
    //   2215: iconst_0
    //   2216: swap
    //   2217: aastore
    //   2218: invokestatic Vulcan_Kh : ([Ljava/lang/Object;)Z
    //   2221: ior
    //   2222: putfield Vulcan_ka : Z
    //   2225: aload_0
    //   2226: dup
    //   2227: getfield Vulcan_bl : Z
    //   2230: aload #36
    //   2232: iconst_1
    //   2233: anewarray java/lang/Object
    //   2236: dup_x1
    //   2237: swap
    //   2238: iconst_0
    //   2239: swap
    //   2240: aastore
    //   2241: invokestatic Vulcan_K3 : ([Ljava/lang/Object;)Z
    //   2244: ior
    //   2245: putfield Vulcan_bl : Z
    //   2248: aload_0
    //   2249: dup
    //   2250: getfield Vulcan_St : Z
    //   2253: aload #36
    //   2255: iconst_1
    //   2256: anewarray java/lang/Object
    //   2259: dup_x1
    //   2260: swap
    //   2261: iconst_0
    //   2262: swap
    //   2263: aastore
    //   2264: invokestatic Vulcan_V : ([Ljava/lang/Object;)Z
    //   2267: ior
    //   2268: putfield Vulcan_St : Z
    //   2271: aload_0
    //   2272: dup
    //   2273: getfield Vulcan_b2 : Z
    //   2276: lload #32
    //   2278: aload #36
    //   2280: iconst_2
    //   2281: anewarray java/lang/Object
    //   2284: dup_x1
    //   2285: swap
    //   2286: iconst_1
    //   2287: swap
    //   2288: aastore
    //   2289: dup_x2
    //   2290: dup_x2
    //   2291: pop
    //   2292: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2295: iconst_0
    //   2296: swap
    //   2297: aastore
    //   2298: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   2301: ior
    //   2302: putfield Vulcan_b2 : Z
    //   2305: aload_0
    //   2306: dup
    //   2307: getfield Vulcan_j2 : Z
    //   2310: aload #36
    //   2312: iconst_1
    //   2313: anewarray java/lang/Object
    //   2316: dup_x1
    //   2317: swap
    //   2318: iconst_0
    //   2319: swap
    //   2320: aastore
    //   2321: invokestatic Vulcan_y : ([Ljava/lang/Object;)Z
    //   2324: ior
    //   2325: putfield Vulcan_j2 : Z
    //   2328: aload_0
    //   2329: dup
    //   2330: getfield Vulcan_g : Z
    //   2333: aload #36
    //   2335: invokestatic Vulcan_KP : (Lorg/bukkit/Material;)Z
    //   2338: ior
    //   2339: putfield Vulcan_g : Z
    //   2342: aload_0
    //   2343: dup
    //   2344: getfield Vulcan_S_ : Z
    //   2347: aload #36
    //   2349: iconst_1
    //   2350: anewarray java/lang/Object
    //   2353: dup_x1
    //   2354: swap
    //   2355: iconst_0
    //   2356: swap
    //   2357: aastore
    //   2358: invokestatic Vulcan_KO : ([Ljava/lang/Object;)Z
    //   2361: ior
    //   2362: putfield Vulcan_S_ : Z
    //   2365: aload_0
    //   2366: dup
    //   2367: getfield Vulcan_j9 : Z
    //   2370: aload #36
    //   2372: iconst_1
    //   2373: anewarray java/lang/Object
    //   2376: dup_x1
    //   2377: swap
    //   2378: iconst_0
    //   2379: swap
    //   2380: aastore
    //   2381: invokestatic Vulcan_T : ([Ljava/lang/Object;)Z
    //   2384: ior
    //   2385: putfield Vulcan_j9 : Z
    //   2388: aload_0
    //   2389: dup
    //   2390: getfield Vulcan_y : Z
    //   2393: lload #20
    //   2395: aload #36
    //   2397: iconst_2
    //   2398: anewarray java/lang/Object
    //   2401: dup_x1
    //   2402: swap
    //   2403: iconst_1
    //   2404: swap
    //   2405: aastore
    //   2406: dup_x2
    //   2407: dup_x2
    //   2408: pop
    //   2409: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2412: iconst_0
    //   2413: swap
    //   2414: aastore
    //   2415: invokestatic Vulcan_t : ([Ljava/lang/Object;)Z
    //   2418: ior
    //   2419: putfield Vulcan_y : Z
    //   2422: aload_0
    //   2423: dup
    //   2424: getfield Vulcan_j1 : Z
    //   2427: aload #36
    //   2429: lload #22
    //   2431: iconst_2
    //   2432: anewarray java/lang/Object
    //   2435: dup_x2
    //   2436: dup_x2
    //   2437: pop
    //   2438: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2441: iconst_1
    //   2442: swap
    //   2443: aastore
    //   2444: dup_x1
    //   2445: swap
    //   2446: iconst_0
    //   2447: swap
    //   2448: aastore
    //   2449: invokestatic Vulcan_Kg : ([Ljava/lang/Object;)Z
    //   2452: ior
    //   2453: putfield Vulcan_j1 : Z
    //   2456: aload_0
    //   2457: dup
    //   2458: getfield Vulcan_b_ : Z
    //   2461: aload #36
    //   2463: lload #14
    //   2465: iconst_2
    //   2466: anewarray java/lang/Object
    //   2469: dup_x2
    //   2470: dup_x2
    //   2471: pop
    //   2472: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2475: iconst_1
    //   2476: swap
    //   2477: aastore
    //   2478: dup_x1
    //   2479: swap
    //   2480: iconst_0
    //   2481: swap
    //   2482: aastore
    //   2483: invokestatic Vulcan_KF : ([Ljava/lang/Object;)Z
    //   2486: ior
    //   2487: putfield Vulcan_b_ : Z
    //   2490: aload_0
    //   2491: dup
    //   2492: getfield Vulcan_a : Z
    //   2495: aload #36
    //   2497: iconst_1
    //   2498: anewarray java/lang/Object
    //   2501: dup_x1
    //   2502: swap
    //   2503: iconst_0
    //   2504: swap
    //   2505: aastore
    //   2506: invokestatic Vulcan_KB : ([Ljava/lang/Object;)Z
    //   2509: ior
    //   2510: putfield Vulcan_a : Z
    //   2513: aload_0
    //   2514: dup
    //   2515: getfield Vulcan_Sl : Z
    //   2518: aload #36
    //   2520: iconst_1
    //   2521: anewarray java/lang/Object
    //   2524: dup_x1
    //   2525: swap
    //   2526: iconst_0
    //   2527: swap
    //   2528: aastore
    //   2529: invokestatic Vulcan_K7 : ([Ljava/lang/Object;)Z
    //   2532: ior
    //   2533: putfield Vulcan_Sl : Z
    //   2536: aload_0
    //   2537: dup
    //   2538: getfield Vulcan_I : Z
    //   2541: aload #36
    //   2543: iconst_1
    //   2544: anewarray java/lang/Object
    //   2547: dup_x1
    //   2548: swap
    //   2549: iconst_0
    //   2550: swap
    //   2551: aastore
    //   2552: invokestatic Vulcan_H : ([Ljava/lang/Object;)Z
    //   2555: ior
    //   2556: putfield Vulcan_I : Z
    //   2559: aload_0
    //   2560: dup
    //   2561: getfield Vulcan_kv : Z
    //   2564: aload #36
    //   2566: iconst_1
    //   2567: anewarray java/lang/Object
    //   2570: dup_x1
    //   2571: swap
    //   2572: iconst_0
    //   2573: swap
    //   2574: aastore
    //   2575: invokestatic Vulcan_e : ([Ljava/lang/Object;)Z
    //   2578: ior
    //   2579: putfield Vulcan_kv : Z
    //   2582: aload_0
    //   2583: dup
    //   2584: getfield Vulcan_kx : Z
    //   2587: aload #36
    //   2589: iconst_1
    //   2590: anewarray java/lang/Object
    //   2593: dup_x1
    //   2594: swap
    //   2595: iconst_0
    //   2596: swap
    //   2597: aastore
    //   2598: invokestatic Vulcan_Ky : ([Ljava/lang/Object;)Z
    //   2601: ior
    //   2602: putfield Vulcan_kx : Z
    //   2605: aload_0
    //   2606: dup
    //   2607: getfield Vulcan_bV : Z
    //   2610: aload #36
    //   2612: iconst_1
    //   2613: anewarray java/lang/Object
    //   2616: dup_x1
    //   2617: swap
    //   2618: iconst_0
    //   2619: swap
    //   2620: aastore
    //   2621: invokestatic Vulcan_Kb : ([Ljava/lang/Object;)Z
    //   2624: ior
    //   2625: putfield Vulcan_bV : Z
    //   2628: aload_0
    //   2629: dup
    //   2630: getfield Vulcan_kK : Z
    //   2633: aload #36
    //   2635: iconst_1
    //   2636: anewarray java/lang/Object
    //   2639: dup_x1
    //   2640: swap
    //   2641: iconst_0
    //   2642: swap
    //   2643: aastore
    //   2644: invokestatic Vulcan_U : ([Ljava/lang/Object;)Z
    //   2647: ior
    //   2648: putfield Vulcan_kK : Z
    //   2651: aload_0
    //   2652: dup
    //   2653: getfield Vulcan_j8 : Z
    //   2656: lload #6
    //   2658: aload #36
    //   2660: iconst_2
    //   2661: anewarray java/lang/Object
    //   2664: dup_x1
    //   2665: swap
    //   2666: iconst_1
    //   2667: swap
    //   2668: aastore
    //   2669: dup_x2
    //   2670: dup_x2
    //   2671: pop
    //   2672: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2675: iconst_0
    //   2676: swap
    //   2677: aastore
    //   2678: invokestatic Vulcan_KC : ([Ljava/lang/Object;)Z
    //   2681: ior
    //   2682: putfield Vulcan_j8 : Z
    //   2685: aload_0
    //   2686: dup
    //   2687: getfield Vulcan_jX : Z
    //   2690: aload #36
    //   2692: iconst_1
    //   2693: anewarray java/lang/Object
    //   2696: dup_x1
    //   2697: swap
    //   2698: iconst_0
    //   2699: swap
    //   2700: aastore
    //   2701: invokestatic Vulcan_D : ([Ljava/lang/Object;)Z
    //   2704: ior
    //   2705: putfield Vulcan_jX : Z
    //   2708: aload_0
    //   2709: dup
    //   2710: getfield Vulcan_SN : Z
    //   2713: aload #36
    //   2715: iconst_1
    //   2716: anewarray java/lang/Object
    //   2719: dup_x1
    //   2720: swap
    //   2721: iconst_0
    //   2722: swap
    //   2723: aastore
    //   2724: invokestatic Vulcan_KA : ([Ljava/lang/Object;)Z
    //   2727: ior
    //   2728: putfield Vulcan_SN : Z
    //   2731: aload #34
    //   2733: ifnonnull -> 617
    //   2736: aload_0
    //   2737: aload_0
    //   2738: lload_2
    //   2739: lconst_0
    //   2740: lcmp
    //   2741: ifle -> 3191
    //   2744: aload_0
    //   2745: iconst_0
    //   2746: dup_x1
    //   2747: putfield Vulcan_kD : Z
    //   2750: dup_x1
    //   2751: putfield Vulcan_SC : Z
    //   2754: putfield Vulcan_L : Z
    //   2757: aload_0
    //   2758: getfield Vulcan_SO : Ljava/util/List;
    //   2761: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2766: astore #35
    //   2768: aload #35
    //   2770: invokeinterface hasNext : ()Z
    //   2775: ifeq -> 3010
    //   2778: aload #35
    //   2780: invokeinterface next : ()Ljava/lang/Object;
    //   2785: checkcast org/bukkit/entity/Entity
    //   2788: astore #36
    //   2790: aload_0
    //   2791: dup
    //   2792: getfield Vulcan_L : Z
    //   2795: aload #36
    //   2797: iconst_1
    //   2798: anewarray java/lang/Object
    //   2801: dup_x1
    //   2802: swap
    //   2803: iconst_0
    //   2804: swap
    //   2805: aastore
    //   2806: invokestatic Vulcan_J : ([Ljava/lang/Object;)Z
    //   2809: ior
    //   2810: putfield Vulcan_L : Z
    //   2813: aload_0
    //   2814: dup
    //   2815: getfield Vulcan_SC : Z
    //   2818: aload #36
    //   2820: iconst_1
    //   2821: anewarray java/lang/Object
    //   2824: dup_x1
    //   2825: swap
    //   2826: iconst_0
    //   2827: swap
    //   2828: aastore
    //   2829: invokestatic Vulcan_R : ([Ljava/lang/Object;)Z
    //   2832: ior
    //   2833: putfield Vulcan_SC : Z
    //   2836: aload #36
    //   2838: instanceof org/bukkit/entity/LivingEntity
    //   2841: lload_2
    //   2842: lconst_0
    //   2843: lcmp
    //   2844: ifle -> 3043
    //   2847: aload #34
    //   2849: ifnull -> 3043
    //   2852: aload #34
    //   2854: lload_2
    //   2855: lconst_0
    //   2856: lcmp
    //   2857: ifle -> 2899
    //   2860: ifnull -> 2897
    //   2863: goto -> 2870
    //   2866: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2869: athrow
    //   2870: ifeq -> 2892
    //   2873: goto -> 2880
    //   2876: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2879: athrow
    //   2880: aload_0
    //   2881: iconst_1
    //   2882: putfield Vulcan_kD : Z
    //   2885: goto -> 2892
    //   2888: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2891: athrow
    //   2892: aload #36
    //   2894: instanceof org/bukkit/entity/Firework
    //   2897: aload #34
    //   2899: lload_2
    //   2900: lconst_0
    //   2901: lcmp
    //   2902: iflt -> 2943
    //   2905: ifnull -> 2935
    //   2908: ifeq -> 2930
    //   2911: goto -> 2918
    //   2914: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2917: athrow
    //   2918: aload_0
    //   2919: iconst_0
    //   2920: putfield Vulcan_kJ : I
    //   2923: goto -> 2930
    //   2926: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2929: athrow
    //   2930: aload #36
    //   2932: instanceof org/bukkit/entity/EnderDragon
    //   2935: lload_2
    //   2936: lconst_0
    //   2937: lcmp
    //   2938: iflt -> 2968
    //   2941: aload #34
    //   2943: ifnull -> 2968
    //   2946: ifne -> 2971
    //   2949: goto -> 2956
    //   2952: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2955: athrow
    //   2956: aload #36
    //   2958: instanceof org/bukkit/entity/EnderDragonPart
    //   2961: goto -> 2968
    //   2964: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2967: athrow
    //   2968: ifeq -> 3005
    //   2971: aload_0
    //   2972: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   2975: iconst_0
    //   2976: anewarray java/lang/Object
    //   2979: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   2982: iconst_0
    //   2983: iconst_1
    //   2984: anewarray java/lang/Object
    //   2987: dup_x1
    //   2988: swap
    //   2989: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2992: iconst_0
    //   2993: swap
    //   2994: aastore
    //   2995: invokevirtual Vulcan_Mu : ([Ljava/lang/Object;)V
    //   2998: goto -> 3005
    //   3001: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3004: athrow
    //   3005: aload #34
    //   3007: ifnonnull -> 2768
    //   3010: aload_0
    //   3011: aload #34
    //   3013: lload_2
    //   3014: lconst_0
    //   3015: lcmp
    //   3016: iflt -> 3183
    //   3019: lload_2
    //   3020: lconst_0
    //   3021: lcmp
    //   3022: iflt -> 3214
    //   3025: ifnull -> 3190
    //   3028: getfield Vulcan_SO : Ljava/util/List;
    //   3031: invokeinterface size : ()I
    //   3036: goto -> 3043
    //   3039: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3042: athrow
    //   3043: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yK : I
    //   3046: if_icmple -> 3061
    //   3049: aload_0
    //   3050: iconst_0
    //   3051: putfield Vulcan_kp : I
    //   3054: goto -> 3061
    //   3057: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3060: athrow
    //   3061: aload_0
    //   3062: aload_0
    //   3063: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3066: lload #26
    //   3068: iconst_2
    //   3069: anewarray java/lang/Object
    //   3072: dup_x2
    //   3073: dup_x2
    //   3074: pop
    //   3075: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3078: iconst_1
    //   3079: swap
    //   3080: aastore
    //   3081: dup_x1
    //   3082: swap
    //   3083: iconst_0
    //   3084: swap
    //   3085: aastore
    //   3086: invokestatic Vulcan_X : ([Ljava/lang/Object;)Z
    //   3089: putfield Vulcan_e : Z
    //   3092: aload_0
    //   3093: aload_0
    //   3094: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3097: lload #28
    //   3099: dup2_x1
    //   3100: pop2
    //   3101: iconst_2
    //   3102: anewarray java/lang/Object
    //   3105: dup_x1
    //   3106: swap
    //   3107: iconst_1
    //   3108: swap
    //   3109: aastore
    //   3110: dup_x2
    //   3111: dup_x2
    //   3112: pop
    //   3113: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3116: iconst_0
    //   3117: swap
    //   3118: aastore
    //   3119: invokestatic Vulcan_d : ([Ljava/lang/Object;)Z
    //   3122: putfield Vulcan_kB : Z
    //   3125: aload_0
    //   3126: aload_0
    //   3127: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3130: lload #4
    //   3132: iconst_2
    //   3133: anewarray java/lang/Object
    //   3136: dup_x2
    //   3137: dup_x2
    //   3138: pop
    //   3139: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3142: iconst_1
    //   3143: swap
    //   3144: aastore
    //   3145: dup_x1
    //   3146: swap
    //   3147: iconst_0
    //   3148: swap
    //   3149: aastore
    //   3150: invokestatic Vulcan__ : ([Ljava/lang/Object;)Z
    //   3153: putfield Vulcan_bi : Z
    //   3156: aload_0
    //   3157: aload_0
    //   3158: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3161: lload #12
    //   3163: dup2_x1
    //   3164: pop2
    //   3165: iconst_2
    //   3166: anewarray java/lang/Object
    //   3169: dup_x1
    //   3170: swap
    //   3171: iconst_1
    //   3172: swap
    //   3173: aastore
    //   3174: dup_x2
    //   3175: dup_x2
    //   3176: pop
    //   3177: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3180: iconst_0
    //   3181: swap
    //   3182: aastore
    //   3183: invokestatic Vulcan_T : ([Ljava/lang/Object;)Z
    //   3186: putfield Vulcan_o : Z
    //   3189: aload_0
    //   3190: aload_0
    //   3191: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3194: lload #24
    //   3196: iconst_2
    //   3197: anewarray java/lang/Object
    //   3200: dup_x2
    //   3201: dup_x2
    //   3202: pop
    //   3203: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3206: iconst_1
    //   3207: swap
    //   3208: aastore
    //   3209: dup_x1
    //   3210: swap
    //   3211: iconst_0
    //   3212: swap
    //   3213: aastore
    //   3214: invokestatic Vulcan_q : ([Ljava/lang/Object;)Z
    //   3217: putfield Vulcan_bB : Z
    //   3220: aload_0
    //   3221: aload #34
    //   3223: ifnull -> 3593
    //   3226: getfield Vulcan_L : Z
    //   3229: ifne -> 3585
    //   3232: goto -> 3239
    //   3235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3238: athrow
    //   3239: aload_0
    //   3240: aload #34
    //   3242: ifnull -> 3593
    //   3245: goto -> 3252
    //   3248: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3251: athrow
    //   3252: lload_2
    //   3253: lconst_0
    //   3254: lcmp
    //   3255: iflt -> 3586
    //   3258: getfield Vulcan_SC : Z
    //   3261: ifne -> 3585
    //   3264: goto -> 3271
    //   3267: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3270: athrow
    //   3271: aload_0
    //   3272: aload #34
    //   3274: ifnull -> 3593
    //   3277: goto -> 3284
    //   3280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3283: athrow
    //   3284: lload_2
    //   3285: lconst_0
    //   3286: lcmp
    //   3287: ifle -> 3586
    //   3290: getfield Vulcan_bb : Z
    //   3293: ifne -> 3585
    //   3296: goto -> 3303
    //   3299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3302: athrow
    //   3303: aload_0
    //   3304: aload #34
    //   3306: ifnull -> 3593
    //   3309: goto -> 3316
    //   3312: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3315: athrow
    //   3316: lload_2
    //   3317: lconst_0
    //   3318: lcmp
    //   3319: ifle -> 3586
    //   3322: getfield Vulcan_Sg : Z
    //   3325: ifne -> 3585
    //   3328: goto -> 3335
    //   3331: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3334: athrow
    //   3335: aload_0
    //   3336: aload #34
    //   3338: ifnull -> 3593
    //   3341: goto -> 3348
    //   3344: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3347: athrow
    //   3348: lload_2
    //   3349: lconst_0
    //   3350: lcmp
    //   3351: ifle -> 3586
    //   3354: getfield Vulcan_b_ : Z
    //   3357: ifne -> 3585
    //   3360: goto -> 3367
    //   3363: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3366: athrow
    //   3367: aload_0
    //   3368: aload #34
    //   3370: ifnull -> 3593
    //   3373: goto -> 3380
    //   3376: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3379: athrow
    //   3380: lload_2
    //   3381: lconst_0
    //   3382: lcmp
    //   3383: ifle -> 3586
    //   3386: getfield Vulcan_kd : Z
    //   3389: ifne -> 3585
    //   3392: goto -> 3399
    //   3395: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3398: athrow
    //   3399: aload_0
    //   3400: aload #34
    //   3402: ifnull -> 3593
    //   3405: goto -> 3412
    //   3408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3411: athrow
    //   3412: lload_2
    //   3413: lconst_0
    //   3414: lcmp
    //   3415: iflt -> 3586
    //   3418: getfield Vulcan_jR : Z
    //   3421: ifne -> 3585
    //   3424: goto -> 3431
    //   3427: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3430: athrow
    //   3431: aload_0
    //   3432: aload #34
    //   3434: ifnull -> 3593
    //   3437: goto -> 3444
    //   3440: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3443: athrow
    //   3444: lload_2
    //   3445: lconst_0
    //   3446: lcmp
    //   3447: ifle -> 3586
    //   3450: getfield Vulcan_kN : Z
    //   3453: ifne -> 3585
    //   3456: goto -> 3463
    //   3459: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3462: athrow
    //   3463: aload_0
    //   3464: aload #34
    //   3466: ifnull -> 3593
    //   3469: goto -> 3476
    //   3472: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3475: athrow
    //   3476: lload_2
    //   3477: lconst_0
    //   3478: lcmp
    //   3479: ifle -> 3586
    //   3482: getfield Vulcan_y : Z
    //   3485: ifne -> 3585
    //   3488: goto -> 3495
    //   3491: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3494: athrow
    //   3495: aload_0
    //   3496: aload #34
    //   3498: ifnull -> 3593
    //   3501: goto -> 3508
    //   3504: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3507: athrow
    //   3508: lload_2
    //   3509: lconst_0
    //   3510: lcmp
    //   3511: iflt -> 3586
    //   3514: getfield Vulcan_b6 : Z
    //   3517: ifne -> 3585
    //   3520: goto -> 3527
    //   3523: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3526: athrow
    //   3527: aload_0
    //   3528: aload #34
    //   3530: ifnull -> 3593
    //   3533: goto -> 3540
    //   3536: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3539: athrow
    //   3540: lload_2
    //   3541: lconst_0
    //   3542: lcmp
    //   3543: ifle -> 3586
    //   3546: getfield Vulcan_a : Z
    //   3549: ifne -> 3585
    //   3552: goto -> 3559
    //   3555: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3558: athrow
    //   3559: aload_0
    //   3560: aload #34
    //   3562: ifnull -> 3593
    //   3565: goto -> 3572
    //   3568: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3571: athrow
    //   3572: getfield Vulcan_kP : Z
    //   3575: ifeq -> 3597
    //   3578: goto -> 3585
    //   3581: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3584: athrow
    //   3585: aload_0
    //   3586: goto -> 3593
    //   3589: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3592: athrow
    //   3593: iconst_0
    //   3594: putfield Vulcan_SU : I
    //   3597: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #275	-> 130
    //   #276	-> 149
    //   #277	-> 154
    //   #278	-> 187
    //   #279	-> 201
    //   #282	-> 230
    //   #283	-> 281
    //   #290	-> 606
    //   #291	-> 639
    //   #292	-> 683
    //   #293	-> 748
    //   #294	-> 780
    //   #295	-> 812
    //   #296	-> 844
    //   #297	-> 876
    //   #298	-> 902
    //   #299	-> 1036
    //   #300	-> 1062
    //   #301	-> 1160
    //   #302	-> 1192
    //   #303	-> 1224
    //   #304	-> 1250
    //   #305	-> 1381
    //   #306	-> 1413
    //   #307	-> 1439
    //   #308	-> 1504
    //   #309	-> 1536
    //   #310	-> 1562
    //   #311	-> 1585
    //   #312	-> 1619
    //   #313	-> 1661
    //   #315	-> 1687
    //   #316	-> 1710
    //   #317	-> 1733
    //   #318	-> 1756
    //   #319	-> 1779
    //   #320	-> 1802
    //   #321	-> 1825
    //   #322	-> 1848
    //   #323	-> 1882
    //   #324	-> 1916
    //   #325	-> 1939
    //   #326	-> 1962
    //   #327	-> 1985
    //   #328	-> 2008
    //   #329	-> 2031
    //   #330	-> 2054
    //   #331	-> 2088
    //   #332	-> 2111
    //   #333	-> 2145
    //   #334	-> 2179
    //   #335	-> 2202
    //   #336	-> 2225
    //   #337	-> 2248
    //   #338	-> 2271
    //   #339	-> 2305
    //   #340	-> 2328
    //   #341	-> 2342
    //   #342	-> 2365
    //   #343	-> 2388
    //   #344	-> 2422
    //   #345	-> 2456
    //   #346	-> 2490
    //   #347	-> 2513
    //   #348	-> 2536
    //   #349	-> 2559
    //   #350	-> 2582
    //   #351	-> 2605
    //   #352	-> 2628
    //   #353	-> 2651
    //   #354	-> 2685
    //   #355	-> 2708
    //   #356	-> 2731
    //   #358	-> 2736
    //   #360	-> 2757
    //   #361	-> 2790
    //   #362	-> 2813
    //   #364	-> 2836
    //   #365	-> 2892
    //   #366	-> 2930
    //   #367	-> 3005
    //   #369	-> 3010
    //   #371	-> 3061
    //   #372	-> 3092
    //   #373	-> 3125
    //   #374	-> 3156
    //   #375	-> 3189
    //   #378	-> 3220
    //   #380	-> 3585
    //   #382	-> 3597
    // Exception table:
    //   from	to	target	type
    //   130	142	145	java/lang/RuntimeException
    //   187	217	226	java/lang/RuntimeException
    //   230	239	242	java/lang/RuntimeException
    //   246	261	264	java/lang/RuntimeException
    //   249	274	277	java/lang/RuntimeException
    //   639	663	666	java/lang/RuntimeException
    //   655	674	674	java/lang/RuntimeException
    //   679	707	710	java/lang/RuntimeException
    //   704	719	722	java/lang/RuntimeException
    //   726	733	733	java/lang/RuntimeException
    //   738	765	765	java/lang/RuntimeException
    //   770	797	797	java/lang/RuntimeException
    //   802	829	829	java/lang/RuntimeException
    //   834	861	861	java/lang/RuntimeException
    //   866	893	893	java/lang/RuntimeException
    //   898	926	929	java/lang/RuntimeException
    //   923	938	941	java/lang/RuntimeException
    //   945	953	956	java/lang/RuntimeException
    //   950	973	976	java/lang/RuntimeException
    //   960	983	986	java/lang/RuntimeException
    //   995	1014	1017	java/lang/RuntimeException
    //   1026	1053	1053	java/lang/RuntimeException
    //   1058	1086	1089	java/lang/RuntimeException
    //   1083	1098	1101	java/lang/RuntimeException
    //   1105	1119	1122	java/lang/RuntimeException
    //   1116	1131	1134	java/lang/RuntimeException
    //   1138	1145	1145	java/lang/RuntimeException
    //   1150	1177	1177	java/lang/RuntimeException
    //   1182	1209	1209	java/lang/RuntimeException
    //   1214	1241	1241	java/lang/RuntimeException
    //   1246	1274	1277	java/lang/RuntimeException
    //   1271	1286	1289	java/lang/RuntimeException
    //   1293	1307	1310	java/lang/RuntimeException
    //   1304	1319	1322	java/lang/RuntimeException
    //   1326	1340	1343	java/lang/RuntimeException
    //   1337	1352	1355	java/lang/RuntimeException
    //   1359	1366	1366	java/lang/RuntimeException
    //   1371	1398	1398	java/lang/RuntimeException
    //   1403	1430	1430	java/lang/RuntimeException
    //   1435	1463	1466	java/lang/RuntimeException
    //   1460	1475	1478	java/lang/RuntimeException
    //   1482	1489	1489	java/lang/RuntimeException
    //   1494	1521	1521	java/lang/RuntimeException
    //   1526	1553	1553	java/lang/RuntimeException
    //   1558	1632	1635	java/lang/RuntimeException
    //   1615	1640	1643	java/lang/RuntimeException
    //   1651	1678	1678	java/lang/RuntimeException
    //   2790	2863	2866	java/lang/RuntimeException
    //   2852	2873	2876	java/lang/RuntimeException
    //   2870	2885	2888	java/lang/RuntimeException
    //   2897	2911	2914	java/lang/RuntimeException
    //   2908	2923	2926	java/lang/RuntimeException
    //   2935	2949	2952	java/lang/RuntimeException
    //   2946	2961	2964	java/lang/RuntimeException
    //   2968	2998	3001	java/lang/RuntimeException
    //   3010	3036	3039	java/lang/RuntimeException
    //   3043	3054	3057	java/lang/RuntimeException
    //   3221	3232	3235	java/lang/RuntimeException
    //   3226	3245	3248	java/lang/RuntimeException
    //   3239	3264	3267	java/lang/RuntimeException
    //   3252	3277	3280	java/lang/RuntimeException
    //   3271	3296	3299	java/lang/RuntimeException
    //   3284	3309	3312	java/lang/RuntimeException
    //   3303	3328	3331	java/lang/RuntimeException
    //   3316	3341	3344	java/lang/RuntimeException
    //   3335	3360	3363	java/lang/RuntimeException
    //   3348	3373	3376	java/lang/RuntimeException
    //   3367	3392	3395	java/lang/RuntimeException
    //   3380	3405	3408	java/lang/RuntimeException
    //   3399	3424	3427	java/lang/RuntimeException
    //   3412	3437	3440	java/lang/RuntimeException
    //   3431	3456	3459	java/lang/RuntimeException
    //   3444	3469	3472	java/lang/RuntimeException
    //   3463	3488	3491	java/lang/RuntimeException
    //   3476	3501	3504	java/lang/RuntimeException
    //   3495	3520	3523	java/lang/RuntimeException
    //   3508	3533	3536	java/lang/RuntimeException
    //   3527	3552	3555	java/lang/RuntimeException
    //   3540	3565	3568	java/lang/RuntimeException
    //   3559	3578	3581	java/lang/RuntimeException
    //   3572	3586	3589	java/lang/RuntimeException
  }
  
  private void Vulcan_tL(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 90888008653591
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 17656482182822
    //   30: lxor
    //   31: lstore #6
    //   33: dup2
    //   34: ldc2_w 111169718844804
    //   37: lxor
    //   38: lstore #8
    //   40: dup2
    //   41: ldc2_w 92672773777146
    //   44: lxor
    //   45: lstore #10
    //   47: dup2
    //   48: ldc2_w 2638830099107
    //   51: lxor
    //   52: lstore #12
    //   54: dup2
    //   55: ldc2_w 138824876404272
    //   58: lxor
    //   59: lstore #14
    //   61: dup2
    //   62: ldc2_w 84455530379818
    //   65: lxor
    //   66: lstore #16
    //   68: dup2
    //   69: ldc2_w 28150892826400
    //   72: lxor
    //   73: lstore #18
    //   75: dup2
    //   76: ldc2_w 103670173431104
    //   79: lxor
    //   80: lstore #20
    //   82: dup2
    //   83: ldc2_w 78181387206053
    //   86: lxor
    //   87: lstore #22
    //   89: dup2
    //   90: ldc2_w 90044755313309
    //   93: lxor
    //   94: lstore #24
    //   96: dup2
    //   97: ldc2_w 54170575594225
    //   100: lxor
    //   101: lstore #26
    //   103: pop2
    //   104: aload_0
    //   105: aload_0
    //   106: getfield Vulcan_SD : D
    //   109: invokestatic floor : (D)I
    //   112: putfield Vulcan_f : I
    //   115: aload_0
    //   116: aload_0
    //   117: getfield Vulcan_bh : D
    //   120: invokestatic floor : (D)I
    //   123: putfield Vulcan_bL : I
    //   126: aload_0
    //   127: aload_0
    //   128: getfield Vulcan_SP : D
    //   131: invokestatic floor : (D)I
    //   134: putfield Vulcan_bp : I
    //   137: aload_0
    //   138: aload_0
    //   139: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   142: aload_0
    //   143: getfield Vulcan_f : I
    //   146: aload_0
    //   147: getfield Vulcan_bL : I
    //   150: aload_0
    //   151: getfield Vulcan_bp : I
    //   154: lload #24
    //   156: iconst_1
    //   157: bipush #6
    //   159: anewarray java/lang/Object
    //   162: dup_x1
    //   163: swap
    //   164: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   167: iconst_5
    //   168: swap
    //   169: aastore
    //   170: dup_x2
    //   171: dup_x2
    //   172: pop
    //   173: invokestatic valueOf : (J)Ljava/lang/Long;
    //   176: iconst_4
    //   177: swap
    //   178: aastore
    //   179: dup_x1
    //   180: swap
    //   181: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   184: iconst_3
    //   185: swap
    //   186: aastore
    //   187: dup_x1
    //   188: swap
    //   189: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   192: iconst_2
    //   193: swap
    //   194: aastore
    //   195: dup_x1
    //   196: swap
    //   197: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   200: iconst_1
    //   201: swap
    //   202: aastore
    //   203: dup_x1
    //   204: swap
    //   205: iconst_0
    //   206: swap
    //   207: aastore
    //   208: invokestatic Vulcan_B : ([Ljava/lang/Object;)Ljava/util/List;
    //   211: putfield Vulcan_S5 : Ljava/util/List;
    //   214: aload_0
    //   215: aload_0
    //   216: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   219: lload #22
    //   221: iconst_2
    //   222: anewarray java/lang/Object
    //   225: dup_x2
    //   226: dup_x2
    //   227: pop
    //   228: invokestatic valueOf : (J)Ljava/lang/Long;
    //   231: iconst_1
    //   232: swap
    //   233: aastore
    //   234: dup_x1
    //   235: swap
    //   236: iconst_0
    //   237: swap
    //   238: aastore
    //   239: invokestatic Vulcan_l : ([Ljava/lang/Object;)Ljava/util/List;
    //   242: putfield Vulcan_SM : Ljava/util/List;
    //   245: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   248: aload_0
    //   249: aload_0
    //   250: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   253: lload #8
    //   255: iconst_2
    //   256: anewarray java/lang/Object
    //   259: dup_x2
    //   260: dup_x2
    //   261: pop
    //   262: invokestatic valueOf : (J)Ljava/lang/Long;
    //   265: iconst_1
    //   266: swap
    //   267: aastore
    //   268: dup_x1
    //   269: swap
    //   270: iconst_0
    //   271: swap
    //   272: aastore
    //   273: invokestatic Vulcan_u : ([Ljava/lang/Object;)Ljava/util/List;
    //   276: putfield Vulcan_SQ : Ljava/util/List;
    //   279: aload_0
    //   280: aload_0
    //   281: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   284: lload #12
    //   286: dup2_x1
    //   287: pop2
    //   288: iconst_2
    //   289: anewarray java/lang/Object
    //   292: dup_x1
    //   293: swap
    //   294: iconst_1
    //   295: swap
    //   296: aastore
    //   297: dup_x2
    //   298: dup_x2
    //   299: pop
    //   300: invokestatic valueOf : (J)Ljava/lang/Long;
    //   303: iconst_0
    //   304: swap
    //   305: aastore
    //   306: invokestatic Vulcan_k : ([Ljava/lang/Object;)Ljava/util/List;
    //   309: putfield Vulcan_t : Ljava/util/List;
    //   312: aload_0
    //   313: aload_0
    //   314: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   317: lload #10
    //   319: iconst_2
    //   320: anewarray java/lang/Object
    //   323: dup_x2
    //   324: dup_x2
    //   325: pop
    //   326: invokestatic valueOf : (J)Ljava/lang/Long;
    //   329: iconst_1
    //   330: swap
    //   331: aastore
    //   332: dup_x1
    //   333: swap
    //   334: iconst_0
    //   335: swap
    //   336: aastore
    //   337: invokestatic Vulcan_d : ([Ljava/lang/Object;)Ljava/util/List;
    //   340: putfield Vulcan__ : Ljava/util/List;
    //   343: aload_0
    //   344: aload_0
    //   345: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   348: aload_0
    //   349: getfield Vulcan_f : I
    //   352: lload #4
    //   354: dup2_x1
    //   355: pop2
    //   356: aload_0
    //   357: getfield Vulcan_bh : D
    //   360: dconst_1
    //   361: dsub
    //   362: invokestatic floor : (D)I
    //   365: aload_0
    //   366: getfield Vulcan_bp : I
    //   369: iconst_5
    //   370: anewarray java/lang/Object
    //   373: dup_x1
    //   374: swap
    //   375: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   378: iconst_4
    //   379: swap
    //   380: aastore
    //   381: dup_x1
    //   382: swap
    //   383: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   386: iconst_3
    //   387: swap
    //   388: aastore
    //   389: dup_x1
    //   390: swap
    //   391: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   394: iconst_2
    //   395: swap
    //   396: aastore
    //   397: dup_x2
    //   398: dup_x2
    //   399: pop
    //   400: invokestatic valueOf : (J)Ljava/lang/Long;
    //   403: iconst_1
    //   404: swap
    //   405: aastore
    //   406: dup_x1
    //   407: swap
    //   408: iconst_0
    //   409: swap
    //   410: aastore
    //   411: invokestatic Vulcan_a : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   414: putfield Vulcan_Se : Lorg/bukkit/Material;
    //   417: aload_0
    //   418: aload_0
    //   419: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   422: aload_0
    //   423: getfield Vulcan_f : I
    //   426: lload #4
    //   428: dup2_x1
    //   429: pop2
    //   430: aload_0
    //   431: getfield Vulcan_bh : D
    //   434: ldc2_w 2.0
    //   437: dsub
    //   438: invokestatic floor : (D)I
    //   441: aload_0
    //   442: getfield Vulcan_bp : I
    //   445: iconst_5
    //   446: anewarray java/lang/Object
    //   449: dup_x1
    //   450: swap
    //   451: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   454: iconst_4
    //   455: swap
    //   456: aastore
    //   457: dup_x1
    //   458: swap
    //   459: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   462: iconst_3
    //   463: swap
    //   464: aastore
    //   465: dup_x1
    //   466: swap
    //   467: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   470: iconst_2
    //   471: swap
    //   472: aastore
    //   473: dup_x2
    //   474: dup_x2
    //   475: pop
    //   476: invokestatic valueOf : (J)Ljava/lang/Long;
    //   479: iconst_1
    //   480: swap
    //   481: aastore
    //   482: dup_x1
    //   483: swap
    //   484: iconst_0
    //   485: swap
    //   486: aastore
    //   487: invokestatic Vulcan_a : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   490: putfield Vulcan_k : Lorg/bukkit/Material;
    //   493: aload_0
    //   494: aload_0
    //   495: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   498: aload_0
    //   499: getfield Vulcan_f : I
    //   502: lload #4
    //   504: dup2_x1
    //   505: pop2
    //   506: aload_0
    //   507: getfield Vulcan_bh : D
    //   510: ldc2_w 3.0
    //   513: dsub
    //   514: invokestatic floor : (D)I
    //   517: aload_0
    //   518: getfield Vulcan_bp : I
    //   521: iconst_5
    //   522: anewarray java/lang/Object
    //   525: dup_x1
    //   526: swap
    //   527: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   530: iconst_4
    //   531: swap
    //   532: aastore
    //   533: dup_x1
    //   534: swap
    //   535: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   538: iconst_3
    //   539: swap
    //   540: aastore
    //   541: dup_x1
    //   542: swap
    //   543: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   546: iconst_2
    //   547: swap
    //   548: aastore
    //   549: dup_x2
    //   550: dup_x2
    //   551: pop
    //   552: invokestatic valueOf : (J)Ljava/lang/Long;
    //   555: iconst_1
    //   556: swap
    //   557: aastore
    //   558: dup_x1
    //   559: swap
    //   560: iconst_0
    //   561: swap
    //   562: aastore
    //   563: invokestatic Vulcan_a : ([Ljava/lang/Object;)Lorg/bukkit/Material;
    //   566: putfield Vulcan_be : Lorg/bukkit/Material;
    //   569: aload_0
    //   570: aload_0
    //   571: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   574: lload #18
    //   576: dup2_x1
    //   577: pop2
    //   578: iconst_2
    //   579: anewarray java/lang/Object
    //   582: dup_x1
    //   583: swap
    //   584: iconst_1
    //   585: swap
    //   586: aastore
    //   587: dup_x2
    //   588: dup_x2
    //   589: pop
    //   590: invokestatic valueOf : (J)Ljava/lang/Long;
    //   593: iconst_0
    //   594: swap
    //   595: aastore
    //   596: invokestatic Vulcan_W : ([Ljava/lang/Object;)Z
    //   599: putfield Vulcan_Sr : Z
    //   602: aload_0
    //   603: aload_0
    //   604: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   607: lload #20
    //   609: dup2_x1
    //   610: pop2
    //   611: iconst_2
    //   612: anewarray java/lang/Object
    //   615: dup_x1
    //   616: swap
    //   617: iconst_1
    //   618: swap
    //   619: aastore
    //   620: dup_x2
    //   621: dup_x2
    //   622: pop
    //   623: invokestatic valueOf : (J)Ljava/lang/Long;
    //   626: iconst_0
    //   627: swap
    //   628: aastore
    //   629: invokestatic Vulcan_K : ([Ljava/lang/Object;)Z
    //   632: putfield Vulcan_jD : Z
    //   635: aload_0
    //   636: aload_0
    //   637: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   640: lload #14
    //   642: iconst_2
    //   643: anewarray java/lang/Object
    //   646: dup_x2
    //   647: dup_x2
    //   648: pop
    //   649: invokestatic valueOf : (J)Ljava/lang/Long;
    //   652: iconst_1
    //   653: swap
    //   654: aastore
    //   655: dup_x1
    //   656: swap
    //   657: iconst_0
    //   658: swap
    //   659: aastore
    //   660: invokestatic Vulcan_G : ([Ljava/lang/Object;)Z
    //   663: putfield Vulcan_bJ : Z
    //   666: astore #28
    //   668: aload_0
    //   669: aload_0
    //   670: getfield Vulcan_SQ : Ljava/util/List;
    //   673: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   678: lload #6
    //   680: dup2_x1
    //   681: pop2
    //   682: iconst_3
    //   683: anewarray java/lang/Object
    //   686: dup_x1
    //   687: swap
    //   688: iconst_2
    //   689: swap
    //   690: aastore
    //   691: dup_x2
    //   692: dup_x2
    //   693: pop
    //   694: invokestatic valueOf : (J)Ljava/lang/Long;
    //   697: iconst_1
    //   698: swap
    //   699: aastore
    //   700: dup_x1
    //   701: swap
    //   702: iconst_0
    //   703: swap
    //   704: aastore
    //   705: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   708: aload #28
    //   710: ifnull -> 724
    //   713: ifne -> 727
    //   716: goto -> 723
    //   719: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   722: athrow
    //   723: iconst_1
    //   724: goto -> 728
    //   727: iconst_0
    //   728: putfield Vulcan_k0 : Z
    //   731: aload_0
    //   732: aload_0
    //   733: getfield Vulcan_t : Ljava/util/List;
    //   736: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   741: lload #6
    //   743: dup2_x1
    //   744: pop2
    //   745: iconst_3
    //   746: anewarray java/lang/Object
    //   749: dup_x1
    //   750: swap
    //   751: iconst_2
    //   752: swap
    //   753: aastore
    //   754: dup_x2
    //   755: dup_x2
    //   756: pop
    //   757: invokestatic valueOf : (J)Ljava/lang/Long;
    //   760: iconst_1
    //   761: swap
    //   762: aastore
    //   763: dup_x1
    //   764: swap
    //   765: iconst_0
    //   766: swap
    //   767: aastore
    //   768: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   771: aload #28
    //   773: ifnull -> 787
    //   776: ifne -> 790
    //   779: goto -> 786
    //   782: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   785: athrow
    //   786: iconst_1
    //   787: goto -> 791
    //   790: iconst_0
    //   791: putfield Vulcan_b7 : Z
    //   794: aload_0
    //   795: aload_0
    //   796: getfield Vulcan_S5 : Ljava/util/List;
    //   799: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   804: lload #26
    //   806: iconst_3
    //   807: anewarray java/lang/Object
    //   810: dup_x2
    //   811: dup_x2
    //   812: pop
    //   813: invokestatic valueOf : (J)Ljava/lang/Long;
    //   816: iconst_2
    //   817: swap
    //   818: aastore
    //   819: dup_x1
    //   820: swap
    //   821: iconst_1
    //   822: swap
    //   823: aastore
    //   824: dup_x1
    //   825: swap
    //   826: iconst_0
    //   827: swap
    //   828: aastore
    //   829: invokestatic Vulcan_G : ([Ljava/lang/Object;)Z
    //   832: putfield Vulcan_ja : Z
    //   835: aload_0
    //   836: aload_0
    //   837: getfield Vulcan_t : Ljava/util/List;
    //   840: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   845: lload #6
    //   847: dup2_x1
    //   848: pop2
    //   849: iconst_3
    //   850: anewarray java/lang/Object
    //   853: dup_x1
    //   854: swap
    //   855: iconst_2
    //   856: swap
    //   857: aastore
    //   858: dup_x2
    //   859: dup_x2
    //   860: pop
    //   861: invokestatic valueOf : (J)Ljava/lang/Long;
    //   864: iconst_1
    //   865: swap
    //   866: aastore
    //   867: dup_x1
    //   868: swap
    //   869: iconst_0
    //   870: swap
    //   871: aastore
    //   872: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   875: aload #28
    //   877: lload_2
    //   878: lconst_0
    //   879: lcmp
    //   880: ifle -> 944
    //   883: ifnull -> 942
    //   886: ifeq -> 961
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   895: athrow
    //   896: aload_0
    //   897: getfield Vulcan_SM : Ljava/util/List;
    //   900: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   905: lload #6
    //   907: dup2_x1
    //   908: pop2
    //   909: iconst_3
    //   910: anewarray java/lang/Object
    //   913: dup_x1
    //   914: swap
    //   915: iconst_2
    //   916: swap
    //   917: aastore
    //   918: dup_x2
    //   919: dup_x2
    //   920: pop
    //   921: invokestatic valueOf : (J)Ljava/lang/Long;
    //   924: iconst_1
    //   925: swap
    //   926: aastore
    //   927: dup_x1
    //   928: swap
    //   929: iconst_0
    //   930: swap
    //   931: aastore
    //   932: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   935: goto -> 942
    //   938: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   941: athrow
    //   942: aload #28
    //   944: ifnull -> 958
    //   947: ifeq -> 961
    //   950: goto -> 957
    //   953: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   956: athrow
    //   957: iconst_1
    //   958: goto -> 962
    //   961: iconst_0
    //   962: putfield Vulcan_kk : Z
    //   965: aload_0
    //   966: lload #16
    //   968: iconst_1
    //   969: anewarray java/lang/Object
    //   972: dup_x2
    //   973: dup_x2
    //   974: pop
    //   975: invokestatic valueOf : (J)Ljava/lang/Long;
    //   978: iconst_0
    //   979: swap
    //   980: aastore
    //   981: invokespecial Vulcan_x : ([Ljava/lang/Object;)V
    //   984: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #386	-> 104
    //   #387	-> 115
    //   #388	-> 126
    //   #390	-> 137
    //   #392	-> 214
    //   #393	-> 248
    //   #394	-> 279
    //   #395	-> 312
    //   #397	-> 343
    //   #398	-> 417
    //   #399	-> 493
    //   #401	-> 569
    //   #402	-> 602
    //   #403	-> 635
    //   #405	-> 668
    //   #406	-> 731
    //   #407	-> 794
    //   #409	-> 835
    //   #411	-> 965
    //   #412	-> 984
    // Exception table:
    //   from	to	target	type
    //   668	716	719	java/lang/RuntimeException
    //   728	779	782	java/lang/RuntimeException
    //   791	889	892	java/lang/RuntimeException
    //   886	935	938	java/lang/RuntimeException
    //   942	950	953	java/lang/RuntimeException
  }
  
  private void Vulcan_x(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 140112840617738
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 135396809280207
    //   30: lxor
    //   31: lstore #6
    //   33: dup2
    //   34: ldc2_w 57876443863798
    //   37: lxor
    //   38: lstore #8
    //   40: dup2
    //   41: ldc2_w 5126920800854
    //   44: lxor
    //   45: lstore #10
    //   47: dup2
    //   48: ldc2_w 84535640495347
    //   51: lxor
    //   52: lstore #12
    //   54: dup2
    //   55: ldc2_w 60461266825389
    //   58: lxor
    //   59: lstore #14
    //   61: dup2
    //   62: ldc2_w 91335057155760
    //   65: lxor
    //   66: lstore #16
    //   68: dup2
    //   69: ldc2_w 21344419561687
    //   72: lxor
    //   73: lstore #18
    //   75: dup2
    //   76: ldc2_w 129760044203334
    //   79: lxor
    //   80: lstore #20
    //   82: dup2
    //   83: ldc2_w 110447516339776
    //   86: lxor
    //   87: lstore #22
    //   89: dup2
    //   90: ldc2_w 125807608824394
    //   93: lxor
    //   94: lstore #24
    //   96: dup2
    //   97: ldc2_w 119969503379948
    //   100: lxor
    //   101: lstore #26
    //   103: dup2
    //   104: ldc2_w 128004329986336
    //   107: lxor
    //   108: lstore #28
    //   110: dup2
    //   111: ldc2_w 130635725389053
    //   114: lxor
    //   115: lstore #30
    //   117: dup2
    //   118: ldc2_w 5727719645292
    //   121: lxor
    //   122: lstore #32
    //   124: dup2
    //   125: ldc2_w 118806043636492
    //   128: lxor
    //   129: lstore #34
    //   131: dup2
    //   132: ldc2_w 123393945467545
    //   135: lxor
    //   136: lstore #36
    //   138: pop2
    //   139: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   142: aload_0
    //   143: aload_0
    //   144: aload_0
    //   145: aload_0
    //   146: aload_0
    //   147: aload_0
    //   148: aload_0
    //   149: aload_0
    //   150: aload_0
    //   151: aload_0
    //   152: aload_0
    //   153: aload_0
    //   154: aload_0
    //   155: aload_0
    //   156: aload_0
    //   157: aload_0
    //   158: aload_0
    //   159: aload_0
    //   160: aload_0
    //   161: aload_0
    //   162: aload_0
    //   163: aload_0
    //   164: aload_0
    //   165: aload_0
    //   166: aload_0
    //   167: aload_0
    //   168: aload_0
    //   169: aload_0
    //   170: aload_0
    //   171: aload_0
    //   172: aload_0
    //   173: aload_0
    //   174: aload_0
    //   175: aload_0
    //   176: aload_0
    //   177: aload_0
    //   178: aload_0
    //   179: aload_0
    //   180: aload_0
    //   181: aload_0
    //   182: aload_0
    //   183: aload_0
    //   184: aload_0
    //   185: aload_0
    //   186: iconst_0
    //   187: dup_x1
    //   188: putfield Vulcan_jX : Z
    //   191: dup_x1
    //   192: putfield Vulcan_j8 : Z
    //   195: dup_x1
    //   196: putfield Vulcan_v : Z
    //   199: dup_x1
    //   200: putfield Vulcan_kA : Z
    //   203: dup_x1
    //   204: putfield Vulcan_kh : Z
    //   207: dup_x1
    //   208: putfield Vulcan_bl : Z
    //   211: dup_x1
    //   212: putfield Vulcan_kv : Z
    //   215: dup_x1
    //   216: putfield Vulcan_I : Z
    //   219: dup_x1
    //   220: putfield Vulcan_So : Z
    //   223: dup_x1
    //   224: putfield Vulcan_kV : Z
    //   227: dup_x1
    //   228: putfield Vulcan_j : Z
    //   231: dup_x1
    //   232: putfield Vulcan_bO : Z
    //   235: dup_x1
    //   236: putfield Vulcan_j1 : Z
    //   239: dup_x1
    //   240: putfield Vulcan_y : Z
    //   243: dup_x1
    //   244: putfield Vulcan_j9 : Z
    //   247: dup_x1
    //   248: putfield Vulcan_SL : Z
    //   251: dup_x1
    //   252: putfield Vulcan_b6 : Z
    //   255: dup_x1
    //   256: putfield Vulcan_S_ : Z
    //   259: dup_x1
    //   260: putfield Vulcan_S1 : Z
    //   263: dup_x1
    //   264: putfield Vulcan_g : Z
    //   267: dup_x1
    //   268: putfield Vulcan_z : Z
    //   271: dup_x1
    //   272: putfield Vulcan_L : Z
    //   275: dup_x1
    //   276: putfield Vulcan_jR : Z
    //   279: dup_x1
    //   280: putfield Vulcan_B : Z
    //   283: dup_x1
    //   284: putfield Vulcan_jm : Z
    //   287: dup_x1
    //   288: putfield Vulcan_j2 : Z
    //   291: dup_x1
    //   292: putfield Vulcan_SH : Z
    //   295: dup_x1
    //   296: putfield Vulcan_ka : Z
    //   299: dup_x1
    //   300: putfield Vulcan_Ss : Z
    //   303: dup_x1
    //   304: putfield Vulcan_kb : Z
    //   307: dup_x1
    //   308: putfield Vulcan_kd : Z
    //   311: dup_x1
    //   312: putfield Vulcan_kN : Z
    //   315: dup_x1
    //   316: putfield Vulcan_b8 : Z
    //   319: dup_x1
    //   320: putfield Vulcan_Sl : Z
    //   323: dup_x1
    //   324: putfield Vulcan_kM : Z
    //   327: dup_x1
    //   328: putfield Vulcan_bb : Z
    //   331: dup_x1
    //   332: putfield Vulcan_kP : Z
    //   335: dup_x1
    //   336: putfield Vulcan_jc : Z
    //   339: dup_x1
    //   340: putfield Vulcan_b2 : Z
    //   343: dup_x1
    //   344: putfield Vulcan_jn : Z
    //   347: dup_x1
    //   348: putfield Vulcan_Sg : Z
    //   351: dup_x1
    //   352: putfield Vulcan_T : Z
    //   355: dup_x1
    //   356: putfield Vulcan_St : Z
    //   359: putfield Vulcan_SV : Z
    //   362: astore #38
    //   364: aload_0
    //   365: aload #38
    //   367: ifnull -> 1877
    //   370: getfield Vulcan_S5 : Ljava/util/List;
    //   373: ifnull -> 1876
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   382: athrow
    //   383: aload_0
    //   384: aload #38
    //   386: lload_2
    //   387: lconst_0
    //   388: lcmp
    //   389: ifle -> 1879
    //   392: ifnull -> 1877
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   401: athrow
    //   402: getfield Vulcan_SO : Ljava/util/List;
    //   405: ifnull -> 1876
    //   408: goto -> 415
    //   411: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   414: athrow
    //   415: aload_0
    //   416: getfield Vulcan_S5 : Ljava/util/List;
    //   419: invokeinterface iterator : ()Ljava/util/Iterator;
    //   424: astore #39
    //   426: aload #39
    //   428: invokeinterface hasNext : ()Z
    //   433: ifeq -> 1527
    //   436: aload #39
    //   438: lload_2
    //   439: lconst_0
    //   440: lcmp
    //   441: ifle -> 1540
    //   444: invokeinterface next : ()Ljava/lang/Object;
    //   449: checkcast org/bukkit/Material
    //   452: astore #40
    //   454: aload_0
    //   455: dup
    //   456: getfield Vulcan_SV : Z
    //   459: aload #40
    //   461: invokestatic Vulcan_K_ : (Lorg/bukkit/Material;)Z
    //   464: ior
    //   465: putfield Vulcan_SV : Z
    //   468: aload_0
    //   469: dup
    //   470: getfield Vulcan_St : Z
    //   473: aload #40
    //   475: iconst_1
    //   476: anewarray java/lang/Object
    //   479: dup_x1
    //   480: swap
    //   481: iconst_0
    //   482: swap
    //   483: aastore
    //   484: invokestatic Vulcan_V : ([Ljava/lang/Object;)Z
    //   487: ior
    //   488: putfield Vulcan_St : Z
    //   491: aload_0
    //   492: dup
    //   493: getfield Vulcan_T : Z
    //   496: aload #40
    //   498: invokestatic Vulcan_K0 : (Lorg/bukkit/Material;)Z
    //   501: ior
    //   502: putfield Vulcan_T : Z
    //   505: aload_0
    //   506: dup
    //   507: getfield Vulcan_Sg : Z
    //   510: aload #40
    //   512: iconst_1
    //   513: anewarray java/lang/Object
    //   516: dup_x1
    //   517: swap
    //   518: iconst_0
    //   519: swap
    //   520: aastore
    //   521: invokestatic Vulcan_X : ([Ljava/lang/Object;)Z
    //   524: ior
    //   525: putfield Vulcan_Sg : Z
    //   528: aload_0
    //   529: dup
    //   530: getfield Vulcan_jn : Z
    //   533: lload #14
    //   535: aload #40
    //   537: iconst_2
    //   538: anewarray java/lang/Object
    //   541: dup_x1
    //   542: swap
    //   543: iconst_1
    //   544: swap
    //   545: aastore
    //   546: dup_x2
    //   547: dup_x2
    //   548: pop
    //   549: invokestatic valueOf : (J)Ljava/lang/Long;
    //   552: iconst_0
    //   553: swap
    //   554: aastore
    //   555: invokestatic Vulcan_N : ([Ljava/lang/Object;)Z
    //   558: ior
    //   559: putfield Vulcan_jn : Z
    //   562: aload_0
    //   563: dup
    //   564: getfield Vulcan_b2 : Z
    //   567: lload #34
    //   569: aload #40
    //   571: iconst_2
    //   572: anewarray java/lang/Object
    //   575: dup_x1
    //   576: swap
    //   577: iconst_1
    //   578: swap
    //   579: aastore
    //   580: dup_x2
    //   581: dup_x2
    //   582: pop
    //   583: invokestatic valueOf : (J)Ljava/lang/Long;
    //   586: iconst_0
    //   587: swap
    //   588: aastore
    //   589: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   592: ior
    //   593: putfield Vulcan_b2 : Z
    //   596: aload_0
    //   597: dup
    //   598: getfield Vulcan_jc : Z
    //   601: aload #40
    //   603: lload #6
    //   605: iconst_2
    //   606: anewarray java/lang/Object
    //   609: dup_x2
    //   610: dup_x2
    //   611: pop
    //   612: invokestatic valueOf : (J)Ljava/lang/Long;
    //   615: iconst_1
    //   616: swap
    //   617: aastore
    //   618: dup_x1
    //   619: swap
    //   620: iconst_0
    //   621: swap
    //   622: aastore
    //   623: invokestatic Vulcan_KJ : ([Ljava/lang/Object;)Z
    //   626: ior
    //   627: putfield Vulcan_jc : Z
    //   630: aload_0
    //   631: dup
    //   632: getfield Vulcan_kP : Z
    //   635: aload #40
    //   637: iconst_1
    //   638: anewarray java/lang/Object
    //   641: dup_x1
    //   642: swap
    //   643: iconst_0
    //   644: swap
    //   645: aastore
    //   646: invokestatic Vulcan_f : ([Ljava/lang/Object;)Z
    //   649: ior
    //   650: putfield Vulcan_kP : Z
    //   653: aload_0
    //   654: dup
    //   655: getfield Vulcan_bb : Z
    //   658: lload #22
    //   660: aload #40
    //   662: iconst_2
    //   663: anewarray java/lang/Object
    //   666: dup_x1
    //   667: swap
    //   668: iconst_1
    //   669: swap
    //   670: aastore
    //   671: dup_x2
    //   672: dup_x2
    //   673: pop
    //   674: invokestatic valueOf : (J)Ljava/lang/Long;
    //   677: iconst_0
    //   678: swap
    //   679: aastore
    //   680: invokestatic Vulcan_Ks : ([Ljava/lang/Object;)Z
    //   683: ior
    //   684: putfield Vulcan_bb : Z
    //   687: aload_0
    //   688: dup
    //   689: getfield Vulcan_kM : Z
    //   692: lload #30
    //   694: aload #40
    //   696: iconst_2
    //   697: anewarray java/lang/Object
    //   700: dup_x1
    //   701: swap
    //   702: iconst_1
    //   703: swap
    //   704: aastore
    //   705: dup_x2
    //   706: dup_x2
    //   707: pop
    //   708: invokestatic valueOf : (J)Ljava/lang/Long;
    //   711: iconst_0
    //   712: swap
    //   713: aastore
    //   714: invokestatic Vulcan_KL : ([Ljava/lang/Object;)Z
    //   717: ior
    //   718: putfield Vulcan_kM : Z
    //   721: aload_0
    //   722: dup
    //   723: getfield Vulcan_kN : Z
    //   726: aload #40
    //   728: iconst_1
    //   729: anewarray java/lang/Object
    //   732: dup_x1
    //   733: swap
    //   734: iconst_0
    //   735: swap
    //   736: aastore
    //   737: invokestatic Vulcan_d : ([Ljava/lang/Object;)Z
    //   740: ior
    //   741: putfield Vulcan_kN : Z
    //   744: aload_0
    //   745: dup
    //   746: getfield Vulcan_kd : Z
    //   749: aload #40
    //   751: iconst_1
    //   752: anewarray java/lang/Object
    //   755: dup_x1
    //   756: swap
    //   757: iconst_0
    //   758: swap
    //   759: aastore
    //   760: invokestatic Vulcan_KY : ([Ljava/lang/Object;)Z
    //   763: ior
    //   764: putfield Vulcan_kd : Z
    //   767: aload_0
    //   768: dup
    //   769: getfield Vulcan_kb : Z
    //   772: aload #40
    //   774: lload #12
    //   776: iconst_2
    //   777: anewarray java/lang/Object
    //   780: dup_x2
    //   781: dup_x2
    //   782: pop
    //   783: invokestatic valueOf : (J)Ljava/lang/Long;
    //   786: iconst_1
    //   787: swap
    //   788: aastore
    //   789: dup_x1
    //   790: swap
    //   791: iconst_0
    //   792: swap
    //   793: aastore
    //   794: invokestatic Vulcan_Km : ([Ljava/lang/Object;)Z
    //   797: ior
    //   798: putfield Vulcan_kb : Z
    //   801: aload_0
    //   802: dup
    //   803: getfield Vulcan_Ss : Z
    //   806: aload #40
    //   808: iconst_1
    //   809: anewarray java/lang/Object
    //   812: dup_x1
    //   813: swap
    //   814: iconst_0
    //   815: swap
    //   816: aastore
    //   817: invokestatic Vulcan_Kr : ([Ljava/lang/Object;)Z
    //   820: ior
    //   821: putfield Vulcan_Ss : Z
    //   824: aload_0
    //   825: dup
    //   826: getfield Vulcan_ka : Z
    //   829: aload #40
    //   831: iconst_1
    //   832: anewarray java/lang/Object
    //   835: dup_x1
    //   836: swap
    //   837: iconst_0
    //   838: swap
    //   839: aastore
    //   840: invokestatic Vulcan_Kh : ([Ljava/lang/Object;)Z
    //   843: ior
    //   844: putfield Vulcan_ka : Z
    //   847: aload_0
    //   848: dup
    //   849: getfield Vulcan_SH : Z
    //   852: aload #40
    //   854: lload #16
    //   856: iconst_2
    //   857: anewarray java/lang/Object
    //   860: dup_x2
    //   861: dup_x2
    //   862: pop
    //   863: invokestatic valueOf : (J)Ljava/lang/Long;
    //   866: iconst_1
    //   867: swap
    //   868: aastore
    //   869: dup_x1
    //   870: swap
    //   871: iconst_0
    //   872: swap
    //   873: aastore
    //   874: invokestatic Vulcan_Z : ([Ljava/lang/Object;)Z
    //   877: ior
    //   878: putfield Vulcan_SH : Z
    //   881: aload_0
    //   882: dup
    //   883: getfield Vulcan_j2 : Z
    //   886: aload #40
    //   888: iconst_1
    //   889: anewarray java/lang/Object
    //   892: dup_x1
    //   893: swap
    //   894: iconst_0
    //   895: swap
    //   896: aastore
    //   897: invokestatic Vulcan_y : ([Ljava/lang/Object;)Z
    //   900: ior
    //   901: putfield Vulcan_j2 : Z
    //   904: aload_0
    //   905: dup
    //   906: getfield Vulcan_jm : Z
    //   909: aload #40
    //   911: iconst_1
    //   912: anewarray java/lang/Object
    //   915: dup_x1
    //   916: swap
    //   917: iconst_0
    //   918: swap
    //   919: aastore
    //   920: invokestatic Vulcan_C : ([Ljava/lang/Object;)Z
    //   923: ior
    //   924: putfield Vulcan_jm : Z
    //   927: aload_0
    //   928: dup
    //   929: getfield Vulcan_B : Z
    //   932: aload #40
    //   934: lload #8
    //   936: iconst_2
    //   937: anewarray java/lang/Object
    //   940: dup_x2
    //   941: dup_x2
    //   942: pop
    //   943: invokestatic valueOf : (J)Ljava/lang/Long;
    //   946: iconst_1
    //   947: swap
    //   948: aastore
    //   949: dup_x1
    //   950: swap
    //   951: iconst_0
    //   952: swap
    //   953: aastore
    //   954: invokestatic Vulcan_z : ([Ljava/lang/Object;)Z
    //   957: ior
    //   958: putfield Vulcan_B : Z
    //   961: aload_0
    //   962: dup
    //   963: getfield Vulcan_jR : Z
    //   966: lload #26
    //   968: aload #40
    //   970: iconst_2
    //   971: anewarray java/lang/Object
    //   974: dup_x1
    //   975: swap
    //   976: iconst_1
    //   977: swap
    //   978: aastore
    //   979: dup_x2
    //   980: dup_x2
    //   981: pop
    //   982: invokestatic valueOf : (J)Ljava/lang/Long;
    //   985: iconst_0
    //   986: swap
    //   987: aastore
    //   988: invokestatic Vulcan_K5 : ([Ljava/lang/Object;)Z
    //   991: ior
    //   992: putfield Vulcan_jR : Z
    //   995: aload_0
    //   996: dup
    //   997: getfield Vulcan_g : Z
    //   1000: aload #40
    //   1002: invokestatic Vulcan_KP : (Lorg/bukkit/Material;)Z
    //   1005: ior
    //   1006: putfield Vulcan_g : Z
    //   1009: aload_0
    //   1010: dup
    //   1011: getfield Vulcan_S1 : Z
    //   1014: aload #40
    //   1016: iconst_1
    //   1017: anewarray java/lang/Object
    //   1020: dup_x1
    //   1021: swap
    //   1022: iconst_0
    //   1023: swap
    //   1024: aastore
    //   1025: invokestatic Vulcan_KQ : ([Ljava/lang/Object;)Z
    //   1028: ior
    //   1029: putfield Vulcan_S1 : Z
    //   1032: aload_0
    //   1033: dup
    //   1034: getfield Vulcan_S_ : Z
    //   1037: aload #40
    //   1039: iconst_1
    //   1040: anewarray java/lang/Object
    //   1043: dup_x1
    //   1044: swap
    //   1045: iconst_0
    //   1046: swap
    //   1047: aastore
    //   1048: invokestatic Vulcan_KO : ([Ljava/lang/Object;)Z
    //   1051: ior
    //   1052: putfield Vulcan_S_ : Z
    //   1055: aload_0
    //   1056: dup
    //   1057: getfield Vulcan_b6 : Z
    //   1060: aload #40
    //   1062: lload #4
    //   1064: iconst_2
    //   1065: anewarray java/lang/Object
    //   1068: dup_x2
    //   1069: dup_x2
    //   1070: pop
    //   1071: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1074: iconst_1
    //   1075: swap
    //   1076: aastore
    //   1077: dup_x1
    //   1078: swap
    //   1079: iconst_0
    //   1080: swap
    //   1081: aastore
    //   1082: invokestatic Vulcan_Kd : ([Ljava/lang/Object;)Z
    //   1085: ior
    //   1086: putfield Vulcan_b6 : Z
    //   1089: aload_0
    //   1090: dup
    //   1091: getfield Vulcan_SL : Z
    //   1094: aload #40
    //   1096: invokestatic Vulcan_KK : (Lorg/bukkit/Material;)Z
    //   1099: ior
    //   1100: putfield Vulcan_SL : Z
    //   1103: aload_0
    //   1104: dup
    //   1105: getfield Vulcan_j9 : Z
    //   1108: aload #40
    //   1110: iconst_1
    //   1111: anewarray java/lang/Object
    //   1114: dup_x1
    //   1115: swap
    //   1116: iconst_0
    //   1117: swap
    //   1118: aastore
    //   1119: invokestatic Vulcan_T : ([Ljava/lang/Object;)Z
    //   1122: ior
    //   1123: putfield Vulcan_j9 : Z
    //   1126: aload_0
    //   1127: dup
    //   1128: getfield Vulcan_y : Z
    //   1131: lload #24
    //   1133: aload #40
    //   1135: iconst_2
    //   1136: anewarray java/lang/Object
    //   1139: dup_x1
    //   1140: swap
    //   1141: iconst_1
    //   1142: swap
    //   1143: aastore
    //   1144: dup_x2
    //   1145: dup_x2
    //   1146: pop
    //   1147: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1150: iconst_0
    //   1151: swap
    //   1152: aastore
    //   1153: invokestatic Vulcan_t : ([Ljava/lang/Object;)Z
    //   1156: ior
    //   1157: putfield Vulcan_y : Z
    //   1160: aload_0
    //   1161: dup
    //   1162: getfield Vulcan_j1 : Z
    //   1165: aload #40
    //   1167: lload #32
    //   1169: iconst_2
    //   1170: anewarray java/lang/Object
    //   1173: dup_x2
    //   1174: dup_x2
    //   1175: pop
    //   1176: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1179: iconst_1
    //   1180: swap
    //   1181: aastore
    //   1182: dup_x1
    //   1183: swap
    //   1184: iconst_0
    //   1185: swap
    //   1186: aastore
    //   1187: invokestatic Vulcan_Kg : ([Ljava/lang/Object;)Z
    //   1190: ior
    //   1191: putfield Vulcan_j1 : Z
    //   1194: aload_0
    //   1195: dup
    //   1196: getfield Vulcan_bO : Z
    //   1199: aload #40
    //   1201: iconst_1
    //   1202: anewarray java/lang/Object
    //   1205: dup_x1
    //   1206: swap
    //   1207: iconst_0
    //   1208: swap
    //   1209: aastore
    //   1210: invokestatic Vulcan_x : ([Ljava/lang/Object;)Z
    //   1213: ior
    //   1214: putfield Vulcan_bO : Z
    //   1217: aload_0
    //   1218: dup
    //   1219: getfield Vulcan_kV : Z
    //   1222: aload #40
    //   1224: lload #36
    //   1226: iconst_2
    //   1227: anewarray java/lang/Object
    //   1230: dup_x2
    //   1231: dup_x2
    //   1232: pop
    //   1233: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1236: iconst_1
    //   1237: swap
    //   1238: aastore
    //   1239: dup_x1
    //   1240: swap
    //   1241: iconst_0
    //   1242: swap
    //   1243: aastore
    //   1244: invokestatic Vulcan_Kc : ([Ljava/lang/Object;)Z
    //   1247: ior
    //   1248: putfield Vulcan_kV : Z
    //   1251: aload_0
    //   1252: dup
    //   1253: getfield Vulcan_So : Z
    //   1256: aload #40
    //   1258: iconst_1
    //   1259: anewarray java/lang/Object
    //   1262: dup_x1
    //   1263: swap
    //   1264: iconst_0
    //   1265: swap
    //   1266: aastore
    //   1267: invokestatic Vulcan_Kq : ([Ljava/lang/Object;)Z
    //   1270: ior
    //   1271: putfield Vulcan_So : Z
    //   1274: aload_0
    //   1275: dup
    //   1276: getfield Vulcan_Sl : Z
    //   1279: aload #40
    //   1281: iconst_1
    //   1282: anewarray java/lang/Object
    //   1285: dup_x1
    //   1286: swap
    //   1287: iconst_0
    //   1288: swap
    //   1289: aastore
    //   1290: invokestatic Vulcan_K7 : ([Ljava/lang/Object;)Z
    //   1293: ior
    //   1294: putfield Vulcan_Sl : Z
    //   1297: aload_0
    //   1298: dup
    //   1299: getfield Vulcan_b8 : Z
    //   1302: aload #40
    //   1304: iconst_1
    //   1305: anewarray java/lang/Object
    //   1308: dup_x1
    //   1309: swap
    //   1310: iconst_0
    //   1311: swap
    //   1312: aastore
    //   1313: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   1316: ior
    //   1317: putfield Vulcan_b8 : Z
    //   1320: aload_0
    //   1321: dup
    //   1322: getfield Vulcan_z : Z
    //   1325: aload #40
    //   1327: iconst_1
    //   1328: anewarray java/lang/Object
    //   1331: dup_x1
    //   1332: swap
    //   1333: iconst_0
    //   1334: swap
    //   1335: aastore
    //   1336: invokestatic Vulcan_Kj : ([Ljava/lang/Object;)Z
    //   1339: ior
    //   1340: putfield Vulcan_z : Z
    //   1343: aload_0
    //   1344: dup
    //   1345: getfield Vulcan_I : Z
    //   1348: aload #40
    //   1350: iconst_1
    //   1351: anewarray java/lang/Object
    //   1354: dup_x1
    //   1355: swap
    //   1356: iconst_0
    //   1357: swap
    //   1358: aastore
    //   1359: invokestatic Vulcan_H : ([Ljava/lang/Object;)Z
    //   1362: ior
    //   1363: putfield Vulcan_I : Z
    //   1366: aload_0
    //   1367: dup
    //   1368: getfield Vulcan_kv : Z
    //   1371: aload #40
    //   1373: iconst_1
    //   1374: anewarray java/lang/Object
    //   1377: dup_x1
    //   1378: swap
    //   1379: iconst_0
    //   1380: swap
    //   1381: aastore
    //   1382: invokestatic Vulcan_e : ([Ljava/lang/Object;)Z
    //   1385: ior
    //   1386: putfield Vulcan_kv : Z
    //   1389: aload_0
    //   1390: dup
    //   1391: getfield Vulcan_bl : Z
    //   1394: aload #40
    //   1396: iconst_1
    //   1397: anewarray java/lang/Object
    //   1400: dup_x1
    //   1401: swap
    //   1402: iconst_0
    //   1403: swap
    //   1404: aastore
    //   1405: invokestatic Vulcan_K3 : ([Ljava/lang/Object;)Z
    //   1408: ior
    //   1409: putfield Vulcan_bl : Z
    //   1412: aload_0
    //   1413: dup
    //   1414: getfield Vulcan_kh : Z
    //   1417: aload #40
    //   1419: iconst_1
    //   1420: anewarray java/lang/Object
    //   1423: dup_x1
    //   1424: swap
    //   1425: iconst_0
    //   1426: swap
    //   1427: aastore
    //   1428: invokestatic Vulcan_G : ([Ljava/lang/Object;)Z
    //   1431: ior
    //   1432: putfield Vulcan_kh : Z
    //   1435: aload_0
    //   1436: dup
    //   1437: getfield Vulcan_kA : Z
    //   1440: aload #40
    //   1442: iconst_1
    //   1443: anewarray java/lang/Object
    //   1446: dup_x1
    //   1447: swap
    //   1448: iconst_0
    //   1449: swap
    //   1450: aastore
    //   1451: invokestatic Vulcan_KR : ([Ljava/lang/Object;)Z
    //   1454: ior
    //   1455: putfield Vulcan_kA : Z
    //   1458: aload_0
    //   1459: dup
    //   1460: getfield Vulcan_v : Z
    //   1463: aload #40
    //   1465: iconst_1
    //   1466: anewarray java/lang/Object
    //   1469: dup_x1
    //   1470: swap
    //   1471: iconst_0
    //   1472: swap
    //   1473: aastore
    //   1474: invokestatic Vulcan_Ko : ([Ljava/lang/Object;)Z
    //   1477: ior
    //   1478: putfield Vulcan_v : Z
    //   1481: aload_0
    //   1482: dup
    //   1483: getfield Vulcan_jX : Z
    //   1486: aload #40
    //   1488: iconst_1
    //   1489: anewarray java/lang/Object
    //   1492: dup_x1
    //   1493: swap
    //   1494: iconst_0
    //   1495: swap
    //   1496: aastore
    //   1497: invokestatic Vulcan_D : ([Ljava/lang/Object;)Z
    //   1500: ior
    //   1501: putfield Vulcan_jX : Z
    //   1504: aload #38
    //   1506: ifnull -> 1538
    //   1509: aload #38
    //   1511: ifnonnull -> 426
    //   1514: lload_2
    //   1515: lconst_0
    //   1516: lcmp
    //   1517: ifle -> 1504
    //   1520: goto -> 1527
    //   1523: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1526: athrow
    //   1527: aload_0
    //   1528: getfield Vulcan_SO : Ljava/util/List;
    //   1531: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1536: astore #39
    //   1538: aload #39
    //   1540: lload_2
    //   1541: lconst_0
    //   1542: lcmp
    //   1543: iflt -> 1561
    //   1546: invokeinterface hasNext : ()Z
    //   1551: ifeq -> 1740
    //   1554: aload #39
    //   1556: invokeinterface next : ()Ljava/lang/Object;
    //   1561: checkcast org/bukkit/entity/Entity
    //   1564: astore #40
    //   1566: lload_2
    //   1567: lconst_0
    //   1568: lcmp
    //   1569: iflt -> 1600
    //   1572: aload_0
    //   1573: aload #38
    //   1575: ifnull -> 1667
    //   1578: dup
    //   1579: getfield Vulcan_L : Z
    //   1582: aload #40
    //   1584: iconst_1
    //   1585: anewarray java/lang/Object
    //   1588: dup_x1
    //   1589: swap
    //   1590: iconst_0
    //   1591: swap
    //   1592: aastore
    //   1593: invokestatic Vulcan_J : ([Ljava/lang/Object;)Z
    //   1596: ior
    //   1597: putfield Vulcan_L : Z
    //   1600: aload #40
    //   1602: instanceof org/bukkit/entity/EnderDragon
    //   1605: lload_2
    //   1606: lconst_0
    //   1607: lcmp
    //   1608: ifle -> 1892
    //   1611: aload #38
    //   1613: ifnull -> 1892
    //   1616: goto -> 1623
    //   1619: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1622: athrow
    //   1623: ifne -> 1666
    //   1626: goto -> 1633
    //   1629: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1632: athrow
    //   1633: aload #40
    //   1635: instanceof org/bukkit/entity/EnderDragonPart
    //   1638: lload_2
    //   1639: lconst_0
    //   1640: lcmp
    //   1641: iflt -> 1698
    //   1644: aload #38
    //   1646: ifnull -> 1698
    //   1649: goto -> 1656
    //   1652: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1655: athrow
    //   1656: ifeq -> 1693
    //   1659: goto -> 1666
    //   1662: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1665: athrow
    //   1666: aload_0
    //   1667: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1670: iconst_0
    //   1671: anewarray java/lang/Object
    //   1674: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1677: iconst_0
    //   1678: iconst_1
    //   1679: anewarray java/lang/Object
    //   1682: dup_x1
    //   1683: swap
    //   1684: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1687: iconst_0
    //   1688: swap
    //   1689: aastore
    //   1690: invokevirtual Vulcan_Mu : ([Ljava/lang/Object;)V
    //   1693: aload #40
    //   1695: instanceof org/bukkit/entity/TNTPrimed
    //   1698: ifeq -> 1735
    //   1701: aload_0
    //   1702: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1705: iconst_0
    //   1706: anewarray java/lang/Object
    //   1709: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1712: iconst_0
    //   1713: iconst_1
    //   1714: anewarray java/lang/Object
    //   1717: dup_x1
    //   1718: swap
    //   1719: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1722: iconst_0
    //   1723: swap
    //   1724: aastore
    //   1725: invokevirtual Vulcan_Md : ([Ljava/lang/Object;)V
    //   1728: goto -> 1735
    //   1731: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1734: athrow
    //   1735: aload #38
    //   1737: ifnonnull -> 1538
    //   1740: aload_0
    //   1741: aload_0
    //   1742: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1745: lload #20
    //   1747: dup2_x1
    //   1748: pop2
    //   1749: iconst_2
    //   1750: anewarray java/lang/Object
    //   1753: dup_x1
    //   1754: swap
    //   1755: iconst_1
    //   1756: swap
    //   1757: aastore
    //   1758: dup_x2
    //   1759: dup_x2
    //   1760: pop
    //   1761: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1764: iconst_0
    //   1765: swap
    //   1766: aastore
    //   1767: invokestatic Vulcan_B : ([Ljava/lang/Object;)Z
    //   1770: putfield Vulcan_kB : Z
    //   1773: aload_0
    //   1774: aload_0
    //   1775: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1778: lload #10
    //   1780: dup2_x1
    //   1781: pop2
    //   1782: iconst_2
    //   1783: anewarray java/lang/Object
    //   1786: dup_x1
    //   1787: swap
    //   1788: iconst_1
    //   1789: swap
    //   1790: aastore
    //   1791: dup_x2
    //   1792: dup_x2
    //   1793: pop
    //   1794: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1797: iconst_0
    //   1798: swap
    //   1799: aastore
    //   1800: invokestatic Vulcan_s : ([Ljava/lang/Object;)Z
    //   1803: putfield Vulcan_bi : Z
    //   1806: aload_0
    //   1807: aload_0
    //   1808: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1811: lload #28
    //   1813: iconst_2
    //   1814: anewarray java/lang/Object
    //   1817: dup_x2
    //   1818: dup_x2
    //   1819: pop
    //   1820: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1823: iconst_1
    //   1824: swap
    //   1825: aastore
    //   1826: dup_x1
    //   1827: swap
    //   1828: iconst_0
    //   1829: swap
    //   1830: aastore
    //   1831: invokestatic Vulcan_E : ([Ljava/lang/Object;)Z
    //   1834: putfield Vulcan_o : Z
    //   1837: aload_0
    //   1838: aload_0
    //   1839: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1842: lload #18
    //   1844: dup2_x1
    //   1845: pop2
    //   1846: iconst_2
    //   1847: anewarray java/lang/Object
    //   1850: dup_x1
    //   1851: swap
    //   1852: iconst_1
    //   1853: swap
    //   1854: aastore
    //   1855: dup_x2
    //   1856: dup_x2
    //   1857: pop
    //   1858: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1861: iconst_0
    //   1862: swap
    //   1863: aastore
    //   1864: invokestatic Vulcan_a : ([Ljava/lang/Object;)Z
    //   1867: lload_2
    //   1868: lconst_0
    //   1869: lcmp
    //   1870: iflt -> 2186
    //   1873: putfield Vulcan_bB : Z
    //   1876: aload_0
    //   1877: aload #38
    //   1879: ifnull -> 2185
    //   1882: getfield Vulcan_L : Z
    //   1885: goto -> 1892
    //   1888: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1891: athrow
    //   1892: ifne -> 2177
    //   1895: aload_0
    //   1896: aload #38
    //   1898: ifnull -> 2185
    //   1901: goto -> 1908
    //   1904: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1907: athrow
    //   1908: lload_2
    //   1909: lconst_0
    //   1910: lcmp
    //   1911: ifle -> 2178
    //   1914: getfield Vulcan_SC : Z
    //   1917: ifne -> 2177
    //   1920: goto -> 1927
    //   1923: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1926: athrow
    //   1927: aload_0
    //   1928: aload #38
    //   1930: ifnull -> 2185
    //   1933: goto -> 1940
    //   1936: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1939: athrow
    //   1940: lload_2
    //   1941: lconst_0
    //   1942: lcmp
    //   1943: ifle -> 2178
    //   1946: getfield Vulcan_bb : Z
    //   1949: ifne -> 2177
    //   1952: goto -> 1959
    //   1955: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1958: athrow
    //   1959: aload_0
    //   1960: aload #38
    //   1962: ifnull -> 2185
    //   1965: goto -> 1972
    //   1968: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1971: athrow
    //   1972: lload_2
    //   1973: lconst_0
    //   1974: lcmp
    //   1975: iflt -> 2178
    //   1978: getfield Vulcan_Sg : Z
    //   1981: ifne -> 2177
    //   1984: goto -> 1991
    //   1987: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1990: athrow
    //   1991: aload_0
    //   1992: aload #38
    //   1994: ifnull -> 2185
    //   1997: goto -> 2004
    //   2000: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2003: athrow
    //   2004: lload_2
    //   2005: lconst_0
    //   2006: lcmp
    //   2007: iflt -> 2178
    //   2010: getfield Vulcan_kd : Z
    //   2013: ifne -> 2177
    //   2016: goto -> 2023
    //   2019: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2022: athrow
    //   2023: aload_0
    //   2024: aload #38
    //   2026: ifnull -> 2185
    //   2029: goto -> 2036
    //   2032: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2035: athrow
    //   2036: lload_2
    //   2037: lconst_0
    //   2038: lcmp
    //   2039: iflt -> 2178
    //   2042: getfield Vulcan_jR : Z
    //   2045: ifne -> 2177
    //   2048: goto -> 2055
    //   2051: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2054: athrow
    //   2055: aload_0
    //   2056: aload #38
    //   2058: ifnull -> 2185
    //   2061: goto -> 2068
    //   2064: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2067: athrow
    //   2068: lload_2
    //   2069: lconst_0
    //   2070: lcmp
    //   2071: ifle -> 2178
    //   2074: getfield Vulcan_kN : Z
    //   2077: ifne -> 2177
    //   2080: goto -> 2087
    //   2083: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2086: athrow
    //   2087: aload_0
    //   2088: aload #38
    //   2090: ifnull -> 2185
    //   2093: goto -> 2100
    //   2096: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2099: athrow
    //   2100: lload_2
    //   2101: lconst_0
    //   2102: lcmp
    //   2103: iflt -> 2178
    //   2106: getfield Vulcan_y : Z
    //   2109: ifne -> 2177
    //   2112: goto -> 2119
    //   2115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2118: athrow
    //   2119: aload_0
    //   2120: aload #38
    //   2122: ifnull -> 2185
    //   2125: goto -> 2132
    //   2128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2131: athrow
    //   2132: lload_2
    //   2133: lconst_0
    //   2134: lcmp
    //   2135: iflt -> 2178
    //   2138: getfield Vulcan_b6 : Z
    //   2141: ifne -> 2177
    //   2144: goto -> 2151
    //   2147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2150: athrow
    //   2151: aload_0
    //   2152: aload #38
    //   2154: ifnull -> 2185
    //   2157: goto -> 2164
    //   2160: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2163: athrow
    //   2164: getfield Vulcan_kP : Z
    //   2167: ifeq -> 2189
    //   2170: goto -> 2177
    //   2173: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2176: athrow
    //   2177: aload_0
    //   2178: goto -> 2185
    //   2181: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2184: athrow
    //   2185: iconst_0
    //   2186: putfield Vulcan_SU : I
    //   2189: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #415	-> 142
    //   #421	-> 364
    //   #422	-> 415
    //   #423	-> 454
    //   #424	-> 468
    //   #425	-> 491
    //   #427	-> 505
    //   #428	-> 528
    //   #429	-> 562
    //   #431	-> 596
    //   #432	-> 630
    //   #433	-> 653
    //   #435	-> 687
    //   #436	-> 721
    //   #437	-> 744
    //   #439	-> 767
    //   #440	-> 801
    //   #441	-> 824
    //   #443	-> 847
    //   #444	-> 881
    //   #445	-> 904
    //   #447	-> 927
    //   #448	-> 961
    //   #449	-> 995
    //   #451	-> 1009
    //   #452	-> 1032
    //   #453	-> 1055
    //   #455	-> 1089
    //   #456	-> 1103
    //   #457	-> 1126
    //   #459	-> 1160
    //   #460	-> 1194
    //   #461	-> 1217
    //   #462	-> 1251
    //   #463	-> 1274
    //   #464	-> 1297
    //   #465	-> 1320
    //   #466	-> 1343
    //   #467	-> 1366
    //   #468	-> 1389
    //   #469	-> 1412
    //   #470	-> 1435
    //   #471	-> 1458
    //   #472	-> 1481
    //   #473	-> 1504
    //   #475	-> 1527
    //   #476	-> 1566
    //   #478	-> 1600
    //   #479	-> 1693
    //   #480	-> 1735
    //   #482	-> 1740
    //   #483	-> 1773
    //   #484	-> 1806
    //   #485	-> 1837
    //   #488	-> 1876
    //   #490	-> 2177
    //   #492	-> 2189
    // Exception table:
    //   from	to	target	type
    //   364	376	379	java/lang/RuntimeException
    //   370	395	398	java/lang/RuntimeException
    //   383	408	411	java/lang/RuntimeException
    //   454	1514	1523	java/lang/RuntimeException
    //   1566	1616	1619	java/lang/RuntimeException
    //   1578	1626	1629	java/lang/RuntimeException
    //   1623	1649	1652	java/lang/RuntimeException
    //   1633	1659	1662	java/lang/RuntimeException
    //   1698	1728	1731	java/lang/RuntimeException
    //   1877	1885	1888	java/lang/RuntimeException
    //   1892	1901	1904	java/lang/RuntimeException
    //   1895	1920	1923	java/lang/RuntimeException
    //   1908	1933	1936	java/lang/RuntimeException
    //   1927	1952	1955	java/lang/RuntimeException
    //   1940	1965	1968	java/lang/RuntimeException
    //   1959	1984	1987	java/lang/RuntimeException
    //   1972	1997	2000	java/lang/RuntimeException
    //   1991	2016	2019	java/lang/RuntimeException
    //   2004	2029	2032	java/lang/RuntimeException
    //   2023	2048	2051	java/lang/RuntimeException
    //   2036	2061	2064	java/lang/RuntimeException
    //   2055	2080	2083	java/lang/RuntimeException
    //   2068	2093	2096	java/lang/RuntimeException
    //   2087	2112	2115	java/lang/RuntimeException
    //   2100	2125	2128	java/lang/RuntimeException
    //   2119	2144	2147	java/lang/RuntimeException
    //   2132	2157	2160	java/lang/RuntimeException
    //   2151	2170	2173	java/lang/RuntimeException
    //   2164	2178	2181	java/lang/RuntimeException
  }
  
  public void Vulcan_l(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientVehicleMove
    //   17: astore_2
    //   18: pop
    //   19: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: lload_3
    //   26: dup2
    //   27: ldc2_w 10540713803266
    //   30: lxor
    //   31: lstore #5
    //   33: dup2
    //   34: ldc2_w 74333966248839
    //   37: lxor
    //   38: lstore #7
    //   40: dup2
    //   41: ldc2_w 23911000829275
    //   44: lxor
    //   45: lstore #9
    //   47: dup2
    //   48: ldc2_w 79705575180857
    //   51: lxor
    //   52: lstore #11
    //   54: pop2
    //   55: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   58: aload_0
    //   59: dup
    //   60: getfield Vulcan_bs : I
    //   63: iconst_1
    //   64: iadd
    //   65: putfield Vulcan_bs : I
    //   68: aload_0
    //   69: aload_0
    //   70: getfield Vulcan_kY : Lorg/bukkit/entity/Entity;
    //   73: putfield Vulcan_kZ : Lorg/bukkit/entity/Entity;
    //   76: aload_0
    //   77: aload_0
    //   78: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   81: iconst_0
    //   82: anewarray java/lang/Object
    //   85: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   88: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   93: putfield Vulcan_kY : Lorg/bukkit/entity/Entity;
    //   96: astore #13
    //   98: aload_0
    //   99: aload #13
    //   101: ifnull -> 230
    //   104: getfield Vulcan_kZ : Lorg/bukkit/entity/Entity;
    //   107: aload_0
    //   108: getfield Vulcan_kY : Lorg/bukkit/entity/Entity;
    //   111: if_acmpeq -> 133
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: aload_0
    //   122: iconst_0
    //   123: putfield Vulcan_bs : I
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: aload_0
    //   134: aload_2
    //   135: invokevirtual getPosition : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   138: invokevirtual getX : ()D
    //   141: putfield Vulcan_l : D
    //   144: aload_0
    //   145: aload_2
    //   146: invokevirtual getPosition : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   149: invokevirtual getY : ()D
    //   152: putfield Vulcan_jo : D
    //   155: aload_0
    //   156: aload_2
    //   157: invokevirtual getPosition : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   160: invokevirtual getZ : ()D
    //   163: putfield Vulcan_u : D
    //   166: aload_0
    //   167: aload_0
    //   168: getfield Vulcan_c : D
    //   171: putfield Vulcan_kz : D
    //   174: aload_0
    //   175: aload_0
    //   176: getfield Vulcan_S4 : D
    //   179: putfield Vulcan_Q : D
    //   182: aload_0
    //   183: aload_0
    //   184: getfield Vulcan_kT : D
    //   187: putfield Vulcan_ks : D
    //   190: aload_0
    //   191: aload_0
    //   192: getfield Vulcan_l : D
    //   195: aload_0
    //   196: getfield Vulcan_n : D
    //   199: dsub
    //   200: putfield Vulcan_c : D
    //   203: aload_0
    //   204: aload_0
    //   205: getfield Vulcan_jo : D
    //   208: aload_0
    //   209: getfield Vulcan_Su : D
    //   212: dsub
    //   213: putfield Vulcan_S4 : D
    //   216: aload_0
    //   217: aload_0
    //   218: getfield Vulcan_u : D
    //   221: aload_0
    //   222: getfield Vulcan_bS : D
    //   225: dsub
    //   226: putfield Vulcan_kT : D
    //   229: aload_0
    //   230: lload_3
    //   231: lconst_0
    //   232: lcmp
    //   233: iflt -> 405
    //   236: aload #13
    //   238: ifnull -> 405
    //   241: aload_0
    //   242: getfield Vulcan_c : D
    //   245: aload_0
    //   246: getfield Vulcan_kT : D
    //   249: iconst_2
    //   250: anewarray java/lang/Object
    //   253: dup_x2
    //   254: dup_x2
    //   255: pop
    //   256: invokestatic valueOf : (D)Ljava/lang/Double;
    //   259: iconst_1
    //   260: swap
    //   261: aastore
    //   262: dup_x2
    //   263: dup_x2
    //   264: pop
    //   265: invokestatic valueOf : (D)Ljava/lang/Double;
    //   268: iconst_0
    //   269: swap
    //   270: aastore
    //   271: invokestatic Vulcan_e : ([Ljava/lang/Object;)D
    //   274: putfield Vulcan_jU : D
    //   277: iconst_0
    //   278: anewarray java/lang/Object
    //   281: invokestatic Vulcan_c : ([Ljava/lang/Object;)Z
    //   284: ifeq -> 404
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   293: athrow
    //   294: iconst_0
    //   295: anewarray java/lang/Object
    //   298: invokestatic Vulcan_y : ([Ljava/lang/Object;)Z
    //   301: ifeq -> 404
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   310: athrow
    //   311: aload_0
    //   312: aload_0
    //   313: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   316: aload_0
    //   317: getfield Vulcan_l : D
    //   320: invokestatic floor : (D)I
    //   323: aload_0
    //   324: getfield Vulcan_jo : D
    //   327: invokestatic floor : (D)I
    //   330: aload_0
    //   331: getfield Vulcan_u : D
    //   334: invokestatic floor : (D)I
    //   337: lload #11
    //   339: iconst_1
    //   340: bipush #6
    //   342: anewarray java/lang/Object
    //   345: dup_x1
    //   346: swap
    //   347: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   350: iconst_5
    //   351: swap
    //   352: aastore
    //   353: dup_x2
    //   354: dup_x2
    //   355: pop
    //   356: invokestatic valueOf : (J)Ljava/lang/Long;
    //   359: iconst_4
    //   360: swap
    //   361: aastore
    //   362: dup_x1
    //   363: swap
    //   364: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   367: iconst_3
    //   368: swap
    //   369: aastore
    //   370: dup_x1
    //   371: swap
    //   372: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   375: iconst_2
    //   376: swap
    //   377: aastore
    //   378: dup_x1
    //   379: swap
    //   380: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   383: iconst_1
    //   384: swap
    //   385: aastore
    //   386: dup_x1
    //   387: swap
    //   388: iconst_0
    //   389: swap
    //   390: aastore
    //   391: invokestatic Vulcan_B : ([Ljava/lang/Object;)Ljava/util/List;
    //   394: putfield Vulcan_km : Ljava/util/List;
    //   397: goto -> 404
    //   400: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   403: athrow
    //   404: aload_0
    //   405: getfield Vulcan_km : Ljava/util/List;
    //   408: aload #13
    //   410: ifnull -> 723
    //   413: ifnull -> 691
    //   416: goto -> 423
    //   419: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   422: athrow
    //   423: aload_0
    //   424: aload_0
    //   425: aload_0
    //   426: aload_0
    //   427: aload_0
    //   428: aload_0
    //   429: iconst_0
    //   430: dup_x1
    //   431: putfield Vulcan_H : Z
    //   434: dup_x1
    //   435: putfield Vulcan_Sc : Z
    //   438: dup_x1
    //   439: putfield Vulcan_bN : Z
    //   442: dup_x1
    //   443: putfield Vulcan_bM : Z
    //   446: dup_x1
    //   447: putfield Vulcan_r : Z
    //   450: putfield Vulcan_h : Z
    //   453: aload_0
    //   454: getfield Vulcan_km : Ljava/util/List;
    //   457: invokeinterface iterator : ()Ljava/util/Iterator;
    //   462: astore #14
    //   464: aload #14
    //   466: invokeinterface hasNext : ()Z
    //   471: ifeq -> 648
    //   474: aload #14
    //   476: invokeinterface next : ()Ljava/lang/Object;
    //   481: checkcast org/bukkit/Material
    //   484: astore #15
    //   486: aload_0
    //   487: dup
    //   488: getfield Vulcan_h : Z
    //   491: aload #15
    //   493: lload #7
    //   495: iconst_2
    //   496: anewarray java/lang/Object
    //   499: dup_x2
    //   500: dup_x2
    //   501: pop
    //   502: invokestatic valueOf : (J)Ljava/lang/Long;
    //   505: iconst_1
    //   506: swap
    //   507: aastore
    //   508: dup_x1
    //   509: swap
    //   510: iconst_0
    //   511: swap
    //   512: aastore
    //   513: invokestatic Vulcan_Z : ([Ljava/lang/Object;)Z
    //   516: ior
    //   517: putfield Vulcan_h : Z
    //   520: aload_0
    //   521: dup
    //   522: getfield Vulcan_r : Z
    //   525: aload #15
    //   527: invokestatic Vulcan_K0 : (Lorg/bukkit/Material;)Z
    //   530: ior
    //   531: putfield Vulcan_r : Z
    //   534: aload_0
    //   535: dup
    //   536: getfield Vulcan_bM : Z
    //   539: aload #15
    //   541: invokestatic Vulcan_KK : (Lorg/bukkit/Material;)Z
    //   544: ior
    //   545: putfield Vulcan_bM : Z
    //   548: aload_0
    //   549: dup
    //   550: getfield Vulcan_bN : Z
    //   553: aload #15
    //   555: invokestatic Vulcan_K_ : (Lorg/bukkit/Material;)Z
    //   558: ior
    //   559: putfield Vulcan_bN : Z
    //   562: aload_0
    //   563: dup
    //   564: getfield Vulcan_Sc : Z
    //   567: aload #15
    //   569: iconst_1
    //   570: anewarray java/lang/Object
    //   573: dup_x1
    //   574: swap
    //   575: iconst_0
    //   576: swap
    //   577: aastore
    //   578: invokestatic Vulcan_j : ([Ljava/lang/Object;)Z
    //   581: ior
    //   582: putfield Vulcan_Sc : Z
    //   585: aload_0
    //   586: dup
    //   587: getfield Vulcan_H : Z
    //   590: aload #15
    //   592: lload #9
    //   594: iconst_2
    //   595: anewarray java/lang/Object
    //   598: dup_x2
    //   599: dup_x2
    //   600: pop
    //   601: invokestatic valueOf : (J)Ljava/lang/Long;
    //   604: iconst_1
    //   605: swap
    //   606: aastore
    //   607: dup_x1
    //   608: swap
    //   609: iconst_0
    //   610: swap
    //   611: aastore
    //   612: invokestatic Vulcan_Kg : ([Ljava/lang/Object;)Z
    //   615: ior
    //   616: putfield Vulcan_H : Z
    //   619: lload_3
    //   620: lconst_0
    //   621: lcmp
    //   622: iflt -> 701
    //   625: aload #13
    //   627: ifnull -> 701
    //   630: aload #13
    //   632: ifnonnull -> 464
    //   635: lload_3
    //   636: lconst_0
    //   637: lcmp
    //   638: ifle -> 619
    //   641: goto -> 648
    //   644: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   647: athrow
    //   648: aload_0
    //   649: aload_0
    //   650: getfield Vulcan_km : Ljava/util/List;
    //   653: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   658: lload #5
    //   660: dup2_x1
    //   661: pop2
    //   662: iconst_3
    //   663: anewarray java/lang/Object
    //   666: dup_x1
    //   667: swap
    //   668: iconst_2
    //   669: swap
    //   670: aastore
    //   671: dup_x2
    //   672: dup_x2
    //   673: pop
    //   674: invokestatic valueOf : (J)Ljava/lang/Long;
    //   677: iconst_1
    //   678: swap
    //   679: aastore
    //   680: dup_x1
    //   681: swap
    //   682: iconst_0
    //   683: swap
    //   684: aastore
    //   685: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   688: putfield Vulcan_bx : Z
    //   691: aload_0
    //   692: iconst_0
    //   693: putfield Vulcan_k3 : I
    //   696: aload_0
    //   697: iconst_0
    //   698: putfield Vulcan_bQ : Z
    //   701: aload_0
    //   702: aload #13
    //   704: lload_3
    //   705: lconst_0
    //   706: lcmp
    //   707: iflt -> 848
    //   710: ifnull -> 846
    //   713: getfield Vulcan_SO : Ljava/util/List;
    //   716: goto -> 723
    //   719: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   722: athrow
    //   723: ifnull -> 839
    //   726: aload_0
    //   727: getfield Vulcan_SO : Ljava/util/List;
    //   730: invokeinterface iterator : ()Ljava/util/Iterator;
    //   735: astore #14
    //   737: aload #14
    //   739: invokeinterface hasNext : ()Z
    //   744: ifeq -> 839
    //   747: aload #14
    //   749: invokeinterface next : ()Ljava/lang/Object;
    //   754: checkcast org/bukkit/entity/Entity
    //   757: astore #15
    //   759: aload #15
    //   761: instanceof org/bukkit/entity/Boat
    //   764: lload_3
    //   765: lconst_0
    //   766: lcmp
    //   767: iflt -> 861
    //   770: aload #13
    //   772: ifnull -> 861
    //   775: aload #13
    //   777: ifnull -> 819
    //   780: goto -> 787
    //   783: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   786: athrow
    //   787: ifeq -> 814
    //   790: goto -> 797
    //   793: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   796: athrow
    //   797: aload_0
    //   798: dup
    //   799: getfield Vulcan_k3 : I
    //   802: iconst_1
    //   803: iadd
    //   804: putfield Vulcan_k3 : I
    //   807: goto -> 814
    //   810: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   813: athrow
    //   814: aload #15
    //   816: instanceof org/bukkit/entity/LivingEntity
    //   819: ifeq -> 834
    //   822: aload_0
    //   823: iconst_1
    //   824: putfield Vulcan_bQ : Z
    //   827: goto -> 834
    //   830: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   833: athrow
    //   834: aload #13
    //   836: ifnonnull -> 737
    //   839: lload_3
    //   840: lconst_0
    //   841: lcmp
    //   842: ifle -> 887
    //   845: aload_0
    //   846: aload #13
    //   848: ifnull -> 895
    //   851: getfield Vulcan_h : Z
    //   854: goto -> 861
    //   857: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   860: athrow
    //   861: ifeq -> 887
    //   864: aload_0
    //   865: iconst_0
    //   866: putfield Vulcan_SK : I
    //   869: lload_3
    //   870: lconst_0
    //   871: lcmp
    //   872: iflt -> 904
    //   875: aload #13
    //   877: ifnonnull -> 904
    //   880: goto -> 887
    //   883: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   886: athrow
    //   887: aload_0
    //   888: goto -> 895
    //   891: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   894: athrow
    //   895: dup
    //   896: getfield Vulcan_SK : I
    //   899: iconst_1
    //   900: iadd
    //   901: putfield Vulcan_SK : I
    //   904: aload_0
    //   905: aload #13
    //   907: ifnull -> 954
    //   910: getfield Vulcan_bM : Z
    //   913: ifeq -> 946
    //   916: goto -> 923
    //   919: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   922: athrow
    //   923: aload_0
    //   924: iconst_0
    //   925: putfield Vulcan_b0 : I
    //   928: lload_3
    //   929: lconst_0
    //   930: lcmp
    //   931: iflt -> 963
    //   934: aload #13
    //   936: ifnonnull -> 963
    //   939: goto -> 946
    //   942: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   945: athrow
    //   946: aload_0
    //   947: goto -> 954
    //   950: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   953: athrow
    //   954: dup
    //   955: getfield Vulcan_b0 : I
    //   958: iconst_1
    //   959: iadd
    //   960: putfield Vulcan_b0 : I
    //   963: aload_0
    //   964: aload #13
    //   966: ifnull -> 1013
    //   969: getfield Vulcan_H : Z
    //   972: ifeq -> 1005
    //   975: goto -> 982
    //   978: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   981: athrow
    //   982: aload_0
    //   983: iconst_0
    //   984: putfield Vulcan_Sf : I
    //   987: lload_3
    //   988: lconst_0
    //   989: lcmp
    //   990: ifle -> 1022
    //   993: aload #13
    //   995: ifnonnull -> 1022
    //   998: goto -> 1005
    //   1001: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1004: athrow
    //   1005: aload_0
    //   1006: goto -> 1013
    //   1009: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1012: athrow
    //   1013: dup
    //   1014: getfield Vulcan_Sf : I
    //   1017: iconst_1
    //   1018: iadd
    //   1019: putfield Vulcan_Sf : I
    //   1022: aload_0
    //   1023: aload #13
    //   1025: ifnull -> 1072
    //   1028: getfield Vulcan_r : Z
    //   1031: ifeq -> 1064
    //   1034: goto -> 1041
    //   1037: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1040: athrow
    //   1041: aload_0
    //   1042: iconst_0
    //   1043: putfield Vulcan_kL : I
    //   1046: lload_3
    //   1047: lconst_0
    //   1048: lcmp
    //   1049: ifle -> 1081
    //   1052: aload #13
    //   1054: ifnonnull -> 1081
    //   1057: goto -> 1064
    //   1060: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1063: athrow
    //   1064: aload_0
    //   1065: goto -> 1072
    //   1068: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1071: athrow
    //   1072: dup
    //   1073: getfield Vulcan_kL : I
    //   1076: iconst_1
    //   1077: iadd
    //   1078: putfield Vulcan_kL : I
    //   1081: aload_0
    //   1082: aload #13
    //   1084: ifnull -> 1131
    //   1087: getfield Vulcan_bN : Z
    //   1090: ifeq -> 1123
    //   1093: goto -> 1100
    //   1096: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1099: athrow
    //   1100: aload_0
    //   1101: iconst_0
    //   1102: putfield Vulcan_kH : I
    //   1105: lload_3
    //   1106: lconst_0
    //   1107: lcmp
    //   1108: ifle -> 1140
    //   1111: aload #13
    //   1113: ifnonnull -> 1140
    //   1116: goto -> 1123
    //   1119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1122: athrow
    //   1123: aload_0
    //   1124: goto -> 1131
    //   1127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1130: athrow
    //   1131: dup
    //   1132: getfield Vulcan_kH : I
    //   1135: iconst_1
    //   1136: iadd
    //   1137: putfield Vulcan_kH : I
    //   1140: aload_0
    //   1141: aload #13
    //   1143: ifnull -> 1190
    //   1146: getfield Vulcan_Sc : Z
    //   1149: ifeq -> 1182
    //   1152: goto -> 1159
    //   1155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1158: athrow
    //   1159: aload_0
    //   1160: iconst_0
    //   1161: putfield Vulcan_kg : I
    //   1164: lload_3
    //   1165: lconst_0
    //   1166: lcmp
    //   1167: iflt -> 1199
    //   1170: aload #13
    //   1172: ifnonnull -> 1199
    //   1175: goto -> 1182
    //   1178: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1181: athrow
    //   1182: aload_0
    //   1183: goto -> 1190
    //   1186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1189: athrow
    //   1190: dup
    //   1191: getfield Vulcan_kg : I
    //   1194: iconst_1
    //   1195: iadd
    //   1196: putfield Vulcan_kg : I
    //   1199: aload_0
    //   1200: aload #13
    //   1202: ifnull -> 1254
    //   1205: getfield Vulcan_bx : Z
    //   1208: ifeq -> 1246
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1217: athrow
    //   1218: aload_0
    //   1219: dup
    //   1220: getfield Vulcan_S : I
    //   1223: iconst_1
    //   1224: iadd
    //   1225: putfield Vulcan_S : I
    //   1228: lload_3
    //   1229: lconst_0
    //   1230: lcmp
    //   1231: iflt -> 1282
    //   1234: aload #13
    //   1236: ifnonnull -> 1258
    //   1239: goto -> 1246
    //   1242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1245: athrow
    //   1246: aload_0
    //   1247: goto -> 1254
    //   1250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1253: athrow
    //   1254: iconst_0
    //   1255: putfield Vulcan_S : I
    //   1258: aload_0
    //   1259: aload_0
    //   1260: getfield Vulcan_l : D
    //   1263: putfield Vulcan_n : D
    //   1266: aload_0
    //   1267: aload_0
    //   1268: getfield Vulcan_jo : D
    //   1271: putfield Vulcan_Su : D
    //   1274: aload_0
    //   1275: aload_0
    //   1276: getfield Vulcan_u : D
    //   1279: putfield Vulcan_bS : D
    //   1282: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #495	-> 58
    //   #497	-> 68
    //   #498	-> 76
    //   #500	-> 98
    //   #501	-> 121
    //   #504	-> 133
    //   #505	-> 144
    //   #506	-> 155
    //   #508	-> 166
    //   #509	-> 174
    //   #510	-> 182
    //   #512	-> 190
    //   #513	-> 203
    //   #514	-> 216
    //   #515	-> 229
    //   #517	-> 277
    //   #518	-> 311
    //   #521	-> 404
    //   #522	-> 423
    //   #524	-> 453
    //   #525	-> 486
    //   #526	-> 520
    //   #527	-> 534
    //   #528	-> 548
    //   #529	-> 562
    //   #530	-> 585
    //   #531	-> 619
    //   #533	-> 648
    //   #536	-> 691
    //   #537	-> 696
    //   #538	-> 701
    //   #539	-> 726
    //   #540	-> 759
    //   #541	-> 814
    //   #542	-> 834
    //   #545	-> 839
    //   #546	-> 887
    //   #548	-> 904
    //   #549	-> 946
    //   #551	-> 963
    //   #552	-> 1005
    //   #554	-> 1022
    //   #555	-> 1064
    //   #557	-> 1081
    //   #558	-> 1123
    //   #560	-> 1140
    //   #561	-> 1182
    //   #563	-> 1199
    //   #564	-> 1246
    //   #566	-> 1258
    //   #567	-> 1266
    //   #568	-> 1274
    //   #569	-> 1282
    // Exception table:
    //   from	to	target	type
    //   98	114	117	java/lang/RuntimeException
    //   104	126	129	java/lang/RuntimeException
    //   230	287	290	java/lang/RuntimeException
    //   241	304	307	java/lang/RuntimeException
    //   294	397	400	java/lang/RuntimeException
    //   405	416	419	java/lang/RuntimeException
    //   486	635	644	java/lang/RuntimeException
    //   701	716	719	java/lang/RuntimeException
    //   759	780	783	java/lang/RuntimeException
    //   775	790	793	java/lang/RuntimeException
    //   787	807	810	java/lang/RuntimeException
    //   819	827	830	java/lang/RuntimeException
    //   846	854	857	java/lang/RuntimeException
    //   861	880	883	java/lang/RuntimeException
    //   864	888	891	java/lang/RuntimeException
    //   904	916	919	java/lang/RuntimeException
    //   910	939	942	java/lang/RuntimeException
    //   923	947	950	java/lang/RuntimeException
    //   963	975	978	java/lang/RuntimeException
    //   969	998	1001	java/lang/RuntimeException
    //   982	1006	1009	java/lang/RuntimeException
    //   1022	1034	1037	java/lang/RuntimeException
    //   1028	1057	1060	java/lang/RuntimeException
    //   1041	1065	1068	java/lang/RuntimeException
    //   1081	1093	1096	java/lang/RuntimeException
    //   1087	1116	1119	java/lang/RuntimeException
    //   1100	1124	1127	java/lang/RuntimeException
    //   1140	1152	1155	java/lang/RuntimeException
    //   1146	1175	1178	java/lang/RuntimeException
    //   1159	1183	1186	java/lang/RuntimeException
    //   1199	1211	1214	java/lang/RuntimeException
    //   1205	1239	1242	java/lang/RuntimeException
    //   1218	1247	1250	java/lang/RuntimeException
  }
  
  public void Vulcan_tI(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: aload_0
    //   19: dup
    //   20: getfield Vulcan_bY : I
    //   23: iconst_1
    //   24: iadd
    //   25: putfield Vulcan_bY : I
    //   28: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   31: aload_0
    //   32: dup
    //   33: getfield Vulcan_bd : I
    //   36: iconst_1
    //   37: iadd
    //   38: putfield Vulcan_bd : I
    //   41: aload_0
    //   42: dup
    //   43: getfield Vulcan_k_ : I
    //   46: iconst_1
    //   47: iadd
    //   48: putfield Vulcan_k_ : I
    //   51: aload_0
    //   52: dup
    //   53: getfield Vulcan_S6 : I
    //   56: iconst_1
    //   57: iadd
    //   58: putfield Vulcan_S6 : I
    //   61: aload_0
    //   62: dup
    //   63: getfield Vulcan_bR : I
    //   66: iconst_1
    //   67: iadd
    //   68: putfield Vulcan_bR : I
    //   71: astore #4
    //   73: aload_0
    //   74: aload #4
    //   76: ifnull -> 128
    //   79: getfield Vulcan_bF : Z
    //   82: ifeq -> 120
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: aload_0
    //   93: dup
    //   94: getfield Vulcan_bI : I
    //   97: iconst_1
    //   98: iadd
    //   99: putfield Vulcan_bI : I
    //   102: lload_2
    //   103: lconst_0
    //   104: lcmp
    //   105: ifle -> 132
    //   108: aload #4
    //   110: ifnonnull -> 132
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: aload_0
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   127: athrow
    //   128: iconst_0
    //   129: putfield Vulcan_bI : I
    //   132: aload_0
    //   133: aload #4
    //   135: ifnull -> 181
    //   138: getfield Vulcan_bF : Z
    //   141: ifne -> 173
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: aload_0
    //   152: dup
    //   153: getfield Vulcan_R : I
    //   156: iconst_1
    //   157: iadd
    //   158: putfield Vulcan_R : I
    //   161: aload #4
    //   163: ifnonnull -> 185
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   172: athrow
    //   173: aload_0
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: iconst_0
    //   182: putfield Vulcan_R : I
    //   185: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #572	-> 18
    //   #573	-> 31
    //   #574	-> 41
    //   #575	-> 51
    //   #576	-> 61
    //   #578	-> 73
    //   #579	-> 120
    //   #581	-> 132
    //   #582	-> 173
    //   #583	-> 185
    // Exception table:
    //   from	to	target	type
    //   73	85	88	java/lang/RuntimeException
    //   79	113	116	java/lang/RuntimeException
    //   92	121	124	java/lang/RuntimeException
    //   132	144	147	java/lang/RuntimeException
    //   138	166	169	java/lang/RuntimeException
    //   151	174	177	java/lang/RuntimeException
  }
  
  public void Vulcan_tq(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 98298527232321
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 18009265870800
    //   30: lxor
    //   31: lstore #6
    //   33: dup2
    //   34: ldc2_w 72217417777358
    //   37: lxor
    //   38: lstore #8
    //   40: dup2
    //   41: ldc2_w 10909456479646
    //   44: lxor
    //   45: lstore #10
    //   47: dup2
    //   48: ldc2_w 55300315014153
    //   51: lxor
    //   52: lstore #12
    //   54: dup2
    //   55: ldc2_w 132132546503958
    //   58: lxor
    //   59: lstore #14
    //   61: dup2
    //   62: ldc2_w 132083428541956
    //   65: lxor
    //   66: lstore #16
    //   68: pop2
    //   69: aload_0
    //   70: dup
    //   71: getfield Vulcan_jY : I
    //   74: iconst_1
    //   75: iadd
    //   76: putfield Vulcan_jY : I
    //   79: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   82: aload_0
    //   83: dup
    //   84: getfield Vulcan_kp : I
    //   87: iconst_1
    //   88: iadd
    //   89: putfield Vulcan_kp : I
    //   92: astore #18
    //   94: aload_0
    //   95: aload #18
    //   97: ifnull -> 149
    //   100: getfield Vulcan_kk : Z
    //   103: ifeq -> 141
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: aload_0
    //   114: dup
    //   115: getfield Vulcan_SU : I
    //   118: iconst_1
    //   119: iadd
    //   120: putfield Vulcan_SU : I
    //   123: lload_2
    //   124: lconst_0
    //   125: lcmp
    //   126: ifle -> 153
    //   129: aload #18
    //   131: ifnonnull -> 153
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: aload_0
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: iconst_0
    //   150: putfield Vulcan_SU : I
    //   153: aload_0
    //   154: aload #18
    //   156: ifnull -> 208
    //   159: getfield Vulcan_k2 : Z
    //   162: ifeq -> 200
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   171: athrow
    //   172: aload_0
    //   173: dup
    //   174: getfield Vulcan_kX : I
    //   177: iconst_1
    //   178: iadd
    //   179: putfield Vulcan_kX : I
    //   182: aload #18
    //   184: lload_2
    //   185: lconst_0
    //   186: lcmp
    //   187: ifle -> 222
    //   190: ifnonnull -> 212
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   199: athrow
    //   200: aload_0
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   207: athrow
    //   208: iconst_0
    //   209: putfield Vulcan_kX : I
    //   212: lload_2
    //   213: lconst_0
    //   214: lcmp
    //   215: ifle -> 344
    //   218: iconst_0
    //   219: anewarray java/lang/Object
    //   222: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   225: ifeq -> 344
    //   228: aload_0
    //   229: aload_0
    //   230: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   233: lload_2
    //   234: lconst_0
    //   235: lcmp
    //   236: iflt -> 272
    //   239: aload #18
    //   241: ifnull -> 272
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: ifnull -> 329
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   260: athrow
    //   261: aload_0
    //   262: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   265: goto -> 272
    //   268: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   271: athrow
    //   272: invokevirtual isSolid : ()Z
    //   275: aload #18
    //   277: lload_2
    //   278: lconst_0
    //   279: lcmp
    //   280: iflt -> 312
    //   283: ifnull -> 310
    //   286: ifeq -> 329
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   295: athrow
    //   296: aload_0
    //   297: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   300: invokestatic Vulcan_K0 : (Lorg/bukkit/Material;)Z
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   309: athrow
    //   310: aload #18
    //   312: ifnull -> 326
    //   315: ifne -> 329
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   324: athrow
    //   325: iconst_1
    //   326: goto -> 330
    //   329: iconst_0
    //   330: putfield Vulcan_bc : Z
    //   333: lload_2
    //   334: lconst_0
    //   335: lcmp
    //   336: iflt -> 449
    //   339: aload #18
    //   341: ifnonnull -> 449
    //   344: aload_0
    //   345: aload_0
    //   346: getfield Vulcan_Se : Lorg/bukkit/Material;
    //   349: lload_2
    //   350: lconst_0
    //   351: lcmp
    //   352: ifle -> 388
    //   355: aload #18
    //   357: ifnull -> 388
    //   360: goto -> 367
    //   363: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   366: athrow
    //   367: ifnull -> 445
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: aload_0
    //   378: getfield Vulcan_Se : Lorg/bukkit/Material;
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   387: athrow
    //   388: invokevirtual isSolid : ()Z
    //   391: aload #18
    //   393: lload_2
    //   394: lconst_0
    //   395: lcmp
    //   396: iflt -> 428
    //   399: ifnull -> 426
    //   402: ifeq -> 445
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   411: athrow
    //   412: aload_0
    //   413: getfield Vulcan_Se : Lorg/bukkit/Material;
    //   416: invokestatic Vulcan_K0 : (Lorg/bukkit/Material;)Z
    //   419: goto -> 426
    //   422: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   425: athrow
    //   426: aload #18
    //   428: ifnull -> 442
    //   431: ifne -> 445
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   440: athrow
    //   441: iconst_1
    //   442: goto -> 446
    //   445: iconst_0
    //   446: putfield Vulcan_bc : Z
    //   449: aload_0
    //   450: aload #18
    //   452: ifnull -> 504
    //   455: getfield Vulcan_bc : Z
    //   458: ifne -> 496
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   467: athrow
    //   468: aload_0
    //   469: dup
    //   470: getfield Vulcan_ba : I
    //   473: iconst_1
    //   474: iadd
    //   475: putfield Vulcan_ba : I
    //   478: lload_2
    //   479: lconst_0
    //   480: lcmp
    //   481: iflt -> 508
    //   484: aload #18
    //   486: ifnonnull -> 508
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   495: athrow
    //   496: aload_0
    //   497: goto -> 504
    //   500: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   503: athrow
    //   504: iconst_0
    //   505: putfield Vulcan_ba : I
    //   508: aload_0
    //   509: aload #18
    //   511: ifnull -> 562
    //   514: getfield Vulcan_SZ : F
    //   517: ldc_w 0.11
    //   520: fcmpl
    //   521: ifle -> 554
    //   524: goto -> 531
    //   527: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   530: athrow
    //   531: aload_0
    //   532: iconst_0
    //   533: putfield Vulcan_bn : I
    //   536: lload_2
    //   537: lconst_0
    //   538: lcmp
    //   539: ifle -> 571
    //   542: aload #18
    //   544: ifnonnull -> 571
    //   547: goto -> 554
    //   550: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   553: athrow
    //   554: aload_0
    //   555: goto -> 562
    //   558: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   561: athrow
    //   562: dup
    //   563: getfield Vulcan_bn : I
    //   566: iconst_1
    //   567: iadd
    //   568: putfield Vulcan_bn : I
    //   571: aload_0
    //   572: aload #18
    //   574: ifnull -> 1006
    //   577: getfield Vulcan_SV : Z
    //   580: ifne -> 998
    //   583: goto -> 590
    //   586: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   589: athrow
    //   590: aload_0
    //   591: getfield Vulcan_Se : Lorg/bukkit/Material;
    //   594: aload #18
    //   596: lload_2
    //   597: lconst_0
    //   598: lcmp
    //   599: ifle -> 676
    //   602: ifnull -> 674
    //   605: goto -> 612
    //   608: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   611: athrow
    //   612: lload_2
    //   613: lconst_0
    //   614: lcmp
    //   615: iflt -> 667
    //   618: ifnull -> 663
    //   621: goto -> 628
    //   624: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   627: athrow
    //   628: aload_0
    //   629: aload #18
    //   631: ifnull -> 1006
    //   634: goto -> 641
    //   637: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   640: athrow
    //   641: lload_2
    //   642: lconst_0
    //   643: lcmp
    //   644: ifle -> 999
    //   647: getfield Vulcan_Se : Lorg/bukkit/Material;
    //   650: invokestatic Vulcan_K_ : (Lorg/bukkit/Material;)Z
    //   653: ifne -> 998
    //   656: goto -> 663
    //   659: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   662: athrow
    //   663: aload_0
    //   664: getfield Vulcan_k : Lorg/bukkit/Material;
    //   667: goto -> 674
    //   670: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   673: athrow
    //   674: aload #18
    //   676: lload_2
    //   677: lconst_0
    //   678: lcmp
    //   679: ifle -> 743
    //   682: ifnull -> 741
    //   685: ifnull -> 730
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   694: athrow
    //   695: aload_0
    //   696: aload #18
    //   698: ifnull -> 1006
    //   701: goto -> 708
    //   704: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   707: athrow
    //   708: lload_2
    //   709: lconst_0
    //   710: lcmp
    //   711: ifle -> 999
    //   714: getfield Vulcan_k : Lorg/bukkit/Material;
    //   717: invokestatic Vulcan_K_ : (Lorg/bukkit/Material;)Z
    //   720: ifne -> 998
    //   723: goto -> 730
    //   726: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   729: athrow
    //   730: aload_0
    //   731: getfield Vulcan_be : Lorg/bukkit/Material;
    //   734: goto -> 741
    //   737: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   740: athrow
    //   741: aload #18
    //   743: lload_2
    //   744: lconst_0
    //   745: lcmp
    //   746: ifle -> 810
    //   749: ifnull -> 808
    //   752: ifnull -> 797
    //   755: goto -> 762
    //   758: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   761: athrow
    //   762: aload_0
    //   763: aload #18
    //   765: ifnull -> 1006
    //   768: goto -> 775
    //   771: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   774: athrow
    //   775: lload_2
    //   776: lconst_0
    //   777: lcmp
    //   778: iflt -> 999
    //   781: getfield Vulcan_be : Lorg/bukkit/Material;
    //   784: invokestatic Vulcan_K_ : (Lorg/bukkit/Material;)Z
    //   787: ifne -> 998
    //   790: goto -> 797
    //   793: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   796: athrow
    //   797: aload_0
    //   798: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   801: goto -> 808
    //   804: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   807: athrow
    //   808: aload #18
    //   810: lload_2
    //   811: lconst_0
    //   812: lcmp
    //   813: iflt -> 883
    //   816: ifnull -> 875
    //   819: ifnull -> 864
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   828: athrow
    //   829: aload_0
    //   830: aload #18
    //   832: ifnull -> 1006
    //   835: goto -> 842
    //   838: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   841: athrow
    //   842: lload_2
    //   843: lconst_0
    //   844: lcmp
    //   845: ifle -> 999
    //   848: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   851: invokestatic Vulcan_K_ : (Lorg/bukkit/Material;)Z
    //   854: ifne -> 998
    //   857: goto -> 864
    //   860: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   863: athrow
    //   864: aload_0
    //   865: getfield Vulcan_Sy : Lorg/bukkit/Material;
    //   868: goto -> 875
    //   871: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   874: athrow
    //   875: lload_2
    //   876: lconst_0
    //   877: lcmp
    //   878: iflt -> 960
    //   881: aload #18
    //   883: ifnull -> 960
    //   886: ifnull -> 937
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   895: athrow
    //   896: aload_0
    //   897: lload_2
    //   898: lconst_0
    //   899: lcmp
    //   900: iflt -> 1006
    //   903: aload #18
    //   905: ifnull -> 1006
    //   908: goto -> 915
    //   911: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   914: athrow
    //   915: lload_2
    //   916: lconst_0
    //   917: lcmp
    //   918: iflt -> 999
    //   921: getfield Vulcan_Sy : Lorg/bukkit/Material;
    //   924: invokestatic Vulcan_K_ : (Lorg/bukkit/Material;)Z
    //   927: ifne -> 998
    //   930: goto -> 937
    //   933: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   936: athrow
    //   937: aload_0
    //   938: aload #18
    //   940: ifnull -> 1029
    //   943: goto -> 950
    //   946: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   949: athrow
    //   950: getfield Vulcan_SG : Lorg/bukkit/Material;
    //   953: goto -> 960
    //   956: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   959: athrow
    //   960: ifnull -> 1021
    //   963: aload_0
    //   964: aload #18
    //   966: ifnull -> 1029
    //   969: goto -> 976
    //   972: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   975: athrow
    //   976: lload_2
    //   977: lconst_0
    //   978: lcmp
    //   979: iflt -> 1022
    //   982: getfield Vulcan_SG : Lorg/bukkit/Material;
    //   985: invokestatic Vulcan_K_ : (Lorg/bukkit/Material;)Z
    //   988: ifeq -> 1021
    //   991: goto -> 998
    //   994: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   997: athrow
    //   998: aload_0
    //   999: goto -> 1006
    //   1002: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1005: athrow
    //   1006: iconst_0
    //   1007: putfield Vulcan_je : I
    //   1010: lload_2
    //   1011: lconst_0
    //   1012: lcmp
    //   1013: ifle -> 1054
    //   1016: aload #18
    //   1018: ifnonnull -> 1038
    //   1021: aload_0
    //   1022: goto -> 1029
    //   1025: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1028: athrow
    //   1029: dup
    //   1030: getfield Vulcan_je : I
    //   1033: iconst_1
    //   1034: iadd
    //   1035: putfield Vulcan_je : I
    //   1038: aload_0
    //   1039: dup
    //   1040: getfield Vulcan_bH : I
    //   1043: iconst_1
    //   1044: iadd
    //   1045: lload_2
    //   1046: lconst_0
    //   1047: lcmp
    //   1048: ifle -> 1110
    //   1051: putfield Vulcan_bH : I
    //   1054: aload_0
    //   1055: aload #18
    //   1057: ifnull -> 1104
    //   1060: getfield Vulcan_SH : Z
    //   1063: ifeq -> 1096
    //   1066: goto -> 1073
    //   1069: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1072: athrow
    //   1073: aload_0
    //   1074: iconst_0
    //   1075: putfield Vulcan_bG : I
    //   1078: lload_2
    //   1079: lconst_0
    //   1080: lcmp
    //   1081: iflt -> 1113
    //   1084: aload #18
    //   1086: ifnonnull -> 1113
    //   1089: goto -> 1096
    //   1092: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1095: athrow
    //   1096: aload_0
    //   1097: goto -> 1104
    //   1100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1103: athrow
    //   1104: dup
    //   1105: getfield Vulcan_bG : I
    //   1108: iconst_1
    //   1109: iadd
    //   1110: putfield Vulcan_bG : I
    //   1113: aload_0
    //   1114: aload #18
    //   1116: ifnull -> 1163
    //   1119: getfield Vulcan_L : Z
    //   1122: ifeq -> 1155
    //   1125: goto -> 1132
    //   1128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1131: athrow
    //   1132: aload_0
    //   1133: iconst_0
    //   1134: putfield Vulcan_jb : I
    //   1137: lload_2
    //   1138: lconst_0
    //   1139: lcmp
    //   1140: ifle -> 1172
    //   1143: aload #18
    //   1145: ifnonnull -> 1172
    //   1148: goto -> 1155
    //   1151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1154: athrow
    //   1155: aload_0
    //   1156: goto -> 1163
    //   1159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1162: athrow
    //   1163: dup
    //   1164: getfield Vulcan_jb : I
    //   1167: iconst_1
    //   1168: iadd
    //   1169: putfield Vulcan_jb : I
    //   1172: aload_0
    //   1173: aload #18
    //   1175: ifnull -> 1222
    //   1178: getfield Vulcan_SC : Z
    //   1181: ifeq -> 1214
    //   1184: goto -> 1191
    //   1187: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1190: athrow
    //   1191: aload_0
    //   1192: iconst_0
    //   1193: putfield Vulcan_ke : I
    //   1196: lload_2
    //   1197: lconst_0
    //   1198: lcmp
    //   1199: ifle -> 1231
    //   1202: aload #18
    //   1204: ifnonnull -> 1231
    //   1207: goto -> 1214
    //   1210: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1213: athrow
    //   1214: aload_0
    //   1215: goto -> 1222
    //   1218: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1221: athrow
    //   1222: dup
    //   1223: getfield Vulcan_ke : I
    //   1226: iconst_1
    //   1227: iadd
    //   1228: putfield Vulcan_ke : I
    //   1231: aload_0
    //   1232: lload_2
    //   1233: lconst_0
    //   1234: lcmp
    //   1235: ifle -> 1324
    //   1238: aload #18
    //   1240: ifnull -> 1324
    //   1243: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1246: iconst_0
    //   1247: anewarray java/lang/Object
    //   1250: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1253: iconst_0
    //   1254: anewarray java/lang/Object
    //   1257: invokevirtual Vulcan_W : ([Ljava/lang/Object;)Z
    //   1260: ifne -> 1316
    //   1263: goto -> 1270
    //   1266: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1269: athrow
    //   1270: aload_0
    //   1271: aload #18
    //   1273: ifnull -> 1347
    //   1276: goto -> 1283
    //   1279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1282: athrow
    //   1283: lload_2
    //   1284: lconst_0
    //   1285: lcmp
    //   1286: ifle -> 1340
    //   1289: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1292: iconst_0
    //   1293: anewarray java/lang/Object
    //   1296: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1299: iconst_0
    //   1300: anewarray java/lang/Object
    //   1303: invokevirtual Vulcan_w : ([Ljava/lang/Object;)Z
    //   1306: ifeq -> 1339
    //   1309: goto -> 1316
    //   1312: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1315: athrow
    //   1316: aload_0
    //   1317: goto -> 1324
    //   1320: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1323: athrow
    //   1324: iconst_0
    //   1325: putfield Vulcan_bj : I
    //   1328: aload #18
    //   1330: lload_2
    //   1331: lconst_0
    //   1332: lcmp
    //   1333: ifle -> 1360
    //   1336: ifnonnull -> 1356
    //   1339: aload_0
    //   1340: goto -> 1347
    //   1343: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1346: athrow
    //   1347: dup
    //   1348: getfield Vulcan_bj : I
    //   1351: iconst_1
    //   1352: iadd
    //   1353: putfield Vulcan_bj : I
    //   1356: iconst_0
    //   1357: anewarray java/lang/Object
    //   1360: invokestatic Vulcan_S : ([Ljava/lang/Object;)Z
    //   1363: ifeq -> 1436
    //   1366: aload_0
    //   1367: aload #18
    //   1369: ifnull -> 1444
    //   1372: goto -> 1379
    //   1375: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1378: athrow
    //   1379: lload_2
    //   1380: lconst_0
    //   1381: lcmp
    //   1382: ifle -> 1437
    //   1385: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1388: iconst_0
    //   1389: anewarray java/lang/Object
    //   1392: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1395: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   1400: getstatic org/bukkit/GameMode.SPECTATOR : Lorg/bukkit/GameMode;
    //   1403: if_acmpne -> 1436
    //   1406: goto -> 1413
    //   1409: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1412: athrow
    //   1413: aload_0
    //   1414: iconst_0
    //   1415: putfield Vulcan_kn : I
    //   1418: lload_2
    //   1419: lconst_0
    //   1420: lcmp
    //   1421: iflt -> 1453
    //   1424: aload #18
    //   1426: ifnonnull -> 1453
    //   1429: goto -> 1436
    //   1432: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1435: athrow
    //   1436: aload_0
    //   1437: goto -> 1444
    //   1440: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1443: athrow
    //   1444: dup
    //   1445: getfield Vulcan_kn : I
    //   1448: iconst_1
    //   1449: iadd
    //   1450: putfield Vulcan_kn : I
    //   1453: aload_0
    //   1454: aload #18
    //   1456: ifnull -> 1503
    //   1459: getfield Vulcan_j1 : Z
    //   1462: ifeq -> 1495
    //   1465: goto -> 1472
    //   1468: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1471: athrow
    //   1472: aload_0
    //   1473: iconst_0
    //   1474: putfield Vulcan_bv : I
    //   1477: lload_2
    //   1478: lconst_0
    //   1479: lcmp
    //   1480: ifle -> 1512
    //   1483: aload #18
    //   1485: ifnonnull -> 1512
    //   1488: goto -> 1495
    //   1491: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1494: athrow
    //   1495: aload_0
    //   1496: goto -> 1503
    //   1499: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1502: athrow
    //   1503: dup
    //   1504: getfield Vulcan_bv : I
    //   1507: iconst_1
    //   1508: iadd
    //   1509: putfield Vulcan_bv : I
    //   1512: aload_0
    //   1513: aload #18
    //   1515: ifnull -> 1562
    //   1518: getfield Vulcan_bO : Z
    //   1521: ifeq -> 1554
    //   1524: goto -> 1531
    //   1527: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1530: athrow
    //   1531: aload_0
    //   1532: iconst_0
    //   1533: putfield Vulcan_b3 : I
    //   1536: lload_2
    //   1537: lconst_0
    //   1538: lcmp
    //   1539: ifle -> 1571
    //   1542: aload #18
    //   1544: ifnonnull -> 1571
    //   1547: goto -> 1554
    //   1550: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1553: athrow
    //   1554: aload_0
    //   1555: goto -> 1562
    //   1558: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1561: athrow
    //   1562: dup
    //   1563: getfield Vulcan_b3 : I
    //   1566: iconst_1
    //   1567: iadd
    //   1568: putfield Vulcan_b3 : I
    //   1571: aload_0
    //   1572: aload #18
    //   1574: ifnull -> 1621
    //   1577: getfield Vulcan_g : Z
    //   1580: ifeq -> 1613
    //   1583: goto -> 1590
    //   1586: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1589: athrow
    //   1590: aload_0
    //   1591: iconst_0
    //   1592: putfield Vulcan_U : I
    //   1595: lload_2
    //   1596: lconst_0
    //   1597: lcmp
    //   1598: ifle -> 1630
    //   1601: aload #18
    //   1603: ifnonnull -> 1630
    //   1606: goto -> 1613
    //   1609: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1612: athrow
    //   1613: aload_0
    //   1614: goto -> 1621
    //   1617: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1620: athrow
    //   1621: dup
    //   1622: getfield Vulcan_U : I
    //   1625: iconst_1
    //   1626: iadd
    //   1627: putfield Vulcan_U : I
    //   1630: aload_0
    //   1631: aload #18
    //   1633: ifnull -> 1680
    //   1636: getfield Vulcan_SL : Z
    //   1639: ifeq -> 1672
    //   1642: goto -> 1649
    //   1645: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1648: athrow
    //   1649: aload_0
    //   1650: iconst_0
    //   1651: putfield Vulcan_ky : I
    //   1654: lload_2
    //   1655: lconst_0
    //   1656: lcmp
    //   1657: iflt -> 1689
    //   1660: aload #18
    //   1662: ifnonnull -> 1689
    //   1665: goto -> 1672
    //   1668: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1671: athrow
    //   1672: aload_0
    //   1673: goto -> 1680
    //   1676: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1679: athrow
    //   1680: dup
    //   1681: getfield Vulcan_ky : I
    //   1684: iconst_1
    //   1685: iadd
    //   1686: putfield Vulcan_ky : I
    //   1689: aload_0
    //   1690: aload #18
    //   1692: ifnull -> 1739
    //   1695: getfield Vulcan_kD : Z
    //   1698: ifeq -> 1731
    //   1701: goto -> 1708
    //   1704: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1707: athrow
    //   1708: aload_0
    //   1709: iconst_0
    //   1710: putfield Vulcan_w : I
    //   1713: lload_2
    //   1714: lconst_0
    //   1715: lcmp
    //   1716: ifle -> 1748
    //   1719: aload #18
    //   1721: ifnonnull -> 1748
    //   1724: goto -> 1731
    //   1727: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1730: athrow
    //   1731: aload_0
    //   1732: goto -> 1739
    //   1735: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1738: athrow
    //   1739: dup
    //   1740: getfield Vulcan_w : I
    //   1743: iconst_1
    //   1744: iadd
    //   1745: putfield Vulcan_w : I
    //   1748: aload_0
    //   1749: lload_2
    //   1750: lconst_0
    //   1751: lcmp
    //   1752: ifle -> 1841
    //   1755: aload #18
    //   1757: ifnull -> 1841
    //   1760: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1763: iconst_0
    //   1764: anewarray java/lang/Object
    //   1767: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1770: iconst_0
    //   1771: anewarray java/lang/Object
    //   1774: invokevirtual Vulcan_n : ([Ljava/lang/Object;)Z
    //   1777: ifne -> 1833
    //   1780: goto -> 1787
    //   1783: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1786: athrow
    //   1787: aload_0
    //   1788: aload #18
    //   1790: ifnull -> 1864
    //   1793: goto -> 1800
    //   1796: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1799: athrow
    //   1800: lload_2
    //   1801: lconst_0
    //   1802: lcmp
    //   1803: iflt -> 1857
    //   1806: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1809: iconst_0
    //   1810: anewarray java/lang/Object
    //   1813: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   1816: iconst_0
    //   1817: anewarray java/lang/Object
    //   1820: invokevirtual Vulcan_J : ([Ljava/lang/Object;)Z
    //   1823: ifeq -> 1856
    //   1826: goto -> 1833
    //   1829: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1832: athrow
    //   1833: aload_0
    //   1834: goto -> 1841
    //   1837: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1840: athrow
    //   1841: iconst_0
    //   1842: putfield Vulcan_ki : I
    //   1845: lload_2
    //   1846: lconst_0
    //   1847: lcmp
    //   1848: ifle -> 1873
    //   1851: aload #18
    //   1853: ifnonnull -> 1873
    //   1856: aload_0
    //   1857: goto -> 1864
    //   1860: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1863: athrow
    //   1864: dup
    //   1865: getfield Vulcan_ki : I
    //   1868: iconst_1
    //   1869: iadd
    //   1870: putfield Vulcan_ki : I
    //   1873: aload_0
    //   1874: aload #18
    //   1876: ifnull -> 1923
    //   1879: getfield Vulcan_k0 : Z
    //   1882: ifeq -> 1915
    //   1885: goto -> 1892
    //   1888: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1891: athrow
    //   1892: aload_0
    //   1893: iconst_0
    //   1894: putfield Vulcan_kr : I
    //   1897: lload_2
    //   1898: lconst_0
    //   1899: lcmp
    //   1900: iflt -> 1932
    //   1903: aload #18
    //   1905: ifnonnull -> 1932
    //   1908: goto -> 1915
    //   1911: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1914: athrow
    //   1915: aload_0
    //   1916: goto -> 1923
    //   1919: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1922: athrow
    //   1923: dup
    //   1924: getfield Vulcan_kr : I
    //   1927: iconst_1
    //   1928: iadd
    //   1929: putfield Vulcan_kr : I
    //   1932: aload_0
    //   1933: aload #18
    //   1935: ifnull -> 1982
    //   1938: getfield Vulcan_b7 : Z
    //   1941: ifeq -> 1974
    //   1944: goto -> 1951
    //   1947: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1950: athrow
    //   1951: aload_0
    //   1952: iconst_0
    //   1953: putfield Vulcan_k6 : I
    //   1956: lload_2
    //   1957: lconst_0
    //   1958: lcmp
    //   1959: ifle -> 1991
    //   1962: aload #18
    //   1964: ifnonnull -> 1991
    //   1967: goto -> 1974
    //   1970: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1973: athrow
    //   1974: aload_0
    //   1975: goto -> 1982
    //   1978: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1981: athrow
    //   1982: dup
    //   1983: getfield Vulcan_k6 : I
    //   1986: iconst_1
    //   1987: iadd
    //   1988: putfield Vulcan_k6 : I
    //   1991: aload_0
    //   1992: aload #18
    //   1994: ifnull -> 2041
    //   1997: getfield Vulcan_ku : Z
    //   2000: ifeq -> 2033
    //   2003: goto -> 2010
    //   2006: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2009: athrow
    //   2010: aload_0
    //   2011: iconst_0
    //   2012: putfield Vulcan_jl : I
    //   2015: lload_2
    //   2016: lconst_0
    //   2017: lcmp
    //   2018: iflt -> 2050
    //   2021: aload #18
    //   2023: ifnonnull -> 2050
    //   2026: goto -> 2033
    //   2029: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2032: athrow
    //   2033: aload_0
    //   2034: goto -> 2041
    //   2037: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2040: athrow
    //   2041: dup
    //   2042: getfield Vulcan_jl : I
    //   2045: iconst_1
    //   2046: iadd
    //   2047: putfield Vulcan_jl : I
    //   2050: aload_0
    //   2051: aload #18
    //   2053: ifnull -> 2100
    //   2056: getfield Vulcan_St : Z
    //   2059: ifeq -> 2092
    //   2062: goto -> 2069
    //   2065: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2068: athrow
    //   2069: aload_0
    //   2070: iconst_0
    //   2071: putfield Vulcan_O : I
    //   2074: lload_2
    //   2075: lconst_0
    //   2076: lcmp
    //   2077: ifle -> 2109
    //   2080: aload #18
    //   2082: ifnonnull -> 2109
    //   2085: goto -> 2092
    //   2088: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2091: athrow
    //   2092: aload_0
    //   2093: goto -> 2100
    //   2096: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2099: athrow
    //   2100: dup
    //   2101: getfield Vulcan_O : I
    //   2104: iconst_1
    //   2105: iadd
    //   2106: putfield Vulcan_O : I
    //   2109: aload_0
    //   2110: aload #18
    //   2112: ifnull -> 2159
    //   2115: getfield Vulcan_Sr : Z
    //   2118: ifeq -> 2151
    //   2121: goto -> 2128
    //   2124: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2127: athrow
    //   2128: aload_0
    //   2129: iconst_0
    //   2130: putfield Vulcan_SJ : I
    //   2133: lload_2
    //   2134: lconst_0
    //   2135: lcmp
    //   2136: ifle -> 2168
    //   2139: aload #18
    //   2141: ifnonnull -> 2168
    //   2144: goto -> 2151
    //   2147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2150: athrow
    //   2151: aload_0
    //   2152: goto -> 2159
    //   2155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2158: athrow
    //   2159: dup
    //   2160: getfield Vulcan_SJ : I
    //   2163: iconst_1
    //   2164: iadd
    //   2165: putfield Vulcan_SJ : I
    //   2168: aload_0
    //   2169: aload #18
    //   2171: ifnull -> 2218
    //   2174: getfield Vulcan_bb : Z
    //   2177: ifeq -> 2210
    //   2180: goto -> 2187
    //   2183: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2186: athrow
    //   2187: aload_0
    //   2188: iconst_0
    //   2189: putfield Vulcan_i : I
    //   2192: lload_2
    //   2193: lconst_0
    //   2194: lcmp
    //   2195: ifle -> 2227
    //   2198: aload #18
    //   2200: ifnonnull -> 2227
    //   2203: goto -> 2210
    //   2206: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2209: athrow
    //   2210: aload_0
    //   2211: goto -> 2218
    //   2214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2217: athrow
    //   2218: dup
    //   2219: getfield Vulcan_i : I
    //   2222: iconst_1
    //   2223: iadd
    //   2224: putfield Vulcan_i : I
    //   2227: aload_0
    //   2228: aload #18
    //   2230: ifnull -> 2277
    //   2233: getfield Vulcan_jc : Z
    //   2236: ifeq -> 2269
    //   2239: goto -> 2246
    //   2242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2245: athrow
    //   2246: aload_0
    //   2247: iconst_0
    //   2248: putfield Vulcan_kw : I
    //   2251: lload_2
    //   2252: lconst_0
    //   2253: lcmp
    //   2254: iflt -> 2286
    //   2257: aload #18
    //   2259: ifnonnull -> 2286
    //   2262: goto -> 2269
    //   2265: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2268: athrow
    //   2269: aload_0
    //   2270: goto -> 2277
    //   2273: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2276: athrow
    //   2277: dup
    //   2278: getfield Vulcan_kw : I
    //   2281: iconst_1
    //   2282: iadd
    //   2283: putfield Vulcan_kw : I
    //   2286: aload_0
    //   2287: aload #18
    //   2289: ifnull -> 2336
    //   2292: getfield Vulcan_b2 : Z
    //   2295: ifeq -> 2328
    //   2298: goto -> 2305
    //   2301: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2304: athrow
    //   2305: aload_0
    //   2306: iconst_0
    //   2307: putfield Vulcan_SX : I
    //   2310: lload_2
    //   2311: lconst_0
    //   2312: lcmp
    //   2313: ifle -> 2345
    //   2316: aload #18
    //   2318: ifnonnull -> 2345
    //   2321: goto -> 2328
    //   2324: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2327: athrow
    //   2328: aload_0
    //   2329: goto -> 2336
    //   2332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2335: athrow
    //   2336: dup
    //   2337: getfield Vulcan_SX : I
    //   2340: iconst_1
    //   2341: iadd
    //   2342: putfield Vulcan_SX : I
    //   2345: aload_0
    //   2346: lload_2
    //   2347: lconst_0
    //   2348: lcmp
    //   2349: iflt -> 2410
    //   2352: aload #18
    //   2354: ifnull -> 2410
    //   2357: getfield Vulcan_SC : Z
    //   2360: ifne -> 2402
    //   2363: goto -> 2370
    //   2366: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2369: athrow
    //   2370: aload_0
    //   2371: aload #18
    //   2373: ifnull -> 2433
    //   2376: goto -> 2383
    //   2379: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2382: athrow
    //   2383: lload_2
    //   2384: lconst_0
    //   2385: lcmp
    //   2386: iflt -> 2426
    //   2389: getfield Vulcan_a : Z
    //   2392: ifeq -> 2425
    //   2395: goto -> 2402
    //   2398: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2401: athrow
    //   2402: aload_0
    //   2403: goto -> 2410
    //   2406: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2409: athrow
    //   2410: iconst_0
    //   2411: putfield Vulcan_bU : I
    //   2414: lload_2
    //   2415: lconst_0
    //   2416: lcmp
    //   2417: iflt -> 2442
    //   2420: aload #18
    //   2422: ifnonnull -> 2442
    //   2425: aload_0
    //   2426: goto -> 2433
    //   2429: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2432: athrow
    //   2433: dup
    //   2434: getfield Vulcan_bU : I
    //   2437: iconst_1
    //   2438: iadd
    //   2439: putfield Vulcan_bU : I
    //   2442: aload_0
    //   2443: aload #18
    //   2445: ifnull -> 2492
    //   2448: getfield Vulcan_kF : Z
    //   2451: ifeq -> 2484
    //   2454: goto -> 2461
    //   2457: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2460: athrow
    //   2461: aload_0
    //   2462: iconst_0
    //   2463: putfield Vulcan_bW : I
    //   2466: lload_2
    //   2467: lconst_0
    //   2468: lcmp
    //   2469: ifle -> 2501
    //   2472: aload #18
    //   2474: ifnonnull -> 2501
    //   2477: goto -> 2484
    //   2480: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2483: athrow
    //   2484: aload_0
    //   2485: goto -> 2492
    //   2488: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2491: athrow
    //   2492: dup
    //   2493: getfield Vulcan_bW : I
    //   2496: iconst_1
    //   2497: iadd
    //   2498: putfield Vulcan_bW : I
    //   2501: aload_0
    //   2502: aload #18
    //   2504: ifnull -> 2630
    //   2507: getfield Vulcan_o : Z
    //   2510: ifne -> 2622
    //   2513: goto -> 2520
    //   2516: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2519: athrow
    //   2520: aload_0
    //   2521: aload #18
    //   2523: ifnull -> 2630
    //   2526: goto -> 2533
    //   2529: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2532: athrow
    //   2533: lload_2
    //   2534: lconst_0
    //   2535: lcmp
    //   2536: iflt -> 2623
    //   2539: getfield Vulcan_T : Z
    //   2542: ifne -> 2622
    //   2545: goto -> 2552
    //   2548: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2551: athrow
    //   2552: aload_0
    //   2553: lload_2
    //   2554: lconst_0
    //   2555: lcmp
    //   2556: iflt -> 2630
    //   2559: aload #18
    //   2561: ifnull -> 2630
    //   2564: goto -> 2571
    //   2567: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2570: athrow
    //   2571: lload_2
    //   2572: lconst_0
    //   2573: lcmp
    //   2574: iflt -> 2623
    //   2577: getfield Vulcan_e : Z
    //   2580: ifne -> 2622
    //   2583: goto -> 2590
    //   2586: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2589: athrow
    //   2590: aload_0
    //   2591: aload #18
    //   2593: ifnull -> 2653
    //   2596: goto -> 2603
    //   2599: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2602: athrow
    //   2603: lload_2
    //   2604: lconst_0
    //   2605: lcmp
    //   2606: ifle -> 2646
    //   2609: getfield Vulcan_b1 : Z
    //   2612: ifeq -> 2645
    //   2615: goto -> 2622
    //   2618: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2621: athrow
    //   2622: aload_0
    //   2623: goto -> 2630
    //   2626: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2629: athrow
    //   2630: iconst_0
    //   2631: putfield Vulcan_Sn : I
    //   2634: lload_2
    //   2635: lconst_0
    //   2636: lcmp
    //   2637: iflt -> 2662
    //   2640: aload #18
    //   2642: ifnonnull -> 2662
    //   2645: aload_0
    //   2646: goto -> 2653
    //   2649: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2652: athrow
    //   2653: dup
    //   2654: getfield Vulcan_Sn : I
    //   2657: iconst_1
    //   2658: iadd
    //   2659: putfield Vulcan_Sn : I
    //   2662: aload_0
    //   2663: aload #18
    //   2665: ifnull -> 2717
    //   2668: getfield Vulcan_kB : Z
    //   2671: ifeq -> 2709
    //   2674: goto -> 2681
    //   2677: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2680: athrow
    //   2681: aload_0
    //   2682: dup
    //   2683: getfield Vulcan_S2 : I
    //   2686: iconst_1
    //   2687: iadd
    //   2688: putfield Vulcan_S2 : I
    //   2691: lload_2
    //   2692: lconst_0
    //   2693: lcmp
    //   2694: iflt -> 2721
    //   2697: aload #18
    //   2699: ifnonnull -> 2721
    //   2702: goto -> 2709
    //   2705: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2708: athrow
    //   2709: aload_0
    //   2710: goto -> 2717
    //   2713: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2716: athrow
    //   2717: iconst_0
    //   2718: putfield Vulcan_S2 : I
    //   2721: aload_0
    //   2722: aload #18
    //   2724: ifnull -> 2771
    //   2727: getfield Vulcan_ka : Z
    //   2730: ifeq -> 2763
    //   2733: goto -> 2740
    //   2736: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2739: athrow
    //   2740: aload_0
    //   2741: iconst_0
    //   2742: putfield Vulcan_b5 : I
    //   2745: lload_2
    //   2746: lconst_0
    //   2747: lcmp
    //   2748: iflt -> 2780
    //   2751: aload #18
    //   2753: ifnonnull -> 2780
    //   2756: goto -> 2763
    //   2759: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2762: athrow
    //   2763: aload_0
    //   2764: goto -> 2771
    //   2767: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2770: athrow
    //   2771: dup
    //   2772: getfield Vulcan_b5 : I
    //   2775: iconst_1
    //   2776: iadd
    //   2777: putfield Vulcan_b5 : I
    //   2780: aload_0
    //   2781: aload #18
    //   2783: ifnull -> 2895
    //   2786: getfield Vulcan_t : Ljava/util/List;
    //   2789: ifnull -> 2887
    //   2792: goto -> 2799
    //   2795: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2798: athrow
    //   2799: aload_0
    //   2800: aload #18
    //   2802: ifnull -> 2895
    //   2805: goto -> 2812
    //   2808: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2811: athrow
    //   2812: lload_2
    //   2813: lconst_0
    //   2814: lcmp
    //   2815: iflt -> 2888
    //   2818: getfield Vulcan_t : Ljava/util/List;
    //   2821: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   2826: lload #14
    //   2828: iconst_3
    //   2829: anewarray java/lang/Object
    //   2832: dup_x2
    //   2833: dup_x2
    //   2834: pop
    //   2835: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2838: iconst_2
    //   2839: swap
    //   2840: aastore
    //   2841: dup_x1
    //   2842: swap
    //   2843: iconst_1
    //   2844: swap
    //   2845: aastore
    //   2846: dup_x1
    //   2847: swap
    //   2848: iconst_0
    //   2849: swap
    //   2850: aastore
    //   2851: invokestatic Vulcan_G : ([Ljava/lang/Object;)Z
    //   2854: ifeq -> 2887
    //   2857: goto -> 2864
    //   2860: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2863: athrow
    //   2864: aload_0
    //   2865: iconst_0
    //   2866: putfield Vulcan_kQ : I
    //   2869: lload_2
    //   2870: lconst_0
    //   2871: lcmp
    //   2872: iflt -> 2904
    //   2875: aload #18
    //   2877: ifnonnull -> 2904
    //   2880: goto -> 2887
    //   2883: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2886: athrow
    //   2887: aload_0
    //   2888: goto -> 2895
    //   2891: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2894: athrow
    //   2895: dup
    //   2896: getfield Vulcan_kQ : I
    //   2899: iconst_1
    //   2900: iadd
    //   2901: putfield Vulcan_kQ : I
    //   2904: aload_0
    //   2905: aload #18
    //   2907: ifnull -> 3019
    //   2910: getfield Vulcan_t : Ljava/util/List;
    //   2913: ifnull -> 3011
    //   2916: goto -> 2923
    //   2919: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2922: athrow
    //   2923: aload_0
    //   2924: aload #18
    //   2926: ifnull -> 3019
    //   2929: goto -> 2936
    //   2932: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2935: athrow
    //   2936: lload_2
    //   2937: lconst_0
    //   2938: lcmp
    //   2939: iflt -> 3012
    //   2942: getfield Vulcan_t : Ljava/util/List;
    //   2945: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   2950: lload #14
    //   2952: iconst_3
    //   2953: anewarray java/lang/Object
    //   2956: dup_x2
    //   2957: dup_x2
    //   2958: pop
    //   2959: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2962: iconst_2
    //   2963: swap
    //   2964: aastore
    //   2965: dup_x1
    //   2966: swap
    //   2967: iconst_1
    //   2968: swap
    //   2969: aastore
    //   2970: dup_x1
    //   2971: swap
    //   2972: iconst_0
    //   2973: swap
    //   2974: aastore
    //   2975: invokestatic Vulcan_G : ([Ljava/lang/Object;)Z
    //   2978: ifeq -> 3011
    //   2981: goto -> 2988
    //   2984: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2987: athrow
    //   2988: aload_0
    //   2989: iconst_0
    //   2990: putfield Vulcan_jG : I
    //   2993: lload_2
    //   2994: lconst_0
    //   2995: lcmp
    //   2996: ifle -> 3028
    //   2999: aload #18
    //   3001: ifnonnull -> 3028
    //   3004: goto -> 3011
    //   3007: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3010: athrow
    //   3011: aload_0
    //   3012: goto -> 3019
    //   3015: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3018: athrow
    //   3019: dup
    //   3020: getfield Vulcan_jG : I
    //   3023: iconst_1
    //   3024: iadd
    //   3025: putfield Vulcan_jG : I
    //   3028: aload_0
    //   3029: aload #18
    //   3031: ifnull -> 3143
    //   3034: getfield Vulcan_t : Ljava/util/List;
    //   3037: ifnull -> 3135
    //   3040: goto -> 3047
    //   3043: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3046: athrow
    //   3047: aload_0
    //   3048: aload #18
    //   3050: ifnull -> 3143
    //   3053: goto -> 3060
    //   3056: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3059: athrow
    //   3060: lload_2
    //   3061: lconst_0
    //   3062: lcmp
    //   3063: iflt -> 3136
    //   3066: getfield Vulcan_t : Ljava/util/List;
    //   3069: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   3074: lload #14
    //   3076: iconst_3
    //   3077: anewarray java/lang/Object
    //   3080: dup_x2
    //   3081: dup_x2
    //   3082: pop
    //   3083: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3086: iconst_2
    //   3087: swap
    //   3088: aastore
    //   3089: dup_x1
    //   3090: swap
    //   3091: iconst_1
    //   3092: swap
    //   3093: aastore
    //   3094: dup_x1
    //   3095: swap
    //   3096: iconst_0
    //   3097: swap
    //   3098: aastore
    //   3099: invokestatic Vulcan_G : ([Ljava/lang/Object;)Z
    //   3102: ifeq -> 3135
    //   3105: goto -> 3112
    //   3108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3111: athrow
    //   3112: aload_0
    //   3113: iconst_0
    //   3114: putfield Vulcan_q : I
    //   3117: lload_2
    //   3118: lconst_0
    //   3119: lcmp
    //   3120: iflt -> 3152
    //   3123: aload #18
    //   3125: ifnonnull -> 3152
    //   3128: goto -> 3135
    //   3131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3134: athrow
    //   3135: aload_0
    //   3136: goto -> 3143
    //   3139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3142: athrow
    //   3143: dup
    //   3144: getfield Vulcan_q : I
    //   3147: iconst_1
    //   3148: iadd
    //   3149: putfield Vulcan_q : I
    //   3152: aload_0
    //   3153: aload_0
    //   3154: getfield Vulcan_SM : Ljava/util/List;
    //   3157: aload #18
    //   3159: lload_2
    //   3160: lconst_0
    //   3161: lcmp
    //   3162: ifle -> 3216
    //   3165: ifnull -> 3189
    //   3168: ifnull -> 3243
    //   3171: goto -> 3178
    //   3174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3177: athrow
    //   3178: aload_0
    //   3179: getfield Vulcan_SM : Ljava/util/List;
    //   3182: goto -> 3189
    //   3185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3188: athrow
    //   3189: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   3194: lload #4
    //   3196: dup2_x1
    //   3197: pop2
    //   3198: iconst_3
    //   3199: anewarray java/lang/Object
    //   3202: dup_x1
    //   3203: swap
    //   3204: iconst_2
    //   3205: swap
    //   3206: aastore
    //   3207: dup_x2
    //   3208: dup_x2
    //   3209: pop
    //   3210: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3213: iconst_1
    //   3214: swap
    //   3215: aastore
    //   3216: dup_x1
    //   3217: swap
    //   3218: iconst_0
    //   3219: swap
    //   3220: aastore
    //   3221: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   3224: aload #18
    //   3226: ifnull -> 3240
    //   3229: ifeq -> 3243
    //   3232: goto -> 3239
    //   3235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3238: athrow
    //   3239: iconst_1
    //   3240: goto -> 3244
    //   3243: iconst_0
    //   3244: lload_2
    //   3245: lconst_0
    //   3246: lcmp
    //   3247: ifle -> 3309
    //   3250: putfield Vulcan_bE : Z
    //   3253: aload_0
    //   3254: aload #18
    //   3256: ifnull -> 3308
    //   3259: getfield Vulcan_bE : Z
    //   3262: ifeq -> 3300
    //   3265: goto -> 3272
    //   3268: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3271: athrow
    //   3272: aload_0
    //   3273: dup
    //   3274: getfield Vulcan_by : I
    //   3277: iconst_1
    //   3278: iadd
    //   3279: putfield Vulcan_by : I
    //   3282: lload_2
    //   3283: lconst_0
    //   3284: lcmp
    //   3285: ifle -> 3312
    //   3288: aload #18
    //   3290: ifnonnull -> 3312
    //   3293: goto -> 3300
    //   3296: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3299: athrow
    //   3300: aload_0
    //   3301: goto -> 3308
    //   3304: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3307: athrow
    //   3308: iconst_0
    //   3309: putfield Vulcan_by : I
    //   3312: aload_0
    //   3313: lload_2
    //   3314: lconst_0
    //   3315: lcmp
    //   3316: ifle -> 3401
    //   3319: aload #18
    //   3321: ifnull -> 3401
    //   3324: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3327: iconst_0
    //   3328: anewarray java/lang/Object
    //   3331: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3334: invokeinterface isInsideVehicle : ()Z
    //   3339: ifne -> 3393
    //   3342: goto -> 3349
    //   3345: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3348: athrow
    //   3349: aload_0
    //   3350: aload #18
    //   3352: ifnull -> 3424
    //   3355: goto -> 3362
    //   3358: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3361: athrow
    //   3362: lload_2
    //   3363: lconst_0
    //   3364: lcmp
    //   3365: ifle -> 3417
    //   3368: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3371: iconst_0
    //   3372: anewarray java/lang/Object
    //   3375: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3378: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   3383: ifnull -> 3416
    //   3386: goto -> 3393
    //   3389: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3392: athrow
    //   3393: aload_0
    //   3394: goto -> 3401
    //   3397: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3400: athrow
    //   3401: iconst_0
    //   3402: putfield Vulcan_SE : I
    //   3405: lload_2
    //   3406: lconst_0
    //   3407: lcmp
    //   3408: ifle -> 3443
    //   3411: aload #18
    //   3413: ifnonnull -> 3433
    //   3416: aload_0
    //   3417: goto -> 3424
    //   3420: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3423: athrow
    //   3424: dup
    //   3425: getfield Vulcan_SE : I
    //   3428: iconst_1
    //   3429: iadd
    //   3430: putfield Vulcan_SE : I
    //   3433: aload_0
    //   3434: dup
    //   3435: getfield Vulcan_kJ : I
    //   3438: iconst_1
    //   3439: iadd
    //   3440: putfield Vulcan_kJ : I
    //   3443: aload_0
    //   3444: lload_2
    //   3445: lconst_0
    //   3446: lcmp
    //   3447: iflt -> 3520
    //   3450: aload #18
    //   3452: ifnull -> 3520
    //   3455: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3458: iconst_0
    //   3459: anewarray java/lang/Object
    //   3462: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3465: invokeinterface getAllowFlight : ()Z
    //   3470: ifne -> 3512
    //   3473: goto -> 3480
    //   3476: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3479: athrow
    //   3480: aload_0
    //   3481: aload #18
    //   3483: ifnull -> 3543
    //   3486: goto -> 3493
    //   3489: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3492: athrow
    //   3493: lload_2
    //   3494: lconst_0
    //   3495: lcmp
    //   3496: ifle -> 3536
    //   3499: getfield Vulcan_k1 : Z
    //   3502: ifeq -> 3535
    //   3505: goto -> 3512
    //   3508: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3511: athrow
    //   3512: aload_0
    //   3513: goto -> 3520
    //   3516: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3519: athrow
    //   3520: iconst_0
    //   3521: putfield Vulcan_bt : I
    //   3524: aload #18
    //   3526: lload_2
    //   3527: lconst_0
    //   3528: lcmp
    //   3529: ifle -> 3556
    //   3532: ifnonnull -> 3552
    //   3535: aload_0
    //   3536: goto -> 3543
    //   3539: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3542: athrow
    //   3543: dup
    //   3544: getfield Vulcan_bt : I
    //   3547: iconst_1
    //   3548: iadd
    //   3549: putfield Vulcan_bt : I
    //   3552: iconst_0
    //   3553: anewarray java/lang/Object
    //   3556: invokestatic Vulcan_y : ([Ljava/lang/Object;)Z
    //   3559: lload_2
    //   3560: lconst_0
    //   3561: lcmp
    //   3562: ifle -> 3623
    //   3565: aload #18
    //   3567: ifnull -> 3623
    //   3570: ifeq -> 4954
    //   3573: goto -> 3580
    //   3576: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3579: athrow
    //   3580: aload_0
    //   3581: lload_2
    //   3582: lconst_0
    //   3583: lcmp
    //   3584: iflt -> 3680
    //   3587: aload #18
    //   3589: ifnull -> 3680
    //   3592: goto -> 3599
    //   3595: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3598: athrow
    //   3599: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3602: iconst_0
    //   3603: anewarray java/lang/Object
    //   3606: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   3609: iconst_0
    //   3610: anewarray java/lang/Object
    //   3613: invokevirtual Vulcan_g : ([Ljava/lang/Object;)Z
    //   3616: goto -> 3623
    //   3619: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3622: athrow
    //   3623: ifne -> 3672
    //   3626: aload_0
    //   3627: aload #18
    //   3629: ifnull -> 3703
    //   3632: goto -> 3639
    //   3635: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3638: athrow
    //   3639: lload_2
    //   3640: lconst_0
    //   3641: lcmp
    //   3642: iflt -> 3696
    //   3645: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3648: iconst_0
    //   3649: anewarray java/lang/Object
    //   3652: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   3655: iconst_0
    //   3656: anewarray java/lang/Object
    //   3659: invokevirtual Vulcan_m : ([Ljava/lang/Object;)Z
    //   3662: ifeq -> 3695
    //   3665: goto -> 3672
    //   3668: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3671: athrow
    //   3672: aload_0
    //   3673: goto -> 3680
    //   3676: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3679: athrow
    //   3680: iconst_0
    //   3681: putfield Vulcan_d : I
    //   3684: lload_2
    //   3685: lconst_0
    //   3686: lcmp
    //   3687: iflt -> 3712
    //   3690: aload #18
    //   3692: ifnonnull -> 3712
    //   3695: aload_0
    //   3696: goto -> 3703
    //   3699: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3702: athrow
    //   3703: dup
    //   3704: getfield Vulcan_d : I
    //   3707: iconst_1
    //   3708: iadd
    //   3709: putfield Vulcan_d : I
    //   3712: aload_0
    //   3713: lload_2
    //   3714: lconst_0
    //   3715: lcmp
    //   3716: iflt -> 3821
    //   3719: aload #18
    //   3721: ifnull -> 3821
    //   3724: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3727: iconst_0
    //   3728: anewarray java/lang/Object
    //   3731: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3734: lload #16
    //   3736: iconst_2
    //   3737: anewarray java/lang/Object
    //   3740: dup_x2
    //   3741: dup_x2
    //   3742: pop
    //   3743: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3746: iconst_1
    //   3747: swap
    //   3748: aastore
    //   3749: dup_x1
    //   3750: swap
    //   3751: iconst_0
    //   3752: swap
    //   3753: aastore
    //   3754: invokestatic Vulcan_L : ([Ljava/lang/Object;)Z
    //   3757: ifne -> 3813
    //   3760: goto -> 3767
    //   3763: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3766: athrow
    //   3767: aload_0
    //   3768: aload #18
    //   3770: ifnull -> 3844
    //   3773: goto -> 3780
    //   3776: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3779: athrow
    //   3780: lload_2
    //   3781: lconst_0
    //   3782: lcmp
    //   3783: iflt -> 3837
    //   3786: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3789: iconst_0
    //   3790: anewarray java/lang/Object
    //   3793: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   3796: iconst_0
    //   3797: anewarray java/lang/Object
    //   3800: invokevirtual Vulcan_l : ([Ljava/lang/Object;)Z
    //   3803: ifeq -> 3836
    //   3806: goto -> 3813
    //   3809: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3812: athrow
    //   3813: aload_0
    //   3814: goto -> 3821
    //   3817: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3820: athrow
    //   3821: iconst_0
    //   3822: putfield Vulcan_S7 : I
    //   3825: lload_2
    //   3826: lconst_0
    //   3827: lcmp
    //   3828: ifle -> 3853
    //   3831: aload #18
    //   3833: ifnonnull -> 3853
    //   3836: aload_0
    //   3837: goto -> 3844
    //   3840: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3843: athrow
    //   3844: dup
    //   3845: getfield Vulcan_S7 : I
    //   3848: iconst_1
    //   3849: iadd
    //   3850: putfield Vulcan_S7 : I
    //   3853: aload_0
    //   3854: lload_2
    //   3855: lconst_0
    //   3856: lcmp
    //   3857: ifle -> 3946
    //   3860: aload #18
    //   3862: ifnull -> 3946
    //   3865: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3868: iconst_0
    //   3869: anewarray java/lang/Object
    //   3872: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   3875: iconst_0
    //   3876: anewarray java/lang/Object
    //   3879: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Z
    //   3882: ifne -> 3938
    //   3885: goto -> 3892
    //   3888: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3891: athrow
    //   3892: aload_0
    //   3893: aload #18
    //   3895: ifnull -> 3969
    //   3898: goto -> 3905
    //   3901: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3904: athrow
    //   3905: lload_2
    //   3906: lconst_0
    //   3907: lcmp
    //   3908: ifle -> 3962
    //   3911: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3914: iconst_0
    //   3915: anewarray java/lang/Object
    //   3918: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   3921: iconst_0
    //   3922: anewarray java/lang/Object
    //   3925: invokevirtual Vulcan_G : ([Ljava/lang/Object;)Z
    //   3928: ifeq -> 3961
    //   3931: goto -> 3938
    //   3934: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3937: athrow
    //   3938: aload_0
    //   3939: goto -> 3946
    //   3942: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3945: athrow
    //   3946: iconst_0
    //   3947: putfield Vulcan_bK : I
    //   3950: lload_2
    //   3951: lconst_0
    //   3952: lcmp
    //   3953: iflt -> 3978
    //   3956: aload #18
    //   3958: ifnonnull -> 3978
    //   3961: aload_0
    //   3962: goto -> 3969
    //   3965: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3968: athrow
    //   3969: dup
    //   3970: getfield Vulcan_bK : I
    //   3973: iconst_1
    //   3974: iadd
    //   3975: putfield Vulcan_bK : I
    //   3978: aload_0
    //   3979: aload #18
    //   3981: ifnull -> 4063
    //   3984: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   3987: iconst_0
    //   3988: anewarray java/lang/Object
    //   3991: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   3994: lload #10
    //   3996: iconst_2
    //   3997: anewarray java/lang/Object
    //   4000: dup_x2
    //   4001: dup_x2
    //   4002: pop
    //   4003: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4006: iconst_1
    //   4007: swap
    //   4008: aastore
    //   4009: dup_x1
    //   4010: swap
    //   4011: iconst_0
    //   4012: swap
    //   4013: aastore
    //   4014: invokestatic Vulcan_H : ([Ljava/lang/Object;)Z
    //   4017: ifeq -> 4055
    //   4020: goto -> 4027
    //   4023: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4026: athrow
    //   4027: aload_0
    //   4028: dup
    //   4029: getfield Vulcan_F : I
    //   4032: iconst_1
    //   4033: iadd
    //   4034: putfield Vulcan_F : I
    //   4037: aload #18
    //   4039: lload_2
    //   4040: lconst_0
    //   4041: lcmp
    //   4042: ifle -> 4098
    //   4045: ifnonnull -> 4067
    //   4048: goto -> 4055
    //   4051: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4054: athrow
    //   4055: aload_0
    //   4056: goto -> 4063
    //   4059: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4062: athrow
    //   4063: iconst_0
    //   4064: putfield Vulcan_F : I
    //   4067: aload_0
    //   4068: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4071: iconst_0
    //   4072: anewarray java/lang/Object
    //   4075: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4078: lload #10
    //   4080: iconst_2
    //   4081: anewarray java/lang/Object
    //   4084: dup_x2
    //   4085: dup_x2
    //   4086: pop
    //   4087: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4090: iconst_1
    //   4091: swap
    //   4092: aastore
    //   4093: dup_x1
    //   4094: swap
    //   4095: iconst_0
    //   4096: swap
    //   4097: aastore
    //   4098: invokestatic Vulcan_H : ([Ljava/lang/Object;)Z
    //   4101: aload #18
    //   4103: lload_2
    //   4104: lconst_0
    //   4105: lcmp
    //   4106: ifle -> 4152
    //   4109: ifnull -> 4144
    //   4112: ifeq -> 4137
    //   4115: goto -> 4122
    //   4118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4121: athrow
    //   4122: aload_0
    //   4123: aload_0
    //   4124: getfield Vulcan_V : D
    //   4127: putfield Vulcan_jN : D
    //   4130: goto -> 4137
    //   4133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4136: athrow
    //   4137: iconst_0
    //   4138: anewarray java/lang/Object
    //   4141: invokestatic Vulcan_f : ([Ljava/lang/Object;)Z
    //   4144: lload_2
    //   4145: lconst_0
    //   4146: lcmp
    //   4147: iflt -> 4188
    //   4150: aload #18
    //   4152: ifnull -> 4188
    //   4155: ifeq -> 4312
    //   4158: goto -> 4165
    //   4161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4164: athrow
    //   4165: aload_0
    //   4166: aload #18
    //   4168: ifnull -> 4320
    //   4171: goto -> 4178
    //   4174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4177: athrow
    //   4178: getfield Vulcan_jn : Z
    //   4181: goto -> 4188
    //   4184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4187: athrow
    //   4188: ifeq -> 4312
    //   4191: aload_0
    //   4192: aload #18
    //   4194: ifnull -> 4320
    //   4197: goto -> 4204
    //   4200: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4203: athrow
    //   4204: lload_2
    //   4205: lconst_0
    //   4206: lcmp
    //   4207: iflt -> 4313
    //   4210: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4213: iconst_0
    //   4214: anewarray java/lang/Object
    //   4217: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   4220: iconst_0
    //   4221: anewarray java/lang/Object
    //   4224: invokevirtual Vulcan_H : ([Ljava/lang/Object;)Lorg/bukkit/inventory/ItemStack;
    //   4227: ifnull -> 4312
    //   4230: goto -> 4237
    //   4233: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4236: athrow
    //   4237: aload_0
    //   4238: aload #18
    //   4240: ifnull -> 4320
    //   4243: goto -> 4250
    //   4246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4249: athrow
    //   4250: lload_2
    //   4251: lconst_0
    //   4252: lcmp
    //   4253: ifle -> 4313
    //   4256: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4259: iconst_0
    //   4260: anewarray java/lang/Object
    //   4263: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   4266: iconst_0
    //   4267: anewarray java/lang/Object
    //   4270: invokevirtual Vulcan_H : ([Ljava/lang/Object;)Lorg/bukkit/inventory/ItemStack;
    //   4273: getstatic org/bukkit/enchantments/Enchantment.SOUL_SPEED : Lorg/bukkit/enchantments/Enchantment;
    //   4276: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
    //   4279: ifle -> 4312
    //   4282: goto -> 4289
    //   4285: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4288: athrow
    //   4289: aload_0
    //   4290: iconst_0
    //   4291: putfield Vulcan_k7 : I
    //   4294: lload_2
    //   4295: lconst_0
    //   4296: lcmp
    //   4297: iflt -> 4329
    //   4300: aload #18
    //   4302: ifnonnull -> 4329
    //   4305: goto -> 4312
    //   4308: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4311: athrow
    //   4312: aload_0
    //   4313: goto -> 4320
    //   4316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4319: athrow
    //   4320: dup
    //   4321: getfield Vulcan_k7 : I
    //   4324: iconst_1
    //   4325: iadd
    //   4326: putfield Vulcan_k7 : I
    //   4329: aload_0
    //   4330: aload #18
    //   4332: ifnull -> 4393
    //   4335: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4338: iconst_0
    //   4339: anewarray java/lang/Object
    //   4342: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   4345: iconst_0
    //   4346: anewarray java/lang/Object
    //   4349: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Z
    //   4352: ifeq -> 4385
    //   4355: goto -> 4362
    //   4358: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4361: athrow
    //   4362: aload_0
    //   4363: iconst_0
    //   4364: putfield Vulcan_SR : I
    //   4367: lload_2
    //   4368: lconst_0
    //   4369: lcmp
    //   4370: iflt -> 4402
    //   4373: aload #18
    //   4375: ifnonnull -> 4402
    //   4378: goto -> 4385
    //   4381: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4384: athrow
    //   4385: aload_0
    //   4386: goto -> 4393
    //   4389: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4392: athrow
    //   4393: dup
    //   4394: getfield Vulcan_SR : I
    //   4397: iconst_1
    //   4398: iadd
    //   4399: putfield Vulcan_SR : I
    //   4402: aload_0
    //   4403: aload #18
    //   4405: ifnull -> 4484
    //   4408: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4411: iconst_0
    //   4412: anewarray java/lang/Object
    //   4415: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4418: lload #12
    //   4420: dup2_x1
    //   4421: pop2
    //   4422: iconst_2
    //   4423: anewarray java/lang/Object
    //   4426: dup_x1
    //   4427: swap
    //   4428: iconst_1
    //   4429: swap
    //   4430: aastore
    //   4431: dup_x2
    //   4432: dup_x2
    //   4433: pop
    //   4434: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4437: iconst_0
    //   4438: swap
    //   4439: aastore
    //   4440: invokestatic Vulcan_Y : ([Ljava/lang/Object;)Z
    //   4443: ifeq -> 4476
    //   4446: goto -> 4453
    //   4449: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4452: athrow
    //   4453: aload_0
    //   4454: iconst_0
    //   4455: putfield Vulcan_b : I
    //   4458: lload_2
    //   4459: lconst_0
    //   4460: lcmp
    //   4461: iflt -> 4493
    //   4464: aload #18
    //   4466: ifnonnull -> 4493
    //   4469: goto -> 4476
    //   4472: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4475: athrow
    //   4476: aload_0
    //   4477: goto -> 4484
    //   4480: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4483: athrow
    //   4484: dup
    //   4485: getfield Vulcan_b : I
    //   4488: iconst_1
    //   4489: iadd
    //   4490: putfield Vulcan_b : I
    //   4493: aload_0
    //   4494: aload #18
    //   4496: ifnull -> 4543
    //   4499: getfield Vulcan_x : Z
    //   4502: ifeq -> 4535
    //   4505: goto -> 4512
    //   4508: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4511: athrow
    //   4512: aload_0
    //   4513: iconst_0
    //   4514: putfield Vulcan_S0 : I
    //   4517: lload_2
    //   4518: lconst_0
    //   4519: lcmp
    //   4520: iflt -> 4552
    //   4523: aload #18
    //   4525: ifnonnull -> 4552
    //   4528: goto -> 4535
    //   4531: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4534: athrow
    //   4535: aload_0
    //   4536: goto -> 4543
    //   4539: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4542: athrow
    //   4543: dup
    //   4544: getfield Vulcan_S0 : I
    //   4547: iconst_1
    //   4548: iadd
    //   4549: putfield Vulcan_S0 : I
    //   4552: aload_0
    //   4553: lload_2
    //   4554: lconst_0
    //   4555: lcmp
    //   4556: ifle -> 4645
    //   4559: aload #18
    //   4561: ifnull -> 4645
    //   4564: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4567: iconst_0
    //   4568: anewarray java/lang/Object
    //   4571: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   4574: iconst_0
    //   4575: anewarray java/lang/Object
    //   4578: invokevirtual Vulcan_E : ([Ljava/lang/Object;)Z
    //   4581: ifne -> 4637
    //   4584: goto -> 4591
    //   4587: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4590: athrow
    //   4591: aload_0
    //   4592: aload #18
    //   4594: ifnull -> 4668
    //   4597: goto -> 4604
    //   4600: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4603: athrow
    //   4604: lload_2
    //   4605: lconst_0
    //   4606: lcmp
    //   4607: ifle -> 4661
    //   4610: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4613: iconst_0
    //   4614: anewarray java/lang/Object
    //   4617: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   4620: iconst_0
    //   4621: anewarray java/lang/Object
    //   4624: invokevirtual Vulcan_D : ([Ljava/lang/Object;)Z
    //   4627: ifeq -> 4660
    //   4630: goto -> 4637
    //   4633: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4636: athrow
    //   4637: aload_0
    //   4638: goto -> 4645
    //   4641: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4644: athrow
    //   4645: iconst_0
    //   4646: putfield Vulcan_jS : I
    //   4649: lload_2
    //   4650: lconst_0
    //   4651: lcmp
    //   4652: iflt -> 4677
    //   4655: aload #18
    //   4657: ifnonnull -> 4677
    //   4660: aload_0
    //   4661: goto -> 4668
    //   4664: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4667: athrow
    //   4668: dup
    //   4669: getfield Vulcan_jS : I
    //   4672: iconst_1
    //   4673: iadd
    //   4674: putfield Vulcan_jS : I
    //   4677: aload_0
    //   4678: aload #18
    //   4680: ifnull -> 4757
    //   4683: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4686: iconst_0
    //   4687: anewarray java/lang/Object
    //   4690: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4693: lload #6
    //   4695: iconst_2
    //   4696: anewarray java/lang/Object
    //   4699: dup_x2
    //   4700: dup_x2
    //   4701: pop
    //   4702: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4705: iconst_1
    //   4706: swap
    //   4707: aastore
    //   4708: dup_x1
    //   4709: swap
    //   4710: iconst_0
    //   4711: swap
    //   4712: aastore
    //   4713: invokestatic Vulcan_v : ([Ljava/lang/Object;)Z
    //   4716: ifeq -> 4749
    //   4719: goto -> 4726
    //   4722: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4725: athrow
    //   4726: aload_0
    //   4727: iconst_0
    //   4728: putfield Vulcan_Sb : I
    //   4731: lload_2
    //   4732: lconst_0
    //   4733: lcmp
    //   4734: iflt -> 4766
    //   4737: aload #18
    //   4739: ifnonnull -> 4766
    //   4742: goto -> 4749
    //   4745: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4748: athrow
    //   4749: aload_0
    //   4750: goto -> 4757
    //   4753: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4756: athrow
    //   4757: dup
    //   4758: getfield Vulcan_Sb : I
    //   4761: iconst_1
    //   4762: iadd
    //   4763: putfield Vulcan_Sb : I
    //   4766: aload_0
    //   4767: lload_2
    //   4768: lconst_0
    //   4769: lcmp
    //   4770: iflt -> 4831
    //   4773: aload #18
    //   4775: ifnull -> 4831
    //   4778: getfield Vulcan_e : Z
    //   4781: ifne -> 4823
    //   4784: goto -> 4791
    //   4787: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4790: athrow
    //   4791: aload_0
    //   4792: aload #18
    //   4794: ifnull -> 4854
    //   4797: goto -> 4804
    //   4800: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4803: athrow
    //   4804: lload_2
    //   4805: lconst_0
    //   4806: lcmp
    //   4807: ifle -> 4847
    //   4810: getfield Vulcan_b1 : Z
    //   4813: ifeq -> 4846
    //   4816: goto -> 4823
    //   4819: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4822: athrow
    //   4823: aload_0
    //   4824: goto -> 4831
    //   4827: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4830: athrow
    //   4831: iconst_0
    //   4832: putfield Vulcan_Sq : I
    //   4835: lload_2
    //   4836: lconst_0
    //   4837: lcmp
    //   4838: ifle -> 4863
    //   4841: aload #18
    //   4843: ifnonnull -> 4863
    //   4846: aload_0
    //   4847: goto -> 4854
    //   4850: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4853: athrow
    //   4854: dup
    //   4855: getfield Vulcan_Sq : I
    //   4858: iconst_1
    //   4859: iadd
    //   4860: putfield Vulcan_Sq : I
    //   4863: aload_0
    //   4864: aload #18
    //   4866: ifnull -> 4945
    //   4869: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   4872: iconst_0
    //   4873: anewarray java/lang/Object
    //   4876: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   4879: lload #8
    //   4881: dup2_x1
    //   4882: pop2
    //   4883: iconst_2
    //   4884: anewarray java/lang/Object
    //   4887: dup_x1
    //   4888: swap
    //   4889: iconst_1
    //   4890: swap
    //   4891: aastore
    //   4892: dup_x2
    //   4893: dup_x2
    //   4894: pop
    //   4895: invokestatic valueOf : (J)Ljava/lang/Long;
    //   4898: iconst_0
    //   4899: swap
    //   4900: aastore
    //   4901: invokestatic Vulcan_F : ([Ljava/lang/Object;)Z
    //   4904: ifeq -> 4937
    //   4907: goto -> 4914
    //   4910: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4913: athrow
    //   4914: aload_0
    //   4915: iconst_0
    //   4916: putfield Vulcan_SI : I
    //   4919: aload #18
    //   4921: lload_2
    //   4922: lconst_0
    //   4923: lcmp
    //   4924: iflt -> 4957
    //   4927: ifnonnull -> 4954
    //   4930: goto -> 4937
    //   4933: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4936: athrow
    //   4937: aload_0
    //   4938: goto -> 4945
    //   4941: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4944: athrow
    //   4945: dup
    //   4946: getfield Vulcan_SI : I
    //   4949: iconst_1
    //   4950: iadd
    //   4951: putfield Vulcan_SI : I
    //   4954: invokestatic Vulcan_B : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   4957: lload_2
    //   4958: lconst_0
    //   4959: lcmp
    //   4960: iflt -> 4970
    //   4963: ifnonnull -> 4980
    //   4966: iconst_2
    //   4967: anewarray me/frep/vulcan/spigot/check/AbstractCheck
    //   4970: invokestatic Vulcan_Q : ([Lme/frep/vulcan/spigot/check/AbstractCheck;)V
    //   4973: goto -> 4980
    //   4976: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4979: athrow
    //   4980: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #586	-> 69
    //   #587	-> 82
    //   #589	-> 94
    //   #590	-> 141
    //   #592	-> 153
    //   #593	-> 200
    //   #595	-> 212
    //   #596	-> 228
    //   #598	-> 344
    //   #601	-> 449
    //   #602	-> 496
    //   #604	-> 508
    //   #605	-> 554
    //   #607	-> 571
    //   #608	-> 717
    //   #609	-> 784
    //   #610	-> 851
    //   #611	-> 924
    //   #612	-> 985
    //   #613	-> 1021
    //   #615	-> 1038
    //   #617	-> 1054
    //   #618	-> 1096
    //   #620	-> 1113
    //   #621	-> 1155
    //   #623	-> 1172
    //   #624	-> 1214
    //   #626	-> 1231
    //   #627	-> 1339
    //   #629	-> 1356
    //   #630	-> 1436
    //   #632	-> 1453
    //   #633	-> 1495
    //   #635	-> 1512
    //   #636	-> 1554
    //   #638	-> 1571
    //   #639	-> 1613
    //   #641	-> 1630
    //   #642	-> 1672
    //   #644	-> 1689
    //   #645	-> 1731
    //   #647	-> 1748
    //   #648	-> 1856
    //   #650	-> 1873
    //   #651	-> 1915
    //   #653	-> 1932
    //   #654	-> 1974
    //   #656	-> 1991
    //   #657	-> 2033
    //   #659	-> 2050
    //   #660	-> 2092
    //   #662	-> 2109
    //   #663	-> 2151
    //   #665	-> 2168
    //   #666	-> 2210
    //   #668	-> 2227
    //   #669	-> 2269
    //   #671	-> 2286
    //   #672	-> 2328
    //   #674	-> 2345
    //   #675	-> 2425
    //   #677	-> 2442
    //   #678	-> 2484
    //   #680	-> 2501
    //   #681	-> 2645
    //   #683	-> 2662
    //   #684	-> 2709
    //   #686	-> 2721
    //   #687	-> 2763
    //   #689	-> 2780
    //   #690	-> 2887
    //   #692	-> 2904
    //   #693	-> 3011
    //   #695	-> 3028
    //   #696	-> 3135
    //   #698	-> 3152
    //   #700	-> 3253
    //   #701	-> 3300
    //   #703	-> 3312
    //   #704	-> 3393
    //   #706	-> 3416
    //   #709	-> 3433
    //   #711	-> 3443
    //   #712	-> 3512
    //   #714	-> 3535
    //   #717	-> 3552
    //   #718	-> 3580
    //   #719	-> 3695
    //   #721	-> 3712
    //   #722	-> 3836
    //   #724	-> 3853
    //   #725	-> 3961
    //   #727	-> 3978
    //   #728	-> 4055
    //   #730	-> 4067
    //   #732	-> 4137
    //   #733	-> 4259
    //   #734	-> 4312
    //   #736	-> 4329
    //   #737	-> 4385
    //   #739	-> 4402
    //   #740	-> 4476
    //   #742	-> 4493
    //   #743	-> 4535
    //   #745	-> 4552
    //   #746	-> 4660
    //   #748	-> 4677
    //   #749	-> 4749
    //   #751	-> 4766
    //   #752	-> 4846
    //   #754	-> 4863
    //   #755	-> 4937
    //   #757	-> 4954
    // Exception table:
    //   from	to	target	type
    //   94	106	109	java/lang/RuntimeException
    //   100	134	137	java/lang/RuntimeException
    //   113	142	145	java/lang/RuntimeException
    //   153	165	168	java/lang/RuntimeException
    //   159	193	196	java/lang/RuntimeException
    //   172	201	204	java/lang/RuntimeException
    //   212	244	247	java/lang/RuntimeException
    //   228	254	257	java/lang/RuntimeException
    //   251	265	268	java/lang/RuntimeException
    //   272	289	292	java/lang/RuntimeException
    //   286	303	306	java/lang/RuntimeException
    //   310	318	321	java/lang/RuntimeException
    //   330	360	363	java/lang/RuntimeException
    //   344	370	373	java/lang/RuntimeException
    //   367	381	384	java/lang/RuntimeException
    //   388	405	408	java/lang/RuntimeException
    //   402	419	422	java/lang/RuntimeException
    //   426	434	437	java/lang/RuntimeException
    //   449	461	464	java/lang/RuntimeException
    //   455	489	492	java/lang/RuntimeException
    //   468	497	500	java/lang/RuntimeException
    //   508	524	527	java/lang/RuntimeException
    //   514	547	550	java/lang/RuntimeException
    //   531	555	558	java/lang/RuntimeException
    //   571	583	586	java/lang/RuntimeException
    //   577	605	608	java/lang/RuntimeException
    //   590	621	624	java/lang/RuntimeException
    //   612	634	637	java/lang/RuntimeException
    //   628	656	659	java/lang/RuntimeException
    //   641	667	670	java/lang/RuntimeException
    //   674	688	691	java/lang/RuntimeException
    //   685	701	704	java/lang/RuntimeException
    //   695	723	726	java/lang/RuntimeException
    //   708	734	737	java/lang/RuntimeException
    //   741	755	758	java/lang/RuntimeException
    //   752	768	771	java/lang/RuntimeException
    //   762	790	793	java/lang/RuntimeException
    //   775	801	804	java/lang/RuntimeException
    //   808	822	825	java/lang/RuntimeException
    //   819	835	838	java/lang/RuntimeException
    //   829	857	860	java/lang/RuntimeException
    //   842	868	871	java/lang/RuntimeException
    //   875	889	892	java/lang/RuntimeException
    //   886	908	911	java/lang/RuntimeException
    //   896	930	933	java/lang/RuntimeException
    //   915	943	946	java/lang/RuntimeException
    //   937	953	956	java/lang/RuntimeException
    //   960	969	972	java/lang/RuntimeException
    //   963	991	994	java/lang/RuntimeException
    //   976	999	1002	java/lang/RuntimeException
    //   1006	1022	1025	java/lang/RuntimeException
    //   1038	1066	1069	java/lang/RuntimeException
    //   1060	1089	1092	java/lang/RuntimeException
    //   1073	1097	1100	java/lang/RuntimeException
    //   1113	1125	1128	java/lang/RuntimeException
    //   1119	1148	1151	java/lang/RuntimeException
    //   1132	1156	1159	java/lang/RuntimeException
    //   1172	1184	1187	java/lang/RuntimeException
    //   1178	1207	1210	java/lang/RuntimeException
    //   1191	1215	1218	java/lang/RuntimeException
    //   1231	1263	1266	java/lang/RuntimeException
    //   1243	1276	1279	java/lang/RuntimeException
    //   1270	1309	1312	java/lang/RuntimeException
    //   1283	1317	1320	java/lang/RuntimeException
    //   1324	1340	1343	java/lang/RuntimeException
    //   1356	1372	1375	java/lang/RuntimeException
    //   1366	1406	1409	java/lang/RuntimeException
    //   1379	1429	1432	java/lang/RuntimeException
    //   1413	1437	1440	java/lang/RuntimeException
    //   1453	1465	1468	java/lang/RuntimeException
    //   1459	1488	1491	java/lang/RuntimeException
    //   1472	1496	1499	java/lang/RuntimeException
    //   1512	1524	1527	java/lang/RuntimeException
    //   1518	1547	1550	java/lang/RuntimeException
    //   1531	1555	1558	java/lang/RuntimeException
    //   1571	1583	1586	java/lang/RuntimeException
    //   1577	1606	1609	java/lang/RuntimeException
    //   1590	1614	1617	java/lang/RuntimeException
    //   1630	1642	1645	java/lang/RuntimeException
    //   1636	1665	1668	java/lang/RuntimeException
    //   1649	1673	1676	java/lang/RuntimeException
    //   1689	1701	1704	java/lang/RuntimeException
    //   1695	1724	1727	java/lang/RuntimeException
    //   1708	1732	1735	java/lang/RuntimeException
    //   1748	1780	1783	java/lang/RuntimeException
    //   1760	1793	1796	java/lang/RuntimeException
    //   1787	1826	1829	java/lang/RuntimeException
    //   1800	1834	1837	java/lang/RuntimeException
    //   1841	1857	1860	java/lang/RuntimeException
    //   1873	1885	1888	java/lang/RuntimeException
    //   1879	1908	1911	java/lang/RuntimeException
    //   1892	1916	1919	java/lang/RuntimeException
    //   1932	1944	1947	java/lang/RuntimeException
    //   1938	1967	1970	java/lang/RuntimeException
    //   1951	1975	1978	java/lang/RuntimeException
    //   1991	2003	2006	java/lang/RuntimeException
    //   1997	2026	2029	java/lang/RuntimeException
    //   2010	2034	2037	java/lang/RuntimeException
    //   2050	2062	2065	java/lang/RuntimeException
    //   2056	2085	2088	java/lang/RuntimeException
    //   2069	2093	2096	java/lang/RuntimeException
    //   2109	2121	2124	java/lang/RuntimeException
    //   2115	2144	2147	java/lang/RuntimeException
    //   2128	2152	2155	java/lang/RuntimeException
    //   2168	2180	2183	java/lang/RuntimeException
    //   2174	2203	2206	java/lang/RuntimeException
    //   2187	2211	2214	java/lang/RuntimeException
    //   2227	2239	2242	java/lang/RuntimeException
    //   2233	2262	2265	java/lang/RuntimeException
    //   2246	2270	2273	java/lang/RuntimeException
    //   2286	2298	2301	java/lang/RuntimeException
    //   2292	2321	2324	java/lang/RuntimeException
    //   2305	2329	2332	java/lang/RuntimeException
    //   2345	2363	2366	java/lang/RuntimeException
    //   2357	2376	2379	java/lang/RuntimeException
    //   2370	2395	2398	java/lang/RuntimeException
    //   2383	2403	2406	java/lang/RuntimeException
    //   2410	2426	2429	java/lang/RuntimeException
    //   2442	2454	2457	java/lang/RuntimeException
    //   2448	2477	2480	java/lang/RuntimeException
    //   2461	2485	2488	java/lang/RuntimeException
    //   2501	2513	2516	java/lang/RuntimeException
    //   2507	2526	2529	java/lang/RuntimeException
    //   2520	2545	2548	java/lang/RuntimeException
    //   2533	2564	2567	java/lang/RuntimeException
    //   2552	2583	2586	java/lang/RuntimeException
    //   2571	2596	2599	java/lang/RuntimeException
    //   2590	2615	2618	java/lang/RuntimeException
    //   2603	2623	2626	java/lang/RuntimeException
    //   2630	2646	2649	java/lang/RuntimeException
    //   2662	2674	2677	java/lang/RuntimeException
    //   2668	2702	2705	java/lang/RuntimeException
    //   2681	2710	2713	java/lang/RuntimeException
    //   2721	2733	2736	java/lang/RuntimeException
    //   2727	2756	2759	java/lang/RuntimeException
    //   2740	2764	2767	java/lang/RuntimeException
    //   2780	2792	2795	java/lang/RuntimeException
    //   2786	2805	2808	java/lang/RuntimeException
    //   2799	2857	2860	java/lang/RuntimeException
    //   2812	2880	2883	java/lang/RuntimeException
    //   2864	2888	2891	java/lang/RuntimeException
    //   2904	2916	2919	java/lang/RuntimeException
    //   2910	2929	2932	java/lang/RuntimeException
    //   2923	2981	2984	java/lang/RuntimeException
    //   2936	3004	3007	java/lang/RuntimeException
    //   2988	3012	3015	java/lang/RuntimeException
    //   3028	3040	3043	java/lang/RuntimeException
    //   3034	3053	3056	java/lang/RuntimeException
    //   3047	3105	3108	java/lang/RuntimeException
    //   3060	3128	3131	java/lang/RuntimeException
    //   3112	3136	3139	java/lang/RuntimeException
    //   3152	3171	3174	java/lang/RuntimeException
    //   3168	3182	3185	java/lang/RuntimeException
    //   3189	3232	3235	java/lang/RuntimeException
    //   3244	3265	3268	java/lang/RuntimeException
    //   3259	3293	3296	java/lang/RuntimeException
    //   3272	3301	3304	java/lang/RuntimeException
    //   3312	3342	3345	java/lang/RuntimeException
    //   3324	3355	3358	java/lang/RuntimeException
    //   3349	3386	3389	java/lang/RuntimeException
    //   3362	3394	3397	java/lang/RuntimeException
    //   3401	3417	3420	java/lang/RuntimeException
    //   3433	3473	3476	java/lang/RuntimeException
    //   3455	3486	3489	java/lang/RuntimeException
    //   3480	3505	3508	java/lang/RuntimeException
    //   3493	3513	3516	java/lang/RuntimeException
    //   3520	3536	3539	java/lang/RuntimeException
    //   3552	3573	3576	java/lang/RuntimeException
    //   3570	3592	3595	java/lang/RuntimeException
    //   3580	3616	3619	java/lang/RuntimeException
    //   3623	3632	3635	java/lang/RuntimeException
    //   3626	3665	3668	java/lang/RuntimeException
    //   3639	3673	3676	java/lang/RuntimeException
    //   3680	3696	3699	java/lang/RuntimeException
    //   3712	3760	3763	java/lang/RuntimeException
    //   3724	3773	3776	java/lang/RuntimeException
    //   3767	3806	3809	java/lang/RuntimeException
    //   3780	3814	3817	java/lang/RuntimeException
    //   3821	3837	3840	java/lang/RuntimeException
    //   3853	3885	3888	java/lang/RuntimeException
    //   3865	3898	3901	java/lang/RuntimeException
    //   3892	3931	3934	java/lang/RuntimeException
    //   3905	3939	3942	java/lang/RuntimeException
    //   3946	3962	3965	java/lang/RuntimeException
    //   3978	4020	4023	java/lang/RuntimeException
    //   3984	4048	4051	java/lang/RuntimeException
    //   4027	4056	4059	java/lang/RuntimeException
    //   4067	4115	4118	java/lang/RuntimeException
    //   4112	4130	4133	java/lang/RuntimeException
    //   4144	4158	4161	java/lang/RuntimeException
    //   4155	4171	4174	java/lang/RuntimeException
    //   4165	4181	4184	java/lang/RuntimeException
    //   4188	4197	4200	java/lang/RuntimeException
    //   4191	4230	4233	java/lang/RuntimeException
    //   4204	4243	4246	java/lang/RuntimeException
    //   4237	4282	4285	java/lang/RuntimeException
    //   4250	4305	4308	java/lang/RuntimeException
    //   4289	4313	4316	java/lang/RuntimeException
    //   4329	4355	4358	java/lang/RuntimeException
    //   4335	4378	4381	java/lang/RuntimeException
    //   4362	4386	4389	java/lang/RuntimeException
    //   4402	4446	4449	java/lang/RuntimeException
    //   4408	4469	4472	java/lang/RuntimeException
    //   4453	4477	4480	java/lang/RuntimeException
    //   4493	4505	4508	java/lang/RuntimeException
    //   4499	4528	4531	java/lang/RuntimeException
    //   4512	4536	4539	java/lang/RuntimeException
    //   4552	4584	4587	java/lang/RuntimeException
    //   4564	4597	4600	java/lang/RuntimeException
    //   4591	4630	4633	java/lang/RuntimeException
    //   4604	4638	4641	java/lang/RuntimeException
    //   4645	4661	4664	java/lang/RuntimeException
    //   4677	4719	4722	java/lang/RuntimeException
    //   4683	4742	4745	java/lang/RuntimeException
    //   4726	4750	4753	java/lang/RuntimeException
    //   4766	4784	4787	java/lang/RuntimeException
    //   4778	4797	4800	java/lang/RuntimeException
    //   4791	4816	4819	java/lang/RuntimeException
    //   4804	4824	4827	java/lang/RuntimeException
    //   4831	4847	4850	java/lang/RuntimeException
    //   4863	4907	4910	java/lang/RuntimeException
    //   4869	4930	4933	java/lang/RuntimeException
    //   4914	4938	4941	java/lang/RuntimeException
    //   4954	4973	4976	java/lang/RuntimeException
  }
  
  public void Vulcan_Vj(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPlayerDigging
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_3
    //   18: pop
    //   19: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   28: astore #5
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokestatic Vulcan_y : ([Ljava/lang/Object;)Z
    //   37: ifeq -> 373
    //   40: aload_2
    //   41: invokevirtual getAction : ()Lcom/github/retrooper/packetevents/protocol/player/DiggingAction;
    //   44: getstatic com/github/retrooper/packetevents/protocol/player/DiggingAction.RELEASE_USE_ITEM : Lcom/github/retrooper/packetevents/protocol/player/DiggingAction;
    //   47: if_acmpne -> 373
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield Vulcan_Sn : I
    //   61: aload #5
    //   63: ifnull -> 127
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: lload_3
    //   74: lconst_0
    //   75: lcmp
    //   76: iflt -> 120
    //   79: bipush #30
    //   81: if_icmplt -> 119
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: aload_0
    //   92: getfield Vulcan_bH : I
    //   95: aload #5
    //   97: ifnull -> 127
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: bipush #30
    //   109: if_icmpge -> 130
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: iconst_1
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: goto -> 131
    //   130: iconst_0
    //   131: istore #6
    //   133: aload_0
    //   134: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   137: iconst_0
    //   138: anewarray java/lang/Object
    //   141: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   144: invokeinterface getPlayerWeather : ()Lorg/bukkit/WeatherType;
    //   149: getstatic org/bukkit/WeatherType.DOWNFALL : Lorg/bukkit/WeatherType;
    //   152: if_acmpne -> 163
    //   155: iconst_1
    //   156: goto -> 164
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: iconst_0
    //   164: istore #7
    //   166: aload_0
    //   167: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   170: iconst_0
    //   171: anewarray java/lang/Object
    //   174: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   177: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   182: invokeinterface hasStorm : ()Z
    //   187: istore #8
    //   189: aload_0
    //   190: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   193: iconst_0
    //   194: anewarray java/lang/Object
    //   197: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   200: iconst_0
    //   201: anewarray java/lang/Object
    //   204: invokevirtual Vulcan_T : ([Ljava/lang/Object;)I
    //   207: aload #5
    //   209: ifnull -> 232
    //   212: bipush #20
    //   214: if_icmpge -> 235
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   223: athrow
    //   224: iconst_1
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   231: athrow
    //   232: goto -> 236
    //   235: iconst_0
    //   236: istore #9
    //   238: iload #6
    //   240: aload #5
    //   242: ifnull -> 356
    //   245: ifne -> 333
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   254: athrow
    //   255: iload #8
    //   257: aload #5
    //   259: ifnull -> 356
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   268: athrow
    //   269: ifne -> 333
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: iload #7
    //   281: aload #5
    //   283: ifnull -> 356
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   292: athrow
    //   293: ifne -> 333
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   302: athrow
    //   303: iload #9
    //   305: lload_3
    //   306: lconst_0
    //   307: lcmp
    //   308: iflt -> 356
    //   311: aload #5
    //   313: ifnull -> 356
    //   316: goto -> 323
    //   319: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   322: athrow
    //   323: ifeq -> 373
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   332: athrow
    //   333: aload_0
    //   334: aload #5
    //   336: ifnull -> 369
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   345: athrow
    //   346: getfield Vulcan_SI : I
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   355: athrow
    //   356: bipush #20
    //   358: if_icmpge -> 373
    //   361: aload_0
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   368: athrow
    //   369: iconst_0
    //   370: putfield Vulcan_b : I
    //   373: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #760	-> 30
    //   #761	-> 40
    //   #762	-> 57
    //   #763	-> 133
    //   #764	-> 166
    //   #765	-> 189
    //   #767	-> 238
    //   #768	-> 333
    //   #772	-> 373
    // Exception table:
    //   from	to	target	type
    //   30	50	53	java/lang/RuntimeException
    //   40	66	69	java/lang/RuntimeException
    //   57	84	87	java/lang/RuntimeException
    //   73	100	103	java/lang/RuntimeException
    //   91	112	115	java/lang/RuntimeException
    //   107	120	123	java/lang/RuntimeException
    //   133	159	159	java/lang/RuntimeException
    //   189	217	220	java/lang/RuntimeException
    //   212	225	228	java/lang/RuntimeException
    //   238	248	251	java/lang/RuntimeException
    //   245	262	265	java/lang/RuntimeException
    //   255	272	275	java/lang/RuntimeException
    //   269	286	289	java/lang/RuntimeException
    //   279	296	299	java/lang/RuntimeException
    //   293	316	319	java/lang/RuntimeException
    //   303	326	329	java/lang/RuntimeException
    //   323	339	342	java/lang/RuntimeException
    //   333	349	352	java/lang/RuntimeException
    //   356	362	365	java/lang/RuntimeException
  }
  
  public boolean Vulcan_CP(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   21: astore #4
    //   23: iconst_0
    //   24: anewarray java/lang/Object
    //   27: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   30: ifeq -> 161
    //   33: aload_0
    //   34: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   37: aload #4
    //   39: lload_2
    //   40: lconst_0
    //   41: lcmp
    //   42: ifle -> 84
    //   45: ifnull -> 76
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: ifnull -> 282
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: aload_0
    //   66: getfield Vulcan_Sy : Lorg/bukkit/Material;
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: lload_2
    //   77: lconst_0
    //   78: lcmp
    //   79: ifle -> 108
    //   82: aload #4
    //   84: ifnull -> 108
    //   87: ifnull -> 282
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload_0
    //   98: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: invokestatic Vulcan_Kx : (Lorg/bukkit/Material;)Z
    //   111: aload #4
    //   113: ifnull -> 156
    //   116: ifeq -> 155
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: aload_0
    //   127: getfield Vulcan_Sy : Lorg/bukkit/Material;
    //   130: invokestatic Vulcan_Kx : (Lorg/bukkit/Material;)Z
    //   133: aload #4
    //   135: ifnull -> 156
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: ifne -> 159
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: iconst_1
    //   156: goto -> 160
    //   159: iconst_0
    //   160: ireturn
    //   161: aload_0
    //   162: getfield Vulcan_Se : Lorg/bukkit/Material;
    //   165: aload #4
    //   167: lload_2
    //   168: lconst_0
    //   169: lcmp
    //   170: ifle -> 205
    //   173: ifnull -> 197
    //   176: ifnull -> 282
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   185: athrow
    //   186: aload_0
    //   187: getfield Vulcan_k : Lorg/bukkit/Material;
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   196: athrow
    //   197: lload_2
    //   198: lconst_0
    //   199: lcmp
    //   200: ifle -> 229
    //   203: aload #4
    //   205: ifnull -> 229
    //   208: ifnull -> 282
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload_0
    //   219: getfield Vulcan_Se : Lorg/bukkit/Material;
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   228: athrow
    //   229: invokestatic Vulcan_Kx : (Lorg/bukkit/Material;)Z
    //   232: aload #4
    //   234: ifnull -> 277
    //   237: ifeq -> 276
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: aload_0
    //   248: getfield Vulcan_k : Lorg/bukkit/Material;
    //   251: invokestatic Vulcan_Kx : (Lorg/bukkit/Material;)Z
    //   254: aload #4
    //   256: ifnull -> 277
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: ifne -> 280
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   275: athrow
    //   276: iconst_1
    //   277: goto -> 281
    //   280: iconst_0
    //   281: ireturn
    //   282: iconst_0
    //   283: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #775	-> 23
    //   #776	-> 33
    //   #777	-> 97
    //   #780	-> 161
    //   #781	-> 218
    //   #784	-> 282
    // Exception table:
    //   from	to	target	type
    //   23	48	51	java/lang/RuntimeException
    //   33	58	61	java/lang/RuntimeException
    //   55	69	72	java/lang/RuntimeException
    //   76	90	93	java/lang/RuntimeException
    //   87	101	104	java/lang/RuntimeException
    //   108	119	122	java/lang/RuntimeException
    //   116	138	141	java/lang/RuntimeException
    //   126	148	151	java/lang/RuntimeException
    //   161	179	182	java/lang/RuntimeException
    //   176	190	193	java/lang/RuntimeException
    //   197	211	214	java/lang/RuntimeException
    //   208	222	225	java/lang/RuntimeException
    //   229	240	243	java/lang/RuntimeException
    //   237	259	262	java/lang/RuntimeException
    //   247	269	272	java/lang/RuntimeException
  }
  
  public void Vulcan_tT(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   21: astore #4
    //   23: iconst_0
    //   24: anewarray java/lang/Object
    //   27: invokestatic Vulcan_y : ([Ljava/lang/Object;)Z
    //   30: aload #4
    //   32: ifnull -> 87
    //   35: ifeq -> 169
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   44: athrow
    //   45: aload_0
    //   46: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   56: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   61: invokeinterface getItemInMainHand : ()Lorg/bukkit/inventory/ItemStack;
    //   66: invokevirtual getType : ()Lorg/bukkit/Material;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   75: iconst_2
    //   76: aaload
    //   77: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: aload #4
    //   89: ifnull -> 161
    //   92: ifeq -> 114
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: aload_0
    //   103: iconst_0
    //   104: putfield Vulcan_kJ : I
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: aload_0
    //   115: aload #4
    //   117: ifnull -> 165
    //   120: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   123: iconst_0
    //   124: anewarray java/lang/Object
    //   127: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   130: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   135: invokeinterface getItemInOffHand : ()Lorg/bukkit/inventory/ItemStack;
    //   140: invokevirtual getType : ()Lorg/bukkit/Material;
    //   143: invokevirtual toString : ()Ljava/lang/String;
    //   146: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   149: iconst_0
    //   150: aaload
    //   151: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   160: athrow
    //   161: ifeq -> 169
    //   164: aload_0
    //   165: iconst_0
    //   166: putfield Vulcan_kJ : I
    //   169: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #788	-> 23
    //   #789	-> 45
    //   #790	-> 102
    //   #791	-> 114
    //   #792	-> 164
    //   #794	-> 169
    // Exception table:
    //   from	to	target	type
    //   23	38	41	java/lang/RuntimeException
    //   35	80	83	java/lang/RuntimeException
    //   87	95	98	java/lang/RuntimeException
    //   92	107	110	java/lang/RuntimeException
    //   114	154	157	java/lang/RuntimeException
  }
  
  public boolean Vulcan_cO(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   21: astore #4
    //   23: aload_0
    //   24: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   27: aload #4
    //   29: ifnull -> 53
    //   32: ifnull -> 199
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: aload_0
    //   43: getfield Vulcan_Sy : Lorg/bukkit/Material;
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   52: athrow
    //   53: aload #4
    //   55: lload_2
    //   56: lconst_0
    //   57: lcmp
    //   58: ifle -> 93
    //   61: ifnull -> 85
    //   64: ifnull -> 199
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield Vulcan_SG : Lorg/bukkit/Material;
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: lload_2
    //   86: lconst_0
    //   87: lcmp
    //   88: iflt -> 117
    //   91: aload #4
    //   93: ifnull -> 117
    //   96: ifnull -> 199
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: aload_0
    //   107: getfield Vulcan_bA : Lorg/bukkit/Material;
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   116: athrow
    //   117: invokestatic Vulcan_Kx : (Lorg/bukkit/Material;)Z
    //   120: aload #4
    //   122: ifnull -> 194
    //   125: ifeq -> 193
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: aload_0
    //   136: getfield Vulcan_Sy : Lorg/bukkit/Material;
    //   139: invokestatic Vulcan_Kx : (Lorg/bukkit/Material;)Z
    //   142: aload #4
    //   144: ifnull -> 194
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: ifeq -> 193
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   163: athrow
    //   164: aload_0
    //   165: getfield Vulcan_SG : Lorg/bukkit/Material;
    //   168: invokestatic Vulcan_Kx : (Lorg/bukkit/Material;)Z
    //   171: aload #4
    //   173: ifnull -> 194
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   182: athrow
    //   183: ifne -> 197
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   192: athrow
    //   193: iconst_1
    //   194: goto -> 198
    //   197: iconst_0
    //   198: ireturn
    //   199: iconst_0
    //   200: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #797	-> 23
    //   #798	-> 106
    //   #800	-> 199
    // Exception table:
    //   from	to	target	type
    //   23	35	38	java/lang/RuntimeException
    //   32	46	49	java/lang/RuntimeException
    //   53	67	70	java/lang/RuntimeException
    //   64	78	81	java/lang/RuntimeException
    //   85	99	102	java/lang/RuntimeException
    //   96	110	113	java/lang/RuntimeException
    //   117	128	131	java/lang/RuntimeException
    //   125	147	150	java/lang/RuntimeException
    //   135	157	160	java/lang/RuntimeException
    //   154	176	179	java/lang/RuntimeException
    //   164	186	189	java/lang/RuntimeException
  }
  
  public boolean Vulcan_CS(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 34315142343354
    //   23: lxor
    //   24: lstore #4
    //   26: pop2
    //   27: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   30: astore #6
    //   32: iconst_0
    //   33: anewarray java/lang/Object
    //   36: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   39: ifeq -> 240
    //   42: aload_0
    //   43: getfield Vulcan_SM : Ljava/util/List;
    //   46: aload #6
    //   48: lload_2
    //   49: lconst_0
    //   50: lcmp
    //   51: ifle -> 87
    //   54: ifnull -> 85
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: ifnull -> 238
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield Vulcan_bX : Ljava/util/List;
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: aload #6
    //   87: lload_2
    //   88: lconst_0
    //   89: lcmp
    //   90: ifle -> 144
    //   93: ifnull -> 117
    //   96: ifnull -> 238
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: aload_0
    //   107: getfield Vulcan_SM : Ljava/util/List;
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   116: athrow
    //   117: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   122: lload #4
    //   124: dup2_x1
    //   125: pop2
    //   126: iconst_3
    //   127: anewarray java/lang/Object
    //   130: dup_x1
    //   131: swap
    //   132: iconst_2
    //   133: swap
    //   134: aastore
    //   135: dup_x2
    //   136: dup_x2
    //   137: pop
    //   138: invokestatic valueOf : (J)Ljava/lang/Long;
    //   141: iconst_1
    //   142: swap
    //   143: aastore
    //   144: dup_x1
    //   145: swap
    //   146: iconst_0
    //   147: swap
    //   148: aastore
    //   149: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   152: aload #6
    //   154: lload_2
    //   155: lconst_0
    //   156: lcmp
    //   157: ifle -> 221
    //   160: ifnull -> 219
    //   163: ifeq -> 238
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   172: athrow
    //   173: aload_0
    //   174: getfield Vulcan_bX : Ljava/util/List;
    //   177: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   182: lload #4
    //   184: dup2_x1
    //   185: pop2
    //   186: iconst_3
    //   187: anewarray java/lang/Object
    //   190: dup_x1
    //   191: swap
    //   192: iconst_2
    //   193: swap
    //   194: aastore
    //   195: dup_x2
    //   196: dup_x2
    //   197: pop
    //   198: invokestatic valueOf : (J)Ljava/lang/Long;
    //   201: iconst_1
    //   202: swap
    //   203: aastore
    //   204: dup_x1
    //   205: swap
    //   206: iconst_0
    //   207: swap
    //   208: aastore
    //   209: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   218: athrow
    //   219: aload #6
    //   221: ifnull -> 235
    //   224: ifeq -> 238
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   233: athrow
    //   234: iconst_1
    //   235: goto -> 239
    //   238: iconst_0
    //   239: ireturn
    //   240: aload_0
    //   241: getfield Vulcan_SM : Ljava/util/List;
    //   244: aload #6
    //   246: lload_2
    //   247: lconst_0
    //   248: lcmp
    //   249: iflt -> 303
    //   252: ifnull -> 276
    //   255: ifnull -> 330
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   264: athrow
    //   265: aload_0
    //   266: getfield Vulcan_SM : Ljava/util/List;
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   275: athrow
    //   276: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   281: lload #4
    //   283: dup2_x1
    //   284: pop2
    //   285: iconst_3
    //   286: anewarray java/lang/Object
    //   289: dup_x1
    //   290: swap
    //   291: iconst_2
    //   292: swap
    //   293: aastore
    //   294: dup_x2
    //   295: dup_x2
    //   296: pop
    //   297: invokestatic valueOf : (J)Ljava/lang/Long;
    //   300: iconst_1
    //   301: swap
    //   302: aastore
    //   303: dup_x1
    //   304: swap
    //   305: iconst_0
    //   306: swap
    //   307: aastore
    //   308: invokestatic Vulcan_O : ([Ljava/lang/Object;)Z
    //   311: aload #6
    //   313: ifnull -> 327
    //   316: ifeq -> 330
    //   319: goto -> 326
    //   322: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   325: athrow
    //   326: iconst_1
    //   327: goto -> 331
    //   330: iconst_0
    //   331: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #804	-> 32
    //   #805	-> 42
    //   #807	-> 240
    // Exception table:
    //   from	to	target	type
    //   32	57	60	java/lang/RuntimeException
    //   42	67	70	java/lang/RuntimeException
    //   64	78	81	java/lang/RuntimeException
    //   85	99	102	java/lang/RuntimeException
    //   96	110	113	java/lang/RuntimeException
    //   117	166	169	java/lang/RuntimeException
    //   163	212	215	java/lang/RuntimeException
    //   219	227	230	java/lang/RuntimeException
    //   240	258	261	java/lang/RuntimeException
    //   255	269	272	java/lang/RuntimeException
    //   276	319	322	java/lang/RuntimeException
  }
  
  public double Vulcan_e(Object[] paramArrayOfObject) {
    return Math.abs(this.Vulcan_V - this.Vulcan_bf);
  }
  
  public void Vulcan_tm(Object[] paramArrayOfObject) {
    this.Vulcan_bZ = Vulcan_K.INSTANCE.Vulcan_W().Vulcan_I(new Object[0]);
    this.Vulcan_k_ = 0;
  }
  
  public void Vulcan_tB(Object[] paramArrayOfObject) {
    this.Vulcan_bH = 0;
    this.Vulcan_b9 = Vulcan_K.INSTANCE.Vulcan_W().Vulcan_I(new Object[0]);
  }
  
  private void Vulcan_tF(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 38278471616045
    //   23: lxor
    //   24: lstore #4
    //   26: dup2
    //   27: ldc2_w 34623688822904
    //   30: lxor
    //   31: lstore #6
    //   33: pop2
    //   34: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   37: astore #8
    //   39: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_dl : Z
    //   42: aload #8
    //   44: ifnull -> 75
    //   47: ifeq -> 78
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: iconst_0
    //   58: anewarray java/lang/Object
    //   61: invokestatic Vulcan_S : ([Ljava/lang/Object;)D
    //   64: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L1 : D
    //   67: dcmpg
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: ifge -> 79
    //   78: return
    //   79: aload_0
    //   80: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   83: aload #8
    //   85: lload_2
    //   86: lconst_0
    //   87: lcmp
    //   88: ifle -> 271
    //   91: ifnull -> 267
    //   94: iconst_0
    //   95: anewarray java/lang/Object
    //   98: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   101: iconst_1
    //   102: anewarray java/lang/Object
    //   105: dup_x1
    //   106: swap
    //   107: iconst_0
    //   108: swap
    //   109: aastore
    //   110: invokestatic Vulcan_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   113: ifnull -> 263
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload_0
    //   124: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   127: iconst_0
    //   128: anewarray java/lang/Object
    //   131: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   134: iconst_1
    //   135: anewarray java/lang/Object
    //   138: dup_x1
    //   139: swap
    //   140: iconst_0
    //   141: swap
    //   142: aastore
    //   143: invokestatic Vulcan_j : ([Ljava/lang/Object;)Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   146: getstatic com/github/retrooper/packetevents/protocol/player/ClientVersion.V_1_17 : Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;
    //   149: invokevirtual isOlderThan : (Lcom/github/retrooper/packetevents/protocol/player/ClientVersion;)Z
    //   152: aload #8
    //   154: ifnull -> 345
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   163: athrow
    //   164: ifeq -> 263
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: iconst_0
    //   175: anewarray java/lang/Object
    //   178: invokestatic Vulcan_l : ([Ljava/lang/Object;)Z
    //   181: aload #8
    //   183: ifnull -> 345
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   192: athrow
    //   193: ifeq -> 263
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   202: athrow
    //   203: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GR : Z
    //   206: aload #8
    //   208: ifnull -> 345
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: ifeq -> 263
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   227: athrow
    //   228: aload_0
    //   229: iconst_0
    //   230: anewarray java/lang/Object
    //   233: invokevirtual Vulcan_z : ([Ljava/lang/Object;)D
    //   236: ldc2_w 5.0
    //   239: dcmpg
    //   240: aload #8
    //   242: ifnull -> 345
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   251: athrow
    //   252: ifge -> 263
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   261: athrow
    //   262: return
    //   263: aload_0
    //   264: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   267: iconst_0
    //   268: anewarray java/lang/Object
    //   271: invokevirtual Vulcan_K : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_X;
    //   274: bipush #7
    //   276: anewarray me/frep/vulcan/spigot/Vulcan_h3
    //   279: dup
    //   280: iconst_0
    //   281: getstatic me/frep/vulcan/spigot/Vulcan_h3.LAGGED_NEAR_GROUND : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   284: aastore
    //   285: dup
    //   286: iconst_1
    //   287: getstatic me/frep/vulcan/spigot/Vulcan_h3.BLOCK_PLACE_FAST : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   290: aastore
    //   291: dup
    //   292: iconst_2
    //   293: getstatic me/frep/vulcan/spigot/Vulcan_h3.LAGGED_NEAR_GROUND_MODERN : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   296: aastore
    //   297: dup
    //   298: iconst_3
    //   299: getstatic me/frep/vulcan/spigot/Vulcan_h3.FLIGHT : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   302: aastore
    //   303: dup
    //   304: iconst_4
    //   305: getstatic me/frep/vulcan/spigot/Vulcan_h3.TELEPORT : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   308: aastore
    //   309: dup
    //   310: iconst_5
    //   311: getstatic me/frep/vulcan/spigot/Vulcan_h3.SWIMMING : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   314: aastore
    //   315: dup
    //   316: bipush #6
    //   318: getstatic me/frep/vulcan/spigot/Vulcan_h3.DEATH : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   321: aastore
    //   322: lload #6
    //   324: iconst_2
    //   325: anewarray java/lang/Object
    //   328: dup_x2
    //   329: dup_x2
    //   330: pop
    //   331: invokestatic valueOf : (J)Ljava/lang/Long;
    //   334: iconst_1
    //   335: swap
    //   336: aastore
    //   337: dup_x1
    //   338: swap
    //   339: iconst_0
    //   340: swap
    //   341: aastore
    //   342: invokevirtual Vulcan_g : ([Ljava/lang/Object;)Z
    //   345: istore #9
    //   347: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_C : Z
    //   350: aload #8
    //   352: lload_2
    //   353: lconst_0
    //   354: lcmp
    //   355: ifle -> 417
    //   358: ifnull -> 415
    //   361: ifeq -> 412
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   370: athrow
    //   371: aload_0
    //   372: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   375: invokevirtual getClientBrand : ()Ljava/lang/String;
    //   378: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   381: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   384: bipush #11
    //   386: aaload
    //   387: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   390: aload #8
    //   392: ifnull -> 531
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   401: athrow
    //   402: ifne -> 530
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   411: athrow
    //   412: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_GO : Z
    //   415: aload #8
    //   417: lload_2
    //   418: lconst_0
    //   419: lcmp
    //   420: ifle -> 517
    //   423: ifnull -> 515
    //   426: ifeq -> 480
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   435: athrow
    //   436: aload_0
    //   437: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   440: iconst_0
    //   441: anewarray java/lang/Object
    //   444: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   447: invokeinterface getName : ()Ljava/lang/String;
    //   452: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Mp : Ljava/lang/String;
    //   455: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   458: aload #8
    //   460: ifnull -> 531
    //   463: goto -> 470
    //   466: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   469: athrow
    //   470: ifne -> 530
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   479: athrow
    //   480: aload_0
    //   481: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   484: iconst_0
    //   485: anewarray java/lang/Object
    //   488: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   491: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   496: invokevirtual toString : ()Ljava/lang/String;
    //   499: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   502: bipush #15
    //   504: aaload
    //   505: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   508: goto -> 515
    //   511: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   514: athrow
    //   515: aload #8
    //   517: ifnull -> 531
    //   520: ifeq -> 534
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   529: athrow
    //   530: iconst_1
    //   531: goto -> 535
    //   534: iconst_0
    //   535: istore #10
    //   537: aload_0
    //   538: getfield Vulcan_SU : I
    //   541: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_d6 : I
    //   544: aload #8
    //   546: lload_2
    //   547: lconst_0
    //   548: lcmp
    //   549: iflt -> 579
    //   552: ifnull -> 577
    //   555: if_icmple -> 623
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   564: athrow
    //   565: aload_0
    //   566: getfield Vulcan_bI : I
    //   569: iconst_1
    //   570: goto -> 577
    //   573: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   576: athrow
    //   577: aload #8
    //   579: ifnull -> 616
    //   582: if_icmplt -> 623
    //   585: goto -> 592
    //   588: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   591: athrow
    //   592: aload_0
    //   593: getfield Vulcan_kX : I
    //   596: aload #8
    //   598: ifnull -> 620
    //   601: goto -> 608
    //   604: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   607: athrow
    //   608: iconst_1
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   615: athrow
    //   616: if_icmplt -> 623
    //   619: iconst_1
    //   620: goto -> 624
    //   623: iconst_0
    //   624: istore #11
    //   626: iload #11
    //   628: aload #8
    //   630: ifnull -> 1315
    //   633: ifeq -> 1290
    //   636: goto -> 643
    //   639: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   642: athrow
    //   643: iload #9
    //   645: aload #8
    //   647: ifnull -> 1315
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   656: athrow
    //   657: ifne -> 1290
    //   660: goto -> 667
    //   663: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   666: athrow
    //   667: iload #10
    //   669: aload #8
    //   671: ifnull -> 1315
    //   674: goto -> 681
    //   677: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   680: athrow
    //   681: ifne -> 1290
    //   684: goto -> 691
    //   687: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   690: athrow
    //   691: aload_0
    //   692: dup
    //   693: getfield Vulcan_kU : D
    //   696: dconst_1
    //   697: dadd
    //   698: dup2_x1
    //   699: putfield Vulcan_kU : D
    //   702: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Gx : D
    //   705: dcmpl
    //   706: aload #8
    //   708: lload_2
    //   709: lconst_0
    //   710: lcmp
    //   711: iflt -> 739
    //   714: ifnull -> 737
    //   717: goto -> 724
    //   720: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   723: athrow
    //   724: ifle -> 1330
    //   727: goto -> 734
    //   730: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   733: athrow
    //   734: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_L_ : Z
    //   737: aload #8
    //   739: ifnull -> 806
    //   742: ifeq -> 803
    //   745: goto -> 752
    //   748: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   751: athrow
    //   752: new me/frep/vulcan/api/event/VulcanGhostBlockEvent
    //   755: dup
    //   756: aload_0
    //   757: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   760: iconst_0
    //   761: anewarray java/lang/Object
    //   764: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   767: invokespecial <init> : (Lorg/bukkit/entity/Player;)V
    //   770: astore #12
    //   772: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   775: aload #12
    //   777: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   782: aload #12
    //   784: invokevirtual isCancelled : ()Z
    //   787: aload #8
    //   789: ifnull -> 806
    //   792: ifeq -> 803
    //   795: goto -> 802
    //   798: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   801: athrow
    //   802: return
    //   803: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MX : Z
    //   806: ifne -> 812
    //   809: goto -> 854
    //   812: aload_0
    //   813: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   816: iconst_1
    //   817: iconst_1
    //   818: anewarray java/lang/Object
    //   821: dup_x1
    //   822: swap
    //   823: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   826: iconst_0
    //   827: swap
    //   828: aastore
    //   829: invokevirtual Vulcan_U : ([Ljava/lang/Object;)V
    //   832: aload_0
    //   833: iconst_0
    //   834: putfield Vulcan_bd : I
    //   837: aload_0
    //   838: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   841: invokevirtual Vulcan_W : ()Lme/frep/vulcan/spigot/Vulcan_K8;
    //   844: iconst_0
    //   845: anewarray java/lang/Object
    //   848: invokevirtual Vulcan_I : ([Ljava/lang/Object;)I
    //   851: putfield Vulcan_kS : I
    //   854: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_d0 : Z
    //   857: aload #8
    //   859: lload_2
    //   860: lconst_0
    //   861: lcmp
    //   862: iflt -> 938
    //   865: ifnull -> 930
    //   868: ifeq -> 927
    //   871: goto -> 878
    //   874: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   877: athrow
    //   878: aload_0
    //   879: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   882: iconst_0
    //   883: anewarray java/lang/Object
    //   886: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   889: lload #4
    //   891: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MU : Ljava/lang/String;
    //   894: iconst_2
    //   895: anewarray java/lang/Object
    //   898: dup_x1
    //   899: swap
    //   900: iconst_1
    //   901: swap
    //   902: aastore
    //   903: dup_x2
    //   904: dup_x2
    //   905: pop
    //   906: invokestatic valueOf : (J)Ljava/lang/Long;
    //   909: iconst_0
    //   910: swap
    //   911: aastore
    //   912: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   915: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   920: goto -> 927
    //   923: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   926: athrow
    //   927: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Lr : Z
    //   930: lload_2
    //   931: lconst_0
    //   932: lcmp
    //   933: iflt -> 1099
    //   936: aload #8
    //   938: ifnull -> 1099
    //   941: ifeq -> 1096
    //   944: goto -> 951
    //   947: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   950: athrow
    //   951: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   954: invokevirtual Vulcan_l : ()Lme/frep/vulcan/spigot/Vulcan_XP;
    //   957: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MT : Ljava/lang/String;
    //   960: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   963: bipush #12
    //   965: aaload
    //   966: aload_0
    //   967: getfield Vulcan_f : I
    //   970: invokestatic toString : (I)Ljava/lang/String;
    //   973: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   976: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   979: iconst_3
    //   980: aaload
    //   981: aload_0
    //   982: getfield Vulcan_bL : I
    //   985: invokestatic toString : (I)Ljava/lang/String;
    //   988: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   991: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   994: bipush #16
    //   996: aaload
    //   997: aload_0
    //   998: getfield Vulcan_bp : I
    //   1001: invokestatic toString : (I)Ljava/lang/String;
    //   1004: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1007: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1010: bipush #14
    //   1012: aaload
    //   1013: aload_0
    //   1014: getfield Vulcan_SU : I
    //   1017: invokestatic toString : (I)Ljava/lang/String;
    //   1020: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1023: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1026: bipush #9
    //   1028: aaload
    //   1029: aload_0
    //   1030: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1033: iconst_0
    //   1034: anewarray java/lang/Object
    //   1037: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1040: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   1045: invokeinterface getName : ()Ljava/lang/String;
    //   1050: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1053: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1056: iconst_4
    //   1057: aaload
    //   1058: aload_0
    //   1059: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1062: iconst_0
    //   1063: anewarray java/lang/Object
    //   1066: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1069: invokeinterface getName : ()Ljava/lang/String;
    //   1074: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1077: iconst_1
    //   1078: anewarray java/lang/Object
    //   1081: dup_x1
    //   1082: swap
    //   1083: iconst_0
    //   1084: swap
    //   1085: aastore
    //   1086: invokevirtual Vulcan_H : ([Ljava/lang/Object;)V
    //   1089: goto -> 1096
    //   1092: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1095: athrow
    //   1096: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_M1 : Z
    //   1099: ifeq -> 1269
    //   1102: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   1105: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   1108: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   1111: getstatic java/util/logging/Level.INFO : Ljava/util/logging/Level;
    //   1114: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_La : Ljava/lang/String;
    //   1117: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1120: bipush #14
    //   1122: aaload
    //   1123: aload_0
    //   1124: getfield Vulcan_SU : I
    //   1127: invokestatic toString : (I)Ljava/lang/String;
    //   1130: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1133: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1136: iconst_4
    //   1137: aaload
    //   1138: aload_0
    //   1139: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1142: iconst_0
    //   1143: anewarray java/lang/Object
    //   1146: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1149: invokeinterface getName : ()Ljava/lang/String;
    //   1154: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1157: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1160: bipush #9
    //   1162: aaload
    //   1163: aload_0
    //   1164: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   1167: iconst_0
    //   1168: anewarray java/lang/Object
    //   1171: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1174: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   1179: invokeinterface getName : ()Ljava/lang/String;
    //   1184: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1187: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1190: bipush #16
    //   1192: aaload
    //   1193: aload_0
    //   1194: getfield Vulcan_bp : I
    //   1197: invokestatic toString : (I)Ljava/lang/String;
    //   1200: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1203: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1206: iconst_3
    //   1207: aaload
    //   1208: aload_0
    //   1209: getfield Vulcan_bL : I
    //   1212: invokestatic toString : (I)Ljava/lang/String;
    //   1215: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1218: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   1221: bipush #12
    //   1223: aaload
    //   1224: aload_0
    //   1225: getfield Vulcan_f : I
    //   1228: invokestatic toString : (I)Ljava/lang/String;
    //   1231: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1234: lload #4
    //   1236: dup2_x1
    //   1237: pop2
    //   1238: iconst_2
    //   1239: anewarray java/lang/Object
    //   1242: dup_x1
    //   1243: swap
    //   1244: iconst_1
    //   1245: swap
    //   1246: aastore
    //   1247: dup_x2
    //   1248: dup_x2
    //   1249: pop
    //   1250: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1253: iconst_0
    //   1254: swap
    //   1255: aastore
    //   1256: invokestatic Vulcan_q : ([Ljava/lang/Object;)Ljava/lang/String;
    //   1259: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;)V
    //   1262: goto -> 1269
    //   1265: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1268: athrow
    //   1269: aload_0
    //   1270: iconst_0
    //   1271: putfield Vulcan_SU : I
    //   1274: aload_0
    //   1275: dconst_0
    //   1276: putfield Vulcan_kU : D
    //   1279: lload_2
    //   1280: lconst_0
    //   1281: lcmp
    //   1282: ifle -> 1290
    //   1285: aload #8
    //   1287: ifnonnull -> 1330
    //   1290: aload_0
    //   1291: aload #8
    //   1293: ifnull -> 1319
    //   1296: goto -> 1303
    //   1299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1302: athrow
    //   1303: getfield Vulcan_kU : D
    //   1306: dconst_0
    //   1307: dcmpl
    //   1308: goto -> 1315
    //   1311: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1314: athrow
    //   1315: ifle -> 1330
    //   1318: aload_0
    //   1319: dup
    //   1320: getfield Vulcan_kU : D
    //   1323: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_Gq : D
    //   1326: dsub
    //   1327: putfield Vulcan_kU : D
    //   1330: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #826	-> 39
    //   #828	-> 79
    //   #829	-> 174
    //   #831	-> 263
    //   #834	-> 347
    //   #835	-> 440
    //   #836	-> 484
    //   #838	-> 537
    //   #840	-> 626
    //   #841	-> 691
    //   #843	-> 734
    //   #844	-> 752
    //   #845	-> 772
    //   #846	-> 782
    //   #850	-> 803
    //   #852	-> 812
    //   #854	-> 832
    //   #855	-> 837
    //   #858	-> 854
    //   #859	-> 878
    //   #862	-> 927
    //   #863	-> 951
    //   #864	-> 970
    //   #865	-> 985
    //   #866	-> 1001
    //   #867	-> 1017
    //   #868	-> 1033
    //   #869	-> 1062
    //   #863	-> 1077
    //   #872	-> 1096
    //   #873	-> 1102
    //   #874	-> 1127
    //   #875	-> 1142
    //   #876	-> 1167
    //   #877	-> 1197
    //   #878	-> 1212
    //   #879	-> 1228
    //   #873	-> 1238
    //   #882	-> 1269
    //   #883	-> 1274
    //   #886	-> 1290
    //   #887	-> 1318
    //   #890	-> 1330
    // Exception table:
    //   from	to	target	type
    //   39	50	53	java/lang/RuntimeException
    //   47	68	71	java/lang/RuntimeException
    //   79	116	119	java/lang/RuntimeException
    //   94	157	160	java/lang/RuntimeException
    //   123	167	170	java/lang/RuntimeException
    //   164	186	189	java/lang/RuntimeException
    //   174	196	199	java/lang/RuntimeException
    //   193	211	214	java/lang/RuntimeException
    //   203	221	224	java/lang/RuntimeException
    //   218	245	248	java/lang/RuntimeException
    //   228	255	258	java/lang/RuntimeException
    //   347	364	367	java/lang/RuntimeException
    //   361	395	398	java/lang/RuntimeException
    //   371	405	408	java/lang/RuntimeException
    //   415	429	432	java/lang/RuntimeException
    //   426	463	466	java/lang/RuntimeException
    //   436	473	476	java/lang/RuntimeException
    //   470	508	511	java/lang/RuntimeException
    //   515	523	526	java/lang/RuntimeException
    //   537	558	561	java/lang/RuntimeException
    //   555	570	573	java/lang/RuntimeException
    //   577	585	588	java/lang/RuntimeException
    //   582	601	604	java/lang/RuntimeException
    //   592	609	612	java/lang/RuntimeException
    //   626	636	639	java/lang/RuntimeException
    //   633	650	653	java/lang/RuntimeException
    //   643	660	663	java/lang/RuntimeException
    //   657	674	677	java/lang/RuntimeException
    //   667	684	687	java/lang/RuntimeException
    //   681	717	720	java/lang/RuntimeException
    //   691	727	730	java/lang/RuntimeException
    //   737	745	748	java/lang/RuntimeException
    //   772	795	798	java/lang/RuntimeException
    //   854	871	874	java/lang/RuntimeException
    //   868	920	923	java/lang/RuntimeException
    //   930	944	947	java/lang/RuntimeException
    //   941	1089	1092	java/lang/RuntimeException
    //   1099	1262	1265	java/lang/RuntimeException
    //   1269	1296	1299	java/lang/RuntimeException
    //   1290	1308	1311	java/lang/RuntimeException
  }
  
  public void Vulcan_bk(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    WrapperPlayClientWindowConfirmation wrapperPlayClientWindowConfirmation = (WrapperPlayClientWindowConfirmation)paramArrayOfObject[1];
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = Vulcan_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.Vulcan_ko.containsKey(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()))) {
            this.Vulcan_bt = 0;
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    WrapperPlayServerPlayerAbilities wrapperPlayServerPlayerAbilities = (WrapperPlayServerPlayerAbilities)this.Vulcan_ko.get(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()));
    try {
      if (arrayOfAbstractCheck != null) {
        if (wrapperPlayServerPlayerAbilities == null)
          return; 
        this.Vulcan_SB = Vulcan_K.INSTANCE.Vulcan_W().Vulcan_I(new Object[0]);
        this.Vulcan_k1 = wrapperPlayServerPlayerAbilities.isFlightAllowed();
        this.Vulcan_SZ = wrapperPlayServerPlayerAbilities.getFlySpeed() * 2.0F;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.Vulcan_ko.remove(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()));
  }
  
  public void Vulcan_Q0(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    WrapperPlayClientPong wrapperPlayClientPong = (WrapperPlayClientPong)paramArrayOfObject[1];
    l = a ^ l;
    short s = (short)wrapperPlayClientPong.getId();
    AbstractCheck[] arrayOfAbstractCheck = Vulcan_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.Vulcan_ko.containsKey(Short.valueOf(s))) {
            this.Vulcan_bt = 0;
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    WrapperPlayServerPlayerAbilities wrapperPlayServerPlayerAbilities = (WrapperPlayServerPlayerAbilities)this.Vulcan_ko.get(Short.valueOf(s));
    try {
      if (arrayOfAbstractCheck != null) {
        if (wrapperPlayServerPlayerAbilities == null)
          return; 
        this.Vulcan_SB = Vulcan_K.INSTANCE.Vulcan_W().Vulcan_I(new Object[0]);
        this.Vulcan_k1 = wrapperPlayServerPlayerAbilities.isFlightAllowed();
        this.Vulcan_SZ = wrapperPlayServerPlayerAbilities.getFlySpeed() * 2.0F;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.Vulcan_ko.remove(Short.valueOf(s));
  }
  
  public void Vulcan_wP(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerPlayerAbilities
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: aload_0
    //   27: dup
    //   28: getfield Vulcan_M : S
    //   31: iconst_1
    //   32: iadd
    //   33: i2s
    //   34: putfield Vulcan_M : S
    //   37: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   40: aload_0
    //   41: dup
    //   42: getfield Vulcan_J : S
    //   45: iconst_1
    //   46: iadd
    //   47: i2s
    //   48: putfield Vulcan_J : S
    //   51: astore #5
    //   53: aload_0
    //   54: getfield Vulcan_M : S
    //   57: sipush #-29769
    //   60: aload #5
    //   62: ifnull -> 114
    //   65: if_icmple -> 89
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: aload_0
    //   76: sipush #-30768
    //   79: putfield Vulcan_M : S
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_0
    //   90: getfield Vulcan_J : S
    //   93: lload_2
    //   94: lconst_0
    //   95: lcmp
    //   96: ifle -> 138
    //   99: aload #5
    //   101: ifnull -> 138
    //   104: sipush #-29769
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: if_icmple -> 131
    //   117: aload_0
    //   118: sipush #-30768
    //   121: putfield Vulcan_J : S
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokestatic Vulcan_l : ([Ljava/lang/Object;)Z
    //   138: ifeq -> 182
    //   141: aload_0
    //   142: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   145: aload_0
    //   146: getfield Vulcan_J : S
    //   149: iconst_1
    //   150: anewarray java/lang/Object
    //   153: dup_x1
    //   154: swap
    //   155: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   158: iconst_0
    //   159: swap
    //   160: aastore
    //   161: invokevirtual Vulcan_P : ([Ljava/lang/Object;)V
    //   164: aload #5
    //   166: lload_2
    //   167: lconst_0
    //   168: lcmp
    //   169: ifle -> 230
    //   172: ifnonnull -> 212
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   181: athrow
    //   182: aload_0
    //   183: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   186: aload_0
    //   187: getfield Vulcan_M : S
    //   190: iconst_1
    //   191: anewarray java/lang/Object
    //   194: dup_x1
    //   195: swap
    //   196: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   199: iconst_0
    //   200: swap
    //   201: aastore
    //   202: invokevirtual Vulcan_S : ([Ljava/lang/Object;)V
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_0
    //   213: getfield Vulcan_ko : Ljava/util/Map;
    //   216: aload_0
    //   217: getfield Vulcan_M : S
    //   220: invokestatic valueOf : (S)Ljava/lang/Short;
    //   223: aload #4
    //   225: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   230: pop
    //   231: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #929	-> 26
    //   #930	-> 40
    //   #932	-> 53
    //   #933	-> 75
    //   #936	-> 89
    //   #937	-> 117
    //   #940	-> 131
    //   #941	-> 141
    //   #943	-> 182
    //   #946	-> 212
    //   #947	-> 231
    // Exception table:
    //   from	to	target	type
    //   53	68	71	java/lang/RuntimeException
    //   65	82	85	java/lang/RuntimeException
    //   89	107	110	java/lang/RuntimeException
    //   114	124	127	java/lang/RuntimeException
    //   138	175	178	java/lang/RuntimeException
    //   141	205	208	java/lang/RuntimeException
  }
  
  public boolean Vulcan_U(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   21: astore #4
    //   23: iconst_0
    //   24: anewarray java/lang/Object
    //   27: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   30: ifeq -> 156
    //   33: aload_0
    //   34: getfield Vulcan_p : Ljava/util/List;
    //   37: lload_2
    //   38: lconst_0
    //   39: lcmp
    //   40: iflt -> 76
    //   43: aload #4
    //   45: ifnull -> 76
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: ifnull -> 154
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: aload_0
    //   66: getfield Vulcan_p : Ljava/util/List;
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: invokeinterface isEmpty : ()Z
    //   81: aload #4
    //   83: lload_2
    //   84: lconst_0
    //   85: lcmp
    //   86: ifle -> 137
    //   89: ifnull -> 135
    //   92: ifne -> 154
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: aload_0
    //   103: getfield Vulcan_p : Ljava/util/List;
    //   106: bipush #16
    //   108: invokeinterface get : (I)Ljava/lang/Object;
    //   113: checkcast org/bukkit/Material
    //   116: iconst_1
    //   117: anewarray java/lang/Object
    //   120: dup_x1
    //   121: swap
    //   122: iconst_0
    //   123: swap
    //   124: aastore
    //   125: invokestatic Vulcan_s : ([Ljava/lang/Object;)Z
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: aload #4
    //   137: ifnull -> 151
    //   140: ifeq -> 154
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: iconst_1
    //   151: goto -> 155
    //   154: iconst_0
    //   155: ireturn
    //   156: aload_0
    //   157: getfield Vulcan_S5 : Ljava/util/List;
    //   160: lload_2
    //   161: lconst_0
    //   162: lcmp
    //   163: ifle -> 192
    //   166: aload #4
    //   168: ifnull -> 192
    //   171: ifnull -> 270
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload_0
    //   182: getfield Vulcan_S5 : Ljava/util/List;
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: invokeinterface isEmpty : ()Z
    //   197: aload #4
    //   199: lload_2
    //   200: lconst_0
    //   201: lcmp
    //   202: ifle -> 253
    //   205: ifnull -> 251
    //   208: ifne -> 270
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload_0
    //   219: getfield Vulcan_S5 : Ljava/util/List;
    //   222: bipush #16
    //   224: invokeinterface get : (I)Ljava/lang/Object;
    //   229: checkcast org/bukkit/Material
    //   232: iconst_1
    //   233: anewarray java/lang/Object
    //   236: dup_x1
    //   237: swap
    //   238: iconst_0
    //   239: swap
    //   240: aastore
    //   241: invokestatic Vulcan_s : ([Ljava/lang/Object;)Z
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: aload #4
    //   253: ifnull -> 267
    //   256: ifeq -> 270
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: iconst_1
    //   267: goto -> 271
    //   270: iconst_0
    //   271: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #950	-> 23
    //   #951	-> 33
    //   #953	-> 156
    // Exception table:
    //   from	to	target	type
    //   23	48	51	java/lang/RuntimeException
    //   33	58	61	java/lang/RuntimeException
    //   55	69	72	java/lang/RuntimeException
    //   76	95	98	java/lang/RuntimeException
    //   92	128	131	java/lang/RuntimeException
    //   135	143	146	java/lang/RuntimeException
    //   156	174	177	java/lang/RuntimeException
    //   171	185	188	java/lang/RuntimeException
    //   192	211	214	java/lang/RuntimeException
    //   208	244	247	java/lang/RuntimeException
    //   251	259	262	java/lang/RuntimeException
  }
  
  public boolean Vulcan_CM(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   21: astore #4
    //   23: iconst_0
    //   24: anewarray java/lang/Object
    //   27: invokestatic Vulcan_Q : ([Ljava/lang/Object;)Z
    //   30: ifeq -> 156
    //   33: aload_0
    //   34: getfield Vulcan_p : Ljava/util/List;
    //   37: lload_2
    //   38: lconst_0
    //   39: lcmp
    //   40: ifle -> 76
    //   43: aload #4
    //   45: ifnull -> 76
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: ifnull -> 154
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: aload_0
    //   66: getfield Vulcan_p : Ljava/util/List;
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: invokeinterface isEmpty : ()Z
    //   81: aload #4
    //   83: lload_2
    //   84: lconst_0
    //   85: lcmp
    //   86: ifle -> 137
    //   89: ifnull -> 135
    //   92: ifne -> 154
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: aload_0
    //   103: getfield Vulcan_p : Ljava/util/List;
    //   106: bipush #16
    //   108: invokeinterface get : (I)Ljava/lang/Object;
    //   113: checkcast org/bukkit/Material
    //   116: iconst_1
    //   117: anewarray java/lang/Object
    //   120: dup_x1
    //   121: swap
    //   122: iconst_0
    //   123: swap
    //   124: aastore
    //   125: invokestatic Vulcan_I : ([Ljava/lang/Object;)Z
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: aload #4
    //   137: ifnull -> 151
    //   140: ifeq -> 154
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: iconst_1
    //   151: goto -> 155
    //   154: iconst_0
    //   155: ireturn
    //   156: aload_0
    //   157: getfield Vulcan_S5 : Ljava/util/List;
    //   160: lload_2
    //   161: lconst_0
    //   162: lcmp
    //   163: ifle -> 192
    //   166: aload #4
    //   168: ifnull -> 192
    //   171: ifnull -> 270
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload_0
    //   182: getfield Vulcan_S5 : Ljava/util/List;
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: invokeinterface isEmpty : ()Z
    //   197: aload #4
    //   199: lload_2
    //   200: lconst_0
    //   201: lcmp
    //   202: iflt -> 253
    //   205: ifnull -> 251
    //   208: ifne -> 270
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload_0
    //   219: getfield Vulcan_S5 : Ljava/util/List;
    //   222: bipush #16
    //   224: invokeinterface get : (I)Ljava/lang/Object;
    //   229: checkcast org/bukkit/Material
    //   232: iconst_1
    //   233: anewarray java/lang/Object
    //   236: dup_x1
    //   237: swap
    //   238: iconst_0
    //   239: swap
    //   240: aastore
    //   241: invokestatic Vulcan_I : ([Ljava/lang/Object;)Z
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: aload #4
    //   253: ifnull -> 267
    //   256: ifeq -> 270
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: iconst_1
    //   267: goto -> 271
    //   270: iconst_0
    //   271: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #958	-> 23
    //   #959	-> 33
    //   #961	-> 156
    // Exception table:
    //   from	to	target	type
    //   23	48	51	java/lang/RuntimeException
    //   33	58	61	java/lang/RuntimeException
    //   55	69	72	java/lang/RuntimeException
    //   76	95	98	java/lang/RuntimeException
    //   92	128	131	java/lang/RuntimeException
    //   135	143	146	java/lang/RuntimeException
    //   156	174	177	java/lang/RuntimeException
    //   171	185	188	java/lang/RuntimeException
    //   192	211	214	java/lang/RuntimeException
    //   208	244	247	java/lang/RuntimeException
    //   251	259	262	java/lang/RuntimeException
  }
  
  public void Vulcan_ty(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   21: astore #4
    //   23: aload_0
    //   24: aload #4
    //   26: ifnull -> 77
    //   29: getfield Vulcan_bh : D
    //   32: aload_0
    //   33: getfield Vulcan_bu : D
    //   36: dcmpg
    //   37: ifge -> 71
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: lload_2
    //   48: lconst_0
    //   49: lcmp
    //   50: ifle -> 76
    //   53: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yt : Z
    //   56: ifeq -> 71
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: return
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: aload_0
    //   72: iconst_0
    //   73: putfield Vulcan_bR : I
    //   76: aload_0
    //   77: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   80: iconst_1
    //   81: iconst_1
    //   82: anewarray java/lang/Object
    //   85: dup_x1
    //   86: swap
    //   87: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   90: iconst_0
    //   91: swap
    //   92: aastore
    //   93: invokevirtual Vulcan_U : ([Ljava/lang/Object;)V
    //   96: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #967	-> 23
    //   #969	-> 71
    //   #971	-> 76
    //   #972	-> 96
    // Exception table:
    //   from	to	target	type
    //   23	40	43	java/lang/RuntimeException
    //   29	59	62	java/lang/RuntimeException
    //   47	67	67	java/lang/RuntimeException
  }
  
  public void Vulcan_tw(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/vulcan/spigot/Vulcan_Ke.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: lload_2
    //   19: dup2
    //   20: ldc2_w 110771696318497
    //   23: lxor
    //   24: lstore #4
    //   26: pop2
    //   27: invokestatic Vulcan_P : ()[Lme/frep/vulcan/spigot/check/AbstractCheck;
    //   30: astore #6
    //   32: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_MA : Z
    //   35: aload #6
    //   37: ifnull -> 154
    //   40: ifne -> 51
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   49: athrow
    //   50: return
    //   51: aload_0
    //   52: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   55: iconst_0
    //   56: anewarray java/lang/Object
    //   59: invokevirtual Vulcan_K : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_X;
    //   62: bipush #10
    //   64: anewarray me/frep/vulcan/spigot/Vulcan_h3
    //   67: dup
    //   68: iconst_0
    //   69: getstatic me/frep/vulcan/spigot/Vulcan_h3.JOINED : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   72: aastore
    //   73: dup
    //   74: iconst_1
    //   75: getstatic me/frep/vulcan/spigot/Vulcan_h3.TELEPORT : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   78: aastore
    //   79: dup
    //   80: iconst_2
    //   81: getstatic me/frep/vulcan/spigot/Vulcan_h3.WORLD_CHANGE : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   84: aastore
    //   85: dup
    //   86: iconst_3
    //   87: getstatic me/frep/vulcan/spigot/Vulcan_h3.LIQUID : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   90: aastore
    //   91: dup
    //   92: iconst_4
    //   93: getstatic me/frep/vulcan/spigot/Vulcan_h3.CHUNK : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   96: aastore
    //   97: dup
    //   98: iconst_5
    //   99: getstatic me/frep/vulcan/spigot/Vulcan_h3.WORLD_CHANGE : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   102: aastore
    //   103: dup
    //   104: bipush #6
    //   106: getstatic me/frep/vulcan/spigot/Vulcan_h3.FLIGHT : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   109: aastore
    //   110: dup
    //   111: bipush #7
    //   113: getstatic me/frep/vulcan/spigot/Vulcan_h3.ELYTRA : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   116: aastore
    //   117: dup
    //   118: bipush #8
    //   120: getstatic me/frep/vulcan/spigot/Vulcan_h3.GLIDING : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   123: aastore
    //   124: dup
    //   125: bipush #9
    //   127: getstatic me/frep/vulcan/spigot/Vulcan_h3.SLOW_FALLING : Lme/frep/vulcan/spigot/Vulcan_h3;
    //   130: aastore
    //   131: lload #4
    //   133: iconst_2
    //   134: anewarray java/lang/Object
    //   137: dup_x2
    //   138: dup_x2
    //   139: pop
    //   140: invokestatic valueOf : (J)Ljava/lang/Long;
    //   143: iconst_1
    //   144: swap
    //   145: aastore
    //   146: dup_x1
    //   147: swap
    //   148: iconst_0
    //   149: swap
    //   150: aastore
    //   151: invokevirtual Vulcan_g : ([Ljava/lang/Object;)Z
    //   154: aload #6
    //   156: ifnull -> 252
    //   159: ifne -> 251
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   168: athrow
    //   169: aload_0
    //   170: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   173: iconst_0
    //   174: anewarray java/lang/Object
    //   177: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   180: iconst_0
    //   181: anewarray java/lang/Object
    //   184: invokevirtual Vulcan_i : ([Ljava/lang/Object;)I
    //   187: aload #6
    //   189: ifnull -> 252
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   198: athrow
    //   199: bipush #20
    //   201: if_icmplt -> 251
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: aload_0
    //   212: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   215: iconst_0
    //   216: anewarray java/lang/Object
    //   219: invokevirtual Vulcan_s : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_KB;
    //   222: iconst_0
    //   223: anewarray java/lang/Object
    //   226: invokevirtual Vulcan_y : ([Ljava/lang/Object;)Z
    //   229: aload #6
    //   231: ifnull -> 252
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: ifeq -> 255
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: iconst_1
    //   252: goto -> 256
    //   255: iconst_0
    //   256: istore #7
    //   258: aload_0
    //   259: getfield Vulcan_k4 : D
    //   262: invokestatic abs : (D)D
    //   265: ldc2_w 0.09800000190734881
    //   268: dsub
    //   269: invokestatic abs : (D)D
    //   272: dstore #8
    //   274: aload_0
    //   275: getfield Vulcan_k4 : D
    //   278: ldc2_w -0.09000000357627869
    //   281: dcmpg
    //   282: aload #6
    //   284: lload_2
    //   285: lconst_0
    //   286: lcmp
    //   287: ifle -> 316
    //   290: ifnull -> 314
    //   293: ifge -> 754
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   302: athrow
    //   303: aload_0
    //   304: getfield Vulcan_bF : Z
    //   307: goto -> 314
    //   310: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   313: athrow
    //   314: aload #6
    //   316: lload_2
    //   317: lconst_0
    //   318: lcmp
    //   319: ifle -> 339
    //   322: ifnull -> 337
    //   325: ifne -> 754
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   334: athrow
    //   335: iload #7
    //   337: aload #6
    //   339: lload_2
    //   340: lconst_0
    //   341: lcmp
    //   342: iflt -> 373
    //   345: ifnull -> 371
    //   348: ifne -> 754
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   357: athrow
    //   358: dload #8
    //   360: ldc2_w 0.005
    //   363: dcmpg
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   370: athrow
    //   371: aload #6
    //   373: lload_2
    //   374: lconst_0
    //   375: lcmp
    //   376: ifle -> 417
    //   379: ifnull -> 415
    //   382: ifge -> 754
    //   385: goto -> 392
    //   388: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   391: athrow
    //   392: aload_0
    //   393: dup
    //   394: getfield Vulcan_Sv : D
    //   397: dconst_1
    //   398: dadd
    //   399: dup2_x1
    //   400: putfield Vulcan_Sv : D
    //   403: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yQ : I
    //   406: i2d
    //   407: dcmpl
    //   408: goto -> 415
    //   411: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   414: athrow
    //   415: aload #6
    //   417: ifnull -> 739
    //   420: ifle -> 714
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   429: athrow
    //   430: aload_0
    //   431: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   434: iconst_0
    //   435: anewarray java/lang/Object
    //   438: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_R;
    //   441: iconst_0
    //   442: anewarray java/lang/Object
    //   445: invokevirtual Vulcan_P : ([Ljava/lang/Object;)F
    //   448: fstore #10
    //   450: aload_0
    //   451: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   454: iconst_0
    //   455: anewarray java/lang/Object
    //   458: invokevirtual Vulcan_O : ([Ljava/lang/Object;)Lme/frep/vulcan/spigot/Vulcan_R;
    //   461: iconst_0
    //   462: anewarray java/lang/Object
    //   465: invokevirtual Vulcan_A : ([Ljava/lang/Object;)F
    //   468: fstore #11
    //   470: new org/bukkit/Location
    //   473: dup
    //   474: aload_0
    //   475: getfield Vulcan_Sp : Lorg/bukkit/World;
    //   478: aload_0
    //   479: getfield Vulcan_SY : D
    //   482: aload_0
    //   483: getfield Vulcan_bu : D
    //   486: aload_0
    //   487: getfield Vulcan_jf : D
    //   490: fload #10
    //   492: fload #11
    //   494: invokespecial <init> : (Lorg/bukkit/World;DDDFF)V
    //   497: astore #12
    //   499: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   502: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   505: invokevirtual Vulcan_j : ()Lme/frep/vulcan/spigot/VulcanPlugin;
    //   508: aload_0
    //   509: aload #12
    //   511: <illegal opcode> run : (Lme/frep/vulcan/spigot/Vulcan_Ke;Lorg/bukkit/Location;)Ljava/lang/Runnable;
    //   516: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   521: pop
    //   522: aload #6
    //   524: lload_2
    //   525: lconst_0
    //   526: lcmp
    //   527: ifle -> 711
    //   530: ifnull -> 703
    //   533: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yq : Ljava/lang/String;
    //   536: ldc_w ''
    //   539: invokevirtual equals : (Ljava/lang/Object;)Z
    //   542: ifne -> 698
    //   545: goto -> 552
    //   548: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   551: athrow
    //   552: getstatic me/frep/vulcan/spigot/Vulcan_K.INSTANCE : Lme/frep/vulcan/spigot/Vulcan_K;
    //   555: invokevirtual Vulcan_l : ()Lme/frep/vulcan/spigot/Vulcan_XP;
    //   558: getstatic me/frep/vulcan/spigot/Vulcan_b0.Vulcan_yq : Ljava/lang/String;
    //   561: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   564: bipush #7
    //   566: aaload
    //   567: aload_0
    //   568: getfield Vulcan_f : I
    //   571: invokestatic toString : (I)Ljava/lang/String;
    //   574: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   577: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   580: bipush #6
    //   582: aaload
    //   583: aload_0
    //   584: getfield Vulcan_bL : I
    //   587: invokestatic toString : (I)Ljava/lang/String;
    //   590: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   593: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   596: iconst_1
    //   597: aaload
    //   598: aload_0
    //   599: getfield Vulcan_bp : I
    //   602: invokestatic toString : (I)Ljava/lang/String;
    //   605: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   608: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   611: bipush #8
    //   613: aaload
    //   614: aload_0
    //   615: getfield Vulcan_SU : I
    //   618: invokestatic toString : (I)Ljava/lang/String;
    //   621: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   624: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   627: bipush #10
    //   629: aaload
    //   630: aload_0
    //   631: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   634: iconst_0
    //   635: anewarray java/lang/Object
    //   638: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   641: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   646: invokeinterface getName : ()Ljava/lang/String;
    //   651: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   654: getstatic me/frep/vulcan/spigot/Vulcan_Ke.b : [Ljava/lang/String;
    //   657: bipush #13
    //   659: aaload
    //   660: aload_0
    //   661: getfield Vulcan_bP : Lme/frep/vulcan/spigot/Vulcan_hu;
    //   664: iconst_0
    //   665: anewarray java/lang/Object
    //   668: invokevirtual Vulcan_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   671: invokeinterface getName : ()Ljava/lang/String;
    //   676: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   679: iconst_1
    //   680: anewarray java/lang/Object
    //   683: dup_x1
    //   684: swap
    //   685: iconst_0
    //   686: swap
    //   687: aastore
    //   688: invokevirtual Vulcan_H : ([Ljava/lang/Object;)V
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   697: athrow
    //   698: aload_0
    //   699: dconst_0
    //   700: putfield Vulcan_Sv : D
    //   703: lload_2
    //   704: lconst_0
    //   705: lcmp
    //   706: ifle -> 714
    //   709: aload #6
    //   711: ifnonnull -> 754
    //   714: aload_0
    //   715: aload #6
    //   717: ifnull -> 743
    //   720: goto -> 727
    //   723: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   726: athrow
    //   727: getfield Vulcan_Sv : D
    //   730: dconst_0
    //   731: dcmpl
    //   732: goto -> 739
    //   735: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   738: athrow
    //   739: ifle -> 754
    //   742: aload_0
    //   743: dup
    //   744: getfield Vulcan_Sv : D
    //   747: ldc2_w 0.025
    //   750: dsub
    //   751: putfield Vulcan_Sv : D
    //   754: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #975	-> 32
    //   #977	-> 51
    //   #979	-> 173
    //   #981	-> 258
    //   #983	-> 274
    //   #984	-> 392
    //   #985	-> 430
    //   #986	-> 450
    //   #987	-> 470
    //   #989	-> 499
    //   #993	-> 522
    //   #994	-> 552
    //   #995	-> 571
    //   #996	-> 587
    //   #997	-> 602
    //   #998	-> 618
    //   #999	-> 634
    //   #1000	-> 664
    //   #994	-> 679
    //   #1003	-> 698
    //   #1004	-> 703
    //   #1005	-> 714
    //   #1008	-> 754
    // Exception table:
    //   from	to	target	type
    //   32	43	46	java/lang/RuntimeException
    //   154	162	165	java/lang/RuntimeException
    //   159	192	195	java/lang/RuntimeException
    //   169	204	207	java/lang/RuntimeException
    //   199	234	237	java/lang/RuntimeException
    //   211	244	247	java/lang/RuntimeException
    //   274	296	299	java/lang/RuntimeException
    //   293	307	310	java/lang/RuntimeException
    //   314	328	331	java/lang/RuntimeException
    //   337	351	354	java/lang/RuntimeException
    //   348	364	367	java/lang/RuntimeException
    //   371	385	388	java/lang/RuntimeException
    //   382	408	411	java/lang/RuntimeException
    //   415	423	426	java/lang/RuntimeException
    //   499	545	548	java/lang/RuntimeException
    //   533	691	694	java/lang/RuntimeException
    //   703	720	723	java/lang/RuntimeException
    //   714	732	735	java/lang/RuntimeException
  }
  
  private void lambda$handleUnloadedChunk$0(Location paramLocation) {
    this.Vulcan_bP.Vulcan_L(new Object[0]).teleport(paramLocation, PlayerTeleportEvent.TeleportCause.UNKNOWN);
  }
  
  public static void Vulcan_Q(AbstractCheck[] paramArrayOfAbstractCheck) {
    Vulcan_S3 = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] Vulcan_P() {
    return Vulcan_S3;
  }
  
  static {
    long l = a ^ 0x627BAC717E63L;
    Vulcan_Q(new AbstractCheck[1]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[17];
    boolean bool = false;
    String str;
    int i = (str = "ßyü½_w$óH=Ñ¾Wj'\bùæ¾|RÑ_¤\020ßyü½_w$óH=Ñ¾Wj'\bê#«Øà\rýý\020\013ydk\020&;\033'\\\036A3\020[Â®¸à¡]$3¹Yqk!Ð\bê#«Øà\rýý\bÉwUþÚ3\b´\0242A\0334ø\bÝ2'Q=\021ú_\bÝ2'Q=\021ú_\b\003+\004V¹\003î\bÉwUþÚ3\020\013ydk\020&;\033'\\\036A3\b´\0242A\0334ø").length();
    byte b2 = 16;
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
