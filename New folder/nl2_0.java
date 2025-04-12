/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.foundation.lazy.layout.g;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nl2
 */
public final class nl2_0
implements wr1_0 {
    public final Cl2 a;
    public final b b;
    public final d c;

    public nl2_0(hm0_0 hm0_02, ll2 ll22, g g3) {
        this.a = hm0_02;
        this.b = ll22;
        this.c = g3;
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
        object2 = object2.g(-1201380429);
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
            ws1_0 ws1_02 = this.a.z;
            Object object3 = new nl2$a(this, n3);
            u10 u102 = v10.c(1142237095, (fx0_2)object3, (b30_0)object2);
            n10 = n8 >> 3 & 0xE | 0xC00;
            n8 = n8 << 3 & 0x70;
            int n14 = n10 | n8;
            object3 = object;
            n7 = n3;
            vs1.b(object, n3, ws1_02, u102, (b30_0)object2, n14);
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            nl2$b nl2$b = new nl2$b(this, n3, object, n4);
            ((CF2)object2).d = nl2$b;
        }
    }

    public final /* synthetic */ Object e(int n3) {
        return null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof nl2_0;
        if (!bl2) {
            return false;
        }
        object = ((nl2_0)object).b;
        return Intrinsics.areEqual(this.b, object);
    }

    public final int getItemCount() {
        return this.b.e().b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

