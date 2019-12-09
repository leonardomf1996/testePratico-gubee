$(function(){
    $("table input").keyup(function(){ // keyup() é o método que os registros da tabela serão filtrados a partir 
                                       //da coluna em que se efetuou o filtro e o valor que foi digitado
        
        var index = $(this).parent().index(); //a variável 'index' receberá como valor, a coluna que contém o input
                                              // que invocou o evento. Para recuperar este objeto, utilizei 
                                              // o método parent() da biblioteca jQuery
                                              
        var nth = "table td:nth-child("+(index+1).toString()+")"; // a variável 'nth' é apenas um string para ser 
                                                                  //usada depois na seleção da coluna filtrada 
                                                                  //em todas as linhas da tabela

        var valor = $(this).val().toUpperCase(); // a variável 'valor' receberá o conteúdo o input que está sendo 
                                                 //utilizado para fazer o filtro, convertendo o texto para maiúsculo
        $("#tabela tbody tr").show();
        $(nth).each(function(){ // utilizei a função each() da jQuery para realizar uma ação para cada coluna 
                                //filtrada pelo seletor definido anteriormente pela variável 'nt'
            if($(this).text().toUpperCase().indexOf(valor) < 0){
                $(this).parent().hide();
            }
        });
    }); // caso a coluna filtrada contenha o texto digitado, a linha que a contém é ocultada. Para isso usei novamente 
    //a função parent() para recuperar a tag TR que contém a tag TD utilizada para a verificação. A existência ou não 
    //do texto digitado na coluna é informada pela função indexOf() do Javascript, que retornará -1 se o 
    //valor informado não estiver contido no texto alvo. Assim, se a coluna não contém o texto digitado, a linha 
    //que a contém é ocultada
});