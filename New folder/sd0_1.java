/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sd0
 */
public final class sd0_1
extends yn3$b {
    public final FirebaseCrashlytics b;

    public sd0_1(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(...)");
        this.b = object;
    }

    public final void g(Exception exception) {
        this.b.recordException(exception);
    }

    public final void h(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "message");
        FirebaseCrashlytics firebaseCrashlytics = this.b;
        if (throwable == null) {
            firebaseCrashlytics.log(string2);
        } else {
            firebaseCrashlytics.log(string2);
            firebaseCrashlytics.recordException(throwable);
        }
    }
}

