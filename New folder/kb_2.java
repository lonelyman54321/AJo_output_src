/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kB
 */
public final class kb_2
implements Function2 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ kb_2(ft1_2 ft1_22, Component component, dr0_0 dr0_02, ac_1 ac_12, rc_2 rc_22, sc_1 sc_12, int n3) {
        this.a = ft1_22;
        this.b = component;
        this.c = dr0_02;
        this.d = ac_12;
        this.e = rc_22;
        this.f = sc_12;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        ft1_2 ft1_22 = this.a;
        Intrinsics.checkNotNullParameter(ft1_22, "$listState");
        Component component = this.b;
        Intrinsics.checkNotNullParameter(component, "$component");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        object = this.d;
        Intrinsics.checkNotNullParameter(object, "$onFollowClick");
        object2 = this.e;
        Intrinsics.checkNotNullParameter(object2, "$onBackClicked");
        Object object4 = this.f;
        Intrinsics.checkNotNullParameter(object4, "$onShareClicked");
        int n3 = Me3.b(this.g | 1);
        object = (ac_1)object;
        Object object5 = object2;
        object5 = (rc_2)object2;
        Function0 function0 = object4;
        function0 = (sc_1)object4;
        object4 = object;
        lB.b(ft1_22, component, dr0_02, (ac_1)object, (rc_2)object5, (sc_1)function0, (b30_0)object3, n3);
        return Unit.a;
    }
}

