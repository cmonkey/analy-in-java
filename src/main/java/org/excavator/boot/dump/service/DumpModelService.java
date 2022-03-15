package org.excavator.boot.dump.service;

import org.excavator.boot.dump.entity.DumpModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DumpModelService {
    public List<DumpModel> getDumpModels(int size){

        var dumpModels = new ArrayList<DumpModel>(size);

        for (int i = 0; i < size; i++) {
            dumpModels.add(createDumpModel(size));
        }

        return dumpModels;

    }

    private DumpModel createDumpModel(int size) {
        var stringArray =  new String[size];
        var doubleArray =  new Double[size];

        for (int i = 0; i < size; i++) {
            stringArray[i] = String.valueOf(i);
            doubleArray[i] = Double.valueOf(Math.random());
        }

        return new DumpModel(stringArray, doubleArray);
    }
}
