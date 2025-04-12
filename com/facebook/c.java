/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import com.facebook.GraphRequest$e;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class c
implements GraphRequest$e {
    public final /* synthetic */ ArrayList a;

    public c(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        Object object = StringCompanionObject.INSTANCE;
        object = Locale.US;
        string3 = URLEncoder.encode(string3, "UTF-8");
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        objectArray[1] = string3;
        string2 = IV0.a(objectArray, n3, (Locale)object, "%s=%s", "format(locale, format, *args)");
        this.a.add(string2);
    }
}

