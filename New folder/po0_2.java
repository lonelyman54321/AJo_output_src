/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PO0
 */
public final class po0_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ po0_2(dr0_0 dr0_02, int n3, int n4) {
        this.a = n4;
        this.b = dr0_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.a;
        object = (b30_0)object;
        object2 = (Integer)object2;
        ((Integer)object2).intValue();
        switch (n3) {
            default: {
                dr0_0 dr0_02 = this.b;
                Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
                int n4 = Me3.b(this.c | 1);
                T61.c(dr0_02, (b30_0)object, n4);
                return Unit.a;
            }
            case 0: 
        }
        dr0_0 dr0_03 = this.b;
        Intrinsics.checkNotNullParameter(dr0_03, "$fleekViewModel");
        int n7 = Me3.b(this.c | 1);
        uo0_0.g(dr0_03, (b30_0)object, n7);
        return Unit.a;
    }
}

