/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.events.Event;
import com.affise.attribution.events.OnSendFailedCallback;
import com.affise.attribution.events.OnSendSuccessCallback;
import com.affise.attribution.usecase.ImmediateSendToServerUseCaseImpl;

public final class Ue1
implements Runnable {
    public final /* synthetic */ ImmediateSendToServerUseCaseImpl a;
    public final /* synthetic */ Event b;
    public final /* synthetic */ String c;
    public final /* synthetic */ OnSendSuccessCallback d;
    public final /* synthetic */ OnSendFailedCallback e;

    public /* synthetic */ Ue1(ImmediateSendToServerUseCaseImpl immediateSendToServerUseCaseImpl, Event event, String string2, OnSendSuccessCallback onSendSuccessCallback, OnSendFailedCallback onSendFailedCallback) {
        this.a = immediateSendToServerUseCaseImpl;
        this.b = event;
        this.c = string2;
        this.d = onSendSuccessCallback;
        this.e = onSendFailedCallback;
    }

    public final void run() {
        OnSendSuccessCallback onSendSuccessCallback = this.d;
        OnSendFailedCallback onSendFailedCallback = this.e;
        ImmediateSendToServerUseCaseImpl immediateSendToServerUseCaseImpl = this.a;
        Event event = this.b;
        String string2 = this.c;
        ImmediateSendToServerUseCaseImpl.a(immediateSendToServerUseCaseImpl, event, string2, onSendSuccessCallback, onSendFailedCallback);
    }
}

