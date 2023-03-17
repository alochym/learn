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

# KIND CLI - start
# kubectl config set-context --current --namespace=sales-system
kind-up:
	kind create cluster \
	    --image kindest/node:v1.23.13 \
		--name kind-2 \
		--config zarf/k8s/kind/kind-config.yaml

kind-down:
	kind delete cluster --name kind-2

kind-load:
	kind load docker-image service-amd64:${VERSION} --name kind-2

kind-apply:
	kubectl apply -f zarf/k8s/base/deployment-sale-api.yaml

kind-log:
	kubectl logs -l app=sales-api --tail=100

kind-restart:
	kubectl rollout restart deployment sales-api

kind-update: build-container kind-load kind-restart

# KIND CLI - end