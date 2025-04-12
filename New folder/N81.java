/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 */
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$layout;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class N81
extends z51_0 {
    public static final N81$a Companion;

    static {
        N81$a n81$a;
        Companion = n81$a = new Object();
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
        ((lq2_0)object).d = object3;
        object = "home landing screen";
        object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.y = object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.z = object;
        object = od3_2.a;
        int n7 = ((String)object).length();
        if (n7 == 0) {
            object = od3_2.a();
        }
        object2 = ld3_2.STORE_LUXE.getStoreId();
        int n8 = Intrinsics.areEqual(object, object2);
        n7 = 0;
        object2 = null;
        if (n8 != 0) {
            n8 = R$layout.rto_bottom_sheet_luxe;
            layoutInflater = layoutInflater.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNull(layoutInflater);
        } else {
            n8 = R$layout.rto_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNull(layoutInflater);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        this.Ra((View)object);
        EQ2.a = bl2 = true;
        object = this.Qa().f;
        object2 = this.getViewLifecycleOwner();
        Object object3 = new K81(this, 0);
        Object object4 = new N81$b((K81)object3);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.Qa().l;
        boolean bl3 = false;
        object2 = null;
        if (object != null) {
            object = ((RtoFirebaseData)object).isDialogCancelable();
            object3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object, object3);
        } else {
            bl2 = false;
            object = null;
        }
        if (bl2) {
            object = this.u;
            if (object != null) {
                ai0_2.B((View)object);
            }
        } else {
            object = this.u;
            if (object != null) {
                ai0_2.i((View)object);
            }
        }
        if ((object = this.Qa().l) != null) {
            object = ((RtoFirebaseData)object).isDialogCancelable();
            object2 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(object, object2);
        }
        this.setCancelable(bl3);
        object = this.u;
        if (object != null) {
            object3 = null;
            object2 = new L81(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.t) != null) {
            object2 = new M81(this);
            Intrinsics.checkNotNullParameter(object, "<this>");
            Intrinsics.checkNotNullParameter(object2, "afterTextChanged");
            object3 = new Object();
            object4 = new Object();
            ai0_2.n((EditText)object, (Function1)object2, (hx0_2)object3, (hx0_2)object4);
        }
    }
}

