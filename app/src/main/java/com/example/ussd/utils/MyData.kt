package com.example.ussd.utils

import com.example.ussd.models.MyTemplate

object MyData {
    val listTarif = ArrayList<MyTemplate>()//1
    val listDaqaiqa = ArrayList<MyTemplate>()//0
    val listXizmat = ArrayList<MyTemplate>()//2
    val listInternet = ArrayList<MyTemplate>()//3
    val listSMS = ArrayList<MyTemplate>()//4

    fun addTemplate() {
        listDaqaiqa.add(
            MyTemplate(
                "1000 daqiqa", "*106#", "10 000 som", "Oylik abonent to’lovi\n" +
                        "20 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "1 500 daq/oy\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "3 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "9 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "500 SMS/oy\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "20 250 so'm\n" +
                        "Ulanish kodi: *2*3#"
            )
        )
        listDaqaiqa.add(
            MyTemplate(
                "2000 daqiqa", "*105#", "20 000 som", "Oylik abonent to’lovi\n" +
                        "30 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "2 500 daq/oy\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "5 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "15 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "500 SMS/oy\n" +
                        "Beeline TV: Telekanallar***\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "30 250 so'm\n" +
                        "Ulanish kodi: *2*5#\n" +
                        "Tarif rejada obuna to'lovsiz taqdim etiladi:"
            )
        )
        listDaqaiqa.add(
            MyTemplate(
                "3000 daqiqa", "*104#", "30 000 som", "Oylik abonent to’lovi\n" +
                        "40 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "8 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "24 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "1 000 SMS/oy\n" +
                        "Beeline TV: Telekanallar va Amediateka***\n" +
                        "Beeline Music ***\n" +
                        "Beepul: 0% pul o'tkazmalar****\n" +
                        "500 000 so'm\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "40 250 so'm\n" +
                        "Ulanish kodi: *2*8#"
            )
        )
        listDaqaiqa.add(
            MyTemplate(
                "4000 daqiqa", "*103#", "40 000 som", "Oylik abonent to’lovi\n" +
                        "60 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "15 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "45 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "1 000 SMS/oy\n" +
                        "Beeline TV: Telekanallar va Amediateka***\n" +
                        "Beeline Music***\n" +
                        "Beepul: 0% pul o'tkazmalar****\n" +
                        "800 000 so'm\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "60 250 so'm\n" +
                        "Ulanish kodi: *2*15#"
            )
        )

        listTarif.add(
            MyTemplate(
                "ZOR 1", "*2*3#", "20 000 som", "Oylik abonent to’lovi\n" +
                        "20 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "1 500 daq/oy\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "3 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "9 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "500 SMS/oy\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "20 250 so'm\n" +
                        "Ulanish kodi: *2*3#"
            )
        )
        listTarif.add(
            MyTemplate(
                "ZOR 2", "*2*5#", "30 000 som", "Oylik abonent to’lovi\n" +
                        "30 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "2 500 daq/oy\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "5 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "15 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "500 SMS/oy\n" +
                        "Beeline TV: Telekanallar***\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "30 250 so'm\n" +
                        "Ulanish kodi: *2*5#\n" +
                        "Tarif rejada obuna to'lovsiz taqdim etiladi:"
            )
        )
        listTarif.add(
            MyTemplate(
                "ZOR 3", "*2*8#", "40 000 som", "Oylik abonent to’lovi\n" +
                        "40 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "8 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "24 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "1 000 SMS/oy\n" +
                        "Beeline TV: Telekanallar va Amediateka***\n" +
                        "Beeline Music ***\n" +
                        "Beepul: 0% pul o'tkazmalar****\n" +
                        "500 000 so'm\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "40 250 so'm\n" +
                        "Ulanish kodi: *2*8#"
            )
        )
        listTarif.add(
            MyTemplate(
                "ZOR 4", "*2*15#", "60 000 som", "Oylik abonent to’lovi\n" +
                        "60 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "15 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "45 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "1 000 SMS/oy\n" +
                        "Beeline TV: Telekanallar va Amediateka***\n" +
                        "Beeline Music***\n" +
                        "Beepul: 0% pul o'tkazmalar****\n" +
                        "800 000 so'm\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "60 250 so'm\n" +
                        "Ulanish kodi: *2*15#"
            )
        )

        listXizmat.add(
            MyTemplate(
                "My numbers", "*1*150#", "150 000 som", "Oylik abonent to’lovi\n" +
                        "20 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "1 500 daq/oy\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "3 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "9 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "500 SMS/oy\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "20 250 so'm\n" +
                        "Ulanish kodi: *2*3#"
            )
        )
        listXizmat.add(
            MyTemplate(
                "My internet", "*1*2#", "170 000 som", "Oylik abonent to’lovi\n" +
                        "30 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "2 500 daq/oy\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "5 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "15 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "500 SMS/oy\n" +
                        "Beeline TV: Telekanallar***\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "30 250 so'm\n" +
                        "Ulanish kodi: *2*5#\n" +
                        "Tarif rejada obuna to'lovsiz taqdim etiladi:"
            )
        )
        listXizmat.add(
            MyTemplate(
                "My SMS", "*1*30#", "160 000 som", "Oylik abonent to’lovi\n" +
                        "40 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "8 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "24 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "1 000 SMS/oy\n" +
                        "Beeline TV: Telekanallar va Amediateka***\n" +
                        "Beeline Music ***\n" +
                        "Beepul: 0% pul o'tkazmalar****\n" +
                        "500 000 so'm\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "40 250 so'm\n" +
                        "Ulanish kodi: *2*8#"
            )
        )
        listXizmat.add(
            MyTemplate(
                "My tarif", "*2*8#", "40 000 som", "Oylik abonent to’lovi\n" +
                        "60 000 so'm/oy\n" +
                        "O'zbekiston bo'yicha daqiqalar *\n" +
                        "Internet barcha yo’nalishlarga, GB\n" +
                        "15 GB/oy\n" +
                        "Tungi bonusli trafik (01:00-08:00), GB **\n" +
                        "45 GB/oy\n" +
                        "O'zbekiston bo'yicha SMS\n" +
                        "1 000 SMS/oy\n" +
                        "Beeline TV: Telekanallar va Amediateka***\n" +
                        "Beeline Music***\n" +
                        "Beepul: 0% pul o'tkazmalar****\n" +
                        "800 000 so'm\n" +
                        "Yangi tarmoqga ulanish uchun xizmatlar to’plamini faollashtirish to'lovi\n" +
                        "5 000 so'm\n" +
                        "Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori (tarifga o'tish narxini hisobga olmagan holda)\n" +
                        "60 250 so'm\n" +
                        "Ulanish kodi: *2*15#"
            )
        )

        listInternet.add(
            MyTemplate(
                "paket 5 GB",
                "*1*5#",
                "25 000 som",
                "- Oylik Internet-paketlarning amal qilish muddati paket yoqtirilgan kundan boshlab 30 kunni tashkil etadi. Internet-paket ulangan kundan boshlab 30 kun o'tgach yangi internet-paket yoqtirilmasa, ishlatilmagan trafik qoldig’i kuyadi.\n" +
                        "- Internet-paketning amal qilish muddati davomida yana qo'shimcha paket xarid qilinsa, barcha sarflanmagan trafik hajmi qo'shilib, amal qilish muddati oxirgi yoqtirilgan paket kunidan boshlab 30 kunga uzaytiriladi.\n" +
                        "- Taqdim etilgan trafik tugaganida yoki paket muddati yakunlanganda, internet-trafikning keyingi sarflanishi tarif rejangiz shartlariga muvofiq narxlanadi.\n" +
                        "- Raqam faol bo’lmagan yoki blok holatiga tushirilgan davrda oxirgi ulangan internet paketning amal qilish muddati o’zgarmaydi.\n" +
                        "- Shuni ma’lum qilamizki, internet trafik, daqiqa va SMSlar qoldig’i va boshqa qo’shimcha xizmatlar bo’yicha ma’lumoti 06:00 dan 00:00 gacha yuboriladi.\n" +
                        "- Foydalanilgan trafik hajmi yuqori tomonga 16 KB aniqlikda yaxlitlanadi. Internet sessiyasi ochilganda, Kompaniya tizimi balansdagi pul mablag'larini zaxiraga olib qo'yadi, ya'ni balansdagi pul mablag'lari boshqa pullik xizmatlardan foydalanish uchun yopilishi mumkin va balans tekshirilganda tizim hisobni to'ldirish zarurligi haqida xabar beradi.\n" +
                        "- Agar abonentda internet-paket mavjud bo'lsa va sessiya uchun internet-paketda yetarli MB bo'lmasa (2 MBdan kam), bu holda keyingi hisoblashlar asosiy balansdan amalga oshiriladi (asosiy balansda mablag’ mavjud bo'lsa). Zaxiralangan pul mablag'lari summasi ishlatiladigan internet trafigi miqdoriga bog'liq bo'ladi. Internet sessiyasi tugashi bilan va ushbu sessiya uchun pul to'langach, abonent hisobidagi qolgan pul mablag'lari ishlatish uchun ochiladi.\n" +
                        "- Oylik internet paketlar O'zbekiston Respublikasi hududida oldindan to’lov tizimidagi barcha jismoniy shaxslar uchun amal qiladi. Paketlar «Shifokor», «Bolajon», «ProInternet 1GB» va «ProInternet 3GB» tarif rejalari uchun amal qilmaydi.\n" +
                        "- Barcha narxlar QQS bilan ko'rsatilgan."
            )
        )
        listInternet.add(
            MyTemplate(
                "paket 10 GB",
                "*1*10#",
                "45 000 som",
                "- Oylik Internet-paketlarning amal qilish muddati paket yoqtirilgan kundan boshlab 30 kunni tashkil etadi. Internet-paket ulangan kundan boshlab 30 kun o'tgach yangi internet-paket yoqtirilmasa, ishlatilmagan trafik qoldig’i kuyadi.\n" +
                        "- Internet-paketning amal qilish muddati davomida yana qo'shimcha paket xarid qilinsa, barcha sarflanmagan trafik hajmi qo'shilib, amal qilish muddati oxirgi yoqtirilgan paket kunidan boshlab 30 kunga uzaytiriladi.\n" +
                        "- Taqdim etilgan trafik tugaganida yoki paket muddati yakunlanganda, internet-trafikning keyingi sarflanishi tarif rejangiz shartlariga muvofiq narxlanadi.\n" +
                        "- Raqam faol bo’lmagan yoki blok holatiga tushirilgan davrda oxirgi ulangan internet paketning amal qilish muddati o’zgarmaydi.\n" +
                        "- Shuni ma’lum qilamizki, internet trafik, daqiqa va SMSlar qoldig’i va boshqa qo’shimcha xizmatlar bo’yicha ma’lumoti 06:00 dan 00:00 gacha yuboriladi.\n" +
                        "- Foydalanilgan trafik hajmi yuqori tomonga 16 KB aniqlikda yaxlitlanadi. Internet sessiyasi ochilganda, Kompaniya tizimi balansdagi pul mablag'larini zaxiraga olib qo'yadi, ya'ni balansdagi pul mablag'lari boshqa pullik xizmatlardan foydalanish uchun yopilishi mumkin va balans tekshirilganda tizim hisobni to'ldirish zarurligi haqida xabar beradi.\n" +
                        "- Agar abonentda internet-paket mavjud bo'lsa va sessiya uchun internet-paketda yetarli MB bo'lmasa (2 MBdan kam), bu holda keyingi hisoblashlar asosiy balansdan amalga oshiriladi (asosiy balansda mablag’ mavjud bo'lsa). Zaxiralangan pul mablag'lari summasi ishlatiladigan internet trafigi miqdoriga bog'liq bo'ladi. Internet sessiyasi tugashi bilan va ushbu sessiya uchun pul to'langach, abonent hisobidagi qolgan pul mablag'lari ishlatish uchun ochiladi.\n" +
                        "- Oylik internet paketlar O'zbekiston Respublikasi hududida oldindan to’lov tizimidagi barcha jismoniy shaxslar uchun amal qiladi. Paketlar «Shifokor», «Bolajon», «ProInternet 1GB» va «ProInternet 3GB» tarif rejalari uchun amal qilmaydi.\n" +
                        "- Agar mijozning raqamida boshqa internet-paketlar mavjud bo'lsa, u holda avtomatik uzaytiriladigan internet-paketlar bo'yicha taqdim etilgan trafik oxirgi o'rinda sarflanadi.\n" +
                        "- Barcha narxlar QQS bilan ko'rsatilgan."
            )
        )
        listInternet.add(
            MyTemplate(
                "paket 20 GB",
                "*1*20#",
                " 65 000 som",
                "- Oylik Internet-paketlarning amal qilish muddati paket yoqtirilgan kundan boshlab 30 kunni tashkil etadi. Internet-paket ulangan kundan boshlab 30 kun o'tgach yangi internet-paket yoqtirilmasa, ishlatilmagan trafik qoldig’i kuyadi.\n" +
                        "- Internet-paketning amal qilish muddati davomida yana qo'shimcha paket xarid qilinsa, barcha sarflanmagan trafik hajmi qo'shilib, amal qilish muddati oxirgi yoqtirilgan paket kunidan boshlab 30 kunga uzaytiriladi.\n" +
                        "- Taqdim etilgan trafik tugaganida yoki paket muddati yakunlanganda, internet-trafikning keyingi sarflanishi tarif rejangiz shartlariga muvofiq narxlanadi.\n" +
                        "- Raqam faol bo’lmagan yoki blok holatiga tushirilgan davrda oxirgi ulangan internet paketning amal qilish muddati o’zgarmaydi.\n" +
                        "- Shuni ma’lum qilamizki, internet trafik, daqiqa va SMSlar qoldig’i va boshqa qo’shimcha xizmatlar bo’yicha ma’lumoti 06:00 dan 00:00 gacha yuboriladi.\n" +
                        "- Foydalanilgan trafik hajmi yuqori tomonga 16 KB aniqlikda yaxlitlanadi. Internet sessiyasi ochilganda, Kompaniya tizimi balansdagi pul mablag'larini zaxiraga olib qo'yadi, ya'ni balansdagi pul mablag'lari boshqa pullik xizmatlardan foydalanish uchun yopilishi mumkin va balans tekshirilganda tizim hisobni to'ldirish zarurligi haqida xabar beradi.\n" +
                        "- Agar abonentda internet-paket mavjud bo'lsa va sessiya uchun internet-paketda yetarli MB bo'lmasa (2 MBdan kam), bu holda keyingi hisoblashlar asosiy balansdan amalga oshiriladi (asosiy balansda mablag’ mavjud bo'lsa). Zaxiralangan pul mablag'lari summasi ishlatiladigan internet trafigi miqdoriga bog'liq bo'ladi. Internet sessiyasi tugashi bilan va ushbu sessiya uchun pul to'langach, abonent hisobidagi qolgan pul mablag'lari ishlatish uchun ochiladi.\n" +
                        "- Oylik internet paketlar O'zbekiston Respublikasi hududida oldindan to’lov tizimidagi barcha jismoniy shaxslar uchun amal qiladi. Paketlar «Shifokor», «Bolajon», «ProInternet 1GB» va «ProInternet 3GB» tarif rejalari uchun amal qilmaydi.\n" +
                        "- Barcha narxlar QQS bilan ko'rsatilgan."
            )
        )
        listInternet.add(
            MyTemplate(
                "paket 30 GB",
                "*1*30#",
                "75 000 som",
                "- Oylik Internet-paketlarning amal qilish muddati paket yoqtirilgan kundan boshlab 30 kunni tashkil etadi. Internet-paket ulangan kundan boshlab 30 kun o'tgach yangi internet-paket yoqtirilmasa, ishlatilmagan trafik qoldig’i kuyadi.\n" +
                        "- Internet-paketning amal qilish muddati davomida yana qo'shimcha paket xarid qilinsa, barcha sarflanmagan trafik hajmi qo'shilib, amal qilish muddati oxirgi yoqtirilgan paket kunidan boshlab 30 kunga uzaytiriladi.\n" +
                        "- Taqdim etilgan trafik tugaganida yoki paket muddati yakunlanganda, internet-trafikning keyingi sarflanishi tarif rejangiz shartlariga muvofiq narxlanadi.\n" +
                        "- Raqam faol bo’lmagan yoki blok holatiga tushirilgan davrda oxirgi ulangan internet paketning amal qilish muddati o’zgarmaydi.\n" +
                        "- Shuni ma’lum qilamizki, internet trafik, daqiqa va SMSlar qoldig’i va boshqa qo’shimcha xizmatlar bo’yicha ma’lumoti 06:00 dan 00:00 gacha yuboriladi.\n" +
                        "- Foydalanilgan trafik hajmi yuqori tomonga 16 KB aniqlikda yaxlitlanadi. Internet sessiyasi ochilganda, Kompaniya tizimi balansdagi pul mablag'larini zaxiraga olib qo'yadi, ya'ni balansdagi pul mablag'lari boshqa pullik xizmatlardan foydalanish uchun yopilishi mumkin va balans tekshirilganda tizim hisobni to'ldirish zarurligi haqida xabar beradi.\n" +
                        "- Agar abonentda internet-paket mavjud bo'lsa va sessiya uchun internet-paketda yetarli MB bo'lmasa (2 MBdan kam), bu holda keyingi hisoblashlar asosiy balansdan amalga oshiriladi (asosiy balansda mablag’ mavjud bo'lsa). Zaxiralangan pul mablag'lari summasi ishlatiladigan internet trafigi miqdoriga bog'liq bo'ladi. Internet sessiyasi tugashi bilan va ushbu sessiya uchun pul to'langach, abonent hisobidagi qolgan pul mablag'lari ishlatish uchun ochiladi.\n" +
                        "- Oylik internet paketlar O'zbekiston Respublikasi hududida oldindan to’lov tizimidagi barcha jismoniy shaxslar uchun amal qiladi. Paketlar «Shifokor», «Bolajon», «ProInternet 1GB» va «ProInternet 3GB» tarif rejalari uchun amal qilmaydi.\n" +
                        "- Barcha narxlar QQS bilan ko'rsatilgan."
            )
        )

        listSMS.add(
            MyTemplate(
                "50 SMS",
                "*110*160#",
                "1 000 som",
                "- Shuni ma’lum qilamizki, tariflar va qo'shimcha xizmatlar bo'yicha internet-trafik, daqiqalar va SMS-xabarlar qoldig'i haqida ma'lumot xabarlar 06:00 dan 00:00 gacha bo'lgan vaqtda amalga oshiriladi.\n" +
                        "- «SMS 20» va «SMS 50» paketlari bo’yicha taqdim etilgan SMS trafik kun tugaguncha amal qiladi. Keyinchalik (ulangan SMS paket o’chirilgunga qadar) har kuni SMS paket bo’yicha abonent to’lovi yechilib SMS trafik taqdim etiladi.\n" +
                        "- Paketning 1 kunlik amal qilish muddati tugaganidan so’ng sarflanmagan SMSlar qoldig'i kuyadi;\n" +
                        "-Taqdim etilgan SMS trafik ishlatib bo’linganidan so’ng foydalanilgan SMSlar tarif rejaga asosan narxlanadi.\n" +
                        "- Axborot-ko’ngil ochar qisqa raqamlaridan foydalanganda SMS paketlar amal qilmaydi;\n" +
                        "- «SMS 20» va «SMS 50» SMS paketlari to’liq o’chirilganda foydalanilmagan SMSlar qoldig’i abonent to’lovi yechilganda belgilangan muddatgacha amal qiladi.\n" +
                        "-«SMS 20» paketi ulangan bo’lgan vaqtda qo’shimcha ravishda «SMS 50» paketi ulansa yoki aksincha hollarda birinchi ulangan paket o’chiriladi, unga tegishli bo’lgan ishlatilmagan SMSlar qoldig’i oxirgi ulangan paketga qo’shiladi va amal qilish muddati oxirgi ulangan paketning muddatiga teng bo’ladi.\n" +
                        "- E’tibor bering, «SMS 20» va «SMS 50» paketlari bo’yicha har kunlik abonent to‘lovi olinishi va SMS trafik taqdim etilishi soat 00:00 dan 06:00 gacha bo’lgan vaqt oralig‘ida amalga oshiriladi.\n" +
                        "-SMS trafik taqdim etilganligini *105# orqali tekshirganingizdan so’ng paketlardan foydalanishingizni tavsiya etamiz.\n" +
                        "SMS trafik taqdim etilmaguncha SMS-xabarlardan foydalanishingiz tarif rejangizga asosan narxlanadi.\n" +
                        "- Hisobingizda yetarli mablag' bo'lmagan hollarda hamda hisobingiz salbiy bo’lgan vaziyatlarda SMS paketlar uchun to'lov olinmaydi va paketlar bo’yicha tegishli SMS trafik ham taqdim etilmaydi;\n" +
                        "- Abonent raqami faol bo'lmagan yoki blok holatida bo’lgan vaziyatda oxirgi xarid qilingan paketning amal qilish muddati o'zgarmaydi, shu bilan birga paket uchun abonent to'lovi olinmaydi, SMS trafik taqdim etilmaydi;\n" +
                        "- Abonent raqami blok holatidan chiqarilganda SMS paket uchun to'lov olinadi va SMS trafik taqdim etiladi;\n" +
                        "- «SMS 20» va «SMS 50» paketlari bo’yicha taqdim etilgan SMSlar birinchi navbatda sarflanadi.\n" +
                        "- SMS paketlar faqat O'zbekiston Respublikasi hududida raqami faol holatda bo’lgan abonentlar uchun amal qiladi."
            )
        )
        listSMS.add(
            MyTemplate(
                "100 SMS", "*105#", "5 000 som", "Qo'shimcha ma'lumot\n" +
                        "Shuni ma’lum qilamizki, internet-trafik balansi, paketlar va tariflar uchun daqiqalar va SMS-xabarlar, shuningdek boshqa qo'shimcha xizmatlar uchun ma'lumot berish 06:00 dan 00:00 gacha qabul qilinadi.\n" +
                        "\n" +
                        "«SMS Paketi» ning amal qilish muddati ulanish paytidan boshlab 30 kun.\n" +
                        "\n" +
                        "Har bir navbatdagi «SMS Paketi»ni ulash chog’ida amaldagisining muddati yana 30 kunga uzaytiriladi, SMS lar esa jamlanadi.\n" +
                        "\n" +
                        "SMS paketlari axborot-ko’ngilochar xizmatlarga joriy etilmaydi.\n" +
                        " \n" +
                        "\n" +
                        "Muhim!\n" +
                        "\n" +
                        "Paketni ulash chog’ida hisobda kamida  5473 so'm miqdordagi balansga ega bo’lmoq lozim\n" +
                        "\n" +
                        "Mahalliy SMS paketlari faqat O’zbekiston Respublikasi hududida amal qiladi."
            )
        )
        listSMS.add(
            MyTemplate(
                "500 SMS",
                "*106#",
                "15 000 som",
                "Shuni ma’lum qilamizki, internet-trafik balansi, paketlar va tariflar uchun daqiqalar va SMS-xabarlar, shuningdek boshqa qo'shimcha xizmatlar uchun ma'lumot berish 06:00 dan 00:00 gacha qabul qilinadi.\n" +
                        "\n" +
                        "«SMS Paketi» ning amal qilish muddati ulanish paytidan boshlab 30 kun.\n" +
                        "\n" +
                        "Har bir navbatdagi «SMS Paketi»ni ulash chog’ida amaldagisining muddati yana 30 kunga uzaytiriladi, SMS lar esa jamlanadi.\n" +
                        "\n" +
                        "SMS paketlari axborot-ko’ngilochar xizmatlarga joriy etilmaydi.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Muhim!\n" +
                        "\n" +
                        "Paketni ulash chog’ida hisobda kamida  13893 so'm miqdordagi balansga ega bo’lmoq lozim\n" +
                        "\n" +
                        "Mahalliy SMS paketlari faqat O’zbekiston Respublikasi hududida amal qiladi."
            )
        )
        listSMS.add(
            MyTemplate(
                "1000 SMS",
                "*107#",
                "25 000 som",
                "Shuni ma’lum qilamizki, internet-trafik balansi, paketlar va tariflar uchun daqiqalar va SMS-xabarlar, shuningdek boshqa qo'shimcha xizmatlar uchun ma'lumot berish 06:00 dan 00:00 gacha qabul qilinadi.\n" +
                        "\n" +
                        "«SMS Paketi» ning amal qilish muddati ulanish paytidan boshlab 30 kun.\n" +
                        "\n" +
                        "Har bir navbatdagi «SMS Paketi»ni ulash chog’ida amaldagisining muddati yana 30 kunga uzaytiriladi, SMS lar esa jamlanadi.\n" +
                        "\n" +
                        "SMS paketlari axborot-ko’ngilochar xizmatlarga joriy etilmaydi.\n" +
                        "\n" +
                        "Mazkur xizmat faqat barcha Tarif rejalari bo’yicha avvaldan hisob-kitob tizimidagi abonentlar uchun amal qiladi.\n" +
                        " \n" +
                        "\n" +
                        "Muhim!\n" +
                        "\n" +
                        "Paketni ulash chog’ida hisobda kamida  22313 so'm miqdordagi balansga ega bo’lmoq lozim\n" +
                        "\n" +
                        "Mahalliy SMS paketlari faqat O’zbekiston Respublikasi hududida amal qiladi."
            )
        )
    }
}