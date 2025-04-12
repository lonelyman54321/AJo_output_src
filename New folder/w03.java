/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;

public final class w03
implements Runnable {
    public final /* synthetic */ SessionManager a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ PerfSession c;

    public /* synthetic */ w03(SessionManager sessionManager2, Context context, PerfSession perfSession) {
        this.a = sessionManager2;
        this.b = context;
        this.c = perfSession;
    }

    public final void run() {
        Context context = this.b;
        PerfSession perfSession = this.c;
        SessionManager.a(this.a, context, perfSession);
    }
}

