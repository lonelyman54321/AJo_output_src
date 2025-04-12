/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONArray
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.multiad.t;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class j {
    public final /* synthetic */ t a;

    public j(t t3) {
        this.a = t3;
    }

    public final int a(Context object, String string2) {
        int n3;
        block14: {
            String string3 = "context";
            Intrinsics.checkNotNullParameter(object, string3);
            String string4 = "campaignID";
            Intrinsics.checkNotNullParameter(string2, string4);
            Object object2 = this.a;
            object2.getClass();
            String string5 = "playedAdWithWeight_";
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(string2, string4);
            n3 = 0;
            string3 = null;
            string4 = "multiad_pref";
            CharSequence charSequence = new StringBuilder(string5);
            object2 = ((t)object2).a;
            charSequence.append((String)object2);
            object2 = charSequence.toString();
            string5 = "";
            object = j_0.d(object, string4, 0, string5, (String)object2);
            string4 = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(object, string4);
            object = (String)object;
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) break block14;
            string4 = new JSONArray((String)object);
            int n4 = string4.length();
            object2 = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                try {
                    string5 = string4.getJSONObject(i3);
                    charSequence = "getJSONObject(...)";
                }
                catch (Exception exception) {}
                Intrinsics.checkNotNullExpressionValue(string5, (String)charSequence);
                boolean bl3 = string5.has(string2);
                if (!bl3) continue;
                n3 = string5.getInt(string2);
                break;
            }
        }
        return n3;
    }
}

