/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.g;
import com.facebook.j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class s3
implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;

    public /* synthetic */ s3(long l2, String string2) {
        this.a = l2;
        this.b = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        t03 t032;
        int n3;
        double d2;
        long l2;
        ScheduledExecutorService scheduledExecutorService;
        Object object;
        long l3 = this.a;
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$activityName");
        Object object2 = v3.h;
        int n4 = 0;
        String string3 = null;
        if (object2 == null) {
            object = l3;
            v3.h = object2 = new t03((Long)object, null);
        }
        if ((object2 = v3.h) != null) {
            object = l3;
            ((t03)object2).b = object;
        }
        object2 = v3.g;
        int n7 = ((AtomicInteger)object2).get();
        if (n7 <= 0) {
            object2 = new u3_0(l3, string2);
            object = v3.f;
            synchronized (object) {
                scheduledExecutorService = v3.c;
                Object object3 = v3.a;
                object3.getClass();
                object3 = FacebookSdk.b();
                object3 = dl0_2.b((String)object3);
                int n8 = object3 == null ? 60 : ((al0_2)object3).d;
                l2 = n8;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                object2 = scheduledExecutorService.schedule((Runnable)object2, l2, timeUnit);
                v3.e = object2;
                object2 = Unit.a;
            }
        }
        long l4 = v3.k;
        l2 = 0L;
        double d5 = 0.0;
        n7 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1));
        if (n7 > 0) {
            l3 -= l4;
            n7 = 1000;
            l4 = n7;
            l3 /= l4;
        } else {
            l3 = l2;
            d2 = d5;
        }
        object2 = ct.a;
        object2 = FacebookSdk.a();
        object = FacebookSdk.b();
        scheduledExecutorService = null;
        object = dl0_2.k((String)object, false);
        if (object != null && (n3 = ((al0_2)object).g) != 0 && (n3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) > 0) {
            object = new g((Context)object2, null);
            Intrinsics.checkNotNullParameter(object, "loggerImpl");
            n4 = 1;
            object2 = new Bundle(n4);
            string3 = "fb_aa_time_spent_view_name";
            object2.putCharSequence(string3, (CharSequence)string2);
            d2 = l3;
            boolean bl2 = j.c();
            if (bl2) {
                string2 = "fb_aa_time_spent_on_view";
                ((g)object).d(string2, d2, (Bundle)object2);
            }
        }
        if ((t032 = v3.h) != null) {
            t032.a();
        }
    }
}

