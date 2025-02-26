function setup(){
    createCanvas(600,500)
}

function draw(){
    background(250);
    DesenhaCirculos()
    //DesenhoLivre()
    // circle(300,250,150);
    // fill(50,12,20,160);
    // circle(360,250,150);
    // fill(90,150,60,160);
}

function DesenhaCirculos(){
    for(var i = 0; i < 5; i++){
        for(var j = 0; j < 5; j++){
            var x = 100 * j + 50;
            var y = 80 * i + 50;
            fill(40 * i, 40 * j, 75);
            for(var z = 50; z > 0; z -= 10){
                circle(x,y,z)
            }
        }
    }
}

function DesenhoLivre(){
    fill(0, 128, 0)
    rect(0, 350, 600, 200)
    fill(50, 50, 50) 
    rect(100,150, 400, 200)
    fill(100, 50, 0)
    triangle(100,150, 300, 50, 500, 150)
    rect(275, 250, 50, 100)
}


