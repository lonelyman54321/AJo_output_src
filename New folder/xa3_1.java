/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xA3
 */
public final class xa3_1
extends Uz3 {
    public final n11_0 b;
    public String c;
    public boolean d;
    public final ct0 e;
    public Function0 f;
    public final ParcelableSnapshotMutableState g;
    public ay_1 h;
    public final ParcelableSnapshotMutableState i;
    public long j;
    public float k;
    public float l;
    public final xA3$b m;

    public xa3_1(n11_0 object) {
        float f5;
        this.b = object;
        xA3$a xA3$a = new xA3$a(this);
        ((n11_0)object).i = xA3$a;
        this.c = "";
        this.d = true;
        this.e = object = new ct0();
        this.f = object = xA3$c.c;
        this.g = object = J83.g(null);
        object = new C63(0L);
        this.i = object = J83.g(object);
        this.j = 9205357640488583168L;
        this.k = f5 = 1.0f;
        this.l = f5;
        this.m = object = new xA3$b(this);
    }

    public final void a(Kt0 kt0) {
        this.e(kt0, 1.0f, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void e(Kt0 kt0, float f5, TX tX) {
        TX tX3;
        long l2;
        Object object;
        Object object2;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        Kt0 kt02;
        xa3_1 xa3_12;
        block17: {
            long l3;
            bp1_0 bp1_02;
            float f6;
            int n3;
            Object object3;
            Object object4;
            long l4;
            ct0 ct02;
            block19: {
                int n4;
                void var7_26;
                float f7;
                int n7;
                block18: {
                    long l7;
                    void var6_9;
                    float f8;
                    long l8;
                    int n8;
                    n11_0 n11_02;
                    block16: {
                        boolean bl2;
                        boolean bl3;
                        long l12;
                        long l14;
                        long l15;
                        long l16;
                        xa3_12 = this;
                        kt02 = kt0;
                        n11_02 = this.b;
                        boolean bl4 = n11_02.d;
                        parcelableSnapshotMutableState = this.g;
                        n7 = 1;
                        f7 = Float.MIN_VALUE;
                        if (bl4 && (l16 = (l15 = (l14 = n11_02.e) - (l12 = (long)16)) == 0L ? 0 : (l15 < 0L ? -1 : 1)) != false && (bl3 = DA3.a((TX)(object2 = (TX)parcelableSnapshotMutableState.getValue()))) && (bl2 = DA3.a(tX))) {
                            boolean bl5 = true;
                        } else {
                            boolean bl6 = false;
                            object2 = null;
                        }
                        n8 = xa3_12.d;
                        ct02 = xa3_12.e;
                        if (n8 != 0 || (n8 = C63.a(l4 = xa3_12.j, l8 = kt0.l())) == 0) break block16;
                        object4 = ct02.a;
                        if (object4 != null) {
                            n8 = ((ih_0)object4).b();
                        } else {
                            n8 = 0;
                            f8 = 0.0f;
                            object4 = null;
                        }
                        n8 = (int)(id1_0.a((int)var7_26, n8) ? 1 : 0);
                        if (n8 == 0) break block16;
                        object = ct02;
                        break block17;
                    }
                    if ((n7 = (int)(id1_0.a((int)var7_26, n7) ? 1 : 0)) != 0) {
                        l4 = n11_02.e;
                        n7 = Build.VERSION.SDK_INT;
                        n8 = 29;
                        f8 = 4.1E-44f;
                        int n10 = 5;
                        if (n7 >= n8) {
                            object3 = gy_0.a.a(l4, n10);
                        } else {
                            n8 = zx_0.i(l4);
                            PorterDuff.Mode mode = Lf.b(n10);
                            object3 = new PorterDuffColorFilter(n8, mode);
                        }
                        ay_1 ay_12 = new ay_1(l4, n10, (ColorFilter)object3);
                    } else {
                        n3 = 0;
                        f6 = 0.0f;
                        Object var6_8 = null;
                    }
                    xa3_12.h = var6_9;
                    f6 = C63.d(kt0.l());
                    object3 = xa3_12.i;
                    f8 = C63.d(((C63)((h83_0)object3).getValue()).a);
                    xa3_12.k = f6 /= f8;
                    f6 = C63.b(kt0.l());
                    f7 = C63.b(((C63)((h83_0)object3).getValue()).a);
                    xa3_12.l = f6 /= f7;
                    f6 = (float)Math.ceil(C63.d(kt0.l()));
                    n3 = (int)f6;
                    double d2 = Math.ceil(C63.b(kt0.l()));
                    f7 = (float)d2;
                    n7 = (int)f7;
                    l4 = dj1.a(n3, n7);
                    bp1_02 = kt0.getLayoutDirection();
                    ct02.c = kt02;
                    object3 = ct02.a;
                    object4 = ct02.b;
                    l8 = 0xFFFFFFFFL;
                    int n14 = 32;
                    if (object3 == null || object4 == null) break block18;
                    object = object4;
                    long l17 = l4 >> n14;
                    n8 = (int)l17;
                    Bitmap bitmap = ((ih_0)object3).a;
                    int n15 = bitmap.getWidth();
                    if (n8 <= n15 && (n15 = (int)(l7 = l4 & l8)) <= (n4 = bitmap.getHeight()) && (n4 = (int)(id1_0.a(ct02.e, (int)var7_26) ? 1 : 0)) != 0) break block19;
                }
                n7 = 32;
                f7 = 4.5E-44f;
                l2 = l4 >> n7;
                n4 = (int)l2;
                n7 = (int)(l8 &= l4);
                object3 = xj2_2.b(n4, n7, (int)var7_26);
                object4 = BL.a((ih_0)object3);
                ct02.a = object3;
                ct02.b = object4;
                ct02.e = var7_26;
            }
            ct02.d = l4;
            l4 = dj1.b(l4);
            object2 = ct02.f;
            xL$a xL$a = ((xl_0)object2).a;
            Vo0 vo0 = xL$a.a;
            bp1_0 bp1_03 = xL$a.b;
            iL iL2 = xL$a.c;
            object = ct02;
            long l18 = xL$a.d;
            xL$a.a = kt02;
            xL$a.b = bp1_02;
            xL$a.c = object4;
            xL$a.d = l4;
            ((mf_0)object4).p();
            long l19 = OX.b;
            long l20 = 0L;
            int n16 = 62;
            Jt0.j((Kt0)object2, l19, l20, 0.0f, null, n16);
            xa3_12.m.invoke(object2);
            ((mf_0)object4).h();
            xL$a xL$a2 = ((xl_0)object2).a;
            xL$a2.a = vo0;
            xL$a2.b = bp1_03;
            xL$a2.c = iL2;
            xL$a2.d = l18;
            ((ih_0)object3).a();
            n3 = 0;
            f6 = 0.0f;
            Object var6_12 = null;
            xa3_12.d = false;
            xa3_12.j = l3 = kt0.l();
        }
        if (tX != null) {
            tX3 = tX;
        } else {
            void var6_17;
            TX tX4 = (TX)parcelableSnapshotMutableState.getValue();
            if (tX4 != null) {
                TX tX5 = (TX)parcelableSnapshotMutableState.getValue();
            } else {
                ay_1 ay_13 = xa3_12.h;
            }
            tX3 = var6_17;
        }
        ct0 ct03 = object;
        object2 = ((ct0)object).a;
        if (object2 == null) {
            bh1_1.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
            throw null;
        }
        l2 = ((ct0)object).d;
        kt02 = kt0;
        Object object5 = object2;
        long l21 = 0L;
        Jt0.d(kt0, (hd1_0)object2, l21, l2, 0L, f5, tX3, 0, 858);
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("Params: \tname: ");
        Object object = this.c;
        charSequence.append((String)object);
        charSequence.append("\n\tviewportWidth: ");
        object = this.i;
        float f5 = C63.d(((C63)((h83_0)object).getValue()).a);
        charSequence.append(f5);
        charSequence.append("\n\tviewportHeight: ");
        float f6 = C63.b(((C63)((h83_0)object).getValue()).a);
        charSequence.append(f6);
        charSequence.append("\n");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

