/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.Intrinsics;

public final class G3
extends x3 {
    public final Intent a(Context context, Object object) {
        object = (Intent)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "input");
        return object;
    }

    public final Object c(int n3, Intent intent) {
        ActivityResult activityResult = new ActivityResult(n3, intent);
        return activityResult;
    }
}

