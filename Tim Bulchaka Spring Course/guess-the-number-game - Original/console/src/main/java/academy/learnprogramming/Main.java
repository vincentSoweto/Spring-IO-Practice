package academy.learnprogramming;


import academy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

       // NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        /*int number = numberGenerator.next();

        log.debug("number ={}", number);

        //get the game been from context
        //Game game = context.getBean(Game.class);


        //cal the reset method
        //game.reset();

        // get message generator bean from context(container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());
*/
        context.close();
    }
}
