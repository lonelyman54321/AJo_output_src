/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tV1
 */
public final class tv1_1
extends Wv {
    public final int b;

    public tv1_1(N50 n50) {
        Intrinsics.checkNotNullParameter(n50, "tracker");
        super(n50);
        this.b = 7;
    }

    public final boolean c(EI3 object) {
        boolean bl2;
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "workSpec");
        object = object.j.a;
        lV1 lV12 = lV1.UNMETERED;
        if (object != lV12 && ((n4 = Build.VERSION.SDK_INT) < (n3 = 30) || object != (lV12 = lV1.TEMPORARILY_UNMETERED))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e(Object object) {
        boolean bl2;
        object = (hv1_0)object;
        String string2 = "value";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl3 = ((hv1_0)object).a;
        if (bl3 && !(bl2 = ((hv1_0)object).c)) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

