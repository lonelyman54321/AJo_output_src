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

/*
 * Renamed from Dj
 */
public final class dj_0 {
    public static /* bridge */ /* synthetic */ int a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static /* bridge */ /* synthetic */ PointF b(RemoveSpaceGesture removeSpaceGesture) {
        return removeSpaceGesture.getEndPoint();
    }
}

