/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VJ0
 */
public final class vj0_1
implements Function1 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dr0_0 d;

    public /* synthetic */ vj0_1(c80 c802, Component component, int n3, dr0_0 dr0_02) {
        this.a = c802;
        this.b = component;
        this.c = n3;
        this.d = dr0_02;
    }

    public final Object invoke(Object object) {
        int n3 = (Integer)object;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$scope");
        dr0_0 dr0_02 = this.d;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        em0_2 em0_22 = em0_2.b;
        Component component = this.b;
        int n4 = this.c;
        ck0_2 ck0_22 = new ck0_2(component, n3, n4, dr0_02, null);
        Ae3.d((i90_0)object, em0_22, null, ck0_22, 2);
        return Unit.a;
    }
}

