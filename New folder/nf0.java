/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.view.inputmethod.CursorAnchorInfo$Builder
 *  android.view.inputmethod.EditorBoundsInfo
 *  android.view.inputmethod.EditorBoundsInfo$Builder
 */
import android.graphics.RectF;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

public final class nf0 {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, aG2 aG22) {
        EditorBoundsInfo.Builder builder2 = hf0.a();
        RectF rectF = cf_2.f(aG22);
        builder2 = if0.a(builder2, rectF);
        aG22 = cf_2.f(aG22);
        aG22 = kf0.a(jf0_0.a(builder2, (RectF)aG22));
        return lf0.a(builder, (EditorBoundsInfo)aG22);
    }
}

