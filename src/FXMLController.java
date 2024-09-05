
/** ******.********************************************************
 * Autor...........: Pedro Lucca Silva Martins
 * Matricula........: 202210183
 * Inicio...........: 20/12/2023
 * Ultima alteracao.: 04/12/2023
 * Nome.............: Classe controller
 * Funcao...........: Controlador da GUI
 *************************************************************** */
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Semaphore;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

public class FXMLController implements Initializable {

  @FXML
  private Label label;
  @FXML
  private ImageView carRed;
  @FXML
  private ImageView carBlue;
  @FXML
  private ImageView carCyan;
  @FXML
  private ImageView carGreen;
  @FXML
  private ImageView carOrange;
  @FXML
  private ImageView carBlack;
  @FXML
  private ImageView carPink;
  @FXML
  private ImageView carYellow;
  @FXML
  private Button pauseBlack;
  @FXML
  private Button pauseRed;
  @FXML
  private Button pauseYellow;
  @FXML
  private Button pauseGreen;
  @FXML
  private Button pauseBlue;
  @FXML
  private Button pauseCyan;
  @FXML
  private Button pausePink;
  @FXML
  private Button pauseOrange;
  @FXML
  private ImageView quadraBlack;
  @FXML
  private ImageView quadraRed;
  @FXML
  private ImageView quadraYellow;
  @FXML
  private ImageView quadraOrange;
  @FXML
  private ImageView quadraGreen;
  @FXML
  private ImageView quadraBlue;
  @FXML
  private ImageView quadraCyan;
  @FXML
  private ImageView quadraPink;
  @FXML
  private Button exibirBlack;
  @FXML
  private Button exibirRed;
  @FXML
  private Button exibirYellow;
  @FXML
  private Button exibirOrange;
  @FXML
  private Button exibirGreen;
  @FXML
  private Button exibirBlue;
  @FXML
  private Button exibirCyan;
  @FXML
  private Button exibirPink;
  @FXML
  private Slider sliderRed;
  @FXML
  private Slider sliderGreen;
  @FXML
  private Slider sliderBlue;
  @FXML
  private Slider sliderYellow;
  @FXML
  private Slider sliderPink;
  @FXML
  private Slider sliderOrange;
  @FXML
  private Button buttonIniciar;
  @FXML
  private Button buttonReset;

  // objetos Semaphore para controle de concorrencia entre as threads dos carros
  public static Semaphore mutexRedGreen;
  public static Semaphore mutexRedYellow;
  public static Semaphore mutexRedBlue;
  public static Semaphore mutexGrennYellow;
  public static Semaphore mutexGrennYellowOrangeCruzamento;
  public static Semaphore mutexGrennBlue;
  public static Semaphore mutexRedOrange;
  public static Semaphore mutexOrangeGreen;
  public static Semaphore mutexOrangeYellow;
  public static Semaphore mutexOrangeBlue;
  public static Semaphore mutexRedCyanCima;
  public static Semaphore mutexRedCyanEsquerda;
  public static Semaphore mutexRedCyanDireita;
  public static Semaphore mutexRedCyanBaixo;
  public static Semaphore VermelhoLiberandoProVerde;
  public static Semaphore LaranjaLiberandoProVerde;
  public static Semaphore VerdeLiberandoProAzul;
  public static Semaphore mutexRedPinkCima;
  public static Semaphore mutexRedPinkDireita;
  public static Semaphore mutexRedPinkBaixo;
  public static Semaphore mutexRedPinkEsquerda;
  public static Semaphore mutexGreenPinkEsquerda;
  public static Semaphore mutexGreenPinkCima;
  public static Semaphore mutexYellowPinkCima;
  public static Semaphore mutexYellowPinkEsquerda;
  public static Semaphore mutexYellowPinkBaixo;
  public static Semaphore mutexBluePinkBaixo;
  public static Semaphore mutexBluePinkDireita;
  public static Semaphore mutexBluePinkCima;
  public static Semaphore mutexOrangePinkDireita;
  public static Semaphore mutexOrangePinkBaixo;
  public static Semaphore mutexOrangePinkEsquerda;
  public static Semaphore vermelhoLiberandoProRosa;
  
  // instanciando os objetos da classe carro
  private Carro carVermelho;
  private Carro carAzul;
  private Carro carCiano;
  private Carro carVerde;
  private Carro carLaranja;
  private Carro carPreto;
  private Carro carRosa;
  private Carro carAmarelo;

