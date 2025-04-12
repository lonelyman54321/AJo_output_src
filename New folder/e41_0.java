/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from e41
 */
public final class e41_0
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ e41_0(Function0 function0, boolean bl2, int n3, int n4) {
        this.a = function0;
        this.b = bl2;
        this.c = n3;
        this.d = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onAllReviewsClicked");
        int n3 = Me3.b(this.c | 1);
        boolean bl2 = this.b;
        int n4 = this.d;
        f41_0.a(function0, bl2, (b30_0)object, n3, n4);
        return Unit.a;
    }
}

