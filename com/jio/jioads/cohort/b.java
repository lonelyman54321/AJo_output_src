/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.cohort;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.cohort.a;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    public final Context a;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final void a() {
        char c2;
        CharSequence charSequence;
        j.a("Inside fetchCohortForCSAI");
        Object object = this.a;
        Object object2 = j_0.o((Context)object, "master_config_pref");
        Object object3 = object.getPackageManager();
        int n3 = 0;
        Object object4 = null;
        Object object5 = null;
        if (object3 != null) {
            charSequence = object.getPackageName();
            object3 = object3.getPackageInfo((String)charSequence, 0);
        } else {
            c2 = '\u0000';
            object3 = null;
        }
        String string2 = "master_config_";
        charSequence = new StringBuilder(string2);
        if (object3 != null) {
            object3 = ((PackageInfo)object3).packageName;
        } else {
            c2 = '\u0000';
            object3 = null;
        }
        ((StringBuilder)charSequence).append((String)object3);
        object3 = ((StringBuilder)charSequence).toString();
        object2 = object2.getString((String)object3, null);
        if (object2 != null && (c2 = ((String)object2).length()) != '\u0000') {
            j.a("master config data available");
            object3 = new JSONObject((String)object2);
            object2 = "config";
            int n4 = object3.has((String)object2);
            if (n4 != 0 && (n4 = (object2 = object3.getJSONObject((String)object2)).has((String)(object3 = "ssai"))) != 0) {
                int n7;
                int n8;
                j.a("ssai config available");
                object2 = object2.getJSONObject((String)object3);
                object3 = object2.optString("vr");
                charSequence = "common_prefs";
                string2 = "";
                Object object6 = j_0.d((Context)object, (String)charSequence, 0, string2, "cgi_id");
                String string3 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object6, string3);
                object6 = (String)object6;
                Object object7 = j_0.d((Context)object, (String)charSequence, 0, string2, "cgi_ver");
                Intrinsics.checkNotNull(object7, string3);
                object7 = (String)object7;
                Object object8 = 0L;
                int n10 = 3;
                object8 = j_0.d((Context)object, (String)charSequence, n10, object8, "cgi_ts");
                String string4 = "null cannot be cast to non-null type kotlin.Long";
                Intrinsics.checkNotNull(object8, string4);
                object8 = (Long)object8;
                long l2 = (Long)object8;
                Object object9 = object2.optJSONObject("pacing");
                String string5 = "urls";
                object9 = object9 != null ? object9.optJSONArray(string5) : null;
                String string6 = "ue";
                object2 = object2.optJSONObject(string6);
                if (object2 != null) {
                    object2 = object2.optJSONArray(string5);
                } else {
                    n8 = 0;
                    object2 = null;
                }
                if (object9 != null && (n7 = object9.length()) > 0) {
                    Intrinsics.checkNotNull(object3);
                    n7 = ((String)object3).length();
                    if (n7 > 0) {
                        Intrinsics.checkNotNullParameter(object, "context");
                        string5 = "advid";
                        try {
                            object4 = j_0.d((Context)object, (String)charSequence, 0, string2, string5);
                        }
                        catch (Exception exception) {}
                        Intrinsics.checkNotNull(object4, string3);
                        object5 = object4 = (String)object4;
                        object4 = Utility.INSTANCE;
                        object = ((Utility)object4).getUidFromPreferences((Context)object);
                        if (object5 != null && (n3 = ((String)object5).length()) != 0 || object != null && (n3 = ((String)object).length()) != 0) {
                            if (object2 != null) {
                                long l3;
                                long l4;
                                long l7;
                                n8 = ((String)object7).length();
                                n3 = 1;
                                if (n8 > 0 && (n8 = Integer.parseInt((String)object3)) > (n4 = Integer.parseInt((String)object7)) || (n8 = (int)((l7 = (l4 = System.currentTimeMillis() - l2) - (l3 = 86400000L)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) > 0) {
                                    object2 = new StringBuilder("cohort version is greater than storage ");
                                    ((StringBuilder)object2).append((String)object3);
                                    ((StringBuilder)object2).append(" > ");
                                    ((StringBuilder)object2).append((String)object7);
                                    c2 = ' ';
                                    ((StringBuilder)object2).append(c2);
                                    j.a(((StringBuilder)object2).toString());
                                    charSequence = ", current time: ";
                                    object2 = D70.c(l2, "cohort storage time: ", (String)charSequence);
                                    l4 = System.currentTimeMillis();
                                    ((StringBuilder)object2).append(l4);
                                    ((StringBuilder)object2).append(c2);
                                    j.a(((StringBuilder)object2).toString());
                                    object2 = Executors.newFixedThreadPool(n3);
                                    object3 = new a(this, (JSONArray)object9, (String)object5, (String)object);
                                    object2.submit((Runnable)object3);
                                } else {
                                    n8 = ((String)object6).length();
                                    if (n8 == 0) {
                                        j.a("cohort ID not available in storage");
                                        object2 = Executors.newFixedThreadPool(n3);
                                        object3 = new a(this, (JSONArray)object9, (String)object5, (String)object);
                                        object2.submit((Runnable)object3);
                                    } else {
                                        object2 = " for version ";
                                        object3 = " stored at ";
                                        object = og_1.a("Cohort is available ", (String)object6, (String)object2, (String)object7, (String)object3);
                                        ((StringBuilder)object).append(l2);
                                        object = ((StringBuilder)object).toString();
                                        j.a((String)object);
                                    }
                                }
                            } else {
                                object = "UE urls are empty";
                                j.a((String)object);
                            }
                        } else {
                            object = "advId & uid not available";
                            j.a((String)object);
                        }
                    }
                }
            }
        }
    }
}

