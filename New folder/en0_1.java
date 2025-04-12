/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/*
 * Renamed from EN0
 */
public final class en0_1
implements Provider {
    public final /* synthetic */ FirebaseApp a;

    public /* synthetic */ en0_1(FirebaseApp firebaseApp) {
        this.a = firebaseApp;
    }

    public final Object get() {
        return FirebaseInstallations.e(this.a);
    }
}

