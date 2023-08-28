/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */
function timeConversion(s) {

    const hora = s.substr(0, 8).split(':')
    const meridian = s.substr(8, 2)

    if (meridian == 'PM' && hora[0] != '12') {
        hora[0] = Number(hora[0]) + Number(12)
    }
    if (meridian == 'AM') {
        hora[0] = (hora[0] == '12') ? '00' : hora[0]
    }

    console.log(hora.join(':'))

}

timeConversion('12:45:54PM')