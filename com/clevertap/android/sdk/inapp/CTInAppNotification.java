/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.CTInAppNotification$a;
import com.clevertap.android.sdk.inapp.CTInAppNotification$b;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public class CTInAppNotification
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String A;
    public char B;
    public boolean C;
    public long D;
    public String E;
    public String F;
    public int G;
    public int H;
    public String I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public CustomTemplateInAppData O;
    public String a;
    public JSONObject b;
    public String c;
    public int d;
    public ArrayList e;
    public String f;
    public JSONObject g;
    public String h;
    public boolean i;
    public String j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;
    public String o;
    public String p;
    public ei_1 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public JSONObject v;
    public String w;
    public int x;
    public ArrayList y;
    public String z;

    static {
        CTInAppNotification$a cTInAppNotification$a = new Object();
        CREATOR = cTInAppNotification$a;
    }

    public CTInAppNotification() {
        ArrayList arrayList;
        this.e = arrayList = new ArrayList();
        this.y = arrayList = new ArrayList();
        this.M = false;
        this.N = false;
    }

    public static Bundle b(JSONObject jSONObject) {
        boolean bl2;
        Bundle bundle = new Bundle();
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            String string2 = (String)iterator.next();
            Object object = jSONObject.get(string2);
            boolean bl4 = object instanceof String;
            if (bl4) {
                object = (String)object;
                bundle.putString(string2, (String)object);
            }
            bl4 = object instanceof Character;
            if (bl4) {
                object = (Character)object;
                bl3 = ((Character)object).charValue();
                bundle.putChar(string2, (char)(bl3 ? 1 : 0));
                continue;
            }
            bl4 = object instanceof Integer;
            if (bl4) {
                object = (Integer)object;
                bl3 = ((Integer)object).intValue();
                bundle.putInt(string2, (int)(bl3 ? 1 : 0));
                continue;
            }
            bl4 = object instanceof Float;
            if (bl4) {
                object = (Float)object;
                float f5 = ((Float)object).floatValue();
                bundle.putFloat(string2, f5);
                continue;
            }
            bl4 = object instanceof Double;
            if (bl4) {
                object = (Double)object;
                double d2 = (Double)object;
                bundle.putDouble(string2, d2);
                continue;
            }
            bl4 = object instanceof Long;
            if (bl4) {
                object = (Long)object;
                long l2 = (Long)object;
                bundle.putLong(string2, l2);
                continue;
            }
            bl4 = object instanceof Boolean;
            if (bl4) {
                object = (Boolean)object;
                bl3 = (Boolean)object;
                bundle.putBoolean(string2, bl3);
                continue;
            }
            bl4 = object instanceof JSONObject;
            if (!bl4) continue;
            object = (JSONObject)object;
            object = CTInAppNotification.b((JSONObject)object);
            try {
                bundle.putBundle(string2, (Bundle)object);
            }
            catch (JSONException jSONException) {
                com.clevertap.android.sdk.b.j();
            }
        }
        return bundle;
    }

    public static boolean f(Bundle object, String string2, Class clazz) {
        boolean bl2;
        boolean bl3 = object.containsKey(string2);
        if (bl3 && (bl2 = (object = object.get(string2).getClass()).equals(clazz))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JSONObject var1_1) {
        block46: {
            var2_2 = this;
            var3_3 = var1_1;
            var4_6 = "message";
            var5_7 = "title";
            var6_8 = "wzrk_ttl";
            var7_9 = "hasLandscape";
            var8_10 = "hasPortrait";
            var9_11 = "bg";
            var10_12 = "tablet";
            var11_13 = "mdc";
            var12_14 = "tdc";
            var13_15 = "tlc";
            var14_16 = "buttons";
            var15_17 = "fallbackToNotificationSettings";
            var16_18 = "mediaLandscape";
            var17_19 = "isLocalInApp";
            var18_20 = "media";
            var19_21 = "wzrk_id";
            var20_22 = "close";
            var21_23 = "ti";
            var22_24 = var1_1.has(var21_23);
            var23_25 = "";
            var21_23 = var22_24 != false ? var1_1.getString(var21_23) : var23_25;
            var2_2.p = var21_23;
            var24_26 = var3_3.has((String)var19_21);
            var19_21 = var24_26 != 0 ? var3_3.getString((String)var19_21) : var23_25;
            var2_2.f = var19_21;
            var19_21 = "type";
            var19_21 = var3_3.getString((String)var19_21);
            var2_2.I = var19_21;
            var25_27 = var3_3.has(var17_19);
            var24_26 = 1;
            var22_24 = false;
            if (var25_27 && (var26_28 = var3_3.getBoolean(var17_19)) != 0) {
                var26_28 = 1;
            } else {
                var26_28 = 0;
                var17_19 = null;
            }
            var2_2.M = var26_28;
            var26_28 = var3_3.has((String)var15_17);
            if (var26_28 != 0 && (var27_29 = var3_3.getBoolean((String)var15_17)) != 0) {
                var27_29 = 1;
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            var2_2.N = var27_29;
            var15_17 = "efc";
            var26_28 = -1;
            var27_29 = var3_3.optInt((String)var15_17, var26_28);
            if (var27_29 != var24_26 && (var27_29 = var3_3.optInt((String)(var15_17 = "excludeGlobalFCaps"), var26_28)) != var24_26) {
                var27_29 = 0;
                var15_17 = null;
            } else {
                var27_29 = 1;
            }
            var2_2.k = var27_29;
            var27_29 = (int)var3_3.has(var13_15);
            var27_29 = var27_29 != 0 ? var3_3.getInt(var13_15) : -1;
            var2_2.H = var27_29;
            var27_29 = (int)var3_3.has(var12_14);
            var27_29 = var27_29 != 0 ? var3_3.getInt(var12_14) : -1;
            var2_2.G = var27_29;
            var27_29 = (int)var3_3.has(var11_13);
            if (var27_29 != 0) {
                var26_28 = var3_3.getInt(var11_13);
            }
            var2_2.x = var26_28;
            var15_17 = var2_2.I;
            var15_17 = ei_1.fromString((String)var15_17);
            var2_2.q = var15_17;
            var27_29 = (int)var3_3.has(var10_12);
            if (var27_29 != 0 && (var27_29 = (int)var3_3.getBoolean(var10_12)) != 0) {
                var27_29 = 1;
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            var2_2.t = var27_29;
            var27_29 = (int)var3_3.has(var9_11);
            var15_17 = var27_29 != 0 ? var3_3.getString(var9_11) : "#FFFFFF";
            var2_2.c = var15_17;
            var27_29 = (int)var3_3.has(var8_10);
            if (var27_29 != 0 && (var27_29 = (int)var3_3.getBoolean(var8_10)) == 0) {
                var27_29 = 0;
                var15_17 = null;
            } else {
                var27_29 = 1;
            }
            var2_2.s = var27_29;
            var27_29 = (int)var3_3.has(var7_9);
            if (var27_29 != 0 && (var27_29 = (int)var3_3.getBoolean(var7_9)) != 0) {
                var27_29 = 1;
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            var2_2.r = var27_29;
            var27_29 = (int)var3_3.has((String)var6_8);
            if (var27_29 != 0) {
                var28_30 = var3_3.getLong((String)var6_8);
            } else {
                var28_30 = System.currentTimeMillis();
                var30_31 = 172800000L;
                var28_30 += var30_31;
            }
            var2_2.D = var28_30;
            var27_29 = (int)var3_3.has((String)var5_7);
            var26_28 = 0;
            var17_19 = null;
            if (var27_29 != 0) {
                var15_17 = var3_3.getJSONObject((String)var5_7);
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            var19_21 = "#000000";
            var5_7 = "color";
            var6_8 = "text";
            if (var15_17 != null) {
                var32_32 = var15_17.has((String)var6_8);
                var7_9 = var32_32 != false ? var15_17.getString((String)var6_8) : var23_25;
                var2_2.E = var7_9;
                var32_32 = var15_17.has((String)var5_7);
                var15_17 = var32_32 != false ? var15_17.getString((String)var5_7) : var19_21;
                var2_2.F = var15_17;
            }
            if ((var27_29 = (int)var3_3.has((String)var4_6)) != 0) {
                var15_17 = var3_3.getJSONObject((String)var4_6);
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            if (var15_17 != null) {
                var33_33 = var15_17.has((String)var6_8);
                if (var33_33 != 0) {
                    var23_25 = var15_17.getString((String)var6_8);
                }
                var4_6 = var23_25;
                var2_2.z = var23_25;
                var33_33 = var15_17.has((String)var5_7);
                if (var33_33 != 0) {
                    var19_21 = var15_17.getString((String)var5_7);
                }
                var2_2.A = var19_21;
            }
            var15_17 = var20_22;
            var25_27 = var3_3.has(var20_22);
            if (var25_27 && (var27_29 = (int)var3_3.getBoolean(var20_22)) != 0) {
                var27_29 = 1;
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            var2_2.n = var27_29;
            var15_17 = var18_20;
            var25_27 = var3_3.has(var18_20);
            if (var25_27) {
                var15_17 = var3_3.getJSONObject(var18_20);
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            var19_21 = var2_2.y;
            if (var15_17 != null && (var15_17 = (var4_6 = new CTInAppNotificationMedia()).a((JSONObject)var15_17, var24_26)) != null) {
                var19_21.add(var15_17);
            }
            var15_17 = var16_18;
            var33_33 = var3_3.has(var16_18);
            if (var33_33 != 0) {
                var15_17 = var3_3.getJSONObject(var16_18);
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            if (var15_17 != null && (var15_17 = (var4_6 = new CTInAppNotificationMedia()).a((JSONObject)var15_17, var34_34 = 2)) != null) {
                var19_21.add(var15_17);
            }
            var15_17 = var14_16;
            var33_33 = var3_3.has(var14_16);
            if (var33_33 != 0) {
                var15_17 = var3_3.getJSONArray(var14_16);
            } else {
                var27_29 = 0;
                var15_17 = null;
            }
            if (var15_17 != null) {
                var4_6 = null;
                for (var33_33 = 0; var33_33 < (var34_34 = var15_17.length()); ++var33_33) {
                    var5_7 = new CTInAppNotificationButton();
                    var6_8 = var15_17.getJSONObject(var33_33);
                    var5_7.a((JSONObject)var6_8);
                    var6_8 = var5_7.d;
                    if (var6_8 != null) continue;
                    var6_8 = var2_2.e;
                    var6_8.add(var5_7);
                    var2_2.d = var34_34 = var2_2.d + var24_26;
                }
            }
            var15_17 = CustomTemplateInAppData.CREATOR;
            var15_17.getClass();
            var3_3 = CustomTemplateInAppData$a.a(var1_1);
            var2_2.O = var3_3;
            var3_3 = CTInAppNotification$b.a;
            var15_17 = var2_2.q;
            var27_29 = var15_17.ordinal();
            var35_35 /* !! */  = var3_3[var27_29];
            switch (var35_35 /* !! */ ) {
                default: {
                    return;
                }
                case 5: 
                case 6: 
                case 7: {
                    try {
                        var35_35 /* !! */  = (JSONObject)var19_21.isEmpty();
                        if (var35_35 /* !! */  != false) {
                            var2_2.j = var3_3 = "No media type for template";
                            return;
                        }
                        var3_3 = var19_21.iterator();
                        while ((var27_29 = (int)var3_3.hasNext()) != 0) {
                            var15_17 = var3_3.next();
                            var26_28 = (int)(var15_17 = (CTInAppNotificationMedia)var15_17).c();
                            if (var26_28 == 0 && (var26_28 = (int)var15_17.b()) == 0 && (var26_28 = (int)var15_17.f()) == 0 && (var27_29 = (int)var15_17.e()) != 0) continue;
                            var2_2.j = var15_17 = "Wrong media type for template";
                        }
                        return;
                    }
                    catch (JSONException var3_4) {}
                }
                break;
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    var3_3 = var19_21.iterator();
                    break block46;
                }
            }
            var17_19 = "Invalid JSON";
            var15_17 = new StringBuilder(var17_19);
            var3_5 = var3_4.getLocalizedMessage();
            var15_17.append(var3_5);
            var2_2.j = var3_5 = var15_17.toString();
            return;
        }
        while ((var27_29 = (int)var3_3.hasNext()) != 0) {
            var15_17 = var3_3.next();
            var25_27 = (var15_17 = (CTInAppNotificationMedia)var15_17).c();
            if (!var25_27 && !(var25_27 = var15_17.b()) && !(var25_27 = var15_17.f())) continue;
            var15_17.d = null;
            com.clevertap.android.sdk.b.c();
            ** break;
lbl230:
            // 1 sources

        }
    }

    public final CTInAppNotificationMedia c(int n3) {
        CTInAppNotificationMedia cTInAppNotificationMedia;
        block1: {
            boolean bl2;
            Iterator iterator = this.y.iterator();
            while (bl2 = iterator.hasNext()) {
                cTInAppNotificationMedia = (CTInAppNotificationMedia)iterator.next();
                int n4 = cTInAppNotificationMedia.a;
                if (n3 != n4) continue;
                break block1;
            }
            bl2 = false;
            cTInAppNotificationMedia = null;
        }
        return cTInAppNotificationMedia;
    }

    public final int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(JSONObject jSONObject, boolean bl2) {
        JSONException jSONException2;
        String string2;
        block5: {
            String string3;
            block4: {
                block3: {
                    string2 = "type";
                    this.J = bl2;
                    this.v = jSONObject;
                    try {
                        bl2 = jSONObject.has(string2);
                        if (!bl2) break block3;
                        string3 = jSONObject.getString(string2);
                        break block4;
                    }
                    catch (JSONException jSONException2) {
                        break block5;
                    }
                }
                bl2 = false;
                string3 = null;
            }
            this.I = string3;
            if (string3 != null && !(bl2 = string3.equals(string2 = "custom-html"))) {
                this.a(jSONObject);
                return;
            }
            this.g(jSONObject);
            return;
        }
        string2 = "Invalid JSON : ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        String string4 = jSONException2.getLocalizedMessage();
        stringBuilder.append(string4);
        this.j = string4 = stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(JSONObject jSONObject) {
        Object object;
        block37: {
            block35: {
                String string2;
                block33: {
                    int n3;
                    int n4;
                    int n7;
                    String string3;
                    String string4;
                    String string5;
                    JSONObject jSONObject2;
                    String string6;
                    Object object2;
                    String string7;
                    Class<String> clazz;
                    String string8;
                    Object object3;
                    String string9;
                    String string10;
                    String string11;
                    String string12;
                    String string13;
                    String string14;
                    String string15;
                    String string16;
                    String string17;
                    String string18;
                    String string19;
                    String string20;
                    String string21;
                    String string22;
                    CTInAppNotification cTInAppNotification;
                    block34: {
                        cTInAppNotification = this;
                        object = jSONObject;
                        string22 = "wzrk_id";
                        string21 = "ti";
                        string20 = "html";
                        string19 = "sc";
                        string18 = "dk";
                        string17 = "w";
                        string2 = "Invalid JSON";
                        string16 = "pos";
                        string15 = "mdc";
                        string14 = "ydp";
                        string13 = "kv";
                        string12 = "xdp";
                        string11 = "url";
                        string10 = "d";
                        string9 = "wzrk_ttl";
                        object3 = CTInAppNotification.b(jSONObject);
                        string8 = "isJsEnabled";
                        clazz = String.class;
                        string7 = "tdc";
                        object2 = Boolean.class;
                        string6 = "tlc";
                        jSONObject2 = Integer.class;
                        string5 = string22;
                        try {
                            string22 = object3.getBundle(string17);
                            object3 = object3.getBundle(string10);
                            if (string22 == null || object3 == null) break block33;
                            boolean bl2 = CTInAppNotification.f((Bundle)string22, string12, jSONObject2);
                            string4 = string12;
                            string12 = "xp";
                            if (!bl2 && !(bl2 = CTInAppNotification.f((Bundle)string22, string12, jSONObject2))) break block33;
                            bl2 = CTInAppNotification.f((Bundle)string22, string14, jSONObject2);
                            string3 = string14;
                            string14 = "yp";
                            if (bl2 || (n7 = CTInAppNotification.f((Bundle)string22, string14, jSONObject2)) != 0) break block34;
                            break block33;
                        }
                        catch (Throwable throwable) {
                            object = string2;
                            break block35;
                        }
                    }
                    n7 = CTInAppNotification.f((Bundle)string22, string18, object2);
                    if (n7 != 0 && (n4 = CTInAppNotification.f((Bundle)string22, string19, object2)) != 0 && (n3 = CTInAppNotification.f((Bundle)object3, string20, clazz)) != 0 && (n3 = CTInAppNotification.f((Bundle)string22, string16, clazz)) != 0) {
                        object3 = string22.getString(string16);
                        int n8 = 0;
                        clazz = null;
                        n3 = ((String)object3).charAt(0);
                        n4 = 116;
                        n7 = 98;
                        int n10 = 99;
                        if (n3 == n7 || n3 == n10 || n3 == (n10 = 108) || n3 == (n10 = 114) || n3 == n4) {
                            block36: {
                                int n14;
                                int n15;
                                long l2;
                                int n16;
                                try {
                                    n3 = (int)(object.has(string21) ? 1 : 0);
                                    string22 = "";
                                    object3 = n3 != 0 ? object.getString(string21) : string22;
                                    cTInAppNotification.p = object3;
                                    object3 = string5;
                                    n16 = object.has(string5);
                                    object3 = n16 != 0 ? object.getString(string5) : string22;
                                }
                                catch (JSONException jSONException) {
                                    object = string2;
                                    break block36;
                                }
                                cTInAppNotification.f = object3;
                                object3 = "efc";
                                n16 = -1;
                                n3 = object.optInt((String)object3, n16);
                                n7 = 1;
                                if (n3 != n7 && (n3 = object.optInt((String)(object3 = "excludeGlobalFCaps"), n16)) != n7) {
                                    n3 = 0;
                                    object3 = null;
                                } else {
                                    n3 = 1;
                                }
                                cTInAppNotification.k = n3;
                                object3 = string6;
                                boolean bl3 = object.has(string6);
                                n3 = bl3 ? object.getInt(string6) : -1;
                                cTInAppNotification.H = n3;
                                object3 = string7;
                                boolean bl4 = object.has(string7);
                                n3 = bl4 ? object.getInt(string7) : -1;
                                cTInAppNotification.G = n3;
                                object3 = string8;
                                boolean bl5 = object.has(string8);
                                if (!bl5 || (n3 = (int)(object.getBoolean(string8) ? 1 : 0)) == 0) {
                                    n7 = 0;
                                    jSONObject2 = null;
                                }
                                cTInAppNotification.u = n7;
                                object3 = string9;
                                n7 = (int)(object.has(string9) ? 1 : 0);
                                if (n7 != 0) {
                                    l2 = object.getLong(string9);
                                } else {
                                    l2 = System.currentTimeMillis() + 172800000L;
                                    long l3 = 1000L;
                                    l2 /= l3;
                                }
                                cTInAppNotification.D = l2;
                                n4 = (int)(object.has(string10) ? 1 : 0);
                                n7 = 0;
                                jSONObject2 = null;
                                if (n4 != 0) {
                                    string10 = object.getJSONObject(string10);
                                } else {
                                    n15 = 0;
                                    string10 = null;
                                }
                                if (string10 == null) return;
                                cTInAppNotification.o = object2 = string10.getString(string20);
                                object2 = string11;
                                boolean bl6 = string10.has(string11);
                                if (bl6) {
                                    string22 = string10.getString(string11);
                                }
                                cTInAppNotification.h = string22;
                                object2 = string13;
                                n10 = (int)(string10.has(string13) ? 1 : 0);
                                if (n10 != 0) {
                                    jSONObject2 = string10.getJSONObject(string13);
                                }
                                cTInAppNotification.g = jSONObject2;
                                if (jSONObject2 == null) {
                                    string10 = new JSONObject();
                                    cTInAppNotification.g = string10;
                                }
                                if ((object = object.getJSONObject(string17)) != null) {
                                    cTInAppNotification.i = n15 = object.getBoolean(string18);
                                    cTInAppNotification.C = n15 = object.getBoolean(string19);
                                    string10 = object.getString(string16);
                                    n15 = string10.charAt(0);
                                    cTInAppNotification.B = (char)n15;
                                    string10 = string4;
                                    n4 = (int)(object.has(string4) ? 1 : 0);
                                    if (n4 != 0) {
                                        n15 = object.getInt(string4);
                                    } else {
                                        n15 = 0;
                                        string10 = null;
                                    }
                                    cTInAppNotification.K = n15;
                                    n15 = (int)(object.has(string12) ? 1 : 0);
                                    if (n15 != 0) {
                                        n14 = object.getInt(string12);
                                    } else {
                                        n14 = 0;
                                        string12 = null;
                                    }
                                    cTInAppNotification.L = n14;
                                    string12 = string3;
                                    n15 = (int)(object.has(string3) ? 1 : 0);
                                    if (n15 != 0) {
                                        n14 = object.getInt(string3);
                                    } else {
                                        n14 = 0;
                                        string12 = null;
                                    }
                                    cTInAppNotification.l = n14;
                                    n14 = (int)(object.has(string14) ? 1 : 0);
                                    if (n14 != 0) {
                                        n8 = object.getInt(string14);
                                    }
                                    cTInAppNotification.m = n8;
                                    string14 = string15;
                                    n14 = (int)(object.has(string15) ? 1 : 0);
                                    if (n14 != 0) {
                                        n16 = object.getInt(string15);
                                    }
                                    cTInAppNotification.x = n16;
                                }
                                if ((object = cTInAppNotification.o) == null) return;
                                int n17 = cTInAppNotification.B;
                                int n18 = 30;
                                n14 = 100;
                                n15 = 116;
                                if (n17 == n15 && (n15 = cTInAppNotification.L) == n14 && (n15 = cTInAppNotification.m) <= n18) {
                                    object = ei_1.CTInAppTypeHeaderHTML;
                                    cTInAppNotification.q = object;
                                    return;
                                }
                                n15 = 98;
                                if (n17 == n15 && (n15 = cTInAppNotification.L) == n14 && (n15 = cTInAppNotification.m) <= n18) {
                                    object = ei_1.CTInAppTypeFooterHTML;
                                    cTInAppNotification.q = object;
                                    return;
                                }
                                n18 = 90;
                                n15 = 99;
                                if (n17 == n15) {
                                    n15 = cTInAppNotification.L;
                                    if (n15 == n18 && (n15 = cTInAppNotification.m) == (n3 = 85)) {
                                        object = ei_1.CTInAppTypeInterstitialHTML;
                                        cTInAppNotification.q = object;
                                        return;
                                    }
                                    n15 = 99;
                                }
                                if (n17 == n15 && (n15 = cTInAppNotification.L) == n14 && (n15 = cTInAppNotification.m) == n14) {
                                    object = ei_1.CTInAppTypeCoverHTML;
                                    cTInAppNotification.q = object;
                                    return;
                                }
                                n14 = 99;
                                if (n17 != n14) return;
                                n17 = cTInAppNotification.L;
                                if (n17 != n18) return;
                                n17 = cTInAppNotification.m;
                                n18 = 50;
                                if (n17 != n18) return;
                                object = ei_1.CTInAppTypeHalfInterstitialHTML;
                                cTInAppNotification.q = object;
                                return;
                            }
                            cTInAppNotification.j = string2;
                            return;
                        }
                    }
                }
                object = string2;
                break block37;
            }
            com.clevertap.android.sdk.b.l();
        }
        cTInAppNotification.j = object;
    }

    public final void h(CustomTemplateInAppData customTemplateInAppData) {
        this.O = customTemplateInAppData;
        JSONObject jSONObject = this.v;
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        String string2 = customTemplateInAppData.a;
        jSONObject.put("templateName", (Object)string2);
        boolean bl2 = customTemplateInAppData.b;
        jSONObject.put("isAction", bl2);
        string2 = customTemplateInAppData.c;
        jSONObject.put("templateId", (Object)string2);
        string2 = customTemplateInAppData.d;
        jSONObject.put("templateDescription", (Object)string2);
        customTemplateInAppData = customTemplateInAppData.e;
        jSONObject.put("vars", (Object)customTemplateInAppData);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.p;
        parcel.writeString(object);
        object = this.f;
        parcel.writeString(object);
        object = this.q;
        parcel.writeValue(object);
        object = this.o;
        parcel.writeString(object);
        byte by2 = (byte)(this.k ? 1 : 0);
        parcel.writeByte(by2);
        byte by4 = (byte)(this.C ? 1 : 0);
        parcel.writeByte(by4);
        byte by5 = (byte)(this.i ? 1 : 0);
        parcel.writeByte(by5);
        int n4 = this.x;
        parcel.writeInt(n4);
        int n7 = this.H;
        parcel.writeInt(n7);
        int n8 = this.G;
        parcel.writeInt(n8);
        object = Character.valueOf(this.B);
        parcel.writeValue(object);
        int n10 = this.l;
        parcel.writeInt(n10);
        int n14 = this.m;
        parcel.writeInt(n14);
        int n15 = this.K;
        parcel.writeInt(n15);
        int n16 = this.L;
        parcel.writeInt(n16);
        object = this.v;
        byte by6 = 1;
        if (object == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte(by6);
            object = this.v.toString();
            parcel.writeString(object);
        }
        object = this.j;
        parcel.writeString(object);
        object = this.g;
        if (object == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte(by6);
            object = this.g.toString();
            parcel.writeString(object);
        }
        object = this.b;
        if (object == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte(by6);
            object = object.toString();
            parcel.writeString(object);
        }
        object = this.I;
        parcel.writeString(object);
        object = this.E;
        parcel.writeString(object);
        object = this.F;
        parcel.writeString(object);
        object = this.c;
        parcel.writeString(object);
        object = this.z;
        parcel.writeString(object);
        object = this.A;
        parcel.writeString(object);
        object = this.e;
        parcel.writeTypedList((List)object);
        object = this.y;
        parcel.writeTypedList((List)object);
        byte by7 = (byte)(this.n ? 1 : 0);
        parcel.writeByte(by7);
        int n17 = this.d;
        parcel.writeInt(n17);
        byte by8 = (byte)(this.t ? 1 : 0);
        parcel.writeByte(by8);
        object = this.h;
        parcel.writeString(object);
        byte by9 = (byte)(this.u ? 1 : 0);
        parcel.writeByte(by9);
        byte by10 = (byte)(this.s ? 1 : 0);
        parcel.writeByte(by10);
        byte by11 = (byte)(this.r ? 1 : 0);
        parcel.writeByte(by11);
        byte by12 = (byte)(this.M ? 1 : 0);
        parcel.writeByte(by12);
        byte by13 = (byte)(this.N ? 1 : 0);
        parcel.writeByte(by13);
        object = this.w;
        parcel.writeString(object);
        object = this.a;
        parcel.writeString(object);
        long l2 = this.D;
        parcel.writeLong(l2);
        object = this.O;
        parcel.writeParcelable((Parcelable)object, n3);
    }
}

