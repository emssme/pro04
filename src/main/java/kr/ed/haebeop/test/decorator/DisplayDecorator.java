package kr.ed.haebeop.test.decorator;

public abstract class DisplayDecorator extends Display{
    private final Display decoratorDisplay;

    public DisplayDecorator(Display decoratorDisplay){
        this.decoratorDisplay = decoratorDisplay;
    }

    public void draw(){
        decoratorDisplay.draw();
    }
}
