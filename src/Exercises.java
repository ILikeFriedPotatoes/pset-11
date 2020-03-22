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
	  if (list == null) {
          return null;
      }
	  if(ascending) {
		  int lastIndex = list.length - 1;
		  boolean swapped = false;
		  do {
			  swapped = false;
              for (int i = 0; i < lastIndex; i++) {
                  if (list[i] > list[i + 1]) {
                      int temp = list[i];
                      list[i] = list[i + 1];
                      list[i + 1] = temp;
                      swapped = true;
                  }
              }
              lastIndex--;
		  } while(swapped == true);
	  } else {
		  int lastIndex = list.length - 1;
          boolean swapped = true;
          while (swapped) {
              swapped = false;
              for (int i = 0; i < lastIndex; i++) {
                  if (list[i] < list[i + 1]) {
                      int temp = list[i];
                      list[i] = list[i + 1];
                      list[i + 1] = temp;
                      swapped = true;
                  }
              }
              lastIndex--;
          }
      }
      return list;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
	  if (list == null) {
          return null;
      }

      int nullCounter = 0;
      ArrayList<String> sortedList = new ArrayList<String>();
      for (int i = 0; i < list.size(); i++) {
          if (list.get(i) == null) {
              nullCounter++;
          } else {
              sortedList.add(list.get(i));
          }
      }
      if (ascending) {
          int lastIndex = sortedList.size() - 1;
          boolean swapped = true;
          while (swapped) {
              swapped = false;
              for (int i = 0; i < lastIndex; i++) {
                  if (sortedList.get(i) == null) {
                      sortedList.add(sortedList.remove(i));
                  } else {
                      if (sortedList.get(i).compareTo(sortedList.get(i + 1)) > 0) {
                          String temp = sortedList.get(i);
                          sortedList.set(i, sortedList.get(i + 1));
                          sortedList.set(i + 1, temp);
                          swapped = true;
                      }
                  }
              }
              lastIndex--;
          }
      } else {
          int lastIndex = sortedList.size() - 1;
          boolean swapped = true;
          while (swapped) {
              swapped = false;
              for (int i = 0; i < lastIndex; i++) {
                  if (sortedList.get(i) == null) {
                      sortedList.add(sortedList.remove(i));
                  } else {
                      if (sortedList.get(i).compareTo(sortedList.get(i + 1)) < 0) {
                          String temp = sortedList.get(i);
                          sortedList.set(i, sortedList.get(i + 1));
                          sortedList.set(i + 1, temp);
                          swapped = true;
                      }
                  }
              }
              lastIndex--;
          }
      }
      
      for (int i = 0; i < nullCounter; i++) {
          sortedList.add(null);
      }

      return sortedList;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
	  if(list == null) {
		  return null;
	  }
	  int nullCounter = 0;
      ArrayList<Integer> sortedList = new ArrayList<Integer>();
      for (int i = 0; i < list.size(); i++) {
          if (list.get(i) == null) {
              nullCounter++;
          } else {
              sortedList.add(list.get(i));
          }
      }
      if (ascending) {
          int i = 0; 
          while (i < sortedList.size()) {
              int j = i;
              while (j > 0 && sortedList.get(j - 1) > sortedList.get(j)) {
                  int temp = sortedList.get(j - 1);
                  sortedList.set((j - 1), sortedList.get(j));
                  sortedList.set(j , temp);
                  j--;
              }
              i++;
          }
      } else {
          int i = 0; 
          while (i < sortedList.size()) {
              int j = i;
              while (j > 0 && sortedList.get(j - 1) < sortedList.get(j)) {
                  int temp = sortedList.get(j - 1);
                  sortedList.set((j - 1), sortedList.get(j));
                  sortedList.set(j , temp);
                  j--;
              }
              i++;
          }
      }

      
      for (int i = 0; i < nullCounter; i++) {
          sortedList.add(null);
      }
      return sortedList;
  }

  public String[] insertion(String[] list, boolean ascending) {
	  if (list == null) {
          return null;
      }
	  
	  return list;
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