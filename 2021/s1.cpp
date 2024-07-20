#include <bits/stdc++.h>

using namespace std;

int main(){
  int n;
  cin >> n;

  vector<double> h(n + 1);

  for (int i = 0; i < n + 1; i++){
    cin >> h[i];
  }
  
  vector<double> w(n);

  for (int i = 0; i < n; i++){
    cin>>w[i];
  }

  double area = 0;

  for (int i = 0; i < n; i++){
    double temp = w[i] * ((h[i] + h[i + 1]) / 2.0);
    area += temp;
  }

  cout << fixed << area << endl;

  // sol wasnt working cuz i was using ints not doubles, for q involving decimal just use double for everything
}
