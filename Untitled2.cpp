#include<iostream>

using namespace std;
class Array{
    
 
    public:
   Array(int max);//: max_size(max),elements(0){} //constructor
    void display(){
        for(int i=0;i<=elements;i++)
           cout<<a[i]<<" ";
        cout<<endl;
    }
    
    private:
            long a[];
            int elements;
 
};

int main()
{
    return 0;
}   
