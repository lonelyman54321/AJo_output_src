/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public final class Jp$d
implements Iterator,
Map.Entry {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ Jp d;

    public Jp$d(Jp jp) {
        int n3;
        this.d = jp;
        this.a = n3 = jp.c + -1;
        this.b = -1;
    }

    public final boolean equals(Object object) {
        int n3 = this.c;
        if (n3 != 0) {
            boolean bl2;
            int n4;
            Jp jp;
            Object object2;
            n3 = object instanceof Map.Entry;
            boolean bl3 = false;
            if (n3 == 0) {
                return false;
            }
            Object object3 = (object = (Map.Entry)object).getKey();
            n3 = Intrinsics.areEqual(object3, object2 = (jp = this.d).h(n4 = this.b));
            if (n3 != 0 && (bl2 = Intrinsics.areEqual(object = object.getValue(), object3 = jp.l(n3 = this.b)))) {
                bl3 = true;
            }
            return bl3;
        }
        object = new IllegalStateException("This container does not support retaining Map.Entry objects");
        throw object;
    }

    public final Object getKey() {
        boolean bl2 = this.c;
        if (bl2) {
            Jp jp = this.d;
            int n3 = this.b;
            return jp.h(n3);
        }
        IllegalStateException illegalStateException = new IllegalStateException("This container does not support retaining Map.Entry objects");
        throw illegalStateException;
    }

    public final Object getValue() {
        boolean bl2 = this.c;
        if (bl2) {
            Jp jp = this.d;
            int n3 = this.b;
            return jp.l(n3);
        }
        IllegalStateException illegalStateException = new IllegalStateException("This container does not support retaining Map.Entry objects");
        throw illegalStateException;
    }

    public final boolean hasNext() {
        int n3 = this.b;
        int n4 = this.a;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final int hashCode() {
        int n3 = this.c;
        if (n3 != 0) {
            n3 = this.b;
            Object object = this.d;
            Object object2 = ((a53)object).h(n3);
            int n4 = this.b;
            object = ((a53)object).l(n4);
            n4 = 0;
            if (object2 == null) {
                n3 = 0;
                object2 = null;
            } else {
                n3 = object2.hashCode();
            }
            if (object != null) {
                n4 = object.hashCode();
            }
            return n3 ^ n4;
        }
        IllegalStateException illegalStateException = new IllegalStateException("This container does not support retaining Map.Entry objects");
        throw illegalStateException;
    }

    public final Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            n3 = this.b;
            int n4 = 1;
            this.b = n3 += n4;
            this.c = n4;
            return this;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        int n3 = this.c;
        if (n3 != 0) {
            Jp jp = this.d;
            int n4 = this.b;
            jp.j(n4);
            this.b = n3 = this.b + -1;
            this.a = n3 = this.a + -1;
            this.c = false;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public final Object setValue(Object object) {
        boolean bl2 = this.c;
        if (bl2) {
            Jp jp = this.d;
            int n3 = this.b;
            return jp.k(n3, object);
        }
        object = new IllegalStateException("This container does not support retaining Map.Entry objects");
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getKey();
        stringBuilder.append(object);
        stringBuilder.append("=");
        object = this.getValue();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

