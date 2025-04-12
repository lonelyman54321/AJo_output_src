/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 */
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

public final class k13
implements ln2,
iw$a,
mo1_0 {
    public final Path a;
    public final String b;
    public final boolean c;
    public final yc1_1 d;
    public final r13 e;
    public boolean f;
    public final S30 g;

    public k13(yc1_1 object, kw_1 kw_12, u13 object2) {
        boolean bl2;
        Object object3;
        this.a = object3 = new Path();
        this.g = object3;
        object3 = ((u13)object2).a;
        this.b = object3;
        this.c = bl2 = ((u13)object2).d;
        this.d = object;
        object2 = (List)((u13)object2).c.b;
        super((List)object2);
        this.e = object;
        kw_12.g((iw_0)object);
        ((iw_0)object).a(this);
    }

    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /*
     * Unable to fully structure code
     */
    public final void b(List var1_1, List var2_2) {
        var2_2 = null;
        var3_3 = 0;
        while (true) {
            var4_4 = var1_1;
            var4_4 = (ArrayList)var1_1;
            var5_5 = var4_4.size();
            if (var3_3 >= var5_5) break;
            var5_5 = (var4_4 = (r60_0)var4_4.get(var3_3)) instanceof vs3_0;
            if (var5_5 == 0) ** GOTO lbl-1000
            var6_6 = var4_4;
            var6_6 = (vs3_0)var4_4;
            var7_7 = var6_6.c;
            var8_8 = y13$a.SIMULTANEOUSLY;
            if (var7_7 == var8_8) {
                var4_4 = this.g.a;
                var4_4.add(var6_6);
                var6_6.c(this);
            } else if ((var5_5 = var4_4 instanceof t13) != 0) {
                if (var2_2 == null) {
                    var2_2 = new ArrayList<Object>();
                }
                var4_4 = (t13)var4_4;
                var4_4.d(this);
                var2_2.add(var4_4);
            }
            ++var3_3;
        }
        this.e.m = var2_2;
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        mp1_0.g(ko12, n3, arrayList, ko13, this);
    }

    public final String getName() {
        return this.b;
    }

    public final Path getPath() {
        LC1 lC1;
        boolean bl2 = this.f;
        r13 r132 = this.e;
        Path path = this.a;
        if (bl2 && (lC1 = r132.e) == null) {
            return path;
        }
        path.reset();
        bl2 = this.c;
        boolean bl3 = true;
        if (bl2) {
            this.f = bl3;
            return path;
        }
        lC1 = (Path)r132.f();
        if (lC1 == null) {
            return path;
        }
        path.set((Path)lC1);
        lC1 = Path.FillType.EVEN_ODD;
        path.setFillType((Path.FillType)lC1);
        this.g.a(path);
        this.f = bl3;
        return path;
    }

    public final void h(LC1 lC1, Object object) {
        Path path = GC1.K;
        if (object == path) {
            object = this.e;
            ((iw_0)object).k(lC1);
        }
    }
}

