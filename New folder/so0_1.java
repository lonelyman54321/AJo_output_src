/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SO0
 */
public final class so0_1
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ so0_1(dr0_0 dr0_02, int n3) {
        this.a = dr0_02;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.b | 1);
        uo0_0.b(dr0_02, (b30_0)object, n3);
        return Unit.a;
    }
}

