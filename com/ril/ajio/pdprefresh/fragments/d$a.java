/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.pdprefresh.fragments;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import com.ril.ajio.pdprefresh.fragments.d;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class d$a
implements Function2 {
    public final /* synthetic */ lt1 a;
    public final /* synthetic */ d b;

    public d$a(lt1 lt12, d d2) {
        this.a = lt12;
        this.b = d2;
    }

    public final Object invoke(Object object, Object object2) {
        block11: {
            block12: {
                float f5;
                Object object3;
                Object object4;
                block13: {
                    block10: {
                        Object object5;
                        Object object6;
                        float f6;
                        int n3;
                        int n4;
                        Object object7;
                        d$a d$a;
                        block9: {
                            d$a = this;
                            object7 = object;
                            object7 = (b30_0)object;
                            object4 = object2;
                            object4 = (Number)object2;
                            n4 = ((Number)object4).intValue() & 0xB;
                            n3 = 2;
                            f6 = 2.8E-45f;
                            if (n4 != n3 || (n4 = (int)(object7.h() ? 1 : 0)) == 0) break block9;
                            object7.D();
                            break block10;
                        }
                        object3 = LP1$a.b;
                        object4 = j.c;
                        Object object8 = Nc$a.n;
                        Object object9 = zp.c;
                        int n7 = 48;
                        object8 = oZ.a((zp$l)object9, (Gx$a)object8, (b30_0)object7, n7);
                        int bl2 = object7.F();
                        Object object10 = object7.m();
                        object4 = a30_0.c((b30_0)object7, (LP1)object4);
                        N20.W.getClass();
                        Serializable serializable = N20$a.b;
                        Object object11 = object7.i();
                        int n8 = object11 instanceof mp;
                        boolean bl3 = false;
                        String string2 = null;
                        if (n8 == 0) break block11;
                        object7.A();
                        n8 = object7.e();
                        if (n8 != 0) {
                            object7.C((Function0)((Object)serializable));
                        } else {
                            object7.n();
                        }
                        object11 = N20$a.e;
                        Ow3.a((b30_0)object7, object8, (Function2)object11);
                        object8 = N20$a.d;
                        Ow3.a((b30_0)object7, object10, (Function2)object8);
                        object10 = N20$a.f;
                        boolean bl4 = object7.e();
                        if (bl4 || !(bl4 = Intrinsics.areEqual(object6 = object7.v(), object5 = Integer.valueOf(bl2)))) {
                            re0_0.a(bl2, (b30_0)object7, bl2, (N20$a$a)object10);
                        }
                        object9 = N20$a.c;
                        Ow3.a((b30_0)object7, object4, (Function2)object9);
                        n4 = 1065353216;
                        f5 = 1.0f;
                        object6 = j.c((LP1)object3, f5);
                        int n10 = 16;
                        float f7 = n10;
                        float f8 = 12;
                        object6 = h.f((LP1)object6, f7, f8);
                        Object object12 = zp.a;
                        Gx$b gx$b = Nc$a.j;
                        int n14 = 0;
                        object12 = iQ2.a((zp$e)object12, gx$b, (b30_0)object7, 0);
                        int n15 = object7.F();
                        rq2_1 rq2_12 = object7.m();
                        object6 = a30_0.c((b30_0)object7, (LP1)object6);
                        mp mp2 = object7.i();
                        int n16 = mp2 instanceof mp;
                        if (n16 == 0) break block12;
                        object7.A();
                        bl3 = object7.e();
                        if (bl3) {
                            object7.C((Function0)((Object)serializable));
                        } else {
                            object7.n();
                        }
                        Ow3.a((b30_0)object7, object12, (Function2)object11);
                        Ow3.a((b30_0)object7, rq2_12, (Function2)object8);
                        boolean bl5 = object7.e();
                        if (bl5 || !(bl5 = Intrinsics.areEqual(object8 = object7.v(), serializable = Integer.valueOf(n15)))) {
                            re0_0.a(n15, (b30_0)object7, n15, (N20$a$a)object10);
                        }
                        Ow3.a((b30_0)object7, object6, (Function2)object9);
                        object8 = AndroidCompositionLocals_androidKt.b;
                        object8 = ((Context)object7.j((H30)object8)).getResources();
                        int n17 = R$string.photo_reviews;
                        string2 = object8.getString(n17);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        long l2 = xx_1.C;
                        long l3 = Em3.f(n10);
                        float f11 = 4;
                        bl5 = false;
                        object8 = null;
                        n7 = 0;
                        object10 = null;
                        serializable = null;
                        object3 = h.i((LP1)object3, 0.0f, f11, 0.0f, 0.0f, 13);
                        double d2 = f5;
                        double d5 = 0.0;
                        n8 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
                        if (n8 <= 0) break block13;
                        f5 = f.c(f5, Float.MAX_VALUE);
                        boolean bl6 = true;
                        f11 = Float.MIN_VALUE;
                        object8 = new LayoutWeightElement(f5, bl6);
                        object4 = object3.then((LP1)object8);
                        n16 = 104;
                        long l4 = 0L;
                        object3 = string2;
                        long l7 = l3;
                        l3 = l4;
                        object12 = object7;
                        n15 = 24960;
                        f8 = 3.4976E-41f;
                        n14 = n16;
                        mm3_0.a((LP1)object4, string2, l2, null, l7, null, l4, (b30_0)object7, n15, n16);
                        object7.p();
                        object4 = new G11$a(3);
                        f6 = 8;
                        object9 = new nk2_0(f6, f6, f6, f6);
                        object3 = d$a.a;
                        object8 = d$a.b;
                        object5 = new hh0_2((lt1)object3, (d)object8);
                        n15 = 3072;
                        f8 = 4.305E-42f;
                        n14 = 502;
                        n3 = 0;
                        f6 = 0.0f;
                        object3 = null;
                        bl5 = false;
                        object8 = null;
                        n7 = 0;
                        object10 = null;
                        serializable = null;
                        n8 = 0;
                        object11 = null;
                        bl3 = false;
                        string2 = null;
                        bl4 = false;
                        object6 = null;
                        Cq1.a((G11$a)object4, null, null, (mk2_0)object9, false, null, null, null, false, (Function1)object5, (b30_0)object7, n15, n14);
                        object7.p();
                    }
                    return Unit.a;
                }
                object4 = g9_0.a(f5, "invalid weight ", "; must be greater than zero");
                object4 = object4.toString();
                object3 = new IllegalArgumentException((String)object4);
                throw object3;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

