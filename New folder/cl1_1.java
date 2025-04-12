/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebSettings
 */
import android.content.Context;
import android.webkit.WebSettings;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$Environment;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;

/*
 * Renamed from cl1
 */
public final class cl1_1
implements ao_0 {
    public final void a() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        block5: {
            try {
                object4 = AJIOApplication.Companion;
            }
            catch (Exception exception) {}
            object4.getClass();
            object4 = AJIOApplication$a.a();
            if (object4 == null) break block5;
            object4 = WebSettings.getDefaultUserAgent((Context)object4);
        }
        object4 = "";
        boolean bl2 = vl1_2.c();
        if (bl2) {
            object3 = JioAds.Companion;
            object2 = ((JioAds$Companion)object3).getInstance();
            object = JioAds$LogLevel.DEBUG;
            object2.setLogLevel((JioAds$LogLevel)((Object)object));
            object3 = ((JioAds$Companion)object3).getInstance();
            object2 = JioAds$Environment.STG;
            ((JioAds)object3).setEnvironment((JioAds$Environment)((Object)object2));
        }
        object3 = JioAds.Companion;
        object2 = ((JioAds$Companion)object3).getInstance();
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        object2.init((Context)object);
        ((JioAds$Companion)object3).getInstance().setCustomUserAgent((String)object4);
    }
}

