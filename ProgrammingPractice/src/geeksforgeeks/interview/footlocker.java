package geeksforgeeks.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class footlocker {
	
	static Map<String, Integer> result = new HashMap<String, Integer>();

	public static void main(String[] args) {
		Map<String, String> dataset = new HashMap<String, String>();
		dataset.put("F", "F");
		dataset.put("A", "C");
		dataset.put("B", "C");
		dataset.put("C", "F");
		dataset.put("D", "E");
		dataset.put("E", "F");
		populateResult(dataset);
		System.out.println("result = " + result); 
	}

	private static void populateResult(Map<String, String> dataset) {
		Map<String, List<String>> mgrEmpMap = new HashMap<String, List<String>>();
		for (Map.Entry<String, String> entry : dataset.entrySet()) {
			String emp = entry.getKey();
			String mgr = entry.getValue();
			if (!emp.equals(mgr)) {
				List<String> directReportList = mgrEmpMap.get(mgr);
				if (directReportList == null) {
					directReportList = new ArrayList<String>();
					mgrEmpMap.put(mgr, directReportList);
				}
				directReportList.add(emp);
			}
		}
		
		for (String mgr : dataset.keySet()) {
			populateResultUtil(mgr, mgrEmpMap);
		}
		
	}

	private static int populateResultUtil(String mgr, Map<String, List<String>> mgrEmpMap) {
		int count = 0;
		if (!mgrEmpMap.containsKey(mgr)) {
			result.put(mgr, 0);
			return 0;
		} else if (result.containsKey(mgr)) {
			count = result.get(mgr);
		} else {
			List<String> directReportEmpList = mgrEmpMap.get(mgr);
			count = directReportEmpList.size();
			for (String directReportEmp : directReportEmpList) {
				count += populateResultUtil(directReportEmp, mgrEmpMap);
				result.put(mgr, count);
			}
		}
		return count;
		
	}

}
