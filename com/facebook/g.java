/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcelable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook;

import android.content.Intent;
import android.os.Parcelable;
import com.facebook.Profile;
import com.facebook.g$a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    public static final g$a d;
    public static volatile g e;
    public final Xv1 a;
    public final fb2_0 b;
    public Profile c;

    static {
        g$a g$a;
        d = g$a = new Object();
    }

    public g(Xv1 xv1, fb2_0 fb2_02) {
        Intrinsics.checkNotNullParameter(xv1, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(fb2_02, "profileCache");
        this.a = xv1;
        this.b = fb2_02;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Profile object, boolean bl2) {
        Object object2;
        String string2;
        Object object3 = this.c;
        this.c = object;
        if (bl2) {
            string2 = "com.facebook.ProfileManager.CachedProfile";
            object2 = this.b;
            if (object != null) {
                void var6_8;
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, "profile");
                JSONObject jSONObject = new JSONObject();
                String string3 = "id";
                try {
                    String string4 = ((Profile)object).a;
                    jSONObject.put(string3, (Object)string4);
                    string3 = "first_name";
                    string4 = ((Profile)object).b;
                    jSONObject.put(string3, (Object)string4);
                    string3 = "middle_name";
                    string4 = ((Profile)object).c;
                    jSONObject.put(string3, (Object)string4);
                    string3 = "last_name";
                    string4 = ((Profile)object).d;
                    jSONObject.put(string3, (Object)string4);
                    string3 = "name";
                    string4 = ((Profile)object).e;
                    jSONObject.put(string3, (Object)string4);
                    string3 = ((Profile)object).f;
                    if (string3 != null) {
                        string4 = "link_uri";
                        string3 = string3.toString();
                        jSONObject.put(string4, (Object)string3);
                    }
                    if ((string3 = ((Profile)object).g) != null) {
                        string4 = "picture_uri";
                        string3 = string3.toString();
                        jSONObject.put(string4, (Object)string3);
                    }
                }
                catch (JSONException jSONException) {
                    Object var6_7 = null;
                }
                if (var6_8 != null) {
                    object2 = ((fb2_0)object2).a.edit();
                    String string5 = var6_8.toString();
                    string2 = object2.putString(string2, string5);
                    string2.apply();
                }
            } else {
                object2 = ((fb2_0)object2).a.edit();
                string2 = object2.remove(string2);
                string2.apply();
            }
        }
        if (!(bl2 = lz3_0.a(object3, object))) {
            string2 = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            object2 = "com.facebook.sdk.EXTRA_OLD_PROFILE";
            string2.putExtra((String)object2, (Parcelable)object3);
            object3 = "com.facebook.sdk.EXTRA_NEW_PROFILE";
            string2.putExtra((String)object3, (Parcelable)object);
            object = this.a;
            ((Xv1)object).c((Intent)string2);
        }
    }
}

