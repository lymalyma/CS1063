public class Poems {
  
  /*This is the main method which will print the first verse of "Mary had a little lamb" 
   * and the first three verses of the poem "This Old Man" */
  
  public static void main (String[] args) {
   System.out.println("Lab 1 written by Lymari Montijo");
   System.out.println();
   maryLittleLambFirstVerse();
   System.out.println();
   thisOldManThreeVerses(); 
  }

  public static void maryLittleLambFirstVerse () {
    System.out.println("\"Mary had a little lamb\"");
    System.out.println();
    maryHad();
    maryLittleLamb();
    maryHad();
    maryFleece();
    
  }
  
  //These are the 3 methods that will print out the four lines in the first verse of "Mary had a little lamb"
  
  public static void maryHad() {
   System.out.println("Mary had a little lamb,"); //This method is called twice to print out the first and the third line in the first verse
  }
   
  public static void maryLittleLamb() {
   System.out.println("Little lamb, little lamb,"); //This method prints the second line in the first verse
  }
  
  public static void maryFleece() {
   System.out.println("Its fleece was white as snow"); //This method prints the fourth line in the first verse
  }
  
  //this is the method that will print out the first three verses of "This Old Man"
  public static void thisOldManThreeVerses () {
    System.out.println("\"This Old Man\""); 
    System.out.println();
    oldManFirstVerse();
    System.out.println();
    oldManSecondVerse();
    System.out.println();
    oldManThirdVerse();
  }
  
  //The following three methods print out the first three verses and each of them calls the refrain() method to avoid redundancy
  
  public static void refrain() { // This is the method that will print out the refrain of "This Old Man"
    System.out.println("With a knick-knack patty-whack, give a dog a bone\nThis old man came rolling home");
  }
  public static void oldManFirstVerse() { //This method prints the first verse.
    System.out.println("This old man, he played one \nHe played knick-knack on my thumb");
    refrain();
  }
  public static void oldManSecondVerse() { //This method prints out the second verse. 
   System.out.println("This old man, he played two\nHe played knick-knack on my shoe");
   refrain();
  }
  public static void oldManThirdVerse() { //This method prints the third verse. 
    System.out.println("This old man, he played three\nHe played knick-knack on my knee");
    refrain();
  }
  
  
  
  

}