///
// Clear Inventory for Non-opped players
// by KaraTheNek0
///

__command() -> __clear();

__clear() -> (
	p = player();
	print(player(), 'Type /clear confirm to clear your inventory!');
	return();
);

confirm() -> (run('clear '+player()~'command_name');return(_));