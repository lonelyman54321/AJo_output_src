/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.usecase.SendDataToServerUseCaseImpl;

/*
 * Renamed from gZ2
 */
public final class gz2_0
implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ SendDataToServerUseCaseImpl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ gz2_0(boolean bl2, SendDataToServerUseCaseImpl sendDataToServerUseCaseImpl, String string2, boolean bl3) {
        this.a = bl2;
        this.b = sendDataToServerUseCaseImpl;
        this.c = string2;
        this.d = bl3;
    }

    public final void run() {
        String string2 = this.c;
        boolean bl2 = this.d;
        boolean bl3 = this.a;
        SendDataToServerUseCaseImpl sendDataToServerUseCaseImpl = this.b;
        SendDataToServerUseCaseImpl.a(bl3, sendDataToServerUseCaseImpl, string2, bl2);
    }
}

