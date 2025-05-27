package view;

import model.IModelObserver;
import model.ObservableModel;
import java.util.ArrayList;
import java.util.List;

public class CompositeView implements IViewComponent, IModelObserver {
    private final List<IViewComponent> components = new ArrayList<>();

    public void addComponent(IViewComponent component) {
        components.add(component);
    }

    @Override
    public void render() {
        System.out.println("=== COMPOSITE VIEW ===");
        components.forEach(IViewComponent::render);
    }

    @Override
    public void update(ObservableModel source) {
        System.out.println("[VIEW] Model updated! New data: " + source.getData());
        render();
    }
}