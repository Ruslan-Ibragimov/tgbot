package ru.skillfactory.bot.tgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSkillFactoryTelegramBotApplication {

	public static void main(String[] args) {
		SpringApplication.from(SkillFactoryTelegramBotApplication::main).with(TestSkillFactoryTelegramBotApplication.class).run(args);
	}

}
