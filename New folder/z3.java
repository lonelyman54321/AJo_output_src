/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class z3
extends x3 {
    public final Intent a(Context context, Object stringArray) {
        stringArray = stringArray;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stringArray, "input");
        context = new Intent("android.intent.action.OPEN_DOCUMENT");
        context = context.putExtra("android.intent.extra.MIME_TYPES", stringArray).setType("*/*");
        Intrinsics.checkNotNullExpressionValue(context, "Intent(Intent.ACTION_OPE\u2026          .setType(\"*/*\")");
        return context;
    }

    public final x3$a b(Context context, Object stringArray) {
        stringArray = stringArray;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stringArray, "input");
        return null;
    }

    public final Object c(int n3, Intent intent) {
        int n4 = -1;
        Uri uri = null;
        if (n3 != n4) {
            intent = null;
        }
        if (intent != null) {
            uri = intent.getData();
        }
        return uri;
    }
}

