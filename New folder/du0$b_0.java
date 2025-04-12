/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Handler
 */
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from du0$b
 */
public final class du0$b_0
implements Drawable.Callback {
    public final /* synthetic */ du0_2 a;

    public du0$b_0(du0_2 du0_22) {
        this.a = du0_22;
    }

    public final void invalidateDrawable(Drawable object) {
        long l2;
        Intrinsics.checkNotNullParameter(object, "d");
        object = this.a;
        int n3 = object.b.o() + 1;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = object.b;
        parcelableSnapshotMutableIntState.e(n3);
        rq1_2 rq1_22 = fu0_2.a;
        rq1_22 = object.a;
        int n4 = rq1_22.getIntrinsicWidth();
        if (n4 >= 0 && (n4 = rq1_22.getIntrinsicHeight()) >= 0) {
            n4 = rq1_22.getIntrinsicWidth();
            float f5 = n4;
            n3 = rq1_22.getIntrinsicHeight();
            float f6 = n3;
            l2 = bo1_1.a(f5, f6);
        } else {
            l2 = 9205357640488583168L;
        }
        C63 c63 = new C63(l2);
        object.c.setValue(c63);
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        Intrinsics.checkNotNullParameter(drawable2, "d");
        Intrinsics.checkNotNullParameter(runnable2, "what");
        ((Handler)fu0_2.a.getValue()).postAtTime(runnable2, l2);
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(drawable2, "d");
        Intrinsics.checkNotNullParameter(runnable2, "what");
        ((Handler)fu0_2.a.getValue()).removeCallbacks(runnable2);
    }
}

