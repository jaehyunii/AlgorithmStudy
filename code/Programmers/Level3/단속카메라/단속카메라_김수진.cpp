#include<bits/stdc++.h>

using namespace std;

int solution (vector<vector<int>> routes) {
	int answer = 1;
	sort(routes.begin(),routes.end());

	int a = routes[0][1]; 
	for (int i = 1; i < routes.size(); i++) { 		
		if (routes[i][1] < a) 			
      			a = routes[i][1]; 	
		if (routes[i][0] > a){ 
       			answer ++; 			
      			a = routes[i][1]; 	
		} 	
	}

	return answer;
}
