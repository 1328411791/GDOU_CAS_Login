## POST CAS登录

POST http://authserver.gdou.edu.cn/authserver/login

> Body 请求参数

```yaml
username: "<用户名>"
password: rV4HHS3n87ntH7FunuVB3k02/XHtdooUeMajrvs+H8QTg4OeLcEpiMCSxZYOM6Qq40cNT4B4xQFE1ig+xnDrap/UuYozDBtPxRjIYSyzNu4=
captcha: string
rememberMe: "true"
_eventId: submit
cllt: userNameLogin
dllt: generalLogin
lt: string
execution: 28775e70-d4eb-488e-8a54-c2799a953e43_ZXlKaGJHY2lPaUpJVXpVeE1pSjkuYlQ0c0RwV2R2bno0ZUpHajQrK3ZFSTZDaG45emNzVllBSHo0bnZNSkROUyt0Rk9zakk1OEJHMmhDalgwYytHWEU2d0w2aUNpTUd4NGxYYi9iN2k4NjhkVUxYT3NDcXBIVjBPWTE0SlY3QjJhRS9XK2xzZVpObVVST0RDbm5aalRaM2dSWE5RUmNaSHprNHE3a01JRk5ZVlpZMENMWDhxeEprWkRDQXNRZkUzN25DMDVuR0hyVzVNejEybzhVUFVmODZEOEw3SFJ0b2pZN1RXNmRLbWdWMGViTnowbnVNcEszMWRZVU12OERXN2c0dXJFRlE5aVRoWXdjL1lRT0FmWE5KWXRDQmgyUU16RDFSeDBPRjlQK3dHSjB1U3h3N2hxSFZIOEJGMXlacVJET2Y2M0IzV2JjRXJYLzNUdHZiWVZPejArcmlUZHNlTjhQY1Y2VksyRUNxY00vU2hFbUU5Rkl5Q2NXT3FOdDd3TzZqSW51OXdRYWI1SFZMUUoxYlpwRXl1bEttUEtVaVI4aFdzTTNOYWpyaTg3QnFEdFRVdUNDWGFKNEJiYlIycGgwbnVXSkI2THZvM2szL3BiZ2RYOEladmdjT2hhL0lxd0xZNVQ3ZzZNUC9rZTdDSnc2MEVIZVlXL0x6LzFJRDBDOFdCVndrR2dOSFdwNmk5dC9CUGtPaWNUVmNZZDhWUU5IL2phWnBWRS9mM2xFeE8ySzhMTXlYRnNZTTYydk5vUHRZRldMeWs5NTBoNlhLcTF4WVExQVdQS2dRM0g1amNNZHBjMzkxckhmMGQraWxJcWNLUEpIWFBIK3RCbTdOQ0dFeEVSUmJIS0tJaDZodWF2U25sQ0liU3pYMjhBUjJINTIxalNRNDNyTmdubG1zNkJ3NkNVMkd4MUlkaENla2YxRzB6cjhpZzNCVXQ3TlJQM0VXWW5mcFJBZEdraWdxcWhMUWY1YTNnRGZBd3hSSVQ4QTdlUnloZ3B2STd1SEl6UjJibm15OTE4VFcvZXdwVC8yWFNhNnZ6QmJnWUo4MDFMQjExNGdHUGtidjJRSDRFUU44NWc4Q0dsbzZZMWM0NEhrQlI2Y2grVUV3WjBQMmU1a09DTkJnKzJVeU45RkN5TkJrKzd3bjZLWjZPaDJwRTF1SzRxcHVnTVJWTHRoTGt3blRlUDFFMVUrbUZ6dGg4NWhldDNZalI3RHk3WkM0Rmp6OSs1dE1kVFJvZXN6RHh1cGdmU0pNMnQxakZ5aG1YeFpiZUJnTkliYUZuRi9YaFJnZERiM3BHcVdlSnUxajRQblYyNFA5c0Z5Umt1Q1N1b1BLTmpDUDNjMnpDMm9Kdk5ReC9wU2puOTduczRocFZBR3dKWXc4ZzdRcm1ERzNKT2NIMnlaaUVPV1NQVWt5blNsL2NGbGRxVjZSd2haMU9NSmd6ZmRueHMwYld5N0grQzh1MFNacmFVSTVSZ2NWMWVjVHJDTE1pUWlJMXpwc0ZWZlEvYnA1aXV6WWVPUGxvajFGWlBXc2toWmFtRDdpRkkyZGU5WmpPeDVIcFpSUldCOWdpcW53cDZ6Y3BNTTZjNlY0M0N4MHNkcDhUdUw0UGl4VkJkeFhlN3dySWwvWkxMeHN6UG5XNWNiZUM3dDVwTi8rQUhkUTRUVUFmWXJEd1llK1pWSDQ0RTVtSDJIOFB1emdrQWRSYzJKNktFQjkwaUowbkVuQkNyc3FMOHdVSERIWVJKVlJmVDE5azloT1BQZUYzZy90a0p6TE9vQURFPS40ZklmcE5IN1VhZXVXNHRUWUppWjNDZWNYYmtJWE9LS1Nub2pXQlFSSU5xRGJQR3RoMUZJVndHN2UwQnRwTTV2Nk5SZFViTnhYV2JLWWtDWjNiTll0dw==

```

