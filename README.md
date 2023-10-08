# Projeto de Conta Bancária
Este é um projeto simples de Conta Bancária em Java que demonstra como criar e interagir com contas bancárias. Ele também ilustra o uso das funções try e catch para lidar com exceções.

## Descrição do Projeto
O projeto consiste em duas classes principais: Account e BusinessExceptions. Aqui está uma breve descrição de cada uma:

*Account*: Esta classe representa uma conta bancária e inclui atributos como número da conta, titular da conta, saldo e limite de saque. Além disso, possui métodos para depositar e sacar dinheiro, bem como uma validação de saque para garantir que o limite de saque e o saldo sejam respeitados.

*BusinessExceptions*: Esta é uma classe de exceção personalizada que estende *RuntimeException*. Ela é usada para representar exceções específicas relacionadas a problemas de negócios ou lógica de negócios em um aplicativo.

## Funcionalidades Principais
O projeto oferece as seguintes funcionalidades:

Criar uma conta bancária com um número de conta, titular da conta, saldo inicial e limite de saque.
Depositar dinheiro na conta.
Sacar dinheiro da conta, com validação de limite de saque e saldo disponível.
Capturar exceções personalizadas (BusinessExceptions) ao tentar realizar operações inválidas.

## Uso das Funções try e catch
O uso das funções *try* e *catch* é uma parte fundamental deste projeto. Eles são usados para capturar exceções que podem ocorrer durante a realização de operações em uma conta bancária. Por exemplo, ao tentar sacar uma quantia maior do que o limite de saque ou quando o saldo é insuficiente, uma exceção *BusinessExceptions* é lançada. Essas exceções são então capturadas em blocos *try-catch*, permitindo que o aplicativo trate os erros de maneira adequada e exiba mensagens de erro personalizadas para o usuário.
