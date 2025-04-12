/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IP
 */
public final class ip_0
implements Function0 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ Subcomponent c;
    public final /* synthetic */ Cl2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ip_0(c80 c802, Component component, Subcomponent subcomponent, hm0_0 hm0_02, int n3) {
        this.a = c802;
        this.b = component;
        this.c = subcomponent;
        this.d = hm0_02;
        this.e = n3;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$coroutineScope");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$component");
        Cl2 cl2 = this.d;
        Intrinsics.checkNotNullParameter(cl2, "$pagerState");
        int n3 = this.e;
        cl2 = (hm0_0)cl2;
        Object object3 = new jp_1((hm0_0)cl2, n3, null);
        int n4 = 3;
        Ae3.d((i90_0)object, null, null, (Function2)object3, n4);
        object = pp0_0.a;
        object = ((Component)object2).getHeading();
        object3 = " - click";
        object = cP.a("category menu - ", (String)object, (String)object3);
        object2 = this.c;
        object2 = object2 != null ? ((Subcomponent)object2).getHeading() : null;
        object2 = String.valueOf(object2);
        Intrinsics.checkNotNullParameter(object, "action");
        Intrinsics.checkNotNullParameter(object2, "label");
        object3 = new ip0_2((String)object, (String)object2, null);
        Ae3.d(pp0_0.b, null, null, (Function2)object3, n4);
        return Unit.a;
    }
}

