# INSTALL KIND

1. The system has a go version 1.17+.
1. Install KIND - `go install sigs.k8s.io/kind@v0.17.0`
1. Create KIND cluster with kubernetes version 1.23

   ```bash
   docker pull kindest/node:v1.23.13
   
   kind create cluster --name=alochym --image=kindest/node:v1.23.13
   ```

1. Create KIND cluster with KIND configuration file - `kind create cluster --config kind-v1.23.13.yaml`
## KIND Configuartion File

Kind configuration file sample

```yaml
kind: Cluster
apiVersion: kind.x-k8s.io/v1alpha4
name: kind-2
# One control plane node and three "workers".
#
# While these will not add more real compute capacity and
# have limited isolation, this can be useful for testing
# rolling updates etc.
#
# The API-server and other control plane components will be
# on the control-plane node.
#
# You probably don't need this unless you are testing Kubernetes itself.
nodes:
- role: control-plane
  image: kindest/node:v1.23.13
  # add a mount from ~/kind-v1.23.13 on the host to /files on the node
  # extraMounts:
  # create folder ~/kind-v1.23.13 before create kind cluster
  # - hostPath: ~/kind-v1.23.13
    # containerPath: /files
# - role: worker
# - role: worker
# - role: worker
```

## Link Reference

1. <https://kind.sigs.k8s.io/#installation-and-usage>
