package com.fc.bot.config;

import org.telegram.bot.structure.BotConfig;

public class DefaultTelegramConfig extends BotConfig {

    private final String phone;

    public DefaultTelegramConfig(String phone) {
        this.phone = phone;
    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public String getBotToken() {
        return null;
    }

    @Override
    public boolean isBot() {
        return false;
    }
}
