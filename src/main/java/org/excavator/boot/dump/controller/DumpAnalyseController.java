package org.excavator.boot.dump.controller;

import lombok.RequiredArgsConstructor;
import org.excavator.boot.dump.entity.DumpModel;
import org.excavator.boot.dump.service.DumpModelService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/dump/v1")
@RequiredArgsConstructor
public class DumpAnalyseController {

    private final DumpModelService dumpModelService;

    @RequestMapping("/{size}")
    public List<DumpModel> getDumpModels(@PathVariable int size) {

        return dumpModelService.getDumpModels(size);

    }
}
