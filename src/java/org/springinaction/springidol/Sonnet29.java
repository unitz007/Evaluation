package org.springinaction.springidol;

public class Sonnet29 implements Poem {

    private static final String[] LINES = {
        "huhbhh", 
        "jjjjoiooi", "jnrjjjjjo", "jrjnjjj"
    };
    
    public Sonnet29() {
    }
    
    public void recite() {
        for(int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
