#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the number of input bits:";
    cin>>n;
    int bits[n];
    int count=0;
    cout<<"Enter the bits to be sent:";
    for(int i=0;i<n;i++){
        cin>>bits[i];
        if(bits[i]==1){
            count++;
        }
    }
    int parity=(count%2==0)? 0:1;
    cout<<"Data sent: ";
    for(int i=0;i<n;i++){
        cout<<bits[i];
    }
    cout<<parity<<"\n";
    cout<<"Enter the bits received:";
    int bits_received[n+1];
    int count_received=0;
    for(int i=0;i<n+1;i++){
        cin>>bits_received[i];
        if(bits_received[i]==1){
            count_received++;
        }
    }
    if(count_received%2==0){
        cout<<"Data received successfully,Data: ";
        for(int i=0;i<n;i++){
            cout<<bits_received[i];
        }
    }
    else{
        cout<<"Error detected,Asking sender to resend data";
    }
}