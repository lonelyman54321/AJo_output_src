/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 */
package in.juspay.hypersmshandler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsConsentHandler$Companion;
import in.juspay.hypersmshandler.SmsConsentHandler$startListener$1;
import in.juspay.hypersmshandler.Tracker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public abstract class SmsConsentHandler
extends BroadcastReceiver {
    public static final ExecutorService e;
    public final SmsComponents a;
    public Intent b;
    public final Context c;
    public Runnable d;

    static {
        new SmsConsentHandler$Companion(0);
        e = Executors.newSingleThreadExecutor();
    }

    public SmsConsentHandler(SmsComponents object) {
        Intrinsics.checkNotNullParameter(object, "smsComponents");
        this.a = object;
        object = object.getContext();
        this.c = object;
        object = e;
        u31_0 u31_02 = new u31_0((Object)this, 1);
        object.execute(u31_02);
    }

    public static final void a(SmsConsentHandler smsConsentHandler) {
        Intrinsics.checkNotNullParameter((Object)smsConsentHandler, "this$0");
        smsConsentHandler.b();
        String string2 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
        IntentFilter intentFilter = new IntentFilter(string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            string2 = smsConsentHandler.c;
            oo0_2.b((Context)string2, smsConsentHandler, intentFilter);
        } else {
            string2 = smsConsentHandler.c;
            string2.registerReceiver((BroadcastReceiver)smsConsentHandler, intentFilter);
        }
    }

    public static final void a(Tracker tracker, Exception exception) {
        Intrinsics.checkNotNullParameter(tracker, "$tracker");
        Intrinsics.checkNotNullParameter(exception, "e");
        tracker.trackAndLogException("SmsConsentHandler", "api_call", "external_sdk", "sms_consent", "SmsConsent listener failed to start", exception);
    }

    public static final void a(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void b(SmsConsentHandler smsConsentHandler) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter((Object)smsConsentHandler, string2);
        try {
            string2 = smsConsentHandler.c;
        }
        catch (Exception exception) {
            return;
        }
        string2.unregisterReceiver((BroadcastReceiver)smsConsentHandler);
    }

    public abstract void a();

    public final void b() {
        Tracker tracker = this.a.getTracker();
        Task task2 = SmsRetriever.getClient(this.c).startSmsUserConsent(null);
        Intrinsics.checkNotNullExpressionValue(task2, "getClient(context).startSmsUserConsent(null)");
        Object object = new SmsConsentHandler$startListener$1(tracker);
        a73_0 a73_02 = new a73_0((Function1)object);
        task2.addOnSuccessListener(a73_02);
        object = new ta_2(tracker);
        task2.addOnFailureListener((OnFailureListener)object);
    }

    public final void c() {
        ExecutorService executorService = e;
        L7 l7 = new L7((Object)this, 3);
        executorService.execute(l7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReceive(Context object, Intent object2) {
        Exception exception;
        Object object3;
        block6: {
            int n3;
            int n4;
            object3 = "context";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object2, "intent");
            object = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
            try {
                object3 = object2.getAction();
                n4 = Intrinsics.areEqual(object, object3);
                if (n4 == 0) {
                    return;
                }
                object = object2.getExtras();
                if (object == null) {
                    return;
                }
                object2 = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
                object2 = object.get((String)object2);
                if ((object2 = (Status)object2) == null) return;
                n3 = ((Status)object2).getStatusCode();
            }
            catch (Exception exception2) {
                exception = exception2;
                break block6;
            }
            if (n3 == 0) {
                object2 = "com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT";
                object = object.getParcelable((String)object2);
                object = (Intent)object;
                this.b = object;
                object = this.d;
                if (object == null) return;
                object.run();
                return;
            }
            n4 = 15;
            if (n3 != n4) {
                return;
            }
            this.a();
            return;
        }
        SmsComponents smsComponents = this.a;
        object3 = smsComponents.getTracker();
        String string2 = "broadcast_receiver";
        String string3 = "SmsConsentHandler onReceive exception";
        String string4 = "SmsConsentHandler";
        String string5 = "lifecycle";
        String string6 = "system";
        object3.trackAndLogException(string4, string5, string6, string2, string3, exception);
    }
}

