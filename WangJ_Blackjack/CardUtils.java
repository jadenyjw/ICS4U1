public class CardUtils{

  static String cardToString(int n){

    char suite = 'x';
    String card = "";

    switch(n/13){
    case 0:
      suite = (char)'\u2666';
      break;
    case 1:
      suite = (char)'\u2663';
      break;
    case 2:
      suite = (char)'\u2764';
      break;
    case 3:
      suite = (char)'\u2660';
      break;
    }

    switch(n%13){
      
    case 0:
      card = "A";
      break;
    case 10:
      card = "J";
      break;
    case 11:
      card = "Q";
      break;
    case 12:
      card = "K";
      break;
    default:
      card = n%13 + "";
    }

    return (suite + "" + card);
  }

  static int getValue(int n){

    if(n % 13 >= 10 &&  n % 13 <= 13){
      return 10;
    }
    else{
      return n % 13 + 1;
    }

  }
}
