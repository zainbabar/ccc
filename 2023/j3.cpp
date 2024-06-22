#include <iostream>

using namespace std;

int main(){
    int n;
    cin>>n;
    int len=5;
    string days[n];
    int ans[len]={0};
    for(int i=0;i<n;i++){
        cin>>days[i];
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<len;j++){
            if(days[i][j]=='Y'){
                ++ans[j];
            }
        }
    }
    int max=0;
    for(int i=0;i<len;i++){
        if(ans[i]>max){
            max=ans[i];
        }
    }
    bool f=true;
    for(int i=0;i<len;i++){
        if(ans[i]==max){
            if(f){
                cout<<i+1;
                f=false;
            }
            else{
                cout<<","<<(i+1);
            }
        }
    }
    return 0;
}

