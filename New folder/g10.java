/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

public final class g10 {
    public static Object a(ComponentContainer object, Qualified qualified) {
        if ((object = object.getProvider(qualified)) == null) {
            return null;
        }
        return object.get();
    }

    public static Object b(ComponentContainer componentContainer, Class object) {
        object = Qualified.unqualified((Class)object);
        return componentContainer.get((Qualified)object);
    }

    public static Deferred c(ComponentContainer componentContainer, Class object) {
        object = Qualified.unqualified((Class)object);
        return componentContainer.getDeferred((Qualified)object);
    }

    public static Provider d(ComponentContainer componentContainer, Class object) {
        object = Qualified.unqualified((Class)object);
        return componentContainer.getProvider((Qualified)object);
    }

    public static Set e(ComponentContainer componentContainer, Qualified qualified) {
        return (Set)componentContainer.setOfProvider(qualified).get();
    }

    public static Set f(ComponentContainer componentContainer, Class object) {
        object = Qualified.unqualified((Class)object);
        return componentContainer.setOf((Qualified)object);
    }

    public static Provider g(ComponentContainer componentContainer, Class object) {
        object = Qualified.unqualified((Class)object);
        return componentContainer.setOfProvider((Qualified)object);
    }
}

