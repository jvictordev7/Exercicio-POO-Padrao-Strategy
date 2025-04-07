
# Exercício POO - Padrão Strategy (Calculadora de Descontos)

Este repositório contém um exercício prático da disciplina de **Programação Orientada a Objetos (POO)**, desenvolvido no curso de **Análise e Desenvolvimento de Sistemas**.

## 💡 Objetivo

Implementar o padrão de projeto **Strategy**, que faz parte dos padrões comportamentais da Gang of Four (GoF).  
Neste projeto, foi criada uma **calculadora de descontos** que aplica diferentes estratégias com base no tipo de cliente:

- Cliente Comum → 5% de desconto
- Cliente VIP → 10% de desconto
- Cliente com Promoção → 20% de desconto

## 📁 Estrutura do Projeto

```
codigo/
├── CalculadoraDesconto.java
├── Desconto.java
├── DescontoClienteComum.java
├── DescontoVip.java
├── DescontoPromocional.java
└── Main.java

uml/
└── uml_strategy_desconto.png

documentacao/
└── Strategy_Desconto_Explicacao_Codigo.pdf
```

## 📌 Funcionalidades

- Interface para aplicar desconto
- Estratégias concretas para diferentes tipos de clientes
- Classe de contexto que aplica a estratégia selecionada dinamicamente
- Testes simples no console
- Diagrama UML
- PDF com explicações e código comentado

## 🛠️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/exercicio-poo-padrao-strategy.git
```

2. Abra no VS Code ou outro editor de sua preferência.

3. Compile e execute o arquivo `Main.java`.

## ✍️ Autor

**João Victor**  
Disciplina: Programação Orientada a Objetos  
Curso: Análise e Desenvolvimento de Sistemas  
Instituição: Centro Universitário de Lavras
