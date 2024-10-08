public class MethodSample {
  public static String checkString(String str){
      if(str.isEmpty()){
          return "The String is empty";
      }else{
          return "The string is not empty koko";
      }

  }

    public static void main(String[] args) {
        String name = "Ebube Koko ";
        String middlename = "";
        System.out.println(checkString(name));
        System.out.println(checkString(middlename));
    }
}
