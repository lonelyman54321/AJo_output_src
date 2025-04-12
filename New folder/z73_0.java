/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 */
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from z73
 */
public final class z73_0
implements RecyclerView$r {
    public final RecyclerView a;
    public float b;
    public float c;

    public z73_0(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.a = recyclerView;
    }

    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(recyclerView, "rv");
        Intrinsics.checkNotNullParameter(motionEvent, "e");
    }

    public final boolean c(RecyclerView object, MotionEvent motionEvent) {
        String string2 = "rv";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "e";
        Intrinsics.checkNotNullParameter(motionEvent, (String)object);
        int n3 = motionEvent.getAction();
        if (n3 != 0) {
            int n4 = 2;
            float f5 = 2.8E-45f;
            if (n3 == n4) {
                float f6 = motionEvent.getX();
                f5 = this.b;
                f6 -= f5;
                float f7 = motionEvent.getY();
                f5 = this.c;
                f7 -= f5;
                float f8 = (f6 = Math.abs(f6)) - (f7 = Math.abs(f7));
                n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                if (n3 > 0 && (object = this.a.getParent()) != null) {
                    boolean bl2 = true;
                    f7 = Float.MIN_VALUE;
                    object.requestDisallowInterceptTouchEvent(bl2);
                }
            }
        } else {
            float f11;
            this.b = f11 = motionEvent.getX();
            this.c = f11 = motionEvent.getY();
        }
        return false;
    }

    public final void e(boolean bl2) {
    }
}

