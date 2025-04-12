/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fe2
 */
public final class fe2_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = this.b;
                Intrinsics.checkNotNullParameter(object, "$imageModel");
                return object;
            }
            case 0: 
        }
        qz1_2 qz1_22 = (qz1_2)this.b;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Object object = Boolean.TRUE;
        qz1_22.T.setValue(object);
        object = md3_0.c(qz1_22);
        xz1_2 xz1_22 = new xz1_2(qz1_22, null);
        Ae3.d((i90_0)object, null, null, xz1_22, 3);
        return Unit.a;
    }
}

