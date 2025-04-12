/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class FA3
extends im2 {
    public final ParcelableSnapshotMutableState a;
    public final ParcelableSnapshotMutableState b;
    public final xa3_1 c;
    public final ParcelableSnapshotMutableIntState d;
    public float e;
    public TX f;
    public int g;

    public FA3() {
        n11_0 n11_02 = new n11_0();
        this(n11_02);
    }

    public FA3(n11_0 object) {
        Object object2 = new C63(0L);
        this.a = object2 = J83.g(object2);
        this.b = object2 = J83.g(Boolean.FALSE);
        object2 = new xa3_1((n11_0)object);
        ((xa3_1)object2).f = object = new FA3$a(this);
        this.c = object2;
        this.d = object = Pv2.b(0);
        this.e = 1.0f;
        this.g = -1;
    }

    public final boolean applyAlpha(float f5) {
        this.e = f5;
        return true;
    }

    public final boolean applyColorFilter(TX tX) {
        this.f = tX;
        return true;
    }

    public final long getIntrinsicSize-NH-jbRc() {
        return ((C63)this.a.getValue()).a;
    }

    public final void onDraw(Kt0 kt0) {
        int n3;
        bp1_0 bp1_02;
        Object object;
        boolean bl2;
        TX tX = this.f;
        xa3_1 xa3_12 = this.c;
        if (tX == null) {
            tX = (TX)xa3_12.g.getValue();
        }
        if ((bl2 = (object = (Boolean)this.b.getValue()).booleanValue()) && (object = kt0.getLayoutDirection()) == (bp1_02 = bp1_0.Rtl)) {
            long l2 = kt0.X0();
            xL$b xL$b = kt0.M0();
            long l3 = xL$b.l();
            Object object2 = xL$b.a();
            object2.p();
            object2 = xL$b.a;
            float f5 = -1.0f;
            float f6 = 1.0f;
            try {
                ((yl_0)object2).e(f5, f6, l2);
                float f7 = this.e;
                xa3_12.e(kt0, f7, tX);
            }
            finally {
                jz.b(xL$b, l3);
            }
        } else {
            float f8 = this.e;
            xa3_12.e(kt0, f8, tX);
        }
        this.g = n3 = this.d.o();
    }
}

