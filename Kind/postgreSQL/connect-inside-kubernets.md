# -h : name of service
# --env="PGPASSWORD=password_value_in_secret"
kubectl run postgres-client --rm --tty -i --restart='Never' --image postgres:14 --env="PGPASSWORD=postgres" --command -- psql -h postgresql -U postgres

