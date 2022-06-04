package com.enzhongwen.hanyu2

import com.enzhongwen.hanyu2.database.Saved

var currentList = mutableListOf<Saved>()

val vocab_lesson1: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "西瓜",
        pinyin = "xīguā",
        definition = R.string.d148,
        id1 = 148,
        stroke1 = R.drawable.xi3,
        stroke2 = R.drawable.gua,
        sound = R.raw.xi1gua1
    ),
    Saved(
        word = "大",
        pinyin = "dà",
        definition = R.string.d149,
        id1 = 149,
        stroke1 = R.drawable.da3,
        sound = R.raw.da4
    ),
    Saved(
        word = "苹果",
        pinyin = "píngguǒ",
        definition = R.string.d150,
        id1 = 150,
        stroke1 = R.drawable.ping2,
        stroke2 = R.drawable.guo,
        sound = R.raw.ping2guo3
    ),
    Saved(
        word = "小",
        pinyin = "xiǎo",
        definition = R.string.d151,
        id1 = 151,
        stroke1 = R.drawable.xiao2,
        sound = R.raw.xiao3
    ),
    Saved(
        word = "多",
        pinyin = "duō",
        definition = R.string.d152,
        id1 = 152,
        stroke1 = R.drawable.duo2,
        sound = R.raw.duo1
    ),
    Saved(
        word = "少",
        pinyin = "shǎo",
        definition = R.string.d153,
        id1 = 153,
        stroke1 = R.drawable.shao,
        sound = R.raw.shao3
    ),
    Saved(
        word = "男",
        pinyin = "nán",
        definition = R.string.d154,
        id1 = 154,
        stroke1 = R.drawable.nan,
        sound = R.raw.nan2
    ),
    Saved(
        word = "女",
        pinyin = "nǚ",
        definition = R.string.d155,
        id1 = 155,
        stroke1 = R.drawable.nv,
        sound = R.raw.nv3
    ),
    Saved(
        word = "头发",
        pinyin = "tóufa",
        definition = R.string.d156,
        id1 = 156,
        stroke1 = R.drawable.tou,
        stroke2 = R.drawable.fa,
        sound = R.raw.tou2fa5
    ),
    Saved(
        word = "长",
        pinyin = "cháng",
        definition = R.string.d157,
        id1 = 157,
        stroke1 = R.drawable.chang2,
        sound = R.raw.chang2
    ),
    Saved(
        word = "短",
        pinyin = "duǎn",
        definition = R.string.d158,
        id1 = 158,
        stroke1 = R.drawable.duan,
        sound = R.raw.duan3
    ),
    Saved(
        word = "水果",
        pinyin = "shuǐguǒ",
        definition = R.string.d159,
        id1 = 159,
        stroke1 = R.drawable.shui,
        stroke2 = R.drawable.guo,
        sound = R.raw.shui3guo3
    ),
    Saved(
        word = "梨",
        pinyin = "lí",
        definition = R.string.d160,
        id1 = 160,
        stroke1 = R.drawable.li3,
        sound = R.raw.li2
    )

)

val vocab_lesson2: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "今天",
        pinyin = "jīntiān",
        definition = R.string.d161,
        id1 = 161,
        stroke1 = R.drawable.jin2,
        stroke2 = R.drawable.tian,
        sound = R.raw.jin1tian1
    ),
    Saved(
        word = "天气",
        pinyin = "tiānqì",
        definition = R.string.d162,
        id1 = 162,
        stroke1 = R.drawable.tian,
        stroke2 = R.drawable.qi,
        sound = R.raw.tian1qi4
    ),
    Saved(
        word = "很",
        pinyin = "hěn",
        definition = R.string.d163,
        id1 = 163,
        stroke1 = R.drawable.hen,
        sound = R.raw.hen3
    ),
    Saved(
        word = "花",
        pinyin = "huā",
        definition = R.string.d164,
        id1 = 164,
        stroke1 = R.drawable.hua4,
        sound = R.raw.hua1
    ),
    Saved(
        word = "漂亮",
        pinyin = "piàoliang",
        definition = R.string.d165,
        id1 = 165,
        stroke1 = R.drawable.piao,
        stroke2 = R.drawable.liang2,
        sound = R.raw.piao4liang5
    ),
    Saved(
        word = "风",
        pinyin = "fēng",
        definition = R.string.d166,
        id1 = 166,
        stroke1 = R.drawable.feng,
        sound = R.raw.feng1
    ),
    Saved(
        word = "高兴",
        pinyin = "gāoxìng",
        definition = R.string.d167,
        id1 = 167,
        stroke1 = R.drawable.gao,
        stroke2 = R.drawable.xing3,
        sound = R.raw.gao1xing4
    ),
    Saved(
        word = "脚",
        pinyin = "jiǎo",
        definition = R.string.d168,
        id1 = 168,
        stroke1 = R.drawable.jiao4,
        sound = R.raw.jiao3
    ),
    Saved(
        word = "新",
        pinyin = "xīn",
        definition = R.string.d169,
        id1 = 169,
        stroke1 = R.drawable.xin,
        sound = R.raw.xin1
    ),
    Saved(
        word = "旧",
        pinyin = "jiù",
        definition = R.string.d170,
        id1 = 170,
        stroke1 = R.drawable.jiu2,
        sound = R.raw.jiu4
    ),
    Saved(
        word = "蓝",
        pinyin = "lán",
        definition = R.string.d171,
        id1 = 171,
        stroke1 = R.drawable.lan2,
        sound = R.raw.lan2
    ),
    Saved(
        word = "云",
        pinyin = "yún",
        definition = R.string.d172,
        id1 = 172,
        stroke1 = R.drawable.yun,
        sound = R.raw.yun2
    ),
    Saved(
        word = "白",
        pinyin = "bái",
        definition = R.string.d173,
        id1 = 173,
        stroke1 = R.drawable.bai2,
        sound = R.raw.bai2
    )
)

