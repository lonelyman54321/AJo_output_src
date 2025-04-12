/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersmshandler.SmsConsentHandler;
import in.juspay.hypersmshandler.SmsReceiver;

public final class B73
implements Runnable {
    public final /* synthetic */ SmsReceiver a;
    public final /* synthetic */ SmsConsentHandler b;

    public /* synthetic */ B73(SmsReceiver smsReceiver, SmsConsentHandler smsConsentHandler) {
        this.a = smsReceiver;
        this.b = smsConsentHandler;
    }

    public final void run() {
        SmsReceiver smsReceiver = this.a;
        SmsConsentHandler smsConsentHandler = this.b;
        SmsReceiver.a(smsReceiver, smsConsentHandler);
    }
}

