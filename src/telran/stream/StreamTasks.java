package telran.stream;
import java.util.*;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;


public class StreamTasks {
	
public static void printDigitStatistics() {
//	var map = new Random().ints(1_000_000, 0, Integer.MAX_VALUE)
//	.flatMap(n -> Integer.toString(n).chars())
//	.boxed()
//	.collect(Collectors.groupingBy(d -> d, Collectors.counting()));
	var map = new Random().ints(1_000_000, 0, Integer.MAX_VALUE)
	.mapToObj(Integer::toString)
	.flatMap(s -> Arrays.stream(s.split("")))
	.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
	map.entrySet().stream()
	.sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
	.forEach(e -> System.out.printf("%c -> %s\n", e.getKey(), e.getValue()));
}












}
