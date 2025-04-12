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
import com.ril.ajio.databinding.FragmentDeleteAccountBinding;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wo0
 */
public final class wo0_2
implements View.OnTouchListener {
    public final /* synthetic */ yo0_2 a;

    public /* synthetic */ wo0_2(yo0_2 yo0_22) {
        this.a = yo0_22;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer n3;
        int n4;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = null;
        if (motionEvent != null) {
            n4 = motionEvent.getAction();
            n3 = n4;
        } else {
            n4 = 0;
            n3 = null;
        }
        if (n3 != null && (n4 = n3.intValue()) == 0) {
            object = ((yo0_2)object).a;
            if (object == null) {
                object = "binding";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            object2 = ((FragmentDeleteAccountBinding)object2).tvReason;
            object2.showDropDown();
        }
        boolean bl2 = view != null ? view.onTouchEvent(motionEvent) : true;
        return bl2;
    }
}

