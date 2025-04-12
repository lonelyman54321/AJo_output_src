/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xD
 */
public final class xd_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ dr0_0 g;
    public final /* synthetic */ f23_0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ xd_0(LP1 lP1, Component component, int n3, uj0_2 uj0_22, xj0_0 xj0_02, dr0_0 dr0_02, f23_0 f23_02, int n4) {
        this.a = lP1;
        this.b = component;
        this.c = n3;
        this.d = uj0_22;
        this.e = "BRAND_THUMBNAIL";
        this.f = xj0_02;
        this.g = dr0_02;
        this.h = f23_02;
        this.i = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.d;
        Intrinsics.checkNotNullParameter(object, "$onItemClick");
        Intrinsics.checkNotNullParameter(this.e, "$key");
        object2 = this.f;
        Intrinsics.checkNotNullParameter(object2, "$sendImpression");
        dr0_0 dr0_02 = this.g;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        f23_0 f23_02 = this.h;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekViewModel");
        int n3 = Me3.b(this.i | 1);
        Object object4 = object;
        object4 = (uj0_2)object;
        Object object5 = object2;
        object5 = (xj0_0)object2;
        LP1 lP1 = this.a;
        Component component = this.b;
        int n4 = this.c;
        gd_0.a(lP1, component, n4, (uj0_2)object4, (xj0_0)object5, dr0_02, f23_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

