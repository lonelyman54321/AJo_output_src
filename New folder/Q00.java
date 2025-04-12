/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class Q00
implements ComponentFactory {
    public final /* synthetic */ Object a;

    public /* synthetic */ Q00(Object object) {
        this.a = object;
    }

    public final Object create(ComponentContainer componentContainer) {
        return Component.c(this.a, componentContainer);
    }
}

