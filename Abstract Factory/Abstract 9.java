// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.abstractfactory;

public class FabricaGraduacao implements FabricaAbstrata {
   public FabricaHistorico() {
   }

   public Diploma createContrato() {
      return new HistoricoContrato();
   }

   public Historico createHistorico() {
      return new HistoricoContrato();
   }
}
