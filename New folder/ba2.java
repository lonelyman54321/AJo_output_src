/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap$Config
 *  android.graphics.ColorSpace
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class ba2 {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final B63 d;
    public final WS2 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final m41_0 j;
    public final zi3 k;
    public final hm2_0 l;
    public final fj_1 m;
    public final fj_1 n;
    public final fj_1 o;

    public ba2(Context context, Bitmap.Config config, ColorSpace colorSpace, B63 b63, WS2 wS2, boolean bl2, boolean bl3, boolean bl4, String string2, m41_0 m41_02, zi3 zi32, hm2_0 hm2_02, fj_1 fj_12, fj_1 fj_13, fj_1 fj_14) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = b63;
        this.e = wS2;
        this.f = bl2;
        this.g = bl3;
        this.h = bl4;
        this.i = string2;
        this.j = m41_02;
        this.k = zi32;
        this.l = hm2_02;
        this.m = fj_12;
        this.n = fj_13;
        this.o = fj_14;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                int n3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                int n4 = object instanceof ba2;
                if (n4 == 0) break block4;
                object = (ba2)object;
                Object object2 = this.a;
                Object object3 = ((ba2)object).a;
                n4 = Intrinsics.areEqual(object2, object3);
                if (n4 != 0 && (object3 = this.b) == (object2 = ((ba2)object).b) && ((n4 = Build.VERSION.SDK_INT) < (n3 = 26) || (n4 = (int)(Intrinsics.areEqual(object3 = this.c, object2 = ((ba2)object).c) ? 1 : 0)) != 0) && (n4 = (int)(Intrinsics.areEqual(object3 = this.d, object2 = ((ba2)object).d) ? 1 : 0)) != 0 && (object3 = this.e) == (object2 = ((ba2)object).e) && (n4 = (int)(this.f ? 1 : 0)) == (n3 = (int)(((ba2)object).f ? 1 : 0)) && (n4 = (int)(this.g ? 1 : 0)) == (n3 = (int)(((ba2)object).g ? 1 : 0)) && (n4 = (int)(this.h ? 1 : 0)) == (n3 = (int)(((ba2)object).h ? 1 : 0)) && (n4 = (int)(Intrinsics.areEqual(object3 = this.i, object2 = ((ba2)object).i) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.j, object2 = ((ba2)object).j) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.k, object2 = ((ba2)object).k) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.l, object2 = ((ba2)object).l) ? 1 : 0)) != 0 && (object3 = this.m) == (object2 = ((ba2)object).m) && (object3 = this.n) == (object2 = ((ba2)object).n) && (object3 = this.o) == (object = ((ba2)object).o)) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        Object object = this.b;
        int n4 = (object.hashCode() + n3) * 31;
        Object object2 = this.c;
        int n7 = 0;
        if (object2 != null) {
            n3 = object2.hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n4 = (n4 + n3) * 31;
        object2 = this.d;
        n3 = (((B63)object2).hashCode() + n4) * 31;
        object = this.e;
        n4 = (object.hashCode() + n3) * 31;
        n3 = 1237;
        int n8 = this.f;
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n8 = (int)(this.g ? 1 : 0);
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n8 = (int)(this.h ? 1 : 0);
        if (n8 != 0) {
            n3 = 1231;
        }
        n4 = (n4 + n3) * 31;
        object2 = this.i;
        if (object2 != null) {
            n7 = object2.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n3 = Arrays.hashCode(this.j.a);
        n4 = (n4 + n3) * 31;
        n3 = (((Object)this.k.a).hashCode() + n4) * 31;
        n4 = (((Object)this.l.a).hashCode() + n3) * 31;
        n3 = (((Object)((Object)this.m)).hashCode() + n4) * 31;
        n4 = (((Object)((Object)this.n)).hashCode() + n3) * 31;
        return ((Object)((Object)this.o)).hashCode() + n4;
    }
}

