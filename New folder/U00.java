/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class U00
implements ComponentFactory {
    public final /* synthetic */ Object a;

    public /* synthetic */ U00(Object object) {
        this.a = object;
    }

    public final Object create(ComponentContainer componentContainer) {
        return Component.a(this.a, componentContainer);
    }
}

