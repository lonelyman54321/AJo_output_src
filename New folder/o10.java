/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final class o10
implements Provider {
    public final /* synthetic */ ComponentRegistrar a;

    public /* synthetic */ o10(ComponentRegistrar componentRegistrar) {
        this.a = componentRegistrar;
    }

    public final Object get() {
        return ComponentRuntime.c(this.a);
    }
}

