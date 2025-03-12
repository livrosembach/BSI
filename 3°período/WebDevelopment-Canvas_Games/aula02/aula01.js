let x1 = 150;
let x2 = 450;
let x3 = 100;
let y1 = 100;

function setup(){
    createCanvas(600,500)
}

function draw(){
    background(220);
    // ex1()
    // ex2()
    ex3()
}

function ex1(){
    s = deltaTime/100;
    fill(255,0,0,100);
    circle(x1, 250, 50);
    fill(0,255,0,100)
    circle(x2, 250, 50);

    x1+= 100 * s;
    x2-= 100 * s;
}


function ex2(){
    let x = mouseX;
    let y = mouseY;

    fill(255,0,0,100);
    circle(x, y, 20);

    

    fill(0,250,0,100);
    circle(x3, y1, 20,100);
    
    if(x3 > 0  ){
        if (keyIsDown(LEFT_ARROW)){
            x3 -= 5;
        }
        if (keyIsDown(RIGHT_ARROW)){
            x3 += 5;
        }
    }

    if(y1 > 0){
        if (keyIsDown(UP_ARROW)){
            y1 -= 5;
        }
        if (keyIsDown(DOWN_ARROW)){
            y1 += 5;
        }
    }
}

function ex3(){
    fill(0,0,255);
    circle(x1,y1,20);
    if(mouseIsPressed){
        // Calculate the direction vector
        let dx = mouseX - x1;
        let dy = mouseY - y1;
        
        // Set a speed for the movement
        let speed = 5;
        
        // Move the circle diagonally toward the mouse position
        if(Math.abs(dx) > 0 || Math.abs(dy) > 0) {
            let distance = Math.sqrt(dx*dx + dy*dy);
            x1 += (dx / distance) * speed;
            y1 += (dy / distance) * speed;
        }
    }
}




