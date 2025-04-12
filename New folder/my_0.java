/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from my
 */
public final class my_0
extends im2 {
    public final hd1_0 a;
    public final long b;
    public final long c;
    public int d;
    public final long e;
    public float f;
    public TX g;

    public /* synthetic */ my_0(hd1_0 hd1_02) {
        int n3 = hd1_02.getWidth();
        int n4 = hd1_02.getHeight();
        long l2 = dj1.a(n3, n4);
        this(hd1_02, 0L, l2);
    }

    public my_0(hd1_0 object, long l2, long l3) {
        int n3;
        long l4;
        int n4;
        int n7;
        this.a = object;
        this.b = l2;
        this.c = l3;
        this.d = 1;
        int n8 = 32;
        long l7 = l2 >> n8;
        int n10 = (int)l7;
        if (n10 >= 0 && (n7 = (int)(l2 &= (l7 = 0xFFFFFFFFL))) >= 0 && (n7 = (int)(l2 = l3 >> n8)) >= 0 && (n4 = (int)(l4 = l3 & l7)) >= 0 && n7 <= (n8 = object.getWidth()) && n4 <= (n3 = object.getHeight())) {
            this.e = l3;
            this.f = 1.0f;
            return;
        }
        String string2 = "Failed requirement.".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final boolean applyAlpha(float f5) {
        this.f = f5;
        return true;
    }

    public final boolean applyColorFilter(TX tX) {
        this.g = tX;
        return true;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof my_0;
        if (n3 == 0) {
            return false;
        }
        object = (my_0)object;
        hd1_0 hd1_02 = this.a;
        hd1_0 hd1_03 = ((my_0)object).a;
        n3 = Intrinsics.areEqual(hd1_02, hd1_03);
        if (n3 == 0) {
            return false;
        }
        long l2 = this.b;
        long l3 = ((my_0)object).b;
        n3 = Si1.b(l2, l3);
        if (n3 == 0) {
            return false;
        }
        l2 = this.c;
        l3 = ((my_0)object).c;
        n3 = bj1.b(l2, l3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.d;
        int n4 = ((my_0)object).d;
        if ((n4 = (int)(BM0.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        return bl2;
    }

    public final long getIntrinsicSize-NH-jbRc() {
        return dj1.b(this.e);
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        long l2 = this.b;
        int n4 = 32;
        long l3 = l2 >>> n4;
        int n7 = ((int)(l2 ^ l3) + n3) * 31;
        long l4 = this.c;
        long l7 = l4 >>> n4;
        int n8 = ((int)(l4 ^ l7) + n7) * 31;
        n3 = this.d;
        return n8 + n3;
    }

    public final void onDraw(Kt0 kt0) {
        int n3 = Math.round(C63.d(kt0.l()));
        int n4 = Math.round(C63.b(kt0.l()));
        long l2 = dj1.a(n3, n4);
        float f5 = this.f;
        TX tX = this.g;
        int n7 = this.d;
        long l3 = this.b;
        long l4 = this.c;
        hd1_0 hd1_02 = this.a;
        Jt0.d(kt0, hd1_02, l3, l4, l2, f5, tX, n7, 328);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BitmapPainter(image=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", srcOffset=");
        object = Si1.e(this.b);
        stringBuilder.append(object);
        stringBuilder.append(", srcSize=");
        long l2 = this.c;
        object = bj1.e(l2);
        stringBuilder.append(object);
        object = ", filterQuality=";
        stringBuilder.append((String)object);
        int n3 = this.d;
        int n4 = BM0.a(n3, 0);
        object = n4 != 0 ? "None" : ((n4 = BM0.a(n3, 1)) != 0 ? "Low" : ((n4 = BM0.a(n3, 2)) != 0 ? "Medium" : ((n3 = (int)(BM0.a(n3, n4 = 3) ? 1 : 0)) != 0 ? "High" : "Unknown")));
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

