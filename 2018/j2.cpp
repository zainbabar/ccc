#include <bits/stdc++.h>
#include <ostream>

using namespace std; 
    
int main(){
  int x[4];
  for(int i=0;i<4;++i){
    cin>>x[i];
  }
  int check=0;
  if(x[0]==8||x[0]==9){
    check++;
  }
  if(x[3]==8||x[3]==9){
    check++;
  }
  if(x[1]==x[2]){
    check++;
  }
  if(check==3){
    cout<<"ignore"<<endl;
  }
  else{
    cout<<"answer"<<endl;
  }
  return 0;
}
