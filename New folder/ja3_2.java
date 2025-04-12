/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.text.TextUtils
 */
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Ja3
 */
public final class ja3_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ SplashScreenActivity a;

    public ja3_2(SplashScreenActivity splashScreenActivity, f80_0 f80_02) {
        this.a = splashScreenActivity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SplashScreenActivity splashScreenActivity = this.a;
        object = new ja3_2(splashScreenActivity, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ja3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ja3_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = object.getIntent().getExtras();
        if (object2 != null) {
            boolean bl2;
            object2 = object2.keySet().iterator();
            while (bl2 = object2.hasNext()) {
                Object object3 = (String)object2.next();
                boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
                if (bl3) continue;
                Intrinsics.checkNotNull(object3);
                bl3 = false;
                String string2 = "wzrk_";
                bl2 = b.s((String)object3, string2, false);
                if (!bl2) continue;
                object2 = AppsFlyerLib.getInstance();
                object = object.getIntent();
                AJIOApplication.Companion.getClass();
                object3 = AJIOApplication$a.a();
                ((AppsFlyerLib)object2).performOnDeepLinking((Intent)object, (Context)object3);
                break;
            }
        }
        return Unit.a;
    }
}

