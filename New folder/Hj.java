/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

public class Hj
extends jD3 {
    private final Application application;

    public Hj(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    public Application getApplication() {
        Application application = this.application;
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }
}

