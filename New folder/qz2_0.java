/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.text.Spannable
 *  android.text.TextUtils
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StrikethroughSpan
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/*
 * Renamed from qz2
 */
public final class qz2_0 {
    public static final void a(String string2, String charSequence, TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(string2, "price");
        Intrinsics.checkNotNullParameter(charSequence, "viewText");
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        textView.setText(charSequence, bufferType);
        charSequence = textView.getText();
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type android.text.Spannable");
        charSequence = (Spannable)charSequence;
        bufferType = new StrikethroughSpan();
        int n3 = string2.length();
        int n4 = 33;
        charSequence.setSpan((Object)bufferType, 0, n3, n4);
        n3 = Color.parseColor((String)"#B09975");
        bufferType = new ForegroundColorSpan(n3);
        int n7 = string2.length();
        n3 = charSequence.length();
        charSequence.setSpan((Object)bufferType, n7, n3, n4);
        textView.setVisibility(0);
    }

    public static final void b(Product object, TextView textView) {
        String string2 = "textView";
        Intrinsics.checkNotNullParameter(textView, string2);
        object = qz2_0.j((Product)object);
        Intrinsics.checkNotNullParameter(textView, string2);
        string2 = ((qr0_1)object).a;
        Intrinsics.checkNotNullParameter(string2, "price");
        object = ((qr0_1)object).c;
        Intrinsics.checkNotNullParameter(object, "viewText");
        Object object2 = TextView.BufferType.SPANNABLE;
        textView.setText((CharSequence)object, object2);
        object = textView.getText();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.text.Spannable");
        object = (Spannable)object;
        object2 = new StrikethroughSpan();
        int n3 = string2.length();
        int n4 = 33;
        object.setSpan(object2, 0, n3, n4);
        n3 = hv3_0.m(R$color.accent_color_2);
        object2 = new ForegroundColorSpan(n3);
        n3 = string2.length();
        int n7 = object.length();
        object.setSpan(object2, n3, n7, n4);
        Context context = textView.getContext();
        context = hv3_0.o(10, context);
        object2 = new AjioCustomTypefaceSpan("", (Typeface)context);
        int n8 = string2.length();
        n3 = object.length();
        object.setSpan(object2, n8, n3, 34);
        textView.setVisibility(0);
    }

    public static final void c(Price object, Price object2, TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        object = qz2_0.h((Price)object, (Price)object2);
        object2 = ((qr0_1)object).a;
        object = ((qr0_1)object).c;
        qz2_0.a((String)object2, (String)object, textView);
    }

    public static final void d(Product object, TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Object object2 = null;
        Price price = object != null ? ((Product)object).getPrice() : null;
        if (object != null) {
            object2 = ((Product)object).getWasPriceData();
        }
        object = qz2_0.h(price, (Price)object2);
        object2 = ((qr0_1)object).a;
        object = ((qr0_1)object).c;
        qz2_0.a((String)object2, (String)object, textView);
    }

