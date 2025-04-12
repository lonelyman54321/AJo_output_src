/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class J93
implements E30,
Iterable,
KMappedMarker {
    public final l73 a;
    public final int b;
    public final Q11 c;
    public final i0_0 d;
    public final Integer e;
    public final J93 f;

    public J93(l73 object, int n3, Q11 q11, dI2 dI22) {
        this.a = object;
        this.b = n3;
        this.c = q11;
        this.d = dI22;
        q11.getClass();
        this.e = object = Integer.valueOf(0);
        this.f = this;
    }

    public final Iterable a() {
        return this.f;
    }

    public final Object e() {
        return null;
    }

    public final Object f() {
        i0_0 i0_02 = this.d;
        l73 l732 = this.a;
        return i0_02.M(l732);
    }

    public final Iterable getData() {
        int n3 = this.b;
        Q11 q11 = this.c;
        l73 l732 = this.a;
        h93_0 h93_02 = new h93_0(l732, n3, q11);
        return h93_02;
    }

    public final Object getKey() {
        return this.e;
    }

    public final String getSourceInfo() {
        this.c.getClass();
        return null;
    }

    public final Iterator iterator() {
        Q11 q11 = this.c;
        i0_0 i0_02 = this.d;
        l73 l732 = this.a;
        int n3 = this.b;
        I93 i93 = new I93(l732, n3, q11, i0_02);
        return i93;
    }
}

