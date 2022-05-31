package spellchecker.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Text extends CheckableText {
  private ArrayList<String> parts;

  // constructor
  public Text(String text) {
    this.text = text;
    // split the text into individual words to be tested
    this.parts = new ArrayList<String>(Arrays.asList(this.text.split(" ")));
  }

  @Override
  public boolean check(Database database) {
    System.out.println(this.text);

    // current word to check
    Word word;

    // iterate over all words to check
    for(String i : parts) {
      word = new Word(i);
      if(!word.check(database)) {
        return false;
      }
    }

    return true;
  }

  @Override
  public int length() {
    return this.text.length();
  }

}
