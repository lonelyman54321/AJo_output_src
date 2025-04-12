/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.perf.FirebasePerfRegistrar;

/*
 * Renamed from SN0
 */
public final class sn0_0
implements ComponentFactory {
    public final /* synthetic */ Qualified a;

    public /* synthetic */ sn0_0(Qualified qualified) {
        this.a = qualified;
    }

    public final Object create(ComponentContainer componentContainer) {
        return FirebasePerfRegistrar.b(this.a, componentContainer);
    }
}

