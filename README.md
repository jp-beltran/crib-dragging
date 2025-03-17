# Criptoanálise com Crib Dragging (OTP)

🔑 Este projeto implementa uma ferramenta simples em Java para realizar ataques de criptoanálise por meio da técnica de **crib-dragging** (arrastar berço), em cifras do tipo **One-Time Pad (OTP)**.

## 📚 Sobre a Técnica

A técnica de **crib-dragging** é utilizada para criptoanálise em cifras OTP quando uma mesma chave foi reutilizada indevidamente em múltiplas mensagens. Ao inserir um trecho conhecido ou suposto ("berço") em posições diferentes do XOR de duas cifras, é possível revelar trechos das mensagens originais.

## 🚀 Como Executar o Programa

### Compilar o código pelo terminal:

```bash
javac criptoanaliseOTP.java

```
### Executar o programa:

```bash
java criptoanaliseOTP


```

### O programa vai pedir que você informe:
- Número das duas mensagens cifradas para comparar (índice da coleção).
- Um "berço", ou seja, um texto conhecido ou suspeito de existir em uma das mensagens originais.
- 
## 🛠️ Estrutura do Projeto
criptoanaliseOTP.java: Código-fonte principal que realiza a criptoanálise com a técnica de crib-dragging.

### ▶️ Exemplo de Uso

```bash
Digite o número da primeira cifra: 0  
Digite o número da segunda cifra: 1  
Digite o berço: exemplo  

```

### 🚀 Como contribuir
Contribuições são bem-vindas! Para contribuir:

- Fork o repositório
- Crie um branch (git checkout -b feature/sua-contribuicao)
- Faça o commit das alterações (git commit -am "Sua contribuição")
- Push (git push origin feature/sua-contribuicao)
- Abra um Pull Request

> Desenvolvido por: jp-beltran
> 🎓 Projeto acadêmico para estudo em Segurança Digital.
