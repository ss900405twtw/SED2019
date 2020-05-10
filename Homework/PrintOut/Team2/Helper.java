import java.util.Arrays;

public class Helper
{
	public static boolean containField(DataStructure ds, String fieldName) {
		return Arrays.stream(ds.getClass().getFields()).anyMatch(f -> f.getName().equals(fieldName));
	}

	public static boolean containMethod(DataStructure ds, String methodName) {
		return Arrays.stream(ds.getClass().getMethods()).anyMatch(f -> f.getName().equals(methodName));
	}
}