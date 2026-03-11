//
//  ex10.swift
//  Guia_1
//
//  Created by Livia Rosembach Oliveira on 11/03/26.
//

import Foundation

struct Carro {
    var marca: String
    var modelo: String
    var ano: String
}

func ex10() {
    var polo = Carro(marca: "Volkswagen", modelo: "Polo", ano: "2019")
    
    print(polo.marca)
    print(polo.modelo)
    print(polo.ano)
}
