package com.example.MoiveCatlogService;

import com.example.MoiveCatlogService.Model.Moive;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
public class MoiveController {
    List<Moive> list;

    @PostConstruct
    public void setMoive() {
        list = new CopyOnWriteArrayList<> ();
        list.add (new Moive (101, "SpiderMan"));
        list.add (new Moive (102, "SuperMan"));

    }

    @GetMapping("get")
    public List<Moive> get() {
        return list;
    }

    @PostMapping("post")
    public String post(@RequestBody Moive moive) {
        list.add (moive);
        return "updated";
    }

    @DeleteMapping("delete/{id}")
    public List<Moive> delete(@PathVariable int id) {
        for (Moive moive : list) {
            if (moive.getMoiveId () == id) {
                list.remove (moive);
            }
        }
        return list;

    }

    @PutMapping("put")
    public List<Moive> put(@RequestBody Moive moive) {
        for (Moive moive1 : list) {
            if (moive.getMoiveId () == moive1.getMoiveId ()) {
                moive1.setName (moive.getName ());
            }
        }
        return list;
    }
}
