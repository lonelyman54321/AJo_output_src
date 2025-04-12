/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zO2
 */
public final class zo2_2
extends x0_0 {
    public final List b;

    public zo2_2(List list) {
        Intrinsics.checkNotNullParameter(list, "delegate");
        this.b = list;
    }

    public final int a() {
        return this.b.size();
    }

    public final Object get(int n3) {
        List list = this.b;
        n3 = dx_2.z(n3, this);
        return list.get(n3);
    }

    public final Iterator iterator() {
        zO2$a zO2$a = new zO2$a(this, 0);
        return zO2$a;
    }

    public final ListIterator listIterator() {
        zO2$a zO2$a = new zO2$a(this, 0);
        return zO2$a;
    }

    public final ListIterator listIterator(int n3) {
        zO2$a zO2$a = new zO2$a(this, n3);
        return zO2$a;
    }
}

