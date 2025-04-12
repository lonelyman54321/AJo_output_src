/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.inputmethod.CursorAnchorInfo$Builder
 */
import android.view.inputmethod.CursorAnchorInfo;

/*
 * Renamed from qf0
 */
public final class qf0_0 {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, Tl3 tl3, aG2 aG22) {
        float f5;
        RQ1 rQ1;
        int n3;
        float f6;
        RQ1 rQ12;
        int n4 = aG22.f();
        if (n4 == 0 && (n4 = (rQ12 = tl3.b).c(f6 = aG22.b)) <= (n3 = (rQ1 = tl3.b).c(f5 = aG22.d))) {
            while (true) {
                float f7 = tl3.g(n4);
                float f8 = rQ1.d(n4);
                float f11 = tl3.h(n4);
                float f12 = rQ1.b(n4);
                of0.a(builder, f7, f8, f11, f12);
                if (n4 == n3) break;
                ++n4;
            }
        }
        return builder;
    }
}

