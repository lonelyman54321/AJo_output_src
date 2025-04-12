/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.widget.EdgeEffect
 */
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

public final class lx0 {
    public final Context a;
    public final int b;
    public long c;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public lx0(Context context, int n3) {
        this.a = context;
        this.b = n3;
        this.c = 0L;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return edgeEffect.isFinished() ^ true;
    }

    public static boolean g(EdgeEffect edgeEffect) {
        boolean bl2;
        float f5;
        boolean bl3 = false;
        if (edgeEffect == null) {
            return false;
        }
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            bm_0 bm_02 = bm_0.a;
            f5 = bm_02.b(edgeEffect);
        } else {
            bl2 = false;
            f5 = 0.0f;
            edgeEffect = null;
        }
        n3 = 1;
        float f6 = f5 - 0.0f;
        bl2 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (!bl2) {
            bl3 = true;
        }
        return bl3 ^ true;
    }

    public final EdgeEffect a() {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        Context context = this.a;
        if (n3 >= n4) {
            object = bm_0.a;
            n4 = 0;
            object = ((bm_0)object).a(context, null);
        } else {
            object = new j01(context);
        }
        n4 = this.b;
        object.setColor(n4);
        long l2 = this.c;
        long l3 = 0L;
        n4 = (int)(bj1.b(l2, l3) ? 1 : 0);
        if (n4 == 0) {
            l2 = this.c;
            int n7 = 32;
            l3 = l2 >> n7;
            int n8 = (int)l3;
            long l4 = 0xFFFFFFFFL;
            int n10 = (int)(l2 &= l4);
            object.setSize(n8, n10);
        }
        return object;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect == null) {
            this.e = edgeEffect = this.a();
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect == null) {
            this.f = edgeEffect = this.a();
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect == null) {
            this.g = edgeEffect = this.a();
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect == null) {
            this.d = edgeEffect = this.a();
        }
        return edgeEffect;
    }
}

