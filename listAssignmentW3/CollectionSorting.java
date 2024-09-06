package week3.listAssignmentW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
	
		public static void main(String[] args) {

			String companies[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };

			// Add the collection to a list
			List<String> cList = new ArrayList<>();
			Collections.addAll(cList, companies);
			cList.sort(null);

			Collections.reverse(cList);

			System.out.println("Companies list after reversing >>>" + cList);

		}
	
	}


