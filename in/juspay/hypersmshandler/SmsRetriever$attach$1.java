/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 */
package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import in.juspay.hypersmshandler.SmsEventInterface$RetrieverEvents;
import in.juspay.hypersmshandler.SmsRetriever;
import in.juspay.hypersmshandler.a;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class SmsRetriever$attach$1
extends Lambda
implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ SmsRetriever b;

    public SmsRetriever$attach$1(Activity activity, SmsRetriever smsRetriever) {
        this.a = activity;
        this.b = smsRetriever;
        super(1);
    }

    public static final void a(Activity object, SmsRetriever object2) {
        Intrinsics.checkNotNullParameter(object, "$activity");
        Intrinsics.checkNotNullParameter(object2, "this$0");
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        String string2 = "android.intent.action.AIRPLANE_MODE";
        intentFilter.addAction(string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            oo0_2.a((Activity)object, object2, intentFilter);
        } else {
            object.registerReceiver((BroadcastReceiver)object2, intentFilter);
        }
        object = object2.a.getSmsEventInterface();
        object2 = SmsEventInterface$RetrieverEvents.ON_ATTACH;
        object.onSmsRetrieverEvent((SmsEventInterface$RetrieverEvents)((Object)object2), "SUCCESS");
    }

    public final void a() {
        ExecutorService executorService = SmsRetriever.e;
        Activity activity = this.a;
        SmsRetriever smsRetriever = this.b;
        a a2 = new a(activity, smsRetriever);
        executorService.execute(a2);
    }
}

