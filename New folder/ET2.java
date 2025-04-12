/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.view.ScrollCaptureCallback
 *  android.view.ScrollCaptureTarget
 *  android.view.View
 */
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;

public final class ET2 {
    public static /* synthetic */ ScrollCaptureTarget a(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
        return scrollCaptureTarget;
    }
}

