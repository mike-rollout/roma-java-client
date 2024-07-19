

# BatchResponseSimplePublicObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedAt** | **OffsetDateTime** |  |  |
|**requestedAt** | **OffsetDateTime** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  |
|**links** | **Map&lt;String, String&gt;** |  |  [optional] |
|**results** | [**List&lt;SimplePublicObject&gt;**](SimplePublicObject.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| COMPLETE | &quot;COMPLETE&quot; |



