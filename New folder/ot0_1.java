/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ot0
 */
public final class ot0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ot0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int bl2 = this.a;
        switch (bl2) {
            default: {
                object = (mv_2)object;
                Intrinsics.checkNotNullParameter(object, "$this$createClientPlugin");
                boolean bl3 = ((ya1_1)((mv_2)object).b).a;
                dz2_1 dz2_12 = dz2_1.a;
                Za1$b za1$b = new Za1$b(bl3, (mv_2)object, null);
                ((mv_2)object).a(dz2_12, za1$b);
                return Unit.a;
            }
            case 0: 
        }
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$clearAndSetSemantics");
        RY2.d((UY2)object);
        return Unit.a;
    }
}

