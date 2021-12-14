package com.alisamir.footballquiz.data

import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.pojo.BadgeQuestion
import com.alisamir.footballquiz.pojo.InfoQuestion
import com.alisamir.footballquiz.pojo.PlayerPhotoQuestion

class CONSTANTS {
    val level1List = arrayListOf<PlayerPhotoQuestion>(
        PlayerPhotoQuestion(R.drawable.maldini,"Marco Materazzi","Paolo Maldini","Alessandro Nesta","Alessio Romagnoli",2),
        PlayerPhotoQuestion(R.drawable.basten,"Van Basten","Ruud Gullit","johan cruyff","Van Dijk",1),
        PlayerPhotoQuestion(R.drawable.salah,"Abo treika","Mohamed El Neny","Sadio Mane","Mohamed Salah",4),
        PlayerPhotoQuestion(R.drawable.maradona,"Diego Maradona","Pele","Eusébio","Gerd Muller",1),
        PlayerPhotoQuestion(R.drawable.zlatan,"Mauro Icardi","Edinson Cavani","Zlatan Ibrahimovic","Kylian Mbappe",3),
        PlayerPhotoQuestion(R.drawable.materrazi,"Alessandro Basstoni","Paolo Maldini","Marco Materazzi","Lucio",3),
        PlayerPhotoQuestion(R.drawable.cruyff,"Van Basten","Ruud Gullit","Van Dijk","johan cruyff",4),
        PlayerPhotoQuestion(R.drawable.okocha,"Okocha","Eto","Drogba","Mosses",1),
        PlayerPhotoQuestion(R.drawable.morgan,"Tobin Heath","Alex Morgan","Megan Rapinoe","Anja Mittag",2),
        PlayerPhotoQuestion(R.drawable.debruyne,"Eden Hazard","Kevin De Bruyne","Bernardo Silva","Dries Mertens",2),
        PlayerPhotoQuestion(R.drawable.calhaluglu,"Arda Turan","Kabak","Hakan Çalhanoğlu","Burak Yılmaz",3),
        PlayerPhotoQuestion(R.drawable.mbappe,"Kylian Mbappe","Paul Pogba","Vinicus Junior","Narcus Rashford",1),
        PlayerPhotoQuestion(R.drawable.nesta,"Marco Materazzi","Paolo Maldini","Alessandro Nesta","Alessio Romagnoli",3),
        PlayerPhotoQuestion(R.drawable.ozil,"Karim Benzema","Thierry Henry","Oliver Giroud","Mesut Ozil",4),
        PlayerPhotoQuestion(R.drawable.yashin,"Pele","Yashin","Oliver Kahn","Eusébio",2),

    )
    val level2List = arrayListOf<BadgeQuestion>()
    val level3List = arrayListOf<InfoQuestion>()
    val level4List = arrayListOf<InfoQuestion>()
    val level5List = arrayListOf<InfoQuestion>()
    val level6List = arrayListOf<InfoQuestion>()
}