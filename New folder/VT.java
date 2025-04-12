/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.os.Handler;
import android.os.Looper;
import android.widget.CompoundButton;
import kotlin.jvm.internal.Intrinsics;

public final class VT
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ wt_0 a;

    public /* synthetic */ VT(wt_0 wt_02) {
        this.a = wt_02;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = "Payments";
        if (bl2) {
            Object object3 = object.f;
            boolean bl3 = false;
            String string2 = null;
            object3.setVisibility(0);
            object3 = object.d;
            if (object3 != null) {
                string2 = "Open";
                object3.w6(string2, (String)object2);
            }
        } else {
            Object object4 = object.f;
            int n3 = 8;
            object4.setVisibility(n3);
            object4 = object.d;
            if (object4 != null) {
                String string3 = "Close";
                object4.w6(string3, (String)object2);
            }
        }
        if ((object2 = object.d) != null) {
            object2.onPaymentToggleChange(bl2);
        }
        object2 = Looper.getMainLooper();
        Handler handler = new Handler((Looper)object2);
        object2 = new Uo(object, 1);
        handler.postDelayed((Runnable)object2, 200L);
    }
}

