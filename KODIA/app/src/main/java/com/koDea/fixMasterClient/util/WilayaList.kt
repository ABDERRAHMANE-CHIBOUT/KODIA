package com.koDea.fixMasterClient.util

import com.google.gson.Gson
import com.koDea.fixMasterClient.domain.model.wilayas_communes.Wilaya_CommunesDB

class WilayaList {
}
val jsonString = """
    [
      {
        "mattricule": 1,
        "name_ar": "أدرار",
        "name_ber": "ⴰⴷⵔⴰⵔ",
        "name_en": "Adrar",
        "name": "Adrar",
        "phoneCodes": [
          49
        ],
        "postalCodes": [
          1000,
          1001,
          1002,
          1003,
          1004,
          1005,
          1006,
          1007,
          1008,
          1009,
          1010,
          1011,
          1012,
          1013,
          1014,
          1015,
          1016,
          1017,
          1018,
          1019,
          1020,
          1021,
          1022,
          1023,
          1024,
          1025,
          1026,
          1027,
          1028,
          1029,
          1030,
          1031,
          1032,
          1033,
          1034,
          1035,
          1036,
          1037,
          1038,
          1039,
          1040,
          1041,
          1042,
          1043,
          1044,
          1045,
          1046,
          1047,
          1048,
          1049,
          1050,
          1051,
          1052,
          1053,
          1054,
          1055,
          1056,
          1057,
          1058,
          1059,
          1060,
          1061,
          1062,
          1063,
          1064,
          1065,
          1066,
          1067,
          1068,
          1069,
          1070,
          1071,
          1072,
          1073,
          1074
        ],
        "dairats": [
          {
            "code": 101,
            "name": "ADRAR",
            "name_ar": "أدرار",
            "name_en": "ADRAR",
            "baladyiats": [
              {
                "code": 101,
                "name": "ADRAR",
                "name_en": "ADRAR",
                "name_ar": "أدرار"
              },
              {
                "code": 121,
                "name": "OULED AHMED TIMMI",
                "name_en": "OULED AHMED TIMMI",
                "name_ar": "أولاد أحمد تيمي"
              },
              {
                "code": 122,
                "name": "BOUDA",
                "name_en": "BOUDA",
                "name_ar": "بودة"
              }
            ]
          },
          {
            "code": 103,
            "name": "CHAROUINE",
            "name_ar": "شروين",
            "name_en": "CHAROUINE",
            "baladyiats": [
              {
                "code": 103,
                "name": "CHAROUINE",
                "name_en": "CHAROUINE",
                "name_ar": "شروين"
              },
              {
                "code": 124,
                "name": "TALMINE",
                "name_en": "TALMINE",
                "name_ar": "طالمين"
              },
              {
                "code": 127,
                "name": "OULED AISSA",
                "name_en": "OULED AISSA",
                "name_ar": "أولاد عيسى"
              }
            ]
          },
          {
            "code": 104,
            "name": "REGGANE",
            "name_ar": "رقان",
            "name_en": "REGGANE",
            "baladyiats": [
              {
                "code": 104,
                "name": "REGGANE",
                "name_en": "REGGANE",
                "name_ar": "رقان"
              },
              {
                "code": 118,
                "name": "SALI",
                "name_en": "SALI",
                "name_ar": "سالي"
              }
            ]
          },
          {
            "code": 108,
            "name": "TSABIT",
            "name_ar": "تسابيت",
            "name_en": "TSABIT",
            "baladyiats": [
              {
                "code": 108,
                "name": "TSABIT",
                "name_en": "TSABIT",
                "name_ar": "تسابيت"
              },
              {
                "code": 126,
                "name": "SEBAA",
                "name_en": "SEBAA",
                "name_ar": "السبع"
              }
            ]
          },
          {
            "code": 109,
            "name": "TIMIMOUN",
            "name_ar": "تيميمون",
            "name_en": "TIMIMOUN",
            "baladyiats": [
              {
                "code": 109,
                "name": "TIMIMOUN",
                "name_en": "TIMIMOUN",
                "name_ar": "تيميمون"
              },
              {
                "code": 110,
                "name": "OULED SAID",
                "name_en": "OULED SAID",
                "name_ar": "أولاد السعيد"
              }
            ]
          },
          {
            "code": 111,
            "name": "ZAOUIAT KOUNTA",
            "name_ar": "زاوية كنتة",
            "name_en": "ZAOUIAT KOUNTA",
            "baladyiats": [
              {
                "code": 105,
                "name": "IN ZGHMIR",
                "name_en": "IN ZGHMIR",
                "name_ar": "إن زغمير"
              },
              {
                "code": 111,
                "name": "ZAOUIET KOUNTA",
                "name_en": "ZAOUIET KOUNTA",
                "name_ar": "زاوية كنتة"
              }
            ]
          },
          {
            "code": 112,
            "name": "AOULEF",
            "name_ar": "أولف",
            "name_en": "AOULEF",
            "baladyiats": [
              {
                "code": 106,
                "name": "TIT",
                "name_en": "TIT",
                "name_ar": "تيت"
              },
              {
                "code": 112,
                "name": "AOULEF",
                "name_en": "AOULEF",
                "name_ar": "أولف"
              },
              {
                "code": 113,
                "name": "TIMEKTEN",
                "name_en": "TIMEKTEN",
                "name_ar": "تيمقتن"
              },
              {
                "code": 119,
                "name": "AKABLI",
                "name_en": "AKABLI",
                "name_ar": "اقبلي"
              }
            ]
          },
          {
            "code": 115,
            "name": "FENOUGHIL",
            "name_ar": "فنوغيل",
            "name_en": "FENOUGHIL",
            "baladyiats": [
              {
                "code": 102,
                "name": "TAMEST",
                "name_en": "TAMEST",
                "name_ar": "تامست"
              },
              {
                "code": 114,
                "name": "TAMANTIT",
                "name_en": "TAMANTIT",
                "name_ar": "تامنطيط"
              },
              {
                "code": 115,
                "name": "FENOUGHIL",
                "name_en": "FENOUGHIL",
                "name_ar": "فنوغيل"
              }
            ]
          },
          {
            "code": 116,
            "name": "TINERKOUK",
            "name_ar": "تنركوك",
            "name_en": "TINERKOUK",
            "baladyiats": [
              {
                "code": 107,
                "name": "KSAR KADDOUR",
                "name_en": "KSAR KADDOUR",
                "name_ar": "قصر قدور"
              },
              {
                "code": 116,
                "name": "TINERKOUK",
                "name_en": "TINERKOUK",
                "name_ar": "تنركوك"
              }
            ]
          },
          {
            "code": 123,
            "name": "AOUGROUT",
            "name_ar": "أوقروت",
            "name_en": "AOUGROUT",
            "baladyiats": [
              {
                "code": 117,
                "name": "DELDOUL",
                "name_en": "DELDOUL",
                "name_ar": "دلدول"
              },
              {
                "code": 120,
                "name": "METARFA",
                "name_en": "METARFA",
                "name_ar": "المطارفة"
              },
              {
                "code": 123,
                "name": "AOUGROUT",
                "name_en": "AOUGROUT",
                "name_ar": "أوقروت"
              }
            ]
          },
          {
            "code": 125,
            "name": "BORDJ BADJI MOKHTAR",
            "name_ar": "برج باجي مختار",
            "name_en": "BORDJ BADJI MOKHTAR",
            "baladyiats": [
              {
                "code": 125,
                "name": "BORDJ BADJI MOKHTAR",
                "name_en": "BORDJ BADJI MOKHTAR",
                "name_ar": "برج باجي مختار"
              },
              {
                "code": 128,
                "name": "TIMIAOUINE",
                "name_en": "TIMIAOUINE",
                "name_ar": "تيمياوين"
              }
            ]
          },
          {
            "code": 1090,
            "name": "TIMIMOUN (wilya déléguée)",
            "name_ar": "تيميمون (ولاية منتدبة)",
            "name_en": "TIMIMOUN (wilya déléguée)"
          },
          {
            "code": 1250,
            "name": "BORDJ BADJI MOKHTAR (wilya déléguée)",
            "name_ar": "برج باجي مختار (ولاية منتدبة)",
            "name_en": "BORDJ BADJI MOKHTAR (wilya déléguée)"
          }
        ],
        "adjacentWilayas": [
          37,
          8,
          32,
          3,
          47,
          11
        ]
      },
      {
        "mattricule": 2,
        "name_ar": "الشلف",
        "name_ber": "ⵛⵛⵍⴻⴼ",
        "name_en": "Chlef",
        "name": "Chlef",
        "phoneCodes": [
          27
        ],
        "postalCodes": [
          2000,
          2001,
          2002,
          2003,
          2004,
          2005,
          2006,
          2007,
          2008,
          2009,
          2010,
          2011,
          2012,
          2013,
          2014,
          2015,
          2016,
          2017,
          2018,
          2019,
          2020,
          2021,
          2022,
          2023,
          2024,
          2025,
          2026,
          2027,
          2028,
          2029,
          2030,
          2031,
          2032,
          2033,
          2034,
          2035,
          2036,
          2037,
          2038,
          2039,
          2040,
          2041,
          2042,
          2043,
          2044,
          2045,
          2046,
          2047,
          2048,
          2049,
          2050,
          2051,
          2052,
          2053,
          2054,
          2055,
          2056,
          2057,
          2058,
          2059,
          2060,
          2061,
          2062,
          2063,
          2064,
          2065,
          2066,
          2067,
          2068,
          2069,
          2070,
          2071,
          2072,
          2073,
          2074,
          2075,
          2076,
          2077,
          2078,
          2079,
          2080,
          2081,
          2082,
          2083,
          2084,
          2085,
          2086,
          2087,
          2088,
          2089,
          2090,
          2091,
          2092,
          2093,
          2094,
          2095,
          2096,
          2097,
          2098,
          2099,
          2100
        ],
        "dairats": [
          {
            "code": 201,
            "name": "CHLEF",
            "name_ar": "الشلف",
            "name_en": "CHLEF",
            "baladyiats": [
              {
                "code": 201,
                "name": "CHLEF",
                "name_en": "CHLEF",
                "name_ar": "الشلف"
              },
              {
                "code": 219,
                "name": "SENDJAS",
                "name_en": "SENDJAS",
                "name_ar": "سنجاس"
              },
              {
                "code": 233,
                "name": "OUM DROU",
                "name_en": "OUM DROU",
                "name_ar": "أم الدروع"
              }
            ]
          },
          {
            "code": 202,
            "name": "TENES",
            "name_ar": "تنس",
            "name_en": "TENES",
            "baladyiats": [
              {
                "code": 202,
                "name": "TENES",
                "name_en": "TENES",
                "name_ar": "تنس"
              },
              {
                "code": 211,
                "name": "SIDI AKKACHA",
                "name_en": "SIDI AKKACHA",
                "name_ar": "سيدي عكاشة"
              },
              {
                "code": 225,
                "name": "SIDI ABDERRAHMANE",
                "name_en": "SIDI ABDERRAHMANE",
                "name_ar": "سيدي عبد الرحمن"
              }
            ]
          },
          {
            "code": 204,
            "name": "EL KARIMIA",
            "name_ar": "الكريمية",
            "name_en": "EL KARIMIA",
            "baladyiats": [
              {
                "code": 204,
                "name": "EL KARIMIA",
                "name_en": "EL KARIMIA",
                "name_ar": "الكريمية"
              },
              {
                "code": 209,
                "name": "HARCHOUN",
                "name_en": "HARCHOUN",
                "name_ar": "حرشون"
              },
              {
                "code": 235,
                "name": "BENI  BOUATTAB",
                "name_en": "BENI  BOUATTAB",
                "name_ar": "بني بوعتاب"
              }
            ]
          },
          {
            "code": 206,
            "name": "TAOUGRIT",
            "name_ar": "تاوقريت",
            "name_en": "TAOUGRIT",
            "baladyiats": [
              {
                "code": 206,
                "name": "TAOUGRIT",
                "name_en": "TAOUGRIT",
                "name_ar": "تاوقريت"
              },
              {
                "code": 217,
                "name": "DAHRA",
                "name_en": "DAHRA",
                "name_ar": "الظهرة"
              }
            ]
          },
          {
            "code": 207,
            "name": "BENI HAOUA",
            "name_ar": "بني حواء",
            "name_en": "BENI HAOUA",
            "baladyiats": [
              {
                "code": 207,
                "name": "BENI HAOUA",
                "name_en": "BENI HAOUA",
                "name_ar": "بني حواء"
              },
              {
                "code": 216,
                "name": "OUED GOUSSINE",
                "name_en": "OUED GOUSSINE",
                "name_ar": "وادي قوسين"
              },
              {
                "code": 234,
                "name": "BREIRA",
                "name_en": "BREIRA",
                "name_ar": "بريرة"
              }
            ]
          },
          {
            "code": 210,
            "name": "OULED FARES",
            "name_ar": "أولاد فارس",
            "name_en": "OULED FARES",
            "baladyiats": [
              {
                "code": 210,
                "name": "OULED FARES",
                "name_en": "OULED FARES",
                "name_ar": "أولاد فارس"
              },
              {
                "code": 224,
                "name": "CHETTIA",
                "name_en": "CHETTIA",
                "name_ar": "الشطية"
              },
              {
                "code": 228,
                "name": "LABIOD MEDJADJA",
                "name_en": "LABIOD MEDJADJA",
                "name_ar": "الأبيض مجاجة"
              }
            ]
          },
          {
            "code": 212,
            "name": "BOUKADIR",
            "name_ar": "بوقادير",
            "name_en": "BOUKADIR",
            "baladyiats": [
              {
                "code": 208,
                "name": "SOBHA",
                "name_en": "SOBHA",
                "name_ar": "الصبحة"
              },
              {
                "code": 212,
                "name": "BOUKADIR",
                "name_en": "BOUKADIR",
                "name_ar": "بوقادير"
              },
              {
                "code": 221,
                "name": "OUED SLY",
                "name_en": "OUED SLY",
                "name_ar": "وادي سلي"
              }
            ]
          },
          {
            "code": 220,
            "name": "ZEBOUDJA",
            "name_ar": "الزبوجة",
            "name_en": "ZEBOUDJA",
            "baladyiats": [
              {
                "code": 203,
                "name": "BENAIRIA",
                "name_en": "BENAIRIA",
                "name_ar": "بنايرية"
              },
              {
                "code": 220,
                "name": "ZEBOUDJA",
                "name_en": "ZEBOUDJA",
                "name_ar": "الزبوجة"
              },
              {
                "code": 231,
                "name": "BOUZEGHAIA",
                "name_en": "BOUZEGHAIA",
                "name_ar": "بوزغاية"
              }
            ]
          },
          {
            "code": 222,
            "name": "ABOU EL HASSANE",
            "name_ar": "أبو الحسن",
            "name_en": "ABOU EL HASSANE",
            "baladyiats": [
              {
                "code": 205,
                "name": "TADJENA",
                "name_en": "TADJENA",
                "name_ar": "تاجنة"
              },
              {
                "code": 214,
                "name": "TALASSA",
                "name_en": "TALASSA",
                "name_ar": "تلعصة"
              },
              {
                "code": 222,
                "name": "ABOU EL HASSANE",
                "name_en": "ABOU EL HASSANE",
                "name_ar": "أبو الحسن"
              }
            ]
          },
          {
            "code": 223,
            "name": "EL MARSA",
            "name_ar": "المرسى",
            "name_en": "EL MARSA",
            "baladyiats": [
              {
                "code": 223,
                "name": "EL MARSA",
                "name_en": "EL MARSA",
                "name_ar": "المرسى"
              },
              {
                "code": 226,
                "name": "MOUSSADEK",
                "name_en": "MOUSSADEK",
                "name_ar": "مصدق"
              }
            ]
          },
          {
            "code": 229,
            "name": "OUED FODDA",
            "name_ar": "وادي الفضة",
            "name_en": "OUED FODDA",
            "baladyiats": [
              {
                "code": 213,
                "name": "BENI RACHED",
                "name_en": "BENI RACHED",
                "name_ar": "بني راشد"
              },
              {
                "code": 218,
                "name": "OULED ABBES",
                "name_en": "OULED ABBES",
                "name_ar": "أولاد عباس"
              },
              {
                "code": 229,
                "name": "OUED FODDA",
                "name_en": "OUED FODDA",
                "name_ar": "وادي الفضة"
              }
            ]
          },
          {
            "code": 230,
            "name": "OULED BEN ABDELKADER",
            "name_ar": "أولاد بن عبد القادر",
            "name_en": "OULED BEN ABDELKADER",
            "baladyiats": [
              {
                "code": 227,
                "name": "EL HADJADJ",
                "name_en": "EL HADJADJ",
                "name_ar": "الحجاج"
              },
              {
                "code": 230,
                "name": "OULED BEN ABDELKADER",
                "name_en": "OULED BEN ABDELKADER",
                "name_ar": "أولاد بن عبد القادر"
              }
            ]
          },
          {
            "code": 232,
            "name": "AIN MERANE",
            "name_ar": "عين مران",
            "name_en": "AIN MERANE",
            "baladyiats": [
              {
                "code": 215,
                "name": "HERENFA",
                "name_en": "HERENFA",
                "name_ar": "الهرانفة"
              },
              {
                "code": 232,
                "name": "AIN MERANE",
                "name_en": "AIN MERANE",
                "name_ar": "عين مران"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          27,
          48,
          7,
          38,
          44,
          42
        ]
      },
      {
        "mattricule": 3,
        "name_ar": "الأغواط",
        "name_ber": "ⵍⴻⵖⵡⴰⵟ",
        "name_en": "Laghouat",
        "name": "Laghouat",
        "phoneCodes": [
          29
        ],
        "postalCodes": [
          3000,
          3001,
          3002,
          3003,
          3004,
          3005,
          3006,
          3007,
          3008,
          3009,
          3010,
          3011,
          3012,
          3013,
          3014,
          3015,
          3016,
          3017,
          3018,
          3019,
          3020,
          3021,
          3022,
          3023,
          3024,
          3025,
          3026,
          3027,
          3028,
          3030,
          3031,
          3032,
          3033,
          3034,
          3035,
          3036,
          3037,
          3038,
          3040,
          3041,
          3042,
          3043,
          3044,
          3046,
          3047,
          3048,
          3049,
          3050,
          3051,
          3052,
          3053,
          3054
        ],
        "dairats": [
          {
            "code": 301,
            "name": "LAGHOUAT",
            "name_ar": "الأغواط",
            "name_en": "LAGHOUAT",
            "baladyiats": [
              {
                "code": 301,
                "name": "LAGHOUAT",
                "name_en": "LAGHOUAT",
                "name_ar": "الأغواط"
              }
            ]
          },
          {
            "code": 302,
            "name": "KSAR EL HIRANE",
            "name_ar": "قصر الحيران",
            "name_en": "KSAR EL HIRANE",
            "baladyiats": [
              {
                "code": 302,
                "name": "KSAR EL HIRANE",
                "name_en": "KSAR EL HIRANE",
                "name_ar": "قصر الحيران"
              },
              {
                "code": 303,
                "name": "BENACER BENCHOHRA",
                "name_en": "BENACER BENCHOHRA",
                "name_ar": "بن ناصر بن شهرة"
              }
            ]
          },
          {
            "code": 304,
            "name": "SIDI MAKHLOUF",
            "name_ar": "سيدي مخلوف",
            "name_en": "SIDI MAKHLOUF",
            "baladyiats": [
              {
                "code": 304,
                "name": "SIDI MAKHLOUF",
                "name_en": "SIDI MAKHLOUF",
                "name_ar": "سيدي مخلوف"
              },
              {
                "code": 320,
                "name": "EL ASSAFIA",
                "name_en": "EL ASSAFIA",
                "name_ar": "العسافية"
              }
            ]
          },
          {
            "code": 306,
            "name": "HASSI R'MEL",
            "name_ar": "حاسي الرمل",
            "name_en": "HASSI R'MEL",
            "baladyiats": [
              {
                "code": 305,
                "name": "HASSI DELAA",
                "name_en": "HASSI DELAA",
                "name_ar": "حاسي الدلاعة"
              },
              {
                "code": 306,
                "name": "HASSI R'MEL",
                "name_en": "HASSI R'MEL",
                "name_ar": "حاسي الرمل"
              }
            ]
          },
          {
            "code": 307,
            "name": "AIN MADHI",
            "name_ar": "عين ماضي",
            "name_en": "AIN MADHI",
            "baladyiats": [
              {
                "code": 307,
                "name": "AIN MADHI",
                "name_en": "AIN MADHI",
                "name_ar": "عين ماضي"
              },
              {
                "code": 308,
                "name": "TADJEMOUT",
                "name_en": "TADJEMOUT",
                "name_ar": "تاجموت"
              },
              {
                "code": 309,
                "name": "KHENEG",
                "name_en": "KHENEG",
                "name_ar": "الخنق"
              },
              {
                "code": 318,
                "name": "TADJROUNA",
                "name_en": "TADJROUNA",
                "name_ar": "تاجرونة"
              },
              {
                "code": 323,
                "name": "EL HAOUAITA",
                "name_en": "EL HAOUAITA",
                "name_ar": "الحويطة"
              }
            ]
          },
          {
            "code": 310,
            "name": "GUELTAT SIDI SAAD",
            "name_ar": "قتلة سيدي سعيد",
            "name_en": "GUELTAT SIDI SAAD",
            "baladyiats": [
              {
                "code": 310,
                "name": "GUELTAT SIDI SAAD",
                "name_en": "GUELTAT SIDI SAAD",
                "name_ar": "قلتة سيدي سعد"
              },
              {
                "code": 311,
                "name": "AIN SIDI ALI",
                "name_en": "AIN SIDI ALI",
                "name_ar": "عين سيدي علي"
              },
              {
                "code": 312,
                "name": "EL BEIDHA",
                "name_en": "EL BEIDHA",
                "name_ar": "البيضاء"
              }
            ]
          },
          {
            "code": 313,
            "name": "BRIDA",
            "name_ar": "بريدة",
            "name_en": "BRIDA",
            "baladyiats": [
              {
                "code": 313,
                "name": "BRIDA",
                "name_en": "BRIDA",
                "name_ar": "بريدة"
              },
              {
                "code": 315,
                "name": "HADJ MECHRI",
                "name_en": "HADJ MECHRI",
                "name_ar": "الحاج مشري"
              },
              {
                "code": 317,
                "name": "TAOUIALA",
                "name_en": "TAOUIALA",
                "name_ar": "تاويالة"
              }
            ]
          },
          {
            "code": 314,
            "name": "EL GHICHA",
            "name_ar": "الغيشة",
            "name_en": "EL GHICHA",
            "baladyiats": [
              {
                "code": 314,
                "name": "EL GHICHA",
                "name_en": "EL GHICHA",
                "name_ar": "الغيشة"
              }
            ]
          },
          {
            "code": 319,
            "name": "AFLOU",
            "name_ar": "أفلو",
            "name_en": "AFLOU",
            "baladyiats": [
              {
                "code": 316,
                "name": "SEBGAG",
                "name_en": "SEBGAG",
                "name_ar": "سبقاق"
              },
              {
                "code": 319,
                "name": "AFLOU",
                "name_en": "AFLOU",
                "name_ar": "أفلو"
              },
              {
                "code": 324,
                "name": "SIDI BOUZID",
                "name_en": "SIDI BOUZID",
                "name_ar": "سيدي بوزيد"
              }
            ]
          },
          {
            "code": 321,
            "name": "OUED MORRA",
            "name_ar": "وادي مرة",
            "name_en": "OUED MORRA",
            "baladyiats": [
              {
                "code": 321,
                "name": "OUED MORRA",
                "name_en": "OUED MORRA",
                "name_ar": "وادي مرة"
              },
              {
                "code": 322,
                "name": "OUED M'ZI",
                "name_en": "OUED M'ZI",
                "name_ar": "وادي مزي"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          32,
          47,
          17,
          14
        ]
      },
      {
        "mattricule": 4,
        "name_ar": "أم البواقي",
        "name_ber": "ⵓⵎⵍⴻⴱⵡⴰⵖⵉ",
        "name_en": "Oum El Bouaghi",
        "name": "Oum El Bouaghi",
        "phoneCodes": [
          32
        ],
        "postalCodes": [
          4000,
          4001,
          4002,
          4003,
          4004,
          4005,
          4006,
          4007,
          4008,
          4009,
          4010,
          4011,
          4012,
          4013,
          4014,
          4015,
          4016,
          4017,
          4018,
          4019,
          4020,
          4021,
          4022,
          4023,
          4024,
          4025,
          4026,
          4027,
          4028,
          4029,
          4030,
          4032,
          4033,
          4034,
          4035,
          4037,
          4038,
          4039,
          4040,
          4041,
          4042,
          4043,
          4044,
          4045,
          4046,
          4047,
          4048,
          4049,
          4050,
          4051,
          4052,
          4053,
          4054,
          4055,
          4056,
          4057,
          4058,
          4059,
          4060,
          4061,
          4062,
          4063,
          4064,
          4065,
          4066,
          4067,
          4068
        ],
        "dairats": [
          {
            "code": 401,
            "name": "OUM EL BOUAGHI",
            "name_ar": "أم البواقي",
            "name_en": "OUM EL BOUAGHI",
            "baladyiats": [
              {
                "code": 401,
                "name": "OUM EL BOUAGHI",
                "name_en": "OUM EL BOUAGHI",
                "name_ar": "أم البواقي"
              },
              {
                "code": 427,
                "name": "AIN ZITOUN",
                "name_en": "AIN ZITOUN",
                "name_ar": "عين الزيتون"
              }
            ]
          },
          {
            "code": 402,
            "name": "AIN BEIDA",
            "name_ar": "عين البيضاء",
            "name_en": "AIN BEIDA",
            "baladyiats": [
              {
                "code": 402,
                "name": "AIN BEIDA",
                "name_en": "AIN BEIDA",
                "name_ar": "عين البيضاء"
              },
              {
                "code": 409,
                "name": "BERRICHE",
                "name_en": "BERRICHE",
                "name_ar": "بريش"
              },
              {
                "code": 418,
                "name": "ZORG",
                "name_en": "ZORG",
                "name_ar": "الزرق"
              }
            ]
          },
          {
            "code": 403,
            "name": "AIN M'LILA",
            "name_ar": "عين مليلة",
            "name_en": "AIN M'LILA",
            "baladyiats": [
              {
                "code": 403,
                "name": "AIN M'LILA",
                "name_en": "AIN M'LILA",
                "name_ar": "عين مليلة"
              },
              {
                "code": 410,
                "name": "OULED HAMLA",
                "name_en": "OULED HAMLA",
                "name_ar": "أولاد حملة"
              },
              {
                "code": 428,
                "name": "OULED GACEM",
                "name_en": "OULED GACEM",
                "name_ar": "أولاد قاسم"
              }
            ]
          },
          {
            "code": 406,
            "name": "SIGUS",
            "name_ar": "سيقوس",
            "name_en": "SIGUS",
            "baladyiats": [
              {
                "code": 405,
                "name": "EL AMIRIA",
                "name_en": "EL AMIRIA",
                "name_ar": "العامرية"
              },
              {
                "code": 406,
                "name": "SIGUS",
                "name_en": "SIGUS",
                "name_ar": "سيقوس"
              }
            ]
          },
          {
            "code": 408,
            "name": "AIN BABOUCHE",
            "name_ar": "عين ببوش",
            "name_en": "AIN BABOUCHE",
            "baladyiats": [
              {
                "code": 408,
                "name": "AIN BABOUCHE",
                "name_en": "AIN BABOUCHE",
                "name_ar": "عين ببوش"
              },
              {
                "code": 415,
                "name": "AIN DISS",
                "name_en": "AIN DISS",
                "name_ar": "عين الديس"
              }
            ]
          },
          {
            "code": 411,
            "name": "DHALAA",
            "name_ar": "الضلعة",
            "name_en": "DHALAA",
            "baladyiats": [
              {
                "code": 411,
                "name": "DHALAA",
                "name_en": "DHALAA",
                "name_ar": "الضلعة"
              },
              {
                "code": 414,
                "name": "EL DJAZIA",
                "name_en": "EL DJAZIA",
                "name_ar": "الجازية"
              }
            ]
          },
          {
            "code": 412,
            "name": "AIN KERCHA",
            "name_ar": "عين كرشة",
            "name_en": "AIN KERCHA",
            "baladyiats": [
              {
                "code": 412,
                "name": "AIN KERCHA",
                "name_en": "AIN KERCHA",
                "name_ar": "عين كرشة"
              },
              {
                "code": 413,
                "name": "HANCHIR TOUMGHANI",
                "name_en": "HANCHIR TOUMGHANI",
                "name_ar": "هنشير تومغني"
              },
              {
                "code": 429,
                "name": "EL HARMILIA",
                "name_en": "EL HARMILIA",
                "name_ar": "الحرملية"
              }
            ]
          },
          {
            "code": 416,
            "name": "F'KIRINA",
            "name_ar": "فكيرينة",
            "name_en": "F'KIRINA",
            "baladyiats": [
              {
                "code": 416,
                "name": "FKIRINA",
                "name_en": "FKIRINA",
                "name_ar": "فكيرينة"
              },
              {
                "code": 423,
                "name": "OUED NINI",
                "name_en": "OUED NINI",
                "name_ar": "وادي نيني"
              }
            ]
          },
          {
            "code": 417,
            "name": "SOUK NAAMANE",
            "name_ar": "سوق نعمان",
            "name_en": "SOUK NAAMANE",
            "baladyiats": [
              {
                "code": 417,
                "name": "SOUK NAAMANE",
                "name_en": "SOUK NAAMANE",
                "name_ar": "سوق نعمان"
              },
              {
                "code": 420,
                "name": "OULED ZOUAI",
                "name_en": "OULED ZOUAI",
                "name_ar": "أولاد زواي"
              },
              {
                "code": 421,
                "name": "BIR CHOUHADA",
                "name_en": "BIR CHOUHADA",
                "name_ar": "بئر الشهداء"
              }
            ]
          },
          {
            "code": 422,
            "name": "KSAR SBAHI",
            "name_ar": "قصر الصباحي",
            "name_en": "KSAR SBAHI",
            "baladyiats": [
              {
                "code": 422,
                "name": "KSAR SBAHI",
                "name_en": "KSAR SBAHI",
                "name_ar": "قصر الصباحي"
              }
            ]
          },
          {
            "code": 424,
            "name": "MESKIANA",
            "name_ar": "مسكيانة",
            "name_en": "MESKIANA",
            "baladyiats": [
              {
                "code": 404,
                "name": "BEHIR CHERGUI",
                "name_en": "BEHIR CHERGUI",
                "name_ar": "بحير الشرقي"
              },
              {
                "code": 407,
                "name": "EL BELALA",
                "name_en": "EL BELALA",
                "name_ar": "البلالة"
              },
              {
                "code": 424,
                "name": "MESKIANA",
                "name_en": "MESKIANA",
                "name_ar": "مسكيانة"
              },
              {
                "code": 426,
                "name": "RAHIA",
                "name_en": "RAHIA",
                "name_ar": "الرحية"
              }
            ]
          },
          {
            "code": 425,
            "name": "AIN FEKROUN",
            "name_ar": "عين فكرون",
            "name_en": "AIN FEKROUN",
            "baladyiats": [
              {
                "code": 419,
                "name": "EL FEDJOUDJ BOUGHRARA SA",
                "name_en": "EL FEDJOUDJ BOUGHRARA SA",
                "name_ar": "الفجوج بوغرارة سعودي"
              },
              {
                "code": 425,
                "name": "AIN FEKROUN",
                "name_en": "AIN FEKROUN",
                "name_ar": "عين فكرون"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          5,
          40,
          12,
          41,
          24,
          25,
          43
        ]
      },
      {
        "mattricule": 5,
        "name_ar": "باتنة",
        "name_ber": "ⵜⴱⴰⵜⴻⵏⵜ",
        "name_en": "Batna",
        "name": "Batna",
        "phoneCodes": [
          33
        ],
        "postalCodes": [
          5000,
          5001,
          5002,
          5003,
          5004,
          5005,
          5006,
          5007,
          5008,
          5009,
          5010,
          5011,
          5012,
          5013,
          5014,
          5015,
          5016,
          5017,
          5018,
          5019,
          5020,
          5021,
          5022,
          5023,
          5024,
          5025,
          5026,
          5027,
          5028,
          5029,
          5030,
          5031,
          5032,
          5033,
          5034,
          5035,
          5036,
          5037,
          5038,
          5039,
          5040,
          5041,
          5042,
          5043,
          5044,
          5045,
          5046,
          5047,
          5048,
          5049,
          5050,
          5051,
          5052,
          5053,
          5054,
          5055,
          5056,
          5057,
          5058,
          5059,
          5060,
          5061,
          5062,
          5063,
          5064,
          5065,
          5066,
          5067,
          5068,
          5069,
          5070,
          5071,
          5072,
          5073,
          5074,
          5075,
          5076,
          5077,
          5078,
          5079,
          5080,
          5081,
          5082,
          5083,
          5084,
          5085,
          5086,
          5087,
          5088,
          5089,
          5090,
          5091,
          5092,
          5093,
          5094,
          5095,
          5096,
          5097,
          5098,
          5099,
          5100,
          5101,
          5102,
          5103,
          5104,
          5105,
          5106,
          5107,
          5108,
          5109,
          5110,
          5111,
          5112,
          5113,
          5114,
          5115,
          5116,
          5117,
          5118,
          5119,
          5120,
          5121,
          5122,
          5123,
          5124,
          5125,
          5126,
          5127,
          5128,
          5129,
          5130,
          5131,
          5132,
          5133,
          5134,
          5135,
          5136,
          5137,
          5138,
          5139,
          5140,
          5141,
          5142,
          5143,
          5144
        ],
        "dairats": [
          {
            "code": 501,
            "name": "BATNA",
            "name_ar": "باتنة",
            "name_en": "BATNA",
            "baladyiats": [
              {
                "code": 501,
                "name": "BATNA",
                "name_en": "BATNA",
                "name_ar": "باتنة"
              },
              {
                "code": 523,
                "name": "FESDIS",
                "name_en": "FESDIS",
                "name_ar": "فسديس"
              },
              {
                "code": 537,
                "name": "OUED CHAABA",
                "name_en": "OUED CHAABA",
                "name_ar": "وادي الشعبة"
              }
            ]
          },
          {
            "code": 504,
            "name": "MEROUANA",
            "name_ar": "مروانة",
            "name_en": "MEROUANA",
            "baladyiats": [
              {
                "code": 504,
                "name": "MEROUANA",
                "name_en": "MEROUANA",
                "name_ar": "مروانة"
              },
              {
                "code": 528,
                "name": "KSAR BELLEZMA",
                "name_en": "KSAR BELLEZMA",
                "name_ar": "قصر بلزمة"
              },
              {
                "code": 533,
                "name": "OUED EL MA",
                "name_en": "OUED EL MA",
                "name_ar": "وادي الماء"
              },
              {
                "code": 546,
                "name": "HIDOUSSA",
                "name_en": "HIDOUSSA",
                "name_ar": "حيدوسة"
              }
            ]
          },
          {
            "code": 505,
            "name": "SERIANA",
            "name_ar": "سريانة",
            "name_en": "SERIANA",
            "baladyiats": [
              {
                "code": 505,
                "name": "SERIANA",
                "name_en": "SERIANA",
                "name_ar": "سريانة"
              },
              {
                "code": 554,
                "name": "ZANET EL BEIDA",
                "name_en": "ZANET EL BEIDA",
                "name_ar": "زانة البيضاء"
              },
              {
                "code": 558,
                "name": "LAZROU",
                "name_en": "LAZROU",
                "name_ar": "لازرو"
              }
            ]
          },
          {
            "code": 506,
            "name": "MENAA",
            "name_ar": "منعة",
            "name_en": "MENAA",
            "baladyiats": [
              {
                "code": 506,
                "name": "MENAA",
                "name_en": "MENAA",
                "name_ar": "منعة"
              },
              {
                "code": 521,
                "name": "TIGHARGHAR",
                "name_en": "TIGHARGHAR",
                "name_ar": "تغرغار"
              }
            ]
          },
          {
            "code": 507,
            "name": "EL MADHER",
            "name_ar": "المعذر",
            "name_en": "EL MADHER",
            "baladyiats": [
              {
                "code": 507,
                "name": "EL MADHER",
                "name_en": "EL MADHER",
                "name_ar": "المعذر"
              },
              {
                "code": 513,
                "name": "DJERMA",
                "name_en": "DJERMA",
                "name_ar": "جرمة"
              },
              {
                "code": 522,
                "name": "AIN YAGOUT",
                "name_en": "AIN YAGOUT",
                "name_ar": "عين ياقوت"
              },
              {
                "code": 559,
                "name": "BOUMIA",
                "name_en": "BOUMIA",
                "name_ar": "بومية"
              }
            ]
          },
          {
            "code": 508,
            "name": "TAZOULT",
            "name_ar": "تازولت",
            "name_en": "TAZOULT",
            "baladyiats": [
              {
                "code": 508,
                "name": "TAZOULT",
                "name_en": "TAZOULT",
                "name_ar": "تازولت"
              },
              {
                "code": 512,
                "name": "OUYOUN EL ASSAFIR",
                "name_en": "OUYOUN EL ASSAFIR",
                "name_ar": "عيون العصافير"
              }
            ]
          },
          {
            "code": 509,
            "name": "N'GAOUS",
            "name_ar": "نقاوس",
            "name_en": "N'GAOUS",
            "baladyiats": [
              {
                "code": 509,
                "name": "N GAOUS",
                "name_en": "N GAOUS",
                "name_ar": "نقاوس"
              },
              {
                "code": 524,
                "name": "SEFIANE",
                "name_en": "SEFIANE",
                "name_ar": "سفيان"
              },
              {
                "code": 541,
                "name": "BOUMAGUEUR",
                "name_en": "BOUMAGUEUR",
                "name_ar": "بومقر"
              }
            ]
          },
          {
            "code": 516,
            "name": "ARRIS",
            "name_ar": "أريس",
            "name_en": "ARRIS",
            "baladyiats": [
              {
                "code": 516,
                "name": "ARRIS",
                "name_en": "ARRIS",
                "name_ar": "أريس"
              },
              {
                "code": 526,
                "name": "TIGHANIMINE",
                "name_en": "TIGHANIMINE",
                "name_ar": "تيغانمين"
              }
            ]
          },
          {
            "code": 519,
            "name": "AIN DJASSER",
            "name_ar": "عين جاسر",
            "name_en": "AIN DJASSER",
            "baladyiats": [
              {
                "code": 519,
                "name": "AIN DJASSER",
                "name_en": "AIN DJASSER",
                "name_ar": "عين جاسر"
              },
              {
                "code": 557,
                "name": "EL HASSI",
                "name_en": "EL HASSI",
                "name_ar": "الحاسي"
              }
            ]
          },
          {
            "code": 529,
            "name": "SEGGANA",
            "name_ar": "سقانة",
            "name_en": "SEGGANA",
            "baladyiats": [
              {
                "code": 518,
                "name": "TILATOU",
                "name_en": "TILATOU",
                "name_ar": "تيلاطو"
              },
              {
                "code": 529,
                "name": "SEGGANA",
                "name_en": "SEGGANA",
                "name_ar": "سقانة"
              }
            ]
          },
          {
            "code": 530,
            "name": "ICHEMOUL",
            "name_ar": "إشمول",
            "name_en": "ICHEMOUL",
            "baladyiats": [
              {
                "code": 511,
                "name": "INOUGHISSEN",
                "name_en": "INOUGHISSEN",
                "name_ar": "إينوغيسن"
              },
              {
                "code": 530,
                "name": "ICHEMOUL",
                "name_en": "ICHEMOUL",
                "name_ar": "إشمول"
              },
              {
                "code": 531,
                "name": "FOUM TOUB",
                "name_en": "FOUM TOUB",
                "name_ar": "فم الطوب"
              }
            ]
          },
          {
            "code": 535,
            "name": "BOUZINA",
            "name_ar": "بوزينة",
            "name_en": "BOUZINA",
            "baladyiats": [
              {
                "code": 535,
                "name": "BOUZINA",
                "name_en": "BOUZINA",
                "name_ar": "بوزينة"
              },
              {
                "code": 561,
                "name": "LARBAA",
                "name_en": "LARBAA",
                "name_ar": "لارباع"
              }
            ]
          },
          {
            "code": 536,
            "name": "CHEMORA",
            "name_ar": "الشمرة",
            "name_en": "CHEMORA",
            "baladyiats": [
              {
                "code": 536,
                "name": "CHEMORA",
                "name_en": "CHEMORA",
                "name_ar": "الشمرة"
              },
              {
                "code": 560,
                "name": "BOULHILAT",
                "name_en": "BOULHILAT",
                "name_ar": "بولهيلات"
              }
            ]
          },
          {
            "code": 542,
            "name": "BARIKA",
            "name_ar": "بريكة",
            "name_en": "BARIKA",
            "baladyiats": [
              {
                "code": 514,
                "name": "BITAM",
                "name_en": "BITAM",
                "name_ar": "بيطام"
              },
              {
                "code": 542,
                "name": "BARIKA",
                "name_en": "BARIKA",
                "name_ar": "بريكة"
              },
              {
                "code": 555,
                "name": "M DOUKAL",
                "name_en": "M DOUKAL",
                "name_ar": "إمدوكل"
              }
            ]
          },
          {
            "code": 543,
            "name": "DJEZZAR",
            "name_ar": "الجزار",
            "name_en": "DJEZZAR",
            "baladyiats": [
              {
                "code": 515,
                "name": "AZIL ABEDELKADER",
                "name_en": "AZIL ABEDELKADER",
                "name_ar": "عزيل عبد القادر"
              },
              {
                "code": 543,
                "name": "DJEZZAR",
                "name_en": "DJEZZAR",
                "name_ar": "الجزار"
              },
              {
                "code": 556,
                "name": "OULED AMMAR",
                "name_en": "OULED AMMAR",
                "name_ar": "أولاد عمار"
              }
            ]
          },
          {
            "code": 544,
            "name": "TKOUT",
            "name_ar": "تكوت",
            "name_en": "TKOUT",
            "baladyiats": [
              {
                "code": 502,
                "name": "GHASSIRA",
                "name_en": "GHASSIRA",
                "name_ar": "غسيرة"
              },
              {
                "code": 517,
                "name": "KIMMEL",
                "name_en": "KIMMEL",
                "name_ar": "كيمل"
              },
              {
                "code": 544,
                "name": "T KOUT",
                "name_en": "T KOUT",
                "name_ar": "تكوت"
              }
            ]
          },
          {
            "code": 545,
            "name": "AIN TOUTA",
            "name_ar": "عين التوتة",
            "name_en": "AIN TOUTA",
            "baladyiats": [
              {
                "code": 503,
                "name": "MAAFA",
                "name_en": "MAAFA",
                "name_ar": "معافة"
              },
              {
                "code": 532,
                "name": "BENI FOUDHALA EL HAKANIA",
                "name_en": "BENI FOUDHALA EL HAKANIA",
                "name_ar": "بني فضالة الحقانية"
              },
              {
                "code": 540,
                "name": "OULED AOUF",
                "name_en": "OULED AOUF",
                "name_ar": "أولاد عوف"
              },
              {
                "code": 545,
                "name": "AIN TOUTA",
                "name_en": "AIN TOUTA",
                "name_ar": "عين التوتة"
              }
            ]
          },
          {
            "code": 547,
            "name": "THENIET EL ABED",
            "name_ar": "ثنية العابد",
            "name_en": "THENIET EL ABED",
            "baladyiats": [
              {
                "code": 547,
                "name": "TENIET EL ABED",
                "name_en": "TENIET EL ABED",
                "name_ar": "ثنية العابد"
              },
              {
                "code": 548,
                "name": "OUED TAGA",
                "name_en": "OUED TAGA",
                "name_ar": "وادي الطاقة"
              },
              {
                "code": 552,
                "name": "CHIR",
                "name_en": "CHIR",
                "name_ar": "شير"
              }
            ]
          },
          {
            "code": 550,
            "name": "TIMGAD",
            "name_ar": "تيمقاد",
            "name_en": "TIMGAD",
            "baladyiats": [
              {
                "code": 549,
                "name": "OULED FADEL",
                "name_en": "OULED FADEL",
                "name_ar": "أولاد فاضل"
              },
              {
                "code": 550,
                "name": "TIMGAD",
                "name_en": "TIMGAD",
                "name_ar": "تيمقاد"
              }
            ]
          },
          {
            "code": 551,
            "name": "RAS EL AIOUN",
            "name_ar": "رأس العيون",
            "name_en": "RAS EL AIOUN",
            "baladyiats": [
              {
                "code": 510,
                "name": "GUIGBA",
                "name_en": "GUIGBA",
                "name_ar": "القيقبة"
              },
              {
                "code": 520,
                "name": "OULED SELLEM",
                "name_en": "OULED SELLEM",
                "name_ar": "أولاد سلام"
              },
              {
                "code": 525,
                "name": "RAHBAT",
                "name_en": "RAHBAT",
                "name_ar": "الرحبات"
              },
              {
                "code": 534,
                "name": "TALKHAMT",
                "name_en": "TALKHAMT",
                "name_ar": "تالخمت"
              },
              {
                "code": 539,
                "name": "GOSBAT",
                "name_en": "GOSBAT",
                "name_ar": "القصبات"
              },
              {
                "code": 551,
                "name": "RAS EL AIOUN",
                "name_en": "RAS EL AIOUN",
                "name_ar": "رأس العيون"
              }
            ]
          },
          {
            "code": 553,
            "name": "OULED SI SLIMANE",
            "name_ar": "أولاد سي سليمان",
            "name_en": "OULED SI SLIMANE",
            "baladyiats": [
              {
                "code": 527,
                "name": "LEMCENE",
                "name_en": "LEMCENE",
                "name_ar": "لمسان"
              },
              {
                "code": 538,
                "name": "TAXLENT",
                "name_en": "TAXLENT",
                "name_ar": "تاكسلانت"
              },
              {
                "code": 553,
                "name": "OULED SI SLIMANE",
                "name_en": "OULED SI SLIMANE",
                "name_ar": "أولاد سي سليمان"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          28,
          7,
          40,
          4,
          43,
          19
        ]
      },
      {
        "mattricule": 6,
        "name_ar": "بجاية",
        "name_ber": "ⴲⴳⴰⵢⴻⵝ",
        "name_en": "Béjaïa",
        "name": "Béjaïa",
        "phoneCodes": [
          34
        ],
        "postalCodes": [
          6000,
          6001,
          6002,
          6003,
          6004,
          6005,
          6006,
          6007,
          6008,
          6009,
          6010,
          6011,
          6012,
          6013,
          6014,
          6015,
          6016,
          6017,
          6018,
          6019,
          6020,
          6021,
          6022,
          6023,
          6024,
          6025,
          6026,
          6027,
          6028,
          6029,
          6030,
          6031,
          6032,
          6033,
          6034,
          6035,
          6036,
          6037,
          6038,
          6039,
          6040,
          6041,
          6042,
          6043,
          6044,
          6045,
          6046,
          6047,
          6048,
          6049,
          6050,
          6051,
          6052,
          6053,
          6054,
          6055,
          6056,
          6057,
          6058,
          6059,
          6060,
          6061,
          6062,
          6063,
          6064,
          6065,
          6066,
          6067,
          6068,
          6069,
          6070,
          6071,
          6072,
          6073,
          6074,
          6075,
          6076,
          6077,
          6078,
          6079,
          6080,
          6081,
          6082,
          6083,
          6084,
          6085,
          6086,
          6087,
          6088,
          6089,
          6090,
          6091,
          6092,
          6093,
          6094,
          6095,
          6096,
          6097,
          6098,
          6099,
          6100,
          6101,
          6102,
          6103,
          6104,
          6106,
          6107,
          6108,
          6109,
          6110,
          6111,
          6112,
          6113,
          6114,
          6115,
          6116,
          6117,
          6118,
          6119,
          6120,
          6121,
          6122,
          6123,
          6124,
          6125,
          6126,
          6127,
          6128,
          6129,
          6130,
          6131,
          6132,
          6133,
          6134,
          6135,
          6136,
          6137,
          6138,
          6139,
          6140,
          6141,
          6142,
          6143,
          6144
        ],
        "dairats": [
          {
            "code": 601,
            "name": "BEJAIA",
            "name_ar": "بجاية",
            "name_en": "BEJAIA",
            "baladyiats": [
              {
                "code": 601,
                "name": "BEJAIA",
                "name_en": "BEJAIA",
                "name_ar": "بجاية"
              },
              {
                "code": 651,
                "name": "OUED GHIR",
                "name_en": "OUED GHIR",
                "name_ar": "وادي غير"
              }
            ]
          },
          {
            "code": 602,
            "name": "AMIZOUR",
            "name_ar": "أميزور",
            "name_en": "AMIZOUR",
            "baladyiats": [
              {
                "code": 602,
                "name": "AMIZOUR",
                "name_en": "AMIZOUR",
                "name_ar": "أميزور"
              },
              {
                "code": 603,
                "name": "FERAOUN",
                "name_en": "FERAOUN",
                "name_ar": "فرعون"
              },
              {
                "code": 612,
                "name": "SMAOUN",
                "name_en": "SMAOUN",
                "name_ar": "سمعون"
              },
              {
                "code": 623,
                "name": "BENI DJELLIL",
                "name_en": "BENI DJELLIL",
                "name_ar": "بني جليل"
              }
            ]
          },
          {
            "code": 607,
            "name": "TIMEZRIT",
            "name_ar": "تيمزريت",
            "name_en": "TIMEZRIT",
            "baladyiats": [
              {
                "code": 607,
                "name": "TIMEZRIT",
                "name_en": "TIMEZRIT",
                "name_ar": "تيمزريت"
              }
            ]
          },
          {
            "code": 608,
            "name": "SOUK EL TENINE",
            "name_ar": "سوق الإثنين",
            "name_en": "SOUK EL TENINE",
            "baladyiats": [
              {
                "code": 608,
                "name": "SOUK EL TENINE",
                "name_en": "SOUK EL TENINE",
                "name_ar": "سوق لإثنين"
              },
              {
                "code": 641,
                "name": "MELBOU",
                "name_en": "MELBOU",
                "name_ar": "مالبو"
              },
              {
                "code": 646,
                "name": "TAMRIDJET",
                "name_en": "TAMRIDJET",
                "name_ar": "تامريجت"
              }
            ]
          },
          {
            "code": 611,
            "name": "TICHY",
            "name_ar": "تيشي",
            "name_en": "TICHY",
            "baladyiats": [
              {
                "code": 611,
                "name": "TICHY",
                "name_en": "TICHY",
                "name_ar": "تيشي"
              },
              {
                "code": 633,
                "name": "TALA HAMZA",
                "name_en": "TALA HAMZA",
                "name_ar": "تالة حمزة"
              },
              {
                "code": 648,
                "name": "BOUKHELIFA",
                "name_en": "BOUKHELIFA",
                "name_ar": "بوخليفة"
              }
            ]
          },
          {
            "code": 617,
            "name": "IGHIL ALI",
            "name_ar": "إغيل علي",
            "name_en": "IGHIL ALI",
            "baladyiats": [
              {
                "code": 617,
                "name": "IGHIL-ALI",
                "name_en": "IGHIL-ALI",
                "name_ar": "إغيل علي"
              },
              {
                "code": 628,
                "name": "AIT R'ZINE",
                "name_en": "AIT R'ZINE",
                "name_ar": "أيت رزين"
              }
            ]
          },
          {
            "code": 620,
            "name": "DARGUINA",
            "name_ar": "درقينة",
            "name_en": "DARGUINA",
            "baladyiats": [
              {
                "code": 620,
                "name": "DARGUINA",
                "name_en": "DARGUINA",
                "name_ar": "درقينة"
              },
              {
                "code": 631,
                "name": "TASKRIOUT",
                "name_en": "TASKRIOUT",
                "name_ar": "تاسكريوت"
              },
              {
                "code": 647,
                "name": "AIT-SMAIL",
                "name_en": "AIT-SMAIL",
                "name_ar": "أيت إسماعيل"
              }
            ]
          },
          {
            "code": 622,
            "name": "AOKAS",
            "name_ar": "أوقاس",
            "name_en": "AOKAS",
            "baladyiats": [
              {
                "code": 622,
                "name": "AOKAS",
                "name_en": "AOKAS",
                "name_ar": "أوقاس"
              },
              {
                "code": 649,
                "name": "TIZI-N'BERBER",
                "name_en": "TIZI-N'BERBER",
                "name_ar": "تيزي نبربر"
              }
            ]
          },
          {
            "code": 624,
            "name": "ADEKAR",
            "name_ar": "أدكار",
            "name_en": "ADEKAR",
            "baladyiats": [
              {
                "code": 604,
                "name": "TAOURIT IGHIL",
                "name_en": "TAOURIT IGHIL",
                "name_ar": "تاوريرت إغيل"
              },
              {
                "code": 624,
                "name": "ADEKAR",
                "name_en": "ADEKAR",
                "name_ar": "أدكار"
              },
              {
                "code": 635,
                "name": "BENI K'SILA",
                "name_en": "BENI K'SILA",
                "name_ar": "بني كسيلة"
              }
            ]
          },
          {
            "code": 625,
            "name": "AKBOU",
            "name_ar": "أقبو",
            "name_en": "AKBOU",
            "baladyiats": [
              {
                "code": 605,
                "name": "CHELLATA",
                "name_en": "CHELLATA",
                "name_ar": "شلاطة"
              },
              {
                "code": 606,
                "name": "TAMOKRA",
                "name_en": "TAMOKRA",
                "name_ar": "تامقرة"
              },
              {
                "code": 615,
                "name": "IGHRAM",
                "name_en": "IGHRAM",
                "name_ar": "اغرم"
              },
              {
                "code": 625,
                "name": "AKBOU",
                "name_en": "AKBOU",
                "name_ar": "أقبو"
              }
            ]
          },
          {
            "code": 626,
            "name": "SEDDOUK",
            "name_ar": "صدوق",
            "name_en": "SEDDOUK",
            "baladyiats": [
              {
                "code": 609,
                "name": "M'CISNA",
                "name_en": "M'CISNA",
                "name_ar": "مسيسنة"
              },
              {
                "code": 616,
                "name": "AMALOU",
                "name_en": "AMALOU",
                "name_ar": "أمالو"
              },
              {
                "code": 626,
                "name": "SEDDOUK",
                "name_en": "SEDDOUK",
                "name_ar": "صدوق"
              },
              {
                "code": 637,
                "name": "BOUHAMZA",
                "name_en": "BOUHAMZA",
                "name_ar": "بوحمزة"
              }
            ]
          },
          {
            "code": 627,
            "name": "TAZMALT",
            "name_ar": "تازملت",
            "name_en": "TAZMALT",
            "baladyiats": [
              {
                "code": 627,
                "name": "TAZMALT",
                "name_en": "TAZMALT",
                "name_ar": "تازمالت"
              },
              {
                "code": 638,
                "name": "BENI-MALLIKECHE",
                "name_en": "BENI-MALLIKECHE",
                "name_ar": "بني مليكش"
              },
              {
                "code": 652,
                "name": "BOUDJELLIL",
                "name_en": "BOUDJELLIL",
                "name_ar": "بو جليل"
              }
            ]
          },
          {
            "code": 629,
            "name": "CHEMINI",
            "name_ar": "شميني",
            "name_en": "CHEMINI",
            "baladyiats": [
              {
                "code": 629,
                "name": "CHEMINI",
                "name_en": "CHEMINI",
                "name_ar": "شميني"
              },
              {
                "code": 630,
                "name": "SOUK OUFELLA",
                "name_en": "SOUK OUFELLA",
                "name_ar": "سوق اوفلا"
              },
              {
                "code": 632,
                "name": "TIBANE",
                "name_en": "TIBANE",
                "name_ar": "طيبان"
              },
              {
                "code": 642,
                "name": "AKFADOU",
                "name_en": "AKFADOU",
                "name_ar": "أكفادو"
              }
            ]
          },
          {
            "code": 634,
            "name": "BARBACHA",
            "name_ar": "برباشة",
            "name_en": "BARBACHA",
            "baladyiats": [
              {
                "code": 613,
                "name": "KENDIRA",
                "name_en": "KENDIRA",
                "name_ar": "كنديرة"
              },
              {
                "code": 634,
                "name": "BARBACHA",
                "name_en": "BARBACHA",
                "name_ar": "برباشة"
              }
            ]
          },
          {
            "code": 636,
            "name": "IFRI OUZELLAGUENE",
            "name_ar": "إفري أوزلاقن",
            "name_en": "IFRI OUZELLAGUENE",
            "baladyiats": [
              {
                "code": 636,
                "name": "OUZELLAGUEN",
                "name_en": "OUZELLAGUEN",
                "name_ar": "أوزلاقن"
              }
            ]
          },
          {
            "code": 639,
            "name": "SIDI AICH",
            "name_ar": "سيدي عيش",
            "name_en": "SIDI AICH",
            "baladyiats": [
              {
                "code": 610,
                "name": "TINEBDAR",
                "name_en": "TINEBDAR",
                "name_ar": "تينبدار"
              },
              {
                "code": 614,
                "name": "TIFRA",
                "name_en": "TIFRA",
                "name_ar": "تيفرة"
              },
              {
                "code": 621,
                "name": "SIDI AYAD",
                "name_en": "SIDI AYAD",
                "name_ar": "سيدي عياد"
              },
              {
                "code": 639,
                "name": "SIDI-AICH",
                "name_en": "SIDI-AICH",
                "name_ar": "سيدي عيش"
              },
              {
                "code": 643,
                "name": "LEFLAYE",
                "name_en": "LEFLAYE",
                "name_ar": "الفلاي"
              }
            ]
          },
          {
            "code": 640,
            "name": "EL KSEUR",
            "name_ar": "القصر",
            "name_en": "EL KSEUR",
            "baladyiats": [
              {
                "code": 618,
                "name": "FENAIA IL MATEN",
                "name_en": "FENAIA IL MATEN",
                "name_ar": "فناية الماثن"
              },
              {
                "code": 619,
                "name": "TOUDJA",
                "name_en": "TOUDJA",
                "name_ar": "توجة"
              },
              {
                "code": 640,
                "name": "EL KSEUR",
                "name_en": "EL KSEUR",
                "name_ar": "القصر"
              }
            ]
          },
          {
            "code": 644,
            "name": "KHERRATA",
            "name_ar": "خراطة",
            "name_en": "KHERRATA",
            "baladyiats": [
              {
                "code": 644,
                "name": "KHERRATA",
                "name_en": "KHERRATA",
                "name_ar": "خراطة"
              },
              {
                "code": 645,
                "name": "DRA EL CAID",
                "name_en": "DRA EL CAID",
                "name_ar": "ذراع القايد"
              }
            ]
          },
          {
            "code": 650,
            "name": "BENI MAOUCHE",
            "name_ar": "بني معوش",
            "name_en": "BENI MAOUCHE",
            "baladyiats": [
              {
                "code": 650,
                "name": "BENIMAOUCHE",
                "name_en": "BENIMAOUCHE",
                "name_ar": "بني معوش"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          15,
          10,
          34,
          19,
          18
        ]
      },
      {
        "mattricule": 7,
        "name_ar": "بسكرة",
        "name_ber": "ⴱⴻⵙⴽⵔⴰ",
        "name_en": "Biskra",
        "name": "Biskra",
        "phoneCodes": [
          33
        ],
        "postalCodes": [
          7000,
          7001,
          7002,
          7003,
          7004,
          7005,
          7006,
          7007,
          7008,
          7009,
          7010,
          7011,
          7012,
          7013,
          7014,
          7015,
          7016,
          7017,
          7018,
          7019,
          7020,
          7021,
          7022,
          7023,
          7024,
          7025,
          7026,
          7027,
          7028,
          7029,
          7030,
          7031,
          7032,
          7033,
          7034,
          7035,
          7036,
          7037,
          7038,
          7039,
          7040,
          7041,
          7042,
          7043,
          7044,
          7045,
          7046,
          7047,
          7048,
          7049,
          7050,
          7051,
          7052,
          7053,
          7054,
          7055,
          7056,
          7057,
          7058,
          7059,
          7060,
          7061,
          7062,
          7063,
          7064,
          7065,
          7066,
          7067,
          7068,
          7069,
          7070,
          7071,
          7072,
          7073,
          7074,
          7075,
          7076,
          7077,
          7078,
          7079,
          7080,
          7081,
          7082,
          7083,
          7084,
          7085,
          7086,
          7087,
          7088,
          7089,
          7090,
          7091,
          7092,
          7093,
          7094,
          7095
        ],
        "dairats": [
          {
            "code": 701,
            "name": "BISKRA",
            "name_ar": "بسكرة",
            "name_en": "BISKRA",
            "baladyiats": [
              {
                "code": 701,
                "name": "BISKRA",
                "name_en": "BISKRA",
                "name_ar": "بسكرة"
              },
              {
                "code": 732,
                "name": "EL HADJAB",
                "name_en": "EL HADJAB",
                "name_ar": "الحاجب"
              }
            ]
          },
          {
            "code": 705,
            "name": "OULED DJELLAL",
            "name_ar": "أولاد جلال",
            "name_en": "OULED DJELLAL",
            "baladyiats": [
              {
                "code": 705,
                "name": "OULED DJELLAL",
                "name_en": "OULED DJELLAL",
                "name_ar": "أولاد جلال"
              },
              {
                "code": 709,
                "name": "DOUCEN",
                "name_en": "DOUCEN",
                "name_ar": "الدوسن"
              },
              {
                "code": 710,
                "name": "CHAIBA",
                "name_en": "CHAIBA",
                "name_ar": "الشعيبة"
              }
            ]
          },
          {
            "code": 708,
            "name": "SIDI KHALED",
            "name_ar": "سيدي  خالد",
            "name_en": "SIDI KHALED",
            "baladyiats": [
              {
                "code": 706,
                "name": "RAS EL MIAD",
                "name_en": "RAS EL MIAD",
                "name_ar": "رأس الميعاد"
              },
              {
                "code": 707,
                "name": "BESBES",
                "name_en": "BESBES",
                "name_ar": "بسباس"
              },
              {
                "code": 708,
                "name": "SIDI KHALED",
                "name_en": "SIDI KHALED",
                "name_ar": "سيدي  خالد"
              }
            ]
          },
          {
            "code": 711,
            "name": "SIDI OKBA",
            "name_ar": "سيدي عقبة",
            "name_en": "SIDI OKBA",
            "baladyiats": [
              {
                "code": 704,
                "name": "CHETMA",
                "name_en": "CHETMA",
                "name_ar": "شتمة"
              },
              {
                "code": 711,
                "name": "SIDI OKBA",
                "name_en": "SIDI OKBA",
                "name_ar": "سيدي عقبة"
              },
              {
                "code": 713,
                "name": "EL HAOUCH",
                "name_en": "EL HAOUCH",
                "name_ar": "الحوش"
              },
              {
                "code": 714,
                "name": "AIN NAGA",
                "name_en": "AIN NAGA",
                "name_ar": "عين الناقة"
              }
            ]
          },
          {
            "code": 712,
            "name": "MECHOUNECHE",
            "name_ar": "مشونش",
            "name_en": "MECHOUNECHE",
            "baladyiats": [
              {
                "code": 712,
                "name": "M'CHOUNECHE",
                "name_en": "M'CHOUNECHE",
                "name_ar": "مشونش"
              }
            ]
          },
          {
            "code": 715,
            "name": "ZERIBET EL OUED",
            "name_ar": "زريبة الوادي",
            "name_en": "ZERIBET EL OUED",
            "baladyiats": [
              {
                "code": 715,
                "name": "ZERIBET EL OUED",
                "name_en": "ZERIBET EL OUED",
                "name_ar": "زريبة الوادي"
              },
              {
                "code": 716,
                "name": "EL FEIDH",
                "name_en": "EL FEIDH",
                "name_ar": "الفيض"
              },
              {
                "code": 728,
                "name": "MEZIRAA",
                "name_en": "MEZIRAA",
                "name_ar": "المزيرعة"
              },
              {
                "code": 733,
                "name": "KHENGUET SIDI NADJI",
                "name_en": "KHENGUET SIDI NADJI",
                "name_ar": "خنقة سيدي ناجي"
              }
            ]
          },
          {
            "code": 717,
            "name": "EL KANTARA",
            "name_ar": "القنطرة",
            "name_en": "EL KANTARA",
            "baladyiats": [
              {
                "code": 717,
                "name": "EL KANTARA",
                "name_en": "EL KANTARA",
                "name_ar": "القنطرة"
              },
              {
                "code": 718,
                "name": "AIN ZAATOUT",
                "name_en": "AIN ZAATOUT",
                "name_ar": "عين زعطوط"
              }
            ]
          },
          {
            "code": 719,
            "name": "EL OUTAYA",
            "name_ar": "الوطاية",
            "name_en": "EL OUTAYA",
            "baladyiats": [
              {
                "code": 719,
                "name": "EL OUTAYA",
                "name_en": "EL OUTAYA",
                "name_ar": "الوطاية"
              }
            ]
          },
          {
            "code": 720,
            "name": "DJEMORAH",
            "name_ar": "جمورة",
            "name_en": "DJEMORAH",
            "baladyiats": [
              {
                "code": 703,
                "name": "BRANIS",
                "name_en": "BRANIS",
                "name_ar": "برانيس"
              },
              {
                "code": 720,
                "name": "DJEMORAH",
                "name_en": "DJEMORAH",
                "name_ar": "جمورة"
              }
            ]
          },
          {
            "code": 721,
            "name": "TOLGA",
            "name_ar": "طولقة",
            "name_en": "TOLGA",
            "baladyiats": [
              {
                "code": 721,
                "name": "TOLGA",
                "name_en": "TOLGA",
                "name_ar": "طولقة"
              },
              {
                "code": 723,
                "name": "LICHANA",
                "name_en": "LICHANA",
                "name_ar": "ليشانة"
              },
              {
                "code": 727,
                "name": "BORDJ BEN AZZOUZ",
                "name_en": "BORDJ BEN AZZOUZ",
                "name_ar": "برج بن عزوز"
              },
              {
                "code": 729,
                "name": "BOUCHAKROUN",
                "name_en": "BOUCHAKROUN",
                "name_ar": "بوشقرون"
              }
            ]
          },
          {
            "code": 724,
            "name": "OURLAL",
            "name_ar": "أورلال",
            "name_en": "OURLAL",
            "baladyiats": [
              {
                "code": 702,
                "name": "OUMACHE",
                "name_en": "OUMACHE",
                "name_ar": "أوماش"
              },
              {
                "code": 722,
                "name": "LIOUA",
                "name_en": "LIOUA",
                "name_ar": "ليوة"
              },
              {
                "code": 724,
                "name": "OURLAL",
                "name_en": "OURLAL",
                "name_ar": "أورلال"
              },
              {
                "code": 725,
                "name": "M'LILI",
                "name_en": "M'LILI",
                "name_ar": "مليلي"
              },
              {
                "code": 730,
                "name": "MEKHADMA",
                "name_en": "MEKHADMA",
                "name_ar": "مخادمة"
              }
            ]
          },
          {
            "code": 726,
            "name": "FOUGHALA",
            "name_ar": "فوغالة",
            "name_en": "FOUGHALA",
            "baladyiats": [
              {
                "code": 726,
                "name": "FOUGHALA",
                "name_en": "FOUGHALA",
                "name_ar": "فوغالة"
              },
              {
                "code": 731,
                "name": "EL GHROUS",
                "name_en": "EL GHROUS",
                "name_ar": "الغروس"
              }
            ]
          },
          {
            "code": 7050,
            "name": "OULED DJELLAL (wilya déléguée)",
            "name_ar": "أولاد جلال (ولاية منتدبة)",
            "name_en": "OULED DJELLAL (wilya déléguée)"
          }
        ],
        "adjacentWilayas": [
          17,
          28,
          5,
          40,
          39,
          30
        ]
      },
      {
        "mattricule": 8,
        "name_ar": "بشار",
        "name_ber": "ⴱⴻⵛⵛⴰⵔ",
        "name_en": "Bechar",
        "name": "Bechar",
        "phoneCodes": [
          49
        ],
        "postalCodes": [
          8000,
          8001,
          8002,
          8003,
          8004,
          8005,
          8006,
          8007,
          8008,
          8009,
          8010,
          8011,
          8012,
          8013,
          8014,
          8015,
          8016,
          8017,
          8018,
          8019,
          8020,
          8021,
          8022,
          8023,
          8024,
          8025,
          8026,
          8027,
          8028,
          8029,
          8030,
          8031,
          8032,
          8033,
          8034,
          8035,
          8036,
          8037,
          8038,
          8039,
          8040,
          8041,
          8042,
          8043,
          8044,
          8045,
          8046,
          8047,
          8048,
          8049,
          8050,
          8051,
          8052,
          8053,
          8054,
          8055,
          8056,
          8057,
          8058,
          8059,
          8060,
          8061,
          8062
        ],
        "dairats": [
          {
            "code": 801,
            "name": "BECHAR",
            "name_ar": "بشار",
            "name_en": "BECHAR",
            "baladyiats": [
              {
                "code": 801,
                "name": "BECHAR",
                "name_en": "BECHAR",
                "name_ar": "بشار"
              }
            ]
          },
          {
            "code": 803,
            "name": "OULED KHODEIR",
            "name_ar": "أولاد خضير",
            "name_en": "OULED KHODEIR",
            "baladyiats": [
              {
                "code": 803,
                "name": "OULED-KHODEIR",
                "name_en": "OULED-KHODEIR",
                "name_ar": "أولاد خضير"
              },
              {
                "code": 819,
                "name": "KSABI",
                "name_en": "KSABI",
                "name_ar": "القصابي"
              }
            ]
          },
          {
            "code": 806,
            "name": "LAHMAR",
            "name_ar": "لحمر",
            "name_en": "LAHMAR",
            "baladyiats": [
              {
                "code": 806,
                "name": "LAHMAR",
                "name_en": "LAHMAR",
                "name_ar": "لحمر"
              },
              {
                "code": 815,
                "name": "BOUKAIS",
                "name_en": "BOUKAIS",
                "name_ar": "بوكايس"
              },
              {
                "code": 816,
                "name": "MOGHEUL",
                "name_en": "MOGHEUL",
                "name_ar": "موغل"
              }
            ]
          },
          {
            "code": 807,
            "name": "BENI ABBES",
            "name_ar": "بني عباس",
            "name_en": "BENI ABBES",
            "baladyiats": [
              {
                "code": 807,
                "name": "BENI-ABBES",
                "name_en": "BENI-ABBES",
                "name_ar": "بني عباس"
              },
              {
                "code": 820,
                "name": "TAMTERT",
                "name_en": "TAMTERT",
                "name_ar": "تامترت"
              }
            ]
          },
          {
            "code": 810,
            "name": "KENADSA",
            "name_ar": "القنادسة",
            "name_en": "KENADSA",
            "baladyiats": [
              {
                "code": 804,
                "name": "MERIDJA",
                "name_en": "MERIDJA",
                "name_ar": "المريجة"
              },
              {
                "code": 810,
                "name": "KENADSA",
                "name_en": "KENADSA",
                "name_ar": "القنادسة"
              }
            ]
          },
          {
            "code": 811,
            "name": "IGLI",
            "name_ar": "إقلي",
            "name_en": "IGLI",
            "baladyiats": [
              {
                "code": 811,
                "name": "IGLI",
                "name_en": "IGLI",
                "name_ar": "إقلي"
              }
            ]
          },
          {
            "code": 812,
            "name": "TABELBALA",
            "name_ar": "تبلبالة",
            "name_en": "TABELBALA",
            "baladyiats": [
              {
                "code": 812,
                "name": "TABELBALA",
                "name_en": "TABELBALA",
                "name_ar": "تبلبالة"
              }
            ]
          },
          {
            "code": 813,
            "name": "TAGHIT",
            "name_ar": "تاغيت",
            "name_en": "TAGHIT",
            "baladyiats": [
              {
                "code": 813,
                "name": "TAGHIT",
                "name_en": "TAGHIT",
                "name_ar": "تاغيت"
              }
            ]
          },
          {
            "code": 814,
            "name": "EL OUATA",
            "name_ar": "الواتة",
            "name_en": "EL OUATA",
            "baladyiats": [
              {
                "code": 814,
                "name": "EL OUATA",
                "name_en": "EL OUATA",
                "name_ar": "الواتة"
              }
            ]
          },
          {
            "code": 817,
            "name": "ABADLA",
            "name_ar": "العبادلة",
            "name_en": "ABADLA",
            "baladyiats": [
              {
                "code": 802,
                "name": "ERG-FERRADJ",
                "name_en": "ERG-FERRADJ",
                "name_ar": "عرق فراج"
              },
              {
                "code": 809,
                "name": "MACHRAA-HOUARI-BOUMEDIENE",
                "name_en": "MACHRAA-HOUARI-BOUMEDIENE",
                "name_ar": "مشرع هواري بومدين"
              },
              {
                "code": 817,
                "name": "ABADLA",
                "name_en": "ABADLA",
                "name_ar": "العبادلة"
              }
            ]
          },
          {
            "code": 818,
            "name": "KERZAZ",
            "name_ar": "كرزاز",
            "name_en": "KERZAZ",
            "baladyiats": [
              {
                "code": 805,
                "name": "TIMOUDI",
                "name_en": "TIMOUDI",
                "name_ar": "تيمودي"
              },
              {
                "code": 808,
                "name": "BENI-IKHLEF",
                "name_en": "BENI-IKHLEF",
                "name_ar": "بن يخلف"
              },
              {
                "code": 818,
                "name": "KERZAZ",
                "name_en": "KERZAZ",
                "name_ar": "كرزاز"
              }
            ]
          },
          {
            "code": 821,
            "name": "BENI OUNIF",
            "name_ar": "بني ونيف",
            "name_en": "BENI OUNIF",
            "baladyiats": [
              {
                "code": 821,
                "name": "BENI-OUNIF",
                "name_en": "BENI-OUNIF",
                "name_ar": "بني ونيف"
              }
            ]
          },
          {
            "code": 8070,
            "name": "BENI ABBES (wilya déléguée)",
            "name_ar": "بني عباس (ولاية منتدبة)",
            "name_en": "BENI ABBES (wilya déléguée)"
          }
        ],
        "adjacentWilayas": [
          45,
          32,
          1,
          37
        ]
      },
      {
        "mattricule": 9,
        "name_ar": "البليدة",
        "name_ber": "ⴱⵍⵉⴷⴰ",
        "name_en": "Blida",
        "name": "Blida",
        "phoneCodes": [
          25
        ],
        "postalCodes": [
          9000,
          9001,
          9002,
          9003,
          9004,
          9005,
          9006,
          9007,
          9008,
          9009,
          9010,
          9011,
          9012,
          9013,
          9014,
          9015,
          9016,
          9017,
          9018,
          9019,
          9020,
          9021,
          9022,
          9023,
          9024,
          9025,
          9026,
          9027,
          9028,
          9029,
          9030,
          9031,
          9032,
          9033,
          9034,
          9035,
          9036,
          9037,
          9038,
          9039,
          9040,
          9041,
          9042,
          9043,
          9044,
          9045,
          9046,
          9047,
          9048,
          9049,
          9050,
          9051,
          9052,
          9053,
          9054,
          9055,
          9056,
          9057,
          9058,
          9059,
          9060,
          9061,
          9062,
          9063,
          9064,
          9066,
          9067,
          9068,
          9069,
          9070,
          9071,
          9072,
          9073,
          9074,
          9075,
          9076,
          9077,
          9078,
          9079
        ],
        "dairats": [
          {
            "code": 901,
            "name": "BLIDA",
            "name_ar": "البليدة",
            "name_en": "BLIDA",
            "baladyiats": [
              {
                "code": 901,
                "name": "BLIDA",
                "name_en": "BLIDA",
                "name_ar": "البليدة"
              },
              {
                "code": 920,
                "name": "BOUARFA",
                "name_en": "BOUARFA",
                "name_ar": "بوعرفة"
              }
            ]
          },
          {
            "code": 903,
            "name": "BOUINAN",
            "name_ar": "بوعينان",
            "name_en": "BOUINAN",
            "baladyiats": [
              {
                "code": 902,
                "name": "CHEBLI",
                "name_en": "CHEBLI",
                "name_ar": "الشبلي"
              },
              {
                "code": 903,
                "name": "BOUINAN",
                "name_en": "BOUINAN",
                "name_ar": "بوعينان"
              }
            ]
          },
          {
            "code": 904,
            "name": "OUED EL ALLEUG",
            "name_ar": "وادي العلايق",
            "name_en": "OUED EL ALLEUG",
            "baladyiats": [
              {
                "code": 904,
                "name": "OUED EL ALLEUG",
                "name_en": "OUED EL ALLEUG",
                "name_ar": "وادي العلايق"
              },
              {
                "code": 910,
                "name": "BENKHELIL",
                "name_en": "BENKHELIL",
                "name_ar": "بن خليل"
              },
              {
                "code": 919,
                "name": "BENI-TAMOU",
                "name_en": "BENI-TAMOU",
                "name_ar": "بني تامو"
              }
            ]
          },
          {
            "code": 905,
            "name": "OULED YAICH",
            "name_ar": "أولاد يعيش",
            "name_en": "OULED YAICH",
            "baladyiats": [
              {
                "code": 905,
                "name": "OULED YAICH",
                "name_en": "OULED YAICH",
                "name_ar": "أولاد يعيش"
              },
              {
                "code": 906,
                "name": "CHREA",
                "name_en": "CHREA",
                "name_ar": "الشريعة"
              },
              {
                "code": 921,
                "name": "BENI MERED",
                "name_en": "BENI MERED",
                "name_ar": "بني مراد"
              }
            ]
          },
          {
            "code": 907,
            "name": "EL AFFROUN",
            "name_ar": "العفرون",
            "name_en": "EL AFFROUN",
            "baladyiats": [
              {
                "code": 907,
                "name": "EL-AFFROUN",
                "name_en": "EL-AFFROUN",
                "name_ar": "العفرون"
              },
              {
                "code": 918,
                "name": "OUED  DJER",
                "name_en": "OUED  DJER",
                "name_ar": "وادي جر"
              }
            ]
          },
          {
            "code": 912,
            "name": "MOUZAIA",
            "name_ar": "موزاية",
            "name_en": "MOUZAIA",
            "baladyiats": [
              {
                "code": 908,
                "name": "CHIFFA",
                "name_en": "CHIFFA",
                "name_ar": "الشفة"
              },
              {
                "code": 912,
                "name": "MOUZAIA",
                "name_en": "MOUZAIA",
                "name_ar": "موزاية"
              },
              {
                "code": 924,
                "name": "AIN ROMANA",
                "name_en": "AIN ROMANA",
                "name_ar": "عين الرمانة"
              }
            ]
          },
          {
            "code": 914,
            "name": "MEFTAH",
            "name_ar": "مفتاح",
            "name_en": "MEFTAH",
            "baladyiats": [
              {
                "code": 914,
                "name": "MEFTAH",
                "name_en": "MEFTAH",
                "name_ar": "مفتاح"
              },
              {
                "code": 925,
                "name": "DJEBABRA",
                "name_en": "DJEBABRA",
                "name_ar": "جبابرة"
              }
            ]
          },
          {
            "code": 916,
            "name": "BOUFARIK",
            "name_ar": "بوفاريك",
            "name_en": "BOUFARIK",
            "baladyiats": [
              {
                "code": 911,
                "name": "SOUMAA",
                "name_en": "SOUMAA",
                "name_ar": "الصومعة"
              },
              {
                "code": 916,
                "name": "BOUFARIK",
                "name_en": "BOUFARIK",
                "name_ar": "بوفاريك"
              },
              {
                "code": 923,
                "name": "GUERROUAOU",
                "name_en": "GUERROUAOU",
                "name_ar": "قرواو"
              }
            ]
          },
          {
            "code": 917,
            "name": "LARBAA",
            "name_ar": "الأربعاء",
            "name_en": "LARBAA",
            "baladyiats": [
              {
                "code": 913,
                "name": "SOUHANE",
                "name_en": "SOUHANE",
                "name_ar": "صوحان"
              },
              {
                "code": 917,
                "name": "LARBAA",
                "name_en": "LARBAA",
                "name_ar": "الأربعاء"
              }
            ]
          },
          {
            "code": 922,
            "name": "BOUGARA",
            "name_ar": "بوقرة",
            "name_en": "BOUGARA",
            "baladyiats": [
              {
                "code": 909,
                "name": "HAMMAM ELOUANE",
                "name_en": "HAMMAM ELOUANE",
                "name_ar": "حمام ملوان"
              },
              {
                "code": 915,
                "name": "OULED SLAMA",
                "name_en": "OULED SLAMA",
                "name_ar": "اولاد سلامة"
              },
              {
                "code": 922,
                "name": "BOUGARA",
                "name_en": "BOUGARA",
                "name_ar": "بوقرة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          42,
          16,
          10,
          26,
          44
        ]
      },
      {
        "mattricule": 10,
        "name_ar": "البويرة",
        "name_ber": "ⵜⵓⴱⵉⵔⴻⵜ",
        "name_en": "Bouira",
        "name": "Bouira",
        "phoneCodes": [
          26
        ],
        "postalCodes": [
          10000,
          10001,
          10002,
          10003,
          10004,
          10005,
          10006,
          10007,
          10008,
          10009,
          10010,
          10011,
          10012,
          10013,
          10014,
          10015,
          10016,
          10017,
          10018,
          10019,
          10020,
          10021,
          10022,
          10023,
          10024,
          10025,
          10026,
          10027,
          10028,
          10029,
          10030,
          10031,
          10032,
          10033,
          10034,
          10035,
          10036,
          10037,
          10038,
          10039,
          10040,
          10041,
          10042,
          10043,
          10044,
          10045,
          10046,
          10047,
          10048,
          10049,
          10050,
          10051,
          10052,
          10053,
          10054,
          10055,
          10056,
          10057,
          10058,
          10059,
          10060,
          10061,
          10062,
          10063,
          10064,
          10065,
          10066,
          10067,
          10068,
          10069,
          10070,
          10071,
          10072,
          10073,
          10074,
          10075,
          10076,
          10077,
          10078,
          10079,
          10080,
          10081,
          10082,
          10083,
          10084,
          10085,
          10086,
          10087,
          10088,
          10089,
          10090,
          10091,
          10092,
          10093,
          10094,
          10095,
          10096,
          10098,
          10099,
          10100,
          10101,
          10102,
          10103,
          10104,
          10105,
          10106,
          10107,
          10108,
          10109
        ],
        "dairats": [
          {
            "code": 1001,
            "name": "BOUIRA",
            "name_ar": "البويرة",
            "name_en": "BOUIRA",
            "baladyiats": [
              {
                "code": 1001,
                "name": "BOUIRA",
                "name_en": "BOUIRA",
                "name_ar": "البويرة"
              },
              {
                "code": 1008,
                "name": "AIT LAAZIZ",
                "name_en": "AIT LAAZIZ",
                "name_ar": "أيت لعزيز"
              },
              {
                "code": 1029,
                "name": "AIN TURK",
                "name_en": "AIN TURK",
                "name_ar": "عين الترك"
              }
            ]
          },
          {
            "code": 1004,
            "name": "SOUK EL KHEMIS",
            "name_ar": "سوق الخميس",
            "name_en": "SOUK EL KHEMIS",
            "baladyiats": [
              {
                "code": 1004,
                "name": "SOUK EL KHEMIS",
                "name_en": "SOUK EL KHEMIS",
                "name_ar": "سوق الخميس"
              },
              {
                "code": 1044,
                "name": "EL-MOKRANI",
                "name_en": "EL-MOKRANI",
                "name_ar": "المقراني"
              }
            ]
          },
          {
            "code": 1005,
            "name": "KADIRIA",
            "name_ar": "القادرية",
            "name_en": "KADIRIA",
            "baladyiats": [
              {
                "code": 1005,
                "name": "KADIRIA",
                "name_en": "KADIRIA",
                "name_ar": "قادرية"
              },
              {
                "code": 1016,
                "name": "AOMAR",
                "name_en": "AOMAR",
                "name_ar": "أعمر"
              },
              {
                "code": 1026,
                "name": "DJEBAHIA",
                "name_en": "DJEBAHIA",
                "name_ar": "جباحية"
              }
            ]
          },
          {
            "code": 1012,
            "name": "HAIZER",
            "name_ar": "الحيزر",
            "name_en": "HAIZER",
            "baladyiats": [
              {
                "code": 1009,
                "name": "TAGHZOUT",
                "name_en": "TAGHZOUT",
                "name_ar": "تاغزوت"
              },
              {
                "code": 1012,
                "name": "HAIZER",
                "name_en": "HAIZER",
                "name_ar": "حيزر"
              }
            ]
          },
          {
            "code": 1013,
            "name": "LAKHDARIA",
            "name_ar": "الأخضرية",
            "name_en": "LAKHDARIA",
            "baladyiats": [
              {
                "code": 1003,
                "name": "GUERROUMA",
                "name_en": "GUERROUMA",
                "name_ar": "قرومة"
              },
              {
                "code": 1013,
                "name": "LAKHDARIA",
                "name_en": "LAKHDARIA",
                "name_ar": "الأخضرية"
              },
              {
                "code": 1014,
                "name": "MAALA",
                "name_en": "MAALA",
                "name_ar": "معلة"
              },
              {
                "code": 1023,
                "name": "BOUDERBALA",
                "name_en": "BOUDERBALA",
                "name_ar": "بودربالة"
              },
              {
                "code": 1024,
                "name": "Z'BARBAR (el isseri )",
                "name_en": "Z'BARBAR (el isseri )",
                "name_ar": "زبربر"
              },
              {
                "code": 1034,
                "name": "BOUKRAM",
                "name_en": "BOUKRAM",
                "name_ar": "بوكرم"
              }
            ]
          },
          {
            "code": 1015,
            "name": "EL HACHIMIA",
            "name_ar": "الهاشمية",
            "name_en": "EL HACHIMIA",
            "baladyiats": [
              {
                "code": 1015,
                "name": "EL HACHIMIA",
                "name_en": "EL HACHIMIA",
                "name_ar": "الهاشمية"
              },
              {
                "code": 1045,
                "name": "OUED EL BERDI",
                "name_en": "OUED EL BERDI",
                "name_ar": "وادي البردي"
              }
            ]
          },
          {
            "code": 1018,
            "name": "BORDJ OKHRISS",
            "name_ar": "برج أوخريص",
            "name_en": "BORDJ OKHRISS",
            "baladyiats": [
              {
                "code": 1011,
                "name": "MEZDOUR",
                "name_en": "MEZDOUR",
                "name_ar": "مزدور"
              },
              {
                "code": 1018,
                "name": "BORDJ OKHRISS",
                "name_en": "BORDJ OKHRISS",
                "name_ar": "برج أوخريص"
              },
              {
                "code": 1028,
                "name": "TAGUEDITE",
                "name_en": "TAGUEDITE",
                "name_ar": "تاقديت"
              },
              {
                "code": 1042,
                "name": "HADJERA ZERGA",
                "name_en": "HADJERA ZERGA",
                "name_ar": "الحجرة الزرقاء"
              }
            ]
          },
          {
            "code": 1033,
            "name": "BECHLOUL",
            "name_ar": "بشلول",
            "name_en": "BECHLOUL",
            "baladyiats": [
              {
                "code": 1002,
                "name": "EL ASNAM",
                "name_en": "EL ASNAM",
                "name_ar": "الأسنام"
              },
              {
                "code": 1019,
                "name": "EL ADJIBA",
                "name_en": "EL ADJIBA",
                "name_ar": "العجيبة"
              },
              {
                "code": 1022,
                "name": "AHL EL KSAR",
                "name_en": "AHL EL KSAR",
                "name_ar": "أهل القصر"
              },
              {
                "code": 1033,
                "name": "BECHLOUL",
                "name_en": "BECHLOUL",
                "name_ar": "بشلول"
              },
              {
                "code": 1040,
                "name": "OULED RACHED",
                "name_en": "OULED RACHED",
                "name_ar": "أولاد راشد"
              }
            ]
          },
          {
            "code": 1035,
            "name": "AIN BESSEM",
            "name_ar": "عين بسام",
            "name_en": "AIN BESSEM",
            "baladyiats": [
              {
                "code": 1025,
                "name": "AIN EL HADJAR",
                "name_en": "AIN EL HADJAR",
                "name_ar": "عين الحجر"
              },
              {
                "code": 1035,
                "name": "AIN-BESSEM",
                "name_en": "AIN-BESSEM",
                "name_ar": "عين بسام"
              },
              {
                "code": 1041,
                "name": "AIN LALOUI",
                "name_en": "AIN LALOUI",
                "name_ar": "عين العلوي"
              }
            ]
          },
          {
            "code": 1036,
            "name": "BIR GHBALOU",
            "name_ar": "بئر غبالو",
            "name_en": "BIR GHBALOU",
            "baladyiats": [
              {
                "code": 1010,
                "name": "RAOURAOUA",
                "name_en": "RAOURAOUA",
                "name_ar": "روراوة"
              },
              {
                "code": 1021,
                "name": "EL KHABOUZIA",
                "name_en": "EL KHABOUZIA",
                "name_ar": "الخبوزية"
              },
              {
                "code": 1036,
                "name": "BIR GHBALOU",
                "name_en": "BIR GHBALOU",
                "name_ar": "بئر غبالو"
              }
            ]
          },
          {
            "code": 1037,
            "name": "M'CHEDALLAH",
            "name_ar": "مشد الله",
            "name_en": "M'CHEDALLAH",
            "baladyiats": [
              {
                "code": 1006,
                "name": "HANIF",
                "name_en": "HANIF",
                "name_ar": "حنيف"
              },
              {
                "code": 1017,
                "name": "CHORFA",
                "name_en": "CHORFA",
                "name_ar": "شرفة"
              },
              {
                "code": 1027,
                "name": "AGHBALOU",
                "name_en": "AGHBALOU",
                "name_ar": "أغبالو"
              },
              {
                "code": 1030,
                "name": "SAHARIDJ",
                "name_en": "SAHARIDJ",
                "name_ar": "سحاريج"
              },
              {
                "code": 1037,
                "name": "M CHEDALLAH",
                "name_en": "M CHEDALLAH",
                "name_ar": "أمشدالة"
              },
              {
                "code": 1043,
                "name": "ATH MANSOUR",
                "name_en": "ATH MANSOUR",
                "name_ar": "آث  منصور"
              }
            ]
          },
          {
            "code": 1038,
            "name": "SOUR EL GHOZLANE",
            "name_ar": "سور الغزلان",
            "name_en": "SOUR EL GHOZLANE",
            "baladyiats": [
              {
                "code": 1007,
                "name": "DIRAH",
                "name_en": "DIRAH",
                "name_ar": "ديرة"
              },
              {
                "code": 1020,
                "name": "EL-HAKIMIA",
                "name_en": "EL-HAKIMIA",
                "name_ar": "الحاكمية"
              },
              {
                "code": 1031,
                "name": "DECHMIA",
                "name_en": "DECHMIA",
                "name_ar": "الدشمية"
              },
              {
                "code": 1032,
                "name": "RIDANE",
                "name_en": "RIDANE",
                "name_ar": "ريدان"
              },
              {
                "code": 1038,
                "name": "SOUR EL GHOZLANE",
                "name_en": "SOUR EL GHOZLANE",
                "name_ar": "سور الغزلان"
              },
              {
                "code": 1039,
                "name": "MAAMORA",
                "name_en": "MAAMORA",
                "name_ar": "المعمورة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          26,
          9,
          35,
          15,
          34,
          28
        ]
      },
      {
        "mattricule": 11,
        "name_ar": "تمنراست",
        "name_ber": "ⵜⴰⵎⴰⵏⵖⴰⵙⵜ",
        "name_en": "Tamanrasset",
        "name": "Tamanrasset",
        "phoneCodes": [
          29
        ],
        "postalCodes": [
          11000,
          11001,
          11002,
          11003,
          11004,
          11005,
          11006,
          11007,
          11008,
          11009,
          11010,
          11011,
          11012,
          11013,
          11014,
          11015,
          11016,
          11017,
          11018,
          11019,
          11020,
          11021,
          11022,
          11023,
          11024,
          11025,
          11026,
          11027,
          11028,
          11029,
          11030,
          11031,
          11032,
          11033,
          11034
        ],
        "dairats": [
          {
            "code": 1101,
            "name": "TAMANRASSET",
            "name_ar": "تمنراست",
            "name_en": "TAMANRASSET",
            "baladyiats": [
              {
                "code": 1101,
                "name": "TAMANRASSET",
                "name_en": "TAMANRASSET",
                "name_ar": "تمنراست"
              },
              {
                "code": 1109,
                "name": "AIN AMGUEL",
                "name_en": "AIN AMGUEL",
                "name_ar": "عين امقل"
              }
            ]
          },
          {
            "code": 1102,
            "name": "SILET",
            "name_ar": "سيلت",
            "name_en": "SILET",
            "baladyiats": [
              {
                "code": 1102,
                "name": "ABELSA",
                "name_en": "ABELSA",
                "name_ar": "ابلسة"
              }
            ]
          },
          {
            "code": 1103,
            "name": "AIN GHAR",
            "name_ar": "إينغر",
            "name_en": "AIN GHAR",
            "baladyiats": [
              {
                "code": 1103,
                "name": "INGHAR",
                "name_en": "INGHAR",
                "name_ar": "إينغر"
              }
            ]
          },
          {
            "code": 1104,
            "name": "AIN GUEZZAM",
            "name_ar": "عين قزام",
            "name_en": "AIN GUEZZAM",
            "baladyiats": [
              {
                "code": 1104,
                "name": "AIN GUEZZAM",
                "name_en": "AIN GUEZZAM",
                "name_ar": "عين قزام"
              }
            ]
          },
          {
            "code": 1104,
            "name": "AIN GUEZZAM (wilya déléguée)",
            "name_ar": "عين قزام (ولاية منتدبة)",
            "name_en": "AIN GUEZZAM (wilya déléguée)",
            "baladyiats": [
              {
                "code": 1104,
                "name": "AIN GUEZZAM",
                "name_en": "AIN GUEZZAM",
                "name_ar": "عين قزام"
              }
            ]
          },
          {
            "code": 1106,
            "name": "TAZROUK",
            "name_ar": "تاظروك",
            "name_en": "TAZROUK",
            "baladyiats": [
              {
                "code": 1105,
                "name": "IDLES",
                "name_en": "IDLES",
                "name_ar": "أدلس"
              },
              {
                "code": 1106,
                "name": "TAZROUK",
                "name_en": "TAZROUK",
                "name_ar": "تاظروك"
              }
            ]
          },
          {
            "code": 1107,
            "name": "TIN ZOUATINE",
            "name_ar": "تين زواتين",
            "name_en": "TIN ZOUATINE",
            "baladyiats": [
              {
                "code": 1107,
                "name": "TIN ZOUATINE",
                "name_en": "TIN ZOUATINE",
                "name_ar": "تين زواتين"
              }
            ]
          },
          {
            "code": 1108,
            "name": "AIN SALAH",
            "name_ar": "عين صالح",
            "name_en": "AIN SALAH",
            "baladyiats": [
              {
                "code": 1108,
                "name": "AIN SALAH",
                "name_en": "AIN SALAH",
                "name_ar": "عين صالح"
              },
              {
                "code": 1110,
                "name": "FOGGARET EZZOUA",
                "name_en": "FOGGARET EZZOUA",
                "name_ar": "فقارة الزوى"
              }
            ]
          },
          {
            "code": 1108,
            "name": "AIN SALAH (wilya déléguée)",
            "name_ar": "عين صالح (ولاية منتدبة)",
            "name_en": "AIN SALAH (wilya déléguée)",
            "baladyiats": [
              {
                "code": 1108,
                "name": "AIN SALAH",
                "name_en": "AIN SALAH",
                "name_ar": "عين صالح"
              },
              {
                "code": 1110,
                "name": "FOGGARET EZZOUA",
                "name_en": "FOGGARET EZZOUA",
                "name_ar": "فقارة الزوى"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          1,
          47,
          30,
          33
        ]
      },
      {
        "mattricule": 12,
        "name_ar": "تبسة",
        "name_ber": "ⵜⴱⴻⵙⴰ",
        "name_en": "Tbessa",
        "name": "Tbessa",
        "phoneCodes": [
          37
        ],
        "postalCodes": [
          12000,
          12001,
          12002,
          12003,
          12004,
          12005,
          12006,
          12007,
          12008,
          12009,
          12010,
          12011,
          12012,
          12013,
          12014,
          12015,
          12016,
          12017,
          12018,
          12019,
          12020,
          12021,
          12022,
          12023,
          12024,
          12025,
          12026,
          12027,
          12028,
          12029,
          12030,
          12031,
          12032,
          12033,
          12034,
          12035,
          12036,
          12037,
          12038,
          12039,
          12040,
          12041,
          12042,
          12043,
          12044,
          12045,
          12046,
          12047,
          12048,
          12049,
          12050,
          12051,
          12052,
          12053,
          12054,
          12055,
          12056,
          12057,
          12058,
          12059,
          12060,
          12061,
          12062,
          12063,
          12064,
          12065,
          12066,
          12067,
          12068
        ],
        "dairats": [
          {
            "code": 1201,
            "name": "TEBESSA",
            "name_ar": "تبسة",
            "name_en": "TEBESSA",
            "baladyiats": [
              {
                "code": 1201,
                "name": "TEBESSA",
                "name_en": "TEBESSA",
                "name_ar": "تبسة"
              }
            ]
          },
          {
            "code": 1202,
            "name": "BIR EL ATER",
            "name_ar": "بئر العاتر",
            "name_en": "BIR EL ATER",
            "baladyiats": [
              {
                "code": 1202,
                "name": "BIR-EL-ATER",
                "name_en": "BIR-EL-ATER",
                "name_ar": "بئر العاتر"
              },
              {
                "code": 1215,
                "name": "EL OGLA EL MALHA",
                "name_en": "EL OGLA EL MALHA",
                "name_ar": "العقلة المالحة"
              }
            ]
          },
          {
            "code": 1203,
            "name": "CHERIA",
            "name_ar": "الشريعة",
            "name_en": "CHERIA",
            "baladyiats": [
              {
                "code": 1203,
                "name": "CHERIA",
                "name_en": "CHERIA",
                "name_ar": "الشريعة"
              },
              {
                "code": 1222,
                "name": "TELIDJEN",
                "name_en": "TELIDJEN",
                "name_ar": "ثليجان"
              }
            ]
          },
          {
            "code": 1205,
            "name": "EL AOUINET",
            "name_ar": "العوينات",
            "name_en": "EL AOUINET",
            "baladyiats": [
              {
                "code": 1205,
                "name": "EL-AOUINET",
                "name_en": "EL-AOUINET",
                "name_ar": "العوينات"
              },
              {
                "code": 1218,
                "name": "BOUKHADRA",
                "name_en": "BOUKHADRA",
                "name_ar": "بوخضرة"
              }
            ]
          },
          {
            "code": 1209,
            "name": "NEGRINE",
            "name_ar": "نقرين",
            "name_en": "NEGRINE",
            "baladyiats": [
              {
                "code": 1209,
                "name": "NEGRINE",
                "name_en": "NEGRINE",
                "name_ar": "نقرين"
              },
              {
                "code": 1228,
                "name": "FERKANE",
                "name_en": "FERKANE",
                "name_ar": "فركان"
              }
            ]
          },
          {
            "code": 1210,
            "name": "BIR MOKADEM",
            "name_ar": "بئر مقدم",
            "name_en": "BIR MOKADEM",
            "baladyiats": [
              {
                "code": 1208,
                "name": "HAMMAMET",
                "name_en": "HAMMAMET",
                "name_ar": "الحمامات"
              },
              {
                "code": 1210,
                "name": "BIR MOKKADEM",
                "name_en": "BIR MOKKADEM",
                "name_ar": "بئر مقدم"
              },
              {
                "code": 1216,
                "name": "GUORRIGUER",
                "name_en": "GUORRIGUER",
                "name_ar": "قريقر"
              }
            ]
          },
          {
            "code": 1211,
            "name": "EL KOUIF",
            "name_ar": "الكويف",
            "name_en": "EL KOUIF",
            "baladyiats": [
              {
                "code": 1211,
                "name": "EL KOUIF",
                "name_en": "EL KOUIF",
                "name_ar": "الكويف"
              },
              {
                "code": 1217,
                "name": "BEKKARIA",
                "name_en": "BEKKARIA",
                "name_ar": "بكارية"
              },
              {
                "code": 1225,
                "name": "BOULHAF DYR",
                "name_en": "BOULHAF DYR",
                "name_ar": "بولحاف الدير"
              }
            ]
          },
          {
            "code": 1212,
            "name": "MORSOTT",
            "name_ar": "مرسط",
            "name_en": "MORSOTT",
            "baladyiats": [
              {
                "code": 1212,
                "name": "MORSOTT",
                "name_en": "MORSOTT",
                "name_ar": "مرسط"
              },
              {
                "code": 1214,
                "name": "BIR DHEHEB",
                "name_en": "BIR DHEHEB",
                "name_ar": "بئر الذهب"
              }
            ]
          },
          {
            "code": 1213,
            "name": "EL OGLA",
            "name_ar": "العقلة",
            "name_en": "EL OGLA",
            "baladyiats": [
              {
                "code": 1204,
                "name": "STAH GUENTIS",
                "name_en": "STAH GUENTIS",
                "name_ar": "سطح قنطيس"
              },
              {
                "code": 1213,
                "name": "EL OGLA",
                "name_en": "EL OGLA",
                "name_ar": "العقلة"
              },
              {
                "code": 1226,
                "name": "BEDJENE",
                "name_en": "BEDJENE",
                "name_ar": "بجن"
              },
              {
                "code": 1227,
                "name": "EL MEZERAA",
                "name_en": "EL MEZERAA",
                "name_ar": "المزرعة"
              }
            ]
          },
          {
            "code": 1219,
            "name": "OUENZA",
            "name_ar": "الونزة",
            "name_en": "OUENZA",
            "baladyiats": [
              {
                "code": 1219,
                "name": "OUENZA",
                "name_en": "OUENZA",
                "name_ar": "الونزة"
              },
              {
                "code": 1223,
                "name": "AIN ZERGA",
                "name_en": "AIN ZERGA",
                "name_ar": "عين الزرقاء"
              },
              {
                "code": 1224,
                "name": "EL MERIDJ",
                "name_en": "EL MERIDJ",
                "name_ar": "المريج"
              }
            ]
          },
          {
            "code": 1220,
            "name": "EL MALABIOD",
            "name_ar": "الماء الابيض",
            "name_en": "EL MALABIOD",
            "baladyiats": [
              {
                "code": 1206,
                "name": "EL-HOUIDJBET",
                "name_en": "EL-HOUIDJBET",
                "name_ar": "الحويجبات"
              },
              {
                "code": 1220,
                "name": "EL MALABIOD",
                "name_en": "EL MALABIOD",
                "name_ar": "الماء الابيض"
              }
            ]
          },
          {
            "code": 1221,
            "name": "OUM ALI",
            "name_ar": "أم علي",
            "name_en": "OUM ALI",
            "baladyiats": [
              {
                "code": 1207,
                "name": "SAF SAF EL OUESRA",
                "name_en": "SAF SAF EL OUESRA",
                "name_ar": "صفصاف الوسرى"
              },
              {
                "code": 1221,
                "name": "OUM ALI",
                "name_en": "OUM ALI",
                "name_ar": "أم علي"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          39,
          40,
          4,
          41
        ]
      },
      {
        "mattricule": 13,
        "name_ar": "تلمسان",
        "name_ber": "ⵜⵍⴻⵎⵙⴻⵏ",
        "name_en": "Tlemcen",
        "name": "Tlemcen",
        "phoneCodes": [
          43
        ],
        "postalCodes": [
          13000,
          13001,
          13002,
          13003,
          13004,
          13005,
          13006,
          13007,
          13008,
          13009,
          13010,
          13011,
          13012,
          13013,
          13014,
          13015,
          13016,
          13017,
          13018,
          13019,
          13020,
          13021,
          13022,
          13023,
          13024,
          13025,
          13026,
          13027,
          13028,
          13029,
          13030,
          13031,
          13032,
          13033,
          13034,
          13035,
          13036,
          13037,
          13038,
          13039,
          13040,
          13041,
          13042,
          13043,
          13044,
          13045,
          13046,
          13047,
          13048,
          13049,
          13050,
          13051,
          13052,
          13053,
          13054,
          13055,
          13056,
          13057,
          13058,
          13059,
          13060,
          13061,
          13062,
          13063,
          13064,
          13065,
          13066,
          13067,
          13068,
          13069,
          13070,
          13071,
          13072,
          13073,
          13074,
          13075,
          13076,
          13077,
          13078,
          13079,
          13080,
          13081,
          13082,
          13084,
          13085,
          13086,
          13083,
          13087,
          13088,
          13089,
          13090,
          13091,
          13092,
          13093,
          13094,
          13095,
          13096,
          13097,
          13098,
          13099,
          13100,
          13101,
          13102,
          13103,
          13104,
          13105,
          13106,
          13107,
          13108,
          13109,
          13110,
          13111,
          13112,
          13113,
          13114
        ],
        "dairats": [
          {
            "code": 1301,
            "name": "TLEMCEN",
            "name_ar": "تلمسان",
            "name_en": "TLEMCEN",
            "baladyiats": [
              {
                "code": 1301,
                "name": "TLEMCEN",
                "name_en": "TLEMCEN",
                "name_ar": "تلمسان"
              }
            ]
          },
          {
            "code": 1303,
            "name": "AIN TELLOUT",
            "name_ar": "عين تالوت",
            "name_en": "AIN TELLOUT",
            "baladyiats": [
              {
                "code": 1303,
                "name": "AIN TELLOUT",
                "name_en": "AIN TELLOUT",
                "name_ar": "عين تالوت"
              },
              {
                "code": 1325,
                "name": "AIN NEHALA",
                "name_en": "AIN NEHALA",
                "name_ar": "عين النحالة"
              }
            ]
          },
          {
            "code": 1304,
            "name": "REMCHI",
            "name_ar": "الرمشي",
            "name_en": "REMCHI",
            "baladyiats": [
              {
                "code": 1304,
                "name": "REMCHI",
                "name_en": "REMCHI",
                "name_ar": "الرمشي"
              },
              {
                "code": 1305,
                "name": "EL FEHOUL",
                "name_en": "EL FEHOUL",
                "name_ar": "الفحول"
              },
              {
                "code": 1315,
                "name": "AIN YOUCEF",
                "name_en": "AIN YOUCEF",
                "name_ar": "عين يوسف"
              },
              {
                "code": 1322,
                "name": "SEBBAA CHIOUKH",
                "name_en": "SEBBAA CHIOUKH",
                "name_ar": "سبعة شيوخ"
              },
              {
                "code": 1336,
                "name": "BENI OUARSOUS",
                "name_en": "BENI OUARSOUS",
                "name_ar": "بني وارسوس"
              }
            ]
          },
          {
            "code": 1306,
            "name": "SABRA",
            "name_ar": "صبرة",
            "name_en": "SABRA",
            "baladyiats": [
              {
                "code": 1306,
                "name": "SABRA",
                "name_en": "SABRA",
                "name_ar": "صبرة"
              },
              {
                "code": 1347,
                "name": "BOUHLOU",
                "name_en": "BOUHLOU",
                "name_ar": "بوحلو"
              }
            ]
          },
          {
            "code": 1307,
            "name": "GHAZAOUET",
            "name_ar": "الغزوات",
            "name_en": "GHAZAOUET",
            "baladyiats": [
              {
                "code": 1307,
                "name": "GHAZAOUET",
                "name_en": "GHAZAOUET",
                "name_ar": "الغزوات"
              },
              {
                "code": 1319,
                "name": "DAR YAGHMORACEN",
                "name_en": "DAR YAGHMORACEN",
                "name_ar": "دار يغمراسن"
              },
              {
                "code": 1329,
                "name": "SOUAHLIA",
                "name_en": "SOUAHLIA",
                "name_ar": "السواحلية"
              },
              {
                "code": 1345,
                "name": "TIANET",
                "name_en": "TIANET",
                "name_ar": "تيانت"
              }
            ]
          },
          {
            "code": 1313,
            "name": "OULED MIMOUN",
            "name_ar": "أولاد ميمون",
            "name_en": "OULED MIMOUN",
            "baladyiats": [
              {
                "code": 1311,
                "name": "OUED LAKHDAR",
                "name_en": "OUED LAKHDAR",
                "name_ar": "وادي الخضر"
              },
              {
                "code": 1313,
                "name": "OULED MIMOUN",
                "name_en": "OULED MIMOUN",
                "name_ar": "أولاد ميمون"
              },
              {
                "code": 1352,
                "name": "BENI SMIEL",
                "name_en": "BENI SMIEL",
                "name_ar": "بني صميل"
              }
            ]
          },
          {
            "code": 1317,
            "name": "BENI SNOUS",
            "name_ar": "بني سنوس",
            "name_en": "BENI SNOUS",
            "baladyiats": [
              {
                "code": 1317,
                "name": "BENI SNOUS",
                "name_en": "BENI SNOUS",
                "name_ar": "بني سنوس"
              },
              {
                "code": 1321,
                "name": "AZAIL",
                "name_en": "AZAIL",
                "name_ar": "العزايل"
              },
              {
                "code": 1342,
                "name": "BENI BAHDEL",
                "name_en": "BENI BAHDEL",
                "name_ar": "بني بهدل"
              }
            ]
          },
          {
            "code": 1318,
            "name": "BAB EL ASSA",
            "name_ar": "باب العسة",
            "name_en": "BAB EL ASSA",
            "baladyiats": [
              {
                "code": 1308,
                "name": "SOUANI",
                "name_en": "SOUANI",
                "name_ar": "السواني"
              },
              {
                "code": 1318,
                "name": "BAB EL ASSA",
                "name_en": "BAB EL ASSA",
                "name_ar": "باب العسة"
              },
              {
                "code": 1333,
                "name": "SOUK TLETA",
                "name_en": "SOUK TLETA",
                "name_ar": "سوق الثلاثاء"
              }
            ]
          },
          {
            "code": 1320,
            "name": "FELLAOUCENE",
            "name_ar": "فلاوسن",
            "name_en": "FELLAOUCENE",
            "baladyiats": [
              {
                "code": 1320,
                "name": "FELLAOUCENE",
                "name_en": "FELLAOUCENE",
                "name_ar": "فلاوسن"
              },
              {
                "code": 1331,
                "name": "AIN FETAH",
                "name_en": "AIN FETAH",
                "name_ar": "عين فتاح"
              },
              {
                "code": 1353,
                "name": "AIN KEBIRA",
                "name_en": "AIN KEBIRA",
                "name_ar": "عين الكبيرة"
              }
            ]
          },
          {
            "code": 1324,
            "name": "BENSEKRANE",
            "name_ar": "بن سكران",
            "name_en": "BENSEKRANE",
            "baladyiats": [
              {
                "code": 1324,
                "name": "BENSEKRANE",
                "name_en": "BENSEKRANE",
                "name_ar": "بن سكران"
              },
              {
                "code": 1334,
                "name": "SIDI ABDELLI",
                "name_en": "SIDI ABDELLI",
                "name_ar": "سيدي العبدلي"
              }
            ]
          },
          {
            "code": 1326,
            "name": "HENNAYA",
            "name_ar": "الحناية",
            "name_en": "HENNAYA",
            "baladyiats": [
              {
                "code": 1316,
                "name": "ZENATA",
                "name_en": "ZENATA",
                "name_ar": "زناتة"
              },
              {
                "code": 1326,
                "name": "HENNAYA",
                "name_en": "HENNAYA",
                "name_ar": "الحناية"
              },
              {
                "code": 1346,
                "name": "OULED RIYAH",
                "name_en": "OULED RIYAH",
                "name_ar": "أولاد رياح"
              }
            ]
          },
          {
            "code": 1327,
            "name": "MAGHNIA",
            "name_ar": "مغنية",
            "name_en": "MAGHNIA",
            "baladyiats": [
              {
                "code": 1327,
                "name": "MAGHNIA",
                "name_en": "MAGHNIA",
                "name_ar": "مغنية"
              },
              {
                "code": 1328,
                "name": "HAMMAM BOUGHRARA",
                "name_en": "HAMMAM BOUGHRARA",
                "name_ar": "حمام بوغرارة"
              }
            ]
          },
          {
            "code": 1335,
            "name": "SEBDOU",
            "name_ar": "سبدو",
            "name_en": "SEBDOU",
            "baladyiats": [
              {
                "code": 1310,
                "name": "EL GOR",
                "name_en": "EL GOR",
                "name_ar": "القور"
              },
              {
                "code": 1332,
                "name": "EL ARICHA",
                "name_en": "EL ARICHA",
                "name_ar": "العريشة"
              },
              {
                "code": 1335,
                "name": "SEBDOU",
                "name_en": "SEBDOU",
                "name_ar": "سبدو"
              }
            ]
          },
          {
            "code": 1338,
            "name": "BENI BOUSSAID",
            "name_ar": "بني بوسعيد",
            "name_en": "BENI BOUSSAID",
            "baladyiats": [
              {
                "code": 1337,
                "name": "SIDI MEDJAHED",
                "name_en": "SIDI MEDJAHED",
                "name_ar": "سيدي مجاهد"
              },
              {
                "code": 1338,
                "name": "BENI BOUSSAID",
                "name_en": "BENI BOUSSAID",
                "name_ar": "بني بوسعيد"
              }
            ]
          },
          {
            "code": 1339,
            "name": "MARSA BEN MEHDI",
            "name_ar": "مرسى بن مهيدي",
            "name_en": "MARSA BEN MEHDI",
            "baladyiats": [
              {
                "code": 1330,
                "name": "M'SIRDA FOUAGA",
                "name_en": "M'SIRDA FOUAGA",
                "name_ar": "مسيردة الفواقة"
              },
              {
                "code": 1339,
                "name": "MARSA BEN M'HIDI",
                "name_en": "MARSA BEN M'HIDI",
                "name_ar": "مرسى بن مهيدي"
              }
            ]
          },
          {
            "code": 1340,
            "name": "NEDROMA",
            "name_ar": "ندرومة",
            "name_en": "NEDROMA",
            "baladyiats": [
              {
                "code": 1309,
                "name": "DJEBALA",
                "name_en": "DJEBALA",
                "name_ar": "جبالة"
              },
              {
                "code": 1340,
                "name": "NEDROMA",
                "name_en": "NEDROMA",
                "name_ar": "ندرومة"
              }
            ]
          },
          {
            "code": 1341,
            "name": "SIDI DJILLALI",
            "name_ar": "سيدي الجيلالي",
            "name_en": "SIDI DJILLALI",
            "baladyiats": [
              {
                "code": 1341,
                "name": "SIDI DJILLALI",
                "name_en": "SIDI DJILLALI",
                "name_ar": "سيدي الجيلالي"
              },
              {
                "code": 1343,
                "name": "BOUIHI",
                "name_en": "BOUIHI",
                "name_ar": "البويهي"
              }
            ]
          },
          {
            "code": 1344,
            "name": "HONNAINE",
            "name_ar": "هنين",
            "name_en": "HONNAINE",
            "baladyiats": [
              {
                "code": 1344,
                "name": "HONNAINE",
                "name_en": "HONNAINE",
                "name_ar": "هنين"
              },
              {
                "code": 1348,
                "name": "BENI KHELLAD",
                "name_en": "BENI KHELLAD",
                "name_ar": "بني خلاد"
              }
            ]
          },
          {
            "code": 1350,
            "name": "CHETOUANE",
            "name_ar": "شتوان",
            "name_en": "CHETOUANE",
            "baladyiats": [
              {
                "code": 1312,
                "name": "AIN FEZZA",
                "name_en": "AIN FEZZA",
                "name_ar": "عين فزة"
              },
              {
                "code": 1314,
                "name": "AMIEUR",
                "name_en": "AMIEUR",
                "name_ar": "عمير"
              },
              {
                "code": 1350,
                "name": "CHETOUANE",
                "name_en": "CHETOUANE",
                "name_ar": "شتوان"
              }
            ]
          },
          {
            "code": 1351,
            "name": "MANSOURAH",
            "name_ar": "منصورة",
            "name_en": "MANSOURAH",
            "baladyiats": [
              {
                "code": 1302,
                "name": "BENI MESTER",
                "name_en": "BENI MESTER",
                "name_ar": "بني مستر"
              },
              {
                "code": 1323,
                "name": "TERNY BENI HEDIEL",
                "name_en": "TERNY BENI HEDIEL",
                "name_ar": "تيرني بني هديل"
              },
              {
                "code": 1349,
                "name": "AIN GHORABA",
                "name_en": "AIN GHORABA",
                "name_ar": "عين غرابة"
              },
              {
                "code": 1351,
                "name": "MANSOURAH",
                "name_en": "MANSOURAH",
                "name_ar": "منصورة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          46,
          22,
          45
        ]
      },
      {
        "mattricule": 14,
        "name_ar": "تيارت",
        "name_ber": "ⵜⵢⴰⵔⴻⵜ",
        "name_en": "Tiaret",
        "name": "Tiaret",
        "phoneCodes": [
          46
        ],
        "postalCodes": [
          14000,
          14001,
          14002,
          14003,
          14004,
          14005,
          14006,
          14007,
          14008,
          14009,
          14010,
          14011,
          14012,
          14013,
          14014,
          14015,
          14016,
          14017,
          14018,
          14019,
          14020,
          14021,
          14023,
          14024,
          14025,
          14026,
          14027,
          14028,
          14029,
          14030,
          14031,
          14032,
          14033,
          14034,
          14035,
          14036,
          14037,
          14038,
          14039,
          14040,
          14041,
          14042,
          14043,
          14044,
          14045,
          14046,
          14047,
          14048,
          14049,
          14050,
          14051,
          14052,
          14053,
          14054,
          14055,
          14056,
          14057,
          14058,
          14059,
          14060,
          14061,
          14062,
          14063,
          14064,
          14065,
          14066,
          14067,
          14068,
          14069,
          14070,
          14071,
          14072,
          14073,
          14074,
          14075,
          14076,
          14077,
          14078,
          14079,
          14080,
          14081
        ],
        "dairats": [
          {
            "code": 1401,
            "name": "TIARET",
            "name_ar": "تيارت",
            "name_en": "TIARET",
            "baladyiats": [
              {
                "code": 1401,
                "name": "TIARET",
                "name_en": "TIARET",
                "name_ar": "تيارت"
              }
            ]
          },
          {
            "code": 1402,
            "name": "MEDROUSSA",
            "name_ar": "مدروسة",
            "name_en": "MEDROUSSA",
            "baladyiats": [
              {
                "code": 1402,
                "name": "MEDROUSSA",
                "name_en": "MEDROUSSA",
                "name_ar": "مدروسة"
              },
              {
                "code": 1407,
                "name": "SIDI BAKHTI",
                "name_en": "SIDI BAKHTI",
                "name_ar": "سيدي بختي"
              },
              {
                "code": 1412,
                "name": "MELLAKOU",
                "name_en": "MELLAKOU",
                "name_ar": "ملاكو"
              }
            ]
          },
          {
            "code": 1406,
            "name": "AIN DEHEB",
            "name_ar": "عين الذهب",
            "name_en": "AIN DEHEB",
            "baladyiats": [
              {
                "code": 1406,
                "name": "AIN DEHEB",
                "name_en": "AIN DEHEB",
                "name_ar": "عين الذهب"
              },
              {
                "code": 1420,
                "name": "NAIMA",
                "name_en": "NAIMA",
                "name_ar": "النعيمة"
              },
              {
                "code": 1436,
                "name": "CHEHAIMA",
                "name_en": "CHEHAIMA",
                "name_ar": "شحيمة"
              }
            ]
          },
          {
            "code": 1413,
            "name": "DAHMOUNI",
            "name_ar": "دحموني",
            "name_en": "DAHMOUNI",
            "baladyiats": [
              {
                "code": 1403,
                "name": "AIN BOUCHEKIF",
                "name_en": "AIN BOUCHEKIF",
                "name_ar": "عين بوشقيف"
              },
              {
                "code": 1413,
                "name": "DAHMOUNI",
                "name_en": "DAHMOUNI",
                "name_ar": "دحموني"
              }
            ]
          },
          {
            "code": 1414,
            "name": "RAHOUIA",
            "name_ar": "رحوية",
            "name_en": "RAHOUIA",
            "baladyiats": [
              {
                "code": 1414,
                "name": "RAHOUIA",
                "name_en": "RAHOUIA",
                "name_ar": "الرحوية"
              },
              {
                "code": 1422,
                "name": "GUERTOUFA",
                "name_en": "GUERTOUFA",
                "name_ar": "قرطوفة"
              }
            ]
          },
          {
            "code": 1415,
            "name": "MAHDIA",
            "name_ar": "مهدية",
            "name_en": "MAHDIA",
            "baladyiats": [
              {
                "code": 1405,
                "name": "AIN DZARIT",
                "name_en": "AIN DZARIT",
                "name_ar": "عين دزاريت"
              },
              {
                "code": 1415,
                "name": "MAHDIA",
                "name_en": "MAHDIA",
                "name_ar": "مهدية"
              },
              {
                "code": 1425,
                "name": "SEBAINE",
                "name_en": "SEBAINE",
                "name_ar": "السبعين"
              },
              {
                "code": 1431,
                "name": "NADORAH",
                "name_en": "NADORAH",
                "name_ar": "الناظورة"
              }
            ]
          },
          {
            "code": 1416,
            "name": "SOUGUEUR",
            "name_ar": "السوقر",
            "name_en": "SOUGUEUR",
            "baladyiats": [
              {
                "code": 1416,
                "name": "SOUGUEUR",
                "name_en": "SOUGUEUR",
                "name_ar": "السوقر"
              },
              {
                "code": 1417,
                "name": "SI ABDELGHANI",
                "name_en": "SI ABDELGHANI",
                "name_ar": "سي عبد الغني"
              },
              {
                "code": 1426,
                "name": "TOUSNINA",
                "name_en": "TOUSNINA",
                "name_ar": "توسنينة"
              },
              {
                "code": 1441,
                "name": "FAIDJA",
                "name_en": "FAIDJA",
                "name_ar": "الفايجة"
              }
            ]
          },
          {
            "code": 1421,
            "name": "MEGHILA",
            "name_ar": "مغيلة",
            "name_en": "MEGHILA",
            "baladyiats": [
              {
                "code": 1411,
                "name": "SEBT",
                "name_en": "SEBT",
                "name_ar": "السبت"
              },
              {
                "code": 1421,
                "name": "MEGHILA",
                "name_en": "MEGHILA",
                "name_ar": "مغيلة"
              },
              {
                "code": 1423,
                "name": "SIDI HOSNI",
                "name_en": "SIDI HOSNI",
                "name_ar": "سيدي حسني"
              }
            ]
          },
          {
            "code": 1427,
            "name": "FRENDA",
            "name_ar": "فرندة",
            "name_en": "FRENDA",
            "baladyiats": [
              {
                "code": 1418,
                "name": "AIN EL HADID",
                "name_en": "AIN EL HADID",
                "name_ar": "عين الحديد"
              },
              {
                "code": 1427,
                "name": "FRENDA",
                "name_en": "FRENDA",
                "name_ar": "فرندة"
              },
              {
                "code": 1437,
                "name": "TAKHEMARET",
                "name_en": "TAKHEMARET",
                "name_ar": "تخمرت"
              }
            ]
          },
          {
            "code": 1428,
            "name": "AIN KERMES",
            "name_ar": "عين كرمس",
            "name_en": "AIN KERMES",
            "baladyiats": [
              {
                "code": 1408,
                "name": "MEDRISSA",
                "name_en": "MEDRISSA",
                "name_ar": "مدريسة"
              },
              {
                "code": 1410,
                "name": "MADNA",
                "name_en": "MADNA",
                "name_ar": "مادنة"
              },
              {
                "code": 1419,
                "name": "DJEBILET ROSFA",
                "name_en": "DJEBILET ROSFA",
                "name_ar": "جبيلات الرصفاء"
              },
              {
                "code": 1428,
                "name": "AIN KERMES",
                "name_en": "AIN KERMES",
                "name_ar": "عين كرمس"
              },
              {
                "code": 1438,
                "name": "SIDI ABDERRAHMANE",
                "name_en": "SIDI ABDERRAHMANE",
                "name_ar": "سيدي عبد الرحمن"
              }
            ]
          },
          {
            "code": 1429,
            "name": "KSAR CHELLALA",
            "name_ar": "قصر الشلالة",
            "name_en": "KSAR CHELLALA",
            "baladyiats": [
              {
                "code": 1409,
                "name": "ZMALET EL EMIR ABDELKADE",
                "name_en": "ZMALET EL EMIR ABDELKADE",
                "name_ar": "زمالة  الأمير عبد القادر"
              },
              {
                "code": 1429,
                "name": "KSAR CHELLALA",
                "name_en": "KSAR CHELLALA",
                "name_ar": "قصر الشلالة"
              },
              {
                "code": 1439,
                "name": "SERGHINE",
                "name_en": "SERGHINE",
                "name_ar": "سرغين"
              }
            ]
          },
          {
            "code": 1433,
            "name": "OUED LILI",
            "name_ar": "وادي ليلي",
            "name_en": "OUED LILI",
            "baladyiats": [
              {
                "code": 1404,
                "name": "SIDI ALI MELLAL",
                "name_en": "SIDI ALI MELLAL",
                "name_ar": "سيدي علي ملال"
              },
              {
                "code": 1433,
                "name": "OUED LILLI",
                "name_en": "OUED LILLI",
                "name_ar": "وادي ليلي"
              },
              {
                "code": 1442,
                "name": "TIDDA",
                "name_en": "TIDDA",
                "name_ar": "تيدة"
              }
            ]
          },
          {
            "code": 1434,
            "name": "MECHRAA SFA",
            "name_ar": "مشرع الصفا",
            "name_en": "MECHRAA SFA",
            "baladyiats": [
              {
                "code": 1424,
                "name": "DJILLALI BEN AMAR",
                "name_en": "DJILLALI BEN AMAR",
                "name_ar": "جيلالي بن عمار"
              },
              {
                "code": 1432,
                "name": "TAGDEMPT",
                "name_en": "TAGDEMPT",
                "name_ar": "تاقدمت"
              },
              {
                "code": 1434,
                "name": "MECHRAA SAFA",
                "name_en": "MECHRAA SAFA",
                "name_ar": "مشرع الصفا"
              }
            ]
          },
          {
            "code": 1435,
            "name": "HAMADIA",
            "name_ar": "حمادية",
            "name_en": "HAMADIA",
            "baladyiats": [
              {
                "code": 1430,
                "name": "RECHAIGA",
                "name_en": "RECHAIGA",
                "name_ar": "الرشايقة"
              },
              {
                "code": 1435,
                "name": "HAMADIA",
                "name_en": "HAMADIA",
                "name_ar": "حمادية"
              },
              {
                "code": 1440,
                "name": "BOUGARA",
                "name_en": "BOUGARA",
                "name_ar": "بوقرة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          32,
          20,
          29,
          48,
          38,
          17,
          3
        ]
      },
      {
        "mattricule": 15,
        "name_ar": "تيزي وزو",
        "name_ber": "ⵝⵉⵣⵉ ⵡⴻⵣⵣⵓ",
        "name_en": "Tizi Ouzou",
        "name": "Tizi Ouzou",
        "phoneCodes": [
          26
        ],
        "postalCodes": [
          15000,
          15001,
          15002,
          15003,
          15004,
          15005,
          15006,
          15007,
          15008,
          15009,
          15010,
          15011,
          15012,
          15013,
          15014,
          15015,
          15016,
          15017,
          15018,
          15019,
          15020,
          15021,
          15022,
          15023,
          15024,
          15025,
          15026,
          15027,
          15028,
          15029,
          15030,
          15031,
          15032,
          15033,
          15034,
          15035,
          15036,
          15037,
          15038,
          15039,
          15040,
          15041,
          15042,
          15043,
          15044,
          15045,
          15046,
          15047,
          15048,
          15049,
          15050,
          15051,
          15052,
          15053,
          15054,
          15055,
          15056,
          15057,
          15058,
          15059,
          15060,
          15061,
          15062,
          15063,
          15064,
          15065,
          15066,
          15067,
          15068,
          15069,
          15070,
          15071,
          15072,
          15073,
          15074,
          15075,
          15076,
          15077,
          15078,
          15079,
          15080,
          15081,
          15082,
          15083,
          15084,
          15085,
          15086,
          15087,
          15088,
          15089,
          15090,
          15091,
          15092,
          15093,
          15094,
          15095,
          15096,
          15097,
          15098,
          15099,
          15100,
          15101,
          15102,
          15103,
          15104,
          15105,
          15106,
          15107,
          15108,
          15109,
          15110,
          15111,
          15112,
          15113,
          15114,
          15115,
          15116,
          15117,
          15118,
          15119,
          15120,
          15121,
          15122,
          15123,
          15124,
          15125,
          15126,
          15127,
          15128,
          15129,
          15130,
          15131,
          15132,
          15133,
          15134,
          15135,
          15136,
          15137,
          15138,
          15139,
          15140,
          15141,
          15142,
          15143,
          15144,
          15145,
          15146,
          15147,
          15148,
          15149,
          15150,
          15151,
          15152,
          15153,
          15154,
          15155,
          15156,
          15157,
          15158,
          15159,
          15160,
          15161,
          15162,
          15163,
          15164,
          15165,
          15166,
          15167
        ],
        "dairats": [
          {
            "code": 1501,
            "name": "TIZI OUZOU",
            "name_ar": "تيزي وزو",
            "name_en": "TIZI OUZOU",
            "baladyiats": [
              {
                "code": 1501,
                "name": "TIZI-OUZOU",
                "name_en": "TIZI-OUZOU",
                "name_ar": "تيزي وزو"
              }
            ]
          },
          {
            "code": 1502,
            "name": "AIN EL HAMMAM",
            "name_ar": "عين الحمام",
            "name_en": "AIN EL HAMMAM",
            "baladyiats": [
              {
                "code": 1502,
                "name": "AIN-EL-HAMMAM",
                "name_en": "AIN-EL-HAMMAM",
                "name_ar": "عين الحمام"
              },
              {
                "code": 1503,
                "name": "AKBIL",
                "name_en": "AKBIL",
                "name_ar": "اقبيل"
              },
              {
                "code": 1527,
                "name": "AIT-YAHIA",
                "name_en": "AIT-YAHIA",
                "name_ar": "أيت يحيى"
              },
              {
                "code": 1531,
                "name": "ABI-YOUCEF",
                "name_en": "ABI-YOUCEF",
                "name_ar": "أبي يوسف"
              }
            ]
          },
          {
            "code": 1509,
            "name": "MAKOUDA",
            "name_ar": "ماكودة",
            "name_en": "MAKOUDA",
            "baladyiats": [
              {
                "code": 1509,
                "name": "MAKOUDA",
                "name_en": "MAKOUDA",
                "name_ar": "ماكودة"
              },
              {
                "code": 1555,
                "name": "BOUDJIMA",
                "name_en": "BOUDJIMA",
                "name_ar": "بوجيمة"
              }
            ]
          },
          {
            "code": 1510,
            "name": "DRAA EL MIZAN",
            "name_ar": "ذراع الميزان",
            "name_en": "DRAA EL MIZAN",
            "baladyiats": [
              {
                "code": 1510,
                "name": "DRAA-EL-MIZAN",
                "name_en": "DRAA-EL-MIZAN",
                "name_ar": "ذراع الميزان"
              },
              {
                "code": 1514,
                "name": "FRIKAT",
                "name_en": "FRIKAT",
                "name_ar": "فريقات"
              },
              {
                "code": 1525,
                "name": "AIN-ZAOUIA",
                "name_en": "AIN-ZAOUIA",
                "name_ar": "عين الزاوية"
              },
              {
                "code": 1556,
                "name": "AIT YAHIA MOUSSA",
                "name_en": "AIT YAHIA MOUSSA",
                "name_ar": "أيت يحي موسى"
              }
            ]
          },
          {
            "code": 1511,
            "name": "TIZI-GHENIF",
            "name_ar": "تيزي غنيف",
            "name_en": "TIZI-GHENIF",
            "baladyiats": [
              {
                "code": 1511,
                "name": "TIZI-GHENIFF",
                "name_en": "TIZI-GHENIFF",
                "name_ar": "تيزي غنيف"
              },
              {
                "code": 1526,
                "name": "M'KIRA",
                "name_en": "M'KIRA",
                "name_ar": "مكيرة"
              }
            ]
          },
          {
            "code": 1517,
            "name": "IFERHOUNENE",
            "name_ar": "إفرحونان",
            "name_en": "IFERHOUNENE",
            "baladyiats": [
              {
                "code": 1517,
                "name": "IFERHOUNENE",
                "name_en": "IFERHOUNENE",
                "name_ar": "إفــرحــونان"
              },
              {
                "code": 1533,
                "name": "ILLILTEN",
                "name_en": "ILLILTEN",
                "name_ar": "إيلـيــلتـن"
              },
              {
                "code": 1563,
                "name": "IMSOUHAL",
                "name_en": "IMSOUHAL",
                "name_ar": "إمســوحال"
              }
            ]
          },
          {
            "code": 1518,
            "name": "AZAZGA",
            "name_ar": "عزازقة",
            "name_en": "AZAZGA",
            "baladyiats": [
              {
                "code": 1504,
                "name": "FREHA",
                "name_en": "FREHA",
                "name_ar": "فريحة"
              },
              {
                "code": 1518,
                "name": "AZAZGA",
                "name_en": "AZAZGA",
                "name_ar": "عزازقة"
              },
              {
                "code": 1520,
                "name": "YAKOURENE",
                "name_en": "YAKOURENE",
                "name_ar": "إعــكورن"
              },
              {
                "code": 1523,
                "name": "ZEKRI",
                "name_en": "ZEKRI",
                "name_ar": "زكري"
              },
              {
                "code": 1541,
                "name": "IFIGHA",
                "name_en": "IFIGHA",
                "name_ar": "إيفيغاء"
              }
            ]
          },
          {
            "code": 1521,
            "name": "LARBAA NATH IRATEN",
            "name_ar": "الأربعاء ناث إيراثن",
            "name_en": "LARBAA NATH IRATEN",
            "baladyiats": [
              {
                "code": 1507,
                "name": "IRDJEN",
                "name_en": "IRDJEN",
                "name_ar": "إيرجـــن"
              },
              {
                "code": 1521,
                "name": "LARBAA NATH IRATHEN",
                "name_en": "LARBAA NATH IRATHEN",
                "name_ar": "الأربعــاء ناث إيراثن"
              },
              {
                "code": 1535,
                "name": "AIT AGGOUACHA",
                "name_en": "AIT AGGOUACHA",
                "name_ar": "أيت عقـواشة"
              }
            ]
          },
          {
            "code": 1522,
            "name": "TIZI RACHED",
            "name_ar": "تيزي راشد",
            "name_en": "TIZI RACHED",
            "baladyiats": [
              {
                "code": 1522,
                "name": "TIZI-RACHED",
                "name_en": "TIZI-RACHED",
                "name_ar": "تيزي راشد"
              },
              {
                "code": 1542,
                "name": "AIT-OUMALOU",
                "name_en": "AIT-OUMALOU",
                "name_ar": "أيت  أومالو"
              }
            ]
          },
          {
            "code": 1524,
            "name": "OUAGUENOUN",
            "name_ar": "واقنون",
            "name_en": "OUAGUENOUN",
            "baladyiats": [
              {
                "code": 1508,
                "name": "TIMIZART",
                "name_en": "TIMIZART",
                "name_ar": "تيمـيزار"
              },
              {
                "code": 1524,
                "name": "OUAGUENOUN",
                "name_en": "OUAGUENOUN",
                "name_ar": "واقنون"
              },
              {
                "code": 1539,
                "name": "AIT-AISSA-MIMOUN",
                "name_en": "AIT-AISSA-MIMOUN",
                "name_ar": "أيت عيسى ميمون"
              }
            ]
          },
          {
            "code": 1529,
            "name": "MAATKAS",
            "name_ar": "معاتقة",
            "name_en": "MAATKAS",
            "baladyiats": [
              {
                "code": 1529,
                "name": "MAATKAS",
                "name_en": "MAATKAS",
                "name_ar": "معـــاتقة"
              },
              {
                "code": 1557,
                "name": "SOUK-EL-TENINE",
                "name_en": "SOUK-EL-TENINE",
                "name_ar": "سوق الإثنين"
              }
            ]
          },
          {
            "code": 1532,
            "name": "BENI DOUALA",
            "name_ar": "بني دوالة",
            "name_en": "BENI DOUALA",
            "baladyiats": [
              {
                "code": 1515,
                "name": "BENI-AISSI",
                "name_en": "BENI-AISSI",
                "name_ar": "بني عيسي"
              },
              {
                "code": 1516,
                "name": "BENI ZMENZER",
                "name_en": "BENI ZMENZER",
                "name_ar": "بنــــي زمنزار"
              },
              {
                "code": 1528,
                "name": "AIT-MAHMOUD",
                "name_en": "AIT-MAHMOUD",
                "name_ar": "أيت محمود"
              },
              {
                "code": 1532,
                "name": "BENI-DOUALA",
                "name_en": "BENI-DOUALA",
                "name_ar": "بني دوالة"
              }
            ]
          },
          {
            "code": 1534,
            "name": "BOUZEGUENE",
            "name_ar": "بوزقن",
            "name_en": "BOUZEGUENE",
            "baladyiats": [
              {
                "code": 1519,
                "name": "ILLOULA OUMALOU",
                "name_en": "ILLOULA OUMALOU",
                "name_ar": "إيلولة أومـــالو"
              },
              {
                "code": 1534,
                "name": "BOUZEGUENE",
                "name_en": "BOUZEGUENE",
                "name_ar": "بوزقــن"
              },
              {
                "code": 1546,
                "name": "BENI-ZIKKI",
                "name_en": "BENI-ZIKKI",
                "name_ar": "بني زيكــي"
              },
              {
                "code": 1549,
                "name": "IDJEUR",
                "name_en": "IDJEUR",
                "name_ar": "إيجــار"
              }
            ]
          },
          {
            "code": 1536,
            "name": "OUADHIAS",
            "name_ar": "واضية",
            "name_en": "OUADHIAS",
            "baladyiats": [
              {
                "code": 1536,
                "name": "OUADHIAS",
                "name_en": "OUADHIAS",
                "name_ar": "واضية"
              },
              {
                "code": 1551,
                "name": "TIZI N'TLETA",
                "name_en": "TIZI N'TLETA",
                "name_ar": "تيزي نثلاثة"
              },
              {
                "code": 1561,
                "name": "AGOUNI-GUEGHRANE",
                "name_en": "AGOUNI-GUEGHRANE",
                "name_ar": "أقني قغران"
              },
              {
                "code": 1565,
                "name": "AIT BOUADDOU",
                "name_en": "AIT BOUADDOU",
                "name_ar": "أيت بــوادو"
              }
            ]
          },
          {
            "code": 1537,
            "name": "AZEFFOUN",
            "name_ar": "أزفون",
            "name_en": "AZEFFOUN",
            "baladyiats": [
              {
                "code": 1513,
                "name": "AIT-CHAFAA",
                "name_en": "AIT-CHAFAA",
                "name_ar": "أيت شافع"
              },
              {
                "code": 1537,
                "name": "AZEFFOUN",
                "name_en": "AZEFFOUN",
                "name_ar": "أزفون"
              },
              {
                "code": 1544,
                "name": "AKERROU",
                "name_en": "AKERROU",
                "name_ar": "أقرو"
              },
              {
                "code": 1553,
                "name": "AGHRIBS",
                "name_en": "AGHRIBS",
                "name_ar": "أغريب"
              }
            ]
          },
          {
            "code": 1538,
            "name": "TIGZIRT",
            "name_ar": "تيقزيرت",
            "name_en": "TIGZIRT",
            "baladyiats": [
              {
                "code": 1538,
                "name": "TIGZIRT",
                "name_en": "TIGZIRT",
                "name_ar": "تيقـزيرت"
              },
              {
                "code": 1554,
                "name": "IFLISSEN",
                "name_en": "IFLISSEN",
                "name_ar": "إفليـــسن"
              },
              {
                "code": 1562,
                "name": "MIZRANA",
                "name_en": "MIZRANA",
                "name_ar": "ميزرانـــة"
              }
            ]
          },
          {
            "code": 1540,
            "name": "BOGHNI",
            "name_ar": "بوغني",
            "name_en": "BOGHNI",
            "baladyiats": [
              {
                "code": 1506,
                "name": "MECHTRAS",
                "name_en": "MECHTRAS",
                "name_ar": "مشطراس"
              },
              {
                "code": 1512,
                "name": "BOUNOUH",
                "name_en": "BOUNOUH",
                "name_ar": "بونوح"
              },
              {
                "code": 1540,
                "name": "BOGHNI",
                "name_en": "BOGHNI",
                "name_ar": "بوغني"
              },
              {
                "code": 1566,
                "name": "ASSI-YOUCEF",
                "name_en": "ASSI-YOUCEF",
                "name_ar": "أسي يوسف"
              }
            ]
          },
          {
            "code": 1547,
            "name": "DRAA BEN KHEDDA",
            "name_ar": "ذراع بن خدة",
            "name_en": "DRAA BEN KHEDDA",
            "baladyiats": [
              {
                "code": 1543,
                "name": "TIRMITINE",
                "name_en": "TIRMITINE",
                "name_ar": "تيرمتين"
              },
              {
                "code": 1547,
                "name": "DRAA-BEN-KHEDDA",
                "name_en": "DRAA-BEN-KHEDDA",
                "name_ar": "ذراع بن خدة"
              },
              {
                "code": 1559,
                "name": "SIDI NAMANE",
                "name_en": "SIDI NAMANE",
                "name_ar": "سيدي نعمان"
              },
              {
                "code": 1564,
                "name": "TADMAIT",
                "name_en": "TADMAIT",
                "name_ar": "تادمايت"
              }
            ]
          },
          {
            "code": 1548,
            "name": "OUACIF",
            "name_ar": "واسيف",
            "name_en": "OUACIF",
            "baladyiats": [
              {
                "code": 1530,
                "name": "AIT BOUMAHDI",
                "name_en": "AIT BOUMAHDI",
                "name_ar": "أيت بومهدي"
              },
              {
                "code": 1548,
                "name": "OUACIF",
                "name_en": "OUACIF",
                "name_ar": "واسيف"
              },
              {
                "code": 1567,
                "name": "AIT-TOUDERT",
                "name_en": "AIT-TOUDERT",
                "name_ar": "أيت تودرت"
              }
            ]
          },
          {
            "code": 1550,
            "name": "MEKLA",
            "name_ar": "مقلع",
            "name_en": "MEKLA",
            "baladyiats": [
              {
                "code": 1505,
                "name": "SOUAMA",
                "name_en": "SOUAMA",
                "name_ar": "صوامـــع"
              },
              {
                "code": 1550,
                "name": "MEKLA",
                "name_en": "MEKLA",
                "name_ar": "مقــلع"
              },
              {
                "code": 1558,
                "name": "AIT KHELLILI",
                "name_en": "AIT KHELLILI",
                "name_ar": "أيت خليلي"
              }
            ]
          },
          {
            "code": 1552,
            "name": "BENNI YENNI",
            "name_ar": "بني يني",
            "name_en": "BENNI YENNI",
            "baladyiats": [
              {
                "code": 1545,
                "name": "YATAFENE",
                "name_en": "YATAFENE",
                "name_ar": "يطــافن"
              },
              {
                "code": 1552,
                "name": "BENI-YENNI",
                "name_en": "BENI-YENNI",
                "name_ar": "بني يني"
              },
              {
                "code": 1560,
                "name": "IBOUDRARENE",
                "name_en": "IBOUDRARENE",
                "name_ar": "إبودرارن"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          10,
          35,
          6
        ]
      },
      {
        "mattricule": 16,
        "name_ar": "الجزائر",
        "name_ber": "ⴷⵣⴰⵢⴻⵔ",
        "name_en": "Algiers",
        "name": "Alger",
        "phoneCodes": [
          21,
          23
        ],
        "postalCodes": [
          16000,
          16001,
          16002,
          16003,
          16007,
          16008,
          16009,
          16010,
          16011,
          16012,
          16013,
          16015,
          16016,
          16020,
          16021,
          16022,
          16023,
          16029,
          16030,
          16034,
          16035,
          16037,
          16038,
          16039,
          16041,
          16052,
          16060,
          16066,
          16067,
          16068,
          16070,
          16071,
          16072,
          16074,
          16075,
          16076,
          16077,
          16078,
          16082,
          16085,
          16100,
          16127,
          16131,
          16132,
          16138,
          16151,
          16155,
          16156,
          16157,
          16158,
          16159,
          16172,
          16173,
          16182,
          16197,
          16203,
          16212,
          16213,
          16216,
          16217,
          16218,
          16229,
          16014,
          16018,
          16028,
          16032,
          16040,
          16043,
          16044,
          16045,
          16047,
          16049,
          16050,
          16062,
          16063,
          16073,
          16080,
          16081,
          16084,
          16086,
          16089,
          16091,
          16093,
          16094,
          16095,
          16096,
          16097,
          16098,
          16099,
          16101,
          16104,
          16106,
          16107,
          16109,
          16110,
          16111,
          16113,
          16114,
          16117,
          16118,
          16119,
          16120,
          16121,
          16122,
          16124,
          16125,
          16126,
          16128,
          16133,
          16134,
          16137,
          16146,
          16148,
          16149,
          16160,
          16171,
          16175,
          16176,
          16177,
          16178,
          16179,
          16180,
          16181,
          16184,
          16185,
          16186,
          16190,
          16191,
          16192,
          16193,
          16201,
          16202,
          16206,
          16208,
          16209,
          16219,
          16225,
          16226,
          16227,
          16230,
          16233,
          16234,
          16004,
          16005,
          16006,
          16017,
          16019,
          16024,
          16025,
          16026,
          16027,
          16031,
          16033,
          16036,
          16042,
          16046,
          16048,
          16051,
          16053,
          16054,
          16055,
          16056,
          16057,
          16058,
          16059,
          16061,
          16064,
          16065,
          16069,
          16079,
          16083,
          16087,
          16088,
          16090,
          16092,
          16102,
          16103,
          16105,
          16108,
          16115,
          16116,
          16123,
          16129,
          16130,
          16135,
          16136,
          16139,
          16140,
          16141,
          16142,
          16143,
          16144,
          16145,
          16147,
          16150,
          16152,
          16153,
          16154,
          16161,
          16162,
          16163,
          16164,
          16165,
          16166,
          16167,
          16168,
          16169,
          16170,
          16174,
          16183,
          16187,
          16188,
          16189,
          16194,
          16195,
          16196,
          16198,
          16199,
          16200,
          16204,
          16205,
          16207,
          16210,
          16211,
          16214,
          16215,
          16220,
          16221,
          16222,
          16223,
          16224,
          16228,
          16231,
          16232
        ],
        "dairats": [
          {
            "code": 1602,
            "name": "SIDI M'HAMED",
            "name_ar": "سيدي امحمد",
            "name_en": "SIDI M'HAMED",
            "baladyiats": [
              {
                "code": 1601,
                "name": "ALGER CENTRE",
                "name_en": "ALGER CENTRE",
                "name_ar": "الجزائر الوسطى"
              },
              {
                "code": 1602,
                "name": "SIDI M'HAMED",
                "name_en": "SIDI M'HAMED",
                "name_ar": "سيدي امحمد"
              },
              {
                "code": 1603,
                "name": "EL MADANIA",
                "name_en": "EL MADANIA",
                "name_ar": "المدنية"
              },
              {
                "code": 1627,
                "name": "EL MOURADIA",
                "name_en": "EL MOURADIA",
                "name_ar": "المرادية"
              }
            ]
          },
          {
            "code": 1605,
            "name": "BAB EL OUED",
            "name_ar": "باب الوادي",
            "name_en": "BAB EL OUED",
            "baladyiats": [
              {
                "code": 1605,
                "name": "BAB EL OUED",
                "name_en": "BAB EL OUED",
                "name_ar": "باب الوادي"
              },
              {
                "code": 1606,
                "name": "BOLOGHINE IBNOU ZIRI",
                "name_en": "BOLOGHINE IBNOU ZIRI",
                "name_ar": "بولوغين بن زيري"
              },
              {
                "code": 1607,
                "name": "CASBAH",
                "name_en": "CASBAH",
                "name_ar": "القصبة"
              },
              {
                "code": 1608,
                "name": "OUED KORICHE",
                "name_en": "OUED KORICHE",
                "name_ar": "وادي قريش"
              },
              {
                "code": 1625,
                "name": "RAIS HAMIDOU",
                "name_en": "RAIS HAMIDOU",
                "name_ar": "الرايس حميدو"
              }
            ]
          },
          {
            "code": 1609,
            "name": "BIR MOURAD RAIS",
            "name_ar": "بئر مراد رايس",
            "name_en": "BIR MOURAD RAIS",
            "baladyiats": [
              {
                "code": 1609,
                "name": "BIR MOURAD RAIS",
                "name_en": "BIR MOURAD RAIS",
                "name_ar": "بئر مراد رايس"
              },
              {
                "code": 1612,
                "name": "BIRKHADEM",
                "name_en": "BIRKHADEM",
                "name_ar": "بئر خادم"
              },
              {
                "code": 1626,
                "name": "DJASR KASENTINA",
                "name_en": "DJASR KASENTINA",
                "name_ar": "جسر قسنطينة"
              },
              {
                "code": 1628,
                "name": "HYDRA",
                "name_en": "HYDRA",
                "name_ar": "حيدرة"
              },
              {
                "code": 1645,
                "name": "SEHAOULA",
                "name_en": "SEHAOULA",
                "name_ar": "السحاولة"
              }
            ]
          },
          {
            "code": 1611,
            "name": "BOUZAREAH",
            "name_ar": "بوزريعة",
            "name_en": "BOUZAREAH",
            "baladyiats": [
              {
                "code": 1610,
                "name": "EL BIAR",
                "name_en": "EL BIAR",
                "name_ar": "الابيار"
              },
              {
                "code": 1611,
                "name": "BOUZAREAH",
                "name_en": "BOUZAREAH",
                "name_ar": "بوزريعة"
              },
              {
                "code": 1622,
                "name": "BEN AKNOUN",
                "name_en": "BEN AKNOUN",
                "name_ar": "ابن عكنون"
              },
              {
                "code": 1632,
                "name": "BENI MESSOUS",
                "name_en": "BENI MESSOUS",
                "name_ar": "بني مسوس"
              }
            ]
          },
          {
            "code": 1613,
            "name": "EL HARRACH",
            "name_ar": "الحراش",
            "name_en": "EL HARRACH",
            "baladyiats": [
              {
                "code": 1613,
                "name": "EL HARRACH",
                "name_en": "EL HARRACH",
                "name_ar": "الحراش"
              },
              {
                "code": 1615,
                "name": "OUED SMAR",
                "name_en": "OUED SMAR",
                "name_ar": "وادي السمار"
              },
              {
                "code": 1616,
                "name": "BOUROUBA",
                "name_en": "BOUROUBA",
                "name_ar": "بوروبة"
              },
              {
                "code": 1619,
                "name": "BACHEDJERAH",
                "name_en": "BACHEDJERAH",
                "name_ar": "باش جراح"
              }
            ]
          },
          {
            "code": 1614,
            "name": "BARAKI",
            "name_ar": "براقي",
            "name_en": "BARAKI",
            "baladyiats": [
              {
                "code": 1614,
                "name": "BARAKI",
                "name_en": "BARAKI",
                "name_ar": "براقي"
              },
              {
                "code": 1633,
                "name": "LES EUCALYPTUS",
                "name_en": "LES EUCALYPTUS",
                "name_ar": "الكاليتوس"
              },
              {
                "code": 1637,
                "name": "SIDI MOUSSA",
                "name_en": "SIDI MOUSSA",
                "name_ar": "سيدي موسى"
              }
            ]
          },
          {
            "code": 1617,
            "name": "HUSSEIN DEY",
            "name_ar": "حسين داي",
            "name_en": "HUSSEIN DEY",
            "baladyiats": [
              {
                "code": 1604,
                "name": "MOHAMED BELOUZDAD",
                "name_en": "MOHAMED BELOUZDAD",
                "name_ar": "محمد بلوزداد"
              },
              {
                "code": 1617,
                "name": "HUSSEIN DEY",
                "name_en": "HUSSEIN DEY",
                "name_ar": "حسين داي"
              },
              {
                "code": 1618,
                "name": "KOUBA",
                "name_en": "KOUBA",
                "name_ar": "القبة"
              },
              {
                "code": 1631,
                "name": "EL MAGHARIA",
                "name_en": "EL MAGHARIA",
                "name_ar": "المغارية"
              }
            ]
          },
          {
            "code": 1620,
            "name": "DAR EL BEIDA",
            "name_ar": "الدار البيضاء",
            "name_en": "DAR EL BEIDA",
            "baladyiats": [
              {
                "code": 1620,
                "name": "DAR EL BEIDA",
                "name_en": "DAR EL BEIDA",
                "name_ar": "الدار البيضاء"
              },
              {
                "code": 1621,
                "name": "BAB EZZOUAR",
                "name_en": "BAB EZZOUAR",
                "name_ar": "باب الزوار"
              },
              {
                "code": 1629,
                "name": "MOHAMMADIA",
                "name_en": "MOHAMMADIA",
                "name_ar": "المحمدية"
              },
              {
                "code": 1630,
                "name": "BORDJ EL KIFFAN",
                "name_en": "BORDJ EL KIFFAN",
                "name_ar": "برج الكيفان"
              },
              {
                "code": 1641,
                "name": "AIN TAYA",
                "name_en": "AIN TAYA",
                "name_ar": "عين طاية"
              },
              {
                "code": 1642,
                "name": "BORDJ EL BAHRI",
                "name_en": "BORDJ EL BAHRI",
                "name_ar": "برج البحري"
              },
              {
                "code": 1643,
                "name": "EL MARSA",
                "name_en": "EL MARSA",
                "name_ar": "المرسى"
              }
            ]
          },
          {
            "code": 1636,
            "name": "BIRTOUTA",
            "name_ar": "بئر توتة",
            "name_en": "BIRTOUTA",
            "baladyiats": [
              {
                "code": 1634,
                "name": "TESSALA EL MERDJA",
                "name_en": "TESSALA EL MERDJA",
                "name_ar": "تسالة المرجة"
              },
              {
                "code": 1635,
                "name": "OULED CHEBEL",
                "name_en": "OULED CHEBEL",
                "name_ar": "اولاد شبل"
              },
              {
                "code": 1636,
                "name": "BIR TOUTA",
                "name_en": "BIR TOUTA",
                "name_ar": "بئر توتة"
              }
            ]
          },
          {
            "code": 1638,
            "name": "ROUIBA",
            "name_ar": "الرويبة",
            "name_en": "ROUIBA",
            "baladyiats": [
              {
                "code": 1638,
                "name": "ROUIBA",
                "name_en": "ROUIBA",
                "name_ar": "الرويبة"
              },
              {
                "code": 1639,
                "name": "HERRAOUA",
                "name_en": "HERRAOUA",
                "name_ar": "هراوة"
              },
              {
                "code": 1640,
                "name": "REGHAIA",
                "name_en": "REGHAIA",
                "name_ar": "رغاية"
              }
            ]
          },
          {
            "code": 1644,
            "name": "ZERALDA",
            "name_ar": "زرالدة",
            "name_en": "ZERALDA",
            "baladyiats": [
              {
                "code": 1644,
                "name": "ZERALDA",
                "name_en": "ZERALDA",
                "name_ar": "زرالدة"
              },
              {
                "code": 1646,
                "name": "MAALMA",
                "name_en": "MAALMA",
                "name_ar": "المعالمة"
              },
              {
                "code": 1650,
                "name": "RAHMANIA",
                "name_en": "RAHMANIA",
                "name_ar": "الرحمانية"
              },
              {
                "code": 1653,
                "name": "STAOUELI",
                "name_en": "STAOUELI",
                "name_ar": "سطاوالي"
              },
              {
                "code": 1655,
                "name": "SOUIDANIA",
                "name_en": "SOUIDANIA",
                "name_ar": "سويدانية"
              }
            ]
          },
          {
            "code": 1649,
            "name": "DRARIA",
            "name_ar": "الدرارية",
            "name_en": "DRARIA",
            "baladyiats": [
              {
                "code": 1647,
                "name": "BABA HASSEN",
                "name_en": "BABA HASSEN",
                "name_ar": "بابا حسن"
              },
              {
                "code": 1648,
                "name": "DOUIRA",
                "name_en": "DOUIRA",
                "name_ar": "الدويرة"
              },
              {
                "code": 1649,
                "name": "DRARIA",
                "name_en": "DRARIA",
                "name_ar": "الدرارية"
              },
              {
                "code": 1654,
                "name": "EL ACHOUR",
                "name_en": "EL ACHOUR",
                "name_ar": "العاشور"
              },
              {
                "code": 1656,
                "name": "KHRAISSIA",
                "name_en": "KHRAISSIA",
                "name_ar": "الخرايسية"
              }
            ]
          },
          {
            "code": 1652,
            "name": "CHERAGA",
            "name_ar": "الشراقة",
            "name_en": "CHERAGA",
            "baladyiats": [
              {
                "code": 1623,
                "name": "DELY IBRAHIM",
                "name_en": "DELY IBRAHIM",
                "name_ar": "دالي ابراهيم"
              },
              {
                "code": 1624,
                "name": "HAMMAMET",
                "name_en": "HAMMAMET",
                "name_ar": "الحمامات"
              },
              {
                "code": 1651,
                "name": "OULED FAYET",
                "name_en": "OULED FAYET",
                "name_ar": "اولاد فايت"
              },
              {
                "code": 1652,
                "name": "CHERAGA",
                "name_en": "CHERAGA",
                "name_ar": "الشراقة"
              },
              {
                "code": 1657,
                "name": "AIN BENIAN",
                "name_en": "AIN BENIAN",
                "name_ar": "عين بنيان"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          9,
          42,
          35
        ]
      },
      {
        "mattricule": 17,
        "name_ar": "الجلفة",
        "name_ber": "ⴵⴻⵍⴼⴰ",
        "name_en": "Djelfa",
        "name": "Djelfa",
        "phoneCodes": [
          27
        ],
        "postalCodes": [
          17000,
          17001,
          17002,
          17003,
          17004,
          17005,
          17006,
          17007,
          17008,
          17009,
          17010,
          17011,
          17012,
          17013,
          17014,
          17015,
          17016,
          17017,
          17018,
          17019,
          17020,
          17021,
          17022,
          17023,
          17024,
          17025,
          17026,
          17027,
          17028,
          17029,
          17030,
          17031,
          17032,
          17033,
          17034,
          17035,
          17036,
          17037,
          17038,
          17039,
          17040,
          17041,
          17042,
          17043,
          17044,
          17045,
          17046,
          17047,
          17048,
          17049,
          17050,
          17051,
          17052,
          17053,
          17054,
          17055,
          17056,
          17057,
          17058,
          17059,
          17060,
          17061,
          17062,
          17063,
          17064,
          17065,
          17066,
          17067,
          17068,
          17069,
          17070,
          17071,
          17072,
          17073,
          17074,
          17075,
          17076,
          17077,
          17078,
          17079,
          17080,
          17081,
          17082,
          17083,
          17084,
          17085,
          17086,
          17087,
          17088
        ],
        "dairats": [
          {
            "code": 1701,
            "name": "DJELFA",
            "name_ar": "الجلفة",
            "name_en": "DJELFA",
            "baladyiats": [
              {
                "code": 1701,
                "name": "DJELFA",
                "name_en": "DJELFA",
                "name_ar": "الجلفة"
              }
            ]
          },
          {
            "code": 1704,
            "name": "HASSI BAHBAH",
            "name_ar": "حاسي بحبح",
            "name_en": "HASSI BAHBAH",
            "baladyiats": [
              {
                "code": 1704,
                "name": "HASSI BAHBAH",
                "name_en": "HASSI BAHBAH",
                "name_ar": "حاسي بحبح"
              },
              {
                "code": 1705,
                "name": "AIN MAABED",
                "name_en": "AIN MAABED",
                "name_ar": "عين معبد"
              },
              {
                "code": 1716,
                "name": "HASSI EL EUCH",
                "name_en": "HASSI EL EUCH",
                "name_ar": "حاسي العش"
              },
              {
                "code": 1728,
                "name": "ZAAFRANE",
                "name_en": "ZAAFRANE",
                "name_ar": "زعفران"
              }
            ]
          },
          {
            "code": 1707,
            "name": "FAIDH EL BOTMA",
            "name_ar": "فيض البطمة",
            "name_en": "FAIDH EL BOTMA",
            "baladyiats": [
              {
                "code": 1707,
                "name": "FAIDH EL BOTMA",
                "name_en": "FAIDH EL BOTMA",
                "name_ar": "فيض البطمة"
              },
              {
                "code": 1724,
                "name": "OUM LAADHAM",
                "name_en": "OUM LAADHAM",
                "name_ar": "أم العظام"
              },
              {
                "code": 1734,
                "name": "AMOURAH",
                "name_en": "AMOURAH",
                "name_ar": "عمورة"
              }
            ]
          },
          {
            "code": 1708,
            "name": "BIRINE",
            "name_ar": "بيرين",
            "name_en": "BIRINE",
            "baladyiats": [
              {
                "code": 1708,
                "name": "BIRINE",
                "name_en": "BIRINE",
                "name_ar": "بيرين"
              },
              {
                "code": 1732,
                "name": "BENHAR",
                "name_en": "BENHAR",
                "name_ar": "بنهار"
              }
            ]
          },
          {
            "code": 1714,
            "name": "EL IDRISSIA",
            "name_ar": "الادريسية",
            "name_en": "EL IDRISSIA",
            "baladyiats": [
              {
                "code": 1714,
                "name": "EL IDRISSIA",
                "name_en": "EL IDRISSIA",
                "name_ar": "الادريسية"
              },
              {
                "code": 1715,
                "name": "DOUIS",
                "name_en": "DOUIS",
                "name_ar": "دويس"
              },
              {
                "code": 1723,
                "name": "AIN CHOUHADA",
                "name_en": "AIN CHOUHADA",
                "name_ar": "عين الشهداء"
              }
            ]
          },
          {
            "code": 1717,
            "name": "MESSAAD",
            "name_ar": "مسعد",
            "name_en": "MESSAAD",
            "baladyiats": [
              {
                "code": 1706,
                "name": "SED RAHAL",
                "name_en": "SED RAHAL",
                "name_ar": "سد الرحال"
              },
              {
                "code": 1717,
                "name": "MESSAAD",
                "name_en": "MESSAAD",
                "name_ar": "مسعد"
              },
              {
                "code": 1718,
                "name": "GUETTARA",
                "name_en": "GUETTARA",
                "name_ar": "قطارة"
              },
              {
                "code": 1722,
                "name": "SELMANA",
                "name_en": "SELMANA",
                "name_ar": "سلمانة"
              },
              {
                "code": 1729,
                "name": "DELDOUL",
                "name_en": "DELDOUL",
                "name_ar": "دلدول"
              }
            ]
          },
          {
            "code": 1719,
            "name": "SIDI LAADJEL",
            "name_ar": "سيدي لعجال",
            "name_en": "SIDI LAADJEL",
            "baladyiats": [
              {
                "code": 1711,
                "name": "EL KHEMIS",
                "name_en": "EL KHEMIS",
                "name_ar": "الخميس"
              },
              {
                "code": 1719,
                "name": "SIDI LAADJEL",
                "name_en": "SIDI LAADJEL",
                "name_ar": "سيدي لعجال"
              },
              {
                "code": 1733,
                "name": "HASSI FEDOUL",
                "name_en": "HASSI FEDOUL",
                "name_ar": "حاسي فدول"
              }
            ]
          },
          {
            "code": 1720,
            "name": "HAD SAHARY",
            "name_ar": "حد الصحاري",
            "name_en": "HAD SAHARY",
            "baladyiats": [
              {
                "code": 1709,
                "name": "BOUIRA LAHDAB",
                "name_en": "BOUIRA LAHDAB",
                "name_ar": "بويرة الأحداب"
              },
              {
                "code": 1720,
                "name": "HAD SAHARY",
                "name_en": "HAD SAHARY",
                "name_ar": "حد الصحاري"
              },
              {
                "code": 1735,
                "name": "AIN FEKKA",
                "name_en": "AIN FEKKA",
                "name_ar": "عين فقه"
              }
            ]
          },
          {
            "code": 1725,
            "name": "DAR CHIOUKH",
            "name_ar": "دار الشيوخ",
            "name_en": "DAR CHIOUKH",
            "baladyiats": [
              {
                "code": 1712,
                "name": "SIDI BAIZID",
                "name_en": "SIDI BAIZID",
                "name_ar": "سيدي بايزيد"
              },
              {
                "code": 1713,
                "name": "M'LILIHA",
                "name_en": "M'LILIHA",
                "name_ar": "مليليحة"
              },
              {
                "code": 1725,
                "name": "DAR CHIOUKH",
                "name_en": "DAR CHIOUKH",
                "name_ar": "دار الشيوخ"
              }
            ]
          },
          {
            "code": 1726,
            "name": "CHAREF",
            "name_ar": "الشارف",
            "name_en": "CHAREF",
            "baladyiats": [
              {
                "code": 1703,
                "name": "EL GUEDID",
                "name_en": "EL GUEDID",
                "name_ar": "القديد"
              },
              {
                "code": 1726,
                "name": "CHAREF",
                "name_en": "CHAREF",
                "name_ar": "الشارف"
              },
              {
                "code": 1727,
                "name": "BENYAGOUB",
                "name_en": "BENYAGOUB",
                "name_ar": "بن يعقوب"
              }
            ]
          },
          {
            "code": 1730,
            "name": "AIN EL IBEL",
            "name_ar": "عين الإبل",
            "name_en": "AIN EL IBEL",
            "baladyiats": [
              {
                "code": 1702,
                "name": "MOUDJEBARA",
                "name_en": "MOUDJEBARA",
                "name_ar": "مجبارة"
              },
              {
                "code": 1710,
                "name": "ZACCAR",
                "name_en": "ZACCAR",
                "name_ar": "زكار"
              },
              {
                "code": 1730,
                "name": "AIN EL IBEL",
                "name_en": "AIN EL IBEL",
                "name_ar": "عين الإبل"
              },
              {
                "code": 1736,
                "name": "TAADMIT",
                "name_en": "TAADMIT",
                "name_ar": "تعظميت"
              }
            ]
          },
          {
            "code": 1731,
            "name": "AIN OUSSERA",
            "name_ar": "عين وسارة",
            "name_en": "AIN OUSSERA",
            "baladyiats": [
              {
                "code": 1721,
                "name": "GUERNINI",
                "name_en": "GUERNINI",
                "name_ar": "قرنيني"
              },
              {
                "code": 1731,
                "name": "AIN OUSSERA",
                "name_en": "AIN OUSSERA",
                "name_ar": "عين وسارة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          3,
          14,
          38,
          26,
          28,
          7,
          30,
          47
        ]
      },
      {
        "mattricule": 18,
        "name_ar": "جيجل",
        "name_ber": "ⵉⵖⵉⵍ ⴳⵉⵍⵉ",
        "name_en": "Jijel",
        "name": "Jijel",
        "phoneCodes": [
          34
        ],
        "postalCodes": [
          18000,
          18001,
          18002,
          18003,
          18004,
          18005,
          18006,
          18007,
          18008,
          18009,
          18010,
          18011,
          18012,
          18013,
          18014,
          18015,
          18016,
          18017,
          18018,
          18019,
          18020,
          18021,
          18022,
          18023,
          18024,
          18025,
          18026,
          18027,
          18028,
          18029,
          18030,
          18031,
          18032,
          18033,
          18034,
          18035,
          18036,
          18037,
          18038,
          18039,
          18040,
          18041,
          18043,
          18045,
          18046,
          18047,
          18048,
          18049,
          18050,
          18051,
          18052,
          18053,
          18054,
          18055,
          18056
        ],
        "dairats": [
          {
            "code": 1801,
            "name": "JIJEL",
            "name_ar": "جيجل",
            "name_en": "JIJEL",
            "baladyiats": [
              {
                "code": 1801,
                "name": "JIJEL",
                "name_en": "JIJEL",
                "name_ar": "جيجل"
              }
            ]
          },
          {
            "code": 1803,
            "name": "EL AOUANA",
            "name_ar": "العوانة",
            "name_en": "EL AOUANA",
            "baladyiats": [
              {
                "code": 1803,
                "name": "EL AOUANA",
                "name_en": "EL AOUANA",
                "name_ar": "العوانة"
              },
              {
                "code": 1818,
                "name": "SELMA BENZIADA",
                "name_en": "SELMA BENZIADA",
                "name_ar": "سلمى بن زيادة"
              }
            ]
          },
          {
            "code": 1804,
            "name": "ZIAMAH MANSOURIAH",
            "name_ar": "زيامة منصورية",
            "name_en": "ZIAMAH MANSOURIAH",
            "baladyiats": [
              {
                "code": 1802,
                "name": "ERRAGUENE SOUISSI",
                "name_en": "ERRAGUENE SOUISSI",
                "name_ar": "أراقن سويسي"
              },
              {
                "code": 1804,
                "name": "ZIAMA MANSOURIAH",
                "name_en": "ZIAMA MANSOURIAH",
                "name_ar": "زيامة منصورية"
              }
            ]
          },
          {
            "code": 1805,
            "name": "TAHER",
            "name_ar": "الطاهير",
            "name_en": "TAHER",
            "baladyiats": [
              {
                "code": 1805,
                "name": "TAHER",
                "name_en": "TAHER",
                "name_ar": "الطاهير"
              },
              {
                "code": 1806,
                "name": "EMIR ABDELKADER",
                "name_en": "EMIR ABDELKADER",
                "name_ar": "الامير عبد القادر"
              },
              {
                "code": 1808,
                "name": "CHAHNA",
                "name_en": "CHAHNA",
                "name_ar": "الشحنة"
              },
              {
                "code": 1819,
                "name": "BOUSSIF OULED ASKEUR",
                "name_en": "BOUSSIF OULED ASKEUR",
                "name_ar": "بوسيف أولاد عسكر"
              },
              {
                "code": 1828,
                "name": "OUDJANA",
                "name_en": "OUDJANA",
                "name_ar": "وجانة"
              }
            ]
          },
          {
            "code": 1807,
            "name": "CHEKFA",
            "name_ar": "الشقفة",
            "name_en": "CHEKFA",
            "baladyiats": [
              {
                "code": 1807,
                "name": "CHEKFA",
                "name_en": "CHEKFA",
                "name_ar": "الشقفة"
              },
              {
                "code": 1813,
                "name": "SIDI ABDELAZIZ",
                "name_en": "SIDI ABDELAZIZ",
                "name_ar": "سيدي عبد العزيز"
              },
              {
                "code": 1820,
                "name": "EL KENNAR NOUCHFI",
                "name_en": "EL KENNAR NOUCHFI",
                "name_ar": "القنار نشفي"
              },
              {
                "code": 1826,
                "name": "BORDJ T'HAR",
                "name_en": "BORDJ T'HAR",
                "name_ar": "برج الطهر"
              }
            ]
          },
          {
            "code": 1809,
            "name": "EL MILIA",
            "name_ar": "الميلية",
            "name_en": "EL MILIA",
            "baladyiats": [
              {
                "code": 1809,
                "name": "EL MILIA",
                "name_en": "EL MILIA",
                "name_ar": "الميلية"
              },
              {
                "code": 1821,
                "name": "OULED YAHIA KHADROUCH",
                "name_en": "OULED YAHIA KHADROUCH",
                "name_ar": "أولاد يحيى خدروش"
              }
            ]
          },
          {
            "code": 1810,
            "name": "SIDI MAROUF",
            "name_ar": "سيدي معروف",
            "name_en": "SIDI MAROUF",
            "baladyiats": [
              {
                "code": 1810,
                "name": "SIDI MAROUF",
                "name_en": "SIDI MAROUF",
                "name_ar": "سيدي معروف"
              },
              {
                "code": 1827,
                "name": "OULED RABAH",
                "name_en": "OULED RABAH",
                "name_ar": "أولاد رابح"
              }
            ]
          },
          {
            "code": 1811,
            "name": "SETTARA",
            "name_ar": "السطارة",
            "name_en": "SETTARA",
            "baladyiats": [
              {
                "code": 1811,
                "name": "SETTARA",
                "name_en": "SETTARA",
                "name_ar": "السطارة"
              },
              {
                "code": 1815,
                "name": "GHEBALA",
                "name_en": "GHEBALA",
                "name_ar": "غبالة"
              }
            ]
          },
          {
            "code": 1812,
            "name": "EL ANCER",
            "name_ar": "العنصر",
            "name_en": "EL ANCER",
            "baladyiats": [
              {
                "code": 1812,
                "name": "EL ANCER",
                "name_en": "EL ANCER",
                "name_ar": "العنصر"
              },
              {
                "code": 1816,
                "name": "BOURAOUI BELHADEF",
                "name_en": "BOURAOUI BELHADEF",
                "name_ar": "بوراوي بلهادف"
              },
              {
                "code": 1823,
                "name": "KHIRI OUED ADJOUL",
                "name_en": "KHIRI OUED ADJOUL",
                "name_ar": "خيري واد عجول"
              },
              {
                "code": 1825,
                "name": "DJEMAA BENI HABIBI",
                "name_en": "DJEMAA BENI HABIBI",
                "name_ar": "الجمعة بني حبيبي"
              }
            ]
          },
          {
            "code": 1817,
            "name": "DJIMLA",
            "name_ar": "جيملة",
            "name_en": "DJIMLA",
            "baladyiats": [
              {
                "code": 1817,
                "name": "DJIMLA",
                "name_en": "DJIMLA",
                "name_ar": "جيملة"
              },
              {
                "code": 1822,
                "name": "BOUDRIA BENIYADJIS",
                "name_en": "BOUDRIA BENIYADJIS",
                "name_ar": "بودريعة بني  ياجيس"
              }
            ]
          },
          {
            "code": 1824,
            "name": "TEXENNA",
            "name_ar": "تاكسنة",
            "name_en": "TEXENNA",
            "baladyiats": [
              {
                "code": 1814,
                "name": "KAOUS",
                "name_en": "KAOUS",
                "name_ar": "قاوس"
              },
              {
                "code": 1824,
                "name": "TEXENNA",
                "name_en": "TEXENNA",
                "name_ar": "تاكسنة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          43,
          19,
          6,
          21
        ]
      },
      {
        "mattricule": 19,
        "name_ar": "سطيف",
        "name_ber": "ⵙⵟⵉⴼ",
        "name_en": "Setif",
        "name": "Sétif",
        "phoneCodes": [
          36
        ],
        "postalCodes": [
          19000,
          19001,
          19002,
          19003,
          19004,
          19005,
          19006,
          19007,
          19008,
          19009,
          19010,
          19011,
          19012,
          19013,
          19014,
          19015,
          19016,
          19017,
          19018,
          19019,
          19020,
          19021,
          19022,
          19023,
          19024,
          19025,
          19026,
          19027,
          19028,
          19029,
          19030,
          19031,
          19032,
          19033,
          19034,
          19035,
          19036,
          19037,
          19038,
          19039,
          19040,
          19041,
          19042,
          19043,
          19044,
          19045,
          19046,
          19047,
          19048,
          19049,
          19050,
          19051,
          19052,
          19053,
          19054,
          19055,
          19056,
          19057,
          19058,
          19059,
          19060,
          19061,
          19062,
          19063,
          19064,
          19065,
          19066,
          19067,
          19068,
          19069,
          19070,
          19071,
          19072,
          19073,
          19074,
          19075,
          19076,
          19077,
          19078,
          19079,
          19080,
          19081,
          19082,
          19083,
          19084,
          19085,
          19086,
          19087,
          19088,
          19089,
          19090,
          19091,
          19092,
          19093,
          19094,
          19095,
          19096,
          19097,
          19098,
          19099,
          19100,
          19101,
          19102,
          19103,
          19104,
          19105,
          19106,
          19107,
          19108,
          19109,
          19110,
          19111,
          19113,
          19114,
          19115,
          19116,
          19117,
          19118,
          19119,
          19120,
          19121,
          19122,
          19123,
          19124,
          19125,
          19127,
          19128,
          19129,
          19130,
          19131,
          19132,
          19133,
          19134,
          19135,
          19136,
          19137,
          19138,
          19139,
          19140,
          19141,
          19142,
          19143,
          19144
        ],
        "dairats": [
          {
            "code": 1901,
            "name": "SETIF",
            "name_ar": "سطيف",
            "name_en": "SETIF",
            "baladyiats": [
              {
                "code": 1901,
                "name": "SETIF",
                "name_en": "SETIF",
                "name_ar": "سطيف"
              }
            ]
          },
          {
            "code": 1902,
            "name": "AIN EL KEBIRA",
            "name_ar": "عين الكبيرة",
            "name_en": "AIN EL KEBIRA",
            "baladyiats": [
              {
                "code": 1902,
                "name": "AIN EL KEBIRA",
                "name_en": "AIN EL KEBIRA",
                "name_ar": "عين الكبيرة"
              },
              {
                "code": 1915,
                "name": "DEHAMCHA",
                "name_en": "DEHAMCHA",
                "name_ar": "الدهامشة"
              },
              {
                "code": 1924,
                "name": "OULED ADDOUANE",
                "name_en": "OULED ADDOUANE",
                "name_ar": "أولاد عدوان"
              }
            ]
          },
          {
            "code": 1903,
            "name": "BENI AZIZ",
            "name_ar": "بني عزيز",
            "name_en": "BENI AZIZ",
            "baladyiats": [
              {
                "code": 1903,
                "name": "BENI-AZIZ",
                "name_en": "BENI-AZIZ",
                "name_ar": "بني عزيز"
              },
              {
                "code": 1912,
                "name": "MAAOUIA",
                "name_en": "MAAOUIA",
                "name_ar": "معاوية"
              },
              {
                "code": 1949,
                "name": "AIN-SEBT",
                "name_en": "AIN-SEBT",
                "name_ar": "عين السبت"
              }
            ]
          },
          {
            "code": 1908,
            "name": "BIR EL ARCH",
            "name_ar": "بئر العرش",
            "name_en": "BIR EL ARCH",
            "baladyiats": [
              {
                "code": 1908,
                "name": "BIR-EL-ARCH",
                "name_en": "BIR-EL-ARCH",
                "name_ar": "بئر العرش"
              },
              {
                "code": 1925,
                "name": "BELLAA",
                "name_en": "BELLAA",
                "name_ar": "بلاعة"
              },
              {
                "code": 1945,
                "name": "TACHOUDA",
                "name_en": "TACHOUDA",
                "name_ar": "تاشودة"
              },
              {
                "code": 1959,
                "name": "EL-OULDJA",
                "name_en": "EL-OULDJA",
                "name_ar": "الولجة"
              }
            ]
          },
          {
            "code": 1916,
            "name": "BABOR",
            "name_ar": "بابور",
            "name_en": "BABOR",
            "baladyiats": [
              {
                "code": 1916,
                "name": "BABOR",
                "name_en": "BABOR",
                "name_ar": "بابور"
              },
              {
                "code": 1935,
                "name": "SERDJ-EL-GHOUL",
                "name_en": "SERDJ-EL-GHOUL",
                "name_ar": "سرج الغول"
              }
            ]
          },
          {
            "code": 1917,
            "name": "GUIDJEL",
            "name_ar": "قجال",
            "name_en": "GUIDJEL",
            "baladyiats": [
              {
                "code": 1917,
                "name": "GUIDJEL",
                "name_en": "GUIDJEL",
                "name_ar": "قجال"
              },
              {
                "code": 1947,
                "name": "OULED SABOR",
                "name_en": "OULED SABOR",
                "name_ar": "أولاد صابر"
              }
            ]
          },
          {
            "code": 1920,
            "name": "EL EULMA",
            "name_ar": "العلمة",
            "name_en": "EL EULMA",
            "baladyiats": [
              {
                "code": 1920,
                "name": "EL EULMA",
                "name_en": "EL EULMA",
                "name_ar": "العلمة"
              },
              {
                "code": 1931,
                "name": "BAZER-SAKRA",
                "name_en": "BAZER-SAKRA",
                "name_ar": "بازر سكرة"
              },
              {
                "code": 1956,
                "name": "GUELTA ZERKA",
                "name_en": "GUELTA ZERKA",
                "name_ar": "قلتة زرقاء"
              }
            ]
          },
          {
            "code": 1921,
            "name": "DJEMILA",
            "name_ar": "جميلة",
            "name_en": "DJEMILA",
            "baladyiats": [
              {
                "code": 1921,
                "name": "DJEMILA",
                "name_en": "DJEMILA",
                "name_ar": "جميلة"
              },
              {
                "code": 1944,
                "name": "BENI FOUDA",
                "name_en": "BENI FOUDA",
                "name_ar": "بني فودة"
              }
            ]
          },
          {
            "code": 1922,
            "name": "BENI OURTILANE",
            "name_ar": "بني ورتيلان",
            "name_en": "BENI OURTILANE",
            "baladyiats": [
              {
                "code": 1909,
                "name": "BENI CHEBANA",
                "name_en": "BENI CHEBANA",
                "name_ar": "بني شبانة"
              },
              {
                "code": 1913,
                "name": "AIN-LEGRADJ",
                "name_en": "AIN-LEGRADJ",
                "name_ar": "عين لقراج"
              },
              {
                "code": 1922,
                "name": "BENI OURTILANE",
                "name_en": "BENI OURTILANE",
                "name_ar": "بني ورتيلان"
              },
              {
                "code": 1946,
                "name": "BENI-MOUHLI",
                "name_en": "BENI-MOUHLI",
                "name_ar": "بني موحلي"
              }
            ]
          },
          {
            "code": 1926,
            "name": "AIN ARNAT",
            "name_ar": "عين أرنات",
            "name_en": "AIN ARNAT",
            "baladyiats": [
              {
                "code": 1914,
                "name": "AIN ABESSA",
                "name_en": "AIN ABESSA",
                "name_ar": "عين عباسة"
              },
              {
                "code": 1926,
                "name": "AIN ARNAT",
                "name_en": "AIN ARNAT",
                "name_ar": "عين أرنات"
              },
              {
                "code": 1933,
                "name": "MEZLOUG",
                "name_en": "MEZLOUG",
                "name_ar": "مزلوق"
              },
              {
                "code": 1937,
                "name": "EL OURICIA",
                "name_en": "EL OURICIA",
                "name_ar": "أوريسيا"
              }
            ]
          },
          {
            "code": 1927,
            "name": "AMOUCHA",
            "name_ar": "عموشة",
            "name_en": "AMOUCHA",
            "baladyiats": [
              {
                "code": 1927,
                "name": "AMOUCHA",
                "name_en": "AMOUCHA",
                "name_ar": "عموشة"
              },
              {
                "code": 1938,
                "name": "TIZI N'BECHAR",
                "name_en": "TIZI N'BECHAR",
                "name_ar": "تيزي نبشار"
              },
              {
                "code": 1957,
                "name": "OUED EL BARED",
                "name_en": "OUED EL BARED",
                "name_ar": "واد البارد"
              }
            ]
          },
          {
            "code": 1928,
            "name": "AIN OULMENE",
            "name_ar": "عين ولمان",
            "name_en": "AIN OULMENE",
            "baladyiats": [
              {
                "code": 1904,
                "name": "OULED SI AHMED",
                "name_en": "OULED SI AHMED",
                "name_ar": "أولاد سي أحمد"
              },
              {
                "code": 1928,
                "name": "AIN OULMENE",
                "name_en": "AIN OULMENE",
                "name_ar": "عين ولمان"
              },
              {
                "code": 1948,
                "name": "GUELLAL",
                "name_en": "GUELLAL",
                "name_ar": "قلال"
              },
              {
                "code": 1952,
                "name": "KASR EL ABTAL",
                "name_en": "KASR EL ABTAL",
                "name_ar": "قصر الابطال"
              }
            ]
          },
          {
            "code": 1930,
            "name": "BOUANDAS",
            "name_ar": "بوعنداس",
            "name_en": "BOUANDAS",
            "baladyiats": [
              {
                "code": 1919,
                "name": "BOUSSELAM",
                "name_en": "BOUSSELAM",
                "name_ar": "بوسلام"
              },
              {
                "code": 1930,
                "name": "BOUANDAS",
                "name_en": "BOUANDAS",
                "name_ar": "بوعنداس"
              },
              {
                "code": 1951,
                "name": "AIT NAOUAL MEZADA",
                "name_en": "AIT NAOUAL MEZADA",
                "name_ar": "أيت نوال مزادة"
              },
              {
                "code": 1954,
                "name": "AIT-TIZI",
                "name_en": "AIT-TIZI",
                "name_ar": "ايت تيزي"
              }
            ]
          },
          {
            "code": 1932,
            "name": "HAMMAM SOKHNA",
            "name_ar": "حمام السخنة",
            "name_en": "HAMMAM SOKHNA",
            "baladyiats": [
              {
                "code": 1932,
                "name": "HAMAM SOUKHNA",
                "name_en": "HAMAM SOUKHNA",
                "name_ar": "حمام السخنة"
              },
              {
                "code": 1958,
                "name": "TAYA",
                "name_en": "TAYA",
                "name_ar": "الطاية"
              },
              {
                "code": 1960,
                "name": "TELLA",
                "name_en": "TELLA",
                "name_ar": "التلة"
              }
            ]
          },
          {
            "code": 1939,
            "name": "SALAH BEY",
            "name_ar": "صالح باي",
            "name_en": "SALAH BEY",
            "baladyiats": [
              {
                "code": 1905,
                "name": "BOUTALEB",
                "name_en": "BOUTALEB",
                "name_ar": "بوطالب"
              },
              {
                "code": 1910,
                "name": "OULED TEBBEN",
                "name_en": "OULED TEBBEN",
                "name_ar": "أولاد تبان"
              },
              {
                "code": 1911,
                "name": "HAMMA",
                "name_en": "HAMMA",
                "name_ar": "الحامة"
              },
              {
                "code": 1923,
                "name": "ROSFA",
                "name_en": "ROSFA",
                "name_ar": "الرصفة"
              },
              {
                "code": 1939,
                "name": "SALAH BEY",
                "name_en": "SALAH BEY",
                "name_ar": "صالح باي"
              }
            ]
          },
          {
            "code": 1940,
            "name": "AIN AZEL",
            "name_ar": "عين أزال",
            "name_en": "AIN AZEL",
            "baladyiats": [
              {
                "code": 1918,
                "name": "AIN LAHDJAR",
                "name_en": "AIN LAHDJAR",
                "name_ar": "عين الحجر"
              },
              {
                "code": 1929,
                "name": "BEIDHA BORDJ",
                "name_en": "BEIDHA BORDJ",
                "name_ar": "بيضاء برج"
              },
              {
                "code": 1934,
                "name": "BIR HADDADA",
                "name_en": "BIR HADDADA",
                "name_ar": "بئر حدادة"
              },
              {
                "code": 1940,
                "name": "AIN AZEL",
                "name_en": "AIN AZEL",
                "name_ar": "عين أزال"
              }
            ]
          },
          {
            "code": 1941,
            "name": "GUENZET",
            "name_ar": "قنزات",
            "name_en": "GUENZET",
            "baladyiats": [
              {
                "code": 1936,
                "name": "HARBIL",
                "name_en": "HARBIL",
                "name_ar": "حربيل"
              },
              {
                "code": 1941,
                "name": "GUENZET",
                "name_en": "GUENZET",
                "name_ar": "قنزات"
              }
            ]
          },
          {
            "code": 1943,
            "name": "BOUGAA",
            "name_ar": "بوقاعة",
            "name_en": "BOUGAA",
            "baladyiats": [
              {
                "code": 1906,
                "name": "AIN-ROUA",
                "name_en": "AIN-ROUA",
                "name_ar": "عين الروى"
              },
              {
                "code": 1943,
                "name": "BOUGAA",
                "name_en": "BOUGAA",
                "name_ar": "بوقاعة"
              },
              {
                "code": 1953,
                "name": "BENI OUSSINE",
                "name_en": "BENI OUSSINE",
                "name_ar": "بني وسين"
              }
            ]
          },
          {
            "code": 1950,
            "name": "HAMMAM GUERGOUR",
            "name_ar": "حمام قرقور",
            "name_en": "HAMMAM GUERGOUR",
            "baladyiats": [
              {
                "code": 1907,
                "name": "DRAA-KEBILA",
                "name_en": "DRAA-KEBILA",
                "name_ar": "ذراع قبيلة"
              },
              {
                "code": 1950,
                "name": "HAMMAM GUERGOUR",
                "name_en": "HAMMAM GUERGOUR",
                "name_ar": "حمام قرقور"
              }
            ]
          },
          {
            "code": 1955,
            "name": "MAOKLANE",
            "name_ar": "ماوكلان",
            "name_en": "MAOKLANE",
            "baladyiats": [
              {
                "code": 1942,
                "name": "TALA-IFACENE",
                "name_en": "TALA-IFACENE",
                "name_ar": "تالة إيفاسن"
              },
              {
                "code": 1955,
                "name": "MAOUAKLANE",
                "name_en": "MAOUAKLANE",
                "name_ar": "ماوكلان"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          5,
          28,
          34,
          6,
          18,
          43
        ]
      },
      {
        "mattricule": 20,
        "name_ar": "سعيدة",
        "name_ber": "ⵙⵄⵉⴷⴰ",
        "name_en": "Saefda",
        "name": "Saefda",
        "phoneCodes": [
          48
        ],
        "postalCodes": [
          20000,
          20001,
          20002,
          20003,
          20004,
          20005,
          20006,
          20007,
          20008,
          20009,
          20010,
          20011,
          20012,
          20013,
          20014,
          20015,
          20016,
          20017,
          20018,
          20019,
          20020,
          20021,
          20022,
          20023,
          20024,
          20025,
          20026,
          20027,
          20028,
          20029,
          20030,
          20031,
          20032,
          20033,
          20034,
          20035,
          20036,
          20037,
          20038,
          20039,
          20040,
          20041,
          20042,
          20043,
          20044,
          20045,
          20046,
          20047,
          20048,
          20049,
          20050,
          20051
        ],
        "dairats": [
          {
            "code": 2001,
            "name": "SAIDA",
            "name_ar": "سعيدة",
            "name_en": "SAIDA",
            "baladyiats": [
              {
                "code": 2001,
                "name": "SAIDA",
                "name_en": "SAIDA",
                "name_ar": "سعيدة"
              }
            ]
          },
          {
            "code": 2003,
            "name": "AIN EL HADJAR",
            "name_ar": "عين الحجر",
            "name_en": "AIN EL HADJAR",
            "baladyiats": [
              {
                "code": 2003,
                "name": "AIN EL HADJAR",
                "name_en": "AIN EL HADJAR",
                "name_ar": "عين الحجر"
              },
              {
                "code": 2005,
                "name": "MOULAY LARBI",
                "name_en": "MOULAY LARBI",
                "name_ar": "مولاي العربي"
              },
              {
                "code": 2012,
                "name": "SIDI AHMED",
                "name_en": "SIDI AHMED",
                "name_ar": "سيدي احمد"
              }
            ]
          },
          {
            "code": 2006,
            "name": "YOUB",
            "name_ar": "يوب",
            "name_en": "YOUB",
            "baladyiats": [
              {
                "code": 2002,
                "name": "DOUI THABET",
                "name_en": "DOUI THABET",
                "name_ar": "دوي ثابت"
              },
              {
                "code": 2006,
                "name": "YOUB",
                "name_en": "YOUB",
                "name_ar": "يوب"
              }
            ]
          },
          {
            "code": 2009,
            "name": "SIDI BOUBEKEUR",
            "name_ar": "سيدي بوبكر",
            "name_en": "SIDI BOUBEKEUR",
            "baladyiats": [
              {
                "code": 2004,
                "name": "OULED KHALED",
                "name_en": "OULED KHALED",
                "name_ar": "أولاد خالد"
              },
              {
                "code": 2007,
                "name": "HOUNET",
                "name_en": "HOUNET",
                "name_ar": "هونت"
              },
              {
                "code": 2008,
                "name": "SIDI AMAR",
                "name_en": "SIDI AMAR",
                "name_ar": "سيدي عمر"
              },
              {
                "code": 2009,
                "name": "SIDI BOUBEKEUR",
                "name_en": "SIDI BOUBEKEUR",
                "name_ar": "سيدي بوبكر"
              }
            ]
          },
          {
            "code": 2010,
            "name": "EL HASSASNA",
            "name_ar": "الحساسنة",
            "name_en": "EL HASSASNA",
            "baladyiats": [
              {
                "code": 2010,
                "name": "EL HASSASNA",
                "name_en": "EL HASSASNA",
                "name_ar": "الحساسنة"
              },
              {
                "code": 2011,
                "name": "MAAMORA",
                "name_en": "MAAMORA",
                "name_ar": "المعمورة"
              },
              {
                "code": 2013,
                "name": "AIN SEKHOUNA",
                "name_en": "AIN SEKHOUNA",
                "name_ar": "عين السخونة"
              }
            ]
          },
          {
            "code": 2014,
            "name": "OULED BRAHIM",
            "name_ar": "أولاد ابراهيم",
            "name_en": "OULED BRAHIM",
            "baladyiats": [
              {
                "code": 2014,
                "name": "OULED BRAHIM",
                "name_en": "OULED BRAHIM",
                "name_ar": "أولاد إبراهيم"
              },
              {
                "code": 2015,
                "name": "TIRCINE",
                "name_en": "TIRCINE",
                "name_ar": "تيرسين"
              },
              {
                "code": 2016,
                "name": "AIN SOLTANE",
                "name_en": "AIN SOLTANE",
                "name_ar": "عين السلطان"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          32,
          22,
          29,
          15
        ]
      },
      {
        "mattricule": 21,
        "name_ar": "سكيكدة",
        "name_ber": "ⵙⴽⵉⴽⴷⴰ",
        "name_en": "Skikda",
        "name": "Skikda",
        "phoneCodes": [
          38
        ],
        "postalCodes": [
          21000,
          21001,
          21002,
          21003,
          21004,
          21005,
          21006,
          21007,
          21008,
          21009,
          21010,
          21011,
          21012,
          21013,
          21014,
          21015,
          21016,
          21017,
          21018,
          21019,
          21020,
          21021,
          21022,
          21023,
          21024,
          21025,
          21026,
          21027,
          21028,
          21029,
          21030,
          21031,
          21032,
          21033,
          21034,
          21035,
          21036,
          21037,
          21038,
          21039,
          21040,
          21041,
          21042,
          21043,
          21044,
          21045,
          21046,
          21047,
          21048,
          21049,
          21050,
          21051,
          21052,
          21053,
          21054,
          21055,
          21056,
          21057,
          21058,
          21059,
          21060,
          21061,
          21062,
          21063,
          21064,
          21065,
          21066,
          21067,
          21068,
          21069,
          21070,
          21071,
          21072,
          21073,
          21074,
          21075,
          21076,
          21077,
          21078,
          21079,
          21080,
          21081,
          21082,
          21083,
          21084,
          21085
        ],
        "dairats": [
          {
            "code": 2101,
            "name": "SKIKDA",
            "name_ar": "سكيكدة",
            "name_en": "SKIKDA",
            "baladyiats": [
              {
                "code": 2101,
                "name": "SKIKDA",
                "name_en": "SKIKDA",
                "name_ar": "سكيكدة"
              },
              {
                "code": 2130,
                "name": "FILFILA",
                "name_en": "FILFILA",
                "name_ar": "فلفلة"
              },
              {
                "code": 2137,
                "name": "HAMMADI KROUMA",
                "name_en": "HAMMADI KROUMA",
                "name_ar": "حمادي كرومة"
              }
            ]
          },
          {
            "code": 2103,
            "name": "EL HADAIEK",
            "name_ar": "الحدائق",
            "name_en": "EL HADAIEK",
            "baladyiats": [
              {
                "code": 2102,
                "name": "AIN ZOUIT",
                "name_en": "AIN ZOUIT",
                "name_ar": "عين زويت"
              },
              {
                "code": 2103,
                "name": "EL HADAIEK",
                "name_en": "EL HADAIEK",
                "name_ar": "الحدائق"
              },
              {
                "code": 2134,
                "name": "BOUCHETATA",
                "name_en": "BOUCHETATA",
                "name_ar": "بوشطاطة"
              }
            ]
          },
          {
            "code": 2104,
            "name": "AZZABA",
            "name_ar": "عزابة",
            "name_en": "AZZABA",
            "baladyiats": [
              {
                "code": 2104,
                "name": "AZZABA",
                "name_en": "AZZABA",
                "name_ar": "عزابة"
              },
              {
                "code": 2105,
                "name": "DJENDEL SAADI MOHAMED",
                "name_en": "DJENDEL SAADI MOHAMED",
                "name_ar": "جندل سعدي محمد"
              },
              {
                "code": 2106,
                "name": "AIN CHARCHAR",
                "name_en": "AIN CHARCHAR",
                "name_ar": "عين شرشار"
              },
              {
                "code": 2109,
                "name": "ES SEBT",
                "name_en": "ES SEBT",
                "name_ar": "السبت"
              },
              {
                "code": 2133,
                "name": "EL GHEDIR",
                "name_en": "EL GHEDIR",
                "name_ar": "الغدير"
              }
            ]
          },
          {
            "code": 2108,
            "name": "BEN AZZOUZ",
            "name_ar": "بن عزوز",
            "name_en": "BEN AZZOUZ",
            "baladyiats": [
              {
                "code": 2107,
                "name": "BEKKOUCHE LAKHDAR",
                "name_en": "BEKKOUCHE LAKHDAR",
                "name_ar": "بكوش لخضر"
              },
              {
                "code": 2108,
                "name": "BEN AZZOUZ",
                "name_en": "BEN AZZOUZ",
                "name_ar": "بن عزوز"
              },
              {
                "code": 2138,
                "name": "EL MARSA",
                "name_en": "EL MARSA",
                "name_ar": "المرسى"
              }
            ]
          },
          {
            "code": 2110,
            "name": "COLLO",
            "name_ar": "القل",
            "name_en": "COLLO",
            "baladyiats": [
              {
                "code": 2110,
                "name": "COLLO",
                "name_en": "COLLO",
                "name_ar": "القل"
              },
              {
                "code": 2111,
                "name": "BENI ZID",
                "name_en": "BENI ZID",
                "name_ar": "بني زيد"
              },
              {
                "code": 2131,
                "name": "CHERAIA",
                "name_en": "CHERAIA",
                "name_ar": "الشرايع"
              }
            ]
          },
          {
            "code": 2113,
            "name": "OULED ATTIA",
            "name_ar": "أولاد عطية",
            "name_en": "OULED ATTIA",
            "baladyiats": [
              {
                "code": 2113,
                "name": "OULED ATTIA",
                "name_en": "OULED ATTIA",
                "name_ar": "أولاد عطية"
              },
              {
                "code": 2114,
                "name": "OUED ZHOUR",
                "name_en": "OUED ZHOUR",
                "name_ar": "وادي الزهور"
              },
              {
                "code": 2136,
                "name": "KHENAG MAOUNE",
                "name_en": "KHENAG MAOUNE",
                "name_ar": "خناق مايو"
              }
            ]
          },
          {
            "code": 2115,
            "name": "ZITOUNA",
            "name_ar": "الزيتونة",
            "name_en": "ZITOUNA",
            "baladyiats": [
              {
                "code": 2115,
                "name": "ZITOUNA",
                "name_en": "ZITOUNA",
                "name_ar": "الزيتونة"
              },
              {
                "code": 2132,
                "name": "KANOUA",
                "name_en": "KANOUA",
                "name_ar": "قنواع"
              }
            ]
          },
          {
            "code": 2116,
            "name": "EL HARROUCH",
            "name_ar": "الحروش",
            "name_en": "EL HARROUCH",
            "baladyiats": [
              {
                "code": 2116,
                "name": "EL ARROUCH",
                "name_en": "EL ARROUCH",
                "name_ar": "الحروش"
              },
              {
                "code": 2117,
                "name": "ZERDEZAS",
                "name_en": "ZERDEZAS",
                "name_ar": "زردازة"
              },
              {
                "code": 2118,
                "name": "OULED HABBABA",
                "name_en": "OULED HABBABA",
                "name_ar": "أولاد حبابة"
              },
              {
                "code": 2120,
                "name": "EMJEZ EDCHICH",
                "name_en": "EMJEZ EDCHICH",
                "name_ar": "مجاز الدشيش"
              },
              {
                "code": 2125,
                "name": "SALAH BOUCHAOUR",
                "name_en": "SALAH BOUCHAOUR",
                "name_ar": "صالح بو الشعور"
              }
            ]
          },
          {
            "code": 2119,
            "name": "SIDI MEZGHICHE",
            "name_ar": "سيدي مزغيش",
            "name_en": "SIDI MEZGHICHE",
            "baladyiats": [
              {
                "code": 2119,
                "name": "SIDI MEZGHICHE",
                "name_en": "SIDI MEZGHICHE",
                "name_ar": "سيدي مزغيش"
              },
              {
                "code": 2121,
                "name": "BENI OULBANE",
                "name_en": "BENI OULBANE",
                "name_ar": "بني ولبان"
              },
              {
                "code": 2122,
                "name": "AIN BOUZIANE",
                "name_en": "AIN BOUZIANE",
                "name_ar": "عين بوزيان"
              }
            ]
          },
          {
            "code": 2123,
            "name": "RAMDANE DJAMEL",
            "name_ar": "رمضان جمال",
            "name_en": "RAMDANE DJAMEL",
            "baladyiats": [
              {
                "code": 2123,
                "name": "RAMDANE DJAMEL",
                "name_en": "RAMDANE DJAMEL",
                "name_ar": "رمضان جمال"
              },
              {
                "code": 2124,
                "name": "BENI BECHIR",
                "name_en": "BENI BECHIR",
                "name_ar": "بني بشير"
              }
            ]
          },
          {
            "code": 2126,
            "name": "TAMALOUS",
            "name_ar": "تمالوس",
            "name_en": "TAMALOUS",
            "baladyiats": [
              {
                "code": 2112,
                "name": "KERKARA",
                "name_en": "KERKARA",
                "name_ar": "الكركرة"
              },
              {
                "code": 2126,
                "name": "TAMALOUS",
                "name_en": "TAMALOUS",
                "name_ar": "تمالوس"
              },
              {
                "code": 2129,
                "name": "BIN EL OUIDEN",
                "name_en": "BIN EL OUIDEN",
                "name_ar": "بين الويدان"
              }
            ]
          },
          {
            "code": 2127,
            "name": "AIN KECHRA",
            "name_ar": "عين قشرة",
            "name_en": "AIN KECHRA",
            "baladyiats": [
              {
                "code": 2127,
                "name": "AIN KECHRA",
                "name_en": "AIN KECHRA",
                "name_ar": "عين قشرة"
              },
              {
                "code": 2135,
                "name": "OULDJA BOULBALOUT",
                "name_en": "OULDJA BOULBALOUT",
                "name_ar": "الولجة بولبلوط"
              }
            ]
          },
          {
            "code": 2128,
            "name": "OUM TOUB",
            "name_ar": "أم الطوب",
            "name_en": "OUM TOUB",
            "baladyiats": [
              {
                "code": 2128,
                "name": "OUM TOUB",
                "name_en": "OUM TOUB",
                "name_ar": "أم الطوب"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          25,
          18,
          23,
          24
        ]
      },
      {
        "mattricule": 22,
        "name_ar": "سيدي بلعباس",
        "name_ber": "ⵙⵉⴷⵉ ⴱⴻⵍ ⵄⴻⴱⴱⴰⵙ",
        "name_en": "Sidi Bel Abbes",
        "name": "Sidi Bel Abbes",
        "phoneCodes": [
          48
        ],
        "postalCodes": [
          22000,
          22001,
          22002,
          22003,
          22004,
          22005,
          22006,
          22007,
          22008,
          22009,
          22010,
          22011,
          22012,
          22013,
          22014,
          22015,
          22016,
          22017,
          22018,
          22019,
          22020,
          22021,
          22022,
          22023,
          22024,
          22025,
          22026,
          22027,
          22028,
          22029,
          22030,
          22031,
          22032,
          22033,
          22034,
          22035,
          22036,
          22037,
          22038,
          22039,
          22040,
          22041,
          22042,
          22043,
          22044,
          22045,
          22046,
          22047,
          22048,
          22049,
          22050,
          22051,
          22052,
          22053,
          22054,
          22055,
          22056,
          22057,
          22058,
          22059,
          22060,
          22061,
          22062,
          22063,
          22064,
          22065,
          22066,
          22067,
          22068,
          22069,
          22070,
          22071,
          22072,
          22073,
          22074,
          22075,
          22076,
          22077,
          22078,
          22079,
          22080,
          22081,
          22082,
          22083,
          22084,
          22085,
          22086,
          22087,
          22088,
          22089,
          22090,
          22091
        ],
        "dairats": [
          {
            "code": 2201,
            "name": "SIDI BEL ABBES",
            "name_ar": "سيدي بلعباس",
            "name_en": "SIDI BEL ABBES",
            "baladyiats": [
              {
                "code": 2201,
                "name": "SIDI BEL-ABBES",
                "name_en": "SIDI BEL-ABBES",
                "name_ar": "سيدي بلعباس"
              }
            ]
          },
          {
            "code": 2202,
            "name": "TESSALA",
            "name_ar": "تسالة",
            "name_en": "TESSALA",
            "baladyiats": [
              {
                "code": 2202,
                "name": "TESSALA",
                "name_en": "TESSALA",
                "name_ar": "تسالة"
              },
              {
                "code": 2215,
                "name": "AIN THRID",
                "name_en": "AIN THRID",
                "name_ar": "عين الثريد"
              },
              {
                "code": 2239,
                "name": "SEHALA THAOURA",
                "name_en": "SEHALA THAOURA",
                "name_ar": "السهالة الثورة"
              }
            ]
          },
          {
            "code": 2204,
            "name": "MOSTEFA  BEN BRAHIM",
            "name_ar": "مصطفى بن ابراهيم",
            "name_en": "MOSTEFA  BEN BRAHIM",
            "baladyiats": [
              {
                "code": 2204,
                "name": "MOSTEFA  BEN BRAHIM",
                "name_en": "MOSTEFA  BEN BRAHIM",
                "name_ar": "مصطفى بن ابراهيم"
              },
              {
                "code": 2213,
                "name": "TILMOUNI",
                "name_en": "TILMOUNI",
                "name_ar": "تلموني"
              },
              {
                "code": 2233,
                "name": "ZEROUALA",
                "name_en": "ZEROUALA",
                "name_ar": "زروالة"
              },
              {
                "code": 2242,
                "name": "BELARBI",
                "name_en": "BELARBI",
                "name_ar": "بلعربي"
              }
            ]
          },
          {
            "code": 2205,
            "name": "TELAGH",
            "name_ar": "تلاغ",
            "name_en": "TELAGH",
            "baladyiats": [
              {
                "code": 2205,
                "name": "TELAGH",
                "name_en": "TELAGH",
                "name_ar": "تلاغ"
              },
              {
                "code": 2206,
                "name": "MEZAOUROU",
                "name_en": "MEZAOUROU",
                "name_ar": "مزاورو"
              },
              {
                "code": 2232,
                "name": "DHAYA",
                "name_en": "DHAYA",
                "name_ar": "الضاية"
              },
              {
                "code": 2244,
                "name": "TEGHALIMET",
                "name_en": "TEGHALIMET",
                "name_ar": "تغاليمت"
              }
            ]
          },
          {
            "code": 2208,
            "name": "SIDI ALI BOUSSIDI",
            "name_ar": "سيدي علي بوسيدي",
            "name_en": "SIDI ALI BOUSSIDI",
            "baladyiats": [
              {
                "code": 2208,
                "name": "SIDI ALI BOUSSIDI",
                "name_en": "SIDI ALI BOUSSIDI",
                "name_ar": "سيدي علي بوسيدي"
              },
              {
                "code": 2225,
                "name": "AIN KADA",
                "name_en": "AIN KADA",
                "name_ar": "عين قادة"
              },
              {
                "code": 2234,
                "name": "LAMTAR",
                "name_en": "LAMTAR",
                "name_ar": "لمطار"
              },
              {
                "code": 2236,
                "name": "SIDI DAHOU ZAIRS",
                "name_en": "SIDI DAHOU ZAIRS",
                "name_ar": "سيدي دحو الزاير"
              }
            ]
          },
          {
            "code": 2210,
            "name": "MARHOUM",
            "name_ar": "مرحوم",
            "name_en": "MARHOUM",
            "baladyiats": [
              {
                "code": 2210,
                "name": "MARHOUM",
                "name_en": "MARHOUM",
                "name_ar": "مرحوم"
              },
              {
                "code": 2235,
                "name": "SIDI CHAIB",
                "name_en": "SIDI CHAIB",
                "name_ar": "سيدي شعيب"
              },
              {
                "code": 2248,
                "name": "BIR EL HAMMAM",
                "name_en": "BIR EL HAMMAM",
                "name_ar": "بئر الحمام"
              }
            ]
          },
          {
            "code": 2214,
            "name": "SIDI LAHCENE",
            "name_ar": "سيدي لحسن",
            "name_en": "SIDI LAHCENE",
            "baladyiats": [
              {
                "code": 2212,
                "name": "AMARNAS",
                "name_en": "AMARNAS",
                "name_ar": "العمارنة"
              },
              {
                "code": 2214,
                "name": "SIDI LAHCENE",
                "name_en": "SIDI LAHCENE",
                "name_ar": "سيدي لحسن"
              },
              {
                "code": 2227,
                "name": "SIDI KHALED",
                "name_en": "SIDI KHALED",
                "name_ar": "سيدي خالد"
              },
              {
                "code": 2240,
                "name": "SIDI YACOUB",
                "name_en": "SIDI YACOUB",
                "name_ar": "سيدي يعقوب"
              }
            ]
          },
          {
            "code": 2217,
            "name": "TENIRA",
            "name_ar": "تنيرة",
            "name_en": "TENIRA",
            "baladyiats": [
              {
                "code": 2217,
                "name": "TENIRA",
                "name_en": "TENIRA",
                "name_ar": "تنيرة"
              },
              {
                "code": 2243,
                "name": "OUED SEFIOUN",
                "name_en": "OUED SEFIOUN",
                "name_ar": "وادي سفيون"
              },
              {
                "code": 2251,
                "name": "BENACHIBA CHELIA",
                "name_en": "BENACHIBA CHELIA",
                "name_ar": "بن عشيبة شلية"
              },
              {
                "code": 2252,
                "name": "HASSI DAHOU",
                "name_en": "HASSI DAHOU",
                "name_ar": "حاسي دحو"
              }
            ]
          },
          {
            "code": 2218,
            "name": "MOULAY SLISSEN",
            "name_ar": "مولاي سليسن",
            "name_en": "MOULAY SLISSEN",
            "baladyiats": [
              {
                "code": 2218,
                "name": "MOULAY SLISSEN",
                "name_en": "MOULAY SLISSEN",
                "name_ar": "مولاي سليسن"
              },
              {
                "code": 2219,
                "name": "EL HACAIBA",
                "name_en": "EL HACAIBA",
                "name_ar": "الحصيبة"
              },
              {
                "code": 2224,
                "name": "AIN TINDAMINE",
                "name_en": "AIN TINDAMINE",
                "name_ar": "عين تندمين"
              }
            ]
          },
          {
            "code": 2222,
            "name": "MERINE",
            "name_ar": "مرين",
            "name_en": "MERINE",
            "baladyiats": [
              {
                "code": 2211,
                "name": "TEFESSOUR",
                "name_en": "TEFESSOUR",
                "name_ar": "تفسور"
              },
              {
                "code": 2222,
                "name": "MERINE",
                "name_en": "MERINE",
                "name_ar": "مرين"
              },
              {
                "code": 2231,
                "name": "OUED TAOURIRA",
                "name_en": "OUED TAOURIRA",
                "name_ar": "وادي تاوريرة"
              },
              {
                "code": 2249,
                "name": "TAOUDMOUT",
                "name_en": "TAOUDMOUT",
                "name_ar": "تاودموت"
              }
            ]
          },
          {
            "code": 2223,
            "name": "RAS EL MA",
            "name_ar": "راس الماء",
            "name_en": "RAS EL MA",
            "baladyiats": [
              {
                "code": 2223,
                "name": "RAS EL MA",
                "name_en": "RAS EL MA",
                "name_ar": "راس الماء"
              },
              {
                "code": 2237,
                "name": "OUED SEBAA",
                "name_en": "OUED SEBAA",
                "name_ar": "وادي السبع"
              },
              {
                "code": 2250,
                "name": "REDJEM DEMOUCHE",
                "name_en": "REDJEM DEMOUCHE",
                "name_ar": "رجم دموش"
              }
            ]
          },
          {
            "code": 2228,
            "name": "AIN EL BERD",
            "name_ar": "عين البرد",
            "name_en": "AIN EL BERD",
            "baladyiats": [
              {
                "code": 2203,
                "name": "SIDI BRAHIM",
                "name_en": "SIDI BRAHIM",
                "name_ar": "سيدي ابراهيم"
              },
              {
                "code": 2216,
                "name": "MAKEDRA",
                "name_en": "MAKEDRA",
                "name_ar": "مكدرة"
              },
              {
                "code": 2228,
                "name": "AIN EL BERD",
                "name_en": "AIN EL BERD",
                "name_ar": "عين البرد"
              },
              {
                "code": 2241,
                "name": "SIDI HAMADOUCHE",
                "name_en": "SIDI HAMADOUCHE",
                "name_ar": "سيدي حمادوش"
              }
            ]
          },
          {
            "code": 2229,
            "name": "SFISEF",
            "name_ar": "سفيزف",
            "name_en": "SFISEF",
            "baladyiats": [
              {
                "code": 2226,
                "name": "M'CID",
                "name_en": "M'CID",
                "name_ar": "مسيد"
              },
              {
                "code": 2229,
                "name": "SFISEF",
                "name_en": "SFISEF",
                "name_ar": "سفيزف"
              },
              {
                "code": 2230,
                "name": "AIN- ADDEN",
                "name_en": "AIN- ADDEN",
                "name_ar": "عين أدن"
              },
              {
                "code": 2238,
                "name": "BOUDJEBAA EL BORDJ",
                "name_en": "BOUDJEBAA EL BORDJ",
                "name_ar": "بوجبهة البرج"
              }
            ]
          },
          {
            "code": 2245,
            "name": "BEN BADIS",
            "name_ar": "بن باديس",
            "name_en": "BEN BADIS",
            "baladyiats": [
              {
                "code": 2209,
                "name": "BEDRABINE EL MOKRANI",
                "name_en": "BEDRABINE EL MOKRANI",
                "name_ar": "بضرابين المقراني"
              },
              {
                "code": 2220,
                "name": "HASSI ZAHANA",
                "name_en": "HASSI ZAHANA",
                "name_ar": "حاسي زهانة"
              },
              {
                "code": 2245,
                "name": "BEN BADIS",
                "name_en": "BEN BADIS",
                "name_ar": "بن باديس"
              },
              {
                "code": 2247,
                "name": "CHETOUANE BELAILA",
                "name_en": "CHETOUANE BELAILA",
                "name_ar": "شيطوان البلايلة"
              }
            ]
          },
          {
            "code": 2246,
            "name": "SIDI ALI BEN YOUB",
            "name_ar": "سيدي علي بن يوب",
            "name_en": "SIDI ALI BEN YOUB",
            "baladyiats": [
              {
                "code": 2207,
                "name": "BOUKHANEFIS",
                "name_en": "BOUKHANEFIS",
                "name_ar": "بوخنفيس"
              },
              {
                "code": 2221,
                "name": "TABIA",
                "name_en": "TABIA",
                "name_ar": "طابية"
              },
              {
                "code": 2246,
                "name": "SIDI ALI BENYOUB",
                "name_en": "SIDI ALI BENYOUB",
                "name_ar": "سيدي علي بن يوب"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          45,
          13,
          46,
          31,
          29,
          20,
          32
        ]
      },
      {
        "mattricule": 23,
        "name_ar": "عنابة",
        "name_ber": "ⵄⴻⵏⵏⴰⴱⴰ",
        "name_en": "Annaba",
        "name": "Annaba",
        "phoneCodes": [
          38
        ],
        "postalCodes": [
          23000,
          23001,
          23002,
          23003,
          23004,
          23005,
          23006,
          23007,
          23008,
          23009,
          23010,
          23011,
          23012,
          23013,
          23014,
          23015,
          23016,
          23017,
          23018,
          23019,
          23020,
          23021,
          23022,
          23024,
          23025,
          23026,
          23027,
          23028,
          23029,
          23030,
          23031,
          23032,
          23033,
          23034,
          23035,
          23036,
          23037,
          23038,
          23039,
          23040,
          23041,
          23042,
          23043,
          23044,
          23045,
          23046,
          23047,
          23048,
          23049,
          23050,
          23051,
          23052,
          23053,
          23054,
          23055,
          23056,
          23057
        ],
        "dairats": [
          {
            "code": 2301,
            "name": "ANNABA",
            "name_ar": "عنابة",
            "name_en": "ANNABA",
            "baladyiats": [
              {
                "code": 2301,
                "name": "ANNABA",
                "name_en": "ANNABA",
                "name_ar": "عنابة"
              },
              {
                "code": 2308,
                "name": "SERAIDI",
                "name_en": "SERAIDI",
                "name_ar": "سرايدي"
              }
            ]
          },
          {
            "code": 2302,
            "name": "BERRAHAL",
            "name_ar": "برحال",
            "name_en": "BERRAHAL",
            "baladyiats": [
              {
                "code": 2302,
                "name": "BERRAHAL",
                "name_en": "BERRAHAL",
                "name_ar": "برحال"
              },
              {
                "code": 2306,
                "name": "OUED EL ANEB",
                "name_en": "OUED EL ANEB",
                "name_ar": "واد العنب"
              },
              {
                "code": 2312,
                "name": "TREAT",
                "name_en": "TREAT",
                "name_ar": "التريعات"
              }
            ]
          },
          {
            "code": 2303,
            "name": "EL HADJAR",
            "name_ar": "الحجار",
            "name_en": "EL HADJAR",
            "baladyiats": [
              {
                "code": 2303,
                "name": "EL HADJAR",
                "name_en": "EL HADJAR",
                "name_ar": "الحجار"
              },
              {
                "code": 2311,
                "name": "SIDI AMAR",
                "name_en": "SIDI AMAR",
                "name_ar": "سيدي عمار"
              }
            ]
          },
          {
            "code": 2305,
            "name": "EL BOUNI",
            "name_ar": "البوني",
            "name_en": "EL BOUNI",
            "baladyiats": [
              {
                "code": 2305,
                "name": "EL BOUNI",
                "name_en": "EL BOUNI",
                "name_ar": "البوني"
              }
            ]
          },
          {
            "code": 2309,
            "name": "AIN EL BERDA",
            "name_ar": "عين الباردة",
            "name_en": "AIN EL BERDA",
            "baladyiats": [
              {
                "code": 2304,
                "name": "EL EULMA",
                "name_en": "EL EULMA",
                "name_ar": "العلمة"
              },
              {
                "code": 2307,
                "name": "CHEURFA",
                "name_en": "CHEURFA",
                "name_ar": "الشرفة"
              },
              {
                "code": 2309,
                "name": "AIN EL BERDA",
                "name_en": "AIN EL BERDA",
                "name_ar": "عين الباردة"
              }
            ]
          },
          {
            "code": 2310,
            "name": "CHETAIBI",
            "name_ar": "شطايبي",
            "name_en": "CHETAIBI",
            "baladyiats": [
              {
                "code": 2310,
                "name": "CHETAIBI",
                "name_en": "CHETAIBI",
                "name_ar": "شطايبي"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          24,
          21,
          36
        ]
      },
      {
        "mattricule": 24,
        "name_ar": "قالمة",
        "name_ber": "ⴳⴰⵍⵎⴰ",
        "name_en": "Guelma",
        "name": "Guelma",
        "phoneCodes": [
          37
        ],
        "postalCodes": [
          24000,
          24001,
          24002,
          24003,
          24004,
          24005,
          24006,
          24007,
          24008,
          24009,
          24010,
          24011,
          24012,
          24013,
          24014,
          24015,
          24016,
          24017,
          24018,
          24019,
          24020,
          24021,
          24022,
          24023,
          24024,
          24025,
          24026,
          24027,
          24028,
          24029,
          24030,
          24031,
          24032,
          24033,
          24034,
          24035,
          24036,
          24037,
          24038,
          24039,
          24040,
          24041,
          24042,
          24043,
          24044,
          24045,
          24046,
          24047,
          24048,
          24049,
          24050,
          24051,
          24052,
          24053,
          24054,
          24055,
          24056
        ],
        "dairats": [
          {
            "code": 2401,
            "name": "GUELMA",
            "name_ar": "قالمة",
            "name_en": "GUELMA",
            "baladyiats": [
              {
                "code": 2401,
                "name": "GUELMA",
                "name_en": "GUELMA",
                "name_ar": "قالمة"
              },
              {
                "code": 2411,
                "name": "BENDJARAH",
                "name_en": "BENDJARAH",
                "name_ar": "بن جراح"
              }
            ]
          },
          {
            "code": 2404,
            "name": "OUED ZENATI",
            "name_ar": "وادي الزناتي",
            "name_en": "OUED ZENATI",
            "baladyiats": [
              {
                "code": 2404,
                "name": "OUED ZENATI",
                "name_en": "OUED ZENATI",
                "name_ar": "وادي الزناتي"
              },
              {
                "code": 2421,
                "name": "BORDJ SABATH",
                "name_en": "BORDJ SABATH",
                "name_ar": "برج صباط"
              },
              {
                "code": 2432,
                "name": "AIN REGADA",
                "name_en": "AIN REGADA",
                "name_ar": "عين رقادة"
              }
            ]
          },
          {
            "code": 2413,
            "name": "AIN MAKHLOUF",
            "name_ar": "عين مخلوف",
            "name_en": "AIN MAKHLOUF",
            "baladyiats": [
              {
                "code": 2405,
                "name": "TAMLOUKA",
                "name_en": "TAMLOUKA",
                "name_ar": "تاملوكة"
              },
              {
                "code": 2413,
                "name": "AIN MAKHLOUF",
                "name_en": "AIN MAKHLOUF",
                "name_ar": "عين مخلوف"
              },
              {
                "code": 2423,
                "name": "AIN LARBI",
                "name_en": "AIN LARBI",
                "name_ar": "عين العربي"
              }
            ]
          },
          {
            "code": 2415,
            "name": "KHEZARAS",
            "name_ar": "خزارة",
            "name_en": "KHEZARAS",
            "baladyiats": [
              {
                "code": 2407,
                "name": "AIN SANDEL",
                "name_en": "AIN SANDEL",
                "name_ar": "عين صندل"
              },
              {
                "code": 2415,
                "name": "KHEZARAS",
                "name_en": "KHEZARAS",
                "name_ar": "لخزارة"
              },
              {
                "code": 2417,
                "name": "BOU HACHANA",
                "name_en": "BOU HACHANA",
                "name_ar": "بوحشانة"
              }
            ]
          },
          {
            "code": 2418,
            "name": "GUELAAT BOUSBAA",
            "name_ar": "قلعة بوصبع",
            "name_en": "GUELAAT BOUSBAA",
            "baladyiats": [
              {
                "code": 2402,
                "name": "NECHMAYA",
                "name_en": "NECHMAYA",
                "name_ar": "نشماية"
              },
              {
                "code": 2410,
                "name": "BELKHEIR",
                "name_en": "BELKHEIR",
                "name_ar": "بلخير"
              },
              {
                "code": 2416,
                "name": "BENI MEZLINE",
                "name_en": "BENI MEZLINE",
                "name_ar": "بني مزلين"
              },
              {
                "code": 2418,
                "name": "GUELAAT BOU SBAA",
                "name_en": "GUELAAT BOU SBAA",
                "name_ar": "قلعة بوصبع"
              },
              {
                "code": 2431,
                "name": "BOUMAHRA AHMED",
                "name_en": "BOUMAHRA AHMED",
                "name_ar": "بومهرة أحمد"
              },
              {
                "code": 2434,
                "name": "DJEBALLAH KHEMISSI",
                "name_en": "DJEBALLAH KHEMISSI",
                "name_ar": "جبالة الخميسي"
              }
            ]
          },
          {
            "code": 2419,
            "name": "HAMMAM DEBAGH",
            "name_ar": "حمام دباغ",
            "name_en": "HAMMAM DEBAGH",
            "baladyiats": [
              {
                "code": 2412,
                "name": "BOU HAMDANE",
                "name_en": "BOU HAMDANE",
                "name_ar": "بوحمدان"
              },
              {
                "code": 2419,
                "name": "HAMMAM DEBAGH",
                "name_en": "HAMMAM DEBAGH",
                "name_ar": "حمام دباغ"
              },
              {
                "code": 2428,
                "name": "ROKNIA",
                "name_en": "ROKNIA",
                "name_ar": "الركنية"
              }
            ]
          },
          {
            "code": 2422,
            "name": "HAMMAM N'BAILS",
            "name_ar": "حمام النبايل",
            "name_en": "HAMMAM N'BAILS",
            "baladyiats": [
              {
                "code": 2409,
                "name": "DAHOUARA",
                "name_en": "DAHOUARA",
                "name_ar": "الدهوارة"
              },
              {
                "code": 2422,
                "name": "HAMMAM N'BAIL",
                "name_en": "HAMMAM N'BAIL",
                "name_ar": "حمام النبايل"
              },
              {
                "code": 2433,
                "name": "OUED CHEHAM",
                "name_en": "OUED CHEHAM",
                "name_ar": "وادي الشحم"
              }
            ]
          },
          {
            "code": 2425,
            "name": "BOUCHEGOUF",
            "name_ar": "بوشقوف",
            "name_en": "BOUCHEGOUF",
            "baladyiats": [
              {
                "code": 2406,
                "name": "OUED FERRAGHA",
                "name_en": "OUED FERRAGHA",
                "name_ar": "وادي فراغة"
              },
              {
                "code": 2414,
                "name": "AIN BEN BEIDA",
                "name_en": "AIN BEN BEIDA",
                "name_ar": "عين بن بيضاء"
              },
              {
                "code": 2425,
                "name": "BOUCHEGOUF",
                "name_en": "BOUCHEGOUF",
                "name_ar": "بوشقوف"
              },
              {
                "code": 2430,
                "name": "MEDJEZ SFA",
                "name_en": "MEDJEZ SFA",
                "name_ar": "مجاز الصفاء"
              }
            ]
          },
          {
            "code": 2426,
            "name": "HELIOPOLIS",
            "name_ar": "هيليوبوليس",
            "name_en": "HELIOPOLIS",
            "baladyiats": [
              {
                "code": 2403,
                "name": "BOUATI MAHMOUD",
                "name_en": "BOUATI MAHMOUD",
                "name_ar": "بوعاتي محمود"
              },
              {
                "code": 2420,
                "name": "EL FEDJOUDJ",
                "name_en": "EL FEDJOUDJ",
                "name_ar": "الفجوج"
              },
              {
                "code": 2426,
                "name": "HELIOPOLIS",
                "name_en": "HELIOPOLIS",
                "name_ar": "هيليوبوليس"
              }
            ]
          },
          {
            "code": 2427,
            "name": "AIN HESSAINIA",
            "name_ar": "عين حساينية",
            "name_en": "AIN HESSAINIA",
            "baladyiats": [
              {
                "code": 2408,
                "name": "RAS EL AGBA",
                "name_en": "RAS EL AGBA",
                "name_ar": "رأس العقبة"
              },
              {
                "code": 2424,
                "name": "MEDJEZ AMAR",
                "name_en": "MEDJEZ AMAR",
                "name_ar": "مجاز عمار"
              },
              {
                "code": 2427,
                "name": "HOUARI BOUMEDIENNE",
                "name_en": "HOUARI BOUMEDIENNE",
                "name_ar": "هواري بومدين"
              },
              {
                "code": 2429,
                "name": "SELLAOUA ANNOUNA",
                "name_en": "SELLAOUA ANNOUNA",
                "name_ar": "سلاوة عنونة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          4,
          25,
          21,
          23,
          36,
          41
        ]
      },
      {
        "mattricule": 25,
        "name_ar": "قسنطينة",
        "name_ber": "ⵇⵙⴻⵏⵟⵉⵏⴰ",
        "name_en": "Constantine",
        "name": "Constantine",
        "phoneCodes": [
          31
        ],
        "postalCodes": [
          25000,
          25001,
          25002,
          25003,
          25004,
          25005,
          25006,
          25007,
          25008,
          25009,
          25010,
          25011,
          25012,
          25013,
          25014,
          25015,
          25016,
          25017,
          25018,
          25019,
          25020,
          25021,
          25022,
          25023,
          25024,
          25025,
          25026,
          25027,
          25028,
          25029,
          25030,
          25031,
          25032,
          25033,
          25034,
          25035,
          25036,
          25037,
          25038,
          25039,
          25040,
          25041,
          25042,
          25043,
          25044,
          25045,
          25046,
          25047,
          25048,
          25049,
          25050,
          25051,
          25052,
          25053,
          25054,
          25055,
          25056,
          25058,
          25059,
          25060,
          25061,
          25062,
          25063,
          25064,
          25065,
          25066
        ],
        "dairats": [
          {
            "code": 2501,
            "name": "CONSTANTINE",
            "name_ar": "قسنطينة",
            "name_en": "CONSTANTINE",
            "baladyiats": [
              {
                "code": 2501,
                "name": "CONSTANTINE",
                "name_en": "CONSTANTINE",
                "name_ar": "قسنطينة"
              }
            ]
          },
          {
            "code": 2502,
            "name": "HAMMA BOUZIANE",
            "name_ar": "حامة بوزيان",
            "name_en": "HAMMA BOUZIANE",
            "baladyiats": [
              {
                "code": 2502,
                "name": "HAMMA BOUZIANE",
                "name_en": "HAMMA BOUZIANE",
                "name_ar": "حامة بوزيان"
              },
              {
                "code": 2505,
                "name": "DIDOUCHE MOURAD",
                "name_en": "DIDOUCHE MOURAD",
                "name_ar": "ديدوش مراد"
              }
            ]
          },
          {
            "code": 2504,
            "name": "ZIGHOUD YOUCEF",
            "name_ar": "زيغود يوسف",
            "name_en": "ZIGHOUD YOUCEF",
            "baladyiats": [
              {
                "code": 2504,
                "name": "ZIGHOUD YOUCEF",
                "name_en": "ZIGHOUD YOUCEF",
                "name_ar": "زيغود يوسف"
              },
              {
                "code": 2508,
                "name": "BENI HAMIDANE",
                "name_en": "BENI HAMIDANE",
                "name_ar": "بني حميدان"
              }
            ]
          },
          {
            "code": 2506,
            "name": "EL KHROUB",
            "name_ar": "الخروب",
            "name_en": "EL KHROUB",
            "baladyiats": [
              {
                "code": 2506,
                "name": "EL KHROUB",
                "name_en": "EL KHROUB",
                "name_ar": "الخروب"
              },
              {
                "code": 2509,
                "name": "OULED RAHMOUN",
                "name_en": "OULED RAHMOUN",
                "name_ar": "أولاد رحمون"
              },
              {
                "code": 2510,
                "name": "AIN SMARA",
                "name_en": "AIN SMARA",
                "name_ar": "عين السمارة"
              }
            ]
          },
          {
            "code": 2507,
            "name": "AIN ABID",
            "name_ar": "عين عبيد",
            "name_en": "AIN ABID",
            "baladyiats": [
              {
                "code": 2503,
                "name": "BEN BADIS",
                "name_en": "BEN BADIS",
                "name_ar": "أبن باديس الهرية"
              },
              {
                "code": 2507,
                "name": "AIN ABID",
                "name_en": "AIN ABID",
                "name_ar": "عين عبيد"
              }
            ]
          },
          {
            "code": 2512,
            "name": "IBN ZIAD",
            "name_ar": "ابن زياد",
            "name_en": "IBN ZIAD",
            "baladyiats": [
              {
                "code": 2511,
                "name": "MESSAOUD BOUDJERIOU",
                "name_en": "MESSAOUD BOUDJERIOU",
                "name_ar": "بوجريو مسعود"
              },
              {
                "code": 2512,
                "name": "IBN ZIAD",
                "name_en": "IBN ZIAD",
                "name_ar": "ابن زياد"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          4,
          43,
          18,
          21,
          24
        ]
      },
      {
        "mattricule": 26,
        "name_ar": "المدية",
        "name_ber": "ⵎⴷⵉⵢⵢⴰ",
        "name_en": "Medea",
        "name": "Medea",
        "phoneCodes": [
          25
        ],
        "postalCodes": [
          26000,
          26001,
          26002,
          26003,
          26004,
          26005,
          26006,
          26007,
          26008,
          26009,
          26010,
          26011,
          26012,
          26013,
          26014,
          26015,
          26016,
          26017,
          26018,
          26019,
          26020,
          26021,
          26022,
          26023,
          26024,
          26025,
          26026,
          26027,
          26028,
          26029,
          26030,
          26031,
          26032,
          26033,
          26034,
          26035,
          26036,
          26037,
          26038,
          26039,
          26040,
          26041,
          26042,
          26043,
          26044,
          26045,
          26046,
          26047,
          26048,
          26049,
          26050,
          26051,
          26052,
          26053,
          26054,
          26055,
          26056,
          26057,
          26058,
          26059,
          26060,
          26061,
          26062,
          26063,
          26064,
          26065,
          26066,
          26067,
          26068,
          26069,
          26070,
          26071,
          26072,
          26073,
          26074,
          26075,
          26076,
          26077,
          26078,
          26079,
          26080,
          26081,
          26082,
          26083,
          26084,
          26085,
          26086,
          26087,
          26088,
          26089,
          26090
        ],
        "dairats": [
          {
            "code": 2601,
            "name": "MEDEA",
            "name_ar": "المدية",
            "name_en": "MEDEA",
            "baladyiats": [
              {
                "code": 2601,
                "name": "MEDEA",
                "name_en": "MEDEA",
                "name_ar": "المدية"
              },
              {
                "code": 2615,
                "name": "TAMESGUIDA",
                "name_en": "TAMESGUIDA",
                "name_ar": "تمسقيدة"
              },
              {
                "code": 2654,
                "name": "DRAA ESMAR",
                "name_en": "DRAA ESMAR",
                "name_ar": "ذراع السمار"
              }
            ]
          },
          {
            "code": 2602,
            "name": "OUZERA",
            "name_ar": "وزرة",
            "name_en": "OUZERA",
            "baladyiats": [
              {
                "code": 2602,
                "name": "OUZERA",
                "name_en": "OUZERA",
                "name_ar": "وزرة"
              },
              {
                "code": 2613,
                "name": "TIZI MAHDI",
                "name_en": "TIZI MAHDI",
                "name_ar": "تيزي مهدي"
              },
              {
                "code": 2616,
                "name": "EL HAMDANIA",
                "name_en": "EL HAMDANIA",
                "name_ar": "الحمدانية"
              },
              {
                "code": 2630,
                "name": "BEN CHICAO",
                "name_en": "BEN CHICAO",
                "name_ar": "بن شكاو"
              }
            ]
          },
          {
            "code": 2604,
            "name": "AIN BOUCIF",
            "name_ar": "عين بوسيف",
            "name_en": "AIN BOUCIF",
            "baladyiats": [
              {
                "code": 2603,
                "name": "OULED EMAARAF",
                "name_en": "OULED EMAARAF",
                "name_ar": "أولاد امعرف"
              },
              {
                "code": 2604,
                "name": "AIN BOUCIF",
                "name_en": "AIN BOUCIF",
                "name_ar": "عين بوسيف"
              },
              {
                "code": 2617,
                "name": "KEF LAKHDAR",
                "name_en": "KEF LAKHDAR",
                "name_ar": "الكاف الاخضر"
              },
              {
                "code": 2631,
                "name": "SIDI DEMED",
                "name_en": "SIDI DEMED",
                "name_ar": "سيدي دامد"
              },
              {
                "code": 2657,
                "name": "EL OUINET",
                "name_en": "EL OUINET",
                "name_ar": "العوينات"
              }
            ]
          },
          {
            "code": 2607,
            "name": "EL OMARIA",
            "name_ar": "العمارية",
            "name_en": "EL OMARIA",
            "baladyiats": [
              {
                "code": 2607,
                "name": "EL OMARIA",
                "name_en": "EL OMARIA",
                "name_ar": "العمارية"
              },
              {
                "code": 2612,
                "name": "OULED BRAHIM",
                "name_en": "OULED BRAHIM",
                "name_ar": "أولاد إبراهيم"
              },
              {
                "code": 2624,
                "name": "BAATA",
                "name_en": "BAATA",
                "name_ar": "بعطة"
              }
            ]
          },
          {
            "code": 2609,
            "name": "GUELB EL KEBIR",
            "name_ar": "القلب الكبير",
            "name_en": "GUELB EL KEBIR",
            "baladyiats": [
              {
                "code": 2609,
                "name": "EL GUELBELKEBIR",
                "name_en": "EL GUELBELKEBIR",
                "name_ar": "القلب الكبير"
              },
              {
                "code": 2656,
                "name": "BIR BEN LAABED",
                "name_en": "BIR BEN LAABED",
                "name_ar": "بئر بن عابد"
              },
              {
                "code": 2661,
                "name": "SEDRAYA",
                "name_en": "SEDRAYA",
                "name_ar": "سدراية"
              }
            ]
          },
          {
            "code": 2618,
            "name": "CHELLALAT EL ADHAOURA",
            "name_ar": "شلالة العذاورة",
            "name_en": "CHELLALAT EL ADHAOURA",
            "baladyiats": [
              {
                "code": 2618,
                "name": "CHELALET EL ADHAOURA",
                "name_en": "CHELALET EL ADHAOURA",
                "name_ar": "شلالة العذاورة"
              },
              {
                "code": 2623,
                "name": "TAFRAOUT",
                "name_en": "TAFRAOUT",
                "name_ar": "تفراوت"
              },
              {
                "code": 2640,
                "name": "CHENIGUEL",
                "name_en": "CHENIGUEL",
                "name_ar": "شنيقل"
              },
              {
                "code": 2641,
                "name": "AIN OUKSIR",
                "name_en": "AIN OUKSIR",
                "name_ar": "عين اقصير"
              }
            ]
          },
          {
            "code": 2626,
            "name": "SIDI NAAMANE",
            "name_ar": "سيدي نعمان",
            "name_en": "SIDI NAAMANE",
            "baladyiats": [
              {
                "code": 2621,
                "name": "BOUCHRAHIL",
                "name_en": "BOUCHRAHIL",
                "name_ar": "بوشراحيل"
              },
              {
                "code": 2626,
                "name": "SIDI NAAMANE",
                "name_en": "SIDI NAAMANE",
                "name_ar": "سيدي نعمان"
              },
              {
                "code": 2663,
                "name": "KHAMS DJOUAMAA",
                "name_en": "KHAMS DJOUAMAA",
                "name_ar": "خمس جوامع"
              }
            ]
          },
          {
            "code": 2632,
            "name": "AZIZ",
            "name_ar": "عزيز",
            "name_en": "AZIZ",
            "baladyiats": [
              {
                "code": 2608,
                "name": "DERRAG",
                "name_en": "DERRAG",
                "name_ar": "دراق"
              },
              {
                "code": 2632,
                "name": "AZIZ",
                "name_en": "AZIZ",
                "name_ar": "عزيز"
              },
              {
                "code": 2642,
                "name": "OUM EL DJELLIL",
                "name_en": "OUM EL DJELLIL",
                "name_ar": "أم الجليل"
              }
            ]
          },
          {
            "code": 2633,
            "name": "SOUAGHI",
            "name_ar": "السواقي",
            "name_en": "SOUAGHI",
            "baladyiats": [
              {
                "code": 2614,
                "name": "SIDI ZIANE",
                "name_en": "SIDI ZIANE",
                "name_ar": "سيدي زيان"
              },
              {
                "code": 2628,
                "name": "SIDI ZAHAR",
                "name_en": "SIDI ZAHAR",
                "name_ar": "سيدي زهار"
              },
              {
                "code": 2633,
                "name": "SOUAGUI",
                "name_en": "SOUAGUI",
                "name_ar": "السواقي"
              },
              {
                "code": 2637,
                "name": "DJOUAB",
                "name_en": "DJOUAB",
                "name_ar": "جواب"
              }
            ]
          },
          {
            "code": 2635,
            "name": "KSAR EL BOUKHARI",
            "name_ar": "قصر البخاري",
            "name_en": "KSAR EL BOUKHARI",
            "baladyiats": [
              {
                "code": 2635,
                "name": "KSAR EL BOUKHARI",
                "name_en": "KSAR EL BOUKHARI",
                "name_ar": "قصر البخاري"
              },
              {
                "code": 2649,
                "name": "M'FATHA",
                "name_en": "M'FATHA",
                "name_ar": "مفاتحة"
              },
              {
                "code": 2664,
                "name": "SANEG",
                "name_en": "SANEG",
                "name_ar": "السانق"
              }
            ]
          },
          {
            "code": 2636,
            "name": "EL AZIZIA",
            "name_ar": "العزيزية",
            "name_en": "EL AZIZIA",
            "baladyiats": [
              {
                "code": 2636,
                "name": "EL AZIZIA",
                "name_en": "EL AZIZIA",
                "name_ar": "العزيزية"
              },
              {
                "code": 2639,
                "name": "MAGHRAOUA",
                "name_en": "MAGHRAOUA",
                "name_ar": "مغراوة"
              },
              {
                "code": 2650,
                "name": "MIHOUB",
                "name_en": "MIHOUB",
                "name_ar": "ميهوب"
              }
            ]
          },
          {
            "code": 2638,
            "name": "CHAHBOUNIA",
            "name_ar": "الشهبونية",
            "name_en": "CHAHBOUNIA",
            "baladyiats": [
              {
                "code": 2610,
                "name": "BOUAICHE",
                "name_en": "BOUAICHE",
                "name_ar": "بوعيش"
              },
              {
                "code": 2638,
                "name": "CHABOUNIA",
                "name_en": "CHABOUNIA",
                "name_ar": "الشهبونية"
              },
              {
                "code": 2651,
                "name": "BOUGHZOUL",
                "name_en": "BOUGHZOUL",
                "name_ar": "بوغزول"
              }
            ]
          },
          {
            "code": 2643,
            "name": "OUAMRI",
            "name_ar": "عوامري",
            "name_en": "OUAMRI",
            "baladyiats": [
              {
                "code": 2629,
                "name": "OUED HARBIL",
                "name_en": "OUED HARBIL",
                "name_ar": "وادي حربيل"
              },
              {
                "code": 2643,
                "name": "OUAMRI",
                "name_en": "OUAMRI",
                "name_ar": "عوامري"
              },
              {
                "code": 2660,
                "name": "HANNACHA",
                "name_en": "HANNACHA",
                "name_ar": "حناشة"
              }
            ]
          },
          {
            "code": 2644,
            "name": "SI MAHDJOUB",
            "name_ar": "سي المحجوب",
            "name_en": "SI MAHDJOUB",
            "baladyiats": [
              {
                "code": 2627,
                "name": "OULED BOUACHRA",
                "name_en": "OULED BOUACHRA",
                "name_ar": "أولاد بوعشرة"
              },
              {
                "code": 2644,
                "name": "SI MAHDJOUB",
                "name_en": "SI MAHDJOUB",
                "name_ar": "سي المحجوب"
              },
              {
                "code": 2659,
                "name": "BOUAICHOUNE",
                "name_en": "BOUAICHOUNE",
                "name_ar": "بوعيشون"
              }
            ]
          },
          {
            "code": 2646,
            "name": "BENI SLIMANE",
            "name_ar": "بني سليمان",
            "name_en": "BENI SLIMANE",
            "baladyiats": [
              {
                "code": 2619,
                "name": "BOUSKENE",
                "name_en": "BOUSKENE",
                "name_ar": "بوسكن"
              },
              {
                "code": 2646,
                "name": "BENI SLIMANE",
                "name_en": "BENI SLIMANE",
                "name_ar": "بني سليمان"
              },
              {
                "code": 2655,
                "name": "SIDI RABIE",
                "name_en": "SIDI RABIE",
                "name_ar": "سيدي الربيع"
              }
            ]
          },
          {
            "code": 2647,
            "name": "BERROUAGHIA",
            "name_ar": "البرواقية",
            "name_en": "BERROUAGHIA",
            "baladyiats": [
              {
                "code": 2606,
                "name": "OULED DEID",
                "name_en": "OULED DEID",
                "name_ar": "أولاد دايد"
              },
              {
                "code": 2620,
                "name": "REBAIA",
                "name_en": "REBAIA",
                "name_ar": "الربعية"
              },
              {
                "code": 2647,
                "name": "BERROUAGHIA",
                "name_en": "BERROUAGHIA",
                "name_ar": "البرواقية"
              }
            ]
          },
          {
            "code": 2648,
            "name": "SEGHOUANE",
            "name_ar": "سغوان",
            "name_en": "SEGHOUANE",
            "baladyiats": [
              {
                "code": 2634,
                "name": "ZOUBIRIA",
                "name_en": "ZOUBIRIA",
                "name_ar": "الزبيرية"
              },
              {
                "code": 2645,
                "name": "TLETAT ED DOUAIR",
                "name_en": "TLETAT ED DOUAIR",
                "name_ar": "ثلاث دوائر"
              },
              {
                "code": 2648,
                "name": "SEGHOUANE",
                "name_en": "SEGHOUANE",
                "name_ar": "سغوان"
              },
              {
                "code": 2662,
                "name": "MEDJEBAR",
                "name_en": "MEDJEBAR",
                "name_ar": "مجبر"
              }
            ]
          },
          {
            "code": 2652,
            "name": "TABLAT",
            "name_ar": "تابلاط",
            "name_en": "TABLAT",
            "baladyiats": [
              {
                "code": 2605,
                "name": "AISSAOUIA",
                "name_en": "AISSAOUIA",
                "name_ar": "العيساوية"
              },
              {
                "code": 2611,
                "name": "MEZERANA",
                "name_en": "MEZERANA",
                "name_ar": "مزغنة"
              },
              {
                "code": 2652,
                "name": "TABLAT",
                "name_en": "TABLAT",
                "name_ar": "تابلاط"
              },
              {
                "code": 2653,
                "name": "EL HAOUDANE",
                "name_en": "EL HAOUDANE",
                "name_ar": "الحوضان"
              }
            ]
          },
          {
            "code": 2658,
            "name": "OULED ANTAR",
            "name_ar": "أولاد عنتر",
            "name_en": "OULED ANTAR",
            "baladyiats": [
              {
                "code": 2622,
                "name": "OULED HELLAL",
                "name_en": "OULED HELLAL",
                "name_ar": "أولاد هلال"
              },
              {
                "code": 2625,
                "name": "BOGHAR",
                "name_en": "BOGHAR",
                "name_ar": "بوغار"
              },
              {
                "code": 2658,
                "name": "OULED ANTAR",
                "name_en": "OULED ANTAR",
                "name_ar": "أولاد عنتر"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          17,
          38,
          44,
          9,
          10,
          28
        ]
      },
      {
        "mattricule": 27,
        "name_ar": "مستغانم",
        "name_ber": "ⵎⵓⵙⵜⵖⴰⵏⴻⵎ",
        "name_en": "Mostaganem",
        "name": "Mostaganem",
        "phoneCodes": [
          45
        ],
        "postalCodes": [
          27000,
          27001,
          27002,
          27003,
          27004,
          27005,
          27006,
          27007,
          27008,
          27009,
          27010,
          27011,
          27012,
          27013,
          27014,
          27015,
          27016,
          27017,
          27018,
          27019,
          27020,
          27021,
          27022,
          27023,
          27024,
          27025,
          27026,
          27027,
          27028,
          27029,
          27030,
          27031,
          27032,
          27033,
          27034,
          27035,
          27036,
          27037,
          27038,
          27039,
          27040,
          27041,
          27042,
          27043,
          27044,
          27045,
          27046,
          27047,
          27048,
          27049,
          27050,
          27051,
          27052,
          27053,
          27054,
          27055,
          27056,
          27057,
          27058,
          27059,
          27060,
          27061,
          27062,
          27063,
          27064,
          27065,
          27066
        ],
        "dairats": [
          {
            "code": 2701,
            "name": "MOSTAGANEM",
            "name_ar": "مستغانم",
            "name_en": "MOSTAGANEM",
            "baladyiats": [
              {
                "code": 2701,
                "name": "MOSTAGANEM",
                "name_en": "MOSTAGANEM",
                "name_ar": "مستغانم"
              }
            ]
          },
          {
            "code": 2705,
            "name": "AIN NOUICY",
            "name_ar": "عين نويسي",
            "name_en": "AIN NOUICY",
            "baladyiats": [
              {
                "code": 2703,
                "name": "FORNAKA",
                "name_en": "FORNAKA",
                "name_ar": "فرناقة"
              },
              {
                "code": 2705,
                "name": "AIN-NOUISSY",
                "name_en": "AIN-NOUISSY",
                "name_ar": "عين نويسي"
              },
              {
                "code": 2732,
                "name": "HASSIANE",
                "name_en": "HASSIANE",
                "name_ar": "الحسيان (بني ياحي"
              }
            ]
          },
          {
            "code": 2706,
            "name": "HASSI MAMECHE",
            "name_ar": "حاسي ماماش",
            "name_en": "HASSI MAMECHE",
            "baladyiats": [
              {
                "code": 2704,
                "name": "STIDIA",
                "name_en": "STIDIA",
                "name_ar": "ستيدية"
              },
              {
                "code": 2706,
                "name": "HASSI MAMECHE",
                "name_en": "HASSI MAMECHE",
                "name_ar": "حاسي ماماش"
              },
              {
                "code": 2727,
                "name": "MAZAGRAN",
                "name_en": "MAZAGRAN",
                "name_ar": "مزغران"
              }
            ]
          },
          {
            "code": 2707,
            "name": "AIN TEDELES",
            "name_ar": "عين تادلس",
            "name_en": "AIN TEDELES",
            "baladyiats": [
              {
                "code": 2707,
                "name": "AIN-TEDLES",
                "name_en": "AIN-TEDLES",
                "name_ar": "عين تادلس"
              },
              {
                "code": 2708,
                "name": "SOUR",
                "name_en": "SOUR",
                "name_ar": "سور"
              },
              {
                "code": 2709,
                "name": "OUED EL KHEIR",
                "name_en": "OUED EL KHEIR",
                "name_ar": "وادي الخير"
              },
              {
                "code": 2710,
                "name": "SIDI BELAATTAR",
                "name_en": "SIDI BELAATTAR",
                "name_ar": "سيدي بلعطار"
              }
            ]
          },
          {
            "code": 2711,
            "name": "KHEIR EDDINE",
            "name_ar": "خير الدين",
            "name_en": "KHEIR EDDINE",
            "baladyiats": [
              {
                "code": 2702,
                "name": "SAYADA",
                "name_en": "SAYADA",
                "name_ar": "صيادة"
              },
              {
                "code": 2711,
                "name": "KHEIR-EDDINE",
                "name_en": "KHEIR-EDDINE",
                "name_ar": "خير الدين"
              },
              {
                "code": 2728,
                "name": "AIN-BOUDINAR",
                "name_en": "AIN-BOUDINAR",
                "name_ar": "عين بودينار"
              }
            ]
          },
          {
            "code": 2712,
            "name": "SIDI ALI",
            "name_ar": "سيدي علي",
            "name_en": "SIDI ALI",
            "baladyiats": [
              {
                "code": 2712,
                "name": "SIDI ALI",
                "name_en": "SIDI ALI",
                "name_ar": "سيدي علي"
              },
              {
                "code": 2726,
                "name": "OULED-MAALAH",
                "name_en": "OULED-MAALAH",
                "name_ar": "أولاد مع الله"
              },
              {
                "code": 2729,
                "name": "TAZGAIT",
                "name_en": "TAZGAIT",
                "name_ar": "تزقايت"
              }
            ]
          },
          {
            "code": 2716,
            "name": "SIDI LAKHDAR",
            "name_ar": "سيدي لخضر",
            "name_en": "SIDI LAKHDAR",
            "baladyiats": [
              {
                "code": 2713,
                "name": "BENABDELMALEK RAMDANE",
                "name_en": "BENABDELMALEK RAMDANE",
                "name_ar": "بن عبد المالك رمضان"
              },
              {
                "code": 2714,
                "name": "HADJADJ",
                "name_en": "HADJADJ",
                "name_ar": "حجاج"
              },
              {
                "code": 2716,
                "name": "SIDI-LAKHDAR",
                "name_en": "SIDI-LAKHDAR",
                "name_ar": "سيدي لخضر"
              }
            ]
          },
          {
            "code": 2717,
            "name": "ACHAACHA",
            "name_ar": "عشعاشة",
            "name_en": "ACHAACHA",
            "baladyiats": [
              {
                "code": 2715,
                "name": "NEKMARIA",
                "name_en": "NEKMARIA",
                "name_ar": "نكمارية"
              },
              {
                "code": 2717,
                "name": "ACHAACHA",
                "name_en": "ACHAACHA",
                "name_ar": "عشعاشة"
              },
              {
                "code": 2718,
                "name": "KHADRA",
                "name_en": "KHADRA",
                "name_ar": "خضرة"
              },
              {
                "code": 2725,
                "name": "OULED BOUGHALEM",
                "name_en": "OULED BOUGHALEM",
                "name_ar": "أولاد بوغالم"
              }
            ]
          },
          {
            "code": 2719,
            "name": "BOUGUIRAT",
            "name_ar": "بوقيراط",
            "name_en": "BOUGUIRAT",
            "baladyiats": [
              {
                "code": 2719,
                "name": "BOUGUIRAT",
                "name_en": "BOUGUIRAT",
                "name_ar": "بوقيراط"
              },
              {
                "code": 2720,
                "name": "SIRAT",
                "name_en": "SIRAT",
                "name_ar": "سيرات"
              },
              {
                "code": 2724,
                "name": "SOUAFLIA",
                "name_en": "SOUAFLIA",
                "name_ar": "السوافلية"
              },
              {
                "code": 2730,
                "name": "SAFSAF",
                "name_en": "SAFSAF",
                "name_ar": "صفصاف"
              }
            ]
          },
          {
            "code": 2722,
            "name": "MESRA",
            "name_ar": "ماسرة",
            "name_en": "MESRA",
            "baladyiats": [
              {
                "code": 2721,
                "name": "AIN-SIDI CHERIF",
                "name_en": "AIN-SIDI CHERIF",
                "name_ar": "عين سيدي الشريف"
              },
              {
                "code": 2722,
                "name": "MESRA",
                "name_en": "MESRA",
                "name_ar": "ماسرة"
              },
              {
                "code": 2723,
                "name": "MANSOURAH",
                "name_en": "MANSOURAH",
                "name_ar": "منصورة"
              },
              {
                "code": 2731,
                "name": "TOUAHRIA",
                "name_en": "TOUAHRIA",
                "name_ar": "الطواهرية"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          31,
          29,
          48,
          2
        ]
      },
      {
        "mattricule": 28,
        "name_ar": "المسيلة",
        "name_ber": "ⵎⵙⵉⵍⴰ",
        "name_en": "M'Sila",
        "name": "M'Sila",
        "phoneCodes": [
          35
        ],
        "postalCodes": [
          28000,
          28001,
          28002,
          28003,
          28004,
          28005,
          28006,
          28007,
          28008,
          28009,
          28010,
          28011,
          28012,
          28013,
          28014,
          28015,
          28016,
          28017,
          28018,
          28019,
          28020,
          28021,
          28022,
          28023,
          28024,
          28025,
          28026,
          28027,
          28028,
          28029,
          28030,
          28031,
          28032,
          28033,
          28034,
          28035,
          28036,
          28037,
          28038,
          28039,
          28040,
          28041,
          28042,
          28043,
          28044,
          28045,
          28046,
          28047,
          28048,
          28049,
          28050,
          28051,
          28052,
          28053,
          28054,
          28056,
          28057,
          28058,
          28059,
          28060,
          28061,
          28062,
          28063,
          28064,
          28065,
          28066,
          28067,
          28068,
          28069,
          28070,
          28071,
          28072,
          28073,
          28074,
          28075,
          28076,
          28077,
          28078,
          28079,
          28080,
          28081,
          28082,
          28083,
          28084,
          28085,
          28086,
          28087,
          28088,
          28089,
          28090,
          28091,
          28092,
          28093
        ],
        "dairats": [
          {
            "code": 2801,
            "name": "M'SILA",
            "name_ar": "المسيلة",
            "name_en": "M'SILA",
            "baladyiats": [
              {
                "code": 2801,
                "name": "M'SILA",
                "name_en": "M'SILA",
                "name_ar": "المسيلة"
              }
            ]
          },
          {
            "code": 2803,
            "name": "HAMMAM DALAA",
            "name_ar": "حمام الضلعة",
            "name_en": "HAMMAM DALAA",
            "baladyiats": [
              {
                "code": 2803,
                "name": "HAMMAM DALAA",
                "name_en": "HAMMAM DALAA",
                "name_ar": "حمام الضلعة"
              },
              {
                "code": 2805,
                "name": "TARMOUNT",
                "name_en": "TARMOUNT",
                "name_ar": "تارمونت"
              },
              {
                "code": 2819,
                "name": "OUANOUGHA",
                "name_en": "OUANOUGHA",
                "name_ar": "ونوغة"
              },
              {
                "code": 2828,
                "name": "OULED MANSOUR",
                "name_en": "OULED MANSOUR",
                "name_ar": "أولاد منصور"
              }
            ]
          },
          {
            "code": 2804,
            "name": "OULED DERRADJ",
            "name_ar": "أولاد دراج",
            "name_en": "OULED DERRADJ",
            "baladyiats": [
              {
                "code": 2802,
                "name": "MAADID",
                "name_en": "MAADID",
                "name_ar": "المعاضيد"
              },
              {
                "code": 2804,
                "name": "OULED DERRADJ",
                "name_en": "OULED DERRADJ",
                "name_ar": "أولاد دراج"
              },
              {
                "code": 2806,
                "name": "M'TARFA",
                "name_en": "M'TARFA",
                "name_ar": "المطارفة"
              },
              {
                "code": 2814,
                "name": "OULED ADDI GUEBALA",
                "name_en": "OULED ADDI GUEBALA",
                "name_ar": "أولاد عدي لقبالة"
              },
              {
                "code": 2840,
                "name": "SOUAMAA",
                "name_en": "SOUAMAA",
                "name_ar": "السوامع"
              }
            ]
          },
          {
            "code": 2807,
            "name": "KHOUBANA",
            "name_ar": "خبانة",
            "name_en": "KHOUBANA",
            "baladyiats": [
              {
                "code": 2807,
                "name": "KHOUBANA",
                "name_en": "KHOUBANA",
                "name_ar": "خبانة"
              },
              {
                "code": 2808,
                "name": "M'CIF",
                "name_en": "M'CIF",
                "name_ar": "مسيف"
              },
              {
                "code": 2826,
                "name": "EL HOUAMED",
                "name_en": "EL HOUAMED",
                "name_ar": "الحوامد"
              }
            ]
          },
          {
            "code": 2809,
            "name": "CHELLAL",
            "name_ar": "شلال",
            "name_en": "CHELLAL",
            "baladyiats": [
              {
                "code": 2809,
                "name": "CHELLAL",
                "name_en": "CHELLAL",
                "name_ar": "شلال"
              },
              {
                "code": 2810,
                "name": "OULED MADHI",
                "name_en": "OULED MADHI",
                "name_ar": "أولاد ماضي"
              },
              {
                "code": 2829,
                "name": "MAARIF",
                "name_en": "MAARIF",
                "name_ar": "معاريف"
              },
              {
                "code": 2832,
                "name": "KHETTOUTI SED-EL-JIR",
                "name_en": "KHETTOUTI SED-EL-JIR",
                "name_ar": "خطوطي سد الجير"
              }
            ]
          },
          {
            "code": 2811,
            "name": "MAGRA",
            "name_ar": "مقرة",
            "name_en": "MAGRA",
            "baladyiats": [
              {
                "code": 2811,
                "name": "MAGRA",
                "name_en": "MAGRA",
                "name_ar": "مقرة"
              },
              {
                "code": 2812,
                "name": "BERHOUM",
                "name_en": "BERHOUM",
                "name_ar": "برهوم"
              },
              {
                "code": 2813,
                "name": "AIN KHADRA",
                "name_en": "AIN KHADRA",
                "name_ar": "عين الخضراء"
              },
              {
                "code": 2815,
                "name": "BELAIBA",
                "name_en": "BELAIBA",
                "name_ar": "بلعايبة"
              },
              {
                "code": 2830,
                "name": "DEHAHNA",
                "name_en": "DEHAHNA",
                "name_ar": "دهاهنة"
              }
            ]
          },
          {
            "code": 2816,
            "name": "SIDI AISSA",
            "name_ar": "سيدي عيسى",
            "name_en": "SIDI AISSA",
            "baladyiats": [
              {
                "code": 2816,
                "name": "SIDI AISSA",
                "name_en": "SIDI AISSA",
                "name_ar": "سيدي عيسى"
              },
              {
                "code": 2831,
                "name": "BOUTI SAYEH",
                "name_en": "BOUTI SAYEH",
                "name_ar": "بوطي السايح"
              },
              {
                "code": 2845,
                "name": "BENI ILMANE",
                "name_en": "BENI ILMANE",
                "name_ar": "بني يلمان"
              }
            ]
          },
          {
            "code": 2817,
            "name": "AIN EL HADJEL",
            "name_ar": "عين الحجل",
            "name_en": "AIN EL HADJEL",
            "baladyiats": [
              {
                "code": 2817,
                "name": "AIN EL HADJEL",
                "name_en": "AIN EL HADJEL",
                "name_ar": "عين الحجل"
              },
              {
                "code": 2818,
                "name": "SIDI HADJERES",
                "name_en": "SIDI HADJERES",
                "name_ar": "سيدي هجرس"
              }
            ]
          },
          {
            "code": 2820,
            "name": "BOUSAADA",
            "name_ar": "بوسعادة",
            "name_en": "BOUSAADA",
            "baladyiats": [
              {
                "code": 2820,
                "name": "BOU SAADA",
                "name_en": "BOU SAADA",
                "name_ar": "بوسعادة"
              },
              {
                "code": 2827,
                "name": "EL HAMEL",
                "name_en": "EL HAMEL",
                "name_ar": "الهامل"
              },
              {
                "code": 2846,
                "name": "OULTEME",
                "name_en": "OULTEME",
                "name_ar": "ولتام"
              }
            ]
          },
          {
            "code": 2821,
            "name": "OULED SIDI BRAHIM",
            "name_ar": "أولاد سيدي ابراهيم",
            "name_en": "OULED SIDI BRAHIM",
            "baladyiats": [
              {
                "code": 2821,
                "name": "OULED SIDI BRAHIM",
                "name_en": "OULED SIDI BRAHIM",
                "name_ar": "أولاد سيدي ابراهيم"
              },
              {
                "code": 2835,
                "name": "BENZOUH",
                "name_en": "BENZOUH",
                "name_ar": "بن زوه"
              }
            ]
          },
          {
            "code": 2822,
            "name": "SIDI AMEUR",
            "name_ar": "سيدي عامر",
            "name_en": "SIDI AMEUR",
            "baladyiats": [
              {
                "code": 2822,
                "name": "SIDI AMEUR",
                "name_en": "SIDI AMEUR",
                "name_ar": "سيدي عامر"
              },
              {
                "code": 2823,
                "name": "TAMSA",
                "name_en": "TAMSA",
                "name_ar": "تامسة"
              }
            ]
          },
          {
            "code": 2824,
            "name": "BEN SROUR",
            "name_ar": "بن سرور",
            "name_en": "BEN SROUR",
            "baladyiats": [
              {
                "code": 2824,
                "name": "BEN SROUR",
                "name_en": "BEN SROUR",
                "name_ar": "بن سرور"
              },
              {
                "code": 2825,
                "name": "OULED SLIMANE",
                "name_en": "OULED SLIMANE",
                "name_ar": "أولاد سليمان"
              },
              {
                "code": 2833,
                "name": "ZARZOUR",
                "name_en": "ZARZOUR",
                "name_ar": "زرزور"
              },
              {
                "code": 2834,
                "name": "MOHAMED BOUDIAF",
                "name_en": "MOHAMED BOUDIAF",
                "name_ar": "محمد بوضياف"
              }
            ]
          },
          {
            "code": 2841,
            "name": "AIN EL MELH",
            "name_ar": "عين الملح",
            "name_en": "AIN EL MELH",
            "baladyiats": [
              {
                "code": 2836,
                "name": "BIR FODA",
                "name_en": "BIR FODA",
                "name_ar": "بئر فضة"
              },
              {
                "code": 2837,
                "name": "AIN FARES",
                "name_en": "AIN FARES",
                "name_ar": "عين فارس"
              },
              {
                "code": 2838,
                "name": "SIDI M'HAMED",
                "name_en": "SIDI M'HAMED",
                "name_ar": "سيدي امحمد"
              },
              {
                "code": 2841,
                "name": "AIN EL MELH",
                "name_en": "AIN EL MELH",
                "name_ar": "عين الملح"
              },
              {
                "code": 2844,
                "name": "AIN RICH",
                "name_en": "AIN RICH",
                "name_ar": "عين الريش"
              }
            ]
          },
          {
            "code": 2842,
            "name": "MEDJEDEL",
            "name_ar": "امجدل",
            "name_en": "MEDJEDEL",
            "baladyiats": [
              {
                "code": 2839,
                "name": "MENAA",
                "name_en": "MENAA",
                "name_ar": "مناعة"
              },
              {
                "code": 2842,
                "name": "MEDJEDEL",
                "name_en": "MEDJEDEL",
                "name_ar": "امجدل"
              }
            ]
          },
          {
            "code": 2847,
            "name": "DJEBEL MESSAAD",
            "name_ar": "جبل مساعد",
            "name_en": "DJEBEL MESSAAD",
            "baladyiats": [
              {
                "code": 2843,
                "name": "SLIM",
                "name_en": "SLIM",
                "name_ar": "سليم"
              },
              {
                "code": 2847,
                "name": "DJEBEL MESSAAD",
                "name_en": "DJEBEL MESSAAD",
                "name_ar": "جبل مساعد"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          17,
          26,
          10,
          34,
          19,
          5,
          7
        ]
      },
      {
        "mattricule": 29,
        "name_ar": "معسكر",
        "name_ber": "ⵎⵄⴻⵙⴽⴻⵔ",
        "name_en": "Mascara",
        "name": "Mascara",
        "phoneCodes": [
          45
        ],
        "postalCodes": [
          29000,
          29001,
          29002,
          29003,
          29004,
          29005,
          29006,
          29007,
          29008,
          29009,
          29010,
          29011,
          29012,
          29013,
          29014,
          29015,
          29016,
          29017,
          29018,
          29019,
          29020,
          29021,
          29022,
          29023,
          29024,
          29025,
          29026,
          29027,
          29028,
          29029,
          29030,
          29031,
          29032,
          29033,
          29034,
          29035,
          29036,
          29037,
          29038,
          29039,
          29040,
          29041,
          29042,
          29043,
          29044,
          29045,
          29046,
          29047,
          29048,
          29049,
          29050,
          29051,
          29052,
          29053,
          29054,
          29055,
          29056,
          29057,
          29058,
          29059,
          29060,
          29061,
          29062,
          29063,
          29064,
          29065,
          29066,
          29067,
          29068,
          29069,
          29070,
          29071,
          29072,
          29073,
          29074,
          29075,
          29076,
          29077,
          29078,
          29079,
          29080,
          29081,
          29082,
          29083,
          29084,
          29085,
          29086,
          29087,
          29088,
          29089,
          29090,
          29091,
          29092,
          29093,
          29094,
          29095
        ],
        "dairats": [
          {
            "code": 2901,
            "name": "MASCARA",
            "name_ar": "معسكر",
            "name_en": "MASCARA",
            "baladyiats": [
              {
                "code": 2901,
                "name": "MASCARA",
                "name_en": "MASCARA",
                "name_ar": "معسكر"
              }
            ]
          },
          {
            "code": 2902,
            "name": "BOUHANIFIA",
            "name_ar": "بوحنيفية",
            "name_en": "BOUHANIFIA",
            "baladyiats": [
              {
                "code": 2902,
                "name": "BOUHANIFIA",
                "name_en": "BOUHANIFIA",
                "name_ar": "بوحنيفية"
              },
              {
                "code": 2904,
                "name": "HACINE",
                "name_en": "HACINE",
                "name_ar": "حسين"
              },
              {
                "code": 2938,
                "name": "EL GUEITENA",
                "name_en": "EL GUEITENA",
                "name_ar": "القطنة"
              }
            ]
          },
          {
            "code": 2903,
            "name": "TIZI",
            "name_ar": "تيزي",
            "name_en": "TIZI",
            "baladyiats": [
              {
                "code": 2903,
                "name": "TIZI",
                "name_en": "TIZI",
                "name_ar": "تيزي"
              },
              {
                "code": 2913,
                "name": "FROHA",
                "name_en": "FROHA",
                "name_ar": "فروحة"
              },
              {
                "code": 2940,
                "name": "EL KEURT",
                "name_en": "EL KEURT",
                "name_ar": "القرط"
              }
            ]
          },
          {
            "code": 2906,
            "name": "TIGHENNIF",
            "name_ar": "تيغنيف",
            "name_en": "TIGHENNIF",
            "baladyiats": [
              {
                "code": 2906,
                "name": "TIGHENNIF",
                "name_en": "TIGHENNIF",
                "name_ar": "تيغنيف"
              },
              {
                "code": 2908,
                "name": "SIDI KADA",
                "name_en": "SIDI KADA",
                "name_ar": "سيدي قادة"
              },
              {
                "code": 2947,
                "name": "SEHAILIA",
                "name_en": "SEHAILIA",
                "name_ar": "السهايلية"
              }
            ]
          },
          {
            "code": 2907,
            "name": "HACHEM",
            "name_ar": "الحشم",
            "name_en": "HACHEM",
            "baladyiats": [
              {
                "code": 2907,
                "name": "EL HACHEM",
                "name_en": "EL HACHEM",
                "name_ar": "الحشم"
              },
              {
                "code": 2909,
                "name": "ZELAMTA",
                "name_en": "ZELAMTA",
                "name_ar": "زلامطة"
              },
              {
                "code": 2945,
                "name": "NESMOT",
                "name_en": "NESMOT",
                "name_ar": "نسمط"
              }
            ]
          },
          {
            "code": 2910,
            "name": "OUED EL ABTAL",
            "name_ar": "وادي الأبطال",
            "name_en": "OUED EL ABTAL",
            "baladyiats": [
              {
                "code": 2910,
                "name": "OUED EL ABTAL",
                "name_en": "OUED EL ABTAL",
                "name_ar": "وادي الأبطال"
              },
              {
                "code": 2911,
                "name": "AIN FERAH",
                "name_en": "AIN FERAH",
                "name_ar": "عين فراح"
              },
              {
                "code": 2946,
                "name": "SIDI ABDELDJEBAR",
                "name_en": "SIDI ABDELDJEBAR",
                "name_ar": "سيدي عبد الجبار"
              }
            ]
          },
          {
            "code": 2912,
            "name": "GHRISS",
            "name_ar": "غريس",
            "name_en": "GHRISS",
            "baladyiats": [
              {
                "code": 2905,
                "name": "MAOUSSA",
                "name_en": "MAOUSSA",
                "name_ar": "ماوسة"
              },
              {
                "code": 2912,
                "name": "GHRISS",
                "name_en": "GHRISS",
                "name_ar": "غريس"
              },
              {
                "code": 2914,
                "name": "MATEMORE",
                "name_en": "MATEMORE",
                "name_ar": "المطمور"
              },
              {
                "code": 2915,
                "name": "MAKHDA",
                "name_en": "MAKHDA",
                "name_ar": "ماقضة"
              },
              {
                "code": 2916,
                "name": "SIDI BOUSSAID",
                "name_en": "SIDI BOUSSAID",
                "name_ar": "سيدي بوسعيد"
              }
            ]
          },
          {
            "code": 2917,
            "name": "EL BORDJ",
            "name_ar": "البرج",
            "name_en": "EL BORDJ",
            "baladyiats": [
              {
                "code": 2917,
                "name": "EL BORDJ",
                "name_en": "EL BORDJ",
                "name_ar": "البرج"
              },
              {
                "code": 2920,
                "name": "KHALOUIA",
                "name_en": "KHALOUIA",
                "name_ar": "خلوية"
              },
              {
                "code": 2921,
                "name": "EL MENAOUER",
                "name_en": "EL MENAOUER",
                "name_ar": "المنور"
              }
            ]
          },
          {
            "code": 2918,
            "name": "AIN FEKAN",
            "name_ar": "عين فكان",
            "name_en": "AIN FEKAN",
            "baladyiats": [
              {
                "code": 2918,
                "name": "AIN FEKAN",
                "name_en": "AIN FEKAN",
                "name_ar": "عين فكان"
              },
              {
                "code": 2925,
                "name": "AIN FRASS",
                "name_en": "AIN FRASS",
                "name_ar": "عين أفرص"
              }
            ]
          },
          {
            "code": 2922,
            "name": "OUED TARIA",
            "name_ar": "وادي التاغية",
            "name_en": "OUED TARIA",
            "baladyiats": [
              {
                "code": 2922,
                "name": "OUED TARIA",
                "name_en": "OUED TARIA",
                "name_ar": "وادي التاغية"
              },
              {
                "code": 2942,
                "name": "GUERDJOUM",
                "name_en": "GUERDJOUM",
                "name_ar": "قرجوم"
              }
            ]
          },
          {
            "code": 2923,
            "name": "AOUF",
            "name_ar": "عوف",
            "name_en": "AOUF",
            "baladyiats": [
              {
                "code": 2919,
                "name": "BENIAN",
                "name_en": "BENIAN",
                "name_ar": "بنيان"
              },
              {
                "code": 2923,
                "name": "AOUF",
                "name_en": "AOUF",
                "name_ar": "عوف"
              },
              {
                "code": 2941,
                "name": "GHARROUS",
                "name_en": "GHARROUS",
                "name_ar": "غروس"
              }
            ]
          },
          {
            "code": 2924,
            "name": "AIN FARES",
            "name_ar": "عين فارس",
            "name_en": "AIN FARES",
            "baladyiats": [
              {
                "code": 2924,
                "name": "AIN FARES",
                "name_en": "AIN FARES",
                "name_ar": "عين فارس"
              },
              {
                "code": 2939,
                "name": "EL MAMOUNIA",
                "name_en": "EL MAMOUNIA",
                "name_ar": "المأمونية"
              }
            ]
          },
          {
            "code": 2926,
            "name": "SIG",
            "name_ar": "سيق",
            "name_en": "SIG",
            "baladyiats": [
              {
                "code": 2926,
                "name": "SIG",
                "name_en": "SIG",
                "name_ar": "سيق"
              },
              {
                "code": 2937,
                "name": "BOU HENNI",
                "name_en": "BOU HENNI",
                "name_ar": "بوهني"
              },
              {
                "code": 2943,
                "name": "CHORFA",
                "name_en": "CHORFA",
                "name_ar": "الشرفاء"
              }
            ]
          },
          {
            "code": 2927,
            "name": "OGGAZ",
            "name_ar": "عقاز",
            "name_en": "OGGAZ",
            "baladyiats": [
              {
                "code": 2927,
                "name": "OGGAZ",
                "name_en": "OGGAZ",
                "name_ar": "عقاز"
              },
              {
                "code": 2928,
                "name": "ALAIMIA",
                "name_en": "ALAIMIA",
                "name_ar": "العلايمية"
              },
              {
                "code": 2944,
                "name": "RAS EL AIN AMIROUCHE",
                "name_en": "RAS EL AIN AMIROUCHE",
                "name_ar": "رأس عين عميروش"
              }
            ]
          },
          {
            "code": 2930,
            "name": "ZAHANA",
            "name_ar": "زهانة",
            "name_en": "ZAHANA",
            "baladyiats": [
              {
                "code": 2929,
                "name": "EL GAADA",
                "name_en": "EL GAADA",
                "name_ar": "القعدة"
              },
              {
                "code": 2930,
                "name": "ZAHANA",
                "name_en": "ZAHANA",
                "name_ar": "زهانة"
              }
            ]
          },
          {
            "code": 2931,
            "name": "MOHAMMADIA",
            "name_ar": "المحمدية",
            "name_en": "MOHAMMADIA",
            "baladyiats": [
              {
                "code": 2931,
                "name": "MOHAMMADIA",
                "name_en": "MOHAMMADIA",
                "name_ar": "المحمدية"
              },
              {
                "code": 2932,
                "name": "SIDI ABDELMOUMENE",
                "name_en": "SIDI ABDELMOUMENE",
                "name_ar": "سيدي عبد المومن"
              },
              {
                "code": 2933,
                "name": "FERRAGUIG",
                "name_en": "FERRAGUIG",
                "name_ar": "فراقيق"
              },
              {
                "code": 2934,
                "name": "EL GHOMRI",
                "name_en": "EL GHOMRI",
                "name_ar": "الغمري"
              },
              {
                "code": 2935,
                "name": "SEDJERARA",
                "name_en": "SEDJERARA",
                "name_ar": "سجرارة"
              },
              {
                "code": 2936,
                "name": "MOCTA-DOUZ",
                "name_en": "MOCTA-DOUZ",
                "name_ar": "مقطع الدوز"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          20,
          22,
          31,
          27,
          48,
          14
        ]
      },
      {
        "mattricule": 30,
        "name_ar": "ورقلة",
        "name_ber": "ⵡⴰⵔⴳⵍⴰ",
        "name_en": "Ouargla",
        "name": "Ouargla",
        "phoneCodes": [
          29
        ],
        "postalCodes": [
          30000,
          30001,
          30002,
          30003,
          30004,
          30005,
          30006,
          30007,
          30008,
          30009,
          30010,
          30011,
          30012,
          30013,
          30014,
          30015,
          30016,
          30017,
          30018,
          30019,
          30020,
          30021,
          30022,
          30023,
          30024,
          30025,
          30026,
          30027,
          30028,
          30029,
          30030,
          30031,
          30032,
          30033,
          30034,
          30035,
          30036,
          30037,
          30038,
          30039,
          30040,
          30041,
          30042,
          30043,
          30044,
          30045,
          30046,
          30047,
          30048,
          30049,
          30050,
          30051,
          30052,
          30053,
          30054,
          30055,
          30056,
          30057,
          30058,
          30059,
          30060,
          30061,
          30062,
          30063
        ],
        "dairats": [
          {
            "code": 3001,
            "name": "OUARGLA",
            "name_ar": "ورقلة",
            "name_en": "OUARGLA",
            "baladyiats": [
              {
                "code": 3001,
                "name": "OUARGLA",
                "name_en": "OUARGLA",
                "name_ar": "ورقلة"
              },
              {
                "code": 3005,
                "name": "ROUISSAT",
                "name_en": "ROUISSAT",
                "name_ar": "الرويسات"
              }
            ]
          },
          {
            "code": 3003,
            "name": "N'GOUSSA",
            "name_ar": "انقوسة",
            "name_en": "N'GOUSSA",
            "baladyiats": [
              {
                "code": 3003,
                "name": "N'GOUSSA",
                "name_en": "N'GOUSSA",
                "name_ar": "انقوسة"
              }
            ]
          },
          {
            "code": 3004,
            "name": "HASSI MESSAOUD",
            "name_ar": "حاسي مسعود",
            "name_en": "HASSI MESSAOUD",
            "baladyiats": [
              {
                "code": 3004,
                "name": "HASSI MESSAOUD",
                "name_en": "HASSI MESSAOUD",
                "name_ar": "حاسي مسعود"
              }
            ]
          },
          {
            "code": 3011,
            "name": "SIDI KHOUILED",
            "name_ar": "سيدي خويلد",
            "name_en": "SIDI KHOUILED",
            "baladyiats": [
              {
                "code": 3002,
                "name": "AIN BEIDA",
                "name_en": "AIN BEIDA",
                "name_ar": "عين البيضاء"
              },
              {
                "code": 3011,
                "name": "SIDI KHOUILED",
                "name_en": "SIDI KHOUILED",
                "name_ar": "سيدي خويلد"
              },
              {
                "code": 3012,
                "name": "HASSI BEN ABDELLAH",
                "name_en": "HASSI BEN ABDELLAH",
                "name_ar": "حاسي بن عبد الله"
              }
            ]
          },
          {
            "code": 3013,
            "name": "TOUGGOURT (wilya déléguée)",
            "name_ar": "تقرت",
            "name_en": "TOUGGOURT (wilya déléguée)",
            "baladyiats": [
              {
                "code": 3007,
                "name": "TEBESBEST",
                "name_en": "TEBESBEST",
                "name_ar": "تبسبست"
              },
              {
                "code": 3008,
                "name": "NEZLA",
                "name_en": "NEZLA",
                "name_ar": "النزلة"
              },
              {
                "code": 3009,
                "name": "ZAOUIA EL ABIDIA",
                "name_en": "ZAOUIA EL ABIDIA",
                "name_ar": "الزاوية العابدية"
              },
              {
                "code": 3013,
                "name": "TOUGGOURT",
                "name_en": "TOUGGOURT",
                "name_ar": "تقرت"
              }
            ]
          },
          {
            "code": 3013,
            "name": "TOUGGOURT",
            "name_ar": "تقرت (ولاية منتدبة)",
            "name_en": "TOUGGOURT",
            "baladyiats": [
              {
                "code": 3007,
                "name": "TEBESBEST",
                "name_en": "TEBESBEST",
                "name_ar": "تبسبست"
              },
              {
                "code": 3008,
                "name": "NEZLA",
                "name_en": "NEZLA",
                "name_ar": "النزلة"
              },
              {
                "code": 3009,
                "name": "ZAOUIA EL ABIDIA",
                "name_en": "ZAOUIA EL ABIDIA",
                "name_ar": "الزاوية العابدية"
              },
              {
                "code": 3013,
                "name": "TOUGGOURT",
                "name_en": "TOUGGOURT",
                "name_ar": "تقرت"
              }
            ]
          },
          {
            "code": 3014,
            "name": "EL-HADJIRA",
            "name_ar": "الحجيرة",
            "name_en": "EL-HADJIRA",
            "baladyiats": [
              {
                "code": 3014,
                "name": "EL-HADJIRA",
                "name_en": "EL-HADJIRA",
                "name_ar": "الحجيرة"
              },
              {
                "code": 3020,
                "name": "EL ALIA",
                "name_en": "EL ALIA",
                "name_ar": "العالية"
              }
            ]
          },
          {
            "code": 3015,
            "name": "TAIBET",
            "name_ar": "الطيبات",
            "name_en": "TAIBET",
            "baladyiats": [
              {
                "code": 3015,
                "name": "TAIBET",
                "name_en": "TAIBET",
                "name_ar": "الطيبات"
              },
              {
                "code": 3017,
                "name": "BENACEUR",
                "name_en": "BENACEUR",
                "name_ar": "بن ناصر"
              },
              {
                "code": 3018,
                "name": "M'NAGUER",
                "name_en": "M'NAGUER",
                "name_ar": "المنقر"
              }
            ]
          },
          {
            "code": 3016,
            "name": "TEMACINE",
            "name_ar": "تماسين",
            "name_en": "TEMACINE",
            "baladyiats": [
              {
                "code": 3006,
                "name": "BLIDET AMOR",
                "name_en": "BLIDET AMOR",
                "name_ar": "بلدة اعمر"
              },
              {
                "code": 3016,
                "name": "TEMACINE",
                "name_en": "TEMACINE",
                "name_ar": "تماسين"
              }
            ]
          },
          {
            "code": 3019,
            "name": "MEGARINE",
            "name_ar": "المقارين",
            "name_en": "MEGARINE",
            "baladyiats": [
              {
                "code": 3010,
                "name": "SIDI SLIMANE",
                "name_en": "SIDI SLIMANE",
                "name_ar": "سيدي سليمان"
              },
              {
                "code": 3019,
                "name": "MEGARINE",
                "name_en": "MEGARINE",
                "name_ar": "المقارين"
              }
            ]
          },
          {
            "code": 3021,
            "name": "EL BORMA",
            "name_ar": "البرمة",
            "name_en": "EL BORMA",
            "baladyiats": [
              {
                "code": 3021,
                "name": "EL BORMA",
                "name_en": "EL BORMA",
                "name_ar": "البرمة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          47,
          39,
          33,
          11
        ]
      },
      {
        "mattricule": 31,
        "name_ar": "وهران",
        "name_ber": "ⵡⴻⵀⵔⴰⵏ",
        "name_en": "Oran",
        "name": "Oran",
        "phoneCodes": [
          41
        ],
        "postalCodes": [
          31000,
          31001,
          31002,
          31003,
          31004,
          31005,
          31006,
          31007,
          31008,
          31009,
          31010,
          31011,
          31012,
          31013,
          31014,
          31015,
          31016,
          31017,
          31018,
          31019,
          31020,
          31021,
          31022,
          31023,
          31024,
          31025,
          31026,
          31027,
          31028,
          31029,
          31030,
          31031,
          31032,
          31033,
          31034,
          31035,
          31036,
          31037,
          31038,
          31039,
          31040,
          31041,
          31042,
          31043,
          31044,
          31045,
          31046,
          31047,
          31048,
          31049,
          31050,
          31051,
          31052,
          31053,
          31054,
          31055,
          31056,
          31057,
          31058,
          31059,
          31060,
          31061,
          31062,
          31063,
          31064,
          31065,
          31067,
          31068,
          31069,
          31070,
          31071,
          31072,
          31073,
          31074,
          31075,
          31076,
          31077,
          31078,
          31079,
          31080,
          31081,
          31083,
          31084,
          31085,
          31086,
          31087,
          31088,
          31089,
          31090,
          31091,
          31092,
          31093,
          31094,
          31095,
          31096,
          31097,
          31098,
          31099,
          31100,
          31101,
          31102,
          31103,
          31104,
          31105,
          31106,
          31107,
          31108,
          31109,
          31110,
          31111,
          31112,
          31113,
          31114,
          31115,
          31116,
          31117,
          31118
        ],
        "dairats": [
          {
            "code": 3101,
            "name": "ORAN",
            "name_ar": "وهران",
            "name_en": "ORAN",
            "baladyiats": [
              {
                "code": 3101,
                "name": "ORAN",
                "name_en": "ORAN",
                "name_ar": "وهران"
              }
            ]
          },
          {
            "code": 3102,
            "name": "GDYEL",
            "name_ar": "قديل",
            "name_en": "GDYEL",
            "baladyiats": [
              {
                "code": 3102,
                "name": "GDYEL",
                "name_en": "GDYEL",
                "name_ar": "قديل"
              },
              {
                "code": 3120,
                "name": "BEN FREHA",
                "name_en": "BEN FREHA",
                "name_ar": "بن فريحة"
              },
              {
                "code": 3121,
                "name": "HASSI MEFSOUKH",
                "name_en": "HASSI MEFSOUKH",
                "name_ar": "حاسي مفسوخ"
              }
            ]
          },
          {
            "code": 3103,
            "name": "BIR EL DJIR",
            "name_ar": "بئر الجير",
            "name_en": "BIR EL DJIR",
            "baladyiats": [
              {
                "code": 3103,
                "name": "BIR EL DJIR",
                "name_en": "BIR EL DJIR",
                "name_ar": "بئر الجير"
              },
              {
                "code": 3104,
                "name": "HASSI BOUNIF",
                "name_en": "HASSI BOUNIF",
                "name_ar": "حاسي بونيف"
              },
              {
                "code": 3119,
                "name": "HASSI BEN OKBA",
                "name_en": "HASSI BEN OKBA",
                "name_ar": "حاسي بن عقبة"
              }
            ]
          },
          {
            "code": 3105,
            "name": "ES SENIA",
            "name_ar": "السانية",
            "name_en": "ES SENIA",
            "baladyiats": [
              {
                "code": 3105,
                "name": "ES SENIA",
                "name_en": "ES SENIA",
                "name_ar": "السانية"
              },
              {
                "code": 3113,
                "name": "SIDI CHAMI",
                "name_en": "SIDI CHAMI",
                "name_ar": "سيدي الشحمي"
              },
              {
                "code": 3117,
                "name": "EL KERMA",
                "name_en": "EL KERMA",
                "name_ar": "الكرمة"
              }
            ]
          },
          {
            "code": 3106,
            "name": "ARZEW",
            "name_ar": "أرزيو",
            "name_en": "ARZEW",
            "baladyiats": [
              {
                "code": 3106,
                "name": "ARZEW",
                "name_en": "ARZEW",
                "name_ar": "أرزيو"
              },
              {
                "code": 3122,
                "name": "SIDI BEN YEBKA",
                "name_en": "SIDI BEN YEBKA",
                "name_ar": "سيدي بن يبقى"
              }
            ]
          },
          {
            "code": 3107,
            "name": "BETHIOUA",
            "name_ar": "بطيوة",
            "name_en": "BETHIOUA",
            "baladyiats": [
              {
                "code": 3107,
                "name": "BETHIOUA",
                "name_en": "BETHIOUA",
                "name_ar": "بطيوة"
              },
              {
                "code": 3108,
                "name": "MARSAT EL HADJADJ",
                "name_en": "MARSAT EL HADJADJ",
                "name_ar": "مرسى الحجاج"
              },
              {
                "code": 3126,
                "name": "AIN BIYA",
                "name_en": "AIN BIYA",
                "name_ar": "عين البية"
              }
            ]
          },
          {
            "code": 3109,
            "name": "AIN TURK",
            "name_ar": "عين الترك",
            "name_en": "AIN TURK",
            "baladyiats": [
              {
                "code": 3109,
                "name": "AIN TURK",
                "name_en": "AIN TURK",
                "name_ar": "عين الترك"
              },
              {
                "code": 3110,
                "name": "EL ANCOR",
                "name_en": "EL ANCOR",
                "name_ar": "العنصر"
              },
              {
                "code": 3115,
                "name": "MERS EL KEBIR",
                "name_en": "MERS EL KEBIR",
                "name_ar": "المرسى الكبير"
              },
              {
                "code": 3116,
                "name": "BOUSFER",
                "name_en": "BOUSFER",
                "name_ar": "بوسفر"
              }
            ]
          },
          {
            "code": 3111,
            "name": "OUED TLELAT",
            "name_ar": "وادي تليلات",
            "name_en": "OUED TLELAT",
            "baladyiats": [
              {
                "code": 3111,
                "name": "OUED TLELAT",
                "name_en": "OUED TLELAT",
                "name_ar": "وادي تليلات"
              },
              {
                "code": 3112,
                "name": "TAFRAOUI",
                "name_en": "TAFRAOUI",
                "name_ar": "طفراوي"
              },
              {
                "code": 3114,
                "name": "BOUFATIS",
                "name_en": "BOUFATIS",
                "name_ar": "بوفاتيس"
              },
              {
                "code": 3118,
                "name": "EL BRAYA",
                "name_en": "EL BRAYA",
                "name_ar": "البراية"
              }
            ]
          },
          {
            "code": 3124,
            "name": "BOUTLELIS",
            "name_ar": "بوتليليس",
            "name_en": "BOUTLELIS",
            "baladyiats": [
              {
                "code": 3123,
                "name": "MESSERGHIN",
                "name_en": "MESSERGHIN",
                "name_ar": "مسرغين"
              },
              {
                "code": 3124,
                "name": "BOUTLELIS",
                "name_en": "BOUTLELIS",
                "name_ar": "بوتليليس"
              },
              {
                "code": 3125,
                "name": "AIN KERMA",
                "name_en": "AIN KERMA",
                "name_ar": "عين الكرمة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          46,
          22,
          29,
          27
        ]
      },
      {
        "mattricule": 32,
        "name_ar": "البيض",
        "name_ber": "ⵍⴱⴰⵢⴻⴹ",
        "name_en": "El Bayadh",
        "name": "El Bayadh",
        "phoneCodes": [
          49
        ],
        "postalCodes": [
          32000,
          32001,
          32002,
          32003,
          32004,
          32005,
          32006,
          32007,
          32008,
          32009,
          32010,
          32011,
          32012,
          32013,
          32014,
          32015,
          32016,
          32017,
          32018,
          32019,
          32020,
          32021,
          32022,
          32023,
          32024,
          32025,
          32026,
          32027,
          32028,
          32029,
          32030,
          32031,
          32032,
          32033,
          32034,
          32035,
          32036,
          32037,
          32038,
          32039,
          32040,
          32041,
          32042
        ],
        "dairats": [
          {
            "code": 3201,
            "name": "EL BAYADH",
            "name_ar": "البيض",
            "name_en": "EL BAYADH",
            "baladyiats": [
              {
                "code": 3201,
                "name": "EL BAYADH",
                "name_en": "EL BAYADH",
                "name_ar": "البيض"
              }
            ]
          },
          {
            "code": 3202,
            "name": "ROGASSA",
            "name_ar": "رقاصة",
            "name_en": "ROGASSA",
            "baladyiats": [
              {
                "code": 3202,
                "name": "ROGASSA",
                "name_en": "ROGASSA",
                "name_ar": "رقاصة"
              },
              {
                "code": 3210,
                "name": "BOUGTOUB",
                "name_en": "BOUGTOUB",
                "name_ar": "بوقطب"
              },
              {
                "code": 3222,
                "name": "SIDI TIFFOUR",
                "name_en": "SIDI TIFFOUR",
                "name_ar": "سيدي طيفور"
              }
            ]
          },
          {
            "code": 3203,
            "name": "BREZINA",
            "name_ar": "بريزينة",
            "name_en": "BREZINA"
          },
          {
            "code": 3204,
            "name": "BOUALEM",
            "name_ar": "بوعلام",
            "name_en": "BOUALEM",
            "baladyiats": [
              {
                "code": 3204,
                "name": "BREZINA",
                "name_en": "BREZINA",
                "name_ar": "بريزينة"
              },
              {
                "code": 3209,
                "name": "ARBAOUAT",
                "name_en": "ARBAOUAT",
                "name_ar": "اربوات"
              },
              {
                "code": 3217,
                "name": "CHEGUIG",
                "name_en": "CHEGUIG",
                "name_ar": "الشقيق"
              }
            ]
          },
          {
            "code": 3205,
            "name": "LABIODH SIDI CHEIKH",
            "name_ar": "الأبيض سيدي الشيخ",
            "name_en": "LABIODH SIDI CHEIKH"
          },
          {
            "code": 3206,
            "name": "BOUGTOB",
            "name_ar": "بوقطب",
            "name_en": "BOUGTOB",
            "baladyiats": [
              {
                "code": 3205,
                "name": "GHASSOUL",
                "name_en": "GHASSOUL",
                "name_ar": "الغاسول"
              },
              {
                "code": 3211,
                "name": "EL KHEITHER",
                "name_en": "EL KHEITHER",
                "name_ar": "الخيثر"
              },
              {
                "code": 3212,
                "name": "KEF EL AHMAR",
                "name_en": "KEF EL AHMAR",
                "name_ar": "الكاف الأحمر"
              },
              {
                "code": 3214,
                "name": "CHELLALA",
                "name_en": "CHELLALA",
                "name_ar": "شلالة"
              },
              {
                "code": 3219,
                "name": "EL MEHARA",
                "name_en": "EL MEHARA",
                "name_ar": "المحرة"
              }
            ]
          },
          {
            "code": 3207,
            "name": "BOUSSEMGHOUN",
            "name_ar": "بوسمغون",
            "name_en": "BOUSSEMGHOUN",
            "baladyiats": [
              {
                "code": 3203,
                "name": "STITTEN",
                "name_en": "STITTEN",
                "name_ar": "ستيتن"
              },
              {
                "code": 3206,
                "name": "BOUALEM",
                "name_en": "BOUALEM",
                "name_ar": "بوعلام"
              },
              {
                "code": 3215,
                "name": "KRAKDA",
                "name_en": "KRAKDA",
                "name_ar": "كراكدة"
              },
              {
                "code": 3216,
                "name": "EL BNOUD",
                "name_en": "EL BNOUD",
                "name_ar": "البنود"
              }
            ]
          },
          {
            "code": 3208,
            "name": "CHELLALA",
            "name_ar": "شلالة",
            "name_en": "CHELLALA"
          }
        ],
        "adjacentWilayas": [
          1,
          8,
          45,
          22,
          20,
          14,
          3,
          47
        ]
      },
      {
        "mattricule": 33,
        "name_ar": "إليزي",
        "name_ber": "ⵉⵍⵍⵉⵣⵉ",
        "name_en": "Illizi",
        "name": "Illizi",
        "phoneCodes": [
          29
        ],
        "postalCodes": [
          33000,
          33001,
          33002,
          33003,
          33004,
          33005,
          33006,
          33008,
          33009,
          33010,
          33012,
          33014,
          33015,
          33016,
          33017,
          33018,
          33019,
          33020,
          33021,
          33022,
          33023,
          33024,
          33025
        ],
        "dairats": [
          {
            "code": 3301,
            "name": "ILLIZI",
            "name_ar": "إيليزي",
            "name_en": "ILLIZI",
            "baladyiats": [
              {
                "code": 3301,
                "name": "ILLIZI",
                "name_en": "ILLIZI",
                "name_ar": "إيليزي"
              }
            ]
          },
          {
            "code": 3302,
            "name": "DJANET",
            "name_ar": "جانت",
            "name_en": "DJANET",
            "baladyiats": [
              {
                "code": 3302,
                "name": "DJANET",
                "name_en": "DJANET",
                "name_ar": "جانت"
              },
              {
                "code": 3305,
                "name": "BORDJ EL HAOUASS",
                "name_en": "BORDJ EL HAOUASS",
                "name_ar": "برج الحواس"
              }
            ]
          },
          {
            "code": 3302,
            "name": "DJANET (wilya déléguée)",
            "name_ar": "جانت (ولاية منتدبة)",
            "name_en": "DJANET (wilya déléguée)",
            "baladyiats": [
              {
                "code": 3302,
                "name": "DJANET",
                "name_en": "DJANET",
                "name_ar": "جانت"
              },
              {
                "code": 3305,
                "name": "BORDJ EL HAOUASS",
                "name_en": "BORDJ EL HAOUASS",
                "name_ar": "برج الحواس"
              }
            ]
          },
          {
            "code": 3306,
            "name": "AIN AMENAS",
            "name_ar": "إن أمناس",
            "name_en": "AIN AMENAS",
            "baladyiats": [
              {
                "code": 3303,
                "name": "DEBDEB",
                "name_en": "DEBDEB",
                "name_ar": "دبداب"
              },
              {
                "code": 3304,
                "name": "BORDJ OMAR DRISS",
                "name_en": "BORDJ OMAR DRISS",
                "name_ar": "برج عمر إدريس"
              },
              {
                "code": 3306,
                "name": "IN AMENAS",
                "name_en": "IN AMENAS",
                "name_ar": "إن أمناس"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          11,
          30
        ]
      },
      {
        "mattricule": 34,
        "name_ar": "برج بوعريريج",
        "name_ber": "ⴱⵓⵔⴵ ⴱⵓ ⵄⵔⵉⵔⵉⴵ",
        "name_en": "Bordj Bou Arreridj",
        "name": "Bordj Bou Arreridj",
        "phoneCodes": [
          35
        ],
        "postalCodes": [
          34000,
          34001,
          34002,
          34003,
          34004,
          34005,
          34006,
          34007,
          34008,
          34009,
          34010,
          34011,
          34012,
          34013,
          34014,
          34015,
          34016,
          34017,
          34018,
          34019,
          34020,
          34021,
          34022,
          34023,
          34024,
          34025,
          34026,
          34027,
          34028,
          34029,
          34030,
          34031,
          34032,
          34033,
          34034,
          34035,
          34036,
          34037,
          34038,
          34039,
          34040,
          34041,
          34042,
          34043,
          34044,
          34045,
          34046,
          34047,
          34048,
          34050,
          34051,
          34052,
          34053,
          34054,
          34055,
          34056,
          34057,
          34058,
          34059,
          34060,
          34061,
          34062,
          34063,
          34064,
          34065,
          34066,
          34067,
          34068,
          34069,
          34070,
          34071,
          34072,
          34073,
          34074
        ],
        "dairats": [
          {
            "code": 3401,
            "name": "BORDJ BOU ARRERIDJ",
            "name_ar": "برج بوعريريج",
            "name_en": "BORDJ BOU ARRERIDJ",
            "baladyiats": [
              {
                "code": 3401,
                "name": "B. B. ARRERIDJ",
                "name_en": "B. B. ARRERIDJ",
                "name_ar": "برج بوعريرج"
              }
            ]
          },
          {
            "code": 3402,
            "name": "RAS EL OUED",
            "name_ar": "رأس الوادي",
            "name_en": "RAS EL OUED",
            "baladyiats": [
              {
                "code": 3402,
                "name": "RAS EL OUED",
                "name_en": "RAS EL OUED",
                "name_ar": "رأس الوادي"
              },
              {
                "code": 3417,
                "name": "OULED BRAHEM",
                "name_en": "OULED BRAHEM",
                "name_ar": "أولاد أبراهم"
              },
              {
                "code": 3430,
                "name": "AIN TESRA",
                "name_en": "AIN TESRA",
                "name_ar": "عين تسرة"
              }
            ]
          },
          {
            "code": 3403,
            "name": "BORDJ ZEMMOURA",
            "name_ar": "برج زمورة",
            "name_en": "BORDJ ZEMMOURA",
            "baladyiats": [
              {
                "code": 3403,
                "name": "Bordj Zemmoura",
                "name_en": "Bordj Zemmoura",
                "name_ar": "برج زمورة"
              },
              {
                "code": 3418,
                "name": "OULED DAHMANE",
                "name_en": "OULED DAHMANE",
                "name_ar": "أولاد دحمان"
              },
              {
                "code": 3429,
                "name": "TASSAMERT",
                "name_en": "TASSAMERT",
                "name_ar": "تسامرت"
              }
            ]
          },
          {
            "code": 3404,
            "name": "MANSOURAH",
            "name_ar": "المنصورة",
            "name_en": "MANSOURAH",
            "baladyiats": [
              {
                "code": 3404,
                "name": "MANSOURA",
                "name_en": "MANSOURA",
                "name_ar": "المنصورة"
              },
              {
                "code": 3405,
                "name": "EL M'HIR",
                "name_en": "EL M'HIR",
                "name_ar": "المهير"
              },
              {
                "code": 3406,
                "name": "BEN DAOUD",
                "name_en": "BEN DAOUD",
                "name_ar": "بن داود"
              },
              {
                "code": 3423,
                "name": "OULED SIDI-BRAHIM",
                "name_en": "OULED SIDI-BRAHIM",
                "name_ar": "أولاد سيدي ابراهيم"
              },
              {
                "code": 3434,
                "name": "HARAZA",
                "name_en": "HARAZA",
                "name_ar": "حرازة"
              }
            ]
          },
          {
            "code": 3408,
            "name": "AIN TAGHROUT",
            "name_ar": "عين تاغروت",
            "name_en": "AIN TAGHROUT",
            "baladyiats": [
              {
                "code": 3408,
                "name": "AIN TAGHROUT",
                "name_en": "AIN TAGHROUT",
                "name_ar": "عين تاغروت"
              },
              {
                "code": 3426,
                "name": "TIXTER",
                "name_en": "TIXTER",
                "name_ar": "تيكستار"
              }
            ]
          },
          {
            "code": 3409,
            "name": "BORDJ GHEDIR",
            "name_ar": "برج الغدير",
            "name_en": "BORDJ GHEDIR",
            "baladyiats": [
              {
                "code": 3409,
                "name": "BORDJ GHEDIR",
                "name_en": "BORDJ GHEDIR",
                "name_ar": "برج الغدير"
              },
              {
                "code": 3412,
                "name": "BELIMOUR",
                "name_en": "BELIMOUR",
                "name_ar": "بليمور"
              },
              {
                "code": 3421,
                "name": "TAGLAIT",
                "name_en": "TAGLAIT",
                "name_ar": "تقلعيت"
              },
              {
                "code": 3428,
                "name": "EL ANNASSEUR",
                "name_en": "EL ANNASSEUR",
                "name_ar": "العناصر"
              },
              {
                "code": 3432,
                "name": "GHAILASA",
                "name_en": "GHAILASA",
                "name_ar": "غيلاسة"
              }
            ]
          },
          {
            "code": 3411,
            "name": "EL HAMADIA",
            "name_ar": "الحمادية",
            "name_en": "EL HAMADIA",
            "baladyiats": [
              {
                "code": 3411,
                "name": "Elhammadia",
                "name_en": "Elhammadia",
                "name_ar": "الحمادية"
              },
              {
                "code": 3422,
                "name": "KSOUR",
                "name_en": "KSOUR",
                "name_ar": "القصور"
              },
              {
                "code": 3427,
                "name": "El euch",
                "name_en": "El euch",
                "name_ar": "العش"
              },
              {
                "code": 3433,
                "name": "RABTA",
                "name_en": "RABTA",
                "name_ar": "الرابطة"
              }
            ]
          },
          {
            "code": 3413,
            "name": "MEDJANA",
            "name_ar": "مجانة",
            "name_en": "MEDJANA",
            "baladyiats": [
              {
                "code": 3407,
                "name": "EL ACHIR",
                "name_en": "EL ACHIR",
                "name_ar": "الياشير"
              },
              {
                "code": 3413,
                "name": "MEDJANA",
                "name_en": "MEDJANA",
                "name_ar": "مجانة"
              },
              {
                "code": 3414,
                "name": "TENIET EN NASR",
                "name_en": "TENIET EN NASR",
                "name_ar": "ثنية النصر"
              },
              {
                "code": 3419,
                "name": "HASNAOUA",
                "name_en": "HASNAOUA",
                "name_ar": "حسناوة"
              }
            ]
          },
          {
            "code": 3415,
            "name": "DJAAFRA",
            "name_ar": "جعافرة",
            "name_en": "DJAAFRA",
            "baladyiats": [
              {
                "code": 3415,
                "name": "DJAAFRA",
                "name_en": "DJAAFRA",
                "name_ar": "جعافرة"
              },
              {
                "code": 3416,
                "name": "EL MAIN",
                "name_en": "EL MAIN",
                "name_ar": "الماين"
              },
              {
                "code": 3424,
                "name": "Tefreg",
                "name_en": "Tefreg",
                "name_ar": "تفرق"
              },
              {
                "code": 3425,
                "name": "COLLA",
                "name_en": "COLLA",
                "name_ar": "القلة"
              }
            ]
          },
          {
            "code": 3431,
            "name": "BIR KASDALI",
            "name_ar": "بئر قاصد علي",
            "name_en": "BIR KASDALI",
            "baladyiats": [
              {
                "code": 3410,
                "name": "SIDI-EMBAREK",
                "name_en": "SIDI-EMBAREK",
                "name_ar": "سيدي أمبارك"
              },
              {
                "code": 3420,
                "name": "KHELIL",
                "name_en": "KHELIL",
                "name_ar": "خليل"
              },
              {
                "code": 3431,
                "name": "BIR KASDALI",
                "name_en": "BIR KASDALI",
                "name_ar": "بئر قاصد علي"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          28,
          10,
          6,
          19
        ]
      },
      {
        "mattricule": 35,
        "name_ar": "بومرداس",
        "name_ber": "ⴱⵓⵎⴻⵔⴷⴰⵙ",
        "name_en": "Boumerdes",
        "name": "Boumerdes",
        "phoneCodes": [
          24
        ],
        "postalCodes": [
          35000,
          35001,
          35002,
          35003,
          35004,
          35005,
          35006,
          35007,
          35008,
          35009,
          35010,
          35011,
          35012,
          35013,
          35014,
          35015,
          35016,
          35017,
          35018,
          35019,
          35020,
          35021,
          35022,
          35023,
          35024,
          35025,
          35026,
          35027,
          35028,
          35029,
          35030,
          35031,
          35032,
          35033,
          35034,
          35035,
          35036,
          35037,
          35038,
          35039,
          35040,
          35041,
          35042,
          35043,
          35044,
          35045,
          35046,
          35047,
          35048,
          35049,
          35050,
          35051,
          35052,
          35053,
          35054,
          35055,
          35056,
          35057,
          35058,
          35059,
          35060,
          35061,
          35062,
          35063,
          35064,
          35065,
          35066,
          35067
        ],
        "dairats": [
          {
            "code": 3501,
            "name": "BOUMERDES",
            "name_ar": "بومرداس",
            "name_en": "BOUMERDES",
            "baladyiats": [
              {
                "code": 3501,
                "name": "BOUMERDES",
                "name_en": "BOUMERDES",
                "name_ar": "بومرداس"
              },
              {
                "code": 3512,
                "name": "TIDJELABINE",
                "name_en": "TIDJELABINE",
                "name_ar": "تيجلابين"
              },
              {
                "code": 3516,
                "name": "CORSO",
                "name_en": "CORSO",
                "name_ar": "قورصو"
              }
            ]
          },
          {
            "code": 3502,
            "name": "BOUDOUAOU",
            "name_ar": "بودواو",
            "name_en": "BOUDOUAOU",
            "baladyiats": [
              {
                "code": 3502,
                "name": "BOUDOUAOU",
                "name_en": "BOUDOUAOU",
                "name_ar": "بودواو"
              },
              {
                "code": 3519,
                "name": "BOUZEGZA KEDDARA",
                "name_en": "BOUZEGZA KEDDARA",
                "name_ar": "بوزقزة قدارة"
              },
              {
                "code": 3527,
                "name": "BOUDOUAOU EL BAHRI",
                "name_en": "BOUDOUAOU EL BAHRI",
                "name_ar": "بودواو البحري"
              },
              {
                "code": 3528,
                "name": "OULED HEDADJ",
                "name_en": "OULED HEDADJ",
                "name_ar": "أولاد هداج"
              },
              {
                "code": 3532,
                "name": "EL KHARROUBA",
                "name_en": "EL KHARROUBA",
                "name_ar": "الخروبة"
              }
            ]
          },
          {
            "code": 3504,
            "name": "BORDJ MENAIEL",
            "name_ar": "برج منايل",
            "name_en": "BORDJ MENAIEL",
            "baladyiats": [
              {
                "code": 3504,
                "name": "BORDJ MENAIEL",
                "name_en": "BORDJ MENAIEL",
                "name_ar": "برج منايل"
              },
              {
                "code": 3508,
                "name": "DJINET",
                "name_en": "DJINET",
                "name_ar": "جنات"
              },
              {
                "code": 3510,
                "name": "ZEMMOURI",
                "name_en": "ZEMMOURI",
                "name_ar": "زموري"
              },
              {
                "code": 3529,
                "name": "LEGHATA",
                "name_en": "LEGHATA",
                "name_ar": "لقاطة"
              }
            ]
          },
          {
            "code": 3505,
            "name": "BAGHLIA",
            "name_ar": "بغلية",
            "name_en": "BAGHLIA",
            "baladyiats": [
              {
                "code": 3505,
                "name": "BAGHLIA",
                "name_en": "BAGHLIA",
                "name_ar": "بغلية"
              },
              {
                "code": 3506,
                "name": "SIDI DAOUD",
                "name_en": "SIDI DAOUD",
                "name_ar": "سيدي داود"
              },
              {
                "code": 3520,
                "name": "TAOURGA",
                "name_en": "TAOURGA",
                "name_ar": "تاورقة"
              }
            ]
          },
          {
            "code": 3507,
            "name": "NACIRIA",
            "name_ar": "الناصرية",
            "name_en": "NACIRIA",
            "baladyiats": [
              {
                "code": 3507,
                "name": "NACIRIA",
                "name_en": "NACIRIA",
                "name_ar": "الناصرية"
              },
              {
                "code": 3521,
                "name": "OULED AISSA",
                "name_en": "OULED AISSA",
                "name_ar": "أولاد عيسى"
              }
            ]
          },
          {
            "code": 3509,
            "name": "ISSER",
            "name_ar": "يسر",
            "name_en": "ISSER",
            "baladyiats": [
              {
                "code": 3509,
                "name": "ISSER",
                "name_en": "ISSER",
                "name_ar": "يسر"
              },
              {
                "code": 3511,
                "name": "SI MUSTAPHA",
                "name_en": "SI MUSTAPHA",
                "name_ar": "سي مصطفى"
              },
              {
                "code": 3513,
                "name": "CHABET EL AMEUR",
                "name_en": "CHABET EL AMEUR",
                "name_ar": "شعبة العامر"
              },
              {
                "code": 3515,
                "name": "TIMEZRIT",
                "name_en": "TIMEZRIT",
                "name_ar": "تيمزريت"
              }
            ]
          },
          {
            "code": 3514,
            "name": "THENIA",
            "name_ar": "الثنية",
            "name_en": "THENIA",
            "baladyiats": [
              {
                "code": 3514,
                "name": "THENIA",
                "name_en": "THENIA",
                "name_ar": "الثنية"
              },
              {
                "code": 3524,
                "name": "AMMAL",
                "name_en": "AMMAL",
                "name_ar": "عمال"
              },
              {
                "code": 3525,
                "name": "BENI AMRANE",
                "name_en": "BENI AMRANE",
                "name_ar": "بني عمران"
              },
              {
                "code": 3526,
                "name": "SOUK EL HAD",
                "name_en": "SOUK EL HAD",
                "name_ar": "سوق الحد"
              }
            ]
          },
          {
            "code": 3523,
            "name": "DELLYS",
            "name_ar": "دلس",
            "name_en": "DELLYS",
            "baladyiats": [
              {
                "code": 3503,
                "name": "AFIR",
                "name_en": "AFIR",
                "name_ar": "أعفير"
              },
              {
                "code": 3522,
                "name": "BEN CHOUD",
                "name_en": "BEN CHOUD",
                "name_ar": "بن شود"
              },
              {
                "code": 3523,
                "name": "DELLYS",
                "name_en": "DELLYS",
                "name_ar": "دلس"
              }
            ]
          },
          {
            "code": 3531,
            "name": "KHEMIS EL KHECHNA",
            "name_ar": "خميس الخشنة",
            "name_en": "KHEMIS EL KHECHNA",
            "baladyiats": [
              {
                "code": 3517,
                "name": "OULED MOUSSA",
                "name_en": "OULED MOUSSA",
                "name_ar": "أولاد موسى"
              },
              {
                "code": 3518,
                "name": "LARBATACHE",
                "name_en": "LARBATACHE",
                "name_ar": "الاربعطاش"
              },
              {
                "code": 3530,
                "name": "HAMMEDI",
                "name_en": "HAMMEDI",
                "name_ar": "حمادي"
              },
              {
                "code": 3531,
                "name": "KHEMIS EL KHECHNA",
                "name_en": "KHEMIS EL KHECHNA",
                "name_ar": "خميس الخشنة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          9,
          16,
          15,
          10
        ]
      },
      {
        "mattricule": 36,
        "name_ar": "الطارف",
        "name_ber": "ⵟⵟⴰⵔⴻⴼ",
        "name_en": "El Tarf",
        "name": "El Tarf",
        "phoneCodes": [
          38
        ],
        "postalCodes": [
          36000,
          36001,
          36002,
          36003,
          36004,
          36005,
          36006,
          36007,
          36008,
          36009,
          36010,
          36011,
          36012,
          36013,
          36014,
          36015,
          36016,
          36017,
          36018,
          36019,
          36020,
          36021,
          36022,
          36023,
          36024,
          36025,
          36026,
          36027,
          36028,
          36029,
          36030,
          36031,
          36032,
          36033,
          36034,
          36035,
          36036,
          36037,
          36038,
          36039,
          36041,
          36042,
          36043,
          36044,
          36046,
          36047,
          36048,
          36049,
          36050,
          36051,
          36052,
          36053,
          36054,
          36055,
          36056,
          36057,
          36058
        ],
        "dairats": [
          {
            "code": 3601,
            "name": "EL TARF",
            "name_ar": "الطارف",
            "name_en": "EL TARF",
            "baladyiats": [
              {
                "code": 3601,
                "name": "EL TARF",
                "name_en": "EL TARF",
                "name_ar": "الطارف"
              },
              {
                "code": 3604,
                "name": "BOUGOUS",
                "name_en": "BOUGOUS",
                "name_ar": "بوقوس"
              },
              {
                "code": 3606,
                "name": "AIN EL ASSEL",
                "name_en": "AIN EL ASSEL",
                "name_ar": "عين العسل"
              },
              {
                "code": 3620,
                "name": "ZITOUNA",
                "name_en": "ZITOUNA",
                "name_ar": "الزيتونة"
              }
            ]
          },
          {
            "code": 3602,
            "name": "BOUHADJAR",
            "name_ar": "بوحجار",
            "name_en": "BOUHADJAR",
            "baladyiats": [
              {
                "code": 3602,
                "name": "BOUHADJAR",
                "name_en": "BOUHADJAR",
                "name_ar": "بوحجار"
              },
              {
                "code": 3621,
                "name": "AIN KERMA",
                "name_en": "AIN KERMA",
                "name_ar": "عين الكرمة"
              },
              {
                "code": 3622,
                "name": "OUED ZITOUN",
                "name_en": "OUED ZITOUN",
                "name_ar": "وادي الزيتون"
              },
              {
                "code": 3623,
                "name": "HAMMAM BENI SALAH",
                "name_en": "HAMMAM BENI SALAH",
                "name_ar": "حمام بني صالح"
              }
            ]
          },
          {
            "code": 3603,
            "name": "BEN M'HIDI",
            "name_ar": "بن مهيدي",
            "name_en": "BEN M'HIDI",
            "baladyiats": [
              {
                "code": 3603,
                "name": "BEN M HIDI",
                "name_en": "BEN M HIDI",
                "name_ar": "بن مهيدي"
              },
              {
                "code": 3610,
                "name": "BERRIHANE",
                "name_en": "BERRIHANE",
                "name_ar": "بريحان"
              },
              {
                "code": 3618,
                "name": "ECHATT",
                "name_en": "ECHATT",
                "name_ar": "الشط"
              }
            ]
          },
          {
            "code": 3605,
            "name": "EL KALA",
            "name_ar": "القالة",
            "name_en": "EL KALA",
            "baladyiats": [
              {
                "code": 3605,
                "name": "EL KALA",
                "name_en": "EL KALA",
                "name_ar": "القالة"
              },
              {
                "code": 3607,
                "name": "EL AIOUN",
                "name_en": "EL AIOUN",
                "name_ar": "العيون"
              },
              {
                "code": 3609,
                "name": "SOUAREKH",
                "name_en": "SOUAREKH",
                "name_ar": "السوارخ"
              },
              {
                "code": 3624,
                "name": "RAML SOUK",
                "name_en": "RAML SOUK",
                "name_ar": "رمل السوق"
              }
            ]
          },
          {
            "code": 3608,
            "name": "BOUTELDJA",
            "name_ar": "بوثلجة",
            "name_en": "BOUTELDJA",
            "baladyiats": [
              {
                "code": 3608,
                "name": "BOUTELDJA",
                "name_en": "BOUTELDJA",
                "name_ar": "بوثلجة"
              },
              {
                "code": 3611,
                "name": "LAC DES OISEAUX",
                "name_en": "LAC DES OISEAUX",
                "name_ar": "بحيرة الطيور"
              },
              {
                "code": 3612,
                "name": "CHEFIA",
                "name_en": "CHEFIA",
                "name_ar": "الشافية"
              }
            ]
          },
          {
            "code": 3613,
            "name": "DREAN",
            "name_ar": "الذرعان",
            "name_en": "DREAN",
            "baladyiats": [
              {
                "code": 3613,
                "name": "DREAN",
                "name_en": "DREAN",
                "name_ar": "الذرعـان"
              },
              {
                "code": 3614,
                "name": "CHIHANI",
                "name_en": "CHIHANI",
                "name_ar": "شحاني"
              },
              {
                "code": 3615,
                "name": "CHEBAITA MOKHTAR",
                "name_en": "CHEBAITA MOKHTAR",
                "name_ar": "شبيطة مختار"
              }
            ]
          },
          {
            "code": 3616,
            "name": "BESBES",
            "name_ar": "البسباس",
            "name_en": "BESBES",
            "baladyiats": [
              {
                "code": 3616,
                "name": "BESBES",
                "name_en": "BESBES",
                "name_ar": "البسباس"
              },
              {
                "code": 3617,
                "name": "ASFOUR",
                "name_en": "ASFOUR",
                "name_ar": "عصفور"
              },
              {
                "code": 3619,
                "name": "ZERIZER",
                "name_en": "ZERIZER",
                "name_ar": "زريزر"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          41,
          24,
          23
        ]
      },
      {
        "mattricule": 37,
        "name_ar": "تندوف",
        "name_ber": "ⵜⵉⵏⴷⵓⴼ",
        "name_en": "Tindouf",
        "name": "Tindouf",
        "phoneCodes": [
          49
        ],
        "postalCodes": [
          37000,
          37001,
          37002,
          37003,
          37004,
          37005,
          37006,
          37007,
          37008,
          37009,
          37010,
          37011,
          37012,
          37013,
          37014,
          37015,
          37016,
          37017
        ],
        "dairats": [
          {
            "code": 3701,
            "name": "TINDOUF",
            "name_ar": "تندوف",
            "name_en": "TINDOUF",
            "baladyiats": [
              {
                "code": 3701,
                "name": "TINDOUF",
                "name_en": "TINDOUF",
                "name_ar": "تندوف"
              },
              {
                "code": 3702,
                "name": "OUM EL ASSEL",
                "name_en": "OUM EL ASSEL",
                "name_ar": "أم العسل"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          8,
          1
        ]
      },
      {
        "mattricule": 38,
        "name_ar": "تيسمسيلت",
        "name_ber": "ⵜⵉⵙⴻⵎⵙⵉⵍⵜ",
        "name_en": "Tissemsilt",
        "name": "Tissemsilt",
        "phoneCodes": [
          46
        ],
        "postalCodes": [
          38000,
          38001,
          38002,
          38003,
          38004,
          38005,
          38006,
          38007,
          38008,
          38009,
          38010,
          38011,
          38012,
          38013,
          38014,
          38015,
          38016,
          38017,
          38018,
          38019,
          38020,
          38021,
          38022,
          38023,
          38024,
          38025,
          38026,
          38027,
          38028,
          38029,
          38030,
          38031,
          38032,
          38033,
          38034,
          38035,
          38036,
          38037,
          38038,
          38039,
          38040,
          38041,
          38042,
          38043
        ],
        "dairats": [
          {
            "code": 3801,
            "name": "TISSEMSILT",
            "name_ar": "تيسمسيلت",
            "name_en": "TISSEMSILT",
            "baladyiats": [
              {
                "code": 3801,
                "name": "TISSEMSILT",
                "name_en": "TISSEMSILT",
                "name_ar": "تيسمسيلت"
              },
              {
                "code": 3812,
                "name": "OULED BESSAM",
                "name_en": "OULED BESSAM",
                "name_ar": "أولاد بسام"
              }
            ]
          },
          {
            "code": 3802,
            "name": "BORDJ BOUNAAMA",
            "name_ar": "برج بونعامة",
            "name_en": "BORDJ BOUNAAMA",
            "baladyiats": [
              {
                "code": 3802,
                "name": "BORDJ BOUNAAMA",
                "name_en": "BORDJ BOUNAAMA",
                "name_ar": "برج بونعامة"
              },
              {
                "code": 3805,
                "name": "BENI CHAIB",
                "name_en": "BENI CHAIB",
                "name_ar": "بني شعيب"
              },
              {
                "code": 3820,
                "name": "SIDI SLIMANE",
                "name_en": "SIDI SLIMANE",
                "name_ar": "سيدي سليمان"
              },
              {
                "code": 3822,
                "name": "BENI LAHCENE",
                "name_en": "BENI LAHCENE",
                "name_ar": "بني لحسن"
              }
            ]
          },
          {
            "code": 3803,
            "name": "THENIET EL HAD",
            "name_ar": "ثنية الاحد",
            "name_en": "THENIET EL HAD",
            "baladyiats": [
              {
                "code": 3803,
                "name": "THENIET EL HAD",
                "name_en": "THENIET EL HAD",
                "name_ar": "ثنية الاحد"
              },
              {
                "code": 3815,
                "name": "SIDI BOUTOUCHENT",
                "name_en": "SIDI BOUTOUCHENT",
                "name_ar": "سيدي بوتوشنت"
              }
            ]
          },
          {
            "code": 3804,
            "name": "LAZHARIA",
            "name_ar": "الأزهرية",
            "name_en": "LAZHARIA",
            "baladyiats": [
              {
                "code": 3804,
                "name": "LAZHARIA",
                "name_en": "LAZHARIA",
                "name_ar": "الأزهرية"
              },
              {
                "code": 3816,
                "name": "LARBAA",
                "name_en": "LARBAA",
                "name_ar": "الأربعاء"
              },
              {
                "code": 3821,
                "name": "BOUCAID",
                "name_en": "BOUCAID",
                "name_ar": "بوقائد"
              }
            ]
          },
          {
            "code": 3806,
            "name": "LARDJEM",
            "name_ar": "لرجام",
            "name_en": "LARDJEM",
            "baladyiats": [
              {
                "code": 3806,
                "name": "LARDJEM",
                "name_en": "LARDJEM",
                "name_ar": "لرجام"
              },
              {
                "code": 3807,
                "name": "MELAAB",
                "name_en": "MELAAB",
                "name_ar": "الملعب"
              },
              {
                "code": 3808,
                "name": "SIDI LANTRI",
                "name_en": "SIDI LANTRI",
                "name_ar": "سيدي العنتري"
              },
              {
                "code": 3819,
                "name": "TAMELLAHET",
                "name_en": "TAMELLAHET",
                "name_ar": "تملاحت"
              }
            ]
          },
          {
            "code": 3809,
            "name": "BORDJ EMIR ABDELKADER",
            "name_ar": "برج الأمير عبد القادر",
            "name_en": "BORDJ EMIR ABDELKADER",
            "baladyiats": [
              {
                "code": 3809,
                "name": "BORDJ EL EMIR ABDELKADER",
                "name_en": "BORDJ EL EMIR ABDELKADER",
                "name_ar": "برج الأمير عبد القادر"
              },
              {
                "code": 3814,
                "name": "YOUSSOUFIA",
                "name_en": "YOUSSOUFIA",
                "name_ar": "اليوسفية"
              }
            ]
          },
          {
            "code": 3811,
            "name": "KHEMISTI",
            "name_ar": "خميستي",
            "name_en": "KHEMISTI",
            "baladyiats": [
              {
                "code": 3810,
                "name": "LAYOUNE",
                "name_en": "LAYOUNE",
                "name_ar": "العيون"
              },
              {
                "code": 3811,
                "name": "KHEMISTI",
                "name_en": "KHEMISTI",
                "name_ar": "خميستي"
              }
            ]
          },
          {
            "code": 3813,
            "name": "AMMARI",
            "name_ar": "عماري",
            "name_en": "AMMARI",
            "baladyiats": [
              {
                "code": 3813,
                "name": "AMMARI",
                "name_en": "AMMARI",
                "name_ar": "عماري"
              },
              {
                "code": 3817,
                "name": "MAACEM",
                "name_en": "MAACEM",
                "name_ar": "المعاصم"
              },
              {
                "code": 3818,
                "name": "SIDI ABED",
                "name_en": "SIDI ABED",
                "name_ar": "سيدي عابد"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          48,
          2,
          44,
          26,
          17,
          14
        ]
      },
      {
        "mattricule": 39,
        "name_ar": "الوادي",
        "name_ber": "ⵍⵡⴰⴷ",
        "name_en": "El Oued",
        "name": "El Oued",
        "phoneCodes": [
          32
        ],
        "postalCodes": [
          39000,
          39001,
          39002,
          39003,
          39004,
          39005,
          39006,
          39007,
          39008,
          39009,
          39010,
          39011,
          39012,
          39013,
          39014,
          39015,
          39016,
          39017,
          39018,
          39019,
          39020,
          39021,
          39022,
          39023,
          39024,
          39025,
          39026,
          39027,
          39028,
          39029,
          39030,
          39031,
          39032,
          39033,
          39034,
          39035,
          39036,
          39037,
          39038,
          39039,
          39040,
          39041,
          39042,
          39043,
          39044,
          39045,
          39046,
          39047,
          39048,
          39049,
          39050,
          39051,
          39052,
          39053,
          39054,
          39055,
          39056,
          39057,
          39058,
          39059,
          39060,
          39061,
          39062,
          39063,
          39064,
          39065,
          39066,
          39067,
          39068,
          39069,
          39070,
          39071,
          39072,
          39073,
          39074,
          39075,
          39076,
          39077,
          39078,
          39079,
          39080,
          39081,
          39082,
          39083,
          39084,
          39085,
          39086,
          39087,
          39088,
          39089,
          39090,
          39091,
          39092,
          39093,
          39094,
          39095,
          39096,
          39097
        ],
        "dairats": [
          {
            "code": 3901,
            "name": "EL OUED",
            "name_ar": "الوادي",
            "name_en": "EL OUED",
            "baladyiats": [
              {
                "code": 3901,
                "name": "EL-OUED",
                "name_en": "EL-OUED",
                "name_ar": "الوادي"
              },
              {
                "code": 3907,
                "name": "KOUININE",
                "name_en": "KOUININE",
                "name_ar": "كوينين"
              }
            ]
          },
          {
            "code": 3902,
            "name": "ROBBAH",
            "name_ar": "الرباح",
            "name_en": "ROBBAH",
            "baladyiats": [
              {
                "code": 3902,
                "name": "ROBBAH",
                "name_en": "ROBBAH",
                "name_ar": "الرباح"
              },
              {
                "code": 3905,
                "name": "NAKHLA",
                "name_en": "NAKHLA",
                "name_ar": "النخلة"
              },
              {
                "code": 3925,
                "name": "EL OGLA",
                "name_en": "EL OGLA",
                "name_ar": "العقلة"
              }
            ]
          },
          {
            "code": 3904,
            "name": "BAYADHA",
            "name_ar": "البياضة",
            "name_en": "BAYADHA",
            "baladyiats": [
              {
                "code": 3904,
                "name": "BAYADHA",
                "name_en": "BAYADHA",
                "name_ar": "البياضة"
              }
            ]
          },
          {
            "code": 3906,
            "name": "GUEMAR",
            "name_ar": "قمار",
            "name_en": "GUEMAR",
            "baladyiats": [
              {
                "code": 3906,
                "name": "GUEMAR",
                "name_en": "GUEMAR",
                "name_ar": "قمار"
              },
              {
                "code": 3910,
                "name": "TAGHZOUT",
                "name_en": "TAGHZOUT",
                "name_ar": "تغزوت"
              },
              {
                "code": 3920,
                "name": "OURMES",
                "name_en": "OURMES",
                "name_ar": "ورماس"
              }
            ]
          },
          {
            "code": 3908,
            "name": "REGUIBA",
            "name_ar": "الرقيبة",
            "name_en": "REGUIBA",
            "baladyiats": [
              {
                "code": 3908,
                "name": "REGUIBA",
                "name_en": "REGUIBA",
                "name_ar": "الرقيبة"
              },
              {
                "code": 3909,
                "name": "HAMRAIA",
                "name_en": "HAMRAIA",
                "name_ar": "الحمراية"
              }
            ]
          },
          {
            "code": 3911,
            "name": "DEBILA",
            "name_ar": "الدبيلة",
            "name_en": "DEBILA",
            "baladyiats": [
              {
                "code": 3911,
                "name": "DEBILA",
                "name_en": "DEBILA",
                "name_ar": "الدبيلة"
              },
              {
                "code": 3912,
                "name": "HASSANI ABDELKRIM",
                "name_en": "HASSANI ABDELKRIM",
                "name_ar": "حساني عبد الكريم"
              }
            ]
          },
          {
            "code": 3913,
            "name": "HASSI KHALIFA",
            "name_ar": "حاسي خليفة",
            "name_en": "HASSI KHALIFA",
            "baladyiats": [
              {
                "code": 3913,
                "name": "HASSI KHALIFA",
                "name_en": "HASSI KHALIFA",
                "name_ar": "حاسي خليفة"
              },
              {
                "code": 3917,
                "name": "TRIFAOUI",
                "name_en": "TRIFAOUI",
                "name_ar": "الطريفاوي"
              }
            ]
          },
          {
            "code": 3914,
            "name": "TALEB LARBI",
            "name_ar": "الطالب العربي",
            "name_en": "TALEB LARBI",
            "baladyiats": [
              {
                "code": 3914,
                "name": "TALEB LARBI",
                "name_en": "TALEB LARBI",
                "name_ar": "الطالب العربي"
              },
              {
                "code": 3915,
                "name": "DOUAR EL MAA",
                "name_en": "DOUAR EL MAA",
                "name_ar": "دوار الماء"
              },
              {
                "code": 3919,
                "name": "BEN GUECHA",
                "name_en": "BEN GUECHA",
                "name_ar": "بن  قشة"
              }
            ]
          },
          {
            "code": 3918,
            "name": "MAGRANE",
            "name_ar": "المقرن",
            "name_en": "MAGRANE",
            "baladyiats": [
              {
                "code": 3916,
                "name": "SIDI AOUN",
                "name_en": "SIDI AOUN",
                "name_ar": "سيدي عون"
              },
              {
                "code": 3918,
                "name": "MAGRANE",
                "name_en": "MAGRANE",
                "name_ar": "المقرن"
              }
            ]
          },
          {
            "code": 3926,
            "name": "MIH OUENSA",
            "name_ar": "اميه وانسة",
            "name_en": "MIH OUENSA",
            "baladyiats": [
              {
                "code": 3903,
                "name": "OUED EL ALENDA",
                "name_en": "OUED EL ALENDA",
                "name_ar": "وادي العلندة"
              },
              {
                "code": 3926,
                "name": "MIH OUANSA",
                "name_en": "MIH OUANSA",
                "name_ar": "اميه وانسة"
              }
            ]
          },
          {
            "code": 3927,
            "name": "EL MEGHAIER (wilya déléguée)",
            "name_ar": "المغير",
            "name_en": "EL MEGHAIER (wilya déléguée)",
            "baladyiats": [
              {
                "code": 3921,
                "name": "STILL",
                "name_en": "STILL",
                "name_ar": "سطيل"
              },
              {
                "code": 3923,
                "name": "SIDI KHELIL",
                "name_en": "SIDI KHELIL",
                "name_ar": "سيدي خليل"
              },
              {
                "code": 3927,
                "name": "EL-M'GHAIER",
                "name_en": "EL-M'GHAIER",
                "name_ar": "المغير"
              },
              {
                "code": 3929,
                "name": "OUM TOUYOUR",
                "name_en": "OUM TOUYOUR",
                "name_ar": "أم الطيور"
              }
            ]
          },
          {
            "code": 3927,
            "name": "EL MEGHAIER",
            "name_ar": "المغير (ولاية منتدبة)",
            "name_en": "EL MEGHAIER",
            "baladyiats": [
              {
                "code": 3921,
                "name": "STILL",
                "name_en": "STILL",
                "name_ar": "سطيل"
              },
              {
                "code": 3923,
                "name": "SIDI KHELIL",
                "name_en": "SIDI KHELIL",
                "name_ar": "سيدي خليل"
              },
              {
                "code": 3927,
                "name": "EL-M'GHAIER",
                "name_en": "EL-M'GHAIER",
                "name_ar": "المغير"
              },
              {
                "code": 3929,
                "name": "OUM TOUYOUR",
                "name_en": "OUM TOUYOUR",
                "name_ar": "أم الطيور"
              }
            ]
          },
          {
            "code": 3928,
            "name": "DJAMAA",
            "name_ar": "جامعة",
            "name_en": "DJAMAA",
            "baladyiats": [
              {
                "code": 3922,
                "name": "M'RARA",
                "name_en": "M'RARA",
                "name_ar": "المرارة"
              },
              {
                "code": 3924,
                "name": "TENEDLA",
                "name_en": "TENEDLA",
                "name_ar": "تندلة"
              },
              {
                "code": 3928,
                "name": "DJAMAA",
                "name_en": "DJAMAA",
                "name_ar": "جامعة"
              },
              {
                "code": 3930,
                "name": "SIDI AMRANE",
                "name_en": "SIDI AMRANE",
                "name_ar": "سيدي عمران"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          30,
          7,
          40,
          12
        ]
      },
      {
        "mattricule": 40,
        "name_ar": "خنشلة",
        "name_ber": "ⵅⴻⵏⵛⵍⴰ",
        "name_en": "Khenchela",
        "name": "Khenchela",
        "phoneCodes": [
          32
        ],
        "postalCodes": [
          40000,
          40001,
          40002,
          40003,
          40004,
          40005,
          40006,
          40007,
          40008,
          40009,
          40010,
          40011,
          40012,
          40013,
          40014,
          40015,
          40016,
          40017,
          40018,
          40019,
          40020,
          40021,
          40022,
          40023,
          40024,
          40025,
          40026,
          40027,
          40028,
          40029,
          40030,
          40031,
          40032,
          40033,
          40034,
          40035,
          40036,
          40037,
          40038,
          40039,
          40040,
          40041,
          40042,
          40043,
          40044,
          40045,
          40046,
          40047,
          40048,
          40049,
          40050,
          40051,
          40052,
          40053,
          40054,
          40055
        ],
        "dairats": [
          {
            "code": 4001,
            "name": "KHENCHELA",
            "name_ar": "خنشلة",
            "name_en": "KHENCHELA",
            "baladyiats": [
              {
                "code": 4001,
                "name": "KHENCHELA",
                "name_en": "KHENCHELA",
                "name_ar": "خنشلة"
              }
            ]
          },
          {
            "code": 4003,
            "name": "KAIS",
            "name_ar": "قايس",
            "name_en": "KAIS",
            "baladyiats": [
              {
                "code": 4003,
                "name": "KAIS",
                "name_en": "KAIS",
                "name_ar": "قايس"
              },
              {
                "code": 4007,
                "name": "TAOUZIANAT",
                "name_en": "TAOUZIANAT",
                "name_ar": "تاوزيانت"
              },
              {
                "code": 4010,
                "name": "REMILA",
                "name_en": "REMILA",
                "name_ar": "الرميلة"
              }
            ]
          },
          {
            "code": 4005,
            "name": "EL HAMMA",
            "name_ar": "الحامة",
            "name_en": "EL HAMMA",
            "baladyiats": [
              {
                "code": 4004,
                "name": "BAGHAI",
                "name_en": "BAGHAI",
                "name_ar": "بغاي"
              },
              {
                "code": 4005,
                "name": "EL HAMMA",
                "name_en": "EL HAMMA",
                "name_ar": "الحامة"
              },
              {
                "code": 4014,
                "name": "TAMZA",
                "name_en": "TAMZA",
                "name_ar": "طامزة"
              },
              {
                "code": 4015,
                "name": "ENSIGHA",
                "name_en": "ENSIGHA",
                "name_ar": "انسيغة"
              }
            ]
          },
          {
            "code": 4006,
            "name": "AIN TOUILA",
            "name_ar": "عين الطويلة",
            "name_en": "AIN TOUILA",
            "baladyiats": [
              {
                "code": 4002,
                "name": "M'TOUSSA",
                "name_en": "M'TOUSSA",
                "name_ar": "متوسة"
              },
              {
                "code": 4006,
                "name": "AIN TOUILA",
                "name_en": "AIN TOUILA",
                "name_ar": "عين الطويلة"
              }
            ]
          },
          {
            "code": 4008,
            "name": "BOUHMAMA",
            "name_ar": "بوحمامة",
            "name_en": "BOUHMAMA",
            "baladyiats": [
              {
                "code": 4008,
                "name": "BOUHMAMA",
                "name_en": "BOUHMAMA",
                "name_ar": "بوحمامة"
              },
              {
                "code": 4018,
                "name": "M'SARA",
                "name_en": "M'SARA",
                "name_ar": "مصارة"
              },
              {
                "code": 4019,
                "name": "YABOUS",
                "name_en": "YABOUS",
                "name_ar": "يابوس"
              },
              {
                "code": 4021,
                "name": "CHELIA",
                "name_en": "CHELIA",
                "name_ar": "شلية"
              }
            ]
          },
          {
            "code": 4011,
            "name": "CHECHAR",
            "name_ar": "ششار",
            "name_en": "CHECHAR",
            "baladyiats": [
              {
                "code": 4009,
                "name": "EL OUELDJA",
                "name_en": "EL OUELDJA",
                "name_ar": "الولجة"
              },
              {
                "code": 4011,
                "name": "CHECHAR",
                "name_en": "CHECHAR",
                "name_ar": "ششار"
              },
              {
                "code": 4012,
                "name": "DJELLAL",
                "name_en": "DJELLAL",
                "name_ar": "جلال"
              },
              {
                "code": 4020,
                "name": "KHIRANE",
                "name_en": "KHIRANE",
                "name_ar": "خيران"
              }
            ]
          },
          {
            "code": 4013,
            "name": "BABAR",
            "name_ar": "بابار",
            "name_en": "BABAR",
            "baladyiats": [
              {
                "code": 4013,
                "name": "BABAR",
                "name_en": "BABAR",
                "name_ar": "بابار"
              }
            ]
          },
          {
            "code": 4016,
            "name": "OULED RECHACHE",
            "name_ar": "أولاد رشاش",
            "name_en": "OULED RECHACHE",
            "baladyiats": [
              {
                "code": 4016,
                "name": "OULED RECHACHE",
                "name_en": "OULED RECHACHE",
                "name_ar": "أولاد رشاش"
              },
              {
                "code": 4017,
                "name": "EL MAHMAL",
                "name_en": "EL MAHMAL",
                "name_ar": "المحمل"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          39,
          7,
          5,
          4,
          12
        ]
      },
      {
        "mattricule": 41,
        "name_ar": "سوق أهراس",
        "name_ber": "ⵙⵓⵇⴻⵀⵔⴰⵙ",
        "name_en": "Souk Ahras",
        "name": "Souk Ahras",
        "phoneCodes": [
          37
        ],
        "postalCodes": [
          41000,
          41001,
          41002,
          41003,
          41004,
          41005,
          41006,
          41007,
          41008,
          41009,
          41010,
          41011,
          41012,
          41013,
          41014,
          41015,
          41016,
          41017,
          41018,
          41019,
          41020,
          41021,
          41022,
          41023,
          41024,
          41025,
          41026,
          41027,
          41028,
          41029,
          41030,
          41031,
          41032,
          41033,
          41034,
          41035,
          41036,
          41037,
          41038,
          41039,
          41040,
          41041,
          41042,
          41043,
          41044,
          41045,
          41046,
          41047,
          41048,
          41049,
          41050,
          41051,
          41052,
          41053
        ],
        "dairats": [
          {
            "code": 4101,
            "name": "SOUK AHRAS",
            "name_ar": "سوق أهراس",
            "name_en": "SOUK AHRAS",
            "baladyiats": [
              {
                "code": 4101,
                "name": "SOUK AHRAS",
                "name_en": "SOUK AHRAS",
                "name_ar": "سوق أهراس"
              }
            ]
          },
          {
            "code": 4102,
            "name": "SEDRATA",
            "name_ar": "سدراتة",
            "name_en": "SEDRATA",
            "baladyiats": [
              {
                "code": 4102,
                "name": "SEDRATA",
                "name_en": "SEDRATA",
                "name_ar": "سدراتة"
              },
              {
                "code": 4118,
                "name": "AIN SOLTANE",
                "name_en": "AIN SOLTANE",
                "name_ar": "عين سلطان"
              },
              {
                "code": 4123,
                "name": "KHEMISSA",
                "name_en": "KHEMISSA",
                "name_ar": "خميسة"
              }
            ]
          },
          {
            "code": 4104,
            "name": "MECHROHA",
            "name_ar": "المشروحة",
            "name_en": "MECHROHA",
            "baladyiats": [
              {
                "code": 4103,
                "name": "HANENCHA",
                "name_en": "HANENCHA",
                "name_ar": "الحنانشة"
              },
              {
                "code": 4104,
                "name": "MACHROHA",
                "name_en": "MACHROHA",
                "name_ar": "المشروحة"
              }
            ]
          },
          {
            "code": 4105,
            "name": "OULED DRISS",
            "name_ar": "أولاد إدريس",
            "name_en": "OULED DRISS",
            "baladyiats": [
              {
                "code": 4105,
                "name": "OULED DRISS",
                "name_en": "OULED DRISS",
                "name_ar": "أولاد إدريس"
              },
              {
                "code": 4117,
                "name": "AIN ZANA",
                "name_en": "AIN ZANA",
                "name_ar": "عين الزانة"
              }
            ]
          },
          {
            "code": 4108,
            "name": "TAOURA",
            "name_ar": "تاورة",
            "name_en": "TAOURA",
            "baladyiats": [
              {
                "code": 4107,
                "name": "ZAAROURIA",
                "name_en": "ZAAROURIA",
                "name_ar": "الزعرورية"
              },
              {
                "code": 4108,
                "name": "TAOURA",
                "name_en": "TAOURA",
                "name_ar": "تاورة"
              },
              {
                "code": 4109,
                "name": "DREA",
                "name_en": "DREA",
                "name_ar": "الدريعة"
              }
            ]
          },
          {
            "code": 4110,
            "name": "HADDADA",
            "name_ar": "الحدادة",
            "name_en": "HADDADA",
            "baladyiats": [
              {
                "code": 4110,
                "name": "HADDADA",
                "name_en": "HADDADA",
                "name_ar": "الحدادة"
              },
              {
                "code": 4111,
                "name": "KHEDARA",
                "name_en": "KHEDARA",
                "name_ar": "الخضارة"
              },
              {
                "code": 4113,
                "name": "OULED MOUMEN",
                "name_en": "OULED MOUMEN",
                "name_ar": "أولاد مومن"
              }
            ]
          },
          {
            "code": 4112,
            "name": "MERAHNA",
            "name_ar": "المراهنة",
            "name_en": "MERAHNA",
            "baladyiats": [
              {
                "code": 4112,
                "name": "MERAHNA",
                "name_en": "MERAHNA",
                "name_ar": "المراهنة"
              },
              {
                "code": 4119,
                "name": "OUILLEN",
                "name_en": "OUILLEN",
                "name_ar": "ويلان"
              },
              {
                "code": 4120,
                "name": "SIDI FREDJ",
                "name_en": "SIDI FREDJ",
                "name_ar": "سيدي فرج"
              }
            ]
          },
          {
            "code": 4114,
            "name": "BIR BOUHOUCHE",
            "name_ar": "بئر بوحوش",
            "name_en": "BIR BOUHOUCHE",
            "baladyiats": [
              {
                "code": 4114,
                "name": "BIR BOUHOUCHE",
                "name_en": "BIR BOUHOUCHE",
                "name_ar": "بئر بوحوش"
              },
              {
                "code": 4121,
                "name": "SAFEL EL OUIDEN",
                "name_en": "SAFEL EL OUIDEN",
                "name_ar": "سافل الويدان"
              },
              {
                "code": 4126,
                "name": "ZOUABI",
                "name_en": "ZOUABI",
                "name_ar": "الزوابي"
              }
            ]
          },
          {
            "code": 4115,
            "name": "M'DAOUROUCHE",
            "name_ar": "مداوروش",
            "name_en": "M'DAOUROUCHE",
            "baladyiats": [
              {
                "code": 4106,
                "name": "TIFFECH",
                "name_en": "TIFFECH",
                "name_ar": "تيفاش"
              },
              {
                "code": 4115,
                "name": "M'DAOUROUCHE",
                "name_en": "M'DAOUROUCHE",
                "name_ar": "مداوروش"
              },
              {
                "code": 4122,
                "name": "RAGOUBA",
                "name_en": "RAGOUBA",
                "name_ar": "الراقوبة"
              }
            ]
          },
          {
            "code": 4116,
            "name": "OUM EL ADHAIM",
            "name_ar": "أم العظايم",
            "name_en": "OUM EL ADHAIM",
            "baladyiats": [
              {
                "code": 4116,
                "name": "OUM EL ADHAIM",
                "name_en": "OUM EL ADHAIM",
                "name_ar": "أم العظايم"
              },
              {
                "code": 4124,
                "name": "OUED KEBRIT",
                "name_en": "OUED KEBRIT",
                "name_ar": "وادي الكبريت"
              },
              {
                "code": 4125,
                "name": "TERRAGUELT",
                "name_en": "TERRAGUELT",
                "name_ar": "ترقالت"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          12,
          4,
          24,
          36
        ]
      },
      {
        "mattricule": 42,
        "name_ar": "تيبازة",
        "name_ber": "ⵜⵉⵒⴰⵣⴰ",
        "name_en": "Tipaza",
        "name": "Tipaza",
        "phoneCodes": [
          24
        ],
        "postalCodes": [
          42000,
          42001,
          42002,
          42003,
          42004,
          42005,
          42006,
          42007,
          42008,
          42009,
          42010,
          42011,
          42012,
          42013,
          42014,
          42015,
          42016,
          42017,
          42018,
          42019,
          42020,
          42021,
          42022,
          42023,
          42024,
          42025,
          42026,
          42027,
          42028,
          42029,
          42030,
          42031,
          42032,
          42033,
          42034,
          42035,
          42036,
          42037,
          42038,
          42039,
          42040,
          42041,
          42042,
          42043,
          42044,
          42045,
          42046,
          42047,
          42048,
          42049,
          42050,
          42051,
          42052,
          42053,
          42054,
          42055,
          42056,
          42057,
          42058,
          42059,
          42060,
          42061,
          42062,
          42063,
          42064,
          42065,
          42066,
          42069,
          42068,
          42067,
          42070,
          42071
        ],
        "dairats": [
          {
            "code": 4201,
            "name": "TIPAZA",
            "name_ar": "تيبازة",
            "name_en": "TIPAZA",
            "baladyiats": [
              {
                "code": 4201,
                "name": "TIPAZA",
                "name_en": "TIPAZA",
                "name_ar": "تيبازة"
              }
            ]
          },
          {
            "code": 4208,
            "name": "HADJOUT",
            "name_ar": "حجوط",
            "name_en": "HADJOUT",
            "baladyiats": [
              {
                "code": 4208,
                "name": "HADJOUT",
                "name_en": "HADJOUT",
                "name_ar": "حجوط"
              },
              {
                "code": 4216,
                "name": "MERAD",
                "name_en": "MERAD",
                "name_ar": "مراد"
              }
            ]
          },
          {
            "code": 4209,
            "name": "SIDI AMAR",
            "name_ar": "سيدي أعمر",
            "name_en": "SIDI AMAR",
            "baladyiats": [
              {
                "code": 4202,
                "name": "MENACEUR",
                "name_en": "MENACEUR",
                "name_ar": "مناصر"
              },
              {
                "code": 4209,
                "name": "SIDI-AMAR",
                "name_en": "SIDI-AMAR",
                "name_ar": "سيدي عامر"
              },
              {
                "code": 4211,
                "name": "NADOR",
                "name_en": "NADOR",
                "name_ar": "الناظور"
              }
            ]
          },
          {
            "code": 4210,
            "name": "GOURAYA",
            "name_ar": "قوراية",
            "name_en": "GOURAYA",
            "baladyiats": [
              {
                "code": 4207,
                "name": "AGHBAL",
                "name_en": "AGHBAL",
                "name_ar": "أغبال"
              },
              {
                "code": 4210,
                "name": "GOURAYA",
                "name_en": "GOURAYA",
                "name_ar": "قوراية"
              },
              {
                "code": 4222,
                "name": "MESSELMOUN",
                "name_en": "MESSELMOUN",
                "name_ar": "مسلمون"
              }
            ]
          },
          {
            "code": 4214,
            "name": "CHERCHELL",
            "name_ar": "شرشال",
            "name_en": "CHERCHELL",
            "baladyiats": [
              {
                "code": 4214,
                "name": "CHERCHELL",
                "name_en": "CHERCHELL",
                "name_ar": "شرشال"
              },
              {
                "code": 4221,
                "name": "SIDI GHILES",
                "name_en": "SIDI GHILES",
                "name_ar": "سيدي غيلاس"
              },
              {
                "code": 4226,
                "name": "SIDI SEMIANE",
                "name_en": "SIDI SEMIANE",
                "name_ar": "سيدي سميان"
              },
              {
                "code": 4228,
                "name": "HADJRET ENNOUS",
                "name_en": "HADJRET ENNOUS",
                "name_ar": "حجرة النص"
              }
            ]
          },
          {
            "code": 4215,
            "name": "DAMOUS",
            "name_ar": "الداموس",
            "name_en": "DAMOUS",
            "baladyiats": [
              {
                "code": 4203,
                "name": "LARHAT",
                "name_en": "LARHAT",
                "name_ar": "الأرهاط"
              },
              {
                "code": 4215,
                "name": "DAMOUS",
                "name_en": "DAMOUS",
                "name_ar": "الداموس"
              },
              {
                "code": 4227,
                "name": "BENI MILEUK",
                "name_en": "BENI MILEUK",
                "name_ar": "بني ميلك"
              }
            ]
          },
          {
            "code": 4217,
            "name": "FOUKA",
            "name_ar": "فوكة",
            "name_en": "FOUKA",
            "baladyiats": [
              {
                "code": 4204,
                "name": "DOUAOUDA",
                "name_en": "DOUAOUDA",
                "name_ar": "دواودة"
              },
              {
                "code": 4217,
                "name": "FOUKA",
                "name_en": "FOUKA",
                "name_ar": "فوكة"
              }
            ]
          },
          {
            "code": 4218,
            "name": "BOU ISMAIL",
            "name_ar": "بواسماعيل",
            "name_en": "BOU ISMAIL",
            "baladyiats": [
              {
                "code": 4206,
                "name": "KHEMISTI",
                "name_en": "KHEMISTI",
                "name_ar": "خميستي"
              },
              {
                "code": 4213,
                "name": "AIN TAGOURAIT",
                "name_en": "AIN TAGOURAIT",
                "name_ar": "عين تاقورايت"
              },
              {
                "code": 4218,
                "name": "BOU ISMAIL",
                "name_en": "BOU ISMAIL",
                "name_ar": "بواسماعيل"
              },
              {
                "code": 4220,
                "name": "BOU HAROUN",
                "name_en": "BOU HAROUN",
                "name_ar": "بوهارون"
              }
            ]
          },
          {
            "code": 4219,
            "name": "AHMAR EL AIN",
            "name_ar": "أحمر العين",
            "name_en": "AHMAR EL AIN",
            "baladyiats": [
              {
                "code": 4205,
                "name": "BOURKIKA",
                "name_en": "BOURKIKA",
                "name_ar": "بورقيقة"
              },
              {
                "code": 4219,
                "name": "AHMER EL AIN",
                "name_en": "AHMER EL AIN",
                "name_ar": "أحمر العين"
              },
              {
                "code": 4223,
                "name": "SIDI RACHED",
                "name_en": "SIDI RACHED",
                "name_ar": "سيدي راشد"
              }
            ]
          },
          {
            "code": 4224,
            "name": "KOLEA",
            "name_ar": "القليعة",
            "name_en": "KOLEA",
            "baladyiats": [
              {
                "code": 4212,
                "name": "CHAIBA",
                "name_en": "CHAIBA",
                "name_ar": "الشعيبة"
              },
              {
                "code": 4224,
                "name": "KOLEA",
                "name_en": "KOLEA",
                "name_ar": "القليعة"
              },
              {
                "code": 4225,
                "name": "ATTATBA",
                "name_en": "ATTATBA",
                "name_ar": "الحطاطبة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          44,
          2,
          16,
          9
        ]
      },
      {
        "mattricule": 43,
        "name_ar": "ميلة",
        "name_ber": "ⵎⵉⵍⴰ",
        "name_en": "Mila",
        "name": "Mila",
        "phoneCodes": [
          31
        ],
        "postalCodes": [
          43000,
          43001,
          43002,
          43003,
          43004,
          43005,
          43006,
          43007,
          43008,
          43009,
          43010,
          43011,
          43012,
          43013,
          43014,
          43015,
          43016,
          43017,
          43018,
          43019,
          43020,
          43021,
          43022,
          43023,
          43024,
          43025,
          43026,
          43027,
          43028,
          43029,
          43030,
          43031,
          43032,
          43033,
          43034,
          43035,
          43036,
          43037,
          43038,
          43039,
          43040,
          43041,
          43042,
          43043,
          43044,
          43045,
          43046,
          43047,
          43048,
          43049,
          43050,
          43051,
          43052,
          43053,
          43055,
          43057,
          43058,
          43059,
          43060,
          43061,
          43062,
          43063,
          43064,
          43065,
          43066,
          43067,
          43068,
          43069,
          43070,
          43071,
          43072,
          43073,
          43074,
          43075,
          43076,
          43077
        ],
        "dairats": [
          {
            "code": 4301,
            "name": "MILA",
            "name_ar": "ميلة",
            "name_en": "MILA",
            "baladyiats": [
              {
                "code": 4301,
                "name": "MILA",
                "name_en": "MILA",
                "name_ar": "ميلة"
              },
              {
                "code": 4325,
                "name": "AIN TINE",
                "name_en": "AIN TINE",
                "name_ar": "عين التين"
              },
              {
                "code": 4327,
                "name": "SIDI KHELIFA",
                "name_en": "SIDI KHELIFA",
                "name_ar": "سيدي خليفة"
              }
            ]
          },
          {
            "code": 4302,
            "name": "FERDJIOUA",
            "name_ar": "فرجيوة",
            "name_en": "FERDJIOUA",
            "baladyiats": [
              {
                "code": 4302,
                "name": "FERDJIOUA",
                "name_en": "FERDJIOUA",
                "name_ar": "فرجيوة"
              },
              {
                "code": 4331,
                "name": "YAHIA BENIGUECHA",
                "name_en": "YAHIA BENIGUECHA",
                "name_ar": "يحي بني قشة"
              }
            ]
          },
          {
            "code": 4303,
            "name": "CHELGHOUM LAID",
            "name_ar": "شلغوم العيد",
            "name_en": "CHELGHOUM LAID",
            "baladyiats": [
              {
                "code": 4303,
                "name": "CHELGHOUM LAID",
                "name_en": "CHELGHOUM LAID",
                "name_ar": "شلغوم العيد"
              },
              {
                "code": 4304,
                "name": "OUED ATHMENIA",
                "name_en": "OUED ATHMENIA",
                "name_ar": "وادي العثمانية"
              },
              {
                "code": 4305,
                "name": "AIN MELLOUK",
                "name_en": "AIN MELLOUK",
                "name_ar": "عين الملوك"
              }
            ]
          },
          {
            "code": 4306,
            "name": "TELEGHMA",
            "name_ar": "التلاغمة",
            "name_en": "TELEGHMA",
            "baladyiats": [
              {
                "code": 4306,
                "name": "TELEGHMA",
                "name_en": "TELEGHMA",
                "name_ar": "التلاغمة"
              },
              {
                "code": 4307,
                "name": "OUED SEGUEN",
                "name_en": "OUED SEGUEN",
                "name_ar": "وادي سقان"
              },
              {
                "code": 4326,
                "name": "EL MECHIRA",
                "name_en": "EL MECHIRA",
                "name_ar": "مشيرة"
              }
            ]
          },
          {
            "code": 4308,
            "name": "TADJENANET",
            "name_ar": "تاجنانت",
            "name_en": "TADJENANET",
            "baladyiats": [
              {
                "code": 4308,
                "name": "TADJENANET",
                "name_en": "TADJENANET",
                "name_ar": "تاجنانت"
              },
              {
                "code": 4309,
                "name": "BENYAHIA ABDERRAHMANE",
                "name_en": "BENYAHIA ABDERRAHMANE",
                "name_ar": "بن يحي عبد الرحمن"
              },
              {
                "code": 4312,
                "name": "OULED KHALOUF",
                "name_en": "OULED KHALOUF",
                "name_ar": "أولاد اخلوف"
              }
            ]
          },
          {
            "code": 4310,
            "name": "OUED ENDJA",
            "name_ar": "وادي النجاء",
            "name_en": "OUED ENDJA",
            "baladyiats": [
              {
                "code": 4310,
                "name": "OUED ENDJA",
                "name_en": "OUED ENDJA",
                "name_ar": "وادي النجاء"
              },
              {
                "code": 4311,
                "name": "AHMED RACHEDI",
                "name_en": "AHMED RACHEDI",
                "name_ar": "أحمد راشدي"
              },
              {
                "code": 4328,
                "name": "ZEGHAIA",
                "name_en": "ZEGHAIA",
                "name_ar": "زغاية"
              }
            ]
          },
          {
            "code": 4314,
            "name": "BOUHATEM",
            "name_ar": "بوحاتم",
            "name_en": "BOUHATEM",
            "baladyiats": [
              {
                "code": 4314,
                "name": "BOUHATEM",
                "name_en": "BOUHATEM",
                "name_ar": "بوحاتم"
              },
              {
                "code": 4320,
                "name": "DERRAHI BOUSSELAH",
                "name_en": "DERRAHI BOUSSELAH",
                "name_ar": "دراحي بوصلاح"
              }
            ]
          },
          {
            "code": 4315,
            "name": "ROUACHED",
            "name_ar": "الرواشد",
            "name_en": "ROUACHED",
            "baladyiats": [
              {
                "code": 4313,
                "name": "TIBERGUENT",
                "name_en": "TIBERGUENT",
                "name_ar": "تيبرقنت"
              },
              {
                "code": 4315,
                "name": "ROUACHED",
                "name_en": "ROUACHED",
                "name_ar": "الرواشد"
              }
            ]
          },
          {
            "code": 4317,
            "name": "GRAREM GOUGA",
            "name_ar": "القرارم قوقة",
            "name_en": "GRAREM GOUGA",
            "baladyiats": [
              {
                "code": 4317,
                "name": "GRAREM GOUGA",
                "name_en": "GRAREM GOUGA",
                "name_ar": "القرارم قوقة"
              },
              {
                "code": 4324,
                "name": "HAMALA",
                "name_en": "HAMALA",
                "name_ar": "حمالة"
              }
            ]
          },
          {
            "code": 4318,
            "name": "SIDI MEROUANE",
            "name_ar": "سيدي مروان",
            "name_en": "SIDI MEROUANE",
            "baladyiats": [
              {
                "code": 4318,
                "name": "SIDI MEROUANE",
                "name_en": "SIDI MEROUANE",
                "name_ar": "سيدي مروان"
              },
              {
                "code": 4332,
                "name": "CHIGARA",
                "name_en": "CHIGARA",
                "name_ar": "الشيقارة"
              }
            ]
          },
          {
            "code": 4319,
            "name": "TASSADANE HADDADA",
            "name_ar": "تسدان حدادة",
            "name_en": "TASSADANE HADDADA",
            "baladyiats": [
              {
                "code": 4319,
                "name": "TASSADANE HADDADA",
                "name_en": "TASSADANE HADDADA",
                "name_ar": "تسدان حدادة"
              },
              {
                "code": 4321,
                "name": "Minar Zarza",
                "name_en": "Minar Zarza",
                "name_ar": "مينار زارزة"
              }
            ]
          },
          {
            "code": 4323,
            "name": "TERRAI BAINEN",
            "name_ar": "ترعي باينان",
            "name_en": "TERRAI BAINEN",
            "baladyiats": [
              {
                "code": 4316,
                "name": "TASSALA LEMATAI",
                "name_en": "TASSALA LEMATAI",
                "name_ar": "تسالة لمطاعي"
              },
              {
                "code": 4322,
                "name": "AMIRA ARRES",
                "name_en": "AMIRA ARRES",
                "name_ar": "اعميرة اراس"
              },
              {
                "code": 4323,
                "name": "TERRAI BAINEN",
                "name_en": "TERRAI BAINEN",
                "name_ar": "ترعي باينان"
              }
            ]
          },
          {
            "code": 4330,
            "name": "AIN BEIDA HARRICHE",
            "name_ar": "عين البيضاء أحريش",
            "name_en": "AIN BEIDA HARRICHE",
            "baladyiats": [
              {
                "code": 4329,
                "name": "El Ayadi Barbes",
                "name_en": "El Ayadi Barbes",
                "name_ar": "العياضي برباس"
              },
              {
                "code": 4330,
                "name": "AIN BEIDA HARRICHE",
                "name_en": "AIN BEIDA HARRICHE",
                "name_ar": "عين البيضاء أحريش"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          5,
          19,
          18,
          25,
          4
        ]
      },
      {
        "mattricule": 44,
        "name_ar": "عين الدفلى",
        "name_ber": "ⵄⵉⵏ ⴷⴻⴼⵍⴰ",
        "name_en": "Ain Defla",
        "name": "Ain Defla",
        "phoneCodes": [
          27
        ],
        "postalCodes": [
          44000,
          44001,
          44002,
          44003,
          44004,
          44005,
          44006,
          44007,
          44008,
          44009,
          44010,
          44011,
          44012,
          44013,
          44014,
          44015,
          44016,
          44017,
          44018,
          44019,
          44020,
          44021,
          44022,
          44023,
          44024,
          44025,
          44026,
          44027,
          44028,
          44029,
          44030,
          44031,
          44032,
          44033,
          44034,
          44035,
          44036,
          44037,
          44038,
          44039,
          44040,
          44041,
          44042,
          44043,
          44044,
          44045,
          44046,
          44047,
          44048,
          44049,
          44050,
          44051,
          44052,
          44053,
          44054,
          44055,
          44056,
          44057,
          44058,
          44059,
          44060,
          44061,
          44062,
          44063,
          44064,
          44065,
          44066,
          44067
        ],
        "dairats": [
          {
            "code": 4401,
            "name": "AIN DEFLA",
            "name_ar": "عين الدفلى",
            "name_en": "AIN DEFLA",
            "baladyiats": [
              {
                "code": 4401,
                "name": "AIN-DEFLA",
                "name_en": "AIN-DEFLA",
                "name_ar": "عين الدفلى"
              }
            ]
          },
          {
            "code": 4402,
            "name": "MILIANA",
            "name_ar": "مليانة",
            "name_en": "MILIANA",
            "baladyiats": [
              {
                "code": 4402,
                "name": "MILIANA",
                "name_en": "MILIANA",
                "name_ar": "مليانة"
              },
              {
                "code": 4425,
                "name": "BEN ALLAL",
                "name_en": "BEN ALLAL",
                "name_ar": "بن علال"
              }
            ]
          },
          {
            "code": 4403,
            "name": "BOUMEDFAA",
            "name_ar": "بومدفع",
            "name_en": "BOUMEDFAA",
            "baladyiats": [
              {
                "code": 4403,
                "name": "BOUMEDFAA",
                "name_en": "BOUMEDFAA",
                "name_ar": "بومدفع"
              },
              {
                "code": 4427,
                "name": "HOCEINIA",
                "name_en": "HOCEINIA",
                "name_ar": "الحسينية"
              }
            ]
          },
          {
            "code": 4404,
            "name": "KHEMIS",
            "name_ar": "خميس",
            "name_en": "KHEMIS",
            "baladyiats": [
              {
                "code": 4404,
                "name": "KHEMIS-MILIANA",
                "name_en": "KHEMIS-MILIANA",
                "name_ar": "خميس مليانة"
              },
              {
                "code": 4424,
                "name": "SIDI-LAKHDAR",
                "name_en": "SIDI-LAKHDAR",
                "name_ar": "سيدي الأخضر"
              }
            ]
          },
          {
            "code": 4405,
            "name": "HAMMAM RIGHA",
            "name_ar": "حمام ريغة",
            "name_en": "HAMMAM RIGHA",
            "baladyiats": [
              {
                "code": 4405,
                "name": "HAMMAM-RIGHA",
                "name_en": "HAMMAM-RIGHA",
                "name_ar": "حمام ريغة"
              },
              {
                "code": 4423,
                "name": "AIN-TORKI",
                "name_en": "AIN-TORKI",
                "name_ar": "عين التركي"
              },
              {
                "code": 4426,
                "name": "AIN-BENIAN",
                "name_en": "AIN-BENIAN",
                "name_ar": "عين البنيان"
              }
            ]
          },
          {
            "code": 4407,
            "name": "DJELIDA",
            "name_ar": "جليدة",
            "name_en": "DJELIDA",
            "baladyiats": [
              {
                "code": 4407,
                "name": "DJELIDA",
                "name_en": "DJELIDA",
                "name_ar": "جليدة"
              },
              {
                "code": 4409,
                "name": "BOURACHED",
                "name_en": "BOURACHED",
                "name_ar": "بوراشد"
              },
              {
                "code": 4429,
                "name": "DJEMAA OULED CHEIKH",
                "name_en": "DJEMAA OULED CHEIKH",
                "name_ar": "جمعة أولاد الشيخ"
              }
            ]
          },
          {
            "code": 4408,
            "name": "EL AMRA",
            "name_ar": "العامرة",
            "name_en": "EL AMRA",
            "baladyiats": [
              {
                "code": 4406,
                "name": "ARIB",
                "name_en": "ARIB",
                "name_ar": "عريب"
              },
              {
                "code": 4408,
                "name": "EL-AMRA",
                "name_en": "EL-AMRA",
                "name_ar": "العامرة"
              },
              {
                "code": 4430,
                "name": "MEKHATRIA",
                "name_en": "MEKHATRIA",
                "name_ar": "المخاطرية"
              }
            ]
          },
          {
            "code": 4410,
            "name": "EL ATTAF",
            "name_ar": "العطاف",
            "name_en": "EL ATTAF",
            "baladyiats": [
              {
                "code": 4410,
                "name": "EL-ATTAF",
                "name_en": "EL-ATTAF",
                "name_ar": "العطاف"
              },
              {
                "code": 4435,
                "name": "TIBERKANINE",
                "name_en": "TIBERKANINE",
                "name_ar": "تبركانين"
              }
            ]
          },
          {
            "code": 4411,
            "name": "EL ABADIA",
            "name_ar": "العبادية",
            "name_en": "EL ABADIA",
            "baladyiats": [
              {
                "code": 4411,
                "name": "EL-ABADIA",
                "name_en": "EL-ABADIA",
                "name_ar": "العبادية"
              },
              {
                "code": 4432,
                "name": "TACHETA ZEGAGHA",
                "name_en": "TACHETA ZEGAGHA",
                "name_ar": "تاشتة زقاغة"
              },
              {
                "code": 4433,
                "name": "AIN-BOUYAHIA",
                "name_en": "AIN-BOUYAHIA",
                "name_ar": "عين بويحيى"
              }
            ]
          },
          {
            "code": 4412,
            "name": "DJENDEL",
            "name_ar": "جندل",
            "name_en": "DJENDEL",
            "baladyiats": [
              {
                "code": 4412,
                "name": "DJENDEL",
                "name_en": "DJENDEL",
                "name_ar": "جندل"
              },
              {
                "code": 4413,
                "name": "OUED CHORFA",
                "name_en": "OUED CHORFA",
                "name_ar": "وادي الشرفاء"
              },
              {
                "code": 4428,
                "name": "BIRBOUCHE",
                "name_en": "BIRBOUCHE",
                "name_ar": "بربوش"
              }
            ]
          },
          {
            "code": 4414,
            "name": "AIN LECHIAKH",
            "name_ar": "عين الاشياخ",
            "name_en": "AIN LECHIAKH",
            "baladyiats": [
              {
                "code": 4414,
                "name": "AIN-LECHIAKH",
                "name_en": "AIN-LECHIAKH",
                "name_ar": "عين الاشياخ"
              },
              {
                "code": 4415,
                "name": "OUED DJEMAA",
                "name_en": "OUED DJEMAA",
                "name_ar": "واد الجمعة"
              },
              {
                "code": 4420,
                "name": "AIN-SOLTANE",
                "name_en": "AIN-SOLTANE",
                "name_ar": "عين السلطان"
              }
            ]
          },
          {
            "code": 4416,
            "name": "ROUINA",
            "name_ar": "الروينة",
            "name_en": "ROUINA",
            "baladyiats": [
              {
                "code": 4416,
                "name": "ROUINA",
                "name_en": "ROUINA",
                "name_ar": "الروينة"
              },
              {
                "code": 4417,
                "name": "ZEDDINE",
                "name_en": "ZEDDINE",
                "name_ar": "زدين"
              },
              {
                "code": 4434,
                "name": "EL-MAINE",
                "name_en": "EL-MAINE",
                "name_ar": "الماين"
              }
            ]
          },
          {
            "code": 4422,
            "name": "BORDJ EL EMIR KHALED",
            "name_ar": "برج الأمير خالد",
            "name_en": "BORDJ EL EMIR KHALED",
            "baladyiats": [
              {
                "code": 4419,
                "name": "BIR-OULD-KHELIFA",
                "name_en": "BIR-OULD-KHELIFA",
                "name_ar": "بئر ولد خليفة"
              },
              {
                "code": 4421,
                "name": "TARIK-IBN-ZIAD",
                "name_en": "TARIK-IBN-ZIAD",
                "name_ar": "طارق بن زياد"
              },
              {
                "code": 4422,
                "name": "BORDJ-EMIR-KHALED",
                "name_en": "BORDJ-EMIR-KHALED",
                "name_ar": "برج الأمير خالد"
              }
            ]
          },
          {
            "code": 4431,
            "name": "BATHIA",
            "name_ar": "بطحية",
            "name_en": "BATHIA",
            "baladyiats": [
              {
                "code": 4418,
                "name": "HASSANIA",
                "name_en": "HASSANIA",
                "name_ar": "الحسانية"
              },
              {
                "code": 4431,
                "name": "BATHIA",
                "name_en": "BATHIA",
                "name_ar": "بطحية"
              },
              {
                "code": 4436,
                "name": "BELAAS",
                "name_en": "BELAAS",
                "name_ar": "بلعاص"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          38,
          2,
          42,
          9,
          26
        ]
      },
      {
        "mattricule": 45,
        "name_ar": "النعامة",
        "name_ber": "ⵏⵄⴰⵎⴰ",
        "name_en": "Naama",
        "name": "Naama",
        "phoneCodes": [
          49
        ],
        "postalCodes": [
          45000,
          45001,
          45002,
          45003,
          45004,
          45005,
          45006,
          45007,
          45008,
          45009,
          45010,
          45011,
          45012,
          45013,
          45014,
          45015,
          45016,
          45017,
          45018,
          45019,
          45020,
          45021,
          45022,
          45023,
          45024,
          45025,
          45026,
          45027,
          45028,
          45029,
          45030,
          45031,
          45032,
          45033,
          45034,
          45035,
          45036,
          45037,
          45038,
          45039,
          45040,
          45041,
          45042,
          45043,
          45044,
          45045,
          45046,
          45047,
          45048,
          45049,
          45050
        ],
        "dairats": [
          {
            "code": 4501,
            "name": "NAAMA",
            "name_ar": "النعامة",
            "name_en": "NAAMA",
            "baladyiats": [
              {
                "code": 4501,
                "name": "NAAMA",
                "name_en": "NAAMA",
                "name_ar": "النعامة"
              }
            ]
          },
          {
            "code": 4502,
            "name": "MECHERIA",
            "name_ar": "المشرية",
            "name_en": "MECHERIA",
            "baladyiats": [
              {
                "code": 4502,
                "name": "MECHERIA",
                "name_en": "MECHERIA",
                "name_ar": "المشرية"
              },
              {
                "code": 4509,
                "name": "AIN BEN KHELIL",
                "name_en": "AIN BEN KHELIL",
                "name_ar": "عين بن خليل"
              },
              {
                "code": 4512,
                "name": "El BIODH",
                "name_en": "El BIODH",
                "name_ar": "البيوض"
              }
            ]
          },
          {
            "code": 4503,
            "name": "AIN SEFRA",
            "name_ar": "عين الصفراء",
            "name_en": "AIN SEFRA",
            "baladyiats": [
              {
                "code": 4503,
                "name": "AIN SEFRA",
                "name_en": "AIN SEFRA",
                "name_ar": "عين الصفراء"
              },
              {
                "code": 4504,
                "name": "TIOUT",
                "name_en": "TIOUT",
                "name_ar": "تيوت"
              }
            ]
          },
          {
            "code": 4505,
            "name": "SFISSIFA",
            "name_ar": "سفيسيفة",
            "name_en": "SFISSIFA",
            "baladyiats": [
              {
                "code": 4505,
                "name": "SFISSIFA",
                "name_en": "SFISSIFA",
                "name_ar": "سفيسيفة"
              }
            ]
          },
          {
            "code": 4506,
            "name": "MOGHRAR",
            "name_ar": "مغرار",
            "name_en": "MOGHRAR",
            "baladyiats": [
              {
                "code": 4506,
                "name": "MOGHRAR",
                "name_en": "MOGHRAR",
                "name_ar": "مغرار"
              },
              {
                "code": 4508,
                "name": "DJENIENNE BOUREZG",
                "name_en": "DJENIENNE BOUREZG",
                "name_ar": "جنين بورزق"
              }
            ]
          },
          {
            "code": 4507,
            "name": "ASLA",
            "name_ar": "عسلة",
            "name_en": "ASLA",
            "baladyiats": [
              {
                "code": 4507,
                "name": "ASLA",
                "name_en": "ASLA",
                "name_ar": "عسلة"
              }
            ]
          },
          {
            "code": 4510,
            "name": "MEKMEN BEN AMAR",
            "name_ar": "مكمن بن عمار",
            "name_en": "MEKMEN BEN AMAR",
            "baladyiats": [
              {
                "code": 4510,
                "name": "MAKMEN BEN AMAR",
                "name_en": "MAKMEN BEN AMAR",
                "name_ar": "مكمن بن عمار"
              },
              {
                "code": 4511,
                "name": "KASDIR",
                "name_en": "KASDIR",
                "name_ar": "القصدير"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          13,
          22,
          32,
          8
        ]
      },
      {
        "mattricule": 46,
        "name_ar": "عين تموشنت",
        "name_ber": "ⵄⵉⵏ ⵜⵉⵎⵓⵛⴻⵏⵜ",
        "name_en": "Ain Temouchent",
        "name": "Ain Temouchent",
        "phoneCodes": [
          43
        ],
        "postalCodes": [
          46000,
          46001,
          46002,
          46003,
          46004,
          46005,
          46006,
          46007,
          46008,
          46009,
          46010,
          46011,
          46012,
          46013,
          46014,
          46015,
          46016,
          46017,
          46018,
          46019,
          46020,
          46021,
          46022,
          46023,
          46024,
          46025,
          46026,
          46027,
          46028,
          46029,
          46030,
          46031,
          46032,
          46033,
          46035,
          46036,
          46037,
          46038,
          46039,
          46040,
          46041,
          46042,
          46043,
          46044,
          46045,
          46046,
          46047,
          46048,
          46049,
          46051,
          46052,
          46053,
          46055,
          46056,
          46057,
          46058,
          46059,
          46060,
          46061,
          46062,
          46063,
          46064,
          46065,
          46066,
          46067,
          46068
        ],
        "dairats": [
          {
            "code": 4601,
            "name": "AIN TEMOUCHENT",
            "name_ar": "عين تموشنت",
            "name_en": "AIN TEMOUCHENT",
            "baladyiats": [
              {
                "code": 4601,
                "name": "AIN TEMOUCHENT",
                "name_en": "AIN TEMOUCHENT",
                "name_ar": "عين تموشنت"
              },
              {
                "code": 4612,
                "name": "SIDI BEN ADDA",
                "name_en": "SIDI BEN ADDA",
                "name_ar": "سيدي بن عدة"
              }
            ]
          },
          {
            "code": 4604,
            "name": "HAMMAM BOU HADJAR",
            "name_ar": "حمام بوحجر",
            "name_en": "HAMMAM BOU HADJAR",
            "baladyiats": [
              {
                "code": 4604,
                "name": "HAMMAM BOU HADJAR",
                "name_en": "HAMMAM BOU HADJAR",
                "name_ar": "حمام بوحجر"
              },
              {
                "code": 4606,
                "name": "OUED BERKECHE",
                "name_en": "OUED BERKECHE",
                "name_ar": "وادي برقش"
              },
              {
                "code": 4611,
                "name": "CHENTOUF",
                "name_en": "CHENTOUF",
                "name_ar": "شنتوف"
              },
              {
                "code": 4621,
                "name": "HASSASNA",
                "name_en": "HASSASNA",
                "name_ar": "الحساسنة"
              }
            ]
          },
          {
            "code": 4609,
            "name": "AIN LARBAA",
            "name_ar": "عين الأربعاء",
            "name_en": "AIN LARBAA",
            "baladyiats": [
              {
                "code": 4609,
                "name": "AIN EL ARBAA",
                "name_en": "AIN EL ARBAA",
                "name_ar": "عين الأربعاء"
              },
              {
                "code": 4610,
                "name": "TAMZOURA",
                "name_en": "TAMZOURA",
                "name_ar": "تامزورة"
              },
              {
                "code": 4615,
                "name": "SIDI BOUMEDIENE",
                "name_en": "SIDI BOUMEDIENE",
                "name_ar": "سيدي بومدين"
              },
              {
                "code": 4616,
                "name": "OUED SEBBAH",
                "name_en": "OUED SEBBAH",
                "name_ar": "وادي الصباح"
              }
            ]
          },
          {
            "code": 4614,
            "name": "EL MALEH",
            "name_ar": "المالح",
            "name_en": "EL MALEH",
            "baladyiats": [
              {
                "code": 4602,
                "name": "CHAABAT EL HAM",
                "name_en": "CHAABAT EL HAM",
                "name_ar": "شعبة اللحم"
              },
              {
                "code": 4603,
                "name": "OULED KIHAL",
                "name_en": "OULED KIHAL",
                "name_ar": "أولاد الكيحل"
              },
              {
                "code": 4608,
                "name": "TERGA",
                "name_en": "TERGA",
                "name_ar": "تارقة"
              },
              {
                "code": 4614,
                "name": "EL MALEH",
                "name_en": "EL MALEH",
                "name_ar": "المالح"
              }
            ]
          },
          {
            "code": 4619,
            "name": "EL AMRIA",
            "name_ar": "العامرية",
            "name_en": "EL AMRIA",
            "baladyiats": [
              {
                "code": 4605,
                "name": "BOUZEDJAR",
                "name_en": "BOUZEDJAR",
                "name_ar": "بوزجار"
              },
              {
                "code": 4617,
                "name": "OULED BOUDJEMAA",
                "name_en": "OULED BOUDJEMAA",
                "name_ar": "أولاد بوجمعة"
              },
              {
                "code": 4619,
                "name": "EL AMRIA",
                "name_en": "EL AMRIA",
                "name_ar": "العامرية"
              },
              {
                "code": 4620,
                "name": "HASSI EL GHELLA",
                "name_en": "HASSI EL GHELLA",
                "name_ar": "حاسي الغلة"
              },
              {
                "code": 4628,
                "name": "EL MESSAID",
                "name_en": "EL MESSAID",
                "name_ar": "المساعيد"
              }
            ]
          },
          {
            "code": 4622,
            "name": "AIN KIHEL",
            "name_ar": "عين الكيحل",
            "name_en": "AIN KIHEL",
            "baladyiats": [
              {
                "code": 4607,
                "name": "AGHLAL",
                "name_en": "AGHLAL",
                "name_ar": "أغلال"
              },
              {
                "code": 4613,
                "name": "AOUBELLIL",
                "name_en": "AOUBELLIL",
                "name_ar": "عقب الليل"
              },
              {
                "code": 4618,
                "name": "AIN TOLBA",
                "name_en": "AIN TOLBA",
                "name_ar": "عين الطلبة"
              },
              {
                "code": 4622,
                "name": "AIN KIHAL",
                "name_en": "AIN KIHAL",
                "name_ar": "عين الكيحل"
              }
            ]
          },
          {
            "code": 4623,
            "name": "BENI SAF",
            "name_ar": "بني صاف",
            "name_en": "BENI SAF",
            "baladyiats": [
              {
                "code": 4623,
                "name": "BENI SAF",
                "name_en": "BENI SAF",
                "name_ar": "بني صاف"
              },
              {
                "code": 4624,
                "name": "SIDI SAFI",
                "name_en": "SIDI SAFI",
                "name_ar": "سيدي صافي"
              },
              {
                "code": 4627,
                "name": "EMIR ABDELKADER",
                "name_en": "EMIR ABDELKADER",
                "name_ar": "الأمير عبد القادر"
              }
            ]
          },
          {
            "code": 4625,
            "name": "OULHASSA GHERABA",
            "name_ar": "ولهاصة الغرابة",
            "name_en": "OULHASSA GHERABA",
            "baladyiats": [
              {
                "code": 4625,
                "name": "OULHACA EL GHERABA",
                "name_en": "OULHACA EL GHERABA",
                "name_ar": "ولهاصة الغرابة"
              },
              {
                "code": 4626,
                "name": "SIDI OURIACHE",
                "name_en": "SIDI OURIACHE",
                "name_ar": "سيدي ورياش"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          13,
          22,
          31
        ]
      },
      {
        "mattricule": 47,
        "name_ar": "غرداية",
        "name_ber": "ⵜⴰⵖⴻⵔⴷⴰⵢⵜ",
        "name_en": "Ghardaïa",
        "name": "Ghardaïa",
        "phoneCodes": [
          29
        ],
        "postalCodes": [
          47000,
          47001,
          47002,
          47003,
          47004,
          47005,
          47006,
          47007,
          47008,
          47009,
          47010,
          47011,
          47012,
          47013,
          47014,
          47015,
          47016,
          47017,
          47018,
          47019,
          47020,
          47021,
          47022,
          47023,
          47024,
          47025,
          47026,
          47027,
          47028,
          47029,
          47030,
          47031,
          47032,
          47033,
          47034,
          47035,
          47036,
          47037,
          47038,
          47039,
          47040,
          47041
        ],
        "dairats": [
          {
            "code": 4701,
            "name": "GHARDAIA",
            "name_ar": "غرداية",
            "name_en": "GHARDAIA",
            "baladyiats": [
              {
                "code": 4701,
                "name": "GHARDAIA",
                "name_en": "GHARDAIA",
                "name_ar": "غرداية"
              }
            ]
          },
          {
            "code": 4702,
            "name": "EL MENIA",
            "name_ar": "المنيعة",
            "name_en": "EL MENIA",
            "baladyiats": [
              {
                "code": 4702,
                "name": "EL MENIAA",
                "name_en": "EL MENIAA",
                "name_ar": "المنيعة"
              },
              {
                "code": 4712,
                "name": "HASSI GARA",
                "name_en": "HASSI GARA",
                "name_ar": "حاسي القارة"
              }
            ]
          },
          {
            "code": 4702,
            "name": "EL MENIA (wilya déléguée)",
            "name_ar": "المنيعة (ولاية منتدبة)",
            "name_en": "EL MENIA (wilya déléguée)",
            "baladyiats": [
              {
                "code": 4702,
                "name": "EL MENIAA",
                "name_en": "EL MENIAA",
                "name_ar": "المنيعة"
              },
              {
                "code": 4712,
                "name": "HASSI GARA",
                "name_en": "HASSI GARA",
                "name_ar": "حاسي القارة"
              }
            ]
          },
          {
            "code": 4703,
            "name": "DHAYET BEN DHAHOUA",
            "name_ar": "ضاية بن ضحوة",
            "name_en": "DHAYET BEN DHAHOUA",
            "baladyiats": [
              {
                "code": 4703,
                "name": "DHAYET BENDHAHOUA",
                "name_en": "DHAYET BENDHAHOUA",
                "name_ar": "ضاية بن ضحوة"
              }
            ]
          },
          {
            "code": 4704,
            "name": "BERRIANE",
            "name_ar": "بريان",
            "name_en": "BERRIANE",
            "baladyiats": [
              {
                "code": 4704,
                "name": "BERRIANE",
                "name_en": "BERRIANE",
                "name_ar": "بريان"
              }
            ]
          },
          {
            "code": 4705,
            "name": "METLILI",
            "name_ar": "متليلي",
            "name_en": "METLILI",
            "baladyiats": [
              {
                "code": 4705,
                "name": "METLILI",
                "name_en": "METLILI",
                "name_ar": "متليلي"
              },
              {
                "code": 4709,
                "name": "SEBSEB",
                "name_en": "SEBSEB",
                "name_ar": "سبسب"
              }
            ]
          },
          {
            "code": 4706,
            "name": "EL GUERRARA",
            "name_ar": "القرارة",
            "name_en": "EL GUERRARA",
            "baladyiats": [
              {
                "code": 4706,
                "name": "EL GUERRARA",
                "name_en": "EL GUERRARA",
                "name_ar": "القرارة"
              }
            ]
          },
          {
            "code": 4708,
            "name": "ZELFANA",
            "name_ar": "زلفانة",
            "name_en": "ZELFANA",
            "baladyiats": [
              {
                "code": 4708,
                "name": "ZELFANA",
                "name_en": "ZELFANA",
                "name_ar": "زلفانة"
              }
            ]
          },
          {
            "code": 4710,
            "name": "BOUNOURA",
            "name_ar": "بونورة",
            "name_en": "BOUNOURA",
            "baladyiats": [
              {
                "code": 4707,
                "name": "EL ATTEUF",
                "name_en": "EL ATTEUF",
                "name_ar": "العطف"
              },
              {
                "code": 4710,
                "name": "BOUNOURA",
                "name_en": "BOUNOURA",
                "name_ar": "بونورة"
              }
            ]
          },
          {
            "code": 4713,
            "name": "MANSOURAH",
            "name_ar": "المنصورة",
            "name_en": "MANSOURAH",
            "baladyiats": [
              {
                "code": 4711,
                "name": "HASSI FEHAL",
                "name_en": "HASSI FEHAL",
                "name_ar": "حاسي الفحل"
              },
              {
                "code": 4713,
                "name": "MANSOURA",
                "name_en": "MANSOURA",
                "name_ar": "المنصورة"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          1,
          32,
          3,
          17,
          30,
          11
        ]
      },
      {
        "mattricule": 48,
        "name_ar": "غليزان",
        "name_ber": "ⵉⵖⵉⵍ ⵉⵣⴰⵏ",
        "name_en": "Relizane",
        "name": "Relizane",
        "phoneCodes": [
          46
        ],
        "postalCodes": [
          48000,
          48001,
          48002,
          48003,
          48004,
          48005,
          48006,
          48007,
          48008,
          48009,
          48010,
          48011,
          48012,
          48013,
          48014,
          48015,
          48016,
          48017,
          48018,
          48019,
          48020,
          48021,
          48022,
          48023,
          48024,
          48025,
          48026,
          48027,
          48028,
          48029,
          48030,
          48031,
          48032,
          48033,
          48034,
          48035,
          48036,
          48037,
          48038,
          48039,
          48040,
          48041,
          48042,
          48043,
          48044,
          48045,
          48046,
          48047,
          48048,
          48049,
          48050,
          48051,
          48052,
          48053,
          48054,
          48055,
          48056,
          48057,
          48058,
          48059,
          48060,
          48061,
          48062,
          48063,
          48064,
          48065,
          48066,
          48067,
          48068,
          48070,
          48071,
          48072,
          48073,
          48074,
          48075,
          48076,
          48077,
          48078,
          48079,
          48080
        ],
        "dairats": [
          {
            "code": 4801,
            "name": "RELIZANE",
            "name_ar": "غليزان",
            "name_en": "RELIZANE",
            "baladyiats": [
              {
                "code": 4801,
                "name": "RELIZANE",
                "name_en": "RELIZANE",
                "name_ar": "غليزان"
              },
              {
                "code": 4835,
                "name": "BENDAOUD",
                "name_en": "BENDAOUD",
                "name_ar": "بن داود"
              }
            ]
          },
          {
            "code": 4802,
            "name": "OUED RHIOU",
            "name_ar": "وادي رهيو",
            "name_en": "OUED RHIOU",
            "baladyiats": [
              {
                "code": 4802,
                "name": "OUED-RHIOU",
                "name_en": "OUED-RHIOU",
                "name_ar": "وادي رهيو"
              },
              {
                "code": 4821,
                "name": "OUARIZANE",
                "name_en": "OUARIZANE",
                "name_ar": "واريزان"
              },
              {
                "code": 4829,
                "name": "LAHLEF",
                "name_en": "LAHLEF",
                "name_ar": "لحلاف"
              },
              {
                "code": 4837,
                "name": "MERDJA SIDI ABED",
                "name_en": "MERDJA SIDI ABED",
                "name_ar": "مرجة سيدي عابد"
              }
            ]
          },
          {
            "code": 4807,
            "name": "EL H'MADNA",
            "name_ar": "الحمادنة",
            "name_en": "EL H'MADNA",
            "baladyiats": [
              {
                "code": 4807,
                "name": "EL H'MADNA",
                "name_en": "EL H'MADNA",
                "name_ar": "الحمادنة"
              },
              {
                "code": 4826,
                "name": "OUED EL DJEMAA",
                "name_en": "OUED EL DJEMAA",
                "name_ar": "وادي الجمعة"
              }
            ]
          },
          {
            "code": 4808,
            "name": "SIDI M'HAMED BEN ALI",
            "name_ar": "سيدي أمحمد بن علي",
            "name_en": "SIDI M'HAMED BEN ALI",
            "baladyiats": [
              {
                "code": 4808,
                "name": "SIDI M'HAMED BENALI",
                "name_en": "SIDI M'HAMED BENALI",
                "name_ar": "سيدي أمحمد بن علي"
              },
              {
                "code": 4809,
                "name": "MEDIOUNA",
                "name_en": "MEDIOUNA",
                "name_ar": "مديونة"
              },
              {
                "code": 4830,
                "name": "BENI ZENTIS",
                "name_en": "BENI ZENTIS",
                "name_ar": "بني زنطيس"
              }
            ]
          },
          {
            "code": 4811,
            "name": "AMMI MOUSSA",
            "name_ar": "عمي موسى",
            "name_en": "AMMI MOUSSA",
            "baladyiats": [
              {
                "code": 4805,
                "name": "OULED AICHE",
                "name_en": "OULED AICHE",
                "name_ar": "أولاد يعيش"
              },
              {
                "code": 4811,
                "name": "AMMI MOUSSA",
                "name_en": "AMMI MOUSSA",
                "name_ar": "عمي موسى"
              },
              {
                "code": 4833,
                "name": "EL HASSI",
                "name_en": "EL HASSI",
                "name_ar": "الحاسي"
              },
              {
                "code": 4836,
                "name": "EL OULDJA",
                "name_en": "EL OULDJA",
                "name_ar": "الولجة"
              }
            ]
          },
          {
            "code": 4812,
            "name": "ZEMMOURA",
            "name_ar": "زمورة",
            "name_en": "ZEMMOURA",
            "baladyiats": [
              {
                "code": 4812,
                "name": "ZEMMOURA",
                "name_en": "ZEMMOURA",
                "name_ar": "زمورة"
              },
              {
                "code": 4813,
                "name": "BENI DERGOUN",
                "name_en": "BENI DERGOUN",
                "name_ar": "بني درقن"
              },
              {
                "code": 4832,
                "name": "DAR BEN ABDELAH",
                "name_en": "DAR BEN ABDELAH",
                "name_ar": "دار بن عبد الله"
              }
            ]
          },
          {
            "code": 4814,
            "name": "DJIDIOUIA",
            "name_ar": "جديوية",
            "name_en": "DJIDIOUIA",
            "baladyiats": [
              {
                "code": 4814,
                "name": "DJIDIOUIA",
                "name_en": "DJIDIOUIA",
                "name_ar": "جديوية"
              },
              {
                "code": 4816,
                "name": "HAMRI",
                "name_en": "HAMRI",
                "name_ar": "حمري"
              },
              {
                "code": 4838,
                "name": "OULED SIDI MIHOUB",
                "name_en": "OULED SIDI MIHOUB",
                "name_ar": "أولاد سيدي الميهوب"
              }
            ]
          },
          {
            "code": 4817,
            "name": "EL MATMAR",
            "name_ar": "المطمر",
            "name_en": "EL MATMAR",
            "baladyiats": [
              {
                "code": 4803,
                "name": "BELAASSEL BOUZAGZA",
                "name_en": "BELAASSEL BOUZAGZA",
                "name_ar": "بلعسل بوزقزة"
              },
              {
                "code": 4810,
                "name": "SIDI KHETTAB",
                "name_en": "SIDI KHETTAB",
                "name_ar": "سيدي  خطاب"
              },
              {
                "code": 4817,
                "name": "EL-MATMAR",
                "name_en": "EL-MATMAR",
                "name_ar": "المطمر"
              },
              {
                "code": 4818,
                "name": "SIDI M'HAMED BENAOUDA",
                "name_en": "SIDI M'HAMED BENAOUDA",
                "name_ar": "سيدي امحمد بن عودة"
              }
            ]
          },
          {
            "code": 4819,
            "name": "AIN TAREK",
            "name_ar": "عين طارق",
            "name_en": "AIN TAREK",
            "baladyiats": [
              {
                "code": 4819,
                "name": "AIN-TAREK",
                "name_en": "AIN-TAREK",
                "name_ar": "عين طارق"
              },
              {
                "code": 4834,
                "name": "HAD ECHKALLA",
                "name_en": "HAD ECHKALLA",
                "name_ar": "حد الشكالة"
              }
            ]
          },
          {
            "code": 4822,
            "name": "MAZOUNA",
            "name_ar": "مازونة",
            "name_en": "MAZOUNA",
            "baladyiats": [
              {
                "code": 4815,
                "name": "EL-GUETTAR",
                "name_en": "EL-GUETTAR",
                "name_ar": "القطار"
              },
              {
                "code": 4822,
                "name": "MAZOUNA",
                "name_en": "MAZOUNA",
                "name_ar": "مازونة"
              }
            ]
          },
          {
            "code": 4825,
            "name": "YELLEL",
            "name_ar": "يلل",
            "name_en": "YELLEL",
            "baladyiats": [
              {
                "code": 4804,
                "name": "SIDI SAADA",
                "name_en": "SIDI SAADA",
                "name_ar": "سيدي سعادة"
              },
              {
                "code": 4823,
                "name": "KALAA",
                "name_en": "KALAA",
                "name_ar": "القلعة"
              },
              {
                "code": 4824,
                "name": "AIN RAHMA",
                "name_en": "AIN RAHMA",
                "name_ar": "عين الرحمة"
              },
              {
                "code": 4825,
                "name": "YELLEL",
                "name_en": "YELLEL",
                "name_ar": "يلل"
              }
            ]
          },
          {
            "code": 4827,
            "name": "RAMKA",
            "name_ar": "الرمكة",
            "name_en": "RAMKA",
            "baladyiats": [
              {
                "code": 4827,
                "name": "RAMKA",
                "name_en": "RAMKA",
                "name_ar": "الرمكة"
              },
              {
                "code": 4831,
                "name": "SOUK EL HAD",
                "name_en": "SOUK EL HAD",
                "name_ar": "سوق الحد"
              }
            ]
          },
          {
            "code": 4828,
            "name": "MENDES",
            "name_ar": "منداس",
            "name_en": "MENDES",
            "baladyiats": [
              {
                "code": 4806,
                "name": "SIDI LAZREG",
                "name_en": "SIDI LAZREG",
                "name_ar": "سيدي لزرق"
              },
              {
                "code": 4820,
                "name": "OUED ESSALEM",
                "name_en": "OUED ESSALEM",
                "name_ar": "وادي السلام"
              },
              {
                "code": 4828,
                "name": "MENDES",
                "name_en": "MENDES",
                "name_ar": "منداس"
              }
            ]
          }
        ],
        "adjacentWilayas": [
          29,
          27,
          2,
          38,
          14
        ]
      }
    ]
""".trimIndent()
val gson = Gson()
val Wilaya_CommunesDBList = gson.fromJson(jsonString , Wilaya_CommunesDB::class.java)
