/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.events.Event;
import com.affise.attribution.events.StoreEventUseCaseImpl;

/*
 * Renamed from Pc3
 */
public final class pc3_0
implements Runnable {
    public final /* synthetic */ StoreEventUseCaseImpl a;
    public final /* synthetic */ Event b;

    public /* synthetic */ pc3_0(StoreEventUseCaseImpl storeEventUseCaseImpl, Event event) {
        this.a = storeEventUseCaseImpl;
        this.b = event;
    }

    public final void run() {
        StoreEventUseCaseImpl storeEventUseCaseImpl = this.a;
        Event event = this.b;
        StoreEventUseCaseImpl.b(storeEventUseCaseImpl, event);
    }
}

