/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseApp$BackgroundStateChangeListener;

/*
 * Renamed from xN0
 */
public final class xn0_1
implements FirebaseApp$BackgroundStateChangeListener {
    public final /* synthetic */ FirebaseApp a;

    public /* synthetic */ xn0_1(FirebaseApp firebaseApp) {
        this.a = firebaseApp;
    }

    public final void onBackgroundStateChanged(boolean bl2) {
        FirebaseApp.a(this.a, bl2);
    }
}

