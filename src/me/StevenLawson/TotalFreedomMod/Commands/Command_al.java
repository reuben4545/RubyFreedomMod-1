package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Shows all admins", usage = "/<command>")
public class Command_al extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.AQUA + "-Super Admins-");
        sender.sendMessage(ChatColor.AQUA + StringUtils.join(TFM_AdminList.getSuperAdminNames(), ", "));
        sender.sendMessage(ChatColor.GREEN + "-Telnet Admins-");
        sender.sendMessage(ChatColor.GREEN + StringUtils.join(TFM_AdminList.getTelnetAdminNames(), ", "));
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "- Senior Admins -");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + StringUtils.join(TFM_AdminList.getSeniorAdminNames(), ", "));
        sender.sendMessage(ChatColor.GOLD + "- Executives -");
        sender.sendMessage(ChatColor.GOLD + StringUtils.join(TFM_AdminList.getExecutiveNames(), ", "));
        sender.sendMessage(ChatColor.RED + "- System Admins -");
        sender.sendMessage(ChatColor.RED + StringUtils.join(TFM_AdminList.getSystemAdminNames(), ", "));
        sender.sendMessage(ChatColor.DARK_PURPLE + "The Lead Dev is Valencia_Orange and the only other real dev is tylerhyperHD.");
        sender.sendMessage(ChatColor.BLUE + "The Co-Owners are " + StringUtils.join(TFM_AdminList.getCoOwnerNames(), " and "));
        sender.sendMessage(ChatColor.BLUE + "The Owners are reuben4545, falceso, and DarkGamingDronze");
        return true;
    }
}
