fun main() {
    println("enter you pin")
    var code = 1234
    var balance = 500
    var accountpin = 123456
    var bankBalance = 1200
    var usepin = readln().toInt()
    if (usepin == code) {
        println("1 itus haraagaaga")
        println("2 kaarka hadalka")
        println("3 Bixi biilka ")
        println("4 Uwareeji EVCPlus")
        println("5 warbixin Kooban")
        println("6 Salaaam Bank ")
        println("7  Maaraynta ")
        println("8 TAAJ  ")
        println("9 Biil Payment  ")
    } else {
        println("undefine code $usepin")
    }

    var inputuser = readln().toInt()
    if (inputuser == 1) {
        println("haragaagu waa ${balance}")
    }
    if (inputuser == 2) {
        println("1 kushob kaarka hadalka")
        println("2 ugushub karka hadalka")
        var inputKaarkaHadalka = readln().toInt()


        if (inputKaarkaHadalka == 1) {
            println("fadlan geli lacagta")
            var inputkarkahadalka = readln().toInt()
            if (inputkarkahadalka <= balance) {
                println(" mahubtaa inaad kushubanaysid $ ${inputkarkahadalka}")
                println(" 1: waan hubaa \n 2 maya mahubo")
                var checkuserMoney = readln().toInt()
                if (checkuserMoney == 1) {
                    println("Congratualtion ! you successsufl to convert $inputkarkahadalka")
                } else if (checkuserMoney == 2) {
                    println("Try Again")
                } else {
                    println("Undefined number ${inputKaarkaHadalka}")
                }
            }

        }


        if (inputKaarkaHadalka == 2) {
            println("fadlan geli numberka aadugushubayso")
            var user_Phone = readln().toInt()
            println("fadlan geli Lacagta ")
            var moneySendUser = readln().toInt()
            if (moneySendUser < balance) {
                println("1 : Haa waan hubaa \n 2: Maya mahubo")
                var checkuserMoney = readln().toInt()
                if (checkuserMoney == 1) {
                    println("Waxaad ugushubtay $ ${moneySendUser} numberkaan ${user_Phone}")
                } else if (checkuserMoney == 2) {
                    println("TRY Again")
                } else {
                    println("  You balance is not enought ${moneySendUser}")
                }
            } else {
                println(" you balance is not enought#$moneySendUser")
            }

        }
    }



    if (inputuser == 3) {
        println("1 : Post paid")
        println("2 : Ku iibso")

        var ogowBiilka = readln().toInt()
        if (ogowBiilka == 1) {
            println("1 Ogowbiilka")
            println("2: Bixi Biilka")
            println("3 :  Ka Bixi Biil ")
        }
    }



    if (inputuser == 4) {
        println(" Fadlan gelin numberka")
        var gelinumberkauserka = readln().toInt()
        println(" Fadlan gelin lacagta")
        var entermoney = readln().toInt()
        println(" mahabutaa inaad uwareejinayso  $entermoney \n 1: yes \n 2: no")
        var checkyesOrno = readln()
        if (checkyesOrno == "yes") {
            println(" wad kuguulaysatay inaad uwareejiso $ $entermoney this number $gelinumberkauserka")
        } else if (checkyesOrno == "no") {
            println(" TRY Again Please")
        }
    }


    if (inputuser == 5) {
        println("1 : Last Action")
        println("2 : wareejintii udanybaysay")
        println("3:  Iibsashadii udanbayhsay")
        println("4:   Last Action ")
        println("5:   Email me My Activity ")
        var warbixinKooban = readln().toInt()
        if (warbixinKooban == 1) {
            println("EVC Plus waxaad uwareejisay $60  number 612599922 tariikhda ayhayd 13/4/2014")

        }
        if (warbixinKooban == 2) {
            println("statemetiga \n 1 : Udietay 2: kaheshay \n")
            var statemetiga = readln().toInt()
            if (statemetiga == 1) {
                println("fadlan geli numberka")
                var udirtay = readln().toInt()
                println("waxaad uwareejisay $ 50 taariikhda 12/3/2024 $udirtay")
            }
            if (statemetiga == 2) {
                println("fadlan geli numberka")
                var udirtay = readln().toInt()
                println("waxaad kaheshay $ 50 taariikhda 12/3/2024 $udirtay")
            }
            if (
                statemetiga == 3) {
                println("fadlan geli Aqoonsiga Ganacsiga")
                var udirtay = readln().toInt()
                println("Mahan midjiro")
            }
            if (statemetiga == 4) {
                println(" will send SMs you phone")

            }

            if (statemetiga == 5) {
                println(" Fadlan geli emailka kaga")
                var email = readln()
                println("fadlan geli taariikhda")

            }

        }

    }
    if (inputuser == 6) {
        println("1 : itus haraagaada")
        println("2 : Lacag dhigasho")
        println("3 : Lacag qaadasho")
        println("4 :  kawareejin EVCPlus ")
        println("5 :  kawareeji Account -kaaga ")
        println("6 :  hubi  wareeji Account  ")
        println("7 :  maaraynta Bankiga      ")
        println("8 :  kala  Bax      ")

        var numberxisOption = readln().toInt()
        if (numberxisOption == 1) {
            println(" fadlan geli pinkaaga ")
            var pinusrAccount = readln().toInt()
            if (pinusrAccount == accountpin) {
                println("haraagaagu waa $ $bankBalance")
            } else {
                println("pinkaagu waa qaldanyahay $pinusrAccount")
            }
        }
        if (numberxisOption == 2) {
            println("fadlan geli lacagta ")
            var entermoney = readln().toInt()
            var total = entermoney
            bankBalance += total
            println("fadlan geli  macluumaad")
            var maclumad = readln().toString()
            println(" $maclumad")
            println("fadlan geli pinkaaaga")
            var pin = readln().toInt()
            if (pin == accountpin) {
                println("waxad kushubtay $entermoney haraagadu waa $bankBalance")
            } else {
                println("pinkadu waa qalad $pin")
            }

        }

        if (numberxisOption == 3) {
            println("fadlan gei lacagta")
            var withdrawmoney = readln().toInt()
            if (withdrawmoney < bankBalance) {
                println(" fadlan geli pinkaada")
                var pinbank = readln().toInt()
                if (pinbank == accountpin) {
                    println(" fadlan \n 1 : haa waan hubaa \n 2: maya mahubo ")
                    var checYesOrNo = readln().toInt()
                    if (checYesOrNo == 1 && checYesOrNo == bankBalance) {
                        println("waxad kala baxday ")
                    } else if (checYesOrNo == 2) {
                        println(" TRY Again")
                    }
                } else {
                    println("pinkaadu wa qaldan yhay $numberxisOption")
                }
            }
        }

        if (numberxisOption == 4) {
            println("fadlan dooro xidabta bankiga")
            println("1 : Bank beeraha ")
            println("2 : salaam Sch")
            println("3: Salaam somaali bank")
            println("4: Darasalaam Bank")
            var banksOption = readln().toInt()
            if (banksOption == 1){
                println(" fadlan geli Account -ka")
                var  macluuaccmad = readln()
                println("$macluuaccmad")


            }


        }
        if (numberxisOption == 5){
            println("Fadlan geli Account ams Mobile")
        }


    }
    if (inputuser == 7){
        println(" 1: bedel Lamberka sirta ah")
        println(" 2: bedel luuqada")
        println(" 3: wargelin mobile lumay")
        println(" 4: lacag xirasho")
        println(" 5: uceli lacag qaldan tay")
        println(" Enable mobile bank")

        var optionsNumber7 = readln().toInt()
        if (optionsNumber7 == 1){
            println(" fadla geli pinkada cuisub ")
            var newpin = readln().toInt()
            if ( newpin < 6){
                accountpin = newpin

                println("  before you is  after changed is $accountpin} ")
            }
        }
    }
    if ( inputuser == 8){
        println(" TAAJ")
        println(" 1: gudaha")
        println("2: Dibada")
        println(" 3: Ogoow Khidmada")
        println(" 4: macluumaadka xawaalada")
        println(" 5: joji xaqaalada")
        println(" furo xaaqalada")
        var optionnumber8 = readln().toInt()
        if (optionnumber8 == 1){
            println(" Kaafi")
            println(" 1: E kaafi ")
            println(" 2 : E Sahal ")

            var companys = readln().toInt()
            if (companys ==1){
                println(" fadlan geli number qaataha")
                var numberkaqaataha = readln().toInt()
                println(" faldlan geli qaataha magaciisa o seddesxan")
                var username = readln()
                println("  $ $username telenphone $numberkaqaataha")
            }
            if (companys ==2){
                println(" fadlan geli number qaataha")
                var numberkaqaataha = readln().toInt()
                println(" faldlan geli qaataha magaciisa o seddesxan")
                var username = readln()
                println("  $ $username telenphone $numberkaqaataha")
            }

        }
        if (optionnumber8 == 2){
            println("Dibadsa")
            println(" fadlan geli number qaataha")
            var numberkaqaataha = readln().toInt()
            println(" faldlan geli qaataha magaciisa o seddesxan")
            var username = readln()
            println("  $ $username telenphone $numberkaqaataha")

        }

        if (optionnumber8 == 3){

            println(" Fadlan dooro shirkad")
            println(" 1: Pay to EV Plus TMT")
            println("2: TAAJ")
            println(" 3:  TaaajPay")
            println(" 4: New E_Taaaj")
            println(" 5: Taaj lips")

            var optionumber3 = readln().toInt()
            if (optionumber3 == 1){
                println(" fadlan geli number qaataha")
                var numberkaqaataha = readln().toInt()
                println(" fadlan geli lacagta ")
                var money = readln().toInt()
                println(" sorry try again")


            }

            if (optionumber3 == 2){
                println(" fadlan geli number qaataha")
                var numberkaqaataha = readln().toInt()
                println(" fadlan geli lacagta ")
                var money = readln().toInt()
                println(" sorry try again")


            }
            if (optionumber3 == 3){
                println(" fadlan geli number qaataha")
                var numberkaqaataha = readln().toInt()
                println(" fadlan geli lacagta ")
                var money = readln().toInt()
                println(" sorry try again")


            }

            if (optionumber3 == 4){
                println(" fadlan geli number qaataha")
                var numberkaqaataha = readln().toInt()
                println(" fadlan geli lacagta ")
                var money = readln().toInt()
                println(" sorry try again")

            }

            if (optionumber3 == 5){
                println(" fadlan geli number qaataha")
                var numberkaqaataha = readln().toInt()
                println(" fadlan geli lacagta ")
                var money = readln().toInt()
                println(" sorry try again")


            }


        }
        if (optionnumber8 == 4){
            println(" fadlan geli aqoonsiga  lacagdiraha")
            var informationUser = readln().toInt()
            println(" you information is $informationUser")
        }
    }


}