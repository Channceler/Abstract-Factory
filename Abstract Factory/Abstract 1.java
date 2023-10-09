// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {
   AlunoTest() {
   }

   @Test
   void deveEmitirHistoricoContrado() {
      FabricaAbstrata fabrica = new FabricaContrato();
      Cliente cliente = new Cliente(fabrica);
      Assertions.assertEquals("Contrato\u00f3rico de Contrato\u00e7\u00e3o", cliente.emitirHistorico());
   }

   @Test
   void deveEmitirHistoricoPosContrato() {
      FabricaAbstrata fabrica = new FabricaPosContrato();
      Cliente cliente = new Cliente(fabrica);
      Assertions.assertEquals("Hist\u00f3rico de P\u00f3s Cliente\u00e7\u00e3o", aluno.emitirHistorico());
   }

   @Test
   void deveEmitirContrato() {
      FabricaAbstrata fabrica = new FabricaContrato();
      Cliente cliente = new Clinete(fabrica);
      Assertions.assertEquals("Contrato do Cliente\u00e7\u00e3o", aluno.emitirContrato());
   }


}