val vocab_lesson3: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "真",
        pinyin = "zhēn",
        definition = R.string.d174,
        id1 = 174,
        stroke1 = R.drawable.zhen,
        sound = R.raw.zhen1
    ),
    Saved(
        word = "高",
        pinyin = "gāo",
        definition = R.string.d175,
        id1 = 175,
        stroke1 = R.drawable.gao,
        sound = R.raw.gao1
    ),
    Saved(
        word = "啊",
        pinyin = "a",
        definition = R.string.d176,
        id1 = 176,
        stroke1 = R.drawable.a2,
        sound = R.raw.a5
    ),
    Saved(
        word = "座",
        pinyin = "zuò",
        definition = R.string.d177,
        id1 = 177,
        stroke1 = R.drawable.zuo4,
        sound = R.raw.zuo4
    ),
    Saved(
        word = "山",
        pinyin = "shān",
        definition = R.string.d178,
        id1 = 178,
        stroke1 = R.drawable.shan,
        sound = R.raw.shan1
    ),
    Saved(
        word = "好看",
        pinyin = "hǎokàn",
        definition = R.string.d179,
        id1 = 179,
        stroke1 = R.drawable.hao,
        stroke2 = R.drawable.kan,
        sound = R.raw.hao3kan4
    ),
    Saved(
        word = "好吃",
        pinyin = "hǎochī",
        definition = R.string.d180,
        id1 = 180,
        stroke1 = R.drawable.hao,
        stroke2 = R.drawable.chi,
        sound = R.raw.hao3chi1
    ),
    Saved(
        word = "好玩",
        pinyin = "hǎowánr",
        definition = R.string.d181,
        id1 = 181,
        stroke1 = R.drawable.hao,
        stroke2 = R.drawable.wan2,
        sound = R.raw.hao3wan2
    ),
    Saved(
        word = "首",
        pinyin = "shǒu",
        definition = R.string.d182,
        id1 = 182,
        stroke1 = R.drawable.shou2,
        sound = R.raw.shou3
    ),
    Saved(
        word = "歌",
        pinyin = "gē",
        definition = R.string.d183,
        id1 = 183,
        stroke1 = R.drawable.ge3,
        sound = R.raw.ge1
    ),
    Saved(
        word = "好听",
        pinyin = "hǎotīng",
        definition = R.string.d184,
        id1 = 184,
        stroke1 = R.drawable.hao,
        stroke2 = R.drawable.ting,
        sound = R.raw.hao3ting1
    ),
    Saved(
        word = "爬",
        pinyin = "pá",
        definition = R.string.d185,
        id1 = 185,
        stroke1 = R.drawable.pa,
        sound = R.raw.pa2
    ),
    Saved(
        word = "空气",
        pinyin = "kōngqì",
        definition = R.string.d186,
        id1 = 186,
        stroke1 = R.drawable.kong,
        stroke2 = R.drawable.qi,
        sound = R.raw.kong1qi4
    ),
    Saved(
        word = "树",
        pinyin = "shù",
        definition = R.string.d187,
        id1 = 187,
        stroke1 = R.drawable.shu3,
        sound = R.raw.shu4
    )
)

