package me.frep.aegisguard.spigot.AegisGuard_J;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.frep.aegisguard.spigot.aegisguard_M;
import me.frep.aegisguard.spigot.aegisguard_e;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class aegisguard_J extends aegisguard_M implements CommandExecutor {
  private static final long b = aegisguard_e.a(-2696980593064301079L, 4328957000871322947L, MethodHandles.lookup().lookupClass()).a(191001437039937L);
  
  private static final String d;
  
  public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/frep/aegisguard/spigot/aegisguard_J.b : J
    //   3: ldc2_w 126277662176983
    //   6: lxor
    //   7: lstore #5
    //   9: lload #5
    //   11: dup2
    //   12: ldc2_w 48535163479119
    //   15: lxor
    //   16: lstore #7
    //   18: dup2
    //   19: ldc2_w 76587830082947
    //   22: lxor
    //   23: lstore #9
    //   25: pop2
    //   26: invokestatic aegisguard_V : ()Ljava/lang/String;
    //   29: astore #11
    //   31: aload_1
    //   32: aload #11
    //   34: ifnull -> 90
    //   37: instanceof org/bukkit/entity/Player
    //   40: ifne -> 89
    //   43: goto -> 50
    //   46: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   49: athrow
    //   50: aload_0
    //   51: aload_1
    //   52: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_Mh : Ljava/lang/String;
    //   55: lload #7
    //   57: iconst_3
    //   58: anewarray java/lang/Object
    //   61: dup_x2
    //   62: dup_x2
    //   63: pop
    //   64: invokestatic valueOf : (J)Ljava/lang/Long;
    //   67: iconst_2
    //   68: swap
    //   69: aastore
    //   70: dup_x1
    //   71: swap
    //   72: iconst_1
    //   73: swap
    //   74: aastore
    //   75: dup_x1
    //   76: swap
    //   77: iconst_0
    //   78: swap
    //   79: aastore
    //   80: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   83: iconst_1
    //   84: ireturn
    //   85: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_1
    //   90: checkcast org/bukkit/entity/Player
    //   93: astore #12
    //   95: aload #12
    //   97: getstatic me/frep/aegisguard/spigot/aegisguard_J.d : Ljava/lang/String;
    //   100: invokeinterface hasPermission : (Ljava/lang/String;)Z
    //   105: aload #11
    //   107: ifnull -> 204
    //   110: ifeq -> 163
    //   113: goto -> 120
    //   116: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: getstatic me/frep/aegisguard/spigot/aegisguard_K.INSTANCE : Lme/frep/aegisguard/spigot/aegisguard_K;
    //   123: invokevirtual aegisguard_l : ()Lme/frep/aegisguard/spigot/aegisguard_XP;
    //   126: lload #9
    //   128: aload #12
    //   130: iconst_2
    //   131: anewarray java/lang/Object
    //   134: dup_x1
    //   135: swap
    //   136: iconst_1
    //   137: swap
    //   138: aastore
    //   139: dup_x2
    //   140: dup_x2
    //   141: pop
    //   142: invokestatic valueOf : (J)Ljava/lang/Long;
    //   145: iconst_0
    //   146: swap
    //   147: aastore
    //   148: invokevirtual aegisguard_t : ([Ljava/lang/Object;)V
    //   151: aload #11
    //   153: ifnonnull -> 205
    //   156: goto -> 163
    //   159: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload_0
    //   164: aload_1
    //   165: getstatic me/frep/aegisguard/spigot/aegisguard_b0.aegisguard_MR : Ljava/lang/String;
    //   168: lload #7
    //   170: iconst_3
    //   171: anewarray java/lang/Object
    //   174: dup_x2
    //   175: dup_x2
    //   176: pop
    //   177: invokestatic valueOf : (J)Ljava/lang/Long;
    //   180: iconst_2
    //   181: swap
    //   182: aastore
    //   183: dup_x1
    //   184: swap
    //   185: iconst_1
    //   186: swap
    //   187: aastore
    //   188: dup_x1
    //   189: swap
    //   190: iconst_0
    //   191: swap
    //   192: aastore
    //   193: invokevirtual aegisguard_d : ([Ljava/lang/Object;)V
    //   196: iconst_1
    //   197: goto -> 204
    //   200: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   203: athrow
    //   204: ireturn
    //   205: iconst_1
    //   206: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 31
    //   #15	-> 50
    //   #16	-> 83
    //   #18	-> 89
    //   #19	-> 95
    //   #20	-> 120
    //   #22	-> 163
    //   #23	-> 196
    //   #25	-> 205
    // Exception table:
    //   from	to	target	type
    //   31	43	46	java/lang/RuntimeException
    //   37	85	85	java/lang/RuntimeException
    //   95	113	116	java/lang/RuntimeException
    //   110	156	159	java/lang/RuntimeException
    //   120	197	200	java/lang/RuntimeException
  }
  
  static {
    long l = b ^ 0x3F54F3AB99F4L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
