/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ZN1 {
    public final Runnable a;
    public final CopyOnWriteArrayList b;
    public final HashMap c;

    public ZN1(Runnable runnable2) {
        Cloneable cloneable;
        this.b = cloneable = new Cloneable();
        this.c = cloneable;
        this.a = runnable2;
    }

    public final void a(fo1_0 fo1_02, mu1_1 object) {
        Object object2;
        this.b.add(fo1_02);
        this.a.run();
        object = object.getLifecycle();
        HashMap hashMap = this.c;
        Object object3 = (ZN1$a)hashMap.remove(fo1_02);
        if (object3 != null) {
            object2 = ((ZN1$a)object3).a;
            n n3 = ((ZN1$a)object3).b;
            ((i)object2).c(n3);
            object2 = null;
            ((ZN1$a)object3).b = null;
        }
        object3 = new yn1_1(this, fo1_02);
        object2 = new ZN1$a((i)object, (n)object3);
        hashMap.put(fo1_02, object2);
    }

    public final void b(fo1_0 fo1_02, mu1_1 object, i$b object2) {
        object = object.getLifecycle();
        HashMap hashMap = this.c;
        Object object3 = (ZN1$a)hashMap.remove(fo1_02);
        if (object3 != null) {
            i i3 = ((ZN1$a)object3).a;
            n n3 = ((ZN1$a)object3).b;
            i3.c(n3);
            i3 = null;
            ((ZN1$a)object3).b = null;
        }
        object3 = new xn1_1(this, (i$b)((Object)object2), fo1_02);
        object2 = new ZN1$a((i)object, (n)object3);
        hashMap.put(fo1_02, object2);
    }

    public final void c(fo1_0 object) {
        this.b.remove(object);
        Object object2 = this.c;
        object = (ZN1$a)((HashMap)object2).remove(object);
        if (object != null) {
            object2 = ((ZN1$a)object).a;
            n n3 = ((ZN1$a)object).b;
            ((i)object2).c(n3);
            object2 = null;
            ((ZN1$a)object).b = null;
        }
        this.a.run();
    }
}

