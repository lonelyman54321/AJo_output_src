/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 */
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class pT1 {
    public final Uri a;
    public final String b;
    public final String c;

    public pT1(Intent object) {
        Intrinsics.checkNotNullParameter(object, "intent");
        Uri uri = object.getData();
        String string2 = object.getAction();
        object = object.getType();
        this.a = uri;
        this.b = string2;
        this.c = object;
    }

    public final String toString() {
        String string2;
        CharSequence charSequence = new StringBuilder("NavDeepLinkRequest{");
        Object object = this.a;
        if (object != null) {
            string2 = " uri=";
            charSequence.append(string2);
            object = String.valueOf(object);
            charSequence.append((String)object);
        }
        if ((object = this.b) != null) {
            string2 = " action=";
            charSequence.append(string2);
            charSequence.append((String)object);
        }
        if ((object = this.c) != null) {
            string2 = " mimetype=";
            charSequence.append(string2);
            charSequence.append((String)object);
        }
        charSequence.append(" }");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

