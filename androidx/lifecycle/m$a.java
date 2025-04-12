/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.w$b;
import kotlin.jvm.internal.Intrinsics;

public final class m$a
extends Zy0 {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        w$b.b(activity);
    }
}

