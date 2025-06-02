# g2
# 💡 Sistema de Avaliação de Risco de SPDA com base na NBR 5410

Este projeto visa desenvolver uma aplicação computacional capaz de calcular automaticamente os riscos associados a Sistemas de Proteção contra Descargas Atmosféricas (SPDA), conforme as normas **NBR 5410** e **NBR 5419**. A ferramenta busca auxiliar engenheiros e técnicos na tomada de decisões durante o projeto de instalações elétricas de baixa tensão.

---

## 📌 Seção 1 - Introdução

A proteção contra descargas atmosféricas é essencial para a segurança de edificações e pessoas. Apesar das diretrizes normativas existentes, a avaliação de risco ainda é frequentemente realizada de maneira manual ou ineficiente, o que pode comprometer sua precisão e conformidade.

### ✅ Justificativa

A ausência de ferramentas confiáveis para avaliação de risco de SPDA impacta diretamente na segurança de edificações. Uma aplicação automatizada garante maior confiabilidade, padronização e eficiência no processo.

### 🧩 Descrição do Problema

Muitos projetos não realizam a devida análise quantitativa dos riscos conforme exige a norma, devido à complexidade dos cálculos e à falta de ferramentas acessíveis.

### 🚀 Motivação

Desenvolver um software intuitivo que execute os cálculos de risco conforme as normas, promovendo segurança técnica e agilidade nos projetos.

---

## 📝 Seção 2 - Plano

### 🎯 Objetivo Geral

Criar uma aplicação que automatize o cálculo de risco de SPDA com base nos parâmetros exigidos pela **NBR 5410/5419**.

### 🎯 Objetivos Específicos

- Entrada de parâmetros do projeto (dimensões, localização, tipo de estrutura, etc.);
- Implementação dos cálculos normativos (RA, RB, RC, RD);
- Apresentação clara dos resultados com recomendações técnicas;
- Geração automática de relatórios em PDF;
- Validação dos resultados com base na norma.

---

## 📊 Seção 3 - Divisão de Tarefas

| Tarefa | Responsável | Descrição | Prazo Estimado |
|--------|-------------|-----------|----------------|
| Levantamento das fórmulas normativas | **Yan** | Estudo da NBR 5410/5419 e definição dos critérios de risco | Semana 1 |
| Interface de entrada de dados | **Jonathas** | Criar interface para entrada dos parâmetros do projeto | Semana 2 |
| Implementação dos cálculos de risco | **Márcio** | Programar os cálculos RA, RB, RC, RD, risco total | Semana 3 |
| Geração do relatório em PDF | **Kayk** | Implementar exportação e formatação dos resultados | Semana 4 |
| Testes, validação e documentação | **Thiago** | Realizar testes e documentar o uso da ferramenta | Semana 5 |

---

## 🛠️ Seção 4 - Modelagem Inicial

### 🧱 Diagrama de Classes (descrição)

- `Projeto`: dados gerais da edificação;
- `Risco`: módulo com os cálculos normativos;
- `Relatorio`: geração e exportação de resultados.

### 🔁 Diagrama de Sequência (resumo)

1. Entrada de dados pelo usuário  
2. Processamento interno das fórmulas  
3. Execução dos cálculos de risco  
4. Exibição dos resultados  
5. Geração do relatório em PDF  

### ⚙️ Casos de Uso

- **Cadastrar Projeto:** inserir dados da edificação
- **Calcular Risco:** executar os cálculos de forma automática
- **Visualizar Resultado:** mostrar os riscos parciais e total
- **Exportar Relatório:** gerar documento com os dados e recomendações

---

## 👨‍💻 Equipe

- **Yan** – Normas e fórmulas
- **Jonathas** – Interface do sistema
- **Márcio** – Cálculos e lógica
- **Kayk** – Relatórios e exportação
- **Thiago** – Testes e documentação

---

> Projeto acadêmico com base nas normas brasileiras NBR 5410 e NBR 5419.
