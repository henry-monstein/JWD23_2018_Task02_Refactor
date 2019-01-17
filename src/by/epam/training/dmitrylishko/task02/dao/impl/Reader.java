package by.epam.training.dmitrylishko.task02.dao.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader {
    public List<List<String>> readListLineSplitByComma(String path) throws  IOException {
        List<List<String>> result = new ArrayList();
        Files.lines(Paths.get(path), StandardCharsets.UTF_8)
                .map(line -> line.replaceAll(":",",").split(","))
                .map(Arrays::asList)
                .forEach(l -> result.add(l));
        return result;
    }
}