import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		String specFile = args[0];

		FileReader fr = new FileReader(specFile);
		BufferedReader br = new BufferedReader(fr);
		
		PrintOut po = new PrintOut();
		Map<String, DataStructure> DSMap = po.DSMap;

		while (br.ready()){
			String[] spec = br.readLine().split(" ");

			String dsName = spec[1];
			DataStructure ds = DSMap.get(dsName);

			if (spec[0].equals("Create")) {
				if (ds == null) {
					// System.out.println("Create new list/skiplist");
					if (spec[2].equals("List")) {
						DSMap.put(dsName, new List());
					} else if (spec[2].equals("SkipList")) {
						DSMap.put(dsName, new SkipList());
					}
				}
				continue;
			}
			else if (ds == null)
				continue;

			String field, method;
			
			if (spec[0].equals("Add")) {
				ds.add(spec[2]);

			} else if (spec[0].equals("Length")) {
				field = "length";
				if (Helper.containField(ds, field)) {
					System.out.println(ds.getClass().getField(field).get(ds));
				}
				else {
					System.out.println(ds.getClass().getSimpleName() + " can not access length");
				}

			} else if (spec[0].equals("Size")) {
				method = "size";
				if (Helper.containMethod(ds, method)) {
					System.out.println(ds.getClass().getMethod(method).invoke(ds));
				}
				else {
					System.out.println(ds.getClass().getSimpleName() + " do not have method size");
				}

			} else if (spec[0].equals("Get")) {
				method = "get";
				int index = Integer.parseInt(spec[2]);
				if (Helper.containMethod(ds, method)) {
					// System.out.println(ds.get(Integer.parseInt(spec[2])));
					Class<?>[] params = { int.class };
					System.out.println(ds.getClass().getMethod(method, params).invoke(ds, index));
				}
				else {
					System.out.println(ds.getClass().getSimpleName() + " do not have method get");
				}

			} else if (spec[0].equals("GetNode")) {
				method = "getNode";
				int index = Integer.parseInt(spec[2]);
				if (Helper.containMethod(ds, method)) {
					// System.out.println(ds.getNode(Integer.parseInt(spec[2])));
					Class<?>[] params = { int.class };
					System.out.println(ds.getClass().getMethod(method, params).invoke(ds, index));
				}
				else {
					System.out.println(ds.getClass().getSimpleName() + " do not have method getNode");
				}

			} else if (spec[0].equals("PrintOutList")) {
				po.traverse(ds);

			}
		}
		
		fr.close();
	}
}