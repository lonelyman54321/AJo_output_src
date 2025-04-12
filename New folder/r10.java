/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime$Builder;
import com.google.firebase.inject.Provider;

public final class r10
implements Provider {
    public final /* synthetic */ ComponentRegistrar a;

    public /* synthetic */ r10(ComponentRegistrar componentRegistrar) {
        this.a = componentRegistrar;
    }

    public final Object get() {
        return ComponentRuntime$Builder.a(this.a);
    }
}

