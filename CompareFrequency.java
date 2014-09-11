package twitterassignment; /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class CompareFrequency implements Comparable<CompareFrequency> {
     
    public CompareFrequency(String word, int freq) {
        super();
        this.word = word;
        this.frequency = freq;
    }
     
    public String getWord() {
        return word;
    }
    public int getFrequency() {
        return frequency;
    }
    
    @Override
    public String toString() {
        return "KeyValue [word=" + word + ", freq=" + frequency + "]";
    }
    
    @Override
    public int compareTo(CompareFrequency arg0) {
        if (this.frequency>arg0.getFrequency()) return 1;
        else if (this.frequency<arg0.getFrequency()) return -1;
        else return 0;
    }
    private String word;
    private int frequency;
}
