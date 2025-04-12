/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.dt;
import com.google.android.play.core.assetpacks.dv;
import com.google.android.play.core.assetpacks.el;
import com.google.android.play.core.assetpacks.em;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.z;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

final class en {
    private final bm a;
    private final dt b;
    private final dd c;
    private final er d;
    private final aq e;
    private final aq f;

    public en(bm bm3, aq aq2, dt dt2, aq aq4, dd dd2, er er2) {
        this.a = bm3;
        this.e = aq2;
        this.b = dt2;
        this.f = aq4;
        this.c = dd2;
        this.d = er2;
    }

    public static /* synthetic */ void a(en object, el el2) {
        object = ((en)object).a;
        String string2 = el2.l;
        int n3 = el2.a;
        long l2 = el2.b;
        ((bm)object).B(string2, n3, l2);
    }

    public final void b(el object) {
        Object object2 = this.a;
        Object object3 = ((dv)object).l;
        int n3 = ((el)object).a;
        long l2 = ((el)object).b;
        File file = ((bm)object2).j((String)object3, n3, l2);
        object2 = ((bm)object2).l((String)object3, n3, l2);
        int n4 = file.exists();
        if (n4 != 0 && (n4 = ((File)object2).exists()) != 0) {
            object3 = this.a;
            Object object4 = ((dv)object).l;
            int n7 = ((el)object).a;
            long l3 = ((el)object).b;
            object3 = ((bm)object3).h((String)object4, n7, l3);
            ((File)object3).mkdirs();
            n4 = file.renameTo((File)object3);
            if (n4 != 0) {
                object3 = this.a;
                object4 = ((dv)object).l;
                n7 = ((el)object).a;
                long l4 = ((el)object).b;
                object3 = ((bm)object3).h((String)object4, n7, l4);
                Object object5 = new File((File)object3, "merge.tmp");
                ((File)object5).delete();
                object3 = this.a;
                object4 = ((dv)object).l;
                n7 = ((el)object).a;
                l4 = ((el)object).b;
                object3 = ((bm)object3).i((String)object4, n7, l4);
                ((File)object3).mkdirs();
                boolean bl2 = ((File)object2).renameTo((File)object3);
                if (bl2) {
                    try {
                        object3 = this.d;
                    }
                    catch (IOException iOException) {
                        object3 = ((dv)object).l;
                        String string2 = iOException.getMessage();
                        string2 = UX.c("Could not write asset pack version tag for pack ", (String)object3, ": ", string2);
                        int n8 = ((dv)object).k;
                        object4 = new cz(string2, n8);
                        throw object4;
                    }
                    object4 = ((dv)object).l;
                    n7 = ((el)object).a;
                    l4 = ((el)object).b;
                    object5 = ((el)object).c;
                    ((er)object3).b((String)object4, n7, l4, (String)object5);
                    object2 = (Executor)this.f.a();
                    object3 = new em(this, (el)object);
                    object2.execute((Runnable)object3);
                    object2 = this.b;
                    object3 = ((dv)object).l;
                    n3 = ((el)object).a;
                    l2 = ((el)object).b;
                    ((dt)object2).k((String)object3, n3, l2);
                    object2 = this.c;
                    object3 = ((dv)object).l;
                    ((dd)object2).c((String)object3);
                    object2 = (z)this.e.a();
                    n4 = ((dv)object).k;
                    object = ((dv)object).l;
                    object2.h(n4, (String)object);
                    return;
                }
                int n10 = ((dv)object).k;
                object2 = new cz("Cannot move metadata files to final location.", n10);
                throw object2;
            }
            int n14 = ((dv)object).k;
            object2 = new cz("Cannot move merged pack files to final location.", n14);
            throw object2;
        }
        object3 = ((dv)object).l;
        object3 = cP.a("Cannot find pack files to move for pack ", (String)object3, ".");
        int n15 = ((dv)object).k;
        object2 = new cz((String)object3, n15);
        throw object2;
    }
}

