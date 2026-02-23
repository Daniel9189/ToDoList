# ToDoList API

API REST para gerenciamento de tarefas construída com Spring Boot.

## 🚀 Funcionalidades

- Autenticação de usuários
- CRUD completo de tarefas
- Filtro de tarefas por usuário
- Validação de datas, username e título

## 🛠️ Tecnologias

- Java 21
- Spring Boot 4.0.2
- Spring Data JPA (ORM)
- H2 Database (banco em memória)
- Maven
- Docker
- Git & GitHub
- Render (deploy)

## 🌐 API em Produção

A API está disponível em: **`https://todolist-87ms.onrender.com`**

Use ferramentas como Postman, Apidog, Insomnia ou Thunder Client para fazer requisições.

## 🔐 Autenticação

A API utiliza **Basic Authentication**. Após criar um usuário, envie as credenciais pelo Authorization de cada requisição.

## 📍 Endpoints

### Usuários
- `POST /users/` - Cadastrar usuário

### Tarefas (requer autenticação)
- `POST /tasks/` - Criar tarefa
- `GET /tasks/` - Listar tarefas do usuário autenticado
- `PUT /tasks/{id}` - Atualizar tarefa
- `DELETE /tasks/{id}` - Deletar tarefa

## 📝 Exemplos de Uso

### Cadastrar usuário

```http
POST https://todolist-87ms.onrender.com/users/

{
  "name": "João Silva",
  "username": "joaosilva123",
  "password": "senha123"
}
```

### Criar tarefa

```http
POST https://todolist-87ms.onrender.com/tasks/
Authorization: inserir credenciais

{
  "title": "Estudar Spring Boot",
  "description": "Revisar anotações",
  "startAt": "2026-02-25T11:00",
  "endAt": "2026-02-27T12:00",
  "priority": "ALTA"
}
```

### Listar tarefas

```http
GET https://todolist-87ms.onrender.com/tasks/
Authorization: inserir credenciais
```

### Atualizar tarefa

```http
PUT https://todolist-87ms.onrender.com/tasks/{id}
Authorization: inserir credenciais

{
  "description": "Revisar anotações e assistir às aulas"
}
```

### Deletar tarefa

```http
DELETE https://todolist-87ms.onrender.com/tasks/{id}
Authorization: inserir credenciais
```

## 👤 Autor

**Daniel Rocha de Brito**

- GitHub: [@Daniel9189](https://github.com/Daniel9189)
- Projeto: [ToDoList](https://github.com/Daniel9189/ToDoList)
