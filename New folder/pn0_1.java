/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pN0
 */
public final class pn0_1
implements Function2 {
    public final /* synthetic */ la2_0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ pn0_1(la2_0 la2_02, id1_2 id1_22, p9_0 p9_02, ne2_2 ne2_22, int n3) {
        this.a = la2_02;
        this.b = id1_22;
        this.c = p9_02;
        this.d = ne2_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        la2_0 la2_02 = this.a;
        Intrinsics.checkNotNullParameter(la2_02, "$orderCommunicationPacketConfig");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onCloseButtonClicked");
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$onCtaButtonClicked");
        Object object4 = this.d;
        Intrinsics.checkNotNullParameter(object4, "$onOutsideClicked");
        int n3 = Me3.b(this.e | 1);
        object = (id1_2)object;
        Object object5 = object2;
        object5 = (p9_0)object2;
        Function0 function0 = object4;
        function0 = (ne2_2)object4;
        object4 = object;
        sn0_1.a(la2_02, (id1_2)object, (p9_0)object5, (ne2_2)function0, (b30_0)object3, n3);
        return Unit.a;
    }
}

