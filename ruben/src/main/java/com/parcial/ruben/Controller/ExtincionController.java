package com.parcial.ruben.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial.ruben.Model.AnimalesModel;
import com.parcial.ruben.Model.FotografiaListaModel;
import com.parcial.ruben.Model.FotografiaModel;
import com.parcial.ruben.Services.ExtincionServices;

@RestController
public class ExtincionController {

    @GetMapping("/fotografias/all")
    public List<FotografiaModel> ObtenerInfoFotografia() {
        return new ExtincionServices().ObtenerInfoFotografia();
    }

    @GetMapping("/fotografiasl/all")
    public List<FotografiaListaModel> ObtenerListaFotografia() {
        return new ExtincionServices().ObtenerListaFotografia();
    }

    @GetMapping("/animales/all")
    public List<AnimalesModel> ObtenerAnimales() {
        return new ExtincionServices().ObtenerAnimales();
    }
}
