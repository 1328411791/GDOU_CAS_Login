## POST save

POST http://ehall.gdou.edu.cn/xsfw/sys/swmxsyqxxsjapp/modules/mrbpa/saveStuXx.do

> Body 请求参数

```yaml
data: '{"BY5_DISPLAY":"否，家庭成员一直在境内","BY6":"0","BY5":"0","ZYDM":"4011","BY4":"0","GJDQ":"156","BY3":"0","BY2":"<地址>","BY1":"广东省/深圳市/龙华区","SFDFHB_DISPLAY":"否","DWDM":"40","SFJZ":"0","JQQK_DISPLAY":"","SZDQ":"440309","JTCYJKZK_DISPLAY":"否","SZDQ_DISPLAY":"广东省/深圳市/龙华区","BY4_DISPLAY":"否，没有接触过","ZYDM_DISPLAY":"计算机科学与技术","BY3_DISPLAY":"有广东省内旅居史","BY7_DISPLAY":"已接种第三针","JJLXRDH":"<电话号码>","XXDZ":"440309","XLZK_DISPLAY":"是，一直在居住地或常住地","QTQK_DISPLAY":"否，没有到过中高风险地区","JTCYJKZK":"0","RYLB_DISPLAY":"","TW":"0","XBDM":"1","LXDH":"<电话号码>","XH":"<学号>","BJDM_DISPLAY":"<班级>","XM":"<姓名>","SFJZ_DISPLAY":"否","BY1_DISPLAY":"广东省/深圳市/龙华区","XLZK":"0","TBSJ":"2022-08-27","BY6_DISPLAY":"否，身体正常","QTQK":"0","JTXXDZ":"<详细地址>","JJLXRJG_DISPLAY":"母子","XXDZ_DISPLAY":"广东省/深圳市/龙华区","BJDM":"421401103","SFDFHB":"0","BRJKZT":"1","JJLXR":"<母亲姓名>","JJLXRJG":"母子","DWDM_DISPLAY":"<学院>","BRJKZT_DISPLAY":"是","GJDQ_DISPLAY":"中国","TW_DISPLAY":"否，没有发热症状","BY7":"3","XBDM_DISPLAY":"男","isToday":true,"DFHTJHBSJ":"","GCKSRQ":"","GCJSRQ":"","WID":"2022-08-27-<学号>"}'

```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|EMAP_LANG|cookie|string| 否 |none|
|_WEU|cookie|string| 是 |none|
|route|cookie|string| 否 |none|
|MOD_AUTH_CAS|cookie|string| 是 |none|
|body|body|object| 否 |none|
|» data|body|string| 否 |none|


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

## <以下暂未更新>

## POST 得到健康打卡数据

POST http://ehall.gdou.edu.cn/xsfw/sys/swpubapp/MobileCommon/getMenuInfo.do

> Body 请求参数

```yaml
data: '{"APPID":"5811260348942403","APPNAME":"swmxsyqxxsjapp"}'

```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|route|cookie|string| 否 |none|
|MOD_AUTH_CAS|cookie|string| 是 |none|
|User-Agent|header|string| 否 |none|
|X-Requested-With|header|string| 否 |none|
|body|body|object| 否 |none|
|» data|body|string| 否 |none|


## POST 1

POST /xsfw/sys/swpubapp/MobileCommon/getSelRoleConfig.do

> Body 请求参数

```yaml
data: '{"APPID":"5811260348942403","APPNAME":"swmxsyqxxsjapp"}'

```

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|route|cookie|string| 否 |none|
|User-Agent|header|string| 否 |none|
|Origin|header|string| 否 |none|
|body|body|object| 否 |none|
|» data|body|string| 否 |none|

