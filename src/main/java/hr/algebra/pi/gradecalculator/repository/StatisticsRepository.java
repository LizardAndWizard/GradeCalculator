package hr.algebra.pi.gradecalculator.repository;

import java.util.List;

public interface StatisticsRepository {
    float calculateAverage();
    void countAverages(List<Float> averages);
}
