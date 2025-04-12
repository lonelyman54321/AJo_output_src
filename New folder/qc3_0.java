/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.internal.InternalEvent;
import com.affise.attribution.internal.StoreInternalEventUseCaseImpl;

/*
 * Renamed from Qc3
 */
public final class qc3_0
implements Runnable {
    public final /* synthetic */ StoreInternalEventUseCaseImpl a;
    public final /* synthetic */ InternalEvent b;

    public /* synthetic */ qc3_0(StoreInternalEventUseCaseImpl storeInternalEventUseCaseImpl, InternalEvent internalEvent) {
        this.a = storeInternalEventUseCaseImpl;
        this.b = internalEvent;
    }

    public final void run() {
        StoreInternalEventUseCaseImpl storeInternalEventUseCaseImpl = this.a;
        InternalEvent internalEvent = this.b;
        StoreInternalEventUseCaseImpl.a(storeInternalEventUseCaseImpl, internalEvent);
    }
}

