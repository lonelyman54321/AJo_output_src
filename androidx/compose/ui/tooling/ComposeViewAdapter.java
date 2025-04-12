/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PathEffect
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.FrameLayout
 */
package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.tooling.ComposeViewAdapter$a;
import androidx.compose.ui.tooling.ComposeViewAdapter$b;
import androidx.compose.ui.tooling.ComposeViewAdapter$c;
import androidx.compose.ui.tooling.ComposeViewAdapter$d;
import androidx.compose.ui.tooling.ComposeViewAdapter$e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ComposeViewAdapter
extends FrameLayout {
    public final ComposeView a;
    public boolean b;
    public boolean c;
    public List d;
    public List e;
    public final D30 f;
    public String g;
    public final fn3 h;
    public u10 i;
    public final ParcelableSnapshotMutableState j;
    public boolean k;
    public boolean l;
    public String m;
    public Function0 n;
    public boolean o;
    public final Paint p;
    public Sy2 q;
    public final ComposeViewAdapter$c r;
    public final ComposeViewAdapter$d s;
    public final ComposeViewAdapter$b t;
    public final ComposeViewAdapter$a u;

    public ComposeViewAdapter(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        float[] fArray;
        Object object2 = this.getContext();
        super((Context)object2, null, 6, 0);
        this.a = object;
        object = mz0_2.a;
        this.d = object;
        this.e = object;
        super();
        this.f = object;
        object = "";
        this.g = object;
        super();
        this.h = object2;
        object2 = I10.b;
        this.i = object2;
        object2 = J83.g(Y20.a);
        this.j = object2;
        this.m = object;
        object = ComposeViewAdapter$e.c;
        this.n = object;
        this.o = true;
        super();
        float[] fArray2 = fArray = new float[4];
        float[] fArray3 = fArray;
        fArray2[0] = 5.0f;
        fArray3[1] = 10.0f;
        fArray2[2] = 15.0f;
        fArray3[3] = 20.0f;
        super(fArray, 0.0f);
        object.setPathEffect((PathEffect)object2);
        object2 = Paint.Style.STROKE;
        object.setStyle((Paint.Style)object2);
        int n3 = zx_0.i(OX.g);
        object.setColor(n3);
        this.p = object;
        super();
        this.r = object;
        super();
        this.s = object;
        super(this);
        this.t = object;
        super();
        this.u = object;
        this.f(attributeSet);
    }

    public ComposeViewAdapter(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        float[] fArray;
        Object object2 = this.getContext();
        super((Context)object2, null, 6, 0);
        this.a = object;
        object = mz0_2.a;
        this.d = object;
        this.e = object;
        super();
        this.f = object;
        object = "";
        this.g = object;
        super();
        this.h = object2;
        object2 = I10.b;
        this.i = object2;
        object2 = J83.g(Y20.a);
        this.j = object2;
        this.m = object;
        object = ComposeViewAdapter$e.c;
        this.n = object;
        this.o = true;
        super();
        float[] fArray2 = fArray = new float[4];
        float[] fArray3 = fArray;
        fArray2[0] = 5.0f;
        fArray3[1] = 10.0f;
        fArray2[2] = 15.0f;
        fArray3[3] = 20.0f;
        super(fArray, 0.0f);
        object.setPathEffect((PathEffect)object2);
        object2 = Paint.Style.STROKE;
        object.setStyle((Paint.Style)object2);
        n3 = zx_0.i(OX.g);
        object.setColor(n3);
        this.p = object;
        super();
        this.r = object;
        super();
        this.s = object;
        super(this);
        this.t = object;
        super();
        this.u = object;
        this.f(attributeSet);
    }

    public static final void a(ComposeViewAdapter composeViewAdapter, u10 u102, b30_0 object, int n3) {
        Function2 function2;
        int n4 = 1;
        int n7 = 2;
        int n8 = 4;
        ((Object)((Object)composeViewAdapter)).getClass();
        object = object.g(522143116);
        int n10 = n3 & 6;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(u102) ? 1 : 0);
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n3;
        } else {
            n10 = n3;
        }
        int n14 = n3 & 0x30;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object).x((Object)composeViewAdapter) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        if ((n10 &= 0x13) == (n14 = 18) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object2 = O30.h;
            composeViewAdapter.getContext();
            Object object3 = new Object();
            object2 = ((vc3_1)object2).c(object3);
            object3 = O30.i;
            Object object4 = XU0.a(composeViewAdapter.getContext());
            object3 = ((vc3_1)object3).c(object4);
            object4 = ew1_0.a;
            Object object5 = composeViewAdapter.t;
            object4 = ((nw0_1)object4).c(object5);
            object5 = Wv1.a;
            ComposeViewAdapter$a composeViewAdapter$a = composeViewAdapter.u;
            object5 = ((nw0_1)object5).c(composeViewAdapter$a);
            MB2[] mB2Array = new MB2[n8];
            composeViewAdapter$a = null;
            mB2Array[0] = object2;
            mB2Array[n4] = object3;
            mB2Array[n7] = object4;
            n7 = 3;
            mB2Array[n7] = object5;
            function2 = new O20(composeViewAdapter, u102);
            function2 = v10.c(-1475548980, function2, (b30_0)object);
            n10 = 56;
            L30.b(mB2Array, function2, (b30_0)object, n10);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            function2 = new sh_0((Object)composeViewAdapter, u102, n3, n4);
            ((CF2)object).d = function2;
        }
    }

    public static final boolean b(ComposeViewAdapter object, M11 object2) {
        boolean bl2;
        block7: {
            boolean bl3;
            block6: {
                object.getClass();
                object = object2.f;
                bl3 = object instanceof Collection;
                bl2 = false;
                if (!bl3) break block6;
                object2 = object;
                object2 = (Collection)object;
                bl3 = object2.isEmpty();
                if (bl3) break block7;
            }
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                object2 = object.next();
                if (object2 != null) {
                    object2 = ComposeViewAdapter.c(object2);
                } else {
                    bl3 = false;
                    object2 = null;
                }
                if (object2 == null) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }

    public static Method c(Object genericDeclaration) {
        genericDeclaration = genericDeclaration.getClass();
        String string2 = "getDesignInfo";
        int n3 = 3;
        Class[] classArray = new Class[n3];
        Class<Object> clazz = Integer.TYPE;
        int n4 = 0;
        classArray[0] = clazz;
        n4 = 1;
        classArray[n4] = clazz;
        clazz = String.class;
        n4 = 2;
        classArray[n4] = clazz;
        try {
            genericDeclaration = genericDeclaration.getDeclaredMethod(string2, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            genericDeclaration = null;
        }
        return genericDeclaration;
    }

    public static boolean e(M11 object) {
        int n3;
        int n4;
        Object object2 = ((M11)object).c;
        if (object2 == null || (object2 = ((L93)object2).d) == null) {
            object2 = "";
        }
        if ((n4 = ((String)object2).length()) == 0 && (n3 = (object = ((M11)object).c) != null ? ((L93)object).a : -1) == (n4 = -1)) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ad3_0 g(M11 var0) {
        var1_1 = var0 instanceof b42_0;
        var2_2 = 0;
        var3_3 = null;
        if (var1_1 != 0) {
            var4_4 = var0;
            var4_4 = (b42_0)var0;
        } else {
            var1_1 = 0;
            var4_4 = null;
        }
        if (var4_4 != null) {
            var4_4 = var4_4.h;
        } else {
            var1_1 = 0;
            var4_4 = null;
        }
        var5_5 = var4_4 instanceof Fp1;
        if (var5_5 != 0) {
            var4_4 = (Fp1)var4_4;
            var6_6 = var4_4;
        } else {
            var6_6 = null;
        }
        var4_4 = var0.g;
        var1_1 = var4_4.size();
        var5_5 = 1;
        var7_7 = var0.g;
        if (var1_1 == var5_5 && (var1_1 = (int)ComposeViewAdapter.e(var0)) != 0 && var6_6 == null) {
            return ComposeViewAdapter.g((M11)CollectionsKt.a0((Iterable)var7_7));
        }
        var7_7 = (Iterable)var7_7;
        var4_4 = new ArrayList();
        var7_7 = var7_7.iterator();
        while ((var8_8 = var7_7.hasNext()) != 0) {
            var10_10 /* !! */  = var9_9 = var7_7.next();
            var10_10 /* !! */  = (M11)var9_9;
            var11_11 = ComposeViewAdapter.e(var10_10 /* !! */ );
            if (!var11_11 || !(var11_11 = (var12_12 = var10_10 /* !! */ .g).isEmpty())) ** GOTO lbl-1000
            var11_11 = var10_10 /* !! */  instanceof b42_0;
            if (var11_11) {
                var10_10 /* !! */  = (b42_0)var10_10 /* !! */ ;
            } else {
                var13_13 = 0;
                var10_10 /* !! */  = null;
            }
            if (var10_10 /* !! */  != null) {
                var10_10 /* !! */  = ((b42_0)var10_10 /* !! */ ).h;
            } else {
                var13_13 = 0;
                var10_10 /* !! */  = null;
            }
            var11_11 = var10_10 /* !! */  instanceof Fp1;
            if (var11_11) {
                var10_10 /* !! */  = (Fp1)var10_10 /* !! */ ;
            } else {
                var13_13 = 0;
                var10_10 /* !! */  = null;
            }
            if (var10_10 /* !! */  == null) {
                var13_13 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var13_13 = 0;
                var10_10 /* !! */  = null;
            }
            if ((var13_13 ^= var5_5) == 0) continue;
            var4_4.add(var9_9);
        }
        var2_2 = yx_2.o(var4_4, 10);
        var14_14 = new ArrayList<ad3_0>(var2_2);
        var4_4 = var4_4.iterator();
        while ((var2_2 = (int)var4_4.hasNext()) != 0) {
            var3_3 = ComposeViewAdapter.g((M11)var4_4.next());
            var14_14.add((ad3_0)var3_3);
        }
        var12_12 = var0.c;
        if (var12_12 != null && (var3_3 = var12_12.d) != null) lbl-1000:
        // 2 sources

        {
            while (true) {
                continue;
                break;
            }
        }
        var3_3 = "";
        ** while (true)
        var7_7 = var3_3;
        if (var12_12 != null) {
            var8_8 = var2_2 = var12_12.a;
        } else {
            var2_2 = -1;
            var8_8 = -1;
        }
        var10_10 /* !! */  = var0.e;
        var4_4 = new ad3_0((String)var7_7, var8_8, (Vi1)var10_10 /* !! */ , (L93)var12_12, var14_14, (Fp1)var6_6);
        return var4_4;
    }

    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    public final String d(M11 object, Vi1 vi1) {
        Object object2;
        object = ((Iterable)((M11)object).f).iterator();
        do {
            Object object3;
            boolean bl2 = object.hasNext();
            object2 = null;
            if (!bl2) break;
            Object object4 = object.next();
            if (object4 == null) continue;
            int n3 = vi1.a;
            int n4 = vi1.c;
            Method method = ComposeViewAdapter.c(object4);
            if (method == null) continue;
            try {
                object3 = n3;
            }
            catch (Exception exception) {}
            Integer n7 = n4;
            String string2 = this.m;
            int n8 = 3;
            Object[] objectArray = new Object[n8];
            objectArray[0] = object3;
            n3 = 1;
            objectArray[n3] = n7;
            n3 = 2;
            objectArray[n3] = string2;
            object4 = method.invoke(object4, objectArray);
            object3 = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(object4, (String)object3);
            object4 = (String)object4;
            n3 = ((String)object4).length();
            if (n3 == 0) continue;
            object2 = object4;
        } while (object2 == null);
        return object2;
    }

    public final void dispatchDraw(Canvas canvas) {
        int n3;
        Object object;
        int n4;
        Object object2;
        Iterator<Object> iterator;
        super.dispatchDraw(canvas);
        boolean bl2 = this.k;
        if (bl2) {
            iterator = I10.c;
            object2 = this.j;
            ((h83_0)object2).setValue(iterator);
            iterator = this.i;
            ((h83_0)object2).setValue(iterator);
            this.invalidate();
        }
        iterator = this.n;
        iterator.invoke();
        bl2 = this.c;
        if (!bl2) {
            return;
        }
        iterator = this.d;
        object2 = new ArrayList();
        iterator = iterator.iterator();
        while ((n4 = iterator.hasNext()) != 0) {
            object = (ad3_0)iterator.next();
            Collection collection = kotlin.collections.a.b(object);
            object = CollectionsKt.W(((ad3_0)object).a(), collection);
            cx_2.r((Iterable)object, (Collection)object2);
        }
        iterator = ((ArrayList)object2).iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            object2 = (ad3_0)iterator.next();
            object = ((ad3_0)object2).c;
            int n7 = ((Vi1)object).d;
            if (n7 == 0 || (n4 = ((Vi1)object).c) == 0) continue;
            object2 = ((ad3_0)object2).c;
            n7 = ((Vi1)object2).a;
            int n8 = ((Vi1)object2).b;
            int n10 = ((Vi1)object2).c;
            n3 = ((Vi1)object2).d;
            object = new Rect(n7, n8, n10, n3);
            object2 = this.p;
            canvas.drawRect((Rect)object, (Paint)object2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(AttributeSet object) {
        X20 x20;
        void var1_4;
        long l2;
        Object object2 = this.r;
        VD3.b((View)this, (mu1_1)object2);
        ZD3.b((View)this, (zs2_1)object2);
        object2 = this.s;
        ae3_0.b((View)this, (sD3)object2);
        object2 = this.a;
        this.addView((View)object2);
        Object object3 = "http://schemas.android.com/tools";
        String string2 = object.getAttributeValue((String)object3, "composableName");
        if (string2 == null) {
            return;
        }
        char c2 = '.';
        String string3 = StringsKt.k0(string2, c2);
        String string4 = StringsKt.g0(c2, string2, string2);
        c2 = '\u0000';
        String string5 = null;
        int n3 = object.getAttributeIntValue((String)object3, "parameterProviderIndex", 0);
        string2 = object.getAttributeValue((String)object3, "parameterProviderClass");
        boolean bl2 = false;
        Object object4 = null;
        if (string2 != null) {
            try {
                object4 = Class.forName(string2);
            }
            catch (ClassNotFoundException classNotFoundException) {}
        }
        Class<?> clazz = object4;
        string2 = "animationClockStartTime";
        try {
            string2 = object.getAttributeValue((String)object3, string2);
            l2 = Long.parseLong(string2);
        }
        catch (Exception exception) {
            l2 = -1;
        }
        long l3 = l2;
        string2 = "forceCompositionInvalidation";
        boolean bl3 = object.getAttributeBooleanValue((String)object3, string2, false);
        string5 = "paintBounds";
        bl2 = this.c;
        c2 = (char)(object.getAttributeBooleanValue((String)object3, string5, bl2) ? 1 : 0);
        object4 = "printViewInfos";
        boolean bl4 = this.b;
        bl2 = object.getAttributeBooleanValue((String)object3, (String)object4, bl4);
        Object object5 = "findDesignInfoProviders";
        boolean bl5 = this.l;
        bl4 = object.getAttributeBooleanValue((String)object3, (String)object5, bl5);
        String string6 = "designInfoProvidersArgument";
        String string7 = object.getAttributeValue((String)object3, string6);
        this.c = c2;
        this.b = bl2;
        this.g = string4;
        this.k = bl3;
        this.l = bl4;
        if (string7 == null) {
            String string8 = "";
        }
        this.m = var1_4;
        t20_0 t20_02 = t20_0.c;
        this.n = t20_02;
        object5 = s20_0.c;
        object4 = x20;
        ComposeViewAdapter composeViewAdapter = this;
        x20 = new X20((Function0)object5, this, string3, string4, clazz, n3, l3);
        this.i = object3 = new u10(-2046245106, x20, true);
        ((ComposeView)((Object)object2)).setContent((Function2)object3);
        this.invalidate();
    }

    public final Sy2 getClock$ui_tooling_release() {
        Sy2 sy2 = this.q;
        if (sy2 != null) {
            return sy2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clock");
        return null;
    }

    public final List getDesignInfoList$ui_tooling_release() {
        return this.e;
    }

    public final boolean getStitchTrees$ui_tooling_release() {
        return this.o;
    }

    public final List getViewInfos$ui_tooling_release() {
        return this.d;
    }

    public final void onAttachedToWindow() {
        View view = this.a.getRootView();
        ComposeViewAdapter$c composeViewAdapter$c = this.r;
        VD3.b(view, composeViewAdapter$c);
        super.onAttachedToWindow();
    }

    /*
     * Exception decompiling
     */
    public final void onLayout(boolean var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[UNCONDITIONALDOLOOP]], but top level block is 16[DOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public final void setClock$ui_tooling_release(Sy2 sy2) {
        this.q = sy2;
    }

    public final void setDesignInfoList$ui_tooling_release(List list) {
        this.e = list;
    }

    public final void setStitchTrees$ui_tooling_release(boolean bl2) {
        this.o = bl2;
    }

    public final void setViewInfos$ui_tooling_release(List list) {
        this.d = list;
    }
}