val vocab_lesson4: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "狗",
        pinyin = "gǒu",
        definition = R.string.d188,
        id1 = 188,
        stroke1 = R.drawable.gou,
        sound = R.raw.gou3
    ),
    Saved(
        word = "非常",
        pinyin = "fēicháng",
        definition = R.string.d189,
        id1 = 189,
        stroke1 = R.drawable.fei,
        stroke2 = R.drawable.chang3,
        sound = R.raw.fei1chang2
    ),
    Saved(
        word = "可爱",
        pinyin = "kě ài",
        definition = R.string.d190,
        id1 = 190,
        stroke1 = R.drawable.ke3,
        stroke2 = R.drawable.ai,
        sound = R.raw.ke3ai4
    ),
    Saved(
        word = "人",
        pinyin = "rén",
        definition = R.string.d191,
        id1 = 191,
        stroke1 = R.drawable.ren,
        sound = R.raw.ren2
    ),
    Saved(
        word = "忙",
        pinyin = "máng",
        definition = R.string.d192,
        id1 = 192,
        stroke1 = R.drawable.mang,
        sound = R.raw.mang2
    ),
    Saved(
        word = "累",
        pinyin = "lèi",
        definition = R.string.d193,
        id1 = 193,
        stroke1 = R.drawable.lei,
        sound = R.raw.lei4
    ),
    Saved(
        word = "聪明",
        pinyin = "cōngmíng",
        definition = R.string.d194,
        id1 = 194,
        stroke1 = R.drawable.cong,
        stroke2 = R.drawable.ming2,
        sound = R.raw.cong1ming5
    ),
    Saved(
        word = "只",
        pinyin = "zhī",
        definition = R.string.d195,
        id1 = 195,
        stroke1 = R.drawable.zhi2,
        sound = R.raw.zhi1
    ),
    Saved(
        word = "猫",
        pinyin = "māo",
        definition = R.string.d196,
        id1 = 196,
        stroke1 = R.drawable.mao2,
        sound = R.raw.mao1
    ),
    Saved(
        word = "鸟",
        pinyin = "niǎo",
        definition = R.string.d197,
        id1 = 197,
        stroke1 = R.drawable.niao,
        sound = R.raw.niao3
    ),
    Saved(
        word = "喜欢",
        pinyin = "xǐhuan",
        definition = R.string.d198,
        id1 = 198,
        stroke1 = R.drawable.xi4,
        stroke2 = R.drawable.huan,
        sound = R.raw.xi3huan5
    ),
    Saved(
        word = "它",
        pinyin = "tā",
        definition = R.string.d199,
        id1 = 199,
        stroke1 = R.drawable.ta3,
        sound = R.raw.ta1
    )
)

val vocab_lesson5: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "热闹",
        pinyin = "rènao",
        definition = R.string.d200,
        id1 = 200,
        stroke1 = R.drawable.re,
        stroke2 = R.drawable.nao2,
        sound = R.raw.re4nao5
    ),
    Saved(
        word = "草",
        pinyin = "cǎo",
        definition = R.string.d201,
        id1 = 201,
        stroke1 = R.drawable.cao2,
        sound = R.raw.cao3
    ),
    Saved(
        word = "绿",
        pinyin = "lǜ",
        definition = R.string.d202,
        id1 = 202,
        stroke1 = R.drawable.lv,
        sound = R.raw.lv4
    ),
    Saved(
        word = "朋友",
        pinyin = "péngyou",
        definition = R.string.d203,
        id1 = 203,
        stroke1 = R.drawable.peng,
        stroke2 = R.drawable.you5,
        sound = R.raw.peng2you5
    ),
    Saved(
        word = "湖",
        pinyin = "hú",
        definition = R.string.d204,
        id1 = 204,
        stroke1 = R.drawable.hu,
        sound = R.raw.hu2
    ),
    Saved(
        word = "色",
        pinyin = "sè",
        definition = R.string.d205,
        id1 = 205,
        stroke1 = R.drawable.se,
        sound = R.raw.se4
    ),
    Saved(
        word = "桥",
        pinyin = "qiáo",
        definition = R.string.d206,
        id1 = 206,
        stroke1 = R.drawable.qiao,
        sound = R.raw.qiao2
    )
)

val vocab_lesson6: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "双",
        pinyin = "shuāng",
        definition = R.string.d207,
        id1 = 207,
        stroke1 = R.drawable.shuang,
        sound = R.raw.shuang1
    ),
    Saved(
        word = "筷子",
        pinyin = "kuàizi",
        definition = R.string.d208,
        id1 = 208,
        stroke1 = R.drawable.kuai,
        stroke2 = R.drawable.zi2,
        sound = R.raw.kuai4zi5
    ),
    Saved(
        word = "杯子",
        pinyin = "bēizi",
        definition = R.string.d209,
        id1 = 209,
        stroke1 = R.drawable.bei,
        stroke2 = R.drawable.zi2,
        sound = R.raw.bei1zi5
    ),
    Saved(
        word = "牙刷",
        pinyin = "yáshuā",
        definition = R.string.d210,
        id1 = 210,
        stroke1 = R.drawable.ya,
        stroke2 = R.drawable.shua,
        sound = R.raw.ya2shua1
    ),
    Saved(
        word = "哪",
        pinyin = "nǎ",
        definition = R.string.d211,
        id1 = 211,
        stroke1 = R.drawable.na2,
        sound = R.raw.na3
    ),
    Saved(
        word = "碗",
        pinyin = "wǎn",
        definition = R.string.d212,
        id1 = 212,
        stroke1 = R.drawable.wan4,
        sound = R.raw.wan3
    ),
    Saved(
        word = "盘子",
        pinyin = "pánzi",
        definition = R.string.d213,
        id1 = 213,
        stroke1 = R.drawable.pan,
        stroke2 = R.drawable.zi2,
        sound = R.raw.pan2zi5
    ),
    Saved(
        word = "啦",
        pinyin = "la",
        definition = R.string.d214,
        id1 = 214,
        stroke1 = R.drawable.la,
        sound = R.raw.la5
    ),
    Saved(
        word = "用",
        pinyin = "yòng",
        definition = R.string.d215,
        id1 = 215,
        stroke1 = R.drawable.yong,
        sound = R.raw.yong4
    ),
    Saved(
        word = "勺子",
        pinyin = "sháozi",
        definition = R.string.d216,
        id1 = 216,
        stroke1 = R.drawable.shao2,
        stroke2 = R.drawable.zi2,
        sound = R.raw.shao2zi5
    )
)

