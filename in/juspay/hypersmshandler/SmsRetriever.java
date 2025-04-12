/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import in.juspay.hypersmshandler.JuspayDuiHook;
import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsEventInterface$RetrieverEvents;
import in.juspay.hypersmshandler.SmsRetriever$Companion;
import in.juspay.hypersmshandler.SmsRetriever$attach$1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class SmsRetriever
extends BroadcastReceiver
implements JuspayDuiHook {
    public static final ExecutorService e;
    public final SmsComponents a;
    public JSONArray b;
    public boolean c;
    public final Context d;

    static {
        new SmsRetriever$Companion(0);
        e = Executors.newSingleThreadExecutor();
    }

    public SmsRetriever(SmsComponents smsComponents) {
        JSONArray jSONArray;
        Intrinsics.checkNotNullParameter(smsComponents, "smsComponents");
        this.a = smsComponents;
        this.b = jSONArray = new JSONArray();
        smsComponents = smsComponents.getContext();
        this.d = smsComponents;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void a(SmsRetriever smsRetriever) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(smsRetriever, string2);
        try {
            string2 = smsRetriever.d;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
        string2.unregisterReceiver((BroadcastReceiver)smsRetriever);
    }

    public static final void a(SmsRetriever object, Exception object2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "it");
        object = ((SmsRetriever)object).a.getSmsEventInterface();
        object2 = SmsEventInterface$RetrieverEvents.ON_ATTACH;
        object.onSmsRetrieverEvent((SmsEventInterface$RetrieverEvents)((Object)object2), "FAILURE");
    }

    public static final void a(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public final void attach(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        Object object2 = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(this.d);
        Intrinsics.checkNotNullExpressionValue(object2, "getClient(context)");
        object2 = ((SmsRetrieverClient)object2).startSmsRetriever();
        Intrinsics.checkNotNullExpressionValue(object2, "client.startSmsRetriever()");
        SmsRetriever$attach$1 smsRetriever$attach$1 = new SmsRetriever$attach$1((Activity)object, this);
        object = new va_2(smsRetriever$attach$1);
        ((Task)object2).addOnSuccessListener((OnSuccessListener)object);
        object = new hp2_1(this);
        ((Task)object2).addOnFailureListener((OnFailureListener)object);
    }

    public final void detach(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        object = e;
        B31 b31 = new B31(this, 1);
        object.execute(b31);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String execute(Activity object, String object2, JSONObject object3) {
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "FAILURE";
        if (object2 == null) return object;
        String string3 = "getOtp";
        boolean bl2 = Intrinsics.areEqual(object2, string3);
        String string4 = "SUCCESS";
        if (bl2) {
            object = this.b;
            int n3 = object.length();
            if (n3 != 0) {
                object = this.a.getSmsEventInterface();
                SmsEventInterface$RetrieverEvents smsEventInterface$RetrieverEvents = SmsEventInterface$RetrieverEvents.ON_EXECUTE;
                String string5 = this.b.toString();
                String string6 = "otp.toString()";
                Intrinsics.checkNotNullExpressionValue(string5, string6);
                object.onSmsRetrieverEvent(smsEventInterface$RetrieverEvents, string5);
                object = new JSONArray();
                this.b = object;
                return string4;
            }
            n3 = (int)(this.c ? 1 : 0);
            if (n3 == 0) return string4;
            object = this.a.getSmsEventInterface();
            SmsEventInterface$RetrieverEvents smsEventInterface$RetrieverEvents = SmsEventInterface$RetrieverEvents.ON_EXECUTE;
            String string7 = "TIMEOUT";
            object.onSmsRetrieverEvent(smsEventInterface$RetrieverEvents, string7);
            return string4;
        }
        String string8 = "cancel";
        boolean bl3 = Intrinsics.areEqual(object2, string8);
        if (!bl3) return object;
        return string4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReceive(Context object, Intent object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "intent");
        object = object2.getAction();
        String string2 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
        int n3 = Intrinsics.areEqual(string2, object);
        if (n3 == 0) return;
        object = object2.getExtras();
        if (object == null) {
            return;
        }
        Status status = (Status)object.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
        string2 = object.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_ORIGINATING_ADDRESS");
        if (status == null) return;
        int n4 = status.getStatusCode();
        if (n4 != 0) {
            n3 = 15;
            if (n4 != n3) {
                return;
            }
            n3 = 1;
            this.c = n3;
            object = this.a.getSmsEventInterface();
            SmsEventInterface$RetrieverEvents smsEventInterface$RetrieverEvents = SmsEventInterface$RetrieverEvents.ON_RECEIVE;
            string2 = "TIMEOUT";
            object.onSmsRetrieverEvent(smsEventInterface$RetrieverEvents, string2);
            return;
        }
        object = (String)object.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
        JSONObject jSONObject = new JSONObject();
        String string3 = "from";
        String string4 = "UNKNOWN_BANK";
        try {
            jSONObject.put(string3, (Object)string4);
            string3 = "body";
            jSONObject.put(string3, object);
            object = "time";
            long l2 = System.currentTimeMillis();
            string3 = String.valueOf(l2);
            jSONObject.put((String)object, (Object)string3);
            object = "senderId";
            jSONObject.put((String)object, (Object)string2);
        }
        catch (Exception exception) {}
        this.b.put((Object)jSONObject);
        object = this.a.getSmsEventInterface();
        SmsEventInterface$RetrieverEvents smsEventInterface$RetrieverEvents = SmsEventInterface$RetrieverEvents.ON_RECEIVE;
        string2 = this.b.toString();
        string3 = "otp.toString()";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        object.onSmsRetrieverEvent(smsEventInterface$RetrieverEvents, string2);
        object = new JSONArray();
        this.b = object;
    }
}

