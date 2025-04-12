/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from GD3
 */
public final class gd3_0
implements Function1 {
    public final /* synthetic */ id3_1 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ HD3 c;

    public gd3_0(id3_1 id3_12, ViewTreeObserver viewTreeObserver, HD3 hD3) {
        this.a = id3_12;
        this.b = viewTreeObserver;
        this.c = hD3;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.b;
        boolean bl2 = object.isAlive();
        HD3 hD3 = this.c;
        if (bl2) {
            object.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)hD3);
        } else {
            object = this.a.getView().getViewTreeObserver();
            object.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)hD3);
        }
        return Unit.a;
    }
}

