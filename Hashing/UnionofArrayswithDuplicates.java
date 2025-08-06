
class GfG {
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> st = new HashSet<>();

        for (int num : a)
            st.add(num);

        for (int num : b)
            st.add(num);
		
      	ArrayList<Integer> res = new ArrayList<> ();
      
        for(int it: st) 
            res.add(it);

        return res;
    }

}
