/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zu3
 */
public final class zu3_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zu3_0(LP1 lP1, u10 u102, int n3) {
        this.a = lP1;
        this.b = u102;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$content");
        int n3 = Me3.b(this.c | 1);
        LP1 lP1 = this.a;
        object2 = (u10)object2;
        ov3.p(lP1, (u10)object2, (b30_0)object, n3);
        return Unit.a;
    }
}

