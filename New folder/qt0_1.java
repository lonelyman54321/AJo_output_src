/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qt0
 */
public final class qt0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qt0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (mv_2)object;
                Intrinsics.checkNotNullParameter(object, "$this$createClientPlugin");
                zx_0 zx_02 = zx_0.a;
                hb1$a_0 hb1$a_0 = new hb1$a_0((mv_2)object, null);
                ((mv_2)object).a(zx_02, hb1$a_0);
                return Unit.a;
            }
            case 0: 
        }
        Intrinsics.checkNotNullParameter((UY2)object, "$this$semantics");
        return Unit.a;
    }
}

