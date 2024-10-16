package net.coalcube.bansystem.core.command;

import net.coalcube.bansystem.core.util.User;

import java.util.List;

public interface Command {

    void execute(User user, String[] args);
    List<String> suggest(User user, String[] args);
}