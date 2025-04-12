/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gh0
 */
public final class gh0_2
implements Function2 {
    public final /* synthetic */ d a;
    public final /* synthetic */ int b;

    public /* synthetic */ gh0_2(d d2, int n3) {
        this.a = d2;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        object2 = d.Companion;
        d d2 = this.a;
        Intrinsics.checkNotNullParameter(d2, "$tmp0_rcvr");
        int n3 = Me3.b(this.b | 1);
        d2.Ra((b30_0)object, n3);
        return Unit.a;
    }
}

