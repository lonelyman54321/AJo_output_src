/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Ou3
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ Ou3(String string2, ud_2 ud_22, LP1 lP1, vd_2 vd_22, int n3) {
        this.a = string2;
        this.b = ud_22;
        this.c = lP1;
        this.d = vd_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$query");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onQueryChanged");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$onSearchClicked");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (ud_2)object;
        Object object5 = object2;
        object5 = (vd_2)object2;
        LP1 lP1 = this.c;
        ov3.r(string2, (ud_2)object4, lP1, (vd_2)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

