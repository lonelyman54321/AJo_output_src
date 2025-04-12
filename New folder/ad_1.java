/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ad
 */
public final class ad_1
implements n {
    public final /* synthetic */ dr0_0 a;

    public /* synthetic */ ad_1(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final void k(mu1_1 object, i$a object2) {
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        String string2 = "source";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "event");
        object = qd$e.$EnumSwitchMapping$0;
        int n3 = object2.ordinal();
        Object object4 = object[n3];
        n3 = 3;
        if (object4 == n3 && (object4 = (Object)((dr0_0)object3).w) != false && (n3 = (int)(Intrinsics.areEqual(object2 = ((h83_0)(object = ((dr0_0)object3).C)).getValue(), object3 = HD$c.a) ? 1 : 0)) == 0) {
            ((h83_0)object).setValue(object3);
        }
    }
}

