let baseUrl = "http://localhost:8080";
let fotografias = [];
let fotografiasl = [];
let fotografiasa = [];

//MUESTRA LA LEYENDA DEL HEADER Y EL TITULO DE LOS TIPOS DE FOTOGRAFIA Y SU DESCRIPCION
function ObtenerInfoFotografia() {
    fetch(baseUrl + '/fotografias/all').then(res => {
        res.json().then(json => {
            fotografias = json;
            ImprimirInfoFotografia();
            ObtenerListaFotografia();
            ObtenerAnimalesFotografia();
        });
    });
}

function ImprimirInfoFotografia() {
    let tituloHeader = document.getElementById('contenidoHeaderFotografia');
    let titulo = document.getElementById('tituloFotografia');
    let descripcion = document.getElementById('contenidoFotografia');

    tituloHeader.innerHTML = fotografias[1]["descripcion"];
    titulo.innerHTML = fotografias[0]["titulo"];
    descripcion.innerHTML = fotografias[0]["descripcion"];  

}

//MUESTRA LA LISTA DE LOS TIPOS DE FOTOGRAFIAS SITUADA EN EL BODY A LA MANO DERECHA
function ObtenerListaFotografia() {
    fetch(baseUrl + '/fotografiasl/all').then(res => {
        res.json().then(json => {
            fotografiasl = json;
            ImprimirListaFotografia()
        });
    });
}

function ImprimirListaFotografia() {
    fotografiasl.forEach(element => {
        let lista = document.getElementById("listaFotografia");
        lista.innerHTML += MapearListafotografia(element);
    });
}

function MapearListafotografia(element) {
    return `<li>${element.descripcion}</li>`;
}

//MUESTRA LA LISTA DE ANIMALES Y SU IMAGEN
function ObtenerAnimalesFotografia() {
    fetch(baseUrl + '/animales/all').then(res => {
        res.json().then(json => {
            fotografiasa = json;
            ImprimirAnimalesFotografia()
        });
    });
}

function ImprimirAnimalesFotografia() {
    let lista = document.getElementById("cuerpoAnimales");

    fotografiasa.forEach(element => {
        lista.innerHTML += MapearAnimalesfotografia(element);
    });
}

function MapearAnimalesfotografia(element) {
    return `<div class="" style="text-align: center;">
    <img id="imagenAnimales" src="${element.imagen}" alt="">
</div>
<div class="separador3">

</div>
<div class="texto-fotografias">
    <p class="titulo-fotografias" id="tituloAnimales">${element.titulo}</p>
    <p class="texto-fotografias" id="descripcionAnimales">${element.descripcion}</p>
    <button class="btn-fotografias" type="submit">DETALLES</button>
</div>`;
}