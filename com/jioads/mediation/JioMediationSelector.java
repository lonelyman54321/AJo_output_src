/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package com.jioads.mediation;

import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jioads.mediation.partners.JioMediationListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class JioMediationSelector {
    public b a;
    public final Map b;
    public JSONObject c;
    public c d;
    public HashMap e;
    public Map f;
    public String g;
    public Class h;
    public Object i;
    public JioAdView j;
    public JioMediationListener k;

    public JioMediationSelector(b b2, Map map2, JSONObject jSONObject, c c2) {
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        this.a = b2;
        this.b = map2;
        this.c = jSONObject;
        this.d = c2;
    }

    public final void destroyView() {
        block8: {
            Object object;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Object var2_3 = null;
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                String string2 = "onInvalidate";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod(string2, classArray3);
                String string3 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                Object object3 = this.i;
                Object var3_11 = null;
                try {
                    ((Method)object2).invoke(object3, null);
                }
                catch (Exception exception) {
                    object2 = this.k;
                    if (object2 == null) break block8;
                    Intrinsics.checkNotNull(object2);
                    String string4 = "m139";
                    String string5 = "Mediation onInvalidate API not found";
                    object2.onAdFailed(string4, string5);
                }
            }
        }
    }

    public final b getIJioAdView() {
        return this.a;
    }

    public final c getIJioAdViewController() {
        return this.d;
    }

    public final Map getMediationImpUrls() {
        return this.f;
    }

    public final JSONObject getMediationJson() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMediationClick(View object, List object2) {
        int n3 = 1;
        int n4 = 2;
        Object object3 = this.i;
        if (object3 == null) return;
        object3 = this.h;
        if (object3 == null) return;
        Class[] classArray = new Class[n4];
        classArray[0] = View.class;
        Object object4 = List.class;
        classArray[n3] = object4;
        try {
            Class[] classArray2;
            Intrinsics.checkNotNull(object3);
            object4 = "handleClick";
            Class[] classArray3 = classArray2 = Arrays.copyOf(classArray, n4);
            object3 = ((Class)object3).getDeclaredMethod((String)object4, classArray3);
            String string2 = "getDeclaredMethod(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            Object object5 = this.i;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            objectArray[n3] = object2;
            ((Method)object3).invoke(object5, objectArray);
            return;
        }
        catch (Exception exception) {
            object = this.k;
            if (object == null) return;
            Intrinsics.checkNotNull(object);
            object2 = "m139";
            String string3 = "Mediation handleClick API not found";
            object.onAdFailed((String)object2, string3);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            return;
        }
    }

    public final void handleMediationImpression(ViewGroup object) {
        block10: {
            String string2 = null;
            int n3 = 1;
            Intrinsics.checkNotNullParameter(object, "vgroup");
            Object object2 = this.i;
            if (object2 != null && (object2 = this.h) != null) {
                Class[] classArray = new Class[n3];
                Object object3 = ViewGroup.class;
                classArray[0] = object3;
                Intrinsics.checkNotNull(object2);
                object3 = "handleImpression";
                Class[] classArray3 = Arrays.copyOf(classArray, n3);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod((String)object3, classArray3);
                String string3 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                Object object4 = this.i;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                try {
                    ((Method)object2).invoke(object4, objectArray);
                }
                catch (Exception exception) {
                    object = this.k;
                    if (object == null) break block10;
                    Intrinsics.checkNotNull(object);
                    string2 = "m139";
                    objectArray = "Mediation handleImpression API not found";
                    object.onAdFailed(string2, (String)objectArray);
                }
            }
        }
    }

    public final void hideAd() {
        block8: {
            Object object;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Object var2_3 = null;
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                String string2 = "hideAd";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod(string2, classArray3);
                String string3 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                Object object3 = this.i;
                Object var3_11 = null;
                try {
                    ((Method)object2).invoke(object3, null);
                }
                catch (Exception exception) {
                    object2 = this.k;
                    if (object2 == null) break block8;
                    Intrinsics.checkNotNull(object2);
                    String string4 = "m139";
                    String string5 = "Mediation hideAd API not found";
                    object2.onAdFailed(string4, string5);
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void loadAd(JioMediationListener var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 207->211)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void onBackPressed() {
        block8: {
            Object object;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Object var2_3 = null;
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                String string2 = "onBackPressed";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod(string2, classArray3);
                String string3 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                Object object3 = this.i;
                Object var3_11 = null;
                try {
                    ((Method)object2).invoke(object3, null);
                }
                catch (Exception exception) {
                    object2 = this.k;
                    if (object2 == null) break block8;
                    Intrinsics.checkNotNull(object2);
                    String string4 = "m139";
                    String string5 = "Mediation onBackPressed API not found";
                    object2.onAdFailed(string4, string5);
                }
            }
        }
    }

    public final void onConfigurationChanged() {
        block10: {
            Object object;
            JioMediationListener jioMediationListener = null;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                Object[] objectArray = "onConfigurationChanged";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod((String)objectArray, classArray3);
                String string2 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                Object object3 = this.i;
                int n3 = 1;
                objectArray = new Object[n3];
                objectArray[0] = null;
                try {
                    ((Method)object2).invoke(object3, objectArray);
                }
                catch (Exception exception) {
                    jioMediationListener = this.k;
                    if (jioMediationListener == null) break block10;
                    Intrinsics.checkNotNull(jioMediationListener);
                    object2 = "m139";
                    String string3 = "Mediation onConfigurationChanged API not found";
                    jioMediationListener.onAdFailed((String)object2, string3);
                }
            }
        }
    }

    public final void onDestroy() {
        block8: {
            Object object;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Object var2_3 = null;
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                String string2 = "onDestroy";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod(string2, classArray3);
                String string3 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                Object object3 = this.i;
                Object var3_11 = null;
                try {
                    ((Method)object2).invoke(object3, null);
                }
                catch (Exception exception) {
                    object2 = this.k;
                    if (object2 == null) break block8;
                    Intrinsics.checkNotNull(object2);
                    String string4 = "m139";
                    String string5 = "Mediation onDestroy API not found";
                    object2.onAdFailed(string4, string5);
                }
            }
        }
    }

    public final void onPause() {
        block8: {
            Object object;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Object var2_3 = null;
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                String string2 = "onPause";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod(string2, classArray3);
                String string3 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                Object object3 = this.i;
                Object var3_11 = null;
                try {
                    ((Method)object2).invoke(object3, null);
                }
                catch (Exception exception) {
                    object2 = this.k;
                    if (object2 == null) break block8;
                    Intrinsics.checkNotNull(object2);
                    String string4 = "m139";
                    String string5 = "Mediation onPause API not found";
                    object2.onAdFailed(string4, string5);
                }
            }
        }
    }

    public final void onResume() {
        block8: {
            Object object;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Object var2_3 = null;
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                String string2 = "onResume";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod(string2, classArray3);
                String string3 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                Object object3 = this.i;
                Object var3_11 = null;
                try {
                    ((Method)object2).invoke(object3, null);
                }
                catch (Exception exception) {
                    object2 = this.k;
                    if (object2 == null) break block8;
                    Intrinsics.checkNotNull(object2);
                    String string4 = "m139";
                    String string5 = "Mediation onResume API not found";
                    object2.onAdFailed(string4, string5);
                }
            }
        }
    }

    public final void playNativeMedia() {
        block10: {
            Object object;
            JioMediationListener jioMediationListener = null;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                Object[] objectArray = "playNativeMedia";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod((String)objectArray, classArray3);
                String string2 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                Object object3 = this.i;
                int n3 = 1;
                objectArray = new Object[n3];
                objectArray[0] = null;
                try {
                    ((Method)object2).invoke(object3, objectArray);
                }
                catch (Exception exception) {
                    jioMediationListener = this.k;
                    if (jioMediationListener == null) break block10;
                    Intrinsics.checkNotNull(jioMediationListener);
                    object2 = "m139";
                    String string3 = "Mediation playNativeMedia API not found";
                    jioMediationListener.onAdFailed((String)object2, string3);
                }
            }
        }
    }

    public final void setIJioAdView(b b2) {
        Intrinsics.checkNotNullParameter(b2, "<set-?>");
        this.a = b2;
    }

    public final void setIJioAdViewController(c c2) {
        Intrinsics.checkNotNullParameter(c2, "<set-?>");
        this.d = c2;
    }

    public final void setMediationImpUrls(Map map2) {
        this.f = map2;
    }

    public final void setMediationJson(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public final void showAd() {
        block8: {
            Object object;
            Object object2 = this.h;
            if (object2 != null && (object = this.i) != null) {
                Object var2_3 = null;
                Class[] classArray = new Class[]{};
                Intrinsics.checkNotNull(object2);
                String string2 = "showAd";
                Class[] classArray3 = Arrays.copyOf(classArray, 0);
                classArray3 = classArray3;
                object2 = ((Class)object2).getDeclaredMethod(string2, classArray3);
                String string3 = "getDeclaredMethod(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                Object object3 = this.i;
                Object var3_11 = null;
                try {
                    ((Method)object2).invoke(object3, null);
                }
                catch (Exception exception) {
                    object2 = this.k;
                    if (object2 == null) break block8;
                    Intrinsics.checkNotNull(object2);
                    String string4 = "m139";
                    String string5 = "Mediation showAd API not found";
                    object2.onAdFailed(string4, string5);
                }
            }
        }
    }
}

