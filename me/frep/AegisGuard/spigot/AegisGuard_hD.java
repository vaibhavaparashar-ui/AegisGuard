package me.frep.aegisguard.spigot.AegisGuard_hD;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import me.frep.aegisguard.spigot.aegisguard_Ku;
import me.frep.aegisguard.spigot.aegisguard_T;
import me.frep.aegisguard.spigot.aegisguard_XD;
import me.frep.aegisguard.spigot.aegisguard_Xh;
import me.frep.aegisguard.spigot.aegisguard_hv;

public class aegisguard_hD {
  private String aegisguard_n;
  
  private String aegisguard_b;
  
  private String aegisguard_v;
  
  private Color aegisguard_h;
  
  private aegisguard_XD aegisguard_C;
  
  private aegisguard_Ku aegisguard_p;
  
  private aegisguard_Xh aegisguard_f;
  
  private aegisguard_hv aegisguard_d;
  
  private List aegisguard_G = new ArrayList();
  
  public String aegisguard_U(Object[] paramArrayOfObject) {
    return this.aegisguard_n;
  }
  
  public String aegisguard_p(Object[] paramArrayOfObject) {
    return this.aegisguard_b;
  }
  
  public String aegisguard_G(Object[] paramArrayOfObject) {
    return this.aegisguard_v;
  }
  
  public Color aegisguard_u(Object[] paramArrayOfObject) {
    return this.aegisguard_h;
  }
  
  public aegisguard_XD aegisguard_q(Object[] paramArrayOfObject) {
    return this.aegisguard_C;
  }
  
  public aegisguard_Ku aegisguard_R(Object[] paramArrayOfObject) {
    return this.aegisguard_p;
  }
  
  public aegisguard_Xh aegisguard_z(Object[] paramArrayOfObject) {
    return this.aegisguard_f;
  }
  
  public aegisguard_hv aegisguard_K(Object[] paramArrayOfObject) {
    return this.aegisguard_d;
  }
  
  public List aegisguard_k(Object[] paramArrayOfObject) {
    return this.aegisguard_G;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard_D(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard_f(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard__(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard_Q(Object[] paramArrayOfObject) {
    Color color = (Color)paramArrayOfObject[0];
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard_c(Object[] paramArrayOfObject) {
    String str1 = (String)paramArrayOfObject[0], str2 = (String)paramArrayOfObject[1];
    this.aegisguard_C = new aegisguard_XD(this, str1, str2, null);
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard_i(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    this.aegisguard_p = new aegisguard_Ku(this, str, null);
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard_v(Object[] paramArrayOfObject) {
    String str = (String)paramArrayOfObject[0];
    this.aegisguard_f = new aegisguard_Xh(this, str, null);
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard_C(Object[] paramArrayOfObject) {
    String str2 = (String)paramArrayOfObject[0], str1 = (String)paramArrayOfObject[1], str3 = (String)paramArrayOfObject[2];
    this.aegisguard_d = new aegisguard_hv(this, str2, str1, str3, null);
    return this;
  }
  
  public me.frep.aegisguard.spigot.aegisguard_hD aegisguard_O(Object[] paramArrayOfObject) {
    String str2 = (String)paramArrayOfObject[0], str1 = (String)paramArrayOfObject[1];
    boolean bool = ((Boolean)paramArrayOfObject[2]).booleanValue();
    this.aegisguard_G.add(new aegisguard_T(this, str2, str1, bool, null));
    return this;
  }
}
