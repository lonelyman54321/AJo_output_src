/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ImageView
 *  android.widget.SpinnerAdapter
 *  android.widget.TextView
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.core.content.FileProvider;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$array;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.FragmentProductCodeBinding;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class Yz2
extends f61_0
implements View.OnClickListener {
    public static final Yz2$a Companion;
    public static final /* synthetic */ gn1_2[] y;
    public Integer f;
    public boolean g;
    public Integer h;
    public ImageView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public View m;
    public CheckBox n;
    public Button o;
    public boolean p;
    public ty2_2 q;
    public Uri r;
    public final hh3_2 s;
    public final ArrayList t;
    public final D u;
    public final cc3_2 v;
    public final uz2_0 w;
    public final Kj0 x;

    static {
        Object object = jz.a(Yz2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentProductCodeBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        y = gn1_2Array;
        Companion = object = new Object();
    }

    public Yz2() {
        Object object = 1;
        this.f = object;
        this.h = object;
        object = new Object();
        this.s = object = yr1_2.b((Function0)object);
        object = new ArrayList();
        this.t = object;
        object = Reflection.getOrCreateKotlinClass(NM2.class);
        Yz2$c yz2$c = new Yz2$c(this);
        Yz2$d yz2$d = new Yz2$d(this);
        Yz2$e yz2$e = new Yz2$e(this);
        this.u = object = LW0.a(this, (yn1_2)object, yz2$c, yz2$d, yz2$e);
        this.v = object = z80_0.c(Yz2$b.a, this);
        this.w = object = new uz2_0(this);
        this.x = object = new Object();
    }

    public final FragmentProductCodeBinding Pa() {
        Object object = y[0];
        object = this.v.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentProductCodeBinding)object;
    }

    public final void Qa(boolean bl2) {
        FragmentProductCodeBinding fragmentProductCodeBinding = this.Pa();
        if (bl2) {
            AjioTextView ajioTextView = fragmentProductCodeBinding.btnSaveFullWidth;
            int n3 = 1;
            ajioTextView.setClickable(n3 != 0);
            fragmentProductCodeBinding.btnSaveFullWidth.setEnabled(n3 != 0);
            ajioTextView = fragmentProductCodeBinding.btnSaveFullWidth;
            n3 = R$drawable.bg_black_stroke_white_solid;
            Drawable drawable2 = hv3_0.r(n3);
            ajioTextView.setBackground(drawable2);
            ajioTextView = fragmentProductCodeBinding.btnSaveFullWidth;
            int n4 = hv3_0.m(R$color.black);
            ajioTextView.setTextColor(n4);
        } else {
            AjioTextView ajioTextView = fragmentProductCodeBinding.btnSaveFullWidth;
            int n7 = R$drawable.bg_button_disabled;
            Drawable drawable3 = hv3_0.r(n7);
            ajioTextView.setBackground(drawable3);
            ajioTextView = fragmentProductCodeBinding.btnSaveFullWidth;
            int n8 = hv3_0.m(R$color.color_a5a5a5);
            ajioTextView.setTextColor(n8);
        }
    }

    public final void Ra(boolean n3) {
        FragmentProductCodeBinding fragmentProductCodeBinding = this.Pa();
        String string2 = "linkTv";
        String string3 = "checkBoxlayout";
        String string4 = "checkBox";
        String string5 = "tvErrorImage";
        String string6 = "lblUploadPhoto";
        String string7 = "cancelReasonsSpinnerLayout";
        String string8 = "lblCaptureImage";
        String string9 = "layoutImage";
        String string10 = "btnSaveFullWidth";
        Object object = null;
        if (n3 != 0) {
            int n4;
            int n7;
            Object object2 = this.n;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n3 = 0;
                object2 = null;
            }
            if ((string4 = this.m) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n7 = 0;
                string4 = null;
            }
            string3 = string4.getContext();
            n7 = R$string.acc_icon_checkbox_unselected;
            string3 = string3.getString(n7);
            object2.setContentDescription((CharSequence)string3);
            object2 = this.h;
            if (object2 != null && (n3 = object2.intValue()) == (n4 = 4)) {
                object2 = fragmentProductCodeBinding.btnSaveFullWidth;
                Intrinsics.checkNotNullExpressionValue(object2, string10);
                ai0_2.B((View)object2);
                object2 = fragmentProductCodeBinding.layoutImage;
                Intrinsics.checkNotNullExpressionValue(object2, string9);
                ai0_2.B((View)object2);
                object2 = fragmentProductCodeBinding.lblCaptureImage;
                Intrinsics.checkNotNullExpressionValue(object2, string8);
                ai0_2.B((View)object2);
                object2 = fragmentProductCodeBinding.cancelReasonsSpinnerLayout;
                Intrinsics.checkNotNullExpressionValue(object2, string7);
                ai0_2.B((View)object2);
                object2 = fragmentProductCodeBinding.lblUploadPhoto;
                Intrinsics.checkNotNullExpressionValue(object2, string6);
                ai0_2.B((View)object2);
                object2 = fragmentProductCodeBinding.tvErrorImage;
                Intrinsics.checkNotNullExpressionValue(object2, string5);
                ai0_2.i((View)object2);
            } else {
                object2 = this.h;
                if (object2 != null && (n3 = object2.intValue()) == (n4 = 1)) {
                    object2 = this.l;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object = object2;
                    }
                    ai0_2.i((View)object);
                    object2 = fragmentProductCodeBinding.layoutImage;
                    Intrinsics.checkNotNullExpressionValue(object2, string9);
                    ai0_2.i((View)object2);
                    object2 = fragmentProductCodeBinding.lblCaptureImage;
                    Intrinsics.checkNotNullExpressionValue(object2, string8);
                    ai0_2.i((View)object2);
                    object2 = fragmentProductCodeBinding.lblUploadPhoto;
                    Intrinsics.checkNotNullExpressionValue(object2, string6);
                    ai0_2.i((View)object2);
                    object2 = fragmentProductCodeBinding.tvErrorImage;
                    Intrinsics.checkNotNullExpressionValue(object2, string5);
                    ai0_2.i((View)object2);
                    object2 = fragmentProductCodeBinding.btnSaveFullWidth;
                    Intrinsics.checkNotNullExpressionValue(object2, string10);
                    ai0_2.B((View)object2);
                    object2 = fragmentProductCodeBinding.cancelReasonsSpinnerLayout;
                    Intrinsics.checkNotNullExpressionValue(object2, string7);
                    ai0_2.B((View)object2);
                }
            }
        } else {
            int n8;
            Object object3 = this.n;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n3 = 0;
                object3 = null;
            }
            if ((string4 = this.m) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n8 = 0;
                string4 = null;
            }
            string3 = string4.getContext();
            n8 = R$string.acc_icon_checkbox_selected;
            string3 = string3.getString(n8);
            object3.setContentDescription((CharSequence)string3);
            object3 = fragmentProductCodeBinding.layoutImage;
            Intrinsics.checkNotNullExpressionValue(object3, string9);
            ai0_2.i((View)object3);
            object3 = fragmentProductCodeBinding.lblCaptureImage;
            Intrinsics.checkNotNullExpressionValue(object3, string8);
            ai0_2.i((View)object3);
            object3 = fragmentProductCodeBinding.lblUploadPhoto;
            Intrinsics.checkNotNullExpressionValue(object3, string6);
            ai0_2.i((View)object3);
            object3 = fragmentProductCodeBinding.tvErrorImage;
            Intrinsics.checkNotNullExpressionValue(object3, string5);
            ai0_2.i((View)object3);
            object3 = fragmentProductCodeBinding.cancelReasonsSpinnerLayout;
            Intrinsics.checkNotNullExpressionValue(object3, string7);
            ai0_2.i((View)object3);
            object3 = fragmentProductCodeBinding.btnSaveFullWidth;
            Intrinsics.checkNotNullExpressionValue(object3, string10);
            ai0_2.i((View)object3);
            object3 = this.l;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = object3;
            }
            ai0_2.B((View)object);
        }
    }

    public final void Sa(int n3) {
        Object object = this.Pa();
        Object object2 = this.t;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4 && (n3 = ((ArrayList)object2).size()) > n4) {
                ((ArrayList)object2).remove(n4);
            }
        } else {
            n3 = ((ArrayList)object2).size();
            if (n3 > 0) {
                ((ArrayList)object2).remove(0);
            }
        }
        n3 = ((ArrayList)object2).size();
        String string2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        String string3 = "tvTakeImage";
        int n7 = 8;
        if (n3 == 0) {
            ((FragmentProductCodeBinding)object).ivImageOne.setVisibility(n7);
            ((FragmentProductCodeBinding)object).ivImageOne.setImageBitmap(null);
            Object object3 = ((FragmentProductCodeBinding)object).ivDeleteOne;
            object2 = "ivDeleteOne";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            ai0_2.i((View)object3);
            object3 = ((FragmentProductCodeBinding)object).tvTakeImage;
            Intrinsics.checkNotNullExpressionValue(object3, string3);
            ai0_2.B((View)object3);
            this.Va();
            object3 = ((FragmentProductCodeBinding)object).tvTakeImage.getLayoutParams();
            Intrinsics.checkNotNull(object3, string2);
            object3 = (ConstraintLayout$LayoutParams)((Object)object3);
            object3.setMargins(0, 0, 0, 0);
            object = ((FragmentProductCodeBinding)object).tvTakeImage;
            object.setLayoutParams((ViewGroup.LayoutParams)object3);
        } else {
            n3 = ((ArrayList)object2).size();
            if (n3 == n4) {
                Object object4 = (uy2_2)((ArrayList)object2).get(0);
                if (object4 != null) {
                    object2 = ((FragmentProductCodeBinding)object).ivImageOne;
                    ImageView imageView = ((FragmentProductCodeBinding)object).ivDeleteOne;
                    this.Ta((uy2_2)object4, (ImageView)object2, imageView);
                }
                ((FragmentProductCodeBinding)object).ivImageTwo.setVisibility(n7);
                ((FragmentProductCodeBinding)object).ivImageTwo.setImageBitmap(null);
                object4 = ((FragmentProductCodeBinding)object).ivDeleteTwo;
                object2 = "ivDeleteTwo";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
                ai0_2.i((View)object4);
                object4 = ((FragmentProductCodeBinding)object).tvTakeImage;
                Intrinsics.checkNotNullExpressionValue(object4, string3);
                ai0_2.B((View)object4);
                object4 = ((FragmentProductCodeBinding)object).tvTakeImage.getLayoutParams();
                Intrinsics.checkNotNull(object4, string2);
                object4 = (ConstraintLayout$LayoutParams)((Object)object4);
                int n8 = mz3_0.d(6);
                object4.setMargins(n8, 0, 0, 0);
                object = ((FragmentProductCodeBinding)object).tvTakeImage;
                object.setLayoutParams((ViewGroup.LayoutParams)object4);
            }
        }
    }

    public final void Ta(uy2_2 object, ImageView object2, ImageView object3) {
        Intrinsics.checkNotNull(object2);
        object2.setVisibility(0);
        Intrinsics.checkNotNull(object3);
        object3.setVisibility(0);
        object3 = ((uy2_2)object).c;
        boolean n3 = TextUtils.isEmpty((CharSequence)object3);
        if (!n3) {
            object = ((uy2_2)object).c;
            int n4 = 1;
            object = ty2_2.d(n4, (String)object);
            object2.setImageBitmap((Bitmap)object);
        } else {
            object = ((uy2_2)object).e;
            object2.setImageURI((Uri)object);
        }
        object = this.Pa();
        object2 = this.t;
        int n7 = object2.size();
        int n8 = 2;
        String string2 = "tvTakeImage";
        if (n7 != n8) {
            object2 = ((FragmentProductCodeBinding)object).tvTakeImage;
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            ai0_2.B((View)object2);
            object2 = ((FragmentProductCodeBinding)object).tvTakeImage.getLayoutParams();
            object3 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
            Intrinsics.checkNotNull(object2, (String)object3);
            object2 = (ConstraintLayout$LayoutParams)((Object)object2);
            int n10 = mz3_0.d(6);
            object2.setMargins(n10, 0, 0, 0);
            object = ((FragmentProductCodeBinding)object).tvTakeImage;
            object.setLayoutParams((ViewGroup.LayoutParams)object2);
        } else {
            object = ((FragmentProductCodeBinding)object).tvTakeImage;
            Intrinsics.checkNotNullExpressionValue(object, string2);
            ai0_2.i((View)object);
        }
        this.Va();
    }

    public final void Ua() {
        int n3;
        int n4;
        int n7;
        Object object = this.f;
        String string2 = "doneBtn";
        String string3 = "descTv";
        String string4 = "headerTv";
        String string5 = "checkBoxlayout";
        String string6 = "backImv";
        int n8 = 8;
        String string7 = "linkTv";
        Object object2 = null;
        if (object != null && (n7 = ((Integer)object).intValue()) == (n4 = 1)) {
            int n10;
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string6);
                n10 = 0;
                object = null;
            }
            object.setVisibility(n8);
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n10 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                n10 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n10 = 0;
                object = null;
            }
            int n14 = R$string.dont_have_product_code;
            string4 = hv3_0.K(n14);
            object.setText((CharSequence)string4);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n10 = 0;
                object = null;
            }
            int n15 = R$string.dont_have_product_code_desc;
            string3 = hv3_0.K(n15);
            object.setText((CharSequence)string3);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                n10 = 0;
                object = null;
            }
            n15 = R$string.find_the_product_code;
            string3 = hv3_0.K(n15);
            object.setText((CharSequence)string3);
            object = this.o;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            n10 = R$string.done;
            object = hv3_0.K(n10);
            object2.setText((CharSequence)object);
        } else if (object != null && (n7 = ((Integer)object).intValue()) == (n4 = 2)) {
            int n16 = this.p;
            if (n16 != 0) {
                object = this.i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string6);
                    n16 = 0;
                    object = null;
                }
                object.setVisibility(n8);
            } else {
                object = this.i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string6);
                    n16 = 0;
                    object = null;
                }
                object.setVisibility(0);
            }
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n16 = 0;
                object = null;
            }
            object.setVisibility(n8);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                n16 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n16 = 0;
                object = null;
            }
            int n17 = R$string.find_the_product_code;
            string4 = hv3_0.K(n17);
            object.setText((CharSequence)string4);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n16 = 0;
                object = null;
            }
            int n18 = R$string.find_the_product_code_desc;
            string3 = hv3_0.K(n18);
            object.setText((CharSequence)string3);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                n16 = 0;
                object = null;
            }
            n18 = R$string.what_is_product_code;
            string3 = hv3_0.K(n18);
            object.setText((CharSequence)string3);
            object = this.o;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            n16 = R$string.okay_button_label;
            object = hv3_0.K(n16);
            object2.setText((CharSequence)object);
        } else if (object != null && (n7 = ((Integer)object).intValue()) == (n4 = 3)) {
            boolean bl2 = this.p;
            if (bl2) {
                object = this.i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string6);
                    bl2 = false;
                    object = null;
                }
                object.setVisibility(n8);
            } else {
                object = this.i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string6);
                    bl2 = false;
                    object = null;
                }
                object.setVisibility(0);
            }
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object = null;
            }
            object.setVisibility(n8);
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object = null;
            }
            int n19 = R$string.what_is_product_code;
            string4 = hv3_0.K(n19);
            object.setText((CharSequence)string4);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object = null;
            }
            int n20 = R$string.what_is_product_code_desc;
            string3 = hv3_0.K(n20);
            object.setText((CharSequence)string3);
            object = this.o;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            int n21 = R$string.okay_button_label;
            string2 = hv3_0.K(n21);
            object.setText((CharSequence)string2);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                bl2 = false;
                object = null;
            }
            object.setVisibility(0);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
            } else {
                object2 = object;
            }
            object = "Don\u2019t have Product Code?";
            object2.setText((CharSequence)object);
        } else if (object != null && (n3 = ((Integer)object).intValue()) == (n7 = 4)) {
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                n3 = 0;
                object = null;
            }
            object.setVisibility(n8);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string6);
                n3 = 0;
                object = null;
            }
            object.setVisibility(n8);
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n3 = 0;
                object = null;
            }
            int n22 = R$string.dont_have_product_code;
            string4 = hv3_0.K(n22);
            object.setText((CharSequence)string4);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object = null;
            }
            int n24 = R$string.dont_have_product_code_desc;
            string3 = hv3_0.K(n24);
            object.setText((CharSequence)string3);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                n3 = 0;
                object = null;
            }
            n24 = R$string.find_the_product_code;
            string3 = hv3_0.K(n24);
            object.setText((CharSequence)string3);
            object = this.o;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            n3 = R$string.done;
            object = hv3_0.K(n3);
            object2.setText((CharSequence)object);
        }
    }

    public final void Va() {
        boolean bl2;
        int n3;
        int n4;
        Serializable serializable = this.h;
        boolean bl3 = true;
        if (serializable != null && (n4 = ((Integer)serializable).intValue()) == (n3 = 4)) {
            serializable = this.t;
            int n7 = ((ArrayList)serializable).size();
            if (n7 > 0 && (n7 = (serializable = this.Pa().productTagMissingSpinner).getSelectedItemPosition()) > 0) {
                this.Qa(bl3);
            } else {
                this.Qa(false);
            }
        } else if (serializable != null && (bl2 = ((Integer)serializable).intValue()) == bl3) {
            serializable = this.Pa().productTagMissingSpinner;
            bl2 = serializable.getSelectedItemPosition();
            if (bl2 > false) {
                this.Qa(bl3);
            } else {
                this.Qa(false);
            }
        }
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        String string2 = null;
        int n7 = 1;
        int n8 = 102;
        int n10 = -1;
        if (n3 == n8) {
            if (n4 != n10) {
                if (n4 == 0) {
                    Object object2 = StringCompanionObject.INSTANCE;
                    n3 = R$string.acc_alert_message;
                    object2 = hv3_0.K(n3);
                    String string3 = "Cancelled";
                    object = new Object[n7];
                    object[0] = string3;
                    string2 = "format(...)";
                    ZK1.e(object, n7, (String)object2, string2, string3);
                }
            } else {
                Uri uri = this.r;
                this.startImageProcessing(uri);
            }
        } else {
            n7 = 101;
            if (n3 == n7 && n4 == n10) {
                Uri uri;
                if (object != null && (uri = object.getData()) != null) {
                    uri.toString();
                    Object object3 = this.getContext();
                    if (object3 != null && (object3 = this.requireContext().getContentResolver().getType(uri)) != null && (n4 = (int)(StringsKt.F((CharSequence)object3, (CharSequence)(object = "image"), false) ? 1 : 0)) != 0) {
                        this.startImageProcessing(uri);
                    }
                }
            } else {
                n7 = 202;
                n8 = 201;
                int n14 = 1001;
                String string4 = "CLICK_TYPE";
                if (n3 == n14 && n4 == n10) {
                    if (object != null) {
                        n3 = object.getIntExtra(string4, 0);
                        if (n3 == n8) {
                            this.performFileSearch();
                        } else {
                            n3 = object.getIntExtra(string4, 0);
                            if (n3 == n7) {
                                this.startCamera();
                            }
                        }
                    }
                } else if (n3 == n14 && n4 == n10 && object != null) {
                    n3 = object.getIntExtra(string4, 0);
                    if (n3 == n8) {
                        this.performFileSearch();
                    } else {
                        n3 = object.getIntExtra(string4, 0);
                        if (n3 == n7) {
                            this.startCamera();
                        }
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        int n4;
        int n7 = 2;
        int n8 = 0;
        Object object2 = null;
        int n10 = 1;
        int n14 = 0;
        Object object3 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n15 = R$id.btn_done;
        Object object4 = "key_missing_product_tag";
        int n16 = 4;
        String string2 = "key_missing_product_tag_wrong_item";
        String string3 = "checkBox";
        if (object == null || (n3 = ((Integer)object).intValue()) != n15) {
            n15 = R$id.close;
            if (object == null || (n3 = ((Integer)object).intValue()) != n15) {
                int n17;
                n15 = R$id.layout_checkbox;
                if (object != null && (n3 = ((Integer)object).intValue()) == n15) {
                    n4 = this.g ^ n10;
                    this.g = n4;
                    object = this.n;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object3 = object;
                    }
                    n4 = (int)(this.g ? 1 : 0);
                    object3.setChecked(n4 != 0);
                    n4 = (int)(this.g ? 1 : 0);
                    this.Ra(n4 != 0);
                    return;
                }
                n14 = R$id.imv_back;
                n15 = 3;
                if (object != null && (n17 = ((Integer)object).intValue()) == n14) {
                    object = this.h;
                    object3 = this.f;
                    n4 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
                    if (n4 != 0) {
                        this.dismiss();
                    }
                    if ((object = this.f) != null && (n14 = ((Integer)object).intValue()) == n7) {
                        this.f = object = Integer.valueOf(n10);
                        this.p = n10;
                        this.Ua();
                        return;
                    }
                    if (object == null) {
                        return;
                    }
                    n4 = (Integer)object;
                    if (n4 != n15) return;
                    this.f = object = Integer.valueOf(n7);
                    this.p = false;
                    this.Ua();
                    return;
                }
                n14 = R$id.tv_link;
                if (object != null && (n17 = ((Integer)object).intValue()) == n14) {
                    object = this.f;
                    if (object != null && (n14 = ((Integer)object).intValue()) == n10) {
                        this.f = object = Integer.valueOf(n7);
                        this.p = false;
                        this.Ua();
                        return;
                    }
                    if (object != null && (n8 = ((Integer)object).intValue()) == n7) {
                        this.f = object = Integer.valueOf(n15);
                        this.p = n10;
                        this.Ua();
                        return;
                    }
                    if (object == null) {
                        return;
                    }
                    n4 = (Integer)object;
                    if (n4 != n15) return;
                    this.f = object = Integer.valueOf(n10);
                    this.p = n10;
                    this.Ua();
                    return;
                }
                n14 = R$id.tvTakeImage;
                if (object != null && (n15 = ((Integer)object).intValue()) == n14) {
                    object = this.getActivity();
                    if (object == null) return;
                    object = new vq_2();
                    n7 = 1001;
                    ((Fragment)object).setTargetFragment(this, n7);
                    FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
                    object2 = "ATTACHMENT_DIALOG";
                    ((DialogFragment)object).show(fragmentManager, (String)object2);
                    return;
                }
                n14 = R$id.ivDeleteOne;
                if (object != null && (n15 = ((Integer)object).intValue()) == n14) {
                    this.Sa(0);
                    return;
                }
                n14 = R$id.ivDeleteTwo;
                if (object != null && (n15 = ((Integer)object).intValue()) == n14) {
                    this.Sa(n10);
                    return;
                }
                n14 = R$id.btnSaveFullWidth;
                if (object == null) {
                    return;
                }
                n4 = (Integer)object;
                if (n4 != n14) return;
                object = this.h;
                object3 = this.t;
                String string4 = "extra_reason";
                string3 = "extra_uploaded_file";
                if (object != null && (n3 = ((Integer)object).intValue()) == n10) {
                    object = this.Pa().productTagMissingSpinner;
                    n4 = object.getSelectedItemPosition();
                    if (n4 == 0) {
                        this.Qa(false);
                        return;
                    }
                    this.dismiss();
                    object = new Pair(string3, object3);
                    object3 = this.Pa().productTagMissingSpinner.getSelectedItem().toString();
                    object4 = new Pair(string4, object3);
                    Pair[] pairArray = new Pair[n7];
                    pairArray[0] = object;
                    pairArray[n10] = object4;
                    object = DE.b(pairArray);
                    r0_0.c((Bundle)object, this, string2);
                    return;
                }
                if (object == null) {
                    return;
                }
                n4 = (Integer)object;
                if (n4 != n16) return;
                n4 = ((ArrayList)object3).size();
                if (n4 == 0) {
                    object = this.Pa().tvErrorImage;
                    String string5 = "tvErrorImage";
                    Intrinsics.checkNotNullExpressionValue(object, string5);
                    ai0_2.B((View)object);
                    this.Qa(false);
                    return;
                }
                object = this.Pa().productTagMissingSpinner;
                n4 = object.getSelectedItemPosition();
                if (n4 == 0) {
                    this.Qa(false);
                    return;
                }
                this.dismiss();
                object = new Pair(string3, object3);
                object3 = this.Pa().productTagMissingSpinner.getSelectedItem().toString();
                Pair pair = new Pair(string4, object3);
                Pair[] pairArray = new Pair[n7];
                pairArray[0] = object;
                pairArray[n10] = pair;
                object = DE.b(pairArray);
                r0_0.c((Bundle)object, this, (String)object4);
                return;
            }
        }
        if ((object = this.getTargetFragment()) != null) {
            Object object5 = this.getContext();
            object2 = Yz2.class;
            object = new Intent((Context)object5, object2);
            object5 = this.n;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object5;
            }
            n7 = (int)(object3.isChecked() ? 1 : 0);
            object2 = "IS_SELECTED";
            object.putExtra((String)object2, n7 != 0);
            object5 = this.getTargetFragment();
            if (object5 != null) {
                n8 = this.getTargetRequestCode();
                n10 = -1;
                ((Fragment)object5).onActivityResult(n8, n10, (Intent)object);
            }
            this.dismiss();
            return;
        }
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
        } else {
            object3 = object;
        }
        n4 = (int)(object3.isChecked() ? 1 : 0);
        if (n4 == 0) {
            object = this.h;
            String string6 = "extra_clear";
            if (object != null && (n14 = ((Integer)object).intValue()) == n10) {
                object = Boolean.TRUE;
                object3 = new Pair(string6, object);
                object = new Pair[n10];
                object[0] = object3;
                object = DE.b((Pair[])object);
                r0_0.c((Bundle)object, this, string2);
            } else if (object != null && (n4 = ((Integer)object).intValue()) == n16) {
                object = Boolean.TRUE;
                object3 = new Pair(string6, object);
                object = new Pair[n10];
                object[0] = object3;
                object = DE.b((Pair[])object);
                r0_0.c((Bundle)object, this, (String)object4);
            }
        }
        this.dismiss();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        String string2 = null;
        object = new ty2_2(false);
        this.q = object;
        object = this.getArguments();
        if (object != null) {
            string2 = "VIEW_TYPE";
            int n3 = object.getInt(string2);
            object = n3;
            this.f = object;
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        vz2_1 vz2_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)vz2_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_product_code;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        t30_0 t30_02 = (t30_0)this.s.getValue();
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = (t30_0)this.s.getValue();
            t30_02.d();
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        block21: {
            boolean bl2;
            boolean bl3;
            int n3;
            String string2;
            int n4;
            Object object3;
            boolean bl4;
            int n7;
            String string3;
            block22: {
                int n8;
                string3 = "view";
                Intrinsics.checkNotNullParameter(object, string3);
                super.onViewCreated((View)object, (Bundle)object2);
                object2 = this.getArguments();
                if (object2 != null) {
                    object2 = this.requireArguments().getInt("VIEW_TYPE");
                    this.f = object2;
                    n8 = (int)(this.requireArguments().getBoolean("IS_TAG_MISSING") ? 1 : 0);
                    this.g = n8;
                    object2 = this.requireArguments();
                    string3 = "HIDE_BACK_BUTTON";
                    n8 = (int)(object2.getBoolean(string3) ? 1 : 0);
                    this.p = n8;
                    object2 = this.f;
                    this.h = object2;
                }
                n8 = R$id.imv_back;
                object2 = (ImageView)object.findViewById(n8);
                this.i = object2;
                n8 = R$id.tv_header;
                object2 = (TextView)object.findViewById(n8);
                this.j = object2;
                n8 = R$id.layout_checkbox;
                object2 = object.findViewById(n8);
                this.m = object2;
                n8 = R$id.checkbox_missing_tag;
                object2 = (CheckBox)object.findViewById(n8);
                this.n = object2;
                n8 = R$id.tv_description;
                object2 = (TextView)object.findViewById(n8);
                this.k = object2;
                n8 = R$id.tv_link;
                object2 = (TextView)object.findViewById(n8);
                this.l = object2;
                n8 = R$id.btn_done;
                object = (Button)object.findViewById(n8);
                this.o = object;
                object = this.l;
                n8 = 0;
                object2 = null;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("linkTv");
                    n7 = 0;
                    object = null;
                }
                object.setOnClickListener((View.OnClickListener)this);
                object = this.i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("backImv");
                    n7 = 0;
                    object = null;
                }
                object.setOnClickListener((View.OnClickListener)this);
                object = this.o;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("doneBtn");
                    n7 = 0;
                    object = null;
                }
                object.setOnClickListener((View.OnClickListener)this);
                object = this.n;
                string3 = "checkBox";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n7 = 0;
                    object = null;
                }
                bl4 = this.g;
                object.setChecked(bl4);
                this.Ua();
                object = this.m;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkBoxlayout");
                    n7 = 0;
                    object = null;
                }
                object.setOnClickListener((View.OnClickListener)this);
                object = this.n;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n7 = 0;
                    object = null;
                }
                object3 = new Wz2(this);
                object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object3);
                object3 = this.getResources();
                n4 = R$array.product_tag_missing_spinner_values;
                object3 = object3.getStringArray(n4);
                string2 = "getStringArray(...)";
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                object3 = tp_2.M((Object[])object3);
                object = new ArrayList(object3);
                Object object4 = this.requireActivity();
                String string4 = "requireActivity(...)";
                Intrinsics.checkNotNullExpressionValue(object4, string4);
                n3 = R$layout.cancel_reason_spinner_layout;
                object3 = new ck_2((FragmentActivity)object4, n3, (ArrayList)object);
                object = this.Pa().ivProductTagMissingSpinner;
                if (object != null) {
                    n3 = 0;
                    string4 = null;
                    object4 = new xz2_0(this, 0);
                    object.setOnClickListener((View.OnClickListener)object4);
                }
                object = this.Pa().productTagMissingSpinner;
                object.setAdapter((SpinnerAdapter)object3);
                object.setPrompt((CharSequence)"");
                object3 = object.getOnItemSelectedListener();
                object.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object3);
                object = this.Pa();
                ((FragmentProductCodeBinding)object).close.setOnClickListener(this);
                ((FragmentProductCodeBinding)object).tvTakeImage.setOnClickListener(this);
                object3 = ((FragmentProductCodeBinding)object).ivImageOne;
                bl3 = true;
                object3.setClipToOutline(bl3);
                ((FragmentProductCodeBinding)object).ivImageTwo.setClipToOutline(bl3);
                ((FragmentProductCodeBinding)object).ivDeleteOne.setOnClickListener((View.OnClickListener)this);
                ((FragmentProductCodeBinding)object).ivDeleteTwo.setOnClickListener((View.OnClickListener)this);
                ((FragmentProductCodeBinding)object).btnSaveFullWidth.setOnClickListener(this);
                object = this.requireArguments();
                object3 = "extra_tag_Details_submitted";
                string4 = null;
                n7 = object.getBoolean((String)object3, false);
                if (n7 == 0) break block21;
                object = this.h;
                object3 = this.u;
                if (object == null || (bl2 = ((Integer)object).intValue()) != bl3) break block22;
                object = ((NM2)((D)object3).getValue()).d;
                object3 = this.getResources();
                bl2 = R$array.product_tag_missing_spinner_values;
                object3 = object3.getStringArray((int)(bl2 ? 1 : 0));
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                n4 = ((Object)object3).length;
                for (n3 = 0; n3 < n4; ++n3) {
                    Object object5 = object3[n3];
                    bl2 = ((String)object5).equals(object);
                    if (!bl2) continue;
                    object = this.n;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object2 = object;
                    }
                    object2.setChecked(bl3);
                    this.Ra(bl3);
                    object = this.Pa().productTagMissingSpinner;
                    object.setSelection(n3);
                    break block21;
                }
                break block21;
            }
            if (object == null || (n7 = ((Integer)object).intValue()) != (bl2 = 4 != 0)) break block21;
            object = this.n;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n7 = 0;
                object = null;
            }
            object.setChecked(bl3);
            object = ((NM2)((D)object3).getValue()).e;
            if (object != null) {
                object = (String)((Pair)object).a;
            } else {
                n7 = 0;
                object = null;
            }
            object3 = ((NM2)((D)object3).getValue()).e;
            if (object3 != null) {
                object3 = (ArrayList)((Pair)object3).b;
            } else {
                bl4 = false;
                object3 = null;
            }
            String[] stringArray = this.getResources();
            int n10 = R$array.product_tag_missing_spinner_values;
            stringArray = stringArray.getStringArray(n10);
            Intrinsics.checkNotNullExpressionValue(stringArray, string2);
            n4 = stringArray.length;
            for (n10 = 0; n10 < n4; ++n10) {
                String string5 = stringArray[n10];
                boolean bl5 = string5.equals(object);
                if (!bl5) continue;
                object = this.n;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    object2 = object;
                }
                object2.setChecked(bl3);
                object = this.Pa().productTagMissingSpinner;
                object.setSelection(n10);
                break;
            }
            if (object3 != null && (n7 = ((ArrayList)object3).size()) > 0) {
                object = this.t;
                ((ArrayList)object).clear();
                n7 = object3.size();
                while (n3 < n7) {
                    object2 = (uy2_2)((ArrayList)object3).get(n3);
                    this.setImageData((uy2_2)object2);
                    ++n3;
                }
            }
        }
    }

    public final void performFileSearch() {
        String[] stringArray = "android.intent.action.OPEN_DOCUMENT";
        Intent intent = new Intent((String)stringArray);
        stringArray = "android.intent.category.OPENABLE";
        intent.addCategory((String)stringArray);
        stringArray = "*/*";
        intent.setType((String)stringArray);
        stringArray = "image/jpeg";
        Object object = "image/png";
        stringArray = new String[]{stringArray, object};
        object = "android.intent.extra.MIME_TYPES";
        intent.putExtra((String)object, stringArray);
        int n3 = 101;
        try {
            this.startActivityForResult(intent, n3);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            stringArray = this.getActivity();
            if (stringArray != null && (n3 = (stringArray = this.requireActivity()).isFinishing()) == 0) {
                stringArray = ab0_0.Companion;
                object = this.requireActivity();
                String string2 = "requireActivity(...)";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                stringArray.getClass();
                aB0$a.a((Activity)object);
            }
            stringArray = yn3_0.a;
            stringArray.e(activityNotFoundException);
        }
    }

    public final void setImageData(uy2_2 uy2_22) {
        ImageView imageView;
        ImageView imageView2;
        Object object;
        if (uy2_22 == null) {
            return;
        }
        Object object2 = uy2_22.a;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (bl2) {
            object2 = this.q;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelfCareFileHelper");
                bl2 = false;
                object2 = null;
            }
            object2.getClass();
            object = "jpg";
            uy2_22.a = object2 = ty2_2.c("IMG", (String)object);
        }
        object2 = this.Pa();
        object = this.t;
        int n3 = ((ArrayList)object).size();
        if (n3 == 0) {
            imageView2 = ((FragmentProductCodeBinding)object2).ivImageOne;
            imageView = ((FragmentProductCodeBinding)object2).ivDeleteOne;
        } else {
            imageView2 = ((FragmentProductCodeBinding)object2).ivImageTwo;
            imageView = ((FragmentProductCodeBinding)object2).ivDeleteTwo;
        }
        object2 = ((FragmentProductCodeBinding)object2).tvErrorImage;
        Intrinsics.checkNotNullExpressionValue(object2, "tvErrorImage");
        ai0_2.i((View)object2);
        ((ArrayList)object).add(uy2_22);
        this.Ta(uy2_22, imageView2, imageView);
    }

    public final void startCamera() {
        Context context = this.getContext();
        if (context != null) {
            Object object;
            context = this.requireContext();
            int n3 = t70.checkSelfPermission(context, (String)(object = "android.permission.CAMERA"));
            if (n3 == 0) {
                Object object2;
                context = this.getContext();
                if (context != null && (context = this.requireContext().getExternalCacheDir()) != null && ((n3 = (int)(((File)(object = new File((File)context, (String)(object2 = "/ComplaintDetails")))).exists() ? 1 : 0)) != 0 || (n3 = (int)(((File)object).mkdir() ? 1 : 0)) != 0)) {
                    int n4;
                    context = ((File)object).getAbsolutePath();
                    object2 = this.q;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSelfCareFileHelper");
                        n4 = 0;
                        object2 = null;
                    }
                    object2.getClass();
                    String string2 = "jpeg";
                    object2 = ty2_2.c("IMG", string2);
                    object = new File((String)context, (String)object2);
                    context = this.requireContext();
                    n4 = R$string.file_authority;
                    object2 = this.getString(n4);
                    context = FileProvider.d(context, (String)object2, (File)object);
                    this.r = context;
                    context = new Intent("android.media.action.IMAGE_CAPTURE");
                    object = "output";
                    object2 = this.r;
                    context.putExtra((String)object, (Parcelable)object2);
                    int n7 = 102;
                    this.startActivityForResult((Intent)context, n7);
                }
            } else {
                context = new String[]{object};
                int n8 = 201;
                this.requestPermissions((String[])context, n8);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void startImageProcessing(Uri object) {
        Exception exception2;
        block3: {
            Object object2;
            Object object3;
            Object object4;
            block2: {
                try {
                    object4 = this.getContext();
                    object3 = this.q;
                    if (object3 != null) break block2;
                    object3 = "mSelfCareFileHelper";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object3 = null;
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            if ((object = ((me1_2)(object2 = new me1_2((Context)object4, (ty2_2)object3))).a((Uri)object, (o60_0)(object4 = this.w), (o60_0)(object3 = this.x))) == null) return;
            object2 = this.s;
            object2 = ((hh3_2)object2).getValue();
            object2 = (t30_0)object2;
            Intrinsics.checkNotNull(object2);
            ((t30_0)object2).b((yr0_2)object);
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }
}

