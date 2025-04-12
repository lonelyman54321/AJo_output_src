/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.utils.PriorityDeliveryGaUtils;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.user.GPSLocationData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FO
 */
public final class fo_1
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public ImageView a;
    public TextView b;
    public EditText c;
    public TextView d;
    public ProgressBar e;
    public j82_0 f;
    public String g;
    public boolean h;
    public ChangeLocationListener i;
    public wx1_1 j;
    public lz1_1 k;
    public String l;
    public final jo_2 m;
    public final hh3_2 n;

    public fo_1() {
        Object object = "";
        this.g = object;
        this.l = object;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.m = object = new jo_2((Context)aJIOApplication);
        object = new zo_1(this);
        this.n = object = yr1_2.b((Function0)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Oa() {
        var1_1 = this.m;
        var2_2 = var1_1.l();
        var3_3 /* !! */  = null;
        var4_4 = var2_2 != null ? var2_2.getAddressType() : null;
        if (var4_4 == (var5_5 = AddressType.Pincode)) ** GOTO lbl-1000
        if (var2_2 != null) {
            var3_3 /* !! */  = var2_2.getAddressType();
        }
        if (var3_3 /* !! */  != (var4_4 = AddressType.Address)) {
            var1_1.D(false);
        } else if (!(var6_6 = Intrinsics.areEqual(var2_2 = var2_2.getPostalCode(), (Object)(var3_3 /* !! */  = this.l)))) {
            var6_6 = true;
            var1_1.D(var6_6);
        } else {
            var1_1.D(false);
        }
        var7_7 = this.h;
        var2_2 = "";
        if (var7_7) {
            var1_1 = this.i;
            if (var1_1 != null) {
                var3_3 /* !! */  = this.l;
                var1_1.loadCartBasedOnSelectedAddress((String)var3_3 /* !! */ , (String)var2_2);
            }
        } else {
            var1_1 = this.f;
            if (var1_1 != null) {
                var3_3 /* !! */  = this.l;
                var1_1.loadCartBasedOnSelectedAddress((String)var3_3 /* !! */ , (String)var2_2);
            }
        }
    }

    public final EditText Pa() {
        EditText editText = this.c;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pdEnterPinCodeEdit");
        return null;
    }

    public final TextView Qa() {
        TextView textView = this.b;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvInvalidPinCode");
        return null;
    }

    public final void Ra(String string2) {
        Intrinsics.checkNotNullParameter(string2, "preFillPinCode");
        this.g = string2;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof lz1_1;
        if (bl2) {
            object = (lz1_1)object;
            this.k = object;
            return;
        }
        object = pn_2.b(object, " must implement LoginListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onClick(View var1_1) {
        block28: {
            block33: {
                block29: {
                    block31: {
                        block32: {
                            block30: {
                                block27: {
                                    var2_2 = false;
                                    var3_3 = null;
                                    if (var1_1 != null) {
                                        var4_4 = var1_1.getId();
                                        var1_1 = var4_4;
                                    } else {
                                        var4_4 = 0;
                                        var1_1 = null;
                                    }
                                    var5_5 = R$id.close_dialog;
                                    if (var1_1 == null || (var6_6 = var1_1.intValue()) != var5_5) break block27;
                                    this.dismissAllowingStateLoss();
                                    break block28;
                                }
                                var5_5 = R$id.pd_check_pincode;
                                if (var1_1 == null || (var4_4 = var1_1.intValue()) != var5_5) break block28;
                                var4_4 = (int)h40_0.Q1();
                                var7_7 = this.m;
                                var8_8 /* !! */  = "mProgressview";
                                var9_9 = true;
                                var10_10 = 6;
                                if (var4_4 == 0) break block29;
                                var4_4 = (int)this.h;
                                var11_11 = this.n;
                                if (var4_4 == 0) break block30;
                                var1_1 = this.Pa().getText();
                                this.l = var12_13 = var1_1.toString();
                                var4_4 = var12_13.length();
                                if (var4_4 == var10_10) {
                                    ai0_2.i((View)this.Qa());
                                    var1_1 = this.e;
                                    if (var1_1 != null) {
                                        var3_3 = var1_1;
                                    } else {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                                    }
                                    ai0_2.B((View)var3_3);
                                    var1_1 = (hy3_0)var11_11.getValue();
                                    var13_15 = 3;
                                    var3_3 = new GPSLocationData(null, null, var12_13, var13_15, null);
                                    var1_1.j((GPSLocationData)var3_3, false);
                                } else {
                                    var1_1 = this.Qa();
                                    ai0_2.B((View)var1_1);
                                }
                                break block31;
                            }
                            var1_1 = this.Pa().getText();
                            this.l = var12_14 = var1_1.toString();
                            var4_4 = var12_14.length();
                            if (var4_4 != var10_10) break block32;
                            ai0_2.i((View)this.Qa());
                            var1_1 = this.e;
                            if (var1_1 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                                var4_4 = 0;
                                var1_1 = null;
                            }
                            ai0_2.B((View)var1_1);
                            var1_1 = var7_7.l();
                            if (var1_1 != null) {
                                var8_8 /* !! */  = var1_1.getAddressType();
                            } else {
                                var6_6 = 0;
                                var8_8 /* !! */  = null;
                            }
                            var14_17 = AddressType.Pincode;
                            if (var8_8 /* !! */  == var14_17) ** GOTO lbl-1000
                            if (var1_1 != null) {
                                var8_8 /* !! */  = var1_1.getAddressType();
                            } else {
                                var6_6 = 0;
                                var8_8 /* !! */  = null;
                            }
                            var14_17 = AddressType.Address;
                            if (var8_8 /* !! */  != var14_17) {
                                var7_7.D(false);
                            } else lbl-1000:
                            // 2 sources

                            {
                                if (var1_1 != null) {
                                    var3_3 = var1_1.getPostalCode();
                                }
                                if ((var4_4 = (int)Intrinsics.areEqual(var3_3, var12_14)) == 0) {
                                    var7_7.D(var9_9);
                                } else {
                                    var7_7.D(false);
                                }
                            }
                            var1_1 = (hy3_0)var11_11.getValue();
                            var13_16 = 3;
                            var3_3 = new GPSLocationData(null, null, var12_14, var13_16, null);
                            var1_1.j((GPSLocationData)var3_3, false);
                            break block31;
                        }
                        var1_1 = this.Qa();
                        ai0_2.B((View)var1_1);
                    }
                    var1_1 = PriorityDeliveryGaUtils.INSTANCE;
                    var3_3 = "screenName";
                    var1_1.pushEnterPinCodeCTAClickedEvent((String)var3_3, (String)var3_3);
                    break block28;
                }
                this.l = var1_1 = this.Pa().getText().toString();
                var15_19 = var1_1.length();
                if (var15_19 != var10_10) break block33;
                ai0_2.i((View)this.Qa());
                var14_18 /* !! */  = this.e;
                if (var14_18 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var8_8 /* !! */ );
                    var10_10 = 0;
                    var14_18 /* !! */  = null;
                }
                ai0_2.B((View)var14_18 /* !! */ );
                var8_8 /* !! */  = var7_7.l();
                if (var8_8 /* !! */  != null) {
                    var14_18 /* !! */  = var8_8 /* !! */ .getAddressType();
                } else {
                    var10_10 = 0;
                    var14_18 /* !! */  = null;
                }
                var11_12 = AddressType.Pincode;
                if (var14_18 /* !! */  == var11_12) ** GOTO lbl-1000
                if (var8_8 /* !! */  != null) {
                    var14_18 /* !! */  = var8_8 /* !! */ .getAddressType();
                } else {
                    var10_10 = 0;
                    var14_18 /* !! */  = null;
                }
                var11_12 = AddressType.Address;
                if (var14_18 /* !! */  != var11_12) {
                    var7_7.D(false);
                } else lbl-1000:
                // 2 sources

                {
                    if (var8_8 /* !! */  != null) {
                        var3_3 = var8_8 /* !! */ .getPostalCode();
                    }
                    if (!(var2_2 = Intrinsics.areEqual(var3_3, var1_1))) {
                        var7_7.D(var9_9);
                    } else {
                        var7_7.D(false);
                    }
                }
                var3_3 = this.f;
                if (var3_3 != null) {
                    var7_7 = "";
                    var3_3.loadCartBasedOnSelectedAddress((String)var1_1, (String)var7_7);
                }
                break block28;
            }
            var1_1 = this.Qa();
            ai0_2.B((View)var1_1);
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$style.BottomSheetDialogThemeNoFloating;
        this.setStyle(0, n3);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        String string2 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string2, (rd3_0)object2, (E$b)object3, (Wd0)object);
        object2 = wx1_1.class;
        object3 = "modelClass";
        object2 = do_0.a((Class)object2, (String)object3, (Class)object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.j = object = (wx1_1)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        xO xO2 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)xO2);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.cart_pincode_bottom_sheet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.cart_pincode_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.addaddress_progressview;
        object2 = (ProgressBar)object.findViewById(n4);
        Object object3 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.e = object2;
        n4 = R$id.pd_enter_pincode_edit_text;
        object2 = (EditText)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.c = object2;
        n4 = R$id.ag_invalid_pincode_error;
        object2 = (TextView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.b = object2;
        n4 = R$id.close_dialog;
        object2 = (ImageView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.a = object2;
        n4 = R$id.pd_check_pincode;
        object2 = (TextView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.d = object2;
        n4 = R$id.iv_back_click;
        object = (ImageView)object.findViewById(n4);
        if (object != null) {
            object3 = null;
            object2 = new yo_0(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((n3 = h40_0.Q1()) != 0 && (n3 = ((String)(object = this.g)).length()) > 0) {
            object = this.Pa();
            object2 = this.g;
            object.setText((CharSequence)object2);
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
            Intrinsics.throwUninitializedPropertyAccessException("checkText");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.Pa();
        object3 = new Object();
        object.addTextChangedListener((TextWatcher)object3);
        object = this.j;
        if (object == null) {
            object = "cartViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object = object2.v;
        object2 = this.getViewLifecycleOwner();
        object3 = new bo_2(this, 0);
        fo$a_0 fo$a_0 = new fo$a_0((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, fo$a_0);
        object = ((hy3_0)this.n.getValue()).w;
        object2 = this.getViewLifecycleOwner();
        object3 = new co_2(this);
        fo$a_0 = new fo$a_0((Function1)object3);
        ((LiveData)object).e((mu1_1)object2, fo$a_0);
    }
}

