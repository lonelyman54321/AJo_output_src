/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.dt;
import com.google.android.play.core.assetpacks.dv;
import com.google.android.play.core.assetpacks.ey;
import com.google.android.play.core.assetpacks.ez;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.z;
import java.io.File;
import java.util.concurrent.Executor;

final class fa {
    private final bm a;
    private final dt b;
    private final dd c;
    private final aq d;
    private final aq e;

    public fa(bm bm3, aq aq2, dt dt2, aq aq4, dd dd2) {
        this.a = bm3;
        this.d = aq2;
        this.b = dt2;
        this.e = aq4;
        this.c = dd2;
    }

    public static /* synthetic */ void a(fa object, ey ey2) {
        object = ((fa)object).a;
        String string2 = ey2.l;
        int n3 = ey2.b;
        long l2 = ey2.c;
        ((bm)object).B(string2, n3, l2);
    }

    public final void b(ey object) {
        Object object2 = this.a;
        Object object3 = ((dv)object).l;
        int n3 = ((ey)object).a;
        long l2 = ((ey)object).c;
        boolean n4 = ((File)(object2 = ((bm)object2).h((String)object3, n3, l2))).exists();
        if (n4) {
            object3 = this.a;
            String string3 = ((dv)object).l;
            int n7 = ((ey)object).b;
            long l3 = ((ey)object).c;
            object3 = ((bm)object3).h(string3, n7, l3);
            ((File)object3).mkdirs();
            n3 = (int)(((File)object2).renameTo((File)object3) ? 1 : 0);
            if (n3 != 0) {
                object2 = (Executor)this.e.a();
                object3 = new ez(this, (ey)object);
                object2.execute((Runnable)object3);
                object2 = this.b;
                object3 = ((dv)object).l;
                n3 = ((ey)object).b;
                l2 = ((ey)object).c;
                ((dt)object2).k((String)object3, n3, l2);
                object2 = this.c;
                object3 = ((dv)object).l;
                ((dd)object2).c((String)object3);
                object2 = (z)this.d.a();
                int n8 = ((dv)object).k;
                object = ((dv)object).l;
                object2.h(n8, (String)object);
                return;
            }
            string3 = ((dv)object).l;
            object2 = ((File)object2).getAbsolutePath();
            object3 = ((File)object3).getAbsolutePath();
            object2 = og_1.a("Cannot promote pack ", string3, " from ", (String)object2, " to ");
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            int n10 = ((dv)object).k;
            cz cz2 = new cz((String)object2, n10);
            throw cz2;
        }
        String string2 = ((dv)object).l;
        object2 = ((File)object2).getAbsolutePath();
        object2 = UX.c("Cannot find pack files to promote for pack ", string2, " at ", (String)object2);
        int n10 = ((dv)object).k;
        object3 = new cz((String)object2, n10);
        throw object3;
    }
}

