### Налаштування PostgreSQL в Docker

1. Завантажити образ PostgreSQL:
\`\`\`bash
docker pull postgres
\`\`\`

2. Запустити контейнер:
\`\`\`bash
docker run --name ${GITHUB_USER}-postgres \\
  -p 5432:5432 \\
  -e POSTGRES_PASSWORD=mysecretpassword \\
  -d postgres
\`\`\`

3. Підключитися до БД:
\`\`\`bash
docker exec -it ${GITHUB_USER}-postgres psql -U postgres
\`\`\`
