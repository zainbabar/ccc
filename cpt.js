let clouds = [];

function setup() {
  createCanvas(1000, 700);
  // u can change 4 to wtv amt of clouds u want
  for (let i = 0; i < 4; i++) {
    let x = int(ceil(random(20, width - 20)));
    let y = int(ceil(random(20, height - 20)));
    // add coordinates to the array 
    clouds.push({ x: x, y: y, velocity: velocity});
  }
}


function draw() {
    // iterate through clouds array
  for (let i = 0; i < clouds.length; i++) {
    // drawing the cloud at the coordinates in the array
    drawCloud(clouds[i].x, clouds[i].y);
  }
}

function drawCloud(x, y) {
    // draw the cloud nigga
}
