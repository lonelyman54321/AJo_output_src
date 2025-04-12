/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;

/*
 * Renamed from Rw3
 */
public final class rw3_0
implements Runnable {
    public final /* synthetic */ Uploader a;
    public final /* synthetic */ TransportContext b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ rw3_0(Uploader uploader, TransportContext transportContext, int n3, Runnable runnable2) {
        this.a = uploader;
        this.b = transportContext;
        this.c = n3;
        this.d = runnable2;
    }

    public final void run() {
        int n3 = this.c;
        Runnable runnable2 = this.d;
        Uploader uploader = this.a;
        TransportContext transportContext = this.b;
        Uploader.i(uploader, transportContext, n3, runnable2);
    }
}

