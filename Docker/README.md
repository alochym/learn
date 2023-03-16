# INSTALL DOCKER

1. Setup Docker repo - `sudo yum install -y yum-utils`
1. Enable Docker repo

   ```bash
   sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
   ```

1. Install Docker - sudo yum install docker

   ```bash
   sudo yum install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

   [hadn@publish Docker]$ docker --version
   Docker version 23.0.1, build a5ee5b1
   [hadn@publish Docker]$ containerd --version
   containerd containerd.io 1.6.18 2456e983eb9e37e47538f59ea18f2043c9a73640
   ```

## Link Reference

1. <https://docs.docker.com/engine/install/centos/>
