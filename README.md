# Cexup-Telemdhicine
## Case 

Buatlah sebuah Aplikasi yang akan menampilkan data vital sign seperti berikut:

<img src="/showcase/preview.gif" width="200" height="500" />


### Tata cara

- [ ] Silahkan fork projek Ini ke github anda 
- [ ] Gunakan module yang sudah tersedia untuk membuat aplikasi
- [ ] Setelah selesai buat pull request baru untuk mengirimkan hasil aplikasi yang telah dibuat 


***
### Ketentuan:

1. Data dapat diampilkan  walaupun android/device sedang offline
2. Menggunakan salah satu design pattern seperti `mvp`,`mvvm` etc jika memungkinkan
3. Gunakan Repository pattern jika memungkinkan
4. Layout dapat menggunakan xml ataupun jetpack compose
5. Request Data dapat menggunakan:

- URL: `https://devdevice.cexup.com/api/measurement/history`
- Method : `GET`
- Header:
  - Params:
    - `member_id:String`
    - `all:Boolean= true`
    - `latest:Boolean = true`
    - `type:Integer = 1`
    - `from:Long(Timestamp)`
    - `to:Long(Timestamp)`
  - Content-Type: `application/json`
  - Accept: `application/json`
  - X-Api-Key: `<YOUR_API_KEY>`
- Body :

```text
-- empty
```

Response:
```json
{
  "status": "OK",
  "code": 200,
  "data": [
    {
      "id": "9183",
      "member_id": "CXPq9AD0XZoOO",
      "nurse_id": "kosong",
      "type": 1,
      "device": {
        "id": "REU6Nzk6RTQ6NEI6MDE6MTE=",
        "deviceName": "E86 0111",
        "deviceMac": "DE:79:E4:4B:01:11",
        "deviceType": "unknown",
        "deviceHolder": "consumer",
        "createdAt": 1635821282937,
        "updatedAt": 1635821282937
      },
      "value": "35.6",
      "method": "automatic",
      "created_at": 1635858014000,
      "updated_at": 1635858014000
    },
    {
      "id": "9190",
      "member_id": "CXPq9AD0XZoOO",
      "nurse_id": "kosong",
      "type": 3,
      "device": {
        "id": "REU6Nzk6RTQ6NEI6MDE6MTE=",
        "deviceName": "E86 0111",
        "deviceMac": "DE:79:E4:4B:01:11",
        "deviceType": "unknown",
        "deviceHolder": "consumer",
        "createdAt": 1635821282937,
        "updatedAt": 1635821282937
      },
      "value": "119/77",
      "method": "automatic",
      "created_at": 1635858014000,
      "updated_at": 1635858014000
    },
    {
      "id": "9184",
      "member_id": "CXPq9AD0XZoOO",
      "nurse_id": "kosong",
      "type": 13,
      "device": {
        "id": "REU6Nzk6RTQ6NEI6MDE6MTE=",
        "deviceName": "E86 0111",
        "deviceMac": "DE:79:E4:4B:01:11",
        "deviceType": "unknown",
        "deviceHolder": "consumer",
        "createdAt": 1635821282937,
        "updatedAt": 1635821282937
      },
      "value": "19",
      "method": "automatic",
      "created_at": 1635858014000,
      "updated_at": 1635858014000
    },
    {
      "id": "9182",
      "member_id": "CXPq9AD0XZoOO",
      "nurse_id": "kosong",
      "type": 8,
      "device": {
        "id": "REU6Nzk6RTQ6NEI6MDE6MTE=",
        "deviceName": "E86 0111",
        "deviceMac": "DE:79:E4:4B:01:11",
        "deviceType": "unknown",
        "deviceHolder": "consumer",
        "createdAt": 1635821282937,
        "updatedAt": 1635821282937
      },
      "value": "97",
      "method": "automatic",
      "created_at": 1635858014000,
      "updated_at": 1635858014000
    },
    {
      "id": "9196",
      "member_id": "CXPq9AD0XZoOO",
      "nurse_id": "kosong",
      "type": 2,
      "device": {
        "id": "REU6Nzk6RTQ6NEI6MDE6MTE=",
        "deviceName": "E86 0111",
        "deviceMac": "DE:79:E4:4B:01:11",
        "deviceType": "unknown",
        "deviceHolder": "consumer",
        "createdAt": 1635821282937,
        "updatedAt": 1635821282937
      },
      "value": "95",
      "method": "automatic",
      "created_at": 1635858013000,
      "updated_at": 1635858013000
    },
    {
      "id": "9181",
      "member_id": "CXPq9AD0XZoOO",
      "nurse_id": "kosong",
      "type": 13,
      "device": {
        "id": "REU6Nzk6RTQ6NEI6MDE6MTE=",
        "deviceName": "E86 0111",
        "deviceMac": "DE:79:E4:4B:01:11",
        "deviceType": "unknown",
        "deviceHolder": "consumer",
        "createdAt": 1635821282937,
        "updatedAt": 1635821282937
      },
      "value": "14",
      "method": "automatic",
      "created_at": 1635854416000,
      "updated_at": 1635854416000
    },
    {
      "id": "8907",
      "member_id": "CXPq9AD0XZoOO",
      "nurse_id": "kosong",
      "type": 12,
      "device": {
        "id": "REU6Nzk6RTQ6NEI6MDE6MTE=",
        "deviceName": "E86 0111",
        "deviceMac": "DE:79:E4:4B:01:11",
        "deviceType": "unknown",
        "deviceHolder": "consumer",
        "createdAt": 1635821282937,
        "updatedAt": 1635821282937
      },
      "value": "{\"deepSleepCount\":5,\"deepSleepTotal\":115,\"endTime\":1635816686000,\"lightSleepCount\":16,\"lightSleepTotal\":367,\"sleepData\":[{\"sleepLen\":3051,\"sleepStartTime\":1635787727000,\"sleepType\":242},{\"sleepLen\":1305,\"sleepStartTime\":1635790779000,\"sleepType\":241},{\"sleepLen\":2128,\"sleepStartTime\":1635792085000,\"sleepType\":242},{\"sleepLen\":910,\"sleepStartTime\":1635794214000,\"sleepType\":241},{\"sleepLen\":5128,\"sleepStartTime\":1635795125000,\"sleepType\":242},{\"sleepLen\":2196,\"sleepStartTime\":1635800254000,\"sleepType\":241},{\"sleepLen\":2630,\"sleepStartTime\":1635802451000,\"sleepType\":242},{\"sleepLen\":1125,\"sleepStartTime\":1635805082000,\"sleepType\":241},{\"sleepLen\":3191,\"sleepStartTime\":1635806208000,\"sleepType\":242},{\"sleepLen\":1365,\"sleepStartTime\":1635809400000,\"sleepType\":241},{\"sleepLen\":5920,\"sleepStartTime\":1635810766000,\"sleepType\":242}],\"startTime\":1635787727000}",
      "method": "automatic",
      "created_at": 1635787727000,
      "updated_at": 1635787727000
    }
  ],
  "message": ""
}
```

- Data Type
  - TEMPERATURE = 1
  - HEART RATE = 2
  - BLOOD PRESSURE = 3
  - BMI = 4
  - HEIGHT = 5
  - WEIGHT = 6
  - WAIST = 7
  - BLOOD_OXYGEN = 8
  - STETHOSCOPE = 9
  - ECG = 10
  - STEP = 11
  - SLEEP = 12
  - RESPIRATION = 13
