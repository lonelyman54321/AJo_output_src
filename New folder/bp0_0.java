/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 */
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.common.d;
import com.jio.jioads.common.j;
import com.jio.jioads.controller.o;
import com.ril.ajio.devsettings.DevSettingsActivity;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bp0
 */
public final class bp0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bp0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                j j3;
                object = (o)object;
                Intrinsics.checkNotNullParameter(object, object2);
                object2 = ((o)object).a.A();
                if (object2 != null) {
                    j3 = ((o)object).q;
                    object2.removeView((View)j3);
                }
                if ((object2 = ((o)object).q) != null) {
                    object2.removeAllViews();
                }
                if ((j3 = (object2 = ((o)object).a).A()) != null) {
                    j j5 = ((o)object).q;
                    j3.addView((View)j5);
                }
                if (bl2 = object2.X()) {
                    object2 = JioAdView$AdState.PREPARED;
                    object = (V)((o)object).b;
                    ((V)object).e((JioAdView$AdState)((Object)object2));
                    ((V)object).n();
                } else {
                    object = ((o)object).r;
                    if (object != null) {
                        ((d)object).onShowAdView();
                    }
                }
                return;
            }
            case 0: 
        }
        Object object3 = DevSettingsActivity.Companion;
        object = (DevSettingsActivity)object;
        Intrinsics.checkNotNullParameter(object, object2);
        object2 = object.getBaseContext().getPackageManager();
        object3 = object.getPackageName();
        object2 = object2.getLaunchIntentForPackage((String)object3);
        if (object2 != null) {
            n3 = 0x4000000;
            object2.addFlags(n3);
        }
        SplashScreenActivity.Companion.getClass();
        Intrinsics.checkNotNullParameter(object, "context");
        object2 = new Intent((Context)object, SplashScreenActivity.class);
        object2.addFlags(0x10008000);
        object.startActivity((Intent)object2);
        System.exit(0);
        object = new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        throw object;
    }
}

