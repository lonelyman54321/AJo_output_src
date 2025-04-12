/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.e;
import com.ril.ajio.services.data.EditProfileData;
import com.ril.ajio.utility.validators.Validator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZM
 */
public final class zm_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zm_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = ReturnImpsActivity.G0;
                object2 = (ReturnImpsActivity)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                e.Companion.getClass();
                object = e.m;
                Object object3 = ((ReturnImpsActivity)object2).x0;
                Object object4 = null;
                if (object3 != null) {
                    object3 = object3.getTag();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                boolean bl2 = Intrinsics.areEqual(object, object3);
                if (bl2) {
                    bl2 = ((ReturnImpsActivity)object2).Z;
                    if (bl2) {
                        object = new Intent();
                        n3 = -1;
                        object2.setResult(n3, (Intent)object);
                        object2.finish();
                    } else {
                        object2.finish();
                    }
                } else {
                    object = ((ReturnImpsActivity)object2).r0;
                    if (object != null) {
                        object4 = object;
                    } else {
                        object = "impsViewModel";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    }
                    object = ((wf1_2)object4).h;
                    object2 = Boolean.TRUE;
                    ((LiveData)object).k(object2);
                }
                return;
            }
            case 1: {
                object2 = (px0_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((px0_1)object2).n;
                if (object == null) {
                    object = ((px0_1)object2).a;
                    if (object != null) {
                        object = ((fv0_2)object).a;
                        ((Validator)object).e();
                    }
                } else {
                    ((px0_1)object2).Pa((EditProfileData)object);
                }
                return;
            }
            case 0: 
        }
        object2 = (bn_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        ((BottomSheetDialogFragment)object2).dismiss();
    }
}

