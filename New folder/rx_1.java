/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rx
 */
public final class rx_1
implements ic1_1 {
    public final ic1_1 a;

    public rx_1(z42 z422) {
        Intrinsics.checkNotNullParameter(z422, "iBitmapDownloadRequestHandler");
        this.a = z422;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final rs0_1 a(ox_0 object) {
        long l2;
        long l3;
        long l4;
        long l7;
        String string2 = "bitmapDownloadRequest";
        Intrinsics.checkNotNullParameter(object, string2);
        b.j();
        boolean bl2 = ((ox_0)object).b;
        Object object2 = ((ox_0)object).d;
        if (object2 != null && (l7 = (l4 = (l3 = ((ox_0)object).e) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            rs0_1 rs0_12;
            block9: {
                boolean bl4;
                block8: {
                    object2 = jh_1.a((CleverTapInstanceConfig)object2).a();
                    Intrinsics.checkNotNullExpressionValue(object2, "executors(instanceConfig).ioTask()");
                    Object object3 = new qx_0(this, (ox_0)object);
                    object2 = ((a)object2).c;
                    boolean bl3 = object2 instanceof ExecutorService;
                    if (!bl3) {
                        object = new UnsupportedOperationException("Can't use this method without ExecutorService, Use Execute alternatively ");
                        throw object;
                    }
                    bl3 = false;
                    rs0_12 = null;
                    try {
                        object2 = (ExecutorService)object2;
                        object2 = object2.submit(object3);
                    }
                    catch (Exception exception) {
                        object2 = null;
                        break block8;
                    }
                    try {
                        object3 = TimeUnit.MILLISECONDS;
                        rs0_12 = object2.get(l3, (TimeUnit)((Object)object3));
                        break block9;
                    }
                    catch (Exception exception) {}
                }
                if (object2 != null && !(bl4 = object2.isCancelled())) {
                    bl4 = true;
                    object2.cancel(bl4);
                }
                b.j();
            }
            rs0_12 = rs0_12;
            if (rs0_12 == null) {
                rs0$a_0 rs0$a_0 = rs0$a_0.DOWNLOAD_FAILED;
                object2 = "status";
                Intrinsics.checkNotNullParameter((Object)rs0$a_0, (String)object2);
                long l8 = -1;
                rs0_12 = new rs0_1(null, rs0$a_0, l8, null);
            }
            object = ((ox_0)object).c;
            object = yz3_0.f(bl2, (Context)object, rs0_12);
            Intrinsics.checkNotNullExpressionValue(object, "getDownloadedBitmapPostF\u2026ontext, downloadedBitmap)");
            return object;
        }
        b.j();
        b.j();
        return this.a.a((ox_0)object);
    }
}

