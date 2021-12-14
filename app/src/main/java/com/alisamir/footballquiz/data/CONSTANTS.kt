package com.alisamir.footballquiz.data

import com.alisamir.footballquiz.R
import com.alisamir.footballquiz.pojo.BadgeQuestion
import com.alisamir.footballquiz.pojo.InfoQuestion
import com.alisamir.footballquiz.pojo.PlayerPhotoQuestion

class CONSTANTS {
    companion object {
        val level1List = arrayListOf<PlayerPhotoQuestion>(
            PlayerPhotoQuestion(
                R.drawable.maldini,
                "Marco Materazzi",
                "Paolo Maldini",
                "Alessandro Nesta",
                "Alessio Romagnoli",
                R.id.answer_2
            ),
            PlayerPhotoQuestion(
                R.drawable.basten,
                "Van Basten",
                "Ruud Gullit",
                "johan cruyff",
                "Van Dijk",
                R.id.answer_1
            ),
            PlayerPhotoQuestion(
                R.drawable.salah,
                "Abo treika",
                "Mohamed El Neny",
                "Sadio Mane",
                "Mohamed Salah",
                R.id.answer_4
            ),
            PlayerPhotoQuestion(
                R.drawable.maradona,
                "Diego Maradona",
                "Pele",
                "Eusébio",
                "Gerd Muller",
                R.id.answer_1
            ),
            PlayerPhotoQuestion(
                R.drawable.zlatan,
                "Mauro Icardi",
                "Edinson Cavani",
                "Zlatan Ibrahimovic",
                "Kylian Mbappe",
                R.id.answer_3
            ),
            PlayerPhotoQuestion(
                R.drawable.materrazi,
                "Alessandro Basstoni",
                "Paolo Maldini",
                "Marco Materazzi",
                "Lucio",
                R.id.answer_3
            ),
            PlayerPhotoQuestion(
                R.drawable.cruyff,
                "Van Basten",
                "Ruud Gullit",
                "Van Dijk",
                "johan cruyff",
                R.id.answer_4
            ),
            PlayerPhotoQuestion(R.drawable.okocha, "Okocha", "Eto", "Drogba", "Mosses", R.id.answer_1),
            PlayerPhotoQuestion(
                R.drawable.morgan,
                "Tobin Heath",
                "Alex Morgan",
                "Megan Rapinoe",
                "Anja Mittag",
                R.id.answer_2
            ),
            PlayerPhotoQuestion(
                R.drawable.debruyne,
                "Eden Hazard",
                "Kevin De Bruyne",
                "Bernardo Silva",
                "Dries Mertens",
                R.id.answer_2
            ),
            PlayerPhotoQuestion(
                R.drawable.calhaluglu,
                "Arda Turan",
                "Kabak",
                "Hakan Çalhanoğlu",
                "Burak Yılmaz",
                R.id.answer_3
            ),
            PlayerPhotoQuestion(
                R.drawable.mbappe,
                "Kylian Mbappe",
                "Paul Pogba",
                "Vinicus Junior",
                "Narcus Rashford",
                R.id.answer_1
            ),
            PlayerPhotoQuestion(
                R.drawable.nesta,
                "Marco Materazzi",
                "Paolo Maldini",
                "Alessandro Nesta",
                "Alessio Romagnoli",
                R.id.answer_3
            ),
            PlayerPhotoQuestion(
                R.drawable.ozil,
                "Karim Benzema",
                "Thierry Henry",
                "Oliver Giroud",
                "Mesut Ozil",
                R.id.answer_4
            ),
            PlayerPhotoQuestion(R.drawable.yashin, "Pele", "Yashin", "Oliver Kahn", "Eusébio", R.id.answer_2)

        )
        val level2List = arrayListOf<BadgeQuestion>(
            BadgeQuestion(
                R.drawable.anderlecht,
                "Dortmund",
                "Anderlecht",
                "Club Brugge",
                "FC Basel",
                R.id.answer_2
            ),
            BadgeQuestion(
                R.drawable.dortmund,
                "Dortmund",
                "FC Bayern",
                "Young Boys",
                "FC Shalke",
                R.id.answer_1
            ),
            BadgeQuestion(
                R.drawable.fulham,
                "Wolves",
                "Fulham",
                "Manchester United",
                "Norwich City",
                R.id.answer_2
            ),
            BadgeQuestion(R.drawable.bologne, "Napoli", "Spezia", "Torino", "Bologne", R.id.answer_4),
            BadgeQuestion(R.drawable.monaco, "Monaco", "Lille", "Lyon", "Marseille", R.id.answer_1),
            BadgeQuestion(R.drawable.portugal, "Brazil", "France", "Portugal", "Argentina", R.id.answer_3),
            BadgeQuestion(R.drawable.argentina, "Brazil", "France", "Portugal", "Argentina", R.id.answer_4),
            BadgeQuestion(R.drawable.inter, "Roma", "Napoli", "Milan", "Inter", R.id.answer_4),
            BadgeQuestion(R.drawable.milan, "Roma", "Napoli", "Milan", "Inter", R.id.answer_3),
            BadgeQuestion(R.drawable.napoli, "Napoli", "Roma", "Milan", "Inter", R.id.answer_1),
            BadgeQuestion(R.drawable.flamingo, "Palmeiras", "Flamingo", "River Plate", "Santos", R.id.answer_2),
            BadgeQuestion(
                R.drawable.riverplate,
                "Palmeiras",
                "Flamingo",
                "River Plate",
                "Santos",
                R.id.answer_3
            ),
            BadgeQuestion(
                R.drawable.realbetis,
                "Sevilla FC",
                "Valencia",
                "Real Sociedad",
                "Real Betis",
                R.id.answer_4
            ),
            BadgeQuestion(
                R.drawable.sevilla,
                "Sevilla FC",
                "Valencia",
                "Real Sociedad",
                "Real Betis",
                R.id.answer_1
            ),
            BadgeQuestion(
                R.drawable.galatsray,
                "Fenerbahçe",
                "Galatasaray",
                "Istanbul Basaksehir",
                "Fatih Karagümrük",
                R.id.answer_2
            )
        )
        val level3List = arrayListOf<InfoQuestion>(
            InfoQuestion("how many players start on the football pitch?", "11", "22", "8", "18", R.id.answer_2),
            InfoQuestion(
                "how many players start on the football pitch?",
                "only the strikers",
                "only central players",
                "every player",
                "only wide players",
                R.id.answer_3
            ),
            InfoQuestion(
                "how large is a goalkeepers box where he/she can pick up the ball?",
                "18 yards",
                "22 yards",
                "14 yards",
                "30 yards",
                R.id.answer_1
            ),
            InfoQuestion("how many types of center kick off are there?", "2", "1", "5", "8", R.id.answer_1),
            InfoQuestion(
                "how many teams get relegated from the English premiership each season?",
                "2",
                "5",
                "3",
                "1",
                R.id.answer_3
            ),
            InfoQuestion(
                "how long is a match of football?",
                "80 minutes",
                "1 hour and a half",
                "60 minutes",
                "100 minutes",
                R.id.answer_2
            ),
            InfoQuestion(
                "Which feet can be used in a match of football?",
                "only your left foot",
                "only your strongest foot",
                "both feet",
                "only your right foot",
                R.id.answer_3
            ),
            InfoQuestion(
                "how much extra time is added if a cup match is a draw at 90 minutes with no option of a replay?",
                "10 minutes",
                "20 minutes",
                "30 minutes",
                "40 minutes",
                R.id.answer_3
            ),
            InfoQuestion("how many colours of cards are there?", "4", "2", "5", "1", R.id.answer_2),
            InfoQuestion(
                "How much of the ball has to cross the line for it to be counted as a goal?",
                "half of the ball",
                "all of the ball",
                "one quarter of the ball",
                "one quarter of the ball",
                R.id.answer_2
            ),
            InfoQuestion(
                "how many game officials are there in a match of football?",
                "2",
                "6",
                "4",
                "1",
                R.id.answer_3
            ),
            InfoQuestion(
                "which of these is not a name for a football official?",
                "referee",
                "assistant referee",
                "football umpire",
                "the 4th official",
                R.id.answer_3
            ),
            InfoQuestion(
                "What part of the body is not allowed to touch the a soccer ball while the ball is in play?",
                "Head",
                "Arms and Hands",
                "Arms only",
                "Hands Only",
                R.id.answer_2
            ),
            InfoQuestion(
                "What player is allowed on the field to touch a soccer ball with their hands?",
                "Wing",
                "Mid Fielder",
                "Defensemen",
                "Goal Keeper",
                R.id.answer_4
            ),
            InfoQuestion(
                "How big the center circle on a soccer field?",
                "10 feet",
                "10 yards",
                "10 yards in diameter",
                "10 feet in diameter",
                R.id.answer_3
            )
        )
        val level4List = arrayListOf<InfoQuestion>(
            InfoQuestion(
                "How old was Messi when he joined football",
                "18 years",
                "15 years",
                "13 years",
                "12 years",
                R.id.answer_3
            ),
            InfoQuestion("How many World Cup trophies does Italy have?", "4", "1", "3", "5", R.id.answer_1),
            InfoQuestion(
                "Who won the 1950 World Cup edition?",
                "Uruguay",
                "Italy",
                "Brasil",
                "Brasil",
                R.id.answer_1
            ),
            InfoQuestion(
                "Who's the founder of FC Barcelona?",
                "Lionel Messi",
                "Ernesto Valverde",
                "Johan Cruyff",
                "Joan Gamper",
                R.id.answer_4
            ),
            InfoQuestion(
                "Who is nominated as the best player in fifa 2016?",
                "Messi",
                "Cristiano Ronaldo",
                "Greizmann",
                "Suarez",
                R.id.answer_2
            ),
            InfoQuestion(
                "Which international team won the 1st football world cup in the history?",
                "Argentina",
                "Brazil",
                "Portugal",
                "Uruguay",
                R.id.answer_4
            ),
            InfoQuestion(
                "Who won the first UCL (CHAMPIONS LEAGUE)",
                "FC BARCELONA",
                "GETAFE",
                "AC MILAN",
                "REAL MADRID",
                R.id.answer_4
            ),
            InfoQuestion(
                "Which team did Cristiano Ronaldo play for before Real Madrid?",
                "Manchester United",
                "Leicester City",
                "Manchester City",
                "Liverpool",
                R.id.answer_1
            ),
            InfoQuestion(
                "who was the champion of la liga in 2015",
                "Arsenal",
                "Barcelona",
                "Real Madrid",
                "Sevilla",
                R.id.answer_2
            ),
            InfoQuestion(
                "Who is the football world governing body?",
                "Uefa",
                "Fifa",
                "Afcom",
                "Fiba",
                R.id.answer_2
            ),
            InfoQuestion(
                "Who won the Ballon D'or in 2007?",
                "Leo Messi",
                "Arjen Robben",
                "Paul Scholes",
                "Ricardo Kaka",
                R.id.answer_4
            ),
            InfoQuestion(
                "What National Team won World Cup 2010",
                "South America",
                "Switzerland",
                "Spain",
                "Germany",
                R.id.answer_3
            ),
            InfoQuestion(
                "What Team Won 2016 BPL",
                "Manchester United",
                "FC Akenfenwa",
                "Leicester City",
                "Chelsea",
                R.id.answer_3
            ),
            InfoQuestion(
                "Who Won The World Cup 2014",
                "Brazil",
                "Germany",
                "Argentina",
                "England",
                R.id.answer_2
            ),
            InfoQuestion(
                "Who is the winner of 2018 world cup?",
                "France",
                "Croatia",
                "Germany",
                "Spain",
                R.id.answer_1
            )
        )
        val level5List = arrayListOf<InfoQuestion>(
            InfoQuestion(
                "Which of following team do not play in stripes?",
                "Newcastle",
                "Southampton",
                "Tottenham Hotspur",
                "Lincoln City",
                R.id.answer_3
            ),
            InfoQuestion(
                "Which of the following country hosted the first Football World Cup?",
                "America",
                "Argentina",
                "Brazil",
                "Uruguay",
                R.id.answer_4
            ),
            InfoQuestion(
                "When was first official international football match was played?",
                "1929",
                "1872",
                "1902",
                "1902",
                R.id.answer_2
            ),
            InfoQuestion(
                "Who among the following scored the first goal in World Cup history?",
                "Johino",
                "Bert Patenaude",
                "Lucien Laurent",
                "Pele",
                R.id.answer_3
            ),
            InfoQuestion(
                "Who among the following achieved the first World Cup hat-trick?",
                "Johino",
                "Bert Patenaude",
                "Lucien Laurent",
                "Pele",
                R.id.answer_2
            ),
            InfoQuestion(
                "Which of the following country won Football world Cup maximum times?",
                "Germany",
                "Italy",
                "Argentina",
                "Brazil",
                R.id.answer_4
            ),
            InfoQuestion(
                "Who among the following player scores highest number of goals in Footbal World Cup?",
                "Jurgen Klinsmann",
                "Maradona",
                "Miroslave Klose",
                "Pele",
                R.id.answer_3
            ),
            InfoQuestion(
                "Which of the following term is recognised as an early form of football by FIFA?",
                "kemari",
                "Episkyros",
                "Cuju",
                "Inuit",
                R.id.answer_2
            ),
            InfoQuestion(
                "When was the first FIFA World Cup inaugurated?",
                "1930",
                "1931",
                "1932",
                "1933",
                R.id.answer_1
            ),
            InfoQuestion(
                "Which club won the 2017 UEFA Super Cup?",
                "FC Bayern",
                "Barcelona",
                "Real Madrid",
                "Sevilla",
                R.id.answer_3
            ),
            InfoQuestion(
                "Which Portuguese team did Ronaldo play for before signing for Manchester United?",
                "Sporting",
                "Porto",
                "Benfica",
                "Young Boys",
                R.id.answer_1
            ),
            InfoQuestion(
                "Messi has won a record number of Ballon d'Or awards - how many?",
                "9",
                "6",
                "8",
                "7",
                R.id.answer_4
            ),
            InfoQuestion(
                "Ronaldo helped Portugal win the European Championship in which year?",
                "2017",
                "2016",
                "2015",
                "2018",
                R.id.answer_2
            ),
            InfoQuestion(
                "Which German multinational sportswear company is Messi an ambassador for?",
                "Adidias",
                "Nike",
                "Puma",
                "Andora",
                R.id.answer_1
            ),
            InfoQuestion(
                "Which German multinational sportswear company is Cristiano an ambassador for?",
                "Adidias",
                "Nike",
                "Puma",
                "Andora",
                R.id.answer_2
            )
        )
        val level6List = arrayListOf<InfoQuestion>(
            InfoQuestion(
                "Jurgen Klopp has managed two clubs in Germany, Borussia Dortmund and - can you name the other?",
                "Wolvesburg",
                "Fc Schalke",
                "FC Bayern",
                "Mainz",
                R.id.answer_4
            ),
            InfoQuestion(
                "In what league is the concept of a 'Designated Player' a feature?",
                "Premier League",
                "MLS",
                "Serie A",
                "Bundesliga",
                R.id.answer_2
            ),
            InfoQuestion(
                "Manchester United famously wear red, but what colours did they wear before adopting red?",
                "Green and gold",
                "Green and black",
                "White and black",
                "red and gold",
                R.id.answer_1
            ),
            InfoQuestion(
                "Which club is associated with 'Galacticos'?",
                "Real Madrid",
                "Barcelona",
                "Atletico Madrid",
                "Athletic Bilbao",
                R.id.answer_1
            ),
            InfoQuestion(
                "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
                "Guardiola",
                "Jurgen Klopp",
                "Sir Alex Ferguson",
                "Jose Morinho",
                R.id.answer_3
            ),
            InfoQuestion(
                "Which club is sometimes referred to as FC Hollywood?",
                "Real Madrid",
                "FC Bayern",
                "Dortmund",
                "Barcelona",
                R.id.answer_2
            ),
            InfoQuestion(
                "After Juventus, AC Milan and Inter, with nine Scudettos, which team has won the most Serie A titles?",
                "Bologne",
                "Roma",
                "Inter",
                "Genoa",
                R.id.answer_4
            ),
            InfoQuestion(
                "In video game FIFA 20, team Piemonte Calcio represents which real-life club?",
                "Inter",
                "Juventus",
                "Manchester United",
                "FC Bayern",
                R.id.answer_2
            ),
            InfoQuestion(
                "Which MLS franchise team does David Beckham own?",
                "Chicago",
                "Atlanta",
                "Inter Miami",
                "LA Galaxy",
                R.id.answer_3
            ),
            InfoQuestion(
                "How many Barcelona players have won the World Player of the Year award?",
                "5",
                "2",
                "1",
                "8",
                R.id.answer_1
            ),
            InfoQuestion(
                "Mark Hateley was top scorer in 1984 and then sold to which club?",
                "Barcelona",
                "Inter",
                "Real Madrid",
                "Milan",
                R.id.answer_4
            ),
            InfoQuestion(
                "Who scored Liverpool’s only goal in the 1978 European Cup Final?",
                "Robbi Fowler",
                "Alan Shearer",
                "Rush",
                "Kenny Dalglish.",
                R.id.answer_4
            ),
            InfoQuestion(
                "Who has scored the most hat tricks in La Liga for Barcelona?",
                "Eto",
                "Lionel Messi",
                "Iniesta",
                "Xavi",
                R.id.answer_2
            ),
            InfoQuestion(
                "Who won the Premier League 2012-13?",
                "Manchester United",
                "Manchester City",
                "Chelsea",
                "Liverpool",
                R.id.answer_1
            ),
            InfoQuestion(
                "Where was the 2006 Champions League Final held?",
                "London",
                "Lisbon",
                "Paris",
                "Roma",
                R.id.answer_3
            )
        )
    }
}