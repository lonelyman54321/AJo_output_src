/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 */
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gV1
 */
public final class gv1_0
implements w50 {
    public final ConnectivityManager a;
    public final long b;

    public gv1_0(ConnectivityManager connectivityManager) {
        long l2 = OH3.a;
        Intrinsics.checkNotNullParameter(connectivityManager, "connManager");
        this.a = connectivityManager;
        this.b = l2;
    }

    public final boolean a(EI3 object) {
        String string2 = "workSpec";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.c((EI3)object);
        if (!bl2) {
            return false;
        }
        object = new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        throw object;
    }

    public final zj_2 b(b60 b602) {
        Intrinsics.checkNotNullParameter(b602, "constraints");
        fv1_1 fv1_12 = new fv1_1(b602, this, null);
        return ms0_1.d(fv1_12);
    }

    public final boolean c(EI3 eI3) {
        boolean bl2;
        String string2 = "workSpec";
        Intrinsics.checkNotNullParameter(eI3, string2);
        eI3 = eI3.j.d();
        if (eI3 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            eI3 = null;
        }
        return bl2;
    }
}

