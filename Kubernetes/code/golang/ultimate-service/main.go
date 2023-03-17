package main

import (
	"log"
	"os"
	"os/signal"
	"runtime"
	"syscall"

	_ "go.uber.org/automaxprocs"
)

var build = "development"

func main() {
	cpu := runtime.GOMAXPROCS(0)
	log.Printf("Starting service - [%s], CPU - [%d]", build, cpu)

	defer log.Println("service end")

	shutdown := make(chan os.Signal, 1)
	signal.Notify(shutdown, syscall.SIGINT, syscall.SIGTERM)

	<-shutdown

	log.Println("Stopping service")
}