val vocab_lesson7: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "衣服",
        pinyin = "yīfu",
        definition = R.string.d217,
        id1 = 217,
        stroke1 = R.drawable.yi3,
        stroke2 = R.drawable.fu,
        sound = R.raw.yi1fu5
    ),
    Saved(
        word = "红",
        pinyin = "hóng",
        definition = R.string.d218,
        id1 = 218,
        stroke1 = R.drawable.hong,
        sound = R.raw.hong2
    ),
    Saved(
        word = "皮鞋",
        pinyin = "píxié",
        definition = R.string.d219,
        id1 = 219,
        stroke1 = R.drawable.pi,
        stroke2 = R.drawable.xie2,
        sound = R.raw.pi2xie2
    ),
    Saved(
        word = "黑",
        pinyin = "hēi",
        definition = R.string.d220,
        id1 = 220,
        stroke1 = R.drawable.hei,
        sound = R.raw.hei1
    ),
    Saved(
        word = "裤子",
        pinyin = "kùzi",
        definition = R.string.d221,
        id1 = 221,
        stroke1 = R.drawable.ku,
        stroke2 = R.drawable.zi2,
        sound = R.raw.ku4zi5
    ),
    Saved(
        word = "条",
        pinyin = "tiáo",
        definition = R.string.d222,
        id1 = 222,
        stroke1 = R.drawable.tiao2,
        sound = R.raw.tiao2
    ),
    Saved(
        word = "裙子",
        pinyin = "qúnzi",
        definition = R.string.d223,
        id1 = 223,
        stroke1 = R.drawable.qun,
        stroke2 = R.drawable.zi2,
        sound = R.raw.qun2zi5
    ),
    Saved(
        word = "黄",
        pinyin = "huáng",
        definition = R.string.d224,
        id1 = 224,
        stroke1 = R.drawable.huang,
        sound = R.raw.huang2
    ),
    Saved(
        word = "颜色",
        pinyin = "yánsè",
        definition = R.string.d225,
        id1 = 225,
        stroke1 = R.drawable.yan2,
        stroke2 = R.drawable.se,
        sound = R.raw.yan2se4
    ),
    Saved(
        word = "帽子",
        pinyin = "màozi",
        definition = R.string.d226,
        id1 = 226,
        stroke1 = R.drawable.mao3,
        stroke2 = R.drawable.zi2,
        sound = R.raw.mao4zi5
    ),
    Saved(
        word = "件",
        pinyin = "jiàn",
        definition = R.string.d227,
        id1 = 227,
        stroke1 = R.drawable.jian3,
        sound = R.raw.jian4
    ),
    Saved(
        word = "说",
        pinyin = "shuō",
        definition = R.string.d228,
        id1 = 228,
        stroke1 = R.drawable.shuo,
        sound = R.raw.shuo1
    )
)

