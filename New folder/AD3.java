/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.view.View
 *  android.view.animation.Interpolator
 */
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class AD3 {
    public final ArrayList a;
    public long b = -1;
    public Interpolator c;
    public BD3 d;
    public boolean e;
    public final AD3$a f;

    public AD3() {
        ArrayList arrayList = new ArrayList(this);
        this.f = arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final void a() {
        boolean bl2;
        boolean bl3 = this.e;
        if (!bl3) {
            return;
        }
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            zd3_1 zd3_12 = (zd3_1)iterator.next();
            zd3_12.b();
        }
        this.e = false;
    }

    public final void b() {
        boolean bl2;
        boolean bl3 = this.e;
        if (bl3) {
            return;
        }
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            View view;
            Object object;
            zd3_1 zd3_12 = (zd3_1)iterator.next();
            long l2 = this.b;
            long l3 = 0L;
            long l4 = l2 - l3;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 >= 0) {
                zd3_12.c(l2);
            }
            if ((object = this.c) != null && (view = (View)zd3_12.a.get()) != null) {
                view = view.animate();
                view.setInterpolator((TimeInterpolator)object);
            }
            if ((object = this.d) != null) {
                object = this.f;
                zd3_12.d((BD3)object);
            }
            if ((zd3_12 = (View)zd3_12.a.get()) == null) continue;
            zd3_12 = zd3_12.animate();
            zd3_12.start();
        }
        this.e = true;
    }
}

