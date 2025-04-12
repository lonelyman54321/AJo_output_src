/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lc0
 */
public final class lc0_1
implements e62_0 {
    public final /* synthetic */ kc0_2 a;
    public final /* synthetic */ wc0_1 b;

    public lc0_1(kc0_2 kc0_22, wc0_1 wc0_12) {
        this.a = kc0_22;
        this.b = wc0_12;
    }

    public final void a(yr0_2 yr0_22) {
        Intrinsics.checkNotNullParameter(yr0_22, "d");
        this.a.c.b(yr0_22);
    }

    public final void b(Object object) {
        ((Number)object).longValue();
        object = this.a;
        long l2 = ((kc0_2)object).d;
        int n3 = 1000;
        long l3 = n3;
        ((kc0_2)object).d = l2 -= l3;
        String string2 = k7.l(l2);
        Object object2 = this.b;
        object2.getClass();
        String string3 = "timerValue";
        Intrinsics.checkNotNullParameter(string2, string3);
        object2 = ((wc0_1)object2).j;
        object2.setText((CharSequence)string2);
        l3 = ((kc0_2)object).d;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 <= 0) {
            l7 = 8;
            object2.setVisibility((int)l7);
        } else {
            l7 = 0;
            object = null;
            object2.setVisibility(0);
        }
    }

    public final void onComplete() {
    }

    public final void onError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "e");
    }
}

