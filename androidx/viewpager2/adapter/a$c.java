/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager2.adapter;

import androidx.viewpager2.adapter.a$e;
import androidx.viewpager2.adapter.a$e$a;
import androidx.viewpager2.adapter.a$e$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a$c {
    public CopyOnWriteArrayList a;

    public static void b(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            a$e$b a$e$b = (a$e$b)object.next();
            a$e$b.getClass();
        }
    }

    public final ArrayList a() {
        boolean bl2;
        ArrayList<a$e.a> arrayList = new ArrayList<a$e.a>();
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            ((a$e)iterator.next()).getClass();
            a$e.a a2 = a$e.a;
            arrayList.add(a2);
        }
        return arrayList;
    }
}

