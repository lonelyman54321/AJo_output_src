/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import kotlin.Unit;

public final class GA3 {
    public static final void a(n11_0 n11_02, ca3_0 ca3_02) {
        List list = ca3_02.j;
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5;
            Object object;
            Uz3 uz3;
            EA3 eA3 = (EA3)ca3_02.j.get(i3);
            boolean bl2 = eA3 instanceof ha3_0;
            boolean bl3 = true;
            if (bl2) {
                float f6;
                int n4;
                uz3 = new jn2();
                eA3 = (ha3_0)eA3;
                object = ((ha3_0)eA3).b;
                ((jn2)uz3).d = object;
                ((jn2)uz3).n = bl3;
                uz3.c();
                object = ((jn2)uz3).s;
                int n7 = ((ha3_0)eA3).c;
                ((ki)object).i(n7);
                uz3.c();
                uz3.c();
                ((jn2)uz3).b = object = ((ha3_0)eA3).d;
                uz3.c();
                ((jn2)uz3).c = f5 = ((ha3_0)eA3).e;
                uz3.c();
                ((jn2)uz3).g = object = ((ha3_0)eA3).f;
                uz3.c();
                ((jn2)uz3).e = f5 = ((ha3_0)eA3).g;
                uz3.c();
                ((jn2)uz3).f = f5 = ((ha3_0)eA3).h;
                ((jn2)uz3).o = bl3;
                uz3.c();
                ((jn2)uz3).h = n4 = ((ha3_0)eA3).i;
                ((jn2)uz3).o = bl3;
                uz3.c();
                ((jn2)uz3).i = n4 = ((ha3_0)eA3).j;
                ((jn2)uz3).o = bl3;
                uz3.c();
                ((jn2)uz3).j = f5 = ((ha3_0)eA3).k;
                ((jn2)uz3).o = bl3;
                uz3.c();
                ((jn2)uz3).k = f5 = ((ha3_0)eA3).l;
                ((jn2)uz3).p = bl3;
                uz3.c();
                ((jn2)uz3).l = f5 = ((ha3_0)eA3).m;
                ((jn2)uz3).p = bl3;
                uz3.c();
                ((jn2)uz3).m = f6 = ((ha3_0)eA3).n;
                ((jn2)uz3).p = bl3;
                uz3.c();
                n11_02.e(i3, uz3);
                continue;
            }
            bl2 = eA3 instanceof ca3_0;
            if (!bl2) continue;
            uz3 = new n11_0();
            eA3 = (ca3_0)eA3;
            ((n11_0)uz3).k = object = ((ca3_0)eA3).a;
            uz3.c();
            ((n11_0)uz3).l = f5 = ((ca3_0)eA3).b;
            ((n11_0)uz3).s = bl3;
            uz3.c();
            ((n11_0)uz3).o = f5 = ((ca3_0)eA3).e;
            ((n11_0)uz3).s = bl3;
            uz3.c();
            ((n11_0)uz3).p = f5 = ((ca3_0)eA3).f;
            ((n11_0)uz3).s = bl3;
            uz3.c();
            ((n11_0)uz3).q = f5 = ((ca3_0)eA3).g;
            ((n11_0)uz3).s = bl3;
            uz3.c();
            ((n11_0)uz3).r = f5 = ((ca3_0)eA3).h;
            ((n11_0)uz3).s = bl3;
            uz3.c();
            ((n11_0)uz3).m = f5 = ((ca3_0)eA3).c;
            ((n11_0)uz3).s = bl3;
            uz3.c();
            ((n11_0)uz3).n = f5 = ((ca3_0)eA3).d;
            ((n11_0)uz3).s = bl3;
            uz3.c();
            ((n11_0)uz3).f = object = ((ca3_0)eA3).i;
            ((n11_0)uz3).g = bl3;
            uz3.c();
            GA3.a((n11_0)uz3, (ca3_0)eA3);
            n11_02.e(i3, uz3);
        }
    }

    public static final FA3 b(Ke1 object, b30_0 b30_02) {
        Object object2;
        Object object3 = O30.f;
        object3 = (Vo0)b30_02.j((H30)object3);
        float f5 = ((Ke1)object).j;
        float f6 = object3.getDensity();
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        int n3 = 32;
        long l4 = 0xFFFFFFFFL;
        l3 = l3 & l4 | (l2 <<= n3);
        int n4 = b30_02.d(l3);
        Object object4 = b30_02.v();
        if (n4 || object4 == (object2 = b30$a.a)) {
            C63 c63;
            float f7;
            object2 = new n11_0();
            object4 = ((Ke1)object).f;
            GA3.a((n11_0)object2, (ca3_0)object4);
            object4 = Unit.a;
            f6 = ((Ke1)object).b;
            f6 = object3.J0(f6);
            float f8 = ((Ke1)object).c;
            float f11 = object3.J0(f8);
            long l7 = bo1_1.a(f6, f11);
            f11 = ((Ke1)object).d;
            boolean bl2 = Float.isNaN(f11);
            if (bl2) {
                f11 = C63.d(l7);
            }
            if ((n3 = (int)(Float.isNaN(f7 = ((Ke1)object).e) ? 1 : 0)) != 0) {
                f7 = C63.b(l7);
            }
            long l8 = bo1_1.a(f11, f7);
            object3 = new FA3((n11_0)object2);
            long l12 = ((Ke1)object).g;
            long l14 = 16;
            long l15 = l12 - l14;
            n4 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (n4) {
                int n7 = Build.VERSION.SDK_INT;
                int n8 = 29;
                int n10 = ((Ke1)object).h;
                if (n7 >= n8) {
                    c63 = gy_0.a.a(l12, n10);
                } else {
                    n8 = zx_0.i(l12);
                    PorterDuff.Mode mode = Lf.b(n10);
                    c63 = new PorterDuffColorFilter(n8, mode);
                }
                object2 = new ay_1(l12, n10, (ColorFilter)c63);
            } else {
                n4 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            c63 = new C63(l7);
            ((FA3)object3).a.setValue(c63);
            boolean bl3 = ((Ke1)object).i;
            object4 = bl3;
            ((FA3)object3).b.setValue(object4);
            object4 = ((FA3)object3).c;
            ((xa3_1)object4).g.setValue(object2);
            object2 = new C63(l8);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((xa3_1)object4).i;
            parcelableSnapshotMutableState.setValue(object2);
            ((xa3_1)object4).c = object = ((Ke1)object).a;
            b30_02.o(object3);
            object4 = object3;
        }
        return (FA3)object4;
    }
}

