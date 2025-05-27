package view;

public class TextView implements IViewComponent {
    private final String text;

    public TextView(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("TEXT COMPONENT: " + text);
    }
}