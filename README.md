 💱 Conversor de Moedas em Java  
Challenge Alura + Oracle - Formação Backend

Projeto de Conversor de Moedas desenvolvido em Java, com menu interativo no terminal e integração com uma API externa de câmbio, permitindo conversões em tempo real entre diferentes moedas.

---

 📌 Funcionalidades:

- Menu interativo no terminal
- Conversão entre as moedas:
  - Real (BRL) ⇄ Dólar (USD)
  - Real (BRL) ⇄ Euro (EUR)
  - Dólar (USD) ⇄ Euro (EUR)
- Consulta de taxas de câmbio em tempo real
- Tratamento de opções inválidas
- Tratamento de erros de comunicação com a API
- Formatação de valores monetários com duas casas decimais

---

🛠️ Tecnologias Utilizadas:

- Java 17+
- HttpClient (java.net.http)
- Gson (para desserialização do JSON)
- ExchangeRate API
- Enum para representar códigos de moedas
- Scanner para entrada de dados via terminal

---

 🧱 Estrutura do Projeto

- 📁 src
┣  ConversorDeMoedas.java → Classe principal (menu e fluxo do programa)
┣  ServicoDeCambio.java → Comunicação com a API de câmbio
┣  RespostaCambio.java → Mapeamento da resposta JSON da API
┣  CodigoMoeda.java → Enum com os códigos das moedas

---


 ▶️ Como Executar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git 
```
2 - Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)
3 - Certifique-se de que o Java 17 ou superior está instalado

Execute a classe:
ConversorDeMoedas.java

---

🌐 API Utilizada
ExchangeRate API
Endpoint utilizado:
https://v6.exchangerate-api.com/v6/{API_KEY}/latest/{MOEDA_BASE}
⚠️ **Observação:**  
Para executar o projeto, é necessário gerar sua própria API Key na ExchangeRate API e substituí-la no código.

---

👩‍💻 Autora

Rayza Geandra Monteiro de Sales
Estudante de Análise e Desenvolvimento de Sistemas

