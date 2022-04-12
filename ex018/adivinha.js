/*
    ## IMPORTANTE ##
 luis seia
*/


let res = document.querySelector('section#result')
let sorteio = 0
let jogador = 0

function sortear() {
    let min = 1
    let max = 100
    let dif = max - min
    let aleatorio = Math.random()
    computador = min + Math.trunc(dif * aleatorio)
}

function jogar() {
    jogador = Number(window.prompt('Tente advinhar um numero escolhido pelo computador'))
    if (sorteio < computador) {
        res.innerHTML += `<p>Errdado!!!!! Você Escolheu ${sorteio}. O número sorteado é <strong>MAIOR</strong>! que ${sorteio}. 
        tente novamente</p>`
    } else if (sorteio > computador) {
        res.innerHTML += `<p>Errdado!!!!! Você Escolheu ${sorteio}. O número sorteado é <strong>MENOR</strong>! que ${sorteio}. tente novamente</p>`
    } else if (sorteio == computador) {
        res.innerHTML += `<p><strong>PARABÉNS!</strong> *******acertou! o numero sorteado é ${computador}********</p>`
        document.getElementById('botao').style.visibility = 'hidden'
    }
}
