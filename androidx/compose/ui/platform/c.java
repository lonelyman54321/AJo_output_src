/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.os.Trace
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 */
package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.R$id;
import androidx.compose.ui.R$string;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.c$a;
import androidx.compose.ui.platform.c$d;
import androidx.compose.ui.platform.c$e;
import androidx.compose.ui.platform.c$f;
import androidx.compose.ui.platform.c$g;
import androidx.compose.ui.platform.c$h;
import androidx.compose.ui.platform.c$i;
import androidx.compose.ui.platform.c$k;
import androidx.compose.ui.platform.c$l;
import androidx.compose.ui.platform.c$m;
import androidx.compose.ui.platform.c$n;
import androidx.compose.ui.platform.c$o;
import androidx.core.view.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class c
extends a {
    public static final sr1_0 K;
    public final rr1_0 A;
    public final String B;
    public final String C;
    public final ju3 D;
    public final tr1_1 E;
    public IY2 F;
    public boolean G;
    public final cg_0 H;
    public final ArrayList I;
    public final c$m J;
    public final AndroidComposeView a;
    public int b;
    public final c$l c;
    public final AccessibilityManager d;
    public long e;
    public final ag_0 f;
    public final bg_0 g;
    public List h;
    public final Handler i;
    public final c$d j;
    public int k;
    public C2 l;
    public boolean m;
    public final tr1_1 n;
    public final tr1_1 o;
    public final ca3 p;
    public final ca3 q;
    public int r;
    public Integer s;
    public final Np t;
    public final le_2 u;
    public boolean v;
    public c$f w;
    public tr1_1 x;
    public final ur1_0 y;
    public final rr1_0 z;

    static {
        int n3 = 32;
        int n4 = R$id.accessibility_custom_action_0;
        int n7 = R$id.accessibility_custom_action_1;
        int n8 = R$id.accessibility_custom_action_2;
        int n10 = R$id.accessibility_custom_action_3;
        int n14 = R$id.accessibility_custom_action_4;
        int n15 = R$id.accessibility_custom_action_5;
        int n16 = R$id.accessibility_custom_action_6;
        int n17 = R$id.accessibility_custom_action_7;
        int n18 = R$id.accessibility_custom_action_8;
        int n19 = R$id.accessibility_custom_action_9;
        int n20 = R$id.accessibility_custom_action_10;
        int n21 = R$id.accessibility_custom_action_11;
        int n22 = R$id.accessibility_custom_action_12;
        int n24 = R$id.accessibility_custom_action_13;
        int n25 = R$id.accessibility_custom_action_14;
        int n26 = R$id.accessibility_custom_action_15;
        int n27 = R$id.accessibility_custom_action_16;
        int n28 = R$id.accessibility_custom_action_17;
        int n29 = R$id.accessibility_custom_action_18;
        int n30 = R$id.accessibility_custom_action_19;
        int n32 = R$id.accessibility_custom_action_20;
        int n34 = R$id.accessibility_custom_action_21;
        int n35 = R$id.accessibility_custom_action_22;
        int n36 = R$id.accessibility_custom_action_23;
        int n37 = R$id.accessibility_custom_action_24;
        int n38 = R$id.accessibility_custom_action_25;
        int n39 = R$id.accessibility_custom_action_26;
        int n41 = R$id.accessibility_custom_action_27;
        int n42 = R$id.accessibility_custom_action_28;
        int n43 = R$id.accessibility_custom_action_29;
        int n44 = R$id.accessibility_custom_action_30;
        int n45 = R$id.accessibility_custom_action_31;
        Object object = new int[]{n4, n7, n8, n10, n14, n15, n16, n17, n18, n19, n20, n21, n22, n24, n25, n26, n27, n28, n29, n30, n32, n34, n35, n36, n37, n38, n39, n41, n42, n43, n44, n45};
        n7 = Oi1.a;
        Object object2 = "elements";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        sr1_0 sr1_02 = new sr1_0(n3);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        n10 = sr1_02.b;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (n10 >= 0 && n10 <= (n7 = sr1_02.b)) {
            sr1_02.c(n7 += n3);
            object2 = sr1_02.a;
            n14 = sr1_02.b;
            if (n10 != n14) {
                n15 = n10 + 32;
                rp_1.f(n15, n10, n14, (int[])object2, (int[])object2);
            }
            rp_1.j(n10, 0, 12, (int[])object, (int[])object2);
            sr1_02.b = n4 = sr1_02.b + n3;
            K = sr1_02;
            return;
        }
        object = wk0_0.a(n10, "Index ", " must be in 0..");
        n7 = sr1_02.b;
        ((StringBuilder)object).append(n7);
        object = ((StringBuilder)object).toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
        throw indexOutOfBoundsException;
    }

    public c(AndroidComposeView serializable) {
        int n3;
        this.a = serializable;
        this.b = n3 = -1 << -1;
        Object object = new c$l(this);
        this.c = object;
        object = serializable.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        object = (AccessibilityManager)object;
        this.d = object;
        this.e = 100;
        Object object2 = new ag_0(this);
        this.f = object2;
        this.g = object2 = new bg_0(this);
        int n4 = -1;
        this.h = object = object.getEnabledAccessibilityServiceList(n4);
        Object object3 = Looper.getMainLooper();
        object = new Handler(object3);
        this.i = object;
        this.j = object = new c$d(this);
        this.k = n3;
        Object object4 = new tr1_1();
        this.n = object4;
        object4 = new tr1_1();
        this.o = object4;
        this.p = object4 = new ca3(0);
        this.q = object4 = new ca3(0);
        this.r = n4;
        this.t = object4 = new Np(0);
        int n7 = 1;
        this.u = object4 = sr_2.a(n7, 6, null);
        this.v = n7;
        object4 = Ri1.a;
        object = "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>";
        Intrinsics.checkNotNull(object4, (String)object);
        this.x = object4;
        super(null);
        this.y = object3;
        this.z = object2 = new rr1_0();
        this.A = object2 = new rr1_0();
        this.B = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.C = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.D = object2 = new ju3();
        this.E = object2 = new tr1_1();
        object3 = ((AndroidComposeView)((Object)serializable)).getSemanticsOwner().a();
        Intrinsics.checkNotNull(object4, (String)object);
        this.F = object2 = new IY2((GY2)object3, (Qi1)object4);
        object4 = new c$a(this);
        serializable.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object4);
        serializable = new Serializable(this, 0);
        this.H = serializable;
        this.I = serializable = new Serializable();
        super(this);
        this.J = serializable;
    }

    public static CharSequence G(CharSequence charSequence) {
        int n3;
        int n4 = charSequence.length();
        if (n4 == 0 || (n4 = charSequence.length()) <= (n3 = 100000)) {
            return charSequence;
        }
        n4 = 99999;
        boolean bl2 = Character.isHighSurrogate(charSequence.charAt(n4));
        if (bl2 && (bl2 = Character.isLowSurrogate(charSequence.charAt(n3)))) {
            n3 = 99999;
        }
        charSequence = charSequence.subSequence(0, n3);
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequence;
    }

    public static boolean k(GY2 object) {
        float f5;
        boolean bl2;
        Object object2 = ((GY2)object).d;
        Object object3 = MY2.C;
        object2 = (ao3)((Object)AY2.a(object2, (TY2)object3));
        object3 = MY2.t;
        object = ((GY2)object).d;
        object3 = (CP2)AY2.a((zy2_0)object, (TY2)object3);
        boolean bl3 = true;
        float f6 = Float.MIN_VALUE;
        boolean bl4 = false;
        if (object2 != null) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
            object2 = null;
        }
        TY2 tY2 = MY2.B;
        object = (Boolean)AY2.a((zy2_0)object, tY2);
        if (object != null) {
            if (object3 != null) {
                int n3 = ((CP2)object3).a;
                int n4 = 4;
                bl4 = CP2.a(n3, n4);
            }
            if (bl4) {
                bl3 = bl2;
                f6 = f5;
            }
            bl2 = bl3;
            f5 = f6;
        }
        return bl2;
    }

    public static Sl m(GY2 object) {
        Object object2 = ((GY2)object).d;
        TY2 tY2 = MY2.y;
        object2 = (Sl)AY2.a((zy2_0)object2, tY2);
        tY2 = MY2.v;
        object = (List)AY2.a(((GY2)object).d, tY2);
        object = object != null ? (Sl)CollectionsKt.firstOrNull((List)object) : null;
        if (object2 == null) {
            object2 = object;
        }
        return object2;
    }

    public static String n(GY2 object) {
        String string2 = null;
        if (object == null) {
            return null;
        }
        TY2 tY2 = MY2.b;
        object = ((GY2)object).d;
        LinkedHashMap linkedHashMap = ((zy2_0)object).a;
        boolean bl2 = linkedHashMap.containsKey(tY2);
        if (bl2) {
            return jv1_0.a((List)((zy2_0)object).c(tY2), ",", null, 62);
        }
        linkedHashMap = ((zy2_0)object).a;
        tY2 = MY2.y;
        bl2 = linkedHashMap.containsKey(tY2);
        if (bl2) {
            if ((object = (Sl)AY2.a((zy2_0)object, tY2)) != null) {
                string2 = ((Sl)object).a;
            }
            return string2;
        }
        tY2 = MY2.v;
        if ((object = (List)AY2.a((zy2_0)object, tY2)) != null && (object = (Sl)CollectionsKt.firstOrNull((List)object)) != null) {
            string2 = ((Sl)object).a;
        }
        return string2;
    }

    public static final boolean r(CT2 object, float f5) {
        float f6;
        Number number;
        float f7;
        int n3;
        float f8;
        float f11;
        Number number2;
        float f12;
        float f14;
        Function0 function0 = ((CT2)object).a;
        float f15 = f5 - 0.0f;
        Object object2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (object2 < 0 && (object2 = (f14 = (f12 = (number2 = (Number)function0.invoke()).floatValue()) - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) > 0 || (f11 = (f8 = f5 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0 && (n3 = (f7 = (f5 = (number = (Number)function0.invoke()).floatValue()) - (f6 = ((Number)(object = (Number)((CT2)object).b.invoke())).floatValue())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) < 0) {
            n3 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f6 = 0.0f;
            object = null;
        }
        return n3 != 0;
    }

    public static final boolean s(CT2 object) {
        float f5;
        float f6;
        float f7;
        int n3;
        Object object2 = ((CT2)object).a;
        Number number = (Number)object2.invoke();
        float f8 = number.floatValue();
        boolean bl2 = ((CT2)object).c;
        float f11 = f8 - 0.0f;
        Object object3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object3 > 0 && !bl2 || (n3 = (f7 = (f6 = ((Number)(object2 = (Number)object2.invoke())).floatValue()) - (f5 = ((Number)(object = (Number)((CT2)object).b.invoke())).floatValue())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) < 0 && bl2) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean t(CT2 cT2) {
        Object object = cT2.a;
        Number number = (Number)object.invoke();
        float f5 = number.floatValue();
        Number number2 = (Number)cT2.b.invoke();
        float f6 = number2.floatValue();
        boolean bl2 = cT2.c;
        Object object2 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object2 < 0) {
            if (!bl2) return true;
        }
        object = (Number)object.invoke();
        float f7 = ((Number)object).floatValue();
        boolean bl3 = false;
        f5 = 0.0f;
        number = null;
        float f8 = f7 - 0.0f;
        Object object3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object3 <= 0) return false;
        if (!bl2) return false;
        return true;
    }

    public static /* synthetic */ void y(c c2, int n3, int n4, Integer n7, int n8) {
        if ((n8 &= 4) != 0) {
            n7 = null;
        }
        c2.x(n3, n4, n7, null);
    }

    public final void A(int n3) {
        Object object = this.w;
        if (object != null) {
            Object object2 = ((c$f)object).a;
            int n4 = ((GY2)object2).g;
            if (n3 != n4) {
                return;
            }
            long l2 = SystemClock.uptimeMillis();
            long l3 = ((c$f)object).f;
            long l4 = (l2 -= l3) - (l3 = 1000L);
            n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
            if (n3 <= 0) {
                n3 = ((GY2)object2).g;
                n3 = this.u(n3);
                AccessibilityEvent accessibilityEvent = this.createEvent(n3, 131072);
                n4 = ((c$f)object).d;
                accessibilityEvent.setFromIndex(n4);
                n4 = ((c$f)object).e;
                accessibilityEvent.setToIndex(n4);
                n4 = ((c$f)object).b;
                accessibilityEvent.setAction(n4);
                int n7 = ((c$f)object).c;
                accessibilityEvent.setMovementGranularity(n7);
                object = accessibilityEvent.getText();
                object2 = androidx.compose.ui.platform.c.n((GY2)object2);
                object.add(object2);
                this.w(accessibilityEvent);
            }
        }
        this.w = null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void B(Qi1 var1_1) {
        block64: {
            var2_2 = this;
            var3_3 = var1_1;
            var5_5 = this.I;
            var4_4 = new Object(var5_5);
            var5_5.clear();
            var6_6 = var1_1.b;
            var7_7 = var1_1.a;
            var8_8 = var7_7.length;
            var9_9 = var8_8 + -2;
            if (var9_9 < 0) break block64;
            var10_10 = 0;
            var11_11 = null;
            while (true) {
                block84: {
                    block65: {
                        var12_12 = var7_7[var10_10];
                        var14_13 = (var12_12 ^ (long)-1) << 7 & var12_12;
                        var16_14 = -9187201950435737472L;
                        cfr_temp_0 = (var14_13 &= var16_14) - var16_14;
                        var18_15 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var18_15 /* !! */  == false) break block65;
                        var19_16 = ~(var10_10 - var9_9) >>> 31;
                        var18_15 /* !! */  = 8;
                        var20_17 = 8 - var19_16;
                        var16_14 = var12_12;
                        var19_16 = 0;
                        var21_18 = null;
                        while (var19_16 < var20_17) {
                            block83: {
                                block66: {
                                    block67: {
                                        block63: {
                                            block58: {
                                                block62: {
                                                    block61: {
                                                        var12_12 = var16_14 & 255L;
                                                        var22_19 = 128L;
                                                        cfr_temp_1 = var12_12 - var22_19;
                                                        var24_20 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                        if (var24_20 /* !! */  >= 0 || (var26_22 = (IY2)var2_2.E.c(var25_21 = var6_6[var8_8 = (var10_10 << 3) + var19_16])) == null) break block66;
                                                        var28_24 = var27_23 = var3_3.c(var25_21);
                                                        var28_24 = (KY2)var27_23;
                                                        var28_24 = var28_24 != null ? var28_24.a : null;
                                                        if (var28_24 == null) break block67;
                                                        var29_25 = var28_24.d;
                                                        var30_26 = var29_25.iterator();
                                                        var31_27 = false;
                                                        block2: while (true) {
                                                            block82: {
                                                                block81: {
                                                                    block80: {
                                                                        block60: {
                                                                            block77: {
                                                                                block78: {
                                                                                    block79: {
                                                                                        block74: {
                                                                                            block75: {
                                                                                                block76: {
                                                                                                    block73: {
                                                                                                        block72: {
                                                                                                            block71: {
                                                                                                                block70: {
                                                                                                                    block59: {
                                                                                                                        block69: {
                                                                                                                            block68: {
                                                                                                                                var32_28 = var30_26.hasNext();
                                                                                                                                var33_29 = var26_22.a;
                                                                                                                                if (var32_28 == 0) break block58;
                                                                                                                                var34_30 = (Map.Entry)var30_26.next();
                                                                                                                                var35_31 /* !! */  = var34_30.getKey();
                                                                                                                                var36_32 = var26_22;
                                                                                                                                var26_22 = MY2.p;
                                                                                                                                var37_33 = (int)Intrinsics.areEqual(var35_31 /* !! */ , var26_22);
                                                                                                                                if (var37_33 != 0) break block68;
                                                                                                                                var35_31 /* !! */  = var34_30.getKey();
                                                                                                                                var38_34 = var19_16;
                                                                                                                                var21_18 = MY2.q;
                                                                                                                                var19_16 = (int)Intrinsics.areEqual(var35_31 /* !! */ , var21_18);
                                                                                                                                if (var19_16 != 0) break block69;
                                                                                                                                var37_33 = 0;
                                                                                                                                var35_31 /* !! */  = null;
                                                                                                                                break block70;
                                                                                                                            }
                                                                                                                            var38_34 = var19_16;
                                                                                                                        }
                                                                                                                        var19_16 = var4_4.size();
                                                                                                                        var35_31 /* !! */  = null;
                                                                                                                        for (var37_33 = 0; var37_33 < var19_16; ++var37_33) {
                                                                                                                            var39_35 = var4_4.get(var37_33);
                                                                                                                            var40_36 = var19_16;
                                                                                                                            var21_18 = var39_35;
                                                                                                                            var21_18 = (pt2_1)var39_35;
                                                                                                                            var19_16 = var21_18.a;
                                                                                                                            if (var19_16 == var25_21) {
                                                                                                                                var21_18 = (pt2_1)var4_4.get(var37_33);
                                                                                                                                break block59;
                                                                                                                            }
                                                                                                                            var19_16 = var40_36;
                                                                                                                        }
                                                                                                                        var19_16 = 0;
                                                                                                                        var21_18 = null;
                                                                                                                    }
                                                                                                                    if (var21_18 != null) {
                                                                                                                        var37_33 = 0;
                                                                                                                        var35_31 /* !! */  = null;
                                                                                                                    } else {
                                                                                                                        var21_18 = new pt2_1(var25_21, (List)var5_5);
                                                                                                                        var37_33 = 1;
                                                                                                                    }
                                                                                                                    var5_5.add(var21_18);
                                                                                                                }
                                                                                                                if (var37_33 != 0) break block71;
                                                                                                                var21_18 = var34_30.getValue();
                                                                                                                var35_31 /* !! */  = (TY2)var34_30.getKey();
                                                                                                                var19_16 = (int)Intrinsics.areEqual(var21_18, var35_31 /* !! */  = AY2.a((zy2_0)var33_29, var35_31 /* !! */ ));
                                                                                                                if (var19_16 == 0) break block71;
lbl90:
                                                                                                                // 3 sources

                                                                                                                while (true) {
                                                                                                                    var41_37 = var10_10;
                                                                                                                    var42_38 = var4_4;
                                                                                                                    var43_39 = var6_6;
                                                                                                                    var44_40 = var7_7;
                                                                                                                    var45_41 = var9_9;
                                                                                                                    var46_42 = var38_34;
                                                                                                                    var37_33 = 8;
lbl98:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        var47_43 = var25_21;
                                                                                                                        var9_9 = var20_17;
                                                                                                                        var48_44 = var5_5;
                                                                                                                        ** GOTO lbl540
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            if ((var49_45 = Intrinsics.areEqual(var21_18 = (TY2)var34_30.getKey(), var35_31 /* !! */  = MY2.e)) == 0) break block72;
                                                                                                            var26_22 = var34_30.getValue();
                                                                                                            Intrinsics.checkNotNull(var26_22, "null cannot be cast to non-null type kotlin.String");
                                                                                                            var26_22 = (String)var26_22;
                                                                                                            var21_18 = var33_29.a;
                                                                                                            var19_16 = (int)var21_18.containsKey(var35_31 /* !! */ );
                                                                                                            if (var19_16 == 0) ** GOTO lbl90
                                                                                                            var19_16 = 8;
                                                                                                            var2_2.z(var25_21, var19_16, (String)var26_22);
                                                                                                            ** continue;
                                                                                                        }
                                                                                                        var35_31 /* !! */  = MY2.c;
                                                                                                        var37_33 = (int)Intrinsics.areEqual(var21_18, var35_31 /* !! */ );
                                                                                                        if (var37_33 != 0) {
                                                                                                            var37_33 = 1;
                                                                                                        } else {
                                                                                                            var35_31 /* !! */  = MY2.C;
                                                                                                            var37_33 = (int)Intrinsics.areEqual(var21_18, var35_31 /* !! */ );
                                                                                                        }
                                                                                                        var49_45 = 64;
                                                                                                        if (var37_33 != 0) {
                                                                                                            var8_8 = var2_2.u(var25_21);
                                                                                                            var21_18 = var49_45;
                                                                                                            var18_15 /* !! */  = 2048;
                                                                                                            var37_33 = 8;
                                                                                                            androidx.compose.ui.platform.c.y(var2_2, var8_8, (int)var18_15 /* !! */ , (Integer)var21_18, var37_33);
                                                                                                            var8_8 = var2_2.u(var25_21);
                                                                                                            var27_23 = null;
                                                                                                            var21_18 = 0;
                                                                                                            androidx.compose.ui.platform.c.y(var2_2, var8_8, (int)var18_15 /* !! */ , (Integer)var21_18, var37_33);
                                                                                                            var41_37 = var10_10;
                                                                                                            var42_38 = var4_4;
                                                                                                            var43_39 = var6_6;
                                                                                                            var44_40 = var7_7;
                                                                                                            var45_41 = var9_9;
                                                                                                            var46_42 = var38_34;
                                                                                                            ** continue;
                                                                                                        }
                                                                                                        var40_36 = var20_17;
                                                                                                        var37_33 = 8;
                                                                                                        var27_23 = null;
                                                                                                        var48_44 = MY2.d;
                                                                                                        var20_17 = (int)Intrinsics.areEqual(var21_18, var48_44);
                                                                                                        if (var20_17 == 0) break block73;
                                                                                                        var8_8 = var2_2.u(var25_21);
                                                                                                        var21_18 = var49_45;
                                                                                                        var20_17 = 2048;
                                                                                                        androidx.compose.ui.platform.c.y(var2_2, var8_8, var20_17, (Integer)var21_18, var37_33);
                                                                                                        var8_8 = var2_2.u(var25_21);
                                                                                                        var21_18 = 0;
                                                                                                        androidx.compose.ui.platform.c.y(var2_2, var8_8, var20_17, (Integer)var21_18, var37_33);
                                                                                                        var41_37 = var10_10;
                                                                                                        var42_38 = var4_4;
                                                                                                        var48_44 = var5_5;
                                                                                                        var43_39 = var6_6;
                                                                                                        var44_40 = var7_7;
                                                                                                        var45_41 = var9_9;
                                                                                                        var46_42 = var38_34;
                                                                                                        var9_9 = var40_36;
lbl161:
                                                                                                        // 3 sources

                                                                                                        while (true) {
                                                                                                            var47_43 = var25_21;
                                                                                                            ** GOTO lbl540
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var48_44 = MY2.B;
                                                                                                    var37_33 = (int)Intrinsics.areEqual(var21_18, var48_44);
                                                                                                    var50_46 = var10_10;
                                                                                                    var11_11 = var28_24.c;
                                                                                                    var41_37 = 4;
                                                                                                    if (var37_33 == 0) break block74;
                                                                                                    var26_22 = MY2.t;
                                                                                                    if ((var26_22 = (CP2)AY2.a(var29_25, (TY2)var26_22)) == null) {
                                                                                                        var8_8 = 0;
                                                                                                        var26_22 = null;
                                                                                                    } else {
                                                                                                        var8_8 = (int)CP2.a(var26_22.a, var41_37);
                                                                                                    }
                                                                                                    if (var8_8 == 0) break block75;
                                                                                                    var26_22 = AY2.a(var29_25, (TY2)var48_44);
                                                                                                    var8_8 = (int)Intrinsics.areEqual(var26_22, var21_18 = Boolean.TRUE);
                                                                                                    if (var8_8 == 0) break block76;
                                                                                                    var8_8 = var2_2.u(var25_21);
                                                                                                    var26_22 = var2_2.createEvent(var8_8, var41_37);
                                                                                                    var48_44 = var28_24.a;
                                                                                                    var18_15 /* !! */  = 1;
                                                                                                    var21_18 = new GY2((LP1$c)var48_44, (boolean)var18_15 /* !! */ , (xp1_0)var11_11, var29_25);
                                                                                                    var48_44 = var21_18.i();
                                                                                                    var33_29 = MY2.b;
                                                                                                    var48_44 = (List)AY2.a((zy2_0)var48_44, (TY2)var33_29);
                                                                                                    var33_29 = ",";
                                                                                                    var10_10 = 62;
                                                                                                    var41_37 = 0;
                                                                                                    var3_3 = null;
                                                                                                    if (var48_44 != null) {
                                                                                                        var48_44 = var51_47 = jv1_0.a((List)var48_44, (String)var33_29, null, var10_10);
                                                                                                    } else {
                                                                                                        var20_17 = 0;
                                                                                                        var48_44 = null;
                                                                                                    }
                                                                                                    var21_18 = var21_18.i();
                                                                                                    var35_31 /* !! */  = MY2.v;
                                                                                                    var21_18 = (List)AY2.a((zy2_0)var21_18, var35_31 /* !! */ );
                                                                                                    if (var21_18 != null) {
                                                                                                        var21_18 = jv1_0.a((List)var21_18, (String)var33_29, null, var10_10);
                                                                                                    } else {
                                                                                                        var19_16 = 0;
                                                                                                        var21_18 = null;
                                                                                                    }
                                                                                                    if (var48_44 != null) {
                                                                                                        var26_22.setContentDescription((CharSequence)var48_44);
                                                                                                        var48_44 = Unit.a;
                                                                                                    }
                                                                                                    if (var21_18 != null) {
                                                                                                        var48_44 = var26_22.getText();
                                                                                                        var48_44.add(var21_18);
                                                                                                    }
                                                                                                    var2_2.w((AccessibilityEvent)var26_22);
                                                                                                    var42_38 = var4_4;
                                                                                                    var48_44 = var5_5;
                                                                                                    var43_39 = var6_6;
                                                                                                    var44_40 = var7_7;
                                                                                                    var45_41 = var9_9;
                                                                                                    var46_42 = var38_34;
                                                                                                    var9_9 = var40_36;
                                                                                                    var41_37 = var50_46;
                                                                                                    var37_33 = 8;
                                                                                                    ** GOTO lbl161
                                                                                                }
                                                                                                var8_8 = var2_2.u(var25_21);
                                                                                                var19_16 = 0;
                                                                                                var21_18 = null;
                                                                                                var48_44 = 0;
                                                                                                var18_15 /* !! */  = 2048;
                                                                                                var37_33 = 8;
                                                                                                androidx.compose.ui.platform.c.y(var2_2, var8_8, (int)var18_15 /* !! */ , (Integer)var48_44, var37_33);
lbl233:
                                                                                                // 3 sources

                                                                                                while (true) {
                                                                                                    var42_38 = var4_4;
                                                                                                    var48_44 = var5_5;
                                                                                                    var43_39 = var6_6;
                                                                                                    var44_40 = var7_7;
                                                                                                    var45_41 = var9_9;
                                                                                                    var46_42 = var38_34;
                                                                                                    var9_9 = var40_36;
                                                                                                    var41_37 = var50_46;
                                                                                                    ** continue;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var19_16 = 0;
                                                                                            var21_18 = null;
                                                                                            var18_15 /* !! */  = 2048;
                                                                                            var37_33 = 8;
                                                                                            var8_8 = var2_2.u(var25_21);
                                                                                            var48_44 = var49_45;
                                                                                            androidx.compose.ui.platform.c.y(var2_2, var8_8, (int)var18_15 /* !! */ , (Integer)var48_44, var37_33);
                                                                                            var8_8 = var2_2.u(var25_21);
                                                                                            var48_44 = 0;
                                                                                            androidx.compose.ui.platform.c.y(var2_2, var8_8, (int)var18_15 /* !! */ , (Integer)var48_44, var37_33);
                                                                                            ** GOTO lbl233
                                                                                        }
                                                                                        var37_33 = 8;
                                                                                        var48_44 = MY2.b;
                                                                                        var20_17 = (int)Intrinsics.areEqual(var21_18, var48_44);
                                                                                        if (var20_17 != 0) {
                                                                                            var8_8 = var2_2.u(var25_21);
                                                                                            var21_18 = var41_37;
                                                                                            var48_44 = var34_30.getValue();
                                                                                            var33_29 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>";
                                                                                            Intrinsics.checkNotNull(var48_44, (String)var33_29);
                                                                                            var48_44 = (List)var48_44;
                                                                                            var18_15 /* !! */  = 2048;
                                                                                            var2_2.x(var8_8, (int)var18_15 /* !! */ , (Integer)var21_18, (List)var48_44);
                                                                                            ** continue;
                                                                                        }
                                                                                        var48_44 = MY2.y;
                                                                                        var41_37 = (int)Intrinsics.areEqual(var21_18, var48_44);
                                                                                        var52_48 = 0xFFFFFFFFL;
                                                                                        var54_49 = 32;
                                                                                        var39_35 = "";
                                                                                        if (var41_37 == 0) break block77;
                                                                                        var21_18 = var29_25.a;
                                                                                        var26_22 = yY2.i;
                                                                                        var8_8 = (int)var21_18.containsKey(var26_22);
                                                                                        if (var8_8 == 0) break block78;
                                                                                        var26_22 = (Sl)AY2.a((zy2_0)var33_29, (TY2)var48_44);
                                                                                        if (var26_22 == null) {
                                                                                            var26_22 = var39_35;
                                                                                        }
                                                                                        var48_44 = (Sl)AY2.a(var29_25, (TY2)var48_44);
                                                                                        if (var48_44 == null) {
                                                                                            var48_44 = var39_35;
                                                                                        }
                                                                                        var11_11 = androidx.compose.ui.platform.c.G((CharSequence)var48_44);
                                                                                        var41_37 = var26_22.length();
                                                                                        var37_33 = var48_44.length();
                                                                                        var42_38 = var4_4;
                                                                                        var55_50 = var41_37 > var37_33 ? var37_33 : var41_37;
                                                                                        var43_39 = var6_6;
                                                                                        var47_43 = 0;
                                                                                        var6_6 = null;
                                                                                        while (true) {
                                                                                            var44_40 = var7_7;
                                                                                            if (var47_43 >= var55_50) break;
                                                                                            var46_42 = var26_22.charAt(var47_43);
                                                                                            var45_41 = var9_9;
                                                                                            var9_9 = var48_44.charAt(var47_43);
                                                                                            if (var46_42 != var9_9) lbl-1000:
                                                                                            // 2 sources

                                                                                            {
                                                                                                while (true) {
                                                                                                    continue;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var46_42 = 1;
                                                                                            var47_43 += var46_42;
                                                                                            var9_9 = var45_41;
                                                                                        }
                                                                                        var45_41 = var9_9;
                                                                                        ** continue;
                                                                                        var46_42 = 1;
                                                                                        var56_51 = var5_5;
                                                                                        for (var9_9 = 0; var9_9 < (var57_52 = var55_50 - var47_43); var9_9 += var57_52) {
                                                                                            var57_52 = var41_37 + -1 - var9_9;
                                                                                            var57_52 = var26_22.charAt(var57_52);
                                                                                            var32_28 = var37_33 + -1;
                                                                                            var46_42 = var32_28 - var9_9;
                                                                                            if (var57_52 != (var46_42 = (int)var48_44.charAt(var46_42))) break;
                                                                                            var57_52 = 1;
                                                                                            var46_42 = 1;
                                                                                        }
                                                                                        var41_37 = var41_37 - var9_9 - var47_43;
                                                                                        var20_17 = var37_33 - var9_9 - var47_43;
                                                                                        var4_4 = MY2.D;
                                                                                        var33_29 = var33_29.a;
                                                                                        var57_52 = (int)var33_29.containsKey(var4_4);
                                                                                        var19_16 = (int)var21_18.containsKey(var4_4);
                                                                                        var4_4 = MY2.y;
                                                                                        var18_15 /* !! */  = (long)var33_29.containsKey(var4_4);
                                                                                        if (var18_15 /* !! */  != false && var57_52 == 0 && var19_16 != 0) {
                                                                                            var55_50 = 1;
                                                                                        } else {
                                                                                            var55_50 = 0;
                                                                                            var4_4 = null;
                                                                                        }
                                                                                        if (var18_15 /* !! */  != false && var57_52 != 0 && var19_16 == 0) {
                                                                                            var57_52 = 1;
                                                                                        } else {
                                                                                            var57_52 = 0;
                                                                                            var5_5 = null;
                                                                                        }
                                                                                        if (var55_50 == 0 && var57_52 == 0) {
                                                                                            var19_16 = var2_2.u(var25_21);
                                                                                            var18_15 /* !! */  = 16;
                                                                                            var21_18 = var2_2.createEvent(var19_16, (int)var18_15 /* !! */ );
                                                                                            var21_18.setFromIndex(var47_43);
                                                                                            var21_18.setRemovedCount(var41_37);
                                                                                            var21_18.setAddedCount(var20_17);
                                                                                            var21_18.setBeforeText((CharSequence)var26_22);
                                                                                            var26_22 = var21_18.getText();
                                                                                            var26_22.add(var11_11);
                                                                                            var47_43 = var25_21;
                                                                                            var46_42 = var38_34;
                                                                                            var9_9 = var40_36;
                                                                                            var41_37 = var50_46;
                                                                                            var37_33 = 8;
                                                                                        } else {
                                                                                            var19_16 = var2_2.u(var25_21);
                                                                                            var8_8 = 0;
                                                                                            var48_44 = 0;
                                                                                            var33_29 = 0;
                                                                                            var3_3 = var37_33;
                                                                                            var35_31 /* !! */  = var36_32;
                                                                                            var26_22 = this;
                                                                                            var47_43 = var25_21;
                                                                                            var25_21 = var19_16;
                                                                                            var46_42 = var38_34;
                                                                                            var21_18 = var48_44;
                                                                                            var9_9 = var40_36;
                                                                                            var48_44 = var33_29;
                                                                                            var37_33 = 8;
                                                                                            var33_29 = var3_3;
                                                                                            var41_37 = var50_46;
                                                                                            var21_18 = this.f(var19_16, (Integer)var21_18, (Integer)var48_44, (Integer)var3_3, (CharSequence)var11_11);
                                                                                        }
                                                                                        var26_22 = "android.widget.EditText";
                                                                                        var21_18.setClassName((CharSequence)var26_22);
                                                                                        var2_2.w((AccessibilityEvent)var21_18);
                                                                                        if (var55_50 != 0 || var57_52 != 0) break block79;
lbl377:
                                                                                        // 3 sources

                                                                                        while (true) {
                                                                                            var48_44 = var56_51;
                                                                                            ** GOTO lbl540
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var26_22 = MY2.z;
                                                                                    var26_22 = (mm3)var29_25.c((TY2)var26_22);
                                                                                    var12_12 = var26_22.a;
                                                                                    var58_53 = var12_12 >> var54_49;
                                                                                    var18_15 /* !! */  = (int)var58_53;
                                                                                    var21_18.setFromIndex((int)var18_15 /* !! */ );
                                                                                    var25_21 = (int)(var12_12 &= var52_48);
                                                                                    var21_18.setToIndex(var25_21);
                                                                                    var2_2.w((AccessibilityEvent)var21_18);
                                                                                    ** GOTO lbl377
                                                                                }
                                                                                var42_38 = var4_4;
                                                                                var56_51 = var5_5;
                                                                                var43_39 = var6_6;
                                                                                var44_40 = var7_7;
                                                                                var45_41 = var9_9;
                                                                                var46_42 = var38_34;
                                                                                var9_9 = var40_36;
                                                                                var41_37 = var10_10;
                                                                                var47_43 = var25_21;
                                                                                var8_8 = var2_2.u(var25_21);
                                                                                var55_50 = 2;
                                                                                var60_54 = var55_50;
                                                                                var19_16 = 2048;
                                                                                androidx.compose.ui.platform.c.y(var2_2, var8_8, var19_16, (Integer)var60_54, var37_33);
                                                                                ** GOTO lbl377
                                                                            }
                                                                            var42_38 = var4_4;
                                                                            var56_51 = var5_5;
                                                                            var43_39 = var6_6;
                                                                            var44_40 = var7_7;
                                                                            var45_41 = var9_9;
                                                                            var46_42 = var38_34;
                                                                            var9_9 = var40_36;
                                                                            var41_37 = var10_10;
                                                                            var47_43 = var25_21;
                                                                            var60_54 = MY2.z;
                                                                            var57_52 = Intrinsics.areEqual(var21_18, var60_54);
                                                                            var55_50 = var28_24.g;
                                                                            if (var57_52 != 0) {
                                                                                var26_22 = (Sl)AY2.a(var29_25, (TY2)var48_44);
                                                                                if (var26_22 != null && (var26_22 = var26_22.a) != null) {
                                                                                    var39_35 = var26_22;
                                                                                }
                                                                                var26_22 = (mm3)var29_25.c((TY2)var60_54);
                                                                                var25_21 = var2_2.u(var47_43);
                                                                                var14_13 = var26_22.a;
                                                                                var61_55 = var14_13 >> var54_49;
                                                                                var33_29 = (int)var61_55;
                                                                                var48_44 = (int)(var14_13 &= var52_48);
                                                                                var8_8 = var39_35.length();
                                                                                var11_11 = var8_8;
                                                                                var5_5 = androidx.compose.ui.platform.c.G((CharSequence)var39_35);
                                                                                var26_22 = this;
                                                                                var21_18 = var33_29;
                                                                                var33_29 = var11_11;
                                                                                var11_11 = var5_5;
                                                                                var26_22 = this.f(var25_21, (Integer)var21_18, (Integer)var48_44, (Integer)var33_29, (CharSequence)var5_5);
                                                                                var2_2.w((AccessibilityEvent)var26_22);
                                                                                var2_2.A(var55_50);
                                                                                ** continue;
                                                                            }
                                                                            var25_21 = (int)Intrinsics.areEqual(var21_18, var26_22);
                                                                            if (var25_21 != 0) {
                                                                                var25_21 = 1;
                                                                            } else {
                                                                                var60_54 = MY2.q;
                                                                                var25_21 = (int)Intrinsics.areEqual(var21_18, var60_54);
                                                                            }
                                                                            if (var25_21 == 0) break block80;
                                                                            var2_2.q((xp1_0)var11_11);
                                                                            var25_21 = var56_51.size();
                                                                            var21_18 = null;
                                                                            for (var19_16 = 0; var19_16 < var25_21; var19_16 += var18_15 /* !! */ ) {
                                                                                var48_44 = var56_51;
                                                                                var33_29 = (pt2_1)var56_51.get(var19_16);
                                                                                var18_15 /* !! */  = var33_29.a;
                                                                                if (var18_15 /* !! */  == var47_43) {
                                                                                    var60_54 = (pt2_1)var56_51.get(var19_16);
                                                                                    break block60;
                                                                                }
                                                                                var18_15 /* !! */  = 1;
                                                                            }
                                                                            var48_44 = var56_51;
                                                                            var25_21 = 0;
                                                                            var60_54 = null;
                                                                        }
                                                                        Intrinsics.checkNotNull(var60_54);
                                                                        var60_54.e = var26_22 = (CT2)AY2.a(var29_25, (TY2)var26_22);
                                                                        var26_22 = MY2.q;
                                                                        var60_54.f = var26_22 = (CT2)AY2.a(var29_25, (TY2)var26_22);
                                                                        var26_22 = var60_54.b;
                                                                        var8_8 = (int)var26_22.contains(var60_54);
                                                                        if (var8_8 != 0) {
                                                                            var26_22 = var2_2.a.getSnapshotObserver();
                                                                            var21_18 = new dg_0((pt2_1)var60_54, var2_2);
                                                                            var33_29 = var2_2.J;
                                                                            var26_22.a((Tg2)var60_54, (Function1)var33_29, (Function0)var21_18);
                                                                        }
                                                                        ** GOTO lbl540
                                                                    }
                                                                    var48_44 = var56_51;
                                                                    var26_22 = MY2.l;
                                                                    var8_8 = (int)Intrinsics.areEqual(var21_18, var26_22);
                                                                    if (var8_8 == 0) break block81;
                                                                    var26_22 = var34_30.getValue();
                                                                    var60_54 = "null cannot be cast to non-null type kotlin.Boolean";
                                                                    Intrinsics.checkNotNull(var26_22, (String)var60_54);
                                                                    var26_22 = (Boolean)var26_22;
                                                                    var8_8 = (int)var26_22.booleanValue();
                                                                    if (var8_8 != 0) {
                                                                        var8_8 = var2_2.u(var55_50);
                                                                        var26_22 = var2_2.createEvent(var8_8, var37_33);
                                                                        var2_2.w((AccessibilityEvent)var26_22);
                                                                    }
                                                                    var8_8 = var2_2.u(var55_50);
                                                                    var60_54 = null;
                                                                    var21_18 = 0;
                                                                    var25_21 = 2048;
                                                                    androidx.compose.ui.platform.c.y(var2_2, var8_8, var25_21, (Integer)var21_18, var37_33);
                                                                    ** GOTO lbl540
                                                                }
                                                                var26_22 = yY2.v;
                                                                var25_21 = (int)Intrinsics.areEqual(var21_18, var26_22);
                                                                if (var25_21 == 0) break block61;
                                                                var60_54 = (List)var29_25.c((TY2)var26_22);
                                                                if ((var26_22 = (List)AY2.a((zy2_0)var33_29, (TY2)var26_22)) == null) break;
                                                                var21_18 = new LinkedHashSet();
                                                                var18_15 /* !! */  = var60_54.size();
                                                                var11_11 = null;
                                                                for (var10_10 = 0; var10_10 < var18_15 /* !! */ ; var10_10 += var57_52) {
                                                                    ((Af0)var60_54.get(var10_10)).getClass();
                                                                    var55_50 = 0;
                                                                    var4_4 = null;
                                                                    var21_18.add(null);
                                                                    var57_52 = 1;
                                                                }
                                                                var55_50 = 0;
                                                                var4_4 = null;
                                                                var57_52 = 1;
                                                                var60_54 = new LinkedHashSet();
                                                                var18_15 /* !! */  = var26_22.size();
                                                                var11_11 = null;
                                                                for (var10_10 = 0; var10_10 < var18_15 /* !! */ ; var10_10 += var57_52) {
                                                                    var51_47 = (Af0)var26_22.get(var10_10);
                                                                    var51_47.getClass();
                                                                    var60_54.add(null);
                                                                    var55_50 = 0;
                                                                    var4_4 = null;
                                                                }
                                                                var8_8 = (int)var21_18.containsAll((Collection<?>)var60_54);
                                                                if (var8_8 == 0 || (var8_8 = (int)var60_54.containsAll((Collection<?>)var21_18)) == 0) break block82;
                                                                while (true) {
                                                                    var31_27 = false;
                                                                    ** GOTO lbl540
                                                                    break;
                                                                }
                                                            }
lbl538:
                                                            // 3 sources

                                                            while (true) {
                                                                var31_27 = true;
lbl540:
                                                                // 8 sources

                                                                while (true) {
                                                                    var5_5 = var48_44;
                                                                    var10_10 = var41_37;
                                                                    var25_21 = var47_43;
                                                                    var19_16 = var46_42;
                                                                    var20_17 = var9_9;
                                                                    var26_22 = var36_32;
                                                                    var4_4 = var42_38;
                                                                    var6_6 = var43_39;
                                                                    var7_7 = var44_40;
                                                                    var9_9 = var45_41;
                                                                    var18_15 /* !! */  = 8;
lbl552:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var3_3 = var1_1;
                                                                        continue block2;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        var60_54 = (Collection)var60_54;
                                                        var8_8 = (int)var60_54.isEmpty();
                                                        if ((var8_8 ^= (var25_21 = 1)) == 0) ** continue;
                                                        var5_5 = var56_51;
                                                        var10_10 = var41_37;
                                                        var25_21 = var47_43;
                                                        var19_16 = var46_42;
                                                        var20_17 = var9_9;
                                                        var26_22 = var36_32;
                                                        var4_4 = var42_38;
                                                        var6_6 = var43_39;
                                                        var7_7 = var44_40;
                                                        var9_9 = var45_41;
                                                        var18_15 /* !! */  = 8;
                                                        var31_27 = true;
                                                        ** continue;
                                                    }
                                                    var26_22 = var34_30.getValue();
                                                    var8_8 = var26_22 instanceof H1;
                                                    if (var8_8 == 0) ** GOTO lbl538
                                                    var26_22 = var34_30.getValue();
                                                    Intrinsics.checkNotNull(var26_22, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                    var26_22 = (H1)var26_22;
                                                    var60_54 = (TY2)var34_30.getKey();
                                                    var60_54 = AY2.a((zy2_0)var33_29, (TY2)var60_54);
                                                    if (var26_22 == var60_54) {
                                                        while (true) {
                                                            var19_16 = 1;
                                                            break block62;
                                                            break;
                                                        }
                                                    }
                                                    var19_16 = var60_54 instanceof H1;
                                                    if (var19_16 == 0) lbl-1000:
                                                    // 3 sources

                                                    {
                                                        while (true) {
                                                            var19_16 = 0;
                                                            var21_18 = null;
                                                            break block62;
                                                            break;
                                                        }
                                                    }
                                                    var21_18 = var26_22.a;
                                                    var60_54 = (H1)var60_54;
                                                    var33_29 = var60_54.a;
                                                    var19_16 = (int)Intrinsics.areEqual(var21_18, var33_29);
                                                    if (var19_16 == 0) ** GOTO lbl-1000
                                                    var60_54 = var60_54.b;
                                                    if (((var26_22 = var26_22.b) != null || var60_54 == null) && (var26_22 == null || var60_54 != null)) ** continue;
                                                    ** continue;
                                                }
                                                if (var19_16 != 0) ** continue;
                                                ** continue;
                                            }
                                            var41_37 = var10_10;
                                            var42_38 = var4_4;
                                            var43_39 = var6_6;
                                            var44_40 = var7_7;
                                            var45_41 = var9_9;
                                            var37_33 = 8;
                                            var47_43 = var25_21;
                                            var46_42 = var19_16;
                                            var9_9 = var20_17;
                                            var48_44 = var5_5;
                                            if (!var31_27) {
                                                var26_22 = var33_29.iterator();
                                                while ((var25_21 = (int)var26_22.hasNext()) != 0) {
                                                    var60_54 = (Map.Entry)var26_22.next();
                                                    var21_18 = var28_24.i();
                                                    var21_18 = var21_18.a;
                                                    var25_21 = (int)var21_18.containsKey(var60_54 = (TY2)var60_54.getKey());
                                                    if (var25_21 != 0) continue;
                                                    var31_27 = true;
                                                    break block63;
                                                }
                                                var31_27 = false;
                                            }
                                        }
                                        if (var31_27) {
                                            var8_8 = var2_2.u(var47_43);
                                            var25_21 = 0;
                                            var60_54 = null;
                                            var21_18 = 0;
                                            var18_15 /* !! */  = 2048;
                                            androidx.compose.ui.platform.c.y(var2_2, var8_8, (int)var18_15 /* !! */ , (Integer)var21_18, var37_33);
                                        } else {
                                            var25_21 = 0;
                                            var60_54 = null;
                                        }
                                        break block83;
                                    }
                                    bh1_1.d("no value for specified key");
                                    throw null;
                                }
                                var41_37 = var10_10;
                                var42_38 = var4_4;
                                var43_39 = var6_6;
                                var44_40 = var7_7;
                                var45_41 = var9_9;
                                var25_21 = 0;
                                var60_54 = null;
                                var37_33 = 8;
                                var46_42 = var19_16;
                                var9_9 = var20_17;
                                var48_44 = var5_5;
                            }
                            var16_14 >>= var37_33;
                            var8_8 = 1;
                            var19_16 = var46_42 + 1;
                            var5_5 = var48_44;
                            var10_10 = var41_37;
                            var20_17 = var9_9;
                            var4_4 = var42_38;
                            var6_6 = var43_39;
                            var7_7 = var44_40;
                            var9_9 = var45_41;
                            var18_15 /* !! */  = 8;
                            var3_3 = var1_1;
                        }
                        var41_37 = var10_10;
                        var42_38 = var4_4;
                        var43_39 = var6_6;
                        var44_40 = var7_7;
                        var45_41 = var9_9;
                        var8_8 = 1;
                        var25_21 = 0;
                        var60_54 = null;
                        var37_33 = 8;
                        var9_9 = var20_17;
                        var48_44 = var5_5;
                        if (var20_17 != var37_33) break;
                        var19_16 = var45_41;
                        break block84;
                    }
                    var41_37 = var10_10;
                    var42_38 = var4_4;
                    var48_44 = var5_5;
                    var43_39 = var6_6;
                    var44_40 = var7_7;
                    var8_8 = 1;
                    var25_21 = 0;
                    var60_54 = null;
                    var19_16 = var9_9;
                }
                if (var41_37 == var19_16) break;
                var10_10 = var41_37 + 1;
                var3_3 = var1_1;
                var9_9 = var19_16;
                var5_5 = var48_44;
                var4_4 = var42_38;
                var6_6 = var43_39;
                var7_7 = var44_40;
            }
        }
    }

    public final void C(xp1_0 object, ur1_0 object2) {
        boolean n3 = ((xp1_0)object).e();
        if (!n3) {
            return;
        }
        Object object3 = this.a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        boolean bl2 = object3.containsKey(object);
        if (bl2) {
            return;
        }
        object3 = ((xp1_0)object).y;
        int n4 = 8;
        boolean bl3 = ((T32)object3).d(n4);
        if (!bl3) {
            object3 = c$o.c;
            object = kg.c((xp1_0)object, (Function1)object3);
        }
        if (object != null && (object3 = ((xp1_0)object).w()) != null) {
            int n7;
            int n8;
            boolean bl4 = ((zy2_0)object3).b;
            if (!bl4) {
                object3 = c$n.c;
                if ((object3 = kg.c((xp1_0)object, (Function1)object3)) != null) {
                    object = object3;
                }
            }
            if ((n8 = ((ur1_0)object2).b(n7 = ((xp1_0)object).b)) == 0) {
                return;
            }
            n7 = this.u(n7);
            n8 = 1;
            object2 = n8;
            int n10 = 2048;
            androidx.compose.ui.platform.c.y(this, n7, n10, (Integer)object2, n4);
        }
    }

    public final void D(xp1_0 xp1_02) {
        float f5;
        int n3 = xp1_02.e();
        if (n3 == 0) {
            return;
        }
        Object object = this.a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        n3 = object.containsKey(xp1_02);
        if (n3 != 0) {
            return;
        }
        int n4 = xp1_02.b;
        object = (CT2)this.n.c(n4);
        CT2 cT2 = (CT2)this.o.c(n4);
        if (object == null && cT2 == null) {
            return;
        }
        int n7 = 4096;
        float f6 = 5.74E-42f;
        xp1_02 = this.createEvent(n4, n7);
        if (object != null) {
            Number number = (Number)((CT2)object).a.invoke();
            f6 = number.floatValue();
            n7 = (int)f6;
            xp1_02.setScrollX(n7);
            object = (Number)((CT2)object).b.invoke();
            f5 = ((Number)object).floatValue();
            n3 = (int)f5;
            xp1_02.setMaxScrollX(n3);
        }
        if (cT2 != null) {
            n3 = (int)((Number)cT2.a.invoke()).floatValue();
            xp1_02.setScrollY(n3);
            object = (Number)cT2.b.invoke();
            f5 = ((Number)object).floatValue();
            n3 = (int)f5;
            xp1_02.setMaxScrollY(n3);
        }
        this.w((AccessibilityEvent)xp1_02);
    }

    public final boolean E(GY2 object, int n3, int n4, boolean n7) {
        Integer n8;
        Integer n10;
        Integer n14;
        Object object2 = ((GY2)object).d;
        TY2 tY2 = yY2.h;
        object2 = ((zy2_0)object2).a;
        boolean bl2 = object2.containsKey(tY2);
        boolean bl3 = false;
        if (bl2 && (bl2 = kg.a((GY2)object))) {
            object = (gx0_2)((H1)((GY2)object).d.c((TY2)tY2)).b;
            if (object != null) {
                Integer n15 = n3;
                Integer n16 = n4;
                Boolean bl4 = n7 != 0;
                object = (Boolean)object.invoke(n15, n16, bl4);
                bl3 = (Boolean)object;
            }
            return bl3;
        }
        if (n3 == n4 && n4 == (n7 = this.r)) {
            return false;
        }
        String string2 = androidx.compose.ui.platform.c.n((GY2)object);
        if (string2 == null) {
            return false;
        }
        if (n3 < 0 || n3 != n4 || n4 > (n7 = string2.length())) {
            n3 = -1;
        }
        this.r = n3;
        n3 = string2.length();
        n4 = 1;
        if (n3 > 0) {
            bl3 = true;
        }
        int n17 = ((GY2)object).g;
        int n18 = this.u(n17);
        n3 = 0;
        Integer n19 = null;
        if (bl3) {
            n7 = this.r;
            n10 = n14 = Integer.valueOf(n7);
        } else {
            n10 = null;
        }
        if (bl3) {
            n7 = this.r;
            n8 = n14 = Integer.valueOf(n7);
        } else {
            n8 = null;
        }
        if (bl3) {
            n3 = string2.length();
            n19 = n3;
        }
        n19 = this.f(n18, n10, n8, n19, string2);
        this.w((AccessibilityEvent)n19);
        this.A(n17);
        return n4 != 0;
    }

    public final ArrayList F(ArrayList arrayList, boolean bl2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        int n3;
        int n4;
        Object object8;
        tr1_1 tr1_12;
        int n7;
        c c2;
        block18: {
            aG2 aG22;
            c2 = this;
            n7 = 1;
            tr1_12 = Ri1.a;
            tr1_12 = new tr1_1();
            object8 = new ArrayList();
            n4 = arrayList.size();
            for (n3 = 0; n3 < n4; n3 += n7) {
                object7 = arrayList;
                object6 = (GY2)arrayList.get(n3);
                c2.g((GY2)object6, (ArrayList)object8, tr1_12);
            }
            object5 = new ArrayList();
            n3 = xx_2.h(object8);
            if (n3 >= 0) {
                int n8 = 0;
                object7 = null;
                while (true) {
                    block17: {
                        object6 = (GY2)((ArrayList)object8).get(n8);
                        if (n8 != 0) {
                            object4 = ((GY2)object6).f();
                            object3 = ((GY2)object6).f();
                            float f5 = ((aG2)object4).b;
                            float f6 = object3.d;
                            float f7 = f5 - f6;
                            object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                            if (object2 >= 0) {
                                object2 = 1;
                            } else {
                                object2 = 0;
                                aG22 = null;
                            }
                            int n10 = xx_2.h(object5);
                            if (n10 >= 0) {
                                int n14 = 0;
                                while (true) {
                                    float f8;
                                    float f11;
                                    float f12;
                                    aG2 aG23 = (aG2)((Pair)((ArrayList)object5).get((int)n14)).a;
                                    float f14 = aG23.b;
                                    float f15 = aG23.d;
                                    float f16 = f14 - f15;
                                    Object object9 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                    if (object9 >= 0) {
                                        object9 = true;
                                        f12 = Float.MIN_VALUE;
                                    } else {
                                        object9 = false;
                                        f12 = 0.0f;
                                    }
                                    if (object2 == 0 && object9 == false && (f11 = (f8 = (f14 = Math.max(f5, f14)) - (f12 = Math.min(f6, f15))) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) < 0) {
                                        float f17 = Math.max(aG23.a, 0.0f);
                                        f5 = Math.max(aG23.b, f5);
                                        float f18 = aG23.c;
                                        f11 = 2139095040;
                                        f14 = 1.0f / 0.0f;
                                        f18 = Math.min(f18, f14);
                                        f15 = Math.min(f15, f6);
                                        aG22 = new aG2(f17, f5, f18, f15);
                                        object4 = ((Pair)((ArrayList)object5).get((int)n14)).b;
                                        object = new Pair(aG22, object4);
                                        ((ArrayList)object5).set(n14, object);
                                        object = (List)((Pair)((ArrayList)object5).get((int)n14)).b;
                                        object.add(object6);
                                        object2 = 0;
                                        aG22 = null;
                                        break block17;
                                    }
                                    if (n14 == n10) break;
                                    n14 += n7;
                                }
                            }
                        }
                        object = ((GY2)object6).f();
                        object3 = new GY2[n7];
                        object2 = 0;
                        aG22 = null;
                        object3[0] = object6;
                        object6 = xx_2.j(object3);
                        object4 = new Pair(object, object6);
                        ((ArrayList)object5).add(object4);
                    }
                    if (n8 != n3) {
                        n8 += n7;
                        continue;
                    }
                    break block18;
                    break;
                }
            }
            object2 = 0;
            aG22 = null;
        }
        object = c$h.a;
        bx_2.q(object5, (Comparator)object);
        object = new ArrayList();
        int n15 = ((ArrayList)object5).size();
        for (n3 = 0; n3 < n15; n3 += n7) {
            object7 = (Pair)((ArrayList)object5).get(n3);
            object6 = (List)((Pair)object7).b;
            object4 = bl2 ? c$g.a : c$e.a;
            object3 = xp1_0.J;
            object3 = new eg_0((Comparator)object4);
            object4 = new fg_0((eg_0)object3);
            bx_2.q((List)object6, (Comparator)object4);
            object7 = (Collection)((Pair)object7).b;
            ((ArrayList)object).addAll(object7);
        }
        object5 = ig_0.c;
        object8 = new Zf((Function2)object5);
        bx_2.q((List)object, (Comparator)object8);
        while (object2 <= (n15 = xx_2.h((List)object))) {
            n15 = ((GY2)((ArrayList)object).get((int)object2)).g;
            object8 = (List)tr1_12.c(n15);
            if (object8 != null) {
                object5 = (GY2)((ArrayList)object).get((int)object2);
                n4 = (int)(c2.p((GY2)object5) ? 1 : 0);
                if (n4 == 0) {
                    ((ArrayList)object).remove((int)object2);
                } else {
                    object2 += n7;
                }
                object5 = object8;
                object5 = (Collection)object8;
                ((ArrayList)object).addAll((int)object2, object5);
                n15 = object8.size();
                object2 += n15;
                continue;
            }
            object2 += n7;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void H() {
        block29: {
            var1_1 = this;
            var3_3 /* !! */  = null;
            var2_2 = new ur1_0(null);
            var4_4 = this.y;
            var5_5 /* !! */  = var4_4.b;
            var6_6 = var4_4.a;
            var7_7 = var6_6.length + -2;
            var8_8 = this.E;
            var9_9 = 7;
            var10_10 = -9187201950435737472L;
            var12_11 = 8;
            if (var7_7 >= 0) {
                var13_12 = 0;
                while (true) {
                    if ((var18_15 /* !! */  = (cfr_temp_0 = (var16_14 = ((var14_13 = var6_6[var13_12]) ^ (long)-1) << var9_9 & var14_13 & var10_10) - var10_10) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false) {
                        var19_16 = ~(var13_12 - var7_7) >>> 31;
                        var19_16 = 8 - var19_16;
                        for (var20_17 = 0; var20_17 < var19_16; ++var20_17) {
                            var21_18 = 255L;
                            var23_19 = var14_13 & var21_18;
                            var25_20 = 128L;
                            cfr_temp_1 = var23_19 - var25_20;
                            var27_21 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var27_21 /* !! */  < 0) {
                                var18_15 /* !! */  = (var13_12 << 3) + var20_17;
                                var28_22 /* !! */  = var5_5 /* !! */ [var18_15 /* !! */ ];
                                var29_23 = (KY2)this.j().c((int)var28_22 /* !! */ );
                                if (var29_23 != null) {
                                    var29_23 = var29_23.a;
                                } else {
                                    var30_24 = false;
                                    var29_23 = null;
                                }
                                if (var29_23 == null || (var9_9 = (int)(var29_23 = var29_23.d.a).containsKey(var31_25 /* !! */  = MY2.e)) == 0) {
                                    var2_2.b((int)var28_22 /* !! */ );
                                    var31_25 /* !! */  = (IY2)var8_8.c((int)var28_22 /* !! */ );
                                    if (var31_25 /* !! */  != null && (var31_25 /* !! */  = var31_25 /* !! */ .a) != null) {
                                        var29_23 = MY2.e;
                                        var31_25 /* !! */  = (String)AY2.a((zy2_0)var31_25 /* !! */ , (TY2)var29_23);
                                    } else {
                                        var9_9 = 0;
                                        var31_25 /* !! */  = null;
                                    }
                                    var30_24 = 32;
                                    var1_1.z((int)var28_22 /* !! */ , (int)var30_24, (String)var31_25 /* !! */ );
                                }
                            }
                            var14_13 >>= var12_11;
                            var9_9 = 7;
                            var10_10 = -9187201950435737472L;
                        }
                        if (var19_16 != var12_11) break;
                    }
                    if (var13_12 == var7_7) break;
                    ++var13_12;
                    var9_9 = 7;
                    var10_10 = -9187201950435737472L;
                }
            }
            var5_5 /* !! */  = (int[])"elements";
            Intrinsics.checkNotNullParameter(var2_2, (String)var5_5 /* !! */ );
            Intrinsics.checkNotNullParameter(var2_2, (String)var5_5 /* !! */ );
            var5_5 /* !! */  = var2_2.b;
            var2_2 = var2_2.a;
            var32_26 = ((Object)var2_2).length + -2;
            if (var32_26 < 0) break block29;
            var7_7 = 0;
            while (true) {
                block33: {
                    block30: {
                        var33_27 = var2_2[var7_7];
                        var35_28 = var33_27 ^ (long)-1;
                        var20_17 = 7;
                        var35_28 = var35_28 << var20_17 & var33_27;
                        var37_29 = -9187201950435737472L;
                        cfr_temp_2 = (var35_28 &= var37_29) - var37_29;
                        var28_22 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                        if (var28_22 /* !! */  == false) break block30;
                        var39_30 = ~(var7_7 - var32_26) >>> 31;
                        var39_30 = 8 - var39_30;
                        for (var19_16 = 0; var19_16 < var39_30; ++var19_16) {
                            block31: {
                                var10_10 = (long)(var33_27 & 255L);
                                var37_29 = 128L;
                                cfr_temp_3 = var10_10 - var37_29;
                                var40_31 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                if (var40_31 /* !! */  >= 0) break block31;
                                var20_17 = (var7_7 << 3) + var19_16;
                                var20_17 = var5_5 /* !! */ [var20_17];
                                var9_9 = -862048943 * var20_17;
                                var28_22 /* !! */  = var9_9 << 16;
                                var9_9 ^= var28_22 /* !! */ ;
                                var28_22 /* !! */  = var9_9 & 127;
                                var30_24 = var4_4.c;
                                var9_9 = var9_9 >>> 7 & var30_24;
                                var40_31 /* !! */  = 0;
                                while (true) {
                                    block32: {
                                        block28: {
                                            var3_3 /* !! */  = (int[])var4_4.a;
                                            var41_32 = var9_9 >> 3;
                                            var42_33 = var9_9 & 7;
                                            var43_34 = var2_2;
                                            var44_35 = var42_33 << 3;
                                            var45_36 = var3_3 /* !! */ [var41_32] >>> var44_35;
                                            var47_37 = var3_3 /* !! */ [++var41_32];
                                            var12_11 = 64 - var44_35;
                                            var49_38 = -((long)var44_35);
                                            var51_39 /* !! */  = 63;
                                            var49_38 >>= var51_39 /* !! */ ;
                                            var49_38 = (var47_37 <<= var12_11) & var49_38;
                                            var49_38 = var45_36 | var49_38;
                                            var52_40 /* !! */  = var5_5 /* !! */ ;
                                            var42_33 = var32_26;
                                            var53_41 = (long)var28_22 /* !! */ ;
                                            var45_36 = (int)0x101010101010101L;
                                            var53_41 = var53_41 * var45_36 ^ var49_38;
                                            var45_36 = (int)(var53_41 - var45_36);
                                            var53_41 ^= (long)-1;
                                            var53_41 = var45_36 & var53_41;
                                            var55_42 = -9187201950435737472L;
                                            var53_41 &= var55_42;
                                            while ((var51_39 /* !! */  = (int)((cfr_temp_4 = var53_41 - (var45_36 = (int)0L)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1))) != 0) {
                                                var57_43 = Long.numberOfTrailingZeros(var53_41) >> 3;
                                                var57_43 = var9_9 + var57_43 & var30_24;
                                                var51_39 /* !! */  = (int)var28_22 /* !! */ ;
                                                var58_44 = var4_4.b;
                                                var28_22 /* !! */  = var58_44[var57_43];
                                                if (var28_22 /* !! */  == var20_17) {
                                                    var44_35 = var57_43;
                                                    break block28;
                                                }
                                                var45_36 = (int)(var53_41 - 1L);
                                                var53_41 &= var45_36;
                                                var28_22 /* !! */  = var51_39 /* !! */ ;
                                            }
                                            var51_39 /* !! */  = (int)var28_22 /* !! */ ;
                                            var53_41 = var49_38 ^ (long)-1;
                                            var28_22 /* !! */  = 6;
                                            var49_38 &= (var53_41 <<= var28_22 /* !! */ );
                                            var53_41 = -9187201950435737472L;
                                            cfr_temp_5 = (var49_38 &= var53_41) - var45_36;
                                            var59_45 /* !! */  = (long)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                                            if (var59_45 /* !! */  == false) break block32;
                                            var57_43 = -1;
                                            var44_35 = -1;
                                        }
                                        if (var44_35 >= 0) {
                                            var4_4.f(var44_35);
                                        }
lbl139:
                                        // 4 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var44_35 = 8;
                                    var9_9 = var9_9 + (var40_31 /* !! */  += 8) & var30_24;
                                    var5_5 /* !! */  = var52_40 /* !! */ ;
                                    var32_26 = var42_33;
                                    var2_2 = var43_34;
                                    var28_22 /* !! */  = var51_39 /* !! */ ;
                                }
                            }
                            var43_34 = var2_2;
                            var52_40 /* !! */  = var5_5 /* !! */ ;
                            var42_33 = var32_26;
                            ** continue;
                            var44_35 = 8;
                            var33_27 >>= var44_35;
                            var5_5 /* !! */  = var52_40 /* !! */ ;
                            var32_26 = var42_33;
                            var2_2 = var43_34;
                            var12_11 = 8;
                        }
                        var43_34 = var2_2;
                        var52_40 /* !! */  = var5_5 /* !! */ ;
                        var42_33 = var32_26;
                        var44_35 = 8;
                        if (var39_30 != var44_35) break;
                        break block33;
                    }
                    var43_34 = var2_2;
                    var52_40 /* !! */  = var5_5 /* !! */ ;
                }
                if (var7_7 == var32_26) break;
                ++var7_7;
                var5_5 /* !! */  = var52_40 /* !! */ ;
                var2_2 = var43_34;
                var12_11 = 8;
            }
        }
        var8_8.d();
        var2_2 = this.j();
        var3_3 /* !! */  = var2_2.b;
        var5_5 /* !! */  = (int[])var2_2.c;
        var2_2 = var2_2.a;
        var32_26 = ((Object)var2_2).length + -2;
        if (var32_26 >= 0) {
            var7_7 = 0;
            while (true) {
                var33_27 = var2_2[var7_7];
                var35_28 = var33_27 ^ (long)-1;
                var20_17 = 7;
                var35_28 = var35_28 << var20_17 & var33_27;
                var60_46 = -9187201950435737472L;
                cfr_temp_6 = (var35_28 &= var60_46) - var60_46;
                var30_24 = cfr_temp_6 == 0 ? 0 : (cfr_temp_6 < 0 ? -1 : 1);
                if (var30_24 != false) {
                    var39_30 = ~(var7_7 - var32_26) >>> 31;
                    var39_30 = 8 - var39_30;
                    for (var19_16 = 0; var19_16 < var39_30; ++var19_16) {
                        var62_47 = 255L;
                        var21_18 = (long)(var33_27 & var62_47);
                        var25_20 = 128L;
                        cfr_temp_7 = var21_18 - var25_20;
                        var18_15 /* !! */  = (long)(cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1));
                        if (var18_15 /* !! */  < 0) {
                            var64_48 = (var7_7 << 3) + var19_16;
                            var20_17 = var3_3 /* !! */ [var64_48];
                            var65_49 = var5_5 /* !! */ [var64_48];
                            var31_25 /* !! */  = var65_49;
                            var31_25 /* !! */  = (KY2)var65_49;
                            var58_44 = var31_25 /* !! */ .a.d;
                            var29_23 = MY2.e;
                            var58_44 = var58_44.a;
                            var28_22 /* !! */  = var58_44.containsKey(var29_23);
                            var31_25 /* !! */  = var31_25 /* !! */ .a;
                            if (var28_22 /* !! */  != false && (var28_22 /* !! */  = (Object)var4_4.b(var20_17)) != false) {
                                var58_44 = (String)var31_25 /* !! */ .d.c((TY2)var29_23);
                                var30_24 = 16;
                                var1_1.z(var20_17, (int)var30_24, (String)var58_44);
                            }
                            var29_23 = this.j();
                            var58_44 = new IY2((GY2)var31_25 /* !! */ , (Qi1)var29_23);
                            var8_8.i(var20_17, var58_44);
                        }
                        var33_27 >>= 8;
                        var20_17 = 7;
                        var60_46 = -9187201950435737472L;
                    }
                    var20_17 = 8;
                    var25_20 = 128L;
                    if (var39_30 != var20_17) break;
                } else {
                    var20_17 = 8;
                    var25_20 = 128L;
                }
                if (var7_7 == var32_26) break;
                ++var7_7;
            }
        }
        var3_3 /* !! */  = (int[])var1_1.a.getSemanticsOwner().a();
        var4_4 = this.j();
        var1_1.F = var2_2 = new IY2((GY2)var3_3 /* !! */ , (Qi1)var4_4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(int n3, C2 rectFArray, String string2, Bundle object) {
        Object object2 = (KY2)this.j().c(n3);
        if (object2 == null || (object2 = ((KY2)object2).a) == null) return;
        Object object3 = androidx.compose.ui.platform.c.n((GY2)object2);
        Object object4 = this.B;
        boolean bl2 = Intrinsics.areEqual(string2, object4);
        rectFArray = rectFArray.a;
        int n4 = -1;
        if (bl2) {
            object = this.z;
            if ((n3 = ((Li1)object).c(n3)) == n4) return;
            rectFArray = rectFArray.getExtras();
            rectFArray.putInt(string2, n3);
            return;
        } else {
            object4 = this.C;
            bl2 = Intrinsics.areEqual(string2, object4);
            if (bl2) {
                object = this.A;
                if ((n3 = ((Li1)object).c(n3)) == n4) return;
                rectFArray = rectFArray.getExtras();
                rectFArray.putInt(string2, n3);
                return;
            } else {
                Object object5 = yY2.a;
                object4 = ((GY2)object2).d;
                Object object6 = ((zy2_0)object4).a;
                n3 = (int)(object6.containsKey(object5) ? 1 : 0);
                if (n3 != 0 && object != null && (n3 = (int)(Intrinsics.areEqual(string2, object5 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY") ? 1 : 0)) != 0) {
                    int n7;
                    object5 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
                    n3 = object.getInt((String)object5, n4);
                    object6 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
                    int n8 = object.getInt((String)object6, n4);
                    if (n8 <= 0 || n3 < 0 || n3 >= (n7 = object3 != null ? ((String)object3).length() : -1 >>> 1)) return;
                    object3 = VY2.c((zy2_0)object4);
                    if (object3 == null) {
                        return;
                    }
                    object4 = new Object();
                    n4 = 0;
                    object6 = null;
                    for (int i3 = 0; i3 < n8; ++i3) {
                        float f5;
                        boolean bl3;
                        float f6;
                        int n10 = n3 + i3;
                        Object object7 = ((Tl3)object3).a.a.a;
                        int n14 = ((String)object7).length();
                        float f7 = 0.0f;
                        aG2 aG22 = null;
                        if (n10 >= n14) {
                            ((ArrayList)object4).add(null);
                            continue;
                        }
                        aG2 aG23 = ((Tl3)object3).b(n10);
                        object7 = ((GY2)object2).c();
                        long l2 = 0L;
                        if (object7 != null) {
                            LP1$c lP1$c = ((w32_0)object7).j1();
                            boolean bl4 = lP1$c.m;
                            if (!bl4) {
                                n14 = 0;
                                object7 = null;
                                f6 = 0.0f;
                            }
                            if (object7 != null) {
                                l2 = ((w32_0)object7).a0(l2);
                            }
                        }
                        if (bl3 = (aG23 = aG23.i(l2)).g((aG2)(object7 = ((GY2)object2).e()))) {
                            aG23 = aG23.e((aG2)object7);
                        } else {
                            n10 = 0;
                            aG23 = null;
                            f5 = 0.0f;
                        }
                        if (aG23 != null) {
                            f6 = aG23.a;
                            f7 = aG23.b;
                            long l3 = h72.a(f6, f7);
                            AndroidComposeView androidComposeView = this.a;
                            l3 = androidComposeView.s(l3);
                            float f8 = aG23.c;
                            f5 = aG23.d;
                            long l4 = h72.a(f8, f5);
                            l2 = androidComposeView.s(l4);
                            float f11 = e72.d(l3);
                            f6 = e72.e(l3);
                            f7 = e72.d(l2);
                            float f12 = e72.e(l2);
                            aG22 = aG23 = new RectF(f11, f6, f7, f12);
                        }
                        ((ArrayList)object4).add(aG22);
                    }
                    object5 = rectFArray.getExtras();
                    rectFArray = new RectF[]{};
                    rectFArray = (Parcelable[])((ArrayList)object4).toArray(rectFArray);
                    object5.putParcelableArray(string2, (Parcelable[])rectFArray);
                    return;
                } else {
                    boolean bl5;
                    object3 = ((zy2_0)object4).a;
                    object5 = MY2.u;
                    boolean bl6 = object3.containsKey(object5);
                    if (bl6 && object != null && (bl5 = Intrinsics.areEqual(string2, object = "androidx.compose.ui.semantics.testTag"))) {
                        if ((object5 = (String)AY2.a((zy2_0)object4, (TY2)object5)) == null) return;
                        rectFArray = rectFArray.getExtras();
                        rectFArray.putCharSequence(string2, (CharSequence)object5);
                        return;
                    } else {
                        object5 = "androidx.compose.ui.semantics.id";
                        n3 = (int)(Intrinsics.areEqual(string2, object5) ? 1 : 0);
                        if (n3 == 0) return;
                        object5 = rectFArray.getExtras();
                        int n15 = ((GY2)object2).g;
                        object5.putInt(string2, n15);
                    }
                }
            }
        }
    }

    public final Rect b(KY2 kY2) {
        kY2 = kY2.b;
        float f5 = ((Rect)kY2).left;
        float f6 = ((Rect)kY2).top;
        long l2 = h72.a(f5, f6);
        AndroidComposeView androidComposeView = this.a;
        l2 = androidComposeView.s(l2);
        float f7 = ((Rect)kY2).right;
        float f8 = ((Rect)kY2).bottom;
        long l3 = h72.a(f7, f8);
        long l4 = androidComposeView.s(l3);
        int n3 = (int)Math.floor(e72.d(l2));
        int n4 = (int)Math.floor(e72.e(l2));
        int n7 = (int)Math.ceil(e72.d(l4));
        int n8 = (int)Math.ceil(e72.e(l4));
        kY2 = new Rect(n3, n4, n7, n8);
        return kY2;
    }

    /*
     * Exception decompiling
     */
    public final Object c(f80_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 169->176)] java.lang.Throwable
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

    public final AccessibilityEvent createEvent(int n3, int n4) {
        Object object;
        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain((int)n4);
        accessibilityEvent.setEnabled(true);
        accessibilityEvent.setClassName((CharSequence)"android.view.View");
        Object object2 = this.a;
        String string2 = object2.getContext().getPackageName();
        accessibilityEvent.setPackageName((CharSequence)string2);
        accessibilityEvent.setSource((View)object2, n3);
        boolean bl2 = this.o();
        if (bl2 && (object = (KY2)((Qi1)(object2 = this.j())).c(n3)) != null) {
            object = ((KY2)object).a.d;
            object2 = MY2.D;
            object = ((zy2_0)object).a;
            n3 = (int)(object.containsKey(object2) ? 1 : 0);
            accessibilityEvent.setPassword(n3 != 0);
        }
        return accessibilityEvent;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean d(long l2, int n3, boolean n4) {
        TY2 tY2;
        float f5;
        int n7 = n3;
        Object object = Looper.getMainLooper().getThread();
        Object object2 = Thread.currentThread();
        int n8 = Intrinsics.areEqual(object, object2);
        boolean bl2 = false;
        float f6 = 0.0f;
        object2 = null;
        if (n8 == 0) {
            return false;
        }
        object = this.j();
        long l3 = 9205357640488583168L;
        int n10 = e72.b(l2, l3);
        if (n10 != 0) return false;
        n10 = e72.g(l2);
        if (n10 != 0) {
            n10 = 1;
            f5 = Float.MIN_VALUE;
            if (n4 == n10) {
                tY2 = MY2.q;
            } else {
                if (n4 != 0) {
                    NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                    throw noWhenBranchMatchedException;
                }
                tY2 = MY2.p;
            }
        } else {
            return false;
        }
        Object[] objectArray = ((Qi1)object).c;
        object = ((Qi1)object).a;
        int n14 = ((Object)object).length + -2;
        if (n14 < 0) return false;
        int n15 = 0;
        boolean bl3 = false;
        float f7 = 0.0f;
        while (true) {
            Object[] objectArray2;
            Object object3;
            block15: {
                float f8;
                int n16;
                reference var21_19;
                block14: {
                    var21_19 = object[n15];
                    reference var23_20 = var21_19 ^ (long)-1;
                    n16 = 7;
                    var23_20 = var23_20 << n16 & var21_19;
                    long l4 = -9187201950435737472L;
                    reference cfr_temp_0 = (var23_20 &= l4) - l4;
                    Object object4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (object4 != false) break block14;
                    object3 = object;
                    objectArray2 = objectArray;
                    break block15;
                }
                int n17 = ~(n15 - n14) >>> 31;
                int n18 = 8;
                float f11 = 1.1E-44f;
                n17 = 8 - n17;
                for (n16 = 0; n16 < n17; var21_19 >>= n8, ++n16) {
                    block17: {
                        block16: {
                            block19: {
                                block18: {
                                    float f12;
                                    float f14;
                                    float f15;
                                    Object object5;
                                    reference var32_27 = var21_19 & 0xFFL;
                                    long l7 = 128L;
                                    reference cfr_temp_1 = var32_27 - l7;
                                    Object object6 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                    if (object6 >= 0) break block16;
                                    int n19 = (n15 << 3) + n16;
                                    object2 = object5 = objectArray[n19];
                                    object2 = (KY2)object5;
                                    Rect rect = ((KY2)object2).b;
                                    f11 = rect.left;
                                    object3 = object;
                                    n8 = rect.top;
                                    f8 = n8;
                                    objectArray2 = objectArray;
                                    int n20 = rect.right;
                                    float f16 = n20;
                                    n10 = rect.bottom;
                                    f5 = n10;
                                    float f17 = e72.d(l2);
                                    float f18 = f17 - f11;
                                    n18 = (int)(f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1));
                                    if (n18 >= 0 && (n20 = (int)((f15 = (f11 = e72.d(l2)) - f16) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1))) < 0 && (n8 = (int)((f14 = (f16 = e72.e(l2)) - f8) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1))) >= 0 && (n8 = (int)((f12 = (f8 = e72.e(l2)) - f5) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1))) < 0) {
                                        n8 = 1;
                                        f8 = Float.MIN_VALUE;
                                    } else {
                                        n8 = 0;
                                        f8 = 0.0f;
                                        object = null;
                                    }
                                    if (n8 == 0 || (object = (CT2)AY2.a(((KY2)object2).a.d, tY2)) == null) break block17;
                                    bl2 = ((CT2)object).c;
                                    n10 = bl2 ? -n7 : n7;
                                    if (n7 == 0 && bl2) {
                                        n10 = -1;
                                        f5 = 0.0f / 0.0f;
                                    }
                                    object2 = ((CT2)object).a;
                                    if (n10 >= 0) break block18;
                                    object = (Number)object2.invoke();
                                    f8 = ((Number)object).floatValue();
                                    bl2 = false;
                                    f6 = 0.0f;
                                    object2 = null;
                                    float f19 = f8 - 0.0f;
                                    n8 = (int)(f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1));
                                    if (n8 <= 0) break block17;
                                    break block19;
                                }
                                f6 = ((Number)(object2 = (Number)object2.invoke())).floatValue();
                                float f20 = f6 - (f8 = ((Number)(object = (Number)((CT2)object).b.invoke())).floatValue());
                                n8 = (int)(f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1));
                                if (n8 >= 0) break block17;
                            }
                            bl3 = true;
                            f7 = Float.MIN_VALUE;
                            break block17;
                        }
                        object3 = object;
                        objectArray2 = objectArray;
                    }
                    n8 = 8;
                    f8 = 1.1E-44f;
                    object = object3;
                    objectArray = objectArray2;
                    bl2 = false;
                    f6 = 0.0f;
                    object2 = null;
                    n10 = 1;
                    f5 = Float.MIN_VALUE;
                    n18 = 8;
                    f11 = 1.1E-44f;
                }
                object3 = object;
                objectArray2 = objectArray;
                n8 = 8;
                f8 = 1.1E-44f;
                if (n17 != n8) break;
            }
            if (n15 == n14) break;
            ++n15;
            object = object3;
            objectArray = objectArray2;
            bl2 = false;
            f6 = 0.0f;
            object2 = null;
            n10 = 1;
            f5 = Float.MIN_VALUE;
        }
        bl2 = bl3;
        f6 = f7;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Throwable throwable2;
        block9: {
            Object object;
            block8: {
                object = "sendAccessibilitySemanticsStructureChangeEvents";
                Trace.beginSection((String)object);
                try {
                    boolean bl2 = this.o();
                    if (!bl2) break block8;
                    object = this.a;
                    object = ((AndroidComposeView)object).getSemanticsOwner();
                    object = ((LY2)object).a();
                    IY2 iY2 = this.F;
                    this.v((GY2)object, iY2);
                }
                catch (Throwable throwable2) {
                    break block9;
                }
            }
            object = Unit.a;
            Trace.endSection();
            object = "sendSemanticsPropertyChangeEvents";
            Trace.beginSection((String)object);
            object = this.j();
            this.B((Qi1)object);
            object = "updateSemanticsNodesCopyAndPanes";
            Trace.beginSection((String)object);
            try {
                this.H();
                return;
            }
            finally {
                Trace.endSection();
            }
        }
        Trace.endSection();
        throw throwable2;
    }

    public final AccessibilityEvent f(int n3, Integer object, Integer n4, Integer n7, CharSequence charSequence) {
        int n8;
        int n10 = 8192;
        AccessibilityEvent accessibilityEvent = this.createEvent(n3, n10);
        if (object != null) {
            n8 = ((Number)object).intValue();
            accessibilityEvent.setFromIndex(n8);
        }
        if (n4 != null) {
            n8 = n4;
            accessibilityEvent.setToIndex(n8);
        }
        if (n7 != null) {
            n8 = n7;
            accessibilityEvent.setItemCount(n8);
        }
        if (charSequence != null) {
            object = accessibilityEvent.getText();
            object.add(charSequence);
        }
        return accessibilityEvent;
    }

    public final void g(GY2 object, ArrayList arrayList, tr1_1 tr1_12) {
        int n3;
        int n4 = kg.b((GY2)object);
        Object object2 = MY2.m;
        c$k c$k = c$k.c;
        Object object3 = ((GY2)object).d;
        object2 = (Boolean)((zy2_0)object3).d((TY2)object2, c$k);
        boolean bl2 = (Boolean)object2;
        int n7 = ((GY2)object).g;
        if ((bl2 || (n3 = this.p((GY2)object)) != 0) && (n3 = ((Qi1)(object3 = this.j())).b(n7)) != 0) {
            arrayList.add(object);
        }
        n3 = 7;
        if (bl2) {
            object = CollectionsKt.m0(GY2.h((GY2)object, false, n3));
            object = this.F((ArrayList)object, n4 != 0);
            tr1_12.i(n7, object);
        } else {
            object = GY2.h((GY2)object, false, n3);
            n4 = object.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                object2 = (GY2)object.get(i3);
                this.g((GY2)object2, arrayList, tr1_12);
            }
        }
    }

    public final D2 getAccessibilityNodeProvider(View view) {
        return this.j;
    }

    public final int h(GY2 object) {
        Object object2 = ((GY2)object).d;
        object2 = ((zy2_0)object2).a;
        Object object3 = MY2.b;
        boolean bl2 = object2.containsKey(object3);
        if (!bl2) {
            object2 = MY2.z;
            object = ((GY2)object).d;
            object3 = ((zy2_0)object).a;
            boolean bl3 = object3.containsKey(object2);
            if (bl3) {
                long l2 = ((mm3)((zy2_0)object).c((TY2)object2)).a;
                return (int)(0xFFFFFFFFL & l2);
            }
        }
        return this.r;
    }

    public final int i(GY2 object) {
        Object object2 = ((GY2)object).d;
        object2 = ((zy2_0)object2).a;
        Object object3 = MY2.b;
        boolean bl2 = object2.containsKey(object3);
        if (!bl2) {
            object2 = MY2.z;
            object = ((GY2)object).d;
            object3 = ((zy2_0)object).a;
            boolean bl3 = object3.containsKey(object2);
            if (bl3) {
                return (int)(((mm3)((zy2_0)object).c((TY2)object2)).a >> 32);
            }
        }
        return this.r;
    }

    public final Qi1 j() {
        ArrayList arrayList = null;
        int n3 = 1;
        boolean bl2 = this.v;
        if (bl2) {
            this.v = false;
            Object object = VY2.a(this.a.getSemanticsOwner());
            this.x = object;
            bl2 = this.o();
            if (bl2) {
                int n4;
                object = this.z;
                ((rr1_0)object).d();
                rr1_0 rr1_02 = this.A;
                rr1_02.d();
                Object object2 = this.j();
                int n7 = -1;
                object2 = (KY2)((Qi1)object2).c(n7);
                if (object2 != null) {
                    object2 = ((KY2)object2).a;
                } else {
                    n4 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (int)(kg.b((GY2)object2) ? 1 : 0);
                Object object3 = new GY2[n3];
                object3[0] = object2;
                arrayList = xx_2.j(object3);
                arrayList = this.F(arrayList, n7 != 0);
                n4 = xx_2.h(arrayList);
                if (n3 <= n4) {
                    n7 = 1;
                    while (true) {
                        int n8 = n7 + -1;
                        object3 = (GY2)arrayList.get(n8);
                        n8 = object3.g;
                        GY2 gY2 = (GY2)arrayList.get(n7);
                        int n10 = gY2.g;
                        ((rr1_0)object).g(n8, n10);
                        rr1_02.g(n10, n8);
                        if (n7 == n4) break;
                        n7 += n3;
                    }
                }
            }
        }
        return this.x;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String l(GY2 var1_1) {
        block39: {
            var2_2 = 0;
            var3_3 = null;
            var4_4 = 1;
            var5_5 = var1_1.d;
            var6_6 = MY2.c;
            var5_5 = AY2.a((zy2_0)var5_5, (TY2)var6_6);
            var6_6 = MY2.C;
            var7_7 = var1_1.d;
            var6_6 = (ao3)AY2.a(var7_7, (TY2)var6_6);
            var8_8 = MY2.t;
            var8_8 = (CP2)AY2.a(var7_7, (TY2)var8_8);
            var9_9 = this.a;
            if (var6_6 != null) {
                var10_10 /* !! */  = c$i.$EnumSwitchMapping$0;
                var11_11 = var6_6.ordinal();
                var11_11 = var10_10 /* !! */ [var11_11];
                var12_12 = 2;
                var13_13 = 2.8E-45f;
                if (var11_11 != var4_4) {
                    if (var11_11 != var12_12) {
                        var12_12 = 3;
                        var13_13 = 4.2E-45f;
                        if (var11_11 == var12_12 && var5_5 == null) {
                            var5_5 = var9_9.getContext().getResources();
                            var11_11 = R$string.indeterminate;
                            var5_5 = var5_5.getString(var11_11);
                        }
                    } else {
                        if (var8_8 == null) {
                            var11_11 = 0;
                            var14_14 = 0.0f;
                            var6_6 = null;
                        } else {
                            var11_11 = (int)CP2.a(var8_8.a, var12_12);
                        }
                        if (var11_11 != 0 && var5_5 == null) {
                            var5_5 = var9_9.getContext().getResources();
                            var11_11 = R$string.state_off;
                            var5_5 = var5_5.getString(var11_11);
                        }
                    }
                } else {
                    if (var8_8 == null) {
                        var11_11 = 0;
                        var14_14 = 0.0f;
                        var6_6 = null;
                    } else {
                        var11_11 = (int)CP2.a(var8_8.a, var12_12);
                    }
                    if (var11_11 != 0 && var5_5 == null) {
                        var5_5 = var9_9.getContext().getResources();
                        var11_11 = R$string.state_on;
                        var5_5 = var5_5.getString(var11_11);
                    }
                }
            }
            var6_6 = MY2.B;
            if ((var6_6 = (Boolean)AY2.a(var7_7, (TY2)var6_6)) != null) {
                var11_11 = (int)var6_6.booleanValue();
                if (var8_8 == null) {
                    var15_15 = 0;
                    var16_16 = 0.0f;
                    var8_8 = null;
                } else {
                    var15_15 = var8_8.a;
                    var12_12 = 4;
                    var13_13 = 5.6E-45f;
                    var15_15 = (int)CP2.a(var15_15, var12_12);
                }
                if (var15_15 == 0 && var5_5 == null) {
                    if (var11_11 != 0) {
                        var5_5 = var9_9.getContext().getResources();
                        var11_11 = R$string.selected;
                        var5_5 = var5_5.getString(var11_11);
                    } else {
                        var5_5 = var9_9.getContext().getResources();
                        var11_11 = R$string.not_selected;
                        var5_5 = var5_5.getString(var11_11);
                    }
                }
            }
            var6_6 = MY2.d;
            if ((var6_6 = (nB2)AY2.a(var7_7, (TY2)var6_6)) != null) {
                var8_8 = nB2.d;
                if (var6_6 != var8_8) {
                    if (var5_5 == null) {
                        var5_5 = var6_6.b;
                        var8_8 = (Number)var5_5.c();
                        var16_16 = var8_8.floatValue();
                        var13_13 = ((Number)var5_5.getStart()).floatValue();
                        var16_16 -= var13_13;
                        var12_12 = 0;
                        var13_13 = 0.0f;
                        var10_10 /* !! */  = null;
                        cfr_temp_0 = var16_16 - 0.0f;
                        var15_15 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                        if (var15_15 == 0) {
                            var15_15 = 1;
                            var16_16 = 1.4E-45f;
                        } else {
                            var15_15 = 0;
                            var16_16 = 0.0f;
                            var8_8 = null;
                        }
                        if (var15_15 != 0) {
                            var11_11 = 0;
                            var14_14 = 0.0f;
                            var6_6 = null;
                        } else {
                            var16_16 = ((Number)var5_5.getStart()).floatValue();
                            var14_14 = var6_6.a - var16_16;
                            var8_8 = (Number)var5_5.c();
                            var16_16 = var8_8.floatValue();
                            var5_5 = (Number)var5_5.getStart();
                            var17_17 = var5_5.floatValue();
                            var14_14 /= (var16_16 -= var17_17);
                        }
                        var18_18 /* !! */  = (cfr_temp_1 = var14_14 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                        if (var18_18 /* !! */  < 0) {
                            var11_11 = 0;
                            var14_14 = 0.0f;
                            var6_6 = null;
                        }
                        var18_18 /* !! */  = 1065353216;
                        var17_17 = 1.0f;
                        cfr_temp_2 = var14_14 - var17_17;
                        var15_15 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                        if (var15_15 > 0) {
                            var11_11 = 1065353216;
                            var14_14 = 1.0f;
                        }
                        if ((var15_15 = (int)((cfr_temp_3 = var14_14 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1))) == 0) {
                            var15_15 = 1;
                            var16_16 = 1.4E-45f;
                        } else {
                            var15_15 = 0;
                            var16_16 = 0.0f;
                            var8_8 = null;
                        }
                        if (var15_15 != 0) {
                            var15_15 = 0;
                            var16_16 = 0.0f;
                            var8_8 = null;
                        } else {
                            var18_18 /* !! */  = (float)(var14_14 == var17_17 ? 0 : (var14_14 < var17_17 ? -1 : 1));
                            if (var18_18 /* !! */  == false) {
                                var18_18 /* !! */  = (float)true;
                                var17_17 = 1.4E-45f;
                            } else {
                                var18_18 /* !! */  = (float)false;
                                var17_17 = 0.0f;
                                var5_5 = null;
                            }
                            var15_15 = 100;
                            var16_16 = 1.4E-43f;
                            if (var18_18 /* !! */  == false) {
                                var17_17 = var15_15;
                                var18_18 /* !! */  = Math.round(var14_14 * var17_17);
                                var11_11 = 99;
                                var14_14 = 1.39E-43f;
                                var15_15 = kotlin.ranges.f.g((int)var18_18 /* !! */ , var4_4, var11_11);
                            }
                        }
                        var5_5 = var9_9.getContext().getResources();
                        var11_11 = R$string.template_percent;
                        var8_8 = var15_15;
                        var10_10 /* !! */  = (int[])new Object[var4_4];
                        var10_10 /* !! */ [0] = (int)var8_8;
                        var5_5 = var5_5.getString(var11_11, (Object[])var10_10 /* !! */ );
                    }
                } else if (var5_5 == null) {
                    var3_3 = var9_9.getContext().getResources();
                    var18_19 = R$string.in_progress;
                    var5_5 = var3_3.getString(var18_19);
                }
            }
            if ((var11_11 = (int)(var6_6 = var7_7.a).containsKey(var3_3 = MY2.y)) == 0) break block39;
            var6_6 = var1_1.c;
            var1_1 = var1_1.a;
            var5_5 = new GY2((LP1$c)var1_1, (boolean)var4_4, (xp1_0)var6_6, var7_7);
            var1_1 = var5_5.i();
            var19_20 = MY2.b;
            if ((var19_20 = (Collection)AY2.a((zy2_0)var1_1, (TY2)var19_20)) != null && (var4_4 = var19_20.isEmpty()) == 0) ** GOTO lbl-1000
            var19_20 = MY2.v;
            if ((var19_20 = (Collection)AY2.a((zy2_0)var1_1, (TY2)var19_20)) != null && (var4_4 = var19_20.isEmpty()) == 0 || (var1_1 = (CharSequence)AY2.a((zy2_0)var1_1, var3_3)) != null && (var20_21 = var1_1.length()) != 0) lbl-1000:
            // 2 sources

            {
                var20_21 = 0;
                var1_1 = null;
lbl166:
                // 2 sources

                while (true) {
                    var5_5 = var1_1;
                    break;
                }
            } else {
                var1_1 = var9_9.getContext().getResources();
                var2_2 = R$string.state_empty;
                var1_1 = var1_1.getString(var2_2);
                ** continue;
            }
        }
        return (String)var5_5;
    }

    public final boolean o() {
        boolean bl2;
        block3: {
            block2: {
                Object object = this.d;
                boolean bl3 = object.isEnabled();
                if (!bl3) break block2;
                object = this.h;
                bl3 = object.isEmpty();
                bl2 = true;
                if (bl3 ^= bl2) break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final boolean p(GY2 object) {
        boolean bl2;
        block8: {
            TY2 tY2;
            block7: {
                boolean bl3;
                Object object2 = ((GY2)object).d;
                tY2 = MY2.b;
                if ((object2 = (List)AY2.a((zy2_0)object2, tY2)) != null) {
                    object2 = (String)CollectionsKt.firstOrNull((List)object2);
                } else {
                    bl3 = false;
                    object2 = null;
                }
                bl2 = true;
                if (object2 == null && (object2 = androidx.compose.ui.platform.c.m((GY2)object)) == null && (object2 = this.l((GY2)object)) == null && !(bl3 = androidx.compose.ui.platform.c.k((GY2)object))) {
                    bl3 = false;
                    object2 = null;
                } else {
                    bl3 = true;
                }
                boolean bl4 = VY2.e((GY2)object);
                if (!bl4) break block7;
                Object object3 = ((GY2)object).d;
                bl4 = ((zy2_0)object3).b;
                if (bl4) break block8;
                bl4 = ((GY2)object).e;
                if (bl4 || !(bl4 = (object3 = ((GY2)object).k()).isEmpty())) break block7;
                object = ((GY2)object).c;
                object3 = hy2_1.c;
                if ((object = JY2.b((xp1_0)object, (Function1)object3)) == null && bl3) break block8;
            }
            bl2 = false;
            tY2 = null;
        }
        return bl2;
    }

    public final void q(xp1_0 object) {
        Object object2 = this.t;
        boolean bl2 = ((Np)object2).add(object);
        if (bl2) {
            object = this.u;
            object2 = Unit.a;
            object.j(object2);
        }
    }

    public final int u(int n3) {
        GY2 gY2 = this.a.getSemanticsOwner().a();
        int n4 = gY2.g;
        if (n3 == n4) {
            n3 = -1;
        }
        return n3;
    }

    public final void v(GY2 gY2, IY2 iY2) {
        Object object;
        int n3;
        xp1_0 xp1_02;
        c c2 = this;
        Object object2 = gY2;
        Object object3 = iY2;
        int n4 = 1;
        Object object4 = aj1.a;
        object4 = new ur1_0;
        Object object5 = null;
        ((ur1_0)object4)(null);
        int n7 = 4;
        Object object6 = GY2.h(gY2, n4 != 0, n7);
        int n8 = object6.size();
        int n10 = 0;
        while (true) {
            xp1_02 = ((GY2)object2).c;
            if (n10 >= n8) break;
            GY2 gY22 = (GY2)object6.get(n10);
            Object object7 = this.j();
            boolean bl2 = ((Qi1)object7).a(n3 = gY22.g);
            if (bl2) {
                object7 = ((IY2)object3).b;
                int n14 = gY22.g;
                bl2 = ((Zi1)object7).a(n14);
                if (!bl2) {
                    c2.q(xp1_02);
                    return;
                }
                ((ur1_0)object4).b(n14);
            }
            n10 += n4;
        }
        object3 = ((IY2)object3).b;
        object6 = ((Zi1)object3).b;
        object3 = ((Zi1)object3).a;
        n8 = ((Object)object3).length + -2;
        if (n8 >= 0) {
            n10 = 0;
            while (true) {
                reference var19_19 = object3[n10];
                reference var21_20 = var19_19 ^ (long)-1;
                int n15 = 7;
                var21_20 = var21_20 << n15 & var19_19;
                long l2 = -9187201950435737472L;
                reference cfr_temp_0 = (var21_20 &= l2) - l2;
                Object object8 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (object8 != false) {
                    n3 = ~(n10 - n8) >>> 31;
                    int n16 = 8;
                    n3 = 8 - n3;
                    for (n15 = 0; n15 < n3; n15 += n4) {
                        reference var28_25 = var19_19 & 0xFFL;
                        long l3 = 128L;
                        reference cfr_temp_1 = var28_25 - l3;
                        Object object9 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                        if (object9 < 0) {
                            int n17 = (n10 << 3) + n15;
                            object = object6[n17];
                            if ((object = (Object)((Zi1)object4).a((int)object)) == 0) {
                                c2.q(xp1_02);
                                return;
                            }
                        }
                        var19_19 >>= n16;
                    }
                    if (n3 != n16) break;
                }
                if (n10 == n8) break;
                n10 += n4;
            }
        }
        object2 = GY2.h((GY2)object2, n4 != 0, n7);
        int n18 = object2.size();
        for (object = 0; object < n18; object += n4) {
            int n19;
            object4 = (GY2)object2.get((int)object);
            object5 = this.j();
            n7 = (int)(((Qi1)object5).a(n19 = ((GY2)object4).g) ? 1 : 0);
            if (n7 == 0) continue;
            object5 = c2.E;
            n19 = ((GY2)object4).g;
            object5 = ((Qi1)object5).c(n19);
            Intrinsics.checkNotNull(object5);
            object5 = (IY2)object5;
            c2.v((GY2)object4, (IY2)object5);
        }
    }

    public final boolean w(AccessibilityEvent object) {
        int n3;
        int n4 = this.o();
        if (n4 == 0) {
            return false;
        }
        n4 = object.getEventType();
        if (n4 == (n3 = 2048) || (n4 = object.getEventType()) == (n3 = 32768)) {
            n4 = 1;
            this.m = n4;
        }
        try {
            c$l c$l = this.c;
            object = c$l.invoke(object);
            object = (Boolean)object;
            boolean bl2 = (Boolean)object;
            return bl2;
        }
        finally {
            this.m = false;
        }
    }

    public final boolean x(int n3, int n4, Integer n7, List list) {
        int n8 = -1 << -1;
        if (n3 != n8 && (n8 = (int)(this.o() ? 1 : 0)) != 0) {
            String string2;
            AccessibilityEvent accessibilityEvent = this.createEvent(n3, n4);
            if (n7 != null) {
                n4 = n7;
                accessibilityEvent.setContentChangeTypes(n4);
            }
            if (list != null) {
                n7 = null;
                n8 = 62;
                string2 = jv1_0.a(list, ",", null, n8);
                accessibilityEvent.setContentDescription((CharSequence)string2);
            }
            string2 = "sendEvent";
            Trace.beginSection((String)string2);
            try {
                n3 = (int)(this.w(accessibilityEvent) ? 1 : 0);
                return n3 != 0;
            }
            finally {
                Trace.endSection();
            }
        }
        return false;
    }

    public final void z(int n3, int n4, String string2) {
        n3 = this.u(n3);
        int n7 = 32;
        AccessibilityEvent accessibilityEvent = this.createEvent(n3, n7);
        accessibilityEvent.setContentChangeTypes(n4);
        if (string2 != null) {
            List list = accessibilityEvent.getText();
            list.add(string2);
        }
        this.w(accessibilityEvent);
    }
}

