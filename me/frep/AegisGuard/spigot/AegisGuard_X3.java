package me.frep.aegisguard.spigot.AegisGuard_X3;

import dev.geco.gsit.api.event.PlayerCrawlEvent;
import dev.geco.gsit.api.event.PlayerGetUpCrawlEvent;
import dev.geco.gsit.api.event.PlayerGetUpPlayerSitEvent;
import dev.geco.gsit.api.event.PlayerPlayerSitEvent;
import java.lang.invoke.MethodHandles;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_e;
import me.frep.aegisguard.spigot.aegisguard_hu;
import me.frep.aegisguard.spigot.check.AbstractCheck;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class aegisguard_X3 implements Listener {
  private static AbstractCheck[] aegisguard_k;
  
  private static final long a = aegisguard_e.a(-2031765149156323986L, -6522694923325908841L, MethodHandles.lookup().lookupClass()).a(227607219200444L);
  
  @EventHandler
  public void aegisguard__(PlayerPlayerSitEvent paramPlayerPlayerSitEvent) {
    long l = a ^ 0x1AEAB9645F6AL;
    Player player = paramPlayerPlayerSitEvent.getPlayer();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_J();
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_wi(new Object[] { Boolean.valueOf(true) });
  }
  
  @EventHandler
  public void aegisguard_V(PlayerGetUpPlayerSitEvent paramPlayerGetUpPlayerSitEvent) {
    long l = a ^ 0x170A80939064L;
    Player player = paramPlayerGetUpPlayerSitEvent.getPlayer();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_J();
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_wi(new Object[] { Boolean.valueOf(false) });
  }
  
  @EventHandler
  public void aegisguard_v(PlayerCrawlEvent paramPlayerCrawlEvent) {
    long l = a ^ 0x3955293FB170L;
    Player player = paramPlayerCrawlEvent.getPlayer();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_J();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_wv(new Object[] { Boolean.valueOf(true) });
      if (AbstractCheck.aegisguard_B() == null)
        aegisguard_J(new AbstractCheck[3]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @EventHandler
  public void aegisguard_Q(PlayerGetUpCrawlEvent paramPlayerGetUpCrawlEvent) {
    long l = a ^ 0x800F6E5E158L;
    Player player = paramPlayerGetUpCrawlEvent.getPlayer();
    AbstractCheck[] arrayOfAbstractCheck = aegisguard_J();
    aegisguard_hu aegisguard_hu = aegisguard_K.INSTANCE.aegisguard_Y().aegisguard_U(new Object[] { player });
    try {
      if (arrayOfAbstractCheck == null)
        if (aegisguard_hu == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      aegisguard_hu.aegisguard_s(new Object[0]).aegisguard_wv(new Object[] { Boolean.valueOf(false) });
      if (arrayOfAbstractCheck != null)
        AbstractCheck.aegisguard_g(new AbstractCheck[5]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static void aegisguard_J(AbstractCheck[] paramArrayOfAbstractCheck) {
    aegisguard_k = paramArrayOfAbstractCheck;
  }
  
  public static AbstractCheck[] aegisguard_J() {
    return aegisguard_k;
  }
  
  static {
    if (aegisguard_J() != null)
      aegisguard_J(new AbstractCheck[4]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
