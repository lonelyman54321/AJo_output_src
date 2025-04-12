/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BP
 */
public final class bp_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ bp_0(LP1 lP1, String string2, long l2, long l3, int n3, int n4) {
        this.a = lP1;
        this.b = string2;
        this.c = l2;
        this.d = l3;
        this.e = n3;
        this.f = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$title");
        int n3 = Me3.b(this.f | 1);
        long l2 = this.d;
        int n4 = this.e;
        long l3 = this.c;
        np_0.f(lP1, string2, l3, l2, n4, (b30_0)object3, n3);
        return Unit.a;
    }
}

