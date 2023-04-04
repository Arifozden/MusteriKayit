
    function musteriKayit(){
    const musteri = {
    isim : $("#isim").val(),
    adres : $("#adres").val()
};
    $.post("/kayit",musteri,function (){
    hepsiniGetir();
});
    $("#isim").val("");
    $("#adres").val("");
}

    function hepsiniGetir(){
    $.get("/hepsiniGetir", function (data){
        bilgiDuzen(data);
    });
}

    function bilgiDuzen(musteriler){
    let yaz="<table class='table table-striped table-dark'><tr><th scope='col'>Isim</th><th scope='col'>Adres</th></tr>";
    for(const musteri of musteriler){
    yaz+="<tr><td>"+musteri.isim+"</td><td>"+musteri.adres+"</td></tr>"
}
    yaz+="</table>";
    $("#musteriler").html(yaz)

}

function kayitSil(){
    $.get("/hepsiniSil", function (){
        hepsiniGetir();
    })
}