/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.i$b;
import androidx.navigation.d;
import androidx.navigation.i;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class d$a {
    public static d a(Context context, i i3, Bundle bundle, i$b i$b, eu1_0 eu1_02) {
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(i3, "destination");
        Intrinsics.checkNotNullParameter((Object)i$b, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(string2, "id");
        d d2 = new d(context, i3, bundle, i$b, eu1_02, string2, null);
        return d2;
    }
}

