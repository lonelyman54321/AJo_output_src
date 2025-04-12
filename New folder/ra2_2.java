/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rA2
 */
public final class ra2_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ dr0_0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ ra2_2(String string2, List list, boolean bl2, Function1 function1, Function2 function2, Function2 function22, Function1 function12, dr0_0 dr0_02, int n3) {
        this.a = string2;
        this.b = list;
        this.c = bl2;
        this.d = function1;
        this.e = function2;
        this.f = function22;
        this.g = function12;
        this.h = dr0_02;
        this.i = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Function1 function1 = this.d;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        Function2 function2 = this.e;
        Intrinsics.checkNotNullParameter(function2, "$onViewAllClick");
        Function2 function22 = this.f;
        Intrinsics.checkNotNullParameter(function22, "$onItemWishlist");
        Function1 function12 = this.g;
        Intrinsics.checkNotNullParameter(function12, "$sendProductImpressionDataMiniPLP");
        dr0_0 dr0_02 = this.h;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.i | 1);
        List list = this.b;
        boolean bl2 = this.c;
        xA2.b(this.a, list, bl2, function1, function2, function22, function12, dr0_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

