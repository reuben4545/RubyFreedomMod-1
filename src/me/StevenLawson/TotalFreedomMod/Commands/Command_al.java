package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Shows all admins", usage = "/<command>", aliases = "adminlist")
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
        sender.sendMessage(ChatColor.GOLD + "Alosion and MysteriAce");
        sender.sendMessage(ChatColor.RED + "- System Admins -");
        sender.sendMessage(ChatColor.RED + "cowgomooo12, eddieusselman, xYurippe, Stampy100, xBadDawgx");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Lead Dev: Valencia_Orange");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Co-Lead Dev: DarkGamingDronze");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Dev: tylerhyperHD");
        sender.sendMessage(ChatColor.BLUE + "The Co-Owners are TaahThePenguin and LegendIsAwesomes");
        sender.sendMessage(ChatColor.BLUE + "The Owners are reuben4545, falceso, and DarkGamingDronze");
        return true;
    }
}
