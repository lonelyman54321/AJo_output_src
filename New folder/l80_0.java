/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.task.a;

/*
 * Renamed from l80
 */
public final class l80_0 {
    public Gf1 a;
    public final Nh0 b;
    public hh_1 c;
    public nh_1 d;
    public oi_1 e;
    public final ti_0 f;
    public ai_0 g;
    public final tf_0 h;
    public final CleverTapInstanceConfig i;
    public final Context j;
    public final mp0_0 k;
    public InAppController l;
    public hC2 m;
    public ki_1 n;

    public l80_0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ti_0 ti_02, ck_1 ck_12, mp0_0 mp0_02, Nh0 nh0) {
        this.i = cleverTapInstanceConfig;
        this.f = ti_02;
        this.h = ck_12;
        this.k = mp0_02;
        this.j = context;
        this.b = nh0;
    }

    public final void a() {
        Object object = this.i;
        boolean bl2 = ((CleverTapInstanceConfig)object).h;
        if (bl2) {
            ((CleverTapInstanceConfig)object).b().getClass();
            com.clevertap.android.sdk.b.f("Instance is analytics only, not initializing Notification Inbox");
            return;
        }
        object = jh_1.a((CleverTapInstanceConfig)object).b();
        l80$a l80$a = new l80$a(this);
        ((a)object).c("initializeInbox", l80$a);
    }
}

