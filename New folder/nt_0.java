/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nt
 */
public final class nt_0
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ nt_0(ob0_1 ob0_12, String string2, boolean bl2, int n3, int n4) {
        this.a = ob0_12;
        this.b = string2;
        this.c = bl2;
        this.d = n3;
        this.e = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        String string2 = this.b;
        boolean bl2 = this.c;
        int n4 = this.e;
        qt_0.j(ob0_12, string2, bl2, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

