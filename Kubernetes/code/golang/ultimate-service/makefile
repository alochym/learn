SHELL := /usr/bin/bash

VERSION := 1.0

run:
	go run main.go

build:
	go build -ldflags "-X main.build=local"

build-container:
	docker build \
		-f zarf/Docker/Dockerfile \
		-t service-amd64:${VERSION} \
		--build-arg BUILD_REF=${VERSION} \
		--build-arg BUILD_DATE=`date -u +"%Y-%m-%dT%H:%M:%SZ"` \
		.