### 备注
1. `<>`包括的指代内文字的内容
2. password参数为使用AES加密,data为64位随机字符串+密码,加密方式CBC,iv为登录页标签中pwdEncryptSalt,Padding为PKCS7,[参见这段代码](https://github.com/1328411791/GDOU_CAS_Login/blob/166b5dfef7e9c98dfcac2b0aea907f1c7bf9d27a/src/main/java/org/liahnu/com/utility/CryptoAesUtil.java)
3. execution为登录页html中execution中的value

### 请求参数

|名称|位置|类型| 必选  |说明|
|---|---|---|-----|---|
|JSESSIONID|cookie|string| 是   |none|
|route|cookie|string| 否   |none|
|body|body|object| 是   |none|
|» username|body|string| 是   |none|
|» password|body|string| 是   |none|
|» captcha|body|string| 是   |none|
|» rememberMe|body|string| 是   |none|
|» _eventId|body|string| 是   |none|
|» cllt|body|string| 是   |none|
|» dllt|body|string| 是   |none|
|» lt|body|string| 是   |none|
|» execution|body|string| 是   |none|

# 健康登录

    以下按照接口顺序进行操作

## GET 网络认证

GET /xsfw/sys/xsyqxxsjapp/*default/index.do

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|MOD_AUTH_CAS|cookie|string| 否 |none|

### 注释

    会获取到下一个请求所需要的(_WEU)加密前(可能?)Cookie

## GET 获取认证后? _Weu参数

GET /xsfw/sys/swpubapp/indexmenu/getAppConfig.do

### 请求参数

| 名称           | 位置     | 类型     | 必选  | 说明   |
|--------------|--------|--------|-----|------|
| _WEU         | cookie | string | 是   | none |
| MOD_AUTH_CAS | cookie | string | 是   | none |
| appId        | query  | string | 否   | none |
| appName      | query  | string | 否   | none |

## POST 提交表单

POST /xsfw/sys/xsyqxxsjapp/mrbpa/saveMrbpa.do

> Body 请求参数

```yaml
data: "{\r

  \  \"JBXX\": {\r

  \    \"XH\": \"<学号>\",\r

  \    \"XM\": \"<姓名>\",\r

  \    \"DWDM_DISPLAY\": \"<学院>\",\r

  \    \"DWDM\": \"40\",\r

  \    \"ZYDM_DISPLAY\": \"<专业>\",\r

  \    \"ZYDM\": \"4011\",\r

  \    \"BJDM_DISPLAY\": \"<班级>\",\r

  \    \"BJDM\": \"421401103\",\r

  \    \"XBDM_DISPLAY\": \"男\",\r

  \    \"XBDM\": \"1\",\r

  \    \"LXDH\": \"18902833039\",\r

  \    \"GJDQ_DISPLAY\": \"中国\",\r

  \    \"GJDQ\": \"156\",\r

  \    \"XXDZ_DISPLAY\": \"广东省/深圳市/龙华区\",\r

  \    \"XXDZ\": \"440309\",\r

  \    \"JTXXDZ\": \"<家庭住址>\",\r

  \    \"SZDQ_DISPLAY\": \"龙华区\",\r

  \    \"SZDQ\": \"440309\",\r

  \    \"RYLB_DISPLAY\": \"\",\r

  \    \"RYLB\": \"\",\r

  \    \"JJLXR\": \"<监护人姓名>\",\r

  \    \"JJLXRDH\": \"<监护人电话>\",\r

  \    \"JJLXRJG\": \"母子\",\r

  \    \"JQQK_DISPLAY\": \"\",\r

  \    \"JQQK\": \"\",\r

  \    \"GCKSRQ\": \"\",\r

  \    \"GCJSRQ\": \"\",\r

  \    \"SFDFHB_DISPLAY\": \"否\",\r

  \    \"SFDFHB\": \"0\",\r

  \    \"DFHTJHBSJ\": \"\",\r

  \    \"ZDRQJCQK\": \"\",\r

  \    \"JTXC\": \"\",\r

  \    \"JQQTQK\": \"\",\r

  \    \"XSBH\": \"<学号>\"\r

  \  },\r

  \  \"MRQK\": {\r

  \    \"WID\": \"bbe5d4c0b0f043ada39d953271bc8937\",\r

  \    \"XSBH\": \"<学号>\",\r

  \    \"TBSJ\": \"2022-09-07\",\r

  \    \"TW_DISPLAY\": \"&lt;37.3℃(正常)\",\r

  \    \"TW\": \"0\",\r

  \    \"JTCYJKZK_DISPLAY\": \"否，身体正常\",\r

  \    \"JTCYJKZK\": \"0\",\r

  \    \"BY1_DISPLAY\": \"广东省/阳江市/江城区\",\r

  \    \"BY1\": \"广东省/阳江市/江城区\",\r

  \    \"BY2\": \"广东海洋大学阳江校区\",\r

  \    \"BRJKZT_DISPLAY\": \"是\",\r

  \    \"BRJKZT\": \"1\",\r

  \    \"SFJZ_DISPLAY\": \"否\",\r

  \    \"SFJZ\": \"0\",\r

  \    \"XLZK_DISPLAY\": \"是，一直在居住地或常住地\",\r

  \    \"XLZK\": \"0\",\r

  \    \"QTQK_DISPLAY\": \"否，没有到过中高风险地区\",\r

  \    \"QTQK\": \"0\",\r

  \    \"BY3_DISPLAY\": \"有广东省内旅居史\",\r

  \    \"BY3\": \"0\",\r

  \    \"BY4_DISPLAY\": \"否，没有接触过\",\r

  \    \"BY4\": \"0\",\r

  \    \"BY5_DISPLAY\": \"否，家庭成员一直在境内\",\r

  \    \"BY5\": \"0\",\r

  \    \"BY6_DISPLAY\": \"否，没有以上症状\",\r

  \    \"BY6\": \"0\",\r

  \    \"BY7_DISPLAY\": \"已接种第三针\",\r

  \    \"BY7\": \"3\"\r

  \  }\r

  }"

```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|_WEU|cookie|string| 是 |none|
|MOD_AUTH_CAS|cookie|string| 是 |none|
|route|cookie|string| 否 |none|
|EMAP_LANG|cookie|string| 否 |none|
|body|body|object| 否 |none|
|» data|body|string| 否 |none|

> 返回示例

> 200 Response

```json
{
  "code": "string",
  "msg": "string"
}
```

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|string|true|none||none|
|» msg|string|true|none||none|

### 注释

    data信息建议抓包

