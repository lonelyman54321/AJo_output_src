/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.text.Layout
 *  android.text.Layout$TextInclusionStrategy
 *  android.text.SegmentFinder
 */
import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

public final class Nh {
    public static /* bridge */ /* synthetic */ int[] a(Layout layout2, RectF rectF, SegmentFinder segmentFinder, Qh qh) {
        return layout2.getRangeForRect(rectF, segmentFinder, (Layout.TextInclusionStrategy)qh);
    }
}

