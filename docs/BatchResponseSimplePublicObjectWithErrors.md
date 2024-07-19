

# BatchResponseSimplePublicObjectWithErrors


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedAt** | **OffsetDateTime** |  |  |
|**numErrors** | **Integer** |  |  [optional] |
|**requestedAt** | **OffsetDateTime** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  |
|**links** | **Map&lt;String, String&gt;** |  |  [optional] |
|**results** | [**List&lt;SimplePublicObject&gt;**](SimplePublicObject.md) |  |  |
|**errors** | [**List&lt;StandardError&gt;**](StandardError.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| COMPLETE | &quot;COMPLETE&quot; |



