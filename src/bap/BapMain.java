package bap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BapMain {
   public static void main(String[] args) {
      String kind = "����";
      String meal = "�Ľ�Ÿ";
      
      GenericXmlApplicationContext ctx = 
            new GenericXmlApplicationContext("bap/bap.xml");
      Bap bap = ctx.getBean("bap", Bap.class);
      bap.eat(meal, kind);
      ctx.close();
   }
}