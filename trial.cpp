#include<iostream>

using namespace std;

class mArray{
    
    
 
    public:
   mArray(int max){
              max_size = max;
              a = new long[max_size];
              elements = 0; //constructor
              cout<<"max size = "<<max_size<<endl;
   }
   void init()
   {
        for(int i=0;i<max_size;i++)
                a[i] = 0;
        elements = 0;
   }
    void display(){
        for(int i=0;i<=elements;i++)
           cout<<a[i]<<" ";
        cout<<endl;
    }
    
    void add(long n){
        if(elements < max_size-1){
            a[elements++]=n;
            cout<<n<<" was added..."<<" Elements = "<<elements<<"\n";
        }
        else
            cout<<"\nSorry, array is full... Maximum size = "<<max_size;
    }
    
    private:
             long a[];
             int max_size; //array size
             int elements; //number of elements
    
};


    int main(){
        int x;
        // TODO code application logic here
       mArray myArray(5);
       myArray.init();
     myArray.add(13);
        myArray.add(17);
        myArray.add(56);
        myArray.add(41);
        myArray.add(23);
       myArray.display(); 
       
       cout<<"enter an integer: ";
       cin>>x;       
        return 0;
        }


