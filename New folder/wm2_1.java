/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from WM2
 */
public final class wm2_1
implements View.OnClickListener {
    public final /* synthetic */ zm2_2 a;

    public /* synthetic */ wm2_1(zm2_2 zm2_22) {
        this.a = zm2_22;
    }

    public final void onClick(View object) {
        int n3 = 0;
        object = null;
        int n4 = 1;
        Object object2 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n7 = ((zm2_2)object2).Oa();
        Object[] objectArray = null;
        if (n7 > n4 && (n7 = (int)(((zm2_2)object2).o ? 1 : 0)) != 0) {
            boolean bl2;
            object3 = ((zm2_2)object2).p.iterator();
            while (bl2 = object3.hasNext()) {
                Object object4 = object3.next();
                int n8 = n3 + 1;
                if (n3 >= 0) {
                    object4 = (fn2_1)object4;
                    bl2 = ((fn2_1)object4).d;
                    if (bl2 && (object4 = ((zm2_2)object2).a) != null) {
                        object4.v0(n3);
                    }
                    n3 = n8;
                    continue;
                }
                xx_2.n();
                throw null;
            }
            ((BottomSheetDialogFragment)object2).dismiss();
        } else {
            n7 = ((zm2_2)object2).Oa();
            int n10 = 2;
            String string2 = "format(...)";
            Object[] objectArray2 = "getString(...)";
            if (n7 < n10) {
                n7 = R$string.return_image_upload_toast_msg_1;
                object3 = ((Fragment)object2).getString(n7);
                Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray2);
                Object object5 = StringCompanionObject.INSTANCE;
                n10 = R$string.acc_alert_message;
                object5 = hv3_0.K(n10);
                objectArray2 = new Object[n4];
                objectArray2[0] = object3;
                Object object6 = Arrays.copyOf(objectArray2, n4);
                object6 = String.format((String)object5, object6);
                Intrinsics.checkNotNullExpressionValue(object6, string2);
                mq0_2.b((String)object3, (String)object6);
                object6 = ((zm2_2)object2).i;
                if (object6 == null) {
                    object6 = "tvErrorImage";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    objectArray = object6;
                }
                objectArray.setVisibility(0);
            } else {
                n7 = (int)(((zm2_2)object2).o ? 1 : 0);
                if (n7 == 0) {
                    n7 = R$string.return_image_upload_toast_msg_2;
                    object2 = ((Fragment)object2).getString(n7);
                    Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray2);
                    object3 = StringCompanionObject.INSTANCE;
                    n7 = R$string.acc_alert_message;
                    object3 = hv3_0.K(n7);
                    objectArray = new Object[n4];
                    objectArray[0] = object2;
                    object = Arrays.copyOf(objectArray, n4);
                    object = String.format((String)object3, object);
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    mq0_2.b((String)object2, (String)object);
                }
            }
        }
    }
}

