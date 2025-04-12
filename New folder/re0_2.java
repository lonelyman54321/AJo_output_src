/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;

/*
 * Renamed from rE0
 */
public final class re0_2
implements ComponentFactory {
    public final Object create(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.a(componentContainer);
    }
}

