/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from f92
 */
public class f92_0
implements View.OnTouchListener {
    public static final f92$a Companion;
    public final GestureDetector a;
    public float b;
    public float c;
    public long d;

    static {
        f92$a f92$a;
        Companion = f92$a = new Object();
    }

    public f92_0(Activity activity) {
        GestureDetector gestureDetector;
        Intrinsics.checkNotNullParameter(activity, "context");
        f92$b f92$b = new f92$b(this);
        this.a = gestureDetector = new GestureDetector((Context)activity, (GestureDetector.OnGestureListener)f92$b);
    }

    public void a(View view) {
        throw null;
    }

    public void b() {
        throw null;
    }

    public void c() {
        throw null;
    }

    public void d(View view, MotionEvent motionEvent) {
        throw null;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "event";
        Intrinsics.checkNotNullParameter(motionEvent, string2);
        this.d(view, motionEvent);
        int n3 = motionEvent.getAction();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                float f5 = motionEvent.getX();
                float f6 = motionEvent.getY();
                float f7 = this.b;
                float f8 = this.c;
                long l2 = System.currentTimeMillis();
                long l3 = this.d;
                long l4 = (l2 -= l3) - (l3 = 200L);
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                boolean bl2 = object < 0;
                f5 = Math.abs(f5 - f7);
                float f11 = (f6 = Math.abs(f6 - f8) + f5) - (f5 = 150.0f);
                n3 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
                if (n3 >= 0) {
                    n4 = 0;
                }
                if (bl2 && n4 != 0) {
                    this.a(view);
                }
            }
        } else {
            float f12;
            long l7;
            this.d = l7 = System.currentTimeMillis();
            this.b = f12 = motionEvent.getX();
            this.c = f12 = motionEvent.getY();
        }
        return this.a.onTouchEvent(motionEvent);
    }
}

