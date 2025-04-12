/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 */
package in.juspay.hypersmshandler;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import in.juspay.hypersmshandler.DeliverReceiver;
import in.juspay.hypersmshandler.JuspayDuiHook;
import in.juspay.hypersmshandler.SentReceiver;
import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsConsentHandler;
import in.juspay.hypersmshandler.SmsReceiver;
import in.juspay.hypersmshandler.SmsRetriever;
import in.juspay.hypersmshandler.SmsServices$Companion;
import in.juspay.hypersmshandler.SmsServices$createSMSConsent$1;
import in.juspay.hypersmshandler.Tracker;
import kotlin.jvm.internal.Intrinsics;

public final class SmsServices {
    public static final SmsServices$Companion c;
    public static final String d;
    public static final String e;
    public final SmsComponents a;
    public SmsConsentHandler b;

    static {
        SmsServices$Companion smsServices$Companion;
        c = smsServices$Companion = new SmsServices$Companion(0);
        d = "DENIED";
        e = "SmsServices";
    }

    public SmsServices(SmsComponents smsComponents) {
        Intrinsics.checkNotNullParameter(smsComponents, "smsComponents");
        this.a = smsComponents;
    }

    /*
     * Exception decompiling
     */
    public final String a(String var1_1, String var2_2, String var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 24[TRYBLOCK] [27 : 499->505)] org.json.JSONException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean a(String string2) {
        boolean bl2;
        block5: {
            block7: {
                Object object;
                block6: {
                    object = this.a.getContext();
                    int n3 = Build.VERSION.SDK_INT;
                    int n4 = 23;
                    bl2 = false;
                    if (n3 < n4) break block6;
                    int n7 = jq1_1.b((Context)object, string2);
                    if (n7 != 0) break block5;
                    break block7;
                }
                Object object2 = object.getPackageManager();
                object = object.getPackageName();
                try {
                    int n8 = object2.checkPermission(string2, (String)object);
                    if (n8 != 0) break block5;
                }
                catch (Throwable throwable) {
                    Tracker tracker = this.a.getTracker();
                    String string3 = e;
                    Intrinsics.checkNotNullExpressionValue(string3, "LOG_TAG");
                    object2 = "Exception trying to fetch permission info: ";
                    object = new StringBuilder((String)object2);
                    ((StringBuilder)object).append(string2);
                    string2 = " returning FALSE";
                    ((StringBuilder)object).append(string2);
                    String string4 = ((StringBuilder)object).toString();
                    String string5 = "system";
                    String string6 = "utils";
                    String string7 = "action";
                    tracker.trackAndLogException(string3, string7, string5, string6, string4, throwable);
                }
            }
            bl2 = true;
            {
            }
        }
        return bl2;
    }

    public final JuspayDuiHook createDeliveredSMSReceiver() {
        DeliverReceiver deliverReceiver = new DeliverReceiver();
        return deliverReceiver;
    }

    public final void createSMSConsent() {
        block11: {
            Object object = this.b;
            if (object != null) break block11;
            object = this.a;
            object = object.getContext();
            object = object.getPackageManager();
            Object object2 = "com.google.android.gms";
            String string2 = "android.permission.READ_SMS";
            int n3 = object.checkPermission(string2, (String)object2);
            if (n3 != 0) break block11;
            object = this.a;
            object2 = new SmsServices$createSMSConsent$1(this, (SmsComponents)object);
            this.b = object2;
            n3 = 0;
            object = null;
            try {
                ((SmsConsentHandler)((Object)object2)).d = null;
            }
            catch (Exception exception) {
                object2 = this.a.getTracker();
                string2 = e;
                object = "LOG_TAG";
                Intrinsics.checkNotNullExpressionValue(string2, (String)object);
                String string3 = "sms_consent";
                String string4 = "Exception happened while initializing";
                String string5 = "lifecycle";
                String string6 = "hyper_sdk";
                object2.trackAndLogException(string2, string5, string6, string3, string4, exception);
            }
        }
    }

    public final JuspayDuiHook createSMSReceiver() {
        block9: {
            Object object = new IntentFilter();
            Object object2 = "android.provider.Telephony.SMS_RECEIVED";
            object.addAction((String)object2);
            int n3 = 999;
            object.setPriority(n3);
            object2 = "android.permission.RECEIVE_SMS";
            n3 = (int)(this.a((String)object2) ? 1 : 0);
            if (n3 == 0) break block9;
            object2 = new SmsReceiver(this);
            try {
                ((SmsReceiver)object2).b = object;
                return object2;
            }
            catch (Throwable throwable) {
                object2 = this.a.getTracker();
                String string2 = e;
                object = "LOG_TAG";
                Intrinsics.checkNotNullExpressionValue(string2, (String)object);
                String string3 = "sms_receiver";
                String string4 = "Failed to register SMS broadcast receiver (Ignoring)";
                String string5 = "action";
                String string6 = "system";
                object2.trackAndLogException(string2, string5, string6, string3, string4, throwable);
            }
        }
        return null;
    }

    public final JuspayDuiHook createSendSMSReceiver() {
        SmsComponents smsComponents = this.a;
        SentReceiver sentReceiver = new SentReceiver(smsComponents);
        return sentReceiver;
    }

    public final JuspayDuiHook createSmsReceiverForConsent() {
        SmsReceiver smsReceiver;
        try {
            smsReceiver = new SmsReceiver(this);
        }
        catch (Exception exception) {
            Tracker tracker = this.a.getTracker();
            String string2 = e;
            Intrinsics.checkNotNullExpressionValue(string2, "LOG_TAG");
            tracker.trackAndLogException(string2, "api_call", "external_sdk", "sms_consent", "Failed to register SMS Consent", exception);
            return null;
        }
        smsReceiver.b = null;
        return smsReceiver;
    }

    public final JuspayDuiHook createSmsRetriever() {
        SmsComponents smsComponents = this.a;
        SmsRetriever smsRetriever = new SmsRetriever(smsComponents);
        return smsRetriever;
    }

    public final String fetchSms(String string2, String string3, String string4) {
        return this.a(string3, string2, string4);
    }

    public final void unregisterSmsConsent() {
        SmsConsentHandler smsConsentHandler = this.b;
        if (smsConsentHandler != null) {
            smsConsentHandler.c();
        }
        this.b = null;
    }
}

