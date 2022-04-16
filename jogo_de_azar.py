# Cenário
# A Sra. Maria opera uma empresa de jogos de azar e gostaria de ter um jogo 
# disponível nos computadores dos clientes em que possam escolher um número de 1 a 10. 
# Após receber estes dados do cliente, o computador deve também escolher um número de 1 a 10. 
# Se os dois números forem os mesmos, o cliente ganha. Caso contrário, o cliente perde.

import random

# 1. Receber o numero escolhido pelo cliente
dados = input('Introduza um numero de 1 a 10: ')
escolha_do_cliente = int(dados)

# 2. Gerar numero aleatorio de 1 a 10
escolha_do_computador = random.randint(1,10)

print('Cliente escolheu: ', escolha_do_cliente)
print('Computador escolheu: ', escolha_do_computador)

# 3. Comparar numero do usuario com o aleatorio
if escolha_do_cliente == escolha_do_computador:

    # 4. Se os numeros forem iguais, o cliente ganhou
    print('Parabéns!!! O cliente ganhou!!!')

# 5. Se os numeros nao forem iguais, o cliente perdeu
else:
    print('---Não ganhou. Boa sorte para próxima vez---')
