/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class lZ {
    public final ParcelableSnapshotMutableState a;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;

    public lZ(long l2, long l3, long l4, long l7, long l8, long l12, long l14, long l15, long l16, long l17, long l18, long l19, boolean bl2) {
        Object object = new OX(l2);
        J83.l();
        qi_2 qi_22 = qi_2.b;
        this.a = object = J83.f(object, qi_22);
        object = new OX(l3);
        J83.l();
        this.b = object = J83.f(object, qi_22);
        object = new OX(l4);
        J83.l();
        this.c = object = J83.f(object, qi_22);
        object = new OX(l7);
        J83.l();
        this.d = object = J83.f(object, qi_22);
        object = new OX(l8);
        J83.l();
        this.e = object = J83.f(object, qi_22);
        object = new OX(l12);
        J83.l();
        this.f = object = J83.f(object, qi_22);
        object = new OX(l14);
        J83.l();
        this.g = object = J83.f(object, qi_22);
        object = new OX(l15);
        J83.l();
        this.h = object = J83.f(object, qi_22);
        object = new OX(l16);
        J83.l();
        this.i = object = J83.f(object, qi_22);
        object = new OX(l17);
        J83.l();
        this.j = object = J83.f(object, qi_22);
        object = new OX(l18);
        J83.l();
        this.k = object = J83.f(object, qi_22);
        object = new OX(l19);
        J83.l();
        this.l = object = J83.f(object, qi_22);
        object = bl2;
        J83.l();
        this.m = object = J83.f(object, qi_22);
    }

    public static lZ a(lZ lZ2, long l2, long l3, long l4, long l7, long l8, long l12, long l14, long l15, long l16, long l17, long l18, long l19, int n3) {
        lZ lZ3;
        long l20;
        OX oX;
        long l21;
        long l22;
        lZ lZ4 = lZ2;
        int n4 = n3;
        int n7 = n3 & 1;
        long l23 = n7 != 0 ? lZ2.f() : l2;
        int n8 = n4 & 2;
        if (n8 != 0) {
            OX oX2 = (OX)lZ4.b.getValue();
            l22 = oX2.a;
        } else {
            l22 = l3;
        }
        int n10 = n4 & 4;
        long l24 = n10 != 0 ? lZ2.g() : l4;
        int n14 = n4 & 8;
        if (n14 != 0) {
            OX oX3 = (OX)lZ4.d.getValue();
            l21 = oX3.a;
        } else {
            l21 = l7;
        }
        int n15 = n4 & 0x10;
        long l25 = n15 != 0 ? lZ2.b() : l8;
        int n16 = n4 & 0x20;
        long l26 = n16 != 0 ? lZ2.h() : l12;
        int n17 = n4 & 0x40;
        long l27 = n17 != 0 ? lZ2.c() : l14;
        l14 = l27;
        n17 = n4 & 0x80;
        if (n17 != 0) {
            oX = (OX)lZ4.h.getValue();
            l27 = oX.a;
        } else {
            l27 = l15;
        }
        l15 = l27;
        n17 = n4 & 0x100;
        if (n17 != 0) {
            oX = (OX)lZ4.i.getValue();
            l27 = oX.a;
        } else {
            l27 = l16;
        }
        l16 = l27;
        n17 = n4 & 0x200;
        l27 = n17 != 0 ? lZ2.d() : l17;
        l17 = l27;
        n17 = n4 & 0x400;
        l27 = n17 != 0 ? lZ2.e() : l18;
        if ((n4 &= 0x800) != 0) {
            OX oX4 = (OX)lZ4.l.getValue();
            l20 = oX4.a;
        } else {
            l20 = l19;
        }
        boolean bl2 = lZ2.i();
        lZ2.getClass();
        lZ2 = lZ3;
        l2 = l23;
        l3 = l22;
        l4 = l24;
        l7 = l21;
        l8 = l25;
        l12 = l26;
        l18 = l27;
        l19 = l20;
        n3 = (int)(bl2 ? 1 : 0);
        lZ3 = new lZ(l23, l22, l24, l21, l25, l26, l14, l15, l16, l17, l27, l20, bl2);
        return lZ3;
    }

    public final long b() {
        return ((OX)this.e.getValue()).a;
    }

    public final long c() {
        return ((OX)this.g.getValue()).a;
    }

    public final long d() {
        return ((OX)this.j.getValue()).a;
    }

    public final long e() {
        return ((OX)this.k.getValue()).a;
    }

    public final long f() {
        return ((OX)this.a.getValue()).a;
    }

    public final long g() {
        return ((OX)this.c.getValue()).a;
    }

    public final long h() {
        return ((OX)this.f.getValue()).a;
    }

    public final boolean i() {
        return (Boolean)this.m.getValue();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Colors(primary=");
        String string2 = OX.i(this.f());
        stringBuilder.append((Object)string2);
        stringBuilder.append(", primaryVariant=");
        string2 = OX.i(((OX)this.b.getValue()).a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", secondary=");
        string2 = OX.i(this.g());
        stringBuilder.append((Object)string2);
        stringBuilder.append(", secondaryVariant=");
        string2 = OX.i(((OX)this.d.getValue()).a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", background=");
        string2 = OX.i(this.b());
        stringBuilder.append((Object)string2);
        stringBuilder.append(", surface=");
        string2 = OX.i(this.h());
        stringBuilder.append((Object)string2);
        stringBuilder.append(", error=");
        string2 = OX.i(this.c());
        stringBuilder.append((Object)string2);
        stringBuilder.append(", onPrimary=");
        string2 = OX.i(((OX)this.h.getValue()).a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", onSecondary=");
        string2 = OX.i(((OX)this.i.getValue()).a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", onBackground=");
        string2 = OX.i(this.d());
        stringBuilder.append((Object)string2);
        stringBuilder.append(", onSurface=");
        string2 = OX.i(this.e());
        stringBuilder.append((Object)string2);
        stringBuilder.append(", onError=");
        string2 = OX.i(((OX)this.l.getValue()).a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", isLight=");
        boolean bl2 = this.i();
        stringBuilder.append(bl2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

