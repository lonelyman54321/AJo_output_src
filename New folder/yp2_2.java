/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YP2
 */
public final class yp2_2 {
    public final LinkedHashSet a;

    public yp2_2() {
        LinkedHashSet linkedHashSet;
        this.a = linkedHashSet = new LinkedHashSet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(wp2_2 wp2_22) {
        synchronized (this) {
            Object object = "route";
            Intrinsics.checkNotNullParameter(wp2_22, (String)object);
            object = this.a;
            object.remove(wp2_22);
            return;
        }
    }
}

