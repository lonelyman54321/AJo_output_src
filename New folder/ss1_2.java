/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.jio.jioads.carousel.data.a;
import com.jio.jioads.carousel.view.d;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from sS1
 */
public final class ss1_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ss1_2(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View object) {
        int n3 = 1;
        Object object2 = this.c;
        Object[] objectArray = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object3 = (d)object3;
                Intrinsics.checkNotNullParameter(object3, (String)objectArray);
                object2 = (a)object2;
                Intrinsics.checkNotNullParameter(object2, "$item");
                ((d)object3).d.invoke(object2);
                return;
            }
            case 0: 
        }
        object3 = (CouponEntity)object3;
        Intrinsics.checkNotNullParameter(object3, "$entity");
        object2 = (ts1_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)objectArray);
        object = object.getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.content.ClipboardManager");
        object = (ClipboardManager)object;
        object3 = ((CouponEntity)object3).getCouponCode();
        objectArray = ClipData.newPlainText((CharSequence)"copied", (CharSequence)object3);
        object.setPrimaryClip((ClipData)objectArray);
        object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_alert_message);
        objectArray = new Object[n3];
        objectArray[0] = "Coupon copied";
        object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
        ((ts1_2)object2).a.l1((String)object);
    }
}

