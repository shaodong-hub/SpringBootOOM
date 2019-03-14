package com.github.oom.controller;

import com.github.oom.until.Metaspace;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 创建时间为 10:33-2019-03-14
 * 项目名称 SpringBootOOM
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@RestController
public class OomController {

    private List<Object> list1 = new ArrayList<>();

    private List<Object> list2 = new ArrayList<>();

    @GetMapping("/heap")
    public void heap() {
        while (true) {
            list1.add(new Object());
        }
    }


    @GetMapping("/meta")
    public void meta() {
        while (true) {
            list2.addAll(Metaspace.createClasses());
        }
    }


}
