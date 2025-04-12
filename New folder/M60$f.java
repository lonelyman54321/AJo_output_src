/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.ContentInfo
 */
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

public final class M60$f
implements M60$e {
    public final ClipData a;
    public final int b;
    public final int c;
    public final Uri d;
    public final Bundle e;

    public M60$f(M60$c object) {
        Object object2 = ((M60$c)object).a;
        object2.getClass();
        this.a = object2;
        int n3 = ((M60$c)object).b;
        if (n3 >= 0) {
            int n4 = 5;
            if (n3 <= n4) {
                this.b = n3;
                n3 = ((M60$c)object).c;
                n4 = n3 & 1;
                if (n4 == n3) {
                    this.c = n3;
                    object2 = ((M60$c)object).d;
                    this.d = object2;
                    object = ((M60$c)object).e;
                    this.e = object;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("Requested flags 0x");
                object2 = Integer.toHexString(n3);
                stringBuilder.append((String)object2);
                stringBuilder.append(", but only 0x");
                object2 = Integer.toHexString(1);
                stringBuilder.append((String)object2);
                stringBuilder.append(" are allowed");
                object2 = stringBuilder.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = Locale.US;
            object = new IllegalArgumentException("source is out of range of [0, 5] (too high)");
            throw object;
        }
        object2 = Locale.US;
        object = new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        throw object;
    }

    public final ClipData a() {
        return this.a;
    }

    public final ContentInfo b() {
        return null;
    }

    public final int getFlags() {
        return this.c;
    }

    public final int getSource() {
        return this.b;
    }

    public final String toString() {
        int n3;
        StringBuilder stringBuilder = new StringBuilder("ContentInfoCompat{clip=");
        Object object = this.a.getDescription();
        stringBuilder.append(object);
        object = ", source=";
        stringBuilder.append((String)object);
        int n4 = this.b;
        object = n4 != 0 ? (n4 != (n3 = 1) ? (n4 != (n3 = 2) ? (n4 != (n3 = 3) ? (n4 != (n3 = 4) ? (n4 != (n3 = 5) ? String.valueOf(n4) : "SOURCE_PROCESS_TEXT") : "SOURCE_AUTOFILL") : "SOURCE_DRAG_AND_DROP") : "SOURCE_INPUT_METHOD") : "SOURCE_CLIPBOARD") : "SOURCE_APP";
        stringBuilder.append((String)object);
        object = ", flags=";
        stringBuilder.append((String)object);
        n4 = this.c;
        n3 = n4 & 1;
        object = n3 != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(n4);
        stringBuilder.append((String)object);
        object = "";
        Object object2 = this.d;
        if (object2 == null) {
            object2 = object;
        } else {
            String string2 = ", hasLinkUri(";
            StringBuilder stringBuilder2 = new StringBuilder(string2);
            n3 = object2.toString().length();
            stringBuilder2.append(n3);
            stringBuilder2.append(")");
            object2 = stringBuilder2.toString();
        }
        stringBuilder.append((String)object2);
        object2 = this.e;
        if (object2 != null) {
            object = ", hasExtras";
        }
        return h30_0.a(stringBuilder, (String)object, "}");
    }
}

