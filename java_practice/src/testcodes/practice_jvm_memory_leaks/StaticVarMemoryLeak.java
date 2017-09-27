package testcodes.practice_jvm_memory_leaks;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

/**
 * VisualVM을 이용하여 heap 메모리 사용 및 변화를 검토해보자.
 */
public class StaticVarMemoryLeak {
	private Random random = new Random();
	public static ArrayList<Double> list = new ArrayList<>(1000000);
	
	/**
	 * static 변수인 list를 사용했으므로, for문이 동작할 때 heap에 메모리가 잡히고 해제되지 않을 것임.
	 * @throws InterruptedException
	 */
	@Test
	public void givenStaticField_whenLotsOfOperations_thenMemoryLeak() throws InterruptedException {
		Thread.sleep(10000);
		
		System.out.println("[" + LocalDateTime.now() + "] start");
		for(int i = 0; i < 1000000; i++) {
			list.add(random.nextDouble());
		}
		System.out.println("[" + LocalDateTime.now() + "] end data");
		System.gc();
		System.out.println("[" + LocalDateTime.now() + "] end");
		
		Thread.sleep(100000);
	}
	
	/**
	 * 로컬변수 localList를 사용했으므로, for문이 완료된 후 localList의 메모리 사용량은 반환될 것임.
	 * @throws InterruptedException
	 */
	@Test
	public void givenNormalField_whenLotsOfOperations_thenGCWorksFine() throws InterruptedException {
		Thread.sleep(10000);
		
		System.out.println("[" + LocalDateTime.now() + "] start");
		addElementsToTheList();
		System.out.println("[" + LocalDateTime.now() + "] end data");
		System.gc();
		System.out.println("[" + LocalDateTime.now() + "] end");
		
		Thread.sleep(100000);
	}
	
	private void addElementsToTheList() {
		ArrayList<Double> localList = new ArrayList<>(1000000);
		for(int i = 0; i < 1000000; i++) {
			localList.add(random.nextDouble());
		}
	}
}
