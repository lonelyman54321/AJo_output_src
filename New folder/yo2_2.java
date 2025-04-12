/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yO2
 */
public final class yo2_2
extends e1_0 {
    public final List a;

    public yo2_2(List list) {
        Intrinsics.checkNotNullParameter(list, "delegate");
        this.a = list;
    }

    public final int a() {
        return this.a.size();
    }

    public final void add(int n3, Object object) {
        List list = this.a;
        n3 = dx_2.A(n3, this);
        list.add(n3, object);
    }

    public final Object c(int n3) {
        List list = this.a;
        n3 = dx_2.z(n3, this);
        return list.remove(n3);
    }

    public final void clear() {
        this.a.clear();
    }

    public final Object get(int n3) {
        List list = this.a;
        n3 = dx_2.z(n3, this);
        return list.get(n3);
    }

    public final Iterator iterator() {
        yO2$a yO2$a = new yO2$a(this, 0);
        return yO2$a;
    }

    public final ListIterator listIterator() {
        yO2$a yO2$a = new yO2$a(this, 0);
        return yO2$a;
    }

    public final ListIterator listIterator(int n3) {
        yO2$a yO2$a = new yO2$a(this, n3);
        return yO2$a;
    }

    public final Object set(int n3, Object object) {
        List list = this.a;
        n3 = dx_2.z(n3, this);
        return list.set(n3, object);
    }
}

