/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 */
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iV1
 */
public final class iv1_1
extends N50 {
    public final ConnectivityManager f;
    public final iV1$a g;

    public iv1_1(Context object, Si3 si3) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(si3, "taskExecutor");
        super((Context)object, si3);
        object = this.b.getSystemService("connectivity");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.net.ConnectivityManager");
        object = (ConnectivityManager)object;
        this.f = object;
        super(this);
        this.g = object;
    }

    public final Object a() {
        return jV1.a(this.f);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        qx1 qx12;
        try {
            qx12 = qx1.a();
        }
        catch (SecurityException securityException) {
            qx12 = qx1.a();
            qx12.getClass();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            qx12 = qx1.a();
            qx12.getClass();
            return;
        }
        {
            qx12.getClass();
            qx12 = this.f;
            iV1$a iV1$a = this.g;
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(qx12, string2);
            string2 = "networkCallback";
            Intrinsics.checkNotNullParameter((Object)iV1$a, string2);
            MU1.a((ConnectivityManager)qx12, iV1$a);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        qx1 qx12;
        try {
            qx12 = qx1.a();
        }
        catch (SecurityException securityException) {
            qx12 = qx1.a();
            qx12.getClass();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            qx12 = qx1.a();
            qx12.getClass();
            return;
        }
        {
            qx12.getClass();
            qx12 = this.f;
            iV1$a iV1$a = this.g;
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(qx12, string2);
            string2 = "networkCallback";
            Intrinsics.checkNotNullParameter((Object)iV1$a, string2);
            qx12.unregisterNetworkCallback(iV1$a);
            return;
        }
    }
}

