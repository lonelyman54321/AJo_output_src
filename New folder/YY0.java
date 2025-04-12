/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.GradientDrawable$Orientation
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.FacetValue;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

public class YY0
extends RecyclerView$B {
    public final KI0 a;
    public final LinearLayout b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public boolean f;

    public YY0(View view, KI0 kI0) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(kI0, "facetValueClickListener");
        super(view);
        this.a = kI0;
        int n3 = R$id.general_facet_row_lyt;
        kI0 = (LinearLayout)view.findViewById(n3);
        this.b = kI0;
        n3 = R$id.general_facet_row_selected_iv;
        kI0 = (ImageView)view.findViewById(n3);
        this.c = kI0;
        n3 = R$id.general_facet_row_color_iv;
        kI0 = (ImageView)view.findViewById(n3);
        this.d = kI0;
        n3 = R$id.general_facet_value_row_tv;
        view = (TextView)view.findViewById(n3);
        this.e = view;
    }

    public static void w(ImageView imageView, String object) {
        String string2;
        int n3 = 1;
        Object object2 = "colorImv";
        Intrinsics.checkNotNullParameter(imageView, (String)object2);
        int n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 != 0) {
            return;
        }
        Intrinsics.checkNotNull(object);
        n4 = ((String)object).length() - n3;
        int n7 = 0;
        String string3 = null;
        int n8 = 0;
        Object object3 = null;
        boolean bl2 = false;
        Object object4 = null;
        while (n8 <= n4) {
            int n10 = !bl2 ? n8 : n4;
            n10 = ((String)object).charAt(n10);
            int n14 = 32;
            if ((n10 = Intrinsics.compare(n10, n14)) <= 0) {
                n10 = 1;
            } else {
                n10 = 0;
                string2 = null;
            }
            if (!bl2) {
                if (n10 == 0) {
                    bl2 = true;
                    continue;
                }
                n8 += n3;
                continue;
            }
            if (n10 == 0) break;
            n4 += -1;
        }
        object = com.jio.jioads.adinterfaces.a.a(n4, n3, n8, (String)object);
        string3 = "_";
        object = oo1_1.a(" ", (String)object, string3);
        object3 = "-";
        object2 = new Regex((String)object3);
        object = ((Regex)object2).replace((CharSequence)object, string3).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(object, "toLowerCase(...)");
        object2 = "multi";
        n4 = (int)(((String)object2).equalsIgnoreCase((String)object) ? 1 : 0);
        n7 = 2;
        if (n4 != 0) {
            object2 = GradientDrawable.Orientation.TR_BL;
            n8 = 6;
            Object object5 = object3 = (Object)new int[n8];
            object5[0] = -65536;
            object5[1] = -65281;
            object5[2] = -16776961;
            object5[3] = -16711681;
            object5[4] = -16711936;
            object5[5] = -256;
            object = new GradientDrawable((GradientDrawable.Orientation)object2, (int[])object3);
        } else {
            Intrinsics.checkNotNullParameter(object, "color");
            cp_1.Companion.getClass();
            object2 = z40_0.Companion;
            object3 = AJIOApplication.Companion;
            object4 = Q.a((AJIOApplication$a)object3, (z40$a)object2).a;
            string2 = "filter_color_palettes";
            object4 = ((cw)object4).d(string2);
            bl2 = object4.has((String)object);
            if (bl2) {
                object = Q.a((AJIOApplication$a)object3, (z40$a)object2).a.d(string2).getString((String)object);
                object2 = "getString(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            } else {
                object = "";
            }
            n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            int n15 = n4 != 0 ? hv3_0.m(R$color.accent_color_11) : Color.parseColor((String)object);
            object3 = GradientDrawable.Orientation.TR_BL;
            object4 = new int[]{n15, n15};
            object2 = new GradientDrawable((GradientDrawable.Orientation)object3, (int[])object4);
            n8 = hv3_0.m(R$color.accent_color_11);
            if (n15 == n8) {
                n15 = hv3_0.m(R$color.new_accent_color_29);
                object2.setStroke(n7, n15);
            }
            object = object2;
        }
        object2 = od3_2.a;
        n8 = ((String)object2).length();
        if (n8 == 0) {
            object2 = od3_2.a();
        }
        if ((n8 = (int)(s20.a ? 1 : 0)) != 0 || (n8 = (int)(Intrinsics.areEqual(object3 = od3_2.a(), string2 = ((ld3_2)((Object)(object4 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) != 0 || (n4 = (int)(Intrinsics.areEqual(object2, object3 = ((ld3_2)((Object)object4)).getStoreId()) ? 1 : 0)) != 0) {
            n4 = hv3_0.m(R$color.accent_color_19);
            object.setStroke(n7, n4);
        }
        object.setShape(n3);
        imageView.setBackground((Drawable)object);
    }

    public void x(FacetValue facetValue, HashMap hashMap, HashMap hashMap2, int n3, int n4) {
        int n7;
        int n8;
        String string2;
        YY0 yY0 = this;
        FacetValue facetValue2 = facetValue;
        Object object = hashMap;
        Object object2 = hashMap2;
        int n10 = n3;
        int n14 = n4;
        Intrinsics.checkNotNullParameter(facetValue, "facetValue");
        Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
        Intrinsics.checkNotNullParameter(hashMap2, "userDeselectedFacetValues");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        String string3 = " products";
        String string4 = " ";
        Object[] objectArray = this.e;
        String string5 = ")";
        CharSequence charSequence = " (";
        int n15 = 1;
        if (n3 == n15) {
            String string6 = facetValue.getDisplayName();
            int n16 = facetValue.getCount();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string6);
            stringBuilder.append((String)charSequence);
            stringBuilder.append(n16);
            stringBuilder.append(string5);
            string5 = stringBuilder.toString();
            objectArray.setText((CharSequence)string5);
            objectArray = facetValue.getDisplayName();
            int n17 = facetValue.getCount();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)objectArray);
            ((StringBuilder)charSequence).append(string4);
            ((StringBuilder)charSequence).append(n17);
            ((StringBuilder)charSequence).append(string3);
            string3 = ((StringBuilder)charSequence).toString();
            ref$ObjectRef.element = string3;
        } else {
            String string7 = facetValue.getName();
            int n18 = facetValue.getCount();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string7);
            stringBuilder.append((String)charSequence);
            stringBuilder.append(n18);
            stringBuilder.append(string5);
            string5 = stringBuilder.toString();
            objectArray.setText((CharSequence)string5);
            objectArray = facetValue.getName();
            int n19 = facetValue.getCount();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)objectArray);
            ((StringBuilder)charSequence).append(string4);
            ((StringBuilder)charSequence).append(n19);
            ((StringBuilder)charSequence).append(string3);
            string3 = ((StringBuilder)charSequence).toString();
            ref$ObjectRef.element = string3;
        }
        int n20 = 3;
        string4 = yY0.d;
        if (n10 == n20) {
            string4.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(string4, "colorIv");
            string2 = facetValue.getName();
            YY0.w((ImageView)string4, string2);
        } else {
            n10 = 8;
            string4.setVisibility(n10);
        }
        n10 = (int)(facetValue.getSelected() ? 1 : 0);
        string3 = " index ";
        string4 = "format(...)";
        objectArray = "getString(...)";
        string5 = yY0.b;
        charSequence = yY0.c;
        if (n10 != 0 && (n8 = object2.containsKey(string2 = facetValue.getCode())) == 0 || (n7 = object.containsKey(object2 = facetValue.getCode())) != 0) {
            object = StringCompanionObject.INSTANCE;
            object = string5.getContext();
            n8 = R$string.acc_plp_filter_checkbox_selected;
            object = object.getString(n8);
            Intrinsics.checkNotNullExpressionValue(object, (String)objectArray);
            object2 = ref$ObjectRef.element;
            n10 = 1;
            objectArray = new Object[n10];
            objectArray[0] = object2;
            object = xh2_0.a(objectArray, n10, (String)object, string4);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append(n14);
            object = ((StringBuilder)object2).toString();
            string5.setContentDescription((CharSequence)object);
            yY0.f = n10;
            n7 = R$drawable.facet_rounded_rect_black;
            charSequence.setBackgroundResource(n7);
            object = yY0.itemView.getContext();
            object2 = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            n8 = R$attr.ic_facet_done;
            n7 = tm3_0.b(n8, (Context)object);
            charSequence.setImageResource(n7);
        } else {
            object = StringCompanionObject.INSTANCE;
            object = string5.getContext();
            n8 = R$string.acc_plp_filter_checkbox_unselected;
            object = object.getString(n8);
            Intrinsics.checkNotNullExpressionValue(object, (String)objectArray);
            object2 = ref$ObjectRef.element;
            n10 = 1;
            objectArray = new Object[n10];
            objectArray[0] = object2;
            object = xh2_0.a(objectArray, n10, (String)object, string4);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append(n14);
            object = ((StringBuilder)object2).toString();
            string5.setContentDescription((CharSequence)object);
            yY0.f = false;
            n7 = R$drawable.rounded_rect_4_black_stroke;
            charSequence.setBackgroundResource(n7);
            n7 = R$drawable.facet_checkbox_unselected;
            charSequence.setImageResource(n7);
        }
        object = yY0.itemView;
        object2 = new WY0(yY0, facetValue2, ref$ObjectRef, n14);
        object.setOnClickListener((View.OnClickListener)object2);
    }

    public void y(FacetValue facetValue, HashMap hashMap, HashMap hashMap2, int n3, DD2 dD2, qy0_1 qy0_12, int n4, Boolean bl2, Function2 function2) {
        int n7;
        boolean bl3;
        Object object;
        YY0 yY0 = this;
        Object object2 = hashMap;
        Object object3 = hashMap2;
        Object object4 = qy0_12;
        Function2 function22 = function2;
        Intrinsics.checkNotNullParameter(facetValue, "facetValue");
        Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
        Intrinsics.checkNotNullParameter(hashMap2, "userDeselectedFacetValues");
        Object object5 = "generalFacetValueAdapter";
        Intrinsics.checkNotNullParameter(qy0_12, (String)object5);
        int n8 = 5;
        float f5 = 7.0E-45f;
        int n10 = 0;
        float f6 = 0.0f;
        Object object6 = null;
        int n14 = 1;
        Object object7 = ")";
        String string2 = " (";
        Object object8 = "";
        ImageView imageView = this.c;
        TextView textView = this.e;
        int n15 = n3;
        if (n3 == n8) {
            n8 = (int)(facetValue.isDeliveryFacetFromApi() ? 1 : 0);
            if (n8 != 0 && (n8 = (int)(facetValue.isEnabled() ? 1 : 0)) != 0) {
                object5 = facetValue.getName();
                if (object5 != null) {
                    object8 = object5;
                }
                n8 = facetValue.getCount();
                object6 = new StringBuilder();
                ((StringBuilder)object6).append((String)object8);
                ((StringBuilder)object6).append(string2);
                ((StringBuilder)object6).append(n8);
                ((StringBuilder)object6).append((String)object7);
                object5 = ((StringBuilder)object6).toString();
                textView.setText((CharSequence)object5);
                object5 = od3_2.a();
                object6 = ld3_2.STORE_AJIOGRAM.getStoreId();
                n8 = (int)(Intrinsics.areEqual(object5, object6) ? 1 : 0);
                if (n8 != 0) {
                    object5 = textView.getContext();
                    n10 = R$color.filter_message_ajiogram;
                    n8 = t70.getColor((Context)object5, n10);
                    object6 = yY0.itemView.getContext();
                    int n16 = R$color.bg_color_accent_3;
                    n10 = t70.getColor((Context)object6, n16);
                    textView.setTextColor(n8);
                    object5 = ColorStateList.valueOf((int)n10);
                    imageView.setBackgroundTintList((ColorStateList)object5);
                }
                object5 = yY0.itemView;
                object5.setEnabled(n14 != 0);
                n8 = 1065353216;
                f5 = 1.0f;
                textView.setAlpha(f5);
                imageView.setAlpha(f5);
            } else {
                object5 = facetValue.getName();
                if (object5 != null) {
                    object8 = object5;
                }
                textView.setText((CharSequence)object8);
                yY0.itemView.setEnabled(false);
                object5 = od3_2.a();
                object6 = ld3_2.STORE_AJIOGRAM.getStoreId();
                n8 = (int)(Intrinsics.areEqual(object5, object6) ? 1 : 0);
                n10 = 0x3F000000;
                f6 = 0.5f;
                if (n8 != 0) {
                    object5 = textView.getContext();
                    n14 = R$color.filter_message_ajiogram;
                    n8 = t70.getColor((Context)object5, n14);
                    object = yY0.itemView.getContext();
                    int n17 = R$color.bg_color_accent_3;
                    n14 = t70.getColor((Context)object, n17);
                    textView.setTextColor(n8);
                    object5 = ColorStateList.valueOf((int)n14);
                    imageView.setBackgroundTintList((ColorStateList)object5);
                    textView.setAlpha(f6);
                    imageView.setAlpha(f6);
                } else {
                    object5 = od3_2.a();
                    n8 = (int)(Intrinsics.areEqual(object5, object = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0);
                    if (n8 != 0) {
                        textView.setAlpha(f6);
                        n8 = 1053609165;
                        f5 = 0.4f;
                        imageView.setAlpha(f5);
                    } else {
                        textView.setAlpha(f6);
                        imageView.setAlpha(f6);
                    }
                }
            }
        } else {
            int n18;
            int n19;
            object5 = he3_1.Companion;
            String string3 = facetValue.getName();
            object5.getClass();
            object5 = he3$a_0.a(string3);
            n15 = 2;
            if (object5 != null && (n19 = object5.size()) == n15) {
                object = CollectionsKt.N(n14, (List)object5);
                object8 = String.valueOf(object);
            }
            object = object5;
            object = (Collection)object5;
            n19 = 0;
            lr_0 lr_02 = null;
            if (object != null && (n14 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                if (object5 != null) {
                    object5 = (String)CollectionsKt.N(0, (List)object5);
                } else {
                    n8 = 0;
                    object5 = null;
                    f5 = 0.0f;
                }
                n10 = facetValue.getCount();
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object5);
                ((StringBuilder)object).append(" ");
                ((StringBuilder)object).append(object8);
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(n10);
                ((StringBuilder)object).append((String)object7);
                object5 = ((StringBuilder)object).toString();
            } else {
                n8 = 0;
                object5 = null;
                f5 = 0.0f;
            }
            object6 = new SpannableString((CharSequence)object5);
            n8 = R$drawable.ic_rating_star_small;
            object5 = xn.a(yY0.itemView.getContext(), n8);
            object = h40_0.a;
            n14 = (int)(h40_0.V1() ? 1 : 0);
            if (n14 != 0 && (n14 = h40_0.W1()) < (n18 = 4) && object5 != null) {
                object = h40_0.U1();
                n14 = Color.parseColor((String)object);
                object7 = PorterDuff.Mode.SRC_IN;
                object5.setColorFilter(n14, (PorterDuff.Mode)object7);
            }
            if (object5 != null) {
                object5 = bu0_0.a((Drawable)object5);
            } else {
                n8 = 0;
                object5 = null;
                f5 = 0.0f;
            }
            if (object5 != null) {
                object = yY0.itemView.getContext();
                object7 = "getContext(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object7);
                lr_02 = new lr_0((Context)object, (Bitmap)object5);
            }
            n8 = 3;
            f5 = 4.2E-45f;
            n14 = 33;
            object6.setSpan((Object)lr_02, n15, n8, n14);
            object5 = TextView.BufferType.SPANNABLE;
            textView.setText((CharSequence)object6, (TextView.BufferType)object5);
        }
        n8 = this.getLayoutPosition();
        n10 = ((qy0_1)object4).h;
        if (n8 == n10) {
            n8 = R$drawable.ic_radio_button_on_small;
            imageView.setBackgroundResource(n8);
            if (function22 != null) {
                object5 = Boolean.TRUE;
                object6 = Boolean.FALSE;
                function22.invoke(object5, object6);
            }
        } else {
            n8 = R$drawable.ic_radio_button_small;
            imageView.setBackgroundResource(n8);
            if (function22 != null) {
                object5 = Boolean.FALSE;
                function22.invoke(object5, object5);
            }
        }
        if (!((n8 = (int)(facetValue.getSelected() ? 1 : 0)) == 0 || (bl3 = object3.containsKey(object5 = facetValue.getCode())) && (n7 = (int)(object2.containsKey(object3 = facetValue.getCode()) ? 1 : 0)) == 0)) {
            n7 = R$drawable.ic_radio_button_on_small;
            imageView.setBackgroundResource(n7);
            n7 = n4;
            ((qy0_1)object4).h = n4;
            if (function22 != null) {
                object2 = Boolean.TRUE;
                object3 = Boolean.FALSE;
                function22.invoke(object2, object3);
            }
        }
        object = yY0.itemView;
        object2 = object7;
        object3 = qy0_12;
        object4 = this;
        object5 = facetValue;
        function22 = function2;
        object6 = bl2;
        object7 = new XY0(qy0_12, this, facetValue, function2, dD2, bl2);
        object.setOnClickListener((View.OnClickListener)object7);
    }
}

