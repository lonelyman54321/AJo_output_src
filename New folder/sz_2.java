/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
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
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Sz
 */
public final class sz_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public final String a;
    public final String b;
    public boolean c;
    public String d = "wallet screen";
    public ImageView e;
    public TextView f;
    public TextView g;
    public EditText h;
    public EditText i;
    public TextView j;
    public TextView k;
    public ProgressBar l;
    public TextView m;
    public TextView n;
    public k0 o;
    public x7 p;
    public HashMap q;
    public String r;

    public sz_2() {
        this.a = "cardNumber";
        this.b = "cardPin";
    }

    public final TextView Oa() {
        TextView textView = this.k;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agAddToWallet");
        return null;
    }

    public final TextView Pa() {
        TextView textView = this.j;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agErrorMessage");
        return null;
    }

    public final void Qa() {
        boolean bl2 = this.c;
        if (bl2) {
            TextView textView = this.Oa();
            int n3 = R$string.ag_add_wallet_dialog_button_text;
            String string2 = this.r;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("walletTypeString");
                string2 = null;
            }
            int n4 = 1;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            String string3 = hv3_0.L(n3, objectArray);
            textView.setText((CharSequence)string3);
        } else {
            TextView textView = this.Oa();
            int n7 = R$string.ag_check_balance_button_text;
            String string4 = hv3_0.K(n7);
            textView.setText((CharSequence)string4);
        }
    }

    public final void onClick(View object) {
        int n3;
        Object object2 = null;
        boolean bl2 = true;
        Object object3 = this.e;
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeDialog");
            n3 = 0;
            object3 = null;
        }
        n3 = Intrinsics.areEqual(object, object3);
        if (n3 != 0) {
            this.dismissAllowingStateLoss();
        } else {
            object3 = this.Oa();
            int n4 = Intrinsics.areEqual(object, object3);
            if (n4 != 0) {
                int n7;
                int n8;
                int n10;
                object = this.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("agCardNumberEditText");
                    n4 = 0;
                    object = null;
                }
                object = object.getText().toString();
                object3 = this.i;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("agPinNumberEditText");
                    n3 = 0;
                    object3 = null;
                }
                object3 = object3.getText().toString();
                Object object5 = this.n;
                Object object6 = "pinNumberErrorTextView";
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n10 = 0;
                    object5 = null;
                }
                ai0_2.i((View)object5);
                object5 = this.m;
                String string2 = "cardNumberErrorTextView";
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n10 = 0;
                    object5 = null;
                }
                ai0_2.i((View)object5);
                if (object != null && (n10 = ((String)object).length()) != 0 && (n10 = ((String)object).length()) >= (n8 = 19)) {
                    n10 = 0;
                    object5 = null;
                } else {
                    object5 = this.m;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n10 = 0;
                        object5 = null;
                    }
                    ai0_2.B((View)object5);
                    object5 = this.m;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n10 = 0;
                        object5 = null;
                    }
                    ai0_2.a((View)object5);
                    n10 = 1;
                }
                if (object3 == null || (n7 = ((String)object3).length()) == 0 || (n7 = ((String)object3).length()) < (n8 = 6)) {
                    string2 = this.n;
                    if (string2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        n7 = 0;
                        string2 = null;
                    }
                    ai0_2.B((View)string2);
                    if (n10 == 0) {
                        object5 = this.n;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                            n10 = 0;
                            object5 = null;
                        }
                        ai0_2.a((View)object5);
                    }
                    n10 = 1;
                }
                if (n10 == 0) {
                    object5 = this.q;
                    object6 = "cardDetails";
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        n10 = 0;
                        object5 = null;
                    }
                    n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                    String string3 = "";
                    if (n7 == 0) {
                        string2 = "\\s";
                        object = oo1_1.a(string2, (String)object, string3);
                    }
                    string2 = this.a;
                    object5.put(string2, object);
                    object = this.q;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        n4 = 0;
                        object = null;
                    }
                    object5 = this.b;
                    object.put(object5, object3);
                    AJIOApplication.Companion.getClass();
                    object = AJIOApplication$a.a();
                    n4 = vV1.e((Context)object);
                    if (n4 != 0) {
                        object = this.l;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                            n4 = 0;
                            object = null;
                        }
                        ai0_2.B((View)object);
                        ai0_2.k((View)this.Pa());
                        this.Oa().setText((CharSequence)string3);
                        this.Oa().setClickable(false);
                        object = this.p;
                        object2 = "ajioGiftCardVM";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            n4 = 0;
                            object = null;
                        }
                        bl2 = this.c;
                        object3 = this.q;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                            n3 = 0;
                            object3 = null;
                        }
                        object.getClass();
                        object5 = md3_0.c((jD3)object);
                        object6 = new w7_0((x7)object, bl2, (HashMap)object3, null);
                        n4 = 3;
                        Ae3.d((i90_0)object5, null, null, (Function2)object6, n4);
                        object = this.p;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            object4 = object;
                        }
                        object = object4.c;
                        object2 = this.getViewLifecycleOwner();
                        pz_2 pz_22 = new pz_2(this);
                        object3 = new Sz$a(pz_22);
                        ((LiveData)object).e((mu1_1)object2, (F62)object3);
                    } else {
                        n4 = R$string.pesdk_internet_alert_msg;
                        object = hv3_0.K(n4);
                        object3 = StringCompanionObject.INSTANCE;
                        n3 = R$string.acc_error_message;
                        object3 = hv3_0.K(n3);
                        object4 = new Object[bl2];
                        object4[0] = object;
                        object2 = xh2_0.a(object4, (int)(bl2 ? 1 : 0), (String)object3, "format(...)");
                        hv3_0 hv3_02 = hv3_0.a;
                        hv3_02.getClass();
                        hv3_0.l0((String)object, (String)object2);
                    }
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        nz_0 nz_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)nz_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        String string2;
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0 && (n3 = (int)(Intrinsics.areEqual(object = this.d, string2 = "payment screen") ? 1 : 0)) != 0) {
            n3 = R$layout.row_aw_ajio_gift_bottom_sheet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.row_aw_ajio_gift_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3 = 0;
        String string2 = null;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object2 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(object4, "factory");
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        Object[] objectArray = x7.class;
        String string3 = "modelClass";
        object2 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object2, objectArray, string3);
        object3 = "<this>";
        object4 = sw0_0.a(objectArray, (String)object3, objectArray, string3, string3);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = object4.getQualifiedName();
        if (object3 != null) {
            objectArray = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = objectArray.concat((String)object3);
            object2 = (x7)object2.a((yn1_2)object4, (String)object3);
            this.p = object2;
            int n4 = R$id.dlprLayoutContent;
            object2 = (ConstraintLayout)object.findViewById(n4);
            object4 = Looper.getMainLooper();
            object3 = new Handler((Looper)object4);
            object4 = new oz_1(0, this, object2);
            long l2 = 100;
            object3.postDelayed((Runnable)object4, l2);
            n4 = R$id.close_dialog;
            object2 = (ImageView)object.findViewById(n4);
            object3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.e = object2;
            n4 = R$id.ag_dialog_title;
            object2 = (TextView)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.f = object2;
            n4 = R$id.ag_dialog_sub_title;
            object2 = (TextView)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.g = object2;
            n4 = R$id.ag_card_number_edit_text;
            object2 = (EditText)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.h = object2;
            n4 = R$id.ag_pin_number_edit_text;
            object2 = (EditText)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.i = object2;
            n4 = R$id.ag_error_message;
            object2 = (TextView)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.j = object2;
            n4 = R$id.ag_add_to_wallet;
            object2 = (TextView)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.k = object2;
            n4 = R$id.ag_gift_card_progress_bar;
            object2 = (ProgressBar)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.l = object2;
            n4 = R$id.ag_invalid_card_number_error;
            object2 = (TextView)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            this.m = object2;
            n4 = R$id.ag_invalid_pin_number_error;
            object = (TextView)object.findViewById(n4);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            this.n = object;
            object = new HashMap();
            this.q = object;
            this.Qa();
            boolean bl2 = this.c;
            object2 = "agDialogSubTitle";
            object3 = "agDialogTitle";
            object4 = null;
            if (bl2) {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    bl2 = false;
                    object = null;
                }
                int n7 = R$string.ag_add_wallet_dialog_title;
                object3 = hv3_0.K(n7);
                object.setText((CharSequence)object3);
                object = this.g;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    bl2 = false;
                    object = null;
                }
                n4 = R$string.ag_add_wallet_dialog_message;
                object3 = this.r;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("walletTypeString");
                    n7 = 0;
                    object3 = null;
                }
                int n8 = 1;
                objectArray = new Object[n8];
                objectArray[0] = object3;
                object2 = hv3_0.L(n4, objectArray);
                object.setText((CharSequence)object2);
            } else {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    bl2 = false;
                    object = null;
                }
                n3 = R$string.ag_check_balance_dialog_title;
                string2 = hv3_0.K(n3);
                object.setText((CharSequence)string2);
                object = this.g;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    bl2 = false;
                    object = null;
                }
                n4 = R$string.ag_check_balance_dialog_message;
                object2 = hv3_0.K(n4);
                object.setText((CharSequence)object2);
            }
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("closeDialog");
                bl2 = false;
                object = null;
            }
            object.setOnClickListener((View.OnClickListener)this);
            this.Oa().setOnClickListener((View.OnClickListener)this);
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("agCardNumberEditText");
                bl2 = false;
                object = null;
            }
            object2 = new qz_1(this);
            object.addTextChangedListener((TextWatcher)object2);
            object = this.i;
            if (object != null) {
                object4 = object;
            } else {
                object = "agPinNumberEditText";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            }
            object = new rz_1(this);
            object4.addTextChangedListener((TextWatcher)object);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

