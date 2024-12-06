package me.mchiappinam.pdghmoderacao;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Comandos implements CommandExecutor {
	private Main plugin;
	public Comandos(Main main) {
		plugin=main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("pdgh")) {
			if(sender.hasPermission("pdgh.admin")) {
				if(args.length>=1)
			if(sender==plugin.getServer().getConsoleSender())
				sender.sendMessage("§2Use §c/pdgh ? §2para abrir o menu de moderação.");
			if(args[0].equalsIgnoreCase("?")) {
					sender.sendMessage("§3PDGHModeracao v"+plugin.getDescription().getVersion());
					sender.sendMessage("§9§l/pdgh manutencao §a- §9Menu do sistema de manutenção do servidor.");
					sender.sendMessage("§9§l/pdgh reiniciar §a- §9Menu do sistema de reiniciar o servidor.");
					return true;
				}
			if(args[0].equalsIgnoreCase("manutencao")) {
					sender.sendMessage("§9§l/pdgh manutencao on §a- §9Kicka todos os usuários e ativa a manutenção.");
					sender.sendMessage("§9§l/pdgh manutencao off §a- §9Desativa a manutenção.");
				if(args[1].equalsIgnoreCase("on")) {
						sender.sendMessage("§2teste1.");
						return false;
		}
				if(args[1].equalsIgnoreCase("off")) {
						sender.sendMessage("§2teste2.");
						return false;
		}
				return false;
	}
			}else{
			sender.sendMessage("§cSem permissoes.");
		}
	}
		return true;
}
}