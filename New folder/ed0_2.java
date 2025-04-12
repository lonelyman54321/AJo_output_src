/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.CouponRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ed0
 */
public final class ed0_2
extends Hj {
    public final CouponRepo a;
    public final zr1_1 b;
    public final zr1_1 c;

    public ed0_2(Application object) {
        CouponRepo couponRepo;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        this.a = couponRepo = new CouponRepo((Context)object);
        super();
        this.b = object;
        super();
        this.c = object;
    }
}

