#!/bin/bash

source build

docker run -i -t --rm -w "/files" --name "sampleapp" --hostname "sampleapp" datt/datt-sampleapp bash -c "supervisord; /bin/bash"
