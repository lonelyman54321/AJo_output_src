/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Jh0
 */
public final class jh0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                NativeAdViewRenderer.j((NativeAdViewRenderer)object);
                return;
            }
            case 0: 
        }
        object = (LinearLayout)object;
        Intrinsics.checkNotNullParameter(object, "$parentLyt");
        Object object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_info_popup);
        String string2 = hv3_0.K(R$string.what_is_cvv_number);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        zw_0.a(objectArray, n3, (String)object2, "format(...)", (LinearLayout)object);
        ai0_2.a((View)object);
    }
}

