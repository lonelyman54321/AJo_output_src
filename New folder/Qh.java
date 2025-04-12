/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.text.Layout$TextInclusionStrategy
 */
import android.graphics.RectF;
import android.text.Layout;
import kotlin.jvm.functions.Function2;

public final class Qh
implements Layout.TextInclusionStrategy {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ Qh(Function2 function2) {
        this.a = function2;
    }

    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return (Boolean)this.a.invoke(rectF, rectF2);
    }
}

