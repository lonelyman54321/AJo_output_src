/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

/*
 * Renamed from Rn0
 */
public final class rn0_1
implements ComponentFactory {
    public final Object create(ComponentContainer componentContainer) {
        return DefaultUserAgentPublisher.a(componentContainer);
    }
}

