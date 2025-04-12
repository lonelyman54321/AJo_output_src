/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.d;
import androidx.navigation.i;
import androidx.navigation.n;
import androidx.navigation.p$a;
import androidx.navigation.p$c;
import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public abstract class p {
    public kU1 a;
    public boolean b;

    public abstract i a();

    public final kU1 b() {
        Object object = this.a;
        if (object != null) {
            return object;
        }
        String string2 = "You cannot access the Navigator's state until the Navigator is attached".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public i c(i i3) {
        Intrinsics.checkNotNullParameter(i3, "destination");
        return i3;
    }

    public void d(List object, n object2, p$a object3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "entries");
        object = CollectionsKt.E((Iterable)object);
        p$c p$c = new p$c(this, (n)object2, (p$a)object3);
        object = kz2_1.f(kz2_1.i((Sequence)object, p$c));
        object2 = new UM0$a((um0_2)object);
        while (bl2 = ((UM0$a)object2).hasNext()) {
            object = (d)((UM0$a)object2).next();
            object3 = this.b();
            ((kU1)object3).f((d)object);
        }
    }

    public void e(d object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "popUpTo");
        Object object2 = (List)this.b().e.a.getValue();
        int n3 = object2.contains(object);
        if (n3 != 0) {
            boolean bl3;
            n3 = object2.size();
            ListIterator listIterator = object2.listIterator(n3);
            object2 = null;
            while ((bl3 = this.f()) && !(bl3 = Intrinsics.areEqual(object2 = (d)listIterator.previous(), object))) {
            }
            if (object2 != null) {
                object = this.b();
                ((kU1)object).c((d)object2, bl2);
            }
            return;
        }
        Serializable serializable = new StringBuilder("popBackStack was called with ");
        serializable.append(object);
        serializable.append(" which does not exist in back stack ");
        serializable.append(object2);
        object = serializable.toString();
        object = object.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public boolean f() {
        return true;
    }
}

