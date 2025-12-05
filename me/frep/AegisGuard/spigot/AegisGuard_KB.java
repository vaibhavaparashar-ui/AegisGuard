package me.frep.aegisguard.spigot.AegisGuard_KB;

import com.github.retrooper.packetevents.protocol.entity.pose.EntityPose;
import com.github.retrooper.packetevents.util.Vector3d;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPong;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientWindowConfirmation;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerAbilities;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerPositionAndLook;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateAttributes;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_Ke;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hg;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.GameMode;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class aegisguard_KB {
  private final aegisguard_hu aegisguard_D;
  
  private boolean aegisguard_N;
  
  private boolean aegisguard_X;
  
  private boolean aegisguard_hb;
  
  private boolean aegisguard_Om;
  
  private boolean aegisguard_U;
  
  private boolean aegisguard_OM;
  
  private boolean aegisguard_g;
  
  private boolean aegisguard_ht;
  
  private boolean aegisguard_OS;
  
  private boolean aegisguard_h4;
  
  private boolean aegisguard_hk;
  
  private boolean aegisguard_O2;
  
  private boolean aegisguard_hO;
  
  private boolean aegisguard_hg;
  
  private boolean aegisguard_On;
  
  private boolean aegisguard_V;
  
  private boolean aegisguard_O5;
  
  private boolean aegisguard_hG;
  
  private boolean aegisguard_F;
  
  private boolean aegisguard_hi;
  
  private boolean aegisguard_j;
  
  private boolean aegisguard_l;
  
  private boolean aegisguard_OW;
  
  private boolean aegisguard_hC;
  
  private boolean aegisguard_hn;
  
  private boolean aegisguard_h5;
  
  private boolean aegisguard_hF;
  
  private boolean aegisguard_hL;
  
  private boolean aegisguard_Ok;
  
  private boolean aegisguard_h;
  
  private boolean aegisguard_hf;
  
  private boolean aegisguard_hv;
  
  private boolean aegisguard_a;
  
  public void aegisguard_wQ(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_w1(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wa(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wL(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wz(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wB(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wr(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wM(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wd(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_w8(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wR(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_t(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_ws(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_R(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wi(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_e(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wv(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wq(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_w(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_v(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wV(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wk(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_w5(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wX(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_C(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_ww(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_r(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_we(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_w4(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wP(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_q(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wl(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_wH(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public void aegisguard_T6(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_Tj(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_Mx(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mh(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MI(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mv(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_n(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MF(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_i(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_o(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_J(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MQ(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MB(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Md(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M2(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mf(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_My(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mg(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_u(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_G(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mu(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M5(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Z(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Me(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MR(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_p(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_ML(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M9(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M3(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M7(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M6(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_D(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mc(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mo(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MO(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M4(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MP(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MG(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M1(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Ma(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_ME(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mz(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Q(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mn(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_y(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MA(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MK(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_m(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_f(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MN(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mk(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MM(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M0(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Ms(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mt(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_k(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mi(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Ml(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mm(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MC(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Y(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_L(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MW(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MJ(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MY(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_g(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MV(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mp(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MT(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MZ(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_h(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MH(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_M8(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mb(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MD(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_F(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mq(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mw(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_O(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MS(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mr(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MU(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Mj(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_MX(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_TQ(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_TE(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_TX(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_T4(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_X(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_TI(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_T8(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_a(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_T_(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_T(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_TO(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_s(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_Tg(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_Th(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_K(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_Tp(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_Tl(Object[] paramArrayOfObject) {
    double d = ((Double)paramArrayOfObject[0]).doubleValue();
  }
  
  public void aegisguard_Xc(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_I(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_Xk(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_Uc(Object[] paramArrayOfObject) {
    GameMode gameMode = (GameMode)paramArrayOfObject[0];
  }
  
  public void aegisguard_AI(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Ak(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_AD(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_Aq(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_A8(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_AS(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_AW(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_A_(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_A(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_AN(Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
  }
  
  public void aegisguard_ES(Object[] paramArrayOfObject) {
    ItemStack itemStack = (ItemStack)paramArrayOfObject[0];
  }
  
  public void aegisguard_EP(Object[] paramArrayOfObject) {
    ItemStack itemStack = (ItemStack)paramArrayOfObject[0];
  }
  
  public void aegisguard__(Object[] paramArrayOfObject) {
    ItemStack itemStack = (ItemStack)paramArrayOfObject[0];
  }
  
  public void aegisguard_EX(Object[] paramArrayOfObject) {
    ItemStack itemStack = (ItemStack)paramArrayOfObject[0];
  }
  
  public void aegisguard_b(Object[] paramArrayOfObject) {
    EntityPose entityPose = (EntityPose)paramArrayOfObject[0];
  }
  
  public void aegisguard_EU(Object[] paramArrayOfObject) {
    ItemStack itemStack = (ItemStack)paramArrayOfObject[0];
  }
  
  public void aegisguard_Eu(Object[] paramArrayOfObject) {
    ItemStack itemStack = (ItemStack)paramArrayOfObject[0];
  }
  
  public void aegisguard_Xp(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public void aegisguard_XJ(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
  }
  
  public aegisguard_hu aegisguard_U(Object[] paramArrayOfObject) {
    return this.aegisguard_D;
  }
  
  public boolean aegisguard_I(Object[] paramArrayOfObject) {
    return this.aegisguard_N;
  }
  
  public boolean aegisguard_C(Object[] paramArrayOfObject) {
    return this.aegisguard_X;
  }
  
  public boolean aegisguard_r(Object[] paramArrayOfObject) {
    return this.aegisguard_hb;
  }
  
  public boolean aegisguard_u(Object[] paramArrayOfObject) {
    return this.aegisguard_Om;
  }
  
  public boolean aegisguard_h(Object[] paramArrayOfObject) {
    return this.aegisguard_U;
  }
  
  public boolean aegisguard_j(Object[] paramArrayOfObject) {
    return this.aegisguard_OM;
  }
  
  public boolean aegisguard_k(Object[] paramArrayOfObject) {
    return this.aegisguard_g;
  }
  
  public boolean aegisguard_d(Object[] paramArrayOfObject) {
    return this.aegisguard_ht;
  }
  
  public boolean aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_OS;
  }
  
  public boolean aegisguard_W(Object[] paramArrayOfObject) {
    return this.aegisguard_h4;
  }
  
  public boolean aegisguard_n(Object[] paramArrayOfObject) {
    return this.aegisguard_hk;
  }
  
  public boolean aegisguard_E(Object[] paramArrayOfObject) {
    return this.aegisguard_O2;
  }
  
  public boolean aegisguard_g(Object[] paramArrayOfObject) {
    return this.aegisguard_hO;
  }
  
  public boolean aegisguard_A(Object[] paramArrayOfObject) {
    return this.aegisguard_hg;
  }
  
  public boolean aegisguard_t(Object[] paramArrayOfObject) {
    return this.aegisguard_On;
  }
  
  public boolean aegisguard_T(Object[] paramArrayOfObject) {
    return this.aegisguard_V;
  }
  
  public boolean aegisguard_Z(Object[] paramArrayOfObject) {
    return this.aegisguard_O5;
  }
  
  public boolean aegisguard_P(Object[] paramArrayOfObject) {
    return this.aegisguard_hG;
  }
  
  public boolean aegisguard_e(Object[] paramArrayOfObject) {
    return this.aegisguard_F;
  }
  
  public boolean aegisguard_s(Object[] paramArrayOfObject) {
    return this.aegisguard_hi;
  }
  
  public boolean aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_j;
  }
  
  public boolean aegisguard_G(Object[] paramArrayOfObject) {
    return this.aegisguard_l;
  }
  
  public boolean aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard_OW;
  }
  
  public boolean aegisguard_N(Object[] paramArrayOfObject) {
    return this.aegisguard_hC;
  }
  
  public boolean aegisguard_a(Object[] paramArrayOfObject) {
    return this.aegisguard_hn;
  }
  
  public boolean aegisguard_i(Object[] paramArrayOfObject) {
    return this.aegisguard_h5;
  }
  
  public boolean aegisguard_p(Object[] paramArrayOfObject) {
    return this.aegisguard_hF;
  }
  
  public boolean aegisguard_V(Object[] paramArrayOfObject) {
    return this.aegisguard_hL;
  }
  
  public boolean aegisguard_w(Object[] paramArrayOfObject) {
    return this.aegisguard_Ok;
  }
  
  public boolean aegisguard_J(Object[] paramArrayOfObject) {
    return this.aegisguard_h;
  }
  
  public boolean aegisguard_D(Object[] paramArrayOfObject) {
    return this.aegisguard_hf;
  }
  
  public boolean aegisguard_m(Object[] paramArrayOfObject) {
    return this.aegisguard_hv;
  }
  
  public boolean aegisguard_F(Object[] paramArrayOfObject) {
    return this.aegisguard_a;
  }
  
  private double aegisguard_Os = 0.1D;
  
  private double aegisguard_O3 = 0.6D;
  
  private boolean aegisguard_L;
  
  private int aegisguard_q;
  
  private int aegisguard__;
  
  private int aegisguard_Ox;
  
  private int aegisguard_Ou;
  
  public double aegisguard_v(Object[] paramArrayOfObject) {
    return this.aegisguard_Os;
  }
  
  public double aegisguard_F(Object[] paramArrayOfObject) {
    return this.aegisguard_O3;
  }
  
  public void aegisguard_wO(Object[] paramArrayOfObject) {
    boolean bool = ((Boolean)paramArrayOfObject[0]).booleanValue();
  }
  
  public boolean aegisguard_v(Object[] paramArrayOfObject) {
    return this.aegisguard_L;
  }
  
  private int aegisguard_hV = 0;
  
  private int aegisguard_P;
  
  private int aegisguard_hc;
  
  private int aegisguard_OQ;
  
  private int aegisguard_C;
  
  private int aegisguard_hp;
  
  private int aegisguard_Oa = 100;
  
  private int aegisguard_K = 1000;
  
  private int aegisguard_r;
  
  private int aegisguard_n;
  
  private int aegisguard_hj;
  
  private int aegisguard_Ow;
  
  private int aegisguard_hq;
  
  private int aegisguard_A;
  
  private int aegisguard_OI = 100;
  
  private int aegisguard_hS;
  
  private int aegisguard_O1;
  
  private int aegisguard_Of;
  
  private int aegisguard_O0;
  
  private int aegisguard_hI;
  
  private int aegisguard_hH = 100;
  
  private int aegisguard_b = 100;
  
  private int aegisguard_hU = 100;
  
  private int aegisguard_h9;
  
  private int aegisguard_hJ;
  
  private int aegisguard_hw;
  
  private int aegisguard_e;
  
  private int aegisguard_O_;
  
  private int aegisguard_G;
  
  private int aegisguard_p = 100;
  
  private int aegisguard_Z = 100;
  
  private int aegisguard_ho = 100;
  
  private int aegisguard_ON = 100;
  
  private int aegisguard_d = 150;
  
  private int aegisguard_hP = 100;
  
  private int aegisguard_OH = 100;
  
  private int aegisguard_Y;
  
  private int aegisguard_OC = 100;
  
  private int aegisguard_hN = 100;
  
  private int aegisguard_B = 100;
  
  private int aegisguard_O;
  
  private int aegisguard_O6;
  
  private int aegisguard_OD;
  
  private int aegisguard_Oe;
  
  private int aegisguard_hx;
  
  private int aegisguard_OT;
  
  private int aegisguard_hD = 100;
  
  private int aegisguard_Or = 100;
  
  private int aegisguard_hM = 0;
  
  private int aegisguard_o = 0;
  
  private int aegisguard_Oi = 0;
  
  private int aegisguard_y = 0;
  
  private int aegisguard_OV = 0;
  
  private int aegisguard_O4 = 100;
  
  private int aegisguard_z = 100;
  
  private int aegisguard_s = 100;
  
  private int aegisguard_O8 = 100;
  
  private int aegisguard_OY = 100;
  
  private int aegisguard_Oz = 100;
  
  private int aegisguard_h2 = 100;
  
  private int aegisguard_v = 0;
  
  private int aegisguard_k;
  
  private int aegisguard_hK = 0;
  
  private int aegisguard_OG = 100;
  
  private int aegisguard_J = 500;
  
  private int aegisguard_hd = 1000;
  
  private int aegisguard_h8 = 1000;
  
  private int aegisguard_OF = 100;
  
  private int aegisguard_hQ = 100;
  
  private int aegisguard_h1 = 100;
  
  private int aegisguard_hm = 100;
  
  private int aegisguard_M = 100;
  
  private int aegisguard_OP = 100;
  
  private int aegisguard_Oy = 100;
  
  private int aegisguard_he = 0;
  
  private int aegisguard_Oo = 0;
  
  private int aegisguard_hB = 0;
  
  private int aegisguard_hT = 100;
  
  private int aegisguard_Oj = 100;
  
  private double aegisguard_hE;
  
  private double aegisguard_i;
  
  private double aegisguard_OA;
  
  private double aegisguard_OK;
  
  private double aegisguard_u;
  
  private double aegisguard_hl;
  
  private double aegisguard_hZ;
  
  private double aegisguard_Oh;
  
  private double aegisguard_Oc;
  
  private double aegisguard_c;
  
  private double aegisguard_hR;
  
  private double aegisguard_f;
  
  private double aegisguard_w;
  
  private double aegisguard_OU;
  
  private double aegisguard_x;
  
  private double aegisguard_E;
  
  private double aegisguard_t;
  
  public int aegisguard_w(Object[] paramArrayOfObject) {
    return this.aegisguard_q;
  }
  
  public int aegisguard__(Object[] paramArrayOfObject) {
    return this.aegisguard__;
  }
  
  public int aegisguard_Y_(Object[] paramArrayOfObject) {
    return this.aegisguard_Ox;
  }
  
  public int aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_Ou;
  }
  
  public int aegisguard_i(Object[] paramArrayOfObject) {
    return this.aegisguard_hV;
  }
  
  public int aegisguard_L(Object[] paramArrayOfObject) {
    return this.aegisguard_P;
  }
  
  public int aegisguard_c(Object[] paramArrayOfObject) {
    return this.aegisguard_hc;
  }
  
  public int aegisguard_YG(Object[] paramArrayOfObject) {
    return this.aegisguard_OQ;
  }
  
  public int aegisguard_YK(Object[] paramArrayOfObject) {
    return this.aegisguard_C;
  }
  
  public int aegisguard_e(Object[] paramArrayOfObject) {
    return this.aegisguard_hp;
  }
  
  public int aegisguard_Ye(Object[] paramArrayOfObject) {
    return this.aegisguard_Oa;
  }
  
  public int aegisguard_Yu(Object[] paramArrayOfObject) {
    return this.aegisguard_K;
  }
  
  public int aegisguard_Yi(Object[] paramArrayOfObject) {
    return this.aegisguard_r;
  }
  
  public int aegisguard_Yn(Object[] paramArrayOfObject) {
    return this.aegisguard_n;
  }
  
  public int aegisguard_Yg(Object[] paramArrayOfObject) {
    return this.aegisguard_hj;
  }
  
  public int aegisguard_F(Object[] paramArrayOfObject) {
    return this.aegisguard_Ow;
  }
  
  public int aegisguard_M(Object[] paramArrayOfObject) {
    return this.aegisguard_hq;
  }
  
  public int aegisguard_U(Object[] paramArrayOfObject) {
    return this.aegisguard_A;
  }
  
  public int aegisguard_a(Object[] paramArrayOfObject) {
    return this.aegisguard_OI;
  }
  
  public int aegisguard_Yb(Object[] paramArrayOfObject) {
    return this.aegisguard_hS;
  }
  
  public int aegisguard_t(Object[] paramArrayOfObject) {
    return this.aegisguard_O1;
  }
  
  public int aegisguard_YE(Object[] paramArrayOfObject) {
    return this.aegisguard_Of;
  }
  
  public int aegisguard_m(Object[] paramArrayOfObject) {
    return this.aegisguard_O0;
  }
  
  public int aegisguard_W(Object[] paramArrayOfObject) {
    return this.aegisguard_hI;
  }
  
  public int aegisguard_Y5(Object[] paramArrayOfObject) {
    return this.aegisguard_hH;
  }
  
  public int aegisguard_Yv(Object[] paramArrayOfObject) {
    return this.aegisguard_b;
  }
  
  public int aegisguard_YL(Object[] paramArrayOfObject) {
    return this.aegisguard_hU;
  }
  
  public int aegisguard_g(Object[] paramArrayOfObject) {
    return this.aegisguard_h9;
  }
  
  public int aegisguard_YJ(Object[] paramArrayOfObject) {
    return this.aegisguard_hJ;
  }
  
  public int aegisguard_YY(Object[] paramArrayOfObject) {
    return this.aegisguard_hw;
  }
  
  public int aegisguard_YD(Object[] paramArrayOfObject) {
    return this.aegisguard_e;
  }
  
  public int aegisguard_Y(Object[] paramArrayOfObject) {
    return this.aegisguard_O_;
  }
  
  public int aegisguard_K(Object[] paramArrayOfObject) {
    return this.aegisguard_G;
  }
  
  public int aegisguard_Q(Object[] paramArrayOfObject) {
    return this.aegisguard_p;
  }
  
  public int aegisguard_T(Object[] paramArrayOfObject) {
    return this.aegisguard_Z;
  }
  
  public int aegisguard_Yq(Object[] paramArrayOfObject) {
    return this.aegisguard_ho;
  }
  
  public int aegisguard_Y3(Object[] paramArrayOfObject) {
    return this.aegisguard_ON;
  }
  
  public int aegisguard_V(Object[] paramArrayOfObject) {
    return this.aegisguard_d;
  }
  
  public int aegisguard_A(Object[] paramArrayOfObject) {
    return this.aegisguard_hP;
  }
  
  public int aegisguard_u(Object[] paramArrayOfObject) {
    return this.aegisguard_OH;
  }
  
  public int aegisguard_E(Object[] paramArrayOfObject) {
    return this.aegisguard_Y;
  }
  
  public int aegisguard_j(Object[] paramArrayOfObject) {
    return this.aegisguard_OC;
  }
  
  public int aegisguard_r(Object[] paramArrayOfObject) {
    return this.aegisguard_hN;
  }
  
  public int aegisguard_J(Object[] paramArrayOfObject) {
    return this.aegisguard_B;
  }
  
  public int aegisguard_G(Object[] paramArrayOfObject) {
    return this.aegisguard_O;
  }
  
  public int aegisguard_YC(Object[] paramArrayOfObject) {
    return this.aegisguard_O6;
  }
  
  public int aegisguard_s(Object[] paramArrayOfObject) {
    return this.aegisguard_OD;
  }
  
  public int aegisguard_S(Object[] paramArrayOfObject) {
    return this.aegisguard_Oe;
  }
  
  public int aegisguard_D(Object[] paramArrayOfObject) {
    return this.aegisguard_hx;
  }
  
  public int aegisguard_n(Object[] paramArrayOfObject) {
    return this.aegisguard_OT;
  }
  
  public int aegisguard_YQ(Object[] paramArrayOfObject) {
    return this.aegisguard_hD;
  }
  
  public int aegisguard_o(Object[] paramArrayOfObject) {
    return this.aegisguard_Or;
  }
  
  public int aegisguard_YS(Object[] paramArrayOfObject) {
    return this.aegisguard_hM;
  }
  
  public int aegisguard_Yz(Object[] paramArrayOfObject) {
    return this.aegisguard_o;
  }
  
  public int aegisguard_H(Object[] paramArrayOfObject) {
    return this.aegisguard_Oi;
  }
  
  public int aegisguard_x(Object[] paramArrayOfObject) {
    return this.aegisguard_y;
  }
  
  public int aegisguard_R(Object[] paramArrayOfObject) {
    return this.aegisguard_OV;
  }
  
  public int aegisguard_Yj(Object[] paramArrayOfObject) {
    return this.aegisguard_O4;
  }
  
  public int aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_z;
  }
  
  public int aegisguard_h(Object[] paramArrayOfObject) {
    return this.aegisguard_s;
  }
  
  public int aegisguard_N(Object[] paramArrayOfObject) {
    return this.aegisguard_O8;
  }
  
  public int aegisguard_f(Object[] paramArrayOfObject) {
    return this.aegisguard_OY;
  }
  
  public int aegisguard_k(Object[] paramArrayOfObject) {
    return this.aegisguard_Oz;
  }
  
  public int aegisguard_Yo(Object[] paramArrayOfObject) {
    return this.aegisguard_h2;
  }
  
  public int aegisguard_Yc(Object[] paramArrayOfObject) {
    return this.aegisguard_v;
  }
  
  public int aegisguard_p(Object[] paramArrayOfObject) {
    return this.aegisguard_k;
  }
  
  public int aegisguard_C(Object[] paramArrayOfObject) {
    return this.aegisguard_hK;
  }
  
  public int aegisguard_YT(Object[] paramArrayOfObject) {
    return this.aegisguard_OG;
  }
  
  public int aegisguard_YO(Object[] paramArrayOfObject) {
    return this.aegisguard_J;
  }
  
  public int aegisguard_X(Object[] paramArrayOfObject) {
    return this.aegisguard_hd;
  }
  
  public int aegisguard_q(Object[] paramArrayOfObject) {
    return this.aegisguard_h8;
  }
  
  public int aegisguard_z(Object[] paramArrayOfObject) {
    return this.aegisguard_OF;
  }
  
  public int aegisguard_P(Object[] paramArrayOfObject) {
    return this.aegisguard_hQ;
  }
  
  public int aegisguard_Ya(Object[] paramArrayOfObject) {
    return this.aegisguard_h1;
  }
  
  public int aegisguard_I(Object[] paramArrayOfObject) {
    return this.aegisguard_hm;
  }
  
  public int aegisguard_Z(Object[] paramArrayOfObject) {
    return this.aegisguard_M;
  }
  
  public int aegisguard_b(Object[] paramArrayOfObject) {
    return this.aegisguard_OP;
  }
  
  public int aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard_Oy;
  }
  
  public int aegisguard_Yr(Object[] paramArrayOfObject) {
    return this.aegisguard_he;
  }
  
  public int aegisguard_Y8(Object[] paramArrayOfObject) {
    return this.aegisguard_Oo;
  }
  
  public int aegisguard_d(Object[] paramArrayOfObject) {
    return this.aegisguard_hB;
  }
  
  public int aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_hT;
  }
  
  public int aegisguard_v(Object[] paramArrayOfObject) {
    return this.aegisguard_Oj;
  }
  
  public double aegisguard_I(Object[] paramArrayOfObject) {
    return this.aegisguard_hE;
  }
  
  public double aegisguard_y(Object[] paramArrayOfObject) {
    return this.aegisguard_i;
  }
  
  public double aegisguard_s(Object[] paramArrayOfObject) {
    return this.aegisguard_OA;
  }
  
  public double aegisguard_q(Object[] paramArrayOfObject) {
    return this.aegisguard_OK;
  }
  
  public double aegisguard_p(Object[] paramArrayOfObject) {
    return this.aegisguard_u;
  }
  
  public double aegisguard_b(Object[] paramArrayOfObject) {
    return this.aegisguard_hl;
  }
  
  public double aegisguard_k(Object[] paramArrayOfObject) {
    return this.aegisguard_hZ;
  }
  
  public double aegisguard_h(Object[] paramArrayOfObject) {
    return this.aegisguard_Oh;
  }
  
  public double aegisguard_T(Object[] paramArrayOfObject) {
    return this.aegisguard_Oc;
  }
  
  public double aegisguard_G(Object[] paramArrayOfObject) {
    return this.aegisguard_c;
  }
  
  public double aegisguard_B(Object[] paramArrayOfObject) {
    return this.aegisguard_hR;
  }
  
  public double aegisguard_N(Object[] paramArrayOfObject) {
    return this.aegisguard_f;
  }
  
  public double aegisguard_m(Object[] paramArrayOfObject) {
    return this.aegisguard_w;
  }
  
  public double aegisguard_V(Object[] paramArrayOfObject) {
    return this.aegisguard_OU;
  }
  
  public double aegisguard_d(Object[] paramArrayOfObject) {
    return this.aegisguard_x;
  }
  
  public double aegisguard_x(Object[] paramArrayOfObject) {
    return this.aegisguard_E;
  }
  
  public double aegisguard_j(Object[] paramArrayOfObject) {
    return this.aegisguard_t;
  }
  
  private final aegisguard_hg aegisguard_h7 = new aegisguard_hg(10);
  
  public aegisguard_hg aegisguard__(Object[] paramArrayOfObject) {
    return this.aegisguard_h7;
  }
  
  private final aegisguard_hg aegisguard_hh = new aegisguard_hg(10);
  
  private long aegisguard_OJ;
  
  private long aegisguard_R;
  
  private long aegisguard_H;
  
  public aegisguard_hg aegisguard_Q(Object[] paramArrayOfObject) {
    return this.aegisguard_hh;
  }
  
  public long aegisguard_P(Object[] paramArrayOfObject) {
    return this.aegisguard_OJ;
  }
  
  public long aegisguard_Q(Object[] paramArrayOfObject) {
    return this.aegisguard_R;
  }
  
  public long aegisguard_V(Object[] paramArrayOfObject) {
    return this.aegisguard_H;
  }
  
  private GameMode aegisguard_Ol = GameMode.SURVIVAL;
  
  public GameMode aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_Ol;
  }
  
  private short aegisguard_Ob = -29768;
  
  public short aegisguard_J(Object[] paramArrayOfObject) {
    return this.aegisguard_Ob;
  }
  
  private short aegisguard_S = -28768;
  
  public short aegisguard_F(Object[] paramArrayOfObject) {
    return this.aegisguard_S;
  }
  
  private short aegisguard_T = -27768;
  
  public short aegisguard_E(Object[] paramArrayOfObject) {
    return this.aegisguard_T;
  }
  
  private short aegisguard_hW = -26768;
  
  public short aegisguard_f(Object[] paramArrayOfObject) {
    return this.aegisguard_hW;
  }
  
  private short aegisguard_O9 = -22768;
  
  public short aegisguard_V(Object[] paramArrayOfObject) {
    return this.aegisguard_O9;
  }
  
  private short aegisguard_OR = -29768;
  
  public short aegisguard_w(Object[] paramArrayOfObject) {
    return this.aegisguard_OR;
  }
  
  private short aegisguard_OL = -28768;
  
  public short aegisguard_L(Object[] paramArrayOfObject) {
    return this.aegisguard_OL;
  }
  
  private short aegisguard_OO = -27768;
  
  public short aegisguard_r(Object[] paramArrayOfObject) {
    return this.aegisguard_OO;
  }
  
  private short aegisguard_h_ = -26768;
  
  public short aegisguard_G(Object[] paramArrayOfObject) {
    return this.aegisguard_h_;
  }
  
  private short aegisguard_Ot = -22768;
  
  public short aegisguard_h(Object[] paramArrayOfObject) {
    return this.aegisguard_Ot;
  }
  
  private final Map aegisguard_Op = new HashMap<>();
  
  public Map aegisguard_z(Object[] paramArrayOfObject) {
    return this.aegisguard_Op;
  }
  
  private final Map aegisguard_m = new HashMap<>();
  
  public Map aegisguard_l(Object[] paramArrayOfObject) {
    return this.aegisguard_m;
  }
  
  private final Map aegisguard_Oq = new HashMap<>();
  
  public Map aegisguard_v(Object[] paramArrayOfObject) {
    return this.aegisguard_Oq;
  }
  
  private final Map aegisguard_Q = new HashMap<>();
  
  public Map aegisguard_H(Object[] paramArrayOfObject) {
    return this.aegisguard_Q;
  }
  
  private final Map aegisguard_OX = new HashMap<>();
  
  private ItemStack aegisguard_OE;
  
  private ItemStack aegisguard_Ov;
  
  private ItemStack aegisguard_Og;
  
  private ItemStack aegisguard_OB;
  
  public Map aegisguard_L(Object[] paramArrayOfObject) {
    return this.aegisguard_OX;
  }
  
  public ItemStack aegisguard_V(Object[] paramArrayOfObject) {
    return this.aegisguard_OE;
  }
  
  public ItemStack aegisguard_z(Object[] paramArrayOfObject) {
    return this.aegisguard_Ov;
  }
  
  public ItemStack aegisguard_Z(Object[] paramArrayOfObject) {
    return this.aegisguard_Og;
  }
  
  public ItemStack aegisguard_H(Object[] paramArrayOfObject) {
    return this.aegisguard_OB;
  }
  
  private EntityPose aegisguard_ha = EntityPose.STANDING;
  
  private ItemStack aegisguard_hA;
  
  private ItemStack aegisguard_O7;
  
  private long aegisguard_W;
  
  private long aegisguard_I;
  
  public EntityPose aegisguard_w(Object[] paramArrayOfObject) {
    return this.aegisguard_ha;
  }
  
  public ItemStack aegisguard_O(Object[] paramArrayOfObject) {
    return this.aegisguard_hA;
  }
  
  public ItemStack aegisguard_E(Object[] paramArrayOfObject) {
    return this.aegisguard_O7;
  }
  
  public long aegisguard_J(Object[] paramArrayOfObject) {
    return this.aegisguard_W;
  }
  
  public long aegisguard_G(Object[] paramArrayOfObject) {
    return this.aegisguard_I;
  }
  
  final aegisguard_hg aegisguard_OZ = new aegisguard_hg(15);
  
  private static boolean aegisguard_Od;
  
  private static final long a = aegisguard_e.a(2044749479783320345L, -6740465961359788914L, MethodHandles.lookup().lookupClass()).a(263151509437556L);
  
  private static final String[] b;
  
  public aegisguard_hg aegisguard_Z(Object[] paramArrayOfObject) {
    return this.aegisguard_OZ;
  }
  
  public aegisguard_KB(aegisguard_hu paramaegisguard_hu) {
    this.aegisguard_D = paramaegisguard_hu;
  }
  
  public void aegisguard_j(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Integer
    //   7: invokevirtual intValue : ()I
    //   10: istore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast java/lang/Integer
    //   17: invokevirtual intValue : ()I
    //   20: istore #4
    //   22: dup
    //   23: iconst_2
    //   24: aaload
    //   25: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientEntityAction
    //   28: astore_3
    //   29: dup
    //   30: iconst_3
    //   31: aaload
    //   32: checkcast java/lang/Integer
    //   35: invokevirtual intValue : ()I
    //   38: istore #5
    //   40: pop
    //   41: iload_2
    //   42: i2l
    //   43: bipush #32
    //   45: lshl
    //   46: iload #4
    //   48: i2l
    //   49: bipush #48
    //   51: lshl
    //   52: bipush #32
    //   54: lushr
    //   55: lor
    //   56: iload #5
    //   58: i2l
    //   59: bipush #48
    //   61: lshl
    //   62: bipush #48
    //   64: lushr
    //   65: lor
    //   66: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   69: lxor
    //   70: lstore #6
    //   72: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   75: aload_0
    //   76: iconst_1
    //   77: putfield aegisguard_hb : Z
    //   80: astore #8
    //   82: aload #8
    //   84: ifnull -> 148
    //   87: getstatic me/frep/aegisguard/spigot/aegisguard_hS.aegisguard_T : [I
    //   90: aload_3
    //   91: invokevirtual getAction : ()Lcom/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientEntityAction$Action;
    //   94: invokevirtual ordinal : ()I
    //   97: iaload
    //   98: tableswitch default -> 320, 1 -> 136, 2 -> 158, 3 -> 175, 4 -> 192, 5 -> 209
    //   132: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   135: athrow
    //   136: aload_0
    //   137: iconst_1
    //   138: putfield aegisguard_N : Z
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: aload #8
    //   150: iload #5
    //   152: iflt -> 165
    //   155: ifnonnull -> 320
    //   158: aload_0
    //   159: iconst_0
    //   160: putfield aegisguard_N : Z
    //   163: aload #8
    //   165: ifnonnull -> 320
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   174: athrow
    //   175: aload_0
    //   176: iconst_1
    //   177: putfield aegisguard_X : Z
    //   180: aload #8
    //   182: ifnonnull -> 320
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: aload_0
    //   193: iconst_0
    //   194: putfield aegisguard_X : Z
    //   197: aload #8
    //   199: ifnonnull -> 320
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   208: athrow
    //   209: aload_0
    //   210: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   213: iconst_0
    //   214: anewarray java/lang/Object
    //   217: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   220: aload #8
    //   222: ifnull -> 257
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   231: athrow
    //   232: ifnonnull -> 246
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: iload_2
    //   243: ifgt -> 320
    //   246: aload_0
    //   247: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   250: iconst_0
    //   251: anewarray java/lang/Object
    //   254: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   257: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   262: invokeinterface getChestplate : ()Lorg/bukkit/inventory/ItemStack;
    //   267: astore #9
    //   269: aload #9
    //   271: iload_2
    //   272: iflt -> 292
    //   275: aload #8
    //   277: ifnull -> 292
    //   280: ifnull -> 320
    //   283: goto -> 290
    //   286: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   289: athrow
    //   290: aload #9
    //   292: invokevirtual getType : ()Lorg/bukkit/Material;
    //   295: getstatic org/bukkit/Material.ELYTRA : Lorg/bukkit/Material;
    //   298: if_acmpne -> 320
    //   301: aload_0
    //   302: iconst_1
    //   303: putfield aegisguard_l : Z
    //   306: aload_0
    //   307: getstatic com/github/retrooper/packetevents/protocol/entity/pose/EntityPose.FALL_FLYING : Lcom/github/retrooper/packetevents/protocol/entity/pose/EntityPose;
    //   310: putfield aegisguard_ha : Lcom/github/retrooper/packetevents/protocol/entity/pose/EntityPose;
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   319: athrow
    //   320: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #116	-> 75
    //   #117	-> 82
    //   #119	-> 136
    //   #120	-> 148
    //   #122	-> 158
    //   #123	-> 163
    //   #125	-> 175
    //   #126	-> 180
    //   #128	-> 192
    //   #129	-> 197
    //   #131	-> 209
    //   #133	-> 246
    //   #135	-> 269
    //   #136	-> 301
    //   #137	-> 306
    //   #142	-> 320
    // Exception table:
    //   from	to	target	type
    //   82	132	132	java/lang/RuntimeException
    //   87	141	144	java/lang/RuntimeException
    //   148	168	171	java/lang/RuntimeException
    //   158	185	188	java/lang/RuntimeException
    //   175	202	205	java/lang/RuntimeException
    //   192	225	228	java/lang/RuntimeException
    //   209	235	238	java/lang/RuntimeException
    //   269	283	286	java/lang/RuntimeException
    //   292	313	316	java/lang/RuntimeException
  }
  
  public void aegisguard_c2(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: aload #4
    //   31: invokevirtual getProperties : ()Ljava/util/List;
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #6
    //   41: astore #5
    //   43: aload #6
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 475
    //   53: aload #6
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$Property
    //   63: astore #7
    //   65: aload #7
    //   67: invokevirtual getKey : ()Ljava/lang/String;
    //   70: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   73: astore #15
    //   75: aload #15
    //   77: iconst_2
    //   78: aaload
    //   79: invokevirtual equals : (Ljava/lang/Object;)Z
    //   82: aload #5
    //   84: ifnull -> 123
    //   87: ifeq -> 106
    //   90: aload_0
    //   91: aload #7
    //   93: invokevirtual getValue : ()D
    //   96: putfield aegisguard_O3 : D
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: aload #7
    //   108: invokevirtual getKey : ()Ljava/lang/String;
    //   111: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   114: astore #15
    //   116: aload #15
    //   118: iconst_5
    //   119: aaload
    //   120: invokevirtual equals : (Ljava/lang/Object;)Z
    //   123: aload #5
    //   125: lload_2
    //   126: lconst_0
    //   127: lcmp
    //   128: iflt -> 167
    //   131: ifnull -> 165
    //   134: ifne -> 204
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: aload #7
    //   146: invokevirtual getKey : ()Ljava/lang/String;
    //   149: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   152: bipush #9
    //   154: aaload
    //   155: invokevirtual equals : (Ljava/lang/Object;)Z
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: aload #5
    //   167: ifnull -> 201
    //   170: ifne -> 204
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: aload #7
    //   182: invokevirtual getKey : ()Ljava/lang/String;
    //   185: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   188: bipush #6
    //   190: aaload
    //   191: invokevirtual equals : (Ljava/lang/Object;)Z
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: ifeq -> 470
    //   204: new java/util/ArrayList
    //   207: dup
    //   208: aload #7
    //   210: invokevirtual getModifiers : ()Ljava/util/List;
    //   213: invokespecial <init> : (Ljava/util/Collection;)V
    //   216: astore #8
    //   218: aload #8
    //   220: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   225: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   230: pop
    //   231: aload #7
    //   233: invokevirtual getValue : ()D
    //   236: dstore #9
    //   238: aload #8
    //   240: invokeinterface iterator : ()Ljava/util/Iterator;
    //   245: astore #11
    //   247: aload #11
    //   249: invokeinterface hasNext : ()Z
    //   254: ifeq -> 300
    //   257: aload #11
    //   259: invokeinterface next : ()Ljava/lang/Object;
    //   264: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier
    //   267: astore #12
    //   269: aload #12
    //   271: invokevirtual getOperation : ()Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation;
    //   274: aload #5
    //   276: ifnull -> 60
    //   279: getstatic com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation.ADDITION : Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation;
    //   282: if_acmpne -> 295
    //   285: dload #9
    //   287: aload #12
    //   289: invokevirtual getAmount : ()D
    //   292: dadd
    //   293: dstore #9
    //   295: aload #5
    //   297: ifnonnull -> 247
    //   300: dload #9
    //   302: dstore #11
    //   304: aload #8
    //   306: invokeinterface iterator : ()Ljava/util/Iterator;
    //   311: lload_2
    //   312: lconst_0
    //   313: lcmp
    //   314: iflt -> 60
    //   317: astore #13
    //   319: aload #13
    //   321: invokeinterface hasNext : ()Z
    //   326: ifeq -> 388
    //   329: aload #13
    //   331: invokeinterface next : ()Ljava/lang/Object;
    //   336: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier
    //   339: astore #14
    //   341: aload #14
    //   343: invokevirtual getOperation : ()Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation;
    //   346: getstatic com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation.MULTIPLY_BASE : Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation;
    //   349: aload #5
    //   351: lload_2
    //   352: lconst_0
    //   353: lcmp
    //   354: ifle -> 435
    //   357: ifnull -> 433
    //   360: if_acmpne -> 383
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   369: athrow
    //   370: dload #11
    //   372: dload #9
    //   374: aload #14
    //   376: invokevirtual getAmount : ()D
    //   379: dmul
    //   380: dadd
    //   381: dstore #11
    //   383: aload #5
    //   385: ifnonnull -> 319
    //   388: aload #8
    //   390: invokeinterface iterator : ()Ljava/util/Iterator;
    //   395: lload_2
    //   396: lconst_0
    //   397: lcmp
    //   398: ifle -> 336
    //   401: astore #13
    //   403: aload #13
    //   405: invokeinterface hasNext : ()Z
    //   410: ifeq -> 458
    //   413: aload #13
    //   415: invokeinterface next : ()Ljava/lang/Object;
    //   420: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier
    //   423: astore #14
    //   425: aload #14
    //   427: invokevirtual getOperation : ()Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation;
    //   430: getstatic com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation.MULTIPLY_TOTAL : Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerUpdateAttributes$PropertyModifier$Operation;
    //   433: aload #5
    //   435: ifnull -> 360
    //   438: if_acmpne -> 453
    //   441: dload #11
    //   443: dconst_1
    //   444: aload #14
    //   446: invokevirtual getAmount : ()D
    //   449: dadd
    //   450: dmul
    //   451: dstore #11
    //   453: aload #5
    //   455: ifnonnull -> 403
    //   458: aload_0
    //   459: lload_2
    //   460: lconst_0
    //   461: lcmp
    //   462: iflt -> 420
    //   465: dload #11
    //   467: putfield aegisguard_Os : D
    //   470: aload #5
    //   472: ifnonnull -> 43
    //   475: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #145	-> 29
    //   #146	-> 65
    //   #147	-> 90
    //   #150	-> 106
    //   #151	-> 146
    //   #152	-> 182
    //   #154	-> 204
    //   #155	-> 218
    //   #160	-> 231
    //   #161	-> 238
    //   #162	-> 269
    //   #163	-> 285
    //   #165	-> 295
    //   #166	-> 300
    //   #168	-> 304
    //   #169	-> 341
    //   #170	-> 370
    //   #172	-> 383
    //   #174	-> 388
    //   #175	-> 425
    //   #176	-> 441
    //   #178	-> 453
    //   #180	-> 458
    //   #182	-> 470
    //   #183	-> 475
    // Exception table:
    //   from	to	target	type
    //   87	99	102	java/lang/RuntimeException
    //   123	137	140	java/lang/RuntimeException
    //   134	158	161	java/lang/RuntimeException
    //   165	173	176	java/lang/RuntimeException
    //   170	194	197	java/lang/RuntimeException
    //   341	363	366	java/lang/RuntimeException
  }
  
  private static boolean lambda$handleUpdateAttributes$0(WrapperPlayServerUpdateAttributes.PropertyModifier paramPropertyModifier) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   3: ldc2_w 39363928819345
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   11: astore_3
    //   12: aload_0
    //   13: invokevirtual getUUID : ()Ljava/util/UUID;
    //   16: invokevirtual toString : ()Ljava/lang/String;
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   22: iconst_0
    //   23: aaload
    //   24: invokevirtual equals : (Ljava/lang/Object;)Z
    //   27: aload_3
    //   28: ifnull -> 119
    //   31: ifne -> 118
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: aload_0
    //   42: invokevirtual getUUID : ()Ljava/util/UUID;
    //   45: invokevirtual toString : ()Ljava/lang/String;
    //   48: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   51: bipush #7
    //   53: aaload
    //   54: invokevirtual equals : (Ljava/lang/Object;)Z
    //   57: aload_3
    //   58: ifnull -> 119
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: ifne -> 118
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: aload_0
    //   79: invokevirtual getName : ()Lcom/github/retrooper/packetevents/resources/ResourceLocation;
    //   82: invokevirtual toString : ()Ljava/lang/String;
    //   85: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   88: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   91: bipush #8
    //   93: aaload
    //   94: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   97: aload_3
    //   98: ifnull -> 119
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: ifeq -> 122
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: iconst_1
    //   119: goto -> 123
    //   122: iconst_0
    //   123: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #156	-> 12
    //   #157	-> 42
    //   #158	-> 79
    //   #156	-> 123
    // Exception table:
    //   from	to	target	type
    //   12	34	37	java/lang/RuntimeException
    //   31	61	64	java/lang/RuntimeException
    //   41	71	74	java/lang/RuntimeException
    //   68	101	104	java/lang/RuntimeException
    //   78	111	114	java/lang/RuntimeException
  }
  
  public void aegisguard_EL(Object[] paramArrayOfObject) {
    this.aegisguard_hj = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_V(Object[] paramArrayOfObject) {
    this.aegisguard_q = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_kb(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPlayerDigging
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: aload_0
    //   30: iconst_1
    //   31: putfield aegisguard_ht : Z
    //   34: astore #5
    //   36: aload #5
    //   38: ifnull -> 115
    //   41: getstatic me/frep/aegisguard/spigot/aegisguard_hS.aegisguard_Q : [I
    //   44: aload #4
    //   46: invokevirtual getAction : ()Lcom/github/retrooper/packetevents/protocol/player/DiggingAction;
    //   49: invokevirtual ordinal : ()I
    //   52: iaload
    //   53: tableswitch default -> 267, 1 -> 96, 2 -> 126, 3 -> 176, 4 -> 226, 5 -> 243, 6 -> 243
    //   92: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: aload_0
    //   97: iconst_1
    //   98: putfield aegisguard_U : Z
    //   101: aload_0
    //   102: invokestatic currentTimeMillis : ()J
    //   105: putfield aegisguard_OJ : J
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: aload #5
    //   117: lload_2
    //   118: lconst_0
    //   119: lcmp
    //   120: ifle -> 166
    //   123: ifnonnull -> 267
    //   126: aload_0
    //   127: invokestatic currentTimeMillis : ()J
    //   130: putfield aegisguard_R : J
    //   133: aload_0
    //   134: aload #4
    //   136: invokevirtual getBlockPosition : ()Lcom/github/retrooper/packetevents/util/Vector3i;
    //   139: invokevirtual getX : ()I
    //   142: i2d
    //   143: putfield aegisguard_hE : D
    //   146: aload_0
    //   147: aload #4
    //   149: invokevirtual getBlockPosition : ()Lcom/github/retrooper/packetevents/util/Vector3i;
    //   152: invokevirtual getZ : ()I
    //   155: i2d
    //   156: putfield aegisguard_i : D
    //   159: aload_0
    //   160: iconst_0
    //   161: putfield aegisguard_U : Z
    //   164: aload #5
    //   166: ifnonnull -> 267
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: aload_0
    //   177: invokestatic currentTimeMillis : ()J
    //   180: putfield aegisguard_H : J
    //   183: aload_0
    //   184: aload #4
    //   186: invokevirtual getBlockPosition : ()Lcom/github/retrooper/packetevents/util/Vector3i;
    //   189: invokevirtual getX : ()I
    //   192: i2d
    //   193: putfield aegisguard_hE : D
    //   196: aload_0
    //   197: aload #4
    //   199: invokevirtual getBlockPosition : ()Lcom/github/retrooper/packetevents/util/Vector3i;
    //   202: invokevirtual getZ : ()I
    //   205: i2d
    //   206: putfield aegisguard_i : D
    //   209: aload_0
    //   210: iconst_0
    //   211: putfield aegisguard_U : Z
    //   214: aload #5
    //   216: ifnonnull -> 267
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   225: athrow
    //   226: aload_0
    //   227: iconst_1
    //   228: putfield aegisguard_OM : Z
    //   231: aload #5
    //   233: ifnonnull -> 267
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: aload_0
    //   244: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   247: invokevirtual aegisguard_W : ()Lme/frep/aegisguard/spigot/aegisguard_K8;
    //   250: iconst_0
    //   251: anewarray java/lang/Object
    //   254: invokevirtual aegisguard_I : ([Ljava/lang/Object;)I
    //   257: putfield aegisguard__ : I
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   266: athrow
    //   267: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #194	-> 29
    //   #195	-> 36
    //   #197	-> 96
    //   #198	-> 101
    //   #199	-> 115
    //   #201	-> 126
    //   #202	-> 133
    //   #203	-> 146
    //   #204	-> 159
    //   #205	-> 164
    //   #207	-> 176
    //   #208	-> 183
    //   #209	-> 196
    //   #210	-> 209
    //   #211	-> 214
    //   #213	-> 226
    //   #214	-> 231
    //   #217	-> 243
    //   #220	-> 267
    // Exception table:
    //   from	to	target	type
    //   36	92	92	java/lang/RuntimeException
    //   41	108	111	java/lang/RuntimeException
    //   115	169	172	java/lang/RuntimeException
    //   126	219	222	java/lang/RuntimeException
    //   176	236	239	java/lang/RuntimeException
    //   226	260	263	java/lang/RuntimeException
  }
  
  public void aegisguard_ve(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Integer
    //   7: invokevirtual intValue : ()I
    //   10: istore_2
    //   11: dup
    //   12: iconst_1
    //   13: aaload
    //   14: checkcast org/bukkit/entity/EntityType
    //   17: astore_3
    //   18: dup
    //   19: iconst_2
    //   20: aaload
    //   21: checkcast java/lang/Integer
    //   24: invokevirtual intValue : ()I
    //   27: istore #5
    //   29: dup
    //   30: iconst_3
    //   31: aaload
    //   32: checkcast java/lang/Integer
    //   35: invokevirtual intValue : ()I
    //   38: istore #4
    //   40: pop
    //   41: iload_2
    //   42: i2l
    //   43: bipush #32
    //   45: lshl
    //   46: iload #5
    //   48: i2l
    //   49: bipush #56
    //   51: lshl
    //   52: bipush #32
    //   54: lushr
    //   55: lor
    //   56: iload #4
    //   58: i2l
    //   59: bipush #40
    //   61: lshl
    //   62: bipush #40
    //   64: lushr
    //   65: lor
    //   66: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   69: lxor
    //   70: lstore #6
    //   72: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   75: astore #8
    //   77: getstatic me/frep/aegisguard/spigot/aegisguard_hS.aegisguard_Y : [I
    //   80: aload_3
    //   81: invokevirtual ordinal : ()I
    //   84: iaload
    //   85: aload #8
    //   87: ifnull -> 245
    //   90: tableswitch default -> 238, 1 -> 140, 2 -> 162, 3 -> 184, 4 -> 184, 5 -> 184, 6 -> 205, 7 -> 205, 8 -> 226
    //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   139: athrow
    //   140: aload_0
    //   141: iconst_0
    //   142: putfield aegisguard_OI : I
    //   145: aload #8
    //   147: iload #4
    //   149: iflt -> 242
    //   152: ifnonnull -> 238
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   161: athrow
    //   162: aload_0
    //   163: iconst_0
    //   164: putfield aegisguard_O : I
    //   167: aload #8
    //   169: iload #5
    //   171: ifgt -> 242
    //   174: ifnonnull -> 238
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload_0
    //   185: iconst_0
    //   186: putfield aegisguard_Or : I
    //   189: aload #8
    //   191: iload_2
    //   192: iflt -> 242
    //   195: ifnonnull -> 238
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   204: athrow
    //   205: aload_0
    //   206: iconst_0
    //   207: putfield aegisguard_OF : I
    //   210: aload #8
    //   212: iload_2
    //   213: iflt -> 242
    //   216: ifnonnull -> 238
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   225: athrow
    //   226: aload_0
    //   227: iconst_0
    //   228: putfield aegisguard_hQ : I
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   237: athrow
    //   238: iconst_0
    //   239: anewarray java/lang/Object
    //   242: invokestatic aegisguard_f : ([Ljava/lang/Object;)Z
    //   245: iload #4
    //   247: ifle -> 298
    //   250: aload #8
    //   252: ifnull -> 298
    //   255: ifeq -> 291
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   264: athrow
    //   265: aload_3
    //   266: getstatic org/bukkit/entity/EntityType.HOGLIN : Lorg/bukkit/entity/EntityType;
    //   269: if_acmpne -> 291
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: aload_0
    //   280: iconst_0
    //   281: putfield aegisguard_k : I
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   290: athrow
    //   291: iconst_0
    //   292: anewarray java/lang/Object
    //   295: invokestatic aegisguard_v : ([Ljava/lang/Object;)Z
    //   298: ifeq -> 327
    //   301: aload_3
    //   302: getstatic org/bukkit/entity/EntityType.RAVAGER : Lorg/bukkit/entity/EntityType;
    //   305: if_acmpne -> 327
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   314: athrow
    //   315: aload_0
    //   316: iconst_0
    //   317: putfield aegisguard_h8 : I
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   326: athrow
    //   327: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #223	-> 77
    //   #225	-> 140
    //   #226	-> 145
    //   #228	-> 162
    //   #229	-> 167
    //   #233	-> 184
    //   #234	-> 189
    //   #237	-> 205
    //   #238	-> 210
    //   #240	-> 226
    //   #244	-> 238
    //   #245	-> 291
    //   #246	-> 327
    // Exception table:
    //   from	to	target	type
    //   77	136	136	java/lang/RuntimeException
    //   90	155	158	java/lang/RuntimeException
    //   140	177	180	java/lang/RuntimeException
    //   162	198	201	java/lang/RuntimeException
    //   184	219	222	java/lang/RuntimeException
    //   205	231	234	java/lang/RuntimeException
    //   245	258	261	java/lang/RuntimeException
    //   255	272	275	java/lang/RuntimeException
    //   265	284	287	java/lang/RuntimeException
    //   298	308	311	java/lang/RuntimeException
    //   301	320	323	java/lang/RuntimeException
  }
  
  public void aegisguard_EC(Object[] paramArrayOfObject) {
    this.aegisguard_hq = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
    this.aegisguard_O4 = 0;
  }
  
  public void aegisguard_P(Object[] paramArrayOfObject) {
    this.aegisguard_Ow = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_d(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientClientStatus
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: astore #5
    //   31: aload #5
    //   33: ifnull -> 92
    //   36: getstatic me/frep/aegisguard/spigot/aegisguard_hS.aegisguard_u : [I
    //   39: aload #4
    //   41: invokevirtual getAction : ()Lcom/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientClientStatus$Action;
    //   44: invokevirtual ordinal : ()I
    //   47: iaload
    //   48: lookupswitch default -> 127, 1 -> 80, 2 -> 103
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aload_0
    //   81: iconst_1
    //   82: putfield aegisguard_g : Z
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: lload_2
    //   93: lconst_0
    //   94: lcmp
    //   95: iflt -> 120
    //   98: aload #5
    //   100: ifnonnull -> 127
    //   103: aload_0
    //   104: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   107: invokevirtual aegisguard_W : ()Lme/frep/aegisguard/spigot/aegisguard_K8;
    //   110: iconst_0
    //   111: anewarray java/lang/Object
    //   114: invokevirtual aegisguard_I : ([Ljava/lang/Object;)I
    //   117: putfield aegisguard_O1 : I
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #258	-> 31
    //   #260	-> 80
    //   #261	-> 92
    //   #263	-> 103
    //   #266	-> 127
    // Exception table:
    //   from	to	target	type
    //   31	76	76	java/lang/RuntimeException
    //   36	85	88	java/lang/RuntimeException
    //   92	120	123	java/lang/RuntimeException
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
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield aegisguard_Om : Z
    //   26: astore #4
    //   28: iconst_0
    //   29: anewarray java/lang/Object
    //   32: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   35: aload #4
    //   37: ifnull -> 104
    //   40: ifeq -> 204
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   49: athrow
    //   50: aload_0
    //   51: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   54: aload #4
    //   56: ifnull -> 181
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: iconst_0
    //   67: anewarray java/lang/Object
    //   70: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   73: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   78: invokeinterface getItemInMainHand : ()Lorg/bukkit/inventory/ItemStack;
    //   83: invokevirtual getType : ()Lorg/bukkit/Material;
    //   86: invokevirtual toString : ()Ljava/lang/String;
    //   89: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   92: iconst_1
    //   93: aaload
    //   94: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: ifne -> 170
    //   107: aload_0
    //   108: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   111: aload #4
    //   113: lload_2
    //   114: lconst_0
    //   115: lcmp
    //   116: iflt -> 185
    //   119: ifnull -> 181
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   128: athrow
    //   129: iconst_0
    //   130: anewarray java/lang/Object
    //   133: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   136: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   141: invokeinterface getItemInOffHand : ()Lorg/bukkit/inventory/ItemStack;
    //   146: invokevirtual getType : ()Lorg/bukkit/Material;
    //   149: invokevirtual toString : ()Ljava/lang/String;
    //   152: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   155: iconst_4
    //   156: aaload
    //   157: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   160: ifeq -> 204
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   169: athrow
    //   170: aload_0
    //   171: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: iconst_0
    //   182: anewarray java/lang/Object
    //   185: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   188: iconst_0
    //   189: iconst_1
    //   190: anewarray java/lang/Object
    //   193: dup_x1
    //   194: swap
    //   195: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   198: iconst_0
    //   199: swap
    //   200: aastore
    //   201: invokevirtual aegisguard_MK : ([Ljava/lang/Object;)V
    //   204: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #269	-> 21
    //   #271	-> 28
    //   #272	-> 50
    //   #273	-> 111
    //   #274	-> 170
    //   #277	-> 204
    // Exception table:
    //   from	to	target	type
    //   28	43	46	java/lang/RuntimeException
    //   40	59	62	java/lang/RuntimeException
    //   50	97	100	java/lang/RuntimeException
    //   104	122	125	java/lang/RuntimeException
    //   107	163	166	java/lang/RuntimeException
    //   129	174	177	java/lang/RuntimeException
  }
  
  public void aegisguard_W(Object[] paramArrayOfObject) {
    this.aegisguard_g = false;
  }
  
  public void aegisguard_N(Object[] paramArrayOfObject) {
    this.aegisguard_P = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_z(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   21: astore #4
    //   23: aload_0
    //   24: getfield aegisguard_U : Z
    //   27: aload #4
    //   29: ifnull -> 84
    //   32: ifeq -> 71
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: aload_0
    //   43: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   46: invokevirtual aegisguard_W : ()Lme/frep/aegisguard/spigot/aegisguard_K8;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual aegisguard_I : ([Ljava/lang/Object;)I
    //   56: putfield aegisguard_Ox : I
    //   59: aload #4
    //   61: ifnonnull -> 280
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: aload_0
    //   72: getfield aegisguard_hE : D
    //   75: dconst_0
    //   76: dcmpl
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: lload_2
    //   85: lconst_0
    //   86: lcmp
    //   87: ifle -> 130
    //   90: aload #4
    //   92: ifnull -> 130
    //   95: ifeq -> 280
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_0
    //   106: getfield aegisguard_i : D
    //   109: aload #4
    //   111: ifnull -> 158
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: dconst_0
    //   122: dcmpl
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   129: athrow
    //   130: ifeq -> 280
    //   133: aload_0
    //   134: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   137: iconst_0
    //   138: anewarray java/lang/Object
    //   141: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   144: iconst_0
    //   145: anewarray java/lang/Object
    //   148: invokevirtual aegisguard_r : ([Ljava/lang/Object;)D
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: dstore #5
    //   160: aload_0
    //   161: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   164: iconst_0
    //   165: anewarray java/lang/Object
    //   168: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   171: iconst_0
    //   172: anewarray java/lang/Object
    //   175: invokevirtual aegisguard_u : ([Ljava/lang/Object;)D
    //   178: dstore #7
    //   180: aload_0
    //   181: dload #5
    //   183: aload_0
    //   184: getfield aegisguard_hE : D
    //   187: dsub
    //   188: invokestatic abs : (D)D
    //   191: dload #7
    //   193: aload_0
    //   194: getfield aegisguard_i : D
    //   197: dsub
    //   198: invokestatic abs : (D)D
    //   201: iconst_2
    //   202: anewarray java/lang/Object
    //   205: dup_x2
    //   206: dup_x2
    //   207: pop
    //   208: invokestatic valueOf : (D)Ljava/lang/Double;
    //   211: iconst_1
    //   212: swap
    //   213: aastore
    //   214: dup_x2
    //   215: dup_x2
    //   216: pop
    //   217: invokestatic valueOf : (D)Ljava/lang/Double;
    //   220: iconst_0
    //   221: swap
    //   222: aastore
    //   223: invokestatic aegisguard_e : ([Ljava/lang/Object;)D
    //   226: lload_2
    //   227: lconst_0
    //   228: lcmp
    //   229: ifle -> 277
    //   232: putfield aegisguard_OA : D
    //   235: aload_0
    //   236: aload #4
    //   238: ifnull -> 266
    //   241: getfield aegisguard_OA : D
    //   244: ldc2_w 12.0
    //   247: dcmpl
    //   248: ifle -> 280
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   257: athrow
    //   258: aload_0
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: aload_0
    //   267: aload_0
    //   268: dconst_0
    //   269: dup2_x1
    //   270: putfield aegisguard_OA : D
    //   273: dup2_x1
    //   274: putfield aegisguard_i : D
    //   277: putfield aegisguard_hE : D
    //   280: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #288	-> 23
    //   #289	-> 42
    //   #290	-> 71
    //   #291	-> 133
    //   #292	-> 160
    //   #294	-> 180
    //   #296	-> 235
    //   #297	-> 258
    //   #300	-> 280
    // Exception table:
    //   from	to	target	type
    //   23	35	38	java/lang/RuntimeException
    //   32	64	67	java/lang/RuntimeException
    //   42	77	80	java/lang/RuntimeException
    //   84	98	101	java/lang/RuntimeException
    //   95	114	117	java/lang/RuntimeException
    //   105	123	126	java/lang/RuntimeException
    //   130	151	154	java/lang/RuntimeException
    //   180	251	254	java/lang/RuntimeException
    //   241	259	262	java/lang/RuntimeException
  }
  
  public void aegisguard_Eq(Object[] paramArrayOfObject) {
    this.aegisguard_ho = 0;
  }
  
  public void aegisguard_ED(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   21: aload_0
    //   22: aload_0
    //   23: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   26: iconst_0
    //   27: anewarray java/lang/Object
    //   30: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   33: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   38: invokevirtual getAmount : ()I
    //   41: putfield aegisguard_hc : I
    //   44: aload_0
    //   45: aload_0
    //   46: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   56: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   61: invokeinterface getHeldItemSlot : ()I
    //   66: putfield aegisguard_C : I
    //   69: astore #4
    //   71: aload_0
    //   72: aload #4
    //   74: ifnull -> 157
    //   77: getfield aegisguard_hc : I
    //   80: aload_0
    //   81: getfield aegisguard_OQ : I
    //   84: if_icmpne -> 148
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: lload_2
    //   95: lconst_0
    //   96: lcmp
    //   97: ifle -> 164
    //   100: aload_0
    //   101: aload #4
    //   103: ifnull -> 157
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: lload_2
    //   114: lconst_0
    //   115: lcmp
    //   116: ifle -> 149
    //   119: getfield aegisguard_C : I
    //   122: aload_0
    //   123: getfield aegisguard_hp : I
    //   126: if_icmpne -> 148
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   135: athrow
    //   136: aload_0
    //   137: iconst_0
    //   138: putfield aegisguard_hP : I
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: aload_0
    //   149: aload_0
    //   150: getfield aegisguard_C : I
    //   153: putfield aegisguard_hp : I
    //   156: aload_0
    //   157: aload_0
    //   158: getfield aegisguard_hc : I
    //   161: putfield aegisguard_OQ : I
    //   164: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #307	-> 21
    //   #308	-> 44
    //   #310	-> 71
    //   #311	-> 136
    //   #314	-> 148
    //   #315	-> 156
    //   #316	-> 164
    // Exception table:
    //   from	to	target	type
    //   71	87	90	java/lang/RuntimeException
    //   77	106	109	java/lang/RuntimeException
    //   94	129	132	java/lang/RuntimeException
    //   113	141	144	java/lang/RuntimeException
  }
  
  public void aegisguard_ze(Object[] paramArrayOfObject) {
    double d1 = ((Double)paramArrayOfObject[0]).doubleValue(), d2 = ((Double)paramArrayOfObject[1]).doubleValue(), d3 = ((Double)paramArrayOfObject[2]).doubleValue();
    this.aegisguard_h2 = 0;
    this.aegisguard_OK = d1;
    this.aegisguard_u = d2;
    this.aegisguard_hl = d3;
  }
  
  public void aegisguard_Es(Object[] paramArrayOfObject) {
    this.aegisguard_OC = 0;
  }
  
  public void aegisguard_j_(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerPlayerPositionAndLook
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: aload_0
    //   30: dup
    //   31: getfield aegisguard_Ob : S
    //   34: iconst_1
    //   35: iadd
    //   36: i2s
    //   37: putfield aegisguard_Ob : S
    //   40: aload_0
    //   41: dup
    //   42: getfield aegisguard_OR : S
    //   45: iconst_1
    //   46: iadd
    //   47: i2s
    //   48: putfield aegisguard_OR : S
    //   51: astore #5
    //   53: aload_0
    //   54: getfield aegisguard_Ob : S
    //   57: sipush #-28769
    //   60: aload #5
    //   62: ifnull -> 114
    //   65: if_icmple -> 89
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: aload_0
    //   76: sipush #-29768
    //   79: putfield aegisguard_Ob : S
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: lload_2
    //   90: lconst_0
    //   91: lcmp
    //   92: ifle -> 136
    //   95: aload_0
    //   96: aload #5
    //   98: ifnull -> 132
    //   101: getfield aegisguard_OR : S
    //   104: sipush #-28769
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: if_icmple -> 131
    //   117: aload_0
    //   118: sipush #-29768
    //   121: putfield aegisguard_OR : S
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload_0
    //   132: iconst_0
    //   133: putfield aegisguard_Oa : I
    //   136: new org/bukkit/util/Vector
    //   139: dup
    //   140: aload #4
    //   142: invokevirtual getPosition : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   145: invokevirtual getX : ()D
    //   148: aload #4
    //   150: invokevirtual getPosition : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   153: invokevirtual getY : ()D
    //   156: aload #4
    //   158: invokevirtual getPosition : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   161: invokevirtual getZ : ()D
    //   164: invokespecial <init> : (DDD)V
    //   167: astore #6
    //   169: lload_2
    //   170: lconst_0
    //   171: lcmp
    //   172: iflt -> 190
    //   175: aload_0
    //   176: aload #5
    //   178: ifnull -> 256
    //   181: getfield aegisguard_OZ : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   184: aload #6
    //   186: invokevirtual add : (Ljava/lang/Object;)Z
    //   189: pop
    //   190: iconst_0
    //   191: anewarray java/lang/Object
    //   194: invokestatic aegisguard_l : ([Ljava/lang/Object;)Z
    //   197: ifeq -> 248
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   206: athrow
    //   207: aload_0
    //   208: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   211: aload_0
    //   212: getfield aegisguard_OR : S
    //   215: iconst_1
    //   216: anewarray java/lang/Object
    //   219: dup_x1
    //   220: swap
    //   221: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   224: iconst_0
    //   225: swap
    //   226: aastore
    //   227: invokevirtual aegisguard_P : ([Ljava/lang/Object;)V
    //   230: aload #5
    //   232: lload_2
    //   233: lconst_0
    //   234: lcmp
    //   235: ifle -> 296
    //   238: ifnonnull -> 278
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   247: athrow
    //   248: aload_0
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   255: athrow
    //   256: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   259: aload_0
    //   260: getfield aegisguard_Ob : S
    //   263: iconst_1
    //   264: anewarray java/lang/Object
    //   267: dup_x1
    //   268: swap
    //   269: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   272: iconst_0
    //   273: swap
    //   274: aastore
    //   275: invokevirtual aegisguard_S : ([Ljava/lang/Object;)V
    //   278: aload_0
    //   279: getfield aegisguard_Q : Ljava/util/Map;
    //   282: aload_0
    //   283: getfield aegisguard_Ob : S
    //   286: invokestatic valueOf : (S)Ljava/lang/Short;
    //   289: aload #4
    //   291: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   296: pop
    //   297: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #331	-> 29
    //   #332	-> 40
    //   #334	-> 53
    //   #335	-> 75
    //   #338	-> 89
    //   #339	-> 117
    //   #342	-> 131
    //   #344	-> 136
    //   #346	-> 169
    //   #348	-> 190
    //   #349	-> 207
    //   #351	-> 248
    //   #354	-> 278
    //   #355	-> 297
    // Exception table:
    //   from	to	target	type
    //   53	68	71	java/lang/RuntimeException
    //   65	82	85	java/lang/RuntimeException
    //   89	107	110	java/lang/RuntimeException
    //   114	124	127	java/lang/RuntimeException
    //   169	200	203	java/lang/RuntimeException
    //   181	241	244	java/lang/RuntimeException
    //   207	249	252	java/lang/RuntimeException
  }
  
  public void aegisguard_l(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerEntityEffect
    //   17: astore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: aload_0
    //   26: dup
    //   27: getfield aegisguard_S : S
    //   30: iconst_1
    //   31: iadd
    //   32: i2s
    //   33: putfield aegisguard_S : S
    //   36: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   39: aload_0
    //   40: dup
    //   41: getfield aegisguard_OL : S
    //   44: iconst_1
    //   45: iadd
    //   46: i2s
    //   47: putfield aegisguard_OL : S
    //   50: astore #5
    //   52: aload_0
    //   53: getfield aegisguard_S : S
    //   56: sipush #-27769
    //   59: aload #5
    //   61: ifnull -> 113
    //   64: if_icmple -> 88
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: sipush #-28768
    //   78: putfield aegisguard_S : S
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: aload_0
    //   89: getfield aegisguard_OL : S
    //   92: lload_3
    //   93: lconst_0
    //   94: lcmp
    //   95: ifle -> 137
    //   98: aload #5
    //   100: ifnull -> 137
    //   103: sipush #-27769
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: if_icmple -> 130
    //   116: aload_0
    //   117: sipush #-28768
    //   120: putfield aegisguard_OL : S
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   129: athrow
    //   130: iconst_0
    //   131: anewarray java/lang/Object
    //   134: invokestatic aegisguard_l : ([Ljava/lang/Object;)Z
    //   137: ifeq -> 181
    //   140: aload_0
    //   141: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   144: aload_0
    //   145: getfield aegisguard_OL : S
    //   148: iconst_1
    //   149: anewarray java/lang/Object
    //   152: dup_x1
    //   153: swap
    //   154: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   157: iconst_0
    //   158: swap
    //   159: aastore
    //   160: invokevirtual aegisguard_P : ([Ljava/lang/Object;)V
    //   163: aload #5
    //   165: lload_3
    //   166: lconst_0
    //   167: lcmp
    //   168: ifle -> 228
    //   171: ifnonnull -> 211
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload_0
    //   182: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   185: aload_0
    //   186: getfield aegisguard_S : S
    //   189: iconst_1
    //   190: anewarray java/lang/Object
    //   193: dup_x1
    //   194: swap
    //   195: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   198: iconst_0
    //   199: swap
    //   200: aastore
    //   201: invokevirtual aegisguard_S : ([Ljava/lang/Object;)V
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: aload_0
    //   212: getfield aegisguard_Op : Ljava/util/Map;
    //   215: aload_0
    //   216: getfield aegisguard_S : S
    //   219: invokestatic valueOf : (S)Ljava/lang/Short;
    //   222: aload_2
    //   223: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   228: pop
    //   229: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #358	-> 25
    //   #359	-> 39
    //   #361	-> 52
    //   #362	-> 74
    //   #365	-> 88
    //   #366	-> 116
    //   #369	-> 130
    //   #370	-> 140
    //   #372	-> 181
    //   #374	-> 211
    //   #375	-> 229
    // Exception table:
    //   from	to	target	type
    //   52	67	70	java/lang/RuntimeException
    //   64	81	84	java/lang/RuntimeException
    //   88	106	109	java/lang/RuntimeException
    //   113	123	126	java/lang/RuntimeException
    //   137	174	177	java/lang/RuntimeException
    //   140	204	207	java/lang/RuntimeException
  }
  
  public void aegisguard_mD(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerRemoveEntityEffect
    //   17: astore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: aload_0
    //   29: dup
    //   30: getfield aegisguard_T : S
    //   33: iconst_1
    //   34: iadd
    //   35: i2s
    //   36: putfield aegisguard_T : S
    //   39: astore #5
    //   41: aload_0
    //   42: dup
    //   43: getfield aegisguard_OO : S
    //   46: iconst_1
    //   47: iadd
    //   48: i2s
    //   49: putfield aegisguard_OO : S
    //   52: aload_0
    //   53: getfield aegisguard_T : S
    //   56: sipush #-26769
    //   59: aload #5
    //   61: ifnull -> 113
    //   64: if_icmple -> 88
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: sipush #-27768
    //   78: putfield aegisguard_T : S
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: aload_0
    //   89: getfield aegisguard_OO : S
    //   92: lload_3
    //   93: lconst_0
    //   94: lcmp
    //   95: iflt -> 137
    //   98: aload #5
    //   100: ifnull -> 137
    //   103: sipush #-26769
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: if_icmple -> 130
    //   116: aload_0
    //   117: sipush #-27768
    //   120: putfield aegisguard_OO : S
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   129: athrow
    //   130: iconst_0
    //   131: anewarray java/lang/Object
    //   134: invokestatic aegisguard_l : ([Ljava/lang/Object;)Z
    //   137: ifeq -> 181
    //   140: aload_0
    //   141: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   144: aload_0
    //   145: getfield aegisguard_OO : S
    //   148: iconst_1
    //   149: anewarray java/lang/Object
    //   152: dup_x1
    //   153: swap
    //   154: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   157: iconst_0
    //   158: swap
    //   159: aastore
    //   160: invokevirtual aegisguard_P : ([Ljava/lang/Object;)V
    //   163: aload #5
    //   165: lload_3
    //   166: lconst_0
    //   167: lcmp
    //   168: ifle -> 228
    //   171: ifnonnull -> 211
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload_0
    //   182: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   185: aload_0
    //   186: getfield aegisguard_T : S
    //   189: iconst_1
    //   190: anewarray java/lang/Object
    //   193: dup_x1
    //   194: swap
    //   195: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   198: iconst_0
    //   199: swap
    //   200: aastore
    //   201: invokevirtual aegisguard_S : ([Ljava/lang/Object;)V
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: aload_0
    //   212: getfield aegisguard_m : Ljava/util/Map;
    //   215: aload_0
    //   216: getfield aegisguard_T : S
    //   219: invokestatic valueOf : (S)Ljava/lang/Short;
    //   222: aload_2
    //   223: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   228: pop
    //   229: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #378	-> 28
    //   #379	-> 41
    //   #381	-> 52
    //   #382	-> 74
    //   #385	-> 88
    //   #386	-> 116
    //   #389	-> 130
    //   #390	-> 140
    //   #392	-> 181
    //   #394	-> 211
    //   #395	-> 229
    // Exception table:
    //   from	to	target	type
    //   41	67	70	java/lang/RuntimeException
    //   64	81	84	java/lang/RuntimeException
    //   88	106	109	java/lang/RuntimeException
    //   113	123	126	java/lang/RuntimeException
    //   137	174	177	java/lang/RuntimeException
    //   140	204	207	java/lang/RuntimeException
  }
  
  public void aegisguard_S(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: aload_0
    //   30: dup
    //   31: getfield aegisguard_hW : S
    //   34: iconst_1
    //   35: iadd
    //   36: i2s
    //   37: putfield aegisguard_hW : S
    //   40: astore #5
    //   42: aload_0
    //   43: dup
    //   44: getfield aegisguard_h_ : S
    //   47: iconst_1
    //   48: iadd
    //   49: i2s
    //   50: putfield aegisguard_h_ : S
    //   53: aload_0
    //   54: getfield aegisguard_hW : S
    //   57: sipush #-25769
    //   60: aload #5
    //   62: ifnull -> 114
    //   65: if_icmple -> 89
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: aload_0
    //   76: sipush #-26768
    //   79: putfield aegisguard_hW : S
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_0
    //   90: getfield aegisguard_h_ : S
    //   93: lload_2
    //   94: lconst_0
    //   95: lcmp
    //   96: iflt -> 138
    //   99: aload #5
    //   101: ifnull -> 138
    //   104: sipush #-25769
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: if_icmple -> 131
    //   117: aload_0
    //   118: sipush #-26768
    //   121: putfield aegisguard_h_ : S
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokestatic aegisguard_l : ([Ljava/lang/Object;)Z
    //   138: ifeq -> 182
    //   141: aload_0
    //   142: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   145: aload_0
    //   146: getfield aegisguard_h_ : S
    //   149: iconst_1
    //   150: anewarray java/lang/Object
    //   153: dup_x1
    //   154: swap
    //   155: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   158: iconst_0
    //   159: swap
    //   160: aastore
    //   161: invokevirtual aegisguard_P : ([Ljava/lang/Object;)V
    //   164: aload #5
    //   166: lload_2
    //   167: lconst_0
    //   168: lcmp
    //   169: iflt -> 230
    //   172: ifnonnull -> 212
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   181: athrow
    //   182: aload_0
    //   183: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   186: aload_0
    //   187: getfield aegisguard_hW : S
    //   190: iconst_1
    //   191: anewarray java/lang/Object
    //   194: dup_x1
    //   195: swap
    //   196: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   199: iconst_0
    //   200: swap
    //   201: aastore
    //   202: invokevirtual aegisguard_S : ([Ljava/lang/Object;)V
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_0
    //   213: getfield aegisguard_Oq : Ljava/util/Map;
    //   216: aload_0
    //   217: getfield aegisguard_hW : S
    //   220: invokestatic valueOf : (S)Ljava/lang/Short;
    //   223: aload #4
    //   225: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   230: pop
    //   231: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #398	-> 29
    //   #399	-> 42
    //   #401	-> 53
    //   #402	-> 75
    //   #405	-> 89
    //   #406	-> 117
    //   #409	-> 131
    //   #410	-> 141
    //   #412	-> 182
    //   #414	-> 212
    //   #415	-> 231
    // Exception table:
    //   from	to	target	type
    //   42	68	71	java/lang/RuntimeException
    //   65	82	85	java/lang/RuntimeException
    //   89	107	110	java/lang/RuntimeException
    //   114	124	127	java/lang/RuntimeException
    //   138	175	178	java/lang/RuntimeException
    //   141	205	208	java/lang/RuntimeException
  }
  
  public void aegisguard_qI(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerExplosion
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: aload_0
    //   30: dup
    //   31: getfield aegisguard_O9 : S
    //   34: iconst_1
    //   35: iadd
    //   36: i2s
    //   37: putfield aegisguard_O9 : S
    //   40: astore #5
    //   42: aload_0
    //   43: dup
    //   44: getfield aegisguard_Ot : S
    //   47: iconst_1
    //   48: iadd
    //   49: i2s
    //   50: putfield aegisguard_Ot : S
    //   53: aload_0
    //   54: getfield aegisguard_O9 : S
    //   57: sipush #-21769
    //   60: aload #5
    //   62: ifnull -> 114
    //   65: if_icmple -> 89
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: aload_0
    //   76: sipush #-22768
    //   79: putfield aegisguard_O9 : S
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_0
    //   90: getfield aegisguard_Ot : S
    //   93: lload_2
    //   94: lconst_0
    //   95: lcmp
    //   96: ifle -> 138
    //   99: aload #5
    //   101: ifnull -> 138
    //   104: sipush #-21769
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: if_icmple -> 131
    //   117: aload_0
    //   118: sipush #-22768
    //   121: putfield aegisguard_Ot : S
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iconst_0
    //   132: anewarray java/lang/Object
    //   135: invokestatic aegisguard_l : ([Ljava/lang/Object;)Z
    //   138: ifeq -> 182
    //   141: aload_0
    //   142: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   145: aload_0
    //   146: getfield aegisguard_Ot : S
    //   149: iconst_1
    //   150: anewarray java/lang/Object
    //   153: dup_x1
    //   154: swap
    //   155: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   158: iconst_0
    //   159: swap
    //   160: aastore
    //   161: invokevirtual aegisguard_P : ([Ljava/lang/Object;)V
    //   164: lload_2
    //   165: lconst_0
    //   166: lcmp
    //   167: iflt -> 212
    //   170: aload #5
    //   172: ifnonnull -> 212
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   181: athrow
    //   182: aload_0
    //   183: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   186: aload_0
    //   187: getfield aegisguard_O9 : S
    //   190: iconst_1
    //   191: anewarray java/lang/Object
    //   194: dup_x1
    //   195: swap
    //   196: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   199: iconst_0
    //   200: swap
    //   201: aastore
    //   202: invokevirtual aegisguard_S : ([Ljava/lang/Object;)V
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_0
    //   213: aload #4
    //   215: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   218: aload #5
    //   220: ifnull -> 246
    //   223: ifnonnull -> 241
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: dconst_0
    //   234: goto -> 249
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: aload #4
    //   243: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   246: invokevirtual getX : ()D
    //   249: putfield aegisguard_c : D
    //   252: aload_0
    //   253: aload #4
    //   255: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   258: aload #5
    //   260: ifnull -> 286
    //   263: ifnonnull -> 281
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   272: athrow
    //   273: dconst_0
    //   274: goto -> 289
    //   277: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   280: athrow
    //   281: aload #4
    //   283: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   286: invokevirtual getY : ()D
    //   289: putfield aegisguard_hR : D
    //   292: aload_0
    //   293: aload #4
    //   295: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   298: aload #5
    //   300: ifnull -> 326
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   312: athrow
    //   313: dconst_0
    //   314: goto -> 329
    //   317: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   320: athrow
    //   321: aload #4
    //   323: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   326: invokevirtual getZ : ()D
    //   329: putfield aegisguard_f : D
    //   332: aload_0
    //   333: getfield aegisguard_c : D
    //   336: aload_0
    //   337: getfield aegisguard_f : D
    //   340: iconst_2
    //   341: anewarray java/lang/Object
    //   344: dup_x2
    //   345: dup_x2
    //   346: pop
    //   347: invokestatic valueOf : (D)Ljava/lang/Double;
    //   350: iconst_1
    //   351: swap
    //   352: aastore
    //   353: dup_x2
    //   354: dup_x2
    //   355: pop
    //   356: invokestatic valueOf : (D)Ljava/lang/Double;
    //   359: iconst_0
    //   360: swap
    //   361: aastore
    //   362: invokestatic aegisguard_e : ([Ljava/lang/Object;)D
    //   365: dstore #6
    //   367: aload_0
    //   368: getfield aegisguard_hh : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   371: dload #6
    //   373: invokestatic valueOf : (D)Ljava/lang/Double;
    //   376: invokevirtual add : (Ljava/lang/Object;)Z
    //   379: pop
    //   380: aload_0
    //   381: getfield aegisguard_h7 : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   384: aload_0
    //   385: getfield aegisguard_hR : D
    //   388: invokestatic valueOf : (D)Ljava/lang/Double;
    //   391: invokevirtual add : (Ljava/lang/Object;)Z
    //   394: pop
    //   395: aload_0
    //   396: iconst_0
    //   397: putfield aegisguard_K : I
    //   400: aload_0
    //   401: getfield aegisguard_OX : Ljava/util/Map;
    //   404: aload_0
    //   405: getfield aegisguard_O9 : S
    //   408: invokestatic valueOf : (S)Ljava/lang/Short;
    //   411: aload #4
    //   413: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   418: pop
    //   419: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #419	-> 29
    //   #420	-> 42
    //   #422	-> 53
    //   #423	-> 75
    //   #426	-> 89
    //   #427	-> 117
    //   #430	-> 131
    //   #431	-> 141
    //   #433	-> 182
    //   #435	-> 212
    //   #436	-> 252
    //   #437	-> 292
    //   #439	-> 332
    //   #441	-> 367
    //   #442	-> 380
    //   #444	-> 395
    //   #445	-> 400
    //   #446	-> 419
    // Exception table:
    //   from	to	target	type
    //   42	68	71	java/lang/RuntimeException
    //   65	82	85	java/lang/RuntimeException
    //   89	107	110	java/lang/RuntimeException
    //   114	124	127	java/lang/RuntimeException
    //   138	175	178	java/lang/RuntimeException
    //   141	205	208	java/lang/RuntimeException
    //   212	226	229	java/lang/RuntimeException
    //   223	237	237	java/lang/RuntimeException
    //   249	266	269	java/lang/RuntimeException
    //   263	277	277	java/lang/RuntimeException
    //   289	306	309	java/lang/RuntimeException
    //   303	317	317	java/lang/RuntimeException
  }
  
  public void aegisguard_nZ(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPong
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: aload #4
    //   31: invokevirtual getId : ()I
    //   34: i2s
    //   35: istore #6
    //   37: astore #5
    //   39: aload_0
    //   40: getfield aegisguard_OX : Ljava/util/Map;
    //   43: iload #6
    //   45: invokestatic valueOf : (S)Ljava/lang/Short;
    //   48: aload #5
    //   50: ifnull -> 84
    //   53: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   58: ifeq -> 297
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: aload_0
    //   69: getfield aegisguard_OX : Ljava/util/Map;
    //   72: iload #6
    //   74: invokestatic valueOf : (S)Ljava/lang/Short;
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerExplosion
    //   92: astore #7
    //   94: aload_0
    //   95: aload #7
    //   97: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   100: aload #5
    //   102: ifnull -> 128
    //   105: ifnonnull -> 123
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: dconst_0
    //   116: goto -> 131
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload #7
    //   125: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   128: invokevirtual getX : ()D
    //   131: putfield aegisguard_c : D
    //   134: aload_0
    //   135: aload #7
    //   137: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   140: aload #5
    //   142: ifnull -> 168
    //   145: ifnonnull -> 163
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: dconst_0
    //   156: goto -> 171
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload #7
    //   165: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   168: invokevirtual getY : ()D
    //   171: putfield aegisguard_hR : D
    //   174: aload_0
    //   175: aload #7
    //   177: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   180: aload #5
    //   182: ifnull -> 208
    //   185: ifnonnull -> 203
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: dconst_0
    //   196: goto -> 211
    //   199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   202: athrow
    //   203: aload #7
    //   205: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   208: invokevirtual getZ : ()D
    //   211: putfield aegisguard_f : D
    //   214: aload_0
    //   215: getfield aegisguard_c : D
    //   218: aload_0
    //   219: getfield aegisguard_f : D
    //   222: iconst_2
    //   223: anewarray java/lang/Object
    //   226: dup_x2
    //   227: dup_x2
    //   228: pop
    //   229: invokestatic valueOf : (D)Ljava/lang/Double;
    //   232: iconst_1
    //   233: swap
    //   234: aastore
    //   235: dup_x2
    //   236: dup_x2
    //   237: pop
    //   238: invokestatic valueOf : (D)Ljava/lang/Double;
    //   241: iconst_0
    //   242: swap
    //   243: aastore
    //   244: invokestatic aegisguard_e : ([Ljava/lang/Object;)D
    //   247: dstore #8
    //   249: aload_0
    //   250: getfield aegisguard_hh : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   253: dload #8
    //   255: invokestatic valueOf : (D)Ljava/lang/Double;
    //   258: invokevirtual add : (Ljava/lang/Object;)Z
    //   261: pop
    //   262: aload_0
    //   263: getfield aegisguard_h7 : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   266: aload_0
    //   267: getfield aegisguard_hR : D
    //   270: invokestatic valueOf : (D)Ljava/lang/Double;
    //   273: invokevirtual add : (Ljava/lang/Object;)Z
    //   276: pop
    //   277: aload_0
    //   278: iconst_0
    //   279: putfield aegisguard_K : I
    //   282: aload_0
    //   283: getfield aegisguard_OX : Ljava/util/Map;
    //   286: iload #6
    //   288: invokestatic valueOf : (S)Ljava/lang/Short;
    //   291: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   296: pop
    //   297: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #449	-> 29
    //   #451	-> 39
    //   #452	-> 68
    //   #454	-> 94
    //   #455	-> 134
    //   #456	-> 174
    //   #458	-> 214
    //   #460	-> 249
    //   #461	-> 262
    //   #463	-> 277
    //   #465	-> 282
    //   #467	-> 297
    // Exception table:
    //   from	to	target	type
    //   39	61	64	java/lang/RuntimeException
    //   53	77	80	java/lang/RuntimeException
    //   94	108	111	java/lang/RuntimeException
    //   105	119	119	java/lang/RuntimeException
    //   131	148	151	java/lang/RuntimeException
    //   145	159	159	java/lang/RuntimeException
    //   171	188	191	java/lang/RuntimeException
    //   185	199	199	java/lang/RuntimeException
  }
  
  public void aegisguard_B(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientWindowConfirmation
    //   17: astore_2
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: aload_2
    //   29: invokevirtual getActionId : ()S
    //   32: istore #6
    //   34: astore #5
    //   36: aload_0
    //   37: getfield aegisguard_OX : Ljava/util/Map;
    //   40: iload #6
    //   42: invokestatic valueOf : (S)Ljava/lang/Short;
    //   45: aload #5
    //   47: ifnull -> 81
    //   50: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   55: ifeq -> 231
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: aload_0
    //   66: getfield aegisguard_OX : Ljava/util/Map;
    //   69: iload #6
    //   71: invokestatic valueOf : (S)Ljava/lang/Short;
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerExplosion
    //   89: astore #7
    //   91: aload_0
    //   92: aload #7
    //   94: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   97: aload #5
    //   99: ifnull -> 125
    //   102: ifnonnull -> 120
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: dconst_0
    //   113: goto -> 128
    //   116: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: aload #7
    //   122: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   125: invokevirtual getX : ()D
    //   128: putfield aegisguard_c : D
    //   131: aload_0
    //   132: aload #7
    //   134: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   137: aload #5
    //   139: ifnull -> 165
    //   142: ifnonnull -> 160
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   151: athrow
    //   152: dconst_0
    //   153: goto -> 168
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   165: invokevirtual getY : ()D
    //   168: putfield aegisguard_hR : D
    //   171: aload_0
    //   172: aload #7
    //   174: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   177: aload #5
    //   179: ifnull -> 205
    //   182: ifnonnull -> 200
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: dconst_0
    //   193: goto -> 208
    //   196: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   199: athrow
    //   200: aload #7
    //   202: invokevirtual getKnockback : ()Lcom/github/retrooper/packetevents/util/Vector3d;
    //   205: invokevirtual getZ : ()D
    //   208: putfield aegisguard_f : D
    //   211: aload_0
    //   212: iconst_0
    //   213: putfield aegisguard_K : I
    //   216: aload_0
    //   217: getfield aegisguard_OX : Ljava/util/Map;
    //   220: iload #6
    //   222: invokestatic valueOf : (S)Ljava/lang/Short;
    //   225: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   230: pop
    //   231: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #470	-> 28
    //   #472	-> 36
    //   #473	-> 65
    //   #475	-> 91
    //   #476	-> 131
    //   #477	-> 171
    //   #479	-> 211
    //   #481	-> 216
    //   #483	-> 231
    // Exception table:
    //   from	to	target	type
    //   36	58	61	java/lang/RuntimeException
    //   50	74	77	java/lang/RuntimeException
    //   91	105	108	java/lang/RuntimeException
    //   102	116	116	java/lang/RuntimeException
    //   128	145	148	java/lang/RuntimeException
    //   142	156	156	java/lang/RuntimeException
    //   168	185	188	java/lang/RuntimeException
    //   182	196	196	java/lang/RuntimeException
  }
  
  private void aegisguard_EW(Object[] paramArrayOfObject) {
    WrapperPlayClientWindowConfirmation wrapperPlayClientWindowConfirmation = (WrapperPlayClientWindowConfirmation)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.aegisguard_Q.containsKey(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()))) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    WrapperPlayServerPlayerPositionAndLook wrapperPlayServerPlayerPositionAndLook = (WrapperPlayServerPlayerPositionAndLook)this.aegisguard_Q.get(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()));
    Vector3d vector3d = wrapperPlayServerPlayerPositionAndLook.getPosition();
    this.aegisguard_w = vector3d.getX();
    this.aegisguard_OU = vector3d.getY();
    this.aegisguard_x = vector3d.getZ();
    this.aegisguard_Oa = 0;
    this.aegisguard_Q.remove(Short.valueOf(wrapperPlayClientWindowConfirmation.getActionId()));
  }
  
  public void aegisguard_ns(Object[] paramArrayOfObject) {
    WrapperPlayClientPong wrapperPlayClientPong = (WrapperPlayClientPong)paramArrayOfObject[0];
    long l = ((Long)paramArrayOfObject[1]).longValue();
    l = a ^ l;
    short s = (short)wrapperPlayClientPong.getId();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_Ke.aegisguard_P();
    try {
      if (arrayOfAbstractCheck != null)
        try {
          if (this.aegisguard_Q.containsKey(Short.valueOf(s))) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    WrapperPlayServerPlayerPositionAndLook wrapperPlayServerPlayerPositionAndLook = (WrapperPlayServerPlayerPositionAndLook)this.aegisguard_Q.get(Short.valueOf(s));
    Vector3d vector3d = wrapperPlayServerPlayerPositionAndLook.getPosition();
    this.aegisguard_w = vector3d.getX();
    this.aegisguard_OU = vector3d.getY();
    this.aegisguard_x = vector3d.getZ();
    this.aegisguard_Oa = 0;
    this.aegisguard_Q.remove(Short.valueOf(s));
  }
  
  private void aegisguard_EZ(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientWindowConfirmation
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: astore #5
    //   31: aload_0
    //   32: getfield aegisguard_Op : Ljava/util/Map;
    //   35: aload #4
    //   37: invokevirtual getActionId : ()S
    //   40: invokestatic valueOf : (S)Ljava/lang/Short;
    //   43: aload #5
    //   45: ifnull -> 82
    //   48: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   53: ifeq -> 495
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: aload_0
    //   64: getfield aegisguard_Op : Ljava/util/Map;
    //   67: aload #4
    //   69: invokevirtual getActionId : ()S
    //   72: invokestatic valueOf : (S)Ljava/lang/Short;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   87: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerEntityEffect
    //   90: astore #6
    //   92: aload #6
    //   94: aload #5
    //   96: ifnull -> 112
    //   99: ifnonnull -> 110
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: return
    //   110: aload #6
    //   112: invokevirtual getEffectAmplifier : ()I
    //   115: iconst_1
    //   116: iadd
    //   117: istore #7
    //   119: aload #6
    //   121: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   124: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SPEED : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   127: aload #5
    //   129: lload_2
    //   130: lconst_0
    //   131: lcmp
    //   132: iflt -> 182
    //   135: ifnull -> 180
    //   138: if_acmpne -> 172
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: aload_0
    //   149: iconst_1
    //   150: putfield aegisguard_h4 : Z
    //   153: aload_0
    //   154: iload #7
    //   156: putfield aegisguard_hM : I
    //   159: aload_0
    //   160: iload #7
    //   162: putfield aegisguard_he : I
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   171: athrow
    //   172: aload #6
    //   174: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   177: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.HASTE : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   180: aload #5
    //   182: lload_2
    //   183: lconst_0
    //   184: lcmp
    //   185: ifle -> 223
    //   188: ifnull -> 221
    //   191: if_acmpne -> 213
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: aload_0
    //   202: iconst_1
    //   203: putfield aegisguard_hL : Z
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   212: athrow
    //   213: aload #6
    //   215: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   218: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SLOWNESS : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   221: aload #5
    //   223: lload_2
    //   224: lconst_0
    //   225: lcmp
    //   226: iflt -> 264
    //   229: ifnull -> 262
    //   232: if_acmpne -> 254
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: aload_0
    //   243: iconst_1
    //   244: putfield aegisguard_hG : Z
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   253: athrow
    //   254: aload #6
    //   256: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   259: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.JUMP_BOOST : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   262: aload #5
    //   264: lload_2
    //   265: lconst_0
    //   266: lcmp
    //   267: iflt -> 311
    //   270: ifnull -> 309
    //   273: if_acmpne -> 301
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   282: athrow
    //   283: aload_0
    //   284: iconst_1
    //   285: putfield aegisguard_hk : Z
    //   288: aload_0
    //   289: iload #7
    //   291: putfield aegisguard_o : I
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   300: athrow
    //   301: aload #6
    //   303: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   306: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.LEVITATION : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   309: aload #5
    //   311: lload_2
    //   312: lconst_0
    //   313: lcmp
    //   314: ifle -> 358
    //   317: ifnull -> 356
    //   320: if_acmpne -> 348
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   329: athrow
    //   330: aload_0
    //   331: iconst_1
    //   332: putfield aegisguard_O2 : Z
    //   335: aload_0
    //   336: iload #7
    //   338: putfield aegisguard_Oi : I
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   347: athrow
    //   348: aload #6
    //   350: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   353: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SLOW_FALLING : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   356: aload #5
    //   358: lload_2
    //   359: lconst_0
    //   360: lcmp
    //   361: ifle -> 411
    //   364: ifnull -> 403
    //   367: if_acmpne -> 395
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: aload_0
    //   378: iconst_1
    //   379: putfield aegisguard_hO : Z
    //   382: aload_0
    //   383: iload #7
    //   385: putfield aegisguard_y : I
    //   388: goto -> 395
    //   391: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   394: athrow
    //   395: aload #6
    //   397: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   400: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.CONDUIT_POWER : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   403: lload_2
    //   404: lconst_0
    //   405: lcmp
    //   406: iflt -> 456
    //   409: aload #5
    //   411: ifnull -> 456
    //   414: if_acmpne -> 436
    //   417: goto -> 424
    //   420: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   423: athrow
    //   424: aload_0
    //   425: iconst_1
    //   426: putfield aegisguard_V : Z
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   435: athrow
    //   436: aload #6
    //   438: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   441: aload #5
    //   443: ifnull -> 494
    //   446: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.DOLPHINS_GRACE : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   449: goto -> 456
    //   452: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   455: athrow
    //   456: if_acmpne -> 477
    //   459: aload_0
    //   460: iconst_1
    //   461: putfield aegisguard_hg : Z
    //   464: aload_0
    //   465: iload #7
    //   467: putfield aegisguard_OV : I
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   476: athrow
    //   477: aload_0
    //   478: getfield aegisguard_Op : Ljava/util/Map;
    //   481: aload #4
    //   483: invokevirtual getActionId : ()S
    //   486: invokestatic valueOf : (S)Ljava/lang/Short;
    //   489: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   494: pop
    //   495: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #520	-> 31
    //   #521	-> 63
    //   #523	-> 92
    //   #525	-> 110
    //   #527	-> 119
    //   #528	-> 148
    //   #529	-> 153
    //   #530	-> 159
    //   #533	-> 172
    //   #534	-> 201
    //   #537	-> 213
    //   #538	-> 242
    //   #541	-> 254
    //   #542	-> 283
    //   #543	-> 288
    //   #545	-> 301
    //   #546	-> 330
    //   #547	-> 335
    //   #549	-> 348
    //   #550	-> 377
    //   #551	-> 382
    //   #553	-> 395
    //   #554	-> 424
    //   #556	-> 436
    //   #557	-> 459
    //   #558	-> 464
    //   #561	-> 477
    //   #563	-> 495
    // Exception table:
    //   from	to	target	type
    //   31	56	59	java/lang/RuntimeException
    //   48	75	78	java/lang/RuntimeException
    //   92	102	105	java/lang/RuntimeException
    //   119	141	144	java/lang/RuntimeException
    //   138	165	168	java/lang/RuntimeException
    //   180	194	197	java/lang/RuntimeException
    //   191	206	209	java/lang/RuntimeException
    //   221	235	238	java/lang/RuntimeException
    //   232	247	250	java/lang/RuntimeException
    //   262	276	279	java/lang/RuntimeException
    //   273	294	297	java/lang/RuntimeException
    //   309	323	326	java/lang/RuntimeException
    //   320	341	344	java/lang/RuntimeException
    //   356	370	373	java/lang/RuntimeException
    //   367	388	391	java/lang/RuntimeException
    //   403	417	420	java/lang/RuntimeException
    //   414	429	432	java/lang/RuntimeException
    //   436	449	452	java/lang/RuntimeException
    //   456	470	473	java/lang/RuntimeException
  }
  
  private void aegisguard_ng(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPong
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: aload_2
    //   29: invokevirtual getId : ()I
    //   32: i2s
    //   33: istore #6
    //   35: astore #5
    //   37: aload_0
    //   38: getfield aegisguard_Op : Ljava/util/Map;
    //   41: iload #6
    //   43: aload #5
    //   45: ifnull -> 81
    //   48: invokestatic valueOf : (S)Ljava/lang/Short;
    //   51: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   56: ifeq -> 455
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: aload_0
    //   67: getfield aegisguard_Op : Ljava/util/Map;
    //   70: aload_2
    //   71: invokevirtual getId : ()I
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   84: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerEntityEffect
    //   92: astore #7
    //   94: aload #7
    //   96: aload #5
    //   98: ifnull -> 114
    //   101: ifnonnull -> 112
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: return
    //   112: aload #7
    //   114: invokevirtual getEffectAmplifier : ()I
    //   117: iconst_1
    //   118: iadd
    //   119: istore #8
    //   121: aload #7
    //   123: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   126: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SPEED : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   129: aload #5
    //   131: lload_3
    //   132: lconst_0
    //   133: lcmp
    //   134: ifle -> 184
    //   137: ifnull -> 182
    //   140: if_acmpne -> 174
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: aload_0
    //   151: iconst_1
    //   152: putfield aegisguard_h4 : Z
    //   155: aload_0
    //   156: iload #8
    //   158: putfield aegisguard_hM : I
    //   161: aload_0
    //   162: iload #8
    //   164: putfield aegisguard_he : I
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload #7
    //   176: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   179: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SLOWNESS : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   182: aload #5
    //   184: lload_3
    //   185: lconst_0
    //   186: lcmp
    //   187: iflt -> 225
    //   190: ifnull -> 223
    //   193: if_acmpne -> 215
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   202: athrow
    //   203: aload_0
    //   204: iconst_1
    //   205: putfield aegisguard_hG : Z
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: aload #7
    //   217: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   220: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.JUMP_BOOST : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   223: aload #5
    //   225: lload_3
    //   226: lconst_0
    //   227: lcmp
    //   228: ifle -> 272
    //   231: ifnull -> 270
    //   234: if_acmpne -> 262
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   243: athrow
    //   244: aload_0
    //   245: iconst_1
    //   246: putfield aegisguard_hk : Z
    //   249: aload_0
    //   250: iload #8
    //   252: putfield aegisguard_o : I
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   261: athrow
    //   262: aload #7
    //   264: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   267: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.LEVITATION : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   270: aload #5
    //   272: lload_3
    //   273: lconst_0
    //   274: lcmp
    //   275: ifle -> 319
    //   278: ifnull -> 317
    //   281: if_acmpne -> 309
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   290: athrow
    //   291: aload_0
    //   292: iconst_1
    //   293: putfield aegisguard_O2 : Z
    //   296: aload_0
    //   297: iload #8
    //   299: putfield aegisguard_Oi : I
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   308: athrow
    //   309: aload #7
    //   311: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   314: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SLOW_FALLING : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   317: aload #5
    //   319: lload_3
    //   320: lconst_0
    //   321: lcmp
    //   322: ifle -> 372
    //   325: ifnull -> 364
    //   328: if_acmpne -> 356
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   337: athrow
    //   338: aload_0
    //   339: iconst_1
    //   340: putfield aegisguard_hO : Z
    //   343: aload_0
    //   344: iload #8
    //   346: putfield aegisguard_y : I
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   355: athrow
    //   356: aload #7
    //   358: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   361: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.CONDUIT_POWER : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   364: lload_3
    //   365: lconst_0
    //   366: lcmp
    //   367: ifle -> 417
    //   370: aload #5
    //   372: ifnull -> 417
    //   375: if_acmpne -> 397
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   384: athrow
    //   385: aload_0
    //   386: iconst_1
    //   387: putfield aegisguard_V : Z
    //   390: goto -> 397
    //   393: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   396: athrow
    //   397: aload #7
    //   399: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   402: aload #5
    //   404: ifnull -> 454
    //   407: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.DOLPHINS_GRACE : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   416: athrow
    //   417: if_acmpne -> 438
    //   420: aload_0
    //   421: iconst_1
    //   422: putfield aegisguard_hg : Z
    //   425: aload_0
    //   426: iload #8
    //   428: putfield aegisguard_OV : I
    //   431: goto -> 438
    //   434: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   437: athrow
    //   438: aload_0
    //   439: getfield aegisguard_Op : Ljava/util/Map;
    //   442: aload_2
    //   443: invokevirtual getId : ()I
    //   446: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   449: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   454: pop
    //   455: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #566	-> 28
    //   #568	-> 37
    //   #569	-> 66
    //   #571	-> 94
    //   #573	-> 112
    //   #575	-> 121
    //   #576	-> 150
    //   #577	-> 155
    //   #578	-> 161
    //   #581	-> 174
    //   #582	-> 203
    //   #585	-> 215
    //   #586	-> 244
    //   #587	-> 249
    //   #589	-> 262
    //   #590	-> 291
    //   #591	-> 296
    //   #593	-> 309
    //   #594	-> 338
    //   #595	-> 343
    //   #597	-> 356
    //   #598	-> 385
    //   #600	-> 397
    //   #601	-> 420
    //   #602	-> 425
    //   #605	-> 438
    //   #607	-> 455
    // Exception table:
    //   from	to	target	type
    //   37	59	62	java/lang/RuntimeException
    //   48	74	77	java/lang/RuntimeException
    //   94	104	107	java/lang/RuntimeException
    //   121	143	146	java/lang/RuntimeException
    //   140	167	170	java/lang/RuntimeException
    //   182	196	199	java/lang/RuntimeException
    //   193	208	211	java/lang/RuntimeException
    //   223	237	240	java/lang/RuntimeException
    //   234	255	258	java/lang/RuntimeException
    //   270	284	287	java/lang/RuntimeException
    //   281	302	305	java/lang/RuntimeException
    //   317	331	334	java/lang/RuntimeException
    //   328	349	352	java/lang/RuntimeException
    //   364	378	381	java/lang/RuntimeException
    //   375	390	393	java/lang/RuntimeException
    //   397	410	413	java/lang/RuntimeException
    //   417	431	434	java/lang/RuntimeException
  }
  
  private void aegisguard_nY(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPong
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: aload #4
    //   31: invokevirtual getId : ()I
    //   34: i2s
    //   35: istore #6
    //   37: astore #5
    //   39: aload_0
    //   40: getfield aegisguard_m : Ljava/util/Map;
    //   43: iload #6
    //   45: invokestatic valueOf : (S)Ljava/lang/Short;
    //   48: aload #5
    //   50: ifnull -> 84
    //   53: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   58: ifeq -> 507
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: aload_0
    //   69: getfield aegisguard_m : Ljava/util/Map;
    //   72: iload #6
    //   74: invokestatic valueOf : (S)Ljava/lang/Short;
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerRemoveEntityEffect
    //   92: astore #7
    //   94: aload #7
    //   96: lload_2
    //   97: lconst_0
    //   98: lcmp
    //   99: iflt -> 120
    //   102: aload #5
    //   104: ifnull -> 120
    //   107: ifnonnull -> 118
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   116: athrow
    //   117: return
    //   118: aload #7
    //   120: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   123: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SPEED : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   126: aload #5
    //   128: lload_2
    //   129: lconst_0
    //   130: lcmp
    //   131: iflt -> 201
    //   134: ifnull -> 199
    //   137: if_acmpne -> 191
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   146: athrow
    //   147: aload_0
    //   148: iconst_0
    //   149: putfield aegisguard_hM : I
    //   152: aload_0
    //   153: iconst_0
    //   154: putfield aegisguard_h4 : Z
    //   157: aload_0
    //   158: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   161: iconst_0
    //   162: anewarray java/lang/Object
    //   165: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   168: iconst_0
    //   169: iconst_1
    //   170: anewarray java/lang/Object
    //   173: dup_x1
    //   174: swap
    //   175: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   178: iconst_0
    //   179: swap
    //   180: aastore
    //   181: invokevirtual aegisguard_Mm : ([Ljava/lang/Object;)V
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   190: athrow
    //   191: aload #7
    //   193: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   196: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SLOWNESS : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   199: aload #5
    //   201: lload_2
    //   202: lconst_0
    //   203: lcmp
    //   204: iflt -> 242
    //   207: ifnull -> 240
    //   210: if_acmpne -> 232
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   219: athrow
    //   220: aload_0
    //   221: iconst_0
    //   222: putfield aegisguard_hG : Z
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   231: athrow
    //   232: aload #7
    //   234: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   237: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.HASTE : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   240: aload #5
    //   242: lload_2
    //   243: lconst_0
    //   244: lcmp
    //   245: ifle -> 283
    //   248: ifnull -> 281
    //   251: if_acmpne -> 273
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   260: athrow
    //   261: aload_0
    //   262: iconst_0
    //   263: putfield aegisguard_hL : Z
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   272: athrow
    //   273: aload #7
    //   275: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   278: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.JUMP_BOOST : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   281: aload #5
    //   283: lload_2
    //   284: lconst_0
    //   285: lcmp
    //   286: iflt -> 329
    //   289: ifnull -> 327
    //   292: if_acmpne -> 319
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   301: athrow
    //   302: aload_0
    //   303: iconst_0
    //   304: putfield aegisguard_o : I
    //   307: aload_0
    //   308: iconst_0
    //   309: putfield aegisguard_hk : Z
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   318: athrow
    //   319: aload #7
    //   321: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   324: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.LEVITATION : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   327: aload #5
    //   329: lload_2
    //   330: lconst_0
    //   331: lcmp
    //   332: iflt -> 375
    //   335: ifnull -> 373
    //   338: if_acmpne -> 365
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   347: athrow
    //   348: aload_0
    //   349: iconst_0
    //   350: putfield aegisguard_Oi : I
    //   353: aload_0
    //   354: iconst_0
    //   355: putfield aegisguard_O2 : Z
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   364: athrow
    //   365: aload #7
    //   367: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   370: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SLOW_FALLING : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   373: aload #5
    //   375: lload_2
    //   376: lconst_0
    //   377: lcmp
    //   378: iflt -> 427
    //   381: ifnull -> 419
    //   384: if_acmpne -> 411
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   393: athrow
    //   394: aload_0
    //   395: iconst_0
    //   396: putfield aegisguard_hO : Z
    //   399: aload_0
    //   400: iconst_0
    //   401: putfield aegisguard_y : I
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   410: athrow
    //   411: aload #7
    //   413: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   416: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.CONDUIT_POWER : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   419: lload_2
    //   420: lconst_0
    //   421: lcmp
    //   422: ifle -> 472
    //   425: aload #5
    //   427: ifnull -> 472
    //   430: if_acmpne -> 452
    //   433: goto -> 440
    //   436: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   439: athrow
    //   440: aload_0
    //   441: iconst_0
    //   442: putfield aegisguard_V : Z
    //   445: goto -> 452
    //   448: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   451: athrow
    //   452: aload #7
    //   454: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   457: aload #5
    //   459: ifnull -> 506
    //   462: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.DOLPHINS_GRACE : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   465: goto -> 472
    //   468: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   471: athrow
    //   472: if_acmpne -> 492
    //   475: aload_0
    //   476: iconst_0
    //   477: putfield aegisguard_OV : I
    //   480: aload_0
    //   481: iconst_0
    //   482: putfield aegisguard_hg : Z
    //   485: goto -> 492
    //   488: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   491: athrow
    //   492: aload_0
    //   493: getfield aegisguard_m : Ljava/util/Map;
    //   496: iload #6
    //   498: invokestatic valueOf : (S)Ljava/lang/Short;
    //   501: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   506: pop
    //   507: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #610	-> 29
    //   #612	-> 39
    //   #613	-> 68
    //   #615	-> 94
    //   #617	-> 118
    //   #618	-> 147
    //   #619	-> 152
    //   #620	-> 157
    //   #622	-> 191
    //   #623	-> 220
    //   #625	-> 232
    //   #626	-> 261
    //   #628	-> 273
    //   #629	-> 302
    //   #630	-> 307
    //   #632	-> 319
    //   #633	-> 348
    //   #634	-> 353
    //   #636	-> 365
    //   #637	-> 394
    //   #638	-> 399
    //   #640	-> 411
    //   #641	-> 440
    //   #643	-> 452
    //   #644	-> 475
    //   #645	-> 480
    //   #648	-> 492
    //   #650	-> 507
    // Exception table:
    //   from	to	target	type
    //   39	61	64	java/lang/RuntimeException
    //   53	77	80	java/lang/RuntimeException
    //   94	110	113	java/lang/RuntimeException
    //   120	140	143	java/lang/RuntimeException
    //   137	184	187	java/lang/RuntimeException
    //   199	213	216	java/lang/RuntimeException
    //   210	225	228	java/lang/RuntimeException
    //   240	254	257	java/lang/RuntimeException
    //   251	266	269	java/lang/RuntimeException
    //   281	295	298	java/lang/RuntimeException
    //   292	312	315	java/lang/RuntimeException
    //   327	341	344	java/lang/RuntimeException
    //   338	358	361	java/lang/RuntimeException
    //   373	387	390	java/lang/RuntimeException
    //   384	404	407	java/lang/RuntimeException
    //   419	433	436	java/lang/RuntimeException
    //   430	445	448	java/lang/RuntimeException
    //   452	465	468	java/lang/RuntimeException
    //   472	485	488	java/lang/RuntimeException
  }
  
  private void aegisguard_Eb(Object[] paramArrayOfObject) {
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
    //   14: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientWindowConfirmation
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: astore #5
    //   31: aload_0
    //   32: getfield aegisguard_m : Ljava/util/Map;
    //   35: aload #4
    //   37: invokevirtual getActionId : ()S
    //   40: invokestatic valueOf : (S)Ljava/lang/Short;
    //   43: aload #5
    //   45: ifnull -> 82
    //   48: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   53: ifeq -> 508
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: aload_0
    //   64: getfield aegisguard_m : Ljava/util/Map;
    //   67: aload #4
    //   69: invokevirtual getActionId : ()S
    //   72: invokestatic valueOf : (S)Ljava/lang/Short;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   87: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerRemoveEntityEffect
    //   90: astore #6
    //   92: aload #6
    //   94: lload_2
    //   95: lconst_0
    //   96: lcmp
    //   97: ifle -> 118
    //   100: aload #5
    //   102: ifnull -> 118
    //   105: ifnonnull -> 116
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: return
    //   116: aload #6
    //   118: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   121: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SPEED : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   124: aload #5
    //   126: lload_2
    //   127: lconst_0
    //   128: lcmp
    //   129: iflt -> 199
    //   132: ifnull -> 197
    //   135: if_acmpne -> 189
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: aload_0
    //   146: iconst_0
    //   147: putfield aegisguard_hM : I
    //   150: aload_0
    //   151: iconst_0
    //   152: putfield aegisguard_h4 : Z
    //   155: aload_0
    //   156: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   159: iconst_0
    //   160: anewarray java/lang/Object
    //   163: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   166: iconst_0
    //   167: iconst_1
    //   168: anewarray java/lang/Object
    //   171: dup_x1
    //   172: swap
    //   173: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   176: iconst_0
    //   177: swap
    //   178: aastore
    //   179: invokevirtual aegisguard_Mm : ([Ljava/lang/Object;)V
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: aload #6
    //   191: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   194: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SLOWNESS : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   197: aload #5
    //   199: lload_2
    //   200: lconst_0
    //   201: lcmp
    //   202: ifle -> 240
    //   205: ifnull -> 238
    //   208: if_acmpne -> 230
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload_0
    //   219: iconst_0
    //   220: putfield aegisguard_hG : Z
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: aload #6
    //   232: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   235: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.HASTE : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   238: aload #5
    //   240: lload_2
    //   241: lconst_0
    //   242: lcmp
    //   243: ifle -> 281
    //   246: ifnull -> 279
    //   249: if_acmpne -> 271
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   258: athrow
    //   259: aload_0
    //   260: iconst_0
    //   261: putfield aegisguard_hL : Z
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   270: athrow
    //   271: aload #6
    //   273: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   276: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.JUMP_BOOST : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   279: aload #5
    //   281: lload_2
    //   282: lconst_0
    //   283: lcmp
    //   284: ifle -> 327
    //   287: ifnull -> 325
    //   290: if_acmpne -> 317
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   299: athrow
    //   300: aload_0
    //   301: iconst_0
    //   302: putfield aegisguard_o : I
    //   305: aload_0
    //   306: iconst_0
    //   307: putfield aegisguard_hk : Z
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   316: athrow
    //   317: aload #6
    //   319: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   322: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.LEVITATION : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   325: aload #5
    //   327: lload_2
    //   328: lconst_0
    //   329: lcmp
    //   330: ifle -> 373
    //   333: ifnull -> 371
    //   336: if_acmpne -> 363
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   345: athrow
    //   346: aload_0
    //   347: iconst_0
    //   348: putfield aegisguard_Oi : I
    //   351: aload_0
    //   352: iconst_0
    //   353: putfield aegisguard_O2 : Z
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   362: athrow
    //   363: aload #6
    //   365: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   368: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.SLOW_FALLING : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   371: aload #5
    //   373: lload_2
    //   374: lconst_0
    //   375: lcmp
    //   376: ifle -> 425
    //   379: ifnull -> 417
    //   382: if_acmpne -> 409
    //   385: goto -> 392
    //   388: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   391: athrow
    //   392: aload_0
    //   393: iconst_0
    //   394: putfield aegisguard_hO : Z
    //   397: aload_0
    //   398: iconst_0
    //   399: putfield aegisguard_y : I
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   408: athrow
    //   409: aload #6
    //   411: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   414: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.CONDUIT_POWER : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   417: lload_2
    //   418: lconst_0
    //   419: lcmp
    //   420: ifle -> 470
    //   423: aload #5
    //   425: ifnull -> 470
    //   428: if_acmpne -> 450
    //   431: goto -> 438
    //   434: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   437: athrow
    //   438: aload_0
    //   439: iconst_0
    //   440: putfield aegisguard_V : Z
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   449: athrow
    //   450: aload #6
    //   452: invokevirtual getPotionType : ()Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   455: aload #5
    //   457: ifnull -> 507
    //   460: getstatic com/github/retrooper/packetevents/protocol/potion/PotionTypes.DOLPHINS_GRACE : Lcom/github/retrooper/packetevents/protocol/potion/PotionType;
    //   463: goto -> 470
    //   466: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   469: athrow
    //   470: if_acmpne -> 490
    //   473: aload_0
    //   474: iconst_0
    //   475: putfield aegisguard_OV : I
    //   478: aload_0
    //   479: iconst_0
    //   480: putfield aegisguard_hg : Z
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   489: athrow
    //   490: aload_0
    //   491: getfield aegisguard_m : Ljava/util/Map;
    //   494: aload #4
    //   496: invokevirtual getActionId : ()S
    //   499: invokestatic valueOf : (S)Ljava/lang/Short;
    //   502: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   507: pop
    //   508: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #653	-> 31
    //   #654	-> 63
    //   #656	-> 92
    //   #658	-> 116
    //   #659	-> 145
    //   #660	-> 150
    //   #661	-> 155
    //   #663	-> 189
    //   #664	-> 218
    //   #666	-> 230
    //   #667	-> 259
    //   #669	-> 271
    //   #670	-> 300
    //   #671	-> 305
    //   #673	-> 317
    //   #674	-> 346
    //   #675	-> 351
    //   #677	-> 363
    //   #678	-> 392
    //   #679	-> 397
    //   #681	-> 409
    //   #682	-> 438
    //   #684	-> 450
    //   #685	-> 473
    //   #686	-> 478
    //   #689	-> 490
    //   #691	-> 508
    // Exception table:
    //   from	to	target	type
    //   31	56	59	java/lang/RuntimeException
    //   48	75	78	java/lang/RuntimeException
    //   92	108	111	java/lang/RuntimeException
    //   118	138	141	java/lang/RuntimeException
    //   135	182	185	java/lang/RuntimeException
    //   197	211	214	java/lang/RuntimeException
    //   208	223	226	java/lang/RuntimeException
    //   238	252	255	java/lang/RuntimeException
    //   249	264	267	java/lang/RuntimeException
    //   279	293	296	java/lang/RuntimeException
    //   290	310	313	java/lang/RuntimeException
    //   325	339	342	java/lang/RuntimeException
    //   336	356	359	java/lang/RuntimeException
    //   371	385	388	java/lang/RuntimeException
    //   382	402	405	java/lang/RuntimeException
    //   417	431	434	java/lang/RuntimeException
    //   428	443	446	java/lang/RuntimeException
    //   450	463	466	java/lang/RuntimeException
    //   470	483	486	java/lang/RuntimeException
  }
  
  private void aegisguard_nf(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientPong
    //   7: astore_2
    //   8: dup
    //   9: iconst_1
    //   10: aaload
    //   11: checkcast java/lang/Long
    //   14: invokevirtual longValue : ()J
    //   17: lstore_3
    //   18: pop
    //   19: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   22: lload_3
    //   23: lxor
    //   24: lstore_3
    //   25: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   28: aload_2
    //   29: invokevirtual getId : ()I
    //   32: i2s
    //   33: istore #6
    //   35: astore #5
    //   37: aload_0
    //   38: getfield aegisguard_Oq : Ljava/util/Map;
    //   41: iload #6
    //   43: invokestatic valueOf : (S)Ljava/lang/Short;
    //   46: aload #5
    //   48: ifnull -> 82
    //   51: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   56: ifeq -> 313
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: aload_0
    //   67: getfield aegisguard_Oq : Ljava/util/Map;
    //   70: iload #6
    //   72: invokestatic valueOf : (S)Ljava/lang/Short;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   87: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState
    //   90: astore #7
    //   92: aload #7
    //   94: lload_3
    //   95: lconst_0
    //   96: lcmp
    //   97: iflt -> 118
    //   100: aload #5
    //   102: ifnull -> 118
    //   105: ifnonnull -> 116
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: return
    //   116: aload #7
    //   118: invokevirtual getReason : ()Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState$Reason;
    //   121: aload #5
    //   123: ifnull -> 312
    //   126: getstatic com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState$Reason.CHANGE_GAME_MODE : Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState$Reason;
    //   129: if_acmpne -> 298
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: aload #7
    //   141: aload #5
    //   143: ifnull -> 312
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: invokevirtual getValue : ()F
    //   156: f2i
    //   157: tableswitch default -> 298, 0 -> 192, 1 -> 217, 2 -> 242, 3 -> 267
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: aload_0
    //   193: lload_3
    //   194: lconst_0
    //   195: lcmp
    //   196: ifle -> 299
    //   199: getstatic org/bukkit/GameMode.SURVIVAL : Lorg/bukkit/GameMode;
    //   202: putfield aegisguard_Ol : Lorg/bukkit/GameMode;
    //   205: aload #5
    //   207: ifnonnull -> 298
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: aload_0
    //   218: lload_3
    //   219: lconst_0
    //   220: lcmp
    //   221: ifle -> 299
    //   224: getstatic org/bukkit/GameMode.CREATIVE : Lorg/bukkit/GameMode;
    //   227: putfield aegisguard_Ol : Lorg/bukkit/GameMode;
    //   230: aload #5
    //   232: ifnonnull -> 298
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: aload_0
    //   243: lload_3
    //   244: lconst_0
    //   245: lcmp
    //   246: iflt -> 299
    //   249: getstatic org/bukkit/GameMode.ADVENTURE : Lorg/bukkit/GameMode;
    //   252: putfield aegisguard_Ol : Lorg/bukkit/GameMode;
    //   255: aload #5
    //   257: ifnonnull -> 298
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   266: athrow
    //   267: iconst_0
    //   268: anewarray java/lang/Object
    //   271: invokestatic aegisguard_n : ([Ljava/lang/Object;)Z
    //   274: ifeq -> 298
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   283: athrow
    //   284: aload_0
    //   285: getstatic org/bukkit/GameMode.SPECTATOR : Lorg/bukkit/GameMode;
    //   288: putfield aegisguard_Ol : Lorg/bukkit/GameMode;
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   297: athrow
    //   298: aload_0
    //   299: getfield aegisguard_Oq : Ljava/util/Map;
    //   302: iload #6
    //   304: invokestatic valueOf : (S)Ljava/lang/Short;
    //   307: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   312: pop
    //   313: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #694	-> 28
    //   #696	-> 37
    //   #697	-> 66
    //   #699	-> 92
    //   #701	-> 116
    //   #702	-> 139
    //   #704	-> 192
    //   #705	-> 205
    //   #707	-> 217
    //   #708	-> 230
    //   #710	-> 242
    //   #711	-> 255
    //   #713	-> 267
    //   #718	-> 298
    //   #720	-> 313
    // Exception table:
    //   from	to	target	type
    //   37	59	62	java/lang/RuntimeException
    //   51	75	78	java/lang/RuntimeException
    //   92	108	111	java/lang/RuntimeException
    //   118	132	135	java/lang/RuntimeException
    //   126	146	149	java/lang/RuntimeException
    //   139	188	188	java/lang/RuntimeException
    //   153	210	213	java/lang/RuntimeException
    //   192	235	238	java/lang/RuntimeException
    //   217	260	263	java/lang/RuntimeException
    //   242	277	280	java/lang/RuntimeException
    //   267	291	294	java/lang/RuntimeException
  }
  
  private void aegisguard_c(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast com/github/retrooper/packetevents/wrapper/play/client/WrapperPlayClientWindowConfirmation
    //   7: astore #4
    //   9: dup
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast java/lang/Long
    //   15: invokevirtual longValue : ()J
    //   18: lstore_2
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: astore #5
    //   31: aload_0
    //   32: getfield aegisguard_Oq : Ljava/util/Map;
    //   35: aload #4
    //   37: invokevirtual getActionId : ()S
    //   40: invokestatic valueOf : (S)Ljava/lang/Short;
    //   43: aload #5
    //   45: ifnull -> 82
    //   48: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   53: ifeq -> 316
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: aload_0
    //   64: getfield aegisguard_Oq : Ljava/util/Map;
    //   67: aload #4
    //   69: invokevirtual getActionId : ()S
    //   72: invokestatic valueOf : (S)Ljava/lang/Short;
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   87: checkcast com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState
    //   90: astore #6
    //   92: aload #6
    //   94: lload_2
    //   95: lconst_0
    //   96: lcmp
    //   97: ifle -> 118
    //   100: aload #5
    //   102: ifnull -> 118
    //   105: ifnonnull -> 116
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: return
    //   116: aload #6
    //   118: invokevirtual getReason : ()Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState$Reason;
    //   121: aload #5
    //   123: ifnull -> 315
    //   126: getstatic com/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState$Reason.CHANGE_GAME_MODE : Lcom/github/retrooper/packetevents/wrapper/play/server/WrapperPlayServerChangeGameState$Reason;
    //   129: if_acmpne -> 298
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: aload #6
    //   141: aload #5
    //   143: ifnull -> 315
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: invokevirtual getValue : ()F
    //   156: f2i
    //   157: tableswitch default -> 298, 0 -> 192, 1 -> 217, 2 -> 242, 3 -> 267
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: aload_0
    //   193: lload_2
    //   194: lconst_0
    //   195: lcmp
    //   196: iflt -> 299
    //   199: getstatic org/bukkit/GameMode.SURVIVAL : Lorg/bukkit/GameMode;
    //   202: putfield aegisguard_Ol : Lorg/bukkit/GameMode;
    //   205: aload #5
    //   207: ifnonnull -> 298
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: aload_0
    //   218: lload_2
    //   219: lconst_0
    //   220: lcmp
    //   221: iflt -> 299
    //   224: getstatic org/bukkit/GameMode.CREATIVE : Lorg/bukkit/GameMode;
    //   227: putfield aegisguard_Ol : Lorg/bukkit/GameMode;
    //   230: aload #5
    //   232: ifnonnull -> 298
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: aload_0
    //   243: lload_2
    //   244: lconst_0
    //   245: lcmp
    //   246: ifle -> 299
    //   249: getstatic org/bukkit/GameMode.ADVENTURE : Lorg/bukkit/GameMode;
    //   252: putfield aegisguard_Ol : Lorg/bukkit/GameMode;
    //   255: aload #5
    //   257: ifnonnull -> 298
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   266: athrow
    //   267: iconst_0
    //   268: anewarray java/lang/Object
    //   271: invokestatic aegisguard_n : ([Ljava/lang/Object;)Z
    //   274: ifeq -> 298
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   283: athrow
    //   284: aload_0
    //   285: getstatic org/bukkit/GameMode.SPECTATOR : Lorg/bukkit/GameMode;
    //   288: putfield aegisguard_Ol : Lorg/bukkit/GameMode;
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   297: athrow
    //   298: aload_0
    //   299: getfield aegisguard_Oq : Ljava/util/Map;
    //   302: aload #4
    //   304: invokevirtual getActionId : ()S
    //   307: invokestatic valueOf : (S)Ljava/lang/Short;
    //   310: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   315: pop
    //   316: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #723	-> 31
    //   #724	-> 63
    //   #726	-> 92
    //   #728	-> 116
    //   #729	-> 139
    //   #731	-> 192
    //   #732	-> 205
    //   #734	-> 217
    //   #735	-> 230
    //   #737	-> 242
    //   #738	-> 255
    //   #740	-> 267
    //   #745	-> 298
    //   #747	-> 316
    // Exception table:
    //   from	to	target	type
    //   31	56	59	java/lang/RuntimeException
    //   48	75	78	java/lang/RuntimeException
    //   92	108	111	java/lang/RuntimeException
    //   118	132	135	java/lang/RuntimeException
    //   126	146	149	java/lang/RuntimeException
    //   139	188	188	java/lang/RuntimeException
    //   153	210	213	java/lang/RuntimeException
    //   192	235	238	java/lang/RuntimeException
    //   217	260	263	java/lang/RuntimeException
    //   242	277	280	java/lang/RuntimeException
    //   267	291	294	java/lang/RuntimeException
  }
  
  public void aegisguard_n8(Object[] paramArrayOfObject) {
    WrapperPlayClientPong wrapperPlayClientPong = (WrapperPlayClientPong)paramArrayOfObject[0];
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x5A4655D695B8L, l3 = l1 ^ 0x36D783731DB3L, l4 = l1 ^ 0x505F7D0084BBL, l5 = l1 ^ 0x17A13DEDEAB8L, l6 = l1 ^ 0x3439B8751F13L;
    new Object[2];
    aegisguard_ns(new Object[] { null, Long.valueOf(l4), wrapperPlayClientPong });
    new Object[2];
    aegisguard_ng(new Object[] { null, Long.valueOf(l6), wrapperPlayClientPong });
    new Object[2];
    aegisguard_nf(new Object[] { null, Long.valueOf(l2), wrapperPlayClientPong });
    new Object[2];
    aegisguard_nY(new Object[] { null, Long.valueOf(l5), wrapperPlayClientPong });
    (new Object[2])[1] = wrapperPlayClientPong;
    new Object[2];
    aegisguard_nZ(new Object[] { Long.valueOf(l3) });
  }
  
  public void aegisguard_H(Object[] paramArrayOfObject) {
    WrapperPlayClientWindowConfirmation wrapperPlayClientWindowConfirmation = (WrapperPlayClientWindowConfirmation)paramArrayOfObject[0];
    long l1 = ((Long)paramArrayOfObject[1]).longValue();
    l1 = a ^ l1;
    long l2 = l1 ^ 0x488E42CEADA2L, l3 = l1 ^ 0x2D7F269EC82CL, l4 = l1 ^ 0x1FF02A0B911BL, l5 = l1 ^ 0x55E753A2951BL, l6 = l1 ^ 0x44206A7656DAL;
    new Object[2];
    aegisguard_EW(new Object[] { null, Long.valueOf(l3), wrapperPlayClientWindowConfirmation });
    (new Object[2])[1] = wrapperPlayClientWindowConfirmation;
    new Object[2];
    aegisguard_EZ(new Object[] { Long.valueOf(l6) });
    new Object[2];
    aegisguard_c(new Object[] { null, Long.valueOf(l4), wrapperPlayClientWindowConfirmation });
    (new Object[2])[1] = wrapperPlayClientWindowConfirmation;
    new Object[2];
    aegisguard_Eb(new Object[] { Long.valueOf(l5) });
    (new Object[2])[1] = wrapperPlayClientWindowConfirmation;
    new Object[2];
    aegisguard_B(new Object[] { Long.valueOf(l2) });
  }
  
  public void aegisguard_Em(Object[] paramArrayOfObject) {
    this.aegisguard_OH = 0;
    this.aegisguard_D.aegisguard_x(new Object[0]).aegisguard_ML(new Object[] { Integer.valueOf(0) });
  }
  
  public void aegisguard_E5(Object[] paramArrayOfObject) {
    this.aegisguard_hN = 0;
  }
  
  public void aegisguard_zG(Object[] paramArrayOfObject) {
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
    //   14: checkcast org/bukkit/event/entity/EntityDamageEvent$DamageCause
    //   17: astore #4
    //   19: pop
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   29: astore #5
    //   31: aload #4
    //   33: aload #5
    //   35: ifnull -> 73
    //   38: ifnonnull -> 49
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: return
    //   49: aload_0
    //   50: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   53: invokevirtual aegisguard_W : ()Lme/frep/aegisguard/spigot/aegisguard_K8;
    //   56: iconst_0
    //   57: anewarray java/lang/Object
    //   60: invokevirtual aegisguard_I : ([Ljava/lang/Object;)I
    //   63: putfield aegisguard_A : I
    //   66: aload_0
    //   67: iconst_0
    //   68: putfield aegisguard_OY : I
    //   71: aload #4
    //   73: getstatic org/bukkit/event/entity/EntityDamageEvent$DamageCause.FALL : Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   76: lload_2
    //   77: lconst_0
    //   78: lcmp
    //   79: ifle -> 109
    //   82: aload #5
    //   84: ifnull -> 109
    //   87: if_acmpeq -> 124
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload #4
    //   99: getstatic org/bukkit/event/entity/EntityDamageEvent$DamageCause.SUFFOCATION : Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: if_acmpeq -> 124
    //   112: aload_0
    //   113: iconst_0
    //   114: putfield aegisguard_B : I
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: lload_2
    //   125: lconst_0
    //   126: lcmp
    //   127: ifle -> 205
    //   130: getstatic me/frep/aegisguard/spigot/aegisguard_hS.aegisguard_q : [I
    //   133: aload #4
    //   135: invokevirtual ordinal : ()I
    //   138: iaload
    //   139: tableswitch default -> 365, 1 -> 200, 2 -> 217, 3 -> 217, 4 -> 234, 5 -> 251, 6 -> 251, 7 -> 268, 8 -> 285, 9 -> 302, 10 -> 319, 11 -> 336, 12 -> 353
    //   200: aload_0
    //   201: iconst_0
    //   202: putfield aegisguard_h1 : I
    //   205: aload #5
    //   207: ifnonnull -> 365
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: aload_0
    //   218: iconst_0
    //   219: putfield aegisguard_p : I
    //   222: aload #5
    //   224: ifnonnull -> 365
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   233: athrow
    //   234: aload_0
    //   235: iconst_0
    //   236: putfield aegisguard_b : I
    //   239: aload #5
    //   241: ifnonnull -> 365
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: aload_0
    //   252: iconst_0
    //   253: putfield aegisguard_hH : I
    //   256: aload #5
    //   258: ifnonnull -> 365
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: aload_0
    //   269: iconst_0
    //   270: putfield aegisguard_hU : I
    //   273: aload #5
    //   275: ifnonnull -> 365
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: aload_0
    //   286: iconst_0
    //   287: putfield aegisguard_h9 : I
    //   290: aload #5
    //   292: ifnonnull -> 365
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   301: athrow
    //   302: aload_0
    //   303: iconst_0
    //   304: putfield aegisguard_hJ : I
    //   307: aload #5
    //   309: ifnonnull -> 365
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   318: athrow
    //   319: aload_0
    //   320: iconst_0
    //   321: putfield aegisguard_hw : I
    //   324: aload #5
    //   326: ifnonnull -> 365
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload_0
    //   337: iconst_0
    //   338: putfield aegisguard_e : I
    //   341: aload #5
    //   343: ifnonnull -> 365
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   352: athrow
    //   353: aload_0
    //   354: iconst_0
    //   355: putfield aegisguard_G : I
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   364: athrow
    //   365: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #775	-> 31
    //   #777	-> 49
    //   #779	-> 66
    //   #781	-> 71
    //   #782	-> 112
    //   #785	-> 124
    //   #787	-> 200
    //   #788	-> 205
    //   #791	-> 217
    //   #792	-> 222
    //   #794	-> 234
    //   #795	-> 239
    //   #798	-> 251
    //   #799	-> 256
    //   #801	-> 268
    //   #802	-> 273
    //   #804	-> 285
    //   #805	-> 290
    //   #807	-> 302
    //   #808	-> 307
    //   #810	-> 319
    //   #811	-> 324
    //   #813	-> 336
    //   #814	-> 341
    //   #816	-> 353
    //   #819	-> 365
    // Exception table:
    //   from	to	target	type
    //   31	41	44	java/lang/RuntimeException
    //   73	90	93	java/lang/RuntimeException
    //   87	102	105	java/lang/RuntimeException
    //   109	117	120	java/lang/RuntimeException
    //   124	210	213	java/lang/RuntimeException
    //   200	227	230	java/lang/RuntimeException
    //   217	244	247	java/lang/RuntimeException
    //   234	261	264	java/lang/RuntimeException
    //   251	278	281	java/lang/RuntimeException
    //   268	295	298	java/lang/RuntimeException
    //   285	312	315	java/lang/RuntimeException
    //   302	329	332	java/lang/RuntimeException
    //   319	346	349	java/lang/RuntimeException
    //   336	358	361	java/lang/RuntimeException
  }
  
  public void aegisguard_El(Object[] paramArrayOfObject) {
    this.aegisguard_s = 0;
  }
  
  public void aegisguard_U(Object[] paramArrayOfObject) {
    this.aegisguard_r = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_ET(Object[] paramArrayOfObject) {
    this.aegisguard_n = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_tJ(Object[] paramArrayOfObject) {
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
    //   20: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   23: lload_2
    //   24: lxor
    //   25: lstore_2
    //   26: lload_2
    //   27: dup2
    //   28: ldc2_w 17038247891769
    //   31: lxor
    //   32: lstore #5
    //   34: pop2
    //   35: aload_0
    //   36: iconst_0
    //   37: putfield aegisguard_OM : Z
    //   40: aload_0
    //   41: iconst_0
    //   42: putfield aegisguard_ht : Z
    //   45: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield aegisguard_hb : Z
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield aegisguard_Om : Z
    //   58: aload_0
    //   59: dup
    //   60: getfield aegisguard_v : I
    //   63: iconst_1
    //   64: iadd
    //   65: putfield aegisguard_v : I
    //   68: aload_0
    //   69: dup
    //   70: getfield aegisguard_hH : I
    //   73: iconst_1
    //   74: iadd
    //   75: putfield aegisguard_hH : I
    //   78: aload_0
    //   79: dup
    //   80: getfield aegisguard_h9 : I
    //   83: iconst_1
    //   84: iadd
    //   85: putfield aegisguard_h9 : I
    //   88: aload_0
    //   89: dup
    //   90: getfield aegisguard_hU : I
    //   93: iconst_1
    //   94: iadd
    //   95: putfield aegisguard_hU : I
    //   98: aload_0
    //   99: dup
    //   100: getfield aegisguard_K : I
    //   103: iconst_1
    //   104: iadd
    //   105: putfield aegisguard_K : I
    //   108: aload_0
    //   109: dup
    //   110: getfield aegisguard_b : I
    //   113: iconst_1
    //   114: iadd
    //   115: putfield aegisguard_b : I
    //   118: astore #7
    //   120: aload_0
    //   121: dup
    //   122: getfield aegisguard_B : I
    //   125: iconst_1
    //   126: iadd
    //   127: putfield aegisguard_B : I
    //   130: aload_0
    //   131: dup
    //   132: getfield aegisguard_hw : I
    //   135: iconst_1
    //   136: iadd
    //   137: putfield aegisguard_hw : I
    //   140: aload_0
    //   141: dup
    //   142: getfield aegisguard_OF : I
    //   145: iconst_1
    //   146: iadd
    //   147: putfield aegisguard_OF : I
    //   150: aload_0
    //   151: dup
    //   152: getfield aegisguard_hJ : I
    //   155: iconst_1
    //   156: iadd
    //   157: putfield aegisguard_hJ : I
    //   160: aload_0
    //   161: dup
    //   162: getfield aegisguard_h1 : I
    //   165: iconst_1
    //   166: iadd
    //   167: putfield aegisguard_h1 : I
    //   170: aload_0
    //   171: dup
    //   172: getfield aegisguard_OG : I
    //   175: iconst_1
    //   176: iadd
    //   177: putfield aegisguard_OG : I
    //   180: aload_0
    //   181: dup
    //   182: getfield aegisguard_e : I
    //   185: iconst_1
    //   186: iadd
    //   187: putfield aegisguard_e : I
    //   190: aload_0
    //   191: dup
    //   192: getfield aegisguard_G : I
    //   195: iconst_1
    //   196: iadd
    //   197: putfield aegisguard_G : I
    //   200: aload_0
    //   201: dup
    //   202: getfield aegisguard_OI : I
    //   205: iconst_1
    //   206: iadd
    //   207: putfield aegisguard_OI : I
    //   210: aload_0
    //   211: dup
    //   212: getfield aegisguard_k : I
    //   215: iconst_1
    //   216: iadd
    //   217: putfield aegisguard_k : I
    //   220: aload_0
    //   221: dup
    //   222: getfield aegisguard_hm : I
    //   225: iconst_1
    //   226: iadd
    //   227: putfield aegisguard_hm : I
    //   230: aload_0
    //   231: dup
    //   232: getfield aegisguard_p : I
    //   235: iconst_1
    //   236: iadd
    //   237: putfield aegisguard_p : I
    //   240: aload_0
    //   241: dup
    //   242: getfield aegisguard_J : I
    //   245: iconst_1
    //   246: iadd
    //   247: putfield aegisguard_J : I
    //   250: aload_0
    //   251: dup
    //   252: getfield aegisguard_Z : I
    //   255: iconst_1
    //   256: iadd
    //   257: putfield aegisguard_Z : I
    //   260: aload_0
    //   261: dup
    //   262: getfield aegisguard_ho : I
    //   265: iconst_1
    //   266: iadd
    //   267: putfield aegisguard_ho : I
    //   270: aload_0
    //   271: dup
    //   272: getfield aegisguard_O : I
    //   275: iconst_1
    //   276: iadd
    //   277: putfield aegisguard_O : I
    //   280: aload_0
    //   281: dup
    //   282: getfield aegisguard_hD : I
    //   285: iconst_1
    //   286: iadd
    //   287: putfield aegisguard_hD : I
    //   290: aload_0
    //   291: dup
    //   292: getfield aegisguard_ON : I
    //   295: iconst_1
    //   296: iadd
    //   297: putfield aegisguard_ON : I
    //   300: aload_0
    //   301: dup
    //   302: getfield aegisguard_Oy : I
    //   305: iconst_1
    //   306: iadd
    //   307: putfield aegisguard_Oy : I
    //   310: aload_0
    //   311: dup
    //   312: getfield aegisguard_d : I
    //   315: iconst_1
    //   316: iadd
    //   317: putfield aegisguard_d : I
    //   320: aload_0
    //   321: dup
    //   322: getfield aegisguard_hQ : I
    //   325: iconst_1
    //   326: iadd
    //   327: putfield aegisguard_hQ : I
    //   330: aload_0
    //   331: dup
    //   332: getfield aegisguard_OH : I
    //   335: iconst_1
    //   336: iadd
    //   337: putfield aegisguard_OH : I
    //   340: aload_0
    //   341: dup
    //   342: getfield aegisguard_Y : I
    //   345: iconst_1
    //   346: iadd
    //   347: putfield aegisguard_Y : I
    //   350: aload_0
    //   351: dup
    //   352: getfield aegisguard_OC : I
    //   355: iconst_1
    //   356: iadd
    //   357: putfield aegisguard_OC : I
    //   360: aload_0
    //   361: dup
    //   362: getfield aegisguard_hN : I
    //   365: iconst_1
    //   366: iadd
    //   367: putfield aegisguard_hN : I
    //   370: aload_0
    //   371: dup
    //   372: getfield aegisguard_hx : I
    //   375: iconst_1
    //   376: iadd
    //   377: putfield aegisguard_hx : I
    //   380: aload_0
    //   381: dup
    //   382: getfield aegisguard_OT : I
    //   385: iconst_1
    //   386: iadd
    //   387: putfield aegisguard_OT : I
    //   390: aload_0
    //   391: dup
    //   392: getfield aegisguard_Or : I
    //   395: iconst_1
    //   396: iadd
    //   397: putfield aegisguard_Or : I
    //   400: aload_0
    //   401: dup
    //   402: getfield aegisguard_z : I
    //   405: iconst_1
    //   406: iadd
    //   407: putfield aegisguard_z : I
    //   410: aload_0
    //   411: dup
    //   412: getfield aegisguard_O8 : I
    //   415: iconst_1
    //   416: iadd
    //   417: putfield aegisguard_O8 : I
    //   420: aload_0
    //   421: dup
    //   422: getfield aegisguard_O4 : I
    //   425: iconst_1
    //   426: iadd
    //   427: putfield aegisguard_O4 : I
    //   430: aload_0
    //   431: dup
    //   432: getfield aegisguard_OP : I
    //   435: iconst_1
    //   436: iadd
    //   437: putfield aegisguard_OP : I
    //   440: aload_0
    //   441: dup
    //   442: getfield aegisguard_s : I
    //   445: iconst_1
    //   446: iadd
    //   447: putfield aegisguard_s : I
    //   450: aload_0
    //   451: dup
    //   452: getfield aegisguard_hP : I
    //   455: iconst_1
    //   456: iadd
    //   457: putfield aegisguard_hP : I
    //   460: aload_0
    //   461: dup
    //   462: getfield aegisguard_hK : I
    //   465: iconst_1
    //   466: iadd
    //   467: putfield aegisguard_hK : I
    //   470: aload_0
    //   471: dup
    //   472: getfield aegisguard_OY : I
    //   475: iconst_1
    //   476: iadd
    //   477: putfield aegisguard_OY : I
    //   480: aload_0
    //   481: dup
    //   482: getfield aegisguard_Oz : I
    //   485: iconst_1
    //   486: iadd
    //   487: putfield aegisguard_Oz : I
    //   490: aload_0
    //   491: dup
    //   492: getfield aegisguard_h2 : I
    //   495: iconst_1
    //   496: iadd
    //   497: putfield aegisguard_h2 : I
    //   500: aload_0
    //   501: dup
    //   502: getfield aegisguard_h8 : I
    //   505: iconst_1
    //   506: iadd
    //   507: putfield aegisguard_h8 : I
    //   510: aload_0
    //   511: dup
    //   512: getfield aegisguard_M : I
    //   515: iconst_1
    //   516: iadd
    //   517: putfield aegisguard_M : I
    //   520: aload_0
    //   521: dup
    //   522: getfield aegisguard_Oj : I
    //   525: iconst_1
    //   526: iadd
    //   527: putfield aegisguard_Oj : I
    //   530: aload_0
    //   531: aload #7
    //   533: ifnull -> 587
    //   536: getfield aegisguard_h5 : Z
    //   539: ifeq -> 586
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   548: athrow
    //   549: aload_0
    //   550: iconst_0
    //   551: putfield aegisguard_hT : I
    //   554: lload_2
    //   555: lconst_0
    //   556: lcmp
    //   557: ifle -> 626
    //   560: aload #7
    //   562: ifnonnull -> 596
    //   565: goto -> 572
    //   568: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   571: athrow
    //   572: iconst_5
    //   573: anewarray me/frep/aegisguard/spigot/check/AbstractCheck
    //   576: invokestatic aegisguard_g : ([Lme/frep/aegisguard/spigot/check/AbstractCheck;)V
    //   579: goto -> 586
    //   582: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   585: athrow
    //   586: aload_0
    //   587: dup
    //   588: getfield aegisguard_hT : I
    //   591: iconst_1
    //   592: iadd
    //   593: putfield aegisguard_hT : I
    //   596: aload_0
    //   597: dup
    //   598: getfield aegisguard_Oa : I
    //   601: iconst_1
    //   602: iadd
    //   603: putfield aegisguard_Oa : I
    //   606: aload_0
    //   607: aload_0
    //   608: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   611: iconst_0
    //   612: anewarray java/lang/Object
    //   615: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   618: invokeinterface getHealth : ()D
    //   623: putfield aegisguard_Oh : D
    //   626: aload #4
    //   628: invokevirtual hasPositionChanged : ()Z
    //   631: lload_2
    //   632: lconst_0
    //   633: lcmp
    //   634: iflt -> 794
    //   637: aload #7
    //   639: ifnull -> 794
    //   642: ifeq -> 1917
    //   645: goto -> 652
    //   648: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   651: athrow
    //   652: aload_0
    //   653: dup
    //   654: getfield aegisguard_hV : I
    //   657: iconst_1
    //   658: iadd
    //   659: putfield aegisguard_hV : I
    //   662: aload_0
    //   663: aload_0
    //   664: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   667: iconst_0
    //   668: anewarray java/lang/Object
    //   671: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   674: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   679: invokeinterface getHelmet : ()Lorg/bukkit/inventory/ItemStack;
    //   684: putfield aegisguard_OE : Lorg/bukkit/inventory/ItemStack;
    //   687: aload_0
    //   688: aload_0
    //   689: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   692: iconst_0
    //   693: anewarray java/lang/Object
    //   696: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   699: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   704: invokeinterface getChestplate : ()Lorg/bukkit/inventory/ItemStack;
    //   709: putfield aegisguard_Ov : Lorg/bukkit/inventory/ItemStack;
    //   712: aload_0
    //   713: aload_0
    //   714: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   717: iconst_0
    //   718: anewarray java/lang/Object
    //   721: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   724: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   729: invokeinterface getLeggings : ()Lorg/bukkit/inventory/ItemStack;
    //   734: putfield aegisguard_Og : Lorg/bukkit/inventory/ItemStack;
    //   737: aload_0
    //   738: aload #7
    //   740: lload_2
    //   741: lconst_0
    //   742: lcmp
    //   743: iflt -> 834
    //   746: ifnull -> 830
    //   749: goto -> 756
    //   752: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   755: athrow
    //   756: aload_0
    //   757: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   760: iconst_0
    //   761: anewarray java/lang/Object
    //   764: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   767: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   772: invokeinterface getBoots : ()Lorg/bukkit/inventory/ItemStack;
    //   777: putfield aegisguard_OB : Lorg/bukkit/inventory/ItemStack;
    //   780: iconst_0
    //   781: anewarray java/lang/Object
    //   784: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   787: goto -> 794
    //   790: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   793: athrow
    //   794: ifeq -> 829
    //   797: aload_0
    //   798: aload_0
    //   799: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   802: iconst_0
    //   803: anewarray java/lang/Object
    //   806: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   809: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   814: invokeinterface getItemInOffHand : ()Lorg/bukkit/inventory/ItemStack;
    //   819: putfield aegisguard_O7 : Lorg/bukkit/inventory/ItemStack;
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   828: athrow
    //   829: aload_0
    //   830: iconst_0
    //   831: anewarray java/lang/Object
    //   834: invokestatic aegisguard_n : ([Ljava/lang/Object;)Z
    //   837: ifeq -> 908
    //   840: aload_0
    //   841: getfield aegisguard_OB : Lorg/bukkit/inventory/ItemStack;
    //   844: lload_2
    //   845: lconst_0
    //   846: lcmp
    //   847: ifle -> 883
    //   850: aload #7
    //   852: ifnull -> 883
    //   855: goto -> 862
    //   858: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   861: athrow
    //   862: ifnull -> 908
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   871: athrow
    //   872: aload_0
    //   873: getfield aegisguard_OB : Lorg/bukkit/inventory/ItemStack;
    //   876: goto -> 883
    //   879: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   882: athrow
    //   883: getstatic org/bukkit/enchantments/Enchantment.DEPTH_STRIDER : Lorg/bukkit/enchantments/Enchantment;
    //   886: invokevirtual containsEnchantment : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   889: aload #7
    //   891: ifnull -> 905
    //   894: ifeq -> 908
    //   897: goto -> 904
    //   900: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   903: athrow
    //   904: iconst_1
    //   905: goto -> 909
    //   908: iconst_0
    //   909: putfield aegisguard_F : Z
    //   912: aload_0
    //   913: iconst_0
    //   914: anewarray java/lang/Object
    //   917: invokestatic aegisguard_Z : ([Ljava/lang/Object;)Z
    //   920: ifeq -> 991
    //   923: aload_0
    //   924: getfield aegisguard_Og : Lorg/bukkit/inventory/ItemStack;
    //   927: lload_2
    //   928: lconst_0
    //   929: lcmp
    //   930: iflt -> 966
    //   933: aload #7
    //   935: ifnull -> 966
    //   938: goto -> 945
    //   941: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   944: athrow
    //   945: ifnull -> 991
    //   948: goto -> 955
    //   951: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   954: athrow
    //   955: aload_0
    //   956: getfield aegisguard_Og : Lorg/bukkit/inventory/ItemStack;
    //   959: goto -> 966
    //   962: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   965: athrow
    //   966: getstatic org/bukkit/enchantments/Enchantment.SWIFT_SNEAK : Lorg/bukkit/enchantments/Enchantment;
    //   969: invokevirtual containsEnchantment : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   972: aload #7
    //   974: ifnull -> 988
    //   977: ifeq -> 991
    //   980: goto -> 987
    //   983: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   986: athrow
    //   987: iconst_1
    //   988: goto -> 992
    //   991: iconst_0
    //   992: putfield aegisguard_hn : Z
    //   995: aload_0
    //   996: iconst_0
    //   997: anewarray java/lang/Object
    //   1000: invokestatic aegisguard_y : ([Ljava/lang/Object;)Z
    //   1003: ifeq -> 1082
    //   1006: aload_0
    //   1007: getfield aegisguard_Ov : Lorg/bukkit/inventory/ItemStack;
    //   1010: lload_2
    //   1011: lconst_0
    //   1012: lcmp
    //   1013: iflt -> 1049
    //   1016: aload #7
    //   1018: ifnull -> 1049
    //   1021: goto -> 1028
    //   1024: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1027: athrow
    //   1028: ifnull -> 1082
    //   1031: goto -> 1038
    //   1034: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1037: athrow
    //   1038: aload_0
    //   1039: getfield aegisguard_Ov : Lorg/bukkit/inventory/ItemStack;
    //   1042: goto -> 1049
    //   1045: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1048: athrow
    //   1049: invokevirtual getType : ()Lorg/bukkit/Material;
    //   1052: invokevirtual toString : ()Ljava/lang/String;
    //   1055: getstatic me/frep/aegisguard/spigot/aegisguard_KB.b : [Ljava/lang/String;
    //   1058: iconst_3
    //   1059: aaload
    //   1060: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1063: aload #7
    //   1065: ifnull -> 1079
    //   1068: ifeq -> 1082
    //   1071: goto -> 1078
    //   1074: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1077: athrow
    //   1078: iconst_1
    //   1079: goto -> 1083
    //   1082: iconst_0
    //   1083: putfield aegisguard_hi : Z
    //   1086: aload_0
    //   1087: aload_0
    //   1088: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   1091: iconst_0
    //   1092: anewarray java/lang/Object
    //   1095: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   1098: lload #5
    //   1100: iconst_2
    //   1101: anewarray java/lang/Object
    //   1104: dup_x2
    //   1105: dup_x2
    //   1106: pop
    //   1107: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1110: iconst_1
    //   1111: swap
    //   1112: aastore
    //   1113: dup_x1
    //   1114: swap
    //   1115: iconst_0
    //   1116: swap
    //   1117: aastore
    //   1118: invokestatic aegisguard_H : ([Ljava/lang/Object;)Z
    //   1121: putfield aegisguard_j : Z
    //   1124: aload_0
    //   1125: getfield aegisguard_j : Z
    //   1128: aload #7
    //   1130: ifnull -> 1199
    //   1133: ifeq -> 1172
    //   1136: goto -> 1143
    //   1139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1142: athrow
    //   1143: aload_0
    //   1144: aload_0
    //   1145: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   1148: iconst_0
    //   1149: anewarray java/lang/Object
    //   1152: invokevirtual aegisguard_x : ([Ljava/lang/Object;)Lme/frep/aegisguard/spigot/aegisguard_Ke;
    //   1155: iconst_0
    //   1156: anewarray java/lang/Object
    //   1159: invokevirtual aegisguard_T : ([Ljava/lang/Object;)D
    //   1162: putfield aegisguard_t : D
    //   1165: goto -> 1172
    //   1168: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1171: athrow
    //   1172: aload_0
    //   1173: iconst_0
    //   1174: putfield aegisguard_OS : Z
    //   1177: aload_0
    //   1178: aload #7
    //   1180: lload_2
    //   1181: lconst_0
    //   1182: lcmp
    //   1183: ifle -> 1205
    //   1186: ifnull -> 1203
    //   1189: getfield aegisguard_l : Z
    //   1192: goto -> 1199
    //   1195: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1198: athrow
    //   1199: ifeq -> 1236
    //   1202: aload_0
    //   1203: aload #7
    //   1205: ifnull -> 1232
    //   1208: getfield aegisguard_ha : Lcom/github/retrooper/packetevents/protocol/entity/pose/EntityPose;
    //   1211: getstatic com/github/retrooper/packetevents/protocol/entity/pose/EntityPose.FALL_FLYING : Lcom/github/retrooper/packetevents/protocol/entity/pose/EntityPose;
    //   1214: if_acmpeq -> 1236
    //   1217: goto -> 1224
    //   1220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1223: athrow
    //   1224: aload_0
    //   1225: goto -> 1232
    //   1228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1231: athrow
    //   1232: iconst_0
    //   1233: putfield aegisguard_l : Z
    //   1236: aload #4
    //   1238: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   1241: invokevirtual getX : ()D
    //   1244: dstore #8
    //   1246: aload #4
    //   1248: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   1251: invokevirtual getY : ()D
    //   1254: dstore #10
    //   1256: aload #4
    //   1258: invokevirtual getLocation : ()Lcom/github/retrooper/packetevents/protocol/world/Location;
    //   1261: invokevirtual getZ : ()D
    //   1264: dstore #12
    //   1266: aload_0
    //   1267: aload #7
    //   1269: ifnull -> 1321
    //   1272: getfield aegisguard_N : Z
    //   1275: ifeq -> 1313
    //   1278: goto -> 1285
    //   1281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1284: athrow
    //   1285: aload_0
    //   1286: dup
    //   1287: getfield aegisguard_hS : I
    //   1290: iconst_1
    //   1291: iadd
    //   1292: putfield aegisguard_hS : I
    //   1295: lload_2
    //   1296: lconst_0
    //   1297: lcmp
    //   1298: iflt -> 1325
    //   1301: aload #7
    //   1303: ifnonnull -> 1325
    //   1306: goto -> 1313
    //   1309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1312: athrow
    //   1313: aload_0
    //   1314: goto -> 1321
    //   1317: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1320: athrow
    //   1321: iconst_0
    //   1322: putfield aegisguard_hS : I
    //   1325: aload_0
    //   1326: aload #7
    //   1328: ifnull -> 1380
    //   1331: getfield aegisguard_N : Z
    //   1334: ifne -> 1372
    //   1337: goto -> 1344
    //   1340: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1343: athrow
    //   1344: aload_0
    //   1345: dup
    //   1346: getfield aegisguard_Ou : I
    //   1349: iconst_1
    //   1350: iadd
    //   1351: putfield aegisguard_Ou : I
    //   1354: lload_2
    //   1355: lconst_0
    //   1356: lcmp
    //   1357: ifle -> 1384
    //   1360: aload #7
    //   1362: ifnonnull -> 1384
    //   1365: goto -> 1372
    //   1368: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1371: athrow
    //   1372: aload_0
    //   1373: goto -> 1380
    //   1376: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1379: athrow
    //   1380: iconst_0
    //   1381: putfield aegisguard_Ou : I
    //   1384: aload_0
    //   1385: getfield aegisguard_OK : D
    //   1388: dconst_0
    //   1389: dcmpl
    //   1390: aload #7
    //   1392: ifnull -> 1575
    //   1395: ifeq -> 1559
    //   1398: goto -> 1405
    //   1401: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1404: athrow
    //   1405: aload_0
    //   1406: getfield aegisguard_hl : D
    //   1409: dconst_0
    //   1410: dcmpl
    //   1411: aload #7
    //   1413: ifnull -> 1575
    //   1416: goto -> 1423
    //   1419: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1422: athrow
    //   1423: ifeq -> 1559
    //   1426: goto -> 1433
    //   1429: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1432: athrow
    //   1433: aload_0
    //   1434: dload #8
    //   1436: aload_0
    //   1437: getfield aegisguard_OK : D
    //   1440: dsub
    //   1441: invokestatic abs : (D)D
    //   1444: dload #10
    //   1446: aload_0
    //   1447: getfield aegisguard_u : D
    //   1450: dsub
    //   1451: invokestatic abs : (D)D
    //   1454: dload #12
    //   1456: aload_0
    //   1457: getfield aegisguard_hl : D
    //   1460: dsub
    //   1461: invokestatic abs : (D)D
    //   1464: iconst_3
    //   1465: anewarray java/lang/Object
    //   1468: dup_x2
    //   1469: dup_x2
    //   1470: pop
    //   1471: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1474: iconst_2
    //   1475: swap
    //   1476: aastore
    //   1477: dup_x2
    //   1478: dup_x2
    //   1479: pop
    //   1480: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1483: iconst_1
    //   1484: swap
    //   1485: aastore
    //   1486: dup_x2
    //   1487: dup_x2
    //   1488: pop
    //   1489: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1492: iconst_0
    //   1493: swap
    //   1494: aastore
    //   1495: invokestatic aegisguard_z : ([Ljava/lang/Object;)D
    //   1498: putfield aegisguard_hZ : D
    //   1501: aload_0
    //   1502: getfield aegisguard_hZ : D
    //   1505: ldc2_w 8.0
    //   1508: dcmpl
    //   1509: lload_2
    //   1510: lconst_0
    //   1511: lcmp
    //   1512: iflt -> 1575
    //   1515: aload #7
    //   1517: ifnull -> 1575
    //   1520: goto -> 1527
    //   1523: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1526: athrow
    //   1527: ifle -> 1559
    //   1530: goto -> 1537
    //   1533: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1536: athrow
    //   1537: aload_0
    //   1538: aload_0
    //   1539: aload_0
    //   1540: dconst_0
    //   1541: dup2_x1
    //   1542: putfield aegisguard_hZ : D
    //   1545: dup2_x1
    //   1546: putfield aegisguard_hl : D
    //   1549: putfield aegisguard_OK : D
    //   1552: goto -> 1559
    //   1555: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1558: athrow
    //   1559: aload_0
    //   1560: aload #7
    //   1562: ifnull -> 1754
    //   1565: getfield aegisguard_O6 : I
    //   1568: goto -> 1575
    //   1571: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1574: athrow
    //   1575: ifeq -> 1753
    //   1578: aload_0
    //   1579: aload #7
    //   1581: ifnull -> 1754
    //   1584: goto -> 1591
    //   1587: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1590: athrow
    //   1591: getfield aegisguard_OD : I
    //   1594: ifeq -> 1753
    //   1597: goto -> 1604
    //   1600: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1603: athrow
    //   1604: aload_0
    //   1605: aload #7
    //   1607: ifnull -> 1754
    //   1610: goto -> 1617
    //   1613: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1616: athrow
    //   1617: getfield aegisguard_Oe : I
    //   1620: ifeq -> 1753
    //   1623: goto -> 1630
    //   1626: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1629: athrow
    //   1630: aload_0
    //   1631: dload #8
    //   1633: aload_0
    //   1634: getfield aegisguard_O6 : I
    //   1637: i2d
    //   1638: dsub
    //   1639: invokestatic abs : (D)D
    //   1642: dload #10
    //   1644: aload_0
    //   1645: getfield aegisguard_OD : I
    //   1648: i2d
    //   1649: dsub
    //   1650: invokestatic abs : (D)D
    //   1653: dload #12
    //   1655: aload_0
    //   1656: getfield aegisguard_Oe : I
    //   1659: i2d
    //   1660: dsub
    //   1661: invokestatic abs : (D)D
    //   1664: iconst_3
    //   1665: anewarray java/lang/Object
    //   1668: dup_x2
    //   1669: dup_x2
    //   1670: pop
    //   1671: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1674: iconst_2
    //   1675: swap
    //   1676: aastore
    //   1677: dup_x2
    //   1678: dup_x2
    //   1679: pop
    //   1680: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1683: iconst_1
    //   1684: swap
    //   1685: aastore
    //   1686: dup_x2
    //   1687: dup_x2
    //   1688: pop
    //   1689: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1692: iconst_0
    //   1693: swap
    //   1694: aastore
    //   1695: invokestatic aegisguard_z : ([Ljava/lang/Object;)D
    //   1698: putfield aegisguard_Oc : D
    //   1701: aload_0
    //   1702: aload #7
    //   1704: ifnull -> 1754
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1713: athrow
    //   1714: getfield aegisguard_Oc : D
    //   1717: ldc2_w 12.0
    //   1720: dcmpl
    //   1721: ifle -> 1753
    //   1724: goto -> 1731
    //   1727: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1730: athrow
    //   1731: aload_0
    //   1732: aload_0
    //   1733: aload_0
    //   1734: iconst_0
    //   1735: dup_x1
    //   1736: putfield aegisguard_Oe : I
    //   1739: dup_x1
    //   1740: putfield aegisguard_OD : I
    //   1743: putfield aegisguard_O6 : I
    //   1746: goto -> 1753
    //   1749: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1752: athrow
    //   1753: aload_0
    //   1754: getfield aegisguard_OZ : Lme/frep/aegisguard/spigot/aegisguard_hg;
    //   1757: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1760: astore #14
    //   1762: aload #14
    //   1764: invokeinterface hasNext : ()Z
    //   1769: ifeq -> 1917
    //   1772: aload #14
    //   1774: invokeinterface next : ()Ljava/lang/Object;
    //   1779: checkcast org/bukkit/util/Vector
    //   1782: astore #15
    //   1784: aload #15
    //   1786: invokevirtual getX : ()D
    //   1789: dload #8
    //   1791: dsub
    //   1792: invokestatic abs : (D)D
    //   1795: dstore #16
    //   1797: aload #15
    //   1799: invokevirtual getY : ()D
    //   1802: dload #10
    //   1804: dsub
    //   1805: invokestatic abs : (D)D
    //   1808: dstore #18
    //   1810: aload #15
    //   1812: invokevirtual getZ : ()D
    //   1815: dload #12
    //   1817: dsub
    //   1818: invokestatic abs : (D)D
    //   1821: dstore #20
    //   1823: dload #16
    //   1825: ldc2_w 0.03
    //   1828: dcmpg
    //   1829: aload #7
    //   1831: lload_2
    //   1832: lconst_0
    //   1833: lcmp
    //   1834: ifle -> 1871
    //   1837: ifnull -> 1863
    //   1840: ifgt -> 1912
    //   1843: goto -> 1850
    //   1846: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1849: athrow
    //   1850: dload #18
    //   1852: ldc2_w 0.03
    //   1855: dcmpg
    //   1856: goto -> 1863
    //   1859: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1862: athrow
    //   1863: lload_2
    //   1864: lconst_0
    //   1865: lcmp
    //   1866: ifle -> 1897
    //   1869: aload #7
    //   1871: ifnull -> 1897
    //   1874: ifgt -> 1912
    //   1877: goto -> 1884
    //   1880: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1883: athrow
    //   1884: dload #20
    //   1886: ldc2_w 0.03
    //   1889: dcmpg
    //   1890: goto -> 1897
    //   1893: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1896: athrow
    //   1897: ifgt -> 1912
    //   1900: aload_0
    //   1901: iconst_1
    //   1902: putfield aegisguard_OS : Z
    //   1905: goto -> 1912
    //   1908: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1911: athrow
    //   1912: aload #7
    //   1914: ifnonnull -> 1762
    //   1917: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #834	-> 35
    //   #835	-> 40
    //   #836	-> 48
    //   #837	-> 53
    //   #839	-> 58
    //   #840	-> 68
    //   #841	-> 78
    //   #842	-> 88
    //   #843	-> 98
    //   #844	-> 108
    //   #845	-> 120
    //   #846	-> 130
    //   #847	-> 140
    //   #848	-> 150
    //   #849	-> 160
    //   #850	-> 170
    //   #851	-> 180
    //   #852	-> 190
    //   #853	-> 200
    //   #854	-> 210
    //   #855	-> 220
    //   #856	-> 230
    //   #857	-> 240
    //   #858	-> 250
    //   #859	-> 260
    //   #860	-> 270
    //   #861	-> 280
    //   #862	-> 290
    //   #863	-> 300
    //   #864	-> 310
    //   #865	-> 320
    //   #866	-> 330
    //   #867	-> 340
    //   #868	-> 350
    //   #869	-> 360
    //   #870	-> 370
    //   #871	-> 380
    //   #872	-> 390
    //   #873	-> 400
    //   #874	-> 410
    //   #875	-> 420
    //   #876	-> 430
    //   #877	-> 440
    //   #878	-> 450
    //   #879	-> 460
    //   #880	-> 470
    //   #881	-> 480
    //   #882	-> 490
    //   #883	-> 500
    //   #884	-> 510
    //   #885	-> 520
    //   #887	-> 530
    //   #888	-> 586
    //   #890	-> 596
    //   #892	-> 606
    //   #894	-> 626
    //   #895	-> 652
    //   #897	-> 662
    //   #898	-> 687
    //   #899	-> 712
    //   #900	-> 737
    //   #902	-> 780
    //   #904	-> 829
    //   #905	-> 886
    //   #907	-> 912
    //   #909	-> 995
    //   #911	-> 1086
    //   #913	-> 1124
    //   #915	-> 1172
    //   #917	-> 1177
    //   #919	-> 1236
    //   #920	-> 1246
    //   #921	-> 1256
    //   #923	-> 1266
    //   #924	-> 1313
    //   #926	-> 1325
    //   #927	-> 1372
    //   #929	-> 1384
    //   #931	-> 1433
    //   #933	-> 1501
    //   #934	-> 1537
    //   #938	-> 1559
    //   #940	-> 1630
    //   #942	-> 1701
    //   #943	-> 1731
    //   #947	-> 1753
    //   #948	-> 1784
    //   #949	-> 1797
    //   #950	-> 1810
    //   #952	-> 1823
    //   #953	-> 1900
    //   #955	-> 1912
    //   #957	-> 1917
    // Exception table:
    //   from	to	target	type
    //   120	542	545	java/lang/RuntimeException
    //   536	565	568	java/lang/RuntimeException
    //   549	579	582	java/lang/RuntimeException
    //   596	645	648	java/lang/RuntimeException
    //   642	749	752	java/lang/RuntimeException
    //   652	787	790	java/lang/RuntimeException
    //   794	822	825	java/lang/RuntimeException
    //   830	855	858	java/lang/RuntimeException
    //   840	865	868	java/lang/RuntimeException
    //   862	876	879	java/lang/RuntimeException
    //   883	897	900	java/lang/RuntimeException
    //   909	938	941	java/lang/RuntimeException
    //   923	948	951	java/lang/RuntimeException
    //   945	959	962	java/lang/RuntimeException
    //   966	980	983	java/lang/RuntimeException
    //   992	1021	1024	java/lang/RuntimeException
    //   1006	1031	1034	java/lang/RuntimeException
    //   1028	1042	1045	java/lang/RuntimeException
    //   1049	1071	1074	java/lang/RuntimeException
    //   1083	1136	1139	java/lang/RuntimeException
    //   1133	1165	1168	java/lang/RuntimeException
    //   1172	1192	1195	java/lang/RuntimeException
    //   1203	1217	1220	java/lang/RuntimeException
    //   1208	1225	1228	java/lang/RuntimeException
    //   1266	1278	1281	java/lang/RuntimeException
    //   1272	1306	1309	java/lang/RuntimeException
    //   1285	1314	1317	java/lang/RuntimeException
    //   1325	1337	1340	java/lang/RuntimeException
    //   1331	1365	1368	java/lang/RuntimeException
    //   1344	1373	1376	java/lang/RuntimeException
    //   1384	1398	1401	java/lang/RuntimeException
    //   1395	1416	1419	java/lang/RuntimeException
    //   1405	1426	1429	java/lang/RuntimeException
    //   1423	1520	1523	java/lang/RuntimeException
    //   1433	1530	1533	java/lang/RuntimeException
    //   1527	1552	1555	java/lang/RuntimeException
    //   1559	1568	1571	java/lang/RuntimeException
    //   1575	1584	1587	java/lang/RuntimeException
    //   1578	1597	1600	java/lang/RuntimeException
    //   1591	1610	1613	java/lang/RuntimeException
    //   1604	1623	1626	java/lang/RuntimeException
    //   1617	1707	1710	java/lang/RuntimeException
    //   1630	1724	1727	java/lang/RuntimeException
    //   1714	1746	1749	java/lang/RuntimeException
    //   1823	1843	1846	java/lang/RuntimeException
    //   1840	1856	1859	java/lang/RuntimeException
    //   1863	1877	1880	java/lang/RuntimeException
    //   1874	1890	1893	java/lang/RuntimeException
    //   1897	1905	1908	java/lang/RuntimeException
  }
  
  public void aegisguard_Ez(Object[] paramArrayOfObject) {
    this.aegisguard_d = 0;
  }
  
  public void aegisguard_x(Object[] paramArrayOfObject) {
    this.aegisguard_hP = 0;
  }
  
  public void aegisguard_EE(Object[] paramArrayOfObject) {
    this.aegisguard_Oz = 0;
  }
  
  public void aegisguard_Ev(Object[] paramArrayOfObject) {
    this.aegisguard_O8 = 0;
  }
  
  public void aegisguard_E1(Object[] paramArrayOfObject) {
    this.aegisguard_ON = 0;
  }
  
  public void aegisguard_Eh(Object[] paramArrayOfObject) {
    this.aegisguard_z = 0;
  }
  
  public void aegisguard_Et(Object[] paramArrayOfObject) {
    this.aegisguard_O0 = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_Ed(Object[] paramArrayOfObject) {
    this.aegisguard_hI = aegisguard_K.INSTANCE.aegisguard_W().aegisguard_I(new Object[0]);
  }
  
  public void aegisguard_pC(Object[] paramArrayOfObject) {
    WrapperPlayServerPlayerAbilities wrapperPlayServerPlayerAbilities = (WrapperPlayServerPlayerAbilities)paramArrayOfObject[0];
    this.aegisguard_hK = 0;
  }
  
  public void aegisguard_E0(Object[] paramArrayOfObject) {
    this.aegisguard_Y = 0;
  }
  
  public void aegisguard_EA(Object[] paramArrayOfObject) {
    BlockPlaceEvent blockPlaceEvent = (BlockPlaceEvent)paramArrayOfObject[0];
    this.aegisguard_O6 = blockPlaceEvent.getBlockPlaced().getX();
    this.aegisguard_OD = blockPlaceEvent.getBlockPlaced().getY();
    this.aegisguard_Oe = blockPlaceEvent.getBlockPlaced().getZ();
  }
  
  public void aegisguard_Ef(Object[] paramArrayOfObject) {
    this.aegisguard_OT = 0;
  }
  
  public void aegisguard_Ej(Object[] paramArrayOfObject) {
    this.aegisguard_O4 = 0;
  }
  
  public void aegisguard_EB(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast java/lang/Long
    //   7: invokevirtual longValue : ()J
    //   10: lstore_2
    //   11: pop
    //   12: getstatic me/frep/aegisguard/spigot/aegisguard_KB.a : J
    //   15: lload_2
    //   16: lxor
    //   17: lstore_2
    //   18: aload_0
    //   19: iconst_0
    //   20: iconst_1
    //   21: anewarray java/lang/Object
    //   24: dup_x1
    //   25: swap
    //   26: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   29: iconst_0
    //   30: swap
    //   31: aastore
    //   32: invokevirtual aegisguard_w4 : ([Ljava/lang/Object;)V
    //   35: aload_0
    //   36: iconst_0
    //   37: iconst_1
    //   38: anewarray java/lang/Object
    //   41: dup_x1
    //   42: swap
    //   43: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   46: iconst_0
    //   47: swap
    //   48: aastore
    //   49: invokevirtual aegisguard_Mr : ([Ljava/lang/Object;)V
    //   52: invokestatic aegisguard_P : ()[Lme/frep/aegisguard/spigot/check/AbstractCheck;
    //   55: aload_0
    //   56: iconst_0
    //   57: iconst_1
    //   58: anewarray java/lang/Object
    //   61: dup_x1
    //   62: swap
    //   63: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   66: iconst_0
    //   67: swap
    //   68: aastore
    //   69: invokevirtual aegisguard_wP : ([Ljava/lang/Object;)V
    //   72: aload_0
    //   73: iconst_0
    //   74: iconst_1
    //   75: anewarray java/lang/Object
    //   78: dup_x1
    //   79: swap
    //   80: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   83: iconst_0
    //   84: swap
    //   85: aastore
    //   86: invokevirtual aegisguard_MU : ([Ljava/lang/Object;)V
    //   89: aload_0
    //   90: iconst_0
    //   91: iconst_1
    //   92: anewarray java/lang/Object
    //   95: dup_x1
    //   96: swap
    //   97: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   100: iconst_0
    //   101: swap
    //   102: aastore
    //   103: invokevirtual aegisguard_wl : ([Ljava/lang/Object;)V
    //   106: aload_0
    //   107: iconst_0
    //   108: iconst_1
    //   109: anewarray java/lang/Object
    //   112: dup_x1
    //   113: swap
    //   114: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   117: iconst_0
    //   118: swap
    //   119: aastore
    //   120: invokevirtual aegisguard_q : ([Ljava/lang/Object;)V
    //   123: astore #4
    //   125: aload_0
    //   126: iconst_0
    //   127: iconst_1
    //   128: anewarray java/lang/Object
    //   131: dup_x1
    //   132: swap
    //   133: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   136: iconst_0
    //   137: swap
    //   138: aastore
    //   139: invokevirtual aegisguard_wq : ([Ljava/lang/Object;)V
    //   142: aload_0
    //   143: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   146: iconst_0
    //   147: anewarray java/lang/Object
    //   150: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   153: invokeinterface getActivePotionEffects : ()Ljava/util/Collection;
    //   158: invokeinterface iterator : ()Ljava/util/Iterator;
    //   163: astore #5
    //   165: aload #5
    //   167: invokeinterface hasNext : ()Z
    //   172: ifeq -> 582
    //   175: aload #5
    //   177: invokeinterface next : ()Ljava/lang/Object;
    //   182: checkcast org/bukkit/potion/PotionEffect
    //   185: astore #6
    //   187: aload #6
    //   189: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   192: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   195: invokevirtual equals : (Ljava/lang/Object;)Z
    //   198: aload #4
    //   200: lload_2
    //   201: lconst_0
    //   202: lcmp
    //   203: ifle -> 597
    //   206: ifnull -> 595
    //   209: aload #4
    //   211: lload_2
    //   212: lconst_0
    //   213: lcmp
    //   214: ifle -> 297
    //   217: ifnull -> 295
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: ifeq -> 284
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   236: athrow
    //   237: aload_0
    //   238: iconst_1
    //   239: iconst_1
    //   240: anewarray java/lang/Object
    //   243: dup_x1
    //   244: swap
    //   245: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   248: iconst_0
    //   249: swap
    //   250: aastore
    //   251: invokevirtual aegisguard_w4 : ([Ljava/lang/Object;)V
    //   254: aload_0
    //   255: aload #6
    //   257: invokevirtual getAmplifier : ()I
    //   260: iconst_1
    //   261: iadd
    //   262: iconst_1
    //   263: anewarray java/lang/Object
    //   266: dup_x1
    //   267: swap
    //   268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   271: iconst_0
    //   272: swap
    //   273: aastore
    //   274: invokevirtual aegisguard_Mr : ([Ljava/lang/Object;)V
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   283: athrow
    //   284: aload #6
    //   286: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   289: getstatic org/bukkit/potion/PotionEffectType.JUMP : Lorg/bukkit/potion/PotionEffectType;
    //   292: invokevirtual equals : (Ljava/lang/Object;)Z
    //   295: aload #4
    //   297: lload_2
    //   298: lconst_0
    //   299: lcmp
    //   300: iflt -> 372
    //   303: ifnull -> 370
    //   306: ifeq -> 363
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   315: athrow
    //   316: aload_0
    //   317: iconst_1
    //   318: iconst_1
    //   319: anewarray java/lang/Object
    //   322: dup_x1
    //   323: swap
    //   324: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   327: iconst_0
    //   328: swap
    //   329: aastore
    //   330: invokevirtual aegisguard_wP : ([Ljava/lang/Object;)V
    //   333: aload_0
    //   334: aload #6
    //   336: invokevirtual getAmplifier : ()I
    //   339: iconst_1
    //   340: iadd
    //   341: iconst_1
    //   342: anewarray java/lang/Object
    //   345: dup_x1
    //   346: swap
    //   347: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   350: iconst_0
    //   351: swap
    //   352: aastore
    //   353: invokevirtual aegisguard_MU : ([Ljava/lang/Object;)V
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   362: athrow
    //   363: iconst_0
    //   364: anewarray java/lang/Object
    //   367: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   370: aload #4
    //   372: ifnull -> 461
    //   375: ifeq -> 454
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   384: athrow
    //   385: aload #6
    //   387: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   390: getstatic org/bukkit/potion/PotionEffectType.SLOW_FALLING : Lorg/bukkit/potion/PotionEffectType;
    //   393: invokevirtual equals : (Ljava/lang/Object;)Z
    //   396: aload #4
    //   398: lload_2
    //   399: lconst_0
    //   400: lcmp
    //   401: ifle -> 463
    //   404: ifnull -> 461
    //   407: goto -> 414
    //   410: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   413: athrow
    //   414: lload_2
    //   415: lconst_0
    //   416: lcmp
    //   417: ifle -> 455
    //   420: ifeq -> 454
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   429: athrow
    //   430: aload_0
    //   431: iconst_1
    //   432: iconst_1
    //   433: anewarray java/lang/Object
    //   436: dup_x1
    //   437: swap
    //   438: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   441: iconst_0
    //   442: swap
    //   443: aastore
    //   444: invokevirtual aegisguard_wl : ([Ljava/lang/Object;)V
    //   447: goto -> 454
    //   450: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   453: athrow
    //   454: iconst_0
    //   455: anewarray java/lang/Object
    //   458: invokestatic aegisguard_A : ([Ljava/lang/Object;)Z
    //   461: aload #4
    //   463: ifnull -> 550
    //   466: ifeq -> 539
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   475: athrow
    //   476: aload #6
    //   478: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   481: getstatic org/bukkit/potion/PotionEffectType.LEVITATION : Lorg/bukkit/potion/PotionEffectType;
    //   484: invokevirtual equals : (Ljava/lang/Object;)Z
    //   487: lload_2
    //   488: lconst_0
    //   489: lcmp
    //   490: ifle -> 550
    //   493: aload #4
    //   495: ifnull -> 550
    //   498: goto -> 505
    //   501: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   504: athrow
    //   505: ifeq -> 539
    //   508: goto -> 515
    //   511: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   514: athrow
    //   515: aload_0
    //   516: iconst_1
    //   517: iconst_1
    //   518: anewarray java/lang/Object
    //   521: dup_x1
    //   522: swap
    //   523: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   526: iconst_0
    //   527: swap
    //   528: aastore
    //   529: invokevirtual aegisguard_q : ([Ljava/lang/Object;)V
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   538: athrow
    //   539: aload #6
    //   541: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   544: getstatic org/bukkit/potion/PotionEffectType.SLOW : Lorg/bukkit/potion/PotionEffectType;
    //   547: invokevirtual equals : (Ljava/lang/Object;)Z
    //   550: ifeq -> 577
    //   553: aload_0
    //   554: iconst_1
    //   555: iconst_1
    //   556: anewarray java/lang/Object
    //   559: dup_x1
    //   560: swap
    //   561: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   564: iconst_0
    //   565: swap
    //   566: aastore
    //   567: invokevirtual aegisguard_wq : ([Ljava/lang/Object;)V
    //   570: goto -> 577
    //   573: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   576: athrow
    //   577: aload #4
    //   579: ifnonnull -> 165
    //   582: iconst_0
    //   583: anewarray java/lang/Object
    //   586: lload_2
    //   587: lconst_0
    //   588: lcmp
    //   589: ifle -> 182
    //   592: invokestatic aegisguard_Q : ([Ljava/lang/Object;)Z
    //   595: aload #4
    //   597: lload_2
    //   598: lconst_0
    //   599: lcmp
    //   600: ifle -> 652
    //   603: ifnull -> 650
    //   606: ifeq -> 799
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   615: athrow
    //   616: aload_0
    //   617: aload_0
    //   618: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   621: iconst_0
    //   622: anewarray java/lang/Object
    //   625: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   628: getstatic org/bukkit/potion/PotionEffectType.DOLPHINS_GRACE : Lorg/bukkit/potion/PotionEffectType;
    //   631: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   636: putfield aegisguard_hg : Z
    //   639: aload_0
    //   640: getfield aegisguard_hg : Z
    //   643: goto -> 650
    //   646: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   649: athrow
    //   650: aload #4
    //   652: ifnull -> 768
    //   655: ifeq -> 700
    //   658: goto -> 665
    //   661: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   664: athrow
    //   665: aload_0
    //   666: aload_0
    //   667: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   670: iconst_0
    //   671: anewarray java/lang/Object
    //   674: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   677: getstatic org/bukkit/potion/PotionEffectType.DOLPHINS_GRACE : Lorg/bukkit/potion/PotionEffectType;
    //   680: invokeinterface getPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Lorg/bukkit/potion/PotionEffect;
    //   685: invokevirtual getAmplifier : ()I
    //   688: iconst_1
    //   689: iadd
    //   690: putfield aegisguard_OV : I
    //   693: goto -> 700
    //   696: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   699: athrow
    //   700: aload_0
    //   701: aload_0
    //   702: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   705: iconst_0
    //   706: anewarray java/lang/Object
    //   709: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   712: getstatic org/bukkit/potion/PotionEffectType.CONDUIT_POWER : Lorg/bukkit/potion/PotionEffectType;
    //   715: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   720: putfield aegisguard_V : Z
    //   723: aload_0
    //   724: aload_0
    //   725: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   728: iconst_0
    //   729: anewarray java/lang/Object
    //   732: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   735: getstatic org/bukkit/potion/PotionEffectType.SLOW_FALLING : Lorg/bukkit/potion/PotionEffectType;
    //   738: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   743: lload_2
    //   744: lconst_0
    //   745: lcmp
    //   746: ifle -> 796
    //   749: putfield aegisguard_hO : Z
    //   752: aload_0
    //   753: aload #4
    //   755: ifnull -> 772
    //   758: getfield aegisguard_hO : Z
    //   761: goto -> 768
    //   764: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   767: athrow
    //   768: ifeq -> 799
    //   771: aload_0
    //   772: aload_0
    //   773: getfield aegisguard_D : Lme/frep/aegisguard/spigot/aegisguard_hu;
    //   776: iconst_0
    //   777: anewarray java/lang/Object
    //   780: invokevirtual aegisguard_L : ([Ljava/lang/Object;)Lorg/bukkit/entity/Player;
    //   783: getstatic org/bukkit/potion/PotionEffectType.SLOW_FALLING : Lorg/bukkit/potion/PotionEffectType;
    //   786: invokeinterface getPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Lorg/bukkit/potion/PotionEffect;
    //   791: invokevirtual getAmplifier : ()I
    //   794: iconst_1
    //   795: iadd
    //   796: putfield aegisguard_y : I
    //   799: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1014	-> 18
    //   #1015	-> 35
    //   #1016	-> 55
    //   #1017	-> 72
    //   #1018	-> 89
    //   #1019	-> 106
    //   #1020	-> 125
    //   #1022	-> 142
    //   #1023	-> 187
    //   #1024	-> 237
    //   #1025	-> 254
    //   #1028	-> 284
    //   #1029	-> 316
    //   #1030	-> 333
    //   #1033	-> 363
    //   #1034	-> 430
    //   #1037	-> 454
    //   #1038	-> 515
    //   #1041	-> 539
    //   #1042	-> 553
    //   #1044	-> 577
    //   #1046	-> 582
    //   #1047	-> 616
    //   #1048	-> 639
    //   #1050	-> 700
    //   #1052	-> 723
    //   #1053	-> 752
    //   #1055	-> 799
    // Exception table:
    //   from	to	target	type
    //   187	220	223	java/lang/RuntimeException
    //   209	230	233	java/lang/RuntimeException
    //   227	277	280	java/lang/RuntimeException
    //   295	309	312	java/lang/RuntimeException
    //   306	356	359	java/lang/RuntimeException
    //   370	378	381	java/lang/RuntimeException
    //   375	407	410	java/lang/RuntimeException
    //   385	423	426	java/lang/RuntimeException
    //   414	447	450	java/lang/RuntimeException
    //   461	469	472	java/lang/RuntimeException
    //   466	498	501	java/lang/RuntimeException
    //   476	508	511	java/lang/RuntimeException
    //   505	532	535	java/lang/RuntimeException
    //   550	570	573	java/lang/RuntimeException
    //   595	609	612	java/lang/RuntimeException
    //   606	643	646	java/lang/RuntimeException
    //   650	658	661	java/lang/RuntimeException
    //   655	693	696	java/lang/RuntimeException
    //   700	761	764	java/lang/RuntimeException
  }
  
  public static void aegisguard_g(boolean paramBoolean) {
    aegisguard_Od = paramBoolean;
  }
  
  public static boolean aegisguard_H() {
    return aegisguard_Od;
  }
  
  public static boolean aegisguard_X() {
    boolean bool = aegisguard_H();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = a ^ 0x1AB4075428F0L;
    aegisguard_g(false);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[10];
    boolean bool = false;
    String str;
    int i = (str = "ùü\037cÅY«E.?¬ôáA ¶r·e\026öÍ³-Æ_gÑ)tþä(¸\020§ó¦áD\023UÜ]»\025ë¡0\030jlZ\036éÖ±\002öÚ¢\0262ø¯4ØßþXàT\033\bðpï¡»úWI\020§ó¦áD\023UÜ]»\025ë¡0\030öWßóq\bôN>ö\031Û\007Mü_KÕÛ\034n8a jlZ\036éÖ±\002l%<A\024NË\025Cù±Ïà|jn¸~«o°ø(o\017YµiÍÏ`ÿgëÓðTµ^\005­j\025tvÝ}\013\000¾xVÂ¨\f!¯ Èëú").length();
    byte b2 = 40;
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
