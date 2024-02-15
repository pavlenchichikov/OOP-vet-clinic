package Core.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable <Component>{
    private List<Component> components = new ArrayList<>();
    private int index = 0;
    public void addComponents(Component ... components) {
        for (Component component : components) {
            this.components.add(component);
        }
    }

    //@Override
    //public boolean hasNext() {
      //  return index < components.size();
    //}

    //@Override
    //public Component next() {
        //return components.get(index++);
    //}

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }
}

