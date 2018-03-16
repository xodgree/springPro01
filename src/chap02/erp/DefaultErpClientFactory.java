package chap02.erp;

import java.util.Properties;

class DefaultErpClientFactory extends ErpClientFactory{
   private String server;
   public DefaultErpClientFactory(Properties props) {
      this.server = props.getProperty("server");
      System.out.println(server);
   }
   
   @Override
   public ErpClient create() {
      return new ErpClient() {
         @Override
         public void connect() {
            System.out.println("������:"+server);
         }
         @Override
         public void close() {
            System.out.println("���� ����:"+server);
         }
         @Override
         public void sendPurchaseInfo(ErpOrderData oi) {
            System.out.println("�ֹ� ���� ����:"+server);
         }
      };
   }   
}