/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.tracing.ComponentMonitor;

public final class l10
implements ComponentFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ Component b;

    public /* synthetic */ l10(String string2, Component component) {
        this.a = string2;
        this.b = component;
    }

    public final Object create(ComponentContainer componentContainer) {
        String string2 = this.a;
        Component component = this.b;
        return ComponentMonitor.a(string2, component, componentContainer);
    }
}

