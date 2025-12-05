package me.frep.aegisguard.spigot.AegisGuard_hg;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.LinkedList;
import me.frep.aegisguard.spigot.aegisguard_e;

public final class aegisguard_hg extends LinkedList {
  private final int aegisguard_W;
  
  private static String[] aegisguard_F;
  
  private static final long a = aegisguard_e.a(-211158432127945603L, -1641111363127984487L, MethodHandles.lookup().lookupClass()).a(23538939468709L);
  
  public int aegisguard_R(Object[] paramArrayOfObject) {
    return this.aegisguard_W;
  }
  
  public aegisguard_hg(int paramInt) {
    this.aegisguard_W = paramInt;
  }
  
  public aegisguard_hg(Collection<? extends E> paramCollection, int paramInt) {
    super(paramCollection);
    this.aegisguard_W = paramInt;
  }
  
  public boolean add(Object paramObject) {
    long l = a ^ 0x1B853AECB6EEL;
    String[] arrayOfString = aegisguard_q();
    try {
      if (arrayOfString == null)
        try {
          if (size() >= aegisguard_R(new Object[0]))
            removeFirst(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return super.add(paramObject);
  }
  
  public boolean aegisguard_g(Object[] paramArrayOfObject) {
    long l = ((Long)paramArrayOfObject[0]).longValue();
    l = a ^ l;
    String[] arrayOfString = aegisguard_q();
    try {
      if (arrayOfString == null)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (size() >= aegisguard_R(new Object[0]));
  }
  
  public static void aegisguard_m(String[] paramArrayOfString) {
    aegisguard_F = paramArrayOfString;
  }
  
  public static String[] aegisguard_q() {
    return aegisguard_F;
  }
  
  static {
    if (aegisguard_q() != null)
      aegisguard_m(new String[1]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}
