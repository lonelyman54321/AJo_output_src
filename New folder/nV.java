/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.a;
import java.util.concurrent.Callable;

public final class nV
implements Callable {
    public final /* synthetic */ a a;
    public final /* synthetic */ ec1_1 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ Context d;

    public /* synthetic */ nV(a a2, uj3_1 uj3_12, Bundle bundle, Context context) {
        this.a = a2;
        this.b = uj3_12;
        this.c = bundle;
        this.d = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object = this.a;
        Object object2 = this.b;
        Bundle bundle = this.c;
        Context context = this.d;
        Object object3 = ((a)object).b.p.l;
        synchronized (object3) {
            Throwable throwable2;
            block5: {
                block4: {
                    int n3;
                    block3: {
                        try {
                            Object object4 = ((a)object).b;
                            object4 = ((H80)object4).p;
                            ((hC2)object4).i = object2;
                            if (bundle == null || (n3 = bundle.containsKey((String)(object2 = "notificationId"))) == 0) break block3;
                            object = ((a)object).b;
                            object = ((H80)object).p;
                            object2 = "notificationId";
                            n3 = bundle.getInt((String)object2);
                            ((hC2)object).b(context, bundle, n3);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = ((a)object).b;
                    object = ((H80)object).p;
                    n3 = -1000;
                    ((hC2)object).b(context, bundle, n3);
                }
                return null;
            }
            throw throwable2;
        }
    }
}

