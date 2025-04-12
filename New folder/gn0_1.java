/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.Callable;

/*
 * Renamed from GN0
 */
public final class gn0_1
implements Callable {
    public final /* synthetic */ FirebaseInstallations a;

    public /* synthetic */ gn0_1(FirebaseInstallations firebaseInstallations) {
        this.a = firebaseInstallations;
    }

    public final Object call() {
        return FirebaseInstallations.a(this.a);
    }
}

