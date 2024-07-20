#include <bits/stdc++.h>
#include <string>

using namespace std;

void hflip(int grid[]);
void vflip(int grid[]);

int main(){
  string s; 
  cin >> s;
  int grid[] = {1, 2, 3, 4};
  for (int i = 0; i < s.length(); i++){
    if (s[i] == 'H'){
      hflip(grid);
    }
    else {
      vflip(grid);
    }
  }
  cout << grid[0] << " " << grid[1] << endl;
  cout << grid[2] << " " << grid[3] << endl;
}

void hflip(int grid[]){
  int temp;

  temp = grid[0];
  grid[0] = grid[2];
  grid[2] = temp; temp = grid[1];
  grid[1] = grid[3];
  grid[3] = temp;
}

void vflip(int grid[]){
  int temp;

  temp = grid[0];
  grid[0] = grid[1];
  grid[1] = temp;

  temp = grid[3];
  grid[3] = grid[2];
  grid[2] = temp;
}
