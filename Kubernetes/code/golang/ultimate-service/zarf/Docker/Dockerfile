FROM golang:1.17 as build_sale-api
ENV CGO_ENABLED 0
ARG BUILD_REF

# Copy the source code into a container
# COPY main.go /service
COPY . /service

# Change working directory
WORKDIR /service

# Build the service binary
RUN go build -ldflags "-X main.build=${BUILD_REF}"

# Using alpine image to run the service binary
FROM alpine:3.14
ARG BUILD_DATE
ARG BUILD_REF

# Copy the service binary from build_sale-api
COPY --from=build_sale-api /service/service /service/service

# Change working directory
WORKDIR /service

# Entry point to start service
CMD [ "./service" ]

# Set LABEL for container
LABEL org.container.image.created="${BUILD_DATE}" \
    org.container.image.title="sales-api" \
    org.container.image.authors="Do Nguyen Ha <donguyenha@live.com>" \
    org.container.image.source="https://github.com/alochym/learn" \
    org.container.image.revision="${BUILD_REF}" \
    org.container.image.vendor="Alochym"
