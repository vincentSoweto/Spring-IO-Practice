package academy.learnprogramming.config;

import academy.learnprogramming.GuessCount;
import academy.learnprogramming.MaxNumber;
import academy.learnprogramming.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "academy.learnprogramming")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber:500}")
    private int maxNumber = 25;

    @Value("${game.guessCount:100}")
    private int guessCount = 8;

    @Value("${game.minNumber:20}")
    private int minNumber = 20;

    // == bean methods ==
    @Bean
    @MaxNumber
    public int getMaxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int getCount(){
        return guessCount;
    }


    @Bean
    @MinNumber
    public int getMinNumber(){return minNumber;}

}
