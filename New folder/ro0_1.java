/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RO0
 */
public final class ro0_1
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jD3 c;

    public /* synthetic */ ro0_1(jD3 jD32, int n3, int n4) {
        this.a = n4;
        this.c = jD32;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.a;
        object = (b30_0)object;
        object2 = (Integer)object2;
        ((Integer)object2).intValue();
        switch (n3) {
            default: {
                bf1_2 bf1_22 = (bf1_2)this.c;
                Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
                int n4 = Me3.b(this.b | 1);
                sd1_0.a(bf1_22, (b30_0)object, n4);
                return Unit.a;
            }
            case 0: 
        }
        dr0_0 dr0_02 = (dr0_0)this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n7 = Me3.b(this.b | 1);
        uo0_0.a(dr0_02, (b30_0)object, n7);
        return Unit.a;
    }
}

