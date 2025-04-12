/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Pair
 */
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iq0
 */
public final class iq0_0
extends x3 {
    public final Intent a(Context context, Object object) {
        object = (Intent)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "input");
        return object;
    }

    public final Object c(int n3, Intent intent) {
        Pair pair = Pair.create((Object)n3, (Object)intent);
        Intrinsics.checkNotNullExpressionValue(pair, "create(resultCode, intent)");
        return pair;
    }
}

