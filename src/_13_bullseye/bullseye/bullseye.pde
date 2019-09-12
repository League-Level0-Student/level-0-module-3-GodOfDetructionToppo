  void setup(){
      size(400,600);
      background(0,255,0);
    }

  void draw(){
     int size=400;
     
      for(int i=0;i<10;i++){
        
       
        if(i%2==0){
          fill(255,0,0);
        }
        else{
          fill(0,0,0);
        }
        ellipse(200,300,size,size);
            size=size-50;
      
      }
  }
