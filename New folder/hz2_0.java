/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.usecase.SendGDPREventUseCaseImpl;

/*
 * Renamed from hZ2
 */
public final class hz2_0
implements Runnable {
    public final /* synthetic */ SendGDPREventUseCaseImpl a;
    public final /* synthetic */ String b;

    public /* synthetic */ hz2_0(SendGDPREventUseCaseImpl sendGDPREventUseCaseImpl, String string2) {
        this.a = sendGDPREventUseCaseImpl;
        this.b = string2;
    }

    public final void run() {
        SendGDPREventUseCaseImpl sendGDPREventUseCaseImpl = this.a;
        String string2 = this.b;
        SendGDPREventUseCaseImpl.a(sendGDPREventUseCaseImpl, string2);
    }
}

