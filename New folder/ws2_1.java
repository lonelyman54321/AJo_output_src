/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wS2
 */
public final class ws2_1
implements n {
    public final /* synthetic */ xs2_1 a;

    public /* synthetic */ ws2_1(xs2_1 xs2_12) {
        this.a = xs2_12;
    }

    public final void k(mu1_1 object, i$a i$a) {
        xs2_1 xs2_12 = this.a;
        Intrinsics.checkNotNullParameter(xs2_12, "this$0");
        String string2 = "<anonymous parameter 0>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        object = i$a.ON_START;
        if (i$a == object) {
            boolean bl2;
            xs2_12.f = bl2 = true;
        } else {
            object = i$a.ON_STOP;
            if (i$a == object) {
                boolean bl3 = false;
                object = null;
                xs2_12.f = false;
            }
        }
    }
}

