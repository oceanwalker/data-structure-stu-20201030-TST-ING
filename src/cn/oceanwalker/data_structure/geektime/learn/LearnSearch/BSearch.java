package cn.oceanwalker.data_structure.geektime.learn.LearnSearch;

public class BSearch {
    public static int search(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int searchRecursion(int[] a, int value) {
        return bSearchRecursionInternally(a, 0, a.length - 1, value);
    }

    private static int bSearchRecursionInternally(int[] a, int low, int high, int value) {
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] > value) {
            return bSearchRecursionInternally(a, low, mid - 1, value);
        } else {
            return bSearchRecursionInternally(a, mid + 1, high, value);
        }
    }

    //0,1,2,3,4
    //1,1,2,3,4
    //1,2,2,3,4
    //l, , , ,h
    // , ,m, ,
    //l, ,h, ,
    // ,m, , ,
    //1,h
    //m
    // ,lh
    public static int searchMyFirst(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < value) {
                low = mid + 1;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    //0,1,2,3,4
    //1,1,2,2,4
    //1,2,2,3,4
    //l, , , ,h
    // , ,m, ,
    //l, ,h, ,
    // ,m, , ,
    //1,h
    //m
    // ,lh
    public static int searchMyLast(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == a.length - 1 || a[mid + 1] != value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;


//        int result = -1;
//        int low = 0;
//        int high = a.length - 1;
//        while (low <= high) {
//            int mid = low + ((high - low) >> 1);
//            if (a[mid] == value) {
//                low = mid;
//                result = mid;
//            } else if (a[mid] < value) {
//                low = mid + 1;
//            } else if (a[mid] > value) {
//                high = mid - 1;
//                if (high == result) {
//                    return result;
//                }
//            }
//        }
//        return result;
    }

    public static int searchMyLastLessThan(int[] a, int value) {
        int low = 0;
        int high = a.length;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == a.length - 1 || a[mid + 1] > value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
//        return searchMyFirst(a, value) - 1;

    public static int searchMyFirstLargeThan(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
//        return searchMyLast(a, value) + 1;
    }
}