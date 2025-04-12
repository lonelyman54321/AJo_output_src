/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Order.RtoResponseData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wf2
 */
public final class wf2_0
extends d61_0 {
    public static final Wf2$a Companion;

    static {
        Wf2$a wf2$a;
        Companion = wf2$a = new Object();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.Qa();
        Object object2 = this.getArguments();
        Object object3 = null;
        if (object2 != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object2 = (Parcelable)J81.a(object2);
            } else {
                String string2 = "rto_data";
                n3 = (object2 = object2.getParcelable(string2)) instanceof RtoResponseData;
                if (n3 != 0) {
                    object3 = object2;
                }
                object2 = object3;
                object2 = (RtoResponseData)object3;
            }
            object3 = object2;
            object3 = (RtoResponseData)object2;
        }
        object.d = object3;
        int n7 = R$layout.rto_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n7, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        this.Ra((View)object);
        object = this.Qa().f;
        object2 = this.getViewLifecycleOwner();
        vf2_0 vf2_02 = new vf2_0(this);
        Wf2$b wf2$b = new Wf2$b(vf2_02);
        ((LiveData)object).e((mu1_1)object2, wf2$b);
    }
}

