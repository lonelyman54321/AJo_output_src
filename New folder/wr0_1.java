/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 */
import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wr0
 */
public final class wr0_1
implements L63 {
    public final Context b;

    public wr0_1(Context context) {
        this.b = context;
    }

    public final boolean equals(Object object) {
        Context context;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof wr0_1;
        if (!bl4 || !(bl2 = Intrinsics.areEqual(context = this.b, object = ((wr0_1)object).b))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Object j(pe2_0 object) {
        object = this.b.getResources().getDisplayMetrics();
        int n3 = ((DisplayMetrics)object).widthPixels;
        int n4 = ((DisplayMetrics)object).heightPixels;
        n4 = Math.max(n3, n4);
        wq0$a wq0$a = new wq0$a(n4);
        object = new B63(wq0$a, wq0$a);
        return object;
    }
}

