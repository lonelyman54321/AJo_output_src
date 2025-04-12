/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.BoringLayout
 *  android.text.BoringLayout$Metrics
 *  android.text.Layout$Alignment
 *  android.text.TextPaint
 *  android.text.TextUtils$TruncateAt
 */
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/*
 * Renamed from rz
 */
public final class rz_0 {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int n3, Layout.Alignment alignment, float f5, float f6, BoringLayout.Metrics metrics, boolean bl2, boolean bl3, TextUtils.TruncateAt truncateAt, int n4) {
        BoringLayout boringLayout = new BoringLayout(charSequence, textPaint, n3, alignment, f5, f6, metrics, bl2, truncateAt, n4, bl3);
        return boringLayout;
    }
}

