/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.usecase.SendGDPREventUseCaseImpl;

/*
 * Renamed from iZ2
 */
public final class iz2_0
implements Runnable {
    public final /* synthetic */ SendGDPREventUseCaseImpl a;

    public /* synthetic */ iz2_0(SendGDPREventUseCaseImpl sendGDPREventUseCaseImpl) {
        this.a = sendGDPREventUseCaseImpl;
    }

    public final void run() {
        SendGDPREventUseCaseImpl.b(this.a);
    }
}

