/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jd
 */
public final class jd_2
implements Function2 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i d;
    public final /* synthetic */ int e;

    public /* synthetic */ jd_2(yT1 yT12, dr0_0 dr0_02, String string2, i i3, int n3) {
        this.a = yT12;
        this.b = dr0_02;
        this.c = string2;
        this.d = i3;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        yT1 yT12 = this.a;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$uuid");
        i i3 = this.d;
        Intrinsics.checkNotNullParameter(i3, "$lifecycle");
        int n3 = Me3.b(this.e | 1);
        qd_0.a(yT12, dr0_02, string2, i3, (b30_0)object3, n3);
        return Unit.a;
    }
}

