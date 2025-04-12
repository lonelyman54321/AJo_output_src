/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YA2
 */
public final class ya2_1
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ Subcomponent c;
    public final /* synthetic */ SubcomponentsOwner d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ dr0_0 l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    public /* synthetic */ ya2_1(boolean bl2, LP1 lP1, Subcomponent subcomponent, SubcomponentsOwner subcomponentsOwner, boolean bl3, boolean bl4, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function2 function22, dr0_0 dr0_02, Function0 function04, Function1 function1, int n3, int n4, int n7) {
        this.a = bl2;
        this.b = lP1;
        this.c = subcomponent;
        this.d = subcomponentsOwner;
        this.e = bl3;
        this.f = bl4;
        this.g = function0;
        this.h = function02;
        this.i = function03;
        this.j = function2;
        this.k = function22;
        this.l = dr0_02;
        this.m = function04;
        this.n = function1;
        this.o = n3;
        this.p = n4;
        this.q = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        Object object4 = this.g;
        Function0 function0 = object4;
        Intrinsics.checkNotNullParameter(object4, "$onFollowButtonClicked");
        object4 = this.h;
        Function0 function02 = object4;
        Intrinsics.checkNotNullParameter(object4, "$onShareClicked");
        object4 = this.i;
        Function0 function03 = object4;
        Intrinsics.checkNotNullParameter(object4, "$onLikeClicked");
        object4 = this.j;
        fx0_2 fx0_22 = object4;
        Intrinsics.checkNotNullParameter(object4, "$onBrandClicked");
        object4 = this.k;
        fx0_2 fx0_23 = object4;
        Intrinsics.checkNotNullParameter(object4, "$onItemWishlist");
        Object object5 = object4 = this.l;
        Intrinsics.checkNotNullParameter(object4, "$fleekViewModel");
        Object object6 = object4 = this.m;
        Intrinsics.checkNotNullParameter(object4, "$onViewAllClicked");
        Object object7 = object4 = this.n;
        Intrinsics.checkNotNullParameter(object4, "$sendProductImpressionDataMiniPLP");
        int n3 = Me3.b(this.o | 1);
        int n4 = Me3.b(this.p);
        boolean bl2 = this.a;
        object4 = this.b;
        Subcomponent subcomponent = this.c;
        SubcomponentsOwner subcomponentsOwner = this.d;
        boolean bl3 = this.e;
        boolean bl4 = this.f;
        boolean bl5 = bl2;
        int n7 = this.q;
        bl2 = bl5;
        ZA2.a(bl5, (LP1)object4, subcomponent, subcomponentsOwner, bl3, bl4, function0, function02, function03, (Function2)fx0_22, (Function2)fx0_23, (dr0_0)object5, (Function0)object6, (Function1)object7, (b30_0)object3, n3, n4, n7);
        return Unit.a;
    }
}

