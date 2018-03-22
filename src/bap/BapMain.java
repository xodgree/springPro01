package bap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BapMain {
   public static void main(String[] args) {
      String kind = "점심";
      String meal = "파스타";
      
      GenericXmlApplicationContext ctx = 
            new GenericXmlApplicationContext("bap/bap.xml");
      Bap bap = ctx.getBean("bap", Bap.class);
      bap.eat(meal, kind);
      ctx.close();
   }
}