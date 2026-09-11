# media-service

Microserviço em Java (Spring Boot) com dois endpoints:

1. **Calcular média de um aluno**
2. **Consultar data e hora local**

## Tecnologias

- Java 17
- Spring Boot 3.3.4 (Spring Web + Spring Validation)
- Maven

## Como rodar

Pré-requisitos: Java 17+ e Maven instalados.

```bash
mvn spring-boot:run
```

A aplicação sobe em `http://localhost:8080`.

## Endpoints

### 1. POST /api/alunos/media

Recebe o nome do aluno e as duas notas, calcula a média e retorna a mensagem
correspondente.

**Request:**
```bash
curl -X POST http://localhost:8080/api/alunos/media \
  -H "Content-Type: application/json" \
  -d '{"nome": "Maria", "nota1": 7.5, "nota2": 6.0}'
```

**Response (200):**
```json
{
  "nome": "Maria",
  "media": 6.75,
  "mensagem": "Parabéns Maria, você foi aprovado."
}
```

Regras:
- média > 5 → `Parabéns {nome}, você foi aprovado.`
- média < 5 → `{nome}, você foi reprovado.`
- média = 5 → `{nome}, você não atingiu a nota de corte e ficou de exame.`

### 2. GET /api/data-hora

Retorna a data e hora local do servidor.

**Request:**
```bash
curl http://localhost:8080/api/data-hora
```

**Response (200):**
```
11/09/2026 14:32:07
```

## Estrutura do projeto

```
src/main/java/com/estagio/mediaservice/
├── MediaServiceApplication.java   # classe principal (main)
├── controller/
│   ├── MediaController.java       # expõe os endpoints REST
│   └── GlobalExceptionHandler.java# trata erros de validação
├── dto/
│   ├── AlunoRequest.java          # representa o JSON de entrada
│   └── AlunoResponse.java         # representa o JSON de saída
└── service/
    └── MediaService.java          # regra de negócio (cálculo da média)
```

A aplicação segue a separação em camadas **Controller → Service → DTO**,
comum em projetos Spring Boot.
