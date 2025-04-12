/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vd
 */
public final class vd_2
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ p83_0 b;

    public /* synthetic */ vd_2(dr0_0 dr0_02, p83_0 p83_02) {
        this.a = dr0_02;
        this.b = p83_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        object = (String)((dr0_0)object).M0.a.getValue();
        Object object2 = this.b;
        if (object2 != null) {
            int n3 = ((p83_0)object2).size();
            object2 = n3;
        } else {
            boolean bl2 = false;
            object2 = null;
        }
        object2 = String.valueOf(object2);
        Intrinsics.checkNotNullParameter(object, "searchTerm");
        Intrinsics.checkNotNullParameter(object2, "customMetric");
        c80 c802 = sq0_1.d;
        uq0_1 uq0_12 = new uq0_1((String)object, (String)object2, null);
        Ae3.d(c802, null, null, uq0_12, 3);
        return Unit.a;
    }
}

