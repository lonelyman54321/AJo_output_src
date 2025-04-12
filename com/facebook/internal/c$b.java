/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
package com.facebook.internal;

import android.net.Uri;
import com.facebook.FacebookSdk;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class c$b {
    public static Uri a(int n3, int n4, String string2, String string3) {
        CharSequence charSequence;
        String string4;
        int n7 = 2;
        Xz3.g(string2, "userId");
        int n8 = 0;
        String string5 = null;
        n3 = Math.max(n3, 0);
        n4 = Math.max(n4, 0);
        if (n3 == 0 && n4 == 0) {
            String string6 = "Either width or height must be greater than 0".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string6);
            throw illegalArgumentException;
        }
        Uri.Builder builder = Uri.parse((String)q03.b()).buildUpon();
        Object object = StringCompanionObject.INSTANCE;
        object = Locale.US;
        String string7 = FacebookSdk.e();
        Object[] objectArray = new Object[n7];
        objectArray[0] = string7;
        n8 = 1;
        objectArray[n8] = string2;
        string5 = "format(locale, format, *args)";
        string2 = IV0.a(objectArray, n7, (Locale)object, "%s/%s/picture", string5);
        string2 = builder.path(string2);
        if (n4 != 0) {
            String string8 = "height";
            string4 = String.valueOf(n4);
            string2.appendQueryParameter(string8, string4);
        }
        if (n3 != 0) {
            string4 = "width";
            charSequence = String.valueOf(n3);
            string2.appendQueryParameter(string4, (String)charSequence);
        }
        charSequence = "migration_overrides";
        string2.appendQueryParameter((String)charSequence, "{october_2012:true}");
        n3 = (int)(lz3_0.A(string3) ? 1 : 0);
        string4 = "access_token";
        if (n3 == 0) {
            string2.appendQueryParameter(string4, string3);
        } else {
            charSequence = FacebookSdk.c();
            n3 = (int)(lz3_0.A((String)charSequence) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(lz3_0.A((String)(charSequence = FacebookSdk.b())) ? 1 : 0)) == 0) {
                charSequence = new StringBuilder();
                string3 = FacebookSdk.b();
                ((StringBuilder)charSequence).append(string3);
                char c2 = '|';
                ((StringBuilder)charSequence).append(c2);
                string3 = FacebookSdk.c();
                ((StringBuilder)charSequence).append(string3);
                charSequence = ((StringBuilder)charSequence).toString();
                string2.appendQueryParameter(string4, (String)charSequence);
            }
        }
        charSequence = string2.build();
        Intrinsics.checkNotNullExpressionValue(charSequence, "builder.build()");
        return charSequence;
    }
}

