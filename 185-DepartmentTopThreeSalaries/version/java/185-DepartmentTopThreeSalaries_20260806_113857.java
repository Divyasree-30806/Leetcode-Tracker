// Last updated: 8/6/2026, 11:38:57 AM
1class Solution {
2    public List<List<Integer>> getSkyline(int[][] buildings) {
3       	int n=buildings.length;
4	
5	List<List<Integer>>res=new ArrayList<>();
6	Pair[]arr=new Pair[2*n];
7	int i=0;
8      for(int[]a:buildings) {
9    	  int x1=a[0];
10    	  int x2=a[1];
11    	  int h=a[2];
12    	  arr[i++]=new Pair(x1,h,0);
13    	  arr[i++]=new Pair(x2,h,1);
14      }
15      Arrays.sort(arr,(a,b)->{
16    	  
17    	  if(a.start!=b.start)
18     return Integer.compare(a.start, b.start);
19    	  if(a.end==0&&b.end==0)
20    		  return Integer.compare(b.height,a.height);
21    	  if(a.end==1&&b.end==1)
22    		  return Integer.compare(a.height, b.height);
23    	  return Integer.compare(a.end, b.end);
24      });
25      PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
26      pq.add(0);
27      int max=0;
28      for(Pair rv:arr) {
29    	  
30    	  List<Integer>ll=new ArrayList<>();
31    	
32    	  int a=rv.start;
33    	  int h=rv.height;
34    	  int p=rv.end;
35    	 
36    	  if(p==0) {
37    		  
38    	    
39    	  pq.add(h);
40    	  if(max!=pq.peek()) {
41    		  ll.add(a);
42    		  ll.add(pq.peek());
43    		  max=pq.peek();
44    	  }
45    	  
46      }
47    	  else {
48    		  pq.remove(h);
49    		  if(max!=pq.peek()) {
50    			  ll.add(a);
51    			  ll.add(pq.peek());
52    			  max=pq.peek();
53    		  }
54    	  }
55    	  
56    	  if(!ll.isEmpty()) {
57    		    res.add(ll);
58    		}
59    	
60    	
61    	  
62	
63}
64      return res;
65}
66public static class Pair{
67	int start;
68	
69	int height;
70	int end;
71	Pair(){
72		
73	}
74
75	Pair(int start,int height,int end){
76		this.start=start;
77		
78		this.height=height;
79		this.end=end;
80	}
81}
82
83}