This project aims to demostrate the behaviour of GET signals API provided by Kie Server
Apparently, the api does not resolve mvel expression for signalRef returning the expression provided at design time.

To replicate the problem executing the following actions:

1) Start the main process
POST http://localhost:8080/kie-server/services/rest/server/containers/keypartner:signal-processes:1.0/processes/signal-processes.signal-main/instances with empty body
Output -> pInstanceId

2) Retrieve signals
GET http://localhost:8080/kie-server/services/rest/server/containers/keypartner:signal-processes:1.0/processes/instances/{pInstanceId}/signals
Output -> [ "#{signalRef}" ]

3) Executing signal call
POST http://localhost:8080/kie-server/services/rest/server/containers/keypartner:signal-processes:1.0/processes/instances/36700/signal/test with empty bosy
Output -> process instance signalled successfully