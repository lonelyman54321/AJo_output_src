/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.IBinder
 *  android.text.SpannableStringBuilder
 *  android.text.TextWatcher
 *  android.text.style.ForegroundColorSpan
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.TextView
 *  org.json.JSONArray
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONArray;

/*
 * Renamed from aI0
 */
public final class ai0_2 {
    public static final void A(TextView textView, String string2) {
        int n3;
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(textView, string3);
        if (string2 != null && (n3 = string2.length()) != 0) {
            n3 = 0;
            string3 = null;
            string2 = D91.a(0, string2);
            textView.setText((CharSequence)string2);
            ai0_2.B((View)textView);
        } else {
            ai0_2.i((View)textView);
        }
    }

    public static final void B(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        cp$a cp$a = cp_1.Companion;
        int n3 = km_1.b(cp$a);
        if (n3 != 0) {
            view.setImportantForAccessibility(1);
            view.performAccessibilityAction(64, null);
            n3 = 4;
            view.sendAccessibilityEvent(n3);
        }
    }

    public static final void b(ScaleRatingBar object) {
        block3: {
            int n3;
            IndexOutOfBoundsException indexOutOfBoundsException = null;
            int n4 = 2;
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            int n7 = 1;
            int n8 = 1;
            while (true) {
                Object[] objectArray;
                Integer n10;
                Integer n14;
                int n15;
                Object object2;
                n3 = 6;
                float f5 = 8.4E-45f;
                if (n8 >= n3) break block3;
                n3 = n8 + -1;
                View view = object.getChildAt(n3);
                if (view == null) break;
                f5 = object.getRating();
                n3 = (int)f5;
                if (n3 != n8 && n8 >= (n3 = (int)(f5 = object.getRating()))) {
                    AJIOApplication.Companion.getClass();
                    object2 = AJIOApplication$a.a();
                    n15 = R$string.acc_rating_unselected;
                    n14 = n8;
                    n10 = n8;
                    objectArray = new Object[n4];
                    objectArray[0] = n14;
                    objectArray[n7] = n10;
                    object2 = object2.getString(n15, objectArray);
                } else {
                    AJIOApplication.Companion.getClass();
                    object2 = AJIOApplication$a.a();
                    n15 = R$string.acc_rating_selected;
                    n14 = n8;
                    n10 = n8;
                    objectArray = new Object[n4];
                    objectArray[0] = n14;
                    objectArray[n7] = n10;
                    object2 = object2.getString(n15, objectArray);
                }
                view.setContentDescription((CharSequence)object2);
                view.setFocusable(n7 != 0);
                view.setImportantForAccessibility(n7);
                n8 += n7;
            }
            StringBuilder stringBuilder = wk0_0.a(n3, "Index: ", ", Size: ");
            int n16 = object.getChildCount();
            stringBuilder.append(n16);
            object = stringBuilder.toString();
            indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
            throw indexOutOfBoundsException;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(ScaleRatingBar scaleRatingBar, int n3, Integer n4) {
        int n7;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter((Object)scaleRatingBar, string2);
        int n8 = 1;
        Object object = n3 <= n8 ? " star" : " stars";
        String string3 = UX.a(n3, (String)object);
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        int n10 = R$string.acc_rating_read_only;
        Object[] objectArray = new Object[n8];
        objectArray[0] = string3;
        string3 = object.getString(n10, objectArray);
        object = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(string3, (String)object);
        if (n4 == null || (n7 = n4.intValue()) != (n10 = -1)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(" index ");
            ((StringBuilder)object).append(n4);
            string3 = ((StringBuilder)object).toString();
        }
        scaleRatingBar.setContentDescription(string3);
        scaleRatingBar.setFocusable(n8 != 0);
        scaleRatingBar.setClickable(false);
        scaleRatingBar.setImportantForAccessibility(n8);
    }

    public static final boolean d(String string2, JSONArray jSONArray) {
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(jSONArray, string3);
        int n3 = jSONArray.length();
        if (n3 != 0 && string2 != null) {
            n3 = jSONArray.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object = jSONArray.get(i3);
                boolean bl2 = Intrinsics.areEqual(string2, object);
                if (!bl2) {
                    object = jSONArray.get(i3).toString();
                    Object object2 = Locale.ROOT;
                    object = ((String)object).toLowerCase((Locale)object2);
                    Intrinsics.checkNotNullExpressionValue(object, "toLowerCase(...)");
                    object2 = "all";
                    bl2 = Intrinsics.areEqual(object, object2);
                    if (!bl2) {
                        continue;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final int e(int n3, Context object) {
        float f5 = n3;
        object = object != null && (object = object.getResources()) != null ? object.getDisplayMetrics() : null;
        return (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)object);
    }

    public static final String f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Object object = ((Object)StringsKt.m0(string2)).toString();
        String string3 = " ";
        boolean bl2 = StringsKt.F((CharSequence)object, string3, false);
        if (bl2) {
            string2 = ((Object)StringsKt.m0(string2)).toString();
            object = new Regex(string3);
            string2 = (String)((Regex)object).e(string2).get(0);
        }
        return string2;
    }

    public static final String g(CartDeliveryAddress object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "<this>");
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = ((CartDeliveryAddress)object).getLine1();
        if (charSequence != null && (n3 = b.k(charSequence)) == 0) {
            charSequence = hv3_0.u(((CartDeliveryAddress)object).getLine1());
            stringBuilder.append((String)charSequence);
        }
        charSequence = ((CartDeliveryAddress)object).getLine2();
        String string2 = ", ";
        if (charSequence != null && (n3 = b.k(charSequence)) == 0) {
            stringBuilder.append(string2);
            charSequence = hv3_0.u(((CartDeliveryAddress)object).getLine2());
            stringBuilder.append((String)charSequence);
        }
        charSequence = ((CartDeliveryAddress)object).getLandmark();
        String string3 = "\n";
        if (charSequence != null && (n3 = b.k(charSequence)) == 0) {
            stringBuilder.append(string3);
            charSequence = hv3_0.u(((CartDeliveryAddress)object).getLandmark());
            stringBuilder.append((String)charSequence);
        }
        stringBuilder.append(string3);
        charSequence = ((CartDeliveryAddress)object).getTown();
        if (charSequence != null && (n3 = b.k(charSequence)) == 0) {
            charSequence = hv3_0.u(((CartDeliveryAddress)object).getTown());
            stringBuilder.append((String)charSequence);
            stringBuilder.append(string3);
        }
        if ((charSequence = ((CartDeliveryAddress)object).getDistrict()) != null && (n3 = b.k(charSequence)) == 0) {
            charSequence = hv3_0.u(((CartDeliveryAddress)object).getDistrict());
            stringBuilder.append((String)charSequence);
        }
        if ((charSequence = ((CartDeliveryAddress)object).getState()) != null && (n3 = b.k(charSequence)) == 0) {
            stringBuilder.append(string3);
            charSequence = hv3_0.u(((CartDeliveryAddress)object).getState());
            stringBuilder.append((String)charSequence);
        }
        if ((charSequence = ((CartDeliveryAddress)object).getCountry().getName()) != null && (n3 = charSequence.length()) != 0) {
            stringBuilder.append(string2);
            charSequence = hv3_0.u(((CartDeliveryAddress)object).getCountry().getName());
            stringBuilder.append((String)charSequence);
        }
        if ((charSequence = ((CartDeliveryAddress)object).getPostalCode()) != null && (n3 = (int)(b.k(charSequence) ? 1 : 0)) == 0) {
            object = ((CartDeliveryAddress)object).getPostalCode();
            string2 = " - ";
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            stringBuilder.append((String)object);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static final String h(String object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        String[] stringArray = new String[]{"/"};
        int n3 = 6;
        object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n3);
        stringArray = new String[]{};
        object = object.toArray(stringArray);
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = ((String[])object).length;
        if (n4 != 0) {
            Intrinsics.checkNotNullParameter(object, string2);
            int n7 = ((String[])object).length + -1;
            return object[n7];
        }
        object = new NoSuchElementException("Array is empty.");
        throw object;
    }

    public static final void i(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void j(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object object = view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        object = (InputMethodManager)object;
        view = view.getWindowToken();
        object.hideSoftInputFromWindow((IBinder)view, 0);
    }

    public static final void k(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static final SpannableStringBuilder l(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence)string2);
        int n3 = spannableStringBuilder.length();
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        int n4 = R$string.star;
        object = object.getString(n4);
        spannableStringBuilder.append((CharSequence)object);
        int n7 = spannableStringBuilder.length();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-7829368);
        spannableStringBuilder.setSpan((Object)foregroundColorSpan, n3, n7, 33);
        return spannableStringBuilder;
    }

    public static final void m(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setImportantForAccessibility(2);
    }

    public static final void n(EditText editText, Function1 function1, hx0_2 hx0_22, hx0_2 hx0_23) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(function1, "afterTextChanged");
        Intrinsics.checkNotNullParameter(hx0_22, "beforeTextChanged");
        Intrinsics.checkNotNullParameter(hx0_23, "onTextChanged");
        aI0$a aI0$a = new aI0$a(function1, hx0_22, hx0_23);
        editText.addTextChangedListener((TextWatcher)aI0$a);
    }

    public static final void o(EditText editText, hx0_2 hx0_22) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(hx0_22, "onTextChanged");
        sh0_2 sh0_22 = new Object();
        th0_2 th0_22 = new Object();
        ai0_2.n(editText, sh0_22, th0_22, hx0_22);
    }

    public static final String p(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((Object)StringsKt.m0((CharSequence)object)).toString();
        object = fT1.a("\\s+", (String)object);
        StringBuilder stringBuilder = new StringBuilder();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            stringBuilder.append(string2);
            string2 = " ";
            stringBuilder.append(string2);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return ((Object)StringsKt.m0((CharSequence)object)).toString();
    }

    public static final void q(RecyclerView recyclerView) {
        int n3;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(recyclerView, string2);
        while ((n3 = recyclerView.getItemDecorationCount()) > 0) {
            n3 = 0;
            string2 = null;
            recyclerView.removeItemDecorationAt(0);
        }
    }

    public static final Object r(Function2 object, Object object2, Object object3) {
        String string2 = "block";
        Intrinsics.checkNotNullParameter(object, string2);
        object = object2 != null && object3 != null ? object.invoke(object2, object3) : null;
        return object;
    }

    public static final void s(NestedScrollView object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object[] objectArray = null;
        int n3 = object.getChildCount() + -1;
        String string2 = object.getChildAt(n3);
        n3 = string2.getBottom();
        int n4 = object.getPaddingBottom();
        n3 += n4;
        n4 = object.getScrollY();
        int n7 = object.getHeight();
        n3 -= (n4 += n7);
        try {
            ((NestedScrollView)object).p(0, n3, false);
        }
        catch (Exception exception) {
            object = yn3_0.a;
            string2 = "Exception while scrolling to bottom";
            objectArray = new Object[]{};
            ((yn3$a)object).a(string2, objectArray);
        }
    }

    public static final void t(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        aI0$b aI0$b = new a();
        ViewCompat.s(view, aI0$b);
    }

    public static void u(int n3, int n4, int n7, View view) {
        ViewGroup.LayoutParams layoutParams;
        boolean bl2;
        int n8;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        boolean bl3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (bl3) {
            layoutParams2 = (ViewGroup.MarginLayoutParams)layoutParams2;
        } else {
            n8 = 0;
            layoutParams2 = null;
        }
        bl3 = false;
        if (layoutParams2 != null) {
            n8 = layoutParams2.leftMargin;
        } else {
            n8 = 0;
            layoutParams2 = null;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            n10 = layoutParams4 instanceof ViewGroup.MarginLayoutParams;
            if (n10 != 0) {
                layoutParams4 = (ViewGroup.MarginLayoutParams)layoutParams4;
            } else {
                n3 = 0;
                layoutParams4 = null;
            }
            if (layoutParams4 != null) {
                n3 = layoutParams4.topMargin;
            } else {
                n3 = 0;
                layoutParams4 = null;
            }
        }
        if (bl2 = (layoutParams = view.getLayoutParams()) instanceof ViewGroup.MarginLayoutParams) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
        } else {
            n10 = 0;
            layoutParams = null;
        }
        if (layoutParams != null) {
            n10 = layoutParams.rightMargin;
        } else {
            n10 = 0;
            layoutParams = null;
        }
        if ((n7 &= 8) != 0) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            n7 = layoutParams5 instanceof ViewGroup.MarginLayoutParams;
            if (n7 != 0) {
                layoutParams3 = layoutParams5;
                layoutParams3 = (ViewGroup.MarginLayoutParams)layoutParams5;
            }
            if (layoutParams3 != null) {
                n4 = layoutParams3.bottomMargin;
            } else {
                n4 = 0;
                layoutParams5 = null;
            }
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        layoutParams6 = (ViewGroup.MarginLayoutParams)layoutParams6;
        layoutParams6.setMargins(n8, n3, n10, n4);
        view.setLayoutParams(layoutParams6);
    }

