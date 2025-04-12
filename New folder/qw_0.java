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
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.a;
import com.facebook.appevents.g;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QW
 */
public final class qw_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qw_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                CrashlyticsCore crashlyticsCore = (CrashlyticsCore)this.b;
                SettingsProvider settingsProvider = (SettingsProvider)this.c;
                CrashlyticsCore.j(crashlyticsCore, settingsProvider);
                return;
            }
            case 0: 
        }
        String string2 = (String)this.b;
        Bundle bundle = (Bundle)this.c;
        Class<a> clazz = a.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            Object object = "$eventName";
            Intrinsics.checkNotNullParameter(string2, (String)object);
            object = "$parameters";
            Intrinsics.checkNotNullParameter(bundle, (String)object);
            object = FacebookSdk.a();
            Object object2 = "context";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = new AppEventsLogger((Context)object);
            object = ((AppEventsLogger)object2).a;
            try {
                ((g)object).e(string2, bundle);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

