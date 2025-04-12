/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from xe0
 */
public final class xe0_2
extends im2 {
    public im2 a;
    public final im2 b;
    public final i70_0 c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final ParcelableSnapshotMutableIntState g;
    public long h;
    public boolean i;
    public final ParcelableSnapshotMutableFloatState j;
    public final ParcelableSnapshotMutableState k;

    public xe0_2(im2 object, im2 im22, i70_0 i70_02, int n3, boolean bl2, boolean bl3) {
        this.a = object;
        this.b = im22;
        this.c = i70_02;
        this.d = n3;
        this.e = bl2;
        this.f = bl3;
        this.g = object = Pv2.b(0);
        this.h = -1;
        this.j = object = tp1_0.e(1.0f);
        this.k = object = J83.g(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(Kt0 object, im2 im22, float f5) {
        Object object2;
        long l2;
        boolean bl2;
        long l3;
        boolean bl3;
        long l4;
        if (im22 == null) return;
        float f6 = 0.0f;
        Object object3 = null;
        float f7 = f5 - 0.0f;
        Object object4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object4 <= 0) {
            return;
        }
        long l7 = object.l();
        long l8 = im22.getIntrinsicSize-NH-jbRc();
        long l12 = l8 - (l4 = 9205357640488583168L);
        Object object5 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object5 == false || (bl3 = C63.e(l8)) || (l3 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1)) == false || (bl2 = C63.e(l7))) {
            l2 = l7;
        } else {
            object2 = this.c;
            long l14 = object2.a(l8, l7);
            l2 = l8 = ZS2.d(l8, l14);
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.k;
        long l15 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
        if (l15 != false && (l15 = (long)C63.e(l7)) == false) {
            Object object6;
            float f8 = C63.d(l7);
            float f11 = C63.d(l2);
            f8 -= f11;
            int n3 = 2;
            f11 = n3;
            f6 = C63.b(l7);
            float f12 = C63.b(l2);
            f6 = (f6 - f12) / f11;
            object.M0().a.c(f8 /= f11, f6, f8, f6);
            Object object7 = object6 = parcelableSnapshotMutableState.getValue();
            object7 = (TX)object6;
            object2 = im22;
            im22.draw-x_KDEd0((Kt0)object, l2, f5, (TX)object7);
            object = object.M0().a;
            float f14 = -f8;
            f5 = -f6;
            ((yl_0)object).c(f14, f5, f14, f5);
            return;
        }
        Object object8 = object3 = parcelableSnapshotMutableState.getValue();
        object8 = (TX)object3;
        object2 = im22;
        im22.draw-x_KDEd0((Kt0)object, l2, f5, (TX)object8);
    }

    public final boolean applyAlpha(float f5) {
        this.j.k(f5);
        return true;
    }

    public final boolean applyColorFilter(TX tX) {
        this.k.setValue(tX);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long getIntrinsicSize-NH-jbRc() {
        im2 im22 = this.a;
        long l2 = 0L;
        long l3 = im22 != null ? im22.getIntrinsicSize-NH-jbRc() : l2;
        im22 = this.b;
        if (im22 != null) {
            l2 = im22.getIntrinsicSize-NH-jbRc();
        }
        boolean bl2 = false;
        float f5 = 0.0f;
        im22 = null;
        boolean bl3 = true;
        float f6 = Float.MIN_VALUE;
        long l4 = 9205357640488583168L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        object = object != false ? (Object)1 : (Object)0;
        Object object2 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object2 != false) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        }
        if (object != false && bl2) {
            f5 = C63.d(l3);
            f6 = C63.d(l2);
            f5 = Math.max(f5, f6);
            float f7 = C63.b(l3);
            float f8 = C63.b(l2);
            f8 = Math.max(f7, f8);
            return bo1_1.a(f5, f8);
        }
        bl3 = this.f;
        if (!bl3) return l4;
        if (object != false) return l3;
        if (!bl2) return l4;
        return l2;
    }

    public final void onDraw(Kt0 object) {
        im2 im22;
        Object object2 = this.i;
        im2 im23 = this.b;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.j;
        if (object2 != 0) {
            float f5 = parcelableSnapshotMutableFloatState.c();
            this.a((Kt0)object, im23, f5);
            return;
        }
        long l2 = SystemClock.uptimeMillis();
        long l3 = this.h;
        long l4 = -1;
        long l7 = l3 - l4;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 == 0) {
            this.h = l2;
        }
        l3 = this.h;
        float f6 = l2 -= l3;
        float f7 = this.d;
        f6 /= f7;
        float f8 = 1.0f;
        f7 = kotlin.ranges.f.f(f6, 0.0f, f8);
        float f11 = parcelableSnapshotMutableFloatState.c() * f7;
        int n3 = (int)(this.e ? 1 : 0);
        float f12 = n3 != 0 ? parcelableSnapshotMutableFloatState.c() - f11 : parcelableSnapshotMutableFloatState.c();
        n3 = 1;
        f7 = Float.MIN_VALUE;
        object2 = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1);
        if (object2 >= 0) {
            object2 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            object2 = 0;
            f6 = 0.0f;
            im22 = null;
        }
        this.i = object2;
        im22 = this.a;
        this.a((Kt0)object, im22, f12);
        this.a((Kt0)object, im23, f11);
        boolean bl2 = this.i;
        if (bl2) {
            bl2 = false;
            object = null;
            this.a = null;
        } else {
            object = this.g;
            object2 = ((e83_0)object).o() + n3;
            ((e83_0)object).e((int)object2);
        }
    }
}

