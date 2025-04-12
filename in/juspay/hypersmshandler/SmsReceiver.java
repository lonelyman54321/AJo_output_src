/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 *  android.telephony.SmsMessage
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.SmsMessage;
import in.juspay.hypersmshandler.JuspayDuiHook;
import in.juspay.hypersmshandler.OnResultHook;
import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsConsentHandler;
import in.juspay.hypersmshandler.SmsEventInterface;
import in.juspay.hypersmshandler.SmsReceiver$Companion;
import in.juspay.hypersmshandler.SmsServices;
import in.juspay.hypersmshandler.SmsServices$resetSmsConsentHandler$1;
import in.juspay.hypersmshandler.Tracker;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class SmsReceiver
extends BroadcastReceiver
implements JuspayDuiHook,
OnResultHook {
    public static final String d;
    public final SmsServices a;
    public IntentFilter b;
    public final Tracker c;

    static {
        new SmsReceiver$Companion(0);
        d = "SmsReceiver";
    }

    public SmsReceiver(SmsServices object) {
        Intrinsics.checkNotNullParameter(object, "smsServices");
        this.a = object;
        this.c = object = ((SmsServices)object).a.getTracker();
    }

    public static final void a(SmsReceiver object, SmsConsentHandler smsConsentHandler) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object.getClass();
        smsConsentHandler = smsConsentHandler.b;
        if (smsConsentHandler != null) {
            object = ((SmsReceiver)object).a.a.getSmsEventInterface();
            int n3 = 11;
            object.onSmsConsentEvent((Intent)smsConsentHandler, n3, null);
        }
    }

    public final void a(Intent object) {
        block8: {
            int n3;
            if ((object = object.getExtras()) == null) break block8;
            String string2 = "pdus";
            int n4 = (object = object.get(string2)) instanceof Object[];
            if (n4 != 0) {
                object = (Object[])object;
            } else {
                n3 = 0;
                object = null;
            }
            n4 = 0;
            string2 = null;
            if (object == null) {
                object = new byte[0][];
            }
            int n7 = ((Object[])object).length;
            SmsMessage[] smsMessageArray = new SmsMessage[n7];
            JSONArray jSONArray = new JSONArray();
            while (n4 < n7) {
                Object object2;
                String string3;
                String string4;
                String string5;
                Object object3;
                block10: {
                    block9: {
                        object3 = object[n4];
                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.ByteArray");
                        object3 = SmsMessage.createFromPdu((byte[])((byte[])object3));
                        string5 = object3.getOriginatingAddress();
                        string4 = "this as java.lang.String).toUpperCase(locale)";
                        string3 = "getDefault()";
                        if (string5 == null) break block9;
                        object2 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                        string5 = string5.toUpperCase((Locale)object2);
                        Intrinsics.checkNotNullExpressionValue(string5, string4);
                        if (string5 != null) break block10;
                    }
                    string5 = "";
                }
                object2 = object3.getMessageBody();
                Intrinsics.checkNotNullExpressionValue(object2, "smsMsg.messageBody");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, string3);
                string3 = ((String)object2).toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(string3, string4);
                long l2 = object3.getTimestampMillis();
                string4 = String.valueOf(l2);
                smsMessageArray[n4] = object3;
                object3 = new JSONObject();
                object2 = "from";
                object3.put((String)object2, (Object)string5);
                object3.put("body", (Object)string3);
                string5 = "time";
                object3.put(string5, (Object)string4);
                jSONArray.put(object3);
                ++n4;
            }
            n3 = jSONArray.length();
            if (n3 > 0) {
                object = this.a.a.getSmsEventInterface();
                string2 = jSONArray.toString();
                String string6 = "receivedMsgs.toString()";
                Intrinsics.checkNotNullExpressionValue(string2, string6);
                object.onSmsReceiverEvent(string2);
            }
        }
    }

    public final void attach(Activity object) {
        Object object2 = "activity";
        Intrinsics.checkNotNullParameter(object, object2);
        object = this.b;
        if (object == null) {
            object = this.a;
            object2 = ((SmsServices)object).b;
            if (object2 == null) {
                this.c.trackAction("system", "error", "sms_receiver", "missing", "SmsConsentHandler");
                return;
            }
            Intent intent = ((SmsConsentHandler)((Object)object2)).b;
            if (intent != null) {
                object = ((SmsServices)object).a.getSmsEventInterface();
                int n3 = 11;
                object.onSmsConsentEvent(intent, n3, null);
            }
            object = new B73(this, (SmsConsentHandler)((Object)object2));
            ((SmsConsentHandler)((Object)object2)).d = object;
        } else {
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 33;
            if (n4 >= n7) {
                object = this.a.a.getContext();
                object2 = this.b;
                oo0_2.b((Context)object, this, (IntentFilter)object2);
            } else {
                object = this.a.a.getContext();
                object2 = this.b;
                object.registerReceiver((BroadcastReceiver)this, (IntentFilter)object2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void detach(Activity object) {
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(object, string2);
        try {
            object = this.b;
            if (object == null) {
                object = this.a;
                object = object.b;
                if (object == null) return;
                string2 = null;
                object.d = null;
                return;
            }
            object = this.a;
            object = object.a;
            object = object.getContext();
            object.unregisterReceiver((BroadcastReceiver)this);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String execute(Activity object, String object2, JSONObject object3) {
        JSONException jSONException2;
        Object object4;
        block5: {
            object2 = "smsReadStartTime";
            object4 = "activity";
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object = null;
            if (object3 != null) {
                try {
                    boolean bl2 = object3.has((String)object2);
                    if (bl2) {
                        object4 = this.a;
                        object2 = object3.getString((String)object2);
                        return ((SmsServices)object4).a(null, (String)object2, null);
                    }
                }
                catch (JSONException jSONException2) {
                    break block5;
                }
            }
            object2 = this.a;
            long l2 = System.currentTimeMillis();
            int n3 = 60000;
            long l3 = n3;
            {
                object3 = String.valueOf(l2 -= l3);
                return ((SmsServices)object2).a(null, (String)object3, null);
            }
        }
        object4 = this.c;
        String string2 = d;
        Intrinsics.checkNotNullExpressionValue(string2, "LOG_TAG");
        object4.trackAndLogException(string2, "action", "system", "broadcast_receiver", "Exception while trying to read sms from Inbox: ", jSONException2);
        return "[]";
    }

    public final boolean onActivityResult(int n3, int n4, Intent object) {
        int n7 = 11;
        if (n3 == n7) {
            SmsServices smsServices = this.a;
            Object object2 = smsServices.b;
            if (object2 != null) {
                object2.c();
            }
            object2 = smsServices.a;
            Object object3 = new SmsServices$resetSmsConsentHandler$1(smsServices, (SmsComponents)object2);
            smsServices.b = object3;
            smsServices = null;
            ((SmsConsentHandler)((Object)object3)).d = null;
            n3 = 1;
            if (object == null) {
                SmsEventInterface smsEventInterface = this.a.a.getSmsEventInterface();
                SmsServices.c.getClass();
                object = SmsServices.d;
                smsEventInterface.onActivityResultEvent((String)object);
                return n3 != 0;
            }
            n7 = -1;
            if (n4 != n7) {
                if (n4 == 0) {
                    object3 = this.c;
                    String string2 = "on_activity_result";
                    String string3 = "User denied SMS consent";
                    String string4 = "system";
                    String string5 = "debug";
                    String string6 = "broadcast_receiver";
                    object3.trackAction(string4, string5, string6, string2, string3);
                    SmsEventInterface smsEventInterface = this.a.a.getSmsEventInterface();
                    object = "DENIED";
                    smsEventInterface.onActivityResultEvent((String)object);
                }
            } else {
                Object object4 = object.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                object = new JSONObject();
                object2 = "from";
                object3 = "UNKNOWN_BANK";
                object.put((String)object2, object3);
                object2 = "body";
                object.put((String)object2, object4);
                object4 = "time";
                long l2 = System.currentTimeMillis();
                object2 = String.valueOf(l2);
                object.put((String)object4, object2);
                object4 = object.toString();
                object = this.a;
                object = ((SmsServices)object).a;
                object = object.getSmsEventInterface();
                object.onActivityResultEvent((String)object4);
                object2 = this.c;
                object3 = "system";
                String string7 = "debug";
                String string8 = "broadcast_receiver";
                String string9 = "on_activity_result";
                String string10 = "Response sent back to microapp";
                try {
                    object2.trackAction((String)object3, string7, string8, string9, string10);
                }
                catch (JSONException jSONException) {
                    object4 = this.a.a.getSmsEventInterface();
                    SmsServices.c.getClass();
                    object = SmsServices.d;
                    object4.onActivityResultEvent((String)object);
                    object2 = this.c;
                    object3 = d;
                    object4 = "LOG_TAG";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                    string9 = "sms_consent";
                    string10 = "JSON Exception";
                    string7 = "api_call";
                    string8 = "external_sdk";
                    object2.trackAndLogException((String)object3, string7, string8, string9, string10, jSONException);
                }
            }
            return n3 != 0;
        }
        return false;
    }

    public final void onReceive(Context object, Intent intent) {
        block4: {
            Object object2 = "context";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(intent, "intent");
            object = "android.provider.Telephony.SMS_RECEIVED";
            object2 = intent.getAction();
            boolean bl2 = Intrinsics.areEqual(object, object2);
            if (!bl2) break block4;
            try {
                this.a(intent);
            }
            catch (Exception exception) {
                object2 = this.c;
                String string2 = d;
                object = "LOG_TAG";
                Intrinsics.checkNotNullExpressionValue(string2, (String)object);
                String string3 = "broadcast_receiver";
                String string4 = "Failed to receive sms";
                String string5 = "action";
                String string6 = "system";
                object2.trackAndLogException(string2, string5, string6, string3, string4, exception);
            }
        }
    }
}

