/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.timepicker.MaterialTimePicker;
import kotlin.jvm.internal.Intrinsics;

public final class Ox0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ Ox0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                MaterialTimePicker.Oa((MaterialTimePicker)object);
                return;
            }
            case 0: 
        }
        object = (px0_1)object;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((px0_1)object).C;
        if (object != null && (object = object.getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }
}

