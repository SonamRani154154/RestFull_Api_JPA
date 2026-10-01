package com.test.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlienResource {
    @Autowired
AliensRepository repo;

    @RequestMapping("aliens")
     public List<Aliens> getAliens(){

          List<Aliens> aliens=( List<Aliens>)repo.findAll();
//          Aliens a1= new Aliens();
//          a1.setId(100);
//           a1.setName("supriya");
//           a1.setPoints(105);
//             aliens.add(a1);
//         Aliens a2= new Aliens();
//
//         a2.setId(12);
//         a2.setName("kumari");
//        a2.setPoints(102);
//        aliens.add(a2);
return aliens;
     }


}
