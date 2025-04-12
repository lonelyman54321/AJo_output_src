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
import androidx.work.b;
import com.google.android.play.core.assetpacks.bx;
import com.google.android.play.core.assetpacks.by;
import com.google.android.play.core.assetpacks.ca;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

final class bz
implements by {
    private final String a;
    private final b b;
    private final Bundle c;

    public /* synthetic */ bz(String string2, b b2, ca ca2) {
        this.c = ca2;
        this.a = string2;
        this.b = b2;
    }

    public static /* bridge */ /* synthetic */ Bundle h(bz bz2) {
        return bz2.c;
    }

    public final List a(String arrayList) {
        int n3;
        String[] stringArray = this.a;
        ArrayList<String> arrayList2 = this.b;
        stringArray = stringArray.concat((String)((Object)arrayList));
        if ((stringArray = ((b)((Object)arrayList2)).d((String)stringArray)) == null) {
            arrayList = new ArrayList();
            return arrayList;
        }
        int n4 = stringArray.length;
        arrayList2 = new ArrayList<String>(n4);
        for (n4 = 0; n4 < (n3 = stringArray.length); ++n4) {
            boolean bl2 = true;
            String string2 = stringArray[n4];
            boolean bl3 = string2.isEmpty();
            if (bl2 == bl3) {
                n3 = 0;
                string2 = null;
            }
            arrayList2.add(string2);
        }
        this.c.putStringArrayList(arrayList, arrayList2);
        return arrayList2;
    }

    public final void b(String string2) {
        string2 = this.a;
        Bundle bundle = this.c;
        Object object = this.b;
        String string3 = "notification_intent_reconstruct_from_data";
        string2 = string2.concat(string3);
        object.getClass();
        Intrinsics.checkNotNullParameter(string2, "key");
        Object object2 = Boolean.FALSE;
        object = ((b)object).a;
        string2 = ((HashMap)object).get(string2);
        boolean bl2 = string2 instanceof Boolean;
        if (bl2) {
            object2 = string2;
        }
        boolean bl3 = (Boolean)object2;
        bundle.putBoolean(string3, bl3);
    }

    public final void c(String string2) {
        String string3 = this.a;
        b b2 = this.b;
        string3 = string3.concat(string2);
        int n3 = b2.b(string3);
        this.c.putInt(string2, n3);
    }

    public final void d(String string2) {
        int n3;
        String[] stringArray = new StringBuilder();
        Object object = this.a;
        String string3 = ":intent_data";
        stringArray = BW0.b((StringBuilder)stringArray, (String)object, string2, string3);
        object = this.b;
        if ((stringArray = ((b)object).d((String)stringArray)) == null) {
            return;
        }
        int n4 = stringArray.length;
        object = new Object(n4);
        string3 = null;
        for (n4 = 0; n4 < (n3 = stringArray.length); ++n4) {
            String string4 = stringArray[n4];
            boolean bl2 = string4.isEmpty();
            if (bl2) {
                n3 = 0;
                string4 = null;
            } else {
                Intent intent = new Intent();
                string4 = Uri.parse((String)string4);
                string4 = intent.setData((Uri)string4);
            }
            ((ArrayList)object).add(string4);
        }
        this.c.putParcelableArrayList(string2, object);
    }

    public final /* synthetic */ void e(String string2) {
        bx.a(this, string2);
    }

    public final void f(String string2, long l2) {
        String string3 = this.a;
        b b2 = this.b;
        string3 = string3.concat(string2);
        b2.getClass();
        String string4 = "key";
        Intrinsics.checkNotNullParameter(string3, string4);
        Long l3 = l2;
        Object v4 = b2.a.get(string3);
        boolean bl2 = v4 instanceof Long;
        if (bl2) {
            l3 = v4;
        }
        l2 = ((Number)l3).longValue();
        this.c.putLong(string2, l2);
    }

    public final void g(String string2) {
        String string3 = this.a;
        b b2 = this.b;
        string3 = string3.concat(string2);
        string3 = b2.c(string3);
        this.c.putString(string2, string3);
    }
}

