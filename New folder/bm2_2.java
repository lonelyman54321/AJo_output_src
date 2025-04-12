/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bM2
 */
public final class bm2_2
implements Function2 {
    public final /* synthetic */ aM2$d a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ bm2_2(aM2$d aM2$d, sz_1 sz_12, ql2_1 ql2_12, nj0_1 nj0_12, int n3) {
        this.a = aM2$d;
        this.b = sz_12;
        this.c = ql2_12;
        this.d = nj0_12;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        aM2$d aM2$d = this.a;
        Intrinsics.checkNotNullParameter(aM2$d, "$data");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onStyleClicked");
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$onRetake");
        Object object4 = this.d;
        Intrinsics.checkNotNullParameter(object4, "$onFindMatching");
        int n3 = Me3.b(this.e | 1);
        object = (sz_1)object;
        Object object5 = object2;
        object5 = (ql2_1)object2;
        Function0 function0 = object4;
        function0 = (nj0_1)object4;
        object4 = object;
        tm2_1.a(aM2$d, (sz_1)object, (ql2_1)object5, (nj0_1)function0, (b30_0)object3, n3);
        return Unit.a;
    }
}

