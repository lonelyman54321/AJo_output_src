/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

public final class Un0
extends OI3 {
    public static final Un0 a;

    static {
        Un0 un0;
        a = un0 = new Object();
    }

    public final void a(Context context, String string2, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(string2, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
    }
}

