let cx1 = 100;
let cy1 = 50;

let cx2 = 300;
let cy2 = 400;

let c1Pos, c2Pos;
let c1Vel, c2Vel;

function setup(){
    createCanvas(500,500)
    // c1Pos = createVector(100,50);
    // c2Pos = createVector(400,300);

    c1Pos = createVector(100, 50);
    c2Pos = createVector(400, 450);
    c1Vel = createVector(2, 2);
    c2Vel = p5.Vector.fromAngle(radians(240), 2);
    createCanvas(500, 500);
}

function draw(){
    background(0);
    ex3()
}

function ex1(){
    fill("red");
    circle(cx1,cy1,25);
    fill("blue");
    circle(cx2,cy2,25);
}

function ex2(){
    fill("red");
    circle(c1Pos.x,c1Pos.y,25);
    fill("blue");
    circle(c2Pos.x,c1Pos.y,25);
}

function ex3(){
    c1Pos.add(c1Vel);
    fill("red")
    circle(c1Pos.x, c1Pos.y, 25);
    c2Pos.add(c2Vel);
    fill("blue")
    circle(c2Pos.x, c2Pos.y, 25);

}