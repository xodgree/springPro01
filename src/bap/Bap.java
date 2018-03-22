package bap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import chap06.board.WriteArticleService;

public class Bap {
   public void eat(String meal, String kind) {
      System.out.println("¶ºÈ÷°¡ "+meal+"¸¦(À»)"+kind+"¿¡ ¸Ô½À´Ï´Ù");

   }
}