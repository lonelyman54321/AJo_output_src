/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AJ0
 */
public final class aj0_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Subcomponent d;
    public final /* synthetic */ SubcomponentsOwner e;
    public final /* synthetic */ BaseValue f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ gx0_2 k;
    public final /* synthetic */ ft1_2 l;
    public final /* synthetic */ p83_0 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    public /* synthetic */ aj0_2(LP1 lP1, boolean bl2, boolean bl3, Subcomponent subcomponent, SubcomponentsOwner subcomponentsOwner, BaseValue baseValue, boolean bl4, Function0 function0, Function0 function02, Function0 function03, gx0_2 gx0_22, ft1_2 ft1_22, p83_0 p83_02, int n3, Function1 function1, Function2 function2, int n4, int n7, int n8) {
        this.a = lP1;
        this.b = bl2;
        this.c = bl3;
        this.d = subcomponent;
        this.e = subcomponentsOwner;
        this.f = baseValue;
        this.g = bl4;
        this.h = function0;
        this.i = function02;
        this.j = function03;
        this.k = gx0_22;
        this.l = ft1_22;
        this.m = p83_02;
        this.n = n3;
        this.o = function1;
        this.p = function2;
        this.q = n4;
        this.r = n7;
        this.s = n8;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        ((Integer)object2).intValue();
        Object object5 = this.h;
        Function0 function0 = object5;
        Intrinsics.checkNotNullParameter(object5, "$onFollowButtonClicked");
        object5 = this.i;
        Function0 function02 = object5;
        Intrinsics.checkNotNullParameter(object5, "$onShareClicked");
        object5 = this.j;
        Function0 function03 = object5;
        Intrinsics.checkNotNullParameter(object5, "$onLikeClicked");
        object5 = this.k;
        fx0_2 fx0_22 = object5;
        Intrinsics.checkNotNullParameter(object5, "$onBrandClicked");
        Object object6 = object5 = this.l;
        Intrinsics.checkNotNullParameter(object5, "$listState");
        Object object7 = object5 = this.m;
        Intrinsics.checkNotNullParameter(object5, "$components");
        Object object8 = object5 = this.o;
        Intrinsics.checkNotNullParameter(object5, "$onItemClicked");
        object5 = this.p;
        Intrinsics.checkNotNullParameter(object5, "$sendImpression");
        int n3 = Me3.b(this.q | 1);
        int n4 = Me3.b(this.r);
        object4 = this.a;
        boolean bl2 = this.b;
        boolean bl3 = this.c;
        Subcomponent subcomponent = this.d;
        SubcomponentsOwner subcomponentsOwner = this.e;
        BaseValue baseValue = this.f;
        boolean bl4 = this.g;
        int n7 = this.n;
        object = object4;
        int n8 = this.s;
        bj0_0.a((LP1)object4, bl2, bl3, subcomponent, subcomponentsOwner, baseValue, bl4, function0, function02, function03, (gx0_2)fx0_22, (ft1_2)object6, (p83_0)object7, n7, (Function1)object8, (Function2)object5, (b30_0)object3, n3, n4, n8);
        return Unit.a;
    }
}

