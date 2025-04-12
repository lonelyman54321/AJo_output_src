/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.view.ViewConfiguration
 *  android.view.inputmethod.RemoveSpaceGesture
 */
import android.graphics.PointF;
import android.view.ViewConfiguration;
import android.view.inputmethod.RemoveSpaceGesture;

public final class Cj {
    public static /* bridge */ /* synthetic */ int a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static /* bridge */ /* synthetic */ PointF b(RemoveSpaceGesture removeSpaceGesture) {
        return removeSpaceGesture.getStartPoint();
    }
}

