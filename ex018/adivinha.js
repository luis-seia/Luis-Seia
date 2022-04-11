/*
    ## IMPORTANTE ##
 luis seia
*/

// Todas as variáveis declaradas aqui em cima - fora das funções - são consideradas GLOBAIS e funcionam dentro de qualquer outra função!
let res = document.querySelector('section#result')
let computador = 0
let jogador = 0

function sortear() {
    let min = 1 // As variáveis declaradas aqui dentro são LOCAIS, e só funcionam dentro da função onde foram declaradas
    let max = 100
    let dif = max - min
    let aleatorio = Math.random()
    computador = min + Math.trunc(dif * aleatorio)
}

function jogar() {
    jogador = Number(window.prompt('Qual é o seu palpite?'))
    if (jogador < computador) {
        res.innerHTML += `<p>Errdado!!!!! Você Escolheu ${jogador}. O número sorteado é <strong>MAIOR</strong>! que ${jogador}. 
        tente novamente</p>`
    } else if (jogador > computador) {
        res.innerHTML += `<p>Errdado!!!!! Você Escolheu ${jogador}. O número sorteado é <strong>MENOR</strong>! que ${jogador}. tente novamente</p>`
    } else if (jogador == computador) {
        res.innerHTML += `<p><strong>PARABÉNS!</strong> Boisse Mandinho acertou! o numero sorteado é ${computador}!</p>`
        document.getElementById('botao').style.visibility = 'hidden'
    }
}