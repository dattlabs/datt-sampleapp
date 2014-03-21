#!/bin/bash

# not building first. assuming that it's built.

docker run -i -t --rm -w "/files" --name "sampleapp" --hostname "sampleapp" datt/datt-sampleapp bash -c "supervisord; /bin/bash"