val vocab_lesson8: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "里",
        pinyin = "li",
        definition = R.string.d229,
        id1 = 229,
        stroke1 = R.drawable.li4,
        sound = R.raw.li2
    ),
    Saved(
        word = "块",
        pinyin = "kuài",
        definition = R.string.d230,
        id1 = 230,
        stroke1 = R.drawable.kuai2,
        sound = R.raw.kuai4
    ),
    Saved(
        word = "黑板",
        pinyin = "hēibǎn",
        definition = R.string.d231,
        id1 = 231,
        stroke1 = R.drawable.hei,
        stroke2 = R.drawable.ban,
        sound = R.raw.hei1ban3
    ),
    Saved(
        word = "办公室",
        pinyin = "bàngōngshì",
        definition = R.string.d232,
        id1 = 232,
        stroke1 = R.drawable.ban2,
        stroke2 = R.drawable.gong,
        stroke3 = R.drawable.shi4,
        sound = R.raw.ban4gong1shi4
    ),
    Saved(
        word = "部",
        pinyin = "bù",
        definition = R.string.d233,
        id1 = 233,
        stroke1 = R.drawable.bu2,
        sound = R.raw.bu4
    ),
    Saved(
        word = "电话",
        pinyin = "diànhuà",
        definition = R.string.d234,
        id1 = 234,
        stroke1 = R.drawable.dian2,
        stroke2 = R.drawable.hua2,
        sound = R.raw.dian4hua4
    ),
    Saved(
        word = "冰箱",
        pinyin = "bīngxiāng",
        definition = R.string.d235,
        id1 = 235,
        stroke1 = R.drawable.bing,
        stroke2 = R.drawable.xiang,
        sound = R.raw.bing1xiang1
    ),
    Saved(
        word = "饮料",
        pinyin = "yǐnliào",
        definition = R.string.d236,
        id1 = 236,
        stroke1 = R.drawable.yin,
        stroke2 = R.drawable.liao,
        sound = R.raw.yin3liao4
    ),
    Saved(
        word = "盒子",
        pinyin = "hézi",
        definition = R.string.d237,
        id1 = 237,
        stroke1 = R.drawable.he2,
        stroke2 = R.drawable.zi2,
        sound = R.raw.he2zi5
    ),
    Saved(
        word = "饼干",
        pinyin = "bǐnggān",
        definition = R.string.d238,
        id1 = 238,
        stroke1 = R.drawable.bing2,
        stroke2 = R.drawable.gan,
        sound = R.raw.bing3gan1
    ),
    Saved(
        word = "橡皮",
        pinyin = "xiàngpí",
        definition = R.string.d239,
        id1 = 239,
        stroke1 = R.drawable.xiang2,
        stroke2 = R.drawable.pi,
        sound = R.raw.xiang4pi2
    )
)

val vocab_lesson9: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "前面",
        pinyin = "qiánmiàn",
        definition = R.string.d240,
        id1 = 240,
        stroke1 = R.drawable.qian2,
        stroke2 = R.drawable.mian,
        sound = R.raw.qian2mian4
    ),
    Saved(
        word = "马路",
        pinyin = "mǎlù",
        definition = R.string.d241,
        id1 = 241,
        stroke1 = R.drawable.ma3,
        stroke2 = R.drawable.lu,
        sound = R.raw.ma3lu4
    ),
    Saved(
        word = "对面",
        pinyin = "duìmiàn",
        definition = R.string.d242,
        id1 = 242,
        stroke1 = R.drawable.dui,
        stroke2 = R.drawable.mian,
        sound = R.raw.dui4mian4
    ),
    Saved(
        word = "银行",
        pinyin = "yínháng",
        definition = R.string.d243,
        id1 = 243,
        stroke1 = R.drawable.yin2,
        stroke2 = R.drawable.xing,
        sound = R.raw.yin2hang2
    ),
    Saved(
        word = "后面",
        pinyin = "hòumiàn",
        definition = R.string.d244,
        id1 = 244,
        stroke1 = R.drawable.hou,
        stroke2 = R.drawable.mian,
        sound = R.raw.hou4mian5
    ),
    Saved(
        word = "超市",
        pinyin = "chāoshì",
        definition = R.string.d245,
        id1 = 245,
        stroke1 = R.drawable.chao,
        stroke2 = R.drawable.shi6,
        sound = R.raw.chao1shi4
    ),
    Saved(
        word = "邮局",
        pinyin = "yóujú",
        definition = R.string.d246,
        id1 = 246,
        stroke1 = R.drawable.you6,
        stroke2 = R.drawable.ju2,
        sound = R.raw.you2ju2
    ),
    Saved(
        word = "地方",
        pinyin = "dìfang",
        definition = R.string.d247,
        id1 = 247,
        stroke1 = R.drawable.di2,
        stroke2 = R.drawable.fang3,
        sound = R.raw.di4fang5
    ),
    Saved(
        word = "游乐场",
        pinyin = "yóulèchǎng",
        definition = R.string.d248,
        id1 = 248,
        stroke1 = R.drawable.you3,
        stroke2 = R.drawable.le2,
        stroke3 = R.drawable.chang,
        sound = R.raw.you2le4chang3
    ),
    Saved(
        word = "门口",
        pinyin = "ménkǒu",
        definition = R.string.d249,
        id1 = 249,
        stroke1 = R.drawable.men2,
        stroke2 = R.drawable.kou,
        sound = R.raw.men2kou3
    ),
    Saved(
        word = "车站",
        pinyin = "chēzhàn",
        definition = R.string.d250,
        id1 = 250,
        stroke1 = R.drawable.che,
        stroke2 = R.drawable.zhan,
        sound = R.raw.che1zhan4
    )
)
val vocab_lesson10: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "年级",
        pinyin = "niánjí",
        definition = R.string.d251,
        id1 = 251,
        stroke1 = R.drawable.nian,
        stroke2 = R.drawable.ji2,
        sound = R.raw.nian2ji2
    ),
    Saved(
        word = "班",
        pinyin = "bān",
        definition = R.string.d252,
        id1 = 252,
        stroke1 = R.drawable.ban3,
        sound = R.raw.ban1
    ),
    Saved(
        word = "墙",
        pinyin = "qiáng",
        definition = R.string.d253,
        id1 = 253,
        stroke1 = R.drawable.qiang2,
        sound = R.raw.qiang2
    ),
    Saved(
        word = "地图",
        pinyin = "dìtú",
        definition = R.string.d254,
        id1 = 254,
        stroke1 = R.drawable.di2,
        stroke2 = R.drawable.tu,
        sound = R.raw.di4tu2
    ),
    Saved(
        word = "干净",
        pinyin = "gānjìng",
        definition = R.string.d255,
        id1 = 255,
        stroke1 = R.drawable.gan,
        stroke2 = R.drawable.jing3,
        sound = R.raw.gan1jing4
    ),
    Saved(
        word = "中国",
        pinyin = "Zhōngguó",
        definition = R.string.d256,
        id1 = 256,
        stroke1 = R.drawable.zhong,
        stroke2 = R.drawable.guo2,
        sound = R.raw.zhong1guo2
    ),
    Saved(
        word = "李小龙",
        pinyin = "Lǐ Xiǎolóng",
        definition = R.string.d257,
        id1 = 257,
        stroke1 = R.drawable.li2,
        stroke2 = R.drawable.xiao2,
        stroke3 = R.drawable.long1,
        sound = R.raw.li3xiao3long2
    )
)

