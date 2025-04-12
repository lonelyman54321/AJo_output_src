/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;

/*
 * Renamed from gR
 */
public abstract class gr_1
implements mf3_0 {
    public final ArrayDeque a;
    public final ArrayDeque b;
    public final ArrayDeque c;
    public gR$a d;
    public long e;
    public long f;
    public long g;

    public gr_1() {
        Object object;
        Object object2;
        int n3;
        int n4;
        ArrayDeque arrayDeque;
        this.a = arrayDeque = new ArrayDeque();
        int n7 = 0;
        arrayDeque = null;
        ArrayDeque arrayDeque2 = null;
        for (n4 = 0; n4 < (n3 = 10); ++n4) {
            object2 = this.a;
            object = new gR$a();
            ((ArrayDeque)object2).add(object);
        }
        this.b = arrayDeque2 = new ArrayDeque();
        while (n7 < (n4 = 2)) {
            arrayDeque2 = this.b;
            object = new fr_1(this);
            object2 = new Rf3();
            ((gR$b)object2).f = object;
            arrayDeque2.add(object2);
            ++n7;
        }
        this.c = arrayDeque = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    public final void a(long l2) {
        this.e = l2;
    }

    public final void c(qf3_0 qf3_02) {
        long l2;
        long l3;
        long l4;
        boolean bl2;
        Object object = this.d;
        if (qf3_02 == object) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        ct3.a(bl2);
        qf3_02 = (gR$a)qf3_02;
        long l7 = qf3_02.f;
        long l8 = Long.MIN_VALUE;
        long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        if (l12 != false && (l4 = (l3 = (l8 = this.g) - (l2 = -9223372036854775807L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false && (l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1)) < 0) {
            qf3_02.g();
            object = this.a;
            ((ArrayDeque)object).add(qf3_02);
        } else {
            l7 = this.f;
            this.f = l8 = 1L + l7;
            ((gR$a)qf3_02).k = l7;
            object = this.c;
            ((ArrayDeque)object).add(qf3_02);
        }
        this.d = null;
    }

    public final void d(long l2) {
        this.g = l2;
    }

    public final Object e() {
        boolean bl2;
        Object object = this.d;
        if (object == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        ct3.f(bl2);
        object = this.a;
        boolean bl3 = ((ArrayDeque)object).isEmpty();
        if (bl3) {
            bl2 = false;
            object = null;
        } else {
            this.d = object = (gR$a)((ArrayDeque)object).pollFirst();
        }
        return object;
    }

    public void flush() {
        ArrayDeque arrayDeque;
        Object object;
        long l2;
        this.f = l2 = 0L;
        this.e = l2;
        while (true) {
            object = this.c;
            int n3 = ((ArrayDeque)object).isEmpty();
            arrayDeque = this.a;
            if (n3 != 0) break;
            object = (gR$a)((ArrayDeque)object).poll();
            n3 = gz3.a;
            ((DecoderInputBuffer)object).g();
            arrayDeque.add(object);
        }
        object = this.d;
        if (object != null) {
            ((DecoderInputBuffer)object).g();
            arrayDeque.add(object);
            object = null;
            this.d = null;
        }
    }

    public abstract hr_1 g();

    public abstract void h(gR$a var1);

    public Rf3 i() {
        Object object;
        int n3;
        Object object2 = this.b;
        boolean bl2 = ((ArrayDeque)object2).isEmpty();
        hr_1 hr_12 = null;
        if (bl2) {
            return null;
        }
        while ((n3 = ((ArrayDeque)(object = this.c)).isEmpty()) == 0) {
            gR$a gR$a = (gR$a)((ArrayDeque)object).peek();
            int n4 = gz3.a;
            long l2 = gR$a.f;
            long l3 = this.e;
            long l4 = l2 - l3;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 > 0) break;
            object = (gR$a)((ArrayDeque)object).poll();
            n3 = 4;
            n4 = (int)(((fE)object).f(n3) ? 1 : 0);
            ArrayDeque arrayDeque = this.a;
            if (n4 != 0) {
                object2 = (Rf3)((ArrayDeque)object2).pollFirst();
                ((fE)object2).e(n3);
                ((DecoderInputBuffer)object).g();
                arrayDeque.add(object);
                return object2;
            }
            this.h((gR$a)object);
            n3 = (int)(this.j() ? 1 : 0);
            if (n3 != 0) {
                hr_12 = this.g();
                object2 = (Rf3)((ArrayDeque)object2).pollFirst();
                ((gj0_0)object2).b = l2 = ((DecoderInputBuffer)object).f;
                ((Rf3)object2).d = hr_12;
                ((Rf3)object2).e = l2;
                ((DecoderInputBuffer)object).g();
                arrayDeque.add(object);
                return object2;
            }
            ((DecoderInputBuffer)object).g();
            arrayDeque.add(object);
        }
        return null;
    }

    public abstract boolean j();

    public void release() {
    }
}

