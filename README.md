# direct-gateway-common
Gateway classes shared by the Direct Java RI [gateway](https://github.com/DirectProjectJavaRI/gateway) and the Direct James server.

This library depends on `agent` and `direct-common` and deliberately contains no Spring auto configuration, so it can be pulled in by
applications without activating any gateway beans.

Contents (package names unchanged from the gateway project):

* `org.nhindirect.gateway.GatewayConfiguration`
* `org.nhindirect.gateway.smtp.NotificationProducer`, `NotificationSettings`, `ReliableDispatchedNotificationProducer`
* `org.nhindirect.gateway.smtp.dsn.DSNCreator`
* `org.nhindirect.gateway.smtp.dsn.impl.AbstractDSNCreator`, `FailedDeliveryDSNCreator`, `FailedDeliveryDSNCreatorOptions`, `RejectedRecipientDSNCreator`, `RejectedRecipientDSNCreatorOptions`
