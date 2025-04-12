/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;

public final class Fd0
implements ComponentFactory {
    public final /* synthetic */ CrashlyticsRegistrar a;

    public /* synthetic */ Fd0(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.a = crashlyticsRegistrar;
    }

    public final Object create(ComponentContainer componentContainer) {
        return CrashlyticsRegistrar.a(this.a, componentContainer);
    }
}

