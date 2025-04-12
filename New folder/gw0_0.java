/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gw0
 */
public final class gw0_0
implements lp0 {
    public final Function1 a;
    public final L50 b;

    public gw0_0() {
        throw null;
    }

    public gw0_0(pa_0 pa_02) {
        L50 l50;
        super(null);
        pa_02.invoke(l50);
        this.b = l50;
    }

    public final /* synthetic */ boolean a(List list) {
        return true;
    }

    public final /* synthetic */ void b(eb3_2 eb3_22, List list) {
        kp0.a(this, eb3_22, list);
    }

    public final void c(eb3_2 eb3_22) {
        L50 l50 = this.b;
        l50.getClass();
        K50$e k50$e = new K50$e();
        K50.h(l50.a, eb3_22, k50$e);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof gw0_0;
        if (bl2) {
            object = ((gw0_0)object).b;
            return Intrinsics.areEqual(this.b, object);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }
}

