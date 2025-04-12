/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.user.GPSLocationData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ff0
 */
public final class ff0_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public ImageView a;
    public View b;
    public View c;
    public Button d;
    public Button e;
    public TextView f;
    public TextView g;
    public j82_0 h;
    public zm_2 i;
    public ChangeLocationListener j;
    public hy3_0 k;
    public double l;
    public double m;
    public boolean n;

    public final void onClick(View object) {
        int n3;
        int n4;
        boolean bl2 = false;
        Object object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.close_dialog;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            this.dismissAllowingStateLoss();
        } else {
            int n8;
            n7 = R$id.editButton;
            String string2 = "tvPinCode";
            if (object != null && (n8 = ((Integer)object).intValue()) == n7) {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                object = ((Object)object2.getText()).toString();
                object2 = this.i;
                if (object2 != null) {
                    object2.q4((String)object);
                }
                this.dismissAllowingStateLoss();
            } else {
                n7 = R$id.confirmButton;
                if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                    object = this.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object2 = object;
                    }
                    object = ((Object)object2.getText()).toString();
                    bl2 = this.n;
                    String string3 = "";
                    if (bl2) {
                        object2 = this.h;
                        if (object2 != null) {
                            object2.loadCartBasedOnSelectedAddress((String)object, string3);
                        }
                    } else {
                        object2 = this.j;
                        if (object2 != null) {
                            object2.loadCartBasedOnSelectedAddress((String)object, string3);
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$style.BottomSheetDialogThemeNoFloating;
        this.setStyle(0, n3);
        object = kd3_2.a();
        Object object2 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
        Object object3 = new UserRepo((Application)object2);
        object2 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object3;
        ((kd3_2)object).b = object2;
        object2 = this.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object2, "getApplicationContext(...)");
        object3 = new jo_2((Context)object2);
        Intrinsics.checkNotNull(object);
        object3 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object2 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        rd3_0 rd3_02 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object3 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
        object2 = hy3_0.class;
        String string2 = "modelClass";
        object = im_1.a(rd3_02, (kd3_2)object, (Wd0)object3, (Class)object2, string2);
        object3 = ef0_0.a((Class)object2, string2, string2, "<this>");
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            this.k = object = (hy3_0)((pD3)object).a((yn1_2)object3, (String)object2);
            return;
        }
        object3 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        cf0_1 cf0_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)cf0_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.cart_location_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.cart_location_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        boolean bl2;
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.close_dialog;
        object2 = (ImageView)object.findViewById(n4);
        Object object4 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        this.a = object2;
        n4 = R$id.fetchingLocationLayout;
        object2 = object.findViewById(n4);
        this.b = object2;
        n4 = R$id.locationDetailsLayout;
        object2 = object.findViewById(n4);
        this.c = object2;
        n4 = R$id.editButton;
        object2 = (Button)object.findViewById(n4);
        this.d = object2;
        n4 = R$id.confirmButton;
        object2 = (Button)object.findViewById(n4);
        this.e = object2;
        n4 = R$id.tv_pinCode;
        object2 = (TextView)object.findViewById(n4);
        this.f = object2;
        n4 = R$id.tv_address;
        object2 = (TextView)object.findViewById(n4);
        this.g = object2;
        n4 = R$id.tv_fetching_location;
        object2 = (TextView)object.findViewById(n4);
        n4 = R$id.loadingIcon;
        object2 = (ImageView)object.findViewById(n4);
        n4 = R$id.fetchingProgressBar;
        object2 = (ProgressBar)object.findViewById(n4);
        n4 = R$id.iv_back_click;
        object = (ImageView)object.findViewById(n4);
        if (object != null) {
            object2 = new df0_2(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object = this.a;
        n4 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeDialog");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editButton");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.e;
        object4 = "confirmButton";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        n3 = og1_1.c();
        if (n3 != 0) {
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            bl2 = true;
            object.setAllCaps(bl2);
        }
        object = this.k;
        bl2 = false;
        object4 = null;
        if (object != null) {
            GPSLocationData gPSLocationData;
            double d2 = this.l;
            Double d5 = d2;
            double d7 = this.m;
            Double d9 = d7;
            int n7 = 4;
            object3 = gPSLocationData;
            gPSLocationData = new GPSLocationData(d5, d9, null, n7, null);
            ((hy3_0)object).j(gPSLocationData, false);
        }
        if ((object = this.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fetchingLocationLayout");
            n3 = 0;
            object = null;
        }
        object.setVisibility(0);
        object = this.c;
        if (object == null) {
            object = "locationDetailsLayout";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        n3 = 8;
        object2.setVisibility(n3);
        object = this.k;
        if (object != null && (object = ((hy3_0)object).w) != null) {
            object2 = this.getViewLifecycleOwner();
            object4 = new ef0_2(this, 0);
            object3 = new ff0$a_0((ef0_2)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
    }
}

