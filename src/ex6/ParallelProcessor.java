package ex6;

import java.util.*;
import java.util.stream.Collectors;
import ex2.CalData;

class ParallelProcessor {
    private final List<CalData> dataList;

    public ParallelProcessor(List<CalData> dataList) {
        this.dataList = dataList;
    }

    public int findMin() {
        return dataList.parallelStream().mapToInt(CalData::getNumber).min().orElseThrow();
    }

    public int findMax() {
        return dataList.parallelStream().mapToInt(CalData::getNumber).max().orElseThrow();
    }

    public double calculateAverage() {
        return dataList.parallelStream().mapToInt(CalData::getNumber).average().orElse(0);
    }

    public List<CalData> filterByCriteria(int threshold) {
        return dataList.parallelStream().filter(data -> data.getNumber() > threshold).collect(Collectors.toList());
    }
}

