/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.work.b$a;
import com.google.android.play.core.assetpacks.bx;
import com.google.android.play.core.assetpacks.by;
import com.google.android.play.core.assetpacks.ca;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

final class bw
implements by {
    private final String a;
    private final Bundle b;
    private final b$a c;

    public /* synthetic */ bw(String string2, Bundle bundle, b$a b$a, ca ca2) {
        this.a = string2;
        this.b = bundle;
        this.c = b$a;
    }

    public final List a(String object) {
        int n3;
        ArrayList arrayList = this.b.getStringArrayList((String)object);
        if (arrayList == null) {
            object = new ArrayList();
            return object;
        }
        int n4 = arrayList.size();
        String[] stringArray = new String[n4];
        b$a b$a = null;
        for (int i3 = 0; i3 < (n3 = arrayList.size()); ++i3) {
            String string2 = (String)arrayList.get(i3);
            if (string2 == null) {
                string2 = "";
            }
            stringArray[i3] = string2;
        }
        b$a = this.c;
        object = this.a.concat((String)object);
        b$a.getClass();
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(stringArray, "value");
        b$a.a.put(object, stringArray);
        return arrayList;
    }

    public final void b(String object) {
        object = this.b;
        String string2 = this.a;
        b$a b$a = this.c;
        String string3 = "notification_intent_reconstruct_from_data";
        string2 = string2.concat(string3);
        boolean bl2 = object.getBoolean(string3);
        b$a.getClass();
        Intrinsics.checkNotNullParameter(string2, "key");
        object = bl2;
        b$a.a.put(string2, object);
    }

    public final void c(String object) {
        Bundle bundle = this.b;
        String string2 = this.a;
        b$a b$a = this.c;
        string2 = string2.concat((String)object);
        int n3 = bundle.getInt((String)object);
        b$a.getClass();
        Intrinsics.checkNotNullParameter(string2, "key");
        object = n3;
        b$a.a.put(string2, object);
    }

    public final void d(String string2) {
        Object object;
        int n3;
        Object object2 = this.b.getParcelableArrayList(string2);
        if (object2 == null) {
            return;
        }
        int n4 = ((ArrayList)object2).size();
        String[] stringArray = new String[n4];
        String string3 = null;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)object2).size()); ++i3) {
            Uri uri;
            object = (Intent)((ArrayList)object2).get(i3);
            object = object != null && (uri = object.getData()) != null ? object.getData().toString() : "";
            stringArray[i3] = object;
        }
        object2 = this.c;
        string3 = this.a;
        object = new StringBuilder();
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(":intent_data");
        string2 = ((StringBuilder)object).toString();
        object2.getClass();
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(stringArray, "value");
        ((b$a)object2).a.put(string2, stringArray);
    }

    public final /* synthetic */ void e(String string2) {
        bx.a(this, string2);
    }

    public final void f(String object, long l2) {
        Bundle bundle = this.b;
        String string2 = this.a;
        b$a b$a = this.c;
        string2 = string2.concat((String)object);
        long l3 = bundle.getLong((String)object, l2);
        b$a.getClass();
        Intrinsics.checkNotNullParameter(string2, "key");
        object = l3;
        b$a.a.put(string2, object);
    }

    public final void g(String string2) {
        String string3 = this.b.getString(string2);
        if (string3 == null) {
            return;
        }
        b$a b$a = this.c;
        string2 = this.a.concat(string2);
        b$a.getClass();
        Intrinsics.checkNotNullParameter(string2, "key");
        b$a.a.put(string2, string3);
    }
}

