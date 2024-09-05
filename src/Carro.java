
/** ******.********************************************************
 * Autor...........: Pedro Lucca Silva Martins
 * Matricula........: 202210183
 * Inicio...........: 20/12/2023
 * Ultima alteracao.: 04/12/2023
 * Nome.............: Classe carro
 * Funcao...........: Instanciar e controlar objetos do tipo carro
 *************************************************************** */
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class Carro extends Thread {

  private ImageView image;
  private volatile Boolean pausado = false;
  private volatile boolean interrompido = false;
  private FXMLController controller;
  private Semaphore semaforo;
  private volatile String cor;

  public Carro(ImageView image, String cor, FXMLController controller) {
    this.image = image;
    this.cor = cor;
    this.controller = controller;
  }

  public void run() {
    while (true) {

      // para resetar o jogo
      if (interrompido) {
        interromperJogo();
        break;
      }

      // codigos de movimento dos carros
      movimentarCarroPreto();
      movimentarCarroVermelho();
      movimentarCarroAmarelo();
      movimentarCarroLaranja();
      movimentarCarroVerde();
      movimentarCarroAzul();
      movimentarCarroCiano();
      movimentarCarroRosa();
    }
  }

  public void pausar() {
    pausado = true;
  }

  public void retomar() {
    pausado = false;
  }

  public void interromperJogo() {
    if (interrompido) {
      if (cor == "vermelho") {
        Platform.runLater(() -> {
          image.setLayoutX(162);
          image.setLayoutY(122);
          image.setRotate(0);
        });
      }
    }
    if (cor == "verde") {
      Platform.runLater(() -> {
        image.setLayoutX(162);
        image.setLayoutY(486);
        image.setRotate(0);
      });
    }
    if (cor == "azul") {
      Platform.runLater(() -> {
        image.setLayoutX(777);
        image.setLayoutY(120);
        image.setRotate(180);
      });
    }
    if (cor == "amarelo") {
      Platform.runLater(() -> {
        image.setLayoutX(413);
        image.setLayoutY(740);
        image.setRotate(90);
      });
    }
    if (cor == "rosa") {
      Platform.runLater(() -> {
        image.setLayoutX(387);
        image.setLayoutY(614);
        image.setRotate(0);
      });
    }
    if (cor == "laranja") {
      Platform.runLater(() -> {
        image.setLayoutX(790);
        image.setLayoutY(513);
        image.setRotate(270);
      });
    }
  }

  // codigo para movimentacao e tratamento de semaforo do carro preto
  private void movimentarCarroPreto() {
    if (cor == "preto") {

      // curva f6
      while (image.getLayoutX() < 794) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva f3
      while (image.getLayoutY() > 355) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva b3
      while (image.getLayoutX() > 290) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva b2
      while (image.getLayoutY() > 229) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva b2
      while (image.getLayoutX() < 794) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva f2
      while (image.getLayoutY() > 122) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva f1
      while (image.getLayoutX() > 164) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva a1
      while (image.getLayoutY() < 484) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva a4
      while (image.getLayoutX() < 674) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva e4
      while (image.getLayoutY() < 613) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva e5
      while (image.getLayoutX() > 164) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva a5
      while (image.getLayoutY() < 742) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }
    }
  }

  // codigo para movimentacao e tratamento de semaforo do carro vermelho
  private void movimentarCarroVermelho() {
    if (cor == "vermelho") {

      try {
        FXMLController.vermelhoLiberandoProRosa.acquire();
      } catch (InterruptedException ex) {

      }
      
      // anda ate sair da zona com o amarelo
      // entrar na RC com o ciano
      while (image.getLayoutX() < 430) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }// fim do if
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      } // fim do while

      try {
        FXMLController.mutexRedCyanCima.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexRedPinkCima.acquire();
      } catch (InterruptedException ex) {

      }

      FXMLController.mutexRedYellow.release();

      // para tentar entrar na RC com o azul
      // avisar que saiu da RC com o ciano
      while (image.getLayoutX() < 523) {
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedBlue.acquire();
      } catch (InterruptedException ex) {

      }

      FXMLController.VermelhoLiberandoProVerde.release();

      FXMLController.mutexRedPinkCima.release();

      FXMLController.mutexRedCyanCima.release();

      // anda ate sair da RC com o verde 
      while (image.getLayoutX() < 555) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while
      FXMLController.mutexRedGreen.release();

      // anda a1
      while (image.getLayoutX() < 790) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      FXMLController.vermelhoLiberandoProRosa.release();
      
      try {
        FXMLController.VermelhoLiberandoProVerde.acquire();
      } catch (InterruptedException ex) {

      }

      Platform.runLater(() -> {
        image.setRotate(270);
      });
      // anda ate a RC com o rosa
      while (image.getLayoutY() < 210) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedPinkDireita.acquire();
      } catch (InterruptedException ex) {

      }

      // anda ate a RC com o ciano
      while (image.getLayoutY() < 339) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedCyanDireita.acquire();
      } catch (InterruptedException ex) {

      }

      // anda ate a RC com o laranja
      while (image.getLayoutY() < 465) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedOrange.acquire();
      } catch (InterruptedException ex) {

      }

      FXMLController.mutexRedCyanDireita.release();

      // sai da RC direita com o rosa
      while (image.getLayoutY() < 637) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      FXMLController.mutexRedPinkDireita.release();

      // anda f1
      while (image.getLayoutY() < 742) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while
      
      Platform.runLater(() -> {
        image.setRotate(180);
      });
      // saindo da RC com o azul
      // entrando na RC com o ciano
      while (image.getLayoutX() > 540) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedCyanBaixo.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexRedPinkBaixo.acquire();
      } catch (InterruptedException ex) {

      }

      FXMLController.mutexRedBlue.release();

      // antes da zona com o amarelo
      while (image.getLayoutX() > 436) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedYellow.acquire();
      } catch (InterruptedException ex) {

      }

      FXMLController.mutexRedPinkBaixo.release();
      FXMLController.mutexRedCyanBaixo.release();

      // anda f6
      while (image.getLayoutX() > 158) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while
      
      Platform.runLater(() -> {
        image.setRotate(90);
      });
      // anda ate chegar na RC com o rosa
      while (image.getLayoutY() > 637) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedPinkEsquerda.acquire();
      } catch (InterruptedException ex) {

      }

      // ate chegar na RC com o verde
      // ate chegar na RC com o ciano
      while (image.getLayoutY() > 507) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedCyanEsquerda.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexRedGreen.acquire();
      } catch (InterruptedException ex) {

      }

      FXMLController.mutexRedOrange.release();

      // sai da RC com o ciano
      while (image.getLayoutY() > 339) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      FXMLController.mutexRedCyanEsquerda.release();

      // saindo da RC com o rosa
      while (image.getLayoutY() > 210) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      FXMLController.mutexRedPinkEsquerda.release();

      // anda a6
      while (image.getLayoutY() > 121) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderRed());
        } catch (InterruptedException ex) {

        }
      }// fim do while
      
      Platform.runLater(() -> {
        image.setRotate(0);
      });
    }
  }

  // codigo para movimentacao e tratamento de semaforo do carro amarelo
  private void movimentarCarroAmarelo() {
    if (cor == "amarelo") {

      Platform.runLater(() -> {
        image.setRotate(90);
      });
      //saindo da RC com laranja
      while (image.getLayoutY() > 723) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      FXMLController.mutexOrangeYellow.release();

      //ate chegar no cruzamento com o verde e laranja
      while (image.getLayoutY() > 509) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexGrennYellowOrangeCruzamento.acquire();
      } catch (InterruptedException ex) {

      }

      //saindo do cruzamento com o verde e laranja
      while (image.getLayoutY() > 464) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      FXMLController.mutexGrennYellowOrangeCruzamento.release();

      FXMLController.mutexYellowPinkBaixo.release();
      
      //ate chegar na zona com o rosa
      while (image.getLayoutY() > 260) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while
      
      try {
        FXMLController.mutexYellowPinkCima.acquire();
      } catch (InterruptedException ex) {

      }
      
      //ate chegar na zona com o vermelho
      while (image.getLayoutY() > 152) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexRedYellow.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexGrennYellow.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.mutexYellowPinkCima.release();

      Platform.runLater(() -> {
        image.setRotate(0);
      });
      // resto da subida
      while (image.getLayoutY() > 121) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      // reta superior
      while (image.getLayoutX() > 160) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      Platform.runLater(() -> {
        image.setRotate(270);
      });
      
      // parando pra RC com o rosa
      while (image.getLayoutY() < 212) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while
      
      try {
        FXMLController.mutexYellowPinkEsquerda.acquire();
      } catch (InterruptedException ex) {

      }
      
      
      // descida esquerda parando pra RC laranja
      while (image.getLayoutY() < 467) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      try {
        FXMLController.mutexOrangeYellow.acquire();
      } catch (InterruptedException ex) {

      }

      // descida esquerda ate sair da RC verde
      while (image.getLayoutY() < 507) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while
      
      FXMLController.mutexGrennYellow.release();
      
      // descida esquerda ate sair da RC rosa
      while (image.getLayoutY() < 637) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      FXMLController.mutexYellowPinkEsquerda.release();

      // descida esquerda
      while (image.getLayoutY() < 742) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while

      Platform.runLater(() -> {
        image.setRotate(180);
      });
      // reta inferior
      while (image.getLayoutX() < 410) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderYellow());
        } catch (InterruptedException ex) {

        }
      }// fim do while
      FXMLController.mutexRedYellow.release();
      try {
        FXMLController.mutexYellowPinkBaixo.acquire();
        //FXMLController.mutexOrangeYellow.release();
      } catch (InterruptedException ex) {

      }
    }
  }

  // codigo para movimentacao e tratamento de semaforo do carro laranja
  private void movimentarCarroLaranja() {
    if (cor == "laranja") {

      // curva f4
      while (image.getLayoutY() > 487) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedOrange.release();
      FXMLController.mutexOrangeBlue.release();
      FXMLController.mutexOrangePinkDireita.release();

      Platform.runLater(() -> {
        image.setRotate(180);
      });
      // anda ate a RC com o verde
      while (image.getLayoutX() > 570) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexOrangeGreen.acquire();
      } catch (InterruptedException ex) {

      }
      try {
        FXMLController.mutexOrangeBlue.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.LaranjaLiberandoProVerde.acquire();
      } catch (InterruptedException ex) {

      }

      // saindo do cruzamento com o laranja
      while (image.getLayoutX() > 528) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexOrangeBlue.release();

      // anda ate o cruzamento com o amarelo e verde
      while (image.getLayoutX() > 436) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexGrennYellowOrangeCruzamento.acquire();
      } catch (InterruptedException ex) {

      }

      // passa o cruzamento com o amarelo e verde
      while (image.getLayoutX() > 400) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexGrennYellowOrangeCruzamento.release();

      // anda ate a RC com o vermelho
      while (image.getLayoutX() > 180) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedOrange.acquire();

      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexOrangeYellow.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexOrangePinkEsquerda.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.LaranjaLiberandoProVerde.release();

      Platform.runLater(() -> {
        image.setRotate(90);
      });
      //curva a4
      while (image.getLayoutX() > 163) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexOrangeGreen.release();

      // liberando a RC esquerda com o rosa
      while (image.getLayoutY() < 637) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }
      
      FXMLController.mutexOrangePinkEsquerda.release();
      
      
      // curva a6
      while (image.getLayoutY() < 742) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(0);
      });
      
      // saindo da RC com o amarelo
      while (image.getLayoutX() < 436) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexOrangePinkBaixo.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.mutexOrangeYellow.release();

      // entrar na RC com o azul
      while (image.getLayoutX() < 524) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexOrangeBlue.acquire();
      } catch (InterruptedException ex) {

      }

      // liberando a RC de baixo com o rosa
      FXMLController.mutexOrangePinkBaixo.release();
      
      // curva a6
      while (image.getLayoutX() < 795) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderOrange());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(270);
      });
    }
  }

  // codigo para movimentacao e tratamento de semaforo do carro verde
  private void movimentarCarroVerde() {
    if (cor == "verde") {

      // anda ate chegar no cruzamento com o amarelo e laranja
      while (image.getLayoutX() < 389) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexGrennYellowOrangeCruzamento.acquire();
      } catch (InterruptedException ex) {

      }

      // saindo do cruzamento com o amarelo e laranja
      while (image.getLayoutX() < 426) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexGrennYellowOrangeCruzamento.release();

      // antes de entrar na RC com o azul
      while (image.getLayoutX() < 512) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      // fazer uma verificação, so pode entrar aqui caso o vermelho esteja na
      // RC com o azul, pq ai o caminho em cima ta livre
      try {

        FXMLController.VermelhoLiberandoProVerde.acquire();
      } catch (InterruptedException ex) {

      }
      try {
        FXMLController.mutexGrennBlue.acquire();
      } catch (InterruptedException ex) {

      }

      Platform.runLater(() -> {
        image.setRotate(270);
      });
      
      // reta inferior
      while (image.getLayoutX() < 540) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexGreenPinkCima.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.mutexOrangeGreen.release();

      FXMLController.VermelhoLiberandoProVerde.release();
      
      // antes de entrar na RC com o rosa
      while (image.getLayoutY() > 257) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }
      
      
      // antes de entrar na RC com o vermelho
      while (image.getLayoutY() > 150) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.LaranjaLiberandoProVerde.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexOrangeGreen.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexRedGreen.acquire();
      } catch (InterruptedException ex) {

      }

      FXMLController.LaranjaLiberandoProVerde.release();

      FXMLController.mutexGrennBlue.release();

      // subida direta
      while (image.getLayoutY() > 121) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.VerdeLiberandoProAzul.release();

      Platform.runLater(() -> {
        image.setRotate(180);
      });
      // antes de entrar na RC com o amarelo
      while (image.getLayoutX() > 437) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.VerdeLiberandoProAzul.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexGrennYellow.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.mutexGreenPinkCima.release();

      // reta superior
      while (image.getLayoutX() > 160) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(90);
      });
      
      // andando ate a rc com o rosa
      while (image.getLayoutY() < 212) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }
      
      try {
        FXMLController.mutexGreenPinkEsquerda.acquire();
      } catch (InterruptedException ex) {

      }
      
      // andando ate a rc com o laranja
      while (image.getLayoutY() < 464) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      // curva a4
      while (image.getLayoutY() < 485) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderGreen());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedGreen.release();
      FXMLController.mutexGrennYellow.release();
      FXMLController.LaranjaLiberandoProVerde.release();
      FXMLController.mutexGreenPinkEsquerda.release();
      Platform.runLater(() -> {
        image.setRotate(0);
      });
    }
  }

  // codigo para movimentacao e tratamento de semaforo do carro azul
  private void movimentarCarroAzul() {
    if (cor == "azul") {

      Platform.runLater(() -> {
        image.setRotate(180);
      });
      
      
      // parar antes da RC com o verde
      while (image.getLayoutX() > 568) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      
      try {
        FXMLController.mutexBluePinkCima.acquire();
      } catch (InterruptedException ex) {

      }
      
      try {
        FXMLController.mutexGrennBlue.acquire();
      } catch (InterruptedException ex) {

      }
      
      

      // curva d1
      while (image.getLayoutX() > 540) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(90);
      });
      // liberando a RC pro vermelho
      while (image.getLayoutY() < 140) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedBlue.release();

      // liberando a RC pro rosa
      while (image.getLayoutY() < 140) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }
      
      FXMLController.mutexBluePinkCima.release();
      
      // verificando cruzamento com o laranja
      while (image.getLayoutY() < 464) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexOrangeBlue.acquire();
      } catch (InterruptedException ex) {

      }

      // saindo da RC com o verde
      while (image.getLayoutY() < 510) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexOrangeBlue.release();
      FXMLController.mutexGrennBlue.release();

      // entrando na RC de baixo com o rosa
      while (image.getLayoutY() < 590) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }
      
      try {
        FXMLController.mutexBluePinkBaixo.acquire();
      } catch (InterruptedException ex) {

      }
      
      // antes de entrar na RC com o vermelho
      while (image.getLayoutY() < 715) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.VerdeLiberandoProAzul.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.VerdeLiberandoProAzul.release();
      
      try {
        FXMLController.mutexRedBlue.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexOrangeBlue.acquire();
      } catch (InterruptedException ex) {

      }


      FXMLController.mutexBluePinkBaixo.release();
      
      // curva d6
      while (image.getLayoutY() < 739) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(0);
      });
      // curva f6
      while (image.getLayoutX() < 789) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(270);
      });
      
      // entrando na RC da direita com o rosa
      while (image.getLayoutY() > 645) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }
      
      try {
        FXMLController.mutexBluePinkDireita.acquire();
      } catch (InterruptedException ex) {

      }
      
      // saindo da RC com o laranja
      while (image.getLayoutY() > 464) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexOrangeBlue.release();

      // saindo da RC da direita com o rosa
      while (image.getLayoutY() > 200) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }

      }
      
      FXMLController.mutexBluePinkDireita.release();
      
      // curva f1
      while (image.getLayoutY() > 121) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderBlue());
        } catch (InterruptedException ex) {

        }

      }
    }
  }

  // codigo para movimentacao e tratamento de semaforo do carro ciano
  private void movimentarCarroCiano() {
    if (cor == "ciano") {
      // desce c1
      while (image.getLayoutY() < 356) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      while (image.getLayoutX() > 186) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedCyanEsquerda.acquire();
      } catch (InterruptedException ex) {

      }

      // curva a3
      while (image.getLayoutX() > 163) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva a4
      while (image.getLayoutY() < 485) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedCyanEsquerda.release();

      // curva c4
      while (image.getLayoutX() < 417) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // antes da RC com vermelho
      while (image.getLayoutY() < 728) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedCyanBaixo.acquire();
      } catch (InterruptedException ex) {

      }

      // curva c6
      while (image.getLayoutY() < 742) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }
      // curva d6
      while (image.getLayoutX() < 547) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedCyanBaixo.release();

      // curva d4
      while (image.getLayoutY() > 488) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // antes da RC com o vermelho
      while (image.getLayoutX() < 775) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedCyanDireita.acquire();
      } catch (InterruptedException ex) {

      }

      // curva f4
      while (image.getLayoutX() < 795) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }
      // curva f3
      while (image.getLayoutY() > 359) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedCyanDireita.release();

      // curva d3
      while (image.getLayoutX() > 548) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // antes da RC com o vermelho
      while (image.getLayoutY() > 141) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedCyanCima.acquire();
      } catch (InterruptedException ex) {

      }

      // curva d1
      while (image.getLayoutY() > 121) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      // curva c1
      while (image.getLayoutX() > 419) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(10);
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedCyanCima.release();

    }
  }

  // codigo para movimentacao e tratamento de semaforo do carro rosa
  private void movimentarCarroRosa() {
    if (cor == "rosa") {

      Platform.runLater(() -> {
        image.setRotate(0);
      });
      // anda ate a RC com o vermelho
      // anda ate a RC com o amarelo
      // anda ate a RC com o laranja
      while (image.getLayoutX() > 180) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedPinkEsquerda.acquire();
      } catch (InterruptedException ex) {

      }
      
      try {
        FXMLController.mutexYellowPinkEsquerda.acquire();
      } catch (InterruptedException ex) {

      }
      
      try {
        FXMLController.mutexOrangePinkEsquerda.acquire();
      } catch (InterruptedException ex) {

      }

      Platform.runLater(() -> {
        image.setRotate(90);
      });
      // curva a5
      while (image.getLayoutX() > 157) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }
      
      // andando ate RC com verde
      while (image.getLayoutY() > 513) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }
      
      try {
        FXMLController.mutexGreenPinkEsquerda.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.mutexOrangePinkEsquerda.release();
      
      
      // saindo da RC com verde, vermelho, e amarelo
      while (image.getLayoutY() > 231) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedPinkEsquerda.release();
      FXMLController.mutexGreenPinkEsquerda.release();
      FXMLController.mutexYellowPinkEsquerda.release();
      
      Platform.runLater(() -> {
        image.setRotate(180);
      });
      // anda ate a RC com o amarelo
      while (image.getLayoutX() < 387) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }
      
      try {
        FXMLController.mutexGreenPinkCima.acquire();
      } catch (InterruptedException ex) {

      }
      
      try {
        FXMLController.mutexYellowPinkCima.acquire();
      } catch (InterruptedException ex) {

      }
      
      try {
        FXMLController.vermelhoLiberandoProRosa.acquire();
      } catch (InterruptedException ex) {

      }
      
      try {
        FXMLController.mutexBluePinkCima.acquire();
      } catch (InterruptedException ex) {

      }
      
      // curva c1
      while (image.getLayoutX() < 412) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(90);
      });
      // antes da RC de cima com o vermelho
      while (image.getLayoutY() > 141) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedPinkCima.acquire();
      } catch (InterruptedException ex) {

      }
      
      
      FXMLController.mutexYellowPinkCima.release();

      // curva c1
      while (image.getLayoutY() > 121) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(180);
      });
      
      FXMLController.vermelhoLiberandoProRosa.release();
      
      // curva d1
      while (image.getLayoutX() < 543) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexRedPinkCima.release();
      FXMLController.mutexGreenPinkCima.release();
      
      Platform.runLater(() -> {
        image.setRotate(270);
      });
      
      // curva d1
      while (image.getLayoutY() < 228) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      FXMLController.mutexBluePinkCima.release();
      
      Platform.runLater(() -> {
        image.setRotate(180);
      });
      // anda ate a RC direita com o vermelho
      // anda ate a RC com o azul
      while (image.getLayoutX() < 760) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedPinkDireita.acquire();
      } catch (InterruptedException ex) {

      }
      
      try {
        FXMLController.mutexBluePinkDireita.acquire();
      } catch (InterruptedException ex) {

      }

      Platform.runLater(() -> {
        image.setRotate(270);
      });
      // curva f2
      while (image.getLayoutX() < 787) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

       // anda ate a RC com o laranja
      while (image.getLayoutY() < 615) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }
      
      try {
        FXMLController.mutexOrangePinkDireita.acquire();
      } catch (InterruptedException ex) {

      }
      
      Platform.runLater(() -> {
        image.setRotate(270);
      });
      // curva f5
      while (image.getLayoutY() < 615) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(0);
      });

      FXMLController.mutexBluePinkDireita.release();
      FXMLController.mutexOrangePinkDireita.release();
      
      // parando antes da RC de baixo com o azul
      while (image.getLayoutX() > 571) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }
      FXMLController.mutexRedPinkDireita.release();
      
      try {
        FXMLController.mutexBluePinkBaixo.acquire();
      } catch (InterruptedException ex) {

      }
      
      
      // curva d5
      while (image.getLayoutX() > 543) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(270);
      });
      // andando ate a RC debaixo com o vermelho
      while (image.getLayoutY() < 722) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexRedPinkBaixo.acquire();
      } catch (InterruptedException ex) {

      }

      try {
        FXMLController.mutexOrangePinkBaixo.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.mutexBluePinkBaixo.release();
      
      // curva d6
      while (image.getLayoutY() < 742) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() + 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      Platform.runLater(() -> {
        image.setRotate(0);
      });
      // parando antes da RC com o amarelo
      while (image.getLayoutX() > 440) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      // curva c6
      while (image.getLayoutX() > 419) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutX(image.getLayoutX() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
      }

      try {
        FXMLController.mutexYellowPinkBaixo.acquire();
      } catch (InterruptedException ex) {

      }
      
      FXMLController.mutexRedPinkBaixo.release();
      FXMLController.mutexOrangePinkBaixo.release();
      
      Platform.runLater(() -> {
        image.setRotate(90);
      });
      // curva c5
      while (image.getLayoutY() > 616) {
        // para resetar o jogo
        if (interrompido) {
          interromperJogo();
          break;
        }
        // pausar
        while (pausado) {
          System.out.println("");
          if (!pausado) {
            break;
          }
        }
        Platform.runLater(() -> {
          image.setLayoutY(image.getLayoutY() - 1);
        });
        try {
          Thread.sleep(controller.sliderPink());
        } catch (InterruptedException ex) {

        }
        // saindo da RC de baixo com o amarelo
        FXMLController.mutexYellowPinkBaixo.release();
      }
    }
  }

  // metodo responsavel por resetar o jogo
  public void pararThreads() {
    interrompido = true;
  }

  // metodo responsavel por deixar o jogo em situacao de ser iniciado
  // novamente
  public void reiniciarInterrompido() {
    interrompido = false;
  }

}
