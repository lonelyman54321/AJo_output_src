/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;

/*
 * Renamed from j10
 */
public final class j10_0
implements Provider {
    public final /* synthetic */ String a;

    public /* synthetic */ j10_0(String string2) {
        this.a = string2;
    }

    public final Object get() {
        return ComponentDiscovery.a(this.a);
    }
}

