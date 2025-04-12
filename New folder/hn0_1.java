/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.installations.FirebaseInstallations;

/*
 * Renamed from HN0
 */
public final class hn0_1
implements Runnable {
    public final /* synthetic */ FirebaseInstallations a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ hn0_1(FirebaseInstallations firebaseInstallations, boolean bl2) {
        this.a = firebaseInstallations;
        this.b = bl2;
    }

    public final void run() {
        FirebaseInstallations firebaseInstallations = this.a;
        boolean bl2 = this.b;
        FirebaseInstallations.b(firebaseInstallations, bl2);
    }
}

