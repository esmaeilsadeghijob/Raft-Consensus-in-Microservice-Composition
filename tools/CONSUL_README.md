# consul


### Consul Commands (CLI)
````
    consul
    consul join --help
    
````

Download from [Consul portal](https://developer.hashicorp.com/consul/install)

````
consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=127.0.0.1
````

[Consul UI](http://localhost:8500/ui/dc1/services)