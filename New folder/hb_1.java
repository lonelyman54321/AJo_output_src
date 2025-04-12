/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HB
 */
public final class hb_1
implements Function2 {
    public final /* synthetic */ ud_1 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ p83_0 e;
    public final /* synthetic */ Component f;
    public final /* synthetic */ f23_0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ hb_1(uD$e uD$e, dr0_0 dr0_02, yT1 yT12, String string2, p83_0 p83_02, Component component, f23_0 f23_02, int n3) {
        this.a = uD$e;
        this.b = dr0_02;
        this.c = yT12;
        this.d = string2;
        this.e = p83_02;
        this.f = component;
        this.g = f23_02;
        this.h = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$state");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.c;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        f23_0 f23_02 = this.g;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekViewModel");
        int n3 = Me3.b(this.h | 1);
        Component component = this.f;
        Object object4 = object;
        object4 = (uD$e)object;
        String string2 = this.d;
        p83_0 p83_02 = this.e;
        WB.b((uD$e)object4, dr0_02, yT12, string2, p83_02, component, f23_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

