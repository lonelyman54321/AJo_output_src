/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.datatransport.TransportRegistrar;

/*
 * Renamed from Wr3
 */
public final class wr3_0
implements ComponentFactory {
    public final Object create(ComponentContainer componentContainer) {
        return TransportRegistrar.a(componentContainer);
    }
}

