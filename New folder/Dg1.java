/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.text.Layout
 *  android.text.style.LeadingMarginSpan
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.Intrinsics;

public final class Dg1
implements LeadingMarginSpan {
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int n3, int n4, int n7, int n8, int n10, CharSequence charSequence, int n14, int n15, boolean bl2, Layout layout2) {
        if (layout2 != null && paint != null && (n3 = layout2.getLineForOffset(n14)) == (n4 = layout2.getLineCount() + -1)) {
            n4 = layout2.getEllipsisCount(n3);
            if (n4 > 0) {
                float f5 = Eg1.a(layout2, n3, paint);
                float f6 = Eg1.b(layout2, n3, paint) + f5;
                n3 = 0;
                float f7 = f6 - 0.0f;
                n4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (n4 != 0) {
                    Intrinsics.checkNotNull(canvas);
                    canvas.translate(f6, 0.0f);
                }
            }
        }
    }

    public final int getLeadingMargin(boolean bl2) {
        return 0;
    }
}

