/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.logs.AffiseLog;
import com.affise.attribution.logs.StoreLogsUseCaseImpl;

/*
 * Renamed from id3
 */
public final class id3_0
implements Runnable {
    public final /* synthetic */ StoreLogsUseCaseImpl a;
    public final /* synthetic */ AffiseLog b;

    public /* synthetic */ id3_0(StoreLogsUseCaseImpl storeLogsUseCaseImpl, AffiseLog affiseLog) {
        this.a = storeLogsUseCaseImpl;
        this.b = affiseLog;
    }

    public final void run() {
        StoreLogsUseCaseImpl storeLogsUseCaseImpl = this.a;
        AffiseLog affiseLog = this.b;
        StoreLogsUseCaseImpl.a(storeLogsUseCaseImpl, affiseLog);
    }
}

