// botao ativar menu -- Sempre iniciará como 'none'

function clickMenu() {
    if(menuResponsivo.style.display == 'none') { //Iniciará como 'none'
        menuResponsivo.style.display = 'block' //Quando clicado irá se tornar 'block'

    }else {
        menuResponsivo.style.display = 'none' //Clicou novamente 'none'
    }
};