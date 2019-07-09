## Relevant articles:
  Uruchomienie dockera z baza postgres:
  
  docker run --name dev-postgres -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres:11
  
  docker exec dev-postgres psql -U postgres -c"CREATE DATABASE coursedb" postgres 
  
  xxx
  docker-compose -f keycloak-postgres.yml up
  xx
  z importem REALM:
  
  
  docker-compose -f ./postgres-10_repmgr-4.0_pgpool-3.7_barman-2.4.yml up -d pgmaster pgslave1

Uruchomienie docker compose z keycloak i postrgres

docker-compose -f keycloak-postgres.yml up -d --build

Nowa wersja:
\oc.exe cluster up --skip-registry-check=true

oc new-app -e POSTGRESQL_USER=keycloak -e POSTGRESQL_PASSWORD=keycloak -e POSTGRESQL_DATABASE=keycloak-db postgresql

//oc replace --force -f "https://raw.githubusercontent.com/jboss-dockerfiles/keycloak/master/openshift-examples/keycloak-https.json"
keycloak-postgres-template-cluster

.\oc.exe port-forward nazwa_pod &

.\oc.exe import-image jboss/keycloak --confirm   

Tworzenie keycloak + cluster + postgres 
1. Import keycloak-postgres-template-cluster.json do openshift

2. w przypadku braku obrazowu podpiac:
.\oc.exe import-image jboss/keycloak --confirm   

3. przekierowac porty do postgres
.\oc.exe port-forward nazwa_pod 5432 &