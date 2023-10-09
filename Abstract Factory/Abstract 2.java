// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.abstractfactory;

public class Cliente {
   private Contrato contrato;
   private Historico historico;

   public Cliente(FabricaAbstrata fabrica) {
      this.contrato = fabrica.createContrato();
      this.historico = fabrica.createHistorico();
   }

   public String emitirContrato() {
      return this.contrato.emitir();
   }

   public String emitirHistorico() {
      return this.historico.emitir();
   }
}