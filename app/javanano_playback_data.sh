#!/bin/bash
protoc ./src/main/proto/playback_data_proto.proto --javanano_out=./src/main/java/ --proto_path=./src/main/proto/