    public static final void v(View view, Function1 function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function1, "onSafeClick");
        rh0_2 rh0_22 = new rh0_2(function1, 0);
        wr2_0 wr2_02 = new wr2_0(rh0_22);
        view.setOnClickListener((View.OnClickListener)wr2_02);
    }

    public static void w(TextView textView, Typeface typeface, int n3, int n4) {
        if ((n4 &= 4) != 0) {
            n3 = hv3_0.m(R$color.accent_color_10);
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(typeface, "textFont");
        textView.setTypeface(typeface);
        textView.setTextSize(12.0f);
        textView.setTextColor(n3);
    }

    public static final void x(View view, boolean n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(view, string2);
        n3 = n3 != 0 ? 0 : 8;
        view.setVisibility(n3);
    }

    public static final void y(TextView textView) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(textView, string2);
        int n3 = h40_0.P1();
        if (n3 != 0) {
            n3 = textView.getPaintFlags() | 0x10;
            textView.setPaintFlags(n3);
        }
    }

    public static final void z(TextView textView, String string2) {
        int n3;
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(textView, string3);
        if (string2 != null && (n3 = string2.length()) != 0) {
            textView.setText((CharSequence)string2);
            ai0_2.B((View)textView);
        } else {
            ai0_2.i((View)textView);
        }
    }
}

