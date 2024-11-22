## About

This tool was designed to search all conflicts produced by merge command in git.

## Usage

`MainKt` - entrypoint, it should be run with the program arguments

## Arguments
`-p, --path` - specify path of the git repository in the local machine. Example: `java MainKt --path="/some/path"`

`-u, --url` - specify url to the git repository. Example: `java MainKt --url="https://github.com/gradle/gradle.git"`

It is important to note that only one argument should be provided. 