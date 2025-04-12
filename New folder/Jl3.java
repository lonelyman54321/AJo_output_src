/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;

public final class Jl3
extends LC1 {
    public final /* synthetic */ CC1 c;
    public final /* synthetic */ LC1 d;
    public final /* synthetic */ wr0_0 e;

    public Jl3(CC1 cC1, LC1 lC1, wr0_0 wr0_02) {
        this.c = cC1;
        this.d = lC1;
        this.e = wr0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object a(CC1 object) {
        float f5 = ((CC1)object).a;
        float f6 = ((CC1)object).b;
        String string2 = ((wr0_0)((CC1)object).c).a;
        String string3 = ((wr0_0)((CC1)object).d).a;
        float f7 = ((CC1)object).e;
        float f8 = ((CC1)object).f;
        float f11 = ((CC1)object).g;
        CC1 cC1 = this.c;
        cC1.a = f5;
        cC1.b = f6;
        cC1.c = string2;
        cC1.d = string3;
        cC1.e = f7;
        cC1.f = f8;
        cC1.g = f11;
        String string4 = (String)this.d.a(cC1);
        f6 = ((CC1)object).f;
        float f12 = 1.0f;
        float f14 = f6 - f12;
        Object object2 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        object = object2 == false ? ((CC1)object).d : ((CC1)object).c;
        object = (wr0_0)object;
        String string5 = ((wr0_0)object).b;
        f12 = ((wr0_0)object).c;
        Wr0$a wr0$a = ((wr0_0)object).d;
        int n3 = ((wr0_0)object).e;
        f8 = ((wr0_0)object).f;
        f11 = ((wr0_0)object).g;
        int n4 = ((wr0_0)object).h;
        int n7 = ((wr0_0)object).i;
        float f15 = ((wr0_0)object).j;
        boolean bl2 = ((wr0_0)object).k;
        PointF pointF = ((wr0_0)object).l;
        object = ((wr0_0)object).m;
        wr0_0 wr0_02 = this.e;
        wr0_02.a = string4;
        wr0_02.b = string5;
        wr0_02.c = f12;
        wr0_02.d = wr0$a;
        wr0_02.e = n3;
        wr0_02.f = f8;
        wr0_02.g = f11;
        wr0_02.h = n4;
        wr0_02.i = n7;
        wr0_02.j = f15;
        wr0_02.k = bl2;
        wr0_02.l = pointF;
        wr0_02.m = object;
        return wr0_02;
    }
}

