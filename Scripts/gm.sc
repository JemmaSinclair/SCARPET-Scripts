///
// LNAM Creative Server Gamemode Commands
// by KaraTheNek0
///

__command() -> __help();

__help() -> (
	p = player();
	print(player(), '/gm s for Survival');
	print(player(), '/gm c for Creative');
	print(player(), '/gm sp for Spectator');
	return()
);

c() -> (run('gamemode creative '+player()~'command_name');return('Set own gamemode to Creative Mode'));
s() -> (run('gamemode survival '+player()~'command_name');return('Set own gamemode to Survival Mode'));
sp() -> (run('gamemode spectator '+player()~'command_name');return('Set own gamemode to Spectator Mode'));
