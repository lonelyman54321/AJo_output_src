/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kx0
 */
public final class kx0_0
implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kx0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl2 = true;
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (az1_2)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Intrinsics.checkNotNull(view);
                ai0_2.j(view);
                ((az1_2)object).Ua();
                return bl2;
            }
            case 0: 
        }
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "$view");
        ai0_2.j((View)object);
        return bl2;
    }
}

