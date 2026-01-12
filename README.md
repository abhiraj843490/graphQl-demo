curl --location 'http://localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data '{
    "query": "mutation { createUser(name: \"Abhi\") { id  email } }"
}'


curl --location 'http://localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data '{
    "query": "query { getUserById(id: 1) { name  } }"
  }'

  curl --location 'http://localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data '{
    "query": "query { getAllUsers {id name email } }"
  }'
