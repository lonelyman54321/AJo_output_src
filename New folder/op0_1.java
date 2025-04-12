/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oP0
 */
public final class op0_1
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ op0_1(boolean bl2, dr0_0 dr0_02, int n3) {
        this.a = bl2;
        this.b = dr0_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.c | 1);
        pp0_1.c(this.a, dr0_02, (b30_0)object, n3);
        return Unit.a;
    }
}

