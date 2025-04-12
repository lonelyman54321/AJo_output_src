/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/*
 * Renamed from gO0
 */
public final class go0_2
implements ComponentFactory {
    public final Object create(ComponentContainer componentContainer) {
        return FirebaseSessionsRegistrar.b(componentContainer);
    }
}

