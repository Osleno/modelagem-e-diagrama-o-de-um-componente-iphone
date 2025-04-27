# Componente iPhone - Modelagem e Diagramação UML

Este projeto simula o componente iPhone:

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Iphone {
    }

    Iphone implements ReprodutorMusical
    Iphone implements AparelhoTelefonico
    Iphone implements NavegadorInternet
