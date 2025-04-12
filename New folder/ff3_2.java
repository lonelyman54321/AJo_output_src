/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ff3
 */
public final class ff3_2
extends i23_0
implements jb3_2 {
    public final Object getValue() {
        synchronized (this) {
            Object object = this.h;
            Intrinsics.checkNotNull(object);
            long l2 = this.i;
            long l3 = this.p();
            int n3 = this.k;
            long l4 = n3;
            l3 += l4;
            l4 = this.i;
            int n4 = (int)(l3 - l4);
            l3 = n4;
            l2 += l3;
            l3 = 1L;
            l2 -= l3;
            object = k23_0.c((Object[])object, l2);
            object = (Number)object;
            int n7 = ((Number)object).intValue();
            object = n7;
            return object;
        }
    }

    public final void w(int n3) {
        synchronized (this) {
            Object object = this.h;
            Intrinsics.checkNotNull(object);
            long l2 = this.i;
            long l3 = this.p();
            int n4 = this.k;
            long l4 = n4;
            l3 += l4;
            l4 = this.i;
            int n7 = (int)(l3 - l4);
            l3 = n7;
            l2 += l3;
            l3 = 1L;
            l2 -= l3;
            object = k23_0.c((Object[])object, l2);
            object = (Number)object;
            int n8 = ((Number)object).intValue() + n3;
            Integer n10 = n8;
            this.a(n10);
            return;
        }
    }
}

