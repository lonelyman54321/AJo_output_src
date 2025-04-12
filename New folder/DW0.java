/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 */
import android.graphics.Rect;
import android.transition.Transition;

public final class DW0
extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect a;

    public DW0(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition2) {
        return this.a;
    }
}

