/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UU1
 */
public final class uu1_1
extends Wv {
    public final int b;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    public uu1_1(N50 n50) {
        Intrinsics.checkNotNullParameter(n50, "tracker");
        super(n50);
        this.b = 7;
    }

    public final boolean c(EI3 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "workSpec");
        object = object.j.a;
        lV1 lV12 = lV1.METERED;
        if (object == lV12) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int d() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e(Object object) {
        object = (hv1_0)object;
        Object object2 = "value";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        boolean bl2 = false;
        if (n3 < n4) {
            object2 = qx1.a();
            object2.getClass();
            boolean bl3 = ((hv1_0)object).a;
            if (bl3) return bl2;
            return true;
        }
        n3 = (int)(((hv1_0)object).a ? 1 : 0);
        if (n3 == 0) return true;
        boolean bl4 = ((hv1_0)object).c;
        if (bl4) return bl2;
        return true;
    }
}

