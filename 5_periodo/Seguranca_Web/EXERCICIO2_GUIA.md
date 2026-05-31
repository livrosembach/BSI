# 📚 Exercício 2 – Criptografia Assimétrica com RSA

## ✅ Seu Progresso

### PASSO 1 ✓ CONCLUÍDO: Gerar o Par de Chaves RSA

**Comandos executados:**

```bash
# Gera a chave privada com 2048 bits
openssl genpkey -algorithm RSA -pkeyopt rsa_keygen_bits:2048 -out aluno_priv.pem

# Gera a chave pública baseada na privada
openssl pkey -in aluno_priv.pem -pubout -out aluno_pub.pem
```

**Arquivos criados:**
- ✓ `aluno_priv.pem` - sua chave privada (MANTENHA SEGURA!)
- ✓ `aluno_pub.pem` - sua chave pública (pode compartilhar)

---

## 📋 PASSO 2: Cifrar o Segredo com a Página HTML

### O que fazer:

1. **Abra o arquivo** `ex_criptografiaassim.html` no navegador
   ```
   Arquivo: /Users/liviarosembacholiveira/GitHub/BSI/5_periodo/Seguranca_Web/ex_criptografiaassim.html
   ```

2. **Cole a chave pública** no campo de entrada:
   - Copie o conteúdo de `aluno_pub.pem`
   - Cole no campo "Chave pública PEM do aluno"

3. **Informe sua matrícula:** `40092766`

4. **Clique no botão** "Cifrar meu segredo"

5. **Copie o texto cifrado** (Base64) gerado no campo "Ciphertext em Base64"

---

## 🔐 PASSO 3: Descriptografar no Terminal com Sua Chave Privada

**O HTML vai gerar um comando como este:**

```bash
# Decodificar o Base64 em arquivo binário
echo 'BASE64_AQUI' | base64 -d > msg.bin

# Descriptografar usando a chave privada
openssl pkeyutl -decrypt -inkey aluno_priv.pem -in msg.bin \
  -pkeyopt rsa_padding_mode:oaep \
  -pkeyopt rsa_oaep_md:sha256 \
  -pkeyopt rsa_mgf1_md:sha256 > msg.txt

# Ver o resultado
cat msg.txt
```

### Explicação dos comandos:

| Comando | O que faz |
|---------|-----------|
| `echo 'BASE64' \| base64 -d` | Decodifica Base64 |
| `> msg.bin` | Salva em arquivo binário |
| `openssl pkeyutl -decrypt` | Descriptografa com chave privada |
| `-inkey aluno_priv.pem` | Usa sua chave privada |
| `-pkeyopt rsa_padding_mode:oaep` | Usa padding OAEP (seguro) |
| `-pkeyopt rsa_oaep_md:sha256` | Hash SHA-256 para OAEP |
| `cat msg.txt` | Exibe o segredo descriptografado |

---

## 📝 PASSO 4: Documentar no Relatório

Registe no seu relatório:

### 1. Comandos Utilizados

**Geração de chaves:**
```bash
openssl genpkey -algorithm RSA -pkeyopt rsa_keygen_bits:2048 -out aluno_priv.pem
openssl pkey -in aluno_priv.pem -pubout -out aluno_pub.pem
```

**Descriptografia:**
```bash
echo 'BASE64_RECEBIDO' | base64 -d > msg.bin
openssl pkeyutl -decrypt -inkey aluno_priv.pem -in msg.bin -pkeyopt rsa_padding_mode:oaep -pkeyopt rsa_oaep_md:sha256 -pkeyopt rsa_mgf1_md:sha256 > msg.txt
cat msg.txt
```

### 2. Explicação Conceitual

**Por que RSA é "assimétrico"?**
- ✓ Usa 2 chaves diferentes: pública e privada
- ✓ Pública: qualquer um cifra a mensagem
- ✓ Privada: só o dono descifra
- ✓ Diferente de AES (simétrico) que usa só 1 chave

**OAEP Padding:**
- Padding seguro que evita ataques
- SHA-256 como função de hash
- Maior segurança comparado a PKCS#1 v1.5

**2048 bits:**
- Tamanho da chave RSA
- Oferece segurança de ~112 bits
- Recomendado para uso atual

---

## 🔍 Sua Chave Pública (Para copiar)

```
-----BEGIN PUBLIC KEY-----
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsSrv6QgfE8ZcJLcmuTOo
jy6m3JGJScG5Iso6ELrpMCRYn0i9voVyQf/FL7ZFbUGeFVp1UPaYU7UoV6wgXUfI
SJhjovtGlzJ6W/uxu5ZQO0dshCSlXa0QyztyWUmD1AG0cwg+gJ/3rGPAs/VM13Ir
9cr1YbTu0E5qXlnoGbaH5MLTtiyCHB/gcUXBoJ8/Xg2mkIhhMF6eorXd8el7urqb
k4h3E0jMI9jYTEmDAshjE6HGNuPDckdlYl4jGEkTNGSZk251y1q5K7+Xmqo0xDrA
B36y6aMnzEgfEcXkiC/1lLyUJpYUIBHJsmPXqOJI1UNtFVd3NHLvz7nWpUptNU2n
1wIDAQAB
-----END PUBLIC KEY-----
```

---

## ✨ Próximos Passos

1. Abra `ex_criptografiaassim.html` no navegador
2. Cole a chave pública e matrícula
3. Clique "Cifrar meu segredo"
4. Copie o Base64 gerado
5. Use o comando de descriptografia no terminal
6. Registre o segredo no relatório
