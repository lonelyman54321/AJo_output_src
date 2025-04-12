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

public final class y3
extends x3 {
    public final String a;

    public y3() {
        String string2 = "*/*";
        Intrinsics.checkNotNullParameter(string2, "mimeType");
        this.a = string2;
    }

    public final Intent a(Context context, Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "input");
        context = new Intent("android.intent.action.CREATE_DOCUMENT");
        String string2 = this.a;
        context = context.setType(string2).putExtra("android.intent.extra.TITLE", (String)object);
        Intrinsics.checkNotNullExpressionValue(context, "Intent(Intent.ACTION_CRE\u2026ntent.EXTRA_TITLE, input)");
        return context;
    }

    public final x3$a b(Context context, Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "input");
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

