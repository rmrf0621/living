package com.fc.bot.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class LongPollingHandler extends TelegramLongPollingBot {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getBotUsername() {
        return Contanst.TG_NAME;
    }

    @Override
    public String getBotToken() {
        return Contanst.TG_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();

        System.out.println("======="+message.getText());

    }
}