val vocab_lesson11: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "常",
        pinyin = "cháng",
        definition = R.string.d258,
        id1 = 258,
        stroke1 = R.drawable.chang3,
        sound = R.raw.chang2
    ),
    Saved(
        word = "表扬",
        pinyin = "biǎoyáng",
        definition = R.string.d259,
        id1 = 259,
        stroke1 = R.drawable.biao,
        stroke2 = R.drawable.yang,
        sound = R.raw.biao3yang2
    ),
    Saved(
        word = "喝",
        pinyin = "hē",
        definition = R.string.d260,
        id1 = 260,
        stroke1 = R.drawable.he3,
        sound = R.raw.he1
    ),
    Saved(
        word = "茶",
        pinyin = "chá",
        definition = R.string.d261,
        id1 = 261,
        stroke1 = R.drawable.cha2,
        sound = R.raw.cha2
    ),
    Saved(
        word = "酒",
        pinyin = "jiǔ",
        definition = R.string.d262,
        id1 = 262,
        stroke1 = R.drawable.jiu3,
        sound = R.raw.jiu3
    ),
    Saved(
        word = "坐",
        pinyin = "zuò",
        definition = R.string.d263,
        id1 = 263,
        stroke1 = R.drawable.zuo5,
        sound = R.raw.zuo4
    ),
    Saved(
        word = "地铁",
        pinyin = "dìtiě",
        definition = R.string.d264,
        id1 = 264,
        stroke1 = R.drawable.di2,
        stroke2 = R.drawable.tie,
        sound = R.raw.di4tie3
    ),
    Saved(
        word = "那儿",
        pinyin = "nàr",
        definition = R.string.d265,
        id1 = 265,
        stroke1 = R.drawable.na,
        stroke2 = R.drawable.er,
        sound = R.raw.nar4
    ),
    Saved(
        word = "看",
        pinyin = "kàn",
        definition = R.string.d266,
        id1 = 266,
        stroke1 = R.drawable.kan,
        sound = R.raw.kan4
    ),
    Saved(
        word = "漫画",
        pinyin = "mànhuà",
        definition = R.string.d267,
        id1 = 267,
        stroke1 = R.drawable.man,
        stroke2 = R.drawable.hua3,
        sound = R.raw.man4hua4
    ),
    Saved(
        word = "报纸",
        pinyin = "bàozhǐ",
        definition = R.string.d268,
        id1 = 268,
        stroke1 = R.drawable.bao2,
        stroke2 = R.drawable.zhi3,
        sound = R.raw.bao4zhi3
    ),
    Saved(
        word = "汉语",
        pinyin = "Hànyǔ",
        definition = R.string.d269,
        id1 = 269,
        stroke1 = R.drawable.han,
        stroke2 = R.drawable.yu,
        sound = R.raw.han4yu3
    )
)

