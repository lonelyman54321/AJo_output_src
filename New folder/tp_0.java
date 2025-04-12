/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tp
 */
public final class tp_0
implements ao_0 {
    public static final tp$a Companion;
    public static final hh3_2 c;
    public final Context a;
    public final kb3_2 b;

    static {
        Object object = new Object();
        Companion = object;
        object = new Object();
        c = yr1_2.b((Function0)object);
    }

    public tp_0() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
        this.a = object;
        object = lb3_2.a(null);
        this.b = object;
    }

    public final void a() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        boolean bl2 = vl1_2.c();
        if (bl2) {
            bl2 = true;
            appsFlyerLib.setDebugLog(bl2);
        }
        sp_0 sp_02 = new sp_0(this);
        appsFlyerLib.subscribeForDeepLink(sp_02);
        Context context = this.a;
        appsFlyerLib.init("po2NZC5uBvjtAPjeU9D5FN", null, context);
        appsFlyerLib.start(context);
    }
}

