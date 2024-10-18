var express = require('express');
var app = express();

app.use(express.static('./pages'));

const port = 3000;
const router = express.Router();
app.use(express.json());


var usuarios = [];

var mysql = require('mysql');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "Lili2209*",
  database: "aulaWeb"
})

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected");
});

let produtos = [];

router.post("/api/login", (req, res) => {
  const usuario = request.body;
  const email = usuario.email;
  const senha = usuario.senha;

  const sql = "SELECT id FROM usuario WHERE email = '${email}' and senha = '${senha}' ";
  con.query(sql, function(err, result){
    if(err) throw err;
    //todo caso não ache o usuario deve ser 401
    console.log(res);
    res.status(200),json(result);

  });


})


router.post("/api/usuarios", (req, res) => {
  const usuario = req.body;

  var sql = `INSERT INTO usuario (nome, email, data, estado) 
  values 
  ('${usuario.nome}', 
  '${usuario.email}', 
  '${usuario.data}', 
  '${usuario.estado}')`;

  con.query(sql, function(err, result){
    if(err) throw err;
  });

  res.status(201),json(usuario);
})


router.get("/api/usuarios", (req, res) => {
  var sql = 'SELECT id, nome, email, estado FROM usuario';
  con.query(sql, function (err, result) {
    if (err) throw err;
    res.status(200).json(result);
  });
});

router.get("/api/produtos", (req, res) => {
  console.log("Entrou no /api/produtos");

  res.status(200).json(produtos);
})

router.post("/api/produtos", (req, res) => {
  const produto = req.body;
  console.log(produto);
  produto.id = produtos.length + 1;
  produtos.push(produto)
  res.status(201).json(produto);
})

router.delete("/api/produtos/:id", (req, res) => {
  const id = parseInt(req.params.id);
  console.log(produtos)
  produtos = produtos.filter(p => p.id !== id);
  res.status(204).send("produto excluido com sucesso");
})

app.use(router);


app.get('/hello', (req, res) => {
  res.send('Hello World! ');
});

app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});