/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersmshandler;

import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsConsentHandler;
import in.juspay.hypersmshandler.SmsServices;
import in.juspay.hypersmshandler.SmsServices$resetSmsConsentHandler$1;

public final class SmsServices$createSMSConsent$1
extends SmsConsentHandler {
    public final /* synthetic */ SmsServices f;

    public SmsServices$createSMSConsent$1(SmsServices smsServices, SmsComponents smsComponents) {
        this.f = smsServices;
        super(smsComponents);
    }

    public final void a() {
        SmsServices smsServices = this.f;
        Object object = smsServices.b;
        if (object != null) {
            object.c();
        }
        object = smsServices.a;
        SmsServices$resetSmsConsentHandler$1 smsServices$resetSmsConsentHandler$1 = new SmsServices$resetSmsConsentHandler$1(smsServices, (SmsComponents)object);
        smsServices.b = smsServices$resetSmsConsentHandler$1;
        smsServices$resetSmsConsentHandler$1.d = null;
    }
}

