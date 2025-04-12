/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Payment.InstantDiscountInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from No2
 */
public final class no2_0 {
    public static String a = "";
    public static String b = "";
    public static boolean c;
    public static Float d;
    public static Float e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(InstantDiscountInfo instantDiscountInfo, TextView textView, dv_0 object) {
        String string2;
        block20: {
            block22: {
                Exception exception2;
                block19: {
                    int n3;
                    Object object2;
                    int n4;
                    int n7;
                    int n8;
                    Object object3;
                    Object object4;
                    int n10;
                    block21: {
                        block16: {
                            block18: {
                                block17: {
                                    int n14;
                                    Intrinsics.checkNotNullParameter(textView, "discountTV");
                                    n10 = 0;
                                    object4 = null;
                                    if (instantDiscountInfo != null) {
                                        string2 = instantDiscountInfo.getDescription();
                                    } else {
                                        n14 = 0;
                                        string2 = null;
                                    }
                                    if (string2 == null) return;
                                    n14 = string2.length();
                                    if (n14 == 0) {
                                        return;
                                    }
                                    if (instantDiscountInfo != null) {
                                        string2 = instantDiscountInfo.getDescription();
                                    } else {
                                        n14 = 0;
                                        string2 = null;
                                    }
                                    if (instantDiscountInfo != null) {
                                        object3 = instantDiscountInfo.getTncURL();
                                    } else {
                                        n8 = 0;
                                        object3 = null;
                                    }
                                    if (object3 == null || (n8 = ((String)object3).length()) == 0) break block20;
                                    if (instantDiscountInfo != null) {
                                        object4 = instantDiscountInfo.getDescription();
                                    }
                                    object4 = Ft2.a((String)object4, " T&C");
                                    string2 = new SpannableString((CharSequence)object4);
                                    try {
                                        n8 = (int)(og1_1.b() ? 1 : 0);
                                        n7 = 0;
                                        if (n8 == 0) break block16;
                                        n4 = R$color.pesdk_lux_color_3;
                                        n4 = hv3_0.m(n4);
                                        object3 = new ForegroundColorSpan(n4);
                                        if (instantDiscountInfo == null || (object2 = instantDiscountInfo.getDescription()) == null) break block17;
                                        n4 = ((String)object2).length();
                                        break block18;
                                    }
                                    catch (Exception exception2) {
                                        break block19;
                                    }
                                }
                                n4 = 0;
                                object2 = null;
                            }
                            n3 = ((String)object4).length();
                            string2.setSpan(object3, n4, n3, 0);
                            break block21;
                        }
                        n4 = R$color.pesdk_color_3;
                        n4 = hv3_0.m(n4);
                        object3 = new ForegroundColorSpan(n4);
                        if (instantDiscountInfo != null && (object2 = instantDiscountInfo.getDescription()) != null) {
                            n4 = ((String)object2).length();
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        n3 = ((String)object4).length();
                        string2.setSpan(object3, n4, n3, 0);
                    }
                    object3 = FontsManager.getInstance();
                    object2 = AJIOApplication.Companion;
                    object2.getClass();
                    object2 = AJIOApplication$a.a();
                    n3 = 8;
                    object3 = ((FontsManager)object3).getTypefaceWithFont((Context)object2, n3);
                    object2 = "getTypefaceWithFont(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    String string3 = "";
                    object2 = new AjioCustomTypefaceSpan(string3, (Typeface)object3);
                    if (instantDiscountInfo != null && (object3 = instantDiscountInfo.getDescription()) != null) {
                        n8 = ((String)object3).length();
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    n3 = ((String)object4).length();
                    int n15 = 34;
                    string2.setSpan(object2, n8, n3, n15);
                    object3 = new No2$a((dv_0)object, instantDiscountInfo);
                    if (instantDiscountInfo != null && (object2 = instantDiscountInfo.getDescription()) != null) {
                        n7 = ((String)object2).length();
                    }
                    n10 = ((String)object4).length();
                    n4 = 33;
                    string2.setSpan(object3, n7, n10, n4);
                    object4 = LinkMovementMethod.getInstance();
                    textView.setMovementMethod((MovementMethod)object4);
                    object4 = cp_1.Companion;
                    object4.getClass();
                    object4 = cp$a.e();
                    object4.getClass();
                    n10 = (int)(cp_1.f() ? 1 : 0);
                    if (n10 != 0) {
                        object4 = new Mo2((dv_0)object, instantDiscountInfo);
                        textView.setOnClickListener((View.OnClickListener)object4);
                    }
                    break block22;
                }
                object = yn3_0.a;
                ((yn3$a)object).e(exception2);
            }
            textView.setText((CharSequence)string2);
            return;
        }
        textView.setText((CharSequence)string2);
    }
}

