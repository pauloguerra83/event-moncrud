package br.com.guerra.restmongo.mongohello

import br.com.guerra.restmongo.mongohello.entities.HomeApplianceData
import br.com.guerra.restmongo.mongohello.services.MongoService
import br.com.guerra.restmongo.mongohello.dtos.HomeApplianceDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class kitchenResource(val hservice: MongoService) {

    @PostMapping("/homeAppliances")
    fun postHomeAppliances(@RequestBody homeApplianceDTO: HomeApplianceDTO) : ResponseEntity<HomeApplianceDTO> {return ResponseEntity.ok(homeApplianceDTO)}

    @GetMapping("/homes")
    fun blog(): ResponseEntity<MutableList<HomeApplianceData>> {
        return ResponseEntity.ok(hservice.find())
    }

}