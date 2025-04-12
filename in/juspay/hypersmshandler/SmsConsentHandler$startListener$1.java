/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersmshandler;

import in.juspay.hypersmshandler.Tracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class SmsConsentHandler$startListener$1
extends Lambda
implements Function1 {
    public final /* synthetic */ Tracker a;

    public SmsConsentHandler$startListener$1(Tracker tracker) {
        this.a = tracker;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Void)object;
        this.a.trackAction("system", "debug", "sms_consent", "sms_consent_listener", "SmsConsent listener started successfully");
        return Unit.a;
    }
}

