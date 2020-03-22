import java.util.ArrayList;

public class Exercises {

	public int findMe(int[] list, int target) {
	  if(list == null) {
		  return -1;
	  }
	  for(int i = 0; i < list.length; i ++) {
		  if(list[i] == target) {
			  return i;
		  }
	  }
	  return -1;
	}

	public int findMe(ArrayList<String> list, String target) {
		for(int i = 0; i < list.size(); i ++) {
			if(list.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public int findMeFaster(ArrayList<Integer> list, int target) {
		if (list == null) {
			return -1;
		}
		int start = 0;
		int end = list.size() - 1;
		int middle = 0;
		while (start <= end) {
			middle = (start + end) / 2;
			if (list.get(middle) < target) {
				start = middle + 1;
			} else if (list.get(middle) > target) {
				end = middle - 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

  public int findMeFaster(String[] list, String target) {
	  if (list == null) {
          return -1;
      }
      int start = 0;
      int end = list.length - 1;
      int middle = 0;
      while (start <= end) {
          middle = (start + end) / 2;

          if (list[middle].compareTo(target) < 0) {
              start = middle + 1;
          } else if (list[middle].compareTo(target) > 0) {
              end = middle - 1;
          } else {
              return middle;
          }
      }
	  return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] insertion(String[] list, boolean ascending) {
    return null;
  }

  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] merge(String[] list, boolean ascending) {
    return null;
  }
}