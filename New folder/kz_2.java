/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KZ
 */
public final class kz_2
implements Function1 {
    public final /* synthetic */ oz_2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ kz_2(oz_2 oz_22, int n3) {
        this.a = oz_22;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        oz_2 oz_22 = this.a;
        Intrinsics.checkNotNullParameter(oz_22, "this$0");
        int n3 = this.b;
        oz_22.f(null, n3);
        return Unit.a;
    }
}

