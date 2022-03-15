package org.excavator.boot.dump.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@RequiredArgsConstructor
@Data
public class DumpModel implements Serializable {
    private final String[] stringArray;
    private final Double[] doubleArray;
}
