/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

public final class H3
extends x3 {
    public final Intent a(Context context, Object object) {
        object = (Uri)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "input");
        context = new Intent("android.media.action.IMAGE_CAPTURE");
        context = context.putExtra("output", (Parcelable)object);
        Intrinsics.checkNotNullExpressionValue(context, "Intent(MediaStore.ACTION\u2026tore.EXTRA_OUTPUT, input)");
        return context;
    }

    public final x3$a b(Context context, Object object) {
        object = (Uri)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "input");
        return null;
    }

    public final Object c(int n3, Intent intent) {
        int n4 = -1;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }
}

