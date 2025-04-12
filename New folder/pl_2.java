/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PL
 */
public final class pl_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Subcomponent b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ pl_2(LP1 lP1, Subcomponent subcomponent, Function1 function1, int n3) {
        this.a = lP1;
        this.b = subcomponent;
        this.c = function1;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        Subcomponent subcomponent = this.b;
        Intrinsics.checkNotNullParameter(subcomponent, "$cardDataList");
        Function1 function1 = this.c;
        Intrinsics.checkNotNullParameter(function1, "$onBannerClick");
        int n3 = Me3.b(this.d | 1);
        ql_2.a(lP1, subcomponent, function1, (b30_0)object, n3);
        return Unit.a;
    }
}

