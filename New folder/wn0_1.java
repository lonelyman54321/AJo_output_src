/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;

/*
 * Renamed from wN0
 */
public final class wn0_1
implements Provider {
    public final /* synthetic */ FirebaseApp a;
    public final /* synthetic */ Context b;

    public /* synthetic */ wn0_1(FirebaseApp firebaseApp, Context context) {
        this.a = firebaseApp;
        this.b = context;
    }

    public final Object get() {
        FirebaseApp firebaseApp = this.a;
        Context context = this.b;
        return FirebaseApp.b(firebaseApp, context);
    }
}

