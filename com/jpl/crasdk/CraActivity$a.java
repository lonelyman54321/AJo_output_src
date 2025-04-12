/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.jpl.crasdk;

import androidx.activity.result.ActivityResult;
import com.jpl.crasdk.CraActivity;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class CraActivity$a
implements w3 {
    public final /* synthetic */ CraActivity a;

    public CraActivity$a(CraActivity craActivity) {
        this.a = craActivity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Object object) {
        object = (ActivityResult)object;
        Object object2 = "strBuilder.toString()";
        int n3 = ((ActivityResult)object).a;
        int n4 = -1;
        if (n3 != n4) return;
        object = ((ActivityResult)object).b;
        if (object == null) return;
        Intrinsics.checkNotNull(object);
        CharSequence charSequence = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
        object = object.getStringExtra((String)charSequence);
        try {
            charSequence = new StringBuilder();
            Intrinsics.checkNotNull(object);
            n4 = ((String)object).length();
            int n7 = 0;
            String string2 = null;
            while (true) {
                if (n7 >= n4) {
                    object = "strBuilder ";
                    Object object3 = ((StringBuilder)charSequence).toString();
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    string2 = "tag";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = "msg";
                    Intrinsics.checkNotNullParameter(object3, (String)object);
                    object = ((StringBuilder)charSequence).toString();
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    int n8 = 6;
                    object = ((String)object).substring(0, n8);
                    object2 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object2 = this.a;
                    object2.getClass();
                    charSequence = new JSONObject();
                    object3 = "otp";
                    charSequence.put((String)object3, object);
                    charSequence = ((CraActivity)object2).Y;
                    if (charSequence == null) return;
                    object3 = new ld0_1((CraActivity)object2, (String)object);
                    charSequence.post((Runnable)object3);
                    return;
                }
                char c2 = ((String)object).charAt(n7);
                boolean bl2 = Character.isDigit(c2);
                if (bl2) {
                    ((StringBuilder)charSequence).append(c2);
                }
                ++n7;
            }
        }
        catch (Exception exception) {
            return;
        }
    }
}