val vocab_lesson12: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "也",
        pinyin = "yě",
        definition = R.string.d270,
        id1 = 270,
        stroke1 = R.drawable.ye3,
        sound = R.raw.ye3
    ),
    Saved(
        word = "学",
        pinyin = "xué",
        definition = R.string.d271,
        id1 = 271,
        stroke1 = R.drawable.xue,
        sound = R.raw.xue2
    ),
    Saved(
        word = "馒头",
        pinyin = "mántou",
        definition = R.string.d272,
        id1 = 272,
        stroke1 = R.drawable.man2,
        stroke2 = R.drawable.tou,
        sound = R.raw.man2tou5
    ),
    Saved(
        word = "铅笔",
        pinyin = "qiānbǐ",
        definition = R.string.d273,
        id1 = 273,
        stroke1 = R.drawable.qian3,
        stroke2 = R.drawable.bi,
        sound = R.raw.qian1bi3
    ),
    Saved(
        word = "香蕉",
        pinyin = "xiāngjiāo",
        definition = R.string.d274,
        id1 = 274,
        stroke1 = R.drawable.xiang3,
        stroke2 = R.drawable.jiao5,
        sound = R.raw.xiang1jiao1
    ),
    Saved(
        word = "橙子",
        pinyin = "chéngzi",
        definition = R.string.d275,
        id1 = 275,
        stroke1 = R.drawable.cheng,
        stroke2 = R.drawable.zi2,
        sound = R.raw.cheng2zi5
    ),
    Saved(
        word = "网球",
        pinyin = "wǎngqiú",
        definition = R.string.d276,
        id1 = 276,
        stroke1 = R.drawable.wang2,
        stroke2 = R.drawable.qiu,
        sound = R.raw.wang3qiu2
    ),
    Saved(
        word = "爱好",
        pinyin = "àihào",
        definition = R.string.d277,
        id1 = 277,
        stroke1 = R.drawable.ai,
        stroke2 = R.drawable.hao,
        sound = R.raw.ai4hao4
    ),
    Saved(
        word = "一样",
        pinyin = "yíyàng",
        definition = R.string.d278,
        id1 = 278,
        stroke1 = R.drawable.yi5,
        stroke2 = R.drawable.yang2,
        sound = R.raw.yi1yang4
    ),
    Saved(
        word = "动画片",
        pinyin = "dònghuàpiān",
        definition = R.string.d279,
        id1 = 279,
        stroke1 = R.drawable.dong,
        stroke2 = R.drawable.hua3,
        stroke3 = R.drawable.pian,
        sound = R.raw.dong4hua4pian1
    ),
    Saved(
        word = "周末",
        pinyin = "zhōumò",
        definition = R.string.d280,
        id1 = 280,
        stroke1 = R.drawable.zhou,
        stroke2 = R.drawable.mo,
        sound = R.raw.zhou1mo4
    ),
    Saved(
        word = "中文",
        pinyin = "Zhōngwén",
        definition = R.string.d281,
        id1 = 281,
        stroke1 = R.drawable.zhong,
        stroke2 = R.drawable.wen2,
        sound = R.raw.zhong1wen2
    )
)

val vocab_lesson13: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "都",
        pinyin = "dōu",
        definition = R.string.d282,
        id1 = 282,
        stroke1 = R.drawable.dou,
        sound = R.raw.dou1
    ),
    Saved(
        word = "些",
        pinyin = "xiē",
        definition = R.string.d283,
        id1 = 283,
        stroke1 = R.drawable.xie3,
        sound = R.raw.xie1
    ),
    Saved(
        word = "写",
        pinyin = "xiě",
        definition = R.string.d284,
        id1 = 284,
        stroke1 = R.drawable.xie4,
        sound = R.raw.xie3
    ),
    Saved(
        word = "旅游",
        pinyin = "lǚyóu",
        definition = R.string.d285,
        id1 = 285,
        stroke1 = R.drawable.lv2,
        stroke2 = R.drawable.you3,
        sound = R.raw.lv3you2
    ),
    Saved(
        word = "教",
        pinyin = "jiāo",
        definition = R.string.d286,
        id1 = 286,
        stroke1 = R.drawable.jiao3,
        sound = R.raw.jiao1
    ),
    Saved(
        word = "鸡蛋",
        pinyin = "jīdàn",
        definition = R.string.d287,
        id1 = 287,
        stroke1 = R.drawable.ji3,
        stroke2 = R.drawable.dan,
        sound = R.raw.ji1dan4
    ),
    Saved(
        word = "电视",
        pinyin = "diànshì",
        definition = R.string.d288,
        id1 = 288,
        stroke1 = R.drawable.dian2,
        stroke2 = R.drawable.shi7,
        sound = R.raw.dian4shi4
    ),
    Saved(
        word = "岁",
        pinyin = "suì",
        definition = R.string.d289,
        id1 = 289,
        stroke1 = R.drawable.sui,
        sound = R.raw.sui4
    ),
    Saved(
        word = "今年",
        pinyin = "jīnnián",
        definition = R.string.d290,
        id1 = 290,
        stroke1 = R.drawable.jin2,
        stroke2 = R.drawable.nian,
        sound = R.raw.jin1nian2
    ),
    Saved(
        word = "汉字",
        pinyin = "Hànzi",
        definition = R.string.d291,
        id1 = 291,
        stroke1 = R.drawable.han,
        stroke2 = R.drawable.zi3,
        sound = R.raw.han4zi4
    )
)

