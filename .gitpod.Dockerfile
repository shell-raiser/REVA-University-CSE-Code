FROM gitpod/workspace-full-vnc
RUN sudo apt-get update \
    && sudo apt-get install -y libgtk-3-dev \
    && sudo apt-get clean && rm -rf /var/cache/apt/* && rm -rf /var/lib/apt/lists/* && rm -rf /tmp/* \
    ; sudo apt install mysql-server \
    ; sudo mysqld