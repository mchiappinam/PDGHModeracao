package me.mchiappinam.pdghmoderacao;

import java.util.Calendar;

import me.mchiappinam.pdghmoderacao.Comandos;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHModeracao] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHModeracao] §2Acesse: http://pdgh.net/");
	}
	
	@Override
    public void onEnable() {
		getServer().getPluginCommand("pdgh").setExecutor(new Comandos(this));
		
		//Fechar
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
					if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==06)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==8)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==10)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==12)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==14)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==16)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==18)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==20)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==22)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==00)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==00) {
			                getServer().dispatchCommand(getServer().getConsoleSender(), "save-all");
			                getServer().dispatchCommand(getServer().getConsoleSender(), "plugin unload SimpleNoRelog");
							getServer().setWhitelist(true);
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O SERVIDOR §c§lAGORA§6!");
							getServer().broadcastMessage(" ");
							for (Player p : getServer().getOnlinePlayers()) {
				                p.kickPlayer("§3§lCalma! Nao se suicide! Nao pegue a faca!\n§3§l--§6§lREINICIANDO O SERVIDOR§3§l--\n\n' '\nO");
					        }
							getServer().shutdown();
						}
					}
			}
		}, 0, 20*21);
		
		//Anuncio
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
					if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==05)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==07)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==9)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==11)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==13)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==15)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==17)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==19)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==21)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==23)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==58) {
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O SERVIDOR EM §c§l2 §6MINUTOS!");
							getServer().broadcastMessage(" ");
			}
					}
			}
		}, 0, 20*61);
		
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
					if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==05)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==07)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==9)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==11)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==13)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==15)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==17)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==19)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==21)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==23)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==59) {
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O SERVIDOR EM §c§l1 §6MINUTO!");
							getServer().broadcastMessage(" ");
			}
					}
			}
		}, 0, 20*61);
		getServer().getConsoleSender().sendMessage("§3[PDGHModeracao] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHModeracao] §2Acesse: http://pdgh.net/");
	}
}
