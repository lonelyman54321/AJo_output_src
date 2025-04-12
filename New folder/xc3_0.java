/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.DatePicker
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RadioGroup
 *  android.widget.RatingBar
 *  android.widget.Spinner
 *  android.widget.Switch
 *  android.widget.TextView
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from XC3
 */
public final class xc3_0 {
    public static final xc3_0 a;
    public static WeakReference b;
    public static Method c;

    static {
        WeakReference<Object> weakReference = new WeakReference<Object>();
        a = weakReference;
        b = weakReference = new WeakReference<Object>(null);
    }

    /*
     * Loose catch block
     */
    public static final View a(View view) {
        Class<xc3_0> clazz = xc3_0.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        while (view != null) {
            boolean bl3;
            block13: {
                xc3_0 xc3_02 = a;
                xc3_02.getClass();
                boolean bl4 = td0.b(xc3_02);
                bl3 = false;
                if (bl4) break block13;
                Object object = view.getClass();
                object = ((Class)object).getName();
                String string2 = "com.facebook.react.ReactRootView";
                try {
                    bl3 = Intrinsics.areEqual(object, string2);
                }
                catch (Throwable throwable) {
                    td0.a(xc3_02, throwable);
                }
            }
            if (bl3) {
                return view;
            }
            view = view.getParent();
            bl2 = view instanceof View;
            if (!bl2) break;
            continue;
            {
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                    break;
                }
            }
        }
        return null;
    }

    public static final ArrayList b(View view) {
        Throwable throwable2;
        Class<xc3_0> clazz;
        block10: {
            ArrayList<View> arrayList;
            block11: {
                clazz = xc3_0.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                arrayList = new ArrayList<View>();
                int n3 = view instanceof ViewGroup;
                if (n3 == 0) break block11;
                View view2 = view;
                view2 = (ViewGroup)view;
                n3 = view2.getChildCount();
                for (int i3 = 0; i3 < n3; ++i3) {
                    View view3 = view;
                    try {
                        view3 = (ViewGroup)view;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    view3 = view3.getChildAt(i3);
                    arrayList.add(view3);
                    continue;
                }
            }
            return arrayList;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int c(View var0) {
        block26: {
            block31: {
                block27: {
                    block28: {
                        block30: {
                            var1_2 = xc3_0.class;
                            var2_3 = td0.b(var1_2);
                            if (var2_3 != 0) {
                                return 0;
                            }
                            var3_4 = "view";
                            try {
                                Intrinsics.checkNotNullParameter(var0, var3_4);
                            }
                            catch (Throwable var0_1) {
                                break block26;
                            }
                            var2_3 = var0 instanceof ImageView;
                            if (var2_3 == 0) break block30;
                            var2_3 = 2;
                            ** GOTO lbl-1000
                        }
                        var2_3 = 0;
                        var3_4 = null;
lbl-1000:
                        // 2 sources

                        {
                            var4_5 = var0.isClickable();
                            if (var4_5 != 0) {
                                var2_3 |= 32;
                            }
                            var4_5 = td0.b(var1_2);
                            var5_6 = xc3_0.a;
                            if (var4_5 != 0) break block27;
                        }
                        var6_7 /* !! */  = var0.getParent();
                        {
                            block29: {
                                catch (Throwable var6_8) {
                                    ** GOTO lbl-1000
                                }
                                var7_9 = var6_7 /* !! */  instanceof AdapterView;
                                if (var7_9) break block28;
                                var8_10 = "android.support.v4.view.NestedScrollingChild";
                                {
                                    var5_6.getClass();
                                    var9_12 = td0.b(var5_6);
                                    var10_13 = null;
                                    if (!var9_12) break block29;
                                }
lbl37:
                                // 3 sources

                                while (true) {
                                    var7_9 = false;
                                    var8_10 = null;
                                    break;
                                }
                            }
                            try {
                                var8_10 = Class.forName((String)var8_10);
                            }
                            catch (Throwable var8_11) {}
                            {
                                td0.a(var5_6, var8_11);
                                ** GOTO lbl37
                            }
                        }
                        catch (ClassNotFoundException v0) {
                            ** continue;
                        }
                        if (var8_10 != null && (var7_9 = var8_10.isInstance(var6_7 /* !! */ ))) break block28;
                        var7_9 = td0.b(var5_6);
                        if (!var7_9) {
                            var10_13 = uU1.class;
                        }
                        if (var10_13 == null || (var4_5 = (int)var10_13.isInstance(var6_7 /* !! */ )) == 0) break block27;
                    }
                    var2_3 |= 512;
                    break block27;
lbl-1000:
                    // 1 sources

                    {
                        td0.a(var1_2, var6_8);
                    }
                }
                var4_5 = var0 instanceof TextView;
                if (var4_5 == 0) break block31;
                var4_5 = var2_3 | 1025;
                var11_14 = var0 instanceof Button;
                if (!var11_14) ** GOTO lbl-1000
                var4_5 = var2_3 | 1029;
                var11_14 = var0 instanceof Switch;
                if (var11_14) {
                    var2_3 |= 9221;
                } else {
                    var11_14 = var0 instanceof CheckBox;
                    if (var11_14) {
                        var4_5 = 33797;
                        var2_3 |= var4_5;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_3 = var4_5;
                    }
                }
                var12_15 = var0 instanceof EditText;
                if (var12_15 == false) return var2_3;
                return var2_3 |= 2048;
            }
            var4_5 = var0 instanceof Spinner;
            if (var4_5 == 0 && (var4_5 = var0 instanceof DatePicker) == 0) {
                var4_5 = var0 instanceof RatingBar;
                if (var4_5 != 0) {
                    var12_16 = 65536;
                    return var2_3 |= var12_16;
                }
                var4_5 = var0 instanceof RadioGroup;
                if (var4_5 != 0) {
                    return var2_3 |= 16384;
                }
                var4_5 = var0 instanceof ViewGroup;
                if (var4_5 == 0) return var2_3;
                {
                    var6_7 /* !! */  = xc3_0.b;
                    var6_7 /* !! */  = var6_7 /* !! */ .get();
                    var6_7 /* !! */  = (View)var6_7 /* !! */ ;
                    var12_17 = var5_6.m(var0, (View)var6_7 /* !! */ );
                    if (var12_17 == false) return var2_3;
                    return var2_3 |= 64;
                }
            }
            var2_3 |= 4096;
            return var2_3;
        }
        td0.a(var1_2, var0_1);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final JSONObject d(View object) {
        Throwable throwable2;
        Class<xc3_0> clazz;
        block8: {
            String string2;
            WeakReference<View> weakReference;
            block7: {
                clazz = xc3_0.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                weakReference = "view";
                try {
                    Intrinsics.checkNotNullParameter(object, (String)((Object)weakReference));
                    weakReference = object.getClass();
                    weakReference = ((Class)((Object)weakReference)).getName();
                    string2 = "com.facebook.react.ReactRootView";
                    bl2 = Intrinsics.areEqual(weakReference, string2);
                    if (!bl2) break block7;
                    b = weakReference = new WeakReference<View>((View)object);
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            weakReference = new WeakReference<View>();
            try {
                xc3_0.n((View)object, weakReference);
                string2 = new JSONArray();
                object = xc3_0.b((View)object);
                int n3 = ((ArrayList)object).size();
                int n4 = 0;
                while (true) {
                    if (n4 >= n3) {
                        object = "childviews";
                        weakReference.put((String)object, string2);
                        return weakReference;
                    }
                    Object object2 = ((ArrayList)object).get(n4);
                    object2 = (View)object2;
                    object2 = xc3_0.d(object2);
                    string2.put(object2);
                    ++n4;
                }
            }
            catch (JSONException jSONException) {
                return weakReference;
            }
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final View.OnClickListener f(View object) {
        Throwable throwable2222;
        boolean bl2;
        Object object2;
        Object object3;
        Class<xc3_0> clazz;
        block5: {
            clazz = xc3_0.class;
            boolean bl3 = td0.b(clazz);
            object3 = null;
            if (bl3) {
                return null;
            }
            object2 = "android.view.View";
            try {
                object2 = Class.forName((String)object2);
                String string2 = "mListenerInfo";
                object2 = ((Class)object2).getDeclaredField(string2);
                bl2 = true;
                if (object2 == null) break block5;
                ((AccessibleObject)object2).setAccessible(bl2);
            }
            catch (Throwable throwable2222) {
            }
        }
        if ((object = ((Field)object2).get(object)) == null) {
            return null;
        }
        object2 = "android.view.View$ListenerInfo";
        object2 = Class.forName((String)object2);
        String string3 = "mOnClickListener";
        if ((object2 = ((Class)object2).getDeclaredField(string3)) == null) return object3;
        ((AccessibleObject)object2).setAccessible(bl2);
        object = ((Field)object2).get(object);
        object2 = "null cannot be cast to non-null type android.view.View.OnClickListener";
        Intrinsics.checkNotNull(object, (String)object2);
        return object = (View.OnClickListener)object;
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return null;
        }
        td0.a(clazz, throwable2222);
        return null;
    }

    /*
     * Exception decompiling
     */
    public static final View.OnTouchListener g(View var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [15, 14, 13, 12 : 64->68)] java.lang.Throwable
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String h(View var0) {
        var1_2 = xc3_0.class;
        var2_3 = td0.b(var1_2);
        if (var2_3) {
            return null;
        }
        var2_3 = var0 instanceof EditText;
        if (var2_3) {
            var0 = (EditText)var0;
            var0 = var0.getHint();
            return var0;
            ** finally { 
lbl12:
            // 1 sources

        } else {
            var2_3 = var0 instanceof TextView;
            if (var2_3 == false) return "";
            try {
                var0 = (TextView)var0;
                var0 = var0.getHint();
            }
            catch (Throwable var0_1) {}
        }
        if (var0 == null) return "";
        if ((var0 = var0.toString()) != null) return var0;
        return "";
    }

    public static final ViewGroup i(View view) {
        Throwable throwable2;
        Class<xc3_0> clazz;
        block5: {
            View view2;
            block6: {
                clazz = xc3_0.class;
                boolean bl2 = td0.b(clazz);
                view2 = null;
                if (bl2) {
                    return null;
                }
                if (view == null) {
                    return null;
                }
                try {
                    view = view.getParent();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                bl2 = view instanceof ViewGroup;
                if (!bl2) break block6;
                view2 = view = (ViewGroup)view;
            }
            return view2;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Exception decompiling
     */
    public static final String j(View var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 112->116)] java.lang.Throwable
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

    /*
     * Exception decompiling
     */
    public static final void n(View var0, JSONObject var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [33, 32 : 178->184)] java.lang.Throwable
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

    public final JSONObject e(View view) {
        Throwable throwable2;
        block20: {
            JSONObject jSONObject;
            block19: {
                String string2;
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return null;
                }
                try {
                    jSONObject = new JSONObject();
                    string2 = "top";
                }
                catch (Throwable throwable2) {}
                int n3 = view.getTop();
                jSONObject.put(string2, n3);
                string2 = "left";
                n3 = view.getLeft();
                jSONObject.put(string2, n3);
                string2 = "width";
                n3 = view.getWidth();
                jSONObject.put(string2, n3);
                string2 = "height";
                n3 = view.getHeight();
                jSONObject.put(string2, n3);
                string2 = "scrollx";
                n3 = view.getScrollX();
                jSONObject.put(string2, n3);
                string2 = "scrolly";
                n3 = view.getScrollY();
                jSONObject.put(string2, n3);
                string2 = "visibility";
                int n4 = view.getVisibility();
                try {
                    jSONObject.put(string2, n4);
                    break block19;
                }
                catch (JSONException jSONException) {}
                break block20;
            }
            return jSONObject;
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * Exception decompiling
     */
    public final View k(View var1_1, float[] var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [34, 32, 33 : 120->123)] java.lang.Throwable
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

    /*
     * Exception decompiling
     */
    public final void l() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [24, 22, 23 : 101->104)] java.lang.Throwable
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

    /*
     * Loose catch block
     */
    public final boolean m(View view, View view2) {
        Throwable throwable222;
        block22: {
            block18: {
                int n3;
                block21: {
                    block20: {
                        Object object;
                        block19: {
                            int n4 = 2;
                            n3 = 1;
                            Object object2 = td0.b(this);
                            if (object2) {
                                return false;
                            }
                            Object object3 = "view";
                            Intrinsics.checkNotNullParameter(view, (String)object3);
                            object3 = view.getClass();
                            {
                                catch (Throwable throwable222) {}
                            }
                            object3 = ((Class)object3).getName();
                            object = "com.facebook.react.views.view.ReactViewGroup";
                            object2 = Intrinsics.areEqual(object3, object);
                            if (!object2) break block18;
                            object2 = td0.b(this);
                            object = null;
                            if (object2) break block19;
                            object3 = new int[n4];
                            view.getLocationOnScreen((int[])object3);
                            Object object4 = object3[0];
                            float f5 = (float)object4;
                            object2 = object3[n3];
                            float f6 = (float)object2;
                            float[] fArray = new float[n4];
                            fArray[0] = f5;
                            try {
                                fArray[n3] = f6;
                            }
                            catch (Throwable throwable3) {
                                td0.a(this, throwable3);
                            }
                            object = fArray;
                        }
                        view2 = this.k(view2, (float[])object);
                        if (view2 == null) break block20;
                        int n7 = view2.getId();
                        int n8 = view.getId();
                        if (n7 != n8) break block20;
                        break block21;
                        break block22;
                    }
                    n3 = 0;
                }
                return n3 != 0;
            }
            return false;
        }
        td0.a(this, throwable222);
        return false;
    }
}

