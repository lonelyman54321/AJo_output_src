/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fh0
 */
public final class fh0_2
implements Function2 {
    public final /* synthetic */ d a;
    public final /* synthetic */ lt1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ fh0_2(d d2, lt1 lt12, int n3, int n4) {
        this.a = d2;
        this.b = lt12;
        this.c = n3;
        this.d = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        object2 = com.ril.ajio.pdprefresh.fragments.d.Companion;
        d d2 = this.a;
        Intrinsics.checkNotNullParameter(d2, "$tmp0_rcvr");
        lt1 lt12 = this.b;
        Intrinsics.checkNotNullParameter(lt12, "$review");
        int n3 = Me3.b(this.d | 1);
        int n4 = this.c;
        d2.Qa(lt12, n4, (b30_0)object, n3);
        return Unit.a;
    }
}

