package me.king.deploy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public final class WorkerExample {

    public static void main(String[] args) throws LoginException {
        final String token = System.getenv("TOKEN");
        final JDABuilder builder = JDABuilder.createDefault(token);

        final JDA jdaClient = builder.build();
    }
}
