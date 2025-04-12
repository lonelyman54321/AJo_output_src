/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristic
 *  android.text.TextUtils$TruncateAt
 */
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;

/*
 * Renamed from fc3
 */
public final class fc3_1
implements tc3_0 {
    public final boolean a(StaticLayout staticLayout, boolean bl2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            bl2 = qc3_2.a(staticLayout);
        } else {
            int n7 = 28;
            if (n3 < n7) {
                bl2 = false;
            }
        }
        return bl2;
    }

    public StaticLayout b(uc3_0 uc3_02) {
        CharSequence charSequence = uc3_02.a;
        Object object = uc3_02.d;
        int n3 = uc3_02.e;
        int n4 = uc3_02.b;
        int n7 = uc3_02.c;
        charSequence = Vb3.a(charSequence, n4, n7, object, n3);
        object = uc3_02.f;
        Dn.a((StaticLayout.Builder)charSequence, (TextDirectionHeuristic)object);
        object = uc3_02.g;
        Yb3.a((StaticLayout.Builder)charSequence, (Layout.Alignment)object);
        int n8 = uc3_02.h;
        Zb3.a((StaticLayout.Builder)charSequence, n8);
        object = uc3_02.i;
        ac3.a((StaticLayout.Builder)charSequence, (TextUtils.TruncateAt)object);
        n8 = uc3_02.j;
        bc3_0.a((StaticLayout.Builder)charSequence, n8);
        float f5 = uc3_02.l;
        float f6 = uc3_02.k;
        cc3.b((StaticLayout.Builder)charSequence, f5, f6);
        n8 = (int)(uc3_02.n ? 1 : 0);
        dc3_1.a((StaticLayout.Builder)charSequence, n8 != 0);
        n8 = uc3_02.p;
        ec3.a((StaticLayout.Builder)charSequence, n8);
        n8 = uc3_02.s;
        Wb3.a((StaticLayout.Builder)charSequence, n8);
        object = uc3_02.t;
        int[] nArray = uc3_02.u;
        je0_2.c((StaticLayout.Builder)charSequence, (int[])object, nArray);
        n8 = Build.VERSION.SDK_INT;
        n3 = 26;
        f6 = 3.6E-44f;
        if (n8 >= n3) {
            n3 = uc3_02.m;
            hc3.a((StaticLayout.Builder)charSequence, n3);
        }
        n3 = 28;
        f6 = 3.9E-44f;
        if (n8 >= n3) {
            n3 = (int)(uc3_02.o ? 1 : 0);
            jc3_1.a((StaticLayout.Builder)charSequence, n3 != 0);
        }
        n3 = 33;
        f6 = 4.6E-44f;
        if (n8 >= n3) {
            n8 = uc3_02.q;
            int n10 = uc3_02.r;
            qc3_2.b((StaticLayout.Builder)charSequence, n8, n10);
        }
        return Xb3.a((StaticLayout.Builder)charSequence);
    }
}

