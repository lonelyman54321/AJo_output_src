/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.BoringLayout
 *  android.text.BoringLayout$Metrics
 *  android.text.Layout$Alignment
 *  android.text.TextDirectionHeuristic
 *  android.text.TextPaint
 *  android.text.TextUtils$TruncateAt
 */
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

public final class tz {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int n3, Layout.Alignment alignment, float f5, float f6, BoringLayout.Metrics metrics, boolean bl2, TextUtils.TruncateAt truncateAt, int n4) {
        BoringLayout boringLayout = new BoringLayout(charSequence, textPaint, n3, alignment, f5, f6, metrics, bl2, truncateAt, n4);
        return boringLayout;
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        int n3 = charSequence.length();
        boolean bl2 = textDirectionHeuristic.isRtl(charSequence, 0, n3);
        n3 = 0;
        if (!bl2) {
            return BoringLayout.isBoring((CharSequence)charSequence, (TextPaint)textPaint, null);
        }
        return null;
    }
}

