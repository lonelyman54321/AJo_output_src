/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.b$a;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.foundation.lazy.layout.g;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lq1
 */
public final class lq1_1
implements kq1_1 {
    public final qr1_0 a;
    public final eq1_1 b;
    public final d c;

    public lq1_1(qr1_0 qr1_02, eq1_1 eq1_12, g g3) {
        this.a = qr1_02;
        this.b = eq1_12;
        this.c = g3;
    }

    public final d a() {
        return this.c;
    }

    public final int b(Object object) {
        return this.c.b(object);
    }

    public final Object c(int n3) {
        Object object = this.c.c(n3);
        if (object == null) {
            object = this.b.f(n3);
        }
        return object;
    }

    public final void d(int n3, Object object, b30_0 object2, int n4) {
        int n7;
        object2 = object2.g(1493551140);
        int n8 = n4 & 6;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object2).c(n3) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n4;
        } else {
            n8 = n4;
        }
        int n10 = n4 & 0x30;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object2).x(object) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        if ((n10 = n4 & 0x180) == 0) {
            n10 = (int)(((j30_0)object2).J(this) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n8 |= n10;
        }
        if ((n10 = n8 & 0x93) == (n7 = 146) && (n10 = (int)(((j30_0)object2).h() ? 1 : 0)) != 0) {
            ((j30_0)object2).D();
        } else {
            ws1_0 ws1_02 = this.a.o;
            Object object3 = new lq1$a_1(this, n3);
            u10 u102 = v10.c(726189336, (fx0_2)object3, (b30_0)object2);
            n10 = n8 >> 3 & 0xE | 0xC00;
            n8 = n8 << 3 & 0x70;
            int n14 = n10 | n8;
            object3 = object;
            n7 = n3;
            vs1.b(object, n3, ws1_02, u102, (b30_0)object2, n14);
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            lq1$b_0 lq1$b_0 = new lq1$b_0(this, n3, object, n4);
            ((CF2)object2).d = lq1$b_0;
        }
    }

    public final Object e(int n3) {
        Object object = this.b.e().d(n3);
        int n4 = ((Nj1)object).a;
        object = ((b$a)((Nj1)object).c).getType();
        Integer n7 = n3 -= n4;
        return object.invoke(n7);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof lq1_1;
        if (!bl2) {
            return false;
        }
        object = ((lq1_1)object).b;
        return Intrinsics.areEqual(this.b, object);
    }

    public final int getItemCount() {
        return this.b.e().b;
    }

    public final pr1_0 h() {
        return this.b.a;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