  @FXML
  private void handleButtonActionIniciar(ActionEvent event) {

    // instanciando os semaforos com suas respectivas permissoes
    instanciarSemaforos();
    
    // insntanciando os objetos thread carro
    carVermelho = new Carro(carRed, "vermelho", this);
    carAzul = new Carro(carBlue, "azul", this);
    carCiano = new Carro(carCyan, "ciano", this);
    carVerde = new Carro(carGreen, "verde", this);
    carLaranja = new Carro(carOrange, "laranja", this);
    carPreto = new Carro(carBlack, "preto", this);
    carRosa = new Carro(carPink, "rosa", this);
    carAmarelo = new Carro(carYellow, "amarelo", this);

    // dando start nas threads carro
    carPreto.start();
    carVermelho.start();
    carAmarelo.start();
    carLaranja.start();
    carVerde.start();
    carAzul.start();
    carCiano.start();
    carRosa.start();

    // desabilitando e habilitando os botoes para uso
    buttonIniciar.setDisable(true);
    buttonReset.setDisable(false);
  }

  @FXML
  public void handleButtonActionReset(ActionEvent event) {
    verificarThreads();

    // desabilitando e habilitando os botoes para uso
    buttonIniciar.setDisable(false);
    buttonReset.setDisable(true);
    
    // desabilitando as quadras caso alguma esteja ativa
    quadraGreen.setVisible(false);
    exibirGreen.setText("Exibir quadra");
    
    // desabilitando as quadras caso alguma esteja ativa
    quadraBlack.setVisible(false);
    exibirBlack.setText("Exibir quadra");
    
    // desabilitando as quadras caso alguma esteja ativa
    quadraRed.setVisible(false);
    exibirRed.setText("Exibir quadra");
    
    // desabilitando as quadras caso alguma esteja ativa
    quadraYellow.setVisible(false);
    exibirYellow.setText("Exibir quadra");
    
    // desabilitando as quadras caso alguma esteja ativa
    quadraBlue.setVisible(false);
    exibirBlue.setText("Exibir quadra");
    
    // desabilitando as quadras caso alguma esteja ativa
    quadraOrange.setVisible(false);
    exibirOrange.setText("Exibir quadra");
    
    // desabilitando as quadras caso alguma esteja ativa
    quadraCyan.setVisible(false);
    exibirCyan.setText("Exibir quadra");
    
    // desabilitando as quadras caso alguma esteja ativa
    quadraPink.setVisible(false);
    exibirPink.setText("Exibir quadra");

  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {

    buttonReset.setDisable(true);

    quadraBlack.setVisible(false);
    quadraRed.setVisible(false);
    quadraYellow.setVisible(false);
    quadraOrange.setVisible(false);
    quadraGreen.setVisible(false);
    quadraBlue.setVisible(false);
    quadraCyan.setVisible(false);
    quadraPink.setVisible(false);

    carCyan.setVisible(false);
    carBlack.setVisible(false);
  }

  // botao de pausa do carro preto
  public void pauseBlack(ActionEvent event) {
    if (pauseBlack.getText().equalsIgnoreCase("Pause")) {
      carPreto.pausar();
      pauseBlack.setText("Retomar");
    } else {
      carPreto.retomar();
      pauseBlack.setText("Pause");
    }

  }

  // botao de pausa do carro vermelho
  public void pauseRed(ActionEvent event) {
    if (pauseRed.getText().equalsIgnoreCase("Pause")) {
      carVermelho.pausar();
      pauseRed.setText("Retomar");
    } else {
      carVermelho.retomar();
      pauseRed.setText("Pause");
    }
  }

  // botao de pausa do carro amarelo
  public void pauseYellow(ActionEvent event) {
    if (pauseYellow.getText().equalsIgnoreCase("Pause")) {
      carAmarelo.pausar();
      pauseYellow.setText("Retomar");
    } else {
      carAmarelo.retomar();
      pauseYellow.setText("Pause");
    }
  }

  // botao de pausa do carro laranja
  public void pauseOrange(ActionEvent event) {
    if (pauseOrange.getText().equalsIgnoreCase("Pause")) {
      carLaranja.pausar();
      pauseOrange.setText("Retomar");
    } else {
      carLaranja.retomar();
      pauseOrange.setText("Pause");
    }
  }

  // botao de pausa do carro verde
  public void pauseGreen(ActionEvent event) {
    if (pauseGreen.getText().equalsIgnoreCase("Pause")) {
      carVerde.pausar();
      pauseGreen.setText("Retomar");
    } else {
      carVerde.retomar();
      pauseGreen.setText("Pause");
    }
  }

  // botao de pausa do carro azul
  public void pauseBlue(ActionEvent event) {
    if (pauseBlue.getText().equalsIgnoreCase("Pause")) {
      carAzul.pausar();
      pauseBlue.setText("Retomar");
    } else {
      carAzul.retomar();
      pauseBlue.setText("Pause");
    }
  }

  // botao de pausa do carro ciano
  public void pauseCyan(ActionEvent event) {
    if (pauseCyan.getText().equalsIgnoreCase("Pause")) {
      carCiano.pausar();
      pauseCyan.setText("Retomar");
    } else {
      carCiano.retomar();
      pauseCyan.setText("Pause");
    }
  }

  // botao de pausa do carro rosa
  public void pausePink(ActionEvent event) {
    if (pausePink.getText().equalsIgnoreCase("Pause")) {
      carRosa.pausar();
      pausePink.setText("Retomar");
    } else {
      carRosa.retomar();
      pausePink.setText("Pause");
    }
  }

  // exibindo a quadra do carro preto
  public void exibirBlack(ActionEvent event) {
    if (exibirBlack.getText().equalsIgnoreCase("Exibir quadra")) {
      quadraBlack.setVisible(true);
      exibirBlack.setText("Ocultar quadra");
    } else {
      quadraBlack.setVisible(false);
      exibirBlack.setText("Exibir quadra");
    }
  }

  // exibindo a quadra do carro vermelho
  public void exibirRed(ActionEvent event) {
    if (exibirRed.getText().equalsIgnoreCase("Exibir quadra")) {
      quadraRed.setVisible(true);
      exibirRed.setText("Ocultar quadra");
    } else {
      quadraRed.setVisible(false);
      exibirRed.setText("Exibir quadra");
    }
  }

  // exibindo a quadra do carro amarelo
  public void exibirYellow(ActionEvent event) {
    if (exibirYellow.getText().equalsIgnoreCase("Exibir quadra")) {
      quadraYellow.setVisible(true);
      exibirYellow.setText("Ocultar quadra");
    } else {
      quadraYellow.setVisible(false);
      exibirYellow.setText("Exibir quadra");
    }
  }

  // exibindo a quadra do carro laranja
  public void exibirOrange(ActionEvent event) {
    if (exibirOrange.getText().equalsIgnoreCase("Exibir quadra")) {
      quadraOrange.setVisible(true);
      exibirOrange.setText("Ocultar quadra");
    } else {
      quadraOrange.setVisible(false);
      exibirOrange.setText("Exibir quadra");
    }
  }

  // exibindo a quadra do carro verde
  public void exibirGreen(ActionEvent event) {
    if (exibirGreen.getText().equalsIgnoreCase("Exibir quadra")) {
      quadraGreen.setVisible(true);
      exibirGreen.setText("Ocultar quadra");
    } else {
      quadraGreen.setVisible(false);
      exibirGreen.setText("Exibir quadra");
    }
  }

  // exibindo a quadra do carro azul
  public void exibirBlue(ActionEvent event) {
    if (exibirBlue.getText().equalsIgnoreCase("Exibir quadra")) {
      quadraBlue.setVisible(true);
      exibirBlue.setText("Ocultar quadra");
    } else {
      quadraBlue.setVisible(false);
      exibirBlue.setText("Exibir quadra");
    }
  }

  // exibindo a quadra do carro ciano
  public void exibirCyan(ActionEvent event) {
    if (exibirCyan.getText().equalsIgnoreCase("Exibir quadra")) {
      quadraCyan.setVisible(true);
      exibirCyan.setText("Ocultar quadra");
    } else {
      quadraCyan.setVisible(false);
      exibirCyan.setText("Exibir quadra");
    }
  }

  // exibindo a quadra do carro rosa
  public void exibirPink(ActionEvent event) {
    if (exibirPink.getText().equalsIgnoreCase("Exibir quadra")) {
      quadraPink.setVisible(true);
      exibirPink.setText("Ocultar quadra");
    } else {
      quadraPink.setVisible(false);
      exibirPink.setText("Exibir quadra");
    }
  }

  // funcao para controle de velocidade pelo slider
  public int sliderRed() {
    return (int) sliderRed.getValue();
  }

  // funcao para controle de velocidade pelo slider
  public int sliderGreen() {
    return (int) sliderGreen.getValue();
  }

  // funcao para controle de velocidade pelo slider
  public int sliderYellow() {
    return (int) sliderYellow.getValue();
  }

  // funcao para controle de velocidade pelo slider
  public int sliderBlue() {
    return (int) sliderBlue.getValue();
  }

  // funcao para controle de velocidade pelo slider
  public int sliderOrange() {
    return (int) sliderOrange.getValue();
  }

  // funcao para controle de velocidade pelo slider
  public int sliderPink() {
    return (int) sliderPink.getValue();
  }

  // verificar as threads para parar o jogo
  public void verificarThreads() {

    // verificacao carro a carro para saber se a thread esta iniciada
    if (carVermelho != null) {
      carVermelho.interrupt();
      carVermelho.pararThreads();
    } else if (carVermelho != null) {
      carVermelho.reiniciarInterrompido();
      carVermelho.reiniciarInterrompido();
    }

    // verificacao carro a carro para saber se a thread esta iniciada
    if (carVerde != null) {
      carVerde.interrupt();
      carVerde.pararThreads();
    } else if (carVerde != null) {
      carVerde.reiniciarInterrompido();
      carVerde.reiniciarInterrompido();
    }

    // verificacao carro a carro para saber se a thread esta iniciada
    if (carAzul != null) {
      carAzul.interrupt();
      carAzul.pararThreads();
    } else if (carAzul != null) {
      carAzul.reiniciarInterrompido();
      carAzul.reiniciarInterrompido();
    }

    // verificacao carro a carro para saber se a thread esta iniciada
    if (carLaranja != null) {
      carLaranja.interrupt();
      carLaranja.pararThreads();
    } else if (carLaranja != null) {
      carLaranja.reiniciarInterrompido();
      carLaranja.reiniciarInterrompido();
    }

    // verificacao carro a carro para saber se a thread esta iniciada
    if (carRosa != null) {
      carRosa.interrupt();
      carRosa.pararThreads();
    } else if (carRosa != null) {
      carRosa.reiniciarInterrompido();
      carRosa.reiniciarInterrompido();
    }

    // verificacao carro a carro para saber se a thread esta iniciada
    if (carAmarelo != null) {
      carAmarelo.interrupt();
      carAmarelo.pararThreads();
    } else if (carAmarelo != null) {
      carAmarelo.reiniciarInterrompido();
      carAmarelo.reiniciarInterrompido();
    }

    // verificacao carro a carro para saber se a thread esta iniciada
    if (carPreto != null) {
      carPreto.interrupt();
      carPreto.pararThreads();
    } else if (carPreto != null) {
      carPreto.reiniciarInterrompido();
      carPreto.reiniciarInterrompido();
    }

    // verificacao carro a carro para saber se a thread esta iniciada
    if (carCiano != null) {
      carCiano.interrupt();
      carCiano.pararThreads();
    } else if (carCiano != null) {
      carCiano.reiniciarInterrompido();
      carCiano.reiniciarInterrompido();
    }
  }

  // metodo para criar os semaforos somente quando o jogo for iniciado
  private void instanciarSemaforos() {

    // instanciando os semafaros, com os nomes 2 a 2, alguns cruzamentos
    // que seriam de mais de 2 carros, e algumas verificacoes para
    // tratar deadlocks
    mutexRedGreen = new Semaphore(0);
    mutexRedYellow = new Semaphore(0);
    mutexRedBlue = new Semaphore(0);
    mutexGrennYellow = new Semaphore(1);
    mutexGrennYellowOrangeCruzamento = new Semaphore(1);
    mutexGrennBlue = new Semaphore(1);
    mutexRedOrange = new Semaphore(0);
    mutexOrangeGreen = new Semaphore(0);
    mutexOrangeYellow = new Semaphore(0);
    mutexOrangeBlue = new Semaphore(0);
    mutexRedCyanCima = new Semaphore(1);
    mutexRedCyanEsquerda = new Semaphore(1);
    mutexRedCyanDireita = new Semaphore(1);
    mutexRedCyanBaixo = new Semaphore(1);
    VermelhoLiberandoProVerde = new Semaphore(0);
    LaranjaLiberandoProVerde = new Semaphore(1);
    VerdeLiberandoProAzul = new Semaphore(0);
    mutexRedPinkCima = new Semaphore(1);
    mutexRedPinkDireita = new Semaphore(1);
    mutexRedPinkBaixo = new Semaphore(1);
    mutexRedPinkEsquerda = new Semaphore(1);
    mutexGreenPinkEsquerda = new Semaphore(1);
    mutexGreenPinkCima = new Semaphore(1);
    mutexYellowPinkBaixo = new Semaphore(0);
    mutexYellowPinkEsquerda = new Semaphore(1);
    mutexYellowPinkCima = new Semaphore(1);
    mutexBluePinkCima = new Semaphore(1);
    mutexBluePinkBaixo = new Semaphore(1);
    mutexBluePinkDireita = new Semaphore(1);
    mutexOrangePinkDireita = new Semaphore(0);
    mutexOrangePinkBaixo = new Semaphore(1);
    mutexOrangePinkEsquerda = new Semaphore(1);
    vermelhoLiberandoProRosa = new Semaphore(1);
  }

}
