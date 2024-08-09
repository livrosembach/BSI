var express = require('express');
var app = express();

const port = 3000;

app.use(express.static('./pages'));

app.get('/hello', (req, res) => {
  res.send('Hello World! ');
});

app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});