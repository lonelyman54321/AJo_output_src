/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.co;
import com.google.android.play.core.assetpacks.cp;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.dt;
import com.google.android.play.core.assetpacks.dv;
import com.google.android.play.core.assetpacks.dw;
import com.google.android.play.core.assetpacks.ei;
import com.google.android.play.core.assetpacks.ej;
import com.google.android.play.core.assetpacks.el;
import com.google.android.play.core.assetpacks.en;
import com.google.android.play.core.assetpacks.ev;
import com.google.android.play.core.assetpacks.ew;
import com.google.android.play.core.assetpacks.ey;
import com.google.android.play.core.assetpacks.fa;
import com.google.android.play.core.assetpacks.fg;
import com.google.android.play.core.assetpacks.fh;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.z;
import java.util.concurrent.atomic.AtomicBoolean;

final class da {
    private static final o a;
    private final dt b;
    private final cp c;
    private final fh d;
    private final ej e;
    private final en f;
    private final ew g;
    private final fa h;
    private final dw i;
    private final AtomicBoolean j;
    private final aq k;

    static {
        o o3;
        a = o3 = new o("ExtractorLooper");
    }

    public da(dt object, aq aq2, cp cp2, fh fh2, ej ej2, en en4, ew ew2, fa fa3, dw dw2) {
        this.b = object;
        this.k = aq2;
        this.c = cp2;
        this.d = fh2;
        this.e = ej2;
        this.f = en4;
        this.g = ew2;
        this.h = fa3;
        this.i = dw2;
        this.j = object = new AtomicBoolean(false);
    }

    private final void b(int n3, Exception object) {
        int n4;
        Object object2;
        try {
            object2 = this.b;
            n4 = 5;
        }
        catch (cz cz2) {
            o o3 = a;
            object = ((Throwable)object).getMessage();
            object2 = new Object[]{object};
            o3.b("Error during error handling: %s", (Object[])object2);
            return;
        }
        ((dt)object2).m(n3, n4);
        object2 = this.b;
        ((dt)object2).n(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = a;
        Object[] objectArray = null;
        Object object2 = new Object[]{};
        String string2 = "Run extractor loop";
        ((o)object).a(string2, (Object[])object2);
        object2 = this.j;
        int n3 = 1;
        int n4 = ((AtomicBoolean)object2).compareAndSet(false, n3 != 0);
        if (n4 == 0) {
            objectArray = new Object[]{};
            ((o)object).e("runLoop already looping; return", objectArray);
            return;
        }
        while (true) {
            Object[] objectArray2;
            Exception exception2;
            int n7;
            int n8;
            Object object3;
            Object object4;
            block18: {
                block19: {
                    try {
                        object = this.i;
                        object = ((dw)object).a();
                    }
                    catch (cz cz2) {
                        object2 = a;
                        object4 = cz2.getMessage();
                        object3 = new Object[n3];
                        object3[0] = object4;
                        ((o)object2).b("Error while getting next extraction task: %s", (Object[])object3);
                        n4 = cz2.a;
                        object4 = null;
                        if (n4 >= 0) {
                            object2 = (z)this.k.a();
                            n8 = cz2.a;
                            object2.i(n8);
                            n4 = cz2.a;
                            this.b(n4, cz2);
                        }
                        n7 = 0;
                        object = null;
                    }
                    if (object == null) {
                        this.j.set(false);
                        return;
                    }
                    n4 = object instanceof co;
                    if (n4 != 0) {
                        object2 = this.c;
                        object4 = object;
                        object4 = (co)object;
                        ((cp)object2).a((co)object4);
                        continue;
                    }
                    n4 = object instanceof fg;
                    if (n4 != 0) {
                        object2 = this.d;
                        object4 = object;
                        object4 = (fg)object;
                        ((fh)object2).a((fg)object4);
                        continue;
                    }
                    n4 = object instanceof ei;
                    if (n4 != 0) {
                        object2 = this.e;
                        object4 = object;
                        object4 = (ei)object;
                        ((ej)object2).a((ei)object4);
                        continue;
                    }
                    n4 = object instanceof el;
                    if (n4 != 0) {
                        object2 = this.f;
                        object4 = object;
                        object4 = (el)object;
                        ((en)object2).b((el)object4);
                        continue;
                    }
                    n4 = object instanceof ev;
                    if (n4 != 0) {
                        object2 = this.g;
                        object4 = object;
                        object4 = (ev)object;
                        ((ew)object2).a((ev)object4);
                        continue;
                    }
                    n4 = object instanceof ey;
                    if (n4 == 0) break block19;
                    try {
                        object2 = this.h;
                        object4 = object;
                        object4 = (ey)object;
                        ((fa)object2).b((ey)object4);
                        continue;
                    }
                    catch (Exception exception2) {
                        break block18;
                    }
                }
                object2 = a;
                object4 = "Unknown task type: %s";
                object3 = object.getClass();
                object3 = ((Class)object3).getName();
                objectArray2 = new Object[n3];
                objectArray2[0] = object3;
                ((o)object2).b((String)object4, objectArray2);
                continue;
            }
            object4 = a;
            object3 = exception2.getMessage();
            objectArray2 = new Object[n3];
            objectArray2[0] = object3;
            object3 = "Error during extraction task: %s";
            ((o)object4).b((String)object3, objectArray2);
            object4 = (z)this.k.a();
            n8 = ((dv)object).k;
            object4.i(n8);
            n7 = ((dv)object).k;
            this.b(n7, exception2);
        }
    }
}

