void setup(){
 
size(1200,1200);
int b1=300;

int b2=900;
drawbullseye(b1);
drawbullseye(b2);
}
void drawbullseye(int x){
   int w=500;
int l=500;  
  for(int i=0; i<8; i++){
    w=w-60;
    l=l-60;
    double n=i%2;
    if(n==0){
      fill(255,0,0);
    }
    else{
      fill(0,0,0);
      
    }
    
    ellipse(x,400,w,l);
  }
}
