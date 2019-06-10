## Relevant articles:
  Uruchomienie dockera z baza postgres:
  
  docker run --name dev-postgres -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres:11
  
  docker exec dev-postgres psql -U postgres -c"CREATE DATABASE coursedb" postgres 
  
  docker-compose -f keycloak-postgres.yml up
  
  z importem REALM:
  
  
  docker-compose -f ./postgres-10_repmgr-4.0_pgpool-3.7_barman-2.4.yml up -d pgmaster pgslave1