val vocab_lesson14: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "一起",
        pinyin = "yìqǐ",
        definition = R.string.d292,
        id1 = 292,
        stroke1 = R.drawable.yi5,
        stroke2 = R.drawable.qi2,
        sound = R.raw.yi1qi3
    ),
    Saved(
        word = "上学",
        pinyin = "shàng xué",
        definition = R.string.d293,
        id1 = 293,
        stroke1 = R.drawable.shang,
        stroke2 = R.drawable.xue,
        sound = R.raw.shang4xue2
    ),
    Saved(
        word = "下午",
        pinyin = "xiàwǔ",
        definition = R.string.d294,
        id1 = 294,
        stroke1 = R.drawable.xia,
        stroke2 = R.drawable.wu,
        sound = R.raw.xia4wu3
    ),
    Saved(
        word = "明天",
        pinyin = "míngtiān",
        definition = R.string.d295,
        id1 = 295,
        stroke1 = R.drawable.ming2,
        stroke2 = R.drawable.tian,
        sound = R.raw.ming2tian1
    ),
    Saved(
        word = "书店",
        pinyin = "shūdiàn",
        definition = R.string.d296,
        id1 = 296,
        stroke1 = R.drawable.shu,
        stroke2 = R.drawable.dian3,
        sound = R.raw.shu1dian4
    ),
    Saved(
        word = "太",
        pinyin = "tài",
        definition = R.string.d297,
        id1 = 297,
        stroke1 = R.drawable.tai2,
        sound = R.raw.tai4
    ),
    Saved(
        word = "贵",
        pinyin = "guì",
        definition = R.string.d298,
        id1 = 298,
        stroke1 = R.drawable.gui2,
        sound = R.raw.gui4
    ),
    Saved(
        word = "道",
        pinyin = "dào",
        definition = R.string.d299,
        id1 = 299,
        stroke1 = R.drawable.dao,
        sound = R.raw.dao4
    ),
    Saved(
        word = "题",
        pinyin = "tí",
        definition = R.string.d300,
        id1 = 300,
        stroke1 = R.drawable.ti2,
        sound = R.raw.ti2
    ),
    Saved(
        word = "难",
        pinyin = "nán",
        definition = R.string.d301,
        id1 = 301,
        stroke1 = R.drawable.nan2,
        sound = R.raw.nan2
    ),
    Saved(
        word = "邻居",
        pinyin = "línjū",
        definition = R.string.d302,
        id1 = 302,
        stroke1 = R.drawable.lin,
        stroke2 = R.drawable.ju3,
        sound = R.raw.lin2ju1
    ),
    Saved(
        word = "学习",
        pinyin = "xuéxí",
        definition = R.string.d303,
        id1 = 303,
        stroke1 = R.drawable.xue,
        stroke2 = R.drawable.xi5,
        sound = R.raw.xue2xi2
    ),
    Saved(
        word = "对",
        pinyin = "duì",
        definition = R.string.d304,
        id1 = 304,
        stroke1 = R.drawable.dui,
        sound = R.raw.dui4
    )
)

val vocab_lesson15: ArrayList<Saved> = arrayListOf(
    Saved(
        word = "有的",
        pinyin = "yǒude",
        definition = R.string.d305,
        id1 = 305,
        stroke1 = R.drawable.you4,
        stroke2 = R.drawable.de,
        sound = R.raw.you3de5
    ),
    Saved(
        word = "跑",
        pinyin = "pǎo",
        definition = R.string.d306,
        id1 = 306,
        stroke1 = R.drawable.pao,
        sound = R.raw.pao3
    ),
    Saved(
        word = "锻炼",
        pinyin = "duànliàn",
        definition = R.string.d307,
        id1 = 307,
        stroke1 = R.drawable.duan2,
        stroke2 = R.drawable.lian,
        sound = R.raw.duan4lian4
    ),
    Saved(
        word = "身体",
        pinyin = "shēntǐ",
        definition = R.string.d308,
        id1 = 308,
        stroke1 = R.drawable.shen2,
        stroke2 = R.drawable.ti3,
        sound = R.raw.shen1ti3
    ),
    Saved(
        word = "动物",
        pinyin = "dòngwù",
        definition = R.string.d309,
        id1 = 309,
        stroke1 = R.drawable.dong,
        stroke2 = R.drawable.wu2,
        sound = R.raw.dong4wu4
    ),
    Saved(
        word = "猴子",
        pinyin = "hóuzi",
        definition = R.string.d310,
        id1 = 310,
        stroke1 = R.drawable.hou2,
        stroke2 = R.drawable.zi2,
        sound = R.raw.hou2zi5
    ),
    Saved(
        word = "见",
        pinyin = "jiàn",
        definition = R.string.d311,
        id1 = 311,
        stroke1 = R.drawable.jian,
        sound = R.raw.jian4
    )
)

val vocabAll: List<Saved> = vocab_lesson1 + vocab_lesson2 + vocab_lesson3 + vocab_lesson4 +
        vocab_lesson5 + vocab_lesson6 + vocab_lesson7 + vocab_lesson8 +
        vocab_lesson9 + vocab_lesson10 + vocab_lesson11 + vocab_lesson12 +
        vocab_lesson13 + vocab_lesson14 + vocab_lesson15




