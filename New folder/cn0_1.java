/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

/*
 * Renamed from CN0
 */
public final class cn0_1
implements OnFailureListener {
    public final void onFailure(Exception exception) {
        FirebaseCrashlytics.a(exception);
    }
}

