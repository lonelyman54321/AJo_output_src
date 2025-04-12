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

public final class sz {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int n3, Layout.Alignment alignment, float f5, float f6, BoringLayout.Metrics metrics, boolean bl2, boolean bl3, TextUtils.TruncateAt truncateAt, int n4) {
        return rz_0.a(charSequence, textPaint, n3, alignment, f5, f6, metrics, bl2, bl3, truncateAt, n4);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return pz.a(charSequence, textPaint, textDirectionHeuristic);
    }

    public static final boolean c(BoringLayout boringLayout) {
        return qz.a(boringLayout);
    }
}

