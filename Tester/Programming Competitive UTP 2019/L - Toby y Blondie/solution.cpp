#include<bits/stdc++.h>
using namespace std;
#define endl '\n'
typedef pair<int,int> par;
typedef pair<par,int> par2;


int euclides(int a, int b){
    if(a == 0)
    return b;
    if(b == 0)
    return a;
    while(a % b != 0){
        int temp = a % b;
        a = b;
        b = temp;
    }
    return b;
}

map<par,int> T;

int main(){
    ios_base::sync_with_stdio(0);cin.tie(NULL);
    int n,x,y,mcd,centro=0,ver=0,hor=0,ans;
    map<par,int>::iterator it;
    cin>>n;
    for(int i=0; i<n; i++){
        cin>>x>>y;
        if(x > y)
        swap(x,y);

        if(x == 0 && y == 0)
        centro++;
        else if(x == 0)
        ver++;
        else if(y == 0)
        hor++;
        else{
            mcd = euclides(x,y);
            x /= mcd;
            y /= mcd;
            it = T.find(par(x,y));
            if(it == T.end())
            T.insert(par2(par(x,y), 1));
            else
            it->second += 1;
        }
    }
    ans = 0;
    for(it=T.begin(); it!=T.end(); it++){
        if((it->second) > ans)
        ans = it->second;
    }
    ans += centro;

    if((hor + centro) > ans)
    ans = hor + centro;
    if((ver + centro) > ans)
    ans = ver + centro;

    cout<<ans<<endl;
}
