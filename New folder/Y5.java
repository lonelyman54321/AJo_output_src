/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.PopupWindow
 */
import android.view.View;
import android.widget.PopupWindow;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

public final class Y5
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Y5(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (oy1_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                ((oy1_1)object2).hb();
                return;
            }
            case 1: {
                object2 = (px0_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((px0_1)object2).o;
                Intrinsics.checkNotNull(object);
                ((ComponentActivity)object).onBackPressed();
                return;
            }
            case 0: 
        }
        object2 = (PopupWindow)object2;
        Intrinsics.checkNotNullParameter(object2, "$popupWindow");
        object2.dismiss();
    }
}

