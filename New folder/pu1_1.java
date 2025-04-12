/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PU1
 */
public final class pu1_1
extends Wv {
    public final int b;

    public pu1_1(N50 n50) {
        Intrinsics.checkNotNullParameter(n50, "tracker");
        super(n50);
        this.b = 7;
    }

    public final boolean c(EI3 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "workSpec");
        object = object.j.a;
        lV1 lV12 = lV1.CONNECTED;
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

    public final boolean e(Object object) {
        boolean bl2;
        block0: {
            boolean bl3;
            boolean bl4;
            object = (hv1_0)object;
            String string2 = "value";
            Intrinsics.checkNotNullParameter(object, string2);
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 26;
            bl2 = true;
            if (n3 >= n4 ? (n3 = (int)(((hv1_0)object).a ? 1 : 0)) == 0 || !(bl4 = ((hv1_0)object).b) : !(bl3 = ((hv1_0)object).a)) break block0;
            bl2 = false;
        }
        return bl2;
    }
}

