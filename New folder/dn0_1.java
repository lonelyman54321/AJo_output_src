/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;

/*
 * Renamed from DN0
 */
public final class dn0_1
implements ComponentFactory {
    public final Object create(ComponentContainer componentContainer) {
        return FirebaseDynamicLinkRegistrar.a(componentContainer);
    }
}

