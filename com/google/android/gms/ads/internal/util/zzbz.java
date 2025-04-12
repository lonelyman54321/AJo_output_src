/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.WindowManager$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.ImageView$ScaleType
 *  android.widget.ScrollView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbz {
    public static Point zza(MotionEvent motionEvent, View object) {
        object = zzbz.zzj(object);
        int n3 = (int)motionEvent.getRawX();
        View view = object[0];
        int n4 = (int)motionEvent.getRawY();
        View view2 = object[1];
        object = new Point(n3 -= view, n4 -= view2);
        return object;
    }

    public static WindowManager.LayoutParams zzb() {
        int n3;
        WindowManager.LayoutParams layoutParams;
        int n4 = -2;
        Object object = layoutParams;
        layoutParams = new WindowManager.LayoutParams(n4, n4, 0, 0, n4);
        object = zzbep.zzie;
        layoutParams.flags = n3 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 0x800033;
        return layoutParams;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject zzc(String string2, Context object, Point object2, Point object3) {
        void var0_3;
        JSONObject jSONObject;
        block6: {
            JSONObject jSONObject2;
            block7: {
                String string3;
                jSONObject = null;
                try {
                    jSONObject2 = new JSONObject();
                    string3 = "click_point";
                }
                catch (Exception exception) {
                    // empty catch block
                    break block6;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    Object object4 = "x";
                    try {
                        int n3 = object3.x;
                        zzf zzf2 = zzay.zzb();
                        n3 = zzf2.zzb((Context)object, n3);
                        jSONObject3.put((String)object4, n3);
                        object4 = "y";
                        int n4 = object3.y;
                        zzf zzf3 = zzay.zzb();
                        n4 = zzf3.zzb((Context)object, n4);
                        jSONObject3.put((String)object4, n4);
                        object3 = "start_x";
                        int n7 = object2.x;
                        zzf3 = zzay.zzb();
                        n7 = zzf3.zzb((Context)object, n7);
                        jSONObject3.put((String)object3, n7);
                        object3 = "start_y";
                        int n8 = object2.y;
                        object4 = zzay.zzb();
                        int n10 = ((zzf)object4).zzb((Context)object, n8);
                        jSONObject3.put((String)object3, n10);
                        jSONObject = jSONObject3;
                    }
                    catch (JSONException jSONException) {
                        object2 = "Error occurred while putting signals into JSON object.";
                        zzm.zzh((String)object2, jSONException);
                    }
                }
                catch (Exception exception) {
                    break block7;
                }
                jSONObject2.put(string3, (Object)jSONObject);
                object = "asset_id";
                jSONObject2.put((String)object, (Object)string2);
                return jSONObject2;
            }
            jSONObject = jSONObject2;
        }
        object = "Error occurred while grabbing click signals.";
        zzm.zzh((String)object, (Throwable)var0_3);
        return jSONObject;
    }

    /*
     * Exception decompiling
     */
    public static JSONObject zzd(Context var0, Map var1_1, Map var2_2, View var3_3, ImageView.ScaleType var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 22[TRYBLOCK] [24 : 403->406)] org.json.JSONException
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

    public static JSONObject zze(Context object, View object2) {
        JSONObject jSONObject = new JSONObject();
        if (object2 != null) {
            String string2 = "can_show_on_lock_screen";
            zzu.zzp();
            boolean bl2 = zzt.zzn(object2);
            jSONObject.put(string2, bl2);
            object2 = "is_keyguard_locked";
            zzu.zzp();
            boolean bl3 = zzt.zzD(object);
            try {
                jSONObject.put((String)object2, bl3);
            }
            catch (JSONException jSONException) {
                object = "Unable to get lock screen information";
                zzm.zzj((String)object);
            }
        }
        return jSONObject;
    }

    /*
     * Unable to fully structure code
     */
    public static JSONObject zzf(View var0) {
        block20: {
            var1_1 = new JSONObject();
            if (var0 == null) break block20;
            var2_2 = zzbep.zzhY;
            var3_3 = zzba.zzc();
            var2_2 = var3_3.zza((zzbeg)var2_2);
            var2_2 = (Boolean)var2_2;
            var4_4 = var2_2.booleanValue();
            var5_5 = true;
            var6_6 = "contained_in_scroll_view";
            if (!var4_4) ** GOTO lbl29
            zzu.zzp();
            for (var0 = var0.getParent(); var0 != null && !(var4_4 = var0 instanceof ScrollView); var0 = var0.getParent()) {
                continue;
            }
            if (var0 == null) {
                var5_5 = false;
                var3_3 = null;
            }
            var1_1.put(var6_6, var5_5);
            break block20;
lbl29:
            // 1 sources

            zzu.zzp();
            for (var2_2 = var0.getParent(); var2_2 != null && (var7_7 = var2_2 instanceof AdapterView) == 0; var2_2 = var2_2.getParent()) {
                continue;
            }
            var7_7 = -1;
            if (var2_2 == null) {
                var8_8 = -1;
            } else {
                var2_2 = (AdapterView)var2_2;
                var8_8 = var2_2.getPositionForView(var0);
            }
            if (var8_8 == var7_7) {
                var5_5 = false;
                var3_3 = null;
            }
            try {
                var1_1.put(var6_6, var5_5);
            }
            catch (Exception v0) {
                ** continue;
            }
        }
lbl51:
        // 2 sources

        return var1_1;
    }

    /*
     * Exception decompiling
     */
    public static JSONObject zzg(Context var0, View var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 62[TRYBLOCK] [81 : 838->847)] org.json.JSONException
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

    public static boolean zzh(Context object, zzfgt object2) {
        boolean bl2 = ((zzfgt)object2).zzO;
        if (!bl2) {
            return false;
        }
        object2 = zzbep.zzic;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        bl2 = (Boolean)object2;
        if (bl2) {
            object = zzbep.zzif;
            return (Boolean)zzba.zzc().zza((zzbeg)object);
        }
        object2 = zzbep.zzid;
        object3 = zzba.zzc();
        object2 = (String)((zzben)object3).zza((zzbeg)object2);
        boolean c2 = ((String)object2).isEmpty();
        if (!c2 && object != null) {
            boolean bl3;
            object = object.getPackageName();
            char c3 = ';';
            object3 = zzfyt.zzc(zzfxr.zzc(c3));
            object2 = ((zzfyt)object3).zzd((CharSequence)object2).iterator();
            while (bl3 = object2.hasNext()) {
                object3 = (String)object2.next();
                bl3 = ((String)object3).equals(object);
                if (!bl3) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean zzi(int n3) {
        Object object = zzbep.zzdv;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean n4 = (Boolean)object;
        if (n4) {
            int n7;
            object = zzbep.zzdw;
            zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            boolean bl2 = (Boolean)object;
            if (!bl2 && n3 > (n7 = 15299999)) {
                return false;
            }
        }
        return true;
    }

    public static int[] zzj(View view) {
        int n3 = 2;
        int[] nArray = new int[n3];
        if (view != null) {
            view.getLocationOnScreen(nArray);
        }
        return nArray;
    }

    private static JSONObject zzk(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int n3 = rect.right;
        int n4 = rect.left;
        n3 -= n4;
        n3 = zzay.zzb().zzb(context, n3);
        jSONObject.put("width", n3);
        n3 = rect.bottom;
        n4 = rect.top;
        n3 -= n4;
        n3 = zzay.zzb().zzb(context, n3);
        jSONObject.put("height", n3);
        n3 = rect.left;
        n3 = zzay.zzb().zzb(context, n3);
        jSONObject.put("x", n3);
        int n7 = rect.top;
        int n8 = zzay.zzb().zzb(context, n7);
        jSONObject.put("y", n8);
        jSONObject.put("relative_to", (Object)"self");
        return jSONObject;
    }

    private static int zzl(int n3) {
        int n4 = -2;
        if (n3 != n4) {
            n4 = -1;
            if (n3 != n4) {
                return 2;
            }
            return 3;
        }
        return 4;
    }
}