    public static final String e(Resources object, Product objectArray) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "resources");
        Intrinsics.checkNotNullParameter(objectArray, "product");
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = objectArray.getWasPriceData();
        if (object2 != null && (object2 = object2.getValue()) != null) {
            float f5;
            int n4;
            float f6;
            object2 = objectArray.getPrice();
            float f7 = 0.0f;
            Object[] objectArray2 = null;
            if (object2 != null && (object2 = object2.getValue()) != null) {
                f6 = Float.parseFloat((String)object2);
            } else {
                n4 = 0;
                f6 = 0.0f;
                object2 = null;
            }
            Object object3 = objectArray.getWasPriceData();
            if (object3 != null && (object3 = ((Price)object3).getValue()) != null) {
                f5 = Float.parseFloat((String)object3);
            } else {
                f5 = 0.0f;
                object3 = null;
            }
            object2 = Float.valueOf(f6);
            object3 = Float.valueOf(f5);
            n4 = object2.equals(object3);
            object3 = "format(...)";
            String string2 = "getString(...)";
            if (n4 == 0) {
                object2 = StringCompanionObject.INSTANCE;
                n4 = R$string.acc_plp_final_price;
                object2 = object.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                Object[] objectArray3 = objectArray.getPrice();
                if (objectArray3 != null && (objectArray3 = objectArray3.getValue()) != null) {
                    f7 = Float.parseFloat((String)objectArray3);
                }
                objectArray2 = qz2_0.u(f7);
                objectArray3 = new Object[n3];
                objectArray3[0] = objectArray2;
                objectArray2 = Arrays.copyOf(objectArray3, n3);
                object2 = String.format((String)object2, objectArray2);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                stringBuilder.append((String)object2);
                objectArray = qz2_0.j((Product)objectArray);
                stringBuilder.append(", ");
                n4 = R$string.acc_plp_original_price;
                object = object.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                objectArray = objectArray.c;
                object2 = new Object[n3];
                object2[0] = objectArray;
                objectArray = Arrays.copyOf(object2, n3);
                object = String.format((String)object, objectArray);
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                stringBuilder.append((String)object);
            } else {
                object2 = StringCompanionObject.INSTANCE;
                n4 = R$string.acc_plp_final_price_without_discount;
                object = object.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                objectArray = objectArray.getPrice();
                if (objectArray != null && (objectArray = objectArray.getValue()) != null) {
                    f7 = Float.parseFloat((String)objectArray);
                }
                objectArray = qz2_0.u(f7);
                object2 = new Object[n3];
                object2[0] = objectArray;
                objectArray = Arrays.copyOf(object2, n3);
                object = String.format((String)object, objectArray);
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                stringBuilder.append((String)object);
            }
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static final String f(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = "0";
        } else {
            Intrinsics.checkNotNull(string2);
            string2 = string2.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(string2, "toUpperCase(...)");
            String string3 = "";
            string2 = oo1_1.a("RS.", string2, string3);
            string2 = oo1_1.a("R.", string2, string3);
            string2 = oo1_1.a("S.", string2, string3);
            string2 = oo1_1.a("\u20b9", string2, string3);
            String string4 = " ";
            string2 = oo1_1.a(string4, string2, string3);
        }
        return qz2_0.s(string2);
    }

    public static final String g(Price object, Price object2) {
        float f5;
        float f6 = 0.0f;
        if (object != null && (object = ((Price)object).getValue()) != null) {
            f5 = Float.parseFloat((String)object);
        } else {
            f5 = 0.0f;
            object = null;
        }
        if (object2 != null && (object2 = ((Price)object2).getValue()) != null) {
            f6 = Float.parseFloat((String)object2);
        }
        f5 = (f6 - f5) / f6;
        float f7 = 100;
        return mz3_0.h(String.valueOf(f5 * f7));
    }

    public static final qr0_1 h(Price object, Price object2) {
        String string2 = object2 != null ? ((Price)object2).getValue() : null;
        if ((string2 = qz2_0.n(string2)) == null) {
            string2 = qz2_0.z();
        }
        object = Ft2.a(qz2_0.g((Price)object, (Price)object2), "%");
        object2 = y02.a(string2, " (", (String)object, " off)");
        qr0_1 qr0_12 = new qr0_1(string2, (String)object, (String)object2);
        return qr0_12;
    }

    public static final qr0_1 i(Price object, Price object2) {
        boolean bl2;
        Object object3;
        float f5 = 0.0f;
        Object object4 = null;
        if (object2 != null) {
            object3 = ((Price)object2).getValue();
        } else {
            bl2 = false;
            object3 = null;
        }
        bl2 = mz3_0.C((String)object3);
        if (bl2) {
            if (object2 != null && (object3 = ((Price)object2).getValue()) != null) {
                f5 = Float.parseFloat((String)object3);
                object4 = Float.valueOf(f5);
            }
            Intrinsics.checkNotNull(object4);
            object4 = qz2_0.x((Float)object4);
            Intrinsics.checkNotNull(object4);
        } else {
            object4 = "0.0";
        }
        object = Ft2.a(qz2_0.g((Price)object, (Price)object2), "%");
        object2 = y02.a((String)object4, " ", (String)object, " off");
        object3 = new qr0_1((String)object4, (String)object, (String)object2);
        return object3;
    }

    public static final qr0_1 j(Product object) {
        boolean bl2;
        String string2;
        boolean bl3;
        Object object2;
        float f5 = 0.0f;
        Object object3 = null;
        Object object4 = object != null ? ((Product)object).getPrice() : null;
        if (object != null) {
            object2 = ((Product)object).getWasPriceData();
        } else {
            bl3 = false;
            object2 = null;
        }
        object = object != null ? ((Product)object).getDiscountPercent() : null;
        if (object2 != null) {
            string2 = ((Price)object2).getValue();
        } else {
            bl2 = false;
            string2 = null;
        }
        bl2 = mz3_0.C(string2);
        if (bl2) {
            if (object2 != null && (string2 = ((Price)object2).getValue()) != null) {
                f5 = Float.parseFloat(string2);
                object3 = Float.valueOf(f5);
            }
            Intrinsics.checkNotNull(object3);
            object3 = qz2_0.x((Float)object3);
            Intrinsics.checkNotNull(object3);
        } else {
            object3 = "0.0";
        }
        object4 = qz2_0.g((Price)object4, (Price)object2);
        object2 = "%";
        object4 = Ft2.a((String)object4, (String)object2);
        bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)object4)) && !(bl3 = Intrinsics.areEqual(object2 = "0%", object4))) {
            object = object4;
        }
        if (object == null) {
            object = "";
        }
        object4 = n1.a((String)object3, " ", (String)object);
        object2 = new qr0_1((String)object3, (String)object, (String)object4);
        return object2;
    }

    public static final String k(Double object) {
        int n3;
        String[] stringArray = "#,###,###.##";
        Object object2 = new DecimalFormat((String)stringArray);
        if ((object = ((Format)object2).format(object)) == null) {
            return "";
        }
        object2 = ".";
        int n4 = 0;
        stringArray = null;
        int n7 = StringsKt.F((CharSequence)object, (CharSequence)object2, false);
        if (n7 == 0) {
            object2 = ".00";
            object = ((String)object).concat((String)object2);
        }
        object2 = fT1.a("\\.", (String)object);
        stringArray = new String[0];
        n4 = ((String[])(object2 = object2.toArray(stringArray))).length;
        if (n4 > (n3 = 1) && (n7 = ((String)(object2 = object2[n3])).length()) == n3) {
            object2 = "0";
            object = ((String)object).concat((String)object2);
        }
        return object;
    }

    public static final String l(Float object) {
        int n3;
        String[] stringArray = "#,###,###.##";
        Object object2 = new DecimalFormat((String)stringArray);
        if (object != null) {
            float f5 = ((Float)object).floatValue();
            double d2 = f5;
            object = d2;
        } else {
            float f6 = 0.0f;
            object = null;
        }
        object = ((Format)object2).format(object);
        if (object == null) {
            return "";
        }
        object2 = ".";
        int n4 = 0;
        stringArray = null;
        int n7 = StringsKt.F((CharSequence)object, (CharSequence)object2, false);
        if (n7 == 0) {
            object2 = ".00";
            object = ((String)object).concat((String)object2);
        }
        object2 = fT1.a("\\.", (String)object);
        stringArray = new String[0];
        n4 = ((String[])(object2 = object2.toArray(stringArray))).length;
        if (n4 > (n3 = 1) && (n7 = ((String)(object2 = object2[n3])).length()) == n3) {
            object2 = "0";
            object = ((String)object).concat((String)object2);
        }
        return object;
    }

    public static final String m(Float f5) {
        if (f5 == null) {
            return qz2_0.z();
        }
        return qz2_0.s(mz3_0.h(f5.toString()));
    }

    public static final String n(String string2) {
        return qz2_0.s(mz3_0.h(string2));
    }

    public static final String o(String string2) {
        int n3;
        if ((string2 = mz3_0.h(string2)) != null && (n3 = string2.length()) != 0) {
            String string3 = "\u20b9 ";
            string2 = string3.concat(string2);
        } else {
            string2 = qz2_0.z();
        }
        return string2;
    }

    public static final String p(float f5) {
        int n3;
        String[] stringArray = "#,###,###.##";
        Object object = new DecimalFormat((String)stringArray);
        double d2 = f5;
        String string2 = ((NumberFormat)object).format(d2);
        if (string2 == null) {
            return "";
        }
        object = ".";
        int n4 = 0;
        stringArray = null;
        int n7 = StringsKt.F(string2, (CharSequence)object, false);
        if (n7 == 0) {
            object = ".00";
            string2 = string2.concat((String)object);
        }
        object = fT1.a("\\.", string2);
        stringArray = new String[0];
        n4 = ((String[])(object = object.toArray(stringArray))).length;
        if (n4 > (n3 = 1) && (n7 = ((String)(object = object[n3])).length()) == n3) {
            object = "0";
            string2 = string2.concat((String)object);
        }
        return string2;
    }

    public static final String q(float f5) {
        String string2 = qz2_0.l(Float.valueOf(f5));
        return kp1_0.c("-\u20b9", string2);
    }

    public static final String r(Price object) {
        int n3 = 1;
        if (object == null || (object = ((Price)object).getFormattedValue()) == null) {
            object = "0";
        }
        object = mz3_0.h((String)object);
        Object[] objectArray = StringCompanionObject.INSTANCE;
        objectArray = new Object[n3];
        objectArray[0] = object;
        return xh2_0.a(objectArray, n3, "\u20b9%s", "format(...)");
    }

    public static final String s(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            return kp1_0.c("\u20b9", string2);
        }
        return qz2_0.z();
    }

    public static final String t(float f5) {
        return hj0_0.a((int)f5, "\u20b9");
    }

    public static final String u(float f5) {
        String string2 = qz2_0.l(Float.valueOf(f5));
        return kp1_0.c("\u20b9", string2);
    }

    public static final String v(int n3) {
        return hj0_0.a(n3, "\u20b9");
    }

    public static final String w(Double object) {
        object = qz2_0.k((Double)object);
        return kp1_0.c("\u20b9", (String)object);
    }

    public static final String x(Float object) {
        float f5;
        double d2;
        String string2;
        DecimalFormat decimalFormat;
        String string3 = "";
        if (object != null && (object = (decimalFormat = new DecimalFormat(string2 = "#,###,###.##")).format(d2 = (double)(f5 = ((Float)object).floatValue()))) != null) {
            string3 = "\u20b9".concat((String)object);
        }
        return string3;
    }

    public static final String y(float f5) {
        String[] stringArray = "#,###,###.##";
        Object object = new DecimalFormat((String)stringArray);
        double d2 = f5;
        String string2 = ((NumberFormat)object).format(d2);
        if (string2 == null) {
            string2 = "";
        } else {
            int n3;
            StringsKt.F(string2, ".", false);
            String string3 = "\\.";
            object = new Regex(string3);
            object = ((Regex)object).e(string2);
            stringArray = new String[]{};
            object = object.toArray(stringArray);
            int n4 = ((String[])object).length;
            int n7 = 1;
            if (n4 > n7 && (n3 = ((String)(object = object[n7])).length()) == n7) {
                object = "0";
                string2 = string2.concat((String)object);
            }
        }
        return kp1_0.c("\u20b9", string2);
    }

    public static final String z() {
        String string2 = qz2_0.l(Float.valueOf(0.0f));
        return kp1_0.c("\u20b9", string2);
    }
}

