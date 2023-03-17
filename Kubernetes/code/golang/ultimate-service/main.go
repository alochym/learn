package main

import (
	"log"
	"os"
	"os/signal"
	"syscall"
)

var build = "development"

func main() {
	log.Println("Starting service", build)

	defer log.Println("service end")

	shutdown := make(chan os.Signal, 1)
	signal.Notify(shutdown, syscall.SIGINT, syscall.SIGTERM)

	<-shutdown

	log.Println("Stopping service")
}
