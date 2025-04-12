/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final class q10
implements Provider {
    public final /* synthetic */ ComponentRuntime a;
    public final /* synthetic */ Component b;

    public /* synthetic */ q10(ComponentRuntime componentRuntime, Component component) {
        this.a = componentRuntime;
        this.b = component;
    }

    public final Object get() {
        ComponentRuntime componentRuntime = this.a;
        Component component = this.b;
        return ComponentRuntime.a(componentRuntime, component);
    }
}

