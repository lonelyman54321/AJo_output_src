/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/*
 * Renamed from FI2
 */
public final class fi2_0
implements ComponentFactory {
    public final /* synthetic */ Qualified a;

    public /* synthetic */ fi2_0(Qualified qualified) {
        this.a = qualified;
    }

    public final Object create(ComponentContainer componentContainer) {
        return RemoteConfigRegistrar.a(this.a, componentContainer);
    }
}

