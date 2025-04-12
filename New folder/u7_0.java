/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.FirebasePerformance;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;

/*
 * Renamed from u7
 */
public final class u7_0
implements jn_0 {
    public final void a() {
        FirebasePerformance firebasePerformance = FirebasePerformance.getInstance();
        z40$a z40$a = z40_0.Companion;
        boolean bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("performanceMonitor");
        firebasePerformance.setPerformanceCollectionEnabled(bl2);
    }
}

