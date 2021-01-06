class Main {
  public static void main(String[] args) {
    
    String _input[] = "leonardo da vinci".split(" ");
    String _reverseInput = "";

    for (int word = _input.length - 1; word >= 0; word--){
      _reverseInput += _input[word] + " ";
    }

    System.out.println(_reverseInput.substring(0, _reverseInput.length() - 1));
  }
}