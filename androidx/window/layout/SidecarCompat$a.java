/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.IBinder
 *  android.text.TextUtils
 *  androidx.window.sidecar.SidecarInterface
 *  androidx.window.sidecar.SidecarProvider
 */
package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarCompat$a {
    public static IBinder a(Activity activity) {
        IBinder iBinder = null;
        if (activity != null && (activity = activity.getWindow()) != null && (activity = activity.getAttributes()) != null) {
            iBinder = activity.token;
        }
        return iBinder;
    }

    public static SidecarInterface b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SidecarProvider.getSidecarImpl((Context)context.getApplicationContext());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static nb3_1 c() {
        nb3_1 nb3_12 = null;
        try {
            String string2 = SidecarProvider.getApiVersion();
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (bl2) return nb3_12;
            return nB3$a.a(string2);
        }
        catch (NoClassDefFoundError | UnsupportedOperationException throwable) {
            return nb3_12;
        }
    }
}

