class Solution {

  
     static List<Integer> findMajority(int[] arr) {
        int n=arr.length;
        HashMap<Integer ,Integer>freq =new HashMap<>();
        List<Integer>res=new ArrayList<>();

       
        for(int ele :arr)
          {freq.put(ele, freq.getOrDefault(ele,0)+1);}
         for(Map.Entry<Integer,Integer>it : freq.entrySet()){

           
          int ele=it.getKey();
          int cnt=it.getValue();
             if(cnt>n/3)
            res.add(ele);
           
          }
          if(res.size()==2 &&  res.get(0)>res.get(1)){
            
              int temp=res.get(0);
              res.set(0,res.get(1));
              res.set(1,temp);
              
          }
          return res;
    }
}
