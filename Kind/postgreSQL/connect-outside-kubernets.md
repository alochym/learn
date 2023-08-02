# -h : IP_SERVER
# -p : 30778 # iptable open port for postgreSQL NODEPORT
# --env="PGPASSWORD=password_value_in_secret"
kubectl run postgres-client --rm --tty -i --restart='Never' --image postgres:14 --env="PGPASSWORD=postgres" --command -- psql -h IP_SERVER -p 30078 -U postgres
