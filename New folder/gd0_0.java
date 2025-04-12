/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  android.widget.TextView
 */
import android.app.Activity;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textfield.TextInputLayout;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$ExchangeReturnSubReasons;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from gD0
 */
public final class gd0_0 {
    public static final gD0$c Companion;
    public final boolean a;
    public final gD0$b b;
    public final ud0_0 c;
    public int d;
    public String e;
    public gD0$a f;
    public CartEntry g;
    public ActionContent h;
    public boolean i;
    public Activity j;
    public String k;
    public String l;
    public gD0$f m;
    public final NewCustomEventsRevamp n;
    public String o;
    public String p;
    public String q;
    public float r;

    static {
        gD0$c gD0$c;
        Companion = gD0$c = new Object();
    }

    public gd0_0(boolean bl2, gD0$b gD0$b, ud0_0 ud0_02) {
        this.a = bl2;
        this.b = gD0$b;
        this.c = ud0_02;
        Object object = "";
        this.e = object;
        this.l = object;
        this.m = object = new Object();
        this.n = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean a(gd0_0 object, String string2) {
        boolean bl2;
        object.getClass();
        object = Locale.ENGLISH;
        String string3 = "ENGLISH";
        String string4 = "toLowerCase(...)";
        object = zn0_1.a((Locale)object, string3, string2, (Locale)object, string4);
        int n3 = ((String)object).hashCode();
        int n4 = 9688177;
        if (n3 != n4) {
            n4 = 881759397;
            if (n3 != n4) {
                n4 = 2079796212;
                if (n3 != n4) return false;
                string2 = "size is smaller than expected";
                bl2 = ((String)object).equals(string2);
                if (bl2) return true;
                return false;
            }
        } else {
            string2 = "does not fit well";
            bl2 = ((String)object).equals(string2);
            if (bl2) return true;
            return false;
        }
        string2 = "size is larger than expected";
        bl2 = ((String)object).equals(string2);
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void b(gd0_0 var0, String var1_1, boolean var2_2) {
        block38: {
            block43: {
                block39: {
                    block42: {
                        block40: {
                            block41: {
                                block35: {
                                    block37: {
                                        block36: {
                                            block34: {
                                                var3_3 = var0.a;
                                                var4_4 = true;
                                                if (var3_3 != 0 || !var2_2) break block34;
                                                var5_5 = R$string.exchange_not_allowed;
                                                var1_1 = hv3_0.K((int)var5_5);
                                                break block35;
                                            }
                                            var6_6 = "Does Not Fit Well";
                                            var7_7 = kotlin.text.b.i((String)var1_1, (String)var6_6, var4_4);
                                            var8_8 = "";
                                            if (!var7_7) break block36;
                                            if (var3_3 != 0) ** GOTO lbl-1000
                                            var5_5 = R$string.exchange_subreason_message_3;
                                            var1_1 = hv3_0.K((int)var5_5);
                                            break block35;
                                        }
                                        var6_6 = "Size Is Larger than Expected";
                                        var7_7 = kotlin.text.b.i((String)var1_1, (String)var6_6, var4_4);
                                        if (!var7_7) break block37;
                                        if (var3_3 != 0) ** GOTO lbl-1000
                                        var5_5 = R$string.exchange_subreason_message_1;
                                        var1_1 = hv3_0.K((int)var5_5);
                                        break block35;
                                    }
                                    var6_6 = "Size Is Smaller Than Expected";
                                    var5_5 = kotlin.text.b.i((String)var1_1, (String)var6_6, var4_4);
                                    if (var5_5 && var3_3 == 0) {
                                        var5_5 = R$string.exchange_subreason_message_2;
                                        var1_1 = hv3_0.K((int)var5_5);
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        var1_1 = var8_8;
                                    }
                                }
                                var6_6 = var0.f;
                                if (var6_6 == null) break block38;
                                var9_9 = var1_1.length();
                                var10_10 = 8;
                                if (var9_9 <= 0) break block39;
                                var8_8 = var6_6.k;
                                Intrinsics.checkNotNull(var8_8);
                                var8_8.setText((CharSequence)var1_1);
                                if (var3_3 != 0) break block40;
                                var1_1 = var6_6.m;
                                if (var1_1 != null) {
                                    var8_8 = new UC0((gd0_0)var0, (gD0$a)var6_6);
                                    var1_1.setOnClickListener((View.OnClickListener)var8_8);
                                }
                                var1_1 = var0.g;
                                var9_9 = 0;
                                var8_8 = null;
                                if (var1_1 == null || (var5_5 = (boolean)var1_1.isReturnable()) != var4_4) break block41;
                                var1_1 = var0.g;
                                if (var1_1 != null && (var1_1 = var1_1.getReason()) != null) {
                                    var1_1 = StringsKt.m0((CharSequence)var1_1).toString();
                                } else {
                                    var5_5 = false;
                                    var1_1 = null;
                                }
                                var11_11 = R$string.wrong_item_shipped;
                                var12_12 = hv3_0.K(var11_11);
                                var5_5 = kotlin.text.b.i((String)var1_1, var12_12, var4_4);
                                if (!var5_5) break block41;
                                var1_1 = var6_6.l;
                                if (var1_1 != null) {
                                    var9_9 = R$string.eligible_exchange_msg;
                                    var8_8 = hv3_0.K(var9_9);
                                    ai0_2.z((TextView)var1_1, (String)var8_8);
                                }
                                if ((var1_1 = var6_6.n) != null) {
                                    var9_9 = R$string.returnable_info;
                                    var8_8 = hv3_0.K(var9_9);
                                    ai0_2.z((TextView)var1_1, (String)var8_8);
                                }
                                if ((var1_1 = var6_6.o) != null) {
                                    ai0_2.B((View)var1_1);
                                }
                                if ((var1_1 = var6_6.o) != null) {
                                    var11_11 = 0;
                                    var12_12 = null;
                                    var8_8 = new vc0_0(var0, 0);
                                    var1_1.setOnClickListener((View.OnClickListener)var8_8);
                                }
                                if ((var1_1 = var6_6.s) != null) {
                                    ai0_2.B((View)var1_1);
                                }
                                if ((var1_1 = var6_6.g) != null) {
                                    ai0_2.i((View)var1_1);
                                }
                                if ((var1_1 = var6_6.j) != null) {
                                    ai0_2.i((View)var1_1);
                                }
                                break block42;
                            }
                            if ((var1_1 = var0.g) != null && (var5_5 = (boolean)var1_1.isReturnable()) == var4_4) ** GOTO lbl-1000
                            var1_1 = var0.g;
                            if (var1_1 != null && (var1_1 = var1_1.getReason()) != null) {
                                var1_1 = StringsKt.m0((CharSequence)var1_1);
                                var8_8 = var1_1.toString();
                            }
                            if (var5_5 = (boolean)kotlin.text.b.i((String)var8_8, (String)(var1_1 = hv3_0.K(R$string.wrong_item_shipped)), false)) {
                                var1_1 = var6_6.l;
                                if (var1_1 != null) {
                                    var9_9 = R$string.eligible_exchange_msg;
                                    var8_8 = hv3_0.K(var9_9);
                                    ai0_2.z((TextView)var1_1, (String)var8_8);
                                }
                                if ((var1_1 = var6_6.n) != null) {
                                    var9_9 = R$string.not_returnable_info;
                                    var8_8 = hv3_0.K(var9_9);
                                    ai0_2.z((TextView)var1_1, (String)var8_8);
                                }
                                if ((var1_1 = var6_6.o) != null) {
                                    ai0_2.i((View)var1_1);
                                }
                                if ((var1_1 = var6_6.s) != null) {
                                    ai0_2.B((View)var1_1);
                                }
                                if ((var1_1 = var6_6.g) != null) {
                                    ai0_2.i((View)var1_1);
                                }
                                if ((var1_1 = var6_6.j) != null) {
                                    ai0_2.i((View)var1_1);
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                if ((var1_1 = var6_6.g) != null) {
                                    ai0_2.B((View)var1_1);
                                }
                                if ((var1_1 = var6_6.j) != null) {
                                    ai0_2.B((View)var1_1);
                                }
                                if ((var1_1 = var6_6.s) != null) {
                                    ai0_2.i((View)var1_1);
                                }
                                var1_1 = var6_6.r;
                                Intrinsics.checkNotNull(var1_1);
                                var1_1.setVisibility(0);
                            }
                            break block42;
                        }
                        var1_1 = var6_6.r;
                        Intrinsics.checkNotNull(var1_1);
                        var1_1.setVisibility(0);
                    }
                    if ((var1_1 = var6_6.k) != null) {
                        var1_1.setVisibility(0);
                    }
                    if ((var1_1 = var6_6.t) != null) {
                        var1_1.setVisibility(0);
                    }
                    if (var3_3 == 0) ** GOTO lbl-1000
                    var1_1 = var0.g;
                    Intrinsics.checkNotNull(var1_1);
                    var5_5 = var1_1.isExchangeEligible();
                    if (var5_5) {
                        var1_1 = var6_6.p;
                        Intrinsics.checkNotNull(var1_1);
                        var3_3 = R$string.return_subreason_message_action_msg;
                        var13_13 = hv3_0.K(var3_3);
                        var1_1.setText((CharSequence)var13_13);
                        var1_1 = var6_6.p;
                        Intrinsics.checkNotNull(var1_1);
                        var1_1.setVisibility(0);
                    } else if (var3_3 == 0) {
                        var1_1 = var6_6.p;
                        Intrinsics.checkNotNull(var1_1);
                        var1_1.setVisibility(0);
                        var1_1 = var6_6.p;
                        Intrinsics.checkNotNull(var1_1);
                        var3_3 = R$string.create_return_request;
                        var13_14 = hv3_0.K(var3_3);
                        var1_1.setText((CharSequence)var13_14);
                        var1_1 = var6_6.t;
                        Intrinsics.checkNotNull(var1_1);
                        var1_1.setVisibility(0);
                    } else {
                        var1_1 = var6_6.p;
                        Intrinsics.checkNotNull(var1_1);
                        var1_1.setVisibility(var10_10);
                        var1_1 = var6_6.t;
                        Intrinsics.checkNotNull(var1_1);
                        var1_1.setVisibility(var10_10);
                    }
                    break block43;
                }
                var1_1 = var6_6.s;
                if (var1_1 != null) {
                    ai0_2.i((View)var1_1);
                }
                var1_1 = var6_6.r;
                Intrinsics.checkNotNull(var1_1);
                var1_1.setVisibility(var10_10);
                var1_1 = var6_6.k;
                Intrinsics.checkNotNull(var1_1);
                var1_1.setVisibility(var10_10);
                var1_1 = var6_6.p;
                Intrinsics.checkNotNull(var1_1);
                var1_1.setVisibility(var10_10);
                var1_1 = var6_6.t;
                Intrinsics.checkNotNull(var1_1);
                var1_1.setVisibility(var10_10);
            }
            var0 = var0.b;
            if (var0 != null) {
                if (var2_2) {
                    var0.d8(var4_4);
                } else {
                    var0.d8(false);
                    var0.m9();
                }
            }
        }
    }

    public static /* synthetic */ void d(gd0_0 gd0_02, int n3, int n4) {
        String string2 = hv3_0.K(R$string.more_feedback);
        gd0_02.c(n3, n4, string2);
    }

    public static void h(View view, String string2, int n3) {
        Intrinsics.checkNotNullParameter(view, "view");
        int n4 = R$id.alert_text;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, "findViewById(...)");
        ((AjioTextView)view2).setText(string2);
        view.setVisibility(n3);
    }

    public static void o(gD0$a object, int n3, int n4) {
        int n7 = 3;
        if (n3 != n7) {
            n4 = 4;
            if (n3 == n4) {
                Intrinsics.checkNotNull(object);
                CustomTextViewImpl customTextViewImpl = ((gD0$a)object).g;
                Intrinsics.checkNotNull(customTextViewImpl);
                n4 = 0;
                customTextViewImpl.setVisibility(0);
                customTextViewImpl = ((gD0$a)object).h;
                n3 = fd0_0.c((AjioEditText)customTextViewImpl);
                n7 = 8;
                if (n3 > 0) {
                    customTextViewImpl = ((gD0$a)object).j;
                    Intrinsics.checkNotNull(customTextViewImpl);
                    customTextViewImpl.setVisibility(n7);
                    customTextViewImpl = ((gD0$a)object).h;
                    Intrinsics.checkNotNull(customTextViewImpl);
                    customTextViewImpl.setVisibility(0);
                    customTextViewImpl = ((gD0$a)object).q;
                    Intrinsics.checkNotNull(customTextViewImpl);
                    customTextViewImpl.setVisibility(0);
                    customTextViewImpl = ((gD0$a)object).i;
                    if (customTextViewImpl != null) {
                        ai0_2.B((View)customTextViewImpl);
                    }
                } else {
                    customTextViewImpl = ((gD0$a)object).j;
                    Intrinsics.checkNotNull(customTextViewImpl);
                    customTextViewImpl.setVisibility(0);
                    customTextViewImpl = ((gD0$a)object).h;
                    Intrinsics.checkNotNull(customTextViewImpl);
                    customTextViewImpl.setVisibility(n7);
                    customTextViewImpl = ((gD0$a)object).q;
                    Intrinsics.checkNotNull(customTextViewImpl);
                    customTextViewImpl.setVisibility(n7);
                    customTextViewImpl = ((gD0$a)object).i;
                    if (customTextViewImpl != null) {
                        ai0_2.i((View)customTextViewImpl);
                    }
                }
                customTextViewImpl = ((gD0$a)object).h;
                Intrinsics.checkNotNull(customTextViewImpl);
                customTextViewImpl.clearFocus();
                object = ((gD0$a)object).h;
                Intrinsics.checkNotNull(object);
                object.setCursorVisible(false);
            }
        } else {
            Intrinsics.checkNotNull(object);
            Spinner spinner = ((gD0$a)object).d;
            Intrinsics.checkNotNull(spinner);
            n7 = -1;
            if (n4 == n7) {
                object = ((gD0$a)object).d;
                Intrinsics.checkNotNull(object);
                n4 = object.getSelectedItemPosition();
            }
            spinner.setSelection(n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(int n3, int n4, String object) {
        AjioEditText ajioEditText;
        LinearLayout linearLayout;
        Object object2;
        gD0$a gD0$a = this.f;
        if (gD0$a == null) return;
        boolean bl2 = this.a;
        if (!bl2) {
            object2 = this.g;
            if (object2 != null && (object2 = ((CartEntry)object2).getReason()) != null) {
                object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
            } else {
                bl2 = false;
                object2 = null;
            }
            int n7 = R$string.wrong_item_shipped;
            String string2 = hv3_0.K(n7);
            boolean bl3 = true;
            bl2 = kotlin.text.b.i((String)object2, string2, bl3);
            if (bl2) {
                AjioTextView ajioTextView;
                AjioTextView ajioTextView2 = gD0$a.g;
                if (ajioTextView2 != null) {
                    ai0_2.i((View)ajioTextView2);
                }
                if ((ajioTextView = gD0$a.j) == null) return;
                ai0_2.i((View)ajioTextView);
                return;
            }
        }
        if ((object2 = gD0$a.g) != null) {
            object2.setText((CharSequence)object);
        }
        if ((object = gD0$a.g) != null) {
            object.setVisibility(n3);
        }
        if ((object = gD0$a.j) != null) {
            object.setVisibility(n3);
        }
        if ((linearLayout = gD0$a.i) != null) {
            linearLayout.setVisibility(n4);
        }
        if ((ajioEditText = gD0$a.h) == null) return;
        ajioEditText.setVisibility(n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void e(ArrayList var1_1, List var2_2, CartEntry var3_3, FragmentActivity var4_4, View var5_5, boolean var6_6, NestedScrollView var7_7, String var8_8, String var9_9) {
        block46: {
            block47: {
                block43: {
                    block42: {
                        block44: {
                            var10_10 = this;
                            var11_11 = var1_1;
                            var12_12 = var2_2;
                            var13_13 = var3_3;
                            var14_14 = var4_4;
                            var15_15 = var5_5;
                            var16_16 = var7_7;
                            var17_17 /* !! */  = var8_8;
                            var18_18 = var9_9;
                            Intrinsics.checkNotNullParameter(var1_1, "reasons");
                            Intrinsics.checkNotNullParameter(var3_3, "cartEntry");
                            Intrinsics.checkNotNullParameter(var4_4, "activity");
                            Intrinsics.checkNotNullParameter(var5_5, "reasonView");
                            Intrinsics.checkNotNullParameter(var7_7, "scrollView");
                            this.j = var4_4;
                            this.g = var3_3;
                            this.f = var19_19 = new Object();
                            var20_20 = R$id.layoutErrorExchange;
                            var19_19.s = var21_21 /* !! */  = var5_5.findViewById(var20_20);
                            var20_20 = R$id.row_exchange_edd_error_tv_error;
                            var21_21 /* !! */  = (AjioTextView)var5_5.findViewById(var20_20);
                            var19_19.l = var21_21 /* !! */ ;
                            var20_20 = R$id.tvLearnWhy;
                            var21_21 /* !! */  = (AjioTextView)var5_5.findViewById(var20_20);
                            var19_19.m = var21_21 /* !! */ ;
                            var20_20 = R$id.tvCreateReturnInfo;
                            var21_21 /* !! */  = (AjioTextView)var5_5.findViewById(var20_20);
                            var19_19.n = var21_21 /* !! */ ;
                            var20_20 = R$id.tvCreateReturn;
                            var21_21 /* !! */  = (AjioTextView)var5_5.findViewById(var20_20);
                            var19_19.o = var21_21 /* !! */ ;
                            var20_20 = R$id.layout_return_user_msg;
                            var19_19.r = var21_21 /* !! */  = var5_5.findViewById(var20_20);
                            var20_20 = R$id.cancelReasonsDropDown;
                            var21_21 /* !! */  = (Spinner)var5_5.findViewById(var20_20);
                            var19_19.d = var21_21 /* !! */ ;
                            var20_20 = R$id.cancel_subreasons_drop_down;
                            var21_21 /* !! */  = (Spinner)var5_5.findViewById(var20_20);
                            var19_19.e = var21_21 /* !! */ ;
                            var20_20 = R$id.cancel_subreasons_spinner_layout;
                            var21_21 /* !! */  = (RelativeLayout)var5_5.findViewById(var20_20);
                            var19_19.f = var21_21 /* !! */ ;
                            var21_21 /* !! */  = var19_19.e;
                            var22_22 = 0;
                            var23_23 = null;
                            if (var21_21 /* !! */  != null) {
                                var21_21 /* !! */ .setClickable(false);
                            }
                            var20_20 = R$id.iv_cancel_reasons_drop_down;
                            var21_21 /* !! */  = (ImageView)var15_15.findViewById(var20_20);
                            var19_19.b = var21_21 /* !! */ ;
                            var20_20 = R$id.iv_cancel_subreasons_drop_down;
                            var21_21 /* !! */  = (ImageView)var15_15.findViewById(var20_20);
                            var19_19.c = var21_21 /* !! */ ;
                            var20_20 = R$id.til;
                            var21_21 /* !! */  = (TextInputLayout)var15_15.findViewById(var20_20);
                            var19_19.w = var21_21 /* !! */ ;
                            var20_20 = R$id.layout_exchange_in_return;
                            var19_19.a = var21_21 /* !! */  = var15_15.findViewById(var20_20);
                            var20_20 = R$id.exchange_return_comments_label;
                            var21_21 /* !! */  = (AjioTextView)var15_15.findViewById(var20_20);
                            var19_19.g = var21_21 /* !! */ ;
                            var20_20 = R$id.return_item_comments_box;
                            var21_21 /* !! */  = (AjioEditText)var15_15.findViewById(var20_20);
                            var19_19.h = var21_21 /* !! */ ;
                            var20_20 = R$id.llCommentBox;
                            var21_21 /* !! */  = (LinearLayout)var15_15.findViewById(var20_20);
                            var19_19.i = var21_21 /* !! */ ;
                            var20_20 = R$id.exchange_return_comments_btn;
                            var21_21 /* !! */  = (AjioTextView)var15_15.findViewById(var20_20);
                            var19_19.j = var21_21 /* !! */ ;
                            var20_20 = R$id.return_user_msg;
                            var21_21 /* !! */  = (AjioTextView)var15_15.findViewById(var20_20);
                            var19_19.k = var21_21 /* !! */ ;
                            var20_20 = R$id.return_user_action_msg;
                            var21_21 /* !! */  = (AjioTextView)var15_15.findViewById(var20_20);
                            var19_19.p = var21_21 /* !! */ ;
                            var20_20 = R$id.imgCaution;
                            var21_21 /* !! */  = (ImageView)var15_15.findViewById(var20_20);
                            var19_19.t = var21_21 /* !! */ ;
                            var20_20 = R$id.edt;
                            var21_21 /* !! */  = (EditText)var15_15.findViewById(var20_20);
                            var19_19.u = var21_21 /* !! */ ;
                            var20_20 = R$id.edtSubReason;
                            var21_21 /* !! */  = (EditText)var15_15.findViewById(var20_20);
                            var19_19.v = var21_21 /* !! */ ;
                            var20_20 = R$id.tvTotalChars;
                            var15_15 = (AjioTextView)var15_15.findViewById(var20_20);
                            var19_19.q = var15_15;
                            var24_24 = var10_10.a;
                            if (var24_24 != 0) {
                                var10_10.f(false);
                            }
                            if ((var15_15 = var19_19.j) != null) {
                                var21_21 /* !! */  = new XC0(var10_10, var19_19, var16_16);
                                var15_15.setOnClickListener((View.OnClickListener)var21_21 /* !! */ );
                            }
                            if ((var15_15 = var19_19.c) != null) {
                                var21_21 /* !! */  = new YC0(var19_19);
                                var15_15.setOnClickListener((View.OnClickListener)var21_21 /* !! */ );
                            }
                            if ((var15_15 = var19_19.b) != null) {
                                var25_25 = 0;
                                var26_26 = null;
                                var21_21 /* !! */  = new ZC0(var19_19, 0);
                                var15_15.setOnClickListener((View.OnClickListener)var21_21 /* !! */ );
                            }
                            if ((var15_15 = var19_19.b) != null) {
                                var21_21 /* !! */  = new ad0_1(var19_19);
                                var15_15.setOnClickListener((View.OnClickListener)var21_21 /* !! */ );
                            }
                            if ((var15_15 = var19_19.p) != null) {
                                var25_25 = 0;
                                var26_26 = null;
                                var21_21 /* !! */  = new bd0_1(0, var10_10, var19_19);
                                var15_15.setOnClickListener((View.OnClickListener)var21_21 /* !! */ );
                            }
                            var20_20 = R$layout.cancel_reason_spinner_layout;
                            var15_15 = new ck_2(var14_14, var20_20, (ArrayList)var11_11);
                            var21_21 /* !! */  = var19_19.d;
                            if (var21_21 /* !! */  != null) {
                                var21_21 /* !! */ .setAdapter((SpinnerAdapter)var15_15);
                            }
                            if ((var21_21 /* !! */  = var19_19.d) != null) {
                                var26_26 = "";
                                var21_21 /* !! */ .setPrompt((CharSequence)var26_26);
                            }
                            var20_20 = (int)TextUtils.isEmpty((CharSequence)var8_8);
                            var27_27 = 1;
                            if (var20_20 != 0 || (var20_20 = (int)TextUtils.isEmpty((CharSequence)var9_9)) != 0) break block43;
                            var20_20 = var1_1.size();
                            var26_26 = null;
                            for (var25_25 = 0; var25_25 < var20_20; ++var25_25) {
                                var28_28 = (String)var11_11.get(var25_25);
                                var29_29 = (int)kotlin.text.b.i(var28_28, (String)var17_17 /* !! */ , (boolean)var27_27);
                                if (var29_29 == 0) continue;
                                var13_13.setReason((String)var17_17 /* !! */ );
                                var13_13.setReasonIndex(var25_25);
                                var11_11 = var19_19.d;
                                if (var11_11 == null) break;
                                var11_11.setSelection(var25_25);
                                break;
                            }
                            var11_11 = new ArrayList();
                            var21_21 /* !! */  = "Select Sub Reason";
                            var11_11.add(var21_21 /* !! */ );
                            if (var12_12 == null) break block44;
                            var21_21 /* !! */  = var12_12;
                            var21_21 /* !! */  = xx_2.g((Collection)var12_12);
                            var20_20 = var21_21 /* !! */ .b;
                            if (var20_20 < 0) break block44;
                            var25_25 = 0;
                            var26_26 = null;
                            var29_29 = 0;
                            var28_28 = null;
                            var30_30 = 0;
                            while (true) {
                                block45: {
                                    if ((var34_34 = kotlin.text.b.i(var33_33 /* !! */  = (var32_32 = (var31_31 = (ReturnOrderItemDetails$ExchangeReturnSubReasons)var12_12.get(var25_25)).getKey()).getValue(), (String)var17_17 /* !! */ , (boolean)var27_27)) == 0) break block45;
                                    var33_33 /* !! */  = var31_31.getValue();
                                    Intrinsics.checkNotNull(var33_33 /* !! */ );
                                    var35_35 = "|";
                                    var36_36 = StringsKt.F(var33_33 /* !! */ , (CharSequence)var35_35, false);
                                    if (!var36_36) break block45;
                                    var35_35 = Pattern.quote((String)var35_35);
                                    Intrinsics.checkNotNullExpressionValue(var35_35, "quote(...)");
                                    var23_23 = new Regex((String)var35_35);
                                    var23_23 = var23_23.e(var33_33 /* !! */ );
                                    var35_35 = new ArrayList<String>();
                                    var23_23 = var23_23.iterator();
                                    while ((var34_34 = var23_23.hasNext()) != 0) {
                                        var37_37 /* !! */  = var33_33 /* !! */  = var23_23.next();
                                        var37_37 /* !! */  = var33_33 /* !! */ ;
                                        var38_38 = TextUtils.isEmpty((CharSequence)var37_37 /* !! */ ) ^ 1;
                                        if (var38_38 == 0) continue;
                                        var35_35.add(var33_33 /* !! */ );
                                    }
                                    var23_23 = new String[]{};
                                    var23_23 = (String[])var35_35.toArray((T[])var23_23);
                                    var27_27 = ((Object)var23_23).length;
                                    var33_33 /* !! */  = null;
                                    for (var34_34 = 0; var34_34 < var27_27; ++var34_34) {
                                        block40: {
                                            block41: {
                                                var12_12 = var23_23[var34_34];
                                                var38_38 = var12_12.length() + -1;
                                                var1_1 = var23_23;
                                                var22_22 = var38_38;
                                                var39_39 = 0;
                                                var17_17 /* !! */  = null;
                                                var38_38 = 0;
                                                var37_37 /* !! */  = null;
                                                block4: while (true) {
                                                    var40_40 = var27_27;
                                                    if (var39_39 > var22_22) break block40;
                                                    var27_27 = var38_38 == 0 ? var39_39 : var22_22;
                                                    var41_41 = Intrinsics.compare(var27_27 = (int)var12_12.charAt(var27_27), 32);
                                                    if (var41_41 <= 0) {
                                                        var41_41 = 1;
                                                    } else {
                                                        var41_41 = 0;
                                                        var10_10 = null;
                                                    }
                                                    if (var38_38 != 0) break block41;
                                                    if (var41_41 != 0) break;
                                                    var38_38 = 1;
lbl195:
                                                    // 3 sources

                                                    while (true) {
                                                        var10_10 = this;
                                                        var27_27 = var40_40;
                                                        continue block4;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                ++var39_39;
                                                ** GOTO lbl195
                                            }
                                            if (var41_41 != 0) {
                                                var22_22 += -1;
                                                ** continue;
                                            }
                                        }
                                        var17_17 /* !! */  = var12_12.subSequence(var39_39, ++var22_22).toString();
                                        var11_11.add(var17_17 /* !! */ );
                                        ++var30_30;
                                        var42_42 = (int)var12_12.equalsIgnoreCase((String)var18_18);
                                        if (var42_42 != 0 && var29_29 == 0) {
                                            var29_29 = var30_30;
                                        }
                                        var10_10 = this;
                                        var23_23 = var1_1;
                                        var12_12 = var2_2;
                                        var17_17 /* !! */  = var8_8;
                                        var27_27 = var40_40;
                                    }
                                }
                                if (var25_25 != var20_20) {
                                    ++var25_25;
                                    var10_10 = this;
                                    var12_12 = var2_2;
                                    var17_17 /* !! */  = var8_8;
                                    var22_22 = 0;
                                    var23_23 = null;
                                    var27_27 = 1;
                                    continue;
                                }
                                break block42;
                                break;
                            }
                        }
                        var29_29 = 0;
                        var28_28 = null;
                    }
                    var39_39 = R$layout.cancel_reason_spinner_layout;
                    var12_12 = new ck_2(var14_14, var39_39, (ArrayList)var11_11);
                    var17_17 /* !! */  = var19_19.e;
                    if (var17_17 /* !! */  != null) {
                        var17_17 /* !! */ .setAdapter((SpinnerAdapter)var12_12);
                    }
                    var42_42 = var3_3.getReasonIndex();
                    var17_17 /* !! */  = new StringBuilder();
                    var17_17 /* !! */ .append(var42_42);
                    var12_12 = "_";
                    var17_17 /* !! */ .append((String)var12_12);
                    var17_17 /* !! */ .append(var29_29);
                    var17_17 /* !! */  = var17_17 /* !! */ .toString();
                    var13_13.setSubreasonIndex((String)var17_17 /* !! */ );
                    var17_17 /* !! */  = var3_3.getSubreasonIndex();
                    if (var17_17 /* !! */  == null) ** GOTO lbl-1000
                    var20_20 = 0;
                    var21_21 /* !! */  = null;
                    var25_25 = (int)StringsKt.F((CharSequence)var17_17 /* !! */ , (CharSequence)var12_12, false);
                    if (var25_25 != 0) {
                        var12_12 = fT1.a((String)var12_12, (String)var17_17 /* !! */ );
                        var17_17 /* !! */  = new Spinner[]{};
                        var12_12 = var12_12.toArray((T[])var17_17 /* !! */ );
                        var17_17 /* !! */  = var19_19.e;
                        if (var17_17 /* !! */  != null) {
                            var20_20 = 1;
                            var12_12 = var12_12[var20_20];
                            var42_42 = Integer.parseInt((String)var12_12);
                            var17_17 /* !! */ .setSelection(var42_42);
                        }
                    } else if ((var12_12 = var19_19.e) != null) {
                        var39_39 = 0;
                        var17_17 /* !! */  = null;
                        var12_12.setSelection(0);
                    }
                    var39_39 = 1;
                    var12_12 = new c9((ViewGroup)var16_16, var39_39);
                    var43_43 = 100;
                    var16_16.postDelayed((Runnable)var12_12, var43_43);
                    var24_24 = var15_15.getCount();
                    var42_42 = 1;
                    if (var24_24 > var42_42) {
                        var10_10 = this;
                        var15_15 = this.f;
                        var42_42 = 3;
                        var39_39 = var3_3.getReasonIndex();
                        gd0_0.o((gD0$a)var15_15, var42_42, var39_39);
                    } else {
                        var10_10 = this;
                        var15_15 = this.f;
                        var42_42 = 4;
                        var39_39 = 0;
                        var17_17 /* !! */  = null;
                        gd0_0.o((gD0$a)var15_15, var42_42, 0);
                        var15_15 = this.f;
                        Intrinsics.checkNotNull(var15_15);
                        var15_15 = var15_15.d;
                        if (var15_15 != null) {
                            var42_42 = var3_3.getReasonIndex();
                            var15_15.setSelection(var42_42);
                        }
                    }
                    var45_44 = var11_11.size();
                    var24_24 = 1;
                    if (var45_44 <= var24_24) {
                        var11_11 = var19_19.c;
                        if (var11_11 != null) {
                            var24_24 = 8;
                            var11_11.setVisibility(var24_24);
                        }
                    } else {
                        Intrinsics.checkNotNull(var9_9);
                        var10_10.i((String)var18_18, var29_29, var16_16);
                        var10_10.j(var14_14);
                    }
                }
                if ((var23_23 = var19_19.d) != null) {
                    var11_11 = var35_35;
                    var15_15 = this;
                    var12_12 = var2_2;
                    var17_17 /* !! */  = var7_7;
                    var18_18 = var4_4;
                    var21_21 /* !! */  = var19_19;
                    var26_26 = var3_3;
                    var35_35 = new ArrayList<String>(this, var2_2, var7_7, var4_4, var19_19, var3_3);
                    var23_23.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)var35_35);
                }
                if ((var26_26 = var19_19.e) != null) {
                    var11_11 = var23_23;
                    var15_15 = this;
                    var12_12 = var19_19;
                    var17_17 /* !! */  = var3_3;
                    var18_18 = var4_4;
                    var21_21 /* !! */  = var7_7;
                    var23_23 = new id0_2(this, var19_19, var3_3, var4_4, var7_7);
                    var26_26.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)var23_23);
                }
                if ((var11_11 = var19_19.h) != null) {
                    var15_15 = new jd0_2(var10_10, var14_14);
                    var11_11.addTextChangedListener((TextWatcher)var15_15);
                }
                if ((var11_11 = var19_19.h) != null) {
                    var15_15 = new cD0(var19_19);
                    var11_11.setOnTouchListener((View.OnTouchListener)var15_15);
                }
                if (!var6_6) break block46;
                var11_11 = var10_10.f;
                Intrinsics.checkNotNull(var11_11);
                var15_15 = var3_3.getSubReason();
                var24_24 = TextUtils.isEmpty((CharSequence)var15_15);
                if (var24_24 != 0) break block46;
                var15_15 = var11_11.b;
                Intrinsics.checkNotNull(var15_15);
                var42_42 = 0;
                var12_12 = null;
                var15_15.setVisibility(0);
                var15_15 = var11_11.d;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(0);
                var15_15 = var11_11.d;
                Intrinsics.checkNotNull(var15_15);
                var39_39 = var3_3.getReasonIndex();
                var15_15.setSelection(var39_39);
                var15_15 = var11_11.c;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(0);
                var15_15 = var11_11.e;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(0);
                var15_15 = var11_11.g;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(0);
                var15_15 = var11_11.h;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(0);
                var15_15 = var11_11.q;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(0);
                var15_15 = var11_11.i;
                if (var15_15 != null) {
                    ai0_2.B((View)var15_15);
                }
                var15_15 = var11_11.j;
                Intrinsics.checkNotNull(var15_15);
                var42_42 = 8;
                var15_15.setVisibility(var42_42);
                var15_15 = var3_3.getImageInfoList();
                if (var15_15 == null || (var24_24 = (var15_15 = var3_3.getImageInfoList()).size()) == 0) break block47;
                var24_24 = 1;
                var10_10.f((boolean)var24_24);
                break block46;
            }
            var15_15 = var3_3.getCancelComments();
            if (var15_15 == null) ** GOTO lbl-1000
            var15_15 = var3_3.getCancelComments();
            var12_12 = "getCancelComments(...)";
            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var12_12);
            var24_24 = var15_15.length();
            if (var24_24 > 0) {
                var15_15 = var11_11.h;
                Intrinsics.checkNotNull(var15_15);
                var12_12 = var3_3.getCancelComments();
                var15_15.setText((CharSequence)var12_12);
                var15_15 = var11_11.h;
                Intrinsics.checkNotNull(var15_15);
                var42_42 = 0;
                var12_12 = null;
                var15_15.setVisibility(0);
                var15_15 = var11_11.q;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(0);
                var15_15 = var11_11.i;
                if (var15_15 != null) {
                    ai0_2.B((View)var15_15);
                }
                var15_15 = var11_11.j;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(8);
                var42_42 = 0;
                var12_12 = null;
            } else lbl-1000:
            // 2 sources

            {
                var42_42 = 8;
                var15_15 = var11_11.h;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(var42_42);
                var15_15 = var11_11.q;
                Intrinsics.checkNotNull(var15_15);
                var15_15.setVisibility(var42_42);
                var15_15 = var11_11.i;
                if (var15_15 != null) {
                    ai0_2.i((View)var15_15);
                }
                var15_15 = var11_11.j;
                Intrinsics.checkNotNull(var15_15);
                var42_42 = 0;
                var12_12 = null;
                var15_15.setVisibility(0);
            }
            var15_15 = var11_11.h;
            Intrinsics.checkNotNull(var15_15);
            var15_15.clearFocus();
            var11_11 = var11_11.h;
            Intrinsics.checkNotNull(var11_11);
            var11_11.setCursorVisible(false);
        }
    }

    public final void f(boolean bl2) {
        if (bl2) {
            boolean bl3 = false;
            gd0_0.d(this, 0, 0);
            Object object = this.f;
            Intrinsics.checkNotNull(object);
            object = ((gD0$a)object).q;
            Intrinsics.checkNotNull(object);
            object.setVisibility(0);
        } else {
            int n3 = 8;
            gd0_0.d(this, n3, n3);
            Object object = this.f;
            Intrinsics.checkNotNull(object);
            object = ((gD0$a)object).q;
            Intrinsics.checkNotNull(object);
            object.setVisibility(n3);
        }
    }

    public final void g() {
        Object object = this.f;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object = ((gD0$a)object).d;
            Intrinsics.checkNotNull(object);
            object.setSelection(0);
            object = this.f;
            Intrinsics.checkNotNull(object);
            object = ((gD0$a)object).e;
            Intrinsics.checkNotNull(object);
            object.setSelection(0);
            object = this.g;
            Intrinsics.checkNotNull(object);
            String string2 = null;
            ((CartEntry)object).setReason(null);
            object = this.g;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).setReasonIndex(0);
            object = this.g;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).setSubReason(null);
            object = this.g;
            Intrinsics.checkNotNull(object);
            ((CartEntry)object).setSubreasonIndex(null);
            object = this.b;
            if (object != null) {
                object.h4(false);
            }
            object = this.f;
            Intrinsics.checkNotNull(object);
            object = ((gD0$a)object).h;
            Intrinsics.checkNotNull(object);
            string2 = "";
            object.setText((CharSequence)string2);
            this.f(false);
        }
    }

    public final void i(String object, int n3, NestedScrollView object2) {
        boolean bl2;
        int n4 = 8;
        if (n3 == 0) {
            object = this.f;
            if (object != null && (object = ((gD0$a)object).g) != null) {
                object.setVisibility(n4);
            }
            if ((object = this.f) != null && (object = ((gD0$a)object).j) != null) {
                object.setVisibility(n4);
            }
            return;
        }
        Object object3 = this.f;
        if (object3 != null && (object3 = ((gD0$a)object3).g) != null) {
            object3.setVisibility(0);
        }
        if ((object3 = this.f) != null && (object3 = ((gD0$a)object3).j) != null) {
            object3.setVisibility(0);
        }
        object3 = "_";
        Object object4 = this.b;
        if (object4 != null && (bl2 = object4.Y3())) {
            object2 = this.g;
            Intrinsics.checkNotNull(object2);
            ((CartEntry)object2).setSubReason((String)object);
            object = this.g;
            Intrinsics.checkNotNull(object);
            object2 = this.g;
            Intrinsics.checkNotNull(object2);
            int n7 = ((CartEntry)object2).getReasonIndex();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n7);
            stringBuilder.append((String)object3);
            stringBuilder.append(n3);
            String string2 = stringBuilder.toString();
            ((CartEntry)object).setSubreasonIndex(string2);
            return;
        }
        object4 = this.g;
        Intrinsics.checkNotNull(object4);
        ((CartEntry)object4).setSubReason((String)object);
        object4 = this.g;
        Intrinsics.checkNotNull(object4);
        CartEntry cartEntry = this.g;
        Intrinsics.checkNotNull(cartEntry);
        int n8 = cartEntry.getReasonIndex();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8);
        stringBuilder.append((String)object3);
        stringBuilder.append(n3);
        String string3 = stringBuilder.toString();
        ((CartEntry)object4).setSubreasonIndex(string3);
        n3 = R$string.give_details;
        string3 = hv3_0.K(n3);
        int n10 = StringsKt.F((CharSequence)object, string3, false);
        if (n10 != 0) {
            this.i = true;
            object = this.f;
            Intrinsics.checkNotNull(object);
            object = ((gD0$a)object).q;
            Intrinsics.checkNotNull(object);
            object.setVisibility(0);
            n10 = R$string.comments_mandatory;
            object = hv3_0.K(n10);
            this.c(n4, 0, (String)object);
        } else {
            this.i = false;
            object = this.f;
            Intrinsics.checkNotNull(object);
            object = ((gD0$a)object).h;
            n10 = fd0_0.c((AjioEditText)object);
            if (n10 > 0) {
                object = this.f;
                Intrinsics.checkNotNull(object);
                object = ((gD0$a)object).q;
                Intrinsics.checkNotNull(object);
                object.setVisibility(0);
                n10 = R$string.comments_optional;
                object = hv3_0.K(n10);
                this.c(n4, 0, (String)object);
            } else {
                gd0_0.d(this, 0, n4);
                object = this.f;
                Intrinsics.checkNotNull(object);
                object = ((gD0$a)object).q;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n4);
            }
        }
        object = new c9((ViewGroup)object2, 1);
        object2.postDelayed((Runnable)object, (long)100);
    }

    /*
     * Unable to fully structure code
     */
    public final void j(Activity var1_1) {
        block13: {
            block11: {
                block12: {
                    Intrinsics.checkNotNullParameter(var1_1, "activity");
                    var2_2 = this.f;
                    var3_3 = null;
                    if (var2_2 == null) break block11;
                    Intrinsics.checkNotNull(var2_2);
                    var2_2 = var2_2.e;
                    if (var2_2 == null) break block11;
                    var2_2 = this.f;
                    Intrinsics.checkNotNull(var2_2);
                    var2_2 = var2_2.e;
                    Intrinsics.checkNotNull(var2_2);
                    var4_4 = var2_2.getVisibility();
                    if (var4_4 != 0) break block11;
                    var2_2 = this.f;
                    Intrinsics.checkNotNull(var2_2);
                    var2_2 = var2_2.e;
                    Intrinsics.checkNotNull(var2_2);
                    var4_4 = var2_2.getSelectedItemPosition();
                    if (var4_4 <= 0) break block11;
                    var4_4 = 1;
                    var5_5 = this.a;
                    if (!var5_5 || (var6_6 = this.b) == null || (var7_7 = var6_6.Y3()) == 0) break block12;
                    var1_1 = this.j;
                    var3_3 = var6_6.Da();
                    var1_1 = (gD0$d)var1_1;
                    Intrinsics.checkNotNull(var1_1);
                    var1_1.b2((boolean)var4_4);
                    var1_1 = this.g;
                    Intrinsics.checkNotNull(var1_1);
                    var1_1.setCancelComments(var3_3);
                    var1_1 = this.g;
                    Intrinsics.checkNotNull(var1_1);
                    var4_4 = (int)var6_6.f3();
                    var1_1.setTagAvailable((boolean)var4_4);
                    var1_1 = this.g;
                    Intrinsics.checkNotNull(var1_1);
                    var2_2 = var6_6.u6();
                    var1_1.setBarCode((String)var2_2);
                    break block13;
                }
                if (var5_5) ** GOTO lbl-1000
                var8_8 = this.g;
                Intrinsics.checkNotNull(var8_8);
                var8_8 = var8_8.getReason();
                var6_6 = this.g;
                Intrinsics.checkNotNull(var6_6);
                var6_6 = var6_6.getSubReason();
                var5_5 = ce0_2.a((String)var8_8, (String)var6_6);
                if (var5_5) {
                    var1_1 = (gD0$d)var1_1;
                    var1_1.b2(false);
                } else lbl-1000:
                // 2 sources

                {
                    var8_8 = this.f;
                    Intrinsics.checkNotNull(var8_8);
                    var8_8 = var8_8.h;
                    Intrinsics.checkNotNull(var8_8);
                    var8_8 = String.valueOf(var8_8.getText());
                    var9_9 = var8_8.length() - var4_4;
                    var7_7 = 0;
                    var10_10 = false;
                    while (var7_7 <= var9_9) {
                        var11_11 = var10_10 == false ? var7_7 : var9_9;
                        var11_11 = var8_8.charAt(var11_11);
                        var12_12 = 32;
                        var11_11 = Intrinsics.compare(var11_11, var12_12);
                        var11_11 = var11_11 <= 0 ? 1 : 0;
                        if (!var10_10) {
                            if (var11_11 == 0) {
                                var10_10 = true;
                                continue;
                            }
                            ++var7_7;
                            continue;
                        }
                        if (var11_11 == 0) break;
                        var9_9 += -1;
                    }
                    var8_8 = com.jio.jioads.adinterfaces.a.a(var9_9, var4_4, var7_7, (String)var8_8);
                    var6_6 = this.f;
                    Intrinsics.checkNotNull(var6_6);
                    var6_6 = var6_6.e;
                    Intrinsics.checkNotNull(var6_6);
                    var9_9 = var6_6.getSelectedItemPosition();
                    if (var9_9 <= 0) {
                        var1_1 = (gD0$d)var1_1;
                        var1_1.b2(false);
                    } else {
                        var9_9 = (int)this.i;
                        if (var9_9 != 0) {
                            var9_9 = var8_8.length();
                            if (var9_9 == 0) {
                                var1_1 = (gD0$d)var1_1;
                                var1_1.b2(false);
                            } else {
                                ((gD0$d)var1_1).b2((boolean)var4_4);
                                var1_1 = this.g;
                                Intrinsics.checkNotNull(var1_1);
                                var1_1.setCancelComments((String)var8_8);
                            }
                            var1_1 = this.g;
                            Intrinsics.checkNotNull(var1_1);
                            var1_1.setCancelComments((String)var8_8);
                        } else {
                            ((gD0$d)var1_1).b2((boolean)var4_4);
                            var1_1 = this.g;
                            Intrinsics.checkNotNull(var1_1);
                            var1_1.setCancelComments((String)var8_8);
                        }
                    }
                }
                break block13;
            }
            var1_1 = (gD0$d)var1_1;
            var1_1.b2(false);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k(gD0$f var1_1, CartEntry var2_2) {
        block87: {
            block84: {
                block86: {
                    block85: {
                        var3_3 = this;
                        var4_4 = var1_1;
                        var5_5 = 1;
                        if (var2_2 == null) {
                            return;
                        }
                        this.m = var1_1;
                        var6_6 = var2_2.getTotalPrice();
                        var7_7 = null;
                        if (var6_6 != null) {
                            if ((var6_6 = var6_6.getValue()) != null) {
                                var8_8 = Float.parseFloat((String)var6_6);
                                var6_6 = Float.valueOf(var8_8);
                            } else {
                                var9_9 = 0;
                                var6_6 = null;
                                var8_8 = 0.0f;
                            }
                        } else {
                            var6_6 = Float.valueOf(0.0f);
                        }
                        var10_10 = cp_1.Companion;
                        var10_10.getClass();
                        var11_11 = cp$a.w();
                        if (var11_11 != 0 && (var10_10 = var4_4.m) != null) {
                            ai0_2.B((View)var10_10);
                        }
                        if ((var11_11 = cp$a.m((CartEntry)(var10_10 = var3_3.g))) != 0 && (var10_10 = var4_4.m) != null) {
                            ai0_2.i((View)var10_10);
                        }
                        if ((var10_10 = var2_2.getOrderTotalQuantity()) != null) {
                            var11_11 = var10_10.intValue();
                            var12_12 = var2_2.getQuantity();
                            if (var6_6 != null) {
                                var8_8 = var6_6.floatValue();
                                var13_13 = var11_11;
                                var6_6 = Float.valueOf(var8_8 /= var13_13);
                            } else {
                                var9_9 = 0;
                                var6_6 = null;
                                var8_8 = 0.0f;
                            }
                            if (var6_6 != null) {
                                var8_8 = var6_6.floatValue();
                                Intrinsics.checkNotNull(var12_12);
                                var14_14 = var12_12.intValue();
                                var13_13 = var14_14;
                                var6_6 = Float.valueOf(var8_8 *= var13_13);
                            } else {
                                var9_9 = 0;
                                var6_6 = null;
                                var8_8 = 0.0f;
                            }
                            var14_14 = (int)cp$a.w();
                            if (var14_14 != 0 && (var15_15 = var2_2.getConvenienceFee()) != null && (var15_15 = var15_15.getTotal()) != null) {
                                var13_13 = var15_15.getNetAmount();
                                var16_16 = var11_11;
                                var13_13 /= var16_16;
                                Intrinsics.checkNotNull(var12_12);
                                var11_11 = var12_12.intValue();
                                var16_16 = var11_11;
                                var13_13 *= var16_16;
                            } else {
                                var14_14 = 0;
                                var13_13 = 0.0f;
                                var15_15 = null;
                            }
                            if (var6_6 != null) {
                                var8_8 = var6_6.floatValue() + var13_13;
                                var6_6 = Float.valueOf(var8_8);
                            } else {
                                var9_9 = 0;
                                var6_6 = null;
                                var8_8 = 0.0f;
                            }
                        } else {
                            var14_14 = 0;
                            var13_13 = 0.0f;
                            var15_15 = null;
                        }
                        var11_11 = (int)((cfr_temp_0 = var13_13 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                        if (var11_11 <= 0 && (var10_10 = var4_4.m) != null) {
                            ai0_2.i((View)var10_10);
                        }
                        var10_10 = var4_4.f;
                        Intrinsics.checkNotNull(var10_10);
                        var6_6 = cp$a.f(String.valueOf(var6_6));
                        var10_10.setText((CharSequence)var6_6);
                        var9_9 = var3_3.a;
                        if (var9_9 == 0) {
                            var4_4 = var4_4.h;
                            if (var4_4 != null) {
                                ai0_2.i((View)var4_4);
                            }
                            return;
                        }
                        var3_3.r = var13_13;
                        var10_10 = var2_2.getTotalPrice();
                        var10_10 = var10_10 != null ? var10_10.getValue() : "0.0";
                        Intrinsics.checkNotNull(var10_10);
                        var16_16 = Float.parseFloat((String)var10_10);
                        var12_12 = var2_2.getOrderTotalQuantity();
                        var15_15 = "getOrderTotalQuantity(...)";
                        Intrinsics.checkNotNullExpressionValue(var12_12, (String)var15_15);
                        var17_17 = var12_12.floatValue();
                        var16_16 /= var17_17;
                        var18_18 = var2_2.getReturnEditedQuantity();
                        var17_17 = var18_18;
                        var10_10 = String.valueOf(var16_16 *= var17_17);
                        var12_12 = var3_3.g;
                        if (var12_12 == null || (var12_12 = var12_12.getOrderTotalQuantity()) == null) break block84;
                        var18_18 = var12_12.intValue();
                        var19_19 /* !! */  = var3_3.g;
                        if (var19_19 /* !! */  == null) break block84;
                        var20_20 = var19_19 /* !! */ .getReturnEditedQuantity();
                        var21_21 = var3_3.h;
                        if (var21_21 != null && (var21_21 = var21_21.getReturn_fee()) != null) {
                            var22_23 = var21_21.floatValue();
                        } else {
                            var22_23 = 0.0f;
                            var21_21 = null;
                        }
                        var23_24 = var20_20;
                        var22_23 *= var23_24;
                        var24_25 = var2_2.getBankDiscountPromoAmt();
                        if (var24_25 != null) {
                            var25_26 = var24_25;
                            var27_27 = var9_9;
                            var28_28 = var18_18;
                            var25_26 /= var28_28;
                            var28_28 = var20_20;
                            var25_26 *= var28_28;
                        } else {
                            var27_27 = var9_9;
                            var25_26 = 0.0;
                        }
                        var30_29 = var3_3.g;
                        var31_30 = cp$a.k((CartEntry)var30_29);
                        if (var31_30 == 0) break block85;
                        var30_29 = var3_3.g;
                        if (var30_29 != null && (var30_29 = var30_29.getConvenienceFee()) != null && (var30_29 = var30_29.getRVP()) != null) {
                            var30_29 = var30_29.isFeeCharged();
                            var6_6 = Boolean.TRUE;
                            var31_30 = (int)Intrinsics.areEqual(var30_29, var6_6);
                        } else {
                            var31_30 = 0;
                            var32_31 = 0.0f;
                            var30_29 = null;
                        }
                        if (var31_30 == 0) ** GOTO lbl-1000
                        var30_29 = var3_3.g;
                        if (var30_29 != null && (var30_29 = var30_29.getConvenienceFee()) != null && (var30_29 = var30_29.getRVP()) != null) {
                            var32_31 = var30_29.getNetAmount();
                            var30_29 = Float.valueOf(var32_31);
                        } else {
                            var31_30 = 0;
                            var30_29 = null;
                            var32_31 = 0.0f;
                        }
                        if (var30_29 != null) {
                            var32_31 = var30_29.floatValue();
                            var8_8 = var18_18;
                            var32_31 = var32_31 / var8_8 * var23_24 + 0.0f;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var31_30 = 0;
                            var32_31 = 0.0f;
                            var30_29 = null;
                        }
                        var6_6 = var3_3.g;
                        if (var6_6 != null && (var6_6 = var6_6.getConvenienceFee()) != null && (var6_6 = var6_6.getCOD()) != null) {
                            var6_6 = var6_6.isFeeCharged();
                            var19_19 /* !! */  = Boolean.TRUE;
                            var9_9 = (int)Intrinsics.areEqual(var6_6, var19_19 /* !! */ );
                        } else {
                            var9_9 = 0;
                            var8_8 = 0.0f;
                            var6_6 = null;
                        }
                        if (var9_9 != 0) {
                            var6_6 = var3_3.g;
                            if (var6_6 != null && (var6_6 = var6_6.getConvenienceFee()) != null && (var6_6 = var6_6.getCOD()) != null) {
                                var8_8 = var6_6.getNetAmount();
                                var6_6 = Float.valueOf(var8_8);
                            } else {
                                var9_9 = 0;
                                var6_6 = null;
                                var8_8 = 0.0f;
                            }
                            if (var6_6 != null) {
                                var8_8 = var6_6.floatValue();
                                var33_32 = var18_18;
                                var8_8 = var8_8 / var33_32 * var23_24;
                                var32_31 += var8_8;
                            }
                        }
                        if ((var6_6 = var3_3.g) != null && (var6_6 = var6_6.getConvenienceFee()) != null && (var6_6 = var6_6.getDelivery()) != null) {
                            var6_6 = var6_6.isFeeCharged();
                            var19_19 /* !! */  = Boolean.TRUE;
                            var9_9 = (int)Intrinsics.areEqual(var6_6, var19_19 /* !! */ );
                        } else {
                            var9_9 = 0;
                            var8_8 = 0.0f;
                            var6_6 = null;
                        }
                        if (var9_9 != 0) {
                            var6_6 = var3_3.g;
                            if (var6_6 != null && (var6_6 = var6_6.getConvenienceFee()) != null && (var6_6 = var6_6.getDelivery()) != null) {
                                var8_8 = var6_6.getNetAmount();
                                var6_6 = Float.valueOf(var8_8);
                            } else {
                                var9_9 = 0;
                                var6_6 = null;
                                var8_8 = 0.0f;
                            }
                            if (var6_6 != null) {
                                var8_8 = var6_6.floatValue();
                                var33_32 = var18_18;
                                var8_8 = var8_8 / var33_32 * var23_24;
                                var32_31 += var8_8;
                            }
                        }
                        if ((var9_9 = (int)h40_0.P1()) != 0) {
                            var6_6 = var3_3.g;
                            if (var6_6 != null && (var6_6 = var6_6.getConvenienceFee()) != null && (var6_6 = var6_6.getPriorityDelivery()) != null) {
                                var6_6 = var6_6.isFeeCharged();
                                var19_19 /* !! */  = Boolean.TRUE;
                                var9_9 = (int)Intrinsics.areEqual(var6_6, var19_19 /* !! */ );
                            } else {
                                var9_9 = 0;
                                var8_8 = 0.0f;
                                var6_6 = null;
                            }
                            if (var9_9 != 0) {
                                var6_6 = var3_3.g;
                                if (var6_6 != null && (var6_6 = var6_6.getConvenienceFee()) != null && (var6_6 = var6_6.getPriorityDelivery()) != null) {
                                    var8_8 = var6_6.getNetAmount();
                                    var6_6 = Float.valueOf(var8_8);
                                } else {
                                    var9_9 = 0;
                                    var6_6 = null;
                                    var8_8 = 0.0f;
                                }
                                if (var6_6 != null) {
                                    var8_8 = var6_6.floatValue();
                                    var33_32 = var18_18;
                                    var8_8 = var8_8 / var33_32 * var23_24;
                                    var32_31 += var8_8;
                                }
                            }
                        }
                        break block86;
                    }
                    var30_29 = var3_3.g;
                    if (var30_29 != null && (var30_29 = var30_29.getConvenienceFee()) != null && (var30_29 = var30_29.getTotal()) != null) {
                        var32_31 = var30_29.getNetAmount();
                        var8_8 = var18_18;
                        var32_31 = var32_31 / var8_8 * var23_24;
                    } else {
                        var31_30 = 0;
                        var32_31 = 0.0f;
                        var30_29 = null;
                    }
                }
                if ((var6_6 = var3_3.g) != null && (var6_6 = var6_6.getConvenienceFee()) != null && (var6_6 = var6_6.getTotal()) != null) {
                    var8_8 = var6_6.getNetAmount();
                    var17_17 = var18_18;
                    var8_8 = var8_8 / var17_17 * var23_24;
                } else {
                    var9_9 = 0;
                    var8_8 = 0.0f;
                    var6_6 = null;
                }
                break block87;
            }
            var27_27 = var9_9;
            var31_30 = 0;
            var32_31 = 0.0f;
            var30_29 = null;
            var9_9 = 0;
            var8_8 = 0.0f;
            var6_6 = null;
            var22_23 = 0.0f;
            var21_22 = null;
            var25_26 = 0.0;
        }
        var12_12 = var3_3.g;
        if (var10_10 != null) {
            var16_16 = Float.parseFloat((String)var10_10);
            var34_33 = (double)var16_16 - var25_26;
            var10_10 = var4_4.g;
            if (var10_10 != null) {
                ai0_2.B((View)var10_10);
            }
            if ((var11_11 = (int)cp$a.u()) == 0) {
                var36_34 = var8_8;
                var34_33 += var36_34;
                var9_9 = (int)cp$a.k(var12_12);
                if (var9_9 != 0) {
                    var38_35 = var32_31;
                    var34_33 -= var38_35;
                }
            }
            var6_6 = h40_0.a;
            var9_9 = (int)h40_0.g2();
            if (var9_9 != 0 && (var9_9 = (int)((cfr_temp_1 = var22_23 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > 0) {
                var38_35 = var22_23;
                var34_33 -= var38_35;
            }
            if ((var9_9 = (int)((cfr_temp_2 = var34_33 - (var38_35 = 0.0)) == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1))) < 0) {
                var34_33 = var38_35;
            }
            if ((var6_6 = var4_4.g) != null) {
                var11_11 = R$string.total_refund_amount_detail;
                var10_10 = hv3_0.K(var11_11);
                var12_12 = cp$a.f(String.valueOf(var34_33));
                var15_15 = new StringBuilder();
                var15_15.append((String)var10_10);
                var15_15.append(" ");
                var15_15.append((String)var12_12);
                var10_10 = var15_15.toString();
                var6_6.setText((CharSequence)var10_10);
            }
        }
        var9_9 = cp$a.w();
        var11_11 = 1065353216;
        var16_16 = 1.0f;
        if (var9_9 != 0 && (var9_9 = cp$a.u()) != 0 && (var9_9 = var32_31 == var16_16 ? 0 : (var32_31 < var16_16 ? -1 : 1)) >= 0) {
            var6_6 = var4_4.i;
            if (var6_6 != null) {
                ai0_2.B((View)var6_6);
            }
            if ((var6_6 = var4_4.h) != null) {
                ai0_2.B((View)var6_6);
            }
            if ((var6_6 = var4_4.i) != null) {
                var18_18 = R$string.order_summary_return_refund_fee_details;
                var15_15 = String.valueOf(qz2_0.u(var32_31));
                var40_36 = new Object[var5_5];
                var20_20 = 0;
                var33_32 = 0.0f;
                var19_19 /* !! */  = null;
                var40_36[0] = var15_15;
                var12_12 = hv3_0.L(var18_18, var40_36);
                var6_6.setText((CharSequence)var12_12);
            }
        } else {
            var6_6 = var4_4.i;
            if (var6_6 != null) {
                ai0_2.i((View)var6_6);
            }
            if ((var6_6 = var4_4.h) != null) {
                ai0_2.i((View)var6_6);
            }
        }
        if ((var9_9 = (int)cp$a.m((CartEntry)(var6_6 = var3_3.g))) == 0 && (var9_9 = (int)(var32_31 == var16_16 ? 0 : (var32_31 > var16_16 ? 1 : -1))) > 0) {
            var6_6 = var4_4.i;
            if (var6_6 != null) {
                ai0_2.B((View)var6_6);
            }
            if ((var6_6 = var4_4.h) != null) {
                ai0_2.B((View)var6_6);
            }
            if ((var6_6 = var4_4.i) != null) {
                var11_11 = R$string.order_summary_return_refund_fee_details;
                var30_29 = String.valueOf(qz2_0.u(var32_31));
                var12_12 = new Object[var5_5];
                var14_14 = 0;
                var13_13 = 0.0f;
                var15_15 = null;
                var12_12[0] = var30_29;
                var30_29 = hv3_0.L(var11_11, var12_12);
                var6_6.setText((CharSequence)var30_29);
            }
        }
        if (var27_27 != 0) {
            var30_29 = var3_3.h;
            if (var30_29 != null && (var30_29 = var30_29.getReturn_fee()) != null) {
                var32_31 = var30_29.floatValue();
            } else {
                var31_30 = 0;
                var32_31 = 0.0f;
                var30_29 = null;
            }
            var31_30 = (cfr_temp_3 = var32_31 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
            if (var31_30 > 0) {
                var30_29 = var3_3.g;
                if (var30_29 == null || (var31_30 = (int)var30_29.isReturnable()) != var5_5) {
                    var5_5 = 0;
                    var41_37 = null;
                }
                if (var5_5 != 0) {
                    var41_37 = h40_0.a;
                    var5_5 = (int)h40_0.g2();
                    if (var5_5 != 0) {
                        var41_37 = var4_4.h;
                        if (var41_37 != null) {
                            ai0_2.B((View)var41_37);
                        }
                        if ((var41_37 = var4_4.n) != null) {
                            ai0_2.B((View)var41_37);
                        }
                        if ((var41_37 = var4_4.n) != null) {
                            var30_29 = var3_3.h;
                            if (var30_29 != null && (var30_29 = var30_29.getReturn_fee_strip()) != null) {
                                var6_6 = var3_3.h;
                                if (var6_6 == null || (var6_6 = var6_6.getReturn_fee()) == null || (var6_6 = var6_6.toString()) == null) {
                                    var6_6 = "";
                                }
                                var7_7 = kotlin.text.b.n((String)var30_29, "{return_fee}", (String)var6_6, false);
                            }
                            var41_37.setText(var7_7);
                        }
                    }
                }
            }
        }
        if ((var4_4 = var4_4.j) != null) {
            var41_37 = new Object();
            var4_4.setOnClickListener((View.OnClickListener)var41_37);
        }
    }

    public final void l(CartEntry object, Product object2, View object3, FragmentManager object4, ActionContent object5) {
        Object object6 = "productView";
        Intrinsics.checkNotNullParameter(object3, (String)object6);
        this.g = object;
        this.h = object5;
        if (object != null && object2 != null) {
            int n3;
            float f5;
            int n4;
            Object object7;
            Object object8;
            object6 = new Object();
            int n7 = R$id.tv_refund_breakup;
            Object object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).a = object9;
            n7 = R$id.brandname;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).b = object9;
            n7 = R$id.img_product;
            object9 = (ImageView)object3.findViewById(n7);
            ((gD0$f)object6).c = object9;
            n7 = R$id.item_name;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).d = object9;
            n7 = R$id.current_status;
            object9 = (TextView)object3.findViewById(n7);
            n7 = R$id.item_actual_cost;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).f = object9;
            n7 = R$id.item_original_price;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).g = object9;
            n7 = R$id.li_convenience_fee;
            object9 = (LinearLayout)object3.findViewById(n7);
            ((gD0$f)object6).h = object9;
            n7 = R$id.id_convenience_fee;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).i = object9;
            n7 = R$id.id_read_policy;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).j = object9;
            n7 = R$id.color;
            object9 = (TextView)object3.findViewById(n7);
            n7 = R$id.size;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).k = object9;
            n7 = R$id.quantity;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).l = object9;
            n7 = R$id.order_summary_field_2;
            object9 = (LinearLayout)object3.findViewById(n7);
            n7 = R$id.cancel_order_button;
            object9 = (AjioTextView)object3.findViewById(n7);
            n7 = R$id.subtotal_layout;
            object9 = (LinearLayout)object3.findViewById(n7);
            n7 = R$id.item_subtotal_title;
            object9 = (AjioTextView)object3.findViewById(n7);
            n7 = R$id.item_detail;
            object9 = (TextView)object3.findViewById(n7);
            ((gD0$f)object6).e = object9;
            n7 = R$id.item_include_conv_fee;
            object9 = (AjioTextView)object3.findViewById(n7);
            ((gD0$f)object6).m = object9;
            n7 = R$id.tv_return_fee;
            object3 = (AjioTextView)object3.findViewById(n7);
            ((gD0$f)object6).n = object3;
            object3 = ((Product)object2).getImages();
            if (object3 != null) {
                object3 = ((Product)object2).getImages();
                Intrinsics.checkNotNull(object3);
                object3 = object3.iterator();
                while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    object9 = (ProductImage)object3.next();
                    object8 = ((ProductImage)object9).component1();
                    object7 = ((ProductImage)object9).component2();
                    object9 = ((ProductImage)object9).component3();
                    String string2 = "cartIcon";
                    n4 = (int)(string2.equalsIgnoreCase((String)object8) ? 1 : 0);
                    if (n4 == 0 || (n7 = (int)(((String)(object8 = "PRIMARY")).equalsIgnoreCase((String)object9) ? 1 : 0)) == 0) continue;
                    object9 = new da$a();
                    ((da$a)object9).a = n4 = R$drawable.component_placeholder;
                    ((da$a)object9).b = n4;
                    object8 = UrlHelper.Companion.getInstance().getImageUrl((String)object7);
                    object7 = ((gD0$f)object6).c;
                    Intrinsics.checkNotNull(object7);
                    ((da$a)object9).n = object8;
                    ((da$a)object9).u = object7;
                    ((da$a)object9).a();
                }
            }
            int n8 = 0;
            object3 = null;
            n7 = (int)(this.a ? 1 : 0);
            if (n7 == 0) {
                object8 = ((gD0$f)object6).a;
                if (object8 != null) {
                    ai0_2.i((View)object8);
                }
            } else {
                float f6;
                double d2;
                object8 = ((CartEntry)object).getBankDiscountPromoAmt();
                n4 = Intrinsics.areEqual((Double)object8, d2 = 0.0);
                if ((n4 == 0 || (n4 = (f6 = (f5 = this.r) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0) && (object8 = ((gD0$f)object6).a) != null) {
                    ai0_2.B((View)object8);
                }
            }
            object8 = cp_1.Companion;
            object8.getClass();
            n4 = cp$a.m((CartEntry)object);
            if (n4 != 0 && (object8 = ((gD0$f)object6).a) != null) {
                ai0_2.i((View)object8);
            }
            n4 = 1;
            f5 = Float.MIN_VALUE;
            if (n7 != 0) {
                float f7;
                float f8;
                if (object5 != null && (object7 = ((ActionContent)object5).getReturn_fee()) != null) {
                    f8 = ((Float)object7).floatValue();
                } else {
                    f8 = 0.0f;
                    object7 = null;
                }
                n8 = (f7 = f8 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (n8 > 0 && (n8 = (int)(((CartEntry)object).isReturnable() ? 1 : 0)) == n4) {
                    object3 = h40_0.a;
                    n8 = (int)(h40_0.g2() ? 1 : 0);
                    if (n8 != 0 && (object3 = ((gD0$f)object6).a) != null) {
                        ai0_2.B((View)object3);
                    }
                }
            }
            if ((object3 = ((gD0$f)object6).a) != null) {
                object7 = new WC0((FragmentManager)object4, (CartEntry)object, (ActionContent)object5, this);
                object3.setOnClickListener((View.OnClickListener)object7);
            }
            if ((object3 = ((Product)object2).getBrandName()) != null) {
                object3 = ((gD0$f)object6).b;
                if (object3 != null) {
                    object4 = ((Product)object2).getBrandName();
                    object3.setText((CharSequence)object4);
                }
                if ((object3 = ((gD0$f)object6).b) != null) {
                    ai0_2.B((View)object3);
                }
            }
            if ((object3 = ((Product)object2).getName()) != null) {
                object3 = ((gD0$f)object6).e;
                if (object3 != null) {
                    object4 = ((Product)object2).getName();
                    object3.setText((CharSequence)object4);
                }
                if ((object3 = ((gD0$f)object6).e) != null) {
                    ai0_2.B((View)object3);
                }
            } else {
                object3 = ((gD0$f)object6).e;
                if (object3 != null) {
                    ai0_2.i((View)object3);
                }
            }
            if ((object3 = ((Product)object2).getBrandName()) != null) {
                object3 = ((gD0$f)object6).d;
                if (object3 != null) {
                    object2 = ((Product)object2).getBrandName();
                    object3.setText((CharSequence)object2);
                }
                if ((object2 = ((gD0$f)object6).d) != null) {
                    ai0_2.B((View)object2);
                }
            } else {
                object2 = ((gD0$f)object6).d;
                if (object2 != null) {
                    ai0_2.i((View)object2);
                }
            }
            if ((n3 = ((CartEntry)object).getReturnEditedQuantity()) == 0 && n7 != 0) {
                object2 = ((CartEntry)object).getQuantity();
                n3 = (Integer)object2;
                ((CartEntry)object).setReturnEditedQuantity(n3);
            }
            this.k((gD0$f)object6, (CartEntry)object);
            object2 = ((CartEntry)object).getQuantity();
            n3 = (Integer)object2;
            if (n3 > n4) {
                object2 = ((gD0$f)object6).l;
                Intrinsics.checkNotNull(object2);
                object3 = ((CartEntry)object).getQuantity();
                object5 = "Qty ";
                object4 = new StringBuilder((String)object5);
                ((StringBuilder)object4).append(object3);
                object3 = ((StringBuilder)object4).toString();
                object2.setText((CharSequence)object3);
                object2 = ((gD0$f)object6).l;
                Intrinsics.checkNotNull(object2);
                n8 = 0;
                object3 = null;
                object2.setVisibility(0);
            } else {
                object2 = ((gD0$f)object6).l;
                Intrinsics.checkNotNull(object2);
                n8 = 8;
                object2.setVisibility(n8);
            }
            this.e = object2 = hv3_0.i((CartEntry)object);
            object = ((CartEntry)object).getProduct();
            if (object != null) {
                object2 = this.e;
                ((Product)object).setOriginalSize((String)object2);
            }
            object = ((gD0$f)object6).k;
            Intrinsics.checkNotNull(object);
            object2 = this.e;
            object3 = new StringBuilder("Size ");
            ((StringBuilder)object3).append((String)object2);
            object2 = ((StringBuilder)object3).toString();
            object.setText((CharSequence)object2);
            return;
        }
        object = yn3_0.a;
        object2 = new IllegalStateException("cart entry or product is null");
        ((yn3$a)object).e((Throwable)object2);
    }

    /*
     * Unable to fully structure code
     */
    public final void m(View var1_1, int var2_2, gD0$e var3_3, boolean var4_4) {
        Intrinsics.checkNotNullParameter(var1_1, "view");
        Intrinsics.checkNotNullParameter(var3_3, "quantityUpdateCallback");
        var5_5 = R$id.quantity_to_exchange_return;
        var6_6 = (TextView)var1_1.findViewById(var5_5);
        var7_7 = R$id.increment_product_button;
        var8_8 = var1_1.findViewById(var7_7);
        var9_9 = var8_8;
        var9_9 = (ImageButton)var8_8;
        var7_7 = R$id.decrement_product_button;
        var1_1 = (ImageButton)var1_1.findViewById(var7_7);
        var8_8 = this.g;
        if (var8_8 != null && (var7_7 = var8_8.getReturnEditedQuantity()) != 0) {
            this.d = var7_7;
        }
        if ((var7_7 = this.d) == 0) {
            this.d = var2_2;
        }
        var7_7 = 1;
        if (var4_4 == 0) ** GOTO lbl-1000
        var10_10 = this.g;
        Intrinsics.checkNotNull(var10_10);
        var10_10 = var10_10.getQuantity();
        var4_4 = var10_10.intValue();
        if (var4_4 > var7_7) {
            var9_9.setVisibility(0);
            var1_1.setVisibility(0);
            var10_10 = this.g;
            Intrinsics.checkNotNull(var10_10);
            var4_4 = (int)var10_10.getIsExchangeItem();
            if (var4_4 != 0) {
                var10_10 = this.g;
                Intrinsics.checkNotNull(var10_10);
                var4_4 = var10_10.getExchangeEditedQuantity();
            } else {
                var10_10 = this.g;
                Intrinsics.checkNotNull(var10_10);
                var4_4 = var10_10.getReturnEditedQuantity();
            }
            this.d = var4_4;
        } else lbl-1000:
        // 2 sources

        {
            if (var2_2 == var7_7) {
                var4_4 = 8;
                var9_9.setVisibility(var4_4);
                var1_1.setVisibility(var4_4);
            } else {
                var9_9.setVisibility(0);
                var1_1.setVisibility(0);
            }
            var4_4 = this.d;
            if (var4_4 == 0) {
                this.d = var2_2;
            }
        }
        var4_4 = this.d;
        var3_3.r7(var4_4);
        var10_10 = String.valueOf(this.d);
        var6_6.setText((CharSequence)var10_10);
        var4_4 = this.d;
        if (var4_4 > var7_7) {
            var4_4 = 1;
        } else {
            var4_4 = 0;
            var10_10 = null;
        }
        var1_1.setEnabled((boolean)var4_4);
        var4_4 = this.d;
        if (var4_4 >= var2_2) {
            var7_7 = 0;
            var8_8 = null;
        }
        var9_9.setEnabled((boolean)var7_7);
        var8_8 = var10_10;
        var10_10 = new dd0_1(var2_2, var3_3, this, (ImageButton)var9_9, (ImageButton)var1_1, var6_6);
        var1_1.setOnClickListener((View.OnClickListener)var10_10);
        var8_8 = var10_10;
        var10_10 = new ed0_1(var2_2, var3_3, this, (ImageButton)var1_1, (ImageButton)var9_9, var6_6);
        var9_9.setOnClickListener((View.OnClickListener)var10_10);
    }

    public final void n(int n3, gD0$e gD0$e, boolean bl2) {
        String string2 = "quantityUpdateCallback";
        Intrinsics.checkNotNullParameter(gD0$e, string2);
        if (bl2) {
            Comparable comparable = this.g;
            Intrinsics.checkNotNull(comparable);
            comparable = ((CartEntry)comparable).getQuantity();
            int n4 = (Integer)comparable;
            int n7 = 1;
            if (n4 > n7) {
                CartEntry cartEntry = this.g;
                Intrinsics.checkNotNull(cartEntry);
                n3 = (int)(cartEntry.getIsExchangeItem() ? 1 : 0);
                if (n3 != 0) {
                    cartEntry = this.g;
                    Intrinsics.checkNotNull(cartEntry);
                    n3 = cartEntry.getExchangeEditedQuantity();
                } else {
                    cartEntry = this.g;
                    Intrinsics.checkNotNull(cartEntry);
                    n3 = cartEntry.getReturnEditedQuantity();
                }
            }
        }
        this.d = n3;
        gD0$e.r7(n3);
    }
}

