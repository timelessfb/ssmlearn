package edu.uestc.spring.ioc;

public class CDPlayer {
    CompactDisc compactDisc;

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void callfun(){
        compactDisc.printName();
    }
}
