var express = require('express');
var app = express();

//filter
//reduce
//map

let produtos = [];

const port = 3000;
const router = express.Router();
app.use(express.json());

router.get("/api/produtos", (req, res) => {
  console.log("Entrou no /api/produtos");

  res.status(200).json(produtos);
})

router.post("/api/produtos", (req, res) =>{
  const produto = req.body;
  console.log(produto);
  produto.id = produtos.length + 1;
  produtos.push(produto)
  res.status(201).json(produto);
})

router.delete("/api/produtos/:id", (req,res) =>{
  const id = parseInt(req.params.id);
  console.log(produtos)
  produtos = produtos.filter(p => p.id !== id);
  res.status(204).send("produto excluido com sucesso");
})

app.use(router);

app.use(express.static('./pages'));

app.get('/hello', (req, res) => {
  res.send('Hello World! ');
});

app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});