/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.CouponListRepo;
import com.ril.ajio.services.data.Offers.AllOffersItem;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fd0
 */
public final class fd0_2
extends Hj {
    public final CouponListRepo a;
    public final t30_0 b;
    public final zr1_1 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final ArrayList g;

    public fd0_2(Application object) {
        CouponListRepo couponListRepo;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        this.a = couponListRepo = new CouponListRepo((Context)object);
        super();
        this.b = object;
        super();
        this.c = object;
        this.d = object;
        super();
        this.e = object;
        this.f = object;
        super();
        this.g = object;
    }

    public static void b(long l2, AllOffersItem allOffersItem) {
        Object object = Calendar.getInstance();
        ((Calendar)object).setTimeInMillis(l2);
        Calendar calendar = Calendar.getInstance();
        long l3 = ((Calendar)object).getTimeInMillis();
        long l4 = calendar.getTimeInMillis();
        l3 -= l4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l4 = timeUnit.toHours(l3);
        long l7 = 24;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 < 0) {
            l7 = 0L;
            allOffersItem.setExpiryDays(l7);
            allOffersItem.setExpiryHours(l4);
            l2 = timeUnit.toMinutes(l3);
            object = TimeUnit.HOURS;
            long l12 = ((TimeUnit)((Object)object)).toMinutes(l4);
            allOffersItem.setExpiryMinutes(l2 -= l12);
        } else {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            int n3 = 14;
            calendar.set(n3, 0);
            long l14 = ((Calendar)object).getTimeInMillis();
            long l15 = calendar.getTimeInMillis();
            l2 = timeUnit.toDays(l14 -= l15);
            allOffersItem.setExpiryDays(l2);
        }
    }
}

