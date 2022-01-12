# jackson-marshalling-unmarshalling
Tutorial: http://www.mtitek.com/tutorials/jackson/jackson-marshalling-unmarshalling.php

output1:
```
<payload>
  <id>1</id>
  <code>111</code>
  <parameters>
    <parameter id="1">
      <name>aaa</name>
      <value>bbb</value>
    </parameter>
    <parameter id="2">
      <name>ccc</name>
      <value>ddd</value>
    </parameter>
  </parameters>
</payload>
```
output2:
```
<payload xmlns="http://marshalling.jackson.mtitek/payload">
    <id xmlns="">1</id>
    <code xmlns="">111</code>
    <label xmlns=""><![CDATA[aa vvv ddd]]></label>
    <parameters xmlns="">
        <parameter id="1">
            <name>aaa</name>
            <value>bbb</value>
        </parameter>
        <parameter id="2">
            <name>ccc</name>
            <value>ddd</value>
        </parameter>
    </parameters>
</payload>
```
output3:
```
Payload [id=123, code=xyz, label=null]
[PayloadParameter [id=11, name=bar, value=foo], PayloadParameter [id=22, name=ta, value=ti]]
```
output4:
```
{
    "id": "1",
    "code": "111",
    "label": "aa vvv ddd",
    "parameter": [
        {
            "name": "aaa",
            "value": "bbb",
            "id": "1"
        },
        {
            "name": "ccc",
            "value": "ddd",
            "id": "2"
        }
    ]
}
```
output5:
```
Payload [id=111, code=222, label=label payload]
[PayloadParameter [id=111, name=ddd, value=eee], PayloadParameter [id=222, name=rrr, value=ttt]]
```
