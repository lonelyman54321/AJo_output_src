/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class I {
    public final Context a;

    public I(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long a(String string2, String charSequence, JSONObject object, Calendar calendar) {
        Exception exception2;
        block8: {
            int n3;
            String string3 = "d";
            String string4 = "h";
            String string5 = "m";
            try {
                n3 = object.has(charSequence);
                if (n3 == 0) return -2L;
                charSequence = object.getJSONObject(charSequence);
            }
            catch (Exception exception2) {
                break block8;
            }
            if (charSequence == null) return -2;
            boolean bl2 = Intrinsics.areEqual(string2, string5);
            n3 = 0;
            if (bl2) {
                int n4 = charSequence.has(string5);
                if (n4 != 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(string2 = charSequence.getString(string5))) ? 1 : 0)) == 0) {
                    n3 = charSequence.getInt(string5);
                }
                n4 = 12;
                calendar.add(n4, n3);
                return calendar.getTimeInMillis();
            }
            bl2 = Intrinsics.areEqual(string2, string4);
            if (bl2) {
                int n7 = charSequence.has(string4);
                if (n7 != 0 && (n7 = (int)(TextUtils.isEmpty((CharSequence)(string2 = charSequence.getString(string4))) ? 1 : 0)) == 0) {
                    n3 = charSequence.getInt(string4);
                }
                n7 = 10;
                calendar.add(n7, n3);
                return calendar.getTimeInMillis();
            }
            bl2 = Intrinsics.areEqual(string2, string3);
            if (bl2) {
                int n8 = charSequence.has(string3);
                if (n8 != 0 && (n8 = (int)(TextUtils.isEmpty((CharSequence)(string2 = charSequence.getString(string3))) ? 1 : 0)) == 0) {
                    n3 = charSequence.getInt(string3);
                }
                n8 = 6;
                calendar.add(n8, n3);
                return calendar.getTimeInMillis();
            }
            charSequence = "l";
            boolean bl3 = Intrinsics.areEqual(string2, charSequence);
            if (!bl3) return -2;
            return -1;
        }
        charSequence = new StringBuilder("Exception inside getExpiryTime= ");
        object = Utility.INSTANCE;
        b.c((Utility)object, exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return -2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject c(String string2, JSONObject jSONObject) {
        String string3 = "message";
        Intrinsics.checkNotNullParameter("inside getInitialRuleMap()", string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        boolean bl2 = jSONObject.has(string2);
        if (!bl2) return null;
        object = jSONObject.getJSONObject(string2);
        object = object.keys();
        string3 = new JSONObject();
        try {
            boolean bl3;
            Intrinsics.checkNotNull(object);
            while (bl3 = object.hasNext()) {
                long l2;
                Object e2 = object.next();
                String string4 = (String)e2;
                Object object2 = Calendar.getInstance();
                Intrinsics.checkNotNull(string4);
                Intrinsics.checkNotNull(object2);
                long l3 = I.a(string4, string2, jSONObject, (Calendar)object2);
                long l4 = l3 - (l2 = (long)-2);
                Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object3 <= 0) continue;
                JSONObject jSONObject2 = new JSONObject();
                int n3 = 1;
                jSONObject2.put(string4, n3);
                String string5 = "expiry";
                jSONObject2.put(string5, l3);
                object2 = "start";
                Calendar calendar = Calendar.getInstance();
                long l7 = calendar.getTimeInMillis();
                jSONObject2.put((String)object2, l7);
                string3.put(string4, (Object)jSONObject2);
            }
            return string3;
        }
        catch (Exception exception) {
            return string3;
        }
        catch (Exception exception) {}
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(JSONObject jSONObject) {
        try {
            boolean bl2;
            Iterator iterator = jSONObject.keys();
            Intrinsics.checkNotNull(iterator);
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                boolean bl4;
                Object object = iterator.next();
                object = (String)object;
                JSONObject jSONObject2 = jSONObject.getJSONObject(object);
                Object object2 = Calendar.getInstance();
                long l2 = ((Calendar)object2).getTimeInMillis();
                String string2 = "mapExpiry";
                long l3 = jSONObject2.getLong(string2);
                long l4 = l3 - l2;
                Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object3 < 0) {
                    jSONObject.remove(object);
                    continue;
                }
                object = jSONObject2.keys();
                object2 = new ArrayList();
                Intrinsics.checkNotNull(object);
                while (bl4 = object.hasNext()) {
                    Object object4 = object.next();
                    string2 = "i";
                    boolean bl5 = Intrinsics.areEqual(object4 = (String)object4, string2);
                    if (!bl5 && !(bl5 = Intrinsics.areEqual(object4, string2 = "c")) && !(bl5 = Intrinsics.areEqual(object4, string2 = "cv"))) continue;
                    string2 = jSONObject2.getJSONObject(object4);
                    Intrinsics.checkNotNull(string2);
                    bl5 = I.g((JSONObject)string2);
                    if (!bl5) continue;
                    ((ArrayList)object2).add(object4);
                }
                object = ((ArrayList)object2).iterator();
                while (bl3 = object.hasNext()) {
                    object2 = object.next();
                    object2 = (String)object2;
                    jSONObject2.remove((String)object2);
                }
            }
            return;
        }
        catch (Exception exception) {}
    }

    public static JSONObject f(JSONObject jSONObject) {
        int n3;
        JSONObject jSONObject2 = new JSONObject();
        Iterator iterator = jSONObject.keys();
        while ((n3 = iterator.hasNext()) != 0) {
            String string2;
            String string3 = (String)iterator.next();
            string3 = jSONObject.getJSONObject(string3);
            Intrinsics.checkNotNullExpressionValue(string3, "getJSONObject(...)");
            String string4 = "m";
            int n4 = string3.has(string4);
            if (n4 != 0 && (n4 = TextUtils.isEmpty((CharSequence)(string2 = string3.getString(string4)))) == 0) {
                n4 = string3.getInt(string4);
                jSONObject2.put(string4, n4);
            }
            if ((n4 = string3.has(string4 = "h")) != 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(string2 = string3.getString(string4))) ? 1 : 0)) == 0) {
                n4 = string3.getInt(string4);
                jSONObject2.put(string4, n4);
            }
            if ((n4 = (int)(string3.has(string4 = "d") ? 1 : 0)) != 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(string2 = string3.getString(string4))) ? 1 : 0)) == 0) {
                n4 = string3.getInt(string4);
                jSONObject2.put(string4, n4);
            }
            if ((n4 = (int)(string3.has(string4 = "l") ? 1 : 0)) == 0 || (n4 = (int)(TextUtils.isEmpty((CharSequence)(string2 = string3.getString(string4))) ? 1 : 0)) != 0) continue;
            n3 = string3.getInt(string4);
            jSONObject2.put(string4, n3);
        }
        return jSONObject2;
    }

    public static boolean g(JSONObject jSONObject) {
        boolean bl2;
        boolean bl3;
        Object object = Calendar.getInstance();
        long l2 = ((Calendar)object).getTimeInMillis();
        Iterator iterator = jSONObject.keys();
        ArrayList<String> arrayList = new ArrayList<String>();
        Intrinsics.checkNotNull(iterator);
        while (bl3 = iterator.hasNext()) {
            long l3;
            long l4;
            String string2;
            int n3;
            String string3;
            String string4 = (String)iterator.next();
            boolean bl4 = string4.equals(string3 = "l");
            if (bl4 || (n3 = (string3 = jSONObject.getJSONObject(string4)).has(string2 = "expiry")) == 0 || (n3 = (l4 = (l3 = string3.getLong(string2)) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) continue;
            arrayList.add(string4);
        }
        object = arrayList.iterator();
        while (bl2 = object.hasNext()) {
            String string5 = (String)object.next();
            jSONObject.remove(string5);
        }
        int n4 = jSONObject.length();
        if (!n4) {
            n4 = 1;
        } else {
            n4 = 0;
            jSONObject = null;
        }
        return n4 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String b(String object) {
        String string2;
        String string3;
        Object object2;
        block11: {
            block10: {
                boolean bl2;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(": inside getHeaderToSend()");
                object2 = ((StringBuilder)object2).toString();
                string3 = "message";
                Intrinsics.checkNotNullParameter(object2, string3);
                object2 = JioAds.Companion;
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                jioAds$LogLevel = this.a;
                if (jioAds$LogLevel == null) break block10;
                jioAds$LogLevel = j_0.o((Context)jioAds$LogLevel, "common_prefs");
                string2 = null;
                String string4 = "fcap";
                if (jioAds$LogLevel != null) {
                    string2 = jioAds$LogLevel.getString(string4, null);
                }
                Object object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object);
                String string5 = ": existing fcap value: ";
                ((StringBuilder)object3).append(string5);
                ((StringBuilder)object3).append(string2);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, string3);
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (string2 == null) break block10;
                object2 = new JSONObject(string2);
                I.e((JSONObject)object2);
                string2 = new JSONObject();
                object3 = object2.keys();
                while (bl2 = object3.hasNext()) {
                    int n3;
                    int n4;
                    JSONObject jSONObject;
                    String string6;
                    string5 = new JSONObject();
                    String string7 = (String)object3.next();
                    JSONObject jSONObject2 = object2.getJSONObject(string7);
                    int n7 = jSONObject2.has(string6 = "i");
                    if (n7 != 0) {
                        jSONObject = jSONObject2.getJSONObject(string6);
                        Intrinsics.checkNotNull(jSONObject);
                        jSONObject = I.f(jSONObject);
                        n4 = jSONObject.length();
                        if (n4 > 0) {
                            string5.put(string6, (Object)jSONObject);
                        }
                    }
                    if ((n7 = jSONObject2.has(string6 = "c")) != 0) {
                        jSONObject = jSONObject2.getJSONObject(string6);
                        Intrinsics.checkNotNull(jSONObject);
                        jSONObject = I.f(jSONObject);
                        n4 = jSONObject.length();
                        if (n4 > 0) {
                            string5.put(string6, (Object)jSONObject);
                        }
                    }
                    if ((n7 = jSONObject2.has(string6 = "cv")) != 0) {
                        jSONObject2 = jSONObject2.getJSONObject(string6);
                        Intrinsics.checkNotNull(jSONObject2);
                        jSONObject2 = I.f(jSONObject2);
                        n7 = jSONObject2.length();
                        if (n7 > 0) {
                            string5.put(string6, (Object)jSONObject2);
                        }
                    }
                    if ((n3 = string5.length()) <= 0) continue;
                    string2.put(string7, (Object)string5);
                }
                string2 = string2.toString();
                object3 = "toString(...)";
                Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
                jioAds$LogLevel = jioAds$LogLevel.edit();
                if (jioAds$LogLevel != null) {
                    object2 = object2.toString();
                    if ((object2 = jioAds$LogLevel.putString(string4, (String)object2)) != null) {
                        object2.apply();
                    }
                }
                break block11;
            }
            string2 = "";
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(": Returning header: ");
        ((StringBuilder)object2).append(string2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return string2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void d(String string2, String string3, String object, String string4) {
        block16: {
            SharedPreferences.Editor editor;
            void var11_35;
            String string5;
            Context context;
            String string6;
            Object object2;
            Object object3;
            Object object4;
            block24: {
                String string7;
                block23: {
                    Object object5;
                    block22: {
                        boolean bl2;
                        Object object6;
                        String string8;
                        Object object7;
                        int n3;
                        JSONObject jSONObject;
                        Object object8;
                        String string9;
                        block21: {
                            int n4;
                            boolean bl3;
                            block17: {
                                long l2;
                                block18: {
                                    block19: {
                                        block20: {
                                            String string10 = string2;
                                            object4 = string3;
                                            object3 = object;
                                            string9 = string4;
                                            Intrinsics.checkNotNullParameter(string2, "adspotId");
                                            Intrinsics.checkNotNullParameter(string3, "campaignId");
                                            Intrinsics.checkNotNullParameter(object, "fcapHeader");
                                            Intrinsics.checkNotNullParameter(string4, "ruleType");
                                            object2 = new StringBuilder();
                                            ((StringBuilder)object2).append(string2);
                                            object2 = ko_0.a((StringBuilder)object2, ": adding FCAP count of ", string4, " for campaign id ", string3);
                                            string6 = "message";
                                            Intrinsics.checkNotNullParameter(object2, string6);
                                            object2 = JioAds.Companion;
                                            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                                            I i3 = this;
                                            context = this.a;
                                            if (context == null) break block16;
                                            context = j_0.o(context, "common_prefs");
                                            bl3 = false;
                                            string5 = "fcap";
                                            object8 = context.getString(string5, null);
                                            jSONObject = new JSONObject((String)object);
                                            object3 = "mapExpiry";
                                            n3 = 6;
                                            object7 = "getString(...)";
                                            n4 = 30;
                                            string8 = "expiry";
                                            if (object8 == null) break block17;
                                            object2 = new JSONObject((String)object8);
                                            I.e((JSONObject)object2);
                                            bl3 = object2.has(string3);
                                            if (!bl3) break block18;
                                            object3 = object2.getJSONObject(string3);
                                            bl3 = object3.has(string4);
                                            if (!bl3) break block19;
                                            object8 = object3.getJSONObject(string4);
                                            n3 = (int)(jSONObject.has(string4) ? 1 : 0);
                                            if (n3 == 0) break block20;
                                            object6 = jSONObject.getJSONObject(string4).keys();
                                            break block21;
                                        }
                                        object5 = object2;
                                        string7 = string6;
                                        object8.remove(string4);
                                        break block22;
                                    }
                                    object5 = object2;
                                    string7 = string6;
                                    JSONObject jSONObject2 = I.c(string4, jSONObject);
                                    if (jSONObject2 != null) {
                                        object3.put(string4, (Object)jSONObject2);
                                    }
                                    break block22;
                                }
                                Object object9 = object2;
                                string7 = string6;
                                JSONObject jSONObject3 = new JSONObject();
                                boolean bl4 = jSONObject.has(string8);
                                if (bl4) {
                                    object4 = jSONObject.getString(string8);
                                    Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                                    l2 = Long.parseLong((String)object4);
                                    n4 = (int)l2;
                                }
                                object4 = Calendar.getInstance();
                                ((Calendar)object4).add(n3, n4);
                                l2 = ((Calendar)object4).getTimeInMillis();
                                jSONObject3.put((String)object3, l2);
                                object4 = I.c(string9, jSONObject);
                                if (object4 != null) {
                                    jSONObject3.put(string9, object4);
                                }
                                object4 = string3;
                                object3 = object9;
                                object9.put(string3, (Object)jSONObject3);
                                break block23;
                            }
                            String string11 = string6;
                            StringBuilder stringBuilder = new StringBuilder();
                            string6 = string2;
                            stringBuilder.append(string2);
                            stringBuilder.append(": No existing FCAP map for campaign ");
                            stringBuilder.append(string3);
                            stringBuilder.append(" in SP");
                            String string12 = stringBuilder.toString();
                            String string13 = string11;
                            Intrinsics.checkNotNullParameter(string12, string11);
                            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(string2);
                            object8 = ": creating initial FCAP data for ";
                            stringBuilder2.append((String)object8);
                            stringBuilder2.append(string3);
                            Intrinsics.checkNotNullParameter(stringBuilder2.toString(), string11);
                            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object2 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            bl3 = jSONObject.has(string8);
                            if (bl3) {
                                object8 = jSONObject.getString(string8);
                                Intrinsics.checkNotNullExpressionValue(object8, (String)object7);
                                long l3 = Long.parseLong((String)object8);
                                n4 = (int)l3;
                            }
                            object8 = Calendar.getInstance();
                            ((Calendar)object8).add(n3, n4);
                            long l4 = ((Calendar)object8).getTimeInMillis();
                            jSONObject4.put((String)object3, l4);
                            object3 = I.c(string9, jSONObject);
                            if (object3 != null) {
                                jSONObject4.put(string9, object3);
                            }
                            object2.put((String)object4, (Object)jSONObject4);
                            break block24;
                        }
                        while (bl2 = object6.hasNext()) {
                            block15: {
                                long l7;
                                long l8;
                                object7 = Calendar.getInstance();
                                String string14 = (String)object6.next();
                                int n7 = object8.has(string14);
                                String string15 = "start";
                                object = object6;
                                n3 = 1;
                                if (n7 != 0) {
                                    string7 = object8.getJSONObject(string14);
                                    boolean bl5 = string7.has(string8);
                                    if (bl5) {
                                        long l12;
                                        long l14;
                                        long l15;
                                        String string16;
                                        long l16 = string7.getLong(string8);
                                        l8 = ((Calendar)object7).getTimeInMillis();
                                        int n8 = string7.has(string14);
                                        if (n8 != 0 && (n8 = TextUtils.isEmpty((CharSequence)(string16 = string7.getString(string14)))) == 0) {
                                            n7 = string7.getInt(string14);
                                        } else {
                                            n7 = 0;
                                            string7 = null;
                                        }
                                        n8 = l8 == l16 ? 0 : (l8 < l16 ? -1 : 1);
                                        if (n8 >= 0 && (l15 = (l14 = l16 - (l12 = (long)-1)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) != false) {
                                            Intrinsics.checkNotNull(string14);
                                            Intrinsics.checkNotNull(object7);
                                            l16 = I.a(string14, string9, jSONObject, (Calendar)object7);
                                        } else {
                                            n3 += n7;
                                        }
                                        string7 = string6;
                                        object5 = object2;
                                        l7 = l16;
                                        object7 = new JSONObject();
                                        object7.put(string14, n3);
                                        object7.put(string8, l16);
                                        object7.put(string15, l8);
                                        object8.put(string14, object7);
                                        break block15;
                                    } else {
                                        I i8 = this;
                                        String string17 = string2;
                                        object4 = string3;
                                        continue;
                                    }
                                }
                                object5 = object2;
                                string7 = string6;
                                Intrinsics.checkNotNull(string14);
                                Intrinsics.checkNotNull(object7);
                                l8 = I.a(string14, string9, jSONObject, (Calendar)object7);
                                long l17 = l8 - (l7 = (long)-2);
                                Object object10 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                                if (object10 > 0) {
                                    object2 = new JSONObject();
                                    object2.put(string14, n3);
                                    object2.put(string8, l8);
                                    l8 = ((Calendar)object7).getTimeInMillis();
                                    object2.put(string15, l8);
                                    object8.put(string14, object2);
                                }
                            }
                            I i10 = this;
                            String string18 = string2;
                            object4 = string3;
                            object6 = object;
                            string6 = string7;
                            object2 = object5;
                        }
                        object5 = object2;
                        string7 = string6;
                        object3.put(string9, object8);
                    }
                    object4 = string3;
                    object3 = object5;
                }
                string6 = string2;
                object2 = object3;
                String string19 = string7;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string6);
            object3 = ": updating mapping for campaing Id ";
            stringBuilder.append((String)object3);
            stringBuilder.append((String)object4);
            object4 = " to: ";
            stringBuilder.append((String)object4);
            stringBuilder.append(object2);
            Intrinsics.checkNotNullParameter(stringBuilder.toString(), (String)var11_35);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            SharedPreferences.Editor editor2 = context.edit();
            if (editor2 != null && (editor = editor2.putString(string5, (String)(object4 = object2.toString()))) != null) {
                editor.apply();
            }
        }
    }
}

