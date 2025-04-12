/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup$LayoutParams
 */
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class X8
implements Runnable {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ X8(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void run() {
        String string2;
        int n3 = 1;
        boolean bl2 = false;
        Object object = null;
        Object object2 = q9_0.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = od3_2.a;
        int n4 = object3.length();
        if (n4 == 0) {
            object3 = od3_2.a();
        }
        ld3_2 ld3_22 = ld3_2.STORE_LUXE;
        Object object4 = ld3_22.getStoreId();
        int n7 = Intrinsics.areEqual(object3, object4);
        object4 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        Object object5 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams";
        Object object6 = null;
        if (n7 != 0) {
            float f5;
            object3 = ((q9_0)object2).Q1;
            if (object3 != null) {
                object3 = object3.getLayoutParams();
            } else {
                n7 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            Intrinsics.checkNotNull(object3, object5);
            object3 = (CoordinatorLayout$e)((Object)object3);
            object3.setMargins(0, 0, 0, 0);
            object5 = ((q9_0)object2).Q1;
            if (object5 != null) {
                object5.setLayoutParams((ViewGroup.LayoutParams)object3);
            }
            n7 = 1130758144;
            f5 = hv3_0.x(230.0f);
            object5 = ((q9_0)object2).R1;
            if (object5 != null) {
                object6 = object5.getLayoutParams();
            }
            Intrinsics.checkNotNull(object6, (String)object4);
            object6 = (ConstraintLayout$LayoutParams)((Object)object6);
            n7 = (int)f5;
            object6.setMargins(0, n7, 0, 0);
            object3 = ((q9_0)object2).R1;
            if (object3 != null) {
                object3.setLayoutParams(object6);
            }
        } else {
            float f6;
            object3 = ((q9_0)object2).Q1;
            if (object3 != null) {
                object3 = object3.getLayoutParams();
            } else {
                n7 = 0;
                object3 = null;
                f6 = 0.0f;
            }
            Intrinsics.checkNotNull(object3, object5);
            object3 = (CoordinatorLayout$e)((Object)object3);
            object3.setMargins(0, 0, 0, 0);
            object5 = ((q9_0)object2).Q1;
            if (object5 != null) {
                object5.setLayoutParams((ViewGroup.LayoutParams)object3);
            }
            if ((object5 = ((q9_0)object2).x1) != null) {
                object5.setLayoutParams((ViewGroup.LayoutParams)object3);
            }
            n7 = 1133084672;
            f6 = hv3_0.x(275.0f);
            object5 = ((q9_0)object2).R1;
            if (object5 != null) {
                object6 = object5.getLayoutParams();
            }
            Intrinsics.checkNotNull(object6, (String)object4);
            object6 = (ConstraintLayout$LayoutParams)((Object)object6);
            n7 = (int)f6;
            object6.setMargins(0, n7, 0, 0);
            object3 = ((q9_0)object2).R1;
            if (object3 != null) {
                object3.setLayoutParams(object6);
            }
        }
        object3 = h40_0.a;
        object3 = h40_0.H0(od3_2.a());
        if (object3 != null && (object4 = ((q9_0)object2).T1) != null) {
            object5 = ((q9_0)object2).R1;
            if (object5 != null) {
                object6 = StringCompanionObject.INSTANCE;
                object6 = object4.getContext();
                int n8 = R$string.acc_error_popup;
                object6 = object6.getString(n8);
                Intrinsics.checkNotNullExpressionValue(object6, "getString(...)");
                Object[] objectArray = new Object[n3];
                objectArray[0] = object3;
                object = "format(...)";
                an_1.a(objectArray, n3, (String)object6, (String)object, (ConstraintLayout)((Object)object5));
            }
            object4.setText((CharSequence)object3);
        }
        if ((string2 = h40_0.G0(od3_2.a())) != null && (object = ((q9_0)object2).S1) != null) {
            object3 = ((AppCompatTextView)object).getText();
            object5 = "error description ";
            object4 = new StringBuilder((String)object5);
            ((StringBuilder)object4).append(object3);
            object3 = ((StringBuilder)object4).toString();
            object.setContentDescription((CharSequence)object3);
            object.setText((CharSequence)string2);
        }
        if ((string2 = h40_0.F0(od3_2.a())) != null && (object = ((q9_0)object2).U1) != null) {
            object = od3_2.a;
            n7 = ((String)object).length();
            if (n7 == 0) {
                object = od3_2.a();
            }
            if (bl2 = Intrinsics.areEqual(object, object3 = ld3_22.getStoreId())) {
                object = ((q9_0)object2).V1;
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
            } else {
                object = ((q9_0)object2).U1;
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
            }
            if ((n7 = ((String)(object = od3_2.a)).length()) == 0) {
                object = od3_2.a();
            }
            if (bl2 = Intrinsics.areEqual(object, object3 = ld3_22.getStoreId())) {
                object = ((q9_0)object2).V1;
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
            } else {
                object = ((q9_0)object2).U1;
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
            }
        }
    }
}

