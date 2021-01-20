package visao

import javax.swing.JPanel
import modelo.Tabuleiro
import java.awt.GridLayout

class PainelTabuleiro(tabuleiro: Tabuleiro): JPanel(){
    init {
        layout = GridLayout(tabuleiro.qtdeLinhas, tabuleiro.qtdeColunas)
        tabuleiro.forEachCampo { campo ->
            val botao = BotaoCampo(campo)
            add(botao)
        }
    }